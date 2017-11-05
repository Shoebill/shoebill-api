/**
 * Copyright (C) 2012-2014 MK124

 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at

 * http://www.apache.org/licenses/LICENSE-2.0

 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.gtaun.shoebill.resource

import net.gtaun.shoebill.ShoebillMain
import net.gtaun.shoebill.util.config.YamlConfiguration
import org.reflections.Reflections
import org.reflections.util.ConfigurationBuilder
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import java.io.File
import java.io.IOException
import java.util.jar.JarFile

/**
 * @author MK124
 * @author Marvin Haschker
 */
class ResourceDescription
/**
 * Will create an instance of ResourceDescription with params.
 * @param type The Resourcetype
 * @param file The Location of the File to load.
 * @param classLoader The Classloader
 * @throws ClassNotFoundException
 * @throws IOException
 */
@Throws(ClassNotFoundException::class, IOException::class)
constructor(
        /**
         * The ResourceType
         */
        val type: ResourceType,
        /**
         * The file of the [ResourceDescription] instance.
         */
        val file: File, private val classLoader: ClassLoader) {

    /**
     * The class of the instance.
     */
    var clazz: Class<out Resource>? = null
        private set

    /**
     * The name of the resource.
     */
    var name: String? = null
        private set
    /**
     * The version of the resource.
     */
    var version: String? = null
        private set

    /**
     * The authors of the resource.
     */
    var authors: List<String> = listOf()
        private set

    /**
     * The description of the ResourceDescription.
     */
    var description: String? = null
        private set
    /**
     * The build number of the resource.
     */
    var buildNumber: Int = 0
        private set
    /**
     * The build date of the resource.
     */
    var buildDate: String? = null
        private set

    init {
        loadConfig(type.configFilename)
    }


    /**
     * Lets you load a Configuration by its Filename
     *
     * @return The loaded Configuration
     * @throws IOException
     * @throws ClassNotFoundException
     */
    @Throws(IOException::class, ClassNotFoundException::class)
    private fun loadConfig(configFilename: String) {
        val reflections = Reflections(ConfigurationBuilder().addUrls(file.toURI().toURL()))
        val classes = reflections.getTypesAnnotatedWith(ShoebillMain::class.java)
        if (classes.size > 0) {
            val mainClass: Class<out Resource>?

            if (classes.size == 1) mainClass = classes.first().asSubclass(Resource::class.java)
            else {
                val sortedClasses = classes.sortedBy { it.getAnnotation(ShoebillMain::class.java).loadPriority }
                        .filter {
                            if (type == ResourceType.GAMEMODE) {
                                try {
                                    it.asSubclass(Gamemode::class.java); return@filter true
                                } catch(e: ClassCastException) {
                                    return@filter false
                                }
                            } else {
                                try {
                                    it.asSubclass(Plugin::class.java); return@filter true
                                } catch(e: ClassCastException) {
                                    return@filter false
                                }
                            }
                        }


                mainClass = sortedClasses.first().asSubclass(Resource::class.java)
                val annotation = mainClass.getAnnotation(ShoebillMain::class.java)

                if (sortedClasses.size > 1) {
                    LOGGER.info("More than one class was annotated with the @ShoebillMain annotation for file " +
                            "${file.nameWithoutExtension}.")
                    LOGGER.info("Shoebill will load class \"${mainClass.name}\" because it has the highest priority " +
                            "(${annotation.loadPriority}).")

                }
            }
            if (mainClass == null) throw ClassNotFoundException("There is no class annotated with the ShoebillMain " +
                    "interface.")

            val annotation = mainClass.getAnnotation(ShoebillMain::class.java)
            name = annotation.name
            description = annotation.description
            version = annotation.version
            authors = getAuthors(annotation.author)
            buildDate = annotation.buildDate
            buildNumber = annotation.buildNumber
            clazz = mainClass
        } else {
            LOGGER.info("@ShoebillMain interface was not found for ${file.name}. Falling back to gamemode.yml / plugin.yml.")
            JarFile(file).use { jarFile ->
                val entry = jarFile.getJarEntry(configFilename) ?: throw Exception("$configFilename was not found.")
                val `in` = jarFile.getInputStream(entry)

                val config = YamlConfiguration()
                config.setDefault("name", "Unnamed")
                config.setDefault("version", "Unknown")
                config.setDefault("authors", "Unknown")
                config.setDefault("description", "")
                config.setDefault("buildNumber", 0)
                config.setDefault("buildDate", "Unknown")

                config.read(`in`)

                val className = config.getString("class")
                clazz = classLoader.loadClass(className).asSubclass(Resource::class.java)

                name = config.getString("name")
                version = config.getString("version")

                authors = getAuthors(config.getString("authors"))

                description = config.getString("description")
                buildNumber = Integer.parseInt(config.getString("buildNumber"))
                buildDate = config.getString("buildDate")
            }
        }
    }

    companion object {
        val LOGGER: Logger = LoggerFactory.getLogger("Resource Description")

        private fun getAuthors(author: String): List<String> {
            val authors = mutableListOf<String>()

            val tokens = author.split("[,;]".toRegex()).dropLastWhile(String::isEmpty).toTypedArray()
            if (tokens.isNotEmpty()) tokens.forEach { authors.add(it.trim { it <= ' ' }) }
            else authors.add(author.trim { it <= ' ' })

            return authors
        }
    }
}

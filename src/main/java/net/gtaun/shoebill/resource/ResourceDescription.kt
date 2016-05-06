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

import net.gtaun.shoebill.util.config.Configuration
import net.gtaun.shoebill.util.config.YamlConfiguration
import java.io.File
import java.io.FileNotFoundException
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
         * The File of the ResourceDescription instance.
         */
        val file: File, private val classLoader: ClassLoader) {

    /**
     * The class of the instance.
     */
    var clazz: Class<out Resource>? = null
        private set
    /**
     * The name of the ResourceDescription.
     */
    var name: String? = null
        private set
    /**
     * The version of the ResourceDescription.
     */
    var version: String? = null
        private set
    var authors: MutableList<String> = mutableListOf()
        private set
    /**
     * The description of the ResourceDescription.
     */
    var description: String? = null
        private set
    /**
     * The Buildnumber of the ResourceDescription.
     */
    var buildNumber: Int = 0
        private set
    /**
     * The Builddate.
     */
    var buildDate: String? = null
        private set

    init {
        loadConfig(type.configFilename)
    }

    /**
     * Lets you load a Configuration by its Filename
     * @param configFilename The Filename of the Config
     * @return The loaded Configuration
     * @throws IOException
     * @throws ClassNotFoundException
     */
    @Throws(IOException::class, ClassNotFoundException::class)
    private fun loadConfig(configFilename: String): Configuration {
        try {
            JarFile(file).use { jarFile ->
                val entry = jarFile.getJarEntry(configFilename)
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

                val author = config.getString("authors")
                val tokens = author.split("[,;]".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()

                if (tokens.size > 0) {
                    tokens.forEach { authors.add(it.trim { it <= ' ' }) }
                } else {
                    authors.add(author.trim { it <= ' ' })
                }

                description = config.getString("description")
                buildNumber = config.getInt("buildNumber")
                buildDate = config.getString("buildDate")

                return config
            }
        } catch (e: NullPointerException) {
            throw FileNotFoundException(configFilename)
        }

    }
}

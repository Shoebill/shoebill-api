/**
 * Copyright (C) 2011 JoJLlmAn
 * Copyright (C) 2011-2014 MK124

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

import net.gtaun.shoebill.Shoebill

import java.io.File

/**
 * This class manages the available [Resource]s.
 *
 * @author MK124
 * @author JoJLlmAn
 * @author Marvin Haschker
 */
interface ResourceManager {

    /**
     * Lets you load a Plugin by its filename.
     * @param filename The Plugin filename
     * @return The loaded Plugin
     */
    fun loadPlugin(filename: String): Plugin

    /**
     * Lets you load a Plugin by File.
     * @param file The File to the Plugin
     * @return The loaded Plugin
     */
    fun loadPlugin(file: File): Plugin

    /**
     * Lets you unload a Plugin.
     * @param plugin The Plugin which should be unloaded
     */
    fun unloadPlugin(plugin: Plugin)

    /**
     * Lets you get a Plugin by its class.
     * @param pluginClass Class instance of the Plugin.
     * @return The found Plugin.
     */
    fun <T : Plugin> getPlugin(pluginClass: Class<T>): T

    /**
     * Gets a Collection of all loaded Plugins.
     * @return A Collection of Pluins.
     */
    val plugins: Collection<Plugin>

    /**
     * Gets the active Gamemode.
     * @return The active Gamemode
     */
    val gamemode: Gamemode

    /**
     * Gets a Gamemode by its class.
     * @param gamemodeClass Class instance of the Gamemode.
     * @param  Class type of the Gamemode.
     * @return The found Gamemode.
     */
    fun <T : Gamemode> getGamemode(gamemodeClass: Class<T>): T

    companion object {
        /**
         * Get the Resource Manager
         * @return The Resource Manager
         */
        fun get(): ResourceManager {
            return Shoebill.get()!!.resourceManager
        }
    }
}

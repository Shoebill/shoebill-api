/**
 * Copyright (C) 2011 JoJLlmAn
 * Copyright (C) 2011-2012 MK124
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.gtaun.shoebill.resource;

import java.io.File;
import java.util.Collection;

import net.gtaun.shoebill.Shoebill;

/**
 * 
 * 
 * @author MK124, JoJLlmAn
 */
public interface ResourceManager
{
    /**
     *  Get the Resource Manager
     * @return The Resource Manager
     */
	public static ResourceManager get()
	{
		return Shoebill.get().getResourceManager();
	}

    /**
     * Lets you load a Plugin by its filename.
     * @param filename The Plugin filename
     * @return The loaded Plugin
     */
	Plugin loadPlugin(String filename);

    /**
     * Lets you load a Plugin by File.
     * @param file The File to the Plugin
     * @return The loaded Plugin
     */
	Plugin loadPlugin(File file);

    /**
     * Lets you unload a Plugin.
     * @param plugin The Plugin which should be unloaded
     */
	void unloadPlugin(Plugin plugin);

    /**
     * Lets you get a Plugin by its class.
     * @param cls Class instance of the Plugin.
     * @param <T> Class type of the Plugin.
     * @return The found Plugin.
     */
	<T extends Plugin> T getPlugin(Class<T> cls);

    /**
     * Gets a Collection of all loaded Plugins.
     * @return A Collection of Pluins.
     */
	Collection<Plugin> getPlugins();

    /**
     * Gets the active Gamemode.
     * @return The active Gamemode
     */
	Gamemode getGamemode();

    /**
     * Gets a Gamemode by its class.
     * @param cls Class instance of the Gamemode.
     * @param <T> Class type of the Gamemode.
     * @return The found Gamemode.
     */
	<T extends Gamemode> T getGamemode(Class<T> cls);
}

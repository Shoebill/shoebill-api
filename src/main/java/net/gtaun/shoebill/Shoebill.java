/**
 * Copyright (C) 2011 MK124
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

package net.gtaun.shoebill;

import java.io.File;

import net.gtaun.shoebill.service.ServiceStore;

/**
 * Shoebill main interface, provides the basic manager instance and functions.
 * 
 * @author MK124
 */
public interface Shoebill
{
	/**
	 * Get SA-MP object store.
	 * 
	 * @return SampObjectStore instance.
	 */
	SampObjectStore getSampObjectStore();
	
	/**
	 * Get SA-MP object factory.
	 * 
	 * @return SampObjectFactory instance.
	 */
	SampObjectFactory getSampObjectFactory();
	
	/**
	 * Get gamemode manager.
	 * 
	 * @return GamemodeManager instance.
	 */
	GamemodeManager getGamemodeManager();
	
	/**
	 * Get plugin manager.
	 * 
	 * @return PluginManager instance.
	 */
	PluginManager getPluginManager();
	
	/**
	 * Get service store.
	 * 
	 * @return ServiceStore instance.
	 */
	ServiceStore getServiceStore();
	
	/**
	 * Get version information.
	 * 
	 * @return ShoebillVersion instance.
	 */
	ShoebillVersion getVersion();
	
	/**
	 * Change gamemode.
	 * 
	 * @param file The archive file of gamemode.
	 */
	void changeGamemode(File file);
	
	/**
	 * Reload gamemode.
	 */
	void reload();
}

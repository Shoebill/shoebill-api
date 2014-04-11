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

package net.gtaun.shoebill.resource;

import net.gtaun.shoebill.Shoebill;

/**
 * 
 * 
 * @author MK124
 */
public abstract class Plugin extends Resource
{
    /**
     * Gets the Plugin.
     * @param pluginClass Class Instance of the Plugin
     * @param <PluginType> Type of the Plugin class.
     * @return The Plugin
     */
	public static <PluginType extends Plugin> Resource get(Class<Plugin> pluginClass)
	{
		return Shoebill.get().getResourceManager().getPlugin(pluginClass);
	}

	protected Plugin()
	{
		
	}

	@Override
	public void enable() throws Throwable
	{
		super.enable();
	}
	
	@Override
	public void disable() throws Throwable
	{
		super.disable();
	}
}

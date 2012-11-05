/**
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
package net.gtaun.shoebill.events;

import net.gtaun.shoebill.events.plugin.PluginLoadEvent;
import net.gtaun.shoebill.events.plugin.PluginUnloadEvent;
import net.gtaun.util.event.AbstractEventHandler;

/**
 * 
 * 
 * @author MK124
 */
public abstract class PluginEventHandler extends AbstractEventHandler
{
	protected PluginEventHandler()
	{
		super( PluginEventHandler.class );
	}


	public void onPluginLoad( PluginLoadEvent event )			{ }
	public void onPluginUnload( PluginUnloadEvent event )		{ }
}

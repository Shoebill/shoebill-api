/**
 * Copyright (C) 2011 JoJLlmAn
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
import java.util.Collection;

import net.gtaun.shoebill.resource.Plugin;
import net.gtaun.shoebill.resource.PluginDescription;

/**
 * @author MK124, JoJLlmAn
 *
 */

public interface IPluginManager
{
	Plugin loadPlugin( String filename );
	Plugin loadPlugin( File file );
	Plugin loadPlugin( PluginDescription desc );
	
	void unloadPlugin( Plugin plugin );
	
	<T extends Plugin> T getPlugin( Class<T> cls );
	
	Collection<Plugin> getPlugins();
}

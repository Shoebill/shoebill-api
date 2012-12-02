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

import net.gtaun.shoebill.samp.SampCallbackManager;
import net.gtaun.util.event.EventManager;

/**
 * Shoebill low-level interface, provides some low-level functions which are not recommend. 
 * 
 * @author MK124
 * @deprecated
 */
public interface ShoebillLowLevel
{
	/**
	 * Get the main low-level EventManager. 
	 * It won't be effected by plugin's lifetime.
	 * 
	 * @return EventManager instance.
	 */
	EventManager getEventManager();
	
	/**
	 * Get original SA-MP CallbackManager.
	 * 
	 * @return SampCallbackManager instance.
	 */
	SampCallbackManager getCallbackManager();
}

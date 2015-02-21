/**
 * Copyright (C) 2011-2014 MK124
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

import net.gtaun.shoebill.amx.AmxInstanceManager;
import net.gtaun.shoebill.resource.ResourceManager;
import net.gtaun.shoebill.service.ServiceStore;

import java.lang.ref.Reference;

/**
 * Shoebill main interface, provides the basic manager instance and functions.
 * 
 * @author MK124
 */
public interface Shoebill
{
	public class Instance
	{
		static Reference<? extends Shoebill> reference = null;
	}

	public static Shoebill get()
	{
        if (Instance.reference == null) return null;
        return Instance.reference.get();
	}

	/**
	 * Get SA-MP object manager.
	 * 
	 * @return SampObjectManager instance.
	 */
	SampObjectManager getSampObjectManager();
	
	/**
	 * Get resource manager.
	 * 
	 * @return ResourceManager instance.
	 */
	ResourceManager getResourceManager();

	/**
	 * Get AMX instance manager.
	 * 
	 * @return AmxInstanceManager instance.
	 */
	AmxInstanceManager getAmxInstanceManager();
	
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
	 * Reload all.
	 */
	void reload();
	
	/**
	 * Causes the run() method of the runnable to be invoked by amx thread at the next process tick.
	 * 
	 * @param runnable Runnable instance
	 */
	void runOnSampThread(Runnable runnable);
}

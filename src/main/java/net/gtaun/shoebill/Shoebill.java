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

import java.lang.ref.Reference;

import net.gtaun.shoebill.amx.AmxInstanceManager;
import net.gtaun.shoebill.proxy.GlobalProxyManager;
import net.gtaun.shoebill.resource.ResourceManager;
import net.gtaun.shoebill.service.ServiceStore;

/**
 * Shoebill main interface, provides the basic manager instance and functions.
 * 
 * @author MK124
 */
public interface Shoebill
{
	public final class Instance
	{
		protected static Reference<? extends Shoebill> shoebillReference;
		
		public static Shoebill get()
		{
			return shoebillReference.get();
		}
	}
	
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
	 * Get AMX instance manager.
	 * 
	 * @return AmxInstanceManager instance.
	 */
	AmxInstanceManager getAmxInstanceManager();
	
	/**
	 * Get resource manager.
	 * 
	 * @return ResourceManager instance.
	 */
	ResourceManager getResourceManager();
	
	/**
	 * Get service store.
	 * 
	 * @return ServiceStore instance.
	 */
	ServiceStore getServiceStore();
	
	/**
	 * Get global proxy manager.
	 * 
	 * @return GlobalProxyManager instance.
	 */
	GlobalProxyManager getGlobalProxyManager();
	
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
	 * @param runnable
	 */
	void asyncExec(Runnable runnable);
}

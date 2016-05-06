/**
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

package net.gtaun.shoebill

import net.gtaun.shoebill.amx.AmxInstanceManager
import net.gtaun.shoebill.resource.ResourceManager
import net.gtaun.shoebill.service.ServiceStore

import java.lang.ref.Reference

/**
 * Shoebill main interface, provides the basic manager instance and functions.
 *
 * @author MK124
 * @author Marvin Haschker
 */
interface Shoebill {

    object Instance {
        internal var reference: Reference<out Shoebill>? = null
    }

    /**
     * The SA-MP object manager.
     */
    val sampObjectManager: SampObjectManager

    /**
     * The resource manager.
     */
    val resourceManager: ResourceManager

    /**
     * The AMX instance manager.
     */
    val amxInstanceManager: AmxInstanceManager

    /**
     * The service store.
     */
    val serviceStore: ServiceStore

    /**
     * The version information.
     */
    val version: ShoebillVersion

    /**
     * Reloads everything.
     */
    fun reload()

    /**
     * Causes the run() method of the runnable to be invoked by amx thread at the next process tick.
     * @param runnable Runnable instance
     */
    fun runOnSampThread(runnable: Runnable)

    companion object {
        fun get(): Shoebill? = Instance.reference?.get()
    }
}

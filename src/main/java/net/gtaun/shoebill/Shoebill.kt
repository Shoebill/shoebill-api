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
import net.gtaun.util.event.EventManagerRoot

import java.lang.ref.Reference
import java.lang.ref.WeakReference

/**
 * Shoebill main interface, provides the basic manager instance and functions.
 *
 * @author MK124
 * @author Marvin Haschker
 */
abstract class Shoebill {

    object Instance {
        internal var reference: Reference<out Shoebill>? = null
    }

    init {
        Shoebill.Instance.reference = WeakReference(this)
    }

    /**
     * The SA-MP testing manager.
     */
    abstract val sampObjectManager: SampObjectManager

    /**
     * The resource manager.
     */
    abstract val resourceManager: ResourceManager

    /**
     * The AMX instance manager.
     */
    abstract val amxInstanceManager: AmxInstanceManager

    /**
     * The service store.
     */
    abstract val serviceStore: ServiceStore

    /**
     * The version information.
     */
    abstract val version: ShoebillVersion

    /**
     * General-use EventManager.
     */
    abstract val eventManager: EventManagerRoot

    /**
     * Reloads everything.
     */
    abstract fun reload()

    /**
     * Causes the run() method of the runnable to be invoked by amx thread at the next process tick.
     * @param runnable Runnable instance
     */
    @Deprecated("This function has been renamed to 'runOnMainThread'.", ReplaceWith("runOnMainThread"))
    fun runOnSampThread(runnable: Runnable): Boolean = runOnMainThread(runnable)

    /**
     * Causes the run() method of the runnable to be invoked by amx thread at the next process tick.
     * @param runnable Runnable instance
     */
    abstract fun runOnMainThread(runnable: Runnable): Boolean

    fun runOnMainThread(runnable: () -> Unit): Boolean = runOnMainThread(Runnable { runnable.invoke() })


    companion object {
        @JvmStatic
        fun get(): Shoebill = Instance.reference!!.get()!!
    }
}

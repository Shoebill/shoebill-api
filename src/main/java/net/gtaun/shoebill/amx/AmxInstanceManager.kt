/**
 * Copyright (C) 2013 MK124

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

package net.gtaun.shoebill.amx

import net.gtaun.shoebill.event.amx.AmxCallEvent

import java.lang.ref.Reference
import java.lang.ref.WeakReference
import java.util.function.Consumer

/**
 * This class manages the usage of the amx interface. It contains all AmxInstances and Hooks and allows to
 * create new hooks.
 *
 * @author MK124
 * @author Marvin Haschker
 */
abstract class AmxInstanceManager {
    object Instance {
        internal var reference: Reference<out AmxInstanceManager>? = null
    }

    init {
        Instance.reference = WeakReference(this)
    }

    /**
     * Contains all the registered [AmxInstance] that are available to Shoebill.
     */
    abstract val amxInstances: Set<AmxInstance>

    /**
     * Contains all registered hooks in the [AmxInstanceManager].
     */
    abstract val amxHooks: Set<AmxHook>

    /**
     * Hooks an callback that is triggered from the abstract machine (SA:MP Server) such as OnPlayerConnect or even
     * custom callbacks like OnDynamicObjectMoved (from the Streamer Plugin).
     */
    abstract fun hookCallback(callbackName: String, hook: Consumer<AmxCallEvent>, types: String): Boolean

    /**
     * Unhooks a registered callback after it has been registered via [hookCallback].
     */
    abstract fun unhookCallback(callbackName: String): Boolean

    companion object {
        /**
         * Returns the main instance of the [AmxInstanceManager].
         */
        @JvmStatic
        fun get(): AmxInstanceManager? = Instance.reference?.get()
    }
}

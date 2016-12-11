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
    abstract fun hookCallback(name: String, hook: (AmxCallEvent) -> Unit, vararg types: String): Boolean

    /**
     * Convenient method for the usage with Java instead of Kotlin.
     */
    fun hookCallback(name: String, hook: Consumer<AmxCallEvent>, vararg types: String): Boolean =
            hookCallback(name, { hook.accept(it) }, *types)

    /**
     * Unhooks a registered callback after it has been registered via [hookCallback].
     */
    abstract fun unhookCallback(callbackName: String): Boolean

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AmxInstanceManager) return false

        if (amxInstances != other.amxInstances) return false
        if (amxHooks != other.amxHooks) return false

        return true
    }

    override fun hashCode(): Int {
        var result = amxInstances.hashCode()
        result = 31 * result + amxHooks.hashCode()
        return result
    }


    companion object {
        /**
         * Returns the main instance of the [AmxInstanceManager].
         */
        @JvmStatic
        fun get(): AmxInstanceManager = Instance.reference!!.get()
    }
}

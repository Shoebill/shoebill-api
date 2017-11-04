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

import net.gtaun.shoebill.amx.types.ReturnType

import java.util.function.Function

/**
 * Represent an Amx-Instance from the SA:MP server. This class enables you to register and call functions that are
 * existing in the context of the abstract machine.
 *
 * @author MK124
 * @author Marvin Haschker
 */
abstract class AmxInstance {

    /**
     * Registers a function that can be called from pawn and other native plugins.
     */
    abstract fun registerFunction(name: String, callback: (Array<Any>) -> Int, vararg types: String): Boolean

    /**
     * Convenient method for the usage of Java instead of Kotlin.
     */
    fun registerFunction(name: String, callback: Function<Array<Any>, Int>, vararg types: String): Boolean =
            registerFunction(name, { callback.apply(it) }, *types)

    /**
     * Unregisters a function that had previously been registered.
     */
    abstract fun unregisterFunction(name: String): Boolean

    /**
     * Checks if the given function has already been registered.
     */
    abstract fun isFunctionRegistered(name: String): Boolean

    /**
     * Calls an registered function by it's name with given parameters.
     */
    abstract fun callRegisteredFunction(name: String, parameters: Array<Any>): Int

    /**
     * Finds a public function in the context of the loaded amx file.
     */
    fun getPublic(name: String): AmxCallable? = getPublic(name, ReturnType.INTEGER)

    /**
     * Finds a native function that has been installed into the context of the loaded amx file (e.g. from a native
     * plugin, such as Streamer or FCNPC).
     */
    fun getNative(name: String): AmxCallable? = getNative(name, ReturnType.INTEGER)

    /**
     * Finds a public function in the context of the loaded amx file.
     */
    abstract fun getPublic(name: String, returnType: ReturnType): AmxCallable?

    /**
     * Finds a native function that has been installed into the context of the loaded amx file (e.g. from a native
     * plugin, such as Streamer or FCNPC).
     */
    abstract fun getNative(name: String, returnType: ReturnType): AmxCallable?

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AmxInstance) return false

        if (handle != other.handle) return false

        return true
    }

    override fun hashCode(): Int {
        return handle
    }

    /**
     * Holds the memory address of the Amx-Instance from the SA:MP server.
     */
    abstract val handle: Int

    companion object {
        /**
         * Returns the default (main) amx instance.
         */
        @JvmStatic
        val default: AmxInstance
            get() = AmxInstanceManager.get().amxInstances.first()
    }
}

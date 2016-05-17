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

/**
 * This class holds the information about a specific native function or callback.
 *
 * @author MK124
 * @author Marvin Haschker
 */
abstract class AmxCallable {
    /**
     * The name of the function / callback.
     */
    abstract val name: String

    /**
     * The type of the return value.
     */
    abstract val returnType: ReturnType

    /**
     * Calls the function with arguments.
     */
    abstract fun call(vararg args: Any): Any?

    companion object {
        /**
         * Invalid callable reference id.
         */
        @JvmField
        val INVALID_CALLABLE = 2147483647
    }
}

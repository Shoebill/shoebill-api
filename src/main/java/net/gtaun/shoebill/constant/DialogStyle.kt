/**
 * Copyright (C) 2011 MK124

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

package net.gtaun.shoebill.constant

/**
 * Defines the available Dialog types that can be used with showDialog.
 *
 * @author MK124
 * @author Marvin Haschker
 */
enum class DialogStyle constructor(val value: Int) {
    /**
     * Message box dialog
     */
    MSGBOX(0),

    /**
     * Input dialog
     */
    INPUT(1),

    /**
     * List dialog
     */
    LIST(2),

    /**
     * Password input dialog
     */
    PASSWORD(3),

    /**
     * Tablist-List dialog
     */
    TABLIST(4),

    /**
     * Tablist-List dialog with headers
     */
    TABLIST_HEADERS(5);


    companion object : Collectable<DialogStyle>, Findable<Int, DialogStyle> {
        private val VALUES = values().map { it.value to it }.toMap()

        /**
         * Gets a [DialogStyle] by its id.
         */
        @JvmStatic
        override operator fun get(value: Int): DialogStyle? = VALUES[value]

        /**
         * Gets all available [DialogStyle]s.
         */
        @JvmStatic
        override fun get(): Collection<DialogStyle> = VALUES.values
    }
}

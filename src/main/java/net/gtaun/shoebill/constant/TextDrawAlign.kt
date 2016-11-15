/**
 * Copyright (C) 2012 MK124

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
 * This enum contains the TextDrawAlignment position that can be used with normal and player TextDraws. This
 * information was taken from the official SA:MP Wikipedia page.
 *
 * @author MK124
 * @author Marvin Haschker
 */
enum class TextDrawAlign constructor(val value: Int) {
    LEFT(1),
    CENTER(2),
    RIGHT(3);

    companion object : Collectable<TextDrawAlign>, Findable<Int, TextDrawAlign> {
        private val VALUES = values().map { it.value to it }.toMap()

        /**
         * Gets all available [TextDrawAlign]s.
         */
        @JvmStatic
        override fun get(): Collection<TextDrawAlign> = VALUES.values

        /**
         * Gets a [TextDrawAlign] by its id.
         */
        @JvmStatic
        override operator fun get(value: Int): TextDrawAlign? = VALUES[value]

    }
}

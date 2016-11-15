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
 * This enum contains the available TextDrawFont types that can be used with normal and player Textdraws.
 * This information was taken from the official SA:MP Wikipedia page.
 *
 * @author MK124
 * @author Marvin Haschker
 */
enum class TextDrawFont constructor(val value: Int) {
    DIPLOMA(0),
    FONT2(1),
    BANK_GOTHIC(2),
    PRICEDOWN(3),
    SPRITE_DRAW(4),
    MODEL_PREVIEW(5);

    companion object : Collectable<TextDrawFont>, Findable<Int, TextDrawFont> {
        private val VALUES = values().map { it.value to it }.toMap()

        /**
         * Gets all available [TextDrawFont]s.
         */
        @JvmStatic
        override fun get(): Collection<TextDrawFont> = VALUES.values

        /**
         * Gets a [TextDrawFont] by its id.
         */
        @JvmStatic
        override operator fun get(value: Int): TextDrawFont? = VALUES[value]

    }
}

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

package net.gtaun.shoebill.entities

import net.gtaun.shoebill.SampObjectManager
import net.gtaun.shoebill.constant.Collectable
import net.gtaun.shoebill.constant.Findable
import net.gtaun.shoebill.data.Vector2D
import net.gtaun.shoebill.exception.CreationFailedException

/**
 * This class contains functions and methods to create and handle Textdraws.
 *
 * @author MK124
 * @author Marvin Haschker
 */
abstract class Textdraw : TextdrawBase() {

    abstract fun show(player: Player)
    abstract fun hide(player: Player)

    abstract fun showForAll()
    abstract fun hideForAll()

    abstract fun isShownForPlayer(player: Player): Boolean

    companion object : Collectable<Textdraw>, Findable<Int, Textdraw> {

        /**
         * Invalid ID for a [Textdraw].
         */
        @JvmField
        val INVALID_ID = 0xFFFF

        /**
         * Gets all available [Textdraw]s.
         */
        @JvmStatic
        override fun get(): Collection<Textdraw> = SampObjectManager.get().textdraws.filterNotNull()

        /**
         * Gets a [Textdraw] by it's [id].
         */
        @JvmStatic
        override fun get(value: Int): Textdraw? = SampObjectManager.get().getTextdraw(value)

        /**
         * Create a Textdraw with params. If the Creation fails, it will throw a CreationFailedException.
         * @param pos Vector2D-Position where the Textdraw should be.
         * @param text The displayed Text.
         * @return The created Textdraw.
         */
        @Throws(CreationFailedException::class)
        @JvmStatic
        @JvmOverloads
        fun create(pos: Vector2D, text: String = " "): Textdraw = SampObjectManager.get().createTextdraw(pos, text)

        /**
         * Create a Textdraw with params. If the Creation fails, it will throw a CreationFailedException.
         * @param x X-Pos where the Textdraw should be.
         * @param y Y-Pos where the Textdraw should be.
         * @param text The displayed Text.
         * @return The created Textdraw.
         */
        @Throws(CreationFailedException::class)
        @JvmStatic
        @JvmOverloads
        fun create(x: Float, y: Float, text: String = " "): Textdraw = create(Vector2D(x, y), text)
    }
}

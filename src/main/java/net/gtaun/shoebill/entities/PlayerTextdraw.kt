/**
 * Copyright (C) 2012-2014 MK124

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
 * @author MK124
 * @author Marvin Haschker
 */
abstract class PlayerTextdraw : PlayerRelated, TextdrawBase() {

    abstract fun show()
    abstract fun hide()

    abstract val isShown: Boolean

    companion object : Collectable<PlayerTextdraw>, Findable<Player, Collection<PlayerTextdraw>> {

        /**
         * Gets all [PlayerTextdraw] from all [Player]s.
         */
        @JvmStatic
        override fun get(): Collection<PlayerTextdraw> {
            val textdraws = mutableListOf<PlayerTextdraw>()
            Player.get().forEach { textdraws.addAll(get(it)) }
            return textdraws
        }

        /**
         * Invalid ID for a [PlayerTextdraw]
         */
        @JvmField
        val INVALID_ID = 0xFFFF

        /**
         * Gets a [PlayerTextdraw] from [player] with [id].
         */
        @JvmStatic
        operator fun get(player: Player, id: Int): PlayerTextdraw? =
                SampObjectManager.get().getPlayerTextdraw(player, id)

        /**
         * Gets all [PlayerTextdraw] from [value].
         */
        @JvmStatic
        override operator fun get(value: Player): Collection<PlayerTextdraw> =
                SampObjectManager.get().getPlayerTextdraws(value)

        /**
         * Create a Textdraw which is only visible for one player, with params. If the Creation fails, it will throw a CreationFailedException.
         * @param player The Player who sees the Textdraw.
         * @param pos Vector2D-Position where the Textdraw should be.
         * @param text The displayed Text.
         * @return The created PlayerTextdraw.
         */
        @Throws(CreationFailedException::class)
        @JvmStatic
        @JvmOverloads
        fun create(player: Player, pos: Vector2D = Vector2D(), text: String = " "): PlayerTextdraw =
                SampObjectManager.get().createPlayerTextdraw(player, pos, text)

        /**
         * Create a Textdraw which is only visible for one player, with params. If the Creation fails, it will throw a CreationFailedException.
         * @param player The Player who sees the Textdraw.
         * @param x X-Pos where the Textdraw should be.
         * @param y Y-Pos where the Textdraw should be.
         * @param text The displayed Text.
         * @return The created PlayerTextdraw.
         */
        @Throws(CreationFailedException::class)
        @JvmStatic
        @JvmOverloads
        fun create(player: Player, x: Float, y: Float, text: String = " "): PlayerTextdraw =
                create(player, Vector2D(x, y), text)
    }
}

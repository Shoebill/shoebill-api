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

package net.gtaun.shoebill.`object`

import net.gtaun.shoebill.SampObjectManager
import net.gtaun.shoebill.constant.Collectable
import net.gtaun.shoebill.data.Color
import net.gtaun.shoebill.data.Location
import net.gtaun.shoebill.exception.CreationFailedException

/**
 * @author MK124
 * @author Marvin Haschker
 */
abstract class PlayerLabel : Label(), PlayerRelated {
    companion object : Collectable<PlayerLabel> {
        /**
         * Invalid ID for a [PlayerLabel].
         */
        @JvmField
        val INVALID_ID = 0xFFFF

        /**
         * Gets all available [PlayerLabel]s.
         */
        @JvmStatic
        override fun get(): Collection<PlayerLabel> {
            val labels = mutableListOf<PlayerLabel>()
            Player.get().forEach { labels.addAll(get(it)) }
            return labels
        }

        /**
         * Gets a [PlayerLabel] from [player] with [id].
         */
        @JvmStatic
        operator fun get(player: Player, id: Int): PlayerLabel? {
            return SampObjectManager.get().getPlayerLabel(player, id)
        }

        /**
         * Gets all [PlayerLabel]s from [player].
         */
        @JvmStatic
        operator fun get(player: Player): Collection<PlayerLabel> {
            return SampObjectManager.get().getPlayerLabels(player)
        }

        /**
         * Create a Label which is only visible for one player, with params. If the Creation fails, it will throw a CreationFailedException.
         * @param player The Player who sees the Label.
         * @param text The displayed Text.
         * @param color The color of the Label.
         * @param loc Location where the Label should be.
         * @param drawDistance The Drawdistance of the Label.
         * @param testLOS If the Label can be seen through objects.
         * @return The created PlayerLabel.
         */
        @Throws(CreationFailedException::class)
        @JvmStatic
        @JvmOverloads
        fun create(player: Player, text: String, color: Color = Color.WHITE, loc: Location = Location(),
                   drawDistance: Float = 50f, testLOS: Boolean = false): PlayerLabel =
                SampObjectManager.get().createPlayerLabel(player, text, color, loc, drawDistance, testLOS, null as
                        Player?)

        /**
         * Create a Label which is only visible for one player, with params. If the Creation fails, it will throw a CreationFailedException.
         * @param player The Player who sees the Label.
         * @param text The displayed Text.
         * @param color The color of the Label.
         * @param loc Location where the Label should be.
         * @param drawDistance The Drawdistance of the Label.
         * @param testLOS If the Label can be seen through objects.
         * @param attachedPlayer The Player where the Label should be attached.
         * @return The created PlayerLabel.
         */
        @Throws(CreationFailedException::class)
        @JvmStatic
        @JvmOverloads
        fun create(player: Player, text: String, color: Color = Color.WHITE, loc: Location = Location(),
                   drawDistance: Float = 50f, testLOS: Boolean = false, attachedPlayer: Player): PlayerLabel =
                SampObjectManager.get().createPlayerLabel(player, text, color, loc, drawDistance,
                        testLOS, attachedPlayer)

        /**
         * Create a Label which is only visible for one player, with params. If the Creation fails, it will throw a CreationFailedException.
         * @param player The Player who sees the Label.
         * @param text The displayed Text.
         * @param color The color of the Label.
         * @param loc Location where the Label should be.
         * @param drawDistance The Drawdistance of the Label.
         * @param testLOS If the Label can be seen through objects.
         * @param attachedVehicle The Vehicle where the Label should be attached.
         * @return The created PlayerLabel.
         */
        @Throws(CreationFailedException::class)
        @JvmStatic
        @JvmOverloads
        fun create(player: Player, text: String, color: Color = Color.WHITE, loc: Location = Location(),
                   drawDistance: Float = 50f, testLOS: Boolean = false, attachedVehicle: Vehicle): PlayerLabel =
                SampObjectManager.get().createPlayerLabel(player, text, color, loc, drawDistance,
                        testLOS, attachedVehicle)
    }
}

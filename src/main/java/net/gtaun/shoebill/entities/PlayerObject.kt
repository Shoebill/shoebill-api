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
import net.gtaun.shoebill.data.Location
import net.gtaun.shoebill.data.Vector3D
import net.gtaun.shoebill.event.sampobject.PlayerObjectMovedEvent
import net.gtaun.shoebill.exception.CreationFailedException
import net.gtaun.util.event.EventHandler
import net.gtaun.util.event.HandlerPriority

/**
 * @author MK124
 * @author Marvin Haschker
 */
abstract class PlayerObject : SampObject(), PlayerRelated {

    abstract fun setPlayerObjectNoCameraCol()

    /**
     * Quick-register Events
     */
    @JvmOverloads
    fun onPlayerObjectMoved(handler: EventHandler<PlayerObjectMovedEvent>, priority: HandlerPriority = HandlerPriority.NORMAL) =
            eventManagerNode.registerHandler(PlayerObjectMovedEvent::class.java, handler, priority, attention)

    @JvmOverloads
    fun onPlayerObjectMoved(handler: (PlayerObjectMovedEvent) -> Unit, priority: HandlerPriority = HandlerPriority.NORMAL) =
            onPlayerObjectMoved(EventHandler { handler(it) }, priority)

    companion object {

        /**
         * Invalid ID for a [PlayerObject].
         */
        @JvmField
        val INVALID_ID = 0xFFFF

        /**
         * Gets a [PlayerObject] from [player] with [id].
         */
        @JvmStatic
        operator fun get(player: Player, id: Int): PlayerObject? = SampObjectManager.get().getPlayerObject(player, id)

        /**
         * Gets all available [PlayerObject]s from [player].
         */
        @JvmStatic
        operator fun get(player: Player): Collection<PlayerObject> = SampObjectManager.get().getPlayerObjects(player)

        /**
         * Create a SampObject for Player with params. If the Creation fails, it will throw a CreationFailedException.
         * @param player The Player who sees the Object.
         * @param modelId Modelid of the Object.
         * @param loc Location where the Object should be.
         * @param rot Rotation-Position where the Object should be.
         * @param drawDistance The Drawdistance of the Object.
         * @return The created PlayerObject.
         */
        @Throws(CreationFailedException::class)
        @JvmStatic
        @JvmOverloads
        fun create(player: Player, modelId: Int, loc: Location = Location(), rot: Vector3D = Vector3D(),
                   drawDistance: Float = 250f): PlayerObject =
                SampObjectManager.get().createPlayerObject(player, modelId, loc, rot, drawDistance)

        /**
         * Create a SampObject for Player with params. If the Creation fails, it will throw a CreationFailedException.
         * @param player The Player who sees the Object.
         * @param modelId Modelid of the Object.
         * @param x X-Pos where the Object should be.
         * @param y Y-Pos where the Object should be.
         * @param z Z-Pos where the Object should be.
         * @param rx Rotation-X where the Object should be.
         * @param ry Rotation-Y where the Object should be.
         * @param rz Rotation-Z where the Object should be.
         * @return The created PlayerObject.
         */
        @Throws(CreationFailedException::class)
        @JvmStatic
        @JvmOverloads
        fun create(player: Player, modelId: Int, x: Float, y: Float, z: Float, rx: Float, ry: Float, rz: Float,
                   drawDistance: Float = 250f): PlayerObject =
                create(player, modelId, Location(x, y, z), Vector3D(rx, ry, rz), drawDistance)
    }
}

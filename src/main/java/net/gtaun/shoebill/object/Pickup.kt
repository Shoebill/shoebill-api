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

package net.gtaun.shoebill.`object`

import net.gtaun.shoebill.SampObjectManager
import net.gtaun.shoebill.constant.Collectable
import net.gtaun.shoebill.constant.Findable
import net.gtaun.shoebill.data.Location
import net.gtaun.shoebill.event.player.PlayerPickupEvent
import net.gtaun.shoebill.exception.CreationFailedException
import net.gtaun.util.event.EventHandler

/**
 * This class wraps functions and methods for the use of [Pickup]s.
 *
 * @author MK124
 * @author Marvin Haschker
 */
abstract class Pickup : Destroyable, Proxyable<Pickup> {

    /**
     * If the [Pickup] is static.
     */
    abstract val isStatic: Boolean

    /**
     * The internal id of the [Pickup].
     */
    abstract val id: Int

    /**
     * The ModelId of the [Pickup].
     */
    abstract val modelId: Int

    /**
     * The type of the [Pickup].
     */
    abstract val type: Int

    /**
     * The location of the [Pickup].
     */
    abstract val location: Location

    companion object : Collectable<Pickup>, Findable<Int, Pickup> {

        /**
         * The invalid id for a [Pickup].
         */
        @JvmField
        val INVALID_ID = -1

        /**
         * Gets all available [Pickup]s.
         */
        @JvmStatic
        override fun get(): Collection<Pickup> = SampObjectManager.get().pickups

        /**
         * Gets a [Pickup] by it's [id].
         */
        @JvmStatic
        override operator fun get(value: Int): Pickup? = SampObjectManager.get().getPickup(value)

        /**
         * Creates a [Pickup] with params. If the Creation fails, it will throw a CreationFailedException.
         * @param modelId Modelid of the Pickup.
         * @param type Type of the Pickup.
         * @param loc Location where the Pickup should be.
         * @return The created [Pickup].
         */
        @Throws(CreationFailedException::class)
        @JvmStatic
        @JvmOverloads
        fun create(modelId: Int, type: Int = 1, loc: Location = Location(), handler:
            EventHandler<PlayerPickupEvent>? = null): Pickup =
                SampObjectManager.get().createPickup(modelId, type, loc, handler)

        /**
         * Creates a [Pickup] with params. If the Creation fails, it will throw a CreationFailedException.
         * @param modelId Modelid of the Pickup.
         * @param type Type of the Pickup.
         * @param x X-Pos where the Pickup should be.
         * @param y Y-Pos where the Pickup should be.
         * @param z Z-Pos where the Pickup should be.
         * @param worldId Worldid where the Pickup should be.
         * @return The created [Pickup].
         */
        @Throws(CreationFailedException::class)
        @JvmStatic
        @JvmOverloads
        fun create(modelId: Int, type: Int, x: Float, y: Float, z: Float, worldId: Int, handler:
            EventHandler<PlayerPickupEvent>? = null): Pickup =
                create(modelId, type, Location(x, y, z, worldId = worldId), handler)
    }
}

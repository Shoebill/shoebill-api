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
 * This enum contains the possible PlayerStates a player can be in. This information was taken from the official
 * SA:MP Wikipedia page.
 *
 * @author MK124
 * @author Marvin Haschker
 */
enum class PlayerState private constructor(val value: Int) {
    /**
     * Empty (while initializing)
     */
    NONE(0),

    /**
     * Player is on foot
     */
    ONFOOT(1),

    /**
     * Player is driver of a vehicle
     */
    DRIVER(2),

    /**
     * Player is passenger of a vehicle
     */
    PASSENGER(3),

    /**
     * Player exits a vehicle (Used internally)
     */
    EXIT_VEHICLE(4),

    /**
     * Player enters a vehicle as driver (Used internally)
     */
    ENTER_VEHICLE_DRIVER(5),

    /**
     * Player enters a vehicle as passenger (Used internally)
     */
    ENTER_VEHICLE_PASSENGER(6),

    /**
     * Player is wasted or on class selection
     */
    WASTED(7),

    /**
     * Player is spawned
     */
    SPAWNED(8),

    /**
     * Player is spectating
     */
    SPECTATING(9);


    companion object : Collectable<PlayerState>, Findable<Int, PlayerState> {
        private val VALUES = values().map { it.value to it }.toMap()

        /**
         * Gets all the available [PlayerState]s.
         */
        @JvmStatic
        override fun get(): Collection<PlayerState> = VALUES.values

        /**
         * Gets a [PlayerState] by its id.
         */
        @JvmStatic
        override operator fun get(value: Int): PlayerState? = VALUES[value]
    }
}

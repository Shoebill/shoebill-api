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
 * This enum contains the available WeaponStates a weapon can be in. This information was taken from the official
 * SA:MP Wikipedia page.
 *
 * @author MK124
 * @author Marvin Haschker
 * @see net.gtaun.shoebill.object.Player.getWeaponState
 */
enum class WeaponState private constructor(val value: Int) {
    UNKNOWN(-1),
    NO_BULLETS(0),
    LAST_BULLET(1),
    MORE_BULLETS(2),
    RELOADING(3);

    companion object : Collectable<WeaponState>, Findable<Int, WeaponState> {
        private val VALUES = values().map { it.value to it }.toMap()

        /**
         * Gets all available [WeaponState]s.
         */
        @JvmStatic
        override fun get(): Collection<WeaponState> = VALUES.values

        /**
         * Gets a [WeaponState] by its id.
         */
        @JvmStatic
        override operator fun get(value: Int): WeaponState? = VALUES[value]

    }
}

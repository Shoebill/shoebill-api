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
 * This enum contains the available WeaponSkill field that can be changed via the PlayerWeaponSkill object.
 * This information was taken from the official SA:MP Wikipedia page.
 *
 * @author MK124
 * @author Marvin Haschker
 * @see net.gtaun.shoebill.object.PlayerWeaponSkill
 */
enum class WeaponSkill private constructor(val value: Int) {
    PISTOL(0),
    PISTOL_SILENCED(1),
    DESERT_EAGLE(2),
    SHOTGUN(3),
    SAWNOFF_SHOTGUN(4),
    SPAS12_SHOTGUN(5),
    MICRO_UZI(6),
    MP5(7),
    AK47(8),
    M4(9),
    SNIPERRIFLE(10);

    companion object : Collectable<WeaponSkill>, Findable<Int, WeaponSkill> {
        private val VALUES = values().map { it.value to it }.toMap()

        /**
         * Gets all available [WeaponSkill]s.
         */
        @JvmStatic
        override fun get(): Collection<WeaponSkill> = VALUES.values

        /**
         * Gets a [WeaponSkill] by its id.
         */
        @JvmStatic
        override operator fun get(value: Int): WeaponSkill? = VALUES[value]

    }
}

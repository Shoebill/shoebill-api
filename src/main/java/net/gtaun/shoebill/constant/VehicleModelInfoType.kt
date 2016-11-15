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
 * This enum contains the available InfoTypes that can be used with getVehicleModelInfo.
 * This information was taken from the official SA:MP Wikipedia page.
 *
 * @author MK124
 * @author Marvin Haschker
 */
enum class VehicleModelInfoType constructor(val value: Int) {
    /**
     * Vehicle size
     */
    SIZE(1),

    /**
     * Position of the front seat (calculated from the center of the vehicle)
     */
    FRONTSEAT(2),

    /**
     * Position of the rear seat (calculated from the center of the vehicle)
     */
    REARSEAT(3),

    /**
     * Position of the fuel cap (calculated from the center of the vehicle)
     */
    PETROLCAP(4),

    /**
     * Position of the front wheels (calculated from the center of the vehicle)
     */
    WHEELSFRONT(5),

    /**
     * Position of the rear wheels (calculated from the center of the vehicle)
     */
    WHEELSREAR(6),

    /**
     * Position of the middle wheels (applies to vehicles with 3 axes, calculated from the center of the vehicle)
     */
    WHEELSMID(7),

    /**
     * Height of the front bumper
     */
    FRONT_BUMPER_Z(8),

    /**
     * Height of the rear bumper
     */
    REAR_BUMPER_Z(9);


    companion object : Collectable<VehicleModelInfoType>, Findable<Int, VehicleModelInfoType> {
        private val VALUES = values().map { it.value to it }.toMap()

        /**
         * Gets all available [VehicleModelInfoType]s.
         */
        @JvmStatic
        override fun get(): Collection<VehicleModelInfoType> = VALUES.values

        /**
         * Gets a [VehicleModelInfoType] by its id.
         */
        @JvmStatic
        override operator fun get(value: Int): VehicleModelInfoType? = VALUES[value - 1]
    }
}

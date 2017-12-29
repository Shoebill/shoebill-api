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
 * This enum contains the available RaceCheckpointTypes.
 * This information was taken from the official SA:MP Wikipedia page.
 *
 * @author MK124
 * @author Marvin Haschker
 */
enum class RaceCheckpointType(val value: Int) {
    /**
     * Normal
     */
    NORMAL(0),

    /**
     * Finish
     */
    NORMAL_FINISH(1),

    /**
     * Nothing (Only the checkpoint without anything in it)
     */
    NOTHING(2),

    /**
     * Air normal
     */
    AIR(3),

    /**
     * Air finish
     */
    AIR_FINISH(4);

    companion object : Collectable<RaceCheckpointType>, Findable<Int, RaceCheckpointType> {
        private val VALUES = values().map { it.value to it }.toMap()

        /**
         * Gets all available [RaceCheckpointType]s.
         */
        @JvmStatic
        override fun get(): Collection<RaceCheckpointType> = VALUES.values

        /**
         * Gets a [RaceCheckpointType] by its id.
         */
        @JvmStatic
        override operator fun get(value: Int): RaceCheckpointType? = VALUES[value]

    }

}

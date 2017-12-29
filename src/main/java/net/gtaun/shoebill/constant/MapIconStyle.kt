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
 * This enum contains the possible IconStyles for the MapIcons.
 * This enum should be used with setMapIcon and getMapIcon.
 *
 * @author MK124
 * @author Marvin Haschker
 */
enum class MapIconStyle(val value: Int) {
    /**
     * Display in the player's local area
     */
    LOCAL(0),

    /**
     * Display always
     */
    GLOBAL(1),

    /**
     * Display in the player's local area and has a checkpoint marker
     */
    LOCAL_CHECKPOINT(2),

    /**
     * Display always and has a checkpoint marker
     */
    GLOBAL_CHECKPOINT(3);

    companion object : Collectable<MapIconStyle>, Findable<Int, MapIconStyle> {
        private val VALUES = values().map { it.value to it }.toMap()

        /**
         * Gets a [MapIconStyle] by its id.
         */
        @JvmStatic
        override operator fun get(value: Int): MapIconStyle? = VALUES[value]

        /**
         * Gets all available [MapIconStyle]s.
         */
        @JvmStatic
        override fun get(): Collection<MapIconStyle> = VALUES.values
    }

}

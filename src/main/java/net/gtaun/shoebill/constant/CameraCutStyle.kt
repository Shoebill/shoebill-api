/**
 * Copyright (C) 2016 MK124

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
 * To be used with setCameraLookAt, interpolateCameraPos and interpolateCameraLookAt.
 *
 * @author MK124
 * @author Marvin Haschker
 * @see net.gtaun.shoebill.object.Player.setCameraLookAt
 * @see net.gtaun.shoebill.object.Player.interpolateCameraPosition
 * @see net.gtaun.shoebill.object.Player.interpolateCameraLookAt
 */
enum class CameraCutStyle private constructor(val value: Int) {
    /**
     * Direct cut
     */
    CUT(2),

    /**
     * Smooth movement
     */
    MOVE(1);


    companion object : Collectable<CameraCutStyle>, Findable<Int, CameraCutStyle> {
        private val VALUES = values().map { it.value to it }.toMap()

        /**
         * Gets a [CameraCutStyle] by its id.
         */
        @JvmStatic
        override operator fun get(value: Int): CameraCutStyle? = VALUES[value]

        /**
         * Gets all available [CameraCutStyle]s.
         */
        @JvmStatic
        override fun get(): Collection<CameraCutStyle> = VALUES.values
    }
}

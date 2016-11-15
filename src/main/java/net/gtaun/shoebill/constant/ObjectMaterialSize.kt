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
 * This enum contains the possible ObjectMaterialSizes. This information was taken from the official SA:MP Wikipedia
 * page.
 *
 * @author MK124
 * @author Marvin Haschker
 */
enum class ObjectMaterialSize constructor(val value: Int) {
    SIZE_32x32(10),
    SIZE_64x32(20),
    SIZE_64x64(30),
    SIZE_128x32(40),
    SIZE_128x64(50),
    SIZE_128x128(60),
    SIZE_256x32(70),
    SIZE_256x64(80),
    SIZE_256x128(90),
    SIZE_256x256(100),
    SIZE_512x64(110),
    SIZE_512x128(120),
    SIZE_512x256(130),
    SIZE_512x512(140);


    companion object : Collectable<ObjectMaterialSize>, Findable<Int, ObjectMaterialSize> {
        private val VALUES = values().map { it.value to it }.toMap()

        /**
         * Gets a [ObjectMaterialSize] by its id.
         */
        @JvmStatic
        override operator fun get(value: Int): ObjectMaterialSize? = VALUES[value]

        /**
         * Gets all available [ObjectMaterialSize]s.
         */
        @JvmStatic
        override fun get(): Collection<ObjectMaterialSize> = VALUES.values
    }
}

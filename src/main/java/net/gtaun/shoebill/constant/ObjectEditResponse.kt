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
 * This enum contains the possible EditObject responses. The information was taken from the official SA:MP Wikipedia
 * page.
 *
 * @author MK124
 * @author Marvin Haschker
 */
enum class ObjectEditResponse(val value: Int) {
    /**
     * Player cancelled (ESC)
     */
    CANCEL(0),

    /**
     * Player clicked on save
     */
    FINAL(1),

    /**
     * Player moved the testing (edition did not stop at all)
     */
    UPDATE(2);

    companion object : Collectable<ObjectEditResponse>, Findable<Int, ObjectEditResponse> {
        private val VALUES = values().map { it.value to it }.toMap()

        /**
         * Gets a [ObjectEditResponse] by its id.
         */
        @JvmStatic
        override operator fun get(value: Int): ObjectEditResponse? = VALUES[value]

        /**
         * Gets all available [ObjectEditResponse]s.
         */
        @JvmStatic
        override fun get(): Collection<ObjectEditResponse> = VALUES.values
    }

}

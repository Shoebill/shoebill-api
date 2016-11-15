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
 * This enum contains the available fightstyles that can be applied to the Player's character. This enum should be
 * used with setFightStyle and getFightStyle.
 *
 * @author MK124
 * @author Marvin Haschker
 */
enum class FightStyle constructor(val value: Int) {
    NORMAL(4),
    BOXING(5),
    KUNGFU(6),
    KNEEHEAD(7),
    GRABKICK(15),
    ELBOW(16);

    companion object : Collectable<FightStyle>, Findable<Int, FightStyle> {
        private val VALUES = values().map { it.value to it }.toMap()

        /**
         * Gets a [FightStyle] by its id.
         */
        @JvmStatic
        override operator fun get(value: Int): FightStyle? = VALUES[value]

        /**
         * Gets all available [FightStyle]s.
         */
        @JvmStatic
        override fun get(): Collection<FightStyle> = VALUES.values
    }
}

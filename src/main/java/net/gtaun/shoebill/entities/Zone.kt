/**
 * Copyright (C) 2011-2014 MK124

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

package net.gtaun.shoebill.entities

import net.gtaun.shoebill.SampObjectManager
import net.gtaun.shoebill.constant.Collectable
import net.gtaun.shoebill.constant.Findable
import net.gtaun.shoebill.data.Area
import net.gtaun.shoebill.data.Color
import net.gtaun.shoebill.data.RangeCheckable3D
import net.gtaun.shoebill.exception.CreationFailedException

/**
 * This class contains methods and functions to handle zones.
 *
 * @author MK124
 * @author Marvin Haschker
 */
abstract class Zone : Destroyable, Proxyable<Zone>, RangeCheckable3D {

    abstract val id: Int
    abstract val area: Area

    abstract fun show(player: Player, color: Color)
    abstract fun hide(player: Player)
    abstract fun flash(player: Player, color: Color)
    abstract fun stopFlash(player: Player)

    abstract fun showForAll(color: Color)
    abstract fun hideForAll()

    abstract fun flashForAll(color: Color)
    abstract fun stopFlashForAll()

    companion object : Collectable<Zone>, Findable<Int, Zone> {

        /**
         * Gets a [Zone] by it's [value].
         */
        @JvmStatic
        override operator fun get(value: Int): Zone? = SampObjectManager.get().getZone(value)

        /**
         * Gets all available [Zone]s.
         */
        override fun get(): Collection<Zone> = SampObjectManager.get().zones.filterNotNull()

        /**
         * Create a Zone with params. If the Creation fails, it will throw a CreationFailedException.
         * @param area The Area-Position of the Zone.
         * @return The created Zone.
         */
        @Throws(CreationFailedException::class)
        @JvmStatic
        fun create(area: Area): Zone = SampObjectManager.get().createZone(area)

        /**
         * Create a Zone with params. If the Creation fails, it will throw a CreationFailedException.
         * @param minX The Min-X Position of the Zone.
         * @param minY The Min-Y Position of the Zone.
         * @param maxX The Max-X Position of the Zone.
         * @param maxY The Max-Y Position of the Zone.
         * @return The created Zone.
         */
        @Throws(CreationFailedException::class)
        @JvmStatic
        fun create(minX: Float, minY: Float, maxX: Float, maxY: Float): Zone =
                create(Area(minX, minY, maxX, maxY))

        @JvmField
        val INVALID_ID = -1
    }
}

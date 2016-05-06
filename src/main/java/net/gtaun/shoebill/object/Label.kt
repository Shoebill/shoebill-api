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

package net.gtaun.shoebill.`object`

import net.gtaun.shoebill.SampObjectManager
import net.gtaun.shoebill.constant.Collectable
import net.gtaun.shoebill.constant.Findable
import net.gtaun.shoebill.data.Color
import net.gtaun.shoebill.data.Location
import net.gtaun.shoebill.data.Vector3D
import net.gtaun.shoebill.exception.CreationFailedException

/**
 * This class wraps methods and functions for the use of labels.
 *
 * @author MK124
 * @author Marvin Haschker
 */
abstract class Label : Destroyable, Proxyable<Label> {

    /**
     * Gets the internal id of the label.
     */
    abstract val id: Int

    /**
     * Gets the text of the label.
     */
    abstract val text: String

    /**
     * Gets the color of the text.
     */
    abstract val color: Color

    /**
     * Gets the draw distance of the label.
     */
    abstract val drawDistance: Float

    /**
     * Gets the location of the label.
     */
    abstract val location: Location

    /**
     * Gets the attached [Player].
     * If there is none, this property will be null.
     */
    abstract val attachedPlayer: Player?

    /**
     * Gets the attached [Vehicle].
     * If there is none, this property will be null.
     */
    abstract val attachedVehicle: Vehicle?

    /**
     * Attaches the label to the [player].
     * @param player The Player
     * @param x X-Offset
     * @param y Y-Offset
     * @param z Z-Offset
     */
    abstract fun attach(player: Player, x: Float, y: Float, z: Float)

    /**
     * Attaches the label to the [player].
     * @param player The Player
     * @param offset The Location
     */
    abstract fun attach(player: Player, offset: Vector3D)

    /**
     * Attaches the label to the [vehicle].
     * @param vehicle The Vehicle
     * @param x X-Offset
     * @param y Y-Offset
     * @param z Z-Offset
     */
    abstract fun attach(vehicle: Vehicle, x: Float, y: Float, z: Float)

    /**
     * Attaches the label to the [vehicle].
     * @param vehicle The Vehicle
     * @param offset The Location
     */
    abstract fun attach(vehicle: Vehicle, offset: Vector3D)

    /**
     * Updates the [text] and [color] of the label.
     * @param color New Color
     * @param text New Text
     */
    abstract fun update(color: Color, text: String)

    companion object : Collectable<Label>, Findable<Int, Label> {

        /**
         * Invalid ID for a [Label].
         */
        @JvmField
        val INVALID_ID = 0xFFFF

        /**
         * Gets all available [Label]s.
         */
        @JvmStatic
        override fun get(): Collection<Label> = SampObjectManager.get().labels

        /**
         * Gets a [Label] by it's [id].
         */
        @JvmStatic
        override operator fun get(value: Int): Label? = SampObjectManager.get().getLabel(value)

        /**
         * Create a Label with params. If the Creation fails, it will throw a CreationFailedException.
         * @param text The displayed Text.
         * @param color The color of the Label.
         * @param x X-Position.
         * @param y Y-Position.
         * @param z Z-Position.
         * @param worldId Virtual World ID.
         * @param drawDistance The Drawdistance of the Label.
         * @param testLOS If the Label can be seen through objects.
         * @return The created Label.
         */
        @Throws(CreationFailedException::class)
        @JvmStatic
        @JvmOverloads
        fun create(text: String, color: Color = Color.WHITE, x: Float, y: Float, z: Float, worldId:
                    Int = 0, drawDistance: Float = 0f, testLOS: Boolean = false) =
                create(text, color, Location(x, y, z, worldId = worldId), drawDistance, testLOS)

        /**
         * Create a Label with params. If the Creation fails, it will throw a CreationFailedException.
         * @param text The displayed Text.
         * @param color The color of the Label.
         * @param loc Location where the Label should be.
         * @param drawDistance The Drawdistance of the Label.
         * @param testLOS If the Label can be seen through objects.
         * @return The created Label.
         */
        @Throws(CreationFailedException::class)
        @JvmStatic
        @JvmOverloads
        fun create(text: String, color: Color = Color.WHITE, loc: Location = Location(), drawDistance: Float = 50f,
                   testLOS: Boolean = false): Label =
                SampObjectManager.get().createLabel(text, color, loc, drawDistance, testLOS)
    }
}

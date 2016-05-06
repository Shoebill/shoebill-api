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
import net.gtaun.shoebill.constant.ObjectMaterialSize
import net.gtaun.shoebill.constant.ObjectMaterialTextAlign
import net.gtaun.shoebill.data.Color
import net.gtaun.shoebill.data.Location
import net.gtaun.shoebill.data.Vector3D
import net.gtaun.shoebill.exception.CreationFailedException

/**
 * This class contains functions and methods to handle game objects.
 *
 * @author MK124
 * @author Marvin Haschker
 */
abstract class SampObject : Destroyable, Proxyable<SampObject> {

    abstract val id: Int
    abstract val modelId: Int
    abstract val speed: Float
    abstract val drawDistance: Float

    abstract val attachedPlayer: Player?
    abstract val attachedObject: SampObject?
    abstract val attachedVehicle: Vehicle?

    abstract var location: Location
    abstract fun setLocation(pos: Vector3D)

    abstract var rotation: Vector3D
    abstract fun setRotation(rx: Float, ry: Float, rz: Float)

    abstract val isMoving: Boolean
    abstract fun move(x: Float, y: Float, z: Float, speed: Float): Int
    abstract fun move(x: Float, y: Float, z: Float, speed: Float, rx: Float, ry: Float, rz: Float): Int
    abstract fun move(pos: Vector3D, speed: Float): Int
    abstract fun move(pos: Vector3D, speed: Float, rot: Vector3D): Int
    abstract fun stop()

    abstract fun attach(player: Player, x: Float, y: Float, z: Float, rx: Float, ry: Float, rz: Float)
    abstract fun attach(player: Player, offset: Vector3D, rot: Vector3D)

    abstract fun attach(`object`: SampObject, x: Float, y: Float, z: Float, rx: Float, ry: Float, rz: Float, isSyncRotation: Boolean)
    abstract fun attach(`object`: SampObject, offset: Vector3D, rot: Vector3D, isSyncRotation: Boolean)

    abstract fun attach(vehicle: Vehicle, x: Float, y: Float, z: Float, rx: Float, ry: Float, rz: Float)
    abstract fun attach(vehicle: Vehicle, offset: Vector3D, rot: Vector3D)

    abstract fun attachCamera(player: Player)

    abstract fun setMaterial(materialIndex: Int, modelId: Int, txdName: String, textureName: String, materialColor: Color)
    abstract fun setMaterial(materialIndex: Int, modelId: Int, txdName: String, textureName: String)

    abstract fun setMaterialText(text: String, materialIndex: Int, materialSize: ObjectMaterialSize, fontFace: String, fontSize: Int, isBold: Boolean, fontColor: Color, backColor: Color, textAlignment: ObjectMaterialTextAlign)
    abstract fun setMaterialText(text: String)

    //int getObjectModel(); // not needed
    abstract fun setNoCameraCol()

    companion object : Collectable<SampObject>, Findable<Int, SampObject> {

        /**
         * Invalid ID for a [SampObject].
         */
        @JvmField
        val INVALID_ID = 0xFFFF

        /**
         * Gets all available [SampObject]s.
         */
        @JvmStatic
        override fun get(): Collection<SampObject> = SampObjectManager.get().objects

        /**
         * Gets a [SampObject] by it's [id].
         */
        @JvmStatic
        override operator fun get(value: Int): SampObject? = SampObjectManager.get().getObject(value)

        /**
         * Create a SampObject with params. If the Creation fails, it will throw a CreationFailedException.
         * @param modelId Modelid of the Object.
         * @param loc Location where the Object should be.
         * @param rot The Rotation of the Object.
         * @param drawDistance The Drawdistance of the Object.
         * @return The created SampObject.
         */
        @Throws(CreationFailedException::class)
        @JvmStatic
        @JvmOverloads
        fun create(modelId: Int, loc: Location, rot: Vector3D = Vector3D(), drawDistance: Float = 250f): SampObject =
                SampObjectManager.get().createObject(modelId, loc, rot, drawDistance)

        /**
         * Create a SampObject with params. If the Creation fails, it will throw a CreationFailedException.
         * @param modelId Modelid of the Object.
         * @param x X-Pos where the Object should be.
         * @param y Y-Pos where the Object should be.
         * @param z Z-Pos where the Object should be.
         * @param rx Rotation-X where the Object should be.
         * @param ry Rotation-Y where the Object should be.
         * @param rz Rotation-Z where the Object should be.
         * @param drawDistance The Drawdistance of the Object.
         * @return The created SampObject.
         */
        @Throws(CreationFailedException::class)
        @JvmStatic
        @JvmOverloads
        fun create(modelId: Int, x: Float, y: Float, z: Float, rx: Float = 0f, ry: Float = 0f, rz: Float = 0f,
                   drawDistance: Float = 250f): SampObject =
                create(modelId, Location(x, y, z), Vector3D(rx, ry, rz), drawDistance)
    }
}

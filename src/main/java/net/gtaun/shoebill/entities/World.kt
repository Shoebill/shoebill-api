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
import net.gtaun.shoebill.constant.PlayerMarkerMode
import net.gtaun.shoebill.constant.WeaponModel
import net.gtaun.shoebill.constant.Weather
import net.gtaun.shoebill.data.Location
import net.gtaun.shoebill.data.SpawnInfo
import net.gtaun.shoebill.data.Vector3D
import net.gtaun.shoebill.data.WeaponData

/**
 * This class allows you to control the game world, such as weather or chat radius.
 *
 * @author MK124
 * @author Marvin Haschker
 */
abstract class World : Proxyable<World> {

    abstract fun addPlayerClass(modelId: Int, x: Float, y: Float, z: Float, angle: Float, weapon1: Int, ammo1: Int,
                                weapon2: Int, ammo2: Int, weapon3: Int, ammo3: Int): Int

    abstract fun addPlayerClass(teamId: Int, modelId: Int, x: Float, y: Float, z: Float, angle: Float, weapon1: Int,
                                ammo1: Int, weapon2: Int, ammo2: Int, weapon3: Int, ammo3: Int): Int

    abstract fun addPlayerClass(modelId: Int, position: Vector3D, angle: Float, weapon1: WeaponModel, ammo1: Int,
                                weapon2: WeaponModel, ammo2: Int, weapon3: WeaponModel, ammo3: Int): Int

    abstract fun addPlayerClass(teamId: Int, modelId: Int, position: Vector3D, angle: Float, weapon1: WeaponModel,
                                ammo1: Int, weapon2: WeaponModel, ammo2: Int, weapon3: WeaponModel, ammo3: Int): Int

    abstract fun addPlayerClass(modelId: Int, position: Vector3D, angle: Float, weapon1: WeaponData,
                                weapon2: WeaponData, weapon3: WeaponData): Int

    abstract fun addPlayerClass(teamId: Int, modelId: Int, position: Vector3D, angle: Float, weapon1: WeaponData,
                                weapon2: WeaponData, weapon3: WeaponData): Int

    abstract fun addPlayerClass(spawnInfo: SpawnInfo): Int

    abstract var teamCount: Int

    abstract var chatRadius: Float

    abstract var playerMarkerRadius: Float

    abstract var weather: Weather

    abstract var gravity: Float

    abstract fun setWorldTime(hour: Int)

    abstract var nameTagDrawDistance: Float

    abstract fun showNameTags(enabled: Boolean)

    abstract fun showPlayerMarkers(mode: PlayerMarkerMode)

    @Deprecated("")
    abstract fun enableTirePopping(enabled: Boolean)

    abstract fun enableVehicleFriendlyFire()

    @Deprecated("")
    abstract fun allowInteriorWeapons(allow: Boolean)

    abstract fun createExplosion(location: Location, type: Int, radius: Float)

    @Deprecated("")
    abstract fun enableZoneNames(enabled: Boolean)

    abstract fun usePlayerPedAnims()

    abstract fun disableInteriorEnterExits()
    abstract fun disableNameTagLOS()

    // Global player methods
    abstract fun enableStuntBonusForAll(enabled: Boolean)

    // Global vehicle methods
    abstract fun manualEngineAndLights()

    /**
     * Sets the default camera collision behaviour of new objects
     * @param disable If new objects should collide with objects
     */
    abstract fun setObjectsDefaultCameraCol(disable: Boolean)

    companion object {
        @JvmStatic
        fun get(): World = SampObjectManager.get().world
    }
}

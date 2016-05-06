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

package net.gtaun.shoebill.data

import net.gtaun.shoebill.constant.WeaponModel
import org.apache.commons.lang3.builder.EqualsBuilder
import org.apache.commons.lang3.builder.HashCodeBuilder
import org.apache.commons.lang3.builder.ToStringBuilder
import org.apache.commons.lang3.builder.ToStringStyle

/**
 * This class wraps the SpawnInfo and should be used with addPlayerClass and setPlayerSpawnInfo.
 *
 * @author MK124
 * @author Marvin Haschker
 */
class SpawnInfo : Cloneable {
    val location: AngledLocation

    val skinId: Int
    val teamId: Int
    val weapon1: WeaponData
    val weapon2: WeaponData
    val weapon3: WeaponData

    @JvmOverloads
    constructor(x: Float = 0f, y: Float = 0f, z: Float = 0f, interiorId: Int = 0, worldId: Int = 0, angle: Float = 0f,
                skin: Int = 0, team: Int = 0, weapon1: WeaponData = WeaponData(), weapon2: WeaponData = WeaponData(),
                weapon3: WeaponData = WeaponData()) {
        location = AngledLocation(x, y, z, interiorId, worldId, angle)
        this.skinId = skin
        this.teamId = team
        this.weapon1 = weapon1
        this.weapon2 = weapon2
        this.weapon3 = weapon3
    }

    @JvmOverloads
    constructor(vec: Vector3D, interiorId: Int = 0, worldId: Int = 0, angle: Float = 0f, skin: Int = 0, team: Int = 0,
                weapon1: WeaponData = WeaponData(), weapon2: WeaponData = WeaponData(),
                weapon3: WeaponData = WeaponData()) :
        this(vec.x, vec.y, vec.z, interiorId, worldId, angle, skin, team, weapon1, weapon2, weapon3)

    @JvmOverloads
    constructor(loc: Location, angle: Float = 0f, skin: Int = 0, team: Int = 0, weapon1: WeaponData = WeaponData(),
                weapon2: WeaponData = WeaponData(), weapon3: WeaponData = WeaponData()) :
        this(loc.x, loc.y, loc.z, loc.interiorId, loc.worldId, angle, skin, team, weapon1, weapon2, weapon3)

    @JvmOverloads
    constructor(loc: AngledLocation, skin: Int = 0, team: Int = 0, weapon1: WeaponData = WeaponData(WeaponModel.NONE,
     0), weapon2: WeaponData = WeaponData(WeaponModel.NONE, 0), weapon3: WeaponData = WeaponData(WeaponModel.NONE, 0)) :
        this(loc.x, loc.y, loc.z, loc.interiorId, loc.worldId, loc.angle, skin, team, weapon1,
                weapon2, weapon3)

    constructor(info: SpawnInfo) :
        this(info.location, info.skinId, info.teamId, info.weapon1, info.weapon2, info.weapon3)

    override fun hashCode(): Int = HashCodeBuilder.reflectionHashCode(492876847, 715225739, this, false)
    override fun equals(other: Any?): Boolean = EqualsBuilder.reflectionEquals(this, other, false)
    public override fun clone(): SpawnInfo = super.clone() as SpawnInfo
    override fun toString(): String = ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE, false)
}

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

import org.apache.commons.lang3.builder.EqualsBuilder
import org.apache.commons.lang3.builder.HashCodeBuilder
import org.apache.commons.lang3.builder.ToStringBuilder
import org.apache.commons.lang3.builder.ToStringStyle

/**
 * This class contains coordinates for X, Y, Z, World, Interior and Angle. It also has basic position checking.
 *
 * @author MK124
 * @author Marvin Haschker
 */
class AngledLocation : Location, Cloneable {

    var angle: Float = 0f

    @JvmOverloads
    constructor(x: Float = 0f, y: Float = 0f, z: Float = 0f, interiorId: Int = 0, worldId: Int = 0, angle: Float = 0f)
        : super(x, y, z, interiorId, worldId) {
        this.angle = angle
    }

    constructor(pos: Vector3D, worldId: Int, angle: Float) : this(pos.x, pos.y, pos.z, 0, worldId, angle)
    constructor(pos: Vector3D, interiorId: Int, worldId: Int, angle: Float) : this(pos.x, pos.y, pos.z, interiorId,
            worldId, angle)
    constructor(loc: Location, angle: Float) : this(loc.x, loc.y, loc.z, loc.interiorId, loc.worldId, angle)
    constructor(loc: AngledLocation) : this(loc.x, loc.y, loc.z, loc.interiorId, loc.worldId, loc.angle)

    /**
     * Sets the position of the location to the [x], [y], [z], [interiorId], [worldId] and [angle].
     */
    @JvmOverloads
    fun set(x: Float = this.x, y: Float = this.y, z: Float = this.z, interiorId: Int = this.interiorId,
            worldId: Int = this.worldId, angle: Float = this.angle) {
        super.set(x, y, z, interiorId, worldId)
        this.angle = angle
    }

    /**
     * Sets the position of the location to the [pos], [interiorId] [worldId] and [angle]
     */
    @JvmOverloads
    fun set(pos: Vector3D, interiorId: Int, worldId: Int = this.worldId, angle: Float = this.angle) =
            set(pos.x, pos.y, pos.z, interiorId, worldId, angle)

    /**
     * Sets the location to the [loc] parameter.
     */
    fun set(loc: AngledLocation) = set(loc.x, loc.y, loc.z, loc.interiorId, loc.worldId, loc.angle)

    override fun toLegibleString(): String {
        return String.format("%f, %f, %f, %d, %d, %f", x, y, z, interiorId, worldId, angle)
    }

    override fun hashCode(): Int {
        return HashCodeBuilder.reflectionHashCode(179424691, 198491317, this, false)
    }

    override fun equals(other: Any?): Boolean {
        return EqualsBuilder.reflectionEquals(this, other, false)
    }

    /**
     * Clones the current location into a new object.
     */
    override fun clone(): AngledLocation {
        return super<Location>.clone() as AngledLocation
    }

    override fun toString(): String {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE, false)
    }
}

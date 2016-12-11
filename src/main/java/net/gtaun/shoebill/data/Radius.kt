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

/**
 * This class extends the [Location] class and adds a [radius] property to it. This class should be used with
 * Checkpoints and RaceCheckpoints.
 *
 * @author MK124
 * @author Marvin Haschker
 */
class Radius : Location, Cloneable, RangeCheckable3D {

    @JvmField
    var radius: Float = 0f

    @JvmOverloads
    constructor(x: Float = 0f, y: Float = 0f, z: Float = 0f, radius: Float = 0f, interiorId: Int = 0, worldId: Int =
    0) : super(x, y, z, interiorId, worldId) {
        this.radius = radius
    }

    @JvmOverloads
    constructor(pos: Vector3D, interiorId: Int = 0, worldId: Int = 0, radius: Float = 0f) : this(pos.x, pos.y, pos.z,
            radius, interiorId, worldId)

    @JvmOverloads
    constructor(loc: Location, radius: Float = 0f) : this(loc.x, loc.y, loc.z, radius, loc.interiorId, loc.worldId)

    constructor(loc: Radius) : this(loc.x, loc.y, loc.z, loc.radius, loc.interiorId, loc.worldId)

    /**
     * Sets the location of the radius to [x], [y], [z], [interiorId], [worldId] and [radius].
     */
    @JvmOverloads
    fun set(x: Float = this.x, y: Float = this.y, z: Float = this.z, interiorId: Int = this.interiorId,
            worldId: Int = this.worldId, radius: Float = this.radius) {
        super.set(x, y, z, interiorId, worldId)
        this.radius = radius
    }

    /**
     * Sets the location of the radius to [pos], [interiorId] [worldId] and [radius].
     */
    @JvmOverloads
    fun set(pos: Vector3D, interiorId: Int = this.interiorId, worldId: Int = this.worldId,
            radius: Float = this.radius) = set(pos.x, pos.y, pos.z, interiorId, worldId, radius)

    /**
     * Sets the location of the radius to [loc].
     */
    fun set(loc: Radius) = set(loc.x, loc.y, loc.z, loc.interiorId, loc.worldId, loc.radius)

    /**
     * Checks if [pos] is in the range of the radius.
     */
    override fun isInRange(pos: Vector3D): Boolean {
        if (pos is Location) return super.distance(pos) <= radius
        return super.distance(pos) <= radius
    }

    override fun hashCode(): Int = HashCodeBuilder.reflectionHashCode(160481219, 179424673, this, false)
    override fun equals(other: Any?): Boolean = EqualsBuilder.reflectionEquals(this, other, false)
    override fun clone(): Radius = super<Location>.clone() as Radius
}

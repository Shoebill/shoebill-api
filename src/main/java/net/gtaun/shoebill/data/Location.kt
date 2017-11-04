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
 * This class extends Vector3D and allows you to define a world and interior id.
 *
 * @author MK124
 * @author Marvin Haschker
 */
open class Location : Vector3D, Cloneable {

    @JvmField
    var interiorId: Int = 0

    @JvmField
    var worldId: Int = 0

    @JvmOverloads
    constructor(x: Float = 0f, y: Float = 0f, z: Float = 0f, interiorId: Int = 0, worldId: Int = 0) : super(x, y, z) {
        this.interiorId = interiorId
        this.worldId = worldId
    }

    @JvmOverloads
    constructor(pos: Vector3D, interiorId: Int = 0, worldId: Int = 0) : this(pos.x, pos.y, pos.z, interiorId, worldId)
    constructor(loc: Location) : this(loc.x, loc.y, loc.z, loc.interiorId, loc.worldId)

    /**
     * Sets the position of the location to [x], [y], [z], [interiorId] and [worldId].
     */
    @JvmOverloads
    open fun set(x: Float = this.x, y: Float = this.y, z: Float = this.z, interiorId: Int = this.interiorId,
                 worldId: Int = this.worldId) {
        super.set(x, y, z)
        this.interiorId = interiorId
        this.worldId = worldId
    }

    /**
     * Sets the position of the location to [pos], [interiorId] and [worldId].
     */
    @JvmOverloads
    open fun set(pos: Vector3D, interiorId: Int = this.interiorId, worldId: Int = this.worldId) =
            set(pos.x, pos.y, pos.z, interiorId, worldId)

    /**
     * Sets the position of the location to [loc].
     */
    open fun set(loc: Location) = set(loc.x, loc.y, loc.z, loc.interiorId, loc.worldId)

    /**
     * Calculates the distance between the location and [loc].
     */
    open fun distance(loc: Location): Float {
        if (loc.interiorId != interiorId || loc.worldId != worldId) return java.lang.Float.POSITIVE_INFINITY
        return super.distance(loc)
    }

    override fun toLegibleString(): String = String.format("%f, %f, %f, %d, %d", x, y, z, interiorId, worldId)
    override fun hashCode(): Int = HashCodeBuilder.reflectionHashCode(198491329,
            217645177, this, false)
    override fun equals(other: Any?): Boolean = EqualsBuilder.reflectionEquals(this, other, false)
    override fun clone(): Location = super<Vector3D>.clone() as Location
}

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
 * This class provides an 3D Area implementation with [minX] [minY] [minZ] and [maxX] [maxY] [maxZ].
 *
 * @author MK124
 * @author Marvin Haschker
 */
class Area3D : Area, Cloneable, RangeCheckable3D {

    @JvmField
    var minZ: Float = 0f

    @JvmField
    var maxZ: Float = 0f

    /**
     * The volume of the three-dimensional area.
     */
    val volume: Float
        get() = (maxX - minX) * (maxY - maxY) * (maxZ - minZ)

    @JvmOverloads
    constructor(minX: Float = 0f, minY: Float = 0f, minZ: Float = 0f, maxX: Float = 0f, maxY: Float = 0f,
                maxZ: Float = 0f) : super(minX, minY, maxX, maxY) {
        this.minZ = minZ
        this.maxZ = maxZ
    }

    @JvmOverloads
    constructor(area: Area, minZ: Float = 0f, maxZ: Float = 0f) :
    this(area.minX, area.minY, minZ, area.maxX, area.maxY, maxZ)

    constructor(area: Area3D) : this(area.minX, area.minY, area.minZ, area.maxX, area.maxY, area.maxZ)

    /**
     * Sets the location of the area to [minX], [minY], [minZ], [maxX], [maxY] and [maxZ].
     */
    @JvmOverloads
    fun set(minX: Float = this.minX, minY: Float = this.minY, minZ: Float = this.minZ, maxX: Float = this.maxX,
            maxY: Float = this.maxY, maxZ: Float = this.maxZ) {
        this.minX = minX
        this.minY = minY
        this.minZ = minZ
        this.maxX = maxX
        this.maxY = maxY
        this.maxZ = maxZ
    }

    /**
     * Sets the location of the area to [area], [minZ] and [maxZ].
     */
    @JvmOverloads
    fun set(area: Area, minZ: Float = this.minZ, maxZ: Float = this.maxZ) = set(area.minX, area.minY, minZ, area.maxX,
            area.maxY, maxZ)

    /**
     * Sets the location of the area to [area].
     */
    fun set(area: Area3D) = set(area.minX, area.minY, area.minZ, area.maxX, area.maxY, area.maxZ)

    /**
     * Checks if [pos] is in the area.
     */
    override fun isInRange(pos: Vector3D): Boolean {
        val z = pos.z
        if (super.isInRange(pos) == false) return false
        if (z < minZ || z > maxZ) return false
        return true
    }

    override fun hashCode(): Int = HashCodeBuilder.reflectionHashCode(256203221, 275604541, this, false)
    override fun equals(other: Any?): Boolean = EqualsBuilder.reflectionEquals(this, other, false)

    /**
     * Copy the area and creates a new one.
     */
    override fun clone(): Area3D = super<Area>.clone() as Area3D
}

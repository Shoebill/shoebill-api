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
 * This class provides and area implementation for two-dimensional areas.
 *
 * @author MK124
 * @author Marvin Haschker
 */
open class Area : Cloneable, RangeCheckable3D {

    @JvmField
    var minX: Float = 0f

    @JvmField
    var minY: Float = 0f

    @JvmField
    var maxX: Float = 0f

    @JvmField
    var maxY: Float = 0f

    val area: Float
        get() = (maxX - minX) * (maxY - minY)

    constructor(minX: Float = 0f, minY: Float = 0f, maxX: Float = 0f, maxY: Float = 0f) {
        this.minX = minX
        this.minY = minY
        this.maxX = maxX
        this.maxY = maxY
    }

    constructor(area: Area) : this(area.minX, area.minY, area.maxX, area.maxY)

    /**
     * Sets the position of the area to [minX], [minY], [maxX] and [maxY].
     */
    @JvmOverloads
    fun set(minX: Float = this.minX, minY: Float = this.minY, maxX: Float = this.maxX, maxY: Float = this.maxY) {
        this.minX = minX
        this.minY = minY
        this.maxX = maxX
        this.maxY = maxY
    }

    /**
     * Sets the position of the area to [area].
     */
    fun set(area: Area) = set(area.minX, area.minY, area.maxX, area.maxY)

    /**
     * Checks if the [pos] is in the area.
     */
    fun isInRange(pos: Vector2D): Boolean = pos.x >= minX && pos.x <= maxX && pos.y >= minY && pos.y <= maxY

    /**
     * Checks if the [pos] is in the area.
     */
    override fun isInRange(pos: Vector3D): Boolean = isInRange(pos as Vector2D)

    override fun hashCode(): Int = HashCodeBuilder.reflectionHashCode(275604547, 295075147, this, false)
    override fun equals(other: Any?): Boolean = EqualsBuilder.reflectionEquals(this, other, false)
    public override fun clone(): Area = super.clone() as Area
    override fun toString(): String = ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE, false)
}

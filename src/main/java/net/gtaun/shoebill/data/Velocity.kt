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
 * This class can calculate a velocity by passing [x], [y] and [z].
 *
 * @author MK124
 * @author Marvin Haschker
 */
class Velocity : Vector3D, Cloneable {

    @JvmOverloads
    constructor(x: Float = 0f, y: Float = 0f, z: Float = 0f) : super(x, y, z)
    constructor(vec: Vector3D) : super(vec)

    /**
     * Gets the two-dimensional velocity.
     */
    fun speed2d(): Float = Math.sqrt((x * x + y * y).toDouble()).toFloat()

    /**
     * Gets the three-dimensional velocity.
     */
    fun speed3d(): Float = Math.sqrt(x * x + y * y + z * z.toDouble()).toFloat()
    fun angle2d(): Float = Math.acos((x / Math.abs(speed2d())).toDouble()).toFloat()
    fun angleZ(): Float = Math.acos((z / Math.abs(speed3d())).toDouble()).toFloat()

    override fun hashCode(): Int = HashCodeBuilder.reflectionHashCode(413158523, 941083981, this, false)
    override fun equals(other: Any?): Boolean = EqualsBuilder.reflectionEquals(this, other, false)
    override fun clone(): Velocity = super<Vector3D>.clone() as Velocity
    override fun toString(): String = ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE, false)
}

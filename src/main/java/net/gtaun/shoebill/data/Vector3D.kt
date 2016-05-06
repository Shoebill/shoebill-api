/**
 * Copyright (C) 2011 JoJLlmAn
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
 * This class is made for three-dimensional positions and contains a [x], [y] and [z] coordinate.
 *
 * @author JoJLlmAn
 * @author Marvin Haschker
 */
open class Vector3D : Vector2D, Cloneable {

    var z: Float = 0f

    @JvmOverloads
    constructor(x: Float = 0f, y: Float = 0f, z: Float = 0f) : super(x, y) {
        this.z = z
    }

    constructor(vec: Vector2D, z: Float) : this(vec.x, vec.y, z)
    constructor(vec: Vector3D) : this(vec.x, vec.y, vec.z)

    /**
     * Sets the position of the vector to [x], [y], [z].
     */
    @JvmOverloads
    fun set(x: Float = this.x, y: Float = this.y, z: Float = this.z) {
        super.set(x, y)
        this.z = z
    }

    /**
     * Sets the position of the vector to [vec] and [z].
     */
    fun set(vec: Vector2D, z: Float) = set(vec.x, vec.y, z)

    /**
     * Sets the position of the vector to [vec].
     */
    fun set(vec: Vector3D) = set(vec.x, vec.y, vec.z)

    /**
     * Calculates the distance between [pos] and the vector.
     */
    fun distance(pos: Vector3D): Float {
        val dx = pos.x - x
        val dy = pos.y - y
        val dz = pos.z - z
        return Math.sqrt(dx * dx + dy * dy + dz * dz.toDouble()).toFloat()
    }

    override fun add(`val`: Float): Vector3D {
        super.add(`val`)
        z += `val`
        return this
    }

    fun add(vec: Vector3D): Vector3D {
        super.add(vec)
        z += vec.z
        return this
    }

    override fun minus(`val`: Float): Vector3D {
        super.minus(`val`)
        z -= `val`
        return this
    }

    operator fun minus(vec: Vector3D): Vector3D {
        super.minus(vec)
        z -= vec.z
        return this
    }

    override fun mul(`val`: Float): Vector3D {
        super.mul(`val`)
        z *= `val`
        return this
    }

    fun mul(vec: Vector3D): Vector3D {
        super.mul(vec)
        z *= vec.z
        return this
    }

    override fun div(`val`: Float): Vector3D {
        super.div(`val`)
        z /= `val`
        return this
    }

    operator fun div(vec: Vector3D): Vector3D {
        super.div(vec)
        z /= vec.z
        return this
    }

    fun blend(vec: Vector3D, factor: Float): Vector3D {
        super.blend(vec, factor)
        val f = 1.0f - factor
        z = z * f + vec.z * factor
        return this
    }

    override fun toLegibleString(): String = String.format("%f, %f, %f", x, y, z)
    override fun hashCode(): Int = HashCodeBuilder.reflectionHashCode(49979693, 573259433, this, false)
    override fun equals(other: Any?): Boolean = EqualsBuilder.reflectionEquals(this, other, false)
    override fun clone(): Vector3D = super<Vector2D>.clone() as Vector3D
    override fun toString(): String = ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE, false)
}

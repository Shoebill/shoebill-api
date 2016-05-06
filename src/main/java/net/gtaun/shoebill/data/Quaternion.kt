/**
 * Copyright (C) 2011 JoJLlmAn

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
 * @author JoJLlmAn
 */
class Quaternion : Vector3D, Cloneable {

    var w: Float = 0f
    val conjugate: Quaternion
        get() = Quaternion(-x, -y, -z, w)

    @JvmOverloads
    constructor(x: Float = 0f, y: Float = 0f, z: Float = 0f, w: Float = 0f) : super(x, y, z) {
        this.w = w
    }
    constructor(vec: Vector3D, w: Float) : this(vec.x, vec.y, vec.z, w)
    constructor(quaternion: Quaternion) : this(quaternion.x, quaternion.y, quaternion.z, quaternion.w)

    /**
     * Sets the location of the [Quaternion] to [x], [y], [z] and [w].
     */
    @JvmOverloads
    fun set(x: Float = this.x, y: Float = this.y, z: Float = this.z, w: Float = this.z) {
        super.set(x, y, z)
        this.w = w
    }

    /**
     * Sets the location of the [Quaternion] to [vec] and [w].
     */
    @JvmOverloads
    fun set(vec: Vector3D, w: Float = this.w) = set(vec.x, vec.y, vec.z, w)

    /**
     * Sets the location of the [Quaternion] to [quaternion].
     */
    fun set(quaternion: Quaternion) = set(quaternion.x, quaternion.y, quaternion.z, quaternion.w)

    fun transformMatrix(): Array<FloatArray> {
        val matrix = Array(4) { FloatArray(4) }
        val x = x
        val y = y
        val z = z

        matrix[0][0] = 1 - 2 * (y * y + z * z)
        matrix[0][1] = 2 * (x * y - w * z)
        matrix[0][2] = 2 * (w * y + x * z)
        matrix[0][3] = 0f

        matrix[1][0] = 2 * (x * y + w * z)
        matrix[1][1] = 1 - 2 * (x * x + z * z)
        matrix[1][2] = 2 * (y * z - w * x)
        matrix[1][3] = 0f

        matrix[2][0] = 2 * (x * z - w * y)
        matrix[2][1] = 2 * (y * z + w * x)
        matrix[2][2] = 1 - 2 * (x * x + y * y)
        matrix[2][3] = 0f

        matrix[3][0] = 0f
        matrix[3][1] = 0f
        matrix[3][2] = 0f
        matrix[3][3] = 1f

        return matrix
    }

    fun rotatedMatrix(dx: Float, dy: Float, dz: Float, angle: Double): FloatArray {
        val x = x
        val y = y
        val z = z
        val w = Math.cos(angle / 2).toFloat()

        val matrix = Array(3) { FloatArray(3) }

        matrix[0][0] = 1 - 2 * (y * y + z * z)
        matrix[0][1] = 2 * (x * y - w * z)
        matrix[0][2] = 2 * (w * y + x * z)

        matrix[1][0] = 2 * (x * y + w * z)
        matrix[1][1] = 1 - 2 * (x * x + z * z)
        matrix[1][2] = 2 * (y * z - w * x)

        matrix[2][0] = 2 * (x * z - w * y)
        matrix[2][1] = 2 * (y * z + w * x)
        matrix[2][2] = 1 - 2 * (x * x + y * y)

        val rotated = FloatArray(3)

        rotated[0] = dx * matrix[0][0] + dy * matrix[0][1] + dz * matrix[0][2]
        rotated[1] = dx * matrix[1][0] + dy * matrix[1][1] + dz * matrix[1][2]
        rotated[2] = dx * matrix[2][0] + dy * matrix[2][1] + dz * matrix[2][2]

        return rotated
    }

    override fun hashCode(): Int = HashCodeBuilder.reflectionHashCode(295075147, 633910099, this, false)
    override fun equals(other: Any?): Boolean = EqualsBuilder.reflectionEquals(this, other, false)
    override fun clone(): Quaternion = super<Vector3D>.clone() as Quaternion
    override fun toString(): String = ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE, false)
}

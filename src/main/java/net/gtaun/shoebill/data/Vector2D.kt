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

/**
 * This class is for two-dimensional positions and contains a [x] and [y] coordinate.
 *
 * @author JoJLlmAn
 * @author Marvin Haschker
 */
open class Vector2D : Cloneable {

    @JvmField
    var x: Float = 0f

    @JvmField
    var y: Float = 0f

    @JvmOverloads
    constructor(x: Float = 0f, y: Float = 0f) {
        this.x = x
        this.y = y
    }

    constructor(vec: Vector2D) : this(vec.x, vec.y)

    /**
     * Sets the position of the vector to [x] and [y].
     */
    @JvmOverloads
    open fun set(x: Float = this.x, y: Float = this.y) {
        this.x = x
        this.y = y
    }

    /**
     * Sets the position of the vector to [vector].
     */
    open fun set(vector: Vector2D) = set(vector.x, vector.y)

    open fun add(`val`: Float): Vector2D {
        x += `val`
        y += `val`
        return this
    }

    open fun add(vec: Vector2D): Vector2D {
        x += vec.x
        y += vec.y
        return this
    }

    open operator fun minus(`val`: Float): Vector2D {
        x -= `val`
        y -= `val`
        return this
    }

    open operator fun minus(vec: Vector2D): Vector2D {
        x -= vec.x
        y -= vec.y
        return this
    }

    open fun mul(`val`: Float): Vector2D {
        x *= `val`
        y *= `val`
        return this
    }

    open fun mul(vec: Vector2D): Vector2D {
        x *= vec.x
        y *= vec.y
        return this
    }

    open operator fun div(`val`: Float): Vector2D {
        x /= `val`
        y /= `val`
        return this
    }

    open operator fun div(vec: Vector2D): Vector2D {
        x /= vec.x
        y /= vec.y
        return this
    }

    open fun blend(vec: Vector2D, factor: Float): Vector2D {
        val f = 1.0f - factor
        x = x * f + vec.x * factor
        y = y * f + vec.y * factor
        return this
    }

    open fun toLegibleString(): String = String.format("%f, %f", x, y)
    override fun hashCode(): Int = HashCodeBuilder.reflectionHashCode(433024253, 472882049, this, false)
    override fun equals(other: Any?): Boolean = EqualsBuilder.reflectionEquals(this, other, false)
    public override fun clone(): Vector2D = super.clone() as Vector2D

}

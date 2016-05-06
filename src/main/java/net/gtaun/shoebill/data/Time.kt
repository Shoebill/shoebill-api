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
 * This class contains an [hour] and a [minute] property for handling time.
 *
 * @author MK124
 * @author Marvin Haschker
 */
class Time : Cloneable {

    var hour: Int
    var minute: Int

    @JvmOverloads
    constructor(hour: Int = 0, minute: Int = 0) {
        this.hour = hour
        this.minute = minute
    }

    constructor(time: Time) : this(time.hour, time.minute)

    /**
     * Sets the time to [hour] and [minute].
     */
    @JvmOverloads
    fun set(hour: Int = this.hour, minute: Int = this.minute) {
        this.hour = hour
        this.minute = minute
    }

    /**
     * Sets the time to [time].
     */
    fun set(time: Time) = set(time.hour, time.minute)

    override fun hashCode(): Int = HashCodeBuilder.reflectionHashCode(67867979, 573259391, this, false)
    override fun equals(other: Any?): Boolean = EqualsBuilder.reflectionEquals(this, other, false)
    public override fun clone(): Time = super.clone() as Time
    override fun toString(): String = ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE, false)
}

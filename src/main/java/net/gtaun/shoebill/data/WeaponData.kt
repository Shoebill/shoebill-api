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

import net.gtaun.shoebill.constant.WeaponModel
import org.apache.commons.lang3.builder.EqualsBuilder
import org.apache.commons.lang3.builder.HashCodeBuilder

/**
 * This class wraps a [WeaponModel] and some [ammo].
 *
 * @author MK124
 * @author Marvin Haschker
 */
class WeaponData : Cloneable {

    @JvmField
    var model: WeaponModel

    @JvmField
    var ammo: Int

    @JvmOverloads
    constructor(type: WeaponModel = WeaponModel.NONE, ammo: Int = 0) {
        this.model = type
        this.ammo = ammo
    }

    constructor(data: WeaponData) : this(data.model, data.ammo)

    /**
     * Sets the [model] and [ammo] to [type] and [ammo].
     */
    @JvmOverloads
    fun set(type: WeaponModel = this.model, ammo: Int = this.ammo) {
        model = type
        this.ammo = ammo
    }

    /**
     * Sets the [model] and [ammo] to [data].
     */
    fun set(data: WeaponData) = set(data.model, data.ammo)

    override fun hashCode(): Int = HashCodeBuilder.reflectionHashCode(275604547, 817504253, this, false)
    override fun equals(other: Any?): Boolean = EqualsBuilder.reflectionEquals(this, other, false)
    public override fun clone(): WeaponData = super.clone() as WeaponData
}

/**
 * Copyright (C) 2011 MK124

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

package net.gtaun.shoebill.event.vehicle

import net.gtaun.shoebill.entities.Vehicle
import net.gtaun.util.event.Disallowable

/**
 * This event will be called when [vehicle] changes it's color.
 *
 * @author MK124
 * @author Marvin Haschker
 */
class VehicleResprayEvent(vehicle: Vehicle, val color1: Int, val color2: Int) : VehicleEvent(vehicle), Disallowable {

    var response = 1
        private set

    override fun disallow() {
        this.response = this.response and 0
        interrupt()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VehicleResprayEvent) return false
        if (!super.equals(other)) return false

        if (color1 != other.color1) return false
        if (color2 != other.color2) return false
        if (response != other.response) return false

        return true
    }

    override fun hashCode(): Int {
        var result = super.hashCode()
        result = 31 * result + color1
        result = 31 * result + color2
        result = 31 * result + response
        return result
    }


}

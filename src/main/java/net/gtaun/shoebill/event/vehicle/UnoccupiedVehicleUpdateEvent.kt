/**
 * Copyright (C) 2014 MK124

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

import net.gtaun.shoebill.data.Location
import net.gtaun.shoebill.data.Vector3D
import net.gtaun.shoebill.entities.Player
import net.gtaun.shoebill.entities.Vehicle
import net.gtaun.util.event.Disallowable

/**
 * This event will be called when an unoccupied [Vehicle] is getting updated.
 *
 * @author JoJLlmAn
 * @author Marvin Haschker
 */
class UnoccupiedVehicleUpdateEvent(vehicle: Vehicle, val player: Player?, val newLocation: Location,
                                   val velocity: Vector3D) : VehicleEvent(vehicle), Disallowable {

    var response = 0
        private set

    override fun disallow() {
        this.response = this.response and 0
        interrupt()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is UnoccupiedVehicleUpdateEvent) return false

        if (player != other.player) return false
        if (newLocation != other.newLocation) return false
        if (velocity != other.velocity) return false
        if (response != other.response) return false

        return true
    }

    override fun hashCode(): Int {
        var result = player?.hashCode() ?: 0
        result = 31 * result + newLocation.hashCode()
        result = 31 * result + velocity.hashCode()
        result = 31 * result + response
        return result
    }


}

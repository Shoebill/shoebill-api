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

import net.gtaun.shoebill.entities.Player
import net.gtaun.shoebill.entities.Vehicle

/**
 * This event will be called when [player] is starting to enter [vehicle].
 *
 * @author MK124
 * @author Marvin Haschker
 */
class VehicleEnterEvent(vehicle: Vehicle, val player: Player, val isPassenger: Boolean) : VehicleEvent(vehicle) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VehicleEnterEvent) return false

        if (player != other.player) return false
        if (isPassenger != other.isPassenger) return false

        return true
    }

    override fun hashCode(): Int {
        var result = player.hashCode()
        result = 31 * result + isPassenger.hashCode()
        return result
    }


}

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

package net.gtaun.shoebill.event.player

import net.gtaun.shoebill.entities.Pickup
import net.gtaun.shoebill.entities.Player

/**
 * This event represents the OnPlayerPickup of Pawn.
 *
 * @author MK124
 * @author Marvin Haschker
 * @see [OnPlayerPickup](https://wiki.sa-mp.com/wiki/OnPlayerPickup)
 */
class PlayerPickupEvent(player: Player,
                        /**
                         * The associated Pickup for this event.
                         */
                        val pickup: Pickup) : PlayerEvent(player) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PlayerPickupEvent) return false
        if (!super.equals(other)) return false

        if (pickup != other.pickup) return false

        return true
    }

    override fun hashCode(): Int {
        var result = super.hashCode()
        result = 31 * result + pickup.hashCode()
        return result
    }


}

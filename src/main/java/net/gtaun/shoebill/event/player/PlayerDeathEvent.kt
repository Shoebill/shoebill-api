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

import net.gtaun.shoebill.constant.WeaponModel
import net.gtaun.shoebill.entities.Player
import net.gtaun.util.event.Interruptable

/**
 * This event represents the OnPlayerDeath of Pawn.
 *
 * @author MK124
 * @author Marvin Haschker
 * @see [OnPlayerDeath](https://wiki.sa-mp.com/wiki/OnPlayerDeath)
 */
class PlayerDeathEvent(player: Player,
                       /**
                        * The associated killer for this event.
                        */
                       val killer: Player?,
                       /**
                        * The associated WeaponModel the killer used for this event.
                        */
                       val reason: WeaponModel) : PlayerEvent(player), Interruptable {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PlayerDeathEvent) return false

        if (killer != other.killer) return false
        if (reason != other.reason) return false

        return true
    }

    override fun hashCode(): Int {
        var result = killer?.hashCode() ?: 0
        result = 31 * result + reason.hashCode()
        return result
    }

}

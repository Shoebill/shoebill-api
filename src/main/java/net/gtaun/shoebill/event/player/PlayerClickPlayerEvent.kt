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

import net.gtaun.shoebill.constant.ClickPlayerSource
import net.gtaun.shoebill.entities.Player

/**
 * This event represents the OnPlayerClickPlayer of Pawn.
 *
 * @author MK124
 * @author Marvin Haschker
 * @see [OnPlayerClickPlayer](https://wiki.sa-mp.com/wiki/OnPlayerClickPlayer)
 */
class PlayerClickPlayerEvent(player: Player,
                             /**
                              * The clicked player of this event
                              */
                             val clickedPlayer: Player, source: Int) : PlayerEvent(player) {
    /**
     * The associated ClickPlayerSource the player clicked
     */
    val source = ClickPlayerSource[source]

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PlayerClickPlayerEvent) return false

        if (clickedPlayer != other.clickedPlayer) return false
        if (source != other.source) return false

        return true
    }

    override fun hashCode(): Int {
        var result = clickedPlayer.hashCode()
        result = 31 * result + (source?.hashCode() ?: 0)
        return result
    }

}

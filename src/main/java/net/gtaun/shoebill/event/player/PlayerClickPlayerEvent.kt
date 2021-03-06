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
 *
 * @property clickedPlayer The clicked player of this event.
 */
class PlayerClickPlayerEvent(player: Player, val clickedPlayer: Player, source: Int) : PlayerEvent(player) {
    /**
     * The associated ClickPlayerSource the player clicked.
     */
    val source = ClickPlayerSource[source]

}

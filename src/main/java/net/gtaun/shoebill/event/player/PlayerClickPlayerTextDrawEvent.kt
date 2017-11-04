/**
 * Copyright (C) 2012 MK124

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

import net.gtaun.shoebill.entities.Player
import net.gtaun.shoebill.entities.PlayerTextdraw

/**
 * This event represents the OnPlayerClickPlayerTextDraw of Pawn.
 *
 * @author MK124
 * @author Marvin Haschker
 * @see [OnPlayerClickPlayerTextDraw](https://wiki.sa-mp.com/wiki/OnPlayerClickPlayerTextDraw)
 */
class PlayerClickPlayerTextDrawEvent(player: Player,
                                     /**
                                      * The associated and clicked PlayerTextdraw for this event.
                                      */
                                     val playerTextdraw: PlayerTextdraw) : PlayerEvent(player) {
    /**
     * The current response value
     */
    var response = 0
        private set

    /**
     * This method is an alias for the interrupt() method.
     * @see PlayerClickPlayerTextDrawEvent.interrupt
     */
    fun setProcessed() {
        this.response = this.response or 1
        interrupt()
    }

}

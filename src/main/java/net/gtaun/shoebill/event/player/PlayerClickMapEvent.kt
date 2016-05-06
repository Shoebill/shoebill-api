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

import net.gtaun.shoebill.`object`.Player
import net.gtaun.shoebill.data.Vector3D
import net.gtaun.util.event.Interruptable

/**
 * This event represents the OnPlayerClickMap of Pawn.
 *
 * @author MK124
 * @author Marvin Haschker
 * @see net.gtaun.shoebill.event.player.PlayerEvent
 * @see [OnPlayerClickMap](https://wiki.sa-mp.com/wiki/OnPlayerClickMap)
 */
class PlayerClickMapEvent(player: Player, x: Float, y: Float, z: Float) : PlayerEvent(player), Interruptable {

    var position: Vector3D = Vector3D(x, y, z)
        get() = position.clone()
        private set

    /*
	 * (non-Javadoc)
	 * @see net.gtaun.util.event.Event#interrupt()
	 */
    override fun interrupt() {
        super.interrupt()
    }

}

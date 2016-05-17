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
import net.gtaun.shoebill.entities.SampObject
import net.gtaun.shoebill.constant.ObjectEditResponse
import net.gtaun.shoebill.data.Location
import net.gtaun.shoebill.data.Vector3D
import net.gtaun.util.event.Interruptable

/**
 * This event represents the OnPlayerEditObject of Pawn.
 *
 * @author MK124
 * @author Marvin Haschker
 * @see [OnPlayerEditObject](https://wiki.sa-mp.com/wiki/OnPlayerEditObject)
 */
class PlayerEditObjectEvent(player: Player,
                            /**
                             * The associated SampObject for this event.
                             */
                            val `object`: SampObject,
                            /**
                             * The associated returned testing for this event.
                             */
                            val editResponse: ObjectEditResponse,
                            /**
                             * The associated new Location for this event.
                             */
                            val newLocation: Location,
                            /**
                             * The associated new rotation for this event.
                             */
                            val newRotation: Vector3D) : PlayerEvent(player), Interruptable {

    /*
     * (non-Javadoc)
     * @see net.gtaun.util.event.Event#interrupt()
     */
    override fun interrupt() {
        super.interrupt()
    }
}

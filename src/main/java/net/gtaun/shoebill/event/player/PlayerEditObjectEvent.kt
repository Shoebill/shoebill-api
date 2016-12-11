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

import net.gtaun.shoebill.constant.ObjectEditResponse
import net.gtaun.shoebill.data.Location
import net.gtaun.shoebill.data.Vector3D
import net.gtaun.shoebill.entities.Player
import net.gtaun.shoebill.entities.SampObject

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
                             * The associated new rotat`ion for this event.
                             */
                            val newRotation: Vector3D) : PlayerEvent(player) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PlayerEditObjectEvent) return false

        if (`object` != other.`object`) return false
        if (editResponse != other.editResponse) return false
        if (newLocation != other.newLocation) return false
        if (newRotation != other.newRotation) return false

        return true
    }

    override fun hashCode(): Int {
        var result = `object`.hashCode()
        result = 31 * result + editResponse.hashCode()
        result = 31 * result + newLocation.hashCode()
        result = 31 * result + newRotation.hashCode()
        return result
    }


}

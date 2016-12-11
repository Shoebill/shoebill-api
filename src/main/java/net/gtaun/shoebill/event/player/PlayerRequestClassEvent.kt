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

import net.gtaun.shoebill.entities.Player
import net.gtaun.util.event.Disallowable

/**
 * This event represents the OnPlayerRequestClass of Pawn.
 *
 * @author MK124
 * @author Marvin Haschker
 * @see [OnPlayerRequestClass](https://wiki.sa-mp.com/wiki/OnPlayerRequestClass)
 */
class PlayerRequestClassEvent(player: Player,
                              /**
                               * The associated id of the requested class for this event.
                               */
                              val classId: Int) : PlayerEvent(player), Disallowable {
    /**
     * The current response value
     */
    var response = 1
        private set

    /**
     * Disallows the further execution of this event in the whole abstract machine (also Pawn and other Plugins).
     */
    override fun disallow() {
        this.response = this.response and 0
        interrupt()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PlayerRequestClassEvent) return false
        if (!super.equals(other)) return false

        if (classId != other.classId) return false
        if (response != other.response) return false

        return true
    }

    override fun hashCode(): Int {
        var result = super.hashCode()
        result = 31 * result + classId
        result = 31 * result + response
        return result
    }


}

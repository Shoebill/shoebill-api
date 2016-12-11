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

package net.gtaun.shoebill.event.checkpoint

import net.gtaun.shoebill.entities.Checkpoint
import net.gtaun.shoebill.entities.Player
import net.gtaun.util.event.Event

/**
 * This abstract event is the base class for every Checkpoint event
 *
 * @author MK124
 * @author Marvin Haschker
 */
open class CheckpointEvent protected constructor(
        /**
         * The associated player for this checkpoint.
         */
        val player: Player,
        /**
         * The related checkpoint for this event.
         */
        val checkpoint: Checkpoint) : Event() {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is CheckpointEvent) return false

        if (player != other.player) return false
        if (checkpoint != other.checkpoint) return false

        return true
    }

    override fun hashCode(): Int {
        var result = player.hashCode()
        result = 31 * result + checkpoint.hashCode()
        return result
    }

}

/**
 * Copyright (C) 2011 JoJLlmAn
 * Copyright (C) 2011-2014 MK124

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

package net.gtaun.shoebill.entities

import net.gtaun.shoebill.constant.RaceCheckpointType
import net.gtaun.shoebill.data.Radius
import java.util.function.Consumer
import java.util.function.Supplier

/**
 * This class has functions and methods to handle [RaceCheckpoint]s.
 *
 * @author MK124
 * @author JoJLlmAn
 * @author Marvin Haschker
 */
abstract class RaceCheckpoint : Checkpoint() {

    abstract val type: RaceCheckpointType
    abstract val next: RaceCheckpoint?

    override fun set(player: Player) {
        player.raceCheckpoint = this
    }

    override fun disable(player: Player) {
        if (player.raceCheckpoint !== this) return
        player.disableRaceCheckpoint()
    }

    override fun isInRange(player: Player): Boolean {
        if (player.raceCheckpoint !== this) return false
        return location.isInRange(player.location)
    }

    override fun update() =
            Player.get().filter { it.raceCheckpoint == this }.forEach { set(it) }

    override val usingPlayers: Collection<Player>
        get() = Player.get().filter({ it.raceCheckpoint === this })

    companion object {
        /**
         * Creates a [RaceCheckpoint].
         */
        @JvmStatic
        fun create(location: Radius, type: RaceCheckpointType, nextSupplier: Supplier<RaceCheckpoint>,
                   onEnter: Consumer<Player>, onLeave: Consumer<Player>): RaceCheckpoint {
            return object : RaceCheckpoint() {
                override val isDestroyed: Boolean
                    get() = eventManagerNode.isDestroyed

                override var location: Radius
                    get() = location
                    set(newLocation) {
                        location.set(newLocation)
                        update()
                    }

                override val type: RaceCheckpointType
                    get() = type

                override val next: RaceCheckpoint
                    get() = nextSupplier.get()

                override fun onEnter(player: Player) {
                    onEnter.accept(player)
                }

                override fun onLeave(player: Player) {
                    onLeave.accept(player)
                }
            }
        }

        /**
         * Creates a [RaceCheckpoint].
         */
        @JvmStatic
        fun create(location: Radius, type: RaceCheckpointType, next: RaceCheckpoint, onEnter: Consumer<Player>,
                   onLeave: Consumer<Player>): RaceCheckpoint =
                create(location, type, Supplier { next }, onEnter, onLeave)
    }
}

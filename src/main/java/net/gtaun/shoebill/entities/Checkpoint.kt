/**
 * Copyright (C) 2011 JoJLlmAn
 * Copyright (C) 2011-2014 MK124
 * Copyright (C) 2016 Marvin Haschker
 *
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.gtaun.shoebill.entities

import net.gtaun.shoebill.data.Radius
import net.gtaun.shoebill.data.Vector3D
import net.gtaun.shoebill.event.checkpoint.CheckpointEnterEvent
import net.gtaun.shoebill.event.checkpoint.CheckpointLeaveEvent
import net.gtaun.util.event.EventHandler
import net.gtaun.util.event.HandlerPriority

/**
 * @author JoJLlmAn
 * @author MK124
 * @author Marvin Haschker
 */
abstract class Checkpoint : Entity() {

    /**
     * The location of the [Checkpoint].
     */
    abstract var location: Radius

    abstract fun onEnter(player: Player)
    abstract fun onLeave(player: Player)

    /**
     * Gets the radius of the [Checkpoint].
     */
    val size: Float
        get() = location.radius

    /**
     * Sets the active [Checkpoint] of [player] to this.
     */
    open fun set(player: Player) {
        player.checkpoint = this
    }

    /**
     * Sets the active [Checkpoint] of [player] to null.
     */
    open fun disable(player: Player) {
        if (player.checkpoint != this) return
        player.checkpoint = null
    }

    /**
     * Checks if the [player] is in range of the [Checkpoint].
     */
    open fun isInRange(player: Player): Boolean = location.isInRange(player.location)

    /**
     * Checks if the [pos] is in range of the [Checkpoint].
     */
    fun isInRange(pos: Vector3D): Boolean = location.isInRange(pos)

    /**
     * Reassigns all checkpoints to update them for the [Player]s.
     */
    open fun update() = Player.get()
            .filter { it.checkpoint == this }
            .forEach { it.checkpoint = this }

    /**
     * Gets all [Player]s that use this [Checkpoint] as their active one.
     */
    open val usingPlayers: Collection<Player>
        get() = Player.get().filter { it.checkpoint == this }

    /**
     * Quick-register Events
     */
    @JvmOverloads
    fun onEnter(handler: EventHandler<CheckpointEnterEvent>, priority: HandlerPriority = HandlerPriority.NORMAL) =
            eventManagerNode.registerHandler(CheckpointEnterEvent::class.java, handler, priority, attention)

    @JvmOverloads
    fun onEnter(handler: (CheckpointEnterEvent) -> Unit, priority: HandlerPriority = HandlerPriority.NORMAL) =
            onEnter(EventHandler { handler(it) }, priority)

    @JvmOverloads
    fun onLeave(handler: EventHandler<CheckpointLeaveEvent>, priority: HandlerPriority = HandlerPriority.NORMAL) =
            eventManagerNode.registerHandler(CheckpointLeaveEvent::class.java, handler, priority, attention)

    @JvmOverloads
    fun onLeave(handler: (CheckpointLeaveEvent) -> Unit, priority: HandlerPriority = HandlerPriority.NORMAL) =
            onLeave(EventHandler { handler(it) }, priority)

    companion object {

        /**
         * Creates a new [Checkpoint] at [location].
         */
        @JvmStatic
        @JvmOverloads
        fun create(location: Radius, onEnter: ((Player) -> Unit)? = null, onLeave: ((Player) -> Unit)? = null): Checkpoint {
            return object : Checkpoint() {
                override val isDestroyed: Boolean
                    get() = eventManagerNode.isDestroyed

                override var location: Radius
                    get() = location
                    set(newLocation) {
                        location.set(newLocation)
                        update()
                    }

                override fun onEnter(player: Player) {
                    onEnter?.invoke(player)
                }

                override fun onLeave(player: Player) {
                    onLeave?.invoke(player)
                }
            }
        }

    }
}

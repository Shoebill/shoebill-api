package net.gtaun.shoebill.event.actor

import net.gtaun.shoebill.entities.Actor
import net.gtaun.util.event.Event

/**
 * Base class for all ActorEvents.
 *
 * @author Marvin Haschker
 */
open class ActorEvent(val actor: Actor) : Event() {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ActorEvent) return false

        if (actor != other.actor) return false

        return true
    }

    override fun hashCode(): Int {
        return actor.hashCode()
    }

}

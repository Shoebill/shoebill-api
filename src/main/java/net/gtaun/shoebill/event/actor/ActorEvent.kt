package net.gtaun.shoebill.event.actor

import net.gtaun.shoebill.entities.Actor
import net.gtaun.util.event.Event

/**
 * Base class for all ActorEvents.
 *
 * @author Marvin Haschker
 */
open class ActorEvent(val actor: Actor) : Event()

package net.gtaun.shoebill.event.actor

import net.gtaun.shoebill.`object`.Actor
import net.gtaun.util.event.Event

/**
 * Base class for all ActorEvents, such as [net.gtaun.shoebill.event.actor.ActorStreamInEvent]
 *
 * @author Marvin Haschker
 * @see net.gtaun.util.event.Event
 */
open class ActorEvent(val actor: Actor) : Event()

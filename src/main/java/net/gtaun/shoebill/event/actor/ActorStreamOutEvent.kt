package net.gtaun.shoebill.event.actor

import net.gtaun.shoebill.entities.Actor
import net.gtaun.shoebill.entities.Player

/**
 * This event represents the OnActorStreamOut event from Pawn.
 *
 * @author Marvin Haschker
 * @see [OnActorStreamOut](https://wiki.sa-mp.com/wiki/OnActorStreamOut)
 *
 * @property player The player for whom the Actor was streamed out.
 */
class ActorStreamOutEvent(actor: Actor, val player: Player) : ActorEvent(actor)

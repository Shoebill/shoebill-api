package net.gtaun.shoebill.event.actor

import net.gtaun.shoebill.`object`.Actor
import net.gtaun.shoebill.`object`.Player

/**
 * This event represents the OnActorStreamIn callback from Pawn.
 *
 * @author Marvin Haschker
 * @see net.gtaun.shoebill.event.actor.ActorEvent
 * @see [OnActorStreamIn](https://wiki.sa-mp.com/wiki/OnActorStreamIn)
 */
class ActorStreamInEvent(actor: Actor,
                         /**
                          * The player for whom the actor was streamed in.
                          */
                         val player: Player) : ActorEvent(actor)

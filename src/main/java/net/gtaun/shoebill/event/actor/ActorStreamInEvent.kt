package net.gtaun.shoebill.event.actor

import net.gtaun.shoebill.entities.Actor
import net.gtaun.shoebill.entities.Player

/**
 * This event represents the OnActorStreamIn callback from Pawn.
 *
 * @author Marvin Haschker
 * @see [OnActorStreamIn](https://wiki.sa-mp.com/wiki/OnActorStreamIn)
 */
class ActorStreamInEvent(actor: Actor,
                         /**
                          * The player for whom the actor was streamed in.
                          */
                         val player: Player) : ActorEvent(actor)

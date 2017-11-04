package net.gtaun.shoebill.event.actor

import net.gtaun.shoebill.entities.Actor
import net.gtaun.shoebill.entities.Player

/**
 * This event represents the OnActorStreamOut event from Pawn.
 *
 * @author Marvin Haschker
 * @see [OnActorStreamOut](https://wiki.sa-mp.com/wiki/OnActorStreamOut)
 */
class ActorStreamOutEvent(actor: Actor,
                          /**
                           * The player for whom the Actor was streamed out.
                           */
                          val player: Player) : ActorEvent(actor)
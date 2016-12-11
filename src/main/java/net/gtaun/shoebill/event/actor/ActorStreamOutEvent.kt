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
                          val player: Player) : ActorEvent(actor) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ActorStreamOutEvent) return false
        if (!super.equals(other)) return false

        if (player != other.player) return false

        return true
    }

    override fun hashCode(): Int {
        var result = super.hashCode()
        result = 31 * result + player.hashCode()
        return result
    }


}

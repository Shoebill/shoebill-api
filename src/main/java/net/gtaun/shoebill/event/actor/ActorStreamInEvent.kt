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
                         val player: Player) : ActorEvent(actor) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ActorStreamInEvent) return false
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

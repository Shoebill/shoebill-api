package net.gtaun.shoebill.event.actor;

import net.gtaun.shoebill.object.Actor;
import net.gtaun.shoebill.object.Player;

/**
 * This event represents the OnActorStreamOut event from Pawn.
 *
 * @author Marvin Haschker
 * @see net.gtaun.shoebill.event.actor.ActorEvent
 * @see <a href="https://wiki.sa-mp.com/wiki/OnActorStreamOut">OnActorStreamOut</a>
 */
public class ActorStreamOutEvent extends ActorEvent {

    private Player player;

    public ActorStreamOutEvent(Actor actor, Player player) {
        super(actor);
        this.player = player;
    }

    /**
     * Returns the player for who the Actor was streamed out.
     *
     * @return Player for who the Actor was streamed out
     */
    public Player getPlayer() {
        return player;
    }
}

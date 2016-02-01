package net.gtaun.shoebill.event.actor;

import net.gtaun.shoebill.object.Actor;
import net.gtaun.shoebill.object.Player;

/**
 * This event represents the OnActorStreamIn callback from Pawn.
 *
 * @author Marvin Haschker
 * @see net.gtaun.shoebill.event.actor.ActorEvent
 * @see <a href="https://wiki.sa-mp.com/wiki/OnActorStreamIn">OnActorStreamIn</a>
 */
public class ActorStreamInEvent extends ActorEvent {

    private Player player;

    public ActorStreamInEvent(Actor actor, Player player) {
        super(actor);
        this.player = player;
    }

    /**
     * Returns the player for whom the actor was streamed in.
     *
     * @return Player for who the actor was streamed in
     */
    public Player getPlayer() {
        return player;
    }
}

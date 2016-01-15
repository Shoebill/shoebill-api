package net.gtaun.shoebill.event.actor;

import net.gtaun.shoebill.object.Actor;
import net.gtaun.util.event.Event;

/**
 * Base class for all ActorEvents, such as {@link net.gtaun.shoebill.event.actor.ActorStreamInEvent}
 *
 * @author Marvin Haschker
 * @see net.gtaun.util.event.Event
 */
public abstract class ActorEvent extends Event {

    private Actor actor;

    public ActorEvent(Actor actor) {
        this.actor = actor;
    }

    public Actor getActor() {
        return actor;
    }
}

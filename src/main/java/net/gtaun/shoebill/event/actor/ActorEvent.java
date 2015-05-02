package net.gtaun.shoebill.event.actor;

import net.gtaun.shoebill.object.Actor;
import net.gtaun.util.event.Event;

/**
 * Created by marvin on 01.05.15 in project shoebill-api.
 * Copyright (c) 2015 Marvin Haschker. All rights reserved.
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

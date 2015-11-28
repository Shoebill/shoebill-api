package net.gtaun.shoebill.event.actor;

import net.gtaun.shoebill.object.Actor;
import net.gtaun.shoebill.object.Player;

/**
 * Created by marvin on 01.05.15 in project shoebill-api.
 * Copyright (c) 2015 Marvin Haschker. All rights reserved.
 */
public class ActorStreamOutEvent extends ActorEvent {

    private Player player;

    public ActorStreamOutEvent(Actor actor, Player player) {
        super(actor);
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }
}

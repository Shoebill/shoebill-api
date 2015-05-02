package net.gtaun.shoebill.event.player;

import net.gtaun.shoebill.constant.WeaponModel;
import net.gtaun.shoebill.object.Actor;
import net.gtaun.shoebill.object.Player;

/**
 * Created by marvin on 01.05.15 in project shoebill-api.
 * Copyright (c) 2015 Marvin Haschker. All rights reserved.
 */
public class PlayerDamageActorEvent extends PlayerEvent {

    private Actor actor;
    private int amount, bodypart;
    private WeaponModel weapon;

    public PlayerDamageActorEvent(Player player, Actor actor, int amount, WeaponModel weapon, int bodypart) {
        super(player);
        this.actor = actor;
        this.amount = amount;
        this.bodypart = bodypart;
        this.weapon = weapon;
    }

    public Actor getActor() {
        return actor;
    }

    public int getAmount() {
        return amount;
    }

    public int getBodypart() {
        return bodypart;
    }

    public WeaponModel getWeapon() {
        return weapon;
    }
}

package net.gtaun.shoebill.event.player;

import net.gtaun.shoebill.constant.WeaponModel;
import net.gtaun.shoebill.object.Actor;
import net.gtaun.shoebill.object.Player;

/**
 * Created by marvin on 01.05.15 in project shoebill-api.
 * Copyright (c) 2015 Marvin Haschker. All rights reserved.
 *
 * This event represents the OnPlayerDamageActor of Pawn.
 * 
 * @author MK124
 * @see net.gtaun.shoebill.event.player.PlayerEvent
 * @see <a href="https://wiki.sa-mp.com/wiki/OnPlayerDamageActor">OnPlayerDamageActor</a>
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
    
    /**
     * @return The associated Actor for this event.
     */
    public Actor getActor() {
        return actor;
    }
    
    /**
     * @return The associated amount of damage for this event.
     */
    public int getAmount() {
        return amount;
    }
    
    /**
     * @return The associated id of hitted bodypart for this event.
     */
    public int getBodypart() {
        return bodypart;
    }
    
    /**
     * @return The associated WeaponModel an issuer used for this event.
     */
    public WeaponModel getWeapon() {
        return weapon;
    }
}

package net.gtaun.shoebill.event.vehicle;

import net.gtaun.shoebill.object.Player;
import net.gtaun.shoebill.object.Vehicle;

/**
 * Created by marvin on 01.05.15 in project shoebill-api.
 * Copyright (c) 2015 Marvin Haschker. All rights reserved.
 */
public class VehicleSirenStateChangeEvent extends VehicleEvent {

    private Player player;
    private boolean newState;

    public VehicleSirenStateChangeEvent(Vehicle vehicle, Player player, boolean newState) {
        super(vehicle);
        this.player = player;
        this.newState = newState;
    }

    public Player getPlayer() {
        return player;
    }

    public boolean getNewState() {
        return newState;
    }

}

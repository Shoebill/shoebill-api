package net.gtaun.shoebill.event.vehicle;

import net.gtaun.shoebill.object.Vehicle;

/**
 * Created by marvin on 01.11.14.
 */
public class VehicleDestroyEvent extends VehicleEvent {
    public VehicleDestroyEvent(Vehicle vehicle) {
        super(vehicle);
    }
}

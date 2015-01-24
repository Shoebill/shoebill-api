package net.gtaun.shoebill.event.vehicle;

import net.gtaun.shoebill.object.Player;
import net.gtaun.shoebill.object.Vehicle;
import net.gtaun.util.event.Interruptable;

/**
 * Created by marvin on 18.09.14.
 */
public class TrailerUpdateEvent extends VehicleEvent implements Interruptable {
    private Player player;
    private int ret = 1;

    public TrailerUpdateEvent(Vehicle trailer, Player player) {
        super(trailer);
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    @Override
    public void interrupt() {
        super.interrupt();
    }

    public void disallow() {
        this.ret &= 0;
    }

    public int getResponse() {
        return ret;
    }
}

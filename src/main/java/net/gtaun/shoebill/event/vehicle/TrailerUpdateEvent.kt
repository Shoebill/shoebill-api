package net.gtaun.shoebill.event.vehicle

import net.gtaun.shoebill.entities.Player
import net.gtaun.shoebill.entities.Vehicle
import net.gtaun.util.event.Disallowable

/**
 * This event is getting called when the trailer of a [Vehicle] is getting updated.
 *
 * @author Marvin Haschker
 */
class TrailerUpdateEvent(trailer: Vehicle, val player: Player) : VehicleEvent(trailer), Disallowable {

    var response = 1
        private set

    override fun disallow() {
        this.response = this.response and 0
        interrupt()
    }

}

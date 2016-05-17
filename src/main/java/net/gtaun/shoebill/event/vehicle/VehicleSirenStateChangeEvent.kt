package net.gtaun.shoebill.event.vehicle

import net.gtaun.shoebill.entities.Player
import net.gtaun.shoebill.entities.Vehicle

/**
 * This event will be called when [vehicle] changes it's siren state.
 *
 * @author Marvin Haschker
 */
class VehicleSirenStateChangeEvent(vehicle: Vehicle, val player: Player, val newState: Boolean) : VehicleEvent(vehicle)

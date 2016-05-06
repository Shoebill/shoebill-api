package net.gtaun.shoebill.event.vehicle

import net.gtaun.shoebill.`object`.Player
import net.gtaun.shoebill.`object`.Vehicle

/**
 * This event will be called when [vehicle] changes it's siren state.
 *
 * @author Marvin Haschker
 */
class VehicleSirenStateChangeEvent(vehicle: Vehicle, val player: Player, val newState: Boolean) : VehicleEvent(vehicle)

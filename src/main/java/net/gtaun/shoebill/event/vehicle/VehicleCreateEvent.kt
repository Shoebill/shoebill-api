package net.gtaun.shoebill.event.vehicle

import net.gtaun.shoebill.`object`.Vehicle

/**
 * This event will be called when a new [Vehicle] has been created.
 *
 * @author Marvin Haschker
 */
class VehicleCreateEvent(vehicle: Vehicle) : VehicleEvent(vehicle)

package net.gtaun.shoebill.constant

/**
 * This enum contains all the possible VehicleTypes. This information was taken from the official SA:MP Wikipedia page.
 *
 * @author MK124
 * @author Marvin Haschker
 */
enum class VehicleType {
    UNKNOWN,
    BICYCLE,
    MOTORBIKE,
    CAR,
    TRAILER,
    REMOTE_CONTROL,
    TRAIN,
    BOAT,
    AIRCRAFT,
    HELICOPTER,
    TANK;

    companion object : Collectable<VehicleType> {
        private val VALUES = values().toList()

        /**
         * Gets all the available [VehicleType]s.
         */
        @JvmStatic
        override fun get(): Collection<VehicleType> = VALUES
    }
}
package net.gtaun.shoebill.constant

/**
 * This enum contains all the possible VehicleTypes. This information was taken from the official SA:MP Wikipedia page.
 *
 * @author MK124
 * @author Marvin Haschker
 */
enum class VehicleType(val id: Int) {
    UNKNOWN(-1),
    BICYCLE(0),
    MOTORBIKE(1),
    CAR(2),
    TRAILER(3),
    REMOTE_CONTROL(4),
    TRAIN(5),
    BOAT(6),
    AIRCRAFT(7),
    HELICOPTER(8),
    TANK(9);

    companion object : Collectable<VehicleType>, Findable<Int, VehicleType> {
        private val VALUES = values().map { it.id to it }.toMap()

        /**
         * Gets all the available [VehicleType]s.
         */
        @JvmStatic
        override fun get(): Collection<VehicleType> = VALUES.values

        /**
         * Gets a [VehicleType] by it's [id].
         */
        @JvmStatic
        override operator fun get(value: Int): VehicleType? = VALUES[value]
    }

}
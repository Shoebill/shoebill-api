package net.gtaun.shoebill.data

/**
 * This class should be used with functions that were introduced in SA:MP 0.3.7.
 *
 * @author Marvin Haschker
 */
class VehicleState @JvmOverloads constructor(@JvmField val driver: Int = 0,
                                             @JvmField val passenger: Int = 0,
                                             @JvmField val backLeft: Int = 0,
                                             @JvmField val backRight: Int = 0) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is VehicleState) return false

        if (driver != other.driver) return false
        if (passenger != other.passenger) return false
        if (backLeft != other.backLeft) return false
        if (backRight != other.backRight) return false

        return true
    }

    override fun hashCode(): Int {
        var result = driver
        result = 31 * result + passenger
        result = 31 * result + backLeft
        result = 31 * result + backRight
        return result
    }


}

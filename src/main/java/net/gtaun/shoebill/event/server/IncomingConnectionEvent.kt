package net.gtaun.shoebill.event.server

import net.gtaun.util.event.Event

/**
 * This event will be called when a new connection is getting established.
 *
 * @author MK124
 * @author Marvin Haschker
 */
class IncomingConnectionEvent(val playerId: Int, val ipAddress: String, val port: Int) : Event() {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is IncomingConnectionEvent) return false

        if (playerId != other.playerId) return false
        if (ipAddress != other.ipAddress) return false
        if (port != other.port) return false

        return true
    }

    override fun hashCode(): Int {
        var result = playerId
        result = 31 * result + ipAddress.hashCode()
        result = 31 * result + port
        return result
    }

}

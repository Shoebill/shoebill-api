package net.gtaun.shoebill.constant

/**
 * This enum contains the possible connection statuses that can be used with NetStats_ConnectionStatus.
 *
 * @author Marvin Haschker
 */
enum class ConnectionStatus(val id: Int) {
    NO_ACTION(0),
    DISCONNECT_ASAP(1),
    DISCONNECT_ASAP_SILENTLY(2),
    DISCONNECT_ON_NO_ACK(3),
    REQUESTED_CONNECTION(4),
    HANDLING_CONNECTION_REQUEST(5),
    UNVERIFIED_SENDER(6),
    SET_ENCRYPTION_ON_MULTIPLE_16_BYTE_PACKET(7),
    CONNECTED(8);

    companion object : Collectable<ConnectionStatus>, Findable<Int, ConnectionStatus> {
        private val VALUES = values().map { it.id to it }.toMap()

        /**
         * Gets a [ConnectionStatus] by its id.
         */
        @JvmStatic
        override operator fun get(value: Int): ConnectionStatus? = VALUES[value]

        /**
         * Gets all available [ConnectionStatus]s.
         */
        @JvmStatic
        override fun get(): Collection<ConnectionStatus> = VALUES.values
    }
}

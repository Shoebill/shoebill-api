package net.gtaun.shoebill.constant

/**
 * This enum contains the possible disconnect reasons for a player's disconnect. This information has been taken from
 * the offical SA:MP Wikipedia page.
 *
 * @author MK124
 * @author Marvin Haschker
 */
enum class DisconnectReason(val value: Int) {
    /**
     * The player timed out, and the disconnect was unwanted.
     */
    TIME_OUT(0),

    /**
     * The player left on his own, and his disconnect was wanted.
     */
    LEFT(1),

    /**
     * The player got kicked or banned by somebody or the console. His disconnect was wanted.
     */
    KICK(2);

    companion object : Collectable<DisconnectReason>, Findable<Int, DisconnectReason> {
        private val VALUES = values().map { it.value to it }.toMap()

        /**
         * Gets a [DisconnectReason] by its id.
         */
        @JvmStatic
        override operator fun get(value: Int): DisconnectReason? = VALUES[value]

        /**
         * Gets all available [DisconnectReason]s.
         */
        @JvmStatic
        override fun get(): Collection<DisconnectReason> = VALUES.values
    }
}

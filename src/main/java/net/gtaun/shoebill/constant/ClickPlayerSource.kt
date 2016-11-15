package net.gtaun.shoebill.constant

/**
 * This enum defines the possible sources for the PlayerClick event.
 * This information has been taken from the official SA:MP Wikipedia page.
 *
 * @author MK124
 * @author Marvin Haschker
 */
enum class ClickPlayerSource constructor(val value: Int) {
    SCOREBOARD(0);

    companion object : Collectable<ClickPlayerSource>, Findable<Int, ClickPlayerSource> {
        private val VALUES = values().map { it.value to it }.toMap()

        /**
         * Gets a [ClickPlayerSource] by its id.
         */
        @JvmStatic
        override operator fun get(value: Int): ClickPlayerSource? = VALUES[value]

        /**
         * Gets all available [ClickPlayerSource]s.
         */
        @JvmStatic
        override fun get(): Collection<ClickPlayerSource> = VALUES.values
    }
}

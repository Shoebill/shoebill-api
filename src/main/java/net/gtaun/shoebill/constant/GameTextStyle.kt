package net.gtaun.shoebill.constant

/**
 * This enum contains the possible styles for a GameText. This information has been taken from the offical SA:MP
 * Wikipedia page.
 *
 * @author MK124
 * @author Marvin Haschker
 */
enum class GameTextStyle private constructor(val value: Int) {
    NORMALE_MIDDLE(0),
    NORMAL_BOTTOM_RIGHT(1),
    GHETTO_MIDDLE(2),
    THIN_MIDDLE(3),
    THIN_MIDDLE_TOP(4),
    WHITE_THIN_CENTER(5),
    THICK_TOP(6);

    companion object : Collectable<GameTextStyle>, Findable<Int, GameTextStyle> {
        private val VALUES = values().map { it.value to it }.toMap()

        /**
         * Gets a [GameTextStyle] by its id.
         */
        @JvmStatic
        override operator fun get(value: Int): GameTextStyle? = VALUES[value]

        /**
         * Gets all available [GameTextStyle]s.
         */
        @JvmStatic
        override fun get(): Collection<GameTextStyle> = VALUES.values
    }
}

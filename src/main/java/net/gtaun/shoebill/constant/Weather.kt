package net.gtaun.shoebill.constant

/**
 * This enum contains the available weather conditions that can be applied to a world. This information was taken
 * from the official SA:MP Wikipedia page.
 *
 * @author Julian Suhl (Spikes)
 */
enum class Weather constructor(val id: Int) {
    EXTRASUNNY_LA(0),
    SUNNY_LA(1),
    EXTRASUNNY_SMOG_LA(2),
    SUNNY_SMOG_LA(3),
    CLOUDY_LA(4),
    SUNNY_SF(5),
    EXTRASUNNY_SF(6),
    CLOUDY_SF(7),
    RAINY_SF(8),
    FOGGY_SF(9),
    SUNNY_VEGAS(10),
    EXTRASUNNY_VEGAS(11),
    CLOUDY_VEGAS(12),
    EXTRASUNNY_COUNTRYSIDE(13),
    SUNNY_COUNTRYSIDE(14),
    CLOUDY_COUNTRYSIDE(15),
    RAINY_COUNTRYSIDE(16),
    EXTRASUNNY_DESERT(17),
    SUNNY_DESERT(18),
    SANDSTORM_DESERT(19),
    UNDERWATER(20);

    companion object : Collectable<Weather>, Findable<Int, Weather> {
        private val VALUES = values().map { it.id to it }.toMap()

        /**
         * Gets all the available [Weather]s.
         */
        @JvmStatic
        override fun get(): Collection<Weather> = VALUES.values

        /**
         * Gets a [Weather] by its id.
         */
        @JvmStatic
        override operator fun get(value: Int): Weather? = VALUES[value]

    }
}
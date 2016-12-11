package net.gtaun.shoebill.constant

/**
 * This enums contains all possible hit locations of a bullet. This information has been take from the official SA:MP
 * Wikipedia page.
 *
 * @author MK124
 * @author Marvin Haschker
 */
enum class BulletHitType constructor(val value: Int) {
    NONE(0),
    PLAYER(1),
    VEHICLE(2),
    OBJECT(3),
    PLAYER_OBJECT(4);

    companion object : Collectable<BulletHitType>, Findable<Int, BulletHitType> {
        private val VALUES = values().map { it.value to it }.toMap()

        /**
         * Gets a [BulletHitType] by its id.
         */
        @JvmStatic
        override operator fun get(value: Int): BulletHitType? = VALUES[value]

        /**
         * Gets all available [BulletHitType]s.
         */
        @JvmStatic
        override fun get(): Collection<BulletHitType> = VALUES.values
    }
}

package net.gtaun.shoebill.constant

/**
 * This enum contains the possible DataTypes that can be used with the PVar-Stystem. This information was taken from
 * the official SA:MP Wikipedia page.
 *
 * @author MK124
 * @author Marvin Haschker
 */
enum class PlayerVarType constructor(val value: Int) {
    NONE(0),
    INT(1),
    STRING(2),
    FLOAT(3);

    companion object : Collectable<PlayerVarType>, Findable<Int, PlayerVarType> {
        private val VALUES = values().map { it.value to it }.toMap()

        /**
         * Gets all available [PlayerVarType]s.
         */
        @JvmStatic
        override fun get(): Collection<PlayerVarType> = VALUES.values

        /**
         * Gets a [PlayerVarType] by its id.
         */
        @JvmStatic
        override operator fun get(value: Int): PlayerVarType? = VALUES[value]
    }
}

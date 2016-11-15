package net.gtaun.shoebill.constant

/**
 * This enum contains the available VarTypes for the ServerVar-System. This information was taken from the official
 * SA:MP Wikipedia page.
 *
 * @author Marvin Haschker
 */
enum class ServerVarType constructor(val value: Int) {
    NONE(0),
    INTEGER(1),
    STRING(2),
    FLOAT(3);

    companion object : Collectable<ServerVarType>, Findable<Int, ServerVarType> {
        private val VALUES = values().map { it.value to it }.toMap()

        /**
         * Gets all available [ServerVarType]s.
         */
        @JvmStatic
        override fun get(): Collection<ServerVarType> = VALUES.values

        /**
         * Gets a [ServerVarType] by its id.
         */
        @JvmStatic
        override operator fun get(value: Int): ServerVarType? = VALUES[value]

    }
}

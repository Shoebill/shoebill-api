package net.gtaun.shoebill.amx.types

/**
 * This enums defines the possible return types that can be used by the Amx-Interface.
 * Since the abstract machine (AMX) does only support a few types, this enum is tiny.
 *
 * @author Marvin Haschker
 */
enum class ReturnType private constructor(val value: Int) {
    INTEGER(0),
    FLOAT(1),
    STRING(2)
}

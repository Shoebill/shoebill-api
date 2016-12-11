package net.gtaun.shoebill.amx.types

/**
 * This class shall be used with the amx interface when passing a reference string value.
 *
 * @author Marvin Haschker
 */
data class ReferenceString @JvmOverloads constructor(var value: String = "", val length: Int)
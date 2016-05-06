/**
 * Copyright (C) 2011-2014 MK124

 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at

 * http://www.apache.org/licenses/LICENSE-2.0

 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.gtaun.shoebill.data

import org.apache.commons.lang3.builder.EqualsBuilder
import org.apache.commons.lang3.builder.HashCodeBuilder
import org.apache.commons.lang3.builder.ToStringBuilder
import org.apache.commons.lang3.builder.ToStringStyle

/**
 * This class provides basic functionality for creating colors and converting them to different formats.
 *
 * @author MK124
 * @author Marvin Haschker
 */
class Color : Cloneable {
    var value: Int = 0

    /**
     * The red value of the color.
     */
    var r: Int
        get() = value shr 24 and 0xFF
        set(r) {
            value = value and 0x00FFFFFF or (r and 0xFF shl 24)
        }

    /**
     * The green value of the color.
     */
    var g: Int
        get() = value shr 16 and 0xFF
        set(g) {
            value = value and 0xFF00FFFF.toInt() or (g and 0xFF shl 16)
        }

    /**
     * The blue value of the color.
     */
    var b: Int
        get() = value shr 8 and 0xFF
        set(b) {
            value = value and 0xFFFF00FF.toInt() or (b and 0xFF shl 8)
        }

    /**
     * The alpha value of the color.
     */
    var a: Int
        get() = value and 0xFF
        set(a) {
            value = value and 0xFFFFFF00.toInt() or (a and (0xFF shl 0))
        }

    /**
     * The yellow value of the color.
     */
    val y: Int
        get() = (0.299f * r + 0.587f * g + 0.114f * b + 0.5f).toInt()

    /**
     * The RGB value.
     */
    val rgbValue: Int
        get() = value shr 8 and 0x00FFFFFF

    /**
     * The RGB value with the alpha value.
     */
    val rgbaValue: Int
        get() = value and 0xFF shl 24 or (value shr 8)

    /**
     * The rgb value in hex format.
     */
    val rgbHex: String
        get() = String.format("%06X", rgbValue)

    /**
     * The color as an embedding string for SA:MP related stuff.
     */
    val embeddingString: String
        get() = "{$rgbHex}"

    constructor(value: Int) { this.value = value }
    constructor(color: Color) : this(color.value)
    constructor() : this(Color.WHITE)

    @JvmOverloads
    constructor(r: Int, g: Int, b: Int, a: Int = 255) {
        value = r and 0xFF shl 24 or (g and 0xFF) shl 16 or (b and 0xFF) shl 8 or a and 0xFF
    }

    /**
     * Sets the color to [r], [g], [b] and [a].
     */
    @JvmOverloads
    fun set(r: Int = this.r, g: Int = this.g, b: Int = this.b, a: Int = this.a) {
        value = r and 0xFF shl 24 or (g and 0xFF) shl 16 or (b and 0xFF) shl 8 or a and 0xFF
    }

    /**
     * Sets the color to [color].
     */
    fun set(color: Color) = set(color.r, color.g, color.b, color.a)

    override fun hashCode(): Int {
        return HashCodeBuilder.reflectionHashCode(236887699, 256203161, this, false)
    }

    override fun equals(other: Any?): Boolean {
        return EqualsBuilder.reflectionEquals(this, other, false)
    }

    /**
     * Clones the current color and creates a new object.
     */
    public override fun clone(): Color = super.clone() as Color

    override fun toString(): String {
        val builder = ToStringBuilder(this, ToStringStyle.DEFAULT_STYLE)
        builder.append("value", String.format("%08X", value))
        builder.append("r", r)
        builder.append("g", g)
        builder.append("b", b)
        builder.append("a", a)

        return builder.build()
    }

    companion object {

        @JvmField val ALICEBLUE = Color(0xF0F8FFFF.toInt())
        @JvmField val ANTIQUEWHITE = Color(0xFAEBD7FF.toInt())
        @JvmField val AQUA = Color(0x00FFFFFF)
        @JvmField val AQUAMARINE = Color(0x7FFFD4FF)
        @JvmField val AZURE = Color(0xF0FFFFFF.toInt())

        @JvmField val BEIGE = Color(0xF5F5DCFF.toInt())
        @JvmField val BISQUE = Color(0xFFE4C4FF.toInt())
        @JvmField val BLACK = Color(0x000000FF)
        @JvmField val BLANCHEDALMOND = Color(0xFFEBCDFF.toInt())
        @JvmField val BLUE = Color(0x0000FFFF)
        @JvmField val BLUEVIOLET = Color(0x8A2BE2FF.toInt())
        @JvmField val BROWN = Color(0xA52A2AFF.toInt())
        @JvmField val BURLYWOOD = Color(0xDEB887FF.toInt())

        @JvmField val CADETBLUE = Color(0x5F9EA0FF)
        @JvmField val CHARTREUSE = Color(0x7FFF00FF)
        @JvmField val CHOCOLATE = Color(0xD2691EFF.toInt())
        @JvmField val CORAL = Color(0xFF7F50FF.toInt())
        @JvmField val CORNFLOWERBLUE = Color(0x6495EDFF)
        @JvmField val CORNSILK = Color(0xFFF8DCFF.toInt())
        @JvmField val CRIMSON = Color(0xDC143CFF.toInt())
        @JvmField val CYAN = Color(0x00FFFFFF)

        @JvmField val DARKBLUE = Color(0x00008BFF)
        @JvmField val DARLCYAN = Color(0x008B8BFF)
        @JvmField val DARKGOLDENROD = Color(0xB8860BFF.toInt())
        @JvmField val DARKGRAY = Color(0xA9A9A9FF.toInt())
        @JvmField val DARKGREEN = Color(0x006400FF)
        @JvmField val DARKKHAKI = Color(0xBDB76BFF.toInt())
        @JvmField val DARKMAGENTA = Color(0x8B008BFF.toInt())
        @JvmField val DARKOLIVEGREEN = Color(0x556B2FFF)
        @JvmField val DARKORANGE = Color(0xFF8C00FF.toInt())
        @JvmField val DARKORCHID = Color(0x9932CCFF.toInt())
        @JvmField val DARKRED = Color(0x8B0000FF.toInt())
        @JvmField val DARKSALMON = Color(0xE9967AFF.toInt())
        @JvmField val DARKSEAGREEN = Color(0x8FBC8FFF.toInt())
        @JvmField val DARKSLATEBLUE = Color(0x483D8BFF)
        @JvmField val DARKSLATEGRAY = Color(0x2F4F4FFF)
        @JvmField val DARKTURQUOISE = Color(0x00CED1FF)
        @JvmField val DARKVIOLET = Color(0x9400D3FF.toInt())
        @JvmField val DEEPPINK = Color(0xFF1493FF.toInt())
        @JvmField val DEEPSKYBLUE = Color(0x00BFFFFF)
        @JvmField val DIMGRAY = Color(0x696969FF)
        @JvmField val DODGERBLUE = Color(0x1E90FFFF)

        @JvmField val FIREBRICK = Color(0xB22222FF.toInt())
        @JvmField val FLORALWHITE = Color(0xFFFAF0FF.toInt())
        @JvmField val FORESTGREEN = Color(0x228B22FF)
        @JvmField val FUCHSIA = Color(0xFF00FFFF.toInt())

        @JvmField val GAINSBORO = Color(0xDCDCDCFF.toInt())
        @JvmField val GHOSTWHITE = Color(0xF8F8FFFF.toInt())
        @JvmField val GOLD = Color(0xFFD700FF.toInt())
        @JvmField val GOLDENROD = Color(0xDAA520FF.toInt())
        @JvmField val GRAY = Color(0x808080FF.toInt())
        @JvmField val GREEN = Color(0x008000FF)
        @JvmField val GREENYELLOW = Color(0xADFF2FFF.toInt())

        @JvmField val HONEYDEW = Color(0xF0FFF0FF.toInt())
        @JvmField val HOTPINK = Color(0xFF69B4FF.toInt())

        @JvmField val INDIANRED = Color(0xCD5C5CFF.toInt())
        @JvmField val INDIGO = Color(0x4B0082FF)
        @JvmField val IVORY = Color(0xFFFFF0FF.toInt())

        @JvmField val KHAKI = Color(0xF0E68CFF.toInt())

        @JvmField val LAVENDER = Color(0xE6E6FAFF.toInt())
        @JvmField val LAVENDERBLUSH = Color(0xFFF0F5FF.toInt())
        @JvmField val LAWNGREEN = Color(0x7CFC00FF)
        @JvmField val LEMONCHIFFON = Color(0xFFFACDFF.toInt())
        @JvmField val LIGHTBLUE = Color(0xADD8E6FF.toInt())
        @JvmField val LIGHTCORAL = Color(0xF08080FF.toInt())
        @JvmField val LIGHTCYAN = Color(0xE0FFFFFF.toInt())
        @JvmField val LIGHTGOLDENRODYELLOW = Color(0xFAFAD2FF.toInt())
        @JvmField val LIGHTGREEN = Color(0x90EE90FF.toInt())
        @JvmField val LIGHTGREY = Color(0xD3D3D3FF.toInt())
        @JvmField val LIGHTPINK = Color(0xFFB6C1FF.toInt())
        @JvmField val LIGHTSALMON = Color(0xFFA07AFF.toInt())
        @JvmField val LIGHTSEAGREEN = Color(0x20B2AAFF)
        @JvmField val LIGHTSKYBLUE = Color(0x87CEFAFF.toInt())
        @JvmField val LIGHTSLATEGRAY = Color(0x778899FF)
        @JvmField val LIGHTSTEELBLUE = Color(0xB0C4DEFF.toInt())
        @JvmField val LIGHTYELLOW = Color(0xFFFFE0FF.toInt())
        @JvmField val LIGHTRED = Color(0xFF8080FF.toInt())
        @JvmField val LIME = Color(0x00FF00FF)
        @JvmField val LIMEGREEN = Color(0x32CD32FF)
        @JvmField val LINEN = Color(0xFAF0E6FF.toInt())

        @JvmField val MAGENTA = Color(0xFF00FFFF.toInt())
        @JvmField val MAROON = Color(0x800000FF.toInt())
        @JvmField val MEDIUMAQUAMARINE = Color(0x66CDAAFF)
        @JvmField val MEDIUMBLUE = Color(0x0000CDFF)
        @JvmField val MEDIUMORCHID = Color(0xBA55D3FF.toInt())
        @JvmField val MEDIUMPURPLE = Color(0x9370DBFF.toInt())
        @JvmField val MEDIUMSEAGREEN = Color(0x3CB371FF)
        @JvmField val MEDIUMSLATEBLUE = Color(0x7B68EEFF)
        @JvmField val MEDIUMSPRINGGREEN = Color(0x00FA9AFF)
        @JvmField val MEDIUMTURQUOISE = Color(0x48D1CCFF)
        @JvmField val MEDIUMVIOLETRED = Color(0xC71585FF.toInt())
        @JvmField val MIDNIGHTBLUE = Color(0x191970FF)
        @JvmField val MINTCREAM = Color(0xF5FFFAFF.toInt())
        @JvmField val MISTYROSE = Color(0xFFE4E1FF.toInt())
        @JvmField val MOCCASIN = Color(0xFFE4B5FF.toInt())

        @JvmField val NAVAJOWHITE = Color(0xFFDEADFF.toInt())
        @JvmField val NAVY = Color(0x000080FF)

        @JvmField val OLDLACE = Color(0xFDF5E6FF.toInt())
        @JvmField val OLIVE = Color(0x808000FF.toInt())
        @JvmField val OLIVEDRAB = Color(0x6B8E23FF)
        @JvmField val ORANGE = Color(0xFFA500FF.toInt())
        @JvmField val ORANGERED = Color(0xFF4500FF.toInt())
        @JvmField val ORCHID = Color(0xDA70D6FF.toInt())

        @JvmField val PALEGOLDENROD = Color(0xEEE8AAFF.toInt())
        @JvmField val PALEGREEN = Color(0x98FB98FF.toInt())
        @JvmField val PALETURQUOISE = Color(0xAFEEEEFF.toInt())
        @JvmField val PALEVIOLETRED = Color(0xDB7093FF.toInt())
        @JvmField val PAPAYAWHIP = Color(0xFFEFD5FF.toInt())
        @JvmField val PEACHPUFF = Color(0xFFDAB9FF.toInt())
        @JvmField val PERU = Color(0xCD853FFF.toInt())
        @JvmField val PINK = Color(0xFFC0CBFF.toInt())
        @JvmField val PLUM = Color(0xDDA0DDFF.toInt())
        @JvmField val POWDERBLUE = Color(0xB0E0E6FF.toInt())
        @JvmField val PURPLE = Color(0x800080FF.toInt())

        @JvmField val RED = Color(0xFF0000FF.toInt())
        @JvmField val ROSYBROWN = Color(0xBC8F8FFF.toInt())
        @JvmField val ROYALBLUE = Color(0x4169E1FF)

        @JvmField val SADDLEBROWN = Color(0x8B4513FF.toInt())
        @JvmField val SALMON = Color(0xFA8072FF.toInt())
        @JvmField val SANDYBROWN = Color(0xF4A460FF.toInt())
        @JvmField val SEAGREEN = Color(0x2E8B57FF)
        @JvmField val SEASHELL = Color(0xFFF5EEFF.toInt())
        @JvmField val SIENNA = Color(0xA0522DFF.toInt())
        @JvmField val SILVER = Color(0xC0C0C0FF.toInt())
        @JvmField val SKYBLUE = Color(0x87CEEBFF.toInt())
        @JvmField val SLATEBLUE = Color(0x6A5ACDFF)
        @JvmField val SLATEGRAY = Color(0x708090FF)
        @JvmField val SNOW = Color(0xFFFAFAFF.toInt())
        @JvmField val SPRINGGREEN = Color(0x00FF7FFF)
        @JvmField val STEELBLUE = Color(0x4682B4FF)

        @JvmField val TAN = Color(0xD2B48CFF.toInt())
        @JvmField val TEAL = Color(0x008080FF)
        @JvmField val THISTLE = Color(0xD8BFD8FF.toInt())
        @JvmField val TOMATO = Color(0xFF6347FF.toInt())
        @JvmField val TURQUOISE = Color(0x40E0D0FF)

        @JvmField val VIOLET = Color(0xEE82EEFF.toInt())

        @JvmField val WHEAT = Color(0xF5DEB3FF.toInt())
        @JvmField val WHITE = Color(0xFFFFFFFF.toInt())
        @JvmField val WHITESMOKE = Color(0xF5F5F5FF.toInt())

        @JvmField val YELLOW = Color(0xFFFF00FF.toInt())
        @JvmField val YELLOWGREEN = Color(0x9ACD32FF.toInt())

        @JvmField val TRANSPARENT = Color(0x00000000)

        private val allColors: List<Color>

        init {
            var colors: MutableList<Color> = mutableListOf()
            Color::class.java.declaredFields.filter { it.type == Color::class.java }
                    .forEach { colors.add(it.get(null) as Color) }
            allColors = colors
        }

        /**
         * All declared colors
         */
        @JvmStatic
        val colors: Collection<Color>
            get() = allColors
    }
}

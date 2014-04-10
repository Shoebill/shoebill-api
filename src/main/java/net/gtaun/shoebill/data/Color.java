/**
 * Copyright (C) 2011-2014 MK124
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *	 http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.gtaun.shoebill.data;

import java.io.Serializable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 
 * 
 * @author MK124
 */
public class Color implements Cloneable, Serializable
{
	private static final long serialVersionUID = -6538397318569967446L;
	
	
	public static final Color ALICEBLUE =				new Color(0xF0F8FFFF);
	public static final Color ANTIQUEWHITE =			new Color(0xFAEBD7FF);
	public static final Color AQUA =					new Color(0x00FFFFFF);
	public static final Color AQUAMARINE =				new Color(0x7FFFD4FF);
	public static final Color AZURE =					new Color(0xF0FFFFFF);
	
	public static final Color BEIGE =					new Color(0xF5F5DCFF);
	public static final Color BISQUE =					new Color(0xFFE4C4FF);
	public static final Color BLACK =					new Color(0x000000FF);
	public static final Color BLANCHEDALMOND =			new Color(0xFFEBCDFF);
	public static final Color BLUE =					new Color(0x0000FFFF);
	public static final Color BLUEVIOLET =				new Color(0x8A2BE2FF);
	public static final Color BROWN =					new Color(0xA52A2AFF);
	public static final Color BURLYWOOD =				new Color(0xDEB887FF);
	
	public static final Color CADETBLUE =				new Color(0x5F9EA0FF);
	public static final Color CHARTREUSE =				new Color(0x7FFF00FF);
	public static final Color CHOCOLATE =				new Color(0xD2691EFF);
	public static final Color CORAL =					new Color(0xFF7F50FF);
	public static final Color CORNFLOWERBLUE =			new Color(0x6495EDFF);
	public static final Color CORNSILK =				new Color(0xFFF8DCFF);
	public static final Color CRIMSON =					new Color(0xDC143CFF);
	public static final Color CYAN =					new Color(0x00FFFFFF);
	
	public static final Color DARKBLUE =				new Color(0x00008BFF);
	public static final Color DARLCYAN =				new Color(0x008B8BFF);
	public static final Color DARKGOLDENROD =			new Color(0xB8860BFF);
	public static final Color DARKGRAY =				new Color(0xA9A9A9FF);
	public static final Color DARKGREEN =				new Color(0x006400FF);
	public static final Color DARKKHAKI =				new Color(0xBDB76BFF);
	public static final Color DARKMAGENTA =				new Color(0x8B008BFF);
	public static final Color DARKOLIVEGREEN =			new Color(0x556B2FFF);
	public static final Color DARKORANGE =				new Color(0xFF8C00FF);
	public static final Color DARKORCHID =				new Color(0x9932CCFF);
	public static final Color DARKRED =					new Color(0x8B0000FF);
	public static final Color DARKSALMON =				new Color(0xE9967AFF);
	public static final Color DARKSEAGREEN =			new Color(0x8FBC8FFF);
	public static final Color DARKSLATEBLUE =			new Color(0x483D8BFF);
	public static final Color DARKSLATEGRAY =			new Color(0x2F4F4FFF);
	public static final Color DARKTURQUOISE =			new Color(0x00CED1FF);
	public static final Color DARKVIOLET =				new Color(0x9400D3FF);
	public static final Color DEEPPINK =				new Color(0xFF1493FF);
	public static final Color DEEPSKYBLUE =				new Color(0x00BFFFFF);
	public static final Color DIMGRAY =					new Color(0x696969FF);
	public static final Color DODGERBLUE =				new Color(0x1E90FFFF);
	
	public static final Color FIREBRICK =				new Color(0xB22222FF);
	public static final Color FLORALWHITE =				new Color(0xFFFAF0FF);
	public static final Color FORESTGREEN =				new Color(0x228B22FF);
	public static final Color FUCHSIA =					new Color(0xFF00FFFF);
	
	public static final Color GAINSBORO =				new Color(0xDCDCDCFF);
	public static final Color GHOSTWHITE =				new Color(0xF8F8FFFF);
	public static final Color GOLD =					new Color(0xFFD700FF);
	public static final Color GOLDENROD =				new Color(0xDAA520FF);
	public static final Color GRAY =					new Color(0x808080FF);
	public static final Color GREEN =					new Color(0x008000FF);
	public static final Color GREENYELLOW =				new Color(0xADFF2FFF);
	
	public static final Color HONEYDEW =				new Color(0xF0FFF0FF);
	public static final Color HOTPINK =					new Color(0xFF69B4FF);
	
	public static final Color INDIANRED =				new Color(0xCD5C5CFF);
	public static final Color INDIGO =					new Color(0x4B0082FF);
	public static final Color IVORY =					new Color(0xFFFFF0FF);
	
	public static final Color KHAKI =					new Color(0xF0E68CFF);

	public static final Color LAVENDER =				new Color(0xE6E6FAFF);
	public static final Color LAVENDERBLUSH =			new Color(0xFFF0F5FF);
	public static final Color LAWNGREEN =				new Color(0x7CFC00FF);
	public static final Color LEMONCHIFFON =			new Color(0xFFFACDFF);
	public static final Color LIGHTBLUE =				new Color(0xADD8E6FF);
	public static final Color LIGHTCORAL =				new Color(0xF08080FF);
	public static final Color LIGHTCYAN =				new Color(0xE0FFFFFF);
	public static final Color LIGHTGOLDENRODYELLOW =	new Color(0xFAFAD2FF);
	public static final Color LIGHTGREEN =				new Color(0x90EE90FF);
	public static final Color LIGHTGREY =				new Color(0xD3D3D3FF);
	public static final Color LIGHTPINK =				new Color(0xFFB6C1FF);
	public static final Color LIGHTSALMON =				new Color(0xFFA07AFF);
	public static final Color LIGHTSEAGREEN =			new Color(0x20B2AAFF);
	public static final Color LIGHTSKYBLUE =			new Color(0x87CEFAFF);
	public static final Color LIGHTSLATEGRAY =			new Color(0x778899FF);
	public static final Color LIGHTSTEELBLUE =			new Color(0xB0C4DEFF);
	public static final Color LIGHTYELLOW =				new Color(0xFFFFE0FF);
	public static final Color LIME =					new Color(0x00FF00FF);
	public static final Color LIMEGREEN =				new Color(0x32CD32FF);
	public static final Color LINEN =					new Color(0xFAF0E6FF);

	public static final Color MAGENTA =					new Color(0xFF00FFFF);
	public static final Color MAROON =					new Color(0x800000FF);
	public static final Color MEDIUMAQUAMARINE =		new Color(0x66CDAAFF);
	public static final Color MEDIUMBLUE =				new Color(0x0000CDFF);
	public static final Color MEDIUMORCHID =			new Color(0xBA55D3FF);
	public static final Color MEDIUMPURPLE =			new Color(0x9370DBFF);
	public static final Color MEDIUMSEAGREEN =			new Color(0x3CB371FF);
	public static final Color MEDIUMSLATEBLUE =			new Color(0x7B68EEFF);
	public static final Color MEDIUMSPRINGGREEN =		new Color(0x00FA9AFF);
	public static final Color MEDIUMTURQUOISE =			new Color(0x48D1CCFF);
	public static final Color MEDIUMVIOLETRED =			new Color(0xC71585FF);
	public static final Color MIDNIGHTBLUE =			new Color(0x191970FF);
	public static final Color MINTCREAM =				new Color(0xF5FFFAFF);
	public static final Color MISTYROSE =				new Color(0xFFE4E1FF);
	public static final Color MOCCASIN =				new Color(0xFFE4B5FF);
	
	public static final Color NAVAJOWHITE =				new Color(0xFFDEADFF);
	public static final Color NAVY =					new Color(0x000080FF);
	
	public static final Color OLDLACE =					new Color(0xFDF5E6FF);
	public static final Color OLIVE =					new Color(0x808000FF);
	public static final Color OLIVEDRAB =				new Color(0x6B8E23FF);
	public static final Color ORANGE =					new Color(0xFFA500FF);
	public static final Color ORANGERED =				new Color(0xFF4500FF);
	public static final Color ORCHID =					new Color(0xDA70D6FF);

	public static final Color PALEGOLDENROD =			new Color(0xEEE8AAFF);
	public static final Color PALEGREEN =				new Color(0x98FB98FF);
	public static final Color PALETURQUOISE =			new Color(0xAFEEEEFF);
	public static final Color PALEVIOLETRED =			new Color(0xDB7093FF);
	public static final Color PAPAYAWHIP =				new Color(0xFFEFD5FF);
	public static final Color PEACHPUFF =				new Color(0xFFDAB9FF);
	public static final Color PERU =					new Color(0xCD853FFF);
	public static final Color PINK =					new Color(0xFFC0CBFF);
	public static final Color PLUM =					new Color(0xDDA0DDFF);
	public static final Color POWDERBLUE =				new Color(0xB0E0E6FF);
	public static final Color PURPLE =					new Color(0x800080FF);
	
	public static final Color RED =						new Color(0xFF0000FF);
	public static final Color ROSYBROWN =				new Color(0xBC8F8FFF);
	public static final Color ROYALBLUE =				new Color(0x4169E1FF);
	
	public static final Color SADDLEBROWN =				new Color(0x8B4513FF);
	public static final Color SALMON =					new Color(0xFA8072FF);
	public static final Color SANDYBROWN =				new Color(0xF4A460FF);
	public static final Color SEAGREEN =				new Color(0x2E8B57FF);
	public static final Color SEASHELL =				new Color(0xFFF5EEFF);
	public static final Color SIENNA =					new Color(0xA0522DFF);
	public static final Color SILVER =					new Color(0xC0C0C0FF);
	public static final Color SKYBLUE =					new Color(0x87CEEBFF);
	public static final Color SLATEBLUE =				new Color(0x6A5ACDFF);
	public static final Color SLATEGRAY =				new Color(0x708090FF);
	public static final Color SNOW =					new Color(0xFFFAFAFF);
	public static final Color SPRINGGREEN =				new Color(0x00FF7FFF);
	public static final Color STEELBLUE =				new Color(0x4682B4FF);
	
	public static final Color TAN =						new Color(0xD2B48CFF);
	public static final Color TEAL =					new Color(0x008080FF);
	public static final Color THISTLE =					new Color(0xD8BFD8FF);
	public static final Color TOMATO =					new Color(0xFF6347FF);
	public static final Color TURQUOISE =				new Color(0x40E0D0FF);
	
	public static final Color VIOLET =					new Color(0xEE82EEFF);
	
	public static final Color WHEAT =					new Color(0xF5DEB3FF);
	public static final Color WHITE =					new Color(0xFFFFFFFF);
	public static final Color WHITESMOKE =				new Color(0xF5F5F5FF);
	
	public static final Color YELLOW =					new Color(0xFFFF00FF);
	public static final Color YELLOWGREEN =				new Color(0x9ACD32FF);
	
	public static final Color TRANSPARENT =				new Color(0x00000000);
	
	
	private int value;
	
	
	public Color(int value)
	{
		this.value = value;
	}
	
	public Color(int r, int g, int b)
	{
		value = (r & 0xFF) << 24 | (g & 0xFF) << 16 | (b & 0xFF) << 8 | 0xFF;
	}
	
	public Color(int r, int g, int b, int a)
	{
		value = (r & 0xFF) << 24 | (g & 0xFF) << 16 | (b & 0xFF) << 8 | a & 0xFF;
	}
	
	public Color(Color color)
	{
		this.value = color.getValue();
	}
	
	public Color()
	{
		value = Color.WHITE.getValue();
	}
	
	public int getValue()
	{
		return value;
	}
	
	public int toRgbValue()
	{
		return (value >> 8) & 0x00FFFFFF;
	}
	
	public int toArgbValue()
	{
		return ((value & 0xFF) << 24) | (value >> 8);
	}
	
	public String toRgbHexString()
	{
		return String.format("%06X", toRgbValue());
	}
	
	public String toEmbeddingString()
	{
		return "{" + toRgbHexString() + "}";
	}
	
	public void setValue(int value)
	{
		this.value = value;
	}
	
	public int getR()
	{
		return value >> 24 & 0xFF;
	}
	
	public void setR(int r)
	{
		value = (value & 0x00FFFFFF) | (r & 0xFF) << 24;
	}
	
	public int getG()
	{
		return value >> 16 & 0xFF;
	}
	
	public void setG(int g)
	{
		value = (value & 0xFF00FFFF) | (g & 0xFF) << 16;
	}
	
	public int getB()
	{
		return value >> 8 & 0xFF;
	}
	
	public void setB(int b)
	{
		value = (value & 0xFFFF00FF) | (b & 0xFF) << 8;
	}
	
	public int getA()
	{
		return value & 0xFF;
	}
	
	public void setA(int a)
	{
		value = getValue() & 0xFFFFFF00 | a & 0xFF << 0;
	}
	
	public int getY()
	{
		return (int) (0.299f * getR() + 0.587f * getG() + 0.114f * getB() + 0.5f);
	}
	
	public void set(int r, int g, int b)
	{
		value = (r & 0xFF) << 24 | (g & 0xFF) << 16 | (b & 0xFF) << 8 | 0xFF;
	}
	
	public void set(int r, int g, int b, int a)
	{
		value = (r & 0xFF) << 24 | (g & 0xFF) << 16 | (b & 0xFF) << 8 | a & 0xFF;
	}
	
	public void set(Color color)
	{
		setValue(color.getValue());
	}
	
	@Override
	public int hashCode()
	{
		return HashCodeBuilder.reflectionHashCode(236887699, 256203161, this, false);
	}
	
	@Override
	public boolean equals(Object obj)
	{
		return EqualsBuilder.reflectionEquals(this, obj, false);
	}
	
	@Override
	public Color clone()
	{
		try
		{
			return (Color) super.clone();
		}
		catch (CloneNotSupportedException e)
		{
			throw new InternalError();
		}
	}
	
	@Override
	public String toString()
	{
		ToStringBuilder builder = new ToStringBuilder(this, ToStringStyle.DEFAULT_STYLE);
		builder.append("value", String.format("%08X", value));
		builder.append("r", getR());
		builder.append("g", getG());
		builder.append("b", getB());
		builder.append("a", getA());
		
		return builder.build();
	}
}

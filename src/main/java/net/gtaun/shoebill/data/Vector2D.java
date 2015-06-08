/**
 * Copyright (C) 2011 JoJLlmAn
 * Copyright (C) 2011-2014 MK124
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.gtaun.shoebill.data;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

/**
 * 
 * 
 * @author JoJLlmAn
 */
public class Vector2D implements Cloneable, Serializable
{
	private static final long serialVersionUID = 3303330394405245831L;
	
	
	public float x, y;
	
	
	public Vector2D()
	{
		
	}
	
	public Vector2D(float x, float y)
	{
		this.x = x;
		this.y = y;
	}
	
	public Vector2D(Vector2D vec)
	{
		this.x = vec.getX();
		this.y = vec.getY();
	}
	
	public float getX()
	{
		return x;
	}
	
	public void setX(float x)
	{
		this.x = x;
	}
	
	public float getY()
	{
		return y;
	}
	
	public void setY(float y)
	{
		this.y = y;
	}
	
	public void set(float x, float y)
	{
		setX(x);
		setY(y);
	}
	
	public void set(Vector2D vector)
	{
		setX(vector.getX());
		setY(vector.getY());
	}

	public Vector2D add(float val)
	{
		x += val;
		y += val;
		return this;
	}

	public Vector2D add(Vector2D vec)
	{
		x += vec.x;
		y += vec.y;
		return this;
	}

	public Vector2D minus(float val)
	{
		x -= val;
		y -= val;
		return this;
	}
	public Vector2D minus(Vector2D vec)
	{
		x -= vec.x;
		y -= vec.y;
		return this;
	}

	public Vector2D mul(float val)
	{
		x *= val;
		y *= val;
		return this;
	}
	public Vector2D mul(Vector2D vec)
	{
		x *= vec.x;
		y *= vec.y;
		return this;
	}

	public Vector2D div(float val)
	{
		x /= val;
		y /= val;
		return this;
	}
	public Vector2D div(Vector2D vec)
	{
		x /= vec.x;
		y /= vec.y;
		return this;
	}

	public Vector2D blend(Vector2D vec, float factor)
	{
		float f = 1.0f-factor;
		x = x * f + vec.x * factor;
		y = y * f + vec.y * factor;
		return this;
	}

	public String toLegibleString()
	{
		return String.format("%f, %f", x, y);
	}

	@Override
	public int hashCode()
	{
		return HashCodeBuilder.reflectionHashCode(433024253, 472882049, this, false);
	}
	
	@Override
	public boolean equals(Object obj)
	{
		return EqualsBuilder.reflectionEquals(this, obj, false);
	}
	
	@Override
	public Vector2D clone()
	{
		try
		{
			return (Vector2D) super.clone();
		}
		catch (CloneNotSupportedException e)
		{
			throw new InternalError(e);
		}
	}
	
	@Override
	public String toString()
	{
		return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE, false);
	}
}

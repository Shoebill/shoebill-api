/**
 * Copyright (C) 2011 JoJLlmAn
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

import java.io.Serializable;

import net.gtaun.shoebill.util.immutable.Immutable;
import net.gtaun.shoebill.util.immutable.Immutably;
import net.gtaun.shoebill.util.immutable.ImmutablyException;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 
 * 
 * @author JoJLlmAn
 */
public class Vector2D implements Cloneable, Serializable, Immutable
{
	private static final long serialVersionUID = 3303330394405245831L;
	
	
	private static final class ImmutablyVector2D extends Vector2D implements Immutably
	{
		private static final long serialVersionUID = Vector2D.serialVersionUID;
		
		
		private ImmutablyVector2D(Vector2D vector2d)
		{
			super(vector2d);
		}
		
		@Override
		public Vector2D clone()
		{
			return new Vector2D(this);
		}
	}
	
	
	private float x, y;
	
	
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
		if (this instanceof Immutably) throw new ImmutablyException();
		
		this.x = x;
	}
	
	public float getY()
	{
		return y;
	}
	
	public void setY(float y)
	{
		if (this instanceof Immutably) throw new ImmutablyException();
		
		this.y = y;
	}
	
	public void set(float x, float y)
	{
		if (this instanceof Immutably) throw new ImmutablyException();
		
		setX(x);
		setY(y);
	}
	
	public void set(Vector2D vector)
	{
		if (this instanceof Immutably) throw new ImmutablyException();
		
		setX(vector.getX());
		setY(vector.getY());
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
			throw new InternalError();
		}
	}
	
	@Override
	public Vector2D immure()
	{
		return new ImmutablyVector2D(this);
	}
	
	@Override
	public String toString()
	{
		return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE, false);
	}
}

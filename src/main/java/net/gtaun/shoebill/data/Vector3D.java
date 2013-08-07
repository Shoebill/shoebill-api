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

import net.gtaun.shoebill.util.immutable.CanImmutable;
import net.gtaun.shoebill.util.immutable.Immutable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 
 * 
 * @author JoJLlmAn
 */
public class Vector3D extends Vector2D implements Cloneable, Serializable, CanImmutable
{
	private static final long serialVersionUID = 8493095902831171278L;
	
	
	public static final class ImmutableVector3D extends Vector3D implements Immutable
	{
		private static final long serialVersionUID = Vector3D.serialVersionUID;
		

		private ImmutableVector3D()
		{
			
		}
		
		private ImmutableVector3D(Vector3D vector3d)
		{
			super(vector3d);
		}
		
		@Override
		public ImmutableVector3D clone()
		{
			return this;
		}
	}
	
	
	private float z;
	
	
	public Vector3D()
	{
		
	}
	
	public Vector3D(float x, float y, float z)
	{
		super(x, y);
		this.z = z;
	}
	
	public Vector3D(Vector2D vec, float z)
	{
		super(vec);
		this.z = z;
	}
	
	public Vector3D(Vector3D vec)
	{
		super(vec);
		this.z = vec.getZ();
	}
	
	public float getZ()
	{
		return z;
	}
	
	public void setZ(float z)
	{
		if (this instanceof Immutable) throw new UnsupportedOperationException();
		this.z = z;
	}
	
	public void set(float x, float y, float z)
	{
		if (this instanceof Immutable) throw new UnsupportedOperationException();
		
		super.set(x, y);
		setZ(z);
	}
	
	public void set(Vector2D vec, float z)
	{
		if (this instanceof Immutable) throw new UnsupportedOperationException();
		
		super.set(vec);
		setZ(z);
	}
	
	public void set(Vector3D vec)
	{
		if (this instanceof Immutable) throw new UnsupportedOperationException();
		
		super.set(vec);
		setZ(vec.getZ());
	}
	
	public float distance(Vector3D pos)
	{
		float dx = pos.getX() - getX(), dy = pos.getY() - getY(), dz = pos.getZ() - getZ();
		return (float) Math.sqrt(dx*dx + dy*dy + dz*dz);
	}
	
	@Override
	public int hashCode()
	{
		return HashCodeBuilder.reflectionHashCode(49979693, 573259433, this, false);
	}
	
	@Override
	public boolean equals(Object obj)
	{
		return EqualsBuilder.reflectionEquals(this, obj, false);
	}
	
	@Override
	public Vector3D clone()
	{
		return (Vector3D) super.clone();
	}
	
	@Override
	public Vector3D immutable()
	{
		return new ImmutableVector3D(this);
	}
	
	@Override
	public String toString()
	{
		return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE, false);
	}
}

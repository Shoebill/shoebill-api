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
public class Vector3D extends Vector2D implements Cloneable, Serializable
{
	private static final long serialVersionUID = 8493095902831171278L;
	
	
	public float z;
	
	
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
		this.z = z;
	}
	
	public void set(float x, float y, float z)
	{
		super.set(x, y);
		setZ(z);
	}
	
	public void set(Vector2D vec, float z)
	{
		super.set(vec);
		setZ(z);
	}
	
	public void set(Vector3D vec)
	{
		super.set(vec);
		setZ(vec.getZ());
	}
	
	public float distance(Vector3D pos)
	{
		float dx = pos.getX() - getX(), dy = pos.getY() - getY(), dz = pos.getZ() - getZ();
		return (float) Math.sqrt(dx*dx + dy*dy + dz*dz);
	}

	public Vector3D add(float val)
	{
		super.add(val);
		z += val;
		return this;
	}

	public Vector3D add(Vector3D vec)
	{
		super.add(vec);
		z += vec.z;
		return this;
	}

	public Vector3D minus(float val)
	{
		super.minus(val);
		z -= val;
		return this;
	}
	public Vector3D minus(Vector3D vec)
	{
		super.minus(vec);
		z -= vec.z;
		return this;
	}

	public Vector3D mul(float val)
	{
		super.mul(val);
		z *= val;
		return this;
	}
	public Vector3D mul(Vector3D vec)
	{
		super.mul(vec);
		z *= vec.z;
		return this;
	}

	public Vector3D div(float val)
	{
		super.div(val);
		z /= val;
		return this;
	}
	public Vector3D div(Vector3D vec)
	{
		super.div(vec);
		z /= vec.z;
		return this;
	}

	public Vector3D blend(Vector3D vec, float factor)
	{
		super.blend(vec, factor);
		float f = 1.0f-factor;
		z = z * f + vec.z * factor;
		return this;
	}

	@Override
	public String toLegibleString()
	{
		return String.format("%f, %f, %f", x, y, z);
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
	public String toString()
	{
		return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE, false);
	}
}

/**
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
 * @author MK124
 */
public class Radius extends Location implements Cloneable, Serializable, RangeCheckable3D
{
	private static final long serialVersionUID = -4375366678586498863L;
	
	
	public float radius;
	
	
	public Radius()
	{
		
	}
	
	public Radius(float x, float y, float z, float radius)
	{
		super(x, y, z);
		this.radius = radius;
	}
	
	public Radius(float x, float y, float z, int worldId, float radius)
	{
		super(x, y, z, worldId);
		this.radius = radius;
	}
	
	public Radius(float x, float y, float z, int interiorId, int worldId, float radius)
	{
		super(x, y, z, interiorId, worldId);
		this.radius = radius;
	}
	
	public Radius(Vector3D pos, float radius)
	{
		super(pos);
		this.radius = radius;
	}
	
	public Radius(Vector3D pos, int worldId, float radius)
	{
		super(pos, worldId);
		this.radius = radius;
	}
	
	public Radius(Vector3D pos, int interiorId, int worldId, float radius)
	{
		super(pos, interiorId, worldId);
		this.radius = radius;
	}
	
	public Radius(Location loc, float radius)
	{
		super(loc);
		this.radius = radius;
	}
	
	public Radius(Radius loc)
	{
		super(loc);
		this.radius = loc.getRadius();
	}
	
	public float getRadius()
	{
		return radius;
	}
	
	public void setRadius(float radius)
	{
		this.radius = radius;
	}
	
	public void set(float x, float y, float z, float radius)
	{
		super.set(x, y, z);
		setRadius(radius);
	}
	
	public void set(float x, float y, float z, int worldId, float radius)
	{
		super.set(x, y, z, worldId);
		setRadius(radius);
	}
	
	public void set(float x, float y, float z, int interiorId, int worldId, float radius)
	{
		super.set(x, y, z, interiorId, worldId);
		setRadius(radius);
	}
	
	public void set(Vector3D pos, float radius)
	{
		super.set(pos);
		setRadius(radius);
	}
	
	public void set(Vector3D pos, int worldId, float radius)
	{
		super.set(pos, worldId);
		setRadius(radius);
	}
	
	public void set(Vector3D pos, int interiorId, int worldId, float radius)
	{
		super.set(pos, interiorId, worldId);
		setRadius(radius);
	}
	
	public void set(Radius loc)
	{
		super.set(loc);
		setRadius(loc.getRadius());
	}

	@Override
	public boolean isInRange(Vector3D pos)
	{
		if (pos instanceof Location) return super.distance((Location)pos) <= radius;
		return super.distance(pos) <= radius;
	}
	
	@Override
	public int hashCode()
	{
		return HashCodeBuilder.reflectionHashCode(160481219, 179424673, this, false);
	}
	
	@Override
	public boolean equals(Object obj)
	{
		return EqualsBuilder.reflectionEquals(this, obj, false);
	}
	
	@Override
	public Radius clone()
	{
		return (Radius) super.clone();
	}
	
	@Override
	public String toString()
	{
		return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE, false);
	}
}

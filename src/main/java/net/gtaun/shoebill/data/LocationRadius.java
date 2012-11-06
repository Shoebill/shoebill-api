/**
 * Copyright (C) 2011 MK124
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
 * @author MK124
 */
public class LocationRadius extends Location implements Cloneable, Serializable, Immutable
{
	private static final long serialVersionUID = -4375366678586498863L;
	
	
	private static final class ImmutablyLocationRadius extends LocationRadius implements Immutably
	{
		private static final long serialVersionUID = LocationRadius.serialVersionUID;
		
		
		private ImmutablyLocationRadius(LocationRadius locationRadius)
		{
			super(locationRadius);
		}
		
		@Override
		public LocationRadius clone()
		{
			return new LocationRadius(this);
		}
	}
	
	
	private float radius;
	
	
	public LocationRadius()
	{
		
	}
	
	public LocationRadius(float x, float y, float z, float radius)
	{
		super(x, y, z);
		this.radius = radius;
	}
	
	public LocationRadius(float x, float y, float z, int worldId, float radius)
	{
		super(x, y, z, worldId);
		this.radius = radius;
	}
	
	public LocationRadius(float x, float y, float z, int interiorId, int worldId, float radius)
	{
		super(x, y, z, interiorId, worldId);
		this.radius = radius;
	}
	
	public LocationRadius(Vector3D pos, float radius)
	{
		super(pos);
		this.radius = radius;
	}
	
	public LocationRadius(Vector3D pos, int worldId, float radius)
	{
		super(pos, worldId);
		this.radius = radius;
	}
	
	public LocationRadius(Vector3D pos, int interiorId, int worldId, float radius)
	{
		super(pos, interiorId, worldId);
		this.radius = radius;
	}
	
	public LocationRadius(Location loc, float radius)
	{
		super(loc);
		this.radius = radius;
	}
	
	public LocationRadius(LocationRadius loc)
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
		if (this instanceof Immutably) throw new ImmutablyException();
		this.radius = radius;
	}
	
	public void set(float x, float y, float z, float radius)
	{
		if (this instanceof Immutably) throw new ImmutablyException();
		
		super.set(x, y, z);
		setRadius(radius);
	}
	
	public void set(float x, float y, float z, int worldId, float radius)
	{
		if (this instanceof Immutably) throw new ImmutablyException();
		
		super.set(x, y, z, worldId);
		setRadius(radius);
	}
	
	public void set(float x, float y, float z, int interiorId, int worldId, float radius)
	{
		if (this instanceof Immutably) throw new ImmutablyException();
		
		super.set(x, y, z, interiorId, worldId);
		setRadius(radius);
	}
	
	public void set(Vector3D pos, float radius)
	{
		if (this instanceof Immutably) throw new ImmutablyException();
		
		super.set(pos);
		setRadius(radius);
	}
	
	public void set(Vector3D pos, int worldId, float radius)
	{
		if (this instanceof Immutably) throw new ImmutablyException();
		
		super.set(pos, worldId);
		setRadius(radius);
	}
	
	public void set(Vector3D pos, int interiorId, int worldId, float radius)
	{
		if (this instanceof Immutably) throw new ImmutablyException();
		
		super.set(pos, interiorId, worldId);
		setRadius(radius);
	}
	
	public void set(LocationRadius loc)
	{
		if (this instanceof Immutably) throw new ImmutablyException();
		
		super.set(loc);
		setRadius(loc.getRadius());
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
	public LocationRadius clone()
	{
		return (LocationRadius) super.clone();
	}
	
	@Override
	public LocationRadius immure()
	{
		return new ImmutablyLocationRadius(this);
	}
	
	@Override
	public String toString()
	{
		return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE, false);
	}
}

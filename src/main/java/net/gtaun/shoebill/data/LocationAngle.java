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
 * @author MK124
 *
 */

public class LocationAngle extends Location implements Cloneable, Serializable, Immutable
{
	private static final long serialVersionUID = -6964956260244629027L;
	
	
	private static final class ImmutablyLocationAngular extends LocationAngle implements Immutably
	{
		private static final long serialVersionUID = LocationAngle.serialVersionUID;
		
		private ImmutablyLocationAngular( LocationAngle locationAngle )
		{
			super( locationAngle );
		}
		
		@Override
		public LocationAngle clone()
		{
			return new LocationAngle( this );
		}
	}
	
	
	private float angle;
	

	public LocationAngle()
	{
		
	}

	public LocationAngle( float x, float y, float z, float angle )
	{
		super( x, y, z );
		this.angle = angle;
	}

	public LocationAngle( float x, float y, float z, int worldId, float angle )
	{
		super( x, y, z, worldId );
		this.angle = angle;
	}
	
	public LocationAngle( float x, float y, float z, int interiorId, int worldId, float angle )
	{
		super( x, y, z, interiorId, worldId );
		this.angle = angle;
	}

	public LocationAngle( Point3D pos, int worldId, float angle )
	{
		super( pos, worldId );
		this.angle = angle;
	}

	public LocationAngle( Point3D pos, int interiorId, int worldId, float angle )
	{
		super( pos, interiorId, worldId );
		this.angle = angle;
	}
	
	public LocationAngle( Location loc, float angle )
	{
		super( loc );
		this.angle = angle;
	}
	
	public LocationAngle( LocationAngle loc )
	{
		super( loc );
		this.angle = loc.getAngle();
	}
	
	public float getAngle()
	{
		return angle;
	}

	public void setAngle( float angle )
	{
		if( this instanceof Immutably ) throw new ImmutablyException();
		
		this.angle = angle;
	}

	public void set( float x, float y, float z, float angle )
	{
		if( this instanceof Immutably ) throw new ImmutablyException();
		
		super.set( x, y, z );
		setAngle( angle );
	}
	
	public void set( float x, float y, float z, int worldId, float angle )
	{
		if( this instanceof Immutably ) throw new ImmutablyException();
		
		super.set( x, y, z, worldId );
		this.angle = angle;
	}
	
	public void set( float x, float y, float z, int interiorId, int worldId, float angle )
	{
		if( this instanceof Immutably ) throw new ImmutablyException();
		
		super.set( x, y, z, interiorId, worldId );
		this.angle = angle;
	}
	

	public void set( Point3D pos, float angle )
	{
		if( this instanceof Immutably ) throw new ImmutablyException();
		
		super.set( pos );
		setAngle( angle );
	}
	
	public void set( Point3D pos, int worldId, float angle )
	{
		if( this instanceof Immutably ) throw new ImmutablyException();
		
		super.set( pos );
		setAngle( angle );
	}
	
	public void set( Point3D pos, int interiorId, int worldId, float angle )
	{
		if( this instanceof Immutably ) throw new ImmutablyException();
		
		super.set( pos, interiorId, worldId );
		setAngle( angle );
	}

	public void set( LocationAngle loc )
	{
		if( this instanceof Immutably ) throw new ImmutablyException();
		
		super.set( loc );
		setAngle( loc.getAngle() );
	}
	
	@Override
	public int hashCode()
	{
		return HashCodeBuilder.reflectionHashCode(179424691, 198491317, this, false);
	}
	
	@Override
	public boolean equals( Object obj )
	{
		return EqualsBuilder.reflectionEquals(this, obj, false);
	}
	
	@Override
	public LocationAngle clone()
	{
		return (LocationAngle) super.clone();
	}
	
	@Override
	public LocationAngle immure()
	{
		return new ImmutablyLocationAngular(this);
	}
	
	@Override
	public String toString()
	{
		return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE, false);
	}
}

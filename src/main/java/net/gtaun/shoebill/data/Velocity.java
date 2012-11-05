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

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * @author MK124
 *
 */

public class Velocity extends Vector3D implements Cloneable, Serializable, Immutable
{
	private static final long serialVersionUID = 6111643976368753336L;
	
	
	private static final class ImmutablyVelocity extends Velocity implements Immutably
	{
		private static final long serialVersionUID = Velocity.serialVersionUID;
		
		private ImmutablyVelocity( Velocity velocity )
		{
			super( velocity );
		}
		
		@Override
		public Velocity clone()
		{
			return new Velocity( this );
		}
	}
	

	public Velocity()
	{
		
	}

	public Velocity( float x, float y, float z )
	{
		super( x, y, z );
	}

	public Velocity( Vector3D vec )
	{
		super( vec );
	}
	
	public float speed2d()
	{
		return (float) Math.sqrt( getX()*getX() + getY()*getY() );
	}
	
	public float speed3d()
	{
		return (float) Math.sqrt( getX()*getX() + getY()*getY() + getZ()*getZ() );
	}
	
	public float angle2d()
	{
		return (float) Math.acos( getX()/Math.abs(speed2d()) );
	}
	
	public float angleZ()
	{
		return (float) Math.acos( getZ()/Math.abs(speed3d()) );
	}
	
	@Override
	public int hashCode()
	{
		return HashCodeBuilder.reflectionHashCode(413158523, 941083981, this, false);
	}
	
	@Override
	public boolean equals( Object obj )
	{
		return EqualsBuilder.reflectionEquals(this, obj, false);
	}
	
	@Override
	public Velocity clone()
	{
		return (Velocity) super.clone();
	}
	
	@Override
	public Velocity immure()
	{
		return new ImmutablyVelocity(this);
	}
	
	@Override
	public String toString()
	{
		return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE, false);
	}
}

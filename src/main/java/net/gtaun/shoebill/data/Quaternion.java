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
 * @author JoJLlmAn
 *
 */

public class Quaternion extends Vector3D implements Cloneable, Serializable, Immutable
{
	private static final long serialVersionUID = 455013800771095435L;
	
	
	private static final class ImmutablyQuaternions extends Quaternion implements Immutably
	{
		private static final long serialVersionUID = Quaternion.serialVersionUID;
		
		private ImmutablyQuaternions( Quaternion quaternions )
		{
			super( quaternions );
		}
		
		@Override
		public Quaternion clone()
		{
			return new Quaternion( this );
		}
	}
	
	
	private float w;
	
	
	public Quaternion()
	{
		
	}

	public Quaternion( float x, float y, float z, float w )
	{
		super( x, y, z );
		this.w = w;
	}

	public Quaternion( Vector3D vec, float w )
	{
		super( vec );
		this.w = w;
	}
	
	public Quaternion( Quaternion quat )
	{
		super( quat );
		this.w = quat.getW();
	}
	
	public float getW()
	{
		return w;
	}

	public void setW( float w )
	{
		this.w = w;
	}

	public void set( float x, float y, float z, float w )
	{
		if( this instanceof Immutably ) throw new ImmutablyException();
		
		super.set( x, y, z );
		setW( w );
	}
	
	public void set( Vector3D vec, float w )
	{
		if( this instanceof Immutably ) throw new ImmutablyException();
		
		super.set( vec );
		setW( w );
	}
	
	public void set( Quaternion quat )
	{
		if( this instanceof Immutably ) throw new ImmutablyException();
		
		super.set( quat );
		setW( quat.getW() );
	}

	public Quaternion getConjugate()
	{
		return new Quaternion(-getX(), -getY(), -getZ(), getW());
	}
	
	public float[][] transformMatrix()
	{
		float[][] matrix = new float[4][4];
		float x = getX(), y = getY(), z = getZ();
		
		matrix[0][0] = 1 - 2 * (y*y + z*z);
		matrix[0][1] = 	   2 * (x*y - w*z);
		matrix[0][2] = 	   2 * (w*y + x*z);
		matrix[0][3] = 0;
		
		matrix[1][0] =     2 * (x*y + w*z);
		matrix[1][1] = 1 - 2 * (x*x + z*z);
		matrix[1][2] =     2 * (y*z - w*x);
		matrix[1][3] = 0;
		
		matrix[2][0] =     2 * (x*z - w*y);
		matrix[2][1] =     2 * (y*z + w*x);
		matrix[2][2] = 1 - 2 * (x*x + y*y);
		matrix[2][3] = 0;
		
		matrix[3][0] = 0;
		matrix[3][1] = 0;
		matrix[3][2] = 0;
		matrix[3][3] = 1;
		
		return matrix;
	}
	
	public float[] rotatedMatrix( float dx, float dy, float dz, double angle )
	{
		float x = getX(), y = getY(), z = getZ();
		float w = (float) Math.cos(angle / 2);
		
		float[][] matrix = new float[3][3];
		
		matrix[0][0] = 1 - 2 * (y*y + z*z);
		matrix[0][1] = 	   2 * (x*y - w*z);
		matrix[0][2] = 	   2 * (w*y + x*z);
		
		matrix[1][0] =     2 * (x*y + w*z);
		matrix[1][1] = 1 - 2 * (x*x + z*z);
		matrix[1][2] =     2 * (y*z - w*x);
		
		matrix[2][0] =     2 * (x*z - w*y);
		matrix[2][1] =     2 * (y*z + w*x);
		matrix[2][2] = 1 - 2 * (x*x + y*y);
		
		float[] rotated = new float[3];
		
		rotated[0] = dx*matrix[0][0] + dy*matrix[0][1] + dz*matrix[0][2];
		rotated[1] = dx*matrix[1][0] + dy*matrix[1][1] + dz*matrix[1][2];
		rotated[2] = dx*matrix[2][0] + dy*matrix[2][1] + dz*matrix[2][2];
		
		return rotated;
	}
	
	@Override
	public int hashCode()
	{
		return HashCodeBuilder.reflectionHashCode(295075147, 633910099, this, false);
	}
	
	@Override
	public boolean equals( Object obj )
	{
		return EqualsBuilder.reflectionEquals(this, obj, false);
	}
	
	@Override
	public Quaternion clone()
	{
		return (Quaternion) super.clone();
	}
	
	@Override
	public Quaternion immure()
	{
		return new ImmutablyQuaternions(this);
	}
	
	@Override
	public String toString()
	{
		return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE, false);
	}
}

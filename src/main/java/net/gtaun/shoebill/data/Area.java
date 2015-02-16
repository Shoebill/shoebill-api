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
public class Area implements Cloneable, Serializable, RangeCheckable3D
{
	private static final long serialVersionUID = 4319892622317856825L;

	public float minX, minY, maxX, maxY;

	public Area(float minX, float minY, float maxX, float maxY)
	{
		this.minX = minX;
		this.minY = minY;
		this.maxX = maxX;
		this.maxY = maxY;
	}

	public Area(Area area)
	{
		this.minX = area.getMinX();
		this.minY = area.getMinY();
		this.maxX = area.getMaxX();
		this.maxY = area.getMaxY();
	}

	public float getMinX()
	{
		return minX;
	}

	public void setMinX(float minX)
	{
		this.minX = minX;
	}

	public float getMinY()
	{
		return minY;
	}

	public void setMinY(float minY)
	{
		this.minY = minY;
	}

	public float getMaxX()
	{
		return maxX;
	}

	public void setMaxX(float maxX)
	{
		this.maxX = maxX;
	}

	public float getMaxY()
	{
		return maxY;
	}

	public void setMaxY(float maxY)
	{
		this.maxY = maxY;
	}

	public void set(float minX, float minY, float maxX, float maxY)
	{
		setMinX(minX);
		setMinY(minY);
		setMaxX(maxX);
		setMaxY(maxY);
	}

	public void set(Area area)
	{
		setMinX(area.getMinX());
		setMinY(area.getMinY());
		setMaxX(area.getMaxX());
		setMaxY(area.getMaxY());
	}

	public float area()
	{
		return (maxX - minX) * (maxY - minY);
	}

	public boolean isInRange(Vector2D pos)
	{
		float x = pos.getX(), y = pos.getY();
		if (x < minX || x > maxX) return false;
		if (y < minY || y > maxY) return false;
		return true;
	}

	@Override
	public boolean isInRange(Vector3D pos)
	{
		return isInRange((Vector2D) pos);
	}

	@Override
	public int hashCode()
	{
		return HashCodeBuilder.reflectionHashCode(275604547, 295075147, this, false);
	}

	@Override
	public boolean equals(Object obj)
	{
		return EqualsBuilder.reflectionEquals(this, obj, false);
	}

	@Override
	public Area clone()
	{
		try
		{
			return (Area) super.clone();
		}
		catch (CloneNotSupportedException e)
		{
			throw new InternalError();
		}
	}

	@Override
	public String toString()
	{
		return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE, false);
	}
}

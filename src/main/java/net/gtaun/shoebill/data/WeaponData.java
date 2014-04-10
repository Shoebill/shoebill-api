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

import java.io.Serializable;

import net.gtaun.shoebill.constant.WeaponModel;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 
 * 
 * @author MK124
 */
public class WeaponData implements Cloneable, Serializable
{
	private static final long serialVersionUID = 8584508544432627380L;
	
	
	public WeaponModel model;
	public int ammo;
	
	
	public WeaponData()
	{
		model = WeaponModel.NONE;
		ammo = 0;
	}
	
	public WeaponData(WeaponModel type, int ammo)
	{
		this.model = type;
		this.ammo = ammo;
	}
	
	public WeaponData(WeaponData data)
	{
		this.model = data.getModel();
		this.ammo = data.getAmmo();
	}
	
	public WeaponModel getModel()
	{
		return model;
	}
	
	public void setModel(WeaponModel model)
	{
		this.model = model;
	}
	
	public int getAmmo()
	{
		return ammo;
	}
	
	public void setAmmo(int ammo)
	{
		this.ammo = ammo;
	}
	
	public void set(WeaponModel type, int ammo)
	{
		setModel(type);
		setAmmo(ammo);
	}
	
	public void set(WeaponData data)
	{
		setModel(data.getModel());
		setAmmo(data.getAmmo());
	}
	
	@Override
	public int hashCode()
	{
		return HashCodeBuilder.reflectionHashCode(275604547, 817504253, this, false);
	}
	
	@Override
	public boolean equals(Object obj)
	{
		return EqualsBuilder.reflectionEquals(this, obj, false);
	}
	
	@Override
	public WeaponData clone()
	{
		try
		{
			return (WeaponData) super.clone();
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

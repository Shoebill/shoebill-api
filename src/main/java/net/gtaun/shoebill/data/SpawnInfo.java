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

import net.gtaun.shoebill.constant.WeaponModel;
import net.gtaun.shoebill.util.immutable.CanImmutable;
import net.gtaun.shoebill.util.immutable.Immutable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 
 * 
 * @author MK124
 */
public class SpawnInfo implements Cloneable, Serializable, CanImmutable
{
	private static final long serialVersionUID = -1494282877268559489L;
	
	
	public static final class ImmutableSpawnInfo extends SpawnInfo implements Immutable
	{
		private static final long serialVersionUID = SpawnInfo.serialVersionUID;
		

		private ImmutableSpawnInfo()
		{
			
		}
		
		private ImmutableSpawnInfo(SpawnInfo spawnInfo)
		{
			super(spawnInfo.getLocation().immutable(), spawnInfo.getSkinId(), spawnInfo.getTeamId(), spawnInfo.getWeapon1().immutable(), spawnInfo.getWeapon2().immutable(), spawnInfo.getWeapon3().immutable());
		}
		
		@Override
		public ImmutableSpawnInfo clone()
		{
			return this;
		}
	}
	
	
	private AngledLocation location;
	private int skinId, teamId;
	private WeaponData weapon1, weapon2, weapon3;
	

	public SpawnInfo(float x, float y, float z, int interiorId, int worldId, float angle, int skin, int team, WeaponModel weapon1, int ammo1, WeaponModel weapon2, int ammo2, WeaponModel weapon3, int ammo3)
	{
		location = new AngledLocation(x, y, z, interiorId, worldId, angle);
		this.skinId = skin;
		this.teamId = team;
		this.weapon1 = new WeaponData(weapon1, ammo1);
		this.weapon2 = new WeaponData(weapon2, ammo2);
		this.weapon3 = new WeaponData(weapon3, ammo3);
	}
	
	public SpawnInfo(Vector3D vec, int interiorId, int worldId, float angle, int skin, int team, WeaponModel weapon1, int ammo1, WeaponModel weapon2, int ammo2, WeaponModel weapon3, int ammo3)
	{
		location = new AngledLocation(vec, interiorId, worldId, angle);
		this.skinId = skin;
		this.teamId = team;
		this.weapon1 = new WeaponData(weapon1, ammo1);
		this.weapon2 = new WeaponData(weapon2, ammo2);
		this.weapon3 = new WeaponData(weapon3, ammo3);
	}
	
	public SpawnInfo(Location loc, float angle, int skin, int team, WeaponModel weapon1, int ammo1, WeaponModel weapon2, int ammo2, WeaponModel weapon3, int ammo3)
	{
		location = new AngledLocation(loc, angle);
		this.skinId = skin;
		this.teamId = team;
		this.weapon1 = new WeaponData(weapon1, ammo1);
		this.weapon2 = new WeaponData(weapon2, ammo2);
		this.weapon3 = new WeaponData(weapon3, ammo3);
	}
	
	public SpawnInfo(AngledLocation loc, int skin, int team, WeaponData weapon1, WeaponData weapon2, WeaponData weapon3)
	{
		this.location = new AngledLocation(loc);
		this.skinId = skin;
		this.teamId = team;
		this.weapon1 = new WeaponData(weapon1);
		this.weapon2 = new WeaponData(weapon2);
		this.weapon3 = new WeaponData(weapon3);
	}

	public SpawnInfo(float x, float y, float z, int interiorId, int worldId, float angle, int skin, WeaponModel weapon1, int ammo1, WeaponModel weapon2, int ammo2, WeaponModel weapon3, int ammo3)
	{
		location = new AngledLocation(x, y, z, interiorId, worldId, angle);
		this.skinId = skin;
		this.teamId = 255;
		this.weapon1 = new WeaponData(weapon1, ammo1);
		this.weapon2 = new WeaponData(weapon2, ammo2);
		this.weapon3 = new WeaponData(weapon3, ammo3);
	}
	
	public SpawnInfo(Vector3D vec, int interiorId, int worldId, float angle, int skin, WeaponModel weapon1, int ammo1, WeaponModel weapon2, int ammo2, WeaponModel weapon3, int ammo3)
	{
		location = new AngledLocation(vec, interiorId, worldId, angle);
		this.skinId = skin;
		this.teamId = 255;
		this.weapon1 = new WeaponData(weapon1, ammo1);
		this.weapon2 = new WeaponData(weapon2, ammo2);
		this.weapon3 = new WeaponData(weapon3, ammo3);
	}
	
	public SpawnInfo(Location loc, float angle, int skin, WeaponModel weapon1, int ammo1, WeaponModel weapon2, int ammo2, WeaponModel weapon3, int ammo3)
	{
		location = new AngledLocation(loc, angle);
		this.skinId = skin;
		this.teamId = 255;
		this.weapon1 = new WeaponData(weapon1, ammo1);
		this.weapon2 = new WeaponData(weapon2, ammo2);
		this.weapon3 = new WeaponData(weapon3, ammo3);
	}
	
	public SpawnInfo(AngledLocation loc, int skin, WeaponData weapon1, WeaponData weapon2, WeaponData weapon3)
	{
		this.location = new AngledLocation(loc);
		this.skinId = skin;
		this.teamId = 255;
		this.weapon1 = new WeaponData(weapon1);
		this.weapon2 = new WeaponData(weapon2);
		this.weapon3 = new WeaponData(weapon3);
	}
	
	public SpawnInfo(SpawnInfo info)
	{
		this.location = new AngledLocation(info.getLocation());
		this.skinId = info.getSkinId();
		this.teamId = info.getTeamId();
		this.weapon1 = new WeaponData(weapon1);
		this.weapon2 = new WeaponData(weapon2);
		this.weapon3 = new WeaponData(weapon3);
	}
	
	public SpawnInfo()
	{
		location = new AngledLocation();
	}
	
	public AngledLocation getLocation()
	{
		return location.clone();
	}
	
	public void setLocation(AngledLocation loc)
	{
		if (this instanceof Immutable) throw new UnsupportedOperationException();
		
		this.location.set(loc);
	}
	
	public int getSkinId()
	{
		return skinId;
	}
	
	public void setSkinId(int skinId)
	{
		if (this instanceof Immutable) throw new UnsupportedOperationException();
		this.skinId = skinId;
	}
	
	public int getTeamId()
	{
		return teamId;
	}
	
	public void setTeamId(int teamId)
	{
		if (this instanceof Immutable) throw new UnsupportedOperationException();
		this.teamId = teamId;
	}
	
	public WeaponData getWeapon1()
	{
		return weapon1;
	}
	
	public void setWeapon1(WeaponData weapon1)
	{
		if (this instanceof Immutable) throw new UnsupportedOperationException();
		this.weapon1 = weapon1;
	}
	
	public WeaponData getWeapon2()
	{
		return weapon2;
	}
	
	public void setWeapon2(WeaponData weapon2)
	{
		if (this instanceof Immutable) throw new UnsupportedOperationException();
		this.weapon2 = weapon2;
	}
	
	public WeaponData getWeapon3()
	{
		return weapon3;
	}
	
	public void setWeapon3(WeaponData weapon3)
	{
		if (this instanceof Immutable) throw new UnsupportedOperationException();
		this.weapon3 = weapon3;
	}
	
	@Override
	public int hashCode()
	{
		return HashCodeBuilder.reflectionHashCode(492876847, 715225739, this, false);
	}
	
	@Override
	public boolean equals(Object obj)
	{
		return EqualsBuilder.reflectionEquals(this, obj, false);
	}
	
	@Override
	public SpawnInfo clone()
	{
		try
		{
			return (SpawnInfo) super.clone();
		}
		catch (CloneNotSupportedException e)
		{
			throw new InternalError();
		}
	}
	
	@Override
	public Object immutable()
	{
		return new ImmutableSpawnInfo(this);
	}
	
	@Override
	public String toString()
	{
		return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE, false);
	}
}

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

package net.gtaun.shoebill.constant;

/**
 * @author MK124
 *
 */

public enum WeaponSkill
{
	PISTOL				(0),
	PISTOL_SILENCED		(1),
	DESERT_EAGLE		(2),
	SHOTGUN				(3),
	SAWNOFF_SHOTGUN		(4),
	SPAS12_SHOTGUN		(5),
	MICRO_UZI			(6),
	MP5					(7),
	AK47				(8),
	M4					(9),
	SNIPERRIFLE			(10);
	
	
	public static WeaponSkill get( int id )
	{
		return values() [id];
	}
	
	
	private final int data;
	
	
	private WeaponSkill( int data )
	{
		this.data = data;
	}
	
	public int getData()
	{
		return data;
	}
}

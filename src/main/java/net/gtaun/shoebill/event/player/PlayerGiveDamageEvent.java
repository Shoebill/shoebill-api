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

package net.gtaun.shoebill.event.player;

import net.gtaun.shoebill.object.IPlayer;

/**
 * @author MK124
 *
 */

public class PlayerGiveDamageEvent extends PlayerEvent
{
	private IPlayer victim;
	private float amount;
	private int weaponId;
	
	public IPlayer getVictim()		{ return victim; }
	public float getAmount()		{ return amount; }
	public int getWeaponId()		{ return weaponId; }
	
	
	public PlayerGiveDamageEvent( IPlayer player, IPlayer victim, float amount, int weaponId )
	{
		super( player );
		this.victim = victim;
		this.amount = amount;
		this.weaponId = weaponId;
	}
}

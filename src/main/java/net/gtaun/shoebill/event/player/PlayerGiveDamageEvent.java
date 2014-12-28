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

import net.gtaun.shoebill.constant.WeaponModel;
import net.gtaun.shoebill.object.Player;
import net.gtaun.util.event.Interruptable;

/**
 * 
 * 
 * @author MK124
 */
public class PlayerGiveDamageEvent extends PlayerEvent implements Interruptable
{
	private Player victim;
	private WeaponModel weapon;
	private float amount;
	private int bodyPart;
	
	
	public PlayerGiveDamageEvent(Player player, Player victim, float amount, int weaponId, int bodyPart)
	{
		super(player);
		this.victim = victim;
		this.amount = amount;
		this.weapon = WeaponModel.get(weaponId);
		this.bodyPart = bodyPart;
	}
	
	@Override
	public void interrupt()
	{
		super.interrupt();
	}
	
	public Player getVictim()
	{
		return victim;
	}
	
	public float getAmount()
	{
		return amount;
	}
	
	public WeaponModel getWeapon()
	{
		return weapon;
	}
	
	public int getBodyPart()
	{
		return bodyPart;
	}
}

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
public class PlayerTakeDamageEvent extends PlayerEvent implements Interruptable
{
	private Player issuer;
	private WeaponModel weapon;
	private float amount;
	
	
	public PlayerTakeDamageEvent(Player player, Player issuer, float amount, int weaponId)
	{
		super(player);
		this.issuer = issuer;
		this.amount = amount;
		this.weapon = WeaponModel.get(weaponId);
	}
	
	@Override
	public void interrupt()
	{
		super.interrupt();
	}
	
	public Player getIssuer()
	{
		return issuer;
	}
	
	public WeaponModel getWeapon()
	{
		return weapon;
	}
	
	public float getAmount()
	{
		return amount;
	}
}

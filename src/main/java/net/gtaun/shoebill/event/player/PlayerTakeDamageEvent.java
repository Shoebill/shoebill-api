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
 * This event represents the OnPlayerTakeDamage of Pawn.
 * 
 * @author MK124
 * @see net.gtaun.shoebill.event.player.PlayerEvent
 * @see <a href="https://wiki.sa-mp.com/wiki/OnPlayerTakeDamage">OnPlayerTakeDamage</a>
 */
public class PlayerTakeDamageEvent extends PlayerEvent implements Interruptable
{
	private Player issuer;
	private WeaponModel weapon;
	private float amount;
	private int bodyPart;
	private int ret;
	
	public PlayerTakeDamageEvent(Player player, Player issuer, float amount, int weaponId, int bodypart)
	{
		super(player);
		this.issuer = issuer;
		this.amount = amount;
		this.weapon = WeaponModel.get(weaponId);
		this.bodyPart = bodypart;
	}
	
	/*
	 * (non-Javadoc)
	 * @see net.gtaun.util.event.Event#interrupt()
	 */
	@Override
	public void interrupt()
	{
		super.interrupt();
	}
    
    /**
     * @return The associated issuer for this event.
     */
	public Player getIssuer()
	{
		return issuer;
	}
    
    /**
     * @return The associated used WeaponModel of issuer for this event.
     */
	public WeaponModel getWeapon()
	{
		return weapon;
	}
    
    /**
     * @return The associated amount of damage for this event.
     */
	public float getAmount()
	{
		return amount;
	}
    
    /**
     * @return The associated id of hitted bodypart for this event.
     */
	public int getBodyPart()
	{
		return bodyPart;
	}
	
	/**
     * Disallows the further execution of this event in the whole abstract machine (also Pawn and other Plugins).
     */
	public void disallow() {
		this.ret &= 0;
	}

	/**
     * Returns the current response value
     * @return Current response value
     */
	public int getResponse() {
		return ret;
	}
}

/**
 * Copyright (C) 2011-2012 MK124
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

package net.gtaun.shoebill;

import java.util.Collection;

import net.gtaun.shoebill.object.Dialog;
import net.gtaun.shoebill.object.Label;
import net.gtaun.shoebill.object.Menu;
import net.gtaun.shoebill.object.Pickup;
import net.gtaun.shoebill.object.Player;
import net.gtaun.shoebill.object.PlayerLabel;
import net.gtaun.shoebill.object.PlayerObject;
import net.gtaun.shoebill.object.SampObject;
import net.gtaun.shoebill.object.Server;
import net.gtaun.shoebill.object.Textdraw;
import net.gtaun.shoebill.object.Timer;
import net.gtaun.shoebill.object.Vehicle;
import net.gtaun.shoebill.object.World;
import net.gtaun.shoebill.object.Zone;

/**
 * 
 * 
 * @author MK124
 */
public interface SampObjectStore
{
	/**
	 * Get Server instance.
	 * 
	 * @return Server instance.
	 */
	Server getServer();
	
	/**
	 * Get World instance.
	 * 
	 * @return World instance.
	 */
	World getWorld();
	
	/**
	 * Get Player instance with id.
	 * 
	 * @param id ID of Player.
	 * @return Player instance. If not exist, then it return {@code null}.
	 */
	Player getPlayer(int id);
	
	/**
	 * Get vehicle instance with id.
	 * 
	 * @param id ID of Vehicle.
	 * @return Vehicle instance. If not exist, then it return {@code null}.
	 */
	Vehicle getVehicle(int id);
	
	/**
	 * Get SampObject instance with id.
	 * 
	 * @param id ID of Object.
	 * @return SampObject instance. If not exist, then it return {@code null}.
	 */
	SampObject getObject(int id);
	
	/**
	 * Get PlayerObject instance with id.
	 * 
	 * @param player Player instance.
	 * @param id ID of PlayerObject.
	 * @return PlayerObject instance. If not exist, then it return {@code null}.
	 */
	PlayerObject getPlayerObject(Player player, int id);
	
	/**
	 * Get Pickup instance with id.
	 * 
	 * @param id ID of Pickup.
	 * @return Pickup instance. If not exist, then it return {@code null}.
	 */
	Pickup getPickup(int id);
	
	/**
	 * Get Label instance with id.
	 * 
	 * @param id ID of Label.
	 * @return Label instance. If not exist, then it return {@code null}.
	 */
	Label getLabel(int id);
	
	/**
	 * Get PlayerLabel instance with id.
	 * 
	 * @param id ID of PlayerLabel.
	 * @return PlayerLabel instance. If not exist, then it return {@code null}.
	 */
	PlayerLabel getPlayerLabel(Player player, int id);
	
	/**
	 * Get Textdraw instance with id.
	 * 
	 * @param id ID of Textdraw.
	 * @return Textdraw instance. If not exist, then it return {@code null}.
	 */
	Textdraw getTextdraw(int id);
	
	/**
	 * Get Zone instance with id.
	 * 
	 * @param id ID of Zone.
	 * @return Zone instance. If not exist, then it return {@code null}.
	 */
	Zone getZone(int id);
	
	/**
	 * Get Menu instance with id.
	 * 
	 * @param id ID of Menu.
	 * @return Menu instance. If not exist, then it return {@code null}.
	 */
	Menu getMenu(int id);
	
	/**
	 * Get Dialog instance with id.
	 * 
	 * @param id ID of Dialog.
	 * @return Dialog instance. If not exist, then it return {@code null}.
	 */
	Dialog getDialog(int id);
	
	Collection<Player> getPlayers();
	Collection<Vehicle> getVehicles();
	Collection<SampObject> getObjects();
	Collection<PlayerObject> getPlayerObjects(Player player);
	Collection<Pickup> getPickups();
	Collection<Label> getLabels();
	Collection<PlayerLabel> getPlayerLabels(Player player);
	Collection<Textdraw> getTextdraws();
	Collection<Zone> getZones();
	Collection<Menu> getMenus();
	Collection<Dialog> getDialogs();
	Collection<Timer> getTimers();
}

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

package net.gtaun.shoebill;

import java.util.Collection;

import net.gtaun.shoebill.object.Dialog;
import net.gtaun.shoebill.object.Label;
import net.gtaun.shoebill.object.Menu;
import net.gtaun.shoebill.object.IObject;
import net.gtaun.shoebill.object.Pickup;
import net.gtaun.shoebill.object.Player;
import net.gtaun.shoebill.object.PlayerLabel;
import net.gtaun.shoebill.object.PlayerObject;
import net.gtaun.shoebill.object.Server;
import net.gtaun.shoebill.object.Textdraw;
import net.gtaun.shoebill.object.Timer;
import net.gtaun.shoebill.object.Vehicle;
import net.gtaun.shoebill.object.World;
import net.gtaun.shoebill.object.Zone;

/**
 * @author MK124
 *
 */

public interface ISampObjectPool
{
	Server getServer();
	World getWorld();
	
	Player getPlayer( int id );
	Vehicle getVehicle( int id );
	IObject getObject( int id );
	PlayerObject getPlayerObject( Player player, int id );
	Pickup getPickup( int id );
	Label getLabel( int id );
	PlayerLabel getPlayerLabel( Player player, int id );
	Textdraw getTextdraw( int id );
	Zone getZone( int id );
	Menu getMenu( int id );
	Dialog getDialog( int id );
	
	Collection<Player> getPlayers();
	Collection<Vehicle> getVehicles();
	Collection<IObject> getObjects();
	Collection<PlayerObject> getPlayerObjects( Player player );
	Collection<Pickup> getPickups();
	Collection<Label> getLabels();
	Collection<PlayerLabel> getPlayerLabels( Player player );
	Collection<Textdraw> getTextdraws();
	Collection<Zone> getZones();
	Collection<Menu> getMenus();
	Collection<Dialog> getDialogs();
	Collection<Timer> getTimers();

	<T extends Player> Collection<T> getPlayers( Class<T> cls );
	<T extends Vehicle> Collection<T> getVehicles( Class<T> cls );
	<T extends IObject> Collection<T> getObjects( Class<T> cls );
	<T extends PlayerObject> Collection<T> getPlayerObjects( Player player, Class<T> cls );
	<T extends Pickup> Collection<T> getPickups( Class<T> cls );
	<T extends Label> Collection<T> getLabels( Class<T> cls );
	<T extends PlayerLabel> Collection<T> getPlayerLabels( Player player, Class<T> cls );
	<T extends Textdraw> Collection<T> getTextdraws( Class<T> cls );
	<T extends Zone> Collection<T> getZones( Class<T> cls );
	<T extends Menu> Collection<T> getMenus( Class<T> cls );
	<T extends Dialog> Collection<T> getDialogs( Class<T> cls );
	<T extends Timer> Collection<T> getTimers( Class<T> cls );
}

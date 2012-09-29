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

import net.gtaun.shoebill.object.primitive.DialogPrim;
import net.gtaun.shoebill.object.primitive.LabelPrim;
import net.gtaun.shoebill.object.primitive.MenuPrim;
import net.gtaun.shoebill.object.primitive.ObjectPrim;
import net.gtaun.shoebill.object.primitive.PickupPrim;
import net.gtaun.shoebill.object.primitive.PlayerPrim;
import net.gtaun.shoebill.object.primitive.PlayerLabelPrim;
import net.gtaun.shoebill.object.primitive.PlayerObjectPrim;
import net.gtaun.shoebill.object.primitive.ServerPrim;
import net.gtaun.shoebill.object.primitive.TextdrawPrim;
import net.gtaun.shoebill.object.primitive.TimerPrim;
import net.gtaun.shoebill.object.primitive.VehiclePrim;
import net.gtaun.shoebill.object.primitive.WorldPrim;
import net.gtaun.shoebill.object.primitive.ZonePrim;

/**
 * @author MK124
 *
 */

public interface ISampObjectPool
{
	ServerPrim getServer();
	WorldPrim getWorld();
	
	PlayerPrim getPlayer( int id );
	VehiclePrim getVehicle( int id );
	ObjectPrim getObject( int id );
	PlayerObjectPrim getPlayerObject( PlayerPrim player, int id );
	PickupPrim getPickup( int id );
	LabelPrim getLabel( int id );
	PlayerLabelPrim getPlayerLabel( PlayerPrim player, int id );
	TextdrawPrim getTextdraw( int id );
	ZonePrim getZone( int id );
	MenuPrim getMenu( int id );
	DialogPrim getDialog( int id );
	
	Collection<PlayerPrim> getPlayers();
	Collection<VehiclePrim> getVehicles();
	Collection<ObjectPrim> getObjects();
	Collection<PlayerObjectPrim> getPlayerObjects( PlayerPrim player );
	Collection<PickupPrim> getPickups();
	Collection<LabelPrim> getLabels();
	Collection<PlayerLabelPrim> getPlayerLabels( PlayerPrim player );
	Collection<TextdrawPrim> getTextdraws();
	Collection<ZonePrim> getZones();
	Collection<MenuPrim> getMenus();
	Collection<DialogPrim> getDialogs();
	Collection<TimerPrim> getTimers();

	<T extends PlayerPrim> Collection<T> getPlayers( Class<T> cls );
	<T extends VehiclePrim> Collection<T> getVehicles( Class<T> cls );
	<T extends ObjectPrim> Collection<T> getObjects( Class<T> cls );
	<T extends PlayerObjectPrim> Collection<T> getPlayerObjects( PlayerPrim player, Class<T> cls );
	<T extends PickupPrim> Collection<T> getPickups( Class<T> cls );
	<T extends LabelPrim> Collection<T> getLabels( Class<T> cls );
	<T extends PlayerLabelPrim> Collection<T> getPlayerLabels( PlayerPrim player, Class<T> cls );
	<T extends TextdrawPrim> Collection<T> getTextdraws( Class<T> cls );
	<T extends ZonePrim> Collection<T> getZones( Class<T> cls );
	<T extends MenuPrim> Collection<T> getMenus( Class<T> cls );
	<T extends DialogPrim> Collection<T> getDialogs( Class<T> cls );
	<T extends TimerPrim> Collection<T> getTimers( Class<T> cls );
}

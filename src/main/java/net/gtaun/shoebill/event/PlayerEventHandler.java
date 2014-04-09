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

package net.gtaun.shoebill.event;

import net.gtaun.shoebill.event.checkpoint.CheckpointEnterEvent;
import net.gtaun.shoebill.event.checkpoint.CheckpointLeaveEvent;
import net.gtaun.shoebill.event.checkpoint.RaceCheckpointEnterEvent;
import net.gtaun.shoebill.event.checkpoint.RaceCheckpointLeaveEvent;
import net.gtaun.shoebill.event.dialog.DialogCancelEvent;
import net.gtaun.shoebill.event.dialog.DialogResponseEvent;
import net.gtaun.shoebill.event.menu.MenuExitedEvent;
import net.gtaun.shoebill.event.menu.MenuSelectedEvent;
import net.gtaun.shoebill.event.object.PlayerObjectMovedEvent;
import net.gtaun.shoebill.event.player.PlayerClickMapEvent;
import net.gtaun.shoebill.event.player.PlayerClickPlayerEvent;
import net.gtaun.shoebill.event.player.PlayerClickPlayerTextDrawEvent;
import net.gtaun.shoebill.event.player.PlayerClickTextDrawEvent;
import net.gtaun.shoebill.event.player.PlayerCommandEvent;
import net.gtaun.shoebill.event.player.PlayerConnectEvent;
import net.gtaun.shoebill.event.player.PlayerDeathEvent;
import net.gtaun.shoebill.event.player.PlayerDisconnectEvent;
import net.gtaun.shoebill.event.player.PlayerEditAttachedObjectEvent;
import net.gtaun.shoebill.event.player.PlayerEditObjectEvent;
import net.gtaun.shoebill.event.player.PlayerEditPlayerObjectEvent;
import net.gtaun.shoebill.event.player.PlayerEnterExitModShopEvent;
import net.gtaun.shoebill.event.player.PlayerGiveDamageEvent;
import net.gtaun.shoebill.event.player.PlayerInteriorChangeEvent;
import net.gtaun.shoebill.event.player.PlayerKeyStateChangeEvent;
import net.gtaun.shoebill.event.player.PlayerKillEvent;
import net.gtaun.shoebill.event.player.PlayerPickupEvent;
import net.gtaun.shoebill.event.player.PlayerRequestClassEvent;
import net.gtaun.shoebill.event.player.PlayerRequestSpawnEvent;
import net.gtaun.shoebill.event.player.PlayerSelectObjectEvent;
import net.gtaun.shoebill.event.player.PlayerSelectPlayerObjectEvent;
import net.gtaun.shoebill.event.player.PlayerSpawnEvent;
import net.gtaun.shoebill.event.player.PlayerStateChangeEvent;
import net.gtaun.shoebill.event.player.PlayerStreamInEvent;
import net.gtaun.shoebill.event.player.PlayerStreamOutEvent;
import net.gtaun.shoebill.event.player.PlayerTakeDamageEvent;
import net.gtaun.shoebill.event.player.PlayerTextEvent;
import net.gtaun.shoebill.event.player.PlayerUpdateEvent;
import net.gtaun.shoebill.event.vehicle.VehicleEnterEvent;
import net.gtaun.shoebill.event.vehicle.VehicleExitEvent;
import net.gtaun.shoebill.event.vehicle.VehicleModEvent;
import net.gtaun.shoebill.event.vehicle.VehiclePaintjobEvent;
import net.gtaun.shoebill.event.vehicle.VehicleResprayEvent;
import net.gtaun.shoebill.event.vehicle.VehicleStreamInEvent;
import net.gtaun.shoebill.event.vehicle.VehicleStreamOutEvent;
import net.gtaun.shoebill.event.vehicle.VehicleUpdateEvent;
import net.gtaun.util.event.AbstractEventHandler;

/**
 * 
 * 
 * @author MK124
 */
public abstract class PlayerEventHandler extends AbstractEventHandler
{
	protected PlayerEventHandler()
	{
		super(PlayerEventHandler.class);
	}
	
	protected void onPlayerConnect(PlayerConnectEvent event)								{ }
	protected void onPlayerDisconnect(PlayerDisconnectEvent event)							{ }
	protected void onPlayerRequestSpawn(PlayerRequestSpawnEvent event)						{ }
	protected void onPlayerSpawn(PlayerSpawnEvent event)									{ }
	protected void onPlayerKill(PlayerKillEvent event)										{ }
	protected void onPlayerDeath(PlayerDeathEvent event)									{ }
	protected void onPlayerText(PlayerTextEvent event)										{ }
	protected void onPlayerCommand(PlayerCommandEvent event)								{ }
	protected void onPlayerRequestClass(PlayerRequestClassEvent event)						{ }
	protected void onPlayerUpdate(PlayerUpdateEvent event)									{ }
	protected void onPlayerStateChange(PlayerStateChangeEvent event)						{ }
	protected void onPlayerEnterCheckpoint(CheckpointEnterEvent event)						{ }
	protected void onPlayerLeaveCheckpoint(CheckpointLeaveEvent event)						{ }
	protected void onPlayerEnterRaceCheckpoint(RaceCheckpointEnterEvent event)				{ }
	protected void onPlayerLeaveRaceCheckpoint(RaceCheckpointLeaveEvent event)				{ }
	protected void onPlayerObjectMoved(PlayerObjectMovedEvent event)						{ }
	protected void onPlayerPickup(PlayerPickupEvent event)									{ }
	protected void onPlayerEnterExitModShop(PlayerEnterExitModShopEvent event)				{ }
	protected void onPlayerInteriorChange(PlayerInteriorChangeEvent event)					{ }
	protected void onPlayerKeyStateChange(PlayerKeyStateChangeEvent event)					{ }
	protected void onPlayerStreamIn(PlayerStreamInEvent event)								{ }
	protected void onPlayerStreamOut(PlayerStreamOutEvent event)							{ }
	protected void onPlayerClickPlayer(PlayerClickPlayerEvent event)						{ }
	protected void onPlayerOthersClick(PlayerClickPlayerEvent event)						{ }
	protected void onPlayerEnterVehicle(VehicleEnterEvent event)							{ }
	protected void onPlayerExitVehicle(VehicleExitEvent event)								{ }
	protected void onPlayerVehicleMod(VehicleModEvent event)								{ }
	protected void onPlayerVehiclePaintjob(VehiclePaintjobEvent event)						{ }
	protected void onPlayerVehicleRespray(VehicleResprayEvent event)						{ }
	protected void onPlayerUnoccupiedVehicleUpdate(VehicleUpdateEvent event)				{ }
	protected void onPlayerVehicleStreamIn(VehicleStreamInEvent event)						{ }
	protected void onPlayerVehicleStreamOut(VehicleStreamOutEvent event)					{ }
	protected void onPlayerDialogResponse(DialogResponseEvent event)						{ }
	protected void onPlayerDialogCancel(DialogCancelEvent event)							{ }
	protected void onPlayerMenuSelected(MenuSelectedEvent event)							{ }
	protected void onPlayerMenuExited(MenuExitedEvent event)								{ }
	protected void onPlayerClickTextDraw(PlayerClickTextDrawEvent event)					{ }
	protected void onPlayerClickPlayerTextDraw(PlayerClickPlayerTextDrawEvent event)		{ }
	protected void onPlayerEditObject(PlayerEditObjectEvent event)							{ }
	protected void onPlayerEditPlayerObject(PlayerEditPlayerObjectEvent event)				{ }
	protected void onPlayerEditAttachedObject(PlayerEditAttachedObjectEvent event)			{ }
	protected void onPlayerSelectObject(PlayerSelectObjectEvent event)						{ }
	protected void onPlayerSelectPlayerObject(PlayerSelectPlayerObjectEvent event)			{ }
	protected void onPlayerClickMap(PlayerClickMapEvent event)								{ }
	protected void onPlayerTakeDamage(PlayerTakeDamageEvent event)							{ }
	protected void onPlayerGiveDamage(PlayerGiveDamageEvent event)							{ }
}

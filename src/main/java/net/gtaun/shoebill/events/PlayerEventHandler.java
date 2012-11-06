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

package net.gtaun.shoebill.events;

import net.gtaun.shoebill.events.checkpoint.CheckpointEnterEvent;
import net.gtaun.shoebill.events.checkpoint.CheckpointLeaveEvent;
import net.gtaun.shoebill.events.checkpoint.RaceCheckpointEnterEvent;
import net.gtaun.shoebill.events.checkpoint.RaceCheckpointLeaveEvent;
import net.gtaun.shoebill.events.dialog.DialogCancelEvent;
import net.gtaun.shoebill.events.dialog.DialogResponseEvent;
import net.gtaun.shoebill.events.menu.MenuExitedEvent;
import net.gtaun.shoebill.events.menu.MenuSelectedEvent;
import net.gtaun.shoebill.events.object.PlayerObjectMovedEvent;
import net.gtaun.shoebill.events.player.PlayerClickPlayerEvent;
import net.gtaun.shoebill.events.player.PlayerCommandEvent;
import net.gtaun.shoebill.events.player.PlayerConnectEvent;
import net.gtaun.shoebill.events.player.PlayerDeathEvent;
import net.gtaun.shoebill.events.player.PlayerDisconnectEvent;
import net.gtaun.shoebill.events.player.PlayerEnterExitModShopEvent;
import net.gtaun.shoebill.events.player.PlayerInteriorChangeEvent;
import net.gtaun.shoebill.events.player.PlayerKeyStateChangeEvent;
import net.gtaun.shoebill.events.player.PlayerKillEvent;
import net.gtaun.shoebill.events.player.PlayerPickupEvent;
import net.gtaun.shoebill.events.player.PlayerRequestClassEvent;
import net.gtaun.shoebill.events.player.PlayerRequestSpawnEvent;
import net.gtaun.shoebill.events.player.PlayerSpawnEvent;
import net.gtaun.shoebill.events.player.PlayerStateChangeEvent;
import net.gtaun.shoebill.events.player.PlayerStreamInEvent;
import net.gtaun.shoebill.events.player.PlayerStreamOutEvent;
import net.gtaun.shoebill.events.player.PlayerTextEvent;
import net.gtaun.shoebill.events.player.PlayerUpdateEvent;
import net.gtaun.shoebill.events.vehicle.VehicleEnterEvent;
import net.gtaun.shoebill.events.vehicle.VehicleExitEvent;
import net.gtaun.shoebill.events.vehicle.VehicleModEvent;
import net.gtaun.shoebill.events.vehicle.VehiclePaintjobEvent;
import net.gtaun.shoebill.events.vehicle.VehicleResprayEvent;
import net.gtaun.shoebill.events.vehicle.VehicleStreamInEvent;
import net.gtaun.shoebill.events.vehicle.VehicleStreamOutEvent;
import net.gtaun.shoebill.events.vehicle.VehicleUnoccupiedUpdateEvent;
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
	
	public void onPlayerConnect(PlayerConnectEvent event)								{ }
	public void onPlayerDisconnect(PlayerDisconnectEvent event)							{ }
	public void onPlayerRequestSpawn(PlayerRequestSpawnEvent event)						{ }
	public void onPlayerSpawn(PlayerSpawnEvent event)									{ }
	public void onPlayerKill(PlayerKillEvent event)										{ }
	public void onPlayerDeath(PlayerDeathEvent event)									{ }
	public void onPlayerText(PlayerTextEvent event)										{ }
	public void onPlayerCommand(PlayerCommandEvent event)								{ }
	public void onPlayerRequestClass(PlayerRequestClassEvent event)						{ }
	public void onPlayerUpdate(PlayerUpdateEvent event)									{ }
	public void onPlayerStateChange(PlayerStateChangeEvent event)						{ }
	public void onPlayerEnterCheckpoint(CheckpointEnterEvent event)						{ }
	public void onPlayerLeaveCheckpoint(CheckpointLeaveEvent event)						{ }
	public void onPlayerEnterRaceCheckpoint(RaceCheckpointEnterEvent event)				{ }
	public void onPlayerLeaveRaceCheckpoint(RaceCheckpointLeaveEvent event)				{ }
	public void onPlayerObjectMoved(PlayerObjectMovedEvent event)						{ }
	public void onPlayerPickup(PlayerPickupEvent event)									{ }
	public void onPlayerEnterExitModShop(PlayerEnterExitModShopEvent event)				{ }
	public void onPlayerInteriorChange(PlayerInteriorChangeEvent event)					{ }
	public void onPlayerKeyStateChange(PlayerKeyStateChangeEvent event)					{ }
	public void onPlayerStreamIn(PlayerStreamInEvent event)								{ }
	public void onPlayerStreamOut(PlayerStreamOutEvent event)							{ }
	public void onPlayerClickPlayer(PlayerClickPlayerEvent event)						{ }
	public void onPlayerOthersClick(PlayerClickPlayerEvent event)						{ }
	public void onPlayerEnterVehicle(VehicleEnterEvent event)							{ }
	public void onPlayerExitVehicle(VehicleExitEvent event)								{ }
	public void onPlayerVehicleMod(VehicleModEvent event)								{ }
	public void onPlayerVehiclePaintjob(VehiclePaintjobEvent event)						{ }
	public void onPlayerVehicleRespray(VehicleResprayEvent event)						{ }
	public void onPlayerUnoccupiedVehicleUpdate(VehicleUnoccupiedUpdateEvent event)		{ }
	public void onPlayerVehicleStreamIn(VehicleStreamInEvent event)						{ }
	public void onPlayerVehicleStreamOut(VehicleStreamOutEvent event)					{ }
	public void onPlayerDialogResponse(DialogResponseEvent event)						{ }
	public void onPlayerDialogCancel(DialogCancelEvent event)							{ }
	public void onPlayerMenuSelected(MenuSelectedEvent event)							{ }
	public void onPlayerMenuExited(MenuExitedEvent event)								{ }
}

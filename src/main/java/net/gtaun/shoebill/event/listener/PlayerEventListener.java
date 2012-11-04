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

package net.gtaun.shoebill.event.listener;

import net.gtaun.shoebill.event.checkpoint.CheckpointEnterEvent;
import net.gtaun.shoebill.event.checkpoint.CheckpointLeaveEvent;
import net.gtaun.shoebill.event.checkpoint.RaceCheckpointEnterEvent;
import net.gtaun.shoebill.event.checkpoint.RaceCheckpointLeaveEvent;
import net.gtaun.shoebill.event.dialog.DialogCancelEvent;
import net.gtaun.shoebill.event.dialog.DialogResponseEvent;
import net.gtaun.shoebill.event.menu.MenuExitedEvent;
import net.gtaun.shoebill.event.menu.MenuSelectedEvent;
import net.gtaun.shoebill.event.object.PlayerObjectMovedEvent;
import net.gtaun.shoebill.event.player.PlayerClickPlayerEvent;
import net.gtaun.shoebill.event.player.PlayerCommandEvent;
import net.gtaun.shoebill.event.player.PlayerConnectEvent;
import net.gtaun.shoebill.event.player.PlayerDeathEvent;
import net.gtaun.shoebill.event.player.PlayerDisconnectEvent;
import net.gtaun.shoebill.event.player.PlayerEnterExitModShopEvent;
import net.gtaun.shoebill.event.player.PlayerInteriorChangeEvent;
import net.gtaun.shoebill.event.player.PlayerKeyStateChangeEvent;
import net.gtaun.shoebill.event.player.PlayerKillEvent;
import net.gtaun.shoebill.event.player.PlayerPickupEvent;
import net.gtaun.shoebill.event.player.PlayerRequestClassEvent;
import net.gtaun.shoebill.event.player.PlayerRequestSpawnEvent;
import net.gtaun.shoebill.event.player.PlayerSpawnEvent;
import net.gtaun.shoebill.event.player.PlayerStateChangeEvent;
import net.gtaun.shoebill.event.player.PlayerStreamInEvent;
import net.gtaun.shoebill.event.player.PlayerStreamOutEvent;
import net.gtaun.shoebill.event.player.PlayerTextEvent;
import net.gtaun.shoebill.event.player.PlayerUpdateEvent;
import net.gtaun.shoebill.event.vehicle.VehicleEnterEvent;
import net.gtaun.shoebill.event.vehicle.VehicleExitEvent;
import net.gtaun.shoebill.event.vehicle.VehicleModEvent;
import net.gtaun.shoebill.event.vehicle.VehiclePaintjobEvent;
import net.gtaun.shoebill.event.vehicle.VehicleResprayEvent;
import net.gtaun.shoebill.event.vehicle.VehicleStreamInEvent;
import net.gtaun.shoebill.event.vehicle.VehicleStreamOutEvent;
import net.gtaun.shoebill.event.vehicle.VehicleUnoccupiedUpdateEvent;
import net.gtaun.util.event.AbstractEventListener;

/**
 * @author MK124
 *
 */

public abstract class PlayerEventListener extends AbstractEventListener
{
	protected PlayerEventListener()
	{
		super( PlayerEventListener.class );
	}
	
	
	public void onPlayerConnect( PlayerConnectEvent event )								{ }
	public void onPlayerDisconnect( PlayerDisconnectEvent event )						{ }
	public void onPlayerRequestSpawn( PlayerRequestSpawnEvent event )					{ }
	public void onPlayerSpawn( PlayerSpawnEvent event )									{ }
	public void onPlayerKill( PlayerKillEvent event )									{ }
	public void onPlayerDeath( PlayerDeathEvent event )									{ }
	public void onPlayerText( PlayerTextEvent event )									{ }
	public void onPlayerCommand( PlayerCommandEvent event )								{ }
	public void onPlayerRequestClass( PlayerRequestClassEvent event )					{ }
	public void onPlayerUpdate( PlayerUpdateEvent event )								{ }
	public void onPlayerStateChange( PlayerStateChangeEvent event )						{ }
	public void onPlayerEnterCheckpoint( CheckpointEnterEvent event )					{ }
	public void onPlayerLeaveCheckpoint( CheckpointLeaveEvent event )					{ }
	public void onPlayerEnterRaceCheckpoint( RaceCheckpointEnterEvent event )			{ }
	public void onPlayerLeaveRaceCheckpoint( RaceCheckpointLeaveEvent event )			{ }
	public void onPlayerObjectMoved( PlayerObjectMovedEvent event )						{ }
	public void onPlayerPickup( PlayerPickupEvent event )								{ }
	public void onPlayerEnterExitModShop( PlayerEnterExitModShopEvent event )			{ }
	public void onPlayerInteriorChange( PlayerInteriorChangeEvent event )				{ }
	public void onPlayerKeyStateChange( PlayerKeyStateChangeEvent event )				{ }
	public void onPlayerStreamIn( PlayerStreamInEvent event )							{ }
	public void onPlayerStreamOut( PlayerStreamOutEvent event )							{ }
	public void onPlayerClickPlayer( PlayerClickPlayerEvent event )						{ }
	public void onPlayerOthersClick( PlayerClickPlayerEvent event )						{ }
	public void onPlayerEnterVehicle( VehicleEnterEvent event )							{ }
	public void onPlayerExitVehicle( VehicleExitEvent event )							{ }
	public void onPlayerVehicleMod( VehicleModEvent event )								{ }
	public void onPlayerVehiclePaintjob( VehiclePaintjobEvent event )					{ }
	public void onPlayerVehicleRespray( VehicleResprayEvent event )						{ }
	public void onPlayerUnoccupiedVehicleUpdate( VehicleUnoccupiedUpdateEvent event )	{ }
	public void onPlayerVehicleStreamIn( VehicleStreamInEvent event )					{ }
	public void onPlayerVehicleStreamOut( VehicleStreamOutEvent event )					{ }
	public void onPlayerDialogResponse( DialogResponseEvent event )						{ }
	public void onPlayerDialogCancel( DialogCancelEvent event )							{ }
	public void onPlayerMenuSelected( MenuSelectedEvent event )							{ }
	public void onPlayerMenuExited( MenuExitedEvent event )								{ }
}

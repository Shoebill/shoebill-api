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

package net.gtaun.shoebill.samp;

/**
 * @author MK124
 *
 */

public interface ISampCallbackHandler
{
	int onGameModeInit();
	int onGameModeExit();
	int onPlayerConnect( int playerId );
	int onPlayerDisconnect( int playerId, int reason );
	int onPlayerSpawn( int playerId );
	int onPlayerDeath( int playerId, int killerId, int reason );
	int onVehicleSpawn( int vehicleId );
	int onVehicleDeath( int vehicleId, int killerId );
	int onPlayerText( int playerId, String text );
	int onPlayerCommandText( int playerId, String cmdtext );
	int onPlayerRequestClass( int playerId, int classId );
	int onPlayerEnterVehicle( int playerId, int vehicleId, int isPassenger );
	int onPlayerExitVehicle( int playerId, int vehicleId );
	int onPlayerStateChange( int playerId, int state, int oldState );
	int onPlayerEnterCheckpoint( int playerId );
	int onPlayerLeaveCheckpoint( int playerId );
	int onPlayerEnterRaceCheckpoint( int playerId );
	int onPlayerLeaveRaceCheckpoint( int playerId );
	int onRconCommand( String cmd );
	int onPlayerRequestSpawn( int playerId );
	int onObjectMoved( int objectId );
	int onPlayerObjectMoved( int playerId, int objectId );
	int onPlayerPickUpPickup( int playerId, int pickupId );
	int onVehicleMod( int playerId, int vehicleId, int componentId );
	int onEnterExitModShop( int playerId, int enterexit, int interiorId );
	int onVehiclePaintjob( int playerId, int vehicleId, int paintjobId );
	int onVehicleRespray( int playerId, int vehicleId, int color1, int color2 );
	int onVehicleDamageStatusUpdate( int vehicleId, int playerId );
	int onUnoccupiedVehicleUpdate( int vehicleId, int playerId, int passengerSeat );
	int onPlayerSelectedMenuRow( int playerId, int row );
	int onPlayerExitedMenu( int playerId );
	int onPlayerInteriorChange( int playerId, int interiorId, int oldInteriorId );
	int onPlayerKeyStateChange( int playerId, int keys, int oldKeys );
	int onRconLoginAttempt( String ip, String password, int isSuccess );
	int onPlayerUpdate( int playerId );
	int onPlayerStreamIn( int playerId, int forPlayerId );
	int onPlayerStreamOut( int playerId, int forPlayerId );
	int onVehicleStreamIn( int vehicleId, int forPlayerId );
	int onVehicleStreamOut( int vehicleId, int forPlayerId );
	int onDialogResponse( int playerId, int dialogId, int response, int listitem, String inputtext );
	int onPlayerTakeDamage( int playerid, int issuerId, float amount, int weaponid );
	int onPlayerGiveDamage( int playerId, int damagedId, float amount, int weaponId );
	int onPlayerClickMap( int playerId, float x, float y, float z );
	int onPlayerClickPlayer( int playerId, int clickedPlayerId, int source );
	void onProcessTick();
}

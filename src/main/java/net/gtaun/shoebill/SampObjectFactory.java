/**
 * Copyright (C) 2012 MK124
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

import net.gtaun.shoebill.data.Area;
import net.gtaun.shoebill.data.Color;
import net.gtaun.shoebill.data.Location;
import net.gtaun.shoebill.data.LocationAngle;
import net.gtaun.shoebill.data.Point2D;
import net.gtaun.shoebill.data.Point3D;
import net.gtaun.shoebill.exception.CreationFailedException;
import net.gtaun.shoebill.object.Dialog;
import net.gtaun.shoebill.object.Label;
import net.gtaun.shoebill.object.Menu;
import net.gtaun.shoebill.object.Pickup;
import net.gtaun.shoebill.object.Player;
import net.gtaun.shoebill.object.PlayerLabel;
import net.gtaun.shoebill.object.PlayerObject;
import net.gtaun.shoebill.object.Textdraw;
import net.gtaun.shoebill.object.Timer;
import net.gtaun.shoebill.object.Vehicle;
import net.gtaun.shoebill.object.Zone;

public interface SampObjectFactory
{
	//Player createPlayer();

	Vehicle createVehicle( int modelId, float x, float y, float z, int interiorId, int worldId, float angle, int color1, int color2, int respawnDelay ) throws CreationFailedException;
	Vehicle createVehicle( int modelId, float x, float y, float z, float angle, int color1, int color2, int respawnDelay ) throws CreationFailedException;
	Vehicle createVehicle( int modelId, Point3D pos, float angle, int color1, int color2, int respawnDelay ) throws CreationFailedException;
	Vehicle createVehicle( int modelId, Point3D pos, int interiorId, int worldId, float angle, int color1, int color2, int respawnDelay ) throws CreationFailedException;
	Vehicle createVehicle( int modelId, Location loc, float angle, int color1, int color2, int respawnDelay ) throws CreationFailedException;
	Vehicle createVehicle( int modelId, LocationAngle loc, int color1, int color2, int respawnDelay ) throws CreationFailedException;

	Object createObject( int modelId, float x, float y, float z, float rx, float ry, float rz ) throws CreationFailedException;
	Object createObject( int modelId, float x, float y, float z, float rx, float ry, float rz, float drawDistance ) throws CreationFailedException;
	Object createObject( int modelId, Location loc, float rx, float ry, float rz ) throws CreationFailedException;
	Object createObject( int modelId, Location loc, float rx, float ry, float rz, float drawDistance) throws CreationFailedException;
	Object createObject( int modelId, Location loc, Point3D rot ) throws CreationFailedException;
	Object createObject( int modelId, Location loc, Point3D rot, float drawDistance ) throws CreationFailedException;

	PlayerObject createPlayerObject( Player player, int modelId, float x, float y, float z, float rx, float ry, float rz ) throws CreationFailedException;
	PlayerObject createPlayerObject( Player player, int modelId, float x, float y, float z, float rx, float ry, float rz, float drawDistance ) throws CreationFailedException;
	PlayerObject createPlayerObject( Player player, int modelId, Location loc, float rx, float ry, float rz ) throws CreationFailedException;
	PlayerObject createPlayerObject( Player player, int modelId, Location loc, float rx, float ry, float rz, float drawDistance ) throws CreationFailedException;
	PlayerObject createPlayerObject( Player player, int modelId, Location loc, Point3D rot ) throws CreationFailedException;
	PlayerObject createPlayerObject( Player player, int modelId, Location loc, Point3D rot, float drawDistance ) throws CreationFailedException;

	Pickup createPickup( int modelId, int type, float x, float y, float z, int worldId ) throws CreationFailedException;
	Pickup createPickup( int modelId, int type, float x, float y, float z ) throws CreationFailedException;
	Pickup createPickup( int modelId, int type, Location loc ) throws CreationFailedException;

	Label createLabel( String text, Color color, float x, float y, float z, int worldId, float drawDistance, boolean testLOS ) throws CreationFailedException;
	Label createLabel( String text, Color color, Point3D pos, int worldId, float drawDistance, boolean testLOS ) throws CreationFailedException;
	Label createLabel( String text, Color color, Location loc, float drawDistance, boolean testLOS ) throws CreationFailedException;

	PlayerLabel createPlayerLabel( Player player, String text, Color color, float x, float y, float z, float drawDistance, boolean testLOS );
	PlayerLabel createPlayerLabel( Player player, String text, Color color, float x, float y, float z, int worldId, float drawDistance, boolean testLOS );
	PlayerLabel createPlayerLabel( Player player, String text, Color color, Location loc, float drawDistance, boolean testLOS );
	PlayerLabel createPlayerLabel( Player player, String text, Color color, Location loc, float drawDistance, boolean testLOS, Player attachedPlayer );
	PlayerLabel createPlayerLabel( Player player, String text, Color color, Location loc, float drawDistance, boolean testLOS, Vehicle attachedVehicle );

	Textdraw createTextdraw( float x, float y );
	Textdraw createTextdraw( float x, float y, String text );
	Textdraw createTextdraw( Point2D pos );
	Textdraw createTextdraw( Point2D pos, String text );

	Zone createZone( float minX, float minY, float maxX, float maxY );
	Zone createZone( Area area );

	Menu createMenu( String title, int columns, float x, float y, float col1Width, float col2Width );
	Menu createMenu( String title, int columns, Point2D pos, float col1Width, float col2Width );

	Dialog createDialog();

	Timer createTimer( int interval );
	Timer createTimer( int interval, int count );
}

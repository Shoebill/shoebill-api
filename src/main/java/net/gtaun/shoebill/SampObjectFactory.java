/**
 * Copyright (C) 2012-2014 MK124
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

import net.gtaun.shoebill.data.AngledLocation;
import net.gtaun.shoebill.data.Area;
import net.gtaun.shoebill.data.Color;
import net.gtaun.shoebill.data.Location;
import net.gtaun.shoebill.data.Vector2D;
import net.gtaun.shoebill.data.Vector3D;
import net.gtaun.shoebill.exception.CreationFailedException;
import net.gtaun.shoebill.object.DialogId;
import net.gtaun.shoebill.object.Label;
import net.gtaun.shoebill.object.Menu;
import net.gtaun.shoebill.object.Pickup;
import net.gtaun.shoebill.object.Player;
import net.gtaun.shoebill.object.PlayerLabel;
import net.gtaun.shoebill.object.PlayerObject;
import net.gtaun.shoebill.object.PlayerTextdraw;
import net.gtaun.shoebill.object.SampObject;
import net.gtaun.shoebill.object.Textdraw;
import net.gtaun.shoebill.object.Timer;
import net.gtaun.shoebill.object.Timer.TimerCallback;
import net.gtaun.shoebill.object.Vehicle;
import net.gtaun.shoebill.object.Zone;

/**
 * 
 * 
 * @author MK124
 */
public interface SampObjectFactory
{
	// Player createPlayer();
	
	Vehicle createVehicle(int modelId, AngledLocation loc, int color1, int color2, int respawnDelay) throws CreationFailedException;
	
	default Vehicle createVehicle(int modelId, float x, float y, float z, int interiorId, int worldId, float angle, int color1, int color2, int respawnDelay) throws CreationFailedException
	{
		return createVehicle(modelId, new AngledLocation(x, y, z, interiorId, worldId, angle), color1, color2, respawnDelay);
	}
	
	default Vehicle createVehicle(int modelId, float x, float y, float z, float angle, int color1, int color2, int respawnDelay) throws CreationFailedException
	{
		return createVehicle(modelId, new AngledLocation(x, y, z, 0, 0, angle), color1, color2, respawnDelay);
	}
	
	default Vehicle createVehicle(int modelId, Vector3D pos, float angle, int color1, int color2, int respawnDelay) throws CreationFailedException
	{
		return createVehicle(modelId, new AngledLocation(pos, 0, 0, angle), color1, color2, respawnDelay);
	}
	
	default Vehicle createVehicle(int modelId, Vector3D pos, int interiorId, int worldId, float angle, int color1, int color2, int respawnDelay) throws CreationFailedException
	{
		return createVehicle(modelId, new AngledLocation(pos, interiorId, worldId, angle), color1, color2, respawnDelay);
	}
	
	default Vehicle createVehicle(int modelId, Location loc, float angle, int color1, int color2, int respawnDelay) throws CreationFailedException
	{
		return createVehicle(modelId, new AngledLocation(loc, angle), color1, color2, respawnDelay);
	}
	
	SampObject createObject(int modelId, Location loc, Vector3D rot, float drawDistance) throws CreationFailedException;
	
	default SampObject createObject(int modelId, float x, float y, float z, float rx, float ry, float rz) throws CreationFailedException
	{
		return createObject(modelId, new Location(x, y, z), new Vector3D(rx, ry, rz), 0);
	}
	
	default SampObject createObject(int modelId, float x, float y, float z, float rx, float ry, float rz, float drawDistance) throws CreationFailedException
	{
		return createObject(modelId, new Location(x, y, z), new Vector3D(rx, ry, rz), drawDistance);
	}
	
	default SampObject createObject(int modelId, Location loc, float rx, float ry, float rz) throws CreationFailedException
	{
		return createObject(modelId, loc, new Vector3D(rx, ry, rz), 0);
	}
	
	default SampObject createObject(int modelId, Location loc, float rx, float ry, float rz, float drawDistance) throws CreationFailedException
	{
		return createObject(modelId, loc, new Vector3D(rx, ry, rz), drawDistance);
	}
	
	default SampObject createObject(int modelId, Location loc, Vector3D rot) throws CreationFailedException
	{
		return createObject(modelId, loc, rot, 0);
	}
	
	PlayerObject createPlayerObject(Player player, int modelId, Location loc, Vector3D rot, float drawDistance) throws CreationFailedException;
	
	default PlayerObject createPlayerObject(Player player, int modelId, float x, float y, float z, float rx, float ry, float rz) throws CreationFailedException
	{
		return createPlayerObject(player, modelId, new Location(x, y, z), new Vector3D(rx, ry, rz), 0);
	}
	
	default PlayerObject createPlayerObject(Player player, int modelId, float x, float y, float z, float rx, float ry, float rz, float drawDistance) throws CreationFailedException
	{
		return createPlayerObject(player, modelId, new Location(x, y, z), new Vector3D(rx, ry, rz), drawDistance);
	}
	
	default PlayerObject createPlayerObject(Player player, int modelId, Location loc, float rx, float ry, float rz) throws CreationFailedException
	{
		return createPlayerObject(player, modelId, loc, new Vector3D(rx, ry, rz), 0);
	}
	
	default PlayerObject createPlayerObject(Player player, int modelId, Location loc, float rx, float ry, float rz, float drawDistance) throws CreationFailedException
	{
		return createPlayerObject(player, modelId, loc, new Vector3D(rx, ry, rz), drawDistance);
	}
	
	default PlayerObject createPlayerObject(Player player, int modelId, Location loc, Vector3D rot) throws CreationFailedException
	{
		return createPlayerObject(player, modelId, loc, rot, 0);
	}
	
	Pickup createPickup(int modelId, int type, Location loc) throws CreationFailedException;
	
	default Pickup createPickup(int modelId, int type, float x, float y, float z, int worldId) throws CreationFailedException
	{
		return createPickup(modelId, type, new Location(x, y, z, worldId));
	}
	
	default Pickup createPickup(int modelId, int type, float x, float y, float z) throws CreationFailedException
	{
		return createPickup(modelId, type, new Location(x, y, z));
	}
	
	Label createLabel(String text, Color color, Location loc, float drawDistance, boolean testLOS) throws CreationFailedException;

	default Label createLabel(String text, Color color, float x, float y, float z, int worldId, float drawDistance, boolean testLOS) throws CreationFailedException
	{
		return createLabel(text, color, new Location(x, y, z, worldId), drawDistance, testLOS);
	}
	
	default Label createLabel(String text, Color color, Vector3D pos, int worldId, float drawDistance, boolean testLOS) throws CreationFailedException
	{
		return createLabel(text, color, new Location(pos, worldId), drawDistance, testLOS);
	}
	
	PlayerLabel createPlayerLabel(Player player, String text, Color color, Location loc, float drawDistance, boolean testLOS) throws CreationFailedException;
	PlayerLabel createPlayerLabel(Player player, String text, Color color, Location loc, float drawDistance, boolean testLOS, Player attachedPlayer) throws CreationFailedException;
	PlayerLabel createPlayerLabel(Player player, String text, Color color, Location loc, float drawDistance, boolean testLOS, Vehicle attachedVehicle) throws CreationFailedException;

	default PlayerLabel createPlayerLabel(Player player, String text, Color color, float x, float y, float z, float drawDistance, boolean testLOS)
	{
		return createPlayerLabel(player, text, color, new Location(x, y, z), drawDistance, testLOS);
	}
	
	default PlayerLabel createPlayerLabel(Player player, String text, Color color, float x, float y, float z, int worldId, float drawDistance, boolean testLOS)
	{
		return createPlayerLabel(player, text, color, new Location(x, y, z, worldId), drawDistance, testLOS);
	}
	
	Textdraw createTextdraw(float x, float y, String text) throws CreationFailedException;
	
	default Textdraw createTextdraw(float x, float y)
	{
		return createTextdraw(x, y, " ");
	}
	
	default Textdraw createTextdraw(Vector2D pos)
	{
		return createTextdraw(pos.getX(), pos.getY(), " ");
	}
	
	default Textdraw createTextdraw(Vector2D pos, String text)
	{
		return createTextdraw(pos.getX(), pos.getY(), text);
	}
	
	PlayerTextdraw createPlayerTextdraw(Player player, float x, float y, String text) throws CreationFailedException;
	
	default PlayerTextdraw createPlayerTextdraw(Player player, float x, float y)
	{
		return createPlayerTextdraw(player, x, y, " ");
	}
	
	default PlayerTextdraw createPlayerTextdraw(Player player, Vector2D pos)
	{
		return createPlayerTextdraw(player, pos.getX(), pos.getY(), " ");
	}
	
	default PlayerTextdraw createPlayerTextdraw(Player player, Vector2D pos, String text)
	{
		return createPlayerTextdraw(player, pos.getX(), pos.getY(), text);
	}
	
	Zone createZone(float minX, float minY, float maxX, float maxY) throws CreationFailedException;
	
	default Zone createZone(Area area)
	{
		return createZone(area.getMinX(), area.getMinY(), area.getMaxX(), area.getMaxY());
	}
	
	Menu createMenu(String title, int columns, float x, float y, float col1Width, float col2Width) throws CreationFailedException;
	
	default Menu createMenu(String title, int columns, Vector2D pos, float col1Width, float col2Width)
	{
		return createMenu(title, columns, pos.getX(), pos.getY(), col1Width, col2Width);
	}
	
	DialogId createDialogId() throws CreationFailedException;

	Timer createTimer(int interval, int count, TimerCallback callback);
	
	default Timer createTimer(int interval, int count)
	{
		return createTimer(interval, count, null);
	}
	
	default Timer createTimer(int interval, TimerCallback callback)
	{
		return createTimer(interval, Timer.COUNT_INFINITE, callback);
	}
	
	default Timer createTimer(int interval)
	{
		return createTimer(interval, Timer.COUNT_INFINITE, null);
	}
}

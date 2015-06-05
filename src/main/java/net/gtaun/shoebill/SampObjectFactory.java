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

import net.gtaun.shoebill.data.*;
import net.gtaun.shoebill.event.dialog.DialogCloseEvent;
import net.gtaun.shoebill.event.dialog.DialogResponseEvent;
import net.gtaun.shoebill.event.dialog.DialogShowEvent;
import net.gtaun.shoebill.event.player.PlayerPickupEvent;
import net.gtaun.shoebill.exception.CreationFailedException;
import net.gtaun.shoebill.object.*;
import net.gtaun.shoebill.object.Timer.TimerCallback;
import net.gtaun.util.event.EventHandler;

/**
 *
 *
 * @author MK124
 */
public interface SampObjectFactory
{
	// Player createPlayer();
    /**
     * Create a Vehicle with 1 params. If the Creation fails, it will throw a CreationFailedException.
     *
     * @param modelId Modelid of the Vehicle.
     * @param loc Location where the Vehicle should be.
     * @param color1 First color of the Vehicle.
     * @param color2 Second color of the Vehicle.
     * @param respawnDelay The time in seconds when the Vehicle gets respawned if there is no player in it.
     * @return The created Vehicle.
     */
	Vehicle createVehicle(int modelId, AngledLocation loc, int color1, int color2, int respawnDelay, boolean addsiren) throws CreationFailedException;

    /**
     * Create a Vehicle with params. If the Creation fails, it will throw a CreationFailedException.
     *
     * @param modelId Modelid of the Vehicle.
     * @param x X-Pos where the Vehicle should be.
     * @param y Y-Pos where the Vehicle should be.
     * @param z Z-Pos where the Vehicle should be.
     * @param interiorId Interiorid where the Vehicle should be.
     * @param worldId Worldid where the Vehicle should be.
     * @param angle R(otation)-Pos where the Vehicle should be.
     * @param color1 First color of the Vehicle.
     * @param color2 Second color of the Vehicle.
     * @param respawnDelay The time in seconds when the Vehicle gets respawned if there is no player in it.
     * @return The created Vehicle.
     */
	default Vehicle createVehicle(int modelId, float x, float y, float z, int interiorId, int worldId, float angle, int color1, int color2, int respawnDelay) throws CreationFailedException
	{
		return createVehicle(modelId, new AngledLocation(x, y, z, interiorId, worldId, angle), color1, color2, respawnDelay, false);
	}

    /**
     * Create a Vehicle with params. If the Creation fails, it will throw a CreationFailedException.
     *
     * @param modelId Modelid of the Vehicle.
     * @param x X-Pos where the Vehicle should be.
     * @param y Y-Pos where the Vehicle should be.
     * @param z Z-Pos where the Vehicle should be.
     * @param angle R(otation)-Pos where the Vehicle should be.
     * @param color1 First color of the Vehicle.
     * @param color2 Second color of the Vehicle.
     * @param respawnDelay The time in seconds when the Vehicle gets respawned if there is no player in it.
     * @return The created Vehicle.
     */
	default Vehicle createVehicle(int modelId, float x, float y, float z, float angle, int color1, int color2, int respawnDelay) throws CreationFailedException
	{
		return createVehicle(modelId, new AngledLocation(x, y, z, 0, 0, angle), color1, color2, respawnDelay, false);
	}

    /**
     * Create a Vehicle with params. If the Creation fails, it will throw a CreationFailedException.
     *
     * @param modelId Modelid of the Vehicle.
     * @param pos Vector3D-Pos where the Vehicle should be.
     * @param angle R(otation)-Pos where the Vehicle should be.
     * @param color1 First color of the Vehicle.
     * @param color2 Second color of the Vehicle.
     * @param respawnDelay The time in seconds when the Vehicle gets respawned if there is no player in it.
     * @return The created Vehicle.
     */
	default Vehicle createVehicle(int modelId, Vector3D pos, float angle, int color1, int color2, int respawnDelay) throws CreationFailedException
	{
		return createVehicle(modelId, new AngledLocation(pos, 0, 0, angle), color1, color2, respawnDelay, false);
	}

    /**
     * Create a Vehicle with params. If the Creation fails, it will throw a CreationFailedException.
     *
     * @param modelId Modelid of the Vehicle.
     * @param pos Vector3D-Pos where the Vehicle should be.
     * @param interiorId Interiorid where the Vehicle should be.
     * @param worldId Worldid where the Vehicle should be.
     * @param angle R(otation)-Pos where the Vehicle should be.
     * @param color1 First color of the Vehicle.
     * @param color2 Second color of the Vehicle.
     * @param respawnDelay The time in seconds when the Vehicle gets respawned if there is no player in it.
     * @return The created Vehicle.
     */
	default Vehicle createVehicle(int modelId, Vector3D pos, int interiorId, int worldId, float angle, int color1, int color2, int respawnDelay) throws CreationFailedException
	{
		return createVehicle(modelId, new AngledLocation(pos, interiorId, worldId, angle), color1, color2, respawnDelay, false);
	}

    /**
     * Create a Vehicle with params. If the Creation fails, it will throw a CreationFailedException.
     *
     * @param modelId Modelid of the Vehicle.
     * @param loc Location where the Object should be.
     * @param angle R(otation)-Pos where the Vehicle should be.
     * @param color1 First color of the Vehicle.
     * @param color2 Second color of the Vehicle.
     * @param respawnDelay The time in seconds when the Vehicle gets respawned if there is no player in it.
     * @return The created Vehicle.
     */
	default Vehicle createVehicle(int modelId, Location loc, float angle, int color1, int color2, int respawnDelay, boolean addsiren) throws CreationFailedException
	{
		return createVehicle(modelId, new AngledLocation(loc, angle), color1, color2, respawnDelay, addsiren);
	}

    /**
     * Create a SampObject with params. If the Creation fails, it will throw a CreationFailedException.
     *
     * @param modelId Modelid of the Object.
     * @param loc Location where the Object should be.
     * @param rot The Rotation of the Object.
     * @param drawDistance The Drawdistance of the Object.
     * @return The created SampObject.
     */
	SampObject createObject(int modelId, Location loc, Vector3D rot, float drawDistance) throws CreationFailedException;

    /**
     * Create a SampObject with params. If the Creation fails, it will throw a CreationFailedException.
     *
     * @param modelId Modelid of the Object.
     * @param x X-Pos where the Object should be.
     * @param y Y-Pos where the Object should be.
     * @param z Z-Pos where the Object should be.
     * @param rx Rotation-X where the Object should be.
     * @param ry Rotation-Y where the Object should be.
     * @param rz Rotation-Z where the Object should be.
     * @return The created SampObject.
     */
	default SampObject createObject(int modelId, float x, float y, float z, float rx, float ry, float rz) throws CreationFailedException
	{
		return createObject(modelId, new Location(x, y, z), new Vector3D(rx, ry, rz), 0);
	}
    /**
     * Create a SampObject with params. If the Creation fails, it will throw a CreationFailedException.
     *
     * @param modelId Modelid of the Object.
     * @param x X-Pos where the Object should be.
     * @param y Y-Pos where the Object should be.
     * @param z Z-Pos where the Object should be.
     * @param rx Rotation-X where the Object should be.
     * @param ry Rotation-Y where the Object should be.
     * @param rz Rotation-Z where the Object should be.
     * @param drawDistance The Drawdistance of the Object.
     * @return The created SampObject.
     */
	default SampObject createObject(int modelId, float x, float y, float z, float rx, float ry, float rz, float drawDistance) throws CreationFailedException
	{
		return createObject(modelId, new Location(x, y, z), new Vector3D(rx, ry, rz), drawDistance);
	}
    /**
     * Create a SampObject with params. If the Creation fails, it will throw a CreationFailedException.
     *
     * @param modelId Modelid of the Object.
     * @param loc Location where the Object should be.
     * @param rx Rotation-X where the Object should be.
     * @param ry Rotation-Y where the Object should be.
     * @param rz Rotation-Z where the Object should be.
     * @return The created SampObject.
     */
	default SampObject createObject(int modelId, Location loc, float rx, float ry, float rz) throws CreationFailedException
	{
		return createObject(modelId, loc, new Vector3D(rx, ry, rz), 0);
	}
    /**
     * Create a SampObject with params. If the Creation fails, it will throw a CreationFailedException.
     *
     * @param modelId Modelid of the Object.
     * @param loc Location where the Object should be.
     * @param rx Rotation-X where the Object should be.
     * @param ry Rotation-Y where the Object should be.
     * @param rz Rotation-Z where the Object should be.
     * @param drawDistance The Drawdistance of the Object.
     * @return The created SampObject.
     */
	default SampObject createObject(int modelId, Location loc, float rx, float ry, float rz, float drawDistance) throws CreationFailedException
	{
		return createObject(modelId, loc, new Vector3D(rx, ry, rz), drawDistance);
	}
    /**
     * Create a SampObject with params. If the Creation fails, it will throw a CreationFailedException.
     *
     * @param modelId Modelid of the Object.
     * @param loc Location where the Object should be.
     * @param rot Rotation-Position where the Object should be.
     * @return The created SampObject.
     */
	default SampObject createObject(int modelId, Location loc, Vector3D rot) throws CreationFailedException
	{
		return createObject(modelId, loc, rot, 0);
	}

    /**
     * Create a SampObject for Player with params. If the Creation fails, it will throw a CreationFailedException.
     *
     * @param player The Player who sees the Object.
     * @param modelId Modelid of the Object.
     * @param loc Location where the Object should be.
     * @param rot Rotation-Position where the Object should be.
     * @param drawDistance The Drawdistance of the Object.
     * @return The created PlayerObject.
     */
	PlayerObject createPlayerObject(Player player, int modelId, Location loc, Vector3D rot, float drawDistance) throws CreationFailedException;

    /**
     * Create a SampObject for Player with params. If the Creation fails, it will throw a CreationFailedException.
     *
     * @param player The Player who sees the Object.
     * @param modelId Modelid of the Object.
     * @param x X-Pos where the Object should be.
     * @param y Y-Pos where the Object should be.
     * @param z Z-Pos where the Object should be.
     * @param rx Rotation-X where the Object should be.
     * @param ry Rotation-Y where the Object should be.
     * @param rz Rotation-Z where the Object should be.
     * @return The created PlayerObject.
     */
	default PlayerObject createPlayerObject(Player player, int modelId, float x, float y, float z, float rx, float ry, float rz) throws CreationFailedException
	{
		return createPlayerObject(player, modelId, new Location(x, y, z), new Vector3D(rx, ry, rz), 0);
	}

    /**
     * Create a SampObject for Player with params. If the Creation fails, it will throw a CreationFailedException.
     *
     * @param player The Player who sees the Object.
     * @param modelId Modelid of the Object.
     * @param x X-Pos where the Object should be.
     * @param y Y-Pos where the Object should be.
     * @param z Z-Pos where the Object should be.
     * @param rx Rotation-X where the Object should be.
     * @param ry Rotation-Y where the Object should be.
     * @param rz Rotation-Z where the Object should be.
     * @param drawDistance The Drawdistance of the Object.
     * @return The created PlayerObject.
     */
	default PlayerObject createPlayerObject(Player player, int modelId, float x, float y, float z, float rx, float ry, float rz, float drawDistance) throws CreationFailedException
	{
		return createPlayerObject(player, modelId, new Location(x, y, z), new Vector3D(rx, ry, rz), drawDistance);
	}

    /**
     * Create a SampObject for Player with params. If the Creation fails, it will throw a CreationFailedException.
     *
     * @param player The Player who sees the Object.
     * @param modelId Modelid of the Object.
     * @param loc Location where the Object should be.
     * @param rx Rotation-X where the Object should be.
     * @param ry Rotation-Y where the Object should be.
     * @param rz Rotation-Z where the Object should be.
     * @return The created PlayerObject.
     */
	default PlayerObject createPlayerObject(Player player, int modelId, Location loc, float rx, float ry, float rz) throws CreationFailedException
	{
		return createPlayerObject(player, modelId, loc, new Vector3D(rx, ry, rz), 0);
	}

    /**
     * Create a SampObject for Player with params. If the Creation fails, it will throw a CreationFailedException.
     *
     * @param player The Player who sees the Object.
     * @param modelId Modelid of the Object.
     * @param loc Location where the Object should be.
     * @param rx Rotation-X where the Object should be.
     * @param ry Rotation-Y where the Object should be.
     * @param rz Rotation-Z where the Object should be.
     * @param drawDistance The Drawdistance of the Object.
     * @return The created PlayerObject.
     */
	default PlayerObject createPlayerObject(Player player, int modelId, Location loc, float rx, float ry, float rz, float drawDistance) throws CreationFailedException
	{
		return createPlayerObject(player, modelId, loc, new Vector3D(rx, ry, rz), drawDistance);
	}

    /**
     * Create a SampObject for Player with params. If the Creation fails, it will throw a CreationFailedException.
     *
     * @param player The Player who sees the Object.
     * @param modelId Modelid of the Object.
     * @param loc Location where the Object should be.
     * @param rot Rotation-Position where the Object should be.
     * @return The created PlayerObject.
     */
	default PlayerObject createPlayerObject(Player player, int modelId, Location loc, Vector3D rot) throws CreationFailedException
	{
		return createPlayerObject(player, modelId, loc, rot, 0);
	}

    /**
     * Create a Pickup with params. If the Creation fails, it will throw a CreationFailedException.
     *
     * @param modelId Modelid of the Pickup.
     * @param type Type of the Pickup.
     * @param loc Location where the Pickup should be.
     * @return The created Pickup.
     */
	Pickup createPickup(int modelId, int type, Location loc) throws CreationFailedException;

    /**
     * Create a Pickup with params. If the Creation fails, it will throw a CreationFailedException.
     *
     * @param modelId Modelid of the Pickup.
     * @param type Type of the Pickup.
     * @param x X-Pos where the Pickup should be.
     * @param y Y-Pos where the Pickup should be.
     * @param z Z-Pos where the Pickup should be.
     * @param worldId Worldid where the Pickup should be.
     * @return The created Pickup.
     */
	default Pickup createPickup(int modelId, int type, float x, float y, float z, int worldId) throws CreationFailedException
	{
		return createPickup(modelId, type, new Location(x, y, z, worldId));
	}

    /**
     * Create a Pickup with params. If the Creation fails, it will throw a CreationFailedException.
     *
     * @param modelId Modelid of the Pickup.
     * @param type Type of the Pickup.
     * @param x X-Pos where the Pickup should be.
     * @param y Y-Pos where the Pickup should be.
     * @param z Z-Pos where the Pickup should be.
     * @return The created Pickup.
     */
	default Pickup createPickup(int modelId, int type, float x, float y, float z) throws CreationFailedException
	{
		return createPickup(modelId, type, new Location(x, y, z));
	}

    /**
     * Create a Pickup with params. If the Creation fails, it will throw a CreationFailedException.
     *
     * @param modelId Modelid of the Pickup.
     * @param type    Type of the Pickup.
     * @param loc     Location where the Pickup should be.
     * @param event   The called event.
     * @return The created Pickup.
     */
    Pickup createPickup(int modelId, int type, Location loc, EventHandler<PlayerPickupEvent> event) throws CreationFailedException;

    /**
     * Create a Pickup with params. If the Creation fails, it will throw a CreationFailedException.
     *
     * @param modelId Modelid of the Pickup.
     * @param type    Type of the Pickup.
     * @param x       X-Pos where the Pickup should be.
     * @param y       Y-Pos where the Pickup should be.
     * @param z       Z-Pos where the Pickup should be.
     * @param worldId Worldid where the Pickup should be.
     * @param event   The called event.
     * @return The created Pickup.
     */
    default Pickup createPickup(int modelId, int type, float x, float y, float z, int worldId, EventHandler<PlayerPickupEvent> event) throws CreationFailedException {
        return createPickup(modelId, type, new Location(x, y, z, worldId), event);
    }

    /**
     * Create a Pickup with params. If the Creation fails, it will throw a CreationFailedException.
     *
     * @param modelId Modelid of the Pickup.
     * @param type    Type of the Pickup.
     * @param x       X-Pos where the Pickup should be.
     * @param y       Y-Pos where the Pickup should be.
     * @param z       Z-Pos where the Pickup should be.
     * @param event   The called event
     * @return The created Pickup.
     */
    default Pickup createPickup(int modelId, int type, float x, float y, float z, EventHandler<PlayerPickupEvent> event) throws CreationFailedException {
        return createPickup(modelId, type, new Location(x, y, z), event);
    }

    /**
     * Create a Label with params. If the Creation fails, it will throw a CreationFailedException.
     *
     * @param text The displayed Text.
     * @param color The color of the Label.
     * @param loc Location where the Label should be.
     * @param drawDistance The Drawdistance of the Label.
     * @param testLOS If the Label can be seen through objects.
     * @return The created Label.
     */
	Label createLabel(String text, Color color, Location loc, float drawDistance, boolean testLOS) throws CreationFailedException;

    /**
     * Create a Label with params. If the Creation fails, it will throw a CreationFailedException.
     *
     * @param text The displayed Text.
     * @param color The color of the Label.
     * @param x X-Pos where the Label should be.
     * @param y Y-Pos where the Label should be.
     * @param z Z-Pos where the Label should be.
     * @param worldId Worldid where the Label should be.
     * @param drawDistance The Drawdistance of the Label.
     * @param testLOS If the Label can be seen through objects.
     * @return The created Label.
     */
	default Label createLabel(String text, Color color, float x, float y, float z, int worldId, float drawDistance, boolean testLOS) throws CreationFailedException
	{
		return createLabel(text, color, new Location(x, y, z, worldId), drawDistance, testLOS);
	}

    /**
     * Create a Label with params. If the Creation fails, it will throw a CreationFailedException.
     *
     * @param text The displayed Text.
     * @param color The color of the Label.
     * @param pos Vector3D-Pos where the Label should be.
     * @param worldId Worldid where the Label should be.
     * @param drawDistance The Drawdistance of the Label.
     * @param testLOS If the Label can be seen through objects.
     * @return The created Label.
     */
	default Label createLabel(String text, Color color, Vector3D pos, int worldId, float drawDistance, boolean testLOS) throws CreationFailedException
	{
		return createLabel(text, color, new Location(pos, worldId), drawDistance, testLOS);
	}

    /**
     * Create a Label which is only visible for one player, with params. If the Creation fails, it will throw a CreationFailedException.
     *
     * @param player The Player who sees the Label.
     * @param text The displayed Text.
     * @param color The color of the Label.
     * @param loc Location where the Label should be.
     * @param drawDistance The Drawdistance of the Label.
     * @param testLOS If the Label can be seen through objects.
     * @return The created PlayerLabel.
     */
	PlayerLabel createPlayerLabel(Player player, String text, Color color, Location loc, float drawDistance, boolean testLOS) throws CreationFailedException;
    /**
     * Create a Label which is only visible for one player, with params. If the Creation fails, it will throw a CreationFailedException.
     *
     * @param player The Player who sees the Label.
     * @param text The displayed Text.
     * @param color The color of the Label.
     * @param loc Location where the Label should be.
     * @param drawDistance The Drawdistance of the Label.
     * @param testLOS If the Label can be seen through objects.
     * @param attachedPlayer The Player where the Label should be attached.
     * @return The created PlayerLabel.
     */
	PlayerLabel createPlayerLabel(Player player, String text, Color color, Location loc, float drawDistance, boolean testLOS, Player attachedPlayer) throws CreationFailedException;    /**
     * Create a Label which is only visible for one player, with params. If the Creation fails, it will throw a CreationFailedException.
     *
     * @param player The Player who sees the Label.
     * @param text The displayed Text.
     * @param color The color of the Label.
     * @param loc Location where the Label should be.
     * @param drawDistance The Drawdistance of the Label.
     * @param testLOS If the Label can be seen through objects.
     * @param attachedVehicle The Vehicle where the Label should be attached.
     * @return The created PlayerLabel.
     */
	PlayerLabel createPlayerLabel(Player player, String text, Color color, Location loc, float drawDistance, boolean testLOS, Vehicle attachedVehicle) throws CreationFailedException;

    /**
     * Create a Label which is only visible for one player, with params. If the Creation fails, it will throw a CreationFailedException.
     *
     * @param player The Player who sees the Label.
     * @param text The displayed Text.
     * @param color The color of the Label.
     * @param x X-Pos where the Label should be.
     * @param y Y-Pos where the Label should be.
     * @param z Z-Pos where the Label should be.
     * @param drawDistance The Drawdistance of the Label.
     * @param testLOS If the Label can be seen through objects.
     * @return The created PlayerLabel.
     */
	default PlayerLabel createPlayerLabel(Player player, String text, Color color, float x, float y, float z, float drawDistance, boolean testLOS)
	{
		return createPlayerLabel(player, text, color, new Location(x, y, z), drawDistance, testLOS);
	}

    /**
     * Create a Label which is only visible for one player, with params. If the Creation fails, it will throw a CreationFailedException.
     *
     * @param player The Player who sees the Label.
     * @param text The displayed Text.
     * @param color The color of the Label.
     * @param x X-Pos where the Label should be.
     * @param y Y-Pos where the Label should be.
     * @param z Z-Pos where the Label should be.
     * @param worldId Worldid where the Label should be.
     * @param drawDistance The Drawdistance of the Label.
     * @param testLOS If the Label can be seen through objects.
     * @return The created PlayerLabel.
     */
	default PlayerLabel createPlayerLabel(Player player, String text, Color color, float x, float y, float z, int worldId, float drawDistance, boolean testLOS)
	{
		return createPlayerLabel(player, text, color, new Location(x, y, z, worldId), drawDistance, testLOS);
	}

    /**
     * Create a Textdraw with params. If the Creation fails, it will throw a CreationFailedException.
     * @param x X-Pos where the Textdraw should be.
     * @param y Y-Pos where the Textdraw should be.
     * @param text The displayed Text.
     * @return The created Textdraw.
     */
	Textdraw createTextdraw(float x, float y, String text) throws CreationFailedException;

    /**
     * Create a Textdraw with params. If the Creation fails, it will throw a CreationFailedException.
     * @param x X-Pos where the Textdraw should be.
     * @param y Y-Pos where the Textdraw should be.
     * @return The created Textdraw.
     */
	default Textdraw createTextdraw(float x, float y)
	{
		return createTextdraw(x, y, " ");
	}

    /**
     * Create a Textdraw with params. If the Creation fails, it will throw a CreationFailedException.
     * @param pos Vector2D-Position where the Textdraw should be.
     * @return The created Textdraw.
     */
	default Textdraw createTextdraw(Vector2D pos)
	{
		return createTextdraw(pos.getX(), pos.getY(), " ");
	}

    /**
     * Create a Textdraw with params. If the Creation fails, it will throw a CreationFailedException.
     * @param pos Vector2D-Position where the Textdraw should be.
     * @param text The displayed Text.
     * @return The created Textdraw.
     */
	default Textdraw createTextdraw(Vector2D pos, String text)
	{
		return createTextdraw(pos.getX(), pos.getY(), text);
	}

    /**
     * Create a Textdraw which is only visible for one player, with params. If the Creation fails, it will throw a CreationFailedException.
     * @param player The Player who sees the Textdraw.
     * @param x X-Pos where the Textdraw should be.
     * @param y Y-Pos where the Textdraw should be.
     * @param text The displayed Text.
     * @return The created PlayerTextdraw.
     */
	PlayerTextdraw createPlayerTextdraw(Player player, float x, float y, String text) throws CreationFailedException;

    /**
     * Create a Textdraw which is only visible for one player, with params. If the Creation fails, it will throw a CreationFailedException.
     * @param player The Player who sees the Textdraw.
     * @param x X-Pos where the Textdraw should be.
     * @param y Y-Pos where the Textdraw should be.
     * @return The created PlayerTextdraw.
     */
	default PlayerTextdraw createPlayerTextdraw(Player player, float x, float y)
	{
		return createPlayerTextdraw(player, x, y, " ");
	}

    /**
     * Create a Textdraw which is only visible for one player, with params. If the Creation fails, it will throw a CreationFailedException.
     * @param player The Player who sees the Textdraw.
     * @param pos Vector2D-Position where the Textdraw should be.
     * @return The created PlayerTextdraw.
     */
	default PlayerTextdraw createPlayerTextdraw(Player player, Vector2D pos)
	{
		return createPlayerTextdraw(player, pos.getX(), pos.getY(), " ");
	}

    /**
     * Create a Textdraw which is only visible for one player, with params. If the Creation fails, it will throw a CreationFailedException.
     * @param player The Player who sees the Textdraw.
     * @param pos Vector2D-Position where the Textdraw should be.
     * @param text The displayed Text.
     * @return The created PlayerTextdraw.
     */
	default PlayerTextdraw createPlayerTextdraw(Player player, Vector2D pos, String text)
	{
		return createPlayerTextdraw(player, pos.getX(), pos.getY(), text);
	}

    /**
     * Create a Zone with params. If the Creation fails, it will throw a CreationFailedException.
     * @param minX The Min-X Position of the Zone.
     * @param minY The Min-Y Position of the Zone.
     * @param maxX The Max-X Position of the Zone.
     * @param maxY The Max-Y Position of the Zone.
     * @return The created Zone.
     */
	Zone createZone(float minX, float minY, float maxX, float maxY) throws CreationFailedException;

    /**
     * Create a Zone with params. If the Creation fails, it will throw a CreationFailedException.
     * @param area The Area-Position of the Zone.
     * @return The created Zone.
     */
	default Zone createZone(Area area)
	{
		return createZone(area.getMinX(), area.getMinY(), area.getMaxX(), area.getMaxY());
	}

    /**
     * Create a Menu with params. If the Creation fails, it will throw a CreationFailedException.
     * @param title The Title of the menu.
     * @param columns The amount of columns.
     * @param x X-Pos where the Menu should appear.
     * @param y Y-Pos where the Menu should appear.
     * @param col1Width The Columnwidth of column 1.
     * @param col2Width The Columnwidth of column 2.
     * @return The created Menu.
     */
	Menu createMenu(String title, int columns, float x, float y, float col1Width, float col2Width) throws CreationFailedException;

    /**
     * Create a Menu with params. If the Creation fails, it will throw a CreationFailedException.
     * @param title The Title of the menu.
     * @param columns The amount of columns.
     * @param pos Vector2D-Position where the Menu should appear.
     * @param col1Width The Columnwidth of column 1.
     * @param col2Width The Columnwidth of column 2.
     * @return The created Menu.
     */
	default Menu createMenu(String title, int columns, Vector2D pos, float col1Width, float col2Width) throws CreationFailedException
	{
		return createMenu(title, columns, pos.getX(), pos.getY(), col1Width, col2Width);
	}

    /**
     * Create a DialogId. If the Creation fails, it will throw a CreationFailedException.
     * @return The created DialogId.
     */
	default DialogId createDialogId() throws CreationFailedException
	{
		return createDialogId(null, null, null);
	}

    /**
     * Create a DialogId. If the Creation fails, it will throw a CreationFailedException.
     * @return The created DialogId.
     */
	default DialogId createDialogId(EventHandler<DialogResponseEvent> onResponse) throws CreationFailedException
	{
		return createDialogId(onResponse, null, null);
	}

    /**
     * Create a DialogId. If the Creation fails, it will throw a CreationFailedException.
     * @return The created DialogId.
     */
	DialogId createDialogId(EventHandler<DialogResponseEvent> onResponse, EventHandler<DialogShowEvent> onShow, EventHandler<DialogCloseEvent> onClose) throws CreationFailedException;

    /**
     * Create a Timer with params.
     * @param interval The interval in miliseconds.
     * @param count How often the Timer will get called.
     * @param callback The callback which will get invoked after the interval.
     * @return The created Timer.
     */
	Timer createTimer(int interval, int count, TimerCallback callback);

    /**
     * Create a Timer with params.
     * @param interval The interval in miliseconds.
     * @param count How often the Timer will get called.
     * @return The created Timer.
     */
	default Timer createTimer(int interval, int count)
	{
		return createTimer(interval, count, null);
	}

    /**
     * Create a Timer with params.
     * @param interval The interval in miliseconds.
     * @param callback The callback which will get invoked after the interval.
     * @return The created Timer.
     */
	default Timer createTimer(int interval, TimerCallback callback)
	{
		return createTimer(interval, Timer.COUNT_INFINITE, callback);
	}

    /**
     * Create a Timer with params.
     * @param interval The interval in miliseconds.
     * @return The created Timer.
     */
	default Timer createTimer(int interval)
	{
		return createTimer(interval, Timer.COUNT_INFINITE, null);
	}

	/**
	 * Creates a actor with params.
	 * @param modelid Modelid of the skin
	 * @param position Where the actor should stand
	 * @param angle In which angle the actor should stand
	 * @return The created actor
	 * @throws CreationFailedException
	 */
	Actor createActor(int modelid, Vector3D position, float angle) throws CreationFailedException;

	/**
	 * Creates a actor with params
	 * @param modelid Modelid of the skin
	 * @param x X-Pos where the actor should stand
	 * @param y Y-Pos where the actor should stand
	 * @param z Z-Pos where the actor should stand
	 * @param angle In which angle the actor should stand
	 * @return The created actor
	 * @throws CreationFailedException
	 */
	default Actor createActor(int modelid, float x, float y, float z, float angle) throws CreationFailedException {
		return createActor(modelid, new Vector3D(x, y, z), angle);
	}
}

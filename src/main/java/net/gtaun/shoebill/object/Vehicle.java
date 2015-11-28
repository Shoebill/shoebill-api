/**
 * Copyright (C) 2011-2014 MK124
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

package net.gtaun.shoebill.object;

import net.gtaun.shoebill.SampObjectManager;
import net.gtaun.shoebill.data.*;
import net.gtaun.shoebill.exception.CreationFailedException;

import java.util.Collection;

/**
 * 
 * 
 * @author MK124, 123marvin123
 */
public interface Vehicle extends Destroyable, Proxyable<Vehicle>
{
	static Vehicle get(int id)
	{
		return SampObjectManager.get().getVehicle(id);
	}

	/**
	 * Gets the vehicle's pool size
	 * @return Vehicle's pool size
	 */
	static int getPoolSize()
	{
		return SampObjectManager.get().getVehiclePoolSize();
	}

	static Collection<Vehicle> get()
	{
		return SampObjectManager.get().getVehicles();
	}
	
	/**
     * Create a Vehicle with params. If the Creation fails, it will throw a CreationFailedException.
     *
     * @param modelId Modelid of the Vehicle.
     * @param loc Location where the Vehicle should be.
     * @param color1 First color of the Vehicle.
     * @param color2 Second color of the Vehicle.
     * @param respawnDelay The time in seconds when the Vehicle gets respawned if there is no player in it.
     * @return The created Vehicle.
     */
	static Vehicle create(int modelId, AngledLocation loc, int color1, int color2, int respawnDelay, boolean addsiren) throws CreationFailedException
	{
		return SampObjectManager.get().createVehicle(modelId, loc, color1, color2, respawnDelay, addsiren);
	}

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
	static Vehicle create(int modelId, float x, float y, float z, int interiorId, int worldId, float angle, int color1, int color2, int respawnDelay) throws CreationFailedException
	{
		return SampObjectManager.get().createVehicle(modelId, x, y, z, interiorId, worldId, angle, color1, color2, respawnDelay);
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
	static Vehicle create(int modelId, float x, float y, float z, float angle, int color1, int color2, int respawnDelay) throws CreationFailedException
	{
		return SampObjectManager.get().createVehicle(modelId, x, y, z, angle, color1, color2, respawnDelay);
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
	static Vehicle create(int modelId, Vector3D pos, float angle, int color1, int color2, int respawnDelay) throws CreationFailedException
	{
		return SampObjectManager.get().createVehicle(modelId, pos, angle, color1, color2, respawnDelay);
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
	static Vehicle create(int modelId, Vector3D pos, int interiorId, int worldId, float angle, int color1, int color2, int respawnDelay) throws CreationFailedException
	{
		return SampObjectManager.get().createVehicle(modelId, pos, interiorId, worldId, angle, color1, color2, respawnDelay);
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
	static Vehicle create(int modelId, Location loc, float angle, int color1, int color2, int respawnDelay) throws CreationFailedException
	{
		return SampObjectManager.get().createVehicle(modelId, loc, angle, color1, color2, respawnDelay);
	}
	
	
	int INVALID_ID = 0xFFFF;
	
	
	boolean isStatic();
	
	int getId();
	int getModelId();
	String getModelName();
	int getColor1();
	int getColor2();
	int getRespawnDelay();
	
	VehicleParam getState();
	VehicleComponent getComponent();
	VehicleDamage getDamage();
	
	AngledLocation getLocation();
	void setLocation(float x, float y, float z);
	void setLocation(Vector3D pos);
	void setLocation(Location loc);
	void setLocation(AngledLocation loc);
	
	float getAngle();
	void setAngle(float angle);
	
	Quaternion getRotationQuat();
	
	int getInteriorId();
	void setInteriorId(int interiorId);
	
	int getWorldId();
	void setWorldId(int worldId);
	
	float getHealth();
	void setHealth(float health);
	
	Velocity getVelocity();
	void setVelocity(Velocity velocity);
	void setAngularVelocity(Velocity velocity);

	/**
	 * Puts a player into that vehicle
	 * @param player Player to put in
	 * @param seat Which seat he should sit in
	 */
	void putPlayer(Player player, int seat);

	/**
	 * Checks if a specific player is in the vehicle
	 * @param player The player to check
	 * @return If the player is in the vehicle
	 */
	boolean isPlayerIn(Player player);

	/**
	 * Checks if the vehicle is streamed-in for a specific player
	 * @param forPlayer The player to check
	 * @return If the vehicle is streamed-in for the player
	 */
	boolean isStreamedIn(Player forPlayer);

	/**
	 * Sets different parameters for a specific player
	 * @param player Which player should be affected
	 * @param objective If the objective should be open / closed
	 * @param doorsLocked If the doors should be locked
	 */
	void setParamsForPlayer(Player player, boolean objective, boolean doorsLocked);

	/**
	 * Destroys and spawns the vehicle
	 */
	void respawn();

	/**
	 * Sets the color of the vehicle (https://wiki.sa-mp.com/wiki/Vehicle_Color_IDs)
	 * @param color1 First color
	 * @param color2 Second color
	 */
	void setColor(int color1, int color2);

	/**
	 * Sets the paintjob of the vehicle
	 * @param paintjobId The paintjobid (https://wiki.sa-mp.com/wiki/Paintjob)
	 */
	void setPaintjob(int paintjobId);

	/**
	 * Gets the trailer that is attached to the vehicle
	 * @return The attached trailer
	 */
	Vehicle getTrailer();

	/**
	 * Attaches a trailer to the vehicle
	 * @param trailer The trailer to attach
	 */
	void attachTrailer(Vehicle trailer);

	/**
	 * Detaches a trailer from the vehicle (check with isTrailerAttached())
	 */
	void detachTrailer();

	/**
	 * Checks if any trailer is attached to the vehicle
	 * @return If there is a trailer attached
	 */
	boolean isTrailerAttached();

	/**
	 * Sets the number plate of the vehicle
	 * @param number The String to display on the plate
	 */
	void setNumberPlate(String number);

	/**
	 * Sets the health of the vehicle to 1000 and repairs all visual damages
	 */
	void repair();

	/**
	 * Get the state (open or close) of the doors
	 * This function was introduced in 0.3.7
	 * @return VehicleState object for the vehicle (doors)
	 */
	VehicleState getDoors();

	/**
	 * Get the state (open or close) of the windows
	 * This function was introduced in 0.3.7
	 * @return VehicleState object for the vehicle (windows)
	 */
	VehicleState getWindows();

	/**
	 * Returns the siren state of the vehicle
	 * @return If the sirens are on (-1 = not activated yet, 0 = off, 1 = on)
	 */
	int getSirenState();

	/**
	 * Sets the vehicle's door state
	 * @param vehicleState The new state
	 */
	void setDoors(VehicleState vehicleState);

	/**
	 * Sets the vehicle's window state
	 * @param vehicleState The new state
	 */
	void setWindows(VehicleState vehicleState);

	/**
	 * Returns if the vehicle has been initialized with siren (addsiren parameter)
	 *
	 * @return If the vehicle has a siren
	 */
	boolean hasSiren();
}

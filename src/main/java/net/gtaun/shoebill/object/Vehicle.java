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

import java.util.Collection;

import net.gtaun.shoebill.SampObjectManager;
import net.gtaun.shoebill.data.AngledLocation;
import net.gtaun.shoebill.data.Location;
import net.gtaun.shoebill.data.Quaternion;
import net.gtaun.shoebill.data.Vector3D;
import net.gtaun.shoebill.data.Velocity;
import net.gtaun.shoebill.exception.CreationFailedException;

/**
 * 
 * 
 * @author MK124
 */
public interface Vehicle extends Destroyable, Proxyable<Vehicle>
{
	public static Vehicle get(int id)
	{
		return SampObjectManager.get().getVehicle(id);
	}
	
	public static Collection<Vehicle> get()
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
	public static Vehicle create(int modelId, AngledLocation loc, int color1, int color2, int respawnDelay) throws CreationFailedException
	{
		return SampObjectManager.get().createVehicle(modelId, loc, color1, color2, respawnDelay);
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
	public static Vehicle create(int modelId, float x, float y, float z, int interiorId, int worldId, float angle, int color1, int color2, int respawnDelay) throws CreationFailedException
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
	public static Vehicle create(int modelId, float x, float y, float z, float angle, int color1, int color2, int respawnDelay) throws CreationFailedException
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
	public static Vehicle create(int modelId, Vector3D pos, float angle, int color1, int color2, int respawnDelay) throws CreationFailedException
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
	public static Vehicle create(int modelId, Vector3D pos, int interiorId, int worldId, float angle, int color1, int color2, int respawnDelay) throws CreationFailedException
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
	public static Vehicle create(int modelId, Location loc, float angle, int color1, int color2, int respawnDelay) throws CreationFailedException
	{
		return SampObjectManager.get().createVehicle(modelId, loc, angle, color1, color2, respawnDelay);
	}
	
	
	public static final int INVALID_ID = 0xFFFF;
	
	
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
	
	void putPlayer(Player player, int seat);
	boolean isPlayerIn(Player player);
	boolean isStreamedIn(Player forPlayer);
	void setParamsForPlayer(Player player, boolean objective, boolean doorsLocked);
	void respawn();
	void setColor(int color1, int color2);
	void setPaintjob(int paintjobId);
	
	Vehicle getTrailer();
	void attachTrailer(Vehicle trailer);
	void detachTrailer();
	
	boolean isTrailerAttached();
	void setNumberPlate(String number);
	void repair();
}

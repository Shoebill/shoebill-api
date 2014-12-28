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
import net.gtaun.shoebill.data.Location;
import net.gtaun.shoebill.exception.CreationFailedException;

/**
 * 
 * 
 * @author MK124
 */
public interface Pickup extends Destroyable, Proxyable<Pickup>
{
    /**
     * Gets a Pickup by its Id
     * @param id Id of the Pickup
     * @return The found Pickup
     */
	public static Pickup get(int id)
	{
		return SampObjectManager.get().getPickup(id);
	}

    /**
     * Gets a Collection of all available Pickups.
     * @return A Collection of all Pickups
     */
	public static Collection<Pickup> get()
	{
		return SampObjectManager.get().getPickups();
	}

    /**
     * Create a Pickup with params. If the Creation fails, it will throw a CreationFailedException.
     *
     * @param modelId Modelid of the Pickup.
     * @param type Type of the Pickup.
     * @param loc Location where the Pickup should be.
     * @return The created Pickup.
     */
	public static Pickup create(int modelId, int type, Location loc) throws CreationFailedException
	{
		return SampObjectManager.get().createPickup(modelId, type, loc);
	}

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
	public static Pickup create(int modelId, int type, float x, float y, float z, int worldId) throws CreationFailedException
	{
		return SampObjectManager.get().createPickup(modelId, type, x, y, z, worldId);
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
	public static Pickup create(int modelId, int type, float x, float y, float z) throws CreationFailedException
	{
		return SampObjectManager.get().createPickup(modelId, type, x, y, z);
	}
	

	public static final int INVALID_ID = -1;


	boolean isStatic();
    /**
     * Gets the Id from the Pickup.
     * @return The Id
     */
	int getId();

    /**
     * Gets the Modelid of the Pickup
     * @return The Modelid
     */
	int getModelId();

    /**
     * Gets the Type of the Pickup
     * @return The Type
     */
	int getType();

    /**
     * Gets the Location of the Pickup
     * @return The Location
     */
	Location getLocation();
}

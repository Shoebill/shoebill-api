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

	public static final int INVALID_ID = -1;

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

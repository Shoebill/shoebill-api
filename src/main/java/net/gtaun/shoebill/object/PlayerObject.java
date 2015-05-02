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
import net.gtaun.shoebill.data.Location;
import net.gtaun.shoebill.data.Vector3D;
import net.gtaun.shoebill.exception.CreationFailedException;

import java.util.Collection;

/**
 * 
 * 
 * @author MK124
 */
public interface PlayerObject extends SampObject, PlayerRelated
{
	static PlayerObject get(Player player, int id)
	{
		return SampObjectManager.get().getPlayerObject(player, id);
	}
	
	static Collection<PlayerObject> get(Player player)
	{
		return SampObjectManager.get().getPlayerObjects(player);
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
	static PlayerObject create(Player player, int modelId, Location loc, Vector3D rot, float drawDistance) throws CreationFailedException
	{
		return SampObjectManager.get().createPlayerObject(player, modelId, loc, rot, drawDistance);
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
     * @return The created PlayerObject.
     */
	static PlayerObject create(Player player, int modelId, float x, float y, float z, float rx, float ry, float rz) throws CreationFailedException
	{
		return SampObjectManager.get().createPlayerObject(player, modelId, x, y, z, rx, ry, rz);
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
	static PlayerObject create(Player player, int modelId, float x, float y, float z, float rx, float ry, float rz, float drawDistance) throws CreationFailedException
	{
		return SampObjectManager.get().createPlayerObject(player, modelId, x, y, z, rx, ry, rz, drawDistance);
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
	static PlayerObject create(Player player, int modelId, Location loc, float rx, float ry, float rz) throws CreationFailedException
	{
		return SampObjectManager.get().createPlayerObject(player, modelId, loc, rx, ry, rz);
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
	static PlayerObject create(Player player, int modelId, Location loc, float rx, float ry, float rz, float drawDistance) throws CreationFailedException
	{
		return SampObjectManager.get().createPlayerObject(player, modelId, loc, rx, ry, rz, drawDistance);
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
	static PlayerObject create(Player player, int modelId, Location loc, Vector3D rot) throws CreationFailedException
	{
		return SampObjectManager.get().createPlayerObject(player, modelId, loc, rot);
	}
	
	
	int INVALID_ID = 0xFFFF;
	void setPlayerObjectNoCameraCol();
}

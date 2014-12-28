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

package net.gtaun.shoebill.object;

import java.util.Collection;

import net.gtaun.shoebill.SampObjectManager;
import net.gtaun.shoebill.data.Color;
import net.gtaun.shoebill.data.Location;
import net.gtaun.shoebill.exception.CreationFailedException;

/**
 * 
 * 
 * @author MK124
 */
public interface PlayerLabel extends Label, PlayerRelated
{
	public static PlayerLabel get(Player player, int id)
	{
		return SampObjectManager.get().getPlayerLabel(player, id);
	}
	
	public static Collection<PlayerLabel> get(Player player)
	{
		return SampObjectManager.get().getPlayerLabels(player);
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
	public static PlayerLabel create(Player player, String text, Color color, Location loc, float drawDistance, boolean testLOS) throws CreationFailedException
	{
		return SampObjectManager.get().createPlayerLabel(player, text, color, loc, drawDistance, testLOS);
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
     * @param attachedPlayer The Player where the Label should be attached.
     * @return The created PlayerLabel.
     */
	public static PlayerLabel create(Player player, String text, Color color, Location loc, float drawDistance, boolean testLOS, Player attachedPlayer) throws CreationFailedException
	{
		return SampObjectManager.get().createPlayerLabel(player, text, color, loc, drawDistance, testLOS, attachedPlayer);
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
     * @param attachedVehicle The Vehicle where the Label should be attached.
     * @return The created PlayerLabel.
     */
	public static PlayerLabel create(Player player, String text, Color color, Location loc, float drawDistance, boolean testLOS, Vehicle attachedVehicle) throws CreationFailedException
	{
		return SampObjectManager.get().createPlayerLabel(player, text, color, loc, drawDistance, testLOS, attachedVehicle);
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
     * @param drawDistance The Drawdistance of the Label.
     * @param testLOS If the Label can be seen through objects.
     * @return The created PlayerLabel.
     */
	public static PlayerLabel create(Player player, String text, Color color, float x, float y, float z, float drawDistance, boolean testLOS)
	{
		return SampObjectManager.get().createPlayerLabel(player, text, color, x, y, z, drawDistance, testLOS);
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
	public static PlayerLabel create(Player player, String text, Color color, float x, float y, float z, int worldId, float drawDistance, boolean testLOS)
	{
		return SampObjectManager.get().createPlayerLabel(player, text, color, new Location(x, y, z, worldId), drawDistance, testLOS);
	}
	
	
	public static final int INVALID_ID = 0xFFFF;
}

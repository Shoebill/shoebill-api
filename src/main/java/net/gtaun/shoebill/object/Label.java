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
import net.gtaun.shoebill.data.Color;
import net.gtaun.shoebill.data.Location;
import net.gtaun.shoebill.data.Vector3D;

/**
 * 
 * 
 * @author MK124
 */
public interface Label extends Destroyable, Proxyable<Label>
{
    /**
     * Gets a Label by its Id
     * @param id The Id
     * @return The found Label
     */
	public static Label get(int id)
	{
		return SampObjectManager.get().getLabel(id);
	}

	public static final int INVALID_ID = 0xFFFF;

    /**
     * Gets the Id of the Label
     * @return The Id of the Label
     */
	int getId();

    /**
     * Gets the Text of the Label
     * @return The Text of the Label
     */
	String getText();

    /**
     * Gets the Color of the Dialog
     * @return The Color of the Dialog
     */
	Color getColor();

    /**
     * Gets the draw distance of the Label.
     * @return The Draw Distance
     */
	float getDrawDistance();

    /**
     * Gets the Location of the Label
     * @return The Location
     */
	Location getLocation();
    /**
     * Gets the attached Player. If there is no, this Function will return null.
     * @return The attached Player
     */
	Player getAttachedPlayer();
    /**
     * Gets the attached Vehicle. If there is no, this Function will return null.
     * @return The attached Vehicle
     */
	Vehicle getAttachedVehicle();

    /**
     * Attaches the Label to a Player
     * @param player The Player
     * @param x X-Offset
     * @param y Y-Offset
     * @param z Z-Offset
     */
	void attach(Player player, float x, float y, float z);

    /**
     * Attaches the Label to a Player
     * @param player The Player
     * @param offset The Location
     */
	void attach(Player player, Vector3D offset);

    /**
     * Attaches the Label to a Vehicle
     * @param vehicle The Vehicle
     * @param x X-Offset
     * @param y Y-Offset
     * @param z Z-Offset
     */
	void attach(Vehicle vehicle, float x, float y, float z);

    /**
     * Attaches the Label to a Vehicle
     * @param vehicle The Vehicle
     * @param offset The Location
     */
	void attach(Vehicle vehicle, Vector3D offset);

    /**
     * Updates the Text and Color of the Label
     * @param color New Color
     * @param text New Text
     */
	void update(Color color, String text);
}

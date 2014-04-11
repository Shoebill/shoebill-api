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
import net.gtaun.shoebill.data.Vector2D;

/**
 * 
 * 
 * @author MK124
 */
public interface Menu extends Destroyable, Proxyable<Menu>
{
    /**
     * Gets a Menu by its Id
     * @param id Id of the Menu
     * @return The Menu
     */
	public static Menu get(int id)
	{
		return SampObjectManager.get().getMenu(id);
	}

    /**
     * Gets all Menus
     * @return A Collection of all Menus
     */
	public static Collection<Menu> get()
	{
		return SampObjectManager.get().getMenus();
	}
	
	
	public static final int INVALID_ID = 0xFF;

    /**
     * Gets the Id of the Menu.
     * @return The Id of the Menu.
     */
	int getId();

    /**
     * Gets the Title of the Menu.
     * @return The Title of the Menu
     */
	String getTitle();

    /**
     * Get the Column Count.
     * @return The Columncount
     */
	int getColumns();

    /**
     * Gets the Position of the Menu.
     * @return The Position of the Menu
     */
	Vector2D getPosition();

    /**
     * Gets the width of Column 1.
     * @return Width of Column 1
     */
	float getColumn1Width();
    /**
     * Gets the width of Column 2.
     * @return Width of Column 2
     */
	float getColumn2Width();

    /**
     * Gets the Column Header.
     * @return The Column Header
     */
	String getColumnHeader();

    /**
     * Adds a Item
     * @param column The Column where the Text will be displayed
     * @param text The displayed Text
     */
	void addItem(int column, String text);

    /**
     * Sets the Column Header
     * @param column The Column Id
     * @param text The The displayed Text
     */
	void setColumnHeader(int column, String text);

    /**
     * Disables the Menu
     */
	void disable();

    /**
     * Disables the Row
     * @param row Rowid
     */
	void disableRow(int row);

    /**
     * Shows the Menu for a specific player
     * @param player The Player
     */
	void show(Player player);

    /**
     * Hides the menu for a specific player
     * @param player The Player
     */
	void hide(Player player);
}

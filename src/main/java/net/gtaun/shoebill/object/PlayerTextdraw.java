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

package net.gtaun.shoebill.object;

import net.gtaun.shoebill.SampObjectManager;
import net.gtaun.shoebill.data.Vector2D;
import net.gtaun.shoebill.exception.CreationFailedException;

import java.util.Collection;


/**
 * 
 * 
 * @author MK124
 */
public interface PlayerTextdraw extends PlayerRelated, TextdrawBase
{
	public static PlayerTextdraw get(Player player, int id)
	{
		return SampObjectManager.get().getPlayerTextdraw(player, id);
	}
	
	public static Collection<PlayerTextdraw> get(Player player)
	{
		return SampObjectManager.get().getPlayerTextdraws(player);
	}
	
    /**
     * Create a Textdraw which is only visible for one player, with params. If the Creation fails, it will throw a CreationFailedException.
     * @param player The Player who sees the Textdraw.
     * @param x X-Pos where the Textdraw should be.
     * @param y Y-Pos where the Textdraw should be.
     * @param text The displayed Text.
     * @return The created PlayerTextdraw.
     */
	public static PlayerTextdraw create(Player player, float x, float y, String text) throws CreationFailedException
	{
		return SampObjectManager.get().createPlayerTextdraw(player, x, y, text);
	}

    /**
     * Create a Textdraw which is only visible for one player, with params. If the Creation fails, it will throw a CreationFailedException.
     * @param player The Player who sees the Textdraw.
     * @param x X-Pos where the Textdraw should be.
     * @param y Y-Pos where the Textdraw should be.
     * @return The created PlayerTextdraw.
     */
	public static PlayerTextdraw create(Player player, float x, float y)
	{
		return SampObjectManager.get().createPlayerTextdraw(player, x, y);
	}

    /**
     * Create a Textdraw which is only visible for one player, with params. If the Creation fails, it will throw a CreationFailedException.
     * @param player The Player who sees the Textdraw.
     * @param pos Vector2D-Position where the Textdraw should be.
     * @return The created PlayerTextdraw.
     */
	public static PlayerTextdraw create(Player player, Vector2D pos)
	{
		return SampObjectManager.get().createPlayerTextdraw(player, pos);
	}

    /**
     * Create a Textdraw which is only visible for one player, with params. If the Creation fails, it will throw a CreationFailedException.
     * @param player The Player who sees the Textdraw.
     * @param pos Vector2D-Position where the Textdraw should be.
     * @param text The displayed Text.
     * @return The created PlayerTextdraw.
     */
	public static PlayerTextdraw create(Player player, Vector2D pos, String text)
	{
		return SampObjectManager.get().createPlayerTextdraw(player, pos, text);
	}
	
	
	public static final int INVALID_ID =		0xFFFF;
	
	
	void show();
	void hide();
	
	boolean isShowed();
}

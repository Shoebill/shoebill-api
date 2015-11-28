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
import net.gtaun.shoebill.exception.CreationFailedException;

/**
 * 
 * 
 * @author MK124
 */
public interface Textdraw extends TextdrawBase
{
	public static Textdraw get(int id)
	{
		return SampObjectManager.get().getTextdraw(id);
	}
	
	public static Collection<Textdraw> get()
	{
		return SampObjectManager.get().getTextdraws();
	}
	
    /**
     * Create a Textdraw with params. If the Creation fails, it will throw a CreationFailedException.
     * @param x X-Pos where the Textdraw should be.
     * @param y Y-Pos where the Textdraw should be.
     * @param text The displayed Text.
     * @return The created Textdraw.
     */
	public static Textdraw create(float x, float y, String text) throws CreationFailedException
	{
		return SampObjectManager.get().createTextdraw(x, y, text);
	}

    /**
     * Create a Textdraw with params. If the Creation fails, it will throw a CreationFailedException.
     * @param x X-Pos where the Textdraw should be.
     * @param y Y-Pos where the Textdraw should be.
     * @return The created Textdraw.
     */
	public static Textdraw create(float x, float y)
	{
		return SampObjectManager.get().createTextdraw(x, y);
	}

    /**
     * Create a Textdraw with params. If the Creation fails, it will throw a CreationFailedException.
     * @param pos Vector2D-Position where the Textdraw should be.
     * @return The created Textdraw.
     */
	public static Textdraw create(Vector2D pos)
	{
		return SampObjectManager.get().createTextdraw(pos);
	}

    /**
     * Create a Textdraw with params. If the Creation fails, it will throw a CreationFailedException.
     * @param pos Vector2D-Position where the Textdraw should be.
     * @param text The displayed Text.
     * @return The created Textdraw.
     */
	public static Textdraw create(Vector2D pos, String text)
	{
		return SampObjectManager.get().createTextdraw(pos, text);
	}
	
	
	public static final int INVALID_ID =		0xFFFF;
	
	
	void show(Player player);
	void hide(Player player);
	
	void showForAll();
	void hideForAll();
	
	boolean isShowed(Player player);
}

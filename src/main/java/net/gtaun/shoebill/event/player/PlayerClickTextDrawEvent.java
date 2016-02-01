/**
 * Copyright (C) 2012 MK124
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

package net.gtaun.shoebill.event.player;

import net.gtaun.shoebill.object.Player;
import net.gtaun.shoebill.object.Textdraw;
import net.gtaun.util.event.Interruptable;

/**
 * This event represents the OnPlayerClickTextDraw of Pawn.
 * 
 * @author MK124
 * @see net.gtaun.shoebill.event.player.PlayerEvent
 * @see <a href="https://wiki.sa-mp.com/wiki/OnPlayerClickTextDraw">OnPlayerClickTextDraw</a>
 */
public class PlayerClickTextDrawEvent extends PlayerEvent implements Interruptable
{
	private int response = 0;
	private Textdraw textdraw;
	
	
	public PlayerClickTextDrawEvent(Player player, Textdraw textdraw)
	{
		super(player);
		this.textdraw = textdraw;
	}
	
	/*
	 * (non-Javadoc)
	 * @see net.gtaun.util.event.Event#interrupt()
	 */
	@Override
	public void interrupt()
	{
		super.interrupt();
	}
	
	/**
	 * This method is an alias for the interrupt() method.
     * @see PlayerClickTextDrawEvent#interrupt()
	 */
	public void setProcessed()
	{
		this.response |= 1;
		interrupt();
	}
	
	/**
     * Returns the current response value
     * @return Current response value
     */
	public int getResponse()
	{
		return response;
	}
	
	/**
     * @return The associated and clicked Textdraw for this event.
     */
	public Textdraw getTextdraw()
	{
		return textdraw;
	}
}

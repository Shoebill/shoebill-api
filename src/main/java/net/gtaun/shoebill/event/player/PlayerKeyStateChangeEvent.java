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

package net.gtaun.shoebill.event.player;

import net.gtaun.shoebill.object.Player;
import net.gtaun.shoebill.object.PlayerKeyState;

/**
 * This event represents the OnPlayerKeyStateChange of Pawn.
 * 
 * @author MK124
 * @see net.gtaun.shoebill.event.player.PlayerEvent
 * @see <a href="https://wiki.sa-mp.com/wiki/OnPlayerKeyStateChange">OnPlayerKeyStateChange</a>
 */
public class PlayerKeyStateChangeEvent extends PlayerEvent
{
	private PlayerKeyState oldState;
	private int ret = 1;
	
	public PlayerKeyStateChangeEvent(Player player, PlayerKeyState oldState)
	{
		super(player);
		this.oldState = oldState;
	}
    
    /**
     * @return The associated old PlayerKeyState for this event.
     */
	public PlayerKeyState getOldState()
	{
		return oldState;
	}
	
	/**
     * Disallows the further execution of this event in the whole abstract machine (also Pawn and other Plugins).
     */
	public void disallow() {
		this.ret &= 0;
	}

	/**
     * Returns the current response value
     * @return Current response value
     */
	public int getResponse() {
		return ret;
	}
}

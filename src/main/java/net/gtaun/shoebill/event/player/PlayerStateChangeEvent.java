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

import net.gtaun.shoebill.constant.PlayerState;
import net.gtaun.shoebill.object.Player;

/**
 * This event represents the OnPlayerStateChange of Pawn.
 * 
 * @author MK124
 * @see net.gtaun.shoebill.event.player.PlayerEvent
 * @see <a href="https://wiki.sa-mp.com/wiki/OnPlayerStateChange">OnPlayerStateChange</a>
 */
public class PlayerStateChangeEvent extends PlayerEvent
{
	private PlayerState oldState;
	
	
	public PlayerStateChangeEvent(Player player, int oldState)
	{
		super(player);
		this.oldState = PlayerState.get(oldState);
	}
    
    /**
     * @return The associated old PlayerState for this event.
     */
	public PlayerState getOldState()
	{
		return oldState;
	}
}

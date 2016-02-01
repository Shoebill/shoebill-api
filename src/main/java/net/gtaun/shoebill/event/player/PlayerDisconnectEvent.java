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

import net.gtaun.shoebill.constant.DisconnectReason;
import net.gtaun.shoebill.object.Player;

/**
 * This event represents the OnPlayerDisconnect of Pawn.
 * 
 * @author MK124
 * @see net.gtaun.shoebill.event.player.PlayerEvent
 * @see <a href="https://wiki.sa-mp.com/wiki/OnPlayerDisconnect">OnPlayerDisconnect</a>
 */
public class PlayerDisconnectEvent extends PlayerEvent
{
	private DisconnectReason reason;
	private int ret = 1;
	
	public PlayerDisconnectEvent(Player player, int reason)
	{
		super(player);
		this.reason = DisconnectReason.get(reason);
	}
    
    /**
     * @return The associated DisconnectReason for this event.
     */
	public DisconnectReason getReason()
	{
		return reason;
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

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
import net.gtaun.util.event.Interruptable;

/**
 * This event is responsible for the OnPlayerUpdate callback and is called every time a client or player updates the server with their status.
 * It should not be used very frequently unless you know what it's meant for.
 *
 * @author Marvin Haschker
 * @author MK124
 * @see net.gtaun.shoebill.event.player.PlayerEvent
 * @see <a href="https://wiki.sa-mp.com/wiki/OnPlayerUpdate">OnPlayerUpdate</a>
 */
public class PlayerUpdateEvent extends PlayerEvent implements Interruptable
{
	private int response = 1;

	public PlayerUpdateEvent(Player player)
	{
		super(player);
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
     * Disallows the further execution of this event in the whole abstract machine (also Pawn and other Plugins).
     */
	public void disallow()
	{
		this.response &= 0;
	}

    /**
     * Returns the current response value
     * @return Current response value
     */
	public int getResponse()
	{
		return response;
	}
}
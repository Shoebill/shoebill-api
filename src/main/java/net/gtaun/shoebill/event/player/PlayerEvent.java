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
import net.gtaun.util.event.Event;

/**
 * Base class for all ActorEvents, such as {@link net.gtaun.shoebill.event.player.PlayerStreamInEvent}
 *
 * @author MK124
 * @author Marvin Haschker
 * @see net.gtaun.util.event.Event
 */
public abstract class PlayerEvent extends Event
{
	private Player player;
	
	
	protected PlayerEvent(Player player)
	{
		this.player = player;
	}
    
    /**
     * @return The associated Player for this event.
     */
	public Player getPlayer()
	{
		return player;
	}
}

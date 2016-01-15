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

package net.gtaun.shoebill.event.checkpoint;

import net.gtaun.shoebill.object.Player;
import net.gtaun.util.event.Interruptable;

/**
 * This event represents the OnPlayerEnterCheckpoint callback from Pawn.
 *
 * @author MK124
 * @author Marvin Haschker
 * @see net.gtaun.shoebill.event.checkpoint.CheckpointEvent
 * @see <a href="https://wiki.sa-mp.com/wiki/OnPlayerEnterCheckpoint">OnPlayerEnterCheckpoint</a>
 */
public class CheckpointEnterEvent extends CheckpointEvent implements Interruptable
{
	public CheckpointEnterEvent(Player player)
	{
		super(player, player.getCheckpoint());
	}

    /**
     * This method stops further execution of this event in Shoebill.
     */
	@Override
	public void interrupt()
	{
		super.interrupt();
	}

    /**
     * This method is an alias for the interrupt() method.
     * @see CheckpointEnterEvent#interrupt()
     */
	public void setProcessed()
	{
		interrupt();
	}
}

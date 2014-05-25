/**
 * Copyright (C) 2011 JoJLlmAn
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
import java.util.stream.Collectors;

import net.gtaun.shoebill.constant.RaceCheckpointType;

/**
 *
 *
 * @author JoJLlmAn, MK124
 */
public interface RaceCheckpoint extends Checkpoint
{
	RaceCheckpointType getType();
	RaceCheckpoint getNext();

	@Override
	default void set(Player player)
	{
		player.setRaceCheckpoint(this);
	}

	@Override
	default void disable(Player player)
	{
		if (player.getRaceCheckpoint() != this) return;
		player.disableRaceCheckpoint();
	}

	@Override
	default boolean isInRange(Player player)
	{
		if (player.getRaceCheckpoint() != this) return false;
		return getLocation().isInRange(player.getLocation());
	}

	@Override
	default void update()
	{
		for (Player player : Player.get())
		{
			if (player != null && player.getRaceCheckpoint() == this) set(player);
		}
	}

	@Override
	default Collection<Player> getUsingPlayers()
	{
		return Player.get().stream().filter((p) -> p.getRaceCheckpoint() == this).collect(Collectors.toList());
	}
}

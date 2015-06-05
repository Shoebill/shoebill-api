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

import net.gtaun.shoebill.constant.RaceCheckpointType;
import net.gtaun.shoebill.data.Radius;

import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 *
 *
 * @author JoJLlmAn, MK124
 */
public interface RaceCheckpoint extends Checkpoint
{
	public static RaceCheckpoint create(Radius location, RaceCheckpointType type, Supplier<RaceCheckpoint> nextSupplier, Consumer<Player> onEnter, Consumer<Player> onLeave)
	{
		return new RaceCheckpoint()
		{
			@Override
			public Radius getLocation()
			{
				return location;
			}

			@Override
			public RaceCheckpointType getType()
			{
				return type;
			}

			@Override
			public RaceCheckpoint getNext()
			{
				return nextSupplier.get();
			}

			@Override
			public void onEnter(Player player)
			{
				onEnter.accept(player);
			}

			@Override
			public void onLeave(Player player)
			{
				onLeave.accept(player);
			}
		};
	}

	public static RaceCheckpoint create(Radius location, RaceCheckpointType type, RaceCheckpoint next, Consumer<Player> onEnter, Consumer<Player> onLeave)
	{
		return create(location, type, () -> next, onEnter, onLeave);
	}


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

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

import java.util.ArrayList;
import java.util.Collection;

import net.gtaun.shoebill.SampObjectStore;
import net.gtaun.shoebill.Shoebill;
import net.gtaun.shoebill.data.Radius;
import net.gtaun.shoebill.data.Vector3D;

/**
 *
 *
 * @author JoJLlmAn, MK124
 */
public interface Checkpoint
{
	Radius getLocation();

	default void onEnter(Player player)
	{

	}

	default void onLeave(Player player)
	{

	}

	default float getSize()
	{
		return getLocation().getRadius();
	}

	default void set(Player player)
	{
		player.setCheckpoint(this);
	}

	default void disable(Player player)
	{
		if (player.getCheckpoint() != this) return;
		player.setCheckpoint(null);
	}

	default boolean isInRange(Player player)
	{
		if (player.getCheckpoint() != this) return false;
		return getLocation().isInRange(player.getLocation());
	}

	default boolean isInRange(Vector3D pos)
	{
		return getLocation().isInRange(pos);
	}

	default void update()
	{
		SampObjectStore store = Shoebill.get().getSampObjectManager();
		Collection<? extends Player> players = store.getPlayers();
		for (Player player : players)
		{
			if (player == null) continue;
			if (player.getCheckpoint() == this) set(player);
		}
	}

	default Collection<Player> getUsingPlayers()
	{
		SampObjectStore store = Shoebill.get().getSampObjectManager();
		Collection<Player> usingPlayers = new ArrayList<>();
		Collection<Player> players = store.getPlayers();
		for (Player player : players)
		{
			if (player.getCheckpoint() == this) usingPlayers.add(player);
		}

		return usingPlayers;
	}
}

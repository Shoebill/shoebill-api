/**
 * Copyright (C) 2011 JoJLlmAn
 * Copyright (C) 2011-2012 MK124
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

package net.gtaun.shoebill.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

import net.gtaun.shoebill.SampObjectStore;
import net.gtaun.shoebill.Shoebill;
import net.gtaun.shoebill.constant.RaceCheckpointType;
import net.gtaun.shoebill.object.Player;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.apache.commons.lang3.tuple.Pair;

/**
 * 
 * 
 * @author JoJLlmAn, MK124
 */
public class RaceCheckpoint extends Checkpoint
{
	public static List<RaceCheckpoint> createRaceCheckpoints(List<Radius> locations, RaceCheckpointType type)
	{
		List<RaceCheckpoint> checkpoints = new ArrayList<>(locations.size());
		
		RaceCheckpoint lastCheckpoint = null;
		for (ListIterator<Radius> it = locations.listIterator(locations.size()); it.hasPrevious();)
		{
			Radius radius = it.previous();
			lastCheckpoint = new RaceCheckpoint(radius, type, lastCheckpoint);
			checkpoints.add(lastCheckpoint);
		}
		Collections.reverse(checkpoints);
		
		return checkpoints;
	}
	
	public static  List<RaceCheckpoint> createRaceCheckpoints(List<Pair<Radius, RaceCheckpointType>> pairs)
	{
		List<RaceCheckpoint> checkpoints = new ArrayList<>(pairs.size());
		
		RaceCheckpoint lastCheckpoint = null;
		for (ListIterator<Pair<Radius, RaceCheckpointType>> it = pairs.listIterator(pairs.size()); it.hasPrevious();)
		{
			Pair<Radius, RaceCheckpointType> pair = it.previous();
			lastCheckpoint = new RaceCheckpoint(pair.getLeft(), pair.getRight(), lastCheckpoint);
			checkpoints.add(lastCheckpoint);
		}
		Collections.reverse(checkpoints);
		
		return checkpoints;
	}
	
	
	private RaceCheckpointType type;
	private RaceCheckpoint next;
	
	
	public RaceCheckpoint(Radius loc, RaceCheckpointType type, RaceCheckpoint next)
	{
		super(loc);
		this.type = type;
		this.next = next;
	}

	public RaceCheckpoint(Radius loc, RaceCheckpointType type)
	{
		this(loc, type, null);
	}
	
	public RaceCheckpoint(Location loc, float size, RaceCheckpointType type, RaceCheckpoint next)
	{
		this(new Radius(loc, size), type, next);
	}
	
	public RaceCheckpoint(Location loc, float size, RaceCheckpointType type)
	{
		this(new Radius(loc, size), type, null);
	}

	public RaceCheckpoint(Vector3D pos, float size, RaceCheckpointType type, RaceCheckpoint next)
	{
		this(new Radius(pos, size), type, next);
	}
	
	public RaceCheckpoint(Vector3D pos, float size, RaceCheckpointType type)
	{
		this(new Radius(pos, size), type, null);
	}
	
	public RaceCheckpoint(float x, float y, float z, float size, RaceCheckpointType type, RaceCheckpoint next)
	{
		this(new Radius(x, y, z, size), type, next);
	}
	
	public RaceCheckpoint(float x, float y, float z, float size, RaceCheckpointType type)
	{
		this(new Radius(x, y, z, size), type, null);
	}

	@Override
	public String toString()
	{
		return new ToStringBuilder(this, ToStringStyle.DEFAULT_STYLE)
			.append("type", type).append("next", next).toString();
	}
	
	public RaceCheckpointType getType()
	{
		return type;
	}
	
	public void setType(RaceCheckpointType type)
	{
		this.type = type;
		update();
	}
	
	public RaceCheckpoint getNext()
	{
		return next;
	}
	
	public void setNext(RaceCheckpoint next)
	{
		this.next = next;
		update();
	}

	@Override
	public void set(Player player)
	{
		player.setRaceCheckpoint(this);
	}

	@Override
	public void disable(Player player)
	{
		if (player.getRaceCheckpoint() != this) return;
		player.disableRaceCheckpoint();
	}

	@Override
	public boolean isInRange(Player player)
	{
		if (player.getRaceCheckpoint() != this) return false;
		return getLocation().isInRange(player.getLocation());
	}

	@Override
	public boolean isInRange(Vector3D pos)
	{
		return getLocation().isInRange(pos);
	}

	@Override
	public void update()
	{
		SampObjectStore store = Shoebill.Instance.get().getSampObjectStore();
		for (Player player : store.getPlayers())
		{
			if (player == null) continue;
			if (player.getRaceCheckpoint() == this) set(player);
		}
	}
	
	@Override
	public Collection<Player> getUsingPlayers()
	{
		SampObjectStore store = Shoebill.Instance.get().getSampObjectStore();
		Collection<Player> players = new ArrayList<>();
		for (Player player : store.getPlayers())
		{
			if (player.getRaceCheckpoint() == this) players.add(player);
		}
		
		return players;
	}
}

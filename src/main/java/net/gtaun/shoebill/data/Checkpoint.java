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

import net.gtaun.shoebill.SampObjectStore;
import net.gtaun.shoebill.Shoebill;
import net.gtaun.shoebill.object.Player;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 
 * 
 * @author JoJLlmAn, MK124
 */
public class Checkpoint
{
	private Radius location;
	
	
	public Checkpoint(Radius loc)
	{
		location = loc.immutable();
	}
	
	public Checkpoint(Location pos, float size)
	{
		this(new Radius(pos, size));
	}
	
	public Checkpoint(Vector3D pos, float size)
	{
		this(new Radius(pos, size));
	}
	
	public Checkpoint(float x, float y, float z, float size)
	{
		this(new Radius(x, y, z, size));
	}
	
	
	public String toString()
	{
		return new ToStringBuilder(this, ToStringStyle.DEFAULT_STYLE)
			.append("location", location).toString();
	}
	
	public Radius getLocation()
	{
		return location.clone();
	}
	
	public void setLocation(float x, float y, float z)
	{
		location.set(x, y, z);
		update();
	}
	
	public void setLocation(Vector3D pos)
	{
		location.set(pos);
		update();
	}
	
	public void setLocation(Radius loc)
	{
		location.set(loc);
		update();
	}
	
	public float getSize()
	{
		return location.getRadius();
	}
	
	public void setSize(float size)
	{
		location.setRadius(size);
		update();
	}
	
	public void set(Player player)
	{
		player.setCheckpoint(this);
	}
	
	public void disable(Player player)
	{
		if (player.getCheckpoint() != this) return;
		player.setCheckpoint(null);
	}
	
	public boolean isInRange(Player player)
	{
		if (player.getCheckpoint() != this) return false;
		return location.isInRange(player.getLocation());
	}
	
	public boolean isInRange(Vector3D pos)
	{
		return location.isInRange(pos);
	}
	
	public void update()
	{
		SampObjectStore store = Shoebill.Instance.get().getSampObjectStore();
		Collection<? extends Player> players = store.getPlayers();
		for (Player player : players)
		{
			if (player == null) continue;
			if (player.getCheckpoint() == this) set(player);
		}
	}
	
	public Collection<Player> getUsingPlayers()
	{
		SampObjectStore store = Shoebill.Instance.get().getSampObjectStore();
		Collection<Player> usingPlayers = new ArrayList<>();
		Collection<Player> players = store.getPlayers();
		for (Player player : players)
		{
			if (player.getCheckpoint() == this) usingPlayers.add(player);
		}
		
		return usingPlayers;
	}
}

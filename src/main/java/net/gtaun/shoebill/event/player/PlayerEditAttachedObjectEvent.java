/**
 * Copyright (C) 2015-2016 MK124
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

import net.gtaun.shoebill.data.Vector3D;
import net.gtaun.shoebill.object.Player;
import net.gtaun.shoebill.object.PlayerAttach.PlayerAttachSlot;
import net.gtaun.util.event.Interruptable;

/**
 * 
 * 
 * @author MK124
 */
public class PlayerEditAttachedObjectEvent extends PlayerEvent implements Interruptable
{
	private PlayerAttachSlot slot;
	private Vector3D offset, rotation, scale;
    private boolean response;
	
	public PlayerEditAttachedObjectEvent(Player player, PlayerAttachSlot slot, boolean response, Vector3D offset, Vector3D rotation, Vector3D scale)
	{
		super(player);
		this.slot = slot;
        this.response = response;
        this.offset = offset;
        this.rotation = rotation;
        this.scale = scale;
	}
	
	@Override
	public void interrupt()
	{
		super.interrupt();
	}
	
	public PlayerAttachSlot getSlot()
	{
		return slot;
	}

    public Vector3D getOffset() {
        return offset;
    }

    public Vector3D getRotation() {
        return rotation;
    }

    public Vector3D getScale() {
        return scale;
    }

    public boolean getResponse() {
        return response;
    }
}

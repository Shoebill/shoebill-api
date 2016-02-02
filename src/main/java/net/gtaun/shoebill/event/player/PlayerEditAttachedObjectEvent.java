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
 * This event represents the OnPlayerEditAttachedObject of Pawn.
 * 
 * @author MK124
 * @see net.gtaun.shoebill.event.player.PlayerEvent
 * @see <a href="https://wiki.sa-mp.com/wiki/OnPlayerEditAttachedObject">OnPlayerEditAttachedObject</a>
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
     * @return The associated slot for whom player the object was attached for this event.
     */
	public PlayerAttachSlot getSlot()
	{
		return slot;
	}
    
    /**
     * @return The associated offset for this event.
     */
    public Vector3D getOffset() {
        return offset;
    }
    
    /**
     * @return The associated rotation for this event.
     */
    public Vector3D getRotation() {
        return rotation;
    }
    
    /**
     * @return The associated scale for this event.
     */
    public Vector3D getScale() {
        return scale;
    }

    /**
     * Returns the current response value
     * @return Current response value
     */
    public boolean getResponse() {
        return response;
    }
}

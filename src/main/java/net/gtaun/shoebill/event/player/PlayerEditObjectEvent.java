/**
 * Copyright (C) 2012 MK124
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

import net.gtaun.shoebill.constant.ObjectEditResponse;
import net.gtaun.shoebill.data.Location;
import net.gtaun.shoebill.data.Vector3D;
import net.gtaun.shoebill.object.Player;
import net.gtaun.shoebill.object.SampObject;
import net.gtaun.util.event.Interruptable;

/**
 * This event represents the OnPlayerEditObject of Pawn.
 * 
 * @author MK124
 * @see net.gtaun.shoebill.event.player.PlayerEvent
 * @see <a href="https://wiki.sa-mp.com/wiki/OnPlayerEditObject">OnPlayerEditObject</a>
 */
public class PlayerEditObjectEvent extends PlayerEvent implements Interruptable
{
	private SampObject object;
	private ObjectEditResponse editResponse;
    private Location newLocation;
    private Vector3D newRotation;

    public PlayerEditObjectEvent(Player player, SampObject object, ObjectEditResponse response, Location newLocation, Vector3D newRotation) {
        super(player);
		this.object = object;
		this.editResponse = response;
        this.newLocation = newLocation;
        this.newRotation = newRotation;
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
     * @return The associated SampObject for this event.
     */
	public SampObject getObject()
	{
		return object;
	}
    
    /**
     * @return The associated new Location for this event.
     */
    public Location getNewLocation() {
        return newLocation;
    }
    
    /**
     * @return The associated new rotation for this event.
     */
    public Vector3D getNewRotation() {
        return newRotation;
    }
    
    /**
     * @return The associated returned object for this event.
     */
    public ObjectEditResponse getEditResponse() {
		return editResponse;
	}
}

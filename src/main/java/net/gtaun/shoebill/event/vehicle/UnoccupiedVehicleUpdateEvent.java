/**
 * Copyright (C) 2014 MK124
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

package net.gtaun.shoebill.event.vehicle;

import net.gtaun.shoebill.data.Location;
import net.gtaun.shoebill.data.Vector3D;
import net.gtaun.shoebill.object.Player;
import net.gtaun.shoebill.object.Vehicle;

/**
 *
 *
 * @author JoJLlmAn
 */
public class UnoccupiedVehicleUpdateEvent extends VehicleEvent
{
	private Player player;
	private Location newLocation;
    private Vector3D velocity;

	public UnoccupiedVehicleUpdateEvent(Vehicle vehicle, Player player, Location newLocation, Vector3D velocity)
	{
		super(vehicle);
		this.player = player;
		this.newLocation = newLocation;
        this.velocity = velocity;
	}

	public Player getPlayer()
	{
		return player;
	}

	public Location getNewLocation()
	{
		return newLocation;
	}

    public Vector3D getVelocity() {
        return velocity;
    }
}

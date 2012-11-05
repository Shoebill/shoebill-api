/**
 * Copyright (C) 2011 JoJLlmAn
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

package net.gtaun.shoebill.events.vehicle;

import net.gtaun.shoebill.object.Player;
import net.gtaun.shoebill.object.Vehicle;

/**
 * @author JoJLlmAn
 *
 */

public class VehicleUnoccupiedUpdateEvent extends VehicleEvent
{
	private Player player;
	private int passengerSeat;
	
	public Player getPlayer()			{ return player; }
	public int getPassengerSeat()		{ return passengerSeat; }
	
	
	public VehicleUnoccupiedUpdateEvent( Vehicle vehicle, Player player, int passengeSeat )
	{
		super( vehicle );
		this.player = player;
		this.passengerSeat = passengeSeat;
	}
}

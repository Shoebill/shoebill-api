/**
 * Copyright (C) 2011 MK124
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

package net.gtaun.shoebill.constant;

/**
 * To be used with getState or PlayerStateChangeEvent.
 * 
 * @author MK124
 * 
 * @see net.gtaun.shoebill.object.Player#getState
 * @see net.gtaun.shoebill.event.player.PlayerStateChangeEvent
 */
public enum PlayerState
{
	/**
	 * Empty (while initializing)
	 */
	NONE						(0),
	
	/**
	 * Player is on foot
	 */
	ONFOOT						(1),
	
	/**
	 * Player is driver of a vehicle
	 */
	DRIVER						(2),
	
	/**
	 * Player is passenger of a vehicle
	 */
	PASSENGER					(3),
	
	/**
	 * Player exits a vehicle (Used internally)
	 */
	EXIT_VEHICLE				(4),
	
	/**
	 * Player enters a vehicle as driver (Used internally)
	 */
	ENTER_VEHICLE_DRIVER		(5),
	
	/**
	 * Player enters a vehicle as passenger (Used internally)
	 */
	ENTER_VEHICLE_PASSENGER		(6),
	
	/**
	 * Player is wasted or on class selection
	 */
	WASTED						(7),
	
	/**
	 * Player is spawned
	 */
	SPAWNED						(8),
	
	/**
	 * Player is spectating
	 */
	SPECTATING					(9);
	
	
	public static PlayerState get(int value)
	{
		return values() [value];
	}
	
	
	private final int value;
	
	
	private PlayerState(int value)
	{
		this.value = value;
	}
	
	public int getValue()
	{
		return value;
	}
}

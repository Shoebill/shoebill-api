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

package net.gtaun.shoebill.event.vehicle;

import net.gtaun.shoebill.object.primitive.PlayerPrim;
import net.gtaun.shoebill.object.primitive.VehiclePrim;

/**
 * @author MK124
 *
 */

public class VehicleEnterEvent extends VehicleEvent
{
	private PlayerPrim player;
	private boolean isPassenger;
	
	public PlayerPrim getPlayer()			{ return player; }
	public boolean isPassenger()		{ return isPassenger; }
	
	
	public VehicleEnterEvent( VehiclePrim vehicle, PlayerPrim player, boolean isPassenger )
	{
		super( vehicle );
		this.player = player;
		this.isPassenger = isPassenger;
	}
}

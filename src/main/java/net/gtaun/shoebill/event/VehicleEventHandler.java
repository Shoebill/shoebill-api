/**
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

package net.gtaun.shoebill.event;

import net.gtaun.shoebill.event.vehicle.VehicleDeathEvent;
import net.gtaun.shoebill.event.vehicle.VehicleDestroyEvent;
import net.gtaun.shoebill.event.vehicle.VehicleEnterEvent;
import net.gtaun.shoebill.event.vehicle.VehicleExitEvent;
import net.gtaun.shoebill.event.vehicle.VehicleModEvent;
import net.gtaun.shoebill.event.vehicle.VehiclePaintjobEvent;
import net.gtaun.shoebill.event.vehicle.VehicleResprayEvent;
import net.gtaun.shoebill.event.vehicle.VehicleSpawnEvent;
import net.gtaun.shoebill.event.vehicle.VehicleStreamInEvent;
import net.gtaun.shoebill.event.vehicle.VehicleStreamOutEvent;
import net.gtaun.shoebill.event.vehicle.VehicleUnoccupiedUpdateEvent;
import net.gtaun.shoebill.event.vehicle.VehicleUpdateDamageEvent;
import net.gtaun.shoebill.event.vehicle.VehicleUpdateEvent;
import net.gtaun.util.event.AbstractEventHandler;

/**
 * 
 * 
 * @author MK124
 */
public abstract class VehicleEventHandler extends AbstractEventHandler
{
	protected VehicleEventHandler()
	{
		super(VehicleEventHandler.class);
	}
	
	public void onVehicleDestroy(VehicleDestroyEvent event)							{ }
	public void onVehicleSpawn(VehicleSpawnEvent event)								{ }
	public void onVehicleDeath(VehicleDeathEvent event)								{ }
	public void onVehicleUpdate(VehicleUpdateEvent event)							{ }
	public void onVehicleEnter(VehicleEnterEvent event)								{ }
	public void onVehicleExit(VehicleExitEvent event)								{ }
	public void onVehicleMod(VehicleModEvent event)									{ }
	public void onVehiclePaintjob(VehiclePaintjobEvent event)						{ }
	public void onVehicleRespray(VehicleResprayEvent event)							{ }
	public void onVehicleUpdateDamage(VehicleUpdateDamageEvent event)				{ }
	public void onVehicleUnoccupiedUpdate(VehicleUnoccupiedUpdateEvent event)		{ }
	public void onVehicleStreamIn(VehicleStreamInEvent event)						{ }
	public void onVehicleStreamOut(VehicleStreamOutEvent event)						{ }
}

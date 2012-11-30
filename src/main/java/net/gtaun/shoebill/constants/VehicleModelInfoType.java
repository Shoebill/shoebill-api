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

package net.gtaun.shoebill.constants;

/**
 * 
 * 
 * @author MK124
 */
public enum VehicleModelInfoType
{
	VEHICLE_MODEL_INFO_SIZE				(1),
	VEHICLE_MODEL_INFO_FRONTSEAT		(2),
	VEHICLE_MODEL_INFO_REARSEAT			(3),
	VEHICLE_MODEL_INFO_PETROLCAP		(4),
	VEHICLE_MODEL_INFO_WHEELSFRONT		(5),
	VEHICLE_MODEL_INFO_WHEELSREAR		(6),
	VEHICLE_MODEL_INFO_WHEELSMID		(7),
	VEHICLE_MODEL_INFO_FRONT_BUMPER_Z	(8),
	VEHICLE_MODEL_INFO_REAR_BUMPER_Z	(9);
	
	
	public static VehicleModelInfoType get(int value)
	{
		return values() [value-1];
	}
	
	
	private final int value;
	
	
	private VehicleModelInfoType(int value)
	{
		this.value = value;
	}
	
	public int getValue()
	{
		return value;
	}
}

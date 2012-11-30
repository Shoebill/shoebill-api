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

package net.gtaun.shoebill.constants;

/**
 * 
 * 
 * @author MK124
 */
public enum VehicleComponentSlot
{
	SPOILER				(0),
	HOOD				(1),
	ROOF				(2),
	SIDE_SKIRT			(3),
	LAMPS				(4),
	NITRO				(5),
	EXHAUST				(6),
	WHEELS				(7),
	STEREO				(8),
	HYDRAULICS			(9),
	FRONT_BUMPER		(10),
	REAR_BUMPER			(11),
	VENT_RIGHT			(12),
	VENT_LEFT			(13);
	
	
	public static VehicleComponentSlot get(int value)
	{
		return values() [value];
	}
	
//	public static int getComponentSlot(int componentId)
//	{
//		return SampNativeFunction.getVehicleComponentType(componentId);
//	}
	
	
	private final int value;
	
	
	private VehicleComponentSlot(int value)
	{
		this.value = value;
	}
	
	public int getValue()
	{
		return value;
	}
}

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
 * To be used with VehicleComponent.
 * 
 * @author MK124
 * 
 * @see net.gtaun.shoebill.object.VehicleComponent
 */
public enum VehicleComponentSlot
{
	/**
	 * Spoiler
	 */
	SPOILER				(0),

	/**
	 * Hood
	 */
	HOOD				(1),

	/**
	 * Roof
	 */
	ROOF				(2),

	/**
	 * Side Skirts
	 */
	SIDE_SKIRT			(3),

	/**
	 * Lamps
	 */
	LAMPS				(4),

	/**
	 * Nitro
	 */
	NITRO				(5),

	/**
	 * Exhaust
	 */
	EXHAUST				(6),

	/**
	 * Wheels
	 */
	WHEELS				(7),

	/**
	 * Stereo
	 */
	STEREO				(8),

	/**
	 * Hydraulics
	 */
	HYDRAULICS			(9),

	/**
	 * Front Bumper
	 */
	FRONT_BUMPER		(10),

	/**
	 * Rear Bumper
	 */
	REAR_BUMPER			(11),

	/**
	 * Right Vent
	 */
	VENT_RIGHT			(12),

	/**
	 * Left Vent
	 */
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

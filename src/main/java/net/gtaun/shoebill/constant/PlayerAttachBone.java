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
 * To be used with PlayerAttach.
 * 
 * @author MK124
 * 
 * @see net.gtaun.shoebill.object.PlayerAttach.Slot
 */
public enum PlayerAttachBone
{
	/**
	 * Not usable (will crash the client)
	 */
	NOT_USABLE			(0),
	
	/**
	 * Spine
	 */
	SPINE				(1),
	
	/**
	 * Head
	 */
	HEAD				(2),
	
	/**
	 * Left upper arm
	 */
	UPPER_ARM_LEFT		(3),
	
	/**
	 * Right upper arm
	 */
	UPPER_ARM_RIGHT		(4),
	
	/**
	 * Left hand
	 */
	HAND_LEFT			(5),
	
	/**
	 * Right hand
	 */
	HAND_RIGHT			(6),
	
	/**
	 * Left thigh
	 */
	THIGH_LEFT			(7),
	
	/**
	 * Right thigh
	 */
	THIGH_RIGHT			(8),
	
	/**
	 * Left foot
	 */
	FOOT_LEFT			(9),
	
	/**
	 * Right foot
	 */
	FOOT_RIGHT			(10),
	
	/**
	 * Right calf
	 */
	CALF_RIGHT			(11),
	
	/**
	 * Left calf
	 */
	CALF_LEFT			(12),
	
	/**
	 * Left forearm
	 */
	FOREARM_LEFT		(13),
	
	/**
	 * Right forearm
	 */
	FOREARM_RIGHT		(14),
	
	/**
	 * Left clavicle
	 */
	CLAVICLE_LEFT		(15),
	
	/**
	 * Right clavicle
	 */
	CLAVICLE_RIGHT		(16),
	
	/**
	 * Neck
	 */
	NECK				(17),
	
	/**
	 * Jaw
	 */
	JAW					(18);
	
	
	public static PlayerAttachBone get(int value)
	{
		return values() [value];
	}
	
	
	private final int value;
	
	
	private PlayerAttachBone(int value)
	{
		this.value = value;
	}
	
	public int getValue()
	{
		return value;
	}
}

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
 * 
 * 
 * @author MK124
 */
public enum PlayerAttachBone
{
	NOT_USABLE			(0),
	SPINE				(1),
	HEAD				(2),
	UPPER_ARM_LEFT		(3),
	UPPER_ARM_RIGHT		(4),
	HAND_LEFT			(5),
	HAND_RIGHT			(6),
	THIGH_LEFT			(7),
	THIGH_RIGHT			(8),
	FOOT_LEFT			(9),
	FOOT_RIGHT			(10),
	CALF_RIGHT			(11),
	CALF_LEFT			(12),
	FOREARM_LEFT		(13),
	FOREARM_RIGHT		(14),
	CLAVICLE_LEFT		(15),
	CLAVICLE_RIGHT		(16),
	NECK				(17),
	JAW					(18);
	
	
	public static PlayerAttachBone get(int data)
	{
		return values() [data];
	}
	
	
	private final int data;
	
	
	private PlayerAttachBone(int data)
	{
		this.data = data;
	}
	
	public int getData()
	{
		return data;
	}
}

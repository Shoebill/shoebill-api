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
 * @author MK124
 *
 */

public enum RaceCheckpointType
{
	NORMAL				(0),
	NORMAL_FINISH		(1),
	NOTHING				(2),
	AIR					(3),
	AIR_FINISH			(4);
	
	
	public static RaceCheckpointType get( int data )
	{
		return values() [data];
	}
	
	
	private final int data;
	
	
	private RaceCheckpointType( int data )
	{
		this.data = data;
	}
	
	public int getData()
	{
		return data;
	}
}

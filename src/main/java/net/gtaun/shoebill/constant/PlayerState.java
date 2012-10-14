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

public enum PlayerState
{
	NONE						(0),
	ONFOOT						(1),
	DRIVER						(2),
	PASSENGER					(3),
	EXIT_VEHICLE				(4),
	ENTER_VEHICLE_DRIVER		(5),
	ENTER_VEHICLE_PASSENGER		(6),
	WASTED						(7),
	SPAWNED						(8),
	SPECTATING					(9);
	
	
	public static PlayerState get( int data )
	{
		return values() [data];
	}
	
	
	private final int data;
	
	
	private PlayerState( int data )
	{
		this.data = data;
	}
	
	public int getData()
	{
		return data;
	}
}

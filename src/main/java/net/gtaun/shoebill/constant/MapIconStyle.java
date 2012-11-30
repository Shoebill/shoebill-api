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
 * To be used with setMapIcon.
 * 
 * @author MK124
 * 
 * @see net.gtaun.shoebill.object.Player#setMapIcon
 */
public enum MapIconStyle
{
	/**
	 * Display in the player's local area
	 */
	LOCAL					(0),
	
	/**
	 * Display always
	 */
	GLOBAL					(1),
	
	/**
	 * Display in the player's local area and has a checkpoint marker
	 */
	LOCAL_CHECKPOINT		(2),
	
	/**
	 * Display always and has a checkpoint marker
	 */
	GLOBAL_CHECKPOINT		(3);
	
	
	public static MapIconStyle get(int value)
	{
		return values() [value];
	}
	
	
	private final int value;
	
	
	private MapIconStyle(int value)
	{
		this.value = value;
	}
	
	public int getValue()
	{
		return value;
	}
}

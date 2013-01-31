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

package net.gtaun.shoebill.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * To be used with setSpecialAction or getSpecialAction.
 * 
 * @author MK124
 * 
 * @see net.gtaun.shoebill.object.Player#setSpecialAction
 * @see net.gtaun.shoebill.object.Player#getSpecialAction
 */
public enum SpecialAction
{
	/**
	 * None
	 */
	NONE					(0),
	
	/**
	 * Detect if the player is crouching
	 */
	DUCK					(1),
	
	/**
	 * Use jetpack
	 */
	USE_JETPACK				(2),
	
	/**
	 * Detect if the player is entering a vehicle via an animation
	 */
	ENTER_VEHICLE			(3),
	
	/**
	 * Detect if the player is exiting a vehicle via an animation
	 */
	EXIT_VEHICLE			(4),
	
	/**
	 * Dance 1
	 */
	DANCE1					(5),
	
	/**
	 * Dance 2
	 */
	DANCE2					(6),
	
	/**
	 * Dance 3
	 */
	DANCE3					(7),
	
	/**
	 * Dance 4
	 */
	DANCE4					(8),
	
	/**
	 * Hands up 
	 */
	HANDSUP					(10),
	
	/**
	 * Use cellphone
	 */
	USE_CELLPHONE			(11),
	
	/**
	 * Sitting
	 */
	SITTING					(12),
	
	/**
	 * Stop use cellphone
	 */
	STOP_USE_CELLPHONE		(13),
	
	/**
	 * Will increase the player's drunk level when used
	 */
	DRINK_BEER				(20),
	
	/**
	 * Will give the player a cigar
	 */
	SMOKE_CIGGY				(21),
	
	/**
	 * Will give the player a wine bottle to get drunk from
	 */
	DRINK_WINE				(22),
	
	/**
	 * Will give the player a sprunk bottle to drink from
	 */
	DRINK_SPRUNK			(23),
	
	/**
	 * Will force the player in to cuffs (hands are behind their back)
	 */
	CUFFED					(24),
	
	/**
	 * Will apply a 'carrying' animation to the player
	 */
	CARRY					(25),
	
	/**
	 * Will make make the player perform the pissing animation with visible pee
	 */
	SPECIAL_ACTION_PISSING	(68);
	
	
	private static final Map<Integer, SpecialAction> VALUES = new HashMap<>();
	public static SpecialAction get(int value)
	{
		return VALUES.get(value);
	}
	
	static
	{
		for(SpecialAction val : values()) VALUES.put(val.value, val);
	}
	
	
	private final int value;
	
	
	private SpecialAction(int value)
	{
		this.value = value;
	}
	
	public int getValue()
	{
		return value;
	}
}

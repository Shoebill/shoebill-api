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
 * 
 * 
 * @author MK124
 */
public enum SpecialAction
{
	NONE					(0),
	DUCK					(1),
	USE_JETPACK				(2),
	ENTER_VEHICLE			(3),
	EXIT_VEHICLE			(4),
	DANCE1					(5),
	DANCE2					(6),
	DANCE3					(7),
	DANCE4					(8),
	HANDSUP					(10),
	USE_CELLPHONE			(11),
	SITTING					(12),
	STOP_USE_CELLPHONE		(13),
	DRINK_BEER				(20),
	SMOKE_CIGGY				(21),
	DRINK_WINE				(22),
	DRINK_SPRUNK			(23),
	CUFFED					(24);
	
	
	private static final Map<Integer, SpecialAction> VALUES = new HashMap<Integer, SpecialAction>();
	public static SpecialAction get(int data)
	{
		return VALUES.get(data);
	}
	
	static
	{
		for(SpecialAction action : values()) VALUES.put(action.data, action);
	}
	
	
	private final int data;
	
	
	private SpecialAction(int data)
	{
		this.data = data;
	}
	
	public int getData()
	{
		return data;
	}
}

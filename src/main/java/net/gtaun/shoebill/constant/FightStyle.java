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

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * 
 * @author MK124
 */
public enum FightStyle
{
	NORMAL			(4),
	BOXING			(5),
	KUNGFU			(6),
	KNEEHEAD		(7),
	GRABKICK		(15),
	ELBOW			(16);
	
	
	private static final Map<Integer, FightStyle> VALUES = new HashMap<Integer, FightStyle>();
	public static FightStyle get(int data)
	{
		return VALUES.get(data);
	}
	
	static
	{
		for(FightStyle style : values()) VALUES.put(style.data, style);
	}
	
	
	private final int data;
	
	
	
	private FightStyle(int data)
	{
		this.data = data;
	}
	
	public int getData()
	{
		return data;
	}
}

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

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * 
 * @author MK124
 */
public enum SpectateMode
{
	NORMAL		(1),
	FIXED		(2),
	SIDE		(3);
	
	
	private static final Map<Integer, SpectateMode> VALUES = new HashMap<Integer, SpectateMode>();
	public static SpectateMode get(int data)
	{
		return VALUES.get(data);
	}
	
	static
	{
		for(SpectateMode mode : values()) VALUES.put(mode.data, mode);
	}
	

	private final int data;
	
	
	private SpectateMode(int data)
	{
		this.data = data;
	}
	
	public int getData()
	{
		return data;
	}
}

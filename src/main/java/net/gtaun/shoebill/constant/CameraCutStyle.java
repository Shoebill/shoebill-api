/**
 * Copyright (C) 2012 MK124
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
 * To be used with setCameraLookAt, interpolateCameraPos and interpolateCameraLookAt.
 * 
 * @author MK124
 * 
 * @see net.gtaun.shoebill.object.Player#setCameraLookAt
 * @see net.gtaun.shoebill.object.Player#interpolateCameraPos
 * @see net.gtaun.shoebill.object.Player#interpolateCameraLookAt
 */
public enum CameraCutStyle
{
	/**
	 * Direct cut
	 */
	CUT		(2),
	
	/**
	 * Smooth movement
	 */
	MOVE 	(1);
	
	
	private static final Map<Integer, CameraCutStyle> VALUES = new HashMap<>();
	public static CameraCutStyle get(int value)
	{
		return VALUES.get(value);
	}
	
	static
	{
		for(CameraCutStyle val : values()) VALUES.put(val.value, val);
	}
	
	
	private final int value;
	
	
	private CameraCutStyle(int value)
	{
		this.value = value;
	}
	
	public int getValue()
	{
		return value;
	}
}

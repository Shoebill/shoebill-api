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

package net.gtaun.shoebill.constants;

/**
 * 
 * 
 * @author MK124
 */
public enum ObjectMaterialTextAlign
{
	LEFT		(0),
	CENTER		(1),
	RIGHT		(2);
	
	
	public static ObjectMaterialTextAlign get(int value)
	{
		return values() [value];
	}
	
	
	private final int value;
	
	
	private ObjectMaterialTextAlign(int value)
	{
		this.value = value;
	}
	
	public int getValue()
	{
		return value;
	}
}

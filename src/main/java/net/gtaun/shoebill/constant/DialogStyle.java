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
 * To be used with showDialog.
 * 
 * @author MK124
 * 
 * @see net.gtaun.shoebill.object.Player#showDialog
 * @see net.gtaun.shoebill.object.DialogId#show
 */
public enum DialogStyle
{
	/**
	 * Message box dialog
	 */
	MSGBOX		(0),
	
	/**
	 * Input dialog
	 */
	INPUT		(1),
	
	/**
	 * List dialog
	 */
	LIST		(2),
	
	/**
	 * Password input dialog
	 */
	PASSWORD	(3);
	
	
	public static DialogStyle get(int value)
	{
		return values() [value];
	}
	
	
	private final int value;
	
	
	private DialogStyle(int value)
	{
		this.value = value;
	}
	
	public int getValue()
	{
		return value;
	}
}

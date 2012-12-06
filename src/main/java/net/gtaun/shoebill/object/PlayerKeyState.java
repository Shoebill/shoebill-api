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

package net.gtaun.shoebill.object;

import net.gtaun.shoebill.constant.PlayerKey;

/**
 * 
 * 
 * @author MK124
 */
public interface PlayerKeyState extends PlayerRelated
{
	public static final int KEY_UP		= -128;
	public static final int KEY_DOWN	= 128;
	public static final int KEY_LEFT	= -128;
	public static final int KEY_RIGHT	= 128;
	
	
	int getKeys();
	int getUpdownValue();
	int getLeftrightValue();
	boolean isKeyPressed(PlayerKey key);
}

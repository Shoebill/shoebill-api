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

/**
 * 
 * 
 * @author Kee
 */
public interface PlayerKeyState
{
	public enum Key
	{
		ACTION					(1),
		CROUCH					(2),
		FIRE					(4),
		SPRINT					(8),
		SECONDARY_ATTACK		(16),
		JUMP					(32),
		LOOK_RIGHT				(64),
		HANDBRAKE				(128),
		LOOK_LEFT				(256),
		SUBMISSION				(512),
		LOOK_BEHIND				(512),
		WALK					(1024),
		ANALOG_UP				(2048),
		ANALOG_DOWN				(4096),
		ANALOG_LEFT				(8192),
		ANALOG_RIGHT			(16384);
		
		
		private final int value;
		
		
		private Key(int val)
		{
			value = val;
		}

		public int getValue()
		{
			return value;
		}
	}
	
	public static final int KEY_UP		= -128;
	public static final int KEY_DOWN	= 128;
	public static final int KEY_LEFT	= -128;
	public static final int KEY_RIGHT	= 128;
	
	
	Player getPlayer();
	int getKeys();
	int getUpdown();
	int getLeftright();
	boolean isKeyPressed(Key key);
}

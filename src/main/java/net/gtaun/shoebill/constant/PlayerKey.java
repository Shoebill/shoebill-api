/**
 * Copyright (C) 2012-2013 MK124
 * Copyright (C) 2013 Meta
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

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * To be used with PlayerKeyState.
 * 
 * @author mk124
 * @author Meta
 * 
 * @see net.gtaun.shoebill.object.PlayerKeyState
 */
public enum PlayerKey
{
	ACTION				(1, "PED_ANSWER_PHONE", "VEHICLE_FIREWEAPON"),
	CROUCH				(2, "PED_DUCK", "VEHICLE_HORN"),
	FIRE				(4, "PED_FIREWEAPON", "VEHICLE_FIREWEAPON"),
	SPRINT				(8, "PED_SPRINT", "VEHICLE_ACCELERATE"),
	SECONDARY_ATTACK	(16, "VEHICLE_ENTER_EXIT", "VEHICLE_FIREWEAPON_ALT"),
	JUMP				(32, "PED_JUMPING", "VEHICLE_BRAKE"),
	LOOK_RIGHT			(64, null, "VEHICLE_LOOKRIGHT"),
	HANDBRAKE			(128, "PED_LOCK_TARGET", "VEHICLE_HANDBRAKE"),
	LOOK_LEFT			(256, null, "VEHICLE_LOOKLEFT"),
	SUBMISSION			(512, null, "TOGGLE_SUBMISSIONS"),
	LOOK_BEHIND			(512, "PED_LOOKBEHIND", "VEHICLE_LOOKBEHIND"),
	WALK				(1024, "SNEAK_ABOUT", null),
	ANALOG_UP			(2048, null, "VEHICLE_TURRETUP"),
	ANALOG_DOWN			(4096, null, "VEHICLE_TURRETDOWN"),
	ANALOG_LEFT			(8192, "VEHICLE_LOOKLEFT", "VEHICLE_TURRETLEFT"),
	ANALOG_RIGHT		(16384, "VEHICLE_LOOKRIGHT", "VEHICLE_TURRETRIGHT"),
	YES					(65536, "CONVERSATION_YES", "CONVERSATION_YES"),
	NO					(131072, "CONVERSATION_NO", "CONVERSATION_NO"),
	CTRL_BACK			(262144, "GROUP_CONTROL_BWD", "GROUP_CONTROL_BWD"),
	UNDEFINED			(0, "GROUP_CONTROL_FWD", "GROUP_CONTROL_FWD"),
	
	/* Special values, Not be indexed */
	UP					(-128, "GO_FORWARD", "VEHICLE_STEERUP"),
	DOWN				(128, "GO_BACK", "VEHICLE_STEERDOWN"),
	LEFT				(-128, "GO_LEFT", "VEHICLE_STEERLEFT"),
	RIGHT				(128, "GO_RIGHT", "VEHICLE_STEERRIGHT");
	
	
	private static final Map<Integer, PlayerKey> VALUES = new HashMap<>();
	public static PlayerKey get(int value)
	{
		PlayerKey key = VALUES.get(value);
		if (key == null) key = UNDEFINED;
		return key;
	}
	
	static
	{
		for(PlayerKey val : values())
		{
			if (VALUES.containsKey(val.value) || val.value < 0) continue;
			VALUES.put(val.value, val);
		}
	}
	
	
	private final int value;
	private final String gameTextKeyOnFootRaw;
	private final String gameTextKeyInVehicleRaw;
	
	
	private PlayerKey(int value, String gameTextKeyOnFootRaw, String gameTextKeyInVehicleRaw)
	{
		this.value = value;
		this.gameTextKeyOnFootRaw = gameTextKeyOnFootRaw;
		this.gameTextKeyInVehicleRaw = gameTextKeyInVehicleRaw;
	}
	
	public int getValue()
	{
		return value;
	}
	
	public String getGameTextKeyRaw(boolean inVehicle)
	{
		return inVehicle ? gameTextKeyInVehicleRaw : gameTextKeyOnFootRaw;
	}
	
	public String getGameTextKey(boolean inVehicle)
	{
		String raw = getGameTextKeyRaw(inVehicle);
		return StringUtils.isBlank(raw) ? "" : "~k~~" + raw + "~";
	}
}

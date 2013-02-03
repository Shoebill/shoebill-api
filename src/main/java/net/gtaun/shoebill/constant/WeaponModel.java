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
 * To be used with a range of weapon methods.
 * 
 * @author MK124
 */
public enum WeaponModel
{
	/**
	 * Unarmed
	 */
	NONE					(0,		0,		0,		"Unarmed"),
	
	/**
	 * Brass Knuckles
	 */
	BRASSKNUCKLE			(1,		0,		331,	"Brass Knuckles"),
	
	/**
	 * Golf Club
	 */
	GOLFCLUB				(2,		1,		333,	"Golf Club"),
	
	/**
	 * Nite Stick
	 */
	NITESTICK				(3,		1,		334,	"Nite Stick"),
	
	/**
	 * Knife
	 */
	KNIFE					(4,		1,		335,	"Knife"),
	
	/**
	 * Baseball Bat
	 */
	BAT						(5,		1,		336,	"Baseball Bat"),
	
	/**
	 * Shovel
	 */
	SHOVEL					(6,		1,		337,	"Shovel"),
	
	/**
	 * Pool Stick
	 */
	POOLSTICK				(7,		1,		338,	"Pool Stick"),
	
	/**
	 * Katana
	 */
	KATANA					(8,		1,		339,	"Katana"),
	
	/**
	 * Chainsaw
	 */
	CHAINSAW				(9,		1,		341,	"Chainsaw"),
	
	/**
	 * Purple Dildo
	 */
	DILDO					(10,	10,		321,	"Purple Dildo"),
	
	/**
	 * Small White Vibrator
	 */
	DILDO2					(11,	10,		322,	"Small White Vibrator"),
	
	/**
	 * Large White Vibrator
	 */
	VIBRATOR				(12,	10,		323,	"Large White Vibrator"),
	
	/**
	 * Silver Vibrator
	 */
	VIBRATOR2				(13,	10,		324,	"Silver Vibrator"),
	
	/**
	 * Flowers
	 */
	FLOWER					(14,	10,		325,	"Flowers"),
	
	/**
	 * Cane
	 */
	CANE					(15,	10,		326,	"Cane"),
	
	/**
	 * Grenade
	 */
	GRENADE					(16,	8,		342,	"Grenade"),
	
	/**
	 * Tear Gas
	 */
	TEARGAS					(17,	8,		343,	"Tear Gas"),
	
	/**
	 * Molotov Cocktail
	 */
	MOLTOV					(18,	8,		344,	"Molotov Cocktail"),
	
	/**
	 * Colt 45
	 */
	COLT45					(22,	2,		346,	"Colt 45"),
	
	/**
	 * Silenced Pistol
	 */
	SILENCED_COLT45			(23,	2,		347,	"Silenced Pistol"),
	
	/**
	 * Desert Eagle
	 */
	DEAGLE					(24,	2,		348,	"Desert Eagle"),
	
	/**
	 * Shotgun
	 */
	SHOTGUN					(25,	3,		349,	"Shotgun"),
	
	/**
	 * Sawn-off Shotgun
	 */
	SAWEDOFF				(26,	3,		350,	"Sawn-off Shotgun"),
	
	/**
	 * Combat Shotgun
	 */
	SHOTGSPA				(27,	3,		351,	"Combat Shotgun"),
	
	/**
	 * Micro UZI
	 */
	UZI						(28,	4,		352,	"Micro UZI"),
	
	/**
	 * MP5
	 */
	MP5						(29,	4,		353,	"MP5"),
	
	/**
	 * AK-47
	 */
	AK47					(30,	5,		355,	"AK-47"),
	
	/**
	 * M4
	 */
	M4						(31,	5,		356,	"M4"),
	
	/**
	 * TEC-9
	 */
	TEC9					(32,	4,		372,	"TEC-9"),
	
	/**
	 * Rifle
	 */
	RIFLE					(33,	6,		357,	"Rifle"),
	
	/**
	 * Sniper Rifle
	 */
	SNIPER					(34,	6,		358,	"Sniper Rifle"),
	
	/**
	 * Rocket Launcher
	 */
	ROCKETLAUNCHER			(35,	7,		359,	"Rocket Launcher"),
	
	/**
	 * HS Rocket Launcher
	 */
	HEATSEEKER				(36,	7,		360,	"HS Rocket Launcher"),
	
	/**
	 * Flamethrower
	 */
	FLAMETHROWER			(37,	7,		361,	"Flamethrower"),
	
	/**
	 * Minigun
	 */
	MINIGUN					(38,	7,		362,	"Minigun"),
	
	/**
	 * Remote Explosives
	 */
	SATCHEL					(39,	8,		363,	"Remote Explosives"),
	
	/**
	 * Bomb
	 */
	BOMB					(40,	12,		364,	"Bomb"),
	
	/**
	 * Spray Can
	 */
	SPRAYCAN				(41,	9,		365,	"Spray Can"),
	
	/**
	 * Fire Extinguisher
	 */
	FIREEXTINGUISHER		(42,	9,		366,	"Fire Extinguisher"),
	
	/**
	 * Camera
	 */
	CAMERA					(43,	9,		367,	"Camera"),
	
	/**
	 * NV Goggles
	 */
	NIGHTVISION				(44,	11,		368,	"NV Goggles"),
	
	/**
	 * IR Goggles
	 */
	INFRARED				(45,	11,		369,	"IR Goggles"),
	
	/**
	 * Parachute
	 */
	PARACHUTE				(46,	11,		371,	"Parachute"),
	
	/**
	 * Fake Pistol (only a death icon)
	 */
	FAKEPISTOL				(47,	-1,		0,		"Fake Pistol"),
	
	/**
	 * Vehicle (only a death icon)
	 */
	VEHICLE					(49,	-1,		0,		"Vehicle"),
	
	/**
	 * Helicopter Blades (only a death icon)
	 */
	HELICOPTERBLADES		(50,	-1,		0,		"Helicopter Blades"),
	
	/**
	 * Explosion (only a death icon)
	 */
	EXPLOSION				(51,	-1,		0,		"Explosion"),
	
	/**
	 * Drowned (only a death icon)
	 */
	DROWN					(53,	-1,		0,		"Drowned"),
	
	/**
	 * Splat (only a death icon)
	 */
	COLLISION				(54,	-1,		0,		"Splat"),
	
	/**
	 * Connect (only usable in sendDeathMessage)
	 */
	CONNECT					(200,	-1,		0,		"Connect"),
	
	/**
	 * Disconnect (only usable in sendDeathMessage)
	 */
	DISCONNECT				(201,	-1,		0,		"Disconnect");
	
	
	private static final Map<Integer, WeaponModel> VALUES = new HashMap<>();
	
	public static WeaponModel get(int id)
	{
		return VALUES.get(id);
	}
	
	static
	{
		for(WeaponModel val : values()) VALUES.put(val.id, val);
	}
	
	
	private final int id;
	private final int slot;
	private final int modelId;
	private final String name;
	
	
	private WeaponModel(int id, int slot, int modelId, String name)
	{
		this.id = id;
		this.slot = slot;
		this.modelId = modelId;
		this.name = name;
	}
	
	public int getId()
	{
		return id;
	}
	
	public int getSlot()
	{
		return slot;
	}
	
	public int getModelId()
	{
		return modelId;
	}
	
	public String getName()
	{
		return name;
	}
}

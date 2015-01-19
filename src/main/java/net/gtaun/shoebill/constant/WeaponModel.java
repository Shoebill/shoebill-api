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
	NONE					(0,		WeaponSlot.getById(0),		0,		"Unarmed"),
	
	/**
	 * Brass Knuckles
	 */
	BRASSKNUCKLE			(1,		WeaponSlot.getById(0),		331,	"Brass Knuckles"),
	
	/**
	 * Golf Club
	 */
	GOLFCLUB				(2,		WeaponSlot.getById(1),		333,	"Golf Club"),
	
	/**
	 * Nite Stick
	 */
	NITESTICK				(3,		WeaponSlot.getById(1),		334,	"Nite Stick"),
	
	/**
	 * Knife
	 */
	KNIFE					(4,		WeaponSlot.getById(1),		335,	"Knife"),
	
	/**
	 * Baseball Bat
	 */
	BAT						(5,		WeaponSlot.getById(1),		336,	"Baseball Bat"),
	
	/**
	 * Shovel
	 */
	SHOVEL					(6,		WeaponSlot.getById(1),		337,	"Shovel"),
	
	/**
	 * Pool Stick
	 */
	POOLSTICK				(7,		WeaponSlot.getById(1),		338,	"Pool Stick"),
	
	/**
	 * Katana
	 */
	KATANA					(8,		WeaponSlot.getById(1),		339,	"Katana"),
	
	/**
	 * Chainsaw
	 */
	CHAINSAW				(9,		WeaponSlot.getById(1),		341,	"Chainsaw"),
	
	/**
	 * Purple Dildo
	 */
	DILDO					(10,	WeaponSlot.getById(10),		321,	"Purple Dildo"),
	
	/**
	 * Small White Vibrator
	 */
	DILDO2					(11,	WeaponSlot.getById(10),		322,	"Small White Vibrator"),
	
	/**
	 * Large White Vibrator
	 */
	VIBRATOR				(12,	WeaponSlot.getById(10),		323,	"Large White Vibrator"),
	
	/**
	 * Silver Vibrator
	 */
	VIBRATOR2				(13,	WeaponSlot.getById(10),		324,	"Silver Vibrator"),
	
	/**
	 * Flowers
	 */
	FLOWER					(14,	WeaponSlot.getById(10),		325,	"Flowers"),
	
	/**
	 * Cane
	 */
	CANE					(15,	WeaponSlot.getById(10),		326,	"Cane"),
	
	/**
	 * Grenade
	 */
	GRENADE					(16,	WeaponSlot.getById(8),		342,	"Grenade"),
	
	/**
	 * Tear Gas
	 */
	TEARGAS					(17,	WeaponSlot.getById(8),		343,	"Tear Gas"),
	
	/**
	 * Molotov Cocktail
	 */
	MOLTOV					(18,	WeaponSlot.getById(8),		344,	"Molotov Cocktail"),
	
	/**
	 * Colt 45
	 */
	COLT45					(22,	WeaponSlot.getById(2),		346,	"Colt 45"),
	
	/**
	 * Silenced Pistol
	 */
	SILENCED_COLT45			(23,	WeaponSlot.getById(2),		347,	"Silenced Pistol"),
	
	/**
	 * Desert Eagle
	 */
	DEAGLE					(24,	WeaponSlot.getById(2),		348,	"Desert Eagle"),
	
	/**
	 * Shotgun
	 */
	SHOTGUN					(25,	WeaponSlot.getById(3),		349,	"Shotgun"),
	
	/**
	 * Sawn-off Shotgun
	 */
	SAWEDOFF				(26,	WeaponSlot.getById(3),		350,	"Sawn-off Shotgun"),
	
	/**
	 * Combat Shotgun
	 */
	SHOTGSPA				(27,	WeaponSlot.getById(3),		351,	"Combat Shotgun"),
	
	/**
	 * Micro UZI
	 */
	UZI						(28,	WeaponSlot.getById(4),		352,	"Micro UZI"),
	
	/**
	 * MP5
	 */
	MP5						(29,	WeaponSlot.getById(4),		353,	"MP5"),
	
	/**
	 * AK-47
	 */
	AK47					(30,	WeaponSlot.getById(5),		355,	"AK-47"),
	
	/**
	 * M4
	 */
	M4						(31,	WeaponSlot.getById(5),		356,	"M4"),
	
	/**
	 * TEC-9
	 */
	TEC9					(32,	WeaponSlot.getById(4),		372,	"TEC-9"),
	
	/**
	 * Rifle
	 */
	RIFLE					(33,	WeaponSlot.getById(6),		357,	"Rifle"),
	
	/**
	 * Sniper Rifle
	 */
	SNIPER					(34,	WeaponSlot.getById(6),		358,	"Sniper Rifle"),
	
	/**
	 * Rocket Launcher
	 */
	ROCKETLAUNCHER			(35,	WeaponSlot.getById(7),		359,	"Rocket Launcher"),
	
	/**
	 * HS Rocket Launcher
	 */
	HEATSEEKER				(36,	WeaponSlot.getById(7),		360,	"HS Rocket Launcher"),
	
	/**
	 * Flamethrower
	 */
	FLAMETHROWER			(37,	WeaponSlot.getById(7),		361,	"Flamethrower"),
	
	/**
	 * Minigun
	 */
	MINIGUN					(38,	WeaponSlot.getById(7),		362,	"Minigun"),
	
	/**
	 * Remote Explosives
	 */
	SATCHEL					(39,	WeaponSlot.getById(8),		363,	"Remote Explosives"),
	
	/**
	 * Bomb
	 */
	BOMB					(40,	WeaponSlot.getById(12),		364,	"Bomb"),
	
	/**
	 * Spray Can
	 */
	SPRAYCAN				(41,	WeaponSlot.getById(9),		365,	"Spray Can"),
	
	/**
	 * Fire Extinguisher
	 */
	FIREEXTINGUISHER		(42,	WeaponSlot.getById(9),		366,	"Fire Extinguisher"),
	
	/**
	 * Camera
	 */
	CAMERA					(43,	WeaponSlot.getById(9),		367,	"Camera"),
	
	/**
	 * NV Goggles
	 */
	NIGHTVISION				(44,	WeaponSlot.getById(11),		368,	"NV Goggles"),
	
	/**
	 * IR Goggles
	 */
	INFRARED				(45,	WeaponSlot.getById(11),		369,	"IR Goggles"),
	
	/**
	 * Parachute
	 */
	PARACHUTE				(46,	WeaponSlot.getById(11),		371,	"Parachute"),
	
	/**
	 * Fake Pistol (only a death icon)
	 */
	FAKEPISTOL				(47,	WeaponSlot.getById(-1),		0,		"Fake Pistol"),
	
	/**
	 * Vehicle (only a death icon)
	 */
	VEHICLE					(49,	WeaponSlot.getById(-1),		0,		"Vehicle"),
	
	/**
	 * Helicopter Blades (only a death icon)
	 */
	HELICOPTERBLADES		(50,	WeaponSlot.getById(-1),		0,		"Helicopter Blades"),
	
	/**
	 * Explosion (only a death icon)
	 */
	EXPLOSION				(51,	WeaponSlot.getById(-1),		0,		"Explosion"),
	
	/**
	 * Drowned (only a death icon)
	 */
	DROWN					(53,	WeaponSlot.getById(-1),		0,		"Drowned"),

	/**
	 * Splat (only a death icon)
	 */
	COLLISION				(54,	WeaponSlot.getById(-1),		0,		"Splat"),

	/**
	 * Connect (only usable in sendDeathMessage)
	 */
	CONNECT					(200,	WeaponSlot.getById(-1),		0,		"Connect"),

	/**
	 * Disconnect (only usable in sendDeathMessage)
	 */
	DISCONNECT				(201,	WeaponSlot.getById(-1),		0,		"Disconnect"),

	/**
	 * Unknown (only usable in sendDeathMessage)
	 */
	UNKNOWN					(255,	WeaponSlot.getById(-1),		0,		"Unknown");
	
	
	private static final Map<Integer, WeaponModel> VALUES = new HashMap<>();
	
	public static WeaponModel get(int id)
	{
		return VALUES.get(id);
	}
	
	static
	{
		for(WeaponModel val : values()) VALUES.put(val.id, val);
	}

	public static WeaponModel getByName(String name) {
		return getByName(name, true);
	}
	
	public static WeaponModel getByName(String name, boolean ignoreCase) {
		Map.Entry<Integer, WeaponModel> entry = VALUES.entrySet().stream()
				.filter(set -> (ignoreCase) ? set.getValue().getName().equalsIgnoreCase(name) : set.getValue().getName().equals(name))
				.findAny().orElse(null);
		if(entry == null)
			return null;
		else
			return entry.getValue();
	}

	private final int id;
	private final WeaponSlot slot;
	private final int modelId;
	private final String name;
	
	
	private WeaponModel(int id, WeaponSlot slot, int modelId, String name)
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
	
	public WeaponSlot getSlot()
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

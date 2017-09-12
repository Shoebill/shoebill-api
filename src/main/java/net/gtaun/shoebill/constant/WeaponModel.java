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
	NONE(0, WeaponSlot.HAND, 0, "Unarmed"),
	BRASSKNUCKLE(1, WeaponSlot.HAND, 331, "Brass Knuckles"),
	GOLFCLUB(2, WeaponSlot.MELEE, 333, "Golf Club"),
	NITESTICK(3, WeaponSlot.MELEE, 334, "Nite Stick"),
	KNIFE(4, WeaponSlot.MELEE, 335, "Knife"),
	BAT(5, WeaponSlot.MELEE, 336, "Baseball Bat"),
	SHOVEL(6, WeaponSlot.MELEE, 337, "Shovel"),
	POOLSTICK(7, WeaponSlot.MELEE, 338, "Pool Stick"),
	KATANA(8, WeaponSlot.MELEE, 339, "Katana"),
	CHAINSAW(9, WeaponSlot.MELEE, 341, "Chainsaw"),
	DILDO(10, WeaponSlot.MISC2, 321, "Purple Dildo"),
	DILDO2(11, WeaponSlot.MISC2, 322, "Small White Vibrator"),
	VIBRATOR(12, WeaponSlot.MISC2, 323, "Large White Vibrator"),
	VIBRATOR2(13, WeaponSlot.MISC2, 324, "Silver Vibrator"),
	FLOWER(14, WeaponSlot.MISC2, 325, "Flowers"),
	CANE(15, WeaponSlot.MISC2, 326, "Cane"),
	GRENADE(16, WeaponSlot.THROWABLE, 342, "Grenade"),
	TEARGAS(17, WeaponSlot.THROWABLE, 343, "Tear Gas"),
	MOLTOV(18, WeaponSlot.THROWABLE, 344, "Molotov Cocktail"),
	COLT45(22, WeaponSlot.PISTOL, 346, "Colt 45", true, WeaponSkill.PISTOL),
	SILENCED_COLT45(23, WeaponSlot.PISTOL, 347, "Silenced Pistol", false, WeaponSkill.PISTOL_SILENCED),
	DEAGLE(24, WeaponSlot.PISTOL, 348, "Desert Eagle", false, WeaponSkill.DESERT_EAGLE),
	SHOTGUN(25, WeaponSlot.SHOTGUN, 349, "Shotgun", false, WeaponSkill.SHOTGUN),
	SAWEDOFF(26, WeaponSlot.SHOTGUN, 350, "Sawn-off Shotgun", true, WeaponSkill.SAWNOFF_SHOTGUN),
	SHOTGSPA(27, WeaponSlot.SHOTGUN, 351, "Combat Shotgun", false, WeaponSkill.SPAS12_SHOTGUN),
	UZI(28, WeaponSlot.MACHINE_PISTOL, 352, "Micro UZI", true, WeaponSkill.MICRO_UZI),
	MP5(29, WeaponSlot.MACHINE_PISTOL, 353, "MP5", false, WeaponSkill.MP5),
	AK47(30, WeaponSlot.CARABINER, 355, "AK-47", false, WeaponSkill.AK47),
	M4(31, WeaponSlot.CARABINER, 356, "M4", false, WeaponSkill.M4),
	TEC9(32, WeaponSlot.MACHINE_PISTOL, 372, "TEC-9", true, WeaponSkill.MICRO_UZI),
	RIFLE(33, WeaponSlot.RIFLE, 357, "Rifle", false, WeaponSkill.SNIPERRIFLE),
	SNIPER(34, WeaponSlot.RIFLE, 358, "Sniper Rifle", false, WeaponSkill.SNIPERRIFLE),
	ROCKETLAUNCHER(35, WeaponSlot.HEAVY, 359, "Rocket Launcher"),
	HEATSEEKER(36, WeaponSlot.HEAVY, 360, "HS Rocket Launcher"),
	FLAMETHROWER(37, WeaponSlot.HEAVY, 361, "Flamethrower"),
	MINIGUN(38, WeaponSlot.HEAVY, 362, "Minigun"),
	SATCHEL(39, WeaponSlot.THROWABLE, 363, "Remote Explosives"),
	BOMB(40, WeaponSlot.DETONATOR, 364, "Bomb"),
	SPRAYCAN(41, WeaponSlot.MISC1, 365, "Spray Can"),
	FIREEXTINGUISHER(42, WeaponSlot.MISC1, 366, "Fire Extinguisher"),
	CAMERA(43, WeaponSlot.MISC1, 367, "Camera"),
	NIGHTVISION(44, WeaponSlot.WEARABLE, 368, "NV Goggles"),
	INFRARED(45, WeaponSlot.WEARABLE, 369, "IR Goggles"),
	PARACHUTE(46, WeaponSlot.WEARABLE, 371, "Parachute"),
	FAKEPISTOL(47, WeaponSlot.INVALID, 0, "Fake Pistol"),
	VEHICLE(49, WeaponSlot.INVALID, 0, "Vehicle"),
	HELICOPTERBLADES(50, WeaponSlot.INVALID, 0, "Helicopter Blades"),
	EXPLOSION(51, WeaponSlot.INVALID, 0, "Explosion"),
	DROWN(53, WeaponSlot.INVALID, 0, "Drowned"),
	COLLISION(54, WeaponSlot.INVALID, 0, "Splat"),
	CONNECT(200, WeaponSlot.INVALID, 0, "Connect"),
	DISCONNECT(201, WeaponSlot.INVALID, 0, "Disconnect"),
	UNKNOWN(255, WeaponSlot.INVALID, 0, "Unknown");
	
	
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
	private final WeaponSkill skill;
	private final boolean twoHanded;
	
	private WeaponModel(int id, WeaponSlot slot, int modelId, String name) 
	{
		this(id, slot, modelId, name, false, null);
	}
	
	private WeaponModel(int id, WeaponSlot slot, int modelId, String name, boolean twoHanded, WeaponSkill skill)
	{
		this.id = id;
		this.slot = slot;
		this.modelId = modelId;
		this.name = name;
		this.twoHanded = twoHanded;
		this.skill = skill;
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

	public WeaponSkill getSkill() 
	{
		return skill;
	}

	public boolean isTwoHanded() 
	{
		return twoHanded;
	}
}

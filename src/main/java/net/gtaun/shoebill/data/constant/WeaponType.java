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

package net.gtaun.shoebill.data.constant;

import java.util.HashMap;
import java.util.Map;

/**
 * @author MK124
 *
 */

public enum WeaponType
{
	NONE					( 0,	0,		0,		"Unarmed" ),
	BRASSKNUCKLE			( 1,	0,		331,	"Brass Knuckles" ),
	GOLFCLUB				( 2,	1,		333,	"Golf Club" ),
	NITESTICK				( 3,	1,		334,	"Nite Stick" ),
	KNIFE					( 4,	1,		335,	"Knife" ),
	BAT						( 5,	1,		336,	"Baseball Bat" ),
	SHOVEL					( 6,	1,		337,	"Shovel" ),
	POOLSTICK				( 7,	1,		338,	"Pool Stick" ),
	KATANA					( 8,	1,		339,	"Katana" ),
	CHAINSAW				( 9,	1,		341,	"Chainsaw" ),
	DILDO					( 10,	10,		321,	"Purple Dildo" ),
	DILDO2					( 11,	10,		322,	"Small White Vibrator" ),
	VIBRATOR				( 12,	10,		323,	"Large White Vibrator" ),
	VIBRATOR2				( 13,	10,		324,	"Silver Vibrator" ),
	FLOWER					( 14,	10,		325,	"Flowers" ),
	CANE					( 15,	10,		326,	"Cane" ),
	GRENADE					( 16,	8,		342,	"Grenade" ),
	TEARGAS					( 17,	8,		343,	"Tear Gas" ),
	MOLTOV					( 18,	8,		344,	"Molotov Cocktail" ),
	COLT45					( 22,	2,		346,	"Colt 45" ),
	SILENCED_COLT45			( 23,	2,		347,	"Silenced Pistol" ),
	DEAGLE					( 24,	2,		348,	"Desert Eagle" ),
	SHOTGUN					( 25,	3,		349,	"Shotgun" ),
	SAWEDOFF				( 26,	3,		350,	"Sawn-off Shotgun" ),
	SHOTGSPA				( 27,	3,		351,	"Combat Shotgun" ),
	UZI						( 28,	4,		352,	"Micro UZI" ),
	MP5						( 29,	4,		353,	"MP5" ),
	AK47					( 30,	5,		355,	"AK-47" ),
	M4						( 31,	5,		356,	"M4" ),
	TEC9					( 32,	4,		372,	"TEC-9" ),
	RIFLE					( 33,	6,		357,	"Rifle" ),
	SNIPER					( 34,	6,		358,	"Sniper Rifle" ),
	ROCKETLAUNCHER			( 35,	7,		359,	"Rocket Launcher" ),
	HEATSEEKER				( 36,	7,		360,	"HS Rocket Launcher" ),
	FLAMETHROWER			( 37,	7,		361,	"Flamethrower" ),
	MINIGUN					( 38,	7,		362,	"Minigun" ),
	SATCHEL					( 39,	8,		363,	"Remote Explosives" ),
	BOMB					( 40,	12,		364,	"Bomb" ),
	SPRAYCAN				( 41,	9,		365,	"Spray Can" ),
	FIREEXTINGUISHER		( 42,	9,		366,	"Fire Extinguisher" ),
	CAMERA					( 43,	9,		367,	"Camera" ),
	NIGHTVISION				( 44,	11,		368,	"NV Goggles" ),
	INFRARED				( 45,	11,		369,	"IR Goggles" ),
	PARACHUTE				( 46,	11,		371,	"Parachute" ),
	FAKEPISTOL				( 47,	-1,		0,		"Fake Pistol" ),
	VEHICLE					( 49,	-1,		0,		"Vehicle" ),
	HELICOPTERBLADES		( 50,	-1,		0,		"Helicopter Blades" ),
	EXPLOSION				( 51,	-1,		0,		"Explosion" ),
	DROWN					( 53,	-1,		0,		"Drowned" ),
	COLLISION				( 54,	-1,		0,		"Splat" ),
	CONNECT					( 200,	-1,		0,		"Connect" ),
	DISCONNECT				( 201,	-1,		0,		"Disconnect" );
	
	
	private static final Map<Integer, WeaponType> VALUES = new HashMap<Integer, WeaponType>();
	
	public static WeaponType get( int id )
	{
		return VALUES.get(id);
	}
	
	static
	{
		for( WeaponType type : values() ) VALUES.put( type.id, type );
	}
	
	
	private final int id;
	private final int slot;
	private final int modelId;
	private final String name;
	
	
	private WeaponType( int id, int slot, int modelId, String name )
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

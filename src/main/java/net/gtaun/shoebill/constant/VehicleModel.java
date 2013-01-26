/**
 * Copyright (C) 2013 Meta
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

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 
 * 
 * @author Meta
 * @author MK124
 */
public final class VehicleModel
{
	public static enum VehicleType
	{
		UNKNOWN,
		BICYCLE,
		MOTORBIKE,
		CAR,
		TRAILER,
		REMOTE_CONTROL,
		TRAIN,
		BOAT,
		AIRCRAFT,
		HELICOPTER,
		TANK,
	}
	
	private static enum VehicleModelData
	{
		LANDSTALKER(VehicleModel.LANDSTALKER, "Landstalker", VehicleType.CAR, 4),
		BRAVURA(VehicleModel.BRAVURA, "Bravura", VehicleType.CAR, 2),
		BUFFALO(VehicleModel.BUFFALO, "Buffalo", VehicleType.CAR, 2),
		LINERUNNER(VehicleModel.LINERUNNER, "Linerunner", VehicleType.CAR, 2),
		PERENNIAL(VehicleModel.PERENNIAL, "Perennial", VehicleType.CAR, 4),
		SENTINEL(VehicleModel.SENTINEL, "Sentinel", VehicleType.CAR, 4),
		DUMPER(VehicleModel.DUMPER, "Dumper", VehicleType.CAR, 1),
		FIRETRUCK1(VehicleModel.FIRETRUCK1, "Firetruck", VehicleType.CAR, 2),
		TRASHMASTER(VehicleModel.TRASHMASTER, "Trashmaster", VehicleType.CAR, 2),
		STRETCH(VehicleModel.STRETCH, "Stretch", VehicleType.CAR, 4),
		MANANA(VehicleModel.MANANA, "Manana", VehicleType.CAR, 2),
		INFERNUS(VehicleModel.INFERNUS, "Infernus", VehicleType.CAR, 2),
		VOODOO(VehicleModel.VOODOO, "Voodoo", VehicleType.CAR, 2),
		PONY(VehicleModel.PONY, "Pony", VehicleType.CAR, 2),
		MULE(VehicleModel.MULE, "Mule", VehicleType.CAR, 2),
		CHEETAH(VehicleModel.CHEETAH, "Cheetah", VehicleType.CAR, 2),
		AMBULANCE(VehicleModel.AMBULANCE, "Ambulance", VehicleType.CAR, 4),
		LEVIATHAN(VehicleModel.LEVIATHAN, "Leviathan", VehicleType.HELICOPTER, 2),
		MOONBEAM(VehicleModel.MOONBEAM, "Moonbeam", VehicleType.CAR, 4),
		ESPERANTO(VehicleModel.ESPERANTO, "Esperanto", VehicleType.CAR, 2),
		TAXI(VehicleModel.TAXI, "Taxi", VehicleType.CAR, 4),
		WASHINGTON(VehicleModel.WASHINGTON, "Washington", VehicleType.CAR, 4),
		BOBCAT(VehicleModel.BOBCAT, "Bobcat", VehicleType.CAR, 2),
		MR_WHOOPEE(VehicleModel.MR_WHOOPEE, "Mr Whoopee", VehicleType.CAR, 2),
		BF_INJECTION(VehicleModel.BF_INJECTION, "BF Injection", VehicleType.CAR, 2),
		HUNTER(VehicleModel.HUNTER, "Hunter", VehicleType.HELICOPTER, 1),
		PREMIER(VehicleModel.PREMIER, "Premier", VehicleType.CAR, 4),
		ENFORCER(VehicleModel.ENFORCER, "Enforcer", VehicleType.CAR, 4),
		SECURICAR(VehicleModel.SECURICAR, "Securicar", VehicleType.CAR, 4),
		BANSHEE(VehicleModel.BANSHEE, "Banshee", VehicleType.CAR, 2),
		PREDATOR(VehicleModel.PREDATOR, "Predator", VehicleType.BOAT, 0),
		BUS(VehicleModel.BUS, "Bus", VehicleType.CAR, 8),
		RHINO(VehicleModel.RHINO, "Rhino", VehicleType.TANK, 1),
		BARRACKS(VehicleModel.BARRACKS, "Barracks", VehicleType.CAR, 2),
		HOTKNIFE(VehicleModel.HOTKNIFE, "Hotknife", VehicleType.CAR, 2),
		TRAILER1(VehicleModel.TRAILER1, "Trailer", VehicleType.TRAILER, 0),
		PREVION(VehicleModel.PREVION, "Previon", VehicleType.CAR, 2),
		COACH(VehicleModel.COACH, "Coach", VehicleType.CAR, 8),
		CABBIE(VehicleModel.CABBIE, "Cabbie", VehicleType.CAR, 4),
		STALLION(VehicleModel.STALLION, "Stallion", VehicleType.CAR, 2),
		RUMPO(VehicleModel.RUMPO, "Rumpo", VehicleType.CAR, 4),
		RC_BANDIT(VehicleModel.RC_BANDIT, "RC Bandit", VehicleType.REMOTE_CONTROL, 1),
		ROMERO(VehicleModel.ROMERO, "Romero", VehicleType.CAR, 2),
		PACKER(VehicleModel.PACKER, "Packer", VehicleType.CAR, 2),
		MONSTER1(VehicleModel.MONSTER1, "Monster", VehicleType.CAR, 2),
		ADMIRAL(VehicleModel.ADMIRAL, "Admiral", VehicleType.CAR, 4),
		SQUALO(VehicleModel.SQUALO, "Squalo", VehicleType.BOAT, 0),
		SEASPARROW(VehicleModel.SEASPARROW, "Seasparrow", VehicleType.HELICOPTER, 2),
		PIZZABOY(VehicleModel.PIZZABOY, "Pizzaboy", VehicleType.MOTORBIKE, 1),
		TRAM(VehicleModel.TRAM, "Tram", VehicleType.TRAIN, 4),
		TRAILER2(VehicleModel.TRAILER2, "Trailer", VehicleType.TRAILER, 0),
		TURISMO(VehicleModel.TURISMO, "Turismo", VehicleType.CAR, 2),
		SPEEDER(VehicleModel.SPEEDER, "Speeder", VehicleType.BOAT, 0),
		REEFER(VehicleModel.REEFER, "Reefer", VehicleType.BOAT, 0),
		TROPIC(VehicleModel.TROPIC, "Tropic", VehicleType.BOAT, 0),
		FLATBED(VehicleModel.FLATBED, "Flatbed", VehicleType.CAR, 2),
		YANKEE(VehicleModel.YANKEE, "Yankee", VehicleType.CAR, 2),
		CADDY(VehicleModel.CADDY, "Caddy", VehicleType.CAR, 2),
		SOLAIR(VehicleModel.SOLAIR, "Solair", VehicleType.CAR, 4),
		BERKLEYS_RC_VAN(VehicleModel.BERKLEYS_RC_VAN, "Berkleys RC Van", VehicleType.CAR, 4),
		SKIMMER(VehicleModel.SKIMMER, "Skimmer", VehicleType.AIRCRAFT, 2),
		PCJ_600(VehicleModel.PCJ_600, "PCJ-600", VehicleType.MOTORBIKE, 2),
		FAGGIO(VehicleModel.FAGGIO, "Faggio", VehicleType.MOTORBIKE, 2),
		FREEWAY(VehicleModel.FREEWAY, "Freeway", VehicleType.MOTORBIKE, 0),
		RC_BARON(VehicleModel.RC_BARON, "RC Baron", VehicleType.REMOTE_CONTROL, 1),
		RC_RAIDER(VehicleModel.RC_RAIDER, "RC Raider", VehicleType.REMOTE_CONTROL, 1),
		GLENDALE1(VehicleModel.GLENDALE1, "Glendale", VehicleType.CAR, 4),
		OCEANIC(VehicleModel.OCEANIC, "Oceanic", VehicleType.CAR, 4),
		SANCHEZ(VehicleModel.SANCHEZ, "Sanchez", VehicleType.MOTORBIKE, 2),
		SPARROW(VehicleModel.SPARROW, "Sparrow", VehicleType.HELICOPTER, 2),
		PATRIOT(VehicleModel.PATRIOT, "Patriot", VehicleType.CAR, 4),
		QUAD(VehicleModel.QUAD, "Quad", VehicleType.MOTORBIKE, 2),
		COASTGUARD(VehicleModel.COASTGUARD, "Coastguard", VehicleType.BOAT, 0),
		DINGHY(VehicleModel.DINGHY, "Dinghy", VehicleType.BOAT, 0),
		HERMES(VehicleModel.HERMES, "Hermes", VehicleType.CAR, 2),
		SABRE(VehicleModel.SABRE, "Sabre", VehicleType.CAR, 2),
		RUSTLER(VehicleModel.RUSTLER, "Rustler", VehicleType.AIRCRAFT, 1),
		ZR3_50(VehicleModel.ZR3_50, "ZR3 50", VehicleType.CAR, 2),
		WALTON(VehicleModel.WALTON, "Walton", VehicleType.CAR, 2),
		REGINA(VehicleModel.REGINA, "Regina", VehicleType.CAR, 4),
		COMET(VehicleModel.COMET, "Comet", VehicleType.CAR, 2),
		BMX(VehicleModel.BMX, "BMX", VehicleType.BICYCLE, 1),
		BURRITO(VehicleModel.BURRITO, "Burrito", VehicleType.CAR, 4),
		CAMPER(VehicleModel.CAMPER, "Camper", VehicleType.CAR, 3),
		MARQUIS(VehicleModel.MARQUIS, "Marquis", VehicleType.BOAT, 0),
		BAGGAGE(VehicleModel.BAGGAGE, "Baggage", VehicleType.CAR, 1),
		DOZER(VehicleModel.DOZER, "Dozer", VehicleType.CAR, 1),
		MAVERICK(VehicleModel.MAVERICK, "Maverick", VehicleType.HELICOPTER, 4),
		NEWS_CHOPPER(VehicleModel.NEWS_CHOPPER, "News Chopper", VehicleType.HELICOPTER, 2),
		RANCHER1(VehicleModel.RANCHER1, "Rancher", VehicleType.CAR, 2),
		FBI_RANCHER(VehicleModel.FBI_RANCHER, "FBI Rancher", VehicleType.CAR, 4),
		VIRGO(VehicleModel.VIRGO, "Virgo", VehicleType.CAR, 2),
		GREENWOOD(VehicleModel.GREENWOOD, "Greenwood", VehicleType.CAR, 2),
		JETMAX(VehicleModel.JETMAX, "Jetmax", VehicleType.BOAT, 0),
		HOTRING(VehicleModel.HOTRING, "Hotring", VehicleType.CAR, 2),
		SANDKING(VehicleModel.SANDKING, "Sandking", VehicleType.CAR, 2),
		BLISTA_COMPACT(VehicleModel.BLISTA_COMPACT, "Blista Compact", VehicleType.CAR, 2),
		POLICE_MAVERICK(VehicleModel.POLICE_MAVERICK, "Police Maverick", VehicleType.HELICOPTER, 4),
		BOXVILLE1(VehicleModel.BOXVILLE1, "Boxville", VehicleType.CAR, 4),
		BENSON(VehicleModel.BENSON, "Benson", VehicleType.CAR, 2),
		MESA(VehicleModel.MESA, "Mesa", VehicleType.CAR, 2),
		RC_GOBLIN(VehicleModel.RC_GOBLIN, "RC Goblin", VehicleType.REMOTE_CONTROL, 1),
		HOTRING_RACER1(VehicleModel.HOTRING_RACER1, "Hotring Racer", VehicleType.CAR, 2),
		HOTRING_RACER2(VehicleModel.HOTRING_RACER2, "Hotring Racer", VehicleType.CAR, 2),
		BLOODRING_BANGER(VehicleModel.BLOODRING_BANGER, "Bloodring Banger", VehicleType.CAR, 2),
		RANCHER2(VehicleModel.RANCHER2, "Rancher", VehicleType.CAR, 2),
		SUPER_GT(VehicleModel.SUPER_GT, "Super GT", VehicleType.CAR, 2),
		ELEGANT(VehicleModel.ELEGANT, "Elegant", VehicleType.CAR, 4),
		JOURNEY(VehicleModel.JOURNEY, "Journey", VehicleType.CAR, 2),
		BIKE(VehicleModel.BIKE, "Bike", VehicleType.BICYCLE, 1),
		MOUNTAIN_BIKE(VehicleModel.MOUNTAIN_BIKE, "Mountain Bike", VehicleType.BICYCLE, 1),
		BEAGLE(VehicleModel.BEAGLE, "Beagle", VehicleType.AIRCRAFT, 2),
		CROPDUST(VehicleModel.CROPDUST, "Cropdust", VehicleType.AIRCRAFT, 1),
		STUNT(VehicleModel.STUNT, "Stunt", VehicleType.AIRCRAFT, 1),
		TANKER(VehicleModel.TANKER, "Tanker", VehicleType.CAR, 2),
		ROADTRAIN(VehicleModel.ROADTRAIN, "RoadTrain", VehicleType.CAR, 2),
		NEBULA(VehicleModel.NEBULA, "Nebula", VehicleType.CAR, 4),
		MAJESTIC(VehicleModel.MAJESTIC, "Majestic", VehicleType.CAR, 2),
		BUCCANEER(VehicleModel.BUCCANEER, "Buccaneer", VehicleType.CAR, 2),
		SHAMAL(VehicleModel.SHAMAL, "Shamal", VehicleType.AIRCRAFT, 1),
		HYDRA(VehicleModel.HYDRA, "Hydra", VehicleType.AIRCRAFT, 1),
		FCR_900(VehicleModel.FCR_900, "FCR-900", VehicleType.MOTORBIKE, 2),
		NRG_500(VehicleModel.NRG_500, "NRG-500", VehicleType.MOTORBIKE, 2),
		HPV1000(VehicleModel.HPV1000, "HPV1000", VehicleType.MOTORBIKE, 2),
		CEMENT_TRUCK(VehicleModel.CEMENT_TRUCK, "Cement Truck", VehicleType.CAR, 2),
		TOW_TRUCK(VehicleModel.TOW_TRUCK, "Tow Truck", VehicleType.CAR, 2),
		FORTUNE(VehicleModel.FORTUNE, "Fortune", VehicleType.CAR, 2),
		CADRONA(VehicleModel.CADRONA, "Cadrona", VehicleType.CAR, 2),
		FBI_TRUCK(VehicleModel.FBI_TRUCK, "FBI Truck", VehicleType.CAR, 2),
		WILLARD(VehicleModel.WILLARD, "Willard", VehicleType.CAR, 4),
		FORKLIFT(VehicleModel.FORKLIFT, "Forklift", VehicleType.CAR, 1),
		TRACTOR(VehicleModel.TRACTOR, "Tractor", VehicleType.CAR, 1),
		COMBINE(VehicleModel.COMBINE, "Combine", VehicleType.CAR, 1),
		FELTZER(VehicleModel.FELTZER, "Feltzer", VehicleType.CAR, 2),
		REMINGTON(VehicleModel.REMINGTON, "Remington", VehicleType.CAR, 2),
		SLAMVAN(VehicleModel.SLAMVAN, "Slamvan", VehicleType.CAR, 2),
		BLADE(VehicleModel.BLADE, "Blade", VehicleType.CAR, 2),
		FREIGHT1(VehicleModel.FREIGHT1, "Freight", VehicleType.TRAIN, 2),
		STREAK(VehicleModel.STREAK, "Streak", VehicleType.TRAIN, 2),
		VORTEX(VehicleModel.VORTEX, "Vortex", VehicleType.BOAT, 0),
		VINCENT(VehicleModel.VINCENT, "Vincent", VehicleType.CAR, 4),
		BULLET(VehicleModel.BULLET, "Bullet", VehicleType.CAR, 2),
		CLOVER(VehicleModel.CLOVER, "Clover", VehicleType.CAR, 2),
		SADLER1(VehicleModel.SADLER1, "Sadler", VehicleType.CAR, 2),
		FIRETRUCK2(VehicleModel.FIRETRUCK2, "Firetruck", VehicleType.CAR, 2),
		HUSTLER(VehicleModel.HUSTLER, "Hustler", VehicleType.CAR, 2),
		INTRUDER(VehicleModel.INTRUDER, "Intruder", VehicleType.CAR, 4),
		PRIMO(VehicleModel.PRIMO, "Primo", VehicleType.CAR, 4),
		CARGOBOB(VehicleModel.CARGOBOB, "Cargobob", VehicleType.HELICOPTER, 2),
		TAMPA(VehicleModel.TAMPA, "Tampa", VehicleType.CAR, 2),
		SUNRISE(VehicleModel.SUNRISE, "Sunrise", VehicleType.CAR, 4),
		MERIT(VehicleModel.MERIT, "Merit", VehicleType.CAR, 4),
		UTILITY(VehicleModel.UTILITY, "Utility", VehicleType.CAR, 2),
		NEVADA(VehicleModel.NEVADA, "Nevada", VehicleType.AIRCRAFT, 1),
		YOSEMITE(VehicleModel.YOSEMITE, "Yosemite", VehicleType.CAR, 2),
		WINDSOR(VehicleModel.WINDSOR, "Windsor", VehicleType.CAR, 2),
		MONSTER2(VehicleModel.MONSTER2, "Monster", VehicleType.CAR, 2),
		MONSTER3(VehicleModel.MONSTER3, "Monster", VehicleType.CAR, 2),
		URANUS(VehicleModel.URANUS, "Uranus", VehicleType.CAR, 2),
		JESTER(VehicleModel.JESTER, "Jester", VehicleType.CAR, 2),
		SULTAN(VehicleModel.SULTAN, "Sultan", VehicleType.CAR, 4),
		STRATUM(VehicleModel.STRATUM, "Stratum", VehicleType.CAR, 4),
		ELEGY(VehicleModel.ELEGY, "Elegy", VehicleType.CAR, 2),
		RAINDANCE(VehicleModel.RAINDANCE, "Raindance", VehicleType.HELICOPTER, 2),
		RC_TIGER(VehicleModel.RC_TIGER, "RC Tiger", VehicleType.REMOTE_CONTROL, 1),
		FLASH(VehicleModel.FLASH, "Flash", VehicleType.CAR, 2),
		TAHOMA(VehicleModel.TAHOMA, "Tahoma", VehicleType.CAR, 4),
		SAVANNA(VehicleModel.SAVANNA, "Savanna", VehicleType.CAR, 4),
		BANDITO(VehicleModel.BANDITO, "Bandito", VehicleType.CAR, 1),
		FREIGHT2(VehicleModel.FREIGHT2, "Freight", VehicleType.TRAIN, 0),
		TRAILER3(VehicleModel.TRAILER3, "Trailer", VehicleType.TRAIN, 0),
		KART(VehicleModel.KART, "Kart", VehicleType.CAR, 1),
		MOWER(VehicleModel.MOWER, "Mower", VehicleType.CAR, 1),
		DUNERIDE(VehicleModel.DUNERIDE, "Duneride", VehicleType.CAR, 2),
		SWEEPER(VehicleModel.SWEEPER, "Sweeper", VehicleType.CAR, 1),
		BROADWAY(VehicleModel.BROADWAY, "Broadway", VehicleType.CAR, 2),
		TORNADO(VehicleModel.TORNADO, "Tornado", VehicleType.CAR, 2),
		AT_400(VehicleModel.AT_400, "AT-400", VehicleType.AIRCRAFT, 1),
		DFT_30(VehicleModel.DFT_30, "DFT-30", VehicleType.CAR, 2),
		HUNTLEY(VehicleModel.HUNTLEY, "Huntley", VehicleType.CAR, 4),
		STAFFORD(VehicleModel.STAFFORD, "Stafford", VehicleType.CAR, 4),
		BF_400(VehicleModel.BF_400, "BF-400", VehicleType.MOTORBIKE, 2),
		NEWSVAN(VehicleModel.NEWSVAN, "Newsvan", VehicleType.CAR, 2),
		TUG(VehicleModel.TUG, "Tug", VehicleType.CAR, 1),
		TRAILER4(VehicleModel.TRAILER4, "Trailer", VehicleType.TRAILER, 0),
		EMPEROR(VehicleModel.EMPEROR, "Emperor", VehicleType.CAR, 4),
		WAYFARER(VehicleModel.WAYFARER, "Wayfarer", VehicleType.MOTORBIKE, 2),
		EUROS(VehicleModel.EUROS, "Euros", VehicleType.CAR, 2),
		HOTDOG(VehicleModel.HOTDOG, "Hotdog", VehicleType.CAR, 2),
		CLUB(VehicleModel.CLUB, "Club", VehicleType.CAR, 2),
		TRAILER5(VehicleModel.TRAILER5, "Trailer", VehicleType.TRAILER, 0),
		TRAILER6(VehicleModel.TRAILER6, "Trailer", VehicleType.TRAILER, 0),
		ANDROMADA(VehicleModel.ANDROMADA, "Andromada", VehicleType.AIRCRAFT, 2),
		DODO(VehicleModel.DODO, "Dodo", VehicleType.AIRCRAFT, 2),
		RC_CAM(VehicleModel.RC_CAM, "RC Cam", VehicleType.REMOTE_CONTROL, 1),
		LAUNCH(VehicleModel.LAUNCH, "Launch", VehicleType.BOAT, 0),
		POLICE_CAR_LSPD(VehicleModel.POLICE_CAR_LSPD, "Police Car LSPD", VehicleType.CAR, 4),
		POLICE_CAR_SFPD(VehicleModel.POLICE_CAR_SFPD, "Police Car SFPD", VehicleType.CAR, 4),
		POLICE_CAR_LVPD(VehicleModel.POLICE_CAR_LVPD, "Police Car LVPD", VehicleType.CAR, 4),
		POLICE_RANGER(VehicleModel.POLICE_RANGER, "Police Ranger", VehicleType.CAR, 2),
		PICADOR(VehicleModel.PICADOR, "Picador", VehicleType.CAR, 2),
		SWAT_VAN(VehicleModel.SWAT_VAN, "SWAT Van", VehicleType.CAR, 2),
		ALPHA(VehicleModel.ALPHA, "Alpha", VehicleType.CAR, 2),
		PHOENIX(VehicleModel.PHOENIX, "Phoenix", VehicleType.CAR, 2),
		GLENDALE2(VehicleModel.GLENDALE2, "Glendale", VehicleType.CAR, 4),
		SADLER2(VehicleModel.SADLER2, "Sadler", VehicleType.CAR, 2),
		LUGGAGE_TRAILER1(VehicleModel.LUGGAGE_TRAILER1, "Luggage Trailer", VehicleType.TRAILER, 0),
		LUGGAGE_TRAILER2(VehicleModel.LUGGAGE_TRAILER2, "Luggage Trailer", VehicleType.TRAILER, 0),
		STAIR_TRAILER(VehicleModel.STAIR_TRAILER, "Stair Trailer", VehicleType.TRAILER, 0),
		BOXVILLE2(VehicleModel.BOXVILLE2, "Boxville", VehicleType.CAR, 4),
		FARM_PLOW(VehicleModel.FARM_PLOW, "Farm Plow", VehicleType.TRAILER, 0),
		UTILITY_TRAILER(VehicleModel.UTILITY_TRAILER, "Utility Trailer", VehicleType.TRAILER, 0),
		;
		
		
		private static final Map<Integer, VehicleModelData> VALUES = new HashMap<>();
		private static VehicleModelData get(int value)
		{
			return VALUES.get(value);
		}
		
		private static Set<Integer> getIds()
		{
			return Collections.unmodifiableSet(VALUES.keySet());
		}
		
		private static Set<Integer> getIds(VehicleType type)
		{
			Set<Integer> set = new HashSet<>();
			for (VehicleModelData data : values()) if (data.type == type) set.add(data.id);
			return Collections.unmodifiableSet(set);
		}
		
		static
		{
			for(VehicleModelData val : values()) VALUES.put(val.id, val);
		}
		
		
		private final int id;
		private final String name;
		private final VehicleType type;
		private final int seats;
		
		private VehicleModelData(int id, String name, VehicleType type, int seats)
		{
			this.id = id;
			this.name = name;
			this.type = type;
			this.seats = seats;
		}
	}
	
	
	public static boolean isVaildId(int modelId)
	{
		return VehicleModelData.get(modelId) != null;
	}
	
	public static String getName(int modelId)
	{
		VehicleModelData data = VehicleModelData.get(modelId);
		return data != null ? data.name : "Unknown";
	}
	
	public static VehicleType getType(int modelId)
	{
		VehicleModelData data = VehicleModelData.get(modelId);
		return data != null ? data.type : VehicleType.UNKNOWN;
	}
	
	public static int getSeats(int modelId)
	{
		VehicleModelData data = VehicleModelData.get(modelId);
		return data != null ? data.seats : 0;
	}

	public static Set<Integer> getIds()
	{
		return VehicleModelData.getIds();
	}

	public static Set<Integer> getIds(VehicleType type)
	{
		return VehicleModelData.getIds(type);
	}
	
	
	public static final int LANDSTALKER = 400;
	public static final int BRAVURA = 401;
	public static final int BUFFALO = 402;
	public static final int LINERUNNER = 403;
	public static final int PERENNIAL = 404;
	public static final int SENTINEL = 405;
	public static final int DUMPER = 406;
	public static final int FIRETRUCK1 = 407;
	public static final int TRASHMASTER = 408;
	public static final int STRETCH = 409;
	public static final int MANANA = 410;
	public static final int INFERNUS = 411;
	public static final int VOODOO = 412;
	public static final int PONY = 413;
	public static final int MULE = 414;
	public static final int CHEETAH = 415;
	public static final int AMBULANCE = 416;
	public static final int LEVIATHAN = 417;
	public static final int MOONBEAM = 418;
	public static final int ESPERANTO = 419;
	public static final int TAXI = 420;
	public static final int WASHINGTON = 421;
	public static final int BOBCAT = 422;
	public static final int MR_WHOOPEE = 423;
	public static final int BF_INJECTION = 424;
	public static final int HUNTER = 425;
	public static final int PREMIER = 426;
	public static final int ENFORCER = 427;
	public static final int SECURICAR = 428;
	public static final int BANSHEE = 429;
	public static final int PREDATOR = 430;
	public static final int BUS = 431;
	public static final int RHINO = 432;
	public static final int BARRACKS = 433;
	public static final int HOTKNIFE = 434;
	public static final int TRAILER1 = 435;
	public static final int PREVION = 436;
	public static final int COACH = 437;
	public static final int CABBIE = 438;
	public static final int STALLION = 439;
	public static final int RUMPO = 440;
	public static final int RC_BANDIT = 441;
	public static final int ROMERO = 442;
	public static final int PACKER = 443;
	public static final int MONSTER1 = 444;
	public static final int ADMIRAL = 445;
	public static final int SQUALO = 446;
	public static final int SEASPARROW = 447;
	public static final int PIZZABOY = 448;
	public static final int TRAM = 449;
	public static final int TRAILER2 = 450;
	public static final int TURISMO = 451;
	public static final int SPEEDER = 452;
	public static final int REEFER = 453;
	public static final int TROPIC = 454;
	public static final int FLATBED = 455;
	public static final int YANKEE = 456;
	public static final int CADDY = 457;
	public static final int SOLAIR = 458;
	public static final int BERKLEYS_RC_VAN = 459;
	public static final int SKIMMER = 460;
	public static final int PCJ_600 = 461;
	public static final int FAGGIO = 462;
	public static final int FREEWAY = 463;
	public static final int RC_BARON = 464;
	public static final int RC_RAIDER = 465;
	public static final int GLENDALE1 = 466;
	public static final int OCEANIC = 467;
	public static final int SANCHEZ = 468;
	public static final int SPARROW = 469;
	public static final int PATRIOT = 470;
	public static final int QUAD = 471;
	public static final int COASTGUARD = 472;
	public static final int DINGHY = 473;
	public static final int HERMES = 474;
	public static final int SABRE = 475;
	public static final int RUSTLER = 476;
	public static final int ZR3_50 = 477;
	public static final int WALTON = 478;
	public static final int REGINA = 479;
	public static final int COMET = 480;
	public static final int BMX = 481;
	public static final int BURRITO = 482;
	public static final int CAMPER = 483;
	public static final int MARQUIS = 484;
	public static final int BAGGAGE = 485;
	public static final int DOZER = 486;
	public static final int MAVERICK = 487;
	public static final int NEWS_CHOPPER = 488;
	public static final int RANCHER1 = 489;
	public static final int FBI_RANCHER = 490;
	public static final int VIRGO = 491;
	public static final int GREENWOOD = 492;
	public static final int JETMAX = 493;
	public static final int HOTRING = 494;
	public static final int SANDKING = 495;
	public static final int BLISTA_COMPACT = 496;
	public static final int POLICE_MAVERICK = 497;
	public static final int BOXVILLE1 = 498;
	public static final int BENSON = 499;
	public static final int MESA = 500;
	public static final int RC_GOBLIN = 501;
	public static final int HOTRING_RACER1 = 502;
	public static final int HOTRING_RACER2 = 503;
	public static final int BLOODRING_BANGER = 504;
	public static final int RANCHER2 = 505;
	public static final int SUPER_GT = 506;
	public static final int ELEGANT = 507;
	public static final int JOURNEY = 508;
	public static final int BIKE = 509;
	public static final int MOUNTAIN_BIKE = 510;
	public static final int BEAGLE = 511;
	public static final int CROPDUST = 512;
	public static final int STUNT = 513;
	public static final int TANKER = 514;
	public static final int ROADTRAIN = 515;
	public static final int NEBULA = 516;
	public static final int MAJESTIC = 517;
	public static final int BUCCANEER = 518;
	public static final int SHAMAL = 519;
	public static final int HYDRA = 520;
	public static final int FCR_900 = 521;
	public static final int NRG_500 = 522;
	public static final int HPV1000 = 523;
	public static final int CEMENT_TRUCK = 524;
	public static final int TOW_TRUCK = 525;
	public static final int FORTUNE = 526;
	public static final int CADRONA = 527;
	public static final int FBI_TRUCK = 528;
	public static final int WILLARD = 529;
	public static final int FORKLIFT = 530;
	public static final int TRACTOR = 531;
	public static final int COMBINE = 532;
	public static final int FELTZER = 533;
	public static final int REMINGTON = 534;
	public static final int SLAMVAN = 535;
	public static final int BLADE = 536;
	public static final int FREIGHT1 = 537;
	public static final int STREAK = 538;
	public static final int VORTEX = 539;
	public static final int VINCENT = 540;
	public static final int BULLET = 541;
	public static final int CLOVER = 542;
	public static final int SADLER1 = 543;
	public static final int FIRETRUCK2 = 544;
	public static final int HUSTLER = 545;
	public static final int INTRUDER = 546;
	public static final int PRIMO = 547;
	public static final int CARGOBOB = 548;
	public static final int TAMPA = 549;
	public static final int SUNRISE = 550;
	public static final int MERIT = 551;
	public static final int UTILITY = 552;
	public static final int NEVADA = 553;
	public static final int YOSEMITE = 554;
	public static final int WINDSOR = 555;
	public static final int MONSTER2 = 556;
	public static final int MONSTER3 = 557;
	public static final int URANUS = 558;
	public static final int JESTER = 559;
	public static final int SULTAN = 560;
	public static final int STRATUM = 561;
	public static final int ELEGY = 562;
	public static final int RAINDANCE = 563;
	public static final int RC_TIGER = 564;
	public static final int FLASH = 565;
	public static final int TAHOMA = 566;
	public static final int SAVANNA = 567;
	public static final int BANDITO = 568;
	public static final int FREIGHT2 = 569;
	public static final int TRAILER3 = 570;
	public static final int KART = 571;
	public static final int MOWER = 572;
	public static final int DUNERIDE = 573;
	public static final int SWEEPER = 574;
	public static final int BROADWAY = 575;
	public static final int TORNADO = 576;
	public static final int AT_400 = 577;
	public static final int DFT_30 = 578;
	public static final int HUNTLEY = 579;
	public static final int STAFFORD = 580;
	public static final int BF_400 = 581;
	public static final int NEWSVAN = 582;
	public static final int TUG = 583;
	public static final int TRAILER4 = 584;
	public static final int EMPEROR = 585;
	public static final int WAYFARER = 586;
	public static final int EUROS = 587;
	public static final int HOTDOG = 588;
	public static final int CLUB = 589;
	public static final int TRAILER5 = 590;
	public static final int TRAILER6 = 591;
	public static final int ANDROMADA = 592;
	public static final int DODO = 593;
	public static final int RC_CAM = 594;
	public static final int LAUNCH = 595;
	public static final int POLICE_CAR_LSPD = 596;
	public static final int POLICE_CAR_SFPD = 597;
	public static final int POLICE_CAR_LVPD = 598;
	public static final int POLICE_RANGER = 599;
	public static final int PICADOR = 600;
	public static final int SWAT_VAN = 601;
	public static final int ALPHA = 602;
	public static final int PHOENIX = 603;
	public static final int GLENDALE2 = 604;
	public static final int SADLER2 = 605;
	public static final int LUGGAGE_TRAILER1 = 606;
	public static final int LUGGAGE_TRAILER2 = 607;
	public static final int STAIR_TRAILER = 608;
	public static final int BOXVILLE2 = 609;
	public static final int FARM_PLOW = 610;
	public static final int UTILITY_TRAILER = 611;
}

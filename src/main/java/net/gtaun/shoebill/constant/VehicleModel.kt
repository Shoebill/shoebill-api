/**
 * Copyright (C) 2013 Meta
 * Copyright (C) 2013 MK124

 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at

 * http://www.apache.org/licenses/LICENSE-2.0

 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.gtaun.shoebill.constant

/**
 * This enum contains all existing vehicles in GTA: San Andreas, including their specific seat size and type.
 *
 * @author Meta
 * @author MK124
 */
enum class VehicleModel private constructor(val id: Int, val modelName: String, val type: VehicleType,
                                            val seats: Int) {
        LANDSTALKER(VehicleModel.Companion.LANDSTALKER, "Landstalker", VehicleType.CAR, 4),
        BRAVURA(VehicleModel.Companion.BRAVURA, "Bravura", VehicleType.CAR, 2),
        BUFFALO(VehicleModel.Companion.BUFFALO, "Buffalo", VehicleType.CAR, 2),
        LINERUNNER(VehicleModel.Companion.LINERUNNER, "Linerunner", VehicleType.CAR, 2),
        PERENNIAL(VehicleModel.Companion.PERENNIAL, "Perennial", VehicleType.CAR, 4),
        SENTINEL(VehicleModel.Companion.SENTINEL, "Sentinel", VehicleType.CAR, 4),
        DUMPER(VehicleModel.Companion.DUMPER, "Dumper", VehicleType.CAR, 1),
        FIRETRUCK1(VehicleModel.Companion.FIRETRUCK1, "Firetruck", VehicleType.CAR, 2),
        TRASHMASTER(VehicleModel.Companion.TRASHMASTER, "Trashmaster", VehicleType.CAR, 2),
        STRETCH(VehicleModel.Companion.STRETCH, "Stretch", VehicleType.CAR, 4),
        MANANA(VehicleModel.Companion.MANANA, "Manana", VehicleType.CAR, 2),
        INFERNUS(VehicleModel.Companion.INFERNUS, "Infernus", VehicleType.CAR, 2),
        VOODOO(VehicleModel.Companion.VOODOO, "Voodoo", VehicleType.CAR, 2),
        PONY(VehicleModel.Companion.PONY, "Pony", VehicleType.CAR, 2),
        MULE(VehicleModel.Companion.MULE, "Mule", VehicleType.CAR, 2),
        CHEETAH(VehicleModel.Companion.CHEETAH, "Cheetah", VehicleType.CAR, 2),
        AMBULANCE(VehicleModel.Companion.AMBULANCE, "Ambulance", VehicleType.CAR, 4),
        LEVIATHAN(VehicleModel.Companion.LEVIATHAN, "Leviathan", VehicleType.HELICOPTER, 2),
        MOONBEAM(VehicleModel.Companion.MOONBEAM, "Moonbeam", VehicleType.CAR, 4),
        ESPERANTO(VehicleModel.Companion.ESPERANTO, "Esperanto", VehicleType.CAR, 2),
        TAXI(VehicleModel.Companion.TAXI, "Taxi", VehicleType.CAR, 4),
        WASHINGTON(VehicleModel.Companion.WASHINGTON, "Washington", VehicleType.CAR, 4),
        BOBCAT(VehicleModel.Companion.BOBCAT, "Bobcat", VehicleType.CAR, 2),
        MR_WHOOPEE(VehicleModel.Companion.MR_WHOOPEE, "Mr Whoopee", VehicleType.CAR, 2),
        BF_INJECTION(VehicleModel.Companion.BF_INJECTION, "BF Injection", VehicleType.CAR, 2),
        HUNTER(VehicleModel.Companion.HUNTER, "Hunter", VehicleType.HELICOPTER, 1),
        PREMIER(VehicleModel.Companion.PREMIER, "Premier", VehicleType.CAR, 4),
        ENFORCER(VehicleModel.Companion.ENFORCER, "Enforcer", VehicleType.CAR, 4),
        SECURICAR(VehicleModel.Companion.SECURICAR, "Securicar", VehicleType.CAR, 4),
        BANSHEE(VehicleModel.Companion.BANSHEE, "Banshee", VehicleType.CAR, 2),
        PREDATOR(VehicleModel.Companion.PREDATOR, "Predator", VehicleType.BOAT, 0),
        BUS(VehicleModel.Companion.BUS, "Bus", VehicleType.CAR, 8),
        RHINO(VehicleModel.Companion.RHINO, "Rhino", VehicleType.TANK, 1),
        BARRACKS(VehicleModel.Companion.BARRACKS, "Barracks", VehicleType.CAR, 2),
        HOTKNIFE(VehicleModel.Companion.HOTKNIFE, "Hotknife", VehicleType.CAR, 2),
        TRAILER1(VehicleModel.Companion.TRAILER1, "Trailer", VehicleType.TRAILER, 0),
        PREVION(VehicleModel.Companion.PREVION, "Previon", VehicleType.CAR, 2),
        COACH(VehicleModel.Companion.COACH, "Coach", VehicleType.CAR, 8),
        CABBIE(VehicleModel.Companion.CABBIE, "Cabbie", VehicleType.CAR, 4),
        STALLION(VehicleModel.Companion.STALLION, "Stallion", VehicleType.CAR, 2),
        RUMPO(VehicleModel.Companion.RUMPO, "Rumpo", VehicleType.CAR, 4),
        RC_BANDIT(VehicleModel.Companion.RC_BANDIT, "RC Bandit", VehicleType.REMOTE_CONTROL, 1),
        ROMERO(VehicleModel.Companion.ROMERO, "Romero", VehicleType.CAR, 2),
        PACKER(VehicleModel.Companion.PACKER, "Packer", VehicleType.CAR, 2),
        MONSTER1(VehicleModel.Companion.MONSTER1, "Monster", VehicleType.CAR, 2),
        ADMIRAL(VehicleModel.Companion.ADMIRAL, "Admiral", VehicleType.CAR, 4),
        SQUALO(VehicleModel.Companion.SQUALO, "Squalo", VehicleType.BOAT, 0),
        SEASPARROW(VehicleModel.Companion.SEASPARROW, "Seasparrow", VehicleType.HELICOPTER, 2),
        PIZZABOY(VehicleModel.Companion.PIZZABOY, "Pizzaboy", VehicleType.MOTORBIKE, 1),
        TRAM(VehicleModel.Companion.TRAM, "Tram", VehicleType.TRAIN, 4),
        TRAILER2(VehicleModel.Companion.TRAILER2, "Trailer", VehicleType.TRAILER, 0),
        TURISMO(VehicleModel.Companion.TURISMO, "Turismo", VehicleType.CAR, 2),
        SPEEDER(VehicleModel.Companion.SPEEDER, "Speeder", VehicleType.BOAT, 0),
        REEFER(VehicleModel.Companion.REEFER, "Reefer", VehicleType.BOAT, 0),
        TROPIC(VehicleModel.Companion.TROPIC, "Tropic", VehicleType.BOAT, 0),
        FLATBED(VehicleModel.Companion.FLATBED, "Flatbed", VehicleType.CAR, 2),
        YANKEE(VehicleModel.Companion.YANKEE, "Yankee", VehicleType.CAR, 2),
        CADDY(VehicleModel.Companion.CADDY, "Caddy", VehicleType.CAR, 2),
        SOLAIR(VehicleModel.Companion.SOLAIR, "Solair", VehicleType.CAR, 4),
        BERKLEYS_RC_VAN(VehicleModel.Companion.BERKLEYS_RC_VAN, "Berkleys RC Van", VehicleType.CAR, 4),
        SKIMMER(VehicleModel.Companion.SKIMMER, "Skimmer", VehicleType.AIRCRAFT, 2),
        PCJ_600(VehicleModel.Companion.PCJ_600, "PCJ-600", VehicleType.MOTORBIKE, 2),
        FAGGIO(VehicleModel.Companion.FAGGIO, "Faggio", VehicleType.MOTORBIKE, 2),
        FREEWAY(VehicleModel.Companion.FREEWAY, "Freeway", VehicleType.MOTORBIKE, 0),
        RC_BARON(VehicleModel.Companion.RC_BARON, "RC Baron", VehicleType.REMOTE_CONTROL, 1),
        RC_RAIDER(VehicleModel.Companion.RC_RAIDER, "RC Raider", VehicleType.REMOTE_CONTROL, 1),
        GLENDALE1(VehicleModel.Companion.GLENDALE1, "Glendale", VehicleType.CAR, 4),
        OCEANIC(VehicleModel.Companion.OCEANIC, "Oceanic", VehicleType.CAR, 4),
        SANCHEZ(VehicleModel.Companion.SANCHEZ, "Sanchez", VehicleType.MOTORBIKE, 2),
        SPARROW(VehicleModel.Companion.SPARROW, "Sparrow", VehicleType.HELICOPTER, 2),
        PATRIOT(VehicleModel.Companion.PATRIOT, "Patriot", VehicleType.CAR, 4),
        QUAD(VehicleModel.Companion.QUAD, "Quad", VehicleType.MOTORBIKE, 2),
        COASTGUARD(VehicleModel.Companion.COASTGUARD, "Coastguard", VehicleType.BOAT, 0),
        DINGHY(VehicleModel.Companion.DINGHY, "Dinghy", VehicleType.BOAT, 0),
        HERMES(VehicleModel.Companion.HERMES, "Hermes", VehicleType.CAR, 2),
        SABRE(VehicleModel.Companion.SABRE, "Sabre", VehicleType.CAR, 2),
        RUSTLER(VehicleModel.Companion.RUSTLER, "Rustler", VehicleType.AIRCRAFT, 1),
        ZR3_50(VehicleModel.Companion.ZR3_50, "ZR3 50", VehicleType.CAR, 2),
        WALTON(VehicleModel.Companion.WALTON, "Walton", VehicleType.CAR, 2),
        REGINA(VehicleModel.Companion.REGINA, "Regina", VehicleType.CAR, 4),
        COMET(VehicleModel.Companion.COMET, "Comet", VehicleType.CAR, 2),
        BMX(VehicleModel.Companion.BMX, "BMX", VehicleType.BICYCLE, 1),
        BURRITO(VehicleModel.Companion.BURRITO, "Burrito", VehicleType.CAR, 4),
        CAMPER(VehicleModel.Companion.CAMPER, "Camper", VehicleType.CAR, 3),
        MARQUIS(VehicleModel.Companion.MARQUIS, "Marquis", VehicleType.BOAT, 0),
        BAGGAGE(VehicleModel.Companion.BAGGAGE, "Baggage", VehicleType.CAR, 1),
        DOZER(VehicleModel.Companion.DOZER, "Dozer", VehicleType.CAR, 1),
        MAVERICK(VehicleModel.Companion.MAVERICK, "Maverick", VehicleType.HELICOPTER, 4),
        NEWS_CHOPPER(VehicleModel.Companion.NEWS_CHOPPER, "News Chopper", VehicleType.HELICOPTER, 2),
        RANCHER1(VehicleModel.Companion.RANCHER1, "Rancher", VehicleType.CAR, 2),
        FBI_RANCHER(VehicleModel.Companion.FBI_RANCHER, "FBI Rancher", VehicleType.CAR, 4),
        VIRGO(VehicleModel.Companion.VIRGO, "Virgo", VehicleType.CAR, 2),
        GREENWOOD(VehicleModel.Companion.GREENWOOD, "Greenwood", VehicleType.CAR, 2),
        JETMAX(VehicleModel.Companion.JETMAX, "Jetmax", VehicleType.BOAT, 0),
        HOTRING(VehicleModel.Companion.HOTRING, "Hotring", VehicleType.CAR, 2),
        SANDKING(VehicleModel.Companion.SANDKING, "Sandking", VehicleType.CAR, 2),
        BLISTA_COMPACT(VehicleModel.Companion.BLISTA_COMPACT, "Blista Compact", VehicleType.CAR, 2),
        POLICE_MAVERICK(VehicleModel.Companion.POLICE_MAVERICK, "Police Maverick", VehicleType.HELICOPTER, 4),
        BOXVILLE1(VehicleModel.Companion.BOXVILLE1, "Boxville", VehicleType.CAR, 4),
        BENSON(VehicleModel.Companion.BENSON, "Benson", VehicleType.CAR, 2),
        MESA(VehicleModel.Companion.MESA, "Mesa", VehicleType.CAR, 2),
        RC_GOBLIN(VehicleModel.Companion.RC_GOBLIN, "RC Goblin", VehicleType.REMOTE_CONTROL, 1),
        HOTRING_RACER1(VehicleModel.Companion.HOTRING_RACER1, "Hotring Racer", VehicleType.CAR, 2),
        HOTRING_RACER2(VehicleModel.Companion.HOTRING_RACER2, "Hotring Racer", VehicleType.CAR, 2),
        BLOODRING_BANGER(VehicleModel.Companion.BLOODRING_BANGER, "Bloodring Banger", VehicleType.CAR, 2),
        RANCHER2(VehicleModel.Companion.RANCHER2, "Rancher", VehicleType.CAR, 2),
        SUPER_GT(VehicleModel.Companion.SUPER_GT, "Super GT", VehicleType.CAR, 2),
        ELEGANT(VehicleModel.Companion.ELEGANT, "Elegant", VehicleType.CAR, 4),
        JOURNEY(VehicleModel.Companion.JOURNEY, "Journey", VehicleType.CAR, 2),
        BIKE(VehicleModel.Companion.BIKE, "Bike", VehicleType.BICYCLE, 1),
        MOUNTAIN_BIKE(VehicleModel.Companion.MOUNTAIN_BIKE, "Mountain Bike", VehicleType.BICYCLE, 1),
        BEAGLE(VehicleModel.Companion.BEAGLE, "Beagle", VehicleType.AIRCRAFT, 2),
        CROPDUST(VehicleModel.Companion.CROPDUST, "Cropdust", VehicleType.AIRCRAFT, 1),
        STUNT(VehicleModel.Companion.STUNT, "Stunt", VehicleType.AIRCRAFT, 1),
        TANKER(VehicleModel.Companion.TANKER, "Tanker", VehicleType.CAR, 2),
        ROADTRAIN(VehicleModel.Companion.ROADTRAIN, "RoadTrain", VehicleType.CAR, 2),
        NEBULA(VehicleModel.Companion.NEBULA, "Nebula", VehicleType.CAR, 4),
        MAJESTIC(VehicleModel.Companion.MAJESTIC, "Majestic", VehicleType.CAR, 2),
        BUCCANEER(VehicleModel.Companion.BUCCANEER, "Buccaneer", VehicleType.CAR, 2),
        SHAMAL(VehicleModel.Companion.SHAMAL, "Shamal", VehicleType.AIRCRAFT, 1),
        HYDRA(VehicleModel.Companion.HYDRA, "Hydra", VehicleType.AIRCRAFT, 1),
        FCR_900(VehicleModel.Companion.FCR_900, "FCR-900", VehicleType.MOTORBIKE, 2),
        NRG_500(VehicleModel.Companion.NRG_500, "NRG-500", VehicleType.MOTORBIKE, 2),
        HPV1000(VehicleModel.Companion.HPV1000, "HPV1000", VehicleType.MOTORBIKE, 2),
        CEMENT_TRUCK(VehicleModel.Companion.CEMENT_TRUCK, "Cement Truck", VehicleType.CAR, 2),
        TOW_TRUCK(VehicleModel.Companion.TOW_TRUCK, "Tow Truck", VehicleType.CAR, 2),
        FORTUNE(VehicleModel.Companion.FORTUNE, "Fortune", VehicleType.CAR, 2),
        CADRONA(VehicleModel.Companion.CADRONA, "Cadrona", VehicleType.CAR, 2),
        FBI_TRUCK(VehicleModel.Companion.FBI_TRUCK, "FBI Truck", VehicleType.CAR, 2),
        WILLARD(VehicleModel.Companion.WILLARD, "Willard", VehicleType.CAR, 4),
        FORKLIFT(VehicleModel.Companion.FORKLIFT, "Forklift", VehicleType.CAR, 1),
        TRACTOR(VehicleModel.Companion.TRACTOR, "Tractor", VehicleType.CAR, 1),
        COMBINE(VehicleModel.Companion.COMBINE, "Combine", VehicleType.CAR, 1),
        FELTZER(VehicleModel.Companion.FELTZER, "Feltzer", VehicleType.CAR, 2),
        REMINGTON(VehicleModel.Companion.REMINGTON, "Remington", VehicleType.CAR, 2),
        SLAMVAN(VehicleModel.Companion.SLAMVAN, "Slamvan", VehicleType.CAR, 2),
        BLADE(VehicleModel.Companion.BLADE, "Blade", VehicleType.CAR, 2),
        FREIGHT1(VehicleModel.Companion.FREIGHT1, "Freight", VehicleType.TRAIN, 2),
        STREAK(VehicleModel.Companion.STREAK, "Streak", VehicleType.TRAIN, 2),
        VORTEX(VehicleModel.Companion.VORTEX, "Vortex", VehicleType.BOAT, 0),
        VINCENT(VehicleModel.Companion.VINCENT, "Vincent", VehicleType.CAR, 4),
        BULLET(VehicleModel.Companion.BULLET, "Bullet", VehicleType.CAR, 2),
        CLOVER(VehicleModel.Companion.CLOVER, "Clover", VehicleType.CAR, 2),
        SADLER1(VehicleModel.Companion.SADLER1, "Sadler", VehicleType.CAR, 2),
        FIRETRUCK2(VehicleModel.Companion.FIRETRUCK2, "Firetruck", VehicleType.CAR, 2),
        HUSTLER(VehicleModel.Companion.HUSTLER, "Hustler", VehicleType.CAR, 2),
        INTRUDER(VehicleModel.Companion.INTRUDER, "Intruder", VehicleType.CAR, 4),
        PRIMO(VehicleModel.Companion.PRIMO, "Primo", VehicleType.CAR, 4),
        CARGOBOB(VehicleModel.Companion.CARGOBOB, "Cargobob", VehicleType.HELICOPTER, 2),
        TAMPA(VehicleModel.Companion.TAMPA, "Tampa", VehicleType.CAR, 2),
        SUNRISE(VehicleModel.Companion.SUNRISE, "Sunrise", VehicleType.CAR, 4),
        MERIT(VehicleModel.Companion.MERIT, "Merit", VehicleType.CAR, 4),
        UTILITY(VehicleModel.Companion.UTILITY, "Utility", VehicleType.CAR, 2),
        NEVADA(VehicleModel.Companion.NEVADA, "Nevada", VehicleType.AIRCRAFT, 1),
        YOSEMITE(VehicleModel.Companion.YOSEMITE, "Yosemite", VehicleType.CAR, 2),
        WINDSOR(VehicleModel.Companion.WINDSOR, "Windsor", VehicleType.CAR, 2),
        MONSTER2(VehicleModel.Companion.MONSTER2, "Monster", VehicleType.CAR, 2),
        MONSTER3(VehicleModel.Companion.MONSTER3, "Monster", VehicleType.CAR, 2),
        URANUS(VehicleModel.Companion.URANUS, "Uranus", VehicleType.CAR, 2),
        JESTER(VehicleModel.Companion.JESTER, "Jester", VehicleType.CAR, 2),
        SULTAN(VehicleModel.Companion.SULTAN, "Sultan", VehicleType.CAR, 4),
        STRATUM(VehicleModel.Companion.STRATUM, "Stratum", VehicleType.CAR, 4),
        ELEGY(VehicleModel.Companion.ELEGY, "Elegy", VehicleType.CAR, 2),
        RAINDANCE(VehicleModel.Companion.RAINDANCE, "Raindance", VehicleType.HELICOPTER, 2),
        RC_TIGER(VehicleModel.Companion.RC_TIGER, "RC Tiger", VehicleType.REMOTE_CONTROL, 1),
        FLASH(VehicleModel.Companion.FLASH, "Flash", VehicleType.CAR, 2),
        TAHOMA(VehicleModel.Companion.TAHOMA, "Tahoma", VehicleType.CAR, 4),
        SAVANNA(VehicleModel.Companion.SAVANNA, "Savanna", VehicleType.CAR, 4),
        BANDITO(VehicleModel.Companion.BANDITO, "Bandito", VehicleType.CAR, 1),
        FREIGHT2(VehicleModel.Companion.FREIGHT2, "Freight", VehicleType.TRAIN, 0),
        TRAILER3(VehicleModel.Companion.TRAILER3, "Trailer", VehicleType.TRAIN, 0),
        KART(VehicleModel.Companion.KART, "Kart", VehicleType.CAR, 1),
        MOWER(VehicleModel.Companion.MOWER, "Mower", VehicleType.CAR, 1),
        DUNERIDE(VehicleModel.Companion.DUNERIDE, "Duneride", VehicleType.CAR, 2),
        SWEEPER(VehicleModel.Companion.SWEEPER, "Sweeper", VehicleType.CAR, 1),
        BROADWAY(VehicleModel.Companion.BROADWAY, "Broadway", VehicleType.CAR, 2),
        TORNADO(VehicleModel.Companion.TORNADO, "Tornado", VehicleType.CAR, 2),
        AT_400(VehicleModel.Companion.AT_400, "AT-400", VehicleType.AIRCRAFT, 1),
        DFT_30(VehicleModel.Companion.DFT_30, "DFT-30", VehicleType.CAR, 2),
        HUNTLEY(VehicleModel.Companion.HUNTLEY, "Huntley", VehicleType.CAR, 4),
        STAFFORD(VehicleModel.Companion.STAFFORD, "Stafford", VehicleType.CAR, 4),
        BF_400(VehicleModel.Companion.BF_400, "BF-400", VehicleType.MOTORBIKE, 2),
        NEWSVAN(VehicleModel.Companion.NEWSVAN, "Newsvan", VehicleType.CAR, 2),
        TUG(VehicleModel.Companion.TUG, "Tug", VehicleType.CAR, 1),
        TRAILER4(VehicleModel.Companion.TRAILER4, "Trailer", VehicleType.TRAILER, 0),
        EMPEROR(VehicleModel.Companion.EMPEROR, "Emperor", VehicleType.CAR, 4),
        WAYFARER(VehicleModel.Companion.WAYFARER, "Wayfarer", VehicleType.MOTORBIKE, 2),
        EUROS(VehicleModel.Companion.EUROS, "Euros", VehicleType.CAR, 2),
        HOTDOG(VehicleModel.Companion.HOTDOG, "Hotdog", VehicleType.CAR, 2),
        CLUB(VehicleModel.Companion.CLUB, "Club", VehicleType.CAR, 2),
        TRAILER5(VehicleModel.Companion.TRAILER5, "Trailer", VehicleType.TRAILER, 0),
        TRAILER6(VehicleModel.Companion.TRAILER6, "Trailer", VehicleType.TRAILER, 0),
        ANDROMADA(VehicleModel.Companion.ANDROMADA, "Andromada", VehicleType.AIRCRAFT, 2),
        DODO(VehicleModel.Companion.DODO, "Dodo", VehicleType.AIRCRAFT, 2),
        RC_CAM(VehicleModel.Companion.RC_CAM, "RC Cam", VehicleType.REMOTE_CONTROL, 1),
        LAUNCH(VehicleModel.Companion.LAUNCH, "Launch", VehicleType.BOAT, 0),
        POLICE_CAR_LSPD(VehicleModel.Companion.POLICE_CAR_LSPD, "Police Car LSPD", VehicleType.CAR, 4),
        POLICE_CAR_SFPD(VehicleModel.Companion.POLICE_CAR_SFPD, "Police Car SFPD", VehicleType.CAR, 4),
        POLICE_CAR_LVPD(VehicleModel.Companion.POLICE_CAR_LVPD, "Police Car LVPD", VehicleType.CAR, 4),
        POLICE_RANGER(VehicleModel.Companion.POLICE_RANGER, "Police Ranger", VehicleType.CAR, 2),
        PICADOR(VehicleModel.Companion.PICADOR, "Picador", VehicleType.CAR, 2),
        SWAT_VAN(VehicleModel.Companion.SWAT_VAN, "SWAT Van", VehicleType.CAR, 2),
        ALPHA(VehicleModel.Companion.ALPHA, "Alpha", VehicleType.CAR, 2),
        PHOENIX(VehicleModel.Companion.PHOENIX, "Phoenix", VehicleType.CAR, 2),
        GLENDALE2(VehicleModel.Companion.GLENDALE2, "Glendale", VehicleType.CAR, 4),
        SADLER2(VehicleModel.Companion.SADLER2, "Sadler", VehicleType.CAR, 2),
        LUGGAGE_TRAILER1(VehicleModel.Companion.LUGGAGE_TRAILER1, "Luggage Trailer", VehicleType.TRAILER, 0),
        LUGGAGE_TRAILER2(VehicleModel.Companion.LUGGAGE_TRAILER2, "Luggage Trailer", VehicleType.TRAILER, 0),
        STAIR_TRAILER(VehicleModel.Companion.STAIR_TRAILER, "Stair Trailer", VehicleType.TRAILER, 0),
        BOXVILLE2(VehicleModel.Companion.BOXVILLE2, "Boxville", VehicleType.CAR, 4),
        FARM_PLOW(VehicleModel.Companion.FARM_PLOW, "Farm Plow", VehicleType.TRAILER, 0),
        UTILITY_TRAILER(VehicleModel.Companion.UTILITY_TRAILER, "Utility Trailer", VehicleType.TRAILER, 0);


        companion object : Collectable<VehicleModel>, Findable<Int, VehicleModel> {
            private val VALUES = values().map { it.id to it }.toMap()

            /**
             * Gets all available [VehicleModel]s.
             */
            @JvmStatic
            override fun get(): Collection<VehicleModel> = VALUES.values

            /**
             * Gets a [VehicleModel] by its id.
             */
            @JvmStatic
            override operator fun get(value: Int): VehicleModel? = VALUES[value]

            /**
             * Gets a [VehicleModel] by its name.
             */
            @JvmStatic
            @JvmOverloads
            operator fun get(name: String, ignoreCase: Boolean = true): VehicleModel? =
                    VALUES.filter { it.value.modelName.equals(name, ignoreCase) }.values.firstOrNull()

            /**
             * Gets all [VehicleModel]s of a specific type.
             */
            @JvmStatic
            operator fun get(type: VehicleType): Collection<VehicleModel> =
                    VALUES.filter { it.value.type == type }.values

            private val LANDSTALKER = 400;
            private val BRAVURA = 401;
            private val BUFFALO = 402;
            private val LINERUNNER = 403;
            private val PERENNIAL = 404;
            private val SENTINEL = 405;
            private val DUMPER = 406;
            private val FIRETRUCK1 = 407;
            private val TRASHMASTER = 408;
            private val STRETCH = 409;
            private val MANANA = 410;
            private val INFERNUS = 411;
            private val VOODOO = 412;
            private val PONY = 413;
            private val MULE = 414;
            private val CHEETAH = 415;
            private val AMBULANCE = 416;
            private val LEVIATHAN = 417;
            private val MOONBEAM = 418;
            private val ESPERANTO = 419;
            private val TAXI = 420;
            private val WASHINGTON = 421;
            private val BOBCAT = 422;
            private val MR_WHOOPEE = 423;
            private val BF_INJECTION = 424;
            private val HUNTER = 425;
            private val PREMIER = 426;
            private val ENFORCER = 427;
            private val SECURICAR = 428;
            private val BANSHEE = 429;
            private val PREDATOR = 430;
            private val BUS = 431;
            private val RHINO = 432;
            private val BARRACKS = 433;
            private val HOTKNIFE = 434;
            private val TRAILER1 = 435;
            private val PREVION = 436;
            private val COACH = 437;
            private val CABBIE = 438;
            private val STALLION = 439;
            private val RUMPO = 440;
            private val RC_BANDIT = 441;
            private val ROMERO = 442;
            private val PACKER = 443;
            private val MONSTER1 = 444;
            private val ADMIRAL = 445;
            private val SQUALO = 446;
            private val SEASPARROW = 447;
            private val PIZZABOY = 448;
            private val TRAM = 449;
            private val TRAILER2 = 450;
            private val TURISMO = 451;
            private val SPEEDER = 452;
            private val REEFER = 453;
            private val TROPIC = 454;
            private val FLATBED = 455;
            private val YANKEE = 456;
            private val CADDY = 457;
            private val SOLAIR = 458;
            private val BERKLEYS_RC_VAN = 459;
            private val SKIMMER = 460;
            private val PCJ_600 = 461;
            private val FAGGIO = 462;
            private val FREEWAY = 463;
            private val RC_BARON = 464;
            private val RC_RAIDER = 465;
            private val GLENDALE1 = 466;
            private val OCEANIC = 467;
            private val SANCHEZ = 468;
            private val SPARROW = 469;
            private val PATRIOT = 470;
            private val QUAD = 471;
            private val COASTGUARD = 472;
            private val DINGHY = 473;
            private val HERMES = 474;
            private val SABRE = 475;
            private val RUSTLER = 476;
            private val ZR3_50 = 477;
            private val WALTON = 478;
            private val REGINA = 479;
            private val COMET = 480;
            private val BMX = 481;
            private val BURRITO = 482;
            private val CAMPER = 483;
            private val MARQUIS = 484;
            private val BAGGAGE = 485;
            private val DOZER = 486;
            private val MAVERICK = 487;
            private val NEWS_CHOPPER = 488;
            private val RANCHER1 = 489;
            private val FBI_RANCHER = 490;
            private val VIRGO = 491;
            private val GREENWOOD = 492;
            private val JETMAX = 493;
            private val HOTRING = 494;
            private val SANDKING = 495;
            private val BLISTA_COMPACT = 496;
            private val POLICE_MAVERICK = 497;
            private val BOXVILLE1 = 498;
            private val BENSON = 499;
            private val MESA = 500;
            private val RC_GOBLIN = 501;
            private val HOTRING_RACER1 = 502;
            private val HOTRING_RACER2 = 503;
            private val BLOODRING_BANGER = 504;
            private val RANCHER2 = 505;
            private val SUPER_GT = 506;
            private val ELEGANT = 507;
            private val JOURNEY = 508;
            private val BIKE = 509;
            private val MOUNTAIN_BIKE = 510;
            private val BEAGLE = 511;
            private val CROPDUST = 512;
            private val STUNT = 513;
            private val TANKER = 514;
            private val ROADTRAIN = 515;
            private val NEBULA = 516;
            private val MAJESTIC = 517;
            private val BUCCANEER = 518;
            private val SHAMAL = 519;
            private val HYDRA = 520;
            private val FCR_900 = 521;
            private val NRG_500 = 522;
            private val HPV1000 = 523;
            private val CEMENT_TRUCK = 524;
            private val TOW_TRUCK = 525;
            private val FORTUNE = 526;
            private val CADRONA = 527;
            private val FBI_TRUCK = 528;
            private val WILLARD = 529;
            private val FORKLIFT = 530;
            private val TRACTOR = 531;
            private val COMBINE = 532;
            private val FELTZER = 533;
            private val REMINGTON = 534;
            private val SLAMVAN = 535;
            private val BLADE = 536;
            private val FREIGHT1 = 537;
            private val STREAK = 538;
            private val VORTEX = 539;
            private val VINCENT = 540;
            private val BULLET = 541;
            private val CLOVER = 542;
            private val SADLER1 = 543;
            private val FIRETRUCK2 = 544;
            private val HUSTLER = 545;
            private val INTRUDER = 546;
            private val PRIMO = 547;
            private val CARGOBOB = 548;
            private val TAMPA = 549;
            private val SUNRISE = 550;
            private val MERIT = 551;
            private val UTILITY = 552;
            private val NEVADA = 553;
            private val YOSEMITE = 554;
            private val WINDSOR = 555;
            private val MONSTER2 = 556;
            private val MONSTER3 = 557;
            private val URANUS = 558;
            private val JESTER = 559;
            private val SULTAN = 560;
            private val STRATUM = 561;
            private val ELEGY = 562;
            private val RAINDANCE = 563;
            private val RC_TIGER = 564;
            private val FLASH = 565;
            private val TAHOMA = 566;
            private val SAVANNA = 567;
            private val BANDITO = 568;
            private val FREIGHT2 = 569;
            private val TRAILER3 = 570;
            private val KART = 571;
            private val MOWER = 572;
            private val DUNERIDE = 573;
            private val SWEEPER = 574;
            private val BROADWAY = 575;
            private val TORNADO = 576;
            private val AT_400 = 577;
            private val DFT_30 = 578;
            private val HUNTLEY = 579;
            private val STAFFORD = 580;
            private val BF_400 = 581;
            private val NEWSVAN = 582;
            private val TUG = 583;
            private val TRAILER4 = 584;
            private val EMPEROR = 585;
            private val WAYFARER = 586;
            private val EUROS = 587;
            private val HOTDOG = 588;
            private val CLUB = 589;
            private val TRAILER5 = 590;
            private val TRAILER6 = 591;
            private val ANDROMADA = 592;
            private val DODO = 593;
            private val RC_CAM = 594;
            private val LAUNCH = 595;
            private val POLICE_CAR_LSPD = 596;
            private val POLICE_CAR_SFPD = 597;
            private val POLICE_CAR_LVPD = 598;
            private val POLICE_RANGER = 599;
            private val PICADOR = 600;
            private val SWAT_VAN = 601;
            private val ALPHA = 602;
            private val PHOENIX = 603;
            private val GLENDALE2 = 604;
            private val SADLER2 = 605;
            private val LUGGAGE_TRAILER1 = 606;
            private val LUGGAGE_TRAILER2 = 607;
            private val STAIR_TRAILER = 608;
            private val BOXVILLE2 = 609;
            private val FARM_PLOW = 610;
            private val UTILITY_TRAILER = 611;
        }
    }
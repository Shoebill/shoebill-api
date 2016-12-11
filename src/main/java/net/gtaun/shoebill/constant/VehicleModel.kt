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
enum class VehicleModel constructor(val id: Int, val modelName: String, val type: VehicleType,
                                    val seatCount: Int) {
        LANDSTALKER(400, "Landstalker", VehicleType.CAR, 4),
        BRAVURA(401, "Bravura", VehicleType.CAR, 2),
        BUFFALO(402, "Buffalo", VehicleType.CAR, 2),
        LINERUNNER(403, "Linerunner", VehicleType.CAR, 2),
        PERENNIAL(404, "Perennial", VehicleType.CAR, 4),
        SENTINEL(405, "Sentinel", VehicleType.CAR, 4),
        DUMPER(406, "Dumper", VehicleType.CAR, 1),
        FIRETRUCK1(407, "Firetruck", VehicleType.CAR, 2),
        TRASHMASTER(408, "Trashmaster", VehicleType.CAR, 2),
        STRETCH(409, "Stretch", VehicleType.CAR, 4),
        MANANA(410, "Manana", VehicleType.CAR, 2),
        INFERNUS(411, "Infernus", VehicleType.CAR, 2),
        VOODOO(412, "Voodoo", VehicleType.CAR, 2),
        PONY(413, "Pony", VehicleType.CAR, 2),
        MULE(414, "Mule", VehicleType.CAR, 2),
        CHEETAH(415, "Cheetah", VehicleType.CAR, 2),
        AMBULANCE(416, "Ambulance", VehicleType.CAR, 4),
        LEVIATHAN(417, "Leviathan", VehicleType.HELICOPTER, 2),
        MOONBEAM(418, "Moonbeam", VehicleType.CAR, 4),
        ESPERANTO(419, "Esperanto", VehicleType.CAR, 2),
        TAXI(420, "Taxi", VehicleType.CAR, 4),
        WASHINGTON(421, "Washington", VehicleType.CAR, 4),
        BOBCAT(422, "Bobcat", VehicleType.CAR, 2),
        MR_WHOOPEE(423, "Mr Whoopee", VehicleType.CAR, 2),
        BF_INJECTION(424, "BF Injection", VehicleType.CAR, 2),
        HUNTER(425, "Hunter", VehicleType.HELICOPTER, 1),
        PREMIER(426, "Premier", VehicleType.CAR, 4),
        ENFORCER(427, "Enforcer", VehicleType.CAR, 4),
        SECURICAR(428, "Securicar", VehicleType.CAR, 4),
        BANSHEE(429, "Banshee", VehicleType.CAR, 2),
        PREDATOR(430, "Predator", VehicleType.BOAT, 0),
        BUS(431, "Bus", VehicleType.CAR, 8),
        RHINO(432, "Rhino", VehicleType.TANK, 1),
        BARRACKS(433, "Barracks", VehicleType.CAR, 2),
        HOTKNIFE(434, "Hotknife", VehicleType.CAR, 2),
        TRAILER1(435, "Trailer", VehicleType.TRAILER, 0),
        PREVION(436, "Previon", VehicleType.CAR, 2),
        COACH(437, "Coach", VehicleType.CAR, 8),
        CABBIE(438, "Cabbie", VehicleType.CAR, 4),
        STALLION(439, "Stallion", VehicleType.CAR, 2),
        RUMPO(440, "Rumpo", VehicleType.CAR, 4),
        RC_BANDIT(441, "RC Bandit", VehicleType.REMOTE_CONTROL, 1),
        ROMERO(442, "Romero", VehicleType.CAR, 2),
        PACKER(443, "Packer", VehicleType.CAR, 2),
        MONSTER1(444, "Monster", VehicleType.CAR, 2),
        ADMIRAL(445, "Admiral", VehicleType.CAR, 4),
        SQUALO(446, "Squalo", VehicleType.BOAT, 0),
        SEASPARROW(447, "Seasparrow", VehicleType.HELICOPTER, 2),
        PIZZABOY(448, "Pizzaboy", VehicleType.MOTORBIKE, 1),
        TRAM(449, "Tram", VehicleType.TRAIN, 4),
        TRAILER2(450, "Trailer", VehicleType.TRAILER, 0),
        TURISMO(451, "Turismo", VehicleType.CAR, 2),
        SPEEDER(452, "Speeder", VehicleType.BOAT, 0),
        REEFER(453, "Reefer", VehicleType.BOAT, 0),
        TROPIC(454, "Tropic", VehicleType.BOAT, 0),
        FLATBED(455, "Flatbed", VehicleType.CAR, 2),
        YANKEE(456, "Yankee", VehicleType.CAR, 2),
        CADDY(457, "Caddy", VehicleType.CAR, 2),
        SOLAIR(458, "Solair", VehicleType.CAR, 4),
        BERKLEYS_RC_VAN(459, "Berkleys RC Van", VehicleType.CAR, 4),
        SKIMMER(460, "Skimmer", VehicleType.AIRCRAFT, 2),
        PCJ_600(461, "PCJ-600", VehicleType.MOTORBIKE, 2),
        FAGGIO(462, "Faggio", VehicleType.MOTORBIKE, 2),
        FREEWAY(463, "Freeway", VehicleType.MOTORBIKE, 0),
        RC_BARON(464, "RC Baron", VehicleType.REMOTE_CONTROL, 1),
        RC_RAIDER(465, "RC Raider", VehicleType.REMOTE_CONTROL, 1),
        GLENDALE1(466, "Glendale", VehicleType.CAR, 4),
        OCEANIC(467, "Oceanic", VehicleType.CAR, 4),
        SANCHEZ(468, "Sanchez", VehicleType.MOTORBIKE, 2),
        SPARROW(469, "Sparrow", VehicleType.HELICOPTER, 2),
        PATRIOT(470, "Patriot", VehicleType.CAR, 4),
        QUAD(471, "Quad", VehicleType.MOTORBIKE, 2),
        COASTGUARD(472, "Coastguard", VehicleType.BOAT, 0),
        DINGHY(473, "Dinghy", VehicleType.BOAT, 0),
        HERMES(474, "Hermes", VehicleType.CAR, 2),
        SABRE(475, "Sabre", VehicleType.CAR, 2),
        RUSTLER(476, "Rustler", VehicleType.AIRCRAFT, 1),
        ZR3_50(477, "ZR3 50", VehicleType.CAR, 2),
        WALTON(478, "Walton", VehicleType.CAR, 2),
        REGINA(479, "Regina", VehicleType.CAR, 4),
        COMET(480, "Comet", VehicleType.CAR, 2),
        BMX(481, "BMX", VehicleType.BICYCLE, 1),
        BURRITO(482, "Burrito", VehicleType.CAR, 4),
        CAMPER(483, "Camper", VehicleType.CAR, 3),
        MARQUIS(484, "Marquis", VehicleType.BOAT, 0),
        BAGGAGE(485, "Baggage", VehicleType.CAR, 1),
        DOZER(486, "Dozer", VehicleType.CAR, 1),
        MAVERICK(487, "Maverick", VehicleType.HELICOPTER, 4),
        NEWS_CHOPPER(488, "News Chopper", VehicleType.HELICOPTER, 2),
        RANCHER1(489, "Rancher", VehicleType.CAR, 2),
        FBI_RANCHER(490, "FBI Rancher", VehicleType.CAR, 4),
        VIRGO(491, "Virgo", VehicleType.CAR, 2),
        GREENWOOD(492, "Greenwood", VehicleType.CAR, 2),
        JETMAX(493, "Jetmax", VehicleType.BOAT, 0),
        HOTRING(494, "Hotring", VehicleType.CAR, 2),
        SANDKING(495, "Sandking", VehicleType.CAR, 2),
        BLISTA_COMPACT(496, "Blista Compact", VehicleType.CAR, 2),
        POLICE_MAVERICK(497, "Police Maverick", VehicleType.HELICOPTER, 4),
        BOXVILLE1(498, "Boxville", VehicleType.CAR, 4),
        BENSON(499, "Benson", VehicleType.CAR, 2),
        MESA(500, "Mesa", VehicleType.CAR, 2),
        RC_GOBLIN(501, "RC Goblin", VehicleType.REMOTE_CONTROL, 1),
        HOTRING_RACER1(502, "Hotring Racer", VehicleType.CAR, 2),
        HOTRING_RACER2(503, "Hotring Racer", VehicleType.CAR, 2),
        BLOODRING_BANGER(504, "Bloodring Banger", VehicleType.CAR, 2),
        RANCHER2(505, "Rancher", VehicleType.CAR, 2),
        SUPER_GT(506, "Super GT", VehicleType.CAR, 2),
        ELEGANT(507, "Elegant", VehicleType.CAR, 4),
        JOURNEY(508, "Journey", VehicleType.CAR, 2),
        BIKE(509, "Bike", VehicleType.BICYCLE, 1),
        MOUNTAIN_BIKE(510, "Mountain Bike", VehicleType.BICYCLE, 1),
        BEAGLE(511, "Beagle", VehicleType.AIRCRAFT, 2),
        CROPDUST(512, "Cropdust", VehicleType.AIRCRAFT, 1),
        STUNT(513, "Stunt", VehicleType.AIRCRAFT, 1),
        TANKER(514, "Tanker", VehicleType.CAR, 2),
        ROADTRAIN(515, "RoadTrain", VehicleType.CAR, 2),
        NEBULA(516, "Nebula", VehicleType.CAR, 4),
        MAJESTIC(517, "Majestic", VehicleType.CAR, 2),
        BUCCANEER(518, "Buccaneer", VehicleType.CAR, 2),
        SHAMAL(519, "Shamal", VehicleType.AIRCRAFT, 1),
        HYDRA(520, "Hydra", VehicleType.AIRCRAFT, 1),
        FCR_900(521, "FCR-900", VehicleType.MOTORBIKE, 2),
        NRG_500(522, "NRG-500", VehicleType.MOTORBIKE, 2),
        HPV1000(523, "HPV1000", VehicleType.MOTORBIKE, 2),
        CEMENT_TRUCK(524, "Cement Truck", VehicleType.CAR, 2),
        TOW_TRUCK(525, "Tow Truck", VehicleType.CAR, 2),
        FORTUNE(526, "Fortune", VehicleType.CAR, 2),
        CADRONA(527, "Cadrona", VehicleType.CAR, 2),
        FBI_TRUCK(528, "FBI Truck", VehicleType.CAR, 2),
        WILLARD(529, "Willard", VehicleType.CAR, 4),
        FORKLIFT(530, "Forklift", VehicleType.CAR, 1),
        TRACTOR(531, "Tractor", VehicleType.CAR, 1),
        COMBINE(532, "Combine", VehicleType.CAR, 1),
        FELTZER(533, "Feltzer", VehicleType.CAR, 2),
        REMINGTON(534, "Remington", VehicleType.CAR, 2),
        SLAMVAN(535, "Slamvan", VehicleType.CAR, 2),
        BLADE(536, "Blade", VehicleType.CAR, 2),
        FREIGHT1(537, "Freight", VehicleType.TRAIN, 2),
        STREAK(538, "Streak", VehicleType.TRAIN, 2),
        VORTEX(539, "Vortex", VehicleType.BOAT, 0),
        VINCENT(540, "Vincent", VehicleType.CAR, 4),
        BULLET(541, "Bullet", VehicleType.CAR, 2),
        CLOVER(542, "Clover", VehicleType.CAR, 2),
        SADLER1(543, "Sadler", VehicleType.CAR, 2),
        FIRETRUCK2(544, "Firetruck", VehicleType.CAR, 2),
        HUSTLER(545, "Hustler", VehicleType.CAR, 2),
        INTRUDER(546, "Intruder", VehicleType.CAR, 4),
        PRIMO(547, "Primo", VehicleType.CAR, 4),
        CARGOBOB(548, "Cargobob", VehicleType.HELICOPTER, 2),
        TAMPA(549, "Tampa", VehicleType.CAR, 2),
        SUNRISE(550, "Sunrise", VehicleType.CAR, 4),
        MERIT(551, "Merit", VehicleType.CAR, 4),
        UTILITY(552, "Utility", VehicleType.CAR, 2),
        NEVADA(553, "Nevada", VehicleType.AIRCRAFT, 1),
        YOSEMITE(554, "Yosemite", VehicleType.CAR, 2),
        WINDSOR(555, "Windsor", VehicleType.CAR, 2),
        MONSTER2(556, "Monster", VehicleType.CAR, 2),
        MONSTER3(557, "Monster", VehicleType.CAR, 2),
        URANUS(558, "Uranus", VehicleType.CAR, 2),
        JESTER(559, "Jester", VehicleType.CAR, 2),
        SULTAN(560, "Sultan", VehicleType.CAR, 4),
        STRATUM(561, "Stratum", VehicleType.CAR, 4),
        ELEGY(562, "Elegy", VehicleType.CAR, 2),
        RAINDANCE(563, "Raindance", VehicleType.HELICOPTER, 2),
        RC_TIGER(564, "RC Tiger", VehicleType.REMOTE_CONTROL, 1),
        FLASH(565, "Flash", VehicleType.CAR, 2),
        TAHOMA(566, "Tahoma", VehicleType.CAR, 4),
        SAVANNA(567, "Savanna", VehicleType.CAR, 4),
        BANDITO(568, "Bandito", VehicleType.CAR, 1),
        FREIGHT2(569, "Freight", VehicleType.TRAIN, 0),
        TRAILER3(570, "Trailer", VehicleType.TRAIN, 0),
        KART(571, "Kart", VehicleType.CAR, 1),
        MOWER(572, "Mower", VehicleType.CAR, 1),
        DUNERIDE(573, "Duneride", VehicleType.CAR, 2),
        SWEEPER(574, "Sweeper", VehicleType.CAR, 1),
        BROADWAY(575, "Broadway", VehicleType.CAR, 2),
        TORNADO(576, "Tornado", VehicleType.CAR, 2),
        AT_400(577, "AT-400", VehicleType.AIRCRAFT, 1),
        DFT_30(578, "DFT-30", VehicleType.CAR, 2),
        HUNTLEY(579, "Huntley", VehicleType.CAR, 4),
        STAFFORD(580, "Stafford", VehicleType.CAR, 4),
        BF_400(581, "BF-400", VehicleType.MOTORBIKE, 2),
        NEWSVAN(582, "Newsvan", VehicleType.CAR, 2),
        TUG(583, "Tug", VehicleType.CAR, 1),
        TRAILER4(584, "Trailer", VehicleType.TRAILER, 0),
        EMPEROR(585, "Emperor", VehicleType.CAR, 4),
        WAYFARER(586, "Wayfarer", VehicleType.MOTORBIKE, 2),
        EUROS(587, "Euros", VehicleType.CAR, 2),
        HOTDOG(588, "Hotdog", VehicleType.CAR, 2),
        CLUB(589, "Club", VehicleType.CAR, 2),
        TRAILER5(590, "Trailer", VehicleType.TRAILER, 0),
        TRAILER6(591, "Trailer", VehicleType.TRAILER, 0),
        ANDROMADA(592, "Andromada", VehicleType.AIRCRAFT, 2),
        DODO(593, "Dodo", VehicleType.AIRCRAFT, 2),
        RC_CAM(594, "RC Cam", VehicleType.REMOTE_CONTROL, 1),
        LAUNCH(595, "Launch", VehicleType.BOAT, 0),
        POLICE_CAR_LSPD(596, "Police Car LSPD", VehicleType.CAR, 4),
        POLICE_CAR_SFPD(597, "Police Car SFPD", VehicleType.CAR, 4),
        POLICE_CAR_LVPD(598, "Police Car LVPD", VehicleType.CAR, 4),
        POLICE_RANGER(599, "Police Ranger", VehicleType.CAR, 2),
        PICADOR(600, "Picador", VehicleType.CAR, 2),
        SWAT_VAN(601, "SWAT Van", VehicleType.CAR, 2),
        ALPHA(602, "Alpha", VehicleType.CAR, 2),
        PHOENIX(603, "Phoenix", VehicleType.CAR, 2),
        GLENDALE2(604, "Glendale", VehicleType.CAR, 4),
        SADLER2(605, "Sadler", VehicleType.CAR, 2),
        LUGGAGE_TRAILER1(606, "Luggage Trailer", VehicleType.TRAILER, 0),
        LUGGAGE_TRAILER2(607, "Luggage Trailer", VehicleType.TRAILER, 0),
        STAIR_TRAILER(608, "Stair Trailer", VehicleType.TRAILER, 0),
        BOXVILLE2(609, "Boxville", VehicleType.CAR, 4),
        FARM_PLOW(610, "Farm Plow", VehicleType.TRAILER, 0),
        UTILITY_TRAILER(611, "Utility Trailer", VehicleType.TRAILER, 0);

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
        }
}
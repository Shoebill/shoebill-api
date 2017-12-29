package net.gtaun.shoebill.constant

/**
 * This class contains all the ComponentModels that can be applied to a vehicle. Not every component can be applied
 * to every vehicle. This information was taken from the official SA:MP Wikipedia page.
 *
 * @author MK124
 * @author Marvin Haschker
 */
enum class VehicleComponentModel(val id: Int, val modelName:
String, val slot: VehicleComponentSlot, val componentName: String, val supportedVehicleIds: IntArray) {
    SPOILER_PRO(1000, "spl_b_mar_m", VehicleComponentSlot.SPOILER, "Pro", intArrayOf(589, 492, 516, 404, 547, 489, 405, 421)),
    SPOILER_WIN(1001, "spl_b_bab_m", VehicleComponentSlot.SPOILER, "Win", intArrayOf(496, 401, 518, 527, 415, 585, 546, 410, 603, 426, 436, 405, 580, 439, 550, 549, 420, 540, 529)),
    SPOILER_DRAG(1002, "spl_b_bar_m", VehicleComponentSlot.SPOILER, "Drag", intArrayOf(496, 546, 517, 551, 418, 516, 404, 489)),
    SPOILER_ALPHA(1003, "spl_b_mab_m", VehicleComponentSlot.SPOILER, "Alpha", intArrayOf(496, 401, 518, 415, 585, 517, 410, 551, 426, 436, 547, 439, 550, 549, 420, 491, 529)),
    HOOD_CHAMP_SCOOP(1004, "bnt_b_sc_m", VehicleComponentSlot.HOOD, "Champ Scoop", intArrayOf(401, 589, 492, 546, 516, 600, 426, 489, 550, 420, 540, 478)),
    HOOD_FURY_SCOOP(1005, "bnt_b_sc_l", VehicleComponentSlot.HOOD, "Fury Scoop", intArrayOf(401, 518, 589, 492, 551, 600, 426, 489, 550, 420, 478)),
    ROOF_SCOOP(1006, "rf_b_sc_r", VehicleComponentSlot.ROOF, "Roof Scoop", intArrayOf(496, 401, 518, 589, 585, 492, 546, 551, 418, 603, 600, 426, 436, 489, 580, 550, 540, 529, 477)),
    SIDE_SKIRT_RIGHT(1007, "wg_l_b_ssk", VehicleComponentSlot.SIDE_SKIRT, "Right Sideskirt", intArrayOf(496, 422, 401, 518, 527, 415, 589, 585, 546, 517, 410, 516, 404, 603, 600, 436, 580, 439, 549, 540, 491, 529, 477)),
    NITRO_5_TIMES(1008, "nto_b_l", VehicleComponentSlot.NITRO, "5 times", intArrayOf(445, 602, 429, 496, 422, 401, 518, 541, 438, 527, 415, 542, 589, 480, 507, 585, 419, 587, 533, 526, 466, 492, 474, 579, 545, 411, 546, 400, 517, 410, 551, 500, 418, 516, 467, 404, 603, 600, 426, 436, 547, 489, 479, 442, 475, 405, 458, 580, 439, 550, 566, 549, 420, 451, 540, 491, 412, 478, 421, 529, 555, 477, 562, 565, 559, 561, 560, 558, 536, 575, 534, 567, 535, 576)),
    NITRO_2_TIMES(1009, "nto_b_s", VehicleComponentSlot.NITRO, "2 times", intArrayOf(445, 602, 429, 496, 422, 401, 518, 402, 402, 541, 438, 527, 415, 542, 589, 480, 507, 585, 419, 587, 533, 526, 466, 492, 474, 579, 545, 411, 546, 400, 517, 410, 551, 500, 418, 516, 467, 404, 603, 600, 426, 436, 547, 489, 479, 442, 475, 405, 458, 580, 439, 409, 550, 506, 566, 549, 420, 451, 540, 491, 412, 478, 421, 529, 555, 477, 562, 565, 559, 559, 561, 560, 558, 536, 575, 534, 567, 535, 576)),
    NITRO_10_TIMES(1010, "nto_b_tw", VehicleComponentSlot.NITRO, "10 times", intArrayOf(445, 602, 429, 496, 422, 401, 518, 402, 541, 438, 527, 415, 542, 589, 480, 507, 585, 419, 587, 533, 526, 466, 492, 474, 579, 545, 411, 546, 400, 517, 410, 551, 500, 418, 516, 467, 404, 603, 600, 426, 436, 547, 489, 479, 442, 475, 405, 458, 580, 439, 550, 566, 549, 420, 451, 540, 491, 412, 478, 421, 529, 555, 477, 562, 565, 559, 561, 560, 558, 536, 575, 534, 567, 535, 576)),
    HOOD_RACE_SCOOP(1011, "bnt_b_sc_p_m", VehicleComponentSlot.HOOD, "Race Scoop", intArrayOf(496, 549, 529)),
    HOOD_WORX_SCOOP(1012, "bnt_b_sc_p_l", VehicleComponentSlot.HOOD, "Worx Scoop", intArrayOf(549, 478, 529)),
    LAMPS_ROUND_FOG(1013, "lgt_b_rspt", VehicleComponentSlot.LAMPS, "Round Fog", intArrayOf(422, 401, 518, 589, 585, 400, 410, 500, 404, 600, 436, 489, 439, 478)),
    SPOILER_CHAMP(1014, "spl_b_bar_l", VehicleComponentSlot.SPOILER, "Champ", intArrayOf(527, 542, 405, 491, 421)),
    SPOILER_RACE(1015, "spl_b_bbr_l", VehicleComponentSlot.SPOILER, "Race", intArrayOf(527, 542, 516)),
    SPOILER_WORK(1016, "spl_b_bbr_m", VehicleComponentSlot.SPOILER, "Worx", intArrayOf(589, 492, 517, 551, 418, 516, 404, 547, 489, 421)),
    EXHAUST_UPSWEPT(1018, "exh_b_ts", VehicleComponentSlot.EXHAUST, "Upswept", intArrayOf(518, 527, 415, 542, 589, 585, 546, 400, 517, 551, 516, 603, 600, 547, 489, 405, 580, 550, 549, 540, 491, 421, 529, 477)),
    EXHAUST_TWIN(1019, "exh_b_t", VehicleComponentSlot.EXHAUST, "Twin", intArrayOf(496, 422, 401, 415, 542, 585, 546, 400, 517, 410, 551, 500, 516, 404, 603, 426, 436, 547, 489, 405, 550, 549, 420, 540, 491, 421, 529, 477)),
    EXHAUST_LARGE(1020, "exh_b_l", VehicleComponentSlot.EXHAUST, "Large", intArrayOf(496, 422, 401, 518, 527, 542, 589, 585, 400, 517, 410, 551, 500, 418, 516, 404, 603, 600, 436, 547, 489, 405, 580, 550, 549, 540, 491, 478, 421, 529, 477)),
    EXHAUST_MEDIUM(1021, "exh_b_m", VehicleComponentSlot.EXHAUST, "Medium", intArrayOf(422, 527, 542, 400, 410, 551, 500, 418, 516, 404, 426, 436, 547, 405, 420, 491, 478, 421, 477)),
    EXHAUST_SMALL(1022, "exh_b_s", VehicleComponentSlot.EXHAUST, "Small", intArrayOf(600, 436, 478)),
    SPOILER_FURY(1023, "spl_b_bbb_m", VehicleComponentSlot.SPOILER, "Fury", intArrayOf(496, 518, 415, 585, 546, 517, 410, 551, 603, 405, 580, 439, 550, 549, 540, 491, 421, 529)),
    LAMPS_SQUARE_FOG(1024, "lgt_b_sspt", VehicleComponentSlot.LAMPS, "Square Fog", intArrayOf(589, 546, 400, 410, 500, 603, 489, 540, 478)),
    SIDE_SKIRT_RIGHT_ALIEN_SULTAN(1026, "wg_l_a_s", VehicleComponentSlot.SIDE_SKIRT, "Right Alien Sideskirt (Sultan)", intArrayOf(560)),
    EXHAUST_ALIEN_SULTAN(1028, "exh_a_s", VehicleComponentSlot.EXHAUST, "Alien (Sultan)", intArrayOf(560)),
    EXHAUST_X_FLOW_SULTAN(1029, "exh_c_s", VehicleComponentSlot.EXHAUST, "X-Flow (Sultan)", intArrayOf(560)),
    SIDE_SKIRT_RIGHT_X_FLOW_SULTAN(1031, "wg_l_c_s", VehicleComponentSlot.SIDE_SKIRT, "Right X-Flow Sideskirt (Sultan)", intArrayOf(560)),
    ROOF_ALIEN_ROOF_VENT_SULTAN(1032, "rf_a_s", VehicleComponentSlot.ROOF, "Alien Roof Vent (Sultan)", intArrayOf(560)),
    ROOF_X_FLOW_ROOF_VENT_SULTAN(1033, "rf_c_s", VehicleComponentSlot.ROOF, "X-Flow Roof Vent (Sultan)", intArrayOf(560)),
    EXHAUST_ALIEN_ELEGY(1034, "exh_a_l", VehicleComponentSlot.EXHAUST, "Alien (Elegy)", intArrayOf(562)),
    ROOF_X_FLOW_ROOF_VENT_ELEGY(1035, "rf_c_l", VehicleComponentSlot.ROOF, "X-Flow Roof Vent (Elegy)", intArrayOf(562)),
    SIDE_SKIRT_RIGHT_ALIEN_ELEGY(1036, "wg_l_a_l", VehicleComponentSlot.SIDE_SKIRT, "Right Alien Sideskirt (Elegy)", intArrayOf(562)),
    EXHAUST_X_FLOW_ELEGY(1037, "exh_c_l", VehicleComponentSlot.EXHAUST, "X-Flow (Elegy)", intArrayOf(562)),
    ROOF_ALIEN_ROOF_VENT_ELEGY(1038, "rf_a_l", VehicleComponentSlot.ROOF, "Alien Roof Vent (Elegy)", intArrayOf(562)),
    SIDE_SKIRT_LEFT_X_FLOW_ELEGY(1039, "wg_l_c_l", VehicleComponentSlot.SIDE_SKIRT, "Left X-Flow Sideskirt (Elegy)", intArrayOf(562)),
    SIDE_SKIRT_RIGHT_CHROME_BROADWAY(1042, "wg_l_lr_br1", VehicleComponentSlot.SIDE_SKIRT, "Right Chrome Sideskirt (Broadway)", intArrayOf(575)),
    EXHAUST_SLAMIN_BROADWAY(1043, "exh_lr_br2", VehicleComponentSlot.EXHAUST, "Slamin (Broadway)", intArrayOf(575)),
    EXHAUST_CHROME_BROADWAY(1044, "exh_lr_br1", VehicleComponentSlot.EXHAUST, "Chrome (Broadway)", intArrayOf(575)),
    EXHAUST_X_FLOW_FLASH(1045, "exh_c_f", VehicleComponentSlot.EXHAUST, "X-Flow (Flash)", intArrayOf(565)),
    EXHAUST_ALIEN_FLASH(1046, "exh_a_f", VehicleComponentSlot.EXHAUST, "Alien (Flash)", intArrayOf(565)),
    SIDE_SKIRT_RIGHT_ALIEN_FLASH(1047, "wg_l_a_f", VehicleComponentSlot.SIDE_SKIRT, "Right Alien Sideskirt (Flash)", intArrayOf(565)),
    SIDE_SKIRT_RIGHT_X_FLOW_FLASH(1048, "wg_l_c_f", VehicleComponentSlot.SIDE_SKIRT, "Right X-Flow Sideskirt (Flash)", intArrayOf(565)),
    SPOILER_ALIEN_FLASH(1049, "spl_a_f_r", VehicleComponentSlot.SPOILER, "Alien (Flash)", intArrayOf(565)),
    SPOILER_X_FLOW_FLASH(1050, "spl_c_f_r", VehicleComponentSlot.SPOILER, "X-Flow (Flash)", intArrayOf(565)),
    ROOF_X_FLOW_FLASH(1053, "rf_c_f", VehicleComponentSlot.ROOF, "X-Flow (Flash)", intArrayOf(565)),
    ROOF_ALIEN_FLASH(1054, "rf_a_f", VehicleComponentSlot.ROOF, "Alien (Flash)", intArrayOf(565)),
    ROOF_ALIEN_STRATUM(1055, "rf_a_st", VehicleComponentSlot.ROOF, "Alien (Stratum)", intArrayOf(561)),
    SIDE_SKIRT_RIGHT_ALIEN_STRATUM(1056, "wg_l_a_st", VehicleComponentSlot.SIDE_SKIRT, "Right Alien Sideskirt (Stratum)", intArrayOf(561)),
    SIDE_SKIRT_X_FLOW_STRATUM(1057, "wg_l_c_st", VehicleComponentSlot.SIDE_SKIRT, "Right X-Flow Sideskirt (Stratum)", intArrayOf(561)),
    SPOILER_ALIEN_STRATUM(1058, "spl_a_st_r", VehicleComponentSlot.SPOILER, "Alien (Stratum)", intArrayOf(561)),
    EXHAUST_X_FLOW_STRATUM(1059, "exh_c_st", VehicleComponentSlot.EXHAUST, "X-Flow (Stratum)", intArrayOf(561)),
    SPOILER_X_FLOW_STRATUM(1060, "spl_c_st_r", VehicleComponentSlot.SPOILER, "X-Flow (Stratum)", intArrayOf(561)),
    ROOF_X_FLOW_STRATUM(1061, "rf_c_st", VehicleComponentSlot.ROOF, "X-Flow (Stratum)", intArrayOf(561)),
    EXHAUST_ALIEN_STRATUM(1064, "exh_a_st", VehicleComponentSlot.EXHAUST, "Alien (Stratum)", intArrayOf(561)),
    EXHAUST_ALIEN_JESTER(1065, "exh_a_j", VehicleComponentSlot.EXHAUST, "Alien (Jester)", intArrayOf(559)),
    EXHAUST_X_FLOW_JESTER(1066, "exh_c_j", VehicleComponentSlot.EXHAUST, "X-Flow (Jester)", intArrayOf(559)),
    ROOF_ALIEN_JESTER(1067, "rf_a_j", VehicleComponentSlot.ROOF, "Alien (Jester)", intArrayOf(559)),
    ROOF_X_FLOW_JESTER(1068, "rf_c_j", VehicleComponentSlot.ROOF, "X-Flow (Jester)", intArrayOf(559)),
    SIDE_SKIRT_RIGHT_ALIEN_JESTER(1069, "wg_l_a_j", VehicleComponentSlot.SIDE_SKIRT, "Right Alien Sideskirt (Jester)", intArrayOf(559)),
    SIDE_SKIRT_RIGHT_X_FLOW_JESTER(1070, "wg_l_c_j", VehicleComponentSlot.SIDE_SKIRT, "Right X-Flow Sideskirt (Jester)", intArrayOf(559)),
    ROOF_ALIEN(1088, "rf_a_u", VehicleComponentSlot.ROOF, "Alien (Uranus)", intArrayOf(558)),
    EXHAUST_X_FLOW_URANUS(1089, "exh_c_u", VehicleComponentSlot.EXHAUST, "X-Flow (Uranus)", intArrayOf(558)),
    SIDE_SKIRT_RIGHT_ALIEN_URANUS(1090, "wg_l_a_u", VehicleComponentSlot.SIDE_SKIRT, "Right Alien Sideskirt (Uranus)", intArrayOf(558)),
    ROOF_X_FLOW_URANUS(1091, "rf_c_u", VehicleComponentSlot.ROOF, "X-Flow (Uranus)", intArrayOf(558)),
    EXHAUST_ALIEN_URANUS(1092, "exh_a_u", VehicleComponentSlot.EXHAUST, "Alien (Uranus)", intArrayOf(558)),
    SIDE_SKIRT_RIGHT_X_FLOW_1_URANUS(1093, "wg_l_c_u", VehicleComponentSlot.SIDE_SKIRT, "Right X-Flow Sideskirt (Uranus)", intArrayOf(558)),
    BULLBARS_CHROME_GRILL(1100, "misc_c_lr_rem1", VehicleComponentSlot.FRONT_BUMPER, "Chrome Grill (Remington)", intArrayOf(534)),
    ROOF_COVERTIBLE_BLADE(1103, "rf_lr_bl2", VehicleComponentSlot.ROOF, "Covertible (Blade)", intArrayOf(536)),
    EXHAUST_CHROME_BLADE(1104, "exh_lr_bl1", VehicleComponentSlot.EXHAUST, "Chrome (Blade)", intArrayOf(536)),
    EXHAUST_SLAMIN_BLADE(1105, "exh_lr_bl2", VehicleComponentSlot.EXHAUST, "Slamin (Blade)", intArrayOf(536)),
    SIDE_SKIRT_RIGHT_CHROME_ARCHES_REMINGTON(1106, "wg_l_lr_rem2", VehicleComponentSlot.SIDE_SKIRT, "Right `Chrome Arches` (Remington)", intArrayOf(534)),
    SIDE_SKIRT_RIGHT_CHROME_STRIP_BLADE(1108, "wg_l_lr_bl1", VehicleComponentSlot.SIDE_SKIRT, "Right `Chrome Strip` Sideskirt (Blade)", intArrayOf(536)),
    REAR_BULLBARS_CHROME_SLAMVAN(1109, "bbb_lr_slv1", VehicleComponentSlot.REAR_BUMPER, "Chrome (Slamvan)", intArrayOf(535)),
    REAR_BULLBARS_SLAMIN_SLAMVAN(1110, "bbb_lr_slv2", VehicleComponentSlot.REAR_BUMPER, "Slamin (Slamvan)", intArrayOf(535)),
    EXHAUST_CHROME_SLAMVAN(1113, "exh_lr_slv1", VehicleComponentSlot.EXHAUST, "Chrome (Slamvan)", intArrayOf(535)),
    EXHAUST_SLAMIN_SLAMVAN(1114, "exh_lr_slv2", VehicleComponentSlot.EXHAUST, "Slamin (Slamvan)", intArrayOf(535)),
    FRONT_BULLBARS_CHROME_SLAMVAN(1115, "fbb_lr_slv1", VehicleComponentSlot.FRONT_BUMPER, "Chrome (Slamvan)", intArrayOf(535)),
    FRONT_BULLBARS_SLAMIN_SLAMVAN(1116, "fbb_lr_slv2", VehicleComponentSlot.FRONT_BUMPER, "Slamin (Slamvan)", intArrayOf(535)),
    FRONT_BUMPER_CHROME_SLAMVAN(1117, "fbmp_lr_slv1", VehicleComponentSlot.FRONT_BUMPER, "Chrome (Slamvan)", intArrayOf(535)),
    SIDE_SKIRT_RIGHT_CHROME_TRIM_SLAMVAN(1118, "wg_l_lr_slv1", VehicleComponentSlot.SIDE_SKIRT, "Right `Chrome Trim` Sideskirt (Slamvan)", intArrayOf(535)),
    SIDE_SKIRT_RIGHT_WHEELCOVERS_SLAMVAN(1119, "wg_l_lr_slv2", VehicleComponentSlot.SIDE_SKIRT, "Right `Wheelcovers` Sideskirt (Slamvan)", intArrayOf(535)),
    SIDE_SKIRT_RIGHT_CHROME_FLAMES_REMINGTON(1122, "wg_l_lr_rem1", VehicleComponentSlot.SIDE_SKIRT, "Right `Chrome Flames` Sideskirt (Remington)", intArrayOf(534)),
    BULLBARS_CHROME_BARS_REMINGTON(1123, "misc_c_lr_rem2", VehicleComponentSlot.FRONT_BUMPER, "Bullbar Chrome Bars (Remington)", intArrayOf(534)),
    BULLBARS_CHROME_LIGHTS_REMINGTON(1125, "misc_c_lr_rem3", VehicleComponentSlot.FRONT_BUMPER, "Bullbar Chrome Lights (Remington)", intArrayOf(534)),
    EXHAUST_CHROME_EXHAUST_REMINGTON(1126, "exh_lr_rem1", VehicleComponentSlot.EXHAUST, "Chrome Exhaust (Remington)", intArrayOf(534)),
    EXHAUST_SLAMIN_EXHAUST_REMINGTON(1127, "exh_lr_rem2", VehicleComponentSlot.EXHAUST, "Slamin Exhaust (Remington)", intArrayOf(534)),
    ROOF_VINYL_HARDTOP_BLADE(1128, "rf_lr_bl1", VehicleComponentSlot.ROOF, "Vinyl Hardtop (Blade)", intArrayOf(536)),
    EXHAUST_CHROME_SAVANNA(1129, "exh_lr_sv1", VehicleComponentSlot.EXHAUST, "Chrome (Savanna)", intArrayOf(567)),
    ROOF_HARDTOP_SAVANNA(1130, "rf_lr_sv1", VehicleComponentSlot.ROOF, "Hardtop (Savanna)", intArrayOf(567)),
    ROOF_SOFTTOP_SAVANNA(1131, "rf_lr_sv2", VehicleComponentSlot.ROOF, "Softtop (Savanna)", intArrayOf(567)),
    EXHAUST_SLAMIN_SAVANNA(1132, "exh_lr_sv2", VehicleComponentSlot.EXHAUST, "Slamin (Savanna)", intArrayOf(567)),
    SIDE_SKIRT_RIGHT_CHROME_STRIP_SAVANNA(1133, "wg_l_lr_sv", VehicleComponentSlot.SIDE_SKIRT, "Right `Chrome Strip` Sideskirt (Savanna)", intArrayOf(567)),
    SIDE_SKIRT_RIGHT_CHROME_STRIP_TORNADO(1134, "wg_l_lr_t1", VehicleComponentSlot.SIDE_SKIRT, "Right `Chrome Strip` Sideskirt (Tornado)", intArrayOf(576)),
    EXHAUST_SLAMIN_TORNADO(1135, "exh_lr_t2", VehicleComponentSlot.EXHAUST, "Slamin (Tornado)", intArrayOf(576)),
    EXHAUST_CHROME_TORNADO(1136, "exh_lr_t1", VehicleComponentSlot.EXHAUST, "Chrome (Tornado)", intArrayOf(576)),
    SPOILER_ALIEN_SULTAN(1138, "spl_a_s_b", VehicleComponentSlot.SPOILER, "Alien (Sultan)", intArrayOf(560)),
    SPOILER_X_FLOW_SULTAN(1139, "spl_c_s_b", VehicleComponentSlot.SPOILER, "X-Flow (Sultan)", intArrayOf(560)),
    REAR_BUMPER_X_FLOW_SULTAN(1140, "rbmp_c_s", VehicleComponentSlot.REAR_BUMPER, "X-Flow (Sultan)", intArrayOf(560)),
    REAR_BUMPER_ALIEN_SULTAN(1141, "rbmp_a_s", VehicleComponentSlot.REAR_BUMPER, "Alien (Sultan)", intArrayOf(560)),
    VENT_RIGHT_OVAL_VENTS(1143, "bntl_b_ov", VehicleComponentSlot.VENT_RIGHT, "Right Oval Vents", intArrayOf(496, 401, 518, 585, 546, 517, 603, 547, 439, 550, 549, 540, 491)),
    VENT_RIGHT_SQUARE_VENTS(1145, "bntl_b_sq", VehicleComponentSlot.VENT_RIGHT, "Right Square Vents", intArrayOf(401, 518, 542, 589, 585, 546, 517, 603, 439, 550, 549, 540, 491)),
    SPOILER_X_FLOW_ELEGY(1146, "spl_c_l_b", VehicleComponentSlot.SPOILER, "X-Flow (Elegy)", intArrayOf(562)),
    SPOILER_ALIEN_ELEGY(1147, "spl_a_l_b", VehicleComponentSlot.SPOILER, "Alien (Elegy)", intArrayOf(562)),
    REAR_BUMPER_X_FLOW_ELEGY(1148, "rbmp_c_l", VehicleComponentSlot.REAR_BUMPER, "X-Flow (Elegy)", intArrayOf(562)),
    REAR_BUMPER_ALIEN_ELEGY(1149, "rbmp_a_l", VehicleComponentSlot.REAR_BUMPER, "Alien (Elegy)", intArrayOf(562)),
    REAR_BUMPER_ALIEN_FLASH(1150, "rbmp_a_f", VehicleComponentSlot.REAR_BUMPER, "Alien (Flash)", intArrayOf(565)),
    REAR_BUMPER_X_FLOW_FLASH(1151, "rbmp_c_f", VehicleComponentSlot.REAR_BUMPER, "X-Flow (Flash)", intArrayOf(565)),
    FRONT_BUMPER_X_FLOW_FLASH(1152, "fbmp_c_f", VehicleComponentSlot.FRONT_BUMPER, "X-Flow (Flash)", intArrayOf(565)),
    FRONT_BUMPER_ALIEN_FLASH(1153, "fbmp_a_f", VehicleComponentSlot.FRONT_BUMPER, "Alien (Flash)", intArrayOf(565)),
    REAR_BUMPER_ALIEN_STRATUM(1154, "rbmp_a_st", VehicleComponentSlot.REAR_BUMPER, "Alien (Stratum)", intArrayOf(561)),
    FRONT_BUMPER_ALIEN_STRATUM(1155, "fbmp_a_st", VehicleComponentSlot.FRONT_BUMPER, "Alien (Stratum)", intArrayOf(561)),
    REAR_BUMPER_X_FLOW_STRATUM(1156, "rbmp_c_st", VehicleComponentSlot.REAR_BUMPER, "X-Flow (Stratum)", intArrayOf(561)),
    FRONT_BUMPER_X_FLOW_STRATUM(1157, "fbmp_c_st", VehicleComponentSlot.FRONT_BUMPER, "X-Flow (Stratum)", intArrayOf(561)),
    SPOILER_X_FLOW_JESTER(1158, "spl_c_j_b", VehicleComponentSlot.SPOILER, "X-Flow (Jester)", intArrayOf(559)),
    REAR_BUMPER_ALIEN_JESTER(1159, "rbmp_a_j", VehicleComponentSlot.REAR_BUMPER, "Alien (Jester)", intArrayOf(559)),
    FRONT_BUMPER_ALIEN_JESTER(1160, "fbmp_a_j", VehicleComponentSlot.FRONT_BUMPER, "Alien (Jester)", intArrayOf(559)),
    REAR_BUMPER_X_FLOW_JESTER(1161, "rbmp_c_j", VehicleComponentSlot.REAR_BUMPER, "X-Flow (Jester)", intArrayOf(559)),
    SPOILER_ALIEN_JESTER(1162, "spl_a_j_b", VehicleComponentSlot.SPOILER, "Alien (Jester)", intArrayOf(559)),
    SPOILER_X_FLOW_URANUS(1163, "spl_c_u_b", VehicleComponentSlot.SPOILER, "X-Flow (Uranus)", intArrayOf(558)),
    SPOILER_ALIEN_URANUS(1164, "spl_a_u_b", VehicleComponentSlot.SPOILER, "Alien (Uranus)", intArrayOf(558)),
    FRONT_BUMPER_X_FLOW_URANUS(1165, "fbmp_c_u", VehicleComponentSlot.FRONT_BUMPER, "X-Flow (Uranus)", intArrayOf(558)),
    FRONT_BUMPER_ALIEN_URANUS(1166, "fbmp_a_u", VehicleComponentSlot.FRONT_BUMPER, "Alien (Uranus)", intArrayOf(558)),
    REAR_BUMPER_X_FLOW_URANUS(1167, "rbmp_c_u", VehicleComponentSlot.REAR_BUMPER, "X-Flow (Uranus)", intArrayOf(558)),
    REAR_BUMPER_ALIEN_URANUS(1168, "rbmp_a_u", VehicleComponentSlot.REAR_BUMPER, "Alien (Uranus)", intArrayOf(558)),
    FRONT_BUMPER_ALIEN_SULTAN(1169, "fbmp_a_s", VehicleComponentSlot.FRONT_BUMPER, "Alien (Sultan)", intArrayOf(560)),
    FRONT_BUMPER_X_FLOW_SULTAN(1170, "fbmp_c_s", VehicleComponentSlot.FRONT_BUMPER, "X-Flow (Sultan)", intArrayOf(560)),
    FRONT_BUMPER_ALIEN_ELEGY(1171, "fbmp_a_l", VehicleComponentSlot.FRONT_BUMPER, "Alien (Elegy)", intArrayOf(562)),
    FRONT_BUMPER_X_FLOW_ELEGY(1172, "fbmp_c_l", VehicleComponentSlot.FRONT_BUMPER, "X-Flow (Elegy)", intArrayOf(562)),
    FRONT_BUMPER_X_FLOW_JESTER(1173, "fbmp_c_j", VehicleComponentSlot.FRONT_BUMPER, "X-Flow (Jester)", intArrayOf(559)),
    FRONT_BUMPER_CHROME_BROADWAY(1174, "fbmp_lr_br1", VehicleComponentSlot.FRONT_BUMPER, "Chrome (Broadway)", intArrayOf(575)),
    FRONT_BUMPER_SLAMIN_BROADWAY(1175, "fbmp_lr_br2", VehicleComponentSlot.FRONT_BUMPER, "Slamin (Broadway)", intArrayOf(575)),
    REAR_BUMPER_CHROME_BROADWAY(1176, "rbmp_lr_br1", VehicleComponentSlot.REAR_BUMPER, "Chrome (Broadway)", intArrayOf(575)),
    REAR_BUMPER_SLAMIN_BROADWAY(1177, "rbmp_lr_br2", VehicleComponentSlot.REAR_BUMPER, "Slamin (Broadway)", intArrayOf(575)),
    REAR_BUMPER_SLAMIN_REMINGTON(1178, "rbmp_lr_rem2", VehicleComponentSlot.REAR_BUMPER, "Slamin (Remington)", intArrayOf(534)),
    FRONT_BUMPER_CHROME_REMINGTON(1179, "fbmp_lr_rem1", VehicleComponentSlot.FRONT_BUMPER, "Chrome (Remington)", intArrayOf(534)),
    REAR_BUMPER_CHROME_REMINGTON(1180, "rbmp_lr_rem1", VehicleComponentSlot.REAR_BUMPER, "Chrome (Remington)", intArrayOf(534)),
    FRONT_BUMPER_SLAMIN_BLADE(1181, "fbmp_lr_bl2", VehicleComponentSlot.FRONT_BUMPER, "Slamin (Blade)", intArrayOf(536)),
    FRONT_BUMPER_CHROME_BLADE(1182, "fbmp_lr_bl1", VehicleComponentSlot.FRONT_BUMPER, "Chrome (Blade)", intArrayOf(536)),
    REAR_BUMPER_SLAMIN_BLADE(1183, "rbmp_lr_bl2", VehicleComponentSlot.REAR_BUMPER, "Slamin (Blade)", intArrayOf(536)),
    REAR_BUMPER_CHROME_BLADE(1184, "rbmp_lr_bl1", VehicleComponentSlot.REAR_BUMPER, "Chrome (Blade)", intArrayOf(536)),
    FRONT_BUMPER_SLAMIN_REMINGTON(1185, "fbmp_lr_rem2", VehicleComponentSlot.FRONT_BUMPER, "Slamin (Remington)", intArrayOf(534)),
    REAR_BUMPER_SLAMIN_SAVANNA(1186, "rbmp_lr_sv2", VehicleComponentSlot.REAR_BUMPER, "Slamin (Savanna)", intArrayOf(567)),
    REAR_BUMPER_CHROME_SAVANNA(1187, "rbmp_lr_sv1", VehicleComponentSlot.REAR_BUMPER, "Chrome (Savanna)", intArrayOf(567)),
    FRONT_BUMPER_SLAMIN_SAVANNA(1188, "fbmp_lr_sv2", VehicleComponentSlot.FRONT_BUMPER, "Slamin (Savanna)", intArrayOf(567)),
    FRONT_BUMPER_CHROME_SAVANNA(1189, "fbmp_lr_sv1", VehicleComponentSlot.FRONT_BUMPER, "Chrome (Savanna)", intArrayOf(567)),
    FRONT_BUMPER_SLAMIN_TORNADO(1190, "fbmp_lr_t2", VehicleComponentSlot.FRONT_BUMPER, "Slamin (Tornado)", intArrayOf(576)),
    FRONT_BUMPER_CHROME_TORNADO(1191, "fbmp_lr_t1", VehicleComponentSlot.FRONT_BUMPER, "Chrome (Tornado)", intArrayOf(576)),
    REAR_BUMPER_CHROME_TORNADO(1192, "rbmp_lr_t1", VehicleComponentSlot.REAR_BUMPER, "Chrome (Tornado)", intArrayOf(576)),
    REAR_BUMPER_SLAMIN_TORNADO(1193, "rbmp_lr_t2", VehicleComponentSlot.REAR_BUMPER, "Slamin (Tornado)", intArrayOf(576));

    companion object : Collectable<VehicleComponentModel>, Findable<Int, VehicleComponentModel> {
        private val VALUES = values().map { it.id to it }.toMap()

        /**
         * Gets all available [VehicleComponentModel]s.
         */
        @JvmStatic
        override fun get(): Collection<VehicleComponentModel> = VALUES.values

        /**
         * Gets a [VehicleComponentModel] by its id.
         */
        @JvmStatic
        override operator fun get(value: Int): VehicleComponentModel? = VALUES[value]

        /**
         * Gets all compatible [VehicleComponentModel] for the [model].
         */
        @JvmStatic
        operator fun get(model: VehicleModel): Collection<VehicleComponentModel> = VALUES.filter {
            it.value.supportedVehicleIds.contains(model.id)
        }.values

        /**
         * Checks if the [model] supports any type of component.
         */
        @JvmStatic
        fun doesVehicleSupportAnyComponent(model: VehicleModel): Boolean = get(model).size > 0
    }

}

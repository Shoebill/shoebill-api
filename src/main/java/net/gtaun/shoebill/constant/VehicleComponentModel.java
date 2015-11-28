package net.gtaun.shoebill.constant;

import java.util.*;
import java.util.Map.Entry;

public final class VehicleComponentModel
{
	private static enum VehicleComponentModelData
	{
		SPOILER_PRO(1000, "spl_b_mar_m", VehicleComponentSlot.SPOILER, "Pro", new int[] {589, 492, 516, 404, 547, 489, 405, 421}),
		SPOILER_WIN(1001, "spl_b_bab_m", VehicleComponentSlot.SPOILER, "Win", new int[] {496, 401, 518, 527, 415, 585, 546, 410, 603, 426, 436, 405, 580, 439, 550, 549, 420, 540, 529}),
		SPOILER_DRAG(1002, "spl_b_bar_m", VehicleComponentSlot.SPOILER, "Drag", new int[] {496, 546, 517, 551, 418, 516, 404, 489}),
		SPOILER_ALPHA(1003, "spl_b_mab_m", VehicleComponentSlot.SPOILER, "Alpha", new int[] {496, 401, 518, 415, 585, 517, 410, 551, 426, 436, 547, 439, 550, 549, 420, 491, 529}),
		HOOD_CHAMP_SCOOP(1004, "bnt_b_sc_m", VehicleComponentSlot.HOOD, "Champ Scoop", new int[] {401, 589, 492, 546, 516, 600, 426, 489, 550, 420, 540, 478}),
		HOOD_FURY_SCOOP(1005, "bnt_b_sc_l", VehicleComponentSlot.HOOD, "Fury Scoop", new int[] {401, 518, 589, 492, 551, 600, 426, 489, 550, 420, 478}),
		ROOF_SCOOP(1006, "rf_b_sc_r", VehicleComponentSlot.ROOF, "Roof Scoop", new int[] {496, 401, 518, 589, 585, 492, 546, 551, 418, 603, 600, 426, 436, 489, 580, 550, 540, 529, 477}),
		SIDE_SKIRT_RIGHT(1007, "wg_l_b_ssk", VehicleComponentSlot.SIDE_SKIRT, "Right Sideskirt", new int[] {496, 422, 401, 518, 527, 415, 589, 585, 546, 517, 410, 516, 404, 603, 600, 436, 580, 439, 549, 540, 491, 529, 477}),
		NITRO_5_TIMES(1008, "nto_b_l", VehicleComponentSlot.NITRO, "5 times", new int[] {445, 602, 429, 496, 422, 401, 518, 541, 438, 527, 415, 542, 589, 480, 507, 585, 419, 587, 533, 526, 466, 492, 474, 579, 545, 411, 546, 400, 517, 410, 551, 500, 418, 516, 467, 404, 603, 600, 426, 436, 547, 489, 479, 442, 475, 405, 458, 580, 439, 550, 566, 549, 420, 451, 540, 491, 412, 478, 421, 529, 555, 477, 562, 565, 559, 561, 560, 558, 536, 575, 534, 567, 535, 576}),
		NITRO_2_TIMES(1009, "nto_b_s", VehicleComponentSlot.NITRO, "2 times", new int[] {445, 602, 429, 496, 422, 401, 518, 402, 402, 541, 438, 527, 415, 542, 589, 480, 507, 585, 419, 587, 533, 526, 466, 492, 474, 579, 545, 411, 546, 400, 517, 410, 551, 500, 418, 516, 467, 404, 603, 600, 426, 436, 547, 489, 479, 442, 475, 405, 458, 580, 439, 409, 550, 506, 566, 549, 420, 451, 540, 491, 412, 478, 421, 529, 555, 477, 562, 565, 559, 559, 561, 560, 558, 536, 575, 534, 567, 535, 576}),
		NITRO_10_TIMES(1010, "nto_b_tw", VehicleComponentSlot.NITRO, "10 times", new int[] {445, 602, 429, 496, 422, 401, 518, 402, 541, 438, 527, 415, 542, 589, 480, 507, 585, 419, 587, 533, 526, 466, 492, 474, 579, 545, 411, 546, 400, 517, 410, 551, 500, 418, 516, 467, 404, 603, 600, 426, 436, 547, 489, 479, 442, 475, 405, 458, 580, 439, 550, 566, 549, 420, 451, 540, 491, 412, 478, 421, 529, 555, 477, 562, 565, 559, 561, 560, 558, 536, 575, 534, 567, 535, 576}),
		HOOD_RACE_SCOOP(1011, "bnt_b_sc_p_m", VehicleComponentSlot.HOOD, "Race Scoop", new int[] {496, 549, 529}),
		HOOD_WORX_SCOOP(1012, "bnt_b_sc_p_l", VehicleComponentSlot.HOOD, "Worx Scoop", new int[] {549, 478, 529}),
		LAMPS_ROUND_FOG(1013, "lgt_b_rspt", VehicleComponentSlot.LAMPS, "Round Fog", new int[] {422, 401, 518, 589, 585, 400, 410, 500, 404, 600, 436, 489, 439, 478}),
		SPOILER_CHAMP(1014, "spl_b_bar_l", VehicleComponentSlot.SPOILER, "Champ", new int[] {527, 542, 405, 491, 421}),
		SPOILER_RACE(1015, "spl_b_bbr_l", VehicleComponentSlot.SPOILER, "Race", new int[] {527, 542, 516}),
		SPOILER_WORK(1016, "spl_b_bbr_m", VehicleComponentSlot.SPOILER, "Worx", new int[] {589, 492, 517, 551, 418, 516, 404, 547, 489, 421}),
		EXHAUST_UPSWEPT(1018, "exh_b_ts", VehicleComponentSlot.EXHAUST, "Upswept", new int[] {518, 527, 415, 542, 589, 585, 546, 400, 517, 551, 516, 603, 600, 547, 489, 405, 580, 550, 549, 540, 491, 421, 529, 477}),
		EXHAUST_TWIN(1019, "exh_b_t", VehicleComponentSlot.EXHAUST, "Twin", new int[] {496, 422, 401, 415, 542, 585, 546, 400, 517, 410, 551, 500, 516, 404, 603, 426, 436, 547, 489, 405, 550, 549, 420, 540, 491, 421, 529, 477}),
		EXHAUST_LARGE(1020, "exh_b_l", VehicleComponentSlot.EXHAUST, "Large", new int[] {496, 422, 401, 518, 527, 542, 589, 585, 400, 517, 410, 551, 500, 418, 516, 404, 603, 600, 436, 547, 489, 405, 580, 550, 549, 540, 491, 478, 421, 529, 477}),
		EXHAUST_MEDIUM(1021, "exh_b_m", VehicleComponentSlot.EXHAUST, "Medium", new int[] {422, 527, 542, 400, 410, 551, 500, 418, 516, 404, 426, 436, 547, 405, 420, 491, 478, 421, 477}),
		EXHAUST_SMALL(1022, "exh_b_s", VehicleComponentSlot.EXHAUST, "Small", new int[] {600, 436, 478}),
		SPOILER_FURY(1023, "spl_b_bbb_m", VehicleComponentSlot.SPOILER, "Fury", new int[] {496, 518, 415, 585, 546, 517, 410, 551, 603, 405, 580, 439, 550, 549, 540, 491, 421, 529}),
		LAMPS_SQUARE_FOG(1024, "lgt_b_sspt", VehicleComponentSlot.LAMPS, "Square Fog", new int[] {589, 546, 400, 410, 500, 603, 489, 540, 478}),
		SIDE_SKIRT_RIGHT_ALIEN_SULTAN(1026, "wg_l_a_s", VehicleComponentSlot.SIDE_SKIRT, "Right Alien Sideskirt (Sultan)", new int[] {560}),
		EXHAUST_ALIEN_SULTAN(1028, "exh_a_s", VehicleComponentSlot.EXHAUST, "Alien (Sultan)", new int[] {560}),
		EXHAUST_X_FLOW_SULTAN(1029, "exh_c_s", VehicleComponentSlot.EXHAUST, "X-Flow (Sultan)", new int[] {560}),
		SIDE_SKIRT_RIGHT_X_FLOW_SULTAN(1031, "wg_l_c_s", VehicleComponentSlot.SIDE_SKIRT, "Right X-Flow Sideskirt (Sultan)", new int[] {560}),
		ROOF_ALIEN_ROOF_VENT_SULTAN(1032, "rf_a_s", VehicleComponentSlot.ROOF, "Alien Roof Vent (Sultan)", new int[] {560}),
		ROOF_X_FLOW_ROOF_VENT_SULTAN(1033, "rf_c_s", VehicleComponentSlot.ROOF, "X-Flow Roof Vent (Sultan)", new int[] {560}),
		EXHAUST_ALIEN_ELEGY(1034, "exh_a_l", VehicleComponentSlot.EXHAUST, "Alien (Elegy)", new int[] {562}),
		ROOF_X_FLOW_ROOF_VENT_ELEGY(1035, "rf_c_l", VehicleComponentSlot.ROOF, "X-Flow Roof Vent (Elegy)", new int[] {562}),
		SIDE_SKIRT_RIGHT_ALIEN_ELEGY(1036, "wg_l_a_l", VehicleComponentSlot.SIDE_SKIRT, "Right Alien Sideskirt (Elegy)", new int[] {562}),
		EXHAUST_X_FLOW_ELEGY(1037, "exh_c_l", VehicleComponentSlot.EXHAUST, "X-Flow (Elegy)", new int[] {562}),
		ROOF_ALIEN_ROOF_VENT_ELEGY(1038, "rf_a_l", VehicleComponentSlot.ROOF, "Alien Roof Vent (Elegy)", new int[] {562}),
		SIDE_SKIRT_LEFT_X_FLOW_ELEGY(1039, "wg_l_c_l", VehicleComponentSlot.SIDE_SKIRT, "Left X-Flow Sideskirt (Elegy)", new int[] {562}),
		SIDE_SKIRT_RIGHT_CHROME_BROADWAY(1042, "wg_l_lr_br1", VehicleComponentSlot.SIDE_SKIRT, "Right Chrome Sideskirt (Broadway)", new int[] {575}),
		EXHAUST_SLAMIN_BROADWAY(1043, "exh_lr_br2", VehicleComponentSlot.EXHAUST, "Slamin (Broadway)", new int[] {575}),
		EXHAUST_CHROME_BROADWAY(1044, "exh_lr_br1", VehicleComponentSlot.EXHAUST, "Chrome (Broadway)", new int[] {575}),
		EXHAUST_X_FLOW_FLASH(1045, "exh_c_f", VehicleComponentSlot.EXHAUST, "X-Flow (Flash)", new int[] {565}),
		EXHAUST_ALIEN_FLASH(1046, "exh_a_f", VehicleComponentSlot.EXHAUST, "Alien (Flash)", new int[] {565}),
		SIDE_SKIRT_RIGHT_ALIEN_FLASH(1047, "wg_l_a_f", VehicleComponentSlot.SIDE_SKIRT, "Right Alien Sideskirt (Flash)", new int[] {565}),
		SIDE_SKIRT_RIGHT_X_FLOW_FLASH(1048, "wg_l_c_f", VehicleComponentSlot.SIDE_SKIRT, "Right X-Flow Sideskirt (Flash)", new int[] {565}),
		SPOILER_ALIEN_FLASH(1049, "spl_a_f_r", VehicleComponentSlot.SPOILER, "Alien (Flash)", new int[] {565}),
		SPOILER_X_FLOW_FLASH(1050, "spl_c_f_r", VehicleComponentSlot.SPOILER, "X-Flow (Flash)", new int[] {565}),
		ROOF_X_FLOW_FLASH(1053, "rf_c_f", VehicleComponentSlot.ROOF, "X-Flow (Flash)", new int[] {565}),
		ROOF_ALIEN_FLASH(1054, "rf_a_f", VehicleComponentSlot.ROOF, "Alien (Flash)", new int[] {565}),
		ROOF_ALIEN_STRATUM(1055, "rf_a_st", VehicleComponentSlot.ROOF, "Alien (Stratum)", new int[] {561}),
		SIDE_SKIRT_RIGHT_ALIEN_STRATUM(1056, "wg_l_a_st", VehicleComponentSlot.SIDE_SKIRT, "Right Alien Sideskirt (Stratum)", new int[] {561}),
		SIDE_SKIRT_X_FLOW_STRATUM(1057, "wg_l_c_st", VehicleComponentSlot.SIDE_SKIRT, "Right X-Flow Sideskirt (Stratum)", new int[] {561}),
		SPOILER_ALIEN_STRATUM(1058, "spl_a_st_r", VehicleComponentSlot.SPOILER, "Alien (Stratum)", new int[] {561}),
		EXHAUST_X_FLOW_STRATUM(1059, "exh_c_st", VehicleComponentSlot.EXHAUST, "X-Flow (Stratum)", new int[] {561}),
		SPOILER_X_FLOW_STRATUM(1060, "spl_c_st_r", VehicleComponentSlot.SPOILER, "X-Flow (Stratum)", new int[] {561}),
		ROOF_X_FLOW_STRATUM(1061, "rf_c_st", VehicleComponentSlot.ROOF, "X-Flow (Stratum)", new int[] {561}),
		EXHAUST_ALIEN_STRATUM(1064, "exh_a_st", VehicleComponentSlot.EXHAUST, "Alien (Stratum)", new int[] {561}),
		EXHAUST_ALIEN_JESTER(1065, "exh_a_j", VehicleComponentSlot.EXHAUST, "Alien (Jester)", new int[] {559}),
		EXHAUST_X_FLOW_JESTER(1066, "exh_c_j", VehicleComponentSlot.EXHAUST, "X-Flow (Jester)", new int[] {559}),
		ROOF_ALIEN_JESTER(1067, "rf_a_j", VehicleComponentSlot.ROOF, "Alien (Jester)", new int[] {559}),
		ROOF_X_FLOW_JESTER(1068, "rf_c_j", VehicleComponentSlot.ROOF, "X-Flow (Jester)", new int[] {559}),
		SIDE_SKIRT_RIGHT_ALIEN_JESTER(1069, "wg_l_a_j", VehicleComponentSlot.SIDE_SKIRT, "Right Alien Sideskirt (Jester)", new int[] {559}),
		SIDE_SKIRT_RIGHT_X_FLOW_JESTER(1070, "wg_l_c_j", VehicleComponentSlot.SIDE_SKIRT, "Right X-Flow Sideskirt (Jester)", new int[] {559}),
		ROOF_ALIEN(1088, "rf_a_u", VehicleComponentSlot.ROOF, "Alien (Uranus)", new int[] {558}),
		EXHAUST_X_FLOW_URANUS(1089, "exh_c_u", VehicleComponentSlot.EXHAUST, "X-Flow (Uranus)", new int[] {558}),
		SIDE_SKIRT_RIGHT_ALIEN_URANUS(1090, "wg_l_a_u", VehicleComponentSlot.SIDE_SKIRT, "Right Alien Sideskirt (Uranus)", new int[] {558}),
		ROOF_X_FLOW_URANUS(1091, "rf_c_u", VehicleComponentSlot.ROOF, "X-Flow (Uranus)", new int[] {558}),
		EXHAUST_ALIEN_URANUS(1092, "exh_a_u", VehicleComponentSlot.EXHAUST, "Alien (Uranus)", new int[] {558}),
		SIDE_SKIRT_RIGHT_X_FLOW_1_URANUS(1093, "wg_l_c_u", VehicleComponentSlot.SIDE_SKIRT, "Right X-Flow Sideskirt (Uranus)", new int[] {558}),
		BULLBARS_CHROME_GRILL(1100, "misc_c_lr_rem1", VehicleComponentSlot.FRONT_BUMPER, "Chrome Grill (Remington)", new int[] {534}),
		ROOF_COVERTIBLE_BLADE(1103, "rf_lr_bl2", VehicleComponentSlot.ROOF, "Covertible (Blade)", new int[] {536}),
		EXHAUST_CHROME_BLADE(1104, "exh_lr_bl1", VehicleComponentSlot.EXHAUST, "Chrome (Blade)", new int[] {536}),
		EXHAUST_SLAMIN_BLADE(1105, "exh_lr_bl2", VehicleComponentSlot.EXHAUST, "Slamin (Blade)", new int[] {536}),
		SIDE_SKIRT_RIGHT_CHROME_ARCHES_REMINGTON(1106, "wg_l_lr_rem2", VehicleComponentSlot.SIDE_SKIRT, "Right `Chrome Arches` (Remington)", new int[] {534}),
		SIDE_SKIRT_RIGHT_CHROME_STRIP_BLADE(1108, "wg_l_lr_bl1", VehicleComponentSlot.SIDE_SKIRT, "Right `Chrome Strip` Sideskirt (Blade)", new int[] {536}),
		REAR_BULLBARS_CHROME_SLAMVAN(1109, "bbb_lr_slv1", VehicleComponentSlot.REAR_BUMPER, "Chrome (Slamvan)", new int[] {535}),
		REAR_BULLBARS_SLAMIN_SLAMVAN(1110, "bbb_lr_slv2", VehicleComponentSlot.REAR_BUMPER, "Slamin (Slamvan)", new int[] {535}),
		EXHAUST_CHROME_SLAMVAN(1113, "exh_lr_slv1", VehicleComponentSlot.EXHAUST, "Chrome (Slamvan)", new int[] {535}),
		EXHAUST_SLAMIN_SLAMVAN(1114, "exh_lr_slv2", VehicleComponentSlot.EXHAUST, "Slamin (Slamvan)", new int[] {535}),
		FRONT_BULLBARS_CHROME_SLAMVAN(1115, "fbb_lr_slv1", VehicleComponentSlot.FRONT_BUMPER, "Chrome (Slamvan)", new int[] {535}),
		FRONT_BULLBARS_SLAMIN_SLAMVAN(1116, "fbb_lr_slv2", VehicleComponentSlot.FRONT_BUMPER, "Slamin (Slamvan)", new int[] {535}),
		FRONT_BUMPER_CHROME_SLAMVAN(1117, "fbmp_lr_slv1", VehicleComponentSlot.FRONT_BUMPER, "Chrome (Slamvan)", new int[] {535}),
		SIDE_SKIRT_RIGHT_CHROME_TRIM_SLAMVAN(1118, "wg_l_lr_slv1", VehicleComponentSlot.SIDE_SKIRT, "Right `Chrome Trim` Sideskirt (Slamvan)", new int[] {535}),
		SIDE_SKIRT_RIGHT_WHEELCOVERS_SLAMVAN(1119, "wg_l_lr_slv2", VehicleComponentSlot.SIDE_SKIRT, "Right `Wheelcovers` Sideskirt (Slamvan)", new int[] {535}),
		SIDE_SKIRT_RIGHT_CHROME_FLAMES_REMINGTON(1122, "wg_l_lr_rem1", VehicleComponentSlot.SIDE_SKIRT, "Right `Chrome Flames` Sideskirt (Remington)", new int[] {534}),
		BULLBARS_CHROME_BARS_REMINGTON(1123, "misc_c_lr_rem2", VehicleComponentSlot.FRONT_BUMPER, "Bullbar Chrome Bars (Remington)", new int[] {534}),
		BULLBARS_CHROME_LIGHTS_REMINGTON(1125, "misc_c_lr_rem3", VehicleComponentSlot.FRONT_BUMPER, "Bullbar Chrome Lights (Remington)", new int[] {534}),
		EXHAUST_CHROME_EXHAUST_REMINGTON(1126, "exh_lr_rem1", VehicleComponentSlot.EXHAUST, "Chrome Exhaust (Remington)", new int[] {534}),
		EXHAUST_SLAMIN_EXHAUST_REMINGTON(1127, "exh_lr_rem2", VehicleComponentSlot.EXHAUST, "Slamin Exhaust (Remington)", new int[] {534}),
		ROOF_VINYL_HARDTOP_BLADE(1128, "rf_lr_bl1", VehicleComponentSlot.ROOF, "Vinyl Hardtop (Blade)", new int[] {536}),
		EXHAUST_CHROME_SAVANNA(1129, "exh_lr_sv1", VehicleComponentSlot.EXHAUST, "Chrome (Savanna)", new int[] {567}),
		ROOF_HARDTOP_SAVANNA(1130, "rf_lr_sv1", VehicleComponentSlot.ROOF, "Hardtop (Savanna)", new int[] {567}),
		ROOF_SOFTTOP_SAVANNA(1131, "rf_lr_sv2", VehicleComponentSlot.ROOF, "Softtop (Savanna)", new int[] {567}),
		EXHAUST_SLAMIN_SAVANNA(1132, "exh_lr_sv2", VehicleComponentSlot.EXHAUST, "Slamin (Savanna)", new int[] {567}),
		SIDE_SKIRT_RIGHT_CHROME_STRIP_SAVANNA(1133, "wg_l_lr_sv", VehicleComponentSlot.SIDE_SKIRT, "Right `Chrome Strip` Sideskirt (Savanna)", new int[] {567}),
		SIDE_SKIRT_RIGHT_CHROME_STRIP_TORNADO(1134, "wg_l_lr_t1", VehicleComponentSlot.SIDE_SKIRT, "Right `Chrome Strip` Sideskirt (Tornado)", new int[] {576}),
		EXHAUST_SLAMIN_TORNADO(1135, "exh_lr_t2", VehicleComponentSlot.EXHAUST, "Slamin (Tornado)", new int[] {576}),
		EXHAUST_CHROME_TORNADO(1136, "exh_lr_t1", VehicleComponentSlot.EXHAUST, "Chrome (Tornado)", new int[] {576}),
		SPOILER_ALIEN_SULTAN(1138, "spl_a_s_b", VehicleComponentSlot.SPOILER, "Alien (Sultan)", new int[] {560}),
		SPOILER_X_FLOW_SULTAN(1139, "spl_c_s_b", VehicleComponentSlot.SPOILER, "X-Flow (Sultan)", new int[] {560}),
		REAR_BUMPER_X_FLOW_SULTAN(1140, "rbmp_c_s", VehicleComponentSlot.REAR_BUMPER, "X-Flow (Sultan)", new int[] {560}),
		REAR_BUMPER_ALIEN_SULTAN(1141, "rbmp_a_s", VehicleComponentSlot.REAR_BUMPER, "Alien (Sultan)", new int[] {560}),
		VENT_RIGHT_OVAL_VENTS(1143, "bntl_b_ov", VehicleComponentSlot.VENT_RIGHT, "Right Oval Vents", new int[] {496, 401, 518, 585, 546, 517, 603, 547, 439, 550, 549, 540, 491}),
		VENT_RIGHT_SQUARE_VENTS(1145, "bntl_b_sq", VehicleComponentSlot.VENT_RIGHT, "Right Square Vents", new int[] {401, 518, 542, 589, 585, 546, 517, 603, 439, 550, 549, 540, 491}),
		SPOILER_X_FLOW_ELEGY(1146, "spl_c_l_b", VehicleComponentSlot.SPOILER, "X-Flow (Elegy)", new int[] {562}),
		SPOILER_ALIEN_ELEGY(1147, "spl_a_l_b", VehicleComponentSlot.SPOILER, "Alien (Elegy)", new int[] {562}),
		REAR_BUMPER_X_FLOW_ELEGY(1148, "rbmp_c_l", VehicleComponentSlot.REAR_BUMPER, "X-Flow (Elegy)", new int[] {562}),
		REAR_BUMPER_ALIEN_ELEGY(1149, "rbmp_a_l", VehicleComponentSlot.REAR_BUMPER, "Alien (Elegy)", new int[] {562}),
		REAR_BUMPER_ALIEN_FLASH(1150, "rbmp_a_f", VehicleComponentSlot.REAR_BUMPER, "Alien (Flash)", new int[] {565}),
		REAR_BUMPER_X_FLOW_FLASH(1151, "rbmp_c_f", VehicleComponentSlot.REAR_BUMPER, "X-Flow (Flash)", new int[] {565}),
		FRONT_BUMPER_X_FLOW_FLASH(1152, "fbmp_c_f", VehicleComponentSlot.FRONT_BUMPER, "X-Flow (Flash)", new int[] {565}),
		FRONT_BUMPER_ALIEN_FLASH(1153, "fbmp_a_f", VehicleComponentSlot.FRONT_BUMPER, "Alien (Flash)", new int[] {565}),
		REAR_BUMPER_ALIEN_STRATUM(1154, "rbmp_a_st", VehicleComponentSlot.REAR_BUMPER, "Alien (Stratum)", new int[] {561}),
		FRONT_BUMPER_ALIEN_STRATUM(1155, "fbmp_a_st", VehicleComponentSlot.FRONT_BUMPER, "Alien (Stratum)", new int[] {561}),
		REAR_BUMPER_X_FLOW_STRATUM(1156, "rbmp_c_st", VehicleComponentSlot.REAR_BUMPER, "X-Flow (Stratum)", new int[] {561}),
		FRONT_BUMPER_X_FLOW_STRATUM(1157, "fbmp_c_st", VehicleComponentSlot.FRONT_BUMPER, "X-Flow (Stratum)", new int[] {561}),
		SPOILER_X_FLOW_JESTER(1158, "spl_c_j_b", VehicleComponentSlot.SPOILER, "X-Flow (Jester)", new int[] {559}),
		REAR_BUMPER_ALIEN_JESTER(1159, "rbmp_a_j", VehicleComponentSlot.REAR_BUMPER, "Alien (Jester)", new int[] {559}),
		FRONT_BUMPER_ALIEN_JESTER(1160, "fbmp_a_j", VehicleComponentSlot.FRONT_BUMPER, "Alien (Jester)", new int[] {559}),
		REAR_BUMPER_X_FLOW_JESTER(1161, "rbmp_c_j", VehicleComponentSlot.REAR_BUMPER, "X-Flow (Jester)", new int[] {559}),
		SPOILER_ALIEN_JESTER(1162, "spl_a_j_b", VehicleComponentSlot.SPOILER, "Alien (Jester)", new int[] {559}),
		SPOILER_X_FLOW_URANUS(1163, "spl_c_u_b", VehicleComponentSlot.SPOILER, "X-Flow (Uranus)", new int[] {558}),
		SPOILER_ALIEN_URANUS(1164, "spl_a_u_b", VehicleComponentSlot.SPOILER, "Alien (Uranus)", new int[] {558}),
		FRONT_BUMPER_X_FLOW_URANUS(1165, "fbmp_c_u", VehicleComponentSlot.FRONT_BUMPER, "X-Flow (Uranus)", new int[] {558}),
		FRONT_BUMPER_ALIEN_URANUS(1166, "fbmp_a_u", VehicleComponentSlot.FRONT_BUMPER, "Alien (Uranus)", new int[] {558}),
		REAR_BUMPER_X_FLOW_URANUS(1167, "rbmp_c_u", VehicleComponentSlot.REAR_BUMPER, "X-Flow (Uranus)", new int[] {558}),
		REAR_BUMPER_ALIEN_URANUS(1168, "rbmp_a_u", VehicleComponentSlot.REAR_BUMPER, "Alien (Uranus)", new int[] {558}),
		FRONT_BUMPER_ALIEN_SULTAN(1169, "fbmp_a_s", VehicleComponentSlot.FRONT_BUMPER, "Alien (Sultan)", new int[] {560}),
		FRONT_BUMPER_X_FLOW_SULTAN(1170, "fbmp_c_s", VehicleComponentSlot.FRONT_BUMPER, "X-Flow (Sultan)", new int[] {560}),
		FRONT_BUMPER_ALIEN_ELEGY(1171, "fbmp_a_l", VehicleComponentSlot.FRONT_BUMPER, "Alien (Elegy)", new int[] {562}),
		FRONT_BUMPER_X_FLOW_ELEGY(1172, "fbmp_c_l", VehicleComponentSlot.FRONT_BUMPER, "X-Flow (Elegy)", new int[] {562}),
		FRONT_BUMPER_X_FLOW_JESTER(1173, "fbmp_c_j", VehicleComponentSlot.FRONT_BUMPER, "X-Flow (Jester)", new int[] {559}),
		FRONT_BUMPER_CHROME_BROADWAY(1174, "fbmp_lr_br1", VehicleComponentSlot.FRONT_BUMPER, "Chrome (Broadway)", new int[] {575}),
		FRONT_BUMPER_SLAMIN_BROADWAY(1175, "fbmp_lr_br2", VehicleComponentSlot.FRONT_BUMPER, "Slamin (Broadway)", new int[] {575}),
		REAR_BUMPER_CHROME_BROADWAY(1176, "rbmp_lr_br1", VehicleComponentSlot.REAR_BUMPER, "Chrome (Broadway)", new int[] {575}),
		REAR_BUMPER_SLAMIN_BROADWAY(1177, "rbmp_lr_br2", VehicleComponentSlot.REAR_BUMPER, "Slamin (Broadway)", new int[] {575}),
		REAR_BUMPER_SLAMIN_REMINGTON(1178, "rbmp_lr_rem2", VehicleComponentSlot.REAR_BUMPER, "Slamin (Remington)", new int[] {534}),
		FRONT_BUMPER_CHROME_REMINGTON(1179, "fbmp_lr_rem1", VehicleComponentSlot.FRONT_BUMPER, "Chrome (Remington)", new int[] {534}),
		REAR_BUMPER_CHROME_REMINGTON(1180, "rbmp_lr_rem1", VehicleComponentSlot.REAR_BUMPER, "Chrome (Remington)", new int[] {534}),
		FRONT_BUMPER_SLAMIN_BLADE(1181, "fbmp_lr_bl2", VehicleComponentSlot.FRONT_BUMPER, "Slamin (Blade)", new int[] {536}),
		FRONT_BUMPER_CHROME_BLADE(1182, "fbmp_lr_bl1", VehicleComponentSlot.FRONT_BUMPER, "Chrome (Blade)", new int[] {536}),
		REAR_BUMPER_SLAMIN_BLADE(1183, "rbmp_lr_bl2", VehicleComponentSlot.REAR_BUMPER, "Slamin (Blade)", new int[] {536}),
		REAR_BUMPER_CHROME_BLADE(1184, "rbmp_lr_bl1", VehicleComponentSlot.REAR_BUMPER, "Chrome (Blade)", new int[] {536}),
		FRONT_BUMPER_SLAMIN_REMINGTON(1185, "fbmp_lr_rem2", VehicleComponentSlot.FRONT_BUMPER, "Slamin (Remington)", new int[] {534}),
		REAR_BUMPER_SLAMIN_SAVANNA(1186, "rbmp_lr_sv2", VehicleComponentSlot.REAR_BUMPER, "Slamin (Savanna)", new int[] {567}),
		REAR_BUMPER_CHROME_SAVANNA(1187, "rbmp_lr_sv1", VehicleComponentSlot.REAR_BUMPER, "Chrome (Savanna)", new int[] {567}),
		FRONT_BUMPER_SLAMIN_SAVANNA(1188, "fbmp_lr_sv2", VehicleComponentSlot.FRONT_BUMPER, "Slamin (Savanna)", new int[] {567}),
		FRONT_BUMPER_CHROME_SAVANNA(1189, "fbmp_lr_sv1", VehicleComponentSlot.FRONT_BUMPER, "Chrome (Savanna)", new int[] {567}),
		FRONT_BUMPER_SLAMIN_TORNADO(1190, "fbmp_lr_t2", VehicleComponentSlot.FRONT_BUMPER, "Slamin (Tornado)", new int[] {576}),
		FRONT_BUMPER_CHROME_TORNADO(1191, "fbmp_lr_t1", VehicleComponentSlot.FRONT_BUMPER, "Chrome (Tornado)", new int[] {576}),
		REAR_BUMPER_CHROME_TORNADO(1192, "rbmp_lr_t1", VehicleComponentSlot.REAR_BUMPER, "Chrome (Tornado)", new int[] {576}),
		REAR_BUMPER_SLAMIN_TORNADO(1193, "rbmp_lr_t2", VehicleComponentSlot.REAR_BUMPER, "Slamin (Tornado)", new int[] {576});	
		
		
		private static final Map<Integer, VehicleComponentModelData> VALUES = new HashMap<>();
		private static VehicleComponentModelData get(int value)
		{
			return VALUES.get(value);
		}
		
		private static Set<Integer> getIds()
		{
			return Collections.unmodifiableSet(VALUES.keySet());
		}
		
		private static Set<Integer> getIds(VehicleComponentSlot slot)
		{
			Set<Integer> set = new HashSet<>();
			for (VehicleComponentModelData data : values()) if (data.slot == slot) set.add(data.id);
			return Collections.unmodifiableSet(set);
		}
		
		static
		{
			for(VehicleComponentModelData val : values()) VALUES.put(val.id, val);
		}
		
		
		private final int id;
		private final String modelName;
		private final VehicleComponentSlot slot;
		private final String name;
		private final Set<Integer> supportedVehicleModelIds;
		
		private VehicleComponentModelData(int id, String modelName, VehicleComponentSlot slot, String name, int[] supportedVehicleIds)
		{
			this.id = id;
			this.modelName = modelName;
			this.slot = slot;
			this.name = name;
			
			Set<Integer> vehicleModelIdSet = new HashSet<>();
			for (int vid : supportedVehicleIds) vehicleModelIdSet.add(vid);
			this.supportedVehicleModelIds = Collections.unmodifiableSet(vehicleModelIdSet);
		}
	}
	

	private static Map<Integer, Set<Integer>> VEHICLE_SUPPORTED_COMPONENTS = new HashMap<>();
	static
	{
		Map<Integer, Set<Integer>> map = new HashMap<>();
		for (VehicleComponentModelData data : VehicleComponentModelData.values())
		{
			for (int vid : data.supportedVehicleModelIds)
			{
				Set<Integer> components = map.get(vid);
				if (components == null)
				{
					components = new HashSet<>();
					map.put(vid, components);
				}
				
				components.add(data.id);
			}
		}
		
		for (Entry<Integer, Set<Integer>> entry : map.entrySet())
		{
			entry.setValue(Collections.unmodifiableSet(entry.getValue()));
		}
		
		VEHICLE_SUPPORTED_COMPONENTS = Collections.unmodifiableMap(map);
	}
	
	private static Map<Integer, Set<VehicleComponentSlot>> VEHICLE_SUPPORTED_COMPONENT_SLOTS = new HashMap<>();
	static
	{
		Map<Integer, Set<VehicleComponentSlot>> map = new HashMap<>();
		for (VehicleComponentModelData data : VehicleComponentModelData.values())
		{
			for (int vid : data.supportedVehicleModelIds)
			{
				Set<VehicleComponentSlot> slots = map.get(vid);
				if (slots == null)
				{
					slots = new TreeSet<>();
					map.put(vid, slots);
				}
				
				slots.add(data.slot);
			}
		}
		
		for (Entry<Integer, Set<VehicleComponentSlot>> entry : map.entrySet())
		{
			entry.setValue(Collections.unmodifiableSet(entry.getValue()));
		}
		
		VEHICLE_SUPPORTED_COMPONENT_SLOTS = Collections.unmodifiableMap(map);
	}
	
	
	private VehicleComponentModel()
	{
		
	}

	public static boolean isVaildId(int id)
	{
		return VehicleComponentModelData.get(id) != null;
	}

	public static String getModelName(int id)
	{
		VehicleComponentModelData data = VehicleComponentModelData.get(id);
		if (data == null) return null;
		return data.modelName;
	}
	
	public static String getName(int id)
	{
		if (id == 0) return "None";
		VehicleComponentModelData data = VehicleComponentModelData.get(id);
		return data != null ? data.name : "Unknown";
	}
	
	public static String getConstantName(int id)
	{
		VehicleComponentModelData data = VehicleComponentModelData.get(id);
		return data != null ? data.name() : "UNKNOWN";
	}
	
	public static VehicleComponentSlot getSlot(int id)
	{
		VehicleComponentModelData data = VehicleComponentModelData.get(id);
		return data != null ? data.slot : null;
	}

	public static Set<Integer> getIds()
	{
		return VehicleComponentModelData.getIds();
	}

	public static Set<Integer> getIds(VehicleComponentSlot slot)
	{
		return VehicleComponentModelData.getIds(slot);
	}

	public static Set<Integer> getVehicleSupportedComponments(int vid)
	{
		Set<Integer> set = VEHICLE_SUPPORTED_COMPONENTS.get(vid);
		if (set == null) set = Collections.emptySet();
		return set;
	}
	
	public static Set<Integer> getSlotSupportedComponents(int vid, VehicleComponentSlot slot)
	{
		Set<Integer> set = VEHICLE_SUPPORTED_COMPONENTS.get(vid);
		if (set == null) set = Collections.emptySet();
		
		Set<Integer> ret = new TreeSet<>();
		for (int cid : set) if (getSlot(cid) == slot) ret.add(cid);
		
		return ret;
	}
	
	public static Set<VehicleComponentSlot> getVehicleSupportedSlots(int vid)
	{
		Set<VehicleComponentSlot> slots = VEHICLE_SUPPORTED_COMPONENT_SLOTS.get(vid);
		if (slots == null) slots = Collections.emptySet();
		return slots;
	}
	
	public static boolean isVehicleSupportAnyComponment(int vid)
	{
		return VEHICLE_SUPPORTED_COMPONENTS.get(vid) != null;
	}
	
	public static boolean isVehicleSupported(int vid, int cid)
	{
		Set<Integer> set = VEHICLE_SUPPORTED_COMPONENTS.get(vid);
		if (set == null) set = Collections.emptySet();
		return set.contains(cid);
	}
	
	public static Set<Integer> getComponentSupportedVehicles(int cid)
	{
		VehicleComponentModelData data = VehicleComponentModelData.get(cid);
		Set<Integer> set = Collections.emptySet();
		if (data != null) set = data.supportedVehicleModelIds;
		return set;
	}
	
	
	public static final int SPOILER_PRO =								1000;
	public static final int SPOILER_WIN =								1001;
	public static final int SPOILER_DRAG =								1002;
	public static final int SPOILER_ALPHA =								1003;
	public static final int HOOD_CHAMP_SCOOP =							1004;
	public static final int HOOD_FURY_SCOOP =							1005;
	public static final int ROOF_SCOOP =								1006;
	public static final int SIDE_SKIRT_RIGHT =							1007;
	public static final int NITRO_5_TIMES =								1008;
	public static final int NITRO_2_TIMES =								1009;
	public static final int NITRO_10_TIMES =							1010;
	public static final int HOOD_RACE_SCOOP =							1011;
	public static final int HOOD_WORX_SCOOP =							1012;
	public static final int LAMPS_ROUND_FOG =							1013;
	public static final int SPOILER_CHAMP =								1014;
	public static final int SPOILER_RACE =								1015;
	public static final int SPOILER_WORK =								1016;
	public static final int SIDE_SKIRT_LEFT =							1017;
	public static final int EXHAUST_UPSWEPT =							1018;
	public static final int EXHAUST_TWIN =								1019;
	public static final int EXHAUST_LARGE =								1020;
	public static final int EXHAUST_MEDIUM =							1021;
	public static final int EXHAUST_SMALL =								1022;
	public static final int SPOILER_FURY =								1023;
	public static final int LAMPS_SQUARE_FOG =							1024;
	public static final int WHEELS_OFFROAD =							1025;
	public static final int SIDE_SKIRT_RIGHT_ALIEN_SULTAN =				1026;
	public static final int SIDE_SKIRT_LEFT_ALIEN_SULTAN =				1027;
	public static final int EXHAUST_ALIEN_SULTAN =						1028;
	public static final int EXHAUST_X_FLOW_SULTAN =						1029;
	public static final int SIDE_SKIRT_LEFT_X_FLOW_SULTAN =				1030;
	public static final int SIDE_SKIRT_RIGHT_X_FLOW_SULTAN =			1031;
	public static final int ROOF_ALIEN_ROOF_VENT_SULTAN =				1032;
	public static final int ROOF_X_FLOW_ROOF_VENT_SULTAN =				1033;
	public static final int EXHAUST_ALIEN_ELEGY =						1034;
	public static final int ROOF_X_FLOW_ROOF_VENT_ELEGY =				1035;
	public static final int SIDE_SKIRT_RIGHT_ALIEN_ELEGY =				1036;
	public static final int EXHAUST_X_FLOW_ELEGY =						1037;
	public static final int ROOF_ALIEN_ROOF_VENT_ELEGY =				1038;
	public static final int SIDE_SKIRT_LEFT_X_FLOW_ELEGY =				1039;
	public static final int SIDE_SKIRT_LEFT_ALIEN_ELEGY =				1040;
	public static final int SIDE_SKIRT_RIGHT_X_FLOW_ELEGY =				1041;
	public static final int SIDE_SKIRT_RIGHT_CHROME_BROADWAY =			1042;
	public static final int EXHAUST_SLAMIN_BROADWAY =					1043;
	public static final int EXHAUST_CHROME_BROADWAY =					1044;
	public static final int EXHAUST_X_FLOW_FLASH =						1045;
	public static final int EXHAUST_ALIEN_FLASH =						1046;
	public static final int SIDE_SKIRT_RIGHT_ALIEN_FLASH =				1047;
	public static final int SIDE_SKIRT_RIGHT_X_FLOW_FLASH =				1048;
	public static final int SPOILER_ALIEN_FLASH =						1049;
	public static final int SPOILER_X_FLOW_FLASH =						1050;
	public static final int SIDE_SKIRT_LEFT_ALIEN_FLASH =				1051;
	public static final int SIDE_SKIRT_LEFT_X_FLOW_FLASH =				1052;
	public static final int ROOF_X_FLOW_FLASH =							1053;
	public static final int ROOF_ALIEN_FLASH =							1054;
	public static final int ROOF_ALIEN_STRATUM =						1055;
	public static final int SIDE_SKIRT_RIGHT_ALIEN_STRATUM =			1056;
	public static final int SIDE_SKIRT_X_FLOW_STRATUM =					1057;
	public static final int SPOILER_ALIEN_STRATUM =						1058;
	public static final int EXHAUST_X_FLOW_STRATUM =					1059;
	public static final int SPOILER_X_FLOW_STRATUM =					1060;
	public static final int ROOF_X_FLOW_STRATUM =						1061;
	public static final int SIDE_SKIRT_LEFT_ALIEN_STRATUM =				1062;
	public static final int SIDE_SKIRT_LEFT_X_FLOW_STRATUM =			1063;
	public static final int EXHAUST_ALIEN_STRATUM =						1064;
	public static final int EXHAUST_ALIEN_JESTER =						1065;
	public static final int EXHAUST_X_FLOW_JESTER =						1066;
	public static final int ROOF_ALIEN_JESTER =							1067;
	public static final int ROOF_X_FLOW_JESTER =						1068;
	public static final int SIDE_SKIRT_RIGHT_ALIEN_JESTER =				1069;
	public static final int SIDE_SKIRT_RIGHT_X_FLOW_JESTER =			1070;
	public static final int SIDE_SKIRT_LEFT_ALIEN_JESTER =				1071;
	public static final int SIDE_SKIRT_LEFT_X_FLOW_JESTER =				1072;
	public static final int WHEELS_SHADOW =								1073;
	public static final int WHEELS_MEGA =								1074;
	public static final int WHEELS_RIMSHINE =							1075;
	public static final int WHEELS_WIRES =								1076;
	public static final int WHEELS_CLASSIC =							1077;
	public static final int WHEELS_TWIST =								1078;
	public static final int WHEELS_CUTTER =								1079;
	public static final int WHEELS_SWITCH =								1080;
	public static final int WHEELS_GROVE =								1081;
	public static final int WHEELS_IMPORT =								1082;
	public static final int WHEELS_DOLLAR =								1083;
	public static final int WHEELS_TRANCE =								1084;
	public static final int WHEELS_ATOMIC =								1085;
	public static final int STEREO =									1086;
	public static final int HYDRAULICS =								1087;
	public static final int ROOF_ALIEN =								1088;
	public static final int EXHAUST_X_FLOW_URANUS =						1089;
	public static final int SIDE_SKIRT_RIGHT_ALIEN_URANUS =				1090;
	public static final int ROOF_X_FLOW_URANUS =						1091;
	public static final int EXHAUST_ALIEN_URANUS =						1092;
	public static final int SIDE_SKIRT_RIGHT_X_FLOW_1_URANUS =			1093;
	public static final int SIDE_SKIRT_LEFT_ALIEN_URANUS =				1094;
	public static final int SIDE_SKIRT_RIGHT_X_FLOW_2_URANUS =			1095;
	public static final int WHEELS_AHAB =								1096;
	public static final int WHEELS_VIRTUAL =							1097;
	public static final int WHEELS_ACCESS =								1098;
	public static final int SIDE_SKIRT_LEFT_CHROME_BROADWAY =			1099;
	public static final int BULLBARS_CHROME_GRILL =						1100;
	public static final int SIDE_SKIRT_LEFT_CHROME_FLAMES_REMINGTON =	1101;
	public static final int SIDE_SKIRT_LEFT_STRIP_SAVANNA =				1102;
	public static final int ROOF_COVERTIBLE_BLADE =						1103;
	public static final int EXHAUST_CHROME_BLADE =						1104;
	public static final int EXHAUST_SLAMIN_BLADE =						1105;
	public static final int SIDE_SKIRT_RIGHT_CHROME_ARCHES_REMINGTON =	1106;
	public static final int SIDE_SKIRT_LEFT_CHROME_STRIP_BLADE =		1107;
	public static final int SIDE_SKIRT_RIGHT_CHROME_STRIP_BLADE =		1108;
	public static final int REAR_BULLBARS_CHROME_SLAMVAN =				1109;
	public static final int REAR_BULLBARS_SLAMIN_SLAMVAN =				1110;
	public static final int FRNT_SIGN_LITTLE_SIGN_1_SLAMVAN =			1111;
	public static final int FRNT_SIGN_LITTLE_SIGN_2_SLAMVAN =			1112;
	public static final int EXHAUST_CHROME_SLAMVAN =					1113;
	public static final int EXHAUST_SLAMIN_SLAMVAN =					1114;
	public static final int FRONT_BULLBARS_CHROME_SLAMVAN =				1115;
	public static final int FRONT_BULLBARS_SLAMIN_SLAMVAN =				1116;
	public static final int FRONT_BUMPER_CHROME_SLAMVAN =				1117;
	public static final int SIDE_SKIRT_RIGHT_CHROME_TRIM_SLAMVAN =		1118;
	public static final int SIDE_SKIRT_RIGHT_WHEELCOVERS_SLAMVAN =		1119;
	public static final int SIDE_SKIRT_LEFT_CHROME_TRIM_SLAMVAN =		1120;
	public static final int SIDE_SKIRT_LEFT_WHEELCOVERS_SLAMVAN =		1121;
	public static final int SIDE_SKIRT_RIGHT_CHROME_FLAMES_REMINGTON =	1122;
	public static final int BULLBARS_CHROME_BARS_REMINGTON =			1123;
	public static final int SIDE_SKIRT_LEFT_CHROME_ARCHES_REMINGTON =	1124;
	public static final int BULLBARS_CHROME_LIGHTS_REMINGTON =			1125;
	public static final int EXHAUST_CHROME_EXHAUST_REMINGTON =			1126;
	public static final int EXHAUST_SLAMIN_EXHAUST_REMINGTON =			1127;
	public static final int ROOF_VINYL_HARDTOP_BLADE =					1128;
	public static final int EXHAUST_CHROME_SAVANNA =					1129;
	public static final int ROOF_HARDTOP_SAVANNA =						1130;
	public static final int ROOF_SOFTTOP_SAVANNA =						1131;
	public static final int EXHAUST_SLAMIN_SAVANNA =					1132;
	public static final int SIDE_SKIRT_RIGHT_CHROME_STRIP_SAVANNA =		1133;
	public static final int SIDE_SKIRT_RIGHT_CHROME_STRIP_TORNADO =		1134;
	public static final int EXHAUST_SLAMIN_TORNADO =					1135;
	public static final int EXHAUST_CHROME_TORNADO =					1136;
	public static final int SIDE_SKIRT_LEFT_CHROME_STRIP =				1137;
	public static final int SPOILER_ALIEN_SULTAN =						1138;
	public static final int SPOILER_X_FLOW_SULTAN =						1139;
	public static final int REAR_BUMPER_X_FLOW_SULTAN =					1140;
	public static final int REAR_BUMPER_ALIEN_SULTAN =					1141;
	public static final int VENT_LEFT_OVAL_VENTS =						1142;
	public static final int VENT_RIGHT_OVAL_VENTS =						1143;
	public static final int VENT_LEFT_SQUARE_VENTS =					1144;
	public static final int VENT_RIGHT_SQUARE_VENTS =					1145;
	public static final int SPOILER_X_FLOW_ELEGY =						1146;
	public static final int SPOILER_ALIEN_ELEGY =						1147;
	public static final int REAR_BUMPER_X_FLOW_ELEGY =					1148;
	public static final int REAR_BUMPER_ALIEN_ELEGY =					1149;
	public static final int REAR_BUMPER_ALIEN_FLASH =					1150;
	public static final int REAR_BUMPER_X_FLOW_FLASH =					1151;
	public static final int FRONT_BUMPER_X_FLOW_FLASH =					1152;
	public static final int FRONT_BUMPER_ALIEN_FLASH =					1153;
	public static final int REAR_BUMPER_ALIEN_STRATUM =					1154;
	public static final int FRONT_BUMPER_ALIEN_STRATUM =				1155;
	public static final int REAR_BUMPER_X_FLOW_STRATUM =				1156;
	public static final int FRONT_BUMPER_X_FLOW_STRATUM =				1157;
	public static final int SPOILER_X_FLOW_JESTER =						1158;
	public static final int REAR_BUMPER_ALIEN_JESTER =					1159;
	public static final int FRONT_BUMPER_ALIEN_JESTER =					1160;
	public static final int REAR_BUMPER_X_FLOW_JESTER =					1161;
	public static final int SPOILER_ALIEN_JESTER =						1162;
	public static final int SPOILER_X_FLOW_URANUS =						1163;
	public static final int SPOILER_ALIEN_URANUS =						1164;
	public static final int FRONT_BUMPER_X_FLOW_URANUS =				1165;
	public static final int FRONT_BUMPER_ALIEN_URANUS =					1166;
	public static final int REAR_BUMPER_X_FLOW_URANUS =					1167;
	public static final int REAR_BUMPER_ALIEN_URANUS =					1168;
	public static final int FRONT_BUMPER_ALIEN_SULTAN =					1169;
	public static final int FRONT_BUMPER_X_FLOW_SULTAN =				1170;
	public static final int FRONT_BUMPER_ALIEN_ELEGY =					1171;
	public static final int FRONT_BUMPER_X_FLOW_ELEGY =					1172;
	public static final int FRONT_BUMPER_X_FLOW_JESTER =				1173;
	public static final int FRONT_BUMPER_CHROME_BROADWAY =				1174;
	public static final int FRONT_BUMPER_SLAMIN_BROADWAY =				1175;
	public static final int REAR_BUMPER_CHROME_BROADWAY =				1176;
	public static final int REAR_BUMPER_SLAMIN_BROADWAY =				1177;
	public static final int REAR_BUMPER_SLAMIN_REMINGTON =				1178;
	public static final int FRONT_BUMPER_CHROME_REMINGTON =				1179;
	public static final int REAR_BUMPER_CHROME_REMINGTON =				1180;
	public static final int FRONT_BUMPER_SLAMIN_BLADE =					1181;
	public static final int FRONT_BUMPER_CHROME_BLADE =					1182;
	public static final int REAR_BUMPER_SLAMIN_BLADE =					1183;
	public static final int REAR_BUMPER_CHROME_BLADE =					1184;
	public static final int FRONT_BUMPER_SLAMIN_REMINGTON =				1185;
	public static final int REAR_BUMPER_SLAMIN_SAVANNA =				1186;
	public static final int REAR_BUMPER_CHROME_SAVANNA =				1187;
	public static final int FRONT_BUMPER_SLAMIN_SAVANNA =				1188;
	public static final int FRONT_BUMPER_CHROME_SAVANNA =				1189;
	public static final int FRONT_BUMPER_SLAMIN_TORNADO =				1190;
	public static final int FRONT_BUMPER_CHROME_TORNADO =				1191;
	public static final int REAR_BUMPER_CHROME_TORNADO =				1192;
	public static final int REAR_BUMPER_SLAMIN_TORNADO =				1193;
}

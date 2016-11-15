package net.gtaun.shoebill.constant

/**
 * This enum contains all existing PickupModels from GTA: San Andreas.
 * This information was taken from [http://weedarr.wikidot.com/pickups]
 *
 * @author Julian Suhl (Spikes)
 * @author Marvin Haschker
 */
enum class PickupModel constructor(val id: Int) {
    BRIEFCASE(1210),
    MONEY(1212),
    INFORMATION(1239),
    HEART(1240),
    ADRENALINEPILL(1241),
    ARMOR(1242),
    BRIBE(1247),
    GTA3LOGO(1248),
    GREYBOMB(1252),
    PHOTOOP(1253),
    RAMPAGE(1254),
    TWOPLAYERRAMPAGE(1313),
    BLUEHOUSE(1272),
    GREENHOUSE(1273),
    DOLLAR(1274),
    BLUETSHIRT(1275),
    TIKI(1276),
    SAVEDISK(1277),
    DRUGBUNDLE(1279),
    SKULLSICON(1313),
    PLAYER(1314),
    CORONA(1316),
    CHECKPOINT(1317),
    WHITEARROW(1318),
    INTERIORDIAMOND(1559),
    PIZZABOX(1582),
    MADDDOGGRHYMEBOOK(2894),
    REGULARDILDO(321),
    WHITEDILDO(322),
    VIBRATOR(323),
    ANOTHERVIBRATOR(324),
    FLOWERS(325),
    CANE(326),
    CJPHONE(330),
    BRASSKNUCKLES(331),
    GOLFCLUB(333),
    POLICETRUNGEON(334),
    COMBATKNIFE(335),
    BASEBALLBAT(336),
    SHOVEL(337),
    POOLCUE(338),
    KATANA(339),
    CHAINSAW(341),
    FRAGGRENADE(342),
    TEARGASGRENADE(343),
    MOLOTOVCOCKTAIL(344),
    COLT45PISTOL(346),
    SILENCEDCOLT45PISTOL(347),
    DESERTEAGLE(348),
    REGULARSHOTGUN(349),
    SAWNOFFSHOTGUN(350),
    SPAZ12SHOTGUN(351),
    MAC10(352),
    MP5(353),
    HYDRAFLARE(354),
    AK47ASSAULTRIFLE(355),
    M4ASSAULTRIFLE(356),
    COUNTRYRIFLE(357),
    SNIPERRIFLE(358),
    ROCKETLAUNCHER(359),
    HEATSEEKINGROCKETLAUNCHER(360),
    FLAMETHROWER(361),
    MINIGUN(362),
    SATCHELCHARGES(363),
    DETONATOR(364),
    SPRAYPAINTCAN(365),
    FIREEXTINGUISHER(366),
    CAMERA(367),
    NIGHTVISIONGOGGLES(368),
    INFRAREDGOGGLES(369),
    JETPACK(370),
    PARACHUTE(371),
    TEC9(372);

    companion object : Collectable<PickupModel>, Findable<Int, PickupModel> {
        private val VALUES = values().map { it.id to it }.toMap()

        /**
         * Gets a [PickupModel] by its id.
         */
        @JvmStatic
        override operator fun get(value: Int): PickupModel? = VALUES[value]

        /**
         * Gets all available [PickupModel]s.
         */
        @JvmStatic
        override fun get(): Collection<PickupModel> = VALUES.values
    }
}
package net.gtaun.shoebill.constant

/**
 * This enum contains the available WeaponSlots that can be changed. This information was taken from the official
 * SA:MP Wikipedia page.
 *
 * @author BigETI
 */
enum class WeaponSlot constructor(val slotId: Int, val type: String) {
    INVALID(-1, "Invalid"),
    HAND(0, "Hand"),
    MELEE(1, "Melee"),
    PISTOL(2, "Pistol"),
    SHOTGUN(3, "Shotgun"),
    MACHINE_PISTOL(4, "Machine pistol"),
    CARABINER(5, "Carabiner"),
    RIFLE(6, "Rifle"),
    HEAVY(7, "Heavy"),
    THROWABLE(8, "Throwable"),
    MISC1(9, "Misc 1"),
    MISC2(10, "Misc 2"),
    WEARABLE(11, "Wearable"),
    DETONATOR(12, "Detonator");

    companion object : Collectable<WeaponSlot>, Findable<Int, WeaponSlot> {
        private val VALUES = values().map { it.slotId to it }.toMap()

        /**
         * Gets all available [WeaponSlot]s.
         */
        @JvmStatic
        override fun get(): Collection<WeaponSlot> = VALUES.values

        /**
         * Gets a [WeaponSlot] by its id.
         */
        @JvmStatic
        override operator fun get(value: Int): WeaponSlot? = VALUES[value]

    }

}
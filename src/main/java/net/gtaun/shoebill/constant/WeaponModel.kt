/**
 * Copyright (C) 2011 MK124

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
 * This enum contains all the WeaponModels that are present in GTA: San Andreas. It contains the [id], the [slot],
 * the [modelId] and the [modelName]. This information was taken from the official SA:MP Wikipedia page.
 *
 * @author MK124
 * @author Marvin Haschker
 */
enum class WeaponModel constructor(@JvmField val id: Int,
                                   @JvmField val slot: WeaponSlot,
                                   private val modelId: Int,
                                   @JvmField val modelName: String) {
    /**
     * Unarmed
     */
    NONE(0, WeaponSlot[0]!!, 0, "Unarmed"),

    /**
     * Brass Knuckles
     */
    BRASSKNUCKLE(1, WeaponSlot[0]!!, 331, "Brass Knuckles"),

    /**
     * Golf Club
     */
    GOLFCLUB(2, WeaponSlot[1]!!, 333, "Golf Club"),

    /**
     * Nite Stick
     */
    NITESTICK(3, WeaponSlot[1]!!, 334, "Nite Stick"),

    /**
     * Knife
     */
    KNIFE(4, WeaponSlot[1]!!, 335, "Knife"),

    /**
     * Baseball Bat
     */
    BAT(5, WeaponSlot[1]!!, 336, "Baseball Bat"),

    /**
     * Shovel
     */
    SHOVEL(6, WeaponSlot[1]!!, 337, "Shovel"),

    /**
     * Pool Stick
     */
    POOLSTICK(7, WeaponSlot[1]!!, 338, "Pool Stick"),

    /**
     * Katana
     */
    KATANA(8, WeaponSlot[1]!!, 339, "Katana"),

    /**
     * Chainsaw
     */
    CHAINSAW(9, WeaponSlot[1]!!, 341, "Chainsaw"),

    /**
     * Purple Dildo
     */
    DILDO(10, WeaponSlot[10]!!, 321, "Purple Dildo"),

    /**
     * Small White Vibrator
     */
    DILDO2(11, WeaponSlot[10]!!, 322, "Small White Vibrator"),

    /**
     * Large White Vibrator
     */
    VIBRATOR(12, WeaponSlot[10]!!, 323, "Large White Vibrator"),

    /**
     * Silver Vibrator
     */
    VIBRATOR2(13, WeaponSlot[10]!!, 324, "Silver Vibrator"),

    /**
     * Flowers
     */
    FLOWER(14, WeaponSlot[10]!!, 325, "Flowers"),

    /**
     * Cane
     */
    CANE(15, WeaponSlot[10]!!, 326, "Cane"),

    /**
     * Grenade
     */
    GRENADE(16, WeaponSlot[8]!!, 342, "Grenade"),

    /**
     * Tear Gas
     */
    TEARGAS(17, WeaponSlot[8]!!, 343, "Tear Gas"),

    /**
     * Molotov Cocktail
     */
    MOLTOV(18, WeaponSlot[8]!!, 344, "Molotov Cocktail"),

    /**
     * Colt 45
     */
    COLT45(22, WeaponSlot[2]!!, 346, "Colt 45"),

    /**
     * Silenced Pistol
     */
    SILENCED_COLT45(23, WeaponSlot[2]!!, 347, "Silenced Pistol"),

    /**
     * Desert Eagle
     */
    DEAGLE(24, WeaponSlot[2]!!, 348, "Desert Eagle"),

    /**
     * Shotgun
     */
    SHOTGUN(25, WeaponSlot[3]!!, 349, "Shotgun"),

    /**
     * Sawn-off Shotgun
     */
    SAWEDOFF(26, WeaponSlot[3]!!, 350, "Sawn-off Shotgun"),

    /**
     * Combat Shotgun
     */
    SHOTGSPA(27, WeaponSlot[3]!!, 351, "Combat Shotgun"),

    /**
     * Micro UZI
     */
    UZI(28, WeaponSlot[4]!!, 352, "Micro UZI"),

    /**
     * MP5
     */
    MP5(29, WeaponSlot[4]!!, 353, "MP5"),

    /**
     * AK-47
     */
    AK47(30, WeaponSlot[5]!!, 355, "AK-47"),

    /**
     * M4
     */
    M4(31, WeaponSlot[5]!!, 356, "M4"),

    /**
     * TEC-9
     */
    TEC9(32, WeaponSlot[4]!!, 372, "TEC-9"),

    /**
     * Rifle
     */
    RIFLE(33, WeaponSlot[6]!!, 357, "Rifle"),

    /**
     * Sniper Rifle
     */
    SNIPER(34, WeaponSlot[6]!!, 358, "Sniper Rifle"),

    /**
     * Rocket Launcher
     */
    ROCKETLAUNCHER(35, WeaponSlot[7]!!, 359, "Rocket Launcher"),

    /**
     * HS Rocket Launcher
     */
    HEATSEEKER(36, WeaponSlot[7]!!, 360, "HS Rocket Launcher"),

    /**
     * Flamethrower
     */
    FLAMETHROWER(37, WeaponSlot[7]!!, 361, "Flamethrower"),

    /**
     * Minigun
     */
    MINIGUN(38, WeaponSlot[7]!!, 362, "Minigun"),

    /**
     * Remote Explosives
     */
    SATCHEL(39, WeaponSlot[8]!!, 363, "Remote Explosives"),

    /**
     * Bomb
     */
    BOMB(40, WeaponSlot[12]!!, 364, "Bomb"),

    /**
     * Spray Can
     */
    SPRAYCAN(41, WeaponSlot[9]!!, 365, "Spray Can"),

    /**
     * Fire Extinguisher
     */
    FIREEXTINGUISHER(42, WeaponSlot[9]!!, 366, "Fire Extinguisher"),

    /**
     * Camera
     */
    CAMERA(43, WeaponSlot[9]!!, 367, "Camera"),

    /**
     * NV Goggles
     */
    NIGHTVISION(44, WeaponSlot[11]!!, 368, "NV Goggles"),

    /**
     * IR Goggles
     */
    INFRARED(45, WeaponSlot[11]!!, 369, "IR Goggles"),

    /**
     * Parachute
     */
    PARACHUTE(46, WeaponSlot[11]!!, 371, "Parachute"),

    /**
     * Fake Pistol (only a death icon)
     */
    FAKEPISTOL(47, WeaponSlot[-1]!!, 0, "Fake Pistol"),

    /**
     * Vehicle (only a death icon)
     */
    VEHICLE(49, WeaponSlot[-1]!!, 0, "Vehicle"),

    /**
     * Helicopter Blades (only a death icon)
     */
    HELICOPTERBLADES(50, WeaponSlot[-1]!!, 0, "Helicopter Blades"),

    /**
     * Explosion (only a death icon)
     */
    EXPLOSION(51, WeaponSlot[-1]!!, 0, "Explosion"),

    /**
     * Drowned (only a death icon)
     */
    DROWN(53, WeaponSlot[-1]!!, 0, "Drowned"),

    /**
     * Splat (only a death icon)
     */
    COLLISION(54, WeaponSlot[-1]!!, 0, "Splat"),

    /**
     * Connect (only usable in sendDeathMessage)
     */
    CONNECT(200, WeaponSlot[-1]!!, 0, "Connect"),

    /**
     * Disconnect (only usable in sendDeathMessage)
     */
    DISCONNECT(201, WeaponSlot[-1]!!, 0, "Disconnect"),

    /**
     * Unknown (only usable in sendDeathMessage)
     */
    UNKNOWN(255, WeaponSlot[-1]!!, 0, "Unknown");

    companion object : Collectable<WeaponModel>, Findable<Int, WeaponModel> {
        private val VALUES = values().map { it.id to it }.toMap()

        /**
         * Gets all available [WeaponModel]s.
         */
        @JvmStatic
        override fun get(): Collection<WeaponModel> = VALUES.values

        /**
         * Gets a [WeaponModel] by its id.
         */
        @JvmStatic
        override operator fun get(value: Int): WeaponModel? = VALUES[value]

        /**
         * Gets a [WeaponModel] by its name.
         */
        @JvmStatic
        operator fun get(name: String, ignoreCase: Boolean): WeaponModel? = VALUES.filter {
            it.value.modelName.equals(name, ignoreCase) }.values.first()

        /**
         * Gets all [WeaponModel]s that have the same [WeaponSlot] as [slot].
         */
        @JvmStatic
        operator fun get(slot: WeaponSlot): Collection<WeaponModel> = VALUES.filter {
            it.value.slot == slot }.values

    }
}

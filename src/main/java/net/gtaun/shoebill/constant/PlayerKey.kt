/**
 * Copyright (C) 2012-2013 MK124
 * Copyright (C) 2013 Meta

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

import org.apache.commons.lang3.StringUtils

/**
 * This enum contains the available PlayerKeys that can be received via the PlayerKeyState object. This information
 * was taken from the offical SA:MP Wikipedia page.
 *
 * @author MK124
 * @author Marvin Haschker
 * @author Meta
 * @see net.gtaun.shoebill.object.PlayerKeyState
 */
enum class PlayerKey private constructor(val value: Int, private val gameTextKeyOnFootRaw: String?, private val
gameTextKeyInVehicleRaw: String?) {
    ACTION(1, "PED_ANSWER_PHONE", "VEHICLE_FIREWEAPON"),
    CROUCH(2, "PED_DUCK", "VEHICLE_HORN"),
    FIRE(4, "PED_FIREWEAPON", "VEHICLE_FIREWEAPON"),
    SPRINT(8, "PED_SPRINT", "VEHICLE_ACCELERATE"),
    SECONDARY_ATTACK(16, "VEHICLE_ENTER_EXIT", "VEHICLE_FIREWEAPON_ALT"),
    JUMP(32, "PED_JUMPING", "VEHICLE_BRAKE"),
    LOOK_RIGHT(64, null, "VEHICLE_LOOKRIGHT"),
    HANDBRAKE(128, "PED_LOCK_TARGET", "VEHICLE_HANDBRAKE"),
    LOOK_LEFT(256, null, "VEHICLE_LOOKLEFT"),
    SUBMISSION(512, null, "TOGGLE_SUBMISSIONS"),
    LOOK_BEHIND(512, "PED_LOOKBEHIND", "VEHICLE_LOOKBEHIND"),
    WALK(1024, "SNEAK_ABOUT", null),
    ANALOG_UP(2048, null, "VEHICLE_TURRETUP"),
    ANALOG_DOWN(4096, null, "VEHICLE_TURRETDOWN"),
    ANALOG_LEFT(8192, "VEHICLE_LOOKLEFT", "VEHICLE_TURRETLEFT"),
    ANALOG_RIGHT(16384, "VEHICLE_LOOKRIGHT", "VEHICLE_TURRETRIGHT"),
    YES(65536, "CONVERSATION_YES", "CONVERSATION_YES"),
    NO(131072, "CONVERSATION_NO", "CONVERSATION_NO"),
    CTRL_BACK(262144, "GROUP_CONTROL_BWD", "GROUP_CONTROL_BWD"),
    UNDEFINED(0, "GROUP_CONTROL_FWD", "GROUP_CONTROL_FWD"),
    /* Special values, Not be indexed */
    UP(-128, "GO_FORWARD", "VEHICLE_STEERUP"),
    DOWN(128, "GO_BACK", "VEHICLE_STEERDOWN"),
    LEFT(-128, "GO_LEFT", "VEHICLE_STEERLEFT"),
    RIGHT(128, "GO_RIGHT", "VEHICLE_STEERRIGHT");

    fun getGameTextKeyRaw(inVehicle: Boolean): String? {
        return if (inVehicle) gameTextKeyInVehicleRaw else gameTextKeyOnFootRaw
    }

    fun getGameTextKey(inVehicle: Boolean): String {
        val raw = getGameTextKeyRaw(inVehicle)
        return if (StringUtils.isBlank(raw)) "" else "~k~~$raw~"
    }

    companion object : Collectable<PlayerKey>, Findable<Int, Collection<PlayerKey>> {
        private val VALUES = values().map { it.name to it }.toMap()

        /**
         * Gets all [PlayerKey]s that use [value] as their value.
         */
        @JvmStatic
        override operator fun get(value: Int): Collection<PlayerKey> = VALUES.filter { it.value.value == value }.values

        /**
         * Gets all available [PlayerKey]s.
         */
        @JvmStatic
        override fun get(): Collection<PlayerKey> = VALUES.values
    }
}

/**
 * Copyright (C) 2011-2014 MK124

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

package net.gtaun.shoebill.`object`

import net.gtaun.shoebill.SampObjectManager
import net.gtaun.shoebill.constant.ServerVarType
import net.gtaun.shoebill.constant.VehicleModelInfoType
import net.gtaun.shoebill.constant.WeaponModel
import net.gtaun.shoebill.data.Animation
import net.gtaun.shoebill.data.Color
import net.gtaun.shoebill.data.Vector3D

/**
 * This class contains methods and functions to control the server, such as the weather or password.
 *
 * @author MK124
 * @author Marvin Haschker
 */
abstract class Server : Proxyable<Server> {

    abstract var serverCodepage: Int
    abstract val maxPlayers: Int
    abstract var gamemodeText: String

    abstract fun sendRconCommand(command: String)
    abstract fun connectNPC(name: String, script: String)

    // Global player methods
    abstract fun sendMessageToAll(color: Color, message: String)

    abstract fun sendMessageToAll(color: Color, format: String, vararg args: Any)
    abstract fun sendMessageToAll(message: String)
    abstract fun sendMessageToAll(format: String, vararg args: Any)

    abstract fun gameTextToAll(time: Int, style: Int, text: String)
    abstract fun gameTextToAll(time: Int, style: Int, format: String, vararg args: Any)

    /**
     * Sends a Death Message to everyone.
     * @param killer Player who killed this player
     * @param reason Deathreason
     */
    abstract fun sendDeathMessageToAll(killer: Player, victim: Player, reason: WeaponModel)

    abstract fun getVehicleModelInfo(modelId: Int, infotype: VehicleModelInfoType): Vector3D

    abstract fun blockIpAddress(ipAddress: String, timeMs: Int)
    abstract fun unBlockIpAddress(ipAddress: String)

    abstract var hostname: String
    abstract var mapname: String
    abstract var password: String
    abstract fun getAnimationName(animationIndex: Int): Animation
    abstract fun hashPassword(password: String, salt: String): String

    abstract fun getConsoleIntVar(varname: String): Int
    abstract fun getConsoleBoolVar(varname: String): Boolean
    abstract fun getConsoleStringVar(varname: String): String

    abstract fun setIntVar(varname: String, value: Int)
    abstract fun setFloatVar(varname: String, value: Float)
    abstract fun setStringVar(varname: String, value: String)

    abstract fun getIntVar(varname: String): Int
    abstract fun getFloatVar(varname: String): Float
    abstract fun getStringVar(varname: String): String

    abstract fun deleteVar(varname: String): Boolean
    abstract val varsUpperIndex: Int
    abstract fun getVarNameAtIndex(index: Int): String
    abstract fun getVarType(varname: String): ServerVarType

    companion object {

        /**
         * Gets the [Server] instance.
         */
        @JvmStatic
        fun get(): Server {
            return SampObjectManager.get().server
        }
    }

}

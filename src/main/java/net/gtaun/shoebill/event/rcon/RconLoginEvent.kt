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

package net.gtaun.shoebill.event.rcon

import net.gtaun.util.event.Event

/**
 * This event will be called when somebody is trying to login into the RCON-Console.
 *
 * @author MK124
 * @author Marvin Haschker
 */
class RconLoginEvent(val ip: String, val password: String, val isSuccess: Boolean) : Event() {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is RconLoginEvent) return false

        if (ip != other.ip) return false
        if (password != other.password) return false
        if (isSuccess != other.isSuccess) return false

        return true
    }

    override fun hashCode(): Int {
        var result = ip.hashCode()
        result = 31 * result + password.hashCode()
        result = 31 * result + isSuccess.hashCode()
        return result
    }


}

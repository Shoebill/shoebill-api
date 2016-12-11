/**
 * Copyright (C) 2012 MK124

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

package net.gtaun.shoebill.event.service

import net.gtaun.shoebill.resource.Resource
import net.gtaun.shoebill.service.Service
import net.gtaun.shoebill.service.ServiceEntry
import net.gtaun.util.event.Event

/**
 * This event is the base class for all Service-related events.
 *
 * @author MK124
 * @author Marvin Haschker
 */
open class ServiceEvent(val serviceEntry: ServiceEntry) : Event() {

    val provider: Resource
        get() = serviceEntry.provider

    val type: Class<out Service>
        get() = serviceEntry.type

    val service: Service
        get() = serviceEntry.service

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ServiceEvent) return false

        if (serviceEntry != other.serviceEntry) return false

        return true
    }

    override fun hashCode(): Int {
        return serviceEntry.hashCode()
    }


}

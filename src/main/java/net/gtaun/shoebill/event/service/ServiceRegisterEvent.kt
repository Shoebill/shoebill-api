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

/**
 * This event will be called when a new service is registering.
 *
 * @author MK124
 * @author Marvin Haschker
 */
class ServiceRegisterEvent @JvmOverloads constructor(
        entry: ServiceEntry, val previousServiceEntry: ServiceEntry? = null) : ServiceEvent(entry) {

    val isReregistering: Boolean
        get() = previousServiceEntry != null

    val previousProvider: Resource?
        get() = previousServiceEntry?.provider

    val previousType: Class<out Service>?
        get() = previousServiceEntry?.type

    val previousService: Service?
        get() = previousServiceEntry?.service
}

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

package net.gtaun.shoebill.event.destroyable

import net.gtaun.shoebill.entities.Destroyable
import net.gtaun.util.event.Event

/**
 * This event will be called whenever an internal testing is destroyed, such as SampObject or Vehicle.
 *
 * @author MK124
 * @author Marvin Haschker
 */
class DestroyEvent(val destroyable: Destroyable) : Event() {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is DestroyEvent) return false

        if (destroyable != other.destroyable) return false

        return true
    }

    override fun hashCode(): Int {
        return destroyable.hashCode()
    }

}

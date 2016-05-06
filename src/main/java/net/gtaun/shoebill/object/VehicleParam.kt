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

package net.gtaun.shoebill.`object`

/**
 * This class contains information about the [Vehicle].
 *
 * @author MK124
 * @author Marvin Haschker
 */
abstract class VehicleParam : VehicleRelated {

    abstract var engine: Int
    abstract var lights: Int
    abstract var alarm: Int
    abstract var doors: Int
    abstract var bonnet: Int
    abstract var boot: Int
    abstract var objective: Int

    abstract operator fun set(engine: Int, lights: Int, alarm: Int, doors: Int, bonnet: Int, boot: Int, objective: Int)

    companion object {
        @JvmField
        val PARAM_UNSET = -1

        @JvmField
        val PARAM_OFF = 0

        @JvmField
        val PARAM_ON = 1
    }
}

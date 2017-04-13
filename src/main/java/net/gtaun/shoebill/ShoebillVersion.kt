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

package net.gtaun.shoebill

/**
 * Shoebill version information interface.
 * @author MK124
 * @author Marvin Haschker
 */
interface ShoebillVersion {
    /**
     * The name of the runtime library.
     */
    val name: String

    /**
     * The version information of the runtime library.
     */
    val version: String

    /**
     * The supported SA-MP version of the runtime library.
     */
    val supportedVersion: String

    /**
     * The build number of the runtime library.
     */
    val buildNumber: Int

    /**
     * The build date of the runtime library.
     */
    val buildDate: String

    /**
     * The target Shoebill Api on which the runtime is relying on.
     */
    val targetApi: String
}

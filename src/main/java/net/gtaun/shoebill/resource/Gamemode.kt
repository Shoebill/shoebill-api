/**
 * Copyright (C) 2012-2014 MK124

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

package net.gtaun.shoebill.resource

import org.slf4j.Logger

/**
 * This class defines how a Gamemode's main class should look like.
 *
 * @author MK124
 * @author Marvin Haschker
 */
abstract class Gamemode protected constructor() : Resource() {
    companion object {
        /**
         * Gets the gamemode.
         */
        @JvmStatic
        fun get(): Gamemode? = ResourceManager.get().gamemode

        /**
         * Gets a gamemode by its class.
         */
        @JvmStatic
        fun <T : Gamemode> getGamemode(gamemodeClass: Class<T>): T? = ResourceManager.get().getGamemode(gamemodeClass)

        /**
         * Gets the Gamemode's logger.
         */
        @JvmStatic
        fun logger(): Logger? = get()?.logger
    }
}

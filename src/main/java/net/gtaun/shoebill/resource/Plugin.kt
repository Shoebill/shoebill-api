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

package net.gtaun.shoebill.resource

/**
 * This class defines how a Plugin's main class should look like.
 *
 * @author MK124
 * @author Marvin Haschker
 */
abstract class Plugin protected constructor() : Resource() {

    @Throws(Throwable::class)
    public override fun enable() = super.enable()

    @Throws(Throwable::class)
    public override fun disable() = super.disable()

    companion object {
        /**
         * Gets a [Plugin] by it's main class..
         */
        operator fun <PluginType : Plugin> get(pluginClass: Class<PluginType>): PluginType? =
                ResourceManager.get().getPlugin(pluginClass)

        /**
         * Gets all available [Plugin]s.
         */
        @JvmStatic
        fun get(): Collection<Plugin> = ResourceManager.get().plugins
    }
}

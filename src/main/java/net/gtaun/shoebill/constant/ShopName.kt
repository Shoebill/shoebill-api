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

package net.gtaun.shoebill.constant

/**
 * This enum contains the ShopNames that are available in SA:MP. These should be used with setShopName(). This
 * information was taken from the official SA:MP Wikipedia page.
 *
 * @author MK124
 * @author Marvin Haschker
 */
enum class ShopName constructor(val value: String) {
    /**
     * None
     */
    NONE(""),
    /**
     * Pizza Stack
     */
    PIZZA_STACK("FDPIZA"),

    /**
     * Burger Shot
     */
    BURGER_SHOT("FDBURG"),

    /**
     * Cluckin' Bell
     */
    CLUCKIN_BELL("FDCHICK"),

    /**
     * Ammunation 1
     */
    AMMUNATION1("AMMUN1"),

    /**
     * Ammunation 2
     */
    AMMUNATION2("AMMUN2"),

    /**
     * Ammunation 3
     */
    AMMUNATION3("AMMUN3"),

    /**
     * Ammunation 5
     */
    AMMUNATION5("AMMUN5");

    companion object : Collectable<ShopName>, Findable<String, ShopName> {
        private val VALUES = values().map { it.value to it }.toMap()

        /**
         * Gets all available [ShopName]s.
         */
        @JvmStatic
        override fun get(): Collection<ShopName> = VALUES.values

        /**
         * Gets a [ShopName] by its name.
         */
        @JvmStatic
        override operator fun get(value: String): ShopName? = VALUES[value]
    }

}

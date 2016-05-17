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

package net.gtaun.shoebill.entities

import net.gtaun.shoebill.SampObjectManager
import net.gtaun.shoebill.constant.Collectable
import net.gtaun.shoebill.constant.Findable
import net.gtaun.shoebill.data.Vector2D
import net.gtaun.shoebill.exception.CreationFailedException

/**
 * This class wraps functions and methods for the use of Menus.
 *
 * @author MK124
 * @author Marvin Haschker
 */
abstract class Menu : Destroyable, Proxyable<Menu> {

    /**
     * The internal id of the [Menu].
     */
    abstract val id: Int

    /**
     * The title of the [Menu].
     */
    abstract val title: String

    /**
     * The column count.
     */
    abstract val columns: Int

    /**
     * The position of the [Menu].
     */
    abstract val position: Vector2D

    /**
     * The width of column 1.
     */
    abstract val column1Width: Float

    /**
     * The width of column 2.
     */
    abstract val column2Width: Float

    /**
     * The column headers.
     */
    abstract val columnHeader: Array<String>

    /**
     * Adds an item to a column.
     * @param column The column where the text will be displayed
     * @param text The displayed Text
     */
    abstract fun addItem(column: Int, text: String)

    /**
     * Sets the column header text.
     * @param column The column id
     * @param text The displayed text
     */
    abstract fun setColumnHeader(column: Int, text: String)

    /**
     * Disables the [Menu]
     */
    abstract fun disable()

    /**
     * Disables [row].
     */
    abstract fun disableRow(row: Int)

    /**
     * Shows the [Menu] for the [player].
     */
    abstract fun show(player: Player)

    /**
     * Hides the [Menu] for the [player].
     */
    abstract fun hide(player: Player)

    companion object : Collectable<Menu>, Findable<Int, Menu> {

        /**
         * The invalid ID for a [Menu].
         */
        @JvmField
        val INVALID_ID = 0xFF

        /**
         * Gets all available [Menu]s.
         */
        @JvmStatic
        override fun get(): Collection<Menu> = SampObjectManager.get().menus

        /**
         * Gets a [Menu] by it's [id].
         */
        @JvmStatic
        override operator fun get(value: Int): Menu? = SampObjectManager.get().getMenu(value)

        /**
         * Create a Menu with params. If the Creation fails, it will throw a CreationFailedException.
         * @param title The Title of the menu.
         * @param columns The amount of columns.
         * @param pos Vector2D-Position where the Menu should appear.
         * @param col1Width The Columnwidth of column 1.
         * @param col2Width The Columnwidth of column 2.
         * @return The created Menu.
         */
        @Throws(CreationFailedException::class)
        @JvmStatic
        @JvmOverloads
        fun create(title: String, pos: Vector2D, columns: Int = 1, col1Width: Float = 0f, col2Width: Float = 0f): Menu =
                SampObjectManager.get().createMenu(title, columns, pos, col1Width, col2Width)

        /**
         * Create a Menu with params. If the Creation fails, it will throw a CreationFailedException.
         * @param title The title of the menu.
         * @param columns The amount of columns.
         * @param x X-Pos where the [Menu] should appear.
         * @param y Y-Pos where the [Menu] should appear.
         * @param col1Width The width of column 1.
         * @param col2Width The width of column 2.
         * @return The created [Menu].
         */
        @Throws(CreationFailedException::class)
        @JvmStatic
        @JvmOverloads
        fun create(title: String, x: Float = 0f, y: Float = 0f, columns: Int = 1, col1Width: Float = 0f, col2Width:
            Float = 0f): Menu = create(title, Vector2D(x, y), columns, col1Width, col2Width)

    }
}

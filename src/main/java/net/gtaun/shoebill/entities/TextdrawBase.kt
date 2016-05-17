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

package net.gtaun.shoebill.entities

import net.gtaun.shoebill.constant.TextDrawAlign
import net.gtaun.shoebill.constant.TextDrawFont
import net.gtaun.shoebill.data.Color
import net.gtaun.shoebill.data.Vector2D

/**
 * This is the base class for all [Textdraw]-based classes.
 *
 * @author MK124
 * @author Marvin Haschker
 */
interface TextdrawBase : Destroyable, Proxyable<TextdrawBase> {
    val id: Int
    val position: Vector2D
    var text: String

    fun setLetterSize(x: Float, y: Float)
    fun setLetterSize(vec: Vector2D)

    fun setTextSize(x: Float, y: Float)
    fun setTextSize(vec: Vector2D)

    fun setAlignment(alignment: TextDrawAlign)
    fun setColor(color: Color)
    fun setUseBox(use: Boolean)
    fun setBoxColor(color: Color)
    fun setShadowSize(size: Int)
    fun setOutlineSize(size: Int)
    fun setBackgroundColor(color: Color)
    fun setFont(font: TextDrawFont)
    fun setProportional(set: Boolean)
    fun setSelectable(set: Boolean)
    fun setPreviewModel(modelindex: Int)
    fun setPreviewModelRotation(rotX: Float, rotY: Float, rotZ: Float)
    fun setPreviewModelRotation(rotX: Float, rotY: Float, rotZ: Float, zoom: Float)
    fun setPreviewVehicleColor(color1: Int, color2: Int)

    companion object {
        /**
         * Invalid ID for a [TextdrawBase].
         */
        val INVALID_ID = 0xFFFF
    }
}

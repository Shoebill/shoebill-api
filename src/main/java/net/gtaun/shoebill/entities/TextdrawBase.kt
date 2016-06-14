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
import net.gtaun.shoebill.data.ModelRotation
import net.gtaun.shoebill.data.Vector2D

/**
 * This is the base class for all [Textdraw]-based classes.
 *
 * @author MK124
 * @author Marvin Haschker
 */
abstract class TextdrawBase : Destroyable, Proxyable<TextdrawBase> {
    abstract val id: Int
    abstract val position: Vector2D
    abstract var text: String

    abstract var letterSize: Vector2D
    abstract var textSize: Vector2D
    abstract var alignment: TextDrawAlign
    abstract var color: Color
    abstract var isUseBox: Boolean
    abstract var boxColor: Color
    abstract var shadowSize: Int
    abstract var outlineSize: Int
    abstract var backgroundColor: Color
    abstract var font: TextDrawFont
    abstract var isProportional: Boolean
    abstract var isSelectable: Boolean
    abstract var previewModel: Int
    abstract var previewModelRotation: ModelRotation

    @JvmOverloads
    fun setLetterSize(x: Float = letterSize.x, y: Float = letterSize.y) {
        letterSize = Vector2D(x, y)
    }

    @JvmOverloads
    fun setTextSize(x: Float = textSize.x, y: Float = textSize.y) {
        textSize = Vector2D(x, y)
    }

    @JvmOverloads
    fun setPreviewModelRotation(rotX: Float = previewModelRotation.x, rotY: Float = previewModelRotation.y, rotZ:
            Float = previewModelRotation.z, zoom: Float = previewModelRotation.zoom) {
        previewModelRotation = ModelRotation(rotX, rotY, rotZ, zoom)
    }

    abstract fun setPreviewVehicleColor(color1: Int, color2: Int)

    companion object {
        /**
         * Invalid ID for a [TextdrawBase].
         */
        val INVALID_ID = 0xFFFF
    }
}

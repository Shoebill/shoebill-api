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

import net.gtaun.shoebill.SampObjectManager
import net.gtaun.shoebill.constant.DialogStyle
import net.gtaun.shoebill.event.dialog.DialogCloseEvent
import net.gtaun.shoebill.event.dialog.DialogResponseEvent
import net.gtaun.shoebill.event.dialog.DialogShowEvent
import net.gtaun.shoebill.exception.CreationFailedException
import net.gtaun.util.event.EventHandler

/**
 * @author MK124
 * @author Marvin Haschker
 */
abstract class DialogId : Destroyable {

    /**
     * Gets the [id] of the dialog.
     */
    abstract val id: Int

    /**
     * Shows the dialog to the [player].
     * @param player The player which will see the Dialog
     * @param style The DialogStyle
     * @param caption The caption of the dialog
     * @param text The text in the dialog
     * @param button1 The text of button 1
     * @param button2 The text of button 2
     */
    abstract fun show(player: Player, style: DialogStyle, caption: String, text: String,
                      button1: String, button2: String)

    /**
     * Closes the Dialog for the [player].
     */
    abstract fun cancel(player: Player)

    companion object {

        /**
         * Creates a DialogId.
         * If the Creation fails, it will throw a CreationFailedException.
         */
        @Throws(CreationFailedException::class)
        @JvmStatic
        @JvmOverloads
        fun create(onResponse: EventHandler<DialogResponseEvent>? = null,
                   onShow: EventHandler<DialogShowEvent>? = null,
                   onClose: EventHandler<DialogCloseEvent>? = null): DialogId =
                SampObjectManager.get().createDialogId(onResponse, onShow, onClose)
    }
}

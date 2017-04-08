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

package net.gtaun.shoebill.entities

import net.gtaun.shoebill.SampObjectManager
import net.gtaun.shoebill.constant.DialogStyle
import net.gtaun.shoebill.event.dialog.DialogCloseEvent
import net.gtaun.shoebill.event.dialog.DialogResponseEvent
import net.gtaun.shoebill.event.dialog.DialogShowEvent
import net.gtaun.shoebill.exception.CreationFailedException
import net.gtaun.util.event.EventHandler
import net.gtaun.util.event.HandlerPriority

/**
 * @author MK124
 * @author Marvin Haschker
 */
abstract class DialogId : Entity() {

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

    /**
     * Quick-register Events
     */
    @JvmOverloads
    fun onShow(handler: EventHandler<DialogShowEvent>, priority: HandlerPriority = HandlerPriority.NORMAL) =
            eventManagerNode.registerHandler(DialogShowEvent::class.java, handler, priority, attention)

    @JvmOverloads
    fun onShow(handler: (DialogShowEvent) -> Unit, priority: HandlerPriority = HandlerPriority.NORMAL) =
            onShow(EventHandler { handler(it) }, priority)

    @JvmOverloads
    fun onClose(handler: EventHandler<DialogCloseEvent>, priority: HandlerPriority = HandlerPriority.NORMAL) =
            eventManagerNode.registerHandler(DialogCloseEvent::class.java, handler, priority, attention)

    @JvmOverloads
    fun onClose(handler: (DialogCloseEvent) -> Unit, priority: HandlerPriority = HandlerPriority.NORMAL) =
            onClose(EventHandler { handler(it) }, priority)

    @JvmOverloads
    fun onResponse(handler: EventHandler<DialogResponseEvent>, priority: HandlerPriority = HandlerPriority.NORMAL) =
            eventManagerNode.registerHandler(DialogResponseEvent::class.java, handler, priority, attention)

    @JvmOverloads
    fun onResponse(handler: (DialogResponseEvent) -> Unit, priority: HandlerPriority = HandlerPriority.NORMAL) =
            onResponse(EventHandler { handler(it) }, priority)

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

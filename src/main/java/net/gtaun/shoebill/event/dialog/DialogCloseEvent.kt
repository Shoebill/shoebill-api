/**
 * Copyright (C) 2011-2015 MK124

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

package net.gtaun.shoebill.event.dialog

import net.gtaun.shoebill.entities.DialogId
import net.gtaun.shoebill.entities.Player
import net.gtaun.shoebill.event.dialog.DialogCloseEvent.DialogCloseType

/**
 * This event will be called when a [dialog] has been closed.
 *
 * @author MK124
 * @author Marvin Haschker
 *
 * @property type The type of the dialog response (see [DialogCloseType]).
 */
class DialogCloseEvent(dialog: DialogId, player: Player,
                       val type: DialogCloseEvent.DialogCloseType) : DialogEvent(dialog, player) {

    enum class DialogCloseType {
        RESPOND,
        CANCEL,
        OVERRIDE
    }

    /**
     * This method is an alias for the interrupt() method.
     * @see DialogCloseEvent.interrupt
     */
    fun setProcessed() = interrupt()

}

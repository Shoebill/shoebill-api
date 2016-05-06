package net.gtaun.shoebill.event.amx

import net.gtaun.shoebill.amx.AmxInstance
import net.gtaun.util.event.Event

/**
 * This event is used for all AmxEvents and contains a AmxInstance variable.
 *
 * @author Marvin Haschker
 * @see net.gtaun.util.event.Event
 */
open class AmxInstanceEvent protected constructor(
        /**
         * The AmxInstance that is affected by this event.
         */
        val amxInstance: AmxInstance) : Event()

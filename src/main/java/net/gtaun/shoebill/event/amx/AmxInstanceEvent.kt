package net.gtaun.shoebill.event.amx

import net.gtaun.shoebill.amx.AmxInstance
import net.gtaun.util.event.Event

/**
 * This event is used for all AmxEvents and contains a AmxInstance variable.
 *
 * @author Marvin Haschker
 *
 * @property amxInstance The AmxInstance that is affected by this event.
 */
open class AmxInstanceEvent protected constructor(val amxInstance: AmxInstance) : Event()

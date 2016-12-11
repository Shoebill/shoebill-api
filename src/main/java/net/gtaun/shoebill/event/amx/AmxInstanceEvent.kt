package net.gtaun.shoebill.event.amx

import net.gtaun.shoebill.amx.AmxInstance
import net.gtaun.util.event.Event

/**
 * This event is used for all AmxEvents and contains a AmxInstance variable.
 *
 * @author Marvin Haschker
 */
open class AmxInstanceEvent protected constructor(
        /**
         * The AmxInstance that is affected by this event.
         */
        val amxInstance: AmxInstance) : Event() {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AmxInstanceEvent) return false

        if (amxInstance != other.amxInstance) return false

        return true
    }

    override fun hashCode(): Int {
        return amxInstance.hashCode()
    }


}

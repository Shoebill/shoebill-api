package net.gtaun.shoebill.event.amx

import net.gtaun.util.event.Event

/**
 * This event will be called when an AmxHook has been executed.
 *
 * @author Marvin Haschker
 */
class AmxCallEvent(
        /**
         * The name of the executed function.
         */
        val functionName: String,
        /**
         * The given parameters from the call.
         */
        val parameters: Array<Any>) : Event() {

    var returnValue = 1

    var disallow: Boolean = false
        private set
        get

    fun disallow() { this.disallow = true }
}

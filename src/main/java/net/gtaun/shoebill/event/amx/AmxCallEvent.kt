package net.gtaun.shoebill.event.amx

import net.gtaun.util.event.Disallowable
import net.gtaun.util.event.Event
import java.util.*

/**
 * This event will be called when an AmxHook has been executed.
 *
 * @author Marvin Haschker
 */
class AmxCallEvent @JvmOverloads constructor(
        /**
         * The name of the executed function.
         */
        val functionName: String,
        /**
         * The given parameters from the call.
         */
        val parameters: Array<Any>,
        /**
         * The return value of the call event.
         */
        var returnValue: Int = 1) : Event(), Disallowable {

    var isDisallowed: Boolean = false
        private set

    override fun disallow() {
        isDisallowed = true
        interrupt()
    }

}
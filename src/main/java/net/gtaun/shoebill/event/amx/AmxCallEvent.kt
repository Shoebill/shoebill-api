package net.gtaun.shoebill.event.amx

import net.gtaun.util.event.Disallowable
import net.gtaun.util.event.Event
import java.util.*

/**
 * This event will be called when an AmxHook has been executed.
 *
 * @author Marvin Haschker
 *
 * @property functionName The name of the executed function.
 * @property parameters The given parameters from the call.
 * @property returnValue The return value of the call event.
 */
class AmxCallEvent @JvmOverloads constructor(
        val functionName: String,
        val parameters: Array<Any>,
        var returnValue: Int = 1) : Event(), Disallowable {

    var isDisallowed: Boolean = false
        private set

    override fun disallow() {
        isDisallowed = true
        interrupt()
    }

}

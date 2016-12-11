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

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AmxCallEvent) return false

        if (functionName != other.functionName) return false
        if (!Arrays.equals(parameters, other.parameters)) return false
        if (returnValue != other.returnValue) return false

        return true
    }

    override fun hashCode(): Int {
        var result = functionName.hashCode()
        result = 31 * result + Arrays.hashCode(parameters)
        result = 31 * result + returnValue
        return result
    }


}

package net.gtaun.shoebill.amx

import net.gtaun.shoebill.event.amx.AmxCallEvent
import java.util.*

/**
 * This class holds the information about an installed hook in the abstract machine (AMX).
 * Make sure you unhook the hook, after you finished using it (e.g. onDisable).
 *
 * @author Marvin Haschker
 */
class AmxHook(val name: String, val onCall: (AmxCallEvent) -> Unit, vararg val parameters: String) {

    var isActivated: Boolean = true
        private set

    fun deactivate() {
        isActivated = false
    }

    fun activate() {
        isActivated = true
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is AmxHook) return false

        if (name != other.name) return false
        if (onCall != other.onCall) return false
        if (!Arrays.equals(parameters, other.parameters)) return false
        if (isActivated != other.isActivated) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + onCall.hashCode()
        result = 31 * result + Arrays.hashCode(parameters)
        result = 31 * result + isActivated.hashCode()
        return result
    }

}

package net.gtaun.shoebill.amx

import net.gtaun.shoebill.event.amx.AmxCallEvent

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

}

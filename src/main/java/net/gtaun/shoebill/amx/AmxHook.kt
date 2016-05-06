package net.gtaun.shoebill.amx

import net.gtaun.shoebill.event.amx.AmxCallEvent

import java.util.function.Consumer

/**
 * This class holds the information about an installed hook in the abstract machine (AMX).
 * Make sure you unhook the hook, after you finished using it (e.g. onDisable).
 *
 * @author Marvin Haschker
 */
class AmxHook(val name: String, val onCall: Consumer<AmxCallEvent>, val parameters: String)

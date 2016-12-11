package net.gtaun.shoebill.event.amx

import net.gtaun.shoebill.amx.AmxInstance

/**
 * This event is called when an AmxInstance is unloaded.
 * This can happen when a filterscript is unloaded via the RCON-Console.
 *
 * @author Marvin Haschker
 */
class AmxUnloadEvent(instance: AmxInstance) : AmxInstanceEvent(instance)
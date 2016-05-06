package net.gtaun.shoebill.event.amx

import net.gtaun.shoebill.amx.AmxInstance

/**
 * This event is called when an AmxInstance has been loaded.
 * This event can be called anytime, for example when a new filterscript has un/loaded.
 * It is possible that this event is never called,
 * because Shoebill will be initialized after the Gamemode's Amx file has been loaded.
 *
 * @author Marvin Haschker
 * @see net.gtaun.shoebill.event.amx.AmxInstanceEvent
 */
class AmxLoadEvent(instance: AmxInstance) : AmxInstanceEvent(instance)

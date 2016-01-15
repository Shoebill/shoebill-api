package net.gtaun.shoebill.event.amx;

import net.gtaun.shoebill.amx.AmxInstance;

/**
 * This event is called when an AmxInstance is unloaded. This can happen when a filterscript is unloaded via the RCON-Console.
 *
 * @author Marvin Haschker
 * @see net.gtaun.shoebill.event.amx.AmxInstanceEvent
 */
public class AmxUnloadEvent extends AmxInstanceEvent
{
	public AmxUnloadEvent(AmxInstance instance)
	{
		super(instance);
	}
}

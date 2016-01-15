package net.gtaun.shoebill.event.amx;

import net.gtaun.shoebill.amx.AmxInstance;
import net.gtaun.util.event.Event;

/**
 * This event is used for all AmxEvents and contains a AmxInstance variable.
 *
 * @author Marvin Haschker
 * @see net.gtaun.util.event.Event
 */
public abstract class AmxInstanceEvent extends Event
{
	private final AmxInstance amxInstance;

	protected AmxInstanceEvent(AmxInstance instance)
	{
		this.amxInstance = instance;
	}

    /**
     * Returns the AmxInstance that is affected by this event.
     *
     * @return An AmxInstance
     */
	public AmxInstance getAmxInstance()
	{
		return amxInstance;
	}
}

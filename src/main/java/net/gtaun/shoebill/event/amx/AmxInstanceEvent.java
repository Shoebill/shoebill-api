package net.gtaun.shoebill.event.amx;

import net.gtaun.shoebill.amx.AmxInstance;
import net.gtaun.util.event.Event;

public abstract class AmxInstanceEvent extends Event
{
	private final AmxInstance amxInstance;
	
	
	protected AmxInstanceEvent(AmxInstance instance)
	{
		this.amxInstance = instance;
	}
	
	public AmxInstance getAmxInstance()
	{
		return amxInstance;
	}
}

package net.gtaun.shoebill.event;

import net.gtaun.shoebill.event.amx.AmxLoadEvent;
import net.gtaun.shoebill.event.amx.AmxUnloadEvent;
import net.gtaun.util.event.AbstractEventHandler;

public class AmxEventHandler extends AbstractEventHandler
{	
	public AmxEventHandler()
	{
		super(AmxEventHandler.class);
	}
	
	protected void onAmxLoad(AmxLoadEvent event)			{ }
	protected void onAmxUnload(AmxUnloadEvent event)		{ }
}

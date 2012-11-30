/**
 * Copyright (C) 2011-2012 MK124
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.gtaun.shoebill.event;

import net.gtaun.shoebill.event.rcon.RconCommandEvent;
import net.gtaun.shoebill.event.rcon.RconLoginEvent;
import net.gtaun.util.event.AbstractEventHandler;

/**
 * 
 * 
 * @author MK124
 */
public abstract class RconEventHandler extends AbstractEventHandler
{
	protected RconEventHandler()
	{
		super(RconEventHandler.class);
	}
	
	public void onRconCommand(RconCommandEvent event)		{ }
	public void onRconLogin(RconLoginEvent event)			{ }
}

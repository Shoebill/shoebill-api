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

import net.gtaun.shoebill.event.resource.ResourceEnableEvent;
import net.gtaun.shoebill.event.resource.ResourceDisableEvent;
import net.gtaun.shoebill.event.resource.ResourceLoadEvent;
import net.gtaun.shoebill.event.resource.ResourceUnloadEvent;
import net.gtaun.util.event.AbstractEventHandler;

/**
 * 
 * 
 * @author MK124
 */
public abstract class ResourceEventHandler extends AbstractEventHandler
{
	protected ResourceEventHandler()
	{
		super(ResourceEventHandler.class);
	}
	
	protected void onResourceLoad(ResourceLoadEvent event)				{ }
	protected void onResourceUnload(ResourceUnloadEvent event)			{ }

	protected void onResourceEnable(ResourceEnableEvent event)			{ }
	protected void onResourceDisable(ResourceDisableEvent event)		{ }
}

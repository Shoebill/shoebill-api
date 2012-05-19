/**
 * Copyright (C) 2011 MK124
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

package net.gtaun.shoebill.util.event;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * @author MK124
 *
 */

public abstract class Event
{
	private boolean interruptable;
	private boolean interrupted;
	
	
	protected Event()
	{
		this.interruptable = true;
	}
	
	protected Event( boolean interruptable )
	{
		this.interruptable = interruptable;
	}
	
	@Override
	public String toString()
	{
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}
	
	public boolean isInterruptable()
	{
		return interruptable;
	}
	
	public boolean isInterrupted()
	{
		return interrupted;
	}
	
	public boolean interrupt()
	{
		interrupted = interruptable;
		return interrupted;
	}
}

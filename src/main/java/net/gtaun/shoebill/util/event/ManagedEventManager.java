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

import java.util.HashSet;
import java.util.Set;

import net.gtaun.shoebill.util.event.event.EventListenerEventListener;
import net.gtaun.shoebill.util.event.event.EventListenerRemovedEvent;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * @author MK124
 *
 */

public class ManagedEventManager implements IEventManager
{
	private IEventManager eventManager;
	private EventListenerEventListener eventListenerEventListener;
	private Entry eventListenerEventListenerEntry;
	private Set<Entry> managedListeners;
	
	
	public ManagedEventManager( IEventManager eventManager )
	{
		this.eventManager = eventManager;
		managedListeners = new HashSet<>();
		eventListenerEventListener = new EventListenerEventListener()
		{
			@Override
			public void onEvnetListenerRemoved( EventListenerRemovedEvent event )
			{
				Entry entry = event.getEntry();
				if( managedListeners.contains(entry) ) managedListeners.remove( entry );
			}
		};
		
		eventListenerEventListenerEntry = eventManager.addListener( EventListenerRemovedEvent.class, eventListenerEventListener, Priority.MONITOR );
	}
	
	@Override
	protected void finalize() throws Throwable
	{
		super.finalize();
		eventManager.removeListener( eventListenerEventListenerEntry );
	}

	@Override
	public String toString()
	{
		return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
	}
	
	private void addListenerEntry( Entry entry )
	{
		managedListeners.add( entry );
	}
	
	public void removeAllListener()
	{
		for( Entry entry : managedListeners ) removeListener( entry );
	}
	
	
	@Override
	public Entry addListener( Class<? extends Event> type, EventListener listener, Priority priority )
	{
		Entry entry = eventManager.addListener( type, listener, priority );
		addListenerEntry( entry );
		return entry;
	}

	@Override
	public Entry addListener( Class<? extends Event> type, EventListener listener, short priority )
	{
		Entry entry = eventManager.addListener( type, listener, priority );
		addListenerEntry( entry );
		return entry;
	}

	@Override
	public Entry addListener( Class<? extends Event> type, Class<?> clz, EventListener listener, Priority priority )
	{
		Entry entry = eventManager.addListener( type, clz, listener, priority );
		addListenerEntry( entry );
		return entry;
	}

	@Override
	public Entry addListener( Class<? extends Event> type, Class<?> clz, EventListener listener, short priority )
	{
		Entry entry = eventManager.addListener( type, clz, listener, priority );
		addListenerEntry( entry );
		return entry;
	}

	@Override
	public Entry addListener( Class<? extends Event> type, Object object, EventListener listener, Priority priority )
	{
		Entry entry = eventManager.addListener( type, object, listener, priority );
		addListenerEntry( entry );
		return entry;
	}

	@Override
	public Entry addListener( Class<? extends Event> type, Object object, EventListener listener, short priority )
	{
		Entry entry = eventManager.addListener( type, object, listener, priority );
		addListenerEntry( entry );
		return entry;
	}
	
	@Override
	public Entry addListener( Entry entry )
	{
		Entry ret = eventManager.addListener(entry);
		addListenerEntry( ret );
		return ret;
	}

	@Override
	public void removeListener( Class<? extends Event> type, EventListener listener )
	{
		eventManager.removeListener( type, listener );
	}

	@Override
	public void removeListener( Class<? extends Event> type, Class<?> clz, EventListener listener )
	{
		eventManager.removeListener( type, clz, listener );
	}

	@Override
	public void removeListener( Class<? extends Event> type, Object object, EventListener listener )
	{
		eventManager.removeListener( type, object, listener );
	}
	
	@Override
	public void removeListener( Entry entry )
	{
		eventManager.removeListener( entry );
	}

	@Override
	public boolean hasListener( Class<? extends Event> type, Class<?> clz )
	{
		return eventManager.hasListener( type, clz );
	}

	@Override
	public boolean hasListener( Class<? extends Event> type, Class<?> clz, EventListener listener )
	{
		return eventManager.hasListener( type, clz, listener );
	}

	@Override
	public boolean hasListener( Class<? extends Event> type, Object object )
	{
		return eventManager.hasListener( type, object );
	}

	@Override
	public boolean hasListener( Class<? extends Event> type, Object object, EventListener listener )
	{
		return eventManager.hasListener( type, object, listener );
	}
	
	@Override
	public boolean hasListener( Entry entry )
	{
		return eventManager.hasListener( entry );
	}

	@Override
	public <T extends Event> void dispatchEvent( T event, Object... objects )
	{
		eventManager.dispatchEvent( event, objects );
	}
}

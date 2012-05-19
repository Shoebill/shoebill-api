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

import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

import net.gtaun.shoebill.util.event.event.EventListenerAddedEvent;
import net.gtaun.shoebill.util.event.event.EventListenerRemovedEvent;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * @author MK124
 *
 */

public class EventManager implements IEventManager
{
	private Map<Class<? extends Event>, Map<Object, Queue<Entry>>> listenerEntryContainersMap;
	
	
	public EventManager()
	{
		listenerEntryContainersMap = new ConcurrentHashMap<Class<? extends Event>, Map<Object, Queue<Entry>>>();
	}

	@Override
	public String toString()
	{
		return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
	}

	@Override
	public Entry addListener( Class<? extends Event> type, IEventListener listener, Priority priority )
	{
		return addListener( type, Object.class, listener, priority.getValue() );
	}
	
	@Override
	public Entry addListener( Class<? extends Event> type, IEventListener listener, short priority )
	{
		return addListener( type, Object.class, listener, priority );
	}
	
	@Override
	public Entry addListener( Class<? extends Event> type, Class<?> relatedClass, IEventListener listener, Priority priority )
	{
		return addListener( type, (Object)relatedClass, listener, priority.getValue() );
	}

	@Override
	public Entry addListener( Class<? extends Event> type, Class<?> relatedClass, IEventListener listener, short customPriority )
	{
		return addListener( type, (Object)relatedClass, listener, customPriority );
	}

	@Override
	public Entry addListener( Class<? extends Event> type, Object relatedObject, IEventListener listener, Priority priority )
	{
		return addListener( type, relatedObject, listener, priority.getValue() );
	}

	@Override
	public Entry addListener( Class<? extends Event> type, Object relatedObject, IEventListener listener, short customPriority )
	{
		Entry entry = new Entry( type, relatedObject, listener, customPriority );
		return addListener(entry);
	}
	
	@Override
	public Entry addListener( Entry entry )
	{
		Class<? extends Event> type = entry.getType();
		Object relatedObject = entry.getRelatedObject();
		IEventListener listener = entry.getListener();
		
		Map<Object, Queue<Entry>> objectListenerEntries = listenerEntryContainersMap.get(type);
		if( objectListenerEntries == null )
		{
			objectListenerEntries = new ConcurrentHashMap<>();
			listenerEntryContainersMap.put( type, objectListenerEntries );
		}
		
		Queue<Entry> entries = objectListenerEntries.get(relatedObject);
		if( entries == null )
		{
			entries = new ConcurrentLinkedQueue<>();
			objectListenerEntries.put( relatedObject, entries );
		}
		
		for( Entry e : entries )
		{
			if( e.getListener() != listener ) continue;
			removeListener( type, relatedObject, listener );
		}
		
		entries.add( entry );
		
		EventListenerAddedEvent event = new EventListenerAddedEvent(entry);
		dispatchEvent( event, this );
		
		return entry;
	}


	@Override
	public void removeListener( Class<? extends Event> type, IEventListener listener )
	{
		removeListener( type, Object.class, listener );
	}
	
	@Override
	public void removeListener( Class<? extends Event> type, Class<?> clz, IEventListener listener )
	{
		removeListener( type, (Object)clz, listener );
	}
	
	@Override
	public void removeListener( Class<? extends Event> type, Object relatedObject, IEventListener listener )
	{
		Map<Object, Queue<Entry>> objectListenerEntries = listenerEntryContainersMap.get(type);
		if( objectListenerEntries == null ) return;
		
		Queue<Entry> entries = objectListenerEntries.get(relatedObject);
		if( entries == null ) return;
		
		for( Entry entry : entries )
		{
			if( entry.getListener() != listener ) continue;
			entries.remove( entry );
			
			EventListenerRemovedEvent event = new EventListenerRemovedEvent(entry);
			dispatchEvent( event, this );
		}
		
		if( entries.size() == 0 ) objectListenerEntries.remove( relatedObject );
		if( objectListenerEntries.size() == 0 ) listenerEntryContainersMap.remove( type );
	}
	
	@Override
	public void removeListener( Entry entry )
	{
		Class<? extends Event> type = entry.getType();
		Object relatedObject = entry.getRelatedObject();
		
		Map<Object, Queue<Entry>> objectListenerEntries = listenerEntryContainersMap.get(type);
		if( objectListenerEntries == null ) return;
		
		Queue<Entry> entries = objectListenerEntries.get(relatedObject);
		if( entries == null ) return;
		
		for( Entry e : entries )
		{
			if( e != entry ) continue;
			entries.remove( entry );
			
			EventListenerRemovedEvent event = new EventListenerRemovedEvent(entry);
			dispatchEvent( event, this );
			break;
		}
		
		if( entries.size() == 0 ) objectListenerEntries.remove( relatedObject );
		if( objectListenerEntries.size() == 0 ) listenerEntryContainersMap.remove( type );
	}
	

	@Override
	public boolean hasListener( Class<? extends Event> type, Class<?> clz )
	{
		return hasListener( type, (Object)clz );
	}
	
	@Override
	public boolean hasListener( Class<? extends Event> type, Class<?> clz, IEventListener listener )
	{
		return hasListener( type, (Object)clz, listener );
	}
	
	@Override
	public boolean hasListener( Class<? extends Event> type, Object object )
	{
		Map<Object, Queue<Entry>> objectListenerEntries = listenerEntryContainersMap.get(type);
		if( objectListenerEntries == null ) return false;
		
		Queue<Entry> entries = objectListenerEntries.get(object);
		if( entries == null ) return false;
		
		return true;
	}

	@Override
	public boolean hasListener( Class<? extends Event> type, Object object, IEventListener listener )
	{
		Map<Object, Queue<Entry>> objectListenerEntries = listenerEntryContainersMap.get(type);
		if( objectListenerEntries == null ) return false;
		
		Queue<Entry> entries = objectListenerEntries.get(object);
		if( entries == null ) return false;
		
		for( Entry entry : entries )
		{
			if( entry.getListener() == listener ) return true;
		}
		
		return false;
	}
	
	@Override
	public boolean hasListener( Entry entry )
	{
		Class<? extends Event> type = entry.getType();
		Object relatedObject = entry.getRelatedObject();
		
		Map<Object, Queue<Entry>> objectListenerEntries = listenerEntryContainersMap.get(type);
		if( objectListenerEntries == null ) return false;
		
		Queue<Entry> entries = objectListenerEntries.get(relatedObject);
		if( entries == null ) return false;
		
		for( Entry e : entries )
		{
			if( e == entry ) return true;
		}
		
		return false;
	}
	
	
	@Override
	public <T extends Event> void dispatchEvent( T event, Object ...objects )
	{
		if( objects.length == 1 && objects[0] instanceof Object[] ) objects = (Object[]) objects[0];
		
		Class<? extends Event> type = event.getClass();
		PriorityQueue<Entry> listenerEntryQueue = new PriorityQueue<>( 16,
			new Comparator<Entry>()
			{
				@Override
				public int compare( Entry o1, Entry o2 )
				{
					return o2.getPriority() - o1.getPriority();
				}
			}
		);
		
		Map<Object, Queue<Entry>> objectListenerEntries = listenerEntryContainersMap.get(type);
		if( objectListenerEntries == null ) return;
		
		for( Object object : objects )
		{
			Class<?> cls = object.getClass();
			
			Queue<Entry> entries = objectListenerEntries.get( object );
			if( entries != null ) for( Entry entry : entries )
			{
				if( entry.getListener() == null ) entries.remove( entry );
				else listenerEntryQueue.add( entry );
			}

			Class<?>[] interfaces = cls.getInterfaces();
			for( Class<?> clz : interfaces )
			{
				Queue<Entry> classListenerEntries = objectListenerEntries.get( clz );
				if( classListenerEntries != null ) for( Entry entry : classListenerEntries )
				{
					if( entry.getListener() == null ) entries.remove( entry );
					else listenerEntryQueue.add( entry );
				}
			}
			
			for( Class<?> clz = cls; clz != null; clz = clz.getSuperclass() )
			{
				Queue<Entry> classListenerEntries = objectListenerEntries.get( clz );
				if( classListenerEntries != null ) for( Entry entry : classListenerEntries )
				{
					if( entry.getListener() == null ) entries.remove( entry );
					else listenerEntryQueue.add( entry );
				}
			}
		}
		
		Set<Entry> processedHandler = new HashSet<>( listenerEntryQueue.size() );
		while( listenerEntryQueue.isEmpty() == false && event.isInterrupted() == false )
		{
			Entry entry = listenerEntryQueue.poll();
			IEventListener listener = entry.getListener();
			
			if( listener == null ) continue;
			
			if( processedHandler.contains(entry) ) return;
			processedHandler.add( entry );
			
			try
			{
				listener.handleEvent( event );
			}
			catch( Exception e )
			{
				e.printStackTrace();
			}
		}
	}
}

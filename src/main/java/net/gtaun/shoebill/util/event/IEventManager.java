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

public interface IEventManager
{
	public static class Entry
	{
		private Class<? extends Event> type;
		private Object relatedObject;
		private IEventListener listener;
		private short priority;
	
		public Class<? extends Event> getType()			{ return type; }
		public Object getRelatedObject()				{ return relatedObject; }
		public IEventListener getListener()				{ return listener; }
		public short getPriority()						{ return priority; }
		
		
		public Entry( Class<? extends Event> type, Object relatedObject, IEventListener listener, short priority )
		{
			this.type = type;
			this.relatedObject = relatedObject;
			this.listener = listener;
			this.priority = priority;
		}

		@Override
		public String toString()
		{
			return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
		}
		
		public Class<?> getRelatedClass()
		{
			if( relatedObject instanceof Class ) return (Class<?>) relatedObject;
			return null;
		}
	}
	
	public enum Priority
	{
		BOTTOM		( (short) -32768 ),
		LOWEST		( (short) -16384 ),
		LOW			( (short) -8192 ),
		NORMAL		( (short) 0 ),
		HIGH		( (short) 8192 ),
		HIGHEST		( (short) 16384 ),
		MONITOR		( (short) 32767 );
	
		private final short value;
	
		
		private Priority( short value )
		{
			this.value = value;
		}
	
		public short getValue()
		{
			return value;
		}
	}
	
	
	Entry addListener( Class<? extends Event> type, IEventListener listener, Priority priority );
	Entry addListener( Class<? extends Event> type, IEventListener listener, short priority );
	Entry addListener( Class<? extends Event> type, Class<?> clz, IEventListener listener, Priority priority );
	Entry addListener( Class<? extends Event> type, Class<?> clz, IEventListener listener, short priority );
	Entry addListener( Class<? extends Event> type, Object object, IEventListener listener, Priority priority );
	Entry addListener( Class<? extends Event> type, Object object, IEventListener listener, short priority );
	Entry addListener( Entry entry );

	void removeListener( Class<? extends Event> type, IEventListener listener );
	void removeListener( Class<? extends Event> type, Class<?> clz, IEventListener listener );
	void removeListener( Class<? extends Event> type, Object object, IEventListener listener );
	void removeListener( Entry entry );

	boolean hasListener( Class<? extends Event> type, Class<?> clz );
	boolean hasListener( Class<? extends Event> type, Class<?> clz, IEventListener listener );
	boolean hasListener( Class<? extends Event> type, Object object );
	boolean hasListener( Class<? extends Event> type, Object object, IEventListener listener );
	boolean hasListener( Entry entry );
	
	<T extends Event> void dispatchEvent( T event, Object ...objects );
}

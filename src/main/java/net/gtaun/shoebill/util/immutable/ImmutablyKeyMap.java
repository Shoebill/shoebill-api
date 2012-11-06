/**
 * Copyright (C) 2012 MK124
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

package net.gtaun.shoebill.util.immutable;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * 
 * 
 * @author MK124
 */
public class ImmutablyKeyMap<K extends Immutable, V> implements Map<K, V>, Serializable
{
	private static final long serialVersionUID = -8268080368867522132L;
	
	
	private final Map<K, V> map;
	
	
	public ImmutablyKeyMap(Map<K, V> m)
	{
		if (m == null) throw new NullPointerException();
		this.map = m;
	}
	
	@Override
	public int size()
	{
		return map.size();
	}
	
	@Override
	public boolean isEmpty()
	{
		return map.isEmpty();
	}
	
	@Override
	public boolean containsKey(Object key)
	{
		return map.containsKey(key);
	}
	
	@Override
	public boolean containsValue(Object value)
	{
		return map.containsValue(value);
	}
	
	@Override
	public V get(Object key)
	{
		return map.get(key);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public V put(K key, V value)
	{
		return map.put((K) key.immure(), value);
	}
	
	@Override
	public V remove(Object key)
	{
		return map.remove(key);
	}
	
	@Override
	public void putAll(Map<? extends K, ? extends V> m)
	{
		map.putAll(m);
	}
	
	@Override
	public void clear()
	{
		map.clear();
	}
	
	@Override
	public Set<K> keySet()
	{
		return map.keySet();
	}
	
	@Override
	public Set<Map.Entry<K, V>> entrySet()
	{
		return map.entrySet();
	}
	
	@Override
	public Collection<V> values()
	{
		return map.values();
	}
	
	@Override
	public boolean equals(Object o)
	{
		return map.equals(o);
	}
	
	@Override
	public int hashCode()
	{
		return map.hashCode();
	}
	
	@Override
	public String toString()
	{
		return map.toString();
	}
	
	private void writeObject(ObjectOutputStream s) throws IOException
	{
		s.defaultWriteObject();
	}
}
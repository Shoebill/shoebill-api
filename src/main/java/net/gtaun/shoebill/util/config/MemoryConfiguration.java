/**
 * Copyright (C) 2012 MK124
 * Copyright (C) 2012 JoJLlmAn
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

package net.gtaun.shoebill.util.config;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 
 * 
 * @author MK124, JoJLlmAn
 */
public class MemoryConfiguration implements Configuration
{
	private Map<String, Object> root;
	
	
	public MemoryConfiguration()
	{
		this(null);
	}
	
	public MemoryConfiguration(Map<String, Object> root)
	{
		setRoot((root != null) ? root : new HashMap<String, Object>());
	}
	
	@Override
	public String toString()
	{
		return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
	}
	
	public void setRoot(Map<String, Object> root)
	{
		this.root = root;
	}
	
	public Map<String, Object> getRoot()
	{
		return root;
	}
	
	@SuppressWarnings("unchecked")
	public Map<String, Object> getMap(String path)
	{
		return (Map<String, Object>) get(path);
	}
	
	public void setMap(String path, Map<String, Object> value)
	{
		set(path, value);
	}
	
	@Override
	public boolean contains(String path)
	{
		return get(path) != null;
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public Object get(String path)
	{
		String[] childs = StringUtils.split(path, '.');
		if (childs.length == 0) return root;
		
		Map<String, Object> node = root;
		for (int i = 0; i < childs.length - 1; i++)
		{
			Object obj = node.get(childs[i]);
			if (obj instanceof Map<?, ?> == false) return null;
			node = (HashMap<String, Object>) obj;
		}
		
		return node.get(childs[childs.length - 1]);
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public void set(String path, Object value)
	{
		String[] childs = StringUtils.split(path, '.');
		
		Map<String, Object> node = root;
		for (int i = 0; i < childs.length - 1; i++)
		{
			Object obj = node.get(childs[i]);
			if (obj instanceof Map<?, ?> == false)
			{
				obj = new HashMap<>();
				node.put(childs[i], obj);
			}
			
			node = (Map<String, Object>) obj;
		}
		
		node.put(childs[childs.length - 1], value);
		return;
	}
	
	@Override
	public MemoryConfiguration getNode(String path)
	{
		return new MemoryConfiguration(getMap(path));
	}
	
	@Override
	public String getString(String path)
	{
		return getString(path, "");
	}
	
	@Override
	public String getString(String path, String def)
	{
		Object obj = get(path);
		return (obj == null) ? def : obj.toString();
	}
	
	@Override
	public void setString(String path, Object value)
	{
		set(path, value.toString());
	}
	
	@Override
	public boolean isString(String path)
	{
		return get(path) instanceof String;
	}
	
	@Override
	public int getInt(String path)
	{
		return getInt(path, 0);
	}
	
	@Override
	public int getInt(String path, int def)
	{
		Object obj = get(path);
		return (obj == null) ? def : (Integer) obj;
	}
	
	@Override
	public void setInt(String path, int value)
	{
		set(path, value);
	}
	
	@Override
	public boolean isInt(String path)
	{
		return get(path) instanceof Integer;
	}
	
	@Override
	public long getLong(String path)
	{
		return getLong(path, 0L);
	}
	
	@Override
	public long getLong(String path, long def)
	{
		Object obj = get(path);
		return (obj == null) ? def : (Long) obj;
	}
	
	@Override
	public void setLong(String path, long value)
	{
		set(path, value);
	}
	
	@Override
	public boolean isLong(String path)
	{
		return get(path) instanceof Long;
	}
	
	@Override
	public double getDouble(String path)
	{
		return getDouble(path, Double.NaN);
	}
	
	@Override
	public double getDouble(String path, double def)
	{
		Object obj = get(path);
		return (obj == null) ? def : (Double) obj;
	}
	
	@Override
	public void setDouble(String path, double value)
	{
		set(path, value);
	}
	
	@Override
	public boolean isDouble(String path)
	{
		return get(path) instanceof Double;
	}
	
	@Override
	public boolean getBoolean(String path)
	{
		return getBoolean(path, false);
	}
	
	@Override
	public boolean getBoolean(String path, boolean def)
	{
		Object obj = get(path);
		return (obj == null) ? def : (Boolean) obj;
	}
	
	@Override
	public void setBoolean(String path, boolean value)
	{
		set(path, value);
	}
	
	@Override
	public boolean isBoolean(String path)
	{
		return get(path) instanceof Boolean;
	}
	
	@Override
	public List<?> getList(String path)
	{
		Object o = get(path);
		return o instanceof List ? (List<?>) o : new ArrayList<Object>();
	}
	
	@Override
	public void setList(String path, List<?> value)
	{
		set(path, value);
	}
	
	@Override
	public boolean isList(String path)
	{
		return get(path) instanceof List;
	}
	
	@Override
	public List<String> getStringList(String path, List<String> def)
	{
		List<?> raw = getList(path);
		if (raw == null) { return (def != null) ? def : new ArrayList<String>(); }
		
		List<String> list = new ArrayList<>();
		for (Object o : raw)
		{
			if (o != null) list.add(o.toString());
		}
		
		return list;
	}
	
	@Override
	public List<Integer> getIntList(String path, List<Integer> def)
	{
		List<?> raw = getList(path);
		if (raw == null) { return (def != null) ? def : new ArrayList<Integer>(); }
		
		List<Integer> list = new ArrayList<>();
		for (Object o : raw)
		{
			Integer i = Integer.parseInt(o.toString());
			if (i != null) list.add(i);
		}
		
		return list;
	}
	
	@Override
	public List<Double> getDoubleList(String path, List<Double> def)
	{
		List<?> raw = getList(path);
		if (raw == null) { return (def != null) ? def : new ArrayList<Double>(); }
		
		List<Double> list = new ArrayList<>();
		for (Object o : raw)
		{
			Double d = Double.parseDouble(o.toString());
			if (d != null) list.add(d);
		}
		
		return list;
	}
	
	@Override
	public List<Boolean> getBooleanList(String path, List<Boolean> def)
	{
		List<?> raw = getList(path);
		if (raw == null) { return (def != null) ? def : new ArrayList<Boolean>(); }
		
		List<Boolean> list = new ArrayList<>();
		for (Object o : raw)
		{
			Boolean b = Boolean.parseBoolean(o.toString());
			if (b != null) list.add(b);
		}
		
		return list;
	}
}

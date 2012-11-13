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

package net.gtaun.shoebill.proxy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 
 * 
 * @author MK124
 */
public interface ProxyableFactory<T extends Proxyable>
{
	public static final class Impl
	{
		static Class<?> implClass;
		
		@SuppressWarnings("unchecked")
		public static <T extends Proxyable> ProxyableFactory<T> createProxyableFactory(Class<T> clz)
		{
			try
			{
				Constructor<?> constructor = implClass.getConstructor(Class.class);
				return ProxyableFactory.class.cast(constructor.newInstance(clz));
			}
			catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException e)
			{
				e.printStackTrace();
				return null;
			}
		}
	}
	
	
	T create();
	T create(Class<?>[] paramTypes, Object... params);
}

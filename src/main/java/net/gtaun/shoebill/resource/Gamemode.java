/**
 * Copyright (C) 2012-2014 MK124
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

package net.gtaun.shoebill.resource;

/**
 * 
 * 
 * @author MK124
 */
public abstract class Gamemode extends Resource
{
    /**
     * Gets the Gamemode.
     * @return The Gamemode
     */
	public static Gamemode get()
	{
		return ResourceManager.get().getGamemode();
	}

	/**
	 * Gets a Gamemode by its class.
	 * @param gamemodeClass Class instance of the Gamemode.
	 * @param <T> Class type of the Gamemode.
	 * @return The found Gamemode.
	 */
	public static <T extends Gamemode> T getGamemode(Class<T> gamemodeClass)
	{
		return ResourceManager.get().getGamemode(gamemodeClass);
	}
	
	protected Gamemode()
	{
		
	}
}

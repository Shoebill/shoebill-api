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

package net.gtaun.shoebill;

import java.io.File;
import java.util.Collection;

import net.gtaun.shoebill.resource.Gamemode;
import net.gtaun.shoebill.resource.GamemodeDescription;

/**
 * @author MK124
 *
 */

public interface GamemodeManager
{
	void changeMode( String filename );
	void changeMode( File file );
	void changeMode( GamemodeDescription desc );
	
	Gamemode getGamemode();
	<T extends Gamemode> T getGamemode( Class<T> cls );

	Collection<GamemodeDescription> getGamemodeDescriptions();
}

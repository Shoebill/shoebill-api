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

package net.gtaun.shoebill.resource;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import net.gtaun.shoebill.GamemodeManager;
import net.gtaun.shoebill.Shoebill;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author MK124
 *
 */

public class GamemodeManagerImpl implements GamemodeManager
{
	private static final Logger LOGGER = LoggerFactory.getLogger(GamemodeManagerImpl.class);
	
	
	private Shoebill shoebill;
	private ClassLoader classLoader;
	private File gamemodeDir, dataDir;
	
	private Map<File, GamemodeDescription> descriptions;
	private Gamemode gamemode;
	
	
	public GamemodeManagerImpl( Shoebill shoebill, ClassLoader classLoader, File gamemodeDir, File dataDir )
	{
		this.shoebill = shoebill;
		this.classLoader = classLoader;
		this.gamemodeDir = gamemodeDir;
		this.dataDir = dataDir;
		
		this.descriptions = generateDescriptions( gamemodeDir );
	}

	@Override
	public String toString()
	{
		return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
	}
	
	private GamemodeDescription generateDescription( File file ) throws ClassNotFoundException, IOException
	{
		GamemodeDescription desc = new GamemodeDescription(file, classLoader);
		return desc;
	}
	
	private Map<File, GamemodeDescription> generateDescriptions( File dir )
	{
		Map<File, GamemodeDescription> descriptions = new HashMap<>();
		Collection<File> files = FileUtils.listFiles(dir, new String[]{ "jar" }, true );
		
		for( File file : files ) try
		{
			GamemodeDescription desc = generateDescription( file );
			descriptions.put( file, desc );
		}
		catch( Exception e )
		{
			e.printStackTrace();
		}
				
		return descriptions;
	}
	
	public Gamemode constructGamemode( File file )
	{
		LOGGER.info("Load gamemode: " + file.getName() );
		
		try
		{
			GamemodeDescription desc = descriptions.get( file );
			if( desc == null ) desc = new GamemodeDescription(file, classLoader);
			gamemode = desc.getClazz().newInstance();
			gamemode.setContext( desc, shoebill, new File(dataDir, desc.getClazz().getName()) );
			gamemode.enable();
		}
		catch( Throwable e )
		{
			e.printStackTrace();
		}
		
		return gamemode;
	}
	
	public void deconstructGamemode()
	{
		try
		{
			gamemode.disable();
			gamemode = null;
		}
		catch( Throwable e )
		{
			e.printStackTrace();
		}
	}

	@Override
	public void changeMode( String filename )
	{
		File file = new File(gamemodeDir, filename);
		changeMode( file );
	}

	@Override
	public void changeMode( File file )
	{
		if( file.canRead() == false ) return;
		
		GamemodeDescription desc = descriptions.get( file );
		if( desc == null ) try
		{
			desc = new GamemodeDescription(file, classLoader);
		}
		catch( Exception e )
		{
			e.printStackTrace();
		}
		
		if( desc == null ) return;
		changeMode( desc );
	}
	
	@Override
	public void changeMode( GamemodeDescription desc )
	{
		shoebill.changeGamemode( desc.getFile() );
	}

	@Override
	public Gamemode getGamemode()
	{
		return gamemode;
	}

	@Override
	public <T extends Gamemode> T getGamemode( Class<T> cls )
	{
		return cls.cast( gamemode );
	}

	@Override
	public Collection<GamemodeDescription> getGamemodeDescriptions()
	{
		return new ArrayList<>( descriptions.values() );
	}
}

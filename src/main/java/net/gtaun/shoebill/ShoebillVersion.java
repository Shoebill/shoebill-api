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

import java.io.InputStream;

import net.gtaun.shoebill.util.config.YamlConfiguration;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * @author MK124
 *
 */

public class ShoebillVersion
{
	private String name;
	private String version;
	private String support;
	private int buildNumber;
	private String buildDate;
	
	
	public ShoebillVersion( InputStream in )
	{
		YamlConfiguration config = new YamlConfiguration();
		config.read( in );

		version = config.getString( "version", "Unknown" );
		support = config.getString( "support", "Unknown" );
		buildNumber = config.getInt( "buildNumber", 0 );
		buildDate = config.getString( "buildDate", "Unknown" );
		
		if( version.charAt(version.length()-1) == '.' ) version = version.substring(0, version.length()-1);
	}

	@Override
	public String toString()
	{
		return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getVersion()
	{
		return version;
	}
	
	public String getSupport()
	{
		return support;
	}
	
	public int getBuildNumber()
	{
		return buildNumber;
	}
	
	public String getBuildDate()
	{
		return buildDate;
	}
}

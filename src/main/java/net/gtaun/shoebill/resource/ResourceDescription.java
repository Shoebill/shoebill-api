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
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import net.gtaun.shoebill.util.config.Configuration;
import net.gtaun.shoebill.util.config.FileConfiguration;
import net.gtaun.shoebill.util.config.YamlConfiguration;

/**
 * 
 * 
 * @author MK124
 */
public class ResourceDescription
{
	private ResourceType type;
	private File file;
	private ClassLoader classLoader;
	private Class<? extends Resource> clazz;
	private String name;
	private String version;
	private List<String> authors;
	private String description;
	private int buildNumber;
	private String buildDate;
	
	
	public ResourceDescription(ResourceType type, File file, ClassLoader classLoader) throws ClassNotFoundException, IOException
	{
		this.type = type;
		this.file = file;
		this.classLoader = classLoader;
		
		loadConfig(type.getConfigFilename());
	}
	
	private Configuration loadConfig(String configFilename) throws IOException, ClassNotFoundException
	{
		JarFile jarFile = new JarFile(file);
		JarEntry entry = jarFile.getJarEntry(configFilename);
		InputStream in = jarFile.getInputStream(entry);
		
		FileConfiguration config = new YamlConfiguration();
		config.read(in);
		
		String className = config.getString("class");
		clazz = classLoader.loadClass(className).asSubclass(Resource.class);
		
		name = config.getString("name", "Unnamed");
		version = config.getString("version");
		
		String author = config.getString("authors");
		authors = new ArrayList<>();
		String[] tokens = author.split("[,;]");
		
		if (tokens.length > 0)
		{
			for (String a : tokens)
			{
				authors.add(a.trim());
			}
		}
		else
		{
			authors.add(author.trim());
		}
		
		description = config.getString("description");
		buildNumber = config.getInt("buildNumber", 0);
		buildDate = config.getString("buildDate", "Unknown");
		
		return config;
	}
	
	public ResourceType getType()
	{
		return type;
	}
	
	public File getFile()
	{
		return file;
	}
	
	public Class<? extends Resource> getClazz()
	{
		return clazz;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getVersion()
	{
		return version;
	}
	
	public List<String> getAuthors()
	{
		return authors;
	}
	
	public String getDescription()
	{
		return description;
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

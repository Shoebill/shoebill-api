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

    /**
     * Will create an instance of ResourceDescription with params.
     * @param type The Resourcetype
     * @param file The Location of the File to load.
     * @param classLoader The Classloader
     * @throws ClassNotFoundException
     * @throws IOException
     */
	public ResourceDescription(ResourceType type, File file, ClassLoader classLoader) throws ClassNotFoundException, IOException
	{
		this.type = type;
		this.file = file;
		this.classLoader = classLoader;
		
		loadConfig(type.getConfigFilename());
	}

    /**
     * Lets you load a Configuration by its Filename
     * @param configFilename The Filename of the Config
     * @return The loaded Configuration
     * @throws IOException
     * @throws ClassNotFoundException
     */
	private Configuration loadConfig(String configFilename) throws IOException, ClassNotFoundException
	{
		try(JarFile jarFile = new JarFile(file))
		{
			JarEntry entry = jarFile.getJarEntry(configFilename);
			InputStream in = jarFile.getInputStream(entry);
			
			FileConfiguration config = new YamlConfiguration();
			config.setDefault("name", "Unnamed");
			config.setDefault("version", "Unknown");
			config.setDefault("authors", "Unknown");
			config.setDefault("description", "");
			config.setDefault("buildNumber", 0);
			config.setDefault("buildDate", "Unknown");
			
			config.read(in);
			
			String className = config.getString("class");
			clazz = classLoader.loadClass(className).asSubclass(Resource.class);
			
			name = config.getString("name");
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
			buildNumber = config.getInt("buildNumber");
			buildDate = config.getString("buildDate");
			
			return config;
		}
	}

    /**
     * Gets the ResourceType
     * @return The ResourceType
     */
	public ResourceType getType()
	{
		return type;
	}

    /**
     * Gets the File of the ResourceDescription instance.
     * @return The File
     */
	public File getFile()
	{
		return file;
	}

    /**
     * Gets the class of the instance.
     * @return The Class
     */
	public Class<? extends Resource> getClazz()
	{
		return clazz;
	}

    /**
     * Gets the name of the ResourceDescription.
     * @return The Name
     */
	public String getName()
	{
		return name;
	}

    /**
     * Gets the version of the ResourceDescription.
     * @return The Version
     */
	public String getVersion()
	{
		return version;
	}

    /**
     * Gets the List of Authors.
     * @return A List of Authors
     */
	public List<String> getAuthors()
	{
		return authors;
	}

    /**
     * Gets the Description of the ResourceDescription.
     * @return The Description
     */
	public String getDescription()
	{
		return description;
	}

    /**
     * Gets the Buildnumber of the ResourceDescription.
     * @return The Buildnumber
     */
	public int getBuildNumber()
	{
		return buildNumber;
	}

    /**
     * Gets the Builddate.
     * @return The Builddate
     */
	public String getBuildDate()
	{
		return buildDate;
	}
}

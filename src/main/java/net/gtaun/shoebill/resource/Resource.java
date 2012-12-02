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

import net.gtaun.shoebill.Shoebill;
import net.gtaun.shoebill.ShoebillLowLevel;
import net.gtaun.shoebill.service.Service;
import net.gtaun.shoebill.service.ServiceManager;
import net.gtaun.util.event.EventManager;
import net.gtaun.util.event.ManagedEventManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * 
 * @author MK124
 */
@SuppressWarnings("deprecation")
public abstract class Resource
{
	private boolean isEnabled;
	
	private ResourceDescription description;
	private Shoebill shoebill;
	private ManagedEventManager eventManager;
	private File dataDirectory;
	
	
	protected Resource()
	{
		
	}
	
	void setContext(ResourceDescription description, Shoebill shoebill, File dataDir)
	{
		this.description = description;
		this.shoebill = shoebill;
		this.dataDirectory = dataDir;
		
		ShoebillLowLevel shoebillLowLevel = (ShoebillLowLevel) shoebill;
		eventManager = new ManagedEventManager(shoebillLowLevel.getEventManager());
	}
	
	protected abstract void onEnable() throws Throwable;
	protected abstract void onDisable() throws Throwable;
	
	void enable() throws Throwable
	{
		onEnable();
		isEnabled = true;
	}
	
	void disable() throws Throwable
	{
		onDisable();
		
		eventManager.removeAllHandler();
		
		ServiceManager serviceManager = (ServiceManager) getShoebill().getServiceStore();
		serviceManager.unregisterServices(this);
		
		isEnabled = false;
	}
	
	public boolean isEnabled()
	{
		return isEnabled;
	}
	
	public ResourceDescription getDescription()
	{
		return description;
	}
	
	public Shoebill getShoebill()
	{
		return shoebill;
	}
	
	public EventManager getEventManager()
	{
		return eventManager;
	}
	
	public File getDataDirectory()
	{
		return dataDirectory;
	}
	
	public Logger getLogger()
	{
		return LoggerFactory.getLogger(description.getClazz());
	}
	
	public <T extends Service> void registerService(Class<T> type, T service)
	{
		ServiceManager serviceManager = (ServiceManager) getShoebill().getServiceStore();
		serviceManager.registerService(this, type, service);
	}
	
	public <T extends Service> void unregisterService(Class<T> type, T service)
	{
		ServiceManager serviceManager = (ServiceManager) getShoebill().getServiceStore();
		serviceManager.unregisterService(this, type, service);
	}
}

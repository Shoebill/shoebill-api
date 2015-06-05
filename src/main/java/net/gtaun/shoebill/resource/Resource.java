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

import net.gtaun.shoebill.Shoebill;
import net.gtaun.shoebill.event.resource.ResourceDisableEvent;
import net.gtaun.shoebill.event.resource.ResourceEnableEvent;
import net.gtaun.shoebill.service.Service;
import net.gtaun.shoebill.service.ServiceManager;
import net.gtaun.util.event.EventManager;
import net.gtaun.util.event.EventManagerNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.Deque;
import java.util.LinkedList;

/**
 * 
 * 
 * @author MK124
 */
public abstract class Resource
{	
	private boolean isEnabled;
	
	private ResourceDescription description;
	private Shoebill shoebill;
	private EventManager rootEventManager;
	private EventManagerNode eventManager;
	private File dataDir;
	private Deque<Runnable> onDisableCalls;
	
	
	Resource()
	{
		
	}

    /**
     * Sets the Context of the Resource instance.
     * @param description The ResourceDescription instance.
     * @param shoebill Active Shoebill instance.
     * @param rootEventManager The parent Eventmanager
     * @param dataDir The Data Directory
     */
	void setContext(ResourceDescription description, Shoebill shoebill, EventManager rootEventManager, File dataDir)
	{
		this.description = description;
		this.shoebill = shoebill;
		this.rootEventManager = rootEventManager;
		this.dataDir = dataDir;
		this.onDisableCalls = new LinkedList<>();
	}

    /**
     * Gets called when the Resource is getting enabled.
     * @throws Throwable
     */
	protected abstract void onEnable() throws Throwable;

    /**
     * Gets called when the Resource is getting unloaded.
     * @throws Throwable
     */
	protected abstract void onDisable() throws Throwable;
	
    /**
     * Gets called when the Resource is getting enabled.
     * @throws Throwable
     */
	protected void enable() throws Throwable
	{
		eventManager = rootEventManager.createChildNode();
		
		onEnable();
		isEnabled = true;
		
		ResourceEnableEvent event = new ResourceEnableEvent(this);
		eventManager.dispatchEvent(event, getEventManager(), this);
	}
	
    /**
     * Gets called when the Resource is getting unloaded.
     * @throws Throwable
     */
	protected void disable() throws Throwable
	{
		ResourceDisableEvent event = new ResourceDisableEvent(this);
		eventManager.dispatchEvent(event, getEventManager(), this);
		
		Throwable throwable = null;
		try
		{
			if (isEnabled) onDisable();
			while (!onDisableCalls.isEmpty()) onDisableCalls.pollLast().run();
		}
		catch (Throwable e)
		{
			throwable = e;
		}
		
		eventManager.destroy();
		eventManager = null;
		
		ServiceManager serviceManager = (ServiceManager) getShoebill().getServiceStore();
		serviceManager.unregisterAllServices(this);
		
		isEnabled = false;
		if (throwable != null) throw throwable;
	}

	public void onDisable(Runnable runnable)
	{
		onDisableCalls.offer(runnable);
	}

    /**
     * Checks if the Resource is enabled.
     * @return The state of the Resource (boolean).
     */
	public boolean isEnabled()
	{
		return isEnabled;
	}

    /**
     * Gets the ResourceDescription of the Resource
     * @return The ResourceDescription.
     */
	public ResourceDescription getDescription()
	{
		return description;
	}

    /**
     * Gets the active Shoebill instance from the Resource.
     * @return Shoebill instance.
     */
	public Shoebill getShoebill()
	{
		return shoebill;
	}

    /**
     * Gets the event Manager.
     * @return The Eventmanager
     */
	public EventManager getEventManager()
	{
		return eventManager;
	}

    /**
     * Gets the Datadir.
     * @return The Datadir
     */
	public File getDataDir()
	{
		return dataDir;
	}

    /**
     * Gets the Logger
     * @return The Logger
     */
	public Logger getLogger()
	{
		return LoggerFactory.getLogger(description.getClazz());
	}

    /**
     * Registers a Service
     * @param type Class instance.
     * @param service The Service
     * @param <T> Type of the service
     */
	public <T extends Service> void registerService(Class<T> type, T service)
	{
		ServiceManager serviceManager = (ServiceManager) getShoebill().getServiceStore();
		serviceManager.registerService(this, type, service);
	}

    /**
     * Unregisters a Service by its class
     * @param type The Class instance
     * @param <T> The Class type
     */
	public <T extends Service> void unregisterService(Class<T> type)
	{
		ServiceManager serviceManager = (ServiceManager) getShoebill().getServiceStore();
		serviceManager.unregisterService(this, type);
	}
}

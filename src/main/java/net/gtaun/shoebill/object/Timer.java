/**
 * Copyright (C) 2011 MK124
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

package net.gtaun.shoebill.object;

import net.gtaun.shoebill.SampObjectManager;

/**
 * 
 * 
 * @author MK124
 */
public interface Timer extends Destroyable
{
    /**
     * Create a Timer with params.
     * @param interval The interval in miliseconds.
     * @param count How often the Timer will get called.
     * @param callback The callback which will get invoked after the interval.
     * @return The created Timer.
     */
	public static Timer create(int interval, int count, TimerCallback callback)
	{
		return SampObjectManager.get().createTimer(interval, count, callback);
	}

    /**
     * Create a Timer with params.
     * @param interval The interval in miliseconds.
     * @param count How often the Timer will get called.
     * @return The created Timer.
     */
	public static Timer create(int interval, int count)
	{
		return SampObjectManager.get().createTimer(interval, count);
	}

    /**
     * Create a Timer with params.
     * @param interval The interval in miliseconds.
     * @param callback The callback which will get invoked after the interval.
     * @return The created Timer.
     */
	public static Timer create(int interval, TimerCallback callback)
	{
		return SampObjectManager.get().createTimer(interval, callback);
	}
	
    /**
     * Create a Timer with params.
     * @param interval The interval in miliseconds.
     * @return The created Timer.
     */
	public static Timer create(int interval)
	{
		return SampObjectManager.get().createTimer(interval);
	}
	
	
	@FunctionalInterface
	public interface TimerCallback
	{
		void onTick(int factualInterval);
		
		default void onStart()	{ }
		default void onStop()	{ }
	}
	
	
	public static final int COUNT_INFINITE = 0;
	
	
	int getInterval();
	int getCount();

	boolean isRunning();
	
	void setInterval(int ms);
	void setCount(int count);
	void start();
	void stop();

	void setCallback(TimerCallback callback);
}

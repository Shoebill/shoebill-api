/**
 * Copyright (C) 2011 MK124

 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at

 * http://www.apache.org/licenses/LICENSE-2.0

 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.gtaun.shoebill.entities

import net.gtaun.shoebill.SampObjectManager

/**
 * This class allows you to create timed actions.
 *
 * @author MK124
 * @author Marvin Haschker
 */
abstract class Timer : Destroyable {

    abstract var callback: TimerCallback?

    abstract var interval: Int
    abstract var count: Int

    var elapsedCounts: Int = 0
        private set

    abstract val isRunning: Boolean

    abstract fun start()
    abstract fun stop()

    companion object {

        /**
         * Creates a Timer with params.
         */
        @JvmStatic
        fun create(interval: Int, callback: TimerCallback? = null): Timer = create(interval, COUNT_INFINITE, callback)

        /**
         * Create a Timer with params.
         * @param interval The interval in miliseconds.
         * @param count How often the Timer will get called.
         * @param callback The callback which will get invoked after the interval.
         * @return The created Timer.
         */
        @JvmStatic
        @JvmOverloads
        fun create(interval: Int, count: Int = COUNT_INFINITE, callback: TimerCallback? = null): Timer =
                SampObjectManager.get().createTimer(interval, count, callback)

        @JvmField
        val COUNT_INFINITE = 0
    }
}

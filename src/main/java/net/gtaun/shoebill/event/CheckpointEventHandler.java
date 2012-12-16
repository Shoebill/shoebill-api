/**
 * Copyright (C) 2011-2012 MK124
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

package net.gtaun.shoebill.event;

import net.gtaun.shoebill.event.checkpoint.CheckpointEnterEvent;
import net.gtaun.shoebill.event.checkpoint.CheckpointLeaveEvent;
import net.gtaun.shoebill.event.checkpoint.RaceCheckpointEnterEvent;
import net.gtaun.shoebill.event.checkpoint.RaceCheckpointLeaveEvent;
import net.gtaun.util.event.AbstractEventHandler;

/**
 * 
 * 
 * @author MK124
 */
public abstract class CheckpointEventHandler extends AbstractEventHandler
{
	protected CheckpointEventHandler()
	{
		super(CheckpointEventHandler.class);
	}

	protected void onCheckpointEnter(CheckpointEnterEvent event)					{ }
	protected void onCheckpointLeave(CheckpointLeaveEvent event)					{ }
	protected void onRaceCheckpointEnter(RaceCheckpointEnterEvent event )			{ }
	protected void onRaceCheckpointLeave(RaceCheckpointLeaveEvent event )			{ }
}

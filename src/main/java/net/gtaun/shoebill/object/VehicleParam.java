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

/**
 * 
 * 
 * @author MK124
 */
public interface VehicleParam extends VehicleRelated
{
	public static final int PARAM_UNSET =	-1;
	public static final int PARAM_OFF =		0;
	public static final int PARAM_ON =		1;
	
	
	int getEngine();
	int getLights();
	int getAlarm();
	int getDoors();
	int getBonnet();
	int getBoot();
	int getObjective();
	
	void setEngine(int engine);
	void setLights(int lights);
	void setAlarm(int alarm);
	void setDoors(int doors);
	void setBonnet(int bonnet);
	void setBoot(int boot);
	void setObjective(int objective);
	
	void set(int engine, int lights, int alarm, int doors, int bonnet, int boot, int objective);
}

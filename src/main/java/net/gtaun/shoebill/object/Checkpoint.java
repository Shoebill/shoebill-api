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

package net.gtaun.shoebill.object;

import java.util.Collection;

import net.gtaun.shoebill.data.Radius;
import net.gtaun.shoebill.data.Vector3D;
import net.gtaun.shoebill.proxy.Proxyable;

/**
 * 
 * 
 * @author MK124
 */
public interface Checkpoint extends Proxyable
{
	Radius getLocation();
	void setLocation(float x, float y, float z);
	void setLocation(Vector3D pos);
	void setLocation(Radius loc);

	float getRadius();
	void setRadius(float radius);

	void set(Player player);
	void disable(Player player);
	boolean isInArea(Player player);
	void update();
	
	Collection<Player> getUsingPlayers();
}

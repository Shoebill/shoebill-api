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

package net.gtaun.shoebill.object.primitive;

import net.gtaun.shoebill.data.Color;
import net.gtaun.shoebill.data.Location;
import net.gtaun.shoebill.data.Point3D;

/**
 * @author MK124
 *
 */

public interface LabelPrim extends Destroyable
{
	public static final int INVALID_ID =				0xFFFF;
	
	
	int getId();
	String getText();
	Color getColor();
	float getDrawDistance();
	Location getLocation();
	
	PlayerPrim getAttachedPlayer();
	VehiclePrim getAttachedVehicle();

	void attach( PlayerPrim player, float x, float y, float z );
	void attach( PlayerPrim player, Point3D offset );
	void attach( VehiclePrim vehicle, float x, float y, float z );
	void attach( VehiclePrim vehicle, Point3D offset );
	void update( Color color, String text );
}

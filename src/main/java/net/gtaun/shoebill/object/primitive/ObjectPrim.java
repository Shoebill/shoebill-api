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

import net.gtaun.shoebill.data.Location;
import net.gtaun.shoebill.data.Point3D;

/**
 * @author MK124
 *
 */

public interface ObjectPrim extends Destroyable
{
	public static final int INVALID_ID =				0xFFFF;
	
	
	int getId();
	int getModelId();
	float getSpeed();
	float getDrawDistance();
	
	PlayerPrim getAttachedPlayer();
	ObjectPrim getAttachedObject();
	VehiclePrim getAttachedVehicle();
	
	Location getLocation();
	void setLocation( Point3D pos );
	void setLocation( Location loc );
	
	Point3D getRotate();
	void setRotate( float rx, float ry, float rz );
	void setRotate( Point3D rot );

	boolean isMoving();
	int move( float x, float y, float z, float speed );
	int move( float x, float y, float z, float speed, float rx, float ry, float rz );
	int move( Point3D pos, float speed );
	int move( Point3D pos, float speed, Point3D rot );
	void stop();

	void attach( PlayerPrim player, float x, float y, float z, float rx, float ry, float rz );
	void attach( PlayerPrim player, Point3D offset, Point3D rot );
	
	void attach( ObjectPrim object, float x, float y, float z, float rx, float ry, float rz, boolean syncRotation );
	void attach( ObjectPrim object, Point3D offset, Point3D rot, boolean syncRotation );

	void attach( VehiclePrim vehicle, float x, float y, float z, float rx, float ry, float rz );
	void attach( VehiclePrim vehicle, Point3D offset, Point3D rot );
}

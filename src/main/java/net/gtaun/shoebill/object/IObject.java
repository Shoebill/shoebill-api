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

import net.gtaun.shoebill.data.Location;
import net.gtaun.shoebill.data.Vector3D;

/**
 * @author MK124
 *
 */

public interface IObject extends Destroyable
{
	public static final int INVALID_ID =				0xFFFF;
	
	
	int getId();
	int getModelId();
	float getSpeed();
	float getDrawDistance();
	
	Player getAttachedPlayer();
	IObject getAttachedObject();
	Vehicle getAttachedVehicle();
	
	Location getLocation();
	void setLocation( Vector3D pos );
	void setLocation( Location loc );
	
	Vector3D getRotate();
	void setRotate( float rx, float ry, float rz );
	void setRotate( Vector3D rot );

	boolean isMoving();
	int move( float x, float y, float z, float speed );
	int move( float x, float y, float z, float speed, float rx, float ry, float rz );
	int move( Vector3D pos, float speed );
	int move( Vector3D pos, float speed, Vector3D rot );
	void stop();

	void attach( Player player, float x, float y, float z, float rx, float ry, float rz );
	void attach( Player player, Vector3D offset, Vector3D rot );
	
	void attach( IObject object, float x, float y, float z, float rx, float ry, float rz, boolean syncRotation );
	void attach( IObject object, Vector3D offset, Vector3D rot, boolean syncRotation );

	void attach( Vehicle vehicle, float x, float y, float z, float rx, float ry, float rz );
	void attach( Vehicle vehicle, Vector3D offset, Vector3D rot );
}

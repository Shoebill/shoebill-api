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
import net.gtaun.shoebill.data.LocationAngle;
import net.gtaun.shoebill.data.Quaternion;
import net.gtaun.shoebill.data.Vector3D;
import net.gtaun.shoebill.data.Velocity;

/**
 * 
 * 
 * @author MK124
 */
public interface Vehicle extends Destroyable, Proxyable
{
	public static final int INVALID_ID	=				0xFFFF;
	
	
	boolean isStatic();
	
	int getId();
	int getModelId();
	int getColor1();
	int getColor2();
	int getRespawnDelay();

	VehicleParam getState();
	VehicleComponent getComponent();
	public VehicleDamage getDamage();
	
	LocationAngle getLocation();
	void setLocation( float x, float y, float z );
	void setLocation( Vector3D pos );
	void setLocation( Location loc );
	void setLocation( LocationAngle loc );

	float getAngle();
	void setAngle( float angle );
	
	Quaternion getRotationQuat();

	int getInteriorId();
	void setInteriorId( int interiorId );
	
	int getWorldId();
	void setWorldId( int worldId );
	
	float getHealth();
	void setHealth( float health );
	
	Velocity getVelocity();
	void setVelocity( Velocity velocity );
	void setAngularVelocity( Velocity velocity );
	
	void putPlayer( Player player, int seat );
	boolean isPlayerIn( Player player );
	boolean isStreamedIn( Player forPlayer );
	void setParamsForPlayer( Player player, boolean objective, boolean doorsLocked );
	void respawn();
	void setColor( int color1, int color2 );
	void setPaintjob( int paintjobId );
	
	Vehicle getTrailer();
	void attachTrailer( Vehicle trailer );
	void detachTrailer();
	
	boolean isTrailerAttached();
	void setNumberPlate( String number );
	void repair();
}

/**
 * Copyright (C) 2011-2014 MK124
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
import net.gtaun.shoebill.constant.ObjectMaterialSize;
import net.gtaun.shoebill.constant.ObjectMaterialTextAlign;
import net.gtaun.shoebill.data.Color;
import net.gtaun.shoebill.data.Location;
import net.gtaun.shoebill.data.Vector3D;
import net.gtaun.shoebill.exception.CreationFailedException;

import java.util.Collection;

/**
 * 
 * 
 * @author MK124
 */
public interface SampObject extends Destroyable, Proxyable<SampObject>
{
	static SampObject get(int id)
	{
		return SampObjectManager.get().getObject(id);
	}
	
	static Collection<SampObject> get()
	{
		return SampObjectManager.get().getObjects();
	}
	
    /**
     * Create a SampObject with params. If the Creation fails, it will throw a CreationFailedException.
     *
     * @param modelId Modelid of the Object.
     * @param loc Location where the Object should be.
     * @param rot The Rotation of the Object.
     * @param drawDistance The Drawdistance of the Object.
     * @return The created SampObject.
     */
	static SampObject create(int modelId, Location loc, Vector3D rot, float drawDistance) throws CreationFailedException
	{
		return SampObjectManager.get().createObject(modelId, loc, rot, drawDistance);
	}
	
    /**
     * Create a SampObject with params. If the Creation fails, it will throw a CreationFailedException.
     *
     * @param modelId Modelid of the Object.
     * @param x X-Pos where the Object should be.
     * @param y Y-Pos where the Object should be.
     * @param z Z-Pos where the Object should be.
     * @param rx Rotation-X where the Object should be.
     * @param ry Rotation-Y where the Object should be.
     * @param rz Rotation-Z where the Object should be.
     * @return The created SampObject.
     */
	static SampObject create(int modelId, float x, float y, float z, float rx, float ry, float rz) throws CreationFailedException
	{
		return SampObjectManager.get().createObject(modelId, x, y, z, rx, ry, rz);
	}
	
    /**
     * Create a SampObject with params. If the Creation fails, it will throw a CreationFailedException.
     *
     * @param modelId Modelid of the Object.
     * @param x X-Pos where the Object should be.
     * @param y Y-Pos where the Object should be.
     * @param z Z-Pos where the Object should be.
     * @param rx Rotation-X where the Object should be.
     * @param ry Rotation-Y where the Object should be.
     * @param rz Rotation-Z where the Object should be.
     * @param drawDistance The Drawdistance of the Object.
     * @return The created SampObject.
     */
	static SampObject create(int modelId, float x, float y, float z, float rx, float ry, float rz, float drawDistance) throws CreationFailedException
	{
		return SampObjectManager.get().createObject(modelId, x, y, z, rx, ry, rz, drawDistance);
	}
	
    /**
     * Create a SampObject with params. If the Creation fails, it will throw a CreationFailedException.
     *
     * @param modelId Modelid of the Object.
     * @param loc Location where the Object should be.
     * @param rx Rotation-X where the Object should be.
     * @param ry Rotation-Y where the Object should be.
     * @param rz Rotation-Z where the Object should be.
     * @return The created SampObject.
     */
	static SampObject create(int modelId, Location loc, float rx, float ry, float rz) throws CreationFailedException
	{
		return SampObjectManager.get().createObject(modelId, loc, rx, ry, rz);
	}
	
    /**
     * Create a SampObject with params. If the Creation fails, it will throw a CreationFailedException.
     *
     * @param modelId Modelid of the Object.
     * @param loc Location where the Object should be.
     * @param rx Rotation-X where the Object should be.
     * @param ry Rotation-Y where the Object should be.
     * @param rz Rotation-Z where the Object should be.
     * @param drawDistance The Drawdistance of the Object.
     * @return The created SampObject.
     */
	static SampObject create(int modelId, Location loc, float rx, float ry, float rz, float drawDistance) throws CreationFailedException
	{
		return SampObjectManager.get().createObject(modelId, loc, rx, ry, rz, drawDistance);
	}
	
    /**
     * Create a SampObject with params. If the Creation fails, it will throw a CreationFailedException.
     *
     * @param modelId Modelid of the Object.
     * @param loc Location where the Object should be.
     * @param rot Rotation-Position where the Object should be.
     * @return The created SampObject.
     */
	static SampObject create(int modelId, Location loc, Vector3D rot) throws CreationFailedException
	{
		return SampObjectManager.get().createObject(modelId, loc, rot);
	}
	
	
	int INVALID_ID = 0xFFFF;
	
	
	int getId();
	int getModelId();
	float getSpeed();
	float getDrawDistance();
	
	Player getAttachedPlayer();
	SampObject getAttachedObject();
	Vehicle getAttachedVehicle();
	
	Location getLocation();
	void setLocation(Vector3D pos);
	void setLocation(Location loc);
	
	Vector3D getRotation();
	void setRotation(float rx, float ry, float rz);
	void setRotation(Vector3D rot);

	boolean isMoving();
	int move(float x, float y, float z, float speed);
	int move(float x, float y, float z, float speed, float rx, float ry, float rz);
	int move(Vector3D pos, float speed);
	int move(Vector3D pos, float speed, Vector3D rot);
	void stop();

	void attach(Player player, float x, float y, float z, float rx, float ry, float rz);
	void attach(Player player, Vector3D offset, Vector3D rot);
	
	void attach(SampObject object, float x, float y, float z, float rx, float ry, float rz, boolean isSyncRotation);
	void attach(SampObject object, Vector3D offset, Vector3D rot, boolean isSyncRotation);

	void attach(Vehicle vehicle, float x, float y, float z, float rx, float ry, float rz);
	void attach(Vehicle vehicle, Vector3D offset, Vector3D rot);

	void attachCamera(Player player);

	void setMaterial(int materialIndex, int modelId, String txdName, String textureName, Color materialColor);
	void setMaterial(int materialIndex, int modelId, String txdName, String textureName);
	
	void setMaterialText(String text, int materialIndex, ObjectMaterialSize materialSize, String fontFace, int fontSize, boolean isBold, Color fontColor, Color backColor, ObjectMaterialTextAlign textAlignment);
	void setMaterialText(String text);

	//int getObjectModel(); // not needed
	void setNoCameraCol();
}

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

import net.gtaun.shoebill.constant.PlayerAttachBone;
import net.gtaun.shoebill.data.Point3D;

/**
 * 
 * 
 * @author MK124
 */
public interface PlayerAttach extends PlayerRelated
{
	public static final int MAX_ATTACHED_OBJECTS = 5;
	
	
	public interface Slot
	{
		public PlayerAttachBone getBone();
		public int getModelId();
		public Point3D getOffset();
		public Point3D getRotate();
		public Point3D getScale();
		
		public boolean set( PlayerAttachBone bone, int modelId, Point3D offset, Point3D rotation, Point3D scale );
		public boolean remove();
		public boolean isUsed( int slot );
	}
	
	Slot getSlot( int slot );
	Slot[] getSlots();
}

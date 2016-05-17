/**
 * Copyright (C) 2011-2012 MK124

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

import net.gtaun.shoebill.constant.Collectable
import net.gtaun.shoebill.constant.Findable
import net.gtaun.shoebill.constant.PlayerAttachBone
import net.gtaun.shoebill.data.Vector3D

/**
 * This class contains methods and functions for using PlayerAttachments.
 *
 * @author MK124
 * @author Marvin Haschker
 */
abstract class PlayerAttach : PlayerRelated {

    interface PlayerAttachSlot : PlayerRelated {
        val slot: Int

        val bone: PlayerAttachBone
        val modelId: Int
        val offset: Vector3D
        val rotation: Vector3D
        val scale: Vector3D

        operator fun set(bone: PlayerAttachBone, modelId: Int, offset: Vector3D, rotation: Vector3D, scale: Vector3D,
                         materialColor1: Int, materialColor2: Int): Boolean

        fun remove(): Boolean
        val isUsed: Boolean

        fun edit(): Boolean
    }

    abstract fun getSlotByBone(bone: PlayerAttachBone): PlayerAttachSlot?

    companion object {

        /**
         * Maximum attached entities count.
         */
        @JvmField
        val MAX_ATTACHED_OBJECTS = 10
    }
}

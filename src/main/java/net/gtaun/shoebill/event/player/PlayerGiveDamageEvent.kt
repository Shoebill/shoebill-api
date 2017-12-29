/**
 * Copyright (C) 2011 MK124

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

package net.gtaun.shoebill.event.player

import net.gtaun.shoebill.constant.WeaponModel
import net.gtaun.shoebill.entities.Player

/**
 * This event represents the OnPlayerGiveDamage of Pawn.
 *
 * @author MK124
 * @author Marvin Haschker
 * @see [OnPlayerGiveDamage](https://wiki.sa-mp.com/wiki/OnPlayerGiveDamage)
 *
 * @property victim The associated victim for this event.
 * @property amount The associated amount of damage for this event.
 * @property weapon The associated used WeaponModel for this event.
 * @property bodyPart The associated id of hit bodypart for this event.
 */
class PlayerGiveDamageEvent(player: Player,
                            val victim: Player,
                            val amount: Float,
                            val weapon: WeaponModel,
                            val bodyPart: Int) : PlayerEvent(player)

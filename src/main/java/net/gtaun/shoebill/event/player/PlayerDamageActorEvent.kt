package net.gtaun.shoebill.event.player

import net.gtaun.shoebill.constant.WeaponModel
import net.gtaun.shoebill.entities.Actor
import net.gtaun.shoebill.entities.Player

/**
 * This event represents the OnPlayerDamageActor of Pawn.
 *
 * @author MK124
 * @author Marvin Haschker
 * @see [OnPlayerDamageActor](https://wiki.sa-mp.com/wiki/OnPlayerDamageActor)
 *
 * @property actor The associated Actor for this event.
 * @property amount The associated amount of damage for this event.
 * @property weapon The associated WeaponModel an issuer used for this event.
 * @property bodypart The associated id of hit bodypart for this event.
 */
class PlayerDamageActorEvent(player: Player,
                             val actor: Actor,
                             val amount: Float,
                             val weapon: WeaponModel,
                             val bodypart: Int) : PlayerEvent(player)

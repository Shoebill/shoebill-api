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
 */
class PlayerDamageActorEvent(player: Player,
                             /**
                              * The associated Actor for this event.
                              */
                             val actor: Actor,
                             /**
                              * The associated amount of damage for this event.
                              */
                             val amount: Float,
                             /**
                              * The associated WeaponModel an issuer used for this event.
                              */
                             val weapon: WeaponModel,
                             /**
                              * The associated id of hit bodypart for this event.
                              */
                             val bodypart: Int) : PlayerEvent(player) {

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PlayerDamageActorEvent) return false

        if (actor != other.actor) return false
        if (amount != other.amount) return false
        if (weapon != other.weapon) return false
        if (bodypart != other.bodypart) return false

        return true
    }

    override fun hashCode(): Int {
        var result = actor.hashCode()
        result = 31 * result + amount.hashCode()
        result = 31 * result + weapon.hashCode()
        result = 31 * result + bodypart
        return result
    }


}

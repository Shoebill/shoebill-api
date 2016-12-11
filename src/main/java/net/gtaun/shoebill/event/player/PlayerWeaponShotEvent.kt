package net.gtaun.shoebill.event.player

import net.gtaun.shoebill.constant.BulletHitType
import net.gtaun.shoebill.constant.WeaponModel
import net.gtaun.shoebill.data.Vector3D
import net.gtaun.shoebill.entities.Player
import net.gtaun.shoebill.entities.PlayerObject
import net.gtaun.shoebill.entities.SampObject
import net.gtaun.util.event.Disallowable

/**
 * This event represents the OnPlayerWeaponShot of Pawn.
 *
 * @author MK124
 * @author Marvin Haschker
 * @see [OnPlayerWeaponShot](https://wiki.sa-mp.com/wiki/OnPlayerWeaponShot)
 */
class PlayerWeaponShotEvent(player: Player,
                            /**
                             * The associated used WeaponModel for this event.
                             */
                            val weapon: WeaponModel,
                            /**
                             * The associated BulletHitType for this event.
                             */
                            val hitType: BulletHitType,
                            private val hitId: Int,
                            val position: Vector3D) : PlayerEvent(player), Disallowable {


    /**
     * The current response value
     */
    var response = 1
        private set

    /**
     * Disallows the further execution of this event in the whole abstract machine (also Pawn and other Plugins).
     */
    override fun disallow() {
        this.response = this.response and 0
        interrupt()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PlayerWeaponShotEvent) return false
        if (!super.equals(other)) return false

        if (weapon != other.weapon) return false
        if (hitType != other.hitType) return false
        if (hitId != other.hitId) return false
        if (position != other.position) return false
        if (response != other.response) return false

        return true
    }

    override fun hashCode(): Int {
        var result = super.hashCode()
        result = 31 * result + weapon.hashCode()
        result = 31 * result + hitType.hashCode()
        result = 31 * result + hitId
        result = 31 * result + position.hashCode()
        result = 31 * result + response
        return result
    }


    /**
     * The associated hitted Player / victim for this event.
     */
    val hitPlayer: Player?
        get() = Player[hitId]

    /**
     * The associated hitted SampObject for this event.
     */
    val hitObject: SampObject?
        get() = SampObject[hitId]

    /**
     * The associated hitted PlayerObject for this event.
     */
    val hitPlayerObject: PlayerObject?
        get() = PlayerObject[player, hitId]


}

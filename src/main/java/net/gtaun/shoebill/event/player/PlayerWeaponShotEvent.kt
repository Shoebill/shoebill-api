package net.gtaun.shoebill.event.player

import net.gtaun.shoebill.entities.Player
import net.gtaun.shoebill.entities.PlayerObject
import net.gtaun.shoebill.entities.SampObject
import net.gtaun.shoebill.constant.BulletHitType
import net.gtaun.shoebill.constant.WeaponModel
import net.gtaun.shoebill.data.Vector3D
import net.gtaun.util.event.Interruptable

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
                            val position: Vector3D) : PlayerEvent(player), Interruptable {


    /**
     * The current response value
     */
    var response = 1
        private set

    /*
	 * (non-Javadoc)
	 * @see net.gtaun.util.event.Event#interrupt()
	 */
    override fun interrupt() {
        super.interrupt()
    }

    /**
     * Disallows the further execution of this event in the whole abstract machine (also Pawn and other Plugins).
     */
    fun disallow() {
        this.response = this.response and 0
        interrupt()
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

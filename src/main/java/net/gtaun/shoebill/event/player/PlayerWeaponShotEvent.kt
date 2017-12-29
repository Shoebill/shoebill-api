package net.gtaun.shoebill.event.player

import net.gtaun.shoebill.constant.BulletHitType
import net.gtaun.shoebill.constant.WeaponModel
import net.gtaun.shoebill.data.Vector3D
import net.gtaun.shoebill.entities.Player
import net.gtaun.shoebill.entities.PlayerObject
import net.gtaun.shoebill.entities.SampObject
import net.gtaun.shoebill.entities.Vehicle
import net.gtaun.util.event.Disallowable

/**
 * This event represents the OnPlayerWeaponShot of Pawn.
 *
 * @author MK124
 * @author Marvin Haschker
 * @see [OnPlayerWeaponShot](https://wiki.sa-mp.com/wiki/OnPlayerWeaponShot)
 *
 * @property weapon The associated used WeaponModel for this event.
 * @property hitType The associated BulletHitType for this event.
 */
class PlayerWeaponShotEvent(player: Player,
                            val weapon: WeaponModel,
                            val hitType: BulletHitType,
                            private val hitId: Int,
                            val position: Vector3D) : PlayerEvent(player), Disallowable {


    /**
     * The current response value.
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

    /**
     * The associated Player / victim for this event.
     */
    val hitPlayer: Player?
        get() = Player[hitId]

    /**
     * The associated SampObject for this event.
     */
    val hitObject: SampObject?
        get() = SampObject[hitId]

    /**
     * The associated PlayerObject for this event.
     */
    val hitPlayerObject: PlayerObject?
        get() = PlayerObject[player, hitId]

    /**
     * The associated Vehicle for this event.
     */
    val hitVehicle: Vehicle?
        get() = Vehicle[hitId]


}

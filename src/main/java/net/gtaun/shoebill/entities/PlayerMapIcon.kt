package net.gtaun.shoebill.entities

import net.gtaun.shoebill.constant.MapIconStyle
import net.gtaun.shoebill.data.Color
import net.gtaun.shoebill.data.Vector3D

/**
 * This class provides functions and methods to handle [Player] map icons.
 *
 * @author MK124
 * @author Marvin Haschker
 */
interface PlayerMapIcon : PlayerRelated {
    interface MapIcon : Destroyable, PlayerRelated {
        val id: Int

        fun update(x: Float, y: Float, z: Float, markerType: Int, color: Color, style: MapIconStyle)
        fun update(pos: Vector3D, markerType: Int, color: Color, style: MapIconStyle)
    }

    fun getIcon(iconid: Int): MapIcon?
    fun setIcon(iconid: Int, icon: MapIcon)
    fun createIcon(x: Float, y: Float, z: Float, markerType: Int, color: Color, style: MapIconStyle): MapIcon
    fun createIcon(pos: Vector3D, markerType: Int, color: Color, style: MapIconStyle): MapIcon
    fun createIcon(x: Float, y: Float, z: Float, markerType: Int, color: Color, style: MapIconStyle, iconId: Int): MapIcon
    fun createIcon(pos: Vector3D, markerType: Int, color: Color, style: MapIconStyle, iconId: Int): MapIcon
    fun createIcon(iconId: Int): MapIcon
    fun createIcon(): MapIcon
}

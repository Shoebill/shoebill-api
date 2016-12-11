package net.gtaun.shoebill.data

/**
 * This class should be used with Preview Models.
 *
 * @author Marvin Haschker
 */
class ModelRotation(x: Float, y: Float, z: Float, val zoom: Float = 1.0f) : Vector3D(x, y, z) {

    override fun clone(): ModelRotation = ModelRotation(x, y, z, zoom)

}
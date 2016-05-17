package net.gtaun.shoebill.entities

import net.gtaun.shoebill.SampObjectManager
import net.gtaun.shoebill.constant.Collectable
import net.gtaun.shoebill.constant.Findable
import net.gtaun.shoebill.data.AngledLocation
import net.gtaun.shoebill.data.Vector3D
import net.gtaun.shoebill.exception.CreationFailedException

/**
 * This interfaces provides functions and methods to interact and create [Actor]s.
 *
 * @author Marvin Haschker
 */
abstract class Actor : Destroyable {

    /**
     * The internal id of the actor.
     */
    abstract val id: Int

    /**
     * The model if the actor.
     */
    abstract val model: Int

    /**
     * The location of the actor.
     */
    abstract var location: AngledLocation

    /**
     * The virtual world of the actor.
     */
    abstract var virtualWorld: Int

    /**
     * The current health of the actor.
     */
    abstract var health: Float

    /**
     * The actor's invulnerable state.
     */
    abstract var isInvulnerable: Boolean

    /**
     * Applies an animation for the actor
     * @param animLib Animation library
     * @param animName Animation name
     * @param animSpeed Animation speed (default is 4.1)
     * @param loop If the animation should loop
     * @param lockX If the actor return to their old x-location (false = return to old, true = stay at new)
     * @param lockY If the actor return to their old y-location (false = return to old, true = stay at new)
     * @param freeze If the actor should be frozen while the animation is playing
     * @param time How long the animation should play (0 = infinite)
     */
    abstract fun applyAnimation(animLib: String, animName: String, time: Int, animSpeed: Float = 1f,
                                loop: Boolean = false, lockX: Boolean = true, lockY: Boolean = true,
                                freeze: Boolean = true)

    /**
     * Clears all animations from the actor
     */
    abstract fun clearAnimation()

    /**
     * Checks if the actor is streamed-in for [player].
     */
    abstract fun isActorStreamedIn(player: Player): Boolean

    companion object : Collectable<Actor>, Findable<Int, Actor> {

        /**
         * Invalid ID for [Actor]s.
         */
        @JvmField
        val INVALID_ACTOR = 65535

        /**
         * Creates an actor with the modelId of [modelId] and the position of [location].
         */
        @Throws(CreationFailedException::class)
        @JvmStatic
        fun create(modelId: Int, location: AngledLocation) = SampObjectManager.get().createActor(modelId, location)

        /**
         * Creates an actor with the modelId of [modelId] and position of [x], [y], [z], [angle] and [virtualWorld].
         */
        @Throws(CreationFailedException::class)
        @JvmStatic
        @JvmOverloads
        fun create(modelId: Int, x: Float = 0f, y: Float = 0f, z: Float = 0f, angle: Float = 0f,
                   virtualWorld: Int = 0): Actor = create(modelId, AngledLocation(x, y, z, 0, virtualWorld, angle))

        /**
         * Creates an actor with the modelId of [modelId] and the position of [position], [angle] and [virtualWorld].
         */
        @Throws(CreationFailedException::class)
        @JvmStatic
        @JvmOverloads
        fun create(modelId: Int, position: Vector3D, angle: Float = 0f, virtualWorld: Int = 0): Actor =
                create(modelId, AngledLocation(position, worldId = virtualWorld, angle = angle))


        /**
         * Gets all available [Actor]s.
         */
        @JvmStatic
        override fun get(): Collection<Actor> = SampObjectManager.get().actors

        /**
         * Gets an [Actor] by it's [id].
         */
        @JvmStatic
        override operator fun get(value: Int): Actor? = SampObjectManager.get().getActor(value)

        /**
         * Gets the actor's pool size
         */
        @JvmStatic
        val poolSize: Int
            get() = SampObjectManager.get().actorPoolSize
    }
}

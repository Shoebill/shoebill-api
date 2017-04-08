/**
 * Copyright (C) 2011-2014 MK124

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

import net.gtaun.shoebill.SampObjectManager
import net.gtaun.shoebill.constant.Collectable
import net.gtaun.shoebill.constant.Findable
import net.gtaun.shoebill.data.*
import net.gtaun.shoebill.event.vehicle.*
import net.gtaun.shoebill.exception.CreationFailedException
import net.gtaun.util.event.EventHandler
import net.gtaun.util.event.HandlerPriority

/**
 * This class contains functions and methods to handle game vehicles.
 *
 * @author MK124
 * @author Marvin Haschker
 */
abstract class Vehicle : Entity(), Proxyable<Vehicle> {

    abstract val isStatic: Boolean

    abstract val id: Int
    abstract val modelId: Int
    abstract val modelName: String
    abstract val color1: Int
    abstract val color2: Int
    abstract val respawnDelay: Int

    abstract val state: VehicleParam
    abstract val component: VehicleComponent
    abstract val damage: VehicleDamage

    abstract var location: AngledLocation
    abstract fun setLocation(x: Float, y: Float, z: Float)
    abstract fun setLocation(pos: Vector3D)
    abstract fun setLocation(loc: Location)

    abstract var angle: Float
    abstract val rotationQuat: Quaternion
    abstract var interior: Int
    abstract var world: Int
    abstract var health: Float

    abstract var velocity: Velocity
    abstract fun setAngularVelocity(velocity: Velocity)

    /**
     * Puts a player into that vehicle
     * @param player Player to put in
     * @param seat Which seat he should sit in
     */
    abstract fun putPlayer(player: Player, seat: Int)

    /**
     * Checks if a specific player is in the vehicle
     * @param player The player to check
     * @return If the player is in the vehicle
     */
    abstract fun isPlayerIn(player: Player): Boolean

    /**
     * Checks if the vehicle is streamed-in for a specific player
     * @param forPlayer The player to check
     * @return If the vehicle is streamed-in for the player
     */
    abstract fun isStreamedIn(forPlayer: Player): Boolean

    /**
     * Sets different parameters for a specific player
     * @param player Which player should be affected
     * @param objective If the objective should be open / closed
     * @param doorsLocked If the doors should be locked
     */
    abstract fun setParamsForPlayer(player: Player, objective: Boolean, doorsLocked: Boolean)

    /**
     * Destroys and spawns the vehicle
     */
    abstract fun respawn()

    /**
     * Sets the color of the vehicle (https://wiki.sa-mp.com/wiki/Vehicle_Color_IDs)
     * @param color1 First color
     * @param color2 Second color
     */
    abstract fun setColor(color1: Int, color2: Int)

    /**
     * Sets the paintjob of the vehicle
     * @param paintjobId The paintjobid (https://wiki.sa-mp.com/wiki/Paintjob)
     */
    abstract fun setPaintjob(paintjobId: Int)

    /**
     * The trailer that is attached to the vehicle.
     * @return The attached trailer
     */
    abstract val trailer: Vehicle?

    /**
     * Attaches a trailer to the vehicle
     * @param trailer The trailer to attach
     */
    abstract fun attachTrailer(trailer: Vehicle)

    /**
     * Detaches a trailer from the vehicle (check with isTrailerAttached())
     */
    abstract fun detachTrailer()

    /**
     * Checks if any trailer is attached to the vehicle
     * @return If there is a trailer attached
     */
    abstract val isTrailerAttached: Boolean

    /**
     * Sets the number plate of the vehicle
     * @param number The String to display on the plate
     */
    abstract fun setNumberPlate(number: String)

    /**
     * Sets the health of the vehicle to 1000 and repairs all visual damages
     */
    abstract fun repair()

    /**
     * The state (opened or closed) of the doors
     * This function was introduced in 0.3.7
     * @return VehicleState entities for the vehicle (doors)
     */
    abstract var doors: VehicleState

    /**
     * The state (opened or closed) of the windows
     * This function was introduced in 0.3.7
     * @return VehicleState entities for the vehicle (windows)
     */
    abstract var windows: VehicleState

    /**
     * The siren state.
     */
    abstract val sirenState: Int

    /**
     * If the vehicle has been initialized with a siren.
     */
    abstract fun hasSiren(): Boolean

    /**
     * Quick-register events
     */
    @JvmOverloads
    fun onTrailerUpdate(handler: EventHandler<TrailerUpdateEvent>, priority: HandlerPriority = HandlerPriority.NORMAL) =
            eventManagerNode.registerHandler(TrailerUpdateEvent::class.java, handler, priority, attention)

    @JvmOverloads
    fun onTrailerUpdate(handler: (TrailerUpdateEvent) -> Unit, priority: HandlerPriority = HandlerPriority.NORMAL) =
            onTrailerUpdate(EventHandler { handler(it) }, priority)

    @JvmOverloads
    fun onUnoccupiedVehicleUpdate(handler: EventHandler<UnoccupiedVehicleUpdateEvent>, priority: HandlerPriority = HandlerPriority.NORMAL) =
            eventManagerNode.registerHandler(UnoccupiedVehicleUpdateEvent::class.java, handler, priority, attention)

    @JvmOverloads
    fun onUnoccupiedVehicleUpdate(handler: (UnoccupiedVehicleUpdateEvent) -> Unit, priority: HandlerPriority = HandlerPriority.NORMAL) =
            onUnoccupiedVehicleUpdate(EventHandler { handler(it) }, priority)

    @JvmOverloads
    fun onCreate(handler: EventHandler<VehicleCreateEvent>, priority: HandlerPriority = HandlerPriority.NORMAL) =
            eventManagerNode.registerHandler(VehicleCreateEvent::class.java, handler, priority, attention)

    @JvmOverloads
    fun onCreate(handler: (VehicleCreateEvent) -> Unit, priority: HandlerPriority = HandlerPriority.NORMAL) =
            onCreate(EventHandler { handler(it) }, priority)

    @JvmOverloads
    fun onDeath(handler: EventHandler<VehicleDeathEvent>, priority: HandlerPriority = HandlerPriority.NORMAL) =
            eventManagerNode.registerHandler(VehicleDeathEvent::class.java, handler, priority, attention)

    @JvmOverloads
    fun onDeath(handler: (VehicleDeathEvent) -> Unit, priority: HandlerPriority = HandlerPriority.NORMAL) =
            onDeath(EventHandler { handler(it) }, priority)

    @JvmOverloads
    fun onEnter(handler: EventHandler<VehicleEnterEvent>, priority: HandlerPriority = HandlerPriority.NORMAL) =
            eventManagerNode.registerHandler(VehicleEnterEvent::class.java, handler, priority, attention)

    @JvmOverloads
    fun onEnter(handler: (VehicleEnterEvent) -> Unit, priority: HandlerPriority = HandlerPriority.NORMAL) =
            onEnter(EventHandler { handler(it) }, priority)

    @JvmOverloads
    fun onExit(handler: EventHandler<VehicleExitEvent>, priority: HandlerPriority = HandlerPriority.NORMAL) =
            eventManagerNode.registerHandler(VehicleExitEvent::class.java, handler, priority, attention)

    @JvmOverloads
    fun onExit(handler: (VehicleExitEvent) -> Unit, priority: HandlerPriority = HandlerPriority.NORMAL) =
            onExit(EventHandler { handler(it) }, priority)

    @JvmOverloads
    fun onMod(handler: EventHandler<VehicleModEvent>, priority: HandlerPriority = HandlerPriority.NORMAL) =
            eventManagerNode.registerHandler(VehicleModEvent::class.java, handler, priority, attention)

    @JvmOverloads
    fun onMod(handler: (VehicleModEvent) -> Unit, priority: HandlerPriority = HandlerPriority.NORMAL) =
            onMod(EventHandler { handler(it) }, priority)

    @JvmOverloads
    fun onPaintjob(handler: EventHandler<VehiclePaintjobEvent>, priority: HandlerPriority = HandlerPriority.NORMAL) =
            eventManagerNode.registerHandler(VehiclePaintjobEvent::class.java, handler, priority, attention)

    @JvmOverloads
    fun onPaintjob(handler: (VehiclePaintjobEvent) -> Unit, priority: HandlerPriority = HandlerPriority.NORMAL) =
            onPaintjob(EventHandler { handler(it) }, priority)

    @JvmOverloads
    fun onRespray(handler: EventHandler<VehicleResprayEvent>, priority: HandlerPriority = HandlerPriority.NORMAL) =
            eventManagerNode.registerHandler(VehicleResprayEvent::class.java, handler, priority, attention)

    @JvmOverloads
    fun onRespray(handler: (VehicleResprayEvent) -> Unit, priority: HandlerPriority = HandlerPriority.NORMAL) =
            onRespray(EventHandler { handler(it) }, priority)

    @JvmOverloads
    fun onSirenStateChange(handler: EventHandler<VehicleSirenStateChangeEvent>, priority: HandlerPriority = HandlerPriority.NORMAL) =
            eventManagerNode.registerHandler(VehicleSirenStateChangeEvent::class.java, handler, priority, attention)

    @JvmOverloads
    fun onSirenStateChange(handler: (VehicleSirenStateChangeEvent) -> Unit, priority: HandlerPriority = HandlerPriority.NORMAL) =
            onSirenStateChange(EventHandler { handler(it) }, priority)

    @JvmOverloads
    fun onSpawn(handler: EventHandler<VehicleSpawnEvent>, priority: HandlerPriority = HandlerPriority.NORMAL) =
            eventManagerNode.registerHandler(VehicleSpawnEvent::class.java, handler, priority, attention)

    @JvmOverloads
    fun onSpawn(handler: (VehicleSpawnEvent) -> Unit, priority: HandlerPriority = HandlerPriority.NORMAL) =
            onSpawn(EventHandler { handler(it) }, priority)

    @JvmOverloads
    fun onStreamIn(handler: EventHandler<VehicleStreamInEvent>, priority: HandlerPriority = HandlerPriority.NORMAL) =
            eventManagerNode.registerHandler(VehicleStreamInEvent::class.java, handler, priority, attention)

    @JvmOverloads
    fun onStreamIn(handler: (VehicleStreamInEvent) -> Unit, priority: HandlerPriority = HandlerPriority.NORMAL) =
            onStreamIn(EventHandler { handler(it) }, priority)

    @JvmOverloads
    fun onStreamOut(handler: EventHandler<VehicleStreamOutEvent>, priority: HandlerPriority = HandlerPriority.NORMAL) =
            eventManagerNode.registerHandler(VehicleStreamOutEvent::class.java, handler, priority, attention)

    @JvmOverloads
    fun onStreamOut(handler: (VehicleStreamOutEvent) -> Unit, priority: HandlerPriority = HandlerPriority.NORMAL) =
            onStreamOut(EventHandler { handler(it) }, priority)

    @JvmOverloads
    fun onUpdateDamage(handler: EventHandler<VehicleUpdateDamageEvent>, priority: HandlerPriority = HandlerPriority.NORMAL) =
            eventManagerNode.registerHandler(VehicleUpdateDamageEvent::class.java, handler, priority, attention)

    @JvmOverloads
    fun onUpdateDamage(handler: (VehicleUpdateDamageEvent) -> Unit, priority: HandlerPriority = HandlerPriority.NORMAL) =
            onUpdateDamage(EventHandler { handler(it) }, priority)

    @JvmOverloads
    fun onUpdate(handler: EventHandler<VehicleUpdateEvent>, priority: HandlerPriority = HandlerPriority.NORMAL) =
            eventManagerNode.registerHandler(VehicleUpdateEvent::class.java, handler, priority, attention)

    @JvmOverloads
    fun onUpdate(handler: (VehicleUpdateEvent) -> Unit, priority: HandlerPriority = HandlerPriority.NORMAL) =
            onUpdate(EventHandler { handler(it) }, priority)

    companion object : Collectable<Vehicle>, Findable<Int, Vehicle> {

        /**
         * Gets a [Vehicle] by it's [id].
         */
        @JvmStatic
        override operator fun get(value: Int): Vehicle? = SampObjectManager.get().getVehicle(value)

        /**
         * Gets all available [Vehicle]s.
         */
        @JvmStatic
        override fun get(): Collection<Vehicle> = SampObjectManager.get().vehicles.filterNotNull()

        /**
         * Gets the vehicle's pool size
         * @return Vehicle's pool size
         */
        @JvmStatic
        val poolSize: Int
            get() = SampObjectManager.get().vehiclePoolSize

        /**
         * Create a Vehicle with params. If the Creation fails, it will throw a CreationFailedException.
         * @param modelId Modelid of the Vehicle.
         * @param loc Location where the Vehicle should be.
         * @param color1 First color of the Vehicle.
         * @param color2 Second color of the Vehicle.
         * @param respawnDelay The time in seconds when the Vehicle gets respawned if there is no player in it.
         * @return The created Vehicle.
         */
        @Throws(CreationFailedException::class)
        @JvmStatic
        @JvmOverloads
        fun create(modelId: Int, loc: AngledLocation, color1: Int = 1, color2: Int = 1, respawnDelay: Int = -1,
                   addSiren: Boolean = false): Vehicle =
                SampObjectManager.get().createVehicle(modelId, loc, color1, color2, respawnDelay, addSiren)

        /**
         * Create a Vehicle with params. If the Creation fails, it will throw a CreationFailedException.
         * @param modelId Modelid of the Vehicle.
         * @param x X-Pos where the Vehicle should be.
         * @param y Y-Pos where the Vehicle should be.
         * @param z Z-Pos where the Vehicle should be.
         * @param interiorId Interiorid where the Vehicle should be.
         * @param worldId Worldid where the Vehicle should be.
         * @param angle R(otation)-Pos where the Vehicle should be.
         * @param color1 First color of the Vehicle.
         * @param color2 Second color of the Vehicle.
         * @param respawnDelay The time in seconds when the Vehicle gets respawned if there is no player in it.
         * @return The created Vehicle.
         */
        @Throws(CreationFailedException::class)
        @JvmStatic
        @JvmOverloads
        fun create(modelId: Int, x: Float, y: Float, z: Float, interiorId: Int = 0, worldId: Int = 0, angle: Float =
        0f, color1: Int = 1, color2: Int = 1, respawnDelay: Int = -1, addSiren: Boolean = false): Vehicle =
                create(modelId, AngledLocation(x, y, z, angle, interiorId, worldId), color1, color2, respawnDelay, addSiren)

        /**
         * Invalid ID for a [Vehicle].
         */
        @JvmField
        val INVALID_ID = 0xFFFF
    }
}
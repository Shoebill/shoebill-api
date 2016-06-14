/**
 * Copyright (C) 2011-2012 MK124

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

package net.gtaun.shoebill

import net.gtaun.shoebill.entities.*
import net.gtaun.shoebill.data.SpawnInfo

/**
 * SA-MP testing interface, managing all SA-MP objects that exist.
 *
 * @author MK124
 * @author Marvin Haschker
 */
interface SampObjectStore {
    /**
     * The [Server] instance.
     */
    val server: Server

    /**
     * The [World] instance.
     */
    val world: World

    /**
     * Gets a [Player] by it's [id].
     */
    fun getPlayer(id: Int): Player?

    /**
     * Gets a [Player] by it's [name].
     */
    fun getPlayer(name: String): Player?

    /**
     * Gets a [Vehicle] by it's [id].
     */
    fun getVehicle(id: Int): Vehicle?

    /**
     * Gets a [SampObject] by it's [id].
     */
    fun getObject(id: Int): SampObject?

    /**
     * Gets a [PlayerObject] by it's [player] and [id].
     */
    fun getPlayerObject(player: Player, id: Int): PlayerObject?

    /**
     * Get Pickup instance with id.
     */
    fun getPickup(id: Int): Pickup?

    /**
     * Get a static pickup with it's id.
     */
    fun getStaticPickup(id: Int): Pickup?

    /**
     * Gets a [Label] by it's [id].
     */
    fun getLabel(id: Int): Label?

    /**
     * Gets a [PlayerLabel] by it's [player] and [id].
     */
    fun getPlayerLabel(player: Player, id: Int): PlayerLabel?

    /**
     * Gets a [Textdraw] by it's [id].
     */
    fun getTextdraw(id: Int): Textdraw?

    /**
     * Gets a [PlayerTextdraw] by it's [player] and [id].
     */
    fun getPlayerTextdraw(player: Player, id: Int): PlayerTextdraw?

    /**
     * Gets a [Zone] by it's [id].
     */
    fun getZone(id: Int): Zone?

    /**
     * Gets a [Menu] by it's [id].
     */
    fun getMenu(id: Int): Menu?

    /**
     * Gets a [DialogId] by it's [id].
     */
    fun getDialog(id: Int): DialogId?

    /**
     * Gets all available online [Player]s.
     */
    val players: MutableList<Player>

    /**
     * Gets all available human online [Player]s.
     */
    val humanPlayers: Collection<Player>

    /**
     * Gets all available NPC [Player]s.
     */
    val npcPlayers: Collection<Player>

    /**
     * Gets all available [Vehicle]s.
     */
    val vehicles: MutableList<Vehicle>

    /**
     * Gets all available [SampObject]s.
     */
    val objects: MutableList<SampObject>

    /**
     * Gets all available [PlayerObject]s from [player].
     */
    fun getPlayerObjects(player: Player): Collection<PlayerObject>

    /**
     * Gets all available [Pickup]s.
     */
    val pickups: MutableList<Pickup>

    /**
     * Gets all available [Label]s.
     */
    val labels: MutableList<Label>

    /**
     * Gets all available [PlayerLabel] from [player].
     */
    fun getPlayerLabels(player: Player): Collection<PlayerLabel>

    /**
     * Gets all available [Textdraw]s.
     */
    val textdraws: MutableList<Textdraw>

    /**
     * Gets all available [PlayerTextdraw]s from [player].
     */
    fun getPlayerTextdraws(player: Player): Collection<PlayerTextdraw>

    /**
     * Gets all available [Zone]s.
     */
    val zones: MutableList<Zone>

    /**
     * Gets all available [Menu]s.
     */
    val menus: MutableList<Menu>

    /**
     * Gets all used [DialogId]s.
     */
    val dialogIds: Collection<DialogId>

    /**
     * Gets all registered PlayerClasses in the form of [SpawnInfo].
     */
    val playerClasses: MutableList<SpawnInfo>

    /**
     * Gets all available [Actor]s.
     */
    val actors: MutableList<Actor>

    /**
     * Gets a [Actor] by it's [id].
     */
    fun getActor(id: Int): Actor?

    /**
     * Gets the pool size of the vehicles.
     */
    val vehiclePoolSize: Int

    /**
     * Gets the pool size of the players
     */
    val playerPoolSize: Int

    /**
     * Gets the pool size of the actors
     */
    val actorPoolSize: Int
}

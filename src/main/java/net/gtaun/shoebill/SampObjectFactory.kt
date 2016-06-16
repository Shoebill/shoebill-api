/**
 * Copyright (C) 2012-2014 MK124

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
import net.gtaun.shoebill.data.*
import net.gtaun.shoebill.event.dialog.DialogCloseEvent
import net.gtaun.shoebill.event.dialog.DialogResponseEvent
import net.gtaun.shoebill.event.dialog.DialogShowEvent
import net.gtaun.shoebill.event.player.PlayerPickupEvent
import net.gtaun.shoebill.exception.CreationFailedException
import net.gtaun.util.event.EventHandler

/**
 * @author MK124
 * @author Marvin Haschker
 */
interface SampObjectFactory {
    /**
     * Creates a [Vehicle] with 1 params. If the Creation fails, it will throw a CreationFailedException.
     * @param modelId Modelid of the Vehicle.
     * @param loc Location where the Vehicle should be.
     * @param color1 First color of the Vehicle.
     * @param color2 Second color of the Vehicle.
     * @param respawnDelay The time in seconds when the Vehicle gets respawned if there is no player in it.
     * @return The created Vehicle.
     */
    @Throws(CreationFailedException::class)
    fun createVehicle(modelId: Int, loc: AngledLocation = AngledLocation(), color1: Int = 0, color2: Int = 0,
                      respawnDelay: Int = -1, addSiren: Boolean = false): Vehicle

    /**
     * Create a SampObject with params. If the Creation fails, it will throw a CreationFailedException.
     * @param modelId Modelid of the Object.
     * @param loc Location where the Object should be.
     * @param rot The Rotation of the Object.
     * @param drawDistance The Drawdistance of the Object.
     * @return The created SampObject.
     */
    @Throws(CreationFailedException::class)
    fun createObject(modelId: Int, loc: Location = Location(), rot: Vector3D = Vector3D(), drawDistance: Float = 250f)
        : SampObject

    /**
     * Create a SampObject for Player with params. If the Creation fails, it will throw a CreationFailedException.
     * @param player The Player who sees the Object.
     * @param modelId Modelid of the Object.
     * @param loc Location where the Object should be.
     * @param rot Rotation-Position where the Object should be.
     * @param drawDistance The Drawdistance of the Object.
     * @return The created PlayerObject.
     */
    @Throws(CreationFailedException::class)
    fun createPlayerObject(player: Player, modelId: Int, loc: Location = Location(), rot: Vector3D = Vector3D(),
                           drawDistance: Float = 250f): PlayerObject

    /**
     * Create a Pickup with params. If the Creation fails, it will throw a CreationFailedException.
     * @param modelId Modelid of the Pickup.
     * @param type Type of the Pickup.
     * @param loc Location where the Pickup should be.
     * @return The created Pickup.
     */
    @Throws(CreationFailedException::class)
    fun createPickup(modelId: Int, type: Int = 1, loc: Location = Location(),
                     event: EventHandler<PlayerPickupEvent>? = null): Pickup

    /**
     * Create a Label with params. If the Creation fails, it will throw a CreationFailedException.
     * @param text The displayed Text.
     * @param color The color of the Label.
     * @param loc Location where the Label should be.
     * @param drawDistance The Drawdistance of the Label.
     * @param testLOS If the Label can be seen through objects.
     * @return The created Label.
     */
    @Throws(CreationFailedException::class)
    fun createLabel(text: String, color: Color = Color.WHITE, loc: Location = Location(), drawDistance: Float = 50f,
                    testLOS: Boolean = false): Label

    /**
     * Create a Label which is only visible for one player, with params. If the Creation fails, it will throw a CreationFailedException.
     * @param player The Player who sees the Label.
     * @param text The displayed Text.
     * @param color The color of the Label.
     * @param loc Location where the Label should be.
     * @param drawDistance The Drawdistance of the Label.
     * @param testLOS If the Label can be seen through objects.
     * @return The created PlayerLabel.
     */
    @Throws(CreationFailedException::class)
    fun createPlayerLabel(player: Player, text: String, color: Color = Color.WHITE, loc: Location = Location(),
                          drawDistance: Float = 50f, testLOS: Boolean = false): PlayerLabel

    /**
     * Create a Textdraw with params. If the Creation fails, it will throw a CreationFailedException.
     * @param pos Vector2D-Position where the Textdraw should be.
     * @param text The displayed text.
     * @return The created Textdraw.
     */
    @Throws(CreationFailedException::class)
    fun createTextdraw(pos: Vector2D, text: String = ""): Textdraw

    /**
     * Create a Textdraw which is only visible for one player, with params. If the Creation fails, it will throw a CreationFailedException.
     * @param player The Player who sees the Textdraw.
     * @param pos Vector2D-Position where the Textdraw should be.
     * @return The created PlayerTextdraw.
     */
    @Throws(CreationFailedException::class)
    fun createPlayerTextdraw(player: Player, pos: Vector2D = Vector2D(), text: String = " "): PlayerTextdraw

    /**
     * Create a Zone with params. If the Creation fails, it will throw a CreationFailedException.
     * @param area The Area-Position of the Zone.
     * @return The created Zone.
     */
    @Throws(CreationFailedException::class)
    fun createZone(area: Area): Zone

    /**
     * Create a Menu with params. If the Creation fails, it will throw a CreationFailedException.
     * @param title The Title of the menu.
     * @param columns The amount of columns.
     * @param pos Vector2D-Position where the Menu should appear.
     * @param col1Width The Columnwidth of column 1.
     * @param col2Width The Columnwidth of column 2.
     * @return The created Menu.
     */
    @Throws(CreationFailedException::class)
    fun createMenu(title: String = "", columns: Int = 0, pos: Vector2D = Vector2D(), col1Width: Float = 0f, col2Width:
    Float = 0f): Menu

    /**
     * Creates a DialogId.
     * @throws CreationFailedException
     * @return The created DialogId.
     */
    @Throws(CreationFailedException::class)
    fun createDialogId(onResponse: EventHandler<DialogResponseEvent>? = null,
                       onShow: EventHandler<DialogShowEvent>? = null,
                       onClose: EventHandler<DialogCloseEvent>? = null): DialogId

    /**
     * Create a Timer with params.
     * @param interval The interval in miliseconds.
     * @param count How often the Timer will get called.
     * @param callback The callback which will get invoked after the interval.
     * @return The created Timer.
     */
    fun createTimer(interval: Int, count: Int = Timer.COUNT_INFINITE, callback: TimerCallback? = null): Timer

    /**
     * Creates a actor with params.
     * @param modelid Modelid of the skin
     * @param position Where the actor should stand
     * @param angle In which angle the actor should stand
     * @return The created actor
     * @throws CreationFailedException
     */
    @Throws(CreationFailedException::class)
    fun createActor(modelid: Int, location: AngledLocation = AngledLocation()): Actor
}

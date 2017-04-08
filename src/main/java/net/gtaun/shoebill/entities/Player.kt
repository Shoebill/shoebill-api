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
import net.gtaun.shoebill.constant.*
import net.gtaun.shoebill.data.*
import net.gtaun.shoebill.event.player.*
import net.gtaun.shoebill.exception.AlreadyExistException
import net.gtaun.shoebill.exception.IllegalLengthException
import net.gtaun.util.event.EventHandler
import net.gtaun.util.event.HandlerPriority
import org.apache.commons.lang3.math.NumberUtils

/**
 * This class wraps functions and methods for use of Players.
 *
 * @author MK124
 * @author Marvin Haschker
 */
abstract class Player : Proxyable<Player>, Entity() {

    /**
     * The OnlineState.
     */
    abstract val isOnline: Boolean

    /**
     * The Id of the [Player].
     */
    abstract val id: Int

    /**
     * The current [PlayerKeyState].
     */
    abstract val keyState: PlayerKeyState

    /**
     * The objects that are attached.
     */
    abstract val attach: PlayerAttach

    /**
     * The WeaponSkill.
     */
    abstract val weaponSkill: PlayerWeaponSkill

    /**
     * The Ping.
     */
    abstract val ping: Int

    /**
     * The Team.
     */
    abstract var team: Int

    /**
     * The skin.
     */
    abstract var skin: Int

    /**
     * The current wantedlevel.
     */
    abstract var wantedLevel: Int

    /**
     * The used codepage.
     */
    abstract var codepage: Int

    /**
     * The IP-Address.
     */
    abstract val ip: String

    /**
     * The name.
     */
    abstract var name: String
        get
        @Throws(IllegalArgumentException::class, IllegalLengthException::class, AlreadyExistException::class)
        set

    /**
     * The color.
     */
    abstract var color: Color

    /**
     * The amount of updates since the [Player] joined.
     */
    abstract val updateCount: Long

    /**
     * The health points.
     */
    abstract var health: Float

    /**
     * The armour points.
     */
    abstract var armour: Float

    /**
     * The currently armed [WeaponModel].
     */
    abstract var armedWeapon: WeaponModel

    /**
     * The ammo of the armed weapon.
     */
    abstract val armedWeaponAmmo: Int

    /**
     * The amount of money.
     */
    abstract var money: Int

    /**
     * The score points.
     */
    abstract var score: Int

    /**
     * The [Player]s [Weather].
     */
    abstract var weather: Weather

    /**
     * The current camera mode.
     */
    abstract val cameraMode: Int

    /**
     * The aspect ratio of the [Player]s camera.
     */
    abstract val cameraAspectRatio: Float

    /**
     * The zoom amount of the [Player]s camera.
     */
    abstract val cameraZoom: Float

    /**
     * The current [FightStyle].
     */
    abstract var fightStyle: FightStyle

    /**
     * The current [Vehicle].
     */
    abstract var vehicle: Vehicle?

    /**
     * The vehicle seat of the current [Vehicle].
     */
    abstract val vehicleSeat: Int

    /**
     * The [SpecialAction] the [Player] is practicing.
     */
    abstract var specialAction: SpecialAction

    /**
     * The [Player] that the player is currently spectating.
     */
    abstract val spectatingPlayer: Player?

    /**
     * The [Vehicle] the player is currently spectating.
     */
    abstract val spectatingVehicle: Vehicle?

    /**
     * The angle of the [Player]s character.
     */
    abstract var angle: Float

    /**
     * The [AngledLocation] of the [Player]s body.
     */
    abstract var location: AngledLocation

    /**
     * The interior of the [Player].
     */
    abstract var interior: Int

    /**
     * The world of the [Player].
     */
    abstract var world: Int

    /**
     * The facing angle of the [Player].
     */
    abstract var facingAngle: Float

    /**
     * The world bound of the [Player]s [World].
     */
    abstract var worldBound: Area

    /**
     * The [Velocity] of the [Player]s body.
     */
    abstract var velocity: Velocity

    /**
     * The current [PlayerState].
     */
    abstract val state: PlayerState

    /**
     * The currently active [Checkpoint].
     */
    abstract var checkpoint: Checkpoint?

    /**
     * The currently active [RaceCheckpoint].
     */
    abstract var raceCheckpoint: RaceCheckpoint?

    /**
     * The [DialogId] of the currently open dialog..
     */
    abstract val dialog: DialogId?

    /**
     * If the stunt bonus is enabled for the [Player].
     */
    abstract var isStuntBonusEnabled: Boolean

    /**
     * If the [Player] is spectating.
     */
    abstract var isSpectating: Boolean

    /**
     * If the [Player] is recording.
     */
    abstract var isRecording: Boolean

    /**
     * If the [Player] is currently controllable.
     */
    abstract var isControllable: Boolean

    /**
     * Sets the [SpawnInfo] for the [Player].
     * @param x X-Spawn-Position
     * @param y Y-Spawn-Position
     * @param z Z-Spawn-Position
     * @param interiorId Spawn-InteriorId
     * @param worldId Spawn-WorldId
     * @param angle Spawn-Angle
     * @param skinId The Skin when the Player spawns
     * @param teamId The Id of the Team
     * @param weapon1 First Spawn Weapon
     * @param weapon2 Second Spawn Weapon
     * @param weapon3 Third Spawn Weapon
     */
    abstract fun setSpawnInfo(x: Float = 0f, y: Float = 0f, z: Float = 0f, interiorId: Int = 0, worldId: Int = 0,
                              angle: Float = 0f, skinId: Int = this.skin, teamId: Int = this.team,
                              weapon1: WeaponData = WeaponData(), weapon2: WeaponData = WeaponData(),
                              weapon3: WeaponData = WeaponData())

    /**
     * Sets the [SpawnInfo] for the [Player].
     * @param pos Spawn-Position
     * @param interiorId Spawn-Interior
     * @param worldId Spawn-Worldid
     * @param angle Spawn-Angle
     * @param skinId The Skin when the Player spawns
     * @param teamId The Id of the Team
     * @param weapon1 WeaponData of first Spawn Weapon.
     * @param weapon2 WeaponData of second Spawn Weapon.
     * @param weapon3 WeaponData of third Spawn Weapon.
     */
    @JvmOverloads
    fun setSpawnInfo(pos: Vector3D, interiorId: Int = 0, worldId: Int = 0, angle: Float = 0f, skinId: Int = this.skin,
                     teamId: Int = this.team, weapon1: WeaponData = WeaponData(), weapon2: WeaponData = WeaponData(),
                     weapon3: WeaponData = WeaponData()) =
            setSpawnInfo(pos.x, pos.y, pos.z, interiorId, worldId, angle, skinId, teamId, weapon1, weapon2, weapon3)


    /**
     * Sets the [SpawnInfo] for the [Player].
     * @param loc Spawn-Location
     * @param skin The Skin when the Player spawns.
     * @param team The Id of the Team
     * @param weapon1 WeaponData of first Spawn Weapon.
     * @param weapon2 WeaponData of second Spawn Weapon.
     * @param weapon3 WeaponData of third Spawn Weapon.
     */
    @JvmOverloads
    fun setSpawnInfo(loc: AngledLocation, skin: Int = this.skin, team: Int = this.team, weapon1: WeaponData = WeaponData(),
                     weapon2: WeaponData = WeaponData(), weapon3: WeaponData = WeaponData()) =
        setSpawnInfo(loc.x, loc.y, loc.z, loc.interiorId, loc.worldId, loc.angle, skin, team, weapon1, weapon2,
        weapon3)

    /**
     * Sets the [SpawnInfo] for the [Player].
     * @param info SpawnInfo with all information
     */
    fun setSpawnInfo(info: SpawnInfo) =
            setSpawnInfo(info.location, info.skinId, info.teamId, info.weapon1, info.weapon2, info.weapon3)

    /**
     * Sets the ammo of the [weapon] to [ammo].
     * @param weapon WeaponModel of the Weapon
     * @param ammo New Ammo of the Weapon
     */
    abstract fun setWeaponAmmo(weapon: WeaponModel, ammo: Int)

    /**
     * Adds money to the [Player].
     */
    abstract fun giveMoney(money: Int)

    /**
     * Sets the current [Vehicle] of the [Player].
     * @param vehicle Vehicle to put the Player in
     * @param seat Seat id of the Vehicle
     */
    abstract fun setVehicle(vehicle: Vehicle, seat: Int)

    /**
     * Sets the [Location] of the [Player].
     * @param x X-Position
     * @param y Y-Position
     * @param z Z-Position
     */
    abstract fun setLocation(x: Float = this.location.x, y: Float = this.location.y, z: Float = this.location.z)

    /**
     * Sets the [Location] of the [Player].
     * @param pos Vector3D-Position
     */
    abstract fun setLocation(pos: Vector3D)

    /**
     * Sets the [Location] of the [Player].
     * @param loc Location
     */
    abstract fun setLocation(loc: Location)

    /**
     * Sets the Location of the Player, and then sets the Z-Position to the nearest Ground.
     * @param x X-Position
     * @param y Y-Position
     * @param z Z-Position
     */
    abstract fun setLocationFindZ(x: Float, y: Float, z: Float)

    /**
     * Sets the Location of the Player, and then sets the Z-Position to the nearest Ground.
     * @param pos Vector3D-Position
     */
    abstract fun setLocationFindZ(pos: Vector3D)

    /**
     * Sets the Location of the Player, and then sets the Z-Position to the nearest Ground.
     * @param loc Location
     */
    abstract fun setLocationFindZ(loc: Location)

    /**
     * Sets the Location of the Player, and then sets the Z-Position to the nearest Ground.
     * @param loc AngledLocation
     */
    abstract fun setLocationFindZ(loc: AngledLocation)

    /**
     * Sends [message] to the [Player].
     * @param message Text of the message.
     */
    abstract fun sendMessage(message: String)

    /**
     * Sends [message] to the [Player].
     * @param color Color of the Message
     * @param message Text of the Message
     */
    abstract fun sendMessage(color: Color = Color.WHITE, message: String)

    /**
     * Sends a formatted message to the Player.
     * @param color Color of the Message
     * @param format Formated Text of the Message
     * @param args Arguments
     */
    abstract fun sendMessage(color: Color = Color.WHITE, format: String, vararg args: Any)

    /**
     * Sends a message into the chat of a Player.
     * @param player Receiver
     * @param message Text of the Message
     */
    abstract fun sendChat(player: Player, message: String)

    /**
     * Sends a message into the chat of all [Player]s.
     * @param message Text of the Message
     */
    abstract fun sendChatToAll(message: String)

    /**
     * Sends a death message for the [Player] with [killer] and [victim].
     */
    abstract fun sendDeathMessage(killer: Player?, victim: Player?, weapon: WeaponModel)

    /**
     * Sends a GameText to the [Player].
     * @param time Visible Time
     * @param style Gametext Style
     * @param text Text to display
     */
    abstract fun sendGameText(time: Int, style: Int, text: String)

    /**
     * Send as formatted GameText to the Player.
     * @param time Visible Time
     * @param style Gametext Style
     * @param format Formated Text of the Message
     * @param args Arguments
     */
    abstract fun sendGameText(time: Int, style: Int, format: String, vararg args: Any)

    /**
     * Spawns the [Player], when the [SpawnInfo] is set.
     */
    abstract fun spawn()

    /**
     * The Drunklevel.
     */
    abstract var drunkLevel: Int

    /**
     * Applys an Animation to the Player.
     * @param animlib Location in Animlib
     * @param animname Name of Animation
     * @param delta Speed of the Animation
     * @param loop Looping
     * @param lockX Sets Player back to original X after Animation completed
     * @param lockY Sets Player back to original Y after Animation completed
     * @param freeze Freezes the Player while the Animation is running
     * @param time How long its getting played
     * @param forcesync Sync Animation with all Player
     */
    abstract fun applyAnimation(animlib: String, animname: String, delta: Float, loop: Int, lockX: Int, lockY: Int, freeze: Int,
                                time: Int, forcesync: Int)

    /**
     * Clears all animations.
     * @param forcesync Sync Animation with all Player
     */
    abstract fun clearAnimations(forcesync: Int)

    /**
     * The index of the current [Animation].
     */
    abstract val animationIndex: Int

    /**
     * Plays a sound from the library at a specific position.
     * @param sound Soundid
     * @param x X-Position
     * @param y Y-Position
     * @param z Z-Position
     */
    abstract fun playSound(sound: Int, x: Float, y: Float, z: Float)

    /**
     * Plays a sound from the library at a specific position.
     * @param sound
     * @param pos
     */
    abstract fun playSound(sound: Int, pos: Vector3D)


    /**
     * Plays a sound from the library.
     * @param sound
     */
    abstract fun playSound(sound: Int)

    /**
     * Sets the color of the [Player]s marker for a specific other [Player].
     * @param player Player to change Map Color
     * @param color New Color
     */
    abstract fun markerForPlayer(player: Player, color: Color)

    /**
     * Decides if [player] can see the [Player]'s nametag.
     * @param player Other Player
     * @param show Show
     */
    abstract fun showNameTagForPlayer(player: Player, show: Boolean)

    /**
     * Kicks the [Player], and closes the connection.
     */
    abstract fun kick()

    /**
     * Bans the [Player], and closes the connection.
     */
    abstract fun ban()

    /**
     * Bans the player with a reason, and closes the connection.
     * @param reason
     */
    abstract fun ban(reason: String)

    /**
     * The currently opened [Menu].
     */
    abstract val currentMenu: Menu?

    /**
     * Sets the camera to a specific position.
     * @param x X-Position
     * @param y Y-Position
     * @param z Z-Position
     */
    abstract fun setCameraPosition(x: Float, y: Float, z: Float)

    /**
     * Sets the look-at position of the camera to a specific location.
     * @param x X-Position
     * @param y Y-Position
     * @param z Z-Position
     * @param cut CutStyle
     */
    abstract fun setCameraLookAt(x: Float, y: Float, z: Float, cut: CameraCutStyle)

    /**
     * Sets the look-at position of the camera to a specific location.
     * @param lookAt Vector3D-Position
     * @param cut CutStyle
     */
    abstract fun setCameraLookAt(lookAt: Vector3D, cut: CameraCutStyle)

    /**
     * Sets the look-at position of the camera to a specific location.
     * @pam x X-Position
     * @param y Y-Position
     * @param z Z-Position
     */
    abstract fun setCameraLookAt(x: Float, y: Float, z: Float)

    /**
     * Sets the look-at position of the camera to a specific location.
     * @param lookAt Vector3D-Position
     */
    abstract fun setCameraLookAt(lookAt: Vector3D)

    /**
     * Sets the camera behind the [Player].
     */
    abstract fun setCameraBehind()

    /**
     * The current camera position.
     */
    abstract var cameraPosition: Vector3D

    /**
     * The front vector of the camera.
     */
    abstract val cameraFrontVector: Vector3D

    /**
     * If the [Player] is in any [Vehicle].
     */
    abstract val isInAnyVehicle: Boolean

    /**
     * If the [Player] is in [veh].
     */
    abstract fun isInVehicle(veh: Vehicle): Boolean

    /**
     * If the [Player] is logged in as an RCON-Admin.
     */
    abstract val isAdmin: Boolean

    /**
     * If the [Player] is streamed in for [forPlayer].
     * @param forPlayer Specific other Player
     */
    abstract fun isStreamedIn(forPlayer: Player): Boolean

    /**
     * Checks if the [Player] is an NPC.
     */
    abstract val isNpc: Boolean

    /**
     * Disables the current [Checkpoint].
     */
    abstract fun disableCheckpoint()

    /**
     * Disables the current [RaceCheckpoint].
     */
    abstract fun disableRaceCheckpoint()

    /**
     * The current [WeaponState].
     */
    abstract val weaponState: WeaponState

    /**
     * The [WeaponData] for [slot].
     * @param slot SlotId
     * @return The WeaponData
     */
    abstract fun getWeaponData(slot: Int): WeaponData?

    /**
     * Gives the [Player] a Weapon.
     * @param type Weapontype
     * @param ammo Ammount of Ammo
     */
    abstract fun giveWeapon(type: WeaponModel, ammo: Int)

    /**
     * Gives the Player a Weapon.
     * @param data WeaponData
     */
    abstract fun giveWeapon(data: WeaponData)

    /**
     * Removes all weapons from the [Player].
     */
    abstract fun resetWeapons()

    /**
     * The PlayerTime.
     */
    abstract var time: Time

    /**
     * Toggles the clock.
     * @param toggle enabled
     */
    abstract fun toggleClock(toggle: Boolean)

    /**
     * Forces the [Player] to reselect his character.
     */
    abstract fun forceClassSelection()

    /**
     * Plays a crime report for the [Player].
     * @param suspectId The suspected Id
     * @param crimeId The crime Id
     */
    abstract fun playCrimeReport(suspectId: Int, crimeId: Int)

    /**
     * Sets the Shopname for the [Player] to [shop].
     * @param shop Shopname
     */
    abstract fun setShopName(shop: ShopName)

    /**
     * The current surfing [Vehicle].
     * @return Surfing Vehicle.
     */
    abstract val surfingVehicle: Vehicle?

    /**
     * Removes the [Player] from the current [Vehicle].
     */
    abstract fun removeFromVehicle()

    /**
     * Toggles the controllability of the [Player]s character.
     * @param toggle controllable
     */
    abstract fun toggleControllable(toggle: Boolean)

    /**
     * The [PlayerMapIcon] for the [Player].
     * @return Players Map Icon
     */
    abstract val mapIcon: PlayerMapIcon

    /**
     * Toggles the stuntbonus.
     * @param enabled toggle
     */
    abstract fun enableStuntBonus(enabled: Boolean)

    /**
     * Toggles the spectate mode.
     * @param toggle toggle
     */
    abstract fun toggleSpectating(toggle: Boolean)

    /**
     * Sets the spectating [Player].
     * @param player Player to spectate
     * @param mode Spectatemode
     */
    abstract fun spectate(player: Player, mode: SpectateMode)

    /**
     * Sets the spectating [Vehicle].
     * @param veh Vehicle to spectate
     * @param mode Spectatemode
     */
    abstract fun spectate(veh: Vehicle, mode: SpectateMode)

    /**
     * Starts the recording.
     * @param type Recording type
     * @param recordName Filename
     */
    abstract fun startRecord(type: RecordType, recordName: String)

    /**
     * Stops the recording.
     */
    abstract fun stopRecord()

    /**
     * Gets the [SampObject] under the [Player] when he is surfing.
     * @return Surfing [SampObject]
     */
    abstract val surfingObject: SampObject?

    /**
     * The current network statistics.
     */
    abstract val networkStats: String

    /**
     * The [Player] which the current [Player] is aiming at.
     */
    abstract val aimedTarget: Player?

    /**
     * Starts an audio stream for the [Player].
     */
    abstract fun playAudioStream(url: String)

    /**
     * Starts an audio stream at a specific location.
     * @param url StreamUrl
     * @param x X-Position
     * @param y Y-Position
     * @param z Z-Position
     * @param distance Range, until it can be heard.
     */
    abstract fun playAudioStream(url: String, x: Float, y: Float, z: Float, distance: Float)

    /**
     * Starts an audio stream at a specific location.
     * @param url Streamurl
     * @param location StreamLocation
     * @param distance Range, until it can be heard.
     */
    abstract fun playAudioStream(url: String, location: Vector3D, distance: Float)

    /**
     * Starts an audio stream at a specific location.
     * @param url Streamurl
     * @param loc Location
     */
    abstract fun playAudioStream(url: String, loc: Radius)

    /**
     * Stops the audio stream.
     */
    abstract fun stopAudioStream()

    /**
     * Removes a building for the [Player].
     * @param modelId Object modelid
     * @param x X-Position
     * @param y Y-Position
     * @param z Z-Position
     * @param radius Radius
     */
    abstract fun removeBuilding(modelId: Int, x: Float, y: Float, z: Float, radius: Float)

    /**
     * The location where the last bullet was fired from.
     */
    abstract val lastShotOrigin: Vector3D

    /**
     * The location where the last bullet hit something.
     */
    abstract val lastShotHitPosition: Vector3D

    /**
     * Removes a building for the [Player].
     * @param modelId Objectmodelid
     * @param pos Position
     * @param radius Radius
     */
    abstract fun removeBuilding(modelId: Int, pos: Vector3D, radius: Float)

    /**
     * Removes a building for the [Player].
     * @param modelId Objectmodelid
     * @param loc Range
     */
    abstract fun removeBuilding(modelId: Int, loc: Radius)

    /**
     * Shows a dialog for the Player
     * @param dialog The Dialogid
     * @param style The Dialogstyle
     * @param caption The Dialogcaption
     * @param text Text to display
     * @param button1 Button 1 Text
     * @param button2 Button 2 Text
     */
    abstract fun showDialog(dialog: DialogId, style: DialogStyle, caption: String, text: String, button1: String, button2: String)

    /**
     * Cancels the current dialog.
     */
    abstract fun cancelDialog()

    /**
     * Starts editing an [SampObject].
     * @param object Object to edit
     * @return boolean(Success or failed)
     */
    abstract fun editObject(`object`: SampObject): Boolean

    /**
     * Starts editing an [PlayerObject].
     * @param object PlayerObject to edit
     * @return boolean(Success or failed)
     */
    abstract fun editPlayerObject(`object`: PlayerObject): Boolean

    /**
     * Starts the select-mode.
     */
    abstract fun selectObject()

    /**
     * Cancels the editing mode.
     */
    abstract fun cancelEdit()

    /**
     * Attaches the camera to an [SampObject].
     * @param object Object
     */
    abstract fun attachCameraTo(`object`: SampObject)

    /**
     * Attaches the camera to a [PlayerObject].
     * @param object PlayerObject
     */
    abstract fun attachCameraTo(`object`: PlayerObject)

    /**
     * Does a smooth camera movement from one point, to another
     * @param fromX Start X-Position
     * @param fromY Start Y-Position
     * @param fromZ Start Z-Positon
     * @param toX End X-Position
     * @param toY End Y-Position
     * @param toZ End Z-Position
     * @param time How long it will last
     * @param cut Camera Cut
     */
    abstract fun interpolateCameraPosition(fromX: Float, fromY: Float, fromZ: Float, toX: Float,
                                           toY: Float, toZ: Float, time: Int, cut: CameraCutStyle)

    /**
     * Does a smooth camera movement from one point, to another
     * @param from Start Position
     * @param to End Position
     * @param time How long it will need
     * @param cut Camera Cut
     */
    abstract fun interpolateCameraPosition(from: Vector3D, to: Vector3D, time: Int, cut: CameraCutStyle)

    /**
     * Does a smooth camera look-at movement from one point, to another.
     * @param fromX Start X-Position
     * @param fromY Start Y-Position
     * @param fromZ Start Z-Positon
     * @param toX End X-Position
     * @param toY End Y-Position
     * @param toZ End Z-Position
     * @param time How long it will need
     * @param cut Camera Cut
     */
    abstract fun interpolateCameraLookAt(fromX: Float, fromY: Float, fromZ: Float, toX: Float, toY: Float,
                                         toZ: Float, time: Int, cut: CameraCutStyle)

    /**
     * Does a smooth camera look-at movement from one point, to another.
     * @param from Start Position
     * @param to End Position
     * @param time How long it will need
     * @param cut Camera Cut
     */
    abstract fun interpolateCameraLookAt(from: Vector3D, to: Vector3D, time: Int, cut: CameraCutStyle)

    /**
     * Starts the [Textdraw] selection mode.
     * @param hoverColor Color of textdraw, when player hovers over it.
     */
    abstract fun selectTextDraw(hoverColor: Color)

    /**
     * Cancels the [Textdraw] selection.
     */
    abstract fun cancelSelectTextDraw()

    /**
     * Creates an explosion for the [Player] at a specific location.
     */
    abstract fun createExplosion(x: Float, y: Float, z: Float, type: Int, radius: Float)

    /**
     * Creates an explosion for the [Player] at a specific location.
     */
    fun createExplosion(pos: Vector3D, type: Int, radius: Float) = createExplosion(pos.x, pos.y, pos.z, type, radius)

    /**
     * Creates a explosion for the [Player] at a specific location.
     */
    fun createExplosion(pos: Radius, type: Int) = createExplosion(pos.x, pos.y, pos.z, type, pos.radius)

    /**
     * The version of the [Player]s client.
     */
    abstract val version: String

    /**
     * The zone name where the [Player] is located in. e.g. Las Venturas.
     */
    abstract val mainZoneName: LocationZone?

    /**
     * The detailed zone name where the [Player] is located in. e.g. The Strip.
     * @return The detailed zone name
     */
    abstract val zoneName: LocationZone?

    /**
     * The amount of milliseconds the [Player] is connected to the [Server].
     */
    abstract val connectedTime: Int

    /**
     * The amount of messages the [Server] has received from the [Player].
     */
    abstract val messagesReceived: Int

    /**
     * The amount of bytes the [Server] has received from the [Player].
     */
    abstract val bytesReceived: Int

    /**
     * The amount of messages the [Server] has sent to the [Player].
     */
    abstract val messagesSent: Int

    /**
     * The amount of bytes the [Server] has sent to the [Player].
     */
    abstract val bytesSent: Int

    /**
     * The amount of messages the [Server] receives from the [Player] every second.
     */
    abstract val messagesRecvPerSecond: Int

    /**
     * The percentage amount of packages that got lost while talking to the [Player].
     */
    abstract val packetLossPercent: Float

    /**
     * The current connection status between the [Server] and the [Player].
     */
    abstract val connectionStatus: Int

    /**
     * The IP-address and port the [Player] is connected to.
     */
    abstract val ipPort: String

    /**
     * Sets the chatbubble of the [Player] to [text] for [expireTime] seconds.
     */
    abstract fun setChatBubble(text: String, color: Color, drawDistance: Float, expireTime: Int)

    /**
     * Sets an integer value to [name].
     */
    abstract fun setVarInt(name: String, value: Int)

    /**
     * Gets an integer value from [name].
     */
    abstract fun getVarInt(name: String): Int

    /**
     * Sets a string value to [name].
     */
    abstract fun setVarString(name: String, value: String)

    /**
     * Gets a string value from [name].
     */
    abstract fun getVarString(name: String): String

    /**
     * Sets a float value to [name].
     */
    abstract fun setVarFloat(name: String, value: Float)

    /**
     * Gets a float value from [name].
     */
    abstract fun getVarFloat(name: String): Float

    /**
     * Deletes [name].
     */
    abstract fun deleteVar(name: String): Boolean

    /**
     * All available variable names.
     */
    abstract val varNames: List<String>

    /**
     * Gets the variable type of [name].
     */
    abstract fun getVarType(name: String): PlayerVarType?

    /**
     * Sets if the vehicle collision should be disabled.
     * @param disable If the collision should be disabled
     */
    abstract fun disableRemoteVehicleCollisions(disable: Boolean)

    /**
     * Sets if the CameraTarget-Function should be enabled (extra bandwidth)
     * @param enable If the function should be enabled
     */
    abstract fun enablePlayerCameraTarget(enable: Boolean)

    /**
     * The [Player]'s targeted [Actor].
     * You need to call [enablePlayerCameraTarget] to use this function.
     * @return Target actor
     */
    abstract val cameraTargetActor: Actor?

    /**
     * The [Player]'s targeted [SampObject].
     * You need to call [enablePlayerCameraTarget] to use this function.
     * @return Target entities
     */
    abstract val cameraTargetObject: SampObject?

    /**
     * The [Player]'s targeted [Player].
     * You need to call [enablePlayerCameraTarget] to use this function
     * @return Target player
     */
    abstract val cameraTargetPlayer: Player?

    /**
     * The [Player]'s targeted [Vehicle].
     * You need to call [enablePlayerCameraTarget] to use this function.
     * @return Target vehicle
     */
    abstract val cameraTargetVehicle: Vehicle?

    /**
     * The [Player]'s targeted [Actor] with weapon.
     * @return Targeted actor (with weapon, not with camera)
     */
    abstract val targetActor: Actor?

    /**
     * Quick-register Events
     */
    @JvmOverloads
    fun onClickMapEvent(handler: EventHandler<PlayerClickMapEvent>, priority: HandlerPriority = HandlerPriority.NORMAL) =
            eventManagerNode.registerHandler(PlayerClickMapEvent::class.java, handler, priority, attention)

    @JvmOverloads
    fun onClickPlayer(handler: EventHandler<PlayerClickPlayerEvent>, priority: HandlerPriority = HandlerPriority.NORMAL) =
            eventManagerNode.registerHandler(PlayerClickPlayerEvent::class.java, handler, priority, attention)

    @JvmOverloads
    fun onClickPlayerTextDraw(handler: EventHandler<PlayerClickPlayerTextDrawEvent>, priority: HandlerPriority = HandlerPriority.NORMAL) =
            eventManagerNode.registerHandler(PlayerClickPlayerTextDrawEvent::class.java, handler, priority, attention)

    @JvmOverloads
    fun onClickTextDraw(handler: EventHandler<PlayerClickTextDrawEvent>, priority: HandlerPriority = HandlerPriority.NORMAL) =
            eventManagerNode.registerHandler(PlayerClickTextDrawEvent::class.java, handler, priority, attention)

    @JvmOverloads
    fun onCommand(handler: EventHandler<PlayerCommandEvent>, priority: HandlerPriority = HandlerPriority.NORMAL) =
            eventManagerNode.registerHandler(PlayerCommandEvent::class.java, handler, priority, attention)

    @JvmOverloads
    fun onConnect(handler: EventHandler<PlayerConnectEvent>, priority: HandlerPriority = HandlerPriority.NORMAL) =
            eventManagerNode.registerHandler(PlayerConnectEvent::class.java, handler, priority, attention)

    @JvmOverloads
    fun onDamageActor(handler: EventHandler<PlayerDamageActorEvent>, priority: HandlerPriority = HandlerPriority.NORMAL) =
            eventManagerNode.registerHandler(PlayerDamageActorEvent::class.java, handler, priority, attention)

    @JvmOverloads
    fun onDeath(handler: EventHandler<PlayerDeathEvent>, priority: HandlerPriority = HandlerPriority.NORMAL) =
            eventManagerNode.registerHandler(PlayerDeathEvent::class.java, handler, priority, attention)

    @JvmOverloads
    fun onDisconnect(handler: EventHandler<PlayerDisconnectEvent>, priority: HandlerPriority = HandlerPriority.NORMAL) =
            eventManagerNode.registerHandler(PlayerDisconnectEvent::class.java, handler, priority, attention)

    @JvmOverloads
    fun onEditAttachedObject(handler: EventHandler<PlayerEditAttachedObjectEvent>, priority: HandlerPriority = HandlerPriority.NORMAL) =
            eventManagerNode.registerHandler(PlayerEditAttachedObjectEvent::class.java, handler, priority, attention)

    @JvmOverloads
    fun onEditObject(handler: EventHandler<PlayerEditObjectEvent>, priority: HandlerPriority = HandlerPriority.NORMAL) =
            eventManagerNode.registerHandler(PlayerEditObjectEvent::class.java, handler, priority, attention)

    @JvmOverloads
    fun onEditPlayerObject(handler: EventHandler<PlayerEditPlayerObjectEvent>, priority: HandlerPriority = HandlerPriority.NORMAL) =
            eventManagerNode.registerHandler(PlayerEditPlayerObjectEvent::class.java, handler, priority, attention)

    @JvmOverloads
    fun onEnterExitModShop(handler: EventHandler<PlayerEnterExitModShopEvent>, priority: HandlerPriority = HandlerPriority.NORMAL) =
            eventManagerNode.registerHandler(PlayerEnterExitModShopEvent::class.java, handler, priority, attention)

    @JvmOverloads
    fun onGiveDamage(handler: EventHandler<PlayerGiveDamageEvent>, priority: HandlerPriority = HandlerPriority.NORMAL) =
            eventManagerNode.registerHandler(PlayerGiveDamageEvent::class.java, handler, priority, attention)

    @JvmOverloads
    fun onInteriorChange(handler: EventHandler<PlayerInteriorChangeEvent>, priority: HandlerPriority = HandlerPriority.NORMAL) =
            eventManagerNode.registerHandler(PlayerInteriorChangeEvent::class.java, handler, priority, attention)

    @JvmOverloads
    fun onKeyStateChange(handler: EventHandler<PlayerKeyStateChangeEvent>, priority: HandlerPriority = HandlerPriority.NORMAL) =
            eventManagerNode.registerHandler(PlayerKeyStateChangeEvent::class.java, handler, priority, attention)

    @JvmOverloads
    fun onKill(handler: EventHandler<PlayerKillEvent>, priority: HandlerPriority = HandlerPriority.NORMAL) =
            eventManagerNode.registerHandler(PlayerKillEvent::class.java, handler, priority, attention)

    @JvmOverloads
    fun onPickup(handler: EventHandler<PlayerPickupEvent>, priority: HandlerPriority = HandlerPriority.NORMAL) =
            eventManagerNode.registerHandler(PlayerPickupEvent::class.java, handler, priority, attention)

    @JvmOverloads
    fun onRequestClass(handler: EventHandler<PlayerRequestClassEvent>, priority: HandlerPriority = HandlerPriority.NORMAL) =
            eventManagerNode.registerHandler(PlayerRequestClassEvent::class.java, handler, priority, attention)

    @JvmOverloads
    fun onRequestSpawn(handler: EventHandler<PlayerRequestSpawnEvent>, priority: HandlerPriority = HandlerPriority.NORMAL) =
            eventManagerNode.registerHandler(PlayerRequestSpawnEvent::class.java, handler, priority, attention)

    @JvmOverloads
    fun onSelectObject(handler: EventHandler<PlayerSelectObjectEvent>, priority: HandlerPriority = HandlerPriority.NORMAL) =
            eventManagerNode.registerHandler(PlayerSelectObjectEvent::class.java, handler, priority, attention)

    @JvmOverloads
    fun onSelectPlayerObject(handler: EventHandler<PlayerSelectPlayerObjectEvent>, priority: HandlerPriority = HandlerPriority.NORMAL) =
            eventManagerNode.registerHandler(PlayerSelectPlayerObjectEvent::class.java, handler, priority, attention)

    @JvmOverloads
    fun onSpawn(handler: EventHandler<PlayerSpawnEvent>, priority: HandlerPriority = HandlerPriority.NORMAL) =
            eventManagerNode.registerHandler(PlayerSpawnEvent::class.java, handler, priority, attention)

    @JvmOverloads
    fun onStateChange(handler: EventHandler<PlayerStateChangeEvent>, priority: HandlerPriority = HandlerPriority.NORMAL) =
            eventManagerNode.registerHandler(PlayerStateChangeEvent::class.java, handler, priority, attention)

    @JvmOverloads
    fun onStreamIn(handler: EventHandler<PlayerStreamInEvent>, priority: HandlerPriority = HandlerPriority.NORMAL) =
            eventManagerNode.registerHandler(PlayerStreamInEvent::class.java, handler, priority, attention)

    @JvmOverloads
    fun onStreamOut(handler: EventHandler<PlayerStreamOutEvent>, priority: HandlerPriority = HandlerPriority.NORMAL) =
            eventManagerNode.registerHandler(PlayerStreamOutEvent::class.java, handler, priority, attention)

    @JvmOverloads
    fun onTakeDamage(handler: EventHandler<PlayerTakeDamageEvent>, priority: HandlerPriority = HandlerPriority.NORMAL) =
            eventManagerNode.registerHandler(PlayerTakeDamageEvent::class.java, handler, priority, attention)

    @JvmOverloads
    fun onText(handler: EventHandler<PlayerTextEvent>, priority: HandlerPriority = HandlerPriority.NORMAL) =
            eventManagerNode.registerHandler(PlayerTextEvent::class.java, handler, priority, attention)

    @JvmOverloads
    fun onUpdate(handler: EventHandler<PlayerUpdateEvent>, priority: HandlerPriority = HandlerPriority.NORMAL) =
            eventManagerNode.registerHandler(PlayerUpdateEvent::class.java, handler, priority, attention)

    @JvmOverloads
    fun onWeaponShot(handler: EventHandler<PlayerWeaponShotEvent>, priority: HandlerPriority = HandlerPriority.NORMAL) =
            eventManagerNode.registerHandler(PlayerWeaponShotEvent::class.java, handler, priority, attention)

    //-----------//-----------//-----------//-----------//-----------//-----------//-----------//-----------//----------

    @JvmOverloads
    fun onClickMapEvent(handler: (PlayerClickMapEvent) -> Unit, priority: HandlerPriority = HandlerPriority.NORMAL) =
            onClickMapEvent(EventHandler { handler(it) }, priority)

    @JvmOverloads
    fun onClickPlayer(handler: (PlayerClickPlayerEvent) -> Unit, priority: HandlerPriority = HandlerPriority.NORMAL) =
            onClickPlayer(EventHandler { handler(it) }, priority)

    @JvmOverloads
    fun onClickPlayerTextDraw(handler: (PlayerClickPlayerTextDrawEvent) -> Unit, priority: HandlerPriority = HandlerPriority.NORMAL) =
            onClickPlayerTextDraw(EventHandler { handler(it) }, priority)

    @JvmOverloads
    fun onClickTextDraw(handler: (PlayerClickTextDrawEvent) -> Unit, priority: HandlerPriority = HandlerPriority.NORMAL) =
            onClickTextDraw(EventHandler { handler(it) }, priority)

    @JvmOverloads
    fun onCommand(handler: (PlayerCommandEvent) -> Unit, priority: HandlerPriority = HandlerPriority.NORMAL) =
            onCommand(EventHandler { handler(it) }, priority)

    @JvmOverloads
    fun onConnect(handler: (PlayerConnectEvent) -> Unit, priority: HandlerPriority = HandlerPriority.NORMAL) =
            onConnect(EventHandler { handler(it) }, priority)

    @JvmOverloads
    fun onDamageActor(handler: (PlayerDamageActorEvent) -> Unit, priority: HandlerPriority = HandlerPriority.NORMAL) =
            onDamageActor(EventHandler { handler(it) }, priority)

    @JvmOverloads
    fun onDeath(handler: (PlayerDeathEvent) -> Unit, priority: HandlerPriority = HandlerPriority.NORMAL) =
            onDeath(EventHandler { handler(it) }, priority)

    @JvmOverloads
    fun onDisconnect(handler: (PlayerDisconnectEvent) -> Unit, priority: HandlerPriority = HandlerPriority.NORMAL) =
            onDisconnect(EventHandler { handler(it) }, priority)

    @JvmOverloads
    fun onEditAttachedObject(handler: (PlayerEditAttachedObjectEvent) -> Unit, priority: HandlerPriority = HandlerPriority.NORMAL) =
            onEditAttachedObject(EventHandler { handler(it) }, priority)

    @JvmOverloads
    fun onEditObject(handler: (PlayerEditObjectEvent) -> Unit, priority: HandlerPriority = HandlerPriority.NORMAL) =
            onEditObject(EventHandler { handler(it) }, priority)

    @JvmOverloads
    fun onEditPlayerObject(handler: (PlayerEditPlayerObjectEvent) -> Unit, priority: HandlerPriority = HandlerPriority.NORMAL) =
            onEditPlayerObject(EventHandler { handler(it) }, priority)

    @JvmOverloads
    fun onEnterExitModShop(handler: (PlayerEnterExitModShopEvent) -> Unit, priority: HandlerPriority = HandlerPriority.NORMAL) =
            onEnterExitModShop(EventHandler { handler(it) }, priority)

    @JvmOverloads
    fun onGiveDamage(handler: (PlayerGiveDamageEvent) -> Unit, priority: HandlerPriority = HandlerPriority.NORMAL) =
            onGiveDamage(EventHandler { handler(it) }, priority)

    @JvmOverloads
    fun onInteriorChange(handler: (PlayerInteriorChangeEvent) -> Unit, priority: HandlerPriority = HandlerPriority.NORMAL) =
            onInteriorChange(EventHandler { handler(it) }, priority)

    @JvmOverloads
    fun onKeyStateChange(handler: (PlayerKeyStateChangeEvent) -> Unit, priority: HandlerPriority = HandlerPriority.NORMAL) =
            onKeyStateChange(EventHandler { handler(it) }, priority)

    @JvmOverloads
    fun onKill(handler: (PlayerKillEvent) -> Unit, priority: HandlerPriority = HandlerPriority.NORMAL) =
            onKill(EventHandler { handler(it) }, priority)

    @JvmOverloads
    fun onPickup(handler: (PlayerPickupEvent) -> Unit, priority: HandlerPriority = HandlerPriority.NORMAL) =
            onPickup(EventHandler { handler(it) }, priority)

    @JvmOverloads
    fun onRequestClass(handler: (PlayerRequestClassEvent) -> Unit, priority: HandlerPriority = HandlerPriority.NORMAL) =
            onRequestClass(EventHandler { handler(it) }, priority)

    @JvmOverloads
    fun onRequestSpawn(handler: (PlayerRequestSpawnEvent) -> Unit, priority: HandlerPriority = HandlerPriority.NORMAL) =
            onRequestSpawn(EventHandler { handler(it) }, priority)

    @JvmOverloads
    fun onSelectObject(handler: (PlayerSelectObjectEvent) -> Unit, priority: HandlerPriority = HandlerPriority.NORMAL) =
            onSelectObject(EventHandler { handler(it) }, priority)

    @JvmOverloads
    fun onSelectPlayerObject(handler: (PlayerSelectPlayerObjectEvent) -> Unit, priority: HandlerPriority = HandlerPriority.NORMAL) =
            onSelectPlayerObject(EventHandler { handler(it) }, priority)

    @JvmOverloads
    fun onSpawn(handler: (PlayerSpawnEvent) -> Unit, priority: HandlerPriority = HandlerPriority.NORMAL) =
            onSpawn(EventHandler { handler(it) }, priority)

    @JvmOverloads
    fun onStateChange(handler: (PlayerStateChangeEvent) -> Unit, priority: HandlerPriority = HandlerPriority.NORMAL) =
            onStateChange(EventHandler { handler(it) }, priority)

    @JvmOverloads
    fun onStreamIn(handler: (PlayerStreamInEvent) -> Unit, priority: HandlerPriority = HandlerPriority.NORMAL) =
            onStreamIn(EventHandler { handler(it) }, priority)

    @JvmOverloads
    fun onStreamOut(handler: (PlayerStreamOutEvent) -> Unit, priority: HandlerPriority = HandlerPriority.NORMAL) =
            onStreamOut(EventHandler { handler(it) }, priority)

    @JvmOverloads
    fun onTakeDamage(handler: (PlayerTakeDamageEvent) -> Unit, priority: HandlerPriority = HandlerPriority.NORMAL) =
            onTakeDamage(EventHandler { handler(it) }, priority)

    @JvmOverloads
    fun onText(handler: (PlayerTextEvent) -> Unit, priority: HandlerPriority = HandlerPriority.NORMAL) =
            onText(EventHandler { handler(it) }, priority)

    @JvmOverloads
    fun onUpdate(handler: (PlayerUpdateEvent) -> Unit, priority: HandlerPriority = HandlerPriority.NORMAL) =
            onUpdate(EventHandler { handler(it) }, priority)

    @JvmOverloads
    fun onWeaponShot(handler: (PlayerWeaponShotEvent) -> Unit, priority: HandlerPriority = HandlerPriority.NORMAL) =
            onWeaponShot(EventHandler { handler(it) }, priority)

    companion object : Collectable<Player>, Findable<Int, Player> {

        /**
         * The maximum amount of [Player]s on the [Server].
         */
        @JvmStatic
        val maxPlayers: Int
            get() = Server.get().maxPlayers

        /**
         * Connects an NPC to the [Server].
         */
        @JvmStatic
        fun connectNPC(name: String, script: String) = Server.get().connectNPC(name, script)

        /**
         * Sends [message] to everyone.
         */
        @JvmStatic
        fun sendMessageToAll(color: Color, message: String) = Server.get().sendMessageToAll(color, message)

        /**
         * Sends a formatted message to everyone.
         */
        @JvmStatic
        fun sendMessageToAll(color: Color, format: String, vararg args: Any) =
                Server.get().sendMessageToAll(color, format, *args)

        /**
         * Sends a GameText to everyone.
         */
        @JvmStatic
        fun gameTextToAll(time: Int, style: Int, text: String) = Server.get().gameTextToAll(time, style, text)

        /**
         * Sends a GameText to everyone.
         */
        @JvmStatic
        fun gameTextToAll(time: Int, style: Int, format: String, vararg args: Any) =
                Server.get().gameTextToAll(time, style, format, *args)

        /**
         * Sends a death message to everyone.
         */
        @JvmStatic
        fun sendDeathMessageToAll(killer: Player?, victim: Player?, reason: WeaponModel) =
                Server.get().sendDeathMessageToAll(killer, victim, reason)

        /**
         * The [Player] pool size.
         */
        @JvmStatic
        val poolSize: Int
            get() = SampObjectManager.get().playerPoolSize

        /**
         * Gets a [Player] by it's [id].
         * @param value Id of the Player
         * @return The found Player
         */
        @JvmStatic
        override operator fun get(value: Int): Player? = SampObjectManager.get().getPlayer(value)

        /**
         * Gets all available [Player]s.
         */
        @JvmStatic
        override fun get(): Collection<Player> = SampObjectManager.get().players.filterNotNull()

        /**
         * Gets a [Player] by it's name.
         * @param name Name of the Player
         * @return The found Player
         */
        @JvmStatic
        operator fun get(name: String): Player? = SampObjectManager.get().getPlayer(name.trim { it <= ' ' })

        /**
         * Gets a [Player] by it's [name] or it's [id].
         * @param nameOrId The Name or Id
         * @return The found Player
         */
        @JvmStatic
        fun getByNameOrId(nameOrId: String): Player? {
            val nameOrIdTrimmed = nameOrId.trim { it <= ' ' }
            var player: Player? = get(nameOrIdTrimmed)
            if (player == null && NumberUtils.isDigits(nameOrIdTrimmed))
                player = get(nameOrIdTrimmed.toInt())
            return player
        }

        /**
         * Gets a [Player] by a part of his [name].
         * @param partOfName Part of the name
         * @return The found player
         */
        @JvmStatic
        fun getByPartOfName(partOfName: String): Player? {
            val partOfNameTrimmed = partOfName.trim { it <= ' ' }
            var highestHit = -25
            var highestHitPlayer: Player? = null
            get().filter { it.name.contains(partOfNameTrimmed, true) }
                .forEach {
                    val result = Math.abs(it.name.compareTo(partOfNameTrimmed))
                    if(highestHitPlayer == null || result < highestHit) {
                        highestHit = result
                        highestHitPlayer = it
                    }
                }
            return highestHitPlayer
        }

        /**
         * Gets the online human [Player]s.
         * @return Collection of human Players.
         */
        @JvmStatic
        val humans: Collection<Player>
            get() = SampObjectManager.get().humanPlayers

        /**
         * Gets the connected NPCs.
         * @return Collection of NPC Players.
         */
        @JvmStatic
        val npcs: Collection<Player>
            get() = SampObjectManager.get().npcPlayers


        /**
         * Invalid Player ID
         */
        @JvmField
        val INVALID_ID = 0xFFFF

        /**
         * Team ID for "No Team"
         */
        @JvmField
        val NO_TEAM = 255

        /**
         * Max length for [name].
         */
        @JvmField
        val MAX_NAME_LENGTH = 24

        /**
         * Max length for chatbubbles.
         */
        @JvmField
        val MAX_CHATBUBBLE_LENGTH = 144
    }
}

/**
 * Copyright (C) 2011-2014 MK124
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.gtaun.shoebill.object;

import net.gtaun.shoebill.SampObjectManager;
import net.gtaun.shoebill.constant.*;
import net.gtaun.shoebill.data.*;
import net.gtaun.shoebill.exception.AlreadyExistException;
import net.gtaun.shoebill.exception.IllegalLengthException;
import org.apache.commons.lang3.math.NumberUtils;

import java.util.Collection;
import java.util.List;

/**
 *
 *
 * @author MK124
 */
public interface Player extends Proxyable<Player>
{
	static int getMaxPlayers()
	{
		return Server.get().getMaxPlayers();
	}

	static void connectNPC(String name, String script)
	{
		Server.get().connectNPC(name, script);
	}

	static void sendMessageToAll(Color color, String message)
	{
		Server.get().sendMessageToAll(color, message);
	}

	static void sendMessageToAll(Color color, String format, Object... args)
	{
		Server.get().sendMessageToAll(color, format, args);
	}

	static void gameTextToAll(int time, int style, String text)
	{
		Server.get().gameTextToAll(time, style, text);
	}

	static void gameTextToAll(int time, int style, String format, Object... args)
	{
		Server.get().gameTextToAll(time, style, format, args);
	}

	static void sendDeathMessageToAll(Player killer, Player victim, WeaponModel reason)
	{
		Server.get().sendDeathMessageToAll(killer, victim, reason);
	}

	/**
	 * Gets the player's pool size
	 * @return Player's pool size
	 */
	static int getPoolSize()
	{
		return SampObjectManager.get().getPlayerPoolSize();
	}

    /**
     * Gets a Player by its Id
     * @param id Id of the Player
     * @return The found Player
     */
	static Player get(int id)
	{
		return SampObjectManager.get().getPlayer(id);
	}

    /**
     * Gets a Player by its Name
     * @param name Name of the Player
     * @return The found Player
     */
	static Player get(String name)
	{
		return SampObjectManager.get().getPlayer(name.trim());
	}

    /**
     * Gets a Player by its name or its Id
     * @param nameOrId The Name or Id
     * @return The found Player
     */
	static Player getByNameOrId(String nameOrId)
	{
		nameOrId = nameOrId.trim();
		Player player = get(nameOrId);
		if (player == null && NumberUtils.isDigits(nameOrId)) player = get(NumberUtils.toInt(nameOrId));

		return player;
	}

	/**
	 * Gets a Player or npc by a part of his name
	 *
	 * @param partOfName Part of the name
	 * @return The found player, or else null
	 */
	static Player getByPartOfName(String partOfName) {
		partOfName = partOfName.trim();
		int highestHit = -25;
		Player highestHitPlayer = null;
		for (Player player : get()) {
			String playerName = player.getName();
			if (playerName.contains(partOfName)) {
				int result = Math.abs(playerName.compareTo(partOfName));
				if (highestHitPlayer == null || result < highestHit) {
					highestHit = result;
					highestHitPlayer = player;
				}
			}
		}
		return highestHitPlayer;
	}

	static Collection<Player> get()
	{
		return SampObjectManager.get().getPlayers();
	}

	/**
	 * Get the collection of the online human players.
	 *
	 * @return Collection of human Players.
	 */
	static Collection<Player> getHumans()
	{
		return SampObjectManager.get().getHumanPlayers();
	}

	/**
	 * Get the collection of the online NPC players.
	 *
	 * @return Collection of NPC Players.
	 */
	static Collection<Player> getNpcs()
	{
		return SampObjectManager.get().getNpcPlayers();
	}


	int INVALID_ID =				0xFFFF;
	int NO_TEAM =					255;
	int MAX_NAME_LENGTH =			24;

	int MAX_CHATBUBBLE_LENGTH =		144;

    /**
     * Gets the Onlinestate
     * @return State of the Player
     */
	boolean isOnline();

    /**
     * Gets the Id of the Player
     * @return Playerid
     */
	int getId();

    /**
     * Gets the current KeyState
     * @return Current Keystate
     */
	PlayerKeyState getKeyState();

    /**
     * Gets the Objects attached on the Player
     * @return The PlayerAttach Object
     */
	PlayerAttach getAttach();

    /**
     * Gets the WeaponSkill of the Player
     * @return The WeaponSkill
     */
	PlayerWeaponSkill getWeaponSkill();

    /**
     * Gets the Ping of the Player.
     * @return The Ping
     */
	int getPing();

    /**
     * Gets the Team of the Player
     * @return The Team
     */
	int getTeam();

    /**
     * Gets the Skin of the Player.
     * @return The Skin
     */
	int getSkin();

    /**
     * Gets the Wantedlevel of the Player.
     * @return The Wantedlevel
     */
	int getWantedLevel();

    /**
     * Gets the Codepage of the Player.
     * @return The Codepage
     */
	int getCodepage();

    /**
     * Gets the IP-Address of the Player.
     * @return The IP-Address
     */
	String getIp();

    /**
     * Gets the name of the Player.
     * @return The Name
     */
	String getName();

    /**
     * Gets the Color of the Player.
     * @return The Color
     */
	Color getColor();

    /**
     * Gets the Updatecount of the Player.
     * @return The Updatecount
     */
	long getUpdateCount();

    /**
     * Gets the Health of the Player
     * @return Health of the Player
     */
	float getHealth();

    /**
     * Gets the Armour of the Player
     * @return Armour of the Player
     */
	float getArmour();

    /**
     * Gets the current armed Weapon.
     * @return The Weaponmodel of the current armed Weapon.
     */
	WeaponModel getArmedWeapon();

	void setArmedWeapon(WeaponModel model);

    /**
     * Gets the Ammo of the armed Weapon.
     * @return The Ammo of the armed Weapon
     */
	int getArmedWeaponAmmo();

    /**
     * Gets the Money of the Player.
     * @return Money of the Player
     */
	int getMoney();

    /**
     * Gets the Score of the Player.
     * @return Score of the Player
     */
	int getScore();

    /**
     * Gets the Weatherid of the Players Weather.
     * @return Weatherid of Players Weather
     */
	int getWeather();

    /**
     * Gets the CameraMode of the Player
     * @return CameraMode from Player
     */
	int getCameraMode();

	float getCameraAspectRatio();

	float getCameraZoom();

    /**
     * Gets the Fightstyle of the Player.
     * @return Fightstyle from Player
     */
	FightStyle getFightStyle();

    /**
     * Gets the current Vehicle
     * @return Current Vehhicle
     */
	Vehicle getVehicle();

    /**
     * Gets the Vehicleseat from the Currentvehicle
     * @return SeatId
     */
	int getVehicleSeat();

    /**
     * Gets the current SpecialAction
     * @return Current SpecialAction
     */
	SpecialAction getSpecialAction();

    /**
     * Gets the Player which the current Player is spectating.
     * @return Player which is getting spectated
     */
	Player getSpectatingPlayer();

    /**
     * Gets the Vehicle which the current Player is spectating.
     * @return Vehicle which is gettings spectated.
     */
	Vehicle getSpectatingVehicle();

	float getAngle();

    /**
     * Gets the Location of the Player
     * @return Location
     */
	AngledLocation getLocation();

    /**
     * Gets the Worldbound of the Player
     * @return Worldbound
     */
	Area getWorldBound();

    /**
     * Gets the Velocity of the Player
     * @return Velocity
     */
	Velocity getVelocity();

    /**
     * Gets the PlayerState of the Player
     * @return Current PlayerState
     */
	PlayerState getState();

    /**
     * Gets the current active Checkpoint.
     * @return Current Checkpoint
     */
	Checkpoint getCheckpoint();

    /**
     * Gets the current active Race Checkpoint.
     * @return Current Race Checkpoint
     */
	RaceCheckpoint getRaceCheckpoint();

    /**
     * Gets the Dialogid of the opened Dialog.
     * @return The Id of the current Dialog
     */
	DialogId getDialog();

    /**
     * Checks if Stuntbonus is enabled for this player.
     * @return The Stuntbonus state
     */
	boolean isStuntBonusEnabled();

    /**
     * Checks if the Player is spectating.
     * @return The spectating state
     */
	boolean isSpectating();

    /**
     * Check if the Player is recording.
     * @return The Recording state
     */
	boolean isRecording();

    /**
     * Checks if the Player is controllable (Freezed or not).
     * @return The Controllable state
     */
	boolean isControllable();

    /**
     * Sets the codepage by Id.
     * @param codepage Id of the Codepage
     */
	void setCodepage(int codepage);

    /**
     * Sets the Name of the Player.
     * @param name New name
     * @throws IllegalArgumentException
     * @throws IllegalLengthException
     * @throws AlreadyExistException
     */
	void setName(String name) throws IllegalArgumentException, IllegalLengthException, AlreadyExistException;

    /**
     * Sets the Spawninfo of the Player.
     * @param x X-Spawn-Position
     * @param y Y-Spawn-Position
     * @param z Z-Spawn-Position
     * @param interiorId Spawn-InteriorId
     * @param worldId Spawn-Worldid
     * @param angle Spawn-Angle
     * @param skinId The Skin when the Player spawns
     * @param teamId The Id of the Team
     * @param weapon1 First Spawn Weapon
     * @param ammo1 Ammo of first Weapon
     * @param weapon2 Second Spawn Weapon
     * @param ammo2 Ammo of second Weapon
     * @param weapon3 Third Spawn Weapon
     * @param ammo3 Ammo of third spawn Weapon
     */
	void setSpawnInfo(float x, float y, float z, int interiorId, int worldId, float angle, int skinId, int teamId, WeaponModel weapon1, int ammo1, WeaponModel weapon2, int ammo2, WeaponModel weapon3, int ammo3);

    /**
     * Sets the Spawninfo of the Player.
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
    void setSpawnInfo(Vector3D pos, int interiorId, int worldId, float angle, int skinId, int teamId, WeaponData weapon1, WeaponData weapon2, WeaponData weapon3);

    /**
     * Sets the Spawninfo of the Player.
     * @param loc Spawn-Location
     * @param angle Spawn-Angle
     * @param skinId The Skin when the Player spawns
     * @param teamId The Id of the Team
     * @param weapon1 WeaponData of first Spawn Weapon.
     * @param weapon2 WeaponData of second Spawn Weapon.
     * @param weapon3 WeaponData of third Spawn Weapon.
     */
	void setSpawnInfo(Location loc, float angle, int skinId, int teamId, WeaponData weapon1, WeaponData weapon2, WeaponData weapon3);

    /**
     * Sets the Spawninfo of the Player.
     * @param loc Spawn-Location
     * @param skin The Skin when the Player spawns.
     * @param team The Id of the Team
     * @param weapon1 WeaponData of first Spawn Weapon.
     * @param weapon2 WeaponData of second Spawn Weapon.
     * @param weapon3 WeaponData of third Spawn Weapon.
     */
	void setSpawnInfo(AngledLocation loc, int skin, int team, WeaponData weapon1, WeaponData weapon2, WeaponData weapon3);

    /**
     * Sets the Spawninfo of the Player.
     * @param info SpawnInfo with all information
     */
	void setSpawnInfo(SpawnInfo info);

    /**
     * Sets the Color of the Player on the Map.
     * @param color New Color
     */
	void setColor(Color color);

    /**
     * Sets the Health of the Player.
     * @param health New Health
     */
	void setHealth(float health);

    /**
     * Sets the Armour of the Player.
     * @param armour New Armour
     */
	void setArmour(float armour);

    /**
     * Sets the Ammo of a specific Weapon by Id.
     * @param weapon WeaponModel of the Weapon
     * @param ammo New Ammo of the Weapon
     */
	void setWeaponAmmo(WeaponModel weapon, int ammo);

    /**
     * Sets the Money of the Player.
     * @param money New Money
     */
	void setMoney(int money);

    /**
     * Gives Money to the Player.
     * @param money Amount of Money to give
     */
	void giveMoney(int money);

    /**
     * Sets the score of the Player.
     * @param score New Score
     */
	void setScore(int score);

    /**
     * Sets the Weather for the Player.
     * @param weatherId New Weather
     */
	void setWeather(int weatherId);

    /**
     * Sets the Fightstyle of the Player.
     * @param style New Fightstyle
     */
	void setFightStyle(FightStyle style);

    /**
     * Sets the current Vehicle of the Player.
     * @param vehicle Vehicle to put the Player in
     * @param seat Seat id of the Vehicle
     */
	void setVehicle(Vehicle vehicle, int seat);

    /**
     * Sets the current Vehicle of the Player.
     * @param vehicle Vehicle to put the Player in
     */
	void setVehicle(Vehicle vehicle);

    /**
     * Sets the Location of the Player.
     * @param x X-Position
     * @param y Y-Position
     * @param z Z-Position
     */
	void setLocation(float x, float y, float z);

    /**
     * Sets the Location of the Player.
     * @param pos Vector3D-Position
     */
	void setLocation(Vector3D pos);

    /**
     * Sets the Location of the Player.
     * @param loc Location
     */
	void setLocation(Location loc);

    /**
     * Sets the Location of the Player.
     * @param loc AngledLocation
     */
	void setLocation(AngledLocation loc);

    /**
     * Sets the Location of the Player, and then sets the Z-Position to the nearest Ground.
     * @param x X-Position
     * @param y Y-Position
     * @param z Z-Position
     */
	void setLocationFindZ(float x, float y, float z);

    /**
     * Sets the Location of the Player, and then sets the Z-Position to the nearest Ground.
     * @param pos Vector3D-Position
     */
	void setLocationFindZ(Vector3D pos);

    /**
     * Sets the Location of the Player, and then sets the Z-Position to the nearest Ground.
     * @param loc Location
     */
	void setLocationFindZ(Location loc);

    /**
     * Sets the Location of the Player, and then sets the Z-Position to the nearest Ground.
     * @param loc AngledLocation
     */
	void setLocationFindZ(AngledLocation loc);

    /**
     * Sets the Angle of the Player.
     * @param angle Angle in degress
     */
	void setAngle(float angle);

    /**
     * Sets the interior of the Player.
     * @param interiorId New Interiorid
     */
	void setInterior(int interiorId);

    /**
     * Sets the virtual World of the Player.
     * @param worldId New Virtual World
     */
	void setWorld(int worldId);

    /**
     * Sets the Worldboundries for the Player.
     * @param bound Boundries
     */
	void setWorldBound(Area bound);

    /**
     * Sets the velocity of the Player.
     * @param vel New Velocity
     */
	void setVelocity(Vector3D vel);

	/**
	 * Send a message to the Player with color white.
	 * @param message Text of the Message
	 */
	void sendMessage(String message);

    /**
     * Send a Message to the Player.
     * @param color Color of the Message
     * @param message Text of the Message
     */
	void sendMessage(Color color, String message);

    /**
     * Sends a formated Message to the Player.
     * @param color Color of the Message
     * @param format Formated Text of the Message
     * @param args Arguments
     */
	void sendMessage(Color color, String format, Object... args);

    /**
     * Sends a message into the Chat of a Player.
     * @param player Receiver
     * @param message Text of the Message
     */
	void sendChat(Player player, String message);

    /**
     * Sends a Message into the Chat of all Players.
     * @param message Text of the Message
     */
	void sendChatToAll(String message);

	void sendDeathMessage(Player killer, Player victim, WeaponModel weapon);

    /**
     * Sends a Gametext to the Player.
     * @param time Visible Time
     * @param style Gametext Style
     * @param text Text to display
     */
	void sendGameText(int time, int style, String text);

    /**
     * Send as formated Gametext to the Player.
     * @param time Visible Time
     * @param style Gametext Style
     * @param format Formated Text of the Message
     * @param args Arguments
     */
	void sendGameText(int time, int style, String format, Object... args);

    /**
     * Spawns the Player, when the SpawnInfo is set.
     */
	void spawn();

    /**
     * Sets the Drunklevel of the Player.
     * @param level New Drunklevel
     */
	void setDrunkLevel(int level);

    /**
     * Gets the Drunklevel of the Player.
     * @return Players Drunklevel
     */
	int getDrunkLevel();

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
	void applyAnimation(String animlib, String animname, float delta, int loop, int lockX, int lockY, int freeze, int time, int forcesync);

    /**
     * Clears all animations.
     * @param forcesync Sync Animation with all Player
     */
	void clearAnimations(int forcesync);

    /**
     * Gets the AnimationIndex of the current Animation.
     * @return AnimationIndex
     */
	int getAnimationIndex();

    /**
     * Plays a sound from the library at a specific position.
     * @param sound Soundid
     * @param x X-Position
     * @param y Y-Position
     * @param z Z-Position
     */
	void playSound(int sound, float x, float y, float z);

    /**
     * Plays a sound from the library at a specific position.
     * @param sound
     * @param pos
     */
	void playSound(int sound, Vector3D pos);


    /**
     * Plays a sound from the library.
     * @param sound
     */
	void playSound(int sound);

    /**
     * Sets the Color of the Players Marker for a specific other Player.
     * @param player Player to change Map Color
     * @param color New Color
     */
	void markerForPlayer(Player player, Color color);

    /**
     * Sets if Players Nametag can be seen for an other player.
     * @param player Other Player
     * @param show Show
     */
	void showNameTagForPlayer(Player player, boolean show);

    /**
     * Kicks the player, and closes the connection.
     */
	void kick();

    /**
     * Bans the player, and closes the connection.
     */
	void ban();

    /**
     * Bans the player with a reasion, and closes the connection.
     * @param reason
     */
	void ban(String reason);

    /**
     * Gets the currently opened Menu.
     * @return Opened Menu
     */
	Menu getCurrentMenu();

    /**
     * Sets the Camera to a specific position.
     * @param x X-Position
     * @param y Y-Position
     * @param z Z-Position
     */
	void setCameraPosition(float x, float y, float z);

    /**
     * Sets the Camera to a specific position.
     * @param pos Camera Position
     */
	void setCameraPosition(Vector3D pos);

    /**
     * Sets the Position where the Camera looks at.
     * @param x X-Position
     * @param y Y-Position
     * @param z Z-Position
     * @param cut CutStyle
     */
	void setCameraLookAt(float x, float y, float z, CameraCutStyle cut);

    /**
     * Sets the Position where the Camera looks at.
     * @param lookAt Vector3D-Positoon
     * @param cut CutStyle
     */
	void setCameraLookAt(Vector3D lookAt, CameraCutStyle cut);

    /**
     * Sets the Position where the Camera looks at.
     * @param x X-Position
     * @param y Y-Position
     * @param z Z-Position
     */
	void setCameraLookAt(float x, float y, float z);

    /**
     * Sets the Position where the Camera looks at.
     * @param lookAt Vector3D-Position
     */
	void setCameraLookAt(Vector3D lookAt);

    /**
     * Sets the Camera behind the Player.
     */
	void setCameraBehind();

    /**
     * Gets the Camera Position of the Player.
     * @return Camera Position
     */
	Vector3D getCameraPosition();

    /**
     * Gets the Front Vector of the Camera
     * @return Front Vector
     */
	Vector3D getCameraFrontVector();

    /**
     * Checks if Player is in any Vehicle.
     * @return boolean(state)
     */
	boolean isInAnyVehicle();

    /**
     * Checks if Player is in a specific Vehicle
     * @param veh Specific Vehicle
     * @return boolean(Yes Or No)
     */
	boolean isInVehicle(Vehicle veh);

    /**
     * Checks if Player is logged in as Rcon Admin
     * @return boolean(Yes or No)
     */
	boolean isAdmin();

    /**
     * Checks if Player is streamed in for a specific other Player.
     * @param forPlayer Specific Other Player
     * @return boolean(Yes or No)
     */
	boolean isStreamedIn(Player forPlayer);

    /**
     * Checks if the Player is a Npc.
     * @return boolean(Yes or No)
     */
	boolean isNpc();

    /**
     * Sets a Checkpoint for the Player.
     * @param checkpoint Checkpoint
     */
	void setCheckpoint(Checkpoint checkpoint);

    /**
     * Disables the Checkpoint
     */
	void disableCheckpoint();

    /**
     * Sets the Racecheckpoint
     * @param checkpoint Racecheckpoint
     */
	void setRaceCheckpoint(RaceCheckpoint checkpoint);

    /**
     * Disables the Race Checkpoint
     */
	void disableRaceCheckpoint();

    /**
     * Sets the Players Team by Id.
     * @param team The Id of the Team
     */
	void setTeam(int team);

    /**
     * Sets the Players Skin.
     * @param skin The SkinId
     */
	void setSkin(int skin);

    /**
     * Gets the current WeaponState.
     * @return The WeaponState
     */
	WeaponState getWeaponState();

    /**
     * Gets WeaponData by Slotid.
     * @param slot Slotid
     * @return The WeaponData
     */
	WeaponData getWeaponData(int slot);

    /**
     * Gives the Player a Weapon.
     * @param type Weapontype
     * @param ammo Ammount of Ammo
     */
	void giveWeapon(WeaponModel type, int ammo);

    /**
     * Gives the Player a Weapon.
     * @param data Weapondata
     */
	void giveWeapon(WeaponData data);

    /**
     * Delete all Weapons.
     */
	void resetWeapons();

    /**
     * Gets the Playertime.
     * @return Time
     */
	Time getTime();

    /**
     * Sets the Playertime.
     * @param hour hour
     * @param minute minute
     */
	void setTime(int hour, int minute);

    /**
     * Sets the Playertime.
     * @param time time
     */
	void setTime(Time time);

    /**
     * Toggles Clock
     * @param toggle enabled
     */
	void toggleClock(boolean toggle);

    /**
     * Forces Player to reselect his character.
     */
	void forceClassSelection();

    /**
     * Sets the Wantedlevel of the Player
     * @param level New Wantedlevel
     */
	void setWantedLevel(int level);

    /**
     * Plays a crime report for the Player.
     * @param suspectId The suspected Player
     * @param crimeId The Crimeid
     */
	void playCrimeReport(int suspectId, int crimeId);

    /**
     * Sets the Shopname for the Player.
     * @param shop Shopname
     */
	void setShopName(ShopName shop);

    /**
     * Gets the current Surfing Vehicle. If there is none, it will return null.
     * @return Surfing Vehicle.
     */
	Vehicle getSurfingVehicle();

    /**
     * Removes the Player from the Current Vehicle
     */
	void removeFromVehicle();

    /**
     * Sets the Controllability of the Player.
     * @param toggle controllable
     */
	void toggleControllable(boolean toggle);

    /**
     * Sets the special Action of the Player
     * @param action Special Action
     */
	void setSpecialAction(SpecialAction action);

    /**
     * Gets the Map Icon
     * @return Players Map Icon
     */
	PlayerMapIcon getMapIcon();

    /**
     * Toggles the Stuntbonus
     * @param enabled toggle
     */
	void enableStuntBonus(boolean enabled);

    /**
     * Toggles the Spectating Mode
     * @param toggle toggle
     */
	void toggleSpectating(boolean toggle);

    /**
     * Sets the spectating Player.
     * @param player Player to spectate
     * @param mode Spectatemode
     */
	void spectate(Player player, SpectateMode mode);

    /**
     * Sets the spectating Vehicle
     * @param veh Vehicle to spectate
     * @param mode Spectatemode
     */
	void spectate(Vehicle veh, SpectateMode mode);

    /**
     * Starts the recording.
     * @param type Recordingtype
     * @param recordName Filename
     */
	void startRecord(RecordType type, String recordName);

    /**
     * Stops the recording
     */
	void stopRecord();

    /**
     * Gets the Object under the Player, when he is surfing.
     * @return Surfing SampObject
     */
	SampObject getSurfingObject();

    /**
     * Gets the Networkstats.
     * @return Networkstats
     */
	String getNetworkStats();

    /**
     * Gets the aimed Target.
     * @return Aimed Player
     */
	Player getAimedTarget();

    /**
     * Starts an audio stream for the Player
     * @param url Streamurl
     */
	void playAudioStream(String url);

    /**
     * Starts an audio stream at a location.
     * @param url Streamurl
     * @param x X-Position
     * @param y Y-Position
     * @param z Z-Position
     * @param distance Range, until it can be heard.
     */
	void playAudioStream(String url, float x, float y, float z, float distance);

    /**
     * Starts an audio stream at a location
     * @param url Streamurl
     * @param location Streamlocation
     * @param distance Range, until it can be heard.
     */
	void playAudioStream(String url, Vector3D location, float distance);

    /**
     * Starts an audio stream at a location
     * @param url Streamurl
     * @param loc Location
     */
	void playAudioStream(String url, Radius loc);

    /**
     * Stops the audio Stream.
     */
	void stopAudioStream();

    /**
     * Removes a building for the Player
     * @param modelId Objectmodelid
     * @param x X-Position
     * @param y Y-Position
     * @param z Z-Position
     * @param radius Radius
     */
	void removeBuilding(int modelId, float x, float y, float z, float radius);

	Vector3D getLastShotOrigin();

	Vector3D getLastShotHitPosition();

    /**
     * Removes a building for the Player
     * @param modelId Objectmodelid
     * @param pos Position
     * @param radius Radius
     */
	void removeBuilding(int modelId, Vector3D pos, float radius);

    /**
     * Removes a buidling for the Player
     * @param modelId Objectmodelid
     * @param loc Range
     */
	void removeBuilding(int modelId, Radius loc);

    /**
     * Shows a dialog for the Player
     * @param dialog The Dialogid
     * @param style The Dialogstyle
     * @param caption The Dialogcaption
     * @param text Text to display
     * @param button1 Button 1 Text
     * @param button2 Button 2 Text
     */
	void showDialog(DialogId dialog, DialogStyle style, String caption, String text, String button1, String button2);

    /**
     * Cancels the current Dialog.
     */
	void cancelDialog();

    /**
     * Starts editing an SampObject.
     * @param object Object to edit
     * @return boolean(Success or failed)
     */
	boolean editObject(SampObject object);

    /**
     * Starts editing an PlayerObject
     * @param object PlayerObject to edit
     * @return boolean(Success or failed)
     */
	boolean editPlayerObject(PlayerObject object);

    /**
     * Starts the selecting Mode.
     */
	void selectObject();

    /**
     * Cancels the editing modus.
     */
	void cancelEdit();

    /**
     * Attaches the Camera to a object.
     * @param object Object
     */
	void attachCameraTo(SampObject object);

    /**
     * Attaches the Camera to a PlayerObject
     * @param object PlayerObject
     */
	void attachCameraTo(PlayerObject object);

    /**
     * Does smooth camera movement from one point, to another
     * @param fromX Start X-Position
     * @param fromY Start Y-Position
     * @param fromZ Start Z-Positon
     * @param toX End X-Position
     * @param toY End Y-Position
     * @param toZ End Z-Position
     * @param time How long it will need
     * @param cut Camera Cut
     */
	void interpolateCameraPosition(float fromX, float fromY, float fromZ, float toX, float toY, float toZ, int time, CameraCutStyle cut);

    /**
     * Does smooth camera movement from one point, to another
     * @param from Start Position
     * @param to End Position
     * @param time How long it will need
     * @param cut Camera Cut
     */
	void interpolateCameraPosition(Vector3D from, Vector3D to, int time, CameraCutStyle cut);

    /**
     * Does smooth Camera Lookat Movement from one point, to another.
     * @param fromX Start X-Position
     * @param fromY Start Y-Position
     * @param fromZ Start Z-Positon
     * @param toX End X-Position
     * @param toY End Y-Position
     * @param toZ End Z-Position
     * @param time How long it will need
     * @param cut Camera Cut
     */
	void interpolateCameraLookAt(float fromX, float fromY, float fromZ, float toX, float toY, float toZ, int time, CameraCutStyle cut);

    /**
     * Does smooth Camera Lookat Movement from one point, to another.
     * @param from Start Position
     * @param to End Position
     * @param time How long it will need
     * @param cut Camera Cut
     */
	void interpolateCameraLookAt(Vector3D from, Vector3D to, int time, CameraCutStyle cut);

    /**
     * Starts the textdraw Selection.
     * @param hoverColor Color of textdraw, when player hovers over it.
     */
	void selectTextDraw(Color hoverColor);

    /**
     * Cancels the Textdraw selection.
     */
	void cancelSelectTextDraw();

	void createExplosion(float x, float y, float z, int type, float radius);

	default void createExplosion(Vector3D pos, int type, float radius)
	{
		createExplosion(pos.x, pos.y, pos.z, type, radius);
	}

	default void createExplosion(Radius pos, int type)
	{
		createExplosion(pos.x, pos.y, pos.z, type, pos.radius);
	}

    /**
     * Gets the version of the Players Client.
     * @return SAMP-Client Version
     */
	String getVersion();

    /**
     * Gets the zone name where the player is located in. e.g. Las Venturas
     *
     * @return The zone name
     */
    LocationZone getMainZoneName();

    /**
     * Gets the detailed zone name. e.g. The Strip
     *
     * @return The detailed zone name
     */
    LocationZone getZoneName();

	int getConnectedTime();
	int getMessagesReceived();
	int getBytesReceived();
	int getMessagesSent();
	int getBytesSent();
	int getMessagesRecvPerSecond();
	float getPacketLossPercent();
	int getConnectionStatus();
	String getIpPort();

	void setChatBubble(String text, Color color, float drawDistance, int expireTime);

	void setVarInt(String name, int value);
	int getVarInt(String name);
	void setVarString(String name, String value);
	String getVarString(String name);
	void setVarFloat(String name, float value);
	float getVarFloat(String name);
	boolean deleteVar(String name);

	List<String> getVarNames();
	PlayerVarType getVarType(String name);

	/**
	 * Sets if the vehicle collision should be disabled
	 * @param disable If the collision should be disabled
	 */
	void disableRemoteVehicleCollisions(boolean disable);

	/**
	 * Sets if the CameraTarget-Function should be enabled (extra bandwith)
	 * @param enable If the function should be enabled
	 */
	void enablePlayerCameraTarget(boolean enable);

	/**
	 * Returns the player's targeted actor (null if none)
	 * You need to call enablePlayerCameraTarget() to use this function
	 * @return Target actor
	 */
	Actor getCameraTargetActor();

	/**
	 * Returns the player's targeted object (null if none)
	 * You need to call enablePlayerCameraTarget() to use this function
	 * @return Target object
	 */
	SampObject getCameraTargetObject();

	/**
	 * Returns the player's targeted player (null if none)
	 * You need to call enablePlayerCameraTarget() to use this function
	 * @return Target player
	 */
	Player getCameraTargetPlayer();

	/**
	 * Returns the player's targeted vehicle (null if none)
	 * You need to call enablePlayerCameraTarget() to use this function
	 * @return Target vehicle
	 */
	Vehicle getCameraTargetVehicle();

	/**
	 * Returns the player's targeted actor (with weapon, null if none)
	 * @return Targeted actor (with weapon, not with camera)
	 */
	Actor getTargetActor();
}

/**
 * Copyright (C) 2011-2012 MK124
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

import net.gtaun.shoebill.constant.CameraCutStyle;
import net.gtaun.shoebill.constant.DialogStyle;
import net.gtaun.shoebill.constant.FightStyle;
import net.gtaun.shoebill.constant.MapIconStyle;
import net.gtaun.shoebill.constant.PlayerState;
import net.gtaun.shoebill.constant.RecordType;
import net.gtaun.shoebill.constant.ShopName;
import net.gtaun.shoebill.constant.SpecialAction;
import net.gtaun.shoebill.constant.SpectateMode;
import net.gtaun.shoebill.constant.WeaponState;
import net.gtaun.shoebill.constant.WeaponType;
import net.gtaun.shoebill.data.Area;
import net.gtaun.shoebill.data.Color;
import net.gtaun.shoebill.data.Location;
import net.gtaun.shoebill.data.AngledLocation;
import net.gtaun.shoebill.data.Radius;
import net.gtaun.shoebill.data.SpawnInfo;
import net.gtaun.shoebill.data.Time;
import net.gtaun.shoebill.data.Vector3D;
import net.gtaun.shoebill.data.Velocity;
import net.gtaun.shoebill.data.WeaponData;
import net.gtaun.shoebill.exception.AlreadyExistException;
import net.gtaun.shoebill.exception.IllegalLengthException;
import net.gtaun.shoebill.proxy.Proxyable;

/**
 * 
 * 
 * @author MK124
 */
public interface Player extends Proxyable
{
	public static final int INVALID_ID =				0xFFFF;
	public static final int NO_TEAM =					255;
	public static final int MAX_NAME_LENGTH =			24;
	
	public static final int MAX_CHATBUBBLE_LENGTH =		144;
	
	
	boolean isOnline();
	
	int getId();

	PlayerKeyState getKeyState();
	PlayerAttach getAttach();
	PlayerWeaponSkill getWeaponSkill();
	
	int getPing();
	int getTeam();
	int getSkin();
	int getWantedLevel();
	int getCodepage();
	String getIp();
	String getName();
	Color getColor();

	int getUpdateFrameCount();
	float getHealth();
	float getArmour();
	WeaponType getArmedWeapon();
	int getArmedWeaponAmmo();
	int getMoney();
	int getScore();
	int getWeather();
	int getCameraMode();
	FightStyle getFightStyle();
	Vehicle getVehicle();
	int getVehicleSeat();
	SpecialAction getSpecialAction();
	Player getSpectatingPlayer();
	Vehicle getSpectatingVehicle();
	
	AngledLocation getLocation();
	Area getWorldBound();
	Velocity getVelocity();
	PlayerState getState();
	Checkpoint getCheckpoint();
	RaceCheckpoint getRaceCheckpoint();
	
	Dialog getDialog();
	
	boolean isStuntBonusEnabled();
	boolean isSpectating();
	boolean isRecording();
	boolean isControllable();
	
	void setCodepage(int codepage);
	void setName(String name) throws IllegalArgumentException, IllegalLengthException, AlreadyExistException;

	void setSpawnInfo(float x, float y, float z, int interiorId, int worldId, float angle, int skinId, int teamId, WeaponType weapon1, int ammo1, WeaponType weapon2, int ammo2, WeaponType weapon3, int ammo3);
	void setSpawnInfo(Vector3D pos, int interiorId, int worldId, float angle, int skinId, int teamId, WeaponData weapon1, WeaponData weapon2, WeaponData weapon3);
	void setSpawnInfo(Location loc, float angle, int skinId, int teamId, WeaponData weapon1, WeaponData weapon2, WeaponData weapon3);
	void setSpawnInfo(AngledLocation loc, int skin, int team, WeaponData weapon1, WeaponData weapon2, WeaponData weapon3);
	void setSpawnInfo(SpawnInfo info);
	
	void setColor(Color color);
	void setHealth(float health);
	void setArmour(float armour);
	void setWeaponAmmo(WeaponType weapon, int ammo);
	void setMoney(int money);
	void giveMoney(int money);
	void setScore(int score);
	void setWeather(int weatherId);
	void setFightStyle(FightStyle style);
	
	void setVehicle(Vehicle vehicle, int seat);
	void setVehicle(Vehicle vehicle);
	
	void setLocation(float x, float y, float z);
	void setLocation(Vector3D pos);
	void setLocation(Location loc);
	void setLocation(AngledLocation loc);

	void setLocationFindZ(float x, float y, float z);
	void setLocationFindZ(Vector3D pos);
	void setLocationFindZ(Location loc);
	void setLocationFindZ(AngledLocation loc);
	
	void setAngle(float angle);
	void setInterior(int interiorId);
	void setWorld(int worldId);
	void setWorldBound(Area bound);
	void setVelocity(Vector3D vel);
	
	void sendMessage(Color color, String message);
	void sendMessage(Color color, String format, Object... args);
	
	void sendChat(Player player, String message);
	void sendChatToAll(String message);
	void sendDeathMessage(Player killer, int reason);
	
	void sendGameText(int time, int style, String text);
	void sendGameText(int time, int style, String format, Object... args);
	
	void spawn();
	void setDrunkLevel(int level);
	int getDrunkLevel();
	
	void applyAnimation(String animlib, String animname, float delta, int loop, int lockX, int lockY, int freeze, int time, int forcesync);
	void clearAnimations(int forcesync);
	int getAnimationIndex();
	
	void playSound(int sound, float x, float y, float z);
	void playSound(int sound, Vector3D pos);
	
	void markerForPlayer(Player player, Color color);
	void showNameTagForPlayer(Player player, boolean show);
	
	void kick();
	void ban();
	void ban(String reason);
	
	Menu getCurrentMenu();
	
	void setCameraPosition(float x, float y, float z);
	void setCameraPosition(Vector3D pos);

	void setCameraLookAt(float x, float y, float z, CameraCutStyle cut);
	void setCameraLookAt(Vector3D lookAt, CameraCutStyle cut);
	void setCameraLookAt(float x, float y, float z);
	void setCameraLookAt(Vector3D lookAt);
	
	void setCameraBehind();
	Vector3D getCameraPosition();
	Vector3D getCameraFrontVector();
	
	boolean isInAnyVehicle();
	boolean isInVehicle(Vehicle veh);
	boolean isAdmin();
	boolean isStreamedIn(Player forPlayer);
	
	boolean isNpc();
	
	void setCheckpoint(Checkpoint checkpoint);
	void disableCheckpoint();
	void setRaceCheckpoint(RaceCheckpoint checkpoint);
	void disableRaceCheckpoint();
	
	void setTeam(int team);
	void setSkin(int skin);

	WeaponState getWeaponState();
	WeaponData getWeaponData(int slot);
	
	void giveWeapon(WeaponType type, int ammo);
	void giveWeapon(WeaponData data);
	
	void resetWeapons();
	
	Time getTime();
	
	void setTime(int hour, int minute);
	void setTime(Time time);
	
	void toggleClock(boolean toggle);
	void forceClassSelection();
	void setWantedLevel(int level);
	void playCrimeReport(int suspectId, int crimeId);
	void setShopName(ShopName shop);
	
	Vehicle getSurfingVehicle();
	void removeFromVehicle();
	
	void toggleControllable(boolean toggle);
	void setSpecialAction(SpecialAction action);

	void setMapIcon(int iconId, float x, float y, float z, int markerType, Color color, MapIconStyle style);
	void setMapIcon(int iconId, Vector3D pos, int markerType, Color color, MapIconStyle style);
	
	void removeMapIcon(int iconId);
	void enableStuntBonus(boolean enabled);
	
	void toggleSpectating(boolean toggle);
	void spectate(Player player, SpectateMode mode);
	void spectate(Vehicle veh, SpectateMode mode);
	
	void startRecord(RecordType type, String recordName);
	void stopRecord();
	
	SampObject getSurfingObject();
	String getNetworkStats();
	
	Player getAimedTarget();
	
	void playAudioStream(String url);
	void playAudioStream(String url, float x, float y, float z, float distance);
	void playAudioStream(String url, Vector3D location, float distance);
	void playAudioStream(String url, Radius loc);
	void stopAudioStream();
	
	void removeBuilding(int modelId, float x, float y, float z, float radius);
	void removeBuilding(int modelId, Vector3D pos, float radius);
	void removeBuilding(int modelId, Radius loc);
	
	void showDialog(Dialog dialog, DialogStyle style, String caption, String text, String button1, String button2);
	void cancelDialog();
	
	boolean editObject(SampObject object);
	boolean editPlayerObject(PlayerObject object);
	void selectObject();
	void cancelEdit();
	
	void attachCameraTo(SampObject object);
	void attachCameraTo(PlayerObject object);
	void interpolateCameraPosition(float fromX, float fromY, float fromZ, float toX, float toY, float toZ, int time, CameraCutStyle cut);
	void interpolateCameraPosition(Vector3D from, Vector3D to, int time, CameraCutStyle cut);
	void interpolateCameraLookAt(float fromX, float fromY, float fromZ, float toX, float toY, float toZ, int time, CameraCutStyle cut);
	void interpolateCameraLookAt(Vector3D from, Vector3D to, int time, CameraCutStyle cut);
	
	void selectTextDraw(Color hoverColor);
	void cancelSelectTextDraw();
	
	String getVersion(int playerid);
}

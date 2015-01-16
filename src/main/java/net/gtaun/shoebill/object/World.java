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
import net.gtaun.shoebill.constant.PlayerMarkerMode;
import net.gtaun.shoebill.constant.WeaponModel;
import net.gtaun.shoebill.data.*;

/**
 * 
 * 
 * @author MK124
 */
public interface World extends Proxyable<World>
{
	public static World get()
	{
		return SampObjectManager.get().getWorld();
	}
	
	
	void setTeamCount(int count);
	
	int addPlayerClass(int modelId, float x, float y, float z, float angle, int weapon1, int ammo1, int weapon2, int ammo2, int weapon3, int ammo3);
	int addPlayerClass(int teamId, int modelId, float x, float y, float z, float angle, int weapon1, int ammo1, int weapon2, int ammo2, int weapon3, int ammo3);
	int addPlayerClass(int modelId, Vector3D position, float angle, WeaponModel weapon1, int ammo1, WeaponModel weapon2, int ammo2, WeaponModel weapon3, int ammo3);
	int addPlayerClass(int teamId, int modelId, Vector3D position, float angle, WeaponModel weapon1, int ammo1, WeaponModel weapon2, int ammo2, WeaponModel weapon3, int ammo3);
	int addPlayerClass(int modelId, Vector3D position, float angle, WeaponData weapon1, WeaponData weapon2, WeaponData weapon3);
	int addPlayerClass(int teamId, int modelId, Vector3D position, float angle, WeaponData weapon1, WeaponData weapon2, WeaponData weapon3);
	int addPlayerClass(SpawnInfo spawnInfo);

	float getChatRadius();
	void setChatRadius(float radius);
	
	float getPlayerMarkerRadius();
	void setPlayerMarkerRadius(float radius);

	int getWeather();
	void setWeather(int weatherId);

	float getGravity();
	void setGravity(float gravity);

	void setWorldTime(int hour);
	
	float getNameTagDrawDistance();
	void setNameTagDrawDistance(float distance);
	
	void showNameTags(boolean enabled);
	void showPlayerMarkers(PlayerMarkerMode mode);
	
	@Deprecated
	void enableTirePopping(boolean enabled);
	
	void enableVehicleFriendlyFire();

	@Deprecated
	void allowInteriorWeapons(boolean allow);
	
	void createExplosion(Location location, int type, float radius);
	
	@Deprecated
	void enableZoneNames(boolean enabled);
	
	void usePlayerPedAnims();

	void disableInteriorEnterExits();
	void disableNameTagLOS();
	
	// Global player methods
	void enableStuntBonusForAll(boolean enabled);

	// Global vehicle methods
	void manualEngineAndLights();
}

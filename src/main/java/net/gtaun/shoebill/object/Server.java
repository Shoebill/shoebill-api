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
import net.gtaun.shoebill.constant.VehicleModelInfoType;
import net.gtaun.shoebill.constant.WeaponModel;
import net.gtaun.shoebill.data.Color;
import net.gtaun.shoebill.data.Vector3D;

/**
 *
 *
 * @author MK124
 */
public interface Server extends Proxyable<Server>
{
	public static Server get()
	{
		return SampObjectManager.get().getServer();
	}


	int getServerCodepage();
	void setServerCodepage(int codepage);

	int getMaxPlayers();

	String getGamemodeText();
	void setGamemodeText(String text);

	void sendRconCommand(String command);
	void connectNPC(String name, String script);

	String getServerVarAsString(String varname);
	int getServerVarAsInt(String varname);
	boolean getServerVarAsBool(String varname);

	// Global player methods
	void sendMessageToAll(Color color, String message);
	void sendMessageToAll(Color color, String format, Object... args);

	void gameTextToAll(int time, int style, String text);
	void gameTextToAll(int time, int style, String format, Object... args);

    /**
     * Sends a Death Message to everyone.
     * @param killer Player who killed this player
     * @param reason Deathreason
     */
	void sendDeathMessageToAll(Player killer, Player victim, WeaponModel reason);

	Vector3D getVehicleModelInfo(int modelId, VehicleModelInfoType infotype);

	void blockIpAddress(String ipAddress, int timeMs);
	void unBlockIpAddress(String ipAddress);

	String getHostname();
	void setHostname(String name);

	String getMapname();
	void setMapname(String name);

	String getPassword();
	void setPassword(String password);
}

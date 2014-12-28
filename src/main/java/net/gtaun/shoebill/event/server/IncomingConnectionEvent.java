package net.gtaun.shoebill.event.server;

import net.gtaun.util.event.Event;

public class IncomingConnectionEvent extends Event
{
	private final int playerId;
	private final String ipAddress;
	private final int port;


	public IncomingConnectionEvent(int playerid, String ipAddress, int port)
	{
		this.playerId = playerid;
		this.ipAddress = ipAddress;
		this.port = port;
	}

	public int getPlayerId()
	{
		return playerId;
	}

	public String getIpAddress()
	{
		return ipAddress;
	}

	public int getPort()
	{
		return port;
	}
}

package net.gtaun.shoebill.constant;

public enum DisconnectReason
{
	TIME_OUT	(0),
	LEFT		(1),
	KICK		(2);
	
	
	public static DisconnectReason get(int value)
	{
		return values() [value];
	}

	private final int value;

	private DisconnectReason(int value)
	{
		this.value = value;
	}
	
	public int getValue()
	{
		return value;
	}
}

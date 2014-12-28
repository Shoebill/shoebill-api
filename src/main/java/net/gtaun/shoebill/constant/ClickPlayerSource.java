package net.gtaun.shoebill.constant;

public enum ClickPlayerSource
{
	SCOREBOARD(0);
	
	
	public static ClickPlayerSource get(int value)
	{
		return values() [value];
	}
	
	
	private final int value;
	
	
	private ClickPlayerSource(int value)
	{
		this.value = value;
	}
	
	public int getValue()
	{
		return value;
	}
}

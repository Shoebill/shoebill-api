package net.gtaun.shoebill.constant;

public enum BulletHitType
{
	NONE			(0),
	PLAYER			(1),
	VEHICLE			(2),
	OBJECT			(3),
	PLAYER_OBJECT	(4);
	
	
	public static BulletHitType get(int value)
	{
		return values() [value];
	}
	
	
	private final int value;
	
	
	private BulletHitType(int value)
	{
		this.value = value;
	}
	
	public int getValue()
	{
		return value;
	}
}

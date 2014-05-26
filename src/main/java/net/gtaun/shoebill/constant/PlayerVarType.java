package net.gtaun.shoebill.constant;

public enum PlayerVarType
{
	NONE(0),
	INT(1),
	STRING(2),
	FLOAT(3);


	public static PlayerVarType get(int value)
	{
		return values() [value];
	}


	private final int value;


	private PlayerVarType(int value)
	{
		this.value = value;
	}

	public int getValue()
	{
		return value;
	}
}

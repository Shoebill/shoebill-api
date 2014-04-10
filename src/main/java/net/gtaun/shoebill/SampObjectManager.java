package net.gtaun.shoebill;

public interface SampObjectManager extends SampObjectStore, SampObjectFactory
{
	public static SampObjectManager get()
	{
		return Shoebill.get().getSampObjectManager();
	}
}

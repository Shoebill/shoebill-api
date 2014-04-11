package net.gtaun.shoebill;

public interface SampObjectManager extends SampObjectStore, SampObjectFactory
{
    /**
     * Get the SampObjectManager.
     * @return SampObjectManger.
     */
	public static SampObjectManager get()
	{
		return Shoebill.get().getSampObjectManager();
	}
}

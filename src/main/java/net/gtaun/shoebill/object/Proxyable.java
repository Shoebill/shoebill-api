package net.gtaun.shoebill.object;

public interface Proxyable<T>
{
	@SuppressWarnings("unchecked")
	default T getPrimitive()
	{
		return (T) this;
	}
}

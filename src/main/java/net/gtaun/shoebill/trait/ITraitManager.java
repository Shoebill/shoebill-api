package net.gtaun.shoebill.trait;

public interface ITraitManager
{
	<T extends Trait> void registerTrait( Class<T> traitType, T trait ) throws IllegalArgumentException, UnsupportedOperationException;
	<T extends Trait> void removeTrait( Class<T> traitType ) throws UnsupportedOperationException;
	
	<T extends Trait> boolean checkTrait( Class<T> traitType );
	<T extends Trait> T getTrait( Class<T> traitType );
}

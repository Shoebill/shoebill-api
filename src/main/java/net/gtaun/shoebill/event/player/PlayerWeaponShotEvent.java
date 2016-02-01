package net.gtaun.shoebill.event.player;

import net.gtaun.shoebill.constant.BulletHitType;
import net.gtaun.shoebill.constant.WeaponModel;
import net.gtaun.shoebill.data.Vector3D;
import net.gtaun.shoebill.object.Player;
import net.gtaun.shoebill.object.PlayerObject;
import net.gtaun.shoebill.object.SampObject;
import net.gtaun.util.event.Interruptable;

/**
 * This event represents the OnPlayerWeaponShot of Pawn.
 * 
 * @author MK124
 * @see net.gtaun.shoebill.event.player.PlayerEvent
 * @see <a href="https://wiki.sa-mp.com/wiki/OnPlayerWeaponShot">OnPlayerWeaponShot</a>
 */
public class PlayerWeaponShotEvent extends PlayerEvent implements Interruptable
{
	private final WeaponModel weapon;
	private final BulletHitType hitType;
	private final int hitId;
	private final Vector3D position;
	
	private int response = 1;
	
	
	public PlayerWeaponShotEvent(Player player, int weaponId, int hitType, int hitId, Vector3D position)
	{
		super(player);
		this.weapon = WeaponModel.get(weaponId);
		this.hitType = BulletHitType.get(hitType);
		this.hitId = hitId;
		this.position = position;
	}
	
	/**
     * Returns the current response value
     * @return Current response value
     */
	public int getResponse()
	{
		return response;
	}
	
	/*
	 * (non-Javadoc)
	 * @see net.gtaun.util.event.Event#interrupt()
	 */
	@Override
	public void interrupt()
	{
		super.interrupt();
	}
	
	/**
     * Disallows the further execution of this event in the whole abstract machine (also Pawn and other Plugins).
     */
	public void disallow()
	{
		this.response &= 0;
	}
    
    /**
     * @return The associated used WeaponModel for this event.
     */
	public WeaponModel getWeapon()
	{
		return weapon;
	}
    
    /**
     * @return The associated BulletHitType for this event.
     */
	public BulletHitType getHitType()
	{
		return hitType;
	}
    
    /**
     * @return The associated hitted Player / victim for this event.
     */
	public Player getHitPlayer()
	{
		return Player.get(hitId);
	}
    
    /**
     * @return The associated hitted SampObject for this event.
     */
	public SampObject getHitObject()
	{
		return SampObject.get(hitId);
	}
    
    /**
     * @return The associated hitted PlayerObject for this event.
     */
	public PlayerObject getHitPlayerObject()
	{
		return PlayerObject.get(getPlayer(), hitId);
	}
    
    /**
     * @return The associated hitted position for this event.
     */
	public Vector3D getPosition()
	{
		return new Vector3D(position);
	}
}

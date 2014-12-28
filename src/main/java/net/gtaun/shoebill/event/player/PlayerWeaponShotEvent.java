package net.gtaun.shoebill.event.player;

import net.gtaun.shoebill.constant.BulletHitType;
import net.gtaun.shoebill.constant.WeaponModel;
import net.gtaun.shoebill.data.Vector3D;
import net.gtaun.shoebill.object.Player;
import net.gtaun.shoebill.object.PlayerObject;
import net.gtaun.shoebill.object.SampObject;
import net.gtaun.util.event.Interruptable;

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
	
	public int getResponse()
	{
		return response;
	}
	
	@Override
	public void interrupt()
	{
		super.interrupt();
	}

	public void disallow()
	{
		this.response &= 0;
	}
	
	public WeaponModel getWeapon()
	{
		return weapon;
	}
	
	public BulletHitType getHitType()
	{
		return hitType;
	}
	
	public Player getHitPlayer()
	{
		return Player.get(hitId);
	}
	
	public SampObject getHitObject()
	{
		return SampObject.get(hitId);
	}
	
	public PlayerObject getHitPlayerObject()
	{
		return PlayerObject.get(getPlayer(), hitId);
	}
	
	public Vector3D getPosition()
	{
		return new Vector3D(position);
	}
}

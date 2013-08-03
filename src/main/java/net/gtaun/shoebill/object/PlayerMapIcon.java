package net.gtaun.shoebill.object;

import java.util.List;

import net.gtaun.shoebill.constant.MapIconStyle;
import net.gtaun.shoebill.data.Color;
import net.gtaun.shoebill.data.Vector3D;

public interface PlayerMapIcon extends PlayerRelated
{
	public interface MapIcon extends Destroyable, PlayerRelated
	{
		int getId();

		void update(float x, float y, float z, int markerType, Color color, MapIconStyle style);
		void update(Vector3D pos, int markerType, Color color, MapIconStyle style);
	}
	
	
	MapIcon createIcon(float x, float y, float z, int markerType, Color color, MapIconStyle style);
	MapIcon createIcon(Vector3D pos, int markerType, Color color, MapIconStyle style);
	MapIcon createIcon();
}

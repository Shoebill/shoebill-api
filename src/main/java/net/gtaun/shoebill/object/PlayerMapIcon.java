package net.gtaun.shoebill.object;

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
	
	MapIcon getIcon(int iconid);
	void setIcon(int iconid, MapIcon icon);
	MapIcon createIcon(float x, float y, float z, int markerType, Color color, MapIconStyle style);
	MapIcon createIcon(Vector3D pos, int markerType, Color color, MapIconStyle style);
	MapIcon createIcon(float x, float y, float z, int markerType, Color color, MapIconStyle style, int iconId);
	MapIcon createIcon(Vector3D pos, int markerType, Color color, MapIconStyle style, int iconId);
	MapIcon createIcon(int iconId);
	MapIcon createIcon();
}

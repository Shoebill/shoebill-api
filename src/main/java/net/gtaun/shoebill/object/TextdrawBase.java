/**
 * Copyright (C) 2012 MK124
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.gtaun.shoebill.object;

import net.gtaun.shoebill.constant.TextDrawAlign;
import net.gtaun.shoebill.constant.TextDrawFont;
import net.gtaun.shoebill.data.Color;
import net.gtaun.shoebill.data.Vector2D;

/**
 * 
 * 
 * @author MK124
 */
public interface TextdrawBase extends Destroyable, Proxyable<TextdrawBase>
{
	public static final int INVALID_ID =		0xFFFF;
	
	
	int getId();
	Vector2D getPosition();
	String getText();
	
	void setLetterSize(float x, float y);
	void setLetterSize(Vector2D vec);
	
	void setTextSize(float x, float y);
	void setTextSize(Vector2D vec);
	
	void setAlignment(TextDrawAlign alignment);
	void setColor(Color color);
	void setUseBox(boolean use);
	void setBoxColor(Color color);
	void setShadowSize(int size);
	void setOutlineSize(int size);
	void setBackgroundColor(Color color);
	void setFont(TextDrawFont font);
	void setProportional(boolean set);
	void setSelectable(boolean set);
	void setText(String text);
	void setPreviewModel(int modelindex);
	void setPreviewModelRotation(float rotX, float rotY, float rotZ);
	void setPreviewModelRotation(float rotX, float rotY, float rotZ, float zoom);
	void setPreviewVehicleColor(int color1, int color2);
}

/**
 * Copyright (C) 2011 MK124
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

import net.gtaun.shoebill.data.Color;
import net.gtaun.shoebill.data.Vector2D;

/**
 * 
 * 
 * @author MK124
 */
public interface Textdraw extends Destroyable, Proxyable
{
	public static final int INVALID_ID =		0xFFFF;
	
	
	int getId();
	Vector2D getPosition();
	String getText();

	void setLetterSize( float x, float y );
	void setLetterSize( Vector2D vec );
	
	void setTextSize( float x, float y );
	void setTextSize( Vector2D vec );
	
	void setAlignment( int alignment );
	void setColor( Color color );
	void setUseBox( boolean use );
	void setBoxColor( Color color );
	void setShadow( int size );
	void setOutline( int size );
	void setBackgroundColor( Color color );
	void setFont( int font );
	void setProportional( int set );
	void setText( String text );
	void show( Player player );
	void hide( Player player );
	void showForAll();
	void hideForAll();
}

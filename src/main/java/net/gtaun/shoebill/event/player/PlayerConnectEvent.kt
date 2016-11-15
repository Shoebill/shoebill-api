/**
 * Copyright (C) 2011 MK124

 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at

 * http://www.apache.org/licenses/LICENSE-2.0

 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.gtaun.shoebill.event.player

<<<<<<< HEAD:src/main/java/net/gtaun/shoebill/event/player/PlayerConnectEvent.kt
import net.gtaun.shoebill.entities.Player
=======
import net.gtaun.shoebill.object.Player;
import net.gtaun.util.event.Interruptable;
>>>>>>> e6c54ebac8ae868f77c36501ecdff87fd6a68c04:src/main/java/net/gtaun/shoebill/event/player/PlayerConnectEvent.java

/**
 * This event represents the OnPlayerConnect of Pawn.
 *
 * @author MK124
 * @author Marvin Haschker
 * @see [OnPlayerConnect](https://wiki.sa-mp.com/wiki/OnPlayerConnect)
 */
<<<<<<< HEAD:src/main/java/net/gtaun/shoebill/event/player/PlayerConnectEvent.kt
class PlayerConnectEvent(player: Player) : PlayerEvent(player) {

    /**
=======
public class PlayerConnectEvent extends PlayerEvent implements Interruptable
{

	private int ret = 1;

	public PlayerConnectEvent(Player player)
	{
		super(player);
	}
	
	/**
     * Disallows the further execution of this event in the whole abstract machine (also Pawn and other Plugins).
     */
	public void disallow() {
		this.ret &= 0;
		interrupt();
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
>>>>>>> e6c54ebac8ae868f77c36501ecdff87fd6a68c04:src/main/java/net/gtaun/shoebill/event/player/PlayerConnectEvent.java
     * Returns the current response value
     * @return Current response value
     */
    var response = 1
        private set

    /**
     * Disallows the further execution of this event in the whole abstract machine (also Pawn and other Plugins).
     */
    fun disallow() {
        this.response = this.response and 0
        interrupt()
    }
}

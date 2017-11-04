package net.gtaun.shoebill.event.server

import net.gtaun.util.event.Event

/**
 * This event will be called when a new connection is getting established.
 *
 * @author MK124
 * @author Marvin Haschker
 */
class IncomingConnectionEvent(val playerId: Int, val ipAddress: String, val port: Int) : Event()
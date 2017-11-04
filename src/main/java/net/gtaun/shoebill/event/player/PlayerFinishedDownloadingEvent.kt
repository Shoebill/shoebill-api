package net.gtaun.shoebill.event.player

import net.gtaun.shoebill.entities.Player

open class PlayerFinishedDownloadingEvent(player: Player, val virtualWorld: Int) : PlayerEvent(player)
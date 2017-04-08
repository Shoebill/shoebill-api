package net.gtaun.shoebill.entities

import net.gtaun.shoebill.Shoebill
import net.gtaun.shoebill.event.destroyable.DestroyEvent
import net.gtaun.util.event.Attentions
import net.gtaun.util.event.EventHandler
import net.gtaun.util.event.HandlerPriority

/**
 * Created by marvin on 03.01.17 in project shoebill-api.
 * Copyright (c) 2017 Marvin Haschker. All rights reserved.
 */
abstract class Entity : Destroyable {
    protected val eventManagerNode = Shoebill.get().eventManager.createChildNode()
    protected val attention = Attentions.create().obj(this)

    @JvmOverloads
    fun onDestroy(handler: EventHandler<DestroyEvent>, priority: HandlerPriority = HandlerPriority.NORMAL) =
            eventManagerNode.registerHandler(DestroyEvent::class.java, handler, priority, attention)

    @JvmOverloads
    fun onDestroy(handler: (DestroyEvent) -> Unit, priority: HandlerPriority = HandlerPriority.NORMAL) =
            onDestroy(EventHandler { handler(it) }, priority)

    override fun destroy() = eventManagerNode.destroy()
}
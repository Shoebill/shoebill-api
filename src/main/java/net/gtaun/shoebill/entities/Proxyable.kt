package net.gtaun.shoebill.entities

@Suppress("UNCHECKED_CAST")
interface Proxyable<out T> {
    val primitive: T
        get() = this as T
}

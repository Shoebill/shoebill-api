package net.gtaun.shoebill.entities

@Suppress("UNCHECKED_CAST")
interface Proxyable<T> {
    val primitive: T
        get() = this as T
}

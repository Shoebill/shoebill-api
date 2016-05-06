package net.gtaun.shoebill.`object`

@Suppress("UNCHECKED_CAST")
interface Proxyable<T> {
    val primitive: T
        get() = this as T
}

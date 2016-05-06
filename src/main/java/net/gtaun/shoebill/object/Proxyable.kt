package net.gtaun.shoebill.`object`

interface Proxyable<T> {
    val primitive: T
        get() = this as T
}

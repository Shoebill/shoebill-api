package net.gtaun.shoebill.constant

interface Collectable<out T> {
    fun get(): Collection<T>
}
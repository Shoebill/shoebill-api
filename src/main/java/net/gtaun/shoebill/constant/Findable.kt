package net.gtaun.shoebill.constant

interface Findable<T, U> {
    fun get(value: T): U?
}
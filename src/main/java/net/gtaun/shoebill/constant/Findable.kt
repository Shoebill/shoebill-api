package net.gtaun.shoebill.constant

interface Findable<in T, out U> {
    fun get(value: T): U?
}
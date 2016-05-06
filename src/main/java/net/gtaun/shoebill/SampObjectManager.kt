package net.gtaun.shoebill

interface SampObjectManager : SampObjectStore, SampObjectFactory {
    companion object {
        /**
         * Gets the [SampObjectManager].
         */
        fun get(): SampObjectManager {
            return Shoebill.get()!!.sampObjectManager
        }
    }
}

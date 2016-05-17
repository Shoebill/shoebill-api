package net.gtaun.shoebill.event

/**
 * Created by marvin on 14.05.16 in project shoebill-api.
 * Copyright (c) 2016 Marvin Haschker. All rights reserved.
 */
interface Disallowable {

    var isDisallow: Boolean

    fun disallow() {
        this.isDisallow = true
    }
}
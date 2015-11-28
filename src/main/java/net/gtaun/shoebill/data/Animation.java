package net.gtaun.shoebill.data;

/**
 * Created by marvin on 15.02.15 in project shoebill-api.
 * Copyright (c) 2015 Marvin Haschker. All rights reserved.
 */
public class Animation {

    public Animation(String library, String name) {
        this.library = library;
        this.name = name;
    }

    private String library;
    private String name;

    public String getLibrary() {
        return library;
    }

    public String getName() {
        return name;
    }
}

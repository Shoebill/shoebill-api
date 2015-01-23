package net.gtaun.shoebill.amx;

/**
 * Created by marvin on 21.01.15 in project shoebill-api.
 * Copyright (c) 2015 Marvin Haschker. All rights reserved.
 */
public interface AmxHook {
    public boolean hook(String name, Object... args);
}

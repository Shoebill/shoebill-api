package net.gtaun.shoebill.constant;

// Created by marvin on 28.12.14 in project shoebill-api.
// Copyright (c) 2014 Marvin Haschker. All rights reserved.
public enum GameTextStyle {
    NORMALE_MIDDLE (0),
    NORMAL_BOTTOM_RIGHT (1),
    GHETTO_MIDDLE (2),
    THIN_MIDDLE (3),
    THIN_MIDDLE_TOP (4),
    WHITE_THIN_CENTER (5),
    THICK_TOP (6);

    public static GameTextStyle get(int value)
    {
        return values() [value];
    }

    private final int value;

    private GameTextStyle(int value)
    {
        this.value = value;
    }

    public int getValue()
    {
        return value;
    }
}

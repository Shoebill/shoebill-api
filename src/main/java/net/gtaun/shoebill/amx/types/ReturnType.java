package net.gtaun.shoebill.amx.types;

/**
 * Created by marvin on 15.01.16.
 * Copyright (c) 2015 Marvin Haschker. All rights reserved.
 */
public enum ReturnType {
    INTEGER(0),
    FLOAT(1),
    STRING(2);

    private final int value;
    private ReturnType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

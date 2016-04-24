package net.gtaun.shoebill.constant;

/**
 * Created by marvin on 24.04.16.
 * Copyright (c) Marvin Haschker 2016.
 */
public enum ServerVarType {
    NONE (0),
    INTEGER (1),
    STRING (2),
    FLOAT (3);

    private int value;

    ServerVarType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

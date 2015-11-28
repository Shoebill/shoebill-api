package net.gtaun.shoebill.amx.types;

/**
 * Created by marvin on 05.03.15 in project shoebill-api.
 * Copyright (c) 2015 Marvin Haschker. All rights reserved.
 */
public class ReferenceString {

    private String value;
    private int length;

    public ReferenceString(String value, int length) {
        this.value = value;
        this.length = length;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getLength() {
        return length;
    }
}

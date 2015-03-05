package net.gtaun.shoebill.amx.types;

/**
 * Created by marvin on 05.03.15 in project shoebill-api.
 * Copyright (c) 2015 Marvin Haschker. All rights reserved.
 */
public class ReferenceFloat {

    private float value;

    public ReferenceFloat(float value) {
        this.value = value;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }
}

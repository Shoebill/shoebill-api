package net.gtaun.shoebill.amx;

import net.gtaun.util.event.Event;

/**
 * Created by marvin on 24.01.15 in project shoebill-api.
 * Copyright (c) 2015 Marvin Haschker. All rights reserved.
 */
public class AmxCallEvent extends Event {

    private String functionName;
    private int returnValue = 1;
    private Object[] parameters;

    public AmxCallEvent(String functionName, Object... parameters) {
        super();
        this.functionName = functionName;
        this.parameters = parameters;
    }

    public String getFunctionName() {
        return functionName;
    }

    public Object[] getParameters() {
        return parameters;
    }

    public void setReturnValue(int returnValue) {
        this.returnValue = returnValue;
    }

    public int getReturnValue() {
        return returnValue;
    }
}

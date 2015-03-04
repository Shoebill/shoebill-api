package net.gtaun.shoebill.amx;

import java.util.function.Consumer;

/**
 * Created by marvin on 03.03.15 in project shoebill-api.
 * Copyright (c) 2015 Marvin Haschker. All rights reserved.
 */
public class AmxHook {

    private String name;
    private Consumer<AmxCallEvent> onCall;
    private String parameters;

    public AmxHook(String name, Consumer<AmxCallEvent> onCall, String parameters) {
        this.name = name;
        this.onCall = onCall;
        this.parameters = parameters;
    }

    public String getName() {
        return name;
    }

    public Consumer<AmxCallEvent> getOnCall() {
        return onCall;
    }

    public String getParameters() {
        return parameters;
    }
}

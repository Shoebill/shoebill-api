/**
 * Copyright (C) 2013 MK124
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.gtaun.shoebill.amx;

import java.util.function.Function;

/**
 * 
 * 
 * @author MK124
 */
public interface AmxInstance
{
    static AmxInstance getDefault() {
        AmxInstanceManager instanceManager = AmxInstanceManager.get();
        if(instanceManager != null)
            return instanceManager.getAmxInstances().stream().findFirst().orElse(null);
        else
            return null;
    }

    boolean registerFunction(String name, Function<Object[], Integer> callback, Class... parameterTypes);
    boolean unregisterFunction(String name);
    boolean hasRegisteredFunction(String name);
    int callRegisteredFunction(String name, Object... parameters);
    AmxCallable getPublic(String name);
    AmxCallable getNative(String name);

	int getHandle();
}

/**
 * Copyright (C) 2012 MK124
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

package net.gtaun.shoebill.trait;

/**
 * @author MK124
 *
 */

public interface ITraitManager
{
	<T extends Trait> void registerTrait( Class<T> traitType, T trait ) throws IllegalArgumentException, UnsupportedOperationException;
	<T extends Trait> void removeTrait( Class<T> traitType ) throws UnsupportedOperationException;
	
	<T extends Trait> boolean checkTrait( Class<T> traitType );
	<T extends Trait> T getTrait( Class<T> traitType );
}

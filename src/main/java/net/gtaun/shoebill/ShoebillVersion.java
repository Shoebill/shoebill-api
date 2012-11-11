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

package net.gtaun.shoebill;

/**
 * Shoebill version information interface.
 * 
 * @author MK124
 */
public interface ShoebillVersion
{
	/**
	 * Get the name of the running library.
	 * 
	 * @return Name.
	 */
	String getName();
	
	/**
	 * Get the version information of the running library.
	 * 
	 * @return Version information.
	 */
	String getVersion();
	
	/**
	 * Get the supported SA-MP version of the running library.
	 * 
	 * @return Supported SA-MP version.
	 */
	String getSupport();
	
	/**
	 * Get the build number of the running library.
	 * 
	 * @return Build number.
	 */
	int getBuildNumber();
	
	/**
	 * Get the build date of the running library.
	 * 
	 * @return Build date.
	 */
	String getBuildDate();
}

/*
 * Copyright 2006 Marc Wick, geonames.org
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
 *
 */
package com.sun.syndication.feed.module.georss;

/**
 * GMLModuleImpl is the implementation of the {@link GeoRSSModule} Interface
 * for the gml GeoRSS format.
 * 
 * @author Marc Wick
 * @version $Id: GMLModuleImpl.java,v 1.1 2007/04/18 09:59:29 marcwick Exp $
 * 
 */
public class GMLModuleImpl extends GeoRSSModule {

	public GMLModuleImpl() {
		super(GeoRSSModule.class, GeoRSSModule.GEORSS_GML_URI);
	}

	
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sun.syndication.feed.CopyFrom#getInterface()
	 */
	public Class getInterface() {
		return GeoRSSModule.class;
	}
}

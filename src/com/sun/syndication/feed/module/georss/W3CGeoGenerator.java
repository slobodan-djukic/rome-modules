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

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.jdom.Element;

import com.sun.syndication.feed.module.Module;
import com.sun.syndication.io.ModuleGenerator;
import com.sun.syndication.feed.module.georss.geometries.*;

/**
 * W3CGeoGenerator produces georss elements in georss W3C geo format.
 * 
 * @author Marc Wick
 * @version $Id: W3CGeoGenerator.java,v 1.3 2007/04/18 09:59:30 marcwick Exp $
 * 
 */
public class W3CGeoGenerator implements ModuleGenerator {
    
    private static boolean isShort = true;

    private static final Set NAMESPACES;
    
    static {
        Set nss = new HashSet();
        nss.add(GeoRSSModule.W3CGEO_NS);
        NAMESPACES = Collections.unmodifiableSet(nss);
    }
    
    public static void enableDefaultPointElement(){
        isShort = false;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.sun.syndication.io.ModuleGenerator#getNamespaceUri()
     */
    public String getNamespaceUri() {
        return GeoRSSModule.GEORSS_W3CGEO_URI;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.sun.syndication.io.ModuleGenerator#getNamespaces()
     */
    public Set getNamespaces() {
        return NAMESPACES;
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.sun.syndication.io.ModuleGenerator#generate(com.sun.syndication.feed.module.Module,
     *      org.jdom.Element)
     */
    public void generate(Module module, Element element) {
        // this is not necessary, it is done to avoid the namespace definition
        // in every item.
        Element root = element;
        while (root.getParent() != null && root.getParent() instanceof Element) {
            root = (Element) element.getParent();
        }
        root.addNamespaceDeclaration(GeoRSSModule.W3CGEO_NS);

        Element pointElement = element;
        if (!isShort) {
            pointElement = new Element("Point", GeoRSSModule.W3CGEO_NS);
            element.addContent(pointElement);
        }

        GeoRSSModule geoRSSModule = (GeoRSSModule) module;
         AbstractGeometry geometry = geoRSSModule.getGeometry();
        
        if (geometry instanceof Point) {
            Position pos = ((Point)geometry).getPosition();
            
            Element latElement = new Element("lat", GeoRSSModule.W3CGEO_NS);
            latElement.addContent(String.valueOf(pos.getLatitude()));
            pointElement.addContent(latElement);
            Element lngElement = new Element("long", GeoRSSModule.W3CGEO_NS);
            lngElement.addContent(String.valueOf(pos.getLongitude()));
            pointElement.addContent(lngElement);
        }
        else {
             System.err.println("W3C Geo format can't handle geometries of type: " + geometry.getClass().getName());
        }
    }
}

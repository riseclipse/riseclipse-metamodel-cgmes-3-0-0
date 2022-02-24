/*
*************************************************************************
**  Copyright (c) 2016-2022 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
** 
**  This file is part of the RiseClipse tool
**  
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      https://riseclipse.github.io/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.util;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLResource;

import fr.centralesupelec.edf.riseclipse.cim.util.cimxml.AbstractCimXmlHandler;

public class CimXmlHandler extends AbstractCimXmlHandler {

    public CimXmlHandler( XMLResource xmiResource, XMLHelper helper, Map< ?, ? > options ) {
        super( CimConstants.CIM_URI, xmiResource, helper, options );
    }

    @Override
    protected EPackage getPackageForURI( String uriString ) {
//        if( CimConstants.EU_URI.equals( uriString )) {
//            return super.getPackageForURI( CimConstants.CIM_URI );
//        }
        return super.getPackageForURI( uriString );
    }

    // This method needs to test for the entsoe URI
    @Override
    protected boolean setEnumValue( EObject object, EStructuralFeature feature, String resource ) {
        if( resource.startsWith( CimConstants.CIM_URI_SHARP ) ) {
            int enumNameLength = feature.getEType().getName().length();
            // do not call fr.centralesupelec.riseclipse.cim.util.cimxml.CimXMLHandler.setFeatureValue to avoid infinite recursion
            // call instead org.eclipse.emf.ecore.xmi.impl.SAXXMLHandler.setFeatureValue
            // We use the fact that SAXXMLHandler.setFeatureValue( EObject, EStructuralFeature, Object ) call
            // SAXXMLHandler.setFeatureValue( EObject, EStructuralFeature, Object, -1 )
            super.setFeatureValue( object, feature,
                  resource.substring( CimConstants.CIM_URI_SHARP.length() + enumNameLength + 1 ), -1 );
            return true;
        }
        if( resource.startsWith( CimConstants.EU_URI_SHARP ) ) {
            int enumNameLength = feature.getEType().getName().length();
            // do not call fr.centralesupelec.riseclipse.cim.util.cimxml.CimXMLHandler.setFeatureValue to avoid infinite recursion
            // call instead org.eclipse.emf.ecore.xmi.impl.SAXXMLHandler.setFeatureValue
            // We use the fact that SAXXMLHandler.setFeatureValue( EObject, EStructuralFeature, Object ) call
            // SAXXMLHandler.setFeatureValue( EObject, EStructuralFeature, Object, -1 )
            super.setFeatureValue( object, feature,
                  resource.substring( CimConstants.EU_URI_SHARP.length() + enumNameLength + 1 ), -1 );
            return true;
        }
        return false;
    }

}

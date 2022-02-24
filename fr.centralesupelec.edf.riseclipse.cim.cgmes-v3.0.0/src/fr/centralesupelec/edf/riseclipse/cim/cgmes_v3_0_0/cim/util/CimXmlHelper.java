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

import org.eclipse.emf.ecore.EStructuralFeature;

import fr.centralesupelec.edf.riseclipse.cim.util.cimxml.AbstractCimXmlHelper;

public class CimXmlHelper extends AbstractCimXmlHelper {

    @Override
    public String getQName( EStructuralFeature feature ) {
        if( CimConstants.EU_URI.equals( extendedMetaData.getNamespace( feature ))) {
            return CimConstants.EU_PREFIX + ":" + extendedMetaData.getName( feature );
        }
        return super.getQName( feature );
    }

    public CimXmlHelper( CimResourceImpl cimResource ) {
        super( cimResource );
    }

    @Override
    public String getURI( String prefix ) {
        String uri = super.getURI( prefix );
        if( CimConstants.CIM_URI_SHARP.equals( uri )) return CimConstants.CIM_URI;
        if( CimConstants.EU_URI_SHARP.equals( uri )) return CimConstants.EU_URI;
        return uri;
    }

}

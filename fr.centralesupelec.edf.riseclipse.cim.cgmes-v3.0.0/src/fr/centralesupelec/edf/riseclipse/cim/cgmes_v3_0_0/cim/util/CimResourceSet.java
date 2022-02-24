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

import java.util.Optional;

import org.eclipse.emf.common.util.URI;

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.EuPackage;
import fr.centralesupelec.edf.riseclipse.cim.util.cimxml.AbstractCimResourceSet;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseResource;
import fr.centralesupelec.edf.riseclipse.util.RiseClipseMetamodel;


public class CimResourceSet extends AbstractCimResourceSet {

    public CimResourceSet( boolean strictContent ) {
        super( strictContent );
        
        resourceFactory = new CimResourceFactoryImpl();
    }

    @Override
    protected IRiseClipseResource createRiseClipseResource( URI uri, String contentType ) {
        Optional< String > metamodel = RiseClipseMetamodel.findMetamodelFor( uri );
        if( metamodel.isPresent() ) {
            if( CimPackage.eNS_URI.equals( metamodel.get() ) || EuPackage.eNS_URI.equals( metamodel.get() )) {
                return resourceFactory.createResource( uri );
            }
        }
        return null;
    }
}

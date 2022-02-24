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

import fr.centralesupelec.edf.riseclipse.cim.util.cimxml.AbstractCimResourceSetFactory;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseResourceSet;

public class CimResourceSetFactory extends AbstractCimResourceSetFactory {

    public CimResourceSetFactory() {
        super();
    }

    @Override
    public IRiseClipseResourceSet createResourceSet( boolean strictContent ) {
        return new CimResourceSet( strictContent );
    }
}

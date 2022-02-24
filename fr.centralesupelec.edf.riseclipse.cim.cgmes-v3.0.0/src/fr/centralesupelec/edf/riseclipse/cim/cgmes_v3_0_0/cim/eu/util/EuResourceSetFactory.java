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
package fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.util;

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.util.CimResourceSet;
import fr.centralesupelec.edf.riseclipse.cim.util.cimxml.AbstractCimResourceSetFactory;
import fr.centralesupelec.edf.riseclipse.util.IRiseClipseResourceSet;

public class EuResourceSetFactory extends AbstractCimResourceSetFactory {

    public EuResourceSetFactory() {
        super();
    }

    @Override
    public IRiseClipseResourceSet createResourceSet( boolean strictContent ) {
        // RiseClipse metamodels are said to be known if there is a resourceSet factory
        // (see RiseClipseMetamodel.isKnown(String))
        // When a metamodel is known, the adapterFactory is used to get a label
        // for an object (see for example NavigateToMenuBuilder.getContributionItems())
        // However, we don't need any specific resourceSet for the eu namespace, we will use the CIM one.
        return new CimResourceSet( strictContent );
    }
}

/**
 *   Copyright (c) 2016-2022 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v2.0
 *  which accompanies this distribution, and is available at
 *  https://www.eclipse.org/legal/epl-v20.html
 *
 *  This file is part of the RiseClipse tool
 *
 *  Contributors:
 *      Computer Science Department, CentraleSupélec
 *      EDF R&D
 *  Contacts:
 *      dominique.marcadet@centralesupelec.fr
 *      aurelie.dehouck-neveu@edf.fr
 *  Web site:
 *      https://riseclipse.github.io/
 *
 */
package fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.util;

import org.eclipse.emf.common.util.URI;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.util.CimResourceHandler;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.util.CimResourceImpl;
import fr.centralesupelec.edf.riseclipse.cim.util.cimxml.AbstractCimResourceFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource Factory</b> associated with the package.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.util.EuResourceImpl
 * @generated NOT
 */
public class EuResourceFactoryImpl extends AbstractCimResourceFactory {
    /**
     * Creates an instance of the resource factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EuResourceFactoryImpl() {
        super();
    }

    @Override
    protected CimResourceImpl createCimResource( URI uri ) {
        return new CimResourceImpl( uri );
    }

    @Override
    protected CimResourceHandler createCimResourceHandler() {
        return new CimResourceHandler();
    }

} //EuResourceFactoryImpl

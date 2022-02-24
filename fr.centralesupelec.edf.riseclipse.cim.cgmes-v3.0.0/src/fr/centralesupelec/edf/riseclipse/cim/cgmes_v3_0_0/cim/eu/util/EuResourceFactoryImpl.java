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
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource Factory</b> associated with the package.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.util.EuResourceImpl
 * @generated
 */
public class EuResourceFactoryImpl extends ResourceFactoryImpl {
    /**
     * Creates an instance of the resource factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EuResourceFactoryImpl() {
        super();
    }

    /**
     * Creates an instance of the resource.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Resource createResource( URI uri ) {
        XMLResource result = new EuResourceImpl( uri );
        result.getDefaultSaveOptions().put( XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE );
        result.getDefaultLoadOptions().put( XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE );

        result.getDefaultSaveOptions().put( XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE );

        result.getDefaultLoadOptions().put( XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE );
        result.getDefaultSaveOptions().put( XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE );

        result.getDefaultLoadOptions().put( XMLResource.OPTION_USE_LEXICAL_HANDLER, Boolean.TRUE );
        return result;
    }

} //EuResourceFactoryImpl

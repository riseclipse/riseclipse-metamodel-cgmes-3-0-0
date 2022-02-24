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
package fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLLoad;
import org.eclipse.emf.ecore.xmi.XMLSave;

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimObjectWithID;
import fr.centralesupelec.edf.riseclipse.cim.util.cimxml.AbstractCimResource;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource </b> associated with the package.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.util.CimResourceFactoryImpl
 * @generated NOT
 */
public class CimResourceImpl extends AbstractCimResource {
    /**
     * Creates an instance of the resource.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param uri the URI of the new resource.
     * @generated
     */
    public CimResourceImpl( URI uri ) {
        super( uri );
    }

    @Override
    protected XMLLoad createXMLLoad() {
        return new CimXmlLoad( createXMLHelper() );
    }

    @Override
    protected XMLSave createXMLSave() {
        return new CimXmlSave( createXMLHelper() );
    }

    @Override
    protected XMLHelper createXMLHelper() {
        return new CimXmlHelper( this );
    }

    // TODO: why do we need to override it ?
    @Override
    public String getID( EObject eObject ) {
        if( eObject instanceof CimObjectWithID ) {
            return ( ( CimObjectWithID ) eObject ).getID();
        }
        return super.getID( eObject );
    }

    // TODO: why do we need to override it ?
    @Override
    public void setID( EObject eObject, String id ) {
        if( eObject instanceof CimObjectWithID ) {
            ( ( CimObjectWithID ) eObject ).setID( id );
        }
        super.setID( eObject, id );
    }

} //CimResourceImpl

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
package fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCTopologicalIsland;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCTopologicalNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DC Topological Island</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.DCTopologicalIslandImpl#getDCTopologicalNodes <em>DC Topological Nodes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DCTopologicalIslandImpl extends IdentifiedObjectImpl implements DCTopologicalIsland {
    /**
     * The cached value of the '{@link #getDCTopologicalNodes() <em>DC Topological Nodes</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDCTopologicalNodes()
     * @generated
     * @ordered
     */
    protected EList< DCTopologicalNode > dcTopologicalNodes;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DCTopologicalIslandImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getDCTopologicalIsland();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< DCTopologicalNode > getDCTopologicalNodes() {
        if( dcTopologicalNodes == null ) {
            dcTopologicalNodes = new EObjectWithInverseEList.Unsettable< >( DCTopologicalNode.class,
                    this, CimPackage.DC_TOPOLOGICAL_ISLAND__DC_TOPOLOGICAL_NODES,
                    CimPackage.DC_TOPOLOGICAL_NODE__DC_TOPOLOGICAL_ISLAND );
        }
        return dcTopologicalNodes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDCTopologicalNodes() {
        if( dcTopologicalNodes != null ) {
            ( ( InternalEList.Unsettable< ? > ) dcTopologicalNodes ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDCTopologicalNodes() {
        return dcTopologicalNodes != null && ( ( InternalEList.Unsettable< ? > ) dcTopologicalNodes ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.DC_TOPOLOGICAL_ISLAND__DC_TOPOLOGICAL_NODES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getDCTopologicalNodes() )
                    .basicAdd( otherEnd, msgs );
        }
        return super.eInverseAdd( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.DC_TOPOLOGICAL_ISLAND__DC_TOPOLOGICAL_NODES:
            return ( ( InternalEList< ? > ) getDCTopologicalNodes() ).basicRemove( otherEnd, msgs );
        }
        return super.eInverseRemove( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.DC_TOPOLOGICAL_ISLAND__DC_TOPOLOGICAL_NODES:
            return getDCTopologicalNodes();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case CimPackage.DC_TOPOLOGICAL_ISLAND__DC_TOPOLOGICAL_NODES:
            getDCTopologicalNodes().clear();
            getDCTopologicalNodes().addAll( ( Collection< ? extends DCTopologicalNode > ) newValue );
            return;
        }
        super.eSet( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset( int featureID ) {
        switch( featureID ) {
        case CimPackage.DC_TOPOLOGICAL_ISLAND__DC_TOPOLOGICAL_NODES:
            unsetDCTopologicalNodes();
            return;
        }
        super.eUnset( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet( int featureID ) {
        switch( featureID ) {
        case CimPackage.DC_TOPOLOGICAL_ISLAND__DC_TOPOLOGICAL_NODES:
            return isSetDCTopologicalNodes();
        }
        return super.eIsSet( featureID );
    }

} //DCTopologicalIslandImpl

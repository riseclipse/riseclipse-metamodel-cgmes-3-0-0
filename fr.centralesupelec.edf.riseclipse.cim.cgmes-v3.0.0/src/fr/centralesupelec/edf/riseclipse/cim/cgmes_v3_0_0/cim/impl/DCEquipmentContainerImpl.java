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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCEquipmentContainer;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCNode;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCTopologicalNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DC Equipment Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.DCEquipmentContainerImpl#getDCNodes <em>DC Nodes</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.DCEquipmentContainerImpl#getDCTopologicalNode <em>DC Topological Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DCEquipmentContainerImpl extends EquipmentContainerImpl implements DCEquipmentContainer {
    /**
     * The cached value of the '{@link #getDCNodes() <em>DC Nodes</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDCNodes()
     * @generated
     * @ordered
     */
    protected EList< DCNode > dcNodes;

    /**
     * The cached value of the '{@link #getDCTopologicalNode() <em>DC Topological Node</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDCTopologicalNode()
     * @generated
     * @ordered
     */
    protected EList< DCTopologicalNode > dcTopologicalNode;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DCEquipmentContainerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getDCEquipmentContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< DCNode > getDCNodes() {
        if( dcNodes == null ) {
            dcNodes = new EObjectWithInverseResolvingEList.Unsettable< >( DCNode.class, this,
                    CimPackage.DC_EQUIPMENT_CONTAINER__DC_NODES, CimPackage.DC_NODE__DC_EQUIPMENT_CONTAINER );
        }
        return dcNodes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDCNodes() {
        if( dcNodes != null ) {
            ( ( InternalEList.Unsettable< ? > ) dcNodes ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDCNodes() {
        return dcNodes != null && ( ( InternalEList.Unsettable< ? > ) dcNodes ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< DCTopologicalNode > getDCTopologicalNode() {
        if( dcTopologicalNode == null ) {
            dcTopologicalNode = new EObjectWithInverseResolvingEList.Unsettable< >(
                    DCTopologicalNode.class, this, CimPackage.DC_EQUIPMENT_CONTAINER__DC_TOPOLOGICAL_NODE,
                    CimPackage.DC_TOPOLOGICAL_NODE__DC_EQUIPMENT_CONTAINER );
        }
        return dcTopologicalNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDCTopologicalNode() {
        if( dcTopologicalNode != null ) {
            ( ( InternalEList.Unsettable< ? > ) dcTopologicalNode ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDCTopologicalNode() {
        return dcTopologicalNode != null && ( ( InternalEList.Unsettable< ? > ) dcTopologicalNode ).isSet();
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
        case CimPackage.DC_EQUIPMENT_CONTAINER__DC_NODES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getDCNodes() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.DC_EQUIPMENT_CONTAINER__DC_TOPOLOGICAL_NODE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getDCTopologicalNode() )
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
        case CimPackage.DC_EQUIPMENT_CONTAINER__DC_NODES:
            return ( ( InternalEList< ? > ) getDCNodes() ).basicRemove( otherEnd, msgs );
        case CimPackage.DC_EQUIPMENT_CONTAINER__DC_TOPOLOGICAL_NODE:
            return ( ( InternalEList< ? > ) getDCTopologicalNode() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.DC_EQUIPMENT_CONTAINER__DC_NODES:
            return getDCNodes();
        case CimPackage.DC_EQUIPMENT_CONTAINER__DC_TOPOLOGICAL_NODE:
            return getDCTopologicalNode();
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
        case CimPackage.DC_EQUIPMENT_CONTAINER__DC_NODES:
            getDCNodes().clear();
            getDCNodes().addAll( ( Collection< ? extends DCNode > ) newValue );
            return;
        case CimPackage.DC_EQUIPMENT_CONTAINER__DC_TOPOLOGICAL_NODE:
            getDCTopologicalNode().clear();
            getDCTopologicalNode().addAll( ( Collection< ? extends DCTopologicalNode > ) newValue );
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
        case CimPackage.DC_EQUIPMENT_CONTAINER__DC_NODES:
            unsetDCNodes();
            return;
        case CimPackage.DC_EQUIPMENT_CONTAINER__DC_TOPOLOGICAL_NODE:
            unsetDCTopologicalNode();
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
        case CimPackage.DC_EQUIPMENT_CONTAINER__DC_NODES:
            return isSetDCNodes();
        case CimPackage.DC_EQUIPMENT_CONTAINER__DC_TOPOLOGICAL_NODE:
            return isSetDCTopologicalNode();
        }
        return super.eIsSet( featureID );
    }

} //DCEquipmentContainerImpl

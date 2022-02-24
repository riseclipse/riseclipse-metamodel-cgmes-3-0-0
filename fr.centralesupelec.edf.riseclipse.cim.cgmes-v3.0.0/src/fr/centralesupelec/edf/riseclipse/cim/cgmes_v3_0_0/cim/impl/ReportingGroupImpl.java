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

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BusNameMarker;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ReportingGroup;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reporting Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ReportingGroupImpl#getBusNameMarker <em>Bus Name Marker</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ReportingGroupImpl#getTopologicalNode <em>Topological Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReportingGroupImpl extends IdentifiedObjectImpl implements ReportingGroup {
    /**
     * The cached value of the '{@link #getBusNameMarker() <em>Bus Name Marker</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBusNameMarker()
     * @generated
     * @ordered
     */
    protected EList< BusNameMarker > busNameMarker;

    /**
     * The cached value of the '{@link #getTopologicalNode() <em>Topological Node</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTopologicalNode()
     * @generated
     * @ordered
     */
    protected EList< TopologicalNode > topologicalNode;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ReportingGroupImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getReportingGroup();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< BusNameMarker > getBusNameMarker() {
        if( busNameMarker == null ) {
            busNameMarker = new EObjectWithInverseResolvingEList.Unsettable< >( BusNameMarker.class, this,
                    CimPackage.REPORTING_GROUP__BUS_NAME_MARKER, CimPackage.BUS_NAME_MARKER__REPORTING_GROUP );
        }
        return busNameMarker;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBusNameMarker() {
        if( busNameMarker != null ) ( ( InternalEList.Unsettable< ? > ) busNameMarker ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBusNameMarker() {
        return busNameMarker != null && ( ( InternalEList.Unsettable< ? > ) busNameMarker ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< TopologicalNode > getTopologicalNode() {
        if( topologicalNode == null ) {
            topologicalNode = new EObjectWithInverseResolvingEList.Unsettable< >( TopologicalNode.class,
                    this, CimPackage.REPORTING_GROUP__TOPOLOGICAL_NODE, CimPackage.TOPOLOGICAL_NODE__REPORTING_GROUP );
        }
        return topologicalNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTopologicalNode() {
        if( topologicalNode != null ) ( ( InternalEList.Unsettable< ? > ) topologicalNode ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTopologicalNode() {
        return topologicalNode != null && ( ( InternalEList.Unsettable< ? > ) topologicalNode ).isSet();
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
        case CimPackage.REPORTING_GROUP__BUS_NAME_MARKER:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getBusNameMarker() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.REPORTING_GROUP__TOPOLOGICAL_NODE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getTopologicalNode() )
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
        case CimPackage.REPORTING_GROUP__BUS_NAME_MARKER:
            return ( ( InternalEList< ? > ) getBusNameMarker() ).basicRemove( otherEnd, msgs );
        case CimPackage.REPORTING_GROUP__TOPOLOGICAL_NODE:
            return ( ( InternalEList< ? > ) getTopologicalNode() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.REPORTING_GROUP__BUS_NAME_MARKER:
            return getBusNameMarker();
        case CimPackage.REPORTING_GROUP__TOPOLOGICAL_NODE:
            return getTopologicalNode();
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
        case CimPackage.REPORTING_GROUP__BUS_NAME_MARKER:
            getBusNameMarker().clear();
            getBusNameMarker().addAll( ( Collection< ? extends BusNameMarker > ) newValue );
            return;
        case CimPackage.REPORTING_GROUP__TOPOLOGICAL_NODE:
            getTopologicalNode().clear();
            getTopologicalNode().addAll( ( Collection< ? extends TopologicalNode > ) newValue );
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
        case CimPackage.REPORTING_GROUP__BUS_NAME_MARKER:
            unsetBusNameMarker();
            return;
        case CimPackage.REPORTING_GROUP__TOPOLOGICAL_NODE:
            unsetTopologicalNode();
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
        case CimPackage.REPORTING_GROUP__BUS_NAME_MARKER:
            return isSetBusNameMarker();
        case CimPackage.REPORTING_GROUP__TOPOLOGICAL_NODE:
            return isSetTopologicalNode();
        }
        return super.eIsSet( featureID );
    }

} //ReportingGroupImpl

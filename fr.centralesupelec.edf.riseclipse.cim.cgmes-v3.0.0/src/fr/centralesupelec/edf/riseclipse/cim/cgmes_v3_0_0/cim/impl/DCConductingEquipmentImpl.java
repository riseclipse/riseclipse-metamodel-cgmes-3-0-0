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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCConductingEquipment;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCTerminal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DC Conducting Equipment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.DCConductingEquipmentImpl#getRatedUdc <em>Rated Udc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.DCConductingEquipmentImpl#getDCTerminals <em>DC Terminals</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DCConductingEquipmentImpl extends EquipmentImpl implements DCConductingEquipment {
    /**
     * The default value of the '{@link #getRatedUdc() <em>Rated Udc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedUdc()
     * @generated
     * @ordered
     */
    protected static final Double RATED_UDC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRatedUdc() <em>Rated Udc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedUdc()
     * @generated
     * @ordered
     */
    protected Double ratedUdc = RATED_UDC_EDEFAULT;

    /**
     * This is true if the Rated Udc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ratedUdcESet;

    /**
     * The cached value of the '{@link #getDCTerminals() <em>DC Terminals</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDCTerminals()
     * @generated
     * @ordered
     */
    protected EList< DCTerminal > dcTerminals;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DCConductingEquipmentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getDCConductingEquipment();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getRatedUdc() {
        return ratedUdc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRatedUdc( Double newRatedUdc ) {
        Double oldRatedUdc = ratedUdc;
        ratedUdc = newRatedUdc;
        boolean oldRatedUdcESet = ratedUdcESet;
        ratedUdcESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.DC_CONDUCTING_EQUIPMENT__RATED_UDC,
                    oldRatedUdc, ratedUdc, !oldRatedUdcESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRatedUdc() {
        Double oldRatedUdc = ratedUdc;
        boolean oldRatedUdcESet = ratedUdcESet;
        ratedUdc = RATED_UDC_EDEFAULT;
        ratedUdcESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.DC_CONDUCTING_EQUIPMENT__RATED_UDC,
                    oldRatedUdc, RATED_UDC_EDEFAULT, oldRatedUdcESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRatedUdc() {
        return ratedUdcESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< DCTerminal > getDCTerminals() {
        if( dcTerminals == null ) {
            dcTerminals = new EObjectWithInverseResolvingEList.Unsettable< >( DCTerminal.class, this,
                    CimPackage.DC_CONDUCTING_EQUIPMENT__DC_TERMINALS, CimPackage.DC_TERMINAL__DC_CONDUCTING_EQUIPMENT );
        }
        return dcTerminals;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDCTerminals() {
        if( dcTerminals != null ) {
            ( ( InternalEList.Unsettable< ? > ) dcTerminals ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDCTerminals() {
        return dcTerminals != null && ( ( InternalEList.Unsettable< ? > ) dcTerminals ).isSet();
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
        case CimPackage.DC_CONDUCTING_EQUIPMENT__DC_TERMINALS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getDCTerminals() ).basicAdd( otherEnd,
                    msgs );
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
        case CimPackage.DC_CONDUCTING_EQUIPMENT__DC_TERMINALS:
            return ( ( InternalEList< ? > ) getDCTerminals() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.DC_CONDUCTING_EQUIPMENT__RATED_UDC:
            return getRatedUdc();
        case CimPackage.DC_CONDUCTING_EQUIPMENT__DC_TERMINALS:
            return getDCTerminals();
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
        case CimPackage.DC_CONDUCTING_EQUIPMENT__RATED_UDC:
            setRatedUdc( ( Double ) newValue );
            return;
        case CimPackage.DC_CONDUCTING_EQUIPMENT__DC_TERMINALS:
            getDCTerminals().clear();
            getDCTerminals().addAll( ( Collection< ? extends DCTerminal > ) newValue );
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
        case CimPackage.DC_CONDUCTING_EQUIPMENT__RATED_UDC:
            unsetRatedUdc();
            return;
        case CimPackage.DC_CONDUCTING_EQUIPMENT__DC_TERMINALS:
            unsetDCTerminals();
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
        case CimPackage.DC_CONDUCTING_EQUIPMENT__RATED_UDC:
            return isSetRatedUdc();
        case CimPackage.DC_CONDUCTING_EQUIPMENT__DC_TERMINALS:
            return isSetDCTerminals();
        }
        return super.eIsSet( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if( eIsProxy() ) {
            return super.toString();
        }

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (ratedUdc: " );
        if( ratedUdcESet ) {
            result.append( ratedUdc );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ')' );
        return result.toString();
    }

} //DCConductingEquipmentImpl

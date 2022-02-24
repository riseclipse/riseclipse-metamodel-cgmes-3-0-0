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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCSeriesDevice;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DC Series Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.DCSeriesDeviceImpl#getInductance <em>Inductance</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.DCSeriesDeviceImpl#getResistance <em>Resistance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DCSeriesDeviceImpl extends DCConductingEquipmentImpl implements DCSeriesDevice {
    /**
     * The default value of the '{@link #getInductance() <em>Inductance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInductance()
     * @generated
     * @ordered
     */
    protected static final Double INDUCTANCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInductance() <em>Inductance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInductance()
     * @generated
     * @ordered
     */
    protected Double inductance = INDUCTANCE_EDEFAULT;

    /**
     * This is true if the Inductance attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean inductanceESet;

    /**
     * The default value of the '{@link #getResistance() <em>Resistance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResistance()
     * @generated
     * @ordered
     */
    protected static final Double RESISTANCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getResistance() <em>Resistance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getResistance()
     * @generated
     * @ordered
     */
    protected Double resistance = RESISTANCE_EDEFAULT;

    /**
     * This is true if the Resistance attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean resistanceESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DCSeriesDeviceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getDCSeriesDevice();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getInductance() {
        return inductance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInductance( Double newInductance ) {
        Double oldInductance = inductance;
        inductance = newInductance;
        boolean oldInductanceESet = inductanceESet;
        inductanceESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.DC_SERIES_DEVICE__INDUCTANCE,
                    oldInductance, inductance, !oldInductanceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetInductance() {
        Double oldInductance = inductance;
        boolean oldInductanceESet = inductanceESet;
        inductance = INDUCTANCE_EDEFAULT;
        inductanceESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.DC_SERIES_DEVICE__INDUCTANCE,
                    oldInductance, INDUCTANCE_EDEFAULT, oldInductanceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetInductance() {
        return inductanceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getResistance() {
        return resistance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setResistance( Double newResistance ) {
        Double oldResistance = resistance;
        resistance = newResistance;
        boolean oldResistanceESet = resistanceESet;
        resistanceESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.DC_SERIES_DEVICE__RESISTANCE,
                    oldResistance, resistance, !oldResistanceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetResistance() {
        Double oldResistance = resistance;
        boolean oldResistanceESet = resistanceESet;
        resistance = RESISTANCE_EDEFAULT;
        resistanceESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.DC_SERIES_DEVICE__RESISTANCE,
                    oldResistance, RESISTANCE_EDEFAULT, oldResistanceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetResistance() {
        return resistanceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.DC_SERIES_DEVICE__INDUCTANCE:
            return getInductance();
        case CimPackage.DC_SERIES_DEVICE__RESISTANCE:
            return getResistance();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case CimPackage.DC_SERIES_DEVICE__INDUCTANCE:
            setInductance( ( Double ) newValue );
            return;
        case CimPackage.DC_SERIES_DEVICE__RESISTANCE:
            setResistance( ( Double ) newValue );
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
        case CimPackage.DC_SERIES_DEVICE__INDUCTANCE:
            unsetInductance();
            return;
        case CimPackage.DC_SERIES_DEVICE__RESISTANCE:
            unsetResistance();
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
        case CimPackage.DC_SERIES_DEVICE__INDUCTANCE:
            return isSetInductance();
        case CimPackage.DC_SERIES_DEVICE__RESISTANCE:
            return isSetResistance();
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
        if( eIsProxy() ) return super.toString();

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (inductance: " );
        if( inductanceESet )
            result.append( inductance );
        else
            result.append( "<unset>" );
        result.append( ", resistance: " );
        if( resistanceESet )
            result.append( resistance );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //DCSeriesDeviceImpl

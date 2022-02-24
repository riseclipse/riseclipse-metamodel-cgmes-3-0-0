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
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenUnitKind;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGeneratingUnit;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.EuPackage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.WindPowerPlant;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wind Generating Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindGeneratingUnitImpl#getWindPowerPlant <em>Wind Power Plant</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindGeneratingUnitImpl#getWindGenUnitType <em>Wind Gen Unit Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WindGeneratingUnitImpl extends GeneratingUnitImpl implements WindGeneratingUnit {
    /**
     * The cached value of the '{@link #getWindPowerPlant() <em>Wind Power Plant</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindPowerPlant()
     * @generated
     * @ordered
     */
    protected WindPowerPlant windPowerPlant;

    /**
     * This is true if the Wind Power Plant reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windPowerPlantESet;

    /**
     * The default value of the '{@link #getWindGenUnitType() <em>Wind Gen Unit Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindGenUnitType()
     * @generated
     * @ordered
     */
    protected static final WindGenUnitKind WIND_GEN_UNIT_TYPE_EDEFAULT = WindGenUnitKind.OFFSHORE;

    /**
     * The cached value of the '{@link #getWindGenUnitType() <em>Wind Gen Unit Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindGenUnitType()
     * @generated
     * @ordered
     */
    protected WindGenUnitKind windGenUnitType = WIND_GEN_UNIT_TYPE_EDEFAULT;

    /**
     * This is true if the Wind Gen Unit Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windGenUnitTypeESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WindGeneratingUnitImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getWindGeneratingUnit();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindPowerPlant getWindPowerPlant() {
        return windPowerPlant;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindPowerPlant( WindPowerPlant newWindPowerPlant, NotificationChain msgs ) {
        WindPowerPlant oldWindPowerPlant = windPowerPlant;
        windPowerPlant = newWindPowerPlant;
        boolean oldWindPowerPlantESet = windPowerPlantESet;
        windPowerPlantESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_GENERATING_UNIT__WIND_POWER_PLANT, oldWindPowerPlant, newWindPowerPlant,
                    !oldWindPowerPlantESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setWindPowerPlant( WindPowerPlant newWindPowerPlant ) {
        if( newWindPowerPlant != windPowerPlant ) {
            NotificationChain msgs = null;
            if( windPowerPlant != null )
                msgs = ( ( InternalEObject ) windPowerPlant ).eInverseRemove( this,
                        EuPackage.WIND_POWER_PLANT__WIND_GENERATING_UNITS, WindPowerPlant.class, msgs );
            if( newWindPowerPlant != null )
                msgs = ( ( InternalEObject ) newWindPowerPlant ).eInverseAdd( this,
                        EuPackage.WIND_POWER_PLANT__WIND_GENERATING_UNITS, WindPowerPlant.class, msgs );
            msgs = basicSetWindPowerPlant( newWindPowerPlant, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindPowerPlantESet = windPowerPlantESet;
            windPowerPlantESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        CimPackage.WIND_GENERATING_UNIT__WIND_POWER_PLANT, newWindPowerPlant, newWindPowerPlant,
                        !oldWindPowerPlantESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindPowerPlant( NotificationChain msgs ) {
        WindPowerPlant oldWindPowerPlant = windPowerPlant;
        windPowerPlant = null;
        boolean oldWindPowerPlantESet = windPowerPlantESet;
        windPowerPlantESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_GENERATING_UNIT__WIND_POWER_PLANT, oldWindPowerPlant, null, oldWindPowerPlantESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWindPowerPlant() {
        if( windPowerPlant != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windPowerPlant ).eInverseRemove( this,
                    EuPackage.WIND_POWER_PLANT__WIND_GENERATING_UNITS, WindPowerPlant.class, msgs );
            msgs = basicUnsetWindPowerPlant( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindPowerPlantESet = windPowerPlantESet;
            windPowerPlantESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.WIND_GENERATING_UNIT__WIND_POWER_PLANT, null, null, oldWindPowerPlantESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindPowerPlant() {
        return windPowerPlantESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindGenUnitKind getWindGenUnitType() {
        return windGenUnitType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setWindGenUnitType( WindGenUnitKind newWindGenUnitType ) {
        WindGenUnitKind oldWindGenUnitType = windGenUnitType;
        windGenUnitType = newWindGenUnitType == null ? WIND_GEN_UNIT_TYPE_EDEFAULT : newWindGenUnitType;
        boolean oldWindGenUnitTypeESet = windGenUnitTypeESet;
        windGenUnitTypeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_GENERATING_UNIT__WIND_GEN_UNIT_TYPE,
                    oldWindGenUnitType, windGenUnitType, !oldWindGenUnitTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWindGenUnitType() {
        WindGenUnitKind oldWindGenUnitType = windGenUnitType;
        boolean oldWindGenUnitTypeESet = windGenUnitTypeESet;
        windGenUnitType = WIND_GEN_UNIT_TYPE_EDEFAULT;
        windGenUnitTypeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_GENERATING_UNIT__WIND_GEN_UNIT_TYPE, oldWindGenUnitType,
                    WIND_GEN_UNIT_TYPE_EDEFAULT, oldWindGenUnitTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindGenUnitType() {
        return windGenUnitTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.WIND_GENERATING_UNIT__WIND_POWER_PLANT:
            if( windPowerPlant != null )
                msgs = ( ( InternalEObject ) windPowerPlant ).eInverseRemove( this,
                        EuPackage.WIND_POWER_PLANT__WIND_GENERATING_UNITS, WindPowerPlant.class, msgs );
            return basicSetWindPowerPlant( ( WindPowerPlant ) otherEnd, msgs );
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
        case CimPackage.WIND_GENERATING_UNIT__WIND_POWER_PLANT:
            return basicUnsetWindPowerPlant( msgs );
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
        case CimPackage.WIND_GENERATING_UNIT__WIND_POWER_PLANT:
            return getWindPowerPlant();
        case CimPackage.WIND_GENERATING_UNIT__WIND_GEN_UNIT_TYPE:
            return getWindGenUnitType();
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
        case CimPackage.WIND_GENERATING_UNIT__WIND_POWER_PLANT:
            setWindPowerPlant( ( WindPowerPlant ) newValue );
            return;
        case CimPackage.WIND_GENERATING_UNIT__WIND_GEN_UNIT_TYPE:
            setWindGenUnitType( ( WindGenUnitKind ) newValue );
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
        case CimPackage.WIND_GENERATING_UNIT__WIND_POWER_PLANT:
            unsetWindPowerPlant();
            return;
        case CimPackage.WIND_GENERATING_UNIT__WIND_GEN_UNIT_TYPE:
            unsetWindGenUnitType();
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
        case CimPackage.WIND_GENERATING_UNIT__WIND_POWER_PLANT:
            return isSetWindPowerPlant();
        case CimPackage.WIND_GENERATING_UNIT__WIND_GEN_UNIT_TYPE:
            return isSetWindGenUnitType();
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
        result.append( " (windGenUnitType: " );
        if( windGenUnitTypeESet )
            result.append( windGenUnitType );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //WindGeneratingUnitImpl

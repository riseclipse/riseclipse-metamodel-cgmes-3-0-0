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

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BasicIntervalSchedule;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnitSymbol;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basic Interval Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.BasicIntervalScheduleImpl#getValue2Unit <em>Value2 Unit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.BasicIntervalScheduleImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.BasicIntervalScheduleImpl#getValue1Unit <em>Value1 Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BasicIntervalScheduleImpl extends IdentifiedObjectImpl implements BasicIntervalSchedule {
    /**
     * The default value of the '{@link #getValue2Unit() <em>Value2 Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue2Unit()
     * @generated
     * @ordered
     */
    protected static final UnitSymbol VALUE2_UNIT_EDEFAULT = UnitSymbol.WPERM_K;

    /**
     * The cached value of the '{@link #getValue2Unit() <em>Value2 Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue2Unit()
     * @generated
     * @ordered
     */
    protected UnitSymbol value2Unit = VALUE2_UNIT_EDEFAULT;

    /**
     * This is true if the Value2 Unit attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean value2UnitESet;

    /**
     * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStartTime()
     * @generated
     * @ordered
     */
    protected static final Date START_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStartTime()
     * @generated
     * @ordered
     */
    protected Date startTime = START_TIME_EDEFAULT;

    /**
     * This is true if the Start Time attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean startTimeESet;

    /**
     * The default value of the '{@link #getValue1Unit() <em>Value1 Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue1Unit()
     * @generated
     * @ordered
     */
    protected static final UnitSymbol VALUE1_UNIT_EDEFAULT = UnitSymbol.WPERM_K;

    /**
     * The cached value of the '{@link #getValue1Unit() <em>Value1 Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue1Unit()
     * @generated
     * @ordered
     */
    protected UnitSymbol value1Unit = VALUE1_UNIT_EDEFAULT;

    /**
     * This is true if the Value1 Unit attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean value1UnitESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BasicIntervalScheduleImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getBasicIntervalSchedule();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public UnitSymbol getValue1Unit() {
        return value1Unit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setValue1Unit( UnitSymbol newValue1Unit ) {
        UnitSymbol oldValue1Unit = value1Unit;
        value1Unit = newValue1Unit == null ? VALUE1_UNIT_EDEFAULT : newValue1Unit;
        boolean oldValue1UnitESet = value1UnitESet;
        value1UnitESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.BASIC_INTERVAL_SCHEDULE__VALUE1_UNIT,
                    oldValue1Unit, value1Unit, !oldValue1UnitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetValue1Unit() {
        UnitSymbol oldValue1Unit = value1Unit;
        boolean oldValue1UnitESet = value1UnitESet;
        value1Unit = VALUE1_UNIT_EDEFAULT;
        value1UnitESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.BASIC_INTERVAL_SCHEDULE__VALUE1_UNIT,
                    oldValue1Unit, VALUE1_UNIT_EDEFAULT, oldValue1UnitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetValue1Unit() {
        return value1UnitESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public UnitSymbol getValue2Unit() {
        return value2Unit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setValue2Unit( UnitSymbol newValue2Unit ) {
        UnitSymbol oldValue2Unit = value2Unit;
        value2Unit = newValue2Unit == null ? VALUE2_UNIT_EDEFAULT : newValue2Unit;
        boolean oldValue2UnitESet = value2UnitESet;
        value2UnitESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.BASIC_INTERVAL_SCHEDULE__VALUE2_UNIT,
                    oldValue2Unit, value2Unit, !oldValue2UnitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetValue2Unit() {
        UnitSymbol oldValue2Unit = value2Unit;
        boolean oldValue2UnitESet = value2UnitESet;
        value2Unit = VALUE2_UNIT_EDEFAULT;
        value2UnitESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.BASIC_INTERVAL_SCHEDULE__VALUE2_UNIT,
                    oldValue2Unit, VALUE2_UNIT_EDEFAULT, oldValue2UnitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetValue2Unit() {
        return value2UnitESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getStartTime() {
        return startTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setStartTime( Date newStartTime ) {
        Date oldStartTime = startTime;
        startTime = newStartTime;
        boolean oldStartTimeESet = startTimeESet;
        startTimeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.BASIC_INTERVAL_SCHEDULE__START_TIME,
                    oldStartTime, startTime, !oldStartTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetStartTime() {
        Date oldStartTime = startTime;
        boolean oldStartTimeESet = startTimeESet;
        startTime = START_TIME_EDEFAULT;
        startTimeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.BASIC_INTERVAL_SCHEDULE__START_TIME,
                    oldStartTime, START_TIME_EDEFAULT, oldStartTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetStartTime() {
        return startTimeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.BASIC_INTERVAL_SCHEDULE__VALUE2_UNIT:
            return getValue2Unit();
        case CimPackage.BASIC_INTERVAL_SCHEDULE__START_TIME:
            return getStartTime();
        case CimPackage.BASIC_INTERVAL_SCHEDULE__VALUE1_UNIT:
            return getValue1Unit();
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
        case CimPackage.BASIC_INTERVAL_SCHEDULE__VALUE2_UNIT:
            setValue2Unit( ( UnitSymbol ) newValue );
            return;
        case CimPackage.BASIC_INTERVAL_SCHEDULE__START_TIME:
            setStartTime( ( Date ) newValue );
            return;
        case CimPackage.BASIC_INTERVAL_SCHEDULE__VALUE1_UNIT:
            setValue1Unit( ( UnitSymbol ) newValue );
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
        case CimPackage.BASIC_INTERVAL_SCHEDULE__VALUE2_UNIT:
            unsetValue2Unit();
            return;
        case CimPackage.BASIC_INTERVAL_SCHEDULE__START_TIME:
            unsetStartTime();
            return;
        case CimPackage.BASIC_INTERVAL_SCHEDULE__VALUE1_UNIT:
            unsetValue1Unit();
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
        case CimPackage.BASIC_INTERVAL_SCHEDULE__VALUE2_UNIT:
            return isSetValue2Unit();
        case CimPackage.BASIC_INTERVAL_SCHEDULE__START_TIME:
            return isSetStartTime();
        case CimPackage.BASIC_INTERVAL_SCHEDULE__VALUE1_UNIT:
            return isSetValue1Unit();
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
        result.append( " (value2Unit: " );
        if( value2UnitESet )
            result.append( value2Unit );
        else
            result.append( "<unset>" );
        result.append( ", startTime: " );
        if( startTimeESet )
            result.append( startTime );
        else
            result.append( "<unset>" );
        result.append( ", value1Unit: " );
        if( value1UnitESet )
            result.append( value1Unit );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //BasicIntervalScheduleImpl

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

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AnalogControl;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AnalogValue;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analog Control</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.AnalogControlImpl#getAnalogValue <em>Analog Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.AnalogControlImpl#getMinValue <em>Min Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.AnalogControlImpl#getMaxValue <em>Max Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnalogControlImpl extends ControlImpl implements AnalogControl {
    /**
     * The cached value of the '{@link #getAnalogValue() <em>Analog Value</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAnalogValue()
     * @generated
     * @ordered
     */
    protected AnalogValue analogValue;

    /**
     * This is true if the Analog Value reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean analogValueESet;

    /**
     * The default value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinValue()
     * @generated
     * @ordered
     */
    protected static final Double MIN_VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMinValue() <em>Min Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinValue()
     * @generated
     * @ordered
     */
    protected Double minValue = MIN_VALUE_EDEFAULT;

    /**
     * This is true if the Min Value attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean minValueESet;

    /**
     * The default value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxValue()
     * @generated
     * @ordered
     */
    protected static final Double MAX_VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxValue() <em>Max Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxValue()
     * @generated
     * @ordered
     */
    protected Double maxValue = MAX_VALUE_EDEFAULT;

    /**
     * This is true if the Max Value attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxValueESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AnalogControlImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getAnalogControl();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AnalogValue getAnalogValue() {
        return analogValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAnalogValue( AnalogValue newAnalogValue, NotificationChain msgs ) {
        AnalogValue oldAnalogValue = analogValue;
        analogValue = newAnalogValue;
        boolean oldAnalogValueESet = analogValueESet;
        analogValueESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ANALOG_CONTROL__ANALOG_VALUE, oldAnalogValue, newAnalogValue, !oldAnalogValueESet );
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
    public void setAnalogValue( AnalogValue newAnalogValue ) {
        if( newAnalogValue != analogValue ) {
            NotificationChain msgs = null;
            if( analogValue != null )
                msgs = ( ( InternalEObject ) analogValue ).eInverseRemove( this,
                        CimPackage.ANALOG_VALUE__ANALOG_CONTROL, AnalogValue.class, msgs );
            if( newAnalogValue != null )
                msgs = ( ( InternalEObject ) newAnalogValue ).eInverseAdd( this,
                        CimPackage.ANALOG_VALUE__ANALOG_CONTROL, AnalogValue.class, msgs );
            msgs = basicSetAnalogValue( newAnalogValue, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAnalogValueESet = analogValueESet;
            analogValueESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ANALOG_CONTROL__ANALOG_VALUE,
                        newAnalogValue, newAnalogValue, !oldAnalogValueESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetAnalogValue( NotificationChain msgs ) {
        AnalogValue oldAnalogValue = analogValue;
        analogValue = null;
        boolean oldAnalogValueESet = analogValueESet;
        analogValueESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ANALOG_CONTROL__ANALOG_VALUE, oldAnalogValue, null, oldAnalogValueESet );
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
    public void unsetAnalogValue() {
        if( analogValue != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) analogValue ).eInverseRemove( this, CimPackage.ANALOG_VALUE__ANALOG_CONTROL,
                    AnalogValue.class, msgs );
            msgs = basicUnsetAnalogValue( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAnalogValueESet = analogValueESet;
            analogValueESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ANALOG_CONTROL__ANALOG_VALUE, null,
                        null, oldAnalogValueESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAnalogValue() {
        return analogValueESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getMinValue() {
        return minValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMinValue( Double newMinValue ) {
        Double oldMinValue = minValue;
        minValue = newMinValue;
        boolean oldMinValueESet = minValueESet;
        minValueESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ANALOG_CONTROL__MIN_VALUE, oldMinValue,
                    minValue, !oldMinValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMinValue() {
        Double oldMinValue = minValue;
        boolean oldMinValueESet = minValueESet;
        minValue = MIN_VALUE_EDEFAULT;
        minValueESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ANALOG_CONTROL__MIN_VALUE, oldMinValue,
                    MIN_VALUE_EDEFAULT, oldMinValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMinValue() {
        return minValueESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getMaxValue() {
        return maxValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaxValue( Double newMaxValue ) {
        Double oldMaxValue = maxValue;
        maxValue = newMaxValue;
        boolean oldMaxValueESet = maxValueESet;
        maxValueESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ANALOG_CONTROL__MAX_VALUE, oldMaxValue,
                    maxValue, !oldMaxValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaxValue() {
        Double oldMaxValue = maxValue;
        boolean oldMaxValueESet = maxValueESet;
        maxValue = MAX_VALUE_EDEFAULT;
        maxValueESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ANALOG_CONTROL__MAX_VALUE, oldMaxValue,
                    MAX_VALUE_EDEFAULT, oldMaxValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaxValue() {
        return maxValueESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.ANALOG_CONTROL__ANALOG_VALUE:
            if( analogValue != null )
                msgs = ( ( InternalEObject ) analogValue ).eInverseRemove( this,
                        CimPackage.ANALOG_VALUE__ANALOG_CONTROL, AnalogValue.class, msgs );
            return basicSetAnalogValue( ( AnalogValue ) otherEnd, msgs );
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
        case CimPackage.ANALOG_CONTROL__ANALOG_VALUE:
            return basicUnsetAnalogValue( msgs );
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
        case CimPackage.ANALOG_CONTROL__ANALOG_VALUE:
            return getAnalogValue();
        case CimPackage.ANALOG_CONTROL__MIN_VALUE:
            return getMinValue();
        case CimPackage.ANALOG_CONTROL__MAX_VALUE:
            return getMaxValue();
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
        case CimPackage.ANALOG_CONTROL__ANALOG_VALUE:
            setAnalogValue( ( AnalogValue ) newValue );
            return;
        case CimPackage.ANALOG_CONTROL__MIN_VALUE:
            setMinValue( ( Double ) newValue );
            return;
        case CimPackage.ANALOG_CONTROL__MAX_VALUE:
            setMaxValue( ( Double ) newValue );
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
        case CimPackage.ANALOG_CONTROL__ANALOG_VALUE:
            unsetAnalogValue();
            return;
        case CimPackage.ANALOG_CONTROL__MIN_VALUE:
            unsetMinValue();
            return;
        case CimPackage.ANALOG_CONTROL__MAX_VALUE:
            unsetMaxValue();
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
        case CimPackage.ANALOG_CONTROL__ANALOG_VALUE:
            return isSetAnalogValue();
        case CimPackage.ANALOG_CONTROL__MIN_VALUE:
            return isSetMinValue();
        case CimPackage.ANALOG_CONTROL__MAX_VALUE:
            return isSetMaxValue();
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
        result.append( " (minValue: " );
        if( minValueESet )
            result.append( minValue );
        else
            result.append( "<unset>" );
        result.append( ", maxValue: " );
        if( maxValueESet )
            result.append( maxValue );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //AnalogControlImpl

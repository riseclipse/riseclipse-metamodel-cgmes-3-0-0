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

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AccumulatorLimit;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AccumulatorLimitSet;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Accumulator Limit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.AccumulatorLimitImpl#getLimitSet <em>Limit Set</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.AccumulatorLimitImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccumulatorLimitImpl extends LimitImpl implements AccumulatorLimit {
    /**
     * The cached value of the '{@link #getLimitSet() <em>Limit Set</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLimitSet()
     * @generated
     * @ordered
     */
    protected AccumulatorLimitSet limitSet;

    /**
     * This is true if the Limit Set reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean limitSetESet;

    /**
     * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected static final BigInteger VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValue()
     * @generated
     * @ordered
     */
    protected BigInteger value = VALUE_EDEFAULT;

    /**
     * This is true if the Value attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean valueESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AccumulatorLimitImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getAccumulatorLimit();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AccumulatorLimitSet getLimitSet() {
        return limitSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLimitSet( AccumulatorLimitSet newLimitSet, NotificationChain msgs ) {
        AccumulatorLimitSet oldLimitSet = limitSet;
        limitSet = newLimitSet;
        boolean oldLimitSetESet = limitSetESet;
        limitSetESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ACCUMULATOR_LIMIT__LIMIT_SET, oldLimitSet, newLimitSet, !oldLimitSetESet );
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
    public void setLimitSet( AccumulatorLimitSet newLimitSet ) {
        if( newLimitSet != limitSet ) {
            NotificationChain msgs = null;
            if( limitSet != null )
                msgs = ( ( InternalEObject ) limitSet ).eInverseRemove( this, CimPackage.ACCUMULATOR_LIMIT_SET__LIMITS,
                        AccumulatorLimitSet.class, msgs );
            if( newLimitSet != null )
                msgs = ( ( InternalEObject ) newLimitSet ).eInverseAdd( this, CimPackage.ACCUMULATOR_LIMIT_SET__LIMITS,
                        AccumulatorLimitSet.class, msgs );
            msgs = basicSetLimitSet( newLimitSet, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldLimitSetESet = limitSetESet;
            limitSetESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ACCUMULATOR_LIMIT__LIMIT_SET,
                        newLimitSet, newLimitSet, !oldLimitSetESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetLimitSet( NotificationChain msgs ) {
        AccumulatorLimitSet oldLimitSet = limitSet;
        limitSet = null;
        boolean oldLimitSetESet = limitSetESet;
        limitSetESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ACCUMULATOR_LIMIT__LIMIT_SET, oldLimitSet, null, oldLimitSetESet );
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
    public void unsetLimitSet() {
        if( limitSet != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) limitSet ).eInverseRemove( this, CimPackage.ACCUMULATOR_LIMIT_SET__LIMITS,
                    AccumulatorLimitSet.class, msgs );
            msgs = basicUnsetLimitSet( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldLimitSetESet = limitSetESet;
            limitSetESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ACCUMULATOR_LIMIT__LIMIT_SET, null,
                        null, oldLimitSetESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLimitSet() {
        return limitSetESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BigInteger getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setValue( BigInteger newValue ) {
        BigInteger oldValue = value;
        value = newValue;
        boolean oldValueESet = valueESet;
        valueESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ACCUMULATOR_LIMIT__VALUE, oldValue,
                    value, !oldValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetValue() {
        BigInteger oldValue = value;
        boolean oldValueESet = valueESet;
        value = VALUE_EDEFAULT;
        valueESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ACCUMULATOR_LIMIT__VALUE, oldValue,
                    VALUE_EDEFAULT, oldValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetValue() {
        return valueESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.ACCUMULATOR_LIMIT__LIMIT_SET:
            if( limitSet != null )
                msgs = ( ( InternalEObject ) limitSet ).eInverseRemove( this, CimPackage.ACCUMULATOR_LIMIT_SET__LIMITS,
                        AccumulatorLimitSet.class, msgs );
            return basicSetLimitSet( ( AccumulatorLimitSet ) otherEnd, msgs );
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
        case CimPackage.ACCUMULATOR_LIMIT__LIMIT_SET:
            return basicUnsetLimitSet( msgs );
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
        case CimPackage.ACCUMULATOR_LIMIT__LIMIT_SET:
            return getLimitSet();
        case CimPackage.ACCUMULATOR_LIMIT__VALUE:
            return getValue();
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
        case CimPackage.ACCUMULATOR_LIMIT__LIMIT_SET:
            setLimitSet( ( AccumulatorLimitSet ) newValue );
            return;
        case CimPackage.ACCUMULATOR_LIMIT__VALUE:
            setValue( ( BigInteger ) newValue );
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
        case CimPackage.ACCUMULATOR_LIMIT__LIMIT_SET:
            unsetLimitSet();
            return;
        case CimPackage.ACCUMULATOR_LIMIT__VALUE:
            unsetValue();
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
        case CimPackage.ACCUMULATOR_LIMIT__LIMIT_SET:
            return isSetLimitSet();
        case CimPackage.ACCUMULATOR_LIMIT__VALUE:
            return isSetValue();
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
        result.append( " (value: " );
        if( valueESet )
            result.append( value );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //AccumulatorLimitImpl

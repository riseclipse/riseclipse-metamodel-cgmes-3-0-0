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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Discrete;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscreteValue;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ValueAliasSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discrete</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.DiscreteImpl#getDiscreteValues <em>Discrete Values</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.DiscreteImpl#getValueAliasSet <em>Value Alias Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiscreteImpl extends MeasurementImpl implements Discrete {
    /**
     * The cached value of the '{@link #getDiscreteValues() <em>Discrete Values</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDiscreteValues()
     * @generated
     * @ordered
     */
    protected EList< DiscreteValue > discreteValues;

    /**
     * The cached value of the '{@link #getValueAliasSet() <em>Value Alias Set</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getValueAliasSet()
     * @generated
     * @ordered
     */
    protected ValueAliasSet valueAliasSet;

    /**
     * This is true if the Value Alias Set reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean valueAliasSetESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DiscreteImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getDiscrete();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< DiscreteValue > getDiscreteValues() {
        if( discreteValues == null ) {
            discreteValues = new EObjectWithInverseResolvingEList.Unsettable< >( DiscreteValue.class,
                    this, CimPackage.DISCRETE__DISCRETE_VALUES, CimPackage.DISCRETE_VALUE__DISCRETE );
        }
        return discreteValues;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDiscreteValues() {
        if( discreteValues != null ) ( ( InternalEList.Unsettable< ? > ) discreteValues ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDiscreteValues() {
        return discreteValues != null && ( ( InternalEList.Unsettable< ? > ) discreteValues ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ValueAliasSet getValueAliasSet() {
        return valueAliasSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetValueAliasSet( ValueAliasSet newValueAliasSet, NotificationChain msgs ) {
        ValueAliasSet oldValueAliasSet = valueAliasSet;
        valueAliasSet = newValueAliasSet;
        boolean oldValueAliasSetESet = valueAliasSetESet;
        valueAliasSetESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.DISCRETE__VALUE_ALIAS_SET, oldValueAliasSet, newValueAliasSet, !oldValueAliasSetESet );
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
    public void setValueAliasSet( ValueAliasSet newValueAliasSet ) {
        if( newValueAliasSet != valueAliasSet ) {
            NotificationChain msgs = null;
            if( valueAliasSet != null )
                msgs = ( ( InternalEObject ) valueAliasSet ).eInverseRemove( this,
                        CimPackage.VALUE_ALIAS_SET__DISCRETES, ValueAliasSet.class, msgs );
            if( newValueAliasSet != null )
                msgs = ( ( InternalEObject ) newValueAliasSet ).eInverseAdd( this,
                        CimPackage.VALUE_ALIAS_SET__DISCRETES, ValueAliasSet.class, msgs );
            msgs = basicSetValueAliasSet( newValueAliasSet, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldValueAliasSetESet = valueAliasSetESet;
            valueAliasSetESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.DISCRETE__VALUE_ALIAS_SET,
                        newValueAliasSet, newValueAliasSet, !oldValueAliasSetESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetValueAliasSet( NotificationChain msgs ) {
        ValueAliasSet oldValueAliasSet = valueAliasSet;
        valueAliasSet = null;
        boolean oldValueAliasSetESet = valueAliasSetESet;
        valueAliasSetESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.DISCRETE__VALUE_ALIAS_SET, oldValueAliasSet, null, oldValueAliasSetESet );
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
    public void unsetValueAliasSet() {
        if( valueAliasSet != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) valueAliasSet ).eInverseRemove( this, CimPackage.VALUE_ALIAS_SET__DISCRETES,
                    ValueAliasSet.class, msgs );
            msgs = basicUnsetValueAliasSet( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldValueAliasSetESet = valueAliasSetESet;
            valueAliasSetESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.DISCRETE__VALUE_ALIAS_SET, null,
                        null, oldValueAliasSetESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetValueAliasSet() {
        return valueAliasSetESet;
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
        case CimPackage.DISCRETE__DISCRETE_VALUES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getDiscreteValues() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.DISCRETE__VALUE_ALIAS_SET:
            if( valueAliasSet != null )
                msgs = ( ( InternalEObject ) valueAliasSet ).eInverseRemove( this,
                        CimPackage.VALUE_ALIAS_SET__DISCRETES, ValueAliasSet.class, msgs );
            return basicSetValueAliasSet( ( ValueAliasSet ) otherEnd, msgs );
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
        case CimPackage.DISCRETE__DISCRETE_VALUES:
            return ( ( InternalEList< ? > ) getDiscreteValues() ).basicRemove( otherEnd, msgs );
        case CimPackage.DISCRETE__VALUE_ALIAS_SET:
            return basicUnsetValueAliasSet( msgs );
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
        case CimPackage.DISCRETE__DISCRETE_VALUES:
            return getDiscreteValues();
        case CimPackage.DISCRETE__VALUE_ALIAS_SET:
            return getValueAliasSet();
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
        case CimPackage.DISCRETE__DISCRETE_VALUES:
            getDiscreteValues().clear();
            getDiscreteValues().addAll( ( Collection< ? extends DiscreteValue > ) newValue );
            return;
        case CimPackage.DISCRETE__VALUE_ALIAS_SET:
            setValueAliasSet( ( ValueAliasSet ) newValue );
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
        case CimPackage.DISCRETE__DISCRETE_VALUES:
            unsetDiscreteValues();
            return;
        case CimPackage.DISCRETE__VALUE_ALIAS_SET:
            unsetValueAliasSet();
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
        case CimPackage.DISCRETE__DISCRETE_VALUES:
            return isSetDiscreteValues();
        case CimPackage.DISCRETE__VALUE_ALIAS_SET:
            return isSetValueAliasSet();
        }
        return super.eIsSet( featureID );
    }

} //DiscreteImpl

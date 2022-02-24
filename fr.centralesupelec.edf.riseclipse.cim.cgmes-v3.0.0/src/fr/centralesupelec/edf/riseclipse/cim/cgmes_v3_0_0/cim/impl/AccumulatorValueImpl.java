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

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Accumulator;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AccumulatorReset;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AccumulatorValue;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Accumulator Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.AccumulatorValueImpl#getAccumulatorReset <em>Accumulator Reset</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.AccumulatorValueImpl#getAccumulator <em>Accumulator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccumulatorValueImpl extends MeasurementValueImpl implements AccumulatorValue {
    /**
     * The cached value of the '{@link #getAccumulatorReset() <em>Accumulator Reset</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAccumulatorReset()
     * @generated
     * @ordered
     */
    protected AccumulatorReset accumulatorReset;

    /**
     * This is true if the Accumulator Reset reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean accumulatorResetESet;

    /**
     * The cached value of the '{@link #getAccumulator() <em>Accumulator</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAccumulator()
     * @generated
     * @ordered
     */
    protected Accumulator accumulator;

    /**
     * This is true if the Accumulator reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean accumulatorESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AccumulatorValueImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getAccumulatorValue();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AccumulatorReset getAccumulatorReset() {
        if( accumulatorReset != null && accumulatorReset.eIsProxy() ) {
            InternalEObject oldAccumulatorReset = ( InternalEObject ) accumulatorReset;
            accumulatorReset = ( AccumulatorReset ) eResolveProxy( oldAccumulatorReset );
            if( accumulatorReset != oldAccumulatorReset ) {
                if( eNotificationRequired() )
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                            CimPackage.ACCUMULATOR_VALUE__ACCUMULATOR_RESET, oldAccumulatorReset, accumulatorReset ) );
            }
        }
        return accumulatorReset;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AccumulatorReset basicGetAccumulatorReset() {
        return accumulatorReset;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAccumulatorReset( AccumulatorReset newAccumulatorReset, NotificationChain msgs ) {
        AccumulatorReset oldAccumulatorReset = accumulatorReset;
        accumulatorReset = newAccumulatorReset;
        boolean oldAccumulatorResetESet = accumulatorResetESet;
        accumulatorResetESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ACCUMULATOR_VALUE__ACCUMULATOR_RESET, oldAccumulatorReset, newAccumulatorReset,
                    !oldAccumulatorResetESet );
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
    public void setAccumulatorReset( AccumulatorReset newAccumulatorReset ) {
        if( newAccumulatorReset != accumulatorReset ) {
            NotificationChain msgs = null;
            if( accumulatorReset != null )
                msgs = ( ( InternalEObject ) accumulatorReset ).eInverseRemove( this,
                        CimPackage.ACCUMULATOR_RESET__ACCUMULATOR_VALUE, AccumulatorReset.class, msgs );
            if( newAccumulatorReset != null )
                msgs = ( ( InternalEObject ) newAccumulatorReset ).eInverseAdd( this,
                        CimPackage.ACCUMULATOR_RESET__ACCUMULATOR_VALUE, AccumulatorReset.class, msgs );
            msgs = basicSetAccumulatorReset( newAccumulatorReset, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAccumulatorResetESet = accumulatorResetESet;
            accumulatorResetESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ACCUMULATOR_VALUE__ACCUMULATOR_RESET,
                        newAccumulatorReset, newAccumulatorReset, !oldAccumulatorResetESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetAccumulatorReset( NotificationChain msgs ) {
        AccumulatorReset oldAccumulatorReset = accumulatorReset;
        accumulatorReset = null;
        boolean oldAccumulatorResetESet = accumulatorResetESet;
        accumulatorResetESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ACCUMULATOR_VALUE__ACCUMULATOR_RESET, oldAccumulatorReset, null,
                    oldAccumulatorResetESet );
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
    public void unsetAccumulatorReset() {
        if( accumulatorReset != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) accumulatorReset ).eInverseRemove( this,
                    CimPackage.ACCUMULATOR_RESET__ACCUMULATOR_VALUE, AccumulatorReset.class, msgs );
            msgs = basicUnsetAccumulatorReset( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAccumulatorResetESet = accumulatorResetESet;
            accumulatorResetESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.ACCUMULATOR_VALUE__ACCUMULATOR_RESET, null, null, oldAccumulatorResetESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAccumulatorReset() {
        return accumulatorResetESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Accumulator getAccumulator() {
        return accumulator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAccumulator( Accumulator newAccumulator, NotificationChain msgs ) {
        Accumulator oldAccumulator = accumulator;
        accumulator = newAccumulator;
        boolean oldAccumulatorESet = accumulatorESet;
        accumulatorESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ACCUMULATOR_VALUE__ACCUMULATOR, oldAccumulator, newAccumulator, !oldAccumulatorESet );
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
    public void setAccumulator( Accumulator newAccumulator ) {
        if( newAccumulator != accumulator ) {
            NotificationChain msgs = null;
            if( accumulator != null )
                msgs = ( ( InternalEObject ) accumulator ).eInverseRemove( this,
                        CimPackage.ACCUMULATOR__ACCUMULATOR_VALUES, Accumulator.class, msgs );
            if( newAccumulator != null )
                msgs = ( ( InternalEObject ) newAccumulator ).eInverseAdd( this,
                        CimPackage.ACCUMULATOR__ACCUMULATOR_VALUES, Accumulator.class, msgs );
            msgs = basicSetAccumulator( newAccumulator, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAccumulatorESet = accumulatorESet;
            accumulatorESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ACCUMULATOR_VALUE__ACCUMULATOR,
                        newAccumulator, newAccumulator, !oldAccumulatorESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetAccumulator( NotificationChain msgs ) {
        Accumulator oldAccumulator = accumulator;
        accumulator = null;
        boolean oldAccumulatorESet = accumulatorESet;
        accumulatorESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ACCUMULATOR_VALUE__ACCUMULATOR, oldAccumulator, null, oldAccumulatorESet );
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
    public void unsetAccumulator() {
        if( accumulator != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) accumulator ).eInverseRemove( this, CimPackage.ACCUMULATOR__ACCUMULATOR_VALUES,
                    Accumulator.class, msgs );
            msgs = basicUnsetAccumulator( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAccumulatorESet = accumulatorESet;
            accumulatorESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ACCUMULATOR_VALUE__ACCUMULATOR,
                        null, null, oldAccumulatorESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAccumulator() {
        return accumulatorESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.ACCUMULATOR_VALUE__ACCUMULATOR_RESET:
            if( accumulatorReset != null )
                msgs = ( ( InternalEObject ) accumulatorReset ).eInverseRemove( this,
                        CimPackage.ACCUMULATOR_RESET__ACCUMULATOR_VALUE, AccumulatorReset.class, msgs );
            return basicSetAccumulatorReset( ( AccumulatorReset ) otherEnd, msgs );
        case CimPackage.ACCUMULATOR_VALUE__ACCUMULATOR:
            if( accumulator != null )
                msgs = ( ( InternalEObject ) accumulator ).eInverseRemove( this,
                        CimPackage.ACCUMULATOR__ACCUMULATOR_VALUES, Accumulator.class, msgs );
            return basicSetAccumulator( ( Accumulator ) otherEnd, msgs );
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
        case CimPackage.ACCUMULATOR_VALUE__ACCUMULATOR_RESET:
            return basicUnsetAccumulatorReset( msgs );
        case CimPackage.ACCUMULATOR_VALUE__ACCUMULATOR:
            return basicUnsetAccumulator( msgs );
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
        case CimPackage.ACCUMULATOR_VALUE__ACCUMULATOR_RESET:
            if( resolve ) return getAccumulatorReset();
            return basicGetAccumulatorReset();
        case CimPackage.ACCUMULATOR_VALUE__ACCUMULATOR:
            return getAccumulator();
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
        case CimPackage.ACCUMULATOR_VALUE__ACCUMULATOR_RESET:
            setAccumulatorReset( ( AccumulatorReset ) newValue );
            return;
        case CimPackage.ACCUMULATOR_VALUE__ACCUMULATOR:
            setAccumulator( ( Accumulator ) newValue );
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
        case CimPackage.ACCUMULATOR_VALUE__ACCUMULATOR_RESET:
            unsetAccumulatorReset();
            return;
        case CimPackage.ACCUMULATOR_VALUE__ACCUMULATOR:
            unsetAccumulator();
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
        case CimPackage.ACCUMULATOR_VALUE__ACCUMULATOR_RESET:
            return isSetAccumulatorReset();
        case CimPackage.ACCUMULATOR_VALUE__ACCUMULATOR:
            return isSetAccumulator();
        }
        return super.eIsSet( featureID );
    }

} //AccumulatorValueImpl

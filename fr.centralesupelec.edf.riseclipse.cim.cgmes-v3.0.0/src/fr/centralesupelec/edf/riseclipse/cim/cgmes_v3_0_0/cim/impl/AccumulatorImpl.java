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

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Accumulator;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AccumulatorLimitSet;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AccumulatorValue;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Accumulator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.AccumulatorImpl#getAccumulatorValues <em>Accumulator Values</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.AccumulatorImpl#getLimitSets <em>Limit Sets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccumulatorImpl extends MeasurementImpl implements Accumulator {
    /**
     * The cached value of the '{@link #getAccumulatorValues() <em>Accumulator Values</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAccumulatorValues()
     * @generated
     * @ordered
     */
    protected EList< AccumulatorValue > accumulatorValues;

    /**
     * The cached value of the '{@link #getLimitSets() <em>Limit Sets</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLimitSets()
     * @generated
     * @ordered
     */
    protected EList< AccumulatorLimitSet > limitSets;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AccumulatorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getAccumulator();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< AccumulatorValue > getAccumulatorValues() {
        if( accumulatorValues == null ) {
            accumulatorValues = new EObjectWithInverseResolvingEList.Unsettable< >(
                    AccumulatorValue.class, this, CimPackage.ACCUMULATOR__ACCUMULATOR_VALUES,
                    CimPackage.ACCUMULATOR_VALUE__ACCUMULATOR );
        }
        return accumulatorValues;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAccumulatorValues() {
        if( accumulatorValues != null ) {
            ( ( InternalEList.Unsettable< ? > ) accumulatorValues ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAccumulatorValues() {
        return accumulatorValues != null && ( ( InternalEList.Unsettable< ? > ) accumulatorValues ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< AccumulatorLimitSet > getLimitSets() {
        if( limitSets == null ) {
            limitSets = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< >(
                    AccumulatorLimitSet.class, this, CimPackage.ACCUMULATOR__LIMIT_SETS,
                    CimPackage.ACCUMULATOR_LIMIT_SET__MEASUREMENTS );
        }
        return limitSets;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLimitSets() {
        if( limitSets != null ) {
            ( ( InternalEList.Unsettable< ? > ) limitSets ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLimitSets() {
        return limitSets != null && ( ( InternalEList.Unsettable< ? > ) limitSets ).isSet();
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
        case CimPackage.ACCUMULATOR__ACCUMULATOR_VALUES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getAccumulatorValues() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.ACCUMULATOR__LIMIT_SETS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getLimitSets() ).basicAdd( otherEnd,
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
        case CimPackage.ACCUMULATOR__ACCUMULATOR_VALUES:
            return ( ( InternalEList< ? > ) getAccumulatorValues() ).basicRemove( otherEnd, msgs );
        case CimPackage.ACCUMULATOR__LIMIT_SETS:
            return ( ( InternalEList< ? > ) getLimitSets() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.ACCUMULATOR__ACCUMULATOR_VALUES:
            return getAccumulatorValues();
        case CimPackage.ACCUMULATOR__LIMIT_SETS:
            return getLimitSets();
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
        case CimPackage.ACCUMULATOR__ACCUMULATOR_VALUES:
            getAccumulatorValues().clear();
            getAccumulatorValues().addAll( ( Collection< ? extends AccumulatorValue > ) newValue );
            return;
        case CimPackage.ACCUMULATOR__LIMIT_SETS:
            getLimitSets().clear();
            getLimitSets().addAll( ( Collection< ? extends AccumulatorLimitSet > ) newValue );
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
        case CimPackage.ACCUMULATOR__ACCUMULATOR_VALUES:
            unsetAccumulatorValues();
            return;
        case CimPackage.ACCUMULATOR__LIMIT_SETS:
            unsetLimitSets();
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
        case CimPackage.ACCUMULATOR__ACCUMULATOR_VALUES:
            return isSetAccumulatorValues();
        case CimPackage.ACCUMULATOR__LIMIT_SETS:
            return isSetLimitSets();
        }
        return super.eIsSet( featureID );
    }

} //AccumulatorImpl

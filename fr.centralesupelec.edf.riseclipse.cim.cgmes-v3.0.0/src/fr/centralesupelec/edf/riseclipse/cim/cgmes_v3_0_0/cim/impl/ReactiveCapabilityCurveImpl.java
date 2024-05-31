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

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ReactiveCapabilityCurve;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reactive Capability Curve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ReactiveCapabilityCurveImpl#getEquivalentInjection <em>Equivalent Injection</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ReactiveCapabilityCurveImpl#getInitiallyUsedBySynchronousMachines <em>Initially Used By Synchronous Machines</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReactiveCapabilityCurveImpl extends CurveImpl implements ReactiveCapabilityCurve {
    /**
     * The cached value of the '{@link #getEquivalentInjection() <em>Equivalent Injection</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEquivalentInjection()
     * @generated
     * @ordered
     */
    protected EList< EquivalentInjection > equivalentInjection;

    /**
     * The cached value of the '{@link #getInitiallyUsedBySynchronousMachines() <em>Initially Used By Synchronous Machines</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInitiallyUsedBySynchronousMachines()
     * @generated
     * @ordered
     */
    protected EList< SynchronousMachine > initiallyUsedBySynchronousMachines;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ReactiveCapabilityCurveImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getReactiveCapabilityCurve();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< SynchronousMachine > getInitiallyUsedBySynchronousMachines() {
        if( initiallyUsedBySynchronousMachines == null ) {
            initiallyUsedBySynchronousMachines = new EObjectWithInverseResolvingEList.Unsettable< >(
                    SynchronousMachine.class, this,
                    CimPackage.REACTIVE_CAPABILITY_CURVE__INITIALLY_USED_BY_SYNCHRONOUS_MACHINES,
                    CimPackage.SYNCHRONOUS_MACHINE__INITIAL_REACTIVE_CAPABILITY_CURVE );
        }
        return initiallyUsedBySynchronousMachines;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetInitiallyUsedBySynchronousMachines() {
        if( initiallyUsedBySynchronousMachines != null ) {
            ( ( InternalEList.Unsettable< ? > ) initiallyUsedBySynchronousMachines ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetInitiallyUsedBySynchronousMachines() {
        return initiallyUsedBySynchronousMachines != null
                && ( ( InternalEList.Unsettable< ? > ) initiallyUsedBySynchronousMachines ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< EquivalentInjection > getEquivalentInjection() {
        if( equivalentInjection == null ) {
            equivalentInjection = new EObjectWithInverseResolvingEList.Unsettable< >(
                    EquivalentInjection.class, this, CimPackage.REACTIVE_CAPABILITY_CURVE__EQUIVALENT_INJECTION,
                    CimPackage.EQUIVALENT_INJECTION__REACTIVE_CAPABILITY_CURVE );
        }
        return equivalentInjection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEquivalentInjection() {
        if( equivalentInjection != null ) {
            ( ( InternalEList.Unsettable< ? > ) equivalentInjection ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEquivalentInjection() {
        return equivalentInjection != null && ( ( InternalEList.Unsettable< ? > ) equivalentInjection ).isSet();
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
        case CimPackage.REACTIVE_CAPABILITY_CURVE__EQUIVALENT_INJECTION:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getEquivalentInjection() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.REACTIVE_CAPABILITY_CURVE__INITIALLY_USED_BY_SYNCHRONOUS_MACHINES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getInitiallyUsedBySynchronousMachines() )
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
        case CimPackage.REACTIVE_CAPABILITY_CURVE__EQUIVALENT_INJECTION:
            return ( ( InternalEList< ? > ) getEquivalentInjection() ).basicRemove( otherEnd, msgs );
        case CimPackage.REACTIVE_CAPABILITY_CURVE__INITIALLY_USED_BY_SYNCHRONOUS_MACHINES:
            return ( ( InternalEList< ? > ) getInitiallyUsedBySynchronousMachines() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.REACTIVE_CAPABILITY_CURVE__EQUIVALENT_INJECTION:
            return getEquivalentInjection();
        case CimPackage.REACTIVE_CAPABILITY_CURVE__INITIALLY_USED_BY_SYNCHRONOUS_MACHINES:
            return getInitiallyUsedBySynchronousMachines();
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
        case CimPackage.REACTIVE_CAPABILITY_CURVE__EQUIVALENT_INJECTION:
            getEquivalentInjection().clear();
            getEquivalentInjection().addAll( ( Collection< ? extends EquivalentInjection > ) newValue );
            return;
        case CimPackage.REACTIVE_CAPABILITY_CURVE__INITIALLY_USED_BY_SYNCHRONOUS_MACHINES:
            getInitiallyUsedBySynchronousMachines().clear();
            getInitiallyUsedBySynchronousMachines().addAll( ( Collection< ? extends SynchronousMachine > ) newValue );
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
        case CimPackage.REACTIVE_CAPABILITY_CURVE__EQUIVALENT_INJECTION:
            unsetEquivalentInjection();
            return;
        case CimPackage.REACTIVE_CAPABILITY_CURVE__INITIALLY_USED_BY_SYNCHRONOUS_MACHINES:
            unsetInitiallyUsedBySynchronousMachines();
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
        case CimPackage.REACTIVE_CAPABILITY_CURVE__EQUIVALENT_INJECTION:
            return isSetEquivalentInjection();
        case CimPackage.REACTIVE_CAPABILITY_CURVE__INITIALLY_USED_BY_SYNCHRONOUS_MACHINES:
            return isSetInitiallyUsedBySynchronousMachines();
        }
        return super.eIsSet( featureID );
    }

} //ReactiveCapabilityCurveImpl

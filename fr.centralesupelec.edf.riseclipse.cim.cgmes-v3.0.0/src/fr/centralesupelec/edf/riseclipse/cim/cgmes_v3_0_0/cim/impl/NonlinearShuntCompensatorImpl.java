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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.NonlinearShuntCompensator;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.NonlinearShuntCompensatorPoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nonlinear Shunt Compensator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.NonlinearShuntCompensatorImpl#getNonlinearShuntCompensatorPoints <em>Nonlinear Shunt Compensator Points</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NonlinearShuntCompensatorImpl extends ShuntCompensatorImpl implements NonlinearShuntCompensator {
    /**
     * The cached value of the '{@link #getNonlinearShuntCompensatorPoints() <em>Nonlinear Shunt Compensator Points</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNonlinearShuntCompensatorPoints()
     * @generated
     * @ordered
     */
    protected EList< NonlinearShuntCompensatorPoint > nonlinearShuntCompensatorPoints;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected NonlinearShuntCompensatorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getNonlinearShuntCompensator();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< NonlinearShuntCompensatorPoint > getNonlinearShuntCompensatorPoints() {
        if( nonlinearShuntCompensatorPoints == null ) {
            nonlinearShuntCompensatorPoints = new EObjectWithInverseResolvingEList.Unsettable< >(
                    NonlinearShuntCompensatorPoint.class, this,
                    CimPackage.NONLINEAR_SHUNT_COMPENSATOR__NONLINEAR_SHUNT_COMPENSATOR_POINTS,
                    CimPackage.NONLINEAR_SHUNT_COMPENSATOR_POINT__NONLINEAR_SHUNT_COMPENSATOR );
        }
        return nonlinearShuntCompensatorPoints;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNonlinearShuntCompensatorPoints() {
        if( nonlinearShuntCompensatorPoints != null ) {
            ( ( InternalEList.Unsettable< ? > ) nonlinearShuntCompensatorPoints ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNonlinearShuntCompensatorPoints() {
        return nonlinearShuntCompensatorPoints != null
                && ( ( InternalEList.Unsettable< ? > ) nonlinearShuntCompensatorPoints ).isSet();
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
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR__NONLINEAR_SHUNT_COMPENSATOR_POINTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getNonlinearShuntCompensatorPoints() )
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
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR__NONLINEAR_SHUNT_COMPENSATOR_POINTS:
            return ( ( InternalEList< ? > ) getNonlinearShuntCompensatorPoints() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR__NONLINEAR_SHUNT_COMPENSATOR_POINTS:
            return getNonlinearShuntCompensatorPoints();
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
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR__NONLINEAR_SHUNT_COMPENSATOR_POINTS:
            getNonlinearShuntCompensatorPoints().clear();
            getNonlinearShuntCompensatorPoints()
                    .addAll( ( Collection< ? extends NonlinearShuntCompensatorPoint > ) newValue );
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
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR__NONLINEAR_SHUNT_COMPENSATOR_POINTS:
            unsetNonlinearShuntCompensatorPoints();
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
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR__NONLINEAR_SHUNT_COMPENSATOR_POINTS:
            return isSetNonlinearShuntCompensatorPoints();
        }
        return super.eIsSet( featureID );
    }

} //NonlinearShuntCompensatorImpl

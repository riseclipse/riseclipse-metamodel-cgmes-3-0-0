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

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Analog;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AnalogLimitSet;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AnalogValue;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analog</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.AnalogImpl#getAnalogValues <em>Analog Values</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.AnalogImpl#getPositiveFlowIn <em>Positive Flow In</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.AnalogImpl#getLimitSets <em>Limit Sets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnalogImpl extends MeasurementImpl implements Analog {
    /**
     * The cached value of the '{@link #getAnalogValues() <em>Analog Values</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAnalogValues()
     * @generated
     * @ordered
     */
    protected EList< AnalogValue > analogValues;

    /**
     * The default value of the '{@link #getPositiveFlowIn() <em>Positive Flow In</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPositiveFlowIn()
     * @generated
     * @ordered
     */
    protected static final Boolean POSITIVE_FLOW_IN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPositiveFlowIn() <em>Positive Flow In</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPositiveFlowIn()
     * @generated
     * @ordered
     */
    protected Boolean positiveFlowIn = POSITIVE_FLOW_IN_EDEFAULT;

    /**
     * This is true if the Positive Flow In attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean positiveFlowInESet;

    /**
     * The cached value of the '{@link #getLimitSets() <em>Limit Sets</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLimitSets()
     * @generated
     * @ordered
     */
    protected EList< AnalogLimitSet > limitSets;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AnalogImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getAnalog();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< AnalogValue > getAnalogValues() {
        if( analogValues == null ) {
            analogValues = new EObjectWithInverseResolvingEList.Unsettable< >( AnalogValue.class, this,
                    CimPackage.ANALOG__ANALOG_VALUES, CimPackage.ANALOG_VALUE__ANALOG );
        }
        return analogValues;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAnalogValues() {
        if( analogValues != null ) ( ( InternalEList.Unsettable< ? > ) analogValues ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAnalogValues() {
        return analogValues != null && ( ( InternalEList.Unsettable< ? > ) analogValues ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getPositiveFlowIn() {
        return positiveFlowIn;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPositiveFlowIn( Boolean newPositiveFlowIn ) {
        Boolean oldPositiveFlowIn = positiveFlowIn;
        positiveFlowIn = newPositiveFlowIn;
        boolean oldPositiveFlowInESet = positiveFlowInESet;
        positiveFlowInESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ANALOG__POSITIVE_FLOW_IN,
                    oldPositiveFlowIn, positiveFlowIn, !oldPositiveFlowInESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPositiveFlowIn() {
        Boolean oldPositiveFlowIn = positiveFlowIn;
        boolean oldPositiveFlowInESet = positiveFlowInESet;
        positiveFlowIn = POSITIVE_FLOW_IN_EDEFAULT;
        positiveFlowInESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ANALOG__POSITIVE_FLOW_IN,
                    oldPositiveFlowIn, POSITIVE_FLOW_IN_EDEFAULT, oldPositiveFlowInESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPositiveFlowIn() {
        return positiveFlowInESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< AnalogLimitSet > getLimitSets() {
        if( limitSets == null ) {
            limitSets = new EObjectWithInverseResolvingEList.Unsettable.ManyInverse< >(
                    AnalogLimitSet.class, this, CimPackage.ANALOG__LIMIT_SETS,
                    CimPackage.ANALOG_LIMIT_SET__MEASUREMENTS );
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
        if( limitSets != null ) ( ( InternalEList.Unsettable< ? > ) limitSets ).unset();
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
        case CimPackage.ANALOG__ANALOG_VALUES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getAnalogValues() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.ANALOG__LIMIT_SETS:
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
        case CimPackage.ANALOG__ANALOG_VALUES:
            return ( ( InternalEList< ? > ) getAnalogValues() ).basicRemove( otherEnd, msgs );
        case CimPackage.ANALOG__LIMIT_SETS:
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
        case CimPackage.ANALOG__ANALOG_VALUES:
            return getAnalogValues();
        case CimPackage.ANALOG__POSITIVE_FLOW_IN:
            return getPositiveFlowIn();
        case CimPackage.ANALOG__LIMIT_SETS:
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
        case CimPackage.ANALOG__ANALOG_VALUES:
            getAnalogValues().clear();
            getAnalogValues().addAll( ( Collection< ? extends AnalogValue > ) newValue );
            return;
        case CimPackage.ANALOG__POSITIVE_FLOW_IN:
            setPositiveFlowIn( ( Boolean ) newValue );
            return;
        case CimPackage.ANALOG__LIMIT_SETS:
            getLimitSets().clear();
            getLimitSets().addAll( ( Collection< ? extends AnalogLimitSet > ) newValue );
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
        case CimPackage.ANALOG__ANALOG_VALUES:
            unsetAnalogValues();
            return;
        case CimPackage.ANALOG__POSITIVE_FLOW_IN:
            unsetPositiveFlowIn();
            return;
        case CimPackage.ANALOG__LIMIT_SETS:
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
        case CimPackage.ANALOG__ANALOG_VALUES:
            return isSetAnalogValues();
        case CimPackage.ANALOG__POSITIVE_FLOW_IN:
            return isSetPositiveFlowIn();
        case CimPackage.ANALOG__LIMIT_SETS:
            return isSetLimitSets();
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
        result.append( " (positiveFlowIn: " );
        if( positiveFlowInESet )
            result.append( positiveFlowIn );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //AnalogImpl

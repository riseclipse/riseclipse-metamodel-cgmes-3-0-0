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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SVCControlMode;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StaticVarCompensator;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StaticVarCompensatorDynamics;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Static Var Compensator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.StaticVarCompensatorImpl#getSVCControlMode <em>SVC Control Mode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.StaticVarCompensatorImpl#getSlope <em>Slope</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.StaticVarCompensatorImpl#getInductiveRating <em>Inductive Rating</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.StaticVarCompensatorImpl#getCapacitiveRating <em>Capacitive Rating</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.StaticVarCompensatorImpl#getVoltageSetPoint <em>Voltage Set Point</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.StaticVarCompensatorImpl#getStaticVarCompensatorDynamics <em>Static Var Compensator Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.StaticVarCompensatorImpl#getQ <em>Q</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StaticVarCompensatorImpl extends RegulatingCondEqImpl implements StaticVarCompensator {
    /**
     * The default value of the '{@link #getSVCControlMode() <em>SVC Control Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSVCControlMode()
     * @generated
     * @ordered
     */
    protected static final SVCControlMode SVC_CONTROL_MODE_EDEFAULT = SVCControlMode.REACTIVE_POWER;

    /**
     * The cached value of the '{@link #getSVCControlMode() <em>SVC Control Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSVCControlMode()
     * @generated
     * @ordered
     */
    protected SVCControlMode sVCControlMode = SVC_CONTROL_MODE_EDEFAULT;

    /**
     * This is true if the SVC Control Mode attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sVCControlModeESet;

    /**
     * The default value of the '{@link #getSlope() <em>Slope</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSlope()
     * @generated
     * @ordered
     */
    protected static final Double SLOPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSlope() <em>Slope</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSlope()
     * @generated
     * @ordered
     */
    protected Double slope = SLOPE_EDEFAULT;

    /**
     * This is true if the Slope attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean slopeESet;

    /**
     * The default value of the '{@link #getInductiveRating() <em>Inductive Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInductiveRating()
     * @generated
     * @ordered
     */
    protected static final Double INDUCTIVE_RATING_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInductiveRating() <em>Inductive Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInductiveRating()
     * @generated
     * @ordered
     */
    protected Double inductiveRating = INDUCTIVE_RATING_EDEFAULT;

    /**
     * This is true if the Inductive Rating attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean inductiveRatingESet;

    /**
     * The default value of the '{@link #getCapacitiveRating() <em>Capacitive Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCapacitiveRating()
     * @generated
     * @ordered
     */
    protected static final Double CAPACITIVE_RATING_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCapacitiveRating() <em>Capacitive Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCapacitiveRating()
     * @generated
     * @ordered
     */
    protected Double capacitiveRating = CAPACITIVE_RATING_EDEFAULT;

    /**
     * This is true if the Capacitive Rating attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean capacitiveRatingESet;

    /**
     * The default value of the '{@link #getVoltageSetPoint() <em>Voltage Set Point</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVoltageSetPoint()
     * @generated
     * @ordered
     */
    protected static final Double VOLTAGE_SET_POINT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVoltageSetPoint() <em>Voltage Set Point</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVoltageSetPoint()
     * @generated
     * @ordered
     */
    protected Double voltageSetPoint = VOLTAGE_SET_POINT_EDEFAULT;

    /**
     * This is true if the Voltage Set Point attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean voltageSetPointESet;

    /**
     * The cached value of the '{@link #getStaticVarCompensatorDynamics() <em>Static Var Compensator Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStaticVarCompensatorDynamics()
     * @generated
     * @ordered
     */
    protected StaticVarCompensatorDynamics staticVarCompensatorDynamics;

    /**
     * This is true if the Static Var Compensator Dynamics reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean staticVarCompensatorDynamicsESet;

    /**
     * The default value of the '{@link #getQ() <em>Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQ()
     * @generated
     * @ordered
     */
    protected static final Double Q_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getQ() <em>Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQ()
     * @generated
     * @ordered
     */
    protected Double q = Q_EDEFAULT;

    /**
     * This is true if the Q attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean qESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected StaticVarCompensatorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getStaticVarCompensator();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getCapacitiveRating() {
        return capacitiveRating;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCapacitiveRating( Double newCapacitiveRating ) {
        Double oldCapacitiveRating = capacitiveRating;
        capacitiveRating = newCapacitiveRating;
        boolean oldCapacitiveRatingESet = capacitiveRatingESet;
        capacitiveRatingESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.STATIC_VAR_COMPENSATOR__CAPACITIVE_RATING, oldCapacitiveRating, capacitiveRating,
                    !oldCapacitiveRatingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCapacitiveRating() {
        Double oldCapacitiveRating = capacitiveRating;
        boolean oldCapacitiveRatingESet = capacitiveRatingESet;
        capacitiveRating = CAPACITIVE_RATING_EDEFAULT;
        capacitiveRatingESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.STATIC_VAR_COMPENSATOR__CAPACITIVE_RATING, oldCapacitiveRating,
                    CAPACITIVE_RATING_EDEFAULT, oldCapacitiveRatingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCapacitiveRating() {
        return capacitiveRatingESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getInductiveRating() {
        return inductiveRating;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInductiveRating( Double newInductiveRating ) {
        Double oldInductiveRating = inductiveRating;
        inductiveRating = newInductiveRating;
        boolean oldInductiveRatingESet = inductiveRatingESet;
        inductiveRatingESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.STATIC_VAR_COMPENSATOR__INDUCTIVE_RATING,
                    oldInductiveRating, inductiveRating, !oldInductiveRatingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetInductiveRating() {
        Double oldInductiveRating = inductiveRating;
        boolean oldInductiveRatingESet = inductiveRatingESet;
        inductiveRating = INDUCTIVE_RATING_EDEFAULT;
        inductiveRatingESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.STATIC_VAR_COMPENSATOR__INDUCTIVE_RATING, oldInductiveRating, INDUCTIVE_RATING_EDEFAULT,
                    oldInductiveRatingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetInductiveRating() {
        return inductiveRatingESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getSlope() {
        return slope;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSlope( Double newSlope ) {
        Double oldSlope = slope;
        slope = newSlope;
        boolean oldSlopeESet = slopeESet;
        slopeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.STATIC_VAR_COMPENSATOR__SLOPE, oldSlope,
                    slope, !oldSlopeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSlope() {
        Double oldSlope = slope;
        boolean oldSlopeESet = slopeESet;
        slope = SLOPE_EDEFAULT;
        slopeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.STATIC_VAR_COMPENSATOR__SLOPE,
                    oldSlope, SLOPE_EDEFAULT, oldSlopeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSlope() {
        return slopeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVoltageSetPoint() {
        return voltageSetPoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVoltageSetPoint( Double newVoltageSetPoint ) {
        Double oldVoltageSetPoint = voltageSetPoint;
        voltageSetPoint = newVoltageSetPoint;
        boolean oldVoltageSetPointESet = voltageSetPointESet;
        voltageSetPointESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.STATIC_VAR_COMPENSATOR__VOLTAGE_SET_POINT, oldVoltageSetPoint, voltageSetPoint,
                    !oldVoltageSetPointESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVoltageSetPoint() {
        Double oldVoltageSetPoint = voltageSetPoint;
        boolean oldVoltageSetPointESet = voltageSetPointESet;
        voltageSetPoint = VOLTAGE_SET_POINT_EDEFAULT;
        voltageSetPointESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.STATIC_VAR_COMPENSATOR__VOLTAGE_SET_POINT, oldVoltageSetPoint,
                    VOLTAGE_SET_POINT_EDEFAULT, oldVoltageSetPointESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVoltageSetPoint() {
        return voltageSetPointESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public StaticVarCompensatorDynamics getStaticVarCompensatorDynamics() {
        if( staticVarCompensatorDynamics != null && staticVarCompensatorDynamics.eIsProxy() ) {
            InternalEObject oldStaticVarCompensatorDynamics = ( InternalEObject ) staticVarCompensatorDynamics;
            staticVarCompensatorDynamics = ( StaticVarCompensatorDynamics ) eResolveProxy(
                    oldStaticVarCompensatorDynamics );
            if( staticVarCompensatorDynamics != oldStaticVarCompensatorDynamics ) {
                if( eNotificationRequired() )
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                            CimPackage.STATIC_VAR_COMPENSATOR__STATIC_VAR_COMPENSATOR_DYNAMICS,
                            oldStaticVarCompensatorDynamics, staticVarCompensatorDynamics ) );
            }
        }
        return staticVarCompensatorDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StaticVarCompensatorDynamics basicGetStaticVarCompensatorDynamics() {
        return staticVarCompensatorDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetStaticVarCompensatorDynamics(
            StaticVarCompensatorDynamics newStaticVarCompensatorDynamics, NotificationChain msgs ) {
        StaticVarCompensatorDynamics oldStaticVarCompensatorDynamics = staticVarCompensatorDynamics;
        staticVarCompensatorDynamics = newStaticVarCompensatorDynamics;
        boolean oldStaticVarCompensatorDynamicsESet = staticVarCompensatorDynamicsESet;
        staticVarCompensatorDynamicsESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.STATIC_VAR_COMPENSATOR__STATIC_VAR_COMPENSATOR_DYNAMICS, oldStaticVarCompensatorDynamics,
                    newStaticVarCompensatorDynamics, !oldStaticVarCompensatorDynamicsESet );
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
    public void setStaticVarCompensatorDynamics( StaticVarCompensatorDynamics newStaticVarCompensatorDynamics ) {
        if( newStaticVarCompensatorDynamics != staticVarCompensatorDynamics ) {
            NotificationChain msgs = null;
            if( staticVarCompensatorDynamics != null )
                msgs = ( ( InternalEObject ) staticVarCompensatorDynamics ).eInverseRemove( this,
                        CimPackage.STATIC_VAR_COMPENSATOR_DYNAMICS__STATIC_VAR_COMPENSATOR,
                        StaticVarCompensatorDynamics.class, msgs );
            if( newStaticVarCompensatorDynamics != null )
                msgs = ( ( InternalEObject ) newStaticVarCompensatorDynamics ).eInverseAdd( this,
                        CimPackage.STATIC_VAR_COMPENSATOR_DYNAMICS__STATIC_VAR_COMPENSATOR,
                        StaticVarCompensatorDynamics.class, msgs );
            msgs = basicSetStaticVarCompensatorDynamics( newStaticVarCompensatorDynamics, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldStaticVarCompensatorDynamicsESet = staticVarCompensatorDynamicsESet;
            staticVarCompensatorDynamicsESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        CimPackage.STATIC_VAR_COMPENSATOR__STATIC_VAR_COMPENSATOR_DYNAMICS,
                        newStaticVarCompensatorDynamics, newStaticVarCompensatorDynamics,
                        !oldStaticVarCompensatorDynamicsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetStaticVarCompensatorDynamics( NotificationChain msgs ) {
        StaticVarCompensatorDynamics oldStaticVarCompensatorDynamics = staticVarCompensatorDynamics;
        staticVarCompensatorDynamics = null;
        boolean oldStaticVarCompensatorDynamicsESet = staticVarCompensatorDynamicsESet;
        staticVarCompensatorDynamicsESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.STATIC_VAR_COMPENSATOR__STATIC_VAR_COMPENSATOR_DYNAMICS, oldStaticVarCompensatorDynamics,
                    null, oldStaticVarCompensatorDynamicsESet );
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
    public void unsetStaticVarCompensatorDynamics() {
        if( staticVarCompensatorDynamics != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) staticVarCompensatorDynamics ).eInverseRemove( this,
                    CimPackage.STATIC_VAR_COMPENSATOR_DYNAMICS__STATIC_VAR_COMPENSATOR,
                    StaticVarCompensatorDynamics.class, msgs );
            msgs = basicUnsetStaticVarCompensatorDynamics( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldStaticVarCompensatorDynamicsESet = staticVarCompensatorDynamicsESet;
            staticVarCompensatorDynamicsESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.STATIC_VAR_COMPENSATOR__STATIC_VAR_COMPENSATOR_DYNAMICS, null, null,
                        oldStaticVarCompensatorDynamicsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetStaticVarCompensatorDynamics() {
        return staticVarCompensatorDynamicsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getQ() {
        return q;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setQ( Double newQ ) {
        Double oldQ = q;
        q = newQ;
        boolean oldQESet = qESet;
        qESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.STATIC_VAR_COMPENSATOR__Q, oldQ, q,
                    !oldQESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetQ() {
        Double oldQ = q;
        boolean oldQESet = qESet;
        q = Q_EDEFAULT;
        qESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.STATIC_VAR_COMPENSATOR__Q, oldQ,
                    Q_EDEFAULT, oldQESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetQ() {
        return qESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.STATIC_VAR_COMPENSATOR__STATIC_VAR_COMPENSATOR_DYNAMICS:
            if( staticVarCompensatorDynamics != null )
                msgs = ( ( InternalEObject ) staticVarCompensatorDynamics ).eInverseRemove( this,
                        CimPackage.STATIC_VAR_COMPENSATOR_DYNAMICS__STATIC_VAR_COMPENSATOR,
                        StaticVarCompensatorDynamics.class, msgs );
            return basicSetStaticVarCompensatorDynamics( ( StaticVarCompensatorDynamics ) otherEnd, msgs );
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
        case CimPackage.STATIC_VAR_COMPENSATOR__STATIC_VAR_COMPENSATOR_DYNAMICS:
            return basicUnsetStaticVarCompensatorDynamics( msgs );
        }
        return super.eInverseRemove( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SVCControlMode getSVCControlMode() {
        return sVCControlMode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSVCControlMode( SVCControlMode newSVCControlMode ) {
        SVCControlMode oldSVCControlMode = sVCControlMode;
        sVCControlMode = newSVCControlMode == null ? SVC_CONTROL_MODE_EDEFAULT : newSVCControlMode;
        boolean oldSVCControlModeESet = sVCControlModeESet;
        sVCControlModeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.STATIC_VAR_COMPENSATOR__SVC_CONTROL_MODE,
                    oldSVCControlMode, sVCControlMode, !oldSVCControlModeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSVCControlMode() {
        SVCControlMode oldSVCControlMode = sVCControlMode;
        boolean oldSVCControlModeESet = sVCControlModeESet;
        sVCControlMode = SVC_CONTROL_MODE_EDEFAULT;
        sVCControlModeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.STATIC_VAR_COMPENSATOR__SVC_CONTROL_MODE, oldSVCControlMode, SVC_CONTROL_MODE_EDEFAULT,
                    oldSVCControlModeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSVCControlMode() {
        return sVCControlModeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.STATIC_VAR_COMPENSATOR__SVC_CONTROL_MODE:
            return getSVCControlMode();
        case CimPackage.STATIC_VAR_COMPENSATOR__SLOPE:
            return getSlope();
        case CimPackage.STATIC_VAR_COMPENSATOR__INDUCTIVE_RATING:
            return getInductiveRating();
        case CimPackage.STATIC_VAR_COMPENSATOR__CAPACITIVE_RATING:
            return getCapacitiveRating();
        case CimPackage.STATIC_VAR_COMPENSATOR__VOLTAGE_SET_POINT:
            return getVoltageSetPoint();
        case CimPackage.STATIC_VAR_COMPENSATOR__STATIC_VAR_COMPENSATOR_DYNAMICS:
            if( resolve ) return getStaticVarCompensatorDynamics();
            return basicGetStaticVarCompensatorDynamics();
        case CimPackage.STATIC_VAR_COMPENSATOR__Q:
            return getQ();
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
        case CimPackage.STATIC_VAR_COMPENSATOR__SVC_CONTROL_MODE:
            setSVCControlMode( ( SVCControlMode ) newValue );
            return;
        case CimPackage.STATIC_VAR_COMPENSATOR__SLOPE:
            setSlope( ( Double ) newValue );
            return;
        case CimPackage.STATIC_VAR_COMPENSATOR__INDUCTIVE_RATING:
            setInductiveRating( ( Double ) newValue );
            return;
        case CimPackage.STATIC_VAR_COMPENSATOR__CAPACITIVE_RATING:
            setCapacitiveRating( ( Double ) newValue );
            return;
        case CimPackage.STATIC_VAR_COMPENSATOR__VOLTAGE_SET_POINT:
            setVoltageSetPoint( ( Double ) newValue );
            return;
        case CimPackage.STATIC_VAR_COMPENSATOR__STATIC_VAR_COMPENSATOR_DYNAMICS:
            setStaticVarCompensatorDynamics( ( StaticVarCompensatorDynamics ) newValue );
            return;
        case CimPackage.STATIC_VAR_COMPENSATOR__Q:
            setQ( ( Double ) newValue );
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
        case CimPackage.STATIC_VAR_COMPENSATOR__SVC_CONTROL_MODE:
            unsetSVCControlMode();
            return;
        case CimPackage.STATIC_VAR_COMPENSATOR__SLOPE:
            unsetSlope();
            return;
        case CimPackage.STATIC_VAR_COMPENSATOR__INDUCTIVE_RATING:
            unsetInductiveRating();
            return;
        case CimPackage.STATIC_VAR_COMPENSATOR__CAPACITIVE_RATING:
            unsetCapacitiveRating();
            return;
        case CimPackage.STATIC_VAR_COMPENSATOR__VOLTAGE_SET_POINT:
            unsetVoltageSetPoint();
            return;
        case CimPackage.STATIC_VAR_COMPENSATOR__STATIC_VAR_COMPENSATOR_DYNAMICS:
            unsetStaticVarCompensatorDynamics();
            return;
        case CimPackage.STATIC_VAR_COMPENSATOR__Q:
            unsetQ();
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
        case CimPackage.STATIC_VAR_COMPENSATOR__SVC_CONTROL_MODE:
            return isSetSVCControlMode();
        case CimPackage.STATIC_VAR_COMPENSATOR__SLOPE:
            return isSetSlope();
        case CimPackage.STATIC_VAR_COMPENSATOR__INDUCTIVE_RATING:
            return isSetInductiveRating();
        case CimPackage.STATIC_VAR_COMPENSATOR__CAPACITIVE_RATING:
            return isSetCapacitiveRating();
        case CimPackage.STATIC_VAR_COMPENSATOR__VOLTAGE_SET_POINT:
            return isSetVoltageSetPoint();
        case CimPackage.STATIC_VAR_COMPENSATOR__STATIC_VAR_COMPENSATOR_DYNAMICS:
            return isSetStaticVarCompensatorDynamics();
        case CimPackage.STATIC_VAR_COMPENSATOR__Q:
            return isSetQ();
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
        result.append( " (sVCControlMode: " );
        if( sVCControlModeESet )
            result.append( sVCControlMode );
        else
            result.append( "<unset>" );
        result.append( ", slope: " );
        if( slopeESet )
            result.append( slope );
        else
            result.append( "<unset>" );
        result.append( ", inductiveRating: " );
        if( inductiveRatingESet )
            result.append( inductiveRating );
        else
            result.append( "<unset>" );
        result.append( ", capacitiveRating: " );
        if( capacitiveRatingESet )
            result.append( capacitiveRating );
        else
            result.append( "<unset>" );
        result.append( ", voltageSetPoint: " );
        if( voltageSetPointESet )
            result.append( voltageSetPoint );
        else
            result.append( "<unset>" );
        result.append( ", q: " );
        if( qESet )
            result.append( q );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //StaticVarCompensatorImpl

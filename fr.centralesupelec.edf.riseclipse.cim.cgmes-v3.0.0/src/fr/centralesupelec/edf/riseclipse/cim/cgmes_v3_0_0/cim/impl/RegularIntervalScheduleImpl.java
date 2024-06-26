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
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegularIntervalSchedule;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RegularTimePoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Regular Interval Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.RegularIntervalScheduleImpl#getTimeStep <em>Time Step</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.RegularIntervalScheduleImpl#getEndTime <em>End Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.RegularIntervalScheduleImpl#getTimePoints <em>Time Points</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegularIntervalScheduleImpl extends BasicIntervalScheduleImpl implements RegularIntervalSchedule {
    /**
     * The default value of the '{@link #getTimeStep() <em>Time Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeStep()
     * @generated
     * @ordered
     */
    protected static final Double TIME_STEP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTimeStep() <em>Time Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimeStep()
     * @generated
     * @ordered
     */
    protected Double timeStep = TIME_STEP_EDEFAULT;

    /**
     * This is true if the Time Step attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean timeStepESet;

    /**
     * The default value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndTime()
     * @generated
     * @ordered
     */
    protected static final Date END_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndTime()
     * @generated
     * @ordered
     */
    protected Date endTime = END_TIME_EDEFAULT;

    /**
     * This is true if the End Time attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean endTimeESet;

    /**
     * The cached value of the '{@link #getTimePoints() <em>Time Points</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTimePoints()
     * @generated
     * @ordered
     */
    protected EList< RegularTimePoint > timePoints;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RegularIntervalScheduleImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getRegularIntervalSchedule();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< RegularTimePoint > getTimePoints() {
        if( timePoints == null ) {
            timePoints = new EObjectWithInverseResolvingEList.Unsettable< >( RegularTimePoint.class,
                    this, CimPackage.REGULAR_INTERVAL_SCHEDULE__TIME_POINTS,
                    CimPackage.REGULAR_TIME_POINT__INTERVAL_SCHEDULE );
        }
        return timePoints;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTimePoints() {
        if( timePoints != null ) {
            ( ( InternalEList.Unsettable< ? > ) timePoints ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTimePoints() {
        return timePoints != null && ( ( InternalEList.Unsettable< ? > ) timePoints ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTimeStep() {
        return timeStep;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTimeStep( Double newTimeStep ) {
        Double oldTimeStep = timeStep;
        timeStep = newTimeStep;
        boolean oldTimeStepESet = timeStepESet;
        timeStepESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.REGULAR_INTERVAL_SCHEDULE__TIME_STEP,
                    oldTimeStep, timeStep, !oldTimeStepESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTimeStep() {
        Double oldTimeStep = timeStep;
        boolean oldTimeStepESet = timeStepESet;
        timeStep = TIME_STEP_EDEFAULT;
        timeStepESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.REGULAR_INTERVAL_SCHEDULE__TIME_STEP,
                    oldTimeStep, TIME_STEP_EDEFAULT, oldTimeStepESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTimeStep() {
        return timeStepESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Date getEndTime() {
        return endTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEndTime( Date newEndTime ) {
        Date oldEndTime = endTime;
        endTime = newEndTime;
        boolean oldEndTimeESet = endTimeESet;
        endTimeESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.REGULAR_INTERVAL_SCHEDULE__END_TIME,
                    oldEndTime, endTime, !oldEndTimeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEndTime() {
        Date oldEndTime = endTime;
        boolean oldEndTimeESet = endTimeESet;
        endTime = END_TIME_EDEFAULT;
        endTimeESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.REGULAR_INTERVAL_SCHEDULE__END_TIME,
                    oldEndTime, END_TIME_EDEFAULT, oldEndTimeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEndTime() {
        return endTimeESet;
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
        case CimPackage.REGULAR_INTERVAL_SCHEDULE__TIME_POINTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getTimePoints() ).basicAdd( otherEnd,
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
        case CimPackage.REGULAR_INTERVAL_SCHEDULE__TIME_POINTS:
            return ( ( InternalEList< ? > ) getTimePoints() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.REGULAR_INTERVAL_SCHEDULE__TIME_STEP:
            return getTimeStep();
        case CimPackage.REGULAR_INTERVAL_SCHEDULE__END_TIME:
            return getEndTime();
        case CimPackage.REGULAR_INTERVAL_SCHEDULE__TIME_POINTS:
            return getTimePoints();
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
        case CimPackage.REGULAR_INTERVAL_SCHEDULE__TIME_STEP:
            setTimeStep( ( Double ) newValue );
            return;
        case CimPackage.REGULAR_INTERVAL_SCHEDULE__END_TIME:
            setEndTime( ( Date ) newValue );
            return;
        case CimPackage.REGULAR_INTERVAL_SCHEDULE__TIME_POINTS:
            getTimePoints().clear();
            getTimePoints().addAll( ( Collection< ? extends RegularTimePoint > ) newValue );
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
        case CimPackage.REGULAR_INTERVAL_SCHEDULE__TIME_STEP:
            unsetTimeStep();
            return;
        case CimPackage.REGULAR_INTERVAL_SCHEDULE__END_TIME:
            unsetEndTime();
            return;
        case CimPackage.REGULAR_INTERVAL_SCHEDULE__TIME_POINTS:
            unsetTimePoints();
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
        case CimPackage.REGULAR_INTERVAL_SCHEDULE__TIME_STEP:
            return isSetTimeStep();
        case CimPackage.REGULAR_INTERVAL_SCHEDULE__END_TIME:
            return isSetEndTime();
        case CimPackage.REGULAR_INTERVAL_SCHEDULE__TIME_POINTS:
            return isSetTimePoints();
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
        if( eIsProxy() ) {
            return super.toString();
        }

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (timeStep: " );
        if( timeStepESet ) {
            result.append( timeStep );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", endTime: " );
        if( endTimeESet ) {
            result.append( endTime );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ')' );
        return result.toString();
    }

} //RegularIntervalScheduleImpl

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
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCTerminal;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BusNameMarker;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ReportingGroup;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bus Name Marker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.BusNameMarkerImpl#getReportingGroup <em>Reporting Group</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.BusNameMarkerImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.BusNameMarkerImpl#getTerminal <em>Terminal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BusNameMarkerImpl extends IdentifiedObjectImpl implements BusNameMarker {
    /**
     * The cached value of the '{@link #getReportingGroup() <em>Reporting Group</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReportingGroup()
     * @generated
     * @ordered
     */
    protected ReportingGroup reportingGroup;

    /**
     * This is true if the Reporting Group reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean reportingGroupESet;

    /**
     * The default value of the '{@link #getPriority() <em>Priority</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPriority()
     * @generated
     * @ordered
     */
    protected static final BigInteger PRIORITY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPriority() <em>Priority</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPriority()
     * @generated
     * @ordered
     */
    protected BigInteger priority = PRIORITY_EDEFAULT;

    /**
     * This is true if the Priority attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean priorityESet;

    /**
     * The cached value of the '{@link #getTerminal() <em>Terminal</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTerminal()
     * @generated
     * @ordered
     */
    protected EList< ACDCTerminal > terminal;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BusNameMarkerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getBusNameMarker();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ReportingGroup getReportingGroup() {
        return reportingGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetReportingGroup( ReportingGroup newReportingGroup, NotificationChain msgs ) {
        ReportingGroup oldReportingGroup = reportingGroup;
        reportingGroup = newReportingGroup;
        boolean oldReportingGroupESet = reportingGroupESet;
        reportingGroupESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.BUS_NAME_MARKER__REPORTING_GROUP, oldReportingGroup, newReportingGroup,
                    !oldReportingGroupESet );
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
    public void setReportingGroup( ReportingGroup newReportingGroup ) {
        if( newReportingGroup != reportingGroup ) {
            NotificationChain msgs = null;
            if( reportingGroup != null )
                msgs = ( ( InternalEObject ) reportingGroup ).eInverseRemove( this,
                        CimPackage.REPORTING_GROUP__BUS_NAME_MARKER, ReportingGroup.class, msgs );
            if( newReportingGroup != null )
                msgs = ( ( InternalEObject ) newReportingGroup ).eInverseAdd( this,
                        CimPackage.REPORTING_GROUP__BUS_NAME_MARKER, ReportingGroup.class, msgs );
            msgs = basicSetReportingGroup( newReportingGroup, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldReportingGroupESet = reportingGroupESet;
            reportingGroupESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.BUS_NAME_MARKER__REPORTING_GROUP,
                        newReportingGroup, newReportingGroup, !oldReportingGroupESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetReportingGroup( NotificationChain msgs ) {
        ReportingGroup oldReportingGroup = reportingGroup;
        reportingGroup = null;
        boolean oldReportingGroupESet = reportingGroupESet;
        reportingGroupESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.BUS_NAME_MARKER__REPORTING_GROUP, oldReportingGroup, null, oldReportingGroupESet );
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
    public void unsetReportingGroup() {
        if( reportingGroup != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) reportingGroup ).eInverseRemove( this,
                    CimPackage.REPORTING_GROUP__BUS_NAME_MARKER, ReportingGroup.class, msgs );
            msgs = basicUnsetReportingGroup( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldReportingGroupESet = reportingGroupESet;
            reportingGroupESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.BUS_NAME_MARKER__REPORTING_GROUP,
                        null, null, oldReportingGroupESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReportingGroup() {
        return reportingGroupESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ACDCTerminal > getTerminal() {
        if( terminal == null ) {
            terminal = new EObjectWithInverseResolvingEList.Unsettable< >( ACDCTerminal.class, this,
                    CimPackage.BUS_NAME_MARKER__TERMINAL, CimPackage.ACDC_TERMINAL__BUS_NAME_MARKER );
        }
        return terminal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTerminal() {
        if( terminal != null ) ( ( InternalEList.Unsettable< ? > ) terminal ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTerminal() {
        return terminal != null && ( ( InternalEList.Unsettable< ? > ) terminal ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BigInteger getPriority() {
        return priority;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPriority( BigInteger newPriority ) {
        BigInteger oldPriority = priority;
        priority = newPriority;
        boolean oldPriorityESet = priorityESet;
        priorityESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.BUS_NAME_MARKER__PRIORITY, oldPriority,
                    priority, !oldPriorityESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPriority() {
        BigInteger oldPriority = priority;
        boolean oldPriorityESet = priorityESet;
        priority = PRIORITY_EDEFAULT;
        priorityESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.BUS_NAME_MARKER__PRIORITY, oldPriority,
                    PRIORITY_EDEFAULT, oldPriorityESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPriority() {
        return priorityESet;
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
        case CimPackage.BUS_NAME_MARKER__REPORTING_GROUP:
            if( reportingGroup != null )
                msgs = ( ( InternalEObject ) reportingGroup ).eInverseRemove( this,
                        CimPackage.REPORTING_GROUP__BUS_NAME_MARKER, ReportingGroup.class, msgs );
            return basicSetReportingGroup( ( ReportingGroup ) otherEnd, msgs );
        case CimPackage.BUS_NAME_MARKER__TERMINAL:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getTerminal() ).basicAdd( otherEnd,
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
        case CimPackage.BUS_NAME_MARKER__REPORTING_GROUP:
            return basicUnsetReportingGroup( msgs );
        case CimPackage.BUS_NAME_MARKER__TERMINAL:
            return ( ( InternalEList< ? > ) getTerminal() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.BUS_NAME_MARKER__REPORTING_GROUP:
            return getReportingGroup();
        case CimPackage.BUS_NAME_MARKER__PRIORITY:
            return getPriority();
        case CimPackage.BUS_NAME_MARKER__TERMINAL:
            return getTerminal();
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
        case CimPackage.BUS_NAME_MARKER__REPORTING_GROUP:
            setReportingGroup( ( ReportingGroup ) newValue );
            return;
        case CimPackage.BUS_NAME_MARKER__PRIORITY:
            setPriority( ( BigInteger ) newValue );
            return;
        case CimPackage.BUS_NAME_MARKER__TERMINAL:
            getTerminal().clear();
            getTerminal().addAll( ( Collection< ? extends ACDCTerminal > ) newValue );
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
        case CimPackage.BUS_NAME_MARKER__REPORTING_GROUP:
            unsetReportingGroup();
            return;
        case CimPackage.BUS_NAME_MARKER__PRIORITY:
            unsetPriority();
            return;
        case CimPackage.BUS_NAME_MARKER__TERMINAL:
            unsetTerminal();
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
        case CimPackage.BUS_NAME_MARKER__REPORTING_GROUP:
            return isSetReportingGroup();
        case CimPackage.BUS_NAME_MARKER__PRIORITY:
            return isSetPriority();
        case CimPackage.BUS_NAME_MARKER__TERMINAL:
            return isSetTerminal();
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
        result.append( " (priority: " );
        if( priorityESet )
            result.append( priority );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //BusNameMarkerImpl

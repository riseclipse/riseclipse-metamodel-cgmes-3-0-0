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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Control;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Location;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Measurement;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerSystemResource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Power System Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PowerSystemResourceImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PowerSystemResourceImpl#getMeasurements <em>Measurements</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PowerSystemResourceImpl#getControls <em>Controls</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PowerSystemResourceImpl extends IdentifiedObjectImpl implements PowerSystemResource {
    /**
     * The cached value of the '{@link #getLocation() <em>Location</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocation()
     * @generated
     * @ordered
     */
    protected Location location;
    /**
     * This is true if the Location reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean locationESet;
    /**
     * The cached value of the '{@link #getMeasurements() <em>Measurements</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMeasurements()
     * @generated
     * @ordered
     */
    protected EList< Measurement > measurements;
    /**
     * The cached value of the '{@link #getControls() <em>Controls</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getControls()
     * @generated
     * @ordered
     */
    protected EList< Control > controls;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PowerSystemResourceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getPowerSystemResource();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Location getLocation() {
        if( location != null && location.eIsProxy() ) {
            InternalEObject oldLocation = ( InternalEObject ) location;
            location = ( Location ) eResolveProxy( oldLocation );
            if( location != oldLocation ) {
                if( eNotificationRequired() )
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                            CimPackage.POWER_SYSTEM_RESOURCE__LOCATION, oldLocation, location ) );
            }
        }
        return location;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Location basicGetLocation() {
        return location;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLocation( Location newLocation, NotificationChain msgs ) {
        Location oldLocation = location;
        location = newLocation;
        boolean oldLocationESet = locationESet;
        locationESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.POWER_SYSTEM_RESOURCE__LOCATION, oldLocation, newLocation, !oldLocationESet );
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
    public void setLocation( Location newLocation ) {
        if( newLocation != location ) {
            NotificationChain msgs = null;
            if( location != null )
                msgs = ( ( InternalEObject ) location ).eInverseRemove( this,
                        CimPackage.LOCATION__POWER_SYSTEM_RESOURCES, Location.class, msgs );
            if( newLocation != null )
                msgs = ( ( InternalEObject ) newLocation ).eInverseAdd( this,
                        CimPackage.LOCATION__POWER_SYSTEM_RESOURCES, Location.class, msgs );
            msgs = basicSetLocation( newLocation, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldLocationESet = locationESet;
            locationESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.POWER_SYSTEM_RESOURCE__LOCATION,
                        newLocation, newLocation, !oldLocationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetLocation( NotificationChain msgs ) {
        Location oldLocation = location;
        location = null;
        boolean oldLocationESet = locationESet;
        locationESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.POWER_SYSTEM_RESOURCE__LOCATION, oldLocation, null, oldLocationESet );
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
    public void unsetLocation() {
        if( location != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) location ).eInverseRemove( this, CimPackage.LOCATION__POWER_SYSTEM_RESOURCES,
                    Location.class, msgs );
            msgs = basicUnsetLocation( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldLocationESet = locationESet;
            locationESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.POWER_SYSTEM_RESOURCE__LOCATION,
                        null, null, oldLocationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLocation() {
        return locationESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Measurement > getMeasurements() {
        if( measurements == null ) {
            measurements = new EObjectWithInverseResolvingEList.Unsettable< >( Measurement.class, this,
                    CimPackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS, CimPackage.MEASUREMENT__POWER_SYSTEM_RESOURCE );
        }
        return measurements;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMeasurements() {
        if( measurements != null ) ( ( InternalEList.Unsettable< ? > ) measurements ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMeasurements() {
        return measurements != null && ( ( InternalEList.Unsettable< ? > ) measurements ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Control > getControls() {
        if( controls == null ) {
            controls = new EObjectWithInverseResolvingEList.Unsettable< >( Control.class, this,
                    CimPackage.POWER_SYSTEM_RESOURCE__CONTROLS, CimPackage.CONTROL__POWER_SYSTEM_RESOURCE );
        }
        return controls;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetControls() {
        if( controls != null ) ( ( InternalEList.Unsettable< ? > ) controls ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetControls() {
        return controls != null && ( ( InternalEList.Unsettable< ? > ) controls ).isSet();
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
        case CimPackage.POWER_SYSTEM_RESOURCE__LOCATION:
            if( location != null )
                msgs = ( ( InternalEObject ) location ).eInverseRemove( this,
                        CimPackage.LOCATION__POWER_SYSTEM_RESOURCES, Location.class, msgs );
            return basicSetLocation( ( Location ) otherEnd, msgs );
        case CimPackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getMeasurements() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.POWER_SYSTEM_RESOURCE__CONTROLS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getControls() ).basicAdd( otherEnd,
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
        case CimPackage.POWER_SYSTEM_RESOURCE__LOCATION:
            return basicUnsetLocation( msgs );
        case CimPackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS:
            return ( ( InternalEList< ? > ) getMeasurements() ).basicRemove( otherEnd, msgs );
        case CimPackage.POWER_SYSTEM_RESOURCE__CONTROLS:
            return ( ( InternalEList< ? > ) getControls() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.POWER_SYSTEM_RESOURCE__LOCATION:
            if( resolve ) return getLocation();
            return basicGetLocation();
        case CimPackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS:
            return getMeasurements();
        case CimPackage.POWER_SYSTEM_RESOURCE__CONTROLS:
            return getControls();
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
        case CimPackage.POWER_SYSTEM_RESOURCE__LOCATION:
            setLocation( ( Location ) newValue );
            return;
        case CimPackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS:
            getMeasurements().clear();
            getMeasurements().addAll( ( Collection< ? extends Measurement > ) newValue );
            return;
        case CimPackage.POWER_SYSTEM_RESOURCE__CONTROLS:
            getControls().clear();
            getControls().addAll( ( Collection< ? extends Control > ) newValue );
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
        case CimPackage.POWER_SYSTEM_RESOURCE__LOCATION:
            unsetLocation();
            return;
        case CimPackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS:
            unsetMeasurements();
            return;
        case CimPackage.POWER_SYSTEM_RESOURCE__CONTROLS:
            unsetControls();
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
        case CimPackage.POWER_SYSTEM_RESOURCE__LOCATION:
            return isSetLocation();
        case CimPackage.POWER_SYSTEM_RESOURCE__MEASUREMENTS:
            return isSetMeasurements();
        case CimPackage.POWER_SYSTEM_RESOURCE__CONTROLS:
            return isSetControls();
        }
        return super.eIsSet( featureID );
    }

} //PowerSystemResourceImpl

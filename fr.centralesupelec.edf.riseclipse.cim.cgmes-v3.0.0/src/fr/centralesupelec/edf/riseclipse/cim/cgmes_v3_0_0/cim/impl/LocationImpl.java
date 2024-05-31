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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CoordinateSystem;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Location;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PositionPoint;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerSystemResource;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StreetAddress;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.LocationImpl#getCoordinateSystem <em>Coordinate System</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.LocationImpl#getPowerSystemResources <em>Power System Resources</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.LocationImpl#getPositionPoints <em>Position Points</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.LocationImpl#getMainAddress <em>Main Address</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocationImpl extends IdentifiedObjectImpl implements Location {
    /**
     * The cached value of the '{@link #getCoordinateSystem() <em>Coordinate System</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCoordinateSystem()
     * @generated
     * @ordered
     */
    protected CoordinateSystem coordinateSystem;

    /**
     * This is true if the Coordinate System reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean coordinateSystemESet;

    /**
     * The cached value of the '{@link #getPowerSystemResources() <em>Power System Resources</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPowerSystemResources()
     * @generated
     * @ordered
     */
    protected PowerSystemResource powerSystemResources;

    /**
     * This is true if the Power System Resources reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean powerSystemResourcesESet;

    /**
     * The cached value of the '{@link #getPositionPoints() <em>Position Points</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPositionPoints()
     * @generated
     * @ordered
     */
    protected EList< PositionPoint > positionPoints;

    /**
     * The cached value of the '{@link #getMainAddress() <em>Main Address</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMainAddress()
     * @generated
     * @ordered
     */
    protected StreetAddress mainAddress;

    /**
     * This is true if the Main Address reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean mainAddressESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LocationImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getLocation();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CoordinateSystem getCoordinateSystem() {
        return coordinateSystem;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCoordinateSystem( CoordinateSystem newCoordinateSystem, NotificationChain msgs ) {
        CoordinateSystem oldCoordinateSystem = coordinateSystem;
        coordinateSystem = newCoordinateSystem;
        boolean oldCoordinateSystemESet = coordinateSystemESet;
        coordinateSystemESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.LOCATION__COORDINATE_SYSTEM, oldCoordinateSystem, newCoordinateSystem,
                    !oldCoordinateSystemESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCoordinateSystem( CoordinateSystem newCoordinateSystem ) {
        if( newCoordinateSystem != coordinateSystem ) {
            NotificationChain msgs = null;
            if( coordinateSystem != null ) {
                msgs = ( ( InternalEObject ) coordinateSystem ).eInverseRemove( this,
                        CimPackage.COORDINATE_SYSTEM__LOCATIONS, CoordinateSystem.class, msgs );
            }
            if( newCoordinateSystem != null ) {
                msgs = ( ( InternalEObject ) newCoordinateSystem ).eInverseAdd( this,
                        CimPackage.COORDINATE_SYSTEM__LOCATIONS, CoordinateSystem.class, msgs );
            }
            msgs = basicSetCoordinateSystem( newCoordinateSystem, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldCoordinateSystemESet = coordinateSystemESet;
            coordinateSystemESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.LOCATION__COORDINATE_SYSTEM,
                        newCoordinateSystem, newCoordinateSystem, !oldCoordinateSystemESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetCoordinateSystem( NotificationChain msgs ) {
        CoordinateSystem oldCoordinateSystem = coordinateSystem;
        coordinateSystem = null;
        boolean oldCoordinateSystemESet = coordinateSystemESet;
        coordinateSystemESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.LOCATION__COORDINATE_SYSTEM, oldCoordinateSystem, null, oldCoordinateSystemESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCoordinateSystem() {
        if( coordinateSystem != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) coordinateSystem ).eInverseRemove( this,
                    CimPackage.COORDINATE_SYSTEM__LOCATIONS, CoordinateSystem.class, msgs );
            msgs = basicUnsetCoordinateSystem( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldCoordinateSystemESet = coordinateSystemESet;
            coordinateSystemESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.LOCATION__COORDINATE_SYSTEM, null,
                        null, oldCoordinateSystemESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCoordinateSystem() {
        return coordinateSystemESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PowerSystemResource getPowerSystemResources() {
        return powerSystemResources;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPowerSystemResources( PowerSystemResource newPowerSystemResources,
            NotificationChain msgs ) {
        PowerSystemResource oldPowerSystemResources = powerSystemResources;
        powerSystemResources = newPowerSystemResources;
        boolean oldPowerSystemResourcesESet = powerSystemResourcesESet;
        powerSystemResourcesESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.LOCATION__POWER_SYSTEM_RESOURCES, oldPowerSystemResources, newPowerSystemResources,
                    !oldPowerSystemResourcesESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPowerSystemResources( PowerSystemResource newPowerSystemResources ) {
        if( newPowerSystemResources != powerSystemResources ) {
            NotificationChain msgs = null;
            if( powerSystemResources != null ) {
                msgs = ( ( InternalEObject ) powerSystemResources ).eInverseRemove( this,
                        CimPackage.POWER_SYSTEM_RESOURCE__LOCATION, PowerSystemResource.class, msgs );
            }
            if( newPowerSystemResources != null ) {
                msgs = ( ( InternalEObject ) newPowerSystemResources ).eInverseAdd( this,
                        CimPackage.POWER_SYSTEM_RESOURCE__LOCATION, PowerSystemResource.class, msgs );
            }
            msgs = basicSetPowerSystemResources( newPowerSystemResources, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldPowerSystemResourcesESet = powerSystemResourcesESet;
            powerSystemResourcesESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.LOCATION__POWER_SYSTEM_RESOURCES,
                        newPowerSystemResources, newPowerSystemResources, !oldPowerSystemResourcesESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetPowerSystemResources( NotificationChain msgs ) {
        PowerSystemResource oldPowerSystemResources = powerSystemResources;
        powerSystemResources = null;
        boolean oldPowerSystemResourcesESet = powerSystemResourcesESet;
        powerSystemResourcesESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.LOCATION__POWER_SYSTEM_RESOURCES, oldPowerSystemResources, null,
                    oldPowerSystemResourcesESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPowerSystemResources() {
        if( powerSystemResources != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) powerSystemResources ).eInverseRemove( this,
                    CimPackage.POWER_SYSTEM_RESOURCE__LOCATION, PowerSystemResource.class, msgs );
            msgs = basicUnsetPowerSystemResources( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldPowerSystemResourcesESet = powerSystemResourcesESet;
            powerSystemResourcesESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.LOCATION__POWER_SYSTEM_RESOURCES,
                        null, null, oldPowerSystemResourcesESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPowerSystemResources() {
        return powerSystemResourcesESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< PositionPoint > getPositionPoints() {
        if( positionPoints == null ) {
            positionPoints = new EObjectWithInverseResolvingEList.Unsettable< >( PositionPoint.class,
                    this, CimPackage.LOCATION__POSITION_POINTS, CimPackage.POSITION_POINT__LOCATION );
        }
        return positionPoints;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPositionPoints() {
        if( positionPoints != null ) {
            ( ( InternalEList.Unsettable< ? > ) positionPoints ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPositionPoints() {
        return positionPoints != null && ( ( InternalEList.Unsettable< ? > ) positionPoints ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public StreetAddress getMainAddress() {
        if( mainAddress != null && mainAddress.eIsProxy() ) {
            InternalEObject oldMainAddress = ( InternalEObject ) mainAddress;
            mainAddress = ( StreetAddress ) eResolveProxy( oldMainAddress );
            if( mainAddress != oldMainAddress ) {
                if( eNotificationRequired() ) {
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE, CimPackage.LOCATION__MAIN_ADDRESS,
                            oldMainAddress, mainAddress ) );
                }
            }
        }
        return mainAddress;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StreetAddress basicGetMainAddress() {
        return mainAddress;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMainAddress( StreetAddress newMainAddress ) {
        StreetAddress oldMainAddress = mainAddress;
        mainAddress = newMainAddress;
        boolean oldMainAddressESet = mainAddressESet;
        mainAddressESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.LOCATION__MAIN_ADDRESS, oldMainAddress,
                    mainAddress, !oldMainAddressESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMainAddress() {
        StreetAddress oldMainAddress = mainAddress;
        boolean oldMainAddressESet = mainAddressESet;
        mainAddress = null;
        mainAddressESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.LOCATION__MAIN_ADDRESS, oldMainAddress,
                    null, oldMainAddressESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMainAddress() {
        return mainAddressESet;
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
        case CimPackage.LOCATION__COORDINATE_SYSTEM:
            if( coordinateSystem != null ) {
                msgs = ( ( InternalEObject ) coordinateSystem ).eInverseRemove( this,
                        CimPackage.COORDINATE_SYSTEM__LOCATIONS, CoordinateSystem.class, msgs );
            }
            return basicSetCoordinateSystem( ( CoordinateSystem ) otherEnd, msgs );
        case CimPackage.LOCATION__POWER_SYSTEM_RESOURCES:
            if( powerSystemResources != null ) {
                msgs = ( ( InternalEObject ) powerSystemResources ).eInverseRemove( this,
                        CimPackage.POWER_SYSTEM_RESOURCE__LOCATION, PowerSystemResource.class, msgs );
            }
            return basicSetPowerSystemResources( ( PowerSystemResource ) otherEnd, msgs );
        case CimPackage.LOCATION__POSITION_POINTS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getPositionPoints() )
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
        case CimPackage.LOCATION__COORDINATE_SYSTEM:
            return basicUnsetCoordinateSystem( msgs );
        case CimPackage.LOCATION__POWER_SYSTEM_RESOURCES:
            return basicUnsetPowerSystemResources( msgs );
        case CimPackage.LOCATION__POSITION_POINTS:
            return ( ( InternalEList< ? > ) getPositionPoints() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.LOCATION__COORDINATE_SYSTEM:
            return getCoordinateSystem();
        case CimPackage.LOCATION__POWER_SYSTEM_RESOURCES:
            return getPowerSystemResources();
        case CimPackage.LOCATION__POSITION_POINTS:
            return getPositionPoints();
        case CimPackage.LOCATION__MAIN_ADDRESS:
            if( resolve ) {
                return getMainAddress();
            }
            return basicGetMainAddress();
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
        case CimPackage.LOCATION__COORDINATE_SYSTEM:
            setCoordinateSystem( ( CoordinateSystem ) newValue );
            return;
        case CimPackage.LOCATION__POWER_SYSTEM_RESOURCES:
            setPowerSystemResources( ( PowerSystemResource ) newValue );
            return;
        case CimPackage.LOCATION__POSITION_POINTS:
            getPositionPoints().clear();
            getPositionPoints().addAll( ( Collection< ? extends PositionPoint > ) newValue );
            return;
        case CimPackage.LOCATION__MAIN_ADDRESS:
            setMainAddress( ( StreetAddress ) newValue );
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
        case CimPackage.LOCATION__COORDINATE_SYSTEM:
            unsetCoordinateSystem();
            return;
        case CimPackage.LOCATION__POWER_SYSTEM_RESOURCES:
            unsetPowerSystemResources();
            return;
        case CimPackage.LOCATION__POSITION_POINTS:
            unsetPositionPoints();
            return;
        case CimPackage.LOCATION__MAIN_ADDRESS:
            unsetMainAddress();
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
        case CimPackage.LOCATION__COORDINATE_SYSTEM:
            return isSetCoordinateSystem();
        case CimPackage.LOCATION__POWER_SYSTEM_RESOURCES:
            return isSetPowerSystemResources();
        case CimPackage.LOCATION__POSITION_POINTS:
            return isSetPositionPoints();
        case CimPackage.LOCATION__MAIN_ADDRESS:
            return isSetMainAddress();
        }
        return super.eIsSet( featureID );
    }

} //LocationImpl

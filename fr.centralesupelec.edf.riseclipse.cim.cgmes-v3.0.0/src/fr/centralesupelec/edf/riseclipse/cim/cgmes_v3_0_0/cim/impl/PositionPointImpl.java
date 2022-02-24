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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Location;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PositionPoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Position Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PositionPointImpl#getXPosition <em>XPosition</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PositionPointImpl#getZPosition <em>ZPosition</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PositionPointImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PositionPointImpl#getYPosition <em>YPosition</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PositionPointImpl#getSequenceNumber <em>Sequence Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PositionPointImpl extends CimObjectWithIDImpl implements PositionPoint {
    /**
     * The default value of the '{@link #getXPosition() <em>XPosition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXPosition()
     * @generated
     * @ordered
     */
    protected static final String XPOSITION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getXPosition() <em>XPosition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXPosition()
     * @generated
     * @ordered
     */
    protected String xPosition = XPOSITION_EDEFAULT;

    /**
     * This is true if the XPosition attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xPositionESet;

    /**
     * The default value of the '{@link #getZPosition() <em>ZPosition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getZPosition()
     * @generated
     * @ordered
     */
    protected static final String ZPOSITION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getZPosition() <em>ZPosition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getZPosition()
     * @generated
     * @ordered
     */
    protected String zPosition = ZPOSITION_EDEFAULT;

    /**
     * This is true if the ZPosition attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean zPositionESet;

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
     * The default value of the '{@link #getYPosition() <em>YPosition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getYPosition()
     * @generated
     * @ordered
     */
    protected static final String YPOSITION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getYPosition() <em>YPosition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getYPosition()
     * @generated
     * @ordered
     */
    protected String yPosition = YPOSITION_EDEFAULT;

    /**
     * This is true if the YPosition attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean yPositionESet;

    /**
     * The default value of the '{@link #getSequenceNumber() <em>Sequence Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSequenceNumber()
     * @generated
     * @ordered
     */
    protected static final BigInteger SEQUENCE_NUMBER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSequenceNumber() <em>Sequence Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSequenceNumber()
     * @generated
     * @ordered
     */
    protected BigInteger sequenceNumber = SEQUENCE_NUMBER_EDEFAULT;

    /**
     * This is true if the Sequence Number attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sequenceNumberESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PositionPointImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getPositionPoint();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getXPosition() {
        return xPosition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setXPosition( String newXPosition ) {
        String oldXPosition = xPosition;
        xPosition = newXPosition;
        boolean oldXPositionESet = xPositionESet;
        xPositionESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.POSITION_POINT__XPOSITION, oldXPosition,
                    xPosition, !oldXPositionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetXPosition() {
        String oldXPosition = xPosition;
        boolean oldXPositionESet = xPositionESet;
        xPosition = XPOSITION_EDEFAULT;
        xPositionESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.POSITION_POINT__XPOSITION,
                    oldXPosition, XPOSITION_EDEFAULT, oldXPositionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetXPosition() {
        return xPositionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getZPosition() {
        return zPosition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setZPosition( String newZPosition ) {
        String oldZPosition = zPosition;
        zPosition = newZPosition;
        boolean oldZPositionESet = zPositionESet;
        zPositionESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.POSITION_POINT__ZPOSITION, oldZPosition,
                    zPosition, !oldZPositionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetZPosition() {
        String oldZPosition = zPosition;
        boolean oldZPositionESet = zPositionESet;
        zPosition = ZPOSITION_EDEFAULT;
        zPositionESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.POSITION_POINT__ZPOSITION,
                    oldZPosition, ZPOSITION_EDEFAULT, oldZPositionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetZPosition() {
        return zPositionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Location getLocation() {
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
                    CimPackage.POSITION_POINT__LOCATION, oldLocation, newLocation, !oldLocationESet );
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
                msgs = ( ( InternalEObject ) location ).eInverseRemove( this, CimPackage.LOCATION__POSITION_POINTS,
                        Location.class, msgs );
            if( newLocation != null )
                msgs = ( ( InternalEObject ) newLocation ).eInverseAdd( this, CimPackage.LOCATION__POSITION_POINTS,
                        Location.class, msgs );
            msgs = basicSetLocation( newLocation, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldLocationESet = locationESet;
            locationESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.POSITION_POINT__LOCATION,
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
                    CimPackage.POSITION_POINT__LOCATION, oldLocation, null, oldLocationESet );
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
            msgs = ( ( InternalEObject ) location ).eInverseRemove( this, CimPackage.LOCATION__POSITION_POINTS,
                    Location.class, msgs );
            msgs = basicUnsetLocation( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldLocationESet = locationESet;
            locationESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.POSITION_POINT__LOCATION, null,
                        null, oldLocationESet ) );
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
    public String getYPosition() {
        return yPosition;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setYPosition( String newYPosition ) {
        String oldYPosition = yPosition;
        yPosition = newYPosition;
        boolean oldYPositionESet = yPositionESet;
        yPositionESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.POSITION_POINT__YPOSITION, oldYPosition,
                    yPosition, !oldYPositionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetYPosition() {
        String oldYPosition = yPosition;
        boolean oldYPositionESet = yPositionESet;
        yPosition = YPOSITION_EDEFAULT;
        yPositionESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.POSITION_POINT__YPOSITION,
                    oldYPosition, YPOSITION_EDEFAULT, oldYPositionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetYPosition() {
        return yPositionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BigInteger getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSequenceNumber( BigInteger newSequenceNumber ) {
        BigInteger oldSequenceNumber = sequenceNumber;
        sequenceNumber = newSequenceNumber;
        boolean oldSequenceNumberESet = sequenceNumberESet;
        sequenceNumberESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.POSITION_POINT__SEQUENCE_NUMBER,
                    oldSequenceNumber, sequenceNumber, !oldSequenceNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSequenceNumber() {
        BigInteger oldSequenceNumber = sequenceNumber;
        boolean oldSequenceNumberESet = sequenceNumberESet;
        sequenceNumber = SEQUENCE_NUMBER_EDEFAULT;
        sequenceNumberESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.POSITION_POINT__SEQUENCE_NUMBER,
                    oldSequenceNumber, SEQUENCE_NUMBER_EDEFAULT, oldSequenceNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSequenceNumber() {
        return sequenceNumberESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.POSITION_POINT__LOCATION:
            if( location != null )
                msgs = ( ( InternalEObject ) location ).eInverseRemove( this, CimPackage.LOCATION__POSITION_POINTS,
                        Location.class, msgs );
            return basicSetLocation( ( Location ) otherEnd, msgs );
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
        case CimPackage.POSITION_POINT__LOCATION:
            return basicUnsetLocation( msgs );
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
        case CimPackage.POSITION_POINT__XPOSITION:
            return getXPosition();
        case CimPackage.POSITION_POINT__ZPOSITION:
            return getZPosition();
        case CimPackage.POSITION_POINT__LOCATION:
            return getLocation();
        case CimPackage.POSITION_POINT__YPOSITION:
            return getYPosition();
        case CimPackage.POSITION_POINT__SEQUENCE_NUMBER:
            return getSequenceNumber();
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
        case CimPackage.POSITION_POINT__XPOSITION:
            setXPosition( ( String ) newValue );
            return;
        case CimPackage.POSITION_POINT__ZPOSITION:
            setZPosition( ( String ) newValue );
            return;
        case CimPackage.POSITION_POINT__LOCATION:
            setLocation( ( Location ) newValue );
            return;
        case CimPackage.POSITION_POINT__YPOSITION:
            setYPosition( ( String ) newValue );
            return;
        case CimPackage.POSITION_POINT__SEQUENCE_NUMBER:
            setSequenceNumber( ( BigInteger ) newValue );
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
        case CimPackage.POSITION_POINT__XPOSITION:
            unsetXPosition();
            return;
        case CimPackage.POSITION_POINT__ZPOSITION:
            unsetZPosition();
            return;
        case CimPackage.POSITION_POINT__LOCATION:
            unsetLocation();
            return;
        case CimPackage.POSITION_POINT__YPOSITION:
            unsetYPosition();
            return;
        case CimPackage.POSITION_POINT__SEQUENCE_NUMBER:
            unsetSequenceNumber();
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
        case CimPackage.POSITION_POINT__XPOSITION:
            return isSetXPosition();
        case CimPackage.POSITION_POINT__ZPOSITION:
            return isSetZPosition();
        case CimPackage.POSITION_POINT__LOCATION:
            return isSetLocation();
        case CimPackage.POSITION_POINT__YPOSITION:
            return isSetYPosition();
        case CimPackage.POSITION_POINT__SEQUENCE_NUMBER:
            return isSetSequenceNumber();
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
        result.append( " (xPosition: " );
        if( xPositionESet )
            result.append( xPosition );
        else
            result.append( "<unset>" );
        result.append( ", zPosition: " );
        if( zPositionESet )
            result.append( zPosition );
        else
            result.append( "<unset>" );
        result.append( ", yPosition: " );
        if( yPositionESet )
            result.append( yPosition );
        else
            result.append( "<unset>" );
        result.append( ", sequenceNumber: " );
        if( sequenceNumberESet )
            result.append( sequenceNumber );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //PositionPointImpl

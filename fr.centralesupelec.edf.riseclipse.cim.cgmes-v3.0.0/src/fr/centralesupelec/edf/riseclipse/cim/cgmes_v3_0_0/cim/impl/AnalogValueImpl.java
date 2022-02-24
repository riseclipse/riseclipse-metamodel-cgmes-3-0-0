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

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Analog;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AnalogControl;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AnalogValue;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Analog Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.AnalogValueImpl#getAnalog <em>Analog</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.AnalogValueImpl#getAnalogControl <em>Analog Control</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnalogValueImpl extends MeasurementValueImpl implements AnalogValue {
    /**
     * The cached value of the '{@link #getAnalog() <em>Analog</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAnalog()
     * @generated
     * @ordered
     */
    protected Analog analog;

    /**
     * This is true if the Analog reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean analogESet;

    /**
     * The cached value of the '{@link #getAnalogControl() <em>Analog Control</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAnalogControl()
     * @generated
     * @ordered
     */
    protected AnalogControl analogControl;

    /**
     * This is true if the Analog Control reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean analogControlESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AnalogValueImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getAnalogValue();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Analog getAnalog() {
        return analog;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAnalog( Analog newAnalog, NotificationChain msgs ) {
        Analog oldAnalog = analog;
        analog = newAnalog;
        boolean oldAnalogESet = analogESet;
        analogESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ANALOG_VALUE__ANALOG, oldAnalog, newAnalog, !oldAnalogESet );
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
    public void setAnalog( Analog newAnalog ) {
        if( newAnalog != analog ) {
            NotificationChain msgs = null;
            if( analog != null )
                msgs = ( ( InternalEObject ) analog ).eInverseRemove( this, CimPackage.ANALOG__ANALOG_VALUES,
                        Analog.class, msgs );
            if( newAnalog != null )
                msgs = ( ( InternalEObject ) newAnalog ).eInverseAdd( this, CimPackage.ANALOG__ANALOG_VALUES,
                        Analog.class, msgs );
            msgs = basicSetAnalog( newAnalog, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAnalogESet = analogESet;
            analogESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ANALOG_VALUE__ANALOG, newAnalog,
                        newAnalog, !oldAnalogESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetAnalog( NotificationChain msgs ) {
        Analog oldAnalog = analog;
        analog = null;
        boolean oldAnalogESet = analogESet;
        analogESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ANALOG_VALUE__ANALOG, oldAnalog, null, oldAnalogESet );
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
    public void unsetAnalog() {
        if( analog != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) analog ).eInverseRemove( this, CimPackage.ANALOG__ANALOG_VALUES, Analog.class,
                    msgs );
            msgs = basicUnsetAnalog( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAnalogESet = analogESet;
            analogESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ANALOG_VALUE__ANALOG, null, null,
                        oldAnalogESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAnalog() {
        return analogESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AnalogControl getAnalogControl() {
        if( analogControl != null && analogControl.eIsProxy() ) {
            InternalEObject oldAnalogControl = ( InternalEObject ) analogControl;
            analogControl = ( AnalogControl ) eResolveProxy( oldAnalogControl );
            if( analogControl != oldAnalogControl ) {
                if( eNotificationRequired() )
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE, CimPackage.ANALOG_VALUE__ANALOG_CONTROL,
                            oldAnalogControl, analogControl ) );
            }
        }
        return analogControl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AnalogControl basicGetAnalogControl() {
        return analogControl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAnalogControl( AnalogControl newAnalogControl, NotificationChain msgs ) {
        AnalogControl oldAnalogControl = analogControl;
        analogControl = newAnalogControl;
        boolean oldAnalogControlESet = analogControlESet;
        analogControlESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ANALOG_VALUE__ANALOG_CONTROL, oldAnalogControl, newAnalogControl,
                    !oldAnalogControlESet );
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
    public void setAnalogControl( AnalogControl newAnalogControl ) {
        if( newAnalogControl != analogControl ) {
            NotificationChain msgs = null;
            if( analogControl != null )
                msgs = ( ( InternalEObject ) analogControl ).eInverseRemove( this,
                        CimPackage.ANALOG_CONTROL__ANALOG_VALUE, AnalogControl.class, msgs );
            if( newAnalogControl != null )
                msgs = ( ( InternalEObject ) newAnalogControl ).eInverseAdd( this,
                        CimPackage.ANALOG_CONTROL__ANALOG_VALUE, AnalogControl.class, msgs );
            msgs = basicSetAnalogControl( newAnalogControl, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAnalogControlESet = analogControlESet;
            analogControlESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ANALOG_VALUE__ANALOG_CONTROL,
                        newAnalogControl, newAnalogControl, !oldAnalogControlESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetAnalogControl( NotificationChain msgs ) {
        AnalogControl oldAnalogControl = analogControl;
        analogControl = null;
        boolean oldAnalogControlESet = analogControlESet;
        analogControlESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ANALOG_VALUE__ANALOG_CONTROL, oldAnalogControl, null, oldAnalogControlESet );
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
    public void unsetAnalogControl() {
        if( analogControl != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) analogControl ).eInverseRemove( this, CimPackage.ANALOG_CONTROL__ANALOG_VALUE,
                    AnalogControl.class, msgs );
            msgs = basicUnsetAnalogControl( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAnalogControlESet = analogControlESet;
            analogControlESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ANALOG_VALUE__ANALOG_CONTROL, null,
                        null, oldAnalogControlESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAnalogControl() {
        return analogControlESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.ANALOG_VALUE__ANALOG:
            if( analog != null )
                msgs = ( ( InternalEObject ) analog ).eInverseRemove( this, CimPackage.ANALOG__ANALOG_VALUES,
                        Analog.class, msgs );
            return basicSetAnalog( ( Analog ) otherEnd, msgs );
        case CimPackage.ANALOG_VALUE__ANALOG_CONTROL:
            if( analogControl != null )
                msgs = ( ( InternalEObject ) analogControl ).eInverseRemove( this,
                        CimPackage.ANALOG_CONTROL__ANALOG_VALUE, AnalogControl.class, msgs );
            return basicSetAnalogControl( ( AnalogControl ) otherEnd, msgs );
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
        case CimPackage.ANALOG_VALUE__ANALOG:
            return basicUnsetAnalog( msgs );
        case CimPackage.ANALOG_VALUE__ANALOG_CONTROL:
            return basicUnsetAnalogControl( msgs );
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
        case CimPackage.ANALOG_VALUE__ANALOG:
            return getAnalog();
        case CimPackage.ANALOG_VALUE__ANALOG_CONTROL:
            if( resolve ) return getAnalogControl();
            return basicGetAnalogControl();
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
        case CimPackage.ANALOG_VALUE__ANALOG:
            setAnalog( ( Analog ) newValue );
            return;
        case CimPackage.ANALOG_VALUE__ANALOG_CONTROL:
            setAnalogControl( ( AnalogControl ) newValue );
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
        case CimPackage.ANALOG_VALUE__ANALOG:
            unsetAnalog();
            return;
        case CimPackage.ANALOG_VALUE__ANALOG_CONTROL:
            unsetAnalogControl();
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
        case CimPackage.ANALOG_VALUE__ANALOG:
            return isSetAnalog();
        case CimPackage.ANALOG_VALUE__ANALOG_CONTROL:
            return isSetAnalogControl();
        }
        return super.eIsSet( featureID );
    }

} //AnalogValueImpl

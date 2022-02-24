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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvSwitch;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Switch;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sv Switch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.SvSwitchImpl#getSwitch <em>Switch</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.SvSwitchImpl#getOpen <em>Open</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SvSwitchImpl extends CimObjectWithIDImpl implements SvSwitch {
    /**
     * The cached value of the '{@link #getSwitch() <em>Switch</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSwitch()
     * @generated
     * @ordered
     */
    protected Switch switch_;

    /**
     * This is true if the Switch reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean switchESet;

    /**
     * The default value of the '{@link #getOpen() <em>Open</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOpen()
     * @generated
     * @ordered
     */
    protected static final Boolean OPEN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOpen() <em>Open</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOpen()
     * @generated
     * @ordered
     */
    protected Boolean open = OPEN_EDEFAULT;

    /**
     * This is true if the Open attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean openESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SvSwitchImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getSvSwitch();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Switch getSwitch() {
        return switch_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSwitch( Switch newSwitch, NotificationChain msgs ) {
        Switch oldSwitch = switch_;
        switch_ = newSwitch;
        boolean oldSwitchESet = switchESet;
        switchESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.SV_SWITCH__SWITCH, oldSwitch, newSwitch, !oldSwitchESet );
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
    public void setSwitch( Switch newSwitch ) {
        if( newSwitch != switch_ ) {
            NotificationChain msgs = null;
            if( switch_ != null )
                msgs = ( ( InternalEObject ) switch_ ).eInverseRemove( this, CimPackage.SWITCH__SV_SWITCH, Switch.class,
                        msgs );
            if( newSwitch != null )
                msgs = ( ( InternalEObject ) newSwitch ).eInverseAdd( this, CimPackage.SWITCH__SV_SWITCH, Switch.class,
                        msgs );
            msgs = basicSetSwitch( newSwitch, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSwitchESet = switchESet;
            switchESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SV_SWITCH__SWITCH, newSwitch,
                        newSwitch, !oldSwitchESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetSwitch( NotificationChain msgs ) {
        Switch oldSwitch = switch_;
        switch_ = null;
        boolean oldSwitchESet = switchESet;
        switchESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SV_SWITCH__SWITCH, oldSwitch, null, oldSwitchESet );
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
    public void unsetSwitch() {
        if( switch_ != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) switch_ ).eInverseRemove( this, CimPackage.SWITCH__SV_SWITCH, Switch.class,
                    msgs );
            msgs = basicUnsetSwitch( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSwitchESet = switchESet;
            switchESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SV_SWITCH__SWITCH, null, null,
                        oldSwitchESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSwitch() {
        return switchESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getOpen() {
        return open;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOpen( Boolean newOpen ) {
        Boolean oldOpen = open;
        open = newOpen;
        boolean oldOpenESet = openESet;
        openESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SV_SWITCH__OPEN, oldOpen, open,
                    !oldOpenESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOpen() {
        Boolean oldOpen = open;
        boolean oldOpenESet = openESet;
        open = OPEN_EDEFAULT;
        openESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SV_SWITCH__OPEN, oldOpen,
                    OPEN_EDEFAULT, oldOpenESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOpen() {
        return openESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.SV_SWITCH__SWITCH:
            if( switch_ != null )
                msgs = ( ( InternalEObject ) switch_ ).eInverseRemove( this, CimPackage.SWITCH__SV_SWITCH, Switch.class,
                        msgs );
            return basicSetSwitch( ( Switch ) otherEnd, msgs );
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
        case CimPackage.SV_SWITCH__SWITCH:
            return basicUnsetSwitch( msgs );
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
        case CimPackage.SV_SWITCH__SWITCH:
            return getSwitch();
        case CimPackage.SV_SWITCH__OPEN:
            return getOpen();
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
        case CimPackage.SV_SWITCH__SWITCH:
            setSwitch( ( Switch ) newValue );
            return;
        case CimPackage.SV_SWITCH__OPEN:
            setOpen( ( Boolean ) newValue );
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
        case CimPackage.SV_SWITCH__SWITCH:
            unsetSwitch();
            return;
        case CimPackage.SV_SWITCH__OPEN:
            unsetOpen();
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
        case CimPackage.SV_SWITCH__SWITCH:
            return isSetSwitch();
        case CimPackage.SV_SWITCH__OPEN:
            return isSetOpen();
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
        result.append( " (open: " );
        if( openESet )
            result.append( open );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //SvSwitchImpl

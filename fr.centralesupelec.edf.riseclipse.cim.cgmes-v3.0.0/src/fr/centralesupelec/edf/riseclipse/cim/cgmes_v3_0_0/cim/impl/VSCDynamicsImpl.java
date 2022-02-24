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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VSCDynamics;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VSC Dynamics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.VSCDynamicsImpl#getVsConverter <em>Vs Converter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VSCDynamicsImpl extends HVDCDynamicsImpl implements VSCDynamics {
    /**
     * The cached value of the '{@link #getVsConverter() <em>Vs Converter</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVsConverter()
     * @generated
     * @ordered
     */
    protected VsConverter vsConverter;

    /**
     * This is true if the Vs Converter reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vsConverterESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected VSCDynamicsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getVSCDynamics();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VsConverter getVsConverter() {
        return vsConverter;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetVsConverter( VsConverter newVsConverter, NotificationChain msgs ) {
        VsConverter oldVsConverter = vsConverter;
        vsConverter = newVsConverter;
        boolean oldVsConverterESet = vsConverterESet;
        vsConverterESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.VSC_DYNAMICS__VS_CONVERTER, oldVsConverter, newVsConverter, !oldVsConverterESet );
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
    public void setVsConverter( VsConverter newVsConverter ) {
        if( newVsConverter != vsConverter ) {
            NotificationChain msgs = null;
            if( vsConverter != null )
                msgs = ( ( InternalEObject ) vsConverter ).eInverseRemove( this, CimPackage.VS_CONVERTER__VSC_DYNAMICS,
                        VsConverter.class, msgs );
            if( newVsConverter != null )
                msgs = ( ( InternalEObject ) newVsConverter ).eInverseAdd( this, CimPackage.VS_CONVERTER__VSC_DYNAMICS,
                        VsConverter.class, msgs );
            msgs = basicSetVsConverter( newVsConverter, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldVsConverterESet = vsConverterESet;
            vsConverterESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.VSC_DYNAMICS__VS_CONVERTER,
                        newVsConverter, newVsConverter, !oldVsConverterESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetVsConverter( NotificationChain msgs ) {
        VsConverter oldVsConverter = vsConverter;
        vsConverter = null;
        boolean oldVsConverterESet = vsConverterESet;
        vsConverterESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.VSC_DYNAMICS__VS_CONVERTER, oldVsConverter, null, oldVsConverterESet );
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
    public void unsetVsConverter() {
        if( vsConverter != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) vsConverter ).eInverseRemove( this, CimPackage.VS_CONVERTER__VSC_DYNAMICS,
                    VsConverter.class, msgs );
            msgs = basicUnsetVsConverter( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldVsConverterESet = vsConverterESet;
            vsConverterESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.VSC_DYNAMICS__VS_CONVERTER, null,
                        null, oldVsConverterESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVsConverter() {
        return vsConverterESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.VSC_DYNAMICS__VS_CONVERTER:
            if( vsConverter != null )
                msgs = ( ( InternalEObject ) vsConverter ).eInverseRemove( this, CimPackage.VS_CONVERTER__VSC_DYNAMICS,
                        VsConverter.class, msgs );
            return basicSetVsConverter( ( VsConverter ) otherEnd, msgs );
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
        case CimPackage.VSC_DYNAMICS__VS_CONVERTER:
            return basicUnsetVsConverter( msgs );
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
        case CimPackage.VSC_DYNAMICS__VS_CONVERTER:
            return getVsConverter();
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
        case CimPackage.VSC_DYNAMICS__VS_CONVERTER:
            setVsConverter( ( VsConverter ) newValue );
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
        case CimPackage.VSC_DYNAMICS__VS_CONVERTER:
            unsetVsConverter();
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
        case CimPackage.VSC_DYNAMICS__VS_CONVERTER:
            return isSetVsConverter();
        }
        return super.eIsSet( featureID );
    }

} //VSCDynamicsImpl

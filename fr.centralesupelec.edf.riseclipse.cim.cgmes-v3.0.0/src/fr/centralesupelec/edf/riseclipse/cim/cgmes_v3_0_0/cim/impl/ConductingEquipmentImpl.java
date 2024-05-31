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

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BaseVoltage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConductingEquipment;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvStatus;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Terminal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conducting Equipment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ConductingEquipmentImpl#getTerminals <em>Terminals</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ConductingEquipmentImpl#getBaseVoltage <em>Base Voltage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ConductingEquipmentImpl#getSvStatus <em>Sv Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConductingEquipmentImpl extends EquipmentImpl implements ConductingEquipment {
    /**
     * The cached value of the '{@link #getTerminals() <em>Terminals</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTerminals()
     * @generated
     * @ordered
     */
    protected EList< Terminal > terminals;

    /**
     * The cached value of the '{@link #getBaseVoltage() <em>Base Voltage</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBaseVoltage()
     * @generated
     * @ordered
     */
    protected BaseVoltage baseVoltage;

    /**
     * This is true if the Base Voltage reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean baseVoltageESet;

    /**
     * The cached value of the '{@link #getSvStatus() <em>Sv Status</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSvStatus()
     * @generated
     * @ordered
     */
    protected SvStatus svStatus;

    /**
     * This is true if the Sv Status reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean svStatusESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConductingEquipmentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getConductingEquipment();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Terminal > getTerminals() {
        if( terminals == null ) {
            terminals = new EObjectWithInverseResolvingEList.Unsettable< >( Terminal.class, this,
                    CimPackage.CONDUCTING_EQUIPMENT__TERMINALS, CimPackage.TERMINAL__CONDUCTING_EQUIPMENT );
        }
        return terminals;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTerminals() {
        if( terminals != null ) {
            ( ( InternalEList.Unsettable< ? > ) terminals ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTerminals() {
        return terminals != null && ( ( InternalEList.Unsettable< ? > ) terminals ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BaseVoltage getBaseVoltage() {
        return baseVoltage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBaseVoltage( BaseVoltage newBaseVoltage, NotificationChain msgs ) {
        BaseVoltage oldBaseVoltage = baseVoltage;
        baseVoltage = newBaseVoltage;
        boolean oldBaseVoltageESet = baseVoltageESet;
        baseVoltageESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE, oldBaseVoltage, newBaseVoltage,
                    !oldBaseVoltageESet );
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
    public void setBaseVoltage( BaseVoltage newBaseVoltage ) {
        if( newBaseVoltage != baseVoltage ) {
            NotificationChain msgs = null;
            if( baseVoltage != null ) {
                msgs = ( ( InternalEObject ) baseVoltage ).eInverseRemove( this,
                        CimPackage.BASE_VOLTAGE__CONDUCTING_EQUIPMENT, BaseVoltage.class, msgs );
            }
            if( newBaseVoltage != null ) {
                msgs = ( ( InternalEObject ) newBaseVoltage ).eInverseAdd( this,
                        CimPackage.BASE_VOLTAGE__CONDUCTING_EQUIPMENT, BaseVoltage.class, msgs );
            }
            msgs = basicSetBaseVoltage( newBaseVoltage, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldBaseVoltageESet = baseVoltageESet;
            baseVoltageESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE,
                        newBaseVoltage, newBaseVoltage, !oldBaseVoltageESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetBaseVoltage( NotificationChain msgs ) {
        BaseVoltage oldBaseVoltage = baseVoltage;
        baseVoltage = null;
        boolean oldBaseVoltageESet = baseVoltageESet;
        baseVoltageESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE, oldBaseVoltage, null, oldBaseVoltageESet );
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
    public void unsetBaseVoltage() {
        if( baseVoltage != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) baseVoltage ).eInverseRemove( this,
                    CimPackage.BASE_VOLTAGE__CONDUCTING_EQUIPMENT, BaseVoltage.class, msgs );
            msgs = basicUnsetBaseVoltage( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldBaseVoltageESet = baseVoltageESet;
            baseVoltageESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE,
                        null, null, oldBaseVoltageESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBaseVoltage() {
        return baseVoltageESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SvStatus getSvStatus() {
        if( svStatus != null && svStatus.eIsProxy() ) {
            InternalEObject oldSvStatus = ( InternalEObject ) svStatus;
            svStatus = ( SvStatus ) eResolveProxy( oldSvStatus );
            if( svStatus != oldSvStatus ) {
                if( eNotificationRequired() ) {
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                            CimPackage.CONDUCTING_EQUIPMENT__SV_STATUS, oldSvStatus, svStatus ) );
                }
            }
        }
        return svStatus;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SvStatus basicGetSvStatus() {
        return svStatus;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSvStatus( SvStatus newSvStatus, NotificationChain msgs ) {
        SvStatus oldSvStatus = svStatus;
        svStatus = newSvStatus;
        boolean oldSvStatusESet = svStatusESet;
        svStatusESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.CONDUCTING_EQUIPMENT__SV_STATUS, oldSvStatus, newSvStatus, !oldSvStatusESet );
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
    public void setSvStatus( SvStatus newSvStatus ) {
        if( newSvStatus != svStatus ) {
            NotificationChain msgs = null;
            if( svStatus != null ) {
                msgs = ( ( InternalEObject ) svStatus ).eInverseRemove( this,
                        CimPackage.SV_STATUS__CONDUCTING_EQUIPMENT, SvStatus.class, msgs );
            }
            if( newSvStatus != null ) {
                msgs = ( ( InternalEObject ) newSvStatus ).eInverseAdd( this,
                        CimPackage.SV_STATUS__CONDUCTING_EQUIPMENT, SvStatus.class, msgs );
            }
            msgs = basicSetSvStatus( newSvStatus, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldSvStatusESet = svStatusESet;
            svStatusESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CONDUCTING_EQUIPMENT__SV_STATUS,
                        newSvStatus, newSvStatus, !oldSvStatusESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetSvStatus( NotificationChain msgs ) {
        SvStatus oldSvStatus = svStatus;
        svStatus = null;
        boolean oldSvStatusESet = svStatusESet;
        svStatusESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CONDUCTING_EQUIPMENT__SV_STATUS, oldSvStatus, null, oldSvStatusESet );
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
    public void unsetSvStatus() {
        if( svStatus != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) svStatus ).eInverseRemove( this, CimPackage.SV_STATUS__CONDUCTING_EQUIPMENT,
                    SvStatus.class, msgs );
            msgs = basicUnsetSvStatus( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldSvStatusESet = svStatusESet;
            svStatusESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.CONDUCTING_EQUIPMENT__SV_STATUS,
                        null, null, oldSvStatusESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSvStatus() {
        return svStatusESet;
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
        case CimPackage.CONDUCTING_EQUIPMENT__TERMINALS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getTerminals() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE:
            if( baseVoltage != null ) {
                msgs = ( ( InternalEObject ) baseVoltage ).eInverseRemove( this,
                        CimPackage.BASE_VOLTAGE__CONDUCTING_EQUIPMENT, BaseVoltage.class, msgs );
            }
            return basicSetBaseVoltage( ( BaseVoltage ) otherEnd, msgs );
        case CimPackage.CONDUCTING_EQUIPMENT__SV_STATUS:
            if( svStatus != null ) {
                msgs = ( ( InternalEObject ) svStatus ).eInverseRemove( this,
                        CimPackage.SV_STATUS__CONDUCTING_EQUIPMENT, SvStatus.class, msgs );
            }
            return basicSetSvStatus( ( SvStatus ) otherEnd, msgs );
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
        case CimPackage.CONDUCTING_EQUIPMENT__TERMINALS:
            return ( ( InternalEList< ? > ) getTerminals() ).basicRemove( otherEnd, msgs );
        case CimPackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE:
            return basicUnsetBaseVoltage( msgs );
        case CimPackage.CONDUCTING_EQUIPMENT__SV_STATUS:
            return basicUnsetSvStatus( msgs );
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
        case CimPackage.CONDUCTING_EQUIPMENT__TERMINALS:
            return getTerminals();
        case CimPackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE:
            return getBaseVoltage();
        case CimPackage.CONDUCTING_EQUIPMENT__SV_STATUS:
            if( resolve ) {
                return getSvStatus();
            }
            return basicGetSvStatus();
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
        case CimPackage.CONDUCTING_EQUIPMENT__TERMINALS:
            getTerminals().clear();
            getTerminals().addAll( ( Collection< ? extends Terminal > ) newValue );
            return;
        case CimPackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE:
            setBaseVoltage( ( BaseVoltage ) newValue );
            return;
        case CimPackage.CONDUCTING_EQUIPMENT__SV_STATUS:
            setSvStatus( ( SvStatus ) newValue );
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
        case CimPackage.CONDUCTING_EQUIPMENT__TERMINALS:
            unsetTerminals();
            return;
        case CimPackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE:
            unsetBaseVoltage();
            return;
        case CimPackage.CONDUCTING_EQUIPMENT__SV_STATUS:
            unsetSvStatus();
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
        case CimPackage.CONDUCTING_EQUIPMENT__TERMINALS:
            return isSetTerminals();
        case CimPackage.CONDUCTING_EQUIPMENT__BASE_VOLTAGE:
            return isSetBaseVoltage();
        case CimPackage.CONDUCTING_EQUIPMENT__SV_STATUS:
            return isSetSvStatus();
        }
        return super.eIsSet( featureID );
    }

} //ConductingEquipmentImpl

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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCConverterOperatingModeKind;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCConverterUnit;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Substation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DC Converter Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.DCConverterUnitImpl#getSubstation <em>Substation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.DCConverterUnitImpl#getOperationMode <em>Operation Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DCConverterUnitImpl extends DCEquipmentContainerImpl implements DCConverterUnit {
    /**
     * The cached value of the '{@link #getSubstation() <em>Substation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubstation()
     * @generated
     * @ordered
     */
    protected Substation substation;

    /**
     * This is true if the Substation reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean substationESet;

    /**
     * The default value of the '{@link #getOperationMode() <em>Operation Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperationMode()
     * @generated
     * @ordered
     */
    protected static final DCConverterOperatingModeKind OPERATION_MODE_EDEFAULT = DCConverterOperatingModeKind.MONOPOLAR_METALLIC_RETURN;

    /**
     * The cached value of the '{@link #getOperationMode() <em>Operation Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperationMode()
     * @generated
     * @ordered
     */
    protected DCConverterOperatingModeKind operationMode = OPERATION_MODE_EDEFAULT;

    /**
     * This is true if the Operation Mode attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean operationModeESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DCConverterUnitImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getDCConverterUnit();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DCConverterOperatingModeKind getOperationMode() {
        return operationMode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOperationMode( DCConverterOperatingModeKind newOperationMode ) {
        DCConverterOperatingModeKind oldOperationMode = operationMode;
        operationMode = newOperationMode == null ? OPERATION_MODE_EDEFAULT : newOperationMode;
        boolean oldOperationModeESet = operationModeESet;
        operationModeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.DC_CONVERTER_UNIT__OPERATION_MODE,
                    oldOperationMode, operationMode, !oldOperationModeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOperationMode() {
        DCConverterOperatingModeKind oldOperationMode = operationMode;
        boolean oldOperationModeESet = operationModeESet;
        operationMode = OPERATION_MODE_EDEFAULT;
        operationModeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.DC_CONVERTER_UNIT__OPERATION_MODE,
                    oldOperationMode, OPERATION_MODE_EDEFAULT, oldOperationModeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOperationMode() {
        return operationModeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Substation getSubstation() {
        return substation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSubstation( Substation newSubstation, NotificationChain msgs ) {
        Substation oldSubstation = substation;
        substation = newSubstation;
        boolean oldSubstationESet = substationESet;
        substationESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.DC_CONVERTER_UNIT__SUBSTATION, oldSubstation, newSubstation, !oldSubstationESet );
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
    public void setSubstation( Substation newSubstation ) {
        if( newSubstation != substation ) {
            NotificationChain msgs = null;
            if( substation != null )
                msgs = ( ( InternalEObject ) substation ).eInverseRemove( this,
                        CimPackage.SUBSTATION__DC_CONVERTER_UNIT, Substation.class, msgs );
            if( newSubstation != null )
                msgs = ( ( InternalEObject ) newSubstation ).eInverseAdd( this,
                        CimPackage.SUBSTATION__DC_CONVERTER_UNIT, Substation.class, msgs );
            msgs = basicSetSubstation( newSubstation, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSubstationESet = substationESet;
            substationESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.DC_CONVERTER_UNIT__SUBSTATION,
                        newSubstation, newSubstation, !oldSubstationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetSubstation( NotificationChain msgs ) {
        Substation oldSubstation = substation;
        substation = null;
        boolean oldSubstationESet = substationESet;
        substationESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.DC_CONVERTER_UNIT__SUBSTATION, oldSubstation, null, oldSubstationESet );
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
    public void unsetSubstation() {
        if( substation != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) substation ).eInverseRemove( this, CimPackage.SUBSTATION__DC_CONVERTER_UNIT,
                    Substation.class, msgs );
            msgs = basicUnsetSubstation( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSubstationESet = substationESet;
            substationESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.DC_CONVERTER_UNIT__SUBSTATION,
                        null, null, oldSubstationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSubstation() {
        return substationESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.DC_CONVERTER_UNIT__SUBSTATION:
            if( substation != null )
                msgs = ( ( InternalEObject ) substation ).eInverseRemove( this,
                        CimPackage.SUBSTATION__DC_CONVERTER_UNIT, Substation.class, msgs );
            return basicSetSubstation( ( Substation ) otherEnd, msgs );
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
        case CimPackage.DC_CONVERTER_UNIT__SUBSTATION:
            return basicUnsetSubstation( msgs );
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
        case CimPackage.DC_CONVERTER_UNIT__SUBSTATION:
            return getSubstation();
        case CimPackage.DC_CONVERTER_UNIT__OPERATION_MODE:
            return getOperationMode();
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
        case CimPackage.DC_CONVERTER_UNIT__SUBSTATION:
            setSubstation( ( Substation ) newValue );
            return;
        case CimPackage.DC_CONVERTER_UNIT__OPERATION_MODE:
            setOperationMode( ( DCConverterOperatingModeKind ) newValue );
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
        case CimPackage.DC_CONVERTER_UNIT__SUBSTATION:
            unsetSubstation();
            return;
        case CimPackage.DC_CONVERTER_UNIT__OPERATION_MODE:
            unsetOperationMode();
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
        case CimPackage.DC_CONVERTER_UNIT__SUBSTATION:
            return isSetSubstation();
        case CimPackage.DC_CONVERTER_UNIT__OPERATION_MODE:
            return isSetOperationMode();
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
        result.append( " (operationMode: " );
        if( operationModeESet )
            result.append( operationMode );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //DCConverterUnitImpl

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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroPowerPlant;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroPump;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotatingMachine;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hydro Pump</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.HydroPumpImpl#getHydroPowerPlant <em>Hydro Power Plant</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.HydroPumpImpl#getRotatingMachine <em>Rotating Machine</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HydroPumpImpl extends EquipmentImpl implements HydroPump {
    /**
     * The cached value of the '{@link #getHydroPowerPlant() <em>Hydro Power Plant</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHydroPowerPlant()
     * @generated
     * @ordered
     */
    protected HydroPowerPlant hydroPowerPlant;

    /**
     * This is true if the Hydro Power Plant reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean hydroPowerPlantESet;

    /**
     * The cached value of the '{@link #getRotatingMachine() <em>Rotating Machine</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRotatingMachine()
     * @generated
     * @ordered
     */
    protected RotatingMachine rotatingMachine;

    /**
     * This is true if the Rotating Machine reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rotatingMachineESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected HydroPumpImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getHydroPump();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RotatingMachine getRotatingMachine() {
        return rotatingMachine;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRotatingMachine( RotatingMachine newRotatingMachine, NotificationChain msgs ) {
        RotatingMachine oldRotatingMachine = rotatingMachine;
        rotatingMachine = newRotatingMachine;
        boolean oldRotatingMachineESet = rotatingMachineESet;
        rotatingMachineESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.HYDRO_PUMP__ROTATING_MACHINE, oldRotatingMachine, newRotatingMachine,
                    !oldRotatingMachineESet );
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
    public void setRotatingMachine( RotatingMachine newRotatingMachine ) {
        if( newRotatingMachine != rotatingMachine ) {
            NotificationChain msgs = null;
            if( rotatingMachine != null )
                msgs = ( ( InternalEObject ) rotatingMachine ).eInverseRemove( this,
                        CimPackage.ROTATING_MACHINE__HYDRO_PUMP, RotatingMachine.class, msgs );
            if( newRotatingMachine != null )
                msgs = ( ( InternalEObject ) newRotatingMachine ).eInverseAdd( this,
                        CimPackage.ROTATING_MACHINE__HYDRO_PUMP, RotatingMachine.class, msgs );
            msgs = basicSetRotatingMachine( newRotatingMachine, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRotatingMachineESet = rotatingMachineESet;
            rotatingMachineESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.HYDRO_PUMP__ROTATING_MACHINE,
                        newRotatingMachine, newRotatingMachine, !oldRotatingMachineESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRotatingMachine( NotificationChain msgs ) {
        RotatingMachine oldRotatingMachine = rotatingMachine;
        rotatingMachine = null;
        boolean oldRotatingMachineESet = rotatingMachineESet;
        rotatingMachineESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.HYDRO_PUMP__ROTATING_MACHINE, oldRotatingMachine, null, oldRotatingMachineESet );
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
    public void unsetRotatingMachine() {
        if( rotatingMachine != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) rotatingMachine ).eInverseRemove( this,
                    CimPackage.ROTATING_MACHINE__HYDRO_PUMP, RotatingMachine.class, msgs );
            msgs = basicUnsetRotatingMachine( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRotatingMachineESet = rotatingMachineESet;
            rotatingMachineESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.HYDRO_PUMP__ROTATING_MACHINE, null,
                        null, oldRotatingMachineESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRotatingMachine() {
        return rotatingMachineESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public HydroPowerPlant getHydroPowerPlant() {
        return hydroPowerPlant;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetHydroPowerPlant( HydroPowerPlant newHydroPowerPlant, NotificationChain msgs ) {
        HydroPowerPlant oldHydroPowerPlant = hydroPowerPlant;
        hydroPowerPlant = newHydroPowerPlant;
        boolean oldHydroPowerPlantESet = hydroPowerPlantESet;
        hydroPowerPlantESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.HYDRO_PUMP__HYDRO_POWER_PLANT, oldHydroPowerPlant, newHydroPowerPlant,
                    !oldHydroPowerPlantESet );
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
    public void setHydroPowerPlant( HydroPowerPlant newHydroPowerPlant ) {
        if( newHydroPowerPlant != hydroPowerPlant ) {
            NotificationChain msgs = null;
            if( hydroPowerPlant != null )
                msgs = ( ( InternalEObject ) hydroPowerPlant ).eInverseRemove( this,
                        CimPackage.HYDRO_POWER_PLANT__HYDRO_PUMPS, HydroPowerPlant.class, msgs );
            if( newHydroPowerPlant != null )
                msgs = ( ( InternalEObject ) newHydroPowerPlant ).eInverseAdd( this,
                        CimPackage.HYDRO_POWER_PLANT__HYDRO_PUMPS, HydroPowerPlant.class, msgs );
            msgs = basicSetHydroPowerPlant( newHydroPowerPlant, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldHydroPowerPlantESet = hydroPowerPlantESet;
            hydroPowerPlantESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.HYDRO_PUMP__HYDRO_POWER_PLANT,
                        newHydroPowerPlant, newHydroPowerPlant, !oldHydroPowerPlantESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetHydroPowerPlant( NotificationChain msgs ) {
        HydroPowerPlant oldHydroPowerPlant = hydroPowerPlant;
        hydroPowerPlant = null;
        boolean oldHydroPowerPlantESet = hydroPowerPlantESet;
        hydroPowerPlantESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.HYDRO_PUMP__HYDRO_POWER_PLANT, oldHydroPowerPlant, null, oldHydroPowerPlantESet );
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
    public void unsetHydroPowerPlant() {
        if( hydroPowerPlant != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) hydroPowerPlant ).eInverseRemove( this,
                    CimPackage.HYDRO_POWER_PLANT__HYDRO_PUMPS, HydroPowerPlant.class, msgs );
            msgs = basicUnsetHydroPowerPlant( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldHydroPowerPlantESet = hydroPowerPlantESet;
            hydroPowerPlantESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.HYDRO_PUMP__HYDRO_POWER_PLANT,
                        null, null, oldHydroPowerPlantESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetHydroPowerPlant() {
        return hydroPowerPlantESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.HYDRO_PUMP__HYDRO_POWER_PLANT:
            if( hydroPowerPlant != null )
                msgs = ( ( InternalEObject ) hydroPowerPlant ).eInverseRemove( this,
                        CimPackage.HYDRO_POWER_PLANT__HYDRO_PUMPS, HydroPowerPlant.class, msgs );
            return basicSetHydroPowerPlant( ( HydroPowerPlant ) otherEnd, msgs );
        case CimPackage.HYDRO_PUMP__ROTATING_MACHINE:
            if( rotatingMachine != null )
                msgs = ( ( InternalEObject ) rotatingMachine ).eInverseRemove( this,
                        CimPackage.ROTATING_MACHINE__HYDRO_PUMP, RotatingMachine.class, msgs );
            return basicSetRotatingMachine( ( RotatingMachine ) otherEnd, msgs );
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
        case CimPackage.HYDRO_PUMP__HYDRO_POWER_PLANT:
            return basicUnsetHydroPowerPlant( msgs );
        case CimPackage.HYDRO_PUMP__ROTATING_MACHINE:
            return basicUnsetRotatingMachine( msgs );
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
        case CimPackage.HYDRO_PUMP__HYDRO_POWER_PLANT:
            return getHydroPowerPlant();
        case CimPackage.HYDRO_PUMP__ROTATING_MACHINE:
            return getRotatingMachine();
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
        case CimPackage.HYDRO_PUMP__HYDRO_POWER_PLANT:
            setHydroPowerPlant( ( HydroPowerPlant ) newValue );
            return;
        case CimPackage.HYDRO_PUMP__ROTATING_MACHINE:
            setRotatingMachine( ( RotatingMachine ) newValue );
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
        case CimPackage.HYDRO_PUMP__HYDRO_POWER_PLANT:
            unsetHydroPowerPlant();
            return;
        case CimPackage.HYDRO_PUMP__ROTATING_MACHINE:
            unsetRotatingMachine();
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
        case CimPackage.HYDRO_PUMP__HYDRO_POWER_PLANT:
            return isSetHydroPowerPlant();
        case CimPackage.HYDRO_PUMP__ROTATING_MACHINE:
            return isSetRotatingMachine();
        }
        return super.eIsSet( featureID );
    }

} //HydroPumpImpl

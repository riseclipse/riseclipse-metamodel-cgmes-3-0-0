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

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachine;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineDynamics;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineKind;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asynchronous Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.AsynchronousMachineImpl#getNominalFrequency <em>Nominal Frequency</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.AsynchronousMachineImpl#getNominalSpeed <em>Nominal Speed</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.AsynchronousMachineImpl#getAsynchronousMachineDynamics <em>Asynchronous Machine Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.AsynchronousMachineImpl#getRatedMechanicalPower <em>Rated Mechanical Power</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.AsynchronousMachineImpl#getReversible <em>Reversible</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.AsynchronousMachineImpl#getRxLockedRotorRatio <em>Rx Locked Rotor Ratio</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.AsynchronousMachineImpl#getEfficiency <em>Efficiency</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.AsynchronousMachineImpl#getPolePairNumber <em>Pole Pair Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.AsynchronousMachineImpl#getConverterFedDrive <em>Converter Fed Drive</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.AsynchronousMachineImpl#getIaIrRatio <em>Ia Ir Ratio</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.AsynchronousMachineImpl#getAsynchronousMachineType <em>Asynchronous Machine Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AsynchronousMachineImpl extends RotatingMachineImpl implements AsynchronousMachine {
    /**
     * The default value of the '{@link #getNominalFrequency() <em>Nominal Frequency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNominalFrequency()
     * @generated
     * @ordered
     */
    protected static final Double NOMINAL_FREQUENCY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNominalFrequency() <em>Nominal Frequency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNominalFrequency()
     * @generated
     * @ordered
     */
    protected Double nominalFrequency = NOMINAL_FREQUENCY_EDEFAULT;

    /**
     * This is true if the Nominal Frequency attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean nominalFrequencyESet;

    /**
     * The default value of the '{@link #getNominalSpeed() <em>Nominal Speed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNominalSpeed()
     * @generated
     * @ordered
     */
    protected static final Double NOMINAL_SPEED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNominalSpeed() <em>Nominal Speed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNominalSpeed()
     * @generated
     * @ordered
     */
    protected Double nominalSpeed = NOMINAL_SPEED_EDEFAULT;

    /**
     * This is true if the Nominal Speed attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean nominalSpeedESet;

    /**
     * The cached value of the '{@link #getAsynchronousMachineDynamics() <em>Asynchronous Machine Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAsynchronousMachineDynamics()
     * @generated
     * @ordered
     */
    protected AsynchronousMachineDynamics asynchronousMachineDynamics;

    /**
     * This is true if the Asynchronous Machine Dynamics reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean asynchronousMachineDynamicsESet;

    /**
     * The default value of the '{@link #getRatedMechanicalPower() <em>Rated Mechanical Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedMechanicalPower()
     * @generated
     * @ordered
     */
    protected static final Double RATED_MECHANICAL_POWER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRatedMechanicalPower() <em>Rated Mechanical Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedMechanicalPower()
     * @generated
     * @ordered
     */
    protected Double ratedMechanicalPower = RATED_MECHANICAL_POWER_EDEFAULT;

    /**
     * This is true if the Rated Mechanical Power attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ratedMechanicalPowerESet;

    /**
     * The default value of the '{@link #getReversible() <em>Reversible</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReversible()
     * @generated
     * @ordered
     */
    protected static final Boolean REVERSIBLE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getReversible() <em>Reversible</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReversible()
     * @generated
     * @ordered
     */
    protected Boolean reversible = REVERSIBLE_EDEFAULT;

    /**
     * This is true if the Reversible attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean reversibleESet;

    /**
     * The default value of the '{@link #getRxLockedRotorRatio() <em>Rx Locked Rotor Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRxLockedRotorRatio()
     * @generated
     * @ordered
     */
    protected static final Double RX_LOCKED_ROTOR_RATIO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRxLockedRotorRatio() <em>Rx Locked Rotor Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRxLockedRotorRatio()
     * @generated
     * @ordered
     */
    protected Double rxLockedRotorRatio = RX_LOCKED_ROTOR_RATIO_EDEFAULT;

    /**
     * This is true if the Rx Locked Rotor Ratio attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rxLockedRotorRatioESet;

    /**
     * The default value of the '{@link #getEfficiency() <em>Efficiency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEfficiency()
     * @generated
     * @ordered
     */
    protected static final Double EFFICIENCY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEfficiency() <em>Efficiency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEfficiency()
     * @generated
     * @ordered
     */
    protected Double efficiency = EFFICIENCY_EDEFAULT;

    /**
     * This is true if the Efficiency attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean efficiencyESet;

    /**
     * The default value of the '{@link #getPolePairNumber() <em>Pole Pair Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPolePairNumber()
     * @generated
     * @ordered
     */
    protected static final BigInteger POLE_PAIR_NUMBER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPolePairNumber() <em>Pole Pair Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPolePairNumber()
     * @generated
     * @ordered
     */
    protected BigInteger polePairNumber = POLE_PAIR_NUMBER_EDEFAULT;

    /**
     * This is true if the Pole Pair Number attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean polePairNumberESet;

    /**
     * The default value of the '{@link #getConverterFedDrive() <em>Converter Fed Drive</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConverterFedDrive()
     * @generated
     * @ordered
     */
    protected static final Boolean CONVERTER_FED_DRIVE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getConverterFedDrive() <em>Converter Fed Drive</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConverterFedDrive()
     * @generated
     * @ordered
     */
    protected Boolean converterFedDrive = CONVERTER_FED_DRIVE_EDEFAULT;

    /**
     * This is true if the Converter Fed Drive attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean converterFedDriveESet;

    /**
     * The default value of the '{@link #getIaIrRatio() <em>Ia Ir Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIaIrRatio()
     * @generated
     * @ordered
     */
    protected static final Double IA_IR_RATIO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIaIrRatio() <em>Ia Ir Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIaIrRatio()
     * @generated
     * @ordered
     */
    protected Double iaIrRatio = IA_IR_RATIO_EDEFAULT;

    /**
     * This is true if the Ia Ir Ratio attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean iaIrRatioESet;

    /**
     * The default value of the '{@link #getAsynchronousMachineType() <em>Asynchronous Machine Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAsynchronousMachineType()
     * @generated
     * @ordered
     */
    protected static final AsynchronousMachineKind ASYNCHRONOUS_MACHINE_TYPE_EDEFAULT = AsynchronousMachineKind.GENERATOR;

    /**
     * The cached value of the '{@link #getAsynchronousMachineType() <em>Asynchronous Machine Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAsynchronousMachineType()
     * @generated
     * @ordered
     */
    protected AsynchronousMachineKind asynchronousMachineType = ASYNCHRONOUS_MACHINE_TYPE_EDEFAULT;

    /**
     * This is true if the Asynchronous Machine Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean asynchronousMachineTypeESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AsynchronousMachineImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getAsynchronousMachine();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getNominalSpeed() {
        return nominalSpeed;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNominalSpeed( Double newNominalSpeed ) {
        Double oldNominalSpeed = nominalSpeed;
        nominalSpeed = newNominalSpeed;
        boolean oldNominalSpeedESet = nominalSpeedESet;
        nominalSpeedESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ASYNCHRONOUS_MACHINE__NOMINAL_SPEED,
                    oldNominalSpeed, nominalSpeed, !oldNominalSpeedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNominalSpeed() {
        Double oldNominalSpeed = nominalSpeed;
        boolean oldNominalSpeedESet = nominalSpeedESet;
        nominalSpeed = NOMINAL_SPEED_EDEFAULT;
        nominalSpeedESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ASYNCHRONOUS_MACHINE__NOMINAL_SPEED,
                    oldNominalSpeed, NOMINAL_SPEED_EDEFAULT, oldNominalSpeedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNominalSpeed() {
        return nominalSpeedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AsynchronousMachineDynamics getAsynchronousMachineDynamics() {
        if( asynchronousMachineDynamics != null && asynchronousMachineDynamics.eIsProxy() ) {
            InternalEObject oldAsynchronousMachineDynamics = ( InternalEObject ) asynchronousMachineDynamics;
            asynchronousMachineDynamics = ( AsynchronousMachineDynamics ) eResolveProxy(
                    oldAsynchronousMachineDynamics );
            if( asynchronousMachineDynamics != oldAsynchronousMachineDynamics ) {
                if( eNotificationRequired() )
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                            CimPackage.ASYNCHRONOUS_MACHINE__ASYNCHRONOUS_MACHINE_DYNAMICS,
                            oldAsynchronousMachineDynamics, asynchronousMachineDynamics ) );
            }
        }
        return asynchronousMachineDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AsynchronousMachineDynamics basicGetAsynchronousMachineDynamics() {
        return asynchronousMachineDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAsynchronousMachineDynamics(
            AsynchronousMachineDynamics newAsynchronousMachineDynamics, NotificationChain msgs ) {
        AsynchronousMachineDynamics oldAsynchronousMachineDynamics = asynchronousMachineDynamics;
        asynchronousMachineDynamics = newAsynchronousMachineDynamics;
        boolean oldAsynchronousMachineDynamicsESet = asynchronousMachineDynamicsESet;
        asynchronousMachineDynamicsESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ASYNCHRONOUS_MACHINE__ASYNCHRONOUS_MACHINE_DYNAMICS, oldAsynchronousMachineDynamics,
                    newAsynchronousMachineDynamics, !oldAsynchronousMachineDynamicsESet );
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
    public void setAsynchronousMachineDynamics( AsynchronousMachineDynamics newAsynchronousMachineDynamics ) {
        if( newAsynchronousMachineDynamics != asynchronousMachineDynamics ) {
            NotificationChain msgs = null;
            if( asynchronousMachineDynamics != null )
                msgs = ( ( InternalEObject ) asynchronousMachineDynamics ).eInverseRemove( this,
                        CimPackage.ASYNCHRONOUS_MACHINE_DYNAMICS__ASYNCHRONOUS_MACHINE,
                        AsynchronousMachineDynamics.class, msgs );
            if( newAsynchronousMachineDynamics != null )
                msgs = ( ( InternalEObject ) newAsynchronousMachineDynamics ).eInverseAdd( this,
                        CimPackage.ASYNCHRONOUS_MACHINE_DYNAMICS__ASYNCHRONOUS_MACHINE,
                        AsynchronousMachineDynamics.class, msgs );
            msgs = basicSetAsynchronousMachineDynamics( newAsynchronousMachineDynamics, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAsynchronousMachineDynamicsESet = asynchronousMachineDynamicsESet;
            asynchronousMachineDynamicsESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        CimPackage.ASYNCHRONOUS_MACHINE__ASYNCHRONOUS_MACHINE_DYNAMICS, newAsynchronousMachineDynamics,
                        newAsynchronousMachineDynamics, !oldAsynchronousMachineDynamicsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetAsynchronousMachineDynamics( NotificationChain msgs ) {
        AsynchronousMachineDynamics oldAsynchronousMachineDynamics = asynchronousMachineDynamics;
        asynchronousMachineDynamics = null;
        boolean oldAsynchronousMachineDynamicsESet = asynchronousMachineDynamicsESet;
        asynchronousMachineDynamicsESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASYNCHRONOUS_MACHINE__ASYNCHRONOUS_MACHINE_DYNAMICS, oldAsynchronousMachineDynamics,
                    null, oldAsynchronousMachineDynamicsESet );
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
    public void unsetAsynchronousMachineDynamics() {
        if( asynchronousMachineDynamics != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) asynchronousMachineDynamics ).eInverseRemove( this,
                    CimPackage.ASYNCHRONOUS_MACHINE_DYNAMICS__ASYNCHRONOUS_MACHINE, AsynchronousMachineDynamics.class,
                    msgs );
            msgs = basicUnsetAsynchronousMachineDynamics( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAsynchronousMachineDynamicsESet = asynchronousMachineDynamicsESet;
            asynchronousMachineDynamicsESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.ASYNCHRONOUS_MACHINE__ASYNCHRONOUS_MACHINE_DYNAMICS, null, null,
                        oldAsynchronousMachineDynamicsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAsynchronousMachineDynamics() {
        return asynchronousMachineDynamicsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getRatedMechanicalPower() {
        return ratedMechanicalPower;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRatedMechanicalPower( Double newRatedMechanicalPower ) {
        Double oldRatedMechanicalPower = ratedMechanicalPower;
        ratedMechanicalPower = newRatedMechanicalPower;
        boolean oldRatedMechanicalPowerESet = ratedMechanicalPowerESet;
        ratedMechanicalPowerESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.ASYNCHRONOUS_MACHINE__RATED_MECHANICAL_POWER, oldRatedMechanicalPower,
                    ratedMechanicalPower, !oldRatedMechanicalPowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRatedMechanicalPower() {
        Double oldRatedMechanicalPower = ratedMechanicalPower;
        boolean oldRatedMechanicalPowerESet = ratedMechanicalPowerESet;
        ratedMechanicalPower = RATED_MECHANICAL_POWER_EDEFAULT;
        ratedMechanicalPowerESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASYNCHRONOUS_MACHINE__RATED_MECHANICAL_POWER, oldRatedMechanicalPower,
                    RATED_MECHANICAL_POWER_EDEFAULT, oldRatedMechanicalPowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRatedMechanicalPower() {
        return ratedMechanicalPowerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getReversible() {
        return reversible;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setReversible( Boolean newReversible ) {
        Boolean oldReversible = reversible;
        reversible = newReversible;
        boolean oldReversibleESet = reversibleESet;
        reversibleESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ASYNCHRONOUS_MACHINE__REVERSIBLE,
                    oldReversible, reversible, !oldReversibleESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReversible() {
        Boolean oldReversible = reversible;
        boolean oldReversibleESet = reversibleESet;
        reversible = REVERSIBLE_EDEFAULT;
        reversibleESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ASYNCHRONOUS_MACHINE__REVERSIBLE,
                    oldReversible, REVERSIBLE_EDEFAULT, oldReversibleESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReversible() {
        return reversibleESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getRxLockedRotorRatio() {
        return rxLockedRotorRatio;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRxLockedRotorRatio( Double newRxLockedRotorRatio ) {
        Double oldRxLockedRotorRatio = rxLockedRotorRatio;
        rxLockedRotorRatio = newRxLockedRotorRatio;
        boolean oldRxLockedRotorRatioESet = rxLockedRotorRatioESet;
        rxLockedRotorRatioESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.ASYNCHRONOUS_MACHINE__RX_LOCKED_ROTOR_RATIO, oldRxLockedRotorRatio, rxLockedRotorRatio,
                    !oldRxLockedRotorRatioESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRxLockedRotorRatio() {
        Double oldRxLockedRotorRatio = rxLockedRotorRatio;
        boolean oldRxLockedRotorRatioESet = rxLockedRotorRatioESet;
        rxLockedRotorRatio = RX_LOCKED_ROTOR_RATIO_EDEFAULT;
        rxLockedRotorRatioESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASYNCHRONOUS_MACHINE__RX_LOCKED_ROTOR_RATIO, oldRxLockedRotorRatio,
                    RX_LOCKED_ROTOR_RATIO_EDEFAULT, oldRxLockedRotorRatioESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRxLockedRotorRatio() {
        return rxLockedRotorRatioESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getEfficiency() {
        return efficiency;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEfficiency( Double newEfficiency ) {
        Double oldEfficiency = efficiency;
        efficiency = newEfficiency;
        boolean oldEfficiencyESet = efficiencyESet;
        efficiencyESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ASYNCHRONOUS_MACHINE__EFFICIENCY,
                    oldEfficiency, efficiency, !oldEfficiencyESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEfficiency() {
        Double oldEfficiency = efficiency;
        boolean oldEfficiencyESet = efficiencyESet;
        efficiency = EFFICIENCY_EDEFAULT;
        efficiencyESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ASYNCHRONOUS_MACHINE__EFFICIENCY,
                    oldEfficiency, EFFICIENCY_EDEFAULT, oldEfficiencyESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEfficiency() {
        return efficiencyESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BigInteger getPolePairNumber() {
        return polePairNumber;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPolePairNumber( BigInteger newPolePairNumber ) {
        BigInteger oldPolePairNumber = polePairNumber;
        polePairNumber = newPolePairNumber;
        boolean oldPolePairNumberESet = polePairNumberESet;
        polePairNumberESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ASYNCHRONOUS_MACHINE__POLE_PAIR_NUMBER,
                    oldPolePairNumber, polePairNumber, !oldPolePairNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPolePairNumber() {
        BigInteger oldPolePairNumber = polePairNumber;
        boolean oldPolePairNumberESet = polePairNumberESet;
        polePairNumber = POLE_PAIR_NUMBER_EDEFAULT;
        polePairNumberESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ASYNCHRONOUS_MACHINE__POLE_PAIR_NUMBER,
                    oldPolePairNumber, POLE_PAIR_NUMBER_EDEFAULT, oldPolePairNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPolePairNumber() {
        return polePairNumberESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getConverterFedDrive() {
        return converterFedDrive;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setConverterFedDrive( Boolean newConverterFedDrive ) {
        Boolean oldConverterFedDrive = converterFedDrive;
        converterFedDrive = newConverterFedDrive;
        boolean oldConverterFedDriveESet = converterFedDriveESet;
        converterFedDriveESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.ASYNCHRONOUS_MACHINE__CONVERTER_FED_DRIVE, oldConverterFedDrive, converterFedDrive,
                    !oldConverterFedDriveESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetConverterFedDrive() {
        Boolean oldConverterFedDrive = converterFedDrive;
        boolean oldConverterFedDriveESet = converterFedDriveESet;
        converterFedDrive = CONVERTER_FED_DRIVE_EDEFAULT;
        converterFedDriveESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASYNCHRONOUS_MACHINE__CONVERTER_FED_DRIVE, oldConverterFedDrive,
                    CONVERTER_FED_DRIVE_EDEFAULT, oldConverterFedDriveESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetConverterFedDrive() {
        return converterFedDriveESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getIaIrRatio() {
        return iaIrRatio;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIaIrRatio( Double newIaIrRatio ) {
        Double oldIaIrRatio = iaIrRatio;
        iaIrRatio = newIaIrRatio;
        boolean oldIaIrRatioESet = iaIrRatioESet;
        iaIrRatioESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ASYNCHRONOUS_MACHINE__IA_IR_RATIO,
                    oldIaIrRatio, iaIrRatio, !oldIaIrRatioESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIaIrRatio() {
        Double oldIaIrRatio = iaIrRatio;
        boolean oldIaIrRatioESet = iaIrRatioESet;
        iaIrRatio = IA_IR_RATIO_EDEFAULT;
        iaIrRatioESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ASYNCHRONOUS_MACHINE__IA_IR_RATIO,
                    oldIaIrRatio, IA_IR_RATIO_EDEFAULT, oldIaIrRatioESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIaIrRatio() {
        return iaIrRatioESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AsynchronousMachineKind getAsynchronousMachineType() {
        return asynchronousMachineType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAsynchronousMachineType( AsynchronousMachineKind newAsynchronousMachineType ) {
        AsynchronousMachineKind oldAsynchronousMachineType = asynchronousMachineType;
        asynchronousMachineType = newAsynchronousMachineType == null ? ASYNCHRONOUS_MACHINE_TYPE_EDEFAULT
                : newAsynchronousMachineType;
        boolean oldAsynchronousMachineTypeESet = asynchronousMachineTypeESet;
        asynchronousMachineTypeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.ASYNCHRONOUS_MACHINE__ASYNCHRONOUS_MACHINE_TYPE, oldAsynchronousMachineType,
                    asynchronousMachineType, !oldAsynchronousMachineTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAsynchronousMachineType() {
        AsynchronousMachineKind oldAsynchronousMachineType = asynchronousMachineType;
        boolean oldAsynchronousMachineTypeESet = asynchronousMachineTypeESet;
        asynchronousMachineType = ASYNCHRONOUS_MACHINE_TYPE_EDEFAULT;
        asynchronousMachineTypeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASYNCHRONOUS_MACHINE__ASYNCHRONOUS_MACHINE_TYPE, oldAsynchronousMachineType,
                    ASYNCHRONOUS_MACHINE_TYPE_EDEFAULT, oldAsynchronousMachineTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAsynchronousMachineType() {
        return asynchronousMachineTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.ASYNCHRONOUS_MACHINE__ASYNCHRONOUS_MACHINE_DYNAMICS:
            if( asynchronousMachineDynamics != null )
                msgs = ( ( InternalEObject ) asynchronousMachineDynamics ).eInverseRemove( this,
                        CimPackage.ASYNCHRONOUS_MACHINE_DYNAMICS__ASYNCHRONOUS_MACHINE,
                        AsynchronousMachineDynamics.class, msgs );
            return basicSetAsynchronousMachineDynamics( ( AsynchronousMachineDynamics ) otherEnd, msgs );
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
        case CimPackage.ASYNCHRONOUS_MACHINE__ASYNCHRONOUS_MACHINE_DYNAMICS:
            return basicUnsetAsynchronousMachineDynamics( msgs );
        }
        return super.eInverseRemove( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getNominalFrequency() {
        return nominalFrequency;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNominalFrequency( Double newNominalFrequency ) {
        Double oldNominalFrequency = nominalFrequency;
        nominalFrequency = newNominalFrequency;
        boolean oldNominalFrequencyESet = nominalFrequencyESet;
        nominalFrequencyESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ASYNCHRONOUS_MACHINE__NOMINAL_FREQUENCY,
                    oldNominalFrequency, nominalFrequency, !oldNominalFrequencyESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNominalFrequency() {
        Double oldNominalFrequency = nominalFrequency;
        boolean oldNominalFrequencyESet = nominalFrequencyESet;
        nominalFrequency = NOMINAL_FREQUENCY_EDEFAULT;
        nominalFrequencyESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASYNCHRONOUS_MACHINE__NOMINAL_FREQUENCY, oldNominalFrequency, NOMINAL_FREQUENCY_EDEFAULT,
                    oldNominalFrequencyESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNominalFrequency() {
        return nominalFrequencyESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.ASYNCHRONOUS_MACHINE__NOMINAL_FREQUENCY:
            return getNominalFrequency();
        case CimPackage.ASYNCHRONOUS_MACHINE__NOMINAL_SPEED:
            return getNominalSpeed();
        case CimPackage.ASYNCHRONOUS_MACHINE__ASYNCHRONOUS_MACHINE_DYNAMICS:
            if( resolve ) return getAsynchronousMachineDynamics();
            return basicGetAsynchronousMachineDynamics();
        case CimPackage.ASYNCHRONOUS_MACHINE__RATED_MECHANICAL_POWER:
            return getRatedMechanicalPower();
        case CimPackage.ASYNCHRONOUS_MACHINE__REVERSIBLE:
            return getReversible();
        case CimPackage.ASYNCHRONOUS_MACHINE__RX_LOCKED_ROTOR_RATIO:
            return getRxLockedRotorRatio();
        case CimPackage.ASYNCHRONOUS_MACHINE__EFFICIENCY:
            return getEfficiency();
        case CimPackage.ASYNCHRONOUS_MACHINE__POLE_PAIR_NUMBER:
            return getPolePairNumber();
        case CimPackage.ASYNCHRONOUS_MACHINE__CONVERTER_FED_DRIVE:
            return getConverterFedDrive();
        case CimPackage.ASYNCHRONOUS_MACHINE__IA_IR_RATIO:
            return getIaIrRatio();
        case CimPackage.ASYNCHRONOUS_MACHINE__ASYNCHRONOUS_MACHINE_TYPE:
            return getAsynchronousMachineType();
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
        case CimPackage.ASYNCHRONOUS_MACHINE__NOMINAL_FREQUENCY:
            setNominalFrequency( ( Double ) newValue );
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE__NOMINAL_SPEED:
            setNominalSpeed( ( Double ) newValue );
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE__ASYNCHRONOUS_MACHINE_DYNAMICS:
            setAsynchronousMachineDynamics( ( AsynchronousMachineDynamics ) newValue );
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE__RATED_MECHANICAL_POWER:
            setRatedMechanicalPower( ( Double ) newValue );
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE__REVERSIBLE:
            setReversible( ( Boolean ) newValue );
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE__RX_LOCKED_ROTOR_RATIO:
            setRxLockedRotorRatio( ( Double ) newValue );
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE__EFFICIENCY:
            setEfficiency( ( Double ) newValue );
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE__POLE_PAIR_NUMBER:
            setPolePairNumber( ( BigInteger ) newValue );
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE__CONVERTER_FED_DRIVE:
            setConverterFedDrive( ( Boolean ) newValue );
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE__IA_IR_RATIO:
            setIaIrRatio( ( Double ) newValue );
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE__ASYNCHRONOUS_MACHINE_TYPE:
            setAsynchronousMachineType( ( AsynchronousMachineKind ) newValue );
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
        case CimPackage.ASYNCHRONOUS_MACHINE__NOMINAL_FREQUENCY:
            unsetNominalFrequency();
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE__NOMINAL_SPEED:
            unsetNominalSpeed();
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE__ASYNCHRONOUS_MACHINE_DYNAMICS:
            unsetAsynchronousMachineDynamics();
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE__RATED_MECHANICAL_POWER:
            unsetRatedMechanicalPower();
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE__REVERSIBLE:
            unsetReversible();
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE__RX_LOCKED_ROTOR_RATIO:
            unsetRxLockedRotorRatio();
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE__EFFICIENCY:
            unsetEfficiency();
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE__POLE_PAIR_NUMBER:
            unsetPolePairNumber();
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE__CONVERTER_FED_DRIVE:
            unsetConverterFedDrive();
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE__IA_IR_RATIO:
            unsetIaIrRatio();
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE__ASYNCHRONOUS_MACHINE_TYPE:
            unsetAsynchronousMachineType();
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
        case CimPackage.ASYNCHRONOUS_MACHINE__NOMINAL_FREQUENCY:
            return isSetNominalFrequency();
        case CimPackage.ASYNCHRONOUS_MACHINE__NOMINAL_SPEED:
            return isSetNominalSpeed();
        case CimPackage.ASYNCHRONOUS_MACHINE__ASYNCHRONOUS_MACHINE_DYNAMICS:
            return isSetAsynchronousMachineDynamics();
        case CimPackage.ASYNCHRONOUS_MACHINE__RATED_MECHANICAL_POWER:
            return isSetRatedMechanicalPower();
        case CimPackage.ASYNCHRONOUS_MACHINE__REVERSIBLE:
            return isSetReversible();
        case CimPackage.ASYNCHRONOUS_MACHINE__RX_LOCKED_ROTOR_RATIO:
            return isSetRxLockedRotorRatio();
        case CimPackage.ASYNCHRONOUS_MACHINE__EFFICIENCY:
            return isSetEfficiency();
        case CimPackage.ASYNCHRONOUS_MACHINE__POLE_PAIR_NUMBER:
            return isSetPolePairNumber();
        case CimPackage.ASYNCHRONOUS_MACHINE__CONVERTER_FED_DRIVE:
            return isSetConverterFedDrive();
        case CimPackage.ASYNCHRONOUS_MACHINE__IA_IR_RATIO:
            return isSetIaIrRatio();
        case CimPackage.ASYNCHRONOUS_MACHINE__ASYNCHRONOUS_MACHINE_TYPE:
            return isSetAsynchronousMachineType();
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
        result.append( " (nominalFrequency: " );
        if( nominalFrequencyESet )
            result.append( nominalFrequency );
        else
            result.append( "<unset>" );
        result.append( ", nominalSpeed: " );
        if( nominalSpeedESet )
            result.append( nominalSpeed );
        else
            result.append( "<unset>" );
        result.append( ", ratedMechanicalPower: " );
        if( ratedMechanicalPowerESet )
            result.append( ratedMechanicalPower );
        else
            result.append( "<unset>" );
        result.append( ", reversible: " );
        if( reversibleESet )
            result.append( reversible );
        else
            result.append( "<unset>" );
        result.append( ", rxLockedRotorRatio: " );
        if( rxLockedRotorRatioESet )
            result.append( rxLockedRotorRatio );
        else
            result.append( "<unset>" );
        result.append( ", efficiency: " );
        if( efficiencyESet )
            result.append( efficiency );
        else
            result.append( "<unset>" );
        result.append( ", polePairNumber: " );
        if( polePairNumberESet )
            result.append( polePairNumber );
        else
            result.append( "<unset>" );
        result.append( ", converterFedDrive: " );
        if( converterFedDriveESet )
            result.append( converterFedDrive );
        else
            result.append( "<unset>" );
        result.append( ", iaIrRatio: " );
        if( iaIrRatioESet )
            result.append( iaIrRatio );
        else
            result.append( "<unset>" );
        result.append( ", asynchronousMachineType: " );
        if( asynchronousMachineTypeESet )
            result.append( asynchronousMachineType );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //AsynchronousMachineImpl

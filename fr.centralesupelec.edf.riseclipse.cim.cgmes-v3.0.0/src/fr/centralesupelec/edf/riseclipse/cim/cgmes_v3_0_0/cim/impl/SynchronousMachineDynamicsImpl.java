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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CrossCompoundTurbineGovernorDynamics;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcitationSystemDynamics;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GenICompensationForGenJ;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.MechanicalLoadDynamics;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachine;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineDynamics;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbineGovernorDynamics;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Synchronous Machine Dynamics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.SynchronousMachineDynamicsImpl#getCrossCompoundTurbineGovernorDyanmics <em>Cross Compound Turbine Governor Dyanmics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.SynchronousMachineDynamicsImpl#getExcitationSystemDynamics <em>Excitation System Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.SynchronousMachineDynamicsImpl#getSynchronousMachine <em>Synchronous Machine</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.SynchronousMachineDynamicsImpl#getCrossCompoundTurbineGovernorDynamics <em>Cross Compound Turbine Governor Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.SynchronousMachineDynamicsImpl#getGenICompensationForGenJ <em>Gen ICompensation For Gen J</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.SynchronousMachineDynamicsImpl#getTurbineGovernorDynamics <em>Turbine Governor Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.SynchronousMachineDynamicsImpl#getMechanicalLoadDynamics <em>Mechanical Load Dynamics</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SynchronousMachineDynamicsImpl extends RotatingMachineDynamicsImpl implements SynchronousMachineDynamics {
    /**
     * The cached value of the '{@link #getCrossCompoundTurbineGovernorDyanmics() <em>Cross Compound Turbine Governor Dyanmics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCrossCompoundTurbineGovernorDyanmics()
     * @generated
     * @ordered
     */
    protected CrossCompoundTurbineGovernorDynamics crossCompoundTurbineGovernorDyanmics;

    /**
     * This is true if the Cross Compound Turbine Governor Dyanmics reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean crossCompoundTurbineGovernorDyanmicsESet;

    /**
     * The cached value of the '{@link #getExcitationSystemDynamics() <em>Excitation System Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExcitationSystemDynamics()
     * @generated
     * @ordered
     */
    protected ExcitationSystemDynamics excitationSystemDynamics;

    /**
     * This is true if the Excitation System Dynamics reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean excitationSystemDynamicsESet;

    /**
     * The cached value of the '{@link #getSynchronousMachine() <em>Synchronous Machine</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSynchronousMachine()
     * @generated
     * @ordered
     */
    protected SynchronousMachine synchronousMachine;

    /**
     * This is true if the Synchronous Machine reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean synchronousMachineESet;

    /**
     * The cached value of the '{@link #getCrossCompoundTurbineGovernorDynamics() <em>Cross Compound Turbine Governor Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCrossCompoundTurbineGovernorDynamics()
     * @generated
     * @ordered
     */
    protected CrossCompoundTurbineGovernorDynamics crossCompoundTurbineGovernorDynamics;

    /**
     * This is true if the Cross Compound Turbine Governor Dynamics reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean crossCompoundTurbineGovernorDynamicsESet;

    /**
     * The cached value of the '{@link #getGenICompensationForGenJ() <em>Gen ICompensation For Gen J</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGenICompensationForGenJ()
     * @generated
     * @ordered
     */
    protected EList< GenICompensationForGenJ > genICompensationForGenJ;

    /**
     * The cached value of the '{@link #getTurbineGovernorDynamics() <em>Turbine Governor Dynamics</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTurbineGovernorDynamics()
     * @generated
     * @ordered
     */
    protected EList< TurbineGovernorDynamics > turbineGovernorDynamics;

    /**
     * The cached value of the '{@link #getMechanicalLoadDynamics() <em>Mechanical Load Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMechanicalLoadDynamics()
     * @generated
     * @ordered
     */
    protected MechanicalLoadDynamics mechanicalLoadDynamics;

    /**
     * This is true if the Mechanical Load Dynamics reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean mechanicalLoadDynamicsESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SynchronousMachineDynamicsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getSynchronousMachineDynamics();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CrossCompoundTurbineGovernorDynamics getCrossCompoundTurbineGovernorDyanmics() {
        if( crossCompoundTurbineGovernorDyanmics != null && crossCompoundTurbineGovernorDyanmics.eIsProxy() ) {
            InternalEObject oldCrossCompoundTurbineGovernorDyanmics = ( InternalEObject ) crossCompoundTurbineGovernorDyanmics;
            crossCompoundTurbineGovernorDyanmics = ( CrossCompoundTurbineGovernorDynamics ) eResolveProxy(
                    oldCrossCompoundTurbineGovernorDyanmics );
            if( crossCompoundTurbineGovernorDyanmics != oldCrossCompoundTurbineGovernorDyanmics ) {
                if( eNotificationRequired() ) {
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                            CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__CROSS_COMPOUND_TURBINE_GOVERNOR_DYANMICS,
                            oldCrossCompoundTurbineGovernorDyanmics, crossCompoundTurbineGovernorDyanmics ) );
                }
            }
        }
        return crossCompoundTurbineGovernorDyanmics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CrossCompoundTurbineGovernorDynamics basicGetCrossCompoundTurbineGovernorDyanmics() {
        return crossCompoundTurbineGovernorDyanmics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCrossCompoundTurbineGovernorDyanmics(
            CrossCompoundTurbineGovernorDynamics newCrossCompoundTurbineGovernorDyanmics, NotificationChain msgs ) {
        CrossCompoundTurbineGovernorDynamics oldCrossCompoundTurbineGovernorDyanmics = crossCompoundTurbineGovernorDyanmics;
        crossCompoundTurbineGovernorDyanmics = newCrossCompoundTurbineGovernorDyanmics;
        boolean oldCrossCompoundTurbineGovernorDyanmicsESet = crossCompoundTurbineGovernorDyanmicsESet;
        crossCompoundTurbineGovernorDyanmicsESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__CROSS_COMPOUND_TURBINE_GOVERNOR_DYANMICS,
                    oldCrossCompoundTurbineGovernorDyanmics, newCrossCompoundTurbineGovernorDyanmics,
                    !oldCrossCompoundTurbineGovernorDyanmicsESet );
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
    public void setCrossCompoundTurbineGovernorDyanmics(
            CrossCompoundTurbineGovernorDynamics newCrossCompoundTurbineGovernorDyanmics ) {
        if( newCrossCompoundTurbineGovernorDyanmics != crossCompoundTurbineGovernorDyanmics ) {
            NotificationChain msgs = null;
            if( crossCompoundTurbineGovernorDyanmics != null ) {
                msgs = ( ( InternalEObject ) crossCompoundTurbineGovernorDyanmics ).eInverseRemove( this,
                        CimPackage.CROSS_COMPOUND_TURBINE_GOVERNOR_DYNAMICS__HIGH_PRESSURE_SYNCHRONOUS_MACHINE_DYNAMICS,
                        CrossCompoundTurbineGovernorDynamics.class, msgs );
            }
            if( newCrossCompoundTurbineGovernorDyanmics != null ) {
                msgs = ( ( InternalEObject ) newCrossCompoundTurbineGovernorDyanmics ).eInverseAdd( this,
                        CimPackage.CROSS_COMPOUND_TURBINE_GOVERNOR_DYNAMICS__HIGH_PRESSURE_SYNCHRONOUS_MACHINE_DYNAMICS,
                        CrossCompoundTurbineGovernorDynamics.class, msgs );
            }
            msgs = basicSetCrossCompoundTurbineGovernorDyanmics( newCrossCompoundTurbineGovernorDyanmics, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldCrossCompoundTurbineGovernorDyanmicsESet = crossCompoundTurbineGovernorDyanmicsESet;
            crossCompoundTurbineGovernorDyanmicsESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET,
                        CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__CROSS_COMPOUND_TURBINE_GOVERNOR_DYANMICS,
                        newCrossCompoundTurbineGovernorDyanmics, newCrossCompoundTurbineGovernorDyanmics,
                        !oldCrossCompoundTurbineGovernorDyanmicsESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetCrossCompoundTurbineGovernorDyanmics( NotificationChain msgs ) {
        CrossCompoundTurbineGovernorDynamics oldCrossCompoundTurbineGovernorDyanmics = crossCompoundTurbineGovernorDyanmics;
        crossCompoundTurbineGovernorDyanmics = null;
        boolean oldCrossCompoundTurbineGovernorDyanmicsESet = crossCompoundTurbineGovernorDyanmicsESet;
        crossCompoundTurbineGovernorDyanmicsESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__CROSS_COMPOUND_TURBINE_GOVERNOR_DYANMICS,
                    oldCrossCompoundTurbineGovernorDyanmics, null, oldCrossCompoundTurbineGovernorDyanmicsESet );
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
    public void unsetCrossCompoundTurbineGovernorDyanmics() {
        if( crossCompoundTurbineGovernorDyanmics != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) crossCompoundTurbineGovernorDyanmics ).eInverseRemove( this,
                    CimPackage.CROSS_COMPOUND_TURBINE_GOVERNOR_DYNAMICS__HIGH_PRESSURE_SYNCHRONOUS_MACHINE_DYNAMICS,
                    CrossCompoundTurbineGovernorDynamics.class, msgs );
            msgs = basicUnsetCrossCompoundTurbineGovernorDyanmics( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldCrossCompoundTurbineGovernorDyanmicsESet = crossCompoundTurbineGovernorDyanmicsESet;
            crossCompoundTurbineGovernorDyanmicsESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__CROSS_COMPOUND_TURBINE_GOVERNOR_DYANMICS, null, null,
                        oldCrossCompoundTurbineGovernorDyanmicsESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCrossCompoundTurbineGovernorDyanmics() {
        return crossCompoundTurbineGovernorDyanmicsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcitationSystemDynamics getExcitationSystemDynamics() {
        if( excitationSystemDynamics != null && excitationSystemDynamics.eIsProxy() ) {
            InternalEObject oldExcitationSystemDynamics = ( InternalEObject ) excitationSystemDynamics;
            excitationSystemDynamics = ( ExcitationSystemDynamics ) eResolveProxy( oldExcitationSystemDynamics );
            if( excitationSystemDynamics != oldExcitationSystemDynamics ) {
                if( eNotificationRequired() ) {
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                            CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS,
                            oldExcitationSystemDynamics, excitationSystemDynamics ) );
                }
            }
        }
        return excitationSystemDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ExcitationSystemDynamics basicGetExcitationSystemDynamics() {
        return excitationSystemDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetExcitationSystemDynamics( ExcitationSystemDynamics newExcitationSystemDynamics,
            NotificationChain msgs ) {
        ExcitationSystemDynamics oldExcitationSystemDynamics = excitationSystemDynamics;
        excitationSystemDynamics = newExcitationSystemDynamics;
        boolean oldExcitationSystemDynamicsESet = excitationSystemDynamicsESet;
        excitationSystemDynamicsESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS, oldExcitationSystemDynamics,
                    newExcitationSystemDynamics, !oldExcitationSystemDynamicsESet );
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
    public void setExcitationSystemDynamics( ExcitationSystemDynamics newExcitationSystemDynamics ) {
        if( newExcitationSystemDynamics != excitationSystemDynamics ) {
            NotificationChain msgs = null;
            if( excitationSystemDynamics != null ) {
                msgs = ( ( InternalEObject ) excitationSystemDynamics ).eInverseRemove( this,
                        CimPackage.EXCITATION_SYSTEM_DYNAMICS__SYNCHRONOUS_MACHINE_DYNAMICS,
                        ExcitationSystemDynamics.class, msgs );
            }
            if( newExcitationSystemDynamics != null ) {
                msgs = ( ( InternalEObject ) newExcitationSystemDynamics ).eInverseAdd( this,
                        CimPackage.EXCITATION_SYSTEM_DYNAMICS__SYNCHRONOUS_MACHINE_DYNAMICS,
                        ExcitationSystemDynamics.class, msgs );
            }
            msgs = basicSetExcitationSystemDynamics( newExcitationSystemDynamics, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldExcitationSystemDynamicsESet = excitationSystemDynamicsESet;
            excitationSystemDynamicsESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET,
                        CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS,
                        newExcitationSystemDynamics, newExcitationSystemDynamics, !oldExcitationSystemDynamicsESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetExcitationSystemDynamics( NotificationChain msgs ) {
        ExcitationSystemDynamics oldExcitationSystemDynamics = excitationSystemDynamics;
        excitationSystemDynamics = null;
        boolean oldExcitationSystemDynamicsESet = excitationSystemDynamicsESet;
        excitationSystemDynamicsESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS, oldExcitationSystemDynamics,
                    null, oldExcitationSystemDynamicsESet );
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
    public void unsetExcitationSystemDynamics() {
        if( excitationSystemDynamics != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) excitationSystemDynamics ).eInverseRemove( this,
                    CimPackage.EXCITATION_SYSTEM_DYNAMICS__SYNCHRONOUS_MACHINE_DYNAMICS, ExcitationSystemDynamics.class,
                    msgs );
            msgs = basicUnsetExcitationSystemDynamics( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldExcitationSystemDynamicsESet = excitationSystemDynamicsESet;
            excitationSystemDynamicsESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS, null, null,
                        oldExcitationSystemDynamicsESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetExcitationSystemDynamics() {
        return excitationSystemDynamicsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SynchronousMachine getSynchronousMachine() {
        return synchronousMachine;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSynchronousMachine( SynchronousMachine newSynchronousMachine,
            NotificationChain msgs ) {
        SynchronousMachine oldSynchronousMachine = synchronousMachine;
        synchronousMachine = newSynchronousMachine;
        boolean oldSynchronousMachineESet = synchronousMachineESet;
        synchronousMachineESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__SYNCHRONOUS_MACHINE, oldSynchronousMachine,
                    newSynchronousMachine, !oldSynchronousMachineESet );
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
    public void setSynchronousMachine( SynchronousMachine newSynchronousMachine ) {
        if( newSynchronousMachine != synchronousMachine ) {
            NotificationChain msgs = null;
            if( synchronousMachine != null ) {
                msgs = ( ( InternalEObject ) synchronousMachine ).eInverseRemove( this,
                        CimPackage.SYNCHRONOUS_MACHINE__SYNCHRONOUS_MACHINE_DYNAMICS, SynchronousMachine.class, msgs );
            }
            if( newSynchronousMachine != null ) {
                msgs = ( ( InternalEObject ) newSynchronousMachine ).eInverseAdd( this,
                        CimPackage.SYNCHRONOUS_MACHINE__SYNCHRONOUS_MACHINE_DYNAMICS, SynchronousMachine.class, msgs );
            }
            msgs = basicSetSynchronousMachine( newSynchronousMachine, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldSynchronousMachineESet = synchronousMachineESet;
            synchronousMachineESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET,
                        CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__SYNCHRONOUS_MACHINE, newSynchronousMachine,
                        newSynchronousMachine, !oldSynchronousMachineESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetSynchronousMachine( NotificationChain msgs ) {
        SynchronousMachine oldSynchronousMachine = synchronousMachine;
        synchronousMachine = null;
        boolean oldSynchronousMachineESet = synchronousMachineESet;
        synchronousMachineESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__SYNCHRONOUS_MACHINE, oldSynchronousMachine, null,
                    oldSynchronousMachineESet );
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
    public void unsetSynchronousMachine() {
        if( synchronousMachine != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) synchronousMachine ).eInverseRemove( this,
                    CimPackage.SYNCHRONOUS_MACHINE__SYNCHRONOUS_MACHINE_DYNAMICS, SynchronousMachine.class, msgs );
            msgs = basicUnsetSynchronousMachine( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldSynchronousMachineESet = synchronousMachineESet;
            synchronousMachineESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__SYNCHRONOUS_MACHINE, null, null,
                        oldSynchronousMachineESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSynchronousMachine() {
        return synchronousMachineESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CrossCompoundTurbineGovernorDynamics getCrossCompoundTurbineGovernorDynamics() {
        if( crossCompoundTurbineGovernorDynamics != null && crossCompoundTurbineGovernorDynamics.eIsProxy() ) {
            InternalEObject oldCrossCompoundTurbineGovernorDynamics = ( InternalEObject ) crossCompoundTurbineGovernorDynamics;
            crossCompoundTurbineGovernorDynamics = ( CrossCompoundTurbineGovernorDynamics ) eResolveProxy(
                    oldCrossCompoundTurbineGovernorDynamics );
            if( crossCompoundTurbineGovernorDynamics != oldCrossCompoundTurbineGovernorDynamics ) {
                if( eNotificationRequired() ) {
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                            CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__CROSS_COMPOUND_TURBINE_GOVERNOR_DYNAMICS,
                            oldCrossCompoundTurbineGovernorDynamics, crossCompoundTurbineGovernorDynamics ) );
                }
            }
        }
        return crossCompoundTurbineGovernorDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CrossCompoundTurbineGovernorDynamics basicGetCrossCompoundTurbineGovernorDynamics() {
        return crossCompoundTurbineGovernorDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCrossCompoundTurbineGovernorDynamics(
            CrossCompoundTurbineGovernorDynamics newCrossCompoundTurbineGovernorDynamics, NotificationChain msgs ) {
        CrossCompoundTurbineGovernorDynamics oldCrossCompoundTurbineGovernorDynamics = crossCompoundTurbineGovernorDynamics;
        crossCompoundTurbineGovernorDynamics = newCrossCompoundTurbineGovernorDynamics;
        boolean oldCrossCompoundTurbineGovernorDynamicsESet = crossCompoundTurbineGovernorDynamicsESet;
        crossCompoundTurbineGovernorDynamicsESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__CROSS_COMPOUND_TURBINE_GOVERNOR_DYNAMICS,
                    oldCrossCompoundTurbineGovernorDynamics, newCrossCompoundTurbineGovernorDynamics,
                    !oldCrossCompoundTurbineGovernorDynamicsESet );
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
    public void setCrossCompoundTurbineGovernorDynamics(
            CrossCompoundTurbineGovernorDynamics newCrossCompoundTurbineGovernorDynamics ) {
        if( newCrossCompoundTurbineGovernorDynamics != crossCompoundTurbineGovernorDynamics ) {
            NotificationChain msgs = null;
            if( crossCompoundTurbineGovernorDynamics != null ) {
                msgs = ( ( InternalEObject ) crossCompoundTurbineGovernorDynamics ).eInverseRemove( this,
                        CimPackage.CROSS_COMPOUND_TURBINE_GOVERNOR_DYNAMICS__LOW_PRESSURE_SYNCHRONOUS_MACHINE_DYNAMICS,
                        CrossCompoundTurbineGovernorDynamics.class, msgs );
            }
            if( newCrossCompoundTurbineGovernorDynamics != null ) {
                msgs = ( ( InternalEObject ) newCrossCompoundTurbineGovernorDynamics ).eInverseAdd( this,
                        CimPackage.CROSS_COMPOUND_TURBINE_GOVERNOR_DYNAMICS__LOW_PRESSURE_SYNCHRONOUS_MACHINE_DYNAMICS,
                        CrossCompoundTurbineGovernorDynamics.class, msgs );
            }
            msgs = basicSetCrossCompoundTurbineGovernorDynamics( newCrossCompoundTurbineGovernorDynamics, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldCrossCompoundTurbineGovernorDynamicsESet = crossCompoundTurbineGovernorDynamicsESet;
            crossCompoundTurbineGovernorDynamicsESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET,
                        CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__CROSS_COMPOUND_TURBINE_GOVERNOR_DYNAMICS,
                        newCrossCompoundTurbineGovernorDynamics, newCrossCompoundTurbineGovernorDynamics,
                        !oldCrossCompoundTurbineGovernorDynamicsESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetCrossCompoundTurbineGovernorDynamics( NotificationChain msgs ) {
        CrossCompoundTurbineGovernorDynamics oldCrossCompoundTurbineGovernorDynamics = crossCompoundTurbineGovernorDynamics;
        crossCompoundTurbineGovernorDynamics = null;
        boolean oldCrossCompoundTurbineGovernorDynamicsESet = crossCompoundTurbineGovernorDynamicsESet;
        crossCompoundTurbineGovernorDynamicsESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__CROSS_COMPOUND_TURBINE_GOVERNOR_DYNAMICS,
                    oldCrossCompoundTurbineGovernorDynamics, null, oldCrossCompoundTurbineGovernorDynamicsESet );
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
    public void unsetCrossCompoundTurbineGovernorDynamics() {
        if( crossCompoundTurbineGovernorDynamics != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) crossCompoundTurbineGovernorDynamics ).eInverseRemove( this,
                    CimPackage.CROSS_COMPOUND_TURBINE_GOVERNOR_DYNAMICS__LOW_PRESSURE_SYNCHRONOUS_MACHINE_DYNAMICS,
                    CrossCompoundTurbineGovernorDynamics.class, msgs );
            msgs = basicUnsetCrossCompoundTurbineGovernorDynamics( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldCrossCompoundTurbineGovernorDynamicsESet = crossCompoundTurbineGovernorDynamicsESet;
            crossCompoundTurbineGovernorDynamicsESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__CROSS_COMPOUND_TURBINE_GOVERNOR_DYNAMICS, null, null,
                        oldCrossCompoundTurbineGovernorDynamicsESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCrossCompoundTurbineGovernorDynamics() {
        return crossCompoundTurbineGovernorDynamicsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< GenICompensationForGenJ > getGenICompensationForGenJ() {
        if( genICompensationForGenJ == null ) {
            genICompensationForGenJ = new EObjectWithInverseResolvingEList.Unsettable< >(
                    GenICompensationForGenJ.class, this,
                    CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__GEN_ICOMPENSATION_FOR_GEN_J,
                    CimPackage.GEN_ICOMPENSATION_FOR_GEN_J__SYNCHRONOUS_MACHINE_DYNAMICS );
        }
        return genICompensationForGenJ;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGenICompensationForGenJ() {
        if( genICompensationForGenJ != null ) {
            ( ( InternalEList.Unsettable< ? > ) genICompensationForGenJ ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGenICompensationForGenJ() {
        return genICompensationForGenJ != null && ( ( InternalEList.Unsettable< ? > ) genICompensationForGenJ ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< TurbineGovernorDynamics > getTurbineGovernorDynamics() {
        if( turbineGovernorDynamics == null ) {
            turbineGovernorDynamics = new EObjectWithInverseResolvingEList.Unsettable< >(
                    TurbineGovernorDynamics.class, this,
                    CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__TURBINE_GOVERNOR_DYNAMICS,
                    CimPackage.TURBINE_GOVERNOR_DYNAMICS__SYNCHRONOUS_MACHINE_DYNAMICS );
        }
        return turbineGovernorDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTurbineGovernorDynamics() {
        if( turbineGovernorDynamics != null ) {
            ( ( InternalEList.Unsettable< ? > ) turbineGovernorDynamics ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTurbineGovernorDynamics() {
        return turbineGovernorDynamics != null && ( ( InternalEList.Unsettable< ? > ) turbineGovernorDynamics ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MechanicalLoadDynamics getMechanicalLoadDynamics() {
        if( mechanicalLoadDynamics != null && mechanicalLoadDynamics.eIsProxy() ) {
            InternalEObject oldMechanicalLoadDynamics = ( InternalEObject ) mechanicalLoadDynamics;
            mechanicalLoadDynamics = ( MechanicalLoadDynamics ) eResolveProxy( oldMechanicalLoadDynamics );
            if( mechanicalLoadDynamics != oldMechanicalLoadDynamics ) {
                if( eNotificationRequired() ) {
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                            CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__MECHANICAL_LOAD_DYNAMICS,
                            oldMechanicalLoadDynamics, mechanicalLoadDynamics ) );
                }
            }
        }
        return mechanicalLoadDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MechanicalLoadDynamics basicGetMechanicalLoadDynamics() {
        return mechanicalLoadDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMechanicalLoadDynamics( MechanicalLoadDynamics newMechanicalLoadDynamics,
            NotificationChain msgs ) {
        MechanicalLoadDynamics oldMechanicalLoadDynamics = mechanicalLoadDynamics;
        mechanicalLoadDynamics = newMechanicalLoadDynamics;
        boolean oldMechanicalLoadDynamicsESet = mechanicalLoadDynamicsESet;
        mechanicalLoadDynamicsESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__MECHANICAL_LOAD_DYNAMICS, oldMechanicalLoadDynamics,
                    newMechanicalLoadDynamics, !oldMechanicalLoadDynamicsESet );
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
    public void setMechanicalLoadDynamics( MechanicalLoadDynamics newMechanicalLoadDynamics ) {
        if( newMechanicalLoadDynamics != mechanicalLoadDynamics ) {
            NotificationChain msgs = null;
            if( mechanicalLoadDynamics != null ) {
                msgs = ( ( InternalEObject ) mechanicalLoadDynamics ).eInverseRemove( this,
                        CimPackage.MECHANICAL_LOAD_DYNAMICS__SYNCHRONOUS_MACHINE_DYNAMICS, MechanicalLoadDynamics.class,
                        msgs );
            }
            if( newMechanicalLoadDynamics != null ) {
                msgs = ( ( InternalEObject ) newMechanicalLoadDynamics ).eInverseAdd( this,
                        CimPackage.MECHANICAL_LOAD_DYNAMICS__SYNCHRONOUS_MACHINE_DYNAMICS, MechanicalLoadDynamics.class,
                        msgs );
            }
            msgs = basicSetMechanicalLoadDynamics( newMechanicalLoadDynamics, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldMechanicalLoadDynamicsESet = mechanicalLoadDynamicsESet;
            mechanicalLoadDynamicsESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET,
                        CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__MECHANICAL_LOAD_DYNAMICS, newMechanicalLoadDynamics,
                        newMechanicalLoadDynamics, !oldMechanicalLoadDynamicsESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetMechanicalLoadDynamics( NotificationChain msgs ) {
        MechanicalLoadDynamics oldMechanicalLoadDynamics = mechanicalLoadDynamics;
        mechanicalLoadDynamics = null;
        boolean oldMechanicalLoadDynamicsESet = mechanicalLoadDynamicsESet;
        mechanicalLoadDynamicsESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__MECHANICAL_LOAD_DYNAMICS, oldMechanicalLoadDynamics, null,
                    oldMechanicalLoadDynamicsESet );
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
    public void unsetMechanicalLoadDynamics() {
        if( mechanicalLoadDynamics != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) mechanicalLoadDynamics ).eInverseRemove( this,
                    CimPackage.MECHANICAL_LOAD_DYNAMICS__SYNCHRONOUS_MACHINE_DYNAMICS, MechanicalLoadDynamics.class,
                    msgs );
            msgs = basicUnsetMechanicalLoadDynamics( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldMechanicalLoadDynamicsESet = mechanicalLoadDynamicsESet;
            mechanicalLoadDynamicsESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__MECHANICAL_LOAD_DYNAMICS, null, null,
                        oldMechanicalLoadDynamicsESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMechanicalLoadDynamics() {
        return mechanicalLoadDynamicsESet;
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
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__CROSS_COMPOUND_TURBINE_GOVERNOR_DYANMICS:
            if( crossCompoundTurbineGovernorDyanmics != null ) {
                msgs = ( ( InternalEObject ) crossCompoundTurbineGovernorDyanmics ).eInverseRemove( this,
                        CimPackage.CROSS_COMPOUND_TURBINE_GOVERNOR_DYNAMICS__HIGH_PRESSURE_SYNCHRONOUS_MACHINE_DYNAMICS,
                        CrossCompoundTurbineGovernorDynamics.class, msgs );
            }
            return basicSetCrossCompoundTurbineGovernorDyanmics( ( CrossCompoundTurbineGovernorDynamics ) otherEnd,
                    msgs );
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS:
            if( excitationSystemDynamics != null ) {
                msgs = ( ( InternalEObject ) excitationSystemDynamics ).eInverseRemove( this,
                        CimPackage.EXCITATION_SYSTEM_DYNAMICS__SYNCHRONOUS_MACHINE_DYNAMICS,
                        ExcitationSystemDynamics.class, msgs );
            }
            return basicSetExcitationSystemDynamics( ( ExcitationSystemDynamics ) otherEnd, msgs );
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__SYNCHRONOUS_MACHINE:
            if( synchronousMachine != null ) {
                msgs = ( ( InternalEObject ) synchronousMachine ).eInverseRemove( this,
                        CimPackage.SYNCHRONOUS_MACHINE__SYNCHRONOUS_MACHINE_DYNAMICS, SynchronousMachine.class, msgs );
            }
            return basicSetSynchronousMachine( ( SynchronousMachine ) otherEnd, msgs );
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__CROSS_COMPOUND_TURBINE_GOVERNOR_DYNAMICS:
            if( crossCompoundTurbineGovernorDynamics != null ) {
                msgs = ( ( InternalEObject ) crossCompoundTurbineGovernorDynamics ).eInverseRemove( this,
                        CimPackage.CROSS_COMPOUND_TURBINE_GOVERNOR_DYNAMICS__LOW_PRESSURE_SYNCHRONOUS_MACHINE_DYNAMICS,
                        CrossCompoundTurbineGovernorDynamics.class, msgs );
            }
            return basicSetCrossCompoundTurbineGovernorDynamics( ( CrossCompoundTurbineGovernorDynamics ) otherEnd,
                    msgs );
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__GEN_ICOMPENSATION_FOR_GEN_J:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getGenICompensationForGenJ() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__TURBINE_GOVERNOR_DYNAMICS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getTurbineGovernorDynamics() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__MECHANICAL_LOAD_DYNAMICS:
            if( mechanicalLoadDynamics != null ) {
                msgs = ( ( InternalEObject ) mechanicalLoadDynamics ).eInverseRemove( this,
                        CimPackage.MECHANICAL_LOAD_DYNAMICS__SYNCHRONOUS_MACHINE_DYNAMICS, MechanicalLoadDynamics.class,
                        msgs );
            }
            return basicSetMechanicalLoadDynamics( ( MechanicalLoadDynamics ) otherEnd, msgs );
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
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__CROSS_COMPOUND_TURBINE_GOVERNOR_DYANMICS:
            return basicUnsetCrossCompoundTurbineGovernorDyanmics( msgs );
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS:
            return basicUnsetExcitationSystemDynamics( msgs );
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__SYNCHRONOUS_MACHINE:
            return basicUnsetSynchronousMachine( msgs );
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__CROSS_COMPOUND_TURBINE_GOVERNOR_DYNAMICS:
            return basicUnsetCrossCompoundTurbineGovernorDynamics( msgs );
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__GEN_ICOMPENSATION_FOR_GEN_J:
            return ( ( InternalEList< ? > ) getGenICompensationForGenJ() ).basicRemove( otherEnd, msgs );
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__TURBINE_GOVERNOR_DYNAMICS:
            return ( ( InternalEList< ? > ) getTurbineGovernorDynamics() ).basicRemove( otherEnd, msgs );
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__MECHANICAL_LOAD_DYNAMICS:
            return basicUnsetMechanicalLoadDynamics( msgs );
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
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__CROSS_COMPOUND_TURBINE_GOVERNOR_DYANMICS:
            if( resolve ) {
                return getCrossCompoundTurbineGovernorDyanmics();
            }
            return basicGetCrossCompoundTurbineGovernorDyanmics();
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS:
            if( resolve ) {
                return getExcitationSystemDynamics();
            }
            return basicGetExcitationSystemDynamics();
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__SYNCHRONOUS_MACHINE:
            return getSynchronousMachine();
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__CROSS_COMPOUND_TURBINE_GOVERNOR_DYNAMICS:
            if( resolve ) {
                return getCrossCompoundTurbineGovernorDynamics();
            }
            return basicGetCrossCompoundTurbineGovernorDynamics();
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__GEN_ICOMPENSATION_FOR_GEN_J:
            return getGenICompensationForGenJ();
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__TURBINE_GOVERNOR_DYNAMICS:
            return getTurbineGovernorDynamics();
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__MECHANICAL_LOAD_DYNAMICS:
            if( resolve ) {
                return getMechanicalLoadDynamics();
            }
            return basicGetMechanicalLoadDynamics();
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
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__CROSS_COMPOUND_TURBINE_GOVERNOR_DYANMICS:
            setCrossCompoundTurbineGovernorDyanmics( ( CrossCompoundTurbineGovernorDynamics ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS:
            setExcitationSystemDynamics( ( ExcitationSystemDynamics ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__SYNCHRONOUS_MACHINE:
            setSynchronousMachine( ( SynchronousMachine ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__CROSS_COMPOUND_TURBINE_GOVERNOR_DYNAMICS:
            setCrossCompoundTurbineGovernorDynamics( ( CrossCompoundTurbineGovernorDynamics ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__GEN_ICOMPENSATION_FOR_GEN_J:
            getGenICompensationForGenJ().clear();
            getGenICompensationForGenJ().addAll( ( Collection< ? extends GenICompensationForGenJ > ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__TURBINE_GOVERNOR_DYNAMICS:
            getTurbineGovernorDynamics().clear();
            getTurbineGovernorDynamics().addAll( ( Collection< ? extends TurbineGovernorDynamics > ) newValue );
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__MECHANICAL_LOAD_DYNAMICS:
            setMechanicalLoadDynamics( ( MechanicalLoadDynamics ) newValue );
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
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__CROSS_COMPOUND_TURBINE_GOVERNOR_DYANMICS:
            unsetCrossCompoundTurbineGovernorDyanmics();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS:
            unsetExcitationSystemDynamics();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__SYNCHRONOUS_MACHINE:
            unsetSynchronousMachine();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__CROSS_COMPOUND_TURBINE_GOVERNOR_DYNAMICS:
            unsetCrossCompoundTurbineGovernorDynamics();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__GEN_ICOMPENSATION_FOR_GEN_J:
            unsetGenICompensationForGenJ();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__TURBINE_GOVERNOR_DYNAMICS:
            unsetTurbineGovernorDynamics();
            return;
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__MECHANICAL_LOAD_DYNAMICS:
            unsetMechanicalLoadDynamics();
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
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__CROSS_COMPOUND_TURBINE_GOVERNOR_DYANMICS:
            return isSetCrossCompoundTurbineGovernorDyanmics();
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__EXCITATION_SYSTEM_DYNAMICS:
            return isSetExcitationSystemDynamics();
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__SYNCHRONOUS_MACHINE:
            return isSetSynchronousMachine();
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__CROSS_COMPOUND_TURBINE_GOVERNOR_DYNAMICS:
            return isSetCrossCompoundTurbineGovernorDynamics();
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__GEN_ICOMPENSATION_FOR_GEN_J:
            return isSetGenICompensationForGenJ();
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__TURBINE_GOVERNOR_DYNAMICS:
            return isSetTurbineGovernorDynamics();
        case CimPackage.SYNCHRONOUS_MACHINE_DYNAMICS__MECHANICAL_LOAD_DYNAMICS:
            return isSetMechanicalLoadDynamics();
        }
        return super.eIsSet( featureID );
    }

} //SynchronousMachineDynamicsImpl

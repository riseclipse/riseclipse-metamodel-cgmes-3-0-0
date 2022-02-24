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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConnectivityNode;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConnectivityNodeContainer;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ReportingGroup;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvInjection;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvVoltage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Terminal;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalIsland;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Topological Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.TopologicalNodeImpl#getAngleRefTopologicalIsland <em>Angle Ref Topological Island</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.TopologicalNodeImpl#getSvInjection <em>Sv Injection</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.TopologicalNodeImpl#getSvVoltage <em>Sv Voltage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.TopologicalNodeImpl#getTopologicalIsland <em>Topological Island</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.TopologicalNodeImpl#getConnectivityNodes <em>Connectivity Nodes</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.TopologicalNodeImpl#getReportingGroup <em>Reporting Group</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.TopologicalNodeImpl#getBaseVoltage <em>Base Voltage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.TopologicalNodeImpl#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.TopologicalNodeImpl#getConnectivityNodeContainer <em>Connectivity Node Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TopologicalNodeImpl extends IdentifiedObjectImpl implements TopologicalNode {
    /**
     * The cached value of the '{@link #getAngleRefTopologicalIsland() <em>Angle Ref Topological Island</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAngleRefTopologicalIsland()
     * @generated
     * @ordered
     */
    protected TopologicalIsland angleRefTopologicalIsland;

    /**
     * This is true if the Angle Ref Topological Island reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean angleRefTopologicalIslandESet;

    /**
     * The cached value of the '{@link #getSvInjection() <em>Sv Injection</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSvInjection()
     * @generated
     * @ordered
     */
    protected SvInjection svInjection;

    /**
     * This is true if the Sv Injection reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean svInjectionESet;

    /**
     * The cached value of the '{@link #getSvVoltage() <em>Sv Voltage</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSvVoltage()
     * @generated
     * @ordered
     */
    protected SvVoltage svVoltage;

    /**
     * This is true if the Sv Voltage reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean svVoltageESet;

    /**
     * The cached value of the '{@link #getTopologicalIsland() <em>Topological Island</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTopologicalIsland()
     * @generated
     * @ordered
     */
    protected TopologicalIsland topologicalIsland;

    /**
     * This is true if the Topological Island reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean topologicalIslandESet;

    /**
     * The cached value of the '{@link #getConnectivityNodes() <em>Connectivity Nodes</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnectivityNodes()
     * @generated
     * @ordered
     */
    protected EList< ConnectivityNode > connectivityNodes;

    /**
     * The cached value of the '{@link #getReportingGroup() <em>Reporting Group</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReportingGroup()
     * @generated
     * @ordered
     */
    protected ReportingGroup reportingGroup;

    /**
     * This is true if the Reporting Group reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean reportingGroupESet;

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
     * The cached value of the '{@link #getTerminal() <em>Terminal</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTerminal()
     * @generated
     * @ordered
     */
    protected EList< Terminal > terminal;

    /**
     * The cached value of the '{@link #getConnectivityNodeContainer() <em>Connectivity Node Container</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnectivityNodeContainer()
     * @generated
     * @ordered
     */
    protected ConnectivityNodeContainer connectivityNodeContainer;

    /**
     * This is true if the Connectivity Node Container reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean connectivityNodeContainerESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TopologicalNodeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getTopologicalNode();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TopologicalIsland getAngleRefTopologicalIsland() {
        if( angleRefTopologicalIsland != null && angleRefTopologicalIsland.eIsProxy() ) {
            InternalEObject oldAngleRefTopologicalIsland = ( InternalEObject ) angleRefTopologicalIsland;
            angleRefTopologicalIsland = ( TopologicalIsland ) eResolveProxy( oldAngleRefTopologicalIsland );
            if( angleRefTopologicalIsland != oldAngleRefTopologicalIsland ) {
                if( eNotificationRequired() )
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                            CimPackage.TOPOLOGICAL_NODE__ANGLE_REF_TOPOLOGICAL_ISLAND, oldAngleRefTopologicalIsland,
                            angleRefTopologicalIsland ) );
            }
        }
        return angleRefTopologicalIsland;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TopologicalIsland basicGetAngleRefTopologicalIsland() {
        return angleRefTopologicalIsland;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAngleRefTopologicalIsland( TopologicalIsland newAngleRefTopologicalIsland,
            NotificationChain msgs ) {
        TopologicalIsland oldAngleRefTopologicalIsland = angleRefTopologicalIsland;
        angleRefTopologicalIsland = newAngleRefTopologicalIsland;
        boolean oldAngleRefTopologicalIslandESet = angleRefTopologicalIslandESet;
        angleRefTopologicalIslandESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TOPOLOGICAL_NODE__ANGLE_REF_TOPOLOGICAL_ISLAND, oldAngleRefTopologicalIsland,
                    newAngleRefTopologicalIsland, !oldAngleRefTopologicalIslandESet );
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
    public void setAngleRefTopologicalIsland( TopologicalIsland newAngleRefTopologicalIsland ) {
        if( newAngleRefTopologicalIsland != angleRefTopologicalIsland ) {
            NotificationChain msgs = null;
            if( angleRefTopologicalIsland != null )
                msgs = ( ( InternalEObject ) angleRefTopologicalIsland ).eInverseRemove( this,
                        CimPackage.TOPOLOGICAL_ISLAND__ANGLE_REF_TOPOLOGICAL_NODE, TopologicalIsland.class, msgs );
            if( newAngleRefTopologicalIsland != null )
                msgs = ( ( InternalEObject ) newAngleRefTopologicalIsland ).eInverseAdd( this,
                        CimPackage.TOPOLOGICAL_ISLAND__ANGLE_REF_TOPOLOGICAL_NODE, TopologicalIsland.class, msgs );
            msgs = basicSetAngleRefTopologicalIsland( newAngleRefTopologicalIsland, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAngleRefTopologicalIslandESet = angleRefTopologicalIslandESet;
            angleRefTopologicalIslandESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        CimPackage.TOPOLOGICAL_NODE__ANGLE_REF_TOPOLOGICAL_ISLAND, newAngleRefTopologicalIsland,
                        newAngleRefTopologicalIsland, !oldAngleRefTopologicalIslandESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetAngleRefTopologicalIsland( NotificationChain msgs ) {
        TopologicalIsland oldAngleRefTopologicalIsland = angleRefTopologicalIsland;
        angleRefTopologicalIsland = null;
        boolean oldAngleRefTopologicalIslandESet = angleRefTopologicalIslandESet;
        angleRefTopologicalIslandESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TOPOLOGICAL_NODE__ANGLE_REF_TOPOLOGICAL_ISLAND, oldAngleRefTopologicalIsland, null,
                    oldAngleRefTopologicalIslandESet );
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
    public void unsetAngleRefTopologicalIsland() {
        if( angleRefTopologicalIsland != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) angleRefTopologicalIsland ).eInverseRemove( this,
                    CimPackage.TOPOLOGICAL_ISLAND__ANGLE_REF_TOPOLOGICAL_NODE, TopologicalIsland.class, msgs );
            msgs = basicUnsetAngleRefTopologicalIsland( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAngleRefTopologicalIslandESet = angleRefTopologicalIslandESet;
            angleRefTopologicalIslandESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.TOPOLOGICAL_NODE__ANGLE_REF_TOPOLOGICAL_ISLAND, null, null,
                        oldAngleRefTopologicalIslandESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAngleRefTopologicalIsland() {
        return angleRefTopologicalIslandESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SvInjection getSvInjection() {
        if( svInjection != null && svInjection.eIsProxy() ) {
            InternalEObject oldSvInjection = ( InternalEObject ) svInjection;
            svInjection = ( SvInjection ) eResolveProxy( oldSvInjection );
            if( svInjection != oldSvInjection ) {
                if( eNotificationRequired() )
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                            CimPackage.TOPOLOGICAL_NODE__SV_INJECTION, oldSvInjection, svInjection ) );
            }
        }
        return svInjection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SvInjection basicGetSvInjection() {
        return svInjection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSvInjection( SvInjection newSvInjection, NotificationChain msgs ) {
        SvInjection oldSvInjection = svInjection;
        svInjection = newSvInjection;
        boolean oldSvInjectionESet = svInjectionESet;
        svInjectionESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TOPOLOGICAL_NODE__SV_INJECTION, oldSvInjection, newSvInjection, !oldSvInjectionESet );
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
    public void setSvInjection( SvInjection newSvInjection ) {
        if( newSvInjection != svInjection ) {
            NotificationChain msgs = null;
            if( svInjection != null )
                msgs = ( ( InternalEObject ) svInjection ).eInverseRemove( this,
                        CimPackage.SV_INJECTION__TOPOLOGICAL_NODE, SvInjection.class, msgs );
            if( newSvInjection != null )
                msgs = ( ( InternalEObject ) newSvInjection ).eInverseAdd( this,
                        CimPackage.SV_INJECTION__TOPOLOGICAL_NODE, SvInjection.class, msgs );
            msgs = basicSetSvInjection( newSvInjection, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSvInjectionESet = svInjectionESet;
            svInjectionESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TOPOLOGICAL_NODE__SV_INJECTION,
                        newSvInjection, newSvInjection, !oldSvInjectionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetSvInjection( NotificationChain msgs ) {
        SvInjection oldSvInjection = svInjection;
        svInjection = null;
        boolean oldSvInjectionESet = svInjectionESet;
        svInjectionESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TOPOLOGICAL_NODE__SV_INJECTION, oldSvInjection, null, oldSvInjectionESet );
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
    public void unsetSvInjection() {
        if( svInjection != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) svInjection ).eInverseRemove( this, CimPackage.SV_INJECTION__TOPOLOGICAL_NODE,
                    SvInjection.class, msgs );
            msgs = basicUnsetSvInjection( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSvInjectionESet = svInjectionESet;
            svInjectionESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TOPOLOGICAL_NODE__SV_INJECTION,
                        null, null, oldSvInjectionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSvInjection() {
        return svInjectionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SvVoltage getSvVoltage() {
        if( svVoltage != null && svVoltage.eIsProxy() ) {
            InternalEObject oldSvVoltage = ( InternalEObject ) svVoltage;
            svVoltage = ( SvVoltage ) eResolveProxy( oldSvVoltage );
            if( svVoltage != oldSvVoltage ) {
                if( eNotificationRequired() )
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE, CimPackage.TOPOLOGICAL_NODE__SV_VOLTAGE,
                            oldSvVoltage, svVoltage ) );
            }
        }
        return svVoltage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SvVoltage basicGetSvVoltage() {
        return svVoltage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSvVoltage( SvVoltage newSvVoltage, NotificationChain msgs ) {
        SvVoltage oldSvVoltage = svVoltage;
        svVoltage = newSvVoltage;
        boolean oldSvVoltageESet = svVoltageESet;
        svVoltageESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TOPOLOGICAL_NODE__SV_VOLTAGE, oldSvVoltage, newSvVoltage, !oldSvVoltageESet );
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
    public void setSvVoltage( SvVoltage newSvVoltage ) {
        if( newSvVoltage != svVoltage ) {
            NotificationChain msgs = null;
            if( svVoltage != null )
                msgs = ( ( InternalEObject ) svVoltage ).eInverseRemove( this, CimPackage.SV_VOLTAGE__TOPOLOGICAL_NODE,
                        SvVoltage.class, msgs );
            if( newSvVoltage != null )
                msgs = ( ( InternalEObject ) newSvVoltage ).eInverseAdd( this, CimPackage.SV_VOLTAGE__TOPOLOGICAL_NODE,
                        SvVoltage.class, msgs );
            msgs = basicSetSvVoltage( newSvVoltage, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSvVoltageESet = svVoltageESet;
            svVoltageESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TOPOLOGICAL_NODE__SV_VOLTAGE,
                        newSvVoltage, newSvVoltage, !oldSvVoltageESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetSvVoltage( NotificationChain msgs ) {
        SvVoltage oldSvVoltage = svVoltage;
        svVoltage = null;
        boolean oldSvVoltageESet = svVoltageESet;
        svVoltageESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TOPOLOGICAL_NODE__SV_VOLTAGE, oldSvVoltage, null, oldSvVoltageESet );
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
    public void unsetSvVoltage() {
        if( svVoltage != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) svVoltage ).eInverseRemove( this, CimPackage.SV_VOLTAGE__TOPOLOGICAL_NODE,
                    SvVoltage.class, msgs );
            msgs = basicUnsetSvVoltage( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSvVoltageESet = svVoltageESet;
            svVoltageESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TOPOLOGICAL_NODE__SV_VOLTAGE, null,
                        null, oldSvVoltageESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSvVoltage() {
        return svVoltageESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TopologicalIsland getTopologicalIsland() {
        if( topologicalIsland != null && topologicalIsland.eIsProxy() ) {
            InternalEObject oldTopologicalIsland = ( InternalEObject ) topologicalIsland;
            topologicalIsland = ( TopologicalIsland ) eResolveProxy( oldTopologicalIsland );
            if( topologicalIsland != oldTopologicalIsland ) {
                if( eNotificationRequired() )
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                            CimPackage.TOPOLOGICAL_NODE__TOPOLOGICAL_ISLAND, oldTopologicalIsland,
                            topologicalIsland ) );
            }
        }
        return topologicalIsland;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TopologicalIsland basicGetTopologicalIsland() {
        return topologicalIsland;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTopologicalIsland( TopologicalIsland newTopologicalIsland,
            NotificationChain msgs ) {
        TopologicalIsland oldTopologicalIsland = topologicalIsland;
        topologicalIsland = newTopologicalIsland;
        boolean oldTopologicalIslandESet = topologicalIslandESet;
        topologicalIslandESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TOPOLOGICAL_NODE__TOPOLOGICAL_ISLAND, oldTopologicalIsland, newTopologicalIsland,
                    !oldTopologicalIslandESet );
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
    public void setTopologicalIsland( TopologicalIsland newTopologicalIsland ) {
        if( newTopologicalIsland != topologicalIsland ) {
            NotificationChain msgs = null;
            if( topologicalIsland != null )
                msgs = ( ( InternalEObject ) topologicalIsland ).eInverseRemove( this,
                        CimPackage.TOPOLOGICAL_ISLAND__TOPOLOGICAL_NODES, TopologicalIsland.class, msgs );
            if( newTopologicalIsland != null )
                msgs = ( ( InternalEObject ) newTopologicalIsland ).eInverseAdd( this,
                        CimPackage.TOPOLOGICAL_ISLAND__TOPOLOGICAL_NODES, TopologicalIsland.class, msgs );
            msgs = basicSetTopologicalIsland( newTopologicalIsland, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTopologicalIslandESet = topologicalIslandESet;
            topologicalIslandESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TOPOLOGICAL_NODE__TOPOLOGICAL_ISLAND,
                        newTopologicalIsland, newTopologicalIsland, !oldTopologicalIslandESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetTopologicalIsland( NotificationChain msgs ) {
        TopologicalIsland oldTopologicalIsland = topologicalIsland;
        topologicalIsland = null;
        boolean oldTopologicalIslandESet = topologicalIslandESet;
        topologicalIslandESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TOPOLOGICAL_NODE__TOPOLOGICAL_ISLAND, oldTopologicalIsland, null,
                    oldTopologicalIslandESet );
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
    public void unsetTopologicalIsland() {
        if( topologicalIsland != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) topologicalIsland ).eInverseRemove( this,
                    CimPackage.TOPOLOGICAL_ISLAND__TOPOLOGICAL_NODES, TopologicalIsland.class, msgs );
            msgs = basicUnsetTopologicalIsland( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTopologicalIslandESet = topologicalIslandESet;
            topologicalIslandESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.TOPOLOGICAL_NODE__TOPOLOGICAL_ISLAND, null, null, oldTopologicalIslandESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTopologicalIsland() {
        return topologicalIslandESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ConnectivityNode > getConnectivityNodes() {
        if( connectivityNodes == null ) {
            connectivityNodes = new EObjectWithInverseResolvingEList.Unsettable< >(
                    ConnectivityNode.class, this, CimPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODES,
                    CimPackage.CONNECTIVITY_NODE__TOPOLOGICAL_NODE );
        }
        return connectivityNodes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetConnectivityNodes() {
        if( connectivityNodes != null ) ( ( InternalEList.Unsettable< ? > ) connectivityNodes ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetConnectivityNodes() {
        return connectivityNodes != null && ( ( InternalEList.Unsettable< ? > ) connectivityNodes ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ReportingGroup getReportingGroup() {
        return reportingGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetReportingGroup( ReportingGroup newReportingGroup, NotificationChain msgs ) {
        ReportingGroup oldReportingGroup = reportingGroup;
        reportingGroup = newReportingGroup;
        boolean oldReportingGroupESet = reportingGroupESet;
        reportingGroupESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TOPOLOGICAL_NODE__REPORTING_GROUP, oldReportingGroup, newReportingGroup,
                    !oldReportingGroupESet );
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
    public void setReportingGroup( ReportingGroup newReportingGroup ) {
        if( newReportingGroup != reportingGroup ) {
            NotificationChain msgs = null;
            if( reportingGroup != null )
                msgs = ( ( InternalEObject ) reportingGroup ).eInverseRemove( this,
                        CimPackage.REPORTING_GROUP__TOPOLOGICAL_NODE, ReportingGroup.class, msgs );
            if( newReportingGroup != null )
                msgs = ( ( InternalEObject ) newReportingGroup ).eInverseAdd( this,
                        CimPackage.REPORTING_GROUP__TOPOLOGICAL_NODE, ReportingGroup.class, msgs );
            msgs = basicSetReportingGroup( newReportingGroup, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldReportingGroupESet = reportingGroupESet;
            reportingGroupESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TOPOLOGICAL_NODE__REPORTING_GROUP,
                        newReportingGroup, newReportingGroup, !oldReportingGroupESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetReportingGroup( NotificationChain msgs ) {
        ReportingGroup oldReportingGroup = reportingGroup;
        reportingGroup = null;
        boolean oldReportingGroupESet = reportingGroupESet;
        reportingGroupESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TOPOLOGICAL_NODE__REPORTING_GROUP, oldReportingGroup, null, oldReportingGroupESet );
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
    public void unsetReportingGroup() {
        if( reportingGroup != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) reportingGroup ).eInverseRemove( this,
                    CimPackage.REPORTING_GROUP__TOPOLOGICAL_NODE, ReportingGroup.class, msgs );
            msgs = basicUnsetReportingGroup( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldReportingGroupESet = reportingGroupESet;
            reportingGroupESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TOPOLOGICAL_NODE__REPORTING_GROUP,
                        null, null, oldReportingGroupESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReportingGroup() {
        return reportingGroupESet;
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
                    CimPackage.TOPOLOGICAL_NODE__BASE_VOLTAGE, oldBaseVoltage, newBaseVoltage, !oldBaseVoltageESet );
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
    public void setBaseVoltage( BaseVoltage newBaseVoltage ) {
        if( newBaseVoltage != baseVoltage ) {
            NotificationChain msgs = null;
            if( baseVoltage != null )
                msgs = ( ( InternalEObject ) baseVoltage ).eInverseRemove( this,
                        CimPackage.BASE_VOLTAGE__TOPOLOGICAL_NODE, BaseVoltage.class, msgs );
            if( newBaseVoltage != null )
                msgs = ( ( InternalEObject ) newBaseVoltage ).eInverseAdd( this,
                        CimPackage.BASE_VOLTAGE__TOPOLOGICAL_NODE, BaseVoltage.class, msgs );
            msgs = basicSetBaseVoltage( newBaseVoltage, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldBaseVoltageESet = baseVoltageESet;
            baseVoltageESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TOPOLOGICAL_NODE__BASE_VOLTAGE,
                        newBaseVoltage, newBaseVoltage, !oldBaseVoltageESet ) );
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
                    CimPackage.TOPOLOGICAL_NODE__BASE_VOLTAGE, oldBaseVoltage, null, oldBaseVoltageESet );
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
    public void unsetBaseVoltage() {
        if( baseVoltage != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) baseVoltage ).eInverseRemove( this, CimPackage.BASE_VOLTAGE__TOPOLOGICAL_NODE,
                    BaseVoltage.class, msgs );
            msgs = basicUnsetBaseVoltage( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldBaseVoltageESet = baseVoltageESet;
            baseVoltageESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TOPOLOGICAL_NODE__BASE_VOLTAGE,
                        null, null, oldBaseVoltageESet ) );
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
    public EList< Terminal > getTerminal() {
        if( terminal == null ) {
            terminal = new EObjectWithInverseResolvingEList.Unsettable< >( Terminal.class, this,
                    CimPackage.TOPOLOGICAL_NODE__TERMINAL, CimPackage.TERMINAL__TOPOLOGICAL_NODE );
        }
        return terminal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTerminal() {
        if( terminal != null ) ( ( InternalEList.Unsettable< ? > ) terminal ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTerminal() {
        return terminal != null && ( ( InternalEList.Unsettable< ? > ) terminal ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConnectivityNodeContainer getConnectivityNodeContainer() {
        return connectivityNodeContainer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetConnectivityNodeContainer( ConnectivityNodeContainer newConnectivityNodeContainer,
            NotificationChain msgs ) {
        ConnectivityNodeContainer oldConnectivityNodeContainer = connectivityNodeContainer;
        connectivityNodeContainer = newConnectivityNodeContainer;
        boolean oldConnectivityNodeContainerESet = connectivityNodeContainerESet;
        connectivityNodeContainerESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODE_CONTAINER, oldConnectivityNodeContainer,
                    newConnectivityNodeContainer, !oldConnectivityNodeContainerESet );
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
    public void setConnectivityNodeContainer( ConnectivityNodeContainer newConnectivityNodeContainer ) {
        if( newConnectivityNodeContainer != connectivityNodeContainer ) {
            NotificationChain msgs = null;
            if( connectivityNodeContainer != null )
                msgs = ( ( InternalEObject ) connectivityNodeContainer ).eInverseRemove( this,
                        CimPackage.CONNECTIVITY_NODE_CONTAINER__TOPOLOGICAL_NODE, ConnectivityNodeContainer.class,
                        msgs );
            if( newConnectivityNodeContainer != null )
                msgs = ( ( InternalEObject ) newConnectivityNodeContainer ).eInverseAdd( this,
                        CimPackage.CONNECTIVITY_NODE_CONTAINER__TOPOLOGICAL_NODE, ConnectivityNodeContainer.class,
                        msgs );
            msgs = basicSetConnectivityNodeContainer( newConnectivityNodeContainer, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldConnectivityNodeContainerESet = connectivityNodeContainerESet;
            connectivityNodeContainerESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        CimPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODE_CONTAINER, newConnectivityNodeContainer,
                        newConnectivityNodeContainer, !oldConnectivityNodeContainerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetConnectivityNodeContainer( NotificationChain msgs ) {
        ConnectivityNodeContainer oldConnectivityNodeContainer = connectivityNodeContainer;
        connectivityNodeContainer = null;
        boolean oldConnectivityNodeContainerESet = connectivityNodeContainerESet;
        connectivityNodeContainerESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODE_CONTAINER, oldConnectivityNodeContainer, null,
                    oldConnectivityNodeContainerESet );
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
    public void unsetConnectivityNodeContainer() {
        if( connectivityNodeContainer != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) connectivityNodeContainer ).eInverseRemove( this,
                    CimPackage.CONNECTIVITY_NODE_CONTAINER__TOPOLOGICAL_NODE, ConnectivityNodeContainer.class, msgs );
            msgs = basicUnsetConnectivityNodeContainer( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldConnectivityNodeContainerESet = connectivityNodeContainerESet;
            connectivityNodeContainerESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODE_CONTAINER, null, null,
                        oldConnectivityNodeContainerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetConnectivityNodeContainer() {
        return connectivityNodeContainerESet;
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
        case CimPackage.TOPOLOGICAL_NODE__ANGLE_REF_TOPOLOGICAL_ISLAND:
            if( angleRefTopologicalIsland != null )
                msgs = ( ( InternalEObject ) angleRefTopologicalIsland ).eInverseRemove( this,
                        CimPackage.TOPOLOGICAL_ISLAND__ANGLE_REF_TOPOLOGICAL_NODE, TopologicalIsland.class, msgs );
            return basicSetAngleRefTopologicalIsland( ( TopologicalIsland ) otherEnd, msgs );
        case CimPackage.TOPOLOGICAL_NODE__SV_INJECTION:
            if( svInjection != null )
                msgs = ( ( InternalEObject ) svInjection ).eInverseRemove( this,
                        CimPackage.SV_INJECTION__TOPOLOGICAL_NODE, SvInjection.class, msgs );
            return basicSetSvInjection( ( SvInjection ) otherEnd, msgs );
        case CimPackage.TOPOLOGICAL_NODE__SV_VOLTAGE:
            if( svVoltage != null )
                msgs = ( ( InternalEObject ) svVoltage ).eInverseRemove( this, CimPackage.SV_VOLTAGE__TOPOLOGICAL_NODE,
                        SvVoltage.class, msgs );
            return basicSetSvVoltage( ( SvVoltage ) otherEnd, msgs );
        case CimPackage.TOPOLOGICAL_NODE__TOPOLOGICAL_ISLAND:
            if( topologicalIsland != null )
                msgs = ( ( InternalEObject ) topologicalIsland ).eInverseRemove( this,
                        CimPackage.TOPOLOGICAL_ISLAND__TOPOLOGICAL_NODES, TopologicalIsland.class, msgs );
            return basicSetTopologicalIsland( ( TopologicalIsland ) otherEnd, msgs );
        case CimPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getConnectivityNodes() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.TOPOLOGICAL_NODE__REPORTING_GROUP:
            if( reportingGroup != null )
                msgs = ( ( InternalEObject ) reportingGroup ).eInverseRemove( this,
                        CimPackage.REPORTING_GROUP__TOPOLOGICAL_NODE, ReportingGroup.class, msgs );
            return basicSetReportingGroup( ( ReportingGroup ) otherEnd, msgs );
        case CimPackage.TOPOLOGICAL_NODE__BASE_VOLTAGE:
            if( baseVoltage != null )
                msgs = ( ( InternalEObject ) baseVoltage ).eInverseRemove( this,
                        CimPackage.BASE_VOLTAGE__TOPOLOGICAL_NODE, BaseVoltage.class, msgs );
            return basicSetBaseVoltage( ( BaseVoltage ) otherEnd, msgs );
        case CimPackage.TOPOLOGICAL_NODE__TERMINAL:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getTerminal() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODE_CONTAINER:
            if( connectivityNodeContainer != null )
                msgs = ( ( InternalEObject ) connectivityNodeContainer ).eInverseRemove( this,
                        CimPackage.CONNECTIVITY_NODE_CONTAINER__TOPOLOGICAL_NODE, ConnectivityNodeContainer.class,
                        msgs );
            return basicSetConnectivityNodeContainer( ( ConnectivityNodeContainer ) otherEnd, msgs );
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
        case CimPackage.TOPOLOGICAL_NODE__ANGLE_REF_TOPOLOGICAL_ISLAND:
            return basicUnsetAngleRefTopologicalIsland( msgs );
        case CimPackage.TOPOLOGICAL_NODE__SV_INJECTION:
            return basicUnsetSvInjection( msgs );
        case CimPackage.TOPOLOGICAL_NODE__SV_VOLTAGE:
            return basicUnsetSvVoltage( msgs );
        case CimPackage.TOPOLOGICAL_NODE__TOPOLOGICAL_ISLAND:
            return basicUnsetTopologicalIsland( msgs );
        case CimPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODES:
            return ( ( InternalEList< ? > ) getConnectivityNodes() ).basicRemove( otherEnd, msgs );
        case CimPackage.TOPOLOGICAL_NODE__REPORTING_GROUP:
            return basicUnsetReportingGroup( msgs );
        case CimPackage.TOPOLOGICAL_NODE__BASE_VOLTAGE:
            return basicUnsetBaseVoltage( msgs );
        case CimPackage.TOPOLOGICAL_NODE__TERMINAL:
            return ( ( InternalEList< ? > ) getTerminal() ).basicRemove( otherEnd, msgs );
        case CimPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODE_CONTAINER:
            return basicUnsetConnectivityNodeContainer( msgs );
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
        case CimPackage.TOPOLOGICAL_NODE__ANGLE_REF_TOPOLOGICAL_ISLAND:
            if( resolve ) return getAngleRefTopologicalIsland();
            return basicGetAngleRefTopologicalIsland();
        case CimPackage.TOPOLOGICAL_NODE__SV_INJECTION:
            if( resolve ) return getSvInjection();
            return basicGetSvInjection();
        case CimPackage.TOPOLOGICAL_NODE__SV_VOLTAGE:
            if( resolve ) return getSvVoltage();
            return basicGetSvVoltage();
        case CimPackage.TOPOLOGICAL_NODE__TOPOLOGICAL_ISLAND:
            if( resolve ) return getTopologicalIsland();
            return basicGetTopologicalIsland();
        case CimPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODES:
            return getConnectivityNodes();
        case CimPackage.TOPOLOGICAL_NODE__REPORTING_GROUP:
            return getReportingGroup();
        case CimPackage.TOPOLOGICAL_NODE__BASE_VOLTAGE:
            return getBaseVoltage();
        case CimPackage.TOPOLOGICAL_NODE__TERMINAL:
            return getTerminal();
        case CimPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODE_CONTAINER:
            return getConnectivityNodeContainer();
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
        case CimPackage.TOPOLOGICAL_NODE__ANGLE_REF_TOPOLOGICAL_ISLAND:
            setAngleRefTopologicalIsland( ( TopologicalIsland ) newValue );
            return;
        case CimPackage.TOPOLOGICAL_NODE__SV_INJECTION:
            setSvInjection( ( SvInjection ) newValue );
            return;
        case CimPackage.TOPOLOGICAL_NODE__SV_VOLTAGE:
            setSvVoltage( ( SvVoltage ) newValue );
            return;
        case CimPackage.TOPOLOGICAL_NODE__TOPOLOGICAL_ISLAND:
            setTopologicalIsland( ( TopologicalIsland ) newValue );
            return;
        case CimPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODES:
            getConnectivityNodes().clear();
            getConnectivityNodes().addAll( ( Collection< ? extends ConnectivityNode > ) newValue );
            return;
        case CimPackage.TOPOLOGICAL_NODE__REPORTING_GROUP:
            setReportingGroup( ( ReportingGroup ) newValue );
            return;
        case CimPackage.TOPOLOGICAL_NODE__BASE_VOLTAGE:
            setBaseVoltage( ( BaseVoltage ) newValue );
            return;
        case CimPackage.TOPOLOGICAL_NODE__TERMINAL:
            getTerminal().clear();
            getTerminal().addAll( ( Collection< ? extends Terminal > ) newValue );
            return;
        case CimPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODE_CONTAINER:
            setConnectivityNodeContainer( ( ConnectivityNodeContainer ) newValue );
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
        case CimPackage.TOPOLOGICAL_NODE__ANGLE_REF_TOPOLOGICAL_ISLAND:
            unsetAngleRefTopologicalIsland();
            return;
        case CimPackage.TOPOLOGICAL_NODE__SV_INJECTION:
            unsetSvInjection();
            return;
        case CimPackage.TOPOLOGICAL_NODE__SV_VOLTAGE:
            unsetSvVoltage();
            return;
        case CimPackage.TOPOLOGICAL_NODE__TOPOLOGICAL_ISLAND:
            unsetTopologicalIsland();
            return;
        case CimPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODES:
            unsetConnectivityNodes();
            return;
        case CimPackage.TOPOLOGICAL_NODE__REPORTING_GROUP:
            unsetReportingGroup();
            return;
        case CimPackage.TOPOLOGICAL_NODE__BASE_VOLTAGE:
            unsetBaseVoltage();
            return;
        case CimPackage.TOPOLOGICAL_NODE__TERMINAL:
            unsetTerminal();
            return;
        case CimPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODE_CONTAINER:
            unsetConnectivityNodeContainer();
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
        case CimPackage.TOPOLOGICAL_NODE__ANGLE_REF_TOPOLOGICAL_ISLAND:
            return isSetAngleRefTopologicalIsland();
        case CimPackage.TOPOLOGICAL_NODE__SV_INJECTION:
            return isSetSvInjection();
        case CimPackage.TOPOLOGICAL_NODE__SV_VOLTAGE:
            return isSetSvVoltage();
        case CimPackage.TOPOLOGICAL_NODE__TOPOLOGICAL_ISLAND:
            return isSetTopologicalIsland();
        case CimPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODES:
            return isSetConnectivityNodes();
        case CimPackage.TOPOLOGICAL_NODE__REPORTING_GROUP:
            return isSetReportingGroup();
        case CimPackage.TOPOLOGICAL_NODE__BASE_VOLTAGE:
            return isSetBaseVoltage();
        case CimPackage.TOPOLOGICAL_NODE__TERMINAL:
            return isSetTerminal();
        case CimPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODE_CONTAINER:
            return isSetConnectivityNodeContainer();
        }
        return super.eIsSet( featureID );
    }

} //TopologicalNodeImpl

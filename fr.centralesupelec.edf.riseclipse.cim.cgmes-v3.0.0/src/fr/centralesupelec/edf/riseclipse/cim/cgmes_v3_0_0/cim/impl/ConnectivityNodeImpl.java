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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConnectivityNode;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConnectivityNodeContainer;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Terminal;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalNode;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.EuPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connectivity Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ConnectivityNodeImpl#getBoundaryPoint <em>Boundary Point</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ConnectivityNodeImpl#getTerminals <em>Terminals</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ConnectivityNodeImpl#getConnectivityNodeContainer <em>Connectivity Node Container</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ConnectivityNodeImpl#getTopologicalNode <em>Topological Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectivityNodeImpl extends IdentifiedObjectImpl implements ConnectivityNode {
    /**
     * The cached value of the '{@link #getBoundaryPoint() <em>Boundary Point</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBoundaryPoint()
     * @generated
     * @ordered
     */
    protected BoundaryPoint boundaryPoint;

    /**
     * This is true if the Boundary Point reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean boundaryPointESet;

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
     * The cached value of the '{@link #getTopologicalNode() <em>Topological Node</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTopologicalNode()
     * @generated
     * @ordered
     */
    protected TopologicalNode topologicalNode;

    /**
     * This is true if the Topological Node reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean topologicalNodeESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConnectivityNodeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getConnectivityNode();
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
                    CimPackage.CONNECTIVITY_NODE__TERMINALS, CimPackage.TERMINAL__CONNECTIVITY_NODE );
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
        if( terminals != null ) ( ( InternalEList.Unsettable< ? > ) terminals ).unset();
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
    public BoundaryPoint getBoundaryPoint() {
        if( boundaryPoint != null && boundaryPoint.eIsProxy() ) {
            InternalEObject oldBoundaryPoint = ( InternalEObject ) boundaryPoint;
            boundaryPoint = ( BoundaryPoint ) eResolveProxy( oldBoundaryPoint );
            if( boundaryPoint != oldBoundaryPoint ) {
                if( eNotificationRequired() )
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                            CimPackage.CONNECTIVITY_NODE__BOUNDARY_POINT, oldBoundaryPoint, boundaryPoint ) );
            }
        }
        return boundaryPoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BoundaryPoint basicGetBoundaryPoint() {
        return boundaryPoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBoundaryPoint( BoundaryPoint newBoundaryPoint, NotificationChain msgs ) {
        BoundaryPoint oldBoundaryPoint = boundaryPoint;
        boundaryPoint = newBoundaryPoint;
        boolean oldBoundaryPointESet = boundaryPointESet;
        boundaryPointESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.CONNECTIVITY_NODE__BOUNDARY_POINT, oldBoundaryPoint, newBoundaryPoint,
                    !oldBoundaryPointESet );
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
    public void setBoundaryPoint( BoundaryPoint newBoundaryPoint ) {
        if( newBoundaryPoint != boundaryPoint ) {
            NotificationChain msgs = null;
            if( boundaryPoint != null )
                msgs = ( ( InternalEObject ) boundaryPoint ).eInverseRemove( this,
                        EuPackage.BOUNDARY_POINT__CONNECTIVITY_NODE, BoundaryPoint.class, msgs );
            if( newBoundaryPoint != null )
                msgs = ( ( InternalEObject ) newBoundaryPoint ).eInverseAdd( this,
                        EuPackage.BOUNDARY_POINT__CONNECTIVITY_NODE, BoundaryPoint.class, msgs );
            msgs = basicSetBoundaryPoint( newBoundaryPoint, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldBoundaryPointESet = boundaryPointESet;
            boundaryPointESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CONNECTIVITY_NODE__BOUNDARY_POINT,
                        newBoundaryPoint, newBoundaryPoint, !oldBoundaryPointESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetBoundaryPoint( NotificationChain msgs ) {
        BoundaryPoint oldBoundaryPoint = boundaryPoint;
        boundaryPoint = null;
        boolean oldBoundaryPointESet = boundaryPointESet;
        boundaryPointESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CONNECTIVITY_NODE__BOUNDARY_POINT, oldBoundaryPoint, null, oldBoundaryPointESet );
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
    public void unsetBoundaryPoint() {
        if( boundaryPoint != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) boundaryPoint ).eInverseRemove( this,
                    EuPackage.BOUNDARY_POINT__CONNECTIVITY_NODE, BoundaryPoint.class, msgs );
            msgs = basicUnsetBoundaryPoint( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldBoundaryPointESet = boundaryPointESet;
            boundaryPointESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.CONNECTIVITY_NODE__BOUNDARY_POINT,
                        null, null, oldBoundaryPointESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBoundaryPoint() {
        return boundaryPointESet;
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
                    CimPackage.CONNECTIVITY_NODE__CONNECTIVITY_NODE_CONTAINER, oldConnectivityNodeContainer,
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
                        CimPackage.CONNECTIVITY_NODE_CONTAINER__CONNECTIVITY_NODES, ConnectivityNodeContainer.class,
                        msgs );
            if( newConnectivityNodeContainer != null )
                msgs = ( ( InternalEObject ) newConnectivityNodeContainer ).eInverseAdd( this,
                        CimPackage.CONNECTIVITY_NODE_CONTAINER__CONNECTIVITY_NODES, ConnectivityNodeContainer.class,
                        msgs );
            msgs = basicSetConnectivityNodeContainer( newConnectivityNodeContainer, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldConnectivityNodeContainerESet = connectivityNodeContainerESet;
            connectivityNodeContainerESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        CimPackage.CONNECTIVITY_NODE__CONNECTIVITY_NODE_CONTAINER, newConnectivityNodeContainer,
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
                    CimPackage.CONNECTIVITY_NODE__CONNECTIVITY_NODE_CONTAINER, oldConnectivityNodeContainer, null,
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
                    CimPackage.CONNECTIVITY_NODE_CONTAINER__CONNECTIVITY_NODES, ConnectivityNodeContainer.class, msgs );
            msgs = basicUnsetConnectivityNodeContainer( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldConnectivityNodeContainerESet = connectivityNodeContainerESet;
            connectivityNodeContainerESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.CONNECTIVITY_NODE__CONNECTIVITY_NODE_CONTAINER, null, null,
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
    @Override
    public TopologicalNode getTopologicalNode() {
        return topologicalNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTopologicalNode( TopologicalNode newTopologicalNode, NotificationChain msgs ) {
        TopologicalNode oldTopologicalNode = topologicalNode;
        topologicalNode = newTopologicalNode;
        boolean oldTopologicalNodeESet = topologicalNodeESet;
        topologicalNodeESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.CONNECTIVITY_NODE__TOPOLOGICAL_NODE, oldTopologicalNode, newTopologicalNode,
                    !oldTopologicalNodeESet );
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
    public void setTopologicalNode( TopologicalNode newTopologicalNode ) {
        if( newTopologicalNode != topologicalNode ) {
            NotificationChain msgs = null;
            if( topologicalNode != null )
                msgs = ( ( InternalEObject ) topologicalNode ).eInverseRemove( this,
                        CimPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODES, TopologicalNode.class, msgs );
            if( newTopologicalNode != null )
                msgs = ( ( InternalEObject ) newTopologicalNode ).eInverseAdd( this,
                        CimPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODES, TopologicalNode.class, msgs );
            msgs = basicSetTopologicalNode( newTopologicalNode, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTopologicalNodeESet = topologicalNodeESet;
            topologicalNodeESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CONNECTIVITY_NODE__TOPOLOGICAL_NODE,
                        newTopologicalNode, newTopologicalNode, !oldTopologicalNodeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetTopologicalNode( NotificationChain msgs ) {
        TopologicalNode oldTopologicalNode = topologicalNode;
        topologicalNode = null;
        boolean oldTopologicalNodeESet = topologicalNodeESet;
        topologicalNodeESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CONNECTIVITY_NODE__TOPOLOGICAL_NODE, oldTopologicalNode, null, oldTopologicalNodeESet );
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
    public void unsetTopologicalNode() {
        if( topologicalNode != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) topologicalNode ).eInverseRemove( this,
                    CimPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODES, TopologicalNode.class, msgs );
            msgs = basicUnsetTopologicalNode( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTopologicalNodeESet = topologicalNodeESet;
            topologicalNodeESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.CONNECTIVITY_NODE__TOPOLOGICAL_NODE, null, null, oldTopologicalNodeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTopologicalNode() {
        return topologicalNodeESet;
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
        case CimPackage.CONNECTIVITY_NODE__BOUNDARY_POINT:
            if( boundaryPoint != null )
                msgs = ( ( InternalEObject ) boundaryPoint ).eInverseRemove( this,
                        EuPackage.BOUNDARY_POINT__CONNECTIVITY_NODE, BoundaryPoint.class, msgs );
            return basicSetBoundaryPoint( ( BoundaryPoint ) otherEnd, msgs );
        case CimPackage.CONNECTIVITY_NODE__TERMINALS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getTerminals() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.CONNECTIVITY_NODE__CONNECTIVITY_NODE_CONTAINER:
            if( connectivityNodeContainer != null )
                msgs = ( ( InternalEObject ) connectivityNodeContainer ).eInverseRemove( this,
                        CimPackage.CONNECTIVITY_NODE_CONTAINER__CONNECTIVITY_NODES, ConnectivityNodeContainer.class,
                        msgs );
            return basicSetConnectivityNodeContainer( ( ConnectivityNodeContainer ) otherEnd, msgs );
        case CimPackage.CONNECTIVITY_NODE__TOPOLOGICAL_NODE:
            if( topologicalNode != null )
                msgs = ( ( InternalEObject ) topologicalNode ).eInverseRemove( this,
                        CimPackage.TOPOLOGICAL_NODE__CONNECTIVITY_NODES, TopologicalNode.class, msgs );
            return basicSetTopologicalNode( ( TopologicalNode ) otherEnd, msgs );
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
        case CimPackage.CONNECTIVITY_NODE__BOUNDARY_POINT:
            return basicUnsetBoundaryPoint( msgs );
        case CimPackage.CONNECTIVITY_NODE__TERMINALS:
            return ( ( InternalEList< ? > ) getTerminals() ).basicRemove( otherEnd, msgs );
        case CimPackage.CONNECTIVITY_NODE__CONNECTIVITY_NODE_CONTAINER:
            return basicUnsetConnectivityNodeContainer( msgs );
        case CimPackage.CONNECTIVITY_NODE__TOPOLOGICAL_NODE:
            return basicUnsetTopologicalNode( msgs );
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
        case CimPackage.CONNECTIVITY_NODE__BOUNDARY_POINT:
            if( resolve ) return getBoundaryPoint();
            return basicGetBoundaryPoint();
        case CimPackage.CONNECTIVITY_NODE__TERMINALS:
            return getTerminals();
        case CimPackage.CONNECTIVITY_NODE__CONNECTIVITY_NODE_CONTAINER:
            return getConnectivityNodeContainer();
        case CimPackage.CONNECTIVITY_NODE__TOPOLOGICAL_NODE:
            return getTopologicalNode();
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
        case CimPackage.CONNECTIVITY_NODE__BOUNDARY_POINT:
            setBoundaryPoint( ( BoundaryPoint ) newValue );
            return;
        case CimPackage.CONNECTIVITY_NODE__TERMINALS:
            getTerminals().clear();
            getTerminals().addAll( ( Collection< ? extends Terminal > ) newValue );
            return;
        case CimPackage.CONNECTIVITY_NODE__CONNECTIVITY_NODE_CONTAINER:
            setConnectivityNodeContainer( ( ConnectivityNodeContainer ) newValue );
            return;
        case CimPackage.CONNECTIVITY_NODE__TOPOLOGICAL_NODE:
            setTopologicalNode( ( TopologicalNode ) newValue );
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
        case CimPackage.CONNECTIVITY_NODE__BOUNDARY_POINT:
            unsetBoundaryPoint();
            return;
        case CimPackage.CONNECTIVITY_NODE__TERMINALS:
            unsetTerminals();
            return;
        case CimPackage.CONNECTIVITY_NODE__CONNECTIVITY_NODE_CONTAINER:
            unsetConnectivityNodeContainer();
            return;
        case CimPackage.CONNECTIVITY_NODE__TOPOLOGICAL_NODE:
            unsetTopologicalNode();
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
        case CimPackage.CONNECTIVITY_NODE__BOUNDARY_POINT:
            return isSetBoundaryPoint();
        case CimPackage.CONNECTIVITY_NODE__TERMINALS:
            return isSetTerminals();
        case CimPackage.CONNECTIVITY_NODE__CONNECTIVITY_NODE_CONTAINER:
            return isSetConnectivityNodeContainer();
        case CimPackage.CONNECTIVITY_NODE__TOPOLOGICAL_NODE:
            return isSetTopologicalNode();
        }
        return super.eIsSet( featureID );
    }

} //ConnectivityNodeImpl

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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvInjection;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sv Injection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.SvInjectionImpl#getTopologicalNode <em>Topological Node</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.SvInjectionImpl#getQInjection <em>QInjection</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.SvInjectionImpl#getPInjection <em>PInjection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SvInjectionImpl extends CimObjectWithIDImpl implements SvInjection {
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
     * The default value of the '{@link #getQInjection() <em>QInjection</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQInjection()
     * @generated
     * @ordered
     */
    protected static final Double QINJECTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getQInjection() <em>QInjection</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQInjection()
     * @generated
     * @ordered
     */
    protected Double qInjection = QINJECTION_EDEFAULT;

    /**
     * This is true if the QInjection attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean qInjectionESet;

    /**
     * The default value of the '{@link #getPInjection() <em>PInjection</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPInjection()
     * @generated
     * @ordered
     */
    protected static final Double PINJECTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPInjection() <em>PInjection</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPInjection()
     * @generated
     * @ordered
     */
    protected Double pInjection = PINJECTION_EDEFAULT;

    /**
     * This is true if the PInjection attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pInjectionESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SvInjectionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getSvInjection();
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
                    CimPackage.SV_INJECTION__TOPOLOGICAL_NODE, oldTopologicalNode, newTopologicalNode,
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
                        CimPackage.TOPOLOGICAL_NODE__SV_INJECTION, TopologicalNode.class, msgs );
            if( newTopologicalNode != null )
                msgs = ( ( InternalEObject ) newTopologicalNode ).eInverseAdd( this,
                        CimPackage.TOPOLOGICAL_NODE__SV_INJECTION, TopologicalNode.class, msgs );
            msgs = basicSetTopologicalNode( newTopologicalNode, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTopologicalNodeESet = topologicalNodeESet;
            topologicalNodeESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SV_INJECTION__TOPOLOGICAL_NODE,
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
                    CimPackage.SV_INJECTION__TOPOLOGICAL_NODE, oldTopologicalNode, null, oldTopologicalNodeESet );
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
                    CimPackage.TOPOLOGICAL_NODE__SV_INJECTION, TopologicalNode.class, msgs );
            msgs = basicUnsetTopologicalNode( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTopologicalNodeESet = topologicalNodeESet;
            topologicalNodeESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SV_INJECTION__TOPOLOGICAL_NODE,
                        null, null, oldTopologicalNodeESet ) );
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
    @Override
    public Double getQInjection() {
        return qInjection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setQInjection( Double newQInjection ) {
        Double oldQInjection = qInjection;
        qInjection = newQInjection;
        boolean oldQInjectionESet = qInjectionESet;
        qInjectionESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SV_INJECTION__QINJECTION, oldQInjection,
                    qInjection, !oldQInjectionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetQInjection() {
        Double oldQInjection = qInjection;
        boolean oldQInjectionESet = qInjectionESet;
        qInjection = QINJECTION_EDEFAULT;
        qInjectionESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SV_INJECTION__QINJECTION,
                    oldQInjection, QINJECTION_EDEFAULT, oldQInjectionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetQInjection() {
        return qInjectionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getPInjection() {
        return pInjection;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPInjection( Double newPInjection ) {
        Double oldPInjection = pInjection;
        pInjection = newPInjection;
        boolean oldPInjectionESet = pInjectionESet;
        pInjectionESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SV_INJECTION__PINJECTION, oldPInjection,
                    pInjection, !oldPInjectionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPInjection() {
        Double oldPInjection = pInjection;
        boolean oldPInjectionESet = pInjectionESet;
        pInjection = PINJECTION_EDEFAULT;
        pInjectionESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SV_INJECTION__PINJECTION,
                    oldPInjection, PINJECTION_EDEFAULT, oldPInjectionESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPInjection() {
        return pInjectionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.SV_INJECTION__TOPOLOGICAL_NODE:
            if( topologicalNode != null )
                msgs = ( ( InternalEObject ) topologicalNode ).eInverseRemove( this,
                        CimPackage.TOPOLOGICAL_NODE__SV_INJECTION, TopologicalNode.class, msgs );
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
        case CimPackage.SV_INJECTION__TOPOLOGICAL_NODE:
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
        case CimPackage.SV_INJECTION__TOPOLOGICAL_NODE:
            return getTopologicalNode();
        case CimPackage.SV_INJECTION__QINJECTION:
            return getQInjection();
        case CimPackage.SV_INJECTION__PINJECTION:
            return getPInjection();
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
        case CimPackage.SV_INJECTION__TOPOLOGICAL_NODE:
            setTopologicalNode( ( TopologicalNode ) newValue );
            return;
        case CimPackage.SV_INJECTION__QINJECTION:
            setQInjection( ( Double ) newValue );
            return;
        case CimPackage.SV_INJECTION__PINJECTION:
            setPInjection( ( Double ) newValue );
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
        case CimPackage.SV_INJECTION__TOPOLOGICAL_NODE:
            unsetTopologicalNode();
            return;
        case CimPackage.SV_INJECTION__QINJECTION:
            unsetQInjection();
            return;
        case CimPackage.SV_INJECTION__PINJECTION:
            unsetPInjection();
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
        case CimPackage.SV_INJECTION__TOPOLOGICAL_NODE:
            return isSetTopologicalNode();
        case CimPackage.SV_INJECTION__QINJECTION:
            return isSetQInjection();
        case CimPackage.SV_INJECTION__PINJECTION:
            return isSetPInjection();
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
        result.append( " (qInjection: " );
        if( qInjectionESet )
            result.append( qInjection );
        else
            result.append( "<unset>" );
        result.append( ", pInjection: " );
        if( pInjectionESet )
            result.append( pInjection );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //SvInjectionImpl

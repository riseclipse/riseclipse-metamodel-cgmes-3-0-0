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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvVoltage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sv Voltage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.SvVoltageImpl#getAngle <em>Angle</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.SvVoltageImpl#getTopologicalNode <em>Topological Node</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.SvVoltageImpl#getV <em>V</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SvVoltageImpl extends CimObjectWithIDImpl implements SvVoltage {
    /**
     * The default value of the '{@link #getAngle() <em>Angle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAngle()
     * @generated
     * @ordered
     */
    protected static final Double ANGLE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAngle() <em>Angle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAngle()
     * @generated
     * @ordered
     */
    protected Double angle = ANGLE_EDEFAULT;

    /**
     * This is true if the Angle attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean angleESet;

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
     * The default value of the '{@link #getV() <em>V</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getV()
     * @generated
     * @ordered
     */
    protected static final Double V_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getV() <em>V</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getV()
     * @generated
     * @ordered
     */
    protected Double v = V_EDEFAULT;

    /**
     * This is true if the V attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SvVoltageImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getSvVoltage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getAngle() {
        return angle;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAngle( Double newAngle ) {
        Double oldAngle = angle;
        angle = newAngle;
        boolean oldAngleESet = angleESet;
        angleESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SV_VOLTAGE__ANGLE, oldAngle, angle,
                    !oldAngleESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAngle() {
        Double oldAngle = angle;
        boolean oldAngleESet = angleESet;
        angle = ANGLE_EDEFAULT;
        angleESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SV_VOLTAGE__ANGLE, oldAngle,
                    ANGLE_EDEFAULT, oldAngleESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAngle() {
        return angleESet;
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
                    CimPackage.SV_VOLTAGE__TOPOLOGICAL_NODE, oldTopologicalNode, newTopologicalNode,
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
                        CimPackage.TOPOLOGICAL_NODE__SV_VOLTAGE, TopologicalNode.class, msgs );
            if( newTopologicalNode != null )
                msgs = ( ( InternalEObject ) newTopologicalNode ).eInverseAdd( this,
                        CimPackage.TOPOLOGICAL_NODE__SV_VOLTAGE, TopologicalNode.class, msgs );
            msgs = basicSetTopologicalNode( newTopologicalNode, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTopologicalNodeESet = topologicalNodeESet;
            topologicalNodeESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SV_VOLTAGE__TOPOLOGICAL_NODE,
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
                    CimPackage.SV_VOLTAGE__TOPOLOGICAL_NODE, oldTopologicalNode, null, oldTopologicalNodeESet );
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
                    CimPackage.TOPOLOGICAL_NODE__SV_VOLTAGE, TopologicalNode.class, msgs );
            msgs = basicUnsetTopologicalNode( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTopologicalNodeESet = topologicalNodeESet;
            topologicalNodeESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SV_VOLTAGE__TOPOLOGICAL_NODE, null,
                        null, oldTopologicalNodeESet ) );
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
    public Double getV() {
        return v;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setV( Double newV ) {
        Double oldV = v;
        v = newV;
        boolean oldVESet = vESet;
        vESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SV_VOLTAGE__V, oldV, v, !oldVESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetV() {
        Double oldV = v;
        boolean oldVESet = vESet;
        v = V_EDEFAULT;
        vESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SV_VOLTAGE__V, oldV, V_EDEFAULT,
                    oldVESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetV() {
        return vESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.SV_VOLTAGE__TOPOLOGICAL_NODE:
            if( topologicalNode != null )
                msgs = ( ( InternalEObject ) topologicalNode ).eInverseRemove( this,
                        CimPackage.TOPOLOGICAL_NODE__SV_VOLTAGE, TopologicalNode.class, msgs );
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
        case CimPackage.SV_VOLTAGE__TOPOLOGICAL_NODE:
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
        case CimPackage.SV_VOLTAGE__ANGLE:
            return getAngle();
        case CimPackage.SV_VOLTAGE__TOPOLOGICAL_NODE:
            return getTopologicalNode();
        case CimPackage.SV_VOLTAGE__V:
            return getV();
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
        case CimPackage.SV_VOLTAGE__ANGLE:
            setAngle( ( Double ) newValue );
            return;
        case CimPackage.SV_VOLTAGE__TOPOLOGICAL_NODE:
            setTopologicalNode( ( TopologicalNode ) newValue );
            return;
        case CimPackage.SV_VOLTAGE__V:
            setV( ( Double ) newValue );
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
        case CimPackage.SV_VOLTAGE__ANGLE:
            unsetAngle();
            return;
        case CimPackage.SV_VOLTAGE__TOPOLOGICAL_NODE:
            unsetTopologicalNode();
            return;
        case CimPackage.SV_VOLTAGE__V:
            unsetV();
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
        case CimPackage.SV_VOLTAGE__ANGLE:
            return isSetAngle();
        case CimPackage.SV_VOLTAGE__TOPOLOGICAL_NODE:
            return isSetTopologicalNode();
        case CimPackage.SV_VOLTAGE__V:
            return isSetV();
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
        result.append( " (angle: " );
        if( angleESet )
            result.append( angle );
        else
            result.append( "<unset>" );
        result.append( ", v: " );
        if( vESet )
            result.append( v );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //SvVoltageImpl

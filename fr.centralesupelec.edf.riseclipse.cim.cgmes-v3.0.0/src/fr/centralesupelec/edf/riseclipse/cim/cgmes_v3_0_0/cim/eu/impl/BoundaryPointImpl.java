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
package fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConnectivityNode;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.EuPackage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PowerSystemResourceImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Boundary Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.impl.BoundaryPointImpl#getConnectivityNode <em>Connectivity Node</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.impl.BoundaryPointImpl#getToEndName <em>To End Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.impl.BoundaryPointImpl#getIsDirectCurrent <em>Is Direct Current</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.impl.BoundaryPointImpl#getFromEndName <em>From End Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.impl.BoundaryPointImpl#getToEndIsoCode <em>To End Iso Code</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.impl.BoundaryPointImpl#getIsExcludedFromAreaInterchange <em>Is Excluded From Area Interchange</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.impl.BoundaryPointImpl#getToEndNameTso <em>To End Name Tso</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.impl.BoundaryPointImpl#getFromEndIsoCode <em>From End Iso Code</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.impl.BoundaryPointImpl#getFromEndNameTso <em>From End Name Tso</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoundaryPointImpl extends PowerSystemResourceImpl implements BoundaryPoint {
    /**
     * The cached value of the '{@link #getConnectivityNode() <em>Connectivity Node</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnectivityNode()
     * @generated
     * @ordered
     */
    protected ConnectivityNode connectivityNode;

    /**
     * This is true if the Connectivity Node reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean connectivityNodeESet;

    /**
     * The default value of the '{@link #getToEndName() <em>To End Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getToEndName()
     * @generated
     * @ordered
     */
    protected static final String TO_END_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getToEndName() <em>To End Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getToEndName()
     * @generated
     * @ordered
     */
    protected String toEndName = TO_END_NAME_EDEFAULT;

    /**
     * This is true if the To End Name attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean toEndNameESet;

    /**
     * The default value of the '{@link #getIsDirectCurrent() <em>Is Direct Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsDirectCurrent()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_DIRECT_CURRENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIsDirectCurrent() <em>Is Direct Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsDirectCurrent()
     * @generated
     * @ordered
     */
    protected Boolean isDirectCurrent = IS_DIRECT_CURRENT_EDEFAULT;

    /**
     * This is true if the Is Direct Current attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isDirectCurrentESet;

    /**
     * The default value of the '{@link #getFromEndName() <em>From End Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFromEndName()
     * @generated
     * @ordered
     */
    protected static final String FROM_END_NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFromEndName() <em>From End Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFromEndName()
     * @generated
     * @ordered
     */
    protected String fromEndName = FROM_END_NAME_EDEFAULT;

    /**
     * This is true if the From End Name attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fromEndNameESet;

    /**
     * The default value of the '{@link #getToEndIsoCode() <em>To End Iso Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getToEndIsoCode()
     * @generated
     * @ordered
     */
    protected static final String TO_END_ISO_CODE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getToEndIsoCode() <em>To End Iso Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getToEndIsoCode()
     * @generated
     * @ordered
     */
    protected String toEndIsoCode = TO_END_ISO_CODE_EDEFAULT;

    /**
     * This is true if the To End Iso Code attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean toEndIsoCodeESet;

    /**
     * The default value of the '{@link #getIsExcludedFromAreaInterchange() <em>Is Excluded From Area Interchange</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsExcludedFromAreaInterchange()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_EXCLUDED_FROM_AREA_INTERCHANGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIsExcludedFromAreaInterchange() <em>Is Excluded From Area Interchange</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsExcludedFromAreaInterchange()
     * @generated
     * @ordered
     */
    protected Boolean isExcludedFromAreaInterchange = IS_EXCLUDED_FROM_AREA_INTERCHANGE_EDEFAULT;

    /**
     * This is true if the Is Excluded From Area Interchange attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isExcludedFromAreaInterchangeESet;

    /**
     * The default value of the '{@link #getToEndNameTso() <em>To End Name Tso</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getToEndNameTso()
     * @generated
     * @ordered
     */
    protected static final String TO_END_NAME_TSO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getToEndNameTso() <em>To End Name Tso</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getToEndNameTso()
     * @generated
     * @ordered
     */
    protected String toEndNameTso = TO_END_NAME_TSO_EDEFAULT;

    /**
     * This is true if the To End Name Tso attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean toEndNameTsoESet;

    /**
     * The default value of the '{@link #getFromEndIsoCode() <em>From End Iso Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFromEndIsoCode()
     * @generated
     * @ordered
     */
    protected static final String FROM_END_ISO_CODE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFromEndIsoCode() <em>From End Iso Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFromEndIsoCode()
     * @generated
     * @ordered
     */
    protected String fromEndIsoCode = FROM_END_ISO_CODE_EDEFAULT;

    /**
     * This is true if the From End Iso Code attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fromEndIsoCodeESet;

    /**
     * The default value of the '{@link #getFromEndNameTso() <em>From End Name Tso</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFromEndNameTso()
     * @generated
     * @ordered
     */
    protected static final String FROM_END_NAME_TSO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFromEndNameTso() <em>From End Name Tso</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFromEndNameTso()
     * @generated
     * @ordered
     */
    protected String fromEndNameTso = FROM_END_NAME_TSO_EDEFAULT;

    /**
     * This is true if the From End Name Tso attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fromEndNameTsoESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BoundaryPointImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EuPackage.Literals.BOUNDARY_POINT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getToEndIsoCode() {
        return toEndIsoCode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setToEndIsoCode( String newToEndIsoCode ) {
        String oldToEndIsoCode = toEndIsoCode;
        toEndIsoCode = newToEndIsoCode;
        boolean oldToEndIsoCodeESet = toEndIsoCodeESet;
        toEndIsoCodeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, EuPackage.BOUNDARY_POINT__TO_END_ISO_CODE,
                    oldToEndIsoCode, toEndIsoCode, !oldToEndIsoCodeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetToEndIsoCode() {
        String oldToEndIsoCode = toEndIsoCode;
        boolean oldToEndIsoCodeESet = toEndIsoCodeESet;
        toEndIsoCode = TO_END_ISO_CODE_EDEFAULT;
        toEndIsoCodeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, EuPackage.BOUNDARY_POINT__TO_END_ISO_CODE,
                    oldToEndIsoCode, TO_END_ISO_CODE_EDEFAULT, oldToEndIsoCodeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetToEndIsoCode() {
        return toEndIsoCodeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getToEndNameTso() {
        return toEndNameTso;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setToEndNameTso( String newToEndNameTso ) {
        String oldToEndNameTso = toEndNameTso;
        toEndNameTso = newToEndNameTso;
        boolean oldToEndNameTsoESet = toEndNameTsoESet;
        toEndNameTsoESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, EuPackage.BOUNDARY_POINT__TO_END_NAME_TSO,
                    oldToEndNameTso, toEndNameTso, !oldToEndNameTsoESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetToEndNameTso() {
        String oldToEndNameTso = toEndNameTso;
        boolean oldToEndNameTsoESet = toEndNameTsoESet;
        toEndNameTso = TO_END_NAME_TSO_EDEFAULT;
        toEndNameTsoESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, EuPackage.BOUNDARY_POINT__TO_END_NAME_TSO,
                    oldToEndNameTso, TO_END_NAME_TSO_EDEFAULT, oldToEndNameTsoESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetToEndNameTso() {
        return toEndNameTsoESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getFromEndIsoCode() {
        return fromEndIsoCode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFromEndIsoCode( String newFromEndIsoCode ) {
        String oldFromEndIsoCode = fromEndIsoCode;
        fromEndIsoCode = newFromEndIsoCode;
        boolean oldFromEndIsoCodeESet = fromEndIsoCodeESet;
        fromEndIsoCodeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, EuPackage.BOUNDARY_POINT__FROM_END_ISO_CODE,
                    oldFromEndIsoCode, fromEndIsoCode, !oldFromEndIsoCodeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFromEndIsoCode() {
        String oldFromEndIsoCode = fromEndIsoCode;
        boolean oldFromEndIsoCodeESet = fromEndIsoCodeESet;
        fromEndIsoCode = FROM_END_ISO_CODE_EDEFAULT;
        fromEndIsoCodeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, EuPackage.BOUNDARY_POINT__FROM_END_ISO_CODE,
                    oldFromEndIsoCode, FROM_END_ISO_CODE_EDEFAULT, oldFromEndIsoCodeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFromEndIsoCode() {
        return fromEndIsoCodeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getIsExcludedFromAreaInterchange() {
        return isExcludedFromAreaInterchange;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsExcludedFromAreaInterchange( Boolean newIsExcludedFromAreaInterchange ) {
        Boolean oldIsExcludedFromAreaInterchange = isExcludedFromAreaInterchange;
        isExcludedFromAreaInterchange = newIsExcludedFromAreaInterchange;
        boolean oldIsExcludedFromAreaInterchangeESet = isExcludedFromAreaInterchangeESet;
        isExcludedFromAreaInterchangeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    EuPackage.BOUNDARY_POINT__IS_EXCLUDED_FROM_AREA_INTERCHANGE, oldIsExcludedFromAreaInterchange,
                    isExcludedFromAreaInterchange, !oldIsExcludedFromAreaInterchangeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIsExcludedFromAreaInterchange() {
        Boolean oldIsExcludedFromAreaInterchange = isExcludedFromAreaInterchange;
        boolean oldIsExcludedFromAreaInterchangeESet = isExcludedFromAreaInterchangeESet;
        isExcludedFromAreaInterchange = IS_EXCLUDED_FROM_AREA_INTERCHANGE_EDEFAULT;
        isExcludedFromAreaInterchangeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    EuPackage.BOUNDARY_POINT__IS_EXCLUDED_FROM_AREA_INTERCHANGE, oldIsExcludedFromAreaInterchange,
                    IS_EXCLUDED_FROM_AREA_INTERCHANGE_EDEFAULT, oldIsExcludedFromAreaInterchangeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIsExcludedFromAreaInterchange() {
        return isExcludedFromAreaInterchangeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConnectivityNode getConnectivityNode() {
        return connectivityNode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetConnectivityNode( ConnectivityNode newConnectivityNode, NotificationChain msgs ) {
        ConnectivityNode oldConnectivityNode = connectivityNode;
        connectivityNode = newConnectivityNode;
        boolean oldConnectivityNodeESet = connectivityNodeESet;
        connectivityNodeESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    EuPackage.BOUNDARY_POINT__CONNECTIVITY_NODE, oldConnectivityNode, newConnectivityNode,
                    !oldConnectivityNodeESet );
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
    public void setConnectivityNode( ConnectivityNode newConnectivityNode ) {
        if( newConnectivityNode != connectivityNode ) {
            NotificationChain msgs = null;
            if( connectivityNode != null )
                msgs = ( ( InternalEObject ) connectivityNode ).eInverseRemove( this,
                        CimPackage.CONNECTIVITY_NODE__BOUNDARY_POINT, ConnectivityNode.class, msgs );
            if( newConnectivityNode != null )
                msgs = ( ( InternalEObject ) newConnectivityNode ).eInverseAdd( this,
                        CimPackage.CONNECTIVITY_NODE__BOUNDARY_POINT, ConnectivityNode.class, msgs );
            msgs = basicSetConnectivityNode( newConnectivityNode, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldConnectivityNodeESet = connectivityNodeESet;
            connectivityNodeESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, EuPackage.BOUNDARY_POINT__CONNECTIVITY_NODE,
                        newConnectivityNode, newConnectivityNode, !oldConnectivityNodeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetConnectivityNode( NotificationChain msgs ) {
        ConnectivityNode oldConnectivityNode = connectivityNode;
        connectivityNode = null;
        boolean oldConnectivityNodeESet = connectivityNodeESet;
        connectivityNodeESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    EuPackage.BOUNDARY_POINT__CONNECTIVITY_NODE, oldConnectivityNode, null, oldConnectivityNodeESet );
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
    public void unsetConnectivityNode() {
        if( connectivityNode != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) connectivityNode ).eInverseRemove( this,
                    CimPackage.CONNECTIVITY_NODE__BOUNDARY_POINT, ConnectivityNode.class, msgs );
            msgs = basicUnsetConnectivityNode( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldConnectivityNodeESet = connectivityNodeESet;
            connectivityNodeESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, EuPackage.BOUNDARY_POINT__CONNECTIVITY_NODE,
                        null, null, oldConnectivityNodeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetConnectivityNode() {
        return connectivityNodeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getIsDirectCurrent() {
        return isDirectCurrent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsDirectCurrent( Boolean newIsDirectCurrent ) {
        Boolean oldIsDirectCurrent = isDirectCurrent;
        isDirectCurrent = newIsDirectCurrent;
        boolean oldIsDirectCurrentESet = isDirectCurrentESet;
        isDirectCurrentESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, EuPackage.BOUNDARY_POINT__IS_DIRECT_CURRENT,
                    oldIsDirectCurrent, isDirectCurrent, !oldIsDirectCurrentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIsDirectCurrent() {
        Boolean oldIsDirectCurrent = isDirectCurrent;
        boolean oldIsDirectCurrentESet = isDirectCurrentESet;
        isDirectCurrent = IS_DIRECT_CURRENT_EDEFAULT;
        isDirectCurrentESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, EuPackage.BOUNDARY_POINT__IS_DIRECT_CURRENT,
                    oldIsDirectCurrent, IS_DIRECT_CURRENT_EDEFAULT, oldIsDirectCurrentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIsDirectCurrent() {
        return isDirectCurrentESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getFromEndNameTso() {
        return fromEndNameTso;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFromEndNameTso( String newFromEndNameTso ) {
        String oldFromEndNameTso = fromEndNameTso;
        fromEndNameTso = newFromEndNameTso;
        boolean oldFromEndNameTsoESet = fromEndNameTsoESet;
        fromEndNameTsoESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, EuPackage.BOUNDARY_POINT__FROM_END_NAME_TSO,
                    oldFromEndNameTso, fromEndNameTso, !oldFromEndNameTsoESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFromEndNameTso() {
        String oldFromEndNameTso = fromEndNameTso;
        boolean oldFromEndNameTsoESet = fromEndNameTsoESet;
        fromEndNameTso = FROM_END_NAME_TSO_EDEFAULT;
        fromEndNameTsoESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, EuPackage.BOUNDARY_POINT__FROM_END_NAME_TSO,
                    oldFromEndNameTso, FROM_END_NAME_TSO_EDEFAULT, oldFromEndNameTsoESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFromEndNameTso() {
        return fromEndNameTsoESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getFromEndName() {
        return fromEndName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFromEndName( String newFromEndName ) {
        String oldFromEndName = fromEndName;
        fromEndName = newFromEndName;
        boolean oldFromEndNameESet = fromEndNameESet;
        fromEndNameESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, EuPackage.BOUNDARY_POINT__FROM_END_NAME,
                    oldFromEndName, fromEndName, !oldFromEndNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFromEndName() {
        String oldFromEndName = fromEndName;
        boolean oldFromEndNameESet = fromEndNameESet;
        fromEndName = FROM_END_NAME_EDEFAULT;
        fromEndNameESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, EuPackage.BOUNDARY_POINT__FROM_END_NAME,
                    oldFromEndName, FROM_END_NAME_EDEFAULT, oldFromEndNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFromEndName() {
        return fromEndNameESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getToEndName() {
        return toEndName;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setToEndName( String newToEndName ) {
        String oldToEndName = toEndName;
        toEndName = newToEndName;
        boolean oldToEndNameESet = toEndNameESet;
        toEndNameESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, EuPackage.BOUNDARY_POINT__TO_END_NAME, oldToEndName,
                    toEndName, !oldToEndNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetToEndName() {
        String oldToEndName = toEndName;
        boolean oldToEndNameESet = toEndNameESet;
        toEndName = TO_END_NAME_EDEFAULT;
        toEndNameESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, EuPackage.BOUNDARY_POINT__TO_END_NAME,
                    oldToEndName, TO_END_NAME_EDEFAULT, oldToEndNameESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetToEndName() {
        return toEndNameESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case EuPackage.BOUNDARY_POINT__CONNECTIVITY_NODE:
            if( connectivityNode != null )
                msgs = ( ( InternalEObject ) connectivityNode ).eInverseRemove( this,
                        CimPackage.CONNECTIVITY_NODE__BOUNDARY_POINT, ConnectivityNode.class, msgs );
            return basicSetConnectivityNode( ( ConnectivityNode ) otherEnd, msgs );
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
        case EuPackage.BOUNDARY_POINT__CONNECTIVITY_NODE:
            return basicUnsetConnectivityNode( msgs );
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
        case EuPackage.BOUNDARY_POINT__CONNECTIVITY_NODE:
            return getConnectivityNode();
        case EuPackage.BOUNDARY_POINT__TO_END_NAME:
            return getToEndName();
        case EuPackage.BOUNDARY_POINT__IS_DIRECT_CURRENT:
            return getIsDirectCurrent();
        case EuPackage.BOUNDARY_POINT__FROM_END_NAME:
            return getFromEndName();
        case EuPackage.BOUNDARY_POINT__TO_END_ISO_CODE:
            return getToEndIsoCode();
        case EuPackage.BOUNDARY_POINT__IS_EXCLUDED_FROM_AREA_INTERCHANGE:
            return getIsExcludedFromAreaInterchange();
        case EuPackage.BOUNDARY_POINT__TO_END_NAME_TSO:
            return getToEndNameTso();
        case EuPackage.BOUNDARY_POINT__FROM_END_ISO_CODE:
            return getFromEndIsoCode();
        case EuPackage.BOUNDARY_POINT__FROM_END_NAME_TSO:
            return getFromEndNameTso();
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
        case EuPackage.BOUNDARY_POINT__CONNECTIVITY_NODE:
            setConnectivityNode( ( ConnectivityNode ) newValue );
            return;
        case EuPackage.BOUNDARY_POINT__TO_END_NAME:
            setToEndName( ( String ) newValue );
            return;
        case EuPackage.BOUNDARY_POINT__IS_DIRECT_CURRENT:
            setIsDirectCurrent( ( Boolean ) newValue );
            return;
        case EuPackage.BOUNDARY_POINT__FROM_END_NAME:
            setFromEndName( ( String ) newValue );
            return;
        case EuPackage.BOUNDARY_POINT__TO_END_ISO_CODE:
            setToEndIsoCode( ( String ) newValue );
            return;
        case EuPackage.BOUNDARY_POINT__IS_EXCLUDED_FROM_AREA_INTERCHANGE:
            setIsExcludedFromAreaInterchange( ( Boolean ) newValue );
            return;
        case EuPackage.BOUNDARY_POINT__TO_END_NAME_TSO:
            setToEndNameTso( ( String ) newValue );
            return;
        case EuPackage.BOUNDARY_POINT__FROM_END_ISO_CODE:
            setFromEndIsoCode( ( String ) newValue );
            return;
        case EuPackage.BOUNDARY_POINT__FROM_END_NAME_TSO:
            setFromEndNameTso( ( String ) newValue );
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
        case EuPackage.BOUNDARY_POINT__CONNECTIVITY_NODE:
            unsetConnectivityNode();
            return;
        case EuPackage.BOUNDARY_POINT__TO_END_NAME:
            unsetToEndName();
            return;
        case EuPackage.BOUNDARY_POINT__IS_DIRECT_CURRENT:
            unsetIsDirectCurrent();
            return;
        case EuPackage.BOUNDARY_POINT__FROM_END_NAME:
            unsetFromEndName();
            return;
        case EuPackage.BOUNDARY_POINT__TO_END_ISO_CODE:
            unsetToEndIsoCode();
            return;
        case EuPackage.BOUNDARY_POINT__IS_EXCLUDED_FROM_AREA_INTERCHANGE:
            unsetIsExcludedFromAreaInterchange();
            return;
        case EuPackage.BOUNDARY_POINT__TO_END_NAME_TSO:
            unsetToEndNameTso();
            return;
        case EuPackage.BOUNDARY_POINT__FROM_END_ISO_CODE:
            unsetFromEndIsoCode();
            return;
        case EuPackage.BOUNDARY_POINT__FROM_END_NAME_TSO:
            unsetFromEndNameTso();
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
        case EuPackage.BOUNDARY_POINT__CONNECTIVITY_NODE:
            return isSetConnectivityNode();
        case EuPackage.BOUNDARY_POINT__TO_END_NAME:
            return isSetToEndName();
        case EuPackage.BOUNDARY_POINT__IS_DIRECT_CURRENT:
            return isSetIsDirectCurrent();
        case EuPackage.BOUNDARY_POINT__FROM_END_NAME:
            return isSetFromEndName();
        case EuPackage.BOUNDARY_POINT__TO_END_ISO_CODE:
            return isSetToEndIsoCode();
        case EuPackage.BOUNDARY_POINT__IS_EXCLUDED_FROM_AREA_INTERCHANGE:
            return isSetIsExcludedFromAreaInterchange();
        case EuPackage.BOUNDARY_POINT__TO_END_NAME_TSO:
            return isSetToEndNameTso();
        case EuPackage.BOUNDARY_POINT__FROM_END_ISO_CODE:
            return isSetFromEndIsoCode();
        case EuPackage.BOUNDARY_POINT__FROM_END_NAME_TSO:
            return isSetFromEndNameTso();
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
        result.append( " (toEndName: " );
        if( toEndNameESet )
            result.append( toEndName );
        else
            result.append( "<unset>" );
        result.append( ", isDirectCurrent: " );
        if( isDirectCurrentESet )
            result.append( isDirectCurrent );
        else
            result.append( "<unset>" );
        result.append( ", fromEndName: " );
        if( fromEndNameESet )
            result.append( fromEndName );
        else
            result.append( "<unset>" );
        result.append( ", toEndIsoCode: " );
        if( toEndIsoCodeESet )
            result.append( toEndIsoCode );
        else
            result.append( "<unset>" );
        result.append( ", isExcludedFromAreaInterchange: " );
        if( isExcludedFromAreaInterchangeESet )
            result.append( isExcludedFromAreaInterchange );
        else
            result.append( "<unset>" );
        result.append( ", toEndNameTso: " );
        if( toEndNameTsoESet )
            result.append( toEndNameTso );
        else
            result.append( "<unset>" );
        result.append( ", fromEndIsoCode: " );
        if( fromEndIsoCodeESet )
            result.append( fromEndIsoCode );
        else
            result.append( "<unset>" );
        result.append( ", fromEndNameTso: " );
        if( fromEndNameTsoESet )
            result.append( fromEndNameTso );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //BoundaryPointImpl

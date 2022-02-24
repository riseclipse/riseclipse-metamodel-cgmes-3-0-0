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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Equipment;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquipmentContainer;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimitSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Equipment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.EquipmentImpl#getEquipmentContainer <em>Equipment Container</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.EquipmentImpl#getAggregate <em>Aggregate</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.EquipmentImpl#getOperationalLimitSet <em>Operational Limit Set</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.EquipmentImpl#getNormallyInService <em>Normally In Service</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.EquipmentImpl#getInService <em>In Service</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EquipmentImpl extends PowerSystemResourceImpl implements Equipment {
    /**
     * The cached value of the '{@link #getEquipmentContainer() <em>Equipment Container</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEquipmentContainer()
     * @generated
     * @ordered
     */
    protected EquipmentContainer equipmentContainer;

    /**
     * This is true if the Equipment Container reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean equipmentContainerESet;

    /**
     * The default value of the '{@link #getAggregate() <em>Aggregate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAggregate()
     * @generated
     * @ordered
     */
    protected static final Boolean AGGREGATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAggregate() <em>Aggregate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAggregate()
     * @generated
     * @ordered
     */
    protected Boolean aggregate = AGGREGATE_EDEFAULT;

    /**
     * This is true if the Aggregate attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean aggregateESet;

    /**
     * The cached value of the '{@link #getOperationalLimitSet() <em>Operational Limit Set</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperationalLimitSet()
     * @generated
     * @ordered
     */
    protected EList< OperationalLimitSet > operationalLimitSet;

    /**
     * The default value of the '{@link #getNormallyInService() <em>Normally In Service</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNormallyInService()
     * @generated
     * @ordered
     */
    protected static final Boolean NORMALLY_IN_SERVICE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNormallyInService() <em>Normally In Service</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNormallyInService()
     * @generated
     * @ordered
     */
    protected Boolean normallyInService = NORMALLY_IN_SERVICE_EDEFAULT;

    /**
     * This is true if the Normally In Service attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean normallyInServiceESet;

    /**
     * The default value of the '{@link #getInService() <em>In Service</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInService()
     * @generated
     * @ordered
     */
    protected static final Boolean IN_SERVICE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInService() <em>In Service</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInService()
     * @generated
     * @ordered
     */
    protected Boolean inService = IN_SERVICE_EDEFAULT;

    /**
     * This is true if the In Service attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean inServiceESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EquipmentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getEquipment();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getNormallyInService() {
        return normallyInService;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNormallyInService( Boolean newNormallyInService ) {
        Boolean oldNormallyInService = normallyInService;
        normallyInService = newNormallyInService;
        boolean oldNormallyInServiceESet = normallyInServiceESet;
        normallyInServiceESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EQUIPMENT__NORMALLY_IN_SERVICE,
                    oldNormallyInService, normallyInService, !oldNormallyInServiceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNormallyInService() {
        Boolean oldNormallyInService = normallyInService;
        boolean oldNormallyInServiceESet = normallyInServiceESet;
        normallyInService = NORMALLY_IN_SERVICE_EDEFAULT;
        normallyInServiceESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EQUIPMENT__NORMALLY_IN_SERVICE,
                    oldNormallyInService, NORMALLY_IN_SERVICE_EDEFAULT, oldNormallyInServiceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNormallyInService() {
        return normallyInServiceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getInService() {
        return inService;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInService( Boolean newInService ) {
        Boolean oldInService = inService;
        inService = newInService;
        boolean oldInServiceESet = inServiceESet;
        inServiceESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EQUIPMENT__IN_SERVICE, oldInService,
                    inService, !oldInServiceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetInService() {
        Boolean oldInService = inService;
        boolean oldInServiceESet = inServiceESet;
        inService = IN_SERVICE_EDEFAULT;
        inServiceESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EQUIPMENT__IN_SERVICE, oldInService,
                    IN_SERVICE_EDEFAULT, oldInServiceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetInService() {
        return inServiceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getAggregate() {
        return aggregate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAggregate( Boolean newAggregate ) {
        Boolean oldAggregate = aggregate;
        aggregate = newAggregate;
        boolean oldAggregateESet = aggregateESet;
        aggregateESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EQUIPMENT__AGGREGATE, oldAggregate,
                    aggregate, !oldAggregateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAggregate() {
        Boolean oldAggregate = aggregate;
        boolean oldAggregateESet = aggregateESet;
        aggregate = AGGREGATE_EDEFAULT;
        aggregateESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EQUIPMENT__AGGREGATE, oldAggregate,
                    AGGREGATE_EDEFAULT, oldAggregateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAggregate() {
        return aggregateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EquipmentContainer getEquipmentContainer() {
        return equipmentContainer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEquipmentContainer( EquipmentContainer newEquipmentContainer,
            NotificationChain msgs ) {
        EquipmentContainer oldEquipmentContainer = equipmentContainer;
        equipmentContainer = newEquipmentContainer;
        boolean oldEquipmentContainerESet = equipmentContainerESet;
        equipmentContainerESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.EQUIPMENT__EQUIPMENT_CONTAINER, oldEquipmentContainer, newEquipmentContainer,
                    !oldEquipmentContainerESet );
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
    public void setEquipmentContainer( EquipmentContainer newEquipmentContainer ) {
        if( newEquipmentContainer != equipmentContainer ) {
            NotificationChain msgs = null;
            if( equipmentContainer != null )
                msgs = ( ( InternalEObject ) equipmentContainer ).eInverseRemove( this,
                        CimPackage.EQUIPMENT_CONTAINER__EQUIPMENTS, EquipmentContainer.class, msgs );
            if( newEquipmentContainer != null )
                msgs = ( ( InternalEObject ) newEquipmentContainer ).eInverseAdd( this,
                        CimPackage.EQUIPMENT_CONTAINER__EQUIPMENTS, EquipmentContainer.class, msgs );
            msgs = basicSetEquipmentContainer( newEquipmentContainer, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEquipmentContainerESet = equipmentContainerESet;
            equipmentContainerESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EQUIPMENT__EQUIPMENT_CONTAINER,
                        newEquipmentContainer, newEquipmentContainer, !oldEquipmentContainerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetEquipmentContainer( NotificationChain msgs ) {
        EquipmentContainer oldEquipmentContainer = equipmentContainer;
        equipmentContainer = null;
        boolean oldEquipmentContainerESet = equipmentContainerESet;
        equipmentContainerESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.EQUIPMENT__EQUIPMENT_CONTAINER, oldEquipmentContainer, null, oldEquipmentContainerESet );
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
    public void unsetEquipmentContainer() {
        if( equipmentContainer != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) equipmentContainer ).eInverseRemove( this,
                    CimPackage.EQUIPMENT_CONTAINER__EQUIPMENTS, EquipmentContainer.class, msgs );
            msgs = basicUnsetEquipmentContainer( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEquipmentContainerESet = equipmentContainerESet;
            equipmentContainerESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EQUIPMENT__EQUIPMENT_CONTAINER,
                        null, null, oldEquipmentContainerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEquipmentContainer() {
        return equipmentContainerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< OperationalLimitSet > getOperationalLimitSet() {
        if( operationalLimitSet == null ) {
            operationalLimitSet = new EObjectWithInverseResolvingEList.Unsettable< >(
                    OperationalLimitSet.class, this, CimPackage.EQUIPMENT__OPERATIONAL_LIMIT_SET,
                    CimPackage.OPERATIONAL_LIMIT_SET__EQUIPMENT );
        }
        return operationalLimitSet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOperationalLimitSet() {
        if( operationalLimitSet != null ) ( ( InternalEList.Unsettable< ? > ) operationalLimitSet ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOperationalLimitSet() {
        return operationalLimitSet != null && ( ( InternalEList.Unsettable< ? > ) operationalLimitSet ).isSet();
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
        case CimPackage.EQUIPMENT__EQUIPMENT_CONTAINER:
            if( equipmentContainer != null )
                msgs = ( ( InternalEObject ) equipmentContainer ).eInverseRemove( this,
                        CimPackage.EQUIPMENT_CONTAINER__EQUIPMENTS, EquipmentContainer.class, msgs );
            return basicSetEquipmentContainer( ( EquipmentContainer ) otherEnd, msgs );
        case CimPackage.EQUIPMENT__OPERATIONAL_LIMIT_SET:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getOperationalLimitSet() )
                    .basicAdd( otherEnd, msgs );
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
        case CimPackage.EQUIPMENT__EQUIPMENT_CONTAINER:
            return basicUnsetEquipmentContainer( msgs );
        case CimPackage.EQUIPMENT__OPERATIONAL_LIMIT_SET:
            return ( ( InternalEList< ? > ) getOperationalLimitSet() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.EQUIPMENT__EQUIPMENT_CONTAINER:
            return getEquipmentContainer();
        case CimPackage.EQUIPMENT__AGGREGATE:
            return getAggregate();
        case CimPackage.EQUIPMENT__OPERATIONAL_LIMIT_SET:
            return getOperationalLimitSet();
        case CimPackage.EQUIPMENT__NORMALLY_IN_SERVICE:
            return getNormallyInService();
        case CimPackage.EQUIPMENT__IN_SERVICE:
            return getInService();
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
        case CimPackage.EQUIPMENT__EQUIPMENT_CONTAINER:
            setEquipmentContainer( ( EquipmentContainer ) newValue );
            return;
        case CimPackage.EQUIPMENT__AGGREGATE:
            setAggregate( ( Boolean ) newValue );
            return;
        case CimPackage.EQUIPMENT__OPERATIONAL_LIMIT_SET:
            getOperationalLimitSet().clear();
            getOperationalLimitSet().addAll( ( Collection< ? extends OperationalLimitSet > ) newValue );
            return;
        case CimPackage.EQUIPMENT__NORMALLY_IN_SERVICE:
            setNormallyInService( ( Boolean ) newValue );
            return;
        case CimPackage.EQUIPMENT__IN_SERVICE:
            setInService( ( Boolean ) newValue );
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
        case CimPackage.EQUIPMENT__EQUIPMENT_CONTAINER:
            unsetEquipmentContainer();
            return;
        case CimPackage.EQUIPMENT__AGGREGATE:
            unsetAggregate();
            return;
        case CimPackage.EQUIPMENT__OPERATIONAL_LIMIT_SET:
            unsetOperationalLimitSet();
            return;
        case CimPackage.EQUIPMENT__NORMALLY_IN_SERVICE:
            unsetNormallyInService();
            return;
        case CimPackage.EQUIPMENT__IN_SERVICE:
            unsetInService();
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
        case CimPackage.EQUIPMENT__EQUIPMENT_CONTAINER:
            return isSetEquipmentContainer();
        case CimPackage.EQUIPMENT__AGGREGATE:
            return isSetAggregate();
        case CimPackage.EQUIPMENT__OPERATIONAL_LIMIT_SET:
            return isSetOperationalLimitSet();
        case CimPackage.EQUIPMENT__NORMALLY_IN_SERVICE:
            return isSetNormallyInService();
        case CimPackage.EQUIPMENT__IN_SERVICE:
            return isSetInService();
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
        result.append( " (aggregate: " );
        if( aggregateESet )
            result.append( aggregate );
        else
            result.append( "<unset>" );
        result.append( ", normallyInService: " );
        if( normallyInServiceESet )
            result.append( normallyInService );
        else
            result.append( "<unset>" );
        result.append( ", inService: " );
        if( inServiceESet )
            result.append( inService );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //EquipmentImpl

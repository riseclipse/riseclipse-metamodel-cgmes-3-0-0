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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimit;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimitDirectionKind;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimitType;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.LimitKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operational Limit Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.OperationalLimitTypeImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.OperationalLimitTypeImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.OperationalLimitTypeImpl#getAcceptableDuration <em>Acceptable Duration</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.OperationalLimitTypeImpl#getIsInfiniteDuration <em>Is Infinite Duration</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.OperationalLimitTypeImpl#getOperationalLimit <em>Operational Limit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationalLimitTypeImpl extends IdentifiedObjectImpl implements OperationalLimitType {
    /**
     * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDirection()
     * @generated
     * @ordered
     */
    protected static final OperationalLimitDirectionKind DIRECTION_EDEFAULT = OperationalLimitDirectionKind.HIGH;

    /**
     * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDirection()
     * @generated
     * @ordered
     */
    protected OperationalLimitDirectionKind direction = DIRECTION_EDEFAULT;

    /**
     * This is true if the Direction attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean directionESet;

    /**
     * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected static final LimitKind KIND_EDEFAULT = LimitKind.TATL;

    /**
     * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
    protected LimitKind kind = KIND_EDEFAULT;

    /**
     * This is true if the Kind attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kindESet;

    /**
     * The default value of the '{@link #getAcceptableDuration() <em>Acceptable Duration</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAcceptableDuration()
     * @generated
     * @ordered
     */
    protected static final Double ACCEPTABLE_DURATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAcceptableDuration() <em>Acceptable Duration</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAcceptableDuration()
     * @generated
     * @ordered
     */
    protected Double acceptableDuration = ACCEPTABLE_DURATION_EDEFAULT;

    /**
     * This is true if the Acceptable Duration attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean acceptableDurationESet;

    /**
     * The default value of the '{@link #getIsInfiniteDuration() <em>Is Infinite Duration</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsInfiniteDuration()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_INFINITE_DURATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIsInfiniteDuration() <em>Is Infinite Duration</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsInfiniteDuration()
     * @generated
     * @ordered
     */
    protected Boolean isInfiniteDuration = IS_INFINITE_DURATION_EDEFAULT;

    /**
     * This is true if the Is Infinite Duration attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isInfiniteDurationESet;

    /**
     * The cached value of the '{@link #getOperationalLimit() <em>Operational Limit</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperationalLimit()
     * @generated
     * @ordered
     */
    protected EList< OperationalLimit > operationalLimit;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OperationalLimitTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getOperationalLimitType();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public OperationalLimitDirectionKind getDirection() {
        return direction;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDirection( OperationalLimitDirectionKind newDirection ) {
        OperationalLimitDirectionKind oldDirection = direction;
        direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
        boolean oldDirectionESet = directionESet;
        directionESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.OPERATIONAL_LIMIT_TYPE__DIRECTION,
                    oldDirection, direction, !oldDirectionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDirection() {
        OperationalLimitDirectionKind oldDirection = direction;
        boolean oldDirectionESet = directionESet;
        direction = DIRECTION_EDEFAULT;
        directionESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.OPERATIONAL_LIMIT_TYPE__DIRECTION,
                    oldDirection, DIRECTION_EDEFAULT, oldDirectionESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDirection() {
        return directionESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LimitKind getKind() {
        return kind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKind( LimitKind newKind ) {
        LimitKind oldKind = kind;
        kind = newKind == null ? KIND_EDEFAULT : newKind;
        boolean oldKindESet = kindESet;
        kindESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.OPERATIONAL_LIMIT_TYPE__KIND, oldKind,
                    kind, !oldKindESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKind() {
        LimitKind oldKind = kind;
        boolean oldKindESet = kindESet;
        kind = KIND_EDEFAULT;
        kindESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.OPERATIONAL_LIMIT_TYPE__KIND, oldKind,
                    KIND_EDEFAULT, oldKindESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKind() {
        return kindESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getAcceptableDuration() {
        return acceptableDuration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAcceptableDuration( Double newAcceptableDuration ) {
        Double oldAcceptableDuration = acceptableDuration;
        acceptableDuration = newAcceptableDuration;
        boolean oldAcceptableDurationESet = acceptableDurationESet;
        acceptableDurationESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.OPERATIONAL_LIMIT_TYPE__ACCEPTABLE_DURATION, oldAcceptableDuration, acceptableDuration,
                    !oldAcceptableDurationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAcceptableDuration() {
        Double oldAcceptableDuration = acceptableDuration;
        boolean oldAcceptableDurationESet = acceptableDurationESet;
        acceptableDuration = ACCEPTABLE_DURATION_EDEFAULT;
        acceptableDurationESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.OPERATIONAL_LIMIT_TYPE__ACCEPTABLE_DURATION, oldAcceptableDuration,
                    ACCEPTABLE_DURATION_EDEFAULT, oldAcceptableDurationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAcceptableDuration() {
        return acceptableDurationESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< OperationalLimit > getOperationalLimit() {
        if( operationalLimit == null ) {
            operationalLimit = new EObjectWithInverseResolvingEList.Unsettable< >(
                    OperationalLimit.class, this, CimPackage.OPERATIONAL_LIMIT_TYPE__OPERATIONAL_LIMIT,
                    CimPackage.OPERATIONAL_LIMIT__OPERATIONAL_LIMIT_TYPE );
        }
        return operationalLimit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOperationalLimit() {
        if( operationalLimit != null ) {
            ( ( InternalEList.Unsettable< ? > ) operationalLimit ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOperationalLimit() {
        return operationalLimit != null && ( ( InternalEList.Unsettable< ? > ) operationalLimit ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getIsInfiniteDuration() {
        return isInfiniteDuration;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsInfiniteDuration( Boolean newIsInfiniteDuration ) {
        Boolean oldIsInfiniteDuration = isInfiniteDuration;
        isInfiniteDuration = newIsInfiniteDuration;
        boolean oldIsInfiniteDurationESet = isInfiniteDurationESet;
        isInfiniteDurationESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.OPERATIONAL_LIMIT_TYPE__IS_INFINITE_DURATION, oldIsInfiniteDuration, isInfiniteDuration,
                    !oldIsInfiniteDurationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIsInfiniteDuration() {
        Boolean oldIsInfiniteDuration = isInfiniteDuration;
        boolean oldIsInfiniteDurationESet = isInfiniteDurationESet;
        isInfiniteDuration = IS_INFINITE_DURATION_EDEFAULT;
        isInfiniteDurationESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.OPERATIONAL_LIMIT_TYPE__IS_INFINITE_DURATION, oldIsInfiniteDuration,
                    IS_INFINITE_DURATION_EDEFAULT, oldIsInfiniteDurationESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIsInfiniteDuration() {
        return isInfiniteDurationESet;
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
        case CimPackage.OPERATIONAL_LIMIT_TYPE__OPERATIONAL_LIMIT:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getOperationalLimit() )
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
        case CimPackage.OPERATIONAL_LIMIT_TYPE__OPERATIONAL_LIMIT:
            return ( ( InternalEList< ? > ) getOperationalLimit() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.OPERATIONAL_LIMIT_TYPE__DIRECTION:
            return getDirection();
        case CimPackage.OPERATIONAL_LIMIT_TYPE__KIND:
            return getKind();
        case CimPackage.OPERATIONAL_LIMIT_TYPE__ACCEPTABLE_DURATION:
            return getAcceptableDuration();
        case CimPackage.OPERATIONAL_LIMIT_TYPE__IS_INFINITE_DURATION:
            return getIsInfiniteDuration();
        case CimPackage.OPERATIONAL_LIMIT_TYPE__OPERATIONAL_LIMIT:
            return getOperationalLimit();
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
        case CimPackage.OPERATIONAL_LIMIT_TYPE__DIRECTION:
            setDirection( ( OperationalLimitDirectionKind ) newValue );
            return;
        case CimPackage.OPERATIONAL_LIMIT_TYPE__KIND:
            setKind( ( LimitKind ) newValue );
            return;
        case CimPackage.OPERATIONAL_LIMIT_TYPE__ACCEPTABLE_DURATION:
            setAcceptableDuration( ( Double ) newValue );
            return;
        case CimPackage.OPERATIONAL_LIMIT_TYPE__IS_INFINITE_DURATION:
            setIsInfiniteDuration( ( Boolean ) newValue );
            return;
        case CimPackage.OPERATIONAL_LIMIT_TYPE__OPERATIONAL_LIMIT:
            getOperationalLimit().clear();
            getOperationalLimit().addAll( ( Collection< ? extends OperationalLimit > ) newValue );
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
        case CimPackage.OPERATIONAL_LIMIT_TYPE__DIRECTION:
            unsetDirection();
            return;
        case CimPackage.OPERATIONAL_LIMIT_TYPE__KIND:
            unsetKind();
            return;
        case CimPackage.OPERATIONAL_LIMIT_TYPE__ACCEPTABLE_DURATION:
            unsetAcceptableDuration();
            return;
        case CimPackage.OPERATIONAL_LIMIT_TYPE__IS_INFINITE_DURATION:
            unsetIsInfiniteDuration();
            return;
        case CimPackage.OPERATIONAL_LIMIT_TYPE__OPERATIONAL_LIMIT:
            unsetOperationalLimit();
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
        case CimPackage.OPERATIONAL_LIMIT_TYPE__DIRECTION:
            return isSetDirection();
        case CimPackage.OPERATIONAL_LIMIT_TYPE__KIND:
            return isSetKind();
        case CimPackage.OPERATIONAL_LIMIT_TYPE__ACCEPTABLE_DURATION:
            return isSetAcceptableDuration();
        case CimPackage.OPERATIONAL_LIMIT_TYPE__IS_INFINITE_DURATION:
            return isSetIsInfiniteDuration();
        case CimPackage.OPERATIONAL_LIMIT_TYPE__OPERATIONAL_LIMIT:
            return isSetOperationalLimit();
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
        if( eIsProxy() ) {
            return super.toString();
        }

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (direction: " );
        if( directionESet ) {
            result.append( direction );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", kind: " );
        if( kindESet ) {
            result.append( kind );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", acceptableDuration: " );
        if( acceptableDurationESet ) {
            result.append( acceptableDuration );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", isInfiniteDuration: " );
        if( isInfiniteDurationESet ) {
            result.append( isInfiniteDuration );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ')' );
        return result.toString();
    }

} //OperationalLimitTypeImpl

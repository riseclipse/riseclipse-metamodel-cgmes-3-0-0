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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvSwitch;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Switch;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SwitchSchedule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.SwitchImpl#getNormalOpen <em>Normal Open</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.SwitchImpl#getSwitchSchedules <em>Switch Schedules</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.SwitchImpl#getRetained <em>Retained</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.SwitchImpl#getRatedCurrent <em>Rated Current</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.SwitchImpl#getOpen <em>Open</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.SwitchImpl#getLocked <em>Locked</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.SwitchImpl#getSvSwitch <em>Sv Switch</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwitchImpl extends ConductingEquipmentImpl implements Switch {
    /**
     * The default value of the '{@link #getNormalOpen() <em>Normal Open</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNormalOpen()
     * @generated
     * @ordered
     */
    protected static final Boolean NORMAL_OPEN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNormalOpen() <em>Normal Open</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNormalOpen()
     * @generated
     * @ordered
     */
    protected Boolean normalOpen = NORMAL_OPEN_EDEFAULT;

    /**
     * This is true if the Normal Open attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean normalOpenESet;

    /**
     * The cached value of the '{@link #getSwitchSchedules() <em>Switch Schedules</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSwitchSchedules()
     * @generated
     * @ordered
     */
    protected EList< SwitchSchedule > switchSchedules;

    /**
     * The default value of the '{@link #getRetained() <em>Retained</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRetained()
     * @generated
     * @ordered
     */
    protected static final Boolean RETAINED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRetained() <em>Retained</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRetained()
     * @generated
     * @ordered
     */
    protected Boolean retained = RETAINED_EDEFAULT;

    /**
     * This is true if the Retained attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean retainedESet;

    /**
     * The default value of the '{@link #getRatedCurrent() <em>Rated Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedCurrent()
     * @generated
     * @ordered
     */
    protected static final Double RATED_CURRENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRatedCurrent() <em>Rated Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedCurrent()
     * @generated
     * @ordered
     */
    protected Double ratedCurrent = RATED_CURRENT_EDEFAULT;

    /**
     * This is true if the Rated Current attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ratedCurrentESet;

    /**
     * The default value of the '{@link #getOpen() <em>Open</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOpen()
     * @generated
     * @ordered
     */
    protected static final Boolean OPEN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOpen() <em>Open</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOpen()
     * @generated
     * @ordered
     */
    protected Boolean open = OPEN_EDEFAULT;

    /**
     * This is true if the Open attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean openESet;

    /**
     * The default value of the '{@link #getLocked() <em>Locked</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocked()
     * @generated
     * @ordered
     */
    protected static final Boolean LOCKED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLocked() <em>Locked</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLocked()
     * @generated
     * @ordered
     */
    protected Boolean locked = LOCKED_EDEFAULT;

    /**
     * This is true if the Locked attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lockedESet;

    /**
     * The cached value of the '{@link #getSvSwitch() <em>Sv Switch</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSvSwitch()
     * @generated
     * @ordered
     */
    protected EList< SvSwitch > svSwitch;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SwitchImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getSwitch();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getRatedCurrent() {
        return ratedCurrent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRatedCurrent( Double newRatedCurrent ) {
        Double oldRatedCurrent = ratedCurrent;
        ratedCurrent = newRatedCurrent;
        boolean oldRatedCurrentESet = ratedCurrentESet;
        ratedCurrentESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SWITCH__RATED_CURRENT, oldRatedCurrent,
                    ratedCurrent, !oldRatedCurrentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRatedCurrent() {
        Double oldRatedCurrent = ratedCurrent;
        boolean oldRatedCurrentESet = ratedCurrentESet;
        ratedCurrent = RATED_CURRENT_EDEFAULT;
        ratedCurrentESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SWITCH__RATED_CURRENT, oldRatedCurrent,
                    RATED_CURRENT_EDEFAULT, oldRatedCurrentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRatedCurrent() {
        return ratedCurrentESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getOpen() {
        return open;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOpen( Boolean newOpen ) {
        Boolean oldOpen = open;
        open = newOpen;
        boolean oldOpenESet = openESet;
        openESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SWITCH__OPEN, oldOpen, open,
                    !oldOpenESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOpen() {
        Boolean oldOpen = open;
        boolean oldOpenESet = openESet;
        open = OPEN_EDEFAULT;
        openESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SWITCH__OPEN, oldOpen, OPEN_EDEFAULT,
                    oldOpenESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOpen() {
        return openESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getLocked() {
        return locked;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLocked( Boolean newLocked ) {
        Boolean oldLocked = locked;
        locked = newLocked;
        boolean oldLockedESet = lockedESet;
        lockedESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SWITCH__LOCKED, oldLocked, locked,
                    !oldLockedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLocked() {
        Boolean oldLocked = locked;
        boolean oldLockedESet = lockedESet;
        locked = LOCKED_EDEFAULT;
        lockedESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SWITCH__LOCKED, oldLocked,
                    LOCKED_EDEFAULT, oldLockedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLocked() {
        return lockedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< SvSwitch > getSvSwitch() {
        if( svSwitch == null ) {
            svSwitch = new EObjectWithInverseResolvingEList.Unsettable< >( SvSwitch.class, this,
                    CimPackage.SWITCH__SV_SWITCH, CimPackage.SV_SWITCH__SWITCH );
        }
        return svSwitch;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSvSwitch() {
        if( svSwitch != null ) ( ( InternalEList.Unsettable< ? > ) svSwitch ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSvSwitch() {
        return svSwitch != null && ( ( InternalEList.Unsettable< ? > ) svSwitch ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< SwitchSchedule > getSwitchSchedules() {
        if( switchSchedules == null ) {
            switchSchedules = new EObjectWithInverseResolvingEList.Unsettable< >( SwitchSchedule.class,
                    this, CimPackage.SWITCH__SWITCH_SCHEDULES, CimPackage.SWITCH_SCHEDULE__SWITCH );
        }
        return switchSchedules;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSwitchSchedules() {
        if( switchSchedules != null ) ( ( InternalEList.Unsettable< ? > ) switchSchedules ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSwitchSchedules() {
        return switchSchedules != null && ( ( InternalEList.Unsettable< ? > ) switchSchedules ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getNormalOpen() {
        return normalOpen;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNormalOpen( Boolean newNormalOpen ) {
        Boolean oldNormalOpen = normalOpen;
        normalOpen = newNormalOpen;
        boolean oldNormalOpenESet = normalOpenESet;
        normalOpenESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SWITCH__NORMAL_OPEN, oldNormalOpen,
                    normalOpen, !oldNormalOpenESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNormalOpen() {
        Boolean oldNormalOpen = normalOpen;
        boolean oldNormalOpenESet = normalOpenESet;
        normalOpen = NORMAL_OPEN_EDEFAULT;
        normalOpenESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SWITCH__NORMAL_OPEN, oldNormalOpen,
                    NORMAL_OPEN_EDEFAULT, oldNormalOpenESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNormalOpen() {
        return normalOpenESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getRetained() {
        return retained;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRetained( Boolean newRetained ) {
        Boolean oldRetained = retained;
        retained = newRetained;
        boolean oldRetainedESet = retainedESet;
        retainedESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SWITCH__RETAINED, oldRetained, retained,
                    !oldRetainedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRetained() {
        Boolean oldRetained = retained;
        boolean oldRetainedESet = retainedESet;
        retained = RETAINED_EDEFAULT;
        retainedESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SWITCH__RETAINED, oldRetained,
                    RETAINED_EDEFAULT, oldRetainedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRetained() {
        return retainedESet;
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
        case CimPackage.SWITCH__SWITCH_SCHEDULES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getSwitchSchedules() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.SWITCH__SV_SWITCH:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getSvSwitch() ).basicAdd( otherEnd,
                    msgs );
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
        case CimPackage.SWITCH__SWITCH_SCHEDULES:
            return ( ( InternalEList< ? > ) getSwitchSchedules() ).basicRemove( otherEnd, msgs );
        case CimPackage.SWITCH__SV_SWITCH:
            return ( ( InternalEList< ? > ) getSvSwitch() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.SWITCH__NORMAL_OPEN:
            return getNormalOpen();
        case CimPackage.SWITCH__SWITCH_SCHEDULES:
            return getSwitchSchedules();
        case CimPackage.SWITCH__RETAINED:
            return getRetained();
        case CimPackage.SWITCH__RATED_CURRENT:
            return getRatedCurrent();
        case CimPackage.SWITCH__OPEN:
            return getOpen();
        case CimPackage.SWITCH__LOCKED:
            return getLocked();
        case CimPackage.SWITCH__SV_SWITCH:
            return getSvSwitch();
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
        case CimPackage.SWITCH__NORMAL_OPEN:
            setNormalOpen( ( Boolean ) newValue );
            return;
        case CimPackage.SWITCH__SWITCH_SCHEDULES:
            getSwitchSchedules().clear();
            getSwitchSchedules().addAll( ( Collection< ? extends SwitchSchedule > ) newValue );
            return;
        case CimPackage.SWITCH__RETAINED:
            setRetained( ( Boolean ) newValue );
            return;
        case CimPackage.SWITCH__RATED_CURRENT:
            setRatedCurrent( ( Double ) newValue );
            return;
        case CimPackage.SWITCH__OPEN:
            setOpen( ( Boolean ) newValue );
            return;
        case CimPackage.SWITCH__LOCKED:
            setLocked( ( Boolean ) newValue );
            return;
        case CimPackage.SWITCH__SV_SWITCH:
            getSvSwitch().clear();
            getSvSwitch().addAll( ( Collection< ? extends SvSwitch > ) newValue );
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
        case CimPackage.SWITCH__NORMAL_OPEN:
            unsetNormalOpen();
            return;
        case CimPackage.SWITCH__SWITCH_SCHEDULES:
            unsetSwitchSchedules();
            return;
        case CimPackage.SWITCH__RETAINED:
            unsetRetained();
            return;
        case CimPackage.SWITCH__RATED_CURRENT:
            unsetRatedCurrent();
            return;
        case CimPackage.SWITCH__OPEN:
            unsetOpen();
            return;
        case CimPackage.SWITCH__LOCKED:
            unsetLocked();
            return;
        case CimPackage.SWITCH__SV_SWITCH:
            unsetSvSwitch();
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
        case CimPackage.SWITCH__NORMAL_OPEN:
            return isSetNormalOpen();
        case CimPackage.SWITCH__SWITCH_SCHEDULES:
            return isSetSwitchSchedules();
        case CimPackage.SWITCH__RETAINED:
            return isSetRetained();
        case CimPackage.SWITCH__RATED_CURRENT:
            return isSetRatedCurrent();
        case CimPackage.SWITCH__OPEN:
            return isSetOpen();
        case CimPackage.SWITCH__LOCKED:
            return isSetLocked();
        case CimPackage.SWITCH__SV_SWITCH:
            return isSetSvSwitch();
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
        result.append( " (normalOpen: " );
        if( normalOpenESet )
            result.append( normalOpen );
        else
            result.append( "<unset>" );
        result.append( ", retained: " );
        if( retainedESet )
            result.append( retained );
        else
            result.append( "<unset>" );
        result.append( ", ratedCurrent: " );
        if( ratedCurrentESet )
            result.append( ratedCurrent );
        else
            result.append( "<unset>" );
        result.append( ", open: " );
        if( openESet )
            result.append( open );
        else
            result.append( "<unset>" );
        result.append( ", locked: " );
        if( lockedESet )
            result.append( locked );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //SwitchImpl

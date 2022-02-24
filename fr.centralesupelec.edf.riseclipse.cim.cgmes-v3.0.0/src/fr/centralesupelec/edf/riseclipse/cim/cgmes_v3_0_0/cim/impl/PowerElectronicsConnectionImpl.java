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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerElectronicsConnection;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerElectronicsUnit;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType3or4Dynamics;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Power Electronics Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PowerElectronicsConnectionImpl#getMinQ <em>Min Q</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PowerElectronicsConnectionImpl#getPowerElectronicsUnit <em>Power Electronics Unit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PowerElectronicsConnectionImpl#getMaxQ <em>Max Q</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PowerElectronicsConnectionImpl#getRatedS <em>Rated S</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PowerElectronicsConnectionImpl#getRatedU <em>Rated U</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PowerElectronicsConnectionImpl#getWindTurbineType3or4Dynamics <em>Wind Turbine Type3or4 Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PowerElectronicsConnectionImpl#getP <em>P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PowerElectronicsConnectionImpl#getQ <em>Q</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PowerElectronicsConnectionImpl extends RegulatingCondEqImpl implements PowerElectronicsConnection {
    /**
     * The default value of the '{@link #getMinQ() <em>Min Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinQ()
     * @generated
     * @ordered
     */
    protected static final Double MIN_Q_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMinQ() <em>Min Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinQ()
     * @generated
     * @ordered
     */
    protected Double minQ = MIN_Q_EDEFAULT;

    /**
     * This is true if the Min Q attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean minQESet;

    /**
     * The cached value of the '{@link #getPowerElectronicsUnit() <em>Power Electronics Unit</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPowerElectronicsUnit()
     * @generated
     * @ordered
     */
    protected PowerElectronicsUnit powerElectronicsUnit;

    /**
     * This is true if the Power Electronics Unit reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean powerElectronicsUnitESet;

    /**
     * The default value of the '{@link #getMaxQ() <em>Max Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxQ()
     * @generated
     * @ordered
     */
    protected static final Double MAX_Q_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxQ() <em>Max Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxQ()
     * @generated
     * @ordered
     */
    protected Double maxQ = MAX_Q_EDEFAULT;

    /**
     * This is true if the Max Q attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxQESet;

    /**
     * The default value of the '{@link #getRatedS() <em>Rated S</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedS()
     * @generated
     * @ordered
     */
    protected static final Double RATED_S_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRatedS() <em>Rated S</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedS()
     * @generated
     * @ordered
     */
    protected Double ratedS = RATED_S_EDEFAULT;

    /**
     * This is true if the Rated S attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ratedSESet;

    /**
     * The default value of the '{@link #getRatedU() <em>Rated U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedU()
     * @generated
     * @ordered
     */
    protected static final Double RATED_U_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRatedU() <em>Rated U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedU()
     * @generated
     * @ordered
     */
    protected Double ratedU = RATED_U_EDEFAULT;

    /**
     * This is true if the Rated U attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ratedUESet;

    /**
     * The cached value of the '{@link #getWindTurbineType3or4Dynamics() <em>Wind Turbine Type3or4 Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindTurbineType3or4Dynamics()
     * @generated
     * @ordered
     */
    protected WindTurbineType3or4Dynamics windTurbineType3or4Dynamics;

    /**
     * This is true if the Wind Turbine Type3or4 Dynamics reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windTurbineType3or4DynamicsESet;

    /**
     * The default value of the '{@link #getP() <em>P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getP()
     * @generated
     * @ordered
     */
    protected static final Double P_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getP() <em>P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getP()
     * @generated
     * @ordered
     */
    protected Double p = P_EDEFAULT;

    /**
     * This is true if the P attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pESet;

    /**
     * The default value of the '{@link #getQ() <em>Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQ()
     * @generated
     * @ordered
     */
    protected static final Double Q_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getQ() <em>Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQ()
     * @generated
     * @ordered
     */
    protected Double q = Q_EDEFAULT;

    /**
     * This is true if the Q attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean qESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PowerElectronicsConnectionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getPowerElectronicsConnection();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getMinQ() {
        return minQ;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMinQ( Double newMinQ ) {
        Double oldMinQ = minQ;
        minQ = newMinQ;
        boolean oldMinQESet = minQESet;
        minQESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.POWER_ELECTRONICS_CONNECTION__MIN_Q,
                    oldMinQ, minQ, !oldMinQESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMinQ() {
        Double oldMinQ = minQ;
        boolean oldMinQESet = minQESet;
        minQ = MIN_Q_EDEFAULT;
        minQESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.POWER_ELECTRONICS_CONNECTION__MIN_Q,
                    oldMinQ, MIN_Q_EDEFAULT, oldMinQESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMinQ() {
        return minQESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getRatedS() {
        return ratedS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRatedS( Double newRatedS ) {
        Double oldRatedS = ratedS;
        ratedS = newRatedS;
        boolean oldRatedSESet = ratedSESet;
        ratedSESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.POWER_ELECTRONICS_CONNECTION__RATED_S,
                    oldRatedS, ratedS, !oldRatedSESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRatedS() {
        Double oldRatedS = ratedS;
        boolean oldRatedSESet = ratedSESet;
        ratedS = RATED_S_EDEFAULT;
        ratedSESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.POWER_ELECTRONICS_CONNECTION__RATED_S,
                    oldRatedS, RATED_S_EDEFAULT, oldRatedSESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRatedS() {
        return ratedSESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getRatedU() {
        return ratedU;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRatedU( Double newRatedU ) {
        Double oldRatedU = ratedU;
        ratedU = newRatedU;
        boolean oldRatedUESet = ratedUESet;
        ratedUESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.POWER_ELECTRONICS_CONNECTION__RATED_U,
                    oldRatedU, ratedU, !oldRatedUESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRatedU() {
        Double oldRatedU = ratedU;
        boolean oldRatedUESet = ratedUESet;
        ratedU = RATED_U_EDEFAULT;
        ratedUESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.POWER_ELECTRONICS_CONNECTION__RATED_U,
                    oldRatedU, RATED_U_EDEFAULT, oldRatedUESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRatedU() {
        return ratedUESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindTurbineType3or4Dynamics getWindTurbineType3or4Dynamics() {
        if( windTurbineType3or4Dynamics != null && windTurbineType3or4Dynamics.eIsProxy() ) {
            InternalEObject oldWindTurbineType3or4Dynamics = ( InternalEObject ) windTurbineType3or4Dynamics;
            windTurbineType3or4Dynamics = ( WindTurbineType3or4Dynamics ) eResolveProxy(
                    oldWindTurbineType3or4Dynamics );
            if( windTurbineType3or4Dynamics != oldWindTurbineType3or4Dynamics ) {
                if( eNotificationRequired() )
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                            CimPackage.POWER_ELECTRONICS_CONNECTION__WIND_TURBINE_TYPE3OR4_DYNAMICS,
                            oldWindTurbineType3or4Dynamics, windTurbineType3or4Dynamics ) );
            }
        }
        return windTurbineType3or4Dynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindTurbineType3or4Dynamics basicGetWindTurbineType3or4Dynamics() {
        return windTurbineType3or4Dynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindTurbineType3or4Dynamics(
            WindTurbineType3or4Dynamics newWindTurbineType3or4Dynamics, NotificationChain msgs ) {
        WindTurbineType3or4Dynamics oldWindTurbineType3or4Dynamics = windTurbineType3or4Dynamics;
        windTurbineType3or4Dynamics = newWindTurbineType3or4Dynamics;
        boolean oldWindTurbineType3or4DynamicsESet = windTurbineType3or4DynamicsESet;
        windTurbineType3or4DynamicsESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.POWER_ELECTRONICS_CONNECTION__WIND_TURBINE_TYPE3OR4_DYNAMICS,
                    oldWindTurbineType3or4Dynamics, newWindTurbineType3or4Dynamics,
                    !oldWindTurbineType3or4DynamicsESet );
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
    public void setWindTurbineType3or4Dynamics( WindTurbineType3or4Dynamics newWindTurbineType3or4Dynamics ) {
        if( newWindTurbineType3or4Dynamics != windTurbineType3or4Dynamics ) {
            NotificationChain msgs = null;
            if( windTurbineType3or4Dynamics != null )
                msgs = ( ( InternalEObject ) windTurbineType3or4Dynamics ).eInverseRemove( this,
                        CimPackage.WIND_TURBINE_TYPE3OR4_DYNAMICS__POWER_ELECTRONICS_CONNECTION,
                        WindTurbineType3or4Dynamics.class, msgs );
            if( newWindTurbineType3or4Dynamics != null )
                msgs = ( ( InternalEObject ) newWindTurbineType3or4Dynamics ).eInverseAdd( this,
                        CimPackage.WIND_TURBINE_TYPE3OR4_DYNAMICS__POWER_ELECTRONICS_CONNECTION,
                        WindTurbineType3or4Dynamics.class, msgs );
            msgs = basicSetWindTurbineType3or4Dynamics( newWindTurbineType3or4Dynamics, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindTurbineType3or4DynamicsESet = windTurbineType3or4DynamicsESet;
            windTurbineType3or4DynamicsESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        CimPackage.POWER_ELECTRONICS_CONNECTION__WIND_TURBINE_TYPE3OR4_DYNAMICS,
                        newWindTurbineType3or4Dynamics, newWindTurbineType3or4Dynamics,
                        !oldWindTurbineType3or4DynamicsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindTurbineType3or4Dynamics( NotificationChain msgs ) {
        WindTurbineType3or4Dynamics oldWindTurbineType3or4Dynamics = windTurbineType3or4Dynamics;
        windTurbineType3or4Dynamics = null;
        boolean oldWindTurbineType3or4DynamicsESet = windTurbineType3or4DynamicsESet;
        windTurbineType3or4DynamicsESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.POWER_ELECTRONICS_CONNECTION__WIND_TURBINE_TYPE3OR4_DYNAMICS,
                    oldWindTurbineType3or4Dynamics, null, oldWindTurbineType3or4DynamicsESet );
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
    public void unsetWindTurbineType3or4Dynamics() {
        if( windTurbineType3or4Dynamics != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windTurbineType3or4Dynamics ).eInverseRemove( this,
                    CimPackage.WIND_TURBINE_TYPE3OR4_DYNAMICS__POWER_ELECTRONICS_CONNECTION,
                    WindTurbineType3or4Dynamics.class, msgs );
            msgs = basicUnsetWindTurbineType3or4Dynamics( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindTurbineType3or4DynamicsESet = windTurbineType3or4DynamicsESet;
            windTurbineType3or4DynamicsESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.POWER_ELECTRONICS_CONNECTION__WIND_TURBINE_TYPE3OR4_DYNAMICS, null, null,
                        oldWindTurbineType3or4DynamicsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindTurbineType3or4Dynamics() {
        return windTurbineType3or4DynamicsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getP() {
        return p;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setP( Double newP ) {
        Double oldP = p;
        p = newP;
        boolean oldPESet = pESet;
        pESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.POWER_ELECTRONICS_CONNECTION__P, oldP, p,
                    !oldPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetP() {
        Double oldP = p;
        boolean oldPESet = pESet;
        p = P_EDEFAULT;
        pESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.POWER_ELECTRONICS_CONNECTION__P, oldP,
                    P_EDEFAULT, oldPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetP() {
        return pESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getQ() {
        return q;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setQ( Double newQ ) {
        Double oldQ = q;
        q = newQ;
        boolean oldQESet = qESet;
        qESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.POWER_ELECTRONICS_CONNECTION__Q, oldQ, q,
                    !oldQESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetQ() {
        Double oldQ = q;
        boolean oldQESet = qESet;
        q = Q_EDEFAULT;
        qESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.POWER_ELECTRONICS_CONNECTION__Q, oldQ,
                    Q_EDEFAULT, oldQESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetQ() {
        return qESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PowerElectronicsUnit getPowerElectronicsUnit() {
        return powerElectronicsUnit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPowerElectronicsUnit( PowerElectronicsUnit newPowerElectronicsUnit,
            NotificationChain msgs ) {
        PowerElectronicsUnit oldPowerElectronicsUnit = powerElectronicsUnit;
        powerElectronicsUnit = newPowerElectronicsUnit;
        boolean oldPowerElectronicsUnitESet = powerElectronicsUnitESet;
        powerElectronicsUnitESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.POWER_ELECTRONICS_CONNECTION__POWER_ELECTRONICS_UNIT, oldPowerElectronicsUnit,
                    newPowerElectronicsUnit, !oldPowerElectronicsUnitESet );
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
    public void setPowerElectronicsUnit( PowerElectronicsUnit newPowerElectronicsUnit ) {
        if( newPowerElectronicsUnit != powerElectronicsUnit ) {
            NotificationChain msgs = null;
            if( powerElectronicsUnit != null )
                msgs = ( ( InternalEObject ) powerElectronicsUnit ).eInverseRemove( this,
                        CimPackage.POWER_ELECTRONICS_UNIT__POWER_ELECTRONICS_CONNECTION, PowerElectronicsUnit.class,
                        msgs );
            if( newPowerElectronicsUnit != null )
                msgs = ( ( InternalEObject ) newPowerElectronicsUnit ).eInverseAdd( this,
                        CimPackage.POWER_ELECTRONICS_UNIT__POWER_ELECTRONICS_CONNECTION, PowerElectronicsUnit.class,
                        msgs );
            msgs = basicSetPowerElectronicsUnit( newPowerElectronicsUnit, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPowerElectronicsUnitESet = powerElectronicsUnitESet;
            powerElectronicsUnitESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        CimPackage.POWER_ELECTRONICS_CONNECTION__POWER_ELECTRONICS_UNIT, newPowerElectronicsUnit,
                        newPowerElectronicsUnit, !oldPowerElectronicsUnitESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetPowerElectronicsUnit( NotificationChain msgs ) {
        PowerElectronicsUnit oldPowerElectronicsUnit = powerElectronicsUnit;
        powerElectronicsUnit = null;
        boolean oldPowerElectronicsUnitESet = powerElectronicsUnitESet;
        powerElectronicsUnitESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.POWER_ELECTRONICS_CONNECTION__POWER_ELECTRONICS_UNIT, oldPowerElectronicsUnit, null,
                    oldPowerElectronicsUnitESet );
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
    public void unsetPowerElectronicsUnit() {
        if( powerElectronicsUnit != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) powerElectronicsUnit ).eInverseRemove( this,
                    CimPackage.POWER_ELECTRONICS_UNIT__POWER_ELECTRONICS_CONNECTION, PowerElectronicsUnit.class, msgs );
            msgs = basicUnsetPowerElectronicsUnit( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPowerElectronicsUnitESet = powerElectronicsUnitESet;
            powerElectronicsUnitESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.POWER_ELECTRONICS_CONNECTION__POWER_ELECTRONICS_UNIT, null, null,
                        oldPowerElectronicsUnitESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPowerElectronicsUnit() {
        return powerElectronicsUnitESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getMaxQ() {
        return maxQ;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaxQ( Double newMaxQ ) {
        Double oldMaxQ = maxQ;
        maxQ = newMaxQ;
        boolean oldMaxQESet = maxQESet;
        maxQESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.POWER_ELECTRONICS_CONNECTION__MAX_Q,
                    oldMaxQ, maxQ, !oldMaxQESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaxQ() {
        Double oldMaxQ = maxQ;
        boolean oldMaxQESet = maxQESet;
        maxQ = MAX_Q_EDEFAULT;
        maxQESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.POWER_ELECTRONICS_CONNECTION__MAX_Q,
                    oldMaxQ, MAX_Q_EDEFAULT, oldMaxQESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaxQ() {
        return maxQESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.POWER_ELECTRONICS_CONNECTION__POWER_ELECTRONICS_UNIT:
            if( powerElectronicsUnit != null )
                msgs = ( ( InternalEObject ) powerElectronicsUnit ).eInverseRemove( this,
                        CimPackage.POWER_ELECTRONICS_UNIT__POWER_ELECTRONICS_CONNECTION, PowerElectronicsUnit.class,
                        msgs );
            return basicSetPowerElectronicsUnit( ( PowerElectronicsUnit ) otherEnd, msgs );
        case CimPackage.POWER_ELECTRONICS_CONNECTION__WIND_TURBINE_TYPE3OR4_DYNAMICS:
            if( windTurbineType3or4Dynamics != null )
                msgs = ( ( InternalEObject ) windTurbineType3or4Dynamics ).eInverseRemove( this,
                        CimPackage.WIND_TURBINE_TYPE3OR4_DYNAMICS__POWER_ELECTRONICS_CONNECTION,
                        WindTurbineType3or4Dynamics.class, msgs );
            return basicSetWindTurbineType3or4Dynamics( ( WindTurbineType3or4Dynamics ) otherEnd, msgs );
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
        case CimPackage.POWER_ELECTRONICS_CONNECTION__POWER_ELECTRONICS_UNIT:
            return basicUnsetPowerElectronicsUnit( msgs );
        case CimPackage.POWER_ELECTRONICS_CONNECTION__WIND_TURBINE_TYPE3OR4_DYNAMICS:
            return basicUnsetWindTurbineType3or4Dynamics( msgs );
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
        case CimPackage.POWER_ELECTRONICS_CONNECTION__MIN_Q:
            return getMinQ();
        case CimPackage.POWER_ELECTRONICS_CONNECTION__POWER_ELECTRONICS_UNIT:
            return getPowerElectronicsUnit();
        case CimPackage.POWER_ELECTRONICS_CONNECTION__MAX_Q:
            return getMaxQ();
        case CimPackage.POWER_ELECTRONICS_CONNECTION__RATED_S:
            return getRatedS();
        case CimPackage.POWER_ELECTRONICS_CONNECTION__RATED_U:
            return getRatedU();
        case CimPackage.POWER_ELECTRONICS_CONNECTION__WIND_TURBINE_TYPE3OR4_DYNAMICS:
            if( resolve ) return getWindTurbineType3or4Dynamics();
            return basicGetWindTurbineType3or4Dynamics();
        case CimPackage.POWER_ELECTRONICS_CONNECTION__P:
            return getP();
        case CimPackage.POWER_ELECTRONICS_CONNECTION__Q:
            return getQ();
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
        case CimPackage.POWER_ELECTRONICS_CONNECTION__MIN_Q:
            setMinQ( ( Double ) newValue );
            return;
        case CimPackage.POWER_ELECTRONICS_CONNECTION__POWER_ELECTRONICS_UNIT:
            setPowerElectronicsUnit( ( PowerElectronicsUnit ) newValue );
            return;
        case CimPackage.POWER_ELECTRONICS_CONNECTION__MAX_Q:
            setMaxQ( ( Double ) newValue );
            return;
        case CimPackage.POWER_ELECTRONICS_CONNECTION__RATED_S:
            setRatedS( ( Double ) newValue );
            return;
        case CimPackage.POWER_ELECTRONICS_CONNECTION__RATED_U:
            setRatedU( ( Double ) newValue );
            return;
        case CimPackage.POWER_ELECTRONICS_CONNECTION__WIND_TURBINE_TYPE3OR4_DYNAMICS:
            setWindTurbineType3or4Dynamics( ( WindTurbineType3or4Dynamics ) newValue );
            return;
        case CimPackage.POWER_ELECTRONICS_CONNECTION__P:
            setP( ( Double ) newValue );
            return;
        case CimPackage.POWER_ELECTRONICS_CONNECTION__Q:
            setQ( ( Double ) newValue );
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
        case CimPackage.POWER_ELECTRONICS_CONNECTION__MIN_Q:
            unsetMinQ();
            return;
        case CimPackage.POWER_ELECTRONICS_CONNECTION__POWER_ELECTRONICS_UNIT:
            unsetPowerElectronicsUnit();
            return;
        case CimPackage.POWER_ELECTRONICS_CONNECTION__MAX_Q:
            unsetMaxQ();
            return;
        case CimPackage.POWER_ELECTRONICS_CONNECTION__RATED_S:
            unsetRatedS();
            return;
        case CimPackage.POWER_ELECTRONICS_CONNECTION__RATED_U:
            unsetRatedU();
            return;
        case CimPackage.POWER_ELECTRONICS_CONNECTION__WIND_TURBINE_TYPE3OR4_DYNAMICS:
            unsetWindTurbineType3or4Dynamics();
            return;
        case CimPackage.POWER_ELECTRONICS_CONNECTION__P:
            unsetP();
            return;
        case CimPackage.POWER_ELECTRONICS_CONNECTION__Q:
            unsetQ();
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
        case CimPackage.POWER_ELECTRONICS_CONNECTION__MIN_Q:
            return isSetMinQ();
        case CimPackage.POWER_ELECTRONICS_CONNECTION__POWER_ELECTRONICS_UNIT:
            return isSetPowerElectronicsUnit();
        case CimPackage.POWER_ELECTRONICS_CONNECTION__MAX_Q:
            return isSetMaxQ();
        case CimPackage.POWER_ELECTRONICS_CONNECTION__RATED_S:
            return isSetRatedS();
        case CimPackage.POWER_ELECTRONICS_CONNECTION__RATED_U:
            return isSetRatedU();
        case CimPackage.POWER_ELECTRONICS_CONNECTION__WIND_TURBINE_TYPE3OR4_DYNAMICS:
            return isSetWindTurbineType3or4Dynamics();
        case CimPackage.POWER_ELECTRONICS_CONNECTION__P:
            return isSetP();
        case CimPackage.POWER_ELECTRONICS_CONNECTION__Q:
            return isSetQ();
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
        result.append( " (minQ: " );
        if( minQESet )
            result.append( minQ );
        else
            result.append( "<unset>" );
        result.append( ", maxQ: " );
        if( maxQESet )
            result.append( maxQ );
        else
            result.append( "<unset>" );
        result.append( ", ratedS: " );
        if( ratedSESet )
            result.append( ratedS );
        else
            result.append( "<unset>" );
        result.append( ", ratedU: " );
        if( ratedUESet )
            result.append( ratedU );
        else
            result.append( "<unset>" );
        result.append( ", p: " );
        if( pESet )
            result.append( p );
        else
            result.append( "<unset>" );
        result.append( ", q: " );
        if( qESet )
            result.append( q );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //PowerElectronicsConnectionImpl

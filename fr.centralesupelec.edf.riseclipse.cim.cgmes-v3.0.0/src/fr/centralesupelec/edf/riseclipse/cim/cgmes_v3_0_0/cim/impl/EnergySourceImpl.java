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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySchedulingType;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergySource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Energy Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.EnergySourceImpl#getNominalVoltage <em>Nominal Voltage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.EnergySourceImpl#getEnergySchedulingType <em>Energy Scheduling Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.EnergySourceImpl#getPMax <em>PMax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.EnergySourceImpl#getPMin <em>PMin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.EnergySourceImpl#getX0 <em>X0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.EnergySourceImpl#getXn <em>Xn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.EnergySourceImpl#getX <em>X</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.EnergySourceImpl#getR <em>R</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.EnergySourceImpl#getR0 <em>R0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.EnergySourceImpl#getRn <em>Rn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.EnergySourceImpl#getVoltageMagnitude <em>Voltage Magnitude</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.EnergySourceImpl#getVoltageAngle <em>Voltage Angle</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.EnergySourceImpl#getReactivePower <em>Reactive Power</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.EnergySourceImpl#getActivePower <em>Active Power</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnergySourceImpl extends EnergyConnectionImpl implements EnergySource {
    /**
     * The default value of the '{@link #getNominalVoltage() <em>Nominal Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNominalVoltage()
     * @generated
     * @ordered
     */
    protected static final Double NOMINAL_VOLTAGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNominalVoltage() <em>Nominal Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNominalVoltage()
     * @generated
     * @ordered
     */
    protected Double nominalVoltage = NOMINAL_VOLTAGE_EDEFAULT;

    /**
     * This is true if the Nominal Voltage attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean nominalVoltageESet;

    /**
     * The cached value of the '{@link #getEnergySchedulingType() <em>Energy Scheduling Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnergySchedulingType()
     * @generated
     * @ordered
     */
    protected EnergySchedulingType energySchedulingType;

    /**
     * This is true if the Energy Scheduling Type reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean energySchedulingTypeESet;

    /**
     * The default value of the '{@link #getPMax() <em>PMax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPMax()
     * @generated
     * @ordered
     */
    protected static final Double PMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPMax() <em>PMax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPMax()
     * @generated
     * @ordered
     */
    protected Double pMax = PMAX_EDEFAULT;

    /**
     * This is true if the PMax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pMaxESet;

    /**
     * The default value of the '{@link #getPMin() <em>PMin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPMin()
     * @generated
     * @ordered
     */
    protected static final Double PMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPMin() <em>PMin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPMin()
     * @generated
     * @ordered
     */
    protected Double pMin = PMIN_EDEFAULT;

    /**
     * This is true if the PMin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pMinESet;

    /**
     * The default value of the '{@link #getX0() <em>X0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX0()
     * @generated
     * @ordered
     */
    protected static final Double X0_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getX0() <em>X0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX0()
     * @generated
     * @ordered
     */
    protected Double x0 = X0_EDEFAULT;

    /**
     * This is true if the X0 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean x0ESet;

    /**
     * The default value of the '{@link #getXn() <em>Xn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXn()
     * @generated
     * @ordered
     */
    protected static final Double XN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getXn() <em>Xn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXn()
     * @generated
     * @ordered
     */
    protected Double xn = XN_EDEFAULT;

    /**
     * This is true if the Xn attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xnESet;

    /**
     * The default value of the '{@link #getX() <em>X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX()
     * @generated
     * @ordered
     */
    protected static final Double X_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getX() <em>X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX()
     * @generated
     * @ordered
     */
    protected Double x = X_EDEFAULT;

    /**
     * This is true if the X attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xESet;

    /**
     * The default value of the '{@link #getR() <em>R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR()
     * @generated
     * @ordered
     */
    protected static final Double R_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getR() <em>R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR()
     * @generated
     * @ordered
     */
    protected Double r = R_EDEFAULT;

    /**
     * This is true if the R attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rESet;

    /**
     * The default value of the '{@link #getR0() <em>R0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR0()
     * @generated
     * @ordered
     */
    protected static final Double R0_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getR0() <em>R0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR0()
     * @generated
     * @ordered
     */
    protected Double r0 = R0_EDEFAULT;

    /**
     * This is true if the R0 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean r0ESet;

    /**
     * The default value of the '{@link #getRn() <em>Rn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRn()
     * @generated
     * @ordered
     */
    protected static final Double RN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRn() <em>Rn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRn()
     * @generated
     * @ordered
     */
    protected Double rn = RN_EDEFAULT;

    /**
     * This is true if the Rn attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rnESet;

    /**
     * The default value of the '{@link #getVoltageMagnitude() <em>Voltage Magnitude</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVoltageMagnitude()
     * @generated
     * @ordered
     */
    protected static final Double VOLTAGE_MAGNITUDE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVoltageMagnitude() <em>Voltage Magnitude</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVoltageMagnitude()
     * @generated
     * @ordered
     */
    protected Double voltageMagnitude = VOLTAGE_MAGNITUDE_EDEFAULT;

    /**
     * This is true if the Voltage Magnitude attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean voltageMagnitudeESet;

    /**
     * The default value of the '{@link #getVoltageAngle() <em>Voltage Angle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVoltageAngle()
     * @generated
     * @ordered
     */
    protected static final Double VOLTAGE_ANGLE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVoltageAngle() <em>Voltage Angle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVoltageAngle()
     * @generated
     * @ordered
     */
    protected Double voltageAngle = VOLTAGE_ANGLE_EDEFAULT;

    /**
     * This is true if the Voltage Angle attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean voltageAngleESet;

    /**
     * The default value of the '{@link #getReactivePower() <em>Reactive Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReactivePower()
     * @generated
     * @ordered
     */
    protected static final Double REACTIVE_POWER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getReactivePower() <em>Reactive Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReactivePower()
     * @generated
     * @ordered
     */
    protected Double reactivePower = REACTIVE_POWER_EDEFAULT;

    /**
     * This is true if the Reactive Power attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean reactivePowerESet;

    /**
     * The default value of the '{@link #getActivePower() <em>Active Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getActivePower()
     * @generated
     * @ordered
     */
    protected static final Double ACTIVE_POWER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getActivePower() <em>Active Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getActivePower()
     * @generated
     * @ordered
     */
    protected Double activePower = ACTIVE_POWER_EDEFAULT;

    /**
     * This is true if the Active Power attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean activePowerESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EnergySourceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getEnergySource();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getPMax() {
        return pMax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPMax( Double newPMax ) {
        Double oldPMax = pMax;
        pMax = newPMax;
        boolean oldPMaxESet = pMaxESet;
        pMaxESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ENERGY_SOURCE__PMAX, oldPMax, pMax,
                    !oldPMaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPMax() {
        Double oldPMax = pMax;
        boolean oldPMaxESet = pMaxESet;
        pMax = PMAX_EDEFAULT;
        pMaxESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ENERGY_SOURCE__PMAX, oldPMax,
                    PMAX_EDEFAULT, oldPMaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPMax() {
        return pMaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getPMin() {
        return pMin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPMin( Double newPMin ) {
        Double oldPMin = pMin;
        pMin = newPMin;
        boolean oldPMinESet = pMinESet;
        pMinESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ENERGY_SOURCE__PMIN, oldPMin, pMin,
                    !oldPMinESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPMin() {
        Double oldPMin = pMin;
        boolean oldPMinESet = pMinESet;
        pMin = PMIN_EDEFAULT;
        pMinESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ENERGY_SOURCE__PMIN, oldPMin,
                    PMIN_EDEFAULT, oldPMinESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPMin() {
        return pMinESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getX0() {
        return x0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setX0( Double newX0 ) {
        Double oldX0 = x0;
        x0 = newX0;
        boolean oldX0ESet = x0ESet;
        x0ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ENERGY_SOURCE__X0, oldX0, x0,
                    !oldX0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetX0() {
        Double oldX0 = x0;
        boolean oldX0ESet = x0ESet;
        x0 = X0_EDEFAULT;
        x0ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ENERGY_SOURCE__X0, oldX0, X0_EDEFAULT,
                    oldX0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetX0() {
        return x0ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getXn() {
        return xn;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setXn( Double newXn ) {
        Double oldXn = xn;
        xn = newXn;
        boolean oldXnESet = xnESet;
        xnESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ENERGY_SOURCE__XN, oldXn, xn,
                    !oldXnESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetXn() {
        Double oldXn = xn;
        boolean oldXnESet = xnESet;
        xn = XN_EDEFAULT;
        xnESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ENERGY_SOURCE__XN, oldXn, XN_EDEFAULT,
                    oldXnESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetXn() {
        return xnESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getX() {
        return x;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setX( Double newX ) {
        Double oldX = x;
        x = newX;
        boolean oldXESet = xESet;
        xESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ENERGY_SOURCE__X, oldX, x, !oldXESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetX() {
        Double oldX = x;
        boolean oldXESet = xESet;
        x = X_EDEFAULT;
        xESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ENERGY_SOURCE__X, oldX, X_EDEFAULT,
                    oldXESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetX() {
        return xESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getR() {
        return r;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setR( Double newR ) {
        Double oldR = r;
        r = newR;
        boolean oldRESet = rESet;
        rESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ENERGY_SOURCE__R, oldR, r, !oldRESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetR() {
        Double oldR = r;
        boolean oldRESet = rESet;
        r = R_EDEFAULT;
        rESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ENERGY_SOURCE__R, oldR, R_EDEFAULT,
                    oldRESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetR() {
        return rESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getR0() {
        return r0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setR0( Double newR0 ) {
        Double oldR0 = r0;
        r0 = newR0;
        boolean oldR0ESet = r0ESet;
        r0ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ENERGY_SOURCE__R0, oldR0, r0,
                    !oldR0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetR0() {
        Double oldR0 = r0;
        boolean oldR0ESet = r0ESet;
        r0 = R0_EDEFAULT;
        r0ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ENERGY_SOURCE__R0, oldR0, R0_EDEFAULT,
                    oldR0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetR0() {
        return r0ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getRn() {
        return rn;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRn( Double newRn ) {
        Double oldRn = rn;
        rn = newRn;
        boolean oldRnESet = rnESet;
        rnESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ENERGY_SOURCE__RN, oldRn, rn,
                    !oldRnESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRn() {
        Double oldRn = rn;
        boolean oldRnESet = rnESet;
        rn = RN_EDEFAULT;
        rnESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ENERGY_SOURCE__RN, oldRn, RN_EDEFAULT,
                    oldRnESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRn() {
        return rnESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVoltageMagnitude() {
        return voltageMagnitude;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVoltageMagnitude( Double newVoltageMagnitude ) {
        Double oldVoltageMagnitude = voltageMagnitude;
        voltageMagnitude = newVoltageMagnitude;
        boolean oldVoltageMagnitudeESet = voltageMagnitudeESet;
        voltageMagnitudeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ENERGY_SOURCE__VOLTAGE_MAGNITUDE,
                    oldVoltageMagnitude, voltageMagnitude, !oldVoltageMagnitudeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVoltageMagnitude() {
        Double oldVoltageMagnitude = voltageMagnitude;
        boolean oldVoltageMagnitudeESet = voltageMagnitudeESet;
        voltageMagnitude = VOLTAGE_MAGNITUDE_EDEFAULT;
        voltageMagnitudeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ENERGY_SOURCE__VOLTAGE_MAGNITUDE,
                    oldVoltageMagnitude, VOLTAGE_MAGNITUDE_EDEFAULT, oldVoltageMagnitudeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVoltageMagnitude() {
        return voltageMagnitudeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVoltageAngle() {
        return voltageAngle;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVoltageAngle( Double newVoltageAngle ) {
        Double oldVoltageAngle = voltageAngle;
        voltageAngle = newVoltageAngle;
        boolean oldVoltageAngleESet = voltageAngleESet;
        voltageAngleESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ENERGY_SOURCE__VOLTAGE_ANGLE,
                    oldVoltageAngle, voltageAngle, !oldVoltageAngleESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVoltageAngle() {
        Double oldVoltageAngle = voltageAngle;
        boolean oldVoltageAngleESet = voltageAngleESet;
        voltageAngle = VOLTAGE_ANGLE_EDEFAULT;
        voltageAngleESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ENERGY_SOURCE__VOLTAGE_ANGLE,
                    oldVoltageAngle, VOLTAGE_ANGLE_EDEFAULT, oldVoltageAngleESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVoltageAngle() {
        return voltageAngleESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getReactivePower() {
        return reactivePower;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setReactivePower( Double newReactivePower ) {
        Double oldReactivePower = reactivePower;
        reactivePower = newReactivePower;
        boolean oldReactivePowerESet = reactivePowerESet;
        reactivePowerESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ENERGY_SOURCE__REACTIVE_POWER,
                    oldReactivePower, reactivePower, !oldReactivePowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReactivePower() {
        Double oldReactivePower = reactivePower;
        boolean oldReactivePowerESet = reactivePowerESet;
        reactivePower = REACTIVE_POWER_EDEFAULT;
        reactivePowerESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ENERGY_SOURCE__REACTIVE_POWER,
                    oldReactivePower, REACTIVE_POWER_EDEFAULT, oldReactivePowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReactivePower() {
        return reactivePowerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getActivePower() {
        return activePower;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setActivePower( Double newActivePower ) {
        Double oldActivePower = activePower;
        activePower = newActivePower;
        boolean oldActivePowerESet = activePowerESet;
        activePowerESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ENERGY_SOURCE__ACTIVE_POWER,
                    oldActivePower, activePower, !oldActivePowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetActivePower() {
        Double oldActivePower = activePower;
        boolean oldActivePowerESet = activePowerESet;
        activePower = ACTIVE_POWER_EDEFAULT;
        activePowerESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ENERGY_SOURCE__ACTIVE_POWER,
                    oldActivePower, ACTIVE_POWER_EDEFAULT, oldActivePowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetActivePower() {
        return activePowerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getNominalVoltage() {
        return nominalVoltage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNominalVoltage( Double newNominalVoltage ) {
        Double oldNominalVoltage = nominalVoltage;
        nominalVoltage = newNominalVoltage;
        boolean oldNominalVoltageESet = nominalVoltageESet;
        nominalVoltageESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ENERGY_SOURCE__NOMINAL_VOLTAGE,
                    oldNominalVoltage, nominalVoltage, !oldNominalVoltageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNominalVoltage() {
        Double oldNominalVoltage = nominalVoltage;
        boolean oldNominalVoltageESet = nominalVoltageESet;
        nominalVoltage = NOMINAL_VOLTAGE_EDEFAULT;
        nominalVoltageESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ENERGY_SOURCE__NOMINAL_VOLTAGE,
                    oldNominalVoltage, NOMINAL_VOLTAGE_EDEFAULT, oldNominalVoltageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNominalVoltage() {
        return nominalVoltageESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EnergySchedulingType getEnergySchedulingType() {
        return energySchedulingType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEnergySchedulingType( EnergySchedulingType newEnergySchedulingType,
            NotificationChain msgs ) {
        EnergySchedulingType oldEnergySchedulingType = energySchedulingType;
        energySchedulingType = newEnergySchedulingType;
        boolean oldEnergySchedulingTypeESet = energySchedulingTypeESet;
        energySchedulingTypeESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ENERGY_SOURCE__ENERGY_SCHEDULING_TYPE, oldEnergySchedulingType, newEnergySchedulingType,
                    !oldEnergySchedulingTypeESet );
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
    public void setEnergySchedulingType( EnergySchedulingType newEnergySchedulingType ) {
        if( newEnergySchedulingType != energySchedulingType ) {
            NotificationChain msgs = null;
            if( energySchedulingType != null )
                msgs = ( ( InternalEObject ) energySchedulingType ).eInverseRemove( this,
                        CimPackage.ENERGY_SCHEDULING_TYPE__ENERGY_SOURCE, EnergySchedulingType.class, msgs );
            if( newEnergySchedulingType != null )
                msgs = ( ( InternalEObject ) newEnergySchedulingType ).eInverseAdd( this,
                        CimPackage.ENERGY_SCHEDULING_TYPE__ENERGY_SOURCE, EnergySchedulingType.class, msgs );
            msgs = basicSetEnergySchedulingType( newEnergySchedulingType, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEnergySchedulingTypeESet = energySchedulingTypeESet;
            energySchedulingTypeESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        CimPackage.ENERGY_SOURCE__ENERGY_SCHEDULING_TYPE, newEnergySchedulingType,
                        newEnergySchedulingType, !oldEnergySchedulingTypeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetEnergySchedulingType( NotificationChain msgs ) {
        EnergySchedulingType oldEnergySchedulingType = energySchedulingType;
        energySchedulingType = null;
        boolean oldEnergySchedulingTypeESet = energySchedulingTypeESet;
        energySchedulingTypeESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ENERGY_SOURCE__ENERGY_SCHEDULING_TYPE, oldEnergySchedulingType, null,
                    oldEnergySchedulingTypeESet );
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
    public void unsetEnergySchedulingType() {
        if( energySchedulingType != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) energySchedulingType ).eInverseRemove( this,
                    CimPackage.ENERGY_SCHEDULING_TYPE__ENERGY_SOURCE, EnergySchedulingType.class, msgs );
            msgs = basicUnsetEnergySchedulingType( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEnergySchedulingTypeESet = energySchedulingTypeESet;
            energySchedulingTypeESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.ENERGY_SOURCE__ENERGY_SCHEDULING_TYPE, null, null, oldEnergySchedulingTypeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEnergySchedulingType() {
        return energySchedulingTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.ENERGY_SOURCE__ENERGY_SCHEDULING_TYPE:
            if( energySchedulingType != null )
                msgs = ( ( InternalEObject ) energySchedulingType ).eInverseRemove( this,
                        CimPackage.ENERGY_SCHEDULING_TYPE__ENERGY_SOURCE, EnergySchedulingType.class, msgs );
            return basicSetEnergySchedulingType( ( EnergySchedulingType ) otherEnd, msgs );
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
        case CimPackage.ENERGY_SOURCE__ENERGY_SCHEDULING_TYPE:
            return basicUnsetEnergySchedulingType( msgs );
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
        case CimPackage.ENERGY_SOURCE__NOMINAL_VOLTAGE:
            return getNominalVoltage();
        case CimPackage.ENERGY_SOURCE__ENERGY_SCHEDULING_TYPE:
            return getEnergySchedulingType();
        case CimPackage.ENERGY_SOURCE__PMAX:
            return getPMax();
        case CimPackage.ENERGY_SOURCE__PMIN:
            return getPMin();
        case CimPackage.ENERGY_SOURCE__X0:
            return getX0();
        case CimPackage.ENERGY_SOURCE__XN:
            return getXn();
        case CimPackage.ENERGY_SOURCE__X:
            return getX();
        case CimPackage.ENERGY_SOURCE__R:
            return getR();
        case CimPackage.ENERGY_SOURCE__R0:
            return getR0();
        case CimPackage.ENERGY_SOURCE__RN:
            return getRn();
        case CimPackage.ENERGY_SOURCE__VOLTAGE_MAGNITUDE:
            return getVoltageMagnitude();
        case CimPackage.ENERGY_SOURCE__VOLTAGE_ANGLE:
            return getVoltageAngle();
        case CimPackage.ENERGY_SOURCE__REACTIVE_POWER:
            return getReactivePower();
        case CimPackage.ENERGY_SOURCE__ACTIVE_POWER:
            return getActivePower();
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
        case CimPackage.ENERGY_SOURCE__NOMINAL_VOLTAGE:
            setNominalVoltage( ( Double ) newValue );
            return;
        case CimPackage.ENERGY_SOURCE__ENERGY_SCHEDULING_TYPE:
            setEnergySchedulingType( ( EnergySchedulingType ) newValue );
            return;
        case CimPackage.ENERGY_SOURCE__PMAX:
            setPMax( ( Double ) newValue );
            return;
        case CimPackage.ENERGY_SOURCE__PMIN:
            setPMin( ( Double ) newValue );
            return;
        case CimPackage.ENERGY_SOURCE__X0:
            setX0( ( Double ) newValue );
            return;
        case CimPackage.ENERGY_SOURCE__XN:
            setXn( ( Double ) newValue );
            return;
        case CimPackage.ENERGY_SOURCE__X:
            setX( ( Double ) newValue );
            return;
        case CimPackage.ENERGY_SOURCE__R:
            setR( ( Double ) newValue );
            return;
        case CimPackage.ENERGY_SOURCE__R0:
            setR0( ( Double ) newValue );
            return;
        case CimPackage.ENERGY_SOURCE__RN:
            setRn( ( Double ) newValue );
            return;
        case CimPackage.ENERGY_SOURCE__VOLTAGE_MAGNITUDE:
            setVoltageMagnitude( ( Double ) newValue );
            return;
        case CimPackage.ENERGY_SOURCE__VOLTAGE_ANGLE:
            setVoltageAngle( ( Double ) newValue );
            return;
        case CimPackage.ENERGY_SOURCE__REACTIVE_POWER:
            setReactivePower( ( Double ) newValue );
            return;
        case CimPackage.ENERGY_SOURCE__ACTIVE_POWER:
            setActivePower( ( Double ) newValue );
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
        case CimPackage.ENERGY_SOURCE__NOMINAL_VOLTAGE:
            unsetNominalVoltage();
            return;
        case CimPackage.ENERGY_SOURCE__ENERGY_SCHEDULING_TYPE:
            unsetEnergySchedulingType();
            return;
        case CimPackage.ENERGY_SOURCE__PMAX:
            unsetPMax();
            return;
        case CimPackage.ENERGY_SOURCE__PMIN:
            unsetPMin();
            return;
        case CimPackage.ENERGY_SOURCE__X0:
            unsetX0();
            return;
        case CimPackage.ENERGY_SOURCE__XN:
            unsetXn();
            return;
        case CimPackage.ENERGY_SOURCE__X:
            unsetX();
            return;
        case CimPackage.ENERGY_SOURCE__R:
            unsetR();
            return;
        case CimPackage.ENERGY_SOURCE__R0:
            unsetR0();
            return;
        case CimPackage.ENERGY_SOURCE__RN:
            unsetRn();
            return;
        case CimPackage.ENERGY_SOURCE__VOLTAGE_MAGNITUDE:
            unsetVoltageMagnitude();
            return;
        case CimPackage.ENERGY_SOURCE__VOLTAGE_ANGLE:
            unsetVoltageAngle();
            return;
        case CimPackage.ENERGY_SOURCE__REACTIVE_POWER:
            unsetReactivePower();
            return;
        case CimPackage.ENERGY_SOURCE__ACTIVE_POWER:
            unsetActivePower();
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
        case CimPackage.ENERGY_SOURCE__NOMINAL_VOLTAGE:
            return isSetNominalVoltage();
        case CimPackage.ENERGY_SOURCE__ENERGY_SCHEDULING_TYPE:
            return isSetEnergySchedulingType();
        case CimPackage.ENERGY_SOURCE__PMAX:
            return isSetPMax();
        case CimPackage.ENERGY_SOURCE__PMIN:
            return isSetPMin();
        case CimPackage.ENERGY_SOURCE__X0:
            return isSetX0();
        case CimPackage.ENERGY_SOURCE__XN:
            return isSetXn();
        case CimPackage.ENERGY_SOURCE__X:
            return isSetX();
        case CimPackage.ENERGY_SOURCE__R:
            return isSetR();
        case CimPackage.ENERGY_SOURCE__R0:
            return isSetR0();
        case CimPackage.ENERGY_SOURCE__RN:
            return isSetRn();
        case CimPackage.ENERGY_SOURCE__VOLTAGE_MAGNITUDE:
            return isSetVoltageMagnitude();
        case CimPackage.ENERGY_SOURCE__VOLTAGE_ANGLE:
            return isSetVoltageAngle();
        case CimPackage.ENERGY_SOURCE__REACTIVE_POWER:
            return isSetReactivePower();
        case CimPackage.ENERGY_SOURCE__ACTIVE_POWER:
            return isSetActivePower();
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
        result.append( " (nominalVoltage: " );
        if( nominalVoltageESet )
            result.append( nominalVoltage );
        else
            result.append( "<unset>" );
        result.append( ", pMax: " );
        if( pMaxESet )
            result.append( pMax );
        else
            result.append( "<unset>" );
        result.append( ", pMin: " );
        if( pMinESet )
            result.append( pMin );
        else
            result.append( "<unset>" );
        result.append( ", x0: " );
        if( x0ESet )
            result.append( x0 );
        else
            result.append( "<unset>" );
        result.append( ", xn: " );
        if( xnESet )
            result.append( xn );
        else
            result.append( "<unset>" );
        result.append( ", x: " );
        if( xESet )
            result.append( x );
        else
            result.append( "<unset>" );
        result.append( ", r: " );
        if( rESet )
            result.append( r );
        else
            result.append( "<unset>" );
        result.append( ", r0: " );
        if( r0ESet )
            result.append( r0 );
        else
            result.append( "<unset>" );
        result.append( ", rn: " );
        if( rnESet )
            result.append( rn );
        else
            result.append( "<unset>" );
        result.append( ", voltageMagnitude: " );
        if( voltageMagnitudeESet )
            result.append( voltageMagnitude );
        else
            result.append( "<unset>" );
        result.append( ", voltageAngle: " );
        if( voltageAngleESet )
            result.append( voltageAngle );
        else
            result.append( "<unset>" );
        result.append( ", reactivePower: " );
        if( reactivePowerESet )
            result.append( reactivePower );
        else
            result.append( "<unset>" );
        result.append( ", activePower: " );
        if( activePowerESet )
            result.append( activePower );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //EnergySourceImpl

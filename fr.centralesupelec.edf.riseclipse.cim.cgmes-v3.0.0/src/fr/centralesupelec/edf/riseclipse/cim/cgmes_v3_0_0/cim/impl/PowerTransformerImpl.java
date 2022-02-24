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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerTransformer;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerTransformerEnd;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Power Transformer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PowerTransformerImpl#getPowerTransformerEnd <em>Power Transformer End</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PowerTransformerImpl#getBeforeShCircuitHighestOperatingVoltage <em>Before Sh Circuit Highest Operating Voltage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PowerTransformerImpl#getHighSideMinOperatingU <em>High Side Min Operating U</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PowerTransformerImpl#getIsPartOfGeneratorUnit <em>Is Part Of Generator Unit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PowerTransformerImpl#getBeforeShCircuitHighestOperatingCurrent <em>Before Sh Circuit Highest Operating Current</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PowerTransformerImpl#getOperationalValuesConsidered <em>Operational Values Considered</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PowerTransformerImpl#getBeforeShortCircuitAnglePf <em>Before Short Circuit Angle Pf</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PowerTransformerImpl extends ConductingEquipmentImpl implements PowerTransformer {
    /**
     * The cached value of the '{@link #getPowerTransformerEnd() <em>Power Transformer End</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPowerTransformerEnd()
     * @generated
     * @ordered
     */
    protected EList< PowerTransformerEnd > powerTransformerEnd;

    /**
     * The default value of the '{@link #getBeforeShCircuitHighestOperatingVoltage() <em>Before Sh Circuit Highest Operating Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBeforeShCircuitHighestOperatingVoltage()
     * @generated
     * @ordered
     */
    protected static final Double BEFORE_SH_CIRCUIT_HIGHEST_OPERATING_VOLTAGE_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getBeforeShCircuitHighestOperatingVoltage() <em>Before Sh Circuit Highest Operating Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBeforeShCircuitHighestOperatingVoltage()
     * @generated
     * @ordered
     */
    protected Double beforeShCircuitHighestOperatingVoltage = BEFORE_SH_CIRCUIT_HIGHEST_OPERATING_VOLTAGE_EDEFAULT;
    /**
     * This is true if the Before Sh Circuit Highest Operating Voltage attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean beforeShCircuitHighestOperatingVoltageESet;
    /**
     * The default value of the '{@link #getHighSideMinOperatingU() <em>High Side Min Operating U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHighSideMinOperatingU()
     * @generated
     * @ordered
     */
    protected static final Double HIGH_SIDE_MIN_OPERATING_U_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getHighSideMinOperatingU() <em>High Side Min Operating U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHighSideMinOperatingU()
     * @generated
     * @ordered
     */
    protected Double highSideMinOperatingU = HIGH_SIDE_MIN_OPERATING_U_EDEFAULT;
    /**
     * This is true if the High Side Min Operating U attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean highSideMinOperatingUESet;
    /**
     * The default value of the '{@link #getIsPartOfGeneratorUnit() <em>Is Part Of Generator Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsPartOfGeneratorUnit()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_PART_OF_GENERATOR_UNIT_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getIsPartOfGeneratorUnit() <em>Is Part Of Generator Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsPartOfGeneratorUnit()
     * @generated
     * @ordered
     */
    protected Boolean isPartOfGeneratorUnit = IS_PART_OF_GENERATOR_UNIT_EDEFAULT;
    /**
     * This is true if the Is Part Of Generator Unit attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isPartOfGeneratorUnitESet;
    /**
     * The default value of the '{@link #getBeforeShCircuitHighestOperatingCurrent() <em>Before Sh Circuit Highest Operating Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBeforeShCircuitHighestOperatingCurrent()
     * @generated
     * @ordered
     */
    protected static final Double BEFORE_SH_CIRCUIT_HIGHEST_OPERATING_CURRENT_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getBeforeShCircuitHighestOperatingCurrent() <em>Before Sh Circuit Highest Operating Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBeforeShCircuitHighestOperatingCurrent()
     * @generated
     * @ordered
     */
    protected Double beforeShCircuitHighestOperatingCurrent = BEFORE_SH_CIRCUIT_HIGHEST_OPERATING_CURRENT_EDEFAULT;
    /**
     * This is true if the Before Sh Circuit Highest Operating Current attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean beforeShCircuitHighestOperatingCurrentESet;
    /**
     * The default value of the '{@link #getOperationalValuesConsidered() <em>Operational Values Considered</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperationalValuesConsidered()
     * @generated
     * @ordered
     */
    protected static final Boolean OPERATIONAL_VALUES_CONSIDERED_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getOperationalValuesConsidered() <em>Operational Values Considered</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperationalValuesConsidered()
     * @generated
     * @ordered
     */
    protected Boolean operationalValuesConsidered = OPERATIONAL_VALUES_CONSIDERED_EDEFAULT;
    /**
     * This is true if the Operational Values Considered attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean operationalValuesConsideredESet;
    /**
     * The default value of the '{@link #getBeforeShortCircuitAnglePf() <em>Before Short Circuit Angle Pf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBeforeShortCircuitAnglePf()
     * @generated
     * @ordered
     */
    protected static final Double BEFORE_SHORT_CIRCUIT_ANGLE_PF_EDEFAULT = null;
    /**
     * The cached value of the '{@link #getBeforeShortCircuitAnglePf() <em>Before Short Circuit Angle Pf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBeforeShortCircuitAnglePf()
     * @generated
     * @ordered
     */
    protected Double beforeShortCircuitAnglePf = BEFORE_SHORT_CIRCUIT_ANGLE_PF_EDEFAULT;
    /**
     * This is true if the Before Short Circuit Angle Pf attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean beforeShortCircuitAnglePfESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PowerTransformerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getPowerTransformer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< PowerTransformerEnd > getPowerTransformerEnd() {
        if( powerTransformerEnd == null ) {
            powerTransformerEnd = new EObjectWithInverseResolvingEList.Unsettable< >(
                    PowerTransformerEnd.class, this, CimPackage.POWER_TRANSFORMER__POWER_TRANSFORMER_END,
                    CimPackage.POWER_TRANSFORMER_END__POWER_TRANSFORMER );
        }
        return powerTransformerEnd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPowerTransformerEnd() {
        if( powerTransformerEnd != null ) ( ( InternalEList.Unsettable< ? > ) powerTransformerEnd ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPowerTransformerEnd() {
        return powerTransformerEnd != null && ( ( InternalEList.Unsettable< ? > ) powerTransformerEnd ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getBeforeShCircuitHighestOperatingVoltage() {
        return beforeShCircuitHighestOperatingVoltage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBeforeShCircuitHighestOperatingVoltage( Double newBeforeShCircuitHighestOperatingVoltage ) {
        Double oldBeforeShCircuitHighestOperatingVoltage = beforeShCircuitHighestOperatingVoltage;
        beforeShCircuitHighestOperatingVoltage = newBeforeShCircuitHighestOperatingVoltage;
        boolean oldBeforeShCircuitHighestOperatingVoltageESet = beforeShCircuitHighestOperatingVoltageESet;
        beforeShCircuitHighestOperatingVoltageESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.POWER_TRANSFORMER__BEFORE_SH_CIRCUIT_HIGHEST_OPERATING_VOLTAGE,
                    oldBeforeShCircuitHighestOperatingVoltage, beforeShCircuitHighestOperatingVoltage,
                    !oldBeforeShCircuitHighestOperatingVoltageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBeforeShCircuitHighestOperatingVoltage() {
        Double oldBeforeShCircuitHighestOperatingVoltage = beforeShCircuitHighestOperatingVoltage;
        boolean oldBeforeShCircuitHighestOperatingVoltageESet = beforeShCircuitHighestOperatingVoltageESet;
        beforeShCircuitHighestOperatingVoltage = BEFORE_SH_CIRCUIT_HIGHEST_OPERATING_VOLTAGE_EDEFAULT;
        beforeShCircuitHighestOperatingVoltageESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.POWER_TRANSFORMER__BEFORE_SH_CIRCUIT_HIGHEST_OPERATING_VOLTAGE,
                    oldBeforeShCircuitHighestOperatingVoltage, BEFORE_SH_CIRCUIT_HIGHEST_OPERATING_VOLTAGE_EDEFAULT,
                    oldBeforeShCircuitHighestOperatingVoltageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBeforeShCircuitHighestOperatingVoltage() {
        return beforeShCircuitHighestOperatingVoltageESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getHighSideMinOperatingU() {
        return highSideMinOperatingU;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setHighSideMinOperatingU( Double newHighSideMinOperatingU ) {
        Double oldHighSideMinOperatingU = highSideMinOperatingU;
        highSideMinOperatingU = newHighSideMinOperatingU;
        boolean oldHighSideMinOperatingUESet = highSideMinOperatingUESet;
        highSideMinOperatingUESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.POWER_TRANSFORMER__HIGH_SIDE_MIN_OPERATING_U, oldHighSideMinOperatingU,
                    highSideMinOperatingU, !oldHighSideMinOperatingUESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetHighSideMinOperatingU() {
        Double oldHighSideMinOperatingU = highSideMinOperatingU;
        boolean oldHighSideMinOperatingUESet = highSideMinOperatingUESet;
        highSideMinOperatingU = HIGH_SIDE_MIN_OPERATING_U_EDEFAULT;
        highSideMinOperatingUESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.POWER_TRANSFORMER__HIGH_SIDE_MIN_OPERATING_U, oldHighSideMinOperatingU,
                    HIGH_SIDE_MIN_OPERATING_U_EDEFAULT, oldHighSideMinOperatingUESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetHighSideMinOperatingU() {
        return highSideMinOperatingUESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getIsPartOfGeneratorUnit() {
        return isPartOfGeneratorUnit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsPartOfGeneratorUnit( Boolean newIsPartOfGeneratorUnit ) {
        Boolean oldIsPartOfGeneratorUnit = isPartOfGeneratorUnit;
        isPartOfGeneratorUnit = newIsPartOfGeneratorUnit;
        boolean oldIsPartOfGeneratorUnitESet = isPartOfGeneratorUnitESet;
        isPartOfGeneratorUnitESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.POWER_TRANSFORMER__IS_PART_OF_GENERATOR_UNIT, oldIsPartOfGeneratorUnit,
                    isPartOfGeneratorUnit, !oldIsPartOfGeneratorUnitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIsPartOfGeneratorUnit() {
        Boolean oldIsPartOfGeneratorUnit = isPartOfGeneratorUnit;
        boolean oldIsPartOfGeneratorUnitESet = isPartOfGeneratorUnitESet;
        isPartOfGeneratorUnit = IS_PART_OF_GENERATOR_UNIT_EDEFAULT;
        isPartOfGeneratorUnitESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.POWER_TRANSFORMER__IS_PART_OF_GENERATOR_UNIT, oldIsPartOfGeneratorUnit,
                    IS_PART_OF_GENERATOR_UNIT_EDEFAULT, oldIsPartOfGeneratorUnitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIsPartOfGeneratorUnit() {
        return isPartOfGeneratorUnitESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getBeforeShCircuitHighestOperatingCurrent() {
        return beforeShCircuitHighestOperatingCurrent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBeforeShCircuitHighestOperatingCurrent( Double newBeforeShCircuitHighestOperatingCurrent ) {
        Double oldBeforeShCircuitHighestOperatingCurrent = beforeShCircuitHighestOperatingCurrent;
        beforeShCircuitHighestOperatingCurrent = newBeforeShCircuitHighestOperatingCurrent;
        boolean oldBeforeShCircuitHighestOperatingCurrentESet = beforeShCircuitHighestOperatingCurrentESet;
        beforeShCircuitHighestOperatingCurrentESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.POWER_TRANSFORMER__BEFORE_SH_CIRCUIT_HIGHEST_OPERATING_CURRENT,
                    oldBeforeShCircuitHighestOperatingCurrent, beforeShCircuitHighestOperatingCurrent,
                    !oldBeforeShCircuitHighestOperatingCurrentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBeforeShCircuitHighestOperatingCurrent() {
        Double oldBeforeShCircuitHighestOperatingCurrent = beforeShCircuitHighestOperatingCurrent;
        boolean oldBeforeShCircuitHighestOperatingCurrentESet = beforeShCircuitHighestOperatingCurrentESet;
        beforeShCircuitHighestOperatingCurrent = BEFORE_SH_CIRCUIT_HIGHEST_OPERATING_CURRENT_EDEFAULT;
        beforeShCircuitHighestOperatingCurrentESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.POWER_TRANSFORMER__BEFORE_SH_CIRCUIT_HIGHEST_OPERATING_CURRENT,
                    oldBeforeShCircuitHighestOperatingCurrent, BEFORE_SH_CIRCUIT_HIGHEST_OPERATING_CURRENT_EDEFAULT,
                    oldBeforeShCircuitHighestOperatingCurrentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBeforeShCircuitHighestOperatingCurrent() {
        return beforeShCircuitHighestOperatingCurrentESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getOperationalValuesConsidered() {
        return operationalValuesConsidered;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOperationalValuesConsidered( Boolean newOperationalValuesConsidered ) {
        Boolean oldOperationalValuesConsidered = operationalValuesConsidered;
        operationalValuesConsidered = newOperationalValuesConsidered;
        boolean oldOperationalValuesConsideredESet = operationalValuesConsideredESet;
        operationalValuesConsideredESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.POWER_TRANSFORMER__OPERATIONAL_VALUES_CONSIDERED, oldOperationalValuesConsidered,
                    operationalValuesConsidered, !oldOperationalValuesConsideredESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOperationalValuesConsidered() {
        Boolean oldOperationalValuesConsidered = operationalValuesConsidered;
        boolean oldOperationalValuesConsideredESet = operationalValuesConsideredESet;
        operationalValuesConsidered = OPERATIONAL_VALUES_CONSIDERED_EDEFAULT;
        operationalValuesConsideredESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.POWER_TRANSFORMER__OPERATIONAL_VALUES_CONSIDERED, oldOperationalValuesConsidered,
                    OPERATIONAL_VALUES_CONSIDERED_EDEFAULT, oldOperationalValuesConsideredESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOperationalValuesConsidered() {
        return operationalValuesConsideredESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getBeforeShortCircuitAnglePf() {
        return beforeShortCircuitAnglePf;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBeforeShortCircuitAnglePf( Double newBeforeShortCircuitAnglePf ) {
        Double oldBeforeShortCircuitAnglePf = beforeShortCircuitAnglePf;
        beforeShortCircuitAnglePf = newBeforeShortCircuitAnglePf;
        boolean oldBeforeShortCircuitAnglePfESet = beforeShortCircuitAnglePfESet;
        beforeShortCircuitAnglePfESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.POWER_TRANSFORMER__BEFORE_SHORT_CIRCUIT_ANGLE_PF, oldBeforeShortCircuitAnglePf,
                    beforeShortCircuitAnglePf, !oldBeforeShortCircuitAnglePfESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBeforeShortCircuitAnglePf() {
        Double oldBeforeShortCircuitAnglePf = beforeShortCircuitAnglePf;
        boolean oldBeforeShortCircuitAnglePfESet = beforeShortCircuitAnglePfESet;
        beforeShortCircuitAnglePf = BEFORE_SHORT_CIRCUIT_ANGLE_PF_EDEFAULT;
        beforeShortCircuitAnglePfESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.POWER_TRANSFORMER__BEFORE_SHORT_CIRCUIT_ANGLE_PF, oldBeforeShortCircuitAnglePf,
                    BEFORE_SHORT_CIRCUIT_ANGLE_PF_EDEFAULT, oldBeforeShortCircuitAnglePfESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBeforeShortCircuitAnglePf() {
        return beforeShortCircuitAnglePfESet;
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
        case CimPackage.POWER_TRANSFORMER__POWER_TRANSFORMER_END:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getPowerTransformerEnd() )
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
        case CimPackage.POWER_TRANSFORMER__POWER_TRANSFORMER_END:
            return ( ( InternalEList< ? > ) getPowerTransformerEnd() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.POWER_TRANSFORMER__POWER_TRANSFORMER_END:
            return getPowerTransformerEnd();
        case CimPackage.POWER_TRANSFORMER__BEFORE_SH_CIRCUIT_HIGHEST_OPERATING_VOLTAGE:
            return getBeforeShCircuitHighestOperatingVoltage();
        case CimPackage.POWER_TRANSFORMER__HIGH_SIDE_MIN_OPERATING_U:
            return getHighSideMinOperatingU();
        case CimPackage.POWER_TRANSFORMER__IS_PART_OF_GENERATOR_UNIT:
            return getIsPartOfGeneratorUnit();
        case CimPackage.POWER_TRANSFORMER__BEFORE_SH_CIRCUIT_HIGHEST_OPERATING_CURRENT:
            return getBeforeShCircuitHighestOperatingCurrent();
        case CimPackage.POWER_TRANSFORMER__OPERATIONAL_VALUES_CONSIDERED:
            return getOperationalValuesConsidered();
        case CimPackage.POWER_TRANSFORMER__BEFORE_SHORT_CIRCUIT_ANGLE_PF:
            return getBeforeShortCircuitAnglePf();
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
        case CimPackage.POWER_TRANSFORMER__POWER_TRANSFORMER_END:
            getPowerTransformerEnd().clear();
            getPowerTransformerEnd().addAll( ( Collection< ? extends PowerTransformerEnd > ) newValue );
            return;
        case CimPackage.POWER_TRANSFORMER__BEFORE_SH_CIRCUIT_HIGHEST_OPERATING_VOLTAGE:
            setBeforeShCircuitHighestOperatingVoltage( ( Double ) newValue );
            return;
        case CimPackage.POWER_TRANSFORMER__HIGH_SIDE_MIN_OPERATING_U:
            setHighSideMinOperatingU( ( Double ) newValue );
            return;
        case CimPackage.POWER_TRANSFORMER__IS_PART_OF_GENERATOR_UNIT:
            setIsPartOfGeneratorUnit( ( Boolean ) newValue );
            return;
        case CimPackage.POWER_TRANSFORMER__BEFORE_SH_CIRCUIT_HIGHEST_OPERATING_CURRENT:
            setBeforeShCircuitHighestOperatingCurrent( ( Double ) newValue );
            return;
        case CimPackage.POWER_TRANSFORMER__OPERATIONAL_VALUES_CONSIDERED:
            setOperationalValuesConsidered( ( Boolean ) newValue );
            return;
        case CimPackage.POWER_TRANSFORMER__BEFORE_SHORT_CIRCUIT_ANGLE_PF:
            setBeforeShortCircuitAnglePf( ( Double ) newValue );
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
        case CimPackage.POWER_TRANSFORMER__POWER_TRANSFORMER_END:
            unsetPowerTransformerEnd();
            return;
        case CimPackage.POWER_TRANSFORMER__BEFORE_SH_CIRCUIT_HIGHEST_OPERATING_VOLTAGE:
            unsetBeforeShCircuitHighestOperatingVoltage();
            return;
        case CimPackage.POWER_TRANSFORMER__HIGH_SIDE_MIN_OPERATING_U:
            unsetHighSideMinOperatingU();
            return;
        case CimPackage.POWER_TRANSFORMER__IS_PART_OF_GENERATOR_UNIT:
            unsetIsPartOfGeneratorUnit();
            return;
        case CimPackage.POWER_TRANSFORMER__BEFORE_SH_CIRCUIT_HIGHEST_OPERATING_CURRENT:
            unsetBeforeShCircuitHighestOperatingCurrent();
            return;
        case CimPackage.POWER_TRANSFORMER__OPERATIONAL_VALUES_CONSIDERED:
            unsetOperationalValuesConsidered();
            return;
        case CimPackage.POWER_TRANSFORMER__BEFORE_SHORT_CIRCUIT_ANGLE_PF:
            unsetBeforeShortCircuitAnglePf();
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
        case CimPackage.POWER_TRANSFORMER__POWER_TRANSFORMER_END:
            return isSetPowerTransformerEnd();
        case CimPackage.POWER_TRANSFORMER__BEFORE_SH_CIRCUIT_HIGHEST_OPERATING_VOLTAGE:
            return isSetBeforeShCircuitHighestOperatingVoltage();
        case CimPackage.POWER_TRANSFORMER__HIGH_SIDE_MIN_OPERATING_U:
            return isSetHighSideMinOperatingU();
        case CimPackage.POWER_TRANSFORMER__IS_PART_OF_GENERATOR_UNIT:
            return isSetIsPartOfGeneratorUnit();
        case CimPackage.POWER_TRANSFORMER__BEFORE_SH_CIRCUIT_HIGHEST_OPERATING_CURRENT:
            return isSetBeforeShCircuitHighestOperatingCurrent();
        case CimPackage.POWER_TRANSFORMER__OPERATIONAL_VALUES_CONSIDERED:
            return isSetOperationalValuesConsidered();
        case CimPackage.POWER_TRANSFORMER__BEFORE_SHORT_CIRCUIT_ANGLE_PF:
            return isSetBeforeShortCircuitAnglePf();
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
        result.append( " (beforeShCircuitHighestOperatingVoltage: " );
        if( beforeShCircuitHighestOperatingVoltageESet )
            result.append( beforeShCircuitHighestOperatingVoltage );
        else
            result.append( "<unset>" );
        result.append( ", highSideMinOperatingU: " );
        if( highSideMinOperatingUESet )
            result.append( highSideMinOperatingU );
        else
            result.append( "<unset>" );
        result.append( ", isPartOfGeneratorUnit: " );
        if( isPartOfGeneratorUnitESet )
            result.append( isPartOfGeneratorUnit );
        else
            result.append( "<unset>" );
        result.append( ", beforeShCircuitHighestOperatingCurrent: " );
        if( beforeShCircuitHighestOperatingCurrentESet )
            result.append( beforeShCircuitHighestOperatingCurrent );
        else
            result.append( "<unset>" );
        result.append( ", operationalValuesConsidered: " );
        if( operationalValuesConsideredESet )
            result.append( operationalValuesConsidered );
        else
            result.append( "<unset>" );
        result.append( ", beforeShortCircuitAnglePf: " );
        if( beforeShortCircuitAnglePfESet )
            result.append( beforeShortCircuitAnglePf );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //PowerTransformerImpl

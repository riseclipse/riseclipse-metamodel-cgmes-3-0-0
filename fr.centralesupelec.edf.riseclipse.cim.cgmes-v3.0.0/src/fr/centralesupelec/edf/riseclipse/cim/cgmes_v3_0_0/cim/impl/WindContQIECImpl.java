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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQIEC;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindQcontrolModeKind;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType3or4IEC;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindUVRTQcontrolModeKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wind Cont QIEC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindContQIECImpl#getKiu <em>Kiu</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindContQIECImpl#getKiq <em>Kiq</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindContQIECImpl#getUref0 <em>Uref0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindContQIECImpl#getKqv <em>Kqv</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindContQIECImpl#getKpu <em>Kpu</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindContQIECImpl#getKpq <em>Kpq</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindContQIECImpl#getIqpost <em>Iqpost</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindContQIECImpl#getTpost <em>Tpost</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindContQIECImpl#getWindQcontrolModesType <em>Wind Qcontrol Modes Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindContQIECImpl#getTqord <em>Tqord</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindContQIECImpl#getIqmax <em>Iqmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindContQIECImpl#getIqh1 <em>Iqh1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindContQIECImpl#getUmin <em>Umin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindContQIECImpl#getUmax <em>Umax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindContQIECImpl#getXdroop <em>Xdroop</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindContQIECImpl#getUdb1 <em>Udb1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindContQIECImpl#getUdb2 <em>Udb2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindContQIECImpl#getWindUVRTQcontrolModesType <em>Wind UVRT Qcontrol Modes Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindContQIECImpl#getUqdip <em>Uqdip</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindContQIECImpl#getTufiltq <em>Tufiltq</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindContQIECImpl#getTpfiltq <em>Tpfiltq</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindContQIECImpl#getRdroop <em>Rdroop</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindContQIECImpl#getIqmin <em>Iqmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindContQIECImpl#getWindTurbineType3or4IEC <em>Wind Turbine Type3or4 IEC</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WindContQIECImpl extends IdentifiedObjectImpl implements WindContQIEC {
    /**
     * The default value of the '{@link #getKiu() <em>Kiu</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKiu()
     * @generated
     * @ordered
     */
    protected static final Double KIU_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKiu() <em>Kiu</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKiu()
     * @generated
     * @ordered
     */
    protected Double kiu = KIU_EDEFAULT;

    /**
     * This is true if the Kiu attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kiuESet;

    /**
     * The default value of the '{@link #getKiq() <em>Kiq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKiq()
     * @generated
     * @ordered
     */
    protected static final Double KIQ_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKiq() <em>Kiq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKiq()
     * @generated
     * @ordered
     */
    protected Double kiq = KIQ_EDEFAULT;

    /**
     * This is true if the Kiq attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kiqESet;

    /**
     * The default value of the '{@link #getUref0() <em>Uref0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUref0()
     * @generated
     * @ordered
     */
    protected static final Double UREF0_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUref0() <em>Uref0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUref0()
     * @generated
     * @ordered
     */
    protected Double uref0 = UREF0_EDEFAULT;

    /**
     * This is true if the Uref0 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean uref0ESet;

    /**
     * The default value of the '{@link #getKqv() <em>Kqv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKqv()
     * @generated
     * @ordered
     */
    protected static final Double KQV_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKqv() <em>Kqv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKqv()
     * @generated
     * @ordered
     */
    protected Double kqv = KQV_EDEFAULT;

    /**
     * This is true if the Kqv attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kqvESet;

    /**
     * The default value of the '{@link #getKpu() <em>Kpu</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKpu()
     * @generated
     * @ordered
     */
    protected static final Double KPU_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKpu() <em>Kpu</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKpu()
     * @generated
     * @ordered
     */
    protected Double kpu = KPU_EDEFAULT;

    /**
     * This is true if the Kpu attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kpuESet;

    /**
     * The default value of the '{@link #getKpq() <em>Kpq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKpq()
     * @generated
     * @ordered
     */
    protected static final Double KPQ_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKpq() <em>Kpq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKpq()
     * @generated
     * @ordered
     */
    protected Double kpq = KPQ_EDEFAULT;

    /**
     * This is true if the Kpq attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kpqESet;

    /**
     * The default value of the '{@link #getIqpost() <em>Iqpost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIqpost()
     * @generated
     * @ordered
     */
    protected static final Double IQPOST_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIqpost() <em>Iqpost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIqpost()
     * @generated
     * @ordered
     */
    protected Double iqpost = IQPOST_EDEFAULT;

    /**
     * This is true if the Iqpost attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean iqpostESet;

    /**
     * The default value of the '{@link #getTpost() <em>Tpost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTpost()
     * @generated
     * @ordered
     */
    protected static final Double TPOST_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTpost() <em>Tpost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTpost()
     * @generated
     * @ordered
     */
    protected Double tpost = TPOST_EDEFAULT;

    /**
     * This is true if the Tpost attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tpostESet;

    /**
     * The default value of the '{@link #getWindQcontrolModesType() <em>Wind Qcontrol Modes Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindQcontrolModesType()
     * @generated
     * @ordered
     */
    protected static final WindQcontrolModeKind WIND_QCONTROL_MODES_TYPE_EDEFAULT = WindQcontrolModeKind.VOLTAGE;

    /**
     * The cached value of the '{@link #getWindQcontrolModesType() <em>Wind Qcontrol Modes Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindQcontrolModesType()
     * @generated
     * @ordered
     */
    protected WindQcontrolModeKind windQcontrolModesType = WIND_QCONTROL_MODES_TYPE_EDEFAULT;

    /**
     * This is true if the Wind Qcontrol Modes Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windQcontrolModesTypeESet;

    /**
     * The default value of the '{@link #getTqord() <em>Tqord</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTqord()
     * @generated
     * @ordered
     */
    protected static final Double TQORD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTqord() <em>Tqord</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTqord()
     * @generated
     * @ordered
     */
    protected Double tqord = TQORD_EDEFAULT;

    /**
     * This is true if the Tqord attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tqordESet;

    /**
     * The default value of the '{@link #getIqmax() <em>Iqmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIqmax()
     * @generated
     * @ordered
     */
    protected static final Double IQMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIqmax() <em>Iqmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIqmax()
     * @generated
     * @ordered
     */
    protected Double iqmax = IQMAX_EDEFAULT;

    /**
     * This is true if the Iqmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean iqmaxESet;

    /**
     * The default value of the '{@link #getIqh1() <em>Iqh1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIqh1()
     * @generated
     * @ordered
     */
    protected static final Double IQH1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIqh1() <em>Iqh1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIqh1()
     * @generated
     * @ordered
     */
    protected Double iqh1 = IQH1_EDEFAULT;

    /**
     * This is true if the Iqh1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean iqh1ESet;

    /**
     * The default value of the '{@link #getUmin() <em>Umin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUmin()
     * @generated
     * @ordered
     */
    protected static final Double UMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUmin() <em>Umin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUmin()
     * @generated
     * @ordered
     */
    protected Double umin = UMIN_EDEFAULT;

    /**
     * This is true if the Umin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean uminESet;

    /**
     * The default value of the '{@link #getUmax() <em>Umax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUmax()
     * @generated
     * @ordered
     */
    protected static final Double UMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUmax() <em>Umax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUmax()
     * @generated
     * @ordered
     */
    protected Double umax = UMAX_EDEFAULT;

    /**
     * This is true if the Umax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean umaxESet;

    /**
     * The default value of the '{@link #getXdroop() <em>Xdroop</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXdroop()
     * @generated
     * @ordered
     */
    protected static final Double XDROOP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getXdroop() <em>Xdroop</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXdroop()
     * @generated
     * @ordered
     */
    protected Double xdroop = XDROOP_EDEFAULT;

    /**
     * This is true if the Xdroop attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xdroopESet;

    /**
     * The default value of the '{@link #getUdb1() <em>Udb1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUdb1()
     * @generated
     * @ordered
     */
    protected static final Double UDB1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUdb1() <em>Udb1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUdb1()
     * @generated
     * @ordered
     */
    protected Double udb1 = UDB1_EDEFAULT;

    /**
     * This is true if the Udb1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean udb1ESet;

    /**
     * The default value of the '{@link #getUdb2() <em>Udb2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUdb2()
     * @generated
     * @ordered
     */
    protected static final Double UDB2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUdb2() <em>Udb2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUdb2()
     * @generated
     * @ordered
     */
    protected Double udb2 = UDB2_EDEFAULT;

    /**
     * This is true if the Udb2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean udb2ESet;

    /**
     * The default value of the '{@link #getWindUVRTQcontrolModesType() <em>Wind UVRT Qcontrol Modes Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindUVRTQcontrolModesType()
     * @generated
     * @ordered
     */
    protected static final WindUVRTQcontrolModeKind WIND_UVRT_QCONTROL_MODES_TYPE_EDEFAULT = WindUVRTQcontrolModeKind.MODE1;

    /**
     * The cached value of the '{@link #getWindUVRTQcontrolModesType() <em>Wind UVRT Qcontrol Modes Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindUVRTQcontrolModesType()
     * @generated
     * @ordered
     */
    protected WindUVRTQcontrolModeKind windUVRTQcontrolModesType = WIND_UVRT_QCONTROL_MODES_TYPE_EDEFAULT;

    /**
     * This is true if the Wind UVRT Qcontrol Modes Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windUVRTQcontrolModesTypeESet;

    /**
     * The default value of the '{@link #getUqdip() <em>Uqdip</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUqdip()
     * @generated
     * @ordered
     */
    protected static final Double UQDIP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUqdip() <em>Uqdip</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUqdip()
     * @generated
     * @ordered
     */
    protected Double uqdip = UQDIP_EDEFAULT;

    /**
     * This is true if the Uqdip attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean uqdipESet;

    /**
     * The default value of the '{@link #getTufiltq() <em>Tufiltq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTufiltq()
     * @generated
     * @ordered
     */
    protected static final Double TUFILTQ_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTufiltq() <em>Tufiltq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTufiltq()
     * @generated
     * @ordered
     */
    protected Double tufiltq = TUFILTQ_EDEFAULT;

    /**
     * This is true if the Tufiltq attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tufiltqESet;

    /**
     * The default value of the '{@link #getTpfiltq() <em>Tpfiltq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTpfiltq()
     * @generated
     * @ordered
     */
    protected static final Double TPFILTQ_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTpfiltq() <em>Tpfiltq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTpfiltq()
     * @generated
     * @ordered
     */
    protected Double tpfiltq = TPFILTQ_EDEFAULT;

    /**
     * This is true if the Tpfiltq attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tpfiltqESet;

    /**
     * The default value of the '{@link #getRdroop() <em>Rdroop</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRdroop()
     * @generated
     * @ordered
     */
    protected static final Double RDROOP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRdroop() <em>Rdroop</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRdroop()
     * @generated
     * @ordered
     */
    protected Double rdroop = RDROOP_EDEFAULT;

    /**
     * This is true if the Rdroop attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rdroopESet;

    /**
     * The default value of the '{@link #getIqmin() <em>Iqmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIqmin()
     * @generated
     * @ordered
     */
    protected static final Double IQMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIqmin() <em>Iqmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIqmin()
     * @generated
     * @ordered
     */
    protected Double iqmin = IQMIN_EDEFAULT;

    /**
     * This is true if the Iqmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean iqminESet;

    /**
     * The cached value of the '{@link #getWindTurbineType3or4IEC() <em>Wind Turbine Type3or4 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindTurbineType3or4IEC()
     * @generated
     * @ordered
     */
    protected WindTurbineType3or4IEC windTurbineType3or4IEC;

    /**
     * This is true if the Wind Turbine Type3or4 IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windTurbineType3or4IECESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WindContQIECImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getWindContQIEC();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKiu() {
        return kiu;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKiu( Double newKiu ) {
        Double oldKiu = kiu;
        kiu = newKiu;
        boolean oldKiuESet = kiuESet;
        kiuESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_CONT_QIEC__KIU, oldKiu, kiu,
                    !oldKiuESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKiu() {
        Double oldKiu = kiu;
        boolean oldKiuESet = kiuESet;
        kiu = KIU_EDEFAULT;
        kiuESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_QIEC__KIU, oldKiu,
                    KIU_EDEFAULT, oldKiuESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKiu() {
        return kiuESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKiq() {
        return kiq;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKiq( Double newKiq ) {
        Double oldKiq = kiq;
        kiq = newKiq;
        boolean oldKiqESet = kiqESet;
        kiqESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_CONT_QIEC__KIQ, oldKiq, kiq,
                    !oldKiqESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKiq() {
        Double oldKiq = kiq;
        boolean oldKiqESet = kiqESet;
        kiq = KIQ_EDEFAULT;
        kiqESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_QIEC__KIQ, oldKiq,
                    KIQ_EDEFAULT, oldKiqESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKiq() {
        return kiqESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getUref0() {
        return uref0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUref0( Double newUref0 ) {
        Double oldUref0 = uref0;
        uref0 = newUref0;
        boolean oldUref0ESet = uref0ESet;
        uref0ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_CONT_QIEC__UREF0, oldUref0, uref0,
                    !oldUref0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUref0() {
        Double oldUref0 = uref0;
        boolean oldUref0ESet = uref0ESet;
        uref0 = UREF0_EDEFAULT;
        uref0ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_QIEC__UREF0, oldUref0,
                    UREF0_EDEFAULT, oldUref0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUref0() {
        return uref0ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKqv() {
        return kqv;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKqv( Double newKqv ) {
        Double oldKqv = kqv;
        kqv = newKqv;
        boolean oldKqvESet = kqvESet;
        kqvESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_CONT_QIEC__KQV, oldKqv, kqv,
                    !oldKqvESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKqv() {
        Double oldKqv = kqv;
        boolean oldKqvESet = kqvESet;
        kqv = KQV_EDEFAULT;
        kqvESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_QIEC__KQV, oldKqv,
                    KQV_EDEFAULT, oldKqvESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKqv() {
        return kqvESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKpu() {
        return kpu;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKpu( Double newKpu ) {
        Double oldKpu = kpu;
        kpu = newKpu;
        boolean oldKpuESet = kpuESet;
        kpuESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_CONT_QIEC__KPU, oldKpu, kpu,
                    !oldKpuESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKpu() {
        Double oldKpu = kpu;
        boolean oldKpuESet = kpuESet;
        kpu = KPU_EDEFAULT;
        kpuESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_QIEC__KPU, oldKpu,
                    KPU_EDEFAULT, oldKpuESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKpu() {
        return kpuESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKpq() {
        return kpq;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKpq( Double newKpq ) {
        Double oldKpq = kpq;
        kpq = newKpq;
        boolean oldKpqESet = kpqESet;
        kpqESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_CONT_QIEC__KPQ, oldKpq, kpq,
                    !oldKpqESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKpq() {
        Double oldKpq = kpq;
        boolean oldKpqESet = kpqESet;
        kpq = KPQ_EDEFAULT;
        kpqESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_QIEC__KPQ, oldKpq,
                    KPQ_EDEFAULT, oldKpqESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKpq() {
        return kpqESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getIqpost() {
        return iqpost;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIqpost( Double newIqpost ) {
        Double oldIqpost = iqpost;
        iqpost = newIqpost;
        boolean oldIqpostESet = iqpostESet;
        iqpostESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_CONT_QIEC__IQPOST, oldIqpost,
                    iqpost, !oldIqpostESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIqpost() {
        Double oldIqpost = iqpost;
        boolean oldIqpostESet = iqpostESet;
        iqpost = IQPOST_EDEFAULT;
        iqpostESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_QIEC__IQPOST, oldIqpost,
                    IQPOST_EDEFAULT, oldIqpostESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIqpost() {
        return iqpostESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTpost() {
        return tpost;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTpost( Double newTpost ) {
        Double oldTpost = tpost;
        tpost = newTpost;
        boolean oldTpostESet = tpostESet;
        tpostESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_CONT_QIEC__TPOST, oldTpost, tpost,
                    !oldTpostESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTpost() {
        Double oldTpost = tpost;
        boolean oldTpostESet = tpostESet;
        tpost = TPOST_EDEFAULT;
        tpostESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_QIEC__TPOST, oldTpost,
                    TPOST_EDEFAULT, oldTpostESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTpost() {
        return tpostESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindQcontrolModeKind getWindQcontrolModesType() {
        return windQcontrolModesType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setWindQcontrolModesType( WindQcontrolModeKind newWindQcontrolModesType ) {
        WindQcontrolModeKind oldWindQcontrolModesType = windQcontrolModesType;
        windQcontrolModesType = newWindQcontrolModesType == null ? WIND_QCONTROL_MODES_TYPE_EDEFAULT
                : newWindQcontrolModesType;
        boolean oldWindQcontrolModesTypeESet = windQcontrolModesTypeESet;
        windQcontrolModesTypeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_CONT_QIEC__WIND_QCONTROL_MODES_TYPE,
                    oldWindQcontrolModesType, windQcontrolModesType, !oldWindQcontrolModesTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWindQcontrolModesType() {
        WindQcontrolModeKind oldWindQcontrolModesType = windQcontrolModesType;
        boolean oldWindQcontrolModesTypeESet = windQcontrolModesTypeESet;
        windQcontrolModesType = WIND_QCONTROL_MODES_TYPE_EDEFAULT;
        windQcontrolModesTypeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_CONT_QIEC__WIND_QCONTROL_MODES_TYPE, oldWindQcontrolModesType,
                    WIND_QCONTROL_MODES_TYPE_EDEFAULT, oldWindQcontrolModesTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindQcontrolModesType() {
        return windQcontrolModesTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTqord() {
        return tqord;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTqord( Double newTqord ) {
        Double oldTqord = tqord;
        tqord = newTqord;
        boolean oldTqordESet = tqordESet;
        tqordESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_CONT_QIEC__TQORD, oldTqord, tqord,
                    !oldTqordESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTqord() {
        Double oldTqord = tqord;
        boolean oldTqordESet = tqordESet;
        tqord = TQORD_EDEFAULT;
        tqordESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_QIEC__TQORD, oldTqord,
                    TQORD_EDEFAULT, oldTqordESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTqord() {
        return tqordESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getIqmax() {
        return iqmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIqmax( Double newIqmax ) {
        Double oldIqmax = iqmax;
        iqmax = newIqmax;
        boolean oldIqmaxESet = iqmaxESet;
        iqmaxESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_CONT_QIEC__IQMAX, oldIqmax, iqmax,
                    !oldIqmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIqmax() {
        Double oldIqmax = iqmax;
        boolean oldIqmaxESet = iqmaxESet;
        iqmax = IQMAX_EDEFAULT;
        iqmaxESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_QIEC__IQMAX, oldIqmax,
                    IQMAX_EDEFAULT, oldIqmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIqmax() {
        return iqmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getIqh1() {
        return iqh1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIqh1( Double newIqh1 ) {
        Double oldIqh1 = iqh1;
        iqh1 = newIqh1;
        boolean oldIqh1ESet = iqh1ESet;
        iqh1ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_CONT_QIEC__IQH1, oldIqh1, iqh1,
                    !oldIqh1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIqh1() {
        Double oldIqh1 = iqh1;
        boolean oldIqh1ESet = iqh1ESet;
        iqh1 = IQH1_EDEFAULT;
        iqh1ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_QIEC__IQH1, oldIqh1,
                    IQH1_EDEFAULT, oldIqh1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIqh1() {
        return iqh1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getUmin() {
        return umin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUmin( Double newUmin ) {
        Double oldUmin = umin;
        umin = newUmin;
        boolean oldUminESet = uminESet;
        uminESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_CONT_QIEC__UMIN, oldUmin, umin,
                    !oldUminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUmin() {
        Double oldUmin = umin;
        boolean oldUminESet = uminESet;
        umin = UMIN_EDEFAULT;
        uminESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_QIEC__UMIN, oldUmin,
                    UMIN_EDEFAULT, oldUminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUmin() {
        return uminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getUmax() {
        return umax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUmax( Double newUmax ) {
        Double oldUmax = umax;
        umax = newUmax;
        boolean oldUmaxESet = umaxESet;
        umaxESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_CONT_QIEC__UMAX, oldUmax, umax,
                    !oldUmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUmax() {
        Double oldUmax = umax;
        boolean oldUmaxESet = umaxESet;
        umax = UMAX_EDEFAULT;
        umaxESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_QIEC__UMAX, oldUmax,
                    UMAX_EDEFAULT, oldUmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUmax() {
        return umaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getXdroop() {
        return xdroop;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setXdroop( Double newXdroop ) {
        Double oldXdroop = xdroop;
        xdroop = newXdroop;
        boolean oldXdroopESet = xdroopESet;
        xdroopESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_CONT_QIEC__XDROOP, oldXdroop,
                    xdroop, !oldXdroopESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetXdroop() {
        Double oldXdroop = xdroop;
        boolean oldXdroopESet = xdroopESet;
        xdroop = XDROOP_EDEFAULT;
        xdroopESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_QIEC__XDROOP, oldXdroop,
                    XDROOP_EDEFAULT, oldXdroopESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetXdroop() {
        return xdroopESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getUdb1() {
        return udb1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUdb1( Double newUdb1 ) {
        Double oldUdb1 = udb1;
        udb1 = newUdb1;
        boolean oldUdb1ESet = udb1ESet;
        udb1ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_CONT_QIEC__UDB1, oldUdb1, udb1,
                    !oldUdb1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUdb1() {
        Double oldUdb1 = udb1;
        boolean oldUdb1ESet = udb1ESet;
        udb1 = UDB1_EDEFAULT;
        udb1ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_QIEC__UDB1, oldUdb1,
                    UDB1_EDEFAULT, oldUdb1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUdb1() {
        return udb1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getUdb2() {
        return udb2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUdb2( Double newUdb2 ) {
        Double oldUdb2 = udb2;
        udb2 = newUdb2;
        boolean oldUdb2ESet = udb2ESet;
        udb2ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_CONT_QIEC__UDB2, oldUdb2, udb2,
                    !oldUdb2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUdb2() {
        Double oldUdb2 = udb2;
        boolean oldUdb2ESet = udb2ESet;
        udb2 = UDB2_EDEFAULT;
        udb2ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_QIEC__UDB2, oldUdb2,
                    UDB2_EDEFAULT, oldUdb2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUdb2() {
        return udb2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindUVRTQcontrolModeKind getWindUVRTQcontrolModesType() {
        return windUVRTQcontrolModesType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setWindUVRTQcontrolModesType( WindUVRTQcontrolModeKind newWindUVRTQcontrolModesType ) {
        WindUVRTQcontrolModeKind oldWindUVRTQcontrolModesType = windUVRTQcontrolModesType;
        windUVRTQcontrolModesType = newWindUVRTQcontrolModesType == null ? WIND_UVRT_QCONTROL_MODES_TYPE_EDEFAULT
                : newWindUVRTQcontrolModesType;
        boolean oldWindUVRTQcontrolModesTypeESet = windUVRTQcontrolModesTypeESet;
        windUVRTQcontrolModesTypeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_CONT_QIEC__WIND_UVRT_QCONTROL_MODES_TYPE, oldWindUVRTQcontrolModesType,
                    windUVRTQcontrolModesType, !oldWindUVRTQcontrolModesTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWindUVRTQcontrolModesType() {
        WindUVRTQcontrolModeKind oldWindUVRTQcontrolModesType = windUVRTQcontrolModesType;
        boolean oldWindUVRTQcontrolModesTypeESet = windUVRTQcontrolModesTypeESet;
        windUVRTQcontrolModesType = WIND_UVRT_QCONTROL_MODES_TYPE_EDEFAULT;
        windUVRTQcontrolModesTypeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_CONT_QIEC__WIND_UVRT_QCONTROL_MODES_TYPE, oldWindUVRTQcontrolModesType,
                    WIND_UVRT_QCONTROL_MODES_TYPE_EDEFAULT, oldWindUVRTQcontrolModesTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindUVRTQcontrolModesType() {
        return windUVRTQcontrolModesTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getUqdip() {
        return uqdip;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUqdip( Double newUqdip ) {
        Double oldUqdip = uqdip;
        uqdip = newUqdip;
        boolean oldUqdipESet = uqdipESet;
        uqdipESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_CONT_QIEC__UQDIP, oldUqdip, uqdip,
                    !oldUqdipESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUqdip() {
        Double oldUqdip = uqdip;
        boolean oldUqdipESet = uqdipESet;
        uqdip = UQDIP_EDEFAULT;
        uqdipESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_QIEC__UQDIP, oldUqdip,
                    UQDIP_EDEFAULT, oldUqdipESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUqdip() {
        return uqdipESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTufiltq() {
        return tufiltq;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTufiltq( Double newTufiltq ) {
        Double oldTufiltq = tufiltq;
        tufiltq = newTufiltq;
        boolean oldTufiltqESet = tufiltqESet;
        tufiltqESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_CONT_QIEC__TUFILTQ, oldTufiltq,
                    tufiltq, !oldTufiltqESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTufiltq() {
        Double oldTufiltq = tufiltq;
        boolean oldTufiltqESet = tufiltqESet;
        tufiltq = TUFILTQ_EDEFAULT;
        tufiltqESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_QIEC__TUFILTQ, oldTufiltq,
                    TUFILTQ_EDEFAULT, oldTufiltqESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTufiltq() {
        return tufiltqESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTpfiltq() {
        return tpfiltq;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTpfiltq( Double newTpfiltq ) {
        Double oldTpfiltq = tpfiltq;
        tpfiltq = newTpfiltq;
        boolean oldTpfiltqESet = tpfiltqESet;
        tpfiltqESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_CONT_QIEC__TPFILTQ, oldTpfiltq,
                    tpfiltq, !oldTpfiltqESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTpfiltq() {
        Double oldTpfiltq = tpfiltq;
        boolean oldTpfiltqESet = tpfiltqESet;
        tpfiltq = TPFILTQ_EDEFAULT;
        tpfiltqESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_QIEC__TPFILTQ, oldTpfiltq,
                    TPFILTQ_EDEFAULT, oldTpfiltqESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTpfiltq() {
        return tpfiltqESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getRdroop() {
        return rdroop;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRdroop( Double newRdroop ) {
        Double oldRdroop = rdroop;
        rdroop = newRdroop;
        boolean oldRdroopESet = rdroopESet;
        rdroopESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_CONT_QIEC__RDROOP, oldRdroop,
                    rdroop, !oldRdroopESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRdroop() {
        Double oldRdroop = rdroop;
        boolean oldRdroopESet = rdroopESet;
        rdroop = RDROOP_EDEFAULT;
        rdroopESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_QIEC__RDROOP, oldRdroop,
                    RDROOP_EDEFAULT, oldRdroopESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRdroop() {
        return rdroopESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getIqmin() {
        return iqmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIqmin( Double newIqmin ) {
        Double oldIqmin = iqmin;
        iqmin = newIqmin;
        boolean oldIqminESet = iqminESet;
        iqminESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_CONT_QIEC__IQMIN, oldIqmin, iqmin,
                    !oldIqminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIqmin() {
        Double oldIqmin = iqmin;
        boolean oldIqminESet = iqminESet;
        iqmin = IQMIN_EDEFAULT;
        iqminESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_QIEC__IQMIN, oldIqmin,
                    IQMIN_EDEFAULT, oldIqminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIqmin() {
        return iqminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindTurbineType3or4IEC getWindTurbineType3or4IEC() {
        if( windTurbineType3or4IEC != null && windTurbineType3or4IEC.eIsProxy() ) {
            InternalEObject oldWindTurbineType3or4IEC = ( InternalEObject ) windTurbineType3or4IEC;
            windTurbineType3or4IEC = ( WindTurbineType3or4IEC ) eResolveProxy( oldWindTurbineType3or4IEC );
            if( windTurbineType3or4IEC != oldWindTurbineType3or4IEC ) {
                if( eNotificationRequired() )
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                            CimPackage.WIND_CONT_QIEC__WIND_TURBINE_TYPE3OR4_IEC, oldWindTurbineType3or4IEC,
                            windTurbineType3or4IEC ) );
            }
        }
        return windTurbineType3or4IEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindTurbineType3or4IEC basicGetWindTurbineType3or4IEC() {
        return windTurbineType3or4IEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindTurbineType3or4IEC( WindTurbineType3or4IEC newWindTurbineType3or4IEC,
            NotificationChain msgs ) {
        WindTurbineType3or4IEC oldWindTurbineType3or4IEC = windTurbineType3or4IEC;
        windTurbineType3or4IEC = newWindTurbineType3or4IEC;
        boolean oldWindTurbineType3or4IECESet = windTurbineType3or4IECESet;
        windTurbineType3or4IECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_CONT_QIEC__WIND_TURBINE_TYPE3OR4_IEC, oldWindTurbineType3or4IEC,
                    newWindTurbineType3or4IEC, !oldWindTurbineType3or4IECESet );
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
    public void setWindTurbineType3or4IEC( WindTurbineType3or4IEC newWindTurbineType3or4IEC ) {
        if( newWindTurbineType3or4IEC != windTurbineType3or4IEC ) {
            NotificationChain msgs = null;
            if( windTurbineType3or4IEC != null )
                msgs = ( ( InternalEObject ) windTurbineType3or4IEC ).eInverseRemove( this,
                        CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_QIEC, WindTurbineType3or4IEC.class, msgs );
            if( newWindTurbineType3or4IEC != null )
                msgs = ( ( InternalEObject ) newWindTurbineType3or4IEC ).eInverseAdd( this,
                        CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_QIEC, WindTurbineType3or4IEC.class, msgs );
            msgs = basicSetWindTurbineType3or4IEC( newWindTurbineType3or4IEC, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindTurbineType3or4IECESet = windTurbineType3or4IECESet;
            windTurbineType3or4IECESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        CimPackage.WIND_CONT_QIEC__WIND_TURBINE_TYPE3OR4_IEC, newWindTurbineType3or4IEC,
                        newWindTurbineType3or4IEC, !oldWindTurbineType3or4IECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindTurbineType3or4IEC( NotificationChain msgs ) {
        WindTurbineType3or4IEC oldWindTurbineType3or4IEC = windTurbineType3or4IEC;
        windTurbineType3or4IEC = null;
        boolean oldWindTurbineType3or4IECESet = windTurbineType3or4IECESet;
        windTurbineType3or4IECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_CONT_QIEC__WIND_TURBINE_TYPE3OR4_IEC, oldWindTurbineType3or4IEC, null,
                    oldWindTurbineType3or4IECESet );
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
    public void unsetWindTurbineType3or4IEC() {
        if( windTurbineType3or4IEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windTurbineType3or4IEC ).eInverseRemove( this,
                    CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_QIEC, WindTurbineType3or4IEC.class, msgs );
            msgs = basicUnsetWindTurbineType3or4IEC( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindTurbineType3or4IECESet = windTurbineType3or4IECESet;
            windTurbineType3or4IECESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.WIND_CONT_QIEC__WIND_TURBINE_TYPE3OR4_IEC, null, null,
                        oldWindTurbineType3or4IECESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindTurbineType3or4IEC() {
        return windTurbineType3or4IECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.WIND_CONT_QIEC__WIND_TURBINE_TYPE3OR4_IEC:
            if( windTurbineType3or4IEC != null )
                msgs = ( ( InternalEObject ) windTurbineType3or4IEC ).eInverseRemove( this,
                        CimPackage.WIND_TURBINE_TYPE3OR4_IEC__WIND_CONT_QIEC, WindTurbineType3or4IEC.class, msgs );
            return basicSetWindTurbineType3or4IEC( ( WindTurbineType3or4IEC ) otherEnd, msgs );
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
        case CimPackage.WIND_CONT_QIEC__WIND_TURBINE_TYPE3OR4_IEC:
            return basicUnsetWindTurbineType3or4IEC( msgs );
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
        case CimPackage.WIND_CONT_QIEC__KIU:
            return getKiu();
        case CimPackage.WIND_CONT_QIEC__KIQ:
            return getKiq();
        case CimPackage.WIND_CONT_QIEC__UREF0:
            return getUref0();
        case CimPackage.WIND_CONT_QIEC__KQV:
            return getKqv();
        case CimPackage.WIND_CONT_QIEC__KPU:
            return getKpu();
        case CimPackage.WIND_CONT_QIEC__KPQ:
            return getKpq();
        case CimPackage.WIND_CONT_QIEC__IQPOST:
            return getIqpost();
        case CimPackage.WIND_CONT_QIEC__TPOST:
            return getTpost();
        case CimPackage.WIND_CONT_QIEC__WIND_QCONTROL_MODES_TYPE:
            return getWindQcontrolModesType();
        case CimPackage.WIND_CONT_QIEC__TQORD:
            return getTqord();
        case CimPackage.WIND_CONT_QIEC__IQMAX:
            return getIqmax();
        case CimPackage.WIND_CONT_QIEC__IQH1:
            return getIqh1();
        case CimPackage.WIND_CONT_QIEC__UMIN:
            return getUmin();
        case CimPackage.WIND_CONT_QIEC__UMAX:
            return getUmax();
        case CimPackage.WIND_CONT_QIEC__XDROOP:
            return getXdroop();
        case CimPackage.WIND_CONT_QIEC__UDB1:
            return getUdb1();
        case CimPackage.WIND_CONT_QIEC__UDB2:
            return getUdb2();
        case CimPackage.WIND_CONT_QIEC__WIND_UVRT_QCONTROL_MODES_TYPE:
            return getWindUVRTQcontrolModesType();
        case CimPackage.WIND_CONT_QIEC__UQDIP:
            return getUqdip();
        case CimPackage.WIND_CONT_QIEC__TUFILTQ:
            return getTufiltq();
        case CimPackage.WIND_CONT_QIEC__TPFILTQ:
            return getTpfiltq();
        case CimPackage.WIND_CONT_QIEC__RDROOP:
            return getRdroop();
        case CimPackage.WIND_CONT_QIEC__IQMIN:
            return getIqmin();
        case CimPackage.WIND_CONT_QIEC__WIND_TURBINE_TYPE3OR4_IEC:
            if( resolve ) return getWindTurbineType3or4IEC();
            return basicGetWindTurbineType3or4IEC();
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
        case CimPackage.WIND_CONT_QIEC__KIU:
            setKiu( ( Double ) newValue );
            return;
        case CimPackage.WIND_CONT_QIEC__KIQ:
            setKiq( ( Double ) newValue );
            return;
        case CimPackage.WIND_CONT_QIEC__UREF0:
            setUref0( ( Double ) newValue );
            return;
        case CimPackage.WIND_CONT_QIEC__KQV:
            setKqv( ( Double ) newValue );
            return;
        case CimPackage.WIND_CONT_QIEC__KPU:
            setKpu( ( Double ) newValue );
            return;
        case CimPackage.WIND_CONT_QIEC__KPQ:
            setKpq( ( Double ) newValue );
            return;
        case CimPackage.WIND_CONT_QIEC__IQPOST:
            setIqpost( ( Double ) newValue );
            return;
        case CimPackage.WIND_CONT_QIEC__TPOST:
            setTpost( ( Double ) newValue );
            return;
        case CimPackage.WIND_CONT_QIEC__WIND_QCONTROL_MODES_TYPE:
            setWindQcontrolModesType( ( WindQcontrolModeKind ) newValue );
            return;
        case CimPackage.WIND_CONT_QIEC__TQORD:
            setTqord( ( Double ) newValue );
            return;
        case CimPackage.WIND_CONT_QIEC__IQMAX:
            setIqmax( ( Double ) newValue );
            return;
        case CimPackage.WIND_CONT_QIEC__IQH1:
            setIqh1( ( Double ) newValue );
            return;
        case CimPackage.WIND_CONT_QIEC__UMIN:
            setUmin( ( Double ) newValue );
            return;
        case CimPackage.WIND_CONT_QIEC__UMAX:
            setUmax( ( Double ) newValue );
            return;
        case CimPackage.WIND_CONT_QIEC__XDROOP:
            setXdroop( ( Double ) newValue );
            return;
        case CimPackage.WIND_CONT_QIEC__UDB1:
            setUdb1( ( Double ) newValue );
            return;
        case CimPackage.WIND_CONT_QIEC__UDB2:
            setUdb2( ( Double ) newValue );
            return;
        case CimPackage.WIND_CONT_QIEC__WIND_UVRT_QCONTROL_MODES_TYPE:
            setWindUVRTQcontrolModesType( ( WindUVRTQcontrolModeKind ) newValue );
            return;
        case CimPackage.WIND_CONT_QIEC__UQDIP:
            setUqdip( ( Double ) newValue );
            return;
        case CimPackage.WIND_CONT_QIEC__TUFILTQ:
            setTufiltq( ( Double ) newValue );
            return;
        case CimPackage.WIND_CONT_QIEC__TPFILTQ:
            setTpfiltq( ( Double ) newValue );
            return;
        case CimPackage.WIND_CONT_QIEC__RDROOP:
            setRdroop( ( Double ) newValue );
            return;
        case CimPackage.WIND_CONT_QIEC__IQMIN:
            setIqmin( ( Double ) newValue );
            return;
        case CimPackage.WIND_CONT_QIEC__WIND_TURBINE_TYPE3OR4_IEC:
            setWindTurbineType3or4IEC( ( WindTurbineType3or4IEC ) newValue );
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
        case CimPackage.WIND_CONT_QIEC__KIU:
            unsetKiu();
            return;
        case CimPackage.WIND_CONT_QIEC__KIQ:
            unsetKiq();
            return;
        case CimPackage.WIND_CONT_QIEC__UREF0:
            unsetUref0();
            return;
        case CimPackage.WIND_CONT_QIEC__KQV:
            unsetKqv();
            return;
        case CimPackage.WIND_CONT_QIEC__KPU:
            unsetKpu();
            return;
        case CimPackage.WIND_CONT_QIEC__KPQ:
            unsetKpq();
            return;
        case CimPackage.WIND_CONT_QIEC__IQPOST:
            unsetIqpost();
            return;
        case CimPackage.WIND_CONT_QIEC__TPOST:
            unsetTpost();
            return;
        case CimPackage.WIND_CONT_QIEC__WIND_QCONTROL_MODES_TYPE:
            unsetWindQcontrolModesType();
            return;
        case CimPackage.WIND_CONT_QIEC__TQORD:
            unsetTqord();
            return;
        case CimPackage.WIND_CONT_QIEC__IQMAX:
            unsetIqmax();
            return;
        case CimPackage.WIND_CONT_QIEC__IQH1:
            unsetIqh1();
            return;
        case CimPackage.WIND_CONT_QIEC__UMIN:
            unsetUmin();
            return;
        case CimPackage.WIND_CONT_QIEC__UMAX:
            unsetUmax();
            return;
        case CimPackage.WIND_CONT_QIEC__XDROOP:
            unsetXdroop();
            return;
        case CimPackage.WIND_CONT_QIEC__UDB1:
            unsetUdb1();
            return;
        case CimPackage.WIND_CONT_QIEC__UDB2:
            unsetUdb2();
            return;
        case CimPackage.WIND_CONT_QIEC__WIND_UVRT_QCONTROL_MODES_TYPE:
            unsetWindUVRTQcontrolModesType();
            return;
        case CimPackage.WIND_CONT_QIEC__UQDIP:
            unsetUqdip();
            return;
        case CimPackage.WIND_CONT_QIEC__TUFILTQ:
            unsetTufiltq();
            return;
        case CimPackage.WIND_CONT_QIEC__TPFILTQ:
            unsetTpfiltq();
            return;
        case CimPackage.WIND_CONT_QIEC__RDROOP:
            unsetRdroop();
            return;
        case CimPackage.WIND_CONT_QIEC__IQMIN:
            unsetIqmin();
            return;
        case CimPackage.WIND_CONT_QIEC__WIND_TURBINE_TYPE3OR4_IEC:
            unsetWindTurbineType3or4IEC();
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
        case CimPackage.WIND_CONT_QIEC__KIU:
            return isSetKiu();
        case CimPackage.WIND_CONT_QIEC__KIQ:
            return isSetKiq();
        case CimPackage.WIND_CONT_QIEC__UREF0:
            return isSetUref0();
        case CimPackage.WIND_CONT_QIEC__KQV:
            return isSetKqv();
        case CimPackage.WIND_CONT_QIEC__KPU:
            return isSetKpu();
        case CimPackage.WIND_CONT_QIEC__KPQ:
            return isSetKpq();
        case CimPackage.WIND_CONT_QIEC__IQPOST:
            return isSetIqpost();
        case CimPackage.WIND_CONT_QIEC__TPOST:
            return isSetTpost();
        case CimPackage.WIND_CONT_QIEC__WIND_QCONTROL_MODES_TYPE:
            return isSetWindQcontrolModesType();
        case CimPackage.WIND_CONT_QIEC__TQORD:
            return isSetTqord();
        case CimPackage.WIND_CONT_QIEC__IQMAX:
            return isSetIqmax();
        case CimPackage.WIND_CONT_QIEC__IQH1:
            return isSetIqh1();
        case CimPackage.WIND_CONT_QIEC__UMIN:
            return isSetUmin();
        case CimPackage.WIND_CONT_QIEC__UMAX:
            return isSetUmax();
        case CimPackage.WIND_CONT_QIEC__XDROOP:
            return isSetXdroop();
        case CimPackage.WIND_CONT_QIEC__UDB1:
            return isSetUdb1();
        case CimPackage.WIND_CONT_QIEC__UDB2:
            return isSetUdb2();
        case CimPackage.WIND_CONT_QIEC__WIND_UVRT_QCONTROL_MODES_TYPE:
            return isSetWindUVRTQcontrolModesType();
        case CimPackage.WIND_CONT_QIEC__UQDIP:
            return isSetUqdip();
        case CimPackage.WIND_CONT_QIEC__TUFILTQ:
            return isSetTufiltq();
        case CimPackage.WIND_CONT_QIEC__TPFILTQ:
            return isSetTpfiltq();
        case CimPackage.WIND_CONT_QIEC__RDROOP:
            return isSetRdroop();
        case CimPackage.WIND_CONT_QIEC__IQMIN:
            return isSetIqmin();
        case CimPackage.WIND_CONT_QIEC__WIND_TURBINE_TYPE3OR4_IEC:
            return isSetWindTurbineType3or4IEC();
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
        result.append( " (kiu: " );
        if( kiuESet )
            result.append( kiu );
        else
            result.append( "<unset>" );
        result.append( ", kiq: " );
        if( kiqESet )
            result.append( kiq );
        else
            result.append( "<unset>" );
        result.append( ", uref0: " );
        if( uref0ESet )
            result.append( uref0 );
        else
            result.append( "<unset>" );
        result.append( ", kqv: " );
        if( kqvESet )
            result.append( kqv );
        else
            result.append( "<unset>" );
        result.append( ", kpu: " );
        if( kpuESet )
            result.append( kpu );
        else
            result.append( "<unset>" );
        result.append( ", kpq: " );
        if( kpqESet )
            result.append( kpq );
        else
            result.append( "<unset>" );
        result.append( ", iqpost: " );
        if( iqpostESet )
            result.append( iqpost );
        else
            result.append( "<unset>" );
        result.append( ", tpost: " );
        if( tpostESet )
            result.append( tpost );
        else
            result.append( "<unset>" );
        result.append( ", windQcontrolModesType: " );
        if( windQcontrolModesTypeESet )
            result.append( windQcontrolModesType );
        else
            result.append( "<unset>" );
        result.append( ", tqord: " );
        if( tqordESet )
            result.append( tqord );
        else
            result.append( "<unset>" );
        result.append( ", iqmax: " );
        if( iqmaxESet )
            result.append( iqmax );
        else
            result.append( "<unset>" );
        result.append( ", iqh1: " );
        if( iqh1ESet )
            result.append( iqh1 );
        else
            result.append( "<unset>" );
        result.append( ", umin: " );
        if( uminESet )
            result.append( umin );
        else
            result.append( "<unset>" );
        result.append( ", umax: " );
        if( umaxESet )
            result.append( umax );
        else
            result.append( "<unset>" );
        result.append( ", xdroop: " );
        if( xdroopESet )
            result.append( xdroop );
        else
            result.append( "<unset>" );
        result.append( ", udb1: " );
        if( udb1ESet )
            result.append( udb1 );
        else
            result.append( "<unset>" );
        result.append( ", udb2: " );
        if( udb2ESet )
            result.append( udb2 );
        else
            result.append( "<unset>" );
        result.append( ", windUVRTQcontrolModesType: " );
        if( windUVRTQcontrolModesTypeESet )
            result.append( windUVRTQcontrolModesType );
        else
            result.append( "<unset>" );
        result.append( ", uqdip: " );
        if( uqdipESet )
            result.append( uqdip );
        else
            result.append( "<unset>" );
        result.append( ", tufiltq: " );
        if( tufiltqESet )
            result.append( tufiltq );
        else
            result.append( "<unset>" );
        result.append( ", tpfiltq: " );
        if( tpfiltqESet )
            result.append( tpfiltq );
        else
            result.append( "<unset>" );
        result.append( ", rdroop: " );
        if( rdroopESet )
            result.append( rdroop );
        else
            result.append( "<unset>" );
        result.append( ", iqmin: " );
        if( iqminESet )
            result.append( iqmin );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //WindContQIECImpl

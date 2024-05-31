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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType3IEC;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wind Cont PType3 IEC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindContPType3IECImpl#getTpord <em>Tpord</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindContPType3IECImpl#getDpmax <em>Dpmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindContPType3IECImpl#getTomegafiltp3 <em>Tomegafiltp3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindContPType3IECImpl#getUdvs <em>Udvs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindContPType3IECImpl#getOmegaoffset <em>Omegaoffset</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindContPType3IECImpl#getDprefmax <em>Dprefmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindContPType3IECImpl#getDprefmin <em>Dprefmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindContPType3IECImpl#getPdtdmax <em>Pdtdmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindContPType3IECImpl#getThetaemin <em>Thetaemin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindContPType3IECImpl#getMpuvrt <em>Mpuvrt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindContPType3IECImpl#getWindTurbineType3IEC <em>Wind Turbine Type3 IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindContPType3IECImpl#getTomegaref <em>Tomegaref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindContPType3IECImpl#getDthetamaxuvrt <em>Dthetamaxuvrt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindContPType3IECImpl#getDthetamax <em>Dthetamax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindContPType3IECImpl#getKdtd <em>Kdtd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindContPType3IECImpl#getTufiltp3 <em>Tufiltp3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindContPType3IECImpl#getKpp <em>Kpp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindContPType3IECImpl#getTpfiltp3 <em>Tpfiltp3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindContPType3IECImpl#getTdvs <em>Tdvs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindContPType3IECImpl#getUpdip <em>Updip</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindContPType3IECImpl#getWindDynamicsLookupTable <em>Wind Dynamics Lookup Table</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindContPType3IECImpl#getKip <em>Kip</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindContPType3IECImpl#getThetauscale <em>Thetauscale</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindContPType3IECImpl#getOmegadtd <em>Omegadtd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.WindContPType3IECImpl#getZeta <em>Zeta</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WindContPType3IECImpl extends IdentifiedObjectImpl implements WindContPType3IEC {
    /**
     * The default value of the '{@link #getTpord() <em>Tpord</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTpord()
     * @generated
     * @ordered
     */
    protected static final Double TPORD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTpord() <em>Tpord</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTpord()
     * @generated
     * @ordered
     */
    protected Double tpord = TPORD_EDEFAULT;

    /**
     * This is true if the Tpord attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tpordESet;

    /**
     * The default value of the '{@link #getDpmax() <em>Dpmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDpmax()
     * @generated
     * @ordered
     */
    protected static final Double DPMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDpmax() <em>Dpmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDpmax()
     * @generated
     * @ordered
     */
    protected Double dpmax = DPMAX_EDEFAULT;

    /**
     * This is true if the Dpmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dpmaxESet;

    /**
     * The default value of the '{@link #getTomegafiltp3() <em>Tomegafiltp3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTomegafiltp3()
     * @generated
     * @ordered
     */
    protected static final Double TOMEGAFILTP3_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTomegafiltp3() <em>Tomegafiltp3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTomegafiltp3()
     * @generated
     * @ordered
     */
    protected Double tomegafiltp3 = TOMEGAFILTP3_EDEFAULT;

    /**
     * This is true if the Tomegafiltp3 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tomegafiltp3ESet;

    /**
     * The default value of the '{@link #getUdvs() <em>Udvs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUdvs()
     * @generated
     * @ordered
     */
    protected static final Double UDVS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUdvs() <em>Udvs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUdvs()
     * @generated
     * @ordered
     */
    protected Double udvs = UDVS_EDEFAULT;

    /**
     * This is true if the Udvs attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean udvsESet;

    /**
     * The default value of the '{@link #getOmegaoffset() <em>Omegaoffset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOmegaoffset()
     * @generated
     * @ordered
     */
    protected static final Double OMEGAOFFSET_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOmegaoffset() <em>Omegaoffset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOmegaoffset()
     * @generated
     * @ordered
     */
    protected Double omegaoffset = OMEGAOFFSET_EDEFAULT;

    /**
     * This is true if the Omegaoffset attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean omegaoffsetESet;

    /**
     * The default value of the '{@link #getDprefmax() <em>Dprefmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDprefmax()
     * @generated
     * @ordered
     */
    protected static final Double DPREFMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDprefmax() <em>Dprefmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDprefmax()
     * @generated
     * @ordered
     */
    protected Double dprefmax = DPREFMAX_EDEFAULT;

    /**
     * This is true if the Dprefmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dprefmaxESet;

    /**
     * The default value of the '{@link #getDprefmin() <em>Dprefmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDprefmin()
     * @generated
     * @ordered
     */
    protected static final Double DPREFMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDprefmin() <em>Dprefmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDprefmin()
     * @generated
     * @ordered
     */
    protected Double dprefmin = DPREFMIN_EDEFAULT;

    /**
     * This is true if the Dprefmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dprefminESet;

    /**
     * The default value of the '{@link #getPdtdmax() <em>Pdtdmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPdtdmax()
     * @generated
     * @ordered
     */
    protected static final Double PDTDMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPdtdmax() <em>Pdtdmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPdtdmax()
     * @generated
     * @ordered
     */
    protected Double pdtdmax = PDTDMAX_EDEFAULT;

    /**
     * This is true if the Pdtdmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pdtdmaxESet;

    /**
     * The default value of the '{@link #getThetaemin() <em>Thetaemin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThetaemin()
     * @generated
     * @ordered
     */
    protected static final Double THETAEMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getThetaemin() <em>Thetaemin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThetaemin()
     * @generated
     * @ordered
     */
    protected Double thetaemin = THETAEMIN_EDEFAULT;

    /**
     * This is true if the Thetaemin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean thetaeminESet;

    /**
     * The default value of the '{@link #getMpuvrt() <em>Mpuvrt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMpuvrt()
     * @generated
     * @ordered
     */
    protected static final Boolean MPUVRT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMpuvrt() <em>Mpuvrt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMpuvrt()
     * @generated
     * @ordered
     */
    protected Boolean mpuvrt = MPUVRT_EDEFAULT;

    /**
     * This is true if the Mpuvrt attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean mpuvrtESet;

    /**
     * The cached value of the '{@link #getWindTurbineType3IEC() <em>Wind Turbine Type3 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindTurbineType3IEC()
     * @generated
     * @ordered
     */
    protected WindTurbineType3IEC windTurbineType3IEC;

    /**
     * This is true if the Wind Turbine Type3 IEC reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windTurbineType3IECESet;

    /**
     * The default value of the '{@link #getTomegaref() <em>Tomegaref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTomegaref()
     * @generated
     * @ordered
     */
    protected static final Double TOMEGAREF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTomegaref() <em>Tomegaref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTomegaref()
     * @generated
     * @ordered
     */
    protected Double tomegaref = TOMEGAREF_EDEFAULT;

    /**
     * This is true if the Tomegaref attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tomegarefESet;

    /**
     * The default value of the '{@link #getDthetamaxuvrt() <em>Dthetamaxuvrt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDthetamaxuvrt()
     * @generated
     * @ordered
     */
    protected static final Double DTHETAMAXUVRT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDthetamaxuvrt() <em>Dthetamaxuvrt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDthetamaxuvrt()
     * @generated
     * @ordered
     */
    protected Double dthetamaxuvrt = DTHETAMAXUVRT_EDEFAULT;

    /**
     * This is true if the Dthetamaxuvrt attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dthetamaxuvrtESet;

    /**
     * The default value of the '{@link #getDthetamax() <em>Dthetamax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDthetamax()
     * @generated
     * @ordered
     */
    protected static final Double DTHETAMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDthetamax() <em>Dthetamax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDthetamax()
     * @generated
     * @ordered
     */
    protected Double dthetamax = DTHETAMAX_EDEFAULT;

    /**
     * This is true if the Dthetamax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dthetamaxESet;

    /**
     * The default value of the '{@link #getKdtd() <em>Kdtd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKdtd()
     * @generated
     * @ordered
     */
    protected static final Double KDTD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKdtd() <em>Kdtd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKdtd()
     * @generated
     * @ordered
     */
    protected Double kdtd = KDTD_EDEFAULT;

    /**
     * This is true if the Kdtd attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kdtdESet;

    /**
     * The default value of the '{@link #getTufiltp3() <em>Tufiltp3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTufiltp3()
     * @generated
     * @ordered
     */
    protected static final Double TUFILTP3_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTufiltp3() <em>Tufiltp3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTufiltp3()
     * @generated
     * @ordered
     */
    protected Double tufiltp3 = TUFILTP3_EDEFAULT;

    /**
     * This is true if the Tufiltp3 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tufiltp3ESet;

    /**
     * The default value of the '{@link #getKpp() <em>Kpp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKpp()
     * @generated
     * @ordered
     */
    protected static final Double KPP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKpp() <em>Kpp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKpp()
     * @generated
     * @ordered
     */
    protected Double kpp = KPP_EDEFAULT;

    /**
     * This is true if the Kpp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kppESet;

    /**
     * The default value of the '{@link #getTpfiltp3() <em>Tpfiltp3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTpfiltp3()
     * @generated
     * @ordered
     */
    protected static final Double TPFILTP3_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTpfiltp3() <em>Tpfiltp3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTpfiltp3()
     * @generated
     * @ordered
     */
    protected Double tpfiltp3 = TPFILTP3_EDEFAULT;

    /**
     * This is true if the Tpfiltp3 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tpfiltp3ESet;

    /**
     * The default value of the '{@link #getTdvs() <em>Tdvs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTdvs()
     * @generated
     * @ordered
     */
    protected static final Double TDVS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTdvs() <em>Tdvs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTdvs()
     * @generated
     * @ordered
     */
    protected Double tdvs = TDVS_EDEFAULT;

    /**
     * This is true if the Tdvs attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tdvsESet;

    /**
     * The default value of the '{@link #getUpdip() <em>Updip</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUpdip()
     * @generated
     * @ordered
     */
    protected static final Double UPDIP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUpdip() <em>Updip</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUpdip()
     * @generated
     * @ordered
     */
    protected Double updip = UPDIP_EDEFAULT;

    /**
     * This is true if the Updip attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean updipESet;

    /**
     * The cached value of the '{@link #getWindDynamicsLookupTable() <em>Wind Dynamics Lookup Table</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindDynamicsLookupTable()
     * @generated
     * @ordered
     */
    protected EList< WindDynamicsLookupTable > windDynamicsLookupTable;

    /**
     * The default value of the '{@link #getKip() <em>Kip</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKip()
     * @generated
     * @ordered
     */
    protected static final Double KIP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKip() <em>Kip</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKip()
     * @generated
     * @ordered
     */
    protected Double kip = KIP_EDEFAULT;

    /**
     * This is true if the Kip attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kipESet;

    /**
     * The default value of the '{@link #getThetauscale() <em>Thetauscale</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThetauscale()
     * @generated
     * @ordered
     */
    protected static final Double THETAUSCALE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getThetauscale() <em>Thetauscale</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThetauscale()
     * @generated
     * @ordered
     */
    protected Double thetauscale = THETAUSCALE_EDEFAULT;

    /**
     * This is true if the Thetauscale attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean thetauscaleESet;

    /**
     * The default value of the '{@link #getOmegadtd() <em>Omegadtd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOmegadtd()
     * @generated
     * @ordered
     */
    protected static final Double OMEGADTD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOmegadtd() <em>Omegadtd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOmegadtd()
     * @generated
     * @ordered
     */
    protected Double omegadtd = OMEGADTD_EDEFAULT;

    /**
     * This is true if the Omegadtd attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean omegadtdESet;

    /**
     * The default value of the '{@link #getZeta() <em>Zeta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getZeta()
     * @generated
     * @ordered
     */
    protected static final Double ZETA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getZeta() <em>Zeta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getZeta()
     * @generated
     * @ordered
     */
    protected Double zeta = ZETA_EDEFAULT;

    /**
     * This is true if the Zeta attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean zetaESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected WindContPType3IECImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getWindContPType3IEC();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTpord() {
        return tpord;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTpord( Double newTpord ) {
        Double oldTpord = tpord;
        tpord = newTpord;
        boolean oldTpordESet = tpordESet;
        tpordESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_CONT_PTYPE3_IEC__TPORD, oldTpord,
                    tpord, !oldTpordESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTpord() {
        Double oldTpord = tpord;
        boolean oldTpordESet = tpordESet;
        tpord = TPORD_EDEFAULT;
        tpordESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_PTYPE3_IEC__TPORD, oldTpord,
                    TPORD_EDEFAULT, oldTpordESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTpord() {
        return tpordESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getDpmax() {
        return dpmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDpmax( Double newDpmax ) {
        Double oldDpmax = dpmax;
        dpmax = newDpmax;
        boolean oldDpmaxESet = dpmaxESet;
        dpmaxESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_CONT_PTYPE3_IEC__DPMAX, oldDpmax,
                    dpmax, !oldDpmaxESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDpmax() {
        Double oldDpmax = dpmax;
        boolean oldDpmaxESet = dpmaxESet;
        dpmax = DPMAX_EDEFAULT;
        dpmaxESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_PTYPE3_IEC__DPMAX, oldDpmax,
                    DPMAX_EDEFAULT, oldDpmaxESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDpmax() {
        return dpmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTomegafiltp3() {
        return tomegafiltp3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTomegafiltp3( Double newTomegafiltp3 ) {
        Double oldTomegafiltp3 = tomegafiltp3;
        tomegafiltp3 = newTomegafiltp3;
        boolean oldTomegafiltp3ESet = tomegafiltp3ESet;
        tomegafiltp3ESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_CONT_PTYPE3_IEC__TOMEGAFILTP3,
                    oldTomegafiltp3, tomegafiltp3, !oldTomegafiltp3ESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTomegafiltp3() {
        Double oldTomegafiltp3 = tomegafiltp3;
        boolean oldTomegafiltp3ESet = tomegafiltp3ESet;
        tomegafiltp3 = TOMEGAFILTP3_EDEFAULT;
        tomegafiltp3ESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_PTYPE3_IEC__TOMEGAFILTP3,
                    oldTomegafiltp3, TOMEGAFILTP3_EDEFAULT, oldTomegafiltp3ESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTomegafiltp3() {
        return tomegafiltp3ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getUdvs() {
        return udvs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUdvs( Double newUdvs ) {
        Double oldUdvs = udvs;
        udvs = newUdvs;
        boolean oldUdvsESet = udvsESet;
        udvsESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_CONT_PTYPE3_IEC__UDVS, oldUdvs,
                    udvs, !oldUdvsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUdvs() {
        Double oldUdvs = udvs;
        boolean oldUdvsESet = udvsESet;
        udvs = UDVS_EDEFAULT;
        udvsESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_PTYPE3_IEC__UDVS, oldUdvs,
                    UDVS_EDEFAULT, oldUdvsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUdvs() {
        return udvsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getOmegaoffset() {
        return omegaoffset;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOmegaoffset( Double newOmegaoffset ) {
        Double oldOmegaoffset = omegaoffset;
        omegaoffset = newOmegaoffset;
        boolean oldOmegaoffsetESet = omegaoffsetESet;
        omegaoffsetESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_CONT_PTYPE3_IEC__OMEGAOFFSET,
                    oldOmegaoffset, omegaoffset, !oldOmegaoffsetESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOmegaoffset() {
        Double oldOmegaoffset = omegaoffset;
        boolean oldOmegaoffsetESet = omegaoffsetESet;
        omegaoffset = OMEGAOFFSET_EDEFAULT;
        omegaoffsetESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_PTYPE3_IEC__OMEGAOFFSET,
                    oldOmegaoffset, OMEGAOFFSET_EDEFAULT, oldOmegaoffsetESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOmegaoffset() {
        return omegaoffsetESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getDprefmax() {
        return dprefmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDprefmax( Double newDprefmax ) {
        Double oldDprefmax = dprefmax;
        dprefmax = newDprefmax;
        boolean oldDprefmaxESet = dprefmaxESet;
        dprefmaxESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_CONT_PTYPE3_IEC__DPREFMAX,
                    oldDprefmax, dprefmax, !oldDprefmaxESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDprefmax() {
        Double oldDprefmax = dprefmax;
        boolean oldDprefmaxESet = dprefmaxESet;
        dprefmax = DPREFMAX_EDEFAULT;
        dprefmaxESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_PTYPE3_IEC__DPREFMAX,
                    oldDprefmax, DPREFMAX_EDEFAULT, oldDprefmaxESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDprefmax() {
        return dprefmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getDprefmin() {
        return dprefmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDprefmin( Double newDprefmin ) {
        Double oldDprefmin = dprefmin;
        dprefmin = newDprefmin;
        boolean oldDprefminESet = dprefminESet;
        dprefminESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_CONT_PTYPE3_IEC__DPREFMIN,
                    oldDprefmin, dprefmin, !oldDprefminESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDprefmin() {
        Double oldDprefmin = dprefmin;
        boolean oldDprefminESet = dprefminESet;
        dprefmin = DPREFMIN_EDEFAULT;
        dprefminESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_PTYPE3_IEC__DPREFMIN,
                    oldDprefmin, DPREFMIN_EDEFAULT, oldDprefminESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDprefmin() {
        return dprefminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getPdtdmax() {
        return pdtdmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPdtdmax( Double newPdtdmax ) {
        Double oldPdtdmax = pdtdmax;
        pdtdmax = newPdtdmax;
        boolean oldPdtdmaxESet = pdtdmaxESet;
        pdtdmaxESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_CONT_PTYPE3_IEC__PDTDMAX,
                    oldPdtdmax, pdtdmax, !oldPdtdmaxESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPdtdmax() {
        Double oldPdtdmax = pdtdmax;
        boolean oldPdtdmaxESet = pdtdmaxESet;
        pdtdmax = PDTDMAX_EDEFAULT;
        pdtdmaxESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_PTYPE3_IEC__PDTDMAX,
                    oldPdtdmax, PDTDMAX_EDEFAULT, oldPdtdmaxESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPdtdmax() {
        return pdtdmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getThetaemin() {
        return thetaemin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setThetaemin( Double newThetaemin ) {
        Double oldThetaemin = thetaemin;
        thetaemin = newThetaemin;
        boolean oldThetaeminESet = thetaeminESet;
        thetaeminESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_CONT_PTYPE3_IEC__THETAEMIN,
                    oldThetaemin, thetaemin, !oldThetaeminESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetThetaemin() {
        Double oldThetaemin = thetaemin;
        boolean oldThetaeminESet = thetaeminESet;
        thetaemin = THETAEMIN_EDEFAULT;
        thetaeminESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_PTYPE3_IEC__THETAEMIN,
                    oldThetaemin, THETAEMIN_EDEFAULT, oldThetaeminESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetThetaemin() {
        return thetaeminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getMpuvrt() {
        return mpuvrt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMpuvrt( Boolean newMpuvrt ) {
        Boolean oldMpuvrt = mpuvrt;
        mpuvrt = newMpuvrt;
        boolean oldMpuvrtESet = mpuvrtESet;
        mpuvrtESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_CONT_PTYPE3_IEC__MPUVRT, oldMpuvrt,
                    mpuvrt, !oldMpuvrtESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMpuvrt() {
        Boolean oldMpuvrt = mpuvrt;
        boolean oldMpuvrtESet = mpuvrtESet;
        mpuvrt = MPUVRT_EDEFAULT;
        mpuvrtESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_PTYPE3_IEC__MPUVRT,
                    oldMpuvrt, MPUVRT_EDEFAULT, oldMpuvrtESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMpuvrt() {
        return mpuvrtESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindTurbineType3IEC getWindTurbineType3IEC() {
        if( windTurbineType3IEC != null && windTurbineType3IEC.eIsProxy() ) {
            InternalEObject oldWindTurbineType3IEC = ( InternalEObject ) windTurbineType3IEC;
            windTurbineType3IEC = ( WindTurbineType3IEC ) eResolveProxy( oldWindTurbineType3IEC );
            if( windTurbineType3IEC != oldWindTurbineType3IEC ) {
                if( eNotificationRequired() ) {
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                            CimPackage.WIND_CONT_PTYPE3_IEC__WIND_TURBINE_TYPE3_IEC, oldWindTurbineType3IEC,
                            windTurbineType3IEC ) );
                }
            }
        }
        return windTurbineType3IEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public WindTurbineType3IEC basicGetWindTurbineType3IEC() {
        return windTurbineType3IEC;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindTurbineType3IEC( WindTurbineType3IEC newWindTurbineType3IEC,
            NotificationChain msgs ) {
        WindTurbineType3IEC oldWindTurbineType3IEC = windTurbineType3IEC;
        windTurbineType3IEC = newWindTurbineType3IEC;
        boolean oldWindTurbineType3IECESet = windTurbineType3IECESet;
        windTurbineType3IECESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.WIND_CONT_PTYPE3_IEC__WIND_TURBINE_TYPE3_IEC, oldWindTurbineType3IEC,
                    newWindTurbineType3IEC, !oldWindTurbineType3IECESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setWindTurbineType3IEC( WindTurbineType3IEC newWindTurbineType3IEC ) {
        if( newWindTurbineType3IEC != windTurbineType3IEC ) {
            NotificationChain msgs = null;
            if( windTurbineType3IEC != null ) {
                msgs = ( ( InternalEObject ) windTurbineType3IEC ).eInverseRemove( this,
                        CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_CONT_PTYPE3_IEC, WindTurbineType3IEC.class, msgs );
            }
            if( newWindTurbineType3IEC != null ) {
                msgs = ( ( InternalEObject ) newWindTurbineType3IEC ).eInverseAdd( this,
                        CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_CONT_PTYPE3_IEC, WindTurbineType3IEC.class, msgs );
            }
            msgs = basicSetWindTurbineType3IEC( newWindTurbineType3IEC, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldWindTurbineType3IECESet = windTurbineType3IECESet;
            windTurbineType3IECESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET,
                        CimPackage.WIND_CONT_PTYPE3_IEC__WIND_TURBINE_TYPE3_IEC, newWindTurbineType3IEC,
                        newWindTurbineType3IEC, !oldWindTurbineType3IECESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindTurbineType3IEC( NotificationChain msgs ) {
        WindTurbineType3IEC oldWindTurbineType3IEC = windTurbineType3IEC;
        windTurbineType3IEC = null;
        boolean oldWindTurbineType3IECESet = windTurbineType3IECESet;
        windTurbineType3IECESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.WIND_CONT_PTYPE3_IEC__WIND_TURBINE_TYPE3_IEC, oldWindTurbineType3IEC, null,
                    oldWindTurbineType3IECESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWindTurbineType3IEC() {
        if( windTurbineType3IEC != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windTurbineType3IEC ).eInverseRemove( this,
                    CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_CONT_PTYPE3_IEC, WindTurbineType3IEC.class, msgs );
            msgs = basicUnsetWindTurbineType3IEC( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldWindTurbineType3IECESet = windTurbineType3IECESet;
            windTurbineType3IECESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.WIND_CONT_PTYPE3_IEC__WIND_TURBINE_TYPE3_IEC, null, null,
                        oldWindTurbineType3IECESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindTurbineType3IEC() {
        return windTurbineType3IECESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTomegaref() {
        return tomegaref;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTomegaref( Double newTomegaref ) {
        Double oldTomegaref = tomegaref;
        tomegaref = newTomegaref;
        boolean oldTomegarefESet = tomegarefESet;
        tomegarefESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_CONT_PTYPE3_IEC__TOMEGAREF,
                    oldTomegaref, tomegaref, !oldTomegarefESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTomegaref() {
        Double oldTomegaref = tomegaref;
        boolean oldTomegarefESet = tomegarefESet;
        tomegaref = TOMEGAREF_EDEFAULT;
        tomegarefESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_PTYPE3_IEC__TOMEGAREF,
                    oldTomegaref, TOMEGAREF_EDEFAULT, oldTomegarefESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTomegaref() {
        return tomegarefESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getDthetamaxuvrt() {
        return dthetamaxuvrt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDthetamaxuvrt( Double newDthetamaxuvrt ) {
        Double oldDthetamaxuvrt = dthetamaxuvrt;
        dthetamaxuvrt = newDthetamaxuvrt;
        boolean oldDthetamaxuvrtESet = dthetamaxuvrtESet;
        dthetamaxuvrtESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_CONT_PTYPE3_IEC__DTHETAMAXUVRT,
                    oldDthetamaxuvrt, dthetamaxuvrt, !oldDthetamaxuvrtESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDthetamaxuvrt() {
        Double oldDthetamaxuvrt = dthetamaxuvrt;
        boolean oldDthetamaxuvrtESet = dthetamaxuvrtESet;
        dthetamaxuvrt = DTHETAMAXUVRT_EDEFAULT;
        dthetamaxuvrtESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_PTYPE3_IEC__DTHETAMAXUVRT,
                    oldDthetamaxuvrt, DTHETAMAXUVRT_EDEFAULT, oldDthetamaxuvrtESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDthetamaxuvrt() {
        return dthetamaxuvrtESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getDthetamax() {
        return dthetamax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDthetamax( Double newDthetamax ) {
        Double oldDthetamax = dthetamax;
        dthetamax = newDthetamax;
        boolean oldDthetamaxESet = dthetamaxESet;
        dthetamaxESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_CONT_PTYPE3_IEC__DTHETAMAX,
                    oldDthetamax, dthetamax, !oldDthetamaxESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDthetamax() {
        Double oldDthetamax = dthetamax;
        boolean oldDthetamaxESet = dthetamaxESet;
        dthetamax = DTHETAMAX_EDEFAULT;
        dthetamaxESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_PTYPE3_IEC__DTHETAMAX,
                    oldDthetamax, DTHETAMAX_EDEFAULT, oldDthetamaxESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDthetamax() {
        return dthetamaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKdtd() {
        return kdtd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKdtd( Double newKdtd ) {
        Double oldKdtd = kdtd;
        kdtd = newKdtd;
        boolean oldKdtdESet = kdtdESet;
        kdtdESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_CONT_PTYPE3_IEC__KDTD, oldKdtd,
                    kdtd, !oldKdtdESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKdtd() {
        Double oldKdtd = kdtd;
        boolean oldKdtdESet = kdtdESet;
        kdtd = KDTD_EDEFAULT;
        kdtdESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_PTYPE3_IEC__KDTD, oldKdtd,
                    KDTD_EDEFAULT, oldKdtdESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKdtd() {
        return kdtdESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTufiltp3() {
        return tufiltp3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTufiltp3( Double newTufiltp3 ) {
        Double oldTufiltp3 = tufiltp3;
        tufiltp3 = newTufiltp3;
        boolean oldTufiltp3ESet = tufiltp3ESet;
        tufiltp3ESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_CONT_PTYPE3_IEC__TUFILTP3,
                    oldTufiltp3, tufiltp3, !oldTufiltp3ESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTufiltp3() {
        Double oldTufiltp3 = tufiltp3;
        boolean oldTufiltp3ESet = tufiltp3ESet;
        tufiltp3 = TUFILTP3_EDEFAULT;
        tufiltp3ESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_PTYPE3_IEC__TUFILTP3,
                    oldTufiltp3, TUFILTP3_EDEFAULT, oldTufiltp3ESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTufiltp3() {
        return tufiltp3ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKpp() {
        return kpp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKpp( Double newKpp ) {
        Double oldKpp = kpp;
        kpp = newKpp;
        boolean oldKppESet = kppESet;
        kppESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_CONT_PTYPE3_IEC__KPP, oldKpp, kpp,
                    !oldKppESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKpp() {
        Double oldKpp = kpp;
        boolean oldKppESet = kppESet;
        kpp = KPP_EDEFAULT;
        kppESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_PTYPE3_IEC__KPP, oldKpp,
                    KPP_EDEFAULT, oldKppESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKpp() {
        return kppESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTpfiltp3() {
        return tpfiltp3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTpfiltp3( Double newTpfiltp3 ) {
        Double oldTpfiltp3 = tpfiltp3;
        tpfiltp3 = newTpfiltp3;
        boolean oldTpfiltp3ESet = tpfiltp3ESet;
        tpfiltp3ESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_CONT_PTYPE3_IEC__TPFILTP3,
                    oldTpfiltp3, tpfiltp3, !oldTpfiltp3ESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTpfiltp3() {
        Double oldTpfiltp3 = tpfiltp3;
        boolean oldTpfiltp3ESet = tpfiltp3ESet;
        tpfiltp3 = TPFILTP3_EDEFAULT;
        tpfiltp3ESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_PTYPE3_IEC__TPFILTP3,
                    oldTpfiltp3, TPFILTP3_EDEFAULT, oldTpfiltp3ESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTpfiltp3() {
        return tpfiltp3ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTdvs() {
        return tdvs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTdvs( Double newTdvs ) {
        Double oldTdvs = tdvs;
        tdvs = newTdvs;
        boolean oldTdvsESet = tdvsESet;
        tdvsESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_CONT_PTYPE3_IEC__TDVS, oldTdvs,
                    tdvs, !oldTdvsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTdvs() {
        Double oldTdvs = tdvs;
        boolean oldTdvsESet = tdvsESet;
        tdvs = TDVS_EDEFAULT;
        tdvsESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_PTYPE3_IEC__TDVS, oldTdvs,
                    TDVS_EDEFAULT, oldTdvsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTdvs() {
        return tdvsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getUpdip() {
        return updip;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUpdip( Double newUpdip ) {
        Double oldUpdip = updip;
        updip = newUpdip;
        boolean oldUpdipESet = updipESet;
        updipESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_CONT_PTYPE3_IEC__UPDIP, oldUpdip,
                    updip, !oldUpdipESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUpdip() {
        Double oldUpdip = updip;
        boolean oldUpdipESet = updipESet;
        updip = UPDIP_EDEFAULT;
        updipESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_PTYPE3_IEC__UPDIP, oldUpdip,
                    UPDIP_EDEFAULT, oldUpdipESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUpdip() {
        return updipESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< WindDynamicsLookupTable > getWindDynamicsLookupTable() {
        if( windDynamicsLookupTable == null ) {
            windDynamicsLookupTable = new EObjectWithInverseResolvingEList.Unsettable< >(
                    WindDynamicsLookupTable.class, this, CimPackage.WIND_CONT_PTYPE3_IEC__WIND_DYNAMICS_LOOKUP_TABLE,
                    CimPackage.WIND_DYNAMICS_LOOKUP_TABLE__WIND_CONT_PTYPE3_IEC );
        }
        return windDynamicsLookupTable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWindDynamicsLookupTable() {
        if( windDynamicsLookupTable != null ) {
            ( ( InternalEList.Unsettable< ? > ) windDynamicsLookupTable ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindDynamicsLookupTable() {
        return windDynamicsLookupTable != null && ( ( InternalEList.Unsettable< ? > ) windDynamicsLookupTable ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKip() {
        return kip;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKip( Double newKip ) {
        Double oldKip = kip;
        kip = newKip;
        boolean oldKipESet = kipESet;
        kipESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_CONT_PTYPE3_IEC__KIP, oldKip, kip,
                    !oldKipESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKip() {
        Double oldKip = kip;
        boolean oldKipESet = kipESet;
        kip = KIP_EDEFAULT;
        kipESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_PTYPE3_IEC__KIP, oldKip,
                    KIP_EDEFAULT, oldKipESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKip() {
        return kipESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getThetauscale() {
        return thetauscale;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setThetauscale( Double newThetauscale ) {
        Double oldThetauscale = thetauscale;
        thetauscale = newThetauscale;
        boolean oldThetauscaleESet = thetauscaleESet;
        thetauscaleESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_CONT_PTYPE3_IEC__THETAUSCALE,
                    oldThetauscale, thetauscale, !oldThetauscaleESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetThetauscale() {
        Double oldThetauscale = thetauscale;
        boolean oldThetauscaleESet = thetauscaleESet;
        thetauscale = THETAUSCALE_EDEFAULT;
        thetauscaleESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_PTYPE3_IEC__THETAUSCALE,
                    oldThetauscale, THETAUSCALE_EDEFAULT, oldThetauscaleESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetThetauscale() {
        return thetauscaleESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getOmegadtd() {
        return omegadtd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOmegadtd( Double newOmegadtd ) {
        Double oldOmegadtd = omegadtd;
        omegadtd = newOmegadtd;
        boolean oldOmegadtdESet = omegadtdESet;
        omegadtdESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_CONT_PTYPE3_IEC__OMEGADTD,
                    oldOmegadtd, omegadtd, !oldOmegadtdESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOmegadtd() {
        Double oldOmegadtd = omegadtd;
        boolean oldOmegadtdESet = omegadtdESet;
        omegadtd = OMEGADTD_EDEFAULT;
        omegadtdESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_PTYPE3_IEC__OMEGADTD,
                    oldOmegadtd, OMEGADTD_EDEFAULT, oldOmegadtdESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOmegadtd() {
        return omegadtdESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getZeta() {
        return zeta;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setZeta( Double newZeta ) {
        Double oldZeta = zeta;
        zeta = newZeta;
        boolean oldZetaESet = zetaESet;
        zetaESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.WIND_CONT_PTYPE3_IEC__ZETA, oldZeta,
                    zeta, !oldZetaESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetZeta() {
        Double oldZeta = zeta;
        boolean oldZetaESet = zetaESet;
        zeta = ZETA_EDEFAULT;
        zetaESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.WIND_CONT_PTYPE3_IEC__ZETA, oldZeta,
                    ZETA_EDEFAULT, oldZetaESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetZeta() {
        return zetaESet;
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
        case CimPackage.WIND_CONT_PTYPE3_IEC__WIND_TURBINE_TYPE3_IEC:
            if( windTurbineType3IEC != null ) {
                msgs = ( ( InternalEObject ) windTurbineType3IEC ).eInverseRemove( this,
                        CimPackage.WIND_TURBINE_TYPE3_IEC__WIND_CONT_PTYPE3_IEC, WindTurbineType3IEC.class, msgs );
            }
            return basicSetWindTurbineType3IEC( ( WindTurbineType3IEC ) otherEnd, msgs );
        case CimPackage.WIND_CONT_PTYPE3_IEC__WIND_DYNAMICS_LOOKUP_TABLE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getWindDynamicsLookupTable() )
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
        case CimPackage.WIND_CONT_PTYPE3_IEC__WIND_TURBINE_TYPE3_IEC:
            return basicUnsetWindTurbineType3IEC( msgs );
        case CimPackage.WIND_CONT_PTYPE3_IEC__WIND_DYNAMICS_LOOKUP_TABLE:
            return ( ( InternalEList< ? > ) getWindDynamicsLookupTable() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.WIND_CONT_PTYPE3_IEC__TPORD:
            return getTpord();
        case CimPackage.WIND_CONT_PTYPE3_IEC__DPMAX:
            return getDpmax();
        case CimPackage.WIND_CONT_PTYPE3_IEC__TOMEGAFILTP3:
            return getTomegafiltp3();
        case CimPackage.WIND_CONT_PTYPE3_IEC__UDVS:
            return getUdvs();
        case CimPackage.WIND_CONT_PTYPE3_IEC__OMEGAOFFSET:
            return getOmegaoffset();
        case CimPackage.WIND_CONT_PTYPE3_IEC__DPREFMAX:
            return getDprefmax();
        case CimPackage.WIND_CONT_PTYPE3_IEC__DPREFMIN:
            return getDprefmin();
        case CimPackage.WIND_CONT_PTYPE3_IEC__PDTDMAX:
            return getPdtdmax();
        case CimPackage.WIND_CONT_PTYPE3_IEC__THETAEMIN:
            return getThetaemin();
        case CimPackage.WIND_CONT_PTYPE3_IEC__MPUVRT:
            return getMpuvrt();
        case CimPackage.WIND_CONT_PTYPE3_IEC__WIND_TURBINE_TYPE3_IEC:
            if( resolve ) {
                return getWindTurbineType3IEC();
            }
            return basicGetWindTurbineType3IEC();
        case CimPackage.WIND_CONT_PTYPE3_IEC__TOMEGAREF:
            return getTomegaref();
        case CimPackage.WIND_CONT_PTYPE3_IEC__DTHETAMAXUVRT:
            return getDthetamaxuvrt();
        case CimPackage.WIND_CONT_PTYPE3_IEC__DTHETAMAX:
            return getDthetamax();
        case CimPackage.WIND_CONT_PTYPE3_IEC__KDTD:
            return getKdtd();
        case CimPackage.WIND_CONT_PTYPE3_IEC__TUFILTP3:
            return getTufiltp3();
        case CimPackage.WIND_CONT_PTYPE3_IEC__KPP:
            return getKpp();
        case CimPackage.WIND_CONT_PTYPE3_IEC__TPFILTP3:
            return getTpfiltp3();
        case CimPackage.WIND_CONT_PTYPE3_IEC__TDVS:
            return getTdvs();
        case CimPackage.WIND_CONT_PTYPE3_IEC__UPDIP:
            return getUpdip();
        case CimPackage.WIND_CONT_PTYPE3_IEC__WIND_DYNAMICS_LOOKUP_TABLE:
            return getWindDynamicsLookupTable();
        case CimPackage.WIND_CONT_PTYPE3_IEC__KIP:
            return getKip();
        case CimPackage.WIND_CONT_PTYPE3_IEC__THETAUSCALE:
            return getThetauscale();
        case CimPackage.WIND_CONT_PTYPE3_IEC__OMEGADTD:
            return getOmegadtd();
        case CimPackage.WIND_CONT_PTYPE3_IEC__ZETA:
            return getZeta();
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
        case CimPackage.WIND_CONT_PTYPE3_IEC__TPORD:
            setTpord( ( Double ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__DPMAX:
            setDpmax( ( Double ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__TOMEGAFILTP3:
            setTomegafiltp3( ( Double ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__UDVS:
            setUdvs( ( Double ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__OMEGAOFFSET:
            setOmegaoffset( ( Double ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__DPREFMAX:
            setDprefmax( ( Double ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__DPREFMIN:
            setDprefmin( ( Double ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__PDTDMAX:
            setPdtdmax( ( Double ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__THETAEMIN:
            setThetaemin( ( Double ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__MPUVRT:
            setMpuvrt( ( Boolean ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__WIND_TURBINE_TYPE3_IEC:
            setWindTurbineType3IEC( ( WindTurbineType3IEC ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__TOMEGAREF:
            setTomegaref( ( Double ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__DTHETAMAXUVRT:
            setDthetamaxuvrt( ( Double ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__DTHETAMAX:
            setDthetamax( ( Double ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__KDTD:
            setKdtd( ( Double ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__TUFILTP3:
            setTufiltp3( ( Double ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__KPP:
            setKpp( ( Double ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__TPFILTP3:
            setTpfiltp3( ( Double ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__TDVS:
            setTdvs( ( Double ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__UPDIP:
            setUpdip( ( Double ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__WIND_DYNAMICS_LOOKUP_TABLE:
            getWindDynamicsLookupTable().clear();
            getWindDynamicsLookupTable().addAll( ( Collection< ? extends WindDynamicsLookupTable > ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__KIP:
            setKip( ( Double ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__THETAUSCALE:
            setThetauscale( ( Double ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__OMEGADTD:
            setOmegadtd( ( Double ) newValue );
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__ZETA:
            setZeta( ( Double ) newValue );
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
        case CimPackage.WIND_CONT_PTYPE3_IEC__TPORD:
            unsetTpord();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__DPMAX:
            unsetDpmax();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__TOMEGAFILTP3:
            unsetTomegafiltp3();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__UDVS:
            unsetUdvs();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__OMEGAOFFSET:
            unsetOmegaoffset();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__DPREFMAX:
            unsetDprefmax();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__DPREFMIN:
            unsetDprefmin();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__PDTDMAX:
            unsetPdtdmax();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__THETAEMIN:
            unsetThetaemin();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__MPUVRT:
            unsetMpuvrt();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__WIND_TURBINE_TYPE3_IEC:
            unsetWindTurbineType3IEC();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__TOMEGAREF:
            unsetTomegaref();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__DTHETAMAXUVRT:
            unsetDthetamaxuvrt();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__DTHETAMAX:
            unsetDthetamax();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__KDTD:
            unsetKdtd();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__TUFILTP3:
            unsetTufiltp3();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__KPP:
            unsetKpp();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__TPFILTP3:
            unsetTpfiltp3();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__TDVS:
            unsetTdvs();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__UPDIP:
            unsetUpdip();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__WIND_DYNAMICS_LOOKUP_TABLE:
            unsetWindDynamicsLookupTable();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__KIP:
            unsetKip();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__THETAUSCALE:
            unsetThetauscale();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__OMEGADTD:
            unsetOmegadtd();
            return;
        case CimPackage.WIND_CONT_PTYPE3_IEC__ZETA:
            unsetZeta();
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
        case CimPackage.WIND_CONT_PTYPE3_IEC__TPORD:
            return isSetTpord();
        case CimPackage.WIND_CONT_PTYPE3_IEC__DPMAX:
            return isSetDpmax();
        case CimPackage.WIND_CONT_PTYPE3_IEC__TOMEGAFILTP3:
            return isSetTomegafiltp3();
        case CimPackage.WIND_CONT_PTYPE3_IEC__UDVS:
            return isSetUdvs();
        case CimPackage.WIND_CONT_PTYPE3_IEC__OMEGAOFFSET:
            return isSetOmegaoffset();
        case CimPackage.WIND_CONT_PTYPE3_IEC__DPREFMAX:
            return isSetDprefmax();
        case CimPackage.WIND_CONT_PTYPE3_IEC__DPREFMIN:
            return isSetDprefmin();
        case CimPackage.WIND_CONT_PTYPE3_IEC__PDTDMAX:
            return isSetPdtdmax();
        case CimPackage.WIND_CONT_PTYPE3_IEC__THETAEMIN:
            return isSetThetaemin();
        case CimPackage.WIND_CONT_PTYPE3_IEC__MPUVRT:
            return isSetMpuvrt();
        case CimPackage.WIND_CONT_PTYPE3_IEC__WIND_TURBINE_TYPE3_IEC:
            return isSetWindTurbineType3IEC();
        case CimPackage.WIND_CONT_PTYPE3_IEC__TOMEGAREF:
            return isSetTomegaref();
        case CimPackage.WIND_CONT_PTYPE3_IEC__DTHETAMAXUVRT:
            return isSetDthetamaxuvrt();
        case CimPackage.WIND_CONT_PTYPE3_IEC__DTHETAMAX:
            return isSetDthetamax();
        case CimPackage.WIND_CONT_PTYPE3_IEC__KDTD:
            return isSetKdtd();
        case CimPackage.WIND_CONT_PTYPE3_IEC__TUFILTP3:
            return isSetTufiltp3();
        case CimPackage.WIND_CONT_PTYPE3_IEC__KPP:
            return isSetKpp();
        case CimPackage.WIND_CONT_PTYPE3_IEC__TPFILTP3:
            return isSetTpfiltp3();
        case CimPackage.WIND_CONT_PTYPE3_IEC__TDVS:
            return isSetTdvs();
        case CimPackage.WIND_CONT_PTYPE3_IEC__UPDIP:
            return isSetUpdip();
        case CimPackage.WIND_CONT_PTYPE3_IEC__WIND_DYNAMICS_LOOKUP_TABLE:
            return isSetWindDynamicsLookupTable();
        case CimPackage.WIND_CONT_PTYPE3_IEC__KIP:
            return isSetKip();
        case CimPackage.WIND_CONT_PTYPE3_IEC__THETAUSCALE:
            return isSetThetauscale();
        case CimPackage.WIND_CONT_PTYPE3_IEC__OMEGADTD:
            return isSetOmegadtd();
        case CimPackage.WIND_CONT_PTYPE3_IEC__ZETA:
            return isSetZeta();
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
        result.append( " (tpord: " );
        if( tpordESet ) {
            result.append( tpord );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", dpmax: " );
        if( dpmaxESet ) {
            result.append( dpmax );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", tomegafiltp3: " );
        if( tomegafiltp3ESet ) {
            result.append( tomegafiltp3 );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", udvs: " );
        if( udvsESet ) {
            result.append( udvs );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", omegaoffset: " );
        if( omegaoffsetESet ) {
            result.append( omegaoffset );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", dprefmax: " );
        if( dprefmaxESet ) {
            result.append( dprefmax );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", dprefmin: " );
        if( dprefminESet ) {
            result.append( dprefmin );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", pdtdmax: " );
        if( pdtdmaxESet ) {
            result.append( pdtdmax );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", thetaemin: " );
        if( thetaeminESet ) {
            result.append( thetaemin );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", mpuvrt: " );
        if( mpuvrtESet ) {
            result.append( mpuvrt );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", tomegaref: " );
        if( tomegarefESet ) {
            result.append( tomegaref );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", dthetamaxuvrt: " );
        if( dthetamaxuvrtESet ) {
            result.append( dthetamaxuvrt );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", dthetamax: " );
        if( dthetamaxESet ) {
            result.append( dthetamax );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", kdtd: " );
        if( kdtdESet ) {
            result.append( kdtd );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", tufiltp3: " );
        if( tufiltp3ESet ) {
            result.append( tufiltp3 );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", kpp: " );
        if( kppESet ) {
            result.append( kpp );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", tpfiltp3: " );
        if( tpfiltp3ESet ) {
            result.append( tpfiltp3 );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", tdvs: " );
        if( tdvsESet ) {
            result.append( tdvs );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", updip: " );
        if( updipESet ) {
            result.append( updip );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", kip: " );
        if( kipESet ) {
            result.append( kip );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", thetauscale: " );
        if( thetauscaleESet ) {
            result.append( thetauscale );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", omegadtd: " );
        if( omegadtdESet ) {
            result.append( omegadtd );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", zeta: " );
        if( zetaESet ) {
            result.append( zeta );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ')' );
        return result.toString();
    }

} //WindContPType3IECImpl

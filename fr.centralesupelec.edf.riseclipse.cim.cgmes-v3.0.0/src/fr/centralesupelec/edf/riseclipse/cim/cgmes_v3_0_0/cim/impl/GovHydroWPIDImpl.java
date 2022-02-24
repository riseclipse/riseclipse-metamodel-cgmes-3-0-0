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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gov Hydro WPID</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovHydroWPIDImpl#getD <em>D</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovHydroWPIDImpl#getKd <em>Kd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovHydroWPIDImpl#getKi <em>Ki</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovHydroWPIDImpl#getKp <em>Kp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovHydroWPIDImpl#getTa <em>Ta</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovHydroWPIDImpl#getTb <em>Tb</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovHydroWPIDImpl#getTw <em>Tw</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovHydroWPIDImpl#getGatmin <em>Gatmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovHydroWPIDImpl#getGatmax <em>Gatmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovHydroWPIDImpl#getReg <em>Reg</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovHydroWPIDImpl#getPmin <em>Pmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovHydroWPIDImpl#getGv3 <em>Gv3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovHydroWPIDImpl#getGv2 <em>Gv2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovHydroWPIDImpl#getGv1 <em>Gv1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovHydroWPIDImpl#getVelmin <em>Velmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovHydroWPIDImpl#getVelmax <em>Velmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovHydroWPIDImpl#getPmax <em>Pmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovHydroWPIDImpl#getPgv3 <em>Pgv3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovHydroWPIDImpl#getPgv1 <em>Pgv1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovHydroWPIDImpl#getPgv2 <em>Pgv2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovHydroWPIDImpl#getMwbase <em>Mwbase</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovHydroWPIDImpl#getTreg <em>Treg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GovHydroWPIDImpl extends TurbineGovernorDynamicsImpl implements GovHydroWPID {
    /**
     * The default value of the '{@link #getD() <em>D</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getD()
     * @generated
     * @ordered
     */
    protected static final Double D_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getD() <em>D</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getD()
     * @generated
     * @ordered
     */
    protected Double d = D_EDEFAULT;

    /**
     * This is true if the D attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dESet;

    /**
     * The default value of the '{@link #getKd() <em>Kd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKd()
     * @generated
     * @ordered
     */
    protected static final Double KD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKd() <em>Kd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKd()
     * @generated
     * @ordered
     */
    protected Double kd = KD_EDEFAULT;

    /**
     * This is true if the Kd attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kdESet;

    /**
     * The default value of the '{@link #getKi() <em>Ki</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKi()
     * @generated
     * @ordered
     */
    protected static final Double KI_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKi() <em>Ki</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKi()
     * @generated
     * @ordered
     */
    protected Double ki = KI_EDEFAULT;

    /**
     * This is true if the Ki attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kiESet;

    /**
     * The default value of the '{@link #getKp() <em>Kp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKp()
     * @generated
     * @ordered
     */
    protected static final Double KP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKp() <em>Kp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKp()
     * @generated
     * @ordered
     */
    protected Double kp = KP_EDEFAULT;

    /**
     * This is true if the Kp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kpESet;

    /**
     * The default value of the '{@link #getTa() <em>Ta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTa()
     * @generated
     * @ordered
     */
    protected static final Double TA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTa() <em>Ta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTa()
     * @generated
     * @ordered
     */
    protected Double ta = TA_EDEFAULT;

    /**
     * This is true if the Ta attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean taESet;

    /**
     * The default value of the '{@link #getTb() <em>Tb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTb()
     * @generated
     * @ordered
     */
    protected static final Double TB_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTb() <em>Tb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTb()
     * @generated
     * @ordered
     */
    protected Double tb = TB_EDEFAULT;

    /**
     * This is true if the Tb attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tbESet;

    /**
     * The default value of the '{@link #getTw() <em>Tw</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTw()
     * @generated
     * @ordered
     */
    protected static final Double TW_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTw() <em>Tw</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTw()
     * @generated
     * @ordered
     */
    protected Double tw = TW_EDEFAULT;

    /**
     * This is true if the Tw attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean twESet;

    /**
     * The default value of the '{@link #getGatmin() <em>Gatmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGatmin()
     * @generated
     * @ordered
     */
    protected static final Double GATMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGatmin() <em>Gatmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGatmin()
     * @generated
     * @ordered
     */
    protected Double gatmin = GATMIN_EDEFAULT;

    /**
     * This is true if the Gatmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean gatminESet;

    /**
     * The default value of the '{@link #getGatmax() <em>Gatmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGatmax()
     * @generated
     * @ordered
     */
    protected static final Double GATMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGatmax() <em>Gatmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGatmax()
     * @generated
     * @ordered
     */
    protected Double gatmax = GATMAX_EDEFAULT;

    /**
     * This is true if the Gatmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean gatmaxESet;

    /**
     * The default value of the '{@link #getReg() <em>Reg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReg()
     * @generated
     * @ordered
     */
    protected static final Double REG_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getReg() <em>Reg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReg()
     * @generated
     * @ordered
     */
    protected Double reg = REG_EDEFAULT;

    /**
     * This is true if the Reg attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean regESet;

    /**
     * The default value of the '{@link #getPmin() <em>Pmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPmin()
     * @generated
     * @ordered
     */
    protected static final Double PMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPmin() <em>Pmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPmin()
     * @generated
     * @ordered
     */
    protected Double pmin = PMIN_EDEFAULT;

    /**
     * This is true if the Pmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pminESet;

    /**
     * The default value of the '{@link #getGv3() <em>Gv3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGv3()
     * @generated
     * @ordered
     */
    protected static final Double GV3_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGv3() <em>Gv3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGv3()
     * @generated
     * @ordered
     */
    protected Double gv3 = GV3_EDEFAULT;

    /**
     * This is true if the Gv3 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean gv3ESet;

    /**
     * The default value of the '{@link #getGv2() <em>Gv2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGv2()
     * @generated
     * @ordered
     */
    protected static final Double GV2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGv2() <em>Gv2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGv2()
     * @generated
     * @ordered
     */
    protected Double gv2 = GV2_EDEFAULT;

    /**
     * This is true if the Gv2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean gv2ESet;

    /**
     * The default value of the '{@link #getGv1() <em>Gv1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGv1()
     * @generated
     * @ordered
     */
    protected static final Double GV1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGv1() <em>Gv1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGv1()
     * @generated
     * @ordered
     */
    protected Double gv1 = GV1_EDEFAULT;

    /**
     * This is true if the Gv1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean gv1ESet;

    /**
     * The default value of the '{@link #getVelmin() <em>Velmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVelmin()
     * @generated
     * @ordered
     */
    protected static final Double VELMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVelmin() <em>Velmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVelmin()
     * @generated
     * @ordered
     */
    protected Double velmin = VELMIN_EDEFAULT;

    /**
     * This is true if the Velmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean velminESet;

    /**
     * The default value of the '{@link #getVelmax() <em>Velmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVelmax()
     * @generated
     * @ordered
     */
    protected static final Double VELMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVelmax() <em>Velmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVelmax()
     * @generated
     * @ordered
     */
    protected Double velmax = VELMAX_EDEFAULT;

    /**
     * This is true if the Velmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean velmaxESet;

    /**
     * The default value of the '{@link #getPmax() <em>Pmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPmax()
     * @generated
     * @ordered
     */
    protected static final Double PMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPmax() <em>Pmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPmax()
     * @generated
     * @ordered
     */
    protected Double pmax = PMAX_EDEFAULT;

    /**
     * This is true if the Pmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pmaxESet;

    /**
     * The default value of the '{@link #getPgv3() <em>Pgv3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPgv3()
     * @generated
     * @ordered
     */
    protected static final Double PGV3_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPgv3() <em>Pgv3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPgv3()
     * @generated
     * @ordered
     */
    protected Double pgv3 = PGV3_EDEFAULT;

    /**
     * This is true if the Pgv3 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pgv3ESet;

    /**
     * The default value of the '{@link #getPgv1() <em>Pgv1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPgv1()
     * @generated
     * @ordered
     */
    protected static final Double PGV1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPgv1() <em>Pgv1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPgv1()
     * @generated
     * @ordered
     */
    protected Double pgv1 = PGV1_EDEFAULT;

    /**
     * This is true if the Pgv1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pgv1ESet;

    /**
     * The default value of the '{@link #getPgv2() <em>Pgv2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPgv2()
     * @generated
     * @ordered
     */
    protected static final Double PGV2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPgv2() <em>Pgv2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPgv2()
     * @generated
     * @ordered
     */
    protected Double pgv2 = PGV2_EDEFAULT;

    /**
     * This is true if the Pgv2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pgv2ESet;

    /**
     * The default value of the '{@link #getMwbase() <em>Mwbase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMwbase()
     * @generated
     * @ordered
     */
    protected static final Double MWBASE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMwbase() <em>Mwbase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMwbase()
     * @generated
     * @ordered
     */
    protected Double mwbase = MWBASE_EDEFAULT;

    /**
     * This is true if the Mwbase attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean mwbaseESet;

    /**
     * The default value of the '{@link #getTreg() <em>Treg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTreg()
     * @generated
     * @ordered
     */
    protected static final Double TREG_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTreg() <em>Treg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTreg()
     * @generated
     * @ordered
     */
    protected Double treg = TREG_EDEFAULT;

    /**
     * This is true if the Treg attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tregESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GovHydroWPIDImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getGovHydroWPID();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getD() {
        return d;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setD( Double newD ) {
        Double oldD = d;
        d = newD;
        boolean oldDESet = dESet;
        dESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_WPID__D, oldD, d,
                    !oldDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetD() {
        Double oldD = d;
        boolean oldDESet = dESet;
        d = D_EDEFAULT;
        dESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_HYDRO_WPID__D, oldD, D_EDEFAULT,
                    oldDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetD() {
        return dESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKd() {
        return kd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKd( Double newKd ) {
        Double oldKd = kd;
        kd = newKd;
        boolean oldKdESet = kdESet;
        kdESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_WPID__KD, oldKd, kd,
                    !oldKdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKd() {
        Double oldKd = kd;
        boolean oldKdESet = kdESet;
        kd = KD_EDEFAULT;
        kdESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_HYDRO_WPID__KD, oldKd, KD_EDEFAULT,
                    oldKdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKd() {
        return kdESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKi() {
        return ki;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKi( Double newKi ) {
        Double oldKi = ki;
        ki = newKi;
        boolean oldKiESet = kiESet;
        kiESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_WPID__KI, oldKi, ki,
                    !oldKiESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKi() {
        Double oldKi = ki;
        boolean oldKiESet = kiESet;
        ki = KI_EDEFAULT;
        kiESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_HYDRO_WPID__KI, oldKi, KI_EDEFAULT,
                    oldKiESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKi() {
        return kiESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKp() {
        return kp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKp( Double newKp ) {
        Double oldKp = kp;
        kp = newKp;
        boolean oldKpESet = kpESet;
        kpESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_WPID__KP, oldKp, kp,
                    !oldKpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKp() {
        Double oldKp = kp;
        boolean oldKpESet = kpESet;
        kp = KP_EDEFAULT;
        kpESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_HYDRO_WPID__KP, oldKp, KP_EDEFAULT,
                    oldKpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKp() {
        return kpESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTa() {
        return ta;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTa( Double newTa ) {
        Double oldTa = ta;
        ta = newTa;
        boolean oldTaESet = taESet;
        taESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_WPID__TA, oldTa, ta,
                    !oldTaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTa() {
        Double oldTa = ta;
        boolean oldTaESet = taESet;
        ta = TA_EDEFAULT;
        taESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_HYDRO_WPID__TA, oldTa, TA_EDEFAULT,
                    oldTaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTa() {
        return taESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTb() {
        return tb;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTb( Double newTb ) {
        Double oldTb = tb;
        tb = newTb;
        boolean oldTbESet = tbESet;
        tbESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_WPID__TB, oldTb, tb,
                    !oldTbESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTb() {
        Double oldTb = tb;
        boolean oldTbESet = tbESet;
        tb = TB_EDEFAULT;
        tbESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_HYDRO_WPID__TB, oldTb, TB_EDEFAULT,
                    oldTbESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTb() {
        return tbESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTw() {
        return tw;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTw( Double newTw ) {
        Double oldTw = tw;
        tw = newTw;
        boolean oldTwESet = twESet;
        twESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_WPID__TW, oldTw, tw,
                    !oldTwESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTw() {
        Double oldTw = tw;
        boolean oldTwESet = twESet;
        tw = TW_EDEFAULT;
        twESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_HYDRO_WPID__TW, oldTw, TW_EDEFAULT,
                    oldTwESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTw() {
        return twESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getGatmin() {
        return gatmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGatmin( Double newGatmin ) {
        Double oldGatmin = gatmin;
        gatmin = newGatmin;
        boolean oldGatminESet = gatminESet;
        gatminESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_WPID__GATMIN, oldGatmin,
                    gatmin, !oldGatminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGatmin() {
        Double oldGatmin = gatmin;
        boolean oldGatminESet = gatminESet;
        gatmin = GATMIN_EDEFAULT;
        gatminESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_HYDRO_WPID__GATMIN, oldGatmin,
                    GATMIN_EDEFAULT, oldGatminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGatmin() {
        return gatminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getGatmax() {
        return gatmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGatmax( Double newGatmax ) {
        Double oldGatmax = gatmax;
        gatmax = newGatmax;
        boolean oldGatmaxESet = gatmaxESet;
        gatmaxESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_WPID__GATMAX, oldGatmax,
                    gatmax, !oldGatmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGatmax() {
        Double oldGatmax = gatmax;
        boolean oldGatmaxESet = gatmaxESet;
        gatmax = GATMAX_EDEFAULT;
        gatmaxESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_HYDRO_WPID__GATMAX, oldGatmax,
                    GATMAX_EDEFAULT, oldGatmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGatmax() {
        return gatmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getReg() {
        return reg;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setReg( Double newReg ) {
        Double oldReg = reg;
        reg = newReg;
        boolean oldRegESet = regESet;
        regESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_WPID__REG, oldReg, reg,
                    !oldRegESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReg() {
        Double oldReg = reg;
        boolean oldRegESet = regESet;
        reg = REG_EDEFAULT;
        regESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_HYDRO_WPID__REG, oldReg,
                    REG_EDEFAULT, oldRegESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReg() {
        return regESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getPmin() {
        return pmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPmin( Double newPmin ) {
        Double oldPmin = pmin;
        pmin = newPmin;
        boolean oldPminESet = pminESet;
        pminESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_WPID__PMIN, oldPmin, pmin,
                    !oldPminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPmin() {
        Double oldPmin = pmin;
        boolean oldPminESet = pminESet;
        pmin = PMIN_EDEFAULT;
        pminESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_HYDRO_WPID__PMIN, oldPmin,
                    PMIN_EDEFAULT, oldPminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPmin() {
        return pminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getGv3() {
        return gv3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGv3( Double newGv3 ) {
        Double oldGv3 = gv3;
        gv3 = newGv3;
        boolean oldGv3ESet = gv3ESet;
        gv3ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_WPID__GV3, oldGv3, gv3,
                    !oldGv3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGv3() {
        Double oldGv3 = gv3;
        boolean oldGv3ESet = gv3ESet;
        gv3 = GV3_EDEFAULT;
        gv3ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_HYDRO_WPID__GV3, oldGv3,
                    GV3_EDEFAULT, oldGv3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGv3() {
        return gv3ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getGv2() {
        return gv2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGv2( Double newGv2 ) {
        Double oldGv2 = gv2;
        gv2 = newGv2;
        boolean oldGv2ESet = gv2ESet;
        gv2ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_WPID__GV2, oldGv2, gv2,
                    !oldGv2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGv2() {
        Double oldGv2 = gv2;
        boolean oldGv2ESet = gv2ESet;
        gv2 = GV2_EDEFAULT;
        gv2ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_HYDRO_WPID__GV2, oldGv2,
                    GV2_EDEFAULT, oldGv2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGv2() {
        return gv2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getGv1() {
        return gv1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGv1( Double newGv1 ) {
        Double oldGv1 = gv1;
        gv1 = newGv1;
        boolean oldGv1ESet = gv1ESet;
        gv1ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_WPID__GV1, oldGv1, gv1,
                    !oldGv1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGv1() {
        Double oldGv1 = gv1;
        boolean oldGv1ESet = gv1ESet;
        gv1 = GV1_EDEFAULT;
        gv1ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_HYDRO_WPID__GV1, oldGv1,
                    GV1_EDEFAULT, oldGv1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGv1() {
        return gv1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVelmin() {
        return velmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVelmin( Double newVelmin ) {
        Double oldVelmin = velmin;
        velmin = newVelmin;
        boolean oldVelminESet = velminESet;
        velminESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_WPID__VELMIN, oldVelmin,
                    velmin, !oldVelminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVelmin() {
        Double oldVelmin = velmin;
        boolean oldVelminESet = velminESet;
        velmin = VELMIN_EDEFAULT;
        velminESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_HYDRO_WPID__VELMIN, oldVelmin,
                    VELMIN_EDEFAULT, oldVelminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVelmin() {
        return velminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVelmax() {
        return velmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVelmax( Double newVelmax ) {
        Double oldVelmax = velmax;
        velmax = newVelmax;
        boolean oldVelmaxESet = velmaxESet;
        velmaxESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_WPID__VELMAX, oldVelmax,
                    velmax, !oldVelmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVelmax() {
        Double oldVelmax = velmax;
        boolean oldVelmaxESet = velmaxESet;
        velmax = VELMAX_EDEFAULT;
        velmaxESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_HYDRO_WPID__VELMAX, oldVelmax,
                    VELMAX_EDEFAULT, oldVelmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVelmax() {
        return velmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getPmax() {
        return pmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPmax( Double newPmax ) {
        Double oldPmax = pmax;
        pmax = newPmax;
        boolean oldPmaxESet = pmaxESet;
        pmaxESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_WPID__PMAX, oldPmax, pmax,
                    !oldPmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPmax() {
        Double oldPmax = pmax;
        boolean oldPmaxESet = pmaxESet;
        pmax = PMAX_EDEFAULT;
        pmaxESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_HYDRO_WPID__PMAX, oldPmax,
                    PMAX_EDEFAULT, oldPmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPmax() {
        return pmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getPgv3() {
        return pgv3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPgv3( Double newPgv3 ) {
        Double oldPgv3 = pgv3;
        pgv3 = newPgv3;
        boolean oldPgv3ESet = pgv3ESet;
        pgv3ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_WPID__PGV3, oldPgv3, pgv3,
                    !oldPgv3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPgv3() {
        Double oldPgv3 = pgv3;
        boolean oldPgv3ESet = pgv3ESet;
        pgv3 = PGV3_EDEFAULT;
        pgv3ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_HYDRO_WPID__PGV3, oldPgv3,
                    PGV3_EDEFAULT, oldPgv3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPgv3() {
        return pgv3ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getPgv1() {
        return pgv1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPgv1( Double newPgv1 ) {
        Double oldPgv1 = pgv1;
        pgv1 = newPgv1;
        boolean oldPgv1ESet = pgv1ESet;
        pgv1ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_WPID__PGV1, oldPgv1, pgv1,
                    !oldPgv1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPgv1() {
        Double oldPgv1 = pgv1;
        boolean oldPgv1ESet = pgv1ESet;
        pgv1 = PGV1_EDEFAULT;
        pgv1ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_HYDRO_WPID__PGV1, oldPgv1,
                    PGV1_EDEFAULT, oldPgv1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPgv1() {
        return pgv1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getPgv2() {
        return pgv2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPgv2( Double newPgv2 ) {
        Double oldPgv2 = pgv2;
        pgv2 = newPgv2;
        boolean oldPgv2ESet = pgv2ESet;
        pgv2ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_WPID__PGV2, oldPgv2, pgv2,
                    !oldPgv2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPgv2() {
        Double oldPgv2 = pgv2;
        boolean oldPgv2ESet = pgv2ESet;
        pgv2 = PGV2_EDEFAULT;
        pgv2ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_HYDRO_WPID__PGV2, oldPgv2,
                    PGV2_EDEFAULT, oldPgv2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPgv2() {
        return pgv2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getMwbase() {
        return mwbase;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMwbase( Double newMwbase ) {
        Double oldMwbase = mwbase;
        mwbase = newMwbase;
        boolean oldMwbaseESet = mwbaseESet;
        mwbaseESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_WPID__MWBASE, oldMwbase,
                    mwbase, !oldMwbaseESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMwbase() {
        Double oldMwbase = mwbase;
        boolean oldMwbaseESet = mwbaseESet;
        mwbase = MWBASE_EDEFAULT;
        mwbaseESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_HYDRO_WPID__MWBASE, oldMwbase,
                    MWBASE_EDEFAULT, oldMwbaseESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMwbase() {
        return mwbaseESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTreg() {
        return treg;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTreg( Double newTreg ) {
        Double oldTreg = treg;
        treg = newTreg;
        boolean oldTregESet = tregESet;
        tregESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO_WPID__TREG, oldTreg, treg,
                    !oldTregESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTreg() {
        Double oldTreg = treg;
        boolean oldTregESet = tregESet;
        treg = TREG_EDEFAULT;
        tregESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_HYDRO_WPID__TREG, oldTreg,
                    TREG_EDEFAULT, oldTregESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTreg() {
        return tregESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.GOV_HYDRO_WPID__D:
            return getD();
        case CimPackage.GOV_HYDRO_WPID__KD:
            return getKd();
        case CimPackage.GOV_HYDRO_WPID__KI:
            return getKi();
        case CimPackage.GOV_HYDRO_WPID__KP:
            return getKp();
        case CimPackage.GOV_HYDRO_WPID__TA:
            return getTa();
        case CimPackage.GOV_HYDRO_WPID__TB:
            return getTb();
        case CimPackage.GOV_HYDRO_WPID__TW:
            return getTw();
        case CimPackage.GOV_HYDRO_WPID__GATMIN:
            return getGatmin();
        case CimPackage.GOV_HYDRO_WPID__GATMAX:
            return getGatmax();
        case CimPackage.GOV_HYDRO_WPID__REG:
            return getReg();
        case CimPackage.GOV_HYDRO_WPID__PMIN:
            return getPmin();
        case CimPackage.GOV_HYDRO_WPID__GV3:
            return getGv3();
        case CimPackage.GOV_HYDRO_WPID__GV2:
            return getGv2();
        case CimPackage.GOV_HYDRO_WPID__GV1:
            return getGv1();
        case CimPackage.GOV_HYDRO_WPID__VELMIN:
            return getVelmin();
        case CimPackage.GOV_HYDRO_WPID__VELMAX:
            return getVelmax();
        case CimPackage.GOV_HYDRO_WPID__PMAX:
            return getPmax();
        case CimPackage.GOV_HYDRO_WPID__PGV3:
            return getPgv3();
        case CimPackage.GOV_HYDRO_WPID__PGV1:
            return getPgv1();
        case CimPackage.GOV_HYDRO_WPID__PGV2:
            return getPgv2();
        case CimPackage.GOV_HYDRO_WPID__MWBASE:
            return getMwbase();
        case CimPackage.GOV_HYDRO_WPID__TREG:
            return getTreg();
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
        case CimPackage.GOV_HYDRO_WPID__D:
            setD( ( Double ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WPID__KD:
            setKd( ( Double ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WPID__KI:
            setKi( ( Double ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WPID__KP:
            setKp( ( Double ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WPID__TA:
            setTa( ( Double ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WPID__TB:
            setTb( ( Double ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WPID__TW:
            setTw( ( Double ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WPID__GATMIN:
            setGatmin( ( Double ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WPID__GATMAX:
            setGatmax( ( Double ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WPID__REG:
            setReg( ( Double ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WPID__PMIN:
            setPmin( ( Double ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WPID__GV3:
            setGv3( ( Double ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WPID__GV2:
            setGv2( ( Double ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WPID__GV1:
            setGv1( ( Double ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WPID__VELMIN:
            setVelmin( ( Double ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WPID__VELMAX:
            setVelmax( ( Double ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WPID__PMAX:
            setPmax( ( Double ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WPID__PGV3:
            setPgv3( ( Double ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WPID__PGV1:
            setPgv1( ( Double ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WPID__PGV2:
            setPgv2( ( Double ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WPID__MWBASE:
            setMwbase( ( Double ) newValue );
            return;
        case CimPackage.GOV_HYDRO_WPID__TREG:
            setTreg( ( Double ) newValue );
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
        case CimPackage.GOV_HYDRO_WPID__D:
            unsetD();
            return;
        case CimPackage.GOV_HYDRO_WPID__KD:
            unsetKd();
            return;
        case CimPackage.GOV_HYDRO_WPID__KI:
            unsetKi();
            return;
        case CimPackage.GOV_HYDRO_WPID__KP:
            unsetKp();
            return;
        case CimPackage.GOV_HYDRO_WPID__TA:
            unsetTa();
            return;
        case CimPackage.GOV_HYDRO_WPID__TB:
            unsetTb();
            return;
        case CimPackage.GOV_HYDRO_WPID__TW:
            unsetTw();
            return;
        case CimPackage.GOV_HYDRO_WPID__GATMIN:
            unsetGatmin();
            return;
        case CimPackage.GOV_HYDRO_WPID__GATMAX:
            unsetGatmax();
            return;
        case CimPackage.GOV_HYDRO_WPID__REG:
            unsetReg();
            return;
        case CimPackage.GOV_HYDRO_WPID__PMIN:
            unsetPmin();
            return;
        case CimPackage.GOV_HYDRO_WPID__GV3:
            unsetGv3();
            return;
        case CimPackage.GOV_HYDRO_WPID__GV2:
            unsetGv2();
            return;
        case CimPackage.GOV_HYDRO_WPID__GV1:
            unsetGv1();
            return;
        case CimPackage.GOV_HYDRO_WPID__VELMIN:
            unsetVelmin();
            return;
        case CimPackage.GOV_HYDRO_WPID__VELMAX:
            unsetVelmax();
            return;
        case CimPackage.GOV_HYDRO_WPID__PMAX:
            unsetPmax();
            return;
        case CimPackage.GOV_HYDRO_WPID__PGV3:
            unsetPgv3();
            return;
        case CimPackage.GOV_HYDRO_WPID__PGV1:
            unsetPgv1();
            return;
        case CimPackage.GOV_HYDRO_WPID__PGV2:
            unsetPgv2();
            return;
        case CimPackage.GOV_HYDRO_WPID__MWBASE:
            unsetMwbase();
            return;
        case CimPackage.GOV_HYDRO_WPID__TREG:
            unsetTreg();
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
        case CimPackage.GOV_HYDRO_WPID__D:
            return isSetD();
        case CimPackage.GOV_HYDRO_WPID__KD:
            return isSetKd();
        case CimPackage.GOV_HYDRO_WPID__KI:
            return isSetKi();
        case CimPackage.GOV_HYDRO_WPID__KP:
            return isSetKp();
        case CimPackage.GOV_HYDRO_WPID__TA:
            return isSetTa();
        case CimPackage.GOV_HYDRO_WPID__TB:
            return isSetTb();
        case CimPackage.GOV_HYDRO_WPID__TW:
            return isSetTw();
        case CimPackage.GOV_HYDRO_WPID__GATMIN:
            return isSetGatmin();
        case CimPackage.GOV_HYDRO_WPID__GATMAX:
            return isSetGatmax();
        case CimPackage.GOV_HYDRO_WPID__REG:
            return isSetReg();
        case CimPackage.GOV_HYDRO_WPID__PMIN:
            return isSetPmin();
        case CimPackage.GOV_HYDRO_WPID__GV3:
            return isSetGv3();
        case CimPackage.GOV_HYDRO_WPID__GV2:
            return isSetGv2();
        case CimPackage.GOV_HYDRO_WPID__GV1:
            return isSetGv1();
        case CimPackage.GOV_HYDRO_WPID__VELMIN:
            return isSetVelmin();
        case CimPackage.GOV_HYDRO_WPID__VELMAX:
            return isSetVelmax();
        case CimPackage.GOV_HYDRO_WPID__PMAX:
            return isSetPmax();
        case CimPackage.GOV_HYDRO_WPID__PGV3:
            return isSetPgv3();
        case CimPackage.GOV_HYDRO_WPID__PGV1:
            return isSetPgv1();
        case CimPackage.GOV_HYDRO_WPID__PGV2:
            return isSetPgv2();
        case CimPackage.GOV_HYDRO_WPID__MWBASE:
            return isSetMwbase();
        case CimPackage.GOV_HYDRO_WPID__TREG:
            return isSetTreg();
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
        result.append( " (d: " );
        if( dESet )
            result.append( d );
        else
            result.append( "<unset>" );
        result.append( ", kd: " );
        if( kdESet )
            result.append( kd );
        else
            result.append( "<unset>" );
        result.append( ", ki: " );
        if( kiESet )
            result.append( ki );
        else
            result.append( "<unset>" );
        result.append( ", kp: " );
        if( kpESet )
            result.append( kp );
        else
            result.append( "<unset>" );
        result.append( ", ta: " );
        if( taESet )
            result.append( ta );
        else
            result.append( "<unset>" );
        result.append( ", tb: " );
        if( tbESet )
            result.append( tb );
        else
            result.append( "<unset>" );
        result.append( ", tw: " );
        if( twESet )
            result.append( tw );
        else
            result.append( "<unset>" );
        result.append( ", gatmin: " );
        if( gatminESet )
            result.append( gatmin );
        else
            result.append( "<unset>" );
        result.append( ", gatmax: " );
        if( gatmaxESet )
            result.append( gatmax );
        else
            result.append( "<unset>" );
        result.append( ", reg: " );
        if( regESet )
            result.append( reg );
        else
            result.append( "<unset>" );
        result.append( ", pmin: " );
        if( pminESet )
            result.append( pmin );
        else
            result.append( "<unset>" );
        result.append( ", gv3: " );
        if( gv3ESet )
            result.append( gv3 );
        else
            result.append( "<unset>" );
        result.append( ", gv2: " );
        if( gv2ESet )
            result.append( gv2 );
        else
            result.append( "<unset>" );
        result.append( ", gv1: " );
        if( gv1ESet )
            result.append( gv1 );
        else
            result.append( "<unset>" );
        result.append( ", velmin: " );
        if( velminESet )
            result.append( velmin );
        else
            result.append( "<unset>" );
        result.append( ", velmax: " );
        if( velmaxESet )
            result.append( velmax );
        else
            result.append( "<unset>" );
        result.append( ", pmax: " );
        if( pmaxESet )
            result.append( pmax );
        else
            result.append( "<unset>" );
        result.append( ", pgv3: " );
        if( pgv3ESet )
            result.append( pgv3 );
        else
            result.append( "<unset>" );
        result.append( ", pgv1: " );
        if( pgv1ESet )
            result.append( pgv1 );
        else
            result.append( "<unset>" );
        result.append( ", pgv2: " );
        if( pgv2ESet )
            result.append( pgv2 );
        else
            result.append( "<unset>" );
        result.append( ", mwbase: " );
        if( mwbaseESet )
            result.append( mwbase );
        else
            result.append( "<unset>" );
        result.append( ", treg: " );
        if( tregESet )
            result.append( treg );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //GovHydroWPIDImpl

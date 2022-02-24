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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamBB;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gov Steam BB</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamBBImpl#getKs <em>Ks</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamBBImpl#getKp <em>Kp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamBBImpl#getKd <em>Kd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamBBImpl#getKg <em>Kg</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamBBImpl#getK3 <em>K3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamBBImpl#getK2 <em>K2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamBBImpl#getPeflag <em>Peflag</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamBBImpl#getTn <em>Tn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamBBImpl#getTd <em>Td</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamBBImpl#getT6 <em>T6</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamBBImpl#getT5 <em>T5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamBBImpl#getT4 <em>T4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamBBImpl#getT1 <em>T1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamBBImpl#getPmax <em>Pmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamBBImpl#getPmin <em>Pmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamBBImpl#getKls <em>Kls</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamBBImpl#getFcut <em>Fcut</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GovSteamBBImpl extends TurbineGovernorDynamicsImpl implements GovSteamBB {
    /**
     * The default value of the '{@link #getKs() <em>Ks</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKs()
     * @generated
     * @ordered
     */
    protected static final Double KS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKs() <em>Ks</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKs()
     * @generated
     * @ordered
     */
    protected Double ks = KS_EDEFAULT;

    /**
     * This is true if the Ks attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ksESet;

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
     * The default value of the '{@link #getKg() <em>Kg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKg()
     * @generated
     * @ordered
     */
    protected static final Double KG_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKg() <em>Kg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKg()
     * @generated
     * @ordered
     */
    protected Double kg = KG_EDEFAULT;

    /**
     * This is true if the Kg attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kgESet;

    /**
     * The default value of the '{@link #getK3() <em>K3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getK3()
     * @generated
     * @ordered
     */
    protected static final Double K3_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getK3() <em>K3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getK3()
     * @generated
     * @ordered
     */
    protected Double k3 = K3_EDEFAULT;

    /**
     * This is true if the K3 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean k3ESet;

    /**
     * The default value of the '{@link #getK2() <em>K2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getK2()
     * @generated
     * @ordered
     */
    protected static final Double K2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getK2() <em>K2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getK2()
     * @generated
     * @ordered
     */
    protected Double k2 = K2_EDEFAULT;

    /**
     * This is true if the K2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean k2ESet;

    /**
     * The default value of the '{@link #getPeflag() <em>Peflag</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPeflag()
     * @generated
     * @ordered
     */
    protected static final Boolean PEFLAG_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPeflag() <em>Peflag</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPeflag()
     * @generated
     * @ordered
     */
    protected Boolean peflag = PEFLAG_EDEFAULT;

    /**
     * This is true if the Peflag attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean peflagESet;

    /**
     * The default value of the '{@link #getTn() <em>Tn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTn()
     * @generated
     * @ordered
     */
    protected static final Double TN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTn() <em>Tn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTn()
     * @generated
     * @ordered
     */
    protected Double tn = TN_EDEFAULT;

    /**
     * This is true if the Tn attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tnESet;

    /**
     * The default value of the '{@link #getTd() <em>Td</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTd()
     * @generated
     * @ordered
     */
    protected static final Double TD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTd() <em>Td</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTd()
     * @generated
     * @ordered
     */
    protected Double td = TD_EDEFAULT;

    /**
     * This is true if the Td attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tdESet;

    /**
     * The default value of the '{@link #getT6() <em>T6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT6()
     * @generated
     * @ordered
     */
    protected static final Double T6_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getT6() <em>T6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT6()
     * @generated
     * @ordered
     */
    protected Double t6 = T6_EDEFAULT;

    /**
     * This is true if the T6 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean t6ESet;

    /**
     * The default value of the '{@link #getT5() <em>T5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT5()
     * @generated
     * @ordered
     */
    protected static final Double T5_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getT5() <em>T5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT5()
     * @generated
     * @ordered
     */
    protected Double t5 = T5_EDEFAULT;

    /**
     * This is true if the T5 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean t5ESet;

    /**
     * The default value of the '{@link #getT4() <em>T4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT4()
     * @generated
     * @ordered
     */
    protected static final Double T4_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getT4() <em>T4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT4()
     * @generated
     * @ordered
     */
    protected Double t4 = T4_EDEFAULT;

    /**
     * This is true if the T4 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean t4ESet;

    /**
     * The default value of the '{@link #getT1() <em>T1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT1()
     * @generated
     * @ordered
     */
    protected static final Double T1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getT1() <em>T1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT1()
     * @generated
     * @ordered
     */
    protected Double t1 = T1_EDEFAULT;

    /**
     * This is true if the T1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean t1ESet;

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
     * The default value of the '{@link #getKls() <em>Kls</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKls()
     * @generated
     * @ordered
     */
    protected static final Double KLS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKls() <em>Kls</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKls()
     * @generated
     * @ordered
     */
    protected Double kls = KLS_EDEFAULT;

    /**
     * This is true if the Kls attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean klsESet;

    /**
     * The default value of the '{@link #getFcut() <em>Fcut</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFcut()
     * @generated
     * @ordered
     */
    protected static final Double FCUT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFcut() <em>Fcut</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFcut()
     * @generated
     * @ordered
     */
    protected Double fcut = FCUT_EDEFAULT;

    /**
     * This is true if the Fcut attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fcutESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GovSteamBBImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getGovSteamBB();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKs() {
        return ks;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKs( Double newKs ) {
        Double oldKs = ks;
        ks = newKs;
        boolean oldKsESet = ksESet;
        ksESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_BB__KS, oldKs, ks,
                    !oldKsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKs() {
        Double oldKs = ks;
        boolean oldKsESet = ksESet;
        ks = KS_EDEFAULT;
        ksESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_BB__KS, oldKs, KS_EDEFAULT,
                    oldKsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKs() {
        return ksESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_BB__KP, oldKp, kp,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_BB__KP, oldKp, KP_EDEFAULT,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_BB__KD, oldKd, kd,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_BB__KD, oldKd, KD_EDEFAULT,
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
    public Double getKg() {
        return kg;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKg( Double newKg ) {
        Double oldKg = kg;
        kg = newKg;
        boolean oldKgESet = kgESet;
        kgESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_BB__KG, oldKg, kg,
                    !oldKgESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKg() {
        Double oldKg = kg;
        boolean oldKgESet = kgESet;
        kg = KG_EDEFAULT;
        kgESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_BB__KG, oldKg, KG_EDEFAULT,
                    oldKgESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKg() {
        return kgESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getK3() {
        return k3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setK3( Double newK3 ) {
        Double oldK3 = k3;
        k3 = newK3;
        boolean oldK3ESet = k3ESet;
        k3ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_BB__K3, oldK3, k3,
                    !oldK3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetK3() {
        Double oldK3 = k3;
        boolean oldK3ESet = k3ESet;
        k3 = K3_EDEFAULT;
        k3ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_BB__K3, oldK3, K3_EDEFAULT,
                    oldK3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetK3() {
        return k3ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getK2() {
        return k2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setK2( Double newK2 ) {
        Double oldK2 = k2;
        k2 = newK2;
        boolean oldK2ESet = k2ESet;
        k2ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_BB__K2, oldK2, k2,
                    !oldK2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetK2() {
        Double oldK2 = k2;
        boolean oldK2ESet = k2ESet;
        k2 = K2_EDEFAULT;
        k2ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_BB__K2, oldK2, K2_EDEFAULT,
                    oldK2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetK2() {
        return k2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getPeflag() {
        return peflag;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPeflag( Boolean newPeflag ) {
        Boolean oldPeflag = peflag;
        peflag = newPeflag;
        boolean oldPeflagESet = peflagESet;
        peflagESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_BB__PEFLAG, oldPeflag, peflag,
                    !oldPeflagESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPeflag() {
        Boolean oldPeflag = peflag;
        boolean oldPeflagESet = peflagESet;
        peflag = PEFLAG_EDEFAULT;
        peflagESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_BB__PEFLAG, oldPeflag,
                    PEFLAG_EDEFAULT, oldPeflagESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPeflag() {
        return peflagESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTn() {
        return tn;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTn( Double newTn ) {
        Double oldTn = tn;
        tn = newTn;
        boolean oldTnESet = tnESet;
        tnESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_BB__TN, oldTn, tn,
                    !oldTnESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTn() {
        Double oldTn = tn;
        boolean oldTnESet = tnESet;
        tn = TN_EDEFAULT;
        tnESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_BB__TN, oldTn, TN_EDEFAULT,
                    oldTnESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTn() {
        return tnESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTd() {
        return td;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTd( Double newTd ) {
        Double oldTd = td;
        td = newTd;
        boolean oldTdESet = tdESet;
        tdESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_BB__TD, oldTd, td,
                    !oldTdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTd() {
        Double oldTd = td;
        boolean oldTdESet = tdESet;
        td = TD_EDEFAULT;
        tdESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_BB__TD, oldTd, TD_EDEFAULT,
                    oldTdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTd() {
        return tdESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getT6() {
        return t6;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setT6( Double newT6 ) {
        Double oldT6 = t6;
        t6 = newT6;
        boolean oldT6ESet = t6ESet;
        t6ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_BB__T6, oldT6, t6,
                    !oldT6ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetT6() {
        Double oldT6 = t6;
        boolean oldT6ESet = t6ESet;
        t6 = T6_EDEFAULT;
        t6ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_BB__T6, oldT6, T6_EDEFAULT,
                    oldT6ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetT6() {
        return t6ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getT5() {
        return t5;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setT5( Double newT5 ) {
        Double oldT5 = t5;
        t5 = newT5;
        boolean oldT5ESet = t5ESet;
        t5ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_BB__T5, oldT5, t5,
                    !oldT5ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetT5() {
        Double oldT5 = t5;
        boolean oldT5ESet = t5ESet;
        t5 = T5_EDEFAULT;
        t5ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_BB__T5, oldT5, T5_EDEFAULT,
                    oldT5ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetT5() {
        return t5ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getT4() {
        return t4;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setT4( Double newT4 ) {
        Double oldT4 = t4;
        t4 = newT4;
        boolean oldT4ESet = t4ESet;
        t4ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_BB__T4, oldT4, t4,
                    !oldT4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetT4() {
        Double oldT4 = t4;
        boolean oldT4ESet = t4ESet;
        t4 = T4_EDEFAULT;
        t4ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_BB__T4, oldT4, T4_EDEFAULT,
                    oldT4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetT4() {
        return t4ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getT1() {
        return t1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setT1( Double newT1 ) {
        Double oldT1 = t1;
        t1 = newT1;
        boolean oldT1ESet = t1ESet;
        t1ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_BB__T1, oldT1, t1,
                    !oldT1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetT1() {
        Double oldT1 = t1;
        boolean oldT1ESet = t1ESet;
        t1 = T1_EDEFAULT;
        t1ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_BB__T1, oldT1, T1_EDEFAULT,
                    oldT1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetT1() {
        return t1ESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_BB__PMAX, oldPmax, pmax,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_BB__PMAX, oldPmax,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_BB__PMIN, oldPmin, pmin,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_BB__PMIN, oldPmin,
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
    public Double getKls() {
        return kls;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKls( Double newKls ) {
        Double oldKls = kls;
        kls = newKls;
        boolean oldKlsESet = klsESet;
        klsESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_BB__KLS, oldKls, kls,
                    !oldKlsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKls() {
        Double oldKls = kls;
        boolean oldKlsESet = klsESet;
        kls = KLS_EDEFAULT;
        klsESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_BB__KLS, oldKls,
                    KLS_EDEFAULT, oldKlsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKls() {
        return klsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getFcut() {
        return fcut;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFcut( Double newFcut ) {
        Double oldFcut = fcut;
        fcut = newFcut;
        boolean oldFcutESet = fcutESet;
        fcutESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_BB__FCUT, oldFcut, fcut,
                    !oldFcutESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFcut() {
        Double oldFcut = fcut;
        boolean oldFcutESet = fcutESet;
        fcut = FCUT_EDEFAULT;
        fcutESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_BB__FCUT, oldFcut,
                    FCUT_EDEFAULT, oldFcutESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFcut() {
        return fcutESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.GOV_STEAM_BB__KS:
            return getKs();
        case CimPackage.GOV_STEAM_BB__KP:
            return getKp();
        case CimPackage.GOV_STEAM_BB__KD:
            return getKd();
        case CimPackage.GOV_STEAM_BB__KG:
            return getKg();
        case CimPackage.GOV_STEAM_BB__K3:
            return getK3();
        case CimPackage.GOV_STEAM_BB__K2:
            return getK2();
        case CimPackage.GOV_STEAM_BB__PEFLAG:
            return getPeflag();
        case CimPackage.GOV_STEAM_BB__TN:
            return getTn();
        case CimPackage.GOV_STEAM_BB__TD:
            return getTd();
        case CimPackage.GOV_STEAM_BB__T6:
            return getT6();
        case CimPackage.GOV_STEAM_BB__T5:
            return getT5();
        case CimPackage.GOV_STEAM_BB__T4:
            return getT4();
        case CimPackage.GOV_STEAM_BB__T1:
            return getT1();
        case CimPackage.GOV_STEAM_BB__PMAX:
            return getPmax();
        case CimPackage.GOV_STEAM_BB__PMIN:
            return getPmin();
        case CimPackage.GOV_STEAM_BB__KLS:
            return getKls();
        case CimPackage.GOV_STEAM_BB__FCUT:
            return getFcut();
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
        case CimPackage.GOV_STEAM_BB__KS:
            setKs( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM_BB__KP:
            setKp( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM_BB__KD:
            setKd( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM_BB__KG:
            setKg( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM_BB__K3:
            setK3( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM_BB__K2:
            setK2( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM_BB__PEFLAG:
            setPeflag( ( Boolean ) newValue );
            return;
        case CimPackage.GOV_STEAM_BB__TN:
            setTn( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM_BB__TD:
            setTd( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM_BB__T6:
            setT6( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM_BB__T5:
            setT5( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM_BB__T4:
            setT4( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM_BB__T1:
            setT1( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM_BB__PMAX:
            setPmax( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM_BB__PMIN:
            setPmin( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM_BB__KLS:
            setKls( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM_BB__FCUT:
            setFcut( ( Double ) newValue );
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
        case CimPackage.GOV_STEAM_BB__KS:
            unsetKs();
            return;
        case CimPackage.GOV_STEAM_BB__KP:
            unsetKp();
            return;
        case CimPackage.GOV_STEAM_BB__KD:
            unsetKd();
            return;
        case CimPackage.GOV_STEAM_BB__KG:
            unsetKg();
            return;
        case CimPackage.GOV_STEAM_BB__K3:
            unsetK3();
            return;
        case CimPackage.GOV_STEAM_BB__K2:
            unsetK2();
            return;
        case CimPackage.GOV_STEAM_BB__PEFLAG:
            unsetPeflag();
            return;
        case CimPackage.GOV_STEAM_BB__TN:
            unsetTn();
            return;
        case CimPackage.GOV_STEAM_BB__TD:
            unsetTd();
            return;
        case CimPackage.GOV_STEAM_BB__T6:
            unsetT6();
            return;
        case CimPackage.GOV_STEAM_BB__T5:
            unsetT5();
            return;
        case CimPackage.GOV_STEAM_BB__T4:
            unsetT4();
            return;
        case CimPackage.GOV_STEAM_BB__T1:
            unsetT1();
            return;
        case CimPackage.GOV_STEAM_BB__PMAX:
            unsetPmax();
            return;
        case CimPackage.GOV_STEAM_BB__PMIN:
            unsetPmin();
            return;
        case CimPackage.GOV_STEAM_BB__KLS:
            unsetKls();
            return;
        case CimPackage.GOV_STEAM_BB__FCUT:
            unsetFcut();
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
        case CimPackage.GOV_STEAM_BB__KS:
            return isSetKs();
        case CimPackage.GOV_STEAM_BB__KP:
            return isSetKp();
        case CimPackage.GOV_STEAM_BB__KD:
            return isSetKd();
        case CimPackage.GOV_STEAM_BB__KG:
            return isSetKg();
        case CimPackage.GOV_STEAM_BB__K3:
            return isSetK3();
        case CimPackage.GOV_STEAM_BB__K2:
            return isSetK2();
        case CimPackage.GOV_STEAM_BB__PEFLAG:
            return isSetPeflag();
        case CimPackage.GOV_STEAM_BB__TN:
            return isSetTn();
        case CimPackage.GOV_STEAM_BB__TD:
            return isSetTd();
        case CimPackage.GOV_STEAM_BB__T6:
            return isSetT6();
        case CimPackage.GOV_STEAM_BB__T5:
            return isSetT5();
        case CimPackage.GOV_STEAM_BB__T4:
            return isSetT4();
        case CimPackage.GOV_STEAM_BB__T1:
            return isSetT1();
        case CimPackage.GOV_STEAM_BB__PMAX:
            return isSetPmax();
        case CimPackage.GOV_STEAM_BB__PMIN:
            return isSetPmin();
        case CimPackage.GOV_STEAM_BB__KLS:
            return isSetKls();
        case CimPackage.GOV_STEAM_BB__FCUT:
            return isSetFcut();
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
        result.append( " (ks: " );
        if( ksESet )
            result.append( ks );
        else
            result.append( "<unset>" );
        result.append( ", kp: " );
        if( kpESet )
            result.append( kp );
        else
            result.append( "<unset>" );
        result.append( ", kd: " );
        if( kdESet )
            result.append( kd );
        else
            result.append( "<unset>" );
        result.append( ", kg: " );
        if( kgESet )
            result.append( kg );
        else
            result.append( "<unset>" );
        result.append( ", k3: " );
        if( k3ESet )
            result.append( k3 );
        else
            result.append( "<unset>" );
        result.append( ", k2: " );
        if( k2ESet )
            result.append( k2 );
        else
            result.append( "<unset>" );
        result.append( ", peflag: " );
        if( peflagESet )
            result.append( peflag );
        else
            result.append( "<unset>" );
        result.append( ", tn: " );
        if( tnESet )
            result.append( tn );
        else
            result.append( "<unset>" );
        result.append( ", td: " );
        if( tdESet )
            result.append( td );
        else
            result.append( "<unset>" );
        result.append( ", t6: " );
        if( t6ESet )
            result.append( t6 );
        else
            result.append( "<unset>" );
        result.append( ", t5: " );
        if( t5ESet )
            result.append( t5 );
        else
            result.append( "<unset>" );
        result.append( ", t4: " );
        if( t4ESet )
            result.append( t4 );
        else
            result.append( "<unset>" );
        result.append( ", t1: " );
        if( t1ESet )
            result.append( t1 );
        else
            result.append( "<unset>" );
        result.append( ", pmax: " );
        if( pmaxESet )
            result.append( pmax );
        else
            result.append( "<unset>" );
        result.append( ", pmin: " );
        if( pminESet )
            result.append( pmin );
        else
            result.append( "<unset>" );
        result.append( ", kls: " );
        if( klsESet )
            result.append( kls );
        else
            result.append( "<unset>" );
        result.append( ", fcut: " );
        if( fcutESet )
            result.append( fcut );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //GovSteamBBImpl

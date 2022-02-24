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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST4;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gov GAST4</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovGAST4Impl#getMxef <em>Mxef</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovGAST4Impl#getMnef <em>Mnef</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovGAST4Impl#getTy <em>Ty</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovGAST4Impl#getTm <em>Tm</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovGAST4Impl#getTc <em>Tc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovGAST4Impl#getTa <em>Ta</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovGAST4Impl#getTcm <em>Tcm</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovGAST4Impl#getKtm <em>Ktm</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovGAST4Impl#getBp <em>Bp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovGAST4Impl#getRymn <em>Rymn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovGAST4Impl#getRymx <em>Rymx</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GovGAST4Impl extends TurbineGovernorDynamicsImpl implements GovGAST4 {
    /**
     * The default value of the '{@link #getMxef() <em>Mxef</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMxef()
     * @generated
     * @ordered
     */
    protected static final Double MXEF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMxef() <em>Mxef</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMxef()
     * @generated
     * @ordered
     */
    protected Double mxef = MXEF_EDEFAULT;

    /**
     * This is true if the Mxef attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean mxefESet;

    /**
     * The default value of the '{@link #getMnef() <em>Mnef</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMnef()
     * @generated
     * @ordered
     */
    protected static final Double MNEF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMnef() <em>Mnef</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMnef()
     * @generated
     * @ordered
     */
    protected Double mnef = MNEF_EDEFAULT;

    /**
     * This is true if the Mnef attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean mnefESet;

    /**
     * The default value of the '{@link #getTy() <em>Ty</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTy()
     * @generated
     * @ordered
     */
    protected static final Double TY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTy() <em>Ty</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTy()
     * @generated
     * @ordered
     */
    protected Double ty = TY_EDEFAULT;

    /**
     * This is true if the Ty attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tyESet;

    /**
     * The default value of the '{@link #getTm() <em>Tm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTm()
     * @generated
     * @ordered
     */
    protected static final Double TM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTm() <em>Tm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTm()
     * @generated
     * @ordered
     */
    protected Double tm = TM_EDEFAULT;

    /**
     * This is true if the Tm attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tmESet;

    /**
     * The default value of the '{@link #getTc() <em>Tc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTc()
     * @generated
     * @ordered
     */
    protected static final Double TC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTc() <em>Tc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTc()
     * @generated
     * @ordered
     */
    protected Double tc = TC_EDEFAULT;

    /**
     * This is true if the Tc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tcESet;

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
     * The default value of the '{@link #getTcm() <em>Tcm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTcm()
     * @generated
     * @ordered
     */
    protected static final Double TCM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTcm() <em>Tcm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTcm()
     * @generated
     * @ordered
     */
    protected Double tcm = TCM_EDEFAULT;

    /**
     * This is true if the Tcm attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tcmESet;

    /**
     * The default value of the '{@link #getKtm() <em>Ktm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKtm()
     * @generated
     * @ordered
     */
    protected static final Double KTM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKtm() <em>Ktm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKtm()
     * @generated
     * @ordered
     */
    protected Double ktm = KTM_EDEFAULT;

    /**
     * This is true if the Ktm attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ktmESet;

    /**
     * The default value of the '{@link #getBp() <em>Bp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBp()
     * @generated
     * @ordered
     */
    protected static final Double BP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBp() <em>Bp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBp()
     * @generated
     * @ordered
     */
    protected Double bp = BP_EDEFAULT;

    /**
     * This is true if the Bp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean bpESet;

    /**
     * The default value of the '{@link #getRymn() <em>Rymn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRymn()
     * @generated
     * @ordered
     */
    protected static final Double RYMN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRymn() <em>Rymn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRymn()
     * @generated
     * @ordered
     */
    protected Double rymn = RYMN_EDEFAULT;

    /**
     * This is true if the Rymn attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rymnESet;

    /**
     * The default value of the '{@link #getRymx() <em>Rymx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRymx()
     * @generated
     * @ordered
     */
    protected static final Double RYMX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRymx() <em>Rymx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRymx()
     * @generated
     * @ordered
     */
    protected Double rymx = RYMX_EDEFAULT;

    /**
     * This is true if the Rymx attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rymxESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GovGAST4Impl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getGovGAST4();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getMxef() {
        return mxef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMxef( Double newMxef ) {
        Double oldMxef = mxef;
        mxef = newMxef;
        boolean oldMxefESet = mxefESet;
        mxefESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST4__MXEF, oldMxef, mxef,
                    !oldMxefESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMxef() {
        Double oldMxef = mxef;
        boolean oldMxefESet = mxefESet;
        mxef = MXEF_EDEFAULT;
        mxefESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_GAST4__MXEF, oldMxef,
                    MXEF_EDEFAULT, oldMxefESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMxef() {
        return mxefESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getMnef() {
        return mnef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMnef( Double newMnef ) {
        Double oldMnef = mnef;
        mnef = newMnef;
        boolean oldMnefESet = mnefESet;
        mnefESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST4__MNEF, oldMnef, mnef,
                    !oldMnefESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMnef() {
        Double oldMnef = mnef;
        boolean oldMnefESet = mnefESet;
        mnef = MNEF_EDEFAULT;
        mnefESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_GAST4__MNEF, oldMnef,
                    MNEF_EDEFAULT, oldMnefESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMnef() {
        return mnefESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTy() {
        return ty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTy( Double newTy ) {
        Double oldTy = ty;
        ty = newTy;
        boolean oldTyESet = tyESet;
        tyESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST4__TY, oldTy, ty, !oldTyESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTy() {
        Double oldTy = ty;
        boolean oldTyESet = tyESet;
        ty = TY_EDEFAULT;
        tyESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_GAST4__TY, oldTy, TY_EDEFAULT,
                    oldTyESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTy() {
        return tyESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTm() {
        return tm;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTm( Double newTm ) {
        Double oldTm = tm;
        tm = newTm;
        boolean oldTmESet = tmESet;
        tmESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST4__TM, oldTm, tm, !oldTmESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTm() {
        Double oldTm = tm;
        boolean oldTmESet = tmESet;
        tm = TM_EDEFAULT;
        tmESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_GAST4__TM, oldTm, TM_EDEFAULT,
                    oldTmESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTm() {
        return tmESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTc() {
        return tc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTc( Double newTc ) {
        Double oldTc = tc;
        tc = newTc;
        boolean oldTcESet = tcESet;
        tcESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST4__TC, oldTc, tc, !oldTcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTc() {
        Double oldTc = tc;
        boolean oldTcESet = tcESet;
        tc = TC_EDEFAULT;
        tcESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_GAST4__TC, oldTc, TC_EDEFAULT,
                    oldTcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTc() {
        return tcESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST4__TA, oldTa, ta, !oldTaESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_GAST4__TA, oldTa, TA_EDEFAULT,
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
    public Double getTcm() {
        return tcm;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTcm( Double newTcm ) {
        Double oldTcm = tcm;
        tcm = newTcm;
        boolean oldTcmESet = tcmESet;
        tcmESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST4__TCM, oldTcm, tcm,
                    !oldTcmESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTcm() {
        Double oldTcm = tcm;
        boolean oldTcmESet = tcmESet;
        tcm = TCM_EDEFAULT;
        tcmESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_GAST4__TCM, oldTcm, TCM_EDEFAULT,
                    oldTcmESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTcm() {
        return tcmESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKtm() {
        return ktm;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKtm( Double newKtm ) {
        Double oldKtm = ktm;
        ktm = newKtm;
        boolean oldKtmESet = ktmESet;
        ktmESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST4__KTM, oldKtm, ktm,
                    !oldKtmESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKtm() {
        Double oldKtm = ktm;
        boolean oldKtmESet = ktmESet;
        ktm = KTM_EDEFAULT;
        ktmESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_GAST4__KTM, oldKtm, KTM_EDEFAULT,
                    oldKtmESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKtm() {
        return ktmESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getBp() {
        return bp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBp( Double newBp ) {
        Double oldBp = bp;
        bp = newBp;
        boolean oldBpESet = bpESet;
        bpESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST4__BP, oldBp, bp, !oldBpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBp() {
        Double oldBp = bp;
        boolean oldBpESet = bpESet;
        bp = BP_EDEFAULT;
        bpESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_GAST4__BP, oldBp, BP_EDEFAULT,
                    oldBpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBp() {
        return bpESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getRymn() {
        return rymn;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRymn( Double newRymn ) {
        Double oldRymn = rymn;
        rymn = newRymn;
        boolean oldRymnESet = rymnESet;
        rymnESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST4__RYMN, oldRymn, rymn,
                    !oldRymnESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRymn() {
        Double oldRymn = rymn;
        boolean oldRymnESet = rymnESet;
        rymn = RYMN_EDEFAULT;
        rymnESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_GAST4__RYMN, oldRymn,
                    RYMN_EDEFAULT, oldRymnESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRymn() {
        return rymnESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getRymx() {
        return rymx;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRymx( Double newRymx ) {
        Double oldRymx = rymx;
        rymx = newRymx;
        boolean oldRymxESet = rymxESet;
        rymxESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_GAST4__RYMX, oldRymx, rymx,
                    !oldRymxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRymx() {
        Double oldRymx = rymx;
        boolean oldRymxESet = rymxESet;
        rymx = RYMX_EDEFAULT;
        rymxESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_GAST4__RYMX, oldRymx,
                    RYMX_EDEFAULT, oldRymxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRymx() {
        return rymxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.GOV_GAST4__MXEF:
            return getMxef();
        case CimPackage.GOV_GAST4__MNEF:
            return getMnef();
        case CimPackage.GOV_GAST4__TY:
            return getTy();
        case CimPackage.GOV_GAST4__TM:
            return getTm();
        case CimPackage.GOV_GAST4__TC:
            return getTc();
        case CimPackage.GOV_GAST4__TA:
            return getTa();
        case CimPackage.GOV_GAST4__TCM:
            return getTcm();
        case CimPackage.GOV_GAST4__KTM:
            return getKtm();
        case CimPackage.GOV_GAST4__BP:
            return getBp();
        case CimPackage.GOV_GAST4__RYMN:
            return getRymn();
        case CimPackage.GOV_GAST4__RYMX:
            return getRymx();
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
        case CimPackage.GOV_GAST4__MXEF:
            setMxef( ( Double ) newValue );
            return;
        case CimPackage.GOV_GAST4__MNEF:
            setMnef( ( Double ) newValue );
            return;
        case CimPackage.GOV_GAST4__TY:
            setTy( ( Double ) newValue );
            return;
        case CimPackage.GOV_GAST4__TM:
            setTm( ( Double ) newValue );
            return;
        case CimPackage.GOV_GAST4__TC:
            setTc( ( Double ) newValue );
            return;
        case CimPackage.GOV_GAST4__TA:
            setTa( ( Double ) newValue );
            return;
        case CimPackage.GOV_GAST4__TCM:
            setTcm( ( Double ) newValue );
            return;
        case CimPackage.GOV_GAST4__KTM:
            setKtm( ( Double ) newValue );
            return;
        case CimPackage.GOV_GAST4__BP:
            setBp( ( Double ) newValue );
            return;
        case CimPackage.GOV_GAST4__RYMN:
            setRymn( ( Double ) newValue );
            return;
        case CimPackage.GOV_GAST4__RYMX:
            setRymx( ( Double ) newValue );
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
        case CimPackage.GOV_GAST4__MXEF:
            unsetMxef();
            return;
        case CimPackage.GOV_GAST4__MNEF:
            unsetMnef();
            return;
        case CimPackage.GOV_GAST4__TY:
            unsetTy();
            return;
        case CimPackage.GOV_GAST4__TM:
            unsetTm();
            return;
        case CimPackage.GOV_GAST4__TC:
            unsetTc();
            return;
        case CimPackage.GOV_GAST4__TA:
            unsetTa();
            return;
        case CimPackage.GOV_GAST4__TCM:
            unsetTcm();
            return;
        case CimPackage.GOV_GAST4__KTM:
            unsetKtm();
            return;
        case CimPackage.GOV_GAST4__BP:
            unsetBp();
            return;
        case CimPackage.GOV_GAST4__RYMN:
            unsetRymn();
            return;
        case CimPackage.GOV_GAST4__RYMX:
            unsetRymx();
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
        case CimPackage.GOV_GAST4__MXEF:
            return isSetMxef();
        case CimPackage.GOV_GAST4__MNEF:
            return isSetMnef();
        case CimPackage.GOV_GAST4__TY:
            return isSetTy();
        case CimPackage.GOV_GAST4__TM:
            return isSetTm();
        case CimPackage.GOV_GAST4__TC:
            return isSetTc();
        case CimPackage.GOV_GAST4__TA:
            return isSetTa();
        case CimPackage.GOV_GAST4__TCM:
            return isSetTcm();
        case CimPackage.GOV_GAST4__KTM:
            return isSetKtm();
        case CimPackage.GOV_GAST4__BP:
            return isSetBp();
        case CimPackage.GOV_GAST4__RYMN:
            return isSetRymn();
        case CimPackage.GOV_GAST4__RYMX:
            return isSetRymx();
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
        result.append( " (mxef: " );
        if( mxefESet )
            result.append( mxef );
        else
            result.append( "<unset>" );
        result.append( ", mnef: " );
        if( mnefESet )
            result.append( mnef );
        else
            result.append( "<unset>" );
        result.append( ", ty: " );
        if( tyESet )
            result.append( ty );
        else
            result.append( "<unset>" );
        result.append( ", tm: " );
        if( tmESet )
            result.append( tm );
        else
            result.append( "<unset>" );
        result.append( ", tc: " );
        if( tcESet )
            result.append( tc );
        else
            result.append( "<unset>" );
        result.append( ", ta: " );
        if( taESet )
            result.append( ta );
        else
            result.append( "<unset>" );
        result.append( ", tcm: " );
        if( tcmESet )
            result.append( tcm );
        else
            result.append( "<unset>" );
        result.append( ", ktm: " );
        if( ktmESet )
            result.append( ktm );
        else
            result.append( "<unset>" );
        result.append( ", bp: " );
        if( bpESet )
            result.append( bp );
        else
            result.append( "<unset>" );
        result.append( ", rymn: " );
        if( rymnESet )
            result.append( rymn );
        else
            result.append( "<unset>" );
        result.append( ", rymx: " );
        if( rymxESet )
            result.append( rymx );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //GovGAST4Impl

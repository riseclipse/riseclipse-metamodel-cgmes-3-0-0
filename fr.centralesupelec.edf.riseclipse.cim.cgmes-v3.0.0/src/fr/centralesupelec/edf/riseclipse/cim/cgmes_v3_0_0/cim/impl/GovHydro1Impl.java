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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydro1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gov Hydro1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovHydro1Impl#getGmin <em>Gmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovHydro1Impl#getDturb <em>Dturb</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovHydro1Impl#getQnl <em>Qnl</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovHydro1Impl#getAt <em>At</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovHydro1Impl#getMwbase <em>Mwbase</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovHydro1Impl#getHdam <em>Hdam</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovHydro1Impl#getRtemp <em>Rtemp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovHydro1Impl#getVelm <em>Velm</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovHydro1Impl#getTg <em>Tg</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovHydro1Impl#getTf <em>Tf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovHydro1Impl#getTw <em>Tw</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovHydro1Impl#getTr <em>Tr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovHydro1Impl#getRperm <em>Rperm</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovHydro1Impl#getGmax <em>Gmax</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GovHydro1Impl extends TurbineGovernorDynamicsImpl implements GovHydro1 {
    /**
     * The default value of the '{@link #getGmin() <em>Gmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGmin()
     * @generated
     * @ordered
     */
    protected static final Double GMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGmin() <em>Gmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGmin()
     * @generated
     * @ordered
     */
    protected Double gmin = GMIN_EDEFAULT;

    /**
     * This is true if the Gmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean gminESet;

    /**
     * The default value of the '{@link #getDturb() <em>Dturb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDturb()
     * @generated
     * @ordered
     */
    protected static final Double DTURB_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDturb() <em>Dturb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDturb()
     * @generated
     * @ordered
     */
    protected Double dturb = DTURB_EDEFAULT;

    /**
     * This is true if the Dturb attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dturbESet;

    /**
     * The default value of the '{@link #getQnl() <em>Qnl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQnl()
     * @generated
     * @ordered
     */
    protected static final Double QNL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getQnl() <em>Qnl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQnl()
     * @generated
     * @ordered
     */
    protected Double qnl = QNL_EDEFAULT;

    /**
     * This is true if the Qnl attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean qnlESet;

    /**
     * The default value of the '{@link #getAt() <em>At</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAt()
     * @generated
     * @ordered
     */
    protected static final Double AT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAt() <em>At</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAt()
     * @generated
     * @ordered
     */
    protected Double at = AT_EDEFAULT;

    /**
     * This is true if the At attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean atESet;

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
     * The default value of the '{@link #getHdam() <em>Hdam</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHdam()
     * @generated
     * @ordered
     */
    protected static final Double HDAM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getHdam() <em>Hdam</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHdam()
     * @generated
     * @ordered
     */
    protected Double hdam = HDAM_EDEFAULT;

    /**
     * This is true if the Hdam attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean hdamESet;

    /**
     * The default value of the '{@link #getRtemp() <em>Rtemp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRtemp()
     * @generated
     * @ordered
     */
    protected static final Double RTEMP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRtemp() <em>Rtemp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRtemp()
     * @generated
     * @ordered
     */
    protected Double rtemp = RTEMP_EDEFAULT;

    /**
     * This is true if the Rtemp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rtempESet;

    /**
     * The default value of the '{@link #getVelm() <em>Velm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVelm()
     * @generated
     * @ordered
     */
    protected static final Double VELM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVelm() <em>Velm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVelm()
     * @generated
     * @ordered
     */
    protected Double velm = VELM_EDEFAULT;

    /**
     * This is true if the Velm attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean velmESet;

    /**
     * The default value of the '{@link #getTg() <em>Tg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTg()
     * @generated
     * @ordered
     */
    protected static final Double TG_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTg() <em>Tg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTg()
     * @generated
     * @ordered
     */
    protected Double tg = TG_EDEFAULT;

    /**
     * This is true if the Tg attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tgESet;

    /**
     * The default value of the '{@link #getTf() <em>Tf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTf()
     * @generated
     * @ordered
     */
    protected static final Double TF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTf() <em>Tf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTf()
     * @generated
     * @ordered
     */
    protected Double tf = TF_EDEFAULT;

    /**
     * This is true if the Tf attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tfESet;

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
     * The default value of the '{@link #getTr() <em>Tr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTr()
     * @generated
     * @ordered
     */
    protected static final Double TR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTr() <em>Tr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTr()
     * @generated
     * @ordered
     */
    protected Double tr = TR_EDEFAULT;

    /**
     * This is true if the Tr attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean trESet;

    /**
     * The default value of the '{@link #getRperm() <em>Rperm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRperm()
     * @generated
     * @ordered
     */
    protected static final Double RPERM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRperm() <em>Rperm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRperm()
     * @generated
     * @ordered
     */
    protected Double rperm = RPERM_EDEFAULT;

    /**
     * This is true if the Rperm attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rpermESet;

    /**
     * The default value of the '{@link #getGmax() <em>Gmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGmax()
     * @generated
     * @ordered
     */
    protected static final Double GMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGmax() <em>Gmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGmax()
     * @generated
     * @ordered
     */
    protected Double gmax = GMAX_EDEFAULT;

    /**
     * This is true if the Gmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean gmaxESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GovHydro1Impl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getGovHydro1();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getGmin() {
        return gmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGmin( Double newGmin ) {
        Double oldGmin = gmin;
        gmin = newGmin;
        boolean oldGminESet = gminESet;
        gminESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO1__GMIN, oldGmin, gmin,
                    !oldGminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGmin() {
        Double oldGmin = gmin;
        boolean oldGminESet = gminESet;
        gmin = GMIN_EDEFAULT;
        gminESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_HYDRO1__GMIN, oldGmin,
                    GMIN_EDEFAULT, oldGminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGmin() {
        return gminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getDturb() {
        return dturb;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDturb( Double newDturb ) {
        Double oldDturb = dturb;
        dturb = newDturb;
        boolean oldDturbESet = dturbESet;
        dturbESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO1__DTURB, oldDturb, dturb,
                    !oldDturbESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDturb() {
        Double oldDturb = dturb;
        boolean oldDturbESet = dturbESet;
        dturb = DTURB_EDEFAULT;
        dturbESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_HYDRO1__DTURB, oldDturb,
                    DTURB_EDEFAULT, oldDturbESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDturb() {
        return dturbESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getQnl() {
        return qnl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setQnl( Double newQnl ) {
        Double oldQnl = qnl;
        qnl = newQnl;
        boolean oldQnlESet = qnlESet;
        qnlESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO1__QNL, oldQnl, qnl,
                    !oldQnlESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetQnl() {
        Double oldQnl = qnl;
        boolean oldQnlESet = qnlESet;
        qnl = QNL_EDEFAULT;
        qnlESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_HYDRO1__QNL, oldQnl, QNL_EDEFAULT,
                    oldQnlESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetQnl() {
        return qnlESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getAt() {
        return at;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAt( Double newAt ) {
        Double oldAt = at;
        at = newAt;
        boolean oldAtESet = atESet;
        atESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO1__AT, oldAt, at,
                    !oldAtESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAt() {
        Double oldAt = at;
        boolean oldAtESet = atESet;
        at = AT_EDEFAULT;
        atESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_HYDRO1__AT, oldAt, AT_EDEFAULT,
                    oldAtESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAt() {
        return atESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO1__MWBASE, oldMwbase, mwbase,
                    !oldMwbaseESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_HYDRO1__MWBASE, oldMwbase,
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
    public Double getHdam() {
        return hdam;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setHdam( Double newHdam ) {
        Double oldHdam = hdam;
        hdam = newHdam;
        boolean oldHdamESet = hdamESet;
        hdamESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO1__HDAM, oldHdam, hdam,
                    !oldHdamESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetHdam() {
        Double oldHdam = hdam;
        boolean oldHdamESet = hdamESet;
        hdam = HDAM_EDEFAULT;
        hdamESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_HYDRO1__HDAM, oldHdam,
                    HDAM_EDEFAULT, oldHdamESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetHdam() {
        return hdamESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getRtemp() {
        return rtemp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRtemp( Double newRtemp ) {
        Double oldRtemp = rtemp;
        rtemp = newRtemp;
        boolean oldRtempESet = rtempESet;
        rtempESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO1__RTEMP, oldRtemp, rtemp,
                    !oldRtempESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRtemp() {
        Double oldRtemp = rtemp;
        boolean oldRtempESet = rtempESet;
        rtemp = RTEMP_EDEFAULT;
        rtempESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_HYDRO1__RTEMP, oldRtemp,
                    RTEMP_EDEFAULT, oldRtempESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRtemp() {
        return rtempESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVelm() {
        return velm;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVelm( Double newVelm ) {
        Double oldVelm = velm;
        velm = newVelm;
        boolean oldVelmESet = velmESet;
        velmESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO1__VELM, oldVelm, velm,
                    !oldVelmESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVelm() {
        Double oldVelm = velm;
        boolean oldVelmESet = velmESet;
        velm = VELM_EDEFAULT;
        velmESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_HYDRO1__VELM, oldVelm,
                    VELM_EDEFAULT, oldVelmESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVelm() {
        return velmESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTg() {
        return tg;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTg( Double newTg ) {
        Double oldTg = tg;
        tg = newTg;
        boolean oldTgESet = tgESet;
        tgESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO1__TG, oldTg, tg,
                    !oldTgESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTg() {
        Double oldTg = tg;
        boolean oldTgESet = tgESet;
        tg = TG_EDEFAULT;
        tgESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_HYDRO1__TG, oldTg, TG_EDEFAULT,
                    oldTgESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTg() {
        return tgESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTf() {
        return tf;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTf( Double newTf ) {
        Double oldTf = tf;
        tf = newTf;
        boolean oldTfESet = tfESet;
        tfESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO1__TF, oldTf, tf,
                    !oldTfESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTf() {
        Double oldTf = tf;
        boolean oldTfESet = tfESet;
        tf = TF_EDEFAULT;
        tfESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_HYDRO1__TF, oldTf, TF_EDEFAULT,
                    oldTfESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTf() {
        return tfESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO1__TW, oldTw, tw,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_HYDRO1__TW, oldTw, TW_EDEFAULT,
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
    public Double getTr() {
        return tr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTr( Double newTr ) {
        Double oldTr = tr;
        tr = newTr;
        boolean oldTrESet = trESet;
        trESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO1__TR, oldTr, tr,
                    !oldTrESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTr() {
        Double oldTr = tr;
        boolean oldTrESet = trESet;
        tr = TR_EDEFAULT;
        trESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_HYDRO1__TR, oldTr, TR_EDEFAULT,
                    oldTrESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTr() {
        return trESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getRperm() {
        return rperm;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRperm( Double newRperm ) {
        Double oldRperm = rperm;
        rperm = newRperm;
        boolean oldRpermESet = rpermESet;
        rpermESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO1__RPERM, oldRperm, rperm,
                    !oldRpermESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRperm() {
        Double oldRperm = rperm;
        boolean oldRpermESet = rpermESet;
        rperm = RPERM_EDEFAULT;
        rpermESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_HYDRO1__RPERM, oldRperm,
                    RPERM_EDEFAULT, oldRpermESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRperm() {
        return rpermESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getGmax() {
        return gmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGmax( Double newGmax ) {
        Double oldGmax = gmax;
        gmax = newGmax;
        boolean oldGmaxESet = gmaxESet;
        gmaxESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_HYDRO1__GMAX, oldGmax, gmax,
                    !oldGmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGmax() {
        Double oldGmax = gmax;
        boolean oldGmaxESet = gmaxESet;
        gmax = GMAX_EDEFAULT;
        gmaxESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_HYDRO1__GMAX, oldGmax,
                    GMAX_EDEFAULT, oldGmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGmax() {
        return gmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.GOV_HYDRO1__GMIN:
            return getGmin();
        case CimPackage.GOV_HYDRO1__DTURB:
            return getDturb();
        case CimPackage.GOV_HYDRO1__QNL:
            return getQnl();
        case CimPackage.GOV_HYDRO1__AT:
            return getAt();
        case CimPackage.GOV_HYDRO1__MWBASE:
            return getMwbase();
        case CimPackage.GOV_HYDRO1__HDAM:
            return getHdam();
        case CimPackage.GOV_HYDRO1__RTEMP:
            return getRtemp();
        case CimPackage.GOV_HYDRO1__VELM:
            return getVelm();
        case CimPackage.GOV_HYDRO1__TG:
            return getTg();
        case CimPackage.GOV_HYDRO1__TF:
            return getTf();
        case CimPackage.GOV_HYDRO1__TW:
            return getTw();
        case CimPackage.GOV_HYDRO1__TR:
            return getTr();
        case CimPackage.GOV_HYDRO1__RPERM:
            return getRperm();
        case CimPackage.GOV_HYDRO1__GMAX:
            return getGmax();
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
        case CimPackage.GOV_HYDRO1__GMIN:
            setGmin( ( Double ) newValue );
            return;
        case CimPackage.GOV_HYDRO1__DTURB:
            setDturb( ( Double ) newValue );
            return;
        case CimPackage.GOV_HYDRO1__QNL:
            setQnl( ( Double ) newValue );
            return;
        case CimPackage.GOV_HYDRO1__AT:
            setAt( ( Double ) newValue );
            return;
        case CimPackage.GOV_HYDRO1__MWBASE:
            setMwbase( ( Double ) newValue );
            return;
        case CimPackage.GOV_HYDRO1__HDAM:
            setHdam( ( Double ) newValue );
            return;
        case CimPackage.GOV_HYDRO1__RTEMP:
            setRtemp( ( Double ) newValue );
            return;
        case CimPackage.GOV_HYDRO1__VELM:
            setVelm( ( Double ) newValue );
            return;
        case CimPackage.GOV_HYDRO1__TG:
            setTg( ( Double ) newValue );
            return;
        case CimPackage.GOV_HYDRO1__TF:
            setTf( ( Double ) newValue );
            return;
        case CimPackage.GOV_HYDRO1__TW:
            setTw( ( Double ) newValue );
            return;
        case CimPackage.GOV_HYDRO1__TR:
            setTr( ( Double ) newValue );
            return;
        case CimPackage.GOV_HYDRO1__RPERM:
            setRperm( ( Double ) newValue );
            return;
        case CimPackage.GOV_HYDRO1__GMAX:
            setGmax( ( Double ) newValue );
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
        case CimPackage.GOV_HYDRO1__GMIN:
            unsetGmin();
            return;
        case CimPackage.GOV_HYDRO1__DTURB:
            unsetDturb();
            return;
        case CimPackage.GOV_HYDRO1__QNL:
            unsetQnl();
            return;
        case CimPackage.GOV_HYDRO1__AT:
            unsetAt();
            return;
        case CimPackage.GOV_HYDRO1__MWBASE:
            unsetMwbase();
            return;
        case CimPackage.GOV_HYDRO1__HDAM:
            unsetHdam();
            return;
        case CimPackage.GOV_HYDRO1__RTEMP:
            unsetRtemp();
            return;
        case CimPackage.GOV_HYDRO1__VELM:
            unsetVelm();
            return;
        case CimPackage.GOV_HYDRO1__TG:
            unsetTg();
            return;
        case CimPackage.GOV_HYDRO1__TF:
            unsetTf();
            return;
        case CimPackage.GOV_HYDRO1__TW:
            unsetTw();
            return;
        case CimPackage.GOV_HYDRO1__TR:
            unsetTr();
            return;
        case CimPackage.GOV_HYDRO1__RPERM:
            unsetRperm();
            return;
        case CimPackage.GOV_HYDRO1__GMAX:
            unsetGmax();
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
        case CimPackage.GOV_HYDRO1__GMIN:
            return isSetGmin();
        case CimPackage.GOV_HYDRO1__DTURB:
            return isSetDturb();
        case CimPackage.GOV_HYDRO1__QNL:
            return isSetQnl();
        case CimPackage.GOV_HYDRO1__AT:
            return isSetAt();
        case CimPackage.GOV_HYDRO1__MWBASE:
            return isSetMwbase();
        case CimPackage.GOV_HYDRO1__HDAM:
            return isSetHdam();
        case CimPackage.GOV_HYDRO1__RTEMP:
            return isSetRtemp();
        case CimPackage.GOV_HYDRO1__VELM:
            return isSetVelm();
        case CimPackage.GOV_HYDRO1__TG:
            return isSetTg();
        case CimPackage.GOV_HYDRO1__TF:
            return isSetTf();
        case CimPackage.GOV_HYDRO1__TW:
            return isSetTw();
        case CimPackage.GOV_HYDRO1__TR:
            return isSetTr();
        case CimPackage.GOV_HYDRO1__RPERM:
            return isSetRperm();
        case CimPackage.GOV_HYDRO1__GMAX:
            return isSetGmax();
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
        result.append( " (gmin: " );
        if( gminESet )
            result.append( gmin );
        else
            result.append( "<unset>" );
        result.append( ", dturb: " );
        if( dturbESet )
            result.append( dturb );
        else
            result.append( "<unset>" );
        result.append( ", qnl: " );
        if( qnlESet )
            result.append( qnl );
        else
            result.append( "<unset>" );
        result.append( ", at: " );
        if( atESet )
            result.append( at );
        else
            result.append( "<unset>" );
        result.append( ", mwbase: " );
        if( mwbaseESet )
            result.append( mwbase );
        else
            result.append( "<unset>" );
        result.append( ", hdam: " );
        if( hdamESet )
            result.append( hdam );
        else
            result.append( "<unset>" );
        result.append( ", rtemp: " );
        if( rtempESet )
            result.append( rtemp );
        else
            result.append( "<unset>" );
        result.append( ", velm: " );
        if( velmESet )
            result.append( velm );
        else
            result.append( "<unset>" );
        result.append( ", tg: " );
        if( tgESet )
            result.append( tg );
        else
            result.append( "<unset>" );
        result.append( ", tf: " );
        if( tfESet )
            result.append( tf );
        else
            result.append( "<unset>" );
        result.append( ", tw: " );
        if( twESet )
            result.append( tw );
        else
            result.append( "<unset>" );
        result.append( ", tr: " );
        if( trESet )
            result.append( tr );
        else
            result.append( "<unset>" );
        result.append( ", rperm: " );
        if( rpermESet )
            result.append( rperm );
        else
            result.append( "<unset>" );
        result.append( ", gmax: " );
        if( gmaxESet )
            result.append( gmax );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //GovHydro1Impl

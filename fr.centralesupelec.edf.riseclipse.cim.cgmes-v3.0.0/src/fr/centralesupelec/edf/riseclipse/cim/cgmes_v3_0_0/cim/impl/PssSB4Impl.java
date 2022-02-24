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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssSB4;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pss SB4</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssSB4Impl#getVsmin <em>Vsmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssSB4Impl#getVsmax <em>Vsmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssSB4Impl#getTx2 <em>Tx2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssSB4Impl#getTx1 <em>Tx1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssSB4Impl#getTb <em>Tb</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssSB4Impl#getTa <em>Ta</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssSB4Impl#getTd <em>Td</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssSB4Impl#getTc <em>Tc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssSB4Impl#getTe <em>Te</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssSB4Impl#getTt <em>Tt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssSB4Impl#getKx <em>Kx</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PssSB4Impl extends PowerSystemStabilizerDynamicsImpl implements PssSB4 {
    /**
     * The default value of the '{@link #getVsmin() <em>Vsmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVsmin()
     * @generated
     * @ordered
     */
    protected static final Double VSMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVsmin() <em>Vsmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVsmin()
     * @generated
     * @ordered
     */
    protected Double vsmin = VSMIN_EDEFAULT;

    /**
     * This is true if the Vsmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vsminESet;

    /**
     * The default value of the '{@link #getVsmax() <em>Vsmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVsmax()
     * @generated
     * @ordered
     */
    protected static final Double VSMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVsmax() <em>Vsmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVsmax()
     * @generated
     * @ordered
     */
    protected Double vsmax = VSMAX_EDEFAULT;

    /**
     * This is true if the Vsmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vsmaxESet;

    /**
     * The default value of the '{@link #getTx2() <em>Tx2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTx2()
     * @generated
     * @ordered
     */
    protected static final Double TX2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTx2() <em>Tx2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTx2()
     * @generated
     * @ordered
     */
    protected Double tx2 = TX2_EDEFAULT;

    /**
     * This is true if the Tx2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tx2ESet;

    /**
     * The default value of the '{@link #getTx1() <em>Tx1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTx1()
     * @generated
     * @ordered
     */
    protected static final Double TX1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTx1() <em>Tx1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTx1()
     * @generated
     * @ordered
     */
    protected Double tx1 = TX1_EDEFAULT;

    /**
     * This is true if the Tx1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tx1ESet;

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
     * The default value of the '{@link #getTe() <em>Te</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTe()
     * @generated
     * @ordered
     */
    protected static final Double TE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTe() <em>Te</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTe()
     * @generated
     * @ordered
     */
    protected Double te = TE_EDEFAULT;

    /**
     * This is true if the Te attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean teESet;

    /**
     * The default value of the '{@link #getTt() <em>Tt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTt()
     * @generated
     * @ordered
     */
    protected static final Double TT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTt() <em>Tt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTt()
     * @generated
     * @ordered
     */
    protected Double tt = TT_EDEFAULT;

    /**
     * This is true if the Tt attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ttESet;

    /**
     * The default value of the '{@link #getKx() <em>Kx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKx()
     * @generated
     * @ordered
     */
    protected static final Double KX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKx() <em>Kx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKx()
     * @generated
     * @ordered
     */
    protected Double kx = KX_EDEFAULT;

    /**
     * This is true if the Kx attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kxESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PssSB4Impl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getPssSB4();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVsmin() {
        return vsmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVsmin( Double newVsmin ) {
        Double oldVsmin = vsmin;
        vsmin = newVsmin;
        boolean oldVsminESet = vsminESet;
        vsminESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_SB4__VSMIN, oldVsmin, vsmin,
                    !oldVsminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVsmin() {
        Double oldVsmin = vsmin;
        boolean oldVsminESet = vsminESet;
        vsmin = VSMIN_EDEFAULT;
        vsminESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_SB4__VSMIN, oldVsmin,
                    VSMIN_EDEFAULT, oldVsminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVsmin() {
        return vsminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVsmax() {
        return vsmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVsmax( Double newVsmax ) {
        Double oldVsmax = vsmax;
        vsmax = newVsmax;
        boolean oldVsmaxESet = vsmaxESet;
        vsmaxESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_SB4__VSMAX, oldVsmax, vsmax,
                    !oldVsmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVsmax() {
        Double oldVsmax = vsmax;
        boolean oldVsmaxESet = vsmaxESet;
        vsmax = VSMAX_EDEFAULT;
        vsmaxESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_SB4__VSMAX, oldVsmax,
                    VSMAX_EDEFAULT, oldVsmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVsmax() {
        return vsmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTx2() {
        return tx2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTx2( Double newTx2 ) {
        Double oldTx2 = tx2;
        tx2 = newTx2;
        boolean oldTx2ESet = tx2ESet;
        tx2ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_SB4__TX2, oldTx2, tx2,
                    !oldTx2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTx2() {
        Double oldTx2 = tx2;
        boolean oldTx2ESet = tx2ESet;
        tx2 = TX2_EDEFAULT;
        tx2ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_SB4__TX2, oldTx2, TX2_EDEFAULT,
                    oldTx2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTx2() {
        return tx2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTx1() {
        return tx1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTx1( Double newTx1 ) {
        Double oldTx1 = tx1;
        tx1 = newTx1;
        boolean oldTx1ESet = tx1ESet;
        tx1ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_SB4__TX1, oldTx1, tx1,
                    !oldTx1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTx1() {
        Double oldTx1 = tx1;
        boolean oldTx1ESet = tx1ESet;
        tx1 = TX1_EDEFAULT;
        tx1ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_SB4__TX1, oldTx1, TX1_EDEFAULT,
                    oldTx1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTx1() {
        return tx1ESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_SB4__TB, oldTb, tb, !oldTbESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_SB4__TB, oldTb, TB_EDEFAULT,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_SB4__TA, oldTa, ta, !oldTaESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_SB4__TA, oldTa, TA_EDEFAULT,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_SB4__TD, oldTd, td, !oldTdESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_SB4__TD, oldTd, TD_EDEFAULT,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_SB4__TC, oldTc, tc, !oldTcESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_SB4__TC, oldTc, TC_EDEFAULT,
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
    public Double getTe() {
        return te;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTe( Double newTe ) {
        Double oldTe = te;
        te = newTe;
        boolean oldTeESet = teESet;
        teESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_SB4__TE, oldTe, te, !oldTeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTe() {
        Double oldTe = te;
        boolean oldTeESet = teESet;
        te = TE_EDEFAULT;
        teESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_SB4__TE, oldTe, TE_EDEFAULT,
                    oldTeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTe() {
        return teESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTt() {
        return tt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTt( Double newTt ) {
        Double oldTt = tt;
        tt = newTt;
        boolean oldTtESet = ttESet;
        ttESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_SB4__TT, oldTt, tt, !oldTtESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTt() {
        Double oldTt = tt;
        boolean oldTtESet = ttESet;
        tt = TT_EDEFAULT;
        ttESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_SB4__TT, oldTt, TT_EDEFAULT,
                    oldTtESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTt() {
        return ttESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKx() {
        return kx;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKx( Double newKx ) {
        Double oldKx = kx;
        kx = newKx;
        boolean oldKxESet = kxESet;
        kxESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_SB4__KX, oldKx, kx, !oldKxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKx() {
        Double oldKx = kx;
        boolean oldKxESet = kxESet;
        kx = KX_EDEFAULT;
        kxESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_SB4__KX, oldKx, KX_EDEFAULT,
                    oldKxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKx() {
        return kxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.PSS_SB4__VSMIN:
            return getVsmin();
        case CimPackage.PSS_SB4__VSMAX:
            return getVsmax();
        case CimPackage.PSS_SB4__TX2:
            return getTx2();
        case CimPackage.PSS_SB4__TX1:
            return getTx1();
        case CimPackage.PSS_SB4__TB:
            return getTb();
        case CimPackage.PSS_SB4__TA:
            return getTa();
        case CimPackage.PSS_SB4__TD:
            return getTd();
        case CimPackage.PSS_SB4__TC:
            return getTc();
        case CimPackage.PSS_SB4__TE:
            return getTe();
        case CimPackage.PSS_SB4__TT:
            return getTt();
        case CimPackage.PSS_SB4__KX:
            return getKx();
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
        case CimPackage.PSS_SB4__VSMIN:
            setVsmin( ( Double ) newValue );
            return;
        case CimPackage.PSS_SB4__VSMAX:
            setVsmax( ( Double ) newValue );
            return;
        case CimPackage.PSS_SB4__TX2:
            setTx2( ( Double ) newValue );
            return;
        case CimPackage.PSS_SB4__TX1:
            setTx1( ( Double ) newValue );
            return;
        case CimPackage.PSS_SB4__TB:
            setTb( ( Double ) newValue );
            return;
        case CimPackage.PSS_SB4__TA:
            setTa( ( Double ) newValue );
            return;
        case CimPackage.PSS_SB4__TD:
            setTd( ( Double ) newValue );
            return;
        case CimPackage.PSS_SB4__TC:
            setTc( ( Double ) newValue );
            return;
        case CimPackage.PSS_SB4__TE:
            setTe( ( Double ) newValue );
            return;
        case CimPackage.PSS_SB4__TT:
            setTt( ( Double ) newValue );
            return;
        case CimPackage.PSS_SB4__KX:
            setKx( ( Double ) newValue );
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
        case CimPackage.PSS_SB4__VSMIN:
            unsetVsmin();
            return;
        case CimPackage.PSS_SB4__VSMAX:
            unsetVsmax();
            return;
        case CimPackage.PSS_SB4__TX2:
            unsetTx2();
            return;
        case CimPackage.PSS_SB4__TX1:
            unsetTx1();
            return;
        case CimPackage.PSS_SB4__TB:
            unsetTb();
            return;
        case CimPackage.PSS_SB4__TA:
            unsetTa();
            return;
        case CimPackage.PSS_SB4__TD:
            unsetTd();
            return;
        case CimPackage.PSS_SB4__TC:
            unsetTc();
            return;
        case CimPackage.PSS_SB4__TE:
            unsetTe();
            return;
        case CimPackage.PSS_SB4__TT:
            unsetTt();
            return;
        case CimPackage.PSS_SB4__KX:
            unsetKx();
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
        case CimPackage.PSS_SB4__VSMIN:
            return isSetVsmin();
        case CimPackage.PSS_SB4__VSMAX:
            return isSetVsmax();
        case CimPackage.PSS_SB4__TX2:
            return isSetTx2();
        case CimPackage.PSS_SB4__TX1:
            return isSetTx1();
        case CimPackage.PSS_SB4__TB:
            return isSetTb();
        case CimPackage.PSS_SB4__TA:
            return isSetTa();
        case CimPackage.PSS_SB4__TD:
            return isSetTd();
        case CimPackage.PSS_SB4__TC:
            return isSetTc();
        case CimPackage.PSS_SB4__TE:
            return isSetTe();
        case CimPackage.PSS_SB4__TT:
            return isSetTt();
        case CimPackage.PSS_SB4__KX:
            return isSetKx();
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
        result.append( " (vsmin: " );
        if( vsminESet )
            result.append( vsmin );
        else
            result.append( "<unset>" );
        result.append( ", vsmax: " );
        if( vsmaxESet )
            result.append( vsmax );
        else
            result.append( "<unset>" );
        result.append( ", tx2: " );
        if( tx2ESet )
            result.append( tx2 );
        else
            result.append( "<unset>" );
        result.append( ", tx1: " );
        if( tx1ESet )
            result.append( tx1 );
        else
            result.append( "<unset>" );
        result.append( ", tb: " );
        if( tbESet )
            result.append( tb );
        else
            result.append( "<unset>" );
        result.append( ", ta: " );
        if( taESet )
            result.append( ta );
        else
            result.append( "<unset>" );
        result.append( ", td: " );
        if( tdESet )
            result.append( td );
        else
            result.append( "<unset>" );
        result.append( ", tc: " );
        if( tcESet )
            result.append( tc );
        else
            result.append( "<unset>" );
        result.append( ", te: " );
        if( teESet )
            result.append( te );
        else
            result.append( "<unset>" );
        result.append( ", tt: " );
        if( ttESet )
            result.append( tt );
        else
            result.append( "<unset>" );
        result.append( ", kx: " );
        if( kxESet )
            result.append( kx );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //PssSB4Impl

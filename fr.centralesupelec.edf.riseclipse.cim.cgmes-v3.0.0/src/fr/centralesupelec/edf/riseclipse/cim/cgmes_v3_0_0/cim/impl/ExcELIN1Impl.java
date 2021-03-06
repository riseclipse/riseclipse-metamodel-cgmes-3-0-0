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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcELIN1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exc ELIN1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcELIN1Impl#getSmax <em>Smax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcELIN1Impl#getTfi <em>Tfi</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcELIN1Impl#getTnu <em>Tnu</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcELIN1Impl#getTs1 <em>Ts1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcELIN1Impl#getTs2 <em>Ts2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcELIN1Impl#getTsw <em>Tsw</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcELIN1Impl#getKs1 <em>Ks1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcELIN1Impl#getKs2 <em>Ks2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcELIN1Impl#getDpnf <em>Dpnf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcELIN1Impl#getXe <em>Xe</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcELIN1Impl#getEfmin <em>Efmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcELIN1Impl#getVpnf <em>Vpnf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcELIN1Impl#getEfmax <em>Efmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcELIN1Impl#getVpu <em>Vpu</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcELIN1Impl#getVpi <em>Vpi</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExcELIN1Impl extends ExcitationSystemDynamicsImpl implements ExcELIN1 {
    /**
     * The default value of the '{@link #getSmax() <em>Smax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSmax()
     * @generated
     * @ordered
     */
    protected static final Double SMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSmax() <em>Smax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSmax()
     * @generated
     * @ordered
     */
    protected Double smax = SMAX_EDEFAULT;

    /**
     * This is true if the Smax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean smaxESet;

    /**
     * The default value of the '{@link #getTfi() <em>Tfi</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTfi()
     * @generated
     * @ordered
     */
    protected static final Double TFI_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTfi() <em>Tfi</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTfi()
     * @generated
     * @ordered
     */
    protected Double tfi = TFI_EDEFAULT;

    /**
     * This is true if the Tfi attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tfiESet;

    /**
     * The default value of the '{@link #getTnu() <em>Tnu</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTnu()
     * @generated
     * @ordered
     */
    protected static final Double TNU_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTnu() <em>Tnu</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTnu()
     * @generated
     * @ordered
     */
    protected Double tnu = TNU_EDEFAULT;

    /**
     * This is true if the Tnu attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tnuESet;

    /**
     * The default value of the '{@link #getTs1() <em>Ts1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTs1()
     * @generated
     * @ordered
     */
    protected static final Double TS1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTs1() <em>Ts1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTs1()
     * @generated
     * @ordered
     */
    protected Double ts1 = TS1_EDEFAULT;

    /**
     * This is true if the Ts1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ts1ESet;

    /**
     * The default value of the '{@link #getTs2() <em>Ts2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTs2()
     * @generated
     * @ordered
     */
    protected static final Double TS2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTs2() <em>Ts2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTs2()
     * @generated
     * @ordered
     */
    protected Double ts2 = TS2_EDEFAULT;

    /**
     * This is true if the Ts2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ts2ESet;

    /**
     * The default value of the '{@link #getTsw() <em>Tsw</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTsw()
     * @generated
     * @ordered
     */
    protected static final Double TSW_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTsw() <em>Tsw</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTsw()
     * @generated
     * @ordered
     */
    protected Double tsw = TSW_EDEFAULT;

    /**
     * This is true if the Tsw attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tswESet;

    /**
     * The default value of the '{@link #getKs1() <em>Ks1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKs1()
     * @generated
     * @ordered
     */
    protected static final Double KS1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKs1() <em>Ks1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKs1()
     * @generated
     * @ordered
     */
    protected Double ks1 = KS1_EDEFAULT;

    /**
     * This is true if the Ks1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ks1ESet;

    /**
     * The default value of the '{@link #getKs2() <em>Ks2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKs2()
     * @generated
     * @ordered
     */
    protected static final Double KS2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKs2() <em>Ks2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKs2()
     * @generated
     * @ordered
     */
    protected Double ks2 = KS2_EDEFAULT;

    /**
     * This is true if the Ks2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ks2ESet;

    /**
     * The default value of the '{@link #getDpnf() <em>Dpnf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDpnf()
     * @generated
     * @ordered
     */
    protected static final Double DPNF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDpnf() <em>Dpnf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDpnf()
     * @generated
     * @ordered
     */
    protected Double dpnf = DPNF_EDEFAULT;

    /**
     * This is true if the Dpnf attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dpnfESet;

    /**
     * The default value of the '{@link #getXe() <em>Xe</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXe()
     * @generated
     * @ordered
     */
    protected static final Double XE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getXe() <em>Xe</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXe()
     * @generated
     * @ordered
     */
    protected Double xe = XE_EDEFAULT;

    /**
     * This is true if the Xe attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xeESet;

    /**
     * The default value of the '{@link #getEfmin() <em>Efmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEfmin()
     * @generated
     * @ordered
     */
    protected static final Double EFMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEfmin() <em>Efmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEfmin()
     * @generated
     * @ordered
     */
    protected Double efmin = EFMIN_EDEFAULT;

    /**
     * This is true if the Efmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean efminESet;

    /**
     * The default value of the '{@link #getVpnf() <em>Vpnf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVpnf()
     * @generated
     * @ordered
     */
    protected static final Double VPNF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVpnf() <em>Vpnf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVpnf()
     * @generated
     * @ordered
     */
    protected Double vpnf = VPNF_EDEFAULT;

    /**
     * This is true if the Vpnf attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vpnfESet;

    /**
     * The default value of the '{@link #getEfmax() <em>Efmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEfmax()
     * @generated
     * @ordered
     */
    protected static final Double EFMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEfmax() <em>Efmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEfmax()
     * @generated
     * @ordered
     */
    protected Double efmax = EFMAX_EDEFAULT;

    /**
     * This is true if the Efmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean efmaxESet;

    /**
     * The default value of the '{@link #getVpu() <em>Vpu</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVpu()
     * @generated
     * @ordered
     */
    protected static final Double VPU_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVpu() <em>Vpu</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVpu()
     * @generated
     * @ordered
     */
    protected Double vpu = VPU_EDEFAULT;

    /**
     * This is true if the Vpu attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vpuESet;

    /**
     * The default value of the '{@link #getVpi() <em>Vpi</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVpi()
     * @generated
     * @ordered
     */
    protected static final Double VPI_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVpi() <em>Vpi</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVpi()
     * @generated
     * @ordered
     */
    protected Double vpi = VPI_EDEFAULT;

    /**
     * This is true if the Vpi attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vpiESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExcELIN1Impl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getExcELIN1();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getSmax() {
        return smax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSmax( Double newSmax ) {
        Double oldSmax = smax;
        smax = newSmax;
        boolean oldSmaxESet = smaxESet;
        smaxESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ELIN1__SMAX, oldSmax, smax,
                    !oldSmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSmax() {
        Double oldSmax = smax;
        boolean oldSmaxESet = smaxESet;
        smax = SMAX_EDEFAULT;
        smaxESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ELIN1__SMAX, oldSmax,
                    SMAX_EDEFAULT, oldSmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSmax() {
        return smaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTfi() {
        return tfi;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTfi( Double newTfi ) {
        Double oldTfi = tfi;
        tfi = newTfi;
        boolean oldTfiESet = tfiESet;
        tfiESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ELIN1__TFI, oldTfi, tfi,
                    !oldTfiESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTfi() {
        Double oldTfi = tfi;
        boolean oldTfiESet = tfiESet;
        tfi = TFI_EDEFAULT;
        tfiESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ELIN1__TFI, oldTfi, TFI_EDEFAULT,
                    oldTfiESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTfi() {
        return tfiESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTnu() {
        return tnu;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTnu( Double newTnu ) {
        Double oldTnu = tnu;
        tnu = newTnu;
        boolean oldTnuESet = tnuESet;
        tnuESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ELIN1__TNU, oldTnu, tnu,
                    !oldTnuESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTnu() {
        Double oldTnu = tnu;
        boolean oldTnuESet = tnuESet;
        tnu = TNU_EDEFAULT;
        tnuESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ELIN1__TNU, oldTnu, TNU_EDEFAULT,
                    oldTnuESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTnu() {
        return tnuESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTs1() {
        return ts1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTs1( Double newTs1 ) {
        Double oldTs1 = ts1;
        ts1 = newTs1;
        boolean oldTs1ESet = ts1ESet;
        ts1ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ELIN1__TS1, oldTs1, ts1,
                    !oldTs1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTs1() {
        Double oldTs1 = ts1;
        boolean oldTs1ESet = ts1ESet;
        ts1 = TS1_EDEFAULT;
        ts1ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ELIN1__TS1, oldTs1, TS1_EDEFAULT,
                    oldTs1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTs1() {
        return ts1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTs2() {
        return ts2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTs2( Double newTs2 ) {
        Double oldTs2 = ts2;
        ts2 = newTs2;
        boolean oldTs2ESet = ts2ESet;
        ts2ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ELIN1__TS2, oldTs2, ts2,
                    !oldTs2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTs2() {
        Double oldTs2 = ts2;
        boolean oldTs2ESet = ts2ESet;
        ts2 = TS2_EDEFAULT;
        ts2ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ELIN1__TS2, oldTs2, TS2_EDEFAULT,
                    oldTs2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTs2() {
        return ts2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTsw() {
        return tsw;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTsw( Double newTsw ) {
        Double oldTsw = tsw;
        tsw = newTsw;
        boolean oldTswESet = tswESet;
        tswESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ELIN1__TSW, oldTsw, tsw,
                    !oldTswESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTsw() {
        Double oldTsw = tsw;
        boolean oldTswESet = tswESet;
        tsw = TSW_EDEFAULT;
        tswESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ELIN1__TSW, oldTsw, TSW_EDEFAULT,
                    oldTswESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTsw() {
        return tswESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKs1() {
        return ks1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKs1( Double newKs1 ) {
        Double oldKs1 = ks1;
        ks1 = newKs1;
        boolean oldKs1ESet = ks1ESet;
        ks1ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ELIN1__KS1, oldKs1, ks1,
                    !oldKs1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKs1() {
        Double oldKs1 = ks1;
        boolean oldKs1ESet = ks1ESet;
        ks1 = KS1_EDEFAULT;
        ks1ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ELIN1__KS1, oldKs1, KS1_EDEFAULT,
                    oldKs1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKs1() {
        return ks1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKs2() {
        return ks2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKs2( Double newKs2 ) {
        Double oldKs2 = ks2;
        ks2 = newKs2;
        boolean oldKs2ESet = ks2ESet;
        ks2ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ELIN1__KS2, oldKs2, ks2,
                    !oldKs2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKs2() {
        Double oldKs2 = ks2;
        boolean oldKs2ESet = ks2ESet;
        ks2 = KS2_EDEFAULT;
        ks2ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ELIN1__KS2, oldKs2, KS2_EDEFAULT,
                    oldKs2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKs2() {
        return ks2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getDpnf() {
        return dpnf;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDpnf( Double newDpnf ) {
        Double oldDpnf = dpnf;
        dpnf = newDpnf;
        boolean oldDpnfESet = dpnfESet;
        dpnfESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ELIN1__DPNF, oldDpnf, dpnf,
                    !oldDpnfESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDpnf() {
        Double oldDpnf = dpnf;
        boolean oldDpnfESet = dpnfESet;
        dpnf = DPNF_EDEFAULT;
        dpnfESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ELIN1__DPNF, oldDpnf,
                    DPNF_EDEFAULT, oldDpnfESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDpnf() {
        return dpnfESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getXe() {
        return xe;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setXe( Double newXe ) {
        Double oldXe = xe;
        xe = newXe;
        boolean oldXeESet = xeESet;
        xeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ELIN1__XE, oldXe, xe, !oldXeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetXe() {
        Double oldXe = xe;
        boolean oldXeESet = xeESet;
        xe = XE_EDEFAULT;
        xeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ELIN1__XE, oldXe, XE_EDEFAULT,
                    oldXeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetXe() {
        return xeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getEfmin() {
        return efmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEfmin( Double newEfmin ) {
        Double oldEfmin = efmin;
        efmin = newEfmin;
        boolean oldEfminESet = efminESet;
        efminESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ELIN1__EFMIN, oldEfmin, efmin,
                    !oldEfminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEfmin() {
        Double oldEfmin = efmin;
        boolean oldEfminESet = efminESet;
        efmin = EFMIN_EDEFAULT;
        efminESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ELIN1__EFMIN, oldEfmin,
                    EFMIN_EDEFAULT, oldEfminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEfmin() {
        return efminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVpnf() {
        return vpnf;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVpnf( Double newVpnf ) {
        Double oldVpnf = vpnf;
        vpnf = newVpnf;
        boolean oldVpnfESet = vpnfESet;
        vpnfESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ELIN1__VPNF, oldVpnf, vpnf,
                    !oldVpnfESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVpnf() {
        Double oldVpnf = vpnf;
        boolean oldVpnfESet = vpnfESet;
        vpnf = VPNF_EDEFAULT;
        vpnfESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ELIN1__VPNF, oldVpnf,
                    VPNF_EDEFAULT, oldVpnfESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVpnf() {
        return vpnfESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getEfmax() {
        return efmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEfmax( Double newEfmax ) {
        Double oldEfmax = efmax;
        efmax = newEfmax;
        boolean oldEfmaxESet = efmaxESet;
        efmaxESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ELIN1__EFMAX, oldEfmax, efmax,
                    !oldEfmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEfmax() {
        Double oldEfmax = efmax;
        boolean oldEfmaxESet = efmaxESet;
        efmax = EFMAX_EDEFAULT;
        efmaxESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ELIN1__EFMAX, oldEfmax,
                    EFMAX_EDEFAULT, oldEfmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEfmax() {
        return efmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVpu() {
        return vpu;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVpu( Double newVpu ) {
        Double oldVpu = vpu;
        vpu = newVpu;
        boolean oldVpuESet = vpuESet;
        vpuESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ELIN1__VPU, oldVpu, vpu,
                    !oldVpuESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVpu() {
        Double oldVpu = vpu;
        boolean oldVpuESet = vpuESet;
        vpu = VPU_EDEFAULT;
        vpuESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ELIN1__VPU, oldVpu, VPU_EDEFAULT,
                    oldVpuESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVpu() {
        return vpuESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVpi() {
        return vpi;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVpi( Double newVpi ) {
        Double oldVpi = vpi;
        vpi = newVpi;
        boolean oldVpiESet = vpiESet;
        vpiESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ELIN1__VPI, oldVpi, vpi,
                    !oldVpiESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVpi() {
        Double oldVpi = vpi;
        boolean oldVpiESet = vpiESet;
        vpi = VPI_EDEFAULT;
        vpiESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ELIN1__VPI, oldVpi, VPI_EDEFAULT,
                    oldVpiESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVpi() {
        return vpiESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.EXC_ELIN1__SMAX:
            return getSmax();
        case CimPackage.EXC_ELIN1__TFI:
            return getTfi();
        case CimPackage.EXC_ELIN1__TNU:
            return getTnu();
        case CimPackage.EXC_ELIN1__TS1:
            return getTs1();
        case CimPackage.EXC_ELIN1__TS2:
            return getTs2();
        case CimPackage.EXC_ELIN1__TSW:
            return getTsw();
        case CimPackage.EXC_ELIN1__KS1:
            return getKs1();
        case CimPackage.EXC_ELIN1__KS2:
            return getKs2();
        case CimPackage.EXC_ELIN1__DPNF:
            return getDpnf();
        case CimPackage.EXC_ELIN1__XE:
            return getXe();
        case CimPackage.EXC_ELIN1__EFMIN:
            return getEfmin();
        case CimPackage.EXC_ELIN1__VPNF:
            return getVpnf();
        case CimPackage.EXC_ELIN1__EFMAX:
            return getEfmax();
        case CimPackage.EXC_ELIN1__VPU:
            return getVpu();
        case CimPackage.EXC_ELIN1__VPI:
            return getVpi();
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
        case CimPackage.EXC_ELIN1__SMAX:
            setSmax( ( Double ) newValue );
            return;
        case CimPackage.EXC_ELIN1__TFI:
            setTfi( ( Double ) newValue );
            return;
        case CimPackage.EXC_ELIN1__TNU:
            setTnu( ( Double ) newValue );
            return;
        case CimPackage.EXC_ELIN1__TS1:
            setTs1( ( Double ) newValue );
            return;
        case CimPackage.EXC_ELIN1__TS2:
            setTs2( ( Double ) newValue );
            return;
        case CimPackage.EXC_ELIN1__TSW:
            setTsw( ( Double ) newValue );
            return;
        case CimPackage.EXC_ELIN1__KS1:
            setKs1( ( Double ) newValue );
            return;
        case CimPackage.EXC_ELIN1__KS2:
            setKs2( ( Double ) newValue );
            return;
        case CimPackage.EXC_ELIN1__DPNF:
            setDpnf( ( Double ) newValue );
            return;
        case CimPackage.EXC_ELIN1__XE:
            setXe( ( Double ) newValue );
            return;
        case CimPackage.EXC_ELIN1__EFMIN:
            setEfmin( ( Double ) newValue );
            return;
        case CimPackage.EXC_ELIN1__VPNF:
            setVpnf( ( Double ) newValue );
            return;
        case CimPackage.EXC_ELIN1__EFMAX:
            setEfmax( ( Double ) newValue );
            return;
        case CimPackage.EXC_ELIN1__VPU:
            setVpu( ( Double ) newValue );
            return;
        case CimPackage.EXC_ELIN1__VPI:
            setVpi( ( Double ) newValue );
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
        case CimPackage.EXC_ELIN1__SMAX:
            unsetSmax();
            return;
        case CimPackage.EXC_ELIN1__TFI:
            unsetTfi();
            return;
        case CimPackage.EXC_ELIN1__TNU:
            unsetTnu();
            return;
        case CimPackage.EXC_ELIN1__TS1:
            unsetTs1();
            return;
        case CimPackage.EXC_ELIN1__TS2:
            unsetTs2();
            return;
        case CimPackage.EXC_ELIN1__TSW:
            unsetTsw();
            return;
        case CimPackage.EXC_ELIN1__KS1:
            unsetKs1();
            return;
        case CimPackage.EXC_ELIN1__KS2:
            unsetKs2();
            return;
        case CimPackage.EXC_ELIN1__DPNF:
            unsetDpnf();
            return;
        case CimPackage.EXC_ELIN1__XE:
            unsetXe();
            return;
        case CimPackage.EXC_ELIN1__EFMIN:
            unsetEfmin();
            return;
        case CimPackage.EXC_ELIN1__VPNF:
            unsetVpnf();
            return;
        case CimPackage.EXC_ELIN1__EFMAX:
            unsetEfmax();
            return;
        case CimPackage.EXC_ELIN1__VPU:
            unsetVpu();
            return;
        case CimPackage.EXC_ELIN1__VPI:
            unsetVpi();
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
        case CimPackage.EXC_ELIN1__SMAX:
            return isSetSmax();
        case CimPackage.EXC_ELIN1__TFI:
            return isSetTfi();
        case CimPackage.EXC_ELIN1__TNU:
            return isSetTnu();
        case CimPackage.EXC_ELIN1__TS1:
            return isSetTs1();
        case CimPackage.EXC_ELIN1__TS2:
            return isSetTs2();
        case CimPackage.EXC_ELIN1__TSW:
            return isSetTsw();
        case CimPackage.EXC_ELIN1__KS1:
            return isSetKs1();
        case CimPackage.EXC_ELIN1__KS2:
            return isSetKs2();
        case CimPackage.EXC_ELIN1__DPNF:
            return isSetDpnf();
        case CimPackage.EXC_ELIN1__XE:
            return isSetXe();
        case CimPackage.EXC_ELIN1__EFMIN:
            return isSetEfmin();
        case CimPackage.EXC_ELIN1__VPNF:
            return isSetVpnf();
        case CimPackage.EXC_ELIN1__EFMAX:
            return isSetEfmax();
        case CimPackage.EXC_ELIN1__VPU:
            return isSetVpu();
        case CimPackage.EXC_ELIN1__VPI:
            return isSetVpi();
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
        result.append( " (smax: " );
        if( smaxESet )
            result.append( smax );
        else
            result.append( "<unset>" );
        result.append( ", tfi: " );
        if( tfiESet )
            result.append( tfi );
        else
            result.append( "<unset>" );
        result.append( ", tnu: " );
        if( tnuESet )
            result.append( tnu );
        else
            result.append( "<unset>" );
        result.append( ", ts1: " );
        if( ts1ESet )
            result.append( ts1 );
        else
            result.append( "<unset>" );
        result.append( ", ts2: " );
        if( ts2ESet )
            result.append( ts2 );
        else
            result.append( "<unset>" );
        result.append( ", tsw: " );
        if( tswESet )
            result.append( tsw );
        else
            result.append( "<unset>" );
        result.append( ", ks1: " );
        if( ks1ESet )
            result.append( ks1 );
        else
            result.append( "<unset>" );
        result.append( ", ks2: " );
        if( ks2ESet )
            result.append( ks2 );
        else
            result.append( "<unset>" );
        result.append( ", dpnf: " );
        if( dpnfESet )
            result.append( dpnf );
        else
            result.append( "<unset>" );
        result.append( ", xe: " );
        if( xeESet )
            result.append( xe );
        else
            result.append( "<unset>" );
        result.append( ", efmin: " );
        if( efminESet )
            result.append( efmin );
        else
            result.append( "<unset>" );
        result.append( ", vpnf: " );
        if( vpnfESet )
            result.append( vpnf );
        else
            result.append( "<unset>" );
        result.append( ", efmax: " );
        if( efmaxESet )
            result.append( efmax );
        else
            result.append( "<unset>" );
        result.append( ", vpu: " );
        if( vpuESet )
            result.append( vpu );
        else
            result.append( "<unset>" );
        result.append( ", vpi: " );
        if( vpiESet )
            result.append( vpi );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ExcELIN1Impl

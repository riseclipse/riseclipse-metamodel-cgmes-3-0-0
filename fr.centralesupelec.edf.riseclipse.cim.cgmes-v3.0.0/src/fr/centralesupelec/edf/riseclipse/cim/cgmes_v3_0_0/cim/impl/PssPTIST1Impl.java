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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssPTIST1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pss PTIST1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssPTIST1Impl#getM <em>M</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssPTIST1Impl#getK <em>K</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssPTIST1Impl#getTp <em>Tp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssPTIST1Impl#getTf <em>Tf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssPTIST1Impl#getDtp <em>Dtp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssPTIST1Impl#getDtf <em>Dtf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssPTIST1Impl#getDtc <em>Dtc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssPTIST1Impl#getT3 <em>T3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssPTIST1Impl#getT4 <em>T4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssPTIST1Impl#getT1 <em>T1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssPTIST1Impl#getT2 <em>T2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PssPTIST1Impl extends PowerSystemStabilizerDynamicsImpl implements PssPTIST1 {
    /**
     * The default value of the '{@link #getM() <em>M</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getM()
     * @generated
     * @ordered
     */
    protected static final Double M_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getM() <em>M</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getM()
     * @generated
     * @ordered
     */
    protected Double m = M_EDEFAULT;

    /**
     * This is true if the M attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean mESet;

    /**
     * The default value of the '{@link #getK() <em>K</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getK()
     * @generated
     * @ordered
     */
    protected static final Double K_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getK() <em>K</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getK()
     * @generated
     * @ordered
     */
    protected Double k = K_EDEFAULT;

    /**
     * This is true if the K attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kESet;

    /**
     * The default value of the '{@link #getTp() <em>Tp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTp()
     * @generated
     * @ordered
     */
    protected static final Double TP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTp() <em>Tp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTp()
     * @generated
     * @ordered
     */
    protected Double tp = TP_EDEFAULT;

    /**
     * This is true if the Tp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tpESet;

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
     * The default value of the '{@link #getDtp() <em>Dtp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDtp()
     * @generated
     * @ordered
     */
    protected static final Double DTP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDtp() <em>Dtp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDtp()
     * @generated
     * @ordered
     */
    protected Double dtp = DTP_EDEFAULT;

    /**
     * This is true if the Dtp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dtpESet;

    /**
     * The default value of the '{@link #getDtf() <em>Dtf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDtf()
     * @generated
     * @ordered
     */
    protected static final Double DTF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDtf() <em>Dtf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDtf()
     * @generated
     * @ordered
     */
    protected Double dtf = DTF_EDEFAULT;

    /**
     * This is true if the Dtf attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dtfESet;

    /**
     * The default value of the '{@link #getDtc() <em>Dtc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDtc()
     * @generated
     * @ordered
     */
    protected static final Double DTC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDtc() <em>Dtc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDtc()
     * @generated
     * @ordered
     */
    protected Double dtc = DTC_EDEFAULT;

    /**
     * This is true if the Dtc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dtcESet;

    /**
     * The default value of the '{@link #getT3() <em>T3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT3()
     * @generated
     * @ordered
     */
    protected static final Double T3_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getT3() <em>T3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT3()
     * @generated
     * @ordered
     */
    protected Double t3 = T3_EDEFAULT;

    /**
     * This is true if the T3 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean t3ESet;

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
     * The default value of the '{@link #getT2() <em>T2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT2()
     * @generated
     * @ordered
     */
    protected static final Double T2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getT2() <em>T2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT2()
     * @generated
     * @ordered
     */
    protected Double t2 = T2_EDEFAULT;

    /**
     * This is true if the T2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean t2ESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PssPTIST1Impl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getPssPTIST1();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getM() {
        return m;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setM( Double newM ) {
        Double oldM = m;
        m = newM;
        boolean oldMESet = mESet;
        mESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_PTIST1__M, oldM, m, !oldMESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetM() {
        Double oldM = m;
        boolean oldMESet = mESet;
        m = M_EDEFAULT;
        mESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_PTIST1__M, oldM, M_EDEFAULT,
                    oldMESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetM() {
        return mESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getK() {
        return k;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setK( Double newK ) {
        Double oldK = k;
        k = newK;
        boolean oldKESet = kESet;
        kESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_PTIST1__K, oldK, k, !oldKESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetK() {
        Double oldK = k;
        boolean oldKESet = kESet;
        k = K_EDEFAULT;
        kESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_PTIST1__K, oldK, K_EDEFAULT,
                    oldKESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetK() {
        return kESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTp() {
        return tp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTp( Double newTp ) {
        Double oldTp = tp;
        tp = newTp;
        boolean oldTpESet = tpESet;
        tpESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_PTIST1__TP, oldTp, tp,
                    !oldTpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTp() {
        Double oldTp = tp;
        boolean oldTpESet = tpESet;
        tp = TP_EDEFAULT;
        tpESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_PTIST1__TP, oldTp, TP_EDEFAULT,
                    oldTpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTp() {
        return tpESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_PTIST1__TF, oldTf, tf,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_PTIST1__TF, oldTf, TF_EDEFAULT,
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
    public Double getDtp() {
        return dtp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDtp( Double newDtp ) {
        Double oldDtp = dtp;
        dtp = newDtp;
        boolean oldDtpESet = dtpESet;
        dtpESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_PTIST1__DTP, oldDtp, dtp,
                    !oldDtpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDtp() {
        Double oldDtp = dtp;
        boolean oldDtpESet = dtpESet;
        dtp = DTP_EDEFAULT;
        dtpESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_PTIST1__DTP, oldDtp, DTP_EDEFAULT,
                    oldDtpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDtp() {
        return dtpESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getDtf() {
        return dtf;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDtf( Double newDtf ) {
        Double oldDtf = dtf;
        dtf = newDtf;
        boolean oldDtfESet = dtfESet;
        dtfESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_PTIST1__DTF, oldDtf, dtf,
                    !oldDtfESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDtf() {
        Double oldDtf = dtf;
        boolean oldDtfESet = dtfESet;
        dtf = DTF_EDEFAULT;
        dtfESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_PTIST1__DTF, oldDtf, DTF_EDEFAULT,
                    oldDtfESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDtf() {
        return dtfESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getDtc() {
        return dtc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDtc( Double newDtc ) {
        Double oldDtc = dtc;
        dtc = newDtc;
        boolean oldDtcESet = dtcESet;
        dtcESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_PTIST1__DTC, oldDtc, dtc,
                    !oldDtcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDtc() {
        Double oldDtc = dtc;
        boolean oldDtcESet = dtcESet;
        dtc = DTC_EDEFAULT;
        dtcESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_PTIST1__DTC, oldDtc, DTC_EDEFAULT,
                    oldDtcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDtc() {
        return dtcESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getT3() {
        return t3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setT3( Double newT3 ) {
        Double oldT3 = t3;
        t3 = newT3;
        boolean oldT3ESet = t3ESet;
        t3ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_PTIST1__T3, oldT3, t3,
                    !oldT3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetT3() {
        Double oldT3 = t3;
        boolean oldT3ESet = t3ESet;
        t3 = T3_EDEFAULT;
        t3ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_PTIST1__T3, oldT3, T3_EDEFAULT,
                    oldT3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetT3() {
        return t3ESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_PTIST1__T4, oldT4, t4,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_PTIST1__T4, oldT4, T4_EDEFAULT,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_PTIST1__T1, oldT1, t1,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_PTIST1__T1, oldT1, T1_EDEFAULT,
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
    public Double getT2() {
        return t2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setT2( Double newT2 ) {
        Double oldT2 = t2;
        t2 = newT2;
        boolean oldT2ESet = t2ESet;
        t2ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_PTIST1__T2, oldT2, t2,
                    !oldT2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetT2() {
        Double oldT2 = t2;
        boolean oldT2ESet = t2ESet;
        t2 = T2_EDEFAULT;
        t2ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_PTIST1__T2, oldT2, T2_EDEFAULT,
                    oldT2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetT2() {
        return t2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.PSS_PTIST1__M:
            return getM();
        case CimPackage.PSS_PTIST1__K:
            return getK();
        case CimPackage.PSS_PTIST1__TP:
            return getTp();
        case CimPackage.PSS_PTIST1__TF:
            return getTf();
        case CimPackage.PSS_PTIST1__DTP:
            return getDtp();
        case CimPackage.PSS_PTIST1__DTF:
            return getDtf();
        case CimPackage.PSS_PTIST1__DTC:
            return getDtc();
        case CimPackage.PSS_PTIST1__T3:
            return getT3();
        case CimPackage.PSS_PTIST1__T4:
            return getT4();
        case CimPackage.PSS_PTIST1__T1:
            return getT1();
        case CimPackage.PSS_PTIST1__T2:
            return getT2();
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
        case CimPackage.PSS_PTIST1__M:
            setM( ( Double ) newValue );
            return;
        case CimPackage.PSS_PTIST1__K:
            setK( ( Double ) newValue );
            return;
        case CimPackage.PSS_PTIST1__TP:
            setTp( ( Double ) newValue );
            return;
        case CimPackage.PSS_PTIST1__TF:
            setTf( ( Double ) newValue );
            return;
        case CimPackage.PSS_PTIST1__DTP:
            setDtp( ( Double ) newValue );
            return;
        case CimPackage.PSS_PTIST1__DTF:
            setDtf( ( Double ) newValue );
            return;
        case CimPackage.PSS_PTIST1__DTC:
            setDtc( ( Double ) newValue );
            return;
        case CimPackage.PSS_PTIST1__T3:
            setT3( ( Double ) newValue );
            return;
        case CimPackage.PSS_PTIST1__T4:
            setT4( ( Double ) newValue );
            return;
        case CimPackage.PSS_PTIST1__T1:
            setT1( ( Double ) newValue );
            return;
        case CimPackage.PSS_PTIST1__T2:
            setT2( ( Double ) newValue );
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
        case CimPackage.PSS_PTIST1__M:
            unsetM();
            return;
        case CimPackage.PSS_PTIST1__K:
            unsetK();
            return;
        case CimPackage.PSS_PTIST1__TP:
            unsetTp();
            return;
        case CimPackage.PSS_PTIST1__TF:
            unsetTf();
            return;
        case CimPackage.PSS_PTIST1__DTP:
            unsetDtp();
            return;
        case CimPackage.PSS_PTIST1__DTF:
            unsetDtf();
            return;
        case CimPackage.PSS_PTIST1__DTC:
            unsetDtc();
            return;
        case CimPackage.PSS_PTIST1__T3:
            unsetT3();
            return;
        case CimPackage.PSS_PTIST1__T4:
            unsetT4();
            return;
        case CimPackage.PSS_PTIST1__T1:
            unsetT1();
            return;
        case CimPackage.PSS_PTIST1__T2:
            unsetT2();
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
        case CimPackage.PSS_PTIST1__M:
            return isSetM();
        case CimPackage.PSS_PTIST1__K:
            return isSetK();
        case CimPackage.PSS_PTIST1__TP:
            return isSetTp();
        case CimPackage.PSS_PTIST1__TF:
            return isSetTf();
        case CimPackage.PSS_PTIST1__DTP:
            return isSetDtp();
        case CimPackage.PSS_PTIST1__DTF:
            return isSetDtf();
        case CimPackage.PSS_PTIST1__DTC:
            return isSetDtc();
        case CimPackage.PSS_PTIST1__T3:
            return isSetT3();
        case CimPackage.PSS_PTIST1__T4:
            return isSetT4();
        case CimPackage.PSS_PTIST1__T1:
            return isSetT1();
        case CimPackage.PSS_PTIST1__T2:
            return isSetT2();
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
        result.append( " (m: " );
        if( mESet )
            result.append( m );
        else
            result.append( "<unset>" );
        result.append( ", k: " );
        if( kESet )
            result.append( k );
        else
            result.append( "<unset>" );
        result.append( ", tp: " );
        if( tpESet )
            result.append( tp );
        else
            result.append( "<unset>" );
        result.append( ", tf: " );
        if( tfESet )
            result.append( tf );
        else
            result.append( "<unset>" );
        result.append( ", dtp: " );
        if( dtpESet )
            result.append( dtp );
        else
            result.append( "<unset>" );
        result.append( ", dtf: " );
        if( dtfESet )
            result.append( dtf );
        else
            result.append( "<unset>" );
        result.append( ", dtc: " );
        if( dtcESet )
            result.append( dtc );
        else
            result.append( "<unset>" );
        result.append( ", t3: " );
        if( t3ESet )
            result.append( t3 );
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
        result.append( ", t2: " );
        if( t2ESet )
            result.append( t2 );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //PssPTIST1Impl

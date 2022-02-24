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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Pss5;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pss5</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.Pss5Impl#getKpe <em>Kpe</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.Pss5Impl#getCtw2 <em>Ctw2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.Pss5Impl#getTl3 <em>Tl3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.Pss5Impl#getTl4 <em>Tl4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.Pss5Impl#getTl1 <em>Tl1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.Pss5Impl#getTl2 <em>Tl2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.Pss5Impl#getTpe <em>Tpe</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.Pss5Impl#getTw2 <em>Tw2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.Pss5Impl#getTw1 <em>Tw1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.Pss5Impl#getKf <em>Kf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.Pss5Impl#getVsmx <em>Vsmx</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.Pss5Impl#getVsmn <em>Vsmn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.Pss5Impl#getDeadband <em>Deadband</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.Pss5Impl#getKpss <em>Kpss</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.Pss5Impl#getVadat <em>Vadat</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.Pss5Impl#getPmin <em>Pmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.Pss5Impl#getIsfreq <em>Isfreq</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Pss5Impl extends PowerSystemStabilizerDynamicsImpl implements Pss5 {
    /**
     * The default value of the '{@link #getKpe() <em>Kpe</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKpe()
     * @generated
     * @ordered
     */
    protected static final Double KPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKpe() <em>Kpe</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKpe()
     * @generated
     * @ordered
     */
    protected Double kpe = KPE_EDEFAULT;

    /**
     * This is true if the Kpe attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kpeESet;

    /**
     * The default value of the '{@link #getCtw2() <em>Ctw2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCtw2()
     * @generated
     * @ordered
     */
    protected static final Boolean CTW2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCtw2() <em>Ctw2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCtw2()
     * @generated
     * @ordered
     */
    protected Boolean ctw2 = CTW2_EDEFAULT;

    /**
     * This is true if the Ctw2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ctw2ESet;

    /**
     * The default value of the '{@link #getTl3() <em>Tl3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTl3()
     * @generated
     * @ordered
     */
    protected static final Double TL3_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTl3() <em>Tl3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTl3()
     * @generated
     * @ordered
     */
    protected Double tl3 = TL3_EDEFAULT;

    /**
     * This is true if the Tl3 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tl3ESet;

    /**
     * The default value of the '{@link #getTl4() <em>Tl4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTl4()
     * @generated
     * @ordered
     */
    protected static final Double TL4_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTl4() <em>Tl4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTl4()
     * @generated
     * @ordered
     */
    protected Double tl4 = TL4_EDEFAULT;

    /**
     * This is true if the Tl4 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tl4ESet;

    /**
     * The default value of the '{@link #getTl1() <em>Tl1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTl1()
     * @generated
     * @ordered
     */
    protected static final Double TL1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTl1() <em>Tl1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTl1()
     * @generated
     * @ordered
     */
    protected Double tl1 = TL1_EDEFAULT;

    /**
     * This is true if the Tl1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tl1ESet;

    /**
     * The default value of the '{@link #getTl2() <em>Tl2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTl2()
     * @generated
     * @ordered
     */
    protected static final Double TL2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTl2() <em>Tl2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTl2()
     * @generated
     * @ordered
     */
    protected Double tl2 = TL2_EDEFAULT;

    /**
     * This is true if the Tl2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tl2ESet;

    /**
     * The default value of the '{@link #getTpe() <em>Tpe</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTpe()
     * @generated
     * @ordered
     */
    protected static final Double TPE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTpe() <em>Tpe</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTpe()
     * @generated
     * @ordered
     */
    protected Double tpe = TPE_EDEFAULT;

    /**
     * This is true if the Tpe attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tpeESet;

    /**
     * The default value of the '{@link #getTw2() <em>Tw2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTw2()
     * @generated
     * @ordered
     */
    protected static final Double TW2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTw2() <em>Tw2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTw2()
     * @generated
     * @ordered
     */
    protected Double tw2 = TW2_EDEFAULT;

    /**
     * This is true if the Tw2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tw2ESet;

    /**
     * The default value of the '{@link #getTw1() <em>Tw1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTw1()
     * @generated
     * @ordered
     */
    protected static final Double TW1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTw1() <em>Tw1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTw1()
     * @generated
     * @ordered
     */
    protected Double tw1 = TW1_EDEFAULT;

    /**
     * This is true if the Tw1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tw1ESet;

    /**
     * The default value of the '{@link #getKf() <em>Kf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKf()
     * @generated
     * @ordered
     */
    protected static final Double KF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKf() <em>Kf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKf()
     * @generated
     * @ordered
     */
    protected Double kf = KF_EDEFAULT;

    /**
     * This is true if the Kf attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kfESet;

    /**
     * The default value of the '{@link #getVsmx() <em>Vsmx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVsmx()
     * @generated
     * @ordered
     */
    protected static final Double VSMX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVsmx() <em>Vsmx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVsmx()
     * @generated
     * @ordered
     */
    protected Double vsmx = VSMX_EDEFAULT;

    /**
     * This is true if the Vsmx attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vsmxESet;

    /**
     * The default value of the '{@link #getVsmn() <em>Vsmn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVsmn()
     * @generated
     * @ordered
     */
    protected static final Double VSMN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVsmn() <em>Vsmn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVsmn()
     * @generated
     * @ordered
     */
    protected Double vsmn = VSMN_EDEFAULT;

    /**
     * This is true if the Vsmn attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vsmnESet;

    /**
     * The default value of the '{@link #getDeadband() <em>Deadband</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDeadband()
     * @generated
     * @ordered
     */
    protected static final Double DEADBAND_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDeadband() <em>Deadband</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDeadband()
     * @generated
     * @ordered
     */
    protected Double deadband = DEADBAND_EDEFAULT;

    /**
     * This is true if the Deadband attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean deadbandESet;

    /**
     * The default value of the '{@link #getKpss() <em>Kpss</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKpss()
     * @generated
     * @ordered
     */
    protected static final Double KPSS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKpss() <em>Kpss</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKpss()
     * @generated
     * @ordered
     */
    protected Double kpss = KPSS_EDEFAULT;

    /**
     * This is true if the Kpss attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kpssESet;

    /**
     * The default value of the '{@link #getVadat() <em>Vadat</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVadat()
     * @generated
     * @ordered
     */
    protected static final Boolean VADAT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVadat() <em>Vadat</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVadat()
     * @generated
     * @ordered
     */
    protected Boolean vadat = VADAT_EDEFAULT;

    /**
     * This is true if the Vadat attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vadatESet;

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
     * The default value of the '{@link #getIsfreq() <em>Isfreq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsfreq()
     * @generated
     * @ordered
     */
    protected static final Boolean ISFREQ_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIsfreq() <em>Isfreq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsfreq()
     * @generated
     * @ordered
     */
    protected Boolean isfreq = ISFREQ_EDEFAULT;

    /**
     * This is true if the Isfreq attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isfreqESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Pss5Impl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getPss5();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKpe() {
        return kpe;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKpe( Double newKpe ) {
        Double oldKpe = kpe;
        kpe = newKpe;
        boolean oldKpeESet = kpeESet;
        kpeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS5__KPE, oldKpe, kpe, !oldKpeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKpe() {
        Double oldKpe = kpe;
        boolean oldKpeESet = kpeESet;
        kpe = KPE_EDEFAULT;
        kpeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS5__KPE, oldKpe, KPE_EDEFAULT,
                    oldKpeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKpe() {
        return kpeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getCtw2() {
        return ctw2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCtw2( Boolean newCtw2 ) {
        Boolean oldCtw2 = ctw2;
        ctw2 = newCtw2;
        boolean oldCtw2ESet = ctw2ESet;
        ctw2ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS5__CTW2, oldCtw2, ctw2,
                    !oldCtw2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCtw2() {
        Boolean oldCtw2 = ctw2;
        boolean oldCtw2ESet = ctw2ESet;
        ctw2 = CTW2_EDEFAULT;
        ctw2ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS5__CTW2, oldCtw2, CTW2_EDEFAULT,
                    oldCtw2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCtw2() {
        return ctw2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTl3() {
        return tl3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTl3( Double newTl3 ) {
        Double oldTl3 = tl3;
        tl3 = newTl3;
        boolean oldTl3ESet = tl3ESet;
        tl3ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS5__TL3, oldTl3, tl3, !oldTl3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTl3() {
        Double oldTl3 = tl3;
        boolean oldTl3ESet = tl3ESet;
        tl3 = TL3_EDEFAULT;
        tl3ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS5__TL3, oldTl3, TL3_EDEFAULT,
                    oldTl3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTl3() {
        return tl3ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTl4() {
        return tl4;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTl4( Double newTl4 ) {
        Double oldTl4 = tl4;
        tl4 = newTl4;
        boolean oldTl4ESet = tl4ESet;
        tl4ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS5__TL4, oldTl4, tl4, !oldTl4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTl4() {
        Double oldTl4 = tl4;
        boolean oldTl4ESet = tl4ESet;
        tl4 = TL4_EDEFAULT;
        tl4ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS5__TL4, oldTl4, TL4_EDEFAULT,
                    oldTl4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTl4() {
        return tl4ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTl1() {
        return tl1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTl1( Double newTl1 ) {
        Double oldTl1 = tl1;
        tl1 = newTl1;
        boolean oldTl1ESet = tl1ESet;
        tl1ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS5__TL1, oldTl1, tl1, !oldTl1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTl1() {
        Double oldTl1 = tl1;
        boolean oldTl1ESet = tl1ESet;
        tl1 = TL1_EDEFAULT;
        tl1ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS5__TL1, oldTl1, TL1_EDEFAULT,
                    oldTl1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTl1() {
        return tl1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTl2() {
        return tl2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTl2( Double newTl2 ) {
        Double oldTl2 = tl2;
        tl2 = newTl2;
        boolean oldTl2ESet = tl2ESet;
        tl2ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS5__TL2, oldTl2, tl2, !oldTl2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTl2() {
        Double oldTl2 = tl2;
        boolean oldTl2ESet = tl2ESet;
        tl2 = TL2_EDEFAULT;
        tl2ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS5__TL2, oldTl2, TL2_EDEFAULT,
                    oldTl2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTl2() {
        return tl2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTpe() {
        return tpe;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTpe( Double newTpe ) {
        Double oldTpe = tpe;
        tpe = newTpe;
        boolean oldTpeESet = tpeESet;
        tpeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS5__TPE, oldTpe, tpe, !oldTpeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTpe() {
        Double oldTpe = tpe;
        boolean oldTpeESet = tpeESet;
        tpe = TPE_EDEFAULT;
        tpeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS5__TPE, oldTpe, TPE_EDEFAULT,
                    oldTpeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTpe() {
        return tpeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTw2() {
        return tw2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTw2( Double newTw2 ) {
        Double oldTw2 = tw2;
        tw2 = newTw2;
        boolean oldTw2ESet = tw2ESet;
        tw2ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS5__TW2, oldTw2, tw2, !oldTw2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTw2() {
        Double oldTw2 = tw2;
        boolean oldTw2ESet = tw2ESet;
        tw2 = TW2_EDEFAULT;
        tw2ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS5__TW2, oldTw2, TW2_EDEFAULT,
                    oldTw2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTw2() {
        return tw2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTw1() {
        return tw1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTw1( Double newTw1 ) {
        Double oldTw1 = tw1;
        tw1 = newTw1;
        boolean oldTw1ESet = tw1ESet;
        tw1ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS5__TW1, oldTw1, tw1, !oldTw1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTw1() {
        Double oldTw1 = tw1;
        boolean oldTw1ESet = tw1ESet;
        tw1 = TW1_EDEFAULT;
        tw1ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS5__TW1, oldTw1, TW1_EDEFAULT,
                    oldTw1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTw1() {
        return tw1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKf() {
        return kf;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKf( Double newKf ) {
        Double oldKf = kf;
        kf = newKf;
        boolean oldKfESet = kfESet;
        kfESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS5__KF, oldKf, kf, !oldKfESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKf() {
        Double oldKf = kf;
        boolean oldKfESet = kfESet;
        kf = KF_EDEFAULT;
        kfESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS5__KF, oldKf, KF_EDEFAULT,
                    oldKfESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKf() {
        return kfESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVsmx() {
        return vsmx;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVsmx( Double newVsmx ) {
        Double oldVsmx = vsmx;
        vsmx = newVsmx;
        boolean oldVsmxESet = vsmxESet;
        vsmxESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS5__VSMX, oldVsmx, vsmx,
                    !oldVsmxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVsmx() {
        Double oldVsmx = vsmx;
        boolean oldVsmxESet = vsmxESet;
        vsmx = VSMX_EDEFAULT;
        vsmxESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS5__VSMX, oldVsmx, VSMX_EDEFAULT,
                    oldVsmxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVsmx() {
        return vsmxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVsmn() {
        return vsmn;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVsmn( Double newVsmn ) {
        Double oldVsmn = vsmn;
        vsmn = newVsmn;
        boolean oldVsmnESet = vsmnESet;
        vsmnESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS5__VSMN, oldVsmn, vsmn,
                    !oldVsmnESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVsmn() {
        Double oldVsmn = vsmn;
        boolean oldVsmnESet = vsmnESet;
        vsmn = VSMN_EDEFAULT;
        vsmnESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS5__VSMN, oldVsmn, VSMN_EDEFAULT,
                    oldVsmnESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVsmn() {
        return vsmnESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getDeadband() {
        return deadband;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDeadband( Double newDeadband ) {
        Double oldDeadband = deadband;
        deadband = newDeadband;
        boolean oldDeadbandESet = deadbandESet;
        deadbandESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS5__DEADBAND, oldDeadband, deadband,
                    !oldDeadbandESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDeadband() {
        Double oldDeadband = deadband;
        boolean oldDeadbandESet = deadbandESet;
        deadband = DEADBAND_EDEFAULT;
        deadbandESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS5__DEADBAND, oldDeadband,
                    DEADBAND_EDEFAULT, oldDeadbandESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDeadband() {
        return deadbandESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKpss() {
        return kpss;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKpss( Double newKpss ) {
        Double oldKpss = kpss;
        kpss = newKpss;
        boolean oldKpssESet = kpssESet;
        kpssESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS5__KPSS, oldKpss, kpss,
                    !oldKpssESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKpss() {
        Double oldKpss = kpss;
        boolean oldKpssESet = kpssESet;
        kpss = KPSS_EDEFAULT;
        kpssESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS5__KPSS, oldKpss, KPSS_EDEFAULT,
                    oldKpssESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKpss() {
        return kpssESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getVadat() {
        return vadat;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVadat( Boolean newVadat ) {
        Boolean oldVadat = vadat;
        vadat = newVadat;
        boolean oldVadatESet = vadatESet;
        vadatESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS5__VADAT, oldVadat, vadat,
                    !oldVadatESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVadat() {
        Boolean oldVadat = vadat;
        boolean oldVadatESet = vadatESet;
        vadat = VADAT_EDEFAULT;
        vadatESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS5__VADAT, oldVadat, VADAT_EDEFAULT,
                    oldVadatESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVadat() {
        return vadatESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS5__PMIN, oldPmin, pmin,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS5__PMIN, oldPmin, PMIN_EDEFAULT,
                    oldPminESet ) );
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
    public Boolean getIsfreq() {
        return isfreq;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsfreq( Boolean newIsfreq ) {
        Boolean oldIsfreq = isfreq;
        isfreq = newIsfreq;
        boolean oldIsfreqESet = isfreqESet;
        isfreqESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS5__ISFREQ, oldIsfreq, isfreq,
                    !oldIsfreqESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIsfreq() {
        Boolean oldIsfreq = isfreq;
        boolean oldIsfreqESet = isfreqESet;
        isfreq = ISFREQ_EDEFAULT;
        isfreqESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS5__ISFREQ, oldIsfreq,
                    ISFREQ_EDEFAULT, oldIsfreqESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIsfreq() {
        return isfreqESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.PSS5__KPE:
            return getKpe();
        case CimPackage.PSS5__CTW2:
            return getCtw2();
        case CimPackage.PSS5__TL3:
            return getTl3();
        case CimPackage.PSS5__TL4:
            return getTl4();
        case CimPackage.PSS5__TL1:
            return getTl1();
        case CimPackage.PSS5__TL2:
            return getTl2();
        case CimPackage.PSS5__TPE:
            return getTpe();
        case CimPackage.PSS5__TW2:
            return getTw2();
        case CimPackage.PSS5__TW1:
            return getTw1();
        case CimPackage.PSS5__KF:
            return getKf();
        case CimPackage.PSS5__VSMX:
            return getVsmx();
        case CimPackage.PSS5__VSMN:
            return getVsmn();
        case CimPackage.PSS5__DEADBAND:
            return getDeadband();
        case CimPackage.PSS5__KPSS:
            return getKpss();
        case CimPackage.PSS5__VADAT:
            return getVadat();
        case CimPackage.PSS5__PMIN:
            return getPmin();
        case CimPackage.PSS5__ISFREQ:
            return getIsfreq();
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
        case CimPackage.PSS5__KPE:
            setKpe( ( Double ) newValue );
            return;
        case CimPackage.PSS5__CTW2:
            setCtw2( ( Boolean ) newValue );
            return;
        case CimPackage.PSS5__TL3:
            setTl3( ( Double ) newValue );
            return;
        case CimPackage.PSS5__TL4:
            setTl4( ( Double ) newValue );
            return;
        case CimPackage.PSS5__TL1:
            setTl1( ( Double ) newValue );
            return;
        case CimPackage.PSS5__TL2:
            setTl2( ( Double ) newValue );
            return;
        case CimPackage.PSS5__TPE:
            setTpe( ( Double ) newValue );
            return;
        case CimPackage.PSS5__TW2:
            setTw2( ( Double ) newValue );
            return;
        case CimPackage.PSS5__TW1:
            setTw1( ( Double ) newValue );
            return;
        case CimPackage.PSS5__KF:
            setKf( ( Double ) newValue );
            return;
        case CimPackage.PSS5__VSMX:
            setVsmx( ( Double ) newValue );
            return;
        case CimPackage.PSS5__VSMN:
            setVsmn( ( Double ) newValue );
            return;
        case CimPackage.PSS5__DEADBAND:
            setDeadband( ( Double ) newValue );
            return;
        case CimPackage.PSS5__KPSS:
            setKpss( ( Double ) newValue );
            return;
        case CimPackage.PSS5__VADAT:
            setVadat( ( Boolean ) newValue );
            return;
        case CimPackage.PSS5__PMIN:
            setPmin( ( Double ) newValue );
            return;
        case CimPackage.PSS5__ISFREQ:
            setIsfreq( ( Boolean ) newValue );
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
        case CimPackage.PSS5__KPE:
            unsetKpe();
            return;
        case CimPackage.PSS5__CTW2:
            unsetCtw2();
            return;
        case CimPackage.PSS5__TL3:
            unsetTl3();
            return;
        case CimPackage.PSS5__TL4:
            unsetTl4();
            return;
        case CimPackage.PSS5__TL1:
            unsetTl1();
            return;
        case CimPackage.PSS5__TL2:
            unsetTl2();
            return;
        case CimPackage.PSS5__TPE:
            unsetTpe();
            return;
        case CimPackage.PSS5__TW2:
            unsetTw2();
            return;
        case CimPackage.PSS5__TW1:
            unsetTw1();
            return;
        case CimPackage.PSS5__KF:
            unsetKf();
            return;
        case CimPackage.PSS5__VSMX:
            unsetVsmx();
            return;
        case CimPackage.PSS5__VSMN:
            unsetVsmn();
            return;
        case CimPackage.PSS5__DEADBAND:
            unsetDeadband();
            return;
        case CimPackage.PSS5__KPSS:
            unsetKpss();
            return;
        case CimPackage.PSS5__VADAT:
            unsetVadat();
            return;
        case CimPackage.PSS5__PMIN:
            unsetPmin();
            return;
        case CimPackage.PSS5__ISFREQ:
            unsetIsfreq();
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
        case CimPackage.PSS5__KPE:
            return isSetKpe();
        case CimPackage.PSS5__CTW2:
            return isSetCtw2();
        case CimPackage.PSS5__TL3:
            return isSetTl3();
        case CimPackage.PSS5__TL4:
            return isSetTl4();
        case CimPackage.PSS5__TL1:
            return isSetTl1();
        case CimPackage.PSS5__TL2:
            return isSetTl2();
        case CimPackage.PSS5__TPE:
            return isSetTpe();
        case CimPackage.PSS5__TW2:
            return isSetTw2();
        case CimPackage.PSS5__TW1:
            return isSetTw1();
        case CimPackage.PSS5__KF:
            return isSetKf();
        case CimPackage.PSS5__VSMX:
            return isSetVsmx();
        case CimPackage.PSS5__VSMN:
            return isSetVsmn();
        case CimPackage.PSS5__DEADBAND:
            return isSetDeadband();
        case CimPackage.PSS5__KPSS:
            return isSetKpss();
        case CimPackage.PSS5__VADAT:
            return isSetVadat();
        case CimPackage.PSS5__PMIN:
            return isSetPmin();
        case CimPackage.PSS5__ISFREQ:
            return isSetIsfreq();
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
        result.append( " (kpe: " );
        if( kpeESet )
            result.append( kpe );
        else
            result.append( "<unset>" );
        result.append( ", ctw2: " );
        if( ctw2ESet )
            result.append( ctw2 );
        else
            result.append( "<unset>" );
        result.append( ", tl3: " );
        if( tl3ESet )
            result.append( tl3 );
        else
            result.append( "<unset>" );
        result.append( ", tl4: " );
        if( tl4ESet )
            result.append( tl4 );
        else
            result.append( "<unset>" );
        result.append( ", tl1: " );
        if( tl1ESet )
            result.append( tl1 );
        else
            result.append( "<unset>" );
        result.append( ", tl2: " );
        if( tl2ESet )
            result.append( tl2 );
        else
            result.append( "<unset>" );
        result.append( ", tpe: " );
        if( tpeESet )
            result.append( tpe );
        else
            result.append( "<unset>" );
        result.append( ", tw2: " );
        if( tw2ESet )
            result.append( tw2 );
        else
            result.append( "<unset>" );
        result.append( ", tw1: " );
        if( tw1ESet )
            result.append( tw1 );
        else
            result.append( "<unset>" );
        result.append( ", kf: " );
        if( kfESet )
            result.append( kf );
        else
            result.append( "<unset>" );
        result.append( ", vsmx: " );
        if( vsmxESet )
            result.append( vsmx );
        else
            result.append( "<unset>" );
        result.append( ", vsmn: " );
        if( vsmnESet )
            result.append( vsmn );
        else
            result.append( "<unset>" );
        result.append( ", deadband: " );
        if( deadbandESet )
            result.append( deadband );
        else
            result.append( "<unset>" );
        result.append( ", kpss: " );
        if( kpssESet )
            result.append( kpss );
        else
            result.append( "<unset>" );
        result.append( ", vadat: " );
        if( vadatESet )
            result.append( vadat );
        else
            result.append( "<unset>" );
        result.append( ", pmin: " );
        if( pminESet )
            result.append( pmin );
        else
            result.append( "<unset>" );
        result.append( ", isfreq: " );
        if( isfreqESet )
            result.append( isfreq );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //Pss5Impl

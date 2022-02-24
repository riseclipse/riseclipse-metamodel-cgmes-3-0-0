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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssELIN2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pss ELIN2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssELIN2Impl#getApss <em>Apss</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssELIN2Impl#getTs3 <em>Ts3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssELIN2Impl#getTs4 <em>Ts4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssELIN2Impl#getTs5 <em>Ts5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssELIN2Impl#getTs6 <em>Ts6</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssELIN2Impl#getTs1 <em>Ts1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssELIN2Impl#getTs2 <em>Ts2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssELIN2Impl#getKs1 <em>Ks1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssELIN2Impl#getKs2 <em>Ks2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssELIN2Impl#getPsslim <em>Psslim</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssELIN2Impl#getPpss <em>Ppss</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PssELIN2Impl extends PowerSystemStabilizerDynamicsImpl implements PssELIN2 {
    /**
     * The default value of the '{@link #getApss() <em>Apss</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getApss()
     * @generated
     * @ordered
     */
    protected static final Double APSS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getApss() <em>Apss</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getApss()
     * @generated
     * @ordered
     */
    protected Double apss = APSS_EDEFAULT;

    /**
     * This is true if the Apss attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean apssESet;

    /**
     * The default value of the '{@link #getTs3() <em>Ts3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTs3()
     * @generated
     * @ordered
     */
    protected static final Double TS3_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTs3() <em>Ts3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTs3()
     * @generated
     * @ordered
     */
    protected Double ts3 = TS3_EDEFAULT;

    /**
     * This is true if the Ts3 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ts3ESet;

    /**
     * The default value of the '{@link #getTs4() <em>Ts4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTs4()
     * @generated
     * @ordered
     */
    protected static final Double TS4_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTs4() <em>Ts4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTs4()
     * @generated
     * @ordered
     */
    protected Double ts4 = TS4_EDEFAULT;

    /**
     * This is true if the Ts4 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ts4ESet;

    /**
     * The default value of the '{@link #getTs5() <em>Ts5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTs5()
     * @generated
     * @ordered
     */
    protected static final Double TS5_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTs5() <em>Ts5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTs5()
     * @generated
     * @ordered
     */
    protected Double ts5 = TS5_EDEFAULT;

    /**
     * This is true if the Ts5 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ts5ESet;

    /**
     * The default value of the '{@link #getTs6() <em>Ts6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTs6()
     * @generated
     * @ordered
     */
    protected static final Double TS6_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTs6() <em>Ts6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTs6()
     * @generated
     * @ordered
     */
    protected Double ts6 = TS6_EDEFAULT;

    /**
     * This is true if the Ts6 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ts6ESet;

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
     * The default value of the '{@link #getPsslim() <em>Psslim</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPsslim()
     * @generated
     * @ordered
     */
    protected static final Double PSSLIM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPsslim() <em>Psslim</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPsslim()
     * @generated
     * @ordered
     */
    protected Double psslim = PSSLIM_EDEFAULT;

    /**
     * This is true if the Psslim attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean psslimESet;

    /**
     * The default value of the '{@link #getPpss() <em>Ppss</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPpss()
     * @generated
     * @ordered
     */
    protected static final Double PPSS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPpss() <em>Ppss</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPpss()
     * @generated
     * @ordered
     */
    protected Double ppss = PPSS_EDEFAULT;

    /**
     * This is true if the Ppss attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ppssESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PssELIN2Impl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getPssELIN2();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getApss() {
        return apss;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setApss( Double newApss ) {
        Double oldApss = apss;
        apss = newApss;
        boolean oldApssESet = apssESet;
        apssESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_ELIN2__APSS, oldApss, apss,
                    !oldApssESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetApss() {
        Double oldApss = apss;
        boolean oldApssESet = apssESet;
        apss = APSS_EDEFAULT;
        apssESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_ELIN2__APSS, oldApss,
                    APSS_EDEFAULT, oldApssESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetApss() {
        return apssESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTs3() {
        return ts3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTs3( Double newTs3 ) {
        Double oldTs3 = ts3;
        ts3 = newTs3;
        boolean oldTs3ESet = ts3ESet;
        ts3ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_ELIN2__TS3, oldTs3, ts3,
                    !oldTs3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTs3() {
        Double oldTs3 = ts3;
        boolean oldTs3ESet = ts3ESet;
        ts3 = TS3_EDEFAULT;
        ts3ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_ELIN2__TS3, oldTs3, TS3_EDEFAULT,
                    oldTs3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTs3() {
        return ts3ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTs4() {
        return ts4;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTs4( Double newTs4 ) {
        Double oldTs4 = ts4;
        ts4 = newTs4;
        boolean oldTs4ESet = ts4ESet;
        ts4ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_ELIN2__TS4, oldTs4, ts4,
                    !oldTs4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTs4() {
        Double oldTs4 = ts4;
        boolean oldTs4ESet = ts4ESet;
        ts4 = TS4_EDEFAULT;
        ts4ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_ELIN2__TS4, oldTs4, TS4_EDEFAULT,
                    oldTs4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTs4() {
        return ts4ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTs5() {
        return ts5;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTs5( Double newTs5 ) {
        Double oldTs5 = ts5;
        ts5 = newTs5;
        boolean oldTs5ESet = ts5ESet;
        ts5ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_ELIN2__TS5, oldTs5, ts5,
                    !oldTs5ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTs5() {
        Double oldTs5 = ts5;
        boolean oldTs5ESet = ts5ESet;
        ts5 = TS5_EDEFAULT;
        ts5ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_ELIN2__TS5, oldTs5, TS5_EDEFAULT,
                    oldTs5ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTs5() {
        return ts5ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTs6() {
        return ts6;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTs6( Double newTs6 ) {
        Double oldTs6 = ts6;
        ts6 = newTs6;
        boolean oldTs6ESet = ts6ESet;
        ts6ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_ELIN2__TS6, oldTs6, ts6,
                    !oldTs6ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTs6() {
        Double oldTs6 = ts6;
        boolean oldTs6ESet = ts6ESet;
        ts6 = TS6_EDEFAULT;
        ts6ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_ELIN2__TS6, oldTs6, TS6_EDEFAULT,
                    oldTs6ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTs6() {
        return ts6ESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_ELIN2__TS1, oldTs1, ts1,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_ELIN2__TS1, oldTs1, TS1_EDEFAULT,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_ELIN2__TS2, oldTs2, ts2,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_ELIN2__TS2, oldTs2, TS2_EDEFAULT,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_ELIN2__KS1, oldKs1, ks1,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_ELIN2__KS1, oldKs1, KS1_EDEFAULT,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_ELIN2__KS2, oldKs2, ks2,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_ELIN2__KS2, oldKs2, KS2_EDEFAULT,
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
    public Double getPsslim() {
        return psslim;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPsslim( Double newPsslim ) {
        Double oldPsslim = psslim;
        psslim = newPsslim;
        boolean oldPsslimESet = psslimESet;
        psslimESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_ELIN2__PSSLIM, oldPsslim, psslim,
                    !oldPsslimESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPsslim() {
        Double oldPsslim = psslim;
        boolean oldPsslimESet = psslimESet;
        psslim = PSSLIM_EDEFAULT;
        psslimESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_ELIN2__PSSLIM, oldPsslim,
                    PSSLIM_EDEFAULT, oldPsslimESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPsslim() {
        return psslimESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getPpss() {
        return ppss;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPpss( Double newPpss ) {
        Double oldPpss = ppss;
        ppss = newPpss;
        boolean oldPpssESet = ppssESet;
        ppssESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_ELIN2__PPSS, oldPpss, ppss,
                    !oldPpssESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPpss() {
        Double oldPpss = ppss;
        boolean oldPpssESet = ppssESet;
        ppss = PPSS_EDEFAULT;
        ppssESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_ELIN2__PPSS, oldPpss,
                    PPSS_EDEFAULT, oldPpssESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPpss() {
        return ppssESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.PSS_ELIN2__APSS:
            return getApss();
        case CimPackage.PSS_ELIN2__TS3:
            return getTs3();
        case CimPackage.PSS_ELIN2__TS4:
            return getTs4();
        case CimPackage.PSS_ELIN2__TS5:
            return getTs5();
        case CimPackage.PSS_ELIN2__TS6:
            return getTs6();
        case CimPackage.PSS_ELIN2__TS1:
            return getTs1();
        case CimPackage.PSS_ELIN2__TS2:
            return getTs2();
        case CimPackage.PSS_ELIN2__KS1:
            return getKs1();
        case CimPackage.PSS_ELIN2__KS2:
            return getKs2();
        case CimPackage.PSS_ELIN2__PSSLIM:
            return getPsslim();
        case CimPackage.PSS_ELIN2__PPSS:
            return getPpss();
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
        case CimPackage.PSS_ELIN2__APSS:
            setApss( ( Double ) newValue );
            return;
        case CimPackage.PSS_ELIN2__TS3:
            setTs3( ( Double ) newValue );
            return;
        case CimPackage.PSS_ELIN2__TS4:
            setTs4( ( Double ) newValue );
            return;
        case CimPackage.PSS_ELIN2__TS5:
            setTs5( ( Double ) newValue );
            return;
        case CimPackage.PSS_ELIN2__TS6:
            setTs6( ( Double ) newValue );
            return;
        case CimPackage.PSS_ELIN2__TS1:
            setTs1( ( Double ) newValue );
            return;
        case CimPackage.PSS_ELIN2__TS2:
            setTs2( ( Double ) newValue );
            return;
        case CimPackage.PSS_ELIN2__KS1:
            setKs1( ( Double ) newValue );
            return;
        case CimPackage.PSS_ELIN2__KS2:
            setKs2( ( Double ) newValue );
            return;
        case CimPackage.PSS_ELIN2__PSSLIM:
            setPsslim( ( Double ) newValue );
            return;
        case CimPackage.PSS_ELIN2__PPSS:
            setPpss( ( Double ) newValue );
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
        case CimPackage.PSS_ELIN2__APSS:
            unsetApss();
            return;
        case CimPackage.PSS_ELIN2__TS3:
            unsetTs3();
            return;
        case CimPackage.PSS_ELIN2__TS4:
            unsetTs4();
            return;
        case CimPackage.PSS_ELIN2__TS5:
            unsetTs5();
            return;
        case CimPackage.PSS_ELIN2__TS6:
            unsetTs6();
            return;
        case CimPackage.PSS_ELIN2__TS1:
            unsetTs1();
            return;
        case CimPackage.PSS_ELIN2__TS2:
            unsetTs2();
            return;
        case CimPackage.PSS_ELIN2__KS1:
            unsetKs1();
            return;
        case CimPackage.PSS_ELIN2__KS2:
            unsetKs2();
            return;
        case CimPackage.PSS_ELIN2__PSSLIM:
            unsetPsslim();
            return;
        case CimPackage.PSS_ELIN2__PPSS:
            unsetPpss();
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
        case CimPackage.PSS_ELIN2__APSS:
            return isSetApss();
        case CimPackage.PSS_ELIN2__TS3:
            return isSetTs3();
        case CimPackage.PSS_ELIN2__TS4:
            return isSetTs4();
        case CimPackage.PSS_ELIN2__TS5:
            return isSetTs5();
        case CimPackage.PSS_ELIN2__TS6:
            return isSetTs6();
        case CimPackage.PSS_ELIN2__TS1:
            return isSetTs1();
        case CimPackage.PSS_ELIN2__TS2:
            return isSetTs2();
        case CimPackage.PSS_ELIN2__KS1:
            return isSetKs1();
        case CimPackage.PSS_ELIN2__KS2:
            return isSetKs2();
        case CimPackage.PSS_ELIN2__PSSLIM:
            return isSetPsslim();
        case CimPackage.PSS_ELIN2__PPSS:
            return isSetPpss();
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
        result.append( " (apss: " );
        if( apssESet )
            result.append( apss );
        else
            result.append( "<unset>" );
        result.append( ", ts3: " );
        if( ts3ESet )
            result.append( ts3 );
        else
            result.append( "<unset>" );
        result.append( ", ts4: " );
        if( ts4ESet )
            result.append( ts4 );
        else
            result.append( "<unset>" );
        result.append( ", ts5: " );
        if( ts5ESet )
            result.append( ts5 );
        else
            result.append( "<unset>" );
        result.append( ", ts6: " );
        if( ts6ESet )
            result.append( ts6 );
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
        result.append( ", psslim: " );
        if( psslimESet )
            result.append( psslim );
        else
            result.append( "<unset>" );
        result.append( ", ppss: " );
        if( ppssESet )
            result.append( ppss );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //PssELIN2Impl

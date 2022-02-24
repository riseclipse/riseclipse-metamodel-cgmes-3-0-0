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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssRQB;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pss RQB</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssRQBImpl#getSibv <em>Sibv</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssRQBImpl#getT4f <em>T4f</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssRQBImpl#getT4m <em>T4m</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssRQBImpl#getKi2 <em>Ki2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssRQBImpl#getKi4 <em>Ki4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssRQBImpl#getKi3 <em>Ki3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssRQBImpl#getTomsl <em>Tomsl</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssRQBImpl#getT4mom <em>T4mom</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssRQBImpl#getKdpm <em>Kdpm</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssRQBImpl#getTomd <em>Tomd</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PssRQBImpl extends PowerSystemStabilizerDynamicsImpl implements PssRQB {
    /**
     * The default value of the '{@link #getSibv() <em>Sibv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSibv()
     * @generated
     * @ordered
     */
    protected static final Double SIBV_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSibv() <em>Sibv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSibv()
     * @generated
     * @ordered
     */
    protected Double sibv = SIBV_EDEFAULT;

    /**
     * This is true if the Sibv attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sibvESet;

    /**
     * The default value of the '{@link #getT4f() <em>T4f</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT4f()
     * @generated
     * @ordered
     */
    protected static final Double T4F_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getT4f() <em>T4f</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT4f()
     * @generated
     * @ordered
     */
    protected Double t4f = T4F_EDEFAULT;

    /**
     * This is true if the T4f attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean t4fESet;

    /**
     * The default value of the '{@link #getT4m() <em>T4m</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT4m()
     * @generated
     * @ordered
     */
    protected static final Double T4M_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getT4m() <em>T4m</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT4m()
     * @generated
     * @ordered
     */
    protected Double t4m = T4M_EDEFAULT;

    /**
     * This is true if the T4m attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean t4mESet;

    /**
     * The default value of the '{@link #getKi2() <em>Ki2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKi2()
     * @generated
     * @ordered
     */
    protected static final Double KI2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKi2() <em>Ki2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKi2()
     * @generated
     * @ordered
     */
    protected Double ki2 = KI2_EDEFAULT;

    /**
     * This is true if the Ki2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ki2ESet;

    /**
     * The default value of the '{@link #getKi4() <em>Ki4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKi4()
     * @generated
     * @ordered
     */
    protected static final Double KI4_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKi4() <em>Ki4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKi4()
     * @generated
     * @ordered
     */
    protected Double ki4 = KI4_EDEFAULT;

    /**
     * This is true if the Ki4 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ki4ESet;

    /**
     * The default value of the '{@link #getKi3() <em>Ki3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKi3()
     * @generated
     * @ordered
     */
    protected static final Double KI3_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKi3() <em>Ki3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKi3()
     * @generated
     * @ordered
     */
    protected Double ki3 = KI3_EDEFAULT;

    /**
     * This is true if the Ki3 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ki3ESet;

    /**
     * The default value of the '{@link #getTomsl() <em>Tomsl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTomsl()
     * @generated
     * @ordered
     */
    protected static final Double TOMSL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTomsl() <em>Tomsl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTomsl()
     * @generated
     * @ordered
     */
    protected Double tomsl = TOMSL_EDEFAULT;

    /**
     * This is true if the Tomsl attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tomslESet;

    /**
     * The default value of the '{@link #getT4mom() <em>T4mom</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT4mom()
     * @generated
     * @ordered
     */
    protected static final Double T4MOM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getT4mom() <em>T4mom</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT4mom()
     * @generated
     * @ordered
     */
    protected Double t4mom = T4MOM_EDEFAULT;

    /**
     * This is true if the T4mom attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean t4momESet;

    /**
     * The default value of the '{@link #getKdpm() <em>Kdpm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKdpm()
     * @generated
     * @ordered
     */
    protected static final Double KDPM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKdpm() <em>Kdpm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKdpm()
     * @generated
     * @ordered
     */
    protected Double kdpm = KDPM_EDEFAULT;

    /**
     * This is true if the Kdpm attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kdpmESet;

    /**
     * The default value of the '{@link #getTomd() <em>Tomd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTomd()
     * @generated
     * @ordered
     */
    protected static final Double TOMD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTomd() <em>Tomd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTomd()
     * @generated
     * @ordered
     */
    protected Double tomd = TOMD_EDEFAULT;

    /**
     * This is true if the Tomd attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tomdESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PssRQBImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getPssRQB();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getSibv() {
        return sibv;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSibv( Double newSibv ) {
        Double oldSibv = sibv;
        sibv = newSibv;
        boolean oldSibvESet = sibvESet;
        sibvESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_RQB__SIBV, oldSibv, sibv,
                    !oldSibvESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSibv() {
        Double oldSibv = sibv;
        boolean oldSibvESet = sibvESet;
        sibv = SIBV_EDEFAULT;
        sibvESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_RQB__SIBV, oldSibv, SIBV_EDEFAULT,
                    oldSibvESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSibv() {
        return sibvESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getT4f() {
        return t4f;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setT4f( Double newT4f ) {
        Double oldT4f = t4f;
        t4f = newT4f;
        boolean oldT4fESet = t4fESet;
        t4fESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_RQB__T4F, oldT4f, t4f,
                    !oldT4fESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetT4f() {
        Double oldT4f = t4f;
        boolean oldT4fESet = t4fESet;
        t4f = T4F_EDEFAULT;
        t4fESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_RQB__T4F, oldT4f, T4F_EDEFAULT,
                    oldT4fESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetT4f() {
        return t4fESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getT4m() {
        return t4m;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setT4m( Double newT4m ) {
        Double oldT4m = t4m;
        t4m = newT4m;
        boolean oldT4mESet = t4mESet;
        t4mESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_RQB__T4M, oldT4m, t4m,
                    !oldT4mESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetT4m() {
        Double oldT4m = t4m;
        boolean oldT4mESet = t4mESet;
        t4m = T4M_EDEFAULT;
        t4mESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_RQB__T4M, oldT4m, T4M_EDEFAULT,
                    oldT4mESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetT4m() {
        return t4mESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKi2() {
        return ki2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKi2( Double newKi2 ) {
        Double oldKi2 = ki2;
        ki2 = newKi2;
        boolean oldKi2ESet = ki2ESet;
        ki2ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_RQB__KI2, oldKi2, ki2,
                    !oldKi2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKi2() {
        Double oldKi2 = ki2;
        boolean oldKi2ESet = ki2ESet;
        ki2 = KI2_EDEFAULT;
        ki2ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_RQB__KI2, oldKi2, KI2_EDEFAULT,
                    oldKi2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKi2() {
        return ki2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKi4() {
        return ki4;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKi4( Double newKi4 ) {
        Double oldKi4 = ki4;
        ki4 = newKi4;
        boolean oldKi4ESet = ki4ESet;
        ki4ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_RQB__KI4, oldKi4, ki4,
                    !oldKi4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKi4() {
        Double oldKi4 = ki4;
        boolean oldKi4ESet = ki4ESet;
        ki4 = KI4_EDEFAULT;
        ki4ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_RQB__KI4, oldKi4, KI4_EDEFAULT,
                    oldKi4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKi4() {
        return ki4ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKi3() {
        return ki3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKi3( Double newKi3 ) {
        Double oldKi3 = ki3;
        ki3 = newKi3;
        boolean oldKi3ESet = ki3ESet;
        ki3ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_RQB__KI3, oldKi3, ki3,
                    !oldKi3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKi3() {
        Double oldKi3 = ki3;
        boolean oldKi3ESet = ki3ESet;
        ki3 = KI3_EDEFAULT;
        ki3ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_RQB__KI3, oldKi3, KI3_EDEFAULT,
                    oldKi3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKi3() {
        return ki3ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTomsl() {
        return tomsl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTomsl( Double newTomsl ) {
        Double oldTomsl = tomsl;
        tomsl = newTomsl;
        boolean oldTomslESet = tomslESet;
        tomslESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_RQB__TOMSL, oldTomsl, tomsl,
                    !oldTomslESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTomsl() {
        Double oldTomsl = tomsl;
        boolean oldTomslESet = tomslESet;
        tomsl = TOMSL_EDEFAULT;
        tomslESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_RQB__TOMSL, oldTomsl,
                    TOMSL_EDEFAULT, oldTomslESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTomsl() {
        return tomslESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getT4mom() {
        return t4mom;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setT4mom( Double newT4mom ) {
        Double oldT4mom = t4mom;
        t4mom = newT4mom;
        boolean oldT4momESet = t4momESet;
        t4momESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_RQB__T4MOM, oldT4mom, t4mom,
                    !oldT4momESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetT4mom() {
        Double oldT4mom = t4mom;
        boolean oldT4momESet = t4momESet;
        t4mom = T4MOM_EDEFAULT;
        t4momESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_RQB__T4MOM, oldT4mom,
                    T4MOM_EDEFAULT, oldT4momESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetT4mom() {
        return t4momESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKdpm() {
        return kdpm;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKdpm( Double newKdpm ) {
        Double oldKdpm = kdpm;
        kdpm = newKdpm;
        boolean oldKdpmESet = kdpmESet;
        kdpmESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_RQB__KDPM, oldKdpm, kdpm,
                    !oldKdpmESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKdpm() {
        Double oldKdpm = kdpm;
        boolean oldKdpmESet = kdpmESet;
        kdpm = KDPM_EDEFAULT;
        kdpmESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_RQB__KDPM, oldKdpm, KDPM_EDEFAULT,
                    oldKdpmESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKdpm() {
        return kdpmESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTomd() {
        return tomd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTomd( Double newTomd ) {
        Double oldTomd = tomd;
        tomd = newTomd;
        boolean oldTomdESet = tomdESet;
        tomdESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_RQB__TOMD, oldTomd, tomd,
                    !oldTomdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTomd() {
        Double oldTomd = tomd;
        boolean oldTomdESet = tomdESet;
        tomd = TOMD_EDEFAULT;
        tomdESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_RQB__TOMD, oldTomd, TOMD_EDEFAULT,
                    oldTomdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTomd() {
        return tomdESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.PSS_RQB__SIBV:
            return getSibv();
        case CimPackage.PSS_RQB__T4F:
            return getT4f();
        case CimPackage.PSS_RQB__T4M:
            return getT4m();
        case CimPackage.PSS_RQB__KI2:
            return getKi2();
        case CimPackage.PSS_RQB__KI4:
            return getKi4();
        case CimPackage.PSS_RQB__KI3:
            return getKi3();
        case CimPackage.PSS_RQB__TOMSL:
            return getTomsl();
        case CimPackage.PSS_RQB__T4MOM:
            return getT4mom();
        case CimPackage.PSS_RQB__KDPM:
            return getKdpm();
        case CimPackage.PSS_RQB__TOMD:
            return getTomd();
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
        case CimPackage.PSS_RQB__SIBV:
            setSibv( ( Double ) newValue );
            return;
        case CimPackage.PSS_RQB__T4F:
            setT4f( ( Double ) newValue );
            return;
        case CimPackage.PSS_RQB__T4M:
            setT4m( ( Double ) newValue );
            return;
        case CimPackage.PSS_RQB__KI2:
            setKi2( ( Double ) newValue );
            return;
        case CimPackage.PSS_RQB__KI4:
            setKi4( ( Double ) newValue );
            return;
        case CimPackage.PSS_RQB__KI3:
            setKi3( ( Double ) newValue );
            return;
        case CimPackage.PSS_RQB__TOMSL:
            setTomsl( ( Double ) newValue );
            return;
        case CimPackage.PSS_RQB__T4MOM:
            setT4mom( ( Double ) newValue );
            return;
        case CimPackage.PSS_RQB__KDPM:
            setKdpm( ( Double ) newValue );
            return;
        case CimPackage.PSS_RQB__TOMD:
            setTomd( ( Double ) newValue );
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
        case CimPackage.PSS_RQB__SIBV:
            unsetSibv();
            return;
        case CimPackage.PSS_RQB__T4F:
            unsetT4f();
            return;
        case CimPackage.PSS_RQB__T4M:
            unsetT4m();
            return;
        case CimPackage.PSS_RQB__KI2:
            unsetKi2();
            return;
        case CimPackage.PSS_RQB__KI4:
            unsetKi4();
            return;
        case CimPackage.PSS_RQB__KI3:
            unsetKi3();
            return;
        case CimPackage.PSS_RQB__TOMSL:
            unsetTomsl();
            return;
        case CimPackage.PSS_RQB__T4MOM:
            unsetT4mom();
            return;
        case CimPackage.PSS_RQB__KDPM:
            unsetKdpm();
            return;
        case CimPackage.PSS_RQB__TOMD:
            unsetTomd();
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
        case CimPackage.PSS_RQB__SIBV:
            return isSetSibv();
        case CimPackage.PSS_RQB__T4F:
            return isSetT4f();
        case CimPackage.PSS_RQB__T4M:
            return isSetT4m();
        case CimPackage.PSS_RQB__KI2:
            return isSetKi2();
        case CimPackage.PSS_RQB__KI4:
            return isSetKi4();
        case CimPackage.PSS_RQB__KI3:
            return isSetKi3();
        case CimPackage.PSS_RQB__TOMSL:
            return isSetTomsl();
        case CimPackage.PSS_RQB__T4MOM:
            return isSetT4mom();
        case CimPackage.PSS_RQB__KDPM:
            return isSetKdpm();
        case CimPackage.PSS_RQB__TOMD:
            return isSetTomd();
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
        result.append( " (sibv: " );
        if( sibvESet )
            result.append( sibv );
        else
            result.append( "<unset>" );
        result.append( ", t4f: " );
        if( t4fESet )
            result.append( t4f );
        else
            result.append( "<unset>" );
        result.append( ", t4m: " );
        if( t4mESet )
            result.append( t4m );
        else
            result.append( "<unset>" );
        result.append( ", ki2: " );
        if( ki2ESet )
            result.append( ki2 );
        else
            result.append( "<unset>" );
        result.append( ", ki4: " );
        if( ki4ESet )
            result.append( ki4 );
        else
            result.append( "<unset>" );
        result.append( ", ki3: " );
        if( ki3ESet )
            result.append( ki3 );
        else
            result.append( "<unset>" );
        result.append( ", tomsl: " );
        if( tomslESet )
            result.append( tomsl );
        else
            result.append( "<unset>" );
        result.append( ", t4mom: " );
        if( t4momESet )
            result.append( t4mom );
        else
            result.append( "<unset>" );
        result.append( ", kdpm: " );
        if( kdpmESet )
            result.append( kdpm );
        else
            result.append( "<unset>" );
        result.append( ", tomd: " );
        if( tomdESet )
            result.append( tomd );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //PssRQBImpl

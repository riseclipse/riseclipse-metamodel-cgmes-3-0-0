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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcRQB;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exc RQB</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcRQBImpl#getKi0 <em>Ki0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcRQBImpl#getKi1 <em>Ki1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcRQBImpl#getT4m <em>T4m</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcRQBImpl#getKlir <em>Klir</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcRQBImpl#getKlus <em>Klus</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcRQBImpl#getUcmax <em>Ucmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcRQBImpl#getUcmin <em>Ucmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcRQBImpl#getLsat <em>Lsat</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcRQBImpl#getMesu <em>Mesu</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcRQBImpl#getTc <em>Tc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcRQBImpl#getTe <em>Te</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcRQBImpl#getTf <em>Tf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcRQBImpl#getLus <em>Lus</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExcRQBImpl extends ExcitationSystemDynamicsImpl implements ExcRQB {
    /**
     * The default value of the '{@link #getKi0() <em>Ki0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKi0()
     * @generated
     * @ordered
     */
    protected static final Double KI0_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKi0() <em>Ki0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKi0()
     * @generated
     * @ordered
     */
    protected Double ki0 = KI0_EDEFAULT;

    /**
     * This is true if the Ki0 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ki0ESet;

    /**
     * The default value of the '{@link #getKi1() <em>Ki1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKi1()
     * @generated
     * @ordered
     */
    protected static final Double KI1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKi1() <em>Ki1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKi1()
     * @generated
     * @ordered
     */
    protected Double ki1 = KI1_EDEFAULT;

    /**
     * This is true if the Ki1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ki1ESet;

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
     * The default value of the '{@link #getKlir() <em>Klir</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKlir()
     * @generated
     * @ordered
     */
    protected static final Double KLIR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKlir() <em>Klir</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKlir()
     * @generated
     * @ordered
     */
    protected Double klir = KLIR_EDEFAULT;

    /**
     * This is true if the Klir attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean klirESet;

    /**
     * The default value of the '{@link #getKlus() <em>Klus</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKlus()
     * @generated
     * @ordered
     */
    protected static final Double KLUS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKlus() <em>Klus</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKlus()
     * @generated
     * @ordered
     */
    protected Double klus = KLUS_EDEFAULT;

    /**
     * This is true if the Klus attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean klusESet;

    /**
     * The default value of the '{@link #getUcmax() <em>Ucmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUcmax()
     * @generated
     * @ordered
     */
    protected static final Double UCMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUcmax() <em>Ucmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUcmax()
     * @generated
     * @ordered
     */
    protected Double ucmax = UCMAX_EDEFAULT;

    /**
     * This is true if the Ucmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ucmaxESet;

    /**
     * The default value of the '{@link #getUcmin() <em>Ucmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUcmin()
     * @generated
     * @ordered
     */
    protected static final Double UCMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUcmin() <em>Ucmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUcmin()
     * @generated
     * @ordered
     */
    protected Double ucmin = UCMIN_EDEFAULT;

    /**
     * This is true if the Ucmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ucminESet;

    /**
     * The default value of the '{@link #getLsat() <em>Lsat</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLsat()
     * @generated
     * @ordered
     */
    protected static final Double LSAT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLsat() <em>Lsat</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLsat()
     * @generated
     * @ordered
     */
    protected Double lsat = LSAT_EDEFAULT;

    /**
     * This is true if the Lsat attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lsatESet;

    /**
     * The default value of the '{@link #getMesu() <em>Mesu</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMesu()
     * @generated
     * @ordered
     */
    protected static final Double MESU_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMesu() <em>Mesu</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMesu()
     * @generated
     * @ordered
     */
    protected Double mesu = MESU_EDEFAULT;

    /**
     * This is true if the Mesu attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean mesuESet;

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
     * The default value of the '{@link #getLus() <em>Lus</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLus()
     * @generated
     * @ordered
     */
    protected static final Double LUS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLus() <em>Lus</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLus()
     * @generated
     * @ordered
     */
    protected Double lus = LUS_EDEFAULT;

    /**
     * This is true if the Lus attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lusESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExcRQBImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getExcRQB();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKi0() {
        return ki0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKi0( Double newKi0 ) {
        Double oldKi0 = ki0;
        ki0 = newKi0;
        boolean oldKi0ESet = ki0ESet;
        ki0ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_RQB__KI0, oldKi0, ki0,
                    !oldKi0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKi0() {
        Double oldKi0 = ki0;
        boolean oldKi0ESet = ki0ESet;
        ki0 = KI0_EDEFAULT;
        ki0ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_RQB__KI0, oldKi0, KI0_EDEFAULT,
                    oldKi0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKi0() {
        return ki0ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKi1() {
        return ki1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKi1( Double newKi1 ) {
        Double oldKi1 = ki1;
        ki1 = newKi1;
        boolean oldKi1ESet = ki1ESet;
        ki1ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_RQB__KI1, oldKi1, ki1,
                    !oldKi1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKi1() {
        Double oldKi1 = ki1;
        boolean oldKi1ESet = ki1ESet;
        ki1 = KI1_EDEFAULT;
        ki1ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_RQB__KI1, oldKi1, KI1_EDEFAULT,
                    oldKi1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKi1() {
        return ki1ESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_RQB__T4M, oldT4m, t4m,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_RQB__T4M, oldT4m, T4M_EDEFAULT,
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
    public Double getKlir() {
        return klir;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKlir( Double newKlir ) {
        Double oldKlir = klir;
        klir = newKlir;
        boolean oldKlirESet = klirESet;
        klirESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_RQB__KLIR, oldKlir, klir,
                    !oldKlirESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKlir() {
        Double oldKlir = klir;
        boolean oldKlirESet = klirESet;
        klir = KLIR_EDEFAULT;
        klirESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_RQB__KLIR, oldKlir, KLIR_EDEFAULT,
                    oldKlirESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKlir() {
        return klirESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKlus() {
        return klus;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKlus( Double newKlus ) {
        Double oldKlus = klus;
        klus = newKlus;
        boolean oldKlusESet = klusESet;
        klusESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_RQB__KLUS, oldKlus, klus,
                    !oldKlusESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKlus() {
        Double oldKlus = klus;
        boolean oldKlusESet = klusESet;
        klus = KLUS_EDEFAULT;
        klusESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_RQB__KLUS, oldKlus, KLUS_EDEFAULT,
                    oldKlusESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKlus() {
        return klusESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getUcmax() {
        return ucmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUcmax( Double newUcmax ) {
        Double oldUcmax = ucmax;
        ucmax = newUcmax;
        boolean oldUcmaxESet = ucmaxESet;
        ucmaxESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_RQB__UCMAX, oldUcmax, ucmax,
                    !oldUcmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUcmax() {
        Double oldUcmax = ucmax;
        boolean oldUcmaxESet = ucmaxESet;
        ucmax = UCMAX_EDEFAULT;
        ucmaxESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_RQB__UCMAX, oldUcmax,
                    UCMAX_EDEFAULT, oldUcmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUcmax() {
        return ucmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getUcmin() {
        return ucmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUcmin( Double newUcmin ) {
        Double oldUcmin = ucmin;
        ucmin = newUcmin;
        boolean oldUcminESet = ucminESet;
        ucminESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_RQB__UCMIN, oldUcmin, ucmin,
                    !oldUcminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUcmin() {
        Double oldUcmin = ucmin;
        boolean oldUcminESet = ucminESet;
        ucmin = UCMIN_EDEFAULT;
        ucminESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_RQB__UCMIN, oldUcmin,
                    UCMIN_EDEFAULT, oldUcminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUcmin() {
        return ucminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getLsat() {
        return lsat;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLsat( Double newLsat ) {
        Double oldLsat = lsat;
        lsat = newLsat;
        boolean oldLsatESet = lsatESet;
        lsatESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_RQB__LSAT, oldLsat, lsat,
                    !oldLsatESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLsat() {
        Double oldLsat = lsat;
        boolean oldLsatESet = lsatESet;
        lsat = LSAT_EDEFAULT;
        lsatESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_RQB__LSAT, oldLsat, LSAT_EDEFAULT,
                    oldLsatESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLsat() {
        return lsatESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getMesu() {
        return mesu;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMesu( Double newMesu ) {
        Double oldMesu = mesu;
        mesu = newMesu;
        boolean oldMesuESet = mesuESet;
        mesuESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_RQB__MESU, oldMesu, mesu,
                    !oldMesuESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMesu() {
        Double oldMesu = mesu;
        boolean oldMesuESet = mesuESet;
        mesu = MESU_EDEFAULT;
        mesuESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_RQB__MESU, oldMesu, MESU_EDEFAULT,
                    oldMesuESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMesu() {
        return mesuESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_RQB__TC, oldTc, tc, !oldTcESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_RQB__TC, oldTc, TC_EDEFAULT,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_RQB__TE, oldTe, te, !oldTeESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_RQB__TE, oldTe, TE_EDEFAULT,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_RQB__TF, oldTf, tf, !oldTfESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_RQB__TF, oldTf, TF_EDEFAULT,
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
    public Double getLus() {
        return lus;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLus( Double newLus ) {
        Double oldLus = lus;
        lus = newLus;
        boolean oldLusESet = lusESet;
        lusESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_RQB__LUS, oldLus, lus,
                    !oldLusESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLus() {
        Double oldLus = lus;
        boolean oldLusESet = lusESet;
        lus = LUS_EDEFAULT;
        lusESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_RQB__LUS, oldLus, LUS_EDEFAULT,
                    oldLusESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLus() {
        return lusESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.EXC_RQB__KI0:
            return getKi0();
        case CimPackage.EXC_RQB__KI1:
            return getKi1();
        case CimPackage.EXC_RQB__T4M:
            return getT4m();
        case CimPackage.EXC_RQB__KLIR:
            return getKlir();
        case CimPackage.EXC_RQB__KLUS:
            return getKlus();
        case CimPackage.EXC_RQB__UCMAX:
            return getUcmax();
        case CimPackage.EXC_RQB__UCMIN:
            return getUcmin();
        case CimPackage.EXC_RQB__LSAT:
            return getLsat();
        case CimPackage.EXC_RQB__MESU:
            return getMesu();
        case CimPackage.EXC_RQB__TC:
            return getTc();
        case CimPackage.EXC_RQB__TE:
            return getTe();
        case CimPackage.EXC_RQB__TF:
            return getTf();
        case CimPackage.EXC_RQB__LUS:
            return getLus();
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
        case CimPackage.EXC_RQB__KI0:
            setKi0( ( Double ) newValue );
            return;
        case CimPackage.EXC_RQB__KI1:
            setKi1( ( Double ) newValue );
            return;
        case CimPackage.EXC_RQB__T4M:
            setT4m( ( Double ) newValue );
            return;
        case CimPackage.EXC_RQB__KLIR:
            setKlir( ( Double ) newValue );
            return;
        case CimPackage.EXC_RQB__KLUS:
            setKlus( ( Double ) newValue );
            return;
        case CimPackage.EXC_RQB__UCMAX:
            setUcmax( ( Double ) newValue );
            return;
        case CimPackage.EXC_RQB__UCMIN:
            setUcmin( ( Double ) newValue );
            return;
        case CimPackage.EXC_RQB__LSAT:
            setLsat( ( Double ) newValue );
            return;
        case CimPackage.EXC_RQB__MESU:
            setMesu( ( Double ) newValue );
            return;
        case CimPackage.EXC_RQB__TC:
            setTc( ( Double ) newValue );
            return;
        case CimPackage.EXC_RQB__TE:
            setTe( ( Double ) newValue );
            return;
        case CimPackage.EXC_RQB__TF:
            setTf( ( Double ) newValue );
            return;
        case CimPackage.EXC_RQB__LUS:
            setLus( ( Double ) newValue );
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
        case CimPackage.EXC_RQB__KI0:
            unsetKi0();
            return;
        case CimPackage.EXC_RQB__KI1:
            unsetKi1();
            return;
        case CimPackage.EXC_RQB__T4M:
            unsetT4m();
            return;
        case CimPackage.EXC_RQB__KLIR:
            unsetKlir();
            return;
        case CimPackage.EXC_RQB__KLUS:
            unsetKlus();
            return;
        case CimPackage.EXC_RQB__UCMAX:
            unsetUcmax();
            return;
        case CimPackage.EXC_RQB__UCMIN:
            unsetUcmin();
            return;
        case CimPackage.EXC_RQB__LSAT:
            unsetLsat();
            return;
        case CimPackage.EXC_RQB__MESU:
            unsetMesu();
            return;
        case CimPackage.EXC_RQB__TC:
            unsetTc();
            return;
        case CimPackage.EXC_RQB__TE:
            unsetTe();
            return;
        case CimPackage.EXC_RQB__TF:
            unsetTf();
            return;
        case CimPackage.EXC_RQB__LUS:
            unsetLus();
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
        case CimPackage.EXC_RQB__KI0:
            return isSetKi0();
        case CimPackage.EXC_RQB__KI1:
            return isSetKi1();
        case CimPackage.EXC_RQB__T4M:
            return isSetT4m();
        case CimPackage.EXC_RQB__KLIR:
            return isSetKlir();
        case CimPackage.EXC_RQB__KLUS:
            return isSetKlus();
        case CimPackage.EXC_RQB__UCMAX:
            return isSetUcmax();
        case CimPackage.EXC_RQB__UCMIN:
            return isSetUcmin();
        case CimPackage.EXC_RQB__LSAT:
            return isSetLsat();
        case CimPackage.EXC_RQB__MESU:
            return isSetMesu();
        case CimPackage.EXC_RQB__TC:
            return isSetTc();
        case CimPackage.EXC_RQB__TE:
            return isSetTe();
        case CimPackage.EXC_RQB__TF:
            return isSetTf();
        case CimPackage.EXC_RQB__LUS:
            return isSetLus();
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
        result.append( " (ki0: " );
        if( ki0ESet )
            result.append( ki0 );
        else
            result.append( "<unset>" );
        result.append( ", ki1: " );
        if( ki1ESet )
            result.append( ki1 );
        else
            result.append( "<unset>" );
        result.append( ", t4m: " );
        if( t4mESet )
            result.append( t4m );
        else
            result.append( "<unset>" );
        result.append( ", klir: " );
        if( klirESet )
            result.append( klir );
        else
            result.append( "<unset>" );
        result.append( ", klus: " );
        if( klusESet )
            result.append( klus );
        else
            result.append( "<unset>" );
        result.append( ", ucmax: " );
        if( ucmaxESet )
            result.append( ucmax );
        else
            result.append( "<unset>" );
        result.append( ", ucmin: " );
        if( ucminESet )
            result.append( ucmin );
        else
            result.append( "<unset>" );
        result.append( ", lsat: " );
        if( lsatESet )
            result.append( lsat );
        else
            result.append( "<unset>" );
        result.append( ", mesu: " );
        if( mesuESet )
            result.append( mesu );
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
        result.append( ", tf: " );
        if( tfESet )
            result.append( tf );
        else
            result.append( "<unset>" );
        result.append( ", lus: " );
        if( lusESet )
            result.append( lus );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ExcRQBImpl

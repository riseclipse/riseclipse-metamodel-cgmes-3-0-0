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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC8B;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exc IEEEAC8B</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEAC8BImpl#getVe1 <em>Ve1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEAC8BImpl#getVe2 <em>Ve2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEAC8BImpl#getKe <em>Ke</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEAC8BImpl#getKa <em>Ka</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEAC8BImpl#getKc <em>Kc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEAC8BImpl#getKd <em>Kd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEAC8BImpl#getSeve1 <em>Seve1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEAC8BImpl#getSeve2 <em>Seve2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEAC8BImpl#getTe <em>Te</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEAC8BImpl#getTa <em>Ta</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEAC8BImpl#getVfemax <em>Vfemax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEAC8BImpl#getKpr <em>Kpr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEAC8BImpl#getKir <em>Kir</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEAC8BImpl#getTdr <em>Tdr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEAC8BImpl#getKdr <em>Kdr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEAC8BImpl#getVrmax <em>Vrmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEAC8BImpl#getVrmin <em>Vrmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEAC8BImpl#getVemin <em>Vemin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExcIEEEAC8BImpl extends ExcitationSystemDynamicsImpl implements ExcIEEEAC8B {
    /**
     * The default value of the '{@link #getVe1() <em>Ve1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVe1()
     * @generated
     * @ordered
     */
    protected static final Double VE1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVe1() <em>Ve1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVe1()
     * @generated
     * @ordered
     */
    protected Double ve1 = VE1_EDEFAULT;

    /**
     * This is true if the Ve1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ve1ESet;

    /**
     * The default value of the '{@link #getVe2() <em>Ve2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVe2()
     * @generated
     * @ordered
     */
    protected static final Double VE2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVe2() <em>Ve2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVe2()
     * @generated
     * @ordered
     */
    protected Double ve2 = VE2_EDEFAULT;

    /**
     * This is true if the Ve2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ve2ESet;

    /**
     * The default value of the '{@link #getKe() <em>Ke</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKe()
     * @generated
     * @ordered
     */
    protected static final Double KE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKe() <em>Ke</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKe()
     * @generated
     * @ordered
     */
    protected Double ke = KE_EDEFAULT;

    /**
     * This is true if the Ke attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean keESet;

    /**
     * The default value of the '{@link #getKa() <em>Ka</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKa()
     * @generated
     * @ordered
     */
    protected static final Double KA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKa() <em>Ka</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKa()
     * @generated
     * @ordered
     */
    protected Double ka = KA_EDEFAULT;

    /**
     * This is true if the Ka attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kaESet;

    /**
     * The default value of the '{@link #getKc() <em>Kc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKc()
     * @generated
     * @ordered
     */
    protected static final Double KC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKc() <em>Kc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKc()
     * @generated
     * @ordered
     */
    protected Double kc = KC_EDEFAULT;

    /**
     * This is true if the Kc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kcESet;

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
     * The default value of the '{@link #getSeve1() <em>Seve1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSeve1()
     * @generated
     * @ordered
     */
    protected static final Double SEVE1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSeve1() <em>Seve1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSeve1()
     * @generated
     * @ordered
     */
    protected Double seve1 = SEVE1_EDEFAULT;

    /**
     * This is true if the Seve1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean seve1ESet;

    /**
     * The default value of the '{@link #getSeve2() <em>Seve2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSeve2()
     * @generated
     * @ordered
     */
    protected static final Double SEVE2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSeve2() <em>Seve2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSeve2()
     * @generated
     * @ordered
     */
    protected Double seve2 = SEVE2_EDEFAULT;

    /**
     * This is true if the Seve2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean seve2ESet;

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
     * The default value of the '{@link #getVfemax() <em>Vfemax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVfemax()
     * @generated
     * @ordered
     */
    protected static final Double VFEMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVfemax() <em>Vfemax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVfemax()
     * @generated
     * @ordered
     */
    protected Double vfemax = VFEMAX_EDEFAULT;

    /**
     * This is true if the Vfemax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vfemaxESet;

    /**
     * The default value of the '{@link #getKpr() <em>Kpr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKpr()
     * @generated
     * @ordered
     */
    protected static final Double KPR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKpr() <em>Kpr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKpr()
     * @generated
     * @ordered
     */
    protected Double kpr = KPR_EDEFAULT;

    /**
     * This is true if the Kpr attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kprESet;

    /**
     * The default value of the '{@link #getKir() <em>Kir</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKir()
     * @generated
     * @ordered
     */
    protected static final Double KIR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKir() <em>Kir</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKir()
     * @generated
     * @ordered
     */
    protected Double kir = KIR_EDEFAULT;

    /**
     * This is true if the Kir attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kirESet;

    /**
     * The default value of the '{@link #getTdr() <em>Tdr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTdr()
     * @generated
     * @ordered
     */
    protected static final Double TDR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTdr() <em>Tdr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTdr()
     * @generated
     * @ordered
     */
    protected Double tdr = TDR_EDEFAULT;

    /**
     * This is true if the Tdr attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tdrESet;

    /**
     * The default value of the '{@link #getKdr() <em>Kdr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKdr()
     * @generated
     * @ordered
     */
    protected static final Double KDR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKdr() <em>Kdr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKdr()
     * @generated
     * @ordered
     */
    protected Double kdr = KDR_EDEFAULT;

    /**
     * This is true if the Kdr attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kdrESet;

    /**
     * The default value of the '{@link #getVrmax() <em>Vrmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVrmax()
     * @generated
     * @ordered
     */
    protected static final Double VRMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVrmax() <em>Vrmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVrmax()
     * @generated
     * @ordered
     */
    protected Double vrmax = VRMAX_EDEFAULT;

    /**
     * This is true if the Vrmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vrmaxESet;

    /**
     * The default value of the '{@link #getVrmin() <em>Vrmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVrmin()
     * @generated
     * @ordered
     */
    protected static final Double VRMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVrmin() <em>Vrmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVrmin()
     * @generated
     * @ordered
     */
    protected Double vrmin = VRMIN_EDEFAULT;

    /**
     * This is true if the Vrmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vrminESet;

    /**
     * The default value of the '{@link #getVemin() <em>Vemin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVemin()
     * @generated
     * @ordered
     */
    protected static final Double VEMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVemin() <em>Vemin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVemin()
     * @generated
     * @ordered
     */
    protected Double vemin = VEMIN_EDEFAULT;

    /**
     * This is true if the Vemin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean veminESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExcIEEEAC8BImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getExcIEEEAC8B();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVe1() {
        return ve1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVe1( Double newVe1 ) {
        Double oldVe1 = ve1;
        ve1 = newVe1;
        boolean oldVe1ESet = ve1ESet;
        ve1ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEAC8B__VE1, oldVe1, ve1,
                    !oldVe1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVe1() {
        Double oldVe1 = ve1;
        boolean oldVe1ESet = ve1ESet;
        ve1 = VE1_EDEFAULT;
        ve1ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEAC8B__VE1, oldVe1,
                    VE1_EDEFAULT, oldVe1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVe1() {
        return ve1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVe2() {
        return ve2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVe2( Double newVe2 ) {
        Double oldVe2 = ve2;
        ve2 = newVe2;
        boolean oldVe2ESet = ve2ESet;
        ve2ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEAC8B__VE2, oldVe2, ve2,
                    !oldVe2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVe2() {
        Double oldVe2 = ve2;
        boolean oldVe2ESet = ve2ESet;
        ve2 = VE2_EDEFAULT;
        ve2ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEAC8B__VE2, oldVe2,
                    VE2_EDEFAULT, oldVe2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVe2() {
        return ve2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKe() {
        return ke;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKe( Double newKe ) {
        Double oldKe = ke;
        ke = newKe;
        boolean oldKeESet = keESet;
        keESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEAC8B__KE, oldKe, ke,
                    !oldKeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKe() {
        Double oldKe = ke;
        boolean oldKeESet = keESet;
        ke = KE_EDEFAULT;
        keESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEAC8B__KE, oldKe, KE_EDEFAULT,
                    oldKeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKe() {
        return keESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKa() {
        return ka;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKa( Double newKa ) {
        Double oldKa = ka;
        ka = newKa;
        boolean oldKaESet = kaESet;
        kaESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEAC8B__KA, oldKa, ka,
                    !oldKaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKa() {
        Double oldKa = ka;
        boolean oldKaESet = kaESet;
        ka = KA_EDEFAULT;
        kaESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEAC8B__KA, oldKa, KA_EDEFAULT,
                    oldKaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKa() {
        return kaESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKc() {
        return kc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKc( Double newKc ) {
        Double oldKc = kc;
        kc = newKc;
        boolean oldKcESet = kcESet;
        kcESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEAC8B__KC, oldKc, kc,
                    !oldKcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKc() {
        Double oldKc = kc;
        boolean oldKcESet = kcESet;
        kc = KC_EDEFAULT;
        kcESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEAC8B__KC, oldKc, KC_EDEFAULT,
                    oldKcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKc() {
        return kcESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEAC8B__KD, oldKd, kd,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEAC8B__KD, oldKd, KD_EDEFAULT,
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
    public Double getSeve1() {
        return seve1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSeve1( Double newSeve1 ) {
        Double oldSeve1 = seve1;
        seve1 = newSeve1;
        boolean oldSeve1ESet = seve1ESet;
        seve1ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEAC8B__SEVE1, oldSeve1, seve1,
                    !oldSeve1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSeve1() {
        Double oldSeve1 = seve1;
        boolean oldSeve1ESet = seve1ESet;
        seve1 = SEVE1_EDEFAULT;
        seve1ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEAC8B__SEVE1, oldSeve1,
                    SEVE1_EDEFAULT, oldSeve1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSeve1() {
        return seve1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getSeve2() {
        return seve2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSeve2( Double newSeve2 ) {
        Double oldSeve2 = seve2;
        seve2 = newSeve2;
        boolean oldSeve2ESet = seve2ESet;
        seve2ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEAC8B__SEVE2, oldSeve2, seve2,
                    !oldSeve2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSeve2() {
        Double oldSeve2 = seve2;
        boolean oldSeve2ESet = seve2ESet;
        seve2 = SEVE2_EDEFAULT;
        seve2ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEAC8B__SEVE2, oldSeve2,
                    SEVE2_EDEFAULT, oldSeve2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSeve2() {
        return seve2ESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEAC8B__TE, oldTe, te,
                    !oldTeESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEAC8B__TE, oldTe, TE_EDEFAULT,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEAC8B__TA, oldTa, ta,
                    !oldTaESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEAC8B__TA, oldTa, TA_EDEFAULT,
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
    public Double getVfemax() {
        return vfemax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVfemax( Double newVfemax ) {
        Double oldVfemax = vfemax;
        vfemax = newVfemax;
        boolean oldVfemaxESet = vfemaxESet;
        vfemaxESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEAC8B__VFEMAX, oldVfemax, vfemax,
                    !oldVfemaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVfemax() {
        Double oldVfemax = vfemax;
        boolean oldVfemaxESet = vfemaxESet;
        vfemax = VFEMAX_EDEFAULT;
        vfemaxESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEAC8B__VFEMAX, oldVfemax,
                    VFEMAX_EDEFAULT, oldVfemaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVfemax() {
        return vfemaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKpr() {
        return kpr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKpr( Double newKpr ) {
        Double oldKpr = kpr;
        kpr = newKpr;
        boolean oldKprESet = kprESet;
        kprESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEAC8B__KPR, oldKpr, kpr,
                    !oldKprESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKpr() {
        Double oldKpr = kpr;
        boolean oldKprESet = kprESet;
        kpr = KPR_EDEFAULT;
        kprESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEAC8B__KPR, oldKpr,
                    KPR_EDEFAULT, oldKprESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKpr() {
        return kprESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKir() {
        return kir;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKir( Double newKir ) {
        Double oldKir = kir;
        kir = newKir;
        boolean oldKirESet = kirESet;
        kirESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEAC8B__KIR, oldKir, kir,
                    !oldKirESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKir() {
        Double oldKir = kir;
        boolean oldKirESet = kirESet;
        kir = KIR_EDEFAULT;
        kirESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEAC8B__KIR, oldKir,
                    KIR_EDEFAULT, oldKirESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKir() {
        return kirESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTdr() {
        return tdr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTdr( Double newTdr ) {
        Double oldTdr = tdr;
        tdr = newTdr;
        boolean oldTdrESet = tdrESet;
        tdrESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEAC8B__TDR, oldTdr, tdr,
                    !oldTdrESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTdr() {
        Double oldTdr = tdr;
        boolean oldTdrESet = tdrESet;
        tdr = TDR_EDEFAULT;
        tdrESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEAC8B__TDR, oldTdr,
                    TDR_EDEFAULT, oldTdrESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTdr() {
        return tdrESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKdr() {
        return kdr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKdr( Double newKdr ) {
        Double oldKdr = kdr;
        kdr = newKdr;
        boolean oldKdrESet = kdrESet;
        kdrESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEAC8B__KDR, oldKdr, kdr,
                    !oldKdrESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKdr() {
        Double oldKdr = kdr;
        boolean oldKdrESet = kdrESet;
        kdr = KDR_EDEFAULT;
        kdrESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEAC8B__KDR, oldKdr,
                    KDR_EDEFAULT, oldKdrESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKdr() {
        return kdrESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVrmax() {
        return vrmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVrmax( Double newVrmax ) {
        Double oldVrmax = vrmax;
        vrmax = newVrmax;
        boolean oldVrmaxESet = vrmaxESet;
        vrmaxESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEAC8B__VRMAX, oldVrmax, vrmax,
                    !oldVrmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVrmax() {
        Double oldVrmax = vrmax;
        boolean oldVrmaxESet = vrmaxESet;
        vrmax = VRMAX_EDEFAULT;
        vrmaxESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEAC8B__VRMAX, oldVrmax,
                    VRMAX_EDEFAULT, oldVrmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVrmax() {
        return vrmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVrmin() {
        return vrmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVrmin( Double newVrmin ) {
        Double oldVrmin = vrmin;
        vrmin = newVrmin;
        boolean oldVrminESet = vrminESet;
        vrminESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEAC8B__VRMIN, oldVrmin, vrmin,
                    !oldVrminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVrmin() {
        Double oldVrmin = vrmin;
        boolean oldVrminESet = vrminESet;
        vrmin = VRMIN_EDEFAULT;
        vrminESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEAC8B__VRMIN, oldVrmin,
                    VRMIN_EDEFAULT, oldVrminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVrmin() {
        return vrminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVemin() {
        return vemin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVemin( Double newVemin ) {
        Double oldVemin = vemin;
        vemin = newVemin;
        boolean oldVeminESet = veminESet;
        veminESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEAC8B__VEMIN, oldVemin, vemin,
                    !oldVeminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVemin() {
        Double oldVemin = vemin;
        boolean oldVeminESet = veminESet;
        vemin = VEMIN_EDEFAULT;
        veminESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEAC8B__VEMIN, oldVemin,
                    VEMIN_EDEFAULT, oldVeminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVemin() {
        return veminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.EXC_IEEEAC8B__VE1:
            return getVe1();
        case CimPackage.EXC_IEEEAC8B__VE2:
            return getVe2();
        case CimPackage.EXC_IEEEAC8B__KE:
            return getKe();
        case CimPackage.EXC_IEEEAC8B__KA:
            return getKa();
        case CimPackage.EXC_IEEEAC8B__KC:
            return getKc();
        case CimPackage.EXC_IEEEAC8B__KD:
            return getKd();
        case CimPackage.EXC_IEEEAC8B__SEVE1:
            return getSeve1();
        case CimPackage.EXC_IEEEAC8B__SEVE2:
            return getSeve2();
        case CimPackage.EXC_IEEEAC8B__TE:
            return getTe();
        case CimPackage.EXC_IEEEAC8B__TA:
            return getTa();
        case CimPackage.EXC_IEEEAC8B__VFEMAX:
            return getVfemax();
        case CimPackage.EXC_IEEEAC8B__KPR:
            return getKpr();
        case CimPackage.EXC_IEEEAC8B__KIR:
            return getKir();
        case CimPackage.EXC_IEEEAC8B__TDR:
            return getTdr();
        case CimPackage.EXC_IEEEAC8B__KDR:
            return getKdr();
        case CimPackage.EXC_IEEEAC8B__VRMAX:
            return getVrmax();
        case CimPackage.EXC_IEEEAC8B__VRMIN:
            return getVrmin();
        case CimPackage.EXC_IEEEAC8B__VEMIN:
            return getVemin();
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
        case CimPackage.EXC_IEEEAC8B__VE1:
            setVe1( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEAC8B__VE2:
            setVe2( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEAC8B__KE:
            setKe( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEAC8B__KA:
            setKa( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEAC8B__KC:
            setKc( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEAC8B__KD:
            setKd( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEAC8B__SEVE1:
            setSeve1( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEAC8B__SEVE2:
            setSeve2( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEAC8B__TE:
            setTe( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEAC8B__TA:
            setTa( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEAC8B__VFEMAX:
            setVfemax( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEAC8B__KPR:
            setKpr( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEAC8B__KIR:
            setKir( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEAC8B__TDR:
            setTdr( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEAC8B__KDR:
            setKdr( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEAC8B__VRMAX:
            setVrmax( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEAC8B__VRMIN:
            setVrmin( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEAC8B__VEMIN:
            setVemin( ( Double ) newValue );
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
        case CimPackage.EXC_IEEEAC8B__VE1:
            unsetVe1();
            return;
        case CimPackage.EXC_IEEEAC8B__VE2:
            unsetVe2();
            return;
        case CimPackage.EXC_IEEEAC8B__KE:
            unsetKe();
            return;
        case CimPackage.EXC_IEEEAC8B__KA:
            unsetKa();
            return;
        case CimPackage.EXC_IEEEAC8B__KC:
            unsetKc();
            return;
        case CimPackage.EXC_IEEEAC8B__KD:
            unsetKd();
            return;
        case CimPackage.EXC_IEEEAC8B__SEVE1:
            unsetSeve1();
            return;
        case CimPackage.EXC_IEEEAC8B__SEVE2:
            unsetSeve2();
            return;
        case CimPackage.EXC_IEEEAC8B__TE:
            unsetTe();
            return;
        case CimPackage.EXC_IEEEAC8B__TA:
            unsetTa();
            return;
        case CimPackage.EXC_IEEEAC8B__VFEMAX:
            unsetVfemax();
            return;
        case CimPackage.EXC_IEEEAC8B__KPR:
            unsetKpr();
            return;
        case CimPackage.EXC_IEEEAC8B__KIR:
            unsetKir();
            return;
        case CimPackage.EXC_IEEEAC8B__TDR:
            unsetTdr();
            return;
        case CimPackage.EXC_IEEEAC8B__KDR:
            unsetKdr();
            return;
        case CimPackage.EXC_IEEEAC8B__VRMAX:
            unsetVrmax();
            return;
        case CimPackage.EXC_IEEEAC8B__VRMIN:
            unsetVrmin();
            return;
        case CimPackage.EXC_IEEEAC8B__VEMIN:
            unsetVemin();
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
        case CimPackage.EXC_IEEEAC8B__VE1:
            return isSetVe1();
        case CimPackage.EXC_IEEEAC8B__VE2:
            return isSetVe2();
        case CimPackage.EXC_IEEEAC8B__KE:
            return isSetKe();
        case CimPackage.EXC_IEEEAC8B__KA:
            return isSetKa();
        case CimPackage.EXC_IEEEAC8B__KC:
            return isSetKc();
        case CimPackage.EXC_IEEEAC8B__KD:
            return isSetKd();
        case CimPackage.EXC_IEEEAC8B__SEVE1:
            return isSetSeve1();
        case CimPackage.EXC_IEEEAC8B__SEVE2:
            return isSetSeve2();
        case CimPackage.EXC_IEEEAC8B__TE:
            return isSetTe();
        case CimPackage.EXC_IEEEAC8B__TA:
            return isSetTa();
        case CimPackage.EXC_IEEEAC8B__VFEMAX:
            return isSetVfemax();
        case CimPackage.EXC_IEEEAC8B__KPR:
            return isSetKpr();
        case CimPackage.EXC_IEEEAC8B__KIR:
            return isSetKir();
        case CimPackage.EXC_IEEEAC8B__TDR:
            return isSetTdr();
        case CimPackage.EXC_IEEEAC8B__KDR:
            return isSetKdr();
        case CimPackage.EXC_IEEEAC8B__VRMAX:
            return isSetVrmax();
        case CimPackage.EXC_IEEEAC8B__VRMIN:
            return isSetVrmin();
        case CimPackage.EXC_IEEEAC8B__VEMIN:
            return isSetVemin();
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
        result.append( " (ve1: " );
        if( ve1ESet )
            result.append( ve1 );
        else
            result.append( "<unset>" );
        result.append( ", ve2: " );
        if( ve2ESet )
            result.append( ve2 );
        else
            result.append( "<unset>" );
        result.append( ", ke: " );
        if( keESet )
            result.append( ke );
        else
            result.append( "<unset>" );
        result.append( ", ka: " );
        if( kaESet )
            result.append( ka );
        else
            result.append( "<unset>" );
        result.append( ", kc: " );
        if( kcESet )
            result.append( kc );
        else
            result.append( "<unset>" );
        result.append( ", kd: " );
        if( kdESet )
            result.append( kd );
        else
            result.append( "<unset>" );
        result.append( ", seve1: " );
        if( seve1ESet )
            result.append( seve1 );
        else
            result.append( "<unset>" );
        result.append( ", seve2: " );
        if( seve2ESet )
            result.append( seve2 );
        else
            result.append( "<unset>" );
        result.append( ", te: " );
        if( teESet )
            result.append( te );
        else
            result.append( "<unset>" );
        result.append( ", ta: " );
        if( taESet )
            result.append( ta );
        else
            result.append( "<unset>" );
        result.append( ", vfemax: " );
        if( vfemaxESet )
            result.append( vfemax );
        else
            result.append( "<unset>" );
        result.append( ", kpr: " );
        if( kprESet )
            result.append( kpr );
        else
            result.append( "<unset>" );
        result.append( ", kir: " );
        if( kirESet )
            result.append( kir );
        else
            result.append( "<unset>" );
        result.append( ", tdr: " );
        if( tdrESet )
            result.append( tdr );
        else
            result.append( "<unset>" );
        result.append( ", kdr: " );
        if( kdrESet )
            result.append( kdr );
        else
            result.append( "<unset>" );
        result.append( ", vrmax: " );
        if( vrmaxESet )
            result.append( vrmax );
        else
            result.append( "<unset>" );
        result.append( ", vrmin: " );
        if( vrminESet )
            result.append( vrmin );
        else
            result.append( "<unset>" );
        result.append( ", vemin: " );
        if( veminESet )
            result.append( vemin );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ExcIEEEAC8BImpl

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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.InputSignalKind;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE1A;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pss IEEE1A</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssIEEE1AImpl#getKs <em>Ks</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssIEEE1AImpl#getA1 <em>A1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssIEEE1AImpl#getA2 <em>A2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssIEEE1AImpl#getT6 <em>T6</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssIEEE1AImpl#getT4 <em>T4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssIEEE1AImpl#getT5 <em>T5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssIEEE1AImpl#getT2 <em>T2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssIEEE1AImpl#getT3 <em>T3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssIEEE1AImpl#getT1 <em>T1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssIEEE1AImpl#getInputSignalType <em>Input Signal Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssIEEE1AImpl#getVrmax <em>Vrmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssIEEE1AImpl#getVrmin <em>Vrmin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PssIEEE1AImpl extends PowerSystemStabilizerDynamicsImpl implements PssIEEE1A {
    /**
     * The default value of the '{@link #getKs() <em>Ks</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKs()
     * @generated
     * @ordered
     */
    protected static final Double KS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKs() <em>Ks</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKs()
     * @generated
     * @ordered
     */
    protected Double ks = KS_EDEFAULT;

    /**
     * This is true if the Ks attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ksESet;

    /**
     * The default value of the '{@link #getA1() <em>A1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getA1()
     * @generated
     * @ordered
     */
    protected static final Double A1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getA1() <em>A1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getA1()
     * @generated
     * @ordered
     */
    protected Double a1 = A1_EDEFAULT;

    /**
     * This is true if the A1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean a1ESet;

    /**
     * The default value of the '{@link #getA2() <em>A2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getA2()
     * @generated
     * @ordered
     */
    protected static final Double A2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getA2() <em>A2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getA2()
     * @generated
     * @ordered
     */
    protected Double a2 = A2_EDEFAULT;

    /**
     * This is true if the A2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean a2ESet;

    /**
     * The default value of the '{@link #getT6() <em>T6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT6()
     * @generated
     * @ordered
     */
    protected static final Double T6_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getT6() <em>T6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT6()
     * @generated
     * @ordered
     */
    protected Double t6 = T6_EDEFAULT;

    /**
     * This is true if the T6 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean t6ESet;

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
     * The default value of the '{@link #getT5() <em>T5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT5()
     * @generated
     * @ordered
     */
    protected static final Double T5_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getT5() <em>T5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT5()
     * @generated
     * @ordered
     */
    protected Double t5 = T5_EDEFAULT;

    /**
     * This is true if the T5 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean t5ESet;

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
     * The default value of the '{@link #getInputSignalType() <em>Input Signal Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInputSignalType()
     * @generated
     * @ordered
     */
    protected static final InputSignalKind INPUT_SIGNAL_TYPE_EDEFAULT = InputSignalKind.BUS_VOLTAGE;

    /**
     * The cached value of the '{@link #getInputSignalType() <em>Input Signal Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInputSignalType()
     * @generated
     * @ordered
     */
    protected InputSignalKind inputSignalType = INPUT_SIGNAL_TYPE_EDEFAULT;

    /**
     * This is true if the Input Signal Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean inputSignalTypeESet;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PssIEEE1AImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getPssIEEE1A();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKs() {
        return ks;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKs( Double newKs ) {
        Double oldKs = ks;
        ks = newKs;
        boolean oldKsESet = ksESet;
        ksESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE1A__KS, oldKs, ks,
                    !oldKsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKs() {
        Double oldKs = ks;
        boolean oldKsESet = ksESet;
        ks = KS_EDEFAULT;
        ksESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_IEEE1A__KS, oldKs, KS_EDEFAULT,
                    oldKsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKs() {
        return ksESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getA1() {
        return a1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setA1( Double newA1 ) {
        Double oldA1 = a1;
        a1 = newA1;
        boolean oldA1ESet = a1ESet;
        a1ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE1A__A1, oldA1, a1,
                    !oldA1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetA1() {
        Double oldA1 = a1;
        boolean oldA1ESet = a1ESet;
        a1 = A1_EDEFAULT;
        a1ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_IEEE1A__A1, oldA1, A1_EDEFAULT,
                    oldA1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetA1() {
        return a1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getA2() {
        return a2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setA2( Double newA2 ) {
        Double oldA2 = a2;
        a2 = newA2;
        boolean oldA2ESet = a2ESet;
        a2ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE1A__A2, oldA2, a2,
                    !oldA2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetA2() {
        Double oldA2 = a2;
        boolean oldA2ESet = a2ESet;
        a2 = A2_EDEFAULT;
        a2ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_IEEE1A__A2, oldA2, A2_EDEFAULT,
                    oldA2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetA2() {
        return a2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getT6() {
        return t6;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setT6( Double newT6 ) {
        Double oldT6 = t6;
        t6 = newT6;
        boolean oldT6ESet = t6ESet;
        t6ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE1A__T6, oldT6, t6,
                    !oldT6ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetT6() {
        Double oldT6 = t6;
        boolean oldT6ESet = t6ESet;
        t6 = T6_EDEFAULT;
        t6ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_IEEE1A__T6, oldT6, T6_EDEFAULT,
                    oldT6ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetT6() {
        return t6ESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE1A__T4, oldT4, t4,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_IEEE1A__T4, oldT4, T4_EDEFAULT,
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
    public Double getT5() {
        return t5;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setT5( Double newT5 ) {
        Double oldT5 = t5;
        t5 = newT5;
        boolean oldT5ESet = t5ESet;
        t5ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE1A__T5, oldT5, t5,
                    !oldT5ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetT5() {
        Double oldT5 = t5;
        boolean oldT5ESet = t5ESet;
        t5 = T5_EDEFAULT;
        t5ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_IEEE1A__T5, oldT5, T5_EDEFAULT,
                    oldT5ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetT5() {
        return t5ESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE1A__T2, oldT2, t2,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_IEEE1A__T2, oldT2, T2_EDEFAULT,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE1A__T3, oldT3, t3,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_IEEE1A__T3, oldT3, T3_EDEFAULT,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE1A__T1, oldT1, t1,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_IEEE1A__T1, oldT1, T1_EDEFAULT,
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
    public InputSignalKind getInputSignalType() {
        return inputSignalType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInputSignalType( InputSignalKind newInputSignalType ) {
        InputSignalKind oldInputSignalType = inputSignalType;
        inputSignalType = newInputSignalType == null ? INPUT_SIGNAL_TYPE_EDEFAULT : newInputSignalType;
        boolean oldInputSignalTypeESet = inputSignalTypeESet;
        inputSignalTypeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE1A__INPUT_SIGNAL_TYPE,
                    oldInputSignalType, inputSignalType, !oldInputSignalTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetInputSignalType() {
        InputSignalKind oldInputSignalType = inputSignalType;
        boolean oldInputSignalTypeESet = inputSignalTypeESet;
        inputSignalType = INPUT_SIGNAL_TYPE_EDEFAULT;
        inputSignalTypeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_IEEE1A__INPUT_SIGNAL_TYPE,
                    oldInputSignalType, INPUT_SIGNAL_TYPE_EDEFAULT, oldInputSignalTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetInputSignalType() {
        return inputSignalTypeESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE1A__VRMAX, oldVrmax, vrmax,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_IEEE1A__VRMAX, oldVrmax,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE1A__VRMIN, oldVrmin, vrmin,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_IEEE1A__VRMIN, oldVrmin,
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
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.PSS_IEEE1A__KS:
            return getKs();
        case CimPackage.PSS_IEEE1A__A1:
            return getA1();
        case CimPackage.PSS_IEEE1A__A2:
            return getA2();
        case CimPackage.PSS_IEEE1A__T6:
            return getT6();
        case CimPackage.PSS_IEEE1A__T4:
            return getT4();
        case CimPackage.PSS_IEEE1A__T5:
            return getT5();
        case CimPackage.PSS_IEEE1A__T2:
            return getT2();
        case CimPackage.PSS_IEEE1A__T3:
            return getT3();
        case CimPackage.PSS_IEEE1A__T1:
            return getT1();
        case CimPackage.PSS_IEEE1A__INPUT_SIGNAL_TYPE:
            return getInputSignalType();
        case CimPackage.PSS_IEEE1A__VRMAX:
            return getVrmax();
        case CimPackage.PSS_IEEE1A__VRMIN:
            return getVrmin();
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
        case CimPackage.PSS_IEEE1A__KS:
            setKs( ( Double ) newValue );
            return;
        case CimPackage.PSS_IEEE1A__A1:
            setA1( ( Double ) newValue );
            return;
        case CimPackage.PSS_IEEE1A__A2:
            setA2( ( Double ) newValue );
            return;
        case CimPackage.PSS_IEEE1A__T6:
            setT6( ( Double ) newValue );
            return;
        case CimPackage.PSS_IEEE1A__T4:
            setT4( ( Double ) newValue );
            return;
        case CimPackage.PSS_IEEE1A__T5:
            setT5( ( Double ) newValue );
            return;
        case CimPackage.PSS_IEEE1A__T2:
            setT2( ( Double ) newValue );
            return;
        case CimPackage.PSS_IEEE1A__T3:
            setT3( ( Double ) newValue );
            return;
        case CimPackage.PSS_IEEE1A__T1:
            setT1( ( Double ) newValue );
            return;
        case CimPackage.PSS_IEEE1A__INPUT_SIGNAL_TYPE:
            setInputSignalType( ( InputSignalKind ) newValue );
            return;
        case CimPackage.PSS_IEEE1A__VRMAX:
            setVrmax( ( Double ) newValue );
            return;
        case CimPackage.PSS_IEEE1A__VRMIN:
            setVrmin( ( Double ) newValue );
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
        case CimPackage.PSS_IEEE1A__KS:
            unsetKs();
            return;
        case CimPackage.PSS_IEEE1A__A1:
            unsetA1();
            return;
        case CimPackage.PSS_IEEE1A__A2:
            unsetA2();
            return;
        case CimPackage.PSS_IEEE1A__T6:
            unsetT6();
            return;
        case CimPackage.PSS_IEEE1A__T4:
            unsetT4();
            return;
        case CimPackage.PSS_IEEE1A__T5:
            unsetT5();
            return;
        case CimPackage.PSS_IEEE1A__T2:
            unsetT2();
            return;
        case CimPackage.PSS_IEEE1A__T3:
            unsetT3();
            return;
        case CimPackage.PSS_IEEE1A__T1:
            unsetT1();
            return;
        case CimPackage.PSS_IEEE1A__INPUT_SIGNAL_TYPE:
            unsetInputSignalType();
            return;
        case CimPackage.PSS_IEEE1A__VRMAX:
            unsetVrmax();
            return;
        case CimPackage.PSS_IEEE1A__VRMIN:
            unsetVrmin();
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
        case CimPackage.PSS_IEEE1A__KS:
            return isSetKs();
        case CimPackage.PSS_IEEE1A__A1:
            return isSetA1();
        case CimPackage.PSS_IEEE1A__A2:
            return isSetA2();
        case CimPackage.PSS_IEEE1A__T6:
            return isSetT6();
        case CimPackage.PSS_IEEE1A__T4:
            return isSetT4();
        case CimPackage.PSS_IEEE1A__T5:
            return isSetT5();
        case CimPackage.PSS_IEEE1A__T2:
            return isSetT2();
        case CimPackage.PSS_IEEE1A__T3:
            return isSetT3();
        case CimPackage.PSS_IEEE1A__T1:
            return isSetT1();
        case CimPackage.PSS_IEEE1A__INPUT_SIGNAL_TYPE:
            return isSetInputSignalType();
        case CimPackage.PSS_IEEE1A__VRMAX:
            return isSetVrmax();
        case CimPackage.PSS_IEEE1A__VRMIN:
            return isSetVrmin();
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
        result.append( " (ks: " );
        if( ksESet )
            result.append( ks );
        else
            result.append( "<unset>" );
        result.append( ", a1: " );
        if( a1ESet )
            result.append( a1 );
        else
            result.append( "<unset>" );
        result.append( ", a2: " );
        if( a2ESet )
            result.append( a2 );
        else
            result.append( "<unset>" );
        result.append( ", t6: " );
        if( t6ESet )
            result.append( t6 );
        else
            result.append( "<unset>" );
        result.append( ", t4: " );
        if( t4ESet )
            result.append( t4 );
        else
            result.append( "<unset>" );
        result.append( ", t5: " );
        if( t5ESet )
            result.append( t5 );
        else
            result.append( "<unset>" );
        result.append( ", t2: " );
        if( t2ESet )
            result.append( t2 );
        else
            result.append( "<unset>" );
        result.append( ", t3: " );
        if( t3ESet )
            result.append( t3 );
        else
            result.append( "<unset>" );
        result.append( ", t1: " );
        if( t1ESet )
            result.append( t1 );
        else
            result.append( "<unset>" );
        result.append( ", inputSignalType: " );
        if( inputSignalTypeESet )
            result.append( inputSignalType );
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
        result.append( ')' );
        return result.toString();
    }

} //PssIEEE1AImpl

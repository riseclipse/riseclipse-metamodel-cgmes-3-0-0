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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pss IEEE3B</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssIEEE3BImpl#getA5 <em>A5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssIEEE3BImpl#getA4 <em>A4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssIEEE3BImpl#getA3 <em>A3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssIEEE3BImpl#getA2 <em>A2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssIEEE3BImpl#getA8 <em>A8</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssIEEE3BImpl#getA7 <em>A7</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssIEEE3BImpl#getA6 <em>A6</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssIEEE3BImpl#getA1 <em>A1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssIEEE3BImpl#getT2 <em>T2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssIEEE3BImpl#getT1 <em>T1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssIEEE3BImpl#getKs2 <em>Ks2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssIEEE3BImpl#getKs1 <em>Ks1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssIEEE3BImpl#getVstmax <em>Vstmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssIEEE3BImpl#getVstmin <em>Vstmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssIEEE3BImpl#getTw3 <em>Tw3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssIEEE3BImpl#getTw2 <em>Tw2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PssIEEE3BImpl#getTw1 <em>Tw1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PssIEEE3BImpl extends PowerSystemStabilizerDynamicsImpl implements PssIEEE3B {
    /**
     * The default value of the '{@link #getA5() <em>A5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getA5()
     * @generated
     * @ordered
     */
    protected static final Double A5_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getA5() <em>A5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getA5()
     * @generated
     * @ordered
     */
    protected Double a5 = A5_EDEFAULT;

    /**
     * This is true if the A5 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean a5ESet;

    /**
     * The default value of the '{@link #getA4() <em>A4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getA4()
     * @generated
     * @ordered
     */
    protected static final Double A4_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getA4() <em>A4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getA4()
     * @generated
     * @ordered
     */
    protected Double a4 = A4_EDEFAULT;

    /**
     * This is true if the A4 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean a4ESet;

    /**
     * The default value of the '{@link #getA3() <em>A3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getA3()
     * @generated
     * @ordered
     */
    protected static final Double A3_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getA3() <em>A3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getA3()
     * @generated
     * @ordered
     */
    protected Double a3 = A3_EDEFAULT;

    /**
     * This is true if the A3 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean a3ESet;

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
     * The default value of the '{@link #getA8() <em>A8</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getA8()
     * @generated
     * @ordered
     */
    protected static final Double A8_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getA8() <em>A8</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getA8()
     * @generated
     * @ordered
     */
    protected Double a8 = A8_EDEFAULT;

    /**
     * This is true if the A8 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean a8ESet;

    /**
     * The default value of the '{@link #getA7() <em>A7</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getA7()
     * @generated
     * @ordered
     */
    protected static final Double A7_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getA7() <em>A7</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getA7()
     * @generated
     * @ordered
     */
    protected Double a7 = A7_EDEFAULT;

    /**
     * This is true if the A7 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean a7ESet;

    /**
     * The default value of the '{@link #getA6() <em>A6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getA6()
     * @generated
     * @ordered
     */
    protected static final Double A6_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getA6() <em>A6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getA6()
     * @generated
     * @ordered
     */
    protected Double a6 = A6_EDEFAULT;

    /**
     * This is true if the A6 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean a6ESet;

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
     * The default value of the '{@link #getVstmax() <em>Vstmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVstmax()
     * @generated
     * @ordered
     */
    protected static final Double VSTMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVstmax() <em>Vstmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVstmax()
     * @generated
     * @ordered
     */
    protected Double vstmax = VSTMAX_EDEFAULT;

    /**
     * This is true if the Vstmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vstmaxESet;

    /**
     * The default value of the '{@link #getVstmin() <em>Vstmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVstmin()
     * @generated
     * @ordered
     */
    protected static final Double VSTMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVstmin() <em>Vstmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVstmin()
     * @generated
     * @ordered
     */
    protected Double vstmin = VSTMIN_EDEFAULT;

    /**
     * This is true if the Vstmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vstminESet;

    /**
     * The default value of the '{@link #getTw3() <em>Tw3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTw3()
     * @generated
     * @ordered
     */
    protected static final Double TW3_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTw3() <em>Tw3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTw3()
     * @generated
     * @ordered
     */
    protected Double tw3 = TW3_EDEFAULT;

    /**
     * This is true if the Tw3 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tw3ESet;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PssIEEE3BImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getPssIEEE3B();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getA5() {
        return a5;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setA5( Double newA5 ) {
        Double oldA5 = a5;
        a5 = newA5;
        boolean oldA5ESet = a5ESet;
        a5ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE3B__A5, oldA5, a5,
                    !oldA5ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetA5() {
        Double oldA5 = a5;
        boolean oldA5ESet = a5ESet;
        a5 = A5_EDEFAULT;
        a5ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_IEEE3B__A5, oldA5, A5_EDEFAULT,
                    oldA5ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetA5() {
        return a5ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getA4() {
        return a4;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setA4( Double newA4 ) {
        Double oldA4 = a4;
        a4 = newA4;
        boolean oldA4ESet = a4ESet;
        a4ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE3B__A4, oldA4, a4,
                    !oldA4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetA4() {
        Double oldA4 = a4;
        boolean oldA4ESet = a4ESet;
        a4 = A4_EDEFAULT;
        a4ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_IEEE3B__A4, oldA4, A4_EDEFAULT,
                    oldA4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetA4() {
        return a4ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getA3() {
        return a3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setA3( Double newA3 ) {
        Double oldA3 = a3;
        a3 = newA3;
        boolean oldA3ESet = a3ESet;
        a3ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE3B__A3, oldA3, a3,
                    !oldA3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetA3() {
        Double oldA3 = a3;
        boolean oldA3ESet = a3ESet;
        a3 = A3_EDEFAULT;
        a3ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_IEEE3B__A3, oldA3, A3_EDEFAULT,
                    oldA3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetA3() {
        return a3ESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE3B__A2, oldA2, a2,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_IEEE3B__A2, oldA2, A2_EDEFAULT,
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
    public Double getA8() {
        return a8;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setA8( Double newA8 ) {
        Double oldA8 = a8;
        a8 = newA8;
        boolean oldA8ESet = a8ESet;
        a8ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE3B__A8, oldA8, a8,
                    !oldA8ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetA8() {
        Double oldA8 = a8;
        boolean oldA8ESet = a8ESet;
        a8 = A8_EDEFAULT;
        a8ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_IEEE3B__A8, oldA8, A8_EDEFAULT,
                    oldA8ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetA8() {
        return a8ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getA7() {
        return a7;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setA7( Double newA7 ) {
        Double oldA7 = a7;
        a7 = newA7;
        boolean oldA7ESet = a7ESet;
        a7ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE3B__A7, oldA7, a7,
                    !oldA7ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetA7() {
        Double oldA7 = a7;
        boolean oldA7ESet = a7ESet;
        a7 = A7_EDEFAULT;
        a7ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_IEEE3B__A7, oldA7, A7_EDEFAULT,
                    oldA7ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetA7() {
        return a7ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getA6() {
        return a6;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setA6( Double newA6 ) {
        Double oldA6 = a6;
        a6 = newA6;
        boolean oldA6ESet = a6ESet;
        a6ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE3B__A6, oldA6, a6,
                    !oldA6ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetA6() {
        Double oldA6 = a6;
        boolean oldA6ESet = a6ESet;
        a6 = A6_EDEFAULT;
        a6ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_IEEE3B__A6, oldA6, A6_EDEFAULT,
                    oldA6ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetA6() {
        return a6ESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE3B__A1, oldA1, a1,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_IEEE3B__A1, oldA1, A1_EDEFAULT,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE3B__T2, oldT2, t2,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_IEEE3B__T2, oldT2, T2_EDEFAULT,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE3B__T1, oldT1, t1,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_IEEE3B__T1, oldT1, T1_EDEFAULT,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE3B__KS2, oldKs2, ks2,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_IEEE3B__KS2, oldKs2, KS2_EDEFAULT,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE3B__KS1, oldKs1, ks1,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_IEEE3B__KS1, oldKs1, KS1_EDEFAULT,
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
    public Double getVstmax() {
        return vstmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVstmax( Double newVstmax ) {
        Double oldVstmax = vstmax;
        vstmax = newVstmax;
        boolean oldVstmaxESet = vstmaxESet;
        vstmaxESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE3B__VSTMAX, oldVstmax, vstmax,
                    !oldVstmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVstmax() {
        Double oldVstmax = vstmax;
        boolean oldVstmaxESet = vstmaxESet;
        vstmax = VSTMAX_EDEFAULT;
        vstmaxESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_IEEE3B__VSTMAX, oldVstmax,
                    VSTMAX_EDEFAULT, oldVstmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVstmax() {
        return vstmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVstmin() {
        return vstmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVstmin( Double newVstmin ) {
        Double oldVstmin = vstmin;
        vstmin = newVstmin;
        boolean oldVstminESet = vstminESet;
        vstminESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE3B__VSTMIN, oldVstmin, vstmin,
                    !oldVstminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVstmin() {
        Double oldVstmin = vstmin;
        boolean oldVstminESet = vstminESet;
        vstmin = VSTMIN_EDEFAULT;
        vstminESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_IEEE3B__VSTMIN, oldVstmin,
                    VSTMIN_EDEFAULT, oldVstminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVstmin() {
        return vstminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTw3() {
        return tw3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTw3( Double newTw3 ) {
        Double oldTw3 = tw3;
        tw3 = newTw3;
        boolean oldTw3ESet = tw3ESet;
        tw3ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE3B__TW3, oldTw3, tw3,
                    !oldTw3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTw3() {
        Double oldTw3 = tw3;
        boolean oldTw3ESet = tw3ESet;
        tw3 = TW3_EDEFAULT;
        tw3ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_IEEE3B__TW3, oldTw3, TW3_EDEFAULT,
                    oldTw3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTw3() {
        return tw3ESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE3B__TW2, oldTw2, tw2,
                    !oldTw2ESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_IEEE3B__TW2, oldTw2, TW2_EDEFAULT,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PSS_IEEE3B__TW1, oldTw1, tw1,
                    !oldTw1ESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PSS_IEEE3B__TW1, oldTw1, TW1_EDEFAULT,
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
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.PSS_IEEE3B__A5:
            return getA5();
        case CimPackage.PSS_IEEE3B__A4:
            return getA4();
        case CimPackage.PSS_IEEE3B__A3:
            return getA3();
        case CimPackage.PSS_IEEE3B__A2:
            return getA2();
        case CimPackage.PSS_IEEE3B__A8:
            return getA8();
        case CimPackage.PSS_IEEE3B__A7:
            return getA7();
        case CimPackage.PSS_IEEE3B__A6:
            return getA6();
        case CimPackage.PSS_IEEE3B__A1:
            return getA1();
        case CimPackage.PSS_IEEE3B__T2:
            return getT2();
        case CimPackage.PSS_IEEE3B__T1:
            return getT1();
        case CimPackage.PSS_IEEE3B__KS2:
            return getKs2();
        case CimPackage.PSS_IEEE3B__KS1:
            return getKs1();
        case CimPackage.PSS_IEEE3B__VSTMAX:
            return getVstmax();
        case CimPackage.PSS_IEEE3B__VSTMIN:
            return getVstmin();
        case CimPackage.PSS_IEEE3B__TW3:
            return getTw3();
        case CimPackage.PSS_IEEE3B__TW2:
            return getTw2();
        case CimPackage.PSS_IEEE3B__TW1:
            return getTw1();
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
        case CimPackage.PSS_IEEE3B__A5:
            setA5( ( Double ) newValue );
            return;
        case CimPackage.PSS_IEEE3B__A4:
            setA4( ( Double ) newValue );
            return;
        case CimPackage.PSS_IEEE3B__A3:
            setA3( ( Double ) newValue );
            return;
        case CimPackage.PSS_IEEE3B__A2:
            setA2( ( Double ) newValue );
            return;
        case CimPackage.PSS_IEEE3B__A8:
            setA8( ( Double ) newValue );
            return;
        case CimPackage.PSS_IEEE3B__A7:
            setA7( ( Double ) newValue );
            return;
        case CimPackage.PSS_IEEE3B__A6:
            setA6( ( Double ) newValue );
            return;
        case CimPackage.PSS_IEEE3B__A1:
            setA1( ( Double ) newValue );
            return;
        case CimPackage.PSS_IEEE3B__T2:
            setT2( ( Double ) newValue );
            return;
        case CimPackage.PSS_IEEE3B__T1:
            setT1( ( Double ) newValue );
            return;
        case CimPackage.PSS_IEEE3B__KS2:
            setKs2( ( Double ) newValue );
            return;
        case CimPackage.PSS_IEEE3B__KS1:
            setKs1( ( Double ) newValue );
            return;
        case CimPackage.PSS_IEEE3B__VSTMAX:
            setVstmax( ( Double ) newValue );
            return;
        case CimPackage.PSS_IEEE3B__VSTMIN:
            setVstmin( ( Double ) newValue );
            return;
        case CimPackage.PSS_IEEE3B__TW3:
            setTw3( ( Double ) newValue );
            return;
        case CimPackage.PSS_IEEE3B__TW2:
            setTw2( ( Double ) newValue );
            return;
        case CimPackage.PSS_IEEE3B__TW1:
            setTw1( ( Double ) newValue );
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
        case CimPackage.PSS_IEEE3B__A5:
            unsetA5();
            return;
        case CimPackage.PSS_IEEE3B__A4:
            unsetA4();
            return;
        case CimPackage.PSS_IEEE3B__A3:
            unsetA3();
            return;
        case CimPackage.PSS_IEEE3B__A2:
            unsetA2();
            return;
        case CimPackage.PSS_IEEE3B__A8:
            unsetA8();
            return;
        case CimPackage.PSS_IEEE3B__A7:
            unsetA7();
            return;
        case CimPackage.PSS_IEEE3B__A6:
            unsetA6();
            return;
        case CimPackage.PSS_IEEE3B__A1:
            unsetA1();
            return;
        case CimPackage.PSS_IEEE3B__T2:
            unsetT2();
            return;
        case CimPackage.PSS_IEEE3B__T1:
            unsetT1();
            return;
        case CimPackage.PSS_IEEE3B__KS2:
            unsetKs2();
            return;
        case CimPackage.PSS_IEEE3B__KS1:
            unsetKs1();
            return;
        case CimPackage.PSS_IEEE3B__VSTMAX:
            unsetVstmax();
            return;
        case CimPackage.PSS_IEEE3B__VSTMIN:
            unsetVstmin();
            return;
        case CimPackage.PSS_IEEE3B__TW3:
            unsetTw3();
            return;
        case CimPackage.PSS_IEEE3B__TW2:
            unsetTw2();
            return;
        case CimPackage.PSS_IEEE3B__TW1:
            unsetTw1();
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
        case CimPackage.PSS_IEEE3B__A5:
            return isSetA5();
        case CimPackage.PSS_IEEE3B__A4:
            return isSetA4();
        case CimPackage.PSS_IEEE3B__A3:
            return isSetA3();
        case CimPackage.PSS_IEEE3B__A2:
            return isSetA2();
        case CimPackage.PSS_IEEE3B__A8:
            return isSetA8();
        case CimPackage.PSS_IEEE3B__A7:
            return isSetA7();
        case CimPackage.PSS_IEEE3B__A6:
            return isSetA6();
        case CimPackage.PSS_IEEE3B__A1:
            return isSetA1();
        case CimPackage.PSS_IEEE3B__T2:
            return isSetT2();
        case CimPackage.PSS_IEEE3B__T1:
            return isSetT1();
        case CimPackage.PSS_IEEE3B__KS2:
            return isSetKs2();
        case CimPackage.PSS_IEEE3B__KS1:
            return isSetKs1();
        case CimPackage.PSS_IEEE3B__VSTMAX:
            return isSetVstmax();
        case CimPackage.PSS_IEEE3B__VSTMIN:
            return isSetVstmin();
        case CimPackage.PSS_IEEE3B__TW3:
            return isSetTw3();
        case CimPackage.PSS_IEEE3B__TW2:
            return isSetTw2();
        case CimPackage.PSS_IEEE3B__TW1:
            return isSetTw1();
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
        result.append( " (a5: " );
        if( a5ESet )
            result.append( a5 );
        else
            result.append( "<unset>" );
        result.append( ", a4: " );
        if( a4ESet )
            result.append( a4 );
        else
            result.append( "<unset>" );
        result.append( ", a3: " );
        if( a3ESet )
            result.append( a3 );
        else
            result.append( "<unset>" );
        result.append( ", a2: " );
        if( a2ESet )
            result.append( a2 );
        else
            result.append( "<unset>" );
        result.append( ", a8: " );
        if( a8ESet )
            result.append( a8 );
        else
            result.append( "<unset>" );
        result.append( ", a7: " );
        if( a7ESet )
            result.append( a7 );
        else
            result.append( "<unset>" );
        result.append( ", a6: " );
        if( a6ESet )
            result.append( a6 );
        else
            result.append( "<unset>" );
        result.append( ", a1: " );
        if( a1ESet )
            result.append( a1 );
        else
            result.append( "<unset>" );
        result.append( ", t2: " );
        if( t2ESet )
            result.append( t2 );
        else
            result.append( "<unset>" );
        result.append( ", t1: " );
        if( t1ESet )
            result.append( t1 );
        else
            result.append( "<unset>" );
        result.append( ", ks2: " );
        if( ks2ESet )
            result.append( ks2 );
        else
            result.append( "<unset>" );
        result.append( ", ks1: " );
        if( ks1ESet )
            result.append( ks1 );
        else
            result.append( "<unset>" );
        result.append( ", vstmax: " );
        if( vstmaxESet )
            result.append( vstmax );
        else
            result.append( "<unset>" );
        result.append( ", vstmin: " );
        if( vstminESet )
            result.append( vstmin );
        else
            result.append( "<unset>" );
        result.append( ", tw3: " );
        if( tw3ESet )
            result.append( tw3 );
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
        result.append( ')' );
        return result.toString();
    }

} //PssIEEE3BImpl

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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAVR7;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exc AVR7</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcAVR7Impl#getVmin5 <em>Vmin5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcAVR7Impl#getVmin3 <em>Vmin3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcAVR7Impl#getVmin1 <em>Vmin1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcAVR7Impl#getVmax5 <em>Vmax5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcAVR7Impl#getVmax3 <em>Vmax3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcAVR7Impl#getVmax1 <em>Vmax1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcAVR7Impl#getK1 <em>K1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcAVR7Impl#getK5 <em>K5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcAVR7Impl#getK3 <em>K3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcAVR7Impl#getA4 <em>A4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcAVR7Impl#getA3 <em>A3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcAVR7Impl#getA2 <em>A2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcAVR7Impl#getA1 <em>A1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcAVR7Impl#getA6 <em>A6</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcAVR7Impl#getA5 <em>A5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcAVR7Impl#getT6 <em>T6</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcAVR7Impl#getT5 <em>T5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcAVR7Impl#getT4 <em>T4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcAVR7Impl#getT3 <em>T3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcAVR7Impl#getT2 <em>T2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcAVR7Impl#getT1 <em>T1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExcAVR7Impl extends ExcitationSystemDynamicsImpl implements ExcAVR7 {
    /**
     * The default value of the '{@link #getVmin5() <em>Vmin5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVmin5()
     * @generated
     * @ordered
     */
    protected static final Double VMIN5_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVmin5() <em>Vmin5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVmin5()
     * @generated
     * @ordered
     */
    protected Double vmin5 = VMIN5_EDEFAULT;

    /**
     * This is true if the Vmin5 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vmin5ESet;

    /**
     * The default value of the '{@link #getVmin3() <em>Vmin3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVmin3()
     * @generated
     * @ordered
     */
    protected static final Double VMIN3_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVmin3() <em>Vmin3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVmin3()
     * @generated
     * @ordered
     */
    protected Double vmin3 = VMIN3_EDEFAULT;

    /**
     * This is true if the Vmin3 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vmin3ESet;

    /**
     * The default value of the '{@link #getVmin1() <em>Vmin1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVmin1()
     * @generated
     * @ordered
     */
    protected static final Double VMIN1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVmin1() <em>Vmin1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVmin1()
     * @generated
     * @ordered
     */
    protected Double vmin1 = VMIN1_EDEFAULT;

    /**
     * This is true if the Vmin1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vmin1ESet;

    /**
     * The default value of the '{@link #getVmax5() <em>Vmax5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVmax5()
     * @generated
     * @ordered
     */
    protected static final Double VMAX5_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVmax5() <em>Vmax5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVmax5()
     * @generated
     * @ordered
     */
    protected Double vmax5 = VMAX5_EDEFAULT;

    /**
     * This is true if the Vmax5 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vmax5ESet;

    /**
     * The default value of the '{@link #getVmax3() <em>Vmax3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVmax3()
     * @generated
     * @ordered
     */
    protected static final Double VMAX3_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVmax3() <em>Vmax3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVmax3()
     * @generated
     * @ordered
     */
    protected Double vmax3 = VMAX3_EDEFAULT;

    /**
     * This is true if the Vmax3 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vmax3ESet;

    /**
     * The default value of the '{@link #getVmax1() <em>Vmax1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVmax1()
     * @generated
     * @ordered
     */
    protected static final Double VMAX1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVmax1() <em>Vmax1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVmax1()
     * @generated
     * @ordered
     */
    protected Double vmax1 = VMAX1_EDEFAULT;

    /**
     * This is true if the Vmax1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vmax1ESet;

    /**
     * The default value of the '{@link #getK1() <em>K1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getK1()
     * @generated
     * @ordered
     */
    protected static final Double K1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getK1() <em>K1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getK1()
     * @generated
     * @ordered
     */
    protected Double k1 = K1_EDEFAULT;

    /**
     * This is true if the K1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean k1ESet;

    /**
     * The default value of the '{@link #getK5() <em>K5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getK5()
     * @generated
     * @ordered
     */
    protected static final Double K5_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getK5() <em>K5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getK5()
     * @generated
     * @ordered
     */
    protected Double k5 = K5_EDEFAULT;

    /**
     * This is true if the K5 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean k5ESet;

    /**
     * The default value of the '{@link #getK3() <em>K3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getK3()
     * @generated
     * @ordered
     */
    protected static final Double K3_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getK3() <em>K3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getK3()
     * @generated
     * @ordered
     */
    protected Double k3 = K3_EDEFAULT;

    /**
     * This is true if the K3 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean k3ESet;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExcAVR7Impl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getExcAVR7();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVmin5() {
        return vmin5;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVmin5( Double newVmin5 ) {
        Double oldVmin5 = vmin5;
        vmin5 = newVmin5;
        boolean oldVmin5ESet = vmin5ESet;
        vmin5ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_AVR7__VMIN5, oldVmin5, vmin5,
                    !oldVmin5ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVmin5() {
        Double oldVmin5 = vmin5;
        boolean oldVmin5ESet = vmin5ESet;
        vmin5 = VMIN5_EDEFAULT;
        vmin5ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_AVR7__VMIN5, oldVmin5,
                    VMIN5_EDEFAULT, oldVmin5ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVmin5() {
        return vmin5ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVmin3() {
        return vmin3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVmin3( Double newVmin3 ) {
        Double oldVmin3 = vmin3;
        vmin3 = newVmin3;
        boolean oldVmin3ESet = vmin3ESet;
        vmin3ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_AVR7__VMIN3, oldVmin3, vmin3,
                    !oldVmin3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVmin3() {
        Double oldVmin3 = vmin3;
        boolean oldVmin3ESet = vmin3ESet;
        vmin3 = VMIN3_EDEFAULT;
        vmin3ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_AVR7__VMIN3, oldVmin3,
                    VMIN3_EDEFAULT, oldVmin3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVmin3() {
        return vmin3ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVmin1() {
        return vmin1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVmin1( Double newVmin1 ) {
        Double oldVmin1 = vmin1;
        vmin1 = newVmin1;
        boolean oldVmin1ESet = vmin1ESet;
        vmin1ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_AVR7__VMIN1, oldVmin1, vmin1,
                    !oldVmin1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVmin1() {
        Double oldVmin1 = vmin1;
        boolean oldVmin1ESet = vmin1ESet;
        vmin1 = VMIN1_EDEFAULT;
        vmin1ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_AVR7__VMIN1, oldVmin1,
                    VMIN1_EDEFAULT, oldVmin1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVmin1() {
        return vmin1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVmax5() {
        return vmax5;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVmax5( Double newVmax5 ) {
        Double oldVmax5 = vmax5;
        vmax5 = newVmax5;
        boolean oldVmax5ESet = vmax5ESet;
        vmax5ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_AVR7__VMAX5, oldVmax5, vmax5,
                    !oldVmax5ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVmax5() {
        Double oldVmax5 = vmax5;
        boolean oldVmax5ESet = vmax5ESet;
        vmax5 = VMAX5_EDEFAULT;
        vmax5ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_AVR7__VMAX5, oldVmax5,
                    VMAX5_EDEFAULT, oldVmax5ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVmax5() {
        return vmax5ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVmax3() {
        return vmax3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVmax3( Double newVmax3 ) {
        Double oldVmax3 = vmax3;
        vmax3 = newVmax3;
        boolean oldVmax3ESet = vmax3ESet;
        vmax3ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_AVR7__VMAX3, oldVmax3, vmax3,
                    !oldVmax3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVmax3() {
        Double oldVmax3 = vmax3;
        boolean oldVmax3ESet = vmax3ESet;
        vmax3 = VMAX3_EDEFAULT;
        vmax3ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_AVR7__VMAX3, oldVmax3,
                    VMAX3_EDEFAULT, oldVmax3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVmax3() {
        return vmax3ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVmax1() {
        return vmax1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVmax1( Double newVmax1 ) {
        Double oldVmax1 = vmax1;
        vmax1 = newVmax1;
        boolean oldVmax1ESet = vmax1ESet;
        vmax1ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_AVR7__VMAX1, oldVmax1, vmax1,
                    !oldVmax1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVmax1() {
        Double oldVmax1 = vmax1;
        boolean oldVmax1ESet = vmax1ESet;
        vmax1 = VMAX1_EDEFAULT;
        vmax1ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_AVR7__VMAX1, oldVmax1,
                    VMAX1_EDEFAULT, oldVmax1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVmax1() {
        return vmax1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getK1() {
        return k1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setK1( Double newK1 ) {
        Double oldK1 = k1;
        k1 = newK1;
        boolean oldK1ESet = k1ESet;
        k1ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_AVR7__K1, oldK1, k1, !oldK1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetK1() {
        Double oldK1 = k1;
        boolean oldK1ESet = k1ESet;
        k1 = K1_EDEFAULT;
        k1ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_AVR7__K1, oldK1, K1_EDEFAULT,
                    oldK1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetK1() {
        return k1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getK5() {
        return k5;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setK5( Double newK5 ) {
        Double oldK5 = k5;
        k5 = newK5;
        boolean oldK5ESet = k5ESet;
        k5ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_AVR7__K5, oldK5, k5, !oldK5ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetK5() {
        Double oldK5 = k5;
        boolean oldK5ESet = k5ESet;
        k5 = K5_EDEFAULT;
        k5ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_AVR7__K5, oldK5, K5_EDEFAULT,
                    oldK5ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetK5() {
        return k5ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getK3() {
        return k3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setK3( Double newK3 ) {
        Double oldK3 = k3;
        k3 = newK3;
        boolean oldK3ESet = k3ESet;
        k3ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_AVR7__K3, oldK3, k3, !oldK3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetK3() {
        Double oldK3 = k3;
        boolean oldK3ESet = k3ESet;
        k3 = K3_EDEFAULT;
        k3ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_AVR7__K3, oldK3, K3_EDEFAULT,
                    oldK3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetK3() {
        return k3ESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_AVR7__A4, oldA4, a4, !oldA4ESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_AVR7__A4, oldA4, A4_EDEFAULT,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_AVR7__A3, oldA3, a3, !oldA3ESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_AVR7__A3, oldA3, A3_EDEFAULT,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_AVR7__A2, oldA2, a2, !oldA2ESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_AVR7__A2, oldA2, A2_EDEFAULT,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_AVR7__A1, oldA1, a1, !oldA1ESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_AVR7__A1, oldA1, A1_EDEFAULT,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_AVR7__A6, oldA6, a6, !oldA6ESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_AVR7__A6, oldA6, A6_EDEFAULT,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_AVR7__A5, oldA5, a5, !oldA5ESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_AVR7__A5, oldA5, A5_EDEFAULT,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_AVR7__T6, oldT6, t6, !oldT6ESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_AVR7__T6, oldT6, T6_EDEFAULT,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_AVR7__T5, oldT5, t5, !oldT5ESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_AVR7__T5, oldT5, T5_EDEFAULT,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_AVR7__T4, oldT4, t4, !oldT4ESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_AVR7__T4, oldT4, T4_EDEFAULT,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_AVR7__T3, oldT3, t3, !oldT3ESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_AVR7__T3, oldT3, T3_EDEFAULT,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_AVR7__T2, oldT2, t2, !oldT2ESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_AVR7__T2, oldT2, T2_EDEFAULT,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_AVR7__T1, oldT1, t1, !oldT1ESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_AVR7__T1, oldT1, T1_EDEFAULT,
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
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.EXC_AVR7__VMIN5:
            return getVmin5();
        case CimPackage.EXC_AVR7__VMIN3:
            return getVmin3();
        case CimPackage.EXC_AVR7__VMIN1:
            return getVmin1();
        case CimPackage.EXC_AVR7__VMAX5:
            return getVmax5();
        case CimPackage.EXC_AVR7__VMAX3:
            return getVmax3();
        case CimPackage.EXC_AVR7__VMAX1:
            return getVmax1();
        case CimPackage.EXC_AVR7__K1:
            return getK1();
        case CimPackage.EXC_AVR7__K5:
            return getK5();
        case CimPackage.EXC_AVR7__K3:
            return getK3();
        case CimPackage.EXC_AVR7__A4:
            return getA4();
        case CimPackage.EXC_AVR7__A3:
            return getA3();
        case CimPackage.EXC_AVR7__A2:
            return getA2();
        case CimPackage.EXC_AVR7__A1:
            return getA1();
        case CimPackage.EXC_AVR7__A6:
            return getA6();
        case CimPackage.EXC_AVR7__A5:
            return getA5();
        case CimPackage.EXC_AVR7__T6:
            return getT6();
        case CimPackage.EXC_AVR7__T5:
            return getT5();
        case CimPackage.EXC_AVR7__T4:
            return getT4();
        case CimPackage.EXC_AVR7__T3:
            return getT3();
        case CimPackage.EXC_AVR7__T2:
            return getT2();
        case CimPackage.EXC_AVR7__T1:
            return getT1();
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
        case CimPackage.EXC_AVR7__VMIN5:
            setVmin5( ( Double ) newValue );
            return;
        case CimPackage.EXC_AVR7__VMIN3:
            setVmin3( ( Double ) newValue );
            return;
        case CimPackage.EXC_AVR7__VMIN1:
            setVmin1( ( Double ) newValue );
            return;
        case CimPackage.EXC_AVR7__VMAX5:
            setVmax5( ( Double ) newValue );
            return;
        case CimPackage.EXC_AVR7__VMAX3:
            setVmax3( ( Double ) newValue );
            return;
        case CimPackage.EXC_AVR7__VMAX1:
            setVmax1( ( Double ) newValue );
            return;
        case CimPackage.EXC_AVR7__K1:
            setK1( ( Double ) newValue );
            return;
        case CimPackage.EXC_AVR7__K5:
            setK5( ( Double ) newValue );
            return;
        case CimPackage.EXC_AVR7__K3:
            setK3( ( Double ) newValue );
            return;
        case CimPackage.EXC_AVR7__A4:
            setA4( ( Double ) newValue );
            return;
        case CimPackage.EXC_AVR7__A3:
            setA3( ( Double ) newValue );
            return;
        case CimPackage.EXC_AVR7__A2:
            setA2( ( Double ) newValue );
            return;
        case CimPackage.EXC_AVR7__A1:
            setA1( ( Double ) newValue );
            return;
        case CimPackage.EXC_AVR7__A6:
            setA6( ( Double ) newValue );
            return;
        case CimPackage.EXC_AVR7__A5:
            setA5( ( Double ) newValue );
            return;
        case CimPackage.EXC_AVR7__T6:
            setT6( ( Double ) newValue );
            return;
        case CimPackage.EXC_AVR7__T5:
            setT5( ( Double ) newValue );
            return;
        case CimPackage.EXC_AVR7__T4:
            setT4( ( Double ) newValue );
            return;
        case CimPackage.EXC_AVR7__T3:
            setT3( ( Double ) newValue );
            return;
        case CimPackage.EXC_AVR7__T2:
            setT2( ( Double ) newValue );
            return;
        case CimPackage.EXC_AVR7__T1:
            setT1( ( Double ) newValue );
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
        case CimPackage.EXC_AVR7__VMIN5:
            unsetVmin5();
            return;
        case CimPackage.EXC_AVR7__VMIN3:
            unsetVmin3();
            return;
        case CimPackage.EXC_AVR7__VMIN1:
            unsetVmin1();
            return;
        case CimPackage.EXC_AVR7__VMAX5:
            unsetVmax5();
            return;
        case CimPackage.EXC_AVR7__VMAX3:
            unsetVmax3();
            return;
        case CimPackage.EXC_AVR7__VMAX1:
            unsetVmax1();
            return;
        case CimPackage.EXC_AVR7__K1:
            unsetK1();
            return;
        case CimPackage.EXC_AVR7__K5:
            unsetK5();
            return;
        case CimPackage.EXC_AVR7__K3:
            unsetK3();
            return;
        case CimPackage.EXC_AVR7__A4:
            unsetA4();
            return;
        case CimPackage.EXC_AVR7__A3:
            unsetA3();
            return;
        case CimPackage.EXC_AVR7__A2:
            unsetA2();
            return;
        case CimPackage.EXC_AVR7__A1:
            unsetA1();
            return;
        case CimPackage.EXC_AVR7__A6:
            unsetA6();
            return;
        case CimPackage.EXC_AVR7__A5:
            unsetA5();
            return;
        case CimPackage.EXC_AVR7__T6:
            unsetT6();
            return;
        case CimPackage.EXC_AVR7__T5:
            unsetT5();
            return;
        case CimPackage.EXC_AVR7__T4:
            unsetT4();
            return;
        case CimPackage.EXC_AVR7__T3:
            unsetT3();
            return;
        case CimPackage.EXC_AVR7__T2:
            unsetT2();
            return;
        case CimPackage.EXC_AVR7__T1:
            unsetT1();
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
        case CimPackage.EXC_AVR7__VMIN5:
            return isSetVmin5();
        case CimPackage.EXC_AVR7__VMIN3:
            return isSetVmin3();
        case CimPackage.EXC_AVR7__VMIN1:
            return isSetVmin1();
        case CimPackage.EXC_AVR7__VMAX5:
            return isSetVmax5();
        case CimPackage.EXC_AVR7__VMAX3:
            return isSetVmax3();
        case CimPackage.EXC_AVR7__VMAX1:
            return isSetVmax1();
        case CimPackage.EXC_AVR7__K1:
            return isSetK1();
        case CimPackage.EXC_AVR7__K5:
            return isSetK5();
        case CimPackage.EXC_AVR7__K3:
            return isSetK3();
        case CimPackage.EXC_AVR7__A4:
            return isSetA4();
        case CimPackage.EXC_AVR7__A3:
            return isSetA3();
        case CimPackage.EXC_AVR7__A2:
            return isSetA2();
        case CimPackage.EXC_AVR7__A1:
            return isSetA1();
        case CimPackage.EXC_AVR7__A6:
            return isSetA6();
        case CimPackage.EXC_AVR7__A5:
            return isSetA5();
        case CimPackage.EXC_AVR7__T6:
            return isSetT6();
        case CimPackage.EXC_AVR7__T5:
            return isSetT5();
        case CimPackage.EXC_AVR7__T4:
            return isSetT4();
        case CimPackage.EXC_AVR7__T3:
            return isSetT3();
        case CimPackage.EXC_AVR7__T2:
            return isSetT2();
        case CimPackage.EXC_AVR7__T1:
            return isSetT1();
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
        result.append( " (vmin5: " );
        if( vmin5ESet )
            result.append( vmin5 );
        else
            result.append( "<unset>" );
        result.append( ", vmin3: " );
        if( vmin3ESet )
            result.append( vmin3 );
        else
            result.append( "<unset>" );
        result.append( ", vmin1: " );
        if( vmin1ESet )
            result.append( vmin1 );
        else
            result.append( "<unset>" );
        result.append( ", vmax5: " );
        if( vmax5ESet )
            result.append( vmax5 );
        else
            result.append( "<unset>" );
        result.append( ", vmax3: " );
        if( vmax3ESet )
            result.append( vmax3 );
        else
            result.append( "<unset>" );
        result.append( ", vmax1: " );
        if( vmax1ESet )
            result.append( vmax1 );
        else
            result.append( "<unset>" );
        result.append( ", k1: " );
        if( k1ESet )
            result.append( k1 );
        else
            result.append( "<unset>" );
        result.append( ", k5: " );
        if( k5ESet )
            result.append( k5 );
        else
            result.append( "<unset>" );
        result.append( ", k3: " );
        if( k3ESet )
            result.append( k3 );
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
        result.append( ", a1: " );
        if( a1ESet )
            result.append( a1 );
        else
            result.append( "<unset>" );
        result.append( ", a6: " );
        if( a6ESet )
            result.append( a6 );
        else
            result.append( "<unset>" );
        result.append( ", a5: " );
        if( a5ESet )
            result.append( a5 );
        else
            result.append( "<unset>" );
        result.append( ", t6: " );
        if( t6ESet )
            result.append( t6 );
        else
            result.append( "<unset>" );
        result.append( ", t5: " );
        if( t5ESet )
            result.append( t5 );
        else
            result.append( "<unset>" );
        result.append( ", t4: " );
        if( t4ESet )
            result.append( t4 );
        else
            result.append( "<unset>" );
        result.append( ", t3: " );
        if( t3ESet )
            result.append( t3 );
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
        result.append( ')' );
        return result.toString();
    }

} //ExcAVR7Impl

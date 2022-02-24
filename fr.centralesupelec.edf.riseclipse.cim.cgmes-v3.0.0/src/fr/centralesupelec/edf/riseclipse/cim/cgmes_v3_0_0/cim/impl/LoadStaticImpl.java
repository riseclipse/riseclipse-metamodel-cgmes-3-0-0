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
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadAggregate;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadStatic;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.StaticLoadModelKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Static</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.LoadStaticImpl#getEp3 <em>Ep3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.LoadStaticImpl#getEp1 <em>Ep1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.LoadStaticImpl#getEp2 <em>Ep2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.LoadStaticImpl#getEq2 <em>Eq2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.LoadStaticImpl#getEq3 <em>Eq3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.LoadStaticImpl#getEq1 <em>Eq1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.LoadStaticImpl#getKp1 <em>Kp1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.LoadStaticImpl#getKp2 <em>Kp2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.LoadStaticImpl#getKq4 <em>Kq4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.LoadStaticImpl#getKpf <em>Kpf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.LoadStaticImpl#getKp3 <em>Kp3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.LoadStaticImpl#getKp4 <em>Kp4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.LoadStaticImpl#getKq2 <em>Kq2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.LoadStaticImpl#getKq3 <em>Kq3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.LoadStaticImpl#getKq1 <em>Kq1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.LoadStaticImpl#getKqf <em>Kqf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.LoadStaticImpl#getLoadAggregate <em>Load Aggregate</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.LoadStaticImpl#getStaticLoadModelType <em>Static Load Model Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadStaticImpl extends IdentifiedObjectImpl implements LoadStatic {
    /**
     * The default value of the '{@link #getEp3() <em>Ep3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEp3()
     * @generated
     * @ordered
     */
    protected static final Double EP3_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEp3() <em>Ep3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEp3()
     * @generated
     * @ordered
     */
    protected Double ep3 = EP3_EDEFAULT;

    /**
     * This is true if the Ep3 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ep3ESet;

    /**
     * The default value of the '{@link #getEp1() <em>Ep1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEp1()
     * @generated
     * @ordered
     */
    protected static final Double EP1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEp1() <em>Ep1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEp1()
     * @generated
     * @ordered
     */
    protected Double ep1 = EP1_EDEFAULT;

    /**
     * This is true if the Ep1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ep1ESet;

    /**
     * The default value of the '{@link #getEp2() <em>Ep2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEp2()
     * @generated
     * @ordered
     */
    protected static final Double EP2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEp2() <em>Ep2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEp2()
     * @generated
     * @ordered
     */
    protected Double ep2 = EP2_EDEFAULT;

    /**
     * This is true if the Ep2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ep2ESet;

    /**
     * The default value of the '{@link #getEq2() <em>Eq2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEq2()
     * @generated
     * @ordered
     */
    protected static final Double EQ2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEq2() <em>Eq2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEq2()
     * @generated
     * @ordered
     */
    protected Double eq2 = EQ2_EDEFAULT;

    /**
     * This is true if the Eq2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean eq2ESet;

    /**
     * The default value of the '{@link #getEq3() <em>Eq3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEq3()
     * @generated
     * @ordered
     */
    protected static final Double EQ3_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEq3() <em>Eq3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEq3()
     * @generated
     * @ordered
     */
    protected Double eq3 = EQ3_EDEFAULT;

    /**
     * This is true if the Eq3 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean eq3ESet;

    /**
     * The default value of the '{@link #getEq1() <em>Eq1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEq1()
     * @generated
     * @ordered
     */
    protected static final Double EQ1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEq1() <em>Eq1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEq1()
     * @generated
     * @ordered
     */
    protected Double eq1 = EQ1_EDEFAULT;

    /**
     * This is true if the Eq1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean eq1ESet;

    /**
     * The default value of the '{@link #getKp1() <em>Kp1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKp1()
     * @generated
     * @ordered
     */
    protected static final Double KP1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKp1() <em>Kp1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKp1()
     * @generated
     * @ordered
     */
    protected Double kp1 = KP1_EDEFAULT;

    /**
     * This is true if the Kp1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kp1ESet;

    /**
     * The default value of the '{@link #getKp2() <em>Kp2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKp2()
     * @generated
     * @ordered
     */
    protected static final Double KP2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKp2() <em>Kp2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKp2()
     * @generated
     * @ordered
     */
    protected Double kp2 = KP2_EDEFAULT;

    /**
     * This is true if the Kp2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kp2ESet;

    /**
     * The default value of the '{@link #getKq4() <em>Kq4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKq4()
     * @generated
     * @ordered
     */
    protected static final Double KQ4_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKq4() <em>Kq4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKq4()
     * @generated
     * @ordered
     */
    protected Double kq4 = KQ4_EDEFAULT;

    /**
     * This is true if the Kq4 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kq4ESet;

    /**
     * The default value of the '{@link #getKpf() <em>Kpf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKpf()
     * @generated
     * @ordered
     */
    protected static final Double KPF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKpf() <em>Kpf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKpf()
     * @generated
     * @ordered
     */
    protected Double kpf = KPF_EDEFAULT;

    /**
     * This is true if the Kpf attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kpfESet;

    /**
     * The default value of the '{@link #getKp3() <em>Kp3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKp3()
     * @generated
     * @ordered
     */
    protected static final Double KP3_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKp3() <em>Kp3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKp3()
     * @generated
     * @ordered
     */
    protected Double kp3 = KP3_EDEFAULT;

    /**
     * This is true if the Kp3 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kp3ESet;

    /**
     * The default value of the '{@link #getKp4() <em>Kp4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKp4()
     * @generated
     * @ordered
     */
    protected static final Double KP4_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKp4() <em>Kp4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKp4()
     * @generated
     * @ordered
     */
    protected Double kp4 = KP4_EDEFAULT;

    /**
     * This is true if the Kp4 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kp4ESet;

    /**
     * The default value of the '{@link #getKq2() <em>Kq2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKq2()
     * @generated
     * @ordered
     */
    protected static final Double KQ2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKq2() <em>Kq2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKq2()
     * @generated
     * @ordered
     */
    protected Double kq2 = KQ2_EDEFAULT;

    /**
     * This is true if the Kq2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kq2ESet;

    /**
     * The default value of the '{@link #getKq3() <em>Kq3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKq3()
     * @generated
     * @ordered
     */
    protected static final Double KQ3_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKq3() <em>Kq3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKq3()
     * @generated
     * @ordered
     */
    protected Double kq3 = KQ3_EDEFAULT;

    /**
     * This is true if the Kq3 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kq3ESet;

    /**
     * The default value of the '{@link #getKq1() <em>Kq1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKq1()
     * @generated
     * @ordered
     */
    protected static final Double KQ1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKq1() <em>Kq1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKq1()
     * @generated
     * @ordered
     */
    protected Double kq1 = KQ1_EDEFAULT;

    /**
     * This is true if the Kq1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kq1ESet;

    /**
     * The default value of the '{@link #getKqf() <em>Kqf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKqf()
     * @generated
     * @ordered
     */
    protected static final Double KQF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKqf() <em>Kqf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKqf()
     * @generated
     * @ordered
     */
    protected Double kqf = KQF_EDEFAULT;

    /**
     * This is true if the Kqf attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kqfESet;

    /**
     * The cached value of the '{@link #getLoadAggregate() <em>Load Aggregate</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLoadAggregate()
     * @generated
     * @ordered
     */
    protected LoadAggregate loadAggregate;

    /**
     * This is true if the Load Aggregate reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean loadAggregateESet;

    /**
     * The default value of the '{@link #getStaticLoadModelType() <em>Static Load Model Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStaticLoadModelType()
     * @generated
     * @ordered
     */
    protected static final StaticLoadModelKind STATIC_LOAD_MODEL_TYPE_EDEFAULT = StaticLoadModelKind.ZIP2;

    /**
     * The cached value of the '{@link #getStaticLoadModelType() <em>Static Load Model Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStaticLoadModelType()
     * @generated
     * @ordered
     */
    protected StaticLoadModelKind staticLoadModelType = STATIC_LOAD_MODEL_TYPE_EDEFAULT;

    /**
     * This is true if the Static Load Model Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean staticLoadModelTypeESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LoadStaticImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getLoadStatic();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getEp3() {
        return ep3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEp3( Double newEp3 ) {
        Double oldEp3 = ep3;
        ep3 = newEp3;
        boolean oldEp3ESet = ep3ESet;
        ep3ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.LOAD_STATIC__EP3, oldEp3, ep3,
                    !oldEp3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEp3() {
        Double oldEp3 = ep3;
        boolean oldEp3ESet = ep3ESet;
        ep3 = EP3_EDEFAULT;
        ep3ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.LOAD_STATIC__EP3, oldEp3, EP3_EDEFAULT,
                    oldEp3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEp3() {
        return ep3ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getEp1() {
        return ep1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEp1( Double newEp1 ) {
        Double oldEp1 = ep1;
        ep1 = newEp1;
        boolean oldEp1ESet = ep1ESet;
        ep1ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.LOAD_STATIC__EP1, oldEp1, ep1,
                    !oldEp1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEp1() {
        Double oldEp1 = ep1;
        boolean oldEp1ESet = ep1ESet;
        ep1 = EP1_EDEFAULT;
        ep1ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.LOAD_STATIC__EP1, oldEp1, EP1_EDEFAULT,
                    oldEp1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEp1() {
        return ep1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getEp2() {
        return ep2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEp2( Double newEp2 ) {
        Double oldEp2 = ep2;
        ep2 = newEp2;
        boolean oldEp2ESet = ep2ESet;
        ep2ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.LOAD_STATIC__EP2, oldEp2, ep2,
                    !oldEp2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEp2() {
        Double oldEp2 = ep2;
        boolean oldEp2ESet = ep2ESet;
        ep2 = EP2_EDEFAULT;
        ep2ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.LOAD_STATIC__EP2, oldEp2, EP2_EDEFAULT,
                    oldEp2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEp2() {
        return ep2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getEq2() {
        return eq2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEq2( Double newEq2 ) {
        Double oldEq2 = eq2;
        eq2 = newEq2;
        boolean oldEq2ESet = eq2ESet;
        eq2ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.LOAD_STATIC__EQ2, oldEq2, eq2,
                    !oldEq2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEq2() {
        Double oldEq2 = eq2;
        boolean oldEq2ESet = eq2ESet;
        eq2 = EQ2_EDEFAULT;
        eq2ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.LOAD_STATIC__EQ2, oldEq2, EQ2_EDEFAULT,
                    oldEq2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEq2() {
        return eq2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getEq3() {
        return eq3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEq3( Double newEq3 ) {
        Double oldEq3 = eq3;
        eq3 = newEq3;
        boolean oldEq3ESet = eq3ESet;
        eq3ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.LOAD_STATIC__EQ3, oldEq3, eq3,
                    !oldEq3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEq3() {
        Double oldEq3 = eq3;
        boolean oldEq3ESet = eq3ESet;
        eq3 = EQ3_EDEFAULT;
        eq3ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.LOAD_STATIC__EQ3, oldEq3, EQ3_EDEFAULT,
                    oldEq3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEq3() {
        return eq3ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getEq1() {
        return eq1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEq1( Double newEq1 ) {
        Double oldEq1 = eq1;
        eq1 = newEq1;
        boolean oldEq1ESet = eq1ESet;
        eq1ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.LOAD_STATIC__EQ1, oldEq1, eq1,
                    !oldEq1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEq1() {
        Double oldEq1 = eq1;
        boolean oldEq1ESet = eq1ESet;
        eq1 = EQ1_EDEFAULT;
        eq1ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.LOAD_STATIC__EQ1, oldEq1, EQ1_EDEFAULT,
                    oldEq1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEq1() {
        return eq1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKp1() {
        return kp1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKp1( Double newKp1 ) {
        Double oldKp1 = kp1;
        kp1 = newKp1;
        boolean oldKp1ESet = kp1ESet;
        kp1ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.LOAD_STATIC__KP1, oldKp1, kp1,
                    !oldKp1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKp1() {
        Double oldKp1 = kp1;
        boolean oldKp1ESet = kp1ESet;
        kp1 = KP1_EDEFAULT;
        kp1ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.LOAD_STATIC__KP1, oldKp1, KP1_EDEFAULT,
                    oldKp1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKp1() {
        return kp1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKp2() {
        return kp2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKp2( Double newKp2 ) {
        Double oldKp2 = kp2;
        kp2 = newKp2;
        boolean oldKp2ESet = kp2ESet;
        kp2ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.LOAD_STATIC__KP2, oldKp2, kp2,
                    !oldKp2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKp2() {
        Double oldKp2 = kp2;
        boolean oldKp2ESet = kp2ESet;
        kp2 = KP2_EDEFAULT;
        kp2ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.LOAD_STATIC__KP2, oldKp2, KP2_EDEFAULT,
                    oldKp2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKp2() {
        return kp2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKq4() {
        return kq4;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKq4( Double newKq4 ) {
        Double oldKq4 = kq4;
        kq4 = newKq4;
        boolean oldKq4ESet = kq4ESet;
        kq4ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.LOAD_STATIC__KQ4, oldKq4, kq4,
                    !oldKq4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKq4() {
        Double oldKq4 = kq4;
        boolean oldKq4ESet = kq4ESet;
        kq4 = KQ4_EDEFAULT;
        kq4ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.LOAD_STATIC__KQ4, oldKq4, KQ4_EDEFAULT,
                    oldKq4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKq4() {
        return kq4ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKpf() {
        return kpf;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKpf( Double newKpf ) {
        Double oldKpf = kpf;
        kpf = newKpf;
        boolean oldKpfESet = kpfESet;
        kpfESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.LOAD_STATIC__KPF, oldKpf, kpf,
                    !oldKpfESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKpf() {
        Double oldKpf = kpf;
        boolean oldKpfESet = kpfESet;
        kpf = KPF_EDEFAULT;
        kpfESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.LOAD_STATIC__KPF, oldKpf, KPF_EDEFAULT,
                    oldKpfESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKpf() {
        return kpfESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKp3() {
        return kp3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKp3( Double newKp3 ) {
        Double oldKp3 = kp3;
        kp3 = newKp3;
        boolean oldKp3ESet = kp3ESet;
        kp3ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.LOAD_STATIC__KP3, oldKp3, kp3,
                    !oldKp3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKp3() {
        Double oldKp3 = kp3;
        boolean oldKp3ESet = kp3ESet;
        kp3 = KP3_EDEFAULT;
        kp3ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.LOAD_STATIC__KP3, oldKp3, KP3_EDEFAULT,
                    oldKp3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKp3() {
        return kp3ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKp4() {
        return kp4;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKp4( Double newKp4 ) {
        Double oldKp4 = kp4;
        kp4 = newKp4;
        boolean oldKp4ESet = kp4ESet;
        kp4ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.LOAD_STATIC__KP4, oldKp4, kp4,
                    !oldKp4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKp4() {
        Double oldKp4 = kp4;
        boolean oldKp4ESet = kp4ESet;
        kp4 = KP4_EDEFAULT;
        kp4ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.LOAD_STATIC__KP4, oldKp4, KP4_EDEFAULT,
                    oldKp4ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKp4() {
        return kp4ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKq2() {
        return kq2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKq2( Double newKq2 ) {
        Double oldKq2 = kq2;
        kq2 = newKq2;
        boolean oldKq2ESet = kq2ESet;
        kq2ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.LOAD_STATIC__KQ2, oldKq2, kq2,
                    !oldKq2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKq2() {
        Double oldKq2 = kq2;
        boolean oldKq2ESet = kq2ESet;
        kq2 = KQ2_EDEFAULT;
        kq2ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.LOAD_STATIC__KQ2, oldKq2, KQ2_EDEFAULT,
                    oldKq2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKq2() {
        return kq2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKq3() {
        return kq3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKq3( Double newKq3 ) {
        Double oldKq3 = kq3;
        kq3 = newKq3;
        boolean oldKq3ESet = kq3ESet;
        kq3ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.LOAD_STATIC__KQ3, oldKq3, kq3,
                    !oldKq3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKq3() {
        Double oldKq3 = kq3;
        boolean oldKq3ESet = kq3ESet;
        kq3 = KQ3_EDEFAULT;
        kq3ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.LOAD_STATIC__KQ3, oldKq3, KQ3_EDEFAULT,
                    oldKq3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKq3() {
        return kq3ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKq1() {
        return kq1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKq1( Double newKq1 ) {
        Double oldKq1 = kq1;
        kq1 = newKq1;
        boolean oldKq1ESet = kq1ESet;
        kq1ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.LOAD_STATIC__KQ1, oldKq1, kq1,
                    !oldKq1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKq1() {
        Double oldKq1 = kq1;
        boolean oldKq1ESet = kq1ESet;
        kq1 = KQ1_EDEFAULT;
        kq1ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.LOAD_STATIC__KQ1, oldKq1, KQ1_EDEFAULT,
                    oldKq1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKq1() {
        return kq1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKqf() {
        return kqf;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKqf( Double newKqf ) {
        Double oldKqf = kqf;
        kqf = newKqf;
        boolean oldKqfESet = kqfESet;
        kqfESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.LOAD_STATIC__KQF, oldKqf, kqf,
                    !oldKqfESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKqf() {
        Double oldKqf = kqf;
        boolean oldKqfESet = kqfESet;
        kqf = KQF_EDEFAULT;
        kqfESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.LOAD_STATIC__KQF, oldKqf, KQF_EDEFAULT,
                    oldKqfESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKqf() {
        return kqfESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LoadAggregate getLoadAggregate() {
        return loadAggregate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLoadAggregate( LoadAggregate newLoadAggregate, NotificationChain msgs ) {
        LoadAggregate oldLoadAggregate = loadAggregate;
        loadAggregate = newLoadAggregate;
        boolean oldLoadAggregateESet = loadAggregateESet;
        loadAggregateESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.LOAD_STATIC__LOAD_AGGREGATE, oldLoadAggregate, newLoadAggregate, !oldLoadAggregateESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLoadAggregate( LoadAggregate newLoadAggregate ) {
        if( newLoadAggregate != loadAggregate ) {
            NotificationChain msgs = null;
            if( loadAggregate != null )
                msgs = ( ( InternalEObject ) loadAggregate ).eInverseRemove( this,
                        CimPackage.LOAD_AGGREGATE__LOAD_STATIC, LoadAggregate.class, msgs );
            if( newLoadAggregate != null )
                msgs = ( ( InternalEObject ) newLoadAggregate ).eInverseAdd( this,
                        CimPackage.LOAD_AGGREGATE__LOAD_STATIC, LoadAggregate.class, msgs );
            msgs = basicSetLoadAggregate( newLoadAggregate, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldLoadAggregateESet = loadAggregateESet;
            loadAggregateESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.LOAD_STATIC__LOAD_AGGREGATE,
                        newLoadAggregate, newLoadAggregate, !oldLoadAggregateESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetLoadAggregate( NotificationChain msgs ) {
        LoadAggregate oldLoadAggregate = loadAggregate;
        loadAggregate = null;
        boolean oldLoadAggregateESet = loadAggregateESet;
        loadAggregateESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.LOAD_STATIC__LOAD_AGGREGATE, oldLoadAggregate, null, oldLoadAggregateESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLoadAggregate() {
        if( loadAggregate != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) loadAggregate ).eInverseRemove( this, CimPackage.LOAD_AGGREGATE__LOAD_STATIC,
                    LoadAggregate.class, msgs );
            msgs = basicUnsetLoadAggregate( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldLoadAggregateESet = loadAggregateESet;
            loadAggregateESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.LOAD_STATIC__LOAD_AGGREGATE, null,
                        null, oldLoadAggregateESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLoadAggregate() {
        return loadAggregateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public StaticLoadModelKind getStaticLoadModelType() {
        return staticLoadModelType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setStaticLoadModelType( StaticLoadModelKind newStaticLoadModelType ) {
        StaticLoadModelKind oldStaticLoadModelType = staticLoadModelType;
        staticLoadModelType = newStaticLoadModelType == null ? STATIC_LOAD_MODEL_TYPE_EDEFAULT : newStaticLoadModelType;
        boolean oldStaticLoadModelTypeESet = staticLoadModelTypeESet;
        staticLoadModelTypeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.LOAD_STATIC__STATIC_LOAD_MODEL_TYPE,
                    oldStaticLoadModelType, staticLoadModelType, !oldStaticLoadModelTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetStaticLoadModelType() {
        StaticLoadModelKind oldStaticLoadModelType = staticLoadModelType;
        boolean oldStaticLoadModelTypeESet = staticLoadModelTypeESet;
        staticLoadModelType = STATIC_LOAD_MODEL_TYPE_EDEFAULT;
        staticLoadModelTypeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.LOAD_STATIC__STATIC_LOAD_MODEL_TYPE,
                    oldStaticLoadModelType, STATIC_LOAD_MODEL_TYPE_EDEFAULT, oldStaticLoadModelTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetStaticLoadModelType() {
        return staticLoadModelTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.LOAD_STATIC__LOAD_AGGREGATE:
            if( loadAggregate != null )
                msgs = ( ( InternalEObject ) loadAggregate ).eInverseRemove( this,
                        CimPackage.LOAD_AGGREGATE__LOAD_STATIC, LoadAggregate.class, msgs );
            return basicSetLoadAggregate( ( LoadAggregate ) otherEnd, msgs );
        }
        return super.eInverseAdd( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.LOAD_STATIC__LOAD_AGGREGATE:
            return basicUnsetLoadAggregate( msgs );
        }
        return super.eInverseRemove( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.LOAD_STATIC__EP3:
            return getEp3();
        case CimPackage.LOAD_STATIC__EP1:
            return getEp1();
        case CimPackage.LOAD_STATIC__EP2:
            return getEp2();
        case CimPackage.LOAD_STATIC__EQ2:
            return getEq2();
        case CimPackage.LOAD_STATIC__EQ3:
            return getEq3();
        case CimPackage.LOAD_STATIC__EQ1:
            return getEq1();
        case CimPackage.LOAD_STATIC__KP1:
            return getKp1();
        case CimPackage.LOAD_STATIC__KP2:
            return getKp2();
        case CimPackage.LOAD_STATIC__KQ4:
            return getKq4();
        case CimPackage.LOAD_STATIC__KPF:
            return getKpf();
        case CimPackage.LOAD_STATIC__KP3:
            return getKp3();
        case CimPackage.LOAD_STATIC__KP4:
            return getKp4();
        case CimPackage.LOAD_STATIC__KQ2:
            return getKq2();
        case CimPackage.LOAD_STATIC__KQ3:
            return getKq3();
        case CimPackage.LOAD_STATIC__KQ1:
            return getKq1();
        case CimPackage.LOAD_STATIC__KQF:
            return getKqf();
        case CimPackage.LOAD_STATIC__LOAD_AGGREGATE:
            return getLoadAggregate();
        case CimPackage.LOAD_STATIC__STATIC_LOAD_MODEL_TYPE:
            return getStaticLoadModelType();
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
        case CimPackage.LOAD_STATIC__EP3:
            setEp3( ( Double ) newValue );
            return;
        case CimPackage.LOAD_STATIC__EP1:
            setEp1( ( Double ) newValue );
            return;
        case CimPackage.LOAD_STATIC__EP2:
            setEp2( ( Double ) newValue );
            return;
        case CimPackage.LOAD_STATIC__EQ2:
            setEq2( ( Double ) newValue );
            return;
        case CimPackage.LOAD_STATIC__EQ3:
            setEq3( ( Double ) newValue );
            return;
        case CimPackage.LOAD_STATIC__EQ1:
            setEq1( ( Double ) newValue );
            return;
        case CimPackage.LOAD_STATIC__KP1:
            setKp1( ( Double ) newValue );
            return;
        case CimPackage.LOAD_STATIC__KP2:
            setKp2( ( Double ) newValue );
            return;
        case CimPackage.LOAD_STATIC__KQ4:
            setKq4( ( Double ) newValue );
            return;
        case CimPackage.LOAD_STATIC__KPF:
            setKpf( ( Double ) newValue );
            return;
        case CimPackage.LOAD_STATIC__KP3:
            setKp3( ( Double ) newValue );
            return;
        case CimPackage.LOAD_STATIC__KP4:
            setKp4( ( Double ) newValue );
            return;
        case CimPackage.LOAD_STATIC__KQ2:
            setKq2( ( Double ) newValue );
            return;
        case CimPackage.LOAD_STATIC__KQ3:
            setKq3( ( Double ) newValue );
            return;
        case CimPackage.LOAD_STATIC__KQ1:
            setKq1( ( Double ) newValue );
            return;
        case CimPackage.LOAD_STATIC__KQF:
            setKqf( ( Double ) newValue );
            return;
        case CimPackage.LOAD_STATIC__LOAD_AGGREGATE:
            setLoadAggregate( ( LoadAggregate ) newValue );
            return;
        case CimPackage.LOAD_STATIC__STATIC_LOAD_MODEL_TYPE:
            setStaticLoadModelType( ( StaticLoadModelKind ) newValue );
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
        case CimPackage.LOAD_STATIC__EP3:
            unsetEp3();
            return;
        case CimPackage.LOAD_STATIC__EP1:
            unsetEp1();
            return;
        case CimPackage.LOAD_STATIC__EP2:
            unsetEp2();
            return;
        case CimPackage.LOAD_STATIC__EQ2:
            unsetEq2();
            return;
        case CimPackage.LOAD_STATIC__EQ3:
            unsetEq3();
            return;
        case CimPackage.LOAD_STATIC__EQ1:
            unsetEq1();
            return;
        case CimPackage.LOAD_STATIC__KP1:
            unsetKp1();
            return;
        case CimPackage.LOAD_STATIC__KP2:
            unsetKp2();
            return;
        case CimPackage.LOAD_STATIC__KQ4:
            unsetKq4();
            return;
        case CimPackage.LOAD_STATIC__KPF:
            unsetKpf();
            return;
        case CimPackage.LOAD_STATIC__KP3:
            unsetKp3();
            return;
        case CimPackage.LOAD_STATIC__KP4:
            unsetKp4();
            return;
        case CimPackage.LOAD_STATIC__KQ2:
            unsetKq2();
            return;
        case CimPackage.LOAD_STATIC__KQ3:
            unsetKq3();
            return;
        case CimPackage.LOAD_STATIC__KQ1:
            unsetKq1();
            return;
        case CimPackage.LOAD_STATIC__KQF:
            unsetKqf();
            return;
        case CimPackage.LOAD_STATIC__LOAD_AGGREGATE:
            unsetLoadAggregate();
            return;
        case CimPackage.LOAD_STATIC__STATIC_LOAD_MODEL_TYPE:
            unsetStaticLoadModelType();
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
        case CimPackage.LOAD_STATIC__EP3:
            return isSetEp3();
        case CimPackage.LOAD_STATIC__EP1:
            return isSetEp1();
        case CimPackage.LOAD_STATIC__EP2:
            return isSetEp2();
        case CimPackage.LOAD_STATIC__EQ2:
            return isSetEq2();
        case CimPackage.LOAD_STATIC__EQ3:
            return isSetEq3();
        case CimPackage.LOAD_STATIC__EQ1:
            return isSetEq1();
        case CimPackage.LOAD_STATIC__KP1:
            return isSetKp1();
        case CimPackage.LOAD_STATIC__KP2:
            return isSetKp2();
        case CimPackage.LOAD_STATIC__KQ4:
            return isSetKq4();
        case CimPackage.LOAD_STATIC__KPF:
            return isSetKpf();
        case CimPackage.LOAD_STATIC__KP3:
            return isSetKp3();
        case CimPackage.LOAD_STATIC__KP4:
            return isSetKp4();
        case CimPackage.LOAD_STATIC__KQ2:
            return isSetKq2();
        case CimPackage.LOAD_STATIC__KQ3:
            return isSetKq3();
        case CimPackage.LOAD_STATIC__KQ1:
            return isSetKq1();
        case CimPackage.LOAD_STATIC__KQF:
            return isSetKqf();
        case CimPackage.LOAD_STATIC__LOAD_AGGREGATE:
            return isSetLoadAggregate();
        case CimPackage.LOAD_STATIC__STATIC_LOAD_MODEL_TYPE:
            return isSetStaticLoadModelType();
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
        result.append( " (ep3: " );
        if( ep3ESet )
            result.append( ep3 );
        else
            result.append( "<unset>" );
        result.append( ", ep1: " );
        if( ep1ESet )
            result.append( ep1 );
        else
            result.append( "<unset>" );
        result.append( ", ep2: " );
        if( ep2ESet )
            result.append( ep2 );
        else
            result.append( "<unset>" );
        result.append( ", eq2: " );
        if( eq2ESet )
            result.append( eq2 );
        else
            result.append( "<unset>" );
        result.append( ", eq3: " );
        if( eq3ESet )
            result.append( eq3 );
        else
            result.append( "<unset>" );
        result.append( ", eq1: " );
        if( eq1ESet )
            result.append( eq1 );
        else
            result.append( "<unset>" );
        result.append( ", kp1: " );
        if( kp1ESet )
            result.append( kp1 );
        else
            result.append( "<unset>" );
        result.append( ", kp2: " );
        if( kp2ESet )
            result.append( kp2 );
        else
            result.append( "<unset>" );
        result.append( ", kq4: " );
        if( kq4ESet )
            result.append( kq4 );
        else
            result.append( "<unset>" );
        result.append( ", kpf: " );
        if( kpfESet )
            result.append( kpf );
        else
            result.append( "<unset>" );
        result.append( ", kp3: " );
        if( kp3ESet )
            result.append( kp3 );
        else
            result.append( "<unset>" );
        result.append( ", kp4: " );
        if( kp4ESet )
            result.append( kp4 );
        else
            result.append( "<unset>" );
        result.append( ", kq2: " );
        if( kq2ESet )
            result.append( kq2 );
        else
            result.append( "<unset>" );
        result.append( ", kq3: " );
        if( kq3ESet )
            result.append( kq3 );
        else
            result.append( "<unset>" );
        result.append( ", kq1: " );
        if( kq1ESet )
            result.append( kq1 );
        else
            result.append( "<unset>" );
        result.append( ", kqf: " );
        if( kqfESet )
            result.append( kqf );
        else
            result.append( "<unset>" );
        result.append( ", staticLoadModelType: " );
        if( staticLoadModelTypeESet )
            result.append( staticLoadModelType );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //LoadStaticImpl

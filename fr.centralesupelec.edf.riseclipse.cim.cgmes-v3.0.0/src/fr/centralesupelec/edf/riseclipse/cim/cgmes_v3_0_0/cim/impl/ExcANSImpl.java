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

import java.math.BigInteger;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcANS;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exc ANS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcANSImpl#getIfmx <em>Ifmx</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcANSImpl#getIfmn <em>Ifmn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcANSImpl#getKvfif <em>Kvfif</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcANSImpl#getKce <em>Kce</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcANSImpl#getT3 <em>T3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcANSImpl#getT2 <em>T2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcANSImpl#getT1 <em>T1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcANSImpl#getBlint <em>Blint</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcANSImpl#getTb <em>Tb</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcANSImpl#getK2 <em>K2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcANSImpl#getK3 <em>K3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcANSImpl#getKrvecc <em>Krvecc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcANSImpl#getVrmn <em>Vrmn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcANSImpl#getVrmx <em>Vrmx</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExcANSImpl extends ExcitationSystemDynamicsImpl implements ExcANS {
    /**
     * The default value of the '{@link #getIfmx() <em>Ifmx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIfmx()
     * @generated
     * @ordered
     */
    protected static final Double IFMX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIfmx() <em>Ifmx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIfmx()
     * @generated
     * @ordered
     */
    protected Double ifmx = IFMX_EDEFAULT;

    /**
     * This is true if the Ifmx attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ifmxESet;

    /**
     * The default value of the '{@link #getIfmn() <em>Ifmn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIfmn()
     * @generated
     * @ordered
     */
    protected static final Double IFMN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIfmn() <em>Ifmn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIfmn()
     * @generated
     * @ordered
     */
    protected Double ifmn = IFMN_EDEFAULT;

    /**
     * This is true if the Ifmn attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ifmnESet;

    /**
     * The default value of the '{@link #getKvfif() <em>Kvfif</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKvfif()
     * @generated
     * @ordered
     */
    protected static final BigInteger KVFIF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKvfif() <em>Kvfif</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKvfif()
     * @generated
     * @ordered
     */
    protected BigInteger kvfif = KVFIF_EDEFAULT;

    /**
     * This is true if the Kvfif attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kvfifESet;

    /**
     * The default value of the '{@link #getKce() <em>Kce</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKce()
     * @generated
     * @ordered
     */
    protected static final Double KCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKce() <em>Kce</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKce()
     * @generated
     * @ordered
     */
    protected Double kce = KCE_EDEFAULT;

    /**
     * This is true if the Kce attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kceESet;

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
     * The default value of the '{@link #getBlint() <em>Blint</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBlint()
     * @generated
     * @ordered
     */
    protected static final BigInteger BLINT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBlint() <em>Blint</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBlint()
     * @generated
     * @ordered
     */
    protected BigInteger blint = BLINT_EDEFAULT;

    /**
     * This is true if the Blint attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean blintESet;

    /**
     * The default value of the '{@link #getTb() <em>Tb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTb()
     * @generated
     * @ordered
     */
    protected static final Double TB_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTb() <em>Tb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTb()
     * @generated
     * @ordered
     */
    protected Double tb = TB_EDEFAULT;

    /**
     * This is true if the Tb attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tbESet;

    /**
     * The default value of the '{@link #getK2() <em>K2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getK2()
     * @generated
     * @ordered
     */
    protected static final Double K2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getK2() <em>K2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getK2()
     * @generated
     * @ordered
     */
    protected Double k2 = K2_EDEFAULT;

    /**
     * This is true if the K2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean k2ESet;

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
     * The default value of the '{@link #getKrvecc() <em>Krvecc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKrvecc()
     * @generated
     * @ordered
     */
    protected static final BigInteger KRVECC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKrvecc() <em>Krvecc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKrvecc()
     * @generated
     * @ordered
     */
    protected BigInteger krvecc = KRVECC_EDEFAULT;

    /**
     * This is true if the Krvecc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean krveccESet;

    /**
     * The default value of the '{@link #getVrmn() <em>Vrmn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVrmn()
     * @generated
     * @ordered
     */
    protected static final Double VRMN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVrmn() <em>Vrmn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVrmn()
     * @generated
     * @ordered
     */
    protected Double vrmn = VRMN_EDEFAULT;

    /**
     * This is true if the Vrmn attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vrmnESet;

    /**
     * The default value of the '{@link #getVrmx() <em>Vrmx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVrmx()
     * @generated
     * @ordered
     */
    protected static final Double VRMX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVrmx() <em>Vrmx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVrmx()
     * @generated
     * @ordered
     */
    protected Double vrmx = VRMX_EDEFAULT;

    /**
     * This is true if the Vrmx attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vrmxESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExcANSImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getExcANS();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getIfmx() {
        return ifmx;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIfmx( Double newIfmx ) {
        Double oldIfmx = ifmx;
        ifmx = newIfmx;
        boolean oldIfmxESet = ifmxESet;
        ifmxESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ANS__IFMX, oldIfmx, ifmx,
                    !oldIfmxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIfmx() {
        Double oldIfmx = ifmx;
        boolean oldIfmxESet = ifmxESet;
        ifmx = IFMX_EDEFAULT;
        ifmxESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ANS__IFMX, oldIfmx, IFMX_EDEFAULT,
                    oldIfmxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIfmx() {
        return ifmxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getIfmn() {
        return ifmn;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIfmn( Double newIfmn ) {
        Double oldIfmn = ifmn;
        ifmn = newIfmn;
        boolean oldIfmnESet = ifmnESet;
        ifmnESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ANS__IFMN, oldIfmn, ifmn,
                    !oldIfmnESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIfmn() {
        Double oldIfmn = ifmn;
        boolean oldIfmnESet = ifmnESet;
        ifmn = IFMN_EDEFAULT;
        ifmnESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ANS__IFMN, oldIfmn, IFMN_EDEFAULT,
                    oldIfmnESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIfmn() {
        return ifmnESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BigInteger getKvfif() {
        return kvfif;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKvfif( BigInteger newKvfif ) {
        BigInteger oldKvfif = kvfif;
        kvfif = newKvfif;
        boolean oldKvfifESet = kvfifESet;
        kvfifESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ANS__KVFIF, oldKvfif, kvfif,
                    !oldKvfifESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKvfif() {
        BigInteger oldKvfif = kvfif;
        boolean oldKvfifESet = kvfifESet;
        kvfif = KVFIF_EDEFAULT;
        kvfifESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ANS__KVFIF, oldKvfif,
                    KVFIF_EDEFAULT, oldKvfifESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKvfif() {
        return kvfifESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKce() {
        return kce;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKce( Double newKce ) {
        Double oldKce = kce;
        kce = newKce;
        boolean oldKceESet = kceESet;
        kceESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ANS__KCE, oldKce, kce,
                    !oldKceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKce() {
        Double oldKce = kce;
        boolean oldKceESet = kceESet;
        kce = KCE_EDEFAULT;
        kceESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ANS__KCE, oldKce, KCE_EDEFAULT,
                    oldKceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKce() {
        return kceESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ANS__T3, oldT3, t3, !oldT3ESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ANS__T3, oldT3, T3_EDEFAULT,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ANS__T2, oldT2, t2, !oldT2ESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ANS__T2, oldT2, T2_EDEFAULT,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ANS__T1, oldT1, t1, !oldT1ESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ANS__T1, oldT1, T1_EDEFAULT,
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
    public BigInteger getBlint() {
        return blint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBlint( BigInteger newBlint ) {
        BigInteger oldBlint = blint;
        blint = newBlint;
        boolean oldBlintESet = blintESet;
        blintESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ANS__BLINT, oldBlint, blint,
                    !oldBlintESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBlint() {
        BigInteger oldBlint = blint;
        boolean oldBlintESet = blintESet;
        blint = BLINT_EDEFAULT;
        blintESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ANS__BLINT, oldBlint,
                    BLINT_EDEFAULT, oldBlintESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBlint() {
        return blintESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTb() {
        return tb;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTb( Double newTb ) {
        Double oldTb = tb;
        tb = newTb;
        boolean oldTbESet = tbESet;
        tbESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ANS__TB, oldTb, tb, !oldTbESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTb() {
        Double oldTb = tb;
        boolean oldTbESet = tbESet;
        tb = TB_EDEFAULT;
        tbESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ANS__TB, oldTb, TB_EDEFAULT,
                    oldTbESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTb() {
        return tbESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getK2() {
        return k2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setK2( Double newK2 ) {
        Double oldK2 = k2;
        k2 = newK2;
        boolean oldK2ESet = k2ESet;
        k2ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ANS__K2, oldK2, k2, !oldK2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetK2() {
        Double oldK2 = k2;
        boolean oldK2ESet = k2ESet;
        k2 = K2_EDEFAULT;
        k2ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ANS__K2, oldK2, K2_EDEFAULT,
                    oldK2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetK2() {
        return k2ESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ANS__K3, oldK3, k3, !oldK3ESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ANS__K3, oldK3, K3_EDEFAULT,
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
    public BigInteger getKrvecc() {
        return krvecc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKrvecc( BigInteger newKrvecc ) {
        BigInteger oldKrvecc = krvecc;
        krvecc = newKrvecc;
        boolean oldKrveccESet = krveccESet;
        krveccESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ANS__KRVECC, oldKrvecc, krvecc,
                    !oldKrveccESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKrvecc() {
        BigInteger oldKrvecc = krvecc;
        boolean oldKrveccESet = krveccESet;
        krvecc = KRVECC_EDEFAULT;
        krveccESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ANS__KRVECC, oldKrvecc,
                    KRVECC_EDEFAULT, oldKrveccESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKrvecc() {
        return krveccESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVrmn() {
        return vrmn;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVrmn( Double newVrmn ) {
        Double oldVrmn = vrmn;
        vrmn = newVrmn;
        boolean oldVrmnESet = vrmnESet;
        vrmnESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ANS__VRMN, oldVrmn, vrmn,
                    !oldVrmnESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVrmn() {
        Double oldVrmn = vrmn;
        boolean oldVrmnESet = vrmnESet;
        vrmn = VRMN_EDEFAULT;
        vrmnESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ANS__VRMN, oldVrmn, VRMN_EDEFAULT,
                    oldVrmnESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVrmn() {
        return vrmnESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVrmx() {
        return vrmx;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVrmx( Double newVrmx ) {
        Double oldVrmx = vrmx;
        vrmx = newVrmx;
        boolean oldVrmxESet = vrmxESet;
        vrmxESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_ANS__VRMX, oldVrmx, vrmx,
                    !oldVrmxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVrmx() {
        Double oldVrmx = vrmx;
        boolean oldVrmxESet = vrmxESet;
        vrmx = VRMX_EDEFAULT;
        vrmxESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_ANS__VRMX, oldVrmx, VRMX_EDEFAULT,
                    oldVrmxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVrmx() {
        return vrmxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.EXC_ANS__IFMX:
            return getIfmx();
        case CimPackage.EXC_ANS__IFMN:
            return getIfmn();
        case CimPackage.EXC_ANS__KVFIF:
            return getKvfif();
        case CimPackage.EXC_ANS__KCE:
            return getKce();
        case CimPackage.EXC_ANS__T3:
            return getT3();
        case CimPackage.EXC_ANS__T2:
            return getT2();
        case CimPackage.EXC_ANS__T1:
            return getT1();
        case CimPackage.EXC_ANS__BLINT:
            return getBlint();
        case CimPackage.EXC_ANS__TB:
            return getTb();
        case CimPackage.EXC_ANS__K2:
            return getK2();
        case CimPackage.EXC_ANS__K3:
            return getK3();
        case CimPackage.EXC_ANS__KRVECC:
            return getKrvecc();
        case CimPackage.EXC_ANS__VRMN:
            return getVrmn();
        case CimPackage.EXC_ANS__VRMX:
            return getVrmx();
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
        case CimPackage.EXC_ANS__IFMX:
            setIfmx( ( Double ) newValue );
            return;
        case CimPackage.EXC_ANS__IFMN:
            setIfmn( ( Double ) newValue );
            return;
        case CimPackage.EXC_ANS__KVFIF:
            setKvfif( ( BigInteger ) newValue );
            return;
        case CimPackage.EXC_ANS__KCE:
            setKce( ( Double ) newValue );
            return;
        case CimPackage.EXC_ANS__T3:
            setT3( ( Double ) newValue );
            return;
        case CimPackage.EXC_ANS__T2:
            setT2( ( Double ) newValue );
            return;
        case CimPackage.EXC_ANS__T1:
            setT1( ( Double ) newValue );
            return;
        case CimPackage.EXC_ANS__BLINT:
            setBlint( ( BigInteger ) newValue );
            return;
        case CimPackage.EXC_ANS__TB:
            setTb( ( Double ) newValue );
            return;
        case CimPackage.EXC_ANS__K2:
            setK2( ( Double ) newValue );
            return;
        case CimPackage.EXC_ANS__K3:
            setK3( ( Double ) newValue );
            return;
        case CimPackage.EXC_ANS__KRVECC:
            setKrvecc( ( BigInteger ) newValue );
            return;
        case CimPackage.EXC_ANS__VRMN:
            setVrmn( ( Double ) newValue );
            return;
        case CimPackage.EXC_ANS__VRMX:
            setVrmx( ( Double ) newValue );
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
        case CimPackage.EXC_ANS__IFMX:
            unsetIfmx();
            return;
        case CimPackage.EXC_ANS__IFMN:
            unsetIfmn();
            return;
        case CimPackage.EXC_ANS__KVFIF:
            unsetKvfif();
            return;
        case CimPackage.EXC_ANS__KCE:
            unsetKce();
            return;
        case CimPackage.EXC_ANS__T3:
            unsetT3();
            return;
        case CimPackage.EXC_ANS__T2:
            unsetT2();
            return;
        case CimPackage.EXC_ANS__T1:
            unsetT1();
            return;
        case CimPackage.EXC_ANS__BLINT:
            unsetBlint();
            return;
        case CimPackage.EXC_ANS__TB:
            unsetTb();
            return;
        case CimPackage.EXC_ANS__K2:
            unsetK2();
            return;
        case CimPackage.EXC_ANS__K3:
            unsetK3();
            return;
        case CimPackage.EXC_ANS__KRVECC:
            unsetKrvecc();
            return;
        case CimPackage.EXC_ANS__VRMN:
            unsetVrmn();
            return;
        case CimPackage.EXC_ANS__VRMX:
            unsetVrmx();
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
        case CimPackage.EXC_ANS__IFMX:
            return isSetIfmx();
        case CimPackage.EXC_ANS__IFMN:
            return isSetIfmn();
        case CimPackage.EXC_ANS__KVFIF:
            return isSetKvfif();
        case CimPackage.EXC_ANS__KCE:
            return isSetKce();
        case CimPackage.EXC_ANS__T3:
            return isSetT3();
        case CimPackage.EXC_ANS__T2:
            return isSetT2();
        case CimPackage.EXC_ANS__T1:
            return isSetT1();
        case CimPackage.EXC_ANS__BLINT:
            return isSetBlint();
        case CimPackage.EXC_ANS__TB:
            return isSetTb();
        case CimPackage.EXC_ANS__K2:
            return isSetK2();
        case CimPackage.EXC_ANS__K3:
            return isSetK3();
        case CimPackage.EXC_ANS__KRVECC:
            return isSetKrvecc();
        case CimPackage.EXC_ANS__VRMN:
            return isSetVrmn();
        case CimPackage.EXC_ANS__VRMX:
            return isSetVrmx();
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
        result.append( " (ifmx: " );
        if( ifmxESet )
            result.append( ifmx );
        else
            result.append( "<unset>" );
        result.append( ", ifmn: " );
        if( ifmnESet )
            result.append( ifmn );
        else
            result.append( "<unset>" );
        result.append( ", kvfif: " );
        if( kvfifESet )
            result.append( kvfif );
        else
            result.append( "<unset>" );
        result.append( ", kce: " );
        if( kceESet )
            result.append( kce );
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
        result.append( ", blint: " );
        if( blintESet )
            result.append( blint );
        else
            result.append( "<unset>" );
        result.append( ", tb: " );
        if( tbESet )
            result.append( tb );
        else
            result.append( "<unset>" );
        result.append( ", k2: " );
        if( k2ESet )
            result.append( k2 );
        else
            result.append( "<unset>" );
        result.append( ", k3: " );
        if( k3ESet )
            result.append( k3 );
        else
            result.append( "<unset>" );
        result.append( ", krvecc: " );
        if( krveccESet )
            result.append( krvecc );
        else
            result.append( "<unset>" );
        result.append( ", vrmn: " );
        if( vrmnESet )
            result.append( vrmn );
        else
            result.append( "<unset>" );
        result.append( ", vrmx: " );
        if( vrmxESet )
            result.append( vrmx );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ExcANSImpl

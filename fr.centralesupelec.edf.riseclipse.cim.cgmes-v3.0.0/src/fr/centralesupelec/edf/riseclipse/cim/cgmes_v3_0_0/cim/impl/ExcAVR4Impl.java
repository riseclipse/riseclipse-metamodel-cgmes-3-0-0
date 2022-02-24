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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcAVR4;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exc AVR4</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcAVR4Impl#getVrmn <em>Vrmn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcAVR4Impl#getVrmx <em>Vrmx</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcAVR4Impl#getImul <em>Imul</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcAVR4Impl#getT1if <em>T1if</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcAVR4Impl#getKif <em>Kif</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcAVR4Impl#getTif <em>Tif</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcAVR4Impl#getT3 <em>T3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcAVR4Impl#getT4 <em>T4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcAVR4Impl#getT1 <em>T1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcAVR4Impl#getT2 <em>T2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcAVR4Impl#getKa <em>Ka</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcAVR4Impl#getKe <em>Ke</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcAVR4Impl#getVfmn <em>Vfmn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcAVR4Impl#getVfmx <em>Vfmx</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExcAVR4Impl extends ExcitationSystemDynamicsImpl implements ExcAVR4 {
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
     * The default value of the '{@link #getImul() <em>Imul</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getImul()
     * @generated
     * @ordered
     */
    protected static final Boolean IMUL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getImul() <em>Imul</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getImul()
     * @generated
     * @ordered
     */
    protected Boolean imul = IMUL_EDEFAULT;

    /**
     * This is true if the Imul attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean imulESet;

    /**
     * The default value of the '{@link #getT1if() <em>T1if</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT1if()
     * @generated
     * @ordered
     */
    protected static final Double T1IF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getT1if() <em>T1if</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT1if()
     * @generated
     * @ordered
     */
    protected Double t1if = T1IF_EDEFAULT;

    /**
     * This is true if the T1if attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean t1ifESet;

    /**
     * The default value of the '{@link #getKif() <em>Kif</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKif()
     * @generated
     * @ordered
     */
    protected static final Double KIF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKif() <em>Kif</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKif()
     * @generated
     * @ordered
     */
    protected Double kif = KIF_EDEFAULT;

    /**
     * This is true if the Kif attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kifESet;

    /**
     * The default value of the '{@link #getTif() <em>Tif</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTif()
     * @generated
     * @ordered
     */
    protected static final Double TIF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTif() <em>Tif</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTif()
     * @generated
     * @ordered
     */
    protected Double tif = TIF_EDEFAULT;

    /**
     * This is true if the Tif attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tifESet;

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
     * The default value of the '{@link #getVfmn() <em>Vfmn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVfmn()
     * @generated
     * @ordered
     */
    protected static final Double VFMN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVfmn() <em>Vfmn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVfmn()
     * @generated
     * @ordered
     */
    protected Double vfmn = VFMN_EDEFAULT;

    /**
     * This is true if the Vfmn attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vfmnESet;

    /**
     * The default value of the '{@link #getVfmx() <em>Vfmx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVfmx()
     * @generated
     * @ordered
     */
    protected static final Double VFMX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVfmx() <em>Vfmx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVfmx()
     * @generated
     * @ordered
     */
    protected Double vfmx = VFMX_EDEFAULT;

    /**
     * This is true if the Vfmx attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vfmxESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExcAVR4Impl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getExcAVR4();
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_AVR4__VRMN, oldVrmn, vrmn,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_AVR4__VRMN, oldVrmn, VRMN_EDEFAULT,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_AVR4__VRMX, oldVrmx, vrmx,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_AVR4__VRMX, oldVrmx, VRMX_EDEFAULT,
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
    public Boolean getImul() {
        return imul;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setImul( Boolean newImul ) {
        Boolean oldImul = imul;
        imul = newImul;
        boolean oldImulESet = imulESet;
        imulESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_AVR4__IMUL, oldImul, imul,
                    !oldImulESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetImul() {
        Boolean oldImul = imul;
        boolean oldImulESet = imulESet;
        imul = IMUL_EDEFAULT;
        imulESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_AVR4__IMUL, oldImul, IMUL_EDEFAULT,
                    oldImulESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetImul() {
        return imulESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getT1if() {
        return t1if;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setT1if( Double newT1if ) {
        Double oldT1if = t1if;
        t1if = newT1if;
        boolean oldT1ifESet = t1ifESet;
        t1ifESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_AVR4__T1IF, oldT1if, t1if,
                    !oldT1ifESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetT1if() {
        Double oldT1if = t1if;
        boolean oldT1ifESet = t1ifESet;
        t1if = T1IF_EDEFAULT;
        t1ifESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_AVR4__T1IF, oldT1if, T1IF_EDEFAULT,
                    oldT1ifESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetT1if() {
        return t1ifESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKif() {
        return kif;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKif( Double newKif ) {
        Double oldKif = kif;
        kif = newKif;
        boolean oldKifESet = kifESet;
        kifESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_AVR4__KIF, oldKif, kif,
                    !oldKifESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKif() {
        Double oldKif = kif;
        boolean oldKifESet = kifESet;
        kif = KIF_EDEFAULT;
        kifESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_AVR4__KIF, oldKif, KIF_EDEFAULT,
                    oldKifESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKif() {
        return kifESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTif() {
        return tif;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTif( Double newTif ) {
        Double oldTif = tif;
        tif = newTif;
        boolean oldTifESet = tifESet;
        tifESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_AVR4__TIF, oldTif, tif,
                    !oldTifESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTif() {
        Double oldTif = tif;
        boolean oldTifESet = tifESet;
        tif = TIF_EDEFAULT;
        tifESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_AVR4__TIF, oldTif, TIF_EDEFAULT,
                    oldTifESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTif() {
        return tifESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_AVR4__T3, oldT3, t3, !oldT3ESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_AVR4__T3, oldT3, T3_EDEFAULT,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_AVR4__T4, oldT4, t4, !oldT4ESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_AVR4__T4, oldT4, T4_EDEFAULT,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_AVR4__T1, oldT1, t1, !oldT1ESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_AVR4__T1, oldT1, T1_EDEFAULT,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_AVR4__T2, oldT2, t2, !oldT2ESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_AVR4__T2, oldT2, T2_EDEFAULT,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_AVR4__KA, oldKa, ka, !oldKaESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_AVR4__KA, oldKa, KA_EDEFAULT,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_AVR4__KE, oldKe, ke, !oldKeESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_AVR4__KE, oldKe, KE_EDEFAULT,
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
    public Double getVfmn() {
        return vfmn;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVfmn( Double newVfmn ) {
        Double oldVfmn = vfmn;
        vfmn = newVfmn;
        boolean oldVfmnESet = vfmnESet;
        vfmnESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_AVR4__VFMN, oldVfmn, vfmn,
                    !oldVfmnESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVfmn() {
        Double oldVfmn = vfmn;
        boolean oldVfmnESet = vfmnESet;
        vfmn = VFMN_EDEFAULT;
        vfmnESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_AVR4__VFMN, oldVfmn, VFMN_EDEFAULT,
                    oldVfmnESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVfmn() {
        return vfmnESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVfmx() {
        return vfmx;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVfmx( Double newVfmx ) {
        Double oldVfmx = vfmx;
        vfmx = newVfmx;
        boolean oldVfmxESet = vfmxESet;
        vfmxESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_AVR4__VFMX, oldVfmx, vfmx,
                    !oldVfmxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVfmx() {
        Double oldVfmx = vfmx;
        boolean oldVfmxESet = vfmxESet;
        vfmx = VFMX_EDEFAULT;
        vfmxESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_AVR4__VFMX, oldVfmx, VFMX_EDEFAULT,
                    oldVfmxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVfmx() {
        return vfmxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.EXC_AVR4__VRMN:
            return getVrmn();
        case CimPackage.EXC_AVR4__VRMX:
            return getVrmx();
        case CimPackage.EXC_AVR4__IMUL:
            return getImul();
        case CimPackage.EXC_AVR4__T1IF:
            return getT1if();
        case CimPackage.EXC_AVR4__KIF:
            return getKif();
        case CimPackage.EXC_AVR4__TIF:
            return getTif();
        case CimPackage.EXC_AVR4__T3:
            return getT3();
        case CimPackage.EXC_AVR4__T4:
            return getT4();
        case CimPackage.EXC_AVR4__T1:
            return getT1();
        case CimPackage.EXC_AVR4__T2:
            return getT2();
        case CimPackage.EXC_AVR4__KA:
            return getKa();
        case CimPackage.EXC_AVR4__KE:
            return getKe();
        case CimPackage.EXC_AVR4__VFMN:
            return getVfmn();
        case CimPackage.EXC_AVR4__VFMX:
            return getVfmx();
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
        case CimPackage.EXC_AVR4__VRMN:
            setVrmn( ( Double ) newValue );
            return;
        case CimPackage.EXC_AVR4__VRMX:
            setVrmx( ( Double ) newValue );
            return;
        case CimPackage.EXC_AVR4__IMUL:
            setImul( ( Boolean ) newValue );
            return;
        case CimPackage.EXC_AVR4__T1IF:
            setT1if( ( Double ) newValue );
            return;
        case CimPackage.EXC_AVR4__KIF:
            setKif( ( Double ) newValue );
            return;
        case CimPackage.EXC_AVR4__TIF:
            setTif( ( Double ) newValue );
            return;
        case CimPackage.EXC_AVR4__T3:
            setT3( ( Double ) newValue );
            return;
        case CimPackage.EXC_AVR4__T4:
            setT4( ( Double ) newValue );
            return;
        case CimPackage.EXC_AVR4__T1:
            setT1( ( Double ) newValue );
            return;
        case CimPackage.EXC_AVR4__T2:
            setT2( ( Double ) newValue );
            return;
        case CimPackage.EXC_AVR4__KA:
            setKa( ( Double ) newValue );
            return;
        case CimPackage.EXC_AVR4__KE:
            setKe( ( Double ) newValue );
            return;
        case CimPackage.EXC_AVR4__VFMN:
            setVfmn( ( Double ) newValue );
            return;
        case CimPackage.EXC_AVR4__VFMX:
            setVfmx( ( Double ) newValue );
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
        case CimPackage.EXC_AVR4__VRMN:
            unsetVrmn();
            return;
        case CimPackage.EXC_AVR4__VRMX:
            unsetVrmx();
            return;
        case CimPackage.EXC_AVR4__IMUL:
            unsetImul();
            return;
        case CimPackage.EXC_AVR4__T1IF:
            unsetT1if();
            return;
        case CimPackage.EXC_AVR4__KIF:
            unsetKif();
            return;
        case CimPackage.EXC_AVR4__TIF:
            unsetTif();
            return;
        case CimPackage.EXC_AVR4__T3:
            unsetT3();
            return;
        case CimPackage.EXC_AVR4__T4:
            unsetT4();
            return;
        case CimPackage.EXC_AVR4__T1:
            unsetT1();
            return;
        case CimPackage.EXC_AVR4__T2:
            unsetT2();
            return;
        case CimPackage.EXC_AVR4__KA:
            unsetKa();
            return;
        case CimPackage.EXC_AVR4__KE:
            unsetKe();
            return;
        case CimPackage.EXC_AVR4__VFMN:
            unsetVfmn();
            return;
        case CimPackage.EXC_AVR4__VFMX:
            unsetVfmx();
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
        case CimPackage.EXC_AVR4__VRMN:
            return isSetVrmn();
        case CimPackage.EXC_AVR4__VRMX:
            return isSetVrmx();
        case CimPackage.EXC_AVR4__IMUL:
            return isSetImul();
        case CimPackage.EXC_AVR4__T1IF:
            return isSetT1if();
        case CimPackage.EXC_AVR4__KIF:
            return isSetKif();
        case CimPackage.EXC_AVR4__TIF:
            return isSetTif();
        case CimPackage.EXC_AVR4__T3:
            return isSetT3();
        case CimPackage.EXC_AVR4__T4:
            return isSetT4();
        case CimPackage.EXC_AVR4__T1:
            return isSetT1();
        case CimPackage.EXC_AVR4__T2:
            return isSetT2();
        case CimPackage.EXC_AVR4__KA:
            return isSetKa();
        case CimPackage.EXC_AVR4__KE:
            return isSetKe();
        case CimPackage.EXC_AVR4__VFMN:
            return isSetVfmn();
        case CimPackage.EXC_AVR4__VFMX:
            return isSetVfmx();
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
        result.append( " (vrmn: " );
        if( vrmnESet )
            result.append( vrmn );
        else
            result.append( "<unset>" );
        result.append( ", vrmx: " );
        if( vrmxESet )
            result.append( vrmx );
        else
            result.append( "<unset>" );
        result.append( ", imul: " );
        if( imulESet )
            result.append( imul );
        else
            result.append( "<unset>" );
        result.append( ", t1if: " );
        if( t1ifESet )
            result.append( t1if );
        else
            result.append( "<unset>" );
        result.append( ", kif: " );
        if( kifESet )
            result.append( kif );
        else
            result.append( "<unset>" );
        result.append( ", tif: " );
        if( tifESet )
            result.append( tif );
        else
            result.append( "<unset>" );
        result.append( ", t3: " );
        if( t3ESet )
            result.append( t3 );
        else
            result.append( "<unset>" );
        result.append( ", t4: " );
        if( t4ESet )
            result.append( t4 );
        else
            result.append( "<unset>" );
        result.append( ", t1: " );
        if( t1ESet )
            result.append( t1 );
        else
            result.append( "<unset>" );
        result.append( ", t2: " );
        if( t2ESet )
            result.append( t2 );
        else
            result.append( "<unset>" );
        result.append( ", ka: " );
        if( kaESet )
            result.append( ka );
        else
            result.append( "<unset>" );
        result.append( ", ke: " );
        if( keESet )
            result.append( ke );
        else
            result.append( "<unset>" );
        result.append( ", vfmn: " );
        if( vfmnESet )
            result.append( vfmn );
        else
            result.append( "<unset>" );
        result.append( ", vfmx: " );
        if( vfmxESet )
            result.append( vfmx );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ExcAVR4Impl

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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimX2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Overexc Lim X2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.OverexcLimX2Impl#getVlow <em>Vlow</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.OverexcLimX2Impl#getEfdrated <em>Efdrated</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.OverexcLimX2Impl#getEfddes <em>Efddes</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.OverexcLimX2Impl#getM <em>M</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.OverexcLimX2Impl#getKmx <em>Kmx</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.OverexcLimX2Impl#getEfd2 <em>Efd2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.OverexcLimX2Impl#getEfd1 <em>Efd1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.OverexcLimX2Impl#getEfd3 <em>Efd3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.OverexcLimX2Impl#getT1 <em>T1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.OverexcLimX2Impl#getT2 <em>T2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.OverexcLimX2Impl#getT3 <em>T3</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OverexcLimX2Impl extends OverexcitationLimiterDynamicsImpl implements OverexcLimX2 {
    /**
     * The default value of the '{@link #getVlow() <em>Vlow</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVlow()
     * @generated
     * @ordered
     */
    protected static final Double VLOW_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVlow() <em>Vlow</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVlow()
     * @generated
     * @ordered
     */
    protected Double vlow = VLOW_EDEFAULT;

    /**
     * This is true if the Vlow attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vlowESet;

    /**
     * The default value of the '{@link #getEfdrated() <em>Efdrated</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEfdrated()
     * @generated
     * @ordered
     */
    protected static final Double EFDRATED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEfdrated() <em>Efdrated</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEfdrated()
     * @generated
     * @ordered
     */
    protected Double efdrated = EFDRATED_EDEFAULT;

    /**
     * This is true if the Efdrated attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean efdratedESet;

    /**
     * The default value of the '{@link #getEfddes() <em>Efddes</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEfddes()
     * @generated
     * @ordered
     */
    protected static final Double EFDDES_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEfddes() <em>Efddes</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEfddes()
     * @generated
     * @ordered
     */
    protected Double efddes = EFDDES_EDEFAULT;

    /**
     * This is true if the Efddes attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean efddesESet;

    /**
     * The default value of the '{@link #getM() <em>M</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getM()
     * @generated
     * @ordered
     */
    protected static final Boolean M_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getM() <em>M</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getM()
     * @generated
     * @ordered
     */
    protected Boolean m = M_EDEFAULT;

    /**
     * This is true if the M attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean mESet;

    /**
     * The default value of the '{@link #getKmx() <em>Kmx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKmx()
     * @generated
     * @ordered
     */
    protected static final Double KMX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKmx() <em>Kmx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKmx()
     * @generated
     * @ordered
     */
    protected Double kmx = KMX_EDEFAULT;

    /**
     * This is true if the Kmx attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kmxESet;

    /**
     * The default value of the '{@link #getEfd2() <em>Efd2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEfd2()
     * @generated
     * @ordered
     */
    protected static final Double EFD2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEfd2() <em>Efd2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEfd2()
     * @generated
     * @ordered
     */
    protected Double efd2 = EFD2_EDEFAULT;

    /**
     * This is true if the Efd2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean efd2ESet;

    /**
     * The default value of the '{@link #getEfd1() <em>Efd1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEfd1()
     * @generated
     * @ordered
     */
    protected static final Double EFD1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEfd1() <em>Efd1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEfd1()
     * @generated
     * @ordered
     */
    protected Double efd1 = EFD1_EDEFAULT;

    /**
     * This is true if the Efd1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean efd1ESet;

    /**
     * The default value of the '{@link #getEfd3() <em>Efd3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEfd3()
     * @generated
     * @ordered
     */
    protected static final Double EFD3_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEfd3() <em>Efd3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEfd3()
     * @generated
     * @ordered
     */
    protected Double efd3 = EFD3_EDEFAULT;

    /**
     * This is true if the Efd3 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean efd3ESet;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OverexcLimX2Impl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getOverexcLimX2();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVlow() {
        return vlow;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVlow( Double newVlow ) {
        Double oldVlow = vlow;
        vlow = newVlow;
        boolean oldVlowESet = vlowESet;
        vlowESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.OVEREXC_LIM_X2__VLOW, oldVlow, vlow,
                    !oldVlowESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVlow() {
        Double oldVlow = vlow;
        boolean oldVlowESet = vlowESet;
        vlow = VLOW_EDEFAULT;
        vlowESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.OVEREXC_LIM_X2__VLOW, oldVlow,
                    VLOW_EDEFAULT, oldVlowESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVlow() {
        return vlowESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getEfdrated() {
        return efdrated;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEfdrated( Double newEfdrated ) {
        Double oldEfdrated = efdrated;
        efdrated = newEfdrated;
        boolean oldEfdratedESet = efdratedESet;
        efdratedESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.OVEREXC_LIM_X2__EFDRATED, oldEfdrated,
                    efdrated, !oldEfdratedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEfdrated() {
        Double oldEfdrated = efdrated;
        boolean oldEfdratedESet = efdratedESet;
        efdrated = EFDRATED_EDEFAULT;
        efdratedESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.OVEREXC_LIM_X2__EFDRATED, oldEfdrated,
                    EFDRATED_EDEFAULT, oldEfdratedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEfdrated() {
        return efdratedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getEfddes() {
        return efddes;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEfddes( Double newEfddes ) {
        Double oldEfddes = efddes;
        efddes = newEfddes;
        boolean oldEfddesESet = efddesESet;
        efddesESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.OVEREXC_LIM_X2__EFDDES, oldEfddes,
                    efddes, !oldEfddesESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEfddes() {
        Double oldEfddes = efddes;
        boolean oldEfddesESet = efddesESet;
        efddes = EFDDES_EDEFAULT;
        efddesESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.OVEREXC_LIM_X2__EFDDES, oldEfddes,
                    EFDDES_EDEFAULT, oldEfddesESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEfddes() {
        return efddesESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getM() {
        return m;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setM( Boolean newM ) {
        Boolean oldM = m;
        m = newM;
        boolean oldMESet = mESet;
        mESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.OVEREXC_LIM_X2__M, oldM, m,
                    !oldMESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetM() {
        Boolean oldM = m;
        boolean oldMESet = mESet;
        m = M_EDEFAULT;
        mESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.OVEREXC_LIM_X2__M, oldM, M_EDEFAULT,
                    oldMESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetM() {
        return mESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKmx() {
        return kmx;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKmx( Double newKmx ) {
        Double oldKmx = kmx;
        kmx = newKmx;
        boolean oldKmxESet = kmxESet;
        kmxESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.OVEREXC_LIM_X2__KMX, oldKmx, kmx,
                    !oldKmxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKmx() {
        Double oldKmx = kmx;
        boolean oldKmxESet = kmxESet;
        kmx = KMX_EDEFAULT;
        kmxESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.OVEREXC_LIM_X2__KMX, oldKmx,
                    KMX_EDEFAULT, oldKmxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKmx() {
        return kmxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getEfd2() {
        return efd2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEfd2( Double newEfd2 ) {
        Double oldEfd2 = efd2;
        efd2 = newEfd2;
        boolean oldEfd2ESet = efd2ESet;
        efd2ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.OVEREXC_LIM_X2__EFD2, oldEfd2, efd2,
                    !oldEfd2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEfd2() {
        Double oldEfd2 = efd2;
        boolean oldEfd2ESet = efd2ESet;
        efd2 = EFD2_EDEFAULT;
        efd2ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.OVEREXC_LIM_X2__EFD2, oldEfd2,
                    EFD2_EDEFAULT, oldEfd2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEfd2() {
        return efd2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getEfd1() {
        return efd1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEfd1( Double newEfd1 ) {
        Double oldEfd1 = efd1;
        efd1 = newEfd1;
        boolean oldEfd1ESet = efd1ESet;
        efd1ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.OVEREXC_LIM_X2__EFD1, oldEfd1, efd1,
                    !oldEfd1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEfd1() {
        Double oldEfd1 = efd1;
        boolean oldEfd1ESet = efd1ESet;
        efd1 = EFD1_EDEFAULT;
        efd1ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.OVEREXC_LIM_X2__EFD1, oldEfd1,
                    EFD1_EDEFAULT, oldEfd1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEfd1() {
        return efd1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getEfd3() {
        return efd3;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEfd3( Double newEfd3 ) {
        Double oldEfd3 = efd3;
        efd3 = newEfd3;
        boolean oldEfd3ESet = efd3ESet;
        efd3ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.OVEREXC_LIM_X2__EFD3, oldEfd3, efd3,
                    !oldEfd3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEfd3() {
        Double oldEfd3 = efd3;
        boolean oldEfd3ESet = efd3ESet;
        efd3 = EFD3_EDEFAULT;
        efd3ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.OVEREXC_LIM_X2__EFD3, oldEfd3,
                    EFD3_EDEFAULT, oldEfd3ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEfd3() {
        return efd3ESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.OVEREXC_LIM_X2__T1, oldT1, t1,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.OVEREXC_LIM_X2__T1, oldT1, T1_EDEFAULT,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.OVEREXC_LIM_X2__T2, oldT2, t2,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.OVEREXC_LIM_X2__T2, oldT2, T2_EDEFAULT,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.OVEREXC_LIM_X2__T3, oldT3, t3,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.OVEREXC_LIM_X2__T3, oldT3, T3_EDEFAULT,
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
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.OVEREXC_LIM_X2__VLOW:
            return getVlow();
        case CimPackage.OVEREXC_LIM_X2__EFDRATED:
            return getEfdrated();
        case CimPackage.OVEREXC_LIM_X2__EFDDES:
            return getEfddes();
        case CimPackage.OVEREXC_LIM_X2__M:
            return getM();
        case CimPackage.OVEREXC_LIM_X2__KMX:
            return getKmx();
        case CimPackage.OVEREXC_LIM_X2__EFD2:
            return getEfd2();
        case CimPackage.OVEREXC_LIM_X2__EFD1:
            return getEfd1();
        case CimPackage.OVEREXC_LIM_X2__EFD3:
            return getEfd3();
        case CimPackage.OVEREXC_LIM_X2__T1:
            return getT1();
        case CimPackage.OVEREXC_LIM_X2__T2:
            return getT2();
        case CimPackage.OVEREXC_LIM_X2__T3:
            return getT3();
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
        case CimPackage.OVEREXC_LIM_X2__VLOW:
            setVlow( ( Double ) newValue );
            return;
        case CimPackage.OVEREXC_LIM_X2__EFDRATED:
            setEfdrated( ( Double ) newValue );
            return;
        case CimPackage.OVEREXC_LIM_X2__EFDDES:
            setEfddes( ( Double ) newValue );
            return;
        case CimPackage.OVEREXC_LIM_X2__M:
            setM( ( Boolean ) newValue );
            return;
        case CimPackage.OVEREXC_LIM_X2__KMX:
            setKmx( ( Double ) newValue );
            return;
        case CimPackage.OVEREXC_LIM_X2__EFD2:
            setEfd2( ( Double ) newValue );
            return;
        case CimPackage.OVEREXC_LIM_X2__EFD1:
            setEfd1( ( Double ) newValue );
            return;
        case CimPackage.OVEREXC_LIM_X2__EFD3:
            setEfd3( ( Double ) newValue );
            return;
        case CimPackage.OVEREXC_LIM_X2__T1:
            setT1( ( Double ) newValue );
            return;
        case CimPackage.OVEREXC_LIM_X2__T2:
            setT2( ( Double ) newValue );
            return;
        case CimPackage.OVEREXC_LIM_X2__T3:
            setT3( ( Double ) newValue );
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
        case CimPackage.OVEREXC_LIM_X2__VLOW:
            unsetVlow();
            return;
        case CimPackage.OVEREXC_LIM_X2__EFDRATED:
            unsetEfdrated();
            return;
        case CimPackage.OVEREXC_LIM_X2__EFDDES:
            unsetEfddes();
            return;
        case CimPackage.OVEREXC_LIM_X2__M:
            unsetM();
            return;
        case CimPackage.OVEREXC_LIM_X2__KMX:
            unsetKmx();
            return;
        case CimPackage.OVEREXC_LIM_X2__EFD2:
            unsetEfd2();
            return;
        case CimPackage.OVEREXC_LIM_X2__EFD1:
            unsetEfd1();
            return;
        case CimPackage.OVEREXC_LIM_X2__EFD3:
            unsetEfd3();
            return;
        case CimPackage.OVEREXC_LIM_X2__T1:
            unsetT1();
            return;
        case CimPackage.OVEREXC_LIM_X2__T2:
            unsetT2();
            return;
        case CimPackage.OVEREXC_LIM_X2__T3:
            unsetT3();
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
        case CimPackage.OVEREXC_LIM_X2__VLOW:
            return isSetVlow();
        case CimPackage.OVEREXC_LIM_X2__EFDRATED:
            return isSetEfdrated();
        case CimPackage.OVEREXC_LIM_X2__EFDDES:
            return isSetEfddes();
        case CimPackage.OVEREXC_LIM_X2__M:
            return isSetM();
        case CimPackage.OVEREXC_LIM_X2__KMX:
            return isSetKmx();
        case CimPackage.OVEREXC_LIM_X2__EFD2:
            return isSetEfd2();
        case CimPackage.OVEREXC_LIM_X2__EFD1:
            return isSetEfd1();
        case CimPackage.OVEREXC_LIM_X2__EFD3:
            return isSetEfd3();
        case CimPackage.OVEREXC_LIM_X2__T1:
            return isSetT1();
        case CimPackage.OVEREXC_LIM_X2__T2:
            return isSetT2();
        case CimPackage.OVEREXC_LIM_X2__T3:
            return isSetT3();
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
        result.append( " (vlow: " );
        if( vlowESet )
            result.append( vlow );
        else
            result.append( "<unset>" );
        result.append( ", efdrated: " );
        if( efdratedESet )
            result.append( efdrated );
        else
            result.append( "<unset>" );
        result.append( ", efddes: " );
        if( efddesESet )
            result.append( efddes );
        else
            result.append( "<unset>" );
        result.append( ", m: " );
        if( mESet )
            result.append( m );
        else
            result.append( "<unset>" );
        result.append( ", kmx: " );
        if( kmxESet )
            result.append( kmx );
        else
            result.append( "<unset>" );
        result.append( ", efd2: " );
        if( efd2ESet )
            result.append( efd2 );
        else
            result.append( "<unset>" );
        result.append( ", efd1: " );
        if( efd1ESet )
            result.append( efd1 );
        else
            result.append( "<unset>" );
        result.append( ", efd3: " );
        if( efd3ESet )
            result.append( efd3 );
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
        result.append( ", t3: " );
        if( t3ESet )
            result.append( t3 );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //OverexcLimX2Impl

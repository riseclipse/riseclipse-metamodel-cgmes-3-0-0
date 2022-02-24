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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEDC3A;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exc IEEEDC3A</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEDC3AImpl#getSeefd2 <em>Seefd2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEDC3AImpl#getSeefd1 <em>Seefd1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEDC3AImpl#getTrh <em>Trh</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEDC3AImpl#getEfd2 <em>Efd2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEDC3AImpl#getEfd1 <em>Efd1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEDC3AImpl#getExclim <em>Exclim</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEDC3AImpl#getTe <em>Te</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEDC3AImpl#getKe <em>Ke</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEDC3AImpl#getKv <em>Kv</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEDC3AImpl#getVrmin <em>Vrmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEDC3AImpl#getVrmax <em>Vrmax</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExcIEEEDC3AImpl extends ExcitationSystemDynamicsImpl implements ExcIEEEDC3A {
    /**
     * The default value of the '{@link #getSeefd2() <em>Seefd2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSeefd2()
     * @generated
     * @ordered
     */
    protected static final Double SEEFD2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSeefd2() <em>Seefd2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSeefd2()
     * @generated
     * @ordered
     */
    protected Double seefd2 = SEEFD2_EDEFAULT;

    /**
     * This is true if the Seefd2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean seefd2ESet;

    /**
     * The default value of the '{@link #getSeefd1() <em>Seefd1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSeefd1()
     * @generated
     * @ordered
     */
    protected static final Double SEEFD1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSeefd1() <em>Seefd1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSeefd1()
     * @generated
     * @ordered
     */
    protected Double seefd1 = SEEFD1_EDEFAULT;

    /**
     * This is true if the Seefd1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean seefd1ESet;

    /**
     * The default value of the '{@link #getTrh() <em>Trh</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTrh()
     * @generated
     * @ordered
     */
    protected static final Double TRH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTrh() <em>Trh</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTrh()
     * @generated
     * @ordered
     */
    protected Double trh = TRH_EDEFAULT;

    /**
     * This is true if the Trh attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean trhESet;

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
     * The default value of the '{@link #getExclim() <em>Exclim</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExclim()
     * @generated
     * @ordered
     */
    protected static final Boolean EXCLIM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getExclim() <em>Exclim</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExclim()
     * @generated
     * @ordered
     */
    protected Boolean exclim = EXCLIM_EDEFAULT;

    /**
     * This is true if the Exclim attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean exclimESet;

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
     * The default value of the '{@link #getKv() <em>Kv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKv()
     * @generated
     * @ordered
     */
    protected static final Double KV_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKv() <em>Kv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKv()
     * @generated
     * @ordered
     */
    protected Double kv = KV_EDEFAULT;

    /**
     * This is true if the Kv attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kvESet;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExcIEEEDC3AImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getExcIEEEDC3A();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getSeefd2() {
        return seefd2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSeefd2( Double newSeefd2 ) {
        Double oldSeefd2 = seefd2;
        seefd2 = newSeefd2;
        boolean oldSeefd2ESet = seefd2ESet;
        seefd2ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEDC3A__SEEFD2, oldSeefd2, seefd2,
                    !oldSeefd2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSeefd2() {
        Double oldSeefd2 = seefd2;
        boolean oldSeefd2ESet = seefd2ESet;
        seefd2 = SEEFD2_EDEFAULT;
        seefd2ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEDC3A__SEEFD2, oldSeefd2,
                    SEEFD2_EDEFAULT, oldSeefd2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSeefd2() {
        return seefd2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getSeefd1() {
        return seefd1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSeefd1( Double newSeefd1 ) {
        Double oldSeefd1 = seefd1;
        seefd1 = newSeefd1;
        boolean oldSeefd1ESet = seefd1ESet;
        seefd1ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEDC3A__SEEFD1, oldSeefd1, seefd1,
                    !oldSeefd1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSeefd1() {
        Double oldSeefd1 = seefd1;
        boolean oldSeefd1ESet = seefd1ESet;
        seefd1 = SEEFD1_EDEFAULT;
        seefd1ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEDC3A__SEEFD1, oldSeefd1,
                    SEEFD1_EDEFAULT, oldSeefd1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSeefd1() {
        return seefd1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTrh() {
        return trh;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTrh( Double newTrh ) {
        Double oldTrh = trh;
        trh = newTrh;
        boolean oldTrhESet = trhESet;
        trhESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEDC3A__TRH, oldTrh, trh,
                    !oldTrhESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTrh() {
        Double oldTrh = trh;
        boolean oldTrhESet = trhESet;
        trh = TRH_EDEFAULT;
        trhESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEDC3A__TRH, oldTrh,
                    TRH_EDEFAULT, oldTrhESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTrh() {
        return trhESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEDC3A__EFD2, oldEfd2, efd2,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEDC3A__EFD2, oldEfd2,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEDC3A__EFD1, oldEfd1, efd1,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEDC3A__EFD1, oldEfd1,
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
    public Boolean getExclim() {
        return exclim;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setExclim( Boolean newExclim ) {
        Boolean oldExclim = exclim;
        exclim = newExclim;
        boolean oldExclimESet = exclimESet;
        exclimESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEDC3A__EXCLIM, oldExclim, exclim,
                    !oldExclimESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetExclim() {
        Boolean oldExclim = exclim;
        boolean oldExclimESet = exclimESet;
        exclim = EXCLIM_EDEFAULT;
        exclimESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEDC3A__EXCLIM, oldExclim,
                    EXCLIM_EDEFAULT, oldExclimESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetExclim() {
        return exclimESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEDC3A__TE, oldTe, te,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEDC3A__TE, oldTe, TE_EDEFAULT,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEDC3A__KE, oldKe, ke,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEDC3A__KE, oldKe, KE_EDEFAULT,
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
    public Double getKv() {
        return kv;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKv( Double newKv ) {
        Double oldKv = kv;
        kv = newKv;
        boolean oldKvESet = kvESet;
        kvESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEDC3A__KV, oldKv, kv,
                    !oldKvESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKv() {
        Double oldKv = kv;
        boolean oldKvESet = kvESet;
        kv = KV_EDEFAULT;
        kvESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEDC3A__KV, oldKv, KV_EDEFAULT,
                    oldKvESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKv() {
        return kvESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEDC3A__VRMIN, oldVrmin, vrmin,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEDC3A__VRMIN, oldVrmin,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEDC3A__VRMAX, oldVrmax, vrmax,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEDC3A__VRMAX, oldVrmax,
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
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.EXC_IEEEDC3A__SEEFD2:
            return getSeefd2();
        case CimPackage.EXC_IEEEDC3A__SEEFD1:
            return getSeefd1();
        case CimPackage.EXC_IEEEDC3A__TRH:
            return getTrh();
        case CimPackage.EXC_IEEEDC3A__EFD2:
            return getEfd2();
        case CimPackage.EXC_IEEEDC3A__EFD1:
            return getEfd1();
        case CimPackage.EXC_IEEEDC3A__EXCLIM:
            return getExclim();
        case CimPackage.EXC_IEEEDC3A__TE:
            return getTe();
        case CimPackage.EXC_IEEEDC3A__KE:
            return getKe();
        case CimPackage.EXC_IEEEDC3A__KV:
            return getKv();
        case CimPackage.EXC_IEEEDC3A__VRMIN:
            return getVrmin();
        case CimPackage.EXC_IEEEDC3A__VRMAX:
            return getVrmax();
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
        case CimPackage.EXC_IEEEDC3A__SEEFD2:
            setSeefd2( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEDC3A__SEEFD1:
            setSeefd1( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEDC3A__TRH:
            setTrh( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEDC3A__EFD2:
            setEfd2( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEDC3A__EFD1:
            setEfd1( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEDC3A__EXCLIM:
            setExclim( ( Boolean ) newValue );
            return;
        case CimPackage.EXC_IEEEDC3A__TE:
            setTe( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEDC3A__KE:
            setKe( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEDC3A__KV:
            setKv( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEDC3A__VRMIN:
            setVrmin( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEDC3A__VRMAX:
            setVrmax( ( Double ) newValue );
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
        case CimPackage.EXC_IEEEDC3A__SEEFD2:
            unsetSeefd2();
            return;
        case CimPackage.EXC_IEEEDC3A__SEEFD1:
            unsetSeefd1();
            return;
        case CimPackage.EXC_IEEEDC3A__TRH:
            unsetTrh();
            return;
        case CimPackage.EXC_IEEEDC3A__EFD2:
            unsetEfd2();
            return;
        case CimPackage.EXC_IEEEDC3A__EFD1:
            unsetEfd1();
            return;
        case CimPackage.EXC_IEEEDC3A__EXCLIM:
            unsetExclim();
            return;
        case CimPackage.EXC_IEEEDC3A__TE:
            unsetTe();
            return;
        case CimPackage.EXC_IEEEDC3A__KE:
            unsetKe();
            return;
        case CimPackage.EXC_IEEEDC3A__KV:
            unsetKv();
            return;
        case CimPackage.EXC_IEEEDC3A__VRMIN:
            unsetVrmin();
            return;
        case CimPackage.EXC_IEEEDC3A__VRMAX:
            unsetVrmax();
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
        case CimPackage.EXC_IEEEDC3A__SEEFD2:
            return isSetSeefd2();
        case CimPackage.EXC_IEEEDC3A__SEEFD1:
            return isSetSeefd1();
        case CimPackage.EXC_IEEEDC3A__TRH:
            return isSetTrh();
        case CimPackage.EXC_IEEEDC3A__EFD2:
            return isSetEfd2();
        case CimPackage.EXC_IEEEDC3A__EFD1:
            return isSetEfd1();
        case CimPackage.EXC_IEEEDC3A__EXCLIM:
            return isSetExclim();
        case CimPackage.EXC_IEEEDC3A__TE:
            return isSetTe();
        case CimPackage.EXC_IEEEDC3A__KE:
            return isSetKe();
        case CimPackage.EXC_IEEEDC3A__KV:
            return isSetKv();
        case CimPackage.EXC_IEEEDC3A__VRMIN:
            return isSetVrmin();
        case CimPackage.EXC_IEEEDC3A__VRMAX:
            return isSetVrmax();
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
        result.append( " (seefd2: " );
        if( seefd2ESet )
            result.append( seefd2 );
        else
            result.append( "<unset>" );
        result.append( ", seefd1: " );
        if( seefd1ESet )
            result.append( seefd1 );
        else
            result.append( "<unset>" );
        result.append( ", trh: " );
        if( trhESet )
            result.append( trh );
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
        result.append( ", exclim: " );
        if( exclimESet )
            result.append( exclim );
        else
            result.append( "<unset>" );
        result.append( ", te: " );
        if( teESet )
            result.append( te );
        else
            result.append( "<unset>" );
        result.append( ", ke: " );
        if( keESet )
            result.append( ke );
        else
            result.append( "<unset>" );
        result.append( ", kv: " );
        if( kvESet )
            result.append( kv );
        else
            result.append( "<unset>" );
        result.append( ", vrmin: " );
        if( vrminESet )
            result.append( vrmin );
        else
            result.append( "<unset>" );
        result.append( ", vrmax: " );
        if( vrmaxESet )
            result.append( vrmax );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ExcIEEEDC3AImpl

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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST6B;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcST6BOELselectorKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exc IEEEST6B</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEST6BImpl#getOelin <em>Oelin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEST6BImpl#getKpa <em>Kpa</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEST6BImpl#getKlr <em>Klr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEST6BImpl#getVrmax <em>Vrmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEST6BImpl#getVrmin <em>Vrmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEST6BImpl#getKia <em>Kia</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEST6BImpl#getKci <em>Kci</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEST6BImpl#getKff <em>Kff</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEST6BImpl#getIlr <em>Ilr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEST6BImpl#getTg <em>Tg</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEST6BImpl#getKm <em>Km</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEST6BImpl#getKg <em>Kg</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEST6BImpl#getVamax <em>Vamax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEST6BImpl#getVamin <em>Vamin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExcIEEEST6BImpl extends ExcitationSystemDynamicsImpl implements ExcIEEEST6B {
    /**
     * The default value of the '{@link #getOelin() <em>Oelin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOelin()
     * @generated
     * @ordered
     */
    protected static final ExcST6BOELselectorKind OELIN_EDEFAULT = ExcST6BOELselectorKind.NO_OE_LINPUT;

    /**
     * The cached value of the '{@link #getOelin() <em>Oelin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOelin()
     * @generated
     * @ordered
     */
    protected ExcST6BOELselectorKind oelin = OELIN_EDEFAULT;

    /**
     * This is true if the Oelin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean oelinESet;

    /**
     * The default value of the '{@link #getKpa() <em>Kpa</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKpa()
     * @generated
     * @ordered
     */
    protected static final Double KPA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKpa() <em>Kpa</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKpa()
     * @generated
     * @ordered
     */
    protected Double kpa = KPA_EDEFAULT;

    /**
     * This is true if the Kpa attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kpaESet;

    /**
     * The default value of the '{@link #getKlr() <em>Klr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKlr()
     * @generated
     * @ordered
     */
    protected static final Double KLR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKlr() <em>Klr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKlr()
     * @generated
     * @ordered
     */
    protected Double klr = KLR_EDEFAULT;

    /**
     * This is true if the Klr attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean klrESet;

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
     * The default value of the '{@link #getKia() <em>Kia</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKia()
     * @generated
     * @ordered
     */
    protected static final Double KIA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKia() <em>Kia</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKia()
     * @generated
     * @ordered
     */
    protected Double kia = KIA_EDEFAULT;

    /**
     * This is true if the Kia attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kiaESet;

    /**
     * The default value of the '{@link #getKci() <em>Kci</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKci()
     * @generated
     * @ordered
     */
    protected static final Double KCI_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKci() <em>Kci</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKci()
     * @generated
     * @ordered
     */
    protected Double kci = KCI_EDEFAULT;

    /**
     * This is true if the Kci attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kciESet;

    /**
     * The default value of the '{@link #getKff() <em>Kff</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKff()
     * @generated
     * @ordered
     */
    protected static final Double KFF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKff() <em>Kff</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKff()
     * @generated
     * @ordered
     */
    protected Double kff = KFF_EDEFAULT;

    /**
     * This is true if the Kff attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kffESet;

    /**
     * The default value of the '{@link #getIlr() <em>Ilr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIlr()
     * @generated
     * @ordered
     */
    protected static final Double ILR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIlr() <em>Ilr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIlr()
     * @generated
     * @ordered
     */
    protected Double ilr = ILR_EDEFAULT;

    /**
     * This is true if the Ilr attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ilrESet;

    /**
     * The default value of the '{@link #getTg() <em>Tg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTg()
     * @generated
     * @ordered
     */
    protected static final Double TG_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTg() <em>Tg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTg()
     * @generated
     * @ordered
     */
    protected Double tg = TG_EDEFAULT;

    /**
     * This is true if the Tg attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tgESet;

    /**
     * The default value of the '{@link #getKm() <em>Km</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKm()
     * @generated
     * @ordered
     */
    protected static final Double KM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKm() <em>Km</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKm()
     * @generated
     * @ordered
     */
    protected Double km = KM_EDEFAULT;

    /**
     * This is true if the Km attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kmESet;

    /**
     * The default value of the '{@link #getKg() <em>Kg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKg()
     * @generated
     * @ordered
     */
    protected static final Double KG_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKg() <em>Kg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKg()
     * @generated
     * @ordered
     */
    protected Double kg = KG_EDEFAULT;

    /**
     * This is true if the Kg attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kgESet;

    /**
     * The default value of the '{@link #getVamax() <em>Vamax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVamax()
     * @generated
     * @ordered
     */
    protected static final Double VAMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVamax() <em>Vamax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVamax()
     * @generated
     * @ordered
     */
    protected Double vamax = VAMAX_EDEFAULT;

    /**
     * This is true if the Vamax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vamaxESet;

    /**
     * The default value of the '{@link #getVamin() <em>Vamin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVamin()
     * @generated
     * @ordered
     */
    protected static final Double VAMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVamin() <em>Vamin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVamin()
     * @generated
     * @ordered
     */
    protected Double vamin = VAMIN_EDEFAULT;

    /**
     * This is true if the Vamin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vaminESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExcIEEEST6BImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getExcIEEEST6B();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcST6BOELselectorKind getOelin() {
        return oelin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOelin( ExcST6BOELselectorKind newOelin ) {
        ExcST6BOELselectorKind oldOelin = oelin;
        oelin = newOelin == null ? OELIN_EDEFAULT : newOelin;
        boolean oldOelinESet = oelinESet;
        oelinESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEST6B__OELIN, oldOelin, oelin,
                    !oldOelinESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOelin() {
        ExcST6BOELselectorKind oldOelin = oelin;
        boolean oldOelinESet = oelinESet;
        oelin = OELIN_EDEFAULT;
        oelinESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEST6B__OELIN, oldOelin,
                    OELIN_EDEFAULT, oldOelinESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOelin() {
        return oelinESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKpa() {
        return kpa;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKpa( Double newKpa ) {
        Double oldKpa = kpa;
        kpa = newKpa;
        boolean oldKpaESet = kpaESet;
        kpaESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEST6B__KPA, oldKpa, kpa,
                    !oldKpaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKpa() {
        Double oldKpa = kpa;
        boolean oldKpaESet = kpaESet;
        kpa = KPA_EDEFAULT;
        kpaESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEST6B__KPA, oldKpa,
                    KPA_EDEFAULT, oldKpaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKpa() {
        return kpaESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKlr() {
        return klr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKlr( Double newKlr ) {
        Double oldKlr = klr;
        klr = newKlr;
        boolean oldKlrESet = klrESet;
        klrESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEST6B__KLR, oldKlr, klr,
                    !oldKlrESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKlr() {
        Double oldKlr = klr;
        boolean oldKlrESet = klrESet;
        klr = KLR_EDEFAULT;
        klrESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEST6B__KLR, oldKlr,
                    KLR_EDEFAULT, oldKlrESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKlr() {
        return klrESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEST6B__VRMAX, oldVrmax, vrmax,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEST6B__VRMAX, oldVrmax,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEST6B__VRMIN, oldVrmin, vrmin,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEST6B__VRMIN, oldVrmin,
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
    public Double getKia() {
        return kia;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKia( Double newKia ) {
        Double oldKia = kia;
        kia = newKia;
        boolean oldKiaESet = kiaESet;
        kiaESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEST6B__KIA, oldKia, kia,
                    !oldKiaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKia() {
        Double oldKia = kia;
        boolean oldKiaESet = kiaESet;
        kia = KIA_EDEFAULT;
        kiaESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEST6B__KIA, oldKia,
                    KIA_EDEFAULT, oldKiaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKia() {
        return kiaESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKci() {
        return kci;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKci( Double newKci ) {
        Double oldKci = kci;
        kci = newKci;
        boolean oldKciESet = kciESet;
        kciESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEST6B__KCI, oldKci, kci,
                    !oldKciESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKci() {
        Double oldKci = kci;
        boolean oldKciESet = kciESet;
        kci = KCI_EDEFAULT;
        kciESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEST6B__KCI, oldKci,
                    KCI_EDEFAULT, oldKciESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKci() {
        return kciESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKff() {
        return kff;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKff( Double newKff ) {
        Double oldKff = kff;
        kff = newKff;
        boolean oldKffESet = kffESet;
        kffESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEST6B__KFF, oldKff, kff,
                    !oldKffESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKff() {
        Double oldKff = kff;
        boolean oldKffESet = kffESet;
        kff = KFF_EDEFAULT;
        kffESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEST6B__KFF, oldKff,
                    KFF_EDEFAULT, oldKffESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKff() {
        return kffESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getIlr() {
        return ilr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIlr( Double newIlr ) {
        Double oldIlr = ilr;
        ilr = newIlr;
        boolean oldIlrESet = ilrESet;
        ilrESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEST6B__ILR, oldIlr, ilr,
                    !oldIlrESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIlr() {
        Double oldIlr = ilr;
        boolean oldIlrESet = ilrESet;
        ilr = ILR_EDEFAULT;
        ilrESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEST6B__ILR, oldIlr,
                    ILR_EDEFAULT, oldIlrESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIlr() {
        return ilrESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTg() {
        return tg;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTg( Double newTg ) {
        Double oldTg = tg;
        tg = newTg;
        boolean oldTgESet = tgESet;
        tgESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEST6B__TG, oldTg, tg,
                    !oldTgESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTg() {
        Double oldTg = tg;
        boolean oldTgESet = tgESet;
        tg = TG_EDEFAULT;
        tgESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEST6B__TG, oldTg, TG_EDEFAULT,
                    oldTgESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTg() {
        return tgESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKm() {
        return km;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKm( Double newKm ) {
        Double oldKm = km;
        km = newKm;
        boolean oldKmESet = kmESet;
        kmESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEST6B__KM, oldKm, km,
                    !oldKmESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKm() {
        Double oldKm = km;
        boolean oldKmESet = kmESet;
        km = KM_EDEFAULT;
        kmESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEST6B__KM, oldKm, KM_EDEFAULT,
                    oldKmESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKm() {
        return kmESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKg() {
        return kg;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKg( Double newKg ) {
        Double oldKg = kg;
        kg = newKg;
        boolean oldKgESet = kgESet;
        kgESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEST6B__KG, oldKg, kg,
                    !oldKgESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKg() {
        Double oldKg = kg;
        boolean oldKgESet = kgESet;
        kg = KG_EDEFAULT;
        kgESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEST6B__KG, oldKg, KG_EDEFAULT,
                    oldKgESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKg() {
        return kgESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVamax() {
        return vamax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVamax( Double newVamax ) {
        Double oldVamax = vamax;
        vamax = newVamax;
        boolean oldVamaxESet = vamaxESet;
        vamaxESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEST6B__VAMAX, oldVamax, vamax,
                    !oldVamaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVamax() {
        Double oldVamax = vamax;
        boolean oldVamaxESet = vamaxESet;
        vamax = VAMAX_EDEFAULT;
        vamaxESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEST6B__VAMAX, oldVamax,
                    VAMAX_EDEFAULT, oldVamaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVamax() {
        return vamaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVamin() {
        return vamin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVamin( Double newVamin ) {
        Double oldVamin = vamin;
        vamin = newVamin;
        boolean oldVaminESet = vaminESet;
        vaminESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEST6B__VAMIN, oldVamin, vamin,
                    !oldVaminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVamin() {
        Double oldVamin = vamin;
        boolean oldVaminESet = vaminESet;
        vamin = VAMIN_EDEFAULT;
        vaminESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEST6B__VAMIN, oldVamin,
                    VAMIN_EDEFAULT, oldVaminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVamin() {
        return vaminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.EXC_IEEEST6B__OELIN:
            return getOelin();
        case CimPackage.EXC_IEEEST6B__KPA:
            return getKpa();
        case CimPackage.EXC_IEEEST6B__KLR:
            return getKlr();
        case CimPackage.EXC_IEEEST6B__VRMAX:
            return getVrmax();
        case CimPackage.EXC_IEEEST6B__VRMIN:
            return getVrmin();
        case CimPackage.EXC_IEEEST6B__KIA:
            return getKia();
        case CimPackage.EXC_IEEEST6B__KCI:
            return getKci();
        case CimPackage.EXC_IEEEST6B__KFF:
            return getKff();
        case CimPackage.EXC_IEEEST6B__ILR:
            return getIlr();
        case CimPackage.EXC_IEEEST6B__TG:
            return getTg();
        case CimPackage.EXC_IEEEST6B__KM:
            return getKm();
        case CimPackage.EXC_IEEEST6B__KG:
            return getKg();
        case CimPackage.EXC_IEEEST6B__VAMAX:
            return getVamax();
        case CimPackage.EXC_IEEEST6B__VAMIN:
            return getVamin();
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
        case CimPackage.EXC_IEEEST6B__OELIN:
            setOelin( ( ExcST6BOELselectorKind ) newValue );
            return;
        case CimPackage.EXC_IEEEST6B__KPA:
            setKpa( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEST6B__KLR:
            setKlr( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEST6B__VRMAX:
            setVrmax( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEST6B__VRMIN:
            setVrmin( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEST6B__KIA:
            setKia( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEST6B__KCI:
            setKci( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEST6B__KFF:
            setKff( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEST6B__ILR:
            setIlr( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEST6B__TG:
            setTg( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEST6B__KM:
            setKm( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEST6B__KG:
            setKg( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEST6B__VAMAX:
            setVamax( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEST6B__VAMIN:
            setVamin( ( Double ) newValue );
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
        case CimPackage.EXC_IEEEST6B__OELIN:
            unsetOelin();
            return;
        case CimPackage.EXC_IEEEST6B__KPA:
            unsetKpa();
            return;
        case CimPackage.EXC_IEEEST6B__KLR:
            unsetKlr();
            return;
        case CimPackage.EXC_IEEEST6B__VRMAX:
            unsetVrmax();
            return;
        case CimPackage.EXC_IEEEST6B__VRMIN:
            unsetVrmin();
            return;
        case CimPackage.EXC_IEEEST6B__KIA:
            unsetKia();
            return;
        case CimPackage.EXC_IEEEST6B__KCI:
            unsetKci();
            return;
        case CimPackage.EXC_IEEEST6B__KFF:
            unsetKff();
            return;
        case CimPackage.EXC_IEEEST6B__ILR:
            unsetIlr();
            return;
        case CimPackage.EXC_IEEEST6B__TG:
            unsetTg();
            return;
        case CimPackage.EXC_IEEEST6B__KM:
            unsetKm();
            return;
        case CimPackage.EXC_IEEEST6B__KG:
            unsetKg();
            return;
        case CimPackage.EXC_IEEEST6B__VAMAX:
            unsetVamax();
            return;
        case CimPackage.EXC_IEEEST6B__VAMIN:
            unsetVamin();
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
        case CimPackage.EXC_IEEEST6B__OELIN:
            return isSetOelin();
        case CimPackage.EXC_IEEEST6B__KPA:
            return isSetKpa();
        case CimPackage.EXC_IEEEST6B__KLR:
            return isSetKlr();
        case CimPackage.EXC_IEEEST6B__VRMAX:
            return isSetVrmax();
        case CimPackage.EXC_IEEEST6B__VRMIN:
            return isSetVrmin();
        case CimPackage.EXC_IEEEST6B__KIA:
            return isSetKia();
        case CimPackage.EXC_IEEEST6B__KCI:
            return isSetKci();
        case CimPackage.EXC_IEEEST6B__KFF:
            return isSetKff();
        case CimPackage.EXC_IEEEST6B__ILR:
            return isSetIlr();
        case CimPackage.EXC_IEEEST6B__TG:
            return isSetTg();
        case CimPackage.EXC_IEEEST6B__KM:
            return isSetKm();
        case CimPackage.EXC_IEEEST6B__KG:
            return isSetKg();
        case CimPackage.EXC_IEEEST6B__VAMAX:
            return isSetVamax();
        case CimPackage.EXC_IEEEST6B__VAMIN:
            return isSetVamin();
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
        result.append( " (oelin: " );
        if( oelinESet )
            result.append( oelin );
        else
            result.append( "<unset>" );
        result.append( ", kpa: " );
        if( kpaESet )
            result.append( kpa );
        else
            result.append( "<unset>" );
        result.append( ", klr: " );
        if( klrESet )
            result.append( klr );
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
        result.append( ", kia: " );
        if( kiaESet )
            result.append( kia );
        else
            result.append( "<unset>" );
        result.append( ", kci: " );
        if( kciESet )
            result.append( kci );
        else
            result.append( "<unset>" );
        result.append( ", kff: " );
        if( kffESet )
            result.append( kff );
        else
            result.append( "<unset>" );
        result.append( ", ilr: " );
        if( ilrESet )
            result.append( ilr );
        else
            result.append( "<unset>" );
        result.append( ", tg: " );
        if( tgESet )
            result.append( tg );
        else
            result.append( "<unset>" );
        result.append( ", km: " );
        if( kmESet )
            result.append( km );
        else
            result.append( "<unset>" );
        result.append( ", kg: " );
        if( kgESet )
            result.append( kg );
        else
            result.append( "<unset>" );
        result.append( ", vamax: " );
        if( vamaxESet )
            result.append( vamax );
        else
            result.append( "<unset>" );
        result.append( ", vamin: " );
        if( vaminESet )
            result.append( vamin );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ExcIEEEST6BImpl

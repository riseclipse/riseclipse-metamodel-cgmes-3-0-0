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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST4B;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exc IEEEST4B</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEST4BImpl#getVmmax <em>Vmmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEST4BImpl#getVbmax <em>Vbmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEST4BImpl#getVmmin <em>Vmmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEST4BImpl#getThetap <em>Thetap</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEST4BImpl#getXl <em>Xl</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEST4BImpl#getTa <em>Ta</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEST4BImpl#getKp <em>Kp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEST4BImpl#getKc <em>Kc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEST4BImpl#getKi <em>Ki</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEST4BImpl#getKg <em>Kg</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEST4BImpl#getKpm <em>Kpm</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEST4BImpl#getKpr <em>Kpr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEST4BImpl#getVrmax <em>Vrmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEST4BImpl#getVrmin <em>Vrmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEST4BImpl#getKim <em>Kim</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcIEEEST4BImpl#getKir <em>Kir</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExcIEEEST4BImpl extends ExcitationSystemDynamicsImpl implements ExcIEEEST4B {
    /**
     * The default value of the '{@link #getVmmax() <em>Vmmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVmmax()
     * @generated
     * @ordered
     */
    protected static final Double VMMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVmmax() <em>Vmmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVmmax()
     * @generated
     * @ordered
     */
    protected Double vmmax = VMMAX_EDEFAULT;

    /**
     * This is true if the Vmmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vmmaxESet;

    /**
     * The default value of the '{@link #getVbmax() <em>Vbmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVbmax()
     * @generated
     * @ordered
     */
    protected static final Double VBMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVbmax() <em>Vbmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVbmax()
     * @generated
     * @ordered
     */
    protected Double vbmax = VBMAX_EDEFAULT;

    /**
     * This is true if the Vbmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vbmaxESet;

    /**
     * The default value of the '{@link #getVmmin() <em>Vmmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVmmin()
     * @generated
     * @ordered
     */
    protected static final Double VMMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVmmin() <em>Vmmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVmmin()
     * @generated
     * @ordered
     */
    protected Double vmmin = VMMIN_EDEFAULT;

    /**
     * This is true if the Vmmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vmminESet;

    /**
     * The default value of the '{@link #getThetap() <em>Thetap</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThetap()
     * @generated
     * @ordered
     */
    protected static final Double THETAP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getThetap() <em>Thetap</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThetap()
     * @generated
     * @ordered
     */
    protected Double thetap = THETAP_EDEFAULT;

    /**
     * This is true if the Thetap attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean thetapESet;

    /**
     * The default value of the '{@link #getXl() <em>Xl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXl()
     * @generated
     * @ordered
     */
    protected static final Double XL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getXl() <em>Xl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXl()
     * @generated
     * @ordered
     */
    protected Double xl = XL_EDEFAULT;

    /**
     * This is true if the Xl attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xlESet;

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
     * The default value of the '{@link #getKp() <em>Kp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKp()
     * @generated
     * @ordered
     */
    protected static final Double KP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKp() <em>Kp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKp()
     * @generated
     * @ordered
     */
    protected Double kp = KP_EDEFAULT;

    /**
     * This is true if the Kp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kpESet;

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
     * The default value of the '{@link #getKi() <em>Ki</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKi()
     * @generated
     * @ordered
     */
    protected static final Double KI_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKi() <em>Ki</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKi()
     * @generated
     * @ordered
     */
    protected Double ki = KI_EDEFAULT;

    /**
     * This is true if the Ki attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kiESet;

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
     * The default value of the '{@link #getKpm() <em>Kpm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKpm()
     * @generated
     * @ordered
     */
    protected static final Double KPM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKpm() <em>Kpm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKpm()
     * @generated
     * @ordered
     */
    protected Double kpm = KPM_EDEFAULT;

    /**
     * This is true if the Kpm attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kpmESet;

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
     * The default value of the '{@link #getKim() <em>Kim</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKim()
     * @generated
     * @ordered
     */
    protected static final Double KIM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKim() <em>Kim</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKim()
     * @generated
     * @ordered
     */
    protected Double kim = KIM_EDEFAULT;

    /**
     * This is true if the Kim attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kimESet;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExcIEEEST4BImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getExcIEEEST4B();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVmmax() {
        return vmmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVmmax( Double newVmmax ) {
        Double oldVmmax = vmmax;
        vmmax = newVmmax;
        boolean oldVmmaxESet = vmmaxESet;
        vmmaxESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEST4B__VMMAX, oldVmmax, vmmax,
                    !oldVmmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVmmax() {
        Double oldVmmax = vmmax;
        boolean oldVmmaxESet = vmmaxESet;
        vmmax = VMMAX_EDEFAULT;
        vmmaxESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEST4B__VMMAX, oldVmmax,
                    VMMAX_EDEFAULT, oldVmmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVmmax() {
        return vmmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVbmax() {
        return vbmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVbmax( Double newVbmax ) {
        Double oldVbmax = vbmax;
        vbmax = newVbmax;
        boolean oldVbmaxESet = vbmaxESet;
        vbmaxESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEST4B__VBMAX, oldVbmax, vbmax,
                    !oldVbmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVbmax() {
        Double oldVbmax = vbmax;
        boolean oldVbmaxESet = vbmaxESet;
        vbmax = VBMAX_EDEFAULT;
        vbmaxESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEST4B__VBMAX, oldVbmax,
                    VBMAX_EDEFAULT, oldVbmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVbmax() {
        return vbmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVmmin() {
        return vmmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVmmin( Double newVmmin ) {
        Double oldVmmin = vmmin;
        vmmin = newVmmin;
        boolean oldVmminESet = vmminESet;
        vmminESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEST4B__VMMIN, oldVmmin, vmmin,
                    !oldVmminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVmmin() {
        Double oldVmmin = vmmin;
        boolean oldVmminESet = vmminESet;
        vmmin = VMMIN_EDEFAULT;
        vmminESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEST4B__VMMIN, oldVmmin,
                    VMMIN_EDEFAULT, oldVmminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVmmin() {
        return vmminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getThetap() {
        return thetap;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setThetap( Double newThetap ) {
        Double oldThetap = thetap;
        thetap = newThetap;
        boolean oldThetapESet = thetapESet;
        thetapESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEST4B__THETAP, oldThetap, thetap,
                    !oldThetapESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetThetap() {
        Double oldThetap = thetap;
        boolean oldThetapESet = thetapESet;
        thetap = THETAP_EDEFAULT;
        thetapESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEST4B__THETAP, oldThetap,
                    THETAP_EDEFAULT, oldThetapESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetThetap() {
        return thetapESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getXl() {
        return xl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setXl( Double newXl ) {
        Double oldXl = xl;
        xl = newXl;
        boolean oldXlESet = xlESet;
        xlESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEST4B__XL, oldXl, xl,
                    !oldXlESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetXl() {
        Double oldXl = xl;
        boolean oldXlESet = xlESet;
        xl = XL_EDEFAULT;
        xlESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEST4B__XL, oldXl, XL_EDEFAULT,
                    oldXlESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetXl() {
        return xlESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEST4B__TA, oldTa, ta,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEST4B__TA, oldTa, TA_EDEFAULT,
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
    public Double getKp() {
        return kp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKp( Double newKp ) {
        Double oldKp = kp;
        kp = newKp;
        boolean oldKpESet = kpESet;
        kpESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEST4B__KP, oldKp, kp,
                    !oldKpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKp() {
        Double oldKp = kp;
        boolean oldKpESet = kpESet;
        kp = KP_EDEFAULT;
        kpESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEST4B__KP, oldKp, KP_EDEFAULT,
                    oldKpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKp() {
        return kpESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEST4B__KC, oldKc, kc,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEST4B__KC, oldKc, KC_EDEFAULT,
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
    public Double getKi() {
        return ki;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKi( Double newKi ) {
        Double oldKi = ki;
        ki = newKi;
        boolean oldKiESet = kiESet;
        kiESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEST4B__KI, oldKi, ki,
                    !oldKiESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKi() {
        Double oldKi = ki;
        boolean oldKiESet = kiESet;
        ki = KI_EDEFAULT;
        kiESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEST4B__KI, oldKi, KI_EDEFAULT,
                    oldKiESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKi() {
        return kiESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEST4B__KG, oldKg, kg,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEST4B__KG, oldKg, KG_EDEFAULT,
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
    public Double getKpm() {
        return kpm;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKpm( Double newKpm ) {
        Double oldKpm = kpm;
        kpm = newKpm;
        boolean oldKpmESet = kpmESet;
        kpmESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEST4B__KPM, oldKpm, kpm,
                    !oldKpmESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKpm() {
        Double oldKpm = kpm;
        boolean oldKpmESet = kpmESet;
        kpm = KPM_EDEFAULT;
        kpmESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEST4B__KPM, oldKpm,
                    KPM_EDEFAULT, oldKpmESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKpm() {
        return kpmESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEST4B__KPR, oldKpr, kpr,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEST4B__KPR, oldKpr,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEST4B__VRMAX, oldVrmax, vrmax,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEST4B__VRMAX, oldVrmax,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEST4B__VRMIN, oldVrmin, vrmin,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEST4B__VRMIN, oldVrmin,
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
    public Double getKim() {
        return kim;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKim( Double newKim ) {
        Double oldKim = kim;
        kim = newKim;
        boolean oldKimESet = kimESet;
        kimESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEST4B__KIM, oldKim, kim,
                    !oldKimESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKim() {
        Double oldKim = kim;
        boolean oldKimESet = kimESet;
        kim = KIM_EDEFAULT;
        kimESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEST4B__KIM, oldKim,
                    KIM_EDEFAULT, oldKimESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKim() {
        return kimESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_IEEEST4B__KIR, oldKir, kir,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_IEEEST4B__KIR, oldKir,
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
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.EXC_IEEEST4B__VMMAX:
            return getVmmax();
        case CimPackage.EXC_IEEEST4B__VBMAX:
            return getVbmax();
        case CimPackage.EXC_IEEEST4B__VMMIN:
            return getVmmin();
        case CimPackage.EXC_IEEEST4B__THETAP:
            return getThetap();
        case CimPackage.EXC_IEEEST4B__XL:
            return getXl();
        case CimPackage.EXC_IEEEST4B__TA:
            return getTa();
        case CimPackage.EXC_IEEEST4B__KP:
            return getKp();
        case CimPackage.EXC_IEEEST4B__KC:
            return getKc();
        case CimPackage.EXC_IEEEST4B__KI:
            return getKi();
        case CimPackage.EXC_IEEEST4B__KG:
            return getKg();
        case CimPackage.EXC_IEEEST4B__KPM:
            return getKpm();
        case CimPackage.EXC_IEEEST4B__KPR:
            return getKpr();
        case CimPackage.EXC_IEEEST4B__VRMAX:
            return getVrmax();
        case CimPackage.EXC_IEEEST4B__VRMIN:
            return getVrmin();
        case CimPackage.EXC_IEEEST4B__KIM:
            return getKim();
        case CimPackage.EXC_IEEEST4B__KIR:
            return getKir();
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
        case CimPackage.EXC_IEEEST4B__VMMAX:
            setVmmax( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEST4B__VBMAX:
            setVbmax( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEST4B__VMMIN:
            setVmmin( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEST4B__THETAP:
            setThetap( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEST4B__XL:
            setXl( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEST4B__TA:
            setTa( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEST4B__KP:
            setKp( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEST4B__KC:
            setKc( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEST4B__KI:
            setKi( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEST4B__KG:
            setKg( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEST4B__KPM:
            setKpm( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEST4B__KPR:
            setKpr( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEST4B__VRMAX:
            setVrmax( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEST4B__VRMIN:
            setVrmin( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEST4B__KIM:
            setKim( ( Double ) newValue );
            return;
        case CimPackage.EXC_IEEEST4B__KIR:
            setKir( ( Double ) newValue );
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
        case CimPackage.EXC_IEEEST4B__VMMAX:
            unsetVmmax();
            return;
        case CimPackage.EXC_IEEEST4B__VBMAX:
            unsetVbmax();
            return;
        case CimPackage.EXC_IEEEST4B__VMMIN:
            unsetVmmin();
            return;
        case CimPackage.EXC_IEEEST4B__THETAP:
            unsetThetap();
            return;
        case CimPackage.EXC_IEEEST4B__XL:
            unsetXl();
            return;
        case CimPackage.EXC_IEEEST4B__TA:
            unsetTa();
            return;
        case CimPackage.EXC_IEEEST4B__KP:
            unsetKp();
            return;
        case CimPackage.EXC_IEEEST4B__KC:
            unsetKc();
            return;
        case CimPackage.EXC_IEEEST4B__KI:
            unsetKi();
            return;
        case CimPackage.EXC_IEEEST4B__KG:
            unsetKg();
            return;
        case CimPackage.EXC_IEEEST4B__KPM:
            unsetKpm();
            return;
        case CimPackage.EXC_IEEEST4B__KPR:
            unsetKpr();
            return;
        case CimPackage.EXC_IEEEST4B__VRMAX:
            unsetVrmax();
            return;
        case CimPackage.EXC_IEEEST4B__VRMIN:
            unsetVrmin();
            return;
        case CimPackage.EXC_IEEEST4B__KIM:
            unsetKim();
            return;
        case CimPackage.EXC_IEEEST4B__KIR:
            unsetKir();
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
        case CimPackage.EXC_IEEEST4B__VMMAX:
            return isSetVmmax();
        case CimPackage.EXC_IEEEST4B__VBMAX:
            return isSetVbmax();
        case CimPackage.EXC_IEEEST4B__VMMIN:
            return isSetVmmin();
        case CimPackage.EXC_IEEEST4B__THETAP:
            return isSetThetap();
        case CimPackage.EXC_IEEEST4B__XL:
            return isSetXl();
        case CimPackage.EXC_IEEEST4B__TA:
            return isSetTa();
        case CimPackage.EXC_IEEEST4B__KP:
            return isSetKp();
        case CimPackage.EXC_IEEEST4B__KC:
            return isSetKc();
        case CimPackage.EXC_IEEEST4B__KI:
            return isSetKi();
        case CimPackage.EXC_IEEEST4B__KG:
            return isSetKg();
        case CimPackage.EXC_IEEEST4B__KPM:
            return isSetKpm();
        case CimPackage.EXC_IEEEST4B__KPR:
            return isSetKpr();
        case CimPackage.EXC_IEEEST4B__VRMAX:
            return isSetVrmax();
        case CimPackage.EXC_IEEEST4B__VRMIN:
            return isSetVrmin();
        case CimPackage.EXC_IEEEST4B__KIM:
            return isSetKim();
        case CimPackage.EXC_IEEEST4B__KIR:
            return isSetKir();
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
        result.append( " (vmmax: " );
        if( vmmaxESet )
            result.append( vmmax );
        else
            result.append( "<unset>" );
        result.append( ", vbmax: " );
        if( vbmaxESet )
            result.append( vbmax );
        else
            result.append( "<unset>" );
        result.append( ", vmmin: " );
        if( vmminESet )
            result.append( vmmin );
        else
            result.append( "<unset>" );
        result.append( ", thetap: " );
        if( thetapESet )
            result.append( thetap );
        else
            result.append( "<unset>" );
        result.append( ", xl: " );
        if( xlESet )
            result.append( xl );
        else
            result.append( "<unset>" );
        result.append( ", ta: " );
        if( taESet )
            result.append( ta );
        else
            result.append( "<unset>" );
        result.append( ", kp: " );
        if( kpESet )
            result.append( kp );
        else
            result.append( "<unset>" );
        result.append( ", kc: " );
        if( kcESet )
            result.append( kc );
        else
            result.append( "<unset>" );
        result.append( ", ki: " );
        if( kiESet )
            result.append( ki );
        else
            result.append( "<unset>" );
        result.append( ", kg: " );
        if( kgESet )
            result.append( kg );
        else
            result.append( "<unset>" );
        result.append( ", kpm: " );
        if( kpmESet )
            result.append( kpm );
        else
            result.append( "<unset>" );
        result.append( ", kpr: " );
        if( kprESet )
            result.append( kpr );
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
        result.append( ", kim: " );
        if( kimESet )
            result.append( kim );
        else
            result.append( "<unset>" );
        result.append( ", kir: " );
        if( kirESet )
            result.append( kir );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ExcIEEEST4BImpl

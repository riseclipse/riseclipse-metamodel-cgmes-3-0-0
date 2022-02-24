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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType1IEEEPFController;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PFV Ar Type1 IEEEPF Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PFVArType1IEEEPFControllerImpl#getVpf <em>Vpf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PFVArType1IEEEPFControllerImpl#getVitmin <em>Vitmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PFVArType1IEEEPFControllerImpl#getVpfcbw <em>Vpfcbw</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PFVArType1IEEEPFControllerImpl#getOvex <em>Ovex</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PFVArType1IEEEPFControllerImpl#getVpfref <em>Vpfref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PFVArType1IEEEPFControllerImpl#getVvtmax <em>Vvtmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PFVArType1IEEEPFControllerImpl#getVvtmin <em>Vvtmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PFVArType1IEEEPFControllerImpl#getTpfc <em>Tpfc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PFVArType1IEEEPFControllerImpl extends PFVArControllerType1DynamicsImpl
        implements PFVArType1IEEEPFController {
    /**
     * The default value of the '{@link #getVpf() <em>Vpf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVpf()
     * @generated
     * @ordered
     */
    protected static final Double VPF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVpf() <em>Vpf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVpf()
     * @generated
     * @ordered
     */
    protected Double vpf = VPF_EDEFAULT;

    /**
     * This is true if the Vpf attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vpfESet;

    /**
     * The default value of the '{@link #getVitmin() <em>Vitmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVitmin()
     * @generated
     * @ordered
     */
    protected static final Double VITMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVitmin() <em>Vitmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVitmin()
     * @generated
     * @ordered
     */
    protected Double vitmin = VITMIN_EDEFAULT;

    /**
     * This is true if the Vitmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vitminESet;

    /**
     * The default value of the '{@link #getVpfcbw() <em>Vpfcbw</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVpfcbw()
     * @generated
     * @ordered
     */
    protected static final Double VPFCBW_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVpfcbw() <em>Vpfcbw</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVpfcbw()
     * @generated
     * @ordered
     */
    protected Double vpfcbw = VPFCBW_EDEFAULT;

    /**
     * This is true if the Vpfcbw attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vpfcbwESet;

    /**
     * The default value of the '{@link #getOvex() <em>Ovex</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOvex()
     * @generated
     * @ordered
     */
    protected static final Boolean OVEX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getOvex() <em>Ovex</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOvex()
     * @generated
     * @ordered
     */
    protected Boolean ovex = OVEX_EDEFAULT;

    /**
     * This is true if the Ovex attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ovexESet;

    /**
     * The default value of the '{@link #getVpfref() <em>Vpfref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVpfref()
     * @generated
     * @ordered
     */
    protected static final Double VPFREF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVpfref() <em>Vpfref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVpfref()
     * @generated
     * @ordered
     */
    protected Double vpfref = VPFREF_EDEFAULT;

    /**
     * This is true if the Vpfref attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vpfrefESet;

    /**
     * The default value of the '{@link #getVvtmax() <em>Vvtmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVvtmax()
     * @generated
     * @ordered
     */
    protected static final Double VVTMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVvtmax() <em>Vvtmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVvtmax()
     * @generated
     * @ordered
     */
    protected Double vvtmax = VVTMAX_EDEFAULT;

    /**
     * This is true if the Vvtmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vvtmaxESet;

    /**
     * The default value of the '{@link #getVvtmin() <em>Vvtmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVvtmin()
     * @generated
     * @ordered
     */
    protected static final Double VVTMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVvtmin() <em>Vvtmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVvtmin()
     * @generated
     * @ordered
     */
    protected Double vvtmin = VVTMIN_EDEFAULT;

    /**
     * This is true if the Vvtmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vvtminESet;

    /**
     * The default value of the '{@link #getTpfc() <em>Tpfc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTpfc()
     * @generated
     * @ordered
     */
    protected static final Double TPFC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTpfc() <em>Tpfc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTpfc()
     * @generated
     * @ordered
     */
    protected Double tpfc = TPFC_EDEFAULT;

    /**
     * This is true if the Tpfc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tpfcESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PFVArType1IEEEPFControllerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getPFVArType1IEEEPFController();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVpf() {
        return vpf;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVpf( Double newVpf ) {
        Double oldVpf = vpf;
        vpf = newVpf;
        boolean oldVpfESet = vpfESet;
        vpfESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VPF,
                    oldVpf, vpf, !oldVpfESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVpf() {
        Double oldVpf = vpf;
        boolean oldVpfESet = vpfESet;
        vpf = VPF_EDEFAULT;
        vpfESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VPF,
                    oldVpf, VPF_EDEFAULT, oldVpfESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVpf() {
        return vpfESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVitmin() {
        return vitmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVitmin( Double newVitmin ) {
        Double oldVitmin = vitmin;
        vitmin = newVitmin;
        boolean oldVitminESet = vitminESet;
        vitminESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VITMIN,
                    oldVitmin, vitmin, !oldVitminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVitmin() {
        Double oldVitmin = vitmin;
        boolean oldVitminESet = vitminESet;
        vitmin = VITMIN_EDEFAULT;
        vitminESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VITMIN,
                    oldVitmin, VITMIN_EDEFAULT, oldVitminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVitmin() {
        return vitminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVpfcbw() {
        return vpfcbw;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVpfcbw( Double newVpfcbw ) {
        Double oldVpfcbw = vpfcbw;
        vpfcbw = newVpfcbw;
        boolean oldVpfcbwESet = vpfcbwESet;
        vpfcbwESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VPFCBW,
                    oldVpfcbw, vpfcbw, !oldVpfcbwESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVpfcbw() {
        Double oldVpfcbw = vpfcbw;
        boolean oldVpfcbwESet = vpfcbwESet;
        vpfcbw = VPFCBW_EDEFAULT;
        vpfcbwESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VPFCBW,
                    oldVpfcbw, VPFCBW_EDEFAULT, oldVpfcbwESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVpfcbw() {
        return vpfcbwESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getOvex() {
        return ovex;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOvex( Boolean newOvex ) {
        Boolean oldOvex = ovex;
        ovex = newOvex;
        boolean oldOvexESet = ovexESet;
        ovexESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__OVEX,
                    oldOvex, ovex, !oldOvexESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOvex() {
        Boolean oldOvex = ovex;
        boolean oldOvexESet = ovexESet;
        ovex = OVEX_EDEFAULT;
        ovexESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__OVEX,
                    oldOvex, OVEX_EDEFAULT, oldOvexESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOvex() {
        return ovexESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVpfref() {
        return vpfref;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVpfref( Double newVpfref ) {
        Double oldVpfref = vpfref;
        vpfref = newVpfref;
        boolean oldVpfrefESet = vpfrefESet;
        vpfrefESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VPFREF,
                    oldVpfref, vpfref, !oldVpfrefESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVpfref() {
        Double oldVpfref = vpfref;
        boolean oldVpfrefESet = vpfrefESet;
        vpfref = VPFREF_EDEFAULT;
        vpfrefESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VPFREF,
                    oldVpfref, VPFREF_EDEFAULT, oldVpfrefESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVpfref() {
        return vpfrefESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVvtmax() {
        return vvtmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVvtmax( Double newVvtmax ) {
        Double oldVvtmax = vvtmax;
        vvtmax = newVvtmax;
        boolean oldVvtmaxESet = vvtmaxESet;
        vvtmaxESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VVTMAX,
                    oldVvtmax, vvtmax, !oldVvtmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVvtmax() {
        Double oldVvtmax = vvtmax;
        boolean oldVvtmaxESet = vvtmaxESet;
        vvtmax = VVTMAX_EDEFAULT;
        vvtmaxESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VVTMAX,
                    oldVvtmax, VVTMAX_EDEFAULT, oldVvtmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVvtmax() {
        return vvtmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVvtmin() {
        return vvtmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVvtmin( Double newVvtmin ) {
        Double oldVvtmin = vvtmin;
        vvtmin = newVvtmin;
        boolean oldVvtminESet = vvtminESet;
        vvtminESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VVTMIN,
                    oldVvtmin, vvtmin, !oldVvtminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVvtmin() {
        Double oldVvtmin = vvtmin;
        boolean oldVvtminESet = vvtminESet;
        vvtmin = VVTMIN_EDEFAULT;
        vvtminESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VVTMIN,
                    oldVvtmin, VVTMIN_EDEFAULT, oldVvtminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVvtmin() {
        return vvtminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTpfc() {
        return tpfc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTpfc( Double newTpfc ) {
        Double oldTpfc = tpfc;
        tpfc = newTpfc;
        boolean oldTpfcESet = tpfcESet;
        tpfcESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__TPFC,
                    oldTpfc, tpfc, !oldTpfcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTpfc() {
        Double oldTpfc = tpfc;
        boolean oldTpfcESet = tpfcESet;
        tpfc = TPFC_EDEFAULT;
        tpfcESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__TPFC,
                    oldTpfc, TPFC_EDEFAULT, oldTpfcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTpfc() {
        return tpfcESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VPF:
            return getVpf();
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VITMIN:
            return getVitmin();
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VPFCBW:
            return getVpfcbw();
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__OVEX:
            return getOvex();
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VPFREF:
            return getVpfref();
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VVTMAX:
            return getVvtmax();
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VVTMIN:
            return getVvtmin();
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__TPFC:
            return getTpfc();
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
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VPF:
            setVpf( ( Double ) newValue );
            return;
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VITMIN:
            setVitmin( ( Double ) newValue );
            return;
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VPFCBW:
            setVpfcbw( ( Double ) newValue );
            return;
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__OVEX:
            setOvex( ( Boolean ) newValue );
            return;
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VPFREF:
            setVpfref( ( Double ) newValue );
            return;
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VVTMAX:
            setVvtmax( ( Double ) newValue );
            return;
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VVTMIN:
            setVvtmin( ( Double ) newValue );
            return;
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__TPFC:
            setTpfc( ( Double ) newValue );
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
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VPF:
            unsetVpf();
            return;
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VITMIN:
            unsetVitmin();
            return;
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VPFCBW:
            unsetVpfcbw();
            return;
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__OVEX:
            unsetOvex();
            return;
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VPFREF:
            unsetVpfref();
            return;
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VVTMAX:
            unsetVvtmax();
            return;
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VVTMIN:
            unsetVvtmin();
            return;
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__TPFC:
            unsetTpfc();
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
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VPF:
            return isSetVpf();
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VITMIN:
            return isSetVitmin();
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VPFCBW:
            return isSetVpfcbw();
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__OVEX:
            return isSetOvex();
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VPFREF:
            return isSetVpfref();
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VVTMAX:
            return isSetVvtmax();
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__VVTMIN:
            return isSetVvtmin();
        case CimPackage.PFV_AR_TYPE1_IEEEPF_CONTROLLER__TPFC:
            return isSetTpfc();
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
        result.append( " (vpf: " );
        if( vpfESet )
            result.append( vpf );
        else
            result.append( "<unset>" );
        result.append( ", vitmin: " );
        if( vitminESet )
            result.append( vitmin );
        else
            result.append( "<unset>" );
        result.append( ", vpfcbw: " );
        if( vpfcbwESet )
            result.append( vpfcbw );
        else
            result.append( "<unset>" );
        result.append( ", ovex: " );
        if( ovexESet )
            result.append( ovex );
        else
            result.append( "<unset>" );
        result.append( ", vpfref: " );
        if( vpfrefESet )
            result.append( vpfref );
        else
            result.append( "<unset>" );
        result.append( ", vvtmax: " );
        if( vvtmaxESet )
            result.append( vvtmax );
        else
            result.append( "<unset>" );
        result.append( ", vvtmin: " );
        if( vvtminESet )
            result.append( vvtmin );
        else
            result.append( "<unset>" );
        result.append( ", tpfc: " );
        if( tpfcESet )
            result.append( tpfc );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //PFVArType1IEEEPFControllerImpl

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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType2IEEEVArController;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PFV Ar Type2 IEEEV Ar Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PFVArType2IEEEVArControllerImpl#getVclmt <em>Vclmt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PFVArType2IEEEVArControllerImpl#getExlon <em>Exlon</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PFVArType2IEEEVArControllerImpl#getKi <em>Ki</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PFVArType2IEEEVArControllerImpl#getKp <em>Kp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PFVArType2IEEEVArControllerImpl#getVs <em>Vs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PFVArType2IEEEVArControllerImpl#getVref <em>Vref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PFVArType2IEEEVArControllerImpl#getQref <em>Qref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PFVArType2IEEEVArControllerImpl extends PFVArControllerType2DynamicsImpl
        implements PFVArType2IEEEVArController {
    /**
     * The default value of the '{@link #getVclmt() <em>Vclmt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVclmt()
     * @generated
     * @ordered
     */
    protected static final Double VCLMT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVclmt() <em>Vclmt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVclmt()
     * @generated
     * @ordered
     */
    protected Double vclmt = VCLMT_EDEFAULT;

    /**
     * This is true if the Vclmt attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vclmtESet;

    /**
     * The default value of the '{@link #getExlon() <em>Exlon</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExlon()
     * @generated
     * @ordered
     */
    protected static final Boolean EXLON_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getExlon() <em>Exlon</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExlon()
     * @generated
     * @ordered
     */
    protected Boolean exlon = EXLON_EDEFAULT;

    /**
     * This is true if the Exlon attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean exlonESet;

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
     * The default value of the '{@link #getVs() <em>Vs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVs()
     * @generated
     * @ordered
     */
    protected static final Double VS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVs() <em>Vs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVs()
     * @generated
     * @ordered
     */
    protected Double vs = VS_EDEFAULT;

    /**
     * This is true if the Vs attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vsESet;

    /**
     * The default value of the '{@link #getVref() <em>Vref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVref()
     * @generated
     * @ordered
     */
    protected static final Double VREF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVref() <em>Vref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVref()
     * @generated
     * @ordered
     */
    protected Double vref = VREF_EDEFAULT;

    /**
     * This is true if the Vref attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vrefESet;

    /**
     * The default value of the '{@link #getQref() <em>Qref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQref()
     * @generated
     * @ordered
     */
    protected static final Double QREF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getQref() <em>Qref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQref()
     * @generated
     * @ordered
     */
    protected Double qref = QREF_EDEFAULT;

    /**
     * This is true if the Qref attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean qrefESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PFVArType2IEEEVArControllerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getPFVArType2IEEEVArController();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVclmt() {
        return vclmt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVclmt( Double newVclmt ) {
        Double oldVclmt = vclmt;
        vclmt = newVclmt;
        boolean oldVclmtESet = vclmtESet;
        vclmtESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PFV_AR_TYPE2_IEEEV_AR_CONTROLLER__VCLMT,
                    oldVclmt, vclmt, !oldVclmtESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVclmt() {
        Double oldVclmt = vclmt;
        boolean oldVclmtESet = vclmtESet;
        vclmt = VCLMT_EDEFAULT;
        vclmtESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PFV_AR_TYPE2_IEEEV_AR_CONTROLLER__VCLMT, oldVclmt, VCLMT_EDEFAULT, oldVclmtESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVclmt() {
        return vclmtESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getExlon() {
        return exlon;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setExlon( Boolean newExlon ) {
        Boolean oldExlon = exlon;
        exlon = newExlon;
        boolean oldExlonESet = exlonESet;
        exlonESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PFV_AR_TYPE2_IEEEV_AR_CONTROLLER__EXLON,
                    oldExlon, exlon, !oldExlonESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetExlon() {
        Boolean oldExlon = exlon;
        boolean oldExlonESet = exlonESet;
        exlon = EXLON_EDEFAULT;
        exlonESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PFV_AR_TYPE2_IEEEV_AR_CONTROLLER__EXLON, oldExlon, EXLON_EDEFAULT, oldExlonESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetExlon() {
        return exlonESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PFV_AR_TYPE2_IEEEV_AR_CONTROLLER__KI,
                    oldKi, ki, !oldKiESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PFV_AR_TYPE2_IEEEV_AR_CONTROLLER__KI,
                    oldKi, KI_EDEFAULT, oldKiESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PFV_AR_TYPE2_IEEEV_AR_CONTROLLER__KP,
                    oldKp, kp, !oldKpESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PFV_AR_TYPE2_IEEEV_AR_CONTROLLER__KP,
                    oldKp, KP_EDEFAULT, oldKpESet ) );
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
    public Double getVs() {
        return vs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVs( Double newVs ) {
        Double oldVs = vs;
        vs = newVs;
        boolean oldVsESet = vsESet;
        vsESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PFV_AR_TYPE2_IEEEV_AR_CONTROLLER__VS,
                    oldVs, vs, !oldVsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVs() {
        Double oldVs = vs;
        boolean oldVsESet = vsESet;
        vs = VS_EDEFAULT;
        vsESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PFV_AR_TYPE2_IEEEV_AR_CONTROLLER__VS,
                    oldVs, VS_EDEFAULT, oldVsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVs() {
        return vsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVref() {
        return vref;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVref( Double newVref ) {
        Double oldVref = vref;
        vref = newVref;
        boolean oldVrefESet = vrefESet;
        vrefESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PFV_AR_TYPE2_IEEEV_AR_CONTROLLER__VREF,
                    oldVref, vref, !oldVrefESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVref() {
        Double oldVref = vref;
        boolean oldVrefESet = vrefESet;
        vref = VREF_EDEFAULT;
        vrefESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PFV_AR_TYPE2_IEEEV_AR_CONTROLLER__VREF,
                    oldVref, VREF_EDEFAULT, oldVrefESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVref() {
        return vrefESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getQref() {
        return qref;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setQref( Double newQref ) {
        Double oldQref = qref;
        qref = newQref;
        boolean oldQrefESet = qrefESet;
        qrefESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PFV_AR_TYPE2_IEEEV_AR_CONTROLLER__QREF,
                    oldQref, qref, !oldQrefESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetQref() {
        Double oldQref = qref;
        boolean oldQrefESet = qrefESet;
        qref = QREF_EDEFAULT;
        qrefESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PFV_AR_TYPE2_IEEEV_AR_CONTROLLER__QREF,
                    oldQref, QREF_EDEFAULT, oldQrefESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetQref() {
        return qrefESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.PFV_AR_TYPE2_IEEEV_AR_CONTROLLER__VCLMT:
            return getVclmt();
        case CimPackage.PFV_AR_TYPE2_IEEEV_AR_CONTROLLER__EXLON:
            return getExlon();
        case CimPackage.PFV_AR_TYPE2_IEEEV_AR_CONTROLLER__KI:
            return getKi();
        case CimPackage.PFV_AR_TYPE2_IEEEV_AR_CONTROLLER__KP:
            return getKp();
        case CimPackage.PFV_AR_TYPE2_IEEEV_AR_CONTROLLER__VS:
            return getVs();
        case CimPackage.PFV_AR_TYPE2_IEEEV_AR_CONTROLLER__VREF:
            return getVref();
        case CimPackage.PFV_AR_TYPE2_IEEEV_AR_CONTROLLER__QREF:
            return getQref();
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
        case CimPackage.PFV_AR_TYPE2_IEEEV_AR_CONTROLLER__VCLMT:
            setVclmt( ( Double ) newValue );
            return;
        case CimPackage.PFV_AR_TYPE2_IEEEV_AR_CONTROLLER__EXLON:
            setExlon( ( Boolean ) newValue );
            return;
        case CimPackage.PFV_AR_TYPE2_IEEEV_AR_CONTROLLER__KI:
            setKi( ( Double ) newValue );
            return;
        case CimPackage.PFV_AR_TYPE2_IEEEV_AR_CONTROLLER__KP:
            setKp( ( Double ) newValue );
            return;
        case CimPackage.PFV_AR_TYPE2_IEEEV_AR_CONTROLLER__VS:
            setVs( ( Double ) newValue );
            return;
        case CimPackage.PFV_AR_TYPE2_IEEEV_AR_CONTROLLER__VREF:
            setVref( ( Double ) newValue );
            return;
        case CimPackage.PFV_AR_TYPE2_IEEEV_AR_CONTROLLER__QREF:
            setQref( ( Double ) newValue );
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
        case CimPackage.PFV_AR_TYPE2_IEEEV_AR_CONTROLLER__VCLMT:
            unsetVclmt();
            return;
        case CimPackage.PFV_AR_TYPE2_IEEEV_AR_CONTROLLER__EXLON:
            unsetExlon();
            return;
        case CimPackage.PFV_AR_TYPE2_IEEEV_AR_CONTROLLER__KI:
            unsetKi();
            return;
        case CimPackage.PFV_AR_TYPE2_IEEEV_AR_CONTROLLER__KP:
            unsetKp();
            return;
        case CimPackage.PFV_AR_TYPE2_IEEEV_AR_CONTROLLER__VS:
            unsetVs();
            return;
        case CimPackage.PFV_AR_TYPE2_IEEEV_AR_CONTROLLER__VREF:
            unsetVref();
            return;
        case CimPackage.PFV_AR_TYPE2_IEEEV_AR_CONTROLLER__QREF:
            unsetQref();
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
        case CimPackage.PFV_AR_TYPE2_IEEEV_AR_CONTROLLER__VCLMT:
            return isSetVclmt();
        case CimPackage.PFV_AR_TYPE2_IEEEV_AR_CONTROLLER__EXLON:
            return isSetExlon();
        case CimPackage.PFV_AR_TYPE2_IEEEV_AR_CONTROLLER__KI:
            return isSetKi();
        case CimPackage.PFV_AR_TYPE2_IEEEV_AR_CONTROLLER__KP:
            return isSetKp();
        case CimPackage.PFV_AR_TYPE2_IEEEV_AR_CONTROLLER__VS:
            return isSetVs();
        case CimPackage.PFV_AR_TYPE2_IEEEV_AR_CONTROLLER__VREF:
            return isSetVref();
        case CimPackage.PFV_AR_TYPE2_IEEEV_AR_CONTROLLER__QREF:
            return isSetQref();
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
        result.append( " (vclmt: " );
        if( vclmtESet )
            result.append( vclmt );
        else
            result.append( "<unset>" );
        result.append( ", exlon: " );
        if( exlonESet )
            result.append( exlon );
        else
            result.append( "<unset>" );
        result.append( ", ki: " );
        if( kiESet )
            result.append( ki );
        else
            result.append( "<unset>" );
        result.append( ", kp: " );
        if( kpESet )
            result.append( kp );
        else
            result.append( "<unset>" );
        result.append( ", vs: " );
        if( vsESet )
            result.append( vs );
        else
            result.append( "<unset>" );
        result.append( ", vref: " );
        if( vrefESet )
            result.append( vref );
        else
            result.append( "<unset>" );
        result.append( ", qref: " );
        if( qrefESet )
            result.append( qref );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //PFVArType2IEEEVArControllerImpl

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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLim2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Overexc Lim2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.OverexcLim2Impl#getKoi <em>Koi</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.OverexcLim2Impl#getIfdlim <em>Ifdlim</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.OverexcLim2Impl#getVoimax <em>Voimax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.OverexcLim2Impl#getVoimin <em>Voimin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OverexcLim2Impl extends OverexcitationLimiterDynamicsImpl implements OverexcLim2 {
    /**
     * The default value of the '{@link #getKoi() <em>Koi</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKoi()
     * @generated
     * @ordered
     */
    protected static final Double KOI_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKoi() <em>Koi</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKoi()
     * @generated
     * @ordered
     */
    protected Double koi = KOI_EDEFAULT;

    /**
     * This is true if the Koi attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean koiESet;

    /**
     * The default value of the '{@link #getIfdlim() <em>Ifdlim</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIfdlim()
     * @generated
     * @ordered
     */
    protected static final Double IFDLIM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIfdlim() <em>Ifdlim</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIfdlim()
     * @generated
     * @ordered
     */
    protected Double ifdlim = IFDLIM_EDEFAULT;

    /**
     * This is true if the Ifdlim attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ifdlimESet;

    /**
     * The default value of the '{@link #getVoimax() <em>Voimax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVoimax()
     * @generated
     * @ordered
     */
    protected static final Double VOIMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVoimax() <em>Voimax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVoimax()
     * @generated
     * @ordered
     */
    protected Double voimax = VOIMAX_EDEFAULT;

    /**
     * This is true if the Voimax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean voimaxESet;

    /**
     * The default value of the '{@link #getVoimin() <em>Voimin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVoimin()
     * @generated
     * @ordered
     */
    protected static final Double VOIMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVoimin() <em>Voimin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVoimin()
     * @generated
     * @ordered
     */
    protected Double voimin = VOIMIN_EDEFAULT;

    /**
     * This is true if the Voimin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean voiminESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OverexcLim2Impl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getOverexcLim2();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKoi() {
        return koi;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKoi( Double newKoi ) {
        Double oldKoi = koi;
        koi = newKoi;
        boolean oldKoiESet = koiESet;
        koiESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.OVEREXC_LIM2__KOI, oldKoi, koi,
                    !oldKoiESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKoi() {
        Double oldKoi = koi;
        boolean oldKoiESet = koiESet;
        koi = KOI_EDEFAULT;
        koiESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.OVEREXC_LIM2__KOI, oldKoi,
                    KOI_EDEFAULT, oldKoiESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKoi() {
        return koiESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getIfdlim() {
        return ifdlim;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIfdlim( Double newIfdlim ) {
        Double oldIfdlim = ifdlim;
        ifdlim = newIfdlim;
        boolean oldIfdlimESet = ifdlimESet;
        ifdlimESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.OVEREXC_LIM2__IFDLIM, oldIfdlim, ifdlim,
                    !oldIfdlimESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIfdlim() {
        Double oldIfdlim = ifdlim;
        boolean oldIfdlimESet = ifdlimESet;
        ifdlim = IFDLIM_EDEFAULT;
        ifdlimESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.OVEREXC_LIM2__IFDLIM, oldIfdlim,
                    IFDLIM_EDEFAULT, oldIfdlimESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIfdlim() {
        return ifdlimESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVoimax() {
        return voimax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVoimax( Double newVoimax ) {
        Double oldVoimax = voimax;
        voimax = newVoimax;
        boolean oldVoimaxESet = voimaxESet;
        voimaxESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.OVEREXC_LIM2__VOIMAX, oldVoimax, voimax,
                    !oldVoimaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVoimax() {
        Double oldVoimax = voimax;
        boolean oldVoimaxESet = voimaxESet;
        voimax = VOIMAX_EDEFAULT;
        voimaxESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.OVEREXC_LIM2__VOIMAX, oldVoimax,
                    VOIMAX_EDEFAULT, oldVoimaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVoimax() {
        return voimaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVoimin() {
        return voimin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVoimin( Double newVoimin ) {
        Double oldVoimin = voimin;
        voimin = newVoimin;
        boolean oldVoiminESet = voiminESet;
        voiminESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.OVEREXC_LIM2__VOIMIN, oldVoimin, voimin,
                    !oldVoiminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVoimin() {
        Double oldVoimin = voimin;
        boolean oldVoiminESet = voiminESet;
        voimin = VOIMIN_EDEFAULT;
        voiminESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.OVEREXC_LIM2__VOIMIN, oldVoimin,
                    VOIMIN_EDEFAULT, oldVoiminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVoimin() {
        return voiminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.OVEREXC_LIM2__KOI:
            return getKoi();
        case CimPackage.OVEREXC_LIM2__IFDLIM:
            return getIfdlim();
        case CimPackage.OVEREXC_LIM2__VOIMAX:
            return getVoimax();
        case CimPackage.OVEREXC_LIM2__VOIMIN:
            return getVoimin();
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
        case CimPackage.OVEREXC_LIM2__KOI:
            setKoi( ( Double ) newValue );
            return;
        case CimPackage.OVEREXC_LIM2__IFDLIM:
            setIfdlim( ( Double ) newValue );
            return;
        case CimPackage.OVEREXC_LIM2__VOIMAX:
            setVoimax( ( Double ) newValue );
            return;
        case CimPackage.OVEREXC_LIM2__VOIMIN:
            setVoimin( ( Double ) newValue );
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
        case CimPackage.OVEREXC_LIM2__KOI:
            unsetKoi();
            return;
        case CimPackage.OVEREXC_LIM2__IFDLIM:
            unsetIfdlim();
            return;
        case CimPackage.OVEREXC_LIM2__VOIMAX:
            unsetVoimax();
            return;
        case CimPackage.OVEREXC_LIM2__VOIMIN:
            unsetVoimin();
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
        case CimPackage.OVEREXC_LIM2__KOI:
            return isSetKoi();
        case CimPackage.OVEREXC_LIM2__IFDLIM:
            return isSetIfdlim();
        case CimPackage.OVEREXC_LIM2__VOIMAX:
            return isSetVoimax();
        case CimPackage.OVEREXC_LIM2__VOIMIN:
            return isSetVoimin();
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
        result.append( " (koi: " );
        if( koiESet )
            result.append( koi );
        else
            result.append( "<unset>" );
        result.append( ", ifdlim: " );
        if( ifdlimESet )
            result.append( ifdlim );
        else
            result.append( "<unset>" );
        result.append( ", voimax: " );
        if( voimaxESet )
            result.append( voimax );
        else
            result.append( "<unset>" );
        result.append( ", voimin: " );
        if( voiminESet )
            result.append( voimin );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //OverexcLim2Impl

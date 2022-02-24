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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OverexcLimIEEE;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Overexc Lim IEEE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.OverexcLimIEEEImpl#getKcd <em>Kcd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.OverexcLimIEEEImpl#getKramp <em>Kramp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.OverexcLimIEEEImpl#getHyst <em>Hyst</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.OverexcLimIEEEImpl#getIfdmax <em>Ifdmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.OverexcLimIEEEImpl#getIfdlim <em>Ifdlim</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.OverexcLimIEEEImpl#getItfpu <em>Itfpu</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OverexcLimIEEEImpl extends OverexcitationLimiterDynamicsImpl implements OverexcLimIEEE {
    /**
     * The default value of the '{@link #getKcd() <em>Kcd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKcd()
     * @generated
     * @ordered
     */
    protected static final Double KCD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKcd() <em>Kcd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKcd()
     * @generated
     * @ordered
     */
    protected Double kcd = KCD_EDEFAULT;

    /**
     * This is true if the Kcd attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kcdESet;

    /**
     * The default value of the '{@link #getKramp() <em>Kramp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKramp()
     * @generated
     * @ordered
     */
    protected static final Double KRAMP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKramp() <em>Kramp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKramp()
     * @generated
     * @ordered
     */
    protected Double kramp = KRAMP_EDEFAULT;

    /**
     * This is true if the Kramp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean krampESet;

    /**
     * The default value of the '{@link #getHyst() <em>Hyst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHyst()
     * @generated
     * @ordered
     */
    protected static final Double HYST_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getHyst() <em>Hyst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHyst()
     * @generated
     * @ordered
     */
    protected Double hyst = HYST_EDEFAULT;

    /**
     * This is true if the Hyst attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean hystESet;

    /**
     * The default value of the '{@link #getIfdmax() <em>Ifdmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIfdmax()
     * @generated
     * @ordered
     */
    protected static final Double IFDMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIfdmax() <em>Ifdmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIfdmax()
     * @generated
     * @ordered
     */
    protected Double ifdmax = IFDMAX_EDEFAULT;

    /**
     * This is true if the Ifdmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ifdmaxESet;

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
     * The default value of the '{@link #getItfpu() <em>Itfpu</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getItfpu()
     * @generated
     * @ordered
     */
    protected static final Double ITFPU_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getItfpu() <em>Itfpu</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getItfpu()
     * @generated
     * @ordered
     */
    protected Double itfpu = ITFPU_EDEFAULT;

    /**
     * This is true if the Itfpu attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean itfpuESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected OverexcLimIEEEImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getOverexcLimIEEE();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKcd() {
        return kcd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKcd( Double newKcd ) {
        Double oldKcd = kcd;
        kcd = newKcd;
        boolean oldKcdESet = kcdESet;
        kcdESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.OVEREXC_LIM_IEEE__KCD, oldKcd, kcd,
                    !oldKcdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKcd() {
        Double oldKcd = kcd;
        boolean oldKcdESet = kcdESet;
        kcd = KCD_EDEFAULT;
        kcdESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.OVEREXC_LIM_IEEE__KCD, oldKcd,
                    KCD_EDEFAULT, oldKcdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKcd() {
        return kcdESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKramp() {
        return kramp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKramp( Double newKramp ) {
        Double oldKramp = kramp;
        kramp = newKramp;
        boolean oldKrampESet = krampESet;
        krampESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.OVEREXC_LIM_IEEE__KRAMP, oldKramp, kramp,
                    !oldKrampESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKramp() {
        Double oldKramp = kramp;
        boolean oldKrampESet = krampESet;
        kramp = KRAMP_EDEFAULT;
        krampESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.OVEREXC_LIM_IEEE__KRAMP, oldKramp,
                    KRAMP_EDEFAULT, oldKrampESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKramp() {
        return krampESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getHyst() {
        return hyst;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setHyst( Double newHyst ) {
        Double oldHyst = hyst;
        hyst = newHyst;
        boolean oldHystESet = hystESet;
        hystESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.OVEREXC_LIM_IEEE__HYST, oldHyst, hyst,
                    !oldHystESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetHyst() {
        Double oldHyst = hyst;
        boolean oldHystESet = hystESet;
        hyst = HYST_EDEFAULT;
        hystESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.OVEREXC_LIM_IEEE__HYST, oldHyst,
                    HYST_EDEFAULT, oldHystESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetHyst() {
        return hystESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getIfdmax() {
        return ifdmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIfdmax( Double newIfdmax ) {
        Double oldIfdmax = ifdmax;
        ifdmax = newIfdmax;
        boolean oldIfdmaxESet = ifdmaxESet;
        ifdmaxESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.OVEREXC_LIM_IEEE__IFDMAX, oldIfdmax,
                    ifdmax, !oldIfdmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIfdmax() {
        Double oldIfdmax = ifdmax;
        boolean oldIfdmaxESet = ifdmaxESet;
        ifdmax = IFDMAX_EDEFAULT;
        ifdmaxESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.OVEREXC_LIM_IEEE__IFDMAX, oldIfdmax,
                    IFDMAX_EDEFAULT, oldIfdmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIfdmax() {
        return ifdmaxESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.OVEREXC_LIM_IEEE__IFDLIM, oldIfdlim,
                    ifdlim, !oldIfdlimESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.OVEREXC_LIM_IEEE__IFDLIM, oldIfdlim,
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
    public Double getItfpu() {
        return itfpu;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setItfpu( Double newItfpu ) {
        Double oldItfpu = itfpu;
        itfpu = newItfpu;
        boolean oldItfpuESet = itfpuESet;
        itfpuESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.OVEREXC_LIM_IEEE__ITFPU, oldItfpu, itfpu,
                    !oldItfpuESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetItfpu() {
        Double oldItfpu = itfpu;
        boolean oldItfpuESet = itfpuESet;
        itfpu = ITFPU_EDEFAULT;
        itfpuESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.OVEREXC_LIM_IEEE__ITFPU, oldItfpu,
                    ITFPU_EDEFAULT, oldItfpuESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetItfpu() {
        return itfpuESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.OVEREXC_LIM_IEEE__KCD:
            return getKcd();
        case CimPackage.OVEREXC_LIM_IEEE__KRAMP:
            return getKramp();
        case CimPackage.OVEREXC_LIM_IEEE__HYST:
            return getHyst();
        case CimPackage.OVEREXC_LIM_IEEE__IFDMAX:
            return getIfdmax();
        case CimPackage.OVEREXC_LIM_IEEE__IFDLIM:
            return getIfdlim();
        case CimPackage.OVEREXC_LIM_IEEE__ITFPU:
            return getItfpu();
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
        case CimPackage.OVEREXC_LIM_IEEE__KCD:
            setKcd( ( Double ) newValue );
            return;
        case CimPackage.OVEREXC_LIM_IEEE__KRAMP:
            setKramp( ( Double ) newValue );
            return;
        case CimPackage.OVEREXC_LIM_IEEE__HYST:
            setHyst( ( Double ) newValue );
            return;
        case CimPackage.OVEREXC_LIM_IEEE__IFDMAX:
            setIfdmax( ( Double ) newValue );
            return;
        case CimPackage.OVEREXC_LIM_IEEE__IFDLIM:
            setIfdlim( ( Double ) newValue );
            return;
        case CimPackage.OVEREXC_LIM_IEEE__ITFPU:
            setItfpu( ( Double ) newValue );
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
        case CimPackage.OVEREXC_LIM_IEEE__KCD:
            unsetKcd();
            return;
        case CimPackage.OVEREXC_LIM_IEEE__KRAMP:
            unsetKramp();
            return;
        case CimPackage.OVEREXC_LIM_IEEE__HYST:
            unsetHyst();
            return;
        case CimPackage.OVEREXC_LIM_IEEE__IFDMAX:
            unsetIfdmax();
            return;
        case CimPackage.OVEREXC_LIM_IEEE__IFDLIM:
            unsetIfdlim();
            return;
        case CimPackage.OVEREXC_LIM_IEEE__ITFPU:
            unsetItfpu();
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
        case CimPackage.OVEREXC_LIM_IEEE__KCD:
            return isSetKcd();
        case CimPackage.OVEREXC_LIM_IEEE__KRAMP:
            return isSetKramp();
        case CimPackage.OVEREXC_LIM_IEEE__HYST:
            return isSetHyst();
        case CimPackage.OVEREXC_LIM_IEEE__IFDMAX:
            return isSetIfdmax();
        case CimPackage.OVEREXC_LIM_IEEE__IFDLIM:
            return isSetIfdlim();
        case CimPackage.OVEREXC_LIM_IEEE__ITFPU:
            return isSetItfpu();
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
        result.append( " (kcd: " );
        if( kcdESet )
            result.append( kcd );
        else
            result.append( "<unset>" );
        result.append( ", kramp: " );
        if( krampESet )
            result.append( kramp );
        else
            result.append( "<unset>" );
        result.append( ", hyst: " );
        if( hystESet )
            result.append( hyst );
        else
            result.append( "<unset>" );
        result.append( ", ifdmax: " );
        if( ifdmaxESet )
            result.append( ifdmax );
        else
            result.append( "<unset>" );
        result.append( ", ifdlim: " );
        if( ifdlimESet )
            result.append( ifdlim );
        else
            result.append( "<unset>" );
        result.append( ", itfpu: " );
        if( itfpuESet )
            result.append( itfpu );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //OverexcLimIEEEImpl

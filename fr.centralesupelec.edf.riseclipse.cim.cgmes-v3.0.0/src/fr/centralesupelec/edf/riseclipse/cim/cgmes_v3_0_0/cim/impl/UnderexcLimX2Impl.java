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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLimX2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Underexc Lim X2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.UnderexcLimX2Impl#getKm <em>Km</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.UnderexcLimX2Impl#getTm <em>Tm</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.UnderexcLimX2Impl#getQo <em>Qo</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.UnderexcLimX2Impl#getMelmax <em>Melmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.UnderexcLimX2Impl#getR <em>R</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.UnderexcLimX2Impl#getTf2 <em>Tf2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.UnderexcLimX2Impl#getKf2 <em>Kf2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnderexcLimX2Impl extends UnderexcitationLimiterDynamicsImpl implements UnderexcLimX2 {
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
     * The default value of the '{@link #getTm() <em>Tm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTm()
     * @generated
     * @ordered
     */
    protected static final Double TM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTm() <em>Tm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTm()
     * @generated
     * @ordered
     */
    protected Double tm = TM_EDEFAULT;

    /**
     * This is true if the Tm attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tmESet;

    /**
     * The default value of the '{@link #getQo() <em>Qo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQo()
     * @generated
     * @ordered
     */
    protected static final Double QO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getQo() <em>Qo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQo()
     * @generated
     * @ordered
     */
    protected Double qo = QO_EDEFAULT;

    /**
     * This is true if the Qo attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean qoESet;

    /**
     * The default value of the '{@link #getMelmax() <em>Melmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMelmax()
     * @generated
     * @ordered
     */
    protected static final Double MELMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMelmax() <em>Melmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMelmax()
     * @generated
     * @ordered
     */
    protected Double melmax = MELMAX_EDEFAULT;

    /**
     * This is true if the Melmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean melmaxESet;

    /**
     * The default value of the '{@link #getR() <em>R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR()
     * @generated
     * @ordered
     */
    protected static final Double R_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getR() <em>R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR()
     * @generated
     * @ordered
     */
    protected Double r = R_EDEFAULT;

    /**
     * This is true if the R attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rESet;

    /**
     * The default value of the '{@link #getTf2() <em>Tf2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTf2()
     * @generated
     * @ordered
     */
    protected static final Double TF2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTf2() <em>Tf2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTf2()
     * @generated
     * @ordered
     */
    protected Double tf2 = TF2_EDEFAULT;

    /**
     * This is true if the Tf2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tf2ESet;

    /**
     * The default value of the '{@link #getKf2() <em>Kf2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKf2()
     * @generated
     * @ordered
     */
    protected static final Double KF2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKf2() <em>Kf2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKf2()
     * @generated
     * @ordered
     */
    protected Double kf2 = KF2_EDEFAULT;

    /**
     * This is true if the Kf2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kf2ESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected UnderexcLimX2Impl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getUnderexcLimX2();
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.UNDEREXC_LIM_X2__KM, oldKm, km,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.UNDEREXC_LIM_X2__KM, oldKm,
                    KM_EDEFAULT, oldKmESet ) );
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
    public Double getTm() {
        return tm;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTm( Double newTm ) {
        Double oldTm = tm;
        tm = newTm;
        boolean oldTmESet = tmESet;
        tmESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.UNDEREXC_LIM_X2__TM, oldTm, tm,
                    !oldTmESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTm() {
        Double oldTm = tm;
        boolean oldTmESet = tmESet;
        tm = TM_EDEFAULT;
        tmESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.UNDEREXC_LIM_X2__TM, oldTm,
                    TM_EDEFAULT, oldTmESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTm() {
        return tmESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getQo() {
        return qo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setQo( Double newQo ) {
        Double oldQo = qo;
        qo = newQo;
        boolean oldQoESet = qoESet;
        qoESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.UNDEREXC_LIM_X2__QO, oldQo, qo,
                    !oldQoESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetQo() {
        Double oldQo = qo;
        boolean oldQoESet = qoESet;
        qo = QO_EDEFAULT;
        qoESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.UNDEREXC_LIM_X2__QO, oldQo,
                    QO_EDEFAULT, oldQoESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetQo() {
        return qoESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getMelmax() {
        return melmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMelmax( Double newMelmax ) {
        Double oldMelmax = melmax;
        melmax = newMelmax;
        boolean oldMelmaxESet = melmaxESet;
        melmaxESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.UNDEREXC_LIM_X2__MELMAX, oldMelmax,
                    melmax, !oldMelmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMelmax() {
        Double oldMelmax = melmax;
        boolean oldMelmaxESet = melmaxESet;
        melmax = MELMAX_EDEFAULT;
        melmaxESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.UNDEREXC_LIM_X2__MELMAX, oldMelmax,
                    MELMAX_EDEFAULT, oldMelmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMelmax() {
        return melmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getR() {
        return r;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setR( Double newR ) {
        Double oldR = r;
        r = newR;
        boolean oldRESet = rESet;
        rESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.UNDEREXC_LIM_X2__R, oldR, r,
                    !oldRESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetR() {
        Double oldR = r;
        boolean oldRESet = rESet;
        r = R_EDEFAULT;
        rESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.UNDEREXC_LIM_X2__R, oldR, R_EDEFAULT,
                    oldRESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetR() {
        return rESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTf2() {
        return tf2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTf2( Double newTf2 ) {
        Double oldTf2 = tf2;
        tf2 = newTf2;
        boolean oldTf2ESet = tf2ESet;
        tf2ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.UNDEREXC_LIM_X2__TF2, oldTf2, tf2,
                    !oldTf2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTf2() {
        Double oldTf2 = tf2;
        boolean oldTf2ESet = tf2ESet;
        tf2 = TF2_EDEFAULT;
        tf2ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.UNDEREXC_LIM_X2__TF2, oldTf2,
                    TF2_EDEFAULT, oldTf2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTf2() {
        return tf2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKf2() {
        return kf2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKf2( Double newKf2 ) {
        Double oldKf2 = kf2;
        kf2 = newKf2;
        boolean oldKf2ESet = kf2ESet;
        kf2ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.UNDEREXC_LIM_X2__KF2, oldKf2, kf2,
                    !oldKf2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKf2() {
        Double oldKf2 = kf2;
        boolean oldKf2ESet = kf2ESet;
        kf2 = KF2_EDEFAULT;
        kf2ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.UNDEREXC_LIM_X2__KF2, oldKf2,
                    KF2_EDEFAULT, oldKf2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKf2() {
        return kf2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.UNDEREXC_LIM_X2__KM:
            return getKm();
        case CimPackage.UNDEREXC_LIM_X2__TM:
            return getTm();
        case CimPackage.UNDEREXC_LIM_X2__QO:
            return getQo();
        case CimPackage.UNDEREXC_LIM_X2__MELMAX:
            return getMelmax();
        case CimPackage.UNDEREXC_LIM_X2__R:
            return getR();
        case CimPackage.UNDEREXC_LIM_X2__TF2:
            return getTf2();
        case CimPackage.UNDEREXC_LIM_X2__KF2:
            return getKf2();
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
        case CimPackage.UNDEREXC_LIM_X2__KM:
            setKm( ( Double ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM_X2__TM:
            setTm( ( Double ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM_X2__QO:
            setQo( ( Double ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM_X2__MELMAX:
            setMelmax( ( Double ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM_X2__R:
            setR( ( Double ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM_X2__TF2:
            setTf2( ( Double ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM_X2__KF2:
            setKf2( ( Double ) newValue );
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
        case CimPackage.UNDEREXC_LIM_X2__KM:
            unsetKm();
            return;
        case CimPackage.UNDEREXC_LIM_X2__TM:
            unsetTm();
            return;
        case CimPackage.UNDEREXC_LIM_X2__QO:
            unsetQo();
            return;
        case CimPackage.UNDEREXC_LIM_X2__MELMAX:
            unsetMelmax();
            return;
        case CimPackage.UNDEREXC_LIM_X2__R:
            unsetR();
            return;
        case CimPackage.UNDEREXC_LIM_X2__TF2:
            unsetTf2();
            return;
        case CimPackage.UNDEREXC_LIM_X2__KF2:
            unsetKf2();
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
        case CimPackage.UNDEREXC_LIM_X2__KM:
            return isSetKm();
        case CimPackage.UNDEREXC_LIM_X2__TM:
            return isSetTm();
        case CimPackage.UNDEREXC_LIM_X2__QO:
            return isSetQo();
        case CimPackage.UNDEREXC_LIM_X2__MELMAX:
            return isSetMelmax();
        case CimPackage.UNDEREXC_LIM_X2__R:
            return isSetR();
        case CimPackage.UNDEREXC_LIM_X2__TF2:
            return isSetTf2();
        case CimPackage.UNDEREXC_LIM_X2__KF2:
            return isSetKf2();
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
        result.append( " (km: " );
        if( kmESet )
            result.append( km );
        else
            result.append( "<unset>" );
        result.append( ", tm: " );
        if( tmESet )
            result.append( tm );
        else
            result.append( "<unset>" );
        result.append( ", qo: " );
        if( qoESet )
            result.append( qo );
        else
            result.append( "<unset>" );
        result.append( ", melmax: " );
        if( melmaxESet )
            result.append( melmax );
        else
            result.append( "<unset>" );
        result.append( ", r: " );
        if( rESet )
            result.append( r );
        else
            result.append( "<unset>" );
        result.append( ", tf2: " );
        if( tf2ESet )
            result.append( tf2 );
        else
            result.append( "<unset>" );
        result.append( ", kf2: " );
        if( kf2ESet )
            result.append( kf2 );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //UnderexcLimX2Impl

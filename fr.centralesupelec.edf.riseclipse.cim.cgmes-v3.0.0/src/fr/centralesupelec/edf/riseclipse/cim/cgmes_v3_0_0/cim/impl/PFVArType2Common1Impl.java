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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PFVArType2Common1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PFV Ar Type2 Common1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PFVArType2Common1Impl#getKi <em>Ki</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PFVArType2Common1Impl#getJ <em>J</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PFVArType2Common1Impl#getKp <em>Kp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PFVArType2Common1Impl#getRef <em>Ref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PFVArType2Common1Impl#getMax <em>Max</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PFVArType2Common1Impl extends PFVArControllerType2DynamicsImpl implements PFVArType2Common1 {
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
     * The default value of the '{@link #getJ() <em>J</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getJ()
     * @generated
     * @ordered
     */
    protected static final Boolean J_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getJ() <em>J</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getJ()
     * @generated
     * @ordered
     */
    protected Boolean j = J_EDEFAULT;

    /**
     * This is true if the J attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean jESet;

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
     * The default value of the '{@link #getRef() <em>Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRef()
     * @generated
     * @ordered
     */
    protected static final Double REF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRef() <em>Ref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRef()
     * @generated
     * @ordered
     */
    protected Double ref = REF_EDEFAULT;

    /**
     * This is true if the Ref attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean refESet;

    /**
     * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMax()
     * @generated
     * @ordered
     */
    protected static final Double MAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMax() <em>Max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMax()
     * @generated
     * @ordered
     */
    protected Double max = MAX_EDEFAULT;

    /**
     * This is true if the Max attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PFVArType2Common1Impl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getPFVArType2Common1();
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PFV_AR_TYPE2_COMMON1__KI, oldKi, ki,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PFV_AR_TYPE2_COMMON1__KI, oldKi,
                    KI_EDEFAULT, oldKiESet ) );
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
    public Boolean getJ() {
        return j;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setJ( Boolean newJ ) {
        Boolean oldJ = j;
        j = newJ;
        boolean oldJESet = jESet;
        jESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PFV_AR_TYPE2_COMMON1__J, oldJ, j,
                    !oldJESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetJ() {
        Boolean oldJ = j;
        boolean oldJESet = jESet;
        j = J_EDEFAULT;
        jESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PFV_AR_TYPE2_COMMON1__J, oldJ,
                    J_EDEFAULT, oldJESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetJ() {
        return jESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PFV_AR_TYPE2_COMMON1__KP, oldKp, kp,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PFV_AR_TYPE2_COMMON1__KP, oldKp,
                    KP_EDEFAULT, oldKpESet ) );
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
    public Double getRef() {
        return ref;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRef( Double newRef ) {
        Double oldRef = ref;
        ref = newRef;
        boolean oldRefESet = refESet;
        refESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PFV_AR_TYPE2_COMMON1__REF, oldRef, ref,
                    !oldRefESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRef() {
        Double oldRef = ref;
        boolean oldRefESet = refESet;
        ref = REF_EDEFAULT;
        refESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PFV_AR_TYPE2_COMMON1__REF, oldRef,
                    REF_EDEFAULT, oldRefESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRef() {
        return refESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getMax() {
        return max;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMax( Double newMax ) {
        Double oldMax = max;
        max = newMax;
        boolean oldMaxESet = maxESet;
        maxESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PFV_AR_TYPE2_COMMON1__MAX, oldMax, max,
                    !oldMaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMax() {
        Double oldMax = max;
        boolean oldMaxESet = maxESet;
        max = MAX_EDEFAULT;
        maxESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PFV_AR_TYPE2_COMMON1__MAX, oldMax,
                    MAX_EDEFAULT, oldMaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMax() {
        return maxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.PFV_AR_TYPE2_COMMON1__KI:
            return getKi();
        case CimPackage.PFV_AR_TYPE2_COMMON1__J:
            return getJ();
        case CimPackage.PFV_AR_TYPE2_COMMON1__KP:
            return getKp();
        case CimPackage.PFV_AR_TYPE2_COMMON1__REF:
            return getRef();
        case CimPackage.PFV_AR_TYPE2_COMMON1__MAX:
            return getMax();
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
        case CimPackage.PFV_AR_TYPE2_COMMON1__KI:
            setKi( ( Double ) newValue );
            return;
        case CimPackage.PFV_AR_TYPE2_COMMON1__J:
            setJ( ( Boolean ) newValue );
            return;
        case CimPackage.PFV_AR_TYPE2_COMMON1__KP:
            setKp( ( Double ) newValue );
            return;
        case CimPackage.PFV_AR_TYPE2_COMMON1__REF:
            setRef( ( Double ) newValue );
            return;
        case CimPackage.PFV_AR_TYPE2_COMMON1__MAX:
            setMax( ( Double ) newValue );
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
        case CimPackage.PFV_AR_TYPE2_COMMON1__KI:
            unsetKi();
            return;
        case CimPackage.PFV_AR_TYPE2_COMMON1__J:
            unsetJ();
            return;
        case CimPackage.PFV_AR_TYPE2_COMMON1__KP:
            unsetKp();
            return;
        case CimPackage.PFV_AR_TYPE2_COMMON1__REF:
            unsetRef();
            return;
        case CimPackage.PFV_AR_TYPE2_COMMON1__MAX:
            unsetMax();
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
        case CimPackage.PFV_AR_TYPE2_COMMON1__KI:
            return isSetKi();
        case CimPackage.PFV_AR_TYPE2_COMMON1__J:
            return isSetJ();
        case CimPackage.PFV_AR_TYPE2_COMMON1__KP:
            return isSetKp();
        case CimPackage.PFV_AR_TYPE2_COMMON1__REF:
            return isSetRef();
        case CimPackage.PFV_AR_TYPE2_COMMON1__MAX:
            return isSetMax();
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
        result.append( " (ki: " );
        if( kiESet )
            result.append( ki );
        else
            result.append( "<unset>" );
        result.append( ", j: " );
        if( jESet )
            result.append( j );
        else
            result.append( "<unset>" );
        result.append( ", kp: " );
        if( kpESet )
            result.append( kp );
        else
            result.append( "<unset>" );
        result.append( ", ref: " );
        if( refESet )
            result.append( ref );
        else
            result.append( "<unset>" );
        result.append( ", max: " );
        if( maxESet )
            result.append( max );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //PFVArType2Common1Impl

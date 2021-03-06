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

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineTimeConstantReactance;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asynchronous Machine Time Constant Reactance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.AsynchronousMachineTimeConstantReactanceImpl#getXpp <em>Xpp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.AsynchronousMachineTimeConstantReactanceImpl#getTppo <em>Tppo</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.AsynchronousMachineTimeConstantReactanceImpl#getXs <em>Xs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.AsynchronousMachineTimeConstantReactanceImpl#getXp <em>Xp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.AsynchronousMachineTimeConstantReactanceImpl#getTpo <em>Tpo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AsynchronousMachineTimeConstantReactanceImpl extends AsynchronousMachineDynamicsImpl
        implements AsynchronousMachineTimeConstantReactance {
    /**
     * The default value of the '{@link #getXpp() <em>Xpp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXpp()
     * @generated
     * @ordered
     */
    protected static final Double XPP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getXpp() <em>Xpp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXpp()
     * @generated
     * @ordered
     */
    protected Double xpp = XPP_EDEFAULT;

    /**
     * This is true if the Xpp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xppESet;

    /**
     * The default value of the '{@link #getTppo() <em>Tppo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTppo()
     * @generated
     * @ordered
     */
    protected static final Double TPPO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTppo() <em>Tppo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTppo()
     * @generated
     * @ordered
     */
    protected Double tppo = TPPO_EDEFAULT;

    /**
     * This is true if the Tppo attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tppoESet;

    /**
     * The default value of the '{@link #getXs() <em>Xs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXs()
     * @generated
     * @ordered
     */
    protected static final Double XS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getXs() <em>Xs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXs()
     * @generated
     * @ordered
     */
    protected Double xs = XS_EDEFAULT;

    /**
     * This is true if the Xs attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xsESet;

    /**
     * The default value of the '{@link #getXp() <em>Xp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXp()
     * @generated
     * @ordered
     */
    protected static final Double XP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getXp() <em>Xp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXp()
     * @generated
     * @ordered
     */
    protected Double xp = XP_EDEFAULT;

    /**
     * This is true if the Xp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xpESet;

    /**
     * The default value of the '{@link #getTpo() <em>Tpo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTpo()
     * @generated
     * @ordered
     */
    protected static final Double TPO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTpo() <em>Tpo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTpo()
     * @generated
     * @ordered
     */
    protected Double tpo = TPO_EDEFAULT;

    /**
     * This is true if the Tpo attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tpoESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AsynchronousMachineTimeConstantReactanceImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getAsynchronousMachineTimeConstantReactance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getXpp() {
        return xpp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setXpp( Double newXpp ) {
        Double oldXpp = xpp;
        xpp = newXpp;
        boolean oldXppESet = xppESet;
        xppESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.ASYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__XPP, oldXpp, xpp, !oldXppESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetXpp() {
        Double oldXpp = xpp;
        boolean oldXppESet = xppESet;
        xpp = XPP_EDEFAULT;
        xppESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__XPP, oldXpp, XPP_EDEFAULT, oldXppESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetXpp() {
        return xppESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTppo() {
        return tppo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTppo( Double newTppo ) {
        Double oldTppo = tppo;
        tppo = newTppo;
        boolean oldTppoESet = tppoESet;
        tppoESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.ASYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__TPPO, oldTppo, tppo, !oldTppoESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTppo() {
        Double oldTppo = tppo;
        boolean oldTppoESet = tppoESet;
        tppo = TPPO_EDEFAULT;
        tppoESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__TPPO, oldTppo, TPPO_EDEFAULT,
                    oldTppoESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTppo() {
        return tppoESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getXs() {
        return xs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setXs( Double newXs ) {
        Double oldXs = xs;
        xs = newXs;
        boolean oldXsESet = xsESet;
        xsESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.ASYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__XS, oldXs, xs, !oldXsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetXs() {
        Double oldXs = xs;
        boolean oldXsESet = xsESet;
        xs = XS_EDEFAULT;
        xsESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__XS, oldXs, XS_EDEFAULT, oldXsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetXs() {
        return xsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getXp() {
        return xp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setXp( Double newXp ) {
        Double oldXp = xp;
        xp = newXp;
        boolean oldXpESet = xpESet;
        xpESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.ASYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__XP, oldXp, xp, !oldXpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetXp() {
        Double oldXp = xp;
        boolean oldXpESet = xpESet;
        xp = XP_EDEFAULT;
        xpESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__XP, oldXp, XP_EDEFAULT, oldXpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetXp() {
        return xpESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTpo() {
        return tpo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTpo( Double newTpo ) {
        Double oldTpo = tpo;
        tpo = newTpo;
        boolean oldTpoESet = tpoESet;
        tpoESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.ASYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__TPO, oldTpo, tpo, !oldTpoESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTpo() {
        Double oldTpo = tpo;
        boolean oldTpoESet = tpoESet;
        tpo = TPO_EDEFAULT;
        tpoESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__TPO, oldTpo, TPO_EDEFAULT, oldTpoESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTpo() {
        return tpoESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.ASYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__XPP:
            return getXpp();
        case CimPackage.ASYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__TPPO:
            return getTppo();
        case CimPackage.ASYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__XS:
            return getXs();
        case CimPackage.ASYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__XP:
            return getXp();
        case CimPackage.ASYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__TPO:
            return getTpo();
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
        case CimPackage.ASYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__XPP:
            setXpp( ( Double ) newValue );
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__TPPO:
            setTppo( ( Double ) newValue );
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__XS:
            setXs( ( Double ) newValue );
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__XP:
            setXp( ( Double ) newValue );
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__TPO:
            setTpo( ( Double ) newValue );
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
        case CimPackage.ASYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__XPP:
            unsetXpp();
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__TPPO:
            unsetTppo();
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__XS:
            unsetXs();
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__XP:
            unsetXp();
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__TPO:
            unsetTpo();
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
        case CimPackage.ASYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__XPP:
            return isSetXpp();
        case CimPackage.ASYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__TPPO:
            return isSetTppo();
        case CimPackage.ASYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__XS:
            return isSetXs();
        case CimPackage.ASYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__XP:
            return isSetXp();
        case CimPackage.ASYNCHRONOUS_MACHINE_TIME_CONSTANT_REACTANCE__TPO:
            return isSetTpo();
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
        result.append( " (xpp: " );
        if( xppESet )
            result.append( xpp );
        else
            result.append( "<unset>" );
        result.append( ", tppo: " );
        if( tppoESet )
            result.append( tppo );
        else
            result.append( "<unset>" );
        result.append( ", xs: " );
        if( xsESet )
            result.append( xs );
        else
            result.append( "<unset>" );
        result.append( ", xp: " );
        if( xpESet )
            result.append( xp );
        else
            result.append( "<unset>" );
        result.append( ", tpo: " );
        if( tpoESet )
            result.append( tpo );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //AsynchronousMachineTimeConstantReactanceImpl

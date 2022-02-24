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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VCompIEEEType1;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VComp IEEE Type1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.VCompIEEEType1Impl#getRc <em>Rc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.VCompIEEEType1Impl#getTr <em>Tr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.VCompIEEEType1Impl#getXc <em>Xc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VCompIEEEType1Impl extends VoltageCompensatorDynamicsImpl implements VCompIEEEType1 {
    /**
     * The default value of the '{@link #getRc() <em>Rc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRc()
     * @generated
     * @ordered
     */
    protected static final Double RC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRc() <em>Rc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRc()
     * @generated
     * @ordered
     */
    protected Double rc = RC_EDEFAULT;

    /**
     * This is true if the Rc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rcESet;

    /**
     * The default value of the '{@link #getTr() <em>Tr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTr()
     * @generated
     * @ordered
     */
    protected static final Double TR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTr() <em>Tr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTr()
     * @generated
     * @ordered
     */
    protected Double tr = TR_EDEFAULT;

    /**
     * This is true if the Tr attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean trESet;

    /**
     * The default value of the '{@link #getXc() <em>Xc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXc()
     * @generated
     * @ordered
     */
    protected static final Double XC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getXc() <em>Xc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXc()
     * @generated
     * @ordered
     */
    protected Double xc = XC_EDEFAULT;

    /**
     * This is true if the Xc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xcESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected VCompIEEEType1Impl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getVCompIEEEType1();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getRc() {
        return rc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRc( Double newRc ) {
        Double oldRc = rc;
        rc = newRc;
        boolean oldRcESet = rcESet;
        rcESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.VCOMP_IEEE_TYPE1__RC, oldRc, rc,
                    !oldRcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRc() {
        Double oldRc = rc;
        boolean oldRcESet = rcESet;
        rc = RC_EDEFAULT;
        rcESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.VCOMP_IEEE_TYPE1__RC, oldRc,
                    RC_EDEFAULT, oldRcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRc() {
        return rcESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTr() {
        return tr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTr( Double newTr ) {
        Double oldTr = tr;
        tr = newTr;
        boolean oldTrESet = trESet;
        trESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.VCOMP_IEEE_TYPE1__TR, oldTr, tr,
                    !oldTrESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTr() {
        Double oldTr = tr;
        boolean oldTrESet = trESet;
        tr = TR_EDEFAULT;
        trESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.VCOMP_IEEE_TYPE1__TR, oldTr,
                    TR_EDEFAULT, oldTrESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTr() {
        return trESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getXc() {
        return xc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setXc( Double newXc ) {
        Double oldXc = xc;
        xc = newXc;
        boolean oldXcESet = xcESet;
        xcESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.VCOMP_IEEE_TYPE1__XC, oldXc, xc,
                    !oldXcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetXc() {
        Double oldXc = xc;
        boolean oldXcESet = xcESet;
        xc = XC_EDEFAULT;
        xcESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.VCOMP_IEEE_TYPE1__XC, oldXc,
                    XC_EDEFAULT, oldXcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetXc() {
        return xcESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.VCOMP_IEEE_TYPE1__RC:
            return getRc();
        case CimPackage.VCOMP_IEEE_TYPE1__TR:
            return getTr();
        case CimPackage.VCOMP_IEEE_TYPE1__XC:
            return getXc();
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
        case CimPackage.VCOMP_IEEE_TYPE1__RC:
            setRc( ( Double ) newValue );
            return;
        case CimPackage.VCOMP_IEEE_TYPE1__TR:
            setTr( ( Double ) newValue );
            return;
        case CimPackage.VCOMP_IEEE_TYPE1__XC:
            setXc( ( Double ) newValue );
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
        case CimPackage.VCOMP_IEEE_TYPE1__RC:
            unsetRc();
            return;
        case CimPackage.VCOMP_IEEE_TYPE1__TR:
            unsetTr();
            return;
        case CimPackage.VCOMP_IEEE_TYPE1__XC:
            unsetXc();
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
        case CimPackage.VCOMP_IEEE_TYPE1__RC:
            return isSetRc();
        case CimPackage.VCOMP_IEEE_TYPE1__TR:
            return isSetTr();
        case CimPackage.VCOMP_IEEE_TYPE1__XC:
            return isSetXc();
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
        result.append( " (rc: " );
        if( rcESet )
            result.append( rc );
        else
            result.append( "<unset>" );
        result.append( ", tr: " );
        if( trESet )
            result.append( tr );
        else
            result.append( "<unset>" );
        result.append( ", xc: " );
        if( xcESet )
            result.append( xc );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //VCompIEEEType1Impl

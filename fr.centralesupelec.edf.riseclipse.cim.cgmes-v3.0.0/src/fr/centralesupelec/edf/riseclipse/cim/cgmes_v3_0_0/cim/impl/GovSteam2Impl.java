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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteam2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gov Steam2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteam2Impl#getPmin <em>Pmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteam2Impl#getPmax <em>Pmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteam2Impl#getT2 <em>T2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteam2Impl#getT1 <em>T1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteam2Impl#getMnef <em>Mnef</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteam2Impl#getK <em>K</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteam2Impl#getDbf <em>Dbf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteam2Impl#getMxef <em>Mxef</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GovSteam2Impl extends TurbineGovernorDynamicsImpl implements GovSteam2 {
    /**
     * The default value of the '{@link #getPmin() <em>Pmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPmin()
     * @generated
     * @ordered
     */
    protected static final Double PMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPmin() <em>Pmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPmin()
     * @generated
     * @ordered
     */
    protected Double pmin = PMIN_EDEFAULT;

    /**
     * This is true if the Pmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pminESet;

    /**
     * The default value of the '{@link #getPmax() <em>Pmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPmax()
     * @generated
     * @ordered
     */
    protected static final Double PMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPmax() <em>Pmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPmax()
     * @generated
     * @ordered
     */
    protected Double pmax = PMAX_EDEFAULT;

    /**
     * This is true if the Pmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pmaxESet;

    /**
     * The default value of the '{@link #getT2() <em>T2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT2()
     * @generated
     * @ordered
     */
    protected static final Double T2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getT2() <em>T2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT2()
     * @generated
     * @ordered
     */
    protected Double t2 = T2_EDEFAULT;

    /**
     * This is true if the T2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean t2ESet;

    /**
     * The default value of the '{@link #getT1() <em>T1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT1()
     * @generated
     * @ordered
     */
    protected static final Double T1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getT1() <em>T1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT1()
     * @generated
     * @ordered
     */
    protected Double t1 = T1_EDEFAULT;

    /**
     * This is true if the T1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean t1ESet;

    /**
     * The default value of the '{@link #getMnef() <em>Mnef</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMnef()
     * @generated
     * @ordered
     */
    protected static final Double MNEF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMnef() <em>Mnef</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMnef()
     * @generated
     * @ordered
     */
    protected Double mnef = MNEF_EDEFAULT;

    /**
     * This is true if the Mnef attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean mnefESet;

    /**
     * The default value of the '{@link #getK() <em>K</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getK()
     * @generated
     * @ordered
     */
    protected static final Double K_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getK() <em>K</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getK()
     * @generated
     * @ordered
     */
    protected Double k = K_EDEFAULT;

    /**
     * This is true if the K attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kESet;

    /**
     * The default value of the '{@link #getDbf() <em>Dbf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDbf()
     * @generated
     * @ordered
     */
    protected static final Double DBF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDbf() <em>Dbf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDbf()
     * @generated
     * @ordered
     */
    protected Double dbf = DBF_EDEFAULT;

    /**
     * This is true if the Dbf attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dbfESet;

    /**
     * The default value of the '{@link #getMxef() <em>Mxef</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMxef()
     * @generated
     * @ordered
     */
    protected static final Double MXEF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMxef() <em>Mxef</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMxef()
     * @generated
     * @ordered
     */
    protected Double mxef = MXEF_EDEFAULT;

    /**
     * This is true if the Mxef attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean mxefESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GovSteam2Impl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getGovSteam2();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getPmin() {
        return pmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPmin( Double newPmin ) {
        Double oldPmin = pmin;
        pmin = newPmin;
        boolean oldPminESet = pminESet;
        pminESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM2__PMIN, oldPmin, pmin,
                    !oldPminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPmin() {
        Double oldPmin = pmin;
        boolean oldPminESet = pminESet;
        pmin = PMIN_EDEFAULT;
        pminESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM2__PMIN, oldPmin,
                    PMIN_EDEFAULT, oldPminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPmin() {
        return pminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getPmax() {
        return pmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPmax( Double newPmax ) {
        Double oldPmax = pmax;
        pmax = newPmax;
        boolean oldPmaxESet = pmaxESet;
        pmaxESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM2__PMAX, oldPmax, pmax,
                    !oldPmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPmax() {
        Double oldPmax = pmax;
        boolean oldPmaxESet = pmaxESet;
        pmax = PMAX_EDEFAULT;
        pmaxESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM2__PMAX, oldPmax,
                    PMAX_EDEFAULT, oldPmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPmax() {
        return pmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getT2() {
        return t2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setT2( Double newT2 ) {
        Double oldT2 = t2;
        t2 = newT2;
        boolean oldT2ESet = t2ESet;
        t2ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM2__T2, oldT2, t2,
                    !oldT2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetT2() {
        Double oldT2 = t2;
        boolean oldT2ESet = t2ESet;
        t2 = T2_EDEFAULT;
        t2ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM2__T2, oldT2, T2_EDEFAULT,
                    oldT2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetT2() {
        return t2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getT1() {
        return t1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setT1( Double newT1 ) {
        Double oldT1 = t1;
        t1 = newT1;
        boolean oldT1ESet = t1ESet;
        t1ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM2__T1, oldT1, t1,
                    !oldT1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetT1() {
        Double oldT1 = t1;
        boolean oldT1ESet = t1ESet;
        t1 = T1_EDEFAULT;
        t1ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM2__T1, oldT1, T1_EDEFAULT,
                    oldT1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetT1() {
        return t1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getMnef() {
        return mnef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMnef( Double newMnef ) {
        Double oldMnef = mnef;
        mnef = newMnef;
        boolean oldMnefESet = mnefESet;
        mnefESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM2__MNEF, oldMnef, mnef,
                    !oldMnefESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMnef() {
        Double oldMnef = mnef;
        boolean oldMnefESet = mnefESet;
        mnef = MNEF_EDEFAULT;
        mnefESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM2__MNEF, oldMnef,
                    MNEF_EDEFAULT, oldMnefESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMnef() {
        return mnefESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getK() {
        return k;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setK( Double newK ) {
        Double oldK = k;
        k = newK;
        boolean oldKESet = kESet;
        kESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM2__K, oldK, k, !oldKESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetK() {
        Double oldK = k;
        boolean oldKESet = kESet;
        k = K_EDEFAULT;
        kESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM2__K, oldK, K_EDEFAULT,
                    oldKESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetK() {
        return kESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getDbf() {
        return dbf;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDbf( Double newDbf ) {
        Double oldDbf = dbf;
        dbf = newDbf;
        boolean oldDbfESet = dbfESet;
        dbfESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM2__DBF, oldDbf, dbf,
                    !oldDbfESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDbf() {
        Double oldDbf = dbf;
        boolean oldDbfESet = dbfESet;
        dbf = DBF_EDEFAULT;
        dbfESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM2__DBF, oldDbf, DBF_EDEFAULT,
                    oldDbfESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDbf() {
        return dbfESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getMxef() {
        return mxef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMxef( Double newMxef ) {
        Double oldMxef = mxef;
        mxef = newMxef;
        boolean oldMxefESet = mxefESet;
        mxefESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM2__MXEF, oldMxef, mxef,
                    !oldMxefESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMxef() {
        Double oldMxef = mxef;
        boolean oldMxefESet = mxefESet;
        mxef = MXEF_EDEFAULT;
        mxefESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM2__MXEF, oldMxef,
                    MXEF_EDEFAULT, oldMxefESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMxef() {
        return mxefESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.GOV_STEAM2__PMIN:
            return getPmin();
        case CimPackage.GOV_STEAM2__PMAX:
            return getPmax();
        case CimPackage.GOV_STEAM2__T2:
            return getT2();
        case CimPackage.GOV_STEAM2__T1:
            return getT1();
        case CimPackage.GOV_STEAM2__MNEF:
            return getMnef();
        case CimPackage.GOV_STEAM2__K:
            return getK();
        case CimPackage.GOV_STEAM2__DBF:
            return getDbf();
        case CimPackage.GOV_STEAM2__MXEF:
            return getMxef();
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
        case CimPackage.GOV_STEAM2__PMIN:
            setPmin( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM2__PMAX:
            setPmax( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM2__T2:
            setT2( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM2__T1:
            setT1( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM2__MNEF:
            setMnef( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM2__K:
            setK( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM2__DBF:
            setDbf( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM2__MXEF:
            setMxef( ( Double ) newValue );
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
        case CimPackage.GOV_STEAM2__PMIN:
            unsetPmin();
            return;
        case CimPackage.GOV_STEAM2__PMAX:
            unsetPmax();
            return;
        case CimPackage.GOV_STEAM2__T2:
            unsetT2();
            return;
        case CimPackage.GOV_STEAM2__T1:
            unsetT1();
            return;
        case CimPackage.GOV_STEAM2__MNEF:
            unsetMnef();
            return;
        case CimPackage.GOV_STEAM2__K:
            unsetK();
            return;
        case CimPackage.GOV_STEAM2__DBF:
            unsetDbf();
            return;
        case CimPackage.GOV_STEAM2__MXEF:
            unsetMxef();
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
        case CimPackage.GOV_STEAM2__PMIN:
            return isSetPmin();
        case CimPackage.GOV_STEAM2__PMAX:
            return isSetPmax();
        case CimPackage.GOV_STEAM2__T2:
            return isSetT2();
        case CimPackage.GOV_STEAM2__T1:
            return isSetT1();
        case CimPackage.GOV_STEAM2__MNEF:
            return isSetMnef();
        case CimPackage.GOV_STEAM2__K:
            return isSetK();
        case CimPackage.GOV_STEAM2__DBF:
            return isSetDbf();
        case CimPackage.GOV_STEAM2__MXEF:
            return isSetMxef();
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
        result.append( " (pmin: " );
        if( pminESet )
            result.append( pmin );
        else
            result.append( "<unset>" );
        result.append( ", pmax: " );
        if( pmaxESet )
            result.append( pmax );
        else
            result.append( "<unset>" );
        result.append( ", t2: " );
        if( t2ESet )
            result.append( t2 );
        else
            result.append( "<unset>" );
        result.append( ", t1: " );
        if( t1ESet )
            result.append( t1 );
        else
            result.append( "<unset>" );
        result.append( ", mnef: " );
        if( mnefESet )
            result.append( mnef );
        else
            result.append( "<unset>" );
        result.append( ", k: " );
        if( kESet )
            result.append( k );
        else
            result.append( "<unset>" );
        result.append( ", dbf: " );
        if( dbfESet )
            result.append( dbf );
        else
            result.append( "<unset>" );
        result.append( ", mxef: " );
        if( mxefESet )
            result.append( mxef );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //GovSteam2Impl

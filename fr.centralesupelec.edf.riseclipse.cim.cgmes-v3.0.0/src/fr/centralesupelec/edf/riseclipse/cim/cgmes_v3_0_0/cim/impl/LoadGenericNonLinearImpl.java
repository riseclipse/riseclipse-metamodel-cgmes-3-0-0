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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GenericNonLinearLoadModelKind;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadGenericNonLinear;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Generic Non Linear</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.LoadGenericNonLinearImpl#getGenericNonLinearLoadModelType <em>Generic Non Linear Load Model Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.LoadGenericNonLinearImpl#getBs <em>Bs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.LoadGenericNonLinearImpl#getBt <em>Bt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.LoadGenericNonLinearImpl#getTq <em>Tq</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.LoadGenericNonLinearImpl#getTp <em>Tp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.LoadGenericNonLinearImpl#getLs <em>Ls</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.LoadGenericNonLinearImpl#getLt <em>Lt</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadGenericNonLinearImpl extends LoadDynamicsImpl implements LoadGenericNonLinear {
    /**
     * The default value of the '{@link #getGenericNonLinearLoadModelType() <em>Generic Non Linear Load Model Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGenericNonLinearLoadModelType()
     * @generated
     * @ordered
     */
    protected static final GenericNonLinearLoadModelKind GENERIC_NON_LINEAR_LOAD_MODEL_TYPE_EDEFAULT = GenericNonLinearLoadModelKind.LOAD_ADAPTIVE;

    /**
     * The cached value of the '{@link #getGenericNonLinearLoadModelType() <em>Generic Non Linear Load Model Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGenericNonLinearLoadModelType()
     * @generated
     * @ordered
     */
    protected GenericNonLinearLoadModelKind genericNonLinearLoadModelType = GENERIC_NON_LINEAR_LOAD_MODEL_TYPE_EDEFAULT;

    /**
     * This is true if the Generic Non Linear Load Model Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean genericNonLinearLoadModelTypeESet;

    /**
     * The default value of the '{@link #getBs() <em>Bs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBs()
     * @generated
     * @ordered
     */
    protected static final Double BS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBs() <em>Bs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBs()
     * @generated
     * @ordered
     */
    protected Double bs = BS_EDEFAULT;

    /**
     * This is true if the Bs attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean bsESet;

    /**
     * The default value of the '{@link #getBt() <em>Bt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBt()
     * @generated
     * @ordered
     */
    protected static final Double BT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBt() <em>Bt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBt()
     * @generated
     * @ordered
     */
    protected Double bt = BT_EDEFAULT;

    /**
     * This is true if the Bt attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean btESet;

    /**
     * The default value of the '{@link #getTq() <em>Tq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTq()
     * @generated
     * @ordered
     */
    protected static final Double TQ_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTq() <em>Tq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTq()
     * @generated
     * @ordered
     */
    protected Double tq = TQ_EDEFAULT;

    /**
     * This is true if the Tq attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tqESet;

    /**
     * The default value of the '{@link #getTp() <em>Tp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTp()
     * @generated
     * @ordered
     */
    protected static final Double TP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTp() <em>Tp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTp()
     * @generated
     * @ordered
     */
    protected Double tp = TP_EDEFAULT;

    /**
     * This is true if the Tp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tpESet;

    /**
     * The default value of the '{@link #getLs() <em>Ls</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLs()
     * @generated
     * @ordered
     */
    protected static final Double LS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLs() <em>Ls</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLs()
     * @generated
     * @ordered
     */
    protected Double ls = LS_EDEFAULT;

    /**
     * This is true if the Ls attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lsESet;

    /**
     * The default value of the '{@link #getLt() <em>Lt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLt()
     * @generated
     * @ordered
     */
    protected static final Double LT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLt() <em>Lt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLt()
     * @generated
     * @ordered
     */
    protected Double lt = LT_EDEFAULT;

    /**
     * This is true if the Lt attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ltESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LoadGenericNonLinearImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getLoadGenericNonLinear();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GenericNonLinearLoadModelKind getGenericNonLinearLoadModelType() {
        return genericNonLinearLoadModelType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGenericNonLinearLoadModelType( GenericNonLinearLoadModelKind newGenericNonLinearLoadModelType ) {
        GenericNonLinearLoadModelKind oldGenericNonLinearLoadModelType = genericNonLinearLoadModelType;
        genericNonLinearLoadModelType = newGenericNonLinearLoadModelType == null
                ? GENERIC_NON_LINEAR_LOAD_MODEL_TYPE_EDEFAULT
                : newGenericNonLinearLoadModelType;
        boolean oldGenericNonLinearLoadModelTypeESet = genericNonLinearLoadModelTypeESet;
        genericNonLinearLoadModelTypeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.LOAD_GENERIC_NON_LINEAR__GENERIC_NON_LINEAR_LOAD_MODEL_TYPE,
                    oldGenericNonLinearLoadModelType, genericNonLinearLoadModelType,
                    !oldGenericNonLinearLoadModelTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGenericNonLinearLoadModelType() {
        GenericNonLinearLoadModelKind oldGenericNonLinearLoadModelType = genericNonLinearLoadModelType;
        boolean oldGenericNonLinearLoadModelTypeESet = genericNonLinearLoadModelTypeESet;
        genericNonLinearLoadModelType = GENERIC_NON_LINEAR_LOAD_MODEL_TYPE_EDEFAULT;
        genericNonLinearLoadModelTypeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.LOAD_GENERIC_NON_LINEAR__GENERIC_NON_LINEAR_LOAD_MODEL_TYPE,
                    oldGenericNonLinearLoadModelType, GENERIC_NON_LINEAR_LOAD_MODEL_TYPE_EDEFAULT,
                    oldGenericNonLinearLoadModelTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGenericNonLinearLoadModelType() {
        return genericNonLinearLoadModelTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getBs() {
        return bs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBs( Double newBs ) {
        Double oldBs = bs;
        bs = newBs;
        boolean oldBsESet = bsESet;
        bsESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.LOAD_GENERIC_NON_LINEAR__BS, oldBs, bs,
                    !oldBsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBs() {
        Double oldBs = bs;
        boolean oldBsESet = bsESet;
        bs = BS_EDEFAULT;
        bsESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.LOAD_GENERIC_NON_LINEAR__BS, oldBs,
                    BS_EDEFAULT, oldBsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBs() {
        return bsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getBt() {
        return bt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBt( Double newBt ) {
        Double oldBt = bt;
        bt = newBt;
        boolean oldBtESet = btESet;
        btESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.LOAD_GENERIC_NON_LINEAR__BT, oldBt, bt,
                    !oldBtESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBt() {
        Double oldBt = bt;
        boolean oldBtESet = btESet;
        bt = BT_EDEFAULT;
        btESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.LOAD_GENERIC_NON_LINEAR__BT, oldBt,
                    BT_EDEFAULT, oldBtESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBt() {
        return btESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTq() {
        return tq;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTq( Double newTq ) {
        Double oldTq = tq;
        tq = newTq;
        boolean oldTqESet = tqESet;
        tqESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.LOAD_GENERIC_NON_LINEAR__TQ, oldTq, tq,
                    !oldTqESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTq() {
        Double oldTq = tq;
        boolean oldTqESet = tqESet;
        tq = TQ_EDEFAULT;
        tqESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.LOAD_GENERIC_NON_LINEAR__TQ, oldTq,
                    TQ_EDEFAULT, oldTqESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTq() {
        return tqESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTp() {
        return tp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTp( Double newTp ) {
        Double oldTp = tp;
        tp = newTp;
        boolean oldTpESet = tpESet;
        tpESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.LOAD_GENERIC_NON_LINEAR__TP, oldTp, tp,
                    !oldTpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTp() {
        Double oldTp = tp;
        boolean oldTpESet = tpESet;
        tp = TP_EDEFAULT;
        tpESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.LOAD_GENERIC_NON_LINEAR__TP, oldTp,
                    TP_EDEFAULT, oldTpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTp() {
        return tpESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getLs() {
        return ls;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLs( Double newLs ) {
        Double oldLs = ls;
        ls = newLs;
        boolean oldLsESet = lsESet;
        lsESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.LOAD_GENERIC_NON_LINEAR__LS, oldLs, ls,
                    !oldLsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLs() {
        Double oldLs = ls;
        boolean oldLsESet = lsESet;
        ls = LS_EDEFAULT;
        lsESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.LOAD_GENERIC_NON_LINEAR__LS, oldLs,
                    LS_EDEFAULT, oldLsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLs() {
        return lsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getLt() {
        return lt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLt( Double newLt ) {
        Double oldLt = lt;
        lt = newLt;
        boolean oldLtESet = ltESet;
        ltESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.LOAD_GENERIC_NON_LINEAR__LT, oldLt, lt,
                    !oldLtESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLt() {
        Double oldLt = lt;
        boolean oldLtESet = ltESet;
        lt = LT_EDEFAULT;
        ltESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.LOAD_GENERIC_NON_LINEAR__LT, oldLt,
                    LT_EDEFAULT, oldLtESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLt() {
        return ltESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.LOAD_GENERIC_NON_LINEAR__GENERIC_NON_LINEAR_LOAD_MODEL_TYPE:
            return getGenericNonLinearLoadModelType();
        case CimPackage.LOAD_GENERIC_NON_LINEAR__BS:
            return getBs();
        case CimPackage.LOAD_GENERIC_NON_LINEAR__BT:
            return getBt();
        case CimPackage.LOAD_GENERIC_NON_LINEAR__TQ:
            return getTq();
        case CimPackage.LOAD_GENERIC_NON_LINEAR__TP:
            return getTp();
        case CimPackage.LOAD_GENERIC_NON_LINEAR__LS:
            return getLs();
        case CimPackage.LOAD_GENERIC_NON_LINEAR__LT:
            return getLt();
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
        case CimPackage.LOAD_GENERIC_NON_LINEAR__GENERIC_NON_LINEAR_LOAD_MODEL_TYPE:
            setGenericNonLinearLoadModelType( ( GenericNonLinearLoadModelKind ) newValue );
            return;
        case CimPackage.LOAD_GENERIC_NON_LINEAR__BS:
            setBs( ( Double ) newValue );
            return;
        case CimPackage.LOAD_GENERIC_NON_LINEAR__BT:
            setBt( ( Double ) newValue );
            return;
        case CimPackage.LOAD_GENERIC_NON_LINEAR__TQ:
            setTq( ( Double ) newValue );
            return;
        case CimPackage.LOAD_GENERIC_NON_LINEAR__TP:
            setTp( ( Double ) newValue );
            return;
        case CimPackage.LOAD_GENERIC_NON_LINEAR__LS:
            setLs( ( Double ) newValue );
            return;
        case CimPackage.LOAD_GENERIC_NON_LINEAR__LT:
            setLt( ( Double ) newValue );
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
        case CimPackage.LOAD_GENERIC_NON_LINEAR__GENERIC_NON_LINEAR_LOAD_MODEL_TYPE:
            unsetGenericNonLinearLoadModelType();
            return;
        case CimPackage.LOAD_GENERIC_NON_LINEAR__BS:
            unsetBs();
            return;
        case CimPackage.LOAD_GENERIC_NON_LINEAR__BT:
            unsetBt();
            return;
        case CimPackage.LOAD_GENERIC_NON_LINEAR__TQ:
            unsetTq();
            return;
        case CimPackage.LOAD_GENERIC_NON_LINEAR__TP:
            unsetTp();
            return;
        case CimPackage.LOAD_GENERIC_NON_LINEAR__LS:
            unsetLs();
            return;
        case CimPackage.LOAD_GENERIC_NON_LINEAR__LT:
            unsetLt();
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
        case CimPackage.LOAD_GENERIC_NON_LINEAR__GENERIC_NON_LINEAR_LOAD_MODEL_TYPE:
            return isSetGenericNonLinearLoadModelType();
        case CimPackage.LOAD_GENERIC_NON_LINEAR__BS:
            return isSetBs();
        case CimPackage.LOAD_GENERIC_NON_LINEAR__BT:
            return isSetBt();
        case CimPackage.LOAD_GENERIC_NON_LINEAR__TQ:
            return isSetTq();
        case CimPackage.LOAD_GENERIC_NON_LINEAR__TP:
            return isSetTp();
        case CimPackage.LOAD_GENERIC_NON_LINEAR__LS:
            return isSetLs();
        case CimPackage.LOAD_GENERIC_NON_LINEAR__LT:
            return isSetLt();
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
        result.append( " (genericNonLinearLoadModelType: " );
        if( genericNonLinearLoadModelTypeESet )
            result.append( genericNonLinearLoadModelType );
        else
            result.append( "<unset>" );
        result.append( ", bs: " );
        if( bsESet )
            result.append( bs );
        else
            result.append( "<unset>" );
        result.append( ", bt: " );
        if( btESet )
            result.append( bt );
        else
            result.append( "<unset>" );
        result.append( ", tq: " );
        if( tqESet )
            result.append( tq );
        else
            result.append( "<unset>" );
        result.append( ", tp: " );
        if( tpESet )
            result.append( tp );
        else
            result.append( "<unset>" );
        result.append( ", ls: " );
        if( lsESet )
            result.append( ls );
        else
            result.append( "<unset>" );
        result.append( ", lt: " );
        if( ltESet )
            result.append( lt );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //LoadGenericNonLinearImpl

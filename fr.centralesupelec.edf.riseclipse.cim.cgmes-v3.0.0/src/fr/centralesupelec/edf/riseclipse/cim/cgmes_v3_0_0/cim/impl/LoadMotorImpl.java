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
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadAggregate;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadMotor;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Motor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.LoadMotorImpl#getPfrac <em>Pfrac</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.LoadMotorImpl#getTbkr <em>Tbkr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.LoadMotorImpl#getLpp <em>Lpp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.LoadMotorImpl#getD <em>D</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.LoadMotorImpl#getH <em>H</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.LoadMotorImpl#getTpo <em>Tpo</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.LoadMotorImpl#getLoadAggregate <em>Load Aggregate</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.LoadMotorImpl#getLfac <em>Lfac</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.LoadMotorImpl#getLp <em>Lp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.LoadMotorImpl#getLs <em>Ls</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.LoadMotorImpl#getRa <em>Ra</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.LoadMotorImpl#getTv <em>Tv</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.LoadMotorImpl#getVt <em>Vt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.LoadMotorImpl#getTppo <em>Tppo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoadMotorImpl extends IdentifiedObjectImpl implements LoadMotor {
    /**
     * The default value of the '{@link #getPfrac() <em>Pfrac</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPfrac()
     * @generated
     * @ordered
     */
    protected static final Double PFRAC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPfrac() <em>Pfrac</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPfrac()
     * @generated
     * @ordered
     */
    protected Double pfrac = PFRAC_EDEFAULT;

    /**
     * This is true if the Pfrac attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pfracESet;

    /**
     * The default value of the '{@link #getTbkr() <em>Tbkr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTbkr()
     * @generated
     * @ordered
     */
    protected static final Double TBKR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTbkr() <em>Tbkr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTbkr()
     * @generated
     * @ordered
     */
    protected Double tbkr = TBKR_EDEFAULT;

    /**
     * This is true if the Tbkr attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tbkrESet;

    /**
     * The default value of the '{@link #getLpp() <em>Lpp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLpp()
     * @generated
     * @ordered
     */
    protected static final Double LPP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLpp() <em>Lpp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLpp()
     * @generated
     * @ordered
     */
    protected Double lpp = LPP_EDEFAULT;

    /**
     * This is true if the Lpp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lppESet;

    /**
     * The default value of the '{@link #getD() <em>D</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getD()
     * @generated
     * @ordered
     */
    protected static final Double D_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getD() <em>D</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getD()
     * @generated
     * @ordered
     */
    protected Double d = D_EDEFAULT;

    /**
     * This is true if the D attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dESet;

    /**
     * The default value of the '{@link #getH() <em>H</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getH()
     * @generated
     * @ordered
     */
    protected static final Double H_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getH() <em>H</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getH()
     * @generated
     * @ordered
     */
    protected Double h = H_EDEFAULT;

    /**
     * This is true if the H attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean hESet;

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
     * The cached value of the '{@link #getLoadAggregate() <em>Load Aggregate</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLoadAggregate()
     * @generated
     * @ordered
     */
    protected LoadAggregate loadAggregate;

    /**
     * This is true if the Load Aggregate reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean loadAggregateESet;

    /**
     * The default value of the '{@link #getLfac() <em>Lfac</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLfac()
     * @generated
     * @ordered
     */
    protected static final Double LFAC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLfac() <em>Lfac</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLfac()
     * @generated
     * @ordered
     */
    protected Double lfac = LFAC_EDEFAULT;

    /**
     * This is true if the Lfac attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lfacESet;

    /**
     * The default value of the '{@link #getLp() <em>Lp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLp()
     * @generated
     * @ordered
     */
    protected static final Double LP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLp() <em>Lp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLp()
     * @generated
     * @ordered
     */
    protected Double lp = LP_EDEFAULT;

    /**
     * This is true if the Lp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lpESet;

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
     * The default value of the '{@link #getRa() <em>Ra</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRa()
     * @generated
     * @ordered
     */
    protected static final Double RA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRa() <em>Ra</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRa()
     * @generated
     * @ordered
     */
    protected Double ra = RA_EDEFAULT;

    /**
     * This is true if the Ra attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean raESet;

    /**
     * The default value of the '{@link #getTv() <em>Tv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTv()
     * @generated
     * @ordered
     */
    protected static final Double TV_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTv() <em>Tv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTv()
     * @generated
     * @ordered
     */
    protected Double tv = TV_EDEFAULT;

    /**
     * This is true if the Tv attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tvESet;

    /**
     * The default value of the '{@link #getVt() <em>Vt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVt()
     * @generated
     * @ordered
     */
    protected static final Double VT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVt() <em>Vt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVt()
     * @generated
     * @ordered
     */
    protected Double vt = VT_EDEFAULT;

    /**
     * This is true if the Vt attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vtESet;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected LoadMotorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getLoadMotor();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getPfrac() {
        return pfrac;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPfrac( Double newPfrac ) {
        Double oldPfrac = pfrac;
        pfrac = newPfrac;
        boolean oldPfracESet = pfracESet;
        pfracESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.LOAD_MOTOR__PFRAC, oldPfrac, pfrac,
                    !oldPfracESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPfrac() {
        Double oldPfrac = pfrac;
        boolean oldPfracESet = pfracESet;
        pfrac = PFRAC_EDEFAULT;
        pfracESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.LOAD_MOTOR__PFRAC, oldPfrac,
                    PFRAC_EDEFAULT, oldPfracESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPfrac() {
        return pfracESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTbkr() {
        return tbkr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTbkr( Double newTbkr ) {
        Double oldTbkr = tbkr;
        tbkr = newTbkr;
        boolean oldTbkrESet = tbkrESet;
        tbkrESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.LOAD_MOTOR__TBKR, oldTbkr, tbkr,
                    !oldTbkrESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTbkr() {
        Double oldTbkr = tbkr;
        boolean oldTbkrESet = tbkrESet;
        tbkr = TBKR_EDEFAULT;
        tbkrESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.LOAD_MOTOR__TBKR, oldTbkr,
                    TBKR_EDEFAULT, oldTbkrESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTbkr() {
        return tbkrESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getLpp() {
        return lpp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLpp( Double newLpp ) {
        Double oldLpp = lpp;
        lpp = newLpp;
        boolean oldLppESet = lppESet;
        lppESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.LOAD_MOTOR__LPP, oldLpp, lpp,
                    !oldLppESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLpp() {
        Double oldLpp = lpp;
        boolean oldLppESet = lppESet;
        lpp = LPP_EDEFAULT;
        lppESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.LOAD_MOTOR__LPP, oldLpp, LPP_EDEFAULT,
                    oldLppESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLpp() {
        return lppESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getD() {
        return d;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setD( Double newD ) {
        Double oldD = d;
        d = newD;
        boolean oldDESet = dESet;
        dESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.LOAD_MOTOR__D, oldD, d, !oldDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetD() {
        Double oldD = d;
        boolean oldDESet = dESet;
        d = D_EDEFAULT;
        dESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.LOAD_MOTOR__D, oldD, D_EDEFAULT,
                    oldDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetD() {
        return dESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getH() {
        return h;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setH( Double newH ) {
        Double oldH = h;
        h = newH;
        boolean oldHESet = hESet;
        hESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.LOAD_MOTOR__H, oldH, h, !oldHESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetH() {
        Double oldH = h;
        boolean oldHESet = hESet;
        h = H_EDEFAULT;
        hESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.LOAD_MOTOR__H, oldH, H_EDEFAULT,
                    oldHESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetH() {
        return hESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.LOAD_MOTOR__TPO, oldTpo, tpo,
                    !oldTpoESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.LOAD_MOTOR__TPO, oldTpo, TPO_EDEFAULT,
                    oldTpoESet ) );
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
    public LoadAggregate getLoadAggregate() {
        return loadAggregate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLoadAggregate( LoadAggregate newLoadAggregate, NotificationChain msgs ) {
        LoadAggregate oldLoadAggregate = loadAggregate;
        loadAggregate = newLoadAggregate;
        boolean oldLoadAggregateESet = loadAggregateESet;
        loadAggregateESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.LOAD_MOTOR__LOAD_AGGREGATE, oldLoadAggregate, newLoadAggregate, !oldLoadAggregateESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLoadAggregate( LoadAggregate newLoadAggregate ) {
        if( newLoadAggregate != loadAggregate ) {
            NotificationChain msgs = null;
            if( loadAggregate != null )
                msgs = ( ( InternalEObject ) loadAggregate ).eInverseRemove( this,
                        CimPackage.LOAD_AGGREGATE__LOAD_MOTOR, LoadAggregate.class, msgs );
            if( newLoadAggregate != null )
                msgs = ( ( InternalEObject ) newLoadAggregate ).eInverseAdd( this,
                        CimPackage.LOAD_AGGREGATE__LOAD_MOTOR, LoadAggregate.class, msgs );
            msgs = basicSetLoadAggregate( newLoadAggregate, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldLoadAggregateESet = loadAggregateESet;
            loadAggregateESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.LOAD_MOTOR__LOAD_AGGREGATE,
                        newLoadAggregate, newLoadAggregate, !oldLoadAggregateESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetLoadAggregate( NotificationChain msgs ) {
        LoadAggregate oldLoadAggregate = loadAggregate;
        loadAggregate = null;
        boolean oldLoadAggregateESet = loadAggregateESet;
        loadAggregateESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.LOAD_MOTOR__LOAD_AGGREGATE, oldLoadAggregate, null, oldLoadAggregateESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLoadAggregate() {
        if( loadAggregate != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) loadAggregate ).eInverseRemove( this, CimPackage.LOAD_AGGREGATE__LOAD_MOTOR,
                    LoadAggregate.class, msgs );
            msgs = basicUnsetLoadAggregate( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldLoadAggregateESet = loadAggregateESet;
            loadAggregateESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.LOAD_MOTOR__LOAD_AGGREGATE, null,
                        null, oldLoadAggregateESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLoadAggregate() {
        return loadAggregateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getLfac() {
        return lfac;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLfac( Double newLfac ) {
        Double oldLfac = lfac;
        lfac = newLfac;
        boolean oldLfacESet = lfacESet;
        lfacESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.LOAD_MOTOR__LFAC, oldLfac, lfac,
                    !oldLfacESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLfac() {
        Double oldLfac = lfac;
        boolean oldLfacESet = lfacESet;
        lfac = LFAC_EDEFAULT;
        lfacESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.LOAD_MOTOR__LFAC, oldLfac,
                    LFAC_EDEFAULT, oldLfacESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLfac() {
        return lfacESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getLp() {
        return lp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLp( Double newLp ) {
        Double oldLp = lp;
        lp = newLp;
        boolean oldLpESet = lpESet;
        lpESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.LOAD_MOTOR__LP, oldLp, lp,
                    !oldLpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLp() {
        Double oldLp = lp;
        boolean oldLpESet = lpESet;
        lp = LP_EDEFAULT;
        lpESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.LOAD_MOTOR__LP, oldLp, LP_EDEFAULT,
                    oldLpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLp() {
        return lpESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.LOAD_MOTOR__LS, oldLs, ls,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.LOAD_MOTOR__LS, oldLs, LS_EDEFAULT,
                    oldLsESet ) );
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
    public Double getRa() {
        return ra;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRa( Double newRa ) {
        Double oldRa = ra;
        ra = newRa;
        boolean oldRaESet = raESet;
        raESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.LOAD_MOTOR__RA, oldRa, ra,
                    !oldRaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRa() {
        Double oldRa = ra;
        boolean oldRaESet = raESet;
        ra = RA_EDEFAULT;
        raESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.LOAD_MOTOR__RA, oldRa, RA_EDEFAULT,
                    oldRaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRa() {
        return raESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTv() {
        return tv;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTv( Double newTv ) {
        Double oldTv = tv;
        tv = newTv;
        boolean oldTvESet = tvESet;
        tvESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.LOAD_MOTOR__TV, oldTv, tv,
                    !oldTvESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTv() {
        Double oldTv = tv;
        boolean oldTvESet = tvESet;
        tv = TV_EDEFAULT;
        tvESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.LOAD_MOTOR__TV, oldTv, TV_EDEFAULT,
                    oldTvESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTv() {
        return tvESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVt() {
        return vt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVt( Double newVt ) {
        Double oldVt = vt;
        vt = newVt;
        boolean oldVtESet = vtESet;
        vtESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.LOAD_MOTOR__VT, oldVt, vt,
                    !oldVtESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVt() {
        Double oldVt = vt;
        boolean oldVtESet = vtESet;
        vt = VT_EDEFAULT;
        vtESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.LOAD_MOTOR__VT, oldVt, VT_EDEFAULT,
                    oldVtESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVt() {
        return vtESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.LOAD_MOTOR__TPPO, oldTppo, tppo,
                    !oldTppoESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.LOAD_MOTOR__TPPO, oldTppo,
                    TPPO_EDEFAULT, oldTppoESet ) );
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
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.LOAD_MOTOR__LOAD_AGGREGATE:
            if( loadAggregate != null )
                msgs = ( ( InternalEObject ) loadAggregate ).eInverseRemove( this,
                        CimPackage.LOAD_AGGREGATE__LOAD_MOTOR, LoadAggregate.class, msgs );
            return basicSetLoadAggregate( ( LoadAggregate ) otherEnd, msgs );
        }
        return super.eInverseAdd( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.LOAD_MOTOR__LOAD_AGGREGATE:
            return basicUnsetLoadAggregate( msgs );
        }
        return super.eInverseRemove( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.LOAD_MOTOR__PFRAC:
            return getPfrac();
        case CimPackage.LOAD_MOTOR__TBKR:
            return getTbkr();
        case CimPackage.LOAD_MOTOR__LPP:
            return getLpp();
        case CimPackage.LOAD_MOTOR__D:
            return getD();
        case CimPackage.LOAD_MOTOR__H:
            return getH();
        case CimPackage.LOAD_MOTOR__TPO:
            return getTpo();
        case CimPackage.LOAD_MOTOR__LOAD_AGGREGATE:
            return getLoadAggregate();
        case CimPackage.LOAD_MOTOR__LFAC:
            return getLfac();
        case CimPackage.LOAD_MOTOR__LP:
            return getLp();
        case CimPackage.LOAD_MOTOR__LS:
            return getLs();
        case CimPackage.LOAD_MOTOR__RA:
            return getRa();
        case CimPackage.LOAD_MOTOR__TV:
            return getTv();
        case CimPackage.LOAD_MOTOR__VT:
            return getVt();
        case CimPackage.LOAD_MOTOR__TPPO:
            return getTppo();
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
        case CimPackage.LOAD_MOTOR__PFRAC:
            setPfrac( ( Double ) newValue );
            return;
        case CimPackage.LOAD_MOTOR__TBKR:
            setTbkr( ( Double ) newValue );
            return;
        case CimPackage.LOAD_MOTOR__LPP:
            setLpp( ( Double ) newValue );
            return;
        case CimPackage.LOAD_MOTOR__D:
            setD( ( Double ) newValue );
            return;
        case CimPackage.LOAD_MOTOR__H:
            setH( ( Double ) newValue );
            return;
        case CimPackage.LOAD_MOTOR__TPO:
            setTpo( ( Double ) newValue );
            return;
        case CimPackage.LOAD_MOTOR__LOAD_AGGREGATE:
            setLoadAggregate( ( LoadAggregate ) newValue );
            return;
        case CimPackage.LOAD_MOTOR__LFAC:
            setLfac( ( Double ) newValue );
            return;
        case CimPackage.LOAD_MOTOR__LP:
            setLp( ( Double ) newValue );
            return;
        case CimPackage.LOAD_MOTOR__LS:
            setLs( ( Double ) newValue );
            return;
        case CimPackage.LOAD_MOTOR__RA:
            setRa( ( Double ) newValue );
            return;
        case CimPackage.LOAD_MOTOR__TV:
            setTv( ( Double ) newValue );
            return;
        case CimPackage.LOAD_MOTOR__VT:
            setVt( ( Double ) newValue );
            return;
        case CimPackage.LOAD_MOTOR__TPPO:
            setTppo( ( Double ) newValue );
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
        case CimPackage.LOAD_MOTOR__PFRAC:
            unsetPfrac();
            return;
        case CimPackage.LOAD_MOTOR__TBKR:
            unsetTbkr();
            return;
        case CimPackage.LOAD_MOTOR__LPP:
            unsetLpp();
            return;
        case CimPackage.LOAD_MOTOR__D:
            unsetD();
            return;
        case CimPackage.LOAD_MOTOR__H:
            unsetH();
            return;
        case CimPackage.LOAD_MOTOR__TPO:
            unsetTpo();
            return;
        case CimPackage.LOAD_MOTOR__LOAD_AGGREGATE:
            unsetLoadAggregate();
            return;
        case CimPackage.LOAD_MOTOR__LFAC:
            unsetLfac();
            return;
        case CimPackage.LOAD_MOTOR__LP:
            unsetLp();
            return;
        case CimPackage.LOAD_MOTOR__LS:
            unsetLs();
            return;
        case CimPackage.LOAD_MOTOR__RA:
            unsetRa();
            return;
        case CimPackage.LOAD_MOTOR__TV:
            unsetTv();
            return;
        case CimPackage.LOAD_MOTOR__VT:
            unsetVt();
            return;
        case CimPackage.LOAD_MOTOR__TPPO:
            unsetTppo();
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
        case CimPackage.LOAD_MOTOR__PFRAC:
            return isSetPfrac();
        case CimPackage.LOAD_MOTOR__TBKR:
            return isSetTbkr();
        case CimPackage.LOAD_MOTOR__LPP:
            return isSetLpp();
        case CimPackage.LOAD_MOTOR__D:
            return isSetD();
        case CimPackage.LOAD_MOTOR__H:
            return isSetH();
        case CimPackage.LOAD_MOTOR__TPO:
            return isSetTpo();
        case CimPackage.LOAD_MOTOR__LOAD_AGGREGATE:
            return isSetLoadAggregate();
        case CimPackage.LOAD_MOTOR__LFAC:
            return isSetLfac();
        case CimPackage.LOAD_MOTOR__LP:
            return isSetLp();
        case CimPackage.LOAD_MOTOR__LS:
            return isSetLs();
        case CimPackage.LOAD_MOTOR__RA:
            return isSetRa();
        case CimPackage.LOAD_MOTOR__TV:
            return isSetTv();
        case CimPackage.LOAD_MOTOR__VT:
            return isSetVt();
        case CimPackage.LOAD_MOTOR__TPPO:
            return isSetTppo();
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
        result.append( " (pfrac: " );
        if( pfracESet )
            result.append( pfrac );
        else
            result.append( "<unset>" );
        result.append( ", tbkr: " );
        if( tbkrESet )
            result.append( tbkr );
        else
            result.append( "<unset>" );
        result.append( ", lpp: " );
        if( lppESet )
            result.append( lpp );
        else
            result.append( "<unset>" );
        result.append( ", d: " );
        if( dESet )
            result.append( d );
        else
            result.append( "<unset>" );
        result.append( ", h: " );
        if( hESet )
            result.append( h );
        else
            result.append( "<unset>" );
        result.append( ", tpo: " );
        if( tpoESet )
            result.append( tpo );
        else
            result.append( "<unset>" );
        result.append( ", lfac: " );
        if( lfacESet )
            result.append( lfac );
        else
            result.append( "<unset>" );
        result.append( ", lp: " );
        if( lpESet )
            result.append( lp );
        else
            result.append( "<unset>" );
        result.append( ", ls: " );
        if( lsESet )
            result.append( ls );
        else
            result.append( "<unset>" );
        result.append( ", ra: " );
        if( raESet )
            result.append( ra );
        else
            result.append( "<unset>" );
        result.append( ", tv: " );
        if( tvESet )
            result.append( tv );
        else
            result.append( "<unset>" );
        result.append( ", vt: " );
        if( vtESet )
            result.append( vt );
        else
            result.append( "<unset>" );
        result.append( ", tppo: " );
        if( tppoESet )
            result.append( tppo );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //LoadMotorImpl

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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcHU;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exc HU</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcHUImpl#getImin <em>Imin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcHUImpl#getImax <em>Imax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcHUImpl#getTr <em>Tr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcHUImpl#getTi <em>Ti</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcHUImpl#getTe <em>Te</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcHUImpl#getKi <em>Ki</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcHUImpl#getKe <em>Ke</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcHUImpl#getAi <em>Ai</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcHUImpl#getAe <em>Ae</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcHUImpl#getEmax <em>Emax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcHUImpl#getEmin <em>Emin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ExcHUImpl#getAtr <em>Atr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExcHUImpl extends ExcitationSystemDynamicsImpl implements ExcHU {
    /**
     * The default value of the '{@link #getImin() <em>Imin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getImin()
     * @generated
     * @ordered
     */
    protected static final Double IMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getImin() <em>Imin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getImin()
     * @generated
     * @ordered
     */
    protected Double imin = IMIN_EDEFAULT;

    /**
     * This is true if the Imin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean iminESet;

    /**
     * The default value of the '{@link #getImax() <em>Imax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getImax()
     * @generated
     * @ordered
     */
    protected static final Double IMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getImax() <em>Imax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getImax()
     * @generated
     * @ordered
     */
    protected Double imax = IMAX_EDEFAULT;

    /**
     * This is true if the Imax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean imaxESet;

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
     * The default value of the '{@link #getTi() <em>Ti</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTi()
     * @generated
     * @ordered
     */
    protected static final Double TI_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTi() <em>Ti</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTi()
     * @generated
     * @ordered
     */
    protected Double ti = TI_EDEFAULT;

    /**
     * This is true if the Ti attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tiESet;

    /**
     * The default value of the '{@link #getTe() <em>Te</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTe()
     * @generated
     * @ordered
     */
    protected static final Double TE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTe() <em>Te</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTe()
     * @generated
     * @ordered
     */
    protected Double te = TE_EDEFAULT;

    /**
     * This is true if the Te attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean teESet;

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
     * The default value of the '{@link #getKe() <em>Ke</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKe()
     * @generated
     * @ordered
     */
    protected static final Double KE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKe() <em>Ke</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKe()
     * @generated
     * @ordered
     */
    protected Double ke = KE_EDEFAULT;

    /**
     * This is true if the Ke attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean keESet;

    /**
     * The default value of the '{@link #getAi() <em>Ai</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAi()
     * @generated
     * @ordered
     */
    protected static final Double AI_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAi() <em>Ai</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAi()
     * @generated
     * @ordered
     */
    protected Double ai = AI_EDEFAULT;

    /**
     * This is true if the Ai attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean aiESet;

    /**
     * The default value of the '{@link #getAe() <em>Ae</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAe()
     * @generated
     * @ordered
     */
    protected static final Double AE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAe() <em>Ae</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAe()
     * @generated
     * @ordered
     */
    protected Double ae = AE_EDEFAULT;

    /**
     * This is true if the Ae attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean aeESet;

    /**
     * The default value of the '{@link #getEmax() <em>Emax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEmax()
     * @generated
     * @ordered
     */
    protected static final Double EMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEmax() <em>Emax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEmax()
     * @generated
     * @ordered
     */
    protected Double emax = EMAX_EDEFAULT;

    /**
     * This is true if the Emax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean emaxESet;

    /**
     * The default value of the '{@link #getEmin() <em>Emin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEmin()
     * @generated
     * @ordered
     */
    protected static final Double EMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEmin() <em>Emin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEmin()
     * @generated
     * @ordered
     */
    protected Double emin = EMIN_EDEFAULT;

    /**
     * This is true if the Emin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean eminESet;

    /**
     * The default value of the '{@link #getAtr() <em>Atr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAtr()
     * @generated
     * @ordered
     */
    protected static final Double ATR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAtr() <em>Atr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAtr()
     * @generated
     * @ordered
     */
    protected Double atr = ATR_EDEFAULT;

    /**
     * This is true if the Atr attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean atrESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ExcHUImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getExcHU();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getImin() {
        return imin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setImin( Double newImin ) {
        Double oldImin = imin;
        imin = newImin;
        boolean oldIminESet = iminESet;
        iminESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_HU__IMIN, oldImin, imin,
                    !oldIminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetImin() {
        Double oldImin = imin;
        boolean oldIminESet = iminESet;
        imin = IMIN_EDEFAULT;
        iminESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_HU__IMIN, oldImin, IMIN_EDEFAULT,
                    oldIminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetImin() {
        return iminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getImax() {
        return imax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setImax( Double newImax ) {
        Double oldImax = imax;
        imax = newImax;
        boolean oldImaxESet = imaxESet;
        imaxESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_HU__IMAX, oldImax, imax,
                    !oldImaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetImax() {
        Double oldImax = imax;
        boolean oldImaxESet = imaxESet;
        imax = IMAX_EDEFAULT;
        imaxESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_HU__IMAX, oldImax, IMAX_EDEFAULT,
                    oldImaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetImax() {
        return imaxESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_HU__TR, oldTr, tr, !oldTrESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_HU__TR, oldTr, TR_EDEFAULT,
                    oldTrESet ) );
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
    public Double getTi() {
        return ti;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTi( Double newTi ) {
        Double oldTi = ti;
        ti = newTi;
        boolean oldTiESet = tiESet;
        tiESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_HU__TI, oldTi, ti, !oldTiESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTi() {
        Double oldTi = ti;
        boolean oldTiESet = tiESet;
        ti = TI_EDEFAULT;
        tiESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_HU__TI, oldTi, TI_EDEFAULT,
                    oldTiESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTi() {
        return tiESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTe() {
        return te;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTe( Double newTe ) {
        Double oldTe = te;
        te = newTe;
        boolean oldTeESet = teESet;
        teESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_HU__TE, oldTe, te, !oldTeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTe() {
        Double oldTe = te;
        boolean oldTeESet = teESet;
        te = TE_EDEFAULT;
        teESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_HU__TE, oldTe, TE_EDEFAULT,
                    oldTeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTe() {
        return teESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_HU__KI, oldKi, ki, !oldKiESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_HU__KI, oldKi, KI_EDEFAULT,
                    oldKiESet ) );
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
    public Double getKe() {
        return ke;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKe( Double newKe ) {
        Double oldKe = ke;
        ke = newKe;
        boolean oldKeESet = keESet;
        keESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_HU__KE, oldKe, ke, !oldKeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKe() {
        Double oldKe = ke;
        boolean oldKeESet = keESet;
        ke = KE_EDEFAULT;
        keESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_HU__KE, oldKe, KE_EDEFAULT,
                    oldKeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKe() {
        return keESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getAi() {
        return ai;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAi( Double newAi ) {
        Double oldAi = ai;
        ai = newAi;
        boolean oldAiESet = aiESet;
        aiESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_HU__AI, oldAi, ai, !oldAiESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAi() {
        Double oldAi = ai;
        boolean oldAiESet = aiESet;
        ai = AI_EDEFAULT;
        aiESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_HU__AI, oldAi, AI_EDEFAULT,
                    oldAiESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAi() {
        return aiESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getAe() {
        return ae;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAe( Double newAe ) {
        Double oldAe = ae;
        ae = newAe;
        boolean oldAeESet = aeESet;
        aeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_HU__AE, oldAe, ae, !oldAeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAe() {
        Double oldAe = ae;
        boolean oldAeESet = aeESet;
        ae = AE_EDEFAULT;
        aeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_HU__AE, oldAe, AE_EDEFAULT,
                    oldAeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAe() {
        return aeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getEmax() {
        return emax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEmax( Double newEmax ) {
        Double oldEmax = emax;
        emax = newEmax;
        boolean oldEmaxESet = emaxESet;
        emaxESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_HU__EMAX, oldEmax, emax,
                    !oldEmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEmax() {
        Double oldEmax = emax;
        boolean oldEmaxESet = emaxESet;
        emax = EMAX_EDEFAULT;
        emaxESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_HU__EMAX, oldEmax, EMAX_EDEFAULT,
                    oldEmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEmax() {
        return emaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getEmin() {
        return emin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEmin( Double newEmin ) {
        Double oldEmin = emin;
        emin = newEmin;
        boolean oldEminESet = eminESet;
        eminESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_HU__EMIN, oldEmin, emin,
                    !oldEminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEmin() {
        Double oldEmin = emin;
        boolean oldEminESet = eminESet;
        emin = EMIN_EDEFAULT;
        eminESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_HU__EMIN, oldEmin, EMIN_EDEFAULT,
                    oldEminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEmin() {
        return eminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getAtr() {
        return atr;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAtr( Double newAtr ) {
        Double oldAtr = atr;
        atr = newAtr;
        boolean oldAtrESet = atrESet;
        atrESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.EXC_HU__ATR, oldAtr, atr,
                    !oldAtrESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAtr() {
        Double oldAtr = atr;
        boolean oldAtrESet = atrESet;
        atr = ATR_EDEFAULT;
        atrESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.EXC_HU__ATR, oldAtr, ATR_EDEFAULT,
                    oldAtrESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAtr() {
        return atrESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.EXC_HU__IMIN:
            return getImin();
        case CimPackage.EXC_HU__IMAX:
            return getImax();
        case CimPackage.EXC_HU__TR:
            return getTr();
        case CimPackage.EXC_HU__TI:
            return getTi();
        case CimPackage.EXC_HU__TE:
            return getTe();
        case CimPackage.EXC_HU__KI:
            return getKi();
        case CimPackage.EXC_HU__KE:
            return getKe();
        case CimPackage.EXC_HU__AI:
            return getAi();
        case CimPackage.EXC_HU__AE:
            return getAe();
        case CimPackage.EXC_HU__EMAX:
            return getEmax();
        case CimPackage.EXC_HU__EMIN:
            return getEmin();
        case CimPackage.EXC_HU__ATR:
            return getAtr();
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
        case CimPackage.EXC_HU__IMIN:
            setImin( ( Double ) newValue );
            return;
        case CimPackage.EXC_HU__IMAX:
            setImax( ( Double ) newValue );
            return;
        case CimPackage.EXC_HU__TR:
            setTr( ( Double ) newValue );
            return;
        case CimPackage.EXC_HU__TI:
            setTi( ( Double ) newValue );
            return;
        case CimPackage.EXC_HU__TE:
            setTe( ( Double ) newValue );
            return;
        case CimPackage.EXC_HU__KI:
            setKi( ( Double ) newValue );
            return;
        case CimPackage.EXC_HU__KE:
            setKe( ( Double ) newValue );
            return;
        case CimPackage.EXC_HU__AI:
            setAi( ( Double ) newValue );
            return;
        case CimPackage.EXC_HU__AE:
            setAe( ( Double ) newValue );
            return;
        case CimPackage.EXC_HU__EMAX:
            setEmax( ( Double ) newValue );
            return;
        case CimPackage.EXC_HU__EMIN:
            setEmin( ( Double ) newValue );
            return;
        case CimPackage.EXC_HU__ATR:
            setAtr( ( Double ) newValue );
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
        case CimPackage.EXC_HU__IMIN:
            unsetImin();
            return;
        case CimPackage.EXC_HU__IMAX:
            unsetImax();
            return;
        case CimPackage.EXC_HU__TR:
            unsetTr();
            return;
        case CimPackage.EXC_HU__TI:
            unsetTi();
            return;
        case CimPackage.EXC_HU__TE:
            unsetTe();
            return;
        case CimPackage.EXC_HU__KI:
            unsetKi();
            return;
        case CimPackage.EXC_HU__KE:
            unsetKe();
            return;
        case CimPackage.EXC_HU__AI:
            unsetAi();
            return;
        case CimPackage.EXC_HU__AE:
            unsetAe();
            return;
        case CimPackage.EXC_HU__EMAX:
            unsetEmax();
            return;
        case CimPackage.EXC_HU__EMIN:
            unsetEmin();
            return;
        case CimPackage.EXC_HU__ATR:
            unsetAtr();
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
        case CimPackage.EXC_HU__IMIN:
            return isSetImin();
        case CimPackage.EXC_HU__IMAX:
            return isSetImax();
        case CimPackage.EXC_HU__TR:
            return isSetTr();
        case CimPackage.EXC_HU__TI:
            return isSetTi();
        case CimPackage.EXC_HU__TE:
            return isSetTe();
        case CimPackage.EXC_HU__KI:
            return isSetKi();
        case CimPackage.EXC_HU__KE:
            return isSetKe();
        case CimPackage.EXC_HU__AI:
            return isSetAi();
        case CimPackage.EXC_HU__AE:
            return isSetAe();
        case CimPackage.EXC_HU__EMAX:
            return isSetEmax();
        case CimPackage.EXC_HU__EMIN:
            return isSetEmin();
        case CimPackage.EXC_HU__ATR:
            return isSetAtr();
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
        result.append( " (imin: " );
        if( iminESet )
            result.append( imin );
        else
            result.append( "<unset>" );
        result.append( ", imax: " );
        if( imaxESet )
            result.append( imax );
        else
            result.append( "<unset>" );
        result.append( ", tr: " );
        if( trESet )
            result.append( tr );
        else
            result.append( "<unset>" );
        result.append( ", ti: " );
        if( tiESet )
            result.append( ti );
        else
            result.append( "<unset>" );
        result.append( ", te: " );
        if( teESet )
            result.append( te );
        else
            result.append( "<unset>" );
        result.append( ", ki: " );
        if( kiESet )
            result.append( ki );
        else
            result.append( "<unset>" );
        result.append( ", ke: " );
        if( keESet )
            result.append( ke );
        else
            result.append( "<unset>" );
        result.append( ", ai: " );
        if( aiESet )
            result.append( ai );
        else
            result.append( "<unset>" );
        result.append( ", ae: " );
        if( aeESet )
            result.append( ae );
        else
            result.append( "<unset>" );
        result.append( ", emax: " );
        if( emaxESet )
            result.append( emax );
        else
            result.append( "<unset>" );
        result.append( ", emin: " );
        if( eminESet )
            result.append( emin );
        else
            result.append( "<unset>" );
        result.append( ", atr: " );
        if( atrESet )
            result.append( atr );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ExcHUImpl

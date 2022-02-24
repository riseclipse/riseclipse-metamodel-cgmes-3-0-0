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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gov Steam CC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamCCImpl#getPmaxhp <em>Pmaxhp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamCCImpl#getT1hp <em>T1hp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamCCImpl#getPmaxlp <em>Pmaxlp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamCCImpl#getT1lp <em>T1lp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamCCImpl#getT3lp <em>T3lp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamCCImpl#getT3hp <em>T3hp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamCCImpl#getT4lp <em>T4lp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamCCImpl#getRlp <em>Rlp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamCCImpl#getT4hp <em>T4hp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamCCImpl#getRhp <em>Rhp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamCCImpl#getMwbase <em>Mwbase</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamCCImpl#getDlp <em>Dlp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamCCImpl#getT5lp <em>T5lp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamCCImpl#getDhp <em>Dhp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamCCImpl#getT5hp <em>T5hp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamCCImpl#getFlp <em>Flp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.GovSteamCCImpl#getFhp <em>Fhp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GovSteamCCImpl extends CrossCompoundTurbineGovernorDynamicsImpl implements GovSteamCC {
    /**
     * The default value of the '{@link #getPmaxhp() <em>Pmaxhp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPmaxhp()
     * @generated
     * @ordered
     */
    protected static final Double PMAXHP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPmaxhp() <em>Pmaxhp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPmaxhp()
     * @generated
     * @ordered
     */
    protected Double pmaxhp = PMAXHP_EDEFAULT;

    /**
     * This is true if the Pmaxhp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pmaxhpESet;

    /**
     * The default value of the '{@link #getT1hp() <em>T1hp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT1hp()
     * @generated
     * @ordered
     */
    protected static final Double T1HP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getT1hp() <em>T1hp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT1hp()
     * @generated
     * @ordered
     */
    protected Double t1hp = T1HP_EDEFAULT;

    /**
     * This is true if the T1hp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean t1hpESet;

    /**
     * The default value of the '{@link #getPmaxlp() <em>Pmaxlp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPmaxlp()
     * @generated
     * @ordered
     */
    protected static final Double PMAXLP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPmaxlp() <em>Pmaxlp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPmaxlp()
     * @generated
     * @ordered
     */
    protected Double pmaxlp = PMAXLP_EDEFAULT;

    /**
     * This is true if the Pmaxlp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pmaxlpESet;

    /**
     * The default value of the '{@link #getT1lp() <em>T1lp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT1lp()
     * @generated
     * @ordered
     */
    protected static final Double T1LP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getT1lp() <em>T1lp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT1lp()
     * @generated
     * @ordered
     */
    protected Double t1lp = T1LP_EDEFAULT;

    /**
     * This is true if the T1lp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean t1lpESet;

    /**
     * The default value of the '{@link #getT3lp() <em>T3lp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT3lp()
     * @generated
     * @ordered
     */
    protected static final Double T3LP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getT3lp() <em>T3lp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT3lp()
     * @generated
     * @ordered
     */
    protected Double t3lp = T3LP_EDEFAULT;

    /**
     * This is true if the T3lp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean t3lpESet;

    /**
     * The default value of the '{@link #getT3hp() <em>T3hp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT3hp()
     * @generated
     * @ordered
     */
    protected static final Double T3HP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getT3hp() <em>T3hp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT3hp()
     * @generated
     * @ordered
     */
    protected Double t3hp = T3HP_EDEFAULT;

    /**
     * This is true if the T3hp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean t3hpESet;

    /**
     * The default value of the '{@link #getT4lp() <em>T4lp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT4lp()
     * @generated
     * @ordered
     */
    protected static final Double T4LP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getT4lp() <em>T4lp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT4lp()
     * @generated
     * @ordered
     */
    protected Double t4lp = T4LP_EDEFAULT;

    /**
     * This is true if the T4lp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean t4lpESet;

    /**
     * The default value of the '{@link #getRlp() <em>Rlp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRlp()
     * @generated
     * @ordered
     */
    protected static final Double RLP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRlp() <em>Rlp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRlp()
     * @generated
     * @ordered
     */
    protected Double rlp = RLP_EDEFAULT;

    /**
     * This is true if the Rlp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rlpESet;

    /**
     * The default value of the '{@link #getT4hp() <em>T4hp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT4hp()
     * @generated
     * @ordered
     */
    protected static final Double T4HP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getT4hp() <em>T4hp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT4hp()
     * @generated
     * @ordered
     */
    protected Double t4hp = T4HP_EDEFAULT;

    /**
     * This is true if the T4hp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean t4hpESet;

    /**
     * The default value of the '{@link #getRhp() <em>Rhp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRhp()
     * @generated
     * @ordered
     */
    protected static final Double RHP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRhp() <em>Rhp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRhp()
     * @generated
     * @ordered
     */
    protected Double rhp = RHP_EDEFAULT;

    /**
     * This is true if the Rhp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rhpESet;

    /**
     * The default value of the '{@link #getMwbase() <em>Mwbase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMwbase()
     * @generated
     * @ordered
     */
    protected static final Double MWBASE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMwbase() <em>Mwbase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMwbase()
     * @generated
     * @ordered
     */
    protected Double mwbase = MWBASE_EDEFAULT;

    /**
     * This is true if the Mwbase attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean mwbaseESet;

    /**
     * The default value of the '{@link #getDlp() <em>Dlp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDlp()
     * @generated
     * @ordered
     */
    protected static final Double DLP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDlp() <em>Dlp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDlp()
     * @generated
     * @ordered
     */
    protected Double dlp = DLP_EDEFAULT;

    /**
     * This is true if the Dlp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dlpESet;

    /**
     * The default value of the '{@link #getT5lp() <em>T5lp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT5lp()
     * @generated
     * @ordered
     */
    protected static final Double T5LP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getT5lp() <em>T5lp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT5lp()
     * @generated
     * @ordered
     */
    protected Double t5lp = T5LP_EDEFAULT;

    /**
     * This is true if the T5lp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean t5lpESet;

    /**
     * The default value of the '{@link #getDhp() <em>Dhp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDhp()
     * @generated
     * @ordered
     */
    protected static final Double DHP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDhp() <em>Dhp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDhp()
     * @generated
     * @ordered
     */
    protected Double dhp = DHP_EDEFAULT;

    /**
     * This is true if the Dhp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dhpESet;

    /**
     * The default value of the '{@link #getT5hp() <em>T5hp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT5hp()
     * @generated
     * @ordered
     */
    protected static final Double T5HP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getT5hp() <em>T5hp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getT5hp()
     * @generated
     * @ordered
     */
    protected Double t5hp = T5HP_EDEFAULT;

    /**
     * This is true if the T5hp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean t5hpESet;

    /**
     * The default value of the '{@link #getFlp() <em>Flp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFlp()
     * @generated
     * @ordered
     */
    protected static final Double FLP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFlp() <em>Flp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFlp()
     * @generated
     * @ordered
     */
    protected Double flp = FLP_EDEFAULT;

    /**
     * This is true if the Flp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean flpESet;

    /**
     * The default value of the '{@link #getFhp() <em>Fhp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFhp()
     * @generated
     * @ordered
     */
    protected static final Double FHP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFhp() <em>Fhp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFhp()
     * @generated
     * @ordered
     */
    protected Double fhp = FHP_EDEFAULT;

    /**
     * This is true if the Fhp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean fhpESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GovSteamCCImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getGovSteamCC();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getPmaxhp() {
        return pmaxhp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPmaxhp( Double newPmaxhp ) {
        Double oldPmaxhp = pmaxhp;
        pmaxhp = newPmaxhp;
        boolean oldPmaxhpESet = pmaxhpESet;
        pmaxhpESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_CC__PMAXHP, oldPmaxhp, pmaxhp,
                    !oldPmaxhpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPmaxhp() {
        Double oldPmaxhp = pmaxhp;
        boolean oldPmaxhpESet = pmaxhpESet;
        pmaxhp = PMAXHP_EDEFAULT;
        pmaxhpESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_CC__PMAXHP, oldPmaxhp,
                    PMAXHP_EDEFAULT, oldPmaxhpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPmaxhp() {
        return pmaxhpESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getT1hp() {
        return t1hp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setT1hp( Double newT1hp ) {
        Double oldT1hp = t1hp;
        t1hp = newT1hp;
        boolean oldT1hpESet = t1hpESet;
        t1hpESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_CC__T1HP, oldT1hp, t1hp,
                    !oldT1hpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetT1hp() {
        Double oldT1hp = t1hp;
        boolean oldT1hpESet = t1hpESet;
        t1hp = T1HP_EDEFAULT;
        t1hpESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_CC__T1HP, oldT1hp,
                    T1HP_EDEFAULT, oldT1hpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetT1hp() {
        return t1hpESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getPmaxlp() {
        return pmaxlp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPmaxlp( Double newPmaxlp ) {
        Double oldPmaxlp = pmaxlp;
        pmaxlp = newPmaxlp;
        boolean oldPmaxlpESet = pmaxlpESet;
        pmaxlpESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_CC__PMAXLP, oldPmaxlp, pmaxlp,
                    !oldPmaxlpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPmaxlp() {
        Double oldPmaxlp = pmaxlp;
        boolean oldPmaxlpESet = pmaxlpESet;
        pmaxlp = PMAXLP_EDEFAULT;
        pmaxlpESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_CC__PMAXLP, oldPmaxlp,
                    PMAXLP_EDEFAULT, oldPmaxlpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPmaxlp() {
        return pmaxlpESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getT1lp() {
        return t1lp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setT1lp( Double newT1lp ) {
        Double oldT1lp = t1lp;
        t1lp = newT1lp;
        boolean oldT1lpESet = t1lpESet;
        t1lpESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_CC__T1LP, oldT1lp, t1lp,
                    !oldT1lpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetT1lp() {
        Double oldT1lp = t1lp;
        boolean oldT1lpESet = t1lpESet;
        t1lp = T1LP_EDEFAULT;
        t1lpESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_CC__T1LP, oldT1lp,
                    T1LP_EDEFAULT, oldT1lpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetT1lp() {
        return t1lpESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getT3lp() {
        return t3lp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setT3lp( Double newT3lp ) {
        Double oldT3lp = t3lp;
        t3lp = newT3lp;
        boolean oldT3lpESet = t3lpESet;
        t3lpESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_CC__T3LP, oldT3lp, t3lp,
                    !oldT3lpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetT3lp() {
        Double oldT3lp = t3lp;
        boolean oldT3lpESet = t3lpESet;
        t3lp = T3LP_EDEFAULT;
        t3lpESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_CC__T3LP, oldT3lp,
                    T3LP_EDEFAULT, oldT3lpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetT3lp() {
        return t3lpESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getT3hp() {
        return t3hp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setT3hp( Double newT3hp ) {
        Double oldT3hp = t3hp;
        t3hp = newT3hp;
        boolean oldT3hpESet = t3hpESet;
        t3hpESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_CC__T3HP, oldT3hp, t3hp,
                    !oldT3hpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetT3hp() {
        Double oldT3hp = t3hp;
        boolean oldT3hpESet = t3hpESet;
        t3hp = T3HP_EDEFAULT;
        t3hpESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_CC__T3HP, oldT3hp,
                    T3HP_EDEFAULT, oldT3hpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetT3hp() {
        return t3hpESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getT4lp() {
        return t4lp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setT4lp( Double newT4lp ) {
        Double oldT4lp = t4lp;
        t4lp = newT4lp;
        boolean oldT4lpESet = t4lpESet;
        t4lpESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_CC__T4LP, oldT4lp, t4lp,
                    !oldT4lpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetT4lp() {
        Double oldT4lp = t4lp;
        boolean oldT4lpESet = t4lpESet;
        t4lp = T4LP_EDEFAULT;
        t4lpESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_CC__T4LP, oldT4lp,
                    T4LP_EDEFAULT, oldT4lpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetT4lp() {
        return t4lpESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getRlp() {
        return rlp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRlp( Double newRlp ) {
        Double oldRlp = rlp;
        rlp = newRlp;
        boolean oldRlpESet = rlpESet;
        rlpESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_CC__RLP, oldRlp, rlp,
                    !oldRlpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRlp() {
        Double oldRlp = rlp;
        boolean oldRlpESet = rlpESet;
        rlp = RLP_EDEFAULT;
        rlpESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_CC__RLP, oldRlp,
                    RLP_EDEFAULT, oldRlpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRlp() {
        return rlpESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getT4hp() {
        return t4hp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setT4hp( Double newT4hp ) {
        Double oldT4hp = t4hp;
        t4hp = newT4hp;
        boolean oldT4hpESet = t4hpESet;
        t4hpESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_CC__T4HP, oldT4hp, t4hp,
                    !oldT4hpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetT4hp() {
        Double oldT4hp = t4hp;
        boolean oldT4hpESet = t4hpESet;
        t4hp = T4HP_EDEFAULT;
        t4hpESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_CC__T4HP, oldT4hp,
                    T4HP_EDEFAULT, oldT4hpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetT4hp() {
        return t4hpESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getRhp() {
        return rhp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRhp( Double newRhp ) {
        Double oldRhp = rhp;
        rhp = newRhp;
        boolean oldRhpESet = rhpESet;
        rhpESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_CC__RHP, oldRhp, rhp,
                    !oldRhpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRhp() {
        Double oldRhp = rhp;
        boolean oldRhpESet = rhpESet;
        rhp = RHP_EDEFAULT;
        rhpESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_CC__RHP, oldRhp,
                    RHP_EDEFAULT, oldRhpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRhp() {
        return rhpESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getMwbase() {
        return mwbase;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMwbase( Double newMwbase ) {
        Double oldMwbase = mwbase;
        mwbase = newMwbase;
        boolean oldMwbaseESet = mwbaseESet;
        mwbaseESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_CC__MWBASE, oldMwbase, mwbase,
                    !oldMwbaseESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMwbase() {
        Double oldMwbase = mwbase;
        boolean oldMwbaseESet = mwbaseESet;
        mwbase = MWBASE_EDEFAULT;
        mwbaseESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_CC__MWBASE, oldMwbase,
                    MWBASE_EDEFAULT, oldMwbaseESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMwbase() {
        return mwbaseESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getDlp() {
        return dlp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDlp( Double newDlp ) {
        Double oldDlp = dlp;
        dlp = newDlp;
        boolean oldDlpESet = dlpESet;
        dlpESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_CC__DLP, oldDlp, dlp,
                    !oldDlpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDlp() {
        Double oldDlp = dlp;
        boolean oldDlpESet = dlpESet;
        dlp = DLP_EDEFAULT;
        dlpESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_CC__DLP, oldDlp,
                    DLP_EDEFAULT, oldDlpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDlp() {
        return dlpESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getT5lp() {
        return t5lp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setT5lp( Double newT5lp ) {
        Double oldT5lp = t5lp;
        t5lp = newT5lp;
        boolean oldT5lpESet = t5lpESet;
        t5lpESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_CC__T5LP, oldT5lp, t5lp,
                    !oldT5lpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetT5lp() {
        Double oldT5lp = t5lp;
        boolean oldT5lpESet = t5lpESet;
        t5lp = T5LP_EDEFAULT;
        t5lpESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_CC__T5LP, oldT5lp,
                    T5LP_EDEFAULT, oldT5lpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetT5lp() {
        return t5lpESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getDhp() {
        return dhp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDhp( Double newDhp ) {
        Double oldDhp = dhp;
        dhp = newDhp;
        boolean oldDhpESet = dhpESet;
        dhpESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_CC__DHP, oldDhp, dhp,
                    !oldDhpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDhp() {
        Double oldDhp = dhp;
        boolean oldDhpESet = dhpESet;
        dhp = DHP_EDEFAULT;
        dhpESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_CC__DHP, oldDhp,
                    DHP_EDEFAULT, oldDhpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDhp() {
        return dhpESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getT5hp() {
        return t5hp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setT5hp( Double newT5hp ) {
        Double oldT5hp = t5hp;
        t5hp = newT5hp;
        boolean oldT5hpESet = t5hpESet;
        t5hpESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_CC__T5HP, oldT5hp, t5hp,
                    !oldT5hpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetT5hp() {
        Double oldT5hp = t5hp;
        boolean oldT5hpESet = t5hpESet;
        t5hp = T5HP_EDEFAULT;
        t5hpESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_CC__T5HP, oldT5hp,
                    T5HP_EDEFAULT, oldT5hpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetT5hp() {
        return t5hpESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getFlp() {
        return flp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFlp( Double newFlp ) {
        Double oldFlp = flp;
        flp = newFlp;
        boolean oldFlpESet = flpESet;
        flpESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_CC__FLP, oldFlp, flp,
                    !oldFlpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFlp() {
        Double oldFlp = flp;
        boolean oldFlpESet = flpESet;
        flp = FLP_EDEFAULT;
        flpESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_CC__FLP, oldFlp,
                    FLP_EDEFAULT, oldFlpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFlp() {
        return flpESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getFhp() {
        return fhp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFhp( Double newFhp ) {
        Double oldFhp = fhp;
        fhp = newFhp;
        boolean oldFhpESet = fhpESet;
        fhpESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GOV_STEAM_CC__FHP, oldFhp, fhp,
                    !oldFhpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFhp() {
        Double oldFhp = fhp;
        boolean oldFhpESet = fhpESet;
        fhp = FHP_EDEFAULT;
        fhpESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GOV_STEAM_CC__FHP, oldFhp,
                    FHP_EDEFAULT, oldFhpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFhp() {
        return fhpESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.GOV_STEAM_CC__PMAXHP:
            return getPmaxhp();
        case CimPackage.GOV_STEAM_CC__T1HP:
            return getT1hp();
        case CimPackage.GOV_STEAM_CC__PMAXLP:
            return getPmaxlp();
        case CimPackage.GOV_STEAM_CC__T1LP:
            return getT1lp();
        case CimPackage.GOV_STEAM_CC__T3LP:
            return getT3lp();
        case CimPackage.GOV_STEAM_CC__T3HP:
            return getT3hp();
        case CimPackage.GOV_STEAM_CC__T4LP:
            return getT4lp();
        case CimPackage.GOV_STEAM_CC__RLP:
            return getRlp();
        case CimPackage.GOV_STEAM_CC__T4HP:
            return getT4hp();
        case CimPackage.GOV_STEAM_CC__RHP:
            return getRhp();
        case CimPackage.GOV_STEAM_CC__MWBASE:
            return getMwbase();
        case CimPackage.GOV_STEAM_CC__DLP:
            return getDlp();
        case CimPackage.GOV_STEAM_CC__T5LP:
            return getT5lp();
        case CimPackage.GOV_STEAM_CC__DHP:
            return getDhp();
        case CimPackage.GOV_STEAM_CC__T5HP:
            return getT5hp();
        case CimPackage.GOV_STEAM_CC__FLP:
            return getFlp();
        case CimPackage.GOV_STEAM_CC__FHP:
            return getFhp();
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
        case CimPackage.GOV_STEAM_CC__PMAXHP:
            setPmaxhp( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM_CC__T1HP:
            setT1hp( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM_CC__PMAXLP:
            setPmaxlp( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM_CC__T1LP:
            setT1lp( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM_CC__T3LP:
            setT3lp( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM_CC__T3HP:
            setT3hp( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM_CC__T4LP:
            setT4lp( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM_CC__RLP:
            setRlp( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM_CC__T4HP:
            setT4hp( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM_CC__RHP:
            setRhp( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM_CC__MWBASE:
            setMwbase( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM_CC__DLP:
            setDlp( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM_CC__T5LP:
            setT5lp( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM_CC__DHP:
            setDhp( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM_CC__T5HP:
            setT5hp( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM_CC__FLP:
            setFlp( ( Double ) newValue );
            return;
        case CimPackage.GOV_STEAM_CC__FHP:
            setFhp( ( Double ) newValue );
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
        case CimPackage.GOV_STEAM_CC__PMAXHP:
            unsetPmaxhp();
            return;
        case CimPackage.GOV_STEAM_CC__T1HP:
            unsetT1hp();
            return;
        case CimPackage.GOV_STEAM_CC__PMAXLP:
            unsetPmaxlp();
            return;
        case CimPackage.GOV_STEAM_CC__T1LP:
            unsetT1lp();
            return;
        case CimPackage.GOV_STEAM_CC__T3LP:
            unsetT3lp();
            return;
        case CimPackage.GOV_STEAM_CC__T3HP:
            unsetT3hp();
            return;
        case CimPackage.GOV_STEAM_CC__T4LP:
            unsetT4lp();
            return;
        case CimPackage.GOV_STEAM_CC__RLP:
            unsetRlp();
            return;
        case CimPackage.GOV_STEAM_CC__T4HP:
            unsetT4hp();
            return;
        case CimPackage.GOV_STEAM_CC__RHP:
            unsetRhp();
            return;
        case CimPackage.GOV_STEAM_CC__MWBASE:
            unsetMwbase();
            return;
        case CimPackage.GOV_STEAM_CC__DLP:
            unsetDlp();
            return;
        case CimPackage.GOV_STEAM_CC__T5LP:
            unsetT5lp();
            return;
        case CimPackage.GOV_STEAM_CC__DHP:
            unsetDhp();
            return;
        case CimPackage.GOV_STEAM_CC__T5HP:
            unsetT5hp();
            return;
        case CimPackage.GOV_STEAM_CC__FLP:
            unsetFlp();
            return;
        case CimPackage.GOV_STEAM_CC__FHP:
            unsetFhp();
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
        case CimPackage.GOV_STEAM_CC__PMAXHP:
            return isSetPmaxhp();
        case CimPackage.GOV_STEAM_CC__T1HP:
            return isSetT1hp();
        case CimPackage.GOV_STEAM_CC__PMAXLP:
            return isSetPmaxlp();
        case CimPackage.GOV_STEAM_CC__T1LP:
            return isSetT1lp();
        case CimPackage.GOV_STEAM_CC__T3LP:
            return isSetT3lp();
        case CimPackage.GOV_STEAM_CC__T3HP:
            return isSetT3hp();
        case CimPackage.GOV_STEAM_CC__T4LP:
            return isSetT4lp();
        case CimPackage.GOV_STEAM_CC__RLP:
            return isSetRlp();
        case CimPackage.GOV_STEAM_CC__T4HP:
            return isSetT4hp();
        case CimPackage.GOV_STEAM_CC__RHP:
            return isSetRhp();
        case CimPackage.GOV_STEAM_CC__MWBASE:
            return isSetMwbase();
        case CimPackage.GOV_STEAM_CC__DLP:
            return isSetDlp();
        case CimPackage.GOV_STEAM_CC__T5LP:
            return isSetT5lp();
        case CimPackage.GOV_STEAM_CC__DHP:
            return isSetDhp();
        case CimPackage.GOV_STEAM_CC__T5HP:
            return isSetT5hp();
        case CimPackage.GOV_STEAM_CC__FLP:
            return isSetFlp();
        case CimPackage.GOV_STEAM_CC__FHP:
            return isSetFhp();
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
        result.append( " (pmaxhp: " );
        if( pmaxhpESet )
            result.append( pmaxhp );
        else
            result.append( "<unset>" );
        result.append( ", t1hp: " );
        if( t1hpESet )
            result.append( t1hp );
        else
            result.append( "<unset>" );
        result.append( ", pmaxlp: " );
        if( pmaxlpESet )
            result.append( pmaxlp );
        else
            result.append( "<unset>" );
        result.append( ", t1lp: " );
        if( t1lpESet )
            result.append( t1lp );
        else
            result.append( "<unset>" );
        result.append( ", t3lp: " );
        if( t3lpESet )
            result.append( t3lp );
        else
            result.append( "<unset>" );
        result.append( ", t3hp: " );
        if( t3hpESet )
            result.append( t3hp );
        else
            result.append( "<unset>" );
        result.append( ", t4lp: " );
        if( t4lpESet )
            result.append( t4lp );
        else
            result.append( "<unset>" );
        result.append( ", rlp: " );
        if( rlpESet )
            result.append( rlp );
        else
            result.append( "<unset>" );
        result.append( ", t4hp: " );
        if( t4hpESet )
            result.append( t4hp );
        else
            result.append( "<unset>" );
        result.append( ", rhp: " );
        if( rhpESet )
            result.append( rhp );
        else
            result.append( "<unset>" );
        result.append( ", mwbase: " );
        if( mwbaseESet )
            result.append( mwbase );
        else
            result.append( "<unset>" );
        result.append( ", dlp: " );
        if( dlpESet )
            result.append( dlp );
        else
            result.append( "<unset>" );
        result.append( ", t5lp: " );
        if( t5lpESet )
            result.append( t5lp );
        else
            result.append( "<unset>" );
        result.append( ", dhp: " );
        if( dhpESet )
            result.append( dhp );
        else
            result.append( "<unset>" );
        result.append( ", t5hp: " );
        if( t5hpESet )
            result.append( t5hp );
        else
            result.append( "<unset>" );
        result.append( ", flp: " );
        if( flpESet )
            result.append( flp );
        else
            result.append( "<unset>" );
        result.append( ", fhp: " );
        if( fhpESet )
            result.append( fhp );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //GovSteamCCImpl

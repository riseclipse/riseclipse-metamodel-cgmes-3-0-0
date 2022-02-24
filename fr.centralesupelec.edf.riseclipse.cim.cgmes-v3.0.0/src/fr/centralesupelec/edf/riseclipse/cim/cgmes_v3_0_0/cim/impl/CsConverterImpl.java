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

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CSCDynamics;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsOperatingModeKind;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsPpccControlKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cs Converter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.CsConverterImpl#getRatedIdc <em>Rated Idc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.CsConverterImpl#getMaxAlpha <em>Max Alpha</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.CsConverterImpl#getMinAlpha <em>Min Alpha</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.CsConverterImpl#getMinGamma <em>Min Gamma</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.CsConverterImpl#getMaxIdc <em>Max Idc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.CsConverterImpl#getMinIdc <em>Min Idc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.CsConverterImpl#getMaxGamma <em>Max Gamma</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.CsConverterImpl#getCSCDynamics <em>CSC Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.CsConverterImpl#getTargetIdc <em>Target Idc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.CsConverterImpl#getOperatingMode <em>Operating Mode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.CsConverterImpl#getPPccControl <em>PPcc Control</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.CsConverterImpl#getTargetAlpha <em>Target Alpha</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.CsConverterImpl#getTargetGamma <em>Target Gamma</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.CsConverterImpl#getGamma <em>Gamma</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.CsConverterImpl#getAlpha <em>Alpha</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CsConverterImpl extends ACDCConverterImpl implements CsConverter {
    /**
     * The default value of the '{@link #getRatedIdc() <em>Rated Idc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedIdc()
     * @generated
     * @ordered
     */
    protected static final Double RATED_IDC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRatedIdc() <em>Rated Idc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedIdc()
     * @generated
     * @ordered
     */
    protected Double ratedIdc = RATED_IDC_EDEFAULT;

    /**
     * This is true if the Rated Idc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ratedIdcESet;

    /**
     * The default value of the '{@link #getMaxAlpha() <em>Max Alpha</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxAlpha()
     * @generated
     * @ordered
     */
    protected static final Double MAX_ALPHA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxAlpha() <em>Max Alpha</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxAlpha()
     * @generated
     * @ordered
     */
    protected Double maxAlpha = MAX_ALPHA_EDEFAULT;

    /**
     * This is true if the Max Alpha attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxAlphaESet;

    /**
     * The default value of the '{@link #getMinAlpha() <em>Min Alpha</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinAlpha()
     * @generated
     * @ordered
     */
    protected static final Double MIN_ALPHA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMinAlpha() <em>Min Alpha</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinAlpha()
     * @generated
     * @ordered
     */
    protected Double minAlpha = MIN_ALPHA_EDEFAULT;

    /**
     * This is true if the Min Alpha attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean minAlphaESet;

    /**
     * The default value of the '{@link #getMinGamma() <em>Min Gamma</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinGamma()
     * @generated
     * @ordered
     */
    protected static final Double MIN_GAMMA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMinGamma() <em>Min Gamma</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinGamma()
     * @generated
     * @ordered
     */
    protected Double minGamma = MIN_GAMMA_EDEFAULT;

    /**
     * This is true if the Min Gamma attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean minGammaESet;

    /**
     * The default value of the '{@link #getMaxIdc() <em>Max Idc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxIdc()
     * @generated
     * @ordered
     */
    protected static final Double MAX_IDC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxIdc() <em>Max Idc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxIdc()
     * @generated
     * @ordered
     */
    protected Double maxIdc = MAX_IDC_EDEFAULT;

    /**
     * This is true if the Max Idc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxIdcESet;

    /**
     * The default value of the '{@link #getMinIdc() <em>Min Idc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinIdc()
     * @generated
     * @ordered
     */
    protected static final Double MIN_IDC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMinIdc() <em>Min Idc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinIdc()
     * @generated
     * @ordered
     */
    protected Double minIdc = MIN_IDC_EDEFAULT;

    /**
     * This is true if the Min Idc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean minIdcESet;

    /**
     * The default value of the '{@link #getMaxGamma() <em>Max Gamma</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxGamma()
     * @generated
     * @ordered
     */
    protected static final Double MAX_GAMMA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxGamma() <em>Max Gamma</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxGamma()
     * @generated
     * @ordered
     */
    protected Double maxGamma = MAX_GAMMA_EDEFAULT;

    /**
     * This is true if the Max Gamma attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxGammaESet;

    /**
     * The cached value of the '{@link #getCSCDynamics() <em>CSC Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCSCDynamics()
     * @generated
     * @ordered
     */
    protected CSCDynamics cscDynamics;

    /**
     * This is true if the CSC Dynamics reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean cscDynamicsESet;

    /**
     * The default value of the '{@link #getTargetIdc() <em>Target Idc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetIdc()
     * @generated
     * @ordered
     */
    protected static final Double TARGET_IDC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTargetIdc() <em>Target Idc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetIdc()
     * @generated
     * @ordered
     */
    protected Double targetIdc = TARGET_IDC_EDEFAULT;

    /**
     * This is true if the Target Idc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean targetIdcESet;

    /**
     * The default value of the '{@link #getOperatingMode() <em>Operating Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperatingMode()
     * @generated
     * @ordered
     */
    protected static final CsOperatingModeKind OPERATING_MODE_EDEFAULT = CsOperatingModeKind.RECTIFIER;

    /**
     * The cached value of the '{@link #getOperatingMode() <em>Operating Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOperatingMode()
     * @generated
     * @ordered
     */
    protected CsOperatingModeKind operatingMode = OPERATING_MODE_EDEFAULT;

    /**
     * This is true if the Operating Mode attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean operatingModeESet;

    /**
     * The default value of the '{@link #getPPccControl() <em>PPcc Control</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPPccControl()
     * @generated
     * @ordered
     */
    protected static final CsPpccControlKind PPCC_CONTROL_EDEFAULT = CsPpccControlKind.DC_VOLTAGE;

    /**
     * The cached value of the '{@link #getPPccControl() <em>PPcc Control</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPPccControl()
     * @generated
     * @ordered
     */
    protected CsPpccControlKind pPccControl = PPCC_CONTROL_EDEFAULT;

    /**
     * This is true if the PPcc Control attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pPccControlESet;

    /**
     * The default value of the '{@link #getTargetAlpha() <em>Target Alpha</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetAlpha()
     * @generated
     * @ordered
     */
    protected static final Double TARGET_ALPHA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTargetAlpha() <em>Target Alpha</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetAlpha()
     * @generated
     * @ordered
     */
    protected Double targetAlpha = TARGET_ALPHA_EDEFAULT;

    /**
     * This is true if the Target Alpha attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean targetAlphaESet;

    /**
     * The default value of the '{@link #getTargetGamma() <em>Target Gamma</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetGamma()
     * @generated
     * @ordered
     */
    protected static final Double TARGET_GAMMA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTargetGamma() <em>Target Gamma</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetGamma()
     * @generated
     * @ordered
     */
    protected Double targetGamma = TARGET_GAMMA_EDEFAULT;

    /**
     * This is true if the Target Gamma attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean targetGammaESet;

    /**
     * The default value of the '{@link #getGamma() <em>Gamma</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGamma()
     * @generated
     * @ordered
     */
    protected static final Double GAMMA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGamma() <em>Gamma</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGamma()
     * @generated
     * @ordered
     */
    protected Double gamma = GAMMA_EDEFAULT;

    /**
     * This is true if the Gamma attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean gammaESet;

    /**
     * The default value of the '{@link #getAlpha() <em>Alpha</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAlpha()
     * @generated
     * @ordered
     */
    protected static final Double ALPHA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAlpha() <em>Alpha</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAlpha()
     * @generated
     * @ordered
     */
    protected Double alpha = ALPHA_EDEFAULT;

    /**
     * This is true if the Alpha attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean alphaESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CsConverterImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getCsConverter();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getMaxAlpha() {
        return maxAlpha;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaxAlpha( Double newMaxAlpha ) {
        Double oldMaxAlpha = maxAlpha;
        maxAlpha = newMaxAlpha;
        boolean oldMaxAlphaESet = maxAlphaESet;
        maxAlphaESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CS_CONVERTER__MAX_ALPHA, oldMaxAlpha,
                    maxAlpha, !oldMaxAlphaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaxAlpha() {
        Double oldMaxAlpha = maxAlpha;
        boolean oldMaxAlphaESet = maxAlphaESet;
        maxAlpha = MAX_ALPHA_EDEFAULT;
        maxAlphaESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.CS_CONVERTER__MAX_ALPHA, oldMaxAlpha,
                    MAX_ALPHA_EDEFAULT, oldMaxAlphaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaxAlpha() {
        return maxAlphaESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getMaxGamma() {
        return maxGamma;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaxGamma( Double newMaxGamma ) {
        Double oldMaxGamma = maxGamma;
        maxGamma = newMaxGamma;
        boolean oldMaxGammaESet = maxGammaESet;
        maxGammaESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CS_CONVERTER__MAX_GAMMA, oldMaxGamma,
                    maxGamma, !oldMaxGammaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaxGamma() {
        Double oldMaxGamma = maxGamma;
        boolean oldMaxGammaESet = maxGammaESet;
        maxGamma = MAX_GAMMA_EDEFAULT;
        maxGammaESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.CS_CONVERTER__MAX_GAMMA, oldMaxGamma,
                    MAX_GAMMA_EDEFAULT, oldMaxGammaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaxGamma() {
        return maxGammaESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CSCDynamics getCSCDynamics() {
        if( cscDynamics != null && cscDynamics.eIsProxy() ) {
            InternalEObject oldCSCDynamics = ( InternalEObject ) cscDynamics;
            cscDynamics = ( CSCDynamics ) eResolveProxy( oldCSCDynamics );
            if( cscDynamics != oldCSCDynamics ) {
                if( eNotificationRequired() )
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE, CimPackage.CS_CONVERTER__CSC_DYNAMICS,
                            oldCSCDynamics, cscDynamics ) );
            }
        }
        return cscDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public CSCDynamics basicGetCSCDynamics() {
        return cscDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCSCDynamics( CSCDynamics newCSCDynamics, NotificationChain msgs ) {
        CSCDynamics oldCSCDynamics = cscDynamics;
        cscDynamics = newCSCDynamics;
        boolean oldCSCDynamicsESet = cscDynamicsESet;
        cscDynamicsESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.CS_CONVERTER__CSC_DYNAMICS, oldCSCDynamics, newCSCDynamics, !oldCSCDynamicsESet );
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
    public void setCSCDynamics( CSCDynamics newCSCDynamics ) {
        if( newCSCDynamics != cscDynamics ) {
            NotificationChain msgs = null;
            if( cscDynamics != null )
                msgs = ( ( InternalEObject ) cscDynamics ).eInverseRemove( this, CimPackage.CSC_DYNAMICS__CS_CONVERTER,
                        CSCDynamics.class, msgs );
            if( newCSCDynamics != null )
                msgs = ( ( InternalEObject ) newCSCDynamics ).eInverseAdd( this, CimPackage.CSC_DYNAMICS__CS_CONVERTER,
                        CSCDynamics.class, msgs );
            msgs = basicSetCSCDynamics( newCSCDynamics, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCSCDynamicsESet = cscDynamicsESet;
            cscDynamicsESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CS_CONVERTER__CSC_DYNAMICS,
                        newCSCDynamics, newCSCDynamics, !oldCSCDynamicsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetCSCDynamics( NotificationChain msgs ) {
        CSCDynamics oldCSCDynamics = cscDynamics;
        cscDynamics = null;
        boolean oldCSCDynamicsESet = cscDynamicsESet;
        cscDynamicsESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CS_CONVERTER__CSC_DYNAMICS, oldCSCDynamics, null, oldCSCDynamicsESet );
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
    public void unsetCSCDynamics() {
        if( cscDynamics != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) cscDynamics ).eInverseRemove( this, CimPackage.CSC_DYNAMICS__CS_CONVERTER,
                    CSCDynamics.class, msgs );
            msgs = basicUnsetCSCDynamics( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCSCDynamicsESet = cscDynamicsESet;
            cscDynamicsESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.CS_CONVERTER__CSC_DYNAMICS, null,
                        null, oldCSCDynamicsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCSCDynamics() {
        return cscDynamicsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTargetIdc() {
        return targetIdc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTargetIdc( Double newTargetIdc ) {
        Double oldTargetIdc = targetIdc;
        targetIdc = newTargetIdc;
        boolean oldTargetIdcESet = targetIdcESet;
        targetIdcESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CS_CONVERTER__TARGET_IDC, oldTargetIdc,
                    targetIdc, !oldTargetIdcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTargetIdc() {
        Double oldTargetIdc = targetIdc;
        boolean oldTargetIdcESet = targetIdcESet;
        targetIdc = TARGET_IDC_EDEFAULT;
        targetIdcESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.CS_CONVERTER__TARGET_IDC, oldTargetIdc,
                    TARGET_IDC_EDEFAULT, oldTargetIdcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTargetIdc() {
        return targetIdcESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CsOperatingModeKind getOperatingMode() {
        return operatingMode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setOperatingMode( CsOperatingModeKind newOperatingMode ) {
        CsOperatingModeKind oldOperatingMode = operatingMode;
        operatingMode = newOperatingMode == null ? OPERATING_MODE_EDEFAULT : newOperatingMode;
        boolean oldOperatingModeESet = operatingModeESet;
        operatingModeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CS_CONVERTER__OPERATING_MODE,
                    oldOperatingMode, operatingMode, !oldOperatingModeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOperatingMode() {
        CsOperatingModeKind oldOperatingMode = operatingMode;
        boolean oldOperatingModeESet = operatingModeESet;
        operatingMode = OPERATING_MODE_EDEFAULT;
        operatingModeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.CS_CONVERTER__OPERATING_MODE,
                    oldOperatingMode, OPERATING_MODE_EDEFAULT, oldOperatingModeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOperatingMode() {
        return operatingModeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CsPpccControlKind getPPccControl() {
        return pPccControl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPPccControl( CsPpccControlKind newPPccControl ) {
        CsPpccControlKind oldPPccControl = pPccControl;
        pPccControl = newPPccControl == null ? PPCC_CONTROL_EDEFAULT : newPPccControl;
        boolean oldPPccControlESet = pPccControlESet;
        pPccControlESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CS_CONVERTER__PPCC_CONTROL,
                    oldPPccControl, pPccControl, !oldPPccControlESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPPccControl() {
        CsPpccControlKind oldPPccControl = pPccControl;
        boolean oldPPccControlESet = pPccControlESet;
        pPccControl = PPCC_CONTROL_EDEFAULT;
        pPccControlESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.CS_CONVERTER__PPCC_CONTROL,
                    oldPPccControl, PPCC_CONTROL_EDEFAULT, oldPPccControlESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPPccControl() {
        return pPccControlESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTargetAlpha() {
        return targetAlpha;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTargetAlpha( Double newTargetAlpha ) {
        Double oldTargetAlpha = targetAlpha;
        targetAlpha = newTargetAlpha;
        boolean oldTargetAlphaESet = targetAlphaESet;
        targetAlphaESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CS_CONVERTER__TARGET_ALPHA,
                    oldTargetAlpha, targetAlpha, !oldTargetAlphaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTargetAlpha() {
        Double oldTargetAlpha = targetAlpha;
        boolean oldTargetAlphaESet = targetAlphaESet;
        targetAlpha = TARGET_ALPHA_EDEFAULT;
        targetAlphaESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.CS_CONVERTER__TARGET_ALPHA,
                    oldTargetAlpha, TARGET_ALPHA_EDEFAULT, oldTargetAlphaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTargetAlpha() {
        return targetAlphaESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTargetGamma() {
        return targetGamma;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTargetGamma( Double newTargetGamma ) {
        Double oldTargetGamma = targetGamma;
        targetGamma = newTargetGamma;
        boolean oldTargetGammaESet = targetGammaESet;
        targetGammaESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CS_CONVERTER__TARGET_GAMMA,
                    oldTargetGamma, targetGamma, !oldTargetGammaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTargetGamma() {
        Double oldTargetGamma = targetGamma;
        boolean oldTargetGammaESet = targetGammaESet;
        targetGamma = TARGET_GAMMA_EDEFAULT;
        targetGammaESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.CS_CONVERTER__TARGET_GAMMA,
                    oldTargetGamma, TARGET_GAMMA_EDEFAULT, oldTargetGammaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTargetGamma() {
        return targetGammaESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getGamma() {
        return gamma;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGamma( Double newGamma ) {
        Double oldGamma = gamma;
        gamma = newGamma;
        boolean oldGammaESet = gammaESet;
        gammaESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CS_CONVERTER__GAMMA, oldGamma, gamma,
                    !oldGammaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGamma() {
        Double oldGamma = gamma;
        boolean oldGammaESet = gammaESet;
        gamma = GAMMA_EDEFAULT;
        gammaESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.CS_CONVERTER__GAMMA, oldGamma,
                    GAMMA_EDEFAULT, oldGammaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGamma() {
        return gammaESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getAlpha() {
        return alpha;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAlpha( Double newAlpha ) {
        Double oldAlpha = alpha;
        alpha = newAlpha;
        boolean oldAlphaESet = alphaESet;
        alphaESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CS_CONVERTER__ALPHA, oldAlpha, alpha,
                    !oldAlphaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAlpha() {
        Double oldAlpha = alpha;
        boolean oldAlphaESet = alphaESet;
        alpha = ALPHA_EDEFAULT;
        alphaESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.CS_CONVERTER__ALPHA, oldAlpha,
                    ALPHA_EDEFAULT, oldAlphaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAlpha() {
        return alphaESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.CS_CONVERTER__CSC_DYNAMICS:
            if( cscDynamics != null )
                msgs = ( ( InternalEObject ) cscDynamics ).eInverseRemove( this, CimPackage.CSC_DYNAMICS__CS_CONVERTER,
                        CSCDynamics.class, msgs );
            return basicSetCSCDynamics( ( CSCDynamics ) otherEnd, msgs );
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
        case CimPackage.CS_CONVERTER__CSC_DYNAMICS:
            return basicUnsetCSCDynamics( msgs );
        }
        return super.eInverseRemove( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getMinGamma() {
        return minGamma;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMinGamma( Double newMinGamma ) {
        Double oldMinGamma = minGamma;
        minGamma = newMinGamma;
        boolean oldMinGammaESet = minGammaESet;
        minGammaESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CS_CONVERTER__MIN_GAMMA, oldMinGamma,
                    minGamma, !oldMinGammaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMinGamma() {
        Double oldMinGamma = minGamma;
        boolean oldMinGammaESet = minGammaESet;
        minGamma = MIN_GAMMA_EDEFAULT;
        minGammaESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.CS_CONVERTER__MIN_GAMMA, oldMinGamma,
                    MIN_GAMMA_EDEFAULT, oldMinGammaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMinGamma() {
        return minGammaESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getMinIdc() {
        return minIdc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMinIdc( Double newMinIdc ) {
        Double oldMinIdc = minIdc;
        minIdc = newMinIdc;
        boolean oldMinIdcESet = minIdcESet;
        minIdcESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CS_CONVERTER__MIN_IDC, oldMinIdc, minIdc,
                    !oldMinIdcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMinIdc() {
        Double oldMinIdc = minIdc;
        boolean oldMinIdcESet = minIdcESet;
        minIdc = MIN_IDC_EDEFAULT;
        minIdcESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.CS_CONVERTER__MIN_IDC, oldMinIdc,
                    MIN_IDC_EDEFAULT, oldMinIdcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMinIdc() {
        return minIdcESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getMinAlpha() {
        return minAlpha;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMinAlpha( Double newMinAlpha ) {
        Double oldMinAlpha = minAlpha;
        minAlpha = newMinAlpha;
        boolean oldMinAlphaESet = minAlphaESet;
        minAlphaESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CS_CONVERTER__MIN_ALPHA, oldMinAlpha,
                    minAlpha, !oldMinAlphaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMinAlpha() {
        Double oldMinAlpha = minAlpha;
        boolean oldMinAlphaESet = minAlphaESet;
        minAlpha = MIN_ALPHA_EDEFAULT;
        minAlphaESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.CS_CONVERTER__MIN_ALPHA, oldMinAlpha,
                    MIN_ALPHA_EDEFAULT, oldMinAlphaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMinAlpha() {
        return minAlphaESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getMaxIdc() {
        return maxIdc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaxIdc( Double newMaxIdc ) {
        Double oldMaxIdc = maxIdc;
        maxIdc = newMaxIdc;
        boolean oldMaxIdcESet = maxIdcESet;
        maxIdcESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CS_CONVERTER__MAX_IDC, oldMaxIdc, maxIdc,
                    !oldMaxIdcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaxIdc() {
        Double oldMaxIdc = maxIdc;
        boolean oldMaxIdcESet = maxIdcESet;
        maxIdc = MAX_IDC_EDEFAULT;
        maxIdcESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.CS_CONVERTER__MAX_IDC, oldMaxIdc,
                    MAX_IDC_EDEFAULT, oldMaxIdcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaxIdc() {
        return maxIdcESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getRatedIdc() {
        return ratedIdc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRatedIdc( Double newRatedIdc ) {
        Double oldRatedIdc = ratedIdc;
        ratedIdc = newRatedIdc;
        boolean oldRatedIdcESet = ratedIdcESet;
        ratedIdcESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CS_CONVERTER__RATED_IDC, oldRatedIdc,
                    ratedIdc, !oldRatedIdcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRatedIdc() {
        Double oldRatedIdc = ratedIdc;
        boolean oldRatedIdcESet = ratedIdcESet;
        ratedIdc = RATED_IDC_EDEFAULT;
        ratedIdcESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.CS_CONVERTER__RATED_IDC, oldRatedIdc,
                    RATED_IDC_EDEFAULT, oldRatedIdcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRatedIdc() {
        return ratedIdcESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.CS_CONVERTER__RATED_IDC:
            return getRatedIdc();
        case CimPackage.CS_CONVERTER__MAX_ALPHA:
            return getMaxAlpha();
        case CimPackage.CS_CONVERTER__MIN_ALPHA:
            return getMinAlpha();
        case CimPackage.CS_CONVERTER__MIN_GAMMA:
            return getMinGamma();
        case CimPackage.CS_CONVERTER__MAX_IDC:
            return getMaxIdc();
        case CimPackage.CS_CONVERTER__MIN_IDC:
            return getMinIdc();
        case CimPackage.CS_CONVERTER__MAX_GAMMA:
            return getMaxGamma();
        case CimPackage.CS_CONVERTER__CSC_DYNAMICS:
            if( resolve ) return getCSCDynamics();
            return basicGetCSCDynamics();
        case CimPackage.CS_CONVERTER__TARGET_IDC:
            return getTargetIdc();
        case CimPackage.CS_CONVERTER__OPERATING_MODE:
            return getOperatingMode();
        case CimPackage.CS_CONVERTER__PPCC_CONTROL:
            return getPPccControl();
        case CimPackage.CS_CONVERTER__TARGET_ALPHA:
            return getTargetAlpha();
        case CimPackage.CS_CONVERTER__TARGET_GAMMA:
            return getTargetGamma();
        case CimPackage.CS_CONVERTER__GAMMA:
            return getGamma();
        case CimPackage.CS_CONVERTER__ALPHA:
            return getAlpha();
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
        case CimPackage.CS_CONVERTER__RATED_IDC:
            setRatedIdc( ( Double ) newValue );
            return;
        case CimPackage.CS_CONVERTER__MAX_ALPHA:
            setMaxAlpha( ( Double ) newValue );
            return;
        case CimPackage.CS_CONVERTER__MIN_ALPHA:
            setMinAlpha( ( Double ) newValue );
            return;
        case CimPackage.CS_CONVERTER__MIN_GAMMA:
            setMinGamma( ( Double ) newValue );
            return;
        case CimPackage.CS_CONVERTER__MAX_IDC:
            setMaxIdc( ( Double ) newValue );
            return;
        case CimPackage.CS_CONVERTER__MIN_IDC:
            setMinIdc( ( Double ) newValue );
            return;
        case CimPackage.CS_CONVERTER__MAX_GAMMA:
            setMaxGamma( ( Double ) newValue );
            return;
        case CimPackage.CS_CONVERTER__CSC_DYNAMICS:
            setCSCDynamics( ( CSCDynamics ) newValue );
            return;
        case CimPackage.CS_CONVERTER__TARGET_IDC:
            setTargetIdc( ( Double ) newValue );
            return;
        case CimPackage.CS_CONVERTER__OPERATING_MODE:
            setOperatingMode( ( CsOperatingModeKind ) newValue );
            return;
        case CimPackage.CS_CONVERTER__PPCC_CONTROL:
            setPPccControl( ( CsPpccControlKind ) newValue );
            return;
        case CimPackage.CS_CONVERTER__TARGET_ALPHA:
            setTargetAlpha( ( Double ) newValue );
            return;
        case CimPackage.CS_CONVERTER__TARGET_GAMMA:
            setTargetGamma( ( Double ) newValue );
            return;
        case CimPackage.CS_CONVERTER__GAMMA:
            setGamma( ( Double ) newValue );
            return;
        case CimPackage.CS_CONVERTER__ALPHA:
            setAlpha( ( Double ) newValue );
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
        case CimPackage.CS_CONVERTER__RATED_IDC:
            unsetRatedIdc();
            return;
        case CimPackage.CS_CONVERTER__MAX_ALPHA:
            unsetMaxAlpha();
            return;
        case CimPackage.CS_CONVERTER__MIN_ALPHA:
            unsetMinAlpha();
            return;
        case CimPackage.CS_CONVERTER__MIN_GAMMA:
            unsetMinGamma();
            return;
        case CimPackage.CS_CONVERTER__MAX_IDC:
            unsetMaxIdc();
            return;
        case CimPackage.CS_CONVERTER__MIN_IDC:
            unsetMinIdc();
            return;
        case CimPackage.CS_CONVERTER__MAX_GAMMA:
            unsetMaxGamma();
            return;
        case CimPackage.CS_CONVERTER__CSC_DYNAMICS:
            unsetCSCDynamics();
            return;
        case CimPackage.CS_CONVERTER__TARGET_IDC:
            unsetTargetIdc();
            return;
        case CimPackage.CS_CONVERTER__OPERATING_MODE:
            unsetOperatingMode();
            return;
        case CimPackage.CS_CONVERTER__PPCC_CONTROL:
            unsetPPccControl();
            return;
        case CimPackage.CS_CONVERTER__TARGET_ALPHA:
            unsetTargetAlpha();
            return;
        case CimPackage.CS_CONVERTER__TARGET_GAMMA:
            unsetTargetGamma();
            return;
        case CimPackage.CS_CONVERTER__GAMMA:
            unsetGamma();
            return;
        case CimPackage.CS_CONVERTER__ALPHA:
            unsetAlpha();
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
        case CimPackage.CS_CONVERTER__RATED_IDC:
            return isSetRatedIdc();
        case CimPackage.CS_CONVERTER__MAX_ALPHA:
            return isSetMaxAlpha();
        case CimPackage.CS_CONVERTER__MIN_ALPHA:
            return isSetMinAlpha();
        case CimPackage.CS_CONVERTER__MIN_GAMMA:
            return isSetMinGamma();
        case CimPackage.CS_CONVERTER__MAX_IDC:
            return isSetMaxIdc();
        case CimPackage.CS_CONVERTER__MIN_IDC:
            return isSetMinIdc();
        case CimPackage.CS_CONVERTER__MAX_GAMMA:
            return isSetMaxGamma();
        case CimPackage.CS_CONVERTER__CSC_DYNAMICS:
            return isSetCSCDynamics();
        case CimPackage.CS_CONVERTER__TARGET_IDC:
            return isSetTargetIdc();
        case CimPackage.CS_CONVERTER__OPERATING_MODE:
            return isSetOperatingMode();
        case CimPackage.CS_CONVERTER__PPCC_CONTROL:
            return isSetPPccControl();
        case CimPackage.CS_CONVERTER__TARGET_ALPHA:
            return isSetTargetAlpha();
        case CimPackage.CS_CONVERTER__TARGET_GAMMA:
            return isSetTargetGamma();
        case CimPackage.CS_CONVERTER__GAMMA:
            return isSetGamma();
        case CimPackage.CS_CONVERTER__ALPHA:
            return isSetAlpha();
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
        result.append( " (ratedIdc: " );
        if( ratedIdcESet )
            result.append( ratedIdc );
        else
            result.append( "<unset>" );
        result.append( ", maxAlpha: " );
        if( maxAlphaESet )
            result.append( maxAlpha );
        else
            result.append( "<unset>" );
        result.append( ", minAlpha: " );
        if( minAlphaESet )
            result.append( minAlpha );
        else
            result.append( "<unset>" );
        result.append( ", minGamma: " );
        if( minGammaESet )
            result.append( minGamma );
        else
            result.append( "<unset>" );
        result.append( ", maxIdc: " );
        if( maxIdcESet )
            result.append( maxIdc );
        else
            result.append( "<unset>" );
        result.append( ", minIdc: " );
        if( minIdcESet )
            result.append( minIdc );
        else
            result.append( "<unset>" );
        result.append( ", maxGamma: " );
        if( maxGammaESet )
            result.append( maxGamma );
        else
            result.append( "<unset>" );
        result.append( ", targetIdc: " );
        if( targetIdcESet )
            result.append( targetIdc );
        else
            result.append( "<unset>" );
        result.append( ", operatingMode: " );
        if( operatingModeESet )
            result.append( operatingMode );
        else
            result.append( "<unset>" );
        result.append( ", pPccControl: " );
        if( pPccControlESet )
            result.append( pPccControl );
        else
            result.append( "<unset>" );
        result.append( ", targetAlpha: " );
        if( targetAlphaESet )
            result.append( targetAlpha );
        else
            result.append( "<unset>" );
        result.append( ", targetGamma: " );
        if( targetGammaESet )
            result.append( targetGamma );
        else
            result.append( "<unset>" );
        result.append( ", gamma: " );
        if( gammaESet )
            result.append( gamma );
        else
            result.append( "<unset>" );
        result.append( ", alpha: " );
        if( alphaESet )
            result.append( alpha );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //CsConverterImpl

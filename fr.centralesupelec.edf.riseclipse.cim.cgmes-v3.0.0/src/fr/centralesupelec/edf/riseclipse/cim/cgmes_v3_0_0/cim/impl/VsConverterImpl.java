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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VSCDynamics;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsCapabilityCurve;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsPpccControlKind;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsQpccControlKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vs Converter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.VsConverterImpl#getMaxModulationIndex <em>Max Modulation Index</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.VsConverterImpl#getCapabilityCurve <em>Capability Curve</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.VsConverterImpl#getVSCDynamics <em>VSC Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.VsConverterImpl#getTargetQpcc <em>Target Qpcc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.VsConverterImpl#getQShare <em>QShare</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.VsConverterImpl#getDroop <em>Droop</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.VsConverterImpl#getPPccControl <em>PPcc Control</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.VsConverterImpl#getTargetPhasePcc <em>Target Phase Pcc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.VsConverterImpl#getTargetPWMfactor <em>Target PW Mfactor</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.VsConverterImpl#getTargetUpcc <em>Target Upcc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.VsConverterImpl#getQPccControl <em>QPcc Control</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.VsConverterImpl#getDroopCompensation <em>Droop Compensation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.VsConverterImpl#getTargetPowerFactorPcc <em>Target Power Factor Pcc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.VsConverterImpl#getDelta <em>Delta</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.VsConverterImpl#getUv <em>Uv</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VsConverterImpl extends ACDCConverterImpl implements VsConverter {
    /**
     * The default value of the '{@link #getMaxModulationIndex() <em>Max Modulation Index</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxModulationIndex()
     * @generated
     * @ordered
     */
    protected static final Double MAX_MODULATION_INDEX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxModulationIndex() <em>Max Modulation Index</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxModulationIndex()
     * @generated
     * @ordered
     */
    protected Double maxModulationIndex = MAX_MODULATION_INDEX_EDEFAULT;

    /**
     * This is true if the Max Modulation Index attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxModulationIndexESet;

    /**
     * The cached value of the '{@link #getCapabilityCurve() <em>Capability Curve</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCapabilityCurve()
     * @generated
     * @ordered
     */
    protected VsCapabilityCurve capabilityCurve;

    /**
     * This is true if the Capability Curve reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean capabilityCurveESet;

    /**
     * The cached value of the '{@link #getVSCDynamics() <em>VSC Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVSCDynamics()
     * @generated
     * @ordered
     */
    protected VSCDynamics vscDynamics;

    /**
     * This is true if the VSC Dynamics reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vscDynamicsESet;

    /**
     * The default value of the '{@link #getTargetQpcc() <em>Target Qpcc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetQpcc()
     * @generated
     * @ordered
     */
    protected static final Double TARGET_QPCC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTargetQpcc() <em>Target Qpcc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetQpcc()
     * @generated
     * @ordered
     */
    protected Double targetQpcc = TARGET_QPCC_EDEFAULT;

    /**
     * This is true if the Target Qpcc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean targetQpccESet;

    /**
     * The default value of the '{@link #getQShare() <em>QShare</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQShare()
     * @generated
     * @ordered
     */
    protected static final Double QSHARE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getQShare() <em>QShare</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQShare()
     * @generated
     * @ordered
     */
    protected Double qShare = QSHARE_EDEFAULT;

    /**
     * This is true if the QShare attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean qShareESet;

    /**
     * The default value of the '{@link #getDroop() <em>Droop</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDroop()
     * @generated
     * @ordered
     */
    protected static final Double DROOP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDroop() <em>Droop</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDroop()
     * @generated
     * @ordered
     */
    protected Double droop = DROOP_EDEFAULT;

    /**
     * This is true if the Droop attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean droopESet;

    /**
     * The default value of the '{@link #getPPccControl() <em>PPcc Control</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPPccControl()
     * @generated
     * @ordered
     */
    protected static final VsPpccControlKind PPCC_CONTROL_EDEFAULT = VsPpccControlKind.PPCC_AND_UDC_DROOP_WITH_COMPENSATION;

    /**
     * The cached value of the '{@link #getPPccControl() <em>PPcc Control</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPPccControl()
     * @generated
     * @ordered
     */
    protected VsPpccControlKind pPccControl = PPCC_CONTROL_EDEFAULT;

    /**
     * This is true if the PPcc Control attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pPccControlESet;

    /**
     * The default value of the '{@link #getTargetPhasePcc() <em>Target Phase Pcc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetPhasePcc()
     * @generated
     * @ordered
     */
    protected static final Double TARGET_PHASE_PCC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTargetPhasePcc() <em>Target Phase Pcc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetPhasePcc()
     * @generated
     * @ordered
     */
    protected Double targetPhasePcc = TARGET_PHASE_PCC_EDEFAULT;

    /**
     * This is true if the Target Phase Pcc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean targetPhasePccESet;

    /**
     * The default value of the '{@link #getTargetPWMfactor() <em>Target PW Mfactor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetPWMfactor()
     * @generated
     * @ordered
     */
    protected static final Double TARGET_PW_MFACTOR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTargetPWMfactor() <em>Target PW Mfactor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetPWMfactor()
     * @generated
     * @ordered
     */
    protected Double targetPWMfactor = TARGET_PW_MFACTOR_EDEFAULT;

    /**
     * This is true if the Target PW Mfactor attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean targetPWMfactorESet;

    /**
     * The default value of the '{@link #getTargetUpcc() <em>Target Upcc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetUpcc()
     * @generated
     * @ordered
     */
    protected static final Double TARGET_UPCC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTargetUpcc() <em>Target Upcc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetUpcc()
     * @generated
     * @ordered
     */
    protected Double targetUpcc = TARGET_UPCC_EDEFAULT;

    /**
     * This is true if the Target Upcc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean targetUpccESet;

    /**
     * The default value of the '{@link #getQPccControl() <em>QPcc Control</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQPccControl()
     * @generated
     * @ordered
     */
    protected static final VsQpccControlKind QPCC_CONTROL_EDEFAULT = VsQpccControlKind.PULSE_WIDTH_MODULATION;

    /**
     * The cached value of the '{@link #getQPccControl() <em>QPcc Control</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQPccControl()
     * @generated
     * @ordered
     */
    protected VsQpccControlKind qPccControl = QPCC_CONTROL_EDEFAULT;

    /**
     * This is true if the QPcc Control attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean qPccControlESet;

    /**
     * The default value of the '{@link #getDroopCompensation() <em>Droop Compensation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDroopCompensation()
     * @generated
     * @ordered
     */
    protected static final Double DROOP_COMPENSATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDroopCompensation() <em>Droop Compensation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDroopCompensation()
     * @generated
     * @ordered
     */
    protected Double droopCompensation = DROOP_COMPENSATION_EDEFAULT;

    /**
     * This is true if the Droop Compensation attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean droopCompensationESet;

    /**
     * The default value of the '{@link #getTargetPowerFactorPcc() <em>Target Power Factor Pcc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetPowerFactorPcc()
     * @generated
     * @ordered
     */
    protected static final Double TARGET_POWER_FACTOR_PCC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTargetPowerFactorPcc() <em>Target Power Factor Pcc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetPowerFactorPcc()
     * @generated
     * @ordered
     */
    protected Double targetPowerFactorPcc = TARGET_POWER_FACTOR_PCC_EDEFAULT;

    /**
     * This is true if the Target Power Factor Pcc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean targetPowerFactorPccESet;

    /**
     * The default value of the '{@link #getDelta() <em>Delta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDelta()
     * @generated
     * @ordered
     */
    protected static final Double DELTA_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDelta() <em>Delta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDelta()
     * @generated
     * @ordered
     */
    protected Double delta = DELTA_EDEFAULT;

    /**
     * This is true if the Delta attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean deltaESet;

    /**
     * The default value of the '{@link #getUv() <em>Uv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUv()
     * @generated
     * @ordered
     */
    protected static final Double UV_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getUv() <em>Uv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUv()
     * @generated
     * @ordered
     */
    protected Double uv = UV_EDEFAULT;

    /**
     * This is true if the Uv attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean uvESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected VsConverterImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getVsConverter();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VsCapabilityCurve getCapabilityCurve() {
        return capabilityCurve;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCapabilityCurve( VsCapabilityCurve newCapabilityCurve, NotificationChain msgs ) {
        VsCapabilityCurve oldCapabilityCurve = capabilityCurve;
        capabilityCurve = newCapabilityCurve;
        boolean oldCapabilityCurveESet = capabilityCurveESet;
        capabilityCurveESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.VS_CONVERTER__CAPABILITY_CURVE, oldCapabilityCurve, newCapabilityCurve,
                    !oldCapabilityCurveESet );
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
    public void setCapabilityCurve( VsCapabilityCurve newCapabilityCurve ) {
        if( newCapabilityCurve != capabilityCurve ) {
            NotificationChain msgs = null;
            if( capabilityCurve != null )
                msgs = ( ( InternalEObject ) capabilityCurve ).eInverseRemove( this,
                        CimPackage.VS_CAPABILITY_CURVE__VS_CONVERTER_DC_SIDES, VsCapabilityCurve.class, msgs );
            if( newCapabilityCurve != null )
                msgs = ( ( InternalEObject ) newCapabilityCurve ).eInverseAdd( this,
                        CimPackage.VS_CAPABILITY_CURVE__VS_CONVERTER_DC_SIDES, VsCapabilityCurve.class, msgs );
            msgs = basicSetCapabilityCurve( newCapabilityCurve, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCapabilityCurveESet = capabilityCurveESet;
            capabilityCurveESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.VS_CONVERTER__CAPABILITY_CURVE,
                        newCapabilityCurve, newCapabilityCurve, !oldCapabilityCurveESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetCapabilityCurve( NotificationChain msgs ) {
        VsCapabilityCurve oldCapabilityCurve = capabilityCurve;
        capabilityCurve = null;
        boolean oldCapabilityCurveESet = capabilityCurveESet;
        capabilityCurveESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.VS_CONVERTER__CAPABILITY_CURVE, oldCapabilityCurve, null, oldCapabilityCurveESet );
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
    public void unsetCapabilityCurve() {
        if( capabilityCurve != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) capabilityCurve ).eInverseRemove( this,
                    CimPackage.VS_CAPABILITY_CURVE__VS_CONVERTER_DC_SIDES, VsCapabilityCurve.class, msgs );
            msgs = basicUnsetCapabilityCurve( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCapabilityCurveESet = capabilityCurveESet;
            capabilityCurveESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.VS_CONVERTER__CAPABILITY_CURVE,
                        null, null, oldCapabilityCurveESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCapabilityCurve() {
        return capabilityCurveESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VSCDynamics getVSCDynamics() {
        if( vscDynamics != null && vscDynamics.eIsProxy() ) {
            InternalEObject oldVSCDynamics = ( InternalEObject ) vscDynamics;
            vscDynamics = ( VSCDynamics ) eResolveProxy( oldVSCDynamics );
            if( vscDynamics != oldVSCDynamics ) {
                if( eNotificationRequired() )
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE, CimPackage.VS_CONVERTER__VSC_DYNAMICS,
                            oldVSCDynamics, vscDynamics ) );
            }
        }
        return vscDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public VSCDynamics basicGetVSCDynamics() {
        return vscDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetVSCDynamics( VSCDynamics newVSCDynamics, NotificationChain msgs ) {
        VSCDynamics oldVSCDynamics = vscDynamics;
        vscDynamics = newVSCDynamics;
        boolean oldVSCDynamicsESet = vscDynamicsESet;
        vscDynamicsESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.VS_CONVERTER__VSC_DYNAMICS, oldVSCDynamics, newVSCDynamics, !oldVSCDynamicsESet );
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
    public void setVSCDynamics( VSCDynamics newVSCDynamics ) {
        if( newVSCDynamics != vscDynamics ) {
            NotificationChain msgs = null;
            if( vscDynamics != null )
                msgs = ( ( InternalEObject ) vscDynamics ).eInverseRemove( this, CimPackage.VSC_DYNAMICS__VS_CONVERTER,
                        VSCDynamics.class, msgs );
            if( newVSCDynamics != null )
                msgs = ( ( InternalEObject ) newVSCDynamics ).eInverseAdd( this, CimPackage.VSC_DYNAMICS__VS_CONVERTER,
                        VSCDynamics.class, msgs );
            msgs = basicSetVSCDynamics( newVSCDynamics, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldVSCDynamicsESet = vscDynamicsESet;
            vscDynamicsESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.VS_CONVERTER__VSC_DYNAMICS,
                        newVSCDynamics, newVSCDynamics, !oldVSCDynamicsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetVSCDynamics( NotificationChain msgs ) {
        VSCDynamics oldVSCDynamics = vscDynamics;
        vscDynamics = null;
        boolean oldVSCDynamicsESet = vscDynamicsESet;
        vscDynamicsESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.VS_CONVERTER__VSC_DYNAMICS, oldVSCDynamics, null, oldVSCDynamicsESet );
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
    public void unsetVSCDynamics() {
        if( vscDynamics != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) vscDynamics ).eInverseRemove( this, CimPackage.VSC_DYNAMICS__VS_CONVERTER,
                    VSCDynamics.class, msgs );
            msgs = basicUnsetVSCDynamics( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldVSCDynamicsESet = vscDynamicsESet;
            vscDynamicsESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.VS_CONVERTER__VSC_DYNAMICS, null,
                        null, oldVSCDynamicsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVSCDynamics() {
        return vscDynamicsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTargetQpcc() {
        return targetQpcc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTargetQpcc( Double newTargetQpcc ) {
        Double oldTargetQpcc = targetQpcc;
        targetQpcc = newTargetQpcc;
        boolean oldTargetQpccESet = targetQpccESet;
        targetQpccESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.VS_CONVERTER__TARGET_QPCC, oldTargetQpcc,
                    targetQpcc, !oldTargetQpccESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTargetQpcc() {
        Double oldTargetQpcc = targetQpcc;
        boolean oldTargetQpccESet = targetQpccESet;
        targetQpcc = TARGET_QPCC_EDEFAULT;
        targetQpccESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.VS_CONVERTER__TARGET_QPCC,
                    oldTargetQpcc, TARGET_QPCC_EDEFAULT, oldTargetQpccESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTargetQpcc() {
        return targetQpccESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getQShare() {
        return qShare;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setQShare( Double newQShare ) {
        Double oldQShare = qShare;
        qShare = newQShare;
        boolean oldQShareESet = qShareESet;
        qShareESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.VS_CONVERTER__QSHARE, oldQShare, qShare,
                    !oldQShareESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetQShare() {
        Double oldQShare = qShare;
        boolean oldQShareESet = qShareESet;
        qShare = QSHARE_EDEFAULT;
        qShareESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.VS_CONVERTER__QSHARE, oldQShare,
                    QSHARE_EDEFAULT, oldQShareESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetQShare() {
        return qShareESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getDroop() {
        return droop;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDroop( Double newDroop ) {
        Double oldDroop = droop;
        droop = newDroop;
        boolean oldDroopESet = droopESet;
        droopESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.VS_CONVERTER__DROOP, oldDroop, droop,
                    !oldDroopESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDroop() {
        Double oldDroop = droop;
        boolean oldDroopESet = droopESet;
        droop = DROOP_EDEFAULT;
        droopESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.VS_CONVERTER__DROOP, oldDroop,
                    DROOP_EDEFAULT, oldDroopESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDroop() {
        return droopESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VsPpccControlKind getPPccControl() {
        return pPccControl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPPccControl( VsPpccControlKind newPPccControl ) {
        VsPpccControlKind oldPPccControl = pPccControl;
        pPccControl = newPPccControl == null ? PPCC_CONTROL_EDEFAULT : newPPccControl;
        boolean oldPPccControlESet = pPccControlESet;
        pPccControlESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.VS_CONVERTER__PPCC_CONTROL,
                    oldPPccControl, pPccControl, !oldPPccControlESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPPccControl() {
        VsPpccControlKind oldPPccControl = pPccControl;
        boolean oldPPccControlESet = pPccControlESet;
        pPccControl = PPCC_CONTROL_EDEFAULT;
        pPccControlESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.VS_CONVERTER__PPCC_CONTROL,
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
    public Double getTargetPhasePcc() {
        return targetPhasePcc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTargetPhasePcc( Double newTargetPhasePcc ) {
        Double oldTargetPhasePcc = targetPhasePcc;
        targetPhasePcc = newTargetPhasePcc;
        boolean oldTargetPhasePccESet = targetPhasePccESet;
        targetPhasePccESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.VS_CONVERTER__TARGET_PHASE_PCC,
                    oldTargetPhasePcc, targetPhasePcc, !oldTargetPhasePccESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTargetPhasePcc() {
        Double oldTargetPhasePcc = targetPhasePcc;
        boolean oldTargetPhasePccESet = targetPhasePccESet;
        targetPhasePcc = TARGET_PHASE_PCC_EDEFAULT;
        targetPhasePccESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.VS_CONVERTER__TARGET_PHASE_PCC,
                    oldTargetPhasePcc, TARGET_PHASE_PCC_EDEFAULT, oldTargetPhasePccESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTargetPhasePcc() {
        return targetPhasePccESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTargetPWMfactor() {
        return targetPWMfactor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTargetPWMfactor( Double newTargetPWMfactor ) {
        Double oldTargetPWMfactor = targetPWMfactor;
        targetPWMfactor = newTargetPWMfactor;
        boolean oldTargetPWMfactorESet = targetPWMfactorESet;
        targetPWMfactorESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.VS_CONVERTER__TARGET_PW_MFACTOR,
                    oldTargetPWMfactor, targetPWMfactor, !oldTargetPWMfactorESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTargetPWMfactor() {
        Double oldTargetPWMfactor = targetPWMfactor;
        boolean oldTargetPWMfactorESet = targetPWMfactorESet;
        targetPWMfactor = TARGET_PW_MFACTOR_EDEFAULT;
        targetPWMfactorESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.VS_CONVERTER__TARGET_PW_MFACTOR,
                    oldTargetPWMfactor, TARGET_PW_MFACTOR_EDEFAULT, oldTargetPWMfactorESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTargetPWMfactor() {
        return targetPWMfactorESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTargetUpcc() {
        return targetUpcc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTargetUpcc( Double newTargetUpcc ) {
        Double oldTargetUpcc = targetUpcc;
        targetUpcc = newTargetUpcc;
        boolean oldTargetUpccESet = targetUpccESet;
        targetUpccESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.VS_CONVERTER__TARGET_UPCC, oldTargetUpcc,
                    targetUpcc, !oldTargetUpccESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTargetUpcc() {
        Double oldTargetUpcc = targetUpcc;
        boolean oldTargetUpccESet = targetUpccESet;
        targetUpcc = TARGET_UPCC_EDEFAULT;
        targetUpccESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.VS_CONVERTER__TARGET_UPCC,
                    oldTargetUpcc, TARGET_UPCC_EDEFAULT, oldTargetUpccESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTargetUpcc() {
        return targetUpccESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VsQpccControlKind getQPccControl() {
        return qPccControl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setQPccControl( VsQpccControlKind newQPccControl ) {
        VsQpccControlKind oldQPccControl = qPccControl;
        qPccControl = newQPccControl == null ? QPCC_CONTROL_EDEFAULT : newQPccControl;
        boolean oldQPccControlESet = qPccControlESet;
        qPccControlESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.VS_CONVERTER__QPCC_CONTROL,
                    oldQPccControl, qPccControl, !oldQPccControlESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetQPccControl() {
        VsQpccControlKind oldQPccControl = qPccControl;
        boolean oldQPccControlESet = qPccControlESet;
        qPccControl = QPCC_CONTROL_EDEFAULT;
        qPccControlESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.VS_CONVERTER__QPCC_CONTROL,
                    oldQPccControl, QPCC_CONTROL_EDEFAULT, oldQPccControlESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetQPccControl() {
        return qPccControlESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getDroopCompensation() {
        return droopCompensation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDroopCompensation( Double newDroopCompensation ) {
        Double oldDroopCompensation = droopCompensation;
        droopCompensation = newDroopCompensation;
        boolean oldDroopCompensationESet = droopCompensationESet;
        droopCompensationESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.VS_CONVERTER__DROOP_COMPENSATION,
                    oldDroopCompensation, droopCompensation, !oldDroopCompensationESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDroopCompensation() {
        Double oldDroopCompensation = droopCompensation;
        boolean oldDroopCompensationESet = droopCompensationESet;
        droopCompensation = DROOP_COMPENSATION_EDEFAULT;
        droopCompensationESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.VS_CONVERTER__DROOP_COMPENSATION,
                    oldDroopCompensation, DROOP_COMPENSATION_EDEFAULT, oldDroopCompensationESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDroopCompensation() {
        return droopCompensationESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTargetPowerFactorPcc() {
        return targetPowerFactorPcc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTargetPowerFactorPcc( Double newTargetPowerFactorPcc ) {
        Double oldTargetPowerFactorPcc = targetPowerFactorPcc;
        targetPowerFactorPcc = newTargetPowerFactorPcc;
        boolean oldTargetPowerFactorPccESet = targetPowerFactorPccESet;
        targetPowerFactorPccESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.VS_CONVERTER__TARGET_POWER_FACTOR_PCC,
                    oldTargetPowerFactorPcc, targetPowerFactorPcc, !oldTargetPowerFactorPccESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTargetPowerFactorPcc() {
        Double oldTargetPowerFactorPcc = targetPowerFactorPcc;
        boolean oldTargetPowerFactorPccESet = targetPowerFactorPccESet;
        targetPowerFactorPcc = TARGET_POWER_FACTOR_PCC_EDEFAULT;
        targetPowerFactorPccESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.VS_CONVERTER__TARGET_POWER_FACTOR_PCC,
                    oldTargetPowerFactorPcc, TARGET_POWER_FACTOR_PCC_EDEFAULT, oldTargetPowerFactorPccESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTargetPowerFactorPcc() {
        return targetPowerFactorPccESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getDelta() {
        return delta;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setDelta( Double newDelta ) {
        Double oldDelta = delta;
        delta = newDelta;
        boolean oldDeltaESet = deltaESet;
        deltaESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.VS_CONVERTER__DELTA, oldDelta, delta,
                    !oldDeltaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDelta() {
        Double oldDelta = delta;
        boolean oldDeltaESet = deltaESet;
        delta = DELTA_EDEFAULT;
        deltaESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.VS_CONVERTER__DELTA, oldDelta,
                    DELTA_EDEFAULT, oldDeltaESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDelta() {
        return deltaESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getUv() {
        return uv;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setUv( Double newUv ) {
        Double oldUv = uv;
        uv = newUv;
        boolean oldUvESet = uvESet;
        uvESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.VS_CONVERTER__UV, oldUv, uv,
                    !oldUvESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetUv() {
        Double oldUv = uv;
        boolean oldUvESet = uvESet;
        uv = UV_EDEFAULT;
        uvESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.VS_CONVERTER__UV, oldUv, UV_EDEFAULT,
                    oldUvESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUv() {
        return uvESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getMaxModulationIndex() {
        return maxModulationIndex;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaxModulationIndex( Double newMaxModulationIndex ) {
        Double oldMaxModulationIndex = maxModulationIndex;
        maxModulationIndex = newMaxModulationIndex;
        boolean oldMaxModulationIndexESet = maxModulationIndexESet;
        maxModulationIndexESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.VS_CONVERTER__MAX_MODULATION_INDEX,
                    oldMaxModulationIndex, maxModulationIndex, !oldMaxModulationIndexESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaxModulationIndex() {
        Double oldMaxModulationIndex = maxModulationIndex;
        boolean oldMaxModulationIndexESet = maxModulationIndexESet;
        maxModulationIndex = MAX_MODULATION_INDEX_EDEFAULT;
        maxModulationIndexESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.VS_CONVERTER__MAX_MODULATION_INDEX,
                    oldMaxModulationIndex, MAX_MODULATION_INDEX_EDEFAULT, oldMaxModulationIndexESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaxModulationIndex() {
        return maxModulationIndexESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.VS_CONVERTER__CAPABILITY_CURVE:
            if( capabilityCurve != null )
                msgs = ( ( InternalEObject ) capabilityCurve ).eInverseRemove( this,
                        CimPackage.VS_CAPABILITY_CURVE__VS_CONVERTER_DC_SIDES, VsCapabilityCurve.class, msgs );
            return basicSetCapabilityCurve( ( VsCapabilityCurve ) otherEnd, msgs );
        case CimPackage.VS_CONVERTER__VSC_DYNAMICS:
            if( vscDynamics != null )
                msgs = ( ( InternalEObject ) vscDynamics ).eInverseRemove( this, CimPackage.VSC_DYNAMICS__VS_CONVERTER,
                        VSCDynamics.class, msgs );
            return basicSetVSCDynamics( ( VSCDynamics ) otherEnd, msgs );
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
        case CimPackage.VS_CONVERTER__CAPABILITY_CURVE:
            return basicUnsetCapabilityCurve( msgs );
        case CimPackage.VS_CONVERTER__VSC_DYNAMICS:
            return basicUnsetVSCDynamics( msgs );
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
        case CimPackage.VS_CONVERTER__MAX_MODULATION_INDEX:
            return getMaxModulationIndex();
        case CimPackage.VS_CONVERTER__CAPABILITY_CURVE:
            return getCapabilityCurve();
        case CimPackage.VS_CONVERTER__VSC_DYNAMICS:
            if( resolve ) return getVSCDynamics();
            return basicGetVSCDynamics();
        case CimPackage.VS_CONVERTER__TARGET_QPCC:
            return getTargetQpcc();
        case CimPackage.VS_CONVERTER__QSHARE:
            return getQShare();
        case CimPackage.VS_CONVERTER__DROOP:
            return getDroop();
        case CimPackage.VS_CONVERTER__PPCC_CONTROL:
            return getPPccControl();
        case CimPackage.VS_CONVERTER__TARGET_PHASE_PCC:
            return getTargetPhasePcc();
        case CimPackage.VS_CONVERTER__TARGET_PW_MFACTOR:
            return getTargetPWMfactor();
        case CimPackage.VS_CONVERTER__TARGET_UPCC:
            return getTargetUpcc();
        case CimPackage.VS_CONVERTER__QPCC_CONTROL:
            return getQPccControl();
        case CimPackage.VS_CONVERTER__DROOP_COMPENSATION:
            return getDroopCompensation();
        case CimPackage.VS_CONVERTER__TARGET_POWER_FACTOR_PCC:
            return getTargetPowerFactorPcc();
        case CimPackage.VS_CONVERTER__DELTA:
            return getDelta();
        case CimPackage.VS_CONVERTER__UV:
            return getUv();
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
        case CimPackage.VS_CONVERTER__MAX_MODULATION_INDEX:
            setMaxModulationIndex( ( Double ) newValue );
            return;
        case CimPackage.VS_CONVERTER__CAPABILITY_CURVE:
            setCapabilityCurve( ( VsCapabilityCurve ) newValue );
            return;
        case CimPackage.VS_CONVERTER__VSC_DYNAMICS:
            setVSCDynamics( ( VSCDynamics ) newValue );
            return;
        case CimPackage.VS_CONVERTER__TARGET_QPCC:
            setTargetQpcc( ( Double ) newValue );
            return;
        case CimPackage.VS_CONVERTER__QSHARE:
            setQShare( ( Double ) newValue );
            return;
        case CimPackage.VS_CONVERTER__DROOP:
            setDroop( ( Double ) newValue );
            return;
        case CimPackage.VS_CONVERTER__PPCC_CONTROL:
            setPPccControl( ( VsPpccControlKind ) newValue );
            return;
        case CimPackage.VS_CONVERTER__TARGET_PHASE_PCC:
            setTargetPhasePcc( ( Double ) newValue );
            return;
        case CimPackage.VS_CONVERTER__TARGET_PW_MFACTOR:
            setTargetPWMfactor( ( Double ) newValue );
            return;
        case CimPackage.VS_CONVERTER__TARGET_UPCC:
            setTargetUpcc( ( Double ) newValue );
            return;
        case CimPackage.VS_CONVERTER__QPCC_CONTROL:
            setQPccControl( ( VsQpccControlKind ) newValue );
            return;
        case CimPackage.VS_CONVERTER__DROOP_COMPENSATION:
            setDroopCompensation( ( Double ) newValue );
            return;
        case CimPackage.VS_CONVERTER__TARGET_POWER_FACTOR_PCC:
            setTargetPowerFactorPcc( ( Double ) newValue );
            return;
        case CimPackage.VS_CONVERTER__DELTA:
            setDelta( ( Double ) newValue );
            return;
        case CimPackage.VS_CONVERTER__UV:
            setUv( ( Double ) newValue );
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
        case CimPackage.VS_CONVERTER__MAX_MODULATION_INDEX:
            unsetMaxModulationIndex();
            return;
        case CimPackage.VS_CONVERTER__CAPABILITY_CURVE:
            unsetCapabilityCurve();
            return;
        case CimPackage.VS_CONVERTER__VSC_DYNAMICS:
            unsetVSCDynamics();
            return;
        case CimPackage.VS_CONVERTER__TARGET_QPCC:
            unsetTargetQpcc();
            return;
        case CimPackage.VS_CONVERTER__QSHARE:
            unsetQShare();
            return;
        case CimPackage.VS_CONVERTER__DROOP:
            unsetDroop();
            return;
        case CimPackage.VS_CONVERTER__PPCC_CONTROL:
            unsetPPccControl();
            return;
        case CimPackage.VS_CONVERTER__TARGET_PHASE_PCC:
            unsetTargetPhasePcc();
            return;
        case CimPackage.VS_CONVERTER__TARGET_PW_MFACTOR:
            unsetTargetPWMfactor();
            return;
        case CimPackage.VS_CONVERTER__TARGET_UPCC:
            unsetTargetUpcc();
            return;
        case CimPackage.VS_CONVERTER__QPCC_CONTROL:
            unsetQPccControl();
            return;
        case CimPackage.VS_CONVERTER__DROOP_COMPENSATION:
            unsetDroopCompensation();
            return;
        case CimPackage.VS_CONVERTER__TARGET_POWER_FACTOR_PCC:
            unsetTargetPowerFactorPcc();
            return;
        case CimPackage.VS_CONVERTER__DELTA:
            unsetDelta();
            return;
        case CimPackage.VS_CONVERTER__UV:
            unsetUv();
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
        case CimPackage.VS_CONVERTER__MAX_MODULATION_INDEX:
            return isSetMaxModulationIndex();
        case CimPackage.VS_CONVERTER__CAPABILITY_CURVE:
            return isSetCapabilityCurve();
        case CimPackage.VS_CONVERTER__VSC_DYNAMICS:
            return isSetVSCDynamics();
        case CimPackage.VS_CONVERTER__TARGET_QPCC:
            return isSetTargetQpcc();
        case CimPackage.VS_CONVERTER__QSHARE:
            return isSetQShare();
        case CimPackage.VS_CONVERTER__DROOP:
            return isSetDroop();
        case CimPackage.VS_CONVERTER__PPCC_CONTROL:
            return isSetPPccControl();
        case CimPackage.VS_CONVERTER__TARGET_PHASE_PCC:
            return isSetTargetPhasePcc();
        case CimPackage.VS_CONVERTER__TARGET_PW_MFACTOR:
            return isSetTargetPWMfactor();
        case CimPackage.VS_CONVERTER__TARGET_UPCC:
            return isSetTargetUpcc();
        case CimPackage.VS_CONVERTER__QPCC_CONTROL:
            return isSetQPccControl();
        case CimPackage.VS_CONVERTER__DROOP_COMPENSATION:
            return isSetDroopCompensation();
        case CimPackage.VS_CONVERTER__TARGET_POWER_FACTOR_PCC:
            return isSetTargetPowerFactorPcc();
        case CimPackage.VS_CONVERTER__DELTA:
            return isSetDelta();
        case CimPackage.VS_CONVERTER__UV:
            return isSetUv();
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
        result.append( " (maxModulationIndex: " );
        if( maxModulationIndexESet )
            result.append( maxModulationIndex );
        else
            result.append( "<unset>" );
        result.append( ", targetQpcc: " );
        if( targetQpccESet )
            result.append( targetQpcc );
        else
            result.append( "<unset>" );
        result.append( ", qShare: " );
        if( qShareESet )
            result.append( qShare );
        else
            result.append( "<unset>" );
        result.append( ", droop: " );
        if( droopESet )
            result.append( droop );
        else
            result.append( "<unset>" );
        result.append( ", pPccControl: " );
        if( pPccControlESet )
            result.append( pPccControl );
        else
            result.append( "<unset>" );
        result.append( ", targetPhasePcc: " );
        if( targetPhasePccESet )
            result.append( targetPhasePcc );
        else
            result.append( "<unset>" );
        result.append( ", targetPWMfactor: " );
        if( targetPWMfactorESet )
            result.append( targetPWMfactor );
        else
            result.append( "<unset>" );
        result.append( ", targetUpcc: " );
        if( targetUpccESet )
            result.append( targetUpcc );
        else
            result.append( "<unset>" );
        result.append( ", qPccControl: " );
        if( qPccControlESet )
            result.append( qPccControl );
        else
            result.append( "<unset>" );
        result.append( ", droopCompensation: " );
        if( droopCompensationESet )
            result.append( droopCompensation );
        else
            result.append( "<unset>" );
        result.append( ", targetPowerFactorPcc: " );
        if( targetPowerFactorPccESet )
            result.append( targetPowerFactorPcc );
        else
            result.append( "<unset>" );
        result.append( ", delta: " );
        if( deltaESet )
            result.append( delta );
        else
            result.append( "<unset>" );
        result.append( ", uv: " );
        if( uvESet )
            result.append( uv );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //VsConverterImpl

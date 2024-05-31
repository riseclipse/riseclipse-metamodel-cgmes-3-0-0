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

import java.math.BigInteger;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvTapStep;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapChanger;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapChangerControl;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapSchedule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tap Changer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.TapChangerImpl#getNeutralStep <em>Neutral Step</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.TapChangerImpl#getTapSchedules <em>Tap Schedules</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.TapChangerImpl#getNormalStep <em>Normal Step</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.TapChangerImpl#getLtcFlag <em>Ltc Flag</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.TapChangerImpl#getTapChangerControl <em>Tap Changer Control</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.TapChangerImpl#getLowStep <em>Low Step</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.TapChangerImpl#getNeutralU <em>Neutral U</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.TapChangerImpl#getHighStep <em>High Step</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.TapChangerImpl#getStep <em>Step</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.TapChangerImpl#getControlEnabled <em>Control Enabled</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.TapChangerImpl#getSvTapStep <em>Sv Tap Step</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TapChangerImpl extends PowerSystemResourceImpl implements TapChanger {
    /**
     * The default value of the '{@link #getNeutralStep() <em>Neutral Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNeutralStep()
     * @generated
     * @ordered
     */
    protected static final BigInteger NEUTRAL_STEP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNeutralStep() <em>Neutral Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNeutralStep()
     * @generated
     * @ordered
     */
    protected BigInteger neutralStep = NEUTRAL_STEP_EDEFAULT;

    /**
     * This is true if the Neutral Step attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean neutralStepESet;

    /**
     * The cached value of the '{@link #getTapSchedules() <em>Tap Schedules</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTapSchedules()
     * @generated
     * @ordered
     */
    protected EList< TapSchedule > tapSchedules;

    /**
     * The default value of the '{@link #getNormalStep() <em>Normal Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNormalStep()
     * @generated
     * @ordered
     */
    protected static final BigInteger NORMAL_STEP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNormalStep() <em>Normal Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNormalStep()
     * @generated
     * @ordered
     */
    protected BigInteger normalStep = NORMAL_STEP_EDEFAULT;

    /**
     * This is true if the Normal Step attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean normalStepESet;

    /**
     * The default value of the '{@link #getLtcFlag() <em>Ltc Flag</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLtcFlag()
     * @generated
     * @ordered
     */
    protected static final Boolean LTC_FLAG_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLtcFlag() <em>Ltc Flag</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLtcFlag()
     * @generated
     * @ordered
     */
    protected Boolean ltcFlag = LTC_FLAG_EDEFAULT;

    /**
     * This is true if the Ltc Flag attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ltcFlagESet;

    /**
     * The cached value of the '{@link #getTapChangerControl() <em>Tap Changer Control</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTapChangerControl()
     * @generated
     * @ordered
     */
    protected TapChangerControl tapChangerControl;

    /**
     * This is true if the Tap Changer Control reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tapChangerControlESet;

    /**
     * The default value of the '{@link #getLowStep() <em>Low Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLowStep()
     * @generated
     * @ordered
     */
    protected static final BigInteger LOW_STEP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLowStep() <em>Low Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLowStep()
     * @generated
     * @ordered
     */
    protected BigInteger lowStep = LOW_STEP_EDEFAULT;

    /**
     * This is true if the Low Step attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lowStepESet;

    /**
     * The default value of the '{@link #getNeutralU() <em>Neutral U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNeutralU()
     * @generated
     * @ordered
     */
    protected static final Double NEUTRAL_U_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNeutralU() <em>Neutral U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNeutralU()
     * @generated
     * @ordered
     */
    protected Double neutralU = NEUTRAL_U_EDEFAULT;

    /**
     * This is true if the Neutral U attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean neutralUESet;

    /**
     * The default value of the '{@link #getHighStep() <em>High Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHighStep()
     * @generated
     * @ordered
     */
    protected static final BigInteger HIGH_STEP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getHighStep() <em>High Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHighStep()
     * @generated
     * @ordered
     */
    protected BigInteger highStep = HIGH_STEP_EDEFAULT;

    /**
     * This is true if the High Step attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean highStepESet;

    /**
     * The default value of the '{@link #getStep() <em>Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStep()
     * @generated
     * @ordered
     */
    protected static final Double STEP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStep() <em>Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStep()
     * @generated
     * @ordered
     */
    protected Double step = STEP_EDEFAULT;

    /**
     * This is true if the Step attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean stepESet;

    /**
     * The default value of the '{@link #getControlEnabled() <em>Control Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getControlEnabled()
     * @generated
     * @ordered
     */
    protected static final Boolean CONTROL_ENABLED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getControlEnabled() <em>Control Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getControlEnabled()
     * @generated
     * @ordered
     */
    protected Boolean controlEnabled = CONTROL_ENABLED_EDEFAULT;

    /**
     * This is true if the Control Enabled attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean controlEnabledESet;

    /**
     * The cached value of the '{@link #getSvTapStep() <em>Sv Tap Step</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSvTapStep()
     * @generated
     * @ordered
     */
    protected SvTapStep svTapStep;

    /**
     * This is true if the Sv Tap Step reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean svTapStepESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TapChangerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getTapChanger();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TapChangerControl getTapChangerControl() {
        return tapChangerControl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTapChangerControl( TapChangerControl newTapChangerControl,
            NotificationChain msgs ) {
        TapChangerControl oldTapChangerControl = tapChangerControl;
        tapChangerControl = newTapChangerControl;
        boolean oldTapChangerControlESet = tapChangerControlESet;
        tapChangerControlESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TAP_CHANGER__TAP_CHANGER_CONTROL, oldTapChangerControl, newTapChangerControl,
                    !oldTapChangerControlESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTapChangerControl( TapChangerControl newTapChangerControl ) {
        if( newTapChangerControl != tapChangerControl ) {
            NotificationChain msgs = null;
            if( tapChangerControl != null ) {
                msgs = ( ( InternalEObject ) tapChangerControl ).eInverseRemove( this,
                        CimPackage.TAP_CHANGER_CONTROL__TAP_CHANGER, TapChangerControl.class, msgs );
            }
            if( newTapChangerControl != null ) {
                msgs = ( ( InternalEObject ) newTapChangerControl ).eInverseAdd( this,
                        CimPackage.TAP_CHANGER_CONTROL__TAP_CHANGER, TapChangerControl.class, msgs );
            }
            msgs = basicSetTapChangerControl( newTapChangerControl, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldTapChangerControlESet = tapChangerControlESet;
            tapChangerControlESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TAP_CHANGER__TAP_CHANGER_CONTROL,
                        newTapChangerControl, newTapChangerControl, !oldTapChangerControlESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetTapChangerControl( NotificationChain msgs ) {
        TapChangerControl oldTapChangerControl = tapChangerControl;
        tapChangerControl = null;
        boolean oldTapChangerControlESet = tapChangerControlESet;
        tapChangerControlESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TAP_CHANGER__TAP_CHANGER_CONTROL, oldTapChangerControl, null, oldTapChangerControlESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTapChangerControl() {
        if( tapChangerControl != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) tapChangerControl ).eInverseRemove( this,
                    CimPackage.TAP_CHANGER_CONTROL__TAP_CHANGER, TapChangerControl.class, msgs );
            msgs = basicUnsetTapChangerControl( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldTapChangerControlESet = tapChangerControlESet;
            tapChangerControlESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TAP_CHANGER__TAP_CHANGER_CONTROL,
                        null, null, oldTapChangerControlESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTapChangerControl() {
        return tapChangerControlESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BigInteger getNormalStep() {
        return normalStep;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNormalStep( BigInteger newNormalStep ) {
        BigInteger oldNormalStep = normalStep;
        normalStep = newNormalStep;
        boolean oldNormalStepESet = normalStepESet;
        normalStepESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TAP_CHANGER__NORMAL_STEP, oldNormalStep,
                    normalStep, !oldNormalStepESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNormalStep() {
        BigInteger oldNormalStep = normalStep;
        boolean oldNormalStepESet = normalStepESet;
        normalStep = NORMAL_STEP_EDEFAULT;
        normalStepESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TAP_CHANGER__NORMAL_STEP,
                    oldNormalStep, NORMAL_STEP_EDEFAULT, oldNormalStepESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNormalStep() {
        return normalStepESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getNeutralU() {
        return neutralU;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNeutralU( Double newNeutralU ) {
        Double oldNeutralU = neutralU;
        neutralU = newNeutralU;
        boolean oldNeutralUESet = neutralUESet;
        neutralUESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TAP_CHANGER__NEUTRAL_U, oldNeutralU,
                    neutralU, !oldNeutralUESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNeutralU() {
        Double oldNeutralU = neutralU;
        boolean oldNeutralUESet = neutralUESet;
        neutralU = NEUTRAL_U_EDEFAULT;
        neutralUESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TAP_CHANGER__NEUTRAL_U, oldNeutralU,
                    NEUTRAL_U_EDEFAULT, oldNeutralUESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNeutralU() {
        return neutralUESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BigInteger getHighStep() {
        return highStep;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setHighStep( BigInteger newHighStep ) {
        BigInteger oldHighStep = highStep;
        highStep = newHighStep;
        boolean oldHighStepESet = highStepESet;
        highStepESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TAP_CHANGER__HIGH_STEP, oldHighStep,
                    highStep, !oldHighStepESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetHighStep() {
        BigInteger oldHighStep = highStep;
        boolean oldHighStepESet = highStepESet;
        highStep = HIGH_STEP_EDEFAULT;
        highStepESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TAP_CHANGER__HIGH_STEP, oldHighStep,
                    HIGH_STEP_EDEFAULT, oldHighStepESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetHighStep() {
        return highStepESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getStep() {
        return step;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setStep( Double newStep ) {
        Double oldStep = step;
        step = newStep;
        boolean oldStepESet = stepESet;
        stepESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TAP_CHANGER__STEP, oldStep, step,
                    !oldStepESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetStep() {
        Double oldStep = step;
        boolean oldStepESet = stepESet;
        step = STEP_EDEFAULT;
        stepESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TAP_CHANGER__STEP, oldStep,
                    STEP_EDEFAULT, oldStepESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetStep() {
        return stepESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getControlEnabled() {
        return controlEnabled;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setControlEnabled( Boolean newControlEnabled ) {
        Boolean oldControlEnabled = controlEnabled;
        controlEnabled = newControlEnabled;
        boolean oldControlEnabledESet = controlEnabledESet;
        controlEnabledESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TAP_CHANGER__CONTROL_ENABLED,
                    oldControlEnabled, controlEnabled, !oldControlEnabledESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetControlEnabled() {
        Boolean oldControlEnabled = controlEnabled;
        boolean oldControlEnabledESet = controlEnabledESet;
        controlEnabled = CONTROL_ENABLED_EDEFAULT;
        controlEnabledESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TAP_CHANGER__CONTROL_ENABLED,
                    oldControlEnabled, CONTROL_ENABLED_EDEFAULT, oldControlEnabledESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetControlEnabled() {
        return controlEnabledESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SvTapStep getSvTapStep() {
        if( svTapStep != null && svTapStep.eIsProxy() ) {
            InternalEObject oldSvTapStep = ( InternalEObject ) svTapStep;
            svTapStep = ( SvTapStep ) eResolveProxy( oldSvTapStep );
            if( svTapStep != oldSvTapStep ) {
                if( eNotificationRequired() ) {
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE, CimPackage.TAP_CHANGER__SV_TAP_STEP,
                            oldSvTapStep, svTapStep ) );
                }
            }
        }
        return svTapStep;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SvTapStep basicGetSvTapStep() {
        return svTapStep;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSvTapStep( SvTapStep newSvTapStep, NotificationChain msgs ) {
        SvTapStep oldSvTapStep = svTapStep;
        svTapStep = newSvTapStep;
        boolean oldSvTapStepESet = svTapStepESet;
        svTapStepESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TAP_CHANGER__SV_TAP_STEP, oldSvTapStep, newSvTapStep, !oldSvTapStepESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSvTapStep( SvTapStep newSvTapStep ) {
        if( newSvTapStep != svTapStep ) {
            NotificationChain msgs = null;
            if( svTapStep != null ) {
                msgs = ( ( InternalEObject ) svTapStep ).eInverseRemove( this, CimPackage.SV_TAP_STEP__TAP_CHANGER,
                        SvTapStep.class, msgs );
            }
            if( newSvTapStep != null ) {
                msgs = ( ( InternalEObject ) newSvTapStep ).eInverseAdd( this, CimPackage.SV_TAP_STEP__TAP_CHANGER,
                        SvTapStep.class, msgs );
            }
            msgs = basicSetSvTapStep( newSvTapStep, msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldSvTapStepESet = svTapStepESet;
            svTapStepESet = true;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TAP_CHANGER__SV_TAP_STEP,
                        newSvTapStep, newSvTapStep, !oldSvTapStepESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetSvTapStep( NotificationChain msgs ) {
        SvTapStep oldSvTapStep = svTapStep;
        svTapStep = null;
        boolean oldSvTapStepESet = svTapStepESet;
        svTapStepESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TAP_CHANGER__SV_TAP_STEP, oldSvTapStep, null, oldSvTapStepESet );
            if( msgs == null ) {
                msgs = notification;
            }
            else {
                msgs.add( notification );
            }
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSvTapStep() {
        if( svTapStep != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) svTapStep ).eInverseRemove( this, CimPackage.SV_TAP_STEP__TAP_CHANGER,
                    SvTapStep.class, msgs );
            msgs = basicUnsetSvTapStep( msgs );
            if( msgs != null ) {
                msgs.dispatch();
            }
        }
        else {
            boolean oldSvTapStepESet = svTapStepESet;
            svTapStepESet = false;
            if( eNotificationRequired() ) {
                eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TAP_CHANGER__SV_TAP_STEP, null,
                        null, oldSvTapStepESet ) );
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSvTapStep() {
        return svTapStepESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BigInteger getLowStep() {
        return lowStep;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLowStep( BigInteger newLowStep ) {
        BigInteger oldLowStep = lowStep;
        lowStep = newLowStep;
        boolean oldLowStepESet = lowStepESet;
        lowStepESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TAP_CHANGER__LOW_STEP, oldLowStep,
                    lowStep, !oldLowStepESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLowStep() {
        BigInteger oldLowStep = lowStep;
        boolean oldLowStepESet = lowStepESet;
        lowStep = LOW_STEP_EDEFAULT;
        lowStepESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TAP_CHANGER__LOW_STEP, oldLowStep,
                    LOW_STEP_EDEFAULT, oldLowStepESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLowStep() {
        return lowStepESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BigInteger getNeutralStep() {
        return neutralStep;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNeutralStep( BigInteger newNeutralStep ) {
        BigInteger oldNeutralStep = neutralStep;
        neutralStep = newNeutralStep;
        boolean oldNeutralStepESet = neutralStepESet;
        neutralStepESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TAP_CHANGER__NEUTRAL_STEP,
                    oldNeutralStep, neutralStep, !oldNeutralStepESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNeutralStep() {
        BigInteger oldNeutralStep = neutralStep;
        boolean oldNeutralStepESet = neutralStepESet;
        neutralStep = NEUTRAL_STEP_EDEFAULT;
        neutralStepESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TAP_CHANGER__NEUTRAL_STEP,
                    oldNeutralStep, NEUTRAL_STEP_EDEFAULT, oldNeutralStepESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNeutralStep() {
        return neutralStepESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< TapSchedule > getTapSchedules() {
        if( tapSchedules == null ) {
            tapSchedules = new EObjectWithInverseResolvingEList.Unsettable< >( TapSchedule.class, this,
                    CimPackage.TAP_CHANGER__TAP_SCHEDULES, CimPackage.TAP_SCHEDULE__TAP_CHANGER );
        }
        return tapSchedules;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTapSchedules() {
        if( tapSchedules != null ) {
            ( ( InternalEList.Unsettable< ? > ) tapSchedules ).unset();
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTapSchedules() {
        return tapSchedules != null && ( ( InternalEList.Unsettable< ? > ) tapSchedules ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getLtcFlag() {
        return ltcFlag;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLtcFlag( Boolean newLtcFlag ) {
        Boolean oldLtcFlag = ltcFlag;
        ltcFlag = newLtcFlag;
        boolean oldLtcFlagESet = ltcFlagESet;
        ltcFlagESet = true;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TAP_CHANGER__LTC_FLAG, oldLtcFlag,
                    ltcFlag, !oldLtcFlagESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLtcFlag() {
        Boolean oldLtcFlag = ltcFlag;
        boolean oldLtcFlagESet = ltcFlagESet;
        ltcFlag = LTC_FLAG_EDEFAULT;
        ltcFlagESet = false;
        if( eNotificationRequired() ) {
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TAP_CHANGER__LTC_FLAG, oldLtcFlag,
                    LTC_FLAG_EDEFAULT, oldLtcFlagESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLtcFlag() {
        return ltcFlagESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.TAP_CHANGER__TAP_SCHEDULES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getTapSchedules() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.TAP_CHANGER__TAP_CHANGER_CONTROL:
            if( tapChangerControl != null ) {
                msgs = ( ( InternalEObject ) tapChangerControl ).eInverseRemove( this,
                        CimPackage.TAP_CHANGER_CONTROL__TAP_CHANGER, TapChangerControl.class, msgs );
            }
            return basicSetTapChangerControl( ( TapChangerControl ) otherEnd, msgs );
        case CimPackage.TAP_CHANGER__SV_TAP_STEP:
            if( svTapStep != null ) {
                msgs = ( ( InternalEObject ) svTapStep ).eInverseRemove( this, CimPackage.SV_TAP_STEP__TAP_CHANGER,
                        SvTapStep.class, msgs );
            }
            return basicSetSvTapStep( ( SvTapStep ) otherEnd, msgs );
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
        case CimPackage.TAP_CHANGER__TAP_SCHEDULES:
            return ( ( InternalEList< ? > ) getTapSchedules() ).basicRemove( otherEnd, msgs );
        case CimPackage.TAP_CHANGER__TAP_CHANGER_CONTROL:
            return basicUnsetTapChangerControl( msgs );
        case CimPackage.TAP_CHANGER__SV_TAP_STEP:
            return basicUnsetSvTapStep( msgs );
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
        case CimPackage.TAP_CHANGER__NEUTRAL_STEP:
            return getNeutralStep();
        case CimPackage.TAP_CHANGER__TAP_SCHEDULES:
            return getTapSchedules();
        case CimPackage.TAP_CHANGER__NORMAL_STEP:
            return getNormalStep();
        case CimPackage.TAP_CHANGER__LTC_FLAG:
            return getLtcFlag();
        case CimPackage.TAP_CHANGER__TAP_CHANGER_CONTROL:
            return getTapChangerControl();
        case CimPackage.TAP_CHANGER__LOW_STEP:
            return getLowStep();
        case CimPackage.TAP_CHANGER__NEUTRAL_U:
            return getNeutralU();
        case CimPackage.TAP_CHANGER__HIGH_STEP:
            return getHighStep();
        case CimPackage.TAP_CHANGER__STEP:
            return getStep();
        case CimPackage.TAP_CHANGER__CONTROL_ENABLED:
            return getControlEnabled();
        case CimPackage.TAP_CHANGER__SV_TAP_STEP:
            if( resolve ) {
                return getSvTapStep();
            }
            return basicGetSvTapStep();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case CimPackage.TAP_CHANGER__NEUTRAL_STEP:
            setNeutralStep( ( BigInteger ) newValue );
            return;
        case CimPackage.TAP_CHANGER__TAP_SCHEDULES:
            getTapSchedules().clear();
            getTapSchedules().addAll( ( Collection< ? extends TapSchedule > ) newValue );
            return;
        case CimPackage.TAP_CHANGER__NORMAL_STEP:
            setNormalStep( ( BigInteger ) newValue );
            return;
        case CimPackage.TAP_CHANGER__LTC_FLAG:
            setLtcFlag( ( Boolean ) newValue );
            return;
        case CimPackage.TAP_CHANGER__TAP_CHANGER_CONTROL:
            setTapChangerControl( ( TapChangerControl ) newValue );
            return;
        case CimPackage.TAP_CHANGER__LOW_STEP:
            setLowStep( ( BigInteger ) newValue );
            return;
        case CimPackage.TAP_CHANGER__NEUTRAL_U:
            setNeutralU( ( Double ) newValue );
            return;
        case CimPackage.TAP_CHANGER__HIGH_STEP:
            setHighStep( ( BigInteger ) newValue );
            return;
        case CimPackage.TAP_CHANGER__STEP:
            setStep( ( Double ) newValue );
            return;
        case CimPackage.TAP_CHANGER__CONTROL_ENABLED:
            setControlEnabled( ( Boolean ) newValue );
            return;
        case CimPackage.TAP_CHANGER__SV_TAP_STEP:
            setSvTapStep( ( SvTapStep ) newValue );
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
        case CimPackage.TAP_CHANGER__NEUTRAL_STEP:
            unsetNeutralStep();
            return;
        case CimPackage.TAP_CHANGER__TAP_SCHEDULES:
            unsetTapSchedules();
            return;
        case CimPackage.TAP_CHANGER__NORMAL_STEP:
            unsetNormalStep();
            return;
        case CimPackage.TAP_CHANGER__LTC_FLAG:
            unsetLtcFlag();
            return;
        case CimPackage.TAP_CHANGER__TAP_CHANGER_CONTROL:
            unsetTapChangerControl();
            return;
        case CimPackage.TAP_CHANGER__LOW_STEP:
            unsetLowStep();
            return;
        case CimPackage.TAP_CHANGER__NEUTRAL_U:
            unsetNeutralU();
            return;
        case CimPackage.TAP_CHANGER__HIGH_STEP:
            unsetHighStep();
            return;
        case CimPackage.TAP_CHANGER__STEP:
            unsetStep();
            return;
        case CimPackage.TAP_CHANGER__CONTROL_ENABLED:
            unsetControlEnabled();
            return;
        case CimPackage.TAP_CHANGER__SV_TAP_STEP:
            unsetSvTapStep();
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
        case CimPackage.TAP_CHANGER__NEUTRAL_STEP:
            return isSetNeutralStep();
        case CimPackage.TAP_CHANGER__TAP_SCHEDULES:
            return isSetTapSchedules();
        case CimPackage.TAP_CHANGER__NORMAL_STEP:
            return isSetNormalStep();
        case CimPackage.TAP_CHANGER__LTC_FLAG:
            return isSetLtcFlag();
        case CimPackage.TAP_CHANGER__TAP_CHANGER_CONTROL:
            return isSetTapChangerControl();
        case CimPackage.TAP_CHANGER__LOW_STEP:
            return isSetLowStep();
        case CimPackage.TAP_CHANGER__NEUTRAL_U:
            return isSetNeutralU();
        case CimPackage.TAP_CHANGER__HIGH_STEP:
            return isSetHighStep();
        case CimPackage.TAP_CHANGER__STEP:
            return isSetStep();
        case CimPackage.TAP_CHANGER__CONTROL_ENABLED:
            return isSetControlEnabled();
        case CimPackage.TAP_CHANGER__SV_TAP_STEP:
            return isSetSvTapStep();
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
        if( eIsProxy() ) {
            return super.toString();
        }

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (neutralStep: " );
        if( neutralStepESet ) {
            result.append( neutralStep );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", normalStep: " );
        if( normalStepESet ) {
            result.append( normalStep );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", ltcFlag: " );
        if( ltcFlagESet ) {
            result.append( ltcFlag );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", lowStep: " );
        if( lowStepESet ) {
            result.append( lowStep );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", neutralU: " );
        if( neutralUESet ) {
            result.append( neutralU );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", highStep: " );
        if( highStepESet ) {
            result.append( highStep );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", step: " );
        if( stepESet ) {
            result.append( step );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ", controlEnabled: " );
        if( controlEnabledESet ) {
            result.append( controlEnabled );
        }
        else {
            result.append( "<unset>" );
        }
        result.append( ')' );
        return result.toString();
    }

} //TapChangerImpl

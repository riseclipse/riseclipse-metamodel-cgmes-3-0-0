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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ShuntCompensator;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvShuntCompensatorSections;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shunt Compensator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ShuntCompensatorImpl#getGrounded <em>Grounded</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ShuntCompensatorImpl#getAVRDelay <em>AVR Delay</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ShuntCompensatorImpl#getMaximumSections <em>Maximum Sections</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ShuntCompensatorImpl#getVoltageSensitivity <em>Voltage Sensitivity</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ShuntCompensatorImpl#getNomU <em>Nom U</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ShuntCompensatorImpl#getNormalSections <em>Normal Sections</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ShuntCompensatorImpl#getSections <em>Sections</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ShuntCompensatorImpl#getSvShuntCompensatorSections <em>Sv Shunt Compensator Sections</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShuntCompensatorImpl extends RegulatingCondEqImpl implements ShuntCompensator {
    /**
     * The default value of the '{@link #getGrounded() <em>Grounded</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGrounded()
     * @generated
     * @ordered
     */
    protected static final Boolean GROUNDED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGrounded() <em>Grounded</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGrounded()
     * @generated
     * @ordered
     */
    protected Boolean grounded = GROUNDED_EDEFAULT;

    /**
     * This is true if the Grounded attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean groundedESet;

    /**
     * The default value of the '{@link #getAVRDelay() <em>AVR Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAVRDelay()
     * @generated
     * @ordered
     */
    protected static final Double AVR_DELAY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAVRDelay() <em>AVR Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAVRDelay()
     * @generated
     * @ordered
     */
    protected Double aVRDelay = AVR_DELAY_EDEFAULT;

    /**
     * This is true if the AVR Delay attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean aVRDelayESet;

    /**
     * The default value of the '{@link #getMaximumSections() <em>Maximum Sections</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaximumSections()
     * @generated
     * @ordered
     */
    protected static final BigInteger MAXIMUM_SECTIONS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaximumSections() <em>Maximum Sections</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaximumSections()
     * @generated
     * @ordered
     */
    protected BigInteger maximumSections = MAXIMUM_SECTIONS_EDEFAULT;

    /**
     * This is true if the Maximum Sections attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maximumSectionsESet;

    /**
     * The default value of the '{@link #getVoltageSensitivity() <em>Voltage Sensitivity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVoltageSensitivity()
     * @generated
     * @ordered
     */
    protected static final Double VOLTAGE_SENSITIVITY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVoltageSensitivity() <em>Voltage Sensitivity</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVoltageSensitivity()
     * @generated
     * @ordered
     */
    protected Double voltageSensitivity = VOLTAGE_SENSITIVITY_EDEFAULT;

    /**
     * This is true if the Voltage Sensitivity attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean voltageSensitivityESet;

    /**
     * The default value of the '{@link #getNomU() <em>Nom U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNomU()
     * @generated
     * @ordered
     */
    protected static final Double NOM_U_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNomU() <em>Nom U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNomU()
     * @generated
     * @ordered
     */
    protected Double nomU = NOM_U_EDEFAULT;

    /**
     * This is true if the Nom U attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean nomUESet;

    /**
     * The default value of the '{@link #getNormalSections() <em>Normal Sections</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNormalSections()
     * @generated
     * @ordered
     */
    protected static final BigInteger NORMAL_SECTIONS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNormalSections() <em>Normal Sections</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNormalSections()
     * @generated
     * @ordered
     */
    protected BigInteger normalSections = NORMAL_SECTIONS_EDEFAULT;

    /**
     * This is true if the Normal Sections attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean normalSectionsESet;

    /**
     * The default value of the '{@link #getSections() <em>Sections</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSections()
     * @generated
     * @ordered
     */
    protected static final Double SECTIONS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSections() <em>Sections</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSections()
     * @generated
     * @ordered
     */
    protected Double sections = SECTIONS_EDEFAULT;

    /**
     * This is true if the Sections attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sectionsESet;

    /**
     * The cached value of the '{@link #getSvShuntCompensatorSections() <em>Sv Shunt Compensator Sections</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSvShuntCompensatorSections()
     * @generated
     * @ordered
     */
    protected SvShuntCompensatorSections svShuntCompensatorSections;

    /**
     * This is true if the Sv Shunt Compensator Sections reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean svShuntCompensatorSectionsESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ShuntCompensatorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getShuntCompensator();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getAVRDelay() {
        return aVRDelay;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAVRDelay( Double newAVRDelay ) {
        Double oldAVRDelay = aVRDelay;
        aVRDelay = newAVRDelay;
        boolean oldAVRDelayESet = aVRDelayESet;
        aVRDelayESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SHUNT_COMPENSATOR__AVR_DELAY,
                    oldAVRDelay, aVRDelay, !oldAVRDelayESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAVRDelay() {
        Double oldAVRDelay = aVRDelay;
        boolean oldAVRDelayESet = aVRDelayESet;
        aVRDelay = AVR_DELAY_EDEFAULT;
        aVRDelayESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SHUNT_COMPENSATOR__AVR_DELAY,
                    oldAVRDelay, AVR_DELAY_EDEFAULT, oldAVRDelayESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAVRDelay() {
        return aVRDelayESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BigInteger getMaximumSections() {
        return maximumSections;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaximumSections( BigInteger newMaximumSections ) {
        BigInteger oldMaximumSections = maximumSections;
        maximumSections = newMaximumSections;
        boolean oldMaximumSectionsESet = maximumSectionsESet;
        maximumSectionsESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SHUNT_COMPENSATOR__MAXIMUM_SECTIONS,
                    oldMaximumSections, maximumSections, !oldMaximumSectionsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaximumSections() {
        BigInteger oldMaximumSections = maximumSections;
        boolean oldMaximumSectionsESet = maximumSectionsESet;
        maximumSections = MAXIMUM_SECTIONS_EDEFAULT;
        maximumSectionsESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SHUNT_COMPENSATOR__MAXIMUM_SECTIONS,
                    oldMaximumSections, MAXIMUM_SECTIONS_EDEFAULT, oldMaximumSectionsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaximumSections() {
        return maximumSectionsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVoltageSensitivity() {
        return voltageSensitivity;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVoltageSensitivity( Double newVoltageSensitivity ) {
        Double oldVoltageSensitivity = voltageSensitivity;
        voltageSensitivity = newVoltageSensitivity;
        boolean oldVoltageSensitivityESet = voltageSensitivityESet;
        voltageSensitivityESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SHUNT_COMPENSATOR__VOLTAGE_SENSITIVITY,
                    oldVoltageSensitivity, voltageSensitivity, !oldVoltageSensitivityESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVoltageSensitivity() {
        Double oldVoltageSensitivity = voltageSensitivity;
        boolean oldVoltageSensitivityESet = voltageSensitivityESet;
        voltageSensitivity = VOLTAGE_SENSITIVITY_EDEFAULT;
        voltageSensitivityESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SHUNT_COMPENSATOR__VOLTAGE_SENSITIVITY,
                    oldVoltageSensitivity, VOLTAGE_SENSITIVITY_EDEFAULT, oldVoltageSensitivityESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVoltageSensitivity() {
        return voltageSensitivityESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getNomU() {
        return nomU;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNomU( Double newNomU ) {
        Double oldNomU = nomU;
        nomU = newNomU;
        boolean oldNomUESet = nomUESet;
        nomUESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SHUNT_COMPENSATOR__NOM_U, oldNomU, nomU,
                    !oldNomUESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNomU() {
        Double oldNomU = nomU;
        boolean oldNomUESet = nomUESet;
        nomU = NOM_U_EDEFAULT;
        nomUESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SHUNT_COMPENSATOR__NOM_U, oldNomU,
                    NOM_U_EDEFAULT, oldNomUESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNomU() {
        return nomUESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getGrounded() {
        return grounded;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGrounded( Boolean newGrounded ) {
        Boolean oldGrounded = grounded;
        grounded = newGrounded;
        boolean oldGroundedESet = groundedESet;
        groundedESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SHUNT_COMPENSATOR__GROUNDED, oldGrounded,
                    grounded, !oldGroundedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGrounded() {
        Boolean oldGrounded = grounded;
        boolean oldGroundedESet = groundedESet;
        grounded = GROUNDED_EDEFAULT;
        groundedESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SHUNT_COMPENSATOR__GROUNDED,
                    oldGrounded, GROUNDED_EDEFAULT, oldGroundedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGrounded() {
        return groundedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BigInteger getNormalSections() {
        return normalSections;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNormalSections( BigInteger newNormalSections ) {
        BigInteger oldNormalSections = normalSections;
        normalSections = newNormalSections;
        boolean oldNormalSectionsESet = normalSectionsESet;
        normalSectionsESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SHUNT_COMPENSATOR__NORMAL_SECTIONS,
                    oldNormalSections, normalSections, !oldNormalSectionsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNormalSections() {
        BigInteger oldNormalSections = normalSections;
        boolean oldNormalSectionsESet = normalSectionsESet;
        normalSections = NORMAL_SECTIONS_EDEFAULT;
        normalSectionsESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SHUNT_COMPENSATOR__NORMAL_SECTIONS,
                    oldNormalSections, NORMAL_SECTIONS_EDEFAULT, oldNormalSectionsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNormalSections() {
        return normalSectionsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getSections() {
        return sections;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSections( Double newSections ) {
        Double oldSections = sections;
        sections = newSections;
        boolean oldSectionsESet = sectionsESet;
        sectionsESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SHUNT_COMPENSATOR__SECTIONS, oldSections,
                    sections, !oldSectionsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSections() {
        Double oldSections = sections;
        boolean oldSectionsESet = sectionsESet;
        sections = SECTIONS_EDEFAULT;
        sectionsESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SHUNT_COMPENSATOR__SECTIONS,
                    oldSections, SECTIONS_EDEFAULT, oldSectionsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSections() {
        return sectionsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SvShuntCompensatorSections getSvShuntCompensatorSections() {
        if( svShuntCompensatorSections != null && svShuntCompensatorSections.eIsProxy() ) {
            InternalEObject oldSvShuntCompensatorSections = ( InternalEObject ) svShuntCompensatorSections;
            svShuntCompensatorSections = ( SvShuntCompensatorSections ) eResolveProxy( oldSvShuntCompensatorSections );
            if( svShuntCompensatorSections != oldSvShuntCompensatorSections ) {
                if( eNotificationRequired() )
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                            CimPackage.SHUNT_COMPENSATOR__SV_SHUNT_COMPENSATOR_SECTIONS, oldSvShuntCompensatorSections,
                            svShuntCompensatorSections ) );
            }
        }
        return svShuntCompensatorSections;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SvShuntCompensatorSections basicGetSvShuntCompensatorSections() {
        return svShuntCompensatorSections;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSvShuntCompensatorSections(
            SvShuntCompensatorSections newSvShuntCompensatorSections, NotificationChain msgs ) {
        SvShuntCompensatorSections oldSvShuntCompensatorSections = svShuntCompensatorSections;
        svShuntCompensatorSections = newSvShuntCompensatorSections;
        boolean oldSvShuntCompensatorSectionsESet = svShuntCompensatorSectionsESet;
        svShuntCompensatorSectionsESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.SHUNT_COMPENSATOR__SV_SHUNT_COMPENSATOR_SECTIONS, oldSvShuntCompensatorSections,
                    newSvShuntCompensatorSections, !oldSvShuntCompensatorSectionsESet );
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
    public void setSvShuntCompensatorSections( SvShuntCompensatorSections newSvShuntCompensatorSections ) {
        if( newSvShuntCompensatorSections != svShuntCompensatorSections ) {
            NotificationChain msgs = null;
            if( svShuntCompensatorSections != null )
                msgs = ( ( InternalEObject ) svShuntCompensatorSections ).eInverseRemove( this,
                        CimPackage.SV_SHUNT_COMPENSATOR_SECTIONS__SHUNT_COMPENSATOR, SvShuntCompensatorSections.class,
                        msgs );
            if( newSvShuntCompensatorSections != null )
                msgs = ( ( InternalEObject ) newSvShuntCompensatorSections ).eInverseAdd( this,
                        CimPackage.SV_SHUNT_COMPENSATOR_SECTIONS__SHUNT_COMPENSATOR, SvShuntCompensatorSections.class,
                        msgs );
            msgs = basicSetSvShuntCompensatorSections( newSvShuntCompensatorSections, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSvShuntCompensatorSectionsESet = svShuntCompensatorSectionsESet;
            svShuntCompensatorSectionsESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        CimPackage.SHUNT_COMPENSATOR__SV_SHUNT_COMPENSATOR_SECTIONS, newSvShuntCompensatorSections,
                        newSvShuntCompensatorSections, !oldSvShuntCompensatorSectionsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetSvShuntCompensatorSections( NotificationChain msgs ) {
        SvShuntCompensatorSections oldSvShuntCompensatorSections = svShuntCompensatorSections;
        svShuntCompensatorSections = null;
        boolean oldSvShuntCompensatorSectionsESet = svShuntCompensatorSectionsESet;
        svShuntCompensatorSectionsESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SHUNT_COMPENSATOR__SV_SHUNT_COMPENSATOR_SECTIONS, oldSvShuntCompensatorSections, null,
                    oldSvShuntCompensatorSectionsESet );
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
    public void unsetSvShuntCompensatorSections() {
        if( svShuntCompensatorSections != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) svShuntCompensatorSections ).eInverseRemove( this,
                    CimPackage.SV_SHUNT_COMPENSATOR_SECTIONS__SHUNT_COMPENSATOR, SvShuntCompensatorSections.class,
                    msgs );
            msgs = basicUnsetSvShuntCompensatorSections( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSvShuntCompensatorSectionsESet = svShuntCompensatorSectionsESet;
            svShuntCompensatorSectionsESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.SHUNT_COMPENSATOR__SV_SHUNT_COMPENSATOR_SECTIONS, null, null,
                        oldSvShuntCompensatorSectionsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSvShuntCompensatorSections() {
        return svShuntCompensatorSectionsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.SHUNT_COMPENSATOR__SV_SHUNT_COMPENSATOR_SECTIONS:
            if( svShuntCompensatorSections != null )
                msgs = ( ( InternalEObject ) svShuntCompensatorSections ).eInverseRemove( this,
                        CimPackage.SV_SHUNT_COMPENSATOR_SECTIONS__SHUNT_COMPENSATOR, SvShuntCompensatorSections.class,
                        msgs );
            return basicSetSvShuntCompensatorSections( ( SvShuntCompensatorSections ) otherEnd, msgs );
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
        case CimPackage.SHUNT_COMPENSATOR__SV_SHUNT_COMPENSATOR_SECTIONS:
            return basicUnsetSvShuntCompensatorSections( msgs );
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
        case CimPackage.SHUNT_COMPENSATOR__GROUNDED:
            return getGrounded();
        case CimPackage.SHUNT_COMPENSATOR__AVR_DELAY:
            return getAVRDelay();
        case CimPackage.SHUNT_COMPENSATOR__MAXIMUM_SECTIONS:
            return getMaximumSections();
        case CimPackage.SHUNT_COMPENSATOR__VOLTAGE_SENSITIVITY:
            return getVoltageSensitivity();
        case CimPackage.SHUNT_COMPENSATOR__NOM_U:
            return getNomU();
        case CimPackage.SHUNT_COMPENSATOR__NORMAL_SECTIONS:
            return getNormalSections();
        case CimPackage.SHUNT_COMPENSATOR__SECTIONS:
            return getSections();
        case CimPackage.SHUNT_COMPENSATOR__SV_SHUNT_COMPENSATOR_SECTIONS:
            if( resolve ) return getSvShuntCompensatorSections();
            return basicGetSvShuntCompensatorSections();
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
        case CimPackage.SHUNT_COMPENSATOR__GROUNDED:
            setGrounded( ( Boolean ) newValue );
            return;
        case CimPackage.SHUNT_COMPENSATOR__AVR_DELAY:
            setAVRDelay( ( Double ) newValue );
            return;
        case CimPackage.SHUNT_COMPENSATOR__MAXIMUM_SECTIONS:
            setMaximumSections( ( BigInteger ) newValue );
            return;
        case CimPackage.SHUNT_COMPENSATOR__VOLTAGE_SENSITIVITY:
            setVoltageSensitivity( ( Double ) newValue );
            return;
        case CimPackage.SHUNT_COMPENSATOR__NOM_U:
            setNomU( ( Double ) newValue );
            return;
        case CimPackage.SHUNT_COMPENSATOR__NORMAL_SECTIONS:
            setNormalSections( ( BigInteger ) newValue );
            return;
        case CimPackage.SHUNT_COMPENSATOR__SECTIONS:
            setSections( ( Double ) newValue );
            return;
        case CimPackage.SHUNT_COMPENSATOR__SV_SHUNT_COMPENSATOR_SECTIONS:
            setSvShuntCompensatorSections( ( SvShuntCompensatorSections ) newValue );
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
        case CimPackage.SHUNT_COMPENSATOR__GROUNDED:
            unsetGrounded();
            return;
        case CimPackage.SHUNT_COMPENSATOR__AVR_DELAY:
            unsetAVRDelay();
            return;
        case CimPackage.SHUNT_COMPENSATOR__MAXIMUM_SECTIONS:
            unsetMaximumSections();
            return;
        case CimPackage.SHUNT_COMPENSATOR__VOLTAGE_SENSITIVITY:
            unsetVoltageSensitivity();
            return;
        case CimPackage.SHUNT_COMPENSATOR__NOM_U:
            unsetNomU();
            return;
        case CimPackage.SHUNT_COMPENSATOR__NORMAL_SECTIONS:
            unsetNormalSections();
            return;
        case CimPackage.SHUNT_COMPENSATOR__SECTIONS:
            unsetSections();
            return;
        case CimPackage.SHUNT_COMPENSATOR__SV_SHUNT_COMPENSATOR_SECTIONS:
            unsetSvShuntCompensatorSections();
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
        case CimPackage.SHUNT_COMPENSATOR__GROUNDED:
            return isSetGrounded();
        case CimPackage.SHUNT_COMPENSATOR__AVR_DELAY:
            return isSetAVRDelay();
        case CimPackage.SHUNT_COMPENSATOR__MAXIMUM_SECTIONS:
            return isSetMaximumSections();
        case CimPackage.SHUNT_COMPENSATOR__VOLTAGE_SENSITIVITY:
            return isSetVoltageSensitivity();
        case CimPackage.SHUNT_COMPENSATOR__NOM_U:
            return isSetNomU();
        case CimPackage.SHUNT_COMPENSATOR__NORMAL_SECTIONS:
            return isSetNormalSections();
        case CimPackage.SHUNT_COMPENSATOR__SECTIONS:
            return isSetSections();
        case CimPackage.SHUNT_COMPENSATOR__SV_SHUNT_COMPENSATOR_SECTIONS:
            return isSetSvShuntCompensatorSections();
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
        result.append( " (grounded: " );
        if( groundedESet )
            result.append( grounded );
        else
            result.append( "<unset>" );
        result.append( ", aVRDelay: " );
        if( aVRDelayESet )
            result.append( aVRDelay );
        else
            result.append( "<unset>" );
        result.append( ", maximumSections: " );
        if( maximumSectionsESet )
            result.append( maximumSections );
        else
            result.append( "<unset>" );
        result.append( ", voltageSensitivity: " );
        if( voltageSensitivityESet )
            result.append( voltageSensitivity );
        else
            result.append( "<unset>" );
        result.append( ", nomU: " );
        if( nomUESet )
            result.append( nomU );
        else
            result.append( "<unset>" );
        result.append( ", normalSections: " );
        if( normalSectionsESet )
            result.append( normalSections );
        else
            result.append( "<unset>" );
        result.append( ", sections: " );
        if( sectionsESet )
            result.append( sections );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ShuntCompensatorImpl

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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC1A;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Disc Exc Cont IEEEDEC1A</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.DiscExcContIEEEDEC1AImpl#getTan <em>Tan</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.DiscExcContIEEEDEC1AImpl#getVomin <em>Vomin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.DiscExcContIEEEDEC1AImpl#getTw5 <em>Tw5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.DiscExcContIEEEDEC1AImpl#getVtlmt <em>Vtlmt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.DiscExcContIEEEDEC1AImpl#getTl1 <em>Tl1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.DiscExcContIEEEDEC1AImpl#getTl2 <em>Tl2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.DiscExcContIEEEDEC1AImpl#getKetl <em>Ketl</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.DiscExcContIEEEDEC1AImpl#getKan <em>Kan</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.DiscExcContIEEEDEC1AImpl#getVomax <em>Vomax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.DiscExcContIEEEDEC1AImpl#getVsmin <em>Vsmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.DiscExcContIEEEDEC1AImpl#getVanmax <em>Vanmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.DiscExcContIEEEDEC1AImpl#getTd <em>Td</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.DiscExcContIEEEDEC1AImpl#getVsmax <em>Vsmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.DiscExcContIEEEDEC1AImpl#getVal <em>Val</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.DiscExcContIEEEDEC1AImpl#getVtm <em>Vtm</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.DiscExcContIEEEDEC1AImpl#getVtn <em>Vtn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.DiscExcContIEEEDEC1AImpl#getEsc <em>Esc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.DiscExcContIEEEDEC1AImpl#getVtc <em>Vtc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiscExcContIEEEDEC1AImpl extends DiscontinuousExcitationControlDynamicsImpl
        implements DiscExcContIEEEDEC1A {
    /**
     * The default value of the '{@link #getTan() <em>Tan</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTan()
     * @generated
     * @ordered
     */
    protected static final Double TAN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTan() <em>Tan</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTan()
     * @generated
     * @ordered
     */
    protected Double tan = TAN_EDEFAULT;

    /**
     * This is true if the Tan attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tanESet;

    /**
     * The default value of the '{@link #getVomin() <em>Vomin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVomin()
     * @generated
     * @ordered
     */
    protected static final Double VOMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVomin() <em>Vomin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVomin()
     * @generated
     * @ordered
     */
    protected Double vomin = VOMIN_EDEFAULT;

    /**
     * This is true if the Vomin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vominESet;

    /**
     * The default value of the '{@link #getTw5() <em>Tw5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTw5()
     * @generated
     * @ordered
     */
    protected static final Double TW5_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTw5() <em>Tw5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTw5()
     * @generated
     * @ordered
     */
    protected Double tw5 = TW5_EDEFAULT;

    /**
     * This is true if the Tw5 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tw5ESet;

    /**
     * The default value of the '{@link #getVtlmt() <em>Vtlmt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVtlmt()
     * @generated
     * @ordered
     */
    protected static final Double VTLMT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVtlmt() <em>Vtlmt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVtlmt()
     * @generated
     * @ordered
     */
    protected Double vtlmt = VTLMT_EDEFAULT;

    /**
     * This is true if the Vtlmt attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vtlmtESet;

    /**
     * The default value of the '{@link #getTl1() <em>Tl1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTl1()
     * @generated
     * @ordered
     */
    protected static final Double TL1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTl1() <em>Tl1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTl1()
     * @generated
     * @ordered
     */
    protected Double tl1 = TL1_EDEFAULT;

    /**
     * This is true if the Tl1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tl1ESet;

    /**
     * The default value of the '{@link #getTl2() <em>Tl2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTl2()
     * @generated
     * @ordered
     */
    protected static final Double TL2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTl2() <em>Tl2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTl2()
     * @generated
     * @ordered
     */
    protected Double tl2 = TL2_EDEFAULT;

    /**
     * This is true if the Tl2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tl2ESet;

    /**
     * The default value of the '{@link #getKetl() <em>Ketl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKetl()
     * @generated
     * @ordered
     */
    protected static final Double KETL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKetl() <em>Ketl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKetl()
     * @generated
     * @ordered
     */
    protected Double ketl = KETL_EDEFAULT;

    /**
     * This is true if the Ketl attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ketlESet;

    /**
     * The default value of the '{@link #getKan() <em>Kan</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKan()
     * @generated
     * @ordered
     */
    protected static final Double KAN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKan() <em>Kan</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKan()
     * @generated
     * @ordered
     */
    protected Double kan = KAN_EDEFAULT;

    /**
     * This is true if the Kan attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kanESet;

    /**
     * The default value of the '{@link #getVomax() <em>Vomax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVomax()
     * @generated
     * @ordered
     */
    protected static final Double VOMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVomax() <em>Vomax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVomax()
     * @generated
     * @ordered
     */
    protected Double vomax = VOMAX_EDEFAULT;

    /**
     * This is true if the Vomax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vomaxESet;

    /**
     * The default value of the '{@link #getVsmin() <em>Vsmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVsmin()
     * @generated
     * @ordered
     */
    protected static final Double VSMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVsmin() <em>Vsmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVsmin()
     * @generated
     * @ordered
     */
    protected Double vsmin = VSMIN_EDEFAULT;

    /**
     * This is true if the Vsmin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vsminESet;

    /**
     * The default value of the '{@link #getVanmax() <em>Vanmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVanmax()
     * @generated
     * @ordered
     */
    protected static final Double VANMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVanmax() <em>Vanmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVanmax()
     * @generated
     * @ordered
     */
    protected Double vanmax = VANMAX_EDEFAULT;

    /**
     * This is true if the Vanmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vanmaxESet;

    /**
     * The default value of the '{@link #getTd() <em>Td</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTd()
     * @generated
     * @ordered
     */
    protected static final Double TD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTd() <em>Td</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTd()
     * @generated
     * @ordered
     */
    protected Double td = TD_EDEFAULT;

    /**
     * This is true if the Td attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tdESet;

    /**
     * The default value of the '{@link #getVsmax() <em>Vsmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVsmax()
     * @generated
     * @ordered
     */
    protected static final Double VSMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVsmax() <em>Vsmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVsmax()
     * @generated
     * @ordered
     */
    protected Double vsmax = VSMAX_EDEFAULT;

    /**
     * This is true if the Vsmax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vsmaxESet;

    /**
     * The default value of the '{@link #getVal() <em>Val</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVal()
     * @generated
     * @ordered
     */
    protected static final Double VAL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVal() <em>Val</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVal()
     * @generated
     * @ordered
     */
    protected Double val = VAL_EDEFAULT;

    /**
     * This is true if the Val attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean valESet;

    /**
     * The default value of the '{@link #getVtm() <em>Vtm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVtm()
     * @generated
     * @ordered
     */
    protected static final Double VTM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVtm() <em>Vtm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVtm()
     * @generated
     * @ordered
     */
    protected Double vtm = VTM_EDEFAULT;

    /**
     * This is true if the Vtm attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vtmESet;

    /**
     * The default value of the '{@link #getVtn() <em>Vtn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVtn()
     * @generated
     * @ordered
     */
    protected static final Double VTN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVtn() <em>Vtn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVtn()
     * @generated
     * @ordered
     */
    protected Double vtn = VTN_EDEFAULT;

    /**
     * This is true if the Vtn attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vtnESet;

    /**
     * The default value of the '{@link #getEsc() <em>Esc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEsc()
     * @generated
     * @ordered
     */
    protected static final Double ESC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEsc() <em>Esc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEsc()
     * @generated
     * @ordered
     */
    protected Double esc = ESC_EDEFAULT;

    /**
     * This is true if the Esc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean escESet;

    /**
     * The default value of the '{@link #getVtc() <em>Vtc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVtc()
     * @generated
     * @ordered
     */
    protected static final Double VTC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVtc() <em>Vtc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVtc()
     * @generated
     * @ordered
     */
    protected Double vtc = VTC_EDEFAULT;

    /**
     * This is true if the Vtc attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vtcESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DiscExcContIEEEDEC1AImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getDiscExcContIEEEDEC1A();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTan() {
        return tan;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTan( Double newTan ) {
        Double oldTan = tan;
        tan = newTan;
        boolean oldTanESet = tanESet;
        tanESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.DISC_EXC_CONT_IEEEDEC1A__TAN, oldTan,
                    tan, !oldTanESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTan() {
        Double oldTan = tan;
        boolean oldTanESet = tanESet;
        tan = TAN_EDEFAULT;
        tanESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.DISC_EXC_CONT_IEEEDEC1A__TAN, oldTan,
                    TAN_EDEFAULT, oldTanESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTan() {
        return tanESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVomin() {
        return vomin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVomin( Double newVomin ) {
        Double oldVomin = vomin;
        vomin = newVomin;
        boolean oldVominESet = vominESet;
        vominESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.DISC_EXC_CONT_IEEEDEC1A__VOMIN, oldVomin,
                    vomin, !oldVominESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVomin() {
        Double oldVomin = vomin;
        boolean oldVominESet = vominESet;
        vomin = VOMIN_EDEFAULT;
        vominESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.DISC_EXC_CONT_IEEEDEC1A__VOMIN,
                    oldVomin, VOMIN_EDEFAULT, oldVominESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVomin() {
        return vominESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTw5() {
        return tw5;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTw5( Double newTw5 ) {
        Double oldTw5 = tw5;
        tw5 = newTw5;
        boolean oldTw5ESet = tw5ESet;
        tw5ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.DISC_EXC_CONT_IEEEDEC1A__TW5, oldTw5,
                    tw5, !oldTw5ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTw5() {
        Double oldTw5 = tw5;
        boolean oldTw5ESet = tw5ESet;
        tw5 = TW5_EDEFAULT;
        tw5ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.DISC_EXC_CONT_IEEEDEC1A__TW5, oldTw5,
                    TW5_EDEFAULT, oldTw5ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTw5() {
        return tw5ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVtlmt() {
        return vtlmt;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVtlmt( Double newVtlmt ) {
        Double oldVtlmt = vtlmt;
        vtlmt = newVtlmt;
        boolean oldVtlmtESet = vtlmtESet;
        vtlmtESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.DISC_EXC_CONT_IEEEDEC1A__VTLMT, oldVtlmt,
                    vtlmt, !oldVtlmtESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVtlmt() {
        Double oldVtlmt = vtlmt;
        boolean oldVtlmtESet = vtlmtESet;
        vtlmt = VTLMT_EDEFAULT;
        vtlmtESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.DISC_EXC_CONT_IEEEDEC1A__VTLMT,
                    oldVtlmt, VTLMT_EDEFAULT, oldVtlmtESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVtlmt() {
        return vtlmtESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTl1() {
        return tl1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTl1( Double newTl1 ) {
        Double oldTl1 = tl1;
        tl1 = newTl1;
        boolean oldTl1ESet = tl1ESet;
        tl1ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.DISC_EXC_CONT_IEEEDEC1A__TL1, oldTl1,
                    tl1, !oldTl1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTl1() {
        Double oldTl1 = tl1;
        boolean oldTl1ESet = tl1ESet;
        tl1 = TL1_EDEFAULT;
        tl1ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.DISC_EXC_CONT_IEEEDEC1A__TL1, oldTl1,
                    TL1_EDEFAULT, oldTl1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTl1() {
        return tl1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTl2() {
        return tl2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTl2( Double newTl2 ) {
        Double oldTl2 = tl2;
        tl2 = newTl2;
        boolean oldTl2ESet = tl2ESet;
        tl2ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.DISC_EXC_CONT_IEEEDEC1A__TL2, oldTl2,
                    tl2, !oldTl2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTl2() {
        Double oldTl2 = tl2;
        boolean oldTl2ESet = tl2ESet;
        tl2 = TL2_EDEFAULT;
        tl2ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.DISC_EXC_CONT_IEEEDEC1A__TL2, oldTl2,
                    TL2_EDEFAULT, oldTl2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTl2() {
        return tl2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKetl() {
        return ketl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKetl( Double newKetl ) {
        Double oldKetl = ketl;
        ketl = newKetl;
        boolean oldKetlESet = ketlESet;
        ketlESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.DISC_EXC_CONT_IEEEDEC1A__KETL, oldKetl,
                    ketl, !oldKetlESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKetl() {
        Double oldKetl = ketl;
        boolean oldKetlESet = ketlESet;
        ketl = KETL_EDEFAULT;
        ketlESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.DISC_EXC_CONT_IEEEDEC1A__KETL, oldKetl,
                    KETL_EDEFAULT, oldKetlESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKetl() {
        return ketlESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKan() {
        return kan;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKan( Double newKan ) {
        Double oldKan = kan;
        kan = newKan;
        boolean oldKanESet = kanESet;
        kanESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.DISC_EXC_CONT_IEEEDEC1A__KAN, oldKan,
                    kan, !oldKanESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKan() {
        Double oldKan = kan;
        boolean oldKanESet = kanESet;
        kan = KAN_EDEFAULT;
        kanESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.DISC_EXC_CONT_IEEEDEC1A__KAN, oldKan,
                    KAN_EDEFAULT, oldKanESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKan() {
        return kanESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVomax() {
        return vomax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVomax( Double newVomax ) {
        Double oldVomax = vomax;
        vomax = newVomax;
        boolean oldVomaxESet = vomaxESet;
        vomaxESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.DISC_EXC_CONT_IEEEDEC1A__VOMAX, oldVomax,
                    vomax, !oldVomaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVomax() {
        Double oldVomax = vomax;
        boolean oldVomaxESet = vomaxESet;
        vomax = VOMAX_EDEFAULT;
        vomaxESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.DISC_EXC_CONT_IEEEDEC1A__VOMAX,
                    oldVomax, VOMAX_EDEFAULT, oldVomaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVomax() {
        return vomaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVsmin() {
        return vsmin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVsmin( Double newVsmin ) {
        Double oldVsmin = vsmin;
        vsmin = newVsmin;
        boolean oldVsminESet = vsminESet;
        vsminESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.DISC_EXC_CONT_IEEEDEC1A__VSMIN, oldVsmin,
                    vsmin, !oldVsminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVsmin() {
        Double oldVsmin = vsmin;
        boolean oldVsminESet = vsminESet;
        vsmin = VSMIN_EDEFAULT;
        vsminESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.DISC_EXC_CONT_IEEEDEC1A__VSMIN,
                    oldVsmin, VSMIN_EDEFAULT, oldVsminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVsmin() {
        return vsminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVanmax() {
        return vanmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVanmax( Double newVanmax ) {
        Double oldVanmax = vanmax;
        vanmax = newVanmax;
        boolean oldVanmaxESet = vanmaxESet;
        vanmaxESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.DISC_EXC_CONT_IEEEDEC1A__VANMAX,
                    oldVanmax, vanmax, !oldVanmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVanmax() {
        Double oldVanmax = vanmax;
        boolean oldVanmaxESet = vanmaxESet;
        vanmax = VANMAX_EDEFAULT;
        vanmaxESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.DISC_EXC_CONT_IEEEDEC1A__VANMAX,
                    oldVanmax, VANMAX_EDEFAULT, oldVanmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVanmax() {
        return vanmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getTd() {
        return td;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTd( Double newTd ) {
        Double oldTd = td;
        td = newTd;
        boolean oldTdESet = tdESet;
        tdESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.DISC_EXC_CONT_IEEEDEC1A__TD, oldTd, td,
                    !oldTdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTd() {
        Double oldTd = td;
        boolean oldTdESet = tdESet;
        td = TD_EDEFAULT;
        tdESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.DISC_EXC_CONT_IEEEDEC1A__TD, oldTd,
                    TD_EDEFAULT, oldTdESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTd() {
        return tdESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVsmax() {
        return vsmax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVsmax( Double newVsmax ) {
        Double oldVsmax = vsmax;
        vsmax = newVsmax;
        boolean oldVsmaxESet = vsmaxESet;
        vsmaxESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.DISC_EXC_CONT_IEEEDEC1A__VSMAX, oldVsmax,
                    vsmax, !oldVsmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVsmax() {
        Double oldVsmax = vsmax;
        boolean oldVsmaxESet = vsmaxESet;
        vsmax = VSMAX_EDEFAULT;
        vsmaxESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.DISC_EXC_CONT_IEEEDEC1A__VSMAX,
                    oldVsmax, VSMAX_EDEFAULT, oldVsmaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVsmax() {
        return vsmaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVal() {
        return val;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVal( Double newVal ) {
        Double oldVal = val;
        val = newVal;
        boolean oldValESet = valESet;
        valESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.DISC_EXC_CONT_IEEEDEC1A__VAL, oldVal,
                    val, !oldValESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVal() {
        Double oldVal = val;
        boolean oldValESet = valESet;
        val = VAL_EDEFAULT;
        valESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.DISC_EXC_CONT_IEEEDEC1A__VAL, oldVal,
                    VAL_EDEFAULT, oldValESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVal() {
        return valESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVtm() {
        return vtm;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVtm( Double newVtm ) {
        Double oldVtm = vtm;
        vtm = newVtm;
        boolean oldVtmESet = vtmESet;
        vtmESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.DISC_EXC_CONT_IEEEDEC1A__VTM, oldVtm,
                    vtm, !oldVtmESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVtm() {
        Double oldVtm = vtm;
        boolean oldVtmESet = vtmESet;
        vtm = VTM_EDEFAULT;
        vtmESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.DISC_EXC_CONT_IEEEDEC1A__VTM, oldVtm,
                    VTM_EDEFAULT, oldVtmESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVtm() {
        return vtmESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVtn() {
        return vtn;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVtn( Double newVtn ) {
        Double oldVtn = vtn;
        vtn = newVtn;
        boolean oldVtnESet = vtnESet;
        vtnESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.DISC_EXC_CONT_IEEEDEC1A__VTN, oldVtn,
                    vtn, !oldVtnESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVtn() {
        Double oldVtn = vtn;
        boolean oldVtnESet = vtnESet;
        vtn = VTN_EDEFAULT;
        vtnESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.DISC_EXC_CONT_IEEEDEC1A__VTN, oldVtn,
                    VTN_EDEFAULT, oldVtnESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVtn() {
        return vtnESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getEsc() {
        return esc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEsc( Double newEsc ) {
        Double oldEsc = esc;
        esc = newEsc;
        boolean oldEscESet = escESet;
        escESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.DISC_EXC_CONT_IEEEDEC1A__ESC, oldEsc,
                    esc, !oldEscESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEsc() {
        Double oldEsc = esc;
        boolean oldEscESet = escESet;
        esc = ESC_EDEFAULT;
        escESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.DISC_EXC_CONT_IEEEDEC1A__ESC, oldEsc,
                    ESC_EDEFAULT, oldEscESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEsc() {
        return escESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVtc() {
        return vtc;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVtc( Double newVtc ) {
        Double oldVtc = vtc;
        vtc = newVtc;
        boolean oldVtcESet = vtcESet;
        vtcESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.DISC_EXC_CONT_IEEEDEC1A__VTC, oldVtc,
                    vtc, !oldVtcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVtc() {
        Double oldVtc = vtc;
        boolean oldVtcESet = vtcESet;
        vtc = VTC_EDEFAULT;
        vtcESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.DISC_EXC_CONT_IEEEDEC1A__VTC, oldVtc,
                    VTC_EDEFAULT, oldVtcESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVtc() {
        return vtcESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__TAN:
            return getTan();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VOMIN:
            return getVomin();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__TW5:
            return getTw5();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VTLMT:
            return getVtlmt();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__TL1:
            return getTl1();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__TL2:
            return getTl2();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__KETL:
            return getKetl();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__KAN:
            return getKan();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VOMAX:
            return getVomax();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VSMIN:
            return getVsmin();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VANMAX:
            return getVanmax();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__TD:
            return getTd();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VSMAX:
            return getVsmax();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VAL:
            return getVal();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VTM:
            return getVtm();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VTN:
            return getVtn();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__ESC:
            return getEsc();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VTC:
            return getVtc();
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
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__TAN:
            setTan( ( Double ) newValue );
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VOMIN:
            setVomin( ( Double ) newValue );
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__TW5:
            setTw5( ( Double ) newValue );
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VTLMT:
            setVtlmt( ( Double ) newValue );
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__TL1:
            setTl1( ( Double ) newValue );
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__TL2:
            setTl2( ( Double ) newValue );
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__KETL:
            setKetl( ( Double ) newValue );
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__KAN:
            setKan( ( Double ) newValue );
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VOMAX:
            setVomax( ( Double ) newValue );
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VSMIN:
            setVsmin( ( Double ) newValue );
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VANMAX:
            setVanmax( ( Double ) newValue );
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__TD:
            setTd( ( Double ) newValue );
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VSMAX:
            setVsmax( ( Double ) newValue );
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VAL:
            setVal( ( Double ) newValue );
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VTM:
            setVtm( ( Double ) newValue );
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VTN:
            setVtn( ( Double ) newValue );
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__ESC:
            setEsc( ( Double ) newValue );
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VTC:
            setVtc( ( Double ) newValue );
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
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__TAN:
            unsetTan();
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VOMIN:
            unsetVomin();
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__TW5:
            unsetTw5();
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VTLMT:
            unsetVtlmt();
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__TL1:
            unsetTl1();
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__TL2:
            unsetTl2();
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__KETL:
            unsetKetl();
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__KAN:
            unsetKan();
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VOMAX:
            unsetVomax();
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VSMIN:
            unsetVsmin();
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VANMAX:
            unsetVanmax();
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__TD:
            unsetTd();
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VSMAX:
            unsetVsmax();
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VAL:
            unsetVal();
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VTM:
            unsetVtm();
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VTN:
            unsetVtn();
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__ESC:
            unsetEsc();
            return;
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VTC:
            unsetVtc();
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
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__TAN:
            return isSetTan();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VOMIN:
            return isSetVomin();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__TW5:
            return isSetTw5();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VTLMT:
            return isSetVtlmt();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__TL1:
            return isSetTl1();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__TL2:
            return isSetTl2();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__KETL:
            return isSetKetl();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__KAN:
            return isSetKan();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VOMAX:
            return isSetVomax();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VSMIN:
            return isSetVsmin();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VANMAX:
            return isSetVanmax();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__TD:
            return isSetTd();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VSMAX:
            return isSetVsmax();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VAL:
            return isSetVal();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VTM:
            return isSetVtm();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VTN:
            return isSetVtn();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__ESC:
            return isSetEsc();
        case CimPackage.DISC_EXC_CONT_IEEEDEC1A__VTC:
            return isSetVtc();
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
        result.append( " (tan: " );
        if( tanESet )
            result.append( tan );
        else
            result.append( "<unset>" );
        result.append( ", vomin: " );
        if( vominESet )
            result.append( vomin );
        else
            result.append( "<unset>" );
        result.append( ", tw5: " );
        if( tw5ESet )
            result.append( tw5 );
        else
            result.append( "<unset>" );
        result.append( ", vtlmt: " );
        if( vtlmtESet )
            result.append( vtlmt );
        else
            result.append( "<unset>" );
        result.append( ", tl1: " );
        if( tl1ESet )
            result.append( tl1 );
        else
            result.append( "<unset>" );
        result.append( ", tl2: " );
        if( tl2ESet )
            result.append( tl2 );
        else
            result.append( "<unset>" );
        result.append( ", ketl: " );
        if( ketlESet )
            result.append( ketl );
        else
            result.append( "<unset>" );
        result.append( ", kan: " );
        if( kanESet )
            result.append( kan );
        else
            result.append( "<unset>" );
        result.append( ", vomax: " );
        if( vomaxESet )
            result.append( vomax );
        else
            result.append( "<unset>" );
        result.append( ", vsmin: " );
        if( vsminESet )
            result.append( vsmin );
        else
            result.append( "<unset>" );
        result.append( ", vanmax: " );
        if( vanmaxESet )
            result.append( vanmax );
        else
            result.append( "<unset>" );
        result.append( ", td: " );
        if( tdESet )
            result.append( td );
        else
            result.append( "<unset>" );
        result.append( ", vsmax: " );
        if( vsmaxESet )
            result.append( vsmax );
        else
            result.append( "<unset>" );
        result.append( ", val: " );
        if( valESet )
            result.append( val );
        else
            result.append( "<unset>" );
        result.append( ", vtm: " );
        if( vtmESet )
            result.append( vtm );
        else
            result.append( "<unset>" );
        result.append( ", vtn: " );
        if( vtnESet )
            result.append( vtn );
        else
            result.append( "<unset>" );
        result.append( ", esc: " );
        if( escESet )
            result.append( esc );
        else
            result.append( "<unset>" );
        result.append( ", vtc: " );
        if( vtcESet )
            result.append( vtc );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //DiscExcContIEEEDEC1AImpl

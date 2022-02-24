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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACLineSegment;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Clamp;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Cut;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AC Line Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ACLineSegmentImpl#getCut <em>Cut</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ACLineSegmentImpl#getR <em>R</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ACLineSegmentImpl#getX <em>X</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ACLineSegmentImpl#getBch <em>Bch</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ACLineSegmentImpl#getClamp <em>Clamp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ACLineSegmentImpl#getGch <em>Gch</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ACLineSegmentImpl#getG0ch <em>G0ch</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ACLineSegmentImpl#getShortCircuitEndTemperature <em>Short Circuit End Temperature</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ACLineSegmentImpl#getX0 <em>X0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ACLineSegmentImpl#getB0ch <em>B0ch</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ACLineSegmentImpl#getR0 <em>R0</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ACLineSegmentImpl extends ConductorImpl implements ACLineSegment {
    /**
     * The cached value of the '{@link #getCut() <em>Cut</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCut()
     * @generated
     * @ordered
     */
    protected EList< Cut > cut;

    /**
     * The default value of the '{@link #getR() <em>R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR()
     * @generated
     * @ordered
     */
    protected static final Double R_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getR() <em>R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR()
     * @generated
     * @ordered
     */
    protected Double r = R_EDEFAULT;

    /**
     * This is true if the R attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rESet;

    /**
     * The default value of the '{@link #getX() <em>X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX()
     * @generated
     * @ordered
     */
    protected static final Double X_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getX() <em>X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX()
     * @generated
     * @ordered
     */
    protected Double x = X_EDEFAULT;

    /**
     * This is true if the X attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xESet;

    /**
     * The default value of the '{@link #getBch() <em>Bch</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBch()
     * @generated
     * @ordered
     */
    protected static final Double BCH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBch() <em>Bch</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBch()
     * @generated
     * @ordered
     */
    protected Double bch = BCH_EDEFAULT;

    /**
     * This is true if the Bch attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean bchESet;

    /**
     * The cached value of the '{@link #getClamp() <em>Clamp</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getClamp()
     * @generated
     * @ordered
     */
    protected EList< Clamp > clamp;

    /**
     * The default value of the '{@link #getGch() <em>Gch</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGch()
     * @generated
     * @ordered
     */
    protected static final Double GCH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGch() <em>Gch</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGch()
     * @generated
     * @ordered
     */
    protected Double gch = GCH_EDEFAULT;

    /**
     * This is true if the Gch attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean gchESet;

    /**
     * The default value of the '{@link #getG0ch() <em>G0ch</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getG0ch()
     * @generated
     * @ordered
     */
    protected static final Double G0CH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getG0ch() <em>G0ch</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getG0ch()
     * @generated
     * @ordered
     */
    protected Double g0ch = G0CH_EDEFAULT;

    /**
     * This is true if the G0ch attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean g0chESet;

    /**
     * The default value of the '{@link #getShortCircuitEndTemperature() <em>Short Circuit End Temperature</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getShortCircuitEndTemperature()
     * @generated
     * @ordered
     */
    protected static final Double SHORT_CIRCUIT_END_TEMPERATURE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getShortCircuitEndTemperature() <em>Short Circuit End Temperature</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getShortCircuitEndTemperature()
     * @generated
     * @ordered
     */
    protected Double shortCircuitEndTemperature = SHORT_CIRCUIT_END_TEMPERATURE_EDEFAULT;

    /**
     * This is true if the Short Circuit End Temperature attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean shortCircuitEndTemperatureESet;

    /**
     * The default value of the '{@link #getX0() <em>X0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX0()
     * @generated
     * @ordered
     */
    protected static final Double X0_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getX0() <em>X0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getX0()
     * @generated
     * @ordered
     */
    protected Double x0 = X0_EDEFAULT;

    /**
     * This is true if the X0 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean x0ESet;

    /**
     * The default value of the '{@link #getB0ch() <em>B0ch</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getB0ch()
     * @generated
     * @ordered
     */
    protected static final Double B0CH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getB0ch() <em>B0ch</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getB0ch()
     * @generated
     * @ordered
     */
    protected Double b0ch = B0CH_EDEFAULT;

    /**
     * This is true if the B0ch attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean b0chESet;

    /**
     * The default value of the '{@link #getR0() <em>R0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR0()
     * @generated
     * @ordered
     */
    protected static final Double R0_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getR0() <em>R0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getR0()
     * @generated
     * @ordered
     */
    protected Double r0 = R0_EDEFAULT;

    /**
     * This is true if the R0 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean r0ESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ACLineSegmentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getACLineSegment();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Clamp > getClamp() {
        if( clamp == null ) {
            clamp = new EObjectWithInverseResolvingEList.Unsettable< >( Clamp.class, this,
                    CimPackage.AC_LINE_SEGMENT__CLAMP, CimPackage.CLAMP__AC_LINE_SEGMENT );
        }
        return clamp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetClamp() {
        if( clamp != null ) ( ( InternalEList.Unsettable< ? > ) clamp ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetClamp() {
        return clamp != null && ( ( InternalEList.Unsettable< ? > ) clamp ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getGch() {
        return gch;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGch( Double newGch ) {
        Double oldGch = gch;
        gch = newGch;
        boolean oldGchESet = gchESet;
        gchESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.AC_LINE_SEGMENT__GCH, oldGch, gch,
                    !oldGchESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGch() {
        Double oldGch = gch;
        boolean oldGchESet = gchESet;
        gch = GCH_EDEFAULT;
        gchESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.AC_LINE_SEGMENT__GCH, oldGch,
                    GCH_EDEFAULT, oldGchESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGch() {
        return gchESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getG0ch() {
        return g0ch;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setG0ch( Double newG0ch ) {
        Double oldG0ch = g0ch;
        g0ch = newG0ch;
        boolean oldG0chESet = g0chESet;
        g0chESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.AC_LINE_SEGMENT__G0CH, oldG0ch, g0ch,
                    !oldG0chESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetG0ch() {
        Double oldG0ch = g0ch;
        boolean oldG0chESet = g0chESet;
        g0ch = G0CH_EDEFAULT;
        g0chESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.AC_LINE_SEGMENT__G0CH, oldG0ch,
                    G0CH_EDEFAULT, oldG0chESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetG0ch() {
        return g0chESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getShortCircuitEndTemperature() {
        return shortCircuitEndTemperature;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setShortCircuitEndTemperature( Double newShortCircuitEndTemperature ) {
        Double oldShortCircuitEndTemperature = shortCircuitEndTemperature;
        shortCircuitEndTemperature = newShortCircuitEndTemperature;
        boolean oldShortCircuitEndTemperatureESet = shortCircuitEndTemperatureESet;
        shortCircuitEndTemperatureESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.AC_LINE_SEGMENT__SHORT_CIRCUIT_END_TEMPERATURE, oldShortCircuitEndTemperature,
                    shortCircuitEndTemperature, !oldShortCircuitEndTemperatureESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetShortCircuitEndTemperature() {
        Double oldShortCircuitEndTemperature = shortCircuitEndTemperature;
        boolean oldShortCircuitEndTemperatureESet = shortCircuitEndTemperatureESet;
        shortCircuitEndTemperature = SHORT_CIRCUIT_END_TEMPERATURE_EDEFAULT;
        shortCircuitEndTemperatureESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.AC_LINE_SEGMENT__SHORT_CIRCUIT_END_TEMPERATURE, oldShortCircuitEndTemperature,
                    SHORT_CIRCUIT_END_TEMPERATURE_EDEFAULT, oldShortCircuitEndTemperatureESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetShortCircuitEndTemperature() {
        return shortCircuitEndTemperatureESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getX0() {
        return x0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setX0( Double newX0 ) {
        Double oldX0 = x0;
        x0 = newX0;
        boolean oldX0ESet = x0ESet;
        x0ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.AC_LINE_SEGMENT__X0, oldX0, x0,
                    !oldX0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetX0() {
        Double oldX0 = x0;
        boolean oldX0ESet = x0ESet;
        x0 = X0_EDEFAULT;
        x0ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.AC_LINE_SEGMENT__X0, oldX0,
                    X0_EDEFAULT, oldX0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetX0() {
        return x0ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getB0ch() {
        return b0ch;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setB0ch( Double newB0ch ) {
        Double oldB0ch = b0ch;
        b0ch = newB0ch;
        boolean oldB0chESet = b0chESet;
        b0chESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.AC_LINE_SEGMENT__B0CH, oldB0ch, b0ch,
                    !oldB0chESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetB0ch() {
        Double oldB0ch = b0ch;
        boolean oldB0chESet = b0chESet;
        b0ch = B0CH_EDEFAULT;
        b0chESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.AC_LINE_SEGMENT__B0CH, oldB0ch,
                    B0CH_EDEFAULT, oldB0chESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetB0ch() {
        return b0chESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getR0() {
        return r0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setR0( Double newR0 ) {
        Double oldR0 = r0;
        r0 = newR0;
        boolean oldR0ESet = r0ESet;
        r0ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.AC_LINE_SEGMENT__R0, oldR0, r0,
                    !oldR0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetR0() {
        Double oldR0 = r0;
        boolean oldR0ESet = r0ESet;
        r0 = R0_EDEFAULT;
        r0ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.AC_LINE_SEGMENT__R0, oldR0,
                    R0_EDEFAULT, oldR0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetR0() {
        return r0ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< Cut > getCut() {
        if( cut == null ) {
            cut = new EObjectWithInverseResolvingEList.Unsettable< >( Cut.class, this,
                    CimPackage.AC_LINE_SEGMENT__CUT, CimPackage.CUT__AC_LINE_SEGMENT );
        }
        return cut;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCut() {
        if( cut != null ) ( ( InternalEList.Unsettable< ? > ) cut ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCut() {
        return cut != null && ( ( InternalEList.Unsettable< ? > ) cut ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getX() {
        return x;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setX( Double newX ) {
        Double oldX = x;
        x = newX;
        boolean oldXESet = xESet;
        xESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.AC_LINE_SEGMENT__X, oldX, x,
                    !oldXESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetX() {
        Double oldX = x;
        boolean oldXESet = xESet;
        x = X_EDEFAULT;
        xESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.AC_LINE_SEGMENT__X, oldX, X_EDEFAULT,
                    oldXESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetX() {
        return xESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getR() {
        return r;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setR( Double newR ) {
        Double oldR = r;
        r = newR;
        boolean oldRESet = rESet;
        rESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.AC_LINE_SEGMENT__R, oldR, r,
                    !oldRESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetR() {
        Double oldR = r;
        boolean oldRESet = rESet;
        r = R_EDEFAULT;
        rESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.AC_LINE_SEGMENT__R, oldR, R_EDEFAULT,
                    oldRESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetR() {
        return rESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getBch() {
        return bch;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBch( Double newBch ) {
        Double oldBch = bch;
        bch = newBch;
        boolean oldBchESet = bchESet;
        bchESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.AC_LINE_SEGMENT__BCH, oldBch, bch,
                    !oldBchESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBch() {
        Double oldBch = bch;
        boolean oldBchESet = bchESet;
        bch = BCH_EDEFAULT;
        bchESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.AC_LINE_SEGMENT__BCH, oldBch,
                    BCH_EDEFAULT, oldBchESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBch() {
        return bchESet;
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
        case CimPackage.AC_LINE_SEGMENT__CUT:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getCut() ).basicAdd( otherEnd, msgs );
        case CimPackage.AC_LINE_SEGMENT__CLAMP:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getClamp() ).basicAdd( otherEnd,
                    msgs );
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
        case CimPackage.AC_LINE_SEGMENT__CUT:
            return ( ( InternalEList< ? > ) getCut() ).basicRemove( otherEnd, msgs );
        case CimPackage.AC_LINE_SEGMENT__CLAMP:
            return ( ( InternalEList< ? > ) getClamp() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.AC_LINE_SEGMENT__CUT:
            return getCut();
        case CimPackage.AC_LINE_SEGMENT__R:
            return getR();
        case CimPackage.AC_LINE_SEGMENT__X:
            return getX();
        case CimPackage.AC_LINE_SEGMENT__BCH:
            return getBch();
        case CimPackage.AC_LINE_SEGMENT__CLAMP:
            return getClamp();
        case CimPackage.AC_LINE_SEGMENT__GCH:
            return getGch();
        case CimPackage.AC_LINE_SEGMENT__G0CH:
            return getG0ch();
        case CimPackage.AC_LINE_SEGMENT__SHORT_CIRCUIT_END_TEMPERATURE:
            return getShortCircuitEndTemperature();
        case CimPackage.AC_LINE_SEGMENT__X0:
            return getX0();
        case CimPackage.AC_LINE_SEGMENT__B0CH:
            return getB0ch();
        case CimPackage.AC_LINE_SEGMENT__R0:
            return getR0();
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
        case CimPackage.AC_LINE_SEGMENT__CUT:
            getCut().clear();
            getCut().addAll( ( Collection< ? extends Cut > ) newValue );
            return;
        case CimPackage.AC_LINE_SEGMENT__R:
            setR( ( Double ) newValue );
            return;
        case CimPackage.AC_LINE_SEGMENT__X:
            setX( ( Double ) newValue );
            return;
        case CimPackage.AC_LINE_SEGMENT__BCH:
            setBch( ( Double ) newValue );
            return;
        case CimPackage.AC_LINE_SEGMENT__CLAMP:
            getClamp().clear();
            getClamp().addAll( ( Collection< ? extends Clamp > ) newValue );
            return;
        case CimPackage.AC_LINE_SEGMENT__GCH:
            setGch( ( Double ) newValue );
            return;
        case CimPackage.AC_LINE_SEGMENT__G0CH:
            setG0ch( ( Double ) newValue );
            return;
        case CimPackage.AC_LINE_SEGMENT__SHORT_CIRCUIT_END_TEMPERATURE:
            setShortCircuitEndTemperature( ( Double ) newValue );
            return;
        case CimPackage.AC_LINE_SEGMENT__X0:
            setX0( ( Double ) newValue );
            return;
        case CimPackage.AC_LINE_SEGMENT__B0CH:
            setB0ch( ( Double ) newValue );
            return;
        case CimPackage.AC_LINE_SEGMENT__R0:
            setR0( ( Double ) newValue );
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
        case CimPackage.AC_LINE_SEGMENT__CUT:
            unsetCut();
            return;
        case CimPackage.AC_LINE_SEGMENT__R:
            unsetR();
            return;
        case CimPackage.AC_LINE_SEGMENT__X:
            unsetX();
            return;
        case CimPackage.AC_LINE_SEGMENT__BCH:
            unsetBch();
            return;
        case CimPackage.AC_LINE_SEGMENT__CLAMP:
            unsetClamp();
            return;
        case CimPackage.AC_LINE_SEGMENT__GCH:
            unsetGch();
            return;
        case CimPackage.AC_LINE_SEGMENT__G0CH:
            unsetG0ch();
            return;
        case CimPackage.AC_LINE_SEGMENT__SHORT_CIRCUIT_END_TEMPERATURE:
            unsetShortCircuitEndTemperature();
            return;
        case CimPackage.AC_LINE_SEGMENT__X0:
            unsetX0();
            return;
        case CimPackage.AC_LINE_SEGMENT__B0CH:
            unsetB0ch();
            return;
        case CimPackage.AC_LINE_SEGMENT__R0:
            unsetR0();
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
        case CimPackage.AC_LINE_SEGMENT__CUT:
            return isSetCut();
        case CimPackage.AC_LINE_SEGMENT__R:
            return isSetR();
        case CimPackage.AC_LINE_SEGMENT__X:
            return isSetX();
        case CimPackage.AC_LINE_SEGMENT__BCH:
            return isSetBch();
        case CimPackage.AC_LINE_SEGMENT__CLAMP:
            return isSetClamp();
        case CimPackage.AC_LINE_SEGMENT__GCH:
            return isSetGch();
        case CimPackage.AC_LINE_SEGMENT__G0CH:
            return isSetG0ch();
        case CimPackage.AC_LINE_SEGMENT__SHORT_CIRCUIT_END_TEMPERATURE:
            return isSetShortCircuitEndTemperature();
        case CimPackage.AC_LINE_SEGMENT__X0:
            return isSetX0();
        case CimPackage.AC_LINE_SEGMENT__B0CH:
            return isSetB0ch();
        case CimPackage.AC_LINE_SEGMENT__R0:
            return isSetR0();
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
        result.append( " (r: " );
        if( rESet )
            result.append( r );
        else
            result.append( "<unset>" );
        result.append( ", x: " );
        if( xESet )
            result.append( x );
        else
            result.append( "<unset>" );
        result.append( ", bch: " );
        if( bchESet )
            result.append( bch );
        else
            result.append( "<unset>" );
        result.append( ", gch: " );
        if( gchESet )
            result.append( gch );
        else
            result.append( "<unset>" );
        result.append( ", g0ch: " );
        if( g0chESet )
            result.append( g0ch );
        else
            result.append( "<unset>" );
        result.append( ", shortCircuitEndTemperature: " );
        if( shortCircuitEndTemperatureESet )
            result.append( shortCircuitEndTemperature );
        else
            result.append( "<unset>" );
        result.append( ", x0: " );
        if( x0ESet )
            result.append( x0 );
        else
            result.append( "<unset>" );
        result.append( ", b0ch: " );
        if( b0chESet )
            result.append( b0ch );
        else
            result.append( "<unset>" );
        result.append( ", r0: " );
        if( r0ESet )
            result.append( r0 );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ACLineSegmentImpl

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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerTransformer;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerTransformerEnd;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindingConnection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Power Transformer End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PowerTransformerEndImpl#getRatedS <em>Rated S</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PowerTransformerEndImpl#getRatedU <em>Rated U</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PowerTransformerEndImpl#getX <em>X</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PowerTransformerEndImpl#getB <em>B</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PowerTransformerEndImpl#getR <em>R</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PowerTransformerEndImpl#getG <em>G</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PowerTransformerEndImpl#getConnectionKind <em>Connection Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PowerTransformerEndImpl#getPowerTransformer <em>Power Transformer</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PowerTransformerEndImpl#getB0 <em>B0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PowerTransformerEndImpl#getR0 <em>R0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PowerTransformerEndImpl#getG0 <em>G0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PowerTransformerEndImpl#getX0 <em>X0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PowerTransformerEndImpl#getPhaseAngleClock <em>Phase Angle Clock</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PowerTransformerEndImpl extends TransformerEndImpl implements PowerTransformerEnd {
    /**
     * The default value of the '{@link #getRatedS() <em>Rated S</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedS()
     * @generated
     * @ordered
     */
    protected static final Double RATED_S_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRatedS() <em>Rated S</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedS()
     * @generated
     * @ordered
     */
    protected Double ratedS = RATED_S_EDEFAULT;

    /**
     * This is true if the Rated S attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ratedSESet;

    /**
     * The default value of the '{@link #getRatedU() <em>Rated U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedU()
     * @generated
     * @ordered
     */
    protected static final Double RATED_U_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRatedU() <em>Rated U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedU()
     * @generated
     * @ordered
     */
    protected Double ratedU = RATED_U_EDEFAULT;

    /**
     * This is true if the Rated U attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ratedUESet;

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
     * The default value of the '{@link #getB() <em>B</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getB()
     * @generated
     * @ordered
     */
    protected static final Double B_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getB() <em>B</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getB()
     * @generated
     * @ordered
     */
    protected Double b = B_EDEFAULT;

    /**
     * This is true if the B attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean bESet;

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
     * The default value of the '{@link #getG() <em>G</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getG()
     * @generated
     * @ordered
     */
    protected static final Double G_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getG() <em>G</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getG()
     * @generated
     * @ordered
     */
    protected Double g = G_EDEFAULT;

    /**
     * This is true if the G attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean gESet;

    /**
     * The default value of the '{@link #getConnectionKind() <em>Connection Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnectionKind()
     * @generated
     * @ordered
     */
    protected static final WindingConnection CONNECTION_KIND_EDEFAULT = WindingConnection.ZN;

    /**
     * The cached value of the '{@link #getConnectionKind() <em>Connection Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConnectionKind()
     * @generated
     * @ordered
     */
    protected WindingConnection connectionKind = CONNECTION_KIND_EDEFAULT;

    /**
     * This is true if the Connection Kind attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean connectionKindESet;

    /**
     * The cached value of the '{@link #getPowerTransformer() <em>Power Transformer</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPowerTransformer()
     * @generated
     * @ordered
     */
    protected PowerTransformer powerTransformer;

    /**
     * This is true if the Power Transformer reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean powerTransformerESet;

    /**
     * The default value of the '{@link #getB0() <em>B0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getB0()
     * @generated
     * @ordered
     */
    protected static final Double B0_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getB0() <em>B0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getB0()
     * @generated
     * @ordered
     */
    protected Double b0 = B0_EDEFAULT;

    /**
     * This is true if the B0 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean b0ESet;

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
     * The default value of the '{@link #getG0() <em>G0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getG0()
     * @generated
     * @ordered
     */
    protected static final Double G0_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getG0() <em>G0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getG0()
     * @generated
     * @ordered
     */
    protected Double g0 = G0_EDEFAULT;

    /**
     * This is true if the G0 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean g0ESet;

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
     * The default value of the '{@link #getPhaseAngleClock() <em>Phase Angle Clock</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhaseAngleClock()
     * @generated
     * @ordered
     */
    protected static final BigInteger PHASE_ANGLE_CLOCK_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPhaseAngleClock() <em>Phase Angle Clock</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhaseAngleClock()
     * @generated
     * @ordered
     */
    protected BigInteger phaseAngleClock = PHASE_ANGLE_CLOCK_EDEFAULT;

    /**
     * This is true if the Phase Angle Clock attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean phaseAngleClockESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PowerTransformerEndImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getPowerTransformerEnd();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getG() {
        return g;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setG( Double newG ) {
        Double oldG = g;
        g = newG;
        boolean oldGESet = gESet;
        gESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.POWER_TRANSFORMER_END__G, oldG, g,
                    !oldGESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetG() {
        Double oldG = g;
        boolean oldGESet = gESet;
        g = G_EDEFAULT;
        gESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.POWER_TRANSFORMER_END__G, oldG,
                    G_EDEFAULT, oldGESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetG() {
        return gESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.POWER_TRANSFORMER_END__R, oldR, r,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.POWER_TRANSFORMER_END__R, oldR,
                    R_EDEFAULT, oldRESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.POWER_TRANSFORMER_END__X, oldX, x,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.POWER_TRANSFORMER_END__X, oldX,
                    X_EDEFAULT, oldXESet ) );
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
    public Double getB() {
        return b;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setB( Double newB ) {
        Double oldB = b;
        b = newB;
        boolean oldBESet = bESet;
        bESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.POWER_TRANSFORMER_END__B, oldB, b,
                    !oldBESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetB() {
        Double oldB = b;
        boolean oldBESet = bESet;
        b = B_EDEFAULT;
        bESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.POWER_TRANSFORMER_END__B, oldB,
                    B_EDEFAULT, oldBESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetB() {
        return bESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PowerTransformer getPowerTransformer() {
        return powerTransformer;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPowerTransformer( PowerTransformer newPowerTransformer, NotificationChain msgs ) {
        PowerTransformer oldPowerTransformer = powerTransformer;
        powerTransformer = newPowerTransformer;
        boolean oldPowerTransformerESet = powerTransformerESet;
        powerTransformerESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.POWER_TRANSFORMER_END__POWER_TRANSFORMER, oldPowerTransformer, newPowerTransformer,
                    !oldPowerTransformerESet );
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
    public void setPowerTransformer( PowerTransformer newPowerTransformer ) {
        if( newPowerTransformer != powerTransformer ) {
            NotificationChain msgs = null;
            if( powerTransformer != null )
                msgs = ( ( InternalEObject ) powerTransformer ).eInverseRemove( this,
                        CimPackage.POWER_TRANSFORMER__POWER_TRANSFORMER_END, PowerTransformer.class, msgs );
            if( newPowerTransformer != null )
                msgs = ( ( InternalEObject ) newPowerTransformer ).eInverseAdd( this,
                        CimPackage.POWER_TRANSFORMER__POWER_TRANSFORMER_END, PowerTransformer.class, msgs );
            msgs = basicSetPowerTransformer( newPowerTransformer, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPowerTransformerESet = powerTransformerESet;
            powerTransformerESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        CimPackage.POWER_TRANSFORMER_END__POWER_TRANSFORMER, newPowerTransformer, newPowerTransformer,
                        !oldPowerTransformerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetPowerTransformer( NotificationChain msgs ) {
        PowerTransformer oldPowerTransformer = powerTransformer;
        powerTransformer = null;
        boolean oldPowerTransformerESet = powerTransformerESet;
        powerTransformerESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.POWER_TRANSFORMER_END__POWER_TRANSFORMER, oldPowerTransformer, null,
                    oldPowerTransformerESet );
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
    public void unsetPowerTransformer() {
        if( powerTransformer != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) powerTransformer ).eInverseRemove( this,
                    CimPackage.POWER_TRANSFORMER__POWER_TRANSFORMER_END, PowerTransformer.class, msgs );
            msgs = basicUnsetPowerTransformer( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPowerTransformerESet = powerTransformerESet;
            powerTransformerESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.POWER_TRANSFORMER_END__POWER_TRANSFORMER, null, null, oldPowerTransformerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPowerTransformer() {
        return powerTransformerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getB0() {
        return b0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setB0( Double newB0 ) {
        Double oldB0 = b0;
        b0 = newB0;
        boolean oldB0ESet = b0ESet;
        b0ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.POWER_TRANSFORMER_END__B0, oldB0, b0,
                    !oldB0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetB0() {
        Double oldB0 = b0;
        boolean oldB0ESet = b0ESet;
        b0 = B0_EDEFAULT;
        b0ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.POWER_TRANSFORMER_END__B0, oldB0,
                    B0_EDEFAULT, oldB0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetB0() {
        return b0ESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.POWER_TRANSFORMER_END__R0, oldR0, r0,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.POWER_TRANSFORMER_END__R0, oldR0,
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
    public Double getG0() {
        return g0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setG0( Double newG0 ) {
        Double oldG0 = g0;
        g0 = newG0;
        boolean oldG0ESet = g0ESet;
        g0ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.POWER_TRANSFORMER_END__G0, oldG0, g0,
                    !oldG0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetG0() {
        Double oldG0 = g0;
        boolean oldG0ESet = g0ESet;
        g0 = G0_EDEFAULT;
        g0ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.POWER_TRANSFORMER_END__G0, oldG0,
                    G0_EDEFAULT, oldG0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetG0() {
        return g0ESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.POWER_TRANSFORMER_END__X0, oldX0, x0,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.POWER_TRANSFORMER_END__X0, oldX0,
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
    public BigInteger getPhaseAngleClock() {
        return phaseAngleClock;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPhaseAngleClock( BigInteger newPhaseAngleClock ) {
        BigInteger oldPhaseAngleClock = phaseAngleClock;
        phaseAngleClock = newPhaseAngleClock;
        boolean oldPhaseAngleClockESet = phaseAngleClockESet;
        phaseAngleClockESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.POWER_TRANSFORMER_END__PHASE_ANGLE_CLOCK,
                    oldPhaseAngleClock, phaseAngleClock, !oldPhaseAngleClockESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPhaseAngleClock() {
        BigInteger oldPhaseAngleClock = phaseAngleClock;
        boolean oldPhaseAngleClockESet = phaseAngleClockESet;
        phaseAngleClock = PHASE_ANGLE_CLOCK_EDEFAULT;
        phaseAngleClockESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.POWER_TRANSFORMER_END__PHASE_ANGLE_CLOCK, oldPhaseAngleClock, PHASE_ANGLE_CLOCK_EDEFAULT,
                    oldPhaseAngleClockESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPhaseAngleClock() {
        return phaseAngleClockESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getRatedU() {
        return ratedU;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRatedU( Double newRatedU ) {
        Double oldRatedU = ratedU;
        ratedU = newRatedU;
        boolean oldRatedUESet = ratedUESet;
        ratedUESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.POWER_TRANSFORMER_END__RATED_U,
                    oldRatedU, ratedU, !oldRatedUESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRatedU() {
        Double oldRatedU = ratedU;
        boolean oldRatedUESet = ratedUESet;
        ratedU = RATED_U_EDEFAULT;
        ratedUESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.POWER_TRANSFORMER_END__RATED_U,
                    oldRatedU, RATED_U_EDEFAULT, oldRatedUESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRatedU() {
        return ratedUESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getRatedS() {
        return ratedS;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRatedS( Double newRatedS ) {
        Double oldRatedS = ratedS;
        ratedS = newRatedS;
        boolean oldRatedSESet = ratedSESet;
        ratedSESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.POWER_TRANSFORMER_END__RATED_S,
                    oldRatedS, ratedS, !oldRatedSESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRatedS() {
        Double oldRatedS = ratedS;
        boolean oldRatedSESet = ratedSESet;
        ratedS = RATED_S_EDEFAULT;
        ratedSESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.POWER_TRANSFORMER_END__RATED_S,
                    oldRatedS, RATED_S_EDEFAULT, oldRatedSESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRatedS() {
        return ratedSESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindingConnection getConnectionKind() {
        return connectionKind;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setConnectionKind( WindingConnection newConnectionKind ) {
        WindingConnection oldConnectionKind = connectionKind;
        connectionKind = newConnectionKind == null ? CONNECTION_KIND_EDEFAULT : newConnectionKind;
        boolean oldConnectionKindESet = connectionKindESet;
        connectionKindESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.POWER_TRANSFORMER_END__CONNECTION_KIND,
                    oldConnectionKind, connectionKind, !oldConnectionKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetConnectionKind() {
        WindingConnection oldConnectionKind = connectionKind;
        boolean oldConnectionKindESet = connectionKindESet;
        connectionKind = CONNECTION_KIND_EDEFAULT;
        connectionKindESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.POWER_TRANSFORMER_END__CONNECTION_KIND,
                    oldConnectionKind, CONNECTION_KIND_EDEFAULT, oldConnectionKindESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetConnectionKind() {
        return connectionKindESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.POWER_TRANSFORMER_END__POWER_TRANSFORMER:
            if( powerTransformer != null )
                msgs = ( ( InternalEObject ) powerTransformer ).eInverseRemove( this,
                        CimPackage.POWER_TRANSFORMER__POWER_TRANSFORMER_END, PowerTransformer.class, msgs );
            return basicSetPowerTransformer( ( PowerTransformer ) otherEnd, msgs );
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
        case CimPackage.POWER_TRANSFORMER_END__POWER_TRANSFORMER:
            return basicUnsetPowerTransformer( msgs );
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
        case CimPackage.POWER_TRANSFORMER_END__RATED_S:
            return getRatedS();
        case CimPackage.POWER_TRANSFORMER_END__RATED_U:
            return getRatedU();
        case CimPackage.POWER_TRANSFORMER_END__X:
            return getX();
        case CimPackage.POWER_TRANSFORMER_END__B:
            return getB();
        case CimPackage.POWER_TRANSFORMER_END__R:
            return getR();
        case CimPackage.POWER_TRANSFORMER_END__G:
            return getG();
        case CimPackage.POWER_TRANSFORMER_END__CONNECTION_KIND:
            return getConnectionKind();
        case CimPackage.POWER_TRANSFORMER_END__POWER_TRANSFORMER:
            return getPowerTransformer();
        case CimPackage.POWER_TRANSFORMER_END__B0:
            return getB0();
        case CimPackage.POWER_TRANSFORMER_END__R0:
            return getR0();
        case CimPackage.POWER_TRANSFORMER_END__G0:
            return getG0();
        case CimPackage.POWER_TRANSFORMER_END__X0:
            return getX0();
        case CimPackage.POWER_TRANSFORMER_END__PHASE_ANGLE_CLOCK:
            return getPhaseAngleClock();
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
        case CimPackage.POWER_TRANSFORMER_END__RATED_S:
            setRatedS( ( Double ) newValue );
            return;
        case CimPackage.POWER_TRANSFORMER_END__RATED_U:
            setRatedU( ( Double ) newValue );
            return;
        case CimPackage.POWER_TRANSFORMER_END__X:
            setX( ( Double ) newValue );
            return;
        case CimPackage.POWER_TRANSFORMER_END__B:
            setB( ( Double ) newValue );
            return;
        case CimPackage.POWER_TRANSFORMER_END__R:
            setR( ( Double ) newValue );
            return;
        case CimPackage.POWER_TRANSFORMER_END__G:
            setG( ( Double ) newValue );
            return;
        case CimPackage.POWER_TRANSFORMER_END__CONNECTION_KIND:
            setConnectionKind( ( WindingConnection ) newValue );
            return;
        case CimPackage.POWER_TRANSFORMER_END__POWER_TRANSFORMER:
            setPowerTransformer( ( PowerTransformer ) newValue );
            return;
        case CimPackage.POWER_TRANSFORMER_END__B0:
            setB0( ( Double ) newValue );
            return;
        case CimPackage.POWER_TRANSFORMER_END__R0:
            setR0( ( Double ) newValue );
            return;
        case CimPackage.POWER_TRANSFORMER_END__G0:
            setG0( ( Double ) newValue );
            return;
        case CimPackage.POWER_TRANSFORMER_END__X0:
            setX0( ( Double ) newValue );
            return;
        case CimPackage.POWER_TRANSFORMER_END__PHASE_ANGLE_CLOCK:
            setPhaseAngleClock( ( BigInteger ) newValue );
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
        case CimPackage.POWER_TRANSFORMER_END__RATED_S:
            unsetRatedS();
            return;
        case CimPackage.POWER_TRANSFORMER_END__RATED_U:
            unsetRatedU();
            return;
        case CimPackage.POWER_TRANSFORMER_END__X:
            unsetX();
            return;
        case CimPackage.POWER_TRANSFORMER_END__B:
            unsetB();
            return;
        case CimPackage.POWER_TRANSFORMER_END__R:
            unsetR();
            return;
        case CimPackage.POWER_TRANSFORMER_END__G:
            unsetG();
            return;
        case CimPackage.POWER_TRANSFORMER_END__CONNECTION_KIND:
            unsetConnectionKind();
            return;
        case CimPackage.POWER_TRANSFORMER_END__POWER_TRANSFORMER:
            unsetPowerTransformer();
            return;
        case CimPackage.POWER_TRANSFORMER_END__B0:
            unsetB0();
            return;
        case CimPackage.POWER_TRANSFORMER_END__R0:
            unsetR0();
            return;
        case CimPackage.POWER_TRANSFORMER_END__G0:
            unsetG0();
            return;
        case CimPackage.POWER_TRANSFORMER_END__X0:
            unsetX0();
            return;
        case CimPackage.POWER_TRANSFORMER_END__PHASE_ANGLE_CLOCK:
            unsetPhaseAngleClock();
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
        case CimPackage.POWER_TRANSFORMER_END__RATED_S:
            return isSetRatedS();
        case CimPackage.POWER_TRANSFORMER_END__RATED_U:
            return isSetRatedU();
        case CimPackage.POWER_TRANSFORMER_END__X:
            return isSetX();
        case CimPackage.POWER_TRANSFORMER_END__B:
            return isSetB();
        case CimPackage.POWER_TRANSFORMER_END__R:
            return isSetR();
        case CimPackage.POWER_TRANSFORMER_END__G:
            return isSetG();
        case CimPackage.POWER_TRANSFORMER_END__CONNECTION_KIND:
            return isSetConnectionKind();
        case CimPackage.POWER_TRANSFORMER_END__POWER_TRANSFORMER:
            return isSetPowerTransformer();
        case CimPackage.POWER_TRANSFORMER_END__B0:
            return isSetB0();
        case CimPackage.POWER_TRANSFORMER_END__R0:
            return isSetR0();
        case CimPackage.POWER_TRANSFORMER_END__G0:
            return isSetG0();
        case CimPackage.POWER_TRANSFORMER_END__X0:
            return isSetX0();
        case CimPackage.POWER_TRANSFORMER_END__PHASE_ANGLE_CLOCK:
            return isSetPhaseAngleClock();
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
        result.append( " (ratedS: " );
        if( ratedSESet )
            result.append( ratedS );
        else
            result.append( "<unset>" );
        result.append( ", ratedU: " );
        if( ratedUESet )
            result.append( ratedU );
        else
            result.append( "<unset>" );
        result.append( ", x: " );
        if( xESet )
            result.append( x );
        else
            result.append( "<unset>" );
        result.append( ", b: " );
        if( bESet )
            result.append( b );
        else
            result.append( "<unset>" );
        result.append( ", r: " );
        if( rESet )
            result.append( r );
        else
            result.append( "<unset>" );
        result.append( ", g: " );
        if( gESet )
            result.append( g );
        else
            result.append( "<unset>" );
        result.append( ", connectionKind: " );
        if( connectionKindESet )
            result.append( connectionKind );
        else
            result.append( "<unset>" );
        result.append( ", b0: " );
        if( b0ESet )
            result.append( b0 );
        else
            result.append( "<unset>" );
        result.append( ", r0: " );
        if( r0ESet )
            result.append( r0 );
        else
            result.append( "<unset>" );
        result.append( ", g0: " );
        if( g0ESet )
            result.append( g0 );
        else
            result.append( "<unset>" );
        result.append( ", x0: " );
        if( x0ESet )
            result.append( x0 );
        else
            result.append( "<unset>" );
        result.append( ", phaseAngleClock: " );
        if( phaseAngleClockESet )
            result.append( phaseAngleClock );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //PowerTransformerEndImpl

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

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BaseVoltage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseTapChanger;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RatioTapChanger;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Terminal;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TransformerEnd;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformer End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.TransformerEndImpl#getPhaseTapChanger <em>Phase Tap Changer</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.TransformerEndImpl#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.TransformerEndImpl#getEndNumber <em>End Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.TransformerEndImpl#getBaseVoltage <em>Base Voltage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.TransformerEndImpl#getRatioTapChanger <em>Ratio Tap Changer</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.TransformerEndImpl#getGrounded <em>Grounded</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.TransformerEndImpl#getXground <em>Xground</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.TransformerEndImpl#getRground <em>Rground</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransformerEndImpl extends IdentifiedObjectImpl implements TransformerEnd {
    /**
     * The cached value of the '{@link #getPhaseTapChanger() <em>Phase Tap Changer</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhaseTapChanger()
     * @generated
     * @ordered
     */
    protected PhaseTapChanger phaseTapChanger;

    /**
     * This is true if the Phase Tap Changer reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean phaseTapChangerESet;

    /**
     * The cached value of the '{@link #getTerminal() <em>Terminal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTerminal()
     * @generated
     * @ordered
     */
    protected Terminal terminal;

    /**
     * This is true if the Terminal reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean terminalESet;

    /**
     * The default value of the '{@link #getEndNumber() <em>End Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndNumber()
     * @generated
     * @ordered
     */
    protected static final BigInteger END_NUMBER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEndNumber() <em>End Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndNumber()
     * @generated
     * @ordered
     */
    protected BigInteger endNumber = END_NUMBER_EDEFAULT;

    /**
     * This is true if the End Number attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean endNumberESet;

    /**
     * The cached value of the '{@link #getBaseVoltage() <em>Base Voltage</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBaseVoltage()
     * @generated
     * @ordered
     */
    protected BaseVoltage baseVoltage;

    /**
     * This is true if the Base Voltage reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean baseVoltageESet;

    /**
     * The cached value of the '{@link #getRatioTapChanger() <em>Ratio Tap Changer</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatioTapChanger()
     * @generated
     * @ordered
     */
    protected RatioTapChanger ratioTapChanger;

    /**
     * This is true if the Ratio Tap Changer reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ratioTapChangerESet;

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
     * The default value of the '{@link #getXground() <em>Xground</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXground()
     * @generated
     * @ordered
     */
    protected static final Double XGROUND_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getXground() <em>Xground</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXground()
     * @generated
     * @ordered
     */
    protected Double xground = XGROUND_EDEFAULT;

    /**
     * This is true if the Xground attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xgroundESet;

    /**
     * The default value of the '{@link #getRground() <em>Rground</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRground()
     * @generated
     * @ordered
     */
    protected static final Double RGROUND_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRground() <em>Rground</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRground()
     * @generated
     * @ordered
     */
    protected Double rground = RGROUND_EDEFAULT;

    /**
     * This is true if the Rground attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rgroundESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TransformerEndImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getTransformerEnd();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Terminal getTerminal() {
        return terminal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTerminal( Terminal newTerminal, NotificationChain msgs ) {
        Terminal oldTerminal = terminal;
        terminal = newTerminal;
        boolean oldTerminalESet = terminalESet;
        terminalESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TRANSFORMER_END__TERMINAL, oldTerminal, newTerminal, !oldTerminalESet );
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
    public void setTerminal( Terminal newTerminal ) {
        if( newTerminal != terminal ) {
            NotificationChain msgs = null;
            if( terminal != null )
                msgs = ( ( InternalEObject ) terminal ).eInverseRemove( this, CimPackage.TERMINAL__TRANSFORMER_END,
                        Terminal.class, msgs );
            if( newTerminal != null )
                msgs = ( ( InternalEObject ) newTerminal ).eInverseAdd( this, CimPackage.TERMINAL__TRANSFORMER_END,
                        Terminal.class, msgs );
            msgs = basicSetTerminal( newTerminal, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTerminalESet = terminalESet;
            terminalESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TRANSFORMER_END__TERMINAL,
                        newTerminal, newTerminal, !oldTerminalESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetTerminal( NotificationChain msgs ) {
        Terminal oldTerminal = terminal;
        terminal = null;
        boolean oldTerminalESet = terminalESet;
        terminalESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TRANSFORMER_END__TERMINAL, oldTerminal, null, oldTerminalESet );
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
    public void unsetTerminal() {
        if( terminal != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) terminal ).eInverseRemove( this, CimPackage.TERMINAL__TRANSFORMER_END,
                    Terminal.class, msgs );
            msgs = basicUnsetTerminal( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTerminalESet = terminalESet;
            terminalESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TRANSFORMER_END__TERMINAL, null,
                        null, oldTerminalESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTerminal() {
        return terminalESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BigInteger getEndNumber() {
        return endNumber;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEndNumber( BigInteger newEndNumber ) {
        BigInteger oldEndNumber = endNumber;
        endNumber = newEndNumber;
        boolean oldEndNumberESet = endNumberESet;
        endNumberESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TRANSFORMER_END__END_NUMBER,
                    oldEndNumber, endNumber, !oldEndNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEndNumber() {
        BigInteger oldEndNumber = endNumber;
        boolean oldEndNumberESet = endNumberESet;
        endNumber = END_NUMBER_EDEFAULT;
        endNumberESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TRANSFORMER_END__END_NUMBER,
                    oldEndNumber, END_NUMBER_EDEFAULT, oldEndNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEndNumber() {
        return endNumberESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BaseVoltage getBaseVoltage() {
        return baseVoltage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetBaseVoltage( BaseVoltage newBaseVoltage, NotificationChain msgs ) {
        BaseVoltage oldBaseVoltage = baseVoltage;
        baseVoltage = newBaseVoltage;
        boolean oldBaseVoltageESet = baseVoltageESet;
        baseVoltageESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TRANSFORMER_END__BASE_VOLTAGE, oldBaseVoltage, newBaseVoltage, !oldBaseVoltageESet );
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
    public void setBaseVoltage( BaseVoltage newBaseVoltage ) {
        if( newBaseVoltage != baseVoltage ) {
            NotificationChain msgs = null;
            if( baseVoltage != null )
                msgs = ( ( InternalEObject ) baseVoltage ).eInverseRemove( this,
                        CimPackage.BASE_VOLTAGE__TRANSFORMER_ENDS, BaseVoltage.class, msgs );
            if( newBaseVoltage != null )
                msgs = ( ( InternalEObject ) newBaseVoltage ).eInverseAdd( this,
                        CimPackage.BASE_VOLTAGE__TRANSFORMER_ENDS, BaseVoltage.class, msgs );
            msgs = basicSetBaseVoltage( newBaseVoltage, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldBaseVoltageESet = baseVoltageESet;
            baseVoltageESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TRANSFORMER_END__BASE_VOLTAGE,
                        newBaseVoltage, newBaseVoltage, !oldBaseVoltageESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetBaseVoltage( NotificationChain msgs ) {
        BaseVoltage oldBaseVoltage = baseVoltage;
        baseVoltage = null;
        boolean oldBaseVoltageESet = baseVoltageESet;
        baseVoltageESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TRANSFORMER_END__BASE_VOLTAGE, oldBaseVoltage, null, oldBaseVoltageESet );
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
    public void unsetBaseVoltage() {
        if( baseVoltage != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) baseVoltage ).eInverseRemove( this, CimPackage.BASE_VOLTAGE__TRANSFORMER_ENDS,
                    BaseVoltage.class, msgs );
            msgs = basicUnsetBaseVoltage( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldBaseVoltageESet = baseVoltageESet;
            baseVoltageESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TRANSFORMER_END__BASE_VOLTAGE,
                        null, null, oldBaseVoltageESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBaseVoltage() {
        return baseVoltageESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RatioTapChanger getRatioTapChanger() {
        if( ratioTapChanger != null && ratioTapChanger.eIsProxy() ) {
            InternalEObject oldRatioTapChanger = ( InternalEObject ) ratioTapChanger;
            ratioTapChanger = ( RatioTapChanger ) eResolveProxy( oldRatioTapChanger );
            if( ratioTapChanger != oldRatioTapChanger ) {
                if( eNotificationRequired() )
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                            CimPackage.TRANSFORMER_END__RATIO_TAP_CHANGER, oldRatioTapChanger, ratioTapChanger ) );
            }
        }
        return ratioTapChanger;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RatioTapChanger basicGetRatioTapChanger() {
        return ratioTapChanger;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRatioTapChanger( RatioTapChanger newRatioTapChanger, NotificationChain msgs ) {
        RatioTapChanger oldRatioTapChanger = ratioTapChanger;
        ratioTapChanger = newRatioTapChanger;
        boolean oldRatioTapChangerESet = ratioTapChangerESet;
        ratioTapChangerESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TRANSFORMER_END__RATIO_TAP_CHANGER, oldRatioTapChanger, newRatioTapChanger,
                    !oldRatioTapChangerESet );
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
    public void setRatioTapChanger( RatioTapChanger newRatioTapChanger ) {
        if( newRatioTapChanger != ratioTapChanger ) {
            NotificationChain msgs = null;
            if( ratioTapChanger != null )
                msgs = ( ( InternalEObject ) ratioTapChanger ).eInverseRemove( this,
                        CimPackage.RATIO_TAP_CHANGER__TRANSFORMER_END, RatioTapChanger.class, msgs );
            if( newRatioTapChanger != null )
                msgs = ( ( InternalEObject ) newRatioTapChanger ).eInverseAdd( this,
                        CimPackage.RATIO_TAP_CHANGER__TRANSFORMER_END, RatioTapChanger.class, msgs );
            msgs = basicSetRatioTapChanger( newRatioTapChanger, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRatioTapChangerESet = ratioTapChangerESet;
            ratioTapChangerESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TRANSFORMER_END__RATIO_TAP_CHANGER,
                        newRatioTapChanger, newRatioTapChanger, !oldRatioTapChangerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRatioTapChanger( NotificationChain msgs ) {
        RatioTapChanger oldRatioTapChanger = ratioTapChanger;
        ratioTapChanger = null;
        boolean oldRatioTapChangerESet = ratioTapChangerESet;
        ratioTapChangerESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TRANSFORMER_END__RATIO_TAP_CHANGER, oldRatioTapChanger, null, oldRatioTapChangerESet );
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
    public void unsetRatioTapChanger() {
        if( ratioTapChanger != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) ratioTapChanger ).eInverseRemove( this,
                    CimPackage.RATIO_TAP_CHANGER__TRANSFORMER_END, RatioTapChanger.class, msgs );
            msgs = basicUnsetRatioTapChanger( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRatioTapChangerESet = ratioTapChangerESet;
            ratioTapChangerESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TRANSFORMER_END__RATIO_TAP_CHANGER,
                        null, null, oldRatioTapChangerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRatioTapChanger() {
        return ratioTapChangerESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TRANSFORMER_END__GROUNDED, oldGrounded,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TRANSFORMER_END__GROUNDED, oldGrounded,
                    GROUNDED_EDEFAULT, oldGroundedESet ) );
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
    public Double getXground() {
        return xground;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setXground( Double newXground ) {
        Double oldXground = xground;
        xground = newXground;
        boolean oldXgroundESet = xgroundESet;
        xgroundESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TRANSFORMER_END__XGROUND, oldXground,
                    xground, !oldXgroundESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetXground() {
        Double oldXground = xground;
        boolean oldXgroundESet = xgroundESet;
        xground = XGROUND_EDEFAULT;
        xgroundESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TRANSFORMER_END__XGROUND, oldXground,
                    XGROUND_EDEFAULT, oldXgroundESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetXground() {
        return xgroundESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getRground() {
        return rground;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRground( Double newRground ) {
        Double oldRground = rground;
        rground = newRground;
        boolean oldRgroundESet = rgroundESet;
        rgroundESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TRANSFORMER_END__RGROUND, oldRground,
                    rground, !oldRgroundESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRground() {
        Double oldRground = rground;
        boolean oldRgroundESet = rgroundESet;
        rground = RGROUND_EDEFAULT;
        rgroundESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TRANSFORMER_END__RGROUND, oldRground,
                    RGROUND_EDEFAULT, oldRgroundESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRground() {
        return rgroundESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PhaseTapChanger getPhaseTapChanger() {
        if( phaseTapChanger != null && phaseTapChanger.eIsProxy() ) {
            InternalEObject oldPhaseTapChanger = ( InternalEObject ) phaseTapChanger;
            phaseTapChanger = ( PhaseTapChanger ) eResolveProxy( oldPhaseTapChanger );
            if( phaseTapChanger != oldPhaseTapChanger ) {
                if( eNotificationRequired() )
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                            CimPackage.TRANSFORMER_END__PHASE_TAP_CHANGER, oldPhaseTapChanger, phaseTapChanger ) );
            }
        }
        return phaseTapChanger;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PhaseTapChanger basicGetPhaseTapChanger() {
        return phaseTapChanger;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPhaseTapChanger( PhaseTapChanger newPhaseTapChanger, NotificationChain msgs ) {
        PhaseTapChanger oldPhaseTapChanger = phaseTapChanger;
        phaseTapChanger = newPhaseTapChanger;
        boolean oldPhaseTapChangerESet = phaseTapChangerESet;
        phaseTapChangerESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TRANSFORMER_END__PHASE_TAP_CHANGER, oldPhaseTapChanger, newPhaseTapChanger,
                    !oldPhaseTapChangerESet );
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
    public void setPhaseTapChanger( PhaseTapChanger newPhaseTapChanger ) {
        if( newPhaseTapChanger != phaseTapChanger ) {
            NotificationChain msgs = null;
            if( phaseTapChanger != null )
                msgs = ( ( InternalEObject ) phaseTapChanger ).eInverseRemove( this,
                        CimPackage.PHASE_TAP_CHANGER__TRANSFORMER_END, PhaseTapChanger.class, msgs );
            if( newPhaseTapChanger != null )
                msgs = ( ( InternalEObject ) newPhaseTapChanger ).eInverseAdd( this,
                        CimPackage.PHASE_TAP_CHANGER__TRANSFORMER_END, PhaseTapChanger.class, msgs );
            msgs = basicSetPhaseTapChanger( newPhaseTapChanger, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPhaseTapChangerESet = phaseTapChangerESet;
            phaseTapChangerESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TRANSFORMER_END__PHASE_TAP_CHANGER,
                        newPhaseTapChanger, newPhaseTapChanger, !oldPhaseTapChangerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetPhaseTapChanger( NotificationChain msgs ) {
        PhaseTapChanger oldPhaseTapChanger = phaseTapChanger;
        phaseTapChanger = null;
        boolean oldPhaseTapChangerESet = phaseTapChangerESet;
        phaseTapChangerESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TRANSFORMER_END__PHASE_TAP_CHANGER, oldPhaseTapChanger, null, oldPhaseTapChangerESet );
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
    public void unsetPhaseTapChanger() {
        if( phaseTapChanger != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) phaseTapChanger ).eInverseRemove( this,
                    CimPackage.PHASE_TAP_CHANGER__TRANSFORMER_END, PhaseTapChanger.class, msgs );
            msgs = basicUnsetPhaseTapChanger( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPhaseTapChangerESet = phaseTapChangerESet;
            phaseTapChangerESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TRANSFORMER_END__PHASE_TAP_CHANGER,
                        null, null, oldPhaseTapChangerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPhaseTapChanger() {
        return phaseTapChangerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.TRANSFORMER_END__PHASE_TAP_CHANGER:
            if( phaseTapChanger != null )
                msgs = ( ( InternalEObject ) phaseTapChanger ).eInverseRemove( this,
                        CimPackage.PHASE_TAP_CHANGER__TRANSFORMER_END, PhaseTapChanger.class, msgs );
            return basicSetPhaseTapChanger( ( PhaseTapChanger ) otherEnd, msgs );
        case CimPackage.TRANSFORMER_END__TERMINAL:
            if( terminal != null )
                msgs = ( ( InternalEObject ) terminal ).eInverseRemove( this, CimPackage.TERMINAL__TRANSFORMER_END,
                        Terminal.class, msgs );
            return basicSetTerminal( ( Terminal ) otherEnd, msgs );
        case CimPackage.TRANSFORMER_END__BASE_VOLTAGE:
            if( baseVoltage != null )
                msgs = ( ( InternalEObject ) baseVoltage ).eInverseRemove( this,
                        CimPackage.BASE_VOLTAGE__TRANSFORMER_ENDS, BaseVoltage.class, msgs );
            return basicSetBaseVoltage( ( BaseVoltage ) otherEnd, msgs );
        case CimPackage.TRANSFORMER_END__RATIO_TAP_CHANGER:
            if( ratioTapChanger != null )
                msgs = ( ( InternalEObject ) ratioTapChanger ).eInverseRemove( this,
                        CimPackage.RATIO_TAP_CHANGER__TRANSFORMER_END, RatioTapChanger.class, msgs );
            return basicSetRatioTapChanger( ( RatioTapChanger ) otherEnd, msgs );
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
        case CimPackage.TRANSFORMER_END__PHASE_TAP_CHANGER:
            return basicUnsetPhaseTapChanger( msgs );
        case CimPackage.TRANSFORMER_END__TERMINAL:
            return basicUnsetTerminal( msgs );
        case CimPackage.TRANSFORMER_END__BASE_VOLTAGE:
            return basicUnsetBaseVoltage( msgs );
        case CimPackage.TRANSFORMER_END__RATIO_TAP_CHANGER:
            return basicUnsetRatioTapChanger( msgs );
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
        case CimPackage.TRANSFORMER_END__PHASE_TAP_CHANGER:
            if( resolve ) return getPhaseTapChanger();
            return basicGetPhaseTapChanger();
        case CimPackage.TRANSFORMER_END__TERMINAL:
            return getTerminal();
        case CimPackage.TRANSFORMER_END__END_NUMBER:
            return getEndNumber();
        case CimPackage.TRANSFORMER_END__BASE_VOLTAGE:
            return getBaseVoltage();
        case CimPackage.TRANSFORMER_END__RATIO_TAP_CHANGER:
            if( resolve ) return getRatioTapChanger();
            return basicGetRatioTapChanger();
        case CimPackage.TRANSFORMER_END__GROUNDED:
            return getGrounded();
        case CimPackage.TRANSFORMER_END__XGROUND:
            return getXground();
        case CimPackage.TRANSFORMER_END__RGROUND:
            return getRground();
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
        case CimPackage.TRANSFORMER_END__PHASE_TAP_CHANGER:
            setPhaseTapChanger( ( PhaseTapChanger ) newValue );
            return;
        case CimPackage.TRANSFORMER_END__TERMINAL:
            setTerminal( ( Terminal ) newValue );
            return;
        case CimPackage.TRANSFORMER_END__END_NUMBER:
            setEndNumber( ( BigInteger ) newValue );
            return;
        case CimPackage.TRANSFORMER_END__BASE_VOLTAGE:
            setBaseVoltage( ( BaseVoltage ) newValue );
            return;
        case CimPackage.TRANSFORMER_END__RATIO_TAP_CHANGER:
            setRatioTapChanger( ( RatioTapChanger ) newValue );
            return;
        case CimPackage.TRANSFORMER_END__GROUNDED:
            setGrounded( ( Boolean ) newValue );
            return;
        case CimPackage.TRANSFORMER_END__XGROUND:
            setXground( ( Double ) newValue );
            return;
        case CimPackage.TRANSFORMER_END__RGROUND:
            setRground( ( Double ) newValue );
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
        case CimPackage.TRANSFORMER_END__PHASE_TAP_CHANGER:
            unsetPhaseTapChanger();
            return;
        case CimPackage.TRANSFORMER_END__TERMINAL:
            unsetTerminal();
            return;
        case CimPackage.TRANSFORMER_END__END_NUMBER:
            unsetEndNumber();
            return;
        case CimPackage.TRANSFORMER_END__BASE_VOLTAGE:
            unsetBaseVoltage();
            return;
        case CimPackage.TRANSFORMER_END__RATIO_TAP_CHANGER:
            unsetRatioTapChanger();
            return;
        case CimPackage.TRANSFORMER_END__GROUNDED:
            unsetGrounded();
            return;
        case CimPackage.TRANSFORMER_END__XGROUND:
            unsetXground();
            return;
        case CimPackage.TRANSFORMER_END__RGROUND:
            unsetRground();
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
        case CimPackage.TRANSFORMER_END__PHASE_TAP_CHANGER:
            return isSetPhaseTapChanger();
        case CimPackage.TRANSFORMER_END__TERMINAL:
            return isSetTerminal();
        case CimPackage.TRANSFORMER_END__END_NUMBER:
            return isSetEndNumber();
        case CimPackage.TRANSFORMER_END__BASE_VOLTAGE:
            return isSetBaseVoltage();
        case CimPackage.TRANSFORMER_END__RATIO_TAP_CHANGER:
            return isSetRatioTapChanger();
        case CimPackage.TRANSFORMER_END__GROUNDED:
            return isSetGrounded();
        case CimPackage.TRANSFORMER_END__XGROUND:
            return isSetXground();
        case CimPackage.TRANSFORMER_END__RGROUND:
            return isSetRground();
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
        result.append( " (endNumber: " );
        if( endNumberESet )
            result.append( endNumber );
        else
            result.append( "<unset>" );
        result.append( ", grounded: " );
        if( groundedESet )
            result.append( grounded );
        else
            result.append( "<unset>" );
        result.append( ", xground: " );
        if( xgroundESet )
            result.append( xground );
        else
            result.append( "<unset>" );
        result.append( ", rground: " );
        if( rgroundESet )
            result.append( rground );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //TransformerEndImpl

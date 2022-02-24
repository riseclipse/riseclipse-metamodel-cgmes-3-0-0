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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ControlArea;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Terminal;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TieFlow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tie Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.TieFlowImpl#getPositiveFlowIn <em>Positive Flow In</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.TieFlowImpl#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.TieFlowImpl#getControlArea <em>Control Area</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TieFlowImpl extends IdentifiedObjectImpl implements TieFlow {
    /**
     * The default value of the '{@link #getPositiveFlowIn() <em>Positive Flow In</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPositiveFlowIn()
     * @generated
     * @ordered
     */
    protected static final Boolean POSITIVE_FLOW_IN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPositiveFlowIn() <em>Positive Flow In</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPositiveFlowIn()
     * @generated
     * @ordered
     */
    protected Boolean positiveFlowIn = POSITIVE_FLOW_IN_EDEFAULT;

    /**
     * This is true if the Positive Flow In attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean positiveFlowInESet;

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
     * The cached value of the '{@link #getControlArea() <em>Control Area</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getControlArea()
     * @generated
     * @ordered
     */
    protected ControlArea controlArea;

    /**
     * This is true if the Control Area reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean controlAreaESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TieFlowImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getTieFlow();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ControlArea getControlArea() {
        return controlArea;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetControlArea( ControlArea newControlArea, NotificationChain msgs ) {
        ControlArea oldControlArea = controlArea;
        controlArea = newControlArea;
        boolean oldControlAreaESet = controlAreaESet;
        controlAreaESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TIE_FLOW__CONTROL_AREA, oldControlArea, newControlArea, !oldControlAreaESet );
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
    public void setControlArea( ControlArea newControlArea ) {
        if( newControlArea != controlArea ) {
            NotificationChain msgs = null;
            if( controlArea != null )
                msgs = ( ( InternalEObject ) controlArea ).eInverseRemove( this, CimPackage.CONTROL_AREA__TIE_FLOW,
                        ControlArea.class, msgs );
            if( newControlArea != null )
                msgs = ( ( InternalEObject ) newControlArea ).eInverseAdd( this, CimPackage.CONTROL_AREA__TIE_FLOW,
                        ControlArea.class, msgs );
            msgs = basicSetControlArea( newControlArea, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldControlAreaESet = controlAreaESet;
            controlAreaESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TIE_FLOW__CONTROL_AREA,
                        newControlArea, newControlArea, !oldControlAreaESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetControlArea( NotificationChain msgs ) {
        ControlArea oldControlArea = controlArea;
        controlArea = null;
        boolean oldControlAreaESet = controlAreaESet;
        controlAreaESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TIE_FLOW__CONTROL_AREA, oldControlArea, null, oldControlAreaESet );
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
    public void unsetControlArea() {
        if( controlArea != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) controlArea ).eInverseRemove( this, CimPackage.CONTROL_AREA__TIE_FLOW,
                    ControlArea.class, msgs );
            msgs = basicUnsetControlArea( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldControlAreaESet = controlAreaESet;
            controlAreaESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TIE_FLOW__CONTROL_AREA, null, null,
                        oldControlAreaESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetControlArea() {
        return controlAreaESet;
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
                    CimPackage.TIE_FLOW__TERMINAL, oldTerminal, newTerminal, !oldTerminalESet );
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
                msgs = ( ( InternalEObject ) terminal ).eInverseRemove( this, CimPackage.TERMINAL__TIE_FLOW,
                        Terminal.class, msgs );
            if( newTerminal != null )
                msgs = ( ( InternalEObject ) newTerminal ).eInverseAdd( this, CimPackage.TERMINAL__TIE_FLOW,
                        Terminal.class, msgs );
            msgs = basicSetTerminal( newTerminal, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTerminalESet = terminalESet;
            terminalESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TIE_FLOW__TERMINAL, newTerminal,
                        newTerminal, !oldTerminalESet ) );
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
                    CimPackage.TIE_FLOW__TERMINAL, oldTerminal, null, oldTerminalESet );
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
            msgs = ( ( InternalEObject ) terminal ).eInverseRemove( this, CimPackage.TERMINAL__TIE_FLOW, Terminal.class,
                    msgs );
            msgs = basicUnsetTerminal( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTerminalESet = terminalESet;
            terminalESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TIE_FLOW__TERMINAL, null, null,
                        oldTerminalESet ) );
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
    public Boolean getPositiveFlowIn() {
        return positiveFlowIn;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPositiveFlowIn( Boolean newPositiveFlowIn ) {
        Boolean oldPositiveFlowIn = positiveFlowIn;
        positiveFlowIn = newPositiveFlowIn;
        boolean oldPositiveFlowInESet = positiveFlowInESet;
        positiveFlowInESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TIE_FLOW__POSITIVE_FLOW_IN,
                    oldPositiveFlowIn, positiveFlowIn, !oldPositiveFlowInESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPositiveFlowIn() {
        Boolean oldPositiveFlowIn = positiveFlowIn;
        boolean oldPositiveFlowInESet = positiveFlowInESet;
        positiveFlowIn = POSITIVE_FLOW_IN_EDEFAULT;
        positiveFlowInESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TIE_FLOW__POSITIVE_FLOW_IN,
                    oldPositiveFlowIn, POSITIVE_FLOW_IN_EDEFAULT, oldPositiveFlowInESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPositiveFlowIn() {
        return positiveFlowInESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.TIE_FLOW__TERMINAL:
            if( terminal != null )
                msgs = ( ( InternalEObject ) terminal ).eInverseRemove( this, CimPackage.TERMINAL__TIE_FLOW,
                        Terminal.class, msgs );
            return basicSetTerminal( ( Terminal ) otherEnd, msgs );
        case CimPackage.TIE_FLOW__CONTROL_AREA:
            if( controlArea != null )
                msgs = ( ( InternalEObject ) controlArea ).eInverseRemove( this, CimPackage.CONTROL_AREA__TIE_FLOW,
                        ControlArea.class, msgs );
            return basicSetControlArea( ( ControlArea ) otherEnd, msgs );
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
        case CimPackage.TIE_FLOW__TERMINAL:
            return basicUnsetTerminal( msgs );
        case CimPackage.TIE_FLOW__CONTROL_AREA:
            return basicUnsetControlArea( msgs );
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
        case CimPackage.TIE_FLOW__POSITIVE_FLOW_IN:
            return getPositiveFlowIn();
        case CimPackage.TIE_FLOW__TERMINAL:
            return getTerminal();
        case CimPackage.TIE_FLOW__CONTROL_AREA:
            return getControlArea();
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
        case CimPackage.TIE_FLOW__POSITIVE_FLOW_IN:
            setPositiveFlowIn( ( Boolean ) newValue );
            return;
        case CimPackage.TIE_FLOW__TERMINAL:
            setTerminal( ( Terminal ) newValue );
            return;
        case CimPackage.TIE_FLOW__CONTROL_AREA:
            setControlArea( ( ControlArea ) newValue );
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
        case CimPackage.TIE_FLOW__POSITIVE_FLOW_IN:
            unsetPositiveFlowIn();
            return;
        case CimPackage.TIE_FLOW__TERMINAL:
            unsetTerminal();
            return;
        case CimPackage.TIE_FLOW__CONTROL_AREA:
            unsetControlArea();
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
        case CimPackage.TIE_FLOW__POSITIVE_FLOW_IN:
            return isSetPositiveFlowIn();
        case CimPackage.TIE_FLOW__TERMINAL:
            return isSetTerminal();
        case CimPackage.TIE_FLOW__CONTROL_AREA:
            return isSetControlArea();
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
        result.append( " (positiveFlowIn: " );
        if( positiveFlowInESet )
            result.append( positiveFlowIn );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //TieFlowImpl

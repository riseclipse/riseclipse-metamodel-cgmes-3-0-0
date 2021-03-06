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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Command;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Discrete;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscreteValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discrete Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.DiscreteValueImpl#getDiscrete <em>Discrete</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.DiscreteValueImpl#getCommand <em>Command</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DiscreteValueImpl extends MeasurementValueImpl implements DiscreteValue {
    /**
     * The cached value of the '{@link #getDiscrete() <em>Discrete</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDiscrete()
     * @generated
     * @ordered
     */
    protected Discrete discrete;

    /**
     * This is true if the Discrete reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean discreteESet;

    /**
     * The cached value of the '{@link #getCommand() <em>Command</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCommand()
     * @generated
     * @ordered
     */
    protected Command command;

    /**
     * This is true if the Command reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean commandESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected DiscreteValueImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getDiscreteValue();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Discrete getDiscrete() {
        return discrete;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDiscrete( Discrete newDiscrete, NotificationChain msgs ) {
        Discrete oldDiscrete = discrete;
        discrete = newDiscrete;
        boolean oldDiscreteESet = discreteESet;
        discreteESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.DISCRETE_VALUE__DISCRETE, oldDiscrete, newDiscrete, !oldDiscreteESet );
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
    public void setDiscrete( Discrete newDiscrete ) {
        if( newDiscrete != discrete ) {
            NotificationChain msgs = null;
            if( discrete != null )
                msgs = ( ( InternalEObject ) discrete ).eInverseRemove( this, CimPackage.DISCRETE__DISCRETE_VALUES,
                        Discrete.class, msgs );
            if( newDiscrete != null )
                msgs = ( ( InternalEObject ) newDiscrete ).eInverseAdd( this, CimPackage.DISCRETE__DISCRETE_VALUES,
                        Discrete.class, msgs );
            msgs = basicSetDiscrete( newDiscrete, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldDiscreteESet = discreteESet;
            discreteESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.DISCRETE_VALUE__DISCRETE,
                        newDiscrete, newDiscrete, !oldDiscreteESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetDiscrete( NotificationChain msgs ) {
        Discrete oldDiscrete = discrete;
        discrete = null;
        boolean oldDiscreteESet = discreteESet;
        discreteESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.DISCRETE_VALUE__DISCRETE, oldDiscrete, null, oldDiscreteESet );
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
    public void unsetDiscrete() {
        if( discrete != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) discrete ).eInverseRemove( this, CimPackage.DISCRETE__DISCRETE_VALUES,
                    Discrete.class, msgs );
            msgs = basicUnsetDiscrete( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldDiscreteESet = discreteESet;
            discreteESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.DISCRETE_VALUE__DISCRETE, null,
                        null, oldDiscreteESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDiscrete() {
        return discreteESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Command getCommand() {
        if( command != null && command.eIsProxy() ) {
            InternalEObject oldCommand = ( InternalEObject ) command;
            command = ( Command ) eResolveProxy( oldCommand );
            if( command != oldCommand ) {
                if( eNotificationRequired() )
                    eNotify( new ENotificationImpl( this, Notification.RESOLVE, CimPackage.DISCRETE_VALUE__COMMAND,
                            oldCommand, command ) );
            }
        }
        return command;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Command basicGetCommand() {
        return command;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCommand( Command newCommand, NotificationChain msgs ) {
        Command oldCommand = command;
        command = newCommand;
        boolean oldCommandESet = commandESet;
        commandESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.DISCRETE_VALUE__COMMAND, oldCommand, newCommand, !oldCommandESet );
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
    public void setCommand( Command newCommand ) {
        if( newCommand != command ) {
            NotificationChain msgs = null;
            if( command != null )
                msgs = ( ( InternalEObject ) command ).eInverseRemove( this, CimPackage.COMMAND__DISCRETE_VALUE,
                        Command.class, msgs );
            if( newCommand != null )
                msgs = ( ( InternalEObject ) newCommand ).eInverseAdd( this, CimPackage.COMMAND__DISCRETE_VALUE,
                        Command.class, msgs );
            msgs = basicSetCommand( newCommand, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCommandESet = commandESet;
            commandESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.DISCRETE_VALUE__COMMAND, newCommand,
                        newCommand, !oldCommandESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetCommand( NotificationChain msgs ) {
        Command oldCommand = command;
        command = null;
        boolean oldCommandESet = commandESet;
        commandESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.DISCRETE_VALUE__COMMAND, oldCommand, null, oldCommandESet );
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
    public void unsetCommand() {
        if( command != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) command ).eInverseRemove( this, CimPackage.COMMAND__DISCRETE_VALUE,
                    Command.class, msgs );
            msgs = basicUnsetCommand( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCommandESet = commandESet;
            commandESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.DISCRETE_VALUE__COMMAND, null,
                        null, oldCommandESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCommand() {
        return commandESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.DISCRETE_VALUE__DISCRETE:
            if( discrete != null )
                msgs = ( ( InternalEObject ) discrete ).eInverseRemove( this, CimPackage.DISCRETE__DISCRETE_VALUES,
                        Discrete.class, msgs );
            return basicSetDiscrete( ( Discrete ) otherEnd, msgs );
        case CimPackage.DISCRETE_VALUE__COMMAND:
            if( command != null )
                msgs = ( ( InternalEObject ) command ).eInverseRemove( this, CimPackage.COMMAND__DISCRETE_VALUE,
                        Command.class, msgs );
            return basicSetCommand( ( Command ) otherEnd, msgs );
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
        case CimPackage.DISCRETE_VALUE__DISCRETE:
            return basicUnsetDiscrete( msgs );
        case CimPackage.DISCRETE_VALUE__COMMAND:
            return basicUnsetCommand( msgs );
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
        case CimPackage.DISCRETE_VALUE__DISCRETE:
            return getDiscrete();
        case CimPackage.DISCRETE_VALUE__COMMAND:
            if( resolve ) return getCommand();
            return basicGetCommand();
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
        case CimPackage.DISCRETE_VALUE__DISCRETE:
            setDiscrete( ( Discrete ) newValue );
            return;
        case CimPackage.DISCRETE_VALUE__COMMAND:
            setCommand( ( Command ) newValue );
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
        case CimPackage.DISCRETE_VALUE__DISCRETE:
            unsetDiscrete();
            return;
        case CimPackage.DISCRETE_VALUE__COMMAND:
            unsetCommand();
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
        case CimPackage.DISCRETE_VALUE__DISCRETE:
            return isSetDiscrete();
        case CimPackage.DISCRETE_VALUE__COMMAND:
            return isSetCommand();
        }
        return super.eIsSet( featureID );
    }

} //DiscreteValueImpl

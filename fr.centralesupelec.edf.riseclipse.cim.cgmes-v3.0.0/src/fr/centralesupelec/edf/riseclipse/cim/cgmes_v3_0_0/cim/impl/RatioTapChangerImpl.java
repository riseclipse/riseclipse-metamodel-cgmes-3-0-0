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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RatioTapChanger;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RatioTapChangerTable;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TransformerEnd;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ratio Tap Changer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.RatioTapChangerImpl#getTransformerEnd <em>Transformer End</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.RatioTapChangerImpl#getStepVoltageIncrement <em>Step Voltage Increment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.RatioTapChangerImpl#getRatioTapChangerTable <em>Ratio Tap Changer Table</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RatioTapChangerImpl extends TapChangerImpl implements RatioTapChanger {
    /**
     * The cached value of the '{@link #getTransformerEnd() <em>Transformer End</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTransformerEnd()
     * @generated
     * @ordered
     */
    protected TransformerEnd transformerEnd;

    /**
     * This is true if the Transformer End reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean transformerEndESet;

    /**
     * The default value of the '{@link #getStepVoltageIncrement() <em>Step Voltage Increment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStepVoltageIncrement()
     * @generated
     * @ordered
     */
    protected static final Double STEP_VOLTAGE_INCREMENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStepVoltageIncrement() <em>Step Voltage Increment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStepVoltageIncrement()
     * @generated
     * @ordered
     */
    protected Double stepVoltageIncrement = STEP_VOLTAGE_INCREMENT_EDEFAULT;

    /**
     * This is true if the Step Voltage Increment attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean stepVoltageIncrementESet;

    /**
     * The cached value of the '{@link #getRatioTapChangerTable() <em>Ratio Tap Changer Table</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatioTapChangerTable()
     * @generated
     * @ordered
     */
    protected RatioTapChangerTable ratioTapChangerTable;

    /**
     * This is true if the Ratio Tap Changer Table reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ratioTapChangerTableESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RatioTapChangerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getRatioTapChanger();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getStepVoltageIncrement() {
        return stepVoltageIncrement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setStepVoltageIncrement( Double newStepVoltageIncrement ) {
        Double oldStepVoltageIncrement = stepVoltageIncrement;
        stepVoltageIncrement = newStepVoltageIncrement;
        boolean oldStepVoltageIncrementESet = stepVoltageIncrementESet;
        stepVoltageIncrementESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.RATIO_TAP_CHANGER__STEP_VOLTAGE_INCREMENT, oldStepVoltageIncrement, stepVoltageIncrement,
                    !oldStepVoltageIncrementESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetStepVoltageIncrement() {
        Double oldStepVoltageIncrement = stepVoltageIncrement;
        boolean oldStepVoltageIncrementESet = stepVoltageIncrementESet;
        stepVoltageIncrement = STEP_VOLTAGE_INCREMENT_EDEFAULT;
        stepVoltageIncrementESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.RATIO_TAP_CHANGER__STEP_VOLTAGE_INCREMENT, oldStepVoltageIncrement,
                    STEP_VOLTAGE_INCREMENT_EDEFAULT, oldStepVoltageIncrementESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetStepVoltageIncrement() {
        return stepVoltageIncrementESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TransformerEnd getTransformerEnd() {
        return transformerEnd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTransformerEnd( TransformerEnd newTransformerEnd, NotificationChain msgs ) {
        TransformerEnd oldTransformerEnd = transformerEnd;
        transformerEnd = newTransformerEnd;
        boolean oldTransformerEndESet = transformerEndESet;
        transformerEndESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.RATIO_TAP_CHANGER__TRANSFORMER_END, oldTransformerEnd, newTransformerEnd,
                    !oldTransformerEndESet );
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
    public void setTransformerEnd( TransformerEnd newTransformerEnd ) {
        if( newTransformerEnd != transformerEnd ) {
            NotificationChain msgs = null;
            if( transformerEnd != null )
                msgs = ( ( InternalEObject ) transformerEnd ).eInverseRemove( this,
                        CimPackage.TRANSFORMER_END__RATIO_TAP_CHANGER, TransformerEnd.class, msgs );
            if( newTransformerEnd != null )
                msgs = ( ( InternalEObject ) newTransformerEnd ).eInverseAdd( this,
                        CimPackage.TRANSFORMER_END__RATIO_TAP_CHANGER, TransformerEnd.class, msgs );
            msgs = basicSetTransformerEnd( newTransformerEnd, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTransformerEndESet = transformerEndESet;
            transformerEndESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.RATIO_TAP_CHANGER__TRANSFORMER_END,
                        newTransformerEnd, newTransformerEnd, !oldTransformerEndESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetTransformerEnd( NotificationChain msgs ) {
        TransformerEnd oldTransformerEnd = transformerEnd;
        transformerEnd = null;
        boolean oldTransformerEndESet = transformerEndESet;
        transformerEndESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.RATIO_TAP_CHANGER__TRANSFORMER_END, oldTransformerEnd, null, oldTransformerEndESet );
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
    public void unsetTransformerEnd() {
        if( transformerEnd != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) transformerEnd ).eInverseRemove( this,
                    CimPackage.TRANSFORMER_END__RATIO_TAP_CHANGER, TransformerEnd.class, msgs );
            msgs = basicUnsetTransformerEnd( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTransformerEndESet = transformerEndESet;
            transformerEndESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.RATIO_TAP_CHANGER__TRANSFORMER_END,
                        null, null, oldTransformerEndESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTransformerEnd() {
        return transformerEndESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public RatioTapChangerTable getRatioTapChangerTable() {
        return ratioTapChangerTable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRatioTapChangerTable( RatioTapChangerTable newRatioTapChangerTable,
            NotificationChain msgs ) {
        RatioTapChangerTable oldRatioTapChangerTable = ratioTapChangerTable;
        ratioTapChangerTable = newRatioTapChangerTable;
        boolean oldRatioTapChangerTableESet = ratioTapChangerTableESet;
        ratioTapChangerTableESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.RATIO_TAP_CHANGER__RATIO_TAP_CHANGER_TABLE, oldRatioTapChangerTable,
                    newRatioTapChangerTable, !oldRatioTapChangerTableESet );
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
    public void setRatioTapChangerTable( RatioTapChangerTable newRatioTapChangerTable ) {
        if( newRatioTapChangerTable != ratioTapChangerTable ) {
            NotificationChain msgs = null;
            if( ratioTapChangerTable != null )
                msgs = ( ( InternalEObject ) ratioTapChangerTable ).eInverseRemove( this,
                        CimPackage.RATIO_TAP_CHANGER_TABLE__RATIO_TAP_CHANGER, RatioTapChangerTable.class, msgs );
            if( newRatioTapChangerTable != null )
                msgs = ( ( InternalEObject ) newRatioTapChangerTable ).eInverseAdd( this,
                        CimPackage.RATIO_TAP_CHANGER_TABLE__RATIO_TAP_CHANGER, RatioTapChangerTable.class, msgs );
            msgs = basicSetRatioTapChangerTable( newRatioTapChangerTable, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRatioTapChangerTableESet = ratioTapChangerTableESet;
            ratioTapChangerTableESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        CimPackage.RATIO_TAP_CHANGER__RATIO_TAP_CHANGER_TABLE, newRatioTapChangerTable,
                        newRatioTapChangerTable, !oldRatioTapChangerTableESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetRatioTapChangerTable( NotificationChain msgs ) {
        RatioTapChangerTable oldRatioTapChangerTable = ratioTapChangerTable;
        ratioTapChangerTable = null;
        boolean oldRatioTapChangerTableESet = ratioTapChangerTableESet;
        ratioTapChangerTableESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.RATIO_TAP_CHANGER__RATIO_TAP_CHANGER_TABLE, oldRatioTapChangerTable, null,
                    oldRatioTapChangerTableESet );
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
    public void unsetRatioTapChangerTable() {
        if( ratioTapChangerTable != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) ratioTapChangerTable ).eInverseRemove( this,
                    CimPackage.RATIO_TAP_CHANGER_TABLE__RATIO_TAP_CHANGER, RatioTapChangerTable.class, msgs );
            msgs = basicUnsetRatioTapChangerTable( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldRatioTapChangerTableESet = ratioTapChangerTableESet;
            ratioTapChangerTableESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.RATIO_TAP_CHANGER__RATIO_TAP_CHANGER_TABLE, null, null,
                        oldRatioTapChangerTableESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRatioTapChangerTable() {
        return ratioTapChangerTableESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.RATIO_TAP_CHANGER__TRANSFORMER_END:
            if( transformerEnd != null )
                msgs = ( ( InternalEObject ) transformerEnd ).eInverseRemove( this,
                        CimPackage.TRANSFORMER_END__RATIO_TAP_CHANGER, TransformerEnd.class, msgs );
            return basicSetTransformerEnd( ( TransformerEnd ) otherEnd, msgs );
        case CimPackage.RATIO_TAP_CHANGER__RATIO_TAP_CHANGER_TABLE:
            if( ratioTapChangerTable != null )
                msgs = ( ( InternalEObject ) ratioTapChangerTable ).eInverseRemove( this,
                        CimPackage.RATIO_TAP_CHANGER_TABLE__RATIO_TAP_CHANGER, RatioTapChangerTable.class, msgs );
            return basicSetRatioTapChangerTable( ( RatioTapChangerTable ) otherEnd, msgs );
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
        case CimPackage.RATIO_TAP_CHANGER__TRANSFORMER_END:
            return basicUnsetTransformerEnd( msgs );
        case CimPackage.RATIO_TAP_CHANGER__RATIO_TAP_CHANGER_TABLE:
            return basicUnsetRatioTapChangerTable( msgs );
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
        case CimPackage.RATIO_TAP_CHANGER__TRANSFORMER_END:
            return getTransformerEnd();
        case CimPackage.RATIO_TAP_CHANGER__STEP_VOLTAGE_INCREMENT:
            return getStepVoltageIncrement();
        case CimPackage.RATIO_TAP_CHANGER__RATIO_TAP_CHANGER_TABLE:
            return getRatioTapChangerTable();
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
        case CimPackage.RATIO_TAP_CHANGER__TRANSFORMER_END:
            setTransformerEnd( ( TransformerEnd ) newValue );
            return;
        case CimPackage.RATIO_TAP_CHANGER__STEP_VOLTAGE_INCREMENT:
            setStepVoltageIncrement( ( Double ) newValue );
            return;
        case CimPackage.RATIO_TAP_CHANGER__RATIO_TAP_CHANGER_TABLE:
            setRatioTapChangerTable( ( RatioTapChangerTable ) newValue );
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
        case CimPackage.RATIO_TAP_CHANGER__TRANSFORMER_END:
            unsetTransformerEnd();
            return;
        case CimPackage.RATIO_TAP_CHANGER__STEP_VOLTAGE_INCREMENT:
            unsetStepVoltageIncrement();
            return;
        case CimPackage.RATIO_TAP_CHANGER__RATIO_TAP_CHANGER_TABLE:
            unsetRatioTapChangerTable();
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
        case CimPackage.RATIO_TAP_CHANGER__TRANSFORMER_END:
            return isSetTransformerEnd();
        case CimPackage.RATIO_TAP_CHANGER__STEP_VOLTAGE_INCREMENT:
            return isSetStepVoltageIncrement();
        case CimPackage.RATIO_TAP_CHANGER__RATIO_TAP_CHANGER_TABLE:
            return isSetRatioTapChangerTable();
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
        result.append( " (stepVoltageIncrement: " );
        if( stepVoltageIncrementESet )
            result.append( stepVoltageIncrement );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //RatioTapChangerImpl

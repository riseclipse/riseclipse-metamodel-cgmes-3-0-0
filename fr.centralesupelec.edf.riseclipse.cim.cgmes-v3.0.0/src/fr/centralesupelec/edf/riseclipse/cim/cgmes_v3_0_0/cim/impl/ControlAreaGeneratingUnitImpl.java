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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ControlAreaGeneratingUnit;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Control Area Generating Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ControlAreaGeneratingUnitImpl#getGeneratingUnit <em>Generating Unit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.ControlAreaGeneratingUnitImpl#getControlArea <em>Control Area</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControlAreaGeneratingUnitImpl extends IdentifiedObjectImpl implements ControlAreaGeneratingUnit {
    /**
     * The cached value of the '{@link #getGeneratingUnit() <em>Generating Unit</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGeneratingUnit()
     * @generated
     * @ordered
     */
    protected GeneratingUnit generatingUnit;

    /**
     * This is true if the Generating Unit reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean generatingUnitESet;

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
    protected ControlAreaGeneratingUnitImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getControlAreaGeneratingUnit();
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
                    CimPackage.CONTROL_AREA_GENERATING_UNIT__CONTROL_AREA, oldControlArea, newControlArea,
                    !oldControlAreaESet );
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
                msgs = ( ( InternalEObject ) controlArea ).eInverseRemove( this,
                        CimPackage.CONTROL_AREA__CONTROL_AREA_GENERATING_UNIT, ControlArea.class, msgs );
            if( newControlArea != null )
                msgs = ( ( InternalEObject ) newControlArea ).eInverseAdd( this,
                        CimPackage.CONTROL_AREA__CONTROL_AREA_GENERATING_UNIT, ControlArea.class, msgs );
            msgs = basicSetControlArea( newControlArea, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldControlAreaESet = controlAreaESet;
            controlAreaESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        CimPackage.CONTROL_AREA_GENERATING_UNIT__CONTROL_AREA, newControlArea, newControlArea,
                        !oldControlAreaESet ) );
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
                    CimPackage.CONTROL_AREA_GENERATING_UNIT__CONTROL_AREA, oldControlArea, null, oldControlAreaESet );
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
            msgs = ( ( InternalEObject ) controlArea ).eInverseRemove( this,
                    CimPackage.CONTROL_AREA__CONTROL_AREA_GENERATING_UNIT, ControlArea.class, msgs );
            msgs = basicUnsetControlArea( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldControlAreaESet = controlAreaESet;
            controlAreaESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.CONTROL_AREA_GENERATING_UNIT__CONTROL_AREA, null, null, oldControlAreaESet ) );
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
    public GeneratingUnit getGeneratingUnit() {
        return generatingUnit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetGeneratingUnit( GeneratingUnit newGeneratingUnit, NotificationChain msgs ) {
        GeneratingUnit oldGeneratingUnit = generatingUnit;
        generatingUnit = newGeneratingUnit;
        boolean oldGeneratingUnitESet = generatingUnitESet;
        generatingUnitESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.CONTROL_AREA_GENERATING_UNIT__GENERATING_UNIT, oldGeneratingUnit, newGeneratingUnit,
                    !oldGeneratingUnitESet );
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
    public void setGeneratingUnit( GeneratingUnit newGeneratingUnit ) {
        if( newGeneratingUnit != generatingUnit ) {
            NotificationChain msgs = null;
            if( generatingUnit != null )
                msgs = ( ( InternalEObject ) generatingUnit ).eInverseRemove( this,
                        CimPackage.GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT, GeneratingUnit.class, msgs );
            if( newGeneratingUnit != null )
                msgs = ( ( InternalEObject ) newGeneratingUnit ).eInverseAdd( this,
                        CimPackage.GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT, GeneratingUnit.class, msgs );
            msgs = basicSetGeneratingUnit( newGeneratingUnit, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldGeneratingUnitESet = generatingUnitESet;
            generatingUnitESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        CimPackage.CONTROL_AREA_GENERATING_UNIT__GENERATING_UNIT, newGeneratingUnit, newGeneratingUnit,
                        !oldGeneratingUnitESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetGeneratingUnit( NotificationChain msgs ) {
        GeneratingUnit oldGeneratingUnit = generatingUnit;
        generatingUnit = null;
        boolean oldGeneratingUnitESet = generatingUnitESet;
        generatingUnitESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CONTROL_AREA_GENERATING_UNIT__GENERATING_UNIT, oldGeneratingUnit, null,
                    oldGeneratingUnitESet );
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
    public void unsetGeneratingUnit() {
        if( generatingUnit != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) generatingUnit ).eInverseRemove( this,
                    CimPackage.GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT, GeneratingUnit.class, msgs );
            msgs = basicUnsetGeneratingUnit( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldGeneratingUnitESet = generatingUnitESet;
            generatingUnitESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.CONTROL_AREA_GENERATING_UNIT__GENERATING_UNIT, null, null, oldGeneratingUnitESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGeneratingUnit() {
        return generatingUnitESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.CONTROL_AREA_GENERATING_UNIT__GENERATING_UNIT:
            if( generatingUnit != null )
                msgs = ( ( InternalEObject ) generatingUnit ).eInverseRemove( this,
                        CimPackage.GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT, GeneratingUnit.class, msgs );
            return basicSetGeneratingUnit( ( GeneratingUnit ) otherEnd, msgs );
        case CimPackage.CONTROL_AREA_GENERATING_UNIT__CONTROL_AREA:
            if( controlArea != null )
                msgs = ( ( InternalEObject ) controlArea ).eInverseRemove( this,
                        CimPackage.CONTROL_AREA__CONTROL_AREA_GENERATING_UNIT, ControlArea.class, msgs );
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
        case CimPackage.CONTROL_AREA_GENERATING_UNIT__GENERATING_UNIT:
            return basicUnsetGeneratingUnit( msgs );
        case CimPackage.CONTROL_AREA_GENERATING_UNIT__CONTROL_AREA:
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
        case CimPackage.CONTROL_AREA_GENERATING_UNIT__GENERATING_UNIT:
            return getGeneratingUnit();
        case CimPackage.CONTROL_AREA_GENERATING_UNIT__CONTROL_AREA:
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
        case CimPackage.CONTROL_AREA_GENERATING_UNIT__GENERATING_UNIT:
            setGeneratingUnit( ( GeneratingUnit ) newValue );
            return;
        case CimPackage.CONTROL_AREA_GENERATING_UNIT__CONTROL_AREA:
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
        case CimPackage.CONTROL_AREA_GENERATING_UNIT__GENERATING_UNIT:
            unsetGeneratingUnit();
            return;
        case CimPackage.CONTROL_AREA_GENERATING_UNIT__CONTROL_AREA:
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
        case CimPackage.CONTROL_AREA_GENERATING_UNIT__GENERATING_UNIT:
            return isSetGeneratingUnit();
        case CimPackage.CONTROL_AREA_GENERATING_UNIT__CONTROL_AREA:
            return isSetControlArea();
        }
        return super.eIsSet( featureID );
    }

} //ControlAreaGeneratingUnitImpl

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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseTapChangerTable;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseTapChangerTablePoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Phase Tap Changer Table Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PhaseTapChangerTablePointImpl#getPhaseTapChangerTable <em>Phase Tap Changer Table</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.PhaseTapChangerTablePointImpl#getAngle <em>Angle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhaseTapChangerTablePointImpl extends TapChangerTablePointImpl implements PhaseTapChangerTablePoint {
    /**
     * The cached value of the '{@link #getPhaseTapChangerTable() <em>Phase Tap Changer Table</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPhaseTapChangerTable()
     * @generated
     * @ordered
     */
    protected PhaseTapChangerTable phaseTapChangerTable;

    /**
     * This is true if the Phase Tap Changer Table reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean phaseTapChangerTableESet;

    /**
     * The default value of the '{@link #getAngle() <em>Angle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAngle()
     * @generated
     * @ordered
     */
    protected static final Double ANGLE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAngle() <em>Angle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAngle()
     * @generated
     * @ordered
     */
    protected Double angle = ANGLE_EDEFAULT;

    /**
     * This is true if the Angle attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean angleESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PhaseTapChangerTablePointImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getPhaseTapChangerTablePoint();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PhaseTapChangerTable getPhaseTapChangerTable() {
        return phaseTapChangerTable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPhaseTapChangerTable( PhaseTapChangerTable newPhaseTapChangerTable,
            NotificationChain msgs ) {
        PhaseTapChangerTable oldPhaseTapChangerTable = phaseTapChangerTable;
        phaseTapChangerTable = newPhaseTapChangerTable;
        boolean oldPhaseTapChangerTableESet = phaseTapChangerTableESet;
        phaseTapChangerTableESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.PHASE_TAP_CHANGER_TABLE_POINT__PHASE_TAP_CHANGER_TABLE, oldPhaseTapChangerTable,
                    newPhaseTapChangerTable, !oldPhaseTapChangerTableESet );
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
    public void setPhaseTapChangerTable( PhaseTapChangerTable newPhaseTapChangerTable ) {
        if( newPhaseTapChangerTable != phaseTapChangerTable ) {
            NotificationChain msgs = null;
            if( phaseTapChangerTable != null )
                msgs = ( ( InternalEObject ) phaseTapChangerTable ).eInverseRemove( this,
                        CimPackage.PHASE_TAP_CHANGER_TABLE__PHASE_TAP_CHANGER_TABLE_POINT, PhaseTapChangerTable.class,
                        msgs );
            if( newPhaseTapChangerTable != null )
                msgs = ( ( InternalEObject ) newPhaseTapChangerTable ).eInverseAdd( this,
                        CimPackage.PHASE_TAP_CHANGER_TABLE__PHASE_TAP_CHANGER_TABLE_POINT, PhaseTapChangerTable.class,
                        msgs );
            msgs = basicSetPhaseTapChangerTable( newPhaseTapChangerTable, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPhaseTapChangerTableESet = phaseTapChangerTableESet;
            phaseTapChangerTableESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        CimPackage.PHASE_TAP_CHANGER_TABLE_POINT__PHASE_TAP_CHANGER_TABLE, newPhaseTapChangerTable,
                        newPhaseTapChangerTable, !oldPhaseTapChangerTableESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetPhaseTapChangerTable( NotificationChain msgs ) {
        PhaseTapChangerTable oldPhaseTapChangerTable = phaseTapChangerTable;
        phaseTapChangerTable = null;
        boolean oldPhaseTapChangerTableESet = phaseTapChangerTableESet;
        phaseTapChangerTableESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PHASE_TAP_CHANGER_TABLE_POINT__PHASE_TAP_CHANGER_TABLE, oldPhaseTapChangerTable, null,
                    oldPhaseTapChangerTableESet );
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
    public void unsetPhaseTapChangerTable() {
        if( phaseTapChangerTable != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) phaseTapChangerTable ).eInverseRemove( this,
                    CimPackage.PHASE_TAP_CHANGER_TABLE__PHASE_TAP_CHANGER_TABLE_POINT, PhaseTapChangerTable.class,
                    msgs );
            msgs = basicUnsetPhaseTapChangerTable( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPhaseTapChangerTableESet = phaseTapChangerTableESet;
            phaseTapChangerTableESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.PHASE_TAP_CHANGER_TABLE_POINT__PHASE_TAP_CHANGER_TABLE, null, null,
                        oldPhaseTapChangerTableESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPhaseTapChangerTable() {
        return phaseTapChangerTableESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getAngle() {
        return angle;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAngle( Double newAngle ) {
        Double oldAngle = angle;
        angle = newAngle;
        boolean oldAngleESet = angleESet;
        angleESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PHASE_TAP_CHANGER_TABLE_POINT__ANGLE,
                    oldAngle, angle, !oldAngleESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAngle() {
        Double oldAngle = angle;
        boolean oldAngleESet = angleESet;
        angle = ANGLE_EDEFAULT;
        angleESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PHASE_TAP_CHANGER_TABLE_POINT__ANGLE,
                    oldAngle, ANGLE_EDEFAULT, oldAngleESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAngle() {
        return angleESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.PHASE_TAP_CHANGER_TABLE_POINT__PHASE_TAP_CHANGER_TABLE:
            if( phaseTapChangerTable != null )
                msgs = ( ( InternalEObject ) phaseTapChangerTable ).eInverseRemove( this,
                        CimPackage.PHASE_TAP_CHANGER_TABLE__PHASE_TAP_CHANGER_TABLE_POINT, PhaseTapChangerTable.class,
                        msgs );
            return basicSetPhaseTapChangerTable( ( PhaseTapChangerTable ) otherEnd, msgs );
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
        case CimPackage.PHASE_TAP_CHANGER_TABLE_POINT__PHASE_TAP_CHANGER_TABLE:
            return basicUnsetPhaseTapChangerTable( msgs );
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
        case CimPackage.PHASE_TAP_CHANGER_TABLE_POINT__PHASE_TAP_CHANGER_TABLE:
            return getPhaseTapChangerTable();
        case CimPackage.PHASE_TAP_CHANGER_TABLE_POINT__ANGLE:
            return getAngle();
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
        case CimPackage.PHASE_TAP_CHANGER_TABLE_POINT__PHASE_TAP_CHANGER_TABLE:
            setPhaseTapChangerTable( ( PhaseTapChangerTable ) newValue );
            return;
        case CimPackage.PHASE_TAP_CHANGER_TABLE_POINT__ANGLE:
            setAngle( ( Double ) newValue );
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
        case CimPackage.PHASE_TAP_CHANGER_TABLE_POINT__PHASE_TAP_CHANGER_TABLE:
            unsetPhaseTapChangerTable();
            return;
        case CimPackage.PHASE_TAP_CHANGER_TABLE_POINT__ANGLE:
            unsetAngle();
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
        case CimPackage.PHASE_TAP_CHANGER_TABLE_POINT__PHASE_TAP_CHANGER_TABLE:
            return isSetPhaseTapChangerTable();
        case CimPackage.PHASE_TAP_CHANGER_TABLE_POINT__ANGLE:
            return isSetAngle();
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
        result.append( " (angle: " );
        if( angleESet )
            result.append( angle );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //PhaseTapChangerTablePointImpl

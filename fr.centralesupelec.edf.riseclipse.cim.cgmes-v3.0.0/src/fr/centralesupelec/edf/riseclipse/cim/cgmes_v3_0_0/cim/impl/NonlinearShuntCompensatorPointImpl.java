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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.NonlinearShuntCompensator;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.NonlinearShuntCompensatorPoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Nonlinear Shunt Compensator Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.NonlinearShuntCompensatorPointImpl#getG <em>G</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.NonlinearShuntCompensatorPointImpl#getB <em>B</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.NonlinearShuntCompensatorPointImpl#getNonlinearShuntCompensator <em>Nonlinear Shunt Compensator</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.NonlinearShuntCompensatorPointImpl#getSectionNumber <em>Section Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.NonlinearShuntCompensatorPointImpl#getG0 <em>G0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.NonlinearShuntCompensatorPointImpl#getB0 <em>B0</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NonlinearShuntCompensatorPointImpl extends CimObjectWithIDImpl implements NonlinearShuntCompensatorPoint {
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
     * The cached value of the '{@link #getNonlinearShuntCompensator() <em>Nonlinear Shunt Compensator</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNonlinearShuntCompensator()
     * @generated
     * @ordered
     */
    protected NonlinearShuntCompensator nonlinearShuntCompensator;

    /**
     * This is true if the Nonlinear Shunt Compensator reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean nonlinearShuntCompensatorESet;

    /**
     * The default value of the '{@link #getSectionNumber() <em>Section Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSectionNumber()
     * @generated
     * @ordered
     */
    protected static final BigInteger SECTION_NUMBER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSectionNumber() <em>Section Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSectionNumber()
     * @generated
     * @ordered
     */
    protected BigInteger sectionNumber = SECTION_NUMBER_EDEFAULT;

    /**
     * This is true if the Section Number attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sectionNumberESet;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected NonlinearShuntCompensatorPointImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getNonlinearShuntCompensatorPoint();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BigInteger getSectionNumber() {
        return sectionNumber;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSectionNumber( BigInteger newSectionNumber ) {
        BigInteger oldSectionNumber = sectionNumber;
        sectionNumber = newSectionNumber;
        boolean oldSectionNumberESet = sectionNumberESet;
        sectionNumberESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.NONLINEAR_SHUNT_COMPENSATOR_POINT__SECTION_NUMBER, oldSectionNumber, sectionNumber,
                    !oldSectionNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSectionNumber() {
        BigInteger oldSectionNumber = sectionNumber;
        boolean oldSectionNumberESet = sectionNumberESet;
        sectionNumber = SECTION_NUMBER_EDEFAULT;
        sectionNumberESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.NONLINEAR_SHUNT_COMPENSATOR_POINT__SECTION_NUMBER, oldSectionNumber,
                    SECTION_NUMBER_EDEFAULT, oldSectionNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSectionNumber() {
        return sectionNumberESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.NONLINEAR_SHUNT_COMPENSATOR_POINT__G0,
                    oldG0, g0, !oldG0ESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.NONLINEAR_SHUNT_COMPENSATOR_POINT__G0,
                    oldG0, G0_EDEFAULT, oldG0ESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.NONLINEAR_SHUNT_COMPENSATOR_POINT__B0,
                    oldB0, b0, !oldB0ESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.NONLINEAR_SHUNT_COMPENSATOR_POINT__B0,
                    oldB0, B0_EDEFAULT, oldB0ESet ) );
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
    public NonlinearShuntCompensator getNonlinearShuntCompensator() {
        return nonlinearShuntCompensator;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetNonlinearShuntCompensator( NonlinearShuntCompensator newNonlinearShuntCompensator,
            NotificationChain msgs ) {
        NonlinearShuntCompensator oldNonlinearShuntCompensator = nonlinearShuntCompensator;
        nonlinearShuntCompensator = newNonlinearShuntCompensator;
        boolean oldNonlinearShuntCompensatorESet = nonlinearShuntCompensatorESet;
        nonlinearShuntCompensatorESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.NONLINEAR_SHUNT_COMPENSATOR_POINT__NONLINEAR_SHUNT_COMPENSATOR,
                    oldNonlinearShuntCompensator, newNonlinearShuntCompensator, !oldNonlinearShuntCompensatorESet );
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
    public void setNonlinearShuntCompensator( NonlinearShuntCompensator newNonlinearShuntCompensator ) {
        if( newNonlinearShuntCompensator != nonlinearShuntCompensator ) {
            NotificationChain msgs = null;
            if( nonlinearShuntCompensator != null )
                msgs = ( ( InternalEObject ) nonlinearShuntCompensator ).eInverseRemove( this,
                        CimPackage.NONLINEAR_SHUNT_COMPENSATOR__NONLINEAR_SHUNT_COMPENSATOR_POINTS,
                        NonlinearShuntCompensator.class, msgs );
            if( newNonlinearShuntCompensator != null )
                msgs = ( ( InternalEObject ) newNonlinearShuntCompensator ).eInverseAdd( this,
                        CimPackage.NONLINEAR_SHUNT_COMPENSATOR__NONLINEAR_SHUNT_COMPENSATOR_POINTS,
                        NonlinearShuntCompensator.class, msgs );
            msgs = basicSetNonlinearShuntCompensator( newNonlinearShuntCompensator, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldNonlinearShuntCompensatorESet = nonlinearShuntCompensatorESet;
            nonlinearShuntCompensatorESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET,
                        CimPackage.NONLINEAR_SHUNT_COMPENSATOR_POINT__NONLINEAR_SHUNT_COMPENSATOR,
                        newNonlinearShuntCompensator, newNonlinearShuntCompensator,
                        !oldNonlinearShuntCompensatorESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetNonlinearShuntCompensator( NotificationChain msgs ) {
        NonlinearShuntCompensator oldNonlinearShuntCompensator = nonlinearShuntCompensator;
        nonlinearShuntCompensator = null;
        boolean oldNonlinearShuntCompensatorESet = nonlinearShuntCompensatorESet;
        nonlinearShuntCompensatorESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.NONLINEAR_SHUNT_COMPENSATOR_POINT__NONLINEAR_SHUNT_COMPENSATOR,
                    oldNonlinearShuntCompensator, null, oldNonlinearShuntCompensatorESet );
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
    public void unsetNonlinearShuntCompensator() {
        if( nonlinearShuntCompensator != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) nonlinearShuntCompensator ).eInverseRemove( this,
                    CimPackage.NONLINEAR_SHUNT_COMPENSATOR__NONLINEAR_SHUNT_COMPENSATOR_POINTS,
                    NonlinearShuntCompensator.class, msgs );
            msgs = basicUnsetNonlinearShuntCompensator( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldNonlinearShuntCompensatorESet = nonlinearShuntCompensatorESet;
            nonlinearShuntCompensatorESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET,
                        CimPackage.NONLINEAR_SHUNT_COMPENSATOR_POINT__NONLINEAR_SHUNT_COMPENSATOR, null, null,
                        oldNonlinearShuntCompensatorESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNonlinearShuntCompensator() {
        return nonlinearShuntCompensatorESet;
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.NONLINEAR_SHUNT_COMPENSATOR_POINT__G,
                    oldG, g, !oldGESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.NONLINEAR_SHUNT_COMPENSATOR_POINT__G,
                    oldG, G_EDEFAULT, oldGESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.NONLINEAR_SHUNT_COMPENSATOR_POINT__B,
                    oldB, b, !oldBESet ) );
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.NONLINEAR_SHUNT_COMPENSATOR_POINT__B,
                    oldB, B_EDEFAULT, oldBESet ) );
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
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR_POINT__NONLINEAR_SHUNT_COMPENSATOR:
            if( nonlinearShuntCompensator != null )
                msgs = ( ( InternalEObject ) nonlinearShuntCompensator ).eInverseRemove( this,
                        CimPackage.NONLINEAR_SHUNT_COMPENSATOR__NONLINEAR_SHUNT_COMPENSATOR_POINTS,
                        NonlinearShuntCompensator.class, msgs );
            return basicSetNonlinearShuntCompensator( ( NonlinearShuntCompensator ) otherEnd, msgs );
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
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR_POINT__NONLINEAR_SHUNT_COMPENSATOR:
            return basicUnsetNonlinearShuntCompensator( msgs );
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
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR_POINT__G:
            return getG();
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR_POINT__B:
            return getB();
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR_POINT__NONLINEAR_SHUNT_COMPENSATOR:
            return getNonlinearShuntCompensator();
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR_POINT__SECTION_NUMBER:
            return getSectionNumber();
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR_POINT__G0:
            return getG0();
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR_POINT__B0:
            return getB0();
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
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR_POINT__G:
            setG( ( Double ) newValue );
            return;
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR_POINT__B:
            setB( ( Double ) newValue );
            return;
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR_POINT__NONLINEAR_SHUNT_COMPENSATOR:
            setNonlinearShuntCompensator( ( NonlinearShuntCompensator ) newValue );
            return;
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR_POINT__SECTION_NUMBER:
            setSectionNumber( ( BigInteger ) newValue );
            return;
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR_POINT__G0:
            setG0( ( Double ) newValue );
            return;
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR_POINT__B0:
            setB0( ( Double ) newValue );
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
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR_POINT__G:
            unsetG();
            return;
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR_POINT__B:
            unsetB();
            return;
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR_POINT__NONLINEAR_SHUNT_COMPENSATOR:
            unsetNonlinearShuntCompensator();
            return;
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR_POINT__SECTION_NUMBER:
            unsetSectionNumber();
            return;
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR_POINT__G0:
            unsetG0();
            return;
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR_POINT__B0:
            unsetB0();
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
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR_POINT__G:
            return isSetG();
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR_POINT__B:
            return isSetB();
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR_POINT__NONLINEAR_SHUNT_COMPENSATOR:
            return isSetNonlinearShuntCompensator();
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR_POINT__SECTION_NUMBER:
            return isSetSectionNumber();
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR_POINT__G0:
            return isSetG0();
        case CimPackage.NONLINEAR_SHUNT_COMPENSATOR_POINT__B0:
            return isSetB0();
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
        result.append( " (g: " );
        if( gESet )
            result.append( g );
        else
            result.append( "<unset>" );
        result.append( ", b: " );
        if( bESet )
            result.append( b );
        else
            result.append( "<unset>" );
        result.append( ", sectionNumber: " );
        if( sectionNumberESet )
            result.append( sectionNumber );
        else
            result.append( "<unset>" );
        result.append( ", g0: " );
        if( g0ESet )
            result.append( g0 );
        else
            result.append( "<unset>" );
        result.append( ", b0: " );
        if( b0ESet )
            result.append( b0 );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //NonlinearShuntCompensatorPointImpl

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

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineEquivalentCircuit;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asynchronous Machine Equivalent Circuit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.AsynchronousMachineEquivalentCircuitImpl#getXm <em>Xm</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.AsynchronousMachineEquivalentCircuitImpl#getXlr2 <em>Xlr2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.AsynchronousMachineEquivalentCircuitImpl#getXlr1 <em>Xlr1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.AsynchronousMachineEquivalentCircuitImpl#getRr1 <em>Rr1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.AsynchronousMachineEquivalentCircuitImpl#getRr2 <em>Rr2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AsynchronousMachineEquivalentCircuitImpl extends AsynchronousMachineDynamicsImpl
        implements AsynchronousMachineEquivalentCircuit {
    /**
     * The default value of the '{@link #getXm() <em>Xm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXm()
     * @generated
     * @ordered
     */
    protected static final Double XM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getXm() <em>Xm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXm()
     * @generated
     * @ordered
     */
    protected Double xm = XM_EDEFAULT;

    /**
     * This is true if the Xm attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xmESet;

    /**
     * The default value of the '{@link #getXlr2() <em>Xlr2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXlr2()
     * @generated
     * @ordered
     */
    protected static final Double XLR2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getXlr2() <em>Xlr2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXlr2()
     * @generated
     * @ordered
     */
    protected Double xlr2 = XLR2_EDEFAULT;

    /**
     * This is true if the Xlr2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xlr2ESet;

    /**
     * The default value of the '{@link #getXlr1() <em>Xlr1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXlr1()
     * @generated
     * @ordered
     */
    protected static final Double XLR1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getXlr1() <em>Xlr1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXlr1()
     * @generated
     * @ordered
     */
    protected Double xlr1 = XLR1_EDEFAULT;

    /**
     * This is true if the Xlr1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xlr1ESet;

    /**
     * The default value of the '{@link #getRr1() <em>Rr1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRr1()
     * @generated
     * @ordered
     */
    protected static final Double RR1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRr1() <em>Rr1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRr1()
     * @generated
     * @ordered
     */
    protected Double rr1 = RR1_EDEFAULT;

    /**
     * This is true if the Rr1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rr1ESet;

    /**
     * The default value of the '{@link #getRr2() <em>Rr2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRr2()
     * @generated
     * @ordered
     */
    protected static final Double RR2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRr2() <em>Rr2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRr2()
     * @generated
     * @ordered
     */
    protected Double rr2 = RR2_EDEFAULT;

    /**
     * This is true if the Rr2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rr2ESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AsynchronousMachineEquivalentCircuitImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getAsynchronousMachineEquivalentCircuit();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getXm() {
        return xm;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setXm( Double newXm ) {
        Double oldXm = xm;
        xm = newXm;
        boolean oldXmESet = xmESet;
        xmESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.ASYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__XM, oldXm, xm, !oldXmESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetXm() {
        Double oldXm = xm;
        boolean oldXmESet = xmESet;
        xm = XM_EDEFAULT;
        xmESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__XM, oldXm, XM_EDEFAULT, oldXmESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetXm() {
        return xmESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getXlr2() {
        return xlr2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setXlr2( Double newXlr2 ) {
        Double oldXlr2 = xlr2;
        xlr2 = newXlr2;
        boolean oldXlr2ESet = xlr2ESet;
        xlr2ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.ASYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__XLR2, oldXlr2, xlr2, !oldXlr2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetXlr2() {
        Double oldXlr2 = xlr2;
        boolean oldXlr2ESet = xlr2ESet;
        xlr2 = XLR2_EDEFAULT;
        xlr2ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__XLR2, oldXlr2, XLR2_EDEFAULT, oldXlr2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetXlr2() {
        return xlr2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getXlr1() {
        return xlr1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setXlr1( Double newXlr1 ) {
        Double oldXlr1 = xlr1;
        xlr1 = newXlr1;
        boolean oldXlr1ESet = xlr1ESet;
        xlr1ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.ASYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__XLR1, oldXlr1, xlr1, !oldXlr1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetXlr1() {
        Double oldXlr1 = xlr1;
        boolean oldXlr1ESet = xlr1ESet;
        xlr1 = XLR1_EDEFAULT;
        xlr1ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__XLR1, oldXlr1, XLR1_EDEFAULT, oldXlr1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetXlr1() {
        return xlr1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getRr1() {
        return rr1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRr1( Double newRr1 ) {
        Double oldRr1 = rr1;
        rr1 = newRr1;
        boolean oldRr1ESet = rr1ESet;
        rr1ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.ASYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__RR1, oldRr1, rr1, !oldRr1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRr1() {
        Double oldRr1 = rr1;
        boolean oldRr1ESet = rr1ESet;
        rr1 = RR1_EDEFAULT;
        rr1ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__RR1, oldRr1, RR1_EDEFAULT, oldRr1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRr1() {
        return rr1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getRr2() {
        return rr2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRr2( Double newRr2 ) {
        Double oldRr2 = rr2;
        rr2 = newRr2;
        boolean oldRr2ESet = rr2ESet;
        rr2ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.ASYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__RR2, oldRr2, rr2, !oldRr2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRr2() {
        Double oldRr2 = rr2;
        boolean oldRr2ESet = rr2ESet;
        rr2 = RR2_EDEFAULT;
        rr2ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__RR2, oldRr2, RR2_EDEFAULT, oldRr2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRr2() {
        return rr2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.ASYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__XM:
            return getXm();
        case CimPackage.ASYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__XLR2:
            return getXlr2();
        case CimPackage.ASYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__XLR1:
            return getXlr1();
        case CimPackage.ASYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__RR1:
            return getRr1();
        case CimPackage.ASYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__RR2:
            return getRr2();
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
        case CimPackage.ASYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__XM:
            setXm( ( Double ) newValue );
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__XLR2:
            setXlr2( ( Double ) newValue );
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__XLR1:
            setXlr1( ( Double ) newValue );
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__RR1:
            setRr1( ( Double ) newValue );
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__RR2:
            setRr2( ( Double ) newValue );
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
        case CimPackage.ASYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__XM:
            unsetXm();
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__XLR2:
            unsetXlr2();
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__XLR1:
            unsetXlr1();
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__RR1:
            unsetRr1();
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__RR2:
            unsetRr2();
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
        case CimPackage.ASYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__XM:
            return isSetXm();
        case CimPackage.ASYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__XLR2:
            return isSetXlr2();
        case CimPackage.ASYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__XLR1:
            return isSetXlr1();
        case CimPackage.ASYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__RR1:
            return isSetRr1();
        case CimPackage.ASYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__RR2:
            return isSetRr2();
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
        result.append( " (xm: " );
        if( xmESet )
            result.append( xm );
        else
            result.append( "<unset>" );
        result.append( ", xlr2: " );
        if( xlr2ESet )
            result.append( xlr2 );
        else
            result.append( "<unset>" );
        result.append( ", xlr1: " );
        if( xlr1ESet )
            result.append( xlr1 );
        else
            result.append( "<unset>" );
        result.append( ", rr1: " );
        if( rr1ESet )
            result.append( rr1 );
        else
            result.append( "<unset>" );
        result.append( ", rr2: " );
        if( rr2ESet )
            result.append( rr2 );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //AsynchronousMachineEquivalentCircuitImpl

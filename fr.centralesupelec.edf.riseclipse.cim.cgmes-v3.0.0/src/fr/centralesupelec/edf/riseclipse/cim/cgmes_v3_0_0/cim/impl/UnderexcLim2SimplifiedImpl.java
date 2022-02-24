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

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnderexcLim2Simplified;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Underexc Lim2 Simplified</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.UnderexcLim2SimplifiedImpl#getQ1 <em>Q1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.UnderexcLim2SimplifiedImpl#getQ0 <em>Q0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.UnderexcLim2SimplifiedImpl#getKui <em>Kui</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.UnderexcLim2SimplifiedImpl#getVuimax <em>Vuimax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.UnderexcLim2SimplifiedImpl#getP0 <em>P0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.UnderexcLim2SimplifiedImpl#getP1 <em>P1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.UnderexcLim2SimplifiedImpl#getVuimin <em>Vuimin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnderexcLim2SimplifiedImpl extends UnderexcitationLimiterDynamicsImpl implements UnderexcLim2Simplified {
    /**
     * The default value of the '{@link #getQ1() <em>Q1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQ1()
     * @generated
     * @ordered
     */
    protected static final Double Q1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getQ1() <em>Q1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQ1()
     * @generated
     * @ordered
     */
    protected Double q1 = Q1_EDEFAULT;

    /**
     * This is true if the Q1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean q1ESet;

    /**
     * The default value of the '{@link #getQ0() <em>Q0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQ0()
     * @generated
     * @ordered
     */
    protected static final Double Q0_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getQ0() <em>Q0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getQ0()
     * @generated
     * @ordered
     */
    protected Double q0 = Q0_EDEFAULT;

    /**
     * This is true if the Q0 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean q0ESet;

    /**
     * The default value of the '{@link #getKui() <em>Kui</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKui()
     * @generated
     * @ordered
     */
    protected static final Double KUI_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getKui() <em>Kui</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getKui()
     * @generated
     * @ordered
     */
    protected Double kui = KUI_EDEFAULT;

    /**
     * This is true if the Kui attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean kuiESet;

    /**
     * The default value of the '{@link #getVuimax() <em>Vuimax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVuimax()
     * @generated
     * @ordered
     */
    protected static final Double VUIMAX_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVuimax() <em>Vuimax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVuimax()
     * @generated
     * @ordered
     */
    protected Double vuimax = VUIMAX_EDEFAULT;

    /**
     * This is true if the Vuimax attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vuimaxESet;

    /**
     * The default value of the '{@link #getP0() <em>P0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getP0()
     * @generated
     * @ordered
     */
    protected static final Double P0_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getP0() <em>P0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getP0()
     * @generated
     * @ordered
     */
    protected Double p0 = P0_EDEFAULT;

    /**
     * This is true if the P0 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean p0ESet;

    /**
     * The default value of the '{@link #getP1() <em>P1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getP1()
     * @generated
     * @ordered
     */
    protected static final Double P1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getP1() <em>P1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getP1()
     * @generated
     * @ordered
     */
    protected Double p1 = P1_EDEFAULT;

    /**
     * This is true if the P1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean p1ESet;

    /**
     * The default value of the '{@link #getVuimin() <em>Vuimin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVuimin()
     * @generated
     * @ordered
     */
    protected static final Double VUIMIN_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVuimin() <em>Vuimin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVuimin()
     * @generated
     * @ordered
     */
    protected Double vuimin = VUIMIN_EDEFAULT;

    /**
     * This is true if the Vuimin attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean vuiminESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected UnderexcLim2SimplifiedImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getUnderexcLim2Simplified();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getQ1() {
        return q1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setQ1( Double newQ1 ) {
        Double oldQ1 = q1;
        q1 = newQ1;
        boolean oldQ1ESet = q1ESet;
        q1ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.UNDEREXC_LIM2_SIMPLIFIED__Q1, oldQ1, q1,
                    !oldQ1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetQ1() {
        Double oldQ1 = q1;
        boolean oldQ1ESet = q1ESet;
        q1 = Q1_EDEFAULT;
        q1ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.UNDEREXC_LIM2_SIMPLIFIED__Q1, oldQ1,
                    Q1_EDEFAULT, oldQ1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetQ1() {
        return q1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getQ0() {
        return q0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setQ0( Double newQ0 ) {
        Double oldQ0 = q0;
        q0 = newQ0;
        boolean oldQ0ESet = q0ESet;
        q0ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.UNDEREXC_LIM2_SIMPLIFIED__Q0, oldQ0, q0,
                    !oldQ0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetQ0() {
        Double oldQ0 = q0;
        boolean oldQ0ESet = q0ESet;
        q0 = Q0_EDEFAULT;
        q0ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.UNDEREXC_LIM2_SIMPLIFIED__Q0, oldQ0,
                    Q0_EDEFAULT, oldQ0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetQ0() {
        return q0ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getKui() {
        return kui;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setKui( Double newKui ) {
        Double oldKui = kui;
        kui = newKui;
        boolean oldKuiESet = kuiESet;
        kuiESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.UNDEREXC_LIM2_SIMPLIFIED__KUI, oldKui,
                    kui, !oldKuiESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetKui() {
        Double oldKui = kui;
        boolean oldKuiESet = kuiESet;
        kui = KUI_EDEFAULT;
        kuiESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.UNDEREXC_LIM2_SIMPLIFIED__KUI, oldKui,
                    KUI_EDEFAULT, oldKuiESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetKui() {
        return kuiESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVuimax() {
        return vuimax;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVuimax( Double newVuimax ) {
        Double oldVuimax = vuimax;
        vuimax = newVuimax;
        boolean oldVuimaxESet = vuimaxESet;
        vuimaxESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.UNDEREXC_LIM2_SIMPLIFIED__VUIMAX,
                    oldVuimax, vuimax, !oldVuimaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVuimax() {
        Double oldVuimax = vuimax;
        boolean oldVuimaxESet = vuimaxESet;
        vuimax = VUIMAX_EDEFAULT;
        vuimaxESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.UNDEREXC_LIM2_SIMPLIFIED__VUIMAX,
                    oldVuimax, VUIMAX_EDEFAULT, oldVuimaxESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVuimax() {
        return vuimaxESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getP0() {
        return p0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setP0( Double newP0 ) {
        Double oldP0 = p0;
        p0 = newP0;
        boolean oldP0ESet = p0ESet;
        p0ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.UNDEREXC_LIM2_SIMPLIFIED__P0, oldP0, p0,
                    !oldP0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetP0() {
        Double oldP0 = p0;
        boolean oldP0ESet = p0ESet;
        p0 = P0_EDEFAULT;
        p0ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.UNDEREXC_LIM2_SIMPLIFIED__P0, oldP0,
                    P0_EDEFAULT, oldP0ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetP0() {
        return p0ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getP1() {
        return p1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setP1( Double newP1 ) {
        Double oldP1 = p1;
        p1 = newP1;
        boolean oldP1ESet = p1ESet;
        p1ESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.UNDEREXC_LIM2_SIMPLIFIED__P1, oldP1, p1,
                    !oldP1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetP1() {
        Double oldP1 = p1;
        boolean oldP1ESet = p1ESet;
        p1 = P1_EDEFAULT;
        p1ESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.UNDEREXC_LIM2_SIMPLIFIED__P1, oldP1,
                    P1_EDEFAULT, oldP1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetP1() {
        return p1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getVuimin() {
        return vuimin;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVuimin( Double newVuimin ) {
        Double oldVuimin = vuimin;
        vuimin = newVuimin;
        boolean oldVuiminESet = vuiminESet;
        vuiminESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.UNDEREXC_LIM2_SIMPLIFIED__VUIMIN,
                    oldVuimin, vuimin, !oldVuiminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVuimin() {
        Double oldVuimin = vuimin;
        boolean oldVuiminESet = vuiminESet;
        vuimin = VUIMIN_EDEFAULT;
        vuiminESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.UNDEREXC_LIM2_SIMPLIFIED__VUIMIN,
                    oldVuimin, VUIMIN_EDEFAULT, oldVuiminESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVuimin() {
        return vuiminESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED__Q1:
            return getQ1();
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED__Q0:
            return getQ0();
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED__KUI:
            return getKui();
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED__VUIMAX:
            return getVuimax();
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED__P0:
            return getP0();
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED__P1:
            return getP1();
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED__VUIMIN:
            return getVuimin();
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
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED__Q1:
            setQ1( ( Double ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED__Q0:
            setQ0( ( Double ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED__KUI:
            setKui( ( Double ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED__VUIMAX:
            setVuimax( ( Double ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED__P0:
            setP0( ( Double ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED__P1:
            setP1( ( Double ) newValue );
            return;
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED__VUIMIN:
            setVuimin( ( Double ) newValue );
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
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED__Q1:
            unsetQ1();
            return;
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED__Q0:
            unsetQ0();
            return;
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED__KUI:
            unsetKui();
            return;
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED__VUIMAX:
            unsetVuimax();
            return;
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED__P0:
            unsetP0();
            return;
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED__P1:
            unsetP1();
            return;
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED__VUIMIN:
            unsetVuimin();
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
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED__Q1:
            return isSetQ1();
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED__Q0:
            return isSetQ0();
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED__KUI:
            return isSetKui();
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED__VUIMAX:
            return isSetVuimax();
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED__P0:
            return isSetP0();
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED__P1:
            return isSetP1();
        case CimPackage.UNDEREXC_LIM2_SIMPLIFIED__VUIMIN:
            return isSetVuimin();
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
        result.append( " (q1: " );
        if( q1ESet )
            result.append( q1 );
        else
            result.append( "<unset>" );
        result.append( ", q0: " );
        if( q0ESet )
            result.append( q0 );
        else
            result.append( "<unset>" );
        result.append( ", kui: " );
        if( kuiESet )
            result.append( kui );
        else
            result.append( "<unset>" );
        result.append( ", vuimax: " );
        if( vuimaxESet )
            result.append( vuimax );
        else
            result.append( "<unset>" );
        result.append( ", p0: " );
        if( p0ESet )
            result.append( p0 );
        else
            result.append( "<unset>" );
        result.append( ", p1: " );
        if( p1ESet )
            result.append( p1 );
        else
            result.append( "<unset>" );
        result.append( ", vuimin: " );
        if( vuiminESet )
            result.append( vuimin );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //UnderexcLim2SimplifiedImpl

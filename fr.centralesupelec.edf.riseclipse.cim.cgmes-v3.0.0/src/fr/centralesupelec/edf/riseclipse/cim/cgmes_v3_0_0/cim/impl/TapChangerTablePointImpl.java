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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TapChangerTablePoint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tap Changer Table Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.TapChangerTablePointImpl#getStep <em>Step</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.TapChangerTablePointImpl#getRatio <em>Ratio</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.TapChangerTablePointImpl#getG <em>G</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.TapChangerTablePointImpl#getB <em>B</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.TapChangerTablePointImpl#getX <em>X</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.TapChangerTablePointImpl#getR <em>R</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TapChangerTablePointImpl extends CimObjectWithIDImpl implements TapChangerTablePoint {
    /**
     * The default value of the '{@link #getStep() <em>Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStep()
     * @generated
     * @ordered
     */
    protected static final BigInteger STEP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStep() <em>Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStep()
     * @generated
     * @ordered
     */
    protected BigInteger step = STEP_EDEFAULT;

    /**
     * This is true if the Step attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean stepESet;

    /**
     * The default value of the '{@link #getRatio() <em>Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatio()
     * @generated
     * @ordered
     */
    protected static final Double RATIO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRatio() <em>Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatio()
     * @generated
     * @ordered
     */
    protected Double ratio = RATIO_EDEFAULT;

    /**
     * This is true if the Ratio attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ratioESet;

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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TapChangerTablePointImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getTapChangerTablePoint();
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TAP_CHANGER_TABLE_POINT__R, oldR, r,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TAP_CHANGER_TABLE_POINT__R, oldR,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TAP_CHANGER_TABLE_POINT__X, oldX, x,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TAP_CHANGER_TABLE_POINT__X, oldX,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TAP_CHANGER_TABLE_POINT__B, oldB, b,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TAP_CHANGER_TABLE_POINT__B, oldB,
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
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TAP_CHANGER_TABLE_POINT__G, oldG, g,
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
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TAP_CHANGER_TABLE_POINT__G, oldG,
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
    public Double getRatio() {
        return ratio;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRatio( Double newRatio ) {
        Double oldRatio = ratio;
        ratio = newRatio;
        boolean oldRatioESet = ratioESet;
        ratioESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TAP_CHANGER_TABLE_POINT__RATIO, oldRatio,
                    ratio, !oldRatioESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRatio() {
        Double oldRatio = ratio;
        boolean oldRatioESet = ratioESet;
        ratio = RATIO_EDEFAULT;
        ratioESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TAP_CHANGER_TABLE_POINT__RATIO,
                    oldRatio, RATIO_EDEFAULT, oldRatioESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRatio() {
        return ratioESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BigInteger getStep() {
        return step;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setStep( BigInteger newStep ) {
        BigInteger oldStep = step;
        step = newStep;
        boolean oldStepESet = stepESet;
        stepESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TAP_CHANGER_TABLE_POINT__STEP, oldStep,
                    step, !oldStepESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetStep() {
        BigInteger oldStep = step;
        boolean oldStepESet = stepESet;
        step = STEP_EDEFAULT;
        stepESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TAP_CHANGER_TABLE_POINT__STEP, oldStep,
                    STEP_EDEFAULT, oldStepESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetStep() {
        return stepESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.TAP_CHANGER_TABLE_POINT__STEP:
            return getStep();
        case CimPackage.TAP_CHANGER_TABLE_POINT__RATIO:
            return getRatio();
        case CimPackage.TAP_CHANGER_TABLE_POINT__G:
            return getG();
        case CimPackage.TAP_CHANGER_TABLE_POINT__B:
            return getB();
        case CimPackage.TAP_CHANGER_TABLE_POINT__X:
            return getX();
        case CimPackage.TAP_CHANGER_TABLE_POINT__R:
            return getR();
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
        case CimPackage.TAP_CHANGER_TABLE_POINT__STEP:
            setStep( ( BigInteger ) newValue );
            return;
        case CimPackage.TAP_CHANGER_TABLE_POINT__RATIO:
            setRatio( ( Double ) newValue );
            return;
        case CimPackage.TAP_CHANGER_TABLE_POINT__G:
            setG( ( Double ) newValue );
            return;
        case CimPackage.TAP_CHANGER_TABLE_POINT__B:
            setB( ( Double ) newValue );
            return;
        case CimPackage.TAP_CHANGER_TABLE_POINT__X:
            setX( ( Double ) newValue );
            return;
        case CimPackage.TAP_CHANGER_TABLE_POINT__R:
            setR( ( Double ) newValue );
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
        case CimPackage.TAP_CHANGER_TABLE_POINT__STEP:
            unsetStep();
            return;
        case CimPackage.TAP_CHANGER_TABLE_POINT__RATIO:
            unsetRatio();
            return;
        case CimPackage.TAP_CHANGER_TABLE_POINT__G:
            unsetG();
            return;
        case CimPackage.TAP_CHANGER_TABLE_POINT__B:
            unsetB();
            return;
        case CimPackage.TAP_CHANGER_TABLE_POINT__X:
            unsetX();
            return;
        case CimPackage.TAP_CHANGER_TABLE_POINT__R:
            unsetR();
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
        case CimPackage.TAP_CHANGER_TABLE_POINT__STEP:
            return isSetStep();
        case CimPackage.TAP_CHANGER_TABLE_POINT__RATIO:
            return isSetRatio();
        case CimPackage.TAP_CHANGER_TABLE_POINT__G:
            return isSetG();
        case CimPackage.TAP_CHANGER_TABLE_POINT__B:
            return isSetB();
        case CimPackage.TAP_CHANGER_TABLE_POINT__X:
            return isSetX();
        case CimPackage.TAP_CHANGER_TABLE_POINT__R:
            return isSetR();
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
        result.append( " (step: " );
        if( stepESet )
            result.append( step );
        else
            result.append( "<unset>" );
        result.append( ", ratio: " );
        if( ratioESet )
            result.append( ratio );
        else
            result.append( "<unset>" );
        result.append( ", g: " );
        if( gESet )
            result.append( g );
        else
            result.append( "<unset>" );
        result.append( ", b: " );
        if( bESet )
            result.append( b );
        else
            result.append( "<unset>" );
        result.append( ", x: " );
        if( xESet )
            result.append( x );
        else
            result.append( "<unset>" );
        result.append( ", r: " );
        if( rESet )
            result.append( r );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //TapChangerTablePointImpl

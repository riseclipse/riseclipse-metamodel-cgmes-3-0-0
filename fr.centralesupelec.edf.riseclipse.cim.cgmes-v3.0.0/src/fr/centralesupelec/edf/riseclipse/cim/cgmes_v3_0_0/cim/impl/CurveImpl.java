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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Curve;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CurveData;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CurveStyle;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnitSymbol;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Curve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.CurveImpl#getCurveStyle <em>Curve Style</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.CurveImpl#getY1Unit <em>Y1 Unit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.CurveImpl#getY2Unit <em>Y2 Unit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.CurveImpl#getXUnit <em>XUnit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.CurveImpl#getCurveDatas <em>Curve Datas</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CurveImpl extends IdentifiedObjectImpl implements Curve {
    /**
     * The default value of the '{@link #getCurveStyle() <em>Curve Style</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCurveStyle()
     * @generated
     * @ordered
     */
    protected static final CurveStyle CURVE_STYLE_EDEFAULT = CurveStyle.STRAIGHT_LINE_YVALUES;

    /**
     * The cached value of the '{@link #getCurveStyle() <em>Curve Style</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCurveStyle()
     * @generated
     * @ordered
     */
    protected CurveStyle curveStyle = CURVE_STYLE_EDEFAULT;

    /**
     * This is true if the Curve Style attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean curveStyleESet;

    /**
     * The default value of the '{@link #getY1Unit() <em>Y1 Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getY1Unit()
     * @generated
     * @ordered
     */
    protected static final UnitSymbol Y1_UNIT_EDEFAULT = UnitSymbol.WPERM_K;

    /**
     * The cached value of the '{@link #getY1Unit() <em>Y1 Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getY1Unit()
     * @generated
     * @ordered
     */
    protected UnitSymbol y1Unit = Y1_UNIT_EDEFAULT;

    /**
     * This is true if the Y1 Unit attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean y1UnitESet;

    /**
     * The default value of the '{@link #getY2Unit() <em>Y2 Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getY2Unit()
     * @generated
     * @ordered
     */
    protected static final UnitSymbol Y2_UNIT_EDEFAULT = UnitSymbol.WPERM_K;

    /**
     * The cached value of the '{@link #getY2Unit() <em>Y2 Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getY2Unit()
     * @generated
     * @ordered
     */
    protected UnitSymbol y2Unit = Y2_UNIT_EDEFAULT;

    /**
     * This is true if the Y2 Unit attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean y2UnitESet;

    /**
     * The default value of the '{@link #getXUnit() <em>XUnit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXUnit()
     * @generated
     * @ordered
     */
    protected static final UnitSymbol XUNIT_EDEFAULT = UnitSymbol.WPERM_K;

    /**
     * The cached value of the '{@link #getXUnit() <em>XUnit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXUnit()
     * @generated
     * @ordered
     */
    protected UnitSymbol xUnit = XUNIT_EDEFAULT;

    /**
     * This is true if the XUnit attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xUnitESet;

    /**
     * The cached value of the '{@link #getCurveDatas() <em>Curve Datas</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCurveDatas()
     * @generated
     * @ordered
     */
    protected EList< CurveData > curveDatas;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CurveImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getCurve();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public UnitSymbol getY1Unit() {
        return y1Unit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setY1Unit( UnitSymbol newY1Unit ) {
        UnitSymbol oldY1Unit = y1Unit;
        y1Unit = newY1Unit == null ? Y1_UNIT_EDEFAULT : newY1Unit;
        boolean oldY1UnitESet = y1UnitESet;
        y1UnitESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CURVE__Y1_UNIT, oldY1Unit, y1Unit,
                    !oldY1UnitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetY1Unit() {
        UnitSymbol oldY1Unit = y1Unit;
        boolean oldY1UnitESet = y1UnitESet;
        y1Unit = Y1_UNIT_EDEFAULT;
        y1UnitESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.CURVE__Y1_UNIT, oldY1Unit,
                    Y1_UNIT_EDEFAULT, oldY1UnitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetY1Unit() {
        return y1UnitESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public UnitSymbol getXUnit() {
        return xUnit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setXUnit( UnitSymbol newXUnit ) {
        UnitSymbol oldXUnit = xUnit;
        xUnit = newXUnit == null ? XUNIT_EDEFAULT : newXUnit;
        boolean oldXUnitESet = xUnitESet;
        xUnitESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CURVE__XUNIT, oldXUnit, xUnit,
                    !oldXUnitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetXUnit() {
        UnitSymbol oldXUnit = xUnit;
        boolean oldXUnitESet = xUnitESet;
        xUnit = XUNIT_EDEFAULT;
        xUnitESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.CURVE__XUNIT, oldXUnit, XUNIT_EDEFAULT,
                    oldXUnitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetXUnit() {
        return xUnitESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public UnitSymbol getY2Unit() {
        return y2Unit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setY2Unit( UnitSymbol newY2Unit ) {
        UnitSymbol oldY2Unit = y2Unit;
        y2Unit = newY2Unit == null ? Y2_UNIT_EDEFAULT : newY2Unit;
        boolean oldY2UnitESet = y2UnitESet;
        y2UnitESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CURVE__Y2_UNIT, oldY2Unit, y2Unit,
                    !oldY2UnitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetY2Unit() {
        UnitSymbol oldY2Unit = y2Unit;
        boolean oldY2UnitESet = y2UnitESet;
        y2Unit = Y2_UNIT_EDEFAULT;
        y2UnitESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.CURVE__Y2_UNIT, oldY2Unit,
                    Y2_UNIT_EDEFAULT, oldY2UnitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetY2Unit() {
        return y2UnitESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public CurveStyle getCurveStyle() {
        return curveStyle;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCurveStyle( CurveStyle newCurveStyle ) {
        CurveStyle oldCurveStyle = curveStyle;
        curveStyle = newCurveStyle == null ? CURVE_STYLE_EDEFAULT : newCurveStyle;
        boolean oldCurveStyleESet = curveStyleESet;
        curveStyleESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CURVE__CURVE_STYLE, oldCurveStyle,
                    curveStyle, !oldCurveStyleESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCurveStyle() {
        CurveStyle oldCurveStyle = curveStyle;
        boolean oldCurveStyleESet = curveStyleESet;
        curveStyle = CURVE_STYLE_EDEFAULT;
        curveStyleESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.CURVE__CURVE_STYLE, oldCurveStyle,
                    CURVE_STYLE_EDEFAULT, oldCurveStyleESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCurveStyle() {
        return curveStyleESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< CurveData > getCurveDatas() {
        if( curveDatas == null ) {
            curveDatas = new EObjectWithInverseResolvingEList.Unsettable< >( CurveData.class, this,
                    CimPackage.CURVE__CURVE_DATAS, CimPackage.CURVE_DATA__CURVE );
        }
        return curveDatas;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCurveDatas() {
        if( curveDatas != null ) ( ( InternalEList.Unsettable< ? > ) curveDatas ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCurveDatas() {
        return curveDatas != null && ( ( InternalEList.Unsettable< ? > ) curveDatas ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.CURVE__CURVE_DATAS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getCurveDatas() ).basicAdd( otherEnd,
                    msgs );
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
        case CimPackage.CURVE__CURVE_DATAS:
            return ( ( InternalEList< ? > ) getCurveDatas() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.CURVE__CURVE_STYLE:
            return getCurveStyle();
        case CimPackage.CURVE__Y1_UNIT:
            return getY1Unit();
        case CimPackage.CURVE__Y2_UNIT:
            return getY2Unit();
        case CimPackage.CURVE__XUNIT:
            return getXUnit();
        case CimPackage.CURVE__CURVE_DATAS:
            return getCurveDatas();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case CimPackage.CURVE__CURVE_STYLE:
            setCurveStyle( ( CurveStyle ) newValue );
            return;
        case CimPackage.CURVE__Y1_UNIT:
            setY1Unit( ( UnitSymbol ) newValue );
            return;
        case CimPackage.CURVE__Y2_UNIT:
            setY2Unit( ( UnitSymbol ) newValue );
            return;
        case CimPackage.CURVE__XUNIT:
            setXUnit( ( UnitSymbol ) newValue );
            return;
        case CimPackage.CURVE__CURVE_DATAS:
            getCurveDatas().clear();
            getCurveDatas().addAll( ( Collection< ? extends CurveData > ) newValue );
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
        case CimPackage.CURVE__CURVE_STYLE:
            unsetCurveStyle();
            return;
        case CimPackage.CURVE__Y1_UNIT:
            unsetY1Unit();
            return;
        case CimPackage.CURVE__Y2_UNIT:
            unsetY2Unit();
            return;
        case CimPackage.CURVE__XUNIT:
            unsetXUnit();
            return;
        case CimPackage.CURVE__CURVE_DATAS:
            unsetCurveDatas();
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
        case CimPackage.CURVE__CURVE_STYLE:
            return isSetCurveStyle();
        case CimPackage.CURVE__Y1_UNIT:
            return isSetY1Unit();
        case CimPackage.CURVE__Y2_UNIT:
            return isSetY2Unit();
        case CimPackage.CURVE__XUNIT:
            return isSetXUnit();
        case CimPackage.CURVE__CURVE_DATAS:
            return isSetCurveDatas();
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
        result.append( " (curveStyle: " );
        if( curveStyleESet )
            result.append( curveStyle );
        else
            result.append( "<unset>" );
        result.append( ", y1Unit: " );
        if( y1UnitESet )
            result.append( y1Unit );
        else
            result.append( "<unset>" );
        result.append( ", y2Unit: " );
        if( y2UnitESet )
            result.append( y2Unit );
        else
            result.append( "<unset>" );
        result.append( ", xUnit: " );
        if( xUnitESet )
            result.append( xUnit );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //CurveImpl

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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Curve;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CurveData;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Curve Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.CurveDataImpl#getY1value <em>Y1value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.CurveDataImpl#getXvalue <em>Xvalue</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.CurveDataImpl#getCurve <em>Curve</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.CurveDataImpl#getY2value <em>Y2value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CurveDataImpl extends CimObjectWithIDImpl implements CurveData {
    /**
     * The default value of the '{@link #getY1value() <em>Y1value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getY1value()
     * @generated
     * @ordered
     */
    protected static final Double Y1VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getY1value() <em>Y1value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getY1value()
     * @generated
     * @ordered
     */
    protected Double y1value = Y1VALUE_EDEFAULT;

    /**
     * This is true if the Y1value attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean y1valueESet;

    /**
     * The default value of the '{@link #getXvalue() <em>Xvalue</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXvalue()
     * @generated
     * @ordered
     */
    protected static final Double XVALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getXvalue() <em>Xvalue</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXvalue()
     * @generated
     * @ordered
     */
    protected Double xvalue = XVALUE_EDEFAULT;

    /**
     * This is true if the Xvalue attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xvalueESet;

    /**
     * The cached value of the '{@link #getCurve() <em>Curve</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCurve()
     * @generated
     * @ordered
     */
    protected Curve curve;

    /**
     * This is true if the Curve reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean curveESet;

    /**
     * The default value of the '{@link #getY2value() <em>Y2value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getY2value()
     * @generated
     * @ordered
     */
    protected static final Double Y2VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getY2value() <em>Y2value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getY2value()
     * @generated
     * @ordered
     */
    protected Double y2value = Y2VALUE_EDEFAULT;

    /**
     * This is true if the Y2value attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean y2valueESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CurveDataImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getCurveData();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getXvalue() {
        return xvalue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setXvalue( Double newXvalue ) {
        Double oldXvalue = xvalue;
        xvalue = newXvalue;
        boolean oldXvalueESet = xvalueESet;
        xvalueESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CURVE_DATA__XVALUE, oldXvalue, xvalue,
                    !oldXvalueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetXvalue() {
        Double oldXvalue = xvalue;
        boolean oldXvalueESet = xvalueESet;
        xvalue = XVALUE_EDEFAULT;
        xvalueESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.CURVE_DATA__XVALUE, oldXvalue,
                    XVALUE_EDEFAULT, oldXvalueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetXvalue() {
        return xvalueESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Curve getCurve() {
        return curve;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetCurve( Curve newCurve, NotificationChain msgs ) {
        Curve oldCurve = curve;
        curve = newCurve;
        boolean oldCurveESet = curveESet;
        curveESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.CURVE_DATA__CURVE, oldCurve, newCurve, !oldCurveESet );
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
    public void setCurve( Curve newCurve ) {
        if( newCurve != curve ) {
            NotificationChain msgs = null;
            if( curve != null )
                msgs = ( ( InternalEObject ) curve ).eInverseRemove( this, CimPackage.CURVE__CURVE_DATAS, Curve.class,
                        msgs );
            if( newCurve != null )
                msgs = ( ( InternalEObject ) newCurve ).eInverseAdd( this, CimPackage.CURVE__CURVE_DATAS, Curve.class,
                        msgs );
            msgs = basicSetCurve( newCurve, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCurveESet = curveESet;
            curveESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CURVE_DATA__CURVE, newCurve,
                        newCurve, !oldCurveESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetCurve( NotificationChain msgs ) {
        Curve oldCurve = curve;
        curve = null;
        boolean oldCurveESet = curveESet;
        curveESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CURVE_DATA__CURVE, oldCurve, null, oldCurveESet );
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
    public void unsetCurve() {
        if( curve != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) curve ).eInverseRemove( this, CimPackage.CURVE__CURVE_DATAS, Curve.class,
                    msgs );
            msgs = basicUnsetCurve( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldCurveESet = curveESet;
            curveESet = false;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.CURVE_DATA__CURVE, null, null,
                        oldCurveESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCurve() {
        return curveESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getY2value() {
        return y2value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setY2value( Double newY2value ) {
        Double oldY2value = y2value;
        y2value = newY2value;
        boolean oldY2valueESet = y2valueESet;
        y2valueESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CURVE_DATA__Y2VALUE, oldY2value, y2value,
                    !oldY2valueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetY2value() {
        Double oldY2value = y2value;
        boolean oldY2valueESet = y2valueESet;
        y2value = Y2VALUE_EDEFAULT;
        y2valueESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.CURVE_DATA__Y2VALUE, oldY2value,
                    Y2VALUE_EDEFAULT, oldY2valueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetY2value() {
        return y2valueESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Double getY1value() {
        return y1value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setY1value( Double newY1value ) {
        Double oldY1value = y1value;
        y1value = newY1value;
        boolean oldY1valueESet = y1valueESet;
        y1valueESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.CURVE_DATA__Y1VALUE, oldY1value, y1value,
                    !oldY1valueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetY1value() {
        Double oldY1value = y1value;
        boolean oldY1valueESet = y1valueESet;
        y1value = Y1VALUE_EDEFAULT;
        y1valueESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.CURVE_DATA__Y1VALUE, oldY1value,
                    Y1VALUE_EDEFAULT, oldY1valueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetY1value() {
        return y1valueESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.CURVE_DATA__CURVE:
            if( curve != null )
                msgs = ( ( InternalEObject ) curve ).eInverseRemove( this, CimPackage.CURVE__CURVE_DATAS, Curve.class,
                        msgs );
            return basicSetCurve( ( Curve ) otherEnd, msgs );
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
        case CimPackage.CURVE_DATA__CURVE:
            return basicUnsetCurve( msgs );
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
        case CimPackage.CURVE_DATA__Y1VALUE:
            return getY1value();
        case CimPackage.CURVE_DATA__XVALUE:
            return getXvalue();
        case CimPackage.CURVE_DATA__CURVE:
            return getCurve();
        case CimPackage.CURVE_DATA__Y2VALUE:
            return getY2value();
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
        case CimPackage.CURVE_DATA__Y1VALUE:
            setY1value( ( Double ) newValue );
            return;
        case CimPackage.CURVE_DATA__XVALUE:
            setXvalue( ( Double ) newValue );
            return;
        case CimPackage.CURVE_DATA__CURVE:
            setCurve( ( Curve ) newValue );
            return;
        case CimPackage.CURVE_DATA__Y2VALUE:
            setY2value( ( Double ) newValue );
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
        case CimPackage.CURVE_DATA__Y1VALUE:
            unsetY1value();
            return;
        case CimPackage.CURVE_DATA__XVALUE:
            unsetXvalue();
            return;
        case CimPackage.CURVE_DATA__CURVE:
            unsetCurve();
            return;
        case CimPackage.CURVE_DATA__Y2VALUE:
            unsetY2value();
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
        case CimPackage.CURVE_DATA__Y1VALUE:
            return isSetY1value();
        case CimPackage.CURVE_DATA__XVALUE:
            return isSetXvalue();
        case CimPackage.CURVE_DATA__CURVE:
            return isSetCurve();
        case CimPackage.CURVE_DATA__Y2VALUE:
            return isSetY2value();
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
        result.append( " (y1value: " );
        if( y1valueESet )
            result.append( y1value );
        else
            result.append( "<unset>" );
        result.append( ", xvalue: " );
        if( xvalueESet )
            result.append( xvalue );
        else
            result.append( "<unset>" );
        result.append( ", y2value: " );
        if( y2valueESet )
            result.append( y2value );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //CurveDataImpl

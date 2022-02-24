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
package fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Curve</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A multi-purpose curve or functional relationship between an independent variable (X-axis) and dependent (Y-axis) variables.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Curve#getCurveStyle <em>Curve Style</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Curve#getY1Unit <em>Y1 Unit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Curve#getY2Unit <em>Y2 Unit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Curve#getXUnit <em>XUnit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Curve#getCurveDatas <em>Curve Datas</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getCurve()
 * @model
 * @generated
 */
public interface Curve extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Y1 Unit</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnitSymbol}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The Y1-axis units of measure.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Y1 Unit</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnitSymbol
     * @see #isSetY1Unit()
     * @see #unsetY1Unit()
     * @see #setY1Unit(UnitSymbol)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getCurve_Y1Unit()
     * @model unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='Curve.y1Unit' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    UnitSymbol getY1Unit();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Curve#getY1Unit <em>Y1 Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Y1 Unit</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnitSymbol
     * @see #isSetY1Unit()
     * @see #unsetY1Unit()
     * @see #getY1Unit()
     * @generated
     */
    void setY1Unit( UnitSymbol value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Curve#getY1Unit <em>Y1 Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetY1Unit()
     * @see #getY1Unit()
     * @see #setY1Unit(UnitSymbol)
     * @generated
     */
    void unsetY1Unit();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Curve#getY1Unit <em>Y1 Unit</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Y1 Unit</em>' attribute is set.
     * @see #unsetY1Unit()
     * @see #getY1Unit()
     * @see #setY1Unit(UnitSymbol)
     * @generated
     */
    boolean isSetY1Unit();

    /**
     * Returns the value of the '<em><b>XUnit</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnitSymbol}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The X-axis units of measure.
     * <!-- end-model-doc -->
     * @return the value of the '<em>XUnit</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnitSymbol
     * @see #isSetXUnit()
     * @see #unsetXUnit()
     * @see #setXUnit(UnitSymbol)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getCurve_XUnit()
     * @model unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='Curve.xUnit' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    UnitSymbol getXUnit();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Curve#getXUnit <em>XUnit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>XUnit</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnitSymbol
     * @see #isSetXUnit()
     * @see #unsetXUnit()
     * @see #getXUnit()
     * @generated
     */
    void setXUnit( UnitSymbol value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Curve#getXUnit <em>XUnit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXUnit()
     * @see #getXUnit()
     * @see #setXUnit(UnitSymbol)
     * @generated
     */
    void unsetXUnit();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Curve#getXUnit <em>XUnit</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>XUnit</em>' attribute is set.
     * @see #unsetXUnit()
     * @see #getXUnit()
     * @see #setXUnit(UnitSymbol)
     * @generated
     */
    boolean isSetXUnit();

    /**
     * Returns the value of the '<em><b>Y2 Unit</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnitSymbol}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The Y2-axis units of measure.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Y2 Unit</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnitSymbol
     * @see #isSetY2Unit()
     * @see #unsetY2Unit()
     * @see #setY2Unit(UnitSymbol)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getCurve_Y2Unit()
     * @model unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='Curve.y2Unit' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    UnitSymbol getY2Unit();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Curve#getY2Unit <em>Y2 Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Y2 Unit</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnitSymbol
     * @see #isSetY2Unit()
     * @see #unsetY2Unit()
     * @see #getY2Unit()
     * @generated
     */
    void setY2Unit( UnitSymbol value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Curve#getY2Unit <em>Y2 Unit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetY2Unit()
     * @see #getY2Unit()
     * @see #setY2Unit(UnitSymbol)
     * @generated
     */
    void unsetY2Unit();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Curve#getY2Unit <em>Y2 Unit</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Y2 Unit</em>' attribute is set.
     * @see #unsetY2Unit()
     * @see #getY2Unit()
     * @see #setY2Unit(UnitSymbol)
     * @generated
     */
    boolean isSetY2Unit();

    /**
     * Returns the value of the '<em><b>Curve Style</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CurveStyle}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The style or shape of the curve.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Curve Style</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CurveStyle
     * @see #isSetCurveStyle()
     * @see #unsetCurveStyle()
     * @see #setCurveStyle(CurveStyle)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getCurve_CurveStyle()
     * @model unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='Curve.curveStyle' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    CurveStyle getCurveStyle();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Curve#getCurveStyle <em>Curve Style</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Curve Style</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CurveStyle
     * @see #isSetCurveStyle()
     * @see #unsetCurveStyle()
     * @see #getCurveStyle()
     * @generated
     */
    void setCurveStyle( CurveStyle value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Curve#getCurveStyle <em>Curve Style</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCurveStyle()
     * @see #getCurveStyle()
     * @see #setCurveStyle(CurveStyle)
     * @generated
     */
    void unsetCurveStyle();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Curve#getCurveStyle <em>Curve Style</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Curve Style</em>' attribute is set.
     * @see #unsetCurveStyle()
     * @see #getCurveStyle()
     * @see #setCurveStyle(CurveStyle)
     * @generated
     */
    boolean isSetCurveStyle();

    /**
     * Returns the value of the '<em><b>Curve Datas</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CurveData}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CurveData#getCurve <em>Curve</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The point data values that define this curve.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Curve Datas</em>' reference list.
     * @see #isSetCurveDatas()
     * @see #unsetCurveDatas()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getCurve_CurveDatas()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CurveData#getCurve
     * @model opposite="Curve" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='Curve.CurveDatas' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< CurveData > getCurveDatas();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Curve#getCurveDatas <em>Curve Datas</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCurveDatas()
     * @see #getCurveDatas()
     * @generated
     */
    void unsetCurveDatas();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Curve#getCurveDatas <em>Curve Datas</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Curve Datas</em>' reference list is set.
     * @see #unsetCurveDatas()
     * @see #getCurveDatas()
     * @generated
     */
    boolean isSetCurveDatas();

} // Curve

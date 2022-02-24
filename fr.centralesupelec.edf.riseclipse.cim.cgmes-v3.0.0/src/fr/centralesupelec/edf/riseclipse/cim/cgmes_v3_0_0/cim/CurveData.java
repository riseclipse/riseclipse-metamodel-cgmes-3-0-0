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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Curve Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Multi-purpose data points for defining a curve.  The use of this generic class is discouraged if a more specific class can be used to specify the X and Y axis values along with their specific data types.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CurveData#getY1value <em>Y1value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CurveData#getXvalue <em>Xvalue</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CurveData#getCurve <em>Curve</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CurveData#getY2value <em>Y2value</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getCurveData()
 * @model
 * @generated
 */
public interface CurveData extends CimObjectWithID {
    /**
     * Returns the value of the '<em><b>Xvalue</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The data value of the X-axis variable,  depending on the X-axis units.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Xvalue</em>' attribute.
     * @see #isSetXvalue()
     * @see #unsetXvalue()
     * @see #setXvalue(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getCurveData_Xvalue()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='CurveData.xvalue' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getXvalue();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CurveData#getXvalue <em>Xvalue</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xvalue</em>' attribute.
     * @see #isSetXvalue()
     * @see #unsetXvalue()
     * @see #getXvalue()
     * @generated
     */
    void setXvalue( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CurveData#getXvalue <em>Xvalue</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXvalue()
     * @see #getXvalue()
     * @see #setXvalue(Double)
     * @generated
     */
    void unsetXvalue();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CurveData#getXvalue <em>Xvalue</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Xvalue</em>' attribute is set.
     * @see #unsetXvalue()
     * @see #getXvalue()
     * @see #setXvalue(Double)
     * @generated
     */
    boolean isSetXvalue();

    /**
     * Returns the value of the '<em><b>Curve</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Curve#getCurveDatas <em>Curve Datas</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The curve of  this curve data point.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Curve</em>' reference.
     * @see #isSetCurve()
     * @see #unsetCurve()
     * @see #setCurve(Curve)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getCurveData_Curve()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Curve#getCurveDatas
     * @model opposite="CurveDatas" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='CurveData.Curve' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Curve getCurve();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CurveData#getCurve <em>Curve</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Curve</em>' reference.
     * @see #isSetCurve()
     * @see #unsetCurve()
     * @see #getCurve()
     * @generated
     */
    void setCurve( Curve value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CurveData#getCurve <em>Curve</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCurve()
     * @see #getCurve()
     * @see #setCurve(Curve)
     * @generated
     */
    void unsetCurve();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CurveData#getCurve <em>Curve</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Curve</em>' reference is set.
     * @see #unsetCurve()
     * @see #getCurve()
     * @see #setCurve(Curve)
     * @generated
     */
    boolean isSetCurve();

    /**
     * Returns the value of the '<em><b>Y2value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The data value of the second Y-axis variable (if present), depending on the Y-axis units.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Y2value</em>' attribute.
     * @see #isSetY2value()
     * @see #unsetY2value()
     * @see #setY2value(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getCurveData_Y2value()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='CurveData.y2value' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getY2value();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CurveData#getY2value <em>Y2value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Y2value</em>' attribute.
     * @see #isSetY2value()
     * @see #unsetY2value()
     * @see #getY2value()
     * @generated
     */
    void setY2value( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CurveData#getY2value <em>Y2value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetY2value()
     * @see #getY2value()
     * @see #setY2value(Double)
     * @generated
     */
    void unsetY2value();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CurveData#getY2value <em>Y2value</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Y2value</em>' attribute is set.
     * @see #unsetY2value()
     * @see #getY2value()
     * @see #setY2value(Double)
     * @generated
     */
    boolean isSetY2value();

    /**
     * Returns the value of the '<em><b>Y1value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The data value of the  first Y-axis variable, depending on the Y-axis units.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Y1value</em>' attribute.
     * @see #isSetY1value()
     * @see #unsetY1value()
     * @see #setY1value(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getCurveData_Y1value()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='CurveData.y1value' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getY1value();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CurveData#getY1value <em>Y1value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Y1value</em>' attribute.
     * @see #isSetY1value()
     * @see #unsetY1value()
     * @see #getY1value()
     * @generated
     */
    void setY1value( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CurveData#getY1value <em>Y1value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetY1value()
     * @see #getY1value()
     * @see #setY1value(Double)
     * @generated
     */
    void unsetY1value();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CurveData#getY1value <em>Y1value</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Y1value</em>' attribute is set.
     * @see #unsetY1value()
     * @see #getY1value()
     * @see #setY1value(Double)
     * @generated
     */
    boolean isSetY1value();

} // CurveData

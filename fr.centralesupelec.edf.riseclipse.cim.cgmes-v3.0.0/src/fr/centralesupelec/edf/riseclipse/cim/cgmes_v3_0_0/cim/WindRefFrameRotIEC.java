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
 * A representation of the model object '<em><b>Wind Ref Frame Rot IEC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Reference frame rotation model.
 * Reference: IEC 61400-27-1:2015, 5.6.3.5.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindRefFrameRotIEC#getTpll <em>Tpll</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindRefFrameRotIEC#getUpll1 <em>Upll1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindRefFrameRotIEC#getUpll2 <em>Upll2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindRefFrameRotIEC#getWindTurbineType3or4IEC <em>Wind Turbine Type3or4 IEC</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindRefFrameRotIEC()
 * @model
 * @generated
 */
public interface WindRefFrameRotIEC extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Tpll</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time constant for PLL first order filter model (<i>T</i><i><sub>PLL</sub></i>) (&gt;= 0). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tpll</em>' attribute.
     * @see #isSetTpll()
     * @see #unsetTpll()
     * @see #setTpll(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindRefFrameRotIEC_Tpll()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='WindRefFrameRotIEC.tpll' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTpll();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindRefFrameRotIEC#getTpll <em>Tpll</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tpll</em>' attribute.
     * @see #isSetTpll()
     * @see #unsetTpll()
     * @see #getTpll()
     * @generated
     */
    void setTpll( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindRefFrameRotIEC#getTpll <em>Tpll</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTpll()
     * @see #getTpll()
     * @see #setTpll(Double)
     * @generated
     */
    void unsetTpll();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindRefFrameRotIEC#getTpll <em>Tpll</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tpll</em>' attribute is set.
     * @see #unsetTpll()
     * @see #getTpll()
     * @see #setTpll(Double)
     * @generated
     */
    boolean isSetTpll();

    /**
     * Returns the value of the '<em><b>Upll1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Voltage below which the angle of the voltage is filtered and possibly also frozen (<i>u</i><i><sub>PLL1</sub></i>). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Upll1</em>' attribute.
     * @see #isSetUpll1()
     * @see #unsetUpll1()
     * @see #setUpll1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindRefFrameRotIEC_Upll1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindRefFrameRotIEC.upll1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getUpll1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindRefFrameRotIEC#getUpll1 <em>Upll1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Upll1</em>' attribute.
     * @see #isSetUpll1()
     * @see #unsetUpll1()
     * @see #getUpll1()
     * @generated
     */
    void setUpll1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindRefFrameRotIEC#getUpll1 <em>Upll1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUpll1()
     * @see #getUpll1()
     * @see #setUpll1(Double)
     * @generated
     */
    void unsetUpll1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindRefFrameRotIEC#getUpll1 <em>Upll1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Upll1</em>' attribute is set.
     * @see #unsetUpll1()
     * @see #getUpll1()
     * @see #setUpll1(Double)
     * @generated
     */
    boolean isSetUpll1();

    /**
     * Returns the value of the '<em><b>Upll2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Voltage (<i>u</i><i><sub>PLL2</sub></i>) below which the angle of the voltage is frozen if <i>u</i><i><sub>PLL2</sub></i><sub> </sub>is smaller or equal to <i>u</i><i><sub>PLL1</sub></i> . It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Upll2</em>' attribute.
     * @see #isSetUpll2()
     * @see #unsetUpll2()
     * @see #setUpll2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindRefFrameRotIEC_Upll2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindRefFrameRotIEC.upll2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getUpll2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindRefFrameRotIEC#getUpll2 <em>Upll2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Upll2</em>' attribute.
     * @see #isSetUpll2()
     * @see #unsetUpll2()
     * @see #getUpll2()
     * @generated
     */
    void setUpll2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindRefFrameRotIEC#getUpll2 <em>Upll2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUpll2()
     * @see #getUpll2()
     * @see #setUpll2(Double)
     * @generated
     */
    void unsetUpll2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindRefFrameRotIEC#getUpll2 <em>Upll2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Upll2</em>' attribute is set.
     * @see #unsetUpll2()
     * @see #getUpll2()
     * @see #setUpll2(Double)
     * @generated
     */
    boolean isSetUpll2();

    /**
     * Returns the value of the '<em><b>Wind Turbine Type3or4 IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType3or4IEC#getWindRefFrameRotIEC <em>Wind Ref Frame Rot IEC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Wind turbine type 3 or type 4 model with which this reference frame rotation model is associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wind Turbine Type3or4 IEC</em>' reference.
     * @see #isSetWindTurbineType3or4IEC()
     * @see #unsetWindTurbineType3or4IEC()
     * @see #setWindTurbineType3or4IEC(WindTurbineType3or4IEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindRefFrameRotIEC_WindTurbineType3or4IEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType3or4IEC#getWindRefFrameRotIEC
     * @model opposite="WindRefFrameRotIEC" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='WindRefFrameRotIEC.WindTurbineType3or4IEC' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    WindTurbineType3or4IEC getWindTurbineType3or4IEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindRefFrameRotIEC#getWindTurbineType3or4IEC <em>Wind Turbine Type3or4 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Turbine Type3or4 IEC</em>' reference.
     * @see #isSetWindTurbineType3or4IEC()
     * @see #unsetWindTurbineType3or4IEC()
     * @see #getWindTurbineType3or4IEC()
     * @generated
     */
    void setWindTurbineType3or4IEC( WindTurbineType3or4IEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindRefFrameRotIEC#getWindTurbineType3or4IEC <em>Wind Turbine Type3or4 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindTurbineType3or4IEC()
     * @see #getWindTurbineType3or4IEC()
     * @see #setWindTurbineType3or4IEC(WindTurbineType3or4IEC)
     * @generated
     */
    void unsetWindTurbineType3or4IEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindRefFrameRotIEC#getWindTurbineType3or4IEC <em>Wind Turbine Type3or4 IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Turbine Type3or4 IEC</em>' reference is set.
     * @see #unsetWindTurbineType3or4IEC()
     * @see #getWindTurbineType3or4IEC()
     * @see #setWindTurbineType3or4IEC(WindTurbineType3or4IEC)
     * @generated
     */
    boolean isSetWindTurbineType3or4IEC();

} // WindRefFrameRotIEC

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
 * A representation of the model object '<em><b>Exc IEEEST5B</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * IEEE 421.5-2005 type ST5B model. The type ST5B excitation system is a variation of the type ST1A model, with alternative overexcitation and underexcitation inputs and additional limits.
 * The block diagram in the IEEE 421.5 standard has input signal <i>Vc </i>and does not indicate the summation point with <i>Vref</i>. The implementation of the ExcIEEEST5B shall consider summation point with <i>Vref</i>.
 * Reference: IEEE 421.5-2005, 7.5.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getToc1 <em>Toc1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getToc2 <em>Toc2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getTob2 <em>Tob2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getTob1 <em>Tob1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getTb2 <em>Tb2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getTb1 <em>Tb1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getTc1 <em>Tc1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getTc2 <em>Tc2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getT1 <em>T1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getKr <em>Kr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getKc <em>Kc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getVrmin <em>Vrmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getTub2 <em>Tub2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getTub1 <em>Tub1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getTuc2 <em>Tuc2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getTuc1 <em>Tuc1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getVrmax <em>Vrmax</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEST5B()
 * @model
 * @generated
 */
public interface ExcIEEEST5B extends ExcitationSystemDynamics {
    /**
     * Returns the value of the '<em><b>Toc1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * OEL lead time constant (<i>T</i><i><sub>OC1</sub></i>) (&gt;= 0).  Typical value = 0,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Toc1</em>' attribute.
     * @see #isSetToc1()
     * @see #unsetToc1()
     * @see #setToc1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEST5B_Toc1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEST5B.toc1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getToc1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getToc1 <em>Toc1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Toc1</em>' attribute.
     * @see #isSetToc1()
     * @see #unsetToc1()
     * @see #getToc1()
     * @generated
     */
    void setToc1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getToc1 <em>Toc1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetToc1()
     * @see #getToc1()
     * @see #setToc1(Double)
     * @generated
     */
    void unsetToc1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getToc1 <em>Toc1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Toc1</em>' attribute is set.
     * @see #unsetToc1()
     * @see #getToc1()
     * @see #setToc1(Double)
     * @generated
     */
    boolean isSetToc1();

    /**
     * Returns the value of the '<em><b>Toc2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * OEL lead time constant (<i>T</i><i><sub>OC2</sub></i>) (&gt;= 0).  Typical value = 0,08.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Toc2</em>' attribute.
     * @see #isSetToc2()
     * @see #unsetToc2()
     * @see #setToc2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEST5B_Toc2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEST5B.toc2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getToc2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getToc2 <em>Toc2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Toc2</em>' attribute.
     * @see #isSetToc2()
     * @see #unsetToc2()
     * @see #getToc2()
     * @generated
     */
    void setToc2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getToc2 <em>Toc2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetToc2()
     * @see #getToc2()
     * @see #setToc2(Double)
     * @generated
     */
    void unsetToc2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getToc2 <em>Toc2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Toc2</em>' attribute is set.
     * @see #unsetToc2()
     * @see #getToc2()
     * @see #setToc2(Double)
     * @generated
     */
    boolean isSetToc2();

    /**
     * Returns the value of the '<em><b>Tob2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * OEL lag time constant (<i>T</i><i><sub>OB2</sub></i>) (&gt;= 0).  Typical value = 0,08.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tob2</em>' attribute.
     * @see #isSetTob2()
     * @see #unsetTob2()
     * @see #setTob2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEST5B_Tob2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEST5B.tob2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTob2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getTob2 <em>Tob2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tob2</em>' attribute.
     * @see #isSetTob2()
     * @see #unsetTob2()
     * @see #getTob2()
     * @generated
     */
    void setTob2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getTob2 <em>Tob2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTob2()
     * @see #getTob2()
     * @see #setTob2(Double)
     * @generated
     */
    void unsetTob2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getTob2 <em>Tob2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tob2</em>' attribute is set.
     * @see #unsetTob2()
     * @see #getTob2()
     * @see #setTob2(Double)
     * @generated
     */
    boolean isSetTob2();

    /**
     * Returns the value of the '<em><b>Tob1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * OEL lag time constant (<i>T</i><i><sub>OB1</sub></i>) (&gt;= 0).  Typical value = 2.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tob1</em>' attribute.
     * @see #isSetTob1()
     * @see #unsetTob1()
     * @see #setTob1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEST5B_Tob1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEST5B.tob1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTob1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getTob1 <em>Tob1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tob1</em>' attribute.
     * @see #isSetTob1()
     * @see #unsetTob1()
     * @see #getTob1()
     * @generated
     */
    void setTob1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getTob1 <em>Tob1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTob1()
     * @see #getTob1()
     * @see #setTob1(Double)
     * @generated
     */
    void unsetTob1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getTob1 <em>Tob1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tob1</em>' attribute is set.
     * @see #unsetTob1()
     * @see #getTob1()
     * @see #setTob1(Double)
     * @generated
     */
    boolean isSetTob1();

    /**
     * Returns the value of the '<em><b>Tb2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Regulator lag time constant (<i>T</i><i><sub>B2</sub></i>) (&gt;= 0).  Typical value = 0,01.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tb2</em>' attribute.
     * @see #isSetTb2()
     * @see #unsetTb2()
     * @see #setTb2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEST5B_Tb2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEST5B.tb2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTb2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getTb2 <em>Tb2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tb2</em>' attribute.
     * @see #isSetTb2()
     * @see #unsetTb2()
     * @see #getTb2()
     * @generated
     */
    void setTb2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getTb2 <em>Tb2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTb2()
     * @see #getTb2()
     * @see #setTb2(Double)
     * @generated
     */
    void unsetTb2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getTb2 <em>Tb2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tb2</em>' attribute is set.
     * @see #unsetTb2()
     * @see #getTb2()
     * @see #setTb2(Double)
     * @generated
     */
    boolean isSetTb2();

    /**
     * Returns the value of the '<em><b>Tb1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Regulator lag time constant (<i>T</i><i><sub>B1</sub></i>) (&gt;= 0).  Typical value = 6.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tb1</em>' attribute.
     * @see #isSetTb1()
     * @see #unsetTb1()
     * @see #setTb1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEST5B_Tb1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEST5B.tb1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTb1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getTb1 <em>Tb1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tb1</em>' attribute.
     * @see #isSetTb1()
     * @see #unsetTb1()
     * @see #getTb1()
     * @generated
     */
    void setTb1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getTb1 <em>Tb1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTb1()
     * @see #getTb1()
     * @see #setTb1(Double)
     * @generated
     */
    void unsetTb1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getTb1 <em>Tb1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tb1</em>' attribute is set.
     * @see #unsetTb1()
     * @see #getTb1()
     * @see #setTb1(Double)
     * @generated
     */
    boolean isSetTb1();

    /**
     * Returns the value of the '<em><b>Tc1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Regulator lead time constant (<i>T</i><i><sub>C1</sub></i>) (&gt;= 0).  Typical value = 0,8.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tc1</em>' attribute.
     * @see #isSetTc1()
     * @see #unsetTc1()
     * @see #setTc1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEST5B_Tc1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEST5B.tc1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTc1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getTc1 <em>Tc1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tc1</em>' attribute.
     * @see #isSetTc1()
     * @see #unsetTc1()
     * @see #getTc1()
     * @generated
     */
    void setTc1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getTc1 <em>Tc1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTc1()
     * @see #getTc1()
     * @see #setTc1(Double)
     * @generated
     */
    void unsetTc1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getTc1 <em>Tc1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tc1</em>' attribute is set.
     * @see #unsetTc1()
     * @see #getTc1()
     * @see #setTc1(Double)
     * @generated
     */
    boolean isSetTc1();

    /**
     * Returns the value of the '<em><b>Tc2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Regulator lead time constant (<i>T</i><i><sub>C2</sub></i>) (&gt;= 0).  Typical value = 0,08.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tc2</em>' attribute.
     * @see #isSetTc2()
     * @see #unsetTc2()
     * @see #setTc2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEST5B_Tc2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEST5B.tc2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTc2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getTc2 <em>Tc2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tc2</em>' attribute.
     * @see #isSetTc2()
     * @see #unsetTc2()
     * @see #getTc2()
     * @generated
     */
    void setTc2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getTc2 <em>Tc2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTc2()
     * @see #getTc2()
     * @see #setTc2(Double)
     * @generated
     */
    void unsetTc2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getTc2 <em>Tc2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tc2</em>' attribute is set.
     * @see #unsetTc2()
     * @see #getTc2()
     * @see #setTc2(Double)
     * @generated
     */
    boolean isSetTc2();

    /**
     * Returns the value of the '<em><b>T1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Firing circuit time constant (<i>T1</i>) (&gt;= 0).  Typical value = 0,004.
     * <!-- end-model-doc -->
     * @return the value of the '<em>T1</em>' attribute.
     * @see #isSetT1()
     * @see #unsetT1()
     * @see #setT1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEST5B_T1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEST5B.t1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getT1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getT1 <em>T1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>T1</em>' attribute.
     * @see #isSetT1()
     * @see #unsetT1()
     * @see #getT1()
     * @generated
     */
    void setT1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getT1 <em>T1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT1()
     * @see #getT1()
     * @see #setT1(Double)
     * @generated
     */
    void unsetT1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getT1 <em>T1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>T1</em>' attribute is set.
     * @see #unsetT1()
     * @see #getT1()
     * @see #setT1(Double)
     * @generated
     */
    boolean isSetT1();

    /**
     * Returns the value of the '<em><b>Kr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Regulator gain (<i>K</i><i><sub>R</sub></i>) (&gt; 0).  Typical value = 200.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kr</em>' attribute.
     * @see #isSetKr()
     * @see #unsetKr()
     * @see #setKr(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEST5B_Kr()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEST5B.kr' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKr();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getKr <em>Kr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kr</em>' attribute.
     * @see #isSetKr()
     * @see #unsetKr()
     * @see #getKr()
     * @generated
     */
    void setKr( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getKr <em>Kr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKr()
     * @see #getKr()
     * @see #setKr(Double)
     * @generated
     */
    void unsetKr();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getKr <em>Kr</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kr</em>' attribute is set.
     * @see #unsetKr()
     * @see #getKr()
     * @see #setKr(Double)
     * @generated
     */
    boolean isSetKr();

    /**
     * Returns the value of the '<em><b>Kc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Rectifier regulation factor (<i>K</i><i><sub>C</sub></i>) (&gt;= 0).  Typical value = 0,004.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kc</em>' attribute.
     * @see #isSetKc()
     * @see #unsetKc()
     * @see #setKc(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEST5B_Kc()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEST5B.kc' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getKc <em>Kc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kc</em>' attribute.
     * @see #isSetKc()
     * @see #unsetKc()
     * @see #getKc()
     * @generated
     */
    void setKc( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getKc <em>Kc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKc()
     * @see #getKc()
     * @see #setKc(Double)
     * @generated
     */
    void unsetKc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getKc <em>Kc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kc</em>' attribute is set.
     * @see #unsetKc()
     * @see #getKc()
     * @see #setKc(Double)
     * @generated
     */
    boolean isSetKc();

    /**
     * Returns the value of the '<em><b>Vrmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum voltage regulator output (<i>V</i><i><sub>RMIN</sub></i>) (&lt; 0).  Typical value = -4.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vrmin</em>' attribute.
     * @see #isSetVrmin()
     * @see #unsetVrmin()
     * @see #setVrmin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEST5B_Vrmin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEST5B.vrmin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVrmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getVrmin <em>Vrmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vrmin</em>' attribute.
     * @see #isSetVrmin()
     * @see #unsetVrmin()
     * @see #getVrmin()
     * @generated
     */
    void setVrmin( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getVrmin <em>Vrmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVrmin()
     * @see #getVrmin()
     * @see #setVrmin(Double)
     * @generated
     */
    void unsetVrmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getVrmin <em>Vrmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vrmin</em>' attribute is set.
     * @see #unsetVrmin()
     * @see #getVrmin()
     * @see #setVrmin(Double)
     * @generated
     */
    boolean isSetVrmin();

    /**
     * Returns the value of the '<em><b>Tub2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * UEL lag time constant (<i>T</i><i><sub>UB2</sub></i>) (&gt;= 0).  Typical value = 0,05.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tub2</em>' attribute.
     * @see #isSetTub2()
     * @see #unsetTub2()
     * @see #setTub2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEST5B_Tub2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEST5B.tub2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTub2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getTub2 <em>Tub2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tub2</em>' attribute.
     * @see #isSetTub2()
     * @see #unsetTub2()
     * @see #getTub2()
     * @generated
     */
    void setTub2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getTub2 <em>Tub2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTub2()
     * @see #getTub2()
     * @see #setTub2(Double)
     * @generated
     */
    void unsetTub2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getTub2 <em>Tub2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tub2</em>' attribute is set.
     * @see #unsetTub2()
     * @see #getTub2()
     * @see #setTub2(Double)
     * @generated
     */
    boolean isSetTub2();

    /**
     * Returns the value of the '<em><b>Tub1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * UEL lag time constant (<i>T</i><i><sub>UB1</sub></i>) (&gt;= 0).  Typical value = 10.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tub1</em>' attribute.
     * @see #isSetTub1()
     * @see #unsetTub1()
     * @see #setTub1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEST5B_Tub1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEST5B.tub1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTub1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getTub1 <em>Tub1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tub1</em>' attribute.
     * @see #isSetTub1()
     * @see #unsetTub1()
     * @see #getTub1()
     * @generated
     */
    void setTub1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getTub1 <em>Tub1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTub1()
     * @see #getTub1()
     * @see #setTub1(Double)
     * @generated
     */
    void unsetTub1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getTub1 <em>Tub1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tub1</em>' attribute is set.
     * @see #unsetTub1()
     * @see #getTub1()
     * @see #setTub1(Double)
     * @generated
     */
    boolean isSetTub1();

    /**
     * Returns the value of the '<em><b>Tuc2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * UEL lead time constant (<i>T</i><i><sub>UC2</sub></i>) (&gt;= 0).  Typical value = 0,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tuc2</em>' attribute.
     * @see #isSetTuc2()
     * @see #unsetTuc2()
     * @see #setTuc2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEST5B_Tuc2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEST5B.tuc2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTuc2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getTuc2 <em>Tuc2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tuc2</em>' attribute.
     * @see #isSetTuc2()
     * @see #unsetTuc2()
     * @see #getTuc2()
     * @generated
     */
    void setTuc2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getTuc2 <em>Tuc2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTuc2()
     * @see #getTuc2()
     * @see #setTuc2(Double)
     * @generated
     */
    void unsetTuc2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getTuc2 <em>Tuc2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tuc2</em>' attribute is set.
     * @see #unsetTuc2()
     * @see #getTuc2()
     * @see #setTuc2(Double)
     * @generated
     */
    boolean isSetTuc2();

    /**
     * Returns the value of the '<em><b>Tuc1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * UEL lead time constant (<i>T</i><i><sub>UC1</sub></i>) (&gt;= 0).  Typical value = 2.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tuc1</em>' attribute.
     * @see #isSetTuc1()
     * @see #unsetTuc1()
     * @see #setTuc1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEST5B_Tuc1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEST5B.tuc1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTuc1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getTuc1 <em>Tuc1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tuc1</em>' attribute.
     * @see #isSetTuc1()
     * @see #unsetTuc1()
     * @see #getTuc1()
     * @generated
     */
    void setTuc1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getTuc1 <em>Tuc1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTuc1()
     * @see #getTuc1()
     * @see #setTuc1(Double)
     * @generated
     */
    void unsetTuc1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getTuc1 <em>Tuc1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tuc1</em>' attribute is set.
     * @see #unsetTuc1()
     * @see #getTuc1()
     * @see #setTuc1(Double)
     * @generated
     */
    boolean isSetTuc1();

    /**
     * Returns the value of the '<em><b>Vrmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum voltage regulator output (<i>V</i><i><sub>RMAX</sub></i>) (&gt; 0).  Typical value = 5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vrmax</em>' attribute.
     * @see #isSetVrmax()
     * @see #unsetVrmax()
     * @see #setVrmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEST5B_Vrmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEST5B.vrmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVrmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getVrmax <em>Vrmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vrmax</em>' attribute.
     * @see #isSetVrmax()
     * @see #unsetVrmax()
     * @see #getVrmax()
     * @generated
     */
    void setVrmax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getVrmax <em>Vrmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVrmax()
     * @see #getVrmax()
     * @see #setVrmax(Double)
     * @generated
     */
    void unsetVrmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEST5B#getVrmax <em>Vrmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vrmax</em>' attribute is set.
     * @see #unsetVrmax()
     * @see #getVrmax()
     * @see #setVrmax(Double)
     * @generated
     */
    boolean isSetVrmax();

} // ExcIEEEST5B

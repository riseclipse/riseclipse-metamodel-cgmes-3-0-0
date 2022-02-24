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
 * A representation of the model object '<em><b>Pss IEEE3B</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * IEEE 421.5-2005 type PSS3B power system stabilizer model. The PSS model PSS3B has dual inputs of electrical power and rotor angular frequency deviation. The signals are used to derive an equivalent mechanical power signal.
 * This model has 2 input signals. They have the following fixed types (expressed in terms of InputSignalKind values): the first one is of rotorAngleFrequencyDeviation type and the second one is of generatorElectricalPower type.
 * Reference: IEEE 3B 421.5-2005, 8.3.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getA5 <em>A5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getA4 <em>A4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getA3 <em>A3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getA2 <em>A2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getA8 <em>A8</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getA7 <em>A7</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getA6 <em>A6</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getA1 <em>A1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getT2 <em>T2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getT1 <em>T1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getKs2 <em>Ks2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getKs1 <em>Ks1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getVstmax <em>Vstmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getVstmin <em>Vstmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getTw3 <em>Tw3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getTw2 <em>Tw2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getTw1 <em>Tw1</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE3B()
 * @model
 * @generated
 */
public interface PssIEEE3B extends PowerSystemStabilizerDynamics {
    /**
     * Returns the value of the '<em><b>A5</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Notch filter parameter (<i>A5</i>).  Typical value = 0,001.
     * <!-- end-model-doc -->
     * @return the value of the '<em>A5</em>' attribute.
     * @see #isSetA5()
     * @see #unsetA5()
     * @see #setA5(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE3B_A5()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE3B.a5' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getA5();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getA5 <em>A5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>A5</em>' attribute.
     * @see #isSetA5()
     * @see #unsetA5()
     * @see #getA5()
     * @generated
     */
    void setA5( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getA5 <em>A5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetA5()
     * @see #getA5()
     * @see #setA5(Double)
     * @generated
     */
    void unsetA5();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getA5 <em>A5</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>A5</em>' attribute is set.
     * @see #unsetA5()
     * @see #getA5()
     * @see #setA5(Double)
     * @generated
     */
    boolean isSetA5();

    /**
     * Returns the value of the '<em><b>A4</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Notch filter parameter (<i>A4</i>).  Typical value = 0,564.
     * <!-- end-model-doc -->
     * @return the value of the '<em>A4</em>' attribute.
     * @see #isSetA4()
     * @see #unsetA4()
     * @see #setA4(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE3B_A4()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE3B.a4' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getA4();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getA4 <em>A4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>A4</em>' attribute.
     * @see #isSetA4()
     * @see #unsetA4()
     * @see #getA4()
     * @generated
     */
    void setA4( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getA4 <em>A4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetA4()
     * @see #getA4()
     * @see #setA4(Double)
     * @generated
     */
    void unsetA4();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getA4 <em>A4</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>A4</em>' attribute is set.
     * @see #unsetA4()
     * @see #getA4()
     * @see #setA4(Double)
     * @generated
     */
    boolean isSetA4();

    /**
     * Returns the value of the '<em><b>A3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Notch filter parameter (<i>A3</i>).  Typical value = 0,429.
     * <!-- end-model-doc -->
     * @return the value of the '<em>A3</em>' attribute.
     * @see #isSetA3()
     * @see #unsetA3()
     * @see #setA3(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE3B_A3()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE3B.a3' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getA3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getA3 <em>A3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>A3</em>' attribute.
     * @see #isSetA3()
     * @see #unsetA3()
     * @see #getA3()
     * @generated
     */
    void setA3( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getA3 <em>A3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetA3()
     * @see #getA3()
     * @see #setA3(Double)
     * @generated
     */
    void unsetA3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getA3 <em>A3</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>A3</em>' attribute is set.
     * @see #unsetA3()
     * @see #getA3()
     * @see #setA3(Double)
     * @generated
     */
    boolean isSetA3();

    /**
     * Returns the value of the '<em><b>A2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Notch filter parameter (<i>A2</i>).  Typical value = 0,586.
     * <!-- end-model-doc -->
     * @return the value of the '<em>A2</em>' attribute.
     * @see #isSetA2()
     * @see #unsetA2()
     * @see #setA2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE3B_A2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE3B.a2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getA2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getA2 <em>A2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>A2</em>' attribute.
     * @see #isSetA2()
     * @see #unsetA2()
     * @see #getA2()
     * @generated
     */
    void setA2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getA2 <em>A2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetA2()
     * @see #getA2()
     * @see #setA2(Double)
     * @generated
     */
    void unsetA2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getA2 <em>A2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>A2</em>' attribute is set.
     * @see #unsetA2()
     * @see #getA2()
     * @see #setA2(Double)
     * @generated
     */
    boolean isSetA2();

    /**
     * Returns the value of the '<em><b>A8</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Notch filter parameter (<i>A8</i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>A8</em>' attribute.
     * @see #isSetA8()
     * @see #unsetA8()
     * @see #setA8(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE3B_A8()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE3B.a8' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getA8();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getA8 <em>A8</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>A8</em>' attribute.
     * @see #isSetA8()
     * @see #unsetA8()
     * @see #getA8()
     * @generated
     */
    void setA8( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getA8 <em>A8</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetA8()
     * @see #getA8()
     * @see #setA8(Double)
     * @generated
     */
    void unsetA8();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getA8 <em>A8</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>A8</em>' attribute is set.
     * @see #unsetA8()
     * @see #getA8()
     * @see #setA8(Double)
     * @generated
     */
    boolean isSetA8();

    /**
     * Returns the value of the '<em><b>A7</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Notch filter parameter (<i>A7</i>).  Typical value = 0,031.
     * <!-- end-model-doc -->
     * @return the value of the '<em>A7</em>' attribute.
     * @see #isSetA7()
     * @see #unsetA7()
     * @see #setA7(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE3B_A7()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE3B.a7' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getA7();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getA7 <em>A7</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>A7</em>' attribute.
     * @see #isSetA7()
     * @see #unsetA7()
     * @see #getA7()
     * @generated
     */
    void setA7( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getA7 <em>A7</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetA7()
     * @see #getA7()
     * @see #setA7(Double)
     * @generated
     */
    void unsetA7();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getA7 <em>A7</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>A7</em>' attribute is set.
     * @see #unsetA7()
     * @see #getA7()
     * @see #setA7(Double)
     * @generated
     */
    boolean isSetA7();

    /**
     * Returns the value of the '<em><b>A6</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Notch filter parameter (<i>A6</i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>A6</em>' attribute.
     * @see #isSetA6()
     * @see #unsetA6()
     * @see #setA6(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE3B_A6()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE3B.a6' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getA6();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getA6 <em>A6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>A6</em>' attribute.
     * @see #isSetA6()
     * @see #unsetA6()
     * @see #getA6()
     * @generated
     */
    void setA6( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getA6 <em>A6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetA6()
     * @see #getA6()
     * @see #setA6(Double)
     * @generated
     */
    void unsetA6();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getA6 <em>A6</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>A6</em>' attribute is set.
     * @see #unsetA6()
     * @see #getA6()
     * @see #setA6(Double)
     * @generated
     */
    boolean isSetA6();

    /**
     * Returns the value of the '<em><b>A1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Notch filter parameter (<i>A1</i>).  Typical value = 0,359.
     * <!-- end-model-doc -->
     * @return the value of the '<em>A1</em>' attribute.
     * @see #isSetA1()
     * @see #unsetA1()
     * @see #setA1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE3B_A1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE3B.a1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getA1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getA1 <em>A1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>A1</em>' attribute.
     * @see #isSetA1()
     * @see #unsetA1()
     * @see #getA1()
     * @generated
     */
    void setA1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getA1 <em>A1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetA1()
     * @see #getA1()
     * @see #setA1(Double)
     * @generated
     */
    void unsetA1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getA1 <em>A1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>A1</em>' attribute is set.
     * @see #unsetA1()
     * @see #getA1()
     * @see #setA1(Double)
     * @generated
     */
    boolean isSetA1();

    /**
     * Returns the value of the '<em><b>T2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Transducer time constant (<i>T2</i>) (&gt;= 0).  Typical value = 0,012.
     * <!-- end-model-doc -->
     * @return the value of the '<em>T2</em>' attribute.
     * @see #isSetT2()
     * @see #unsetT2()
     * @see #setT2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE3B_T2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE3B.t2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getT2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getT2 <em>T2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>T2</em>' attribute.
     * @see #isSetT2()
     * @see #unsetT2()
     * @see #getT2()
     * @generated
     */
    void setT2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getT2 <em>T2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT2()
     * @see #getT2()
     * @see #setT2(Double)
     * @generated
     */
    void unsetT2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getT2 <em>T2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>T2</em>' attribute is set.
     * @see #unsetT2()
     * @see #getT2()
     * @see #setT2(Double)
     * @generated
     */
    boolean isSetT2();

    /**
     * Returns the value of the '<em><b>T1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Transducer time constant (<i>T1</i>) (&gt;= 0).  Typical value = 0,012.
     * <!-- end-model-doc -->
     * @return the value of the '<em>T1</em>' attribute.
     * @see #isSetT1()
     * @see #unsetT1()
     * @see #setT1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE3B_T1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE3B.t1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getT1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getT1 <em>T1</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getT1 <em>T1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT1()
     * @see #getT1()
     * @see #setT1(Double)
     * @generated
     */
    void unsetT1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getT1 <em>T1</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Ks2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Gain on signal # 2 (<i>Ks2</i>).  Typical value = 30,12.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ks2</em>' attribute.
     * @see #isSetKs2()
     * @see #unsetKs2()
     * @see #setKs2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE3B_Ks2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE3B.ks2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKs2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getKs2 <em>Ks2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ks2</em>' attribute.
     * @see #isSetKs2()
     * @see #unsetKs2()
     * @see #getKs2()
     * @generated
     */
    void setKs2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getKs2 <em>Ks2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKs2()
     * @see #getKs2()
     * @see #setKs2(Double)
     * @generated
     */
    void unsetKs2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getKs2 <em>Ks2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ks2</em>' attribute is set.
     * @see #unsetKs2()
     * @see #getKs2()
     * @see #setKs2(Double)
     * @generated
     */
    boolean isSetKs2();

    /**
     * Returns the value of the '<em><b>Ks1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Gain on signal # 1 (<i>Ks1</i>).  Typical value = -0,602.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ks1</em>' attribute.
     * @see #isSetKs1()
     * @see #unsetKs1()
     * @see #setKs1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE3B_Ks1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE3B.ks1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKs1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getKs1 <em>Ks1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ks1</em>' attribute.
     * @see #isSetKs1()
     * @see #unsetKs1()
     * @see #getKs1()
     * @generated
     */
    void setKs1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getKs1 <em>Ks1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKs1()
     * @see #getKs1()
     * @see #setKs1(Double)
     * @generated
     */
    void unsetKs1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getKs1 <em>Ks1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ks1</em>' attribute is set.
     * @see #unsetKs1()
     * @see #getKs1()
     * @see #setKs1(Double)
     * @generated
     */
    boolean isSetKs1();

    /**
     * Returns the value of the '<em><b>Vstmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Stabilizer output maximum limit (<i>Vstmax</i>) (&gt; PssIEEE3B.vstmin).  Typical value = 0,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vstmax</em>' attribute.
     * @see #isSetVstmax()
     * @see #unsetVstmax()
     * @see #setVstmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE3B_Vstmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE3B.vstmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVstmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getVstmax <em>Vstmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vstmax</em>' attribute.
     * @see #isSetVstmax()
     * @see #unsetVstmax()
     * @see #getVstmax()
     * @generated
     */
    void setVstmax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getVstmax <em>Vstmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVstmax()
     * @see #getVstmax()
     * @see #setVstmax(Double)
     * @generated
     */
    void unsetVstmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getVstmax <em>Vstmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vstmax</em>' attribute is set.
     * @see #unsetVstmax()
     * @see #getVstmax()
     * @see #setVstmax(Double)
     * @generated
     */
    boolean isSetVstmax();

    /**
     * Returns the value of the '<em><b>Vstmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Stabilizer output minimum limit (<i>Vstmin</i>) (&lt; PssIEEE3B.vstmax).  Typical value = -0,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vstmin</em>' attribute.
     * @see #isSetVstmin()
     * @see #unsetVstmin()
     * @see #setVstmin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE3B_Vstmin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE3B.vstmin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVstmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getVstmin <em>Vstmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vstmin</em>' attribute.
     * @see #isSetVstmin()
     * @see #unsetVstmin()
     * @see #getVstmin()
     * @generated
     */
    void setVstmin( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getVstmin <em>Vstmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVstmin()
     * @see #getVstmin()
     * @see #setVstmin(Double)
     * @generated
     */
    void unsetVstmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getVstmin <em>Vstmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vstmin</em>' attribute is set.
     * @see #unsetVstmin()
     * @see #getVstmin()
     * @see #setVstmin(Double)
     * @generated
     */
    boolean isSetVstmin();

    /**
     * Returns the value of the '<em><b>Tw3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Washout time constant (<i>Tw3</i>) (&gt;= 0).  Typical value = 0,6.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tw3</em>' attribute.
     * @see #isSetTw3()
     * @see #unsetTw3()
     * @see #setTw3(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE3B_Tw3()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE3B.tw3' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTw3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getTw3 <em>Tw3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tw3</em>' attribute.
     * @see #isSetTw3()
     * @see #unsetTw3()
     * @see #getTw3()
     * @generated
     */
    void setTw3( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getTw3 <em>Tw3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTw3()
     * @see #getTw3()
     * @see #setTw3(Double)
     * @generated
     */
    void unsetTw3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getTw3 <em>Tw3</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tw3</em>' attribute is set.
     * @see #unsetTw3()
     * @see #getTw3()
     * @see #setTw3(Double)
     * @generated
     */
    boolean isSetTw3();

    /**
     * Returns the value of the '<em><b>Tw2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Washout time constant (<i>Tw2</i>) (&gt;= 0).  Typical value = 0,3.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tw2</em>' attribute.
     * @see #isSetTw2()
     * @see #unsetTw2()
     * @see #setTw2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE3B_Tw2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE3B.tw2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTw2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getTw2 <em>Tw2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tw2</em>' attribute.
     * @see #isSetTw2()
     * @see #unsetTw2()
     * @see #getTw2()
     * @generated
     */
    void setTw2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getTw2 <em>Tw2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTw2()
     * @see #getTw2()
     * @see #setTw2(Double)
     * @generated
     */
    void unsetTw2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getTw2 <em>Tw2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tw2</em>' attribute is set.
     * @see #unsetTw2()
     * @see #getTw2()
     * @see #setTw2(Double)
     * @generated
     */
    boolean isSetTw2();

    /**
     * Returns the value of the '<em><b>Tw1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Washout time constant (<i>Tw1</i>) (&gt;= 0).  Typical value = 0,3.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tw1</em>' attribute.
     * @see #isSetTw1()
     * @see #unsetTw1()
     * @see #setTw1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE3B_Tw1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE3B.tw1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTw1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getTw1 <em>Tw1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tw1</em>' attribute.
     * @see #isSetTw1()
     * @see #unsetTw1()
     * @see #getTw1()
     * @generated
     */
    void setTw1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getTw1 <em>Tw1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTw1()
     * @see #getTw1()
     * @see #setTw1(Double)
     * @generated
     */
    void unsetTw1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE3B#getTw1 <em>Tw1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tw1</em>' attribute is set.
     * @see #unsetTw1()
     * @see #getTw1()
     * @see #setTw1(Double)
     * @generated
     */
    boolean isSetTw1();

} // PssIEEE3B

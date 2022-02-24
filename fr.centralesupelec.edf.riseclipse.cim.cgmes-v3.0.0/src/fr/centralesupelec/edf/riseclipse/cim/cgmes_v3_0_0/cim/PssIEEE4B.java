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
 * A representation of the model object '<em><b>Pss IEEE4B</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * IEEE 421.5-2005 type PSS4B power system stabilizer. The PSS4B model represents a structure based on multiple working frequency bands. Three separate bands, respectively dedicated to the low-, intermediate- and high-frequency modes of oscillations, are used in this delta omega (speed input) PSS.
 * There is an error in the in IEEE 421.5-2005 PSS4B model: the <i>Pe</i> input should read –<i>Pe</i>. This implies that the input <i>Pe</i> needs to be multiplied by -1.
 * Reference: IEEE 4B 421.5-2005, 8.4.
 * Parameter details:
 * This model has 2 input signals. They have the following fixed types (expressed in terms of InputSignalKind values): the first one is of rotorAngleFrequencyDeviation type and the second one is of generatorElectricalPower type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getBwl1 <em>Bwl1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getBwl2 <em>Bwl2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getVhmax <em>Vhmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getBwh1 <em>Bwh1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getBwh2 <em>Bwh2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getVhmin <em>Vhmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTl10 <em>Tl10</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTl11 <em>Tl11</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTl12 <em>Tl12</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getKi17 <em>Ki17</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getKi11 <em>Ki11</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getOmeganl1 <em>Omeganl1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getOmeganl2 <em>Omeganl2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getKh17 <em>Kh17</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getKh11 <em>Kh11</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getVimax <em>Vimax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getVimin <em>Vimin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTi10 <em>Ti10</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTi11 <em>Ti11</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTi12 <em>Ti12</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getVlmin <em>Vlmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getOmeganh1 <em>Omeganh1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getOmeganh2 <em>Omeganh2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getVstmin <em>Vstmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTh11 <em>Th11</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTh12 <em>Th12</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getKh1 <em>Kh1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getKh2 <em>Kh2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTh10 <em>Th10</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getKi1 <em>Ki1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getKi2 <em>Ki2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getVlmax <em>Vlmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getKl1 <em>Kl1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getKl2 <em>Kl2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTh1 <em>Th1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTh2 <em>Th2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTh3 <em>Th3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTi1 <em>Ti1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTi2 <em>Ti2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTi3 <em>Ti3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTi4 <em>Ti4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTh4 <em>Th4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTh5 <em>Th5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTh6 <em>Th6</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTh7 <em>Th7</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTh8 <em>Th8</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTh9 <em>Th9</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTi5 <em>Ti5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTi6 <em>Ti6</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTi7 <em>Ti7</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTi8 <em>Ti8</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTi9 <em>Ti9</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTl1 <em>Tl1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTl2 <em>Tl2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTl3 <em>Tl3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTl4 <em>Tl4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTl5 <em>Tl5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTl6 <em>Tl6</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTl7 <em>Tl7</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTl8 <em>Tl8</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTl9 <em>Tl9</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getKl11 <em>Kl11</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getKl17 <em>Kl17</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getKh <em>Kh</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getKi <em>Ki</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getKl <em>Kl</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getVstmax <em>Vstmax</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B()
 * @model
 * @generated
 */
public interface PssIEEE4B extends PowerSystemStabilizerDynamics {
    /**
     * Returns the value of the '<em><b>Bwl1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Notch filter 1 (low-frequency band): three dB bandwidth (<i>B</i><i><sub>wi</sub></i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Bwl1</em>' attribute.
     * @see #isSetBwl1()
     * @see #unsetBwl1()
     * @see #setBwl1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Bwl1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.bwl1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getBwl1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getBwl1 <em>Bwl1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bwl1</em>' attribute.
     * @see #isSetBwl1()
     * @see #unsetBwl1()
     * @see #getBwl1()
     * @generated
     */
    void setBwl1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getBwl1 <em>Bwl1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBwl1()
     * @see #getBwl1()
     * @see #setBwl1(Double)
     * @generated
     */
    void unsetBwl1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getBwl1 <em>Bwl1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Bwl1</em>' attribute is set.
     * @see #unsetBwl1()
     * @see #getBwl1()
     * @see #setBwl1(Double)
     * @generated
     */
    boolean isSetBwl1();

    /**
     * Returns the value of the '<em><b>Bwl2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Notch filter 2 (low-frequency band): three dB bandwidth (<i>B</i><i><sub>wi</sub></i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Bwl2</em>' attribute.
     * @see #isSetBwl2()
     * @see #unsetBwl2()
     * @see #setBwl2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Bwl2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.bwl2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getBwl2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getBwl2 <em>Bwl2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bwl2</em>' attribute.
     * @see #isSetBwl2()
     * @see #unsetBwl2()
     * @see #getBwl2()
     * @generated
     */
    void setBwl2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getBwl2 <em>Bwl2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBwl2()
     * @see #getBwl2()
     * @see #setBwl2(Double)
     * @generated
     */
    void unsetBwl2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getBwl2 <em>Bwl2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Bwl2</em>' attribute is set.
     * @see #unsetBwl2()
     * @see #getBwl2()
     * @see #setBwl2(Double)
     * @generated
     */
    boolean isSetBwl2();

    /**
     * Returns the value of the '<em><b>Vhmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * High band output maximum limit (<i>V</i><i><sub>Hmax</sub></i>) (&gt; PssIEEE4B.vhmin).  Typical value = 0,6.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vhmax</em>' attribute.
     * @see #isSetVhmax()
     * @see #unsetVhmax()
     * @see #setVhmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Vhmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.vhmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVhmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getVhmax <em>Vhmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vhmax</em>' attribute.
     * @see #isSetVhmax()
     * @see #unsetVhmax()
     * @see #getVhmax()
     * @generated
     */
    void setVhmax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getVhmax <em>Vhmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVhmax()
     * @see #getVhmax()
     * @see #setVhmax(Double)
     * @generated
     */
    void unsetVhmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getVhmax <em>Vhmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vhmax</em>' attribute is set.
     * @see #unsetVhmax()
     * @see #getVhmax()
     * @see #setVhmax(Double)
     * @generated
     */
    boolean isSetVhmax();

    /**
     * Returns the value of the '<em><b>Bwh1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Notch filter 1 (high-frequency band): three dB bandwidth (<i>B</i><i><sub>wi</sub></i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Bwh1</em>' attribute.
     * @see #isSetBwh1()
     * @see #unsetBwh1()
     * @see #setBwh1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Bwh1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.bwh1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getBwh1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getBwh1 <em>Bwh1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bwh1</em>' attribute.
     * @see #isSetBwh1()
     * @see #unsetBwh1()
     * @see #getBwh1()
     * @generated
     */
    void setBwh1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getBwh1 <em>Bwh1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBwh1()
     * @see #getBwh1()
     * @see #setBwh1(Double)
     * @generated
     */
    void unsetBwh1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getBwh1 <em>Bwh1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Bwh1</em>' attribute is set.
     * @see #unsetBwh1()
     * @see #getBwh1()
     * @see #setBwh1(Double)
     * @generated
     */
    boolean isSetBwh1();

    /**
     * Returns the value of the '<em><b>Bwh2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Notch filter 2 (high-frequency band): three dB bandwidth (<i>B</i><i><sub>wi</sub></i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Bwh2</em>' attribute.
     * @see #isSetBwh2()
     * @see #unsetBwh2()
     * @see #setBwh2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Bwh2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.bwh2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getBwh2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getBwh2 <em>Bwh2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bwh2</em>' attribute.
     * @see #isSetBwh2()
     * @see #unsetBwh2()
     * @see #getBwh2()
     * @generated
     */
    void setBwh2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getBwh2 <em>Bwh2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBwh2()
     * @see #getBwh2()
     * @see #setBwh2(Double)
     * @generated
     */
    void unsetBwh2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getBwh2 <em>Bwh2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Bwh2</em>' attribute is set.
     * @see #unsetBwh2()
     * @see #getBwh2()
     * @see #setBwh2(Double)
     * @generated
     */
    boolean isSetBwh2();

    /**
     * Returns the value of the '<em><b>Vhmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * High band output minimum limit (<i>V</i><i><sub>Hmin</sub></i>) (&lt; PssIEEE4V.vhmax).  Typical value = -0,6.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vhmin</em>' attribute.
     * @see #isSetVhmin()
     * @see #unsetVhmin()
     * @see #setVhmin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Vhmin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.vhmin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVhmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getVhmin <em>Vhmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vhmin</em>' attribute.
     * @see #isSetVhmin()
     * @see #unsetVhmin()
     * @see #getVhmin()
     * @generated
     */
    void setVhmin( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getVhmin <em>Vhmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVhmin()
     * @see #getVhmin()
     * @see #setVhmin(Double)
     * @generated
     */
    void unsetVhmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getVhmin <em>Vhmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vhmin</em>' attribute is set.
     * @see #unsetVhmin()
     * @see #getVhmin()
     * @see #setVhmin(Double)
     * @generated
     */
    boolean isSetVhmin();

    /**
     * Returns the value of the '<em><b>Tl10</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Low band time constant (<i>T</i><i><sub>L10</sub></i>) (&gt;= 0).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tl10</em>' attribute.
     * @see #isSetTl10()
     * @see #unsetTl10()
     * @see #setTl10(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Tl10()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.tl10' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTl10();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTl10 <em>Tl10</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tl10</em>' attribute.
     * @see #isSetTl10()
     * @see #unsetTl10()
     * @see #getTl10()
     * @generated
     */
    void setTl10( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTl10 <em>Tl10</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTl10()
     * @see #getTl10()
     * @see #setTl10(Double)
     * @generated
     */
    void unsetTl10();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTl10 <em>Tl10</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tl10</em>' attribute is set.
     * @see #unsetTl10()
     * @see #getTl10()
     * @see #setTl10(Double)
     * @generated
     */
    boolean isSetTl10();

    /**
     * Returns the value of the '<em><b>Tl11</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Low band time constant (<i>T</i><i><sub>L11</sub></i>) (&gt;= 0).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tl11</em>' attribute.
     * @see #isSetTl11()
     * @see #unsetTl11()
     * @see #setTl11(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Tl11()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.tl11' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTl11();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTl11 <em>Tl11</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tl11</em>' attribute.
     * @see #isSetTl11()
     * @see #unsetTl11()
     * @see #getTl11()
     * @generated
     */
    void setTl11( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTl11 <em>Tl11</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTl11()
     * @see #getTl11()
     * @see #setTl11(Double)
     * @generated
     */
    void unsetTl11();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTl11 <em>Tl11</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tl11</em>' attribute is set.
     * @see #unsetTl11()
     * @see #getTl11()
     * @see #setTl11(Double)
     * @generated
     */
    boolean isSetTl11();

    /**
     * Returns the value of the '<em><b>Tl12</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Low band time constant (<i>T</i><i><sub>L12</sub></i>) (&gt;= 0).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tl12</em>' attribute.
     * @see #isSetTl12()
     * @see #unsetTl12()
     * @see #setTl12(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Tl12()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.tl12' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTl12();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTl12 <em>Tl12</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tl12</em>' attribute.
     * @see #isSetTl12()
     * @see #unsetTl12()
     * @see #getTl12()
     * @generated
     */
    void setTl12( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTl12 <em>Tl12</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTl12()
     * @see #getTl12()
     * @see #setTl12(Double)
     * @generated
     */
    void unsetTl12();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTl12 <em>Tl12</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tl12</em>' attribute is set.
     * @see #unsetTl12()
     * @see #getTl12()
     * @see #setTl12(Double)
     * @generated
     */
    boolean isSetTl12();

    /**
     * Returns the value of the '<em><b>Ki17</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Intermediate band first lead-lag blocks coefficient (<i>K</i><i><sub>I17</sub></i>).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ki17</em>' attribute.
     * @see #isSetKi17()
     * @see #unsetKi17()
     * @see #setKi17(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Ki17()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.ki17' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKi17();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getKi17 <em>Ki17</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ki17</em>' attribute.
     * @see #isSetKi17()
     * @see #unsetKi17()
     * @see #getKi17()
     * @generated
     */
    void setKi17( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getKi17 <em>Ki17</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKi17()
     * @see #getKi17()
     * @see #setKi17(Double)
     * @generated
     */
    void unsetKi17();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getKi17 <em>Ki17</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ki17</em>' attribute is set.
     * @see #unsetKi17()
     * @see #getKi17()
     * @see #setKi17(Double)
     * @generated
     */
    boolean isSetKi17();

    /**
     * Returns the value of the '<em><b>Ki11</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Intermediate band first lead-lag blocks coefficient (<i>K</i><i><sub>I11</sub></i>).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ki11</em>' attribute.
     * @see #isSetKi11()
     * @see #unsetKi11()
     * @see #setKi11(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Ki11()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.ki11' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKi11();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getKi11 <em>Ki11</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ki11</em>' attribute.
     * @see #isSetKi11()
     * @see #unsetKi11()
     * @see #getKi11()
     * @generated
     */
    void setKi11( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getKi11 <em>Ki11</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKi11()
     * @see #getKi11()
     * @see #setKi11(Double)
     * @generated
     */
    void unsetKi11();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getKi11 <em>Ki11</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ki11</em>' attribute is set.
     * @see #unsetKi11()
     * @see #getKi11()
     * @see #setKi11(Double)
     * @generated
     */
    boolean isSetKi11();

    /**
     * Returns the value of the '<em><b>Omeganl1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Notch filter 1 (low-frequency band): filter frequency (<i>omega</i><i><sub>ni</sub></i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Omeganl1</em>' attribute.
     * @see #isSetOmeganl1()
     * @see #unsetOmeganl1()
     * @see #setOmeganl1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Omeganl1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.omeganl1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getOmeganl1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getOmeganl1 <em>Omeganl1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Omeganl1</em>' attribute.
     * @see #isSetOmeganl1()
     * @see #unsetOmeganl1()
     * @see #getOmeganl1()
     * @generated
     */
    void setOmeganl1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getOmeganl1 <em>Omeganl1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOmeganl1()
     * @see #getOmeganl1()
     * @see #setOmeganl1(Double)
     * @generated
     */
    void unsetOmeganl1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getOmeganl1 <em>Omeganl1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Omeganl1</em>' attribute is set.
     * @see #unsetOmeganl1()
     * @see #getOmeganl1()
     * @see #setOmeganl1(Double)
     * @generated
     */
    boolean isSetOmeganl1();

    /**
     * Returns the value of the '<em><b>Omeganl2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Notch filter 2 (low-frequency band): filter frequency (<i>omega</i><i><sub>ni</sub></i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Omeganl2</em>' attribute.
     * @see #isSetOmeganl2()
     * @see #unsetOmeganl2()
     * @see #setOmeganl2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Omeganl2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.omeganl2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getOmeganl2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getOmeganl2 <em>Omeganl2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Omeganl2</em>' attribute.
     * @see #isSetOmeganl2()
     * @see #unsetOmeganl2()
     * @see #getOmeganl2()
     * @generated
     */
    void setOmeganl2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getOmeganl2 <em>Omeganl2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOmeganl2()
     * @see #getOmeganl2()
     * @see #setOmeganl2(Double)
     * @generated
     */
    void unsetOmeganl2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getOmeganl2 <em>Omeganl2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Omeganl2</em>' attribute is set.
     * @see #unsetOmeganl2()
     * @see #getOmeganl2()
     * @see #setOmeganl2(Double)
     * @generated
     */
    boolean isSetOmeganl2();

    /**
     * Returns the value of the '<em><b>Kh17</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * High band first lead-lag blocks coefficient (<i>K</i><i><sub>H17</sub></i>).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kh17</em>' attribute.
     * @see #isSetKh17()
     * @see #unsetKh17()
     * @see #setKh17(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Kh17()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.kh17' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKh17();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getKh17 <em>Kh17</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kh17</em>' attribute.
     * @see #isSetKh17()
     * @see #unsetKh17()
     * @see #getKh17()
     * @generated
     */
    void setKh17( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getKh17 <em>Kh17</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKh17()
     * @see #getKh17()
     * @see #setKh17(Double)
     * @generated
     */
    void unsetKh17();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getKh17 <em>Kh17</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kh17</em>' attribute is set.
     * @see #unsetKh17()
     * @see #getKh17()
     * @see #setKh17(Double)
     * @generated
     */
    boolean isSetKh17();

    /**
     * Returns the value of the '<em><b>Kh11</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * High band first lead-lag blocks coefficient (<i>K</i><i><sub>H11</sub></i>).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kh11</em>' attribute.
     * @see #isSetKh11()
     * @see #unsetKh11()
     * @see #setKh11(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Kh11()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.kh11' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKh11();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getKh11 <em>Kh11</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kh11</em>' attribute.
     * @see #isSetKh11()
     * @see #unsetKh11()
     * @see #getKh11()
     * @generated
     */
    void setKh11( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getKh11 <em>Kh11</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKh11()
     * @see #getKh11()
     * @see #setKh11(Double)
     * @generated
     */
    void unsetKh11();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getKh11 <em>Kh11</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kh11</em>' attribute is set.
     * @see #unsetKh11()
     * @see #getKh11()
     * @see #setKh11(Double)
     * @generated
     */
    boolean isSetKh11();

    /**
     * Returns the value of the '<em><b>Vimax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Intermediate band output maximum limit (<i>V</i><i><sub>Imax</sub></i>) (&gt; PssIEEE4B.vimin).  Typical value = 0,6.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vimax</em>' attribute.
     * @see #isSetVimax()
     * @see #unsetVimax()
     * @see #setVimax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Vimax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.vimax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVimax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getVimax <em>Vimax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vimax</em>' attribute.
     * @see #isSetVimax()
     * @see #unsetVimax()
     * @see #getVimax()
     * @generated
     */
    void setVimax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getVimax <em>Vimax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVimax()
     * @see #getVimax()
     * @see #setVimax(Double)
     * @generated
     */
    void unsetVimax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getVimax <em>Vimax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vimax</em>' attribute is set.
     * @see #unsetVimax()
     * @see #getVimax()
     * @see #setVimax(Double)
     * @generated
     */
    boolean isSetVimax();

    /**
     * Returns the value of the '<em><b>Vimin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Intermediate band output minimum limit (<i>V</i><i><sub>Imin</sub></i>) (&lt; PssIEEE4B.vimax).  Typical value = -0,6.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vimin</em>' attribute.
     * @see #isSetVimin()
     * @see #unsetVimin()
     * @see #setVimin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Vimin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.vimin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVimin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getVimin <em>Vimin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vimin</em>' attribute.
     * @see #isSetVimin()
     * @see #unsetVimin()
     * @see #getVimin()
     * @generated
     */
    void setVimin( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getVimin <em>Vimin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVimin()
     * @see #getVimin()
     * @see #setVimin(Double)
     * @generated
     */
    void unsetVimin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getVimin <em>Vimin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vimin</em>' attribute is set.
     * @see #unsetVimin()
     * @see #getVimin()
     * @see #setVimin(Double)
     * @generated
     */
    boolean isSetVimin();

    /**
     * Returns the value of the '<em><b>Ti10</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Intermediate band time constant (<i>T</i><i><sub>I10</sub></i>) (&gt;= 0).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ti10</em>' attribute.
     * @see #isSetTi10()
     * @see #unsetTi10()
     * @see #setTi10(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Ti10()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.ti10' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTi10();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTi10 <em>Ti10</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ti10</em>' attribute.
     * @see #isSetTi10()
     * @see #unsetTi10()
     * @see #getTi10()
     * @generated
     */
    void setTi10( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTi10 <em>Ti10</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTi10()
     * @see #getTi10()
     * @see #setTi10(Double)
     * @generated
     */
    void unsetTi10();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTi10 <em>Ti10</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ti10</em>' attribute is set.
     * @see #unsetTi10()
     * @see #getTi10()
     * @see #setTi10(Double)
     * @generated
     */
    boolean isSetTi10();

    /**
     * Returns the value of the '<em><b>Ti11</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Intermediate band time constant (<i>T</i><i><sub>I11</sub></i>) (&gt;= 0).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ti11</em>' attribute.
     * @see #isSetTi11()
     * @see #unsetTi11()
     * @see #setTi11(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Ti11()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.ti11' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTi11();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTi11 <em>Ti11</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ti11</em>' attribute.
     * @see #isSetTi11()
     * @see #unsetTi11()
     * @see #getTi11()
     * @generated
     */
    void setTi11( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTi11 <em>Ti11</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTi11()
     * @see #getTi11()
     * @see #setTi11(Double)
     * @generated
     */
    void unsetTi11();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTi11 <em>Ti11</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ti11</em>' attribute is set.
     * @see #unsetTi11()
     * @see #getTi11()
     * @see #setTi11(Double)
     * @generated
     */
    boolean isSetTi11();

    /**
     * Returns the value of the '<em><b>Ti12</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Intermediate band time constant (<i>T</i><i><sub>I12</sub></i>) (&gt;= 0).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ti12</em>' attribute.
     * @see #isSetTi12()
     * @see #unsetTi12()
     * @see #setTi12(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Ti12()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.ti12' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTi12();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTi12 <em>Ti12</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ti12</em>' attribute.
     * @see #isSetTi12()
     * @see #unsetTi12()
     * @see #getTi12()
     * @generated
     */
    void setTi12( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTi12 <em>Ti12</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTi12()
     * @see #getTi12()
     * @see #setTi12(Double)
     * @generated
     */
    void unsetTi12();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTi12 <em>Ti12</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ti12</em>' attribute is set.
     * @see #unsetTi12()
     * @see #getTi12()
     * @see #setTi12(Double)
     * @generated
     */
    boolean isSetTi12();

    /**
     * Returns the value of the '<em><b>Vlmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Low band output minimum limit (<i>V</i><i><sub>Lmin</sub></i>) (&lt; PssIEEE4B.vlmax).  Typical value = -0,075.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vlmin</em>' attribute.
     * @see #isSetVlmin()
     * @see #unsetVlmin()
     * @see #setVlmin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Vlmin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.vlmin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVlmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getVlmin <em>Vlmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vlmin</em>' attribute.
     * @see #isSetVlmin()
     * @see #unsetVlmin()
     * @see #getVlmin()
     * @generated
     */
    void setVlmin( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getVlmin <em>Vlmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVlmin()
     * @see #getVlmin()
     * @see #setVlmin(Double)
     * @generated
     */
    void unsetVlmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getVlmin <em>Vlmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vlmin</em>' attribute is set.
     * @see #unsetVlmin()
     * @see #getVlmin()
     * @see #setVlmin(Double)
     * @generated
     */
    boolean isSetVlmin();

    /**
     * Returns the value of the '<em><b>Omeganh1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Notch filter 1 (high-frequency band): filter frequency (<i>omega</i><i><sub>ni</sub></i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Omeganh1</em>' attribute.
     * @see #isSetOmeganh1()
     * @see #unsetOmeganh1()
     * @see #setOmeganh1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Omeganh1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.omeganh1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getOmeganh1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getOmeganh1 <em>Omeganh1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Omeganh1</em>' attribute.
     * @see #isSetOmeganh1()
     * @see #unsetOmeganh1()
     * @see #getOmeganh1()
     * @generated
     */
    void setOmeganh1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getOmeganh1 <em>Omeganh1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOmeganh1()
     * @see #getOmeganh1()
     * @see #setOmeganh1(Double)
     * @generated
     */
    void unsetOmeganh1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getOmeganh1 <em>Omeganh1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Omeganh1</em>' attribute is set.
     * @see #unsetOmeganh1()
     * @see #getOmeganh1()
     * @see #setOmeganh1(Double)
     * @generated
     */
    boolean isSetOmeganh1();

    /**
     * Returns the value of the '<em><b>Omeganh2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Notch filter 2 (high-frequency band): filter frequency (<i>omega</i><i><sub>ni</sub></i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Omeganh2</em>' attribute.
     * @see #isSetOmeganh2()
     * @see #unsetOmeganh2()
     * @see #setOmeganh2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Omeganh2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.omeganh2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getOmeganh2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getOmeganh2 <em>Omeganh2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Omeganh2</em>' attribute.
     * @see #isSetOmeganh2()
     * @see #unsetOmeganh2()
     * @see #getOmeganh2()
     * @generated
     */
    void setOmeganh2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getOmeganh2 <em>Omeganh2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOmeganh2()
     * @see #getOmeganh2()
     * @see #setOmeganh2(Double)
     * @generated
     */
    void unsetOmeganh2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getOmeganh2 <em>Omeganh2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Omeganh2</em>' attribute is set.
     * @see #unsetOmeganh2()
     * @see #getOmeganh2()
     * @see #setOmeganh2(Double)
     * @generated
     */
    boolean isSetOmeganh2();

    /**
     * Returns the value of the '<em><b>Vstmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * PSS output minimum limit (<i>V</i><i><sub>STmin</sub></i>) (&lt; PssIEEE4B.vstmax).  Typical value = -0,15.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vstmin</em>' attribute.
     * @see #isSetVstmin()
     * @see #unsetVstmin()
     * @see #setVstmin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Vstmin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.vstmin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVstmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getVstmin <em>Vstmin</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getVstmin <em>Vstmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVstmin()
     * @see #getVstmin()
     * @see #setVstmin(Double)
     * @generated
     */
    void unsetVstmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getVstmin <em>Vstmin</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Th11</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * High band time constant (<i>T</i><i><sub>H11</sub></i>) (&gt;= 0).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Th11</em>' attribute.
     * @see #isSetTh11()
     * @see #unsetTh11()
     * @see #setTh11(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Th11()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.th11' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTh11();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTh11 <em>Th11</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Th11</em>' attribute.
     * @see #isSetTh11()
     * @see #unsetTh11()
     * @see #getTh11()
     * @generated
     */
    void setTh11( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTh11 <em>Th11</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTh11()
     * @see #getTh11()
     * @see #setTh11(Double)
     * @generated
     */
    void unsetTh11();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTh11 <em>Th11</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Th11</em>' attribute is set.
     * @see #unsetTh11()
     * @see #getTh11()
     * @see #setTh11(Double)
     * @generated
     */
    boolean isSetTh11();

    /**
     * Returns the value of the '<em><b>Th12</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * High band time constant (<i>T</i><i><sub>H12</sub></i>) (&gt;= 0).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Th12</em>' attribute.
     * @see #isSetTh12()
     * @see #unsetTh12()
     * @see #setTh12(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Th12()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.th12' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTh12();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTh12 <em>Th12</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Th12</em>' attribute.
     * @see #isSetTh12()
     * @see #unsetTh12()
     * @see #getTh12()
     * @generated
     */
    void setTh12( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTh12 <em>Th12</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTh12()
     * @see #getTh12()
     * @see #setTh12(Double)
     * @generated
     */
    void unsetTh12();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTh12 <em>Th12</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Th12</em>' attribute is set.
     * @see #unsetTh12()
     * @see #getTh12()
     * @see #setTh12(Double)
     * @generated
     */
    boolean isSetTh12();

    /**
     * Returns the value of the '<em><b>Kh1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * High band differential filter gain (<i>K</i><i><sub>H1</sub></i>).  Typical value = 66.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kh1</em>' attribute.
     * @see #isSetKh1()
     * @see #unsetKh1()
     * @see #setKh1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Kh1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.kh1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKh1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getKh1 <em>Kh1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kh1</em>' attribute.
     * @see #isSetKh1()
     * @see #unsetKh1()
     * @see #getKh1()
     * @generated
     */
    void setKh1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getKh1 <em>Kh1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKh1()
     * @see #getKh1()
     * @see #setKh1(Double)
     * @generated
     */
    void unsetKh1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getKh1 <em>Kh1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kh1</em>' attribute is set.
     * @see #unsetKh1()
     * @see #getKh1()
     * @see #setKh1(Double)
     * @generated
     */
    boolean isSetKh1();

    /**
     * Returns the value of the '<em><b>Kh2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * High band differential filter gain (<i>K</i><i><sub>H2</sub></i>).  Typical value = 66.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kh2</em>' attribute.
     * @see #isSetKh2()
     * @see #unsetKh2()
     * @see #setKh2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Kh2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.kh2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKh2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getKh2 <em>Kh2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kh2</em>' attribute.
     * @see #isSetKh2()
     * @see #unsetKh2()
     * @see #getKh2()
     * @generated
     */
    void setKh2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getKh2 <em>Kh2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKh2()
     * @see #getKh2()
     * @see #setKh2(Double)
     * @generated
     */
    void unsetKh2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getKh2 <em>Kh2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kh2</em>' attribute is set.
     * @see #unsetKh2()
     * @see #getKh2()
     * @see #setKh2(Double)
     * @generated
     */
    boolean isSetKh2();

    /**
     * Returns the value of the '<em><b>Th10</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * High band time constant (<i>T</i><i><sub>H10</sub></i>) (&gt;= 0).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Th10</em>' attribute.
     * @see #isSetTh10()
     * @see #unsetTh10()
     * @see #setTh10(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Th10()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.th10' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTh10();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTh10 <em>Th10</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Th10</em>' attribute.
     * @see #isSetTh10()
     * @see #unsetTh10()
     * @see #getTh10()
     * @generated
     */
    void setTh10( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTh10 <em>Th10</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTh10()
     * @see #getTh10()
     * @see #setTh10(Double)
     * @generated
     */
    void unsetTh10();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTh10 <em>Th10</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Th10</em>' attribute is set.
     * @see #unsetTh10()
     * @see #getTh10()
     * @see #setTh10(Double)
     * @generated
     */
    boolean isSetTh10();

    /**
     * Returns the value of the '<em><b>Ki1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Intermediate band differential filter gain (<i>K</i><i><sub>I1</sub></i>).  Typical value = 66.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ki1</em>' attribute.
     * @see #isSetKi1()
     * @see #unsetKi1()
     * @see #setKi1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Ki1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.ki1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKi1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getKi1 <em>Ki1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ki1</em>' attribute.
     * @see #isSetKi1()
     * @see #unsetKi1()
     * @see #getKi1()
     * @generated
     */
    void setKi1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getKi1 <em>Ki1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKi1()
     * @see #getKi1()
     * @see #setKi1(Double)
     * @generated
     */
    void unsetKi1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getKi1 <em>Ki1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ki1</em>' attribute is set.
     * @see #unsetKi1()
     * @see #getKi1()
     * @see #setKi1(Double)
     * @generated
     */
    boolean isSetKi1();

    /**
     * Returns the value of the '<em><b>Ki2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Intermediate band differential filter gain (<i>K</i><i><sub>I2</sub></i>).  Typical value = 66.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ki2</em>' attribute.
     * @see #isSetKi2()
     * @see #unsetKi2()
     * @see #setKi2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Ki2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.ki2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKi2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getKi2 <em>Ki2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ki2</em>' attribute.
     * @see #isSetKi2()
     * @see #unsetKi2()
     * @see #getKi2()
     * @generated
     */
    void setKi2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getKi2 <em>Ki2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKi2()
     * @see #getKi2()
     * @see #setKi2(Double)
     * @generated
     */
    void unsetKi2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getKi2 <em>Ki2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ki2</em>' attribute is set.
     * @see #unsetKi2()
     * @see #getKi2()
     * @see #setKi2(Double)
     * @generated
     */
    boolean isSetKi2();

    /**
     * Returns the value of the '<em><b>Vlmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Low band output maximum limit (<i>V</i><i><sub>Lmax</sub></i>) (&gt; PssIEEE4B.vlmin).  Typical value = 0,075.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vlmax</em>' attribute.
     * @see #isSetVlmax()
     * @see #unsetVlmax()
     * @see #setVlmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Vlmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.vlmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVlmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getVlmax <em>Vlmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vlmax</em>' attribute.
     * @see #isSetVlmax()
     * @see #unsetVlmax()
     * @see #getVlmax()
     * @generated
     */
    void setVlmax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getVlmax <em>Vlmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVlmax()
     * @see #getVlmax()
     * @see #setVlmax(Double)
     * @generated
     */
    void unsetVlmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getVlmax <em>Vlmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vlmax</em>' attribute is set.
     * @see #unsetVlmax()
     * @see #getVlmax()
     * @see #setVlmax(Double)
     * @generated
     */
    boolean isSetVlmax();

    /**
     * Returns the value of the '<em><b>Kl1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Low band differential filter gain (<i>K</i><i><sub>L1</sub></i>).  Typical value = 66.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kl1</em>' attribute.
     * @see #isSetKl1()
     * @see #unsetKl1()
     * @see #setKl1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Kl1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.kl1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKl1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getKl1 <em>Kl1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kl1</em>' attribute.
     * @see #isSetKl1()
     * @see #unsetKl1()
     * @see #getKl1()
     * @generated
     */
    void setKl1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getKl1 <em>Kl1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKl1()
     * @see #getKl1()
     * @see #setKl1(Double)
     * @generated
     */
    void unsetKl1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getKl1 <em>Kl1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kl1</em>' attribute is set.
     * @see #unsetKl1()
     * @see #getKl1()
     * @see #setKl1(Double)
     * @generated
     */
    boolean isSetKl1();

    /**
     * Returns the value of the '<em><b>Kl2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Low band differential filter gain (<i>K</i><i><sub>L2</sub></i>).  Typical value = 66.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kl2</em>' attribute.
     * @see #isSetKl2()
     * @see #unsetKl2()
     * @see #setKl2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Kl2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.kl2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKl2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getKl2 <em>Kl2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kl2</em>' attribute.
     * @see #isSetKl2()
     * @see #unsetKl2()
     * @see #getKl2()
     * @generated
     */
    void setKl2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getKl2 <em>Kl2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKl2()
     * @see #getKl2()
     * @see #setKl2(Double)
     * @generated
     */
    void unsetKl2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getKl2 <em>Kl2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kl2</em>' attribute is set.
     * @see #unsetKl2()
     * @see #getKl2()
     * @see #setKl2(Double)
     * @generated
     */
    boolean isSetKl2();

    /**
     * Returns the value of the '<em><b>Th1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * High band time constant (<i>T</i><i><sub>H1</sub></i>) (&gt;= 0).  Typical value = 0,01513.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Th1</em>' attribute.
     * @see #isSetTh1()
     * @see #unsetTh1()
     * @see #setTh1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Th1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.th1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTh1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTh1 <em>Th1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Th1</em>' attribute.
     * @see #isSetTh1()
     * @see #unsetTh1()
     * @see #getTh1()
     * @generated
     */
    void setTh1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTh1 <em>Th1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTh1()
     * @see #getTh1()
     * @see #setTh1(Double)
     * @generated
     */
    void unsetTh1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTh1 <em>Th1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Th1</em>' attribute is set.
     * @see #unsetTh1()
     * @see #getTh1()
     * @see #setTh1(Double)
     * @generated
     */
    boolean isSetTh1();

    /**
     * Returns the value of the '<em><b>Th2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * High band time constant (<i>T</i><i><sub>H2</sub></i>) (&gt;= 0).  Typical value = 0,01816.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Th2</em>' attribute.
     * @see #isSetTh2()
     * @see #unsetTh2()
     * @see #setTh2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Th2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.th2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTh2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTh2 <em>Th2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Th2</em>' attribute.
     * @see #isSetTh2()
     * @see #unsetTh2()
     * @see #getTh2()
     * @generated
     */
    void setTh2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTh2 <em>Th2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTh2()
     * @see #getTh2()
     * @see #setTh2(Double)
     * @generated
     */
    void unsetTh2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTh2 <em>Th2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Th2</em>' attribute is set.
     * @see #unsetTh2()
     * @see #getTh2()
     * @see #setTh2(Double)
     * @generated
     */
    boolean isSetTh2();

    /**
     * Returns the value of the '<em><b>Th3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * High band time constant (<i>T</i><i><sub>H3</sub></i>) (&gt;= 0).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Th3</em>' attribute.
     * @see #isSetTh3()
     * @see #unsetTh3()
     * @see #setTh3(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Th3()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.th3' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTh3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTh3 <em>Th3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Th3</em>' attribute.
     * @see #isSetTh3()
     * @see #unsetTh3()
     * @see #getTh3()
     * @generated
     */
    void setTh3( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTh3 <em>Th3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTh3()
     * @see #getTh3()
     * @see #setTh3(Double)
     * @generated
     */
    void unsetTh3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTh3 <em>Th3</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Th3</em>' attribute is set.
     * @see #unsetTh3()
     * @see #getTh3()
     * @see #setTh3(Double)
     * @generated
     */
    boolean isSetTh3();

    /**
     * Returns the value of the '<em><b>Ti1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Intermediate band time constant (<i>T</i><i><sub>I1</sub></i>) (&gt;= 0).  Typical value = 0,173.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ti1</em>' attribute.
     * @see #isSetTi1()
     * @see #unsetTi1()
     * @see #setTi1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Ti1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.ti1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTi1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTi1 <em>Ti1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ti1</em>' attribute.
     * @see #isSetTi1()
     * @see #unsetTi1()
     * @see #getTi1()
     * @generated
     */
    void setTi1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTi1 <em>Ti1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTi1()
     * @see #getTi1()
     * @see #setTi1(Double)
     * @generated
     */
    void unsetTi1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTi1 <em>Ti1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ti1</em>' attribute is set.
     * @see #unsetTi1()
     * @see #getTi1()
     * @see #setTi1(Double)
     * @generated
     */
    boolean isSetTi1();

    /**
     * Returns the value of the '<em><b>Ti2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Intermediate band time constant (<i>T</i><i><sub>I2</sub></i>) (&gt;= 0).  Typical value = 0,2075.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ti2</em>' attribute.
     * @see #isSetTi2()
     * @see #unsetTi2()
     * @see #setTi2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Ti2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.ti2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTi2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTi2 <em>Ti2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ti2</em>' attribute.
     * @see #isSetTi2()
     * @see #unsetTi2()
     * @see #getTi2()
     * @generated
     */
    void setTi2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTi2 <em>Ti2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTi2()
     * @see #getTi2()
     * @see #setTi2(Double)
     * @generated
     */
    void unsetTi2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTi2 <em>Ti2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ti2</em>' attribute is set.
     * @see #unsetTi2()
     * @see #getTi2()
     * @see #setTi2(Double)
     * @generated
     */
    boolean isSetTi2();

    /**
     * Returns the value of the '<em><b>Ti3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Intermediate band time constant (<i>T</i><i><sub>I3</sub></i>) (&gt;= 0).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ti3</em>' attribute.
     * @see #isSetTi3()
     * @see #unsetTi3()
     * @see #setTi3(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Ti3()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.ti3' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTi3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTi3 <em>Ti3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ti3</em>' attribute.
     * @see #isSetTi3()
     * @see #unsetTi3()
     * @see #getTi3()
     * @generated
     */
    void setTi3( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTi3 <em>Ti3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTi3()
     * @see #getTi3()
     * @see #setTi3(Double)
     * @generated
     */
    void unsetTi3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTi3 <em>Ti3</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ti3</em>' attribute is set.
     * @see #unsetTi3()
     * @see #getTi3()
     * @see #setTi3(Double)
     * @generated
     */
    boolean isSetTi3();

    /**
     * Returns the value of the '<em><b>Ti4</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Intermediate band time constant (<i>T</i><i><sub>I4</sub></i>) (&gt;= 0).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ti4</em>' attribute.
     * @see #isSetTi4()
     * @see #unsetTi4()
     * @see #setTi4(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Ti4()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.ti4' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTi4();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTi4 <em>Ti4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ti4</em>' attribute.
     * @see #isSetTi4()
     * @see #unsetTi4()
     * @see #getTi4()
     * @generated
     */
    void setTi4( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTi4 <em>Ti4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTi4()
     * @see #getTi4()
     * @see #setTi4(Double)
     * @generated
     */
    void unsetTi4();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTi4 <em>Ti4</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ti4</em>' attribute is set.
     * @see #unsetTi4()
     * @see #getTi4()
     * @see #setTi4(Double)
     * @generated
     */
    boolean isSetTi4();

    /**
     * Returns the value of the '<em><b>Th4</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * High band time constant (<i>T</i><i><sub>H4</sub></i>) (&gt;= 0).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Th4</em>' attribute.
     * @see #isSetTh4()
     * @see #unsetTh4()
     * @see #setTh4(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Th4()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.th4' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTh4();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTh4 <em>Th4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Th4</em>' attribute.
     * @see #isSetTh4()
     * @see #unsetTh4()
     * @see #getTh4()
     * @generated
     */
    void setTh4( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTh4 <em>Th4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTh4()
     * @see #getTh4()
     * @see #setTh4(Double)
     * @generated
     */
    void unsetTh4();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTh4 <em>Th4</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Th4</em>' attribute is set.
     * @see #unsetTh4()
     * @see #getTh4()
     * @see #setTh4(Double)
     * @generated
     */
    boolean isSetTh4();

    /**
     * Returns the value of the '<em><b>Th5</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * High band time constant (<i>T</i><i><sub>H5</sub></i>) (&gt;= 0).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Th5</em>' attribute.
     * @see #isSetTh5()
     * @see #unsetTh5()
     * @see #setTh5(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Th5()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.th5' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTh5();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTh5 <em>Th5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Th5</em>' attribute.
     * @see #isSetTh5()
     * @see #unsetTh5()
     * @see #getTh5()
     * @generated
     */
    void setTh5( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTh5 <em>Th5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTh5()
     * @see #getTh5()
     * @see #setTh5(Double)
     * @generated
     */
    void unsetTh5();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTh5 <em>Th5</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Th5</em>' attribute is set.
     * @see #unsetTh5()
     * @see #getTh5()
     * @see #setTh5(Double)
     * @generated
     */
    boolean isSetTh5();

    /**
     * Returns the value of the '<em><b>Th6</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * High band time constant (<i>T</i><i><sub>H6</sub></i>) (&gt;= 0).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Th6</em>' attribute.
     * @see #isSetTh6()
     * @see #unsetTh6()
     * @see #setTh6(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Th6()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.th6' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTh6();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTh6 <em>Th6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Th6</em>' attribute.
     * @see #isSetTh6()
     * @see #unsetTh6()
     * @see #getTh6()
     * @generated
     */
    void setTh6( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTh6 <em>Th6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTh6()
     * @see #getTh6()
     * @see #setTh6(Double)
     * @generated
     */
    void unsetTh6();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTh6 <em>Th6</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Th6</em>' attribute is set.
     * @see #unsetTh6()
     * @see #getTh6()
     * @see #setTh6(Double)
     * @generated
     */
    boolean isSetTh6();

    /**
     * Returns the value of the '<em><b>Th7</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * High band time constant (<i>T</i><i><sub>H7</sub></i>) (&gt;= 0).  Typical value = 0,01816.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Th7</em>' attribute.
     * @see #isSetTh7()
     * @see #unsetTh7()
     * @see #setTh7(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Th7()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.th7' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTh7();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTh7 <em>Th7</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Th7</em>' attribute.
     * @see #isSetTh7()
     * @see #unsetTh7()
     * @see #getTh7()
     * @generated
     */
    void setTh7( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTh7 <em>Th7</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTh7()
     * @see #getTh7()
     * @see #setTh7(Double)
     * @generated
     */
    void unsetTh7();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTh7 <em>Th7</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Th7</em>' attribute is set.
     * @see #unsetTh7()
     * @see #getTh7()
     * @see #setTh7(Double)
     * @generated
     */
    boolean isSetTh7();

    /**
     * Returns the value of the '<em><b>Th8</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * High band time constant (<i>T</i><i><sub>H8</sub></i>) (&gt;= 0).  Typical value = 0,02179.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Th8</em>' attribute.
     * @see #isSetTh8()
     * @see #unsetTh8()
     * @see #setTh8(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Th8()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.th8' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTh8();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTh8 <em>Th8</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Th8</em>' attribute.
     * @see #isSetTh8()
     * @see #unsetTh8()
     * @see #getTh8()
     * @generated
     */
    void setTh8( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTh8 <em>Th8</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTh8()
     * @see #getTh8()
     * @see #setTh8(Double)
     * @generated
     */
    void unsetTh8();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTh8 <em>Th8</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Th8</em>' attribute is set.
     * @see #unsetTh8()
     * @see #getTh8()
     * @see #setTh8(Double)
     * @generated
     */
    boolean isSetTh8();

    /**
     * Returns the value of the '<em><b>Th9</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * High band time constant (<i>T</i><i><sub>H9</sub></i>) (&gt;= 0).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Th9</em>' attribute.
     * @see #isSetTh9()
     * @see #unsetTh9()
     * @see #setTh9(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Th9()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.th9' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTh9();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTh9 <em>Th9</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Th9</em>' attribute.
     * @see #isSetTh9()
     * @see #unsetTh9()
     * @see #getTh9()
     * @generated
     */
    void setTh9( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTh9 <em>Th9</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTh9()
     * @see #getTh9()
     * @see #setTh9(Double)
     * @generated
     */
    void unsetTh9();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTh9 <em>Th9</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Th9</em>' attribute is set.
     * @see #unsetTh9()
     * @see #getTh9()
     * @see #setTh9(Double)
     * @generated
     */
    boolean isSetTh9();

    /**
     * Returns the value of the '<em><b>Ti5</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Intermediate band time constant (<i>T</i><i><sub>I5</sub></i>) (&gt;= 0).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ti5</em>' attribute.
     * @see #isSetTi5()
     * @see #unsetTi5()
     * @see #setTi5(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Ti5()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.ti5' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTi5();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTi5 <em>Ti5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ti5</em>' attribute.
     * @see #isSetTi5()
     * @see #unsetTi5()
     * @see #getTi5()
     * @generated
     */
    void setTi5( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTi5 <em>Ti5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTi5()
     * @see #getTi5()
     * @see #setTi5(Double)
     * @generated
     */
    void unsetTi5();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTi5 <em>Ti5</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ti5</em>' attribute is set.
     * @see #unsetTi5()
     * @see #getTi5()
     * @see #setTi5(Double)
     * @generated
     */
    boolean isSetTi5();

    /**
     * Returns the value of the '<em><b>Ti6</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Intermediate band time constant (<i>T</i><i><sub>I6</sub></i>) (&gt;= 0).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ti6</em>' attribute.
     * @see #isSetTi6()
     * @see #unsetTi6()
     * @see #setTi6(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Ti6()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.ti6' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTi6();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTi6 <em>Ti6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ti6</em>' attribute.
     * @see #isSetTi6()
     * @see #unsetTi6()
     * @see #getTi6()
     * @generated
     */
    void setTi6( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTi6 <em>Ti6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTi6()
     * @see #getTi6()
     * @see #setTi6(Double)
     * @generated
     */
    void unsetTi6();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTi6 <em>Ti6</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ti6</em>' attribute is set.
     * @see #unsetTi6()
     * @see #getTi6()
     * @see #setTi6(Double)
     * @generated
     */
    boolean isSetTi6();

    /**
     * Returns the value of the '<em><b>Ti7</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Intermediate band time constant (<i>T</i><i><sub>I7</sub></i>) (&gt;= 0).  Typical value = 0,2075.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ti7</em>' attribute.
     * @see #isSetTi7()
     * @see #unsetTi7()
     * @see #setTi7(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Ti7()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.ti7' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTi7();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTi7 <em>Ti7</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ti7</em>' attribute.
     * @see #isSetTi7()
     * @see #unsetTi7()
     * @see #getTi7()
     * @generated
     */
    void setTi7( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTi7 <em>Ti7</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTi7()
     * @see #getTi7()
     * @see #setTi7(Double)
     * @generated
     */
    void unsetTi7();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTi7 <em>Ti7</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ti7</em>' attribute is set.
     * @see #unsetTi7()
     * @see #getTi7()
     * @see #setTi7(Double)
     * @generated
     */
    boolean isSetTi7();

    /**
     * Returns the value of the '<em><b>Ti8</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Intermediate band time constant (<i>T</i><i><sub>I8</sub></i>) (&gt;= 0).  Typical value = 0,2491.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ti8</em>' attribute.
     * @see #isSetTi8()
     * @see #unsetTi8()
     * @see #setTi8(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Ti8()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.ti8' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTi8();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTi8 <em>Ti8</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ti8</em>' attribute.
     * @see #isSetTi8()
     * @see #unsetTi8()
     * @see #getTi8()
     * @generated
     */
    void setTi8( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTi8 <em>Ti8</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTi8()
     * @see #getTi8()
     * @see #setTi8(Double)
     * @generated
     */
    void unsetTi8();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTi8 <em>Ti8</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ti8</em>' attribute is set.
     * @see #unsetTi8()
     * @see #getTi8()
     * @see #setTi8(Double)
     * @generated
     */
    boolean isSetTi8();

    /**
     * Returns the value of the '<em><b>Ti9</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Intermediate band time constant (<i>T</i><i><sub>I9</sub></i>) (&gt;= 0).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ti9</em>' attribute.
     * @see #isSetTi9()
     * @see #unsetTi9()
     * @see #setTi9(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Ti9()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.ti9' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTi9();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTi9 <em>Ti9</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ti9</em>' attribute.
     * @see #isSetTi9()
     * @see #unsetTi9()
     * @see #getTi9()
     * @generated
     */
    void setTi9( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTi9 <em>Ti9</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTi9()
     * @see #getTi9()
     * @see #setTi9(Double)
     * @generated
     */
    void unsetTi9();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTi9 <em>Ti9</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ti9</em>' attribute is set.
     * @see #unsetTi9()
     * @see #getTi9()
     * @see #setTi9(Double)
     * @generated
     */
    boolean isSetTi9();

    /**
     * Returns the value of the '<em><b>Tl1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Low band time constant (<i>T</i><i><sub>L1</sub></i>) (&gt;= 0).  Typical value = 1,73.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tl1</em>' attribute.
     * @see #isSetTl1()
     * @see #unsetTl1()
     * @see #setTl1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Tl1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.tl1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTl1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTl1 <em>Tl1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tl1</em>' attribute.
     * @see #isSetTl1()
     * @see #unsetTl1()
     * @see #getTl1()
     * @generated
     */
    void setTl1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTl1 <em>Tl1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTl1()
     * @see #getTl1()
     * @see #setTl1(Double)
     * @generated
     */
    void unsetTl1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTl1 <em>Tl1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tl1</em>' attribute is set.
     * @see #unsetTl1()
     * @see #getTl1()
     * @see #setTl1(Double)
     * @generated
     */
    boolean isSetTl1();

    /**
     * Returns the value of the '<em><b>Tl2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Low band time constant (<i>T</i><i><sub>L2</sub></i>) (&gt;= 0).  Typical value = 2,075.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tl2</em>' attribute.
     * @see #isSetTl2()
     * @see #unsetTl2()
     * @see #setTl2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Tl2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.tl2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTl2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTl2 <em>Tl2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tl2</em>' attribute.
     * @see #isSetTl2()
     * @see #unsetTl2()
     * @see #getTl2()
     * @generated
     */
    void setTl2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTl2 <em>Tl2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTl2()
     * @see #getTl2()
     * @see #setTl2(Double)
     * @generated
     */
    void unsetTl2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTl2 <em>Tl2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tl2</em>' attribute is set.
     * @see #unsetTl2()
     * @see #getTl2()
     * @see #setTl2(Double)
     * @generated
     */
    boolean isSetTl2();

    /**
     * Returns the value of the '<em><b>Tl3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Low band time constant (<i>T</i><i><sub>L3</sub></i>) (&gt;= 0).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tl3</em>' attribute.
     * @see #isSetTl3()
     * @see #unsetTl3()
     * @see #setTl3(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Tl3()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.tl3' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTl3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTl3 <em>Tl3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tl3</em>' attribute.
     * @see #isSetTl3()
     * @see #unsetTl3()
     * @see #getTl3()
     * @generated
     */
    void setTl3( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTl3 <em>Tl3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTl3()
     * @see #getTl3()
     * @see #setTl3(Double)
     * @generated
     */
    void unsetTl3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTl3 <em>Tl3</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tl3</em>' attribute is set.
     * @see #unsetTl3()
     * @see #getTl3()
     * @see #setTl3(Double)
     * @generated
     */
    boolean isSetTl3();

    /**
     * Returns the value of the '<em><b>Tl4</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Low band time constant (<i>T</i><i><sub>L4</sub></i>) (&gt;= 0).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tl4</em>' attribute.
     * @see #isSetTl4()
     * @see #unsetTl4()
     * @see #setTl4(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Tl4()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.tl4' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTl4();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTl4 <em>Tl4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tl4</em>' attribute.
     * @see #isSetTl4()
     * @see #unsetTl4()
     * @see #getTl4()
     * @generated
     */
    void setTl4( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTl4 <em>Tl4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTl4()
     * @see #getTl4()
     * @see #setTl4(Double)
     * @generated
     */
    void unsetTl4();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTl4 <em>Tl4</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tl4</em>' attribute is set.
     * @see #unsetTl4()
     * @see #getTl4()
     * @see #setTl4(Double)
     * @generated
     */
    boolean isSetTl4();

    /**
     * Returns the value of the '<em><b>Tl5</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Low band time constant (<i>T</i><i><sub>L5</sub></i>) (&gt;= 0).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tl5</em>' attribute.
     * @see #isSetTl5()
     * @see #unsetTl5()
     * @see #setTl5(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Tl5()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.tl5' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTl5();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTl5 <em>Tl5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tl5</em>' attribute.
     * @see #isSetTl5()
     * @see #unsetTl5()
     * @see #getTl5()
     * @generated
     */
    void setTl5( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTl5 <em>Tl5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTl5()
     * @see #getTl5()
     * @see #setTl5(Double)
     * @generated
     */
    void unsetTl5();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTl5 <em>Tl5</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tl5</em>' attribute is set.
     * @see #unsetTl5()
     * @see #getTl5()
     * @see #setTl5(Double)
     * @generated
     */
    boolean isSetTl5();

    /**
     * Returns the value of the '<em><b>Tl6</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Low band time constant (<i>T</i><i><sub>L6</sub></i>) (&gt;= 0).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tl6</em>' attribute.
     * @see #isSetTl6()
     * @see #unsetTl6()
     * @see #setTl6(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Tl6()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.tl6' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTl6();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTl6 <em>Tl6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tl6</em>' attribute.
     * @see #isSetTl6()
     * @see #unsetTl6()
     * @see #getTl6()
     * @generated
     */
    void setTl6( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTl6 <em>Tl6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTl6()
     * @see #getTl6()
     * @see #setTl6(Double)
     * @generated
     */
    void unsetTl6();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTl6 <em>Tl6</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tl6</em>' attribute is set.
     * @see #unsetTl6()
     * @see #getTl6()
     * @see #setTl6(Double)
     * @generated
     */
    boolean isSetTl6();

    /**
     * Returns the value of the '<em><b>Tl7</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Low band time constant (<i>T</i><i><sub>L7</sub></i>) (&gt;= 0).  Typical value = 2,075.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tl7</em>' attribute.
     * @see #isSetTl7()
     * @see #unsetTl7()
     * @see #setTl7(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Tl7()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.tl7' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTl7();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTl7 <em>Tl7</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tl7</em>' attribute.
     * @see #isSetTl7()
     * @see #unsetTl7()
     * @see #getTl7()
     * @generated
     */
    void setTl7( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTl7 <em>Tl7</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTl7()
     * @see #getTl7()
     * @see #setTl7(Double)
     * @generated
     */
    void unsetTl7();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTl7 <em>Tl7</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tl7</em>' attribute is set.
     * @see #unsetTl7()
     * @see #getTl7()
     * @see #setTl7(Double)
     * @generated
     */
    boolean isSetTl7();

    /**
     * Returns the value of the '<em><b>Tl8</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Low band time constant (<i>T</i><i><sub>L8</sub></i>) (&gt;= 0).  Typical value = 2,491.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tl8</em>' attribute.
     * @see #isSetTl8()
     * @see #unsetTl8()
     * @see #setTl8(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Tl8()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.tl8' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTl8();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTl8 <em>Tl8</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tl8</em>' attribute.
     * @see #isSetTl8()
     * @see #unsetTl8()
     * @see #getTl8()
     * @generated
     */
    void setTl8( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTl8 <em>Tl8</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTl8()
     * @see #getTl8()
     * @see #setTl8(Double)
     * @generated
     */
    void unsetTl8();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTl8 <em>Tl8</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tl8</em>' attribute is set.
     * @see #unsetTl8()
     * @see #getTl8()
     * @see #setTl8(Double)
     * @generated
     */
    boolean isSetTl8();

    /**
     * Returns the value of the '<em><b>Tl9</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Low band time constant (<i>T</i><i><sub>L9</sub></i>) (&gt;= 0).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tl9</em>' attribute.
     * @see #isSetTl9()
     * @see #unsetTl9()
     * @see #setTl9(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Tl9()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.tl9' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTl9();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTl9 <em>Tl9</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tl9</em>' attribute.
     * @see #isSetTl9()
     * @see #unsetTl9()
     * @see #getTl9()
     * @generated
     */
    void setTl9( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTl9 <em>Tl9</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTl9()
     * @see #getTl9()
     * @see #setTl9(Double)
     * @generated
     */
    void unsetTl9();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getTl9 <em>Tl9</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tl9</em>' attribute is set.
     * @see #unsetTl9()
     * @see #getTl9()
     * @see #setTl9(Double)
     * @generated
     */
    boolean isSetTl9();

    /**
     * Returns the value of the '<em><b>Kl11</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Low band first lead-lag blocks coefficient (<i>K</i><i><sub>L11</sub></i>).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kl11</em>' attribute.
     * @see #isSetKl11()
     * @see #unsetKl11()
     * @see #setKl11(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Kl11()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.kl11' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKl11();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getKl11 <em>Kl11</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kl11</em>' attribute.
     * @see #isSetKl11()
     * @see #unsetKl11()
     * @see #getKl11()
     * @generated
     */
    void setKl11( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getKl11 <em>Kl11</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKl11()
     * @see #getKl11()
     * @see #setKl11(Double)
     * @generated
     */
    void unsetKl11();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getKl11 <em>Kl11</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kl11</em>' attribute is set.
     * @see #unsetKl11()
     * @see #getKl11()
     * @see #setKl11(Double)
     * @generated
     */
    boolean isSetKl11();

    /**
     * Returns the value of the '<em><b>Kl17</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Low band first lead-lag blocks coefficient (<i>K</i><i><sub>L17</sub></i>).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kl17</em>' attribute.
     * @see #isSetKl17()
     * @see #unsetKl17()
     * @see #setKl17(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Kl17()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.kl17' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKl17();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getKl17 <em>Kl17</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kl17</em>' attribute.
     * @see #isSetKl17()
     * @see #unsetKl17()
     * @see #getKl17()
     * @generated
     */
    void setKl17( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getKl17 <em>Kl17</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKl17()
     * @see #getKl17()
     * @see #setKl17(Double)
     * @generated
     */
    void unsetKl17();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getKl17 <em>Kl17</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kl17</em>' attribute is set.
     * @see #unsetKl17()
     * @see #getKl17()
     * @see #setKl17(Double)
     * @generated
     */
    boolean isSetKl17();

    /**
     * Returns the value of the '<em><b>Kh</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * High band gain (<i>K</i><i><sub>H</sub></i>).  Typical value = 120.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kh</em>' attribute.
     * @see #isSetKh()
     * @see #unsetKh()
     * @see #setKh(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Kh()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.kh' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKh();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getKh <em>Kh</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kh</em>' attribute.
     * @see #isSetKh()
     * @see #unsetKh()
     * @see #getKh()
     * @generated
     */
    void setKh( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getKh <em>Kh</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKh()
     * @see #getKh()
     * @see #setKh(Double)
     * @generated
     */
    void unsetKh();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getKh <em>Kh</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kh</em>' attribute is set.
     * @see #unsetKh()
     * @see #getKh()
     * @see #setKh(Double)
     * @generated
     */
    boolean isSetKh();

    /**
     * Returns the value of the '<em><b>Ki</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Intermediate band gain (<i>K</i><i><sub>I</sub></i>).  Typical value = 30.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ki</em>' attribute.
     * @see #isSetKi()
     * @see #unsetKi()
     * @see #setKi(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Ki()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.ki' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKi();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getKi <em>Ki</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ki</em>' attribute.
     * @see #isSetKi()
     * @see #unsetKi()
     * @see #getKi()
     * @generated
     */
    void setKi( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getKi <em>Ki</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKi()
     * @see #getKi()
     * @see #setKi(Double)
     * @generated
     */
    void unsetKi();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getKi <em>Ki</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ki</em>' attribute is set.
     * @see #unsetKi()
     * @see #getKi()
     * @see #setKi(Double)
     * @generated
     */
    boolean isSetKi();

    /**
     * Returns the value of the '<em><b>Kl</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Low band gain (<i>K</i><i><sub>L</sub></i>).  Typical value = 7.5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kl</em>' attribute.
     * @see #isSetKl()
     * @see #unsetKl()
     * @see #setKl(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Kl()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.kl' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKl();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getKl <em>Kl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kl</em>' attribute.
     * @see #isSetKl()
     * @see #unsetKl()
     * @see #getKl()
     * @generated
     */
    void setKl( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getKl <em>Kl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKl()
     * @see #getKl()
     * @see #setKl(Double)
     * @generated
     */
    void unsetKl();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getKl <em>Kl</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kl</em>' attribute is set.
     * @see #unsetKl()
     * @see #getKl()
     * @see #setKl(Double)
     * @generated
     */
    boolean isSetKl();

    /**
     * Returns the value of the '<em><b>Vstmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * PSS output maximum limit (<i>V</i><i><sub>STmax</sub></i>) (&gt; PssIEEE4B.vstmin).  Typical value = 0,15.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vstmax</em>' attribute.
     * @see #isSetVstmax()
     * @see #unsetVstmax()
     * @see #setVstmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssIEEE4B_Vstmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PssIEEE4B.vstmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVstmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getVstmax <em>Vstmax</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getVstmax <em>Vstmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVstmax()
     * @see #getVstmax()
     * @see #setVstmax(Double)
     * @generated
     */
    void unsetVstmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssIEEE4B#getVstmax <em>Vstmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vstmax</em>' attribute is set.
     * @see #unsetVstmax()
     * @see #getVstmax()
     * @see #setVstmax(Double)
     * @generated
     */
    boolean isSetVstmax();

} // PssIEEE4B

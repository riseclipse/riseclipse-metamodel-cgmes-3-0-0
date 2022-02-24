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
 * A representation of the model object '<em><b>Pss STAB2A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Power system stabilizer part of an ABB excitation system.
 * [Footnote: ABB excitation systems are an example of suitable products available commercially. This information is given for the convenience of users of this document and does not constitute an endorsement by IEC of these products.]
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssSTAB2A#getT5 <em>T5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssSTAB2A#getT3 <em>T3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssSTAB2A#getT2 <em>T2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssSTAB2A#getK5 <em>K5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssSTAB2A#getK4 <em>K4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssSTAB2A#getK3 <em>K3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssSTAB2A#getK2 <em>K2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssSTAB2A#getHlim <em>Hlim</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssSTAB2A()
 * @model
 * @generated
 */
public interface PssSTAB2A extends PowerSystemStabilizerDynamics {
    /**
     * Returns the value of the '<em><b>T5</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time constant (<i>T5</i>).  Typical value = 4,5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>T5</em>' attribute.
     * @see #isSetT5()
     * @see #unsetT5()
     * @see #setT5(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssSTAB2A_T5()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssSTAB2A.t5' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getT5();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssSTAB2A#getT5 <em>T5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>T5</em>' attribute.
     * @see #isSetT5()
     * @see #unsetT5()
     * @see #getT5()
     * @generated
     */
    void setT5( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssSTAB2A#getT5 <em>T5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT5()
     * @see #getT5()
     * @see #setT5(Double)
     * @generated
     */
    void unsetT5();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssSTAB2A#getT5 <em>T5</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>T5</em>' attribute is set.
     * @see #unsetT5()
     * @see #getT5()
     * @see #setT5(Double)
     * @generated
     */
    boolean isSetT5();

    /**
     * Returns the value of the '<em><b>T3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time constant (<i>T3</i>).  Typical value = 2,0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>T3</em>' attribute.
     * @see #isSetT3()
     * @see #unsetT3()
     * @see #setT3(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssSTAB2A_T3()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssSTAB2A.t3' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getT3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssSTAB2A#getT3 <em>T3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>T3</em>' attribute.
     * @see #isSetT3()
     * @see #unsetT3()
     * @see #getT3()
     * @generated
     */
    void setT3( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssSTAB2A#getT3 <em>T3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT3()
     * @see #getT3()
     * @see #setT3(Double)
     * @generated
     */
    void unsetT3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssSTAB2A#getT3 <em>T3</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>T3</em>' attribute is set.
     * @see #unsetT3()
     * @see #getT3()
     * @see #setT3(Double)
     * @generated
     */
    boolean isSetT3();

    /**
     * Returns the value of the '<em><b>T2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time constant (<i>T2</i>).  Typical value = 4,0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>T2</em>' attribute.
     * @see #isSetT2()
     * @see #unsetT2()
     * @see #setT2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssSTAB2A_T2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssSTAB2A.t2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getT2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssSTAB2A#getT2 <em>T2</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssSTAB2A#getT2 <em>T2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT2()
     * @see #getT2()
     * @see #setT2(Double)
     * @generated
     */
    void unsetT2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssSTAB2A#getT2 <em>T2</em>}' attribute is set.
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
     * Returns the value of the '<em><b>K5</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Gain (<i>K5</i>).  Typical value = 2,5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>K5</em>' attribute.
     * @see #isSetK5()
     * @see #unsetK5()
     * @see #setK5(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssSTAB2A_K5()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PssSTAB2A.k5' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getK5();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssSTAB2A#getK5 <em>K5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>K5</em>' attribute.
     * @see #isSetK5()
     * @see #unsetK5()
     * @see #getK5()
     * @generated
     */
    void setK5( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssSTAB2A#getK5 <em>K5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetK5()
     * @see #getK5()
     * @see #setK5(Double)
     * @generated
     */
    void unsetK5();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssSTAB2A#getK5 <em>K5</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>K5</em>' attribute is set.
     * @see #unsetK5()
     * @see #getK5()
     * @see #setK5(Double)
     * @generated
     */
    boolean isSetK5();

    /**
     * Returns the value of the '<em><b>K4</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Gain (<i>K4</i>).  Typical value = 0,075.
     * <!-- end-model-doc -->
     * @return the value of the '<em>K4</em>' attribute.
     * @see #isSetK4()
     * @see #unsetK4()
     * @see #setK4(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssSTAB2A_K4()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PssSTAB2A.k4' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getK4();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssSTAB2A#getK4 <em>K4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>K4</em>' attribute.
     * @see #isSetK4()
     * @see #unsetK4()
     * @see #getK4()
     * @generated
     */
    void setK4( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssSTAB2A#getK4 <em>K4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetK4()
     * @see #getK4()
     * @see #setK4(Double)
     * @generated
     */
    void unsetK4();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssSTAB2A#getK4 <em>K4</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>K4</em>' attribute is set.
     * @see #unsetK4()
     * @see #getK4()
     * @see #setK4(Double)
     * @generated
     */
    boolean isSetK4();

    /**
     * Returns the value of the '<em><b>K3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Gain (<i>K3</i>).  Typical value = 0,25.
     * <!-- end-model-doc -->
     * @return the value of the '<em>K3</em>' attribute.
     * @see #isSetK3()
     * @see #unsetK3()
     * @see #setK3(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssSTAB2A_K3()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PssSTAB2A.k3' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getK3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssSTAB2A#getK3 <em>K3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>K3</em>' attribute.
     * @see #isSetK3()
     * @see #unsetK3()
     * @see #getK3()
     * @generated
     */
    void setK3( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssSTAB2A#getK3 <em>K3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetK3()
     * @see #getK3()
     * @see #setK3(Double)
     * @generated
     */
    void unsetK3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssSTAB2A#getK3 <em>K3</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>K3</em>' attribute is set.
     * @see #unsetK3()
     * @see #getK3()
     * @see #setK3(Double)
     * @generated
     */
    boolean isSetK3();

    /**
     * Returns the value of the '<em><b>K2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Gain (<i>K2</i>).  Typical value = 1,0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>K2</em>' attribute.
     * @see #isSetK2()
     * @see #unsetK2()
     * @see #setK2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssSTAB2A_K2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PssSTAB2A.k2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getK2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssSTAB2A#getK2 <em>K2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>K2</em>' attribute.
     * @see #isSetK2()
     * @see #unsetK2()
     * @see #getK2()
     * @generated
     */
    void setK2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssSTAB2A#getK2 <em>K2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetK2()
     * @see #getK2()
     * @see #setK2(Double)
     * @generated
     */
    void unsetK2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssSTAB2A#getK2 <em>K2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>K2</em>' attribute is set.
     * @see #unsetK2()
     * @see #getK2()
     * @see #setK2(Double)
     * @generated
     */
    boolean isSetK2();

    /**
     * Returns the value of the '<em><b>Hlim</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Stabilizer output limiter (<i>H</i><i><sub>LIM</sub></i>).  Typical value = 0,5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Hlim</em>' attribute.
     * @see #isSetHlim()
     * @see #unsetHlim()
     * @see #setHlim(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssSTAB2A_Hlim()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PssSTAB2A.hlim' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getHlim();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssSTAB2A#getHlim <em>Hlim</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Hlim</em>' attribute.
     * @see #isSetHlim()
     * @see #unsetHlim()
     * @see #getHlim()
     * @generated
     */
    void setHlim( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssSTAB2A#getHlim <em>Hlim</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetHlim()
     * @see #getHlim()
     * @see #setHlim(Double)
     * @generated
     */
    void unsetHlim();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssSTAB2A#getHlim <em>Hlim</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Hlim</em>' attribute is set.
     * @see #unsetHlim()
     * @see #getHlim()
     * @see #setHlim(Double)
     * @generated
     */
    boolean isSetHlim();

} // PssSTAB2A

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
 * A representation of the model object '<em><b>Pss ELIN2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Power system stabilizer typically associated with ExcELIN2 (though PssIEEE2B or Pss2B can also be used).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssELIN2#getApss <em>Apss</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssELIN2#getTs3 <em>Ts3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssELIN2#getTs4 <em>Ts4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssELIN2#getTs5 <em>Ts5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssELIN2#getTs6 <em>Ts6</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssELIN2#getTs1 <em>Ts1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssELIN2#getTs2 <em>Ts2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssELIN2#getKs1 <em>Ks1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssELIN2#getKs2 <em>Ks2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssELIN2#getPsslim <em>Psslim</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssELIN2#getPpss <em>Ppss</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssELIN2()
 * @model
 * @generated
 */
public interface PssELIN2 extends PowerSystemStabilizerDynamics {
    /**
     * Returns the value of the '<em><b>Apss</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Coefficient (<i>a_PSS</i>).  Typical value = 0,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Apss</em>' attribute.
     * @see #isSetApss()
     * @see #unsetApss()
     * @see #setApss(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssELIN2_Apss()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PssELIN2.apss' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getApss();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssELIN2#getApss <em>Apss</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Apss</em>' attribute.
     * @see #isSetApss()
     * @see #unsetApss()
     * @see #getApss()
     * @generated
     */
    void setApss( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssELIN2#getApss <em>Apss</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetApss()
     * @see #getApss()
     * @see #setApss(Double)
     * @generated
     */
    void unsetApss();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssELIN2#getApss <em>Apss</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Apss</em>' attribute is set.
     * @see #unsetApss()
     * @see #getApss()
     * @see #setApss(Double)
     * @generated
     */
    boolean isSetApss();

    /**
     * Returns the value of the '<em><b>Ts3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time constant (<i>Ts3</i>) (&gt;= 0).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ts3</em>' attribute.
     * @see #isSetTs3()
     * @see #unsetTs3()
     * @see #setTs3(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssELIN2_Ts3()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssELIN2.ts3' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTs3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssELIN2#getTs3 <em>Ts3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ts3</em>' attribute.
     * @see #isSetTs3()
     * @see #unsetTs3()
     * @see #getTs3()
     * @generated
     */
    void setTs3( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssELIN2#getTs3 <em>Ts3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTs3()
     * @see #getTs3()
     * @see #setTs3(Double)
     * @generated
     */
    void unsetTs3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssELIN2#getTs3 <em>Ts3</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ts3</em>' attribute is set.
     * @see #unsetTs3()
     * @see #getTs3()
     * @see #setTs3(Double)
     * @generated
     */
    boolean isSetTs3();

    /**
     * Returns the value of the '<em><b>Ts4</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time constant (<i>Ts4</i>) (&gt;= 0).  Typical value = 0,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ts4</em>' attribute.
     * @see #isSetTs4()
     * @see #unsetTs4()
     * @see #setTs4(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssELIN2_Ts4()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssELIN2.ts4' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTs4();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssELIN2#getTs4 <em>Ts4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ts4</em>' attribute.
     * @see #isSetTs4()
     * @see #unsetTs4()
     * @see #getTs4()
     * @generated
     */
    void setTs4( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssELIN2#getTs4 <em>Ts4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTs4()
     * @see #getTs4()
     * @see #setTs4(Double)
     * @generated
     */
    void unsetTs4();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssELIN2#getTs4 <em>Ts4</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ts4</em>' attribute is set.
     * @see #unsetTs4()
     * @see #getTs4()
     * @see #setTs4(Double)
     * @generated
     */
    boolean isSetTs4();

    /**
     * Returns the value of the '<em><b>Ts5</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time constant (<i>Ts5</i>) (&gt;= 0).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ts5</em>' attribute.
     * @see #isSetTs5()
     * @see #unsetTs5()
     * @see #setTs5(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssELIN2_Ts5()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssELIN2.ts5' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTs5();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssELIN2#getTs5 <em>Ts5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ts5</em>' attribute.
     * @see #isSetTs5()
     * @see #unsetTs5()
     * @see #getTs5()
     * @generated
     */
    void setTs5( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssELIN2#getTs5 <em>Ts5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTs5()
     * @see #getTs5()
     * @see #setTs5(Double)
     * @generated
     */
    void unsetTs5();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssELIN2#getTs5 <em>Ts5</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ts5</em>' attribute is set.
     * @see #unsetTs5()
     * @see #getTs5()
     * @see #setTs5(Double)
     * @generated
     */
    boolean isSetTs5();

    /**
     * Returns the value of the '<em><b>Ts6</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time constant (<i>Ts6</i>) (&gt;= 0).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ts6</em>' attribute.
     * @see #isSetTs6()
     * @see #unsetTs6()
     * @see #setTs6(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssELIN2_Ts6()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssELIN2.ts6' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTs6();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssELIN2#getTs6 <em>Ts6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ts6</em>' attribute.
     * @see #isSetTs6()
     * @see #unsetTs6()
     * @see #getTs6()
     * @generated
     */
    void setTs6( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssELIN2#getTs6 <em>Ts6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTs6()
     * @see #getTs6()
     * @see #setTs6(Double)
     * @generated
     */
    void unsetTs6();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssELIN2#getTs6 <em>Ts6</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ts6</em>' attribute is set.
     * @see #unsetTs6()
     * @see #getTs6()
     * @see #setTs6(Double)
     * @generated
     */
    boolean isSetTs6();

    /**
     * Returns the value of the '<em><b>Ts1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time constant (<i>Ts1</i>) (&gt;= 0).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ts1</em>' attribute.
     * @see #isSetTs1()
     * @see #unsetTs1()
     * @see #setTs1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssELIN2_Ts1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssELIN2.ts1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTs1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssELIN2#getTs1 <em>Ts1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ts1</em>' attribute.
     * @see #isSetTs1()
     * @see #unsetTs1()
     * @see #getTs1()
     * @generated
     */
    void setTs1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssELIN2#getTs1 <em>Ts1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTs1()
     * @see #getTs1()
     * @see #setTs1(Double)
     * @generated
     */
    void unsetTs1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssELIN2#getTs1 <em>Ts1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ts1</em>' attribute is set.
     * @see #unsetTs1()
     * @see #getTs1()
     * @see #setTs1(Double)
     * @generated
     */
    boolean isSetTs1();

    /**
     * Returns the value of the '<em><b>Ts2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time constant (<i>Ts2</i>) (&gt;= 0).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ts2</em>' attribute.
     * @see #isSetTs2()
     * @see #unsetTs2()
     * @see #setTs2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssELIN2_Ts2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssELIN2.ts2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTs2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssELIN2#getTs2 <em>Ts2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ts2</em>' attribute.
     * @see #isSetTs2()
     * @see #unsetTs2()
     * @see #getTs2()
     * @generated
     */
    void setTs2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssELIN2#getTs2 <em>Ts2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTs2()
     * @see #getTs2()
     * @see #setTs2(Double)
     * @generated
     */
    void unsetTs2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssELIN2#getTs2 <em>Ts2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ts2</em>' attribute is set.
     * @see #unsetTs2()
     * @see #getTs2()
     * @see #setTs2(Double)
     * @generated
     */
    boolean isSetTs2();

    /**
     * Returns the value of the '<em><b>Ks1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Gain (<i>Ks1</i>).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ks1</em>' attribute.
     * @see #isSetKs1()
     * @see #unsetKs1()
     * @see #setKs1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssELIN2_Ks1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PssELIN2.ks1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKs1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssELIN2#getKs1 <em>Ks1</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssELIN2#getKs1 <em>Ks1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKs1()
     * @see #getKs1()
     * @see #setKs1(Double)
     * @generated
     */
    void unsetKs1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssELIN2#getKs1 <em>Ks1</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Ks2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Gain (<i>Ks2</i>).  Typical value = 0,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ks2</em>' attribute.
     * @see #isSetKs2()
     * @see #unsetKs2()
     * @see #setKs2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssELIN2_Ks2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PssELIN2.ks2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKs2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssELIN2#getKs2 <em>Ks2</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssELIN2#getKs2 <em>Ks2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKs2()
     * @see #getKs2()
     * @see #setKs2(Double)
     * @generated
     */
    void unsetKs2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssELIN2#getKs2 <em>Ks2</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Psslim</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * PSS limiter (<i>psslim</i>).  Typical value = 0,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Psslim</em>' attribute.
     * @see #isSetPsslim()
     * @see #unsetPsslim()
     * @see #setPsslim(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssELIN2_Psslim()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PssELIN2.psslim' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPsslim();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssELIN2#getPsslim <em>Psslim</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Psslim</em>' attribute.
     * @see #isSetPsslim()
     * @see #unsetPsslim()
     * @see #getPsslim()
     * @generated
     */
    void setPsslim( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssELIN2#getPsslim <em>Psslim</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPsslim()
     * @see #getPsslim()
     * @see #setPsslim(Double)
     * @generated
     */
    void unsetPsslim();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssELIN2#getPsslim <em>Psslim</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Psslim</em>' attribute is set.
     * @see #unsetPsslim()
     * @see #getPsslim()
     * @see #setPsslim(Double)
     * @generated
     */
    boolean isSetPsslim();

    /**
     * Returns the value of the '<em><b>Ppss</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Coefficient (<i>p_PSS</i>) (&gt;= 0 and &lt;= 4).  Typical value = 0,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ppss</em>' attribute.
     * @see #isSetPpss()
     * @see #unsetPpss()
     * @see #setPpss(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssELIN2_Ppss()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PssELIN2.ppss' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPpss();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssELIN2#getPpss <em>Ppss</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ppss</em>' attribute.
     * @see #isSetPpss()
     * @see #unsetPpss()
     * @see #getPpss()
     * @generated
     */
    void setPpss( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssELIN2#getPpss <em>Ppss</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPpss()
     * @see #getPpss()
     * @see #setPpss(Double)
     * @generated
     */
    void unsetPpss();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssELIN2#getPpss <em>Ppss</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ppss</em>' attribute is set.
     * @see #unsetPpss()
     * @see #getPpss()
     * @see #setPpss(Double)
     * @generated
     */
    boolean isSetPpss();

} // PssELIN2

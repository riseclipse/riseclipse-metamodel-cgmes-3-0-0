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
 * A representation of the model object '<em><b>Pss RQB</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Power system stabilizer type RQB. This power system stabilizer is intended to be used together with excitation system type ExcRQB, which is primarily used in nuclear or thermal generating units.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssRQB#getSibv <em>Sibv</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssRQB#getT4f <em>T4f</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssRQB#getT4m <em>T4m</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssRQB#getKi2 <em>Ki2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssRQB#getKi4 <em>Ki4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssRQB#getKi3 <em>Ki3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssRQB#getTomsl <em>Tomsl</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssRQB#getT4mom <em>T4mom</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssRQB#getKdpm <em>Kdpm</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssRQB#getTomd <em>Tomd</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssRQB()
 * @model
 * @generated
 */
public interface PssRQB extends PowerSystemStabilizerDynamics {
    /**
     * Returns the value of the '<em><b>Sibv</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Speed deadband (<i>SIBV</i>). Typical value = 0,006.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Sibv</em>' attribute.
     * @see #isSetSibv()
     * @see #unsetSibv()
     * @see #setSibv(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssRQB_Sibv()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='PssRQB.sibv' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getSibv();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssRQB#getSibv <em>Sibv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sibv</em>' attribute.
     * @see #isSetSibv()
     * @see #unsetSibv()
     * @see #getSibv()
     * @generated
     */
    void setSibv( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssRQB#getSibv <em>Sibv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSibv()
     * @see #getSibv()
     * @see #setSibv(Double)
     * @generated
     */
    void unsetSibv();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssRQB#getSibv <em>Sibv</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sibv</em>' attribute is set.
     * @see #unsetSibv()
     * @see #getSibv()
     * @see #setSibv(Double)
     * @generated
     */
    boolean isSetSibv();

    /**
     * Returns the value of the '<em><b>T4f</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Lead lag time constant (<i>T4F</i>) (&gt;= 0). Typical value = 0,045.
     * <!-- end-model-doc -->
     * @return the value of the '<em>T4f</em>' attribute.
     * @see #isSetT4f()
     * @see #unsetT4f()
     * @see #setT4f(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssRQB_T4f()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssRQB.t4f' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getT4f();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssRQB#getT4f <em>T4f</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>T4f</em>' attribute.
     * @see #isSetT4f()
     * @see #unsetT4f()
     * @see #getT4f()
     * @generated
     */
    void setT4f( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssRQB#getT4f <em>T4f</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT4f()
     * @see #getT4f()
     * @see #setT4f(Double)
     * @generated
     */
    void unsetT4f();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssRQB#getT4f <em>T4f</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>T4f</em>' attribute is set.
     * @see #unsetT4f()
     * @see #getT4f()
     * @see #setT4f(Double)
     * @generated
     */
    boolean isSetT4f();

    /**
     * Returns the value of the '<em><b>T4m</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Input time constant (<i>T4M</i>) (&gt;= 0). Typical value = 5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>T4m</em>' attribute.
     * @see #isSetT4m()
     * @see #unsetT4m()
     * @see #setT4m(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssRQB_T4m()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssRQB.t4m' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getT4m();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssRQB#getT4m <em>T4m</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>T4m</em>' attribute.
     * @see #isSetT4m()
     * @see #unsetT4m()
     * @see #getT4m()
     * @generated
     */
    void setT4m( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssRQB#getT4m <em>T4m</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT4m()
     * @see #getT4m()
     * @see #setT4m(Double)
     * @generated
     */
    void unsetT4m();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssRQB#getT4m <em>T4m</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>T4m</em>' attribute is set.
     * @see #unsetT4m()
     * @see #getT4m()
     * @see #setT4m(Double)
     * @generated
     */
    boolean isSetT4m();

    /**
     * Returns the value of the '<em><b>Ki2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Speed input gain (<i>Ki2</i>). Typical value = 3,43.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ki2</em>' attribute.
     * @see #isSetKi2()
     * @see #unsetKi2()
     * @see #setKi2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssRQB_Ki2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='PssRQB.ki2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKi2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssRQB#getKi2 <em>Ki2</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssRQB#getKi2 <em>Ki2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKi2()
     * @see #getKi2()
     * @see #setKi2(Double)
     * @generated
     */
    void unsetKi2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssRQB#getKi2 <em>Ki2</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Ki4</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Mechanical power input gain (<i>Ki4</i>). Typical value = 11,86.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ki4</em>' attribute.
     * @see #isSetKi4()
     * @see #unsetKi4()
     * @see #setKi4(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssRQB_Ki4()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='PssRQB.ki4' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKi4();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssRQB#getKi4 <em>Ki4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ki4</em>' attribute.
     * @see #isSetKi4()
     * @see #unsetKi4()
     * @see #getKi4()
     * @generated
     */
    void setKi4( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssRQB#getKi4 <em>Ki4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKi4()
     * @see #getKi4()
     * @see #setKi4(Double)
     * @generated
     */
    void unsetKi4();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssRQB#getKi4 <em>Ki4</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ki4</em>' attribute is set.
     * @see #unsetKi4()
     * @see #getKi4()
     * @see #setKi4(Double)
     * @generated
     */
    boolean isSetKi4();

    /**
     * Returns the value of the '<em><b>Ki3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Electrical power input gain (<i>Ki3</i>). Typical value = -11,45.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ki3</em>' attribute.
     * @see #isSetKi3()
     * @see #unsetKi3()
     * @see #setKi3(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssRQB_Ki3()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='PssRQB.ki3' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKi3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssRQB#getKi3 <em>Ki3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ki3</em>' attribute.
     * @see #isSetKi3()
     * @see #unsetKi3()
     * @see #getKi3()
     * @generated
     */
    void setKi3( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssRQB#getKi3 <em>Ki3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKi3()
     * @see #getKi3()
     * @see #setKi3(Double)
     * @generated
     */
    void unsetKi3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssRQB#getKi3 <em>Ki3</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ki3</em>' attribute is set.
     * @see #unsetKi3()
     * @see #getKi3()
     * @see #setKi3(Double)
     * @generated
     */
    boolean isSetKi3();

    /**
     * Returns the value of the '<em><b>Tomsl</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Speed time constant (<i>TOMSL</i>) (&gt;= 0). Typical value = 0,04.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tomsl</em>' attribute.
     * @see #isSetTomsl()
     * @see #unsetTomsl()
     * @see #setTomsl(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssRQB_Tomsl()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssRQB.tomsl' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTomsl();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssRQB#getTomsl <em>Tomsl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tomsl</em>' attribute.
     * @see #isSetTomsl()
     * @see #unsetTomsl()
     * @see #getTomsl()
     * @generated
     */
    void setTomsl( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssRQB#getTomsl <em>Tomsl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTomsl()
     * @see #getTomsl()
     * @see #setTomsl(Double)
     * @generated
     */
    void unsetTomsl();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssRQB#getTomsl <em>Tomsl</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tomsl</em>' attribute is set.
     * @see #unsetTomsl()
     * @see #getTomsl()
     * @see #setTomsl(Double)
     * @generated
     */
    boolean isSetTomsl();

    /**
     * Returns the value of the '<em><b>T4mom</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Speed time constant (<i>T4MOM</i>) (&gt;= 0). Typical value = 1,27.
     * <!-- end-model-doc -->
     * @return the value of the '<em>T4mom</em>' attribute.
     * @see #isSetT4mom()
     * @see #unsetT4mom()
     * @see #setT4mom(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssRQB_T4mom()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssRQB.t4mom' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getT4mom();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssRQB#getT4mom <em>T4mom</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>T4mom</em>' attribute.
     * @see #isSetT4mom()
     * @see #unsetT4mom()
     * @see #getT4mom()
     * @generated
     */
    void setT4mom( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssRQB#getT4mom <em>T4mom</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT4mom()
     * @see #getT4mom()
     * @see #setT4mom(Double)
     * @generated
     */
    void unsetT4mom();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssRQB#getT4mom <em>T4mom</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>T4mom</em>' attribute is set.
     * @see #unsetT4mom()
     * @see #getT4mom()
     * @see #setT4mom(Double)
     * @generated
     */
    boolean isSetT4mom();

    /**
     * Returns the value of the '<em><b>Kdpm</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Lead lag gain (<i>KDPM</i>). Typical value = 0,185.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kdpm</em>' attribute.
     * @see #isSetKdpm()
     * @see #unsetKdpm()
     * @see #setKdpm(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssRQB_Kdpm()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='PssRQB.kdpm' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKdpm();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssRQB#getKdpm <em>Kdpm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kdpm</em>' attribute.
     * @see #isSetKdpm()
     * @see #unsetKdpm()
     * @see #getKdpm()
     * @generated
     */
    void setKdpm( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssRQB#getKdpm <em>Kdpm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKdpm()
     * @see #getKdpm()
     * @see #setKdpm(Double)
     * @generated
     */
    void unsetKdpm();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssRQB#getKdpm <em>Kdpm</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kdpm</em>' attribute is set.
     * @see #unsetKdpm()
     * @see #getKdpm()
     * @see #setKdpm(Double)
     * @generated
     */
    boolean isSetKdpm();

    /**
     * Returns the value of the '<em><b>Tomd</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Speed delay (<i>TOMD</i>) (&gt;= 0). Typical value = 0,02.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tomd</em>' attribute.
     * @see #isSetTomd()
     * @see #unsetTomd()
     * @see #setTomd(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPssRQB_Tomd()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='PssRQB.tomd' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTomd();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssRQB#getTomd <em>Tomd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tomd</em>' attribute.
     * @see #isSetTomd()
     * @see #unsetTomd()
     * @see #getTomd()
     * @generated
     */
    void setTomd( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssRQB#getTomd <em>Tomd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTomd()
     * @see #getTomd()
     * @see #setTomd(Double)
     * @generated
     */
    void unsetTomd();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PssRQB#getTomd <em>Tomd</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tomd</em>' attribute is set.
     * @see #unsetTomd()
     * @see #getTomd()
     * @see #setTomd(Double)
     * @generated
     */
    boolean isSetTomd();

} // PssRQB

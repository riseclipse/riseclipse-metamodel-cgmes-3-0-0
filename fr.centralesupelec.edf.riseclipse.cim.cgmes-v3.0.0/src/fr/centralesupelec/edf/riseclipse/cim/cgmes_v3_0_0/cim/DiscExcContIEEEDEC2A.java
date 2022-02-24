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
 * A representation of the model object '<em><b>Disc Exc Cont IEEEDEC2A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * IEEE type DEC2A model for discontinuous excitation control. This system provides transient excitation boosting via an open-loop control as initiated by a trigger signal generated remotely.
 * Reference: IEEE 421.5-2005 12.3.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC2A#getVdmin <em>Vdmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC2A#getVdmax <em>Vdmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC2A#getTd2 <em>Td2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC2A#getTd1 <em>Td1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC2A#getVk <em>Vk</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiscExcContIEEEDEC2A()
 * @model
 * @generated
 */
public interface DiscExcContIEEEDEC2A extends DiscontinuousExcitationControlDynamics {
    /**
     * Returns the value of the '<em><b>Vdmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Limiter (<i>V</i><i><sub>DMIN</sub></i>) (&lt; DiscExcContIEEEDEC2A.vdmax).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vdmin</em>' attribute.
     * @see #isSetVdmin()
     * @see #unsetVdmin()
     * @see #setVdmin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiscExcContIEEEDEC2A_Vdmin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='DiscExcContIEEEDEC2A.vdmin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVdmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC2A#getVdmin <em>Vdmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vdmin</em>' attribute.
     * @see #isSetVdmin()
     * @see #unsetVdmin()
     * @see #getVdmin()
     * @generated
     */
    void setVdmin( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC2A#getVdmin <em>Vdmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVdmin()
     * @see #getVdmin()
     * @see #setVdmin(Double)
     * @generated
     */
    void unsetVdmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC2A#getVdmin <em>Vdmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vdmin</em>' attribute is set.
     * @see #unsetVdmin()
     * @see #getVdmin()
     * @see #setVdmin(Double)
     * @generated
     */
    boolean isSetVdmin();

    /**
     * Returns the value of the '<em><b>Vdmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Limiter (<i>V</i><i><sub>DMAX</sub></i>) (&gt; DiscExcContIEEEDEC2A.vdmin).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vdmax</em>' attribute.
     * @see #isSetVdmax()
     * @see #unsetVdmax()
     * @see #setVdmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiscExcContIEEEDEC2A_Vdmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='DiscExcContIEEEDEC2A.vdmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVdmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC2A#getVdmax <em>Vdmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vdmax</em>' attribute.
     * @see #isSetVdmax()
     * @see #unsetVdmax()
     * @see #getVdmax()
     * @generated
     */
    void setVdmax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC2A#getVdmax <em>Vdmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVdmax()
     * @see #getVdmax()
     * @see #setVdmax(Double)
     * @generated
     */
    void unsetVdmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC2A#getVdmax <em>Vdmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vdmax</em>' attribute is set.
     * @see #unsetVdmax()
     * @see #getVdmax()
     * @see #setVdmax(Double)
     * @generated
     */
    boolean isSetVdmax();

    /**
     * Returns the value of the '<em><b>Td2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Discontinuous controller washout time constant (<i>T</i><i><sub>D2</sub></i>) (&gt;= 0).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Td2</em>' attribute.
     * @see #isSetTd2()
     * @see #unsetTd2()
     * @see #setTd2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiscExcContIEEEDEC2A_Td2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='DiscExcContIEEEDEC2A.td2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTd2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC2A#getTd2 <em>Td2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Td2</em>' attribute.
     * @see #isSetTd2()
     * @see #unsetTd2()
     * @see #getTd2()
     * @generated
     */
    void setTd2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC2A#getTd2 <em>Td2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTd2()
     * @see #getTd2()
     * @see #setTd2(Double)
     * @generated
     */
    void unsetTd2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC2A#getTd2 <em>Td2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Td2</em>' attribute is set.
     * @see #unsetTd2()
     * @see #getTd2()
     * @see #setTd2(Double)
     * @generated
     */
    boolean isSetTd2();

    /**
     * Returns the value of the '<em><b>Td1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Discontinuous controller time constant (<i>T</i><i><sub>D1</sub></i>) (&gt;= 0).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Td1</em>' attribute.
     * @see #isSetTd1()
     * @see #unsetTd1()
     * @see #setTd1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiscExcContIEEEDEC2A_Td1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='DiscExcContIEEEDEC2A.td1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTd1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC2A#getTd1 <em>Td1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Td1</em>' attribute.
     * @see #isSetTd1()
     * @see #unsetTd1()
     * @see #getTd1()
     * @generated
     */
    void setTd1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC2A#getTd1 <em>Td1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTd1()
     * @see #getTd1()
     * @see #setTd1(Double)
     * @generated
     */
    void unsetTd1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC2A#getTd1 <em>Td1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Td1</em>' attribute is set.
     * @see #unsetTd1()
     * @see #getTd1()
     * @see #setTd1(Double)
     * @generated
     */
    boolean isSetTd1();

    /**
     * Returns the value of the '<em><b>Vk</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Discontinuous controller input reference (<i>V</i><i><sub>K</sub></i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vk</em>' attribute.
     * @see #isSetVk()
     * @see #unsetVk()
     * @see #setVk(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiscExcContIEEEDEC2A_Vk()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='DiscExcContIEEEDEC2A.vk' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVk();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC2A#getVk <em>Vk</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vk</em>' attribute.
     * @see #isSetVk()
     * @see #unsetVk()
     * @see #getVk()
     * @generated
     */
    void setVk( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC2A#getVk <em>Vk</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVk()
     * @see #getVk()
     * @see #setVk(Double)
     * @generated
     */
    void unsetVk();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiscExcContIEEEDEC2A#getVk <em>Vk</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vk</em>' attribute is set.
     * @see #unsetVk()
     * @see #getVk()
     * @see #setVk(Double)
     * @generated
     */
    boolean isSetVk();

} // DiscExcContIEEEDEC2A

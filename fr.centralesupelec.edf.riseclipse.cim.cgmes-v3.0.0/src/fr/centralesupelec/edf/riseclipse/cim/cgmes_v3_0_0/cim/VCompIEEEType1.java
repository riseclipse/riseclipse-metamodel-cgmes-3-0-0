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
 * A representation of the model object '<em><b>VComp IEEE Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <font color="#0f0f0f">Terminal voltage transducer and load compensator as defined in IEEE 421.5-2005, 4. This model is common to all excitation system models described in the IEEE Standard. </font>
 * <font color="#0f0f0f">Parameter details:</font>
 * <ol>
 * 	<li><font color="#0f0f0f">If <i>Rc</i> and <i>Xc</i> are set to zero, the l</font>oad compensation is not employed and the behaviour is as a simple sensing circuit.</li>
 * </ol>
 * <ol>
 * 	<li>If all parameters (<i>Rc</i>, <i>Xc</i> and <i>Tr</i>) are set to zero, the standard model VCompIEEEType1 is bypassed.</li>
 * </ol>
 * Reference: IEEE 421.5-2005 4.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VCompIEEEType1#getRc <em>Rc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VCompIEEEType1#getTr <em>Tr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VCompIEEEType1#getXc <em>Xc</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getVCompIEEEType1()
 * @model
 * @generated
 */
public interface VCompIEEEType1 extends VoltageCompensatorDynamics {
    /**
     * Returns the value of the '<em><b>Rc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <font color="#0f0f0f">Resistive component of compensation of a generator (<i>Rc</i>) (&gt;= 0).</font>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Rc</em>' attribute.
     * @see #isSetRc()
     * @see #unsetRc()
     * @see #setRc(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getVCompIEEEType1_Rc()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='VCompIEEEType1.rc' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getRc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VCompIEEEType1#getRc <em>Rc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rc</em>' attribute.
     * @see #isSetRc()
     * @see #unsetRc()
     * @see #getRc()
     * @generated
     */
    void setRc( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VCompIEEEType1#getRc <em>Rc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRc()
     * @see #getRc()
     * @see #setRc(Double)
     * @generated
     */
    void unsetRc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VCompIEEEType1#getRc <em>Rc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rc</em>' attribute is set.
     * @see #unsetRc()
     * @see #getRc()
     * @see #setRc(Double)
     * @generated
     */
    boolean isSetRc();

    /**
     * Returns the value of the '<em><b>Tr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <font color="#0f0f0f">Time constant which is used for the combined voltage sensing and compensation signal (<i>Tr</i>) (&gt;= 0).</font>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tr</em>' attribute.
     * @see #isSetTr()
     * @see #unsetTr()
     * @see #setTr(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getVCompIEEEType1_Tr()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='VCompIEEEType1.tr' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTr();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VCompIEEEType1#getTr <em>Tr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tr</em>' attribute.
     * @see #isSetTr()
     * @see #unsetTr()
     * @see #getTr()
     * @generated
     */
    void setTr( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VCompIEEEType1#getTr <em>Tr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTr()
     * @see #getTr()
     * @see #setTr(Double)
     * @generated
     */
    void unsetTr();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VCompIEEEType1#getTr <em>Tr</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tr</em>' attribute is set.
     * @see #unsetTr()
     * @see #getTr()
     * @see #setTr(Double)
     * @generated
     */
    boolean isSetTr();

    /**
     * Returns the value of the '<em><b>Xc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <font color="#0f0f0f">Reactive component of compensation of a generator (<i>Xc</i>) (&gt;= 0).</font>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Xc</em>' attribute.
     * @see #isSetXc()
     * @see #unsetXc()
     * @see #setXc(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getVCompIEEEType1_Xc()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='VCompIEEEType1.xc' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getXc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VCompIEEEType1#getXc <em>Xc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xc</em>' attribute.
     * @see #isSetXc()
     * @see #unsetXc()
     * @see #getXc()
     * @generated
     */
    void setXc( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VCompIEEEType1#getXc <em>Xc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXc()
     * @see #getXc()
     * @see #setXc(Double)
     * @generated
     */
    void unsetXc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VCompIEEEType1#getXc <em>Xc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Xc</em>' attribute is set.
     * @see #unsetXc()
     * @see #getXc()
     * @see #setXc(Double)
     * @generated
     */
    boolean isSetXc();

} // VCompIEEEType1

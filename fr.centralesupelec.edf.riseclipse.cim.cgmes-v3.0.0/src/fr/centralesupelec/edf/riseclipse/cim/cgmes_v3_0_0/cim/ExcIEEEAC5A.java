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
 * A representation of the model object '<em><b>Exc IEEEAC5A</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * IEEE 421.5-2005 type AC5A model. The model represents a simplified model for brushless excitation systems. The regulator is supplied from a source, such as a permanent magnet generator, which is not affected by system disturbances.  Unlike other AC models, this model uses loaded rather than open circuit exciter saturation data in the same way as it is used for the DC models.  Because the model has been widely implemented by the industry, it is sometimes used to represent other types of systems when either detailed data for them are not available or simplified models are required.
 * Reference: IEEE 421.5-2005, 6.5.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC5A#getEfd2 <em>Efd2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC5A#getEfd1 <em>Efd1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC5A#getTe <em>Te</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC5A#getTa <em>Ta</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC5A#getTf3 <em>Tf3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC5A#getTf2 <em>Tf2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC5A#getTf1 <em>Tf1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC5A#getSeefd2 <em>Seefd2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC5A#getSeefd1 <em>Seefd1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC5A#getKa <em>Ka</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC5A#getKe <em>Ke</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC5A#getKf <em>Kf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC5A#getVrmax <em>Vrmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC5A#getVrmin <em>Vrmin</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEAC5A()
 * @model
 * @generated
 */
public interface ExcIEEEAC5A extends ExcitationSystemDynamics {
    /**
     * Returns the value of the '<em><b>Efd2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Exciter voltage at which exciter saturation is defined (<i>E</i><i><sub>FD2</sub></i>) (&gt; 0).  Typical value = 4,2.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Efd2</em>' attribute.
     * @see #isSetEfd2()
     * @see #unsetEfd2()
     * @see #setEfd2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEAC5A_Efd2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEAC5A.efd2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getEfd2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC5A#getEfd2 <em>Efd2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Efd2</em>' attribute.
     * @see #isSetEfd2()
     * @see #unsetEfd2()
     * @see #getEfd2()
     * @generated
     */
    void setEfd2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC5A#getEfd2 <em>Efd2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEfd2()
     * @see #getEfd2()
     * @see #setEfd2(Double)
     * @generated
     */
    void unsetEfd2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC5A#getEfd2 <em>Efd2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Efd2</em>' attribute is set.
     * @see #unsetEfd2()
     * @see #getEfd2()
     * @see #setEfd2(Double)
     * @generated
     */
    boolean isSetEfd2();

    /**
     * Returns the value of the '<em><b>Efd1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Exciter voltage at which exciter saturation is defined (<i>E</i><i><sub>FD1</sub></i>) (&gt; 0).  Typical value = 5,6.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Efd1</em>' attribute.
     * @see #isSetEfd1()
     * @see #unsetEfd1()
     * @see #setEfd1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEAC5A_Efd1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEAC5A.efd1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getEfd1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC5A#getEfd1 <em>Efd1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Efd1</em>' attribute.
     * @see #isSetEfd1()
     * @see #unsetEfd1()
     * @see #getEfd1()
     * @generated
     */
    void setEfd1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC5A#getEfd1 <em>Efd1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEfd1()
     * @see #getEfd1()
     * @see #setEfd1(Double)
     * @generated
     */
    void unsetEfd1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC5A#getEfd1 <em>Efd1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Efd1</em>' attribute is set.
     * @see #unsetEfd1()
     * @see #getEfd1()
     * @see #setEfd1(Double)
     * @generated
     */
    boolean isSetEfd1();

    /**
     * Returns the value of the '<em><b>Te</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Exciter time constant, integration rate associated with exciter control (<i>T</i><i><sub>E</sub></i>) (&gt; 0).  Typical value = 0,8.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Te</em>' attribute.
     * @see #isSetTe()
     * @see #unsetTe()
     * @see #setTe(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEAC5A_Te()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEAC5A.te' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTe();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC5A#getTe <em>Te</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Te</em>' attribute.
     * @see #isSetTe()
     * @see #unsetTe()
     * @see #getTe()
     * @generated
     */
    void setTe( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC5A#getTe <em>Te</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTe()
     * @see #getTe()
     * @see #setTe(Double)
     * @generated
     */
    void unsetTe();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC5A#getTe <em>Te</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Te</em>' attribute is set.
     * @see #unsetTe()
     * @see #getTe()
     * @see #setTe(Double)
     * @generated
     */
    boolean isSetTe();

    /**
     * Returns the value of the '<em><b>Ta</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Voltage regulator time constant (<i>T</i><i><sub>A</sub></i>) (&gt; 0).  Typical value = 0,02.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ta</em>' attribute.
     * @see #isSetTa()
     * @see #unsetTa()
     * @see #setTa(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEAC5A_Ta()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEAC5A.ta' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTa();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC5A#getTa <em>Ta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ta</em>' attribute.
     * @see #isSetTa()
     * @see #unsetTa()
     * @see #getTa()
     * @generated
     */
    void setTa( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC5A#getTa <em>Ta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTa()
     * @see #getTa()
     * @see #setTa(Double)
     * @generated
     */
    void unsetTa();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC5A#getTa <em>Ta</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ta</em>' attribute is set.
     * @see #unsetTa()
     * @see #getTa()
     * @see #setTa(Double)
     * @generated
     */
    boolean isSetTa();

    /**
     * Returns the value of the '<em><b>Tf3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Excitation control system stabilizer time constant (<i>T</i><i><sub>F3</sub></i>) (&gt;= 0).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tf3</em>' attribute.
     * @see #isSetTf3()
     * @see #unsetTf3()
     * @see #setTf3(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEAC5A_Tf3()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEAC5A.tf3' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTf3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC5A#getTf3 <em>Tf3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tf3</em>' attribute.
     * @see #isSetTf3()
     * @see #unsetTf3()
     * @see #getTf3()
     * @generated
     */
    void setTf3( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC5A#getTf3 <em>Tf3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTf3()
     * @see #getTf3()
     * @see #setTf3(Double)
     * @generated
     */
    void unsetTf3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC5A#getTf3 <em>Tf3</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tf3</em>' attribute is set.
     * @see #unsetTf3()
     * @see #getTf3()
     * @see #setTf3(Double)
     * @generated
     */
    boolean isSetTf3();

    /**
     * Returns the value of the '<em><b>Tf2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Excitation control system stabilizer time constant (<i>T</i><i><sub>F2</sub></i>) (&gt;= 0).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tf2</em>' attribute.
     * @see #isSetTf2()
     * @see #unsetTf2()
     * @see #setTf2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEAC5A_Tf2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEAC5A.tf2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTf2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC5A#getTf2 <em>Tf2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tf2</em>' attribute.
     * @see #isSetTf2()
     * @see #unsetTf2()
     * @see #getTf2()
     * @generated
     */
    void setTf2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC5A#getTf2 <em>Tf2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTf2()
     * @see #getTf2()
     * @see #setTf2(Double)
     * @generated
     */
    void unsetTf2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC5A#getTf2 <em>Tf2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tf2</em>' attribute is set.
     * @see #unsetTf2()
     * @see #getTf2()
     * @see #setTf2(Double)
     * @generated
     */
    boolean isSetTf2();

    /**
     * Returns the value of the '<em><b>Tf1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Excitation control system stabilizer time constant (<i>T</i><i><sub>F1</sub></i>) (&gt; 0).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tf1</em>' attribute.
     * @see #isSetTf1()
     * @see #unsetTf1()
     * @see #setTf1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEAC5A_Tf1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEAC5A.tf1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTf1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC5A#getTf1 <em>Tf1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tf1</em>' attribute.
     * @see #isSetTf1()
     * @see #unsetTf1()
     * @see #getTf1()
     * @generated
     */
    void setTf1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC5A#getTf1 <em>Tf1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTf1()
     * @see #getTf1()
     * @see #setTf1(Double)
     * @generated
     */
    void unsetTf1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC5A#getTf1 <em>Tf1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tf1</em>' attribute is set.
     * @see #unsetTf1()
     * @see #getTf1()
     * @see #setTf1(Double)
     * @generated
     */
    boolean isSetTf1();

    /**
     * Returns the value of the '<em><b>Seefd2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Exciter saturation function value at the corresponding exciter voltage, <i>E</i><i><sub>FD2</sub></i> (<i>S</i><i><sub>E</sub></i><i>[E</i><i><sub>FD2</sub></i><i>]</i>) (&gt;= 0).  Typical value = 0,5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Seefd2</em>' attribute.
     * @see #isSetSeefd2()
     * @see #unsetSeefd2()
     * @see #setSeefd2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEAC5A_Seefd2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEAC5A.seefd2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getSeefd2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC5A#getSeefd2 <em>Seefd2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Seefd2</em>' attribute.
     * @see #isSetSeefd2()
     * @see #unsetSeefd2()
     * @see #getSeefd2()
     * @generated
     */
    void setSeefd2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC5A#getSeefd2 <em>Seefd2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSeefd2()
     * @see #getSeefd2()
     * @see #setSeefd2(Double)
     * @generated
     */
    void unsetSeefd2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC5A#getSeefd2 <em>Seefd2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Seefd2</em>' attribute is set.
     * @see #unsetSeefd2()
     * @see #getSeefd2()
     * @see #setSeefd2(Double)
     * @generated
     */
    boolean isSetSeefd2();

    /**
     * Returns the value of the '<em><b>Seefd1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Exciter saturation function value at the corresponding exciter voltage, <i>E</i><i><sub>FD1</sub></i> (<i>S</i><i><sub>E</sub></i><i>[E</i><i><sub>FD1</sub></i><i>]</i>) (&gt;= 0).  Typical value = 0,86.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Seefd1</em>' attribute.
     * @see #isSetSeefd1()
     * @see #unsetSeefd1()
     * @see #setSeefd1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEAC5A_Seefd1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEAC5A.seefd1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getSeefd1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC5A#getSeefd1 <em>Seefd1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Seefd1</em>' attribute.
     * @see #isSetSeefd1()
     * @see #unsetSeefd1()
     * @see #getSeefd1()
     * @generated
     */
    void setSeefd1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC5A#getSeefd1 <em>Seefd1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSeefd1()
     * @see #getSeefd1()
     * @see #setSeefd1(Double)
     * @generated
     */
    void unsetSeefd1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC5A#getSeefd1 <em>Seefd1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Seefd1</em>' attribute is set.
     * @see #unsetSeefd1()
     * @see #getSeefd1()
     * @see #setSeefd1(Double)
     * @generated
     */
    boolean isSetSeefd1();

    /**
     * Returns the value of the '<em><b>Ka</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Voltage regulator gain (<i>K</i><i><sub>A</sub></i>) (&gt; 0).  Typical value = 400.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ka</em>' attribute.
     * @see #isSetKa()
     * @see #unsetKa()
     * @see #setKa(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEAC5A_Ka()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEAC5A.ka' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKa();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC5A#getKa <em>Ka</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ka</em>' attribute.
     * @see #isSetKa()
     * @see #unsetKa()
     * @see #getKa()
     * @generated
     */
    void setKa( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC5A#getKa <em>Ka</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKa()
     * @see #getKa()
     * @see #setKa(Double)
     * @generated
     */
    void unsetKa();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC5A#getKa <em>Ka</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ka</em>' attribute is set.
     * @see #unsetKa()
     * @see #getKa()
     * @see #setKa(Double)
     * @generated
     */
    boolean isSetKa();

    /**
     * Returns the value of the '<em><b>Ke</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Exciter constant related to self-excited field (<i>K</i><i><sub>E</sub></i>).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ke</em>' attribute.
     * @see #isSetKe()
     * @see #unsetKe()
     * @see #setKe(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEAC5A_Ke()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEAC5A.ke' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKe();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC5A#getKe <em>Ke</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ke</em>' attribute.
     * @see #isSetKe()
     * @see #unsetKe()
     * @see #getKe()
     * @generated
     */
    void setKe( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC5A#getKe <em>Ke</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKe()
     * @see #getKe()
     * @see #setKe(Double)
     * @generated
     */
    void unsetKe();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC5A#getKe <em>Ke</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ke</em>' attribute is set.
     * @see #unsetKe()
     * @see #getKe()
     * @see #setKe(Double)
     * @generated
     */
    boolean isSetKe();

    /**
     * Returns the value of the '<em><b>Kf</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Excitation control system stabilizer gains (<i>K</i><i><sub>F</sub></i>) (&gt;= 0).  Typical value = 0,03.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kf</em>' attribute.
     * @see #isSetKf()
     * @see #unsetKf()
     * @see #setKf(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEAC5A_Kf()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEAC5A.kf' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKf();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC5A#getKf <em>Kf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kf</em>' attribute.
     * @see #isSetKf()
     * @see #unsetKf()
     * @see #getKf()
     * @generated
     */
    void setKf( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC5A#getKf <em>Kf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKf()
     * @see #getKf()
     * @see #setKf(Double)
     * @generated
     */
    void unsetKf();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC5A#getKf <em>Kf</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kf</em>' attribute is set.
     * @see #unsetKf()
     * @see #getKf()
     * @see #setKf(Double)
     * @generated
     */
    boolean isSetKf();

    /**
     * Returns the value of the '<em><b>Vrmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum voltage regulator output (<i>V</i><i><sub>RMAX</sub></i>) (&gt; 0).  Typical value = 7,3.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vrmax</em>' attribute.
     * @see #isSetVrmax()
     * @see #unsetVrmax()
     * @see #setVrmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEAC5A_Vrmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEAC5A.vrmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVrmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC5A#getVrmax <em>Vrmax</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC5A#getVrmax <em>Vrmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVrmax()
     * @see #getVrmax()
     * @see #setVrmax(Double)
     * @generated
     */
    void unsetVrmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC5A#getVrmax <em>Vrmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vrmax</em>' attribute is set.
     * @see #unsetVrmax()
     * @see #getVrmax()
     * @see #setVrmax(Double)
     * @generated
     */
    boolean isSetVrmax();

    /**
     * Returns the value of the '<em><b>Vrmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum voltage regulator output (<i>V</i><i><sub>RMIN</sub></i>) (&lt; 0).  Typical value = -7,3.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vrmin</em>' attribute.
     * @see #isSetVrmin()
     * @see #unsetVrmin()
     * @see #setVrmin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcIEEEAC5A_Vrmin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcIEEEAC5A.vrmin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVrmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC5A#getVrmin <em>Vrmin</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC5A#getVrmin <em>Vrmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVrmin()
     * @see #getVrmin()
     * @see #setVrmin(Double)
     * @generated
     */
    void unsetVrmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcIEEEAC5A#getVrmin <em>Vrmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vrmin</em>' attribute is set.
     * @see #unsetVrmin()
     * @see #getVrmin()
     * @see #setVrmin(Double)
     * @generated
     */
    boolean isSetVrmin();

} // ExcIEEEAC5A

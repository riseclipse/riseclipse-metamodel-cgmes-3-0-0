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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VComp IEEE Type2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <font color="#0f0f0f">Terminal voltage transducer and load compensator as defined in IEEE 421.5-2005, 4. This model is designed to cover the following types of compensation: </font>
 * <ul>
 * 	<li><font color="#0f0f0f">reactive droop;</font></li>
 * 	<li><font color="#0f0f0f">transformer-drop or line-drop compensation;</font></li>
 * 	<li><font color="#0f0f0f">reactive differential compensation known also as cross-current compensation.</font></li>
 * </ul>
 * <font color="#0f0f0f">Reference: IEEE 421.5-2005, 4.</font>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VCompIEEEType2#getGenICompensationForGenJ <em>Gen ICompensation For Gen J</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VCompIEEEType2#getTr <em>Tr</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getVCompIEEEType2()
 * @model
 * @generated
 */
public interface VCompIEEEType2 extends VoltageCompensatorDynamics {
    /**
     * Returns the value of the '<em><b>Gen ICompensation For Gen J</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GenICompensationForGenJ}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GenICompensationForGenJ#getVcompIEEEType2 <em>Vcomp IEEE Type2</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Compensation of this voltage compensator's generator for current flow out of another generator.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Gen ICompensation For Gen J</em>' reference list.
     * @see #isSetGenICompensationForGenJ()
     * @see #unsetGenICompensationForGenJ()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getVCompIEEEType2_GenICompensationForGenJ()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GenICompensationForGenJ#getVcompIEEEType2
     * @model opposite="VcompIEEEType2" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='VCompIEEEType2.GenICompensationForGenJ' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< GenICompensationForGenJ > getGenICompensationForGenJ();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VCompIEEEType2#getGenICompensationForGenJ <em>Gen ICompensation For Gen J</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGenICompensationForGenJ()
     * @see #getGenICompensationForGenJ()
     * @generated
     */
    void unsetGenICompensationForGenJ();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VCompIEEEType2#getGenICompensationForGenJ <em>Gen ICompensation For Gen J</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Gen ICompensation For Gen J</em>' reference list is set.
     * @see #unsetGenICompensationForGenJ()
     * @see #getGenICompensationForGenJ()
     * @generated
     */
    boolean isSetGenICompensationForGenJ();

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
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getVCompIEEEType2_Tr()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='VCompIEEEType2.tr' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTr();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VCompIEEEType2#getTr <em>Tr</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VCompIEEEType2#getTr <em>Tr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTr()
     * @see #getTr()
     * @see #setTr(Double)
     * @generated
     */
    void unsetTr();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VCompIEEEType2#getTr <em>Tr</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tr</em>' attribute is set.
     * @see #unsetTr()
     * @see #getTr()
     * @see #setTr(Double)
     * @generated
     */
    boolean isSetTr();

} // VCompIEEEType2

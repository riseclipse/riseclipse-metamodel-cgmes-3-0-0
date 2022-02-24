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
 * A representation of the model object '<em><b>Base Voltage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines a system base voltage which is referenced.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BaseVoltage#getNominalVoltage <em>Nominal Voltage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BaseVoltage#getConductingEquipment <em>Conducting Equipment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BaseVoltage#getVoltageLevel <em>Voltage Level</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BaseVoltage#getTransformerEnds <em>Transformer Ends</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BaseVoltage#getTopologicalNode <em>Topological Node</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getBaseVoltage()
 * @model
 * @generated
 */
public interface BaseVoltage extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Transformer Ends</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TransformerEnd}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TransformerEnd#getBaseVoltage <em>Base Voltage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Transformer ends at the base voltage.  This is essential for PU calculation.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Transformer Ends</em>' reference list.
     * @see #isSetTransformerEnds()
     * @see #unsetTransformerEnds()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getBaseVoltage_TransformerEnds()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TransformerEnd#getBaseVoltage
     * @model opposite="BaseVoltage" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='BaseVoltage.TransformerEnds' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< TransformerEnd > getTransformerEnds();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BaseVoltage#getTransformerEnds <em>Transformer Ends</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTransformerEnds()
     * @see #getTransformerEnds()
     * @generated
     */
    void unsetTransformerEnds();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BaseVoltage#getTransformerEnds <em>Transformer Ends</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Transformer Ends</em>' reference list is set.
     * @see #unsetTransformerEnds()
     * @see #getTransformerEnds()
     * @generated
     */
    boolean isSetTransformerEnds();

    /**
     * Returns the value of the '<em><b>Topological Node</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalNode}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalNode#getBaseVoltage <em>Base Voltage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The topological nodes at the base voltage.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Topological Node</em>' reference list.
     * @see #isSetTopologicalNode()
     * @see #unsetTopologicalNode()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getBaseVoltage_TopologicalNode()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TopologicalNode#getBaseVoltage
     * @model opposite="BaseVoltage" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='BaseVoltage.TopologicalNode' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< TopologicalNode > getTopologicalNode();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BaseVoltage#getTopologicalNode <em>Topological Node</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTopologicalNode()
     * @see #getTopologicalNode()
     * @generated
     */
    void unsetTopologicalNode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BaseVoltage#getTopologicalNode <em>Topological Node</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Topological Node</em>' reference list is set.
     * @see #unsetTopologicalNode()
     * @see #getTopologicalNode()
     * @generated
     */
    boolean isSetTopologicalNode();

    /**
     * Returns the value of the '<em><b>Conducting Equipment</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConductingEquipment}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConductingEquipment#getBaseVoltage <em>Base Voltage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * All conducting equipment with this base voltage.  Use only when there is no voltage level container used and only one base voltage applies.  For example, not used for transformers.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Conducting Equipment</em>' reference list.
     * @see #isSetConductingEquipment()
     * @see #unsetConductingEquipment()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getBaseVoltage_ConductingEquipment()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConductingEquipment#getBaseVoltage
     * @model opposite="BaseVoltage" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='BaseVoltage.ConductingEquipment' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< ConductingEquipment > getConductingEquipment();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BaseVoltage#getConductingEquipment <em>Conducting Equipment</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConductingEquipment()
     * @see #getConductingEquipment()
     * @generated
     */
    void unsetConductingEquipment();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BaseVoltage#getConductingEquipment <em>Conducting Equipment</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Conducting Equipment</em>' reference list is set.
     * @see #unsetConductingEquipment()
     * @see #getConductingEquipment()
     * @generated
     */
    boolean isSetConductingEquipment();

    /**
     * Returns the value of the '<em><b>Nominal Voltage</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The power system resource's base voltage.  Shall be a positive value and not zero.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Nominal Voltage</em>' attribute.
     * @see #isSetNominalVoltage()
     * @see #unsetNominalVoltage()
     * @see #setNominalVoltage(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getBaseVoltage_NominalVoltage()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Voltage" transient="true" ordered="false"
     *        extendedMetaData="name='BaseVoltage.nominalVoltage' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getNominalVoltage();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BaseVoltage#getNominalVoltage <em>Nominal Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Nominal Voltage</em>' attribute.
     * @see #isSetNominalVoltage()
     * @see #unsetNominalVoltage()
     * @see #getNominalVoltage()
     * @generated
     */
    void setNominalVoltage( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BaseVoltage#getNominalVoltage <em>Nominal Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNominalVoltage()
     * @see #getNominalVoltage()
     * @see #setNominalVoltage(Double)
     * @generated
     */
    void unsetNominalVoltage();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BaseVoltage#getNominalVoltage <em>Nominal Voltage</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Nominal Voltage</em>' attribute is set.
     * @see #unsetNominalVoltage()
     * @see #getNominalVoltage()
     * @see #setNominalVoltage(Double)
     * @generated
     */
    boolean isSetNominalVoltage();

    /**
     * Returns the value of the '<em><b>Voltage Level</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VoltageLevel}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VoltageLevel#getBaseVoltage <em>Base Voltage</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The voltage levels having this base voltage.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Voltage Level</em>' reference list.
     * @see #isSetVoltageLevel()
     * @see #unsetVoltageLevel()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getBaseVoltage_VoltageLevel()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VoltageLevel#getBaseVoltage
     * @model opposite="BaseVoltage" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='BaseVoltage.VoltageLevel' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< VoltageLevel > getVoltageLevel();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BaseVoltage#getVoltageLevel <em>Voltage Level</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVoltageLevel()
     * @see #getVoltageLevel()
     * @generated
     */
    void unsetVoltageLevel();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BaseVoltage#getVoltageLevel <em>Voltage Level</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Voltage Level</em>' reference list is set.
     * @see #unsetVoltageLevel()
     * @see #getVoltageLevel()
     * @generated
     */
    boolean isSetVoltageLevel();

} // BaseVoltage

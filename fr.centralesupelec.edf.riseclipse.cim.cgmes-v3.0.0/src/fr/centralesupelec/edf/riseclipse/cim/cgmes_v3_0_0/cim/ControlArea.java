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
 * A representation of the model object '<em><b>Control Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A control area is a grouping of generating units and/or loads and a cutset of tie lines (as terminals) which may be used for a variety of purposes including automatic generation control, power flow solution area interchange control specification, and input to load forecasting. All generation and load within the area defined by the terminals on the border are considered in the area interchange control. Note that any number of overlapping control area specifications can be superimposed on the physical model. The following general principles apply to ControlArea:
 * 1.  The control area orientation for net interchange is positive for an import, negative for an export.
 * 2.  The control area net interchange is determined by summing flows in Terminals. The Terminals are identified by creating a set of TieFlow objects associated with a ControlArea object. Each TieFlow object identifies one Terminal.
 * 3.  In a single network model, a tie between two control areas must be modelled in both control area specifications, such that the two representations of the tie flow sum to zero.
 * 4.  The normal orientation of Terminal flow is positive for flow into the conducting equipment that owns the Terminal. (i.e. flow from a bus into a device is positive.) However, the orientation of each flow in the control area specification must align with the control area convention, i.e. import is positive. If the orientation of the Terminal flow referenced by a TieFlow is positive into the control area, then this is confirmed by setting TieFlow.positiveFlowIn flag TRUE. If not, the orientation must be reversed by setting the TieFlow.positiveFlowIn flag FALSE.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ControlArea#getControlAreaGeneratingUnit <em>Control Area Generating Unit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ControlArea#getTieFlow <em>Tie Flow</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ControlArea#getType <em>Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ControlArea#getEnergyArea <em>Energy Area</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ControlArea#getPTolerance <em>PTolerance</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ControlArea#getNetInterchange <em>Net Interchange</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getControlArea()
 * @model
 * @generated
 */
public interface ControlArea extends PowerSystemResource {
    /**
     * Returns the value of the '<em><b>Tie Flow</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TieFlow}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TieFlow#getControlArea <em>Control Area</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The tie flows associated with the control area.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tie Flow</em>' reference list.
     * @see #isSetTieFlow()
     * @see #unsetTieFlow()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getControlArea_TieFlow()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TieFlow#getControlArea
     * @model opposite="ControlArea" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='ControlArea.TieFlow' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< TieFlow > getTieFlow();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ControlArea#getTieFlow <em>Tie Flow</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTieFlow()
     * @see #getTieFlow()
     * @generated
     */
    void unsetTieFlow();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ControlArea#getTieFlow <em>Tie Flow</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tie Flow</em>' reference list is set.
     * @see #unsetTieFlow()
     * @see #getTieFlow()
     * @generated
     */
    boolean isSetTieFlow();

    /**
     * Returns the value of the '<em><b>Energy Area</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergyArea#getControlArea <em>Control Area</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The energy area that is forecast from this control area specification.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Energy Area</em>' reference.
     * @see #isSetEnergyArea()
     * @see #unsetEnergyArea()
     * @see #setEnergyArea(EnergyArea)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getControlArea_EnergyArea()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergyArea#getControlArea
     * @model opposite="ControlArea" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='ControlArea.EnergyArea' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EnergyArea getEnergyArea();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ControlArea#getEnergyArea <em>Energy Area</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Energy Area</em>' reference.
     * @see #isSetEnergyArea()
     * @see #unsetEnergyArea()
     * @see #getEnergyArea()
     * @generated
     */
    void setEnergyArea( EnergyArea value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ControlArea#getEnergyArea <em>Energy Area</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEnergyArea()
     * @see #getEnergyArea()
     * @see #setEnergyArea(EnergyArea)
     * @generated
     */
    void unsetEnergyArea();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ControlArea#getEnergyArea <em>Energy Area</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Energy Area</em>' reference is set.
     * @see #unsetEnergyArea()
     * @see #getEnergyArea()
     * @see #setEnergyArea(EnergyArea)
     * @generated
     */
    boolean isSetEnergyArea();

    /**
     * Returns the value of the '<em><b>PTolerance</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Active power net interchange tolerance. The attribute shall be a positive value or zero.
     * <!-- end-model-doc -->
     * @return the value of the '<em>PTolerance</em>' attribute.
     * @see #isSetPTolerance()
     * @see #unsetPTolerance()
     * @see #setPTolerance(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getControlArea_PTolerance()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ActivePower" transient="true" ordered="false"
     *        extendedMetaData="name='ControlArea.pTolerance' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPTolerance();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ControlArea#getPTolerance <em>PTolerance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PTolerance</em>' attribute.
     * @see #isSetPTolerance()
     * @see #unsetPTolerance()
     * @see #getPTolerance()
     * @generated
     */
    void setPTolerance( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ControlArea#getPTolerance <em>PTolerance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPTolerance()
     * @see #getPTolerance()
     * @see #setPTolerance(Double)
     * @generated
     */
    void unsetPTolerance();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ControlArea#getPTolerance <em>PTolerance</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>PTolerance</em>' attribute is set.
     * @see #unsetPTolerance()
     * @see #getPTolerance()
     * @see #setPTolerance(Double)
     * @generated
     */
    boolean isSetPTolerance();

    /**
     * Returns the value of the '<em><b>Net Interchange</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The specified positive net interchange into the control area, i.e. positive sign means flow into the area.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Net Interchange</em>' attribute.
     * @see #isSetNetInterchange()
     * @see #unsetNetInterchange()
     * @see #setNetInterchange(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getControlArea_NetInterchange()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ActivePower" transient="true" ordered="false"
     *        extendedMetaData="name='ControlArea.netInterchange' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getNetInterchange();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ControlArea#getNetInterchange <em>Net Interchange</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Net Interchange</em>' attribute.
     * @see #isSetNetInterchange()
     * @see #unsetNetInterchange()
     * @see #getNetInterchange()
     * @generated
     */
    void setNetInterchange( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ControlArea#getNetInterchange <em>Net Interchange</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNetInterchange()
     * @see #getNetInterchange()
     * @see #setNetInterchange(Double)
     * @generated
     */
    void unsetNetInterchange();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ControlArea#getNetInterchange <em>Net Interchange</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Net Interchange</em>' attribute is set.
     * @see #unsetNetInterchange()
     * @see #getNetInterchange()
     * @see #setNetInterchange(Double)
     * @generated
     */
    boolean isSetNetInterchange();

    /**
     * Returns the value of the '<em><b>Control Area Generating Unit</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ControlAreaGeneratingUnit}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ControlAreaGeneratingUnit#getControlArea <em>Control Area</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The generating unit specifications for the control area.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Control Area Generating Unit</em>' reference list.
     * @see #isSetControlAreaGeneratingUnit()
     * @see #unsetControlAreaGeneratingUnit()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getControlArea_ControlAreaGeneratingUnit()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ControlAreaGeneratingUnit#getControlArea
     * @model opposite="ControlArea" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='ControlArea.ControlAreaGeneratingUnit' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< ControlAreaGeneratingUnit > getControlAreaGeneratingUnit();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ControlArea#getControlAreaGeneratingUnit <em>Control Area Generating Unit</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetControlAreaGeneratingUnit()
     * @see #getControlAreaGeneratingUnit()
     * @generated
     */
    void unsetControlAreaGeneratingUnit();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ControlArea#getControlAreaGeneratingUnit <em>Control Area Generating Unit</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Control Area Generating Unit</em>' reference list is set.
     * @see #unsetControlAreaGeneratingUnit()
     * @see #getControlAreaGeneratingUnit()
     * @generated
     */
    boolean isSetControlAreaGeneratingUnit();

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ControlAreaTypeKind}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The primary type of control area definition used to determine if this is used for automatic generation control, for planning interchange control, or other purposes.   A control area specified with primary type of automatic generation control could still be forecast and used as an interchange area in power flow analysis.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ControlAreaTypeKind
     * @see #isSetType()
     * @see #unsetType()
     * @see #setType(ControlAreaTypeKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getControlArea_Type()
     * @model unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='ControlArea.type' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    ControlAreaTypeKind getType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ControlArea#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ControlAreaTypeKind
     * @see #isSetType()
     * @see #unsetType()
     * @see #getType()
     * @generated
     */
    void setType( ControlAreaTypeKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ControlArea#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetType()
     * @see #getType()
     * @see #setType(ControlAreaTypeKind)
     * @generated
     */
    void unsetType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ControlArea#getType <em>Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Type</em>' attribute is set.
     * @see #unsetType()
     * @see #getType()
     * @see #setType(ControlAreaTypeKind)
     * @generated
     */
    boolean isSetType();

} // ControlArea

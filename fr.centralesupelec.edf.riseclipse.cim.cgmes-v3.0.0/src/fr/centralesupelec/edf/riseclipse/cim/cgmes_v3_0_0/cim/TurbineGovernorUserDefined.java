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
 * A representation of the model object '<em><b>Turbine Governor User Defined</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Turbine-governor function block whose dynamic behaviour is described by <font color="#0f0f0f">a user-defined model.</font>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbineGovernorUserDefined#getProprietaryParameterDynamics <em>Proprietary Parameter Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbineGovernorUserDefined#getProprietary <em>Proprietary</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTurbineGovernorUserDefined()
 * @model
 * @generated
 */
public interface TurbineGovernorUserDefined extends TurbineGovernorDynamics {
    /**
     * Returns the value of the '<em><b>Proprietary Parameter Dynamics</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getTurbineGovernorUserDefined <em>Turbine Governor User Defined</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Parameter of this proprietary user-defined model.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Proprietary Parameter Dynamics</em>' reference list.
     * @see #isSetProprietaryParameterDynamics()
     * @see #unsetProprietaryParameterDynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTurbineGovernorUserDefined_ProprietaryParameterDynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ProprietaryParameterDynamics#getTurbineGovernorUserDefined
     * @model opposite="TurbineGovernorUserDefined" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='TurbineGovernorUserDefined.ProprietaryParameterDynamics' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< ProprietaryParameterDynamics > getProprietaryParameterDynamics();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbineGovernorUserDefined#getProprietaryParameterDynamics <em>Proprietary Parameter Dynamics</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetProprietaryParameterDynamics()
     * @see #getProprietaryParameterDynamics()
     * @generated
     */
    void unsetProprietaryParameterDynamics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbineGovernorUserDefined#getProprietaryParameterDynamics <em>Proprietary Parameter Dynamics</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Proprietary Parameter Dynamics</em>' reference list is set.
     * @see #unsetProprietaryParameterDynamics()
     * @see #getProprietaryParameterDynamics()
     * @generated
     */
    boolean isSetProprietaryParameterDynamics();

    /**
     * Returns the value of the '<em><b>Proprietary</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Behaviour is based on a proprietary model as opposed to a detailed model.
     * true = user-defined model is proprietary with behaviour mutually understood by sending and receiving applications and parameters passed as general attributes
     * false = user-defined model is explicitly defined in terms of control blocks and their input and output signals.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Proprietary</em>' attribute.
     * @see #isSetProprietary()
     * @see #unsetProprietary()
     * @see #setProprietary(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTurbineGovernorUserDefined_Proprietary()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='TurbineGovernorUserDefined.proprietary' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getProprietary();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbineGovernorUserDefined#getProprietary <em>Proprietary</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Proprietary</em>' attribute.
     * @see #isSetProprietary()
     * @see #unsetProprietary()
     * @see #getProprietary()
     * @generated
     */
    void setProprietary( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbineGovernorUserDefined#getProprietary <em>Proprietary</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetProprietary()
     * @see #getProprietary()
     * @see #setProprietary(Boolean)
     * @generated
     */
    void unsetProprietary();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbineGovernorUserDefined#getProprietary <em>Proprietary</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Proprietary</em>' attribute is set.
     * @see #unsetProprietary()
     * @see #getProprietary()
     * @see #setProprietary(Boolean)
     * @generated
     */
    boolean isSetProprietary();

} // TurbineGovernorUserDefined

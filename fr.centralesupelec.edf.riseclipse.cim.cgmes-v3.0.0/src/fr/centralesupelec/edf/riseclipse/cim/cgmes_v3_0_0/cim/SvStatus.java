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
 * A representation of the model object '<em><b>Sv Status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * State variable for status.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvStatus#getInService <em>In Service</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvStatus#getConductingEquipment <em>Conducting Equipment</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSvStatus()
 * @model
 * @generated
 */
public interface SvStatus extends CimObjectWithID {
    /**
     * Returns the value of the '<em><b>In Service</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The in service status as a result of topology processing.  It indicates if the equipment is considered as energized by the power flow. It reflects if the equipment is connected within a solvable island.  It does not necessarily reflect whether or not the island was solved by the power flow.
     * <!-- end-model-doc -->
     * @return the value of the '<em>In Service</em>' attribute.
     * @see #isSetInService()
     * @see #unsetInService()
     * @see #setInService(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSvStatus_InService()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='SvStatus.inService' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getInService();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvStatus#getInService <em>In Service</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>In Service</em>' attribute.
     * @see #isSetInService()
     * @see #unsetInService()
     * @see #getInService()
     * @generated
     */
    void setInService( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvStatus#getInService <em>In Service</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetInService()
     * @see #getInService()
     * @see #setInService(Boolean)
     * @generated
     */
    void unsetInService();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvStatus#getInService <em>In Service</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>In Service</em>' attribute is set.
     * @see #unsetInService()
     * @see #getInService()
     * @see #setInService(Boolean)
     * @generated
     */
    boolean isSetInService();

    /**
     * Returns the value of the '<em><b>Conducting Equipment</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConductingEquipment#getSvStatus <em>Sv Status</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The conducting equipment associated with the status state variable.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Conducting Equipment</em>' reference.
     * @see #isSetConductingEquipment()
     * @see #unsetConductingEquipment()
     * @see #setConductingEquipment(ConductingEquipment)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSvStatus_ConductingEquipment()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConductingEquipment#getSvStatus
     * @model opposite="SvStatus" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='SvStatus.ConductingEquipment' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    ConductingEquipment getConductingEquipment();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvStatus#getConductingEquipment <em>Conducting Equipment</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Conducting Equipment</em>' reference.
     * @see #isSetConductingEquipment()
     * @see #unsetConductingEquipment()
     * @see #getConductingEquipment()
     * @generated
     */
    void setConductingEquipment( ConductingEquipment value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvStatus#getConductingEquipment <em>Conducting Equipment</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConductingEquipment()
     * @see #getConductingEquipment()
     * @see #setConductingEquipment(ConductingEquipment)
     * @generated
     */
    void unsetConductingEquipment();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvStatus#getConductingEquipment <em>Conducting Equipment</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Conducting Equipment</em>' reference is set.
     * @see #unsetConductingEquipment()
     * @see #getConductingEquipment()
     * @see #setConductingEquipment(ConductingEquipment)
     * @generated
     */
    boolean isSetConductingEquipment();

} // SvStatus

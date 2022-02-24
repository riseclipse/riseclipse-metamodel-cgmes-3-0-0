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
 * A representation of the model object '<em><b>Equipment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The parts of a power system that are physical devices, electronic or mechanical.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Equipment#getEquipmentContainer <em>Equipment Container</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Equipment#getAggregate <em>Aggregate</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Equipment#getOperationalLimitSet <em>Operational Limit Set</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Equipment#getNormallyInService <em>Normally In Service</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Equipment#getInService <em>In Service</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEquipment()
 * @model
 * @generated
 */
public interface Equipment extends PowerSystemResource {
    /**
     * Returns the value of the '<em><b>Normally In Service</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Specifies the availability of the equipment under normal operating conditions. True means the equipment is available for topology processing, which determines if the equipment is energized or not. False means that the equipment is treated by network applications as if it is not in the model.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Normally In Service</em>' attribute.
     * @see #isSetNormallyInService()
     * @see #unsetNormallyInService()
     * @see #setNormallyInService(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEquipment_NormallyInService()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='Equipment.normallyInService' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getNormallyInService();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Equipment#getNormallyInService <em>Normally In Service</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Normally In Service</em>' attribute.
     * @see #isSetNormallyInService()
     * @see #unsetNormallyInService()
     * @see #getNormallyInService()
     * @generated
     */
    void setNormallyInService( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Equipment#getNormallyInService <em>Normally In Service</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNormallyInService()
     * @see #getNormallyInService()
     * @see #setNormallyInService(Boolean)
     * @generated
     */
    void unsetNormallyInService();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Equipment#getNormallyInService <em>Normally In Service</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Normally In Service</em>' attribute is set.
     * @see #unsetNormallyInService()
     * @see #getNormallyInService()
     * @see #setNormallyInService(Boolean)
     * @generated
     */
    boolean isSetNormallyInService();

    /**
     * Returns the value of the '<em><b>In Service</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Specifies the availability of the equipment. True means the equipment is available for topology processing, which determines if the equipment is energized or not. False means that the equipment is treated by network applications as if it is not in the model.
     * <!-- end-model-doc -->
     * @return the value of the '<em>In Service</em>' attribute.
     * @see #isSetInService()
     * @see #unsetInService()
     * @see #setInService(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEquipment_InService()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='Equipment.inService' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getInService();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Equipment#getInService <em>In Service</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Equipment#getInService <em>In Service</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetInService()
     * @see #getInService()
     * @see #setInService(Boolean)
     * @generated
     */
    void unsetInService();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Equipment#getInService <em>In Service</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Aggregate</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The aggregate flag provides an alternative way of representing an aggregated (equivalent) element. It is applicable in cases when the dedicated classes for equivalent equipment do not have all of the attributes necessary to represent the required level of detail.  In case the flag is set to “true” the single instance of equipment represents multiple pieces of equipment that have been modelled together as an aggregate equivalent obtained by a network reduction procedure. Examples would be power transformers or synchronous machines operating in parallel modelled as a single aggregate power transformer or aggregate synchronous machine.
     * The attribute is not used for EquivalentBranch, EquivalentShunt and EquivalentInjection.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Aggregate</em>' attribute.
     * @see #isSetAggregate()
     * @see #unsetAggregate()
     * @see #setAggregate(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEquipment_Aggregate()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='Equipment.aggregate' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getAggregate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Equipment#getAggregate <em>Aggregate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Aggregate</em>' attribute.
     * @see #isSetAggregate()
     * @see #unsetAggregate()
     * @see #getAggregate()
     * @generated
     */
    void setAggregate( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Equipment#getAggregate <em>Aggregate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAggregate()
     * @see #getAggregate()
     * @see #setAggregate(Boolean)
     * @generated
     */
    void unsetAggregate();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Equipment#getAggregate <em>Aggregate</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Aggregate</em>' attribute is set.
     * @see #unsetAggregate()
     * @see #getAggregate()
     * @see #setAggregate(Boolean)
     * @generated
     */
    boolean isSetAggregate();

    /**
     * Returns the value of the '<em><b>Equipment Container</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquipmentContainer#getEquipments <em>Equipments</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Container of this equipment.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Equipment Container</em>' reference.
     * @see #isSetEquipmentContainer()
     * @see #unsetEquipmentContainer()
     * @see #setEquipmentContainer(EquipmentContainer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEquipment_EquipmentContainer()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquipmentContainer#getEquipments
     * @model opposite="Equipments" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='Equipment.EquipmentContainer' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EquipmentContainer getEquipmentContainer();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Equipment#getEquipmentContainer <em>Equipment Container</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Equipment Container</em>' reference.
     * @see #isSetEquipmentContainer()
     * @see #unsetEquipmentContainer()
     * @see #getEquipmentContainer()
     * @generated
     */
    void setEquipmentContainer( EquipmentContainer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Equipment#getEquipmentContainer <em>Equipment Container</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEquipmentContainer()
     * @see #getEquipmentContainer()
     * @see #setEquipmentContainer(EquipmentContainer)
     * @generated
     */
    void unsetEquipmentContainer();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Equipment#getEquipmentContainer <em>Equipment Container</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Equipment Container</em>' reference is set.
     * @see #unsetEquipmentContainer()
     * @see #getEquipmentContainer()
     * @see #setEquipmentContainer(EquipmentContainer)
     * @generated
     */
    boolean isSetEquipmentContainer();

    /**
     * Returns the value of the '<em><b>Operational Limit Set</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimitSet}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimitSet#getEquipment <em>Equipment</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The operational limit sets associated with this equipment.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Operational Limit Set</em>' reference list.
     * @see #isSetOperationalLimitSet()
     * @see #unsetOperationalLimitSet()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEquipment_OperationalLimitSet()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimitSet#getEquipment
     * @model opposite="Equipment" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='Equipment.OperationalLimitSet' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< OperationalLimitSet > getOperationalLimitSet();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Equipment#getOperationalLimitSet <em>Operational Limit Set</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOperationalLimitSet()
     * @see #getOperationalLimitSet()
     * @generated
     */
    void unsetOperationalLimitSet();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Equipment#getOperationalLimitSet <em>Operational Limit Set</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Operational Limit Set</em>' reference list is set.
     * @see #unsetOperationalLimitSet()
     * @see #getOperationalLimitSet()
     * @generated
     */
    boolean isSetOperationalLimitSet();

} // Equipment

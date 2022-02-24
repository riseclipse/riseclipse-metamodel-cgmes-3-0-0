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
 * A representation of the model object '<em><b>Equivalent Equipment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The class represents equivalent objects that are the result of a network reduction. The class is the base for equivalent objects of different types.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentEquipment#getEquivalentNetwork <em>Equivalent Network</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEquivalentEquipment()
 * @model
 * @generated
 */
public interface EquivalentEquipment extends ConductingEquipment {
    /**
     * Returns the value of the '<em><b>Equivalent Network</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentNetwork#getEquivalentEquipments <em>Equivalent Equipments</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The equivalent where the reduced model belongs.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Equivalent Network</em>' reference.
     * @see #isSetEquivalentNetwork()
     * @see #unsetEquivalentNetwork()
     * @see #setEquivalentNetwork(EquivalentNetwork)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEquivalentEquipment_EquivalentNetwork()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentNetwork#getEquivalentEquipments
     * @model opposite="EquivalentEquipments" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='EquivalentEquipment.EquivalentNetwork' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EquivalentNetwork getEquivalentNetwork();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentEquipment#getEquivalentNetwork <em>Equivalent Network</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Equivalent Network</em>' reference.
     * @see #isSetEquivalentNetwork()
     * @see #unsetEquivalentNetwork()
     * @see #getEquivalentNetwork()
     * @generated
     */
    void setEquivalentNetwork( EquivalentNetwork value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentEquipment#getEquivalentNetwork <em>Equivalent Network</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEquivalentNetwork()
     * @see #getEquivalentNetwork()
     * @see #setEquivalentNetwork(EquivalentNetwork)
     * @generated
     */
    void unsetEquivalentNetwork();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentEquipment#getEquivalentNetwork <em>Equivalent Network</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Equivalent Network</em>' reference is set.
     * @see #unsetEquivalentNetwork()
     * @see #getEquivalentNetwork()
     * @see #setEquivalentNetwork(EquivalentNetwork)
     * @generated
     */
    boolean isSetEquivalentNetwork();

} // EquivalentEquipment

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
 * A representation of the model object '<em><b>Busbar Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A conductor, or group of conductors, with negligible impedance, that serve to connect other conducting equipment within a single substation.
 * Voltage measurements are typically obtained from voltage transformers that are connected to busbar sections. A bus bar section may have many physical terminals but for analysis is modelled with exactly one logical terminal.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BusbarSection#getIpMax <em>Ip Max</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getBusbarSection()
 * @model
 * @generated
 */
public interface BusbarSection extends Connector {

    /**
     * Returns the value of the '<em><b>Ip Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum allowable peak short-circuit current of busbar (Ipmax in IEC 60909-0).
     * Mechanical limit of the busbar in the substation itself. Used for short circuit data exchange according to IEC 60909.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ip Max</em>' attribute.
     * @see #isSetIpMax()
     * @see #unsetIpMax()
     * @see #setIpMax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getBusbarSection_IpMax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CurrentFlow" transient="true" ordered="false"
     *        extendedMetaData="name='BusbarSection.ipMax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getIpMax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BusbarSection#getIpMax <em>Ip Max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ip Max</em>' attribute.
     * @see #isSetIpMax()
     * @see #unsetIpMax()
     * @see #getIpMax()
     * @generated
     */
    void setIpMax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BusbarSection#getIpMax <em>Ip Max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIpMax()
     * @see #getIpMax()
     * @see #setIpMax(Double)
     * @generated
     */
    void unsetIpMax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BusbarSection#getIpMax <em>Ip Max</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ip Max</em>' attribute is set.
     * @see #unsetIpMax()
     * @see #getIpMax()
     * @see #setIpMax(Double)
     * @generated
     */
    boolean isSetIpMax();
} // BusbarSection

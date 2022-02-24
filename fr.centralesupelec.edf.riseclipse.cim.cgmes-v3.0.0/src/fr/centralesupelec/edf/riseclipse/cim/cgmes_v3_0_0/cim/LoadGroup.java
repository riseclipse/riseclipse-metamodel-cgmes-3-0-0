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
 * A representation of the model object '<em><b>Load Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The class is the third level in a hierarchical structure for grouping of loads for the purpose of load flow load scaling.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadGroup#getSubLoadArea <em>Sub Load Area</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadGroup()
 * @model
 * @generated
 */
public interface LoadGroup extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Sub Load Area</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SubLoadArea#getLoadGroups <em>Load Groups</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The SubLoadArea where the Loadgroup belongs.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Sub Load Area</em>' reference.
     * @see #isSetSubLoadArea()
     * @see #unsetSubLoadArea()
     * @see #setSubLoadArea(SubLoadArea)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadGroup_SubLoadArea()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SubLoadArea#getLoadGroups
     * @model opposite="LoadGroups" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='LoadGroup.SubLoadArea' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    SubLoadArea getSubLoadArea();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadGroup#getSubLoadArea <em>Sub Load Area</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sub Load Area</em>' reference.
     * @see #isSetSubLoadArea()
     * @see #unsetSubLoadArea()
     * @see #getSubLoadArea()
     * @generated
     */
    void setSubLoadArea( SubLoadArea value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadGroup#getSubLoadArea <em>Sub Load Area</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSubLoadArea()
     * @see #getSubLoadArea()
     * @see #setSubLoadArea(SubLoadArea)
     * @generated
     */
    void unsetSubLoadArea();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadGroup#getSubLoadArea <em>Sub Load Area</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sub Load Area</em>' reference is set.
     * @see #unsetSubLoadArea()
     * @see #getSubLoadArea()
     * @see #setSubLoadArea(SubLoadArea)
     * @generated
     */
    boolean isSetSubLoadArea();

} // LoadGroup

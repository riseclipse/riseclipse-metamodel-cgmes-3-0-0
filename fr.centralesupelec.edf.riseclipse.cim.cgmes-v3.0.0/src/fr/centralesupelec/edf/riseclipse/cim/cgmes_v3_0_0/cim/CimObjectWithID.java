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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object With ID</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimObjectWithID#getID <em>ID</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getCimObjectWithID()
 * @model
 * @generated
 */
public interface CimObjectWithID extends EObject {

    /**
     * Returns the value of the '<em><b>ID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>ID</em>' attribute.
     * @see #isSetID()
     * @see #unsetID()
     * @see #setID(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getCimObjectWithID_ID()
     * @model unsettable="true" id="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.String" required="true" ordered="false"
     *        extendedMetaData="kind='attribute' namespace='http://www.w3.org/1999/02/22-rdf-syntax-ns'"
     * @generated
     */
    String getID();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimObjectWithID#getID <em>ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ID</em>' attribute.
     * @see #isSetID()
     * @see #unsetID()
     * @see #getID()
     * @generated
     */
    void setID( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimObjectWithID#getID <em>ID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetID()
     * @see #getID()
     * @see #setID(String)
     * @generated
     */
    void unsetID();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimObjectWithID#getID <em>ID</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>ID</em>' attribute is set.
     * @see #unsetID()
     * @see #getID()
     * @see #setID(String)
     * @generated
     */
    boolean isSetID();
} // CimObjectWithID

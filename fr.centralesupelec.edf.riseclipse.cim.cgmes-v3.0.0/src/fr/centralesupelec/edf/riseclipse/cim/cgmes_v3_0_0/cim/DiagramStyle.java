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
 * A representation of the model object '<em><b>Diagram Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The diagram style refers to a style used by the originating system for a diagram.  A diagram style describes information such as schematic, geographic, etc.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramStyle#getDiagram <em>Diagram</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiagramStyle()
 * @model
 * @generated
 */
public interface DiagramStyle extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Diagram</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Diagram}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Diagram#getDiagramStyle <em>Diagram Style</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A DiagramStyle can be used by many Diagrams.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Diagram</em>' reference list.
     * @see #isSetDiagram()
     * @see #unsetDiagram()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiagramStyle_Diagram()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Diagram#getDiagramStyle
     * @model opposite="DiagramStyle" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='DiagramStyle.Diagram' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< Diagram > getDiagram();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramStyle#getDiagram <em>Diagram</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDiagram()
     * @see #getDiagram()
     * @generated
     */
    void unsetDiagram();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramStyle#getDiagram <em>Diagram</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Diagram</em>' reference list is set.
     * @see #unsetDiagram()
     * @see #getDiagram()
     * @generated
     */
    boolean isSetDiagram();

} // DiagramStyle

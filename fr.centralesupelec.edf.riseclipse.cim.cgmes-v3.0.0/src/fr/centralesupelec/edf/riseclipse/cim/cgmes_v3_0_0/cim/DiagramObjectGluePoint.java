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
 * A representation of the model object '<em><b>Diagram Object Glue Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is used for grouping diagram object points from different diagram objects that are considered to be glued together in a diagram even if they are not at the exact same coordinates.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObjectGluePoint#getDiagramObjectPoints <em>Diagram Object Points</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiagramObjectGluePoint()
 * @model
 * @generated
 */
public interface DiagramObjectGluePoint extends CimObjectWithID {
    /**
     * Returns the value of the '<em><b>Diagram Object Points</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObjectPoint}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObjectPoint#getDiagramObjectGluePoint <em>Diagram Object Glue Point</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A diagram object glue point is associated with 2 or more object points that are considered to be 'glued' together.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Diagram Object Points</em>' reference list.
     * @see #isSetDiagramObjectPoints()
     * @see #unsetDiagramObjectPoints()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiagramObjectGluePoint_DiagramObjectPoints()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObjectPoint#getDiagramObjectGluePoint
     * @model opposite="DiagramObjectGluePoint" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='DiagramObjectGluePoint.DiagramObjectPoints' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< DiagramObjectPoint > getDiagramObjectPoints();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObjectGluePoint#getDiagramObjectPoints <em>Diagram Object Points</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDiagramObjectPoints()
     * @see #getDiagramObjectPoints()
     * @generated
     */
    void unsetDiagramObjectPoints();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObjectGluePoint#getDiagramObjectPoints <em>Diagram Object Points</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Diagram Object Points</em>' reference list is set.
     * @see #unsetDiagramObjectPoints()
     * @see #getDiagramObjectPoints()
     * @generated
     */
    boolean isSetDiagramObjectPoints();

} // DiagramObjectGluePoint

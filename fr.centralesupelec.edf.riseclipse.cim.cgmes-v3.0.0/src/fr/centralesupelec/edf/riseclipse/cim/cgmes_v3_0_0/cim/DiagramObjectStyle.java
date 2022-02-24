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
 * A representation of the model object '<em><b>Diagram Object Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A reference to a style used by the originating system for a diagram object.  A diagram object style describes information such as line thickness, shape such as circle or rectangle etc, and colour.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObjectStyle#getStyledObjects <em>Styled Objects</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiagramObjectStyle()
 * @model
 * @generated
 */
public interface DiagramObjectStyle extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Styled Objects</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObject}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObject#getDiagramObjectStyle <em>Diagram Object Style</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A style can be assigned to multiple diagram objects.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Styled Objects</em>' reference list.
     * @see #isSetStyledObjects()
     * @see #unsetStyledObjects()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiagramObjectStyle_StyledObjects()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObject#getDiagramObjectStyle
     * @model opposite="DiagramObjectStyle" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='DiagramObjectStyle.StyledObjects' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< DiagramObject > getStyledObjects();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObjectStyle#getStyledObjects <em>Styled Objects</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStyledObjects()
     * @see #getStyledObjects()
     * @generated
     */
    void unsetStyledObjects();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObjectStyle#getStyledObjects <em>Styled Objects</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Styled Objects</em>' reference list is set.
     * @see #unsetStyledObjects()
     * @see #getStyledObjects()
     * @generated
     */
    boolean isSetStyledObjects();

} // DiagramObjectStyle

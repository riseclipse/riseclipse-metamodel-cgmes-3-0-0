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
 * A representation of the model object '<em><b>Diagram</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The diagram being exchanged. The coordinate system is a standard Cartesian coordinate system and the orientation attribute defines the orientation. The initial view related attributes can be used to specify an initial view with the x,y coordinates of the diagonal points.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Diagram#getX1InitialView <em>X1 Initial View</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Diagram#getY1InitialView <em>Y1 Initial View</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Diagram#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Diagram#getY2InitialView <em>Y2 Initial View</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Diagram#getDiagramElements <em>Diagram Elements</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Diagram#getX2InitialView <em>X2 Initial View</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Diagram#getDiagramStyle <em>Diagram Style</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiagram()
 * @model
 * @generated
 */
public interface Diagram extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>X1 Initial View</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * X coordinate of the first corner of the initial view.
     * <!-- end-model-doc -->
     * @return the value of the '<em>X1 Initial View</em>' attribute.
     * @see #isSetX1InitialView()
     * @see #unsetX1InitialView()
     * @see #setX1InitialView(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiagram_X1InitialView()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='Diagram.x1InitialView' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getX1InitialView();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Diagram#getX1InitialView <em>X1 Initial View</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>X1 Initial View</em>' attribute.
     * @see #isSetX1InitialView()
     * @see #unsetX1InitialView()
     * @see #getX1InitialView()
     * @generated
     */
    void setX1InitialView( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Diagram#getX1InitialView <em>X1 Initial View</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetX1InitialView()
     * @see #getX1InitialView()
     * @see #setX1InitialView(Double)
     * @generated
     */
    void unsetX1InitialView();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Diagram#getX1InitialView <em>X1 Initial View</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>X1 Initial View</em>' attribute is set.
     * @see #unsetX1InitialView()
     * @see #getX1InitialView()
     * @see #setX1InitialView(Double)
     * @generated
     */
    boolean isSetX1InitialView();

    /**
     * Returns the value of the '<em><b>Y1 Initial View</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Y coordinate of the first corner of the initial view.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Y1 Initial View</em>' attribute.
     * @see #isSetY1InitialView()
     * @see #unsetY1InitialView()
     * @see #setY1InitialView(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiagram_Y1InitialView()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='Diagram.y1InitialView' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getY1InitialView();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Diagram#getY1InitialView <em>Y1 Initial View</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Y1 Initial View</em>' attribute.
     * @see #isSetY1InitialView()
     * @see #unsetY1InitialView()
     * @see #getY1InitialView()
     * @generated
     */
    void setY1InitialView( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Diagram#getY1InitialView <em>Y1 Initial View</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetY1InitialView()
     * @see #getY1InitialView()
     * @see #setY1InitialView(Double)
     * @generated
     */
    void unsetY1InitialView();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Diagram#getY1InitialView <em>Y1 Initial View</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Y1 Initial View</em>' attribute is set.
     * @see #unsetY1InitialView()
     * @see #getY1InitialView()
     * @see #setY1InitialView(Double)
     * @generated
     */
    boolean isSetY1InitialView();

    /**
     * Returns the value of the '<em><b>Orientation</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OrientationKind}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Coordinate system orientation of the diagram. A positive orientation gives standard “right-hand” orientation, with negative orientation indicating a “left-hand” orientation. For 2D diagrams, a positive orientation will result in X values increasing from left to right and Y values increasing from bottom to top. A negative orientation gives the “left-hand” orientation (favoured by computer graphics displays) with X values increasing from left to right and Y values increasing from top to bottom.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Orientation</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OrientationKind
     * @see #isSetOrientation()
     * @see #unsetOrientation()
     * @see #setOrientation(OrientationKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiagram_Orientation()
     * @model unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='Diagram.orientation' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    OrientationKind getOrientation();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Diagram#getOrientation <em>Orientation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Orientation</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OrientationKind
     * @see #isSetOrientation()
     * @see #unsetOrientation()
     * @see #getOrientation()
     * @generated
     */
    void setOrientation( OrientationKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Diagram#getOrientation <em>Orientation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOrientation()
     * @see #getOrientation()
     * @see #setOrientation(OrientationKind)
     * @generated
     */
    void unsetOrientation();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Diagram#getOrientation <em>Orientation</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Orientation</em>' attribute is set.
     * @see #unsetOrientation()
     * @see #getOrientation()
     * @see #setOrientation(OrientationKind)
     * @generated
     */
    boolean isSetOrientation();

    /**
     * Returns the value of the '<em><b>Y2 Initial View</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Y coordinate of the second corner of the initial view.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Y2 Initial View</em>' attribute.
     * @see #isSetY2InitialView()
     * @see #unsetY2InitialView()
     * @see #setY2InitialView(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiagram_Y2InitialView()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='Diagram.y2InitialView' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getY2InitialView();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Diagram#getY2InitialView <em>Y2 Initial View</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Y2 Initial View</em>' attribute.
     * @see #isSetY2InitialView()
     * @see #unsetY2InitialView()
     * @see #getY2InitialView()
     * @generated
     */
    void setY2InitialView( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Diagram#getY2InitialView <em>Y2 Initial View</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetY2InitialView()
     * @see #getY2InitialView()
     * @see #setY2InitialView(Double)
     * @generated
     */
    void unsetY2InitialView();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Diagram#getY2InitialView <em>Y2 Initial View</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Y2 Initial View</em>' attribute is set.
     * @see #unsetY2InitialView()
     * @see #getY2InitialView()
     * @see #setY2InitialView(Double)
     * @generated
     */
    boolean isSetY2InitialView();

    /**
     * Returns the value of the '<em><b>Diagram Elements</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObject}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObject#getDiagram <em>Diagram</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A diagram is made up of multiple diagram objects.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Diagram Elements</em>' reference list.
     * @see #isSetDiagramElements()
     * @see #unsetDiagramElements()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiagram_DiagramElements()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObject#getDiagram
     * @model opposite="Diagram" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='Diagram.DiagramElements' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< DiagramObject > getDiagramElements();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Diagram#getDiagramElements <em>Diagram Elements</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDiagramElements()
     * @see #getDiagramElements()
     * @generated
     */
    void unsetDiagramElements();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Diagram#getDiagramElements <em>Diagram Elements</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Diagram Elements</em>' reference list is set.
     * @see #unsetDiagramElements()
     * @see #getDiagramElements()
     * @generated
     */
    boolean isSetDiagramElements();

    /**
     * Returns the value of the '<em><b>X2 Initial View</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * X coordinate of the second corner of the initial view.
     * <!-- end-model-doc -->
     * @return the value of the '<em>X2 Initial View</em>' attribute.
     * @see #isSetX2InitialView()
     * @see #unsetX2InitialView()
     * @see #setX2InitialView(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiagram_X2InitialView()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='Diagram.x2InitialView' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getX2InitialView();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Diagram#getX2InitialView <em>X2 Initial View</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>X2 Initial View</em>' attribute.
     * @see #isSetX2InitialView()
     * @see #unsetX2InitialView()
     * @see #getX2InitialView()
     * @generated
     */
    void setX2InitialView( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Diagram#getX2InitialView <em>X2 Initial View</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetX2InitialView()
     * @see #getX2InitialView()
     * @see #setX2InitialView(Double)
     * @generated
     */
    void unsetX2InitialView();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Diagram#getX2InitialView <em>X2 Initial View</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>X2 Initial View</em>' attribute is set.
     * @see #unsetX2InitialView()
     * @see #getX2InitialView()
     * @see #setX2InitialView(Double)
     * @generated
     */
    boolean isSetX2InitialView();

    /**
     * Returns the value of the '<em><b>Diagram Style</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramStyle#getDiagram <em>Diagram</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A Diagram may have a DiagramStyle.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Diagram Style</em>' reference.
     * @see #isSetDiagramStyle()
     * @see #unsetDiagramStyle()
     * @see #setDiagramStyle(DiagramStyle)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiagram_DiagramStyle()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramStyle#getDiagram
     * @model opposite="Diagram" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='Diagram.DiagramStyle' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    DiagramStyle getDiagramStyle();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Diagram#getDiagramStyle <em>Diagram Style</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Diagram Style</em>' reference.
     * @see #isSetDiagramStyle()
     * @see #unsetDiagramStyle()
     * @see #getDiagramStyle()
     * @generated
     */
    void setDiagramStyle( DiagramStyle value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Diagram#getDiagramStyle <em>Diagram Style</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDiagramStyle()
     * @see #getDiagramStyle()
     * @see #setDiagramStyle(DiagramStyle)
     * @generated
     */
    void unsetDiagramStyle();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Diagram#getDiagramStyle <em>Diagram Style</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Diagram Style</em>' reference is set.
     * @see #unsetDiagramStyle()
     * @see #getDiagramStyle()
     * @see #setDiagramStyle(DiagramStyle)
     * @generated
     */
    boolean isSetDiagramStyle();

} // Diagram

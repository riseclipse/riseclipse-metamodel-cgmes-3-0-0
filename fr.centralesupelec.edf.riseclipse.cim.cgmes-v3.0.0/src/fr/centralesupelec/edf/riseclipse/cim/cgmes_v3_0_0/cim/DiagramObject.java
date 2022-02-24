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

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An object that defines one or more points in a given space. This object can be associated with anything that specializes IdentifiedObject. For single line diagrams such objects typically include such items as analog values, breakers, disconnectors, power transformers, and transmission lines.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObject#getRotation <em>Rotation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObject#getDiagramObjectStyle <em>Diagram Object Style</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObject#getIdentifiedObject <em>Identified Object</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObject#getIsPolygon <em>Is Polygon</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObject#getDrawingOrder <em>Drawing Order</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObject#getOffsetY <em>Offset Y</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObject#getOffsetX <em>Offset X</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObject#getDiagram <em>Diagram</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObject#getVisibilityLayers <em>Visibility Layers</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObject#getDiagramObjectPoints <em>Diagram Object Points</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiagramObject()
 * @model
 * @generated
 */
public interface DiagramObject extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Rotation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Sets the angle of rotation of the diagram object.  Zero degrees is pointing to the top of the diagram.  Rotation is clockwise.  DiagramObject.rotation=0 has the following meaning: The connection point of an element which has one terminal is pointing to the top side of the diagram. The connection point "From side" of an element which has more than one terminal is pointing to the top side of the diagram.
     * DiagramObject.rotation=90 has the following meaning: The connection point of an element which has one terminal is pointing to the right hand side of the diagram. The connection point "From side" of an element which has more than one terminal is pointing to the right hand side of the diagram.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Rotation</em>' attribute.
     * @see #isSetRotation()
     * @see #unsetRotation()
     * @see #setRotation(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiagramObject_Rotation()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AngleDegrees" transient="true" ordered="false"
     *        extendedMetaData="name='DiagramObject.rotation' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getRotation();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObject#getRotation <em>Rotation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rotation</em>' attribute.
     * @see #isSetRotation()
     * @see #unsetRotation()
     * @see #getRotation()
     * @generated
     */
    void setRotation( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObject#getRotation <em>Rotation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRotation()
     * @see #getRotation()
     * @see #setRotation(Double)
     * @generated
     */
    void unsetRotation();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObject#getRotation <em>Rotation</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rotation</em>' attribute is set.
     * @see #unsetRotation()
     * @see #getRotation()
     * @see #setRotation(Double)
     * @generated
     */
    boolean isSetRotation();

    /**
     * Returns the value of the '<em><b>Diagram Object Style</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObjectStyle#getStyledObjects <em>Styled Objects</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A diagram object has a style associated that provides a reference for the style used in the originating system.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Diagram Object Style</em>' reference.
     * @see #isSetDiagramObjectStyle()
     * @see #unsetDiagramObjectStyle()
     * @see #setDiagramObjectStyle(DiagramObjectStyle)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiagramObject_DiagramObjectStyle()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObjectStyle#getStyledObjects
     * @model opposite="StyledObjects" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='DiagramObject.DiagramObjectStyle' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    DiagramObjectStyle getDiagramObjectStyle();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObject#getDiagramObjectStyle <em>Diagram Object Style</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Diagram Object Style</em>' reference.
     * @see #isSetDiagramObjectStyle()
     * @see #unsetDiagramObjectStyle()
     * @see #getDiagramObjectStyle()
     * @generated
     */
    void setDiagramObjectStyle( DiagramObjectStyle value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObject#getDiagramObjectStyle <em>Diagram Object Style</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDiagramObjectStyle()
     * @see #getDiagramObjectStyle()
     * @see #setDiagramObjectStyle(DiagramObjectStyle)
     * @generated
     */
    void unsetDiagramObjectStyle();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObject#getDiagramObjectStyle <em>Diagram Object Style</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Diagram Object Style</em>' reference is set.
     * @see #unsetDiagramObjectStyle()
     * @see #getDiagramObjectStyle()
     * @see #setDiagramObjectStyle(DiagramObjectStyle)
     * @generated
     */
    boolean isSetDiagramObjectStyle();

    /**
     * Returns the value of the '<em><b>Identified Object</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.IdentifiedObject#getDiagramObjects <em>Diagram Objects</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The domain object to which this diagram object is associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Identified Object</em>' reference.
     * @see #isSetIdentifiedObject()
     * @see #unsetIdentifiedObject()
     * @see #setIdentifiedObject(IdentifiedObject)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiagramObject_IdentifiedObject()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.IdentifiedObject#getDiagramObjects
     * @model opposite="DiagramObjects" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='DiagramObject.IdentifiedObject' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    IdentifiedObject getIdentifiedObject();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObject#getIdentifiedObject <em>Identified Object</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Identified Object</em>' reference.
     * @see #isSetIdentifiedObject()
     * @see #unsetIdentifiedObject()
     * @see #getIdentifiedObject()
     * @generated
     */
    void setIdentifiedObject( IdentifiedObject value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObject#getIdentifiedObject <em>Identified Object</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIdentifiedObject()
     * @see #getIdentifiedObject()
     * @see #setIdentifiedObject(IdentifiedObject)
     * @generated
     */
    void unsetIdentifiedObject();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObject#getIdentifiedObject <em>Identified Object</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Identified Object</em>' reference is set.
     * @see #unsetIdentifiedObject()
     * @see #getIdentifiedObject()
     * @see #setIdentifiedObject(IdentifiedObject)
     * @generated
     */
    boolean isSetIdentifiedObject();

    /**
     * Returns the value of the '<em><b>Is Polygon</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Defines whether or not the diagram objects points define the boundaries of a polygon or the routing of a polyline. If this value is true then a receiving application should consider the first and last points to be connected.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Is Polygon</em>' attribute.
     * @see #isSetIsPolygon()
     * @see #unsetIsPolygon()
     * @see #setIsPolygon(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiagramObject_IsPolygon()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='DiagramObject.isPolygon' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getIsPolygon();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObject#getIsPolygon <em>Is Polygon</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Polygon</em>' attribute.
     * @see #isSetIsPolygon()
     * @see #unsetIsPolygon()
     * @see #getIsPolygon()
     * @generated
     */
    void setIsPolygon( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObject#getIsPolygon <em>Is Polygon</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsPolygon()
     * @see #getIsPolygon()
     * @see #setIsPolygon(Boolean)
     * @generated
     */
    void unsetIsPolygon();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObject#getIsPolygon <em>Is Polygon</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Polygon</em>' attribute is set.
     * @see #unsetIsPolygon()
     * @see #getIsPolygon()
     * @see #setIsPolygon(Boolean)
     * @generated
     */
    boolean isSetIsPolygon();

    /**
     * Returns the value of the '<em><b>Drawing Order</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The drawing order of this element. The higher the number, the later the element is drawn in sequence. This is used to ensure that elements that overlap are rendered in the correct order.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Drawing Order</em>' attribute.
     * @see #isSetDrawingOrder()
     * @see #unsetDrawingOrder()
     * @see #setDrawingOrder(BigInteger)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiagramObject_DrawingOrder()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Integer" transient="true" ordered="false"
     *        extendedMetaData="name='DiagramObject.drawingOrder' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    BigInteger getDrawingOrder();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObject#getDrawingOrder <em>Drawing Order</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Drawing Order</em>' attribute.
     * @see #isSetDrawingOrder()
     * @see #unsetDrawingOrder()
     * @see #getDrawingOrder()
     * @generated
     */
    void setDrawingOrder( BigInteger value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObject#getDrawingOrder <em>Drawing Order</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDrawingOrder()
     * @see #getDrawingOrder()
     * @see #setDrawingOrder(BigInteger)
     * @generated
     */
    void unsetDrawingOrder();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObject#getDrawingOrder <em>Drawing Order</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Drawing Order</em>' attribute is set.
     * @see #unsetDrawingOrder()
     * @see #getDrawingOrder()
     * @see #setDrawingOrder(BigInteger)
     * @generated
     */
    boolean isSetDrawingOrder();

    /**
     * Returns the value of the '<em><b>Offset Y</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The offset in the Y direction. This is used for defining the offset from centre for rendering an icon (the default is that a single point specifies the centre of the icon).
     *
     * The offset is in per-unit with 0 indicating there is no offset from the vertical centre of the icon.  The offset direction is dependent on the orientation of the diagram, with -0.5 and 0.5 indicating an offset of +/- 50% on the vertical axis.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Offset Y</em>' attribute.
     * @see #isSetOffsetY()
     * @see #unsetOffsetY()
     * @see #setOffsetY(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiagramObject_OffsetY()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='DiagramObject.offsetY' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getOffsetY();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObject#getOffsetY <em>Offset Y</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Offset Y</em>' attribute.
     * @see #isSetOffsetY()
     * @see #unsetOffsetY()
     * @see #getOffsetY()
     * @generated
     */
    void setOffsetY( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObject#getOffsetY <em>Offset Y</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOffsetY()
     * @see #getOffsetY()
     * @see #setOffsetY(Double)
     * @generated
     */
    void unsetOffsetY();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObject#getOffsetY <em>Offset Y</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Offset Y</em>' attribute is set.
     * @see #unsetOffsetY()
     * @see #getOffsetY()
     * @see #setOffsetY(Double)
     * @generated
     */
    boolean isSetOffsetY();

    /**
     * Returns the value of the '<em><b>Offset X</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The offset in the X direction. This is used for defining the offset from centre for rendering an icon (the default is that a single point specifies the centre of the icon).
     *
     * The offset is in per-unit with 0 indicating there is no offset from the horizontal centre of the icon.  -0.5 indicates it is offset by 50% to the left and 0.5 indicates an offset of 50% to the right.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Offset X</em>' attribute.
     * @see #isSetOffsetX()
     * @see #unsetOffsetX()
     * @see #setOffsetX(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiagramObject_OffsetX()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='DiagramObject.offsetX' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getOffsetX();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObject#getOffsetX <em>Offset X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Offset X</em>' attribute.
     * @see #isSetOffsetX()
     * @see #unsetOffsetX()
     * @see #getOffsetX()
     * @generated
     */
    void setOffsetX( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObject#getOffsetX <em>Offset X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOffsetX()
     * @see #getOffsetX()
     * @see #setOffsetX(Double)
     * @generated
     */
    void unsetOffsetX();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObject#getOffsetX <em>Offset X</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Offset X</em>' attribute is set.
     * @see #unsetOffsetX()
     * @see #getOffsetX()
     * @see #setOffsetX(Double)
     * @generated
     */
    boolean isSetOffsetX();

    /**
     * Returns the value of the '<em><b>Diagram</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Diagram#getDiagramElements <em>Diagram Elements</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A diagram object is part of a diagram.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Diagram</em>' reference.
     * @see #isSetDiagram()
     * @see #unsetDiagram()
     * @see #setDiagram(Diagram)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiagramObject_Diagram()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Diagram#getDiagramElements
     * @model opposite="DiagramElements" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='DiagramObject.Diagram' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Diagram getDiagram();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObject#getDiagram <em>Diagram</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Diagram</em>' reference.
     * @see #isSetDiagram()
     * @see #unsetDiagram()
     * @see #getDiagram()
     * @generated
     */
    void setDiagram( Diagram value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObject#getDiagram <em>Diagram</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDiagram()
     * @see #getDiagram()
     * @see #setDiagram(Diagram)
     * @generated
     */
    void unsetDiagram();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObject#getDiagram <em>Diagram</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Diagram</em>' reference is set.
     * @see #unsetDiagram()
     * @see #getDiagram()
     * @see #setDiagram(Diagram)
     * @generated
     */
    boolean isSetDiagram();

    /**
     * Returns the value of the '<em><b>Visibility Layers</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VisibilityLayer}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VisibilityLayer#getVisibleObjects <em>Visible Objects</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A diagram object can be part of multiple visibility layers.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Visibility Layers</em>' reference list.
     * @see #isSetVisibilityLayers()
     * @see #unsetVisibilityLayers()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiagramObject_VisibilityLayers()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VisibilityLayer#getVisibleObjects
     * @model opposite="VisibleObjects" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='DiagramObject.VisibilityLayers' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< VisibilityLayer > getVisibilityLayers();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObject#getVisibilityLayers <em>Visibility Layers</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVisibilityLayers()
     * @see #getVisibilityLayers()
     * @generated
     */
    void unsetVisibilityLayers();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObject#getVisibilityLayers <em>Visibility Layers</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Visibility Layers</em>' reference list is set.
     * @see #unsetVisibilityLayers()
     * @see #getVisibilityLayers()
     * @generated
     */
    boolean isSetVisibilityLayers();

    /**
     * Returns the value of the '<em><b>Diagram Object Points</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObjectPoint}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObjectPoint#getDiagramObject <em>Diagram Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A diagram object can have 0 or more points to reflect its layout position, routing (for polylines) or boundary (for polygons).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Diagram Object Points</em>' reference list.
     * @see #isSetDiagramObjectPoints()
     * @see #unsetDiagramObjectPoints()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiagramObject_DiagramObjectPoints()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObjectPoint#getDiagramObject
     * @model opposite="DiagramObject" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='DiagramObject.DiagramObjectPoints' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< DiagramObjectPoint > getDiagramObjectPoints();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObject#getDiagramObjectPoints <em>Diagram Object Points</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDiagramObjectPoints()
     * @see #getDiagramObjectPoints()
     * @generated
     */
    void unsetDiagramObjectPoints();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObject#getDiagramObjectPoints <em>Diagram Object Points</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Diagram Object Points</em>' reference list is set.
     * @see #unsetDiagramObjectPoints()
     * @see #getDiagramObjectPoints()
     * @generated
     */
    boolean isSetDiagramObjectPoints();

} // DiagramObject

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
 * A representation of the model object '<em><b>Visibility Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Layers are typically used for grouping diagram objects according to themes and scales. Themes are used to display or hide certain information (e.g., lakes, borders), while scales are used for hiding or displaying information depending on the current zoom level (hide text when it is too small to be read, or when it exceeds the screen size). This is also called de-cluttering.
 * CIM based graphics exchange supports an m:n relationship between diagram objects and layers. The importing system shall convert an m:n case into an appropriate 1:n representation if the importing system does not support m:n.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VisibilityLayer#getVisibleObjects <em>Visible Objects</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VisibilityLayer#getDrawingOrder <em>Drawing Order</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getVisibilityLayer()
 * @model
 * @generated
 */
public interface VisibilityLayer extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Visible Objects</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObject}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObject#getVisibilityLayers <em>Visibility Layers</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A visibility layer can contain one or more diagram objects.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Visible Objects</em>' reference list.
     * @see #isSetVisibleObjects()
     * @see #unsetVisibleObjects()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getVisibilityLayer_VisibleObjects()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObject#getVisibilityLayers
     * @model opposite="VisibilityLayers" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='VisibilityLayer.VisibleObjects' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< DiagramObject > getVisibleObjects();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VisibilityLayer#getVisibleObjects <em>Visible Objects</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVisibleObjects()
     * @see #getVisibleObjects()
     * @generated
     */
    void unsetVisibleObjects();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VisibilityLayer#getVisibleObjects <em>Visible Objects</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Visible Objects</em>' reference list is set.
     * @see #unsetVisibleObjects()
     * @see #getVisibleObjects()
     * @generated
     */
    boolean isSetVisibleObjects();

    /**
     * Returns the value of the '<em><b>Drawing Order</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The drawing order for this layer.  The higher the number, the later the layer and the objects within it are rendered.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Drawing Order</em>' attribute.
     * @see #isSetDrawingOrder()
     * @see #unsetDrawingOrder()
     * @see #setDrawingOrder(BigInteger)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getVisibilityLayer_DrawingOrder()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Integer" transient="true" ordered="false"
     *        extendedMetaData="name='VisibilityLayer.drawingOrder' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    BigInteger getDrawingOrder();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VisibilityLayer#getDrawingOrder <em>Drawing Order</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VisibilityLayer#getDrawingOrder <em>Drawing Order</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDrawingOrder()
     * @see #getDrawingOrder()
     * @see #setDrawingOrder(BigInteger)
     * @generated
     */
    void unsetDrawingOrder();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VisibilityLayer#getDrawingOrder <em>Drawing Order</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Drawing Order</em>' attribute is set.
     * @see #unsetDrawingOrder()
     * @see #getDrawingOrder()
     * @see #setDrawingOrder(BigInteger)
     * @generated
     */
    boolean isSetDrawingOrder();

} // VisibilityLayer

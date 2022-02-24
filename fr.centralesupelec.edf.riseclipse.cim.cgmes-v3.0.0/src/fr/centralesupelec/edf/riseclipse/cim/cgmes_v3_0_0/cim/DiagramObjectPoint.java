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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Object Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A point in a given space defined by 3 coordinates and associated to a diagram object.  The coordinates may be positive or negative as the origin does not have to be in the corner of a diagram.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObjectPoint#getDiagramObject <em>Diagram Object</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObjectPoint#getSequenceNumber <em>Sequence Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObjectPoint#getDiagramObjectGluePoint <em>Diagram Object Glue Point</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObjectPoint#getYPosition <em>YPosition</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObjectPoint#getXPosition <em>XPosition</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObjectPoint#getZPosition <em>ZPosition</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiagramObjectPoint()
 * @model
 * @generated
 */
public interface DiagramObjectPoint extends CimObjectWithID {
    /**
     * Returns the value of the '<em><b>Diagram Object</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObject#getDiagramObjectPoints <em>Diagram Object Points</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The diagram object with which the points are associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Diagram Object</em>' reference.
     * @see #isSetDiagramObject()
     * @see #unsetDiagramObject()
     * @see #setDiagramObject(DiagramObject)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiagramObjectPoint_DiagramObject()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObject#getDiagramObjectPoints
     * @model opposite="DiagramObjectPoints" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='DiagramObjectPoint.DiagramObject' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    DiagramObject getDiagramObject();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObjectPoint#getDiagramObject <em>Diagram Object</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Diagram Object</em>' reference.
     * @see #isSetDiagramObject()
     * @see #unsetDiagramObject()
     * @see #getDiagramObject()
     * @generated
     */
    void setDiagramObject( DiagramObject value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObjectPoint#getDiagramObject <em>Diagram Object</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDiagramObject()
     * @see #getDiagramObject()
     * @see #setDiagramObject(DiagramObject)
     * @generated
     */
    void unsetDiagramObject();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObjectPoint#getDiagramObject <em>Diagram Object</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Diagram Object</em>' reference is set.
     * @see #unsetDiagramObject()
     * @see #getDiagramObject()
     * @see #setDiagramObject(DiagramObject)
     * @generated
     */
    boolean isSetDiagramObject();

    /**
     * Returns the value of the '<em><b>Sequence Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The sequence position of the point, used for defining the order of points for diagram objects acting as a polyline or polygon with more than one point. The attribute shall be a positive value.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Sequence Number</em>' attribute.
     * @see #isSetSequenceNumber()
     * @see #unsetSequenceNumber()
     * @see #setSequenceNumber(BigInteger)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiagramObjectPoint_SequenceNumber()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Integer" transient="true" ordered="false"
     *        extendedMetaData="name='DiagramObjectPoint.sequenceNumber' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    BigInteger getSequenceNumber();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObjectPoint#getSequenceNumber <em>Sequence Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sequence Number</em>' attribute.
     * @see #isSetSequenceNumber()
     * @see #unsetSequenceNumber()
     * @see #getSequenceNumber()
     * @generated
     */
    void setSequenceNumber( BigInteger value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObjectPoint#getSequenceNumber <em>Sequence Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSequenceNumber()
     * @see #getSequenceNumber()
     * @see #setSequenceNumber(BigInteger)
     * @generated
     */
    void unsetSequenceNumber();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObjectPoint#getSequenceNumber <em>Sequence Number</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sequence Number</em>' attribute is set.
     * @see #unsetSequenceNumber()
     * @see #getSequenceNumber()
     * @see #setSequenceNumber(BigInteger)
     * @generated
     */
    boolean isSetSequenceNumber();

    /**
     * Returns the value of the '<em><b>Diagram Object Glue Point</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObjectGluePoint#getDiagramObjectPoints <em>Diagram Object Points</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The 'glue' point to which this point is associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Diagram Object Glue Point</em>' reference.
     * @see #isSetDiagramObjectGluePoint()
     * @see #unsetDiagramObjectGluePoint()
     * @see #setDiagramObjectGluePoint(DiagramObjectGluePoint)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiagramObjectPoint_DiagramObjectGluePoint()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObjectGluePoint#getDiagramObjectPoints
     * @model opposite="DiagramObjectPoints" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='DiagramObjectPoint.DiagramObjectGluePoint' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    DiagramObjectGluePoint getDiagramObjectGluePoint();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObjectPoint#getDiagramObjectGluePoint <em>Diagram Object Glue Point</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Diagram Object Glue Point</em>' reference.
     * @see #isSetDiagramObjectGluePoint()
     * @see #unsetDiagramObjectGluePoint()
     * @see #getDiagramObjectGluePoint()
     * @generated
     */
    void setDiagramObjectGluePoint( DiagramObjectGluePoint value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObjectPoint#getDiagramObjectGluePoint <em>Diagram Object Glue Point</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDiagramObjectGluePoint()
     * @see #getDiagramObjectGluePoint()
     * @see #setDiagramObjectGluePoint(DiagramObjectGluePoint)
     * @generated
     */
    void unsetDiagramObjectGluePoint();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObjectPoint#getDiagramObjectGluePoint <em>Diagram Object Glue Point</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Diagram Object Glue Point</em>' reference is set.
     * @see #unsetDiagramObjectGluePoint()
     * @see #getDiagramObjectGluePoint()
     * @see #setDiagramObjectGluePoint(DiagramObjectGluePoint)
     * @generated
     */
    boolean isSetDiagramObjectGluePoint();

    /**
     * Returns the value of the '<em><b>YPosition</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The Y coordinate of this point.
     * <!-- end-model-doc -->
     * @return the value of the '<em>YPosition</em>' attribute.
     * @see #isSetYPosition()
     * @see #unsetYPosition()
     * @see #setYPosition(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiagramObjectPoint_YPosition()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='DiagramObjectPoint.yPosition' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getYPosition();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObjectPoint#getYPosition <em>YPosition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>YPosition</em>' attribute.
     * @see #isSetYPosition()
     * @see #unsetYPosition()
     * @see #getYPosition()
     * @generated
     */
    void setYPosition( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObjectPoint#getYPosition <em>YPosition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetYPosition()
     * @see #getYPosition()
     * @see #setYPosition(Double)
     * @generated
     */
    void unsetYPosition();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObjectPoint#getYPosition <em>YPosition</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>YPosition</em>' attribute is set.
     * @see #unsetYPosition()
     * @see #getYPosition()
     * @see #setYPosition(Double)
     * @generated
     */
    boolean isSetYPosition();

    /**
     * Returns the value of the '<em><b>XPosition</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The X coordinate of this point.
     * <!-- end-model-doc -->
     * @return the value of the '<em>XPosition</em>' attribute.
     * @see #isSetXPosition()
     * @see #unsetXPosition()
     * @see #setXPosition(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiagramObjectPoint_XPosition()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='DiagramObjectPoint.xPosition' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getXPosition();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObjectPoint#getXPosition <em>XPosition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>XPosition</em>' attribute.
     * @see #isSetXPosition()
     * @see #unsetXPosition()
     * @see #getXPosition()
     * @generated
     */
    void setXPosition( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObjectPoint#getXPosition <em>XPosition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXPosition()
     * @see #getXPosition()
     * @see #setXPosition(Double)
     * @generated
     */
    void unsetXPosition();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObjectPoint#getXPosition <em>XPosition</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>XPosition</em>' attribute is set.
     * @see #unsetXPosition()
     * @see #getXPosition()
     * @see #setXPosition(Double)
     * @generated
     */
    boolean isSetXPosition();

    /**
     * Returns the value of the '<em><b>ZPosition</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The Z coordinate of this point.
     * <!-- end-model-doc -->
     * @return the value of the '<em>ZPosition</em>' attribute.
     * @see #isSetZPosition()
     * @see #unsetZPosition()
     * @see #setZPosition(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getDiagramObjectPoint_ZPosition()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='DiagramObjectPoint.zPosition' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getZPosition();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObjectPoint#getZPosition <em>ZPosition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ZPosition</em>' attribute.
     * @see #isSetZPosition()
     * @see #unsetZPosition()
     * @see #getZPosition()
     * @generated
     */
    void setZPosition( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObjectPoint#getZPosition <em>ZPosition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetZPosition()
     * @see #getZPosition()
     * @see #setZPosition(Double)
     * @generated
     */
    void unsetZPosition();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObjectPoint#getZPosition <em>ZPosition</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>ZPosition</em>' attribute is set.
     * @see #unsetZPosition()
     * @see #getZPosition()
     * @see #setZPosition(Double)
     * @generated
     */
    boolean isSetZPosition();

} // DiagramObjectPoint

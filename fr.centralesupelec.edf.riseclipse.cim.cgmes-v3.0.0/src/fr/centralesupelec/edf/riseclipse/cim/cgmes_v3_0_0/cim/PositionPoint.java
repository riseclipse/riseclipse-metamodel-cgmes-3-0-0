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
 * A representation of the model object '<em><b>Position Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Set of spatial coordinates that determine a point, defined in the coordinate system specified in 'Location.CoordinateSystem'. Use a single position point instance to describe a point-oriented location. Use a sequence of position points to describe a line-oriented object (physical location of non-point oriented objects like cables or lines), or area of an object (like a substation or a geographical zone - in this case, have first and last position point with the same values).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PositionPoint#getXPosition <em>XPosition</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PositionPoint#getZPosition <em>ZPosition</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PositionPoint#getLocation <em>Location</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PositionPoint#getYPosition <em>YPosition</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PositionPoint#getSequenceNumber <em>Sequence Number</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPositionPoint()
 * @model
 * @generated
 */
public interface PositionPoint extends CimObjectWithID {
    /**
     * Returns the value of the '<em><b>XPosition</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * X axis position.
     * <!-- end-model-doc -->
     * @return the value of the '<em>XPosition</em>' attribute.
     * @see #isSetXPosition()
     * @see #unsetXPosition()
     * @see #setXPosition(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPositionPoint_XPosition()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.String" transient="true" ordered="false"
     *        extendedMetaData="name='PositionPoint.xPosition' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    String getXPosition();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PositionPoint#getXPosition <em>XPosition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>XPosition</em>' attribute.
     * @see #isSetXPosition()
     * @see #unsetXPosition()
     * @see #getXPosition()
     * @generated
     */
    void setXPosition( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PositionPoint#getXPosition <em>XPosition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXPosition()
     * @see #getXPosition()
     * @see #setXPosition(String)
     * @generated
     */
    void unsetXPosition();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PositionPoint#getXPosition <em>XPosition</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>XPosition</em>' attribute is set.
     * @see #unsetXPosition()
     * @see #getXPosition()
     * @see #setXPosition(String)
     * @generated
     */
    boolean isSetXPosition();

    /**
     * Returns the value of the '<em><b>ZPosition</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * (if applicable) Z axis position.
     * <!-- end-model-doc -->
     * @return the value of the '<em>ZPosition</em>' attribute.
     * @see #isSetZPosition()
     * @see #unsetZPosition()
     * @see #setZPosition(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPositionPoint_ZPosition()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.String" transient="true" ordered="false"
     *        extendedMetaData="name='PositionPoint.zPosition' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    String getZPosition();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PositionPoint#getZPosition <em>ZPosition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>ZPosition</em>' attribute.
     * @see #isSetZPosition()
     * @see #unsetZPosition()
     * @see #getZPosition()
     * @generated
     */
    void setZPosition( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PositionPoint#getZPosition <em>ZPosition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetZPosition()
     * @see #getZPosition()
     * @see #setZPosition(String)
     * @generated
     */
    void unsetZPosition();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PositionPoint#getZPosition <em>ZPosition</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>ZPosition</em>' attribute is set.
     * @see #unsetZPosition()
     * @see #getZPosition()
     * @see #setZPosition(String)
     * @generated
     */
    boolean isSetZPosition();

    /**
     * Returns the value of the '<em><b>Location</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Location#getPositionPoints <em>Position Points</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Location described by this position point.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Location</em>' reference.
     * @see #isSetLocation()
     * @see #unsetLocation()
     * @see #setLocation(Location)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPositionPoint_Location()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Location#getPositionPoints
     * @model opposite="PositionPoints" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='PositionPoint.Location' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Location getLocation();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PositionPoint#getLocation <em>Location</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Location</em>' reference.
     * @see #isSetLocation()
     * @see #unsetLocation()
     * @see #getLocation()
     * @generated
     */
    void setLocation( Location value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PositionPoint#getLocation <em>Location</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLocation()
     * @see #getLocation()
     * @see #setLocation(Location)
     * @generated
     */
    void unsetLocation();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PositionPoint#getLocation <em>Location</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Location</em>' reference is set.
     * @see #unsetLocation()
     * @see #getLocation()
     * @see #setLocation(Location)
     * @generated
     */
    boolean isSetLocation();

    /**
     * Returns the value of the '<em><b>YPosition</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Y axis position.
     * <!-- end-model-doc -->
     * @return the value of the '<em>YPosition</em>' attribute.
     * @see #isSetYPosition()
     * @see #unsetYPosition()
     * @see #setYPosition(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPositionPoint_YPosition()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.String" transient="true" ordered="false"
     *        extendedMetaData="name='PositionPoint.yPosition' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    String getYPosition();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PositionPoint#getYPosition <em>YPosition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>YPosition</em>' attribute.
     * @see #isSetYPosition()
     * @see #unsetYPosition()
     * @see #getYPosition()
     * @generated
     */
    void setYPosition( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PositionPoint#getYPosition <em>YPosition</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetYPosition()
     * @see #getYPosition()
     * @see #setYPosition(String)
     * @generated
     */
    void unsetYPosition();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PositionPoint#getYPosition <em>YPosition</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>YPosition</em>' attribute is set.
     * @see #unsetYPosition()
     * @see #getYPosition()
     * @see #setYPosition(String)
     * @generated
     */
    boolean isSetYPosition();

    /**
     * Returns the value of the '<em><b>Sequence Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Zero-relative sequence number of this point within a series of points.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Sequence Number</em>' attribute.
     * @see #isSetSequenceNumber()
     * @see #unsetSequenceNumber()
     * @see #setSequenceNumber(BigInteger)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPositionPoint_SequenceNumber()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Integer" transient="true" ordered="false"
     *        extendedMetaData="name='PositionPoint.sequenceNumber' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    BigInteger getSequenceNumber();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PositionPoint#getSequenceNumber <em>Sequence Number</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PositionPoint#getSequenceNumber <em>Sequence Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSequenceNumber()
     * @see #getSequenceNumber()
     * @see #setSequenceNumber(BigInteger)
     * @generated
     */
    void unsetSequenceNumber();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PositionPoint#getSequenceNumber <em>Sequence Number</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sequence Number</em>' attribute is set.
     * @see #unsetSequenceNumber()
     * @see #getSequenceNumber()
     * @see #setSequenceNumber(BigInteger)
     * @generated
     */
    boolean isSetSequenceNumber();

} // PositionPoint

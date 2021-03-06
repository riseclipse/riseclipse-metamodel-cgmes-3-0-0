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
 * A representation of the model object '<em><b>Clamp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A Clamp is a galvanic connection at a line segment where other equipment is connected. A Clamp does not cut the line segment.
 * A Clamp is ConductingEquipment and has one Terminal with an associated ConnectivityNode. Any other ConductingEquipment can be connected to the Clamp ConnectivityNode.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Clamp#getLengthFromTerminal1 <em>Length From Terminal1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Clamp#getACLineSegment <em>AC Line Segment</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getClamp()
 * @model
 * @generated
 */
public interface Clamp extends ConductingEquipment {
    /**
     * Returns the value of the '<em><b>Length From Terminal1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The length to the place where the clamp is located starting from side one of the line segment, i.e. the line segment terminal with sequence number equal to 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Length From Terminal1</em>' attribute.
     * @see #isSetLengthFromTerminal1()
     * @see #unsetLengthFromTerminal1()
     * @see #setLengthFromTerminal1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getClamp_LengthFromTerminal1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Length" transient="true" ordered="false"
     *        extendedMetaData="name='Clamp.lengthFromTerminal1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getLengthFromTerminal1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Clamp#getLengthFromTerminal1 <em>Length From Terminal1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Length From Terminal1</em>' attribute.
     * @see #isSetLengthFromTerminal1()
     * @see #unsetLengthFromTerminal1()
     * @see #getLengthFromTerminal1()
     * @generated
     */
    void setLengthFromTerminal1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Clamp#getLengthFromTerminal1 <em>Length From Terminal1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLengthFromTerminal1()
     * @see #getLengthFromTerminal1()
     * @see #setLengthFromTerminal1(Double)
     * @generated
     */
    void unsetLengthFromTerminal1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Clamp#getLengthFromTerminal1 <em>Length From Terminal1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Length From Terminal1</em>' attribute is set.
     * @see #unsetLengthFromTerminal1()
     * @see #getLengthFromTerminal1()
     * @see #setLengthFromTerminal1(Double)
     * @generated
     */
    boolean isSetLengthFromTerminal1();

    /**
     * Returns the value of the '<em><b>AC Line Segment</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACLineSegment#getClamp <em>Clamp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The line segment to which the clamp is connected.
     * <!-- end-model-doc -->
     * @return the value of the '<em>AC Line Segment</em>' reference.
     * @see #isSetACLineSegment()
     * @see #unsetACLineSegment()
     * @see #setACLineSegment(ACLineSegment)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getClamp_ACLineSegment()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACLineSegment#getClamp
     * @model opposite="Clamp" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='Clamp.ACLineSegment' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    ACLineSegment getACLineSegment();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Clamp#getACLineSegment <em>AC Line Segment</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>AC Line Segment</em>' reference.
     * @see #isSetACLineSegment()
     * @see #unsetACLineSegment()
     * @see #getACLineSegment()
     * @generated
     */
    void setACLineSegment( ACLineSegment value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Clamp#getACLineSegment <em>AC Line Segment</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetACLineSegment()
     * @see #getACLineSegment()
     * @see #setACLineSegment(ACLineSegment)
     * @generated
     */
    void unsetACLineSegment();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Clamp#getACLineSegment <em>AC Line Segment</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>AC Line Segment</em>' reference is set.
     * @see #unsetACLineSegment()
     * @see #getACLineSegment()
     * @see #setACLineSegment(ACLineSegment)
     * @generated
     */
    boolean isSetACLineSegment();

} // Clamp

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
 * A representation of the model object '<em><b>Cut</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A cut separates a line segment into two parts. The cut appears as a switch inserted between these two parts and connects them together. As the cut is normally open there is no galvanic connection between the two line segment parts. But it is possible to close the cut to get galvanic connection.
 * The cut terminals are oriented towards the line segment terminals with the same sequence number. Hence the cut terminal with sequence number equal to 1 is oriented to the line segment's terminal with sequence number equal to 1.
 * The cut terminals also act as connection points for jumpers and other equipment, e.g. a mobile generator. To enable this, connectivity nodes are placed at the cut terminals. Once the connectivity nodes are in place any conducting equipment can be connected at them.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Cut#getLengthFromTerminal1 <em>Length From Terminal1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Cut#getACLineSegment <em>AC Line Segment</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getCut()
 * @model
 * @generated
 */
public interface Cut extends Switch {
    /**
     * Returns the value of the '<em><b>AC Line Segment</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACLineSegment#getCut <em>Cut</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The line segment to which the cut is applied.
     * <!-- end-model-doc -->
     * @return the value of the '<em>AC Line Segment</em>' reference.
     * @see #isSetACLineSegment()
     * @see #unsetACLineSegment()
     * @see #setACLineSegment(ACLineSegment)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getCut_ACLineSegment()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACLineSegment#getCut
     * @model opposite="Cut" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='Cut.ACLineSegment' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    ACLineSegment getACLineSegment();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Cut#getACLineSegment <em>AC Line Segment</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Cut#getACLineSegment <em>AC Line Segment</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetACLineSegment()
     * @see #getACLineSegment()
     * @see #setACLineSegment(ACLineSegment)
     * @generated
     */
    void unsetACLineSegment();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Cut#getACLineSegment <em>AC Line Segment</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>AC Line Segment</em>' reference is set.
     * @see #unsetACLineSegment()
     * @see #getACLineSegment()
     * @see #setACLineSegment(ACLineSegment)
     * @generated
     */
    boolean isSetACLineSegment();

    /**
     * Returns the value of the '<em><b>Length From Terminal1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The length to the place where the cut is located starting from side one of the cut line segment, i.e. the line segment Terminal with sequenceNumber equal to 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Length From Terminal1</em>' attribute.
     * @see #isSetLengthFromTerminal1()
     * @see #unsetLengthFromTerminal1()
     * @see #setLengthFromTerminal1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getCut_LengthFromTerminal1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Length" transient="true" ordered="false"
     *        extendedMetaData="name='Cut.lengthFromTerminal1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getLengthFromTerminal1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Cut#getLengthFromTerminal1 <em>Length From Terminal1</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Cut#getLengthFromTerminal1 <em>Length From Terminal1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLengthFromTerminal1()
     * @see #getLengthFromTerminal1()
     * @see #setLengthFromTerminal1(Double)
     * @generated
     */
    void unsetLengthFromTerminal1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Cut#getLengthFromTerminal1 <em>Length From Terminal1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Length From Terminal1</em>' attribute is set.
     * @see #unsetLengthFromTerminal1()
     * @see #getLengthFromTerminal1()
     * @see #setLengthFromTerminal1(Double)
     * @generated
     */
    boolean isSetLengthFromTerminal1();

} // Cut

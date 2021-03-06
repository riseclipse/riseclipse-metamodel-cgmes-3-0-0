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
 * A representation of the model object '<em><b>ACDC Terminal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An electrical connection point (AC or DC) to a piece of conducting equipment. Terminals are connected at physical connection points called connectivity nodes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCTerminal#getOperationalLimitSet <em>Operational Limit Set</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCTerminal#getBusNameMarker <em>Bus Name Marker</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCTerminal#getSequenceNumber <em>Sequence Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCTerminal#getMeasurements <em>Measurements</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCTerminal#getConnected <em>Connected</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getACDCTerminal()
 * @model
 * @generated
 */
public interface ACDCTerminal extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Operational Limit Set</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimitSet}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimitSet#getTerminal <em>Terminal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The operational limit sets at the terminal.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Operational Limit Set</em>' reference list.
     * @see #isSetOperationalLimitSet()
     * @see #unsetOperationalLimitSet()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getACDCTerminal_OperationalLimitSet()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.OperationalLimitSet#getTerminal
     * @model opposite="Terminal" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='ACDCTerminal.OperationalLimitSet' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< OperationalLimitSet > getOperationalLimitSet();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCTerminal#getOperationalLimitSet <em>Operational Limit Set</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOperationalLimitSet()
     * @see #getOperationalLimitSet()
     * @generated
     */
    void unsetOperationalLimitSet();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCTerminal#getOperationalLimitSet <em>Operational Limit Set</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Operational Limit Set</em>' reference list is set.
     * @see #unsetOperationalLimitSet()
     * @see #getOperationalLimitSet()
     * @generated
     */
    boolean isSetOperationalLimitSet();

    /**
     * Returns the value of the '<em><b>Bus Name Marker</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BusNameMarker#getTerminal <em>Terminal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The bus name marker used to name the bus (topological node).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Bus Name Marker</em>' reference.
     * @see #isSetBusNameMarker()
     * @see #unsetBusNameMarker()
     * @see #setBusNameMarker(BusNameMarker)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getACDCTerminal_BusNameMarker()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BusNameMarker#getTerminal
     * @model opposite="Terminal" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='ACDCTerminal.BusNameMarker' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    BusNameMarker getBusNameMarker();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCTerminal#getBusNameMarker <em>Bus Name Marker</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bus Name Marker</em>' reference.
     * @see #isSetBusNameMarker()
     * @see #unsetBusNameMarker()
     * @see #getBusNameMarker()
     * @generated
     */
    void setBusNameMarker( BusNameMarker value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCTerminal#getBusNameMarker <em>Bus Name Marker</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBusNameMarker()
     * @see #getBusNameMarker()
     * @see #setBusNameMarker(BusNameMarker)
     * @generated
     */
    void unsetBusNameMarker();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCTerminal#getBusNameMarker <em>Bus Name Marker</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Bus Name Marker</em>' reference is set.
     * @see #unsetBusNameMarker()
     * @see #getBusNameMarker()
     * @see #setBusNameMarker(BusNameMarker)
     * @generated
     */
    boolean isSetBusNameMarker();

    /**
     * Returns the value of the '<em><b>Sequence Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The orientation of the terminal connections for a multiple terminal conducting equipment.  The sequence numbering starts with 1 and additional terminals should follow in increasing order.   The first terminal is the "starting point" for a two terminal branch.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Sequence Number</em>' attribute.
     * @see #isSetSequenceNumber()
     * @see #unsetSequenceNumber()
     * @see #setSequenceNumber(BigInteger)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getACDCTerminal_SequenceNumber()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Integer" transient="true" ordered="false"
     *        extendedMetaData="name='ACDCTerminal.sequenceNumber' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    BigInteger getSequenceNumber();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCTerminal#getSequenceNumber <em>Sequence Number</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCTerminal#getSequenceNumber <em>Sequence Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSequenceNumber()
     * @see #getSequenceNumber()
     * @see #setSequenceNumber(BigInteger)
     * @generated
     */
    void unsetSequenceNumber();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCTerminal#getSequenceNumber <em>Sequence Number</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Measurements</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Measurement}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Measurement#getTerminal <em>Terminal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Measurements associated with this terminal defining  where the measurement is placed in the network topology.  It may be used, for instance, to capture the sensor position, such as a voltage transformer (PT) at a busbar or a current transformer (CT) at the bar between a breaker and an isolator.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Measurements</em>' reference list.
     * @see #isSetMeasurements()
     * @see #unsetMeasurements()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getACDCTerminal_Measurements()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Measurement#getTerminal
     * @model opposite="Terminal" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='ACDCTerminal.Measurements' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< Measurement > getMeasurements();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCTerminal#getMeasurements <em>Measurements</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMeasurements()
     * @see #getMeasurements()
     * @generated
     */
    void unsetMeasurements();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCTerminal#getMeasurements <em>Measurements</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Measurements</em>' reference list is set.
     * @see #unsetMeasurements()
     * @see #getMeasurements()
     * @generated
     */
    boolean isSetMeasurements();

    /**
     * Returns the value of the '<em><b>Connected</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The connected status is related to a bus-branch model and the topological node to terminal relation.  True implies the terminal is connected to the related topological node and false implies it is not.
     * In a bus-branch model, the connected status is used to tell if equipment is disconnected without having to change the connectivity described by the topological node to terminal relation. A valid case is that conducting equipment can be connected in one end and open in the other. In particular for an AC line segment, where the reactive line charging can be significant, this is a relevant case.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Connected</em>' attribute.
     * @see #isSetConnected()
     * @see #unsetConnected()
     * @see #setConnected(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getACDCTerminal_Connected()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='ACDCTerminal.connected' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getConnected();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCTerminal#getConnected <em>Connected</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Connected</em>' attribute.
     * @see #isSetConnected()
     * @see #unsetConnected()
     * @see #getConnected()
     * @generated
     */
    void setConnected( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCTerminal#getConnected <em>Connected</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConnected()
     * @see #getConnected()
     * @see #setConnected(Boolean)
     * @generated
     */
    void unsetConnected();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ACDCTerminal#getConnected <em>Connected</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Connected</em>' attribute is set.
     * @see #unsetConnected()
     * @see #getConnected()
     * @see #setConnected(Boolean)
     * @generated
     */
    boolean isSetConnected();

} // ACDCTerminal

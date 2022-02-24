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
package fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu;

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConnectivityNode;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerSystemResource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boundary Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Designates a connection point at which one or more model authority sets shall connect to. The location of the connection point as well as other properties are agreed between organisations responsible for the interconnection, hence all attributes of the class represent this agreement.  It is primarily used in a boundary model authority set which can contain one or many BoundaryPoint-s among other Equipment-s and their connections.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint#getConnectivityNode <em>Connectivity Node</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint#getToEndName <em>To End Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint#getIsDirectCurrent <em>Is Direct Current</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint#getFromEndName <em>From End Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint#getToEndIsoCode <em>To End Iso Code</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint#getIsExcludedFromAreaInterchange <em>Is Excluded From Area Interchange</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint#getToEndNameTso <em>To End Name Tso</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint#getFromEndIsoCode <em>From End Iso Code</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint#getFromEndNameTso <em>From End Name Tso</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.EuPackage#getBoundaryPoint()
 * @model
 * @generated
 */
public interface BoundaryPoint extends PowerSystemResource {
    /**
     * Returns the value of the '<em><b>To End Iso Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The ISO code of the region which the "To" side of the Boundary point belongs to or is connected to.
     * The ISO code is a two-character country code as defined by ISO 3166 (http://www.iso.org/iso/country_codes). The length of the string is 2 characters maximum.
     * <!-- end-model-doc -->
     * @return the value of the '<em>To End Iso Code</em>' attribute.
     * @see #isSetToEndIsoCode()
     * @see #unsetToEndIsoCode()
     * @see #setToEndIsoCode(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.EuPackage#getBoundaryPoint_ToEndIsoCode()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.String" transient="true" ordered="false"
     *        extendedMetaData="name='BoundaryPoint.toEndIsoCode' kind='element' namespace='http://iec.ch/TC57/CIM100-European'"
     * @generated
     */
    String getToEndIsoCode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint#getToEndIsoCode <em>To End Iso Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>To End Iso Code</em>' attribute.
     * @see #isSetToEndIsoCode()
     * @see #unsetToEndIsoCode()
     * @see #getToEndIsoCode()
     * @generated
     */
    void setToEndIsoCode( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint#getToEndIsoCode <em>To End Iso Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetToEndIsoCode()
     * @see #getToEndIsoCode()
     * @see #setToEndIsoCode(String)
     * @generated
     */
    void unsetToEndIsoCode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint#getToEndIsoCode <em>To End Iso Code</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>To End Iso Code</em>' attribute is set.
     * @see #unsetToEndIsoCode()
     * @see #getToEndIsoCode()
     * @see #setToEndIsoCode(String)
     * @generated
     */
    boolean isSetToEndIsoCode();

    /**
     * Returns the value of the '<em><b>To End Name Tso</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Identifies the name of the transmission system operator, distribution system operator or other entity at which the "To" side of the interconnection is connected to. The length of the string is 64 characters maximum.
     * <!-- end-model-doc -->
     * @return the value of the '<em>To End Name Tso</em>' attribute.
     * @see #isSetToEndNameTso()
     * @see #unsetToEndNameTso()
     * @see #setToEndNameTso(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.EuPackage#getBoundaryPoint_ToEndNameTso()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.String" transient="true" ordered="false"
     *        extendedMetaData="name='BoundaryPoint.toEndNameTso' kind='element' namespace='http://iec.ch/TC57/CIM100-European'"
     * @generated
     */
    String getToEndNameTso();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint#getToEndNameTso <em>To End Name Tso</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>To End Name Tso</em>' attribute.
     * @see #isSetToEndNameTso()
     * @see #unsetToEndNameTso()
     * @see #getToEndNameTso()
     * @generated
     */
    void setToEndNameTso( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint#getToEndNameTso <em>To End Name Tso</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetToEndNameTso()
     * @see #getToEndNameTso()
     * @see #setToEndNameTso(String)
     * @generated
     */
    void unsetToEndNameTso();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint#getToEndNameTso <em>To End Name Tso</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>To End Name Tso</em>' attribute is set.
     * @see #unsetToEndNameTso()
     * @see #getToEndNameTso()
     * @see #setToEndNameTso(String)
     * @generated
     */
    boolean isSetToEndNameTso();

    /**
     * Returns the value of the '<em><b>From End Iso Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The ISO code of the region which the "From" side of the Boundary point belongs to or it is connected to.
     * The ISO code is a two-character country code as defined by ISO 3166 (http://www.iso.org/iso/country_codes). The length of the string is 2 characters maximum.
     * <!-- end-model-doc -->
     * @return the value of the '<em>From End Iso Code</em>' attribute.
     * @see #isSetFromEndIsoCode()
     * @see #unsetFromEndIsoCode()
     * @see #setFromEndIsoCode(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.EuPackage#getBoundaryPoint_FromEndIsoCode()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.String" transient="true" ordered="false"
     *        extendedMetaData="name='BoundaryPoint.fromEndIsoCode' kind='element' namespace='http://iec.ch/TC57/CIM100-European'"
     * @generated
     */
    String getFromEndIsoCode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint#getFromEndIsoCode <em>From End Iso Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>From End Iso Code</em>' attribute.
     * @see #isSetFromEndIsoCode()
     * @see #unsetFromEndIsoCode()
     * @see #getFromEndIsoCode()
     * @generated
     */
    void setFromEndIsoCode( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint#getFromEndIsoCode <em>From End Iso Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFromEndIsoCode()
     * @see #getFromEndIsoCode()
     * @see #setFromEndIsoCode(String)
     * @generated
     */
    void unsetFromEndIsoCode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint#getFromEndIsoCode <em>From End Iso Code</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>From End Iso Code</em>' attribute is set.
     * @see #unsetFromEndIsoCode()
     * @see #getFromEndIsoCode()
     * @see #setFromEndIsoCode(String)
     * @generated
     */
    boolean isSetFromEndIsoCode();

    /**
     * Returns the value of the '<em><b>Is Excluded From Area Interchange</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * If true, this boundary point is on the interconnection that is excluded from control area interchange calculation and consequently has no related tie flows. Otherwise, the interconnection is included in control area interchange and a TieFlow is required at all sides of the boundary point (default).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Is Excluded From Area Interchange</em>' attribute.
     * @see #isSetIsExcludedFromAreaInterchange()
     * @see #unsetIsExcludedFromAreaInterchange()
     * @see #setIsExcludedFromAreaInterchange(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.EuPackage#getBoundaryPoint_IsExcludedFromAreaInterchange()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='BoundaryPoint.isExcludedFromAreaInterchange' kind='element' namespace='http://iec.ch/TC57/CIM100-European'"
     * @generated
     */
    Boolean getIsExcludedFromAreaInterchange();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint#getIsExcludedFromAreaInterchange <em>Is Excluded From Area Interchange</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Excluded From Area Interchange</em>' attribute.
     * @see #isSetIsExcludedFromAreaInterchange()
     * @see #unsetIsExcludedFromAreaInterchange()
     * @see #getIsExcludedFromAreaInterchange()
     * @generated
     */
    void setIsExcludedFromAreaInterchange( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint#getIsExcludedFromAreaInterchange <em>Is Excluded From Area Interchange</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsExcludedFromAreaInterchange()
     * @see #getIsExcludedFromAreaInterchange()
     * @see #setIsExcludedFromAreaInterchange(Boolean)
     * @generated
     */
    void unsetIsExcludedFromAreaInterchange();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint#getIsExcludedFromAreaInterchange <em>Is Excluded From Area Interchange</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Excluded From Area Interchange</em>' attribute is set.
     * @see #unsetIsExcludedFromAreaInterchange()
     * @see #getIsExcludedFromAreaInterchange()
     * @see #setIsExcludedFromAreaInterchange(Boolean)
     * @generated
     */
    boolean isSetIsExcludedFromAreaInterchange();

    /**
     * Returns the value of the '<em><b>Connectivity Node</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConnectivityNode#getBoundaryPoint <em>Boundary Point</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The connectivity node that is designated as a boundary point.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Connectivity Node</em>' reference.
     * @see #isSetConnectivityNode()
     * @see #unsetConnectivityNode()
     * @see #setConnectivityNode(ConnectivityNode)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.EuPackage#getBoundaryPoint_ConnectivityNode()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConnectivityNode#getBoundaryPoint
     * @model opposite="BoundaryPoint" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='BoundaryPoint.ConnectivityNode' kind='element' namespace='http://iec.ch/TC57/CIM100-European'"
     * @generated
     */
    ConnectivityNode getConnectivityNode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint#getConnectivityNode <em>Connectivity Node</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Connectivity Node</em>' reference.
     * @see #isSetConnectivityNode()
     * @see #unsetConnectivityNode()
     * @see #getConnectivityNode()
     * @generated
     */
    void setConnectivityNode( ConnectivityNode value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint#getConnectivityNode <em>Connectivity Node</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConnectivityNode()
     * @see #getConnectivityNode()
     * @see #setConnectivityNode(ConnectivityNode)
     * @generated
     */
    void unsetConnectivityNode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint#getConnectivityNode <em>Connectivity Node</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Connectivity Node</em>' reference is set.
     * @see #unsetConnectivityNode()
     * @see #getConnectivityNode()
     * @see #setConnectivityNode(ConnectivityNode)
     * @generated
     */
    boolean isSetConnectivityNode();

    /**
     * Returns the value of the '<em><b>Is Direct Current</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * If true, this boundary point is a point of common coupling (PCC) of a direct current (DC) interconnection, otherwise the interconnection is AC (default).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Is Direct Current</em>' attribute.
     * @see #isSetIsDirectCurrent()
     * @see #unsetIsDirectCurrent()
     * @see #setIsDirectCurrent(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.EuPackage#getBoundaryPoint_IsDirectCurrent()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='BoundaryPoint.isDirectCurrent' kind='element' namespace='http://iec.ch/TC57/CIM100-European'"
     * @generated
     */
    Boolean getIsDirectCurrent();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint#getIsDirectCurrent <em>Is Direct Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Direct Current</em>' attribute.
     * @see #isSetIsDirectCurrent()
     * @see #unsetIsDirectCurrent()
     * @see #getIsDirectCurrent()
     * @generated
     */
    void setIsDirectCurrent( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint#getIsDirectCurrent <em>Is Direct Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsDirectCurrent()
     * @see #getIsDirectCurrent()
     * @see #setIsDirectCurrent(Boolean)
     * @generated
     */
    void unsetIsDirectCurrent();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint#getIsDirectCurrent <em>Is Direct Current</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Direct Current</em>' attribute is set.
     * @see #unsetIsDirectCurrent()
     * @see #getIsDirectCurrent()
     * @see #setIsDirectCurrent(Boolean)
     * @generated
     */
    boolean isSetIsDirectCurrent();

    /**
     * Returns the value of the '<em><b>From End Name Tso</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Identifies the name of the transmission system operator, distribution system operator or other entity at which the "From" side of the interconnection is connected to. The length of the string is 64 characters maximum.
     * <!-- end-model-doc -->
     * @return the value of the '<em>From End Name Tso</em>' attribute.
     * @see #isSetFromEndNameTso()
     * @see #unsetFromEndNameTso()
     * @see #setFromEndNameTso(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.EuPackage#getBoundaryPoint_FromEndNameTso()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.String" transient="true" ordered="false"
     *        extendedMetaData="name='BoundaryPoint.fromEndNameTso' kind='element' namespace='http://iec.ch/TC57/CIM100-European'"
     * @generated
     */
    String getFromEndNameTso();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint#getFromEndNameTso <em>From End Name Tso</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>From End Name Tso</em>' attribute.
     * @see #isSetFromEndNameTso()
     * @see #unsetFromEndNameTso()
     * @see #getFromEndNameTso()
     * @generated
     */
    void setFromEndNameTso( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint#getFromEndNameTso <em>From End Name Tso</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFromEndNameTso()
     * @see #getFromEndNameTso()
     * @see #setFromEndNameTso(String)
     * @generated
     */
    void unsetFromEndNameTso();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint#getFromEndNameTso <em>From End Name Tso</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>From End Name Tso</em>' attribute is set.
     * @see #unsetFromEndNameTso()
     * @see #getFromEndNameTso()
     * @see #setFromEndNameTso(String)
     * @generated
     */
    boolean isSetFromEndNameTso();

    /**
     * Returns the value of the '<em><b>From End Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A human readable name with length of the string 64 characters maximum. It covers the following two cases:
     * -if the Boundary point is placed on a tie-line, it is the name (IdentifiedObject.name) of the substation at which the "From" side of the tie-line is connected to.
     * -if the Boundary point is placed in a substation, it is the name (IdentifiedObject.name) of the element (e.g. PowerTransformer, ACLineSegment, Switch, etc.) at which the "From" side of the Boundary point is connected to.
     * <!-- end-model-doc -->
     * @return the value of the '<em>From End Name</em>' attribute.
     * @see #isSetFromEndName()
     * @see #unsetFromEndName()
     * @see #setFromEndName(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.EuPackage#getBoundaryPoint_FromEndName()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.String" transient="true" ordered="false"
     *        extendedMetaData="name='BoundaryPoint.fromEndName' kind='element' namespace='http://iec.ch/TC57/CIM100-European'"
     * @generated
     */
    String getFromEndName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint#getFromEndName <em>From End Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>From End Name</em>' attribute.
     * @see #isSetFromEndName()
     * @see #unsetFromEndName()
     * @see #getFromEndName()
     * @generated
     */
    void setFromEndName( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint#getFromEndName <em>From End Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFromEndName()
     * @see #getFromEndName()
     * @see #setFromEndName(String)
     * @generated
     */
    void unsetFromEndName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint#getFromEndName <em>From End Name</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>From End Name</em>' attribute is set.
     * @see #unsetFromEndName()
     * @see #getFromEndName()
     * @see #setFromEndName(String)
     * @generated
     */
    boolean isSetFromEndName();

    /**
     * Returns the value of the '<em><b>To End Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A human readable name with length of the string 64 characters maximum. It covers the following two cases:
     * -if the Boundary point is placed on a tie-line, it is the name (IdentifiedObject.name) of the substation at which the "To" side of the tie-line is connected to.
     * -if the Boundary point is placed in a substation, it is the name (IdentifiedObject.name) of the element (e.g. PowerTransformer, ACLineSegment, Switch, etc.) at which the "To" side of the Boundary point is connected to.
     * <!-- end-model-doc -->
     * @return the value of the '<em>To End Name</em>' attribute.
     * @see #isSetToEndName()
     * @see #unsetToEndName()
     * @see #setToEndName(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.EuPackage#getBoundaryPoint_ToEndName()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.String" transient="true" ordered="false"
     *        extendedMetaData="name='BoundaryPoint.toEndName' kind='element' namespace='http://iec.ch/TC57/CIM100-European'"
     * @generated
     */
    String getToEndName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint#getToEndName <em>To End Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>To End Name</em>' attribute.
     * @see #isSetToEndName()
     * @see #unsetToEndName()
     * @see #getToEndName()
     * @generated
     */
    void setToEndName( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint#getToEndName <em>To End Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetToEndName()
     * @see #getToEndName()
     * @see #setToEndName(String)
     * @generated
     */
    void unsetToEndName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint#getToEndName <em>To End Name</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>To End Name</em>' attribute is set.
     * @see #unsetToEndName()
     * @see #getToEndName()
     * @see #setToEndName(String)
     * @generated
     */
    boolean isSetToEndName();

} // BoundaryPoint

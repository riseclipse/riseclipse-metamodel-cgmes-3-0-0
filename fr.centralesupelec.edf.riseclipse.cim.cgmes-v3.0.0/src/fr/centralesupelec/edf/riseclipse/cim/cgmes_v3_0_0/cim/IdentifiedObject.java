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
 * A representation of the model object '<em><b>Identified Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is a root class to provide common identification for all classes needing identification and naming attributes.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.IdentifiedObject#getEnergyIdentCodeEic <em>Energy Ident Code Eic</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.IdentifiedObject#getDescription <em>Description</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.IdentifiedObject#getMRID <em>MRID</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.IdentifiedObject#getName <em>Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.IdentifiedObject#getShortName <em>Short Name</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.IdentifiedObject#getDiagramObjects <em>Diagram Objects</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getIdentifiedObject()
 * @model
 * @generated
 */
public interface IdentifiedObject extends CimObjectWithID {
    /**
     * Returns the value of the '<em><b>MRID</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Master resource identifier issued by a model authority. The mRID is unique within an exchange context. Global uniqueness is easily achieved by using a UUID, as specified in RFC 4122, for the mRID. The use of UUID is strongly recommended.
     * For CIMXML data files in RDF syntax conforming to IEC 61970-552, the mRID is mapped to rdf:ID or rdf:about attributes that identify CIM object elements.
     * <!-- end-model-doc -->
     * @return the value of the '<em>MRID</em>' attribute.
     * @see #isSetMRID()
     * @see #unsetMRID()
     * @see #setMRID(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getIdentifiedObject_MRID()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.String" transient="true" ordered="false"
     *        extendedMetaData="name='IdentifiedObject.mRID' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    String getMRID();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.IdentifiedObject#getMRID <em>MRID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>MRID</em>' attribute.
     * @see #isSetMRID()
     * @see #unsetMRID()
     * @see #getMRID()
     * @generated
     */
    void setMRID( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.IdentifiedObject#getMRID <em>MRID</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMRID()
     * @see #getMRID()
     * @see #setMRID(String)
     * @generated
     */
    void unsetMRID();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.IdentifiedObject#getMRID <em>MRID</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>MRID</em>' attribute is set.
     * @see #unsetMRID()
     * @see #getMRID()
     * @see #setMRID(String)
     * @generated
     */
    boolean isSetMRID();

    /**
     * Returns the value of the '<em><b>Short Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The attribute is used for an exchange of a human readable short name with length of the string 12 characters maximum.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Short Name</em>' attribute.
     * @see #isSetShortName()
     * @see #unsetShortName()
     * @see #setShortName(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getIdentifiedObject_ShortName()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.String" transient="true" ordered="false"
     *        extendedMetaData="name='IdentifiedObject.shortName' kind='element' namespace='http://iec.ch/TC57/CIM100-European'"
     * @generated
     */
    String getShortName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.IdentifiedObject#getShortName <em>Short Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Short Name</em>' attribute.
     * @see #isSetShortName()
     * @see #unsetShortName()
     * @see #getShortName()
     * @generated
     */
    void setShortName( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.IdentifiedObject#getShortName <em>Short Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetShortName()
     * @see #getShortName()
     * @see #setShortName(String)
     * @generated
     */
    void unsetShortName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.IdentifiedObject#getShortName <em>Short Name</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Short Name</em>' attribute is set.
     * @see #unsetShortName()
     * @see #getShortName()
     * @see #setShortName(String)
     * @generated
     */
    boolean isSetShortName();

    /**
     * Returns the value of the '<em><b>Diagram Objects</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObject}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObject#getIdentifiedObject <em>Identified Object</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The diagram objects that are associated with the domain object.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Diagram Objects</em>' reference list.
     * @see #isSetDiagramObjects()
     * @see #unsetDiagramObjects()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getIdentifiedObject_DiagramObjects()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DiagramObject#getIdentifiedObject
     * @model opposite="IdentifiedObject" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='IdentifiedObject.DiagramObjects' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< DiagramObject > getDiagramObjects();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.IdentifiedObject#getDiagramObjects <em>Diagram Objects</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDiagramObjects()
     * @see #getDiagramObjects()
     * @generated
     */
    void unsetDiagramObjects();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.IdentifiedObject#getDiagramObjects <em>Diagram Objects</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Diagram Objects</em>' reference list is set.
     * @see #unsetDiagramObjects()
     * @see #getDiagramObjects()
     * @generated
     */
    boolean isSetDiagramObjects();

    /**
     * Returns the value of the '<em><b>Energy Ident Code Eic</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The attribute is used for an exchange of the EIC code (Energy identification Code). The length of the string is 16 characters as defined by the EIC code. For details on EIC scheme please refer to ENTSO-E web site.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Energy Ident Code Eic</em>' attribute.
     * @see #isSetEnergyIdentCodeEic()
     * @see #unsetEnergyIdentCodeEic()
     * @see #setEnergyIdentCodeEic(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getIdentifiedObject_EnergyIdentCodeEic()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.String" transient="true" ordered="false"
     *        extendedMetaData="name='IdentifiedObject.energyIdentCodeEic' kind='element' namespace='http://iec.ch/TC57/CIM100-European'"
     * @generated
     */
    String getEnergyIdentCodeEic();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.IdentifiedObject#getEnergyIdentCodeEic <em>Energy Ident Code Eic</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Energy Ident Code Eic</em>' attribute.
     * @see #isSetEnergyIdentCodeEic()
     * @see #unsetEnergyIdentCodeEic()
     * @see #getEnergyIdentCodeEic()
     * @generated
     */
    void setEnergyIdentCodeEic( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.IdentifiedObject#getEnergyIdentCodeEic <em>Energy Ident Code Eic</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEnergyIdentCodeEic()
     * @see #getEnergyIdentCodeEic()
     * @see #setEnergyIdentCodeEic(String)
     * @generated
     */
    void unsetEnergyIdentCodeEic();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.IdentifiedObject#getEnergyIdentCodeEic <em>Energy Ident Code Eic</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Energy Ident Code Eic</em>' attribute is set.
     * @see #unsetEnergyIdentCodeEic()
     * @see #getEnergyIdentCodeEic()
     * @see #setEnergyIdentCodeEic(String)
     * @generated
     */
    boolean isSetEnergyIdentCodeEic();

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The name is any free human readable and possibly non unique text naming the object.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #isSetName()
     * @see #unsetName()
     * @see #setName(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getIdentifiedObject_Name()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.String" transient="true" ordered="false"
     *        extendedMetaData="name='IdentifiedObject.name' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.IdentifiedObject#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #isSetName()
     * @see #unsetName()
     * @see #getName()
     * @generated
     */
    void setName( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.IdentifiedObject#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetName()
     * @see #getName()
     * @see #setName(String)
     * @generated
     */
    void unsetName();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.IdentifiedObject#getName <em>Name</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Name</em>' attribute is set.
     * @see #unsetName()
     * @see #getName()
     * @see #setName(String)
     * @generated
     */
    boolean isSetName();

    /**
     * Returns the value of the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The description is a free human readable text describing or naming the object. It may be non unique and may not correlate to a naming hierarchy.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Description</em>' attribute.
     * @see #isSetDescription()
     * @see #unsetDescription()
     * @see #setDescription(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getIdentifiedObject_Description()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.String" transient="true" ordered="false"
     *        extendedMetaData="name='IdentifiedObject.description' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    String getDescription();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.IdentifiedObject#getDescription <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Description</em>' attribute.
     * @see #isSetDescription()
     * @see #unsetDescription()
     * @see #getDescription()
     * @generated
     */
    void setDescription( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.IdentifiedObject#getDescription <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDescription()
     * @see #getDescription()
     * @see #setDescription(String)
     * @generated
     */
    void unsetDescription();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.IdentifiedObject#getDescription <em>Description</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Description</em>' attribute is set.
     * @see #unsetDescription()
     * @see #getDescription()
     * @see #setDescription(String)
     * @generated
     */
    boolean isSetDescription();

} // IdentifiedObject

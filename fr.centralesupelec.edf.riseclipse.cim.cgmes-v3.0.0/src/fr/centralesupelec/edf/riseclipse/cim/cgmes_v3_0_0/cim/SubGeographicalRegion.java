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
 * A representation of the model object '<em><b>Sub Geographical Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A subset of a geographical region of a power system network model.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SubGeographicalRegion#getLines <em>Lines</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SubGeographicalRegion#getSubstations <em>Substations</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SubGeographicalRegion#getDCLines <em>DC Lines</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SubGeographicalRegion#getRegion <em>Region</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSubGeographicalRegion()
 * @model
 * @generated
 */
public interface SubGeographicalRegion extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Region</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeographicalRegion#getRegions <em>Regions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The geographical region which this sub-geographical region is within.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Region</em>' reference.
     * @see #isSetRegion()
     * @see #unsetRegion()
     * @see #setRegion(GeographicalRegion)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSubGeographicalRegion_Region()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeographicalRegion#getRegions
     * @model opposite="Regions" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='SubGeographicalRegion.Region' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    GeographicalRegion getRegion();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SubGeographicalRegion#getRegion <em>Region</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Region</em>' reference.
     * @see #isSetRegion()
     * @see #unsetRegion()
     * @see #getRegion()
     * @generated
     */
    void setRegion( GeographicalRegion value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SubGeographicalRegion#getRegion <em>Region</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRegion()
     * @see #getRegion()
     * @see #setRegion(GeographicalRegion)
     * @generated
     */
    void unsetRegion();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SubGeographicalRegion#getRegion <em>Region</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Region</em>' reference is set.
     * @see #unsetRegion()
     * @see #getRegion()
     * @see #setRegion(GeographicalRegion)
     * @generated
     */
    boolean isSetRegion();

    /**
     * Returns the value of the '<em><b>DC Lines</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCLine}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCLine#getRegion <em>Region</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The DC lines in this sub-geographical region.
     * <!-- end-model-doc -->
     * @return the value of the '<em>DC Lines</em>' reference list.
     * @see #isSetDCLines()
     * @see #unsetDCLines()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSubGeographicalRegion_DCLines()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DCLine#getRegion
     * @model opposite="Region" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='SubGeographicalRegion.DCLines' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< DCLine > getDCLines();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SubGeographicalRegion#getDCLines <em>DC Lines</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDCLines()
     * @see #getDCLines()
     * @generated
     */
    void unsetDCLines();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SubGeographicalRegion#getDCLines <em>DC Lines</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>DC Lines</em>' reference list is set.
     * @see #unsetDCLines()
     * @see #getDCLines()
     * @generated
     */
    boolean isSetDCLines();

    /**
     * Returns the value of the '<em><b>Substations</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Substation}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Substation#getRegion <em>Region</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The substations in this sub-geographical region.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Substations</em>' reference list.
     * @see #isSetSubstations()
     * @see #unsetSubstations()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSubGeographicalRegion_Substations()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Substation#getRegion
     * @model opposite="Region" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='SubGeographicalRegion.Substations' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< Substation > getSubstations();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SubGeographicalRegion#getSubstations <em>Substations</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSubstations()
     * @see #getSubstations()
     * @generated
     */
    void unsetSubstations();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SubGeographicalRegion#getSubstations <em>Substations</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Substations</em>' reference list is set.
     * @see #unsetSubstations()
     * @see #getSubstations()
     * @generated
     */
    boolean isSetSubstations();

    /**
     * Returns the value of the '<em><b>Lines</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Line}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Line#getRegion <em>Region</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The lines within the sub-geographical region.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Lines</em>' reference list.
     * @see #isSetLines()
     * @see #unsetLines()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSubGeographicalRegion_Lines()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Line#getRegion
     * @model opposite="Region" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='SubGeographicalRegion.Lines' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< Line > getLines();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SubGeographicalRegion#getLines <em>Lines</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLines()
     * @see #getLines()
     * @generated
     */
    void unsetLines();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SubGeographicalRegion#getLines <em>Lines</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Lines</em>' reference list is set.
     * @see #unsetLines()
     * @see #getLines()
     * @generated
     */
    boolean isSetLines();

} // SubGeographicalRegion

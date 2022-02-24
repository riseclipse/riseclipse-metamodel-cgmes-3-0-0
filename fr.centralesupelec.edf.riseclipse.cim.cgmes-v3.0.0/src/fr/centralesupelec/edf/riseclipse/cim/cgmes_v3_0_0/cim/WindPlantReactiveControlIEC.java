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
 * A representation of the model object '<em><b>Wind Plant Reactive Control IEC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Simplified plant voltage and reactive power control model for use with type 3 and type 4 wind turbine models.
 * Reference: IEC 61400-27-1:2015, Annex D.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getWindDynamicsLookupTable <em>Wind Dynamics Lookup Table</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getKiwpx <em>Kiwpx</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getWindPlantQcontrolModesType <em>Wind Plant Qcontrol Modes Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getKwpqu <em>Kwpqu</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getTwpqfiltq <em>Twpqfiltq</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getTuqfilt <em>Tuqfilt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getDxrefmin <em>Dxrefmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getKpwpx <em>Kpwpx</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getXrefmax <em>Xrefmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getWindPlantIEC <em>Wind Plant IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getTwppfiltq <em>Twppfiltq</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getXrefmin <em>Xrefmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getTxfv <em>Txfv</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getTxft <em>Txft</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getDxrefmax <em>Dxrefmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getUwpqdip <em>Uwpqdip</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getKwpqref <em>Kwpqref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getKiwpxmax <em>Kiwpxmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getTwpufiltq <em>Twpufiltq</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getKiwpxmin <em>Kiwpxmin</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindPlantReactiveControlIEC()
 * @model
 * @generated
 */
public interface WindPlantReactiveControlIEC extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Wind Dynamics Lookup Table</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getWindPlantReactiveControlIEC <em>Wind Plant Reactive Control IEC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The wind dynamics lookup table associated with this voltage and reactive power wind plant model.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wind Dynamics Lookup Table</em>' reference list.
     * @see #isSetWindDynamicsLookupTable()
     * @see #unsetWindDynamicsLookupTable()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindPlantReactiveControlIEC_WindDynamicsLookupTable()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getWindPlantReactiveControlIEC
     * @model opposite="WindPlantReactiveControlIEC" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='WindPlantReactiveControlIEC.WindDynamicsLookupTable' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< WindDynamicsLookupTable > getWindDynamicsLookupTable();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getWindDynamicsLookupTable <em>Wind Dynamics Lookup Table</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindDynamicsLookupTable()
     * @see #getWindDynamicsLookupTable()
     * @generated
     */
    void unsetWindDynamicsLookupTable();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getWindDynamicsLookupTable <em>Wind Dynamics Lookup Table</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Dynamics Lookup Table</em>' reference list is set.
     * @see #unsetWindDynamicsLookupTable()
     * @see #getWindDynamicsLookupTable()
     * @generated
     */
    boolean isSetWindDynamicsLookupTable();

    /**
     * Returns the value of the '<em><b>Kiwpx</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Plant Q controller integral gain (<i>K</i><i><sub>IWPx</sub></i>). It is a project-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kiwpx</em>' attribute.
     * @see #isSetKiwpx()
     * @see #unsetKiwpx()
     * @see #setKiwpx(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindPlantReactiveControlIEC_Kiwpx()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='WindPlantReactiveControlIEC.kiwpx' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKiwpx();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getKiwpx <em>Kiwpx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kiwpx</em>' attribute.
     * @see #isSetKiwpx()
     * @see #unsetKiwpx()
     * @see #getKiwpx()
     * @generated
     */
    void setKiwpx( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getKiwpx <em>Kiwpx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKiwpx()
     * @see #getKiwpx()
     * @see #setKiwpx(Double)
     * @generated
     */
    void unsetKiwpx();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getKiwpx <em>Kiwpx</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kiwpx</em>' attribute is set.
     * @see #unsetKiwpx()
     * @see #getKiwpx()
     * @see #setKiwpx(Double)
     * @generated
     */
    boolean isSetKiwpx();

    /**
     * Returns the value of the '<em><b>Wind Plant Qcontrol Modes Type</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantQcontrolModeKind}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reactive power/voltage controller mode (<i>M</i><i><sub>WPqmode</sub></i>). It is a case-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wind Plant Qcontrol Modes Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantQcontrolModeKind
     * @see #isSetWindPlantQcontrolModesType()
     * @see #unsetWindPlantQcontrolModesType()
     * @see #setWindPlantQcontrolModesType(WindPlantQcontrolModeKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindPlantReactiveControlIEC_WindPlantQcontrolModesType()
     * @model unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='WindPlantReactiveControlIEC.windPlantQcontrolModesType' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    WindPlantQcontrolModeKind getWindPlantQcontrolModesType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getWindPlantQcontrolModesType <em>Wind Plant Qcontrol Modes Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Plant Qcontrol Modes Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantQcontrolModeKind
     * @see #isSetWindPlantQcontrolModesType()
     * @see #unsetWindPlantQcontrolModesType()
     * @see #getWindPlantQcontrolModesType()
     * @generated
     */
    void setWindPlantQcontrolModesType( WindPlantQcontrolModeKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getWindPlantQcontrolModesType <em>Wind Plant Qcontrol Modes Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindPlantQcontrolModesType()
     * @see #getWindPlantQcontrolModesType()
     * @see #setWindPlantQcontrolModesType(WindPlantQcontrolModeKind)
     * @generated
     */
    void unsetWindPlantQcontrolModesType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getWindPlantQcontrolModesType <em>Wind Plant Qcontrol Modes Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Plant Qcontrol Modes Type</em>' attribute is set.
     * @see #unsetWindPlantQcontrolModesType()
     * @see #getWindPlantQcontrolModesType()
     * @see #setWindPlantQcontrolModesType(WindPlantQcontrolModeKind)
     * @generated
     */
    boolean isSetWindPlantQcontrolModesType();

    /**
     * Returns the value of the '<em><b>Kwpqu</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Plant voltage control droop (<i>K</i><i><sub>WPqu</sub></i>). It is a project-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kwpqu</em>' attribute.
     * @see #isSetKwpqu()
     * @see #unsetKwpqu()
     * @see #setKwpqu(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindPlantReactiveControlIEC_Kwpqu()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindPlantReactiveControlIEC.kwpqu' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKwpqu();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getKwpqu <em>Kwpqu</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kwpqu</em>' attribute.
     * @see #isSetKwpqu()
     * @see #unsetKwpqu()
     * @see #getKwpqu()
     * @generated
     */
    void setKwpqu( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getKwpqu <em>Kwpqu</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKwpqu()
     * @see #getKwpqu()
     * @see #setKwpqu(Double)
     * @generated
     */
    void unsetKwpqu();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getKwpqu <em>Kwpqu</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kwpqu</em>' attribute is set.
     * @see #unsetKwpqu()
     * @see #getKwpqu()
     * @see #setKwpqu(Double)
     * @generated
     */
    boolean isSetKwpqu();

    /**
     * Returns the value of the '<em><b>Twpqfiltq</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Filter time constant for reactive power measurement (<i>T</i><i><sub>WPqfiltq</sub></i>) (&gt;= 0). It is a project-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Twpqfiltq</em>' attribute.
     * @see #isSetTwpqfiltq()
     * @see #unsetTwpqfiltq()
     * @see #setTwpqfiltq(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindPlantReactiveControlIEC_Twpqfiltq()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='WindPlantReactiveControlIEC.twpqfiltq' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTwpqfiltq();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getTwpqfiltq <em>Twpqfiltq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Twpqfiltq</em>' attribute.
     * @see #isSetTwpqfiltq()
     * @see #unsetTwpqfiltq()
     * @see #getTwpqfiltq()
     * @generated
     */
    void setTwpqfiltq( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getTwpqfiltq <em>Twpqfiltq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTwpqfiltq()
     * @see #getTwpqfiltq()
     * @see #setTwpqfiltq(Double)
     * @generated
     */
    void unsetTwpqfiltq();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getTwpqfiltq <em>Twpqfiltq</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Twpqfiltq</em>' attribute is set.
     * @see #unsetTwpqfiltq()
     * @see #getTwpqfiltq()
     * @see #setTwpqfiltq(Double)
     * @generated
     */
    boolean isSetTwpqfiltq();

    /**
     * Returns the value of the '<em><b>Tuqfilt</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Filter time constant for voltage-dependent reactive power (<i>T</i><i><sub>uqfilt</sub></i>) (&gt;= 0). It is a project-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tuqfilt</em>' attribute.
     * @see #isSetTuqfilt()
     * @see #unsetTuqfilt()
     * @see #setTuqfilt(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindPlantReactiveControlIEC_Tuqfilt()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='WindPlantReactiveControlIEC.tuqfilt' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTuqfilt();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getTuqfilt <em>Tuqfilt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tuqfilt</em>' attribute.
     * @see #isSetTuqfilt()
     * @see #unsetTuqfilt()
     * @see #getTuqfilt()
     * @generated
     */
    void setTuqfilt( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getTuqfilt <em>Tuqfilt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTuqfilt()
     * @see #getTuqfilt()
     * @see #setTuqfilt(Double)
     * @generated
     */
    void unsetTuqfilt();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getTuqfilt <em>Tuqfilt</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tuqfilt</em>' attribute is set.
     * @see #unsetTuqfilt()
     * @see #getTuqfilt()
     * @see #setTuqfilt(Double)
     * @generated
     */
    boolean isSetTuqfilt();

    /**
     * Returns the value of the '<em><b>Dxrefmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum negative ramp rate for wind turbine reactive power/voltage reference (<i>dx</i><i><sub>refmin</sub></i>) (&lt; WindPlantReactiveControlIEC.dxrefmax). It is a project-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Dxrefmin</em>' attribute.
     * @see #isSetDxrefmin()
     * @see #unsetDxrefmin()
     * @see #setDxrefmin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindPlantReactiveControlIEC_Dxrefmin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindPlantReactiveControlIEC.dxrefmin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getDxrefmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getDxrefmin <em>Dxrefmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dxrefmin</em>' attribute.
     * @see #isSetDxrefmin()
     * @see #unsetDxrefmin()
     * @see #getDxrefmin()
     * @generated
     */
    void setDxrefmin( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getDxrefmin <em>Dxrefmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDxrefmin()
     * @see #getDxrefmin()
     * @see #setDxrefmin(Double)
     * @generated
     */
    void unsetDxrefmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getDxrefmin <em>Dxrefmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dxrefmin</em>' attribute is set.
     * @see #unsetDxrefmin()
     * @see #getDxrefmin()
     * @see #setDxrefmin(Double)
     * @generated
     */
    boolean isSetDxrefmin();

    /**
     * Returns the value of the '<em><b>Kpwpx</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Plant Q controller proportional gain (<i>K</i><i><sub>PWPx</sub></i>). It is a project-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kpwpx</em>' attribute.
     * @see #isSetKpwpx()
     * @see #unsetKpwpx()
     * @see #setKpwpx(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindPlantReactiveControlIEC_Kpwpx()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='WindPlantReactiveControlIEC.kpwpx' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKpwpx();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getKpwpx <em>Kpwpx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kpwpx</em>' attribute.
     * @see #isSetKpwpx()
     * @see #unsetKpwpx()
     * @see #getKpwpx()
     * @generated
     */
    void setKpwpx( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getKpwpx <em>Kpwpx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKpwpx()
     * @see #getKpwpx()
     * @see #setKpwpx(Double)
     * @generated
     */
    void unsetKpwpx();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getKpwpx <em>Kpwpx</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kpwpx</em>' attribute is set.
     * @see #unsetKpwpx()
     * @see #getKpwpx()
     * @see #setKpwpx(Double)
     * @generated
     */
    boolean isSetKpwpx();

    /**
     * Returns the value of the '<em><b>Xrefmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum <i>x</i><sub>WTref</sub> (<i>q</i><i><sub>WTref</sub></i> or delta<i> u</i><i><sub>WTref</sub></i>) request from the plant controller (<i>x</i><i><sub>refmax</sub></i>) (&gt; WindPlantReactiveControlIEC.xrefmin). It is a case-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Xrefmax</em>' attribute.
     * @see #isSetXrefmax()
     * @see #unsetXrefmax()
     * @see #setXrefmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindPlantReactiveControlIEC_Xrefmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindPlantReactiveControlIEC.xrefmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getXrefmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getXrefmax <em>Xrefmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xrefmax</em>' attribute.
     * @see #isSetXrefmax()
     * @see #unsetXrefmax()
     * @see #getXrefmax()
     * @generated
     */
    void setXrefmax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getXrefmax <em>Xrefmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXrefmax()
     * @see #getXrefmax()
     * @see #setXrefmax(Double)
     * @generated
     */
    void unsetXrefmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getXrefmax <em>Xrefmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Xrefmax</em>' attribute is set.
     * @see #unsetXrefmax()
     * @see #getXrefmax()
     * @see #setXrefmax(Double)
     * @generated
     */
    boolean isSetXrefmax();

    /**
     * Returns the value of the '<em><b>Wind Plant IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantIEC#getWindPlantReactiveControlIEC <em>Wind Plant Reactive Control IEC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Wind plant reactive control model associated with this wind plant.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wind Plant IEC</em>' reference.
     * @see #isSetWindPlantIEC()
     * @see #unsetWindPlantIEC()
     * @see #setWindPlantIEC(WindPlantIEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindPlantReactiveControlIEC_WindPlantIEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantIEC#getWindPlantReactiveControlIEC
     * @model opposite="WindPlantReactiveControlIEC" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='WindPlantReactiveControlIEC.WindPlantIEC' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    WindPlantIEC getWindPlantIEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getWindPlantIEC <em>Wind Plant IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Plant IEC</em>' reference.
     * @see #isSetWindPlantIEC()
     * @see #unsetWindPlantIEC()
     * @see #getWindPlantIEC()
     * @generated
     */
    void setWindPlantIEC( WindPlantIEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getWindPlantIEC <em>Wind Plant IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindPlantIEC()
     * @see #getWindPlantIEC()
     * @see #setWindPlantIEC(WindPlantIEC)
     * @generated
     */
    void unsetWindPlantIEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getWindPlantIEC <em>Wind Plant IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Plant IEC</em>' reference is set.
     * @see #unsetWindPlantIEC()
     * @see #getWindPlantIEC()
     * @see #setWindPlantIEC(WindPlantIEC)
     * @generated
     */
    boolean isSetWindPlantIEC();

    /**
     * Returns the value of the '<em><b>Twppfiltq</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Filter time constant for active power measurement (<i>T</i><i><sub>WPpfiltq</sub></i>) (&gt;= 0). It is a project-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Twppfiltq</em>' attribute.
     * @see #isSetTwppfiltq()
     * @see #unsetTwppfiltq()
     * @see #setTwppfiltq(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindPlantReactiveControlIEC_Twppfiltq()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='WindPlantReactiveControlIEC.twppfiltq' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTwppfiltq();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getTwppfiltq <em>Twppfiltq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Twppfiltq</em>' attribute.
     * @see #isSetTwppfiltq()
     * @see #unsetTwppfiltq()
     * @see #getTwppfiltq()
     * @generated
     */
    void setTwppfiltq( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getTwppfiltq <em>Twppfiltq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTwppfiltq()
     * @see #getTwppfiltq()
     * @see #setTwppfiltq(Double)
     * @generated
     */
    void unsetTwppfiltq();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getTwppfiltq <em>Twppfiltq</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Twppfiltq</em>' attribute is set.
     * @see #unsetTwppfiltq()
     * @see #getTwppfiltq()
     * @see #setTwppfiltq(Double)
     * @generated
     */
    boolean isSetTwppfiltq();

    /**
     * Returns the value of the '<em><b>Xrefmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum <i>x</i><i><sub>WTref</sub></i> (<i>q</i><i><sub>WTref</sub></i> or delta <i>u</i><i><sub>WTref</sub></i>) request from the plant controller (<i>x</i><i><sub>refmin</sub></i>) (&lt; WindPlantReactiveControlIEC.xrefmax). It is a project-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Xrefmin</em>' attribute.
     * @see #isSetXrefmin()
     * @see #unsetXrefmin()
     * @see #setXrefmin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindPlantReactiveControlIEC_Xrefmin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindPlantReactiveControlIEC.xrefmin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getXrefmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getXrefmin <em>Xrefmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xrefmin</em>' attribute.
     * @see #isSetXrefmin()
     * @see #unsetXrefmin()
     * @see #getXrefmin()
     * @generated
     */
    void setXrefmin( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getXrefmin <em>Xrefmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXrefmin()
     * @see #getXrefmin()
     * @see #setXrefmin(Double)
     * @generated
     */
    void unsetXrefmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getXrefmin <em>Xrefmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Xrefmin</em>' attribute is set.
     * @see #unsetXrefmin()
     * @see #getXrefmin()
     * @see #setXrefmin(Double)
     * @generated
     */
    boolean isSetXrefmin();

    /**
     * Returns the value of the '<em><b>Txfv</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Lag time constant in reference value transfer function (<i>T</i><i><sub>xfv</sub></i>) (&gt;= 0). It is a project-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Txfv</em>' attribute.
     * @see #isSetTxfv()
     * @see #unsetTxfv()
     * @see #setTxfv(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindPlantReactiveControlIEC_Txfv()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='WindPlantReactiveControlIEC.txfv' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTxfv();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getTxfv <em>Txfv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Txfv</em>' attribute.
     * @see #isSetTxfv()
     * @see #unsetTxfv()
     * @see #getTxfv()
     * @generated
     */
    void setTxfv( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getTxfv <em>Txfv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTxfv()
     * @see #getTxfv()
     * @see #setTxfv(Double)
     * @generated
     */
    void unsetTxfv();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getTxfv <em>Txfv</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Txfv</em>' attribute is set.
     * @see #unsetTxfv()
     * @see #getTxfv()
     * @see #setTxfv(Double)
     * @generated
     */
    boolean isSetTxfv();

    /**
     * Returns the value of the '<em><b>Txft</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Lead time constant in reference value transfer function (<i>T</i><i><sub>xft</sub></i>) (&gt;= 0). It is a project-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Txft</em>' attribute.
     * @see #isSetTxft()
     * @see #unsetTxft()
     * @see #setTxft(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindPlantReactiveControlIEC_Txft()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='WindPlantReactiveControlIEC.txft' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTxft();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getTxft <em>Txft</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Txft</em>' attribute.
     * @see #isSetTxft()
     * @see #unsetTxft()
     * @see #getTxft()
     * @generated
     */
    void setTxft( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getTxft <em>Txft</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTxft()
     * @see #getTxft()
     * @see #setTxft(Double)
     * @generated
     */
    void unsetTxft();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getTxft <em>Txft</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Txft</em>' attribute is set.
     * @see #unsetTxft()
     * @see #getTxft()
     * @see #setTxft(Double)
     * @generated
     */
    boolean isSetTxft();

    /**
     * Returns the value of the '<em><b>Dxrefmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum positive ramp rate for wind turbine reactive power/voltage reference (<i>dx</i><i><sub>refmax</sub></i>) (&gt; WindPlantReactiveControlIEC.dxrefmin). It is a project-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Dxrefmax</em>' attribute.
     * @see #isSetDxrefmax()
     * @see #unsetDxrefmax()
     * @see #setDxrefmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindPlantReactiveControlIEC_Dxrefmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindPlantReactiveControlIEC.dxrefmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getDxrefmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getDxrefmax <em>Dxrefmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dxrefmax</em>' attribute.
     * @see #isSetDxrefmax()
     * @see #unsetDxrefmax()
     * @see #getDxrefmax()
     * @generated
     */
    void setDxrefmax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getDxrefmax <em>Dxrefmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDxrefmax()
     * @see #getDxrefmax()
     * @see #setDxrefmax(Double)
     * @generated
     */
    void unsetDxrefmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getDxrefmax <em>Dxrefmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dxrefmax</em>' attribute is set.
     * @see #unsetDxrefmax()
     * @see #getDxrefmax()
     * @see #setDxrefmax(Double)
     * @generated
     */
    boolean isSetDxrefmax();

    /**
     * Returns the value of the '<em><b>Uwpqdip</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Voltage threshold for UVRT detection in Q control (<i>u</i><i><sub>WPqdip</sub></i>). It is a project-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Uwpqdip</em>' attribute.
     * @see #isSetUwpqdip()
     * @see #unsetUwpqdip()
     * @see #setUwpqdip(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindPlantReactiveControlIEC_Uwpqdip()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindPlantReactiveControlIEC.uwpqdip' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getUwpqdip();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getUwpqdip <em>Uwpqdip</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Uwpqdip</em>' attribute.
     * @see #isSetUwpqdip()
     * @see #unsetUwpqdip()
     * @see #getUwpqdip()
     * @generated
     */
    void setUwpqdip( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getUwpqdip <em>Uwpqdip</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUwpqdip()
     * @see #getUwpqdip()
     * @see #setUwpqdip(Double)
     * @generated
     */
    void unsetUwpqdip();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getUwpqdip <em>Uwpqdip</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Uwpqdip</em>' attribute is set.
     * @see #unsetUwpqdip()
     * @see #getUwpqdip()
     * @see #setUwpqdip(Double)
     * @generated
     */
    boolean isSetUwpqdip();

    /**
     * Returns the value of the '<em><b>Kwpqref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reactive power reference gain (<i>K</i><i><sub>WPqref</sub></i>). It is a project-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kwpqref</em>' attribute.
     * @see #isSetKwpqref()
     * @see #unsetKwpqref()
     * @see #setKwpqref(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindPlantReactiveControlIEC_Kwpqref()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindPlantReactiveControlIEC.kwpqref' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKwpqref();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getKwpqref <em>Kwpqref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kwpqref</em>' attribute.
     * @see #isSetKwpqref()
     * @see #unsetKwpqref()
     * @see #getKwpqref()
     * @generated
     */
    void setKwpqref( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getKwpqref <em>Kwpqref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKwpqref()
     * @see #getKwpqref()
     * @see #setKwpqref(Double)
     * @generated
     */
    void unsetKwpqref();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getKwpqref <em>Kwpqref</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kwpqref</em>' attribute is set.
     * @see #unsetKwpqref()
     * @see #getKwpqref()
     * @see #setKwpqref(Double)
     * @generated
     */
    boolean isSetKwpqref();

    /**
     * Returns the value of the '<em><b>Kiwpxmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum reactive power/voltage reference from integration (<i>K</i><i><sub>IWPxmax</sub></i>) (&gt; WindPlantReactiveControlIEC.kiwpxmin). It is a project-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kiwpxmax</em>' attribute.
     * @see #isSetKiwpxmax()
     * @see #unsetKiwpxmax()
     * @see #setKiwpxmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindPlantReactiveControlIEC_Kiwpxmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindPlantReactiveControlIEC.kiwpxmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKiwpxmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getKiwpxmax <em>Kiwpxmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kiwpxmax</em>' attribute.
     * @see #isSetKiwpxmax()
     * @see #unsetKiwpxmax()
     * @see #getKiwpxmax()
     * @generated
     */
    void setKiwpxmax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getKiwpxmax <em>Kiwpxmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKiwpxmax()
     * @see #getKiwpxmax()
     * @see #setKiwpxmax(Double)
     * @generated
     */
    void unsetKiwpxmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getKiwpxmax <em>Kiwpxmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kiwpxmax</em>' attribute is set.
     * @see #unsetKiwpxmax()
     * @see #getKiwpxmax()
     * @see #setKiwpxmax(Double)
     * @generated
     */
    boolean isSetKiwpxmax();

    /**
     * Returns the value of the '<em><b>Twpufiltq</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Filter time constant for voltage measurement (<i>T</i><i><sub>WPufiltq</sub></i>) (&gt;= 0). It is a project-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Twpufiltq</em>' attribute.
     * @see #isSetTwpufiltq()
     * @see #unsetTwpufiltq()
     * @see #setTwpufiltq(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindPlantReactiveControlIEC_Twpufiltq()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='WindPlantReactiveControlIEC.twpufiltq' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTwpufiltq();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getTwpufiltq <em>Twpufiltq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Twpufiltq</em>' attribute.
     * @see #isSetTwpufiltq()
     * @see #unsetTwpufiltq()
     * @see #getTwpufiltq()
     * @generated
     */
    void setTwpufiltq( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getTwpufiltq <em>Twpufiltq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTwpufiltq()
     * @see #getTwpufiltq()
     * @see #setTwpufiltq(Double)
     * @generated
     */
    void unsetTwpufiltq();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getTwpufiltq <em>Twpufiltq</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Twpufiltq</em>' attribute is set.
     * @see #unsetTwpufiltq()
     * @see #getTwpufiltq()
     * @see #setTwpufiltq(Double)
     * @generated
     */
    boolean isSetTwpufiltq();

    /**
     * Returns the value of the '<em><b>Kiwpxmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum reactive power/voltage reference from integration (<i>K</i><i><sub>IWPxmin</sub></i>) (&lt; WindPlantReactiveControlIEC.kiwpxmax). It is a project-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kiwpxmin</em>' attribute.
     * @see #isSetKiwpxmin()
     * @see #unsetKiwpxmin()
     * @see #setKiwpxmin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindPlantReactiveControlIEC_Kiwpxmin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindPlantReactiveControlIEC.kiwpxmin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKiwpxmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getKiwpxmin <em>Kiwpxmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kiwpxmin</em>' attribute.
     * @see #isSetKiwpxmin()
     * @see #unsetKiwpxmin()
     * @see #getKiwpxmin()
     * @generated
     */
    void setKiwpxmin( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getKiwpxmin <em>Kiwpxmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKiwpxmin()
     * @see #getKiwpxmin()
     * @see #setKiwpxmin(Double)
     * @generated
     */
    void unsetKiwpxmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getKiwpxmin <em>Kiwpxmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kiwpxmin</em>' attribute is set.
     * @see #unsetKiwpxmin()
     * @see #getKiwpxmin()
     * @see #setKiwpxmin(Double)
     * @generated
     */
    boolean isSetKiwpxmin();

} // WindPlantReactiveControlIEC

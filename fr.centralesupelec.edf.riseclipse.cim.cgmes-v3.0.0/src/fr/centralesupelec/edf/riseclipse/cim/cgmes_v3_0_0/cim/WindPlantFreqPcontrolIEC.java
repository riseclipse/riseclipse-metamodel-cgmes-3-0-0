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
 * A representation of the model object '<em><b>Wind Plant Freq Pcontrol IEC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Frequency and active power controller model.
 * Reference: IEC 61400-27-1:2015, Annex D.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getKwppref <em>Kwppref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getWindDynamicsLookupTable <em>Wind Dynamics Lookup Table</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getTwpffiltp <em>Twpffiltp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getKiwpp <em>Kiwpp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getPrefmin <em>Prefmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getPrefmax <em>Prefmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getKiwppmin <em>Kiwppmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getKiwppmax <em>Kiwppmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getTpft <em>Tpft</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getTpfv <em>Tpfv</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getTwppfiltp <em>Twppfiltp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getDprefmin <em>Dprefmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getDprefmax <em>Dprefmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getDpwprefmin <em>Dpwprefmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getDpwprefmax <em>Dpwprefmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getWindPlantIEC <em>Wind Plant IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getKpwpp <em>Kpwpp</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindPlantFreqPcontrolIEC()
 * @model
 * @generated
 */
public interface WindPlantFreqPcontrolIEC extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Kwppref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Power reference gain (<i>K</i><i><sub>WPpref</sub></i>). It is a project-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kwppref</em>' attribute.
     * @see #isSetKwppref()
     * @see #unsetKwppref()
     * @see #setKwppref(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindPlantFreqPcontrolIEC_Kwppref()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindPlantFreqPcontrolIEC.kwppref' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKwppref();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getKwppref <em>Kwppref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kwppref</em>' attribute.
     * @see #isSetKwppref()
     * @see #unsetKwppref()
     * @see #getKwppref()
     * @generated
     */
    void setKwppref( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getKwppref <em>Kwppref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKwppref()
     * @see #getKwppref()
     * @see #setKwppref(Double)
     * @generated
     */
    void unsetKwppref();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getKwppref <em>Kwppref</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kwppref</em>' attribute is set.
     * @see #unsetKwppref()
     * @see #getKwppref()
     * @see #setKwppref(Double)
     * @generated
     */
    boolean isSetKwppref();

    /**
     * Returns the value of the '<em><b>Wind Dynamics Lookup Table</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getWindPlantFreqPcontrolIEC <em>Wind Plant Freq Pcontrol IEC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The wind dynamics lookup table associated with this frequency and active power wind plant model.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wind Dynamics Lookup Table</em>' reference list.
     * @see #isSetWindDynamicsLookupTable()
     * @see #unsetWindDynamicsLookupTable()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindPlantFreqPcontrolIEC_WindDynamicsLookupTable()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getWindPlantFreqPcontrolIEC
     * @model opposite="WindPlantFreqPcontrolIEC" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='WindPlantFreqPcontrolIEC.WindDynamicsLookupTable' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< WindDynamicsLookupTable > getWindDynamicsLookupTable();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getWindDynamicsLookupTable <em>Wind Dynamics Lookup Table</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindDynamicsLookupTable()
     * @see #getWindDynamicsLookupTable()
     * @generated
     */
    void unsetWindDynamicsLookupTable();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getWindDynamicsLookupTable <em>Wind Dynamics Lookup Table</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Dynamics Lookup Table</em>' reference list is set.
     * @see #unsetWindDynamicsLookupTable()
     * @see #getWindDynamicsLookupTable()
     * @generated
     */
    boolean isSetWindDynamicsLookupTable();

    /**
     * Returns the value of the '<em><b>Twpffiltp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Filter time constant for frequency measurement (<i>T</i><i><sub>WPffiltp</sub></i>) (&gt;= 0). It is a project-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Twpffiltp</em>' attribute.
     * @see #isSetTwpffiltp()
     * @see #unsetTwpffiltp()
     * @see #setTwpffiltp(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindPlantFreqPcontrolIEC_Twpffiltp()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='WindPlantFreqPcontrolIEC.twpffiltp' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTwpffiltp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getTwpffiltp <em>Twpffiltp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Twpffiltp</em>' attribute.
     * @see #isSetTwpffiltp()
     * @see #unsetTwpffiltp()
     * @see #getTwpffiltp()
     * @generated
     */
    void setTwpffiltp( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getTwpffiltp <em>Twpffiltp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTwpffiltp()
     * @see #getTwpffiltp()
     * @see #setTwpffiltp(Double)
     * @generated
     */
    void unsetTwpffiltp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getTwpffiltp <em>Twpffiltp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Twpffiltp</em>' attribute is set.
     * @see #unsetTwpffiltp()
     * @see #getTwpffiltp()
     * @see #setTwpffiltp(Double)
     * @generated
     */
    boolean isSetTwpffiltp();

    /**
     * Returns the value of the '<em><b>Kiwpp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Plant P controller integral gain (<i>K</i><i><sub>IWPp</sub></i>). It is a project-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kiwpp</em>' attribute.
     * @see #isSetKiwpp()
     * @see #unsetKiwpp()
     * @see #setKiwpp(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindPlantFreqPcontrolIEC_Kiwpp()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='WindPlantFreqPcontrolIEC.kiwpp' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKiwpp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getKiwpp <em>Kiwpp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kiwpp</em>' attribute.
     * @see #isSetKiwpp()
     * @see #unsetKiwpp()
     * @see #getKiwpp()
     * @generated
     */
    void setKiwpp( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getKiwpp <em>Kiwpp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKiwpp()
     * @see #getKiwpp()
     * @see #setKiwpp(Double)
     * @generated
     */
    void unsetKiwpp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getKiwpp <em>Kiwpp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kiwpp</em>' attribute is set.
     * @see #unsetKiwpp()
     * @see #getKiwpp()
     * @see #setKiwpp(Double)
     * @generated
     */
    boolean isSetKiwpp();

    /**
     * Returns the value of the '<em><b>Prefmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum <i>p</i><i><sub>WTref</sub></i> request from the plant controller to the wind turbines (<i>p</i><i><sub>refmin</sub></i>) (&lt; WindPlantFreqPcontrolIEC.prefmax). It is a project-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Prefmin</em>' attribute.
     * @see #isSetPrefmin()
     * @see #unsetPrefmin()
     * @see #setPrefmin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindPlantFreqPcontrolIEC_Prefmin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindPlantFreqPcontrolIEC.prefmin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPrefmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getPrefmin <em>Prefmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Prefmin</em>' attribute.
     * @see #isSetPrefmin()
     * @see #unsetPrefmin()
     * @see #getPrefmin()
     * @generated
     */
    void setPrefmin( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getPrefmin <em>Prefmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPrefmin()
     * @see #getPrefmin()
     * @see #setPrefmin(Double)
     * @generated
     */
    void unsetPrefmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getPrefmin <em>Prefmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Prefmin</em>' attribute is set.
     * @see #unsetPrefmin()
     * @see #getPrefmin()
     * @see #setPrefmin(Double)
     * @generated
     */
    boolean isSetPrefmin();

    /**
     * Returns the value of the '<em><b>Prefmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum <i>p</i><i><sub>WTref</sub></i> request from the plant controller to the wind turbines (<i>p</i><i><sub>refmax</sub></i>) (&gt; WindPlantFreqPcontrolIEC.prefmin). It is a project-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Prefmax</em>' attribute.
     * @see #isSetPrefmax()
     * @see #unsetPrefmax()
     * @see #setPrefmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindPlantFreqPcontrolIEC_Prefmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindPlantFreqPcontrolIEC.prefmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPrefmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getPrefmax <em>Prefmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Prefmax</em>' attribute.
     * @see #isSetPrefmax()
     * @see #unsetPrefmax()
     * @see #getPrefmax()
     * @generated
     */
    void setPrefmax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getPrefmax <em>Prefmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPrefmax()
     * @see #getPrefmax()
     * @see #setPrefmax(Double)
     * @generated
     */
    void unsetPrefmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getPrefmax <em>Prefmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Prefmax</em>' attribute is set.
     * @see #unsetPrefmax()
     * @see #getPrefmax()
     * @see #setPrefmax(Double)
     * @generated
     */
    boolean isSetPrefmax();

    /**
     * Returns the value of the '<em><b>Kiwppmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum PI integrator term (<i>K</i><i><sub>IWPpmin</sub></i>) (&lt; WindPlantFreqPcontrolIEC.kiwppmax). It is a project-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kiwppmin</em>' attribute.
     * @see #isSetKiwppmin()
     * @see #unsetKiwppmin()
     * @see #setKiwppmin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindPlantFreqPcontrolIEC_Kiwppmin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindPlantFreqPcontrolIEC.kiwppmin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKiwppmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getKiwppmin <em>Kiwppmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kiwppmin</em>' attribute.
     * @see #isSetKiwppmin()
     * @see #unsetKiwppmin()
     * @see #getKiwppmin()
     * @generated
     */
    void setKiwppmin( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getKiwppmin <em>Kiwppmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKiwppmin()
     * @see #getKiwppmin()
     * @see #setKiwppmin(Double)
     * @generated
     */
    void unsetKiwppmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getKiwppmin <em>Kiwppmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kiwppmin</em>' attribute is set.
     * @see #unsetKiwppmin()
     * @see #getKiwppmin()
     * @see #setKiwppmin(Double)
     * @generated
     */
    boolean isSetKiwppmin();

    /**
     * Returns the value of the '<em><b>Kiwppmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum PI integrator term (<i>K</i><i><sub>IWPpmax</sub></i>) (&gt; WindPlantFreqPcontrolIEC.kiwppmin). It is a project-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kiwppmax</em>' attribute.
     * @see #isSetKiwppmax()
     * @see #unsetKiwppmax()
     * @see #setKiwppmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindPlantFreqPcontrolIEC_Kiwppmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindPlantFreqPcontrolIEC.kiwppmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKiwppmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getKiwppmax <em>Kiwppmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kiwppmax</em>' attribute.
     * @see #isSetKiwppmax()
     * @see #unsetKiwppmax()
     * @see #getKiwppmax()
     * @generated
     */
    void setKiwppmax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getKiwppmax <em>Kiwppmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKiwppmax()
     * @see #getKiwppmax()
     * @see #setKiwppmax(Double)
     * @generated
     */
    void unsetKiwppmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getKiwppmax <em>Kiwppmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kiwppmax</em>' attribute is set.
     * @see #unsetKiwppmax()
     * @see #getKiwppmax()
     * @see #setKiwppmax(Double)
     * @generated
     */
    boolean isSetKiwppmax();

    /**
     * Returns the value of the '<em><b>Tpft</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Lead time constant in reference value transfer function (<i>T</i><i><sub>pft</sub></i>) (&gt;= 0). It is a project-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tpft</em>' attribute.
     * @see #isSetTpft()
     * @see #unsetTpft()
     * @see #setTpft(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindPlantFreqPcontrolIEC_Tpft()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='WindPlantFreqPcontrolIEC.tpft' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTpft();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getTpft <em>Tpft</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tpft</em>' attribute.
     * @see #isSetTpft()
     * @see #unsetTpft()
     * @see #getTpft()
     * @generated
     */
    void setTpft( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getTpft <em>Tpft</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTpft()
     * @see #getTpft()
     * @see #setTpft(Double)
     * @generated
     */
    void unsetTpft();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getTpft <em>Tpft</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tpft</em>' attribute is set.
     * @see #unsetTpft()
     * @see #getTpft()
     * @see #setTpft(Double)
     * @generated
     */
    boolean isSetTpft();

    /**
     * Returns the value of the '<em><b>Tpfv</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Lag time constant in reference value transfer function (<i>T</i><i><sub>pfv</sub></i>) (&gt;= 0). It is a project-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tpfv</em>' attribute.
     * @see #isSetTpfv()
     * @see #unsetTpfv()
     * @see #setTpfv(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindPlantFreqPcontrolIEC_Tpfv()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='WindPlantFreqPcontrolIEC.tpfv' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTpfv();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getTpfv <em>Tpfv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tpfv</em>' attribute.
     * @see #isSetTpfv()
     * @see #unsetTpfv()
     * @see #getTpfv()
     * @generated
     */
    void setTpfv( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getTpfv <em>Tpfv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTpfv()
     * @see #getTpfv()
     * @see #setTpfv(Double)
     * @generated
     */
    void unsetTpfv();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getTpfv <em>Tpfv</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tpfv</em>' attribute is set.
     * @see #unsetTpfv()
     * @see #getTpfv()
     * @see #setTpfv(Double)
     * @generated
     */
    boolean isSetTpfv();

    /**
     * Returns the value of the '<em><b>Twppfiltp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Filter time constant for active power measurement (<i>T</i><i><sub>WPpfiltp</sub></i>) (&gt;= 0). It is a project-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Twppfiltp</em>' attribute.
     * @see #isSetTwppfiltp()
     * @see #unsetTwppfiltp()
     * @see #setTwppfiltp(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindPlantFreqPcontrolIEC_Twppfiltp()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='WindPlantFreqPcontrolIEC.twppfiltp' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTwppfiltp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getTwppfiltp <em>Twppfiltp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Twppfiltp</em>' attribute.
     * @see #isSetTwppfiltp()
     * @see #unsetTwppfiltp()
     * @see #getTwppfiltp()
     * @generated
     */
    void setTwppfiltp( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getTwppfiltp <em>Twppfiltp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTwppfiltp()
     * @see #getTwppfiltp()
     * @see #setTwppfiltp(Double)
     * @generated
     */
    void unsetTwppfiltp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getTwppfiltp <em>Twppfiltp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Twppfiltp</em>' attribute is set.
     * @see #unsetTwppfiltp()
     * @see #getTwppfiltp()
     * @see #setTwppfiltp(Double)
     * @generated
     */
    boolean isSetTwppfiltp();

    /**
     * Returns the value of the '<em><b>Dprefmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum (negative) ramp rate of <i>p</i><i><sub>WTref</sub></i> request from the plant controller to the wind turbines (<i>dp</i><i><sub>refmin</sub></i>) (&lt; WindPlantFreqPcontrolIEC.dprefmax). It is a project-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Dprefmin</em>' attribute.
     * @see #isSetDprefmin()
     * @see #unsetDprefmin()
     * @see #setDprefmin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindPlantFreqPcontrolIEC_Dprefmin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindPlantFreqPcontrolIEC.dprefmin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getDprefmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getDprefmin <em>Dprefmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dprefmin</em>' attribute.
     * @see #isSetDprefmin()
     * @see #unsetDprefmin()
     * @see #getDprefmin()
     * @generated
     */
    void setDprefmin( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getDprefmin <em>Dprefmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDprefmin()
     * @see #getDprefmin()
     * @see #setDprefmin(Double)
     * @generated
     */
    void unsetDprefmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getDprefmin <em>Dprefmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dprefmin</em>' attribute is set.
     * @see #unsetDprefmin()
     * @see #getDprefmin()
     * @see #setDprefmin(Double)
     * @generated
     */
    boolean isSetDprefmin();

    /**
     * Returns the value of the '<em><b>Dprefmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum ramp rate of <i>p</i><i><sub>WTref</sub></i> request from the plant controller to the wind turbines (<i>dp</i><i><sub>refmax</sub></i>) (&gt; WindPlantFreqPcontrolIEC.dprefmin). It is a case-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Dprefmax</em>' attribute.
     * @see #isSetDprefmax()
     * @see #unsetDprefmax()
     * @see #setDprefmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindPlantFreqPcontrolIEC_Dprefmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindPlantFreqPcontrolIEC.dprefmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getDprefmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getDprefmax <em>Dprefmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dprefmax</em>' attribute.
     * @see #isSetDprefmax()
     * @see #unsetDprefmax()
     * @see #getDprefmax()
     * @generated
     */
    void setDprefmax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getDprefmax <em>Dprefmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDprefmax()
     * @see #getDprefmax()
     * @see #setDprefmax(Double)
     * @generated
     */
    void unsetDprefmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getDprefmax <em>Dprefmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dprefmax</em>' attribute is set.
     * @see #unsetDprefmax()
     * @see #getDprefmax()
     * @see #setDprefmax(Double)
     * @generated
     */
    boolean isSetDprefmax();

    /**
     * Returns the value of the '<em><b>Dpwprefmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum negative ramp rate for wind plant power reference (<i>dp</i><i><sub>WPrefmin</sub></i>) (&lt; WindPlantFreqPcontrolIEC.dpwprefmax). It is a project-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Dpwprefmin</em>' attribute.
     * @see #isSetDpwprefmin()
     * @see #unsetDpwprefmin()
     * @see #setDpwprefmin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindPlantFreqPcontrolIEC_Dpwprefmin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindPlantFreqPcontrolIEC.dpwprefmin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getDpwprefmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getDpwprefmin <em>Dpwprefmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dpwprefmin</em>' attribute.
     * @see #isSetDpwprefmin()
     * @see #unsetDpwprefmin()
     * @see #getDpwprefmin()
     * @generated
     */
    void setDpwprefmin( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getDpwprefmin <em>Dpwprefmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDpwprefmin()
     * @see #getDpwprefmin()
     * @see #setDpwprefmin(Double)
     * @generated
     */
    void unsetDpwprefmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getDpwprefmin <em>Dpwprefmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dpwprefmin</em>' attribute is set.
     * @see #unsetDpwprefmin()
     * @see #getDpwprefmin()
     * @see #setDpwprefmin(Double)
     * @generated
     */
    boolean isSetDpwprefmin();

    /**
     * Returns the value of the '<em><b>Dpwprefmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum positive ramp rate for wind plant power reference (<i>dp</i><i><sub>WPrefmax</sub></i>) (&gt; WindPlantFreqPcontrolIEC.dpwprefmin). It is a project-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Dpwprefmax</em>' attribute.
     * @see #isSetDpwprefmax()
     * @see #unsetDpwprefmax()
     * @see #setDpwprefmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindPlantFreqPcontrolIEC_Dpwprefmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindPlantFreqPcontrolIEC.dpwprefmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getDpwprefmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getDpwprefmax <em>Dpwprefmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dpwprefmax</em>' attribute.
     * @see #isSetDpwprefmax()
     * @see #unsetDpwprefmax()
     * @see #getDpwprefmax()
     * @generated
     */
    void setDpwprefmax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getDpwprefmax <em>Dpwprefmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDpwprefmax()
     * @see #getDpwprefmax()
     * @see #setDpwprefmax(Double)
     * @generated
     */
    void unsetDpwprefmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getDpwprefmax <em>Dpwprefmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dpwprefmax</em>' attribute is set.
     * @see #unsetDpwprefmax()
     * @see #getDpwprefmax()
     * @see #setDpwprefmax(Double)
     * @generated
     */
    boolean isSetDpwprefmax();

    /**
     * Returns the value of the '<em><b>Wind Plant IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantIEC#getWindPlantFreqPcontrolIEC <em>Wind Plant Freq Pcontrol IEC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Wind plant model with which this wind plant frequency and active power control is associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wind Plant IEC</em>' reference.
     * @see #isSetWindPlantIEC()
     * @see #unsetWindPlantIEC()
     * @see #setWindPlantIEC(WindPlantIEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindPlantFreqPcontrolIEC_WindPlantIEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantIEC#getWindPlantFreqPcontrolIEC
     * @model opposite="WindPlantFreqPcontrolIEC" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='WindPlantFreqPcontrolIEC.WindPlantIEC' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    WindPlantIEC getWindPlantIEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getWindPlantIEC <em>Wind Plant IEC</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getWindPlantIEC <em>Wind Plant IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindPlantIEC()
     * @see #getWindPlantIEC()
     * @see #setWindPlantIEC(WindPlantIEC)
     * @generated
     */
    void unsetWindPlantIEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getWindPlantIEC <em>Wind Plant IEC</em>}' reference is set.
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
     * Returns the value of the '<em><b>Kpwpp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Plant P controller proportional gain (<i>K</i><i><sub>PWPp</sub></i>). It is a project-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kpwpp</em>' attribute.
     * @see #isSetKpwpp()
     * @see #unsetKpwpp()
     * @see #setKpwpp(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindPlantFreqPcontrolIEC_Kpwpp()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='WindPlantFreqPcontrolIEC.kpwpp' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKpwpp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getKpwpp <em>Kpwpp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kpwpp</em>' attribute.
     * @see #isSetKpwpp()
     * @see #unsetKpwpp()
     * @see #getKpwpp()
     * @generated
     */
    void setKpwpp( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getKpwpp <em>Kpwpp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKpwpp()
     * @see #getKpwpp()
     * @see #setKpwpp(Double)
     * @generated
     */
    void unsetKpwpp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getKpwpp <em>Kpwpp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kpwpp</em>' attribute is set.
     * @see #unsetKpwpp()
     * @see #getKpwpp()
     * @see #setKpwpp(Double)
     * @generated
     */
    boolean isSetKpwpp();

} // WindPlantFreqPcontrolIEC

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
 * A representation of the model object '<em><b>Wind Protection IEC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The grid protection model includes protection against over- and under-voltage, and against over- and under-frequency.
 * Reference: IEC 61400-27-1:2015, 5.6.6.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindProtectionIEC#getWindTurbineType3or4IEC <em>Wind Turbine Type3or4 IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindProtectionIEC#getTfma <em>Tfma</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindProtectionIEC#getWindTurbineType1or2IEC <em>Wind Turbine Type1or2 IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindProtectionIEC#getUunder <em>Uunder</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindProtectionIEC#getWindDynamicsLookupTable <em>Wind Dynamics Lookup Table</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindProtectionIEC#getMzc <em>Mzc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindProtectionIEC#getFunder <em>Funder</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindProtectionIEC#getUover <em>Uover</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindProtectionIEC#getFover <em>Fover</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindProtectionIEC#getDfimax <em>Dfimax</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindProtectionIEC()
 * @model
 * @generated
 */
public interface WindProtectionIEC extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Wind Turbine Type3or4 IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType3or4IEC#getWindProtectionIEC <em>Wind Protection IEC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Wind generator type 3 or type 4 model with which this wind turbine protection model is associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wind Turbine Type3or4 IEC</em>' reference.
     * @see #isSetWindTurbineType3or4IEC()
     * @see #unsetWindTurbineType3or4IEC()
     * @see #setWindTurbineType3or4IEC(WindTurbineType3or4IEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindProtectionIEC_WindTurbineType3or4IEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType3or4IEC#getWindProtectionIEC
     * @model opposite="WindProtectionIEC" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='WindProtectionIEC.WindTurbineType3or4IEC' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    WindTurbineType3or4IEC getWindTurbineType3or4IEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindProtectionIEC#getWindTurbineType3or4IEC <em>Wind Turbine Type3or4 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Turbine Type3or4 IEC</em>' reference.
     * @see #isSetWindTurbineType3or4IEC()
     * @see #unsetWindTurbineType3or4IEC()
     * @see #getWindTurbineType3or4IEC()
     * @generated
     */
    void setWindTurbineType3or4IEC( WindTurbineType3or4IEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindProtectionIEC#getWindTurbineType3or4IEC <em>Wind Turbine Type3or4 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindTurbineType3or4IEC()
     * @see #getWindTurbineType3or4IEC()
     * @see #setWindTurbineType3or4IEC(WindTurbineType3or4IEC)
     * @generated
     */
    void unsetWindTurbineType3or4IEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindProtectionIEC#getWindTurbineType3or4IEC <em>Wind Turbine Type3or4 IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Turbine Type3or4 IEC</em>' reference is set.
     * @see #unsetWindTurbineType3or4IEC()
     * @see #getWindTurbineType3or4IEC()
     * @see #setWindTurbineType3or4IEC(WindTurbineType3or4IEC)
     * @generated
     */
    boolean isSetWindTurbineType3or4IEC();

    /**
     * Returns the value of the '<em><b>Tfma</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time interval of moving average window (<i>TfMA</i>) (&gt;= 0).  It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tfma</em>' attribute.
     * @see #isSetTfma()
     * @see #unsetTfma()
     * @see #setTfma(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindProtectionIEC_Tfma()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='WindProtectionIEC.tfma' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTfma();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindProtectionIEC#getTfma <em>Tfma</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tfma</em>' attribute.
     * @see #isSetTfma()
     * @see #unsetTfma()
     * @see #getTfma()
     * @generated
     */
    void setTfma( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindProtectionIEC#getTfma <em>Tfma</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTfma()
     * @see #getTfma()
     * @see #setTfma(Double)
     * @generated
     */
    void unsetTfma();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindProtectionIEC#getTfma <em>Tfma</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tfma</em>' attribute is set.
     * @see #unsetTfma()
     * @see #getTfma()
     * @see #setTfma(Double)
     * @generated
     */
    boolean isSetTfma();

    /**
     * Returns the value of the '<em><b>Wind Turbine Type1or2 IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType1or2IEC#getWindProtectionIEC <em>Wind Protection IEC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Wind generator type 1 or type 2 model with which this wind turbine protection model is associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wind Turbine Type1or2 IEC</em>' reference.
     * @see #isSetWindTurbineType1or2IEC()
     * @see #unsetWindTurbineType1or2IEC()
     * @see #setWindTurbineType1or2IEC(WindTurbineType1or2IEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindProtectionIEC_WindTurbineType1or2IEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType1or2IEC#getWindProtectionIEC
     * @model opposite="WindProtectionIEC" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='WindProtectionIEC.WindTurbineType1or2IEC' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    WindTurbineType1or2IEC getWindTurbineType1or2IEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindProtectionIEC#getWindTurbineType1or2IEC <em>Wind Turbine Type1or2 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Turbine Type1or2 IEC</em>' reference.
     * @see #isSetWindTurbineType1or2IEC()
     * @see #unsetWindTurbineType1or2IEC()
     * @see #getWindTurbineType1or2IEC()
     * @generated
     */
    void setWindTurbineType1or2IEC( WindTurbineType1or2IEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindProtectionIEC#getWindTurbineType1or2IEC <em>Wind Turbine Type1or2 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindTurbineType1or2IEC()
     * @see #getWindTurbineType1or2IEC()
     * @see #setWindTurbineType1or2IEC(WindTurbineType1or2IEC)
     * @generated
     */
    void unsetWindTurbineType1or2IEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindProtectionIEC#getWindTurbineType1or2IEC <em>Wind Turbine Type1or2 IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Turbine Type1or2 IEC</em>' reference is set.
     * @see #unsetWindTurbineType1or2IEC()
     * @see #getWindTurbineType1or2IEC()
     * @see #setWindTurbineType1or2IEC(WindTurbineType1or2IEC)
     * @generated
     */
    boolean isSetWindTurbineType1or2IEC();

    /**
     * Returns the value of the '<em><b>Uunder</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Wind turbine under voltage protection activation threshold (<i>u</i><i><sub>under</sub></i>). It is a project-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Uunder</em>' attribute.
     * @see #isSetUunder()
     * @see #unsetUunder()
     * @see #setUunder(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindProtectionIEC_Uunder()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindProtectionIEC.uunder' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getUunder();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindProtectionIEC#getUunder <em>Uunder</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Uunder</em>' attribute.
     * @see #isSetUunder()
     * @see #unsetUunder()
     * @see #getUunder()
     * @generated
     */
    void setUunder( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindProtectionIEC#getUunder <em>Uunder</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUunder()
     * @see #getUunder()
     * @see #setUunder(Double)
     * @generated
     */
    void unsetUunder();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindProtectionIEC#getUunder <em>Uunder</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Uunder</em>' attribute is set.
     * @see #unsetUunder()
     * @see #getUunder()
     * @see #setUunder(Double)
     * @generated
     */
    boolean isSetUunder();

    /**
     * Returns the value of the '<em><b>Wind Dynamics Lookup Table</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getWindProtectionIEC <em>Wind Protection IEC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The wind dynamics lookup table associated with this grid protection model.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wind Dynamics Lookup Table</em>' reference list.
     * @see #isSetWindDynamicsLookupTable()
     * @see #unsetWindDynamicsLookupTable()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindProtectionIEC_WindDynamicsLookupTable()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getWindProtectionIEC
     * @model opposite="WindProtectionIEC" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='WindProtectionIEC.WindDynamicsLookupTable' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< WindDynamicsLookupTable > getWindDynamicsLookupTable();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindProtectionIEC#getWindDynamicsLookupTable <em>Wind Dynamics Lookup Table</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindDynamicsLookupTable()
     * @see #getWindDynamicsLookupTable()
     * @generated
     */
    void unsetWindDynamicsLookupTable();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindProtectionIEC#getWindDynamicsLookupTable <em>Wind Dynamics Lookup Table</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Dynamics Lookup Table</em>' reference list is set.
     * @see #unsetWindDynamicsLookupTable()
     * @see #getWindDynamicsLookupTable()
     * @generated
     */
    boolean isSetWindDynamicsLookupTable();

    /**
     * Returns the value of the '<em><b>Mzc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Zero crossing measurement mode (<i>Mzc</i>).  It is a type-dependent parameter.
     * true = WT protection system uses zero crossings to detect frequency (1 in the IEC model)
     * false = WT protection system does not use zero crossings to detect frequency (0 in the IEC model).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Mzc</em>' attribute.
     * @see #isSetMzc()
     * @see #unsetMzc()
     * @see #setMzc(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindProtectionIEC_Mzc()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='WindProtectionIEC.mzc' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getMzc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindProtectionIEC#getMzc <em>Mzc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mzc</em>' attribute.
     * @see #isSetMzc()
     * @see #unsetMzc()
     * @see #getMzc()
     * @generated
     */
    void setMzc( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindProtectionIEC#getMzc <em>Mzc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMzc()
     * @see #getMzc()
     * @see #setMzc(Boolean)
     * @generated
     */
    void unsetMzc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindProtectionIEC#getMzc <em>Mzc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Mzc</em>' attribute is set.
     * @see #unsetMzc()
     * @see #getMzc()
     * @see #setMzc(Boolean)
     * @generated
     */
    boolean isSetMzc();

    /**
     * Returns the value of the '<em><b>Funder</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Wind turbine under frequency protection activation threshold (<i>f</i><i><sub>under</sub></i>). It is a project-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Funder</em>' attribute.
     * @see #isSetFunder()
     * @see #unsetFunder()
     * @see #setFunder(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindProtectionIEC_Funder()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindProtectionIEC.funder' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getFunder();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindProtectionIEC#getFunder <em>Funder</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Funder</em>' attribute.
     * @see #isSetFunder()
     * @see #unsetFunder()
     * @see #getFunder()
     * @generated
     */
    void setFunder( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindProtectionIEC#getFunder <em>Funder</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFunder()
     * @see #getFunder()
     * @see #setFunder(Double)
     * @generated
     */
    void unsetFunder();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindProtectionIEC#getFunder <em>Funder</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Funder</em>' attribute is set.
     * @see #unsetFunder()
     * @see #getFunder()
     * @see #setFunder(Double)
     * @generated
     */
    boolean isSetFunder();

    /**
     * Returns the value of the '<em><b>Uover</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Wind turbine over voltage protection activation threshold (<i>u</i><i><sub>over</sub></i>). It is a project-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Uover</em>' attribute.
     * @see #isSetUover()
     * @see #unsetUover()
     * @see #setUover(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindProtectionIEC_Uover()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindProtectionIEC.uover' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getUover();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindProtectionIEC#getUover <em>Uover</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Uover</em>' attribute.
     * @see #isSetUover()
     * @see #unsetUover()
     * @see #getUover()
     * @generated
     */
    void setUover( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindProtectionIEC#getUover <em>Uover</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUover()
     * @see #getUover()
     * @see #setUover(Double)
     * @generated
     */
    void unsetUover();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindProtectionIEC#getUover <em>Uover</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Uover</em>' attribute is set.
     * @see #unsetUover()
     * @see #getUover()
     * @see #setUover(Double)
     * @generated
     */
    boolean isSetUover();

    /**
     * Returns the value of the '<em><b>Fover</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Wind turbine over frequency protection activation threshold (<i>f</i><i><sub>over</sub></i>). It is a project-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Fover</em>' attribute.
     * @see #isSetFover()
     * @see #unsetFover()
     * @see #setFover(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindProtectionIEC_Fover()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindProtectionIEC.fover' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getFover();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindProtectionIEC#getFover <em>Fover</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fover</em>' attribute.
     * @see #isSetFover()
     * @see #unsetFover()
     * @see #getFover()
     * @generated
     */
    void setFover( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindProtectionIEC#getFover <em>Fover</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFover()
     * @see #getFover()
     * @see #setFover(Double)
     * @generated
     */
    void unsetFover();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindProtectionIEC#getFover <em>Fover</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Fover</em>' attribute is set.
     * @see #unsetFover()
     * @see #getFover()
     * @see #setFover(Double)
     * @generated
     */
    boolean isSetFover();

    /**
     * Returns the value of the '<em><b>Dfimax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum rate of change of frequency (<i>dF</i><i><sub>max</sub></i>). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Dfimax</em>' attribute.
     * @see #isSetDfimax()
     * @see #unsetDfimax()
     * @see #setDfimax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindProtectionIEC_Dfimax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindProtectionIEC.dfimax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getDfimax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindProtectionIEC#getDfimax <em>Dfimax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dfimax</em>' attribute.
     * @see #isSetDfimax()
     * @see #unsetDfimax()
     * @see #getDfimax()
     * @generated
     */
    void setDfimax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindProtectionIEC#getDfimax <em>Dfimax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDfimax()
     * @see #getDfimax()
     * @see #setDfimax(Double)
     * @generated
     */
    void unsetDfimax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindProtectionIEC#getDfimax <em>Dfimax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dfimax</em>' attribute is set.
     * @see #unsetDfimax()
     * @see #getDfimax()
     * @see #setDfimax(Double)
     * @generated
     */
    boolean isSetDfimax();

} // WindProtectionIEC

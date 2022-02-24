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
 * A representation of the model object '<em><b>Wind Cont Curr Lim IEC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Current limitation model.  The current limitation model combines the physical limits and the control limits.
 * Reference: IEC 61400-27-1:2015, 5.6.5.8.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContCurrLimIEC#getUpqumax <em>Upqumax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContCurrLimIEC#getKpqu <em>Kpqu</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContCurrLimIEC#getWindDynamicsLookupTable <em>Wind Dynamics Lookup Table</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContCurrLimIEC#getMqpri <em>Mqpri</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContCurrLimIEC#getWindTurbineType3or4IEC <em>Wind Turbine Type3or4 IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContCurrLimIEC#getImax <em>Imax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContCurrLimIEC#getTufiltcl <em>Tufiltcl</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContCurrLimIEC#getMdfslim <em>Mdfslim</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContCurrLimIEC#getImaxdip <em>Imaxdip</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContCurrLimIEC()
 * @model
 * @generated
 */
public interface WindContCurrLimIEC extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Upqumax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Wind turbine voltage in the operation point where zero reactive current can be delivered (<i>u</i><i><sub>pqumax</sub></i>). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Upqumax</em>' attribute.
     * @see #isSetUpqumax()
     * @see #unsetUpqumax()
     * @see #setUpqumax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContCurrLimIEC_Upqumax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindContCurrLimIEC.upqumax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getUpqumax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContCurrLimIEC#getUpqumax <em>Upqumax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Upqumax</em>' attribute.
     * @see #isSetUpqumax()
     * @see #unsetUpqumax()
     * @see #getUpqumax()
     * @generated
     */
    void setUpqumax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContCurrLimIEC#getUpqumax <em>Upqumax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUpqumax()
     * @see #getUpqumax()
     * @see #setUpqumax(Double)
     * @generated
     */
    void unsetUpqumax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContCurrLimIEC#getUpqumax <em>Upqumax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Upqumax</em>' attribute is set.
     * @see #unsetUpqumax()
     * @see #getUpqumax()
     * @see #setUpqumax(Double)
     * @generated
     */
    boolean isSetUpqumax();

    /**
     * Returns the value of the '<em><b>Kpqu</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Partial derivative of reactive current limit (<i>K</i><i><sub>pqu</sub></i>) versus voltage. It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kpqu</em>' attribute.
     * @see #isSetKpqu()
     * @see #unsetKpqu()
     * @see #setKpqu(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContCurrLimIEC_Kpqu()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindContCurrLimIEC.kpqu' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKpqu();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContCurrLimIEC#getKpqu <em>Kpqu</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kpqu</em>' attribute.
     * @see #isSetKpqu()
     * @see #unsetKpqu()
     * @see #getKpqu()
     * @generated
     */
    void setKpqu( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContCurrLimIEC#getKpqu <em>Kpqu</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKpqu()
     * @see #getKpqu()
     * @see #setKpqu(Double)
     * @generated
     */
    void unsetKpqu();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContCurrLimIEC#getKpqu <em>Kpqu</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kpqu</em>' attribute is set.
     * @see #unsetKpqu()
     * @see #getKpqu()
     * @see #setKpqu(Double)
     * @generated
     */
    boolean isSetKpqu();

    /**
     * Returns the value of the '<em><b>Wind Dynamics Lookup Table</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getWindContCurrLimIEC <em>Wind Cont Curr Lim IEC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The wind dynamics lookup table associated with this current control limitation model.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wind Dynamics Lookup Table</em>' reference list.
     * @see #isSetWindDynamicsLookupTable()
     * @see #unsetWindDynamicsLookupTable()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContCurrLimIEC_WindDynamicsLookupTable()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getWindContCurrLimIEC
     * @model opposite="WindContCurrLimIEC" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='WindContCurrLimIEC.WindDynamicsLookupTable' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< WindDynamicsLookupTable > getWindDynamicsLookupTable();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContCurrLimIEC#getWindDynamicsLookupTable <em>Wind Dynamics Lookup Table</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindDynamicsLookupTable()
     * @see #getWindDynamicsLookupTable()
     * @generated
     */
    void unsetWindDynamicsLookupTable();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContCurrLimIEC#getWindDynamicsLookupTable <em>Wind Dynamics Lookup Table</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Dynamics Lookup Table</em>' reference list is set.
     * @see #unsetWindDynamicsLookupTable()
     * @see #getWindDynamicsLookupTable()
     * @generated
     */
    boolean isSetWindDynamicsLookupTable();

    /**
     * Returns the value of the '<em><b>Mqpri</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Prioritisation of Q control during UVRT (<i>M</i><i><sub>qpri</sub></i>). It is a project-dependent parameter.
     * true = reactive power priority (1 in the IEC model)
     * false = active power priority (0 in the IEC model).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Mqpri</em>' attribute.
     * @see #isSetMqpri()
     * @see #unsetMqpri()
     * @see #setMqpri(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContCurrLimIEC_Mqpri()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='WindContCurrLimIEC.mqpri' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getMqpri();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContCurrLimIEC#getMqpri <em>Mqpri</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mqpri</em>' attribute.
     * @see #isSetMqpri()
     * @see #unsetMqpri()
     * @see #getMqpri()
     * @generated
     */
    void setMqpri( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContCurrLimIEC#getMqpri <em>Mqpri</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMqpri()
     * @see #getMqpri()
     * @see #setMqpri(Boolean)
     * @generated
     */
    void unsetMqpri();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContCurrLimIEC#getMqpri <em>Mqpri</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Mqpri</em>' attribute is set.
     * @see #unsetMqpri()
     * @see #getMqpri()
     * @see #setMqpri(Boolean)
     * @generated
     */
    boolean isSetMqpri();

    /**
     * Returns the value of the '<em><b>Wind Turbine Type3or4 IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType3or4IEC#getWindContCurrLimIEC <em>Wind Cont Curr Lim IEC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Wind turbine type 3 or type 4 model with which this wind control current limitation model is associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wind Turbine Type3or4 IEC</em>' reference.
     * @see #isSetWindTurbineType3or4IEC()
     * @see #unsetWindTurbineType3or4IEC()
     * @see #setWindTurbineType3or4IEC(WindTurbineType3or4IEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContCurrLimIEC_WindTurbineType3or4IEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType3or4IEC#getWindContCurrLimIEC
     * @model opposite="WindContCurrLimIEC" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='WindContCurrLimIEC.WindTurbineType3or4IEC' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    WindTurbineType3or4IEC getWindTurbineType3or4IEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContCurrLimIEC#getWindTurbineType3or4IEC <em>Wind Turbine Type3or4 IEC</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContCurrLimIEC#getWindTurbineType3or4IEC <em>Wind Turbine Type3or4 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindTurbineType3or4IEC()
     * @see #getWindTurbineType3or4IEC()
     * @see #setWindTurbineType3or4IEC(WindTurbineType3or4IEC)
     * @generated
     */
    void unsetWindTurbineType3or4IEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContCurrLimIEC#getWindTurbineType3or4IEC <em>Wind Turbine Type3or4 IEC</em>}' reference is set.
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
     * Returns the value of the '<em><b>Imax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum continuous current at the wind turbine terminals (<i>i</i><i><sub>max</sub></i>). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Imax</em>' attribute.
     * @see #isSetImax()
     * @see #unsetImax()
     * @see #setImax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContCurrLimIEC_Imax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindContCurrLimIEC.imax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getImax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContCurrLimIEC#getImax <em>Imax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Imax</em>' attribute.
     * @see #isSetImax()
     * @see #unsetImax()
     * @see #getImax()
     * @generated
     */
    void setImax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContCurrLimIEC#getImax <em>Imax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetImax()
     * @see #getImax()
     * @see #setImax(Double)
     * @generated
     */
    void unsetImax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContCurrLimIEC#getImax <em>Imax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Imax</em>' attribute is set.
     * @see #unsetImax()
     * @see #getImax()
     * @see #setImax(Double)
     * @generated
     */
    boolean isSetImax();

    /**
     * Returns the value of the '<em><b>Tufiltcl</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Voltage measurement filter time constant (<i>T</i><i><sub>ufiltcl</sub></i>) (&gt;= 0). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tufiltcl</em>' attribute.
     * @see #isSetTufiltcl()
     * @see #unsetTufiltcl()
     * @see #setTufiltcl(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContCurrLimIEC_Tufiltcl()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='WindContCurrLimIEC.tufiltcl' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTufiltcl();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContCurrLimIEC#getTufiltcl <em>Tufiltcl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tufiltcl</em>' attribute.
     * @see #isSetTufiltcl()
     * @see #unsetTufiltcl()
     * @see #getTufiltcl()
     * @generated
     */
    void setTufiltcl( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContCurrLimIEC#getTufiltcl <em>Tufiltcl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTufiltcl()
     * @see #getTufiltcl()
     * @see #setTufiltcl(Double)
     * @generated
     */
    void unsetTufiltcl();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContCurrLimIEC#getTufiltcl <em>Tufiltcl</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tufiltcl</em>' attribute is set.
     * @see #unsetTufiltcl()
     * @see #getTufiltcl()
     * @see #setTufiltcl(Double)
     * @generated
     */
    boolean isSetTufiltcl();

    /**
     * Returns the value of the '<em><b>Mdfslim</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Limitation of type 3 stator current (<i>M</i><i><sub>DFSLim</sub></i>). <i>M</i><i><sub>DFSLim</sub></i><sub> </sub>= 1 for wind turbines type 4. It is a type-dependent parameter.
     * false= total current limitation (0 in the IEC model)
     * true=stator current limitation (1 in the IEC model).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Mdfslim</em>' attribute.
     * @see #isSetMdfslim()
     * @see #unsetMdfslim()
     * @see #setMdfslim(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContCurrLimIEC_Mdfslim()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='WindContCurrLimIEC.mdfslim' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getMdfslim();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContCurrLimIEC#getMdfslim <em>Mdfslim</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mdfslim</em>' attribute.
     * @see #isSetMdfslim()
     * @see #unsetMdfslim()
     * @see #getMdfslim()
     * @generated
     */
    void setMdfslim( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContCurrLimIEC#getMdfslim <em>Mdfslim</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMdfslim()
     * @see #getMdfslim()
     * @see #setMdfslim(Boolean)
     * @generated
     */
    void unsetMdfslim();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContCurrLimIEC#getMdfslim <em>Mdfslim</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Mdfslim</em>' attribute is set.
     * @see #unsetMdfslim()
     * @see #getMdfslim()
     * @see #setMdfslim(Boolean)
     * @generated
     */
    boolean isSetMdfslim();

    /**
     * Returns the value of the '<em><b>Imaxdip</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum current during voltage dip at the wind turbine terminals (<i>i</i><i><sub>maxdip</sub></i>). It is a project-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Imaxdip</em>' attribute.
     * @see #isSetImaxdip()
     * @see #unsetImaxdip()
     * @see #setImaxdip(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContCurrLimIEC_Imaxdip()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindContCurrLimIEC.imaxdip' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getImaxdip();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContCurrLimIEC#getImaxdip <em>Imaxdip</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Imaxdip</em>' attribute.
     * @see #isSetImaxdip()
     * @see #unsetImaxdip()
     * @see #getImaxdip()
     * @generated
     */
    void setImaxdip( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContCurrLimIEC#getImaxdip <em>Imaxdip</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetImaxdip()
     * @see #getImaxdip()
     * @see #setImaxdip(Double)
     * @generated
     */
    void unsetImaxdip();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContCurrLimIEC#getImaxdip <em>Imaxdip</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Imaxdip</em>' attribute is set.
     * @see #unsetImaxdip()
     * @see #getImaxdip()
     * @see #setImaxdip(Double)
     * @generated
     */
    boolean isSetImaxdip();

} // WindContCurrLimIEC

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
 * A representation of the model object '<em><b>Wind Cont PType3 IEC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * P control model type 3.
 * Reference: IEC 61400-27-1:2015, 5.6.5.4.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getTpord <em>Tpord</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getDpmax <em>Dpmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getTomegafiltp3 <em>Tomegafiltp3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getUdvs <em>Udvs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getOmegaoffset <em>Omegaoffset</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getDprefmax <em>Dprefmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getDprefmin <em>Dprefmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getPdtdmax <em>Pdtdmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getThetaemin <em>Thetaemin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getMpuvrt <em>Mpuvrt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getWindTurbineType3IEC <em>Wind Turbine Type3 IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getTomegaref <em>Tomegaref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getDthetamaxuvrt <em>Dthetamaxuvrt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getDthetamax <em>Dthetamax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getKdtd <em>Kdtd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getTufiltp3 <em>Tufiltp3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getKpp <em>Kpp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getTpfiltp3 <em>Tpfiltp3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getTdvs <em>Tdvs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getUpdip <em>Updip</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getWindDynamicsLookupTable <em>Wind Dynamics Lookup Table</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getKip <em>Kip</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getThetauscale <em>Thetauscale</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getOmegadtd <em>Omegadtd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getZeta <em>Zeta</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContPType3IEC()
 * @model
 * @generated
 */
public interface WindContPType3IEC extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Tpord</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time constant in power order lag (<i>T</i><sub>pord</sub>). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tpord</em>' attribute.
     * @see #isSetTpord()
     * @see #unsetTpord()
     * @see #setTpord(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContPType3IEC_Tpord()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindContPType3IEC.tpord' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTpord();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getTpord <em>Tpord</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tpord</em>' attribute.
     * @see #isSetTpord()
     * @see #unsetTpord()
     * @see #getTpord()
     * @generated
     */
    void setTpord( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getTpord <em>Tpord</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTpord()
     * @see #getTpord()
     * @see #setTpord(Double)
     * @generated
     */
    void unsetTpord();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getTpord <em>Tpord</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tpord</em>' attribute is set.
     * @see #unsetTpord()
     * @see #getTpord()
     * @see #setTpord(Double)
     * @generated
     */
    boolean isSetTpord();

    /**
     * Returns the value of the '<em><b>Dpmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum wind turbine power ramp rate (<i>dp</i><i><sub>max</sub></i>). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Dpmax</em>' attribute.
     * @see #isSetDpmax()
     * @see #unsetDpmax()
     * @see #setDpmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContPType3IEC_Dpmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindContPType3IEC.dpmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getDpmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getDpmax <em>Dpmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dpmax</em>' attribute.
     * @see #isSetDpmax()
     * @see #unsetDpmax()
     * @see #getDpmax()
     * @generated
     */
    void setDpmax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getDpmax <em>Dpmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDpmax()
     * @see #getDpmax()
     * @see #setDpmax(Double)
     * @generated
     */
    void unsetDpmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getDpmax <em>Dpmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dpmax</em>' attribute is set.
     * @see #unsetDpmax()
     * @see #getDpmax()
     * @see #setDpmax(Double)
     * @generated
     */
    boolean isSetDpmax();

    /**
     * Returns the value of the '<em><b>Tomegafiltp3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Filter time constant for generator speed measurement (<i>T</i><sub>omegafiltp3</sub>) (&gt;= 0). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tomegafiltp3</em>' attribute.
     * @see #isSetTomegafiltp3()
     * @see #unsetTomegafiltp3()
     * @see #setTomegafiltp3(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContPType3IEC_Tomegafiltp3()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='WindContPType3IEC.tomegafiltp3' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTomegafiltp3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getTomegafiltp3 <em>Tomegafiltp3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tomegafiltp3</em>' attribute.
     * @see #isSetTomegafiltp3()
     * @see #unsetTomegafiltp3()
     * @see #getTomegafiltp3()
     * @generated
     */
    void setTomegafiltp3( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getTomegafiltp3 <em>Tomegafiltp3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTomegafiltp3()
     * @see #getTomegafiltp3()
     * @see #setTomegafiltp3(Double)
     * @generated
     */
    void unsetTomegafiltp3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getTomegafiltp3 <em>Tomegafiltp3</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tomegafiltp3</em>' attribute is set.
     * @see #unsetTomegafiltp3()
     * @see #getTomegafiltp3()
     * @see #setTomegafiltp3(Double)
     * @generated
     */
    boolean isSetTomegafiltp3();

    /**
     * Returns the value of the '<em><b>Udvs</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Voltage limit for hold UVRT status after deep voltage sags (<i>u</i><i><sub>DVS</sub></i>). It is a project-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Udvs</em>' attribute.
     * @see #isSetUdvs()
     * @see #unsetUdvs()
     * @see #setUdvs(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContPType3IEC_Udvs()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindContPType3IEC.udvs' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getUdvs();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getUdvs <em>Udvs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Udvs</em>' attribute.
     * @see #isSetUdvs()
     * @see #unsetUdvs()
     * @see #getUdvs()
     * @generated
     */
    void setUdvs( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getUdvs <em>Udvs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUdvs()
     * @see #getUdvs()
     * @see #setUdvs(Double)
     * @generated
     */
    void unsetUdvs();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getUdvs <em>Udvs</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Udvs</em>' attribute is set.
     * @see #unsetUdvs()
     * @see #getUdvs()
     * @see #setUdvs(Double)
     * @generated
     */
    boolean isSetUdvs();

    /**
     * Returns the value of the '<em><b>Omegaoffset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Offset to reference value that limits controller action during rotor speed changes (<i>omega</i><i><sub>offset</sub></i>). It is a case-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Omegaoffset</em>' attribute.
     * @see #isSetOmegaoffset()
     * @see #unsetOmegaoffset()
     * @see #setOmegaoffset(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContPType3IEC_Omegaoffset()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindContPType3IEC.omegaoffset' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getOmegaoffset();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getOmegaoffset <em>Omegaoffset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Omegaoffset</em>' attribute.
     * @see #isSetOmegaoffset()
     * @see #unsetOmegaoffset()
     * @see #getOmegaoffset()
     * @generated
     */
    void setOmegaoffset( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getOmegaoffset <em>Omegaoffset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOmegaoffset()
     * @see #getOmegaoffset()
     * @see #setOmegaoffset(Double)
     * @generated
     */
    void unsetOmegaoffset();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getOmegaoffset <em>Omegaoffset</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Omegaoffset</em>' attribute is set.
     * @see #unsetOmegaoffset()
     * @see #getOmegaoffset()
     * @see #setOmegaoffset(Double)
     * @generated
     */
    boolean isSetOmegaoffset();

    /**
     * Returns the value of the '<em><b>Dprefmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum ramp rate of wind turbine reference power (<i>dp</i><i><sub>refmax</sub></i>). It is a project-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Dprefmax</em>' attribute.
     * @see #isSetDprefmax()
     * @see #unsetDprefmax()
     * @see #setDprefmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContPType3IEC_Dprefmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindContPType3IEC.dprefmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getDprefmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getDprefmax <em>Dprefmax</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getDprefmax <em>Dprefmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDprefmax()
     * @see #getDprefmax()
     * @see #setDprefmax(Double)
     * @generated
     */
    void unsetDprefmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getDprefmax <em>Dprefmax</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Dprefmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum ramp rate of wind turbine reference power (<i>dp</i><i><sub>refmin</sub></i>). It is a project-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Dprefmin</em>' attribute.
     * @see #isSetDprefmin()
     * @see #unsetDprefmin()
     * @see #setDprefmin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContPType3IEC_Dprefmin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindContPType3IEC.dprefmin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getDprefmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getDprefmin <em>Dprefmin</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getDprefmin <em>Dprefmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDprefmin()
     * @see #getDprefmin()
     * @see #setDprefmin(Double)
     * @generated
     */
    void unsetDprefmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getDprefmin <em>Dprefmin</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Pdtdmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum active drive train damping power (<i>p</i><sub>DTDmax</sub>). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pdtdmax</em>' attribute.
     * @see #isSetPdtdmax()
     * @see #unsetPdtdmax()
     * @see #setPdtdmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContPType3IEC_Pdtdmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindContPType3IEC.pdtdmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPdtdmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getPdtdmax <em>Pdtdmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pdtdmax</em>' attribute.
     * @see #isSetPdtdmax()
     * @see #unsetPdtdmax()
     * @see #getPdtdmax()
     * @generated
     */
    void setPdtdmax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getPdtdmax <em>Pdtdmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPdtdmax()
     * @see #getPdtdmax()
     * @see #setPdtdmax(Double)
     * @generated
     */
    void unsetPdtdmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getPdtdmax <em>Pdtdmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pdtdmax</em>' attribute is set.
     * @see #unsetPdtdmax()
     * @see #getPdtdmax()
     * @see #setPdtdmax(Double)
     * @generated
     */
    boolean isSetPdtdmax();

    /**
     * Returns the value of the '<em><b>Thetaemin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum electrical generator torque (<i>t</i><sub>emin</sub>). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Thetaemin</em>' attribute.
     * @see #isSetThetaemin()
     * @see #unsetThetaemin()
     * @see #setThetaemin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContPType3IEC_Thetaemin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindContPType3IEC.thetaemin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getThetaemin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getThetaemin <em>Thetaemin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Thetaemin</em>' attribute.
     * @see #isSetThetaemin()
     * @see #unsetThetaemin()
     * @see #getThetaemin()
     * @generated
     */
    void setThetaemin( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getThetaemin <em>Thetaemin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetThetaemin()
     * @see #getThetaemin()
     * @see #setThetaemin(Double)
     * @generated
     */
    void unsetThetaemin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getThetaemin <em>Thetaemin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Thetaemin</em>' attribute is set.
     * @see #unsetThetaemin()
     * @see #getThetaemin()
     * @see #setThetaemin(Double)
     * @generated
     */
    boolean isSetThetaemin();

    /**
     * Returns the value of the '<em><b>Mpuvrt</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Enable UVRT power control mode (<i>M</i><i><sub>pUVRT</sub></i><sub>)</sub>.  It is a project-dependent parameter.
     * true = voltage control (1 in the IEC model)
     * false = reactive power control (0 in the IEC model).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Mpuvrt</em>' attribute.
     * @see #isSetMpuvrt()
     * @see #unsetMpuvrt()
     * @see #setMpuvrt(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContPType3IEC_Mpuvrt()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='WindContPType3IEC.mpuvrt' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getMpuvrt();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getMpuvrt <em>Mpuvrt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mpuvrt</em>' attribute.
     * @see #isSetMpuvrt()
     * @see #unsetMpuvrt()
     * @see #getMpuvrt()
     * @generated
     */
    void setMpuvrt( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getMpuvrt <em>Mpuvrt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMpuvrt()
     * @see #getMpuvrt()
     * @see #setMpuvrt(Boolean)
     * @generated
     */
    void unsetMpuvrt();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getMpuvrt <em>Mpuvrt</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Mpuvrt</em>' attribute is set.
     * @see #unsetMpuvrt()
     * @see #getMpuvrt()
     * @see #setMpuvrt(Boolean)
     * @generated
     */
    boolean isSetMpuvrt();

    /**
     * Returns the value of the '<em><b>Wind Turbine Type3 IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType3IEC#getWindContPType3IEC <em>Wind Cont PType3 IEC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Wind turbine type 3 model with which this wind control P type 3 model is associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wind Turbine Type3 IEC</em>' reference.
     * @see #isSetWindTurbineType3IEC()
     * @see #unsetWindTurbineType3IEC()
     * @see #setWindTurbineType3IEC(WindTurbineType3IEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContPType3IEC_WindTurbineType3IEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindTurbineType3IEC#getWindContPType3IEC
     * @model opposite="WindContPType3IEC" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='WindContPType3IEC.WindTurbineType3IEC' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    WindTurbineType3IEC getWindTurbineType3IEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getWindTurbineType3IEC <em>Wind Turbine Type3 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Turbine Type3 IEC</em>' reference.
     * @see #isSetWindTurbineType3IEC()
     * @see #unsetWindTurbineType3IEC()
     * @see #getWindTurbineType3IEC()
     * @generated
     */
    void setWindTurbineType3IEC( WindTurbineType3IEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getWindTurbineType3IEC <em>Wind Turbine Type3 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindTurbineType3IEC()
     * @see #getWindTurbineType3IEC()
     * @see #setWindTurbineType3IEC(WindTurbineType3IEC)
     * @generated
     */
    void unsetWindTurbineType3IEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getWindTurbineType3IEC <em>Wind Turbine Type3 IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Turbine Type3 IEC</em>' reference is set.
     * @see #unsetWindTurbineType3IEC()
     * @see #getWindTurbineType3IEC()
     * @see #setWindTurbineType3IEC(WindTurbineType3IEC)
     * @generated
     */
    boolean isSetWindTurbineType3IEC();

    /**
     * Returns the value of the '<em><b>Tomegaref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time constant in speed reference filter (<i>T</i><sub>omega,ref</sub>) (&gt;= 0). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tomegaref</em>' attribute.
     * @see #isSetTomegaref()
     * @see #unsetTomegaref()
     * @see #setTomegaref(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContPType3IEC_Tomegaref()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='WindContPType3IEC.tomegaref' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTomegaref();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getTomegaref <em>Tomegaref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tomegaref</em>' attribute.
     * @see #isSetTomegaref()
     * @see #unsetTomegaref()
     * @see #getTomegaref()
     * @generated
     */
    void setTomegaref( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getTomegaref <em>Tomegaref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTomegaref()
     * @see #getTomegaref()
     * @see #setTomegaref(Double)
     * @generated
     */
    void unsetTomegaref();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getTomegaref <em>Tomegaref</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tomegaref</em>' attribute is set.
     * @see #unsetTomegaref()
     * @see #getTomegaref()
     * @see #setTomegaref(Double)
     * @generated
     */
    boolean isSetTomegaref();

    /**
     * Returns the value of the '<em><b>Dthetamaxuvrt</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Limitation of torque rise rate during UVRT (<i>dtheta</i><i><sub>maxUVRT</sub></i>). It is a project-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Dthetamaxuvrt</em>' attribute.
     * @see #isSetDthetamaxuvrt()
     * @see #unsetDthetamaxuvrt()
     * @see #setDthetamaxuvrt(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContPType3IEC_Dthetamaxuvrt()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindContPType3IEC.dthetamaxuvrt' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getDthetamaxuvrt();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getDthetamaxuvrt <em>Dthetamaxuvrt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dthetamaxuvrt</em>' attribute.
     * @see #isSetDthetamaxuvrt()
     * @see #unsetDthetamaxuvrt()
     * @see #getDthetamaxuvrt()
     * @generated
     */
    void setDthetamaxuvrt( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getDthetamaxuvrt <em>Dthetamaxuvrt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDthetamaxuvrt()
     * @see #getDthetamaxuvrt()
     * @see #setDthetamaxuvrt(Double)
     * @generated
     */
    void unsetDthetamaxuvrt();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getDthetamaxuvrt <em>Dthetamaxuvrt</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dthetamaxuvrt</em>' attribute is set.
     * @see #unsetDthetamaxuvrt()
     * @see #getDthetamaxuvrt()
     * @see #setDthetamaxuvrt(Double)
     * @generated
     */
    boolean isSetDthetamaxuvrt();

    /**
     * Returns the value of the '<em><b>Dthetamax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Ramp limitation of torque, required in some grid codes (<i>dt</i><i><sub>max</sub></i>). It is a project-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Dthetamax</em>' attribute.
     * @see #isSetDthetamax()
     * @see #unsetDthetamax()
     * @see #setDthetamax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContPType3IEC_Dthetamax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindContPType3IEC.dthetamax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getDthetamax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getDthetamax <em>Dthetamax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dthetamax</em>' attribute.
     * @see #isSetDthetamax()
     * @see #unsetDthetamax()
     * @see #getDthetamax()
     * @generated
     */
    void setDthetamax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getDthetamax <em>Dthetamax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDthetamax()
     * @see #getDthetamax()
     * @see #setDthetamax(Double)
     * @generated
     */
    void unsetDthetamax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getDthetamax <em>Dthetamax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dthetamax</em>' attribute is set.
     * @see #unsetDthetamax()
     * @see #getDthetamax()
     * @see #setDthetamax(Double)
     * @generated
     */
    boolean isSetDthetamax();

    /**
     * Returns the value of the '<em><b>Kdtd</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Gain for active drive train damping (<i>K</i><i><sub>DTD</sub></i>). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kdtd</em>' attribute.
     * @see #isSetKdtd()
     * @see #unsetKdtd()
     * @see #setKdtd(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContPType3IEC_Kdtd()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindContPType3IEC.kdtd' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKdtd();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getKdtd <em>Kdtd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kdtd</em>' attribute.
     * @see #isSetKdtd()
     * @see #unsetKdtd()
     * @see #getKdtd()
     * @generated
     */
    void setKdtd( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getKdtd <em>Kdtd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKdtd()
     * @see #getKdtd()
     * @see #setKdtd(Double)
     * @generated
     */
    void unsetKdtd();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getKdtd <em>Kdtd</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kdtd</em>' attribute is set.
     * @see #unsetKdtd()
     * @see #getKdtd()
     * @see #setKdtd(Double)
     * @generated
     */
    boolean isSetKdtd();

    /**
     * Returns the value of the '<em><b>Tufiltp3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Filter time constant for voltage measurement (<i>T</i><sub>ufiltp3</sub>) (&gt;= 0). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tufiltp3</em>' attribute.
     * @see #isSetTufiltp3()
     * @see #unsetTufiltp3()
     * @see #setTufiltp3(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContPType3IEC_Tufiltp3()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='WindContPType3IEC.tufiltp3' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTufiltp3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getTufiltp3 <em>Tufiltp3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tufiltp3</em>' attribute.
     * @see #isSetTufiltp3()
     * @see #unsetTufiltp3()
     * @see #getTufiltp3()
     * @generated
     */
    void setTufiltp3( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getTufiltp3 <em>Tufiltp3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTufiltp3()
     * @see #getTufiltp3()
     * @see #setTufiltp3(Double)
     * @generated
     */
    void unsetTufiltp3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getTufiltp3 <em>Tufiltp3</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tufiltp3</em>' attribute is set.
     * @see #unsetTufiltp3()
     * @see #getTufiltp3()
     * @see #setTufiltp3(Double)
     * @generated
     */
    boolean isSetTufiltp3();

    /**
     * Returns the value of the '<em><b>Kpp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * PI controller proportional gain (<i>K</i><sub>Pp</sub>). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kpp</em>' attribute.
     * @see #isSetKpp()
     * @see #unsetKpp()
     * @see #setKpp(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContPType3IEC_Kpp()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindContPType3IEC.kpp' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKpp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getKpp <em>Kpp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kpp</em>' attribute.
     * @see #isSetKpp()
     * @see #unsetKpp()
     * @see #getKpp()
     * @generated
     */
    void setKpp( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getKpp <em>Kpp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKpp()
     * @see #getKpp()
     * @see #setKpp(Double)
     * @generated
     */
    void unsetKpp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getKpp <em>Kpp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kpp</em>' attribute is set.
     * @see #unsetKpp()
     * @see #getKpp()
     * @see #setKpp(Double)
     * @generated
     */
    boolean isSetKpp();

    /**
     * Returns the value of the '<em><b>Tpfiltp3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Filter time constant for power measurement (<i>T</i><sub>pfiltp3</sub>) (&gt;= 0). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tpfiltp3</em>' attribute.
     * @see #isSetTpfiltp3()
     * @see #unsetTpfiltp3()
     * @see #setTpfiltp3(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContPType3IEC_Tpfiltp3()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='WindContPType3IEC.tpfiltp3' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTpfiltp3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getTpfiltp3 <em>Tpfiltp3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tpfiltp3</em>' attribute.
     * @see #isSetTpfiltp3()
     * @see #unsetTpfiltp3()
     * @see #getTpfiltp3()
     * @generated
     */
    void setTpfiltp3( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getTpfiltp3 <em>Tpfiltp3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTpfiltp3()
     * @see #getTpfiltp3()
     * @see #setTpfiltp3(Double)
     * @generated
     */
    void unsetTpfiltp3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getTpfiltp3 <em>Tpfiltp3</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tpfiltp3</em>' attribute is set.
     * @see #unsetTpfiltp3()
     * @see #getTpfiltp3()
     * @see #setTpfiltp3(Double)
     * @generated
     */
    boolean isSetTpfiltp3();

    /**
     * Returns the value of the '<em><b>Tdvs</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time<sub> </sub>delay after deep voltage sags (<i>T</i><i><sub>DVS</sub></i>) (&gt;= 0). It is a project-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tdvs</em>' attribute.
     * @see #isSetTdvs()
     * @see #unsetTdvs()
     * @see #setTdvs(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContPType3IEC_Tdvs()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='WindContPType3IEC.tdvs' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTdvs();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getTdvs <em>Tdvs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tdvs</em>' attribute.
     * @see #isSetTdvs()
     * @see #unsetTdvs()
     * @see #getTdvs()
     * @generated
     */
    void setTdvs( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getTdvs <em>Tdvs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTdvs()
     * @see #getTdvs()
     * @see #setTdvs(Double)
     * @generated
     */
    void unsetTdvs();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getTdvs <em>Tdvs</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tdvs</em>' attribute is set.
     * @see #unsetTdvs()
     * @see #getTdvs()
     * @see #setTdvs(Double)
     * @generated
     */
    boolean isSetTdvs();

    /**
     * Returns the value of the '<em><b>Updip</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Voltage dip threshold for P-control (<i>u</i><sub>Pdip</sub>).  Part of turbine control, often different (e.g 0.8) from converter thresholds. It is a project-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Updip</em>' attribute.
     * @see #isSetUpdip()
     * @see #unsetUpdip()
     * @see #setUpdip(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContPType3IEC_Updip()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindContPType3IEC.updip' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getUpdip();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getUpdip <em>Updip</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Updip</em>' attribute.
     * @see #isSetUpdip()
     * @see #unsetUpdip()
     * @see #getUpdip()
     * @generated
     */
    void setUpdip( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getUpdip <em>Updip</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUpdip()
     * @see #getUpdip()
     * @see #setUpdip(Double)
     * @generated
     */
    void unsetUpdip();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getUpdip <em>Updip</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Updip</em>' attribute is set.
     * @see #unsetUpdip()
     * @see #getUpdip()
     * @see #setUpdip(Double)
     * @generated
     */
    boolean isSetUpdip();

    /**
     * Returns the value of the '<em><b>Wind Dynamics Lookup Table</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getWindContPType3IEC <em>Wind Cont PType3 IEC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The wind dynamics lookup table associated with this P control type 3 model.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wind Dynamics Lookup Table</em>' reference list.
     * @see #isSetWindDynamicsLookupTable()
     * @see #unsetWindDynamicsLookupTable()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContPType3IEC_WindDynamicsLookupTable()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getWindContPType3IEC
     * @model opposite="WindContPType3IEC" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='WindContPType3IEC.WindDynamicsLookupTable' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< WindDynamicsLookupTable > getWindDynamicsLookupTable();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getWindDynamicsLookupTable <em>Wind Dynamics Lookup Table</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindDynamicsLookupTable()
     * @see #getWindDynamicsLookupTable()
     * @generated
     */
    void unsetWindDynamicsLookupTable();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getWindDynamicsLookupTable <em>Wind Dynamics Lookup Table</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Dynamics Lookup Table</em>' reference list is set.
     * @see #unsetWindDynamicsLookupTable()
     * @see #getWindDynamicsLookupTable()
     * @generated
     */
    boolean isSetWindDynamicsLookupTable();

    /**
     * Returns the value of the '<em><b>Kip</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * PI controller integration parameter (<i>K</i><sub>Ip</sub>). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kip</em>' attribute.
     * @see #isSetKip()
     * @see #unsetKip()
     * @see #setKip(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContPType3IEC_Kip()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindContPType3IEC.kip' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKip();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getKip <em>Kip</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kip</em>' attribute.
     * @see #isSetKip()
     * @see #unsetKip()
     * @see #getKip()
     * @generated
     */
    void setKip( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getKip <em>Kip</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKip()
     * @see #getKip()
     * @see #setKip(Double)
     * @generated
     */
    void unsetKip();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getKip <em>Kip</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kip</em>' attribute is set.
     * @see #unsetKip()
     * @see #getKip()
     * @see #setKip(Double)
     * @generated
     */
    boolean isSetKip();

    /**
     * Returns the value of the '<em><b>Thetauscale</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Voltage scaling factor of reset-torque (<i>t</i><sub>uscale</sub>). It is a project-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Thetauscale</em>' attribute.
     * @see #isSetThetauscale()
     * @see #unsetThetauscale()
     * @see #setThetauscale(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContPType3IEC_Thetauscale()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindContPType3IEC.thetauscale' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getThetauscale();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getThetauscale <em>Thetauscale</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Thetauscale</em>' attribute.
     * @see #isSetThetauscale()
     * @see #unsetThetauscale()
     * @see #getThetauscale()
     * @generated
     */
    void setThetauscale( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getThetauscale <em>Thetauscale</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetThetauscale()
     * @see #getThetauscale()
     * @see #setThetauscale(Double)
     * @generated
     */
    void unsetThetauscale();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getThetauscale <em>Thetauscale</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Thetauscale</em>' attribute is set.
     * @see #unsetThetauscale()
     * @see #getThetauscale()
     * @see #setThetauscale(Double)
     * @generated
     */
    boolean isSetThetauscale();

    /**
     * Returns the value of the '<em><b>Omegadtd</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Active drive train damping frequency (<i>omega</i><i><sub>DTD</sub></i>). It can be calculated from two mass model parameters. It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Omegadtd</em>' attribute.
     * @see #isSetOmegadtd()
     * @see #unsetOmegadtd()
     * @see #setOmegadtd(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContPType3IEC_Omegadtd()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindContPType3IEC.omegadtd' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getOmegadtd();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getOmegadtd <em>Omegadtd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Omegadtd</em>' attribute.
     * @see #isSetOmegadtd()
     * @see #unsetOmegadtd()
     * @see #getOmegadtd()
     * @generated
     */
    void setOmegadtd( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getOmegadtd <em>Omegadtd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOmegadtd()
     * @see #getOmegadtd()
     * @see #setOmegadtd(Double)
     * @generated
     */
    void unsetOmegadtd();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getOmegadtd <em>Omegadtd</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Omegadtd</em>' attribute is set.
     * @see #unsetOmegadtd()
     * @see #getOmegadtd()
     * @see #setOmegadtd(Double)
     * @generated
     */
    boolean isSetOmegadtd();

    /**
     * Returns the value of the '<em><b>Zeta</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Coefficient for active drive train damping (<i>zeta</i>). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Zeta</em>' attribute.
     * @see #isSetZeta()
     * @see #unsetZeta()
     * @see #setZeta(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContPType3IEC_Zeta()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='WindContPType3IEC.zeta' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getZeta();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getZeta <em>Zeta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Zeta</em>' attribute.
     * @see #isSetZeta()
     * @see #unsetZeta()
     * @see #getZeta()
     * @generated
     */
    void setZeta( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getZeta <em>Zeta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetZeta()
     * @see #getZeta()
     * @see #setZeta(Double)
     * @generated
     */
    void unsetZeta();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getZeta <em>Zeta</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Zeta</em>' attribute is set.
     * @see #unsetZeta()
     * @see #getZeta()
     * @see #setZeta(Double)
     * @generated
     */
    boolean isSetZeta();

} // WindContPType3IEC

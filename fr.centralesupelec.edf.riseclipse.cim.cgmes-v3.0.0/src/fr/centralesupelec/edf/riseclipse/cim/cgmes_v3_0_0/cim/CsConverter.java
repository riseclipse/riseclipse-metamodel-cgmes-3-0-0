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
 * A representation of the model object '<em><b>Cs Converter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * DC side of the current source converter (CSC).
 * The firing angle controls the dc voltage at the converter, both for rectifier and inverter. The difference between the dc voltages of the rectifier and inverter determines the dc current. The extinction angle is used to limit the dc voltage at the inverter, if needed, and is not used in active power control. The firing angle, transformer tap position and number of connected filters are the primary means to control a current source dc line. Higher level controls are built on top, e.g. dc voltage, dc current and active power. From a steady state perspective it is sufficient to specify the wanted active power transfer (ACDCConverter.targetPpcc) and the control functions will set the dc voltage, dc current, firing angle, transformer tap position and number of connected filters to meet this. Therefore attributes targetAlpha and targetGamma are not applicable in this case.
 * The reactive power consumed by the converter is a function of the firing angle, transformer tap position and number of connected filter, which can be approximated with half of the active power. The losses is a function of the dc voltage and dc current.
 * The attributes minAlpha and maxAlpha define the range of firing angles for rectifier operation between which no discrete tap changer action takes place. The range is typically 10-18 degrees.
 * The attributes minGamma and maxGamma define the range of extinction angles for inverter operation between which no discrete tap changer action takes place. The range is typically 17-20 degrees.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter#getRatedIdc <em>Rated Idc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter#getMaxAlpha <em>Max Alpha</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter#getMinAlpha <em>Min Alpha</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter#getMinGamma <em>Min Gamma</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter#getMaxIdc <em>Max Idc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter#getMinIdc <em>Min Idc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter#getMaxGamma <em>Max Gamma</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter#getCSCDynamics <em>CSC Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter#getTargetIdc <em>Target Idc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter#getOperatingMode <em>Operating Mode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter#getPPccControl <em>PPcc Control</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter#getTargetAlpha <em>Target Alpha</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter#getTargetGamma <em>Target Gamma</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter#getGamma <em>Gamma</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter#getAlpha <em>Alpha</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getCsConverter()
 * @model
 * @generated
 */
public interface CsConverter extends ACDCConverter {
    /**
     * Returns the value of the '<em><b>Max Alpha</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum firing angle. It is converter’s configuration data used in power flow. The attribute shall be a positive value.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Max Alpha</em>' attribute.
     * @see #isSetMaxAlpha()
     * @see #unsetMaxAlpha()
     * @see #setMaxAlpha(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getCsConverter_MaxAlpha()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AngleDegrees" transient="true" ordered="false"
     *        extendedMetaData="name='CsConverter.maxAlpha' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getMaxAlpha();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter#getMaxAlpha <em>Max Alpha</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Alpha</em>' attribute.
     * @see #isSetMaxAlpha()
     * @see #unsetMaxAlpha()
     * @see #getMaxAlpha()
     * @generated
     */
    void setMaxAlpha( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter#getMaxAlpha <em>Max Alpha</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaxAlpha()
     * @see #getMaxAlpha()
     * @see #setMaxAlpha(Double)
     * @generated
     */
    void unsetMaxAlpha();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter#getMaxAlpha <em>Max Alpha</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max Alpha</em>' attribute is set.
     * @see #unsetMaxAlpha()
     * @see #getMaxAlpha()
     * @see #setMaxAlpha(Double)
     * @generated
     */
    boolean isSetMaxAlpha();

    /**
     * Returns the value of the '<em><b>Max Gamma</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum extinction angle. It is converter’s configuration data used in power flow. The attribute shall be a positive value.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Max Gamma</em>' attribute.
     * @see #isSetMaxGamma()
     * @see #unsetMaxGamma()
     * @see #setMaxGamma(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getCsConverter_MaxGamma()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AngleDegrees" transient="true" ordered="false"
     *        extendedMetaData="name='CsConverter.maxGamma' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getMaxGamma();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter#getMaxGamma <em>Max Gamma</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Gamma</em>' attribute.
     * @see #isSetMaxGamma()
     * @see #unsetMaxGamma()
     * @see #getMaxGamma()
     * @generated
     */
    void setMaxGamma( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter#getMaxGamma <em>Max Gamma</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaxGamma()
     * @see #getMaxGamma()
     * @see #setMaxGamma(Double)
     * @generated
     */
    void unsetMaxGamma();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter#getMaxGamma <em>Max Gamma</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max Gamma</em>' attribute is set.
     * @see #unsetMaxGamma()
     * @see #getMaxGamma()
     * @see #setMaxGamma(Double)
     * @generated
     */
    boolean isSetMaxGamma();

    /**
     * Returns the value of the '<em><b>CSC Dynamics</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CSCDynamics#getCSConverter <em>CS Converter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Current source converter dynamics model used to describe dynamic behaviour of this converter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>CSC Dynamics</em>' reference.
     * @see #isSetCSCDynamics()
     * @see #unsetCSCDynamics()
     * @see #setCSCDynamics(CSCDynamics)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getCsConverter_CSCDynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CSCDynamics#getCSConverter
     * @model opposite="CSConverter" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='CsConverter.CSCDynamics' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    CSCDynamics getCSCDynamics();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter#getCSCDynamics <em>CSC Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>CSC Dynamics</em>' reference.
     * @see #isSetCSCDynamics()
     * @see #unsetCSCDynamics()
     * @see #getCSCDynamics()
     * @generated
     */
    void setCSCDynamics( CSCDynamics value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter#getCSCDynamics <em>CSC Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCSCDynamics()
     * @see #getCSCDynamics()
     * @see #setCSCDynamics(CSCDynamics)
     * @generated
     */
    void unsetCSCDynamics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter#getCSCDynamics <em>CSC Dynamics</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>CSC Dynamics</em>' reference is set.
     * @see #unsetCSCDynamics()
     * @see #getCSCDynamics()
     * @see #setCSCDynamics(CSCDynamics)
     * @generated
     */
    boolean isSetCSCDynamics();

    /**
     * Returns the value of the '<em><b>Target Idc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * DC current target value. It is converter’s control variable used in power flow. The attribute shall be a positive value.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Target Idc</em>' attribute.
     * @see #isSetTargetIdc()
     * @see #unsetTargetIdc()
     * @see #setTargetIdc(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getCsConverter_TargetIdc()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CurrentFlow" transient="true" ordered="false"
     *        extendedMetaData="name='CsConverter.targetIdc' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTargetIdc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter#getTargetIdc <em>Target Idc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target Idc</em>' attribute.
     * @see #isSetTargetIdc()
     * @see #unsetTargetIdc()
     * @see #getTargetIdc()
     * @generated
     */
    void setTargetIdc( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter#getTargetIdc <em>Target Idc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTargetIdc()
     * @see #getTargetIdc()
     * @see #setTargetIdc(Double)
     * @generated
     */
    void unsetTargetIdc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter#getTargetIdc <em>Target Idc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Target Idc</em>' attribute is set.
     * @see #unsetTargetIdc()
     * @see #getTargetIdc()
     * @see #setTargetIdc(Double)
     * @generated
     */
    boolean isSetTargetIdc();

    /**
     * Returns the value of the '<em><b>Operating Mode</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsOperatingModeKind}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Indicates whether the DC pole is operating as an inverter or as a rectifier. It is converter’s control variable used in power flow.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Operating Mode</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsOperatingModeKind
     * @see #isSetOperatingMode()
     * @see #unsetOperatingMode()
     * @see #setOperatingMode(CsOperatingModeKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getCsConverter_OperatingMode()
     * @model unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='CsConverter.operatingMode' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    CsOperatingModeKind getOperatingMode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter#getOperatingMode <em>Operating Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Operating Mode</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsOperatingModeKind
     * @see #isSetOperatingMode()
     * @see #unsetOperatingMode()
     * @see #getOperatingMode()
     * @generated
     */
    void setOperatingMode( CsOperatingModeKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter#getOperatingMode <em>Operating Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOperatingMode()
     * @see #getOperatingMode()
     * @see #setOperatingMode(CsOperatingModeKind)
     * @generated
     */
    void unsetOperatingMode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter#getOperatingMode <em>Operating Mode</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Operating Mode</em>' attribute is set.
     * @see #unsetOperatingMode()
     * @see #getOperatingMode()
     * @see #setOperatingMode(CsOperatingModeKind)
     * @generated
     */
    boolean isSetOperatingMode();

    /**
     * Returns the value of the '<em><b>PPcc Control</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsPpccControlKind}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Kind of active power control.
     * <!-- end-model-doc -->
     * @return the value of the '<em>PPcc Control</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsPpccControlKind
     * @see #isSetPPccControl()
     * @see #unsetPPccControl()
     * @see #setPPccControl(CsPpccControlKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getCsConverter_PPccControl()
     * @model unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='CsConverter.pPccControl' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    CsPpccControlKind getPPccControl();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter#getPPccControl <em>PPcc Control</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PPcc Control</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsPpccControlKind
     * @see #isSetPPccControl()
     * @see #unsetPPccControl()
     * @see #getPPccControl()
     * @generated
     */
    void setPPccControl( CsPpccControlKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter#getPPccControl <em>PPcc Control</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPPccControl()
     * @see #getPPccControl()
     * @see #setPPccControl(CsPpccControlKind)
     * @generated
     */
    void unsetPPccControl();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter#getPPccControl <em>PPcc Control</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>PPcc Control</em>' attribute is set.
     * @see #unsetPPccControl()
     * @see #getPPccControl()
     * @see #setPPccControl(CsPpccControlKind)
     * @generated
     */
    boolean isSetPPccControl();

    /**
     * Returns the value of the '<em><b>Target Alpha</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Target firing angle. It is converter’s control variable used in power flow. It is only applicable for rectifier if continuous tap changer control is used. Allowed values are within the range minAlpha&lt;=targetAlpha&lt;=maxAlpha. The attribute shall be a positive value.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Target Alpha</em>' attribute.
     * @see #isSetTargetAlpha()
     * @see #unsetTargetAlpha()
     * @see #setTargetAlpha(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getCsConverter_TargetAlpha()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AngleDegrees" transient="true" ordered="false"
     *        extendedMetaData="name='CsConverter.targetAlpha' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTargetAlpha();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter#getTargetAlpha <em>Target Alpha</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target Alpha</em>' attribute.
     * @see #isSetTargetAlpha()
     * @see #unsetTargetAlpha()
     * @see #getTargetAlpha()
     * @generated
     */
    void setTargetAlpha( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter#getTargetAlpha <em>Target Alpha</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTargetAlpha()
     * @see #getTargetAlpha()
     * @see #setTargetAlpha(Double)
     * @generated
     */
    void unsetTargetAlpha();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter#getTargetAlpha <em>Target Alpha</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Target Alpha</em>' attribute is set.
     * @see #unsetTargetAlpha()
     * @see #getTargetAlpha()
     * @see #setTargetAlpha(Double)
     * @generated
     */
    boolean isSetTargetAlpha();

    /**
     * Returns the value of the '<em><b>Target Gamma</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Target extinction angle. It is converter’s control variable used in power flow. It is only applicable for inverter if continuous tap changer control is used. Allowed values are within the range minGamma&lt;=targetGamma&lt;=maxGamma. The attribute shall be a positive value.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Target Gamma</em>' attribute.
     * @see #isSetTargetGamma()
     * @see #unsetTargetGamma()
     * @see #setTargetGamma(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getCsConverter_TargetGamma()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AngleDegrees" transient="true" ordered="false"
     *        extendedMetaData="name='CsConverter.targetGamma' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTargetGamma();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter#getTargetGamma <em>Target Gamma</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target Gamma</em>' attribute.
     * @see #isSetTargetGamma()
     * @see #unsetTargetGamma()
     * @see #getTargetGamma()
     * @generated
     */
    void setTargetGamma( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter#getTargetGamma <em>Target Gamma</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTargetGamma()
     * @see #getTargetGamma()
     * @see #setTargetGamma(Double)
     * @generated
     */
    void unsetTargetGamma();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter#getTargetGamma <em>Target Gamma</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Target Gamma</em>' attribute is set.
     * @see #unsetTargetGamma()
     * @see #getTargetGamma()
     * @see #setTargetGamma(Double)
     * @generated
     */
    boolean isSetTargetGamma();

    /**
     * Returns the value of the '<em><b>Gamma</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Extinction angle. It is used to limit the dc voltage at the inverter if needed. Typical value between 17 degrees and 20 degrees for an inverter. It is converter’s state variable, result from power flow. The attribute shall be a positive value.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Gamma</em>' attribute.
     * @see #isSetGamma()
     * @see #unsetGamma()
     * @see #setGamma(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getCsConverter_Gamma()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AngleDegrees" transient="true" ordered="false"
     *        extendedMetaData="name='CsConverter.gamma' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getGamma();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter#getGamma <em>Gamma</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Gamma</em>' attribute.
     * @see #isSetGamma()
     * @see #unsetGamma()
     * @see #getGamma()
     * @generated
     */
    void setGamma( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter#getGamma <em>Gamma</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGamma()
     * @see #getGamma()
     * @see #setGamma(Double)
     * @generated
     */
    void unsetGamma();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter#getGamma <em>Gamma</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Gamma</em>' attribute is set.
     * @see #unsetGamma()
     * @see #getGamma()
     * @see #setGamma(Double)
     * @generated
     */
    boolean isSetGamma();

    /**
     * Returns the value of the '<em><b>Alpha</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Firing angle that determines the dc voltage at the converter dc terminal. Typical value between 10 degrees and 18 degrees for a rectifier. It is converter’s state variable, result from power flow. The attribute shall be a positive value.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Alpha</em>' attribute.
     * @see #isSetAlpha()
     * @see #unsetAlpha()
     * @see #setAlpha(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getCsConverter_Alpha()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AngleDegrees" transient="true" ordered="false"
     *        extendedMetaData="name='CsConverter.alpha' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getAlpha();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter#getAlpha <em>Alpha</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Alpha</em>' attribute.
     * @see #isSetAlpha()
     * @see #unsetAlpha()
     * @see #getAlpha()
     * @generated
     */
    void setAlpha( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter#getAlpha <em>Alpha</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAlpha()
     * @see #getAlpha()
     * @see #setAlpha(Double)
     * @generated
     */
    void unsetAlpha();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter#getAlpha <em>Alpha</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Alpha</em>' attribute is set.
     * @see #unsetAlpha()
     * @see #getAlpha()
     * @see #setAlpha(Double)
     * @generated
     */
    boolean isSetAlpha();

    /**
     * Returns the value of the '<em><b>Min Gamma</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum extinction angle. It is converter’s configuration data used in power flow. The attribute shall be a positive value.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Min Gamma</em>' attribute.
     * @see #isSetMinGamma()
     * @see #unsetMinGamma()
     * @see #setMinGamma(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getCsConverter_MinGamma()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AngleDegrees" transient="true" ordered="false"
     *        extendedMetaData="name='CsConverter.minGamma' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getMinGamma();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter#getMinGamma <em>Min Gamma</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min Gamma</em>' attribute.
     * @see #isSetMinGamma()
     * @see #unsetMinGamma()
     * @see #getMinGamma()
     * @generated
     */
    void setMinGamma( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter#getMinGamma <em>Min Gamma</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMinGamma()
     * @see #getMinGamma()
     * @see #setMinGamma(Double)
     * @generated
     */
    void unsetMinGamma();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter#getMinGamma <em>Min Gamma</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Min Gamma</em>' attribute is set.
     * @see #unsetMinGamma()
     * @see #getMinGamma()
     * @see #setMinGamma(Double)
     * @generated
     */
    boolean isSetMinGamma();

    /**
     * Returns the value of the '<em><b>Min Idc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The minimum direct current (Id) on the DC side at which the converter should operate. It is converter’s configuration data used in power flow. The attribute shall be a positive value.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Min Idc</em>' attribute.
     * @see #isSetMinIdc()
     * @see #unsetMinIdc()
     * @see #setMinIdc(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getCsConverter_MinIdc()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CurrentFlow" transient="true" ordered="false"
     *        extendedMetaData="name='CsConverter.minIdc' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getMinIdc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter#getMinIdc <em>Min Idc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min Idc</em>' attribute.
     * @see #isSetMinIdc()
     * @see #unsetMinIdc()
     * @see #getMinIdc()
     * @generated
     */
    void setMinIdc( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter#getMinIdc <em>Min Idc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMinIdc()
     * @see #getMinIdc()
     * @see #setMinIdc(Double)
     * @generated
     */
    void unsetMinIdc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter#getMinIdc <em>Min Idc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Min Idc</em>' attribute is set.
     * @see #unsetMinIdc()
     * @see #getMinIdc()
     * @see #setMinIdc(Double)
     * @generated
     */
    boolean isSetMinIdc();

    /**
     * Returns the value of the '<em><b>Min Alpha</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum firing angle. It is converter’s configuration data used in power flow. The attribute shall be a positive value.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Min Alpha</em>' attribute.
     * @see #isSetMinAlpha()
     * @see #unsetMinAlpha()
     * @see #setMinAlpha(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getCsConverter_MinAlpha()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AngleDegrees" transient="true" ordered="false"
     *        extendedMetaData="name='CsConverter.minAlpha' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getMinAlpha();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter#getMinAlpha <em>Min Alpha</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min Alpha</em>' attribute.
     * @see #isSetMinAlpha()
     * @see #unsetMinAlpha()
     * @see #getMinAlpha()
     * @generated
     */
    void setMinAlpha( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter#getMinAlpha <em>Min Alpha</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMinAlpha()
     * @see #getMinAlpha()
     * @see #setMinAlpha(Double)
     * @generated
     */
    void unsetMinAlpha();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter#getMinAlpha <em>Min Alpha</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Min Alpha</em>' attribute is set.
     * @see #unsetMinAlpha()
     * @see #getMinAlpha()
     * @see #setMinAlpha(Double)
     * @generated
     */
    boolean isSetMinAlpha();

    /**
     * Returns the value of the '<em><b>Max Idc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The maximum direct current (Id) on the DC side at which the converter should operate. It is converter’s configuration data use in power flow. The attribute shall be a positive value.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Max Idc</em>' attribute.
     * @see #isSetMaxIdc()
     * @see #unsetMaxIdc()
     * @see #setMaxIdc(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getCsConverter_MaxIdc()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CurrentFlow" transient="true" ordered="false"
     *        extendedMetaData="name='CsConverter.maxIdc' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getMaxIdc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter#getMaxIdc <em>Max Idc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Idc</em>' attribute.
     * @see #isSetMaxIdc()
     * @see #unsetMaxIdc()
     * @see #getMaxIdc()
     * @generated
     */
    void setMaxIdc( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter#getMaxIdc <em>Max Idc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaxIdc()
     * @see #getMaxIdc()
     * @see #setMaxIdc(Double)
     * @generated
     */
    void unsetMaxIdc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter#getMaxIdc <em>Max Idc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max Idc</em>' attribute is set.
     * @see #unsetMaxIdc()
     * @see #getMaxIdc()
     * @see #setMaxIdc(Double)
     * @generated
     */
    boolean isSetMaxIdc();

    /**
     * Returns the value of the '<em><b>Rated Idc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Rated converter DC current, also called IdN. The attribute shall be a positive value. It is converter’s configuration data used in power flow.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Rated Idc</em>' attribute.
     * @see #isSetRatedIdc()
     * @see #unsetRatedIdc()
     * @see #setRatedIdc(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getCsConverter_RatedIdc()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CurrentFlow" transient="true" ordered="false"
     *        extendedMetaData="name='CsConverter.ratedIdc' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getRatedIdc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter#getRatedIdc <em>Rated Idc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rated Idc</em>' attribute.
     * @see #isSetRatedIdc()
     * @see #unsetRatedIdc()
     * @see #getRatedIdc()
     * @generated
     */
    void setRatedIdc( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter#getRatedIdc <em>Rated Idc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRatedIdc()
     * @see #getRatedIdc()
     * @see #setRatedIdc(Double)
     * @generated
     */
    void unsetRatedIdc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CsConverter#getRatedIdc <em>Rated Idc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rated Idc</em>' attribute is set.
     * @see #unsetRatedIdc()
     * @see #getRatedIdc()
     * @see #setRatedIdc(Double)
     * @generated
     */
    boolean isSetRatedIdc();

} // CsConverter

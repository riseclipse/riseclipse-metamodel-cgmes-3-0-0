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
 * A representation of the model object '<em><b>Vs Converter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * DC side of the voltage source converter (VSC).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter#getMaxModulationIndex <em>Max Modulation Index</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter#getCapabilityCurve <em>Capability Curve</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter#getVSCDynamics <em>VSC Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter#getTargetQpcc <em>Target Qpcc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter#getQShare <em>QShare</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter#getDroop <em>Droop</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter#getPPccControl <em>PPcc Control</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter#getTargetPhasePcc <em>Target Phase Pcc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter#getTargetPWMfactor <em>Target PW Mfactor</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter#getTargetUpcc <em>Target Upcc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter#getQPccControl <em>QPcc Control</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter#getDroopCompensation <em>Droop Compensation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter#getTargetPowerFactorPcc <em>Target Power Factor Pcc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter#getDelta <em>Delta</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter#getUv <em>Uv</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getVsConverter()
 * @model
 * @generated
 */
public interface VsConverter extends ACDCConverter {
    /**
     * Returns the value of the '<em><b>Capability Curve</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsCapabilityCurve#getVsConverterDCSides <em>Vs Converter DC Sides</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Capability curve of this converter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Capability Curve</em>' reference.
     * @see #isSetCapabilityCurve()
     * @see #unsetCapabilityCurve()
     * @see #setCapabilityCurve(VsCapabilityCurve)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getVsConverter_CapabilityCurve()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsCapabilityCurve#getVsConverterDCSides
     * @model opposite="VsConverterDCSides" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='VsConverter.CapabilityCurve' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    VsCapabilityCurve getCapabilityCurve();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter#getCapabilityCurve <em>Capability Curve</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Capability Curve</em>' reference.
     * @see #isSetCapabilityCurve()
     * @see #unsetCapabilityCurve()
     * @see #getCapabilityCurve()
     * @generated
     */
    void setCapabilityCurve( VsCapabilityCurve value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter#getCapabilityCurve <em>Capability Curve</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCapabilityCurve()
     * @see #getCapabilityCurve()
     * @see #setCapabilityCurve(VsCapabilityCurve)
     * @generated
     */
    void unsetCapabilityCurve();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter#getCapabilityCurve <em>Capability Curve</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Capability Curve</em>' reference is set.
     * @see #unsetCapabilityCurve()
     * @see #getCapabilityCurve()
     * @see #setCapabilityCurve(VsCapabilityCurve)
     * @generated
     */
    boolean isSetCapabilityCurve();

    /**
     * Returns the value of the '<em><b>VSC Dynamics</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VSCDynamics#getVsConverter <em>Vs Converter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Voltage source converter dynamics model used to describe dynamic behaviour of this converter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>VSC Dynamics</em>' reference.
     * @see #isSetVSCDynamics()
     * @see #unsetVSCDynamics()
     * @see #setVSCDynamics(VSCDynamics)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getVsConverter_VSCDynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VSCDynamics#getVsConverter
     * @model opposite="VsConverter" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='VsConverter.VSCDynamics' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    VSCDynamics getVSCDynamics();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter#getVSCDynamics <em>VSC Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>VSC Dynamics</em>' reference.
     * @see #isSetVSCDynamics()
     * @see #unsetVSCDynamics()
     * @see #getVSCDynamics()
     * @generated
     */
    void setVSCDynamics( VSCDynamics value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter#getVSCDynamics <em>VSC Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVSCDynamics()
     * @see #getVSCDynamics()
     * @see #setVSCDynamics(VSCDynamics)
     * @generated
     */
    void unsetVSCDynamics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter#getVSCDynamics <em>VSC Dynamics</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>VSC Dynamics</em>' reference is set.
     * @see #unsetVSCDynamics()
     * @see #getVSCDynamics()
     * @see #setVSCDynamics(VSCDynamics)
     * @generated
     */
    boolean isSetVSCDynamics();

    /**
     * Returns the value of the '<em><b>Target Qpcc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reactive power injection target in AC grid, at point of common coupling.  Load sign convention is used, i.e. positive sign means flow out from a node.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Target Qpcc</em>' attribute.
     * @see #isSetTargetQpcc()
     * @see #unsetTargetQpcc()
     * @see #setTargetQpcc(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getVsConverter_TargetQpcc()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ReactivePower" transient="true" ordered="false"
     *        extendedMetaData="name='VsConverter.targetQpcc' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTargetQpcc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter#getTargetQpcc <em>Target Qpcc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target Qpcc</em>' attribute.
     * @see #isSetTargetQpcc()
     * @see #unsetTargetQpcc()
     * @see #getTargetQpcc()
     * @generated
     */
    void setTargetQpcc( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter#getTargetQpcc <em>Target Qpcc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTargetQpcc()
     * @see #getTargetQpcc()
     * @see #setTargetQpcc(Double)
     * @generated
     */
    void unsetTargetQpcc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter#getTargetQpcc <em>Target Qpcc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Target Qpcc</em>' attribute is set.
     * @see #unsetTargetQpcc()
     * @see #getTargetQpcc()
     * @see #setTargetQpcc(Double)
     * @generated
     */
    boolean isSetTargetQpcc();

    /**
     * Returns the value of the '<em><b>QShare</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reactive power sharing factor among parallel converters on Uac control. The attribute shall be a positive value or zero.
     * <!-- end-model-doc -->
     * @return the value of the '<em>QShare</em>' attribute.
     * @see #isSetQShare()
     * @see #unsetQShare()
     * @see #setQShare(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getVsConverter_QShare()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PerCent" transient="true" ordered="false"
     *        extendedMetaData="name='VsConverter.qShare' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getQShare();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter#getQShare <em>QShare</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>QShare</em>' attribute.
     * @see #isSetQShare()
     * @see #unsetQShare()
     * @see #getQShare()
     * @generated
     */
    void setQShare( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter#getQShare <em>QShare</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQShare()
     * @see #getQShare()
     * @see #setQShare(Double)
     * @generated
     */
    void unsetQShare();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter#getQShare <em>QShare</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>QShare</em>' attribute is set.
     * @see #unsetQShare()
     * @see #getQShare()
     * @see #setQShare(Double)
     * @generated
     */
    boolean isSetQShare();

    /**
     * Returns the value of the '<em><b>Droop</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Droop constant. The pu value is obtained as D [kV/MW] x Sb / Ubdc. The attribute shall be a positive value.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Droop</em>' attribute.
     * @see #isSetDroop()
     * @see #unsetDroop()
     * @see #setDroop(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getVsConverter_Droop()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='VsConverter.droop' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getDroop();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter#getDroop <em>Droop</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Droop</em>' attribute.
     * @see #isSetDroop()
     * @see #unsetDroop()
     * @see #getDroop()
     * @generated
     */
    void setDroop( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter#getDroop <em>Droop</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDroop()
     * @see #getDroop()
     * @see #setDroop(Double)
     * @generated
     */
    void unsetDroop();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter#getDroop <em>Droop</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Droop</em>' attribute is set.
     * @see #unsetDroop()
     * @see #getDroop()
     * @see #setDroop(Double)
     * @generated
     */
    boolean isSetDroop();

    /**
     * Returns the value of the '<em><b>PPcc Control</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsPpccControlKind}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Kind of control of real power and/or DC voltage.
     * <!-- end-model-doc -->
     * @return the value of the '<em>PPcc Control</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsPpccControlKind
     * @see #isSetPPccControl()
     * @see #unsetPPccControl()
     * @see #setPPccControl(VsPpccControlKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getVsConverter_PPccControl()
     * @model unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='VsConverter.pPccControl' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    VsPpccControlKind getPPccControl();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter#getPPccControl <em>PPcc Control</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>PPcc Control</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsPpccControlKind
     * @see #isSetPPccControl()
     * @see #unsetPPccControl()
     * @see #getPPccControl()
     * @generated
     */
    void setPPccControl( VsPpccControlKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter#getPPccControl <em>PPcc Control</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPPccControl()
     * @see #getPPccControl()
     * @see #setPPccControl(VsPpccControlKind)
     * @generated
     */
    void unsetPPccControl();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter#getPPccControl <em>PPcc Control</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>PPcc Control</em>' attribute is set.
     * @see #unsetPPccControl()
     * @see #getPPccControl()
     * @see #setPPccControl(VsPpccControlKind)
     * @generated
     */
    boolean isSetPPccControl();

    /**
     * Returns the value of the '<em><b>Target Phase Pcc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Phase target at AC side, at point of common coupling. The attribute shall be a positive value.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Target Phase Pcc</em>' attribute.
     * @see #isSetTargetPhasePcc()
     * @see #unsetTargetPhasePcc()
     * @see #setTargetPhasePcc(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getVsConverter_TargetPhasePcc()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AngleDegrees" transient="true" ordered="false"
     *        extendedMetaData="name='VsConverter.targetPhasePcc' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTargetPhasePcc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter#getTargetPhasePcc <em>Target Phase Pcc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target Phase Pcc</em>' attribute.
     * @see #isSetTargetPhasePcc()
     * @see #unsetTargetPhasePcc()
     * @see #getTargetPhasePcc()
     * @generated
     */
    void setTargetPhasePcc( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter#getTargetPhasePcc <em>Target Phase Pcc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTargetPhasePcc()
     * @see #getTargetPhasePcc()
     * @see #setTargetPhasePcc(Double)
     * @generated
     */
    void unsetTargetPhasePcc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter#getTargetPhasePcc <em>Target Phase Pcc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Target Phase Pcc</em>' attribute is set.
     * @see #unsetTargetPhasePcc()
     * @see #getTargetPhasePcc()
     * @see #setTargetPhasePcc(Double)
     * @generated
     */
    boolean isSetTargetPhasePcc();

    /**
     * Returns the value of the '<em><b>Target PW Mfactor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Magnitude of pulse-modulation factor. The attribute shall be a positive value.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Target PW Mfactor</em>' attribute.
     * @see #isSetTargetPWMfactor()
     * @see #unsetTargetPWMfactor()
     * @see #setTargetPWMfactor(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getVsConverter_TargetPWMfactor()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='VsConverter.targetPWMfactor' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTargetPWMfactor();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter#getTargetPWMfactor <em>Target PW Mfactor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target PW Mfactor</em>' attribute.
     * @see #isSetTargetPWMfactor()
     * @see #unsetTargetPWMfactor()
     * @see #getTargetPWMfactor()
     * @generated
     */
    void setTargetPWMfactor( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter#getTargetPWMfactor <em>Target PW Mfactor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTargetPWMfactor()
     * @see #getTargetPWMfactor()
     * @see #setTargetPWMfactor(Double)
     * @generated
     */
    void unsetTargetPWMfactor();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter#getTargetPWMfactor <em>Target PW Mfactor</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Target PW Mfactor</em>' attribute is set.
     * @see #unsetTargetPWMfactor()
     * @see #getTargetPWMfactor()
     * @see #setTargetPWMfactor(Double)
     * @generated
     */
    boolean isSetTargetPWMfactor();

    /**
     * Returns the value of the '<em><b>Target Upcc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Voltage target in AC grid, at point of common coupling. The attribute shall be a positive value.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Target Upcc</em>' attribute.
     * @see #isSetTargetUpcc()
     * @see #unsetTargetUpcc()
     * @see #setTargetUpcc(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getVsConverter_TargetUpcc()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Voltage" transient="true" ordered="false"
     *        extendedMetaData="name='VsConverter.targetUpcc' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTargetUpcc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter#getTargetUpcc <em>Target Upcc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target Upcc</em>' attribute.
     * @see #isSetTargetUpcc()
     * @see #unsetTargetUpcc()
     * @see #getTargetUpcc()
     * @generated
     */
    void setTargetUpcc( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter#getTargetUpcc <em>Target Upcc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTargetUpcc()
     * @see #getTargetUpcc()
     * @see #setTargetUpcc(Double)
     * @generated
     */
    void unsetTargetUpcc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter#getTargetUpcc <em>Target Upcc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Target Upcc</em>' attribute is set.
     * @see #unsetTargetUpcc()
     * @see #getTargetUpcc()
     * @see #setTargetUpcc(Double)
     * @generated
     */
    boolean isSetTargetUpcc();

    /**
     * Returns the value of the '<em><b>QPcc Control</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsQpccControlKind}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Kind of reactive power control.
     * <!-- end-model-doc -->
     * @return the value of the '<em>QPcc Control</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsQpccControlKind
     * @see #isSetQPccControl()
     * @see #unsetQPccControl()
     * @see #setQPccControl(VsQpccControlKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getVsConverter_QPccControl()
     * @model unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='VsConverter.qPccControl' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    VsQpccControlKind getQPccControl();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter#getQPccControl <em>QPcc Control</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>QPcc Control</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsQpccControlKind
     * @see #isSetQPccControl()
     * @see #unsetQPccControl()
     * @see #getQPccControl()
     * @generated
     */
    void setQPccControl( VsQpccControlKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter#getQPccControl <em>QPcc Control</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQPccControl()
     * @see #getQPccControl()
     * @see #setQPccControl(VsQpccControlKind)
     * @generated
     */
    void unsetQPccControl();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter#getQPccControl <em>QPcc Control</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>QPcc Control</em>' attribute is set.
     * @see #unsetQPccControl()
     * @see #getQPccControl()
     * @see #setQPccControl(VsQpccControlKind)
     * @generated
     */
    boolean isSetQPccControl();

    /**
     * Returns the value of the '<em><b>Droop Compensation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Compensation constant. Used to compensate for voltage drop when controlling voltage at a distant bus. The attribute shall be a positive value.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Droop Compensation</em>' attribute.
     * @see #isSetDroopCompensation()
     * @see #unsetDroopCompensation()
     * @see #setDroopCompensation(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getVsConverter_DroopCompensation()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Resistance" transient="true" ordered="false"
     *        extendedMetaData="name='VsConverter.droopCompensation' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getDroopCompensation();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter#getDroopCompensation <em>Droop Compensation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Droop Compensation</em>' attribute.
     * @see #isSetDroopCompensation()
     * @see #unsetDroopCompensation()
     * @see #getDroopCompensation()
     * @generated
     */
    void setDroopCompensation( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter#getDroopCompensation <em>Droop Compensation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDroopCompensation()
     * @see #getDroopCompensation()
     * @see #setDroopCompensation(Double)
     * @generated
     */
    void unsetDroopCompensation();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter#getDroopCompensation <em>Droop Compensation</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Droop Compensation</em>' attribute is set.
     * @see #unsetDroopCompensation()
     * @see #getDroopCompensation()
     * @see #setDroopCompensation(Double)
     * @generated
     */
    boolean isSetDroopCompensation();

    /**
     * Returns the value of the '<em><b>Target Power Factor Pcc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Power factor target at the AC side, at point of common coupling. The attribute shall be a positive value.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Target Power Factor Pcc</em>' attribute.
     * @see #isSetTargetPowerFactorPcc()
     * @see #unsetTargetPowerFactorPcc()
     * @see #setTargetPowerFactorPcc(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getVsConverter_TargetPowerFactorPcc()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='VsConverter.targetPowerFactorPcc' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTargetPowerFactorPcc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter#getTargetPowerFactorPcc <em>Target Power Factor Pcc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target Power Factor Pcc</em>' attribute.
     * @see #isSetTargetPowerFactorPcc()
     * @see #unsetTargetPowerFactorPcc()
     * @see #getTargetPowerFactorPcc()
     * @generated
     */
    void setTargetPowerFactorPcc( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter#getTargetPowerFactorPcc <em>Target Power Factor Pcc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTargetPowerFactorPcc()
     * @see #getTargetPowerFactorPcc()
     * @see #setTargetPowerFactorPcc(Double)
     * @generated
     */
    void unsetTargetPowerFactorPcc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter#getTargetPowerFactorPcc <em>Target Power Factor Pcc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Target Power Factor Pcc</em>' attribute is set.
     * @see #unsetTargetPowerFactorPcc()
     * @see #getTargetPowerFactorPcc()
     * @see #setTargetPowerFactorPcc(Double)
     * @generated
     */
    boolean isSetTargetPowerFactorPcc();

    /**
     * Returns the value of the '<em><b>Delta</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Angle between VsConverter.uv and ACDCConverter.uc. It is converter’s state variable used in power flow. The attribute shall be a positive value or zero.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Delta</em>' attribute.
     * @see #isSetDelta()
     * @see #unsetDelta()
     * @see #setDelta(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getVsConverter_Delta()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AngleDegrees" transient="true" ordered="false"
     *        extendedMetaData="name='VsConverter.delta' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getDelta();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter#getDelta <em>Delta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Delta</em>' attribute.
     * @see #isSetDelta()
     * @see #unsetDelta()
     * @see #getDelta()
     * @generated
     */
    void setDelta( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter#getDelta <em>Delta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDelta()
     * @see #getDelta()
     * @see #setDelta(Double)
     * @generated
     */
    void unsetDelta();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter#getDelta <em>Delta</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Delta</em>' attribute is set.
     * @see #unsetDelta()
     * @see #getDelta()
     * @see #setDelta(Double)
     * @generated
     */
    boolean isSetDelta();

    /**
     * Returns the value of the '<em><b>Uv</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Line-to-line voltage on the valve side of the converter transformer. It is converter’s state variable, result from power flow. The attribute shall be a positive value.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Uv</em>' attribute.
     * @see #isSetUv()
     * @see #unsetUv()
     * @see #setUv(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getVsConverter_Uv()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Voltage" transient="true" ordered="false"
     *        extendedMetaData="name='VsConverter.uv' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getUv();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter#getUv <em>Uv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Uv</em>' attribute.
     * @see #isSetUv()
     * @see #unsetUv()
     * @see #getUv()
     * @generated
     */
    void setUv( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter#getUv <em>Uv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUv()
     * @see #getUv()
     * @see #setUv(Double)
     * @generated
     */
    void unsetUv();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter#getUv <em>Uv</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Uv</em>' attribute is set.
     * @see #unsetUv()
     * @see #getUv()
     * @see #setUv(Double)
     * @generated
     */
    boolean isSetUv();

    /**
     * Returns the value of the '<em><b>Max Modulation Index</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The maximum quotient between the AC converter voltage (Uc) and DC voltage (Ud). A factor typically less than 1. It is converter’s configuration data used in power flow.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Max Modulation Index</em>' attribute.
     * @see #isSetMaxModulationIndex()
     * @see #unsetMaxModulationIndex()
     * @see #setMaxModulationIndex(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getVsConverter_MaxModulationIndex()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='VsConverter.maxModulationIndex' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getMaxModulationIndex();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter#getMaxModulationIndex <em>Max Modulation Index</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Modulation Index</em>' attribute.
     * @see #isSetMaxModulationIndex()
     * @see #unsetMaxModulationIndex()
     * @see #getMaxModulationIndex()
     * @generated
     */
    void setMaxModulationIndex( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter#getMaxModulationIndex <em>Max Modulation Index</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaxModulationIndex()
     * @see #getMaxModulationIndex()
     * @see #setMaxModulationIndex(Double)
     * @generated
     */
    void unsetMaxModulationIndex();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VsConverter#getMaxModulationIndex <em>Max Modulation Index</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max Modulation Index</em>' attribute is set.
     * @see #unsetMaxModulationIndex()
     * @see #getMaxModulationIndex()
     * @see #setMaxModulationIndex(Double)
     * @generated
     */
    boolean isSetMaxModulationIndex();

} // VsConverter

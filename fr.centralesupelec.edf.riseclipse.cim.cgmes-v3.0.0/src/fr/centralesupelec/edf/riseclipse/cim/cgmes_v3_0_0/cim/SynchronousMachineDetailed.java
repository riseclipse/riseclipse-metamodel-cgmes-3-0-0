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
 * A representation of the model object '<em><b>Synchronous Machine Detailed</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * All synchronous machine detailed types use a subset of the same data parameters and input/output variables.
 * The several variations differ in the following ways:
 * - the number of  equivalent windings that are included;
 * - the way in which saturation is incorporated into the model;
 * - whether or not “subtransient saliency” (<i>X''q</i> not = <i>X''d</i>) is represented.
 * It is not necessary for each simulation tool to have separate models for each of the model types.  The same model can often be used for several types by alternative logic within the model.  Also, differences in saturation representation might not result in significant model performance differences so model substitutions are often acceptable.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineDetailed#getIfdBaseType <em>Ifd Base Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineDetailed#getEfdBaseRatio <em>Efd Base Ratio</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineDetailed#getSaturationFactor120QAxis <em>Saturation Factor120 QAxis</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineDetailed#getSaturationFactorQAxis <em>Saturation Factor QAxis</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachineDetailed()
 * @model
 * @generated
 */
public interface SynchronousMachineDetailed extends SynchronousMachineDynamics {
    /**
     * Returns the value of the '<em><b>Ifd Base Type</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.IfdBaseKind}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Excitation base system mode. It should be equal to the value of <i>WLMDV</i> given by the user. <i>WLMDV</i> is the PU ratio between the field voltage and the excitation current: <i>Efd</i> = <i>WLMDV</i> x <i>Ifd</i>. Typical value = ifag.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ifd Base Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.IfdBaseKind
     * @see #isSetIfdBaseType()
     * @see #unsetIfdBaseType()
     * @see #setIfdBaseType(IfdBaseKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachineDetailed_IfdBaseType()
     * @model unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='SynchronousMachineDetailed.ifdBaseType' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    IfdBaseKind getIfdBaseType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineDetailed#getIfdBaseType <em>Ifd Base Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ifd Base Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.IfdBaseKind
     * @see #isSetIfdBaseType()
     * @see #unsetIfdBaseType()
     * @see #getIfdBaseType()
     * @generated
     */
    void setIfdBaseType( IfdBaseKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineDetailed#getIfdBaseType <em>Ifd Base Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIfdBaseType()
     * @see #getIfdBaseType()
     * @see #setIfdBaseType(IfdBaseKind)
     * @generated
     */
    void unsetIfdBaseType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineDetailed#getIfdBaseType <em>Ifd Base Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ifd Base Type</em>' attribute is set.
     * @see #unsetIfdBaseType()
     * @see #getIfdBaseType()
     * @see #setIfdBaseType(IfdBaseKind)
     * @generated
     */
    boolean isSetIfdBaseType();

    /**
     * Returns the value of the '<em><b>Efd Base Ratio</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Ratio (exciter voltage/generator voltage) of <i>Efd</i> bases of exciter and generator models (&gt; 0). Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Efd Base Ratio</em>' attribute.
     * @see #isSetEfdBaseRatio()
     * @see #unsetEfdBaseRatio()
     * @see #setEfdBaseRatio(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachineDetailed_EfdBaseRatio()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='SynchronousMachineDetailed.efdBaseRatio' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getEfdBaseRatio();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineDetailed#getEfdBaseRatio <em>Efd Base Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Efd Base Ratio</em>' attribute.
     * @see #isSetEfdBaseRatio()
     * @see #unsetEfdBaseRatio()
     * @see #getEfdBaseRatio()
     * @generated
     */
    void setEfdBaseRatio( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineDetailed#getEfdBaseRatio <em>Efd Base Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEfdBaseRatio()
     * @see #getEfdBaseRatio()
     * @see #setEfdBaseRatio(Double)
     * @generated
     */
    void unsetEfdBaseRatio();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineDetailed#getEfdBaseRatio <em>Efd Base Ratio</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Efd Base Ratio</em>' attribute is set.
     * @see #unsetEfdBaseRatio()
     * @see #getEfdBaseRatio()
     * @see #setEfdBaseRatio(Double)
     * @generated
     */
    boolean isSetEfdBaseRatio();

    /**
     * Returns the value of the '<em><b>Saturation Factor120 QAxis</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Quadrature-axis saturation factor at 120% of rated terminal voltage (<i>S12q</i>) (&gt;= SynchonousMachineDetailed.saturationFactorQAxis).  Typical value = 0,12.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Saturation Factor120 QAxis</em>' attribute.
     * @see #isSetSaturationFactor120QAxis()
     * @see #unsetSaturationFactor120QAxis()
     * @see #setSaturationFactor120QAxis(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachineDetailed_SaturationFactor120QAxis()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='SynchronousMachineDetailed.saturationFactor120QAxis' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getSaturationFactor120QAxis();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineDetailed#getSaturationFactor120QAxis <em>Saturation Factor120 QAxis</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Saturation Factor120 QAxis</em>' attribute.
     * @see #isSetSaturationFactor120QAxis()
     * @see #unsetSaturationFactor120QAxis()
     * @see #getSaturationFactor120QAxis()
     * @generated
     */
    void setSaturationFactor120QAxis( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineDetailed#getSaturationFactor120QAxis <em>Saturation Factor120 QAxis</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSaturationFactor120QAxis()
     * @see #getSaturationFactor120QAxis()
     * @see #setSaturationFactor120QAxis(Double)
     * @generated
     */
    void unsetSaturationFactor120QAxis();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineDetailed#getSaturationFactor120QAxis <em>Saturation Factor120 QAxis</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Saturation Factor120 QAxis</em>' attribute is set.
     * @see #unsetSaturationFactor120QAxis()
     * @see #getSaturationFactor120QAxis()
     * @see #setSaturationFactor120QAxis(Double)
     * @generated
     */
    boolean isSetSaturationFactor120QAxis();

    /**
     * Returns the value of the '<em><b>Saturation Factor QAxis</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Quadrature-axis saturation factor at rated terminal voltage (<i>S1q</i>) (&gt;= 0). Typical value = 0,02.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Saturation Factor QAxis</em>' attribute.
     * @see #isSetSaturationFactorQAxis()
     * @see #unsetSaturationFactorQAxis()
     * @see #setSaturationFactorQAxis(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachineDetailed_SaturationFactorQAxis()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='SynchronousMachineDetailed.saturationFactorQAxis' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getSaturationFactorQAxis();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineDetailed#getSaturationFactorQAxis <em>Saturation Factor QAxis</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Saturation Factor QAxis</em>' attribute.
     * @see #isSetSaturationFactorQAxis()
     * @see #unsetSaturationFactorQAxis()
     * @see #getSaturationFactorQAxis()
     * @generated
     */
    void setSaturationFactorQAxis( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineDetailed#getSaturationFactorQAxis <em>Saturation Factor QAxis</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSaturationFactorQAxis()
     * @see #getSaturationFactorQAxis()
     * @see #setSaturationFactorQAxis(Double)
     * @generated
     */
    void unsetSaturationFactorQAxis();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineDetailed#getSaturationFactorQAxis <em>Saturation Factor QAxis</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Saturation Factor QAxis</em>' attribute is set.
     * @see #unsetSaturationFactorQAxis()
     * @see #getSaturationFactorQAxis()
     * @see #setSaturationFactorQAxis(Double)
     * @generated
     */
    boolean isSetSaturationFactorQAxis();

} // SynchronousMachineDetailed

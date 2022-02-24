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

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Network Injection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents the external network and it is used for IEC 60909 calculations.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getMaxQ <em>Max Q</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getMaxP <em>Max P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getGovernorSCD <em>Governor SCD</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getMinQ <em>Min Q</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getMinP <em>Min P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getMaxZ0ToZ1Ratio <em>Max Z0 To Z1 Ratio</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getMinR1ToX1Ratio <em>Min R1 To X1 Ratio</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getMinR0ToX0Ratio <em>Min R0 To X0 Ratio</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getIkSecond <em>Ik Second</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getMinZ0ToZ1Ratio <em>Min Z0 To Z1 Ratio</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getMaxR1ToX1Ratio <em>Max R1 To X1 Ratio</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getVoltageFactor <em>Voltage Factor</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getMaxInitialSymShCCurrent <em>Max Initial Sym Sh CCurrent</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getMinInitialSymShCCurrent <em>Min Initial Sym Sh CCurrent</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getMaxR0ToX0Ratio <em>Max R0 To X0 Ratio</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getReferencePriority <em>Reference Priority</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getP <em>P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getQ <em>Q</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExternalNetworkInjection()
 * @model
 * @generated
 */
public interface ExternalNetworkInjection extends RegulatingCondEq {
    /**
     * Returns the value of the '<em><b>Max Q</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum reactive power limit. It is used for modelling of infeed for load flow exchange and not for short circuit modelling.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Max Q</em>' attribute.
     * @see #isSetMaxQ()
     * @see #unsetMaxQ()
     * @see #setMaxQ(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExternalNetworkInjection_MaxQ()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ReactivePower" transient="true" ordered="false"
     *        extendedMetaData="name='ExternalNetworkInjection.maxQ' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getMaxQ();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getMaxQ <em>Max Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Q</em>' attribute.
     * @see #isSetMaxQ()
     * @see #unsetMaxQ()
     * @see #getMaxQ()
     * @generated
     */
    void setMaxQ( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getMaxQ <em>Max Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaxQ()
     * @see #getMaxQ()
     * @see #setMaxQ(Double)
     * @generated
     */
    void unsetMaxQ();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getMaxQ <em>Max Q</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max Q</em>' attribute is set.
     * @see #unsetMaxQ()
     * @see #getMaxQ()
     * @see #setMaxQ(Double)
     * @generated
     */
    boolean isSetMaxQ();

    /**
     * Returns the value of the '<em><b>Max P</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum active power of the injection.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Max P</em>' attribute.
     * @see #isSetMaxP()
     * @see #unsetMaxP()
     * @see #setMaxP(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExternalNetworkInjection_MaxP()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ActivePower" transient="true" ordered="false"
     *        extendedMetaData="name='ExternalNetworkInjection.maxP' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getMaxP();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getMaxP <em>Max P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max P</em>' attribute.
     * @see #isSetMaxP()
     * @see #unsetMaxP()
     * @see #getMaxP()
     * @generated
     */
    void setMaxP( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getMaxP <em>Max P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaxP()
     * @see #getMaxP()
     * @see #setMaxP(Double)
     * @generated
     */
    void unsetMaxP();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getMaxP <em>Max P</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max P</em>' attribute is set.
     * @see #unsetMaxP()
     * @see #getMaxP()
     * @see #setMaxP(Double)
     * @generated
     */
    boolean isSetMaxP();

    /**
     * Returns the value of the '<em><b>Min P</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum active power of the injection.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Min P</em>' attribute.
     * @see #isSetMinP()
     * @see #unsetMinP()
     * @see #setMinP(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExternalNetworkInjection_MinP()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ActivePower" transient="true" ordered="false"
     *        extendedMetaData="name='ExternalNetworkInjection.minP' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getMinP();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getMinP <em>Min P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min P</em>' attribute.
     * @see #isSetMinP()
     * @see #unsetMinP()
     * @see #getMinP()
     * @generated
     */
    void setMinP( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getMinP <em>Min P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMinP()
     * @see #getMinP()
     * @see #setMinP(Double)
     * @generated
     */
    void unsetMinP();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getMinP <em>Min P</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Min P</em>' attribute is set.
     * @see #unsetMinP()
     * @see #getMinP()
     * @see #setMinP(Double)
     * @generated
     */
    boolean isSetMinP();

    /**
     * Returns the value of the '<em><b>Max Z0 To Z1 Ratio</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum ratio of zero sequence impedance to its positive sequence impedance (Z(0)/Z(1) max). Used for short circuit data exchange according to IEC 60909.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Max Z0 To Z1 Ratio</em>' attribute.
     * @see #isSetMaxZ0ToZ1Ratio()
     * @see #unsetMaxZ0ToZ1Ratio()
     * @see #setMaxZ0ToZ1Ratio(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExternalNetworkInjection_MaxZ0ToZ1Ratio()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='ExternalNetworkInjection.maxZ0ToZ1Ratio' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getMaxZ0ToZ1Ratio();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getMaxZ0ToZ1Ratio <em>Max Z0 To Z1 Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Z0 To Z1 Ratio</em>' attribute.
     * @see #isSetMaxZ0ToZ1Ratio()
     * @see #unsetMaxZ0ToZ1Ratio()
     * @see #getMaxZ0ToZ1Ratio()
     * @generated
     */
    void setMaxZ0ToZ1Ratio( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getMaxZ0ToZ1Ratio <em>Max Z0 To Z1 Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaxZ0ToZ1Ratio()
     * @see #getMaxZ0ToZ1Ratio()
     * @see #setMaxZ0ToZ1Ratio(Double)
     * @generated
     */
    void unsetMaxZ0ToZ1Ratio();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getMaxZ0ToZ1Ratio <em>Max Z0 To Z1 Ratio</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max Z0 To Z1 Ratio</em>' attribute is set.
     * @see #unsetMaxZ0ToZ1Ratio()
     * @see #getMaxZ0ToZ1Ratio()
     * @see #setMaxZ0ToZ1Ratio(Double)
     * @generated
     */
    boolean isSetMaxZ0ToZ1Ratio();

    /**
     * Returns the value of the '<em><b>Min R1 To X1 Ratio</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum ratio of positive sequence resistance of Network Feeder to its positive sequence reactance (R(1)/X(1) min). Used for short circuit data exchange according to IEC 60909.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Min R1 To X1 Ratio</em>' attribute.
     * @see #isSetMinR1ToX1Ratio()
     * @see #unsetMinR1ToX1Ratio()
     * @see #setMinR1ToX1Ratio(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExternalNetworkInjection_MinR1ToX1Ratio()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='ExternalNetworkInjection.minR1ToX1Ratio' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getMinR1ToX1Ratio();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getMinR1ToX1Ratio <em>Min R1 To X1 Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min R1 To X1 Ratio</em>' attribute.
     * @see #isSetMinR1ToX1Ratio()
     * @see #unsetMinR1ToX1Ratio()
     * @see #getMinR1ToX1Ratio()
     * @generated
     */
    void setMinR1ToX1Ratio( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getMinR1ToX1Ratio <em>Min R1 To X1 Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMinR1ToX1Ratio()
     * @see #getMinR1ToX1Ratio()
     * @see #setMinR1ToX1Ratio(Double)
     * @generated
     */
    void unsetMinR1ToX1Ratio();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getMinR1ToX1Ratio <em>Min R1 To X1 Ratio</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Min R1 To X1 Ratio</em>' attribute is set.
     * @see #unsetMinR1ToX1Ratio()
     * @see #getMinR1ToX1Ratio()
     * @see #setMinR1ToX1Ratio(Double)
     * @generated
     */
    boolean isSetMinR1ToX1Ratio();

    /**
     * Returns the value of the '<em><b>Min R0 To X0 Ratio</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Indicates whether initial symmetrical short-circuit current and power have been calculated according to IEC (Ik"). Used for short circuit data exchange according to IEC 6090.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Min R0 To X0 Ratio</em>' attribute.
     * @see #isSetMinR0ToX0Ratio()
     * @see #unsetMinR0ToX0Ratio()
     * @see #setMinR0ToX0Ratio(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExternalNetworkInjection_MinR0ToX0Ratio()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='ExternalNetworkInjection.minR0ToX0Ratio' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getMinR0ToX0Ratio();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getMinR0ToX0Ratio <em>Min R0 To X0 Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min R0 To X0 Ratio</em>' attribute.
     * @see #isSetMinR0ToX0Ratio()
     * @see #unsetMinR0ToX0Ratio()
     * @see #getMinR0ToX0Ratio()
     * @generated
     */
    void setMinR0ToX0Ratio( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getMinR0ToX0Ratio <em>Min R0 To X0 Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMinR0ToX0Ratio()
     * @see #getMinR0ToX0Ratio()
     * @see #setMinR0ToX0Ratio(Double)
     * @generated
     */
    void unsetMinR0ToX0Ratio();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getMinR0ToX0Ratio <em>Min R0 To X0 Ratio</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Min R0 To X0 Ratio</em>' attribute is set.
     * @see #unsetMinR0ToX0Ratio()
     * @see #getMinR0ToX0Ratio()
     * @see #setMinR0ToX0Ratio(Double)
     * @generated
     */
    boolean isSetMinR0ToX0Ratio();

    /**
     * Returns the value of the '<em><b>Ik Second</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Indicates whether initial symmetrical short-circuit current and power have been calculated according to IEC (Ik").  Used only if short circuit calculations are done according to superposition method.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ik Second</em>' attribute.
     * @see #isSetIkSecond()
     * @see #unsetIkSecond()
     * @see #setIkSecond(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExternalNetworkInjection_IkSecond()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='ExternalNetworkInjection.ikSecond' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getIkSecond();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getIkSecond <em>Ik Second</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ik Second</em>' attribute.
     * @see #isSetIkSecond()
     * @see #unsetIkSecond()
     * @see #getIkSecond()
     * @generated
     */
    void setIkSecond( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getIkSecond <em>Ik Second</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIkSecond()
     * @see #getIkSecond()
     * @see #setIkSecond(Boolean)
     * @generated
     */
    void unsetIkSecond();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getIkSecond <em>Ik Second</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ik Second</em>' attribute is set.
     * @see #unsetIkSecond()
     * @see #getIkSecond()
     * @see #setIkSecond(Boolean)
     * @generated
     */
    boolean isSetIkSecond();

    /**
     * Returns the value of the '<em><b>Min Z0 To Z1 Ratio</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum ratio of zero sequence impedance to its positive sequence impedance (Z(0)/Z(1) min). Used for short circuit data exchange according to IEC 60909.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Min Z0 To Z1 Ratio</em>' attribute.
     * @see #isSetMinZ0ToZ1Ratio()
     * @see #unsetMinZ0ToZ1Ratio()
     * @see #setMinZ0ToZ1Ratio(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExternalNetworkInjection_MinZ0ToZ1Ratio()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='ExternalNetworkInjection.minZ0ToZ1Ratio' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getMinZ0ToZ1Ratio();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getMinZ0ToZ1Ratio <em>Min Z0 To Z1 Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min Z0 To Z1 Ratio</em>' attribute.
     * @see #isSetMinZ0ToZ1Ratio()
     * @see #unsetMinZ0ToZ1Ratio()
     * @see #getMinZ0ToZ1Ratio()
     * @generated
     */
    void setMinZ0ToZ1Ratio( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getMinZ0ToZ1Ratio <em>Min Z0 To Z1 Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMinZ0ToZ1Ratio()
     * @see #getMinZ0ToZ1Ratio()
     * @see #setMinZ0ToZ1Ratio(Double)
     * @generated
     */
    void unsetMinZ0ToZ1Ratio();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getMinZ0ToZ1Ratio <em>Min Z0 To Z1 Ratio</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Min Z0 To Z1 Ratio</em>' attribute is set.
     * @see #unsetMinZ0ToZ1Ratio()
     * @see #getMinZ0ToZ1Ratio()
     * @see #setMinZ0ToZ1Ratio(Double)
     * @generated
     */
    boolean isSetMinZ0ToZ1Ratio();

    /**
     * Returns the value of the '<em><b>Max R1 To X1 Ratio</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum ratio of positive sequence resistance of Network Feeder to its positive sequence reactance (R(1)/X(1) max). Used for short circuit data exchange according to IEC 60909.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Max R1 To X1 Ratio</em>' attribute.
     * @see #isSetMaxR1ToX1Ratio()
     * @see #unsetMaxR1ToX1Ratio()
     * @see #setMaxR1ToX1Ratio(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExternalNetworkInjection_MaxR1ToX1Ratio()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='ExternalNetworkInjection.maxR1ToX1Ratio' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getMaxR1ToX1Ratio();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getMaxR1ToX1Ratio <em>Max R1 To X1 Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max R1 To X1 Ratio</em>' attribute.
     * @see #isSetMaxR1ToX1Ratio()
     * @see #unsetMaxR1ToX1Ratio()
     * @see #getMaxR1ToX1Ratio()
     * @generated
     */
    void setMaxR1ToX1Ratio( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getMaxR1ToX1Ratio <em>Max R1 To X1 Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaxR1ToX1Ratio()
     * @see #getMaxR1ToX1Ratio()
     * @see #setMaxR1ToX1Ratio(Double)
     * @generated
     */
    void unsetMaxR1ToX1Ratio();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getMaxR1ToX1Ratio <em>Max R1 To X1 Ratio</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max R1 To X1 Ratio</em>' attribute is set.
     * @see #unsetMaxR1ToX1Ratio()
     * @see #getMaxR1ToX1Ratio()
     * @see #setMaxR1ToX1Ratio(Double)
     * @generated
     */
    boolean isSetMaxR1ToX1Ratio();

    /**
     * Returns the value of the '<em><b>Voltage Factor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Voltage factor in pu, which was used to calculate short-circuit current Ik" and power Sk".  Used only if short circuit calculations are done according to superposition method.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Voltage Factor</em>' attribute.
     * @see #isSetVoltageFactor()
     * @see #unsetVoltageFactor()
     * @see #setVoltageFactor(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExternalNetworkInjection_VoltageFactor()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExternalNetworkInjection.voltageFactor' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVoltageFactor();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getVoltageFactor <em>Voltage Factor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Voltage Factor</em>' attribute.
     * @see #isSetVoltageFactor()
     * @see #unsetVoltageFactor()
     * @see #getVoltageFactor()
     * @generated
     */
    void setVoltageFactor( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getVoltageFactor <em>Voltage Factor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVoltageFactor()
     * @see #getVoltageFactor()
     * @see #setVoltageFactor(Double)
     * @generated
     */
    void unsetVoltageFactor();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getVoltageFactor <em>Voltage Factor</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Voltage Factor</em>' attribute is set.
     * @see #unsetVoltageFactor()
     * @see #getVoltageFactor()
     * @see #setVoltageFactor(Double)
     * @generated
     */
    boolean isSetVoltageFactor();

    /**
     * Returns the value of the '<em><b>Max Initial Sym Sh CCurrent</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     *   Maximum initial symmetrical short-circuit currents (Ik" max) in A (Ik" = Sk"/(SQRT(3) Un)). Used for short circuit data exchange according to IEC 60909.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Max Initial Sym Sh CCurrent</em>' attribute.
     * @see #isSetMaxInitialSymShCCurrent()
     * @see #unsetMaxInitialSymShCCurrent()
     * @see #setMaxInitialSymShCCurrent(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExternalNetworkInjection_MaxInitialSymShCCurrent()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CurrentFlow" transient="true" ordered="false"
     *        extendedMetaData="name='ExternalNetworkInjection.maxInitialSymShCCurrent' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getMaxInitialSymShCCurrent();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getMaxInitialSymShCCurrent <em>Max Initial Sym Sh CCurrent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Initial Sym Sh CCurrent</em>' attribute.
     * @see #isSetMaxInitialSymShCCurrent()
     * @see #unsetMaxInitialSymShCCurrent()
     * @see #getMaxInitialSymShCCurrent()
     * @generated
     */
    void setMaxInitialSymShCCurrent( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getMaxInitialSymShCCurrent <em>Max Initial Sym Sh CCurrent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaxInitialSymShCCurrent()
     * @see #getMaxInitialSymShCCurrent()
     * @see #setMaxInitialSymShCCurrent(Double)
     * @generated
     */
    void unsetMaxInitialSymShCCurrent();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getMaxInitialSymShCCurrent <em>Max Initial Sym Sh CCurrent</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max Initial Sym Sh CCurrent</em>' attribute is set.
     * @see #unsetMaxInitialSymShCCurrent()
     * @see #getMaxInitialSymShCCurrent()
     * @see #setMaxInitialSymShCCurrent(Double)
     * @generated
     */
    boolean isSetMaxInitialSymShCCurrent();

    /**
     * Returns the value of the '<em><b>Min Initial Sym Sh CCurrent</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum initial symmetrical short-circuit currents (Ik" min) in A (Ik" = Sk"/(SQRT(3) Un)). Used for short circuit data exchange according to IEC 60909.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Min Initial Sym Sh CCurrent</em>' attribute.
     * @see #isSetMinInitialSymShCCurrent()
     * @see #unsetMinInitialSymShCCurrent()
     * @see #setMinInitialSymShCCurrent(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExternalNetworkInjection_MinInitialSymShCCurrent()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CurrentFlow" transient="true" ordered="false"
     *        extendedMetaData="name='ExternalNetworkInjection.minInitialSymShCCurrent' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getMinInitialSymShCCurrent();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getMinInitialSymShCCurrent <em>Min Initial Sym Sh CCurrent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min Initial Sym Sh CCurrent</em>' attribute.
     * @see #isSetMinInitialSymShCCurrent()
     * @see #unsetMinInitialSymShCCurrent()
     * @see #getMinInitialSymShCCurrent()
     * @generated
     */
    void setMinInitialSymShCCurrent( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getMinInitialSymShCCurrent <em>Min Initial Sym Sh CCurrent</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMinInitialSymShCCurrent()
     * @see #getMinInitialSymShCCurrent()
     * @see #setMinInitialSymShCCurrent(Double)
     * @generated
     */
    void unsetMinInitialSymShCCurrent();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getMinInitialSymShCCurrent <em>Min Initial Sym Sh CCurrent</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Min Initial Sym Sh CCurrent</em>' attribute is set.
     * @see #unsetMinInitialSymShCCurrent()
     * @see #getMinInitialSymShCCurrent()
     * @see #setMinInitialSymShCCurrent(Double)
     * @generated
     */
    boolean isSetMinInitialSymShCCurrent();

    /**
     * Returns the value of the '<em><b>Max R0 To X0 Ratio</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum ratio of zero sequence resistance of Network Feeder to its zero sequence reactance (R(0)/X(0) max). Used for short circuit data exchange according to IEC 60909.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Max R0 To X0 Ratio</em>' attribute.
     * @see #isSetMaxR0ToX0Ratio()
     * @see #unsetMaxR0ToX0Ratio()
     * @see #setMaxR0ToX0Ratio(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExternalNetworkInjection_MaxR0ToX0Ratio()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='ExternalNetworkInjection.maxR0ToX0Ratio' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getMaxR0ToX0Ratio();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getMaxR0ToX0Ratio <em>Max R0 To X0 Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max R0 To X0 Ratio</em>' attribute.
     * @see #isSetMaxR0ToX0Ratio()
     * @see #unsetMaxR0ToX0Ratio()
     * @see #getMaxR0ToX0Ratio()
     * @generated
     */
    void setMaxR0ToX0Ratio( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getMaxR0ToX0Ratio <em>Max R0 To X0 Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaxR0ToX0Ratio()
     * @see #getMaxR0ToX0Ratio()
     * @see #setMaxR0ToX0Ratio(Double)
     * @generated
     */
    void unsetMaxR0ToX0Ratio();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getMaxR0ToX0Ratio <em>Max R0 To X0 Ratio</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max R0 To X0 Ratio</em>' attribute is set.
     * @see #unsetMaxR0ToX0Ratio()
     * @see #getMaxR0ToX0Ratio()
     * @see #setMaxR0ToX0Ratio(Double)
     * @generated
     */
    boolean isSetMaxR0ToX0Ratio();

    /**
     * Returns the value of the '<em><b>Reference Priority</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Priority of unit for use as powerflow voltage phase angle reference bus selection. 0 = don t care (default) 1 = highest priority. 2 is less than 1 and so on.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Reference Priority</em>' attribute.
     * @see #isSetReferencePriority()
     * @see #unsetReferencePriority()
     * @see #setReferencePriority(BigInteger)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExternalNetworkInjection_ReferencePriority()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Integer" transient="true" ordered="false"
     *        extendedMetaData="name='ExternalNetworkInjection.referencePriority' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    BigInteger getReferencePriority();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getReferencePriority <em>Reference Priority</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reference Priority</em>' attribute.
     * @see #isSetReferencePriority()
     * @see #unsetReferencePriority()
     * @see #getReferencePriority()
     * @generated
     */
    void setReferencePriority( BigInteger value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getReferencePriority <em>Reference Priority</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReferencePriority()
     * @see #getReferencePriority()
     * @see #setReferencePriority(BigInteger)
     * @generated
     */
    void unsetReferencePriority();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getReferencePriority <em>Reference Priority</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Reference Priority</em>' attribute is set.
     * @see #unsetReferencePriority()
     * @see #getReferencePriority()
     * @see #setReferencePriority(BigInteger)
     * @generated
     */
    boolean isSetReferencePriority();

    /**
     * Returns the value of the '<em><b>P</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Active power injection. Load sign convention is used, i.e. positive sign means flow out from a node.
     * Starting value for steady state solutions.
     * <!-- end-model-doc -->
     * @return the value of the '<em>P</em>' attribute.
     * @see #isSetP()
     * @see #unsetP()
     * @see #setP(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExternalNetworkInjection_P()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ActivePower" transient="true" ordered="false"
     *        extendedMetaData="name='ExternalNetworkInjection.p' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getP();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getP <em>P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>P</em>' attribute.
     * @see #isSetP()
     * @see #unsetP()
     * @see #getP()
     * @generated
     */
    void setP( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getP <em>P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetP()
     * @see #getP()
     * @see #setP(Double)
     * @generated
     */
    void unsetP();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getP <em>P</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>P</em>' attribute is set.
     * @see #unsetP()
     * @see #getP()
     * @see #setP(Double)
     * @generated
     */
    boolean isSetP();

    /**
     * Returns the value of the '<em><b>Q</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reactive power injection. Load sign convention is used, i.e. positive sign means flow out from a node.
     * Starting value for steady state solutions.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Q</em>' attribute.
     * @see #isSetQ()
     * @see #unsetQ()
     * @see #setQ(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExternalNetworkInjection_Q()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ReactivePower" transient="true" ordered="false"
     *        extendedMetaData="name='ExternalNetworkInjection.q' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getQ();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getQ <em>Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Q</em>' attribute.
     * @see #isSetQ()
     * @see #unsetQ()
     * @see #getQ()
     * @generated
     */
    void setQ( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getQ <em>Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQ()
     * @see #getQ()
     * @see #setQ(Double)
     * @generated
     */
    void unsetQ();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getQ <em>Q</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Q</em>' attribute is set.
     * @see #unsetQ()
     * @see #getQ()
     * @see #setQ(Double)
     * @generated
     */
    boolean isSetQ();

    /**
     * Returns the value of the '<em><b>Min Q</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum reactive power limit. It is used for modelling of infeed for load flow exchange and not for short circuit modelling.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Min Q</em>' attribute.
     * @see #isSetMinQ()
     * @see #unsetMinQ()
     * @see #setMinQ(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExternalNetworkInjection_MinQ()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ReactivePower" transient="true" ordered="false"
     *        extendedMetaData="name='ExternalNetworkInjection.minQ' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getMinQ();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getMinQ <em>Min Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min Q</em>' attribute.
     * @see #isSetMinQ()
     * @see #unsetMinQ()
     * @see #getMinQ()
     * @generated
     */
    void setMinQ( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getMinQ <em>Min Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMinQ()
     * @see #getMinQ()
     * @see #setMinQ(Double)
     * @generated
     */
    void unsetMinQ();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getMinQ <em>Min Q</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Min Q</em>' attribute is set.
     * @see #unsetMinQ()
     * @see #getMinQ()
     * @see #setMinQ(Double)
     * @generated
     */
    boolean isSetMinQ();

    /**
     * Returns the value of the '<em><b>Governor SCD</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Power Frequency Bias. This is the change in power injection divided by the change in frequency and negated.  A positive value of the power frequency bias provides additional power injection upon a drop in frequency.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Governor SCD</em>' attribute.
     * @see #isSetGovernorSCD()
     * @see #unsetGovernorSCD()
     * @see #setGovernorSCD(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExternalNetworkInjection_GovernorSCD()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ActivePowerPerFrequency" transient="true" ordered="false"
     *        extendedMetaData="name='ExternalNetworkInjection.governorSCD' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getGovernorSCD();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getGovernorSCD <em>Governor SCD</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Governor SCD</em>' attribute.
     * @see #isSetGovernorSCD()
     * @see #unsetGovernorSCD()
     * @see #getGovernorSCD()
     * @generated
     */
    void setGovernorSCD( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getGovernorSCD <em>Governor SCD</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGovernorSCD()
     * @see #getGovernorSCD()
     * @see #setGovernorSCD(Double)
     * @generated
     */
    void unsetGovernorSCD();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExternalNetworkInjection#getGovernorSCD <em>Governor SCD</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Governor SCD</em>' attribute is set.
     * @see #unsetGovernorSCD()
     * @see #getGovernorSCD()
     * @see #setGovernorSCD(Double)
     * @generated
     */
    boolean isSetGovernorSCD();

} // ExternalNetworkInjection

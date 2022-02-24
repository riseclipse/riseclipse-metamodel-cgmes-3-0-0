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
 * A representation of the model object '<em><b>Equivalent Injection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents equivalent injections (generation or load).  Voltage regulation is allowed only at the point of connection.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getMaxP <em>Max P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getMaxQ <em>Max Q</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getReactiveCapabilityCurve <em>Reactive Capability Curve</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getMinP <em>Min P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getMinQ <em>Min Q</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getRegulationCapability <em>Regulation Capability</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getX2 <em>X2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getX0 <em>X0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getR <em>R</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getX <em>X</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getR2 <em>R2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getR0 <em>R0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getP <em>P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getQ <em>Q</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getRegulationStatus <em>Regulation Status</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getRegulationTarget <em>Regulation Target</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEquivalentInjection()
 * @model
 * @generated
 */
public interface EquivalentInjection extends EquivalentEquipment {
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEquivalentInjection_MinP()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ActivePower" transient="true" ordered="false"
     *        extendedMetaData="name='EquivalentInjection.minP' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getMinP();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getMinP <em>Min P</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getMinP <em>Min P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMinP()
     * @see #getMinP()
     * @see #setMinP(Double)
     * @generated
     */
    void unsetMinP();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getMinP <em>Min P</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Regulation Capability</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Specifies whether or not the EquivalentInjection has the capability to regulate the local voltage. If true the EquivalentInjection can regulate. If false the EquivalentInjection cannot regulate. ReactiveCapabilityCurve can only be associated with EquivalentInjection  if the flag is true.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Regulation Capability</em>' attribute.
     * @see #isSetRegulationCapability()
     * @see #unsetRegulationCapability()
     * @see #setRegulationCapability(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEquivalentInjection_RegulationCapability()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='EquivalentInjection.regulationCapability' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getRegulationCapability();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getRegulationCapability <em>Regulation Capability</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Regulation Capability</em>' attribute.
     * @see #isSetRegulationCapability()
     * @see #unsetRegulationCapability()
     * @see #getRegulationCapability()
     * @generated
     */
    void setRegulationCapability( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getRegulationCapability <em>Regulation Capability</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRegulationCapability()
     * @see #getRegulationCapability()
     * @see #setRegulationCapability(Boolean)
     * @generated
     */
    void unsetRegulationCapability();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getRegulationCapability <em>Regulation Capability</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Regulation Capability</em>' attribute is set.
     * @see #unsetRegulationCapability()
     * @see #getRegulationCapability()
     * @see #setRegulationCapability(Boolean)
     * @generated
     */
    boolean isSetRegulationCapability();

    /**
     * Returns the value of the '<em><b>X2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Negative sequence reactance. Used to represent Extended-Ward (IEC 60909).
     * Usage : Extended-Ward is a result of network reduction prior to the data exchange.
     * <!-- end-model-doc -->
     * @return the value of the '<em>X2</em>' attribute.
     * @see #isSetX2()
     * @see #unsetX2()
     * @see #setX2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEquivalentInjection_X2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Reactance" transient="true" ordered="false"
     *        extendedMetaData="name='EquivalentInjection.x2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getX2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getX2 <em>X2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>X2</em>' attribute.
     * @see #isSetX2()
     * @see #unsetX2()
     * @see #getX2()
     * @generated
     */
    void setX2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getX2 <em>X2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetX2()
     * @see #getX2()
     * @see #setX2(Double)
     * @generated
     */
    void unsetX2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getX2 <em>X2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>X2</em>' attribute is set.
     * @see #unsetX2()
     * @see #getX2()
     * @see #setX2(Double)
     * @generated
     */
    boolean isSetX2();

    /**
     * Returns the value of the '<em><b>X0</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Zero sequence reactance. Used to represent Extended-Ward (IEC 60909).
     * Usage : Extended-Ward is a result of network reduction prior to the data exchange.
     * <!-- end-model-doc -->
     * @return the value of the '<em>X0</em>' attribute.
     * @see #isSetX0()
     * @see #unsetX0()
     * @see #setX0(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEquivalentInjection_X0()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Reactance" transient="true" ordered="false"
     *        extendedMetaData="name='EquivalentInjection.x0' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getX0();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getX0 <em>X0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>X0</em>' attribute.
     * @see #isSetX0()
     * @see #unsetX0()
     * @see #getX0()
     * @generated
     */
    void setX0( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getX0 <em>X0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetX0()
     * @see #getX0()
     * @see #setX0(Double)
     * @generated
     */
    void unsetX0();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getX0 <em>X0</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>X0</em>' attribute is set.
     * @see #unsetX0()
     * @see #getX0()
     * @see #setX0(Double)
     * @generated
     */
    boolean isSetX0();

    /**
     * Returns the value of the '<em><b>R</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Positive sequence resistance. Used to represent Extended-Ward (IEC 60909).
     * Usage : Extended-Ward is a result of network reduction prior to the data exchange.
     * <!-- end-model-doc -->
     * @return the value of the '<em>R</em>' attribute.
     * @see #isSetR()
     * @see #unsetR()
     * @see #setR(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEquivalentInjection_R()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Resistance" transient="true" ordered="false"
     *        extendedMetaData="name='EquivalentInjection.r' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getR();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getR <em>R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>R</em>' attribute.
     * @see #isSetR()
     * @see #unsetR()
     * @see #getR()
     * @generated
     */
    void setR( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getR <em>R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetR()
     * @see #getR()
     * @see #setR(Double)
     * @generated
     */
    void unsetR();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getR <em>R</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>R</em>' attribute is set.
     * @see #unsetR()
     * @see #getR()
     * @see #setR(Double)
     * @generated
     */
    boolean isSetR();

    /**
     * Returns the value of the '<em><b>X</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Positive sequence reactance. Used to represent Extended-Ward (IEC 60909).
     * Usage : Extended-Ward is a result of network reduction prior to the data exchange.
     * <!-- end-model-doc -->
     * @return the value of the '<em>X</em>' attribute.
     * @see #isSetX()
     * @see #unsetX()
     * @see #setX(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEquivalentInjection_X()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Reactance" transient="true" ordered="false"
     *        extendedMetaData="name='EquivalentInjection.x' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getX();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getX <em>X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>X</em>' attribute.
     * @see #isSetX()
     * @see #unsetX()
     * @see #getX()
     * @generated
     */
    void setX( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getX <em>X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetX()
     * @see #getX()
     * @see #setX(Double)
     * @generated
     */
    void unsetX();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getX <em>X</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>X</em>' attribute is set.
     * @see #unsetX()
     * @see #getX()
     * @see #setX(Double)
     * @generated
     */
    boolean isSetX();

    /**
     * Returns the value of the '<em><b>R2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Negative sequence resistance. Used to represent Extended-Ward (IEC 60909).
     * Usage : Extended-Ward is a result of network reduction prior to the data exchange.
     * <!-- end-model-doc -->
     * @return the value of the '<em>R2</em>' attribute.
     * @see #isSetR2()
     * @see #unsetR2()
     * @see #setR2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEquivalentInjection_R2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Resistance" transient="true" ordered="false"
     *        extendedMetaData="name='EquivalentInjection.r2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getR2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getR2 <em>R2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>R2</em>' attribute.
     * @see #isSetR2()
     * @see #unsetR2()
     * @see #getR2()
     * @generated
     */
    void setR2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getR2 <em>R2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetR2()
     * @see #getR2()
     * @see #setR2(Double)
     * @generated
     */
    void unsetR2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getR2 <em>R2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>R2</em>' attribute is set.
     * @see #unsetR2()
     * @see #getR2()
     * @see #setR2(Double)
     * @generated
     */
    boolean isSetR2();

    /**
     * Returns the value of the '<em><b>R0</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Zero sequence resistance. Used to represent Extended-Ward (IEC 60909).
     * Usage : Extended-Ward is a result of network reduction prior to the data exchange.
     * <!-- end-model-doc -->
     * @return the value of the '<em>R0</em>' attribute.
     * @see #isSetR0()
     * @see #unsetR0()
     * @see #setR0(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEquivalentInjection_R0()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Resistance" transient="true" ordered="false"
     *        extendedMetaData="name='EquivalentInjection.r0' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getR0();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getR0 <em>R0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>R0</em>' attribute.
     * @see #isSetR0()
     * @see #unsetR0()
     * @see #getR0()
     * @generated
     */
    void setR0( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getR0 <em>R0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetR0()
     * @see #getR0()
     * @see #setR0(Double)
     * @generated
     */
    void unsetR0();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getR0 <em>R0</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>R0</em>' attribute is set.
     * @see #unsetR0()
     * @see #getR0()
     * @see #setR0(Double)
     * @generated
     */
    boolean isSetR0();

    /**
     * Returns the value of the '<em><b>P</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Equivalent active power injection. Load sign convention is used, i.e. positive sign means flow out from a node.
     * Starting value for steady state solutions.
     * <!-- end-model-doc -->
     * @return the value of the '<em>P</em>' attribute.
     * @see #isSetP()
     * @see #unsetP()
     * @see #setP(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEquivalentInjection_P()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ActivePower" transient="true" ordered="false"
     *        extendedMetaData="name='EquivalentInjection.p' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getP();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getP <em>P</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getP <em>P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetP()
     * @see #getP()
     * @see #setP(Double)
     * @generated
     */
    void unsetP();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getP <em>P</em>}' attribute is set.
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
     * Equivalent reactive power injection. Load sign convention is used, i.e. positive sign means flow out from a node.
     * Starting value for steady state solutions.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Q</em>' attribute.
     * @see #isSetQ()
     * @see #unsetQ()
     * @see #setQ(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEquivalentInjection_Q()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ReactivePower" transient="true" ordered="false"
     *        extendedMetaData="name='EquivalentInjection.q' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getQ();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getQ <em>Q</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getQ <em>Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQ()
     * @see #getQ()
     * @see #setQ(Double)
     * @generated
     */
    void unsetQ();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getQ <em>Q</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Regulation Status</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Specifies the regulation status of the EquivalentInjection.  True is regulating.  False is not regulating.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Regulation Status</em>' attribute.
     * @see #isSetRegulationStatus()
     * @see #unsetRegulationStatus()
     * @see #setRegulationStatus(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEquivalentInjection_RegulationStatus()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='EquivalentInjection.regulationStatus' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getRegulationStatus();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getRegulationStatus <em>Regulation Status</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Regulation Status</em>' attribute.
     * @see #isSetRegulationStatus()
     * @see #unsetRegulationStatus()
     * @see #getRegulationStatus()
     * @generated
     */
    void setRegulationStatus( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getRegulationStatus <em>Regulation Status</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRegulationStatus()
     * @see #getRegulationStatus()
     * @see #setRegulationStatus(Boolean)
     * @generated
     */
    void unsetRegulationStatus();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getRegulationStatus <em>Regulation Status</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Regulation Status</em>' attribute is set.
     * @see #unsetRegulationStatus()
     * @see #getRegulationStatus()
     * @see #setRegulationStatus(Boolean)
     * @generated
     */
    boolean isSetRegulationStatus();

    /**
     * Returns the value of the '<em><b>Regulation Target</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The target voltage for voltage regulation. The attribute shall be a positive value.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Regulation Target</em>' attribute.
     * @see #isSetRegulationTarget()
     * @see #unsetRegulationTarget()
     * @see #setRegulationTarget(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEquivalentInjection_RegulationTarget()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Voltage" transient="true" ordered="false"
     *        extendedMetaData="name='EquivalentInjection.regulationTarget' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getRegulationTarget();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getRegulationTarget <em>Regulation Target</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Regulation Target</em>' attribute.
     * @see #isSetRegulationTarget()
     * @see #unsetRegulationTarget()
     * @see #getRegulationTarget()
     * @generated
     */
    void setRegulationTarget( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getRegulationTarget <em>Regulation Target</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRegulationTarget()
     * @see #getRegulationTarget()
     * @see #setRegulationTarget(Double)
     * @generated
     */
    void unsetRegulationTarget();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getRegulationTarget <em>Regulation Target</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Regulation Target</em>' attribute is set.
     * @see #unsetRegulationTarget()
     * @see #getRegulationTarget()
     * @see #setRegulationTarget(Double)
     * @generated
     */
    boolean isSetRegulationTarget();

    /**
     * Returns the value of the '<em><b>Min Q</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum reactive power of the injection.  Used for modelling of infeed for load flow exchange. Not used for short circuit modelling.  If maxQ and minQ are not used ReactiveCapabilityCurve can be used.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Min Q</em>' attribute.
     * @see #isSetMinQ()
     * @see #unsetMinQ()
     * @see #setMinQ(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEquivalentInjection_MinQ()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ReactivePower" transient="true" ordered="false"
     *        extendedMetaData="name='EquivalentInjection.minQ' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getMinQ();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getMinQ <em>Min Q</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getMinQ <em>Min Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMinQ()
     * @see #getMinQ()
     * @see #setMinQ(Double)
     * @generated
     */
    void unsetMinQ();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getMinQ <em>Min Q</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Reactive Capability Curve</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ReactiveCapabilityCurve#getEquivalentInjection <em>Equivalent Injection</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The reactive capability curve used by this equivalent injection.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Reactive Capability Curve</em>' reference.
     * @see #isSetReactiveCapabilityCurve()
     * @see #unsetReactiveCapabilityCurve()
     * @see #setReactiveCapabilityCurve(ReactiveCapabilityCurve)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEquivalentInjection_ReactiveCapabilityCurve()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ReactiveCapabilityCurve#getEquivalentInjection
     * @model opposite="EquivalentInjection" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='EquivalentInjection.ReactiveCapabilityCurve' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    ReactiveCapabilityCurve getReactiveCapabilityCurve();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getReactiveCapabilityCurve <em>Reactive Capability Curve</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reactive Capability Curve</em>' reference.
     * @see #isSetReactiveCapabilityCurve()
     * @see #unsetReactiveCapabilityCurve()
     * @see #getReactiveCapabilityCurve()
     * @generated
     */
    void setReactiveCapabilityCurve( ReactiveCapabilityCurve value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getReactiveCapabilityCurve <em>Reactive Capability Curve</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReactiveCapabilityCurve()
     * @see #getReactiveCapabilityCurve()
     * @see #setReactiveCapabilityCurve(ReactiveCapabilityCurve)
     * @generated
     */
    void unsetReactiveCapabilityCurve();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getReactiveCapabilityCurve <em>Reactive Capability Curve</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Reactive Capability Curve</em>' reference is set.
     * @see #unsetReactiveCapabilityCurve()
     * @see #getReactiveCapabilityCurve()
     * @see #setReactiveCapabilityCurve(ReactiveCapabilityCurve)
     * @generated
     */
    boolean isSetReactiveCapabilityCurve();

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
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEquivalentInjection_MaxP()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ActivePower" transient="true" ordered="false"
     *        extendedMetaData="name='EquivalentInjection.maxP' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getMaxP();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getMaxP <em>Max P</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getMaxP <em>Max P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaxP()
     * @see #getMaxP()
     * @see #setMaxP(Double)
     * @generated
     */
    void unsetMaxP();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getMaxP <em>Max P</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Max Q</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum reactive power of the injection.  Used for modelling of infeed for load flow exchange. Not used for short circuit modelling.  If maxQ and minQ are not used ReactiveCapabilityCurve can be used.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Max Q</em>' attribute.
     * @see #isSetMaxQ()
     * @see #unsetMaxQ()
     * @see #setMaxQ(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEquivalentInjection_MaxQ()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ReactivePower" transient="true" ordered="false"
     *        extendedMetaData="name='EquivalentInjection.maxQ' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getMaxQ();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getMaxQ <em>Max Q</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getMaxQ <em>Max Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaxQ()
     * @see #getMaxQ()
     * @see #setMaxQ(Double)
     * @generated
     */
    void unsetMaxQ();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentInjection#getMaxQ <em>Max Q</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max Q</em>' attribute is set.
     * @see #unsetMaxQ()
     * @see #getMaxQ()
     * @see #setMaxQ(Double)
     * @generated
     */
    boolean isSetMaxQ();

} // EquivalentInjection

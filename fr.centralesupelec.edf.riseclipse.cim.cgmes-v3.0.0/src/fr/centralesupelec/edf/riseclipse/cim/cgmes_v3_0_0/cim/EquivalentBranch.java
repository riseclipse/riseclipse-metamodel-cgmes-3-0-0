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
 * A representation of the model object '<em><b>Equivalent Branch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The class represents equivalent branches. In cases where a transformer phase shift is modelled and the EquivalentBranch is spanning the same nodes, the impedance quantities for the EquivalentBranch shall consider the needed phase shift.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch#getR21 <em>R21</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch#getX <em>X</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch#getX21 <em>X21</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch#getR <em>R</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch#getNegativeR21 <em>Negative R21</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch#getNegativeR12 <em>Negative R12</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch#getZeroR21 <em>Zero R21</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch#getZeroR12 <em>Zero R12</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch#getNegativeX21 <em>Negative X21</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch#getPositiveR12 <em>Positive R12</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch#getNegativeX12 <em>Negative X12</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch#getPositiveX12 <em>Positive X12</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch#getPositiveR21 <em>Positive R21</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch#getPositiveX21 <em>Positive X21</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch#getZeroX21 <em>Zero X21</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch#getZeroX12 <em>Zero X12</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEquivalentBranch()
 * @model
 * @generated
 */
public interface EquivalentBranch extends EquivalentEquipment {
    /**
     * Returns the value of the '<em><b>R</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Positive sequence series resistance of the reduced branch.
     * <!-- end-model-doc -->
     * @return the value of the '<em>R</em>' attribute.
     * @see #isSetR()
     * @see #unsetR()
     * @see #setR(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEquivalentBranch_R()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Resistance" transient="true" ordered="false"
     *        extendedMetaData="name='EquivalentBranch.r' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getR();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch#getR <em>R</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch#getR <em>R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetR()
     * @see #getR()
     * @see #setR(Double)
     * @generated
     */
    void unsetR();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch#getR <em>R</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Negative R21</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Negative sequence series resistance from terminal sequence 2 to terminal sequence 1. Used for short circuit data exchange according to IEC 60909.
     * EquivalentBranch is a result of network reduction prior to the data exchange.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Negative R21</em>' attribute.
     * @see #isSetNegativeR21()
     * @see #unsetNegativeR21()
     * @see #setNegativeR21(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEquivalentBranch_NegativeR21()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Resistance" transient="true" ordered="false"
     *        extendedMetaData="name='EquivalentBranch.negativeR21' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getNegativeR21();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch#getNegativeR21 <em>Negative R21</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Negative R21</em>' attribute.
     * @see #isSetNegativeR21()
     * @see #unsetNegativeR21()
     * @see #getNegativeR21()
     * @generated
     */
    void setNegativeR21( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch#getNegativeR21 <em>Negative R21</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNegativeR21()
     * @see #getNegativeR21()
     * @see #setNegativeR21(Double)
     * @generated
     */
    void unsetNegativeR21();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch#getNegativeR21 <em>Negative R21</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Negative R21</em>' attribute is set.
     * @see #unsetNegativeR21()
     * @see #getNegativeR21()
     * @see #setNegativeR21(Double)
     * @generated
     */
    boolean isSetNegativeR21();

    /**
     * Returns the value of the '<em><b>Negative R12</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Negative sequence series resistance from terminal sequence  1 to terminal sequence 2. Used for short circuit data exchange according to IEC 60909.
     * EquivalentBranch is a result of network reduction prior to the data exchange.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Negative R12</em>' attribute.
     * @see #isSetNegativeR12()
     * @see #unsetNegativeR12()
     * @see #setNegativeR12(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEquivalentBranch_NegativeR12()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Resistance" transient="true" ordered="false"
     *        extendedMetaData="name='EquivalentBranch.negativeR12' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getNegativeR12();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch#getNegativeR12 <em>Negative R12</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Negative R12</em>' attribute.
     * @see #isSetNegativeR12()
     * @see #unsetNegativeR12()
     * @see #getNegativeR12()
     * @generated
     */
    void setNegativeR12( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch#getNegativeR12 <em>Negative R12</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNegativeR12()
     * @see #getNegativeR12()
     * @see #setNegativeR12(Double)
     * @generated
     */
    void unsetNegativeR12();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch#getNegativeR12 <em>Negative R12</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Negative R12</em>' attribute is set.
     * @see #unsetNegativeR12()
     * @see #getNegativeR12()
     * @see #setNegativeR12(Double)
     * @generated
     */
    boolean isSetNegativeR12();

    /**
     * Returns the value of the '<em><b>Zero R21</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Zero sequence series resistance from terminal sequence  2 to terminal sequence 1. Used for short circuit data exchange according to IEC 60909.
     * Usage : EquivalentBranch is a result of network reduction prior to the data exchange.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Zero R21</em>' attribute.
     * @see #isSetZeroR21()
     * @see #unsetZeroR21()
     * @see #setZeroR21(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEquivalentBranch_ZeroR21()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Resistance" transient="true" ordered="false"
     *        extendedMetaData="name='EquivalentBranch.zeroR21' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getZeroR21();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch#getZeroR21 <em>Zero R21</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Zero R21</em>' attribute.
     * @see #isSetZeroR21()
     * @see #unsetZeroR21()
     * @see #getZeroR21()
     * @generated
     */
    void setZeroR21( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch#getZeroR21 <em>Zero R21</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetZeroR21()
     * @see #getZeroR21()
     * @see #setZeroR21(Double)
     * @generated
     */
    void unsetZeroR21();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch#getZeroR21 <em>Zero R21</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Zero R21</em>' attribute is set.
     * @see #unsetZeroR21()
     * @see #getZeroR21()
     * @see #setZeroR21(Double)
     * @generated
     */
    boolean isSetZeroR21();

    /**
     * Returns the value of the '<em><b>Zero R12</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Zero sequence series resistance from terminal sequence  1 to terminal sequence 2. Used for short circuit data exchange according to IEC 60909.
     * EquivalentBranch is a result of network reduction prior to the data exchange.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Zero R12</em>' attribute.
     * @see #isSetZeroR12()
     * @see #unsetZeroR12()
     * @see #setZeroR12(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEquivalentBranch_ZeroR12()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Resistance" transient="true" ordered="false"
     *        extendedMetaData="name='EquivalentBranch.zeroR12' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getZeroR12();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch#getZeroR12 <em>Zero R12</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Zero R12</em>' attribute.
     * @see #isSetZeroR12()
     * @see #unsetZeroR12()
     * @see #getZeroR12()
     * @generated
     */
    void setZeroR12( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch#getZeroR12 <em>Zero R12</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetZeroR12()
     * @see #getZeroR12()
     * @see #setZeroR12(Double)
     * @generated
     */
    void unsetZeroR12();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch#getZeroR12 <em>Zero R12</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Zero R12</em>' attribute is set.
     * @see #unsetZeroR12()
     * @see #getZeroR12()
     * @see #setZeroR12(Double)
     * @generated
     */
    boolean isSetZeroR12();

    /**
     * Returns the value of the '<em><b>Negative X21</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Negative sequence series reactance from terminal sequence 2 to terminal sequence 1. Used for short circuit data exchange according to IEC 60909.
     * Usage: EquivalentBranch is a result of network reduction prior to the data exchange.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Negative X21</em>' attribute.
     * @see #isSetNegativeX21()
     * @see #unsetNegativeX21()
     * @see #setNegativeX21(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEquivalentBranch_NegativeX21()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Reactance" transient="true" ordered="false"
     *        extendedMetaData="name='EquivalentBranch.negativeX21' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getNegativeX21();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch#getNegativeX21 <em>Negative X21</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Negative X21</em>' attribute.
     * @see #isSetNegativeX21()
     * @see #unsetNegativeX21()
     * @see #getNegativeX21()
     * @generated
     */
    void setNegativeX21( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch#getNegativeX21 <em>Negative X21</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNegativeX21()
     * @see #getNegativeX21()
     * @see #setNegativeX21(Double)
     * @generated
     */
    void unsetNegativeX21();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch#getNegativeX21 <em>Negative X21</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Negative X21</em>' attribute is set.
     * @see #unsetNegativeX21()
     * @see #getNegativeX21()
     * @see #setNegativeX21(Double)
     * @generated
     */
    boolean isSetNegativeX21();

    /**
     * Returns the value of the '<em><b>Positive R12</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Positive sequence series resistance from terminal sequence  1 to terminal sequence 2 . Used for short circuit data exchange according to IEC 60909.
     * EquivalentBranch is a result of network reduction prior to the data exchange.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Positive R12</em>' attribute.
     * @see #isSetPositiveR12()
     * @see #unsetPositiveR12()
     * @see #setPositiveR12(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEquivalentBranch_PositiveR12()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Resistance" transient="true" ordered="false"
     *        extendedMetaData="name='EquivalentBranch.positiveR12' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPositiveR12();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch#getPositiveR12 <em>Positive R12</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Positive R12</em>' attribute.
     * @see #isSetPositiveR12()
     * @see #unsetPositiveR12()
     * @see #getPositiveR12()
     * @generated
     */
    void setPositiveR12( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch#getPositiveR12 <em>Positive R12</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPositiveR12()
     * @see #getPositiveR12()
     * @see #setPositiveR12(Double)
     * @generated
     */
    void unsetPositiveR12();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch#getPositiveR12 <em>Positive R12</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Positive R12</em>' attribute is set.
     * @see #unsetPositiveR12()
     * @see #getPositiveR12()
     * @see #setPositiveR12(Double)
     * @generated
     */
    boolean isSetPositiveR12();

    /**
     * Returns the value of the '<em><b>Negative X12</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Negative sequence series reactance from terminal sequence  1 to terminal sequence 2. Used for short circuit data exchange according to IEC 60909.
     * Usage : EquivalentBranch is a result of network reduction prior to the data exchange.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Negative X12</em>' attribute.
     * @see #isSetNegativeX12()
     * @see #unsetNegativeX12()
     * @see #setNegativeX12(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEquivalentBranch_NegativeX12()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Reactance" transient="true" ordered="false"
     *        extendedMetaData="name='EquivalentBranch.negativeX12' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getNegativeX12();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch#getNegativeX12 <em>Negative X12</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Negative X12</em>' attribute.
     * @see #isSetNegativeX12()
     * @see #unsetNegativeX12()
     * @see #getNegativeX12()
     * @generated
     */
    void setNegativeX12( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch#getNegativeX12 <em>Negative X12</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNegativeX12()
     * @see #getNegativeX12()
     * @see #setNegativeX12(Double)
     * @generated
     */
    void unsetNegativeX12();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch#getNegativeX12 <em>Negative X12</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Negative X12</em>' attribute is set.
     * @see #unsetNegativeX12()
     * @see #getNegativeX12()
     * @see #setNegativeX12(Double)
     * @generated
     */
    boolean isSetNegativeX12();

    /**
     * Returns the value of the '<em><b>Positive X12</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Positive sequence series reactance from terminal sequence  1 to terminal sequence 2. Used for short circuit data exchange according to IEC 60909.
     * Usage : EquivalentBranch is a result of network reduction prior to the data exchange.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Positive X12</em>' attribute.
     * @see #isSetPositiveX12()
     * @see #unsetPositiveX12()
     * @see #setPositiveX12(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEquivalentBranch_PositiveX12()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Reactance" transient="true" ordered="false"
     *        extendedMetaData="name='EquivalentBranch.positiveX12' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPositiveX12();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch#getPositiveX12 <em>Positive X12</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Positive X12</em>' attribute.
     * @see #isSetPositiveX12()
     * @see #unsetPositiveX12()
     * @see #getPositiveX12()
     * @generated
     */
    void setPositiveX12( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch#getPositiveX12 <em>Positive X12</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPositiveX12()
     * @see #getPositiveX12()
     * @see #setPositiveX12(Double)
     * @generated
     */
    void unsetPositiveX12();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch#getPositiveX12 <em>Positive X12</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Positive X12</em>' attribute is set.
     * @see #unsetPositiveX12()
     * @see #getPositiveX12()
     * @see #setPositiveX12(Double)
     * @generated
     */
    boolean isSetPositiveX12();

    /**
     * Returns the value of the '<em><b>Positive R21</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Positive sequence series resistance from terminal sequence 2 to terminal sequence 1. Used for short circuit data exchange according to IEC 60909.
     * EquivalentBranch is a result of network reduction prior to the data exchange.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Positive R21</em>' attribute.
     * @see #isSetPositiveR21()
     * @see #unsetPositiveR21()
     * @see #setPositiveR21(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEquivalentBranch_PositiveR21()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Resistance" transient="true" ordered="false"
     *        extendedMetaData="name='EquivalentBranch.positiveR21' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPositiveR21();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch#getPositiveR21 <em>Positive R21</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Positive R21</em>' attribute.
     * @see #isSetPositiveR21()
     * @see #unsetPositiveR21()
     * @see #getPositiveR21()
     * @generated
     */
    void setPositiveR21( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch#getPositiveR21 <em>Positive R21</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPositiveR21()
     * @see #getPositiveR21()
     * @see #setPositiveR21(Double)
     * @generated
     */
    void unsetPositiveR21();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch#getPositiveR21 <em>Positive R21</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Positive R21</em>' attribute is set.
     * @see #unsetPositiveR21()
     * @see #getPositiveR21()
     * @see #setPositiveR21(Double)
     * @generated
     */
    boolean isSetPositiveR21();

    /**
     * Returns the value of the '<em><b>Positive X21</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Positive sequence series reactance from terminal sequence 2 to terminal sequence 1. Used for short circuit data exchange according to IEC 60909.
     * Usage : EquivalentBranch is a result of network reduction prior to the data exchange.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Positive X21</em>' attribute.
     * @see #isSetPositiveX21()
     * @see #unsetPositiveX21()
     * @see #setPositiveX21(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEquivalentBranch_PositiveX21()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Reactance" transient="true" ordered="false"
     *        extendedMetaData="name='EquivalentBranch.positiveX21' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPositiveX21();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch#getPositiveX21 <em>Positive X21</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Positive X21</em>' attribute.
     * @see #isSetPositiveX21()
     * @see #unsetPositiveX21()
     * @see #getPositiveX21()
     * @generated
     */
    void setPositiveX21( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch#getPositiveX21 <em>Positive X21</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPositiveX21()
     * @see #getPositiveX21()
     * @see #setPositiveX21(Double)
     * @generated
     */
    void unsetPositiveX21();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch#getPositiveX21 <em>Positive X21</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Positive X21</em>' attribute is set.
     * @see #unsetPositiveX21()
     * @see #getPositiveX21()
     * @see #setPositiveX21(Double)
     * @generated
     */
    boolean isSetPositiveX21();

    /**
     * Returns the value of the '<em><b>Zero X21</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Zero sequence series reactance from terminal sequence 2 to terminal sequence 1. Used for short circuit data exchange according to IEC 60909.
     * Usage : EquivalentBranch is a result of network reduction prior to the data exchange.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Zero X21</em>' attribute.
     * @see #isSetZeroX21()
     * @see #unsetZeroX21()
     * @see #setZeroX21(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEquivalentBranch_ZeroX21()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Reactance" transient="true" ordered="false"
     *        extendedMetaData="name='EquivalentBranch.zeroX21' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getZeroX21();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch#getZeroX21 <em>Zero X21</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Zero X21</em>' attribute.
     * @see #isSetZeroX21()
     * @see #unsetZeroX21()
     * @see #getZeroX21()
     * @generated
     */
    void setZeroX21( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch#getZeroX21 <em>Zero X21</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetZeroX21()
     * @see #getZeroX21()
     * @see #setZeroX21(Double)
     * @generated
     */
    void unsetZeroX21();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch#getZeroX21 <em>Zero X21</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Zero X21</em>' attribute is set.
     * @see #unsetZeroX21()
     * @see #getZeroX21()
     * @see #setZeroX21(Double)
     * @generated
     */
    boolean isSetZeroX21();

    /**
     * Returns the value of the '<em><b>Zero X12</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Zero sequence series reactance from terminal sequence  1 to terminal sequence 2. Used for short circuit data exchange according to IEC 60909.
     * Usage : EquivalentBranch is a result of network reduction prior to the data exchange.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Zero X12</em>' attribute.
     * @see #isSetZeroX12()
     * @see #unsetZeroX12()
     * @see #setZeroX12(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEquivalentBranch_ZeroX12()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Reactance" transient="true" ordered="false"
     *        extendedMetaData="name='EquivalentBranch.zeroX12' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getZeroX12();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch#getZeroX12 <em>Zero X12</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Zero X12</em>' attribute.
     * @see #isSetZeroX12()
     * @see #unsetZeroX12()
     * @see #getZeroX12()
     * @generated
     */
    void setZeroX12( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch#getZeroX12 <em>Zero X12</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetZeroX12()
     * @see #getZeroX12()
     * @see #setZeroX12(Double)
     * @generated
     */
    void unsetZeroX12();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch#getZeroX12 <em>Zero X12</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Zero X12</em>' attribute is set.
     * @see #unsetZeroX12()
     * @see #getZeroX12()
     * @see #setZeroX12(Double)
     * @generated
     */
    boolean isSetZeroX12();

    /**
     * Returns the value of the '<em><b>X</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Positive sequence series reactance of the reduced branch.
     * <!-- end-model-doc -->
     * @return the value of the '<em>X</em>' attribute.
     * @see #isSetX()
     * @see #unsetX()
     * @see #setX(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEquivalentBranch_X()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Reactance" transient="true" ordered="false"
     *        extendedMetaData="name='EquivalentBranch.x' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getX();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch#getX <em>X</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch#getX <em>X</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetX()
     * @see #getX()
     * @see #setX(Double)
     * @generated
     */
    void unsetX();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch#getX <em>X</em>}' attribute is set.
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
     * Returns the value of the '<em><b>X21</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reactance from terminal sequence 2 to terminal sequence 1. Used for steady state power flow. This attribute is optional and represents an unbalanced network such as off-nominal phase shifter. If only EquivalentBranch.x is given, then EquivalentBranch.x21 is assumed equal to EquivalentBranch.x.
     * Usage rule: EquivalentBranch is a result of network reduction prior to the data exchange.
     * <!-- end-model-doc -->
     * @return the value of the '<em>X21</em>' attribute.
     * @see #isSetX21()
     * @see #unsetX21()
     * @see #setX21(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEquivalentBranch_X21()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Reactance" transient="true" ordered="false"
     *        extendedMetaData="name='EquivalentBranch.x21' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getX21();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch#getX21 <em>X21</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>X21</em>' attribute.
     * @see #isSetX21()
     * @see #unsetX21()
     * @see #getX21()
     * @generated
     */
    void setX21( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch#getX21 <em>X21</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetX21()
     * @see #getX21()
     * @see #setX21(Double)
     * @generated
     */
    void unsetX21();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch#getX21 <em>X21</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>X21</em>' attribute is set.
     * @see #unsetX21()
     * @see #getX21()
     * @see #setX21(Double)
     * @generated
     */
    boolean isSetX21();

    /**
     * Returns the value of the '<em><b>R21</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Resistance from terminal sequence 2 to terminal sequence 1 .Used for steady state power flow. This attribute is optional and represent unbalanced network such as off-nominal phase shifter. If only EquivalentBranch.r is given, then EquivalentBranch.r21 is assumed equal to EquivalentBranch.r.
     * Usage rule : EquivalentBranch is a result of network reduction prior to the data exchange.
     * <!-- end-model-doc -->
     * @return the value of the '<em>R21</em>' attribute.
     * @see #isSetR21()
     * @see #unsetR21()
     * @see #setR21(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEquivalentBranch_R21()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Resistance" transient="true" ordered="false"
     *        extendedMetaData="name='EquivalentBranch.r21' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getR21();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch#getR21 <em>R21</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>R21</em>' attribute.
     * @see #isSetR21()
     * @see #unsetR21()
     * @see #getR21()
     * @generated
     */
    void setR21( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch#getR21 <em>R21</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetR21()
     * @see #getR21()
     * @see #setR21(Double)
     * @generated
     */
    void unsetR21();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EquivalentBranch#getR21 <em>R21</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>R21</em>' attribute is set.
     * @see #unsetR21()
     * @see #getR21()
     * @see #setR21(Double)
     * @generated
     */
    boolean isSetR21();

} // EquivalentBranch

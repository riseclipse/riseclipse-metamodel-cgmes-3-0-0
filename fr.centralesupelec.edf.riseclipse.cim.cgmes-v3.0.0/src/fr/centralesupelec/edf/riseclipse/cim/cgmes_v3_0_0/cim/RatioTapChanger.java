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
 * A representation of the model object '<em><b>Ratio Tap Changer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A tap changer that changes the voltage ratio impacting the voltage magnitude but not the phase angle across the transformer.
 *
 * Angle sign convention (general): Positive value indicates a positive phase shift from the winding where the tap is located to the other winding (for a two-winding transformer).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RatioTapChanger#getTransformerEnd <em>Transformer End</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RatioTapChanger#getStepVoltageIncrement <em>Step Voltage Increment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RatioTapChanger#getRatioTapChangerTable <em>Ratio Tap Changer Table</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getRatioTapChanger()
 * @model
 * @generated
 */
public interface RatioTapChanger extends TapChanger {
    /**
     * Returns the value of the '<em><b>Step Voltage Increment</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Tap step increment, in per cent of rated voltage of the power transformer end, per step position.
     * When the increment is negative, the voltage decreases when the tap step increases.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Step Voltage Increment</em>' attribute.
     * @see #isSetStepVoltageIncrement()
     * @see #unsetStepVoltageIncrement()
     * @see #setStepVoltageIncrement(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getRatioTapChanger_StepVoltageIncrement()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PerCent" transient="true" ordered="false"
     *        extendedMetaData="name='RatioTapChanger.stepVoltageIncrement' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getStepVoltageIncrement();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RatioTapChanger#getStepVoltageIncrement <em>Step Voltage Increment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Step Voltage Increment</em>' attribute.
     * @see #isSetStepVoltageIncrement()
     * @see #unsetStepVoltageIncrement()
     * @see #getStepVoltageIncrement()
     * @generated
     */
    void setStepVoltageIncrement( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RatioTapChanger#getStepVoltageIncrement <em>Step Voltage Increment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStepVoltageIncrement()
     * @see #getStepVoltageIncrement()
     * @see #setStepVoltageIncrement(Double)
     * @generated
     */
    void unsetStepVoltageIncrement();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RatioTapChanger#getStepVoltageIncrement <em>Step Voltage Increment</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Step Voltage Increment</em>' attribute is set.
     * @see #unsetStepVoltageIncrement()
     * @see #getStepVoltageIncrement()
     * @see #setStepVoltageIncrement(Double)
     * @generated
     */
    boolean isSetStepVoltageIncrement();

    /**
     * Returns the value of the '<em><b>Transformer End</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TransformerEnd#getRatioTapChanger <em>Ratio Tap Changer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Transformer end to which this ratio tap changer belongs.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Transformer End</em>' reference.
     * @see #isSetTransformerEnd()
     * @see #unsetTransformerEnd()
     * @see #setTransformerEnd(TransformerEnd)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getRatioTapChanger_TransformerEnd()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TransformerEnd#getRatioTapChanger
     * @model opposite="RatioTapChanger" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='RatioTapChanger.TransformerEnd' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    TransformerEnd getTransformerEnd();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RatioTapChanger#getTransformerEnd <em>Transformer End</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Transformer End</em>' reference.
     * @see #isSetTransformerEnd()
     * @see #unsetTransformerEnd()
     * @see #getTransformerEnd()
     * @generated
     */
    void setTransformerEnd( TransformerEnd value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RatioTapChanger#getTransformerEnd <em>Transformer End</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTransformerEnd()
     * @see #getTransformerEnd()
     * @see #setTransformerEnd(TransformerEnd)
     * @generated
     */
    void unsetTransformerEnd();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RatioTapChanger#getTransformerEnd <em>Transformer End</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Transformer End</em>' reference is set.
     * @see #unsetTransformerEnd()
     * @see #getTransformerEnd()
     * @see #setTransformerEnd(TransformerEnd)
     * @generated
     */
    boolean isSetTransformerEnd();

    /**
     * Returns the value of the '<em><b>Ratio Tap Changer Table</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RatioTapChangerTable#getRatioTapChanger <em>Ratio Tap Changer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The tap ratio table for this ratio  tap changer.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ratio Tap Changer Table</em>' reference.
     * @see #isSetRatioTapChangerTable()
     * @see #unsetRatioTapChangerTable()
     * @see #setRatioTapChangerTable(RatioTapChangerTable)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getRatioTapChanger_RatioTapChangerTable()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RatioTapChangerTable#getRatioTapChanger
     * @model opposite="RatioTapChanger" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='RatioTapChanger.RatioTapChangerTable' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    RatioTapChangerTable getRatioTapChangerTable();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RatioTapChanger#getRatioTapChangerTable <em>Ratio Tap Changer Table</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ratio Tap Changer Table</em>' reference.
     * @see #isSetRatioTapChangerTable()
     * @see #unsetRatioTapChangerTable()
     * @see #getRatioTapChangerTable()
     * @generated
     */
    void setRatioTapChangerTable( RatioTapChangerTable value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RatioTapChanger#getRatioTapChangerTable <em>Ratio Tap Changer Table</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRatioTapChangerTable()
     * @see #getRatioTapChangerTable()
     * @see #setRatioTapChangerTable(RatioTapChangerTable)
     * @generated
     */
    void unsetRatioTapChangerTable();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RatioTapChanger#getRatioTapChangerTable <em>Ratio Tap Changer Table</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ratio Tap Changer Table</em>' reference is set.
     * @see #unsetRatioTapChangerTable()
     * @see #getRatioTapChangerTable()
     * @see #setRatioTapChangerTable(RatioTapChangerTable)
     * @generated
     */
    boolean isSetRatioTapChangerTable();

} // RatioTapChanger

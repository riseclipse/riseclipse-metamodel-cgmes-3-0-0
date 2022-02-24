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
 * A representation of the model object '<em><b>Wind Dynamics Lookup Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Look up table for the purpose of wind standard models.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getWindContRotorRIEC <em>Wind Cont Rotor RIEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getLookupTableFunctionType <em>Lookup Table Function Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getOutput <em>Output</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getWindContCurrLimIEC <em>Wind Cont Curr Lim IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getWindPitchContPowerIEC <em>Wind Pitch Cont Power IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getWindContPType3IEC <em>Wind Cont PType3 IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getInput <em>Input</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getWindContQPQULimIEC <em>Wind Cont QPQU Lim IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getSequence <em>Sequence</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getWindPlantReactiveControlIEC <em>Wind Plant Reactive Control IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getWindProtectionIEC <em>Wind Protection IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getWindGenType3bIEC <em>Wind Gen Type3b IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getWindPlantFreqPcontrolIEC <em>Wind Plant Freq Pcontrol IEC</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindDynamicsLookupTable()
 * @model
 * @generated
 */
public interface WindDynamicsLookupTable extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Wind Cont Rotor RIEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContRotorRIEC#getWindDynamicsLookupTable <em>Wind Dynamics Lookup Table</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The rotor resistance control model with which this wind dynamics lookup table is associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wind Cont Rotor RIEC</em>' reference.
     * @see #isSetWindContRotorRIEC()
     * @see #unsetWindContRotorRIEC()
     * @see #setWindContRotorRIEC(WindContRotorRIEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindDynamicsLookupTable_WindContRotorRIEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContRotorRIEC#getWindDynamicsLookupTable
     * @model opposite="WindDynamicsLookupTable" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='WindDynamicsLookupTable.WindContRotorRIEC' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    WindContRotorRIEC getWindContRotorRIEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getWindContRotorRIEC <em>Wind Cont Rotor RIEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Cont Rotor RIEC</em>' reference.
     * @see #isSetWindContRotorRIEC()
     * @see #unsetWindContRotorRIEC()
     * @see #getWindContRotorRIEC()
     * @generated
     */
    void setWindContRotorRIEC( WindContRotorRIEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getWindContRotorRIEC <em>Wind Cont Rotor RIEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindContRotorRIEC()
     * @see #getWindContRotorRIEC()
     * @see #setWindContRotorRIEC(WindContRotorRIEC)
     * @generated
     */
    void unsetWindContRotorRIEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getWindContRotorRIEC <em>Wind Cont Rotor RIEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Cont Rotor RIEC</em>' reference is set.
     * @see #unsetWindContRotorRIEC()
     * @see #getWindContRotorRIEC()
     * @see #setWindContRotorRIEC(WindContRotorRIEC)
     * @generated
     */
    boolean isSetWindContRotorRIEC();

    /**
     * Returns the value of the '<em><b>Lookup Table Function Type</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindLookupTableFunctionKind}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Type of the lookup table function.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Lookup Table Function Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindLookupTableFunctionKind
     * @see #isSetLookupTableFunctionType()
     * @see #unsetLookupTableFunctionType()
     * @see #setLookupTableFunctionType(WindLookupTableFunctionKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindDynamicsLookupTable_LookupTableFunctionType()
     * @model unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='WindDynamicsLookupTable.lookupTableFunctionType' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    WindLookupTableFunctionKind getLookupTableFunctionType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getLookupTableFunctionType <em>Lookup Table Function Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lookup Table Function Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindLookupTableFunctionKind
     * @see #isSetLookupTableFunctionType()
     * @see #unsetLookupTableFunctionType()
     * @see #getLookupTableFunctionType()
     * @generated
     */
    void setLookupTableFunctionType( WindLookupTableFunctionKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getLookupTableFunctionType <em>Lookup Table Function Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLookupTableFunctionType()
     * @see #getLookupTableFunctionType()
     * @see #setLookupTableFunctionType(WindLookupTableFunctionKind)
     * @generated
     */
    void unsetLookupTableFunctionType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getLookupTableFunctionType <em>Lookup Table Function Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Lookup Table Function Type</em>' attribute is set.
     * @see #unsetLookupTableFunctionType()
     * @see #getLookupTableFunctionType()
     * @see #setLookupTableFunctionType(WindLookupTableFunctionKind)
     * @generated
     */
    boolean isSetLookupTableFunctionType();

    /**
     * Returns the value of the '<em><b>Output</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Output value (<i>y</i>) for the lookup table function.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Output</em>' attribute.
     * @see #isSetOutput()
     * @see #unsetOutput()
     * @see #setOutput(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindDynamicsLookupTable_Output()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='WindDynamicsLookupTable.output' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getOutput();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getOutput <em>Output</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Output</em>' attribute.
     * @see #isSetOutput()
     * @see #unsetOutput()
     * @see #getOutput()
     * @generated
     */
    void setOutput( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getOutput <em>Output</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOutput()
     * @see #getOutput()
     * @see #setOutput(Double)
     * @generated
     */
    void unsetOutput();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getOutput <em>Output</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Output</em>' attribute is set.
     * @see #unsetOutput()
     * @see #getOutput()
     * @see #setOutput(Double)
     * @generated
     */
    boolean isSetOutput();

    /**
     * Returns the value of the '<em><b>Wind Cont Curr Lim IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContCurrLimIEC#getWindDynamicsLookupTable <em>Wind Dynamics Lookup Table</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The current control limitation model with which this wind dynamics lookup table is associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wind Cont Curr Lim IEC</em>' reference.
     * @see #isSetWindContCurrLimIEC()
     * @see #unsetWindContCurrLimIEC()
     * @see #setWindContCurrLimIEC(WindContCurrLimIEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindDynamicsLookupTable_WindContCurrLimIEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContCurrLimIEC#getWindDynamicsLookupTable
     * @model opposite="WindDynamicsLookupTable" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='WindDynamicsLookupTable.WindContCurrLimIEC' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    WindContCurrLimIEC getWindContCurrLimIEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getWindContCurrLimIEC <em>Wind Cont Curr Lim IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Cont Curr Lim IEC</em>' reference.
     * @see #isSetWindContCurrLimIEC()
     * @see #unsetWindContCurrLimIEC()
     * @see #getWindContCurrLimIEC()
     * @generated
     */
    void setWindContCurrLimIEC( WindContCurrLimIEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getWindContCurrLimIEC <em>Wind Cont Curr Lim IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindContCurrLimIEC()
     * @see #getWindContCurrLimIEC()
     * @see #setWindContCurrLimIEC(WindContCurrLimIEC)
     * @generated
     */
    void unsetWindContCurrLimIEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getWindContCurrLimIEC <em>Wind Cont Curr Lim IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Cont Curr Lim IEC</em>' reference is set.
     * @see #unsetWindContCurrLimIEC()
     * @see #getWindContCurrLimIEC()
     * @see #setWindContCurrLimIEC(WindContCurrLimIEC)
     * @generated
     */
    boolean isSetWindContCurrLimIEC();

    /**
     * Returns the value of the '<em><b>Wind Pitch Cont Power IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPitchContPowerIEC#getWindDynamicsLookupTable <em>Wind Dynamics Lookup Table</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The pitch control power model with which this wind dynamics lookup table is associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wind Pitch Cont Power IEC</em>' reference.
     * @see #isSetWindPitchContPowerIEC()
     * @see #unsetWindPitchContPowerIEC()
     * @see #setWindPitchContPowerIEC(WindPitchContPowerIEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindDynamicsLookupTable_WindPitchContPowerIEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPitchContPowerIEC#getWindDynamicsLookupTable
     * @model opposite="WindDynamicsLookupTable" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='WindDynamicsLookupTable.WindPitchContPowerIEC' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    WindPitchContPowerIEC getWindPitchContPowerIEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getWindPitchContPowerIEC <em>Wind Pitch Cont Power IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Pitch Cont Power IEC</em>' reference.
     * @see #isSetWindPitchContPowerIEC()
     * @see #unsetWindPitchContPowerIEC()
     * @see #getWindPitchContPowerIEC()
     * @generated
     */
    void setWindPitchContPowerIEC( WindPitchContPowerIEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getWindPitchContPowerIEC <em>Wind Pitch Cont Power IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindPitchContPowerIEC()
     * @see #getWindPitchContPowerIEC()
     * @see #setWindPitchContPowerIEC(WindPitchContPowerIEC)
     * @generated
     */
    void unsetWindPitchContPowerIEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getWindPitchContPowerIEC <em>Wind Pitch Cont Power IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Pitch Cont Power IEC</em>' reference is set.
     * @see #unsetWindPitchContPowerIEC()
     * @see #getWindPitchContPowerIEC()
     * @see #setWindPitchContPowerIEC(WindPitchContPowerIEC)
     * @generated
     */
    boolean isSetWindPitchContPowerIEC();

    /**
     * Returns the value of the '<em><b>Wind Cont PType3 IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getWindDynamicsLookupTable <em>Wind Dynamics Lookup Table</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The P control type 3 model with which this wind dynamics lookup table is associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wind Cont PType3 IEC</em>' reference.
     * @see #isSetWindContPType3IEC()
     * @see #unsetWindContPType3IEC()
     * @see #setWindContPType3IEC(WindContPType3IEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindDynamicsLookupTable_WindContPType3IEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContPType3IEC#getWindDynamicsLookupTable
     * @model opposite="WindDynamicsLookupTable" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='WindDynamicsLookupTable.WindContPType3IEC' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    WindContPType3IEC getWindContPType3IEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getWindContPType3IEC <em>Wind Cont PType3 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Cont PType3 IEC</em>' reference.
     * @see #isSetWindContPType3IEC()
     * @see #unsetWindContPType3IEC()
     * @see #getWindContPType3IEC()
     * @generated
     */
    void setWindContPType3IEC( WindContPType3IEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getWindContPType3IEC <em>Wind Cont PType3 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindContPType3IEC()
     * @see #getWindContPType3IEC()
     * @see #setWindContPType3IEC(WindContPType3IEC)
     * @generated
     */
    void unsetWindContPType3IEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getWindContPType3IEC <em>Wind Cont PType3 IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Cont PType3 IEC</em>' reference is set.
     * @see #unsetWindContPType3IEC()
     * @see #getWindContPType3IEC()
     * @see #setWindContPType3IEC(WindContPType3IEC)
     * @generated
     */
    boolean isSetWindContPType3IEC();

    /**
     * Returns the value of the '<em><b>Input</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Input value (<i>x</i>) for the lookup table function.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Input</em>' attribute.
     * @see #isSetInput()
     * @see #unsetInput()
     * @see #setInput(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindDynamicsLookupTable_Input()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='WindDynamicsLookupTable.input' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getInput();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getInput <em>Input</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Input</em>' attribute.
     * @see #isSetInput()
     * @see #unsetInput()
     * @see #getInput()
     * @generated
     */
    void setInput( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getInput <em>Input</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetInput()
     * @see #getInput()
     * @see #setInput(Double)
     * @generated
     */
    void unsetInput();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getInput <em>Input</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Input</em>' attribute is set.
     * @see #unsetInput()
     * @see #getInput()
     * @see #setInput(Double)
     * @generated
     */
    boolean isSetInput();

    /**
     * Returns the value of the '<em><b>Wind Cont QPQU Lim IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQPQULimIEC#getWindDynamicsLookupTable <em>Wind Dynamics Lookup Table</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The QP and QU limitation model with which this wind dynamics lookup table is associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wind Cont QPQU Lim IEC</em>' reference.
     * @see #isSetWindContQPQULimIEC()
     * @see #unsetWindContQPQULimIEC()
     * @see #setWindContQPQULimIEC(WindContQPQULimIEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindDynamicsLookupTable_WindContQPQULimIEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContQPQULimIEC#getWindDynamicsLookupTable
     * @model opposite="WindDynamicsLookupTable" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='WindDynamicsLookupTable.WindContQPQULimIEC' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    WindContQPQULimIEC getWindContQPQULimIEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getWindContQPQULimIEC <em>Wind Cont QPQU Lim IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Cont QPQU Lim IEC</em>' reference.
     * @see #isSetWindContQPQULimIEC()
     * @see #unsetWindContQPQULimIEC()
     * @see #getWindContQPQULimIEC()
     * @generated
     */
    void setWindContQPQULimIEC( WindContQPQULimIEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getWindContQPQULimIEC <em>Wind Cont QPQU Lim IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindContQPQULimIEC()
     * @see #getWindContQPQULimIEC()
     * @see #setWindContQPQULimIEC(WindContQPQULimIEC)
     * @generated
     */
    void unsetWindContQPQULimIEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getWindContQPQULimIEC <em>Wind Cont QPQU Lim IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Cont QPQU Lim IEC</em>' reference is set.
     * @see #unsetWindContQPQULimIEC()
     * @see #getWindContQPQULimIEC()
     * @see #setWindContQPQULimIEC(WindContQPQULimIEC)
     * @generated
     */
    boolean isSetWindContQPQULimIEC();

    /**
     * Returns the value of the '<em><b>Sequence</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Sequence numbers of the pairs of the input (<i>x</i>) and the output (<i>y</i>) of the lookup table function.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Sequence</em>' attribute.
     * @see #isSetSequence()
     * @see #unsetSequence()
     * @see #setSequence(BigInteger)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindDynamicsLookupTable_Sequence()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Integer" transient="true" ordered="false"
     *        extendedMetaData="name='WindDynamicsLookupTable.sequence' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    BigInteger getSequence();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getSequence <em>Sequence</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sequence</em>' attribute.
     * @see #isSetSequence()
     * @see #unsetSequence()
     * @see #getSequence()
     * @generated
     */
    void setSequence( BigInteger value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getSequence <em>Sequence</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSequence()
     * @see #getSequence()
     * @see #setSequence(BigInteger)
     * @generated
     */
    void unsetSequence();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getSequence <em>Sequence</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sequence</em>' attribute is set.
     * @see #unsetSequence()
     * @see #getSequence()
     * @see #setSequence(BigInteger)
     * @generated
     */
    boolean isSetSequence();

    /**
     * Returns the value of the '<em><b>Wind Plant Reactive Control IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getWindDynamicsLookupTable <em>Wind Dynamics Lookup Table</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The voltage and reactive power wind plant control model with which this wind dynamics lookup table is associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wind Plant Reactive Control IEC</em>' reference.
     * @see #isSetWindPlantReactiveControlIEC()
     * @see #unsetWindPlantReactiveControlIEC()
     * @see #setWindPlantReactiveControlIEC(WindPlantReactiveControlIEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindDynamicsLookupTable_WindPlantReactiveControlIEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getWindDynamicsLookupTable
     * @model opposite="WindDynamicsLookupTable" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='WindDynamicsLookupTable.WindPlantReactiveControlIEC' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    WindPlantReactiveControlIEC getWindPlantReactiveControlIEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getWindPlantReactiveControlIEC <em>Wind Plant Reactive Control IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Plant Reactive Control IEC</em>' reference.
     * @see #isSetWindPlantReactiveControlIEC()
     * @see #unsetWindPlantReactiveControlIEC()
     * @see #getWindPlantReactiveControlIEC()
     * @generated
     */
    void setWindPlantReactiveControlIEC( WindPlantReactiveControlIEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getWindPlantReactiveControlIEC <em>Wind Plant Reactive Control IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindPlantReactiveControlIEC()
     * @see #getWindPlantReactiveControlIEC()
     * @see #setWindPlantReactiveControlIEC(WindPlantReactiveControlIEC)
     * @generated
     */
    void unsetWindPlantReactiveControlIEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getWindPlantReactiveControlIEC <em>Wind Plant Reactive Control IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Plant Reactive Control IEC</em>' reference is set.
     * @see #unsetWindPlantReactiveControlIEC()
     * @see #getWindPlantReactiveControlIEC()
     * @see #setWindPlantReactiveControlIEC(WindPlantReactiveControlIEC)
     * @generated
     */
    boolean isSetWindPlantReactiveControlIEC();

    /**
     * Returns the value of the '<em><b>Wind Protection IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindProtectionIEC#getWindDynamicsLookupTable <em>Wind Dynamics Lookup Table</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The grid protection model with which this wind dynamics lookup table is associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wind Protection IEC</em>' reference.
     * @see #isSetWindProtectionIEC()
     * @see #unsetWindProtectionIEC()
     * @see #setWindProtectionIEC(WindProtectionIEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindDynamicsLookupTable_WindProtectionIEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindProtectionIEC#getWindDynamicsLookupTable
     * @model opposite="WindDynamicsLookupTable" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='WindDynamicsLookupTable.WindProtectionIEC' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    WindProtectionIEC getWindProtectionIEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getWindProtectionIEC <em>Wind Protection IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Protection IEC</em>' reference.
     * @see #isSetWindProtectionIEC()
     * @see #unsetWindProtectionIEC()
     * @see #getWindProtectionIEC()
     * @generated
     */
    void setWindProtectionIEC( WindProtectionIEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getWindProtectionIEC <em>Wind Protection IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindProtectionIEC()
     * @see #getWindProtectionIEC()
     * @see #setWindProtectionIEC(WindProtectionIEC)
     * @generated
     */
    void unsetWindProtectionIEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getWindProtectionIEC <em>Wind Protection IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Protection IEC</em>' reference is set.
     * @see #unsetWindProtectionIEC()
     * @see #getWindProtectionIEC()
     * @see #setWindProtectionIEC(WindProtectionIEC)
     * @generated
     */
    boolean isSetWindProtectionIEC();

    /**
     * Returns the value of the '<em><b>Wind Gen Type3b IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenType3bIEC#getWindDynamicsLookupTable <em>Wind Dynamics Lookup Table</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The generator type 3B model with which this wind dynamics lookup table is associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wind Gen Type3b IEC</em>' reference.
     * @see #isSetWindGenType3bIEC()
     * @see #unsetWindGenType3bIEC()
     * @see #setWindGenType3bIEC(WindGenType3bIEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindDynamicsLookupTable_WindGenType3bIEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenType3bIEC#getWindDynamicsLookupTable
     * @model opposite="WindDynamicsLookupTable" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='WindDynamicsLookupTable.WindGenType3bIEC' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    WindGenType3bIEC getWindGenType3bIEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getWindGenType3bIEC <em>Wind Gen Type3b IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Gen Type3b IEC</em>' reference.
     * @see #isSetWindGenType3bIEC()
     * @see #unsetWindGenType3bIEC()
     * @see #getWindGenType3bIEC()
     * @generated
     */
    void setWindGenType3bIEC( WindGenType3bIEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getWindGenType3bIEC <em>Wind Gen Type3b IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindGenType3bIEC()
     * @see #getWindGenType3bIEC()
     * @see #setWindGenType3bIEC(WindGenType3bIEC)
     * @generated
     */
    void unsetWindGenType3bIEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getWindGenType3bIEC <em>Wind Gen Type3b IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Gen Type3b IEC</em>' reference is set.
     * @see #unsetWindGenType3bIEC()
     * @see #getWindGenType3bIEC()
     * @see #setWindGenType3bIEC(WindGenType3bIEC)
     * @generated
     */
    boolean isSetWindGenType3bIEC();

    /**
     * Returns the value of the '<em><b>Wind Plant Freq Pcontrol IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getWindDynamicsLookupTable <em>Wind Dynamics Lookup Table</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The frequency and active power wind plant control model with which this wind dynamics lookup table is associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wind Plant Freq Pcontrol IEC</em>' reference.
     * @see #isSetWindPlantFreqPcontrolIEC()
     * @see #unsetWindPlantFreqPcontrolIEC()
     * @see #setWindPlantFreqPcontrolIEC(WindPlantFreqPcontrolIEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindDynamicsLookupTable_WindPlantFreqPcontrolIEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getWindDynamicsLookupTable
     * @model opposite="WindDynamicsLookupTable" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='WindDynamicsLookupTable.WindPlantFreqPcontrolIEC' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    WindPlantFreqPcontrolIEC getWindPlantFreqPcontrolIEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getWindPlantFreqPcontrolIEC <em>Wind Plant Freq Pcontrol IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Plant Freq Pcontrol IEC</em>' reference.
     * @see #isSetWindPlantFreqPcontrolIEC()
     * @see #unsetWindPlantFreqPcontrolIEC()
     * @see #getWindPlantFreqPcontrolIEC()
     * @generated
     */
    void setWindPlantFreqPcontrolIEC( WindPlantFreqPcontrolIEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getWindPlantFreqPcontrolIEC <em>Wind Plant Freq Pcontrol IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindPlantFreqPcontrolIEC()
     * @see #getWindPlantFreqPcontrolIEC()
     * @see #setWindPlantFreqPcontrolIEC(WindPlantFreqPcontrolIEC)
     * @generated
     */
    void unsetWindPlantFreqPcontrolIEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getWindPlantFreqPcontrolIEC <em>Wind Plant Freq Pcontrol IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Plant Freq Pcontrol IEC</em>' reference is set.
     * @see #unsetWindPlantFreqPcontrolIEC()
     * @see #getWindPlantFreqPcontrolIEC()
     * @see #setWindPlantFreqPcontrolIEC(WindPlantFreqPcontrolIEC)
     * @generated
     */
    boolean isSetWindPlantFreqPcontrolIEC();

} // WindDynamicsLookupTable

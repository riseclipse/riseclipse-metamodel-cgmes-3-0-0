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
 * A representation of the model object '<em><b>Wind Plant IEC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Simplified IEC type plant level model.
 * Reference: IEC 61400-27-1:2015, Annex D.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantIEC#getWindPlantFreqPcontrolIEC <em>Wind Plant Freq Pcontrol IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantIEC#getWindPlantReactiveControlIEC <em>Wind Plant Reactive Control IEC</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindPlantIEC()
 * @model
 * @generated
 */
public interface WindPlantIEC extends WindPlantDynamics {
    /**
     * Returns the value of the '<em><b>Wind Plant Freq Pcontrol IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getWindPlantIEC <em>Wind Plant IEC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Wind plant frequency and active power control model associated with this wind plant.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wind Plant Freq Pcontrol IEC</em>' reference.
     * @see #isSetWindPlantFreqPcontrolIEC()
     * @see #unsetWindPlantFreqPcontrolIEC()
     * @see #setWindPlantFreqPcontrolIEC(WindPlantFreqPcontrolIEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindPlantIEC_WindPlantFreqPcontrolIEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantFreqPcontrolIEC#getWindPlantIEC
     * @model opposite="WindPlantIEC" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='WindPlantIEC.WindPlantFreqPcontrolIEC' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    WindPlantFreqPcontrolIEC getWindPlantFreqPcontrolIEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantIEC#getWindPlantFreqPcontrolIEC <em>Wind Plant Freq Pcontrol IEC</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantIEC#getWindPlantFreqPcontrolIEC <em>Wind Plant Freq Pcontrol IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindPlantFreqPcontrolIEC()
     * @see #getWindPlantFreqPcontrolIEC()
     * @see #setWindPlantFreqPcontrolIEC(WindPlantFreqPcontrolIEC)
     * @generated
     */
    void unsetWindPlantFreqPcontrolIEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantIEC#getWindPlantFreqPcontrolIEC <em>Wind Plant Freq Pcontrol IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Plant Freq Pcontrol IEC</em>' reference is set.
     * @see #unsetWindPlantFreqPcontrolIEC()
     * @see #getWindPlantFreqPcontrolIEC()
     * @see #setWindPlantFreqPcontrolIEC(WindPlantFreqPcontrolIEC)
     * @generated
     */
    boolean isSetWindPlantFreqPcontrolIEC();

    /**
     * Returns the value of the '<em><b>Wind Plant Reactive Control IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getWindPlantIEC <em>Wind Plant IEC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Wind plant model with which this wind reactive control is associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wind Plant Reactive Control IEC</em>' reference.
     * @see #isSetWindPlantReactiveControlIEC()
     * @see #unsetWindPlantReactiveControlIEC()
     * @see #setWindPlantReactiveControlIEC(WindPlantReactiveControlIEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindPlantIEC_WindPlantReactiveControlIEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantReactiveControlIEC#getWindPlantIEC
     * @model opposite="WindPlantIEC" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='WindPlantIEC.WindPlantReactiveControlIEC' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    WindPlantReactiveControlIEC getWindPlantReactiveControlIEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantIEC#getWindPlantReactiveControlIEC <em>Wind Plant Reactive Control IEC</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantIEC#getWindPlantReactiveControlIEC <em>Wind Plant Reactive Control IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindPlantReactiveControlIEC()
     * @see #getWindPlantReactiveControlIEC()
     * @see #setWindPlantReactiveControlIEC(WindPlantReactiveControlIEC)
     * @generated
     */
    void unsetWindPlantReactiveControlIEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindPlantIEC#getWindPlantReactiveControlIEC <em>Wind Plant Reactive Control IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Plant Reactive Control IEC</em>' reference is set.
     * @see #unsetWindPlantReactiveControlIEC()
     * @see #getWindPlantReactiveControlIEC()
     * @see #setWindPlantReactiveControlIEC(WindPlantReactiveControlIEC)
     * @generated
     */
    boolean isSetWindPlantReactiveControlIEC();

} // WindPlantIEC

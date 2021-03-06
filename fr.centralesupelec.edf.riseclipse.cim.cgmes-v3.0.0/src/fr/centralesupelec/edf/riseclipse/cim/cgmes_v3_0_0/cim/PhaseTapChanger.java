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
 * A representation of the model object '<em><b>Phase Tap Changer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A transformer phase shifting tap model that controls the phase angle difference across the power transformer and potentially the active power flow through the power transformer.  This phase tap model may also impact the voltage magnitude.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseTapChanger#getTransformerEnd <em>Transformer End</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPhaseTapChanger()
 * @model
 * @generated
 */
public interface PhaseTapChanger extends TapChanger {
    /**
     * Returns the value of the '<em><b>Transformer End</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TransformerEnd#getPhaseTapChanger <em>Phase Tap Changer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Transformer end to which this phase tap changer belongs.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Transformer End</em>' reference.
     * @see #isSetTransformerEnd()
     * @see #unsetTransformerEnd()
     * @see #setTransformerEnd(TransformerEnd)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPhaseTapChanger_TransformerEnd()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TransformerEnd#getPhaseTapChanger
     * @model opposite="PhaseTapChanger" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='PhaseTapChanger.TransformerEnd' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    TransformerEnd getTransformerEnd();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseTapChanger#getTransformerEnd <em>Transformer End</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseTapChanger#getTransformerEnd <em>Transformer End</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTransformerEnd()
     * @see #getTransformerEnd()
     * @see #setTransformerEnd(TransformerEnd)
     * @generated
     */
    void unsetTransformerEnd();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseTapChanger#getTransformerEnd <em>Transformer End</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Transformer End</em>' reference is set.
     * @see #unsetTransformerEnd()
     * @see #getTransformerEnd()
     * @see #setTransformerEnd(TransformerEnd)
     * @generated
     */
    boolean isSetTransformerEnd();

} // PhaseTapChanger

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
 * A representation of the model object '<em><b>Phase Tap Changer Table Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes each tap step in the phase tap changer tabular curve.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseTapChangerTablePoint#getPhaseTapChangerTable <em>Phase Tap Changer Table</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseTapChangerTablePoint#getAngle <em>Angle</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPhaseTapChangerTablePoint()
 * @model
 * @generated
 */
public interface PhaseTapChangerTablePoint extends TapChangerTablePoint {
    /**
     * Returns the value of the '<em><b>Phase Tap Changer Table</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseTapChangerTable#getPhaseTapChangerTablePoint <em>Phase Tap Changer Table Point</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The table of this point.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Phase Tap Changer Table</em>' reference.
     * @see #isSetPhaseTapChangerTable()
     * @see #unsetPhaseTapChangerTable()
     * @see #setPhaseTapChangerTable(PhaseTapChangerTable)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPhaseTapChangerTablePoint_PhaseTapChangerTable()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseTapChangerTable#getPhaseTapChangerTablePoint
     * @model opposite="PhaseTapChangerTablePoint" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='PhaseTapChangerTablePoint.PhaseTapChangerTable' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    PhaseTapChangerTable getPhaseTapChangerTable();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseTapChangerTablePoint#getPhaseTapChangerTable <em>Phase Tap Changer Table</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Phase Tap Changer Table</em>' reference.
     * @see #isSetPhaseTapChangerTable()
     * @see #unsetPhaseTapChangerTable()
     * @see #getPhaseTapChangerTable()
     * @generated
     */
    void setPhaseTapChangerTable( PhaseTapChangerTable value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseTapChangerTablePoint#getPhaseTapChangerTable <em>Phase Tap Changer Table</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPhaseTapChangerTable()
     * @see #getPhaseTapChangerTable()
     * @see #setPhaseTapChangerTable(PhaseTapChangerTable)
     * @generated
     */
    void unsetPhaseTapChangerTable();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseTapChangerTablePoint#getPhaseTapChangerTable <em>Phase Tap Changer Table</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Phase Tap Changer Table</em>' reference is set.
     * @see #unsetPhaseTapChangerTable()
     * @see #getPhaseTapChangerTable()
     * @see #setPhaseTapChangerTable(PhaseTapChangerTable)
     * @generated
     */
    boolean isSetPhaseTapChangerTable();

    /**
     * Returns the value of the '<em><b>Angle</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The angle difference in degrees. A positive value indicates a positive angle variation from the Terminal at the  PowerTransformerEnd,  where the TapChanger is located, into the transformer.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Angle</em>' attribute.
     * @see #isSetAngle()
     * @see #unsetAngle()
     * @see #setAngle(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPhaseTapChangerTablePoint_Angle()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AngleDegrees" transient="true" ordered="false"
     *        extendedMetaData="name='PhaseTapChangerTablePoint.angle' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getAngle();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseTapChangerTablePoint#getAngle <em>Angle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Angle</em>' attribute.
     * @see #isSetAngle()
     * @see #unsetAngle()
     * @see #getAngle()
     * @generated
     */
    void setAngle( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseTapChangerTablePoint#getAngle <em>Angle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAngle()
     * @see #getAngle()
     * @see #setAngle(Double)
     * @generated
     */
    void unsetAngle();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseTapChangerTablePoint#getAngle <em>Angle</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Angle</em>' attribute is set.
     * @see #unsetAngle()
     * @see #getAngle()
     * @see #setAngle(Double)
     * @generated
     */
    boolean isSetAngle();

} // PhaseTapChangerTablePoint

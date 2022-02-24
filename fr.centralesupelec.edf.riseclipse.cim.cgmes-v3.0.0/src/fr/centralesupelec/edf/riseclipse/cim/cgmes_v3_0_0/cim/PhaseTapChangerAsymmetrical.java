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
 * A representation of the model object '<em><b>Phase Tap Changer Asymmetrical</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Describes the tap model for an asymmetrical phase shifting transformer in which the difference voltage vector adds to the in-phase winding. The out-of-phase winding is the transformer end where the tap changer is located.  The angle between the in-phase and out-of-phase windings is named the winding connection angle. The phase shift depends on both the difference voltage magnitude and the winding connection angle.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseTapChangerAsymmetrical#getWindingConnectionAngle <em>Winding Connection Angle</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPhaseTapChangerAsymmetrical()
 * @model
 * @generated
 */
public interface PhaseTapChangerAsymmetrical extends PhaseTapChangerNonLinear {
    /**
     * Returns the value of the '<em><b>Winding Connection Angle</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The phase angle between the in-phase winding and the out-of -phase winding used for creating phase shift. The out-of-phase winding produces what is known as the difference voltage.  Setting this angle to 90 degrees is not the same as a symmetrical transformer. The attribute can only be multiples of 30 degrees.  The allowed range is -150 degrees to 150 degrees excluding 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Winding Connection Angle</em>' attribute.
     * @see #isSetWindingConnectionAngle()
     * @see #unsetWindingConnectionAngle()
     * @see #setWindingConnectionAngle(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPhaseTapChangerAsymmetrical_WindingConnectionAngle()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AngleDegrees" transient="true" ordered="false"
     *        extendedMetaData="name='PhaseTapChangerAsymmetrical.windingConnectionAngle' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getWindingConnectionAngle();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseTapChangerAsymmetrical#getWindingConnectionAngle <em>Winding Connection Angle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Winding Connection Angle</em>' attribute.
     * @see #isSetWindingConnectionAngle()
     * @see #unsetWindingConnectionAngle()
     * @see #getWindingConnectionAngle()
     * @generated
     */
    void setWindingConnectionAngle( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseTapChangerAsymmetrical#getWindingConnectionAngle <em>Winding Connection Angle</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindingConnectionAngle()
     * @see #getWindingConnectionAngle()
     * @see #setWindingConnectionAngle(Double)
     * @generated
     */
    void unsetWindingConnectionAngle();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseTapChangerAsymmetrical#getWindingConnectionAngle <em>Winding Connection Angle</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Winding Connection Angle</em>' attribute is set.
     * @see #unsetWindingConnectionAngle()
     * @see #getWindingConnectionAngle()
     * @see #setWindingConnectionAngle(Double)
     * @generated
     */
    boolean isSetWindingConnectionAngle();

} // PhaseTapChangerAsymmetrical

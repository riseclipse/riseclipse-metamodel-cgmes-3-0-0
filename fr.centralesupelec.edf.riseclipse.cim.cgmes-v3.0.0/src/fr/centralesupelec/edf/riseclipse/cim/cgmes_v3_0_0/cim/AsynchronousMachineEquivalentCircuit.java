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
 * A representation of the model object '<em><b>Asynchronous Machine Equivalent Circuit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The electrical equations of all variations of the asynchronous model are based on the AsynchronousEquivalentCircuit diagram for the direct- and quadrature- axes, with two equivalent rotor windings in each axis.
 * Equations for conversion between equivalent circuit and time constant reactance forms:
 * <i>Xs</i> = <i>Xm</i> + <i>Xl</i>
 * <i>X'</i> = <i>Xl</i> + <i>Xm</i> x <i>Xlr1 </i>/ (<i>Xm </i>+ <i>Xlr1</i>)
 * <i>X''</i> = <i>Xl</i> + <i>Xm</i> x <i>Xlr1</i> x <i>Xlr2</i> / (<i>Xm</i> x <i>Xlr1</i> + <i>Xm</i> x <i>Xlr2</i> + <i>Xlr1</i> x <i>Xlr2</i>)
 * <i>T'o</i> = (<i>Xm</i> + <i>Xlr1</i>) / (<i>omega</i><i><sub>0</sub></i> x <i>Rr1</i>)
 * <i>T''o</i> = (<i>Xm</i> x <i>Xlr1</i> + <i>Xm</i> x <i>Xlr2</i> + <i>Xlr1</i> x <i>Xlr2</i>) / (<i>omega</i><i><sub>0</sub></i> x <i>Rr2</i> x (<i>Xm</i> + <i>Xlr1</i>)
 * Same equations using CIM attributes from AsynchronousMachineTimeConstantReactance class on left of "=" and AsynchronousMachineEquivalentCircuit class on right (except as noted):
 * xs = xm + RotatingMachineDynamics.statorLeakageReactance
 * xp = RotatingMachineDynamics.statorLeakageReactance + xm x xlr1 / (xm + xlr1)
 * xpp = RotatingMachineDynamics.statorLeakageReactance + xm x xlr1 x xlr2 / (xm x xlr1 + xm x xlr2 + xlr1 x xlr2)
 * tpo = (xm + xlr1) / (2 x pi x nominal frequency x rr1)
 * tppo = (xm x xlr1 + xm x xlr2 + xlr1 x xlr2) / (2 x pi x nominal frequency x rr2 x (xm + xlr1).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineEquivalentCircuit#getXm <em>Xm</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineEquivalentCircuit#getXlr2 <em>Xlr2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineEquivalentCircuit#getXlr1 <em>Xlr1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineEquivalentCircuit#getRr1 <em>Rr1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineEquivalentCircuit#getRr2 <em>Rr2</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getAsynchronousMachineEquivalentCircuit()
 * @model
 * @generated
 */
public interface AsynchronousMachineEquivalentCircuit extends AsynchronousMachineDynamics {
    /**
     * Returns the value of the '<em><b>Xm</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Magnetizing reactance.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Xm</em>' attribute.
     * @see #isSetXm()
     * @see #unsetXm()
     * @see #setXm(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getAsynchronousMachineEquivalentCircuit_Xm()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='AsynchronousMachineEquivalentCircuit.xm' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getXm();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineEquivalentCircuit#getXm <em>Xm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xm</em>' attribute.
     * @see #isSetXm()
     * @see #unsetXm()
     * @see #getXm()
     * @generated
     */
    void setXm( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineEquivalentCircuit#getXm <em>Xm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXm()
     * @see #getXm()
     * @see #setXm(Double)
     * @generated
     */
    void unsetXm();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineEquivalentCircuit#getXm <em>Xm</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Xm</em>' attribute is set.
     * @see #unsetXm()
     * @see #getXm()
     * @see #setXm(Double)
     * @generated
     */
    boolean isSetXm();

    /**
     * Returns the value of the '<em><b>Xlr2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Damper 2 winding leakage reactance.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Xlr2</em>' attribute.
     * @see #isSetXlr2()
     * @see #unsetXlr2()
     * @see #setXlr2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getAsynchronousMachineEquivalentCircuit_Xlr2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='AsynchronousMachineEquivalentCircuit.xlr2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getXlr2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineEquivalentCircuit#getXlr2 <em>Xlr2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xlr2</em>' attribute.
     * @see #isSetXlr2()
     * @see #unsetXlr2()
     * @see #getXlr2()
     * @generated
     */
    void setXlr2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineEquivalentCircuit#getXlr2 <em>Xlr2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXlr2()
     * @see #getXlr2()
     * @see #setXlr2(Double)
     * @generated
     */
    void unsetXlr2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineEquivalentCircuit#getXlr2 <em>Xlr2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Xlr2</em>' attribute is set.
     * @see #unsetXlr2()
     * @see #getXlr2()
     * @see #setXlr2(Double)
     * @generated
     */
    boolean isSetXlr2();

    /**
     * Returns the value of the '<em><b>Xlr1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Damper 1 winding leakage reactance.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Xlr1</em>' attribute.
     * @see #isSetXlr1()
     * @see #unsetXlr1()
     * @see #setXlr1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getAsynchronousMachineEquivalentCircuit_Xlr1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='AsynchronousMachineEquivalentCircuit.xlr1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getXlr1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineEquivalentCircuit#getXlr1 <em>Xlr1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xlr1</em>' attribute.
     * @see #isSetXlr1()
     * @see #unsetXlr1()
     * @see #getXlr1()
     * @generated
     */
    void setXlr1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineEquivalentCircuit#getXlr1 <em>Xlr1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXlr1()
     * @see #getXlr1()
     * @see #setXlr1(Double)
     * @generated
     */
    void unsetXlr1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineEquivalentCircuit#getXlr1 <em>Xlr1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Xlr1</em>' attribute is set.
     * @see #unsetXlr1()
     * @see #getXlr1()
     * @see #setXlr1(Double)
     * @generated
     */
    boolean isSetXlr1();

    /**
     * Returns the value of the '<em><b>Rr1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Damper 1 winding resistance.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Rr1</em>' attribute.
     * @see #isSetRr1()
     * @see #unsetRr1()
     * @see #setRr1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getAsynchronousMachineEquivalentCircuit_Rr1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='AsynchronousMachineEquivalentCircuit.rr1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getRr1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineEquivalentCircuit#getRr1 <em>Rr1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rr1</em>' attribute.
     * @see #isSetRr1()
     * @see #unsetRr1()
     * @see #getRr1()
     * @generated
     */
    void setRr1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineEquivalentCircuit#getRr1 <em>Rr1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRr1()
     * @see #getRr1()
     * @see #setRr1(Double)
     * @generated
     */
    void unsetRr1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineEquivalentCircuit#getRr1 <em>Rr1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rr1</em>' attribute is set.
     * @see #unsetRr1()
     * @see #getRr1()
     * @see #setRr1(Double)
     * @generated
     */
    boolean isSetRr1();

    /**
     * Returns the value of the '<em><b>Rr2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Damper 2 winding resistance.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Rr2</em>' attribute.
     * @see #isSetRr2()
     * @see #unsetRr2()
     * @see #setRr2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getAsynchronousMachineEquivalentCircuit_Rr2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='AsynchronousMachineEquivalentCircuit.rr2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getRr2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineEquivalentCircuit#getRr2 <em>Rr2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rr2</em>' attribute.
     * @see #isSetRr2()
     * @see #unsetRr2()
     * @see #getRr2()
     * @generated
     */
    void setRr2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineEquivalentCircuit#getRr2 <em>Rr2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRr2()
     * @see #getRr2()
     * @see #setRr2(Double)
     * @generated
     */
    void unsetRr2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineEquivalentCircuit#getRr2 <em>Rr2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rr2</em>' attribute is set.
     * @see #unsetRr2()
     * @see #getRr2()
     * @see #setRr2(Double)
     * @generated
     */
    boolean isSetRr2();

} // AsynchronousMachineEquivalentCircuit

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
 * A representation of the model object '<em><b>Synchronous Machine Equivalent Circuit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The electrical equations for all variations of the synchronous models are based on the SynchronousEquivalentCircuit diagram for the direct- and quadrature- axes.
 * Equations for conversion between equivalent circuit and time constant reactance forms:
 * <i>Xd</i> = <i>Xad </i>+<i> Xl</i>
 * <i>X’d</i> = <i>Xl</i> + <i>Xad</i> x <i>Xfd</i> / (<i>Xad</i> + <i>Xfd</i>)
 * <i>X”d</i> = <i>Xl</i> + <i>Xad</i> x <i>Xfd</i> x <i>X1d</i> / (<i>Xad</i> x <i>Xfd</i> + <i>Xad</i> x <i>X1d</i> + <i>Xfd</i> x <i>X1d</i>)
 * <i>Xq</i> = <i>Xaq</i> + <i>Xl</i>
 * <i>X’q</i> = <i>Xl</i> + <i>Xaq</i> x <i>X1q</i> / (<i>Xaq</i> + <i>X1q</i>)
 * <i>X”q</i> = <i>Xl</i> + <i>Xaq</i> x <i>X1q</i> x <i>X2q</i> / (<i>Xaq</i> x <i>X1q</i> + <i>Xaq</i> x <i>X2q</i> + <i>X1q</i> x <i>X2q</i>)
 * <i>T’do</i> = (<i>Xad</i> + <i>Xfd</i>) / (<i>omega</i><i><sub>0</sub></i> x <i>Rfd</i>)
 * <i>T”do</i> = (<i>Xad</i> x <i>Xfd</i> + <i>Xad</i> x <i>X1d</i> + <i>Xfd</i> x <i>X1d</i>) / (<i>omega</i><i><sub>0</sub></i> x <i>R1d</i> x (<i>Xad</i> + <i>Xfd</i>)
 * <i>T’qo</i> = (<i>Xaq</i> + <i>X1q</i>) / (<i>omega</i><i><sub>0</sub></i> x <i>R1q</i>)
 * <i>T”qo</i> = (<i>Xaq</i> x <i>X1q</i> + <i>Xaq</i> x <i>X2q</i> + <i>X1q</i> x <i>X2q</i>) / (<i>omega</i><i><sub>0</sub></i> x <i>R2q</i> x (<i>Xaq</i> + <i>X1q</i>)
 * Same equations using CIM attributes from SynchronousMachineTimeConstantReactance class on left of "=" and SynchronousMachineEquivalentCircuit class on right (except as noted):
 * xDirectSync = xad + RotatingMachineDynamics.statorLeakageReactance
 * xDirectTrans = RotatingMachineDynamics.statorLeakageReactance + xad x xfd / (xad + xfd)
 * xDirectSubtrans = RotatingMachineDynamics.statorLeakageReactance + xad x xfd x x1d / (xad x xfd + xad x x1d + xfd x x1d)
 * xQuadSync = xaq + RotatingMachineDynamics.statorLeakageReactance
 * xQuadTrans = RotatingMachineDynamics.statorLeakageReactance + xaq x x1q / (xaq+ x1q)
 * xQuadSubtrans = RotatingMachineDynamics.statorLeakageReactance + xaq x x1q x x2q / (xaq x x1q + xaq x x2q + x1q x x2q)
 * tpdo = (xad + xfd) / (2 x pi x nominal frequency x rfd)
 * tppdo = (xad x xfd + xad x x1d + xfd x x1d) / (2 x pi x nominal frequency x r1d x (xad + xfd)
 * tpqo = (xaq + x1q) / (2 x pi x nominal frequency x r1q)
 * tppqo = (xaq x x1q + xaq x x2q + x1q x x2q) / (2 x pi x nominal frequency x r2q x (xaq + x1q)
 * These are only valid for a simplified model where "Canay" reactance is zero.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineEquivalentCircuit#getRfd <em>Rfd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineEquivalentCircuit#getX1d <em>X1d</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineEquivalentCircuit#getX1q <em>X1q</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineEquivalentCircuit#getX2q <em>X2q</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineEquivalentCircuit#getXfd <em>Xfd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineEquivalentCircuit#getXad <em>Xad</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineEquivalentCircuit#getXaq <em>Xaq</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineEquivalentCircuit#getR1d <em>R1d</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineEquivalentCircuit#getR1q <em>R1q</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineEquivalentCircuit#getR2q <em>R2q</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineEquivalentCircuit#getXf1d <em>Xf1d</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachineEquivalentCircuit()
 * @model
 * @generated
 */
public interface SynchronousMachineEquivalentCircuit extends SynchronousMachineDetailed {
    /**
     * Returns the value of the '<em><b>Rfd</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Field winding resistance.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Rfd</em>' attribute.
     * @see #isSetRfd()
     * @see #unsetRfd()
     * @see #setRfd(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachineEquivalentCircuit_Rfd()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='SynchronousMachineEquivalentCircuit.rfd' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getRfd();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineEquivalentCircuit#getRfd <em>Rfd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rfd</em>' attribute.
     * @see #isSetRfd()
     * @see #unsetRfd()
     * @see #getRfd()
     * @generated
     */
    void setRfd( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineEquivalentCircuit#getRfd <em>Rfd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRfd()
     * @see #getRfd()
     * @see #setRfd(Double)
     * @generated
     */
    void unsetRfd();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineEquivalentCircuit#getRfd <em>Rfd</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rfd</em>' attribute is set.
     * @see #unsetRfd()
     * @see #getRfd()
     * @see #setRfd(Double)
     * @generated
     */
    boolean isSetRfd();

    /**
     * Returns the value of the '<em><b>X1d</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Direct-axis damper 1 winding leakage reactance.
     * <!-- end-model-doc -->
     * @return the value of the '<em>X1d</em>' attribute.
     * @see #isSetX1d()
     * @see #unsetX1d()
     * @see #setX1d(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachineEquivalentCircuit_X1d()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='SynchronousMachineEquivalentCircuit.x1d' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getX1d();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineEquivalentCircuit#getX1d <em>X1d</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>X1d</em>' attribute.
     * @see #isSetX1d()
     * @see #unsetX1d()
     * @see #getX1d()
     * @generated
     */
    void setX1d( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineEquivalentCircuit#getX1d <em>X1d</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetX1d()
     * @see #getX1d()
     * @see #setX1d(Double)
     * @generated
     */
    void unsetX1d();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineEquivalentCircuit#getX1d <em>X1d</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>X1d</em>' attribute is set.
     * @see #unsetX1d()
     * @see #getX1d()
     * @see #setX1d(Double)
     * @generated
     */
    boolean isSetX1d();

    /**
     * Returns the value of the '<em><b>X1q</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Quadrature-axis damper 1 winding leakage reactance.
     * <!-- end-model-doc -->
     * @return the value of the '<em>X1q</em>' attribute.
     * @see #isSetX1q()
     * @see #unsetX1q()
     * @see #setX1q(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachineEquivalentCircuit_X1q()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='SynchronousMachineEquivalentCircuit.x1q' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getX1q();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineEquivalentCircuit#getX1q <em>X1q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>X1q</em>' attribute.
     * @see #isSetX1q()
     * @see #unsetX1q()
     * @see #getX1q()
     * @generated
     */
    void setX1q( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineEquivalentCircuit#getX1q <em>X1q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetX1q()
     * @see #getX1q()
     * @see #setX1q(Double)
     * @generated
     */
    void unsetX1q();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineEquivalentCircuit#getX1q <em>X1q</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>X1q</em>' attribute is set.
     * @see #unsetX1q()
     * @see #getX1q()
     * @see #setX1q(Double)
     * @generated
     */
    boolean isSetX1q();

    /**
     * Returns the value of the '<em><b>X2q</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Quadrature-axis damper 2 winding leakage reactance.
     * <!-- end-model-doc -->
     * @return the value of the '<em>X2q</em>' attribute.
     * @see #isSetX2q()
     * @see #unsetX2q()
     * @see #setX2q(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachineEquivalentCircuit_X2q()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='SynchronousMachineEquivalentCircuit.x2q' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getX2q();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineEquivalentCircuit#getX2q <em>X2q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>X2q</em>' attribute.
     * @see #isSetX2q()
     * @see #unsetX2q()
     * @see #getX2q()
     * @generated
     */
    void setX2q( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineEquivalentCircuit#getX2q <em>X2q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetX2q()
     * @see #getX2q()
     * @see #setX2q(Double)
     * @generated
     */
    void unsetX2q();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineEquivalentCircuit#getX2q <em>X2q</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>X2q</em>' attribute is set.
     * @see #unsetX2q()
     * @see #getX2q()
     * @see #setX2q(Double)
     * @generated
     */
    boolean isSetX2q();

    /**
     * Returns the value of the '<em><b>Xfd</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Field winding leakage reactance.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Xfd</em>' attribute.
     * @see #isSetXfd()
     * @see #unsetXfd()
     * @see #setXfd(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachineEquivalentCircuit_Xfd()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='SynchronousMachineEquivalentCircuit.xfd' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getXfd();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineEquivalentCircuit#getXfd <em>Xfd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xfd</em>' attribute.
     * @see #isSetXfd()
     * @see #unsetXfd()
     * @see #getXfd()
     * @generated
     */
    void setXfd( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineEquivalentCircuit#getXfd <em>Xfd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXfd()
     * @see #getXfd()
     * @see #setXfd(Double)
     * @generated
     */
    void unsetXfd();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineEquivalentCircuit#getXfd <em>Xfd</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Xfd</em>' attribute is set.
     * @see #unsetXfd()
     * @see #getXfd()
     * @see #setXfd(Double)
     * @generated
     */
    boolean isSetXfd();

    /**
     * Returns the value of the '<em><b>Xad</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Direct-axis mutual reactance.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Xad</em>' attribute.
     * @see #isSetXad()
     * @see #unsetXad()
     * @see #setXad(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachineEquivalentCircuit_Xad()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='SynchronousMachineEquivalentCircuit.xad' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getXad();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineEquivalentCircuit#getXad <em>Xad</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xad</em>' attribute.
     * @see #isSetXad()
     * @see #unsetXad()
     * @see #getXad()
     * @generated
     */
    void setXad( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineEquivalentCircuit#getXad <em>Xad</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXad()
     * @see #getXad()
     * @see #setXad(Double)
     * @generated
     */
    void unsetXad();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineEquivalentCircuit#getXad <em>Xad</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Xad</em>' attribute is set.
     * @see #unsetXad()
     * @see #getXad()
     * @see #setXad(Double)
     * @generated
     */
    boolean isSetXad();

    /**
     * Returns the value of the '<em><b>Xaq</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Quadrature-axis mutual reactance.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Xaq</em>' attribute.
     * @see #isSetXaq()
     * @see #unsetXaq()
     * @see #setXaq(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachineEquivalentCircuit_Xaq()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='SynchronousMachineEquivalentCircuit.xaq' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getXaq();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineEquivalentCircuit#getXaq <em>Xaq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xaq</em>' attribute.
     * @see #isSetXaq()
     * @see #unsetXaq()
     * @see #getXaq()
     * @generated
     */
    void setXaq( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineEquivalentCircuit#getXaq <em>Xaq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXaq()
     * @see #getXaq()
     * @see #setXaq(Double)
     * @generated
     */
    void unsetXaq();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineEquivalentCircuit#getXaq <em>Xaq</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Xaq</em>' attribute is set.
     * @see #unsetXaq()
     * @see #getXaq()
     * @see #setXaq(Double)
     * @generated
     */
    boolean isSetXaq();

    /**
     * Returns the value of the '<em><b>R1d</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Direct-axis damper 1 winding resistance.
     * <!-- end-model-doc -->
     * @return the value of the '<em>R1d</em>' attribute.
     * @see #isSetR1d()
     * @see #unsetR1d()
     * @see #setR1d(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachineEquivalentCircuit_R1d()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='SynchronousMachineEquivalentCircuit.r1d' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getR1d();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineEquivalentCircuit#getR1d <em>R1d</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>R1d</em>' attribute.
     * @see #isSetR1d()
     * @see #unsetR1d()
     * @see #getR1d()
     * @generated
     */
    void setR1d( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineEquivalentCircuit#getR1d <em>R1d</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetR1d()
     * @see #getR1d()
     * @see #setR1d(Double)
     * @generated
     */
    void unsetR1d();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineEquivalentCircuit#getR1d <em>R1d</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>R1d</em>' attribute is set.
     * @see #unsetR1d()
     * @see #getR1d()
     * @see #setR1d(Double)
     * @generated
     */
    boolean isSetR1d();

    /**
     * Returns the value of the '<em><b>R1q</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Quadrature-axis damper 1 winding resistance.
     * <!-- end-model-doc -->
     * @return the value of the '<em>R1q</em>' attribute.
     * @see #isSetR1q()
     * @see #unsetR1q()
     * @see #setR1q(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachineEquivalentCircuit_R1q()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='SynchronousMachineEquivalentCircuit.r1q' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getR1q();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineEquivalentCircuit#getR1q <em>R1q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>R1q</em>' attribute.
     * @see #isSetR1q()
     * @see #unsetR1q()
     * @see #getR1q()
     * @generated
     */
    void setR1q( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineEquivalentCircuit#getR1q <em>R1q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetR1q()
     * @see #getR1q()
     * @see #setR1q(Double)
     * @generated
     */
    void unsetR1q();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineEquivalentCircuit#getR1q <em>R1q</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>R1q</em>' attribute is set.
     * @see #unsetR1q()
     * @see #getR1q()
     * @see #setR1q(Double)
     * @generated
     */
    boolean isSetR1q();

    /**
     * Returns the value of the '<em><b>R2q</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Quadrature-axis damper 2 winding resistance.
     * <!-- end-model-doc -->
     * @return the value of the '<em>R2q</em>' attribute.
     * @see #isSetR2q()
     * @see #unsetR2q()
     * @see #setR2q(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachineEquivalentCircuit_R2q()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='SynchronousMachineEquivalentCircuit.r2q' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getR2q();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineEquivalentCircuit#getR2q <em>R2q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>R2q</em>' attribute.
     * @see #isSetR2q()
     * @see #unsetR2q()
     * @see #getR2q()
     * @generated
     */
    void setR2q( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineEquivalentCircuit#getR2q <em>R2q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetR2q()
     * @see #getR2q()
     * @see #setR2q(Double)
     * @generated
     */
    void unsetR2q();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineEquivalentCircuit#getR2q <em>R2q</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>R2q</em>' attribute is set.
     * @see #unsetR2q()
     * @see #getR2q()
     * @see #setR2q(Double)
     * @generated
     */
    boolean isSetR2q();

    /**
     * Returns the value of the '<em><b>Xf1d</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Differential mutual (“Canay”) reactance.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Xf1d</em>' attribute.
     * @see #isSetXf1d()
     * @see #unsetXf1d()
     * @see #setXf1d(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachineEquivalentCircuit_Xf1d()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='SynchronousMachineEquivalentCircuit.xf1d' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getXf1d();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineEquivalentCircuit#getXf1d <em>Xf1d</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xf1d</em>' attribute.
     * @see #isSetXf1d()
     * @see #unsetXf1d()
     * @see #getXf1d()
     * @generated
     */
    void setXf1d( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineEquivalentCircuit#getXf1d <em>Xf1d</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXf1d()
     * @see #getXf1d()
     * @see #setXf1d(Double)
     * @generated
     */
    void unsetXf1d();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineEquivalentCircuit#getXf1d <em>Xf1d</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Xf1d</em>' attribute is set.
     * @see #unsetXf1d()
     * @see #getXf1d()
     * @see #setXf1d(Double)
     * @generated
     */
    boolean isSetXf1d();

} // SynchronousMachineEquivalentCircuit

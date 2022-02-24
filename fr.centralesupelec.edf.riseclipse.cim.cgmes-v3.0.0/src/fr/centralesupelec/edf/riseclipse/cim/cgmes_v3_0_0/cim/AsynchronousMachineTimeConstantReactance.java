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
 * A representation of the model object '<em><b>Asynchronous Machine Time Constant Reactance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Parameter details:
 * <ol>
 * 	<li>If <i>X'' </i>=<i> X'</i>, a single cage (one equivalent rotor winding per axis) is modelled.</li>
 * 	<li>The “<i>p</i>” in the attribute names is a substitution for a “prime” in the usual parameter notation, e.g. <i>tpo</i> refers to <i>T'o</i>.</li>
 * </ol>
 * The parameters used for models expressed in time constant reactance form include:
 * - RotatingMachine.ratedS (<i>MVAbase</i>);
 * - RotatingMachineDynamics.damping (<i>D</i>);
 * - RotatingMachineDynamics.inertia (<i>H</i>);
 * - RotatingMachineDynamics.saturationFactor (<i>S1</i>);
 * - RotatingMachineDynamics.saturationFactor120 (<i>S12</i>);
 * - RotatingMachineDynamics.statorLeakageReactance (<i>Xl</i>);
 * - RotatingMachineDynamics.statorResistance (<i>Rs</i>);
 * - .xs (<i>Xs</i>);
 * - .xp (<i>X'</i>);
 * - .xpp (<i>X''</i>);
 * - .tpo (<i>T'o</i>);
 * - .tppo (<i>T''o</i>).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineTimeConstantReactance#getXpp <em>Xpp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineTimeConstantReactance#getTppo <em>Tppo</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineTimeConstantReactance#getXs <em>Xs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineTimeConstantReactance#getXp <em>Xp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineTimeConstantReactance#getTpo <em>Tpo</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getAsynchronousMachineTimeConstantReactance()
 * @model
 * @generated
 */
public interface AsynchronousMachineTimeConstantReactance extends AsynchronousMachineDynamics {
    /**
     * Returns the value of the '<em><b>Xpp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Subtransient reactance (unsaturated) (<i>X''</i>) (&gt; RotatingMachineDynamics.statorLeakageReactance).  Typical value = 0,2.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Xpp</em>' attribute.
     * @see #isSetXpp()
     * @see #unsetXpp()
     * @see #setXpp(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getAsynchronousMachineTimeConstantReactance_Xpp()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='AsynchronousMachineTimeConstantReactance.xpp' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getXpp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineTimeConstantReactance#getXpp <em>Xpp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xpp</em>' attribute.
     * @see #isSetXpp()
     * @see #unsetXpp()
     * @see #getXpp()
     * @generated
     */
    void setXpp( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineTimeConstantReactance#getXpp <em>Xpp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXpp()
     * @see #getXpp()
     * @see #setXpp(Double)
     * @generated
     */
    void unsetXpp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineTimeConstantReactance#getXpp <em>Xpp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Xpp</em>' attribute is set.
     * @see #unsetXpp()
     * @see #getXpp()
     * @see #setXpp(Double)
     * @generated
     */
    boolean isSetXpp();

    /**
     * Returns the value of the '<em><b>Tppo</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Subtransient rotor time constant (<i>T''o</i>) (&gt; 0).  Typical value = 0,03.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tppo</em>' attribute.
     * @see #isSetTppo()
     * @see #unsetTppo()
     * @see #setTppo(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getAsynchronousMachineTimeConstantReactance_Tppo()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='AsynchronousMachineTimeConstantReactance.tppo' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTppo();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineTimeConstantReactance#getTppo <em>Tppo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tppo</em>' attribute.
     * @see #isSetTppo()
     * @see #unsetTppo()
     * @see #getTppo()
     * @generated
     */
    void setTppo( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineTimeConstantReactance#getTppo <em>Tppo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTppo()
     * @see #getTppo()
     * @see #setTppo(Double)
     * @generated
     */
    void unsetTppo();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineTimeConstantReactance#getTppo <em>Tppo</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tppo</em>' attribute is set.
     * @see #unsetTppo()
     * @see #getTppo()
     * @see #setTppo(Double)
     * @generated
     */
    boolean isSetTppo();

    /**
     * Returns the value of the '<em><b>Xs</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Synchronous reactance (<i>Xs</i>) (&gt;= AsynchronousMachineTimeConstantReactance.xp).  Typical value = 1,8.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Xs</em>' attribute.
     * @see #isSetXs()
     * @see #unsetXs()
     * @see #setXs(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getAsynchronousMachineTimeConstantReactance_Xs()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='AsynchronousMachineTimeConstantReactance.xs' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getXs();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineTimeConstantReactance#getXs <em>Xs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xs</em>' attribute.
     * @see #isSetXs()
     * @see #unsetXs()
     * @see #getXs()
     * @generated
     */
    void setXs( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineTimeConstantReactance#getXs <em>Xs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXs()
     * @see #getXs()
     * @see #setXs(Double)
     * @generated
     */
    void unsetXs();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineTimeConstantReactance#getXs <em>Xs</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Xs</em>' attribute is set.
     * @see #unsetXs()
     * @see #getXs()
     * @see #setXs(Double)
     * @generated
     */
    boolean isSetXs();

    /**
     * Returns the value of the '<em><b>Xp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Transient reactance (unsaturated) (<i>X'</i>) (&gt;= AsynchronousMachineTimeConstantReactance.xpp).  Typical value = 0,5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Xp</em>' attribute.
     * @see #isSetXp()
     * @see #unsetXp()
     * @see #setXp(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getAsynchronousMachineTimeConstantReactance_Xp()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='AsynchronousMachineTimeConstantReactance.xp' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getXp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineTimeConstantReactance#getXp <em>Xp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xp</em>' attribute.
     * @see #isSetXp()
     * @see #unsetXp()
     * @see #getXp()
     * @generated
     */
    void setXp( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineTimeConstantReactance#getXp <em>Xp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXp()
     * @see #getXp()
     * @see #setXp(Double)
     * @generated
     */
    void unsetXp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineTimeConstantReactance#getXp <em>Xp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Xp</em>' attribute is set.
     * @see #unsetXp()
     * @see #getXp()
     * @see #setXp(Double)
     * @generated
     */
    boolean isSetXp();

    /**
     * Returns the value of the '<em><b>Tpo</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Transient rotor time constant (<i>T'o</i>) (&gt; AsynchronousMachineTimeConstantReactance.tppo).  Typical value = 5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tpo</em>' attribute.
     * @see #isSetTpo()
     * @see #unsetTpo()
     * @see #setTpo(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getAsynchronousMachineTimeConstantReactance_Tpo()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='AsynchronousMachineTimeConstantReactance.tpo' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTpo();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineTimeConstantReactance#getTpo <em>Tpo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tpo</em>' attribute.
     * @see #isSetTpo()
     * @see #unsetTpo()
     * @see #getTpo()
     * @generated
     */
    void setTpo( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineTimeConstantReactance#getTpo <em>Tpo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTpo()
     * @see #getTpo()
     * @see #setTpo(Double)
     * @generated
     */
    void unsetTpo();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineTimeConstantReactance#getTpo <em>Tpo</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tpo</em>' attribute is set.
     * @see #unsetTpo()
     * @see #getTpo()
     * @see #setTpo(Double)
     * @generated
     */
    boolean isSetTpo();

} // AsynchronousMachineTimeConstantReactance

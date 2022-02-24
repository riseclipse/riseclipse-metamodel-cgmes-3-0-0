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
 * A representation of the model object '<em><b>Synchronous Machine Time Constant Reactance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Synchronous machine detailed modelling types are defined by the combination of the attributes SynchronousMachineTimeConstantReactance.modelType and SynchronousMachineTimeConstantReactance.rotorType.
 * Parameter details:
 * <ol>
 * 	<li>The “p” in the time-related attribute names is a substitution for a “prime” in the usual parameter notation, e.g. tpdo refers to <i>T'do</i>.</li>
 * 	<li>The parameters used for models expressed in time constant reactance form include:</li>
 * </ol>
 * - RotatingMachine.ratedS (<i>MVAbase</i>);
 * - RotatingMachineDynamics.damping (<i>D</i>);
 * - RotatingMachineDynamics.inertia (<i>H</i>);
 * - RotatingMachineDynamics.saturationFactor (<i>S1</i>);
 * - RotatingMachineDynamics.saturationFactor120 (<i>S12</i>);
 * - RotatingMachineDynamics.statorLeakageReactance (<i>Xl</i>);
 * - RotatingMachineDynamics.statorResistance (<i>Rs</i>);
 * - SynchronousMachineTimeConstantReactance.ks (<i>Ks</i>);
 * - SynchronousMachineDetailed.saturationFactorQAxis (<i>S1q</i>);
 * - SynchronousMachineDetailed.saturationFactor120QAxis (<i>S12q</i>);
 * - SynchronousMachineDetailed.efdBaseRatio;
 * - SynchronousMachineDetailed.ifdBaseType;
 * - .xDirectSync (<i>Xd</i>);
 * - .xDirectTrans (<i>X'd</i>);
 * - .xDirectSubtrans (<i>X''d</i>);
 * - .xQuadSync (<i>Xq</i>);
 * - .xQuadTrans (<i>X'q</i>);
 * - .xQuadSubtrans (<i>X''q</i>);
 * - .tpdo (<i>T'do</i>);
 * - .tppdo (<i>T''do</i>);
 * - .tpqo (<i>T'qo</i>);
 * - .tppqo (<i>T''qo</i>);
 * - .tc.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineTimeConstantReactance#getTc <em>Tc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineTimeConstantReactance#getXDirectTrans <em>XDirect Trans</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineTimeConstantReactance#getTppdo <em>Tppdo</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineTimeConstantReactance#getModelType <em>Model Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineTimeConstantReactance#getTppqo <em>Tppqo</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineTimeConstantReactance#getXDirectSubtrans <em>XDirect Subtrans</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineTimeConstantReactance#getXDirectSync <em>XDirect Sync</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineTimeConstantReactance#getXQuadTrans <em>XQuad Trans</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineTimeConstantReactance#getTpdo <em>Tpdo</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineTimeConstantReactance#getRotorType <em>Rotor Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineTimeConstantReactance#getXQuadSync <em>XQuad Sync</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineTimeConstantReactance#getXQuadSubtrans <em>XQuad Subtrans</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineTimeConstantReactance#getKs <em>Ks</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineTimeConstantReactance#getTpqo <em>Tpqo</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachineTimeConstantReactance()
 * @model
 * @generated
 */
public interface SynchronousMachineTimeConstantReactance extends SynchronousMachineDetailed {
    /**
     * Returns the value of the '<em><b>Tc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Damping time constant for “Canay” reactance (&gt;= 0).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tc</em>' attribute.
     * @see #isSetTc()
     * @see #unsetTc()
     * @see #setTc(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachineTimeConstantReactance_Tc()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='SynchronousMachineTimeConstantReactance.tc' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineTimeConstantReactance#getTc <em>Tc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tc</em>' attribute.
     * @see #isSetTc()
     * @see #unsetTc()
     * @see #getTc()
     * @generated
     */
    void setTc( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineTimeConstantReactance#getTc <em>Tc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTc()
     * @see #getTc()
     * @see #setTc(Double)
     * @generated
     */
    void unsetTc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineTimeConstantReactance#getTc <em>Tc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tc</em>' attribute is set.
     * @see #unsetTc()
     * @see #getTc()
     * @see #setTc(Double)
     * @generated
     */
    boolean isSetTc();

    /**
     * Returns the value of the '<em><b>XDirect Trans</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Direct-axis transient reactance (unsaturated) (<i>X'd</i>) (&gt;= SynchronousMachineTimeConstantReactance.xDirectSubtrans).  Typical value = 0,5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>XDirect Trans</em>' attribute.
     * @see #isSetXDirectTrans()
     * @see #unsetXDirectTrans()
     * @see #setXDirectTrans(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachineTimeConstantReactance_XDirectTrans()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='SynchronousMachineTimeConstantReactance.xDirectTrans' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getXDirectTrans();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineTimeConstantReactance#getXDirectTrans <em>XDirect Trans</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>XDirect Trans</em>' attribute.
     * @see #isSetXDirectTrans()
     * @see #unsetXDirectTrans()
     * @see #getXDirectTrans()
     * @generated
     */
    void setXDirectTrans( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineTimeConstantReactance#getXDirectTrans <em>XDirect Trans</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXDirectTrans()
     * @see #getXDirectTrans()
     * @see #setXDirectTrans(Double)
     * @generated
     */
    void unsetXDirectTrans();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineTimeConstantReactance#getXDirectTrans <em>XDirect Trans</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>XDirect Trans</em>' attribute is set.
     * @see #unsetXDirectTrans()
     * @see #getXDirectTrans()
     * @see #setXDirectTrans(Double)
     * @generated
     */
    boolean isSetXDirectTrans();

    /**
     * Returns the value of the '<em><b>Tppdo</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Direct-axis subtransient rotor time constant (<i>T''do</i>) (&gt; 0).  Typical value = 0,03.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tppdo</em>' attribute.
     * @see #isSetTppdo()
     * @see #unsetTppdo()
     * @see #setTppdo(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachineTimeConstantReactance_Tppdo()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='SynchronousMachineTimeConstantReactance.tppdo' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTppdo();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineTimeConstantReactance#getTppdo <em>Tppdo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tppdo</em>' attribute.
     * @see #isSetTppdo()
     * @see #unsetTppdo()
     * @see #getTppdo()
     * @generated
     */
    void setTppdo( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineTimeConstantReactance#getTppdo <em>Tppdo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTppdo()
     * @see #getTppdo()
     * @see #setTppdo(Double)
     * @generated
     */
    void unsetTppdo();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineTimeConstantReactance#getTppdo <em>Tppdo</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tppdo</em>' attribute is set.
     * @see #unsetTppdo()
     * @see #getTppdo()
     * @see #setTppdo(Double)
     * @generated
     */
    boolean isSetTppdo();

    /**
     * Returns the value of the '<em><b>Model Type</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineModelKind}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Type of synchronous machine model used in dynamic simulation applications.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Model Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineModelKind
     * @see #isSetModelType()
     * @see #unsetModelType()
     * @see #setModelType(SynchronousMachineModelKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachineTimeConstantReactance_ModelType()
     * @model unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='SynchronousMachineTimeConstantReactance.modelType' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    SynchronousMachineModelKind getModelType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineTimeConstantReactance#getModelType <em>Model Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Model Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineModelKind
     * @see #isSetModelType()
     * @see #unsetModelType()
     * @see #getModelType()
     * @generated
     */
    void setModelType( SynchronousMachineModelKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineTimeConstantReactance#getModelType <em>Model Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetModelType()
     * @see #getModelType()
     * @see #setModelType(SynchronousMachineModelKind)
     * @generated
     */
    void unsetModelType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineTimeConstantReactance#getModelType <em>Model Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Model Type</em>' attribute is set.
     * @see #unsetModelType()
     * @see #getModelType()
     * @see #setModelType(SynchronousMachineModelKind)
     * @generated
     */
    boolean isSetModelType();

    /**
     * Returns the value of the '<em><b>Tppqo</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Quadrature-axis subtransient rotor time constant (<i>T''qo</i>) (&gt; 0). Typical value = 0,03.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tppqo</em>' attribute.
     * @see #isSetTppqo()
     * @see #unsetTppqo()
     * @see #setTppqo(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachineTimeConstantReactance_Tppqo()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='SynchronousMachineTimeConstantReactance.tppqo' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTppqo();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineTimeConstantReactance#getTppqo <em>Tppqo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tppqo</em>' attribute.
     * @see #isSetTppqo()
     * @see #unsetTppqo()
     * @see #getTppqo()
     * @generated
     */
    void setTppqo( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineTimeConstantReactance#getTppqo <em>Tppqo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTppqo()
     * @see #getTppqo()
     * @see #setTppqo(Double)
     * @generated
     */
    void unsetTppqo();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineTimeConstantReactance#getTppqo <em>Tppqo</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tppqo</em>' attribute is set.
     * @see #unsetTppqo()
     * @see #getTppqo()
     * @see #setTppqo(Double)
     * @generated
     */
    boolean isSetTppqo();

    /**
     * Returns the value of the '<em><b>XDirect Subtrans</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Direct-axis subtransient reactance (unsaturated) (<i>X''d</i>) (&gt; RotatingMachineDynamics.statorLeakageReactance).  Typical value = 0,2.
     * <!-- end-model-doc -->
     * @return the value of the '<em>XDirect Subtrans</em>' attribute.
     * @see #isSetXDirectSubtrans()
     * @see #unsetXDirectSubtrans()
     * @see #setXDirectSubtrans(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachineTimeConstantReactance_XDirectSubtrans()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='SynchronousMachineTimeConstantReactance.xDirectSubtrans' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getXDirectSubtrans();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineTimeConstantReactance#getXDirectSubtrans <em>XDirect Subtrans</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>XDirect Subtrans</em>' attribute.
     * @see #isSetXDirectSubtrans()
     * @see #unsetXDirectSubtrans()
     * @see #getXDirectSubtrans()
     * @generated
     */
    void setXDirectSubtrans( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineTimeConstantReactance#getXDirectSubtrans <em>XDirect Subtrans</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXDirectSubtrans()
     * @see #getXDirectSubtrans()
     * @see #setXDirectSubtrans(Double)
     * @generated
     */
    void unsetXDirectSubtrans();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineTimeConstantReactance#getXDirectSubtrans <em>XDirect Subtrans</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>XDirect Subtrans</em>' attribute is set.
     * @see #unsetXDirectSubtrans()
     * @see #getXDirectSubtrans()
     * @see #setXDirectSubtrans(Double)
     * @generated
     */
    boolean isSetXDirectSubtrans();

    /**
     * Returns the value of the '<em><b>XDirect Sync</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Direct-axis synchronous reactance (<i>Xd</i>) (&gt;= SynchronousMachineTimeConstantReactance.xDirectTrans). The quotient of a sustained value of that AC component of armature voltage that is produced by the total direct-axis flux due to direct-axis armature current and the value of the AC component of this current, the machine running at rated speed.  Typical value = 1,8.
     * <!-- end-model-doc -->
     * @return the value of the '<em>XDirect Sync</em>' attribute.
     * @see #isSetXDirectSync()
     * @see #unsetXDirectSync()
     * @see #setXDirectSync(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachineTimeConstantReactance_XDirectSync()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='SynchronousMachineTimeConstantReactance.xDirectSync' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getXDirectSync();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineTimeConstantReactance#getXDirectSync <em>XDirect Sync</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>XDirect Sync</em>' attribute.
     * @see #isSetXDirectSync()
     * @see #unsetXDirectSync()
     * @see #getXDirectSync()
     * @generated
     */
    void setXDirectSync( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineTimeConstantReactance#getXDirectSync <em>XDirect Sync</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXDirectSync()
     * @see #getXDirectSync()
     * @see #setXDirectSync(Double)
     * @generated
     */
    void unsetXDirectSync();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineTimeConstantReactance#getXDirectSync <em>XDirect Sync</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>XDirect Sync</em>' attribute is set.
     * @see #unsetXDirectSync()
     * @see #getXDirectSync()
     * @see #setXDirectSync(Double)
     * @generated
     */
    boolean isSetXDirectSync();

    /**
     * Returns the value of the '<em><b>XQuad Trans</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Quadrature-axis transient reactance (<i>X'q</i>) (&gt;= SynchronousMachineTimeConstantReactance.xQuadSubtrans).  Typical value = 0,3.
     * <!-- end-model-doc -->
     * @return the value of the '<em>XQuad Trans</em>' attribute.
     * @see #isSetXQuadTrans()
     * @see #unsetXQuadTrans()
     * @see #setXQuadTrans(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachineTimeConstantReactance_XQuadTrans()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='SynchronousMachineTimeConstantReactance.xQuadTrans' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getXQuadTrans();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineTimeConstantReactance#getXQuadTrans <em>XQuad Trans</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>XQuad Trans</em>' attribute.
     * @see #isSetXQuadTrans()
     * @see #unsetXQuadTrans()
     * @see #getXQuadTrans()
     * @generated
     */
    void setXQuadTrans( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineTimeConstantReactance#getXQuadTrans <em>XQuad Trans</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXQuadTrans()
     * @see #getXQuadTrans()
     * @see #setXQuadTrans(Double)
     * @generated
     */
    void unsetXQuadTrans();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineTimeConstantReactance#getXQuadTrans <em>XQuad Trans</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>XQuad Trans</em>' attribute is set.
     * @see #unsetXQuadTrans()
     * @see #getXQuadTrans()
     * @see #setXQuadTrans(Double)
     * @generated
     */
    boolean isSetXQuadTrans();

    /**
     * Returns the value of the '<em><b>Tpdo</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Direct-axis transient rotor time constant (<i>T'do</i>) (&gt; SynchronousMachineTimeConstantReactance.tppdo).  Typical value = 5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tpdo</em>' attribute.
     * @see #isSetTpdo()
     * @see #unsetTpdo()
     * @see #setTpdo(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachineTimeConstantReactance_Tpdo()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='SynchronousMachineTimeConstantReactance.tpdo' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTpdo();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineTimeConstantReactance#getTpdo <em>Tpdo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tpdo</em>' attribute.
     * @see #isSetTpdo()
     * @see #unsetTpdo()
     * @see #getTpdo()
     * @generated
     */
    void setTpdo( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineTimeConstantReactance#getTpdo <em>Tpdo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTpdo()
     * @see #getTpdo()
     * @see #setTpdo(Double)
     * @generated
     */
    void unsetTpdo();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineTimeConstantReactance#getTpdo <em>Tpdo</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tpdo</em>' attribute is set.
     * @see #unsetTpdo()
     * @see #getTpdo()
     * @see #setTpdo(Double)
     * @generated
     */
    boolean isSetTpdo();

    /**
     * Returns the value of the '<em><b>Rotor Type</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotorKind}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Type of rotor on physical machine.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Rotor Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotorKind
     * @see #isSetRotorType()
     * @see #unsetRotorType()
     * @see #setRotorType(RotorKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachineTimeConstantReactance_RotorType()
     * @model unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='SynchronousMachineTimeConstantReactance.rotorType' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    RotorKind getRotorType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineTimeConstantReactance#getRotorType <em>Rotor Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rotor Type</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotorKind
     * @see #isSetRotorType()
     * @see #unsetRotorType()
     * @see #getRotorType()
     * @generated
     */
    void setRotorType( RotorKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineTimeConstantReactance#getRotorType <em>Rotor Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRotorType()
     * @see #getRotorType()
     * @see #setRotorType(RotorKind)
     * @generated
     */
    void unsetRotorType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineTimeConstantReactance#getRotorType <em>Rotor Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rotor Type</em>' attribute is set.
     * @see #unsetRotorType()
     * @see #getRotorType()
     * @see #setRotorType(RotorKind)
     * @generated
     */
    boolean isSetRotorType();

    /**
     * Returns the value of the '<em><b>XQuad Sync</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Quadrature-axis synchronous reactance (<i>Xq</i>) (&gt;= SynchronousMachineTimeConstantReactance.xQuadTrans).
     * The ratio of the component of reactive armature voltage, due to the quadrature-axis component of armature current, to this component of current, under steady state conditions and at rated frequency.  Typical value = 1,6.
     * <!-- end-model-doc -->
     * @return the value of the '<em>XQuad Sync</em>' attribute.
     * @see #isSetXQuadSync()
     * @see #unsetXQuadSync()
     * @see #setXQuadSync(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachineTimeConstantReactance_XQuadSync()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='SynchronousMachineTimeConstantReactance.xQuadSync' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getXQuadSync();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineTimeConstantReactance#getXQuadSync <em>XQuad Sync</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>XQuad Sync</em>' attribute.
     * @see #isSetXQuadSync()
     * @see #unsetXQuadSync()
     * @see #getXQuadSync()
     * @generated
     */
    void setXQuadSync( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineTimeConstantReactance#getXQuadSync <em>XQuad Sync</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXQuadSync()
     * @see #getXQuadSync()
     * @see #setXQuadSync(Double)
     * @generated
     */
    void unsetXQuadSync();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineTimeConstantReactance#getXQuadSync <em>XQuad Sync</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>XQuad Sync</em>' attribute is set.
     * @see #unsetXQuadSync()
     * @see #getXQuadSync()
     * @see #setXQuadSync(Double)
     * @generated
     */
    boolean isSetXQuadSync();

    /**
     * Returns the value of the '<em><b>XQuad Subtrans</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Quadrature-axis subtransient reactance (<i>X''q</i>) (&gt; RotatingMachineDynamics.statorLeakageReactance).  Typical value = 0,2.
     * <!-- end-model-doc -->
     * @return the value of the '<em>XQuad Subtrans</em>' attribute.
     * @see #isSetXQuadSubtrans()
     * @see #unsetXQuadSubtrans()
     * @see #setXQuadSubtrans(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachineTimeConstantReactance_XQuadSubtrans()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='SynchronousMachineTimeConstantReactance.xQuadSubtrans' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getXQuadSubtrans();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineTimeConstantReactance#getXQuadSubtrans <em>XQuad Subtrans</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>XQuad Subtrans</em>' attribute.
     * @see #isSetXQuadSubtrans()
     * @see #unsetXQuadSubtrans()
     * @see #getXQuadSubtrans()
     * @generated
     */
    void setXQuadSubtrans( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineTimeConstantReactance#getXQuadSubtrans <em>XQuad Subtrans</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXQuadSubtrans()
     * @see #getXQuadSubtrans()
     * @see #setXQuadSubtrans(Double)
     * @generated
     */
    void unsetXQuadSubtrans();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineTimeConstantReactance#getXQuadSubtrans <em>XQuad Subtrans</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>XQuad Subtrans</em>' attribute is set.
     * @see #unsetXQuadSubtrans()
     * @see #getXQuadSubtrans()
     * @see #setXQuadSubtrans(Double)
     * @generated
     */
    boolean isSetXQuadSubtrans();

    /**
     * Returns the value of the '<em><b>Ks</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Saturation loading correction factor (<i>Ks</i>) (&gt;= 0).  Used only by type J model.  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ks</em>' attribute.
     * @see #isSetKs()
     * @see #unsetKs()
     * @see #setKs(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachineTimeConstantReactance_Ks()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='SynchronousMachineTimeConstantReactance.ks' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKs();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineTimeConstantReactance#getKs <em>Ks</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ks</em>' attribute.
     * @see #isSetKs()
     * @see #unsetKs()
     * @see #getKs()
     * @generated
     */
    void setKs( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineTimeConstantReactance#getKs <em>Ks</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKs()
     * @see #getKs()
     * @see #setKs(Double)
     * @generated
     */
    void unsetKs();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineTimeConstantReactance#getKs <em>Ks</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ks</em>' attribute is set.
     * @see #unsetKs()
     * @see #getKs()
     * @see #setKs(Double)
     * @generated
     */
    boolean isSetKs();

    /**
     * Returns the value of the '<em><b>Tpqo</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Quadrature-axis transient rotor time constant (<i>T'qo</i>) (&gt; SynchronousMachineTimeConstantReactance.tppqo). Typical value = 0,5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tpqo</em>' attribute.
     * @see #isSetTpqo()
     * @see #unsetTpqo()
     * @see #setTpqo(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSynchronousMachineTimeConstantReactance_Tpqo()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='SynchronousMachineTimeConstantReactance.tpqo' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTpqo();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineTimeConstantReactance#getTpqo <em>Tpqo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tpqo</em>' attribute.
     * @see #isSetTpqo()
     * @see #unsetTpqo()
     * @see #getTpqo()
     * @generated
     */
    void setTpqo( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineTimeConstantReactance#getTpqo <em>Tpqo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTpqo()
     * @see #getTpqo()
     * @see #setTpqo(Double)
     * @generated
     */
    void unsetTpqo();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineTimeConstantReactance#getTpqo <em>Tpqo</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tpqo</em>' attribute is set.
     * @see #unsetTpqo()
     * @see #getTpqo()
     * @see #setTpqo(Double)
     * @generated
     */
    boolean isSetTpqo();

} // SynchronousMachineTimeConstantReactance

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
 * A representation of the model object '<em><b>Gen ICompensation For Gen J</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Resistive and reactive components of compensation for generator associated with IEEE type 2 voltage compensator for current flow out of another generator in the interconnection.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GenICompensationForGenJ#getRcij <em>Rcij</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GenICompensationForGenJ#getXcij <em>Xcij</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GenICompensationForGenJ#getVcompIEEEType2 <em>Vcomp IEEE Type2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GenICompensationForGenJ#getSynchronousMachineDynamics <em>Synchronous Machine Dynamics</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGenICompensationForGenJ()
 * @model
 * @generated
 */
public interface GenICompensationForGenJ extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Rcij</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <font color="#0f0f0f">Resistive component of compensation of generator associated with this IEEE type 2 voltage compensator for current flow out of another generator (<i>Rcij</i>).</font>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Rcij</em>' attribute.
     * @see #isSetRcij()
     * @see #unsetRcij()
     * @see #setRcij(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGenICompensationForGenJ_Rcij()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GenICompensationForGenJ.rcij' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getRcij();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GenICompensationForGenJ#getRcij <em>Rcij</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rcij</em>' attribute.
     * @see #isSetRcij()
     * @see #unsetRcij()
     * @see #getRcij()
     * @generated
     */
    void setRcij( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GenICompensationForGenJ#getRcij <em>Rcij</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRcij()
     * @see #getRcij()
     * @see #setRcij(Double)
     * @generated
     */
    void unsetRcij();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GenICompensationForGenJ#getRcij <em>Rcij</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rcij</em>' attribute is set.
     * @see #unsetRcij()
     * @see #getRcij()
     * @see #setRcij(Double)
     * @generated
     */
    boolean isSetRcij();

    /**
     * Returns the value of the '<em><b>Xcij</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <font color="#0f0f0f">Reactive component of compensation of generator associated with this IEEE type 2 voltage compensator for current flow out of another generator (<i>Xcij</i>).</font>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Xcij</em>' attribute.
     * @see #isSetXcij()
     * @see #unsetXcij()
     * @see #setXcij(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGenICompensationForGenJ_Xcij()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GenICompensationForGenJ.xcij' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getXcij();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GenICompensationForGenJ#getXcij <em>Xcij</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xcij</em>' attribute.
     * @see #isSetXcij()
     * @see #unsetXcij()
     * @see #getXcij()
     * @generated
     */
    void setXcij( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GenICompensationForGenJ#getXcij <em>Xcij</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXcij()
     * @see #getXcij()
     * @see #setXcij(Double)
     * @generated
     */
    void unsetXcij();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GenICompensationForGenJ#getXcij <em>Xcij</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Xcij</em>' attribute is set.
     * @see #unsetXcij()
     * @see #getXcij()
     * @see #setXcij(Double)
     * @generated
     */
    boolean isSetXcij();

    /**
     * Returns the value of the '<em><b>Vcomp IEEE Type2</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VCompIEEEType2#getGenICompensationForGenJ <em>Gen ICompensation For Gen J</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The standard IEEE type 2 voltage compensator of this compensation.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vcomp IEEE Type2</em>' reference.
     * @see #isSetVcompIEEEType2()
     * @see #unsetVcompIEEEType2()
     * @see #setVcompIEEEType2(VCompIEEEType2)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGenICompensationForGenJ_VcompIEEEType2()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VCompIEEEType2#getGenICompensationForGenJ
     * @model opposite="GenICompensationForGenJ" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='GenICompensationForGenJ.VcompIEEEType2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    VCompIEEEType2 getVcompIEEEType2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GenICompensationForGenJ#getVcompIEEEType2 <em>Vcomp IEEE Type2</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vcomp IEEE Type2</em>' reference.
     * @see #isSetVcompIEEEType2()
     * @see #unsetVcompIEEEType2()
     * @see #getVcompIEEEType2()
     * @generated
     */
    void setVcompIEEEType2( VCompIEEEType2 value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GenICompensationForGenJ#getVcompIEEEType2 <em>Vcomp IEEE Type2</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVcompIEEEType2()
     * @see #getVcompIEEEType2()
     * @see #setVcompIEEEType2(VCompIEEEType2)
     * @generated
     */
    void unsetVcompIEEEType2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GenICompensationForGenJ#getVcompIEEEType2 <em>Vcomp IEEE Type2</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vcomp IEEE Type2</em>' reference is set.
     * @see #unsetVcompIEEEType2()
     * @see #getVcompIEEEType2()
     * @see #setVcompIEEEType2(VCompIEEEType2)
     * @generated
     */
    boolean isSetVcompIEEEType2();

    /**
     * Returns the value of the '<em><b>Synchronous Machine Dynamics</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineDynamics#getGenICompensationForGenJ <em>Gen ICompensation For Gen J</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Standard synchronous machine out of which current flow is being compensated for.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Synchronous Machine Dynamics</em>' reference.
     * @see #isSetSynchronousMachineDynamics()
     * @see #unsetSynchronousMachineDynamics()
     * @see #setSynchronousMachineDynamics(SynchronousMachineDynamics)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGenICompensationForGenJ_SynchronousMachineDynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SynchronousMachineDynamics#getGenICompensationForGenJ
     * @model opposite="GenICompensationForGenJ" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='GenICompensationForGenJ.SynchronousMachineDynamics' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    SynchronousMachineDynamics getSynchronousMachineDynamics();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GenICompensationForGenJ#getSynchronousMachineDynamics <em>Synchronous Machine Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Synchronous Machine Dynamics</em>' reference.
     * @see #isSetSynchronousMachineDynamics()
     * @see #unsetSynchronousMachineDynamics()
     * @see #getSynchronousMachineDynamics()
     * @generated
     */
    void setSynchronousMachineDynamics( SynchronousMachineDynamics value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GenICompensationForGenJ#getSynchronousMachineDynamics <em>Synchronous Machine Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSynchronousMachineDynamics()
     * @see #getSynchronousMachineDynamics()
     * @see #setSynchronousMachineDynamics(SynchronousMachineDynamics)
     * @generated
     */
    void unsetSynchronousMachineDynamics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GenICompensationForGenJ#getSynchronousMachineDynamics <em>Synchronous Machine Dynamics</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Synchronous Machine Dynamics</em>' reference is set.
     * @see #unsetSynchronousMachineDynamics()
     * @see #getSynchronousMachineDynamics()
     * @see #setSynchronousMachineDynamics(SynchronousMachineDynamics)
     * @generated
     */
    boolean isSetSynchronousMachineDynamics();

} // GenICompensationForGenJ

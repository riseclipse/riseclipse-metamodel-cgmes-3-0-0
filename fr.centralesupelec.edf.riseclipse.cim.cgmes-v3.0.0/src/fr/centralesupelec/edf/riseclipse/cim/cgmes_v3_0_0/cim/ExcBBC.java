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
 * A representation of the model object '<em><b>Exc BBC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Transformer fed static excitation system (static with ABB regulator). This model represents a static excitation system in which a gated thyristor bridge fed by a transformer at the main generator terminals feeds the main generator directly.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcBBC#getVrmin <em>Vrmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcBBC#getK <em>K</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcBBC#getVrmax <em>Vrmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcBBC#getSwitch <em>Switch</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcBBC#getT4 <em>T4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcBBC#getT3 <em>T3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcBBC#getT2 <em>T2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcBBC#getT1 <em>T1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcBBC#getXe <em>Xe</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcBBC#getEfdmin <em>Efdmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcBBC#getEfdmax <em>Efdmax</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcBBC()
 * @model
 * @generated
 */
public interface ExcBBC extends ExcitationSystemDynamics {
    /**
     * Returns the value of the '<em><b>Vrmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum control element output (<i>Vrmin</i>) (&lt; ExcBBC.vrmax).  Typical value = -5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vrmin</em>' attribute.
     * @see #isSetVrmin()
     * @see #unsetVrmin()
     * @see #setVrmin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcBBC_Vrmin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcBBC.vrmin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVrmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcBBC#getVrmin <em>Vrmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vrmin</em>' attribute.
     * @see #isSetVrmin()
     * @see #unsetVrmin()
     * @see #getVrmin()
     * @generated
     */
    void setVrmin( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcBBC#getVrmin <em>Vrmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVrmin()
     * @see #getVrmin()
     * @see #setVrmin(Double)
     * @generated
     */
    void unsetVrmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcBBC#getVrmin <em>Vrmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vrmin</em>' attribute is set.
     * @see #unsetVrmin()
     * @see #getVrmin()
     * @see #setVrmin(Double)
     * @generated
     */
    boolean isSetVrmin();

    /**
     * Returns the value of the '<em><b>K</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Steady state gain (<i>K</i>) (not = 0).  Typical value = 300.
     * <!-- end-model-doc -->
     * @return the value of the '<em>K</em>' attribute.
     * @see #isSetK()
     * @see #unsetK()
     * @see #setK(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcBBC_K()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcBBC.k' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getK();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcBBC#getK <em>K</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>K</em>' attribute.
     * @see #isSetK()
     * @see #unsetK()
     * @see #getK()
     * @generated
     */
    void setK( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcBBC#getK <em>K</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetK()
     * @see #getK()
     * @see #setK(Double)
     * @generated
     */
    void unsetK();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcBBC#getK <em>K</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>K</em>' attribute is set.
     * @see #unsetK()
     * @see #getK()
     * @see #setK(Double)
     * @generated
     */
    boolean isSetK();

    /**
     * Returns the value of the '<em><b>Vrmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum control element output (<i>Vrmax</i>) (&gt; ExcBBC.vrmin).  Typical value = 5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vrmax</em>' attribute.
     * @see #isSetVrmax()
     * @see #unsetVrmax()
     * @see #setVrmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcBBC_Vrmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcBBC.vrmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVrmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcBBC#getVrmax <em>Vrmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vrmax</em>' attribute.
     * @see #isSetVrmax()
     * @see #unsetVrmax()
     * @see #getVrmax()
     * @generated
     */
    void setVrmax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcBBC#getVrmax <em>Vrmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVrmax()
     * @see #getVrmax()
     * @see #setVrmax(Double)
     * @generated
     */
    void unsetVrmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcBBC#getVrmax <em>Vrmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vrmax</em>' attribute is set.
     * @see #unsetVrmax()
     * @see #getVrmax()
     * @see #setVrmax(Double)
     * @generated
     */
    boolean isSetVrmax();

    /**
     * Returns the value of the '<em><b>Switch</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Supplementary signal routing selector (<i>switch</i>).
     * true = <i>Vs</i> connected to 3rd summing point
     * false =  <i>Vs</i> connected to 1st summing point (see diagram).
     * Typical value = false.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Switch</em>' attribute.
     * @see #isSetSwitch()
     * @see #unsetSwitch()
     * @see #setSwitch(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcBBC_Switch()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='ExcBBC.switch' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getSwitch();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcBBC#getSwitch <em>Switch</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Switch</em>' attribute.
     * @see #isSetSwitch()
     * @see #unsetSwitch()
     * @see #getSwitch()
     * @generated
     */
    void setSwitch( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcBBC#getSwitch <em>Switch</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSwitch()
     * @see #getSwitch()
     * @see #setSwitch(Boolean)
     * @generated
     */
    void unsetSwitch();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcBBC#getSwitch <em>Switch</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Switch</em>' attribute is set.
     * @see #unsetSwitch()
     * @see #getSwitch()
     * @see #setSwitch(Boolean)
     * @generated
     */
    boolean isSetSwitch();

    /**
     * Returns the value of the '<em><b>T4</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Lead/lag time constant (<i>T4</i>) (&gt;= 0).  If = 0, block is bypassed.  Typical value = 0,01.
     * <!-- end-model-doc -->
     * @return the value of the '<em>T4</em>' attribute.
     * @see #isSetT4()
     * @see #unsetT4()
     * @see #setT4(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcBBC_T4()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcBBC.t4' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getT4();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcBBC#getT4 <em>T4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>T4</em>' attribute.
     * @see #isSetT4()
     * @see #unsetT4()
     * @see #getT4()
     * @generated
     */
    void setT4( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcBBC#getT4 <em>T4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT4()
     * @see #getT4()
     * @see #setT4(Double)
     * @generated
     */
    void unsetT4();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcBBC#getT4 <em>T4</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>T4</em>' attribute is set.
     * @see #unsetT4()
     * @see #getT4()
     * @see #setT4(Double)
     * @generated
     */
    boolean isSetT4();

    /**
     * Returns the value of the '<em><b>T3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Lead/lag time constant (<i>T3</i>) (&gt;= 0).  If = 0, block is bypassed.  Typical value = 0,05.
     * <!-- end-model-doc -->
     * @return the value of the '<em>T3</em>' attribute.
     * @see #isSetT3()
     * @see #unsetT3()
     * @see #setT3(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcBBC_T3()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcBBC.t3' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getT3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcBBC#getT3 <em>T3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>T3</em>' attribute.
     * @see #isSetT3()
     * @see #unsetT3()
     * @see #getT3()
     * @generated
     */
    void setT3( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcBBC#getT3 <em>T3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT3()
     * @see #getT3()
     * @see #setT3(Double)
     * @generated
     */
    void unsetT3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcBBC#getT3 <em>T3</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>T3</em>' attribute is set.
     * @see #unsetT3()
     * @see #getT3()
     * @see #setT3(Double)
     * @generated
     */
    boolean isSetT3();

    /**
     * Returns the value of the '<em><b>T2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Controller time constant (<i>T2</i>) (&gt;= 0).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>T2</em>' attribute.
     * @see #isSetT2()
     * @see #unsetT2()
     * @see #setT2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcBBC_T2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcBBC.t2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getT2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcBBC#getT2 <em>T2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>T2</em>' attribute.
     * @see #isSetT2()
     * @see #unsetT2()
     * @see #getT2()
     * @generated
     */
    void setT2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcBBC#getT2 <em>T2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT2()
     * @see #getT2()
     * @see #setT2(Double)
     * @generated
     */
    void unsetT2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcBBC#getT2 <em>T2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>T2</em>' attribute is set.
     * @see #unsetT2()
     * @see #getT2()
     * @see #setT2(Double)
     * @generated
     */
    boolean isSetT2();

    /**
     * Returns the value of the '<em><b>T1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Controller time constant (<i>T1</i>) (&gt;= 0).  Typical value = 6.
     * <!-- end-model-doc -->
     * @return the value of the '<em>T1</em>' attribute.
     * @see #isSetT1()
     * @see #unsetT1()
     * @see #setT1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcBBC_T1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcBBC.t1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getT1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcBBC#getT1 <em>T1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>T1</em>' attribute.
     * @see #isSetT1()
     * @see #unsetT1()
     * @see #getT1()
     * @generated
     */
    void setT1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcBBC#getT1 <em>T1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT1()
     * @see #getT1()
     * @see #setT1(Double)
     * @generated
     */
    void unsetT1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcBBC#getT1 <em>T1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>T1</em>' attribute is set.
     * @see #unsetT1()
     * @see #getT1()
     * @see #setT1(Double)
     * @generated
     */
    boolean isSetT1();

    /**
     * Returns the value of the '<em><b>Xe</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Effective excitation transformer reactance (<i>Xe</i>) (&gt;= 0).  <i>Xe</i> models the regulation of the transformer/rectifier unit.  Typical value = 0,05.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Xe</em>' attribute.
     * @see #isSetXe()
     * @see #unsetXe()
     * @see #setXe(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcBBC_Xe()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcBBC.xe' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getXe();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcBBC#getXe <em>Xe</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xe</em>' attribute.
     * @see #isSetXe()
     * @see #unsetXe()
     * @see #getXe()
     * @generated
     */
    void setXe( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcBBC#getXe <em>Xe</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXe()
     * @see #getXe()
     * @see #setXe(Double)
     * @generated
     */
    void unsetXe();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcBBC#getXe <em>Xe</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Xe</em>' attribute is set.
     * @see #unsetXe()
     * @see #getXe()
     * @see #setXe(Double)
     * @generated
     */
    boolean isSetXe();

    /**
     * Returns the value of the '<em><b>Efdmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum open circuit exciter voltage (<i>Efdmin</i>) (&lt; ExcBBC.efdmax).  Typical value = -5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Efdmin</em>' attribute.
     * @see #isSetEfdmin()
     * @see #unsetEfdmin()
     * @see #setEfdmin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcBBC_Efdmin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcBBC.efdmin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getEfdmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcBBC#getEfdmin <em>Efdmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Efdmin</em>' attribute.
     * @see #isSetEfdmin()
     * @see #unsetEfdmin()
     * @see #getEfdmin()
     * @generated
     */
    void setEfdmin( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcBBC#getEfdmin <em>Efdmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEfdmin()
     * @see #getEfdmin()
     * @see #setEfdmin(Double)
     * @generated
     */
    void unsetEfdmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcBBC#getEfdmin <em>Efdmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Efdmin</em>' attribute is set.
     * @see #unsetEfdmin()
     * @see #getEfdmin()
     * @see #setEfdmin(Double)
     * @generated
     */
    boolean isSetEfdmin();

    /**
     * Returns the value of the '<em><b>Efdmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum open circuit exciter voltage (<i>Efdmax</i>) (&gt; ExcBBC.efdmin).  Typical value = 5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Efdmax</em>' attribute.
     * @see #isSetEfdmax()
     * @see #unsetEfdmax()
     * @see #setEfdmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcBBC_Efdmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcBBC.efdmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getEfdmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcBBC#getEfdmax <em>Efdmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Efdmax</em>' attribute.
     * @see #isSetEfdmax()
     * @see #unsetEfdmax()
     * @see #getEfdmax()
     * @generated
     */
    void setEfdmax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcBBC#getEfdmax <em>Efdmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEfdmax()
     * @see #getEfdmax()
     * @see #setEfdmax(Double)
     * @generated
     */
    void unsetEfdmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcBBC#getEfdmax <em>Efdmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Efdmax</em>' attribute is set.
     * @see #unsetEfdmax()
     * @see #getEfdmax()
     * @see #setEfdmax(Double)
     * @generated
     */
    boolean isSetEfdmax();

} // ExcBBC

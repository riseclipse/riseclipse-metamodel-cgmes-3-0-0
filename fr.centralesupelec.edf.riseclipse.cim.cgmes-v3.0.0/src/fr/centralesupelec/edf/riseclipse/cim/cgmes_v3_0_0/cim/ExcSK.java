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
 * A representation of the model object '<em><b>Exc SK</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Slovakian excitation system.  UEL and secondary voltage control are included in this model. When this model is used, there cannot be a separate underexcitation limiter or VAr controller model.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getQconoff <em>Qconoff</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getKqp <em>Kqp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getKqi <em>Kqi</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getKce <em>Kce</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getNq <em>Nq</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getK2 <em>K2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getK1 <em>K1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getKp <em>Kp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getKd <em>Kd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getKc <em>Kc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getTr <em>Tr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getTi <em>Ti</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getTc <em>Tc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getTe <em>Te</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getTp <em>Tp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getQz <em>Qz</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getKqob <em>Kqob</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getYp <em>Yp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getRemote <em>Remote</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getK <em>K</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getEfdmax <em>Efdmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getEfdmin <em>Efdmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getEmin <em>Emin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getEmax <em>Emax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getSbase <em>Sbase</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getUrmax <em>Urmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getVtmax <em>Vtmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getUrmin <em>Urmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getVtmin <em>Vtmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getKgob <em>Kgob</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getUimax <em>Uimax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getUimin <em>Uimin</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcSK()
 * @model
 * @generated
 */
public interface ExcSK extends ExcitationSystemDynamics {
    /**
     * Returns the value of the '<em><b>Qconoff</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Secondary voltage control state (<i>Qc_on_off</i>).
     * true = secondary voltage control is on
     * false = secondary voltage control is off.
     * Typical value = false.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Qconoff</em>' attribute.
     * @see #isSetQconoff()
     * @see #unsetQconoff()
     * @see #setQconoff(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcSK_Qconoff()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='ExcSK.qconoff' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getQconoff();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getQconoff <em>Qconoff</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Qconoff</em>' attribute.
     * @see #isSetQconoff()
     * @see #unsetQconoff()
     * @see #getQconoff()
     * @generated
     */
    void setQconoff( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getQconoff <em>Qconoff</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQconoff()
     * @see #getQconoff()
     * @see #setQconoff(Boolean)
     * @generated
     */
    void unsetQconoff();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getQconoff <em>Qconoff</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Qconoff</em>' attribute is set.
     * @see #unsetQconoff()
     * @see #getQconoff()
     * @see #setQconoff(Boolean)
     * @generated
     */
    boolean isSetQconoff();

    /**
     * Returns the value of the '<em><b>Kqp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * PI controller gain (<i>Kqp</i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kqp</em>' attribute.
     * @see #isSetKqp()
     * @see #unsetKqp()
     * @see #setKqp(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcSK_Kqp()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcSK.kqp' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKqp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getKqp <em>Kqp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kqp</em>' attribute.
     * @see #isSetKqp()
     * @see #unsetKqp()
     * @see #getKqp()
     * @generated
     */
    void setKqp( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getKqp <em>Kqp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKqp()
     * @see #getKqp()
     * @see #setKqp(Double)
     * @generated
     */
    void unsetKqp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getKqp <em>Kqp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kqp</em>' attribute is set.
     * @see #unsetKqp()
     * @see #getKqp()
     * @see #setKqp(Double)
     * @generated
     */
    boolean isSetKqp();

    /**
     * Returns the value of the '<em><b>Kqi</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * PI controller gain of integral component (<i>Kqi</i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kqi</em>' attribute.
     * @see #isSetKqi()
     * @see #unsetKqi()
     * @see #setKqi(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcSK_Kqi()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcSK.kqi' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKqi();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getKqi <em>Kqi</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kqi</em>' attribute.
     * @see #isSetKqi()
     * @see #unsetKqi()
     * @see #getKqi()
     * @generated
     */
    void setKqi( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getKqi <em>Kqi</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKqi()
     * @see #getKqi()
     * @see #setKqi(Double)
     * @generated
     */
    void unsetKqi();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getKqi <em>Kqi</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kqi</em>' attribute is set.
     * @see #unsetKqi()
     * @see #getKqi()
     * @see #setKqi(Double)
     * @generated
     */
    boolean isSetKqi();

    /**
     * Returns the value of the '<em><b>Kce</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Rectifier regulation factor (<i>Kce</i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kce</em>' attribute.
     * @see #isSetKce()
     * @see #unsetKce()
     * @see #setKce(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcSK_Kce()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcSK.kce' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKce();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getKce <em>Kce</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kce</em>' attribute.
     * @see #isSetKce()
     * @see #unsetKce()
     * @see #getKce()
     * @generated
     */
    void setKce( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getKce <em>Kce</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKce()
     * @see #getKce()
     * @see #setKce(Double)
     * @generated
     */
    void unsetKce();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getKce <em>Kce</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kce</em>' attribute is set.
     * @see #unsetKce()
     * @see #getKce()
     * @see #setKce(Double)
     * @generated
     */
    boolean isSetKce();

    /**
     * Returns the value of the '<em><b>Nq</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Deadband of reactive power (<i>nq</i>).  Determines the range of sensitivity.  Typical value = 0,001.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Nq</em>' attribute.
     * @see #isSetNq()
     * @see #unsetNq()
     * @see #setNq(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcSK_Nq()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcSK.nq' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getNq();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getNq <em>Nq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Nq</em>' attribute.
     * @see #isSetNq()
     * @see #unsetNq()
     * @see #getNq()
     * @generated
     */
    void setNq( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getNq <em>Nq</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNq()
     * @see #getNq()
     * @see #setNq(Double)
     * @generated
     */
    void unsetNq();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getNq <em>Nq</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Nq</em>' attribute is set.
     * @see #unsetNq()
     * @see #getNq()
     * @see #setNq(Double)
     * @generated
     */
    boolean isSetNq();

    /**
     * Returns the value of the '<em><b>K2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Parameter of underexcitation limit (<i>K2</i>).  Typical value = -0,3861.
     * <!-- end-model-doc -->
     * @return the value of the '<em>K2</em>' attribute.
     * @see #isSetK2()
     * @see #unsetK2()
     * @see #setK2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcSK_K2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcSK.k2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getK2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getK2 <em>K2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>K2</em>' attribute.
     * @see #isSetK2()
     * @see #unsetK2()
     * @see #getK2()
     * @generated
     */
    void setK2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getK2 <em>K2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetK2()
     * @see #getK2()
     * @see #setK2(Double)
     * @generated
     */
    void unsetK2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getK2 <em>K2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>K2</em>' attribute is set.
     * @see #unsetK2()
     * @see #getK2()
     * @see #setK2(Double)
     * @generated
     */
    boolean isSetK2();

    /**
     * Returns the value of the '<em><b>K1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Parameter of underexcitation limit (<i>K1</i>).  Typical value = 0,1364.
     * <!-- end-model-doc -->
     * @return the value of the '<em>K1</em>' attribute.
     * @see #isSetK1()
     * @see #unsetK1()
     * @see #setK1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcSK_K1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcSK.k1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getK1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getK1 <em>K1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>K1</em>' attribute.
     * @see #isSetK1()
     * @see #unsetK1()
     * @see #getK1()
     * @generated
     */
    void setK1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getK1 <em>K1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetK1()
     * @see #getK1()
     * @see #setK1(Double)
     * @generated
     */
    void unsetK1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getK1 <em>K1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>K1</em>' attribute is set.
     * @see #unsetK1()
     * @see #getK1()
     * @see #setK1(Double)
     * @generated
     */
    boolean isSetK1();

    /**
     * Returns the value of the '<em><b>Kp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * PI controller gain (<i>Kp</i>).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kp</em>' attribute.
     * @see #isSetKp()
     * @see #unsetKp()
     * @see #setKp(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcSK_Kp()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcSK.kp' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getKp <em>Kp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kp</em>' attribute.
     * @see #isSetKp()
     * @see #unsetKp()
     * @see #getKp()
     * @generated
     */
    void setKp( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getKp <em>Kp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKp()
     * @see #getKp()
     * @see #setKp(Double)
     * @generated
     */
    void unsetKp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getKp <em>Kp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kp</em>' attribute is set.
     * @see #unsetKp()
     * @see #getKp()
     * @see #setKp(Double)
     * @generated
     */
    boolean isSetKp();

    /**
     * Returns the value of the '<em><b>Kd</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Exciter internal reactance (<i>Kd</i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kd</em>' attribute.
     * @see #isSetKd()
     * @see #unsetKd()
     * @see #setKd(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcSK_Kd()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcSK.kd' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKd();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getKd <em>Kd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kd</em>' attribute.
     * @see #isSetKd()
     * @see #unsetKd()
     * @see #getKd()
     * @generated
     */
    void setKd( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getKd <em>Kd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKd()
     * @see #getKd()
     * @see #setKd(Double)
     * @generated
     */
    void unsetKd();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getKd <em>Kd</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kd</em>' attribute is set.
     * @see #unsetKd()
     * @see #getKd()
     * @see #setKd(Double)
     * @generated
     */
    boolean isSetKd();

    /**
     * Returns the value of the '<em><b>Kc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * PI controller gain (<i>Kc</i>).  Typical value = 70.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kc</em>' attribute.
     * @see #isSetKc()
     * @see #unsetKc()
     * @see #setKc(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcSK_Kc()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcSK.kc' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getKc <em>Kc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kc</em>' attribute.
     * @see #isSetKc()
     * @see #unsetKc()
     * @see #getKc()
     * @generated
     */
    void setKc( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getKc <em>Kc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKc()
     * @see #getKc()
     * @see #setKc(Double)
     * @generated
     */
    void unsetKc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getKc <em>Kc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kc</em>' attribute is set.
     * @see #unsetKc()
     * @see #getKc()
     * @see #setKc(Double)
     * @generated
     */
    boolean isSetKc();

    /**
     * Returns the value of the '<em><b>Tr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Voltage transducer time constant (<i>Tr</i>) (&gt;= 0).  Typical value = 0,01.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tr</em>' attribute.
     * @see #isSetTr()
     * @see #unsetTr()
     * @see #setTr(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcSK_Tr()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcSK.tr' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTr();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getTr <em>Tr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tr</em>' attribute.
     * @see #isSetTr()
     * @see #unsetTr()
     * @see #getTr()
     * @generated
     */
    void setTr( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getTr <em>Tr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTr()
     * @see #getTr()
     * @see #setTr(Double)
     * @generated
     */
    void unsetTr();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getTr <em>Tr</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tr</em>' attribute is set.
     * @see #unsetTr()
     * @see #getTr()
     * @see #setTr(Double)
     * @generated
     */
    boolean isSetTr();

    /**
     * Returns the value of the '<em><b>Ti</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * PI controller phase lead time constant (<i>Ti</i>) (&gt;= 0).  Typical value = 2.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ti</em>' attribute.
     * @see #isSetTi()
     * @see #unsetTi()
     * @see #setTi(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcSK_Ti()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcSK.ti' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTi();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getTi <em>Ti</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ti</em>' attribute.
     * @see #isSetTi()
     * @see #unsetTi()
     * @see #getTi()
     * @generated
     */
    void setTi( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getTi <em>Ti</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTi()
     * @see #getTi()
     * @see #setTi(Double)
     * @generated
     */
    void unsetTi();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getTi <em>Ti</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ti</em>' attribute is set.
     * @see #unsetTi()
     * @see #getTi()
     * @see #setTi(Double)
     * @generated
     */
    boolean isSetTi();

    /**
     * Returns the value of the '<em><b>Tc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * PI controller phase lead time constant (<i>Tc</i>) (&gt;= 0).  Typical value = 8.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tc</em>' attribute.
     * @see #isSetTc()
     * @see #unsetTc()
     * @see #setTc(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcSK_Tc()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcSK.tc' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getTc <em>Tc</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getTc <em>Tc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTc()
     * @see #getTc()
     * @see #setTc(Double)
     * @generated
     */
    void unsetTc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getTc <em>Tc</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Te</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time constant of gain block (<i>Te</i>) (&gt;= 0).  Typical value = 0,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Te</em>' attribute.
     * @see #isSetTe()
     * @see #unsetTe()
     * @see #setTe(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcSK_Te()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcSK.te' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTe();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getTe <em>Te</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Te</em>' attribute.
     * @see #isSetTe()
     * @see #unsetTe()
     * @see #getTe()
     * @generated
     */
    void setTe( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getTe <em>Te</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTe()
     * @see #getTe()
     * @see #setTe(Double)
     * @generated
     */
    void unsetTe();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getTe <em>Te</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Te</em>' attribute is set.
     * @see #unsetTe()
     * @see #getTe()
     * @see #setTe(Double)
     * @generated
     */
    boolean isSetTe();

    /**
     * Returns the value of the '<em><b>Tp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time constant (<i>Tp</i>) (&gt;= 0).  Typical value = 0,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tp</em>' attribute.
     * @see #isSetTp()
     * @see #unsetTp()
     * @see #setTp(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcSK_Tp()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcSK.tp' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getTp <em>Tp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tp</em>' attribute.
     * @see #isSetTp()
     * @see #unsetTp()
     * @see #getTp()
     * @generated
     */
    void setTp( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getTp <em>Tp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTp()
     * @see #getTp()
     * @see #setTp(Double)
     * @generated
     */
    void unsetTp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getTp <em>Tp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tp</em>' attribute is set.
     * @see #unsetTp()
     * @see #getTp()
     * @see #setTp(Double)
     * @generated
     */
    boolean isSetTp();

    /**
     * Returns the value of the '<em><b>Qz</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Desired value (setpoint) of reactive power, manual setting (<i>Qz</i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Qz</em>' attribute.
     * @see #isSetQz()
     * @see #unsetQz()
     * @see #setQz(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcSK_Qz()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcSK.qz' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getQz();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getQz <em>Qz</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Qz</em>' attribute.
     * @see #isSetQz()
     * @see #unsetQz()
     * @see #getQz()
     * @generated
     */
    void setQz( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getQz <em>Qz</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQz()
     * @see #getQz()
     * @see #setQz(Double)
     * @generated
     */
    void unsetQz();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getQz <em>Qz</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Qz</em>' attribute is set.
     * @see #unsetQz()
     * @see #getQz()
     * @see #setQz(Double)
     * @generated
     */
    boolean isSetQz();

    /**
     * Returns the value of the '<em><b>Kqob</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Rate of rise of the reactive power (<i>Kqob</i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kqob</em>' attribute.
     * @see #isSetKqob()
     * @see #unsetKqob()
     * @see #setKqob(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcSK_Kqob()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcSK.kqob' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKqob();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getKqob <em>Kqob</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kqob</em>' attribute.
     * @see #isSetKqob()
     * @see #unsetKqob()
     * @see #getKqob()
     * @generated
     */
    void setKqob( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getKqob <em>Kqob</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKqob()
     * @see #getKqob()
     * @see #setKqob(Double)
     * @generated
     */
    void unsetKqob();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getKqob <em>Kqob</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kqob</em>' attribute is set.
     * @see #unsetKqob()
     * @see #getKqob()
     * @see #setKqob(Double)
     * @generated
     */
    boolean isSetKqob();

    /**
     * Returns the value of the '<em><b>Yp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum output (<i>Yp</i>).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Yp</em>' attribute.
     * @see #isSetYp()
     * @see #unsetYp()
     * @see #setYp(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcSK_Yp()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcSK.yp' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getYp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getYp <em>Yp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Yp</em>' attribute.
     * @see #isSetYp()
     * @see #unsetYp()
     * @see #getYp()
     * @generated
     */
    void setYp( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getYp <em>Yp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetYp()
     * @see #getYp()
     * @see #setYp(Double)
     * @generated
     */
    void unsetYp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getYp <em>Yp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Yp</em>' attribute is set.
     * @see #unsetYp()
     * @see #getYp()
     * @see #setYp(Double)
     * @generated
     */
    boolean isSetYp();

    /**
     * Returns the value of the '<em><b>Remote</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Selector to apply automatic calculation in secondary controller model (<i>remote</i>).
     * true = automatic calculation is activated
     * false = manual set is active; the use of desired value of reactive power (<i>Qz</i>) is required.
     * Typical value = true.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Remote</em>' attribute.
     * @see #isSetRemote()
     * @see #unsetRemote()
     * @see #setRemote(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcSK_Remote()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='ExcSK.remote' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getRemote();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getRemote <em>Remote</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Remote</em>' attribute.
     * @see #isSetRemote()
     * @see #unsetRemote()
     * @see #getRemote()
     * @generated
     */
    void setRemote( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getRemote <em>Remote</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRemote()
     * @see #getRemote()
     * @see #setRemote(Boolean)
     * @generated
     */
    void unsetRemote();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getRemote <em>Remote</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Remote</em>' attribute is set.
     * @see #unsetRemote()
     * @see #getRemote()
     * @see #setRemote(Boolean)
     * @generated
     */
    boolean isSetRemote();

    /**
     * Returns the value of the '<em><b>K</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Gain (<i>K</i>).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>K</em>' attribute.
     * @see #isSetK()
     * @see #unsetK()
     * @see #setK(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcSK_K()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcSK.k' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getK();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getK <em>K</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getK <em>K</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetK()
     * @see #getK()
     * @see #setK(Double)
     * @generated
     */
    void unsetK();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getK <em>K</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Efdmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Field voltage clipping upper level limit (<i>Efdmax</i>) (&gt; ExcSK.efdmin).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Efdmax</em>' attribute.
     * @see #isSetEfdmax()
     * @see #unsetEfdmax()
     * @see #setEfdmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcSK_Efdmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcSK.efdmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getEfdmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getEfdmax <em>Efdmax</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getEfdmax <em>Efdmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEfdmax()
     * @see #getEfdmax()
     * @see #setEfdmax(Double)
     * @generated
     */
    void unsetEfdmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getEfdmax <em>Efdmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Efdmax</em>' attribute is set.
     * @see #unsetEfdmax()
     * @see #getEfdmax()
     * @see #setEfdmax(Double)
     * @generated
     */
    boolean isSetEfdmax();

    /**
     * Returns the value of the '<em><b>Efdmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Field voltage clipping lower level limit (<i>Efdmin</i>) (&lt; ExcSK.efdmax).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Efdmin</em>' attribute.
     * @see #isSetEfdmin()
     * @see #unsetEfdmin()
     * @see #setEfdmin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcSK_Efdmin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcSK.efdmin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getEfdmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getEfdmin <em>Efdmin</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getEfdmin <em>Efdmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEfdmin()
     * @see #getEfdmin()
     * @see #setEfdmin(Double)
     * @generated
     */
    void unsetEfdmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getEfdmin <em>Efdmin</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Emin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum field voltage output (<i>Emin</i>) (&lt; ExcSK.emax).  Typical value = -20.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Emin</em>' attribute.
     * @see #isSetEmin()
     * @see #unsetEmin()
     * @see #setEmin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcSK_Emin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcSK.emin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getEmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getEmin <em>Emin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Emin</em>' attribute.
     * @see #isSetEmin()
     * @see #unsetEmin()
     * @see #getEmin()
     * @generated
     */
    void setEmin( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getEmin <em>Emin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEmin()
     * @see #getEmin()
     * @see #setEmin(Double)
     * @generated
     */
    void unsetEmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getEmin <em>Emin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Emin</em>' attribute is set.
     * @see #unsetEmin()
     * @see #getEmin()
     * @see #setEmin(Double)
     * @generated
     */
    boolean isSetEmin();

    /**
     * Returns the value of the '<em><b>Emax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum field voltage output (<i>Emax</i>) (&gt; ExcSK.emin).  Typical value = 20.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Emax</em>' attribute.
     * @see #isSetEmax()
     * @see #unsetEmax()
     * @see #setEmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcSK_Emax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcSK.emax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getEmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getEmax <em>Emax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Emax</em>' attribute.
     * @see #isSetEmax()
     * @see #unsetEmax()
     * @see #getEmax()
     * @generated
     */
    void setEmax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getEmax <em>Emax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEmax()
     * @see #getEmax()
     * @see #setEmax(Double)
     * @generated
     */
    void unsetEmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getEmax <em>Emax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Emax</em>' attribute is set.
     * @see #unsetEmax()
     * @see #getEmax()
     * @see #setEmax(Double)
     * @generated
     */
    boolean isSetEmax();

    /**
     * Returns the value of the '<em><b>Sbase</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Apparent power of the unit (<i>Sbase</i>) (&gt; 0).  Unit = MVA.  Typical value = 259.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Sbase</em>' attribute.
     * @see #isSetSbase()
     * @see #unsetSbase()
     * @see #setSbase(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcSK_Sbase()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ApparentPower" transient="true" ordered="false"
     *        extendedMetaData="name='ExcSK.sbase' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getSbase();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getSbase <em>Sbase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sbase</em>' attribute.
     * @see #isSetSbase()
     * @see #unsetSbase()
     * @see #getSbase()
     * @generated
     */
    void setSbase( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getSbase <em>Sbase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSbase()
     * @see #getSbase()
     * @see #setSbase(Double)
     * @generated
     */
    void unsetSbase();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getSbase <em>Sbase</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sbase</em>' attribute is set.
     * @see #unsetSbase()
     * @see #getSbase()
     * @see #setSbase(Double)
     * @generated
     */
    boolean isSetSbase();

    /**
     * Returns the value of the '<em><b>Urmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum controller output (<i>URmax</i>) (&gt; ExcSK.urmin).  Typical value = 10.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Urmax</em>' attribute.
     * @see #isSetUrmax()
     * @see #unsetUrmax()
     * @see #setUrmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcSK_Urmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcSK.urmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getUrmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getUrmax <em>Urmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Urmax</em>' attribute.
     * @see #isSetUrmax()
     * @see #unsetUrmax()
     * @see #getUrmax()
     * @generated
     */
    void setUrmax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getUrmax <em>Urmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUrmax()
     * @see #getUrmax()
     * @see #setUrmax(Double)
     * @generated
     */
    void unsetUrmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getUrmax <em>Urmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Urmax</em>' attribute is set.
     * @see #unsetUrmax()
     * @see #getUrmax()
     * @see #setUrmax(Double)
     * @generated
     */
    boolean isSetUrmax();

    /**
     * Returns the value of the '<em><b>Vtmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum terminal voltage input (<i>Vtmax</i>) (&gt; ExcSK.vtmin).  Determines the range of voltage deadband.  Typical value = 1,05.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vtmax</em>' attribute.
     * @see #isSetVtmax()
     * @see #unsetVtmax()
     * @see #setVtmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcSK_Vtmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcSK.vtmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVtmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getVtmax <em>Vtmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vtmax</em>' attribute.
     * @see #isSetVtmax()
     * @see #unsetVtmax()
     * @see #getVtmax()
     * @generated
     */
    void setVtmax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getVtmax <em>Vtmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVtmax()
     * @see #getVtmax()
     * @see #setVtmax(Double)
     * @generated
     */
    void unsetVtmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getVtmax <em>Vtmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vtmax</em>' attribute is set.
     * @see #unsetVtmax()
     * @see #getVtmax()
     * @see #setVtmax(Double)
     * @generated
     */
    boolean isSetVtmax();

    /**
     * Returns the value of the '<em><b>Urmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum controller output (<i>URmin</i>) (&lt; ExcSK.urmax).  Typical value = -10.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Urmin</em>' attribute.
     * @see #isSetUrmin()
     * @see #unsetUrmin()
     * @see #setUrmin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcSK_Urmin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcSK.urmin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getUrmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getUrmin <em>Urmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Urmin</em>' attribute.
     * @see #isSetUrmin()
     * @see #unsetUrmin()
     * @see #getUrmin()
     * @generated
     */
    void setUrmin( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getUrmin <em>Urmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUrmin()
     * @see #getUrmin()
     * @see #setUrmin(Double)
     * @generated
     */
    void unsetUrmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getUrmin <em>Urmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Urmin</em>' attribute is set.
     * @see #unsetUrmin()
     * @see #getUrmin()
     * @see #setUrmin(Double)
     * @generated
     */
    boolean isSetUrmin();

    /**
     * Returns the value of the '<em><b>Vtmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum terminal voltage input (<i>Vtmin</i>) (&lt; ExcSK.vtmax).  Determines the range of voltage deadband.  Typical value = 0,95.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vtmin</em>' attribute.
     * @see #isSetVtmin()
     * @see #unsetVtmin()
     * @see #setVtmin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcSK_Vtmin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcSK.vtmin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVtmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getVtmin <em>Vtmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vtmin</em>' attribute.
     * @see #isSetVtmin()
     * @see #unsetVtmin()
     * @see #getVtmin()
     * @generated
     */
    void setVtmin( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getVtmin <em>Vtmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVtmin()
     * @see #getVtmin()
     * @see #setVtmin(Double)
     * @generated
     */
    void unsetVtmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getVtmin <em>Vtmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vtmin</em>' attribute is set.
     * @see #unsetVtmin()
     * @see #getVtmin()
     * @see #setVtmin(Double)
     * @generated
     */
    boolean isSetVtmin();

    /**
     * Returns the value of the '<em><b>Kgob</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * P controller gain (<i>Kgob</i>).  Typical value = 10.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kgob</em>' attribute.
     * @see #isSetKgob()
     * @see #unsetKgob()
     * @see #setKgob(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcSK_Kgob()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcSK.kgob' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKgob();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getKgob <em>Kgob</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kgob</em>' attribute.
     * @see #isSetKgob()
     * @see #unsetKgob()
     * @see #getKgob()
     * @generated
     */
    void setKgob( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getKgob <em>Kgob</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKgob()
     * @see #getKgob()
     * @see #setKgob(Double)
     * @generated
     */
    void unsetKgob();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getKgob <em>Kgob</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kgob</em>' attribute is set.
     * @see #unsetKgob()
     * @see #getKgob()
     * @see #setKgob(Double)
     * @generated
     */
    boolean isSetKgob();

    /**
     * Returns the value of the '<em><b>Uimax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum error (<i>UImax</i>) (&gt; ExcSK.uimin).  Typical value = 10.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Uimax</em>' attribute.
     * @see #isSetUimax()
     * @see #unsetUimax()
     * @see #setUimax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcSK_Uimax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcSK.uimax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getUimax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getUimax <em>Uimax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Uimax</em>' attribute.
     * @see #isSetUimax()
     * @see #unsetUimax()
     * @see #getUimax()
     * @generated
     */
    void setUimax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getUimax <em>Uimax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUimax()
     * @see #getUimax()
     * @see #setUimax(Double)
     * @generated
     */
    void unsetUimax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getUimax <em>Uimax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Uimax</em>' attribute is set.
     * @see #unsetUimax()
     * @see #getUimax()
     * @see #setUimax(Double)
     * @generated
     */
    boolean isSetUimax();

    /**
     * Returns the value of the '<em><b>Uimin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum error (<i>UImin</i>) (&lt; ExcSK.uimax).  Typical value = -10.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Uimin</em>' attribute.
     * @see #isSetUimin()
     * @see #unsetUimin()
     * @see #setUimin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcSK_Uimin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcSK.uimin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getUimin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getUimin <em>Uimin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Uimin</em>' attribute.
     * @see #isSetUimin()
     * @see #unsetUimin()
     * @see #getUimin()
     * @generated
     */
    void setUimin( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getUimin <em>Uimin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUimin()
     * @see #getUimin()
     * @see #setUimin(Double)
     * @generated
     */
    void unsetUimin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcSK#getUimin <em>Uimin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Uimin</em>' attribute is set.
     * @see #unsetUimin()
     * @see #getUimin()
     * @see #setUimin(Double)
     * @generated
     */
    boolean isSetUimin();

} // ExcSK

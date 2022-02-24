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
 * A representation of the model object '<em><b>Load Motor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Aggregate induction motor load. This model is used to represent a fraction of an ordinary load as "induction motor load".  It allows a load that is treated as an ordinary constant power in power flow analysis to be represented by an induction motor in dynamic simulation. This model is intended for representation of aggregations of many motors dispersed through a load represented at a high voltage bus but where there is no information on the characteristics of individual motors.
 * Either a "one-cage" or "two-cage" model of the induction machine can be modelled. Magnetic saturation is not modelled.
 * This model treats a fraction of the constant power part of a load as a motor. During initialisation, the initial power drawn by the motor is set equal to <i>Pfrac</i> times the constant <i>P</i> part of the static load.  The remainder of the load is left as a static load.
 * The reactive power demand of the motor is calculated during initialisation as a function of voltage at the load bus. This reactive power demand can be less than or greater than the constant <i>Q</i> component of the load.  If the motor's reactive demand is greater than the constant <i>Q</i> component of the load, the model inserts a shunt capacitor at the terminal of the motor to bring its reactive demand down to equal the constant <i>Q</i> reactive load.
 * If an induction motor load model and a static load model are both present for a load, the motor <i>Pfrac</i> is assumed to be subtracted from the power flow constant <i>P</i> load before the static load model is applied.  The remainder of the load, if any, is then represented by the static load model.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadMotor#getPfrac <em>Pfrac</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadMotor#getTbkr <em>Tbkr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadMotor#getLpp <em>Lpp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadMotor#getD <em>D</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadMotor#getH <em>H</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadMotor#getTpo <em>Tpo</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadMotor#getLoadAggregate <em>Load Aggregate</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadMotor#getLfac <em>Lfac</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadMotor#getLp <em>Lp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadMotor#getLs <em>Ls</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadMotor#getRa <em>Ra</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadMotor#getTv <em>Tv</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadMotor#getVt <em>Vt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadMotor#getTppo <em>Tppo</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadMotor()
 * @model
 * @generated
 */
public interface LoadMotor extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Pfrac</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Fraction of constant-power load to be represented by this motor model (<i>Pfrac</i>) (&gt;= 0,0 and &lt;= 1,0).  Typical value = 0,3.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pfrac</em>' attribute.
     * @see #isSetPfrac()
     * @see #unsetPfrac()
     * @see #setPfrac(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadMotor_Pfrac()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='LoadMotor.pfrac' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPfrac();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadMotor#getPfrac <em>Pfrac</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pfrac</em>' attribute.
     * @see #isSetPfrac()
     * @see #unsetPfrac()
     * @see #getPfrac()
     * @generated
     */
    void setPfrac( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadMotor#getPfrac <em>Pfrac</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPfrac()
     * @see #getPfrac()
     * @see #setPfrac(Double)
     * @generated
     */
    void unsetPfrac();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadMotor#getPfrac <em>Pfrac</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pfrac</em>' attribute is set.
     * @see #unsetPfrac()
     * @see #getPfrac()
     * @see #setPfrac(Double)
     * @generated
     */
    boolean isSetPfrac();

    /**
     * Returns the value of the '<em><b>Tbkr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Circuit breaker operating time (<i>Tbkr</i>) (&gt;= 0).  Typical value = 0,08.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tbkr</em>' attribute.
     * @see #isSetTbkr()
     * @see #unsetTbkr()
     * @see #setTbkr(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadMotor_Tbkr()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='LoadMotor.tbkr' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTbkr();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadMotor#getTbkr <em>Tbkr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tbkr</em>' attribute.
     * @see #isSetTbkr()
     * @see #unsetTbkr()
     * @see #getTbkr()
     * @generated
     */
    void setTbkr( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadMotor#getTbkr <em>Tbkr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTbkr()
     * @see #getTbkr()
     * @see #setTbkr(Double)
     * @generated
     */
    void unsetTbkr();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadMotor#getTbkr <em>Tbkr</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tbkr</em>' attribute is set.
     * @see #unsetTbkr()
     * @see #getTbkr()
     * @see #setTbkr(Double)
     * @generated
     */
    boolean isSetTbkr();

    /**
     * Returns the value of the '<em><b>Lpp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Subtransient reactance (<i>Lpp</i>).  Typical value = 0,15.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Lpp</em>' attribute.
     * @see #isSetLpp()
     * @see #unsetLpp()
     * @see #setLpp(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadMotor_Lpp()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='LoadMotor.lpp' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getLpp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadMotor#getLpp <em>Lpp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lpp</em>' attribute.
     * @see #isSetLpp()
     * @see #unsetLpp()
     * @see #getLpp()
     * @generated
     */
    void setLpp( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadMotor#getLpp <em>Lpp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLpp()
     * @see #getLpp()
     * @see #setLpp(Double)
     * @generated
     */
    void unsetLpp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadMotor#getLpp <em>Lpp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Lpp</em>' attribute is set.
     * @see #unsetLpp()
     * @see #getLpp()
     * @see #setLpp(Double)
     * @generated
     */
    boolean isSetLpp();

    /**
     * Returns the value of the '<em><b>D</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Damping factor (<i>D</i>).  Unit = delta <i>P</i>/delta speed.  Typical value = 2.
     * <!-- end-model-doc -->
     * @return the value of the '<em>D</em>' attribute.
     * @see #isSetD()
     * @see #unsetD()
     * @see #setD(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadMotor_D()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='LoadMotor.d' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getD();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadMotor#getD <em>D</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>D</em>' attribute.
     * @see #isSetD()
     * @see #unsetD()
     * @see #getD()
     * @generated
     */
    void setD( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadMotor#getD <em>D</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetD()
     * @see #getD()
     * @see #setD(Double)
     * @generated
     */
    void unsetD();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadMotor#getD <em>D</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>D</em>' attribute is set.
     * @see #unsetD()
     * @see #getD()
     * @see #setD(Double)
     * @generated
     */
    boolean isSetD();

    /**
     * Returns the value of the '<em><b>H</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Inertia constant (<i>H</i>) (&gt;= 0).  Typical value = 0,4.
     * <!-- end-model-doc -->
     * @return the value of the '<em>H</em>' attribute.
     * @see #isSetH()
     * @see #unsetH()
     * @see #setH(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadMotor_H()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='LoadMotor.h' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getH();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadMotor#getH <em>H</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>H</em>' attribute.
     * @see #isSetH()
     * @see #unsetH()
     * @see #getH()
     * @generated
     */
    void setH( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadMotor#getH <em>H</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetH()
     * @see #getH()
     * @see #setH(Double)
     * @generated
     */
    void unsetH();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadMotor#getH <em>H</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>H</em>' attribute is set.
     * @see #unsetH()
     * @see #getH()
     * @see #setH(Double)
     * @generated
     */
    boolean isSetH();

    /**
     * Returns the value of the '<em><b>Tpo</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Transient rotor time constant (<i>Tpo</i>) (&gt;= 0).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tpo</em>' attribute.
     * @see #isSetTpo()
     * @see #unsetTpo()
     * @see #setTpo(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadMotor_Tpo()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='LoadMotor.tpo' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTpo();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadMotor#getTpo <em>Tpo</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadMotor#getTpo <em>Tpo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTpo()
     * @see #getTpo()
     * @see #setTpo(Double)
     * @generated
     */
    void unsetTpo();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadMotor#getTpo <em>Tpo</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tpo</em>' attribute is set.
     * @see #unsetTpo()
     * @see #getTpo()
     * @see #setTpo(Double)
     * @generated
     */
    boolean isSetTpo();

    /**
     * Returns the value of the '<em><b>Load Aggregate</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadAggregate#getLoadMotor <em>Load Motor</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Aggregate load to which this aggregate motor (dynamic) load belongs.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Load Aggregate</em>' reference.
     * @see #isSetLoadAggregate()
     * @see #unsetLoadAggregate()
     * @see #setLoadAggregate(LoadAggregate)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadMotor_LoadAggregate()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadAggregate#getLoadMotor
     * @model opposite="LoadMotor" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='LoadMotor.LoadAggregate' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    LoadAggregate getLoadAggregate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadMotor#getLoadAggregate <em>Load Aggregate</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Load Aggregate</em>' reference.
     * @see #isSetLoadAggregate()
     * @see #unsetLoadAggregate()
     * @see #getLoadAggregate()
     * @generated
     */
    void setLoadAggregate( LoadAggregate value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadMotor#getLoadAggregate <em>Load Aggregate</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLoadAggregate()
     * @see #getLoadAggregate()
     * @see #setLoadAggregate(LoadAggregate)
     * @generated
     */
    void unsetLoadAggregate();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadMotor#getLoadAggregate <em>Load Aggregate</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Load Aggregate</em>' reference is set.
     * @see #unsetLoadAggregate()
     * @see #getLoadAggregate()
     * @see #setLoadAggregate(LoadAggregate)
     * @generated
     */
    boolean isSetLoadAggregate();

    /**
     * Returns the value of the '<em><b>Lfac</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Loading factor (<i>Lfac</i>). The ratio of initial <i>P</i> to motor MVA base.  Typical value = 0,8.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Lfac</em>' attribute.
     * @see #isSetLfac()
     * @see #unsetLfac()
     * @see #setLfac(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadMotor_Lfac()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='LoadMotor.lfac' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getLfac();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadMotor#getLfac <em>Lfac</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lfac</em>' attribute.
     * @see #isSetLfac()
     * @see #unsetLfac()
     * @see #getLfac()
     * @generated
     */
    void setLfac( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadMotor#getLfac <em>Lfac</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLfac()
     * @see #getLfac()
     * @see #setLfac(Double)
     * @generated
     */
    void unsetLfac();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadMotor#getLfac <em>Lfac</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Lfac</em>' attribute is set.
     * @see #unsetLfac()
     * @see #getLfac()
     * @see #setLfac(Double)
     * @generated
     */
    boolean isSetLfac();

    /**
     * Returns the value of the '<em><b>Lp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Transient reactance (<i>Lp</i>).  Typical value = 0,15.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Lp</em>' attribute.
     * @see #isSetLp()
     * @see #unsetLp()
     * @see #setLp(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadMotor_Lp()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='LoadMotor.lp' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getLp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadMotor#getLp <em>Lp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lp</em>' attribute.
     * @see #isSetLp()
     * @see #unsetLp()
     * @see #getLp()
     * @generated
     */
    void setLp( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadMotor#getLp <em>Lp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLp()
     * @see #getLp()
     * @see #setLp(Double)
     * @generated
     */
    void unsetLp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadMotor#getLp <em>Lp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Lp</em>' attribute is set.
     * @see #unsetLp()
     * @see #getLp()
     * @see #setLp(Double)
     * @generated
     */
    boolean isSetLp();

    /**
     * Returns the value of the '<em><b>Ls</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Synchronous reactance (<i>Ls</i>).  Typical value = 3,2.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ls</em>' attribute.
     * @see #isSetLs()
     * @see #unsetLs()
     * @see #setLs(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadMotor_Ls()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='LoadMotor.ls' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getLs();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadMotor#getLs <em>Ls</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ls</em>' attribute.
     * @see #isSetLs()
     * @see #unsetLs()
     * @see #getLs()
     * @generated
     */
    void setLs( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadMotor#getLs <em>Ls</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLs()
     * @see #getLs()
     * @see #setLs(Double)
     * @generated
     */
    void unsetLs();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadMotor#getLs <em>Ls</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ls</em>' attribute is set.
     * @see #unsetLs()
     * @see #getLs()
     * @see #setLs(Double)
     * @generated
     */
    boolean isSetLs();

    /**
     * Returns the value of the '<em><b>Ra</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Stator resistance (<i>Ra</i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ra</em>' attribute.
     * @see #isSetRa()
     * @see #unsetRa()
     * @see #setRa(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadMotor_Ra()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='LoadMotor.ra' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getRa();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadMotor#getRa <em>Ra</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ra</em>' attribute.
     * @see #isSetRa()
     * @see #unsetRa()
     * @see #getRa()
     * @generated
     */
    void setRa( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadMotor#getRa <em>Ra</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRa()
     * @see #getRa()
     * @see #setRa(Double)
     * @generated
     */
    void unsetRa();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadMotor#getRa <em>Ra</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ra</em>' attribute is set.
     * @see #unsetRa()
     * @see #getRa()
     * @see #setRa(Double)
     * @generated
     */
    boolean isSetRa();

    /**
     * Returns the value of the '<em><b>Tv</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Voltage trip pickup time (<i>Tv</i>) (&gt;= 0).  Typical value = 0,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tv</em>' attribute.
     * @see #isSetTv()
     * @see #unsetTv()
     * @see #setTv(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadMotor_Tv()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='LoadMotor.tv' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTv();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadMotor#getTv <em>Tv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tv</em>' attribute.
     * @see #isSetTv()
     * @see #unsetTv()
     * @see #getTv()
     * @generated
     */
    void setTv( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadMotor#getTv <em>Tv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTv()
     * @see #getTv()
     * @see #setTv(Double)
     * @generated
     */
    void unsetTv();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadMotor#getTv <em>Tv</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tv</em>' attribute is set.
     * @see #unsetTv()
     * @see #getTv()
     * @see #setTv(Double)
     * @generated
     */
    boolean isSetTv();

    /**
     * Returns the value of the '<em><b>Vt</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Voltage threshold for tripping (<i>Vt</i>).  Typical value = 0,7.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vt</em>' attribute.
     * @see #isSetVt()
     * @see #unsetVt()
     * @see #setVt(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadMotor_Vt()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='LoadMotor.vt' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVt();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadMotor#getVt <em>Vt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vt</em>' attribute.
     * @see #isSetVt()
     * @see #unsetVt()
     * @see #getVt()
     * @generated
     */
    void setVt( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadMotor#getVt <em>Vt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVt()
     * @see #getVt()
     * @see #setVt(Double)
     * @generated
     */
    void unsetVt();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadMotor#getVt <em>Vt</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vt</em>' attribute is set.
     * @see #unsetVt()
     * @see #getVt()
     * @see #setVt(Double)
     * @generated
     */
    boolean isSetVt();

    /**
     * Returns the value of the '<em><b>Tppo</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Subtransient rotor time constant (<i>Tppo</i>) (&gt;= 0).  Typical value = 0,02.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tppo</em>' attribute.
     * @see #isSetTppo()
     * @see #unsetTppo()
     * @see #setTppo(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadMotor_Tppo()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='LoadMotor.tppo' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTppo();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadMotor#getTppo <em>Tppo</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadMotor#getTppo <em>Tppo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTppo()
     * @see #getTppo()
     * @see #setTppo(Double)
     * @generated
     */
    void unsetTppo();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadMotor#getTppo <em>Tppo</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tppo</em>' attribute is set.
     * @see #unsetTppo()
     * @see #getTppo()
     * @see #setTppo(Double)
     * @generated
     */
    boolean isSetTppo();

} // LoadMotor

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
 * A representation of the model object '<em><b>Turb LCFB1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Turbine load controller model developed by WECC.  This model represents a supervisory turbine load controller that acts to maintain turbine power at a set value by continuous adjustment of the turbine governor speed-load reference. This model is intended to represent slow reset 'outer loop' controllers managing the action of the turbine governor.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbLCFB1#getEmax <em>Emax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbLCFB1#getTpelec <em>Tpelec</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbLCFB1#getFb <em>Fb</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbLCFB1#getDb <em>Db</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbLCFB1#getKi <em>Ki</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbLCFB1#getKp <em>Kp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbLCFB1#getFbf <em>Fbf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbLCFB1#getIrmax <em>Irmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbLCFB1#getPbf <em>Pbf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbLCFB1#getPmwset <em>Pmwset</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbLCFB1#getSpeedReferenceGovernor <em>Speed Reference Governor</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbLCFB1#getMwbase <em>Mwbase</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTurbLCFB1()
 * @model
 * @generated
 */
public interface TurbLCFB1 extends TurbineLoadControllerDynamics {
    /**
     * Returns the value of the '<em><b>Emax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum control error (<i>Emax</i>) (see parameter detail 4).  Typical value = 0,02.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Emax</em>' attribute.
     * @see #isSetEmax()
     * @see #unsetEmax()
     * @see #setEmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTurbLCFB1_Emax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='TurbLCFB1.emax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getEmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbLCFB1#getEmax <em>Emax</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbLCFB1#getEmax <em>Emax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEmax()
     * @see #getEmax()
     * @see #setEmax(Double)
     * @generated
     */
    void unsetEmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbLCFB1#getEmax <em>Emax</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Tpelec</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Power transducer time constant (<i>Tpelec</i>) (&gt;= 0).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tpelec</em>' attribute.
     * @see #isSetTpelec()
     * @see #unsetTpelec()
     * @see #setTpelec(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTurbLCFB1_Tpelec()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='TurbLCFB1.tpelec' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTpelec();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbLCFB1#getTpelec <em>Tpelec</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tpelec</em>' attribute.
     * @see #isSetTpelec()
     * @see #unsetTpelec()
     * @see #getTpelec()
     * @generated
     */
    void setTpelec( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbLCFB1#getTpelec <em>Tpelec</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTpelec()
     * @see #getTpelec()
     * @see #setTpelec(Double)
     * @generated
     */
    void unsetTpelec();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbLCFB1#getTpelec <em>Tpelec</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tpelec</em>' attribute is set.
     * @see #unsetTpelec()
     * @see #getTpelec()
     * @see #setTpelec(Double)
     * @generated
     */
    boolean isSetTpelec();

    /**
     * Returns the value of the '<em><b>Fb</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Frequency bias gain (<i>Fb</i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Fb</em>' attribute.
     * @see #isSetFb()
     * @see #unsetFb()
     * @see #setFb(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTurbLCFB1_Fb()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='TurbLCFB1.fb' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getFb();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbLCFB1#getFb <em>Fb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fb</em>' attribute.
     * @see #isSetFb()
     * @see #unsetFb()
     * @see #getFb()
     * @generated
     */
    void setFb( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbLCFB1#getFb <em>Fb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFb()
     * @see #getFb()
     * @see #setFb(Double)
     * @generated
     */
    void unsetFb();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbLCFB1#getFb <em>Fb</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Fb</em>' attribute is set.
     * @see #unsetFb()
     * @see #getFb()
     * @see #setFb(Double)
     * @generated
     */
    boolean isSetFb();

    /**
     * Returns the value of the '<em><b>Db</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Controller deadband (<i>db</i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Db</em>' attribute.
     * @see #isSetDb()
     * @see #unsetDb()
     * @see #setDb(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTurbLCFB1_Db()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='TurbLCFB1.db' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getDb();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbLCFB1#getDb <em>Db</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Db</em>' attribute.
     * @see #isSetDb()
     * @see #unsetDb()
     * @see #getDb()
     * @generated
     */
    void setDb( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbLCFB1#getDb <em>Db</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDb()
     * @see #getDb()
     * @see #setDb(Double)
     * @generated
     */
    void unsetDb();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbLCFB1#getDb <em>Db</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Db</em>' attribute is set.
     * @see #unsetDb()
     * @see #getDb()
     * @see #setDb(Double)
     * @generated
     */
    boolean isSetDb();

    /**
     * Returns the value of the '<em><b>Ki</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Integral gain (<i>Ki</i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ki</em>' attribute.
     * @see #isSetKi()
     * @see #unsetKi()
     * @see #setKi(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTurbLCFB1_Ki()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='TurbLCFB1.ki' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKi();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbLCFB1#getKi <em>Ki</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ki</em>' attribute.
     * @see #isSetKi()
     * @see #unsetKi()
     * @see #getKi()
     * @generated
     */
    void setKi( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbLCFB1#getKi <em>Ki</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKi()
     * @see #getKi()
     * @see #setKi(Double)
     * @generated
     */
    void unsetKi();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbLCFB1#getKi <em>Ki</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ki</em>' attribute is set.
     * @see #unsetKi()
     * @see #getKi()
     * @see #setKi(Double)
     * @generated
     */
    boolean isSetKi();

    /**
     * Returns the value of the '<em><b>Kp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Proportional gain (<i>Kp</i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kp</em>' attribute.
     * @see #isSetKp()
     * @see #unsetKp()
     * @see #setKp(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTurbLCFB1_Kp()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='TurbLCFB1.kp' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbLCFB1#getKp <em>Kp</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbLCFB1#getKp <em>Kp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKp()
     * @see #getKp()
     * @see #setKp(Double)
     * @generated
     */
    void unsetKp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbLCFB1#getKp <em>Kp</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Fbf</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Frequency bias flag (<i>Fbf</i>).
     * true = enable frequency bias
     * false = disable frequency bias.
     * Typical value = false.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Fbf</em>' attribute.
     * @see #isSetFbf()
     * @see #unsetFbf()
     * @see #setFbf(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTurbLCFB1_Fbf()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='TurbLCFB1.fbf' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getFbf();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbLCFB1#getFbf <em>Fbf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fbf</em>' attribute.
     * @see #isSetFbf()
     * @see #unsetFbf()
     * @see #getFbf()
     * @generated
     */
    void setFbf( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbLCFB1#getFbf <em>Fbf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFbf()
     * @see #getFbf()
     * @see #setFbf(Boolean)
     * @generated
     */
    void unsetFbf();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbLCFB1#getFbf <em>Fbf</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Fbf</em>' attribute is set.
     * @see #unsetFbf()
     * @see #getFbf()
     * @see #setFbf(Boolean)
     * @generated
     */
    boolean isSetFbf();

    /**
     * Returns the value of the '<em><b>Irmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum turbine speed/load reference bias (<i>Irmax</i>) (see parameter detail 3).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Irmax</em>' attribute.
     * @see #isSetIrmax()
     * @see #unsetIrmax()
     * @see #setIrmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTurbLCFB1_Irmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='TurbLCFB1.irmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getIrmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbLCFB1#getIrmax <em>Irmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Irmax</em>' attribute.
     * @see #isSetIrmax()
     * @see #unsetIrmax()
     * @see #getIrmax()
     * @generated
     */
    void setIrmax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbLCFB1#getIrmax <em>Irmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIrmax()
     * @see #getIrmax()
     * @see #setIrmax(Double)
     * @generated
     */
    void unsetIrmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbLCFB1#getIrmax <em>Irmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Irmax</em>' attribute is set.
     * @see #unsetIrmax()
     * @see #getIrmax()
     * @see #setIrmax(Double)
     * @generated
     */
    boolean isSetIrmax();

    /**
     * Returns the value of the '<em><b>Pbf</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Power controller flag (<i>Pbf</i>).
     * true = enable load controller
     * false = disable load controller.
     * Typical value = false.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pbf</em>' attribute.
     * @see #isSetPbf()
     * @see #unsetPbf()
     * @see #setPbf(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTurbLCFB1_Pbf()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='TurbLCFB1.pbf' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getPbf();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbLCFB1#getPbf <em>Pbf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pbf</em>' attribute.
     * @see #isSetPbf()
     * @see #unsetPbf()
     * @see #getPbf()
     * @generated
     */
    void setPbf( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbLCFB1#getPbf <em>Pbf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPbf()
     * @see #getPbf()
     * @see #setPbf(Boolean)
     * @generated
     */
    void unsetPbf();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbLCFB1#getPbf <em>Pbf</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pbf</em>' attribute is set.
     * @see #unsetPbf()
     * @see #getPbf()
     * @see #setPbf(Boolean)
     * @generated
     */
    boolean isSetPbf();

    /**
     * Returns the value of the '<em><b>Pmwset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Power controller setpoint (<i>Pmwset</i>) (see parameter detail 1).  Unit = MW. Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pmwset</em>' attribute.
     * @see #isSetPmwset()
     * @see #unsetPmwset()
     * @see #setPmwset(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTurbLCFB1_Pmwset()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ActivePower" transient="true" ordered="false"
     *        extendedMetaData="name='TurbLCFB1.pmwset' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPmwset();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbLCFB1#getPmwset <em>Pmwset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pmwset</em>' attribute.
     * @see #isSetPmwset()
     * @see #unsetPmwset()
     * @see #getPmwset()
     * @generated
     */
    void setPmwset( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbLCFB1#getPmwset <em>Pmwset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPmwset()
     * @see #getPmwset()
     * @see #setPmwset(Double)
     * @generated
     */
    void unsetPmwset();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbLCFB1#getPmwset <em>Pmwset</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pmwset</em>' attribute is set.
     * @see #unsetPmwset()
     * @see #getPmwset()
     * @see #setPmwset(Double)
     * @generated
     */
    boolean isSetPmwset();

    /**
     * Returns the value of the '<em><b>Speed Reference Governor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Type of turbine governor reference (<i>Type</i>).
     * true = speed reference governor
     * false = load reference governor.
     * Typical value = true.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Speed Reference Governor</em>' attribute.
     * @see #isSetSpeedReferenceGovernor()
     * @see #unsetSpeedReferenceGovernor()
     * @see #setSpeedReferenceGovernor(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTurbLCFB1_SpeedReferenceGovernor()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='TurbLCFB1.speedReferenceGovernor' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getSpeedReferenceGovernor();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbLCFB1#getSpeedReferenceGovernor <em>Speed Reference Governor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Speed Reference Governor</em>' attribute.
     * @see #isSetSpeedReferenceGovernor()
     * @see #unsetSpeedReferenceGovernor()
     * @see #getSpeedReferenceGovernor()
     * @generated
     */
    void setSpeedReferenceGovernor( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbLCFB1#getSpeedReferenceGovernor <em>Speed Reference Governor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSpeedReferenceGovernor()
     * @see #getSpeedReferenceGovernor()
     * @see #setSpeedReferenceGovernor(Boolean)
     * @generated
     */
    void unsetSpeedReferenceGovernor();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbLCFB1#getSpeedReferenceGovernor <em>Speed Reference Governor</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Speed Reference Governor</em>' attribute is set.
     * @see #unsetSpeedReferenceGovernor()
     * @see #getSpeedReferenceGovernor()
     * @see #setSpeedReferenceGovernor(Boolean)
     * @generated
     */
    boolean isSetSpeedReferenceGovernor();

    /**
     * Returns the value of the '<em><b>Mwbase</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Base for power values (<i>MWbase</i>) (&gt; 0).  Unit = MW.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Mwbase</em>' attribute.
     * @see #isSetMwbase()
     * @see #unsetMwbase()
     * @see #setMwbase(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTurbLCFB1_Mwbase()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ActivePower" transient="true" ordered="false"
     *        extendedMetaData="name='TurbLCFB1.mwbase' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getMwbase();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbLCFB1#getMwbase <em>Mwbase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mwbase</em>' attribute.
     * @see #isSetMwbase()
     * @see #unsetMwbase()
     * @see #getMwbase()
     * @generated
     */
    void setMwbase( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbLCFB1#getMwbase <em>Mwbase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMwbase()
     * @see #getMwbase()
     * @see #setMwbase(Double)
     * @generated
     */
    void unsetMwbase();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TurbLCFB1#getMwbase <em>Mwbase</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Mwbase</em>' attribute is set.
     * @see #unsetMwbase()
     * @see #getMwbase()
     * @see #setMwbase(Double)
     * @generated
     */
    boolean isSetMwbase();

} // TurbLCFB1

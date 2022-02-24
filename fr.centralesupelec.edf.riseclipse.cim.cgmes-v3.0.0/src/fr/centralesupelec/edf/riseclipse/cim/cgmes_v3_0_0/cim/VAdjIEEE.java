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
 * A representation of the model object '<em><b>VAdj IEEE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * IEEE voltage adjuster which is used to represent the voltage adjuster in either a power factor or VAr control system.
 * Reference: IEEE 421.5-2005, 11.1.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VAdjIEEE#getVadjmax <em>Vadjmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VAdjIEEE#getVadjmin <em>Vadjmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VAdjIEEE#getAdjslew <em>Adjslew</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VAdjIEEE#getTaon <em>Taon</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VAdjIEEE#getTaoff <em>Taoff</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VAdjIEEE#getVadjf <em>Vadjf</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getVAdjIEEE()
 * @model
 * @generated
 */
public interface VAdjIEEE extends VoltageAdjusterDynamics {
    /**
     * Returns the value of the '<em><b>Vadjmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum output of the adjuster (<i>V</i><i><sub>ADJMAX</sub></i>) (&gt; VAdjIEEE.vadjmin).  Typical value = 1,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vadjmax</em>' attribute.
     * @see #isSetVadjmax()
     * @see #unsetVadjmax()
     * @see #setVadjmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getVAdjIEEE_Vadjmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='VAdjIEEE.vadjmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVadjmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VAdjIEEE#getVadjmax <em>Vadjmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vadjmax</em>' attribute.
     * @see #isSetVadjmax()
     * @see #unsetVadjmax()
     * @see #getVadjmax()
     * @generated
     */
    void setVadjmax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VAdjIEEE#getVadjmax <em>Vadjmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVadjmax()
     * @see #getVadjmax()
     * @see #setVadjmax(Double)
     * @generated
     */
    void unsetVadjmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VAdjIEEE#getVadjmax <em>Vadjmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vadjmax</em>' attribute is set.
     * @see #unsetVadjmax()
     * @see #getVadjmax()
     * @see #setVadjmax(Double)
     * @generated
     */
    boolean isSetVadjmax();

    /**
     * Returns the value of the '<em><b>Vadjmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum output of the adjuster (<i>V</i><i><sub>ADJMIN</sub></i>) (&lt; VAdjIEEE.vadjmax).  Typical value = 0,9.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vadjmin</em>' attribute.
     * @see #isSetVadjmin()
     * @see #unsetVadjmin()
     * @see #setVadjmin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getVAdjIEEE_Vadjmin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='VAdjIEEE.vadjmin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVadjmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VAdjIEEE#getVadjmin <em>Vadjmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vadjmin</em>' attribute.
     * @see #isSetVadjmin()
     * @see #unsetVadjmin()
     * @see #getVadjmin()
     * @generated
     */
    void setVadjmin( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VAdjIEEE#getVadjmin <em>Vadjmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVadjmin()
     * @see #getVadjmin()
     * @see #setVadjmin(Double)
     * @generated
     */
    void unsetVadjmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VAdjIEEE#getVadjmin <em>Vadjmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vadjmin</em>' attribute is set.
     * @see #unsetVadjmin()
     * @see #getVadjmin()
     * @see #setVadjmin(Double)
     * @generated
     */
    boolean isSetVadjmin();

    /**
     * Returns the value of the '<em><b>Adjslew</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Rate at which output of adjuster changes (<i>ADJ_SLEW</i>).  Unit = s / PU.  Typical value = 300.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Adjslew</em>' attribute.
     * @see #isSetAdjslew()
     * @see #unsetAdjslew()
     * @see #setAdjslew(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getVAdjIEEE_Adjslew()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='VAdjIEEE.adjslew' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getAdjslew();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VAdjIEEE#getAdjslew <em>Adjslew</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Adjslew</em>' attribute.
     * @see #isSetAdjslew()
     * @see #unsetAdjslew()
     * @see #getAdjslew()
     * @generated
     */
    void setAdjslew( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VAdjIEEE#getAdjslew <em>Adjslew</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAdjslew()
     * @see #getAdjslew()
     * @see #setAdjslew(Double)
     * @generated
     */
    void unsetAdjslew();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VAdjIEEE#getAdjslew <em>Adjslew</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Adjslew</em>' attribute is set.
     * @see #unsetAdjslew()
     * @see #getAdjslew()
     * @see #setAdjslew(Double)
     * @generated
     */
    boolean isSetAdjslew();

    /**
     * Returns the value of the '<em><b>Taon</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time that adjuster pulses are on (<i>T</i><i><sub>AON</sub></i>) (&gt;= 0).  Typical value = 0,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Taon</em>' attribute.
     * @see #isSetTaon()
     * @see #unsetTaon()
     * @see #setTaon(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getVAdjIEEE_Taon()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='VAdjIEEE.taon' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTaon();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VAdjIEEE#getTaon <em>Taon</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Taon</em>' attribute.
     * @see #isSetTaon()
     * @see #unsetTaon()
     * @see #getTaon()
     * @generated
     */
    void setTaon( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VAdjIEEE#getTaon <em>Taon</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTaon()
     * @see #getTaon()
     * @see #setTaon(Double)
     * @generated
     */
    void unsetTaon();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VAdjIEEE#getTaon <em>Taon</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Taon</em>' attribute is set.
     * @see #unsetTaon()
     * @see #getTaon()
     * @see #setTaon(Double)
     * @generated
     */
    boolean isSetTaon();

    /**
     * Returns the value of the '<em><b>Taoff</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time that adjuster pulses are off (<i>T</i><i><sub>AOFF</sub></i>) (&gt;= 0).  Typical value = 0,5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Taoff</em>' attribute.
     * @see #isSetTaoff()
     * @see #unsetTaoff()
     * @see #setTaoff(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getVAdjIEEE_Taoff()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='VAdjIEEE.taoff' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTaoff();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VAdjIEEE#getTaoff <em>Taoff</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Taoff</em>' attribute.
     * @see #isSetTaoff()
     * @see #unsetTaoff()
     * @see #getTaoff()
     * @generated
     */
    void setTaoff( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VAdjIEEE#getTaoff <em>Taoff</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTaoff()
     * @see #getTaoff()
     * @see #setTaoff(Double)
     * @generated
     */
    void unsetTaoff();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VAdjIEEE#getTaoff <em>Taoff</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Taoff</em>' attribute is set.
     * @see #unsetTaoff()
     * @see #getTaoff()
     * @see #setTaoff(Double)
     * @generated
     */
    boolean isSetTaoff();

    /**
     * Returns the value of the '<em><b>Vadjf</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Set high to provide a continuous raise or lower (<i>V</i><i><sub>ADJF</sub></i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vadjf</em>' attribute.
     * @see #isSetVadjf()
     * @see #unsetVadjf()
     * @see #setVadjf(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getVAdjIEEE_Vadjf()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='VAdjIEEE.vadjf' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVadjf();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VAdjIEEE#getVadjf <em>Vadjf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vadjf</em>' attribute.
     * @see #isSetVadjf()
     * @see #unsetVadjf()
     * @see #getVadjf()
     * @generated
     */
    void setVadjf( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VAdjIEEE#getVadjf <em>Vadjf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVadjf()
     * @see #getVadjf()
     * @see #setVadjf(Double)
     * @generated
     */
    void unsetVadjf();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VAdjIEEE#getVadjf <em>Vadjf</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vadjf</em>' attribute is set.
     * @see #unsetVadjf()
     * @see #getVadjf()
     * @see #setVadjf(Double)
     * @generated
     */
    boolean isSetVadjf();

} // VAdjIEEE

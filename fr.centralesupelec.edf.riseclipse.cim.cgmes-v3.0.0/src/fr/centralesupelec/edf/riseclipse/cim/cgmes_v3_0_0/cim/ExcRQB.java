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
 * A representation of the model object '<em><b>Exc RQB</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Excitation system type RQB (four-loop regulator, r?gulateur quatre boucles, developed in France) primarily used in nuclear or thermal generating units. This excitation system shall be always used together with power system stabilizer type PssRQB.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcRQB#getKi0 <em>Ki0</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcRQB#getKi1 <em>Ki1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcRQB#getT4m <em>T4m</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcRQB#getKlir <em>Klir</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcRQB#getKlus <em>Klus</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcRQB#getUcmax <em>Ucmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcRQB#getUcmin <em>Ucmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcRQB#getLsat <em>Lsat</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcRQB#getMesu <em>Mesu</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcRQB#getTc <em>Tc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcRQB#getTe <em>Te</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcRQB#getTf <em>Tf</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcRQB#getLus <em>Lus</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcRQB()
 * @model
 * @generated
 */
public interface ExcRQB extends ExcitationSystemDynamics {
    /**
     * Returns the value of the '<em><b>Ki0</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Voltage reference input gain (<i>Ki0</i>).  Typical value = 12,7.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ki0</em>' attribute.
     * @see #isSetKi0()
     * @see #unsetKi0()
     * @see #setKi0(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcRQB_Ki0()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='ExcRQB.ki0' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKi0();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcRQB#getKi0 <em>Ki0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ki0</em>' attribute.
     * @see #isSetKi0()
     * @see #unsetKi0()
     * @see #getKi0()
     * @generated
     */
    void setKi0( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcRQB#getKi0 <em>Ki0</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKi0()
     * @see #getKi0()
     * @see #setKi0(Double)
     * @generated
     */
    void unsetKi0();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcRQB#getKi0 <em>Ki0</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ki0</em>' attribute is set.
     * @see #unsetKi0()
     * @see #getKi0()
     * @see #setKi0(Double)
     * @generated
     */
    boolean isSetKi0();

    /**
     * Returns the value of the '<em><b>Ki1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Voltage input gain (<i>Ki1</i>).  Typical value = -16,8.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ki1</em>' attribute.
     * @see #isSetKi1()
     * @see #unsetKi1()
     * @see #setKi1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcRQB_Ki1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='ExcRQB.ki1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKi1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcRQB#getKi1 <em>Ki1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ki1</em>' attribute.
     * @see #isSetKi1()
     * @see #unsetKi1()
     * @see #getKi1()
     * @generated
     */
    void setKi1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcRQB#getKi1 <em>Ki1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKi1()
     * @see #getKi1()
     * @see #setKi1(Double)
     * @generated
     */
    void unsetKi1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcRQB#getKi1 <em>Ki1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ki1</em>' attribute is set.
     * @see #unsetKi1()
     * @see #getKi1()
     * @see #setKi1(Double)
     * @generated
     */
    boolean isSetKi1();

    /**
     * Returns the value of the '<em><b>T4m</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Input time constant (<i>T4M</i>) (&gt;= 0).  Typical value = 5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>T4m</em>' attribute.
     * @see #isSetT4m()
     * @see #unsetT4m()
     * @see #setT4m(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcRQB_T4m()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcRQB.t4m' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getT4m();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcRQB#getT4m <em>T4m</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>T4m</em>' attribute.
     * @see #isSetT4m()
     * @see #unsetT4m()
     * @see #getT4m()
     * @generated
     */
    void setT4m( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcRQB#getT4m <em>T4m</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT4m()
     * @see #getT4m()
     * @see #setT4m(Double)
     * @generated
     */
    void unsetT4m();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcRQB#getT4m <em>T4m</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>T4m</em>' attribute is set.
     * @see #unsetT4m()
     * @see #getT4m()
     * @see #setT4m(Double)
     * @generated
     */
    boolean isSetT4m();

    /**
     * Returns the value of the '<em><b>Klir</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * OEL input gain (<i>KLIR</i>).  Typical value = 12,13.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Klir</em>' attribute.
     * @see #isSetKlir()
     * @see #unsetKlir()
     * @see #setKlir(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcRQB_Klir()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='ExcRQB.klir' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKlir();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcRQB#getKlir <em>Klir</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Klir</em>' attribute.
     * @see #isSetKlir()
     * @see #unsetKlir()
     * @see #getKlir()
     * @generated
     */
    void setKlir( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcRQB#getKlir <em>Klir</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKlir()
     * @see #getKlir()
     * @see #setKlir(Double)
     * @generated
     */
    void unsetKlir();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcRQB#getKlir <em>Klir</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Klir</em>' attribute is set.
     * @see #unsetKlir()
     * @see #getKlir()
     * @see #setKlir(Double)
     * @generated
     */
    boolean isSetKlir();

    /**
     * Returns the value of the '<em><b>Klus</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Limiter gain (<i>KLUS</i>).  Typical value = 50.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Klus</em>' attribute.
     * @see #isSetKlus()
     * @see #unsetKlus()
     * @see #setKlus(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcRQB_Klus()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='ExcRQB.klus' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKlus();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcRQB#getKlus <em>Klus</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Klus</em>' attribute.
     * @see #isSetKlus()
     * @see #unsetKlus()
     * @see #getKlus()
     * @generated
     */
    void setKlus( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcRQB#getKlus <em>Klus</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKlus()
     * @see #getKlus()
     * @see #setKlus(Double)
     * @generated
     */
    void unsetKlus();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcRQB#getKlus <em>Klus</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Klus</em>' attribute is set.
     * @see #unsetKlus()
     * @see #getKlus()
     * @see #setKlus(Double)
     * @generated
     */
    boolean isSetKlus();

    /**
     * Returns the value of the '<em><b>Ucmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum voltage reference limit (<i>UCMAX</i>) (&gt; ExcRQB.ucmin).  Typical value = 1,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ucmax</em>' attribute.
     * @see #isSetUcmax()
     * @see #unsetUcmax()
     * @see #setUcmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcRQB_Ucmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcRQB.ucmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getUcmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcRQB#getUcmax <em>Ucmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ucmax</em>' attribute.
     * @see #isSetUcmax()
     * @see #unsetUcmax()
     * @see #getUcmax()
     * @generated
     */
    void setUcmax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcRQB#getUcmax <em>Ucmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUcmax()
     * @see #getUcmax()
     * @see #setUcmax(Double)
     * @generated
     */
    void unsetUcmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcRQB#getUcmax <em>Ucmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ucmax</em>' attribute is set.
     * @see #unsetUcmax()
     * @see #getUcmax()
     * @see #setUcmax(Double)
     * @generated
     */
    boolean isSetUcmax();

    /**
     * Returns the value of the '<em><b>Ucmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum voltage reference limit (<i>UCMIN</i>) (&lt; ExcRQB.ucmax).  Typical value = 0,9.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ucmin</em>' attribute.
     * @see #isSetUcmin()
     * @see #unsetUcmin()
     * @see #setUcmin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcRQB_Ucmin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcRQB.ucmin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getUcmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcRQB#getUcmin <em>Ucmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ucmin</em>' attribute.
     * @see #isSetUcmin()
     * @see #unsetUcmin()
     * @see #getUcmin()
     * @generated
     */
    void setUcmin( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcRQB#getUcmin <em>Ucmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUcmin()
     * @see #getUcmin()
     * @see #setUcmin(Double)
     * @generated
     */
    void unsetUcmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcRQB#getUcmin <em>Ucmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ucmin</em>' attribute is set.
     * @see #unsetUcmin()
     * @see #getUcmin()
     * @see #setUcmin(Double)
     * @generated
     */
    boolean isSetUcmin();

    /**
     * Returns the value of the '<em><b>Lsat</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Integrator limiter (<i>LSAT</i>).  Typical value = 5,73.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Lsat</em>' attribute.
     * @see #isSetLsat()
     * @see #unsetLsat()
     * @see #setLsat(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcRQB_Lsat()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcRQB.lsat' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getLsat();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcRQB#getLsat <em>Lsat</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lsat</em>' attribute.
     * @see #isSetLsat()
     * @see #unsetLsat()
     * @see #getLsat()
     * @generated
     */
    void setLsat( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcRQB#getLsat <em>Lsat</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLsat()
     * @see #getLsat()
     * @see #setLsat(Double)
     * @generated
     */
    void unsetLsat();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcRQB#getLsat <em>Lsat</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Lsat</em>' attribute is set.
     * @see #unsetLsat()
     * @see #getLsat()
     * @see #setLsat(Double)
     * @generated
     */
    boolean isSetLsat();

    /**
     * Returns the value of the '<em><b>Mesu</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Voltage input time constant (<i>MESU</i>) (&gt;= 0).  Typical value = 0,02.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Mesu</em>' attribute.
     * @see #isSetMesu()
     * @see #unsetMesu()
     * @see #setMesu(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcRQB_Mesu()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcRQB.mesu' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getMesu();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcRQB#getMesu <em>Mesu</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mesu</em>' attribute.
     * @see #isSetMesu()
     * @see #unsetMesu()
     * @see #getMesu()
     * @generated
     */
    void setMesu( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcRQB#getMesu <em>Mesu</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMesu()
     * @see #getMesu()
     * @see #setMesu(Double)
     * @generated
     */
    void unsetMesu();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcRQB#getMesu <em>Mesu</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Mesu</em>' attribute is set.
     * @see #unsetMesu()
     * @see #getMesu()
     * @see #setMesu(Double)
     * @generated
     */
    boolean isSetMesu();

    /**
     * Returns the value of the '<em><b>Tc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Lead lag time constant (<i>TC</i>) (&gt;= 0).  Typical value = 0,02.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tc</em>' attribute.
     * @see #isSetTc()
     * @see #unsetTc()
     * @see #setTc(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcRQB_Tc()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcRQB.tc' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcRQB#getTc <em>Tc</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcRQB#getTc <em>Tc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTc()
     * @see #getTc()
     * @see #setTc(Double)
     * @generated
     */
    void unsetTc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcRQB#getTc <em>Tc</em>}' attribute is set.
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
     * Lead lag time constant (<i>TE</i>) (&gt;= 0).  Typical value = 0,22.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Te</em>' attribute.
     * @see #isSetTe()
     * @see #unsetTe()
     * @see #setTe(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcRQB_Te()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcRQB.te' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTe();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcRQB#getTe <em>Te</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcRQB#getTe <em>Te</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTe()
     * @see #getTe()
     * @see #setTe(Double)
     * @generated
     */
    void unsetTe();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcRQB#getTe <em>Te</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Tf</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Exciter time constant (<i>TF</i>) (&gt;= 0).  Typical value = 0,01.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tf</em>' attribute.
     * @see #isSetTf()
     * @see #unsetTf()
     * @see #setTf(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcRQB_Tf()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='ExcRQB.tf' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTf();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcRQB#getTf <em>Tf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tf</em>' attribute.
     * @see #isSetTf()
     * @see #unsetTf()
     * @see #getTf()
     * @generated
     */
    void setTf( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcRQB#getTf <em>Tf</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTf()
     * @see #getTf()
     * @see #setTf(Double)
     * @generated
     */
    void unsetTf();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcRQB#getTf <em>Tf</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tf</em>' attribute is set.
     * @see #unsetTf()
     * @see #getTf()
     * @see #setTf(Double)
     * @generated
     */
    boolean isSetTf();

    /**
     * Returns the value of the '<em><b>Lus</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Setpoint (<i>LUS</i>).  Typical value = 0,12.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Lus</em>' attribute.
     * @see #isSetLus()
     * @see #unsetLus()
     * @see #setLus(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getExcRQB_Lus()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='ExcRQB.lus' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getLus();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcRQB#getLus <em>Lus</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lus</em>' attribute.
     * @see #isSetLus()
     * @see #unsetLus()
     * @see #getLus()
     * @generated
     */
    void setLus( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcRQB#getLus <em>Lus</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLus()
     * @see #getLus()
     * @see #setLus(Double)
     * @generated
     */
    void unsetLus();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ExcRQB#getLus <em>Lus</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Lus</em>' attribute is set.
     * @see #unsetLus()
     * @see #getLus()
     * @see #setLus(Double)
     * @generated
     */
    boolean isSetLus();

} // ExcRQB

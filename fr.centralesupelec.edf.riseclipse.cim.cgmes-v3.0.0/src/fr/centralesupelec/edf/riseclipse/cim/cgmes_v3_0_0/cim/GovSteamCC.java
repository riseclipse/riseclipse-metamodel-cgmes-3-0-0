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
 * A representation of the model object '<em><b>Gov Steam CC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Cross compound turbine governor.  Unlike tandem compound units, cross compound units are not on the same shaft.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getPmaxhp <em>Pmaxhp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getT1hp <em>T1hp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getPmaxlp <em>Pmaxlp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getT1lp <em>T1lp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getT3lp <em>T3lp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getT3hp <em>T3hp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getT4lp <em>T4lp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getRlp <em>Rlp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getT4hp <em>T4hp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getRhp <em>Rhp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getMwbase <em>Mwbase</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getDlp <em>Dlp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getT5lp <em>T5lp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getDhp <em>Dhp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getT5hp <em>T5hp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getFlp <em>Flp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getFhp <em>Fhp</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamCC()
 * @model
 * @generated
 */
public interface GovSteamCC extends CrossCompoundTurbineGovernorDynamics {
    /**
     * Returns the value of the '<em><b>Pmaxhp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum HP value position (<i>Pmaxhp</i>).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pmaxhp</em>' attribute.
     * @see #isSetPmaxhp()
     * @see #unsetPmaxhp()
     * @see #setPmaxhp(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamCC_Pmaxhp()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamCC.pmaxhp' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPmaxhp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getPmaxhp <em>Pmaxhp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pmaxhp</em>' attribute.
     * @see #isSetPmaxhp()
     * @see #unsetPmaxhp()
     * @see #getPmaxhp()
     * @generated
     */
    void setPmaxhp( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getPmaxhp <em>Pmaxhp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPmaxhp()
     * @see #getPmaxhp()
     * @see #setPmaxhp(Double)
     * @generated
     */
    void unsetPmaxhp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getPmaxhp <em>Pmaxhp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pmaxhp</em>' attribute is set.
     * @see #unsetPmaxhp()
     * @see #getPmaxhp()
     * @see #setPmaxhp(Double)
     * @generated
     */
    boolean isSetPmaxhp();

    /**
     * Returns the value of the '<em><b>T1hp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * HP governor time constant (<i>T1hp</i>) (&gt;= 0).  Typical value = 0,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>T1hp</em>' attribute.
     * @see #isSetT1hp()
     * @see #unsetT1hp()
     * @see #setT1hp(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamCC_T1hp()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamCC.t1hp' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getT1hp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getT1hp <em>T1hp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>T1hp</em>' attribute.
     * @see #isSetT1hp()
     * @see #unsetT1hp()
     * @see #getT1hp()
     * @generated
     */
    void setT1hp( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getT1hp <em>T1hp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT1hp()
     * @see #getT1hp()
     * @see #setT1hp(Double)
     * @generated
     */
    void unsetT1hp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getT1hp <em>T1hp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>T1hp</em>' attribute is set.
     * @see #unsetT1hp()
     * @see #getT1hp()
     * @see #setT1hp(Double)
     * @generated
     */
    boolean isSetT1hp();

    /**
     * Returns the value of the '<em><b>Pmaxlp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum LP value position (<i>Pmaxlp</i>).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pmaxlp</em>' attribute.
     * @see #isSetPmaxlp()
     * @see #unsetPmaxlp()
     * @see #setPmaxlp(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamCC_Pmaxlp()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamCC.pmaxlp' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPmaxlp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getPmaxlp <em>Pmaxlp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pmaxlp</em>' attribute.
     * @see #isSetPmaxlp()
     * @see #unsetPmaxlp()
     * @see #getPmaxlp()
     * @generated
     */
    void setPmaxlp( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getPmaxlp <em>Pmaxlp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPmaxlp()
     * @see #getPmaxlp()
     * @see #setPmaxlp(Double)
     * @generated
     */
    void unsetPmaxlp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getPmaxlp <em>Pmaxlp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pmaxlp</em>' attribute is set.
     * @see #unsetPmaxlp()
     * @see #getPmaxlp()
     * @see #setPmaxlp(Double)
     * @generated
     */
    boolean isSetPmaxlp();

    /**
     * Returns the value of the '<em><b>T1lp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * LP governor time constant (<i>T1lp</i>) (&gt;= 0).  Typical value = 0,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>T1lp</em>' attribute.
     * @see #isSetT1lp()
     * @see #unsetT1lp()
     * @see #setT1lp(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamCC_T1lp()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamCC.t1lp' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getT1lp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getT1lp <em>T1lp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>T1lp</em>' attribute.
     * @see #isSetT1lp()
     * @see #unsetT1lp()
     * @see #getT1lp()
     * @generated
     */
    void setT1lp( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getT1lp <em>T1lp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT1lp()
     * @see #getT1lp()
     * @see #setT1lp(Double)
     * @generated
     */
    void unsetT1lp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getT1lp <em>T1lp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>T1lp</em>' attribute is set.
     * @see #unsetT1lp()
     * @see #getT1lp()
     * @see #setT1lp(Double)
     * @generated
     */
    boolean isSetT1lp();

    /**
     * Returns the value of the '<em><b>T3lp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * LP turbine time constant (<i>T3lp</i>) (&gt;= 0).  Typical value = 0,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>T3lp</em>' attribute.
     * @see #isSetT3lp()
     * @see #unsetT3lp()
     * @see #setT3lp(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamCC_T3lp()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamCC.t3lp' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getT3lp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getT3lp <em>T3lp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>T3lp</em>' attribute.
     * @see #isSetT3lp()
     * @see #unsetT3lp()
     * @see #getT3lp()
     * @generated
     */
    void setT3lp( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getT3lp <em>T3lp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT3lp()
     * @see #getT3lp()
     * @see #setT3lp(Double)
     * @generated
     */
    void unsetT3lp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getT3lp <em>T3lp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>T3lp</em>' attribute is set.
     * @see #unsetT3lp()
     * @see #getT3lp()
     * @see #setT3lp(Double)
     * @generated
     */
    boolean isSetT3lp();

    /**
     * Returns the value of the '<em><b>T3hp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * HP turbine time constant (<i>T3hp</i>) (&gt;= 0).  Typical value = 0,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>T3hp</em>' attribute.
     * @see #isSetT3hp()
     * @see #unsetT3hp()
     * @see #setT3hp(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamCC_T3hp()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamCC.t3hp' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getT3hp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getT3hp <em>T3hp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>T3hp</em>' attribute.
     * @see #isSetT3hp()
     * @see #unsetT3hp()
     * @see #getT3hp()
     * @generated
     */
    void setT3hp( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getT3hp <em>T3hp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT3hp()
     * @see #getT3hp()
     * @see #setT3hp(Double)
     * @generated
     */
    void unsetT3hp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getT3hp <em>T3hp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>T3hp</em>' attribute is set.
     * @see #unsetT3hp()
     * @see #getT3hp()
     * @see #setT3hp(Double)
     * @generated
     */
    boolean isSetT3hp();

    /**
     * Returns the value of the '<em><b>T4lp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * LP turbine time constant (<i>T4lp</i>) (&gt;= 0).  Typical value = 0,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>T4lp</em>' attribute.
     * @see #isSetT4lp()
     * @see #unsetT4lp()
     * @see #setT4lp(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamCC_T4lp()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamCC.t4lp' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getT4lp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getT4lp <em>T4lp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>T4lp</em>' attribute.
     * @see #isSetT4lp()
     * @see #unsetT4lp()
     * @see #getT4lp()
     * @generated
     */
    void setT4lp( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getT4lp <em>T4lp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT4lp()
     * @see #getT4lp()
     * @see #setT4lp(Double)
     * @generated
     */
    void unsetT4lp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getT4lp <em>T4lp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>T4lp</em>' attribute is set.
     * @see #unsetT4lp()
     * @see #getT4lp()
     * @see #setT4lp(Double)
     * @generated
     */
    boolean isSetT4lp();

    /**
     * Returns the value of the '<em><b>Rlp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * LP governor droop (<i>Rlp</i>) (&gt; 0).  Typical value = 0,05.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Rlp</em>' attribute.
     * @see #isSetRlp()
     * @see #unsetRlp()
     * @see #setRlp(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamCC_Rlp()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamCC.rlp' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getRlp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getRlp <em>Rlp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rlp</em>' attribute.
     * @see #isSetRlp()
     * @see #unsetRlp()
     * @see #getRlp()
     * @generated
     */
    void setRlp( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getRlp <em>Rlp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRlp()
     * @see #getRlp()
     * @see #setRlp(Double)
     * @generated
     */
    void unsetRlp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getRlp <em>Rlp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rlp</em>' attribute is set.
     * @see #unsetRlp()
     * @see #getRlp()
     * @see #setRlp(Double)
     * @generated
     */
    boolean isSetRlp();

    /**
     * Returns the value of the '<em><b>T4hp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * HP turbine time constant (<i>T4hp</i>) (&gt;= 0).  Typical value = 0,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>T4hp</em>' attribute.
     * @see #isSetT4hp()
     * @see #unsetT4hp()
     * @see #setT4hp(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamCC_T4hp()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamCC.t4hp' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getT4hp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getT4hp <em>T4hp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>T4hp</em>' attribute.
     * @see #isSetT4hp()
     * @see #unsetT4hp()
     * @see #getT4hp()
     * @generated
     */
    void setT4hp( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getT4hp <em>T4hp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT4hp()
     * @see #getT4hp()
     * @see #setT4hp(Double)
     * @generated
     */
    void unsetT4hp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getT4hp <em>T4hp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>T4hp</em>' attribute is set.
     * @see #unsetT4hp()
     * @see #getT4hp()
     * @see #setT4hp(Double)
     * @generated
     */
    boolean isSetT4hp();

    /**
     * Returns the value of the '<em><b>Rhp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * HP governor droop (<i>Rhp</i>) (&gt; 0).  Typical value = 0,05.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Rhp</em>' attribute.
     * @see #isSetRhp()
     * @see #unsetRhp()
     * @see #setRhp(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamCC_Rhp()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamCC.rhp' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getRhp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getRhp <em>Rhp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rhp</em>' attribute.
     * @see #isSetRhp()
     * @see #unsetRhp()
     * @see #getRhp()
     * @generated
     */
    void setRhp( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getRhp <em>Rhp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRhp()
     * @see #getRhp()
     * @see #setRhp(Double)
     * @generated
     */
    void unsetRhp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getRhp <em>Rhp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rhp</em>' attribute is set.
     * @see #unsetRhp()
     * @see #getRhp()
     * @see #setRhp(Double)
     * @generated
     */
    boolean isSetRhp();

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
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamCC_Mwbase()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ActivePower" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamCC.mwbase' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getMwbase();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getMwbase <em>Mwbase</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getMwbase <em>Mwbase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMwbase()
     * @see #getMwbase()
     * @see #setMwbase(Double)
     * @generated
     */
    void unsetMwbase();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getMwbase <em>Mwbase</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Mwbase</em>' attribute is set.
     * @see #unsetMwbase()
     * @see #getMwbase()
     * @see #setMwbase(Double)
     * @generated
     */
    boolean isSetMwbase();

    /**
     * Returns the value of the '<em><b>Dlp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * LP damping factor (<i>Dlp</i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Dlp</em>' attribute.
     * @see #isSetDlp()
     * @see #unsetDlp()
     * @see #setDlp(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamCC_Dlp()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamCC.dlp' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getDlp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getDlp <em>Dlp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dlp</em>' attribute.
     * @see #isSetDlp()
     * @see #unsetDlp()
     * @see #getDlp()
     * @generated
     */
    void setDlp( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getDlp <em>Dlp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDlp()
     * @see #getDlp()
     * @see #setDlp(Double)
     * @generated
     */
    void unsetDlp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getDlp <em>Dlp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dlp</em>' attribute is set.
     * @see #unsetDlp()
     * @see #getDlp()
     * @see #setDlp(Double)
     * @generated
     */
    boolean isSetDlp();

    /**
     * Returns the value of the '<em><b>T5lp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * LP reheater time constant (<i>T5lp</i>) (&gt;= 0).  Typical value = 10.
     * <!-- end-model-doc -->
     * @return the value of the '<em>T5lp</em>' attribute.
     * @see #isSetT5lp()
     * @see #unsetT5lp()
     * @see #setT5lp(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamCC_T5lp()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamCC.t5lp' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getT5lp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getT5lp <em>T5lp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>T5lp</em>' attribute.
     * @see #isSetT5lp()
     * @see #unsetT5lp()
     * @see #getT5lp()
     * @generated
     */
    void setT5lp( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getT5lp <em>T5lp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT5lp()
     * @see #getT5lp()
     * @see #setT5lp(Double)
     * @generated
     */
    void unsetT5lp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getT5lp <em>T5lp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>T5lp</em>' attribute is set.
     * @see #unsetT5lp()
     * @see #getT5lp()
     * @see #setT5lp(Double)
     * @generated
     */
    boolean isSetT5lp();

    /**
     * Returns the value of the '<em><b>Dhp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * HP damping factor (<i>Dhp</i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Dhp</em>' attribute.
     * @see #isSetDhp()
     * @see #unsetDhp()
     * @see #setDhp(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamCC_Dhp()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamCC.dhp' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getDhp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getDhp <em>Dhp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dhp</em>' attribute.
     * @see #isSetDhp()
     * @see #unsetDhp()
     * @see #getDhp()
     * @generated
     */
    void setDhp( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getDhp <em>Dhp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDhp()
     * @see #getDhp()
     * @see #setDhp(Double)
     * @generated
     */
    void unsetDhp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getDhp <em>Dhp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dhp</em>' attribute is set.
     * @see #unsetDhp()
     * @see #getDhp()
     * @see #setDhp(Double)
     * @generated
     */
    boolean isSetDhp();

    /**
     * Returns the value of the '<em><b>T5hp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * HP reheater time constant (<i>T5hp</i>) (&gt;= 0).  Typical value = 10.
     * <!-- end-model-doc -->
     * @return the value of the '<em>T5hp</em>' attribute.
     * @see #isSetT5hp()
     * @see #unsetT5hp()
     * @see #setT5hp(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamCC_T5hp()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamCC.t5hp' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getT5hp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getT5hp <em>T5hp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>T5hp</em>' attribute.
     * @see #isSetT5hp()
     * @see #unsetT5hp()
     * @see #getT5hp()
     * @generated
     */
    void setT5hp( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getT5hp <em>T5hp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetT5hp()
     * @see #getT5hp()
     * @see #setT5hp(Double)
     * @generated
     */
    void unsetT5hp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getT5hp <em>T5hp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>T5hp</em>' attribute is set.
     * @see #unsetT5hp()
     * @see #getT5hp()
     * @see #setT5hp(Double)
     * @generated
     */
    boolean isSetT5hp();

    /**
     * Returns the value of the '<em><b>Flp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Fraction of LP power ahead of reheater (<i>Flp</i>).  Typical value = 0,7.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Flp</em>' attribute.
     * @see #isSetFlp()
     * @see #unsetFlp()
     * @see #setFlp(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamCC_Flp()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamCC.flp' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getFlp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getFlp <em>Flp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Flp</em>' attribute.
     * @see #isSetFlp()
     * @see #unsetFlp()
     * @see #getFlp()
     * @generated
     */
    void setFlp( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getFlp <em>Flp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFlp()
     * @see #getFlp()
     * @see #setFlp(Double)
     * @generated
     */
    void unsetFlp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getFlp <em>Flp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Flp</em>' attribute is set.
     * @see #unsetFlp()
     * @see #getFlp()
     * @see #setFlp(Double)
     * @generated
     */
    boolean isSetFlp();

    /**
     * Returns the value of the '<em><b>Fhp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Fraction of HP power ahead of reheater (<i>Fhp</i>).  Typical value = 0,3.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Fhp</em>' attribute.
     * @see #isSetFhp()
     * @see #unsetFhp()
     * @see #setFhp(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovSteamCC_Fhp()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovSteamCC.fhp' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getFhp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getFhp <em>Fhp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fhp</em>' attribute.
     * @see #isSetFhp()
     * @see #unsetFhp()
     * @see #getFhp()
     * @generated
     */
    void setFhp( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getFhp <em>Fhp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFhp()
     * @see #getFhp()
     * @see #setFhp(Double)
     * @generated
     */
    void unsetFhp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovSteamCC#getFhp <em>Fhp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Fhp</em>' attribute is set.
     * @see #unsetFhp()
     * @see #getFhp()
     * @see #setFhp(Double)
     * @generated
     */
    boolean isSetFhp();

} // GovSteamCC

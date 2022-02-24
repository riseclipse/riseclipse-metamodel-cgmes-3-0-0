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
 * A representation of the model object '<em><b>Gov Hydro WEH</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Woodward<sup>TM </sup>electric hydro governor.
 * [Footnote: Woodward electric hydro governors are an example of suitable products available commercially. This information is given for the convenience of users of this document and does not constitute an endorsement by IEC of these products.]
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getDpv <em>Dpv</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getTw <em>Tw</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getPmss9 <em>Pmss9</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getPmss8 <em>Pmss8</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getPmss7 <em>Pmss7</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getPmss2 <em>Pmss2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getPmss1 <em>Pmss1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getPmss6 <em>Pmss6</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getPmss5 <em>Pmss5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getPmss4 <em>Pmss4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getPmss3 <em>Pmss3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getFp10 <em>Fp10</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getDturb <em>Dturb</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getTp <em>Tp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getTd <em>Td</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getTg <em>Tg</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getDb <em>Db</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getKi <em>Ki</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getKp <em>Kp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getKd <em>Kd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getDicn <em>Dicn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getPmss10 <em>Pmss10</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getFl5 <em>Fl5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getFl4 <em>Fl4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getFl3 <em>Fl3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getFl2 <em>Fl2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getFl1 <em>Fl1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getFp3 <em>Fp3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getFp2 <em>Fp2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getFp1 <em>Fp1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getFp9 <em>Fp9</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getFp8 <em>Fp8</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getFp7 <em>Fp7</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getFp6 <em>Fp6</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getFp5 <em>Fp5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getFp4 <em>Fp4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getMwbase <em>Mwbase</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getGv5 <em>Gv5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getGv4 <em>Gv4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getGv3 <em>Gv3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getGv2 <em>Gv2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getGv1 <em>Gv1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getGmax <em>Gmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getGmin <em>Gmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getRpg <em>Rpg</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getRpp <em>Rpp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getFeedbackSignal <em>Feedback Signal</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getTpe <em>Tpe</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getGtmxop <em>Gtmxop</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getGtmxcl <em>Gtmxcl</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getTdv <em>Tdv</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWEH()
 * @model
 * @generated
 */
public interface GovHydroWEH extends TurbineGovernorDynamics {
    /**
     * Returns the value of the '<em><b>Dpv</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Value to allow the pilot valve controller to advance beyond the gate limits (<i>Dpv</i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Dpv</em>' attribute.
     * @see #isSetDpv()
     * @see #unsetDpv()
     * @see #setDpv(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWEH_Dpv()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWEH.dpv' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getDpv();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getDpv <em>Dpv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dpv</em>' attribute.
     * @see #isSetDpv()
     * @see #unsetDpv()
     * @see #getDpv()
     * @generated
     */
    void setDpv( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getDpv <em>Dpv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDpv()
     * @see #getDpv()
     * @see #setDpv(Double)
     * @generated
     */
    void unsetDpv();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getDpv <em>Dpv</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dpv</em>' attribute is set.
     * @see #unsetDpv()
     * @see #getDpv()
     * @see #setDpv(Double)
     * @generated
     */
    boolean isSetDpv();

    /**
     * Returns the value of the '<em><b>Tw</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Water inertia time constant (<i>Tw</i>) (&gt; 0).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tw</em>' attribute.
     * @see #isSetTw()
     * @see #unsetTw()
     * @see #setTw(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWEH_Tw()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWEH.tw' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTw();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getTw <em>Tw</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tw</em>' attribute.
     * @see #isSetTw()
     * @see #unsetTw()
     * @see #getTw()
     * @generated
     */
    void setTw( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getTw <em>Tw</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTw()
     * @see #getTw()
     * @see #setTw(Double)
     * @generated
     */
    void unsetTw();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getTw <em>Tw</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tw</em>' attribute is set.
     * @see #unsetTw()
     * @see #getTw()
     * @see #setTw(Double)
     * @generated
     */
    boolean isSetTw();

    /**
     * Returns the value of the '<em><b>Pmss9</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Pmss flow P9 (<i>Pmss9</i>).  Mechanical power output for turbine flow point 9 for lookup table representing PU mechanical power on machine MVA rating as a function of turbine flow.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pmss9</em>' attribute.
     * @see #isSetPmss9()
     * @see #unsetPmss9()
     * @see #setPmss9(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWEH_Pmss9()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWEH.pmss9' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPmss9();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getPmss9 <em>Pmss9</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pmss9</em>' attribute.
     * @see #isSetPmss9()
     * @see #unsetPmss9()
     * @see #getPmss9()
     * @generated
     */
    void setPmss9( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getPmss9 <em>Pmss9</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPmss9()
     * @see #getPmss9()
     * @see #setPmss9(Double)
     * @generated
     */
    void unsetPmss9();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getPmss9 <em>Pmss9</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pmss9</em>' attribute is set.
     * @see #unsetPmss9()
     * @see #getPmss9()
     * @see #setPmss9(Double)
     * @generated
     */
    boolean isSetPmss9();

    /**
     * Returns the value of the '<em><b>Pmss8</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Pmss flow P8 (<i>Pmss8</i>).  Mechanical power output for turbine flow point 8 for lookup table representing PU mechanical power on machine MVA rating as a function of turbine flow.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pmss8</em>' attribute.
     * @see #isSetPmss8()
     * @see #unsetPmss8()
     * @see #setPmss8(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWEH_Pmss8()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWEH.pmss8' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPmss8();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getPmss8 <em>Pmss8</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pmss8</em>' attribute.
     * @see #isSetPmss8()
     * @see #unsetPmss8()
     * @see #getPmss8()
     * @generated
     */
    void setPmss8( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getPmss8 <em>Pmss8</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPmss8()
     * @see #getPmss8()
     * @see #setPmss8(Double)
     * @generated
     */
    void unsetPmss8();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getPmss8 <em>Pmss8</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pmss8</em>' attribute is set.
     * @see #unsetPmss8()
     * @see #getPmss8()
     * @see #setPmss8(Double)
     * @generated
     */
    boolean isSetPmss8();

    /**
     * Returns the value of the '<em><b>Pmss7</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Pmss flow P7 (<i>Pmss7</i>).  Mechanical power output for turbine flow point 7 for lookup table representing PU mechanical power on machine MVA rating as a function of turbine flow.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pmss7</em>' attribute.
     * @see #isSetPmss7()
     * @see #unsetPmss7()
     * @see #setPmss7(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWEH_Pmss7()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWEH.pmss7' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPmss7();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getPmss7 <em>Pmss7</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pmss7</em>' attribute.
     * @see #isSetPmss7()
     * @see #unsetPmss7()
     * @see #getPmss7()
     * @generated
     */
    void setPmss7( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getPmss7 <em>Pmss7</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPmss7()
     * @see #getPmss7()
     * @see #setPmss7(Double)
     * @generated
     */
    void unsetPmss7();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getPmss7 <em>Pmss7</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pmss7</em>' attribute is set.
     * @see #unsetPmss7()
     * @see #getPmss7()
     * @see #setPmss7(Double)
     * @generated
     */
    boolean isSetPmss7();

    /**
     * Returns the value of the '<em><b>Pmss2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Pmss flow P2 (<i>Pmss2</i>).  Mechanical power output for turbine flow point 2 for lookup table representing PU mechanical power on machine MVA rating as a function of turbine flow.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pmss2</em>' attribute.
     * @see #isSetPmss2()
     * @see #unsetPmss2()
     * @see #setPmss2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWEH_Pmss2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWEH.pmss2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPmss2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getPmss2 <em>Pmss2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pmss2</em>' attribute.
     * @see #isSetPmss2()
     * @see #unsetPmss2()
     * @see #getPmss2()
     * @generated
     */
    void setPmss2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getPmss2 <em>Pmss2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPmss2()
     * @see #getPmss2()
     * @see #setPmss2(Double)
     * @generated
     */
    void unsetPmss2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getPmss2 <em>Pmss2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pmss2</em>' attribute is set.
     * @see #unsetPmss2()
     * @see #getPmss2()
     * @see #setPmss2(Double)
     * @generated
     */
    boolean isSetPmss2();

    /**
     * Returns the value of the '<em><b>Pmss1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Pmss flow P1 (<i>Pmss1</i>).  Mechanical power output for turbine flow point 1 for lookup table representing PU mechanical power on machine MVA rating as a function of turbine flow.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pmss1</em>' attribute.
     * @see #isSetPmss1()
     * @see #unsetPmss1()
     * @see #setPmss1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWEH_Pmss1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWEH.pmss1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPmss1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getPmss1 <em>Pmss1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pmss1</em>' attribute.
     * @see #isSetPmss1()
     * @see #unsetPmss1()
     * @see #getPmss1()
     * @generated
     */
    void setPmss1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getPmss1 <em>Pmss1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPmss1()
     * @see #getPmss1()
     * @see #setPmss1(Double)
     * @generated
     */
    void unsetPmss1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getPmss1 <em>Pmss1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pmss1</em>' attribute is set.
     * @see #unsetPmss1()
     * @see #getPmss1()
     * @see #setPmss1(Double)
     * @generated
     */
    boolean isSetPmss1();

    /**
     * Returns the value of the '<em><b>Pmss6</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Pmss flow P6 (<i>Pmss6</i>).  Mechanical power output for turbine flow point 6 for lookup table representing PU mechanical power on machine MVA rating as a function of turbine flow.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pmss6</em>' attribute.
     * @see #isSetPmss6()
     * @see #unsetPmss6()
     * @see #setPmss6(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWEH_Pmss6()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWEH.pmss6' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPmss6();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getPmss6 <em>Pmss6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pmss6</em>' attribute.
     * @see #isSetPmss6()
     * @see #unsetPmss6()
     * @see #getPmss6()
     * @generated
     */
    void setPmss6( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getPmss6 <em>Pmss6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPmss6()
     * @see #getPmss6()
     * @see #setPmss6(Double)
     * @generated
     */
    void unsetPmss6();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getPmss6 <em>Pmss6</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pmss6</em>' attribute is set.
     * @see #unsetPmss6()
     * @see #getPmss6()
     * @see #setPmss6(Double)
     * @generated
     */
    boolean isSetPmss6();

    /**
     * Returns the value of the '<em><b>Pmss5</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Pmss flow P5 (<i>Pmss5</i>).  Mechanical power output for turbine flow point 5 for lookup table representing PU mechanical power on machine MVA rating as a function of turbine flow.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pmss5</em>' attribute.
     * @see #isSetPmss5()
     * @see #unsetPmss5()
     * @see #setPmss5(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWEH_Pmss5()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWEH.pmss5' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPmss5();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getPmss5 <em>Pmss5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pmss5</em>' attribute.
     * @see #isSetPmss5()
     * @see #unsetPmss5()
     * @see #getPmss5()
     * @generated
     */
    void setPmss5( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getPmss5 <em>Pmss5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPmss5()
     * @see #getPmss5()
     * @see #setPmss5(Double)
     * @generated
     */
    void unsetPmss5();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getPmss5 <em>Pmss5</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pmss5</em>' attribute is set.
     * @see #unsetPmss5()
     * @see #getPmss5()
     * @see #setPmss5(Double)
     * @generated
     */
    boolean isSetPmss5();

    /**
     * Returns the value of the '<em><b>Pmss4</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Pmss flow P4 (<i>Pmss4</i>).  Mechanical power output for turbine flow point 4 for lookup table representing PU mechanical power on machine MVA rating as a function of turbine flow.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pmss4</em>' attribute.
     * @see #isSetPmss4()
     * @see #unsetPmss4()
     * @see #setPmss4(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWEH_Pmss4()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWEH.pmss4' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPmss4();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getPmss4 <em>Pmss4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pmss4</em>' attribute.
     * @see #isSetPmss4()
     * @see #unsetPmss4()
     * @see #getPmss4()
     * @generated
     */
    void setPmss4( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getPmss4 <em>Pmss4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPmss4()
     * @see #getPmss4()
     * @see #setPmss4(Double)
     * @generated
     */
    void unsetPmss4();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getPmss4 <em>Pmss4</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pmss4</em>' attribute is set.
     * @see #unsetPmss4()
     * @see #getPmss4()
     * @see #setPmss4(Double)
     * @generated
     */
    boolean isSetPmss4();

    /**
     * Returns the value of the '<em><b>Pmss3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Pmss flow P3 (<i>Pmss3</i>).  Mechanical power output for turbine flow point 3 for lookup table representing PU mechanical power on machine MVA rating as a function of turbine flow.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pmss3</em>' attribute.
     * @see #isSetPmss3()
     * @see #unsetPmss3()
     * @see #setPmss3(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWEH_Pmss3()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWEH.pmss3' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPmss3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getPmss3 <em>Pmss3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pmss3</em>' attribute.
     * @see #isSetPmss3()
     * @see #unsetPmss3()
     * @see #getPmss3()
     * @generated
     */
    void setPmss3( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getPmss3 <em>Pmss3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPmss3()
     * @see #getPmss3()
     * @see #setPmss3(Double)
     * @generated
     */
    void unsetPmss3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getPmss3 <em>Pmss3</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pmss3</em>' attribute is set.
     * @see #unsetPmss3()
     * @see #getPmss3()
     * @see #setPmss3(Double)
     * @generated
     */
    boolean isSetPmss3();

    /**
     * Returns the value of the '<em><b>Fp10</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Flow P10 (<i>Fp10</i>).  Turbine flow value for point 10 for lookup table representing PU mechanical power on machine MVA rating as a function of turbine flow.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Fp10</em>' attribute.
     * @see #isSetFp10()
     * @see #unsetFp10()
     * @see #setFp10(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWEH_Fp10()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWEH.fp10' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getFp10();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getFp10 <em>Fp10</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fp10</em>' attribute.
     * @see #isSetFp10()
     * @see #unsetFp10()
     * @see #getFp10()
     * @generated
     */
    void setFp10( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getFp10 <em>Fp10</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFp10()
     * @see #getFp10()
     * @see #setFp10(Double)
     * @generated
     */
    void unsetFp10();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getFp10 <em>Fp10</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Fp10</em>' attribute is set.
     * @see #unsetFp10()
     * @see #getFp10()
     * @see #setFp10(Double)
     * @generated
     */
    boolean isSetFp10();

    /**
     * Returns the value of the '<em><b>Dturb</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Turbine damping factor (<i>Dturb</i>).  Unit = delta P (PU of <i>MWbase</i>) / delta speed (PU).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Dturb</em>' attribute.
     * @see #isSetDturb()
     * @see #unsetDturb()
     * @see #setDturb(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWEH_Dturb()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWEH.dturb' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getDturb();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getDturb <em>Dturb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dturb</em>' attribute.
     * @see #isSetDturb()
     * @see #unsetDturb()
     * @see #getDturb()
     * @generated
     */
    void setDturb( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getDturb <em>Dturb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDturb()
     * @see #getDturb()
     * @see #setDturb(Double)
     * @generated
     */
    void unsetDturb();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getDturb <em>Dturb</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dturb</em>' attribute is set.
     * @see #unsetDturb()
     * @see #getDturb()
     * @see #setDturb(Double)
     * @generated
     */
    boolean isSetDturb();

    /**
     * Returns the value of the '<em><b>Tp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Pilot valve time lag time constant (<i>Tp</i>) (&gt;= 0).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tp</em>' attribute.
     * @see #isSetTp()
     * @see #unsetTp()
     * @see #setTp(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWEH_Tp()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWEH.tp' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getTp <em>Tp</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getTp <em>Tp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTp()
     * @see #getTp()
     * @see #setTp(Double)
     * @generated
     */
    void unsetTp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getTp <em>Tp</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Td</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Derivative controller time constant (<i>Td</i>) (&gt;= 0).  Limits the derivative characteristic beyond a breakdown frequency to avoid amplification of high-frequency noise.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Td</em>' attribute.
     * @see #isSetTd()
     * @see #unsetTd()
     * @see #setTd(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWEH_Td()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWEH.td' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTd();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getTd <em>Td</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Td</em>' attribute.
     * @see #isSetTd()
     * @see #unsetTd()
     * @see #getTd()
     * @generated
     */
    void setTd( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getTd <em>Td</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTd()
     * @see #getTd()
     * @see #setTd(Double)
     * @generated
     */
    void unsetTd();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getTd <em>Td</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Td</em>' attribute is set.
     * @see #unsetTd()
     * @see #getTd()
     * @see #setTd(Double)
     * @generated
     */
    boolean isSetTd();

    /**
     * Returns the value of the '<em><b>Tg</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Value to allow the distribution valve controller to advance beyond the gate movement rate limit (<i>Tg</i>) (&gt;= 0).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tg</em>' attribute.
     * @see #isSetTg()
     * @see #unsetTg()
     * @see #setTg(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWEH_Tg()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWEH.tg' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTg();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getTg <em>Tg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tg</em>' attribute.
     * @see #isSetTg()
     * @see #unsetTg()
     * @see #getTg()
     * @generated
     */
    void setTg( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getTg <em>Tg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTg()
     * @see #getTg()
     * @see #setTg(Double)
     * @generated
     */
    void unsetTg();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getTg <em>Tg</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tg</em>' attribute is set.
     * @see #unsetTg()
     * @see #getTg()
     * @see #setTg(Double)
     * @generated
     */
    boolean isSetTg();

    /**
     * Returns the value of the '<em><b>Db</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Speed deadband (<i>db</i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Db</em>' attribute.
     * @see #isSetDb()
     * @see #unsetDb()
     * @see #setDb(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWEH_Db()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWEH.db' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getDb();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getDb <em>Db</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getDb <em>Db</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDb()
     * @see #getDb()
     * @see #setDb(Double)
     * @generated
     */
    void unsetDb();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getDb <em>Db</em>}' attribute is set.
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
     * Derivative controller Integral gain (<i>Ki</i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ki</em>' attribute.
     * @see #isSetKi()
     * @see #unsetKi()
     * @see #setKi(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWEH_Ki()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWEH.ki' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKi();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getKi <em>Ki</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getKi <em>Ki</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKi()
     * @see #getKi()
     * @see #setKi(Double)
     * @generated
     */
    void unsetKi();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getKi <em>Ki</em>}' attribute is set.
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
     * Derivative control gain (<i>Kp</i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kp</em>' attribute.
     * @see #isSetKp()
     * @see #unsetKp()
     * @see #setKp(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWEH_Kp()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWEH.kp' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getKp <em>Kp</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getKp <em>Kp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKp()
     * @see #getKp()
     * @see #setKp(Double)
     * @generated
     */
    void unsetKp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getKp <em>Kp</em>}' attribute is set.
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
     * Derivative controller derivative gain (<i>Kd</i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kd</em>' attribute.
     * @see #isSetKd()
     * @see #unsetKd()
     * @see #setKd(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWEH_Kd()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWEH.kd' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKd();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getKd <em>Kd</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getKd <em>Kd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKd()
     * @see #getKd()
     * @see #setKd(Double)
     * @generated
     */
    void unsetKd();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getKd <em>Kd</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Dicn</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Value to allow the integral controller to advance beyond the gate limits (<i>Dicn</i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Dicn</em>' attribute.
     * @see #isSetDicn()
     * @see #unsetDicn()
     * @see #setDicn(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWEH_Dicn()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWEH.dicn' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getDicn();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getDicn <em>Dicn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dicn</em>' attribute.
     * @see #isSetDicn()
     * @see #unsetDicn()
     * @see #getDicn()
     * @generated
     */
    void setDicn( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getDicn <em>Dicn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDicn()
     * @see #getDicn()
     * @see #setDicn(Double)
     * @generated
     */
    void unsetDicn();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getDicn <em>Dicn</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dicn</em>' attribute is set.
     * @see #unsetDicn()
     * @see #getDicn()
     * @see #setDicn(Double)
     * @generated
     */
    boolean isSetDicn();

    /**
     * Returns the value of the '<em><b>Pmss10</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Pmss flow P10 (<i>Pmss10</i>).  Mechanical power output for turbine flow point 10 for lookup table representing PU mechanical power on machine MVA rating as a function of turbine flow.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pmss10</em>' attribute.
     * @see #isSetPmss10()
     * @see #unsetPmss10()
     * @see #setPmss10(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWEH_Pmss10()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWEH.pmss10' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPmss10();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getPmss10 <em>Pmss10</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pmss10</em>' attribute.
     * @see #isSetPmss10()
     * @see #unsetPmss10()
     * @see #getPmss10()
     * @generated
     */
    void setPmss10( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getPmss10 <em>Pmss10</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPmss10()
     * @see #getPmss10()
     * @see #setPmss10(Double)
     * @generated
     */
    void unsetPmss10();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getPmss10 <em>Pmss10</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pmss10</em>' attribute is set.
     * @see #unsetPmss10()
     * @see #getPmss10()
     * @see #setPmss10(Double)
     * @generated
     */
    boolean isSetPmss10();

    /**
     * Returns the value of the '<em><b>Fl5</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Flowgate 5 (<i>Fl5</i>).  Flow value for gate position point 5 for lookup table representing water flow through the turbine as a function of gate position to produce steady state flow.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Fl5</em>' attribute.
     * @see #isSetFl5()
     * @see #unsetFl5()
     * @see #setFl5(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWEH_Fl5()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWEH.fl5' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getFl5();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getFl5 <em>Fl5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fl5</em>' attribute.
     * @see #isSetFl5()
     * @see #unsetFl5()
     * @see #getFl5()
     * @generated
     */
    void setFl5( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getFl5 <em>Fl5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFl5()
     * @see #getFl5()
     * @see #setFl5(Double)
     * @generated
     */
    void unsetFl5();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getFl5 <em>Fl5</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Fl5</em>' attribute is set.
     * @see #unsetFl5()
     * @see #getFl5()
     * @see #setFl5(Double)
     * @generated
     */
    boolean isSetFl5();

    /**
     * Returns the value of the '<em><b>Fl4</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Flowgate 4 (<i>Fl4</i>).  Flow value for gate position point 4 for lookup table representing water flow through the turbine as a function of gate position to produce steady state flow.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Fl4</em>' attribute.
     * @see #isSetFl4()
     * @see #unsetFl4()
     * @see #setFl4(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWEH_Fl4()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWEH.fl4' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getFl4();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getFl4 <em>Fl4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fl4</em>' attribute.
     * @see #isSetFl4()
     * @see #unsetFl4()
     * @see #getFl4()
     * @generated
     */
    void setFl4( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getFl4 <em>Fl4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFl4()
     * @see #getFl4()
     * @see #setFl4(Double)
     * @generated
     */
    void unsetFl4();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getFl4 <em>Fl4</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Fl4</em>' attribute is set.
     * @see #unsetFl4()
     * @see #getFl4()
     * @see #setFl4(Double)
     * @generated
     */
    boolean isSetFl4();

    /**
     * Returns the value of the '<em><b>Fl3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Flowgate 3 (<i>Fl3</i>).  Flow value for gate position point 3 for lookup table representing water flow through the turbine as a function of gate position to produce steady state flow.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Fl3</em>' attribute.
     * @see #isSetFl3()
     * @see #unsetFl3()
     * @see #setFl3(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWEH_Fl3()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWEH.fl3' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getFl3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getFl3 <em>Fl3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fl3</em>' attribute.
     * @see #isSetFl3()
     * @see #unsetFl3()
     * @see #getFl3()
     * @generated
     */
    void setFl3( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getFl3 <em>Fl3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFl3()
     * @see #getFl3()
     * @see #setFl3(Double)
     * @generated
     */
    void unsetFl3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getFl3 <em>Fl3</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Fl3</em>' attribute is set.
     * @see #unsetFl3()
     * @see #getFl3()
     * @see #setFl3(Double)
     * @generated
     */
    boolean isSetFl3();

    /**
     * Returns the value of the '<em><b>Fl2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Flowgate 2 (<i>Fl2</i>).  Flow value for gate position point 2 for lookup table representing water flow through the turbine as a function of gate position to produce steady state flow.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Fl2</em>' attribute.
     * @see #isSetFl2()
     * @see #unsetFl2()
     * @see #setFl2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWEH_Fl2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWEH.fl2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getFl2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getFl2 <em>Fl2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fl2</em>' attribute.
     * @see #isSetFl2()
     * @see #unsetFl2()
     * @see #getFl2()
     * @generated
     */
    void setFl2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getFl2 <em>Fl2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFl2()
     * @see #getFl2()
     * @see #setFl2(Double)
     * @generated
     */
    void unsetFl2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getFl2 <em>Fl2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Fl2</em>' attribute is set.
     * @see #unsetFl2()
     * @see #getFl2()
     * @see #setFl2(Double)
     * @generated
     */
    boolean isSetFl2();

    /**
     * Returns the value of the '<em><b>Fl1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Flowgate 1 (<i>Fl1</i>).  Flow value for gate position point 1 for lookup table representing water flow through the turbine as a function of gate position to produce steady state flow.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Fl1</em>' attribute.
     * @see #isSetFl1()
     * @see #unsetFl1()
     * @see #setFl1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWEH_Fl1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWEH.fl1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getFl1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getFl1 <em>Fl1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fl1</em>' attribute.
     * @see #isSetFl1()
     * @see #unsetFl1()
     * @see #getFl1()
     * @generated
     */
    void setFl1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getFl1 <em>Fl1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFl1()
     * @see #getFl1()
     * @see #setFl1(Double)
     * @generated
     */
    void unsetFl1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getFl1 <em>Fl1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Fl1</em>' attribute is set.
     * @see #unsetFl1()
     * @see #getFl1()
     * @see #setFl1(Double)
     * @generated
     */
    boolean isSetFl1();

    /**
     * Returns the value of the '<em><b>Fp3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Flow P3 (<i>Fp3</i>).  Turbine flow value for point 3 for lookup table representing PU mechanical power on machine MVA rating as a function of turbine flow.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Fp3</em>' attribute.
     * @see #isSetFp3()
     * @see #unsetFp3()
     * @see #setFp3(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWEH_Fp3()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWEH.fp3' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getFp3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getFp3 <em>Fp3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fp3</em>' attribute.
     * @see #isSetFp3()
     * @see #unsetFp3()
     * @see #getFp3()
     * @generated
     */
    void setFp3( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getFp3 <em>Fp3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFp3()
     * @see #getFp3()
     * @see #setFp3(Double)
     * @generated
     */
    void unsetFp3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getFp3 <em>Fp3</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Fp3</em>' attribute is set.
     * @see #unsetFp3()
     * @see #getFp3()
     * @see #setFp3(Double)
     * @generated
     */
    boolean isSetFp3();

    /**
     * Returns the value of the '<em><b>Fp2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Flow P2 (<i>Fp2</i>).  Turbine flow value for point 2 for lookup table representing PU mechanical power on machine MVA rating as a function of turbine flow.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Fp2</em>' attribute.
     * @see #isSetFp2()
     * @see #unsetFp2()
     * @see #setFp2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWEH_Fp2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWEH.fp2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getFp2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getFp2 <em>Fp2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fp2</em>' attribute.
     * @see #isSetFp2()
     * @see #unsetFp2()
     * @see #getFp2()
     * @generated
     */
    void setFp2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getFp2 <em>Fp2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFp2()
     * @see #getFp2()
     * @see #setFp2(Double)
     * @generated
     */
    void unsetFp2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getFp2 <em>Fp2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Fp2</em>' attribute is set.
     * @see #unsetFp2()
     * @see #getFp2()
     * @see #setFp2(Double)
     * @generated
     */
    boolean isSetFp2();

    /**
     * Returns the value of the '<em><b>Fp1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Flow P1 (<i>Fp1</i>).  Turbine flow value for point 1 for lookup table representing PU mechanical power on machine MVA rating as a function of turbine flow.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Fp1</em>' attribute.
     * @see #isSetFp1()
     * @see #unsetFp1()
     * @see #setFp1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWEH_Fp1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWEH.fp1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getFp1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getFp1 <em>Fp1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fp1</em>' attribute.
     * @see #isSetFp1()
     * @see #unsetFp1()
     * @see #getFp1()
     * @generated
     */
    void setFp1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getFp1 <em>Fp1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFp1()
     * @see #getFp1()
     * @see #setFp1(Double)
     * @generated
     */
    void unsetFp1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getFp1 <em>Fp1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Fp1</em>' attribute is set.
     * @see #unsetFp1()
     * @see #getFp1()
     * @see #setFp1(Double)
     * @generated
     */
    boolean isSetFp1();

    /**
     * Returns the value of the '<em><b>Fp9</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Flow P9 (<i>Fp9</i>).  Turbine flow value for point 9 for lookup table representing PU mechanical power on machine MVA rating as a function of turbine flow.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Fp9</em>' attribute.
     * @see #isSetFp9()
     * @see #unsetFp9()
     * @see #setFp9(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWEH_Fp9()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWEH.fp9' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getFp9();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getFp9 <em>Fp9</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fp9</em>' attribute.
     * @see #isSetFp9()
     * @see #unsetFp9()
     * @see #getFp9()
     * @generated
     */
    void setFp9( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getFp9 <em>Fp9</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFp9()
     * @see #getFp9()
     * @see #setFp9(Double)
     * @generated
     */
    void unsetFp9();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getFp9 <em>Fp9</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Fp9</em>' attribute is set.
     * @see #unsetFp9()
     * @see #getFp9()
     * @see #setFp9(Double)
     * @generated
     */
    boolean isSetFp9();

    /**
     * Returns the value of the '<em><b>Fp8</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Flow P8 (<i>Fp8</i>).  Turbine flow value for point 8 for lookup table representing PU mechanical power on machine MVA rating as a function of turbine flow.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Fp8</em>' attribute.
     * @see #isSetFp8()
     * @see #unsetFp8()
     * @see #setFp8(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWEH_Fp8()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWEH.fp8' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getFp8();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getFp8 <em>Fp8</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fp8</em>' attribute.
     * @see #isSetFp8()
     * @see #unsetFp8()
     * @see #getFp8()
     * @generated
     */
    void setFp8( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getFp8 <em>Fp8</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFp8()
     * @see #getFp8()
     * @see #setFp8(Double)
     * @generated
     */
    void unsetFp8();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getFp8 <em>Fp8</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Fp8</em>' attribute is set.
     * @see #unsetFp8()
     * @see #getFp8()
     * @see #setFp8(Double)
     * @generated
     */
    boolean isSetFp8();

    /**
     * Returns the value of the '<em><b>Fp7</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Flow P7 (<i>Fp7</i>).  Turbine flow value for point 7 for lookup table representing PU mechanical power on machine MVA rating as a function of turbine flow.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Fp7</em>' attribute.
     * @see #isSetFp7()
     * @see #unsetFp7()
     * @see #setFp7(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWEH_Fp7()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWEH.fp7' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getFp7();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getFp7 <em>Fp7</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fp7</em>' attribute.
     * @see #isSetFp7()
     * @see #unsetFp7()
     * @see #getFp7()
     * @generated
     */
    void setFp7( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getFp7 <em>Fp7</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFp7()
     * @see #getFp7()
     * @see #setFp7(Double)
     * @generated
     */
    void unsetFp7();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getFp7 <em>Fp7</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Fp7</em>' attribute is set.
     * @see #unsetFp7()
     * @see #getFp7()
     * @see #setFp7(Double)
     * @generated
     */
    boolean isSetFp7();

    /**
     * Returns the value of the '<em><b>Fp6</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Flow P6 (<i>Fp6</i>).  Turbine flow value for point 6 for lookup table representing PU mechanical power on machine MVA rating as a function of turbine flow.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Fp6</em>' attribute.
     * @see #isSetFp6()
     * @see #unsetFp6()
     * @see #setFp6(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWEH_Fp6()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWEH.fp6' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getFp6();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getFp6 <em>Fp6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fp6</em>' attribute.
     * @see #isSetFp6()
     * @see #unsetFp6()
     * @see #getFp6()
     * @generated
     */
    void setFp6( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getFp6 <em>Fp6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFp6()
     * @see #getFp6()
     * @see #setFp6(Double)
     * @generated
     */
    void unsetFp6();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getFp6 <em>Fp6</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Fp6</em>' attribute is set.
     * @see #unsetFp6()
     * @see #getFp6()
     * @see #setFp6(Double)
     * @generated
     */
    boolean isSetFp6();

    /**
     * Returns the value of the '<em><b>Fp5</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Flow P5 (<i>Fp5</i>).  Turbine flow value for point 5 for lookup table representing PU mechanical power on machine MVA rating as a function of turbine flow.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Fp5</em>' attribute.
     * @see #isSetFp5()
     * @see #unsetFp5()
     * @see #setFp5(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWEH_Fp5()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWEH.fp5' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getFp5();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getFp5 <em>Fp5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fp5</em>' attribute.
     * @see #isSetFp5()
     * @see #unsetFp5()
     * @see #getFp5()
     * @generated
     */
    void setFp5( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getFp5 <em>Fp5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFp5()
     * @see #getFp5()
     * @see #setFp5(Double)
     * @generated
     */
    void unsetFp5();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getFp5 <em>Fp5</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Fp5</em>' attribute is set.
     * @see #unsetFp5()
     * @see #getFp5()
     * @see #setFp5(Double)
     * @generated
     */
    boolean isSetFp5();

    /**
     * Returns the value of the '<em><b>Fp4</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Flow P4 (<i>Fp4</i>).  Turbine flow value for point 4 for lookup table representing PU mechanical power on machine MVA rating as a function of turbine flow.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Fp4</em>' attribute.
     * @see #isSetFp4()
     * @see #unsetFp4()
     * @see #setFp4(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWEH_Fp4()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWEH.fp4' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getFp4();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getFp4 <em>Fp4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fp4</em>' attribute.
     * @see #isSetFp4()
     * @see #unsetFp4()
     * @see #getFp4()
     * @generated
     */
    void setFp4( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getFp4 <em>Fp4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFp4()
     * @see #getFp4()
     * @see #setFp4(Double)
     * @generated
     */
    void unsetFp4();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getFp4 <em>Fp4</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Fp4</em>' attribute is set.
     * @see #unsetFp4()
     * @see #getFp4()
     * @see #setFp4(Double)
     * @generated
     */
    boolean isSetFp4();

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
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWEH_Mwbase()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ActivePower" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWEH.mwbase' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getMwbase();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getMwbase <em>Mwbase</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getMwbase <em>Mwbase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMwbase()
     * @see #getMwbase()
     * @see #setMwbase(Double)
     * @generated
     */
    void unsetMwbase();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getMwbase <em>Mwbase</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Gv5</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Gate 5 (<i>Gv5</i>).  Gate Position value for point 5 for lookup table representing water flow through the turbine as a function of gate position to produce steady state flow.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Gv5</em>' attribute.
     * @see #isSetGv5()
     * @see #unsetGv5()
     * @see #setGv5(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWEH_Gv5()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWEH.gv5' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getGv5();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getGv5 <em>Gv5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Gv5</em>' attribute.
     * @see #isSetGv5()
     * @see #unsetGv5()
     * @see #getGv5()
     * @generated
     */
    void setGv5( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getGv5 <em>Gv5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGv5()
     * @see #getGv5()
     * @see #setGv5(Double)
     * @generated
     */
    void unsetGv5();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getGv5 <em>Gv5</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Gv5</em>' attribute is set.
     * @see #unsetGv5()
     * @see #getGv5()
     * @see #setGv5(Double)
     * @generated
     */
    boolean isSetGv5();

    /**
     * Returns the value of the '<em><b>Gv4</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Gate 4 (<i>Gv4</i>).  Gate Position value for point 4 for lookup table representing water flow through the turbine as a function of gate position to produce steady state flow.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Gv4</em>' attribute.
     * @see #isSetGv4()
     * @see #unsetGv4()
     * @see #setGv4(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWEH_Gv4()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWEH.gv4' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getGv4();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getGv4 <em>Gv4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Gv4</em>' attribute.
     * @see #isSetGv4()
     * @see #unsetGv4()
     * @see #getGv4()
     * @generated
     */
    void setGv4( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getGv4 <em>Gv4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGv4()
     * @see #getGv4()
     * @see #setGv4(Double)
     * @generated
     */
    void unsetGv4();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getGv4 <em>Gv4</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Gv4</em>' attribute is set.
     * @see #unsetGv4()
     * @see #getGv4()
     * @see #setGv4(Double)
     * @generated
     */
    boolean isSetGv4();

    /**
     * Returns the value of the '<em><b>Gv3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Gate 3 (<i>Gv3</i>).  Gate Position value for point 3 for lookup table representing water flow through the turbine as a function of gate position to produce steady state flow.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Gv3</em>' attribute.
     * @see #isSetGv3()
     * @see #unsetGv3()
     * @see #setGv3(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWEH_Gv3()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWEH.gv3' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getGv3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getGv3 <em>Gv3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Gv3</em>' attribute.
     * @see #isSetGv3()
     * @see #unsetGv3()
     * @see #getGv3()
     * @generated
     */
    void setGv3( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getGv3 <em>Gv3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGv3()
     * @see #getGv3()
     * @see #setGv3(Double)
     * @generated
     */
    void unsetGv3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getGv3 <em>Gv3</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Gv3</em>' attribute is set.
     * @see #unsetGv3()
     * @see #getGv3()
     * @see #setGv3(Double)
     * @generated
     */
    boolean isSetGv3();

    /**
     * Returns the value of the '<em><b>Gv2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Gate 2 (<i>Gv2</i>).  Gate Position value for point 2 for lookup table representing water flow through the turbine as a function of gate position to produce steady state flow.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Gv2</em>' attribute.
     * @see #isSetGv2()
     * @see #unsetGv2()
     * @see #setGv2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWEH_Gv2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWEH.gv2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getGv2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getGv2 <em>Gv2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Gv2</em>' attribute.
     * @see #isSetGv2()
     * @see #unsetGv2()
     * @see #getGv2()
     * @generated
     */
    void setGv2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getGv2 <em>Gv2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGv2()
     * @see #getGv2()
     * @see #setGv2(Double)
     * @generated
     */
    void unsetGv2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getGv2 <em>Gv2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Gv2</em>' attribute is set.
     * @see #unsetGv2()
     * @see #getGv2()
     * @see #setGv2(Double)
     * @generated
     */
    boolean isSetGv2();

    /**
     * Returns the value of the '<em><b>Gv1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Gate 1 (<i>Gv1</i>).  Gate Position value for point 1 for lookup table representing water flow through the turbine as a function of gate position to produce steady state flow.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Gv1</em>' attribute.
     * @see #isSetGv1()
     * @see #unsetGv1()
     * @see #setGv1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWEH_Gv1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWEH.gv1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getGv1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getGv1 <em>Gv1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Gv1</em>' attribute.
     * @see #isSetGv1()
     * @see #unsetGv1()
     * @see #getGv1()
     * @generated
     */
    void setGv1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getGv1 <em>Gv1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGv1()
     * @see #getGv1()
     * @see #setGv1(Double)
     * @generated
     */
    void unsetGv1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getGv1 <em>Gv1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Gv1</em>' attribute is set.
     * @see #unsetGv1()
     * @see #getGv1()
     * @see #setGv1(Double)
     * @generated
     */
    boolean isSetGv1();

    /**
     * Returns the value of the '<em><b>Gmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum gate position (<i>Gmax</i>) (&gt; GovHydroWEH.gmin).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Gmax</em>' attribute.
     * @see #isSetGmax()
     * @see #unsetGmax()
     * @see #setGmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWEH_Gmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWEH.gmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getGmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getGmax <em>Gmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Gmax</em>' attribute.
     * @see #isSetGmax()
     * @see #unsetGmax()
     * @see #getGmax()
     * @generated
     */
    void setGmax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getGmax <em>Gmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGmax()
     * @see #getGmax()
     * @see #setGmax(Double)
     * @generated
     */
    void unsetGmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getGmax <em>Gmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Gmax</em>' attribute is set.
     * @see #unsetGmax()
     * @see #getGmax()
     * @see #setGmax(Double)
     * @generated
     */
    boolean isSetGmax();

    /**
     * Returns the value of the '<em><b>Gmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum gate position (<i>Gmin</i>) (&lt; GovHydroWEH.gmax).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Gmin</em>' attribute.
     * @see #isSetGmin()
     * @see #unsetGmin()
     * @see #setGmin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWEH_Gmin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWEH.gmin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getGmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getGmin <em>Gmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Gmin</em>' attribute.
     * @see #isSetGmin()
     * @see #unsetGmin()
     * @see #getGmin()
     * @generated
     */
    void setGmin( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getGmin <em>Gmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGmin()
     * @see #getGmin()
     * @see #setGmin(Double)
     * @generated
     */
    void unsetGmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getGmin <em>Gmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Gmin</em>' attribute is set.
     * @see #unsetGmin()
     * @see #getGmin()
     * @see #setGmin(Double)
     * @generated
     */
    boolean isSetGmin();

    /**
     * Returns the value of the '<em><b>Rpg</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Permanent droop for governor output feedback (<i>R-Perm-Gate</i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Rpg</em>' attribute.
     * @see #isSetRpg()
     * @see #unsetRpg()
     * @see #setRpg(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWEH_Rpg()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWEH.rpg' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getRpg();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getRpg <em>Rpg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rpg</em>' attribute.
     * @see #isSetRpg()
     * @see #unsetRpg()
     * @see #getRpg()
     * @generated
     */
    void setRpg( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getRpg <em>Rpg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRpg()
     * @see #getRpg()
     * @see #setRpg(Double)
     * @generated
     */
    void unsetRpg();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getRpg <em>Rpg</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rpg</em>' attribute is set.
     * @see #unsetRpg()
     * @see #getRpg()
     * @see #setRpg(Double)
     * @generated
     */
    boolean isSetRpg();

    /**
     * Returns the value of the '<em><b>Rpp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Permanent droop for electrical power feedback (<i>R-Perm-Pe</i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Rpp</em>' attribute.
     * @see #isSetRpp()
     * @see #unsetRpp()
     * @see #setRpp(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWEH_Rpp()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWEH.rpp' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getRpp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getRpp <em>Rpp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rpp</em>' attribute.
     * @see #isSetRpp()
     * @see #unsetRpp()
     * @see #getRpp()
     * @generated
     */
    void setRpp( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getRpp <em>Rpp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRpp()
     * @see #getRpp()
     * @see #setRpp(Double)
     * @generated
     */
    void unsetRpp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getRpp <em>Rpp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rpp</em>' attribute is set.
     * @see #unsetRpp()
     * @see #getRpp()
     * @see #setRpp(Double)
     * @generated
     */
    boolean isSetRpp();

    /**
     * Returns the value of the '<em><b>Feedback Signal</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Feedback signal selection (<i>Sw</i>).
     * true = PID output (if <i>R-Perm-Gate </i>= droop and <i>R-Perm-Pe </i>= 0)
     * false = electrical power (if <i>R-Perm-Gate </i>= 0 and <i>R-Perm-Pe </i>= droop) or
     * false = gate position (if R<i>-Perm-Gate </i>= droop and <i>R-Perm-Pe </i>= 0).
     * Typical value = false.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Feedback Signal</em>' attribute.
     * @see #isSetFeedbackSignal()
     * @see #unsetFeedbackSignal()
     * @see #setFeedbackSignal(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWEH_FeedbackSignal()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWEH.feedbackSignal' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getFeedbackSignal();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getFeedbackSignal <em>Feedback Signal</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Feedback Signal</em>' attribute.
     * @see #isSetFeedbackSignal()
     * @see #unsetFeedbackSignal()
     * @see #getFeedbackSignal()
     * @generated
     */
    void setFeedbackSignal( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getFeedbackSignal <em>Feedback Signal</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFeedbackSignal()
     * @see #getFeedbackSignal()
     * @see #setFeedbackSignal(Boolean)
     * @generated
     */
    void unsetFeedbackSignal();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getFeedbackSignal <em>Feedback Signal</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Feedback Signal</em>' attribute is set.
     * @see #unsetFeedbackSignal()
     * @see #getFeedbackSignal()
     * @see #setFeedbackSignal(Boolean)
     * @generated
     */
    boolean isSetFeedbackSignal();

    /**
     * Returns the value of the '<em><b>Tpe</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Electrical power droop time constant (<i>Tpe</i>) (&gt;= 0).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tpe</em>' attribute.
     * @see #isSetTpe()
     * @see #unsetTpe()
     * @see #setTpe(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWEH_Tpe()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWEH.tpe' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTpe();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getTpe <em>Tpe</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tpe</em>' attribute.
     * @see #isSetTpe()
     * @see #unsetTpe()
     * @see #getTpe()
     * @generated
     */
    void setTpe( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getTpe <em>Tpe</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTpe()
     * @see #getTpe()
     * @see #setTpe(Double)
     * @generated
     */
    void unsetTpe();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getTpe <em>Tpe</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tpe</em>' attribute is set.
     * @see #unsetTpe()
     * @see #getTpe()
     * @see #setTpe(Double)
     * @generated
     */
    boolean isSetTpe();

    /**
     * Returns the value of the '<em><b>Gtmxop</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum gate opening rate (<i>Gtmxop</i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Gtmxop</em>' attribute.
     * @see #isSetGtmxop()
     * @see #unsetGtmxop()
     * @see #setGtmxop(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWEH_Gtmxop()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWEH.gtmxop' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getGtmxop();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getGtmxop <em>Gtmxop</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Gtmxop</em>' attribute.
     * @see #isSetGtmxop()
     * @see #unsetGtmxop()
     * @see #getGtmxop()
     * @generated
     */
    void setGtmxop( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getGtmxop <em>Gtmxop</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGtmxop()
     * @see #getGtmxop()
     * @see #setGtmxop(Double)
     * @generated
     */
    void unsetGtmxop();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getGtmxop <em>Gtmxop</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Gtmxop</em>' attribute is set.
     * @see #unsetGtmxop()
     * @see #getGtmxop()
     * @see #setGtmxop(Double)
     * @generated
     */
    boolean isSetGtmxop();

    /**
     * Returns the value of the '<em><b>Gtmxcl</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum gate closing rate (<i>Gtmxcl</i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Gtmxcl</em>' attribute.
     * @see #isSetGtmxcl()
     * @see #unsetGtmxcl()
     * @see #setGtmxcl(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWEH_Gtmxcl()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWEH.gtmxcl' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getGtmxcl();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getGtmxcl <em>Gtmxcl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Gtmxcl</em>' attribute.
     * @see #isSetGtmxcl()
     * @see #unsetGtmxcl()
     * @see #getGtmxcl()
     * @generated
     */
    void setGtmxcl( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getGtmxcl <em>Gtmxcl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGtmxcl()
     * @see #getGtmxcl()
     * @see #setGtmxcl(Double)
     * @generated
     */
    void unsetGtmxcl();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getGtmxcl <em>Gtmxcl</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Gtmxcl</em>' attribute is set.
     * @see #unsetGtmxcl()
     * @see #getGtmxcl()
     * @see #setGtmxcl(Double)
     * @generated
     */
    boolean isSetGtmxcl();

    /**
     * Returns the value of the '<em><b>Tdv</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Distributive valve time lag time constant (<i>Tdv</i>) (&gt;= 0).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tdv</em>' attribute.
     * @see #isSetTdv()
     * @see #unsetTdv()
     * @see #setTdv(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWEH_Tdv()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWEH.tdv' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTdv();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getTdv <em>Tdv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tdv</em>' attribute.
     * @see #isSetTdv()
     * @see #unsetTdv()
     * @see #getTdv()
     * @generated
     */
    void setTdv( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getTdv <em>Tdv</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTdv()
     * @see #getTdv()
     * @see #setTdv(Double)
     * @generated
     */
    void unsetTdv();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWEH#getTdv <em>Tdv</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tdv</em>' attribute is set.
     * @see #unsetTdv()
     * @see #getTdv()
     * @see #setTdv(Double)
     * @generated
     */
    boolean isSetTdv();

} // GovHydroWEH

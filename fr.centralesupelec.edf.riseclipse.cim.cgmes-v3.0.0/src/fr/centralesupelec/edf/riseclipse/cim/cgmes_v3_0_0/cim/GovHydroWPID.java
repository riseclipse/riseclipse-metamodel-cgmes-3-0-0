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
 * A representation of the model object '<em><b>Gov Hydro WPID</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Woodward<sup>TM</sup> PID hydro governor.
 * [Footnote: Woodward PID hydro governors are an example of suitable products available commercially. This information is given for the convenience of users of this document and does not constitute an endorsement by IEC of these products.]
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getD <em>D</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getKd <em>Kd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getKi <em>Ki</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getKp <em>Kp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getTa <em>Ta</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getTb <em>Tb</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getTw <em>Tw</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getGatmin <em>Gatmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getGatmax <em>Gatmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getReg <em>Reg</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getPmin <em>Pmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getGv3 <em>Gv3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getGv2 <em>Gv2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getGv1 <em>Gv1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getVelmin <em>Velmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getVelmax <em>Velmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getPmax <em>Pmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getPgv3 <em>Pgv3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getPgv1 <em>Pgv1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getPgv2 <em>Pgv2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getMwbase <em>Mwbase</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getTreg <em>Treg</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWPID()
 * @model
 * @generated
 */
public interface GovHydroWPID extends TurbineGovernorDynamics {
    /**
     * Returns the value of the '<em><b>D</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Turbine damping factor (<i>D</i>).  Unit = delta P / delta speed.
     * <!-- end-model-doc -->
     * @return the value of the '<em>D</em>' attribute.
     * @see #isSetD()
     * @see #unsetD()
     * @see #setD(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWPID_D()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWPID.d' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getD();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getD <em>D</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getD <em>D</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetD()
     * @see #getD()
     * @see #setD(Double)
     * @generated
     */
    void unsetD();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getD <em>D</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Kd</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Derivative gain (<i>Kd</i>).  Typical value = 1,11.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kd</em>' attribute.
     * @see #isSetKd()
     * @see #unsetKd()
     * @see #setKd(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWPID_Kd()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWPID.kd' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKd();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getKd <em>Kd</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getKd <em>Kd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKd()
     * @see #getKd()
     * @see #setKd(Double)
     * @generated
     */
    void unsetKd();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getKd <em>Kd</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Ki</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reset gain (<i>Ki</i>).  Typical value = 0,36.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ki</em>' attribute.
     * @see #isSetKi()
     * @see #unsetKi()
     * @see #setKi(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWPID_Ki()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWPID.ki' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKi();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getKi <em>Ki</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getKi <em>Ki</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKi()
     * @see #getKi()
     * @see #setKi(Double)
     * @generated
     */
    void unsetKi();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getKi <em>Ki</em>}' attribute is set.
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
     * Proportional gain (<i>Kp</i>).  Typical value = 0,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kp</em>' attribute.
     * @see #isSetKp()
     * @see #unsetKp()
     * @see #setKp(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWPID_Kp()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWPID.kp' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getKp <em>Kp</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getKp <em>Kp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKp()
     * @see #getKp()
     * @see #setKp(Double)
     * @generated
     */
    void unsetKp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getKp <em>Kp</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Ta</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Controller time constant (<i>Ta</i>) (&gt;= 0).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ta</em>' attribute.
     * @see #isSetTa()
     * @see #unsetTa()
     * @see #setTa(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWPID_Ta()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWPID.ta' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTa();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getTa <em>Ta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ta</em>' attribute.
     * @see #isSetTa()
     * @see #unsetTa()
     * @see #getTa()
     * @generated
     */
    void setTa( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getTa <em>Ta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTa()
     * @see #getTa()
     * @see #setTa(Double)
     * @generated
     */
    void unsetTa();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getTa <em>Ta</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ta</em>' attribute is set.
     * @see #unsetTa()
     * @see #getTa()
     * @see #setTa(Double)
     * @generated
     */
    boolean isSetTa();

    /**
     * Returns the value of the '<em><b>Tb</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Gate servo time constant (<i>Tb</i>) (&gt;= 0).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tb</em>' attribute.
     * @see #isSetTb()
     * @see #unsetTb()
     * @see #setTb(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWPID_Tb()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWPID.tb' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTb();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getTb <em>Tb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tb</em>' attribute.
     * @see #isSetTb()
     * @see #unsetTb()
     * @see #getTb()
     * @generated
     */
    void setTb( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getTb <em>Tb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTb()
     * @see #getTb()
     * @see #setTb(Double)
     * @generated
     */
    void unsetTb();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getTb <em>Tb</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tb</em>' attribute is set.
     * @see #unsetTb()
     * @see #getTb()
     * @see #setTb(Double)
     * @generated
     */
    boolean isSetTb();

    /**
     * Returns the value of the '<em><b>Tw</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Water inertia time constant (<i>Tw</i>) (&gt;= 0).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tw</em>' attribute.
     * @see #isSetTw()
     * @see #unsetTw()
     * @see #setTw(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWPID_Tw()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWPID.tw' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTw();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getTw <em>Tw</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getTw <em>Tw</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTw()
     * @see #getTw()
     * @see #setTw(Double)
     * @generated
     */
    void unsetTw();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getTw <em>Tw</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Gatmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Gate opening limit minimum (<i>Gatmin</i>) (&lt; GovHydroWPID.gatmax).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Gatmin</em>' attribute.
     * @see #isSetGatmin()
     * @see #unsetGatmin()
     * @see #setGatmin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWPID_Gatmin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWPID.gatmin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getGatmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getGatmin <em>Gatmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Gatmin</em>' attribute.
     * @see #isSetGatmin()
     * @see #unsetGatmin()
     * @see #getGatmin()
     * @generated
     */
    void setGatmin( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getGatmin <em>Gatmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGatmin()
     * @see #getGatmin()
     * @see #setGatmin(Double)
     * @generated
     */
    void unsetGatmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getGatmin <em>Gatmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Gatmin</em>' attribute is set.
     * @see #unsetGatmin()
     * @see #getGatmin()
     * @see #setGatmin(Double)
     * @generated
     */
    boolean isSetGatmin();

    /**
     * Returns the value of the '<em><b>Gatmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Gate opening limit maximum (<i>Gatmax</i>) (&gt; GovHydroWPID.gatmin).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Gatmax</em>' attribute.
     * @see #isSetGatmax()
     * @see #unsetGatmax()
     * @see #setGatmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWPID_Gatmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWPID.gatmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getGatmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getGatmax <em>Gatmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Gatmax</em>' attribute.
     * @see #isSetGatmax()
     * @see #unsetGatmax()
     * @see #getGatmax()
     * @generated
     */
    void setGatmax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getGatmax <em>Gatmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGatmax()
     * @see #getGatmax()
     * @see #setGatmax(Double)
     * @generated
     */
    void unsetGatmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getGatmax <em>Gatmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Gatmax</em>' attribute is set.
     * @see #unsetGatmax()
     * @see #getGatmax()
     * @see #setGatmax(Double)
     * @generated
     */
    boolean isSetGatmax();

    /**
     * Returns the value of the '<em><b>Reg</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Permanent drop (<i>Reg</i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Reg</em>' attribute.
     * @see #isSetReg()
     * @see #unsetReg()
     * @see #setReg(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWPID_Reg()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWPID.reg' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getReg();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getReg <em>Reg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reg</em>' attribute.
     * @see #isSetReg()
     * @see #unsetReg()
     * @see #getReg()
     * @generated
     */
    void setReg( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getReg <em>Reg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReg()
     * @see #getReg()
     * @see #setReg(Double)
     * @generated
     */
    void unsetReg();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getReg <em>Reg</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Reg</em>' attribute is set.
     * @see #unsetReg()
     * @see #getReg()
     * @see #setReg(Double)
     * @generated
     */
    boolean isSetReg();

    /**
     * Returns the value of the '<em><b>Pmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum power output (<i>Pmin</i>) (&lt; GovHydroWPID.pmax).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pmin</em>' attribute.
     * @see #isSetPmin()
     * @see #unsetPmin()
     * @see #setPmin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWPID_Pmin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWPID.pmin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getPmin <em>Pmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pmin</em>' attribute.
     * @see #isSetPmin()
     * @see #unsetPmin()
     * @see #getPmin()
     * @generated
     */
    void setPmin( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getPmin <em>Pmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPmin()
     * @see #getPmin()
     * @see #setPmin(Double)
     * @generated
     */
    void unsetPmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getPmin <em>Pmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pmin</em>' attribute is set.
     * @see #unsetPmin()
     * @see #getPmin()
     * @see #setPmin(Double)
     * @generated
     */
    boolean isSetPmin();

    /**
     * Returns the value of the '<em><b>Gv3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Gate position 3 (<i>Gv3</i>) (= 1,0).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Gv3</em>' attribute.
     * @see #isSetGv3()
     * @see #unsetGv3()
     * @see #setGv3(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWPID_Gv3()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWPID.gv3' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getGv3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getGv3 <em>Gv3</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getGv3 <em>Gv3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGv3()
     * @see #getGv3()
     * @see #setGv3(Double)
     * @generated
     */
    void unsetGv3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getGv3 <em>Gv3</em>}' attribute is set.
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
     * Gate position 2 (<i>Gv2</i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Gv2</em>' attribute.
     * @see #isSetGv2()
     * @see #unsetGv2()
     * @see #setGv2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWPID_Gv2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWPID.gv2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getGv2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getGv2 <em>Gv2</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getGv2 <em>Gv2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGv2()
     * @see #getGv2()
     * @see #setGv2(Double)
     * @generated
     */
    void unsetGv2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getGv2 <em>Gv2</em>}' attribute is set.
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
     * Gate position 1 (<i>Gv1</i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Gv1</em>' attribute.
     * @see #isSetGv1()
     * @see #unsetGv1()
     * @see #setGv1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWPID_Gv1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWPID.gv1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getGv1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getGv1 <em>Gv1</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getGv1 <em>Gv1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGv1()
     * @see #getGv1()
     * @see #setGv1(Double)
     * @generated
     */
    void unsetGv1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getGv1 <em>Gv1</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Velmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum gate closing velocity (<i>Velmin</i>) (&lt; GovHydroWPID.velmax).  Unit = PU / s.  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Velmin</em>' attribute.
     * @see #isSetVelmin()
     * @see #unsetVelmin()
     * @see #setVelmin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWPID_Velmin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWPID.velmin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVelmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getVelmin <em>Velmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Velmin</em>' attribute.
     * @see #isSetVelmin()
     * @see #unsetVelmin()
     * @see #getVelmin()
     * @generated
     */
    void setVelmin( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getVelmin <em>Velmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVelmin()
     * @see #getVelmin()
     * @see #setVelmin(Double)
     * @generated
     */
    void unsetVelmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getVelmin <em>Velmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Velmin</em>' attribute is set.
     * @see #unsetVelmin()
     * @see #getVelmin()
     * @see #setVelmin(Double)
     * @generated
     */
    boolean isSetVelmin();

    /**
     * Returns the value of the '<em><b>Velmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum gate opening velocity (<i>Velmax</i>) (&gt; GovHydroWPID.velmin).  Unit = PU / s.  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Velmax</em>' attribute.
     * @see #isSetVelmax()
     * @see #unsetVelmax()
     * @see #setVelmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWPID_Velmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWPID.velmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVelmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getVelmax <em>Velmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Velmax</em>' attribute.
     * @see #isSetVelmax()
     * @see #unsetVelmax()
     * @see #getVelmax()
     * @generated
     */
    void setVelmax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getVelmax <em>Velmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVelmax()
     * @see #getVelmax()
     * @see #setVelmax(Double)
     * @generated
     */
    void unsetVelmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getVelmax <em>Velmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Velmax</em>' attribute is set.
     * @see #unsetVelmax()
     * @see #getVelmax()
     * @see #setVelmax(Double)
     * @generated
     */
    boolean isSetVelmax();

    /**
     * Returns the value of the '<em><b>Pmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum power output (<i>Pmax</i>) (&gt; GovHydroWPID.pmin).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pmax</em>' attribute.
     * @see #isSetPmax()
     * @see #unsetPmax()
     * @see #setPmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWPID_Pmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWPID.pmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getPmax <em>Pmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pmax</em>' attribute.
     * @see #isSetPmax()
     * @see #unsetPmax()
     * @see #getPmax()
     * @generated
     */
    void setPmax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getPmax <em>Pmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPmax()
     * @see #getPmax()
     * @see #setPmax(Double)
     * @generated
     */
    void unsetPmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getPmax <em>Pmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pmax</em>' attribute is set.
     * @see #unsetPmax()
     * @see #getPmax()
     * @see #setPmax(Double)
     * @generated
     */
    boolean isSetPmax();

    /**
     * Returns the value of the '<em><b>Pgv3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Output at <i>Gv3</i> PU of <i>MWbase</i> (<i>Pgv3</i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pgv3</em>' attribute.
     * @see #isSetPgv3()
     * @see #unsetPgv3()
     * @see #setPgv3(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWPID_Pgv3()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWPID.pgv3' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPgv3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getPgv3 <em>Pgv3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pgv3</em>' attribute.
     * @see #isSetPgv3()
     * @see #unsetPgv3()
     * @see #getPgv3()
     * @generated
     */
    void setPgv3( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getPgv3 <em>Pgv3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPgv3()
     * @see #getPgv3()
     * @see #setPgv3(Double)
     * @generated
     */
    void unsetPgv3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getPgv3 <em>Pgv3</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pgv3</em>' attribute is set.
     * @see #unsetPgv3()
     * @see #getPgv3()
     * @see #setPgv3(Double)
     * @generated
     */
    boolean isSetPgv3();

    /**
     * Returns the value of the '<em><b>Pgv1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Output at <i>Gv1</i> PU of <i>MWbase</i> (<i>Pgv1</i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pgv1</em>' attribute.
     * @see #isSetPgv1()
     * @see #unsetPgv1()
     * @see #setPgv1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWPID_Pgv1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWPID.pgv1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPgv1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getPgv1 <em>Pgv1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pgv1</em>' attribute.
     * @see #isSetPgv1()
     * @see #unsetPgv1()
     * @see #getPgv1()
     * @generated
     */
    void setPgv1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getPgv1 <em>Pgv1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPgv1()
     * @see #getPgv1()
     * @see #setPgv1(Double)
     * @generated
     */
    void unsetPgv1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getPgv1 <em>Pgv1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pgv1</em>' attribute is set.
     * @see #unsetPgv1()
     * @see #getPgv1()
     * @see #setPgv1(Double)
     * @generated
     */
    boolean isSetPgv1();

    /**
     * Returns the value of the '<em><b>Pgv2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Output at <i>Gv2</i> PU of <i>MWbase</i> (<i>Pgv2</i>).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pgv2</em>' attribute.
     * @see #isSetPgv2()
     * @see #unsetPgv2()
     * @see #setPgv2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWPID_Pgv2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWPID.pgv2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPgv2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getPgv2 <em>Pgv2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pgv2</em>' attribute.
     * @see #isSetPgv2()
     * @see #unsetPgv2()
     * @see #getPgv2()
     * @generated
     */
    void setPgv2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getPgv2 <em>Pgv2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPgv2()
     * @see #getPgv2()
     * @see #setPgv2(Double)
     * @generated
     */
    void unsetPgv2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getPgv2 <em>Pgv2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pgv2</em>' attribute is set.
     * @see #unsetPgv2()
     * @see #getPgv2()
     * @see #setPgv2(Double)
     * @generated
     */
    boolean isSetPgv2();

    /**
     * Returns the value of the '<em><b>Mwbase</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Base for power values  (<i>MWbase</i>) (&gt; 0).  Unit = MW.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Mwbase</em>' attribute.
     * @see #isSetMwbase()
     * @see #unsetMwbase()
     * @see #setMwbase(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWPID_Mwbase()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ActivePower" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWPID.mwbase' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getMwbase();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getMwbase <em>Mwbase</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getMwbase <em>Mwbase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMwbase()
     * @see #getMwbase()
     * @see #setMwbase(Double)
     * @generated
     */
    void unsetMwbase();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getMwbase <em>Mwbase</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Treg</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Speed detector time constant (<i>Treg</i>) (&gt;= 0).
     * <!-- end-model-doc -->
     * @return the value of the '<em>Treg</em>' attribute.
     * @see #isSetTreg()
     * @see #unsetTreg()
     * @see #setTreg(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovHydroWPID_Treg()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovHydroWPID.treg' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTreg();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getTreg <em>Treg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Treg</em>' attribute.
     * @see #isSetTreg()
     * @see #unsetTreg()
     * @see #getTreg()
     * @generated
     */
    void setTreg( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getTreg <em>Treg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTreg()
     * @see #getTreg()
     * @see #setTreg(Double)
     * @generated
     */
    void unsetTreg();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovHydroWPID#getTreg <em>Treg</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Treg</em>' attribute is set.
     * @see #unsetTreg()
     * @see #getTreg()
     * @see #setTreg(Double)
     * @generated
     */
    boolean isSetTreg();

} // GovHydroWPID

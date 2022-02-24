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
 * A representation of the model object '<em><b>Gov GAST3</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Generic turbogas with acceleration and temperature controller.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getKa <em>Ka</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getKy <em>Ky</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getMnef <em>Mnef</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getBp <em>Bp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getMxef <em>Mxef</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getRcmx <em>Rcmx</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getRcmn <em>Rcmn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getTt <em>Tt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getTy <em>Ty</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getTg <em>Tg</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getTd <em>Td</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getTc <em>Tc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getTfen <em>Tfen</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getDtc <em>Dtc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getTac <em>Tac</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getKsi <em>Ksi</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getTsi <em>Tsi</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getTtc <em>Ttc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getBca <em>Bca</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getKac <em>Kac</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getKca <em>Kca</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovGAST3()
 * @model
 * @generated
 */
public interface GovGAST3 extends TurbineGovernorDynamics {
    /**
     * Returns the value of the '<em><b>Ka</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum fuel flow (<i>Ka</i>).  Typical value = 0,23.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ka</em>' attribute.
     * @see #isSetKa()
     * @see #unsetKa()
     * @see #setKa(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovGAST3_Ka()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovGAST3.ka' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKa();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getKa <em>Ka</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ka</em>' attribute.
     * @see #isSetKa()
     * @see #unsetKa()
     * @see #getKa()
     * @generated
     */
    void setKa( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getKa <em>Ka</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKa()
     * @see #getKa()
     * @see #setKa(Double)
     * @generated
     */
    void unsetKa();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getKa <em>Ka</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ka</em>' attribute is set.
     * @see #unsetKa()
     * @see #getKa()
     * @see #setKa(Double)
     * @generated
     */
    boolean isSetKa();

    /**
     * Returns the value of the '<em><b>Ky</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Coefficient of transfer function of fuel valve positioner (<i>Ky</i>).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ky</em>' attribute.
     * @see #isSetKy()
     * @see #unsetKy()
     * @see #setKy(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovGAST3_Ky()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='GovGAST3.ky' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKy();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getKy <em>Ky</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ky</em>' attribute.
     * @see #isSetKy()
     * @see #unsetKy()
     * @see #getKy()
     * @generated
     */
    void setKy( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getKy <em>Ky</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKy()
     * @see #getKy()
     * @see #setKy(Double)
     * @generated
     */
    void unsetKy();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getKy <em>Ky</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ky</em>' attribute is set.
     * @see #unsetKy()
     * @see #getKy()
     * @see #setKy(Double)
     * @generated
     */
    boolean isSetKy();

    /**
     * Returns the value of the '<em><b>Mnef</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Fuel flow maximum negative error value (<i>MNef</i>).  Typical value = -0,05.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Mnef</em>' attribute.
     * @see #isSetMnef()
     * @see #unsetMnef()
     * @see #setMnef(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovGAST3_Mnef()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovGAST3.mnef' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getMnef();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getMnef <em>Mnef</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mnef</em>' attribute.
     * @see #isSetMnef()
     * @see #unsetMnef()
     * @see #getMnef()
     * @generated
     */
    void setMnef( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getMnef <em>Mnef</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMnef()
     * @see #getMnef()
     * @see #setMnef(Double)
     * @generated
     */
    void unsetMnef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getMnef <em>Mnef</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Mnef</em>' attribute is set.
     * @see #unsetMnef()
     * @see #getMnef()
     * @see #setMnef(Double)
     * @generated
     */
    boolean isSetMnef();

    /**
     * Returns the value of the '<em><b>Bp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Droop (<i>bp</i>).  Typical value = 0,05.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Bp</em>' attribute.
     * @see #isSetBp()
     * @see #unsetBp()
     * @see #setBp(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovGAST3_Bp()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovGAST3.bp' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getBp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getBp <em>Bp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bp</em>' attribute.
     * @see #isSetBp()
     * @see #unsetBp()
     * @see #getBp()
     * @generated
     */
    void setBp( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getBp <em>Bp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBp()
     * @see #getBp()
     * @see #setBp(Double)
     * @generated
     */
    void unsetBp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getBp <em>Bp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Bp</em>' attribute is set.
     * @see #unsetBp()
     * @see #getBp()
     * @see #setBp(Double)
     * @generated
     */
    boolean isSetBp();

    /**
     * Returns the value of the '<em><b>Mxef</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Fuel flow maximum positive error value (<i>MXef</i>).  Typical value = 0,05.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Mxef</em>' attribute.
     * @see #isSetMxef()
     * @see #unsetMxef()
     * @see #setMxef(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovGAST3_Mxef()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovGAST3.mxef' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getMxef();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getMxef <em>Mxef</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mxef</em>' attribute.
     * @see #isSetMxef()
     * @see #unsetMxef()
     * @see #getMxef()
     * @generated
     */
    void setMxef( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getMxef <em>Mxef</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMxef()
     * @see #getMxef()
     * @see #setMxef(Double)
     * @generated
     */
    void unsetMxef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getMxef <em>Mxef</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Mxef</em>' attribute is set.
     * @see #unsetMxef()
     * @see #getMxef()
     * @see #setMxef(Double)
     * @generated
     */
    boolean isSetMxef();

    /**
     * Returns the value of the '<em><b>Rcmx</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum fuel flow (<i>RCMX</i>).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Rcmx</em>' attribute.
     * @see #isSetRcmx()
     * @see #unsetRcmx()
     * @see #setRcmx(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovGAST3_Rcmx()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovGAST3.rcmx' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getRcmx();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getRcmx <em>Rcmx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rcmx</em>' attribute.
     * @see #isSetRcmx()
     * @see #unsetRcmx()
     * @see #getRcmx()
     * @generated
     */
    void setRcmx( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getRcmx <em>Rcmx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRcmx()
     * @see #getRcmx()
     * @see #setRcmx(Double)
     * @generated
     */
    void unsetRcmx();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getRcmx <em>Rcmx</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rcmx</em>' attribute is set.
     * @see #unsetRcmx()
     * @see #getRcmx()
     * @see #setRcmx(Double)
     * @generated
     */
    boolean isSetRcmx();

    /**
     * Returns the value of the '<em><b>Rcmn</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum fuel flow (<i>RCMN</i>).  Typical value = -0,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Rcmn</em>' attribute.
     * @see #isSetRcmn()
     * @see #unsetRcmn()
     * @see #setRcmn(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovGAST3_Rcmn()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovGAST3.rcmn' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getRcmn();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getRcmn <em>Rcmn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rcmn</em>' attribute.
     * @see #isSetRcmn()
     * @see #unsetRcmn()
     * @see #getRcmn()
     * @generated
     */
    void setRcmn( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getRcmn <em>Rcmn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRcmn()
     * @see #getRcmn()
     * @see #setRcmn(Double)
     * @generated
     */
    void unsetRcmn();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getRcmn <em>Rcmn</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rcmn</em>' attribute is set.
     * @see #unsetRcmn()
     * @see #getRcmn()
     * @see #setRcmn(Double)
     * @generated
     */
    boolean isSetRcmn();

    /**
     * Returns the value of the '<em><b>Tt</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Temperature controller integration rate (<i>Tt</i>).  Typical value = 250.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tt</em>' attribute.
     * @see #isSetTt()
     * @see #unsetTt()
     * @see #setTt(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovGAST3_Tt()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Temperature" transient="true" ordered="false"
     *        extendedMetaData="name='GovGAST3.tt' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTt();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getTt <em>Tt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tt</em>' attribute.
     * @see #isSetTt()
     * @see #unsetTt()
     * @see #getTt()
     * @generated
     */
    void setTt( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getTt <em>Tt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTt()
     * @see #getTt()
     * @see #setTt(Double)
     * @generated
     */
    void unsetTt();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getTt <em>Tt</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tt</em>' attribute is set.
     * @see #unsetTt()
     * @see #getTt()
     * @see #setTt(Double)
     * @generated
     */
    boolean isSetTt();

    /**
     * Returns the value of the '<em><b>Ty</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time constant of fuel valve positioner (<i>Ty</i>) (&gt;= 0).  Typical value = 0,2.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ty</em>' attribute.
     * @see #isSetTy()
     * @see #unsetTy()
     * @see #setTy(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovGAST3_Ty()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovGAST3.ty' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTy();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getTy <em>Ty</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ty</em>' attribute.
     * @see #isSetTy()
     * @see #unsetTy()
     * @see #getTy()
     * @generated
     */
    void setTy( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getTy <em>Ty</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTy()
     * @see #getTy()
     * @see #setTy(Double)
     * @generated
     */
    void unsetTy();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getTy <em>Ty</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ty</em>' attribute is set.
     * @see #unsetTy()
     * @see #getTy()
     * @see #setTy(Double)
     * @generated
     */
    boolean isSetTy();

    /**
     * Returns the value of the '<em><b>Tg</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time constant of speed governor (<i>Tg</i>) (&gt;= 0).  Typical value = 0,05.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tg</em>' attribute.
     * @see #isSetTg()
     * @see #unsetTg()
     * @see #setTg(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovGAST3_Tg()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovGAST3.tg' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTg();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getTg <em>Tg</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getTg <em>Tg</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTg()
     * @see #getTg()
     * @see #setTg(Double)
     * @generated
     */
    void unsetTg();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getTg <em>Tg</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Td</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Temperature controller derivative gain (<i>Td</i>) (&gt;= 0).  Typical value = 3,3.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Td</em>' attribute.
     * @see #isSetTd()
     * @see #unsetTd()
     * @see #setTd(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovGAST3_Td()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovGAST3.td' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTd();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getTd <em>Td</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getTd <em>Td</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTd()
     * @see #getTd()
     * @see #setTd(Double)
     * @generated
     */
    void unsetTd();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getTd <em>Td</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Tc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Compressor discharge volume time constant (<i>Tc</i>) (&gt;= 0).  Typical value = 0,2.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tc</em>' attribute.
     * @see #isSetTc()
     * @see #unsetTc()
     * @see #setTc(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovGAST3_Tc()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovGAST3.tc' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getTc <em>Tc</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getTc <em>Tc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTc()
     * @see #getTc()
     * @see #setTc(Double)
     * @generated
     */
    void unsetTc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getTc <em>Tc</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Tfen</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Turbine rated exhaust temperature correspondent to Pm=1 PU (<i>Tfen</i>).  Typical value = 540.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tfen</em>' attribute.
     * @see #isSetTfen()
     * @see #unsetTfen()
     * @see #setTfen(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovGAST3_Tfen()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Temperature" transient="true" ordered="false"
     *        extendedMetaData="name='GovGAST3.tfen' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTfen();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getTfen <em>Tfen</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tfen</em>' attribute.
     * @see #isSetTfen()
     * @see #unsetTfen()
     * @see #getTfen()
     * @generated
     */
    void setTfen( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getTfen <em>Tfen</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTfen()
     * @see #getTfen()
     * @see #setTfen(Double)
     * @generated
     */
    void unsetTfen();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getTfen <em>Tfen</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tfen</em>' attribute is set.
     * @see #unsetTfen()
     * @see #getTfen()
     * @see #setTfen(Double)
     * @generated
     */
    boolean isSetTfen();

    /**
     * Returns the value of the '<em><b>Dtc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Exhaust temperature variation due to fuel flow increasing from 0 to 1 PU (<i>deltaTc</i>).  Typical value = 390.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Dtc</em>' attribute.
     * @see #isSetDtc()
     * @see #unsetDtc()
     * @see #setDtc(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovGAST3_Dtc()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Temperature" transient="true" ordered="false"
     *        extendedMetaData="name='GovGAST3.dtc' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getDtc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getDtc <em>Dtc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dtc</em>' attribute.
     * @see #isSetDtc()
     * @see #unsetDtc()
     * @see #getDtc()
     * @generated
     */
    void setDtc( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getDtc <em>Dtc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDtc()
     * @see #getDtc()
     * @see #setDtc(Double)
     * @generated
     */
    void unsetDtc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getDtc <em>Dtc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dtc</em>' attribute is set.
     * @see #unsetDtc()
     * @see #getDtc()
     * @see #setDtc(Double)
     * @generated
     */
    boolean isSetDtc();

    /**
     * Returns the value of the '<em><b>Tac</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Fuel control time constant (<i>Tac</i>) (&gt;= 0).  Typical value = 0,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tac</em>' attribute.
     * @see #isSetTac()
     * @see #unsetTac()
     * @see #setTac(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovGAST3_Tac()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovGAST3.tac' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTac();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getTac <em>Tac</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tac</em>' attribute.
     * @see #isSetTac()
     * @see #unsetTac()
     * @see #getTac()
     * @generated
     */
    void setTac( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getTac <em>Tac</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTac()
     * @see #getTac()
     * @see #setTac(Double)
     * @generated
     */
    void unsetTac();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getTac <em>Tac</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tac</em>' attribute is set.
     * @see #unsetTac()
     * @see #getTac()
     * @see #setTac(Double)
     * @generated
     */
    boolean isSetTac();

    /**
     * Returns the value of the '<em><b>Ksi</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Gain of radiation shield (<i>Ksi</i>).  Typical value = 0,8.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ksi</em>' attribute.
     * @see #isSetKsi()
     * @see #unsetKsi()
     * @see #setKsi(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovGAST3_Ksi()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='GovGAST3.ksi' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKsi();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getKsi <em>Ksi</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ksi</em>' attribute.
     * @see #isSetKsi()
     * @see #unsetKsi()
     * @see #getKsi()
     * @generated
     */
    void setKsi( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getKsi <em>Ksi</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKsi()
     * @see #getKsi()
     * @see #setKsi(Double)
     * @generated
     */
    void unsetKsi();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getKsi <em>Ksi</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ksi</em>' attribute is set.
     * @see #unsetKsi()
     * @see #getKsi()
     * @see #setKsi(Double)
     * @generated
     */
    boolean isSetKsi();

    /**
     * Returns the value of the '<em><b>Tsi</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time constant of radiation shield (<i>Tsi</i>) (&gt;= 0).  Typical value = 15.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tsi</em>' attribute.
     * @see #isSetTsi()
     * @see #unsetTsi()
     * @see #setTsi(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovGAST3_Tsi()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovGAST3.tsi' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTsi();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getTsi <em>Tsi</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tsi</em>' attribute.
     * @see #isSetTsi()
     * @see #unsetTsi()
     * @see #getTsi()
     * @generated
     */
    void setTsi( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getTsi <em>Tsi</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTsi()
     * @see #getTsi()
     * @see #setTsi(Double)
     * @generated
     */
    void unsetTsi();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getTsi <em>Tsi</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tsi</em>' attribute is set.
     * @see #unsetTsi()
     * @see #getTsi()
     * @see #setTsi(Double)
     * @generated
     */
    boolean isSetTsi();

    /**
     * Returns the value of the '<em><b>Ttc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time constant of thermocouple (<i>Ttc</i>) (&gt;= 0).  Typical value = 2,5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ttc</em>' attribute.
     * @see #isSetTtc()
     * @see #unsetTtc()
     * @see #setTtc(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovGAST3_Ttc()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovGAST3.ttc' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTtc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getTtc <em>Ttc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ttc</em>' attribute.
     * @see #isSetTtc()
     * @see #unsetTtc()
     * @see #getTtc()
     * @generated
     */
    void setTtc( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getTtc <em>Ttc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTtc()
     * @see #getTtc()
     * @see #setTtc(Double)
     * @generated
     */
    void unsetTtc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getTtc <em>Ttc</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ttc</em>' attribute is set.
     * @see #unsetTtc()
     * @see #getTtc()
     * @see #setTtc(Double)
     * @generated
     */
    boolean isSetTtc();

    /**
     * Returns the value of the '<em><b>Bca</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Acceleration limit set-point (<i>Bca</i>).  Unit = 1/s.  Typical value = 0,01.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Bca</em>' attribute.
     * @see #isSetBca()
     * @see #unsetBca()
     * @see #setBca(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovGAST3_Bca()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='GovGAST3.bca' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getBca();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getBca <em>Bca</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Bca</em>' attribute.
     * @see #isSetBca()
     * @see #unsetBca()
     * @see #getBca()
     * @generated
     */
    void setBca( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getBca <em>Bca</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBca()
     * @see #getBca()
     * @see #setBca(Double)
     * @generated
     */
    void unsetBca();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getBca <em>Bca</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Bca</em>' attribute is set.
     * @see #unsetBca()
     * @see #getBca()
     * @see #setBca(Double)
     * @generated
     */
    boolean isSetBca();

    /**
     * Returns the value of the '<em><b>Kac</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Fuel system feedback (<i>K</i><i><sub>AC</sub></i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kac</em>' attribute.
     * @see #isSetKac()
     * @see #unsetKac()
     * @see #setKac(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovGAST3_Kac()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='GovGAST3.kac' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKac();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getKac <em>Kac</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kac</em>' attribute.
     * @see #isSetKac()
     * @see #unsetKac()
     * @see #getKac()
     * @generated
     */
    void setKac( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getKac <em>Kac</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKac()
     * @see #getKac()
     * @see #setKac(Double)
     * @generated
     */
    void unsetKac();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getKac <em>Kac</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kac</em>' attribute is set.
     * @see #unsetKac()
     * @see #getKac()
     * @see #setKac(Double)
     * @generated
     */
    boolean isSetKac();

    /**
     * Returns the value of the '<em><b>Kca</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Acceleration control integral gain (<i>Kca</i>). Unit = 1/s.  Typical value = 100.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kca</em>' attribute.
     * @see #isSetKca()
     * @see #unsetKca()
     * @see #setKca(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovGAST3_Kca()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='GovGAST3.kca' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKca();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getKca <em>Kca</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kca</em>' attribute.
     * @see #isSetKca()
     * @see #unsetKca()
     * @see #getKca()
     * @generated
     */
    void setKca( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getKca <em>Kca</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKca()
     * @see #getKca()
     * @see #setKca(Double)
     * @generated
     */
    void unsetKca();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST3#getKca <em>Kca</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kca</em>' attribute is set.
     * @see #unsetKca()
     * @see #getKca()
     * @see #setKca(Double)
     * @generated
     */
    boolean isSetKca();

} // GovGAST3

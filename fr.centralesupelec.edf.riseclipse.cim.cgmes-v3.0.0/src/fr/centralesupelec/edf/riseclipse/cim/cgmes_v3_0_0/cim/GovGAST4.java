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
 * A representation of the model object '<em><b>Gov GAST4</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Generic turbogas.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST4#getMxef <em>Mxef</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST4#getMnef <em>Mnef</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST4#getTy <em>Ty</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST4#getTm <em>Tm</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST4#getTc <em>Tc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST4#getTa <em>Ta</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST4#getTcm <em>Tcm</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST4#getKtm <em>Ktm</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST4#getBp <em>Bp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST4#getRymn <em>Rymn</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST4#getRymx <em>Rymx</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovGAST4()
 * @model
 * @generated
 */
public interface GovGAST4 extends TurbineGovernorDynamics {
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovGAST4_Mxef()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovGAST4.mxef' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getMxef();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST4#getMxef <em>Mxef</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST4#getMxef <em>Mxef</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMxef()
     * @see #getMxef()
     * @see #setMxef(Double)
     * @generated
     */
    void unsetMxef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST4#getMxef <em>Mxef</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovGAST4_Mnef()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovGAST4.mnef' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getMnef();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST4#getMnef <em>Mnef</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST4#getMnef <em>Mnef</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMnef()
     * @see #getMnef()
     * @see #setMnef(Double)
     * @generated
     */
    void unsetMnef();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST4#getMnef <em>Mnef</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Ty</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time constant of fuel valve positioner (<i>Ty</i>) (&gt;= 0).  Typical value = 0,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ty</em>' attribute.
     * @see #isSetTy()
     * @see #unsetTy()
     * @see #setTy(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovGAST4_Ty()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovGAST4.ty' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTy();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST4#getTy <em>Ty</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST4#getTy <em>Ty</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTy()
     * @see #getTy()
     * @see #setTy(Double)
     * @generated
     */
    void unsetTy();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST4#getTy <em>Ty</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Tm</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Compressor discharge volume time constant (<i>Tm</i>) (&gt;= 0).  Typical value = 0,2.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tm</em>' attribute.
     * @see #isSetTm()
     * @see #unsetTm()
     * @see #setTm(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovGAST4_Tm()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovGAST4.tm' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTm();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST4#getTm <em>Tm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tm</em>' attribute.
     * @see #isSetTm()
     * @see #unsetTm()
     * @see #getTm()
     * @generated
     */
    void setTm( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST4#getTm <em>Tm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTm()
     * @see #getTm()
     * @see #setTm(Double)
     * @generated
     */
    void unsetTm();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST4#getTm <em>Tm</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tm</em>' attribute is set.
     * @see #unsetTm()
     * @see #getTm()
     * @see #setTm(Double)
     * @generated
     */
    boolean isSetTm();

    /**
     * Returns the value of the '<em><b>Tc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum gate closing velocity (<i>TC</i>) (&gt;= 0).  Typical value = 0,5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tc</em>' attribute.
     * @see #isSetTc()
     * @see #unsetTc()
     * @see #setTc(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovGAST4_Tc()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovGAST4.tc' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST4#getTc <em>Tc</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST4#getTc <em>Tc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTc()
     * @see #getTc()
     * @see #setTc(Double)
     * @generated
     */
    void unsetTc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST4#getTc <em>Tc</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Ta</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum gate opening velocity (<i>TA</i>) (&gt;= 0).  Typical value = 3.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ta</em>' attribute.
     * @see #isSetTa()
     * @see #unsetTa()
     * @see #setTa(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovGAST4_Ta()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovGAST4.ta' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTa();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST4#getTa <em>Ta</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST4#getTa <em>Ta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTa()
     * @see #getTa()
     * @see #setTa(Double)
     * @generated
     */
    void unsetTa();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST4#getTa <em>Ta</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Tcm</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Fuel control time constant (<i>Tcm</i>) (&gt;= 0).  Typical value = 0,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tcm</em>' attribute.
     * @see #isSetTcm()
     * @see #unsetTcm()
     * @see #setTcm(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovGAST4_Tcm()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovGAST4.tcm' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTcm();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST4#getTcm <em>Tcm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tcm</em>' attribute.
     * @see #isSetTcm()
     * @see #unsetTcm()
     * @see #getTcm()
     * @generated
     */
    void setTcm( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST4#getTcm <em>Tcm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTcm()
     * @see #getTcm()
     * @see #setTcm(Double)
     * @generated
     */
    void unsetTcm();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST4#getTcm <em>Tcm</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tcm</em>' attribute is set.
     * @see #unsetTcm()
     * @see #getTcm()
     * @see #setTcm(Double)
     * @generated
     */
    boolean isSetTcm();

    /**
     * Returns the value of the '<em><b>Ktm</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Compressor gain (<i>Ktm</i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ktm</em>' attribute.
     * @see #isSetKtm()
     * @see #unsetKtm()
     * @see #setKtm(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovGAST4_Ktm()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovGAST4.ktm' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKtm();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST4#getKtm <em>Ktm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ktm</em>' attribute.
     * @see #isSetKtm()
     * @see #unsetKtm()
     * @see #getKtm()
     * @generated
     */
    void setKtm( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST4#getKtm <em>Ktm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKtm()
     * @see #getKtm()
     * @see #setKtm(Double)
     * @generated
     */
    void unsetKtm();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST4#getKtm <em>Ktm</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ktm</em>' attribute is set.
     * @see #unsetKtm()
     * @see #getKtm()
     * @see #setKtm(Double)
     * @generated
     */
    boolean isSetKtm();

    /**
     * Returns the value of the '<em><b>Bp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Droop (<i>b</i><i><sub>p</sub></i>).  Typical value = 0,05.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Bp</em>' attribute.
     * @see #isSetBp()
     * @see #unsetBp()
     * @see #setBp(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovGAST4_Bp()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovGAST4.bp' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getBp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST4#getBp <em>Bp</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST4#getBp <em>Bp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBp()
     * @see #getBp()
     * @see #setBp(Double)
     * @generated
     */
    void unsetBp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST4#getBp <em>Bp</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Rymn</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum valve opening (<i>RYMN</i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Rymn</em>' attribute.
     * @see #isSetRymn()
     * @see #unsetRymn()
     * @see #setRymn(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovGAST4_Rymn()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovGAST4.rymn' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getRymn();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST4#getRymn <em>Rymn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rymn</em>' attribute.
     * @see #isSetRymn()
     * @see #unsetRymn()
     * @see #getRymn()
     * @generated
     */
    void setRymn( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST4#getRymn <em>Rymn</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRymn()
     * @see #getRymn()
     * @see #setRymn(Double)
     * @generated
     */
    void unsetRymn();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST4#getRymn <em>Rymn</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rymn</em>' attribute is set.
     * @see #unsetRymn()
     * @see #getRymn()
     * @see #setRymn(Double)
     * @generated
     */
    boolean isSetRymn();

    /**
     * Returns the value of the '<em><b>Rymx</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum valve opening (<i>RYMX</i>).  Typical value = 1,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Rymx</em>' attribute.
     * @see #isSetRymx()
     * @see #unsetRymx()
     * @see #setRymx(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovGAST4_Rymx()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovGAST4.rymx' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getRymx();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST4#getRymx <em>Rymx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rymx</em>' attribute.
     * @see #isSetRymx()
     * @see #unsetRymx()
     * @see #getRymx()
     * @generated
     */
    void setRymx( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST4#getRymx <em>Rymx</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRymx()
     * @see #getRymx()
     * @see #setRymx(Double)
     * @generated
     */
    void unsetRymx();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovGAST4#getRymx <em>Rymx</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rymx</em>' attribute is set.
     * @see #unsetRymx()
     * @see #getRymx()
     * @see #setRymx(Double)
     * @generated
     */
    boolean isSetRymx();

} // GovGAST4

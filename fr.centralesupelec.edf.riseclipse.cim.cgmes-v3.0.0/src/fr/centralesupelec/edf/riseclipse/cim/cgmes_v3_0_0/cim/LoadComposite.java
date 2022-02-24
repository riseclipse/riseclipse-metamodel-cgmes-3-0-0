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
 * A representation of the model object '<em><b>Load Composite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Combined static load and induction motor load effects.
 * The dynamics of the motor are simplified by linearizing the induction machine equations.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadComposite#getEpvs <em>Epvs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadComposite#getEpvd <em>Epvd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadComposite#getEpfs <em>Epfs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadComposite#getEpfd <em>Epfd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadComposite#getEqvd <em>Eqvd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadComposite#getEqvs <em>Eqvs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadComposite#getPfrac <em>Pfrac</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadComposite#getEqfs <em>Eqfs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadComposite#getEqfd <em>Eqfd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadComposite#getLfac <em>Lfac</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadComposite#getH <em>H</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadComposite()
 * @model
 * @generated
 */
public interface LoadComposite extends LoadDynamics {
    /**
     * Returns the value of the '<em><b>Epvs</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Active load-voltage dependence index (static) (<i>Epvs</i>).  Typical value = 0,7.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Epvs</em>' attribute.
     * @see #isSetEpvs()
     * @see #unsetEpvs()
     * @see #setEpvs(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadComposite_Epvs()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='LoadComposite.epvs' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getEpvs();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadComposite#getEpvs <em>Epvs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Epvs</em>' attribute.
     * @see #isSetEpvs()
     * @see #unsetEpvs()
     * @see #getEpvs()
     * @generated
     */
    void setEpvs( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadComposite#getEpvs <em>Epvs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEpvs()
     * @see #getEpvs()
     * @see #setEpvs(Double)
     * @generated
     */
    void unsetEpvs();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadComposite#getEpvs <em>Epvs</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Epvs</em>' attribute is set.
     * @see #unsetEpvs()
     * @see #getEpvs()
     * @see #setEpvs(Double)
     * @generated
     */
    boolean isSetEpvs();

    /**
     * Returns the value of the '<em><b>Epvd</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Active load-voltage dependence index (dynamic) (<i>Epvd</i>).  Typical value = 0,7.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Epvd</em>' attribute.
     * @see #isSetEpvd()
     * @see #unsetEpvd()
     * @see #setEpvd(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadComposite_Epvd()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='LoadComposite.epvd' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getEpvd();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadComposite#getEpvd <em>Epvd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Epvd</em>' attribute.
     * @see #isSetEpvd()
     * @see #unsetEpvd()
     * @see #getEpvd()
     * @generated
     */
    void setEpvd( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadComposite#getEpvd <em>Epvd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEpvd()
     * @see #getEpvd()
     * @see #setEpvd(Double)
     * @generated
     */
    void unsetEpvd();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadComposite#getEpvd <em>Epvd</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Epvd</em>' attribute is set.
     * @see #unsetEpvd()
     * @see #getEpvd()
     * @see #setEpvd(Double)
     * @generated
     */
    boolean isSetEpvd();

    /**
     * Returns the value of the '<em><b>Epfs</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Active load-frequency dependence index (static) (<i>Epfs</i>).  Typical value = 1,5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Epfs</em>' attribute.
     * @see #isSetEpfs()
     * @see #unsetEpfs()
     * @see #setEpfs(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadComposite_Epfs()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='LoadComposite.epfs' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getEpfs();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadComposite#getEpfs <em>Epfs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Epfs</em>' attribute.
     * @see #isSetEpfs()
     * @see #unsetEpfs()
     * @see #getEpfs()
     * @generated
     */
    void setEpfs( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadComposite#getEpfs <em>Epfs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEpfs()
     * @see #getEpfs()
     * @see #setEpfs(Double)
     * @generated
     */
    void unsetEpfs();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadComposite#getEpfs <em>Epfs</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Epfs</em>' attribute is set.
     * @see #unsetEpfs()
     * @see #getEpfs()
     * @see #setEpfs(Double)
     * @generated
     */
    boolean isSetEpfs();

    /**
     * Returns the value of the '<em><b>Epfd</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Active load-frequency dependence index (dynamic) (<i>Epfd</i>).  Typical value = 1,5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Epfd</em>' attribute.
     * @see #isSetEpfd()
     * @see #unsetEpfd()
     * @see #setEpfd(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadComposite_Epfd()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='LoadComposite.epfd' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getEpfd();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadComposite#getEpfd <em>Epfd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Epfd</em>' attribute.
     * @see #isSetEpfd()
     * @see #unsetEpfd()
     * @see #getEpfd()
     * @generated
     */
    void setEpfd( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadComposite#getEpfd <em>Epfd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEpfd()
     * @see #getEpfd()
     * @see #setEpfd(Double)
     * @generated
     */
    void unsetEpfd();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadComposite#getEpfd <em>Epfd</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Epfd</em>' attribute is set.
     * @see #unsetEpfd()
     * @see #getEpfd()
     * @see #setEpfd(Double)
     * @generated
     */
    boolean isSetEpfd();

    /**
     * Returns the value of the '<em><b>Eqvd</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reactive load-voltage dependence index (dynamic) (<i>Eqvd</i>).  Typical value = 2.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Eqvd</em>' attribute.
     * @see #isSetEqvd()
     * @see #unsetEqvd()
     * @see #setEqvd(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadComposite_Eqvd()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='LoadComposite.eqvd' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getEqvd();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadComposite#getEqvd <em>Eqvd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Eqvd</em>' attribute.
     * @see #isSetEqvd()
     * @see #unsetEqvd()
     * @see #getEqvd()
     * @generated
     */
    void setEqvd( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadComposite#getEqvd <em>Eqvd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEqvd()
     * @see #getEqvd()
     * @see #setEqvd(Double)
     * @generated
     */
    void unsetEqvd();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadComposite#getEqvd <em>Eqvd</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Eqvd</em>' attribute is set.
     * @see #unsetEqvd()
     * @see #getEqvd()
     * @see #setEqvd(Double)
     * @generated
     */
    boolean isSetEqvd();

    /**
     * Returns the value of the '<em><b>Eqvs</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reactive load-voltage dependence index (static) (<i>Eqvs</i>).  Typical value = 2.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Eqvs</em>' attribute.
     * @see #isSetEqvs()
     * @see #unsetEqvs()
     * @see #setEqvs(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadComposite_Eqvs()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='LoadComposite.eqvs' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getEqvs();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadComposite#getEqvs <em>Eqvs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Eqvs</em>' attribute.
     * @see #isSetEqvs()
     * @see #unsetEqvs()
     * @see #getEqvs()
     * @generated
     */
    void setEqvs( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadComposite#getEqvs <em>Eqvs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEqvs()
     * @see #getEqvs()
     * @see #setEqvs(Double)
     * @generated
     */
    void unsetEqvs();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadComposite#getEqvs <em>Eqvs</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Eqvs</em>' attribute is set.
     * @see #unsetEqvs()
     * @see #getEqvs()
     * @see #setEqvs(Double)
     * @generated
     */
    boolean isSetEqvs();

    /**
     * Returns the value of the '<em><b>Pfrac</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Fraction of constant-power load to be represented by this motor model (<i>P</i><i><sub>FRAC</sub></i>) (&gt;= 0,0 and &lt;= 1,0).  Typical value = 0,5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pfrac</em>' attribute.
     * @see #isSetPfrac()
     * @see #unsetPfrac()
     * @see #setPfrac(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadComposite_Pfrac()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='LoadComposite.pfrac' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPfrac();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadComposite#getPfrac <em>Pfrac</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadComposite#getPfrac <em>Pfrac</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPfrac()
     * @see #getPfrac()
     * @see #setPfrac(Double)
     * @generated
     */
    void unsetPfrac();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadComposite#getPfrac <em>Pfrac</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Eqfs</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reactive load-frequency dependence index (static) (<i>Eqfs</i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Eqfs</em>' attribute.
     * @see #isSetEqfs()
     * @see #unsetEqfs()
     * @see #setEqfs(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadComposite_Eqfs()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='LoadComposite.eqfs' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getEqfs();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadComposite#getEqfs <em>Eqfs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Eqfs</em>' attribute.
     * @see #isSetEqfs()
     * @see #unsetEqfs()
     * @see #getEqfs()
     * @generated
     */
    void setEqfs( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadComposite#getEqfs <em>Eqfs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEqfs()
     * @see #getEqfs()
     * @see #setEqfs(Double)
     * @generated
     */
    void unsetEqfs();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadComposite#getEqfs <em>Eqfs</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Eqfs</em>' attribute is set.
     * @see #unsetEqfs()
     * @see #getEqfs()
     * @see #setEqfs(Double)
     * @generated
     */
    boolean isSetEqfs();

    /**
     * Returns the value of the '<em><b>Eqfd</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reactive load-frequency dependence index (dynamic) (<i>Eqfd</i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Eqfd</em>' attribute.
     * @see #isSetEqfd()
     * @see #unsetEqfd()
     * @see #setEqfd(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadComposite_Eqfd()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='LoadComposite.eqfd' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getEqfd();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadComposite#getEqfd <em>Eqfd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Eqfd</em>' attribute.
     * @see #isSetEqfd()
     * @see #unsetEqfd()
     * @see #getEqfd()
     * @generated
     */
    void setEqfd( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadComposite#getEqfd <em>Eqfd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEqfd()
     * @see #getEqfd()
     * @see #setEqfd(Double)
     * @generated
     */
    void unsetEqfd();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadComposite#getEqfd <em>Eqfd</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Eqfd</em>' attribute is set.
     * @see #unsetEqfd()
     * @see #getEqfd()
     * @see #setEqfd(Double)
     * @generated
     */
    boolean isSetEqfd();

    /**
     * Returns the value of the '<em><b>Lfac</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Loading factor (<i>L</i><i><sub>fac</sub></i>). The ratio of initial <i>P</i> to motor MVA base.  Typical value = 0,8.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Lfac</em>' attribute.
     * @see #isSetLfac()
     * @see #unsetLfac()
     * @see #setLfac(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadComposite_Lfac()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='LoadComposite.lfac' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getLfac();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadComposite#getLfac <em>Lfac</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadComposite#getLfac <em>Lfac</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLfac()
     * @see #getLfac()
     * @see #setLfac(Double)
     * @generated
     */
    void unsetLfac();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadComposite#getLfac <em>Lfac</em>}' attribute is set.
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
     * Returns the value of the '<em><b>H</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Inertia constant (<i>H</i>) (&gt;= 0).  Typical value = 2,5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>H</em>' attribute.
     * @see #isSetH()
     * @see #unsetH()
     * @see #setH(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getLoadComposite_H()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='LoadComposite.h' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getH();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadComposite#getH <em>H</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadComposite#getH <em>H</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetH()
     * @see #getH()
     * @see #setH(Double)
     * @generated
     */
    void unsetH();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadComposite#getH <em>H</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>H</em>' attribute is set.
     * @see #unsetH()
     * @see #getH()
     * @see #setH(Double)
     * @generated
     */
    boolean isSetH();

} // LoadComposite

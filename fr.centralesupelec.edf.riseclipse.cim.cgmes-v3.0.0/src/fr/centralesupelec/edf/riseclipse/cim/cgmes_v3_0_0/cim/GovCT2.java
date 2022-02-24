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
 * A representation of the model object '<em><b>Gov CT2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * General governor with frequency-dependent fuel flow limit.  This model is a modification of the GovCT1<b> </b>model in order to represent the frequency-dependent fuel flow limit of a specific gas turbine manufacturer.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getTact <em>Tact</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getRselect <em>Rselect</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getAset <em>Aset</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getKturb <em>Kturb</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getMinerr <em>Minerr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getMwbase <em>Mwbase</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getPrate <em>Prate</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getKdgov <em>Kdgov</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getRclose <em>Rclose</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getPlim9 <em>Plim9</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getPlim7 <em>Plim7</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getPlim8 <em>Plim8</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getPlim5 <em>Plim5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getPlim6 <em>Plim6</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getPlim3 <em>Plim3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getPlim4 <em>Plim4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getPlim1 <em>Plim1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getPlim2 <em>Plim2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getLdref <em>Ldref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getTsa <em>Tsa</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getTsb <em>Tsb</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getR <em>R</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getPlim10 <em>Plim10</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getVmax <em>Vmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getRdown <em>Rdown</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getVmin <em>Vmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getKigov <em>Kigov</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getRopen <em>Ropen</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getRup <em>Rup</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getTfload <em>Tfload</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getKpload <em>Kpload</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getDb <em>Db</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getDm <em>Dm</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getTeng <em>Teng</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getWfnl <em>Wfnl</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getMaxerr <em>Maxerr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getWfspd <em>Wfspd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getKiload <em>Kiload</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getKa <em>Ka</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getTc <em>Tc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getTb <em>Tb</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getTa <em>Ta</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getTdgov <em>Tdgov</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getKimw <em>Kimw</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getKpgov <em>Kpgov</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getFlim9 <em>Flim9</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getFlim2 <em>Flim2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getFlim1 <em>Flim1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getFlim4 <em>Flim4</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getFlim3 <em>Flim3</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getFlim6 <em>Flim6</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getFlim5 <em>Flim5</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getFlim8 <em>Flim8</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getFlim7 <em>Flim7</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getTpelec <em>Tpelec</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getFlim10 <em>Flim10</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT2()
 * @model
 * @generated
 */
public interface GovCT2 extends TurbineGovernorDynamics {
    /**
     * Returns the value of the '<em><b>Tact</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Actuator time constant (<i>Tact</i>) (&gt;= 0).  Typical value = 0,4.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tact</em>' attribute.
     * @see #isSetTact()
     * @see #unsetTact()
     * @see #setTact(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT2_Tact()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT2.tact' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTact();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getTact <em>Tact</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tact</em>' attribute.
     * @see #isSetTact()
     * @see #unsetTact()
     * @see #getTact()
     * @generated
     */
    void setTact( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getTact <em>Tact</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTact()
     * @see #getTact()
     * @see #setTact(Double)
     * @generated
     */
    void unsetTact();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getTact <em>Tact</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tact</em>' attribute is set.
     * @see #unsetTact()
     * @see #getTact()
     * @see #setTact(Double)
     * @generated
     */
    boolean isSetTact();

    /**
     * Returns the value of the '<em><b>Rselect</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DroopSignalFeedbackKind}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Feedback signal for droop (<i>Rselect</i>).  Typical value = electricalPower.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Rselect</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DroopSignalFeedbackKind
     * @see #isSetRselect()
     * @see #unsetRselect()
     * @see #setRselect(DroopSignalFeedbackKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT2_Rselect()
     * @model unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT2.rselect' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    DroopSignalFeedbackKind getRselect();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getRselect <em>Rselect</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rselect</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DroopSignalFeedbackKind
     * @see #isSetRselect()
     * @see #unsetRselect()
     * @see #getRselect()
     * @generated
     */
    void setRselect( DroopSignalFeedbackKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getRselect <em>Rselect</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRselect()
     * @see #getRselect()
     * @see #setRselect(DroopSignalFeedbackKind)
     * @generated
     */
    void unsetRselect();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getRselect <em>Rselect</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rselect</em>' attribute is set.
     * @see #unsetRselect()
     * @see #getRselect()
     * @see #setRselect(DroopSignalFeedbackKind)
     * @generated
     */
    boolean isSetRselect();

    /**
     * Returns the value of the '<em><b>Aset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Acceleration limiter setpoint (<i>Aset</i>).  Unit = PU / s.  Typical value = 10.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Aset</em>' attribute.
     * @see #isSetAset()
     * @see #unsetAset()
     * @see #setAset(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT2_Aset()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT2.aset' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getAset();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getAset <em>Aset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Aset</em>' attribute.
     * @see #isSetAset()
     * @see #unsetAset()
     * @see #getAset()
     * @generated
     */
    void setAset( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getAset <em>Aset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAset()
     * @see #getAset()
     * @see #setAset(Double)
     * @generated
     */
    void unsetAset();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getAset <em>Aset</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Aset</em>' attribute is set.
     * @see #unsetAset()
     * @see #getAset()
     * @see #setAset(Double)
     * @generated
     */
    boolean isSetAset();

    /**
     * Returns the value of the '<em><b>Kturb</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Turbine gain (<i>Kturb</i>).  Typical value = 1,9168.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kturb</em>' attribute.
     * @see #isSetKturb()
     * @see #unsetKturb()
     * @see #setKturb(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT2_Kturb()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT2.kturb' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKturb();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getKturb <em>Kturb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kturb</em>' attribute.
     * @see #isSetKturb()
     * @see #unsetKturb()
     * @see #getKturb()
     * @generated
     */
    void setKturb( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getKturb <em>Kturb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKturb()
     * @see #getKturb()
     * @see #setKturb(Double)
     * @generated
     */
    void unsetKturb();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getKturb <em>Kturb</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kturb</em>' attribute is set.
     * @see #unsetKturb()
     * @see #getKturb()
     * @see #setKturb(Double)
     * @generated
     */
    boolean isSetKturb();

    /**
     * Returns the value of the '<em><b>Minerr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum value for speed error signal (<i>Minerr</i>) (&lt; GovCT2.maxerr).  Typical value = -1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Minerr</em>' attribute.
     * @see #isSetMinerr()
     * @see #unsetMinerr()
     * @see #setMinerr(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT2_Minerr()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT2.minerr' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getMinerr();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getMinerr <em>Minerr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Minerr</em>' attribute.
     * @see #isSetMinerr()
     * @see #unsetMinerr()
     * @see #getMinerr()
     * @generated
     */
    void setMinerr( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getMinerr <em>Minerr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMinerr()
     * @see #getMinerr()
     * @see #setMinerr(Double)
     * @generated
     */
    void unsetMinerr();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getMinerr <em>Minerr</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Minerr</em>' attribute is set.
     * @see #unsetMinerr()
     * @see #getMinerr()
     * @see #setMinerr(Double)
     * @generated
     */
    boolean isSetMinerr();

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
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT2_Mwbase()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ActivePower" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT2.mwbase' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getMwbase();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getMwbase <em>Mwbase</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getMwbase <em>Mwbase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMwbase()
     * @see #getMwbase()
     * @see #setMwbase(Double)
     * @generated
     */
    void unsetMwbase();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getMwbase <em>Mwbase</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Prate</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Ramp rate for frequency-dependent power limit (<i>Prate</i>).  Typical value = 0,017.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Prate</em>' attribute.
     * @see #isSetPrate()
     * @see #unsetPrate()
     * @see #setPrate(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT2_Prate()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT2.prate' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPrate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getPrate <em>Prate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Prate</em>' attribute.
     * @see #isSetPrate()
     * @see #unsetPrate()
     * @see #getPrate()
     * @generated
     */
    void setPrate( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getPrate <em>Prate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPrate()
     * @see #getPrate()
     * @see #setPrate(Double)
     * @generated
     */
    void unsetPrate();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getPrate <em>Prate</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Prate</em>' attribute is set.
     * @see #unsetPrate()
     * @see #getPrate()
     * @see #setPrate(Double)
     * @generated
     */
    boolean isSetPrate();

    /**
     * Returns the value of the '<em><b>Kdgov</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Governor derivative gain (<i>Kdgov</i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kdgov</em>' attribute.
     * @see #isSetKdgov()
     * @see #unsetKdgov()
     * @see #setKdgov(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT2_Kdgov()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT2.kdgov' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKdgov();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getKdgov <em>Kdgov</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kdgov</em>' attribute.
     * @see #isSetKdgov()
     * @see #unsetKdgov()
     * @see #getKdgov()
     * @generated
     */
    void setKdgov( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getKdgov <em>Kdgov</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKdgov()
     * @see #getKdgov()
     * @see #setKdgov(Double)
     * @generated
     */
    void unsetKdgov();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getKdgov <em>Kdgov</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kdgov</em>' attribute is set.
     * @see #unsetKdgov()
     * @see #getKdgov()
     * @see #setKdgov(Double)
     * @generated
     */
    boolean isSetKdgov();

    /**
     * Returns the value of the '<em><b>Rclose</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum valve closing rate (<i>Rclose</i>).  Unit = PU / s.  Typical value = -99.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Rclose</em>' attribute.
     * @see #isSetRclose()
     * @see #unsetRclose()
     * @see #setRclose(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT2_Rclose()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT2.rclose' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getRclose();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getRclose <em>Rclose</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rclose</em>' attribute.
     * @see #isSetRclose()
     * @see #unsetRclose()
     * @see #getRclose()
     * @generated
     */
    void setRclose( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getRclose <em>Rclose</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRclose()
     * @see #getRclose()
     * @see #setRclose(Double)
     * @generated
     */
    void unsetRclose();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getRclose <em>Rclose</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rclose</em>' attribute is set.
     * @see #unsetRclose()
     * @see #getRclose()
     * @see #setRclose(Double)
     * @generated
     */
    boolean isSetRclose();

    /**
     * Returns the value of the '<em><b>Plim9</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Power Limit 9 (<i>Plim9</i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Plim9</em>' attribute.
     * @see #isSetPlim9()
     * @see #unsetPlim9()
     * @see #setPlim9(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT2_Plim9()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT2.plim9' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPlim9();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getPlim9 <em>Plim9</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Plim9</em>' attribute.
     * @see #isSetPlim9()
     * @see #unsetPlim9()
     * @see #getPlim9()
     * @generated
     */
    void setPlim9( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getPlim9 <em>Plim9</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPlim9()
     * @see #getPlim9()
     * @see #setPlim9(Double)
     * @generated
     */
    void unsetPlim9();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getPlim9 <em>Plim9</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Plim9</em>' attribute is set.
     * @see #unsetPlim9()
     * @see #getPlim9()
     * @see #setPlim9(Double)
     * @generated
     */
    boolean isSetPlim9();

    /**
     * Returns the value of the '<em><b>Plim7</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Power limit 7 (<i>Plim7</i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Plim7</em>' attribute.
     * @see #isSetPlim7()
     * @see #unsetPlim7()
     * @see #setPlim7(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT2_Plim7()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT2.plim7' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPlim7();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getPlim7 <em>Plim7</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Plim7</em>' attribute.
     * @see #isSetPlim7()
     * @see #unsetPlim7()
     * @see #getPlim7()
     * @generated
     */
    void setPlim7( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getPlim7 <em>Plim7</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPlim7()
     * @see #getPlim7()
     * @see #setPlim7(Double)
     * @generated
     */
    void unsetPlim7();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getPlim7 <em>Plim7</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Plim7</em>' attribute is set.
     * @see #unsetPlim7()
     * @see #getPlim7()
     * @see #setPlim7(Double)
     * @generated
     */
    boolean isSetPlim7();

    /**
     * Returns the value of the '<em><b>Plim8</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Power limit 8 (<i>Plim8</i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Plim8</em>' attribute.
     * @see #isSetPlim8()
     * @see #unsetPlim8()
     * @see #setPlim8(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT2_Plim8()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT2.plim8' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPlim8();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getPlim8 <em>Plim8</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Plim8</em>' attribute.
     * @see #isSetPlim8()
     * @see #unsetPlim8()
     * @see #getPlim8()
     * @generated
     */
    void setPlim8( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getPlim8 <em>Plim8</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPlim8()
     * @see #getPlim8()
     * @see #setPlim8(Double)
     * @generated
     */
    void unsetPlim8();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getPlim8 <em>Plim8</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Plim8</em>' attribute is set.
     * @see #unsetPlim8()
     * @see #getPlim8()
     * @see #setPlim8(Double)
     * @generated
     */
    boolean isSetPlim8();

    /**
     * Returns the value of the '<em><b>Plim5</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Power limit 5 (<i>Plim5</i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Plim5</em>' attribute.
     * @see #isSetPlim5()
     * @see #unsetPlim5()
     * @see #setPlim5(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT2_Plim5()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT2.plim5' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPlim5();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getPlim5 <em>Plim5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Plim5</em>' attribute.
     * @see #isSetPlim5()
     * @see #unsetPlim5()
     * @see #getPlim5()
     * @generated
     */
    void setPlim5( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getPlim5 <em>Plim5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPlim5()
     * @see #getPlim5()
     * @see #setPlim5(Double)
     * @generated
     */
    void unsetPlim5();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getPlim5 <em>Plim5</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Plim5</em>' attribute is set.
     * @see #unsetPlim5()
     * @see #getPlim5()
     * @see #setPlim5(Double)
     * @generated
     */
    boolean isSetPlim5();

    /**
     * Returns the value of the '<em><b>Plim6</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Power limit 6 (<i>Plim6</i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Plim6</em>' attribute.
     * @see #isSetPlim6()
     * @see #unsetPlim6()
     * @see #setPlim6(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT2_Plim6()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT2.plim6' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPlim6();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getPlim6 <em>Plim6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Plim6</em>' attribute.
     * @see #isSetPlim6()
     * @see #unsetPlim6()
     * @see #getPlim6()
     * @generated
     */
    void setPlim6( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getPlim6 <em>Plim6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPlim6()
     * @see #getPlim6()
     * @see #setPlim6(Double)
     * @generated
     */
    void unsetPlim6();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getPlim6 <em>Plim6</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Plim6</em>' attribute is set.
     * @see #unsetPlim6()
     * @see #getPlim6()
     * @see #setPlim6(Double)
     * @generated
     */
    boolean isSetPlim6();

    /**
     * Returns the value of the '<em><b>Plim3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Power limit 3 (<i>Plim3</i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Plim3</em>' attribute.
     * @see #isSetPlim3()
     * @see #unsetPlim3()
     * @see #setPlim3(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT2_Plim3()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT2.plim3' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPlim3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getPlim3 <em>Plim3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Plim3</em>' attribute.
     * @see #isSetPlim3()
     * @see #unsetPlim3()
     * @see #getPlim3()
     * @generated
     */
    void setPlim3( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getPlim3 <em>Plim3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPlim3()
     * @see #getPlim3()
     * @see #setPlim3(Double)
     * @generated
     */
    void unsetPlim3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getPlim3 <em>Plim3</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Plim3</em>' attribute is set.
     * @see #unsetPlim3()
     * @see #getPlim3()
     * @see #setPlim3(Double)
     * @generated
     */
    boolean isSetPlim3();

    /**
     * Returns the value of the '<em><b>Plim4</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Power limit 4 (<i>Plim4</i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Plim4</em>' attribute.
     * @see #isSetPlim4()
     * @see #unsetPlim4()
     * @see #setPlim4(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT2_Plim4()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT2.plim4' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPlim4();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getPlim4 <em>Plim4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Plim4</em>' attribute.
     * @see #isSetPlim4()
     * @see #unsetPlim4()
     * @see #getPlim4()
     * @generated
     */
    void setPlim4( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getPlim4 <em>Plim4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPlim4()
     * @see #getPlim4()
     * @see #setPlim4(Double)
     * @generated
     */
    void unsetPlim4();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getPlim4 <em>Plim4</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Plim4</em>' attribute is set.
     * @see #unsetPlim4()
     * @see #getPlim4()
     * @see #setPlim4(Double)
     * @generated
     */
    boolean isSetPlim4();

    /**
     * Returns the value of the '<em><b>Plim1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Power limit 1 (<i>Plim1</i>).  Typical value = 0,8325.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Plim1</em>' attribute.
     * @see #isSetPlim1()
     * @see #unsetPlim1()
     * @see #setPlim1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT2_Plim1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT2.plim1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPlim1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getPlim1 <em>Plim1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Plim1</em>' attribute.
     * @see #isSetPlim1()
     * @see #unsetPlim1()
     * @see #getPlim1()
     * @generated
     */
    void setPlim1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getPlim1 <em>Plim1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPlim1()
     * @see #getPlim1()
     * @see #setPlim1(Double)
     * @generated
     */
    void unsetPlim1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getPlim1 <em>Plim1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Plim1</em>' attribute is set.
     * @see #unsetPlim1()
     * @see #getPlim1()
     * @see #setPlim1(Double)
     * @generated
     */
    boolean isSetPlim1();

    /**
     * Returns the value of the '<em><b>Plim2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Power limit 2 (Plim2).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Plim2</em>' attribute.
     * @see #isSetPlim2()
     * @see #unsetPlim2()
     * @see #setPlim2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT2_Plim2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT2.plim2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPlim2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getPlim2 <em>Plim2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Plim2</em>' attribute.
     * @see #isSetPlim2()
     * @see #unsetPlim2()
     * @see #getPlim2()
     * @generated
     */
    void setPlim2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getPlim2 <em>Plim2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPlim2()
     * @see #getPlim2()
     * @see #setPlim2(Double)
     * @generated
     */
    void unsetPlim2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getPlim2 <em>Plim2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Plim2</em>' attribute is set.
     * @see #unsetPlim2()
     * @see #getPlim2()
     * @see #setPlim2(Double)
     * @generated
     */
    boolean isSetPlim2();

    /**
     * Returns the value of the '<em><b>Ldref</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Load limiter reference value (<i>Ldref</i>).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ldref</em>' attribute.
     * @see #isSetLdref()
     * @see #unsetLdref()
     * @see #setLdref(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT2_Ldref()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT2.ldref' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getLdref();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getLdref <em>Ldref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ldref</em>' attribute.
     * @see #isSetLdref()
     * @see #unsetLdref()
     * @see #getLdref()
     * @generated
     */
    void setLdref( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getLdref <em>Ldref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLdref()
     * @see #getLdref()
     * @see #setLdref(Double)
     * @generated
     */
    void unsetLdref();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getLdref <em>Ldref</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ldref</em>' attribute is set.
     * @see #unsetLdref()
     * @see #getLdref()
     * @see #setLdref(Double)
     * @generated
     */
    boolean isSetLdref();

    /**
     * Returns the value of the '<em><b>Tsa</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Temperature detection lead time constant (<i>Tsa</i>) (&gt;= 0).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tsa</em>' attribute.
     * @see #isSetTsa()
     * @see #unsetTsa()
     * @see #setTsa(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT2_Tsa()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT2.tsa' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTsa();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getTsa <em>Tsa</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tsa</em>' attribute.
     * @see #isSetTsa()
     * @see #unsetTsa()
     * @see #getTsa()
     * @generated
     */
    void setTsa( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getTsa <em>Tsa</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTsa()
     * @see #getTsa()
     * @see #setTsa(Double)
     * @generated
     */
    void unsetTsa();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getTsa <em>Tsa</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tsa</em>' attribute is set.
     * @see #unsetTsa()
     * @see #getTsa()
     * @see #setTsa(Double)
     * @generated
     */
    boolean isSetTsa();

    /**
     * Returns the value of the '<em><b>Tsb</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Temperature detection lag time constant (<i>Tsb</i>) (&gt;= 0).  Typical value = 50.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tsb</em>' attribute.
     * @see #isSetTsb()
     * @see #unsetTsb()
     * @see #setTsb(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT2_Tsb()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT2.tsb' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTsb();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getTsb <em>Tsb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tsb</em>' attribute.
     * @see #isSetTsb()
     * @see #unsetTsb()
     * @see #getTsb()
     * @generated
     */
    void setTsb( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getTsb <em>Tsb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTsb()
     * @see #getTsb()
     * @see #setTsb(Double)
     * @generated
     */
    void unsetTsb();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getTsb <em>Tsb</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tsb</em>' attribute is set.
     * @see #unsetTsb()
     * @see #getTsb()
     * @see #setTsb(Double)
     * @generated
     */
    boolean isSetTsb();

    /**
     * Returns the value of the '<em><b>R</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Permanent droop (<i>R</i>).  Typical value = 0,05.
     * <!-- end-model-doc -->
     * @return the value of the '<em>R</em>' attribute.
     * @see #isSetR()
     * @see #unsetR()
     * @see #setR(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT2_R()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT2.r' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getR();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getR <em>R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>R</em>' attribute.
     * @see #isSetR()
     * @see #unsetR()
     * @see #getR()
     * @generated
     */
    void setR( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getR <em>R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetR()
     * @see #getR()
     * @see #setR(Double)
     * @generated
     */
    void unsetR();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getR <em>R</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>R</em>' attribute is set.
     * @see #unsetR()
     * @see #getR()
     * @see #setR(Double)
     * @generated
     */
    boolean isSetR();

    /**
     * Returns the value of the '<em><b>Plim10</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Power limit 10 (<i>Plim10</i>).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Plim10</em>' attribute.
     * @see #isSetPlim10()
     * @see #unsetPlim10()
     * @see #setPlim10(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT2_Plim10()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT2.plim10' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPlim10();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getPlim10 <em>Plim10</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Plim10</em>' attribute.
     * @see #isSetPlim10()
     * @see #unsetPlim10()
     * @see #getPlim10()
     * @generated
     */
    void setPlim10( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getPlim10 <em>Plim10</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPlim10()
     * @see #getPlim10()
     * @see #setPlim10(Double)
     * @generated
     */
    void unsetPlim10();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getPlim10 <em>Plim10</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Plim10</em>' attribute is set.
     * @see #unsetPlim10()
     * @see #getPlim10()
     * @see #setPlim10(Double)
     * @generated
     */
    boolean isSetPlim10();

    /**
     * Returns the value of the '<em><b>Vmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum valve position limit (<i>Vmax</i>) (&gt; GovCT2.vmin).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vmax</em>' attribute.
     * @see #isSetVmax()
     * @see #unsetVmax()
     * @see #setVmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT2_Vmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT2.vmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getVmax <em>Vmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vmax</em>' attribute.
     * @see #isSetVmax()
     * @see #unsetVmax()
     * @see #getVmax()
     * @generated
     */
    void setVmax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getVmax <em>Vmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVmax()
     * @see #getVmax()
     * @see #setVmax(Double)
     * @generated
     */
    void unsetVmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getVmax <em>Vmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vmax</em>' attribute is set.
     * @see #unsetVmax()
     * @see #getVmax()
     * @see #setVmax(Double)
     * @generated
     */
    boolean isSetVmax();

    /**
     * Returns the value of the '<em><b>Rdown</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum rate of load limit decrease (<i>Rdown</i>).  Typical value = -99.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Rdown</em>' attribute.
     * @see #isSetRdown()
     * @see #unsetRdown()
     * @see #setRdown(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT2_Rdown()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT2.rdown' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getRdown();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getRdown <em>Rdown</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rdown</em>' attribute.
     * @see #isSetRdown()
     * @see #unsetRdown()
     * @see #getRdown()
     * @generated
     */
    void setRdown( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getRdown <em>Rdown</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRdown()
     * @see #getRdown()
     * @see #setRdown(Double)
     * @generated
     */
    void unsetRdown();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getRdown <em>Rdown</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rdown</em>' attribute is set.
     * @see #unsetRdown()
     * @see #getRdown()
     * @see #setRdown(Double)
     * @generated
     */
    boolean isSetRdown();

    /**
     * Returns the value of the '<em><b>Vmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum valve position limit (<i>Vmin</i>) (&lt; GovCT2.vmax).  Typical value = 0,175.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vmin</em>' attribute.
     * @see #isSetVmin()
     * @see #unsetVmin()
     * @see #setVmin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT2_Vmin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT2.vmin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getVmin <em>Vmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Vmin</em>' attribute.
     * @see #isSetVmin()
     * @see #unsetVmin()
     * @see #getVmin()
     * @generated
     */
    void setVmin( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getVmin <em>Vmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVmin()
     * @see #getVmin()
     * @see #setVmin(Double)
     * @generated
     */
    void unsetVmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getVmin <em>Vmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Vmin</em>' attribute is set.
     * @see #unsetVmin()
     * @see #getVmin()
     * @see #setVmin(Double)
     * @generated
     */
    boolean isSetVmin();

    /**
     * Returns the value of the '<em><b>Kigov</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Governor integral gain (<i>Kigov</i>).  Typical value = 0,45.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kigov</em>' attribute.
     * @see #isSetKigov()
     * @see #unsetKigov()
     * @see #setKigov(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT2_Kigov()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT2.kigov' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKigov();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getKigov <em>Kigov</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kigov</em>' attribute.
     * @see #isSetKigov()
     * @see #unsetKigov()
     * @see #getKigov()
     * @generated
     */
    void setKigov( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getKigov <em>Kigov</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKigov()
     * @see #getKigov()
     * @see #setKigov(Double)
     * @generated
     */
    void unsetKigov();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getKigov <em>Kigov</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kigov</em>' attribute is set.
     * @see #unsetKigov()
     * @see #getKigov()
     * @see #setKigov(Double)
     * @generated
     */
    boolean isSetKigov();

    /**
     * Returns the value of the '<em><b>Ropen</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum valve opening rate (<i>Ropen</i>).  Unit = PU / s.  Typical value = 99.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ropen</em>' attribute.
     * @see #isSetRopen()
     * @see #unsetRopen()
     * @see #setRopen(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT2_Ropen()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT2.ropen' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getRopen();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getRopen <em>Ropen</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ropen</em>' attribute.
     * @see #isSetRopen()
     * @see #unsetRopen()
     * @see #getRopen()
     * @generated
     */
    void setRopen( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getRopen <em>Ropen</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRopen()
     * @see #getRopen()
     * @see #setRopen(Double)
     * @generated
     */
    void unsetRopen();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getRopen <em>Ropen</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ropen</em>' attribute is set.
     * @see #unsetRopen()
     * @see #getRopen()
     * @see #setRopen(Double)
     * @generated
     */
    boolean isSetRopen();

    /**
     * Returns the value of the '<em><b>Rup</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum rate of load limit increase (<i>Rup</i>).  Typical value = 99.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Rup</em>' attribute.
     * @see #isSetRup()
     * @see #unsetRup()
     * @see #setRup(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT2_Rup()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT2.rup' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getRup();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getRup <em>Rup</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rup</em>' attribute.
     * @see #isSetRup()
     * @see #unsetRup()
     * @see #getRup()
     * @generated
     */
    void setRup( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getRup <em>Rup</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRup()
     * @see #getRup()
     * @see #setRup(Double)
     * @generated
     */
    void unsetRup();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getRup <em>Rup</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rup</em>' attribute is set.
     * @see #unsetRup()
     * @see #getRup()
     * @see #setRup(Double)
     * @generated
     */
    boolean isSetRup();

    /**
     * Returns the value of the '<em><b>Tfload</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Load limiter time constant (<i>Tfload</i>) (&gt;= 0).  Typical value = 3.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tfload</em>' attribute.
     * @see #isSetTfload()
     * @see #unsetTfload()
     * @see #setTfload(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT2_Tfload()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT2.tfload' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTfload();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getTfload <em>Tfload</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tfload</em>' attribute.
     * @see #isSetTfload()
     * @see #unsetTfload()
     * @see #getTfload()
     * @generated
     */
    void setTfload( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getTfload <em>Tfload</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTfload()
     * @see #getTfload()
     * @see #setTfload(Double)
     * @generated
     */
    void unsetTfload();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getTfload <em>Tfload</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tfload</em>' attribute is set.
     * @see #unsetTfload()
     * @see #getTfload()
     * @see #setTfload(Double)
     * @generated
     */
    boolean isSetTfload();

    /**
     * Returns the value of the '<em><b>Kpload</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Load limiter proportional gain for PI controller (<i>Kpload</i>).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kpload</em>' attribute.
     * @see #isSetKpload()
     * @see #unsetKpload()
     * @see #setKpload(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT2_Kpload()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT2.kpload' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKpload();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getKpload <em>Kpload</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kpload</em>' attribute.
     * @see #isSetKpload()
     * @see #unsetKpload()
     * @see #getKpload()
     * @generated
     */
    void setKpload( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getKpload <em>Kpload</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKpload()
     * @see #getKpload()
     * @see #setKpload(Double)
     * @generated
     */
    void unsetKpload();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getKpload <em>Kpload</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kpload</em>' attribute is set.
     * @see #unsetKpload()
     * @see #getKpload()
     * @see #setKpload(Double)
     * @generated
     */
    boolean isSetKpload();

    /**
     * Returns the value of the '<em><b>Db</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Speed governor deadband in PU speed (<i>db</i>).  In the majority of applications, it is recommended that this value be set to zero.  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Db</em>' attribute.
     * @see #isSetDb()
     * @see #unsetDb()
     * @see #setDb(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT2_Db()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT2.db' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getDb();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getDb <em>Db</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getDb <em>Db</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDb()
     * @see #getDb()
     * @see #setDb(Double)
     * @generated
     */
    void unsetDb();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getDb <em>Db</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Dm</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Speed sensitivity coefficient (<i>Dm</i>).  <i>Dm</i> can represent either the variation of the engine power with the shaft speed or the variation of maximum power capability with shaft speed.  If it is positive it describes the falling slope of the engine speed verses power characteristic as speed increases. A slightly falling characteristic is typical for reciprocating engines and some aero-derivative turbines.  If it is negative the engine power is assumed to be unaffected by the shaft speed, but the maximum permissible fuel flow is taken to fall with falling shaft speed. This is characteristic of single-shaft industrial turbines due to exhaust temperature limits.  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Dm</em>' attribute.
     * @see #isSetDm()
     * @see #unsetDm()
     * @see #setDm(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT2_Dm()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT2.dm' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getDm();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getDm <em>Dm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dm</em>' attribute.
     * @see #isSetDm()
     * @see #unsetDm()
     * @see #getDm()
     * @generated
     */
    void setDm( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getDm <em>Dm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDm()
     * @see #getDm()
     * @see #setDm(Double)
     * @generated
     */
    void unsetDm();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getDm <em>Dm</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Dm</em>' attribute is set.
     * @see #unsetDm()
     * @see #getDm()
     * @see #setDm(Double)
     * @generated
     */
    boolean isSetDm();

    /**
     * Returns the value of the '<em><b>Teng</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Transport time delay for diesel engine used in representing diesel engines where there is a small but measurable transport delay between a change in fuel flow setting and the development of torque (<i>Teng</i>) (&gt;= 0).  <i>Teng</i> should be zero in all but special cases where this transport delay is of particular concern.  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Teng</em>' attribute.
     * @see #isSetTeng()
     * @see #unsetTeng()
     * @see #setTeng(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT2_Teng()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT2.teng' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTeng();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getTeng <em>Teng</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Teng</em>' attribute.
     * @see #isSetTeng()
     * @see #unsetTeng()
     * @see #getTeng()
     * @generated
     */
    void setTeng( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getTeng <em>Teng</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTeng()
     * @see #getTeng()
     * @see #setTeng(Double)
     * @generated
     */
    void unsetTeng();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getTeng <em>Teng</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Teng</em>' attribute is set.
     * @see #unsetTeng()
     * @see #getTeng()
     * @see #setTeng(Double)
     * @generated
     */
    boolean isSetTeng();

    /**
     * Returns the value of the '<em><b>Wfnl</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * No load fuel flow (<i>Wfnl</i>).  Typical value = 0,187.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wfnl</em>' attribute.
     * @see #isSetWfnl()
     * @see #unsetWfnl()
     * @see #setWfnl(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT2_Wfnl()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT2.wfnl' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getWfnl();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getWfnl <em>Wfnl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wfnl</em>' attribute.
     * @see #isSetWfnl()
     * @see #unsetWfnl()
     * @see #getWfnl()
     * @generated
     */
    void setWfnl( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getWfnl <em>Wfnl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWfnl()
     * @see #getWfnl()
     * @see #setWfnl(Double)
     * @generated
     */
    void unsetWfnl();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getWfnl <em>Wfnl</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wfnl</em>' attribute is set.
     * @see #unsetWfnl()
     * @see #getWfnl()
     * @see #setWfnl(Double)
     * @generated
     */
    boolean isSetWfnl();

    /**
     * Returns the value of the '<em><b>Maxerr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum value for speed error signal (<i>Maxerr</i>) (&gt; GovCT2.minerr).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Maxerr</em>' attribute.
     * @see #isSetMaxerr()
     * @see #unsetMaxerr()
     * @see #setMaxerr(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT2_Maxerr()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT2.maxerr' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getMaxerr();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getMaxerr <em>Maxerr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Maxerr</em>' attribute.
     * @see #isSetMaxerr()
     * @see #unsetMaxerr()
     * @see #getMaxerr()
     * @generated
     */
    void setMaxerr( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getMaxerr <em>Maxerr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaxerr()
     * @see #getMaxerr()
     * @see #setMaxerr(Double)
     * @generated
     */
    void unsetMaxerr();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getMaxerr <em>Maxerr</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Maxerr</em>' attribute is set.
     * @see #unsetMaxerr()
     * @see #getMaxerr()
     * @see #setMaxerr(Double)
     * @generated
     */
    boolean isSetMaxerr();

    /**
     * Returns the value of the '<em><b>Wfspd</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Switch for fuel source characteristic to recognize that fuel flow, for a given fuel valve stroke, can be proportional to engine speed (<i>Wfspd</i>).
     * true = fuel flow proportional to speed (for some gas turbines and diesel engines with positive displacement fuel injectors)
     * false = fuel control system keeps fuel flow independent of engine speed.
     * Typical value = false.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wfspd</em>' attribute.
     * @see #isSetWfspd()
     * @see #unsetWfspd()
     * @see #setWfspd(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT2_Wfspd()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT2.wfspd' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getWfspd();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getWfspd <em>Wfspd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wfspd</em>' attribute.
     * @see #isSetWfspd()
     * @see #unsetWfspd()
     * @see #getWfspd()
     * @generated
     */
    void setWfspd( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getWfspd <em>Wfspd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWfspd()
     * @see #getWfspd()
     * @see #setWfspd(Boolean)
     * @generated
     */
    void unsetWfspd();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getWfspd <em>Wfspd</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wfspd</em>' attribute is set.
     * @see #unsetWfspd()
     * @see #getWfspd()
     * @see #setWfspd(Boolean)
     * @generated
     */
    boolean isSetWfspd();

    /**
     * Returns the value of the '<em><b>Kiload</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Load limiter integral gain for PI controller (<i>Kiload</i>).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kiload</em>' attribute.
     * @see #isSetKiload()
     * @see #unsetKiload()
     * @see #setKiload(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT2_Kiload()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT2.kiload' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKiload();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getKiload <em>Kiload</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kiload</em>' attribute.
     * @see #isSetKiload()
     * @see #unsetKiload()
     * @see #getKiload()
     * @generated
     */
    void setKiload( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getKiload <em>Kiload</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKiload()
     * @see #getKiload()
     * @see #setKiload(Double)
     * @generated
     */
    void unsetKiload();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getKiload <em>Kiload</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kiload</em>' attribute is set.
     * @see #unsetKiload()
     * @see #getKiload()
     * @see #setKiload(Double)
     * @generated
     */
    boolean isSetKiload();

    /**
     * Returns the value of the '<em><b>Ka</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Acceleration limiter gain (<i>Ka</i>).  Typical value = 10.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ka</em>' attribute.
     * @see #isSetKa()
     * @see #unsetKa()
     * @see #setKa(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT2_Ka()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT2.ka' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKa();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getKa <em>Ka</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getKa <em>Ka</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKa()
     * @see #getKa()
     * @see #setKa(Double)
     * @generated
     */
    void unsetKa();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getKa <em>Ka</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Tc</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Turbine lead time constant (<i>Tc</i>) (&gt;= 0).  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tc</em>' attribute.
     * @see #isSetTc()
     * @see #unsetTc()
     * @see #setTc(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT2_Tc()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT2.tc' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getTc <em>Tc</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getTc <em>Tc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTc()
     * @see #getTc()
     * @see #setTc(Double)
     * @generated
     */
    void unsetTc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getTc <em>Tc</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Tb</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Turbine lag time constant (<i>Tb</i>) (&gt;= 0).  Typical value = 0,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tb</em>' attribute.
     * @see #isSetTb()
     * @see #unsetTb()
     * @see #setTb(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT2_Tb()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT2.tb' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTb();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getTb <em>Tb</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getTb <em>Tb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTb()
     * @see #getTb()
     * @see #setTb(Double)
     * @generated
     */
    void unsetTb();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getTb <em>Tb</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Ta</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Acceleration limiter time constant (<i>Ta</i>) (&gt;= 0).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ta</em>' attribute.
     * @see #isSetTa()
     * @see #unsetTa()
     * @see #setTa(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT2_Ta()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT2.ta' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTa();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getTa <em>Ta</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getTa <em>Ta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTa()
     * @see #getTa()
     * @see #setTa(Double)
     * @generated
     */
    void unsetTa();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getTa <em>Ta</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Tdgov</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Governor derivative controller time constant (<i>Tdgov</i>) (&gt;= 0).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tdgov</em>' attribute.
     * @see #isSetTdgov()
     * @see #unsetTdgov()
     * @see #setTdgov(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT2_Tdgov()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT2.tdgov' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTdgov();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getTdgov <em>Tdgov</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tdgov</em>' attribute.
     * @see #isSetTdgov()
     * @see #unsetTdgov()
     * @see #getTdgov()
     * @generated
     */
    void setTdgov( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getTdgov <em>Tdgov</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTdgov()
     * @see #getTdgov()
     * @see #setTdgov(Double)
     * @generated
     */
    void unsetTdgov();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getTdgov <em>Tdgov</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tdgov</em>' attribute is set.
     * @see #unsetTdgov()
     * @see #getTdgov()
     * @see #setTdgov(Double)
     * @generated
     */
    boolean isSetTdgov();

    /**
     * Returns the value of the '<em><b>Kimw</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Power controller (reset) gain (<i>Kimw</i>).  The default value of 0,01 corresponds to a reset time of 100 seconds.  A value of 0,001 corresponds to a relatively slow-acting load controller.  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kimw</em>' attribute.
     * @see #isSetKimw()
     * @see #unsetKimw()
     * @see #setKimw(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT2_Kimw()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT2.kimw' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKimw();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getKimw <em>Kimw</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kimw</em>' attribute.
     * @see #isSetKimw()
     * @see #unsetKimw()
     * @see #getKimw()
     * @generated
     */
    void setKimw( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getKimw <em>Kimw</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKimw()
     * @see #getKimw()
     * @see #setKimw(Double)
     * @generated
     */
    void unsetKimw();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getKimw <em>Kimw</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kimw</em>' attribute is set.
     * @see #unsetKimw()
     * @see #getKimw()
     * @see #setKimw(Double)
     * @generated
     */
    boolean isSetKimw();

    /**
     * Returns the value of the '<em><b>Kpgov</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Governor proportional gain (<i>Kpgov</i>).  Typical value = 4.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kpgov</em>' attribute.
     * @see #isSetKpgov()
     * @see #unsetKpgov()
     * @see #setKpgov(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT2_Kpgov()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT2.kpgov' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKpgov();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getKpgov <em>Kpgov</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kpgov</em>' attribute.
     * @see #isSetKpgov()
     * @see #unsetKpgov()
     * @see #getKpgov()
     * @generated
     */
    void setKpgov( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getKpgov <em>Kpgov</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKpgov()
     * @see #getKpgov()
     * @see #setKpgov(Double)
     * @generated
     */
    void unsetKpgov();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getKpgov <em>Kpgov</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kpgov</em>' attribute is set.
     * @see #unsetKpgov()
     * @see #getKpgov()
     * @see #setKpgov(Double)
     * @generated
     */
    boolean isSetKpgov();

    /**
     * Returns the value of the '<em><b>Flim9</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Frequency threshold 9 (<i>Flim9</i>).  Unit = Hz.  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Flim9</em>' attribute.
     * @see #isSetFlim9()
     * @see #unsetFlim9()
     * @see #setFlim9(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT2_Flim9()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Frequency" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT2.flim9' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getFlim9();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getFlim9 <em>Flim9</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Flim9</em>' attribute.
     * @see #isSetFlim9()
     * @see #unsetFlim9()
     * @see #getFlim9()
     * @generated
     */
    void setFlim9( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getFlim9 <em>Flim9</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFlim9()
     * @see #getFlim9()
     * @see #setFlim9(Double)
     * @generated
     */
    void unsetFlim9();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getFlim9 <em>Flim9</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Flim9</em>' attribute is set.
     * @see #unsetFlim9()
     * @see #getFlim9()
     * @see #setFlim9(Double)
     * @generated
     */
    boolean isSetFlim9();

    /**
     * Returns the value of the '<em><b>Flim2</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Frequency threshold 2 (<i>Flim2</i>).  Unit = Hz.  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Flim2</em>' attribute.
     * @see #isSetFlim2()
     * @see #unsetFlim2()
     * @see #setFlim2(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT2_Flim2()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Frequency" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT2.flim2' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getFlim2();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getFlim2 <em>Flim2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Flim2</em>' attribute.
     * @see #isSetFlim2()
     * @see #unsetFlim2()
     * @see #getFlim2()
     * @generated
     */
    void setFlim2( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getFlim2 <em>Flim2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFlim2()
     * @see #getFlim2()
     * @see #setFlim2(Double)
     * @generated
     */
    void unsetFlim2();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getFlim2 <em>Flim2</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Flim2</em>' attribute is set.
     * @see #unsetFlim2()
     * @see #getFlim2()
     * @see #setFlim2(Double)
     * @generated
     */
    boolean isSetFlim2();

    /**
     * Returns the value of the '<em><b>Flim1</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Frequency threshold 1 (<i>Flim1</i>).  Unit = Hz.  Typical value = 59.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Flim1</em>' attribute.
     * @see #isSetFlim1()
     * @see #unsetFlim1()
     * @see #setFlim1(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT2_Flim1()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Frequency" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT2.flim1' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getFlim1();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getFlim1 <em>Flim1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Flim1</em>' attribute.
     * @see #isSetFlim1()
     * @see #unsetFlim1()
     * @see #getFlim1()
     * @generated
     */
    void setFlim1( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getFlim1 <em>Flim1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFlim1()
     * @see #getFlim1()
     * @see #setFlim1(Double)
     * @generated
     */
    void unsetFlim1();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getFlim1 <em>Flim1</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Flim1</em>' attribute is set.
     * @see #unsetFlim1()
     * @see #getFlim1()
     * @see #setFlim1(Double)
     * @generated
     */
    boolean isSetFlim1();

    /**
     * Returns the value of the '<em><b>Flim4</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Frequency threshold 4 (<i>Flim4</i>).  Unit = Hz.  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Flim4</em>' attribute.
     * @see #isSetFlim4()
     * @see #unsetFlim4()
     * @see #setFlim4(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT2_Flim4()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Frequency" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT2.flim4' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getFlim4();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getFlim4 <em>Flim4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Flim4</em>' attribute.
     * @see #isSetFlim4()
     * @see #unsetFlim4()
     * @see #getFlim4()
     * @generated
     */
    void setFlim4( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getFlim4 <em>Flim4</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFlim4()
     * @see #getFlim4()
     * @see #setFlim4(Double)
     * @generated
     */
    void unsetFlim4();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getFlim4 <em>Flim4</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Flim4</em>' attribute is set.
     * @see #unsetFlim4()
     * @see #getFlim4()
     * @see #setFlim4(Double)
     * @generated
     */
    boolean isSetFlim4();

    /**
     * Returns the value of the '<em><b>Flim3</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Frequency threshold 3 (<i>Flim3</i>).  Unit = Hz.  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Flim3</em>' attribute.
     * @see #isSetFlim3()
     * @see #unsetFlim3()
     * @see #setFlim3(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT2_Flim3()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Frequency" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT2.flim3' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getFlim3();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getFlim3 <em>Flim3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Flim3</em>' attribute.
     * @see #isSetFlim3()
     * @see #unsetFlim3()
     * @see #getFlim3()
     * @generated
     */
    void setFlim3( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getFlim3 <em>Flim3</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFlim3()
     * @see #getFlim3()
     * @see #setFlim3(Double)
     * @generated
     */
    void unsetFlim3();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getFlim3 <em>Flim3</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Flim3</em>' attribute is set.
     * @see #unsetFlim3()
     * @see #getFlim3()
     * @see #setFlim3(Double)
     * @generated
     */
    boolean isSetFlim3();

    /**
     * Returns the value of the '<em><b>Flim6</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Frequency threshold 6 (<i>Flim6</i>).  Unit = Hz.  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Flim6</em>' attribute.
     * @see #isSetFlim6()
     * @see #unsetFlim6()
     * @see #setFlim6(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT2_Flim6()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Frequency" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT2.flim6' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getFlim6();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getFlim6 <em>Flim6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Flim6</em>' attribute.
     * @see #isSetFlim6()
     * @see #unsetFlim6()
     * @see #getFlim6()
     * @generated
     */
    void setFlim6( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getFlim6 <em>Flim6</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFlim6()
     * @see #getFlim6()
     * @see #setFlim6(Double)
     * @generated
     */
    void unsetFlim6();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getFlim6 <em>Flim6</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Flim6</em>' attribute is set.
     * @see #unsetFlim6()
     * @see #getFlim6()
     * @see #setFlim6(Double)
     * @generated
     */
    boolean isSetFlim6();

    /**
     * Returns the value of the '<em><b>Flim5</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Frequency threshold 5 (<i>Flim5</i>).  Unit = Hz.  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Flim5</em>' attribute.
     * @see #isSetFlim5()
     * @see #unsetFlim5()
     * @see #setFlim5(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT2_Flim5()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Frequency" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT2.flim5' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getFlim5();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getFlim5 <em>Flim5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Flim5</em>' attribute.
     * @see #isSetFlim5()
     * @see #unsetFlim5()
     * @see #getFlim5()
     * @generated
     */
    void setFlim5( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getFlim5 <em>Flim5</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFlim5()
     * @see #getFlim5()
     * @see #setFlim5(Double)
     * @generated
     */
    void unsetFlim5();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getFlim5 <em>Flim5</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Flim5</em>' attribute is set.
     * @see #unsetFlim5()
     * @see #getFlim5()
     * @see #setFlim5(Double)
     * @generated
     */
    boolean isSetFlim5();

    /**
     * Returns the value of the '<em><b>Flim8</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Frequency threshold 8 (<i>Flim8</i>).  Unit = Hz.  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Flim8</em>' attribute.
     * @see #isSetFlim8()
     * @see #unsetFlim8()
     * @see #setFlim8(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT2_Flim8()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Frequency" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT2.flim8' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getFlim8();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getFlim8 <em>Flim8</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Flim8</em>' attribute.
     * @see #isSetFlim8()
     * @see #unsetFlim8()
     * @see #getFlim8()
     * @generated
     */
    void setFlim8( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getFlim8 <em>Flim8</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFlim8()
     * @see #getFlim8()
     * @see #setFlim8(Double)
     * @generated
     */
    void unsetFlim8();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getFlim8 <em>Flim8</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Flim8</em>' attribute is set.
     * @see #unsetFlim8()
     * @see #getFlim8()
     * @see #setFlim8(Double)
     * @generated
     */
    boolean isSetFlim8();

    /**
     * Returns the value of the '<em><b>Flim7</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Frequency threshold 7 (<i>Flim7</i>).  Unit = Hz.  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Flim7</em>' attribute.
     * @see #isSetFlim7()
     * @see #unsetFlim7()
     * @see #setFlim7(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT2_Flim7()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Frequency" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT2.flim7' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getFlim7();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getFlim7 <em>Flim7</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Flim7</em>' attribute.
     * @see #isSetFlim7()
     * @see #unsetFlim7()
     * @see #getFlim7()
     * @generated
     */
    void setFlim7( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getFlim7 <em>Flim7</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFlim7()
     * @see #getFlim7()
     * @see #setFlim7(Double)
     * @generated
     */
    void unsetFlim7();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getFlim7 <em>Flim7</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Flim7</em>' attribute is set.
     * @see #unsetFlim7()
     * @see #getFlim7()
     * @see #setFlim7(Double)
     * @generated
     */
    boolean isSetFlim7();

    /**
     * Returns the value of the '<em><b>Tpelec</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Electrical power transducer time constant (<i>Tpelec</i>) (&gt;= 0).  Typical value = 2,5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tpelec</em>' attribute.
     * @see #isSetTpelec()
     * @see #unsetTpelec()
     * @see #setTpelec(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT2_Tpelec()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT2.tpelec' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTpelec();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getTpelec <em>Tpelec</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getTpelec <em>Tpelec</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTpelec()
     * @see #getTpelec()
     * @see #setTpelec(Double)
     * @generated
     */
    void unsetTpelec();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getTpelec <em>Tpelec</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Flim10</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Frequency threshold 10 (<i>Flim10</i>).  Unit = Hz.  Typical value = 0.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Flim10</em>' attribute.
     * @see #isSetFlim10()
     * @see #unsetFlim10()
     * @see #setFlim10(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT2_Flim10()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Frequency" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT2.flim10' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getFlim10();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getFlim10 <em>Flim10</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Flim10</em>' attribute.
     * @see #isSetFlim10()
     * @see #unsetFlim10()
     * @see #getFlim10()
     * @generated
     */
    void setFlim10( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getFlim10 <em>Flim10</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFlim10()
     * @see #getFlim10()
     * @see #setFlim10(Double)
     * @generated
     */
    void unsetFlim10();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT2#getFlim10 <em>Flim10</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Flim10</em>' attribute is set.
     * @see #unsetFlim10()
     * @see #getFlim10()
     * @see #setFlim10(Double)
     * @generated
     */
    boolean isSetFlim10();

} // GovCT2

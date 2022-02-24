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
 * A representation of the model object '<em><b>Gov CT1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * General model for any prime mover with a PID governor, used primarily for combustion turbine and combined cycle units.
 * This model can be used to represent a variety of prime movers controlled by PID governors.  It is suitable, for example, for the representation of:
 * <ul>
 * 	<li>gas turbine and single shaft combined cycle turbines</li>
 * </ul>
 * <ul>
 * 	<li>diesel engines with modern electronic or digital governors  </li>
 * </ul>
 * <ul>
 * 	<li>steam turbines where steam is supplied from a large boiler drum or a large header whose pressure is substantially constant over the period under study</li>
 * 	<li>simple hydro turbines in dam configurations where the water column length is short and water inertia effects are minimal.</li>
 * </ul>
 * Additional information on this model is available in the 2012 IEEE report, <i><u>Dynamic Models for Turbine-Governors in Power System Studies</u></i>, 3.1.2.3 pages 3-4 (GGOV1).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getVmin <em>Vmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getKdgov <em>Kdgov</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getTpelec <em>Tpelec</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getMwbase <em>Mwbase</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getRdown <em>Rdown</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getTb <em>Tb</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getTc <em>Tc</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getTa <em>Ta</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getRselect <em>Rselect</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getRup <em>Rup</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getLdref <em>Ldref</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getKturb <em>Kturb</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getKiload <em>Kiload</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getTeng <em>Teng</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getWfnl <em>Wfnl</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getR <em>R</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getKpgov <em>Kpgov</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getMinerr <em>Minerr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getVmax <em>Vmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getTfload <em>Tfload</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getTdgov <em>Tdgov</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getKimw <em>Kimw</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getKpload <em>Kpload</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getWfspd <em>Wfspd</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getAset <em>Aset</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getTact <em>Tact</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getRopen <em>Ropen</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getRclose <em>Rclose</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getDb <em>Db</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getDm <em>Dm</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getKigov <em>Kigov</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getKa <em>Ka</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getMaxerr <em>Maxerr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getTsb <em>Tsb</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getTsa <em>Tsa</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT1()
 * @model
 * @generated
 */
public interface GovCT1 extends TurbineGovernorDynamics {
    /**
     * Returns the value of the '<em><b>Vmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum valve position limit (<i>Vmin</i>) (&lt; GovCT1.vmax).  Typical value = 0,15.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vmin</em>' attribute.
     * @see #isSetVmin()
     * @see #unsetVmin()
     * @see #setVmin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT1_Vmin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT1.vmin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getVmin <em>Vmin</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getVmin <em>Vmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVmin()
     * @see #getVmin()
     * @see #setVmin(Double)
     * @generated
     */
    void unsetVmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getVmin <em>Vmin</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT1_Kdgov()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT1.kdgov' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKdgov();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getKdgov <em>Kdgov</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getKdgov <em>Kdgov</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKdgov()
     * @see #getKdgov()
     * @see #setKdgov(Double)
     * @generated
     */
    void unsetKdgov();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getKdgov <em>Kdgov</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Tpelec</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Electrical power transducer time constant (<i>Tpelec</i>) (&gt; 0).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tpelec</em>' attribute.
     * @see #isSetTpelec()
     * @see #unsetTpelec()
     * @see #setTpelec(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT1_Tpelec()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT1.tpelec' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTpelec();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getTpelec <em>Tpelec</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getTpelec <em>Tpelec</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTpelec()
     * @see #getTpelec()
     * @see #setTpelec(Double)
     * @generated
     */
    void unsetTpelec();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getTpelec <em>Tpelec</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT1_Mwbase()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ActivePower" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT1.mwbase' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getMwbase();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getMwbase <em>Mwbase</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getMwbase <em>Mwbase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMwbase()
     * @see #getMwbase()
     * @see #setMwbase(Double)
     * @generated
     */
    void unsetMwbase();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getMwbase <em>Mwbase</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT1_Rdown()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT1.rdown' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getRdown();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getRdown <em>Rdown</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getRdown <em>Rdown</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRdown()
     * @see #getRdown()
     * @see #setRdown(Double)
     * @generated
     */
    void unsetRdown();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getRdown <em>Rdown</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Tb</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Turbine lag time constant (<i>Tb</i>) (&gt; 0).  Typical value = 0,5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tb</em>' attribute.
     * @see #isSetTb()
     * @see #unsetTb()
     * @see #setTb(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT1_Tb()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT1.tb' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTb();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getTb <em>Tb</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getTb <em>Tb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTb()
     * @see #getTb()
     * @see #setTb(Double)
     * @generated
     */
    void unsetTb();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getTb <em>Tb</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT1_Tc()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT1.tc' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTc();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getTc <em>Tc</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getTc <em>Tc</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTc()
     * @see #getTc()
     * @see #setTc(Double)
     * @generated
     */
    void unsetTc();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getTc <em>Tc</em>}' attribute is set.
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
     * Acceleration limiter time constant (<i>Ta</i>) (&gt; 0).  Typical value = 0,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ta</em>' attribute.
     * @see #isSetTa()
     * @see #unsetTa()
     * @see #setTa(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT1_Ta()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT1.ta' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTa();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getTa <em>Ta</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getTa <em>Ta</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTa()
     * @see #getTa()
     * @see #setTa(Double)
     * @generated
     */
    void unsetTa();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getTa <em>Ta</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT1_Rselect()
     * @model unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT1.rselect' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    DroopSignalFeedbackKind getRselect();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getRselect <em>Rselect</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getRselect <em>Rselect</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRselect()
     * @see #getRselect()
     * @see #setRselect(DroopSignalFeedbackKind)
     * @generated
     */
    void unsetRselect();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getRselect <em>Rselect</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT1_Rup()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT1.rup' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getRup();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getRup <em>Rup</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getRup <em>Rup</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRup()
     * @see #getRup()
     * @see #setRup(Double)
     * @generated
     */
    void unsetRup();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getRup <em>Rup</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT1_Ldref()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT1.ldref' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getLdref();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getLdref <em>Ldref</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getLdref <em>Ldref</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLdref()
     * @see #getLdref()
     * @see #setLdref(Double)
     * @generated
     */
    void unsetLdref();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getLdref <em>Ldref</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Kturb</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Turbine gain (<i>Kturb</i>) (&gt; 0).  Typical value = 1,5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kturb</em>' attribute.
     * @see #isSetKturb()
     * @see #unsetKturb()
     * @see #setKturb(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT1_Kturb()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT1.kturb' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKturb();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getKturb <em>Kturb</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getKturb <em>Kturb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKturb()
     * @see #getKturb()
     * @see #setKturb(Double)
     * @generated
     */
    void unsetKturb();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getKturb <em>Kturb</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Kiload</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Load limiter integral gain for PI controller (<i>Kiload</i>).  Typical value = 0,67.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kiload</em>' attribute.
     * @see #isSetKiload()
     * @see #unsetKiload()
     * @see #setKiload(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT1_Kiload()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT1.kiload' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKiload();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getKiload <em>Kiload</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getKiload <em>Kiload</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKiload()
     * @see #getKiload()
     * @see #setKiload(Double)
     * @generated
     */
    void unsetKiload();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getKiload <em>Kiload</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT1_Teng()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT1.teng' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTeng();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getTeng <em>Teng</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getTeng <em>Teng</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTeng()
     * @see #getTeng()
     * @see #setTeng(Double)
     * @generated
     */
    void unsetTeng();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getTeng <em>Teng</em>}' attribute is set.
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
     * No load fuel flow (<i>Wfnl</i>).  Typical value = 0,2.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wfnl</em>' attribute.
     * @see #isSetWfnl()
     * @see #unsetWfnl()
     * @see #setWfnl(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT1_Wfnl()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT1.wfnl' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getWfnl();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getWfnl <em>Wfnl</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getWfnl <em>Wfnl</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWfnl()
     * @see #getWfnl()
     * @see #setWfnl(Double)
     * @generated
     */
    void unsetWfnl();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getWfnl <em>Wfnl</em>}' attribute is set.
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
     * Returns the value of the '<em><b>R</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Permanent droop (<i>R</i>).  Typical value = 0,04.
     * <!-- end-model-doc -->
     * @return the value of the '<em>R</em>' attribute.
     * @see #isSetR()
     * @see #unsetR()
     * @see #setR(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT1_R()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT1.r' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getR();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getR <em>R</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getR <em>R</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetR()
     * @see #getR()
     * @see #setR(Double)
     * @generated
     */
    void unsetR();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getR <em>R</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Kpgov</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Governor proportional gain (<i>Kpgov</i>).  Typical value = 10.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kpgov</em>' attribute.
     * @see #isSetKpgov()
     * @see #unsetKpgov()
     * @see #setKpgov(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT1_Kpgov()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT1.kpgov' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKpgov();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getKpgov <em>Kpgov</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getKpgov <em>Kpgov</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKpgov()
     * @see #getKpgov()
     * @see #setKpgov(Double)
     * @generated
     */
    void unsetKpgov();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getKpgov <em>Kpgov</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Minerr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum value for speed error signal (<i>minerr</i>) (&lt; GovCT1.maxerr).  Typical value = -0,05.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Minerr</em>' attribute.
     * @see #isSetMinerr()
     * @see #unsetMinerr()
     * @see #setMinerr(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT1_Minerr()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT1.minerr' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getMinerr();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getMinerr <em>Minerr</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getMinerr <em>Minerr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMinerr()
     * @see #getMinerr()
     * @see #setMinerr(Double)
     * @generated
     */
    void unsetMinerr();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getMinerr <em>Minerr</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Vmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum valve position limit (<i>Vmax</i>) (&gt; GovCT1.vmin).  Typical value = 1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Vmax</em>' attribute.
     * @see #isSetVmax()
     * @see #unsetVmax()
     * @see #setVmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT1_Vmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT1.vmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getVmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getVmax <em>Vmax</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getVmax <em>Vmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVmax()
     * @see #getVmax()
     * @see #setVmax(Double)
     * @generated
     */
    void unsetVmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getVmax <em>Vmax</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Tfload</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Load-limiter time constant (<i>Tfload</i>) (&gt; 0).  Typical value = 3.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tfload</em>' attribute.
     * @see #isSetTfload()
     * @see #unsetTfload()
     * @see #setTfload(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT1_Tfload()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT1.tfload' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTfload();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getTfload <em>Tfload</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getTfload <em>Tfload</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTfload()
     * @see #getTfload()
     * @see #setTfload(Double)
     * @generated
     */
    void unsetTfload();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getTfload <em>Tfload</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT1_Tdgov()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT1.tdgov' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTdgov();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getTdgov <em>Tdgov</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getTdgov <em>Tdgov</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTdgov()
     * @see #getTdgov()
     * @see #setTdgov(Double)
     * @generated
     */
    void unsetTdgov();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getTdgov <em>Tdgov</em>}' attribute is set.
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
     * Power controller (reset) gain (<i>Kimw</i>).  The default value of 0,01 corresponds to a reset time of 100 s.  A value of 0,001 corresponds to a relatively slow-acting load controller.  Typical value = 0,01.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kimw</em>' attribute.
     * @see #isSetKimw()
     * @see #unsetKimw()
     * @see #setKimw(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT1_Kimw()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT1.kimw' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKimw();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getKimw <em>Kimw</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getKimw <em>Kimw</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKimw()
     * @see #getKimw()
     * @see #setKimw(Double)
     * @generated
     */
    void unsetKimw();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getKimw <em>Kimw</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Kpload</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Load limiter proportional gain for PI controller (<i>Kpload</i>).  Typical value = 2.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kpload</em>' attribute.
     * @see #isSetKpload()
     * @see #unsetKpload()
     * @see #setKpload(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT1_Kpload()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT1.kpload' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKpload();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getKpload <em>Kpload</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getKpload <em>Kpload</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKpload()
     * @see #getKpload()
     * @see #setKpload(Double)
     * @generated
     */
    void unsetKpload();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getKpload <em>Kpload</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Wfspd</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Switch for fuel source characteristic to recognize that fuel flow, for a given fuel valve stroke, can be proportional to engine speed (<i>Wfspd</i>).
     * true = fuel flow proportional to speed (for some gas turbines and diesel engines with positive displacement fuel injectors)
     * false = fuel control system keeps fuel flow independent of engine speed.
     * Typical value = true.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wfspd</em>' attribute.
     * @see #isSetWfspd()
     * @see #unsetWfspd()
     * @see #setWfspd(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT1_Wfspd()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT1.wfspd' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getWfspd();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getWfspd <em>Wfspd</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getWfspd <em>Wfspd</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWfspd()
     * @see #getWfspd()
     * @see #setWfspd(Boolean)
     * @generated
     */
    void unsetWfspd();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getWfspd <em>Wfspd</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Aset</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Acceleration limiter setpoint (<i>Aset</i>).  Unit = PU / s.  Typical value = 0,01.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Aset</em>' attribute.
     * @see #isSetAset()
     * @see #unsetAset()
     * @see #setAset(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT1_Aset()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT1.aset' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getAset();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getAset <em>Aset</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getAset <em>Aset</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAset()
     * @see #getAset()
     * @see #setAset(Double)
     * @generated
     */
    void unsetAset();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getAset <em>Aset</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Tact</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Actuator time constant (<i>Tact</i>) (&gt;= 0).  Typical value = 0,5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tact</em>' attribute.
     * @see #isSetTact()
     * @see #unsetTact()
     * @see #setTact(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT1_Tact()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT1.tact' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTact();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getTact <em>Tact</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getTact <em>Tact</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTact()
     * @see #getTact()
     * @see #setTact(Double)
     * @generated
     */
    void unsetTact();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getTact <em>Tact</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Ropen</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum valve opening rate (<i>Ropen</i>).  Unit = PU / s.  Typical value = 0.10.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ropen</em>' attribute.
     * @see #isSetRopen()
     * @see #unsetRopen()
     * @see #setRopen(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT1_Ropen()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT1.ropen' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getRopen();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getRopen <em>Ropen</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getRopen <em>Ropen</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRopen()
     * @see #getRopen()
     * @see #setRopen(Double)
     * @generated
     */
    void unsetRopen();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getRopen <em>Ropen</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Rclose</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum valve closing rate (<i>Rclose</i>).  Unit = PU / s.  Typical value = -0,1.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Rclose</em>' attribute.
     * @see #isSetRclose()
     * @see #unsetRclose()
     * @see #setRclose(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT1_Rclose()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT1.rclose' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getRclose();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getRclose <em>Rclose</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getRclose <em>Rclose</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRclose()
     * @see #getRclose()
     * @see #setRclose(Double)
     * @generated
     */
    void unsetRclose();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getRclose <em>Rclose</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT1_Db()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT1.db' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getDb();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getDb <em>Db</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getDb <em>Db</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDb()
     * @see #getDb()
     * @see #setDb(Double)
     * @generated
     */
    void unsetDb();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getDb <em>Db</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT1_Dm()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT1.dm' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getDm();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getDm <em>Dm</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getDm <em>Dm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDm()
     * @see #getDm()
     * @see #setDm(Double)
     * @generated
     */
    void unsetDm();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getDm <em>Dm</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Kigov</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Governor integral gain (<i>Kigov</i>).  Typical value = 2.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kigov</em>' attribute.
     * @see #isSetKigov()
     * @see #unsetKigov()
     * @see #setKigov(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT1_Kigov()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT1.kigov' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKigov();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getKigov <em>Kigov</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getKigov <em>Kigov</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKigov()
     * @see #getKigov()
     * @see #setKigov(Double)
     * @generated
     */
    void unsetKigov();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getKigov <em>Kigov</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT1_Ka()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT1.ka' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKa();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getKa <em>Ka</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getKa <em>Ka</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKa()
     * @see #getKa()
     * @see #setKa(Double)
     * @generated
     */
    void unsetKa();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getKa <em>Ka</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Maxerr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum value for speed error signal (<i>maxerr</i>) (&gt; GovCT1.minerr).  Typical value = 0,05.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Maxerr</em>' attribute.
     * @see #isSetMaxerr()
     * @see #unsetMaxerr()
     * @see #setMaxerr(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT1_Maxerr()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT1.maxerr' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getMaxerr();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getMaxerr <em>Maxerr</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getMaxerr <em>Maxerr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaxerr()
     * @see #getMaxerr()
     * @see #setMaxerr(Double)
     * @generated
     */
    void unsetMaxerr();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getMaxerr <em>Maxerr</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Tsb</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Temperature detection lag time constant (<i>Tsb</i>) (&gt;= 0).  Typical value = 5.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tsb</em>' attribute.
     * @see #isSetTsb()
     * @see #unsetTsb()
     * @see #setTsb(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT1_Tsb()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT1.tsb' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTsb();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getTsb <em>Tsb</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getTsb <em>Tsb</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTsb()
     * @see #getTsb()
     * @see #setTsb(Double)
     * @generated
     */
    void unsetTsb();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getTsb <em>Tsb</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Tsa</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Temperature detection lead time constant (<i>Tsa</i>) (&gt;= 0).  Typical value = 4.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tsa</em>' attribute.
     * @see #isSetTsa()
     * @see #unsetTsa()
     * @see #setTsa(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getGovCT1_Tsa()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='GovCT1.tsa' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTsa();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getTsa <em>Tsa</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getTsa <em>Tsa</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTsa()
     * @see #getTsa()
     * @see #setTsa(Double)
     * @generated
     */
    void unsetTsa();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GovCT1#getTsa <em>Tsa</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tsa</em>' attribute is set.
     * @see #unsetTsa()
     * @see #getTsa()
     * @see #setTsa(Double)
     * @generated
     */
    boolean isSetTsa();

} // GovCT1

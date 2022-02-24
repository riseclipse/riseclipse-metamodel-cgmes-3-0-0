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
 * A representation of the model object '<em><b>Energy Consumer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Generic user of energy - a  point of consumption on the power system model.
 * EnergyConsumer.pfixed, .qfixed, .pfixedPct and .qfixedPct have meaning only if there is no LoadResponseCharacteristic associated with EnergyConsumer or if LoadResponseCharacteristic.exponentModel is set to False.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergyConsumer#getLoadResponse <em>Load Response</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergyConsumer#getQfixedPct <em>Qfixed Pct</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergyConsumer#getQfixed <em>Qfixed</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergyConsumer#getPfixedPct <em>Pfixed Pct</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergyConsumer#getPfixed <em>Pfixed</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergyConsumer#getLoadDynamics <em>Load Dynamics</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergyConsumer#getQ <em>Q</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergyConsumer#getP <em>P</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEnergyConsumer()
 * @model
 * @generated
 */
public interface EnergyConsumer extends EnergyConnection {
    /**
     * Returns the value of the '<em><b>Qfixed Pct</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Fixed reactive power as a percentage of load group fixed reactive power. Used to represent the time-varying components.  Load sign convention is used, i.e. positive sign means flow out from a node.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Qfixed Pct</em>' attribute.
     * @see #isSetQfixedPct()
     * @see #unsetQfixedPct()
     * @see #setQfixedPct(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEnergyConsumer_QfixedPct()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PerCent" transient="true" ordered="false"
     *        extendedMetaData="name='EnergyConsumer.qfixedPct' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getQfixedPct();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergyConsumer#getQfixedPct <em>Qfixed Pct</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Qfixed Pct</em>' attribute.
     * @see #isSetQfixedPct()
     * @see #unsetQfixedPct()
     * @see #getQfixedPct()
     * @generated
     */
    void setQfixedPct( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergyConsumer#getQfixedPct <em>Qfixed Pct</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQfixedPct()
     * @see #getQfixedPct()
     * @see #setQfixedPct(Double)
     * @generated
     */
    void unsetQfixedPct();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergyConsumer#getQfixedPct <em>Qfixed Pct</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Qfixed Pct</em>' attribute is set.
     * @see #unsetQfixedPct()
     * @see #getQfixedPct()
     * @see #setQfixedPct(Double)
     * @generated
     */
    boolean isSetQfixedPct();

    /**
     * Returns the value of the '<em><b>Qfixed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reactive power of the load that is a fixed quantity and does not vary as load group value varies. Load sign convention is used, i.e. positive sign means flow out from a node.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Qfixed</em>' attribute.
     * @see #isSetQfixed()
     * @see #unsetQfixed()
     * @see #setQfixed(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEnergyConsumer_Qfixed()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ReactivePower" transient="true" ordered="false"
     *        extendedMetaData="name='EnergyConsumer.qfixed' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getQfixed();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergyConsumer#getQfixed <em>Qfixed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Qfixed</em>' attribute.
     * @see #isSetQfixed()
     * @see #unsetQfixed()
     * @see #getQfixed()
     * @generated
     */
    void setQfixed( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergyConsumer#getQfixed <em>Qfixed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQfixed()
     * @see #getQfixed()
     * @see #setQfixed(Double)
     * @generated
     */
    void unsetQfixed();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergyConsumer#getQfixed <em>Qfixed</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Qfixed</em>' attribute is set.
     * @see #unsetQfixed()
     * @see #getQfixed()
     * @see #setQfixed(Double)
     * @generated
     */
    boolean isSetQfixed();

    /**
     * Returns the value of the '<em><b>Pfixed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Active power of the load that is a fixed quantity and does not vary as load group value varies. Load sign convention is used, i.e. positive sign means flow out from a node.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pfixed</em>' attribute.
     * @see #isSetPfixed()
     * @see #unsetPfixed()
     * @see #setPfixed(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEnergyConsumer_Pfixed()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ActivePower" transient="true" ordered="false"
     *        extendedMetaData="name='EnergyConsumer.pfixed' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPfixed();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergyConsumer#getPfixed <em>Pfixed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pfixed</em>' attribute.
     * @see #isSetPfixed()
     * @see #unsetPfixed()
     * @see #getPfixed()
     * @generated
     */
    void setPfixed( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergyConsumer#getPfixed <em>Pfixed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPfixed()
     * @see #getPfixed()
     * @see #setPfixed(Double)
     * @generated
     */
    void unsetPfixed();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergyConsumer#getPfixed <em>Pfixed</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pfixed</em>' attribute is set.
     * @see #unsetPfixed()
     * @see #getPfixed()
     * @see #setPfixed(Double)
     * @generated
     */
    boolean isSetPfixed();

    /**
     * Returns the value of the '<em><b>Load Dynamics</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadDynamics#getEnergyConsumer <em>Energy Consumer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Load dynamics model used to describe dynamic behaviour of this energy consumer.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Load Dynamics</em>' reference.
     * @see #isSetLoadDynamics()
     * @see #unsetLoadDynamics()
     * @see #setLoadDynamics(LoadDynamics)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEnergyConsumer_LoadDynamics()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadDynamics#getEnergyConsumer
     * @model opposite="EnergyConsumer" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='EnergyConsumer.LoadDynamics' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    LoadDynamics getLoadDynamics();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergyConsumer#getLoadDynamics <em>Load Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Load Dynamics</em>' reference.
     * @see #isSetLoadDynamics()
     * @see #unsetLoadDynamics()
     * @see #getLoadDynamics()
     * @generated
     */
    void setLoadDynamics( LoadDynamics value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergyConsumer#getLoadDynamics <em>Load Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLoadDynamics()
     * @see #getLoadDynamics()
     * @see #setLoadDynamics(LoadDynamics)
     * @generated
     */
    void unsetLoadDynamics();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergyConsumer#getLoadDynamics <em>Load Dynamics</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Load Dynamics</em>' reference is set.
     * @see #unsetLoadDynamics()
     * @see #getLoadDynamics()
     * @see #setLoadDynamics(LoadDynamics)
     * @generated
     */
    boolean isSetLoadDynamics();

    /**
     * Returns the value of the '<em><b>Q</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reactive power of the load. Load sign convention is used, i.e. positive sign means flow out from a node.
     * For voltage dependent loads the value is at rated voltage.
     * Starting value for a steady state solution.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Q</em>' attribute.
     * @see #isSetQ()
     * @see #unsetQ()
     * @see #setQ(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEnergyConsumer_Q()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ReactivePower" transient="true" ordered="false"
     *        extendedMetaData="name='EnergyConsumer.q' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getQ();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergyConsumer#getQ <em>Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Q</em>' attribute.
     * @see #isSetQ()
     * @see #unsetQ()
     * @see #getQ()
     * @generated
     */
    void setQ( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergyConsumer#getQ <em>Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQ()
     * @see #getQ()
     * @see #setQ(Double)
     * @generated
     */
    void unsetQ();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergyConsumer#getQ <em>Q</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Q</em>' attribute is set.
     * @see #unsetQ()
     * @see #getQ()
     * @see #setQ(Double)
     * @generated
     */
    boolean isSetQ();

    /**
     * Returns the value of the '<em><b>P</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Active power of the load. Load sign convention is used, i.e. positive sign means flow out from a node.
     * For voltage dependent loads the value is at rated voltage.
     * Starting value for a steady state solution.
     * <!-- end-model-doc -->
     * @return the value of the '<em>P</em>' attribute.
     * @see #isSetP()
     * @see #unsetP()
     * @see #setP(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEnergyConsumer_P()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ActivePower" transient="true" ordered="false"
     *        extendedMetaData="name='EnergyConsumer.p' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getP();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergyConsumer#getP <em>P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>P</em>' attribute.
     * @see #isSetP()
     * @see #unsetP()
     * @see #getP()
     * @generated
     */
    void setP( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergyConsumer#getP <em>P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetP()
     * @see #getP()
     * @see #setP(Double)
     * @generated
     */
    void unsetP();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergyConsumer#getP <em>P</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>P</em>' attribute is set.
     * @see #unsetP()
     * @see #getP()
     * @see #setP(Double)
     * @generated
     */
    boolean isSetP();

    /**
     * Returns the value of the '<em><b>Load Response</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadResponseCharacteristic#getEnergyConsumer <em>Energy Consumer</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The load response characteristic of this load.  If missing, this load is assumed to be constant power.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Load Response</em>' reference.
     * @see #isSetLoadResponse()
     * @see #unsetLoadResponse()
     * @see #setLoadResponse(LoadResponseCharacteristic)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEnergyConsumer_LoadResponse()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.LoadResponseCharacteristic#getEnergyConsumer
     * @model opposite="EnergyConsumer" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='EnergyConsumer.LoadResponse' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    LoadResponseCharacteristic getLoadResponse();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergyConsumer#getLoadResponse <em>Load Response</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Load Response</em>' reference.
     * @see #isSetLoadResponse()
     * @see #unsetLoadResponse()
     * @see #getLoadResponse()
     * @generated
     */
    void setLoadResponse( LoadResponseCharacteristic value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergyConsumer#getLoadResponse <em>Load Response</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLoadResponse()
     * @see #getLoadResponse()
     * @see #setLoadResponse(LoadResponseCharacteristic)
     * @generated
     */
    void unsetLoadResponse();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergyConsumer#getLoadResponse <em>Load Response</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Load Response</em>' reference is set.
     * @see #unsetLoadResponse()
     * @see #getLoadResponse()
     * @see #setLoadResponse(LoadResponseCharacteristic)
     * @generated
     */
    boolean isSetLoadResponse();

    /**
     * Returns the value of the '<em><b>Pfixed Pct</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Fixed active power as a percentage of load group fixed active power. Used to represent the time-varying components.  Load sign convention is used, i.e. positive sign means flow out from a node.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pfixed Pct</em>' attribute.
     * @see #isSetPfixedPct()
     * @see #unsetPfixedPct()
     * @see #setPfixedPct(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getEnergyConsumer_PfixedPct()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PerCent" transient="true" ordered="false"
     *        extendedMetaData="name='EnergyConsumer.pfixedPct' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPfixedPct();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergyConsumer#getPfixedPct <em>Pfixed Pct</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pfixed Pct</em>' attribute.
     * @see #isSetPfixedPct()
     * @see #unsetPfixedPct()
     * @see #getPfixedPct()
     * @generated
     */
    void setPfixedPct( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergyConsumer#getPfixedPct <em>Pfixed Pct</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPfixedPct()
     * @see #getPfixedPct()
     * @see #setPfixedPct(Double)
     * @generated
     */
    void unsetPfixedPct();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergyConsumer#getPfixedPct <em>Pfixed Pct</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Pfixed Pct</em>' attribute is set.
     * @see #unsetPfixedPct()
     * @see #getPfixedPct()
     * @see #setPfixedPct(Double)
     * @generated
     */
    boolean isSetPfixedPct();

} // EnergyConsumer

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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Voltage Level</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A collection of equipment at one common system voltage forming a switchgear. The equipment typically consists of breakers, busbars, instrumentation, control, regulation and protection devices as well as assemblies of all these.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VoltageLevel#getSubstation <em>Substation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VoltageLevel#getLowVoltageLimit <em>Low Voltage Limit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VoltageLevel#getBaseVoltage <em>Base Voltage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VoltageLevel#getHighVoltageLimit <em>High Voltage Limit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VoltageLevel#getBays <em>Bays</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getVoltageLevel()
 * @model
 * @generated
 */
public interface VoltageLevel extends EquipmentContainer {
    /**
     * Returns the value of the '<em><b>Bays</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Bay}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Bay#getVoltageLevel <em>Voltage Level</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The bays within this voltage level.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Bays</em>' reference list.
     * @see #isSetBays()
     * @see #unsetBays()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getVoltageLevel_Bays()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Bay#getVoltageLevel
     * @model opposite="VoltageLevel" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='VoltageLevel.Bays' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< Bay > getBays();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VoltageLevel#getBays <em>Bays</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBays()
     * @see #getBays()
     * @generated
     */
    void unsetBays();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VoltageLevel#getBays <em>Bays</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Bays</em>' reference list is set.
     * @see #unsetBays()
     * @see #getBays()
     * @generated
     */
    boolean isSetBays();

    /**
     * Returns the value of the '<em><b>Base Voltage</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BaseVoltage#getVoltageLevel <em>Voltage Level</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The base voltage used for all equipment within the voltage level.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Base Voltage</em>' reference.
     * @see #isSetBaseVoltage()
     * @see #unsetBaseVoltage()
     * @see #setBaseVoltage(BaseVoltage)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getVoltageLevel_BaseVoltage()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BaseVoltage#getVoltageLevel
     * @model opposite="VoltageLevel" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='VoltageLevel.BaseVoltage' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    BaseVoltage getBaseVoltage();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VoltageLevel#getBaseVoltage <em>Base Voltage</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Base Voltage</em>' reference.
     * @see #isSetBaseVoltage()
     * @see #unsetBaseVoltage()
     * @see #getBaseVoltage()
     * @generated
     */
    void setBaseVoltage( BaseVoltage value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VoltageLevel#getBaseVoltage <em>Base Voltage</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBaseVoltage()
     * @see #getBaseVoltage()
     * @see #setBaseVoltage(BaseVoltage)
     * @generated
     */
    void unsetBaseVoltage();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VoltageLevel#getBaseVoltage <em>Base Voltage</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Base Voltage</em>' reference is set.
     * @see #unsetBaseVoltage()
     * @see #getBaseVoltage()
     * @see #setBaseVoltage(BaseVoltage)
     * @generated
     */
    boolean isSetBaseVoltage();

    /**
     * Returns the value of the '<em><b>Substation</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Substation#getVoltageLevels <em>Voltage Levels</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The substation of the voltage level.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Substation</em>' reference.
     * @see #isSetSubstation()
     * @see #unsetSubstation()
     * @see #setSubstation(Substation)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getVoltageLevel_Substation()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Substation#getVoltageLevels
     * @model opposite="VoltageLevels" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='VoltageLevel.Substation' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Substation getSubstation();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VoltageLevel#getSubstation <em>Substation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Substation</em>' reference.
     * @see #isSetSubstation()
     * @see #unsetSubstation()
     * @see #getSubstation()
     * @generated
     */
    void setSubstation( Substation value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VoltageLevel#getSubstation <em>Substation</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSubstation()
     * @see #getSubstation()
     * @see #setSubstation(Substation)
     * @generated
     */
    void unsetSubstation();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VoltageLevel#getSubstation <em>Substation</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Substation</em>' reference is set.
     * @see #unsetSubstation()
     * @see #getSubstation()
     * @see #setSubstation(Substation)
     * @generated
     */
    boolean isSetSubstation();

    /**
     * Returns the value of the '<em><b>Low Voltage Limit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The bus bar's low voltage limit.
     * The limit applies to all equipment and nodes contained in a given VoltageLevel. It is not required that it is exchanged in pair with highVoltageLimit. It is preferable to use operational VoltageLimit, which prevails, if present.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Low Voltage Limit</em>' attribute.
     * @see #isSetLowVoltageLimit()
     * @see #unsetLowVoltageLimit()
     * @see #setLowVoltageLimit(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getVoltageLevel_LowVoltageLimit()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Voltage" transient="true" ordered="false"
     *        extendedMetaData="name='VoltageLevel.lowVoltageLimit' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getLowVoltageLimit();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VoltageLevel#getLowVoltageLimit <em>Low Voltage Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Low Voltage Limit</em>' attribute.
     * @see #isSetLowVoltageLimit()
     * @see #unsetLowVoltageLimit()
     * @see #getLowVoltageLimit()
     * @generated
     */
    void setLowVoltageLimit( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VoltageLevel#getLowVoltageLimit <em>Low Voltage Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLowVoltageLimit()
     * @see #getLowVoltageLimit()
     * @see #setLowVoltageLimit(Double)
     * @generated
     */
    void unsetLowVoltageLimit();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VoltageLevel#getLowVoltageLimit <em>Low Voltage Limit</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Low Voltage Limit</em>' attribute is set.
     * @see #unsetLowVoltageLimit()
     * @see #getLowVoltageLimit()
     * @see #setLowVoltageLimit(Double)
     * @generated
     */
    boolean isSetLowVoltageLimit();

    /**
     * Returns the value of the '<em><b>High Voltage Limit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The bus bar's high voltage limit.
     * The limit applies to all equipment and nodes contained in a given VoltageLevel. It is not required that it is exchanged in pair with lowVoltageLimit. It is preferable to use operational VoltageLimit, which prevails, if present.
     * <!-- end-model-doc -->
     * @return the value of the '<em>High Voltage Limit</em>' attribute.
     * @see #isSetHighVoltageLimit()
     * @see #unsetHighVoltageLimit()
     * @see #setHighVoltageLimit(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getVoltageLevel_HighVoltageLimit()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Voltage" transient="true" ordered="false"
     *        extendedMetaData="name='VoltageLevel.highVoltageLimit' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getHighVoltageLimit();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VoltageLevel#getHighVoltageLimit <em>High Voltage Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>High Voltage Limit</em>' attribute.
     * @see #isSetHighVoltageLimit()
     * @see #unsetHighVoltageLimit()
     * @see #getHighVoltageLimit()
     * @generated
     */
    void setHighVoltageLimit( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VoltageLevel#getHighVoltageLimit <em>High Voltage Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetHighVoltageLimit()
     * @see #getHighVoltageLimit()
     * @see #setHighVoltageLimit(Double)
     * @generated
     */
    void unsetHighVoltageLimit();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VoltageLevel#getHighVoltageLimit <em>High Voltage Limit</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>High Voltage Limit</em>' attribute is set.
     * @see #unsetHighVoltageLimit()
     * @see #getHighVoltageLimit()
     * @see #setHighVoltageLimit(Double)
     * @generated
     */
    boolean isSetHighVoltageLimit();

} // VoltageLevel

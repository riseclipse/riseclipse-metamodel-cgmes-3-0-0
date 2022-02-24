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
 * A representation of the model object '<em><b>Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A generic device designed to close, or open, or both, one or more electric circuits.  All switches are two terminal devices including grounding switches. The ACDCTerminal.connected at the two sides of the switch shall not be considered for assessing switch connectivity, i.e. only Switch.open, .normalOpen and .locked are relevant.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Switch#getNormalOpen <em>Normal Open</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Switch#getSwitchSchedules <em>Switch Schedules</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Switch#getRetained <em>Retained</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Switch#getRatedCurrent <em>Rated Current</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Switch#getOpen <em>Open</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Switch#getLocked <em>Locked</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Switch#getSvSwitch <em>Sv Switch</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSwitch()
 * @model
 * @generated
 */
public interface Switch extends ConductingEquipment {
    /**
     * Returns the value of the '<em><b>Rated Current</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The maximum continuous current carrying capacity in amps governed by the device material and construction.
     * The attribute shall be a positive value.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Rated Current</em>' attribute.
     * @see #isSetRatedCurrent()
     * @see #unsetRatedCurrent()
     * @see #setRatedCurrent(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSwitch_RatedCurrent()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CurrentFlow" transient="true" ordered="false"
     *        extendedMetaData="name='Switch.ratedCurrent' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getRatedCurrent();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Switch#getRatedCurrent <em>Rated Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rated Current</em>' attribute.
     * @see #isSetRatedCurrent()
     * @see #unsetRatedCurrent()
     * @see #getRatedCurrent()
     * @generated
     */
    void setRatedCurrent( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Switch#getRatedCurrent <em>Rated Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRatedCurrent()
     * @see #getRatedCurrent()
     * @see #setRatedCurrent(Double)
     * @generated
     */
    void unsetRatedCurrent();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Switch#getRatedCurrent <em>Rated Current</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rated Current</em>' attribute is set.
     * @see #unsetRatedCurrent()
     * @see #getRatedCurrent()
     * @see #setRatedCurrent(Double)
     * @generated
     */
    boolean isSetRatedCurrent();

    /**
     * Returns the value of the '<em><b>Open</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The attribute tells if the switch is considered open when used as input to topology processing.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Open</em>' attribute.
     * @see #isSetOpen()
     * @see #unsetOpen()
     * @see #setOpen(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSwitch_Open()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='Switch.open' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getOpen();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Switch#getOpen <em>Open</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Open</em>' attribute.
     * @see #isSetOpen()
     * @see #unsetOpen()
     * @see #getOpen()
     * @generated
     */
    void setOpen( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Switch#getOpen <em>Open</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOpen()
     * @see #getOpen()
     * @see #setOpen(Boolean)
     * @generated
     */
    void unsetOpen();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Switch#getOpen <em>Open</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Open</em>' attribute is set.
     * @see #unsetOpen()
     * @see #getOpen()
     * @see #setOpen(Boolean)
     * @generated
     */
    boolean isSetOpen();

    /**
     * Returns the value of the '<em><b>Locked</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * If true, the switch is locked. The resulting switch state is a combination of locked and Switch.open attributes as follows:
     * <ul>
     * 	<li>locked=true and Switch.open=true. The resulting state is open and locked;</li>
     * 	<li>locked=false and Switch.open=true. The resulting state is open;</li>
     * 	<li>locked=false and Switch.open=false. The resulting state is closed.</li>
     * </ul>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Locked</em>' attribute.
     * @see #isSetLocked()
     * @see #unsetLocked()
     * @see #setLocked(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSwitch_Locked()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='Switch.locked' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getLocked();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Switch#getLocked <em>Locked</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Locked</em>' attribute.
     * @see #isSetLocked()
     * @see #unsetLocked()
     * @see #getLocked()
     * @generated
     */
    void setLocked( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Switch#getLocked <em>Locked</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLocked()
     * @see #getLocked()
     * @see #setLocked(Boolean)
     * @generated
     */
    void unsetLocked();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Switch#getLocked <em>Locked</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Locked</em>' attribute is set.
     * @see #unsetLocked()
     * @see #getLocked()
     * @see #setLocked(Boolean)
     * @generated
     */
    boolean isSetLocked();

    /**
     * Returns the value of the '<em><b>Sv Switch</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvSwitch}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvSwitch#getSwitch <em>Switch</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The switch state associated with the switch.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Sv Switch</em>' reference list.
     * @see #isSetSvSwitch()
     * @see #unsetSvSwitch()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSwitch_SvSwitch()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SvSwitch#getSwitch
     * @model opposite="Switch" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='Switch.SvSwitch' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< SvSwitch > getSvSwitch();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Switch#getSvSwitch <em>Sv Switch</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSvSwitch()
     * @see #getSvSwitch()
     * @generated
     */
    void unsetSvSwitch();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Switch#getSvSwitch <em>Sv Switch</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Sv Switch</em>' reference list is set.
     * @see #unsetSvSwitch()
     * @see #getSvSwitch()
     * @generated
     */
    boolean isSetSvSwitch();

    /**
     * Returns the value of the '<em><b>Switch Schedules</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SwitchSchedule}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SwitchSchedule#getSwitch <em>Switch</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A Switch can be associated with SwitchSchedules.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Switch Schedules</em>' reference list.
     * @see #isSetSwitchSchedules()
     * @see #unsetSwitchSchedules()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSwitch_SwitchSchedules()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SwitchSchedule#getSwitch
     * @model opposite="Switch" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='Switch.SwitchSchedules' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< SwitchSchedule > getSwitchSchedules();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Switch#getSwitchSchedules <em>Switch Schedules</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSwitchSchedules()
     * @see #getSwitchSchedules()
     * @generated
     */
    void unsetSwitchSchedules();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Switch#getSwitchSchedules <em>Switch Schedules</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Switch Schedules</em>' reference list is set.
     * @see #unsetSwitchSchedules()
     * @see #getSwitchSchedules()
     * @generated
     */
    boolean isSetSwitchSchedules();

    /**
     * Returns the value of the '<em><b>Normal Open</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The attribute is used in cases when no Measurement for the status value is present. If the Switch has a status measurement the Discrete.normalValue is expected to match with the Switch.normalOpen.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Normal Open</em>' attribute.
     * @see #isSetNormalOpen()
     * @see #unsetNormalOpen()
     * @see #setNormalOpen(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSwitch_NormalOpen()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='Switch.normalOpen' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getNormalOpen();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Switch#getNormalOpen <em>Normal Open</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Normal Open</em>' attribute.
     * @see #isSetNormalOpen()
     * @see #unsetNormalOpen()
     * @see #getNormalOpen()
     * @generated
     */
    void setNormalOpen( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Switch#getNormalOpen <em>Normal Open</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNormalOpen()
     * @see #getNormalOpen()
     * @see #setNormalOpen(Boolean)
     * @generated
     */
    void unsetNormalOpen();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Switch#getNormalOpen <em>Normal Open</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Normal Open</em>' attribute is set.
     * @see #unsetNormalOpen()
     * @see #getNormalOpen()
     * @see #setNormalOpen(Boolean)
     * @generated
     */
    boolean isSetNormalOpen();

    /**
     * Returns the value of the '<em><b>Retained</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Branch is retained in the topological solution.  The flow through retained switches will normally be calculated in power flow.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Retained</em>' attribute.
     * @see #isSetRetained()
     * @see #unsetRetained()
     * @see #setRetained(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getSwitch_Retained()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='Switch.retained' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getRetained();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Switch#getRetained <em>Retained</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Retained</em>' attribute.
     * @see #isSetRetained()
     * @see #unsetRetained()
     * @see #getRetained()
     * @generated
     */
    void setRetained( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Switch#getRetained <em>Retained</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRetained()
     * @see #getRetained()
     * @see #setRetained(Boolean)
     * @generated
     */
    void unsetRetained();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Switch#getRetained <em>Retained</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Retained</em>' attribute is set.
     * @see #unsetRetained()
     * @see #getRetained()
     * @see #setRetained(Boolean)
     * @generated
     */
    boolean isSetRetained();

} // Switch

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

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Control is used for supervisory/device control. It represents control outputs that are used to change the state in a process, e.g. close or open breaker, a set point value or a raise lower command.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Control#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Control#getControlType <em>Control Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Control#getOperationInProgress <em>Operation In Progress</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Control#getUnitMultiplier <em>Unit Multiplier</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Control#getPowerSystemResource <em>Power System Resource</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Control#getUnitSymbol <em>Unit Symbol</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getControl()
 * @model
 * @generated
 */
public interface Control extends IOPoint {
    /**
     * Returns the value of the '<em><b>Time Stamp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The last time a control output was sent.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Time Stamp</em>' attribute.
     * @see #isSetTimeStamp()
     * @see #unsetTimeStamp()
     * @see #setTimeStamp(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getControl_TimeStamp()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.DateTime" transient="true" ordered="false"
     *        extendedMetaData="name='Control.timeStamp' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Date getTimeStamp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Control#getTimeStamp <em>Time Stamp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Time Stamp</em>' attribute.
     * @see #isSetTimeStamp()
     * @see #unsetTimeStamp()
     * @see #getTimeStamp()
     * @generated
     */
    void setTimeStamp( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Control#getTimeStamp <em>Time Stamp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTimeStamp()
     * @see #getTimeStamp()
     * @see #setTimeStamp(Date)
     * @generated
     */
    void unsetTimeStamp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Control#getTimeStamp <em>Time Stamp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Time Stamp</em>' attribute is set.
     * @see #unsetTimeStamp()
     * @see #getTimeStamp()
     * @see #setTimeStamp(Date)
     * @generated
     */
    boolean isSetTimeStamp();

    /**
     * Returns the value of the '<em><b>Control Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Specifies the type of Control. For example, this specifies if the Control represents BreakerOpen, BreakerClose, GeneratorVoltageSetPoint, GeneratorRaise, GeneratorLower, etc.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Control Type</em>' attribute.
     * @see #isSetControlType()
     * @see #unsetControlType()
     * @see #setControlType(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getControl_ControlType()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.String" transient="true" ordered="false"
     *        extendedMetaData="name='Control.controlType' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    String getControlType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Control#getControlType <em>Control Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Control Type</em>' attribute.
     * @see #isSetControlType()
     * @see #unsetControlType()
     * @see #getControlType()
     * @generated
     */
    void setControlType( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Control#getControlType <em>Control Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetControlType()
     * @see #getControlType()
     * @see #setControlType(String)
     * @generated
     */
    void unsetControlType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Control#getControlType <em>Control Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Control Type</em>' attribute is set.
     * @see #unsetControlType()
     * @see #getControlType()
     * @see #setControlType(String)
     * @generated
     */
    boolean isSetControlType();

    /**
     * Returns the value of the '<em><b>Operation In Progress</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Indicates that a client is currently sending control commands that has not completed.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Operation In Progress</em>' attribute.
     * @see #isSetOperationInProgress()
     * @see #unsetOperationInProgress()
     * @see #setOperationInProgress(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getControl_OperationInProgress()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='Control.operationInProgress' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getOperationInProgress();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Control#getOperationInProgress <em>Operation In Progress</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Operation In Progress</em>' attribute.
     * @see #isSetOperationInProgress()
     * @see #unsetOperationInProgress()
     * @see #getOperationInProgress()
     * @generated
     */
    void setOperationInProgress( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Control#getOperationInProgress <em>Operation In Progress</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOperationInProgress()
     * @see #getOperationInProgress()
     * @see #setOperationInProgress(Boolean)
     * @generated
     */
    void unsetOperationInProgress();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Control#getOperationInProgress <em>Operation In Progress</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Operation In Progress</em>' attribute is set.
     * @see #unsetOperationInProgress()
     * @see #getOperationInProgress()
     * @see #setOperationInProgress(Boolean)
     * @generated
     */
    boolean isSetOperationInProgress();

    /**
     * Returns the value of the '<em><b>Unit Multiplier</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnitMultiplier}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The unit multiplier of the controlled quantity.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Unit Multiplier</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnitMultiplier
     * @see #isSetUnitMultiplier()
     * @see #unsetUnitMultiplier()
     * @see #setUnitMultiplier(UnitMultiplier)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getControl_UnitMultiplier()
     * @model unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='Control.unitMultiplier' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    UnitMultiplier getUnitMultiplier();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Control#getUnitMultiplier <em>Unit Multiplier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Unit Multiplier</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnitMultiplier
     * @see #isSetUnitMultiplier()
     * @see #unsetUnitMultiplier()
     * @see #getUnitMultiplier()
     * @generated
     */
    void setUnitMultiplier( UnitMultiplier value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Control#getUnitMultiplier <em>Unit Multiplier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUnitMultiplier()
     * @see #getUnitMultiplier()
     * @see #setUnitMultiplier(UnitMultiplier)
     * @generated
     */
    void unsetUnitMultiplier();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Control#getUnitMultiplier <em>Unit Multiplier</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Unit Multiplier</em>' attribute is set.
     * @see #unsetUnitMultiplier()
     * @see #getUnitMultiplier()
     * @see #setUnitMultiplier(UnitMultiplier)
     * @generated
     */
    boolean isSetUnitMultiplier();

    /**
     * Returns the value of the '<em><b>Power System Resource</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerSystemResource#getControls <em>Controls</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Regulating device governed by this control output.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Power System Resource</em>' reference.
     * @see #isSetPowerSystemResource()
     * @see #unsetPowerSystemResource()
     * @see #setPowerSystemResource(PowerSystemResource)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getControl_PowerSystemResource()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerSystemResource#getControls
     * @model opposite="Controls" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='Control.PowerSystemResource' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    PowerSystemResource getPowerSystemResource();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Control#getPowerSystemResource <em>Power System Resource</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Power System Resource</em>' reference.
     * @see #isSetPowerSystemResource()
     * @see #unsetPowerSystemResource()
     * @see #getPowerSystemResource()
     * @generated
     */
    void setPowerSystemResource( PowerSystemResource value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Control#getPowerSystemResource <em>Power System Resource</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPowerSystemResource()
     * @see #getPowerSystemResource()
     * @see #setPowerSystemResource(PowerSystemResource)
     * @generated
     */
    void unsetPowerSystemResource();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Control#getPowerSystemResource <em>Power System Resource</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Power System Resource</em>' reference is set.
     * @see #unsetPowerSystemResource()
     * @see #getPowerSystemResource()
     * @see #setPowerSystemResource(PowerSystemResource)
     * @generated
     */
    boolean isSetPowerSystemResource();

    /**
     * Returns the value of the '<em><b>Unit Symbol</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnitSymbol}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The unit of measure of the controlled quantity.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Unit Symbol</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnitSymbol
     * @see #isSetUnitSymbol()
     * @see #unsetUnitSymbol()
     * @see #setUnitSymbol(UnitSymbol)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getControl_UnitSymbol()
     * @model unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='Control.unitSymbol' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    UnitSymbol getUnitSymbol();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Control#getUnitSymbol <em>Unit Symbol</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Unit Symbol</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.UnitSymbol
     * @see #isSetUnitSymbol()
     * @see #unsetUnitSymbol()
     * @see #getUnitSymbol()
     * @generated
     */
    void setUnitSymbol( UnitSymbol value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Control#getUnitSymbol <em>Unit Symbol</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUnitSymbol()
     * @see #getUnitSymbol()
     * @see #setUnitSymbol(UnitSymbol)
     * @generated
     */
    void unsetUnitSymbol();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Control#getUnitSymbol <em>Unit Symbol</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Unit Symbol</em>' attribute is set.
     * @see #unsetUnitSymbol()
     * @see #getUnitSymbol()
     * @see #setUnitSymbol(UnitSymbol)
     * @generated
     */
    boolean isSetUnitSymbol();

} // Control

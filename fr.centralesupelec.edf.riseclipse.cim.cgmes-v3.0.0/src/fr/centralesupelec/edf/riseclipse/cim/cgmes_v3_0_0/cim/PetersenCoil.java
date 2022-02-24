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
 * A representation of the model object '<em><b>Petersen Coil</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A variable impedance device normally used to offset line charging during single line faults in an ungrounded section of network.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PetersenCoil#getXGroundMax <em>XGround Max</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PetersenCoil#getNominalU <em>Nominal U</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PetersenCoil#getOffsetCurrent <em>Offset Current</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PetersenCoil#getXGroundNominal <em>XGround Nominal</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PetersenCoil#getPositionCurrent <em>Position Current</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PetersenCoil#getMode <em>Mode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PetersenCoil#getXGroundMin <em>XGround Min</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPetersenCoil()
 * @model
 * @generated
 */
public interface PetersenCoil extends EarthFaultCompensator {

    /**
     * Returns the value of the '<em><b>XGround Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The maximum reactance.
     * <!-- end-model-doc -->
     * @return the value of the '<em>XGround Max</em>' attribute.
     * @see #isSetXGroundMax()
     * @see #unsetXGroundMax()
     * @see #setXGroundMax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPetersenCoil_XGroundMax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Reactance" transient="true" ordered="false"
     *        extendedMetaData="name='PetersenCoil.xGroundMax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getXGroundMax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PetersenCoil#getXGroundMax <em>XGround Max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>XGround Max</em>' attribute.
     * @see #isSetXGroundMax()
     * @see #unsetXGroundMax()
     * @see #getXGroundMax()
     * @generated
     */
    void setXGroundMax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PetersenCoil#getXGroundMax <em>XGround Max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXGroundMax()
     * @see #getXGroundMax()
     * @see #setXGroundMax(Double)
     * @generated
     */
    void unsetXGroundMax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PetersenCoil#getXGroundMax <em>XGround Max</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>XGround Max</em>' attribute is set.
     * @see #unsetXGroundMax()
     * @see #getXGroundMax()
     * @see #setXGroundMax(Double)
     * @generated
     */
    boolean isSetXGroundMax();

    /**
     * Returns the value of the '<em><b>Nominal U</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The nominal voltage for which the coil is designed.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Nominal U</em>' attribute.
     * @see #isSetNominalU()
     * @see #unsetNominalU()
     * @see #setNominalU(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPetersenCoil_NominalU()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Voltage" transient="true" ordered="false"
     *        extendedMetaData="name='PetersenCoil.nominalU' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getNominalU();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PetersenCoil#getNominalU <em>Nominal U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Nominal U</em>' attribute.
     * @see #isSetNominalU()
     * @see #unsetNominalU()
     * @see #getNominalU()
     * @generated
     */
    void setNominalU( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PetersenCoil#getNominalU <em>Nominal U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNominalU()
     * @see #getNominalU()
     * @see #setNominalU(Double)
     * @generated
     */
    void unsetNominalU();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PetersenCoil#getNominalU <em>Nominal U</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Nominal U</em>' attribute is set.
     * @see #unsetNominalU()
     * @see #getNominalU()
     * @see #setNominalU(Double)
     * @generated
     */
    boolean isSetNominalU();

    /**
     * Returns the value of the '<em><b>Offset Current</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The offset current that the Petersen coil controller is operating from the resonant point.  This is normally a fixed amount for which the controller is configured and could be positive or negative.  Typically 0 to 60 A depending on voltage and resonance conditions.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Offset Current</em>' attribute.
     * @see #isSetOffsetCurrent()
     * @see #unsetOffsetCurrent()
     * @see #setOffsetCurrent(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPetersenCoil_OffsetCurrent()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CurrentFlow" transient="true" ordered="false"
     *        extendedMetaData="name='PetersenCoil.offsetCurrent' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getOffsetCurrent();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PetersenCoil#getOffsetCurrent <em>Offset Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Offset Current</em>' attribute.
     * @see #isSetOffsetCurrent()
     * @see #unsetOffsetCurrent()
     * @see #getOffsetCurrent()
     * @generated
     */
    void setOffsetCurrent( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PetersenCoil#getOffsetCurrent <em>Offset Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOffsetCurrent()
     * @see #getOffsetCurrent()
     * @see #setOffsetCurrent(Double)
     * @generated
     */
    void unsetOffsetCurrent();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PetersenCoil#getOffsetCurrent <em>Offset Current</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Offset Current</em>' attribute is set.
     * @see #unsetOffsetCurrent()
     * @see #getOffsetCurrent()
     * @see #setOffsetCurrent(Double)
     * @generated
     */
    boolean isSetOffsetCurrent();

    /**
     * Returns the value of the '<em><b>XGround Nominal</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The nominal reactance.  This is the operating point (normally over compensation) that is defined based on the resonance point in the healthy network condition.  The impedance is calculated based on nominal voltage divided by position current.
     * <!-- end-model-doc -->
     * @return the value of the '<em>XGround Nominal</em>' attribute.
     * @see #isSetXGroundNominal()
     * @see #unsetXGroundNominal()
     * @see #setXGroundNominal(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPetersenCoil_XGroundNominal()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Reactance" transient="true" ordered="false"
     *        extendedMetaData="name='PetersenCoil.xGroundNominal' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getXGroundNominal();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PetersenCoil#getXGroundNominal <em>XGround Nominal</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>XGround Nominal</em>' attribute.
     * @see #isSetXGroundNominal()
     * @see #unsetXGroundNominal()
     * @see #getXGroundNominal()
     * @generated
     */
    void setXGroundNominal( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PetersenCoil#getXGroundNominal <em>XGround Nominal</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXGroundNominal()
     * @see #getXGroundNominal()
     * @see #setXGroundNominal(Double)
     * @generated
     */
    void unsetXGroundNominal();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PetersenCoil#getXGroundNominal <em>XGround Nominal</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>XGround Nominal</em>' attribute is set.
     * @see #unsetXGroundNominal()
     * @see #getXGroundNominal()
     * @see #setXGroundNominal(Double)
     * @generated
     */
    boolean isSetXGroundNominal();

    /**
     * Returns the value of the '<em><b>Position Current</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The control current used to control the Petersen coil also known as the position current.  Typically in the range of 20 mA to 200 mA.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Position Current</em>' attribute.
     * @see #isSetPositionCurrent()
     * @see #unsetPositionCurrent()
     * @see #setPositionCurrent(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPetersenCoil_PositionCurrent()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CurrentFlow" transient="true" ordered="false"
     *        extendedMetaData="name='PetersenCoil.positionCurrent' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getPositionCurrent();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PetersenCoil#getPositionCurrent <em>Position Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Position Current</em>' attribute.
     * @see #isSetPositionCurrent()
     * @see #unsetPositionCurrent()
     * @see #getPositionCurrent()
     * @generated
     */
    void setPositionCurrent( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PetersenCoil#getPositionCurrent <em>Position Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPositionCurrent()
     * @see #getPositionCurrent()
     * @see #setPositionCurrent(Double)
     * @generated
     */
    void unsetPositionCurrent();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PetersenCoil#getPositionCurrent <em>Position Current</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Position Current</em>' attribute is set.
     * @see #unsetPositionCurrent()
     * @see #getPositionCurrent()
     * @see #setPositionCurrent(Double)
     * @generated
     */
    boolean isSetPositionCurrent();

    /**
     * Returns the value of the '<em><b>Mode</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PetersenCoilModeKind}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The mode of operation of the Petersen coil.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Mode</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PetersenCoilModeKind
     * @see #isSetMode()
     * @see #unsetMode()
     * @see #setMode(PetersenCoilModeKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPetersenCoil_Mode()
     * @model unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='PetersenCoil.mode' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    PetersenCoilModeKind getMode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PetersenCoil#getMode <em>Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mode</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PetersenCoilModeKind
     * @see #isSetMode()
     * @see #unsetMode()
     * @see #getMode()
     * @generated
     */
    void setMode( PetersenCoilModeKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PetersenCoil#getMode <em>Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMode()
     * @see #getMode()
     * @see #setMode(PetersenCoilModeKind)
     * @generated
     */
    void unsetMode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PetersenCoil#getMode <em>Mode</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Mode</em>' attribute is set.
     * @see #unsetMode()
     * @see #getMode()
     * @see #setMode(PetersenCoilModeKind)
     * @generated
     */
    boolean isSetMode();

    /**
     * Returns the value of the '<em><b>XGround Min</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The minimum reactance.
     * <!-- end-model-doc -->
     * @return the value of the '<em>XGround Min</em>' attribute.
     * @see #isSetXGroundMin()
     * @see #unsetXGroundMin()
     * @see #setXGroundMin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getPetersenCoil_XGroundMin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Reactance" transient="true" ordered="false"
     *        extendedMetaData="name='PetersenCoil.xGroundMin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getXGroundMin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PetersenCoil#getXGroundMin <em>XGround Min</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>XGround Min</em>' attribute.
     * @see #isSetXGroundMin()
     * @see #unsetXGroundMin()
     * @see #getXGroundMin()
     * @generated
     */
    void setXGroundMin( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PetersenCoil#getXGroundMin <em>XGround Min</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXGroundMin()
     * @see #getXGroundMin()
     * @see #setXGroundMin(Double)
     * @generated
     */
    void unsetXGroundMin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PetersenCoil#getXGroundMin <em>XGround Min</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>XGround Min</em>' attribute is set.
     * @see #unsetXGroundMin()
     * @see #getXGroundMin()
     * @see #setXGroundMin(Double)
     * @generated
     */
    boolean isSetXGroundMin();
} // PetersenCoil

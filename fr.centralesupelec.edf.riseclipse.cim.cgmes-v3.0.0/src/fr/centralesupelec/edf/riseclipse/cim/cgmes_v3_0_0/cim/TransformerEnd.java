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

import java.math.BigInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformer End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A conducting connection point of a power transformer. It corresponds to a physical transformer winding terminal.  In earlier CIM versions, the TransformerWinding class served a similar purpose, but this class is more flexible because it associates to terminal but is not a specialization of ConductingEquipment.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TransformerEnd#getPhaseTapChanger <em>Phase Tap Changer</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TransformerEnd#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TransformerEnd#getEndNumber <em>End Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TransformerEnd#getBaseVoltage <em>Base Voltage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TransformerEnd#getRatioTapChanger <em>Ratio Tap Changer</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TransformerEnd#getGrounded <em>Grounded</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TransformerEnd#getXground <em>Xground</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TransformerEnd#getRground <em>Rground</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTransformerEnd()
 * @model
 * @generated
 */
public interface TransformerEnd extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Terminal</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Terminal#getTransformerEnd <em>Transformer End</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Terminal of the power transformer to which this transformer end belongs.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Terminal</em>' reference.
     * @see #isSetTerminal()
     * @see #unsetTerminal()
     * @see #setTerminal(Terminal)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTransformerEnd_Terminal()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Terminal#getTransformerEnd
     * @model opposite="TransformerEnd" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='TransformerEnd.Terminal' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Terminal getTerminal();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TransformerEnd#getTerminal <em>Terminal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Terminal</em>' reference.
     * @see #isSetTerminal()
     * @see #unsetTerminal()
     * @see #getTerminal()
     * @generated
     */
    void setTerminal( Terminal value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TransformerEnd#getTerminal <em>Terminal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTerminal()
     * @see #getTerminal()
     * @see #setTerminal(Terminal)
     * @generated
     */
    void unsetTerminal();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TransformerEnd#getTerminal <em>Terminal</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Terminal</em>' reference is set.
     * @see #unsetTerminal()
     * @see #getTerminal()
     * @see #setTerminal(Terminal)
     * @generated
     */
    boolean isSetTerminal();

    /**
     * Returns the value of the '<em><b>End Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Number for this transformer end, corresponding to the end's order in the power transformer vector group or phase angle clock number.  Highest voltage winding should be 1.  Each end within a power transformer should have a unique subsequent end number.   Note the transformer end number need not match the terminal sequence number.
     * <!-- end-model-doc -->
     * @return the value of the '<em>End Number</em>' attribute.
     * @see #isSetEndNumber()
     * @see #unsetEndNumber()
     * @see #setEndNumber(BigInteger)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTransformerEnd_EndNumber()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Integer" transient="true" ordered="false"
     *        extendedMetaData="name='TransformerEnd.endNumber' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    BigInteger getEndNumber();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TransformerEnd#getEndNumber <em>End Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>End Number</em>' attribute.
     * @see #isSetEndNumber()
     * @see #unsetEndNumber()
     * @see #getEndNumber()
     * @generated
     */
    void setEndNumber( BigInteger value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TransformerEnd#getEndNumber <em>End Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEndNumber()
     * @see #getEndNumber()
     * @see #setEndNumber(BigInteger)
     * @generated
     */
    void unsetEndNumber();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TransformerEnd#getEndNumber <em>End Number</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>End Number</em>' attribute is set.
     * @see #unsetEndNumber()
     * @see #getEndNumber()
     * @see #setEndNumber(BigInteger)
     * @generated
     */
    boolean isSetEndNumber();

    /**
     * Returns the value of the '<em><b>Base Voltage</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BaseVoltage#getTransformerEnds <em>Transformer Ends</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Base voltage of the transformer end.  This is essential for PU calculation.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Base Voltage</em>' reference.
     * @see #isSetBaseVoltage()
     * @see #unsetBaseVoltage()
     * @see #setBaseVoltage(BaseVoltage)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTransformerEnd_BaseVoltage()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.BaseVoltage#getTransformerEnds
     * @model opposite="TransformerEnds" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='TransformerEnd.BaseVoltage' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    BaseVoltage getBaseVoltage();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TransformerEnd#getBaseVoltage <em>Base Voltage</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TransformerEnd#getBaseVoltage <em>Base Voltage</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBaseVoltage()
     * @see #getBaseVoltage()
     * @see #setBaseVoltage(BaseVoltage)
     * @generated
     */
    void unsetBaseVoltage();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TransformerEnd#getBaseVoltage <em>Base Voltage</em>}' reference is set.
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
     * Returns the value of the '<em><b>Ratio Tap Changer</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RatioTapChanger#getTransformerEnd <em>Transformer End</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Ratio tap changer associated with this transformer end.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ratio Tap Changer</em>' reference.
     * @see #isSetRatioTapChanger()
     * @see #unsetRatioTapChanger()
     * @see #setRatioTapChanger(RatioTapChanger)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTransformerEnd_RatioTapChanger()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RatioTapChanger#getTransformerEnd
     * @model opposite="TransformerEnd" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='TransformerEnd.RatioTapChanger' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    RatioTapChanger getRatioTapChanger();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TransformerEnd#getRatioTapChanger <em>Ratio Tap Changer</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ratio Tap Changer</em>' reference.
     * @see #isSetRatioTapChanger()
     * @see #unsetRatioTapChanger()
     * @see #getRatioTapChanger()
     * @generated
     */
    void setRatioTapChanger( RatioTapChanger value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TransformerEnd#getRatioTapChanger <em>Ratio Tap Changer</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRatioTapChanger()
     * @see #getRatioTapChanger()
     * @see #setRatioTapChanger(RatioTapChanger)
     * @generated
     */
    void unsetRatioTapChanger();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TransformerEnd#getRatioTapChanger <em>Ratio Tap Changer</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ratio Tap Changer</em>' reference is set.
     * @see #unsetRatioTapChanger()
     * @see #getRatioTapChanger()
     * @see #setRatioTapChanger(RatioTapChanger)
     * @generated
     */
    boolean isSetRatioTapChanger();

    /**
     * Returns the value of the '<em><b>Grounded</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * (for Yn and Zn connections) True if the neutral is solidly grounded.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Grounded</em>' attribute.
     * @see #isSetGrounded()
     * @see #unsetGrounded()
     * @see #setGrounded(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTransformerEnd_Grounded()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Boolean" transient="true" ordered="false"
     *        extendedMetaData="name='TransformerEnd.grounded' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Boolean getGrounded();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TransformerEnd#getGrounded <em>Grounded</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Grounded</em>' attribute.
     * @see #isSetGrounded()
     * @see #unsetGrounded()
     * @see #getGrounded()
     * @generated
     */
    void setGrounded( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TransformerEnd#getGrounded <em>Grounded</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGrounded()
     * @see #getGrounded()
     * @see #setGrounded(Boolean)
     * @generated
     */
    void unsetGrounded();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TransformerEnd#getGrounded <em>Grounded</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Grounded</em>' attribute is set.
     * @see #unsetGrounded()
     * @see #getGrounded()
     * @see #setGrounded(Boolean)
     * @generated
     */
    boolean isSetGrounded();

    /**
     * Returns the value of the '<em><b>Xground</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * (for Yn and Zn connections) Reactive part of neutral impedance where 'grounded' is true.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Xground</em>' attribute.
     * @see #isSetXground()
     * @see #unsetXground()
     * @see #setXground(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTransformerEnd_Xground()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Reactance" transient="true" ordered="false"
     *        extendedMetaData="name='TransformerEnd.xground' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getXground();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TransformerEnd#getXground <em>Xground</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xground</em>' attribute.
     * @see #isSetXground()
     * @see #unsetXground()
     * @see #getXground()
     * @generated
     */
    void setXground( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TransformerEnd#getXground <em>Xground</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetXground()
     * @see #getXground()
     * @see #setXground(Double)
     * @generated
     */
    void unsetXground();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TransformerEnd#getXground <em>Xground</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Xground</em>' attribute is set.
     * @see #unsetXground()
     * @see #getXground()
     * @see #setXground(Double)
     * @generated
     */
    boolean isSetXground();

    /**
     * Returns the value of the '<em><b>Rground</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * (for Yn and Zn connections) Resistance part of neutral impedance where 'grounded' is true.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Rground</em>' attribute.
     * @see #isSetRground()
     * @see #unsetRground()
     * @see #setRground(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTransformerEnd_Rground()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Resistance" transient="true" ordered="false"
     *        extendedMetaData="name='TransformerEnd.rground' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getRground();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TransformerEnd#getRground <em>Rground</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rground</em>' attribute.
     * @see #isSetRground()
     * @see #unsetRground()
     * @see #getRground()
     * @generated
     */
    void setRground( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TransformerEnd#getRground <em>Rground</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRground()
     * @see #getRground()
     * @see #setRground(Double)
     * @generated
     */
    void unsetRground();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TransformerEnd#getRground <em>Rground</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rground</em>' attribute is set.
     * @see #unsetRground()
     * @see #getRground()
     * @see #setRground(Double)
     * @generated
     */
    boolean isSetRground();

    /**
     * Returns the value of the '<em><b>Phase Tap Changer</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseTapChanger#getTransformerEnd <em>Transformer End</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Phase tap changer associated with this transformer end.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Phase Tap Changer</em>' reference.
     * @see #isSetPhaseTapChanger()
     * @see #unsetPhaseTapChanger()
     * @see #setPhaseTapChanger(PhaseTapChanger)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getTransformerEnd_PhaseTapChanger()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PhaseTapChanger#getTransformerEnd
     * @model opposite="TransformerEnd" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='TransformerEnd.PhaseTapChanger' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    PhaseTapChanger getPhaseTapChanger();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TransformerEnd#getPhaseTapChanger <em>Phase Tap Changer</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Phase Tap Changer</em>' reference.
     * @see #isSetPhaseTapChanger()
     * @see #unsetPhaseTapChanger()
     * @see #getPhaseTapChanger()
     * @generated
     */
    void setPhaseTapChanger( PhaseTapChanger value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TransformerEnd#getPhaseTapChanger <em>Phase Tap Changer</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPhaseTapChanger()
     * @see #getPhaseTapChanger()
     * @see #setPhaseTapChanger(PhaseTapChanger)
     * @generated
     */
    void unsetPhaseTapChanger();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.TransformerEnd#getPhaseTapChanger <em>Phase Tap Changer</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Phase Tap Changer</em>' reference is set.
     * @see #unsetPhaseTapChanger()
     * @see #getPhaseTapChanger()
     * @see #setPhaseTapChanger(PhaseTapChanger)
     * @generated
     */
    boolean isSetPhaseTapChanger();

} // TransformerEnd

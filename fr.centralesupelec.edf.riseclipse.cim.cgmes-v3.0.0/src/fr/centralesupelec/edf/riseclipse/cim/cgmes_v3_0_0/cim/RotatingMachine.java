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
 * A representation of the model object '<em><b>Rotating Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A rotating machine which may be used as a generator or motor.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotatingMachine#getHydroPump <em>Hydro Pump</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotatingMachine#getRatedU <em>Rated U</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotatingMachine#getRatedS <em>Rated S</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotatingMachine#getGeneratingUnit <em>Generating Unit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotatingMachine#getRatedPowerFactor <em>Rated Power Factor</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotatingMachine#getQ <em>Q</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotatingMachine#getP <em>P</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getRotatingMachine()
 * @model
 * @generated
 */
public interface RotatingMachine extends RegulatingCondEq {
    /**
     * Returns the value of the '<em><b>Hydro Pump</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroPump#getRotatingMachine <em>Rotating Machine</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The synchronous machine drives the turbine which moves the water from a low elevation to a higher elevation. The direction of machine rotation for pumping may or may not be the same as for generating.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Hydro Pump</em>' reference.
     * @see #isSetHydroPump()
     * @see #unsetHydroPump()
     * @see #setHydroPump(HydroPump)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getRotatingMachine_HydroPump()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.HydroPump#getRotatingMachine
     * @model opposite="RotatingMachine" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='RotatingMachine.HydroPump' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    HydroPump getHydroPump();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotatingMachine#getHydroPump <em>Hydro Pump</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Hydro Pump</em>' reference.
     * @see #isSetHydroPump()
     * @see #unsetHydroPump()
     * @see #getHydroPump()
     * @generated
     */
    void setHydroPump( HydroPump value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotatingMachine#getHydroPump <em>Hydro Pump</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetHydroPump()
     * @see #getHydroPump()
     * @see #setHydroPump(HydroPump)
     * @generated
     */
    void unsetHydroPump();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotatingMachine#getHydroPump <em>Hydro Pump</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Hydro Pump</em>' reference is set.
     * @see #unsetHydroPump()
     * @see #getHydroPump()
     * @see #setHydroPump(HydroPump)
     * @generated
     */
    boolean isSetHydroPump();

    /**
     * Returns the value of the '<em><b>Generating Unit</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getRotatingMachine <em>Rotating Machine</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A synchronous machine may operate as a generator and as such becomes a member of a generating unit.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Generating Unit</em>' reference.
     * @see #isSetGeneratingUnit()
     * @see #unsetGeneratingUnit()
     * @see #setGeneratingUnit(GeneratingUnit)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getRotatingMachine_GeneratingUnit()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeneratingUnit#getRotatingMachine
     * @model opposite="RotatingMachine" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="name='RotatingMachine.GeneratingUnit' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    GeneratingUnit getGeneratingUnit();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotatingMachine#getGeneratingUnit <em>Generating Unit</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Generating Unit</em>' reference.
     * @see #isSetGeneratingUnit()
     * @see #unsetGeneratingUnit()
     * @see #getGeneratingUnit()
     * @generated
     */
    void setGeneratingUnit( GeneratingUnit value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotatingMachine#getGeneratingUnit <em>Generating Unit</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGeneratingUnit()
     * @see #getGeneratingUnit()
     * @see #setGeneratingUnit(GeneratingUnit)
     * @generated
     */
    void unsetGeneratingUnit();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotatingMachine#getGeneratingUnit <em>Generating Unit</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Generating Unit</em>' reference is set.
     * @see #unsetGeneratingUnit()
     * @see #getGeneratingUnit()
     * @see #setGeneratingUnit(GeneratingUnit)
     * @generated
     */
    boolean isSetGeneratingUnit();

    /**
     * Returns the value of the '<em><b>Rated U</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Rated voltage (nameplate data, Ur in IEC 60909-0). It is primarily used for short circuit data exchange according to IEC 60909.
     * The attribute shall be a positive value.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Rated U</em>' attribute.
     * @see #isSetRatedU()
     * @see #unsetRatedU()
     * @see #setRatedU(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getRotatingMachine_RatedU()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Voltage" transient="true" ordered="false"
     *        extendedMetaData="name='RotatingMachine.ratedU' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getRatedU();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotatingMachine#getRatedU <em>Rated U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rated U</em>' attribute.
     * @see #isSetRatedU()
     * @see #unsetRatedU()
     * @see #getRatedU()
     * @generated
     */
    void setRatedU( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotatingMachine#getRatedU <em>Rated U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRatedU()
     * @see #getRatedU()
     * @see #setRatedU(Double)
     * @generated
     */
    void unsetRatedU();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotatingMachine#getRatedU <em>Rated U</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rated U</em>' attribute is set.
     * @see #unsetRatedU()
     * @see #getRatedU()
     * @see #setRatedU(Double)
     * @generated
     */
    boolean isSetRatedU();

    /**
     * Returns the value of the '<em><b>Rated S</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Nameplate apparent power rating for the unit.
     * The attribute shall have a positive value.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Rated S</em>' attribute.
     * @see #isSetRatedS()
     * @see #unsetRatedS()
     * @see #setRatedS(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getRotatingMachine_RatedS()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ApparentPower" transient="true" ordered="false"
     *        extendedMetaData="name='RotatingMachine.ratedS' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getRatedS();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotatingMachine#getRatedS <em>Rated S</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rated S</em>' attribute.
     * @see #isSetRatedS()
     * @see #unsetRatedS()
     * @see #getRatedS()
     * @generated
     */
    void setRatedS( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotatingMachine#getRatedS <em>Rated S</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRatedS()
     * @see #getRatedS()
     * @see #setRatedS(Double)
     * @generated
     */
    void unsetRatedS();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotatingMachine#getRatedS <em>Rated S</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rated S</em>' attribute is set.
     * @see #unsetRatedS()
     * @see #getRatedS()
     * @see #setRatedS(Double)
     * @generated
     */
    boolean isSetRatedS();

    /**
     * Returns the value of the '<em><b>Rated Power Factor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Power factor (nameplate data). It is primarily used for short circuit data exchange according to IEC 60909. The attribute cannot be a negative value.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Rated Power Factor</em>' attribute.
     * @see #isSetRatedPowerFactor()
     * @see #unsetRatedPowerFactor()
     * @see #setRatedPowerFactor(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getRotatingMachine_RatedPowerFactor()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='RotatingMachine.ratedPowerFactor' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getRatedPowerFactor();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotatingMachine#getRatedPowerFactor <em>Rated Power Factor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rated Power Factor</em>' attribute.
     * @see #isSetRatedPowerFactor()
     * @see #unsetRatedPowerFactor()
     * @see #getRatedPowerFactor()
     * @generated
     */
    void setRatedPowerFactor( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotatingMachine#getRatedPowerFactor <em>Rated Power Factor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRatedPowerFactor()
     * @see #getRatedPowerFactor()
     * @see #setRatedPowerFactor(Double)
     * @generated
     */
    void unsetRatedPowerFactor();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotatingMachine#getRatedPowerFactor <em>Rated Power Factor</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rated Power Factor</em>' attribute is set.
     * @see #unsetRatedPowerFactor()
     * @see #getRatedPowerFactor()
     * @see #setRatedPowerFactor(Double)
     * @generated
     */
    boolean isSetRatedPowerFactor();

    /**
     * Returns the value of the '<em><b>Q</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reactive power injection. Load sign convention is used, i.e. positive sign means flow out from a node.
     * Starting value for a steady state solution.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Q</em>' attribute.
     * @see #isSetQ()
     * @see #unsetQ()
     * @see #setQ(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getRotatingMachine_Q()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ReactivePower" transient="true" ordered="false"
     *        extendedMetaData="name='RotatingMachine.q' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getQ();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotatingMachine#getQ <em>Q</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotatingMachine#getQ <em>Q</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetQ()
     * @see #getQ()
     * @see #setQ(Double)
     * @generated
     */
    void unsetQ();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotatingMachine#getQ <em>Q</em>}' attribute is set.
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
     * Active power injection. Load sign convention is used, i.e. positive sign means flow out from a node.
     * Starting value for a steady state solution.
     * <!-- end-model-doc -->
     * @return the value of the '<em>P</em>' attribute.
     * @see #isSetP()
     * @see #unsetP()
     * @see #setP(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getRotatingMachine_P()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ActivePower" transient="true" ordered="false"
     *        extendedMetaData="name='RotatingMachine.p' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getP();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotatingMachine#getP <em>P</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotatingMachine#getP <em>P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetP()
     * @see #getP()
     * @see #setP(Double)
     * @generated
     */
    void unsetP();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.RotatingMachine#getP <em>P</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>P</em>' attribute is set.
     * @see #unsetP()
     * @see #getP()
     * @see #setP(Double)
     * @generated
     */
    boolean isSetP();

} // RotatingMachine

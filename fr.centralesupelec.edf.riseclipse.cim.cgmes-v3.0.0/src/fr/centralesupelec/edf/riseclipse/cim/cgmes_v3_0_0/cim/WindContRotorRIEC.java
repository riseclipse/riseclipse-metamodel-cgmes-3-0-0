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
 * A representation of the model object '<em><b>Wind Cont Rotor RIEC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Rotor resistance control model.
 * Reference: IEC 61400-27-1:2015, 5.6.5.3.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContRotorRIEC#getWindGenTurbineType2IEC <em>Wind Gen Turbine Type2 IEC</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContRotorRIEC#getWindDynamicsLookupTable <em>Wind Dynamics Lookup Table</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContRotorRIEC#getTpfiltrr <em>Tpfiltrr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContRotorRIEC#getRmax <em>Rmax</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContRotorRIEC#getRmin <em>Rmin</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContRotorRIEC#getKpfilt <em>Kpfilt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContRotorRIEC#getKirr <em>Kirr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContRotorRIEC#getKprr <em>Kprr</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContRotorRIEC#getKomegafilt <em>Komegafilt</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContRotorRIEC#getTomegafiltrr <em>Tomegafiltrr</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContRotorRIEC()
 * @model
 * @generated
 */
public interface WindContRotorRIEC extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Wind Gen Turbine Type2 IEC</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenTurbineType2IEC#getWindContRotorRIEC <em>Wind Cont Rotor RIEC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Wind turbine type 2 model with whitch this wind control rotor resistance model is associated.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wind Gen Turbine Type2 IEC</em>' reference.
     * @see #isSetWindGenTurbineType2IEC()
     * @see #unsetWindGenTurbineType2IEC()
     * @see #setWindGenTurbineType2IEC(WindGenTurbineType2IEC)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContRotorRIEC_WindGenTurbineType2IEC()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindGenTurbineType2IEC#getWindContRotorRIEC
     * @model opposite="WindContRotorRIEC" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='WindContRotorRIEC.WindGenTurbineType2IEC' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    WindGenTurbineType2IEC getWindGenTurbineType2IEC();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContRotorRIEC#getWindGenTurbineType2IEC <em>Wind Gen Turbine Type2 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Wind Gen Turbine Type2 IEC</em>' reference.
     * @see #isSetWindGenTurbineType2IEC()
     * @see #unsetWindGenTurbineType2IEC()
     * @see #getWindGenTurbineType2IEC()
     * @generated
     */
    void setWindGenTurbineType2IEC( WindGenTurbineType2IEC value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContRotorRIEC#getWindGenTurbineType2IEC <em>Wind Gen Turbine Type2 IEC</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindGenTurbineType2IEC()
     * @see #getWindGenTurbineType2IEC()
     * @see #setWindGenTurbineType2IEC(WindGenTurbineType2IEC)
     * @generated
     */
    void unsetWindGenTurbineType2IEC();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContRotorRIEC#getWindGenTurbineType2IEC <em>Wind Gen Turbine Type2 IEC</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Gen Turbine Type2 IEC</em>' reference is set.
     * @see #unsetWindGenTurbineType2IEC()
     * @see #getWindGenTurbineType2IEC()
     * @see #setWindGenTurbineType2IEC(WindGenTurbineType2IEC)
     * @generated
     */
    boolean isSetWindGenTurbineType2IEC();

    /**
     * Returns the value of the '<em><b>Wind Dynamics Lookup Table</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getWindContRotorRIEC <em>Wind Cont Rotor RIEC</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The wind dynamics lookup table associated with this rotor resistance control model.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Wind Dynamics Lookup Table</em>' reference list.
     * @see #isSetWindDynamicsLookupTable()
     * @see #unsetWindDynamicsLookupTable()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContRotorRIEC_WindDynamicsLookupTable()
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindDynamicsLookupTable#getWindContRotorRIEC
     * @model opposite="WindContRotorRIEC" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="name='WindContRotorRIEC.WindDynamicsLookupTable' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    EList< WindDynamicsLookupTable > getWindDynamicsLookupTable();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContRotorRIEC#getWindDynamicsLookupTable <em>Wind Dynamics Lookup Table</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWindDynamicsLookupTable()
     * @see #getWindDynamicsLookupTable()
     * @generated
     */
    void unsetWindDynamicsLookupTable();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContRotorRIEC#getWindDynamicsLookupTable <em>Wind Dynamics Lookup Table</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wind Dynamics Lookup Table</em>' reference list is set.
     * @see #unsetWindDynamicsLookupTable()
     * @see #getWindDynamicsLookupTable()
     * @generated
     */
    boolean isSetWindDynamicsLookupTable();

    /**
     * Returns the value of the '<em><b>Tpfiltrr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Filter time constant for power measurement (<i>T</i><i><sub>pfiltrr</sub></i>) (&gt;= 0). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tpfiltrr</em>' attribute.
     * @see #isSetTpfiltrr()
     * @see #unsetTpfiltrr()
     * @see #setTpfiltrr(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContRotorRIEC_Tpfiltrr()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='WindContRotorRIEC.tpfiltrr' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTpfiltrr();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContRotorRIEC#getTpfiltrr <em>Tpfiltrr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tpfiltrr</em>' attribute.
     * @see #isSetTpfiltrr()
     * @see #unsetTpfiltrr()
     * @see #getTpfiltrr()
     * @generated
     */
    void setTpfiltrr( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContRotorRIEC#getTpfiltrr <em>Tpfiltrr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTpfiltrr()
     * @see #getTpfiltrr()
     * @see #setTpfiltrr(Double)
     * @generated
     */
    void unsetTpfiltrr();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContRotorRIEC#getTpfiltrr <em>Tpfiltrr</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tpfiltrr</em>' attribute is set.
     * @see #unsetTpfiltrr()
     * @see #getTpfiltrr()
     * @see #setTpfiltrr(Double)
     * @generated
     */
    boolean isSetTpfiltrr();

    /**
     * Returns the value of the '<em><b>Rmax</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maximum rotor resistance (<i>r</i><i><sub>max</sub></i>) (&gt; WindContRotorRIEC.rmin). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Rmax</em>' attribute.
     * @see #isSetRmax()
     * @see #unsetRmax()
     * @see #setRmax(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContRotorRIEC_Rmax()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindContRotorRIEC.rmax' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getRmax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContRotorRIEC#getRmax <em>Rmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rmax</em>' attribute.
     * @see #isSetRmax()
     * @see #unsetRmax()
     * @see #getRmax()
     * @generated
     */
    void setRmax( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContRotorRIEC#getRmax <em>Rmax</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRmax()
     * @see #getRmax()
     * @see #setRmax(Double)
     * @generated
     */
    void unsetRmax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContRotorRIEC#getRmax <em>Rmax</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rmax</em>' attribute is set.
     * @see #unsetRmax()
     * @see #getRmax()
     * @see #setRmax(Double)
     * @generated
     */
    boolean isSetRmax();

    /**
     * Returns the value of the '<em><b>Rmin</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Minimum rotor resistance (<i>r</i><i><sub>min</sub></i>) (&lt; WindContRotorRIEC.rmax). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Rmin</em>' attribute.
     * @see #isSetRmin()
     * @see #unsetRmin()
     * @see #setRmin(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContRotorRIEC_Rmin()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindContRotorRIEC.rmin' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getRmin();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContRotorRIEC#getRmin <em>Rmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rmin</em>' attribute.
     * @see #isSetRmin()
     * @see #unsetRmin()
     * @see #getRmin()
     * @generated
     */
    void setRmin( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContRotorRIEC#getRmin <em>Rmin</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRmin()
     * @see #getRmin()
     * @see #setRmin(Double)
     * @generated
     */
    void unsetRmin();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContRotorRIEC#getRmin <em>Rmin</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rmin</em>' attribute is set.
     * @see #unsetRmin()
     * @see #getRmin()
     * @see #setRmin(Double)
     * @generated
     */
    boolean isSetRmin();

    /**
     * Returns the value of the '<em><b>Kpfilt</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Filter gain for power measurement (<i>K</i><i><sub>pfilt</sub></i>). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kpfilt</em>' attribute.
     * @see #isSetKpfilt()
     * @see #unsetKpfilt()
     * @see #setKpfilt(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContRotorRIEC_Kpfilt()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='WindContRotorRIEC.kpfilt' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKpfilt();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContRotorRIEC#getKpfilt <em>Kpfilt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kpfilt</em>' attribute.
     * @see #isSetKpfilt()
     * @see #unsetKpfilt()
     * @see #getKpfilt()
     * @generated
     */
    void setKpfilt( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContRotorRIEC#getKpfilt <em>Kpfilt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKpfilt()
     * @see #getKpfilt()
     * @see #setKpfilt(Double)
     * @generated
     */
    void unsetKpfilt();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContRotorRIEC#getKpfilt <em>Kpfilt</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kpfilt</em>' attribute is set.
     * @see #unsetKpfilt()
     * @see #getKpfilt()
     * @see #setKpfilt(Double)
     * @generated
     */
    boolean isSetKpfilt();

    /**
     * Returns the value of the '<em><b>Kirr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Integral gain in rotor resistance PI controller (<i>K</i><i><sub>Irr</sub></i>). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kirr</em>' attribute.
     * @see #isSetKirr()
     * @see #unsetKirr()
     * @see #setKirr(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContRotorRIEC_Kirr()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindContRotorRIEC.kirr' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKirr();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContRotorRIEC#getKirr <em>Kirr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kirr</em>' attribute.
     * @see #isSetKirr()
     * @see #unsetKirr()
     * @see #getKirr()
     * @generated
     */
    void setKirr( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContRotorRIEC#getKirr <em>Kirr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKirr()
     * @see #getKirr()
     * @see #setKirr(Double)
     * @generated
     */
    void unsetKirr();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContRotorRIEC#getKirr <em>Kirr</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kirr</em>' attribute is set.
     * @see #unsetKirr()
     * @see #getKirr()
     * @see #setKirr(Double)
     * @generated
     */
    boolean isSetKirr();

    /**
     * Returns the value of the '<em><b>Kprr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Proportional gain in rotor resistance PI controller (<i>K</i><i><sub>Prr</sub></i>). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Kprr</em>' attribute.
     * @see #isSetKprr()
     * @see #unsetKprr()
     * @see #setKprr(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContRotorRIEC_Kprr()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PU" transient="true" ordered="false"
     *        extendedMetaData="name='WindContRotorRIEC.kprr' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKprr();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContRotorRIEC#getKprr <em>Kprr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kprr</em>' attribute.
     * @see #isSetKprr()
     * @see #unsetKprr()
     * @see #getKprr()
     * @generated
     */
    void setKprr( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContRotorRIEC#getKprr <em>Kprr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKprr()
     * @see #getKprr()
     * @see #setKprr(Double)
     * @generated
     */
    void unsetKprr();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContRotorRIEC#getKprr <em>Kprr</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kprr</em>' attribute is set.
     * @see #unsetKprr()
     * @see #getKprr()
     * @see #setKprr(Double)
     * @generated
     */
    boolean isSetKprr();

    /**
     * Returns the value of the '<em><b>Komegafilt</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Filter gain for generator speed measurement (<i>K</i><i><sub>omegafilt</sub></i>). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Komegafilt</em>' attribute.
     * @see #isSetKomegafilt()
     * @see #unsetKomegafilt()
     * @see #setKomegafilt(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContRotorRIEC_Komegafilt()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Float" transient="true" ordered="false"
     *        extendedMetaData="name='WindContRotorRIEC.komegafilt' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getKomegafilt();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContRotorRIEC#getKomegafilt <em>Komegafilt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Komegafilt</em>' attribute.
     * @see #isSetKomegafilt()
     * @see #unsetKomegafilt()
     * @see #getKomegafilt()
     * @generated
     */
    void setKomegafilt( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContRotorRIEC#getKomegafilt <em>Komegafilt</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKomegafilt()
     * @see #getKomegafilt()
     * @see #setKomegafilt(Double)
     * @generated
     */
    void unsetKomegafilt();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContRotorRIEC#getKomegafilt <em>Komegafilt</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Komegafilt</em>' attribute is set.
     * @see #unsetKomegafilt()
     * @see #getKomegafilt()
     * @see #setKomegafilt(Double)
     * @generated
     */
    boolean isSetKomegafilt();

    /**
     * Returns the value of the '<em><b>Tomegafiltrr</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Filter time constant for generator speed measurement (<i>T</i><i><sub>omegafiltrr</sub></i>) (&gt;= 0). It is a type-dependent parameter.
     * <!-- end-model-doc -->
     * @return the value of the '<em>Tomegafiltrr</em>' attribute.
     * @see #isSetTomegafiltrr()
     * @see #unsetTomegafiltrr()
     * @see #setTomegafiltrr(Double)
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getWindContRotorRIEC_Tomegafiltrr()
     * @model unsettable="true" dataType="fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Seconds" transient="true" ordered="false"
     *        extendedMetaData="name='WindContRotorRIEC.tomegafiltrr' kind='element' namespace='http://iec.ch/TC57/CIM100'"
     * @generated
     */
    Double getTomegafiltrr();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContRotorRIEC#getTomegafiltrr <em>Tomegafiltrr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tomegafiltrr</em>' attribute.
     * @see #isSetTomegafiltrr()
     * @see #unsetTomegafiltrr()
     * @see #getTomegafiltrr()
     * @generated
     */
    void setTomegafiltrr( Double value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContRotorRIEC#getTomegafiltrr <em>Tomegafiltrr</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTomegafiltrr()
     * @see #getTomegafiltrr()
     * @see #setTomegafiltrr(Double)
     * @generated
     */
    void unsetTomegafiltrr();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.WindContRotorRIEC#getTomegafiltrr <em>Tomegafiltrr</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tomegafiltrr</em>' attribute is set.
     * @see #unsetTomegafiltrr()
     * @see #getTomegafiltrr()
     * @see #setTomegafiltrr(Double)
     * @generated
     */
    boolean isSetTomegafiltrr();

} // WindContRotorRIEC

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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Unit Symbol</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * The derived units defined for usage in the CIM. In some cases, the derived unit is equal to an SI unit. Whenever possible, the standard derived symbol is used instead of the formula for the derived unit. For example, the unit symbol Farad is defined as "F" instead of "CPerV". In cases where a standard symbol does not exist for a derived unit, the formula for the unit is used as the unit symbol. For example, density does not have a standard symbol and so it is represented as "kgPerm3". With the exception of the "kg", which is an SI unit, the unit symbols do not contain multipliers and therefore represent the base derived unit to which a multiplier can be applied as a whole.
 * Every unit symbol is treated as an unparseable text as if it were a single-letter symbol. The meaning of each unit symbol is defined by the accompanying descriptive text and not by the text contents of the unit symbol.
 * To allow the widest possible range of serializations without requiring special character handling, several substitutions are made which deviate from the format described in IEC 80000-1. The division symbol "/" is replaced by the letters "Per". Exponents are written in plain text after the unit as "m3" instead of being formatted as "m" with a superscript of 3  or introducing a symbol as in "m^3". The degree symbol "°" is replaced with the letters "deg". Any clarification of the meaning for a substitution is included in the description for the unit symbol.
 * Non-SI units are included in list of unit symbols to allow sources of data to be correctly labelled with their non-SI units (for example, a GPS sensor that is reporting numbers that represent feet instead of meters). This allows software to use the unit symbol information correctly convert and scale the raw data of those sources into SI-based units.
 * The integer values are used for harmonization with IEC 61850.
 * <!-- end-model-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getUnitSymbol()
 * @model
 * @generated
 */
public enum UnitSymbol implements Enumerator {
    /**
     * The '<em><b>WPerm K</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Thermal conductivity in watt/metres kelvin.
     * <!-- end-model-doc -->
     * @see #WPERM_K_VALUE
     * @generated
     * @ordered
     */
    WPERM_K( 1, "WPermK", "WPermK" ),

    /**
     * The '<em><b>MPerm3</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Fuel efficiency in metres per cubic metres (m/m³).
     * <!-- end-model-doc -->
     * @see #MPERM3_VALUE
     * @generated
     * @ordered
     */
    MPERM3( 2, "mPerm3", "mPerm3" ),
    /**
     * The '<em><b>A2s</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Ampere squared time in square amperes (A²s).
     * <!-- end-model-doc -->
     * @see #A2S_VALUE
     * @generated
     * @ordered
     */
    A2S( 3, "A2s", "A2s" ),
    /**
     * The '<em><b>A2h</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Ampere-squared hour, ampere-squared hour.
     * <!-- end-model-doc -->
     * @see #A2H_VALUE
     * @generated
     * @ordered
     */
    A2H( 4, "A2h", "A2h" ),
    /**
     * The '<em><b>WPerm2</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Heat flux density, irradiance, watts per square metre.
     * <!-- end-model-doc -->
     * @see #WPERM2_VALUE
     * @generated
     * @ordered
     */
    WPERM2( 5, "WPerm2", "WPerm2" ),
    /**
     * The '<em><b>V</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Electric potential in volts (W/A).
     * <!-- end-model-doc -->
     * @see #V_VALUE
     * @generated
     * @ordered
     */
    V( 6, "V", "V" ),
    /**
     * The '<em><b>W</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Real power in watts (J/s). Electrical power may have real and reactive components. The real portion of electrical power (I&#178;R or VIcos(phi)), is expressed in Watts. See also apparent power and reactive power.
     * <!-- end-model-doc -->
     * @see #W_VALUE
     * @generated
     * @ordered
     */
    W( 7, "W", "W" ),
    /**
     * The '<em><b>Ppm</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Concentration in parts per million.
     * <!-- end-model-doc -->
     * @see #PPM_VALUE
     * @generated
     * @ordered
     */
    PPM( 8, "ppm", "ppm" ),
    /**
     * The '<em><b>D</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time in days, day = 24 h = 86400 s.
     * <!-- end-model-doc -->
     * @see #D_VALUE
     * @generated
     * @ordered
     */
    D( 9, "d", "d" ),
    /**
     * The '<em><b>Mile</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Length, nautical miles (1 M = 1852 m).
     * <!-- end-model-doc -->
     * @see #MILE_VALUE
     * @generated
     * @ordered
     */
    MILE( 10, "Mile", "M" ),
    /**
     * The '<em><b>J</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Energy in joules (N·m = C·V = W·s).
     * <!-- end-model-doc -->
     * @see #J_VALUE
     * @generated
     * @ordered
     */
    J( 11, "J", "J" ),
    /**
     * The '<em><b>K</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Temperature in kelvins.
     * <!-- end-model-doc -->
     * @see #K_VALUE
     * @generated
     * @ordered
     */
    K( 12, "K", "K" ),
    /**
     * The '<em><b>Hour</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Electric inductance in henrys (Wb/A).
     * <!-- end-model-doc -->
     * @see #HOUR_VALUE
     * @generated
     * @ordered
     */
    HOUR( 13, "Hour", "H" ),
    /**
     * The '<em><b>F</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Electric capacitance in farads (C/V).
     * <!-- end-model-doc -->
     * @see #F_VALUE
     * @generated
     * @ordered
     */
    F( 14, "F", "F" ),
    /**
     * The '<em><b>G</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Magnetic flux density, gausses (1 G = 10-4 T).
     * <!-- end-model-doc -->
     * @see #G_VALUE
     * @generated
     * @ordered
     */
    G( 15, "G", "G" ),
    /**
     * The '<em><b>T</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Magnetic flux density in teslas (Wb/m2).
     * <!-- end-model-doc -->
     * @see #T_VALUE
     * @generated
     * @ordered
     */
    T( 16, "T", "T" ),
    /**
     * The '<em><b>Siemens</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Conductance in siemens.
     * <!-- end-model-doc -->
     * @see #SIEMENS_VALUE
     * @generated
     * @ordered
     */
    SIEMENS( 17, "Siemens", "S" ),
    /**
     * The '<em><b>Q</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Quantity power, Q.
     * <!-- end-model-doc -->
     * @see #Q_VALUE
     * @generated
     * @ordered
     */
    Q( 18, "Q", "Q" ),
    /**
     * The '<em><b>N</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Force in newtons (kg·m/s²).
     * <!-- end-model-doc -->
     * @see #N_VALUE
     * @generated
     * @ordered
     */
    N( 19, "N", "N" ),
    /**
     * The '<em><b>C</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Electric charge in coulombs (A·s).
     * <!-- end-model-doc -->
     * @see #C_VALUE
     * @generated
     * @ordered
     */
    C( 20, "C", "C" ),
    /**
     * The '<em><b>A</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Current in amperes.
     * <!-- end-model-doc -->
     * @see #A_VALUE
     * @generated
     * @ordered
     */
    A( 21, "A", "A" ),
    /**
     * The '<em><b>WPerm2sr</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Radiance, watts per square metre steradian.
     * <!-- end-model-doc -->
     * @see #WPERM2SR_VALUE
     * @generated
     * @ordered
     */
    WPERM2SR( 22, "WPerm2sr", "WPerm2sr" ),
    /**
     * The '<em><b>VArh</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reactive energy in volt ampere reactive hours.
     * <!-- end-model-doc -->
     * @see #VARH_VALUE
     * @generated
     * @ordered
     */
    VARH( 23, "VArh", "VArh" ),
    /**
     * The '<em><b>LPerl</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Concentration, The ratio of the volume of a solute divided by the volume of  the solution. Note: Users may need use a prefix such a ‘µ’ to express a quantity such as ‘µL/L’.
     * <!-- end-model-doc -->
     * @see #LPERL_VALUE
     * @generated
     * @ordered
     */
    LPERL( 24, "lPerl", "lPerl" ),
    /**
     * The '<em><b>LPerh</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Volumetric flow rate, litres per hour.
     * <!-- end-model-doc -->
     * @see #LPERH_VALUE
     * @generated
     * @ordered
     */
    LPERH( 25, "lPerh", "lPerh" ),
    /**
     * The '<em><b>LPers</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Volumetric flow rate in litres per second.
     * <!-- end-model-doc -->
     * @see #LPERS_VALUE
     * @generated
     * @ordered
     */
    LPERS( 26, "lPers", "lPers" ),
    /**
     * The '<em><b>M3 Uncompensated</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Volume, cubic metres, with the value uncompensated for weather effects.
     * <!-- end-model-doc -->
     * @see #M3_UNCOMPENSATED_VALUE
     * @generated
     * @ordered
     */
    M3_UNCOMPENSATED( 27, "m3Uncompensated", "m3Uncompensated" ),

    /**
     * The '<em><b>Gy Pers</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Absorbed dose rate, grays per second.
     * <!-- end-model-doc -->
     * @see #GY_PERS_VALUE
     * @generated
     * @ordered
     */
    GY_PERS( 28, "GyPers", "GyPers" ),
    /**
     * The '<em><b>Cos Phi</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Power factor, dimensionless.
     * Note 1: This definition of power factor only holds for balanced systems. See the alternative definition under code 153.
     * Note 2 : Beware of differing sign conventions in use between the IEC and EEI. It is assumed that the data consumer understands the type of meter in use and the sign convention in use by the utility.
     * <!-- end-model-doc -->
     * @see #COS_PHI_VALUE
     * @generated
     * @ordered
     */
    COS_PHI( 29, "cosPhi", "cosPhi" ),
    /**
     * The '<em><b>Cd</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Luminous intensity in candelas.
     * <!-- end-model-doc -->
     * @see #CD_VALUE
     * @generated
     * @ordered
     */
    CD( 30, "cd", "cd" ),
    /**
     * The '<em><b>DB</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Sound pressure level in decibels. Note:  multiplier “d” is included in this unit symbol for compatibility with IEC 61850-7-3.
     * <!-- end-model-doc -->
     * @see #DB_VALUE
     * @generated
     * @ordered
     */
    DB( 31, "dB", "dB" ),

    /**
     * The '<em><b>Ohmm</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Resistivity, ohm metres, (rho).
     * <!-- end-model-doc -->
     * @see #OHMM_VALUE
     * @generated
     * @ordered
     */
    OHMM( 32, "ohmm", "ohmm" ),
    /**
     * The '<em><b>APerm</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A/m, magnetic field strength, amperes per metre.
     * <!-- end-model-doc -->
     * @see #APERM_VALUE
     * @generated
     * @ordered
     */
    APERM( 33, "APerm", "APerm" ),
    /**
     * The '<em><b>WPersr</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Radiant intensity, watts per steradian.
     * <!-- end-model-doc -->
     * @see #WPERSR_VALUE
     * @generated
     * @ordered
     */
    WPERSR( 34, "WPersr", "WPersr" ),
    /**
     * The '<em><b>Kat Perm3</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Catalytic activity concentration, katals per cubic metre.
     * <!-- end-model-doc -->
     * @see #KAT_PERM3_VALUE
     * @generated
     * @ordered
     */
    KAT_PERM3( 35, "katPerm3", "katPerm3" ),
    /**
     * The '<em><b>APer A</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Current, ratio of amperages.   Note: Users may need to supply a prefix such as ‘m’ to show rates such as ‘mA/A’.
     * <!-- end-model-doc -->
     * @see #APER_A_VALUE
     * @generated
     * @ordered
     */
    APER_A( 36, "APerA", "APerA" ),
    /**
     * The '<em><b>MPers2</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Acceleration in metres per second squared (m/s²).
     * <!-- end-model-doc -->
     * @see #MPERS2_VALUE
     * @generated
     * @ordered
     */
    MPERS2( 37, "mPers2", "mPers2" ),
    /**
     * The '<em><b>KPers</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Temperature change rate in kelvins per second.
     * <!-- end-model-doc -->
     * @see #KPERS_VALUE
     * @generated
     * @ordered
     */
    KPERS( 38, "KPers", "KPers" ),
    /**
     * The '<em><b>MPers</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Velocity in metres per second (m/s).
     * <!-- end-model-doc -->
     * @see #MPERS_VALUE
     * @generated
     * @ordered
     */
    MPERS( 39, "mPers", "mPers" ),
    /**
     * The '<em><b>VAh</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Apparent energy in volt ampere hours.
     * <!-- end-model-doc -->
     * @see #VAH_VALUE
     * @generated
     * @ordered
     */
    VAH( 40, "VAh", "VAh" ),
    /**
     * The '<em><b>Ha</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Area, hectares.
     * <!-- end-model-doc -->
     * @see #HA_VALUE
     * @generated
     * @ordered
     */
    HA( 41, "ha", "ha" ),
    /**
     * The '<em><b>L</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Volume in litres, litre = dm3 = m3/1000.
     * <!-- end-model-doc -->
     * @see #L_VALUE
     * @generated
     * @ordered
     */
    L( 42, "l", "l" ),
    /**
     * The '<em><b>Meter</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Length in metres.
     * <!-- end-model-doc -->
     * @see #METER_VALUE
     * @generated
     * @ordered
     */
    METER( 43, "meter", "m" ),
    /**
     * The '<em><b>Henry</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time in hours, hour = 60 min = 3600 s.
     * <!-- end-model-doc -->
     * @see #HENRY_VALUE
     * @generated
     * @ordered
     */
    HENRY( 44, "henry", "h" ),
    /**
     * The '<em><b>Second</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time in seconds.
     * <!-- end-model-doc -->
     * @see #SECOND_VALUE
     * @generated
     * @ordered
     */
    SECOND( 45, "second", "s" ),
    /**
     * The '<em><b>Count</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Amount of substance, Counter value.
     * <!-- end-model-doc -->
     * @see #COUNT_VALUE
     * @generated
     * @ordered
     */
    COUNT( 46, "count", "count" ),
    /**
     * The '<em><b>Kg Per J</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Weight per energy in kilograms per joule (kg/J). Note: multiplier “k” is included in this unit symbol for compatibility with IEC 61850-7-3.
     * <!-- end-model-doc -->
     * @see #KG_PER_J_VALUE
     * @generated
     * @ordered
     */
    KG_PER_J( 47, "kgPerJ", "kgPerJ" ),
    /**
     * The '<em><b>VAr</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reactive power in volt amperes reactive. The “reactive” or “imaginary” component of electrical power (VIsin(phi)). (See also real power and apparent power).
     * Note: Different meter designs use different methods to arrive at their results. Some meters may compute reactive power as an arithmetic value, while others compute the value vectorially. The data consumer should determine the method in use and the suitability of the measurement for the intended purpose.
     * <!-- end-model-doc -->
     * @see #VAR_VALUE
     * @generated
     * @ordered
     */
    VAR( 48, "VAr", "VAr" ),
    /**
     * The '<em><b>GPerg</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Concentration, The ratio of the mass of a solute divided by the mass of  the solution. Note: Users may need use a prefix such a ‘µ’ to express a quantity such as ‘µg/g’.
     * <!-- end-model-doc -->
     * @see #GPERG_VALUE
     * @generated
     * @ordered
     */
    GPERG( 49, "gPerg", "gPerg" ),
    /**
     * The '<em><b>JPerkg</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Specific energy, Joules / kg.
     * <!-- end-model-doc -->
     * @see #JPERKG_VALUE
     * @generated
     * @ordered
     */
    JPERKG( 50, "JPerkg", "JPerkg" ),
    /**
     * The '<em><b>JPerm2</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Insulation energy density, joules per square metre or watt second per square metre.
     * <!-- end-model-doc -->
     * @see #JPERM2_VALUE
     * @generated
     * @ordered
     */
    JPERM2( 51, "JPerm2", "JPerm2" ),
    /**
     * The '<em><b>JPerm3</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Energy density, joules per cubic metre.
     * <!-- end-model-doc -->
     * @see #JPERM3_VALUE
     * @generated
     * @ordered
     */
    JPERM3( 52, "JPerm3", "JPerm3" ),
    /**
     * The '<em><b>VPer VA</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Power factor, PF, the ratio of the active power to the apparent power.  Note: The sign convention used for power factor will differ between IEC meters and EEI (ANSI) meters. It is assumed that the data consumers understand the type of meter being used and agree on the sign convention in use at any given utility.
     * <!-- end-model-doc -->
     * @see #VPER_VA_VALUE
     * @generated
     * @ordered
     */
    VPER_VA( 53, "VPerVA", "VPerVA" ),
    /**
     * The '<em><b>Hz Per Hz</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Frequency, rate of frequency change.   Note: Users may need to supply a prefix such as ‘m’ to show rates such as ‘mHz/Hz’.
     * <!-- end-model-doc -->
     * @see #HZ_PER_HZ_VALUE
     * @generated
     * @ordered
     */
    HZ_PER_HZ( 54, "HzPerHz", "HzPerHz" ),
    /**
     * The '<em><b>Mx</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Magnetic flux, maxwells (1 Mx = 10-8 Wb).
     * <!-- end-model-doc -->
     * @see #MX_VALUE
     * @generated
     * @ordered
     */
    MX( 55, "Mx", "Mx" ),
    /**
     * The '<em><b>Oe</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Magnetic field in oersteds, (1 Oe = (103/4p) A/m).
     * <!-- end-model-doc -->
     * @see #OE_VALUE
     * @generated
     * @ordered
     */
    OE( 56, "Oe", "Oe" ),
    /**
     * The '<em><b>Nm</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Moment of force, newton metres.
     * <!-- end-model-doc -->
     * @see #NM_VALUE
     * @generated
     * @ordered
     */
    NM( 57, "Nm", "Nm" ),
    /**
     * The '<em><b>CPerkg</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Exposure (x rays), coulombs per kilogram.
     * <!-- end-model-doc -->
     * @see #CPERKG_VALUE
     * @generated
     * @ordered
     */
    CPERKG( 58, "CPerkg", "CPerkg" ),
    /**
     * The '<em><b>Pa</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Pressure in pascals (N/m²). Note: the absolute or relative measurement of pressure is implied with this entry. See below for more explicit forms.
     * <!-- end-model-doc -->
     * @see #PA_VALUE
     * @generated
     * @ordered
     */
    PA( 59, "Pa", "Pa" ),
    /**
     * The '<em><b>CPerm2</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Surface charge density, coulombs per square metre.
     * <!-- end-model-doc -->
     * @see #CPERM2_VALUE
     * @generated
     * @ordered
     */
    CPERM2( 60, "CPerm2", "CPerm2" ),
    /**
     * The '<em><b>CPerm3</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Electric charge density, coulombs per cubic metre.
     * <!-- end-model-doc -->
     * @see #CPERM3_VALUE
     * @generated
     * @ordered
     */
    CPERM3( 61, "CPerm3", "CPerm3" ),
    /**
     * The '<em><b>Qh</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Quantity energy, Qh.
     * <!-- end-model-doc -->
     * @see #QH_VALUE
     * @generated
     * @ordered
     */
    QH( 62, "Qh", "Qh" ),
    /**
     * The '<em><b>One Per Hz</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reciprocal of frequency (1/Hz).
     * <!-- end-model-doc -->
     * @see #ONE_PER_HZ_VALUE
     * @generated
     * @ordered
     */
    ONE_PER_HZ( 63, "onePerHz", "onePerHz" ),
    /**
     * The '<em><b>Deg</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Plane angle in degrees.
     * <!-- end-model-doc -->
     * @see #DEG_VALUE
     * @generated
     * @ordered
     */
    DEG( 64, "deg", "deg" ),
    /**
     * The '<em><b>Bar</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Pressure in bars, (1 bar = 100 kPa).
     * <!-- end-model-doc -->
     * @see #BAR_VALUE
     * @generated
     * @ordered
     */
    BAR( 65, "bar", "bar" ),
    /**
     * The '<em><b>Ohm</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Electric resistance in ohms (V/A).
     * <!-- end-model-doc -->
     * @see #OHM_VALUE
     * @generated
     * @ordered
     */
    OHM( 66, "ohm", "ohm" ),
    /**
     * The '<em><b>None</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Dimension less quantity, e.g. count, per unit, etc.
     * <!-- end-model-doc -->
     * @see #NONE_VALUE
     * @generated
     * @ordered
     */
    NONE( 67, "none", "none" ),
    /**
     * The '<em><b>WPers</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Ramp rate in watts per second.
     * <!-- end-model-doc -->
     * @see #WPERS_VALUE
     * @generated
     * @ordered
     */
    WPERS( 68, "WPers", "WPers" ),
    /**
     * The '<em><b>Kat</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Catalytic activity, katal = mol / s.
     * <!-- end-model-doc -->
     * @see #KAT_VALUE
     * @generated
     * @ordered
     */
    KAT( 69, "kat", "kat" ),
    /**
     * The '<em><b>Mol Permol</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Concentration, Molar fraction, the ratio of the molar amount of a solute divided by the molar amount of the solution.
     * <!-- end-model-doc -->
     * @see #MOL_PERMOL_VALUE
     * @generated
     * @ordered
     */
    MOL_PERMOL( 70, "molPermol", "molPermol" ),
    /**
     * The '<em><b>Sv</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Dose equivalent in sieverts (J/kg).
     * <!-- end-model-doc -->
     * @see #SV_VALUE
     * @generated
     * @ordered
     */
    SV( 71, "Sv", "Sv" ),
    /**
     * The '<em><b>VA</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Apparent power in volt amperes. See also real power and reactive power.
     * <!-- end-model-doc -->
     * @see #VA_VALUE
     * @generated
     * @ordered
     */
    VA( 72, "VA", "VA" ),
    /**
     * The '<em><b>V2</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Volt squared (W²/A²).
     * <!-- end-model-doc -->
     * @see #V2_VALUE
     * @generated
     * @ordered
     */
    V2( 73, "V2", "V2" ),
    /**
     * The '<em><b>Vh</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Volt-hour, Volt hours.
     * <!-- end-model-doc -->
     * @see #VH_VALUE
     * @generated
     * @ordered
     */
    VH( 74, "Vh", "Vh" ),
    /**
     * The '<em><b>VPer V</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Voltage, ratio of voltages.  Note: Users may need to supply a prefix such as ‘m’ to show rates such as ‘mV/V’.
     * <!-- end-model-doc -->
     * @see #VPER_V_VALUE
     * @generated
     * @ordered
     */
    VPER_V( 75, "VPerV", "VPerV" ),
    /**
     * The '<em><b>Wh</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Real energy in watt hours.
     * <!-- end-model-doc -->
     * @see #WH_VALUE
     * @generated
     * @ordered
     */
    WH( 76, "Wh", "Wh" ),
    /**
     * The '<em><b>Wb</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Magnetic flux in webers (V·s).
     * <!-- end-model-doc -->
     * @see #WB_VALUE
     * @generated
     * @ordered
     */
    WB( 77, "Wb", "Wb" ),
    /**
     * The '<em><b>JPermol K</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Molar entropy, molar heat capacity, joules per mole kelvin.
     * <!-- end-model-doc -->
     * @see #JPERMOL_K_VALUE
     * @generated
     * @ordered
     */
    JPERMOL_K( 78, "JPermolK", "JPermolK" ),
    /**
     * The '<em><b>Vs</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Volt seconds (Ws/A).
     * <!-- end-model-doc -->
     * @see #VS_VALUE
     * @generated
     * @ordered
     */
    VS( 79, "Vs", "Vs" ),
    /**
     * The '<em><b>One Perm</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Wavenumber, reciprocal metres,  (1/m).
     * <!-- end-model-doc -->
     * @see #ONE_PERM_VALUE
     * @generated
     * @ordered
     */
    ONE_PERM( 80, "onePerm", "onePerm" ),
    /**
     * The '<em><b>WPer W</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Signal Strength, ratio of power.   Note: Users may need to supply a prefix such as ‘m’ to show rates such as ‘mW/W’.
     * <!-- end-model-doc -->
     * @see #WPER_W_VALUE
     * @generated
     * @ordered
     */
    WPER_W( 81, "WPerW", "WPerW" ),
    /**
     * The '<em><b>WPer A</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Active power per current flow, watts per Ampere.
     * <!-- end-model-doc -->
     * @see #WPER_A_VALUE
     * @generated
     * @ordered
     */
    WPER_A( 82, "WPerA", "WPerA" ),
    /**
     * The '<em><b>Ft3</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Volume, cubic feet.
     * <!-- end-model-doc -->
     * @see #FT3_VALUE
     * @generated
     * @ordered
     */
    FT3( 83, "ft3", "ft3" ),
    /**
     * The '<em><b>Gal</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Volume in gallons, US gallon (1 gal = 231 in3 = 128 fl ounce).
     * <!-- end-model-doc -->
     * @see #GAL_VALUE
     * @generated
     * @ordered
     */
    GAL( 84, "gal", "gal" ),
    /**
     * The '<em><b>FPerm</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Permittivity, farads per metre.
     * <!-- end-model-doc -->
     * @see #FPERM_VALUE
     * @generated
     * @ordered
     */
    FPERM( 85, "FPerm", "FPerm" ),
    /**
     * The '<em><b>Therm</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Energy, therms.
     * <!-- end-model-doc -->
     * @see #THERM_VALUE
     * @generated
     * @ordered
     */
    THERM( 86, "therm", "therm" ),
    /**
     * The '<em><b>Kgm</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Moment of mass in kilogram metres (kg·m) (first moment of mass). Note: multiplier “k” is included in this unit symbol for compatibility with IEC 61850-7-3.
     * <!-- end-model-doc -->
     * @see #KGM_VALUE
     * @generated
     * @ordered
     */
    KGM( 87, "kgm", "kgm" ),
    /**
     * The '<em><b>VPerm</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Electric field strength, volts per metre.
     * <!-- end-model-doc -->
     * @see #VPERM_VALUE
     * @generated
     * @ordered
     */
    VPERM( 88, "VPerm", "VPerm" ),
    /**
     * The '<em><b>A2</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Amperes squared (A²).
     * <!-- end-model-doc -->
     * @see #A2_VALUE
     * @generated
     * @ordered
     */
    A2( 89, "A2", "A2" ),
    /**
     * The '<em><b>Min</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time in minutes, minute  = 60 s.
     * <!-- end-model-doc -->
     * @see #MIN_VALUE
     * @generated
     * @ordered
     */
    MIN( 90, "min", "min" ),
    /**
     * The '<em><b>Mm Hg</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Pressure, millimetres of mercury (1 mmHg is approximately 133.3 Pa).
     * <!-- end-model-doc -->
     * @see #MM_HG_VALUE
     * @generated
     * @ordered
     */
    MM_HG( 91, "mmHg", "mmHg" ),
    /**
     * The '<em><b>VPer Hz</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Magnetic flux in volt per hertz.
     * <!-- end-model-doc -->
     * @see #VPER_HZ_VALUE
     * @generated
     * @ordered
     */
    VPER_HZ( 92, "VPerHz", "VPerHz" ),
    /**
     * The '<em><b>Btu</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Energy, British Thermal Units.
     * <!-- end-model-doc -->
     * @see #BTU_VALUE
     * @generated
     * @ordered
     */
    BTU( 93, "Btu", "Btu" ),
    /**
     * The '<em><b>As</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Ampere seconds (A·s).
     * <!-- end-model-doc -->
     * @see #AS_VALUE
     * @generated
     * @ordered
     */
    AS( 94, "As", "As" ),
    /**
     * The '<em><b>Ah</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Ampere-hours, ampere-hours.
     * <!-- end-model-doc -->
     * @see #AH_VALUE
     * @generated
     * @ordered
     */
    AH( 95, "Ah", "Ah" ),
    /**
     * The '<em><b>Bq</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Radioactivity in becquerels (1/s).
     * <!-- end-model-doc -->
     * @see #BQ_VALUE
     * @generated
     * @ordered
     */
    BQ( 96, "Bq", "Bq" ),
    /**
     * The '<em><b>SPerm</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Conductance per length (F/m).
     * <!-- end-model-doc -->
     * @see #SPERM_VALUE
     * @generated
     * @ordered
     */
    SPERM( 97, "SPerm", "SPerm" ),
    /**
     * The '<em><b>M2 Pers</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Viscosity in square metres / second (m²/s).
     * <!-- end-model-doc -->
     * @see #M2_PERS_VALUE
     * @generated
     * @ordered
     */
    M2_PERS( 98, "m2Pers", "m2Pers" ),
    /**
     * The '<em><b>DBm</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Power level (logarithmic ratio of signal strength , Bel-mW), normalized to 1mW. Note:  multiplier “d” is included in this unit symbol for compatibility with IEC 61850-7-3.
     * <!-- end-model-doc -->
     * @see #DBM_VALUE
     * @generated
     * @ordered
     */
    DBM( 99, "dBm", "dBm" ),
    /**
     * The '<em><b>HPerm</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Permeability, henrys per metre.
     * <!-- end-model-doc -->
     * @see #HPERM_VALUE
     * @generated
     * @ordered
     */
    HPERM( 100, "HPerm", "HPerm" ),
    /**
     * The '<em><b>JPermol</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Molar energy, joules per mole.
     * <!-- end-model-doc -->
     * @see #JPERMOL_VALUE
     * @generated
     * @ordered
     */
    JPERMOL( 101, "JPermol", "JPermol" ),
    /**
     * The '<em><b>Deg C</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Relative temperature in degrees Celsius.
     * In the SI unit system the symbol is °C. Electric charge is measured in coulomb that has the unit symbol C. To distinguish degree Celsius from coulomb the symbol used in the UML is degC. The reason for not using °C is that the special character ° is difficult to manage in software.
     * <!-- end-model-doc -->
     * @see #DEG_C_VALUE
     * @generated
     * @ordered
     */
    DEG_C( 102, "degC", "degC" ),
    /**
     * The '<em><b>Pa Pers</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Pressure change rate in pascals per second.
     * <!-- end-model-doc -->
     * @see #PA_PERS_VALUE
     * @generated
     * @ordered
     */
    PA_PERS( 103, "PaPers", "PaPers" ),
    /**
     * The '<em><b>Anglemin</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Plane angle, minutes.
     * <!-- end-model-doc -->
     * @see #ANGLEMIN_VALUE
     * @generated
     * @ordered
     */
    ANGLEMIN( 104, "anglemin", "anglemin" ),
    /**
     * The '<em><b>M3 Compensated</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Volume, cubic metres, with the value compensated for weather effects.
     * <!-- end-model-doc -->
     * @see #M3_COMPENSATED_VALUE
     * @generated
     * @ordered
     */
    M3_COMPENSATED( 105, "m3Compensated", "m3Compensated" ),
    /**
     * The '<em><b>JPerkg K</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Specific heat capacity, specific entropy, joules per kilogram Kelvin.
     * <!-- end-model-doc -->
     * @see #JPERKG_K_VALUE
     * @generated
     * @ordered
     */
    JPERKG_K( 106, "JPerkgK", "JPerkgK" ),
    /**
     * The '<em><b>Gy</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Absorbed dose in grays (J/kg).
     * <!-- end-model-doc -->
     * @see #GY_VALUE
     * @generated
     * @ordered
     */
    GY( 107, "Gy", "Gy" ),
    /**
     * The '<em><b>Mol Perm3</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Concentration, The amount of substance concentration, (c), the amount of solvent in moles divided by the volume of solution in m³.
     * <!-- end-model-doc -->
     * @see #MOL_PERM3_VALUE
     * @generated
     * @ordered
     */
    MOL_PERM3( 108, "molPerm3", "molPerm3" ),
    /**
     * The '<em><b>Mol Perkg</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Concentration, Molality, the amount of solute in moles and the amount of solvent in kilograms.
     * <!-- end-model-doc -->
     * @see #MOL_PERKG_VALUE
     * @generated
     * @ordered
     */
    MOL_PERKG( 109, "molPerkg", "molPerkg" ),
    /**
     * The '<em><b>Rad Pers</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Angular velocity in radians per second (rad/s).
     * <!-- end-model-doc -->
     * @see #RAD_PERS_VALUE
     * @generated
     * @ordered
     */
    RAD_PERS( 110, "radPers", "radPers" ),
    /**
     * The '<em><b>Hz</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Frequency in hertz (1/s).
     * <!-- end-model-doc -->
     * @see #HZ_VALUE
     * @generated
     * @ordered
     */
    HZ( 111, "Hz", "Hz" ),
    /**
     * The '<em><b>M3 Perh</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Volumetric flow rate, cubic metres per hour.
     * <!-- end-model-doc -->
     * @see #M3_PERH_VALUE
     * @generated
     * @ordered
     */
    M3_PERH( 112, "m3Perh", "m3Perh" ),
    /**
     * The '<em><b>Mol</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Amount of substance in moles.
     * <!-- end-model-doc -->
     * @see #MOL_VALUE
     * @generated
     * @ordered
     */
    MOL( 113, "mol", "mol" ),
    /**
     * The '<em><b>Ohm Perm</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Electric resistance per length in ohms per metre ((V/A)/m).
     * <!-- end-model-doc -->
     * @see #OHM_PERM_VALUE
     * @generated
     * @ordered
     */
    OHM_PERM( 114, "ohmPerm", "ohmPerm" ),
    /**
     * The '<em><b>M3 Pers</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Volumetric flow rate in cubic metres per second (m³/s).
     * <!-- end-model-doc -->
     * @see #M3_PERS_VALUE
     * @generated
     * @ordered
     */
    M3_PERS( 115, "m3Pers", "m3Pers" ),
    /**
     * The '<em><b>Rad Pers2</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Angular acceleration, radians per second squared.
     * <!-- end-model-doc -->
     * @see #RAD_PERS2_VALUE
     * @generated
     * @ordered
     */
    RAD_PERS2( 116, "radPers2", "radPers2" ),
    /**
     * The '<em><b>JPers</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Energy rate in joules per second (J/s).
     * <!-- end-model-doc -->
     * @see #JPERS_VALUE
     * @generated
     * @ordered
     */
    JPERS( 117, "JPers", "JPers" ),
    /**
     * The '<em><b>Kg</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Mass in kilograms.  Note: multiplier “k” is included in this unit symbol for compatibility with IEC 61850-7-3.
     * <!-- end-model-doc -->
     * @see #KG_VALUE
     * @generated
     * @ordered
     */
    KG( 118, "kg", "kg" ),
    /**
     * The '<em><b>M3</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Volume in cubic metres (m³).
     * <!-- end-model-doc -->
     * @see #M3_VALUE
     * @generated
     * @ordered
     */
    M3( 119, "m3", "m3" ),
    /**
     * The '<em><b>M2</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Area in square metres (m²).
     * <!-- end-model-doc -->
     * @see #M2_VALUE
     * @generated
     * @ordered
     */
    M2( 120, "m2", "m2" ),
    /**
     * The '<em><b>Kn</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Speed, knots (1 kn = 1852/3600) m/s.
     * <!-- end-model-doc -->
     * @see #KN_VALUE
     * @generated
     * @ordered
     */
    KN( 121, "kn", "kn" ),
    /**
     * The '<em><b>Pas</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Dynamic viscosity, pascal seconds.
     * <!-- end-model-doc -->
     * @see #PAS_VALUE
     * @generated
     * @ordered
     */
    PAS( 122, "Pas", "Pas" ),
    /**
     * The '<em><b>Lx</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Illuminance in lux (lm/m²).
     * <!-- end-model-doc -->
     * @see #LX_VALUE
     * @generated
     * @ordered
     */
    LX( 123, "lx", "lx" ),
    /**
     * The '<em><b>JPer K</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Heat capacity in joules/kelvin.
     * <!-- end-model-doc -->
     * @see #JPER_K_VALUE
     * @generated
     * @ordered
     */
    JPER_K( 124, "JPerK", "JPerK" ),
    /**
     * The '<em><b>Lm</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Luminous flux in lumens (cd·sr).
     * <!-- end-model-doc -->
     * @see #LM_VALUE
     * @generated
     * @ordered
     */
    LM( 125, "lm", "lm" ),
    /**
     * The '<em><b>Char Pers</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Data rate (baud) in characters per second.
     * <!-- end-model-doc -->
     * @see #CHAR_PERS_VALUE
     * @generated
     * @ordered
     */
    CHAR_PERS( 126, "charPers", "charPers" ),
    /**
     * The '<em><b>Rev</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Amount of rotation, revolutions.
     * <!-- end-model-doc -->
     * @see #REV_VALUE
     * @generated
     * @ordered
     */
    REV( 127, "rev", "rev" ),
    /**
     * The '<em><b>M3 Perkg</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Specific volume, cubic metres per kilogram, v.
     * <!-- end-model-doc -->
     * @see #M3_PERKG_VALUE
     * @generated
     * @ordered
     */
    M3_PERKG( 128, "m3Perkg", "m3Perkg" ),
    /**
     * The '<em><b>Rad</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Plane angle in radians (m/m).
     * <!-- end-model-doc -->
     * @see #RAD_VALUE
     * @generated
     * @ordered
     */
    RAD( 129, "rad", "rad" ),
    /**
     * The '<em><b>Sr</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Solid angle in steradians (m2/m2).
     * <!-- end-model-doc -->
     * @see #SR_VALUE
     * @generated
     * @ordered
     */
    SR( 130, "sr", "sr" ),
    /**
     * The '<em><b>Kg Perm3</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Density in kilogram/cubic metres (kg/m³). Note: multiplier “k” is included in this unit symbol for compatibility with IEC 61850-7-3.
     * <!-- end-model-doc -->
     * @see #KG_PERM3_VALUE
     * @generated
     * @ordered
     */
    KG_PERM3( 131, "kgPerm3", "kgPerm3" ),
    /**
     * The '<em><b>Hz Pers</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Rate of change of frequency in hertz per second.
     * <!-- end-model-doc -->
     * @see #HZ_PERS_VALUE
     * @generated
     * @ordered
     */
    HZ_PERS( 132, "HzPers", "HzPers" ),
    /**
     * The '<em><b>VPer VAr</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Power factor, PF, the ratio of the active power to the apparent power. Note: The sign convention used for power factor will differ between IEC meters and EEI (ANSI) meters. It is assumed that the data consumers understand the type of meter being used and agree on the sign convention in use at any given utility.
     * <!-- end-model-doc -->
     * @see #VPER_VAR_VALUE
     * @generated
     * @ordered
     */
    VPER_VAR( 133, "VPerVAr", "VPerVAr" ),
    /**
     * The '<em><b>SPers</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time, Ratio of time.  Note: Users may need to supply a prefix such as ‘&#181;’ to show rates such as ‘&#181;s/s’.
     * <!-- end-model-doc -->
     * @see #SPERS_VALUE
     * @generated
     * @ordered
     */
    SPERS( 134, "sPers", "sPers" ),
    /**
     * The '<em><b>Anglesec</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Plane angle, seconds.
     * <!-- end-model-doc -->
     * @see #ANGLESEC_VALUE
     * @generated
     * @ordered
     */
    ANGLESEC( 135, "anglesec", "anglesec" ),
    /**
     * The '<em><b>Kgm2</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Moment of mass in kilogram square metres (kg·m²) (Second moment of mass, commonly called the moment of inertia). Note: multiplier “k” is included in this unit symbol for compatibility with IEC 61850-7-3.
     * <!-- end-model-doc -->
     * @see #KGM2_VALUE
     * @generated
     * @ordered
     */
    KGM2( 136, "kgm2", "kgm2" ),
    /**
     * The '<em><b>Tonne</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Mass in tons, “tonne” or “metric  ton” (1000 kg = 1 Mg).
     * <!-- end-model-doc -->
     * @see #TONNE_VALUE
     * @generated
     * @ordered
     */
    TONNE( 137, "tonne", "tonne" ),
    /**
     * The '<em><b>Rot Pers</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Rotations per second (1/s). See also Hz (1/s).
     * <!-- end-model-doc -->
     * @see #ROT_PERS_VALUE
     * @generated
     * @ordered
     */
    ROT_PERS( 138, "rotPers", "rotPers" ),
    /**
     * The '<em><b>NPerm</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Surface tension, newton per metre.
     * <!-- end-model-doc -->
     * @see #NPERM_VALUE
     * @generated
     * @ordered
     */
    NPERM( 139, "NPerm", "NPerm" ),
    /**
     * The '<em><b>V2h</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Volt-squared hour, volt-squared-hours.
     * <!-- end-model-doc -->
     * @see #V2H_VALUE
     * @generated
     * @ordered
     */
    V2H( 140, "V2h", "V2h" ),
    /**
     * The '<em><b>Character</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Number of characters.
     * <!-- end-model-doc -->
     * @see #CHARACTER_VALUE
     * @generated
     * @ordered
     */
    CHARACTER( 141, "character", "character" );

    /**
     * The '<em><b>WPerm K</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Thermal conductivity in watt/metres kelvin.
     * <!-- end-model-doc -->
     * @see #WPERM_K
     * @model name="WPermK"
     * @generated
     * @ordered
     */
    public static final int WPERM_K_VALUE = 1;

    /**
     * The '<em><b>MPerm3</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Fuel efficiency in metres per cubic metres (m/m³).
     * <!-- end-model-doc -->
     * @see #MPERM3
     * @model name="mPerm3"
     * @generated
     * @ordered
     */
    public static final int MPERM3_VALUE = 2;

    /**
     * The '<em><b>A2s</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Ampere squared time in square amperes (A²s).
     * <!-- end-model-doc -->
     * @see #A2S
     * @model name="A2s"
     * @generated
     * @ordered
     */
    public static final int A2S_VALUE = 3;

    /**
     * The '<em><b>A2h</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Ampere-squared hour, ampere-squared hour.
     * <!-- end-model-doc -->
     * @see #A2H
     * @model name="A2h"
     * @generated
     * @ordered
     */
    public static final int A2H_VALUE = 4;

    /**
     * The '<em><b>WPerm2</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Heat flux density, irradiance, watts per square metre.
     * <!-- end-model-doc -->
     * @see #WPERM2
     * @model name="WPerm2"
     * @generated
     * @ordered
     */
    public static final int WPERM2_VALUE = 5;

    /**
     * The '<em><b>V</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Electric potential in volts (W/A).
     * <!-- end-model-doc -->
     * @see #V
     * @model
     * @generated
     * @ordered
     */
    public static final int V_VALUE = 6;

    /**
     * The '<em><b>W</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Real power in watts (J/s). Electrical power may have real and reactive components. The real portion of electrical power (I&#178;R or VIcos(phi)), is expressed in Watts. See also apparent power and reactive power.
     * <!-- end-model-doc -->
     * @see #W
     * @model
     * @generated
     * @ordered
     */
    public static final int W_VALUE = 7;

    /**
     * The '<em><b>Ppm</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Concentration in parts per million.
     * <!-- end-model-doc -->
     * @see #PPM
     * @model name="ppm"
     * @generated
     * @ordered
     */
    public static final int PPM_VALUE = 8;

    /**
     * The '<em><b>D</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time in days, day = 24 h = 86400 s.
     * <!-- end-model-doc -->
     * @see #D
     * @model name="d"
     * @generated
     * @ordered
     */
    public static final int D_VALUE = 9;

    /**
     * The '<em><b>Mile</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Length, nautical miles (1 M = 1852 m).
     * <!-- end-model-doc -->
     * @see #MILE
     * @model name="Mile" literal="M"
     * @generated
     * @ordered
     */
    public static final int MILE_VALUE = 10;

    /**
     * The '<em><b>J</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Energy in joules (N·m = C·V = W·s).
     * <!-- end-model-doc -->
     * @see #J
     * @model
     * @generated
     * @ordered
     */
    public static final int J_VALUE = 11;

    /**
     * The '<em><b>K</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Temperature in kelvins.
     * <!-- end-model-doc -->
     * @see #K
     * @model
     * @generated
     * @ordered
     */
    public static final int K_VALUE = 12;

    /**
     * The '<em><b>Hour</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Electric inductance in henrys (Wb/A).
     * <!-- end-model-doc -->
     * @see #HOUR
     * @model name="Hour" literal="H"
     * @generated
     * @ordered
     */
    public static final int HOUR_VALUE = 13;

    /**
     * The '<em><b>F</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Electric capacitance in farads (C/V).
     * <!-- end-model-doc -->
     * @see #F
     * @model
     * @generated
     * @ordered
     */
    public static final int F_VALUE = 14;

    /**
     * The '<em><b>G</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Magnetic flux density, gausses (1 G = 10-4 T).
     * <!-- end-model-doc -->
     * @see #G
     * @model
     * @generated
     * @ordered
     */
    public static final int G_VALUE = 15;

    /**
     * The '<em><b>T</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Magnetic flux density in teslas (Wb/m2).
     * <!-- end-model-doc -->
     * @see #T
     * @model
     * @generated
     * @ordered
     */
    public static final int T_VALUE = 16;

    /**
     * The '<em><b>Siemens</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Conductance in siemens.
     * <!-- end-model-doc -->
     * @see #SIEMENS
     * @model name="Siemens" literal="S"
     * @generated
     * @ordered
     */
    public static final int SIEMENS_VALUE = 17;

    /**
     * The '<em><b>Q</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Quantity power, Q.
     * <!-- end-model-doc -->
     * @see #Q
     * @model
     * @generated
     * @ordered
     */
    public static final int Q_VALUE = 18;

    /**
     * The '<em><b>N</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Force in newtons (kg·m/s²).
     * <!-- end-model-doc -->
     * @see #N
     * @model
     * @generated
     * @ordered
     */
    public static final int N_VALUE = 19;

    /**
     * The '<em><b>C</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Electric charge in coulombs (A·s).
     * <!-- end-model-doc -->
     * @see #C
     * @model
     * @generated
     * @ordered
     */
    public static final int C_VALUE = 20;

    /**
     * The '<em><b>A</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Current in amperes.
     * <!-- end-model-doc -->
     * @see #A
     * @model
     * @generated
     * @ordered
     */
    public static final int A_VALUE = 21;

    /**
     * The '<em><b>WPerm2sr</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Radiance, watts per square metre steradian.
     * <!-- end-model-doc -->
     * @see #WPERM2SR
     * @model name="WPerm2sr"
     * @generated
     * @ordered
     */
    public static final int WPERM2SR_VALUE = 22;

    /**
     * The '<em><b>VArh</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reactive energy in volt ampere reactive hours.
     * <!-- end-model-doc -->
     * @see #VARH
     * @model name="VArh"
     * @generated
     * @ordered
     */
    public static final int VARH_VALUE = 23;

    /**
     * The '<em><b>LPerl</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Concentration, The ratio of the volume of a solute divided by the volume of  the solution. Note: Users may need use a prefix such a ‘µ’ to express a quantity such as ‘µL/L’.
     * <!-- end-model-doc -->
     * @see #LPERL
     * @model name="lPerl"
     * @generated
     * @ordered
     */
    public static final int LPERL_VALUE = 24;

    /**
     * The '<em><b>LPerh</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Volumetric flow rate, litres per hour.
     * <!-- end-model-doc -->
     * @see #LPERH
     * @model name="lPerh"
     * @generated
     * @ordered
     */
    public static final int LPERH_VALUE = 25;

    /**
     * The '<em><b>LPers</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Volumetric flow rate in litres per second.
     * <!-- end-model-doc -->
     * @see #LPERS
     * @model name="lPers"
     * @generated
     * @ordered
     */
    public static final int LPERS_VALUE = 26;

    /**
     * The '<em><b>M3 Uncompensated</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Volume, cubic metres, with the value uncompensated for weather effects.
     * <!-- end-model-doc -->
     * @see #M3_UNCOMPENSATED
     * @model name="m3Uncompensated"
     * @generated
     * @ordered
     */
    public static final int M3_UNCOMPENSATED_VALUE = 27;

    /**
     * The '<em><b>Gy Pers</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Absorbed dose rate, grays per second.
     * <!-- end-model-doc -->
     * @see #GY_PERS
     * @model name="GyPers"
     * @generated
     * @ordered
     */
    public static final int GY_PERS_VALUE = 28;

    /**
     * The '<em><b>Cos Phi</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Power factor, dimensionless.
     * Note 1: This definition of power factor only holds for balanced systems. See the alternative definition under code 153.
     * Note 2 : Beware of differing sign conventions in use between the IEC and EEI. It is assumed that the data consumer understands the type of meter in use and the sign convention in use by the utility.
     * <!-- end-model-doc -->
     * @see #COS_PHI
     * @model name="cosPhi"
     * @generated
     * @ordered
     */
    public static final int COS_PHI_VALUE = 29;

    /**
     * The '<em><b>Cd</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Luminous intensity in candelas.
     * <!-- end-model-doc -->
     * @see #CD
     * @model name="cd"
     * @generated
     * @ordered
     */
    public static final int CD_VALUE = 30;

    /**
     * The '<em><b>DB</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Sound pressure level in decibels. Note:  multiplier “d” is included in this unit symbol for compatibility with IEC 61850-7-3.
     * <!-- end-model-doc -->
     * @see #DB
     * @model name="dB"
     * @generated
     * @ordered
     */
    public static final int DB_VALUE = 31;

    /**
     * The '<em><b>Ohmm</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Resistivity, ohm metres, (rho).
     * <!-- end-model-doc -->
     * @see #OHMM
     * @model name="ohmm"
     * @generated
     * @ordered
     */
    public static final int OHMM_VALUE = 32;

    /**
     * The '<em><b>APerm</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A/m, magnetic field strength, amperes per metre.
     * <!-- end-model-doc -->
     * @see #APERM
     * @model name="APerm"
     * @generated
     * @ordered
     */
    public static final int APERM_VALUE = 33;

    /**
     * The '<em><b>WPersr</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Radiant intensity, watts per steradian.
     * <!-- end-model-doc -->
     * @see #WPERSR
     * @model name="WPersr"
     * @generated
     * @ordered
     */
    public static final int WPERSR_VALUE = 34;

    /**
     * The '<em><b>Kat Perm3</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Catalytic activity concentration, katals per cubic metre.
     * <!-- end-model-doc -->
     * @see #KAT_PERM3
     * @model name="katPerm3"
     * @generated
     * @ordered
     */
    public static final int KAT_PERM3_VALUE = 35;

    /**
     * The '<em><b>APer A</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Current, ratio of amperages.   Note: Users may need to supply a prefix such as ‘m’ to show rates such as ‘mA/A’.
     * <!-- end-model-doc -->
     * @see #APER_A
     * @model name="APerA"
     * @generated
     * @ordered
     */
    public static final int APER_A_VALUE = 36;

    /**
     * The '<em><b>MPers2</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Acceleration in metres per second squared (m/s²).
     * <!-- end-model-doc -->
     * @see #MPERS2
     * @model name="mPers2"
     * @generated
     * @ordered
     */
    public static final int MPERS2_VALUE = 37;

    /**
     * The '<em><b>KPers</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Temperature change rate in kelvins per second.
     * <!-- end-model-doc -->
     * @see #KPERS
     * @model name="KPers"
     * @generated
     * @ordered
     */
    public static final int KPERS_VALUE = 38;

    /**
     * The '<em><b>MPers</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Velocity in metres per second (m/s).
     * <!-- end-model-doc -->
     * @see #MPERS
     * @model name="mPers"
     * @generated
     * @ordered
     */
    public static final int MPERS_VALUE = 39;

    /**
     * The '<em><b>VAh</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Apparent energy in volt ampere hours.
     * <!-- end-model-doc -->
     * @see #VAH
     * @model name="VAh"
     * @generated
     * @ordered
     */
    public static final int VAH_VALUE = 40;

    /**
     * The '<em><b>Ha</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Area, hectares.
     * <!-- end-model-doc -->
     * @see #HA
     * @model name="ha"
     * @generated
     * @ordered
     */
    public static final int HA_VALUE = 41;

    /**
     * The '<em><b>L</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Volume in litres, litre = dm3 = m3/1000.
     * <!-- end-model-doc -->
     * @see #L
     * @model name="l"
     * @generated
     * @ordered
     */
    public static final int L_VALUE = 42;

    /**
     * The '<em><b>Meter</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Length in metres.
     * <!-- end-model-doc -->
     * @see #METER
     * @model name="meter" literal="m"
     * @generated
     * @ordered
     */
    public static final int METER_VALUE = 43;

    /**
     * The '<em><b>Henry</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time in hours, hour = 60 min = 3600 s.
     * <!-- end-model-doc -->
     * @see #HENRY
     * @model name="henry" literal="h"
     * @generated
     * @ordered
     */
    public static final int HENRY_VALUE = 44;

    /**
     * The '<em><b>Second</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time in seconds.
     * <!-- end-model-doc -->
     * @see #SECOND
     * @model name="second" literal="s"
     * @generated
     * @ordered
     */
    public static final int SECOND_VALUE = 45;

    /**
     * The '<em><b>Count</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Amount of substance, Counter value.
     * <!-- end-model-doc -->
     * @see #COUNT
     * @model name="count"
     * @generated
     * @ordered
     */
    public static final int COUNT_VALUE = 46;

    /**
     * The '<em><b>Kg Per J</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Weight per energy in kilograms per joule (kg/J). Note: multiplier “k” is included in this unit symbol for compatibility with IEC 61850-7-3.
     * <!-- end-model-doc -->
     * @see #KG_PER_J
     * @model name="kgPerJ"
     * @generated
     * @ordered
     */
    public static final int KG_PER_J_VALUE = 47;

    /**
     * The '<em><b>VAr</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reactive power in volt amperes reactive. The “reactive” or “imaginary” component of electrical power (VIsin(phi)). (See also real power and apparent power).
     * Note: Different meter designs use different methods to arrive at their results. Some meters may compute reactive power as an arithmetic value, while others compute the value vectorially. The data consumer should determine the method in use and the suitability of the measurement for the intended purpose.
     * <!-- end-model-doc -->
     * @see #VAR
     * @model name="VAr"
     * @generated
     * @ordered
     */
    public static final int VAR_VALUE = 48;

    /**
     * The '<em><b>GPerg</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Concentration, The ratio of the mass of a solute divided by the mass of  the solution. Note: Users may need use a prefix such a ‘µ’ to express a quantity such as ‘µg/g’.
     * <!-- end-model-doc -->
     * @see #GPERG
     * @model name="gPerg"
     * @generated
     * @ordered
     */
    public static final int GPERG_VALUE = 49;

    /**
     * The '<em><b>JPerkg</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Specific energy, Joules / kg.
     * <!-- end-model-doc -->
     * @see #JPERKG
     * @model name="JPerkg"
     * @generated
     * @ordered
     */
    public static final int JPERKG_VALUE = 50;

    /**
     * The '<em><b>JPerm2</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Insulation energy density, joules per square metre or watt second per square metre.
     * <!-- end-model-doc -->
     * @see #JPERM2
     * @model name="JPerm2"
     * @generated
     * @ordered
     */
    public static final int JPERM2_VALUE = 51;

    /**
     * The '<em><b>JPerm3</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Energy density, joules per cubic metre.
     * <!-- end-model-doc -->
     * @see #JPERM3
     * @model name="JPerm3"
     * @generated
     * @ordered
     */
    public static final int JPERM3_VALUE = 52;

    /**
     * The '<em><b>VPer VA</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Power factor, PF, the ratio of the active power to the apparent power.  Note: The sign convention used for power factor will differ between IEC meters and EEI (ANSI) meters. It is assumed that the data consumers understand the type of meter being used and agree on the sign convention in use at any given utility.
     * <!-- end-model-doc -->
     * @see #VPER_VA
     * @model name="VPerVA"
     * @generated
     * @ordered
     */
    public static final int VPER_VA_VALUE = 53;

    /**
     * The '<em><b>Hz Per Hz</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Frequency, rate of frequency change.   Note: Users may need to supply a prefix such as ‘m’ to show rates such as ‘mHz/Hz’.
     * <!-- end-model-doc -->
     * @see #HZ_PER_HZ
     * @model name="HzPerHz"
     * @generated
     * @ordered
     */
    public static final int HZ_PER_HZ_VALUE = 54;

    /**
     * The '<em><b>Mx</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Magnetic flux, maxwells (1 Mx = 10-8 Wb).
     * <!-- end-model-doc -->
     * @see #MX
     * @model name="Mx"
     * @generated
     * @ordered
     */
    public static final int MX_VALUE = 55;

    /**
     * The '<em><b>Oe</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Magnetic field in oersteds, (1 Oe = (103/4p) A/m).
     * <!-- end-model-doc -->
     * @see #OE
     * @model name="Oe"
     * @generated
     * @ordered
     */
    public static final int OE_VALUE = 56;

    /**
     * The '<em><b>Nm</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Moment of force, newton metres.
     * <!-- end-model-doc -->
     * @see #NM
     * @model name="Nm"
     * @generated
     * @ordered
     */
    public static final int NM_VALUE = 57;

    /**
     * The '<em><b>CPerkg</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Exposure (x rays), coulombs per kilogram.
     * <!-- end-model-doc -->
     * @see #CPERKG
     * @model name="CPerkg"
     * @generated
     * @ordered
     */
    public static final int CPERKG_VALUE = 58;

    /**
     * The '<em><b>Pa</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Pressure in pascals (N/m²). Note: the absolute or relative measurement of pressure is implied with this entry. See below for more explicit forms.
     * <!-- end-model-doc -->
     * @see #PA
     * @model name="Pa"
     * @generated
     * @ordered
     */
    public static final int PA_VALUE = 59;

    /**
     * The '<em><b>CPerm2</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Surface charge density, coulombs per square metre.
     * <!-- end-model-doc -->
     * @see #CPERM2
     * @model name="CPerm2"
     * @generated
     * @ordered
     */
    public static final int CPERM2_VALUE = 60;

    /**
     * The '<em><b>CPerm3</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Electric charge density, coulombs per cubic metre.
     * <!-- end-model-doc -->
     * @see #CPERM3
     * @model name="CPerm3"
     * @generated
     * @ordered
     */
    public static final int CPERM3_VALUE = 61;

    /**
     * The '<em><b>Qh</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Quantity energy, Qh.
     * <!-- end-model-doc -->
     * @see #QH
     * @model name="Qh"
     * @generated
     * @ordered
     */
    public static final int QH_VALUE = 62;

    /**
     * The '<em><b>One Per Hz</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Reciprocal of frequency (1/Hz).
     * <!-- end-model-doc -->
     * @see #ONE_PER_HZ
     * @model name="onePerHz"
     * @generated
     * @ordered
     */
    public static final int ONE_PER_HZ_VALUE = 63;

    /**
     * The '<em><b>Deg</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Plane angle in degrees.
     * <!-- end-model-doc -->
     * @see #DEG
     * @model name="deg"
     * @generated
     * @ordered
     */
    public static final int DEG_VALUE = 64;

    /**
     * The '<em><b>Bar</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Pressure in bars, (1 bar = 100 kPa).
     * <!-- end-model-doc -->
     * @see #BAR
     * @model name="bar"
     * @generated
     * @ordered
     */
    public static final int BAR_VALUE = 65;

    /**
     * The '<em><b>Ohm</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Electric resistance in ohms (V/A).
     * <!-- end-model-doc -->
     * @see #OHM
     * @model name="ohm"
     * @generated
     * @ordered
     */
    public static final int OHM_VALUE = 66;

    /**
     * The '<em><b>None</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Dimension less quantity, e.g. count, per unit, etc.
     * <!-- end-model-doc -->
     * @see #NONE
     * @model name="none"
     * @generated
     * @ordered
     */
    public static final int NONE_VALUE = 67;

    /**
     * The '<em><b>WPers</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Ramp rate in watts per second.
     * <!-- end-model-doc -->
     * @see #WPERS
     * @model name="WPers"
     * @generated
     * @ordered
     */
    public static final int WPERS_VALUE = 68;

    /**
     * The '<em><b>Kat</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Catalytic activity, katal = mol / s.
     * <!-- end-model-doc -->
     * @see #KAT
     * @model name="kat"
     * @generated
     * @ordered
     */
    public static final int KAT_VALUE = 69;

    /**
     * The '<em><b>Mol Permol</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Concentration, Molar fraction, the ratio of the molar amount of a solute divided by the molar amount of the solution.
     * <!-- end-model-doc -->
     * @see #MOL_PERMOL
     * @model name="molPermol"
     * @generated
     * @ordered
     */
    public static final int MOL_PERMOL_VALUE = 70;

    /**
     * The '<em><b>Sv</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Dose equivalent in sieverts (J/kg).
     * <!-- end-model-doc -->
     * @see #SV
     * @model name="Sv"
     * @generated
     * @ordered
     */
    public static final int SV_VALUE = 71;

    /**
     * The '<em><b>VA</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Apparent power in volt amperes. See also real power and reactive power.
     * <!-- end-model-doc -->
     * @see #VA
     * @model
     * @generated
     * @ordered
     */
    public static final int VA_VALUE = 72;

    /**
     * The '<em><b>V2</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Volt squared (W²/A²).
     * <!-- end-model-doc -->
     * @see #V2
     * @model
     * @generated
     * @ordered
     */
    public static final int V2_VALUE = 73;

    /**
     * The '<em><b>Vh</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Volt-hour, Volt hours.
     * <!-- end-model-doc -->
     * @see #VH
     * @model name="Vh"
     * @generated
     * @ordered
     */
    public static final int VH_VALUE = 74;

    /**
     * The '<em><b>VPer V</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Voltage, ratio of voltages.  Note: Users may need to supply a prefix such as ‘m’ to show rates such as ‘mV/V’.
     * <!-- end-model-doc -->
     * @see #VPER_V
     * @model name="VPerV"
     * @generated
     * @ordered
     */
    public static final int VPER_V_VALUE = 75;

    /**
     * The '<em><b>Wh</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Real energy in watt hours.
     * <!-- end-model-doc -->
     * @see #WH
     * @model name="Wh"
     * @generated
     * @ordered
     */
    public static final int WH_VALUE = 76;

    /**
     * The '<em><b>Wb</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Magnetic flux in webers (V·s).
     * <!-- end-model-doc -->
     * @see #WB
     * @model name="Wb"
     * @generated
     * @ordered
     */
    public static final int WB_VALUE = 77;

    /**
     * The '<em><b>JPermol K</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Molar entropy, molar heat capacity, joules per mole kelvin.
     * <!-- end-model-doc -->
     * @see #JPERMOL_K
     * @model name="JPermolK"
     * @generated
     * @ordered
     */
    public static final int JPERMOL_K_VALUE = 78;

    /**
     * The '<em><b>Vs</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Volt seconds (Ws/A).
     * <!-- end-model-doc -->
     * @see #VS
     * @model name="Vs"
     * @generated
     * @ordered
     */
    public static final int VS_VALUE = 79;

    /**
     * The '<em><b>One Perm</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Wavenumber, reciprocal metres,  (1/m).
     * <!-- end-model-doc -->
     * @see #ONE_PERM
     * @model name="onePerm"
     * @generated
     * @ordered
     */
    public static final int ONE_PERM_VALUE = 80;

    /**
     * The '<em><b>WPer W</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Signal Strength, ratio of power.   Note: Users may need to supply a prefix such as ‘m’ to show rates such as ‘mW/W’.
     * <!-- end-model-doc -->
     * @see #WPER_W
     * @model name="WPerW"
     * @generated
     * @ordered
     */
    public static final int WPER_W_VALUE = 81;

    /**
     * The '<em><b>WPer A</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Active power per current flow, watts per Ampere.
     * <!-- end-model-doc -->
     * @see #WPER_A
     * @model name="WPerA"
     * @generated
     * @ordered
     */
    public static final int WPER_A_VALUE = 82;

    /**
     * The '<em><b>Ft3</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Volume, cubic feet.
     * <!-- end-model-doc -->
     * @see #FT3
     * @model name="ft3"
     * @generated
     * @ordered
     */
    public static final int FT3_VALUE = 83;

    /**
     * The '<em><b>Gal</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Volume in gallons, US gallon (1 gal = 231 in3 = 128 fl ounce).
     * <!-- end-model-doc -->
     * @see #GAL
     * @model name="gal"
     * @generated
     * @ordered
     */
    public static final int GAL_VALUE = 84;

    /**
     * The '<em><b>FPerm</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Permittivity, farads per metre.
     * <!-- end-model-doc -->
     * @see #FPERM
     * @model name="FPerm"
     * @generated
     * @ordered
     */
    public static final int FPERM_VALUE = 85;

    /**
     * The '<em><b>Therm</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Energy, therms.
     * <!-- end-model-doc -->
     * @see #THERM
     * @model name="therm"
     * @generated
     * @ordered
     */
    public static final int THERM_VALUE = 86;

    /**
     * The '<em><b>Kgm</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Moment of mass in kilogram metres (kg·m) (first moment of mass). Note: multiplier “k” is included in this unit symbol for compatibility with IEC 61850-7-3.
     * <!-- end-model-doc -->
     * @see #KGM
     * @model name="kgm"
     * @generated
     * @ordered
     */
    public static final int KGM_VALUE = 87;

    /**
     * The '<em><b>VPerm</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Electric field strength, volts per metre.
     * <!-- end-model-doc -->
     * @see #VPERM
     * @model name="VPerm"
     * @generated
     * @ordered
     */
    public static final int VPERM_VALUE = 88;

    /**
     * The '<em><b>A2</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Amperes squared (A²).
     * <!-- end-model-doc -->
     * @see #A2
     * @model
     * @generated
     * @ordered
     */
    public static final int A2_VALUE = 89;

    /**
     * The '<em><b>Min</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time in minutes, minute  = 60 s.
     * <!-- end-model-doc -->
     * @see #MIN
     * @model name="min"
     * @generated
     * @ordered
     */
    public static final int MIN_VALUE = 90;

    /**
     * The '<em><b>Mm Hg</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Pressure, millimetres of mercury (1 mmHg is approximately 133.3 Pa).
     * <!-- end-model-doc -->
     * @see #MM_HG
     * @model name="mmHg"
     * @generated
     * @ordered
     */
    public static final int MM_HG_VALUE = 91;

    /**
     * The '<em><b>VPer Hz</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Magnetic flux in volt per hertz.
     * <!-- end-model-doc -->
     * @see #VPER_HZ
     * @model name="VPerHz"
     * @generated
     * @ordered
     */
    public static final int VPER_HZ_VALUE = 92;

    /**
     * The '<em><b>Btu</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Energy, British Thermal Units.
     * <!-- end-model-doc -->
     * @see #BTU
     * @model name="Btu"
     * @generated
     * @ordered
     */
    public static final int BTU_VALUE = 93;

    /**
     * The '<em><b>As</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Ampere seconds (A·s).
     * <!-- end-model-doc -->
     * @see #AS
     * @model name="As"
     * @generated
     * @ordered
     */
    public static final int AS_VALUE = 94;

    /**
     * The '<em><b>Ah</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Ampere-hours, ampere-hours.
     * <!-- end-model-doc -->
     * @see #AH
     * @model name="Ah"
     * @generated
     * @ordered
     */
    public static final int AH_VALUE = 95;

    /**
     * The '<em><b>Bq</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Radioactivity in becquerels (1/s).
     * <!-- end-model-doc -->
     * @see #BQ
     * @model name="Bq"
     * @generated
     * @ordered
     */
    public static final int BQ_VALUE = 96;

    /**
     * The '<em><b>SPerm</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Conductance per length (F/m).
     * <!-- end-model-doc -->
     * @see #SPERM
     * @model name="SPerm"
     * @generated
     * @ordered
     */
    public static final int SPERM_VALUE = 97;

    /**
     * The '<em><b>M2 Pers</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Viscosity in square metres / second (m²/s).
     * <!-- end-model-doc -->
     * @see #M2_PERS
     * @model name="m2Pers"
     * @generated
     * @ordered
     */
    public static final int M2_PERS_VALUE = 98;

    /**
     * The '<em><b>DBm</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Power level (logarithmic ratio of signal strength , Bel-mW), normalized to 1mW. Note:  multiplier “d” is included in this unit symbol for compatibility with IEC 61850-7-3.
     * <!-- end-model-doc -->
     * @see #DBM
     * @model name="dBm"
     * @generated
     * @ordered
     */
    public static final int DBM_VALUE = 99;

    /**
     * The '<em><b>HPerm</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Permeability, henrys per metre.
     * <!-- end-model-doc -->
     * @see #HPERM
     * @model name="HPerm"
     * @generated
     * @ordered
     */
    public static final int HPERM_VALUE = 100;

    /**
     * The '<em><b>JPermol</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Molar energy, joules per mole.
     * <!-- end-model-doc -->
     * @see #JPERMOL
     * @model name="JPermol"
     * @generated
     * @ordered
     */
    public static final int JPERMOL_VALUE = 101;

    /**
     * The '<em><b>Deg C</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Relative temperature in degrees Celsius.
     * In the SI unit system the symbol is °C. Electric charge is measured in coulomb that has the unit symbol C. To distinguish degree Celsius from coulomb the symbol used in the UML is degC. The reason for not using °C is that the special character ° is difficult to manage in software.
     * <!-- end-model-doc -->
     * @see #DEG_C
     * @model name="degC"
     * @generated
     * @ordered
     */
    public static final int DEG_C_VALUE = 102;

    /**
     * The '<em><b>Pa Pers</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Pressure change rate in pascals per second.
     * <!-- end-model-doc -->
     * @see #PA_PERS
     * @model name="PaPers"
     * @generated
     * @ordered
     */
    public static final int PA_PERS_VALUE = 103;

    /**
     * The '<em><b>Anglemin</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Plane angle, minutes.
     * <!-- end-model-doc -->
     * @see #ANGLEMIN
     * @model name="anglemin"
     * @generated
     * @ordered
     */
    public static final int ANGLEMIN_VALUE = 104;

    /**
     * The '<em><b>M3 Compensated</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Volume, cubic metres, with the value compensated for weather effects.
     * <!-- end-model-doc -->
     * @see #M3_COMPENSATED
     * @model name="m3Compensated"
     * @generated
     * @ordered
     */
    public static final int M3_COMPENSATED_VALUE = 105;

    /**
     * The '<em><b>JPerkg K</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Specific heat capacity, specific entropy, joules per kilogram Kelvin.
     * <!-- end-model-doc -->
     * @see #JPERKG_K
     * @model name="JPerkgK"
     * @generated
     * @ordered
     */
    public static final int JPERKG_K_VALUE = 106;

    /**
     * The '<em><b>Gy</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Absorbed dose in grays (J/kg).
     * <!-- end-model-doc -->
     * @see #GY
     * @model name="Gy"
     * @generated
     * @ordered
     */
    public static final int GY_VALUE = 107;

    /**
     * The '<em><b>Mol Perm3</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Concentration, The amount of substance concentration, (c), the amount of solvent in moles divided by the volume of solution in m³.
     * <!-- end-model-doc -->
     * @see #MOL_PERM3
     * @model name="molPerm3"
     * @generated
     * @ordered
     */
    public static final int MOL_PERM3_VALUE = 108;

    /**
     * The '<em><b>Mol Perkg</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Concentration, Molality, the amount of solute in moles and the amount of solvent in kilograms.
     * <!-- end-model-doc -->
     * @see #MOL_PERKG
     * @model name="molPerkg"
     * @generated
     * @ordered
     */
    public static final int MOL_PERKG_VALUE = 109;

    /**
     * The '<em><b>Rad Pers</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Angular velocity in radians per second (rad/s).
     * <!-- end-model-doc -->
     * @see #RAD_PERS
     * @model name="radPers"
     * @generated
     * @ordered
     */
    public static final int RAD_PERS_VALUE = 110;

    /**
     * The '<em><b>Hz</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Frequency in hertz (1/s).
     * <!-- end-model-doc -->
     * @see #HZ
     * @model name="Hz"
     * @generated
     * @ordered
     */
    public static final int HZ_VALUE = 111;

    /**
     * The '<em><b>M3 Perh</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Volumetric flow rate, cubic metres per hour.
     * <!-- end-model-doc -->
     * @see #M3_PERH
     * @model name="m3Perh"
     * @generated
     * @ordered
     */
    public static final int M3_PERH_VALUE = 112;

    /**
     * The '<em><b>Mol</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Amount of substance in moles.
     * <!-- end-model-doc -->
     * @see #MOL
     * @model name="mol"
     * @generated
     * @ordered
     */
    public static final int MOL_VALUE = 113;

    /**
     * The '<em><b>Ohm Perm</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Electric resistance per length in ohms per metre ((V/A)/m).
     * <!-- end-model-doc -->
     * @see #OHM_PERM
     * @model name="ohmPerm"
     * @generated
     * @ordered
     */
    public static final int OHM_PERM_VALUE = 114;

    /**
     * The '<em><b>M3 Pers</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Volumetric flow rate in cubic metres per second (m³/s).
     * <!-- end-model-doc -->
     * @see #M3_PERS
     * @model name="m3Pers"
     * @generated
     * @ordered
     */
    public static final int M3_PERS_VALUE = 115;

    /**
     * The '<em><b>Rad Pers2</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Angular acceleration, radians per second squared.
     * <!-- end-model-doc -->
     * @see #RAD_PERS2
     * @model name="radPers2"
     * @generated
     * @ordered
     */
    public static final int RAD_PERS2_VALUE = 116;

    /**
     * The '<em><b>JPers</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Energy rate in joules per second (J/s).
     * <!-- end-model-doc -->
     * @see #JPERS
     * @model name="JPers"
     * @generated
     * @ordered
     */
    public static final int JPERS_VALUE = 117;

    /**
     * The '<em><b>Kg</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Mass in kilograms.  Note: multiplier “k” is included in this unit symbol for compatibility with IEC 61850-7-3.
     * <!-- end-model-doc -->
     * @see #KG
     * @model name="kg"
     * @generated
     * @ordered
     */
    public static final int KG_VALUE = 118;

    /**
     * The '<em><b>M3</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Volume in cubic metres (m³).
     * <!-- end-model-doc -->
     * @see #M3
     * @model name="m3"
     * @generated
     * @ordered
     */
    public static final int M3_VALUE = 119;

    /**
     * The '<em><b>M2</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Area in square metres (m²).
     * <!-- end-model-doc -->
     * @see #M2
     * @model name="m2"
     * @generated
     * @ordered
     */
    public static final int M2_VALUE = 120;

    /**
     * The '<em><b>Kn</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Speed, knots (1 kn = 1852/3600) m/s.
     * <!-- end-model-doc -->
     * @see #KN
     * @model name="kn"
     * @generated
     * @ordered
     */
    public static final int KN_VALUE = 121;

    /**
     * The '<em><b>Pas</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Dynamic viscosity, pascal seconds.
     * <!-- end-model-doc -->
     * @see #PAS
     * @model name="Pas"
     * @generated
     * @ordered
     */
    public static final int PAS_VALUE = 122;

    /**
     * The '<em><b>Lx</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Illuminance in lux (lm/m²).
     * <!-- end-model-doc -->
     * @see #LX
     * @model name="lx"
     * @generated
     * @ordered
     */
    public static final int LX_VALUE = 123;

    /**
     * The '<em><b>JPer K</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Heat capacity in joules/kelvin.
     * <!-- end-model-doc -->
     * @see #JPER_K
     * @model name="JPerK"
     * @generated
     * @ordered
     */
    public static final int JPER_K_VALUE = 124;

    /**
     * The '<em><b>Lm</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Luminous flux in lumens (cd·sr).
     * <!-- end-model-doc -->
     * @see #LM
     * @model name="lm"
     * @generated
     * @ordered
     */
    public static final int LM_VALUE = 125;

    /**
     * The '<em><b>Char Pers</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Data rate (baud) in characters per second.
     * <!-- end-model-doc -->
     * @see #CHAR_PERS
     * @model name="charPers"
     * @generated
     * @ordered
     */
    public static final int CHAR_PERS_VALUE = 126;

    /**
     * The '<em><b>Rev</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Amount of rotation, revolutions.
     * <!-- end-model-doc -->
     * @see #REV
     * @model name="rev"
     * @generated
     * @ordered
     */
    public static final int REV_VALUE = 127;

    /**
     * The '<em><b>M3 Perkg</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Specific volume, cubic metres per kilogram, v.
     * <!-- end-model-doc -->
     * @see #M3_PERKG
     * @model name="m3Perkg"
     * @generated
     * @ordered
     */
    public static final int M3_PERKG_VALUE = 128;

    /**
     * The '<em><b>Rad</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Plane angle in radians (m/m).
     * <!-- end-model-doc -->
     * @see #RAD
     * @model name="rad"
     * @generated
     * @ordered
     */
    public static final int RAD_VALUE = 129;

    /**
     * The '<em><b>Sr</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Solid angle in steradians (m2/m2).
     * <!-- end-model-doc -->
     * @see #SR
     * @model name="sr"
     * @generated
     * @ordered
     */
    public static final int SR_VALUE = 130;

    /**
     * The '<em><b>Kg Perm3</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Density in kilogram/cubic metres (kg/m³). Note: multiplier “k” is included in this unit symbol for compatibility with IEC 61850-7-3.
     * <!-- end-model-doc -->
     * @see #KG_PERM3
     * @model name="kgPerm3"
     * @generated
     * @ordered
     */
    public static final int KG_PERM3_VALUE = 131;

    /**
     * The '<em><b>Hz Pers</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Rate of change of frequency in hertz per second.
     * <!-- end-model-doc -->
     * @see #HZ_PERS
     * @model name="HzPers"
     * @generated
     * @ordered
     */
    public static final int HZ_PERS_VALUE = 132;

    /**
     * The '<em><b>VPer VAr</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Power factor, PF, the ratio of the active power to the apparent power. Note: The sign convention used for power factor will differ between IEC meters and EEI (ANSI) meters. It is assumed that the data consumers understand the type of meter being used and agree on the sign convention in use at any given utility.
     * <!-- end-model-doc -->
     * @see #VPER_VAR
     * @model name="VPerVAr"
     * @generated
     * @ordered
     */
    public static final int VPER_VAR_VALUE = 133;

    /**
     * The '<em><b>SPers</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Time, Ratio of time.  Note: Users may need to supply a prefix such as ‘&#181;’ to show rates such as ‘&#181;s/s’.
     * <!-- end-model-doc -->
     * @see #SPERS
     * @model name="sPers"
     * @generated
     * @ordered
     */
    public static final int SPERS_VALUE = 134;

    /**
     * The '<em><b>Anglesec</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Plane angle, seconds.
     * <!-- end-model-doc -->
     * @see #ANGLESEC
     * @model name="anglesec"
     * @generated
     * @ordered
     */
    public static final int ANGLESEC_VALUE = 135;

    /**
     * The '<em><b>Kgm2</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Moment of mass in kilogram square metres (kg·m²) (Second moment of mass, commonly called the moment of inertia). Note: multiplier “k” is included in this unit symbol for compatibility with IEC 61850-7-3.
     * <!-- end-model-doc -->
     * @see #KGM2
     * @model name="kgm2"
     * @generated
     * @ordered
     */
    public static final int KGM2_VALUE = 136;

    /**
     * The '<em><b>Tonne</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Mass in tons, “tonne” or “metric  ton” (1000 kg = 1 Mg).
     * <!-- end-model-doc -->
     * @see #TONNE
     * @model name="tonne"
     * @generated
     * @ordered
     */
    public static final int TONNE_VALUE = 137;

    /**
     * The '<em><b>Rot Pers</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Rotations per second (1/s). See also Hz (1/s).
     * <!-- end-model-doc -->
     * @see #ROT_PERS
     * @model name="rotPers"
     * @generated
     * @ordered
     */
    public static final int ROT_PERS_VALUE = 138;

    /**
     * The '<em><b>NPerm</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Surface tension, newton per metre.
     * <!-- end-model-doc -->
     * @see #NPERM
     * @model name="NPerm"
     * @generated
     * @ordered
     */
    public static final int NPERM_VALUE = 139;

    /**
     * The '<em><b>V2h</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Volt-squared hour, volt-squared-hours.
     * <!-- end-model-doc -->
     * @see #V2H
     * @model name="V2h"
     * @generated
     * @ordered
     */
    public static final int V2H_VALUE = 140;

    /**
     * The '<em><b>Character</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Number of characters.
     * <!-- end-model-doc -->
     * @see #CHARACTER
     * @model name="character"
     * @generated
     * @ordered
     */
    public static final int CHARACTER_VALUE = 141;

    /**
     * An array of all the '<em><b>Unit Symbol</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final UnitSymbol[] VALUES_ARRAY = new UnitSymbol[] {
            WPERM_K,
            MPERM3,
            A2S,
            A2H,
            WPERM2,
            V,
            W,
            PPM,
            D,
            MILE,
            J,
            K,
            HOUR,
            F,
            G,
            T,
            SIEMENS,
            Q,
            N,
            C,
            A,
            WPERM2SR,
            VARH,
            LPERL,
            LPERH,
            LPERS,
            M3_UNCOMPENSATED,
            GY_PERS,
            COS_PHI,
            CD,
            DB,
            OHMM,
            APERM,
            WPERSR,
            KAT_PERM3,
            APER_A,
            MPERS2,
            KPERS,
            MPERS,
            VAH,
            HA,
            L,
            METER,
            HENRY,
            SECOND,
            COUNT,
            KG_PER_J,
            VAR,
            GPERG,
            JPERKG,
            JPERM2,
            JPERM3,
            VPER_VA,
            HZ_PER_HZ,
            MX,
            OE,
            NM,
            CPERKG,
            PA,
            CPERM2,
            CPERM3,
            QH,
            ONE_PER_HZ,
            DEG,
            BAR,
            OHM,
            NONE,
            WPERS,
            KAT,
            MOL_PERMOL,
            SV,
            VA,
            V2,
            VH,
            VPER_V,
            WH,
            WB,
            JPERMOL_K,
            VS,
            ONE_PERM,
            WPER_W,
            WPER_A,
            FT3,
            GAL,
            FPERM,
            THERM,
            KGM,
            VPERM,
            A2,
            MIN,
            MM_HG,
            VPER_HZ,
            BTU,
            AS,
            AH,
            BQ,
            SPERM,
            M2_PERS,
            DBM,
            HPERM,
            JPERMOL,
            DEG_C,
            PA_PERS,
            ANGLEMIN,
            M3_COMPENSATED,
            JPERKG_K,
            GY,
            MOL_PERM3,
            MOL_PERKG,
            RAD_PERS,
            HZ,
            M3_PERH,
            MOL,
            OHM_PERM,
            M3_PERS,
            RAD_PERS2,
            JPERS,
            KG,
            M3,
            M2,
            KN,
            PAS,
            LX,
            JPER_K,
            LM,
            CHAR_PERS,
            REV,
            M3_PERKG,
            RAD,
            SR,
            KG_PERM3,
            HZ_PERS,
            VPER_VAR,
            SPERS,
            ANGLESEC,
            KGM2,
            TONNE,
            ROT_PERS,
            NPERM,
            V2H,
            CHARACTER,
    };

    /**
     * A public read-only list of all the '<em><b>Unit Symbol</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< UnitSymbol > VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Unit Symbol</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static UnitSymbol get( String literal ) {
        for( UnitSymbol result : VALUES_ARRAY ) {
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Unit Symbol</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static UnitSymbol getByName( String name ) {
        for( UnitSymbol result : VALUES_ARRAY ) {
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Unit Symbol</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static UnitSymbol get( int value ) {
        switch( value ) {
        case WPERM_K_VALUE:
            return WPERM_K;
        case MPERM3_VALUE:
            return MPERM3;
        case A2S_VALUE:
            return A2S;
        case A2H_VALUE:
            return A2H;
        case WPERM2_VALUE:
            return WPERM2;
        case V_VALUE:
            return V;
        case W_VALUE:
            return W;
        case PPM_VALUE:
            return PPM;
        case D_VALUE:
            return D;
        case MILE_VALUE:
            return MILE;
        case J_VALUE:
            return J;
        case K_VALUE:
            return K;
        case HOUR_VALUE:
            return HOUR;
        case F_VALUE:
            return F;
        case G_VALUE:
            return G;
        case T_VALUE:
            return T;
        case SIEMENS_VALUE:
            return SIEMENS;
        case Q_VALUE:
            return Q;
        case N_VALUE:
            return N;
        case C_VALUE:
            return C;
        case A_VALUE:
            return A;
        case WPERM2SR_VALUE:
            return WPERM2SR;
        case VARH_VALUE:
            return VARH;
        case LPERL_VALUE:
            return LPERL;
        case LPERH_VALUE:
            return LPERH;
        case LPERS_VALUE:
            return LPERS;
        case M3_UNCOMPENSATED_VALUE:
            return M3_UNCOMPENSATED;
        case GY_PERS_VALUE:
            return GY_PERS;
        case COS_PHI_VALUE:
            return COS_PHI;
        case CD_VALUE:
            return CD;
        case DB_VALUE:
            return DB;
        case OHMM_VALUE:
            return OHMM;
        case APERM_VALUE:
            return APERM;
        case WPERSR_VALUE:
            return WPERSR;
        case KAT_PERM3_VALUE:
            return KAT_PERM3;
        case APER_A_VALUE:
            return APER_A;
        case MPERS2_VALUE:
            return MPERS2;
        case KPERS_VALUE:
            return KPERS;
        case MPERS_VALUE:
            return MPERS;
        case VAH_VALUE:
            return VAH;
        case HA_VALUE:
            return HA;
        case L_VALUE:
            return L;
        case METER_VALUE:
            return METER;
        case HENRY_VALUE:
            return HENRY;
        case SECOND_VALUE:
            return SECOND;
        case COUNT_VALUE:
            return COUNT;
        case KG_PER_J_VALUE:
            return KG_PER_J;
        case VAR_VALUE:
            return VAR;
        case GPERG_VALUE:
            return GPERG;
        case JPERKG_VALUE:
            return JPERKG;
        case JPERM2_VALUE:
            return JPERM2;
        case JPERM3_VALUE:
            return JPERM3;
        case VPER_VA_VALUE:
            return VPER_VA;
        case HZ_PER_HZ_VALUE:
            return HZ_PER_HZ;
        case MX_VALUE:
            return MX;
        case OE_VALUE:
            return OE;
        case NM_VALUE:
            return NM;
        case CPERKG_VALUE:
            return CPERKG;
        case PA_VALUE:
            return PA;
        case CPERM2_VALUE:
            return CPERM2;
        case CPERM3_VALUE:
            return CPERM3;
        case QH_VALUE:
            return QH;
        case ONE_PER_HZ_VALUE:
            return ONE_PER_HZ;
        case DEG_VALUE:
            return DEG;
        case BAR_VALUE:
            return BAR;
        case OHM_VALUE:
            return OHM;
        case NONE_VALUE:
            return NONE;
        case WPERS_VALUE:
            return WPERS;
        case KAT_VALUE:
            return KAT;
        case MOL_PERMOL_VALUE:
            return MOL_PERMOL;
        case SV_VALUE:
            return SV;
        case VA_VALUE:
            return VA;
        case V2_VALUE:
            return V2;
        case VH_VALUE:
            return VH;
        case VPER_V_VALUE:
            return VPER_V;
        case WH_VALUE:
            return WH;
        case WB_VALUE:
            return WB;
        case JPERMOL_K_VALUE:
            return JPERMOL_K;
        case VS_VALUE:
            return VS;
        case ONE_PERM_VALUE:
            return ONE_PERM;
        case WPER_W_VALUE:
            return WPER_W;
        case WPER_A_VALUE:
            return WPER_A;
        case FT3_VALUE:
            return FT3;
        case GAL_VALUE:
            return GAL;
        case FPERM_VALUE:
            return FPERM;
        case THERM_VALUE:
            return THERM;
        case KGM_VALUE:
            return KGM;
        case VPERM_VALUE:
            return VPERM;
        case A2_VALUE:
            return A2;
        case MIN_VALUE:
            return MIN;
        case MM_HG_VALUE:
            return MM_HG;
        case VPER_HZ_VALUE:
            return VPER_HZ;
        case BTU_VALUE:
            return BTU;
        case AS_VALUE:
            return AS;
        case AH_VALUE:
            return AH;
        case BQ_VALUE:
            return BQ;
        case SPERM_VALUE:
            return SPERM;
        case M2_PERS_VALUE:
            return M2_PERS;
        case DBM_VALUE:
            return DBM;
        case HPERM_VALUE:
            return HPERM;
        case JPERMOL_VALUE:
            return JPERMOL;
        case DEG_C_VALUE:
            return DEG_C;
        case PA_PERS_VALUE:
            return PA_PERS;
        case ANGLEMIN_VALUE:
            return ANGLEMIN;
        case M3_COMPENSATED_VALUE:
            return M3_COMPENSATED;
        case JPERKG_K_VALUE:
            return JPERKG_K;
        case GY_VALUE:
            return GY;
        case MOL_PERM3_VALUE:
            return MOL_PERM3;
        case MOL_PERKG_VALUE:
            return MOL_PERKG;
        case RAD_PERS_VALUE:
            return RAD_PERS;
        case HZ_VALUE:
            return HZ;
        case M3_PERH_VALUE:
            return M3_PERH;
        case MOL_VALUE:
            return MOL;
        case OHM_PERM_VALUE:
            return OHM_PERM;
        case M3_PERS_VALUE:
            return M3_PERS;
        case RAD_PERS2_VALUE:
            return RAD_PERS2;
        case JPERS_VALUE:
            return JPERS;
        case KG_VALUE:
            return KG;
        case M3_VALUE:
            return M3;
        case M2_VALUE:
            return M2;
        case KN_VALUE:
            return KN;
        case PAS_VALUE:
            return PAS;
        case LX_VALUE:
            return LX;
        case JPER_K_VALUE:
            return JPER_K;
        case LM_VALUE:
            return LM;
        case CHAR_PERS_VALUE:
            return CHAR_PERS;
        case REV_VALUE:
            return REV;
        case M3_PERKG_VALUE:
            return M3_PERKG;
        case RAD_VALUE:
            return RAD;
        case SR_VALUE:
            return SR;
        case KG_PERM3_VALUE:
            return KG_PERM3;
        case HZ_PERS_VALUE:
            return HZ_PERS;
        case VPER_VAR_VALUE:
            return VPER_VAR;
        case SPERS_VALUE:
            return SPERS;
        case ANGLESEC_VALUE:
            return ANGLESEC;
        case KGM2_VALUE:
            return KGM2;
        case TONNE_VALUE:
            return TONNE;
        case ROT_PERS_VALUE:
            return ROT_PERS;
        case NPERM_VALUE:
            return NPERM;
        case V2H_VALUE:
            return V2H;
        case CHARACTER_VALUE:
            return CHARACTER;
        }
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final int value;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String name;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String literal;

    /**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private UnitSymbol( int value, String name, String literal ) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLiteral() {
        return literal;
    }

    /**
     * Returns the literal value of the enumerator, which is its string representation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        return literal;
    }

} //UnitSymbol

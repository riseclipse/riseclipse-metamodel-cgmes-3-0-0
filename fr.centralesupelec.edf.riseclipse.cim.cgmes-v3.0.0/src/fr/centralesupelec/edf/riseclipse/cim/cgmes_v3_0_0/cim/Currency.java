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
 * A representation of the literals of the enumeration '<em><b>Currency</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Monetary currencies.  ISO 4217 standard including 3-character currency code.
 * <!-- end-model-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getCurrency()
 * @model
 * @generated
 */
public enum Currency implements Enumerator {
    /**
     * The '<em><b>IQD</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Iraqi dinar.
     * <!-- end-model-doc -->
     * @see #IQD_VALUE
     * @generated
     * @ordered
     */
    IQD( 1, "IQD", "IQD" ),
    /**
     * The '<em><b>GMD</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Gambian dalasi.
     * <!-- end-model-doc -->
     * @see #GMD_VALUE
     * @generated
     * @ordered
     */
    GMD( 2, "GMD", "GMD" ),
    /**
     * The '<em><b>XOF</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * CFA Franc BCEAO.
     * <!-- end-model-doc -->
     * @see #XOF_VALUE
     * @generated
     * @ordered
     */
    XOF( 3, "XOF", "XOF" ),
    /**
     * The '<em><b>MYR</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Malaysian ringgit.
     * <!-- end-model-doc -->
     * @see #MYR_VALUE
     * @generated
     * @ordered
     */
    MYR( 4, "MYR", "MYR" ),
    /**
     * The '<em><b>GNF</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Guinean franc.
     * <!-- end-model-doc -->
     * @see #GNF_VALUE
     * @generated
     * @ordered
     */
    GNF( 5, "GNF", "GNF" ),
    /**
     * The '<em><b>THB</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Thai baht.
     * <!-- end-model-doc -->
     * @see #THB_VALUE
     * @generated
     * @ordered
     */
    THB( 6, "THB", "THB" ),
    /**
     * The '<em><b>XPF</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * CFP franc.
     * <!-- end-model-doc -->
     * @see #XPF_VALUE
     * @generated
     * @ordered
     */
    XPF( 7, "XPF", "XPF" ),
    /**
     * The '<em><b>IRR</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Iranian rial.
     * <!-- end-model-doc -->
     * @see #IRR_VALUE
     * @generated
     * @ordered
     */
    IRR( 8, "IRR", "IRR" ),
    /**
     * The '<em><b>MZN</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Mozambican metical.
     * <!-- end-model-doc -->
     * @see #MZN_VALUE
     * @generated
     * @ordered
     */
    MZN( 9, "MZN", "MZN" ),
    /**
     * The '<em><b>KWD</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Kuwaiti dinar.
     * <!-- end-model-doc -->
     * @see #KWD_VALUE
     * @generated
     * @ordered
     */
    KWD( 10, "KWD", "KWD" ),
    /**
     * The '<em><b>ISK</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Icelandic króna.
     * <!-- end-model-doc -->
     * @see #ISK_VALUE
     * @generated
     * @ordered
     */
    ISK( 11, "ISK", "ISK" ),
    /**
     * The '<em><b>PAB</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Panamanian balboa.
     * <!-- end-model-doc -->
     * @see #PAB_VALUE
     * @generated
     * @ordered
     */
    PAB( 12, "PAB", "PAB" ),
    /**
     * The '<em><b>VND</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Vietnamese Dong.
     * <!-- end-model-doc -->
     * @see #VND_VALUE
     * @generated
     * @ordered
     */
    VND( 13, "VND", "VND" ),
    /**
     * The '<em><b>CHF</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Swiss franc.
     * <!-- end-model-doc -->
     * @see #CHF_VALUE
     * @generated
     * @ordered
     */
    CHF( 14, "CHF", "CHF" ),

    /**
     * The '<em><b>GHS</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Ghanaian cedi.
     * <!-- end-model-doc -->
     * @see #GHS_VALUE
     * @generated
     * @ordered
     */
    GHS( 15, "GHS", "GHS" ),

    /**
     * The '<em><b>KPW</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * North Korean won.
     * <!-- end-model-doc -->
     * @see #KPW_VALUE
     * @generated
     * @ordered
     */
    KPW( 16, "KPW", "KPW" ),
    /**
     * The '<em><b>EEK</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Estonian kroon.
     * <!-- end-model-doc -->
     * @see #EEK_VALUE
     * @generated
     * @ordered
     */
    EEK( 17, "EEK", "EEK" ),
    /**
     * The '<em><b>MUR</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Mauritian rupee.
     * <!-- end-model-doc -->
     * @see #MUR_VALUE
     * @generated
     * @ordered
     */
    MUR( 18, "MUR", "MUR" ),
    /**
     * The '<em><b>GIP</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Gibraltar pound.
     * <!-- end-model-doc -->
     * @see #GIP_VALUE
     * @generated
     * @ordered
     */
    GIP( 19, "GIP", "GIP" ),
    /**
     * The '<em><b>CAD</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Canadian dollar.
     * <!-- end-model-doc -->
     * @see #CAD_VALUE
     * @generated
     * @ordered
     */
    CAD( 20, "CAD", "CAD" ),
    /**
     * The '<em><b>KRW</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * South Korean won.
     * <!-- end-model-doc -->
     * @see #KRW_VALUE
     * @generated
     * @ordered
     */
    KRW( 21, "KRW", "KRW" ),
    /**
     * The '<em><b>MVR</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maldivian rufiyaa.
     * <!-- end-model-doc -->
     * @see #MVR_VALUE
     * @generated
     * @ordered
     */
    MVR( 22, "MVR", "MVR" ),
    /**
     * The '<em><b>INR</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Indian rupee.
     * <!-- end-model-doc -->
     * @see #INR_VALUE
     * @generated
     * @ordered
     */
    INR( 23, "INR", "INR" ),
    /**
     * The '<em><b>EGP</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Egyptian pound.
     * <!-- end-model-doc -->
     * @see #EGP_VALUE
     * @generated
     * @ordered
     */
    EGP( 24, "EGP", "EGP" ),
    /**
     * The '<em><b>MWK</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Malawian kwacha.
     * <!-- end-model-doc -->
     * @see #MWK_VALUE
     * @generated
     * @ordered
     */
    MWK( 25, "MWK", "MWK" ),
    /**
     * The '<em><b>MXN</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Mexican peso.
     * <!-- end-model-doc -->
     * @see #MXN_VALUE
     * @generated
     * @ordered
     */
    MXN( 26, "MXN", "MXN" ),
    /**
     * The '<em><b>CDF</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Congolese franc.
     * <!-- end-model-doc -->
     * @see #CDF_VALUE
     * @generated
     * @ordered
     */
    CDF( 27, "CDF", "CDF" ),
    /**
     * The '<em><b>TOP</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Tongan pa'anga.
     * <!-- end-model-doc -->
     * @see #TOP_VALUE
     * @generated
     * @ordered
     */
    TOP( 28, "TOP", "TOP" ),
    /**
     * The '<em><b>PGK</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Papua New Guinean kina.
     * <!-- end-model-doc -->
     * @see #PGK_VALUE
     * @generated
     * @ordered
     */
    PGK( 29, "PGK", "PGK" ),

    /**
     * The '<em><b>CNY</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Chinese yuan.
     * <!-- end-model-doc -->
     * @see #CNY_VALUE
     * @generated
     * @ordered
     */
    CNY( 30, "CNY", "CNY" ),
    /**
     * The '<em><b>ERN</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Eritrean nakfa.
     * <!-- end-model-doc -->
     * @see #ERN_VALUE
     * @generated
     * @ordered
     */
    ERN( 31, "ERN", "ERN" ),

    /**
     * The '<em><b>PHP</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Philippine peso.
     * <!-- end-model-doc -->
     * @see #PHP_VALUE
     * @generated
     * @ordered
     */
    PHP( 32, "PHP", "PHP" ),
    /**
     * The '<em><b>COU</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Unidad de Valor Real.
     * <!-- end-model-doc -->
     * @see #COU_VALUE
     * @generated
     * @ordered
     */
    COU( 33, "COU", "COU" ),
    /**
     * The '<em><b>COP</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Colombian peso.
     * <!-- end-model-doc -->
     * @see #COP_VALUE
     * @generated
     * @ordered
     */
    COP( 34, "COP", "COP" ),
    /**
     * The '<em><b>ETB</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Ethiopian birr.
     * <!-- end-model-doc -->
     * @see #ETB_VALUE
     * @generated
     * @ordered
     */
    ETB( 35, "ETB", "ETB" ),
    /**
     * The '<em><b>LAK</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Lao kip.
     * <!-- end-model-doc -->
     * @see #LAK_VALUE
     * @generated
     * @ordered
     */
    LAK( 36, "LAK", "LAK" ),
    /**
     * The '<em><b>VUV</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Vanuatu vatu.
     * <!-- end-model-doc -->
     * @see #VUV_VALUE
     * @generated
     * @ordered
     */
    VUV( 37, "VUV", "VUV" ),

    /**
     * The '<em><b>ALL</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Albanian lek.
     * <!-- end-model-doc -->
     * @see #ALL_VALUE
     * @generated
     * @ordered
     */
    ALL( 38, "ALL", "ALL" ),
    /**
     * The '<em><b>TJS</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Tajikistani somoni.
     * <!-- end-model-doc -->
     * @see #TJS_VALUE
     * @generated
     * @ordered
     */
    TJS( 39, "TJS", "TJS" ),
    /**
     * The '<em><b>AED</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * United Arab Emirates dirham.
     * <!-- end-model-doc -->
     * @see #AED_VALUE
     * @generated
     * @ordered
     */
    AED( 40, "AED", "AED" ),
    /**
     * The '<em><b>KYD</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Cayman Islands dollar.
     * <!-- end-model-doc -->
     * @see #KYD_VALUE
     * @generated
     * @ordered
     */
    KYD( 41, "KYD", "KYD" ),
    /**
     * The '<em><b>ZWL</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Zimbabwe dollar.
     * <!-- end-model-doc -->
     * @see #ZWL_VALUE
     * @generated
     * @ordered
     */
    ZWL( 42, "ZWL", "ZWL" ),
    /**
     * The '<em><b>AFN</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Afghan afghani.
     * <!-- end-model-doc -->
     * @see #AFN_VALUE
     * @generated
     * @ordered
     */
    AFN( 43, "AFN", "AFN" ),
    /**
     * The '<em><b>KZT</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Kazakhstani tenge.
     * <!-- end-model-doc -->
     * @see #KZT_VALUE
     * @generated
     * @ordered
     */
    KZT( 44, "KZT", "KZT" ),
    /**
     * The '<em><b>PEN</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Peruvian nuevo sol.
     * <!-- end-model-doc -->
     * @see #PEN_VALUE
     * @generated
     * @ordered
     */
    PEN( 45, "PEN", "PEN" ),
    /**
     * The '<em><b>TMT</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Turkmenistani manat.
     * <!-- end-model-doc -->
     * @see #TMT_VALUE
     * @generated
     * @ordered
     */
    TMT( 46, "TMT", "TMT" ),
    /**
     * The '<em><b>CLF</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Unidad de Fomento (funds code), Chile.
     * <!-- end-model-doc -->
     * @see #CLF_VALUE
     * @generated
     * @ordered
     */
    CLF( 47, "CLF", "CLF" ),
    /**
     * The '<em><b>NAD</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Namibian dollar.
     * <!-- end-model-doc -->
     * @see #NAD_VALUE
     * @generated
     * @ordered
     */
    NAD( 48, "NAD", "NAD" ),
    /**
     * The '<em><b>TND</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Tunisian dinar.
     * <!-- end-model-doc -->
     * @see #TND_VALUE
     * @generated
     * @ordered
     */
    TND( 49, "TND", "TND" ),
    /**
     * The '<em><b>GTQ</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Guatemalan quetzal.
     * <!-- end-model-doc -->
     * @see #GTQ_VALUE
     * @generated
     * @ordered
     */
    GTQ( 50, "GTQ", "GTQ" ),
    /**
     * The '<em><b>CLP</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Chilean peso.
     * <!-- end-model-doc -->
     * @see #CLP_VALUE
     * @generated
     * @ordered
     */
    CLP( 51, "CLP", "CLP" ),
    /**
     * The '<em><b>BSD</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Bahamian dollar.
     * <!-- end-model-doc -->
     * @see #BSD_VALUE
     * @generated
     * @ordered
     */
    BSD( 52, "BSD", "BSD" ),
    /**
     * The '<em><b>BTN</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Bhutanese ngultrum.
     * <!-- end-model-doc -->
     * @see #BTN_VALUE
     * @generated
     * @ordered
     */
    BTN( 53, "BTN", "BTN" ),
    /**
     * The '<em><b>KES</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Kenyan shilling.
     * <!-- end-model-doc -->
     * @see #KES_VALUE
     * @generated
     * @ordered
     */
    KES( 54, "KES", "KES" ),
    /**
     * The '<em><b>UYU</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Uruguayan peso.
     * <!-- end-model-doc -->
     * @see #UYU_VALUE
     * @generated
     * @ordered
     */
    UYU( 55, "UYU", "UYU" ),
    /**
     * The '<em><b>OMR</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Omani rial.
     * <!-- end-model-doc -->
     * @see #OMR_VALUE
     * @generated
     * @ordered
     */
    OMR( 56, "OMR", "OMR" ),
    /**
     * The '<em><b>UZS</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Uzbekistan som.
     * <!-- end-model-doc -->
     * @see #UZS_VALUE
     * @generated
     * @ordered
     */
    UZS( 57, "UZS", "UZS" ),
    /**
     * The '<em><b>DZD</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Algerian dinar.
     * <!-- end-model-doc -->
     * @see #DZD_VALUE
     * @generated
     * @ordered
     */
    DZD( 58, "DZD", "DZD" ),
    /**
     * The '<em><b>MKD</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Macedonian denar.
     * <!-- end-model-doc -->
     * @see #MKD_VALUE
     * @generated
     * @ordered
     */
    MKD( 59, "MKD", "MKD" ),
    /**
     * The '<em><b>XAF</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * CFA franc BEAC.
     * <!-- end-model-doc -->
     * @see #XAF_VALUE
     * @generated
     * @ordered
     */
    XAF( 60, "XAF", "XAF" ),
    /**
     * The '<em><b>KGS</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Kyrgyzstani som.
     * <!-- end-model-doc -->
     * @see #KGS_VALUE
     * @generated
     * @ordered
     */
    KGS( 61, "KGS", "KGS" ),
    /**
     * The '<em><b>MDL</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Moldovan leu.
     * <!-- end-model-doc -->
     * @see #MDL_VALUE
     * @generated
     * @ordered
     */
    MDL( 62, "MDL", "MDL" ),
    /**
     * The '<em><b>BOB</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Boliviano.
     * <!-- end-model-doc -->
     * @see #BOB_VALUE
     * @generated
     * @ordered
     */
    BOB( 63, "BOB", "BOB" ),
    /**
     * The '<em><b>BOV</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Bolivian Mvdol (funds code).
     * <!-- end-model-doc -->
     * @see #BOV_VALUE
     * @generated
     * @ordered
     */
    BOV( 64, "BOV", "BOV" ),
    /**
     * The '<em><b>SRD</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Surinamese dollar.
     * <!-- end-model-doc -->
     * @see #SRD_VALUE
     * @generated
     * @ordered
     */
    SRD( 65, "SRD", "SRD" ),
    /**
     * The '<em><b>MGA</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Malagasy ariary.
     * <!-- end-model-doc -->
     * @see #MGA_VALUE
     * @generated
     * @ordered
     */
    MGA( 66, "MGA", "MGA" ),
    /**
     * The '<em><b>BRL</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Brazilian real.
     * <!-- end-model-doc -->
     * @see #BRL_VALUE
     * @generated
     * @ordered
     */
    BRL( 67, "BRL", "BRL" ),
    /**
     * The '<em><b>ZAR</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * South African rand.
     * <!-- end-model-doc -->
     * @see #ZAR_VALUE
     * @generated
     * @ordered
     */
    ZAR( 68, "ZAR", "ZAR" ),
    /**
     * The '<em><b>STD</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * São Tomé and Príncipe dobra.
     * <!-- end-model-doc -->
     * @see #STD_VALUE
     * @generated
     * @ordered
     */
    STD( 69, "STD", "STD" ),
    /**
     * The '<em><b>GEL</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Georgian lari.
     * <!-- end-model-doc -->
     * @see #GEL_VALUE
     * @generated
     * @ordered
     */
    GEL( 70, "GEL", "GEL" ),
    /**
     * The '<em><b>KMF</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Comoro franc.
     * <!-- end-model-doc -->
     * @see #KMF_VALUE
     * @generated
     * @ordered
     */
    KMF( 71, "KMF", "KMF" ),
    /**
     * The '<em><b>MRO</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Mauritanian ouguiya.
     * <!-- end-model-doc -->
     * @see #MRO_VALUE
     * @generated
     * @ordered
     */
    MRO( 72, "MRO", "MRO" ),
    /**
     * The '<em><b>VEF</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Venezuelan bolívar fuerte.
     * <!-- end-model-doc -->
     * @see #VEF_VALUE
     * @generated
     * @ordered
     */
    VEF( 73, "VEF", "VEF" ),
    /**
     * The '<em><b>ZMK</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Zambian kwacha.
     * <!-- end-model-doc -->
     * @see #ZMK_VALUE
     * @generated
     * @ordered
     */
    ZMK( 74, "ZMK", "ZMK" ),
    /**
     * The '<em><b>ILS</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Israeli new sheqel.
     * <!-- end-model-doc -->
     * @see #ILS_VALUE
     * @generated
     * @ordered
     */
    ILS( 75, "ILS", "ILS" ),
    /**
     * The '<em><b>BWP</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Botswana pula.
     * <!-- end-model-doc -->
     * @see #BWP_VALUE
     * @generated
     * @ordered
     */
    BWP( 76, "BWP", "BWP" ),
    /**
     * The '<em><b>KHR</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Cambodian riel.
     * <!-- end-model-doc -->
     * @see #KHR_VALUE
     * @generated
     * @ordered
     */
    KHR( 77, "KHR", "KHR" ),
    /**
     * The '<em><b>IDR</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Indonesian rupiah.
     * <!-- end-model-doc -->
     * @see #IDR_VALUE
     * @generated
     * @ordered
     */
    IDR( 78, "IDR", "IDR" ),
    /**
     * The '<em><b>SYP</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Syrian pound.
     * <!-- end-model-doc -->
     * @see #SYP_VALUE
     * @generated
     * @ordered
     */
    SYP( 79, "SYP", "SYP" ),
    /**
     * The '<em><b>MMK</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Myanma kyat.
     * <!-- end-model-doc -->
     * @see #MMK_VALUE
     * @generated
     * @ordered
     */
    MMK( 80, "MMK", "MMK" ),
    /**
     * The '<em><b>XCD</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * East Caribbean dollar.
     * <!-- end-model-doc -->
     * @see #XCD_VALUE
     * @generated
     * @ordered
     */
    XCD( 81, "XCD", "XCD" ),
    /**
     * The '<em><b>SZL</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Lilangeni.
     * <!-- end-model-doc -->
     * @see #SZL_VALUE
     * @generated
     * @ordered
     */
    SZL( 82, "SZL", "SZL" ),
    /**
     * The '<em><b>BYR</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Belarusian ruble.
     * <!-- end-model-doc -->
     * @see #BYR_VALUE
     * @generated
     * @ordered
     */
    BYR( 83, "BYR", "BYR" ),
    /**
     * The '<em><b>MNT</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Mongolian tugrik.
     * <!-- end-model-doc -->
     * @see #MNT_VALUE
     * @generated
     * @ordered
     */
    MNT( 84, "MNT", "MNT" ),
    /**
     * The '<em><b>GBP</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Pound sterling.
     * <!-- end-model-doc -->
     * @see #GBP_VALUE
     * @generated
     * @ordered
     */
    GBP( 85, "GBP", "GBP" ),
    /**
     * The '<em><b>BZD</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Belize dollar.
     * <!-- end-model-doc -->
     * @see #BZD_VALUE
     * @generated
     * @ordered
     */
    BZD( 86, "BZD", "BZD" ),
    /**
     * The '<em><b>MOP</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Macanese pataca.
     * <!-- end-model-doc -->
     * @see #MOP_VALUE
     * @generated
     * @ordered
     */
    MOP( 87, "MOP", "MOP" ),
    /**
     * The '<em><b>SDG</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Sudanese pound.
     * <!-- end-model-doc -->
     * @see #SDG_VALUE
     * @generated
     * @ordered
     */
    SDG( 88, "SDG", "SDG" ),
    /**
     * The '<em><b>FKP</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Falkland Islands pound.
     * <!-- end-model-doc -->
     * @see #FKP_VALUE
     * @generated
     * @ordered
     */
    FKP( 89, "FKP", "FKP" ),
    /**
     * The '<em><b>SEK</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Swedish krona/kronor.
     * <!-- end-model-doc -->
     * @see #SEK_VALUE
     * @generated
     * @ordered
     */
    SEK( 90, "SEK", "SEK" ),
    /**
     * The '<em><b>QAR</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Qatari rial.
     * <!-- end-model-doc -->
     * @see #QAR_VALUE
     * @generated
     * @ordered
     */
    QAR( 91, "QAR", "QAR" ),
    /**
     * The '<em><b>BDT</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Bangladeshi taka.
     * <!-- end-model-doc -->
     * @see #BDT_VALUE
     * @generated
     * @ordered
     */
    BDT( 92, "BDT", "BDT" ),
    /**
     * The '<em><b>LYD</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Libyan dinar.
     * <!-- end-model-doc -->
     * @see #LYD_VALUE
     * @generated
     * @ordered
     */
    LYD( 93, "LYD", "LYD" ),
    /**
     * The '<em><b>SGD</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Singapore dollar.
     * <!-- end-model-doc -->
     * @see #SGD_VALUE
     * @generated
     * @ordered
     */
    SGD( 94, "SGD", "SGD" ),
    /**
     * The '<em><b>DJF</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Djiboutian franc.
     * <!-- end-model-doc -->
     * @see #DJF_VALUE
     * @generated
     * @ordered
     */
    DJF( 95, "DJF", "DJF" ),
    /**
     * The '<em><b>HRK</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Croatian kuna.
     * <!-- end-model-doc -->
     * @see #HRK_VALUE
     * @generated
     * @ordered
     */
    HRK( 96, "HRK", "HRK" ),
    /**
     * The '<em><b>JOD</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Jordanian dinar.
     * <!-- end-model-doc -->
     * @see #JOD_VALUE
     * @generated
     * @ordered
     */
    JOD( 97, "JOD", "JOD" ),
    /**
     * The '<em><b>LSL</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Lesotho loti.
     * <!-- end-model-doc -->
     * @see #LSL_VALUE
     * @generated
     * @ordered
     */
    LSL( 98, "LSL", "LSL" ),
    /**
     * The '<em><b>HKD</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Hong Kong dollar.
     * <!-- end-model-doc -->
     * @see #HKD_VALUE
     * @generated
     * @ordered
     */
    HKD( 99, "HKD", "HKD" ),
    /**
     * The '<em><b>LTL</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Lithuanian litas.
     * <!-- end-model-doc -->
     * @see #LTL_VALUE
     * @generated
     * @ordered
     */
    LTL( 100, "LTL", "LTL" ),
    /**
     * The '<em><b>SAR</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Saudi riyal.
     * <!-- end-model-doc -->
     * @see #SAR_VALUE
     * @generated
     * @ordered
     */
    SAR( 101, "SAR", "SAR" ),
    /**
     * The '<em><b>SBD</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Solomon Islands dollar.
     * <!-- end-model-doc -->
     * @see #SBD_VALUE
     * @generated
     * @ordered
     */
    SBD( 102, "SBD", "SBD" ),
    /**
     * The '<em><b>JPY</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Japanese yen.
     * <!-- end-model-doc -->
     * @see #JPY_VALUE
     * @generated
     * @ordered
     */
    JPY( 103, "JPY", "JPY" ),
    /**
     * The '<em><b>BAM</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Bosnia and Herzegovina convertible mark.
     * <!-- end-model-doc -->
     * @see #BAM_VALUE
     * @generated
     * @ordered
     */
    BAM( 104, "BAM", "BAM" ),
    /**
     * The '<em><b>FJD</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Fiji dollar.
     * <!-- end-model-doc -->
     * @see #FJD_VALUE
     * @generated
     * @ordered
     */
    FJD( 105, "FJD", "FJD" ),
    /**
     * The '<em><b>NZD</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * New Zealand dollar.
     * <!-- end-model-doc -->
     * @see #NZD_VALUE
     * @generated
     * @ordered
     */
    NZD( 106, "NZD", "NZD" ),
    /**
     * The '<em><b>BBD</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Barbados dollar.
     * <!-- end-model-doc -->
     * @see #BBD_VALUE
     * @generated
     * @ordered
     */
    BBD( 107, "BBD", "BBD" ),
    /**
     * The '<em><b>UGX</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Ugandan shilling.
     * <!-- end-model-doc -->
     * @see #UGX_VALUE
     * @generated
     * @ordered
     */
    UGX( 108, "UGX", "UGX" ),
    /**
     * The '<em><b>LVL</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Latvian lats.
     * <!-- end-model-doc -->
     * @see #LVL_VALUE
     * @generated
     * @ordered
     */
    LVL( 109, "LVL", "LVL" ),
    /**
     * The '<em><b>SCR</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Seychelles rupee.
     * <!-- end-model-doc -->
     * @see #SCR_VALUE
     * @generated
     * @ordered
     */
    SCR( 110, "SCR", "SCR" ),
    /**
     * The '<em><b>HNL</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Honduran lempira.
     * <!-- end-model-doc -->
     * @see #HNL_VALUE
     * @generated
     * @ordered
     */
    HNL( 111, "HNL", "HNL" ),
    /**
     * The '<em><b>SLL</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Sierra Leonean leone.
     * <!-- end-model-doc -->
     * @see #SLL_VALUE
     * @generated
     * @ordered
     */
    SLL( 112, "SLL", "SLL" ),
    /**
     * The '<em><b>MAD</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Moroccan dirham.
     * <!-- end-model-doc -->
     * @see #MAD_VALUE
     * @generated
     * @ordered
     */
    MAD( 113, "MAD", "MAD" ),
    /**
     * The '<em><b>DOP</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Dominican peso.
     * <!-- end-model-doc -->
     * @see #DOP_VALUE
     * @generated
     * @ordered
     */
    DOP( 114, "DOP", "DOP" ),
    /**
     * The '<em><b>BMD</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Bermudian dollar (customarily known as Bermuda dollar).
     * <!-- end-model-doc -->
     * @see #BMD_VALUE
     * @generated
     * @ordered
     */
    BMD( 115, "BMD", "BMD" ),
    /**
     * The '<em><b>USD</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * United States dollar.
     * <!-- end-model-doc -->
     * @see #USD_VALUE
     * @generated
     * @ordered
     */
    USD( 116, "USD", "USD" ),
    /**
     * The '<em><b>SOS</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Somali shilling.
     * <!-- end-model-doc -->
     * @see #SOS_VALUE
     * @generated
     * @ordered
     */
    SOS( 117, "SOS", "SOS" ),
    /**
     * The '<em><b>BND</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Brunei dollar.
     * <!-- end-model-doc -->
     * @see #BND_VALUE
     * @generated
     * @ordered
     */
    BND( 118, "BND", "BND" ),
    /**
     * The '<em><b>SHP</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Saint Helena pound.
     * <!-- end-model-doc -->
     * @see #SHP_VALUE
     * @generated
     * @ordered
     */
    SHP( 119, "SHP", "SHP" ),
    /**
     * The '<em><b>BGN</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Bulgarian lev.
     * <!-- end-model-doc -->
     * @see #BGN_VALUE
     * @generated
     * @ordered
     */
    BGN( 120, "BGN", "BGN" ),
    /**
     * The '<em><b>DKK</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Danish krone.
     * <!-- end-model-doc -->
     * @see #DKK_VALUE
     * @generated
     * @ordered
     */
    DKK( 121, "DKK", "DKK" ),
    /**
     * The '<em><b>HTG</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Haitian gourde.
     * <!-- end-model-doc -->
     * @see #HTG_VALUE
     * @generated
     * @ordered
     */
    HTG( 122, "HTG", "HTG" ),
    /**
     * The '<em><b>BHD</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Bahraini dinar.
     * <!-- end-model-doc -->
     * @see #BHD_VALUE
     * @generated
     * @ordered
     */
    BHD( 123, "BHD", "BHD" ),
    /**
     * The '<em><b>HUF</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Hungarian forint.
     * <!-- end-model-doc -->
     * @see #HUF_VALUE
     * @generated
     * @ordered
     */
    HUF( 124, "HUF", "HUF" ),
    /**
     * The '<em><b>BIF</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Burundian franc.
     * <!-- end-model-doc -->
     * @see #BIF_VALUE
     * @generated
     * @ordered
     */
    BIF( 125, "BIF", "BIF" ),
    /**
     * The '<em><b>WST</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Samoan tala.
     * <!-- end-model-doc -->
     * @see #WST_VALUE
     * @generated
     * @ordered
     */
    WST( 126, "WST", "WST" ),
    /**
     * The '<em><b>CUP</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Cuban peso.
     * <!-- end-model-doc -->
     * @see #CUP_VALUE
     * @generated
     * @ordered
     */
    CUP( 127, "CUP", "CUP" ),
    /**
     * The '<em><b>CUC</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Cuban convertible peso.
     * <!-- end-model-doc -->
     * @see #CUC_VALUE
     * @generated
     * @ordered
     */
    CUC( 128, "CUC", "CUC" ),
    /**
     * The '<em><b>TWD</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * New Taiwan dollar.
     * <!-- end-model-doc -->
     * @see #TWD_VALUE
     * @generated
     * @ordered
     */
    TWD( 129, "TWD", "TWD" ),
    /**
     * The '<em><b>RSD</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Serbian dinar.
     * <!-- end-model-doc -->
     * @see #RSD_VALUE
     * @generated
     * @ordered
     */
    RSD( 130, "RSD", "RSD" ),
    /**
     * The '<em><b>CVE</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Cape Verde escudo.
     * <!-- end-model-doc -->
     * @see #CVE_VALUE
     * @generated
     * @ordered
     */
    CVE( 131, "CVE", "CVE" ),
    /**
     * The '<em><b>ARS</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Argentine peso.
     * <!-- end-model-doc -->
     * @see #ARS_VALUE
     * @generated
     * @ordered
     */
    ARS( 132, "ARS", "ARS" ),
    /**
     * The '<em><b>RUB</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Russian rouble.
     * <!-- end-model-doc -->
     * @see #RUB_VALUE
     * @generated
     * @ordered
     */
    RUB( 133, "RUB", "RUB" ),
    /**
     * The '<em><b>TZS</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Tanzanian shilling.
     * <!-- end-model-doc -->
     * @see #TZS_VALUE
     * @generated
     * @ordered
     */
    TZS( 134, "TZS", "TZS" ),
    /**
     * The '<em><b>AUD</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Australian dollar.
     * <!-- end-model-doc -->
     * @see #AUD_VALUE
     * @generated
     * @ordered
     */
    AUD( 135, "AUD", "AUD" ),

    /**
     * The '<em><b>LBP</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Lebanese pound.
     * <!-- end-model-doc -->
     * @see #LBP_VALUE
     * @generated
     * @ordered
     */
    LBP( 136, "LBP", "LBP" ),

    /**
     * The '<em><b>TRY</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Turkish lira.
     * <!-- end-model-doc -->
     * @see #TRY_VALUE
     * @generated
     * @ordered
     */
    TRY( 137, "TRY", "TRY" ),
    /**
     * The '<em><b>GYD</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Guyanese dollar.
     * <!-- end-model-doc -->
     * @see #GYD_VALUE
     * @generated
     * @ordered
     */
    GYD( 138, "GYD", "GYD" ),

    /**
     * The '<em><b>AMD</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Armenian dram.
     * <!-- end-model-doc -->
     * @see #AMD_VALUE
     * @generated
     * @ordered
     */
    AMD( 139, "AMD", "AMD" ),
    /**
     * The '<em><b>EUR</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Euro.
     * <!-- end-model-doc -->
     * @see #EUR_VALUE
     * @generated
     * @ordered
     */
    EUR( 140, "EUR", "EUR" ),
    /**
     * The '<em><b>ANG</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Netherlands Antillean guilder.
     * <!-- end-model-doc -->
     * @see #ANG_VALUE
     * @generated
     * @ordered
     */
    ANG( 141, "ANG", "ANG" ),
    /**
     * The '<em><b>CRC</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Costa Rican colon.
     * <!-- end-model-doc -->
     * @see #CRC_VALUE
     * @generated
     * @ordered
     */
    CRC( 142, "CRC", "CRC" ),
    /**
     * The '<em><b>NGN</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Nigerian naira.
     * <!-- end-model-doc -->
     * @see #NGN_VALUE
     * @generated
     * @ordered
     */
    NGN( 143, "NGN", "NGN" ),
    /**
     * The '<em><b>PKR</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Pakistani rupee.
     * <!-- end-model-doc -->
     * @see #PKR_VALUE
     * @generated
     * @ordered
     */
    PKR( 144, "PKR", "PKR" ),
    /**
     * The '<em><b>RON</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Romanian new leu.
     * <!-- end-model-doc -->
     * @see #RON_VALUE
     * @generated
     * @ordered
     */
    RON( 145, "RON", "RON" ),
    /**
     * The '<em><b>TTD</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Trinidad and Tobago dollar.
     * <!-- end-model-doc -->
     * @see #TTD_VALUE
     * @generated
     * @ordered
     */
    TTD( 146, "TTD", "TTD" ),
    /**
     * The '<em><b>AOA</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Angolan kwanza.
     * <!-- end-model-doc -->
     * @see #AOA_VALUE
     * @generated
     * @ordered
     */
    AOA( 147, "AOA", "AOA" ),
    /**
     * The '<em><b>PLN</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Polish zloty.
     * <!-- end-model-doc -->
     * @see #PLN_VALUE
     * @generated
     * @ordered
     */
    PLN( 148, "PLN", "PLN" ),
    /**
     * The '<em><b>NIO</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Cordoba oro.
     * <!-- end-model-doc -->
     * @see #NIO_VALUE
     * @generated
     * @ordered
     */
    NIO( 149, "NIO", "NIO" ),
    /**
     * The '<em><b>UAH</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Ukrainian hryvnia.
     * <!-- end-model-doc -->
     * @see #UAH_VALUE
     * @generated
     * @ordered
     */
    UAH( 150, "UAH", "UAH" ),
    /**
     * The '<em><b>AZN</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Azerbaijani manat.
     * <!-- end-model-doc -->
     * @see #AZN_VALUE
     * @generated
     * @ordered
     */
    AZN( 151, "AZN", "AZN" ),
    /**
     * The '<em><b>PYG</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Paraguayan guaraní.
     * <!-- end-model-doc -->
     * @see #PYG_VALUE
     * @generated
     * @ordered
     */
    PYG( 152, "PYG", "PYG" ),
    /**
     * The '<em><b>JMD</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Jamaican dollar.
     * <!-- end-model-doc -->
     * @see #JMD_VALUE
     * @generated
     * @ordered
     */
    JMD( 153, "JMD", "JMD" ),
    /**
     * The '<em><b>LRD</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Liberian dollar.
     * <!-- end-model-doc -->
     * @see #LRD_VALUE
     * @generated
     * @ordered
     */
    LRD( 154, "LRD", "LRD" ),
    /**
     * The '<em><b>NOK</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Norwegian krone.
     * <!-- end-model-doc -->
     * @see #NOK_VALUE
     * @generated
     * @ordered
     */
    NOK( 155, "NOK", "NOK" ),
    /**
     * The '<em><b>RWF</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Rwandan franc.
     * <!-- end-model-doc -->
     * @see #RWF_VALUE
     * @generated
     * @ordered
     */
    RWF( 156, "RWF", "RWF" ),
    /**
     * The '<em><b>CZK</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Czech koruna.
     * <!-- end-model-doc -->
     * @see #CZK_VALUE
     * @generated
     * @ordered
     */
    CZK( 157, "CZK", "CZK" ),
    /**
     * The '<em><b>LKR</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Sri Lanka rupee.
     * <!-- end-model-doc -->
     * @see #LKR_VALUE
     * @generated
     * @ordered
     */
    LKR( 158, "LKR", "LKR" ),
    /**
     * The '<em><b>NPR</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Nepalese rupee.
     * <!-- end-model-doc -->
     * @see #NPR_VALUE
     * @generated
     * @ordered
     */
    NPR( 159, "NPR", "NPR" ),
    /**
     * The '<em><b>YER</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Yemeni rial.
     * <!-- end-model-doc -->
     * @see #YER_VALUE
     * @generated
     * @ordered
     */
    YER( 160, "YER", "YER" ),
    /**
     * The '<em><b>AWG</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Aruban florin.
     * <!-- end-model-doc -->
     * @see #AWG_VALUE
     * @generated
     * @ordered
     */
    AWG( 161, "AWG", "AWG" );

    /**
     * The '<em><b>IQD</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Iraqi dinar.
     * <!-- end-model-doc -->
     * @see #IQD
     * @model
     * @generated
     * @ordered
     */
    public static final int IQD_VALUE = 1;

    /**
     * The '<em><b>GMD</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Gambian dalasi.
     * <!-- end-model-doc -->
     * @see #GMD
     * @model
     * @generated
     * @ordered
     */
    public static final int GMD_VALUE = 2;

    /**
     * The '<em><b>XOF</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * CFA Franc BCEAO.
     * <!-- end-model-doc -->
     * @see #XOF
     * @model
     * @generated
     * @ordered
     */
    public static final int XOF_VALUE = 3;

    /**
     * The '<em><b>MYR</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Malaysian ringgit.
     * <!-- end-model-doc -->
     * @see #MYR
     * @model
     * @generated
     * @ordered
     */
    public static final int MYR_VALUE = 4;

    /**
     * The '<em><b>GNF</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Guinean franc.
     * <!-- end-model-doc -->
     * @see #GNF
     * @model
     * @generated
     * @ordered
     */
    public static final int GNF_VALUE = 5;

    /**
     * The '<em><b>THB</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Thai baht.
     * <!-- end-model-doc -->
     * @see #THB
     * @model
     * @generated
     * @ordered
     */
    public static final int THB_VALUE = 6;

    /**
     * The '<em><b>XPF</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * CFP franc.
     * <!-- end-model-doc -->
     * @see #XPF
     * @model
     * @generated
     * @ordered
     */
    public static final int XPF_VALUE = 7;

    /**
     * The '<em><b>IRR</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Iranian rial.
     * <!-- end-model-doc -->
     * @see #IRR
     * @model
     * @generated
     * @ordered
     */
    public static final int IRR_VALUE = 8;

    /**
     * The '<em><b>MZN</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Mozambican metical.
     * <!-- end-model-doc -->
     * @see #MZN
     * @model
     * @generated
     * @ordered
     */
    public static final int MZN_VALUE = 9;

    /**
     * The '<em><b>KWD</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Kuwaiti dinar.
     * <!-- end-model-doc -->
     * @see #KWD
     * @model
     * @generated
     * @ordered
     */
    public static final int KWD_VALUE = 10;

    /**
     * The '<em><b>ISK</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Icelandic króna.
     * <!-- end-model-doc -->
     * @see #ISK
     * @model
     * @generated
     * @ordered
     */
    public static final int ISK_VALUE = 11;

    /**
     * The '<em><b>PAB</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Panamanian balboa.
     * <!-- end-model-doc -->
     * @see #PAB
     * @model
     * @generated
     * @ordered
     */
    public static final int PAB_VALUE = 12;

    /**
     * The '<em><b>VND</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Vietnamese Dong.
     * <!-- end-model-doc -->
     * @see #VND
     * @model
     * @generated
     * @ordered
     */
    public static final int VND_VALUE = 13;

    /**
     * The '<em><b>CHF</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Swiss franc.
     * <!-- end-model-doc -->
     * @see #CHF
     * @model
     * @generated
     * @ordered
     */
    public static final int CHF_VALUE = 14;

    /**
     * The '<em><b>GHS</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Ghanaian cedi.
     * <!-- end-model-doc -->
     * @see #GHS
     * @model
     * @generated
     * @ordered
     */
    public static final int GHS_VALUE = 15;

    /**
     * The '<em><b>KPW</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * North Korean won.
     * <!-- end-model-doc -->
     * @see #KPW
     * @model
     * @generated
     * @ordered
     */
    public static final int KPW_VALUE = 16;

    /**
     * The '<em><b>EEK</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Estonian kroon.
     * <!-- end-model-doc -->
     * @see #EEK
     * @model
     * @generated
     * @ordered
     */
    public static final int EEK_VALUE = 17;

    /**
     * The '<em><b>MUR</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Mauritian rupee.
     * <!-- end-model-doc -->
     * @see #MUR
     * @model
     * @generated
     * @ordered
     */
    public static final int MUR_VALUE = 18;

    /**
     * The '<em><b>GIP</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Gibraltar pound.
     * <!-- end-model-doc -->
     * @see #GIP
     * @model
     * @generated
     * @ordered
     */
    public static final int GIP_VALUE = 19;

    /**
     * The '<em><b>CAD</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Canadian dollar.
     * <!-- end-model-doc -->
     * @see #CAD
     * @model
     * @generated
     * @ordered
     */
    public static final int CAD_VALUE = 20;

    /**
     * The '<em><b>KRW</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * South Korean won.
     * <!-- end-model-doc -->
     * @see #KRW
     * @model
     * @generated
     * @ordered
     */
    public static final int KRW_VALUE = 21;

    /**
     * The '<em><b>MVR</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Maldivian rufiyaa.
     * <!-- end-model-doc -->
     * @see #MVR
     * @model
     * @generated
     * @ordered
     */
    public static final int MVR_VALUE = 22;

    /**
     * The '<em><b>INR</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Indian rupee.
     * <!-- end-model-doc -->
     * @see #INR
     * @model
     * @generated
     * @ordered
     */
    public static final int INR_VALUE = 23;

    /**
     * The '<em><b>EGP</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Egyptian pound.
     * <!-- end-model-doc -->
     * @see #EGP
     * @model
     * @generated
     * @ordered
     */
    public static final int EGP_VALUE = 24;

    /**
     * The '<em><b>MWK</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Malawian kwacha.
     * <!-- end-model-doc -->
     * @see #MWK
     * @model
     * @generated
     * @ordered
     */
    public static final int MWK_VALUE = 25;

    /**
     * The '<em><b>MXN</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Mexican peso.
     * <!-- end-model-doc -->
     * @see #MXN
     * @model
     * @generated
     * @ordered
     */
    public static final int MXN_VALUE = 26;

    /**
     * The '<em><b>CDF</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Congolese franc.
     * <!-- end-model-doc -->
     * @see #CDF
     * @model
     * @generated
     * @ordered
     */
    public static final int CDF_VALUE = 27;

    /**
     * The '<em><b>TOP</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Tongan pa'anga.
     * <!-- end-model-doc -->
     * @see #TOP
     * @model
     * @generated
     * @ordered
     */
    public static final int TOP_VALUE = 28;

    /**
     * The '<em><b>PGK</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Papua New Guinean kina.
     * <!-- end-model-doc -->
     * @see #PGK
     * @model
     * @generated
     * @ordered
     */
    public static final int PGK_VALUE = 29;

    /**
     * The '<em><b>CNY</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Chinese yuan.
     * <!-- end-model-doc -->
     * @see #CNY
     * @model
     * @generated
     * @ordered
     */
    public static final int CNY_VALUE = 30;

    /**
     * The '<em><b>ERN</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Eritrean nakfa.
     * <!-- end-model-doc -->
     * @see #ERN
     * @model
     * @generated
     * @ordered
     */
    public static final int ERN_VALUE = 31;

    /**
     * The '<em><b>PHP</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Philippine peso.
     * <!-- end-model-doc -->
     * @see #PHP
     * @model
     * @generated
     * @ordered
     */
    public static final int PHP_VALUE = 32;

    /**
     * The '<em><b>COU</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Unidad de Valor Real.
     * <!-- end-model-doc -->
     * @see #COU
     * @model
     * @generated
     * @ordered
     */
    public static final int COU_VALUE = 33;

    /**
     * The '<em><b>COP</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Colombian peso.
     * <!-- end-model-doc -->
     * @see #COP
     * @model
     * @generated
     * @ordered
     */
    public static final int COP_VALUE = 34;

    /**
     * The '<em><b>ETB</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Ethiopian birr.
     * <!-- end-model-doc -->
     * @see #ETB
     * @model
     * @generated
     * @ordered
     */
    public static final int ETB_VALUE = 35;

    /**
     * The '<em><b>LAK</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Lao kip.
     * <!-- end-model-doc -->
     * @see #LAK
     * @model
     * @generated
     * @ordered
     */
    public static final int LAK_VALUE = 36;

    /**
     * The '<em><b>VUV</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Vanuatu vatu.
     * <!-- end-model-doc -->
     * @see #VUV
     * @model
     * @generated
     * @ordered
     */
    public static final int VUV_VALUE = 37;

    /**
     * The '<em><b>ALL</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Albanian lek.
     * <!-- end-model-doc -->
     * @see #ALL
     * @model
     * @generated
     * @ordered
     */
    public static final int ALL_VALUE = 38;

    /**
     * The '<em><b>TJS</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Tajikistani somoni.
     * <!-- end-model-doc -->
     * @see #TJS
     * @model
     * @generated
     * @ordered
     */
    public static final int TJS_VALUE = 39;

    /**
     * The '<em><b>AED</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * United Arab Emirates dirham.
     * <!-- end-model-doc -->
     * @see #AED
     * @model
     * @generated
     * @ordered
     */
    public static final int AED_VALUE = 40;

    /**
     * The '<em><b>KYD</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Cayman Islands dollar.
     * <!-- end-model-doc -->
     * @see #KYD
     * @model
     * @generated
     * @ordered
     */
    public static final int KYD_VALUE = 41;

    /**
     * The '<em><b>ZWL</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Zimbabwe dollar.
     * <!-- end-model-doc -->
     * @see #ZWL
     * @model
     * @generated
     * @ordered
     */
    public static final int ZWL_VALUE = 42;

    /**
     * The '<em><b>AFN</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Afghan afghani.
     * <!-- end-model-doc -->
     * @see #AFN
     * @model
     * @generated
     * @ordered
     */
    public static final int AFN_VALUE = 43;

    /**
     * The '<em><b>KZT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Kazakhstani tenge.
     * <!-- end-model-doc -->
     * @see #KZT
     * @model
     * @generated
     * @ordered
     */
    public static final int KZT_VALUE = 44;

    /**
     * The '<em><b>PEN</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Peruvian nuevo sol.
     * <!-- end-model-doc -->
     * @see #PEN
     * @model
     * @generated
     * @ordered
     */
    public static final int PEN_VALUE = 45;

    /**
     * The '<em><b>TMT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Turkmenistani manat.
     * <!-- end-model-doc -->
     * @see #TMT
     * @model
     * @generated
     * @ordered
     */
    public static final int TMT_VALUE = 46;

    /**
     * The '<em><b>CLF</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Unidad de Fomento (funds code), Chile.
     * <!-- end-model-doc -->
     * @see #CLF
     * @model
     * @generated
     * @ordered
     */
    public static final int CLF_VALUE = 47;

    /**
     * The '<em><b>NAD</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Namibian dollar.
     * <!-- end-model-doc -->
     * @see #NAD
     * @model
     * @generated
     * @ordered
     */
    public static final int NAD_VALUE = 48;

    /**
     * The '<em><b>TND</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Tunisian dinar.
     * <!-- end-model-doc -->
     * @see #TND
     * @model
     * @generated
     * @ordered
     */
    public static final int TND_VALUE = 49;

    /**
     * The '<em><b>GTQ</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Guatemalan quetzal.
     * <!-- end-model-doc -->
     * @see #GTQ
     * @model
     * @generated
     * @ordered
     */
    public static final int GTQ_VALUE = 50;

    /**
     * The '<em><b>CLP</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Chilean peso.
     * <!-- end-model-doc -->
     * @see #CLP
     * @model
     * @generated
     * @ordered
     */
    public static final int CLP_VALUE = 51;

    /**
     * The '<em><b>BSD</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Bahamian dollar.
     * <!-- end-model-doc -->
     * @see #BSD
     * @model
     * @generated
     * @ordered
     */
    public static final int BSD_VALUE = 52;

    /**
     * The '<em><b>BTN</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Bhutanese ngultrum.
     * <!-- end-model-doc -->
     * @see #BTN
     * @model
     * @generated
     * @ordered
     */
    public static final int BTN_VALUE = 53;

    /**
     * The '<em><b>KES</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Kenyan shilling.
     * <!-- end-model-doc -->
     * @see #KES
     * @model
     * @generated
     * @ordered
     */
    public static final int KES_VALUE = 54;

    /**
     * The '<em><b>UYU</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Uruguayan peso.
     * <!-- end-model-doc -->
     * @see #UYU
     * @model
     * @generated
     * @ordered
     */
    public static final int UYU_VALUE = 55;

    /**
     * The '<em><b>OMR</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Omani rial.
     * <!-- end-model-doc -->
     * @see #OMR
     * @model
     * @generated
     * @ordered
     */
    public static final int OMR_VALUE = 56;

    /**
     * The '<em><b>UZS</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Uzbekistan som.
     * <!-- end-model-doc -->
     * @see #UZS
     * @model
     * @generated
     * @ordered
     */
    public static final int UZS_VALUE = 57;

    /**
     * The '<em><b>DZD</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Algerian dinar.
     * <!-- end-model-doc -->
     * @see #DZD
     * @model
     * @generated
     * @ordered
     */
    public static final int DZD_VALUE = 58;

    /**
     * The '<em><b>MKD</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Macedonian denar.
     * <!-- end-model-doc -->
     * @see #MKD
     * @model
     * @generated
     * @ordered
     */
    public static final int MKD_VALUE = 59;

    /**
     * The '<em><b>XAF</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * CFA franc BEAC.
     * <!-- end-model-doc -->
     * @see #XAF
     * @model
     * @generated
     * @ordered
     */
    public static final int XAF_VALUE = 60;

    /**
     * The '<em><b>KGS</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Kyrgyzstani som.
     * <!-- end-model-doc -->
     * @see #KGS
     * @model
     * @generated
     * @ordered
     */
    public static final int KGS_VALUE = 61;

    /**
     * The '<em><b>MDL</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Moldovan leu.
     * <!-- end-model-doc -->
     * @see #MDL
     * @model
     * @generated
     * @ordered
     */
    public static final int MDL_VALUE = 62;

    /**
     * The '<em><b>BOB</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Boliviano.
     * <!-- end-model-doc -->
     * @see #BOB
     * @model
     * @generated
     * @ordered
     */
    public static final int BOB_VALUE = 63;

    /**
     * The '<em><b>BOV</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Bolivian Mvdol (funds code).
     * <!-- end-model-doc -->
     * @see #BOV
     * @model
     * @generated
     * @ordered
     */
    public static final int BOV_VALUE = 64;

    /**
     * The '<em><b>SRD</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Surinamese dollar.
     * <!-- end-model-doc -->
     * @see #SRD
     * @model
     * @generated
     * @ordered
     */
    public static final int SRD_VALUE = 65;

    /**
     * The '<em><b>MGA</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Malagasy ariary.
     * <!-- end-model-doc -->
     * @see #MGA
     * @model
     * @generated
     * @ordered
     */
    public static final int MGA_VALUE = 66;

    /**
     * The '<em><b>BRL</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Brazilian real.
     * <!-- end-model-doc -->
     * @see #BRL
     * @model
     * @generated
     * @ordered
     */
    public static final int BRL_VALUE = 67;

    /**
     * The '<em><b>ZAR</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * South African rand.
     * <!-- end-model-doc -->
     * @see #ZAR
     * @model
     * @generated
     * @ordered
     */
    public static final int ZAR_VALUE = 68;

    /**
     * The '<em><b>STD</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * São Tomé and Príncipe dobra.
     * <!-- end-model-doc -->
     * @see #STD
     * @model
     * @generated
     * @ordered
     */
    public static final int STD_VALUE = 69;

    /**
     * The '<em><b>GEL</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Georgian lari.
     * <!-- end-model-doc -->
     * @see #GEL
     * @model
     * @generated
     * @ordered
     */
    public static final int GEL_VALUE = 70;

    /**
     * The '<em><b>KMF</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Comoro franc.
     * <!-- end-model-doc -->
     * @see #KMF
     * @model
     * @generated
     * @ordered
     */
    public static final int KMF_VALUE = 71;

    /**
     * The '<em><b>MRO</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Mauritanian ouguiya.
     * <!-- end-model-doc -->
     * @see #MRO
     * @model
     * @generated
     * @ordered
     */
    public static final int MRO_VALUE = 72;

    /**
     * The '<em><b>VEF</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Venezuelan bolívar fuerte.
     * <!-- end-model-doc -->
     * @see #VEF
     * @model
     * @generated
     * @ordered
     */
    public static final int VEF_VALUE = 73;

    /**
     * The '<em><b>ZMK</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Zambian kwacha.
     * <!-- end-model-doc -->
     * @see #ZMK
     * @model
     * @generated
     * @ordered
     */
    public static final int ZMK_VALUE = 74;

    /**
     * The '<em><b>ILS</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Israeli new sheqel.
     * <!-- end-model-doc -->
     * @see #ILS
     * @model
     * @generated
     * @ordered
     */
    public static final int ILS_VALUE = 75;

    /**
     * The '<em><b>BWP</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Botswana pula.
     * <!-- end-model-doc -->
     * @see #BWP
     * @model
     * @generated
     * @ordered
     */
    public static final int BWP_VALUE = 76;

    /**
     * The '<em><b>KHR</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Cambodian riel.
     * <!-- end-model-doc -->
     * @see #KHR
     * @model
     * @generated
     * @ordered
     */
    public static final int KHR_VALUE = 77;

    /**
     * The '<em><b>IDR</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Indonesian rupiah.
     * <!-- end-model-doc -->
     * @see #IDR
     * @model
     * @generated
     * @ordered
     */
    public static final int IDR_VALUE = 78;

    /**
     * The '<em><b>SYP</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Syrian pound.
     * <!-- end-model-doc -->
     * @see #SYP
     * @model
     * @generated
     * @ordered
     */
    public static final int SYP_VALUE = 79;

    /**
     * The '<em><b>MMK</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Myanma kyat.
     * <!-- end-model-doc -->
     * @see #MMK
     * @model
     * @generated
     * @ordered
     */
    public static final int MMK_VALUE = 80;

    /**
     * The '<em><b>XCD</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * East Caribbean dollar.
     * <!-- end-model-doc -->
     * @see #XCD
     * @model
     * @generated
     * @ordered
     */
    public static final int XCD_VALUE = 81;

    /**
     * The '<em><b>SZL</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Lilangeni.
     * <!-- end-model-doc -->
     * @see #SZL
     * @model
     * @generated
     * @ordered
     */
    public static final int SZL_VALUE = 82;

    /**
     * The '<em><b>BYR</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Belarusian ruble.
     * <!-- end-model-doc -->
     * @see #BYR
     * @model
     * @generated
     * @ordered
     */
    public static final int BYR_VALUE = 83;

    /**
     * The '<em><b>MNT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Mongolian tugrik.
     * <!-- end-model-doc -->
     * @see #MNT
     * @model
     * @generated
     * @ordered
     */
    public static final int MNT_VALUE = 84;

    /**
     * The '<em><b>GBP</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Pound sterling.
     * <!-- end-model-doc -->
     * @see #GBP
     * @model
     * @generated
     * @ordered
     */
    public static final int GBP_VALUE = 85;

    /**
     * The '<em><b>BZD</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Belize dollar.
     * <!-- end-model-doc -->
     * @see #BZD
     * @model
     * @generated
     * @ordered
     */
    public static final int BZD_VALUE = 86;

    /**
     * The '<em><b>MOP</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Macanese pataca.
     * <!-- end-model-doc -->
     * @see #MOP
     * @model
     * @generated
     * @ordered
     */
    public static final int MOP_VALUE = 87;

    /**
     * The '<em><b>SDG</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Sudanese pound.
     * <!-- end-model-doc -->
     * @see #SDG
     * @model
     * @generated
     * @ordered
     */
    public static final int SDG_VALUE = 88;

    /**
     * The '<em><b>FKP</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Falkland Islands pound.
     * <!-- end-model-doc -->
     * @see #FKP
     * @model
     * @generated
     * @ordered
     */
    public static final int FKP_VALUE = 89;

    /**
     * The '<em><b>SEK</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Swedish krona/kronor.
     * <!-- end-model-doc -->
     * @see #SEK
     * @model
     * @generated
     * @ordered
     */
    public static final int SEK_VALUE = 90;

    /**
     * The '<em><b>QAR</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Qatari rial.
     * <!-- end-model-doc -->
     * @see #QAR
     * @model
     * @generated
     * @ordered
     */
    public static final int QAR_VALUE = 91;

    /**
     * The '<em><b>BDT</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Bangladeshi taka.
     * <!-- end-model-doc -->
     * @see #BDT
     * @model
     * @generated
     * @ordered
     */
    public static final int BDT_VALUE = 92;

    /**
     * The '<em><b>LYD</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Libyan dinar.
     * <!-- end-model-doc -->
     * @see #LYD
     * @model
     * @generated
     * @ordered
     */
    public static final int LYD_VALUE = 93;

    /**
     * The '<em><b>SGD</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Singapore dollar.
     * <!-- end-model-doc -->
     * @see #SGD
     * @model
     * @generated
     * @ordered
     */
    public static final int SGD_VALUE = 94;

    /**
     * The '<em><b>DJF</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Djiboutian franc.
     * <!-- end-model-doc -->
     * @see #DJF
     * @model
     * @generated
     * @ordered
     */
    public static final int DJF_VALUE = 95;

    /**
     * The '<em><b>HRK</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Croatian kuna.
     * <!-- end-model-doc -->
     * @see #HRK
     * @model
     * @generated
     * @ordered
     */
    public static final int HRK_VALUE = 96;

    /**
     * The '<em><b>JOD</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Jordanian dinar.
     * <!-- end-model-doc -->
     * @see #JOD
     * @model
     * @generated
     * @ordered
     */
    public static final int JOD_VALUE = 97;

    /**
     * The '<em><b>LSL</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Lesotho loti.
     * <!-- end-model-doc -->
     * @see #LSL
     * @model
     * @generated
     * @ordered
     */
    public static final int LSL_VALUE = 98;

    /**
     * The '<em><b>HKD</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Hong Kong dollar.
     * <!-- end-model-doc -->
     * @see #HKD
     * @model
     * @generated
     * @ordered
     */
    public static final int HKD_VALUE = 99;

    /**
     * The '<em><b>LTL</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Lithuanian litas.
     * <!-- end-model-doc -->
     * @see #LTL
     * @model
     * @generated
     * @ordered
     */
    public static final int LTL_VALUE = 100;

    /**
     * The '<em><b>SAR</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Saudi riyal.
     * <!-- end-model-doc -->
     * @see #SAR
     * @model
     * @generated
     * @ordered
     */
    public static final int SAR_VALUE = 101;

    /**
     * The '<em><b>SBD</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Solomon Islands dollar.
     * <!-- end-model-doc -->
     * @see #SBD
     * @model
     * @generated
     * @ordered
     */
    public static final int SBD_VALUE = 102;

    /**
     * The '<em><b>JPY</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Japanese yen.
     * <!-- end-model-doc -->
     * @see #JPY
     * @model
     * @generated
     * @ordered
     */
    public static final int JPY_VALUE = 103;

    /**
     * The '<em><b>BAM</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Bosnia and Herzegovina convertible mark.
     * <!-- end-model-doc -->
     * @see #BAM
     * @model
     * @generated
     * @ordered
     */
    public static final int BAM_VALUE = 104;

    /**
     * The '<em><b>FJD</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Fiji dollar.
     * <!-- end-model-doc -->
     * @see #FJD
     * @model
     * @generated
     * @ordered
     */
    public static final int FJD_VALUE = 105;

    /**
     * The '<em><b>NZD</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * New Zealand dollar.
     * <!-- end-model-doc -->
     * @see #NZD
     * @model
     * @generated
     * @ordered
     */
    public static final int NZD_VALUE = 106;

    /**
     * The '<em><b>BBD</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Barbados dollar.
     * <!-- end-model-doc -->
     * @see #BBD
     * @model
     * @generated
     * @ordered
     */
    public static final int BBD_VALUE = 107;

    /**
     * The '<em><b>UGX</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Ugandan shilling.
     * <!-- end-model-doc -->
     * @see #UGX
     * @model
     * @generated
     * @ordered
     */
    public static final int UGX_VALUE = 108;

    /**
     * The '<em><b>LVL</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Latvian lats.
     * <!-- end-model-doc -->
     * @see #LVL
     * @model
     * @generated
     * @ordered
     */
    public static final int LVL_VALUE = 109;

    /**
     * The '<em><b>SCR</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Seychelles rupee.
     * <!-- end-model-doc -->
     * @see #SCR
     * @model
     * @generated
     * @ordered
     */
    public static final int SCR_VALUE = 110;

    /**
     * The '<em><b>HNL</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Honduran lempira.
     * <!-- end-model-doc -->
     * @see #HNL
     * @model
     * @generated
     * @ordered
     */
    public static final int HNL_VALUE = 111;

    /**
     * The '<em><b>SLL</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Sierra Leonean leone.
     * <!-- end-model-doc -->
     * @see #SLL
     * @model
     * @generated
     * @ordered
     */
    public static final int SLL_VALUE = 112;

    /**
     * The '<em><b>MAD</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Moroccan dirham.
     * <!-- end-model-doc -->
     * @see #MAD
     * @model
     * @generated
     * @ordered
     */
    public static final int MAD_VALUE = 113;

    /**
     * The '<em><b>DOP</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Dominican peso.
     * <!-- end-model-doc -->
     * @see #DOP
     * @model
     * @generated
     * @ordered
     */
    public static final int DOP_VALUE = 114;

    /**
     * The '<em><b>BMD</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Bermudian dollar (customarily known as Bermuda dollar).
     * <!-- end-model-doc -->
     * @see #BMD
     * @model
     * @generated
     * @ordered
     */
    public static final int BMD_VALUE = 115;

    /**
     * The '<em><b>USD</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * United States dollar.
     * <!-- end-model-doc -->
     * @see #USD
     * @model
     * @generated
     * @ordered
     */
    public static final int USD_VALUE = 116;

    /**
     * The '<em><b>SOS</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Somali shilling.
     * <!-- end-model-doc -->
     * @see #SOS
     * @model
     * @generated
     * @ordered
     */
    public static final int SOS_VALUE = 117;

    /**
     * The '<em><b>BND</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Brunei dollar.
     * <!-- end-model-doc -->
     * @see #BND
     * @model
     * @generated
     * @ordered
     */
    public static final int BND_VALUE = 118;

    /**
     * The '<em><b>SHP</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Saint Helena pound.
     * <!-- end-model-doc -->
     * @see #SHP
     * @model
     * @generated
     * @ordered
     */
    public static final int SHP_VALUE = 119;

    /**
     * The '<em><b>BGN</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Bulgarian lev.
     * <!-- end-model-doc -->
     * @see #BGN
     * @model
     * @generated
     * @ordered
     */
    public static final int BGN_VALUE = 120;

    /**
     * The '<em><b>DKK</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Danish krone.
     * <!-- end-model-doc -->
     * @see #DKK
     * @model
     * @generated
     * @ordered
     */
    public static final int DKK_VALUE = 121;

    /**
     * The '<em><b>HTG</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Haitian gourde.
     * <!-- end-model-doc -->
     * @see #HTG
     * @model
     * @generated
     * @ordered
     */
    public static final int HTG_VALUE = 122;

    /**
     * The '<em><b>BHD</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Bahraini dinar.
     * <!-- end-model-doc -->
     * @see #BHD
     * @model
     * @generated
     * @ordered
     */
    public static final int BHD_VALUE = 123;

    /**
     * The '<em><b>HUF</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Hungarian forint.
     * <!-- end-model-doc -->
     * @see #HUF
     * @model
     * @generated
     * @ordered
     */
    public static final int HUF_VALUE = 124;

    /**
     * The '<em><b>BIF</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Burundian franc.
     * <!-- end-model-doc -->
     * @see #BIF
     * @model
     * @generated
     * @ordered
     */
    public static final int BIF_VALUE = 125;

    /**
     * The '<em><b>WST</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Samoan tala.
     * <!-- end-model-doc -->
     * @see #WST
     * @model
     * @generated
     * @ordered
     */
    public static final int WST_VALUE = 126;

    /**
     * The '<em><b>CUP</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Cuban peso.
     * <!-- end-model-doc -->
     * @see #CUP
     * @model
     * @generated
     * @ordered
     */
    public static final int CUP_VALUE = 127;

    /**
     * The '<em><b>CUC</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Cuban convertible peso.
     * <!-- end-model-doc -->
     * @see #CUC
     * @model
     * @generated
     * @ordered
     */
    public static final int CUC_VALUE = 128;

    /**
     * The '<em><b>TWD</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * New Taiwan dollar.
     * <!-- end-model-doc -->
     * @see #TWD
     * @model
     * @generated
     * @ordered
     */
    public static final int TWD_VALUE = 129;

    /**
     * The '<em><b>RSD</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Serbian dinar.
     * <!-- end-model-doc -->
     * @see #RSD
     * @model
     * @generated
     * @ordered
     */
    public static final int RSD_VALUE = 130;

    /**
     * The '<em><b>CVE</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Cape Verde escudo.
     * <!-- end-model-doc -->
     * @see #CVE
     * @model
     * @generated
     * @ordered
     */
    public static final int CVE_VALUE = 131;

    /**
     * The '<em><b>ARS</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Argentine peso.
     * <!-- end-model-doc -->
     * @see #ARS
     * @model
     * @generated
     * @ordered
     */
    public static final int ARS_VALUE = 132;

    /**
     * The '<em><b>RUB</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Russian rouble.
     * <!-- end-model-doc -->
     * @see #RUB
     * @model
     * @generated
     * @ordered
     */
    public static final int RUB_VALUE = 133;

    /**
     * The '<em><b>TZS</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Tanzanian shilling.
     * <!-- end-model-doc -->
     * @see #TZS
     * @model
     * @generated
     * @ordered
     */
    public static final int TZS_VALUE = 134;

    /**
     * The '<em><b>AUD</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Australian dollar.
     * <!-- end-model-doc -->
     * @see #AUD
     * @model
     * @generated
     * @ordered
     */
    public static final int AUD_VALUE = 135;

    /**
     * The '<em><b>LBP</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Lebanese pound.
     * <!-- end-model-doc -->
     * @see #LBP
     * @model
     * @generated
     * @ordered
     */
    public static final int LBP_VALUE = 136;

    /**
     * The '<em><b>TRY</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Turkish lira.
     * <!-- end-model-doc -->
     * @see #TRY
     * @model
     * @generated
     * @ordered
     */
    public static final int TRY_VALUE = 137;

    /**
     * The '<em><b>GYD</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Guyanese dollar.
     * <!-- end-model-doc -->
     * @see #GYD
     * @model
     * @generated
     * @ordered
     */
    public static final int GYD_VALUE = 138;

    /**
     * The '<em><b>AMD</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Armenian dram.
     * <!-- end-model-doc -->
     * @see #AMD
     * @model
     * @generated
     * @ordered
     */
    public static final int AMD_VALUE = 139;

    /**
     * The '<em><b>EUR</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Euro.
     * <!-- end-model-doc -->
     * @see #EUR
     * @model
     * @generated
     * @ordered
     */
    public static final int EUR_VALUE = 140;

    /**
     * The '<em><b>ANG</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Netherlands Antillean guilder.
     * <!-- end-model-doc -->
     * @see #ANG
     * @model
     * @generated
     * @ordered
     */
    public static final int ANG_VALUE = 141;

    /**
     * The '<em><b>CRC</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Costa Rican colon.
     * <!-- end-model-doc -->
     * @see #CRC
     * @model
     * @generated
     * @ordered
     */
    public static final int CRC_VALUE = 142;

    /**
     * The '<em><b>NGN</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Nigerian naira.
     * <!-- end-model-doc -->
     * @see #NGN
     * @model
     * @generated
     * @ordered
     */
    public static final int NGN_VALUE = 143;

    /**
     * The '<em><b>PKR</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Pakistani rupee.
     * <!-- end-model-doc -->
     * @see #PKR
     * @model
     * @generated
     * @ordered
     */
    public static final int PKR_VALUE = 144;

    /**
     * The '<em><b>RON</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Romanian new leu.
     * <!-- end-model-doc -->
     * @see #RON
     * @model
     * @generated
     * @ordered
     */
    public static final int RON_VALUE = 145;

    /**
     * The '<em><b>TTD</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Trinidad and Tobago dollar.
     * <!-- end-model-doc -->
     * @see #TTD
     * @model
     * @generated
     * @ordered
     */
    public static final int TTD_VALUE = 146;

    /**
     * The '<em><b>AOA</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Angolan kwanza.
     * <!-- end-model-doc -->
     * @see #AOA
     * @model
     * @generated
     * @ordered
     */
    public static final int AOA_VALUE = 147;

    /**
     * The '<em><b>PLN</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Polish zloty.
     * <!-- end-model-doc -->
     * @see #PLN
     * @model
     * @generated
     * @ordered
     */
    public static final int PLN_VALUE = 148;

    /**
     * The '<em><b>NIO</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Cordoba oro.
     * <!-- end-model-doc -->
     * @see #NIO
     * @model
     * @generated
     * @ordered
     */
    public static final int NIO_VALUE = 149;

    /**
     * The '<em><b>UAH</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Ukrainian hryvnia.
     * <!-- end-model-doc -->
     * @see #UAH
     * @model
     * @generated
     * @ordered
     */
    public static final int UAH_VALUE = 150;

    /**
     * The '<em><b>AZN</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Azerbaijani manat.
     * <!-- end-model-doc -->
     * @see #AZN
     * @model
     * @generated
     * @ordered
     */
    public static final int AZN_VALUE = 151;

    /**
     * The '<em><b>PYG</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Paraguayan guaraní.
     * <!-- end-model-doc -->
     * @see #PYG
     * @model
     * @generated
     * @ordered
     */
    public static final int PYG_VALUE = 152;

    /**
     * The '<em><b>JMD</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Jamaican dollar.
     * <!-- end-model-doc -->
     * @see #JMD
     * @model
     * @generated
     * @ordered
     */
    public static final int JMD_VALUE = 153;

    /**
     * The '<em><b>LRD</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Liberian dollar.
     * <!-- end-model-doc -->
     * @see #LRD
     * @model
     * @generated
     * @ordered
     */
    public static final int LRD_VALUE = 154;

    /**
     * The '<em><b>NOK</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Norwegian krone.
     * <!-- end-model-doc -->
     * @see #NOK
     * @model
     * @generated
     * @ordered
     */
    public static final int NOK_VALUE = 155;

    /**
     * The '<em><b>RWF</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Rwandan franc.
     * <!-- end-model-doc -->
     * @see #RWF
     * @model
     * @generated
     * @ordered
     */
    public static final int RWF_VALUE = 156;

    /**
     * The '<em><b>CZK</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Czech koruna.
     * <!-- end-model-doc -->
     * @see #CZK
     * @model
     * @generated
     * @ordered
     */
    public static final int CZK_VALUE = 157;

    /**
     * The '<em><b>LKR</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Sri Lanka rupee.
     * <!-- end-model-doc -->
     * @see #LKR
     * @model
     * @generated
     * @ordered
     */
    public static final int LKR_VALUE = 158;

    /**
     * The '<em><b>NPR</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Nepalese rupee.
     * <!-- end-model-doc -->
     * @see #NPR
     * @model
     * @generated
     * @ordered
     */
    public static final int NPR_VALUE = 159;

    /**
     * The '<em><b>YER</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Yemeni rial.
     * <!-- end-model-doc -->
     * @see #YER
     * @model
     * @generated
     * @ordered
     */
    public static final int YER_VALUE = 160;

    /**
     * The '<em><b>AWG</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Aruban florin.
     * <!-- end-model-doc -->
     * @see #AWG
     * @model
     * @generated
     * @ordered
     */
    public static final int AWG_VALUE = 161;

    /**
     * An array of all the '<em><b>Currency</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final Currency[] VALUES_ARRAY = new Currency[] {
            IQD,
            GMD,
            XOF,
            MYR,
            GNF,
            THB,
            XPF,
            IRR,
            MZN,
            KWD,
            ISK,
            PAB,
            VND,
            CHF,
            GHS,
            KPW,
            EEK,
            MUR,
            GIP,
            CAD,
            KRW,
            MVR,
            INR,
            EGP,
            MWK,
            MXN,
            CDF,
            TOP,
            PGK,
            CNY,
            ERN,
            PHP,
            COU,
            COP,
            ETB,
            LAK,
            VUV,
            ALL,
            TJS,
            AED,
            KYD,
            ZWL,
            AFN,
            KZT,
            PEN,
            TMT,
            CLF,
            NAD,
            TND,
            GTQ,
            CLP,
            BSD,
            BTN,
            KES,
            UYU,
            OMR,
            UZS,
            DZD,
            MKD,
            XAF,
            KGS,
            MDL,
            BOB,
            BOV,
            SRD,
            MGA,
            BRL,
            ZAR,
            STD,
            GEL,
            KMF,
            MRO,
            VEF,
            ZMK,
            ILS,
            BWP,
            KHR,
            IDR,
            SYP,
            MMK,
            XCD,
            SZL,
            BYR,
            MNT,
            GBP,
            BZD,
            MOP,
            SDG,
            FKP,
            SEK,
            QAR,
            BDT,
            LYD,
            SGD,
            DJF,
            HRK,
            JOD,
            LSL,
            HKD,
            LTL,
            SAR,
            SBD,
            JPY,
            BAM,
            FJD,
            NZD,
            BBD,
            UGX,
            LVL,
            SCR,
            HNL,
            SLL,
            MAD,
            DOP,
            BMD,
            USD,
            SOS,
            BND,
            SHP,
            BGN,
            DKK,
            HTG,
            BHD,
            HUF,
            BIF,
            WST,
            CUP,
            CUC,
            TWD,
            RSD,
            CVE,
            ARS,
            RUB,
            TZS,
            AUD,
            LBP,
            TRY,
            GYD,
            AMD,
            EUR,
            ANG,
            CRC,
            NGN,
            PKR,
            RON,
            TTD,
            AOA,
            PLN,
            NIO,
            UAH,
            AZN,
            PYG,
            JMD,
            LRD,
            NOK,
            RWF,
            CZK,
            LKR,
            NPR,
            YER,
            AWG,
    };

    /**
     * A public read-only list of all the '<em><b>Currency</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< Currency > VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Currency</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static Currency get( String literal ) {
        for( Currency result : VALUES_ARRAY ) {
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Currency</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static Currency getByName( String name ) {
        for( Currency result : VALUES_ARRAY ) {
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Currency</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static Currency get( int value ) {
        switch( value ) {
        case IQD_VALUE:
            return IQD;
        case GMD_VALUE:
            return GMD;
        case XOF_VALUE:
            return XOF;
        case MYR_VALUE:
            return MYR;
        case GNF_VALUE:
            return GNF;
        case THB_VALUE:
            return THB;
        case XPF_VALUE:
            return XPF;
        case IRR_VALUE:
            return IRR;
        case MZN_VALUE:
            return MZN;
        case KWD_VALUE:
            return KWD;
        case ISK_VALUE:
            return ISK;
        case PAB_VALUE:
            return PAB;
        case VND_VALUE:
            return VND;
        case CHF_VALUE:
            return CHF;
        case GHS_VALUE:
            return GHS;
        case KPW_VALUE:
            return KPW;
        case EEK_VALUE:
            return EEK;
        case MUR_VALUE:
            return MUR;
        case GIP_VALUE:
            return GIP;
        case CAD_VALUE:
            return CAD;
        case KRW_VALUE:
            return KRW;
        case MVR_VALUE:
            return MVR;
        case INR_VALUE:
            return INR;
        case EGP_VALUE:
            return EGP;
        case MWK_VALUE:
            return MWK;
        case MXN_VALUE:
            return MXN;
        case CDF_VALUE:
            return CDF;
        case TOP_VALUE:
            return TOP;
        case PGK_VALUE:
            return PGK;
        case CNY_VALUE:
            return CNY;
        case ERN_VALUE:
            return ERN;
        case PHP_VALUE:
            return PHP;
        case COU_VALUE:
            return COU;
        case COP_VALUE:
            return COP;
        case ETB_VALUE:
            return ETB;
        case LAK_VALUE:
            return LAK;
        case VUV_VALUE:
            return VUV;
        case ALL_VALUE:
            return ALL;
        case TJS_VALUE:
            return TJS;
        case AED_VALUE:
            return AED;
        case KYD_VALUE:
            return KYD;
        case ZWL_VALUE:
            return ZWL;
        case AFN_VALUE:
            return AFN;
        case KZT_VALUE:
            return KZT;
        case PEN_VALUE:
            return PEN;
        case TMT_VALUE:
            return TMT;
        case CLF_VALUE:
            return CLF;
        case NAD_VALUE:
            return NAD;
        case TND_VALUE:
            return TND;
        case GTQ_VALUE:
            return GTQ;
        case CLP_VALUE:
            return CLP;
        case BSD_VALUE:
            return BSD;
        case BTN_VALUE:
            return BTN;
        case KES_VALUE:
            return KES;
        case UYU_VALUE:
            return UYU;
        case OMR_VALUE:
            return OMR;
        case UZS_VALUE:
            return UZS;
        case DZD_VALUE:
            return DZD;
        case MKD_VALUE:
            return MKD;
        case XAF_VALUE:
            return XAF;
        case KGS_VALUE:
            return KGS;
        case MDL_VALUE:
            return MDL;
        case BOB_VALUE:
            return BOB;
        case BOV_VALUE:
            return BOV;
        case SRD_VALUE:
            return SRD;
        case MGA_VALUE:
            return MGA;
        case BRL_VALUE:
            return BRL;
        case ZAR_VALUE:
            return ZAR;
        case STD_VALUE:
            return STD;
        case GEL_VALUE:
            return GEL;
        case KMF_VALUE:
            return KMF;
        case MRO_VALUE:
            return MRO;
        case VEF_VALUE:
            return VEF;
        case ZMK_VALUE:
            return ZMK;
        case ILS_VALUE:
            return ILS;
        case BWP_VALUE:
            return BWP;
        case KHR_VALUE:
            return KHR;
        case IDR_VALUE:
            return IDR;
        case SYP_VALUE:
            return SYP;
        case MMK_VALUE:
            return MMK;
        case XCD_VALUE:
            return XCD;
        case SZL_VALUE:
            return SZL;
        case BYR_VALUE:
            return BYR;
        case MNT_VALUE:
            return MNT;
        case GBP_VALUE:
            return GBP;
        case BZD_VALUE:
            return BZD;
        case MOP_VALUE:
            return MOP;
        case SDG_VALUE:
            return SDG;
        case FKP_VALUE:
            return FKP;
        case SEK_VALUE:
            return SEK;
        case QAR_VALUE:
            return QAR;
        case BDT_VALUE:
            return BDT;
        case LYD_VALUE:
            return LYD;
        case SGD_VALUE:
            return SGD;
        case DJF_VALUE:
            return DJF;
        case HRK_VALUE:
            return HRK;
        case JOD_VALUE:
            return JOD;
        case LSL_VALUE:
            return LSL;
        case HKD_VALUE:
            return HKD;
        case LTL_VALUE:
            return LTL;
        case SAR_VALUE:
            return SAR;
        case SBD_VALUE:
            return SBD;
        case JPY_VALUE:
            return JPY;
        case BAM_VALUE:
            return BAM;
        case FJD_VALUE:
            return FJD;
        case NZD_VALUE:
            return NZD;
        case BBD_VALUE:
            return BBD;
        case UGX_VALUE:
            return UGX;
        case LVL_VALUE:
            return LVL;
        case SCR_VALUE:
            return SCR;
        case HNL_VALUE:
            return HNL;
        case SLL_VALUE:
            return SLL;
        case MAD_VALUE:
            return MAD;
        case DOP_VALUE:
            return DOP;
        case BMD_VALUE:
            return BMD;
        case USD_VALUE:
            return USD;
        case SOS_VALUE:
            return SOS;
        case BND_VALUE:
            return BND;
        case SHP_VALUE:
            return SHP;
        case BGN_VALUE:
            return BGN;
        case DKK_VALUE:
            return DKK;
        case HTG_VALUE:
            return HTG;
        case BHD_VALUE:
            return BHD;
        case HUF_VALUE:
            return HUF;
        case BIF_VALUE:
            return BIF;
        case WST_VALUE:
            return WST;
        case CUP_VALUE:
            return CUP;
        case CUC_VALUE:
            return CUC;
        case TWD_VALUE:
            return TWD;
        case RSD_VALUE:
            return RSD;
        case CVE_VALUE:
            return CVE;
        case ARS_VALUE:
            return ARS;
        case RUB_VALUE:
            return RUB;
        case TZS_VALUE:
            return TZS;
        case AUD_VALUE:
            return AUD;
        case LBP_VALUE:
            return LBP;
        case TRY_VALUE:
            return TRY;
        case GYD_VALUE:
            return GYD;
        case AMD_VALUE:
            return AMD;
        case EUR_VALUE:
            return EUR;
        case ANG_VALUE:
            return ANG;
        case CRC_VALUE:
            return CRC;
        case NGN_VALUE:
            return NGN;
        case PKR_VALUE:
            return PKR;
        case RON_VALUE:
            return RON;
        case TTD_VALUE:
            return TTD;
        case AOA_VALUE:
            return AOA;
        case PLN_VALUE:
            return PLN;
        case NIO_VALUE:
            return NIO;
        case UAH_VALUE:
            return UAH;
        case AZN_VALUE:
            return AZN;
        case PYG_VALUE:
            return PYG;
        case JMD_VALUE:
            return JMD;
        case LRD_VALUE:
            return LRD;
        case NOK_VALUE:
            return NOK;
        case RWF_VALUE:
            return RWF;
        case CZK_VALUE:
            return CZK;
        case LKR_VALUE:
            return LKR;
        case NPR_VALUE:
            return NPR;
        case YER_VALUE:
            return YER;
        case AWG_VALUE:
            return AWG;
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
    private Currency( int value, String name, String literal ) {
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

} //Currency

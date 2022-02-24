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
 * A representation of the literals of the enumeration '<em><b>Fuel Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Type of fuel.
 * <!-- end-model-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage#getFuelType()
 * @model
 * @generated
 */
public enum FuelType implements Enumerator {
    /**
     * The '<em><b>Oil Shale</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Oil Shale.
     * <!-- end-model-doc -->
     * @see #OIL_SHALE_VALUE
     * @generated
     * @ordered
     */
    OIL_SHALE( 1, "oilShale", "oilShale" ),

    /**
     * The '<em><b>Peat</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Peat.
     * <!-- end-model-doc -->
     * @see #PEAT_VALUE
     * @generated
     * @ordered
     */
    PEAT( 2, "peat", "peat" ),
    /**
     * The '<em><b>Lignite</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The fuel is lignite coal.  Note that this is a special type of coal, so the other enum of coal is reserved for hard coal types or if the exact type of coal is not known.
     * <!-- end-model-doc -->
     * @see #LIGNITE_VALUE
     * @generated
     * @ordered
     */
    LIGNITE( 3, "lignite", "lignite" ),

    /**
     * The '<em><b>Gas</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Natural gas.
     * <!-- end-model-doc -->
     * @see #GAS_VALUE
     * @generated
     * @ordered
     */
    GAS( 4, "gas", "gas" ),
    /**
     * The '<em><b>Oil</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Oil.
     * <!-- end-model-doc -->
     * @see #OIL_VALUE
     * @generated
     * @ordered
     */
    OIL( 5, "oil", "oil" ),
    /**
     * The '<em><b>Other</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Any fuel type not included in the rest of the enumerated value.
     * <!-- end-model-doc -->
     * @see #OTHER_VALUE
     * @generated
     * @ordered
     */
    OTHER( 6, "other", "other" ),

    /**
     * The '<em><b>Coal Derived Gas</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Coal derived gas.
     * <!-- end-model-doc -->
     * @see #COAL_DERIVED_GAS_VALUE
     * @generated
     * @ordered
     */
    COAL_DERIVED_GAS( 7, "coalDerivedGas", "coalDerivedGas" ),
    /**
     * The '<em><b>Hard Coal</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Hard coal.
     * <!-- end-model-doc -->
     * @see #HARD_COAL_VALUE
     * @generated
     * @ordered
     */
    HARD_COAL( 8, "hardCoal", "hardCoal" ),
    /**
     * The '<em><b>Brown Coal Lignite</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Brown coal lignite.
     * <!-- end-model-doc -->
     * @see #BROWN_COAL_LIGNITE_VALUE
     * @generated
     * @ordered
     */
    BROWN_COAL_LIGNITE( 9, "brownCoalLignite", "brownCoalLignite" ),
    /**
     * The '<em><b>Coal</b></em>' literal object.
     * <!-- begin-user-doc -->
    * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Generic coal, not including lignite type.
     * <!-- end-model-doc -->
     * @see #COAL_VALUE
     * @generated
     * @ordered
     */
    COAL( 10, "coal", "coal" );

    /**
     * The '<em><b>Oil Shale</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Oil Shale.
     * <!-- end-model-doc -->
     * @see #OIL_SHALE
     * @model name="oilShale"
     * @generated
     * @ordered
     */
    public static final int OIL_SHALE_VALUE = 1;

    /**
     * The '<em><b>Peat</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Peat.
     * <!-- end-model-doc -->
     * @see #PEAT
     * @model name="peat"
     * @generated
     * @ordered
     */
    public static final int PEAT_VALUE = 2;

    /**
     * The '<em><b>Lignite</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The fuel is lignite coal.  Note that this is a special type of coal, so the other enum of coal is reserved for hard coal types or if the exact type of coal is not known.
     * <!-- end-model-doc -->
     * @see #LIGNITE
     * @model name="lignite"
     * @generated
     * @ordered
     */
    public static final int LIGNITE_VALUE = 3;

    /**
     * The '<em><b>Gas</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Natural gas.
     * <!-- end-model-doc -->
     * @see #GAS
     * @model name="gas"
     * @generated
     * @ordered
     */
    public static final int GAS_VALUE = 4;

    /**
     * The '<em><b>Oil</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Oil.
     * <!-- end-model-doc -->
     * @see #OIL
     * @model name="oil"
     * @generated
     * @ordered
     */
    public static final int OIL_VALUE = 5;

    /**
     * The '<em><b>Other</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Any fuel type not included in the rest of the enumerated value.
     * <!-- end-model-doc -->
     * @see #OTHER
     * @model name="other"
     * @generated
     * @ordered
     */
    public static final int OTHER_VALUE = 6;

    /**
     * The '<em><b>Coal Derived Gas</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Coal derived gas.
     * <!-- end-model-doc -->
     * @see #COAL_DERIVED_GAS
     * @model name="coalDerivedGas"
     * @generated
     * @ordered
     */
    public static final int COAL_DERIVED_GAS_VALUE = 7;

    /**
     * The '<em><b>Hard Coal</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Hard coal.
     * <!-- end-model-doc -->
     * @see #HARD_COAL
     * @model name="hardCoal"
     * @generated
     * @ordered
     */
    public static final int HARD_COAL_VALUE = 8;

    /**
     * The '<em><b>Brown Coal Lignite</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Brown coal lignite.
     * <!-- end-model-doc -->
     * @see #BROWN_COAL_LIGNITE
     * @model name="brownCoalLignite"
     * @generated
     * @ordered
     */
    public static final int BROWN_COAL_LIGNITE_VALUE = 9;

    /**
     * The '<em><b>Coal</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Generic coal, not including lignite type.
     * <!-- end-model-doc -->
     * @see #COAL
     * @model name="coal"
     * @generated
     * @ordered
     */
    public static final int COAL_VALUE = 10;

    /**
     * An array of all the '<em><b>Fuel Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final FuelType[] VALUES_ARRAY = new FuelType[] {
            OIL_SHALE,
            PEAT,
            LIGNITE,
            GAS,
            OIL,
            OTHER,
            COAL_DERIVED_GAS,
            HARD_COAL,
            BROWN_COAL_LIGNITE,
            COAL,
    };

    /**
     * A public read-only list of all the '<em><b>Fuel Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List< FuelType > VALUES = Collections.unmodifiableList( Arrays.asList( VALUES_ARRAY ) );

    /**
     * Returns the '<em><b>Fuel Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static FuelType get( String literal ) {
        for( FuelType result : VALUES_ARRAY ) {
            if( result.toString().equals( literal ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Fuel Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static FuelType getByName( String name ) {
        for( FuelType result : VALUES_ARRAY ) {
            if( result.getName().equals( name ) ) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>Fuel Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static FuelType get( int value ) {
        switch( value ) {
        case OIL_SHALE_VALUE:
            return OIL_SHALE;
        case PEAT_VALUE:
            return PEAT;
        case LIGNITE_VALUE:
            return LIGNITE;
        case GAS_VALUE:
            return GAS;
        case OIL_VALUE:
            return OIL;
        case OTHER_VALUE:
            return OTHER;
        case COAL_DERIVED_GAS_VALUE:
            return COAL_DERIVED_GAS;
        case HARD_COAL_VALUE:
            return HARD_COAL;
        case BROWN_COAL_LIGNITE_VALUE:
            return BROWN_COAL_LIGNITE;
        case COAL_VALUE:
            return COAL;
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
    private FuelType( int value, String name, String literal ) {
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

} //FuelType

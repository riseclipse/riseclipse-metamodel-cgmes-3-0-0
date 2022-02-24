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
package fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.EuFactory;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.EuPackage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.LimitKind;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.SolarPowerPlant;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.WindPowerPlant;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EuFactoryImpl extends EFactoryImpl implements EuFactory {
    /**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static EuFactory init() {
        try {
            EuFactory theEuFactory = ( EuFactory ) EPackage.Registry.INSTANCE.getEFactory( EuPackage.eNS_URI );
            if( theEuFactory != null ) {
                return theEuFactory;
            }
        }
        catch( Exception exception ) {
            EcorePlugin.INSTANCE.log( exception );
        }
        return new EuFactoryImpl();
    }

    /**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EuFactoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EObject create( EClass eClass ) {
        switch( eClass.getClassifierID() ) {
        case EuPackage.WIND_POWER_PLANT:
            return createWindPowerPlant();
        case EuPackage.SOLAR_POWER_PLANT:
            return createSolarPowerPlant();
        case EuPackage.BOUNDARY_POINT:
            return createBoundaryPoint();
        default:
            throw new IllegalArgumentException( "The class '" + eClass.getName() + "' is not a valid classifier" );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object createFromString( EDataType eDataType, String initialValue ) {
        switch( eDataType.getClassifierID() ) {
        case EuPackage.LIMIT_KIND:
            return createLimitKindFromString( eDataType, initialValue );
        default:
            throw new IllegalArgumentException(
                    "The datatype '" + eDataType.getName() + "' is not a valid classifier" );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String convertToString( EDataType eDataType, Object instanceValue ) {
        switch( eDataType.getClassifierID() ) {
        case EuPackage.LIMIT_KIND:
            return convertLimitKindToString( eDataType, instanceValue );
        default:
            throw new IllegalArgumentException(
                    "The datatype '" + eDataType.getName() + "' is not a valid classifier" );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SolarPowerPlant createSolarPowerPlant() {
        SolarPowerPlantImpl solarPowerPlant = new SolarPowerPlantImpl();
        return solarPowerPlant;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindPowerPlant createWindPowerPlant() {
        WindPowerPlantImpl windPowerPlant = new WindPowerPlantImpl();
        return windPowerPlant;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BoundaryPoint createBoundaryPoint() {
        BoundaryPointImpl boundaryPoint = new BoundaryPointImpl();
        return boundaryPoint;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public LimitKind createLimitKindFromString( EDataType eDataType, String initialValue ) {
        LimitKind result = LimitKind.get( initialValue );
        if( result == null ) throw new IllegalArgumentException(
                "The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'" );
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertLimitKindToString( EDataType eDataType, Object instanceValue ) {
        return instanceValue == null ? null : instanceValue.toString();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EuPackage getEuPackage() {
        return ( EuPackage ) getEPackage();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
    @Deprecated
    public static EuPackage getPackage() {
        return EuPackage.eINSTANCE;
    }

} //EuFactoryImpl

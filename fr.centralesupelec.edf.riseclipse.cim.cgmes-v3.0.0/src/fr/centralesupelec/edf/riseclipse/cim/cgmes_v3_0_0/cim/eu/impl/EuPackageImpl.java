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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.EuFactory;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.EuPackage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.impl.CimPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EuPackageImpl extends EPackageImpl implements EuPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass solarPowerPlantEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass windPowerPlantEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass boundaryPointEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum limitKindEEnum = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.EuPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private EuPackageImpl() {
        super( eNS_URI, EuFactory.eINSTANCE );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     *
     * <p>This method is used to initialize {@link EuPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @generated
     */
    public static EuPackage init() {
        if( isInited ) return ( EuPackage ) EPackage.Registry.INSTANCE.getEPackage( EuPackage.eNS_URI );

        // Obtain or create and register package
        Object registeredEuPackage = EPackage.Registry.INSTANCE.get( eNS_URI );
        EuPackageImpl theEuPackage = registeredEuPackage instanceof EuPackageImpl
                ? ( EuPackageImpl ) registeredEuPackage
                : new EuPackageImpl();

        isInited = true;

        // Obtain or create and register interdependencies
        Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage( CimPackage.eNS_URI );
        CimPackageImpl theCimPackage = ( CimPackageImpl ) ( registeredPackage instanceof CimPackageImpl
                ? registeredPackage
                : CimPackage.eINSTANCE );

        // Load packages
        theCimPackage.loadPackage();

        // Fix loaded packages
        theEuPackage.fixPackageContents();
        theCimPackage.fixPackageContents();

        // Mark meta-data to indicate it can't be changed
        theEuPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put( EuPackage.eNS_URI, theEuPackage );
        return theEuPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSolarPowerPlant() {
        if( solarPowerPlantEClass == null ) {
            solarPowerPlantEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( EuPackage.eNS_URI )
                    .getEClassifiers().get( 2 );
        }
        return solarPowerPlantEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSolarPowerPlant_SolarGeneratingUnits() {
        return ( EReference ) getSolarPowerPlant().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getWindPowerPlant() {
        if( windPowerPlantEClass == null ) {
            windPowerPlantEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( EuPackage.eNS_URI )
                    .getEClassifiers().get( 1 );
        }
        return windPowerPlantEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getWindPowerPlant_WindGeneratingUnits() {
        return ( EReference ) getWindPowerPlant().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getBoundaryPoint() {
        if( boundaryPointEClass == null ) {
            boundaryPointEClass = ( EClass ) EPackage.Registry.INSTANCE.getEPackage( EuPackage.eNS_URI )
                    .getEClassifiers().get( 3 );
        }
        return boundaryPointEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getBoundaryPoint_ToEndIsoCode() {
        return ( EAttribute ) getBoundaryPoint().getEStructuralFeatures().get( 4 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getBoundaryPoint_ToEndNameTso() {
        return ( EAttribute ) getBoundaryPoint().getEStructuralFeatures().get( 6 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getBoundaryPoint_FromEndIsoCode() {
        return ( EAttribute ) getBoundaryPoint().getEStructuralFeatures().get( 7 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getBoundaryPoint_IsExcludedFromAreaInterchange() {
        return ( EAttribute ) getBoundaryPoint().getEStructuralFeatures().get( 5 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getBoundaryPoint_ConnectivityNode() {
        return ( EReference ) getBoundaryPoint().getEStructuralFeatures().get( 0 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getBoundaryPoint_IsDirectCurrent() {
        return ( EAttribute ) getBoundaryPoint().getEStructuralFeatures().get( 2 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getBoundaryPoint_FromEndNameTso() {
        return ( EAttribute ) getBoundaryPoint().getEStructuralFeatures().get( 8 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getBoundaryPoint_FromEndName() {
        return ( EAttribute ) getBoundaryPoint().getEStructuralFeatures().get( 3 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getBoundaryPoint_ToEndName() {
        return ( EAttribute ) getBoundaryPoint().getEStructuralFeatures().get( 1 );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getLimitKind() {
        if( limitKindEEnum == null ) {
            limitKindEEnum = ( EEnum ) EPackage.Registry.INSTANCE.getEPackage( EuPackage.eNS_URI ).getEClassifiers()
                    .get( 0 );
        }
        return limitKindEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EuFactory getEuFactory() {
        return ( EuFactory ) getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isFixed = false;

    /**
     * Fixes up the loaded package, to make it appear as if it had been programmatically built.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void fixPackageContents() {
        if( isFixed ) return;
        isFixed = true;
        fixEClassifiers();
    }

    /**
     * Sets the instance class on the given classifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void fixInstanceClass( EClassifier eClassifier ) {
        if( eClassifier.getInstanceClassName() == null ) {
            eClassifier.setInstanceClassName(
                    "fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu." + eClassifier.getName() );
            setGeneratedClassName( eClassifier );
        }
    }

} //EuPackageImpl

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
package fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimObjectWithID;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.IdentifiedObject;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerSystemResource;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.EuPackage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.SolarPowerPlant;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.WindPowerPlant;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.EuPackage
 * @generated
 */
public class EuAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static EuPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EuAdapterFactory() {
        if( modelPackage == null ) {
            modelPackage = EuPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType( Object object ) {
        if( object == modelPackage ) {
            return true;
        }
        if( object instanceof EObject ) {
            return ( ( EObject ) object ).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected EuSwitch< Adapter > modelSwitch = new EuSwitch< >() {
        @Override
        public Adapter caseWindPowerPlant( WindPowerPlant object ) {
            return createWindPowerPlantAdapter();
        }

        @Override
        public Adapter caseSolarPowerPlant( SolarPowerPlant object ) {
            return createSolarPowerPlantAdapter();
        }

        @Override
        public Adapter caseBoundaryPoint( BoundaryPoint object ) {
            return createBoundaryPointAdapter();
        }

        @Override
        public Adapter caseCimObjectWithID( CimObjectWithID object ) {
            return createCimObjectWithIDAdapter();
        }

        @Override
        public Adapter caseIdentifiedObject( IdentifiedObject object ) {
            return createIdentifiedObjectAdapter();
        }

        @Override
        public Adapter casePowerSystemResource( PowerSystemResource object ) {
            return createPowerSystemResourceAdapter();
        }

        @Override
        public Adapter defaultCase( EObject object ) {
            return createEObjectAdapter();
        }
    };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter( Notifier target ) {
        return modelSwitch.doSwitch( ( EObject ) target );
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.SolarPowerPlant <em>Solar Power Plant</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.SolarPowerPlant
     * @generated
     */
    public Adapter createSolarPowerPlantAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.WindPowerPlant <em>Wind Power Plant</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.WindPowerPlant
     * @generated
     */
    public Adapter createWindPowerPlantAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint <em>Boundary Point</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint
     * @generated
     */
    public Adapter createBoundaryPointAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimObjectWithID <em>Object With ID</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimObjectWithID
     * @generated
     */
    public Adapter createCimObjectWithIDAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.IdentifiedObject <em>Identified Object</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.IdentifiedObject
     * @generated
     */
    public Adapter createIdentifiedObjectAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerSystemResource <em>Power System Resource</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerSystemResource
     * @generated
     */
    public Adapter createPowerSystemResourceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //EuAdapterFactory

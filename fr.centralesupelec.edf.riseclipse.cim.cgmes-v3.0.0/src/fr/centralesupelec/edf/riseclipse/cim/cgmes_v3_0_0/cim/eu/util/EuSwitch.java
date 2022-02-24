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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimObjectWithID;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.IdentifiedObject;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerSystemResource;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.EuPackage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.SolarPowerPlant;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.WindPowerPlant;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.EuPackage
 * @generated
 */
public class EuSwitch< T > extends Switch< T > {
    /**
     * The cached model package
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static EuPackage modelPackage;

    /**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EuSwitch() {
        if( modelPackage == null ) {
            modelPackage = EuPackage.eINSTANCE;
        }
    }

    /**
     * Checks whether this is a switch for the given package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param ePackage the package in question.
     * @return whether this is a switch for the given package.
     * @generated
     */
    @Override
    protected boolean isSwitchFor( EPackage ePackage ) {
        return ePackage == modelPackage;
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    @Override
    protected T doSwitch( int classifierID, EObject theEObject ) {
        switch( classifierID ) {
        case EuPackage.WIND_POWER_PLANT: {
            WindPowerPlant windPowerPlant = ( WindPowerPlant ) theEObject;
            T result = caseWindPowerPlant( windPowerPlant );
            if( result == null ) result = casePowerSystemResource( windPowerPlant );
            if( result == null ) result = caseIdentifiedObject( windPowerPlant );
            if( result == null ) result = caseCimObjectWithID( windPowerPlant );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case EuPackage.SOLAR_POWER_PLANT: {
            SolarPowerPlant solarPowerPlant = ( SolarPowerPlant ) theEObject;
            T result = caseSolarPowerPlant( solarPowerPlant );
            if( result == null ) result = casePowerSystemResource( solarPowerPlant );
            if( result == null ) result = caseIdentifiedObject( solarPowerPlant );
            if( result == null ) result = caseCimObjectWithID( solarPowerPlant );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        case EuPackage.BOUNDARY_POINT: {
            BoundaryPoint boundaryPoint = ( BoundaryPoint ) theEObject;
            T result = caseBoundaryPoint( boundaryPoint );
            if( result == null ) result = casePowerSystemResource( boundaryPoint );
            if( result == null ) result = caseIdentifiedObject( boundaryPoint );
            if( result == null ) result = caseCimObjectWithID( boundaryPoint );
            if( result == null ) result = defaultCase( theEObject );
            return result;
        }
        default:
            return defaultCase( theEObject );
        }
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Solar Power Plant</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Solar Power Plant</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSolarPowerPlant( SolarPowerPlant object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Wind Power Plant</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Wind Power Plant</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseWindPowerPlant( WindPowerPlant object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Boundary Point</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Boundary Point</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseBoundaryPoint( BoundaryPoint object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Object With ID</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Object With ID</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseCimObjectWithID( CimObjectWithID object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Identified Object</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Identified Object</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseIdentifiedObject( IdentifiedObject object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Power System Resource</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Power System Resource</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T casePowerSystemResource( PowerSystemResource object ) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    @Override
    public T defaultCase( EObject object ) {
        return null;
    }

} //EuSwitch

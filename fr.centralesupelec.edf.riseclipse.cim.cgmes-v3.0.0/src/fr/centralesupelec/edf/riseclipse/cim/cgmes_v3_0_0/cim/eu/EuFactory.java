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
package fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.EuPackage
 * @generated
 */
public interface EuFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EuFactory eINSTANCE = fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.impl.EuFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Solar Power Plant</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Solar Power Plant</em>'.
     * @generated
     */
    SolarPowerPlant createSolarPowerPlant();

    /**
     * Returns a new object of class '<em>Wind Power Plant</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Wind Power Plant</em>'.
     * @generated
     */
    WindPowerPlant createWindPowerPlant();

    /**
     * Returns a new object of class '<em>Boundary Point</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Boundary Point</em>'.
     * @generated
     */
    BoundaryPoint createBoundaryPoint();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    EuPackage getEuPackage();

} //EuFactory

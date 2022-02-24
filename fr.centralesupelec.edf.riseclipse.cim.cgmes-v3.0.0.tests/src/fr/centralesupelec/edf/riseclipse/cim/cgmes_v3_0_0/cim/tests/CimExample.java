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
package fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.tests;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.Diagnostician;

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimFactory;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimObjectWithID;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.ConnectivityNode;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.GeographicalRegion;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.SubGeographicalRegion;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.Substation;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.VoltageLevel;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.BoundaryPoint;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.EuFactory;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.util.CimResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * A sample utility for the '<em><b>cim</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class CimExample {
    /**
     * <!-- begin-user-doc -->
     * Load all the argument file paths or URIs as instances of the model.
     * <!-- end-user-doc -->
     * @param args the file paths or URIs.
     * @generated NOT
     */
    public static void main( String[] args ) {
        // Create a resource set to hold the resources.
        //
        ResourceSet resourceSet = new ResourceSetImpl();

        // Register the appropriate resource factory to handle all file extensions.
        //
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
                Resource.Factory.Registry.DEFAULT_EXTENSION,
                new CimResourceFactoryImpl() );

        // Register the package to ensure it is available during loading.
        //
        resourceSet.getPackageRegistry().put( CimPackage.eNS_URI,
                CimPackage.eINSTANCE );

        // If there are no arguments, emit an appropriate usage message.
        //
        if( args.length == 0 ) {
            System.out.println( "Enter a list of file paths or URIs that have content like this:" );
            try {
                Resource resource = resourceSet.createResource( URI.createURI( "http:///My.cim" ) );
                
//                GeographicalRegion geo = CimFactory.eINSTANCE.createGeographicalRegion();
//                geo.setID( "GEO_ID" );
//                geo.setName( "GEO_NAME" );
//                resource.getContents().add( geo );
//                
//                SubGeographicalRegion sgr = CimFactory.eINSTANCE.createSubGeographicalRegion();
//                sgr.setID( "SGR_ID" );
//                sgr.setName( "SGR_NAME" );
//                sgr.setRegion( geo );
//                resource.getContents().add( sgr );
//                
//                Substation sub = CimFactory.eINSTANCE.createSubstation();
//                sub.setID( "SUB_ID" );
//                sub.setMRID( "SUB_ID" );
//                sub.setName( "SUB_NAME" );
//                sub.setRegion( sgr );
//                resource.getContents().add( sub );
//                
//                VoltageLevel vl = CimFactory.eINSTANCE.createVoltageLevel();
//                vl.setID( "VL_ID" );
//                vl.setSubstation( sub );
//                resource.getContents().add( vl );
//                
                ConnectivityNode cn = CimFactory.eINSTANCE.createConnectivityNode();
                cn.setID( "CN_ID" );
//                cn.setConnectivityNodeContainer( vl );
                resource.getContents().add( cn );
                
                BoundaryPoint bp = EuFactory.eINSTANCE.createBoundaryPoint();
                bp.setID( "BP_ID" );
                cn.setBoundaryPoint( bp );
                resource.getContents().add( bp );

                resource.save( System.out, null );
            }
            catch( IOException exception ) {
                exception.printStackTrace();
            }
        }
        else {
            // Iterate over all the arguments.
            //
            for( String arg : args ) {
                // Construct the URI for the instance file.
                // The argument is treated as a file path only if it denotes an existing file.
                // Otherwise, it's directly treated as a URL.
                //
                File file = new File( arg );
                URI uri = file.isFile() ? URI.createFileURI( file.getAbsolutePath() ) : URI.createURI( arg );

                try {
                    // Demand load resource for this file.
                    //
                    Resource resource = resourceSet.getResource( uri, true );
                    System.out.println( "Loaded " + uri );

                    // Validate the contents of the loaded resource.
                    //
                    for( EObject eObject : resource.getContents() ) {
                        Diagnostic diagnostic = Diagnostician.INSTANCE.validate( eObject );
                        if( diagnostic.getSeverity() != Diagnostic.OK ) {
                            printDiagnostic( diagnostic, "" );
                        }
                    }
                }
                catch( RuntimeException exception ) {
                    System.out.println( "Problem loading " + uri );
                    exception.printStackTrace();
                }
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * Prints diagnostics with indentation.
     * <!-- end-user-doc -->
     * @param diagnostic the diagnostic to print.
     * @param indent the indentation for printing.
     * @generated
     */
    protected static void printDiagnostic( Diagnostic diagnostic, String indent ) {
        System.out.print( indent );
        System.out.println( diagnostic.getMessage() );
        for( Diagnostic child : diagnostic.getChildren() ) {
            printDiagnostic( child, indent + "  " );
        }
    }

} //CimExample

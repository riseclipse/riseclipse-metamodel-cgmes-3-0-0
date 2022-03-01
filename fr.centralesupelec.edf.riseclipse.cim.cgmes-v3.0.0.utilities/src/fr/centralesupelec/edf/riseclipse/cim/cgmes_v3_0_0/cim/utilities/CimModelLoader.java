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
package fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.utilities;

import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.resource.Resource;

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.eu.EuPackage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.util.CimResourceFactoryImpl;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.util.CimResourceSet;
import fr.centralesupelec.edf.riseclipse.cim.headerModel.ModelDescription.ModelDescriptionPackage;
import fr.centralesupelec.edf.riseclipse.util.AbstractRiseClipseConsole;
import fr.centralesupelec.edf.riseclipse.util.AbstractRiseClipseModelLoader;


public class CimModelLoader extends AbstractRiseClipseModelLoader {
    
    public CimModelLoader() {
        super();
    }
    
    public void reset() {
        super.reset( new CimResourceSet( false ));
        
        // Register the appropriate resource factory to handle all file
        // extensions.
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
            .put( Resource.Factory.Registry.DEFAULT_EXTENSION, new CimResourceFactoryImpl() );

        // Register the package to ensure it is available during loading.
        resourceSet.getPackageRegistry().put( CimPackage.eNS_URI, CimPackage.eINSTANCE );
        resourceSet.getPackageRegistry().put( EuPackage.eNS_URI, CimPackage.eINSTANCE );
        resourceSet.getPackageRegistry().put( ModelDescriptionPackage.eNS_URI, ModelDescriptionPackage.eINSTANCE );
    }

    public Resource loadWithoutValidation( String name ) {
        Object eValidator = EValidator.Registry.INSTANCE.remove( CimPackage.eINSTANCE );

        Resource resource = load( name, AbstractRiseClipseConsole.getConsole() );
        
        if( eValidator != null ) {
            EValidator.Registry.INSTANCE.put( CimPackage.eINSTANCE, eValidator );
        }
        return resource;
    }
    
    public static void main( String[] args ) {
        CimModelLoader loader = new CimModelLoader();
        
        for( int i = 0; i < args.length; ++i ) {
            @SuppressWarnings( "unused" )
            Resource resource = loader.load( args[i], AbstractRiseClipseConsole.getConsole() );
        }
    }

}

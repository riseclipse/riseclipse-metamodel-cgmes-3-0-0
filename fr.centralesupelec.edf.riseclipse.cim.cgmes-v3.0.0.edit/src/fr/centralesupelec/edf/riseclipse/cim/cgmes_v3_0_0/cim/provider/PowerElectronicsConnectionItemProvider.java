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
package fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerElectronicsConnection;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerElectronicsConnection} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PowerElectronicsConnectionItemProvider extends RegulatingCondEqItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PowerElectronicsConnectionItemProvider( AdapterFactory adapterFactory ) {
        super( adapterFactory );
    }

    /**
     * This returns the property descriptors for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public List< IItemPropertyDescriptor > getPropertyDescriptors( Object object ) {
        if( itemPropertyDescriptors == null ) {
            super.getPropertyDescriptors( object );

            addMinQPropertyDescriptor( object );
            addPowerElectronicsUnitPropertyDescriptor( object );
            addMaxQPropertyDescriptor( object );
            addRatedSPropertyDescriptor( object );
            addRatedUPropertyDescriptor( object );
            addWindTurbineType3or4DynamicsPropertyDescriptor( object );
            addPPropertyDescriptor( object );
            addQPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Min Q feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMinQPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PowerElectronicsConnection_minQ_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PowerElectronicsConnection_minQ_feature",
                                "_UI_PowerElectronicsConnection_type" ),
                        CimPackage.eINSTANCE.getPowerElectronicsConnection_MinQ(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Rated S feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRatedSPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_PowerElectronicsConnection_ratedS_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_PowerElectronicsConnection_ratedS_feature",
                        "_UI_PowerElectronicsConnection_type" ),
                CimPackage.eINSTANCE.getPowerElectronicsConnection_RatedS(),
                true,
                false,
                false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Rated U feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRatedUPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_PowerElectronicsConnection_ratedU_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_PowerElectronicsConnection_ratedU_feature",
                        "_UI_PowerElectronicsConnection_type" ),
                CimPackage.eINSTANCE.getPowerElectronicsConnection_RatedU(),
                true,
                false,
                false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Wind Turbine Type3or4 Dynamics feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addWindTurbineType3or4DynamicsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PowerElectronicsConnection_WindTurbineType3or4Dynamics_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_PowerElectronicsConnection_WindTurbineType3or4Dynamics_feature",
                                "_UI_PowerElectronicsConnection_type" ),
                        CimPackage.eINSTANCE.getPowerElectronicsConnection_WindTurbineType3or4Dynamics(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the P feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PowerElectronicsConnection_p_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PowerElectronicsConnection_p_feature",
                                "_UI_PowerElectronicsConnection_type" ),
                        CimPackage.eINSTANCE.getPowerElectronicsConnection_P(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Q feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addQPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PowerElectronicsConnection_q_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PowerElectronicsConnection_q_feature",
                                "_UI_PowerElectronicsConnection_type" ),
                        CimPackage.eINSTANCE.getPowerElectronicsConnection_Q(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Power Electronics Unit feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPowerElectronicsUnitPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PowerElectronicsConnection_PowerElectronicsUnit_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_PowerElectronicsConnection_PowerElectronicsUnit_feature",
                                "_UI_PowerElectronicsConnection_type" ),
                        CimPackage.eINSTANCE.getPowerElectronicsConnection_PowerElectronicsUnit(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Max Q feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addMaxQPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PowerElectronicsConnection_maxQ_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_PowerElectronicsConnection_maxQ_feature",
                                "_UI_PowerElectronicsConnection_type" ),
                        CimPackage.eINSTANCE.getPowerElectronicsConnection_MaxQ(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This returns PowerElectronicsConnection.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/PowerElectronicsConnection" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( PowerElectronicsConnection ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_PowerElectronicsConnection_type" )
                : getString( "_UI_PowerElectronicsConnection_type" ) + " " + label;
    }

    /**
     * This handles model notifications by calling {@link #updateChildren} to update any cached
     * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void notifyChanged( Notification notification ) {
        updateChildren( notification );

        switch( notification.getFeatureID( PowerElectronicsConnection.class ) ) {
        case CimPackage.POWER_ELECTRONICS_CONNECTION__MIN_Q:
        case CimPackage.POWER_ELECTRONICS_CONNECTION__MAX_Q:
        case CimPackage.POWER_ELECTRONICS_CONNECTION__RATED_S:
        case CimPackage.POWER_ELECTRONICS_CONNECTION__RATED_U:
        case CimPackage.POWER_ELECTRONICS_CONNECTION__P:
        case CimPackage.POWER_ELECTRONICS_CONNECTION__Q:
            fireNotifyChanged( new ViewerNotification( notification, notification.getNotifier(), false, true ) );
            return;
        }
        super.notifyChanged( notification );
    }

    /**
     * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
     * that can be created under this object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected void collectNewChildDescriptors( Collection< Object > newChildDescriptors, Object object ) {
        super.collectNewChildDescriptors( newChildDescriptors, object );
    }

}

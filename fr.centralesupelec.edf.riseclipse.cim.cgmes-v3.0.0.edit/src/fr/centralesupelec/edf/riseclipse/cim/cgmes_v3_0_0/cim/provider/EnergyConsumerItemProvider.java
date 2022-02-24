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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergyConsumer;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.EnergyConsumer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EnergyConsumerItemProvider extends EnergyConnectionItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EnergyConsumerItemProvider( AdapterFactory adapterFactory ) {
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

            addLoadResponsePropertyDescriptor( object );
            addQfixedPctPropertyDescriptor( object );
            addQfixedPropertyDescriptor( object );
            addPfixedPctPropertyDescriptor( object );
            addPfixedPropertyDescriptor( object );
            addLoadDynamicsPropertyDescriptor( object );
            addQPropertyDescriptor( object );
            addPPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Qfixed Pct feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addQfixedPctPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_EnergyConsumer_qfixedPct_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EnergyConsumer_qfixedPct_feature",
                                "_UI_EnergyConsumer_type" ),
                        CimPackage.eINSTANCE.getEnergyConsumer_QfixedPct(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Qfixed feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addQfixedPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_EnergyConsumer_qfixed_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EnergyConsumer_qfixed_feature",
                                "_UI_EnergyConsumer_type" ),
                        CimPackage.eINSTANCE.getEnergyConsumer_Qfixed(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Pfixed feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPfixedPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_EnergyConsumer_pfixed_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EnergyConsumer_pfixed_feature",
                                "_UI_EnergyConsumer_type" ),
                        CimPackage.eINSTANCE.getEnergyConsumer_Pfixed(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Load Dynamics feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLoadDynamicsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_EnergyConsumer_LoadDynamics_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EnergyConsumer_LoadDynamics_feature",
                                "_UI_EnergyConsumer_type" ),
                        CimPackage.eINSTANCE.getEnergyConsumer_LoadDynamics(),
                        true,
                        false,
                        true,
                        null,
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
                        getString( "_UI_EnergyConsumer_q_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EnergyConsumer_q_feature",
                                "_UI_EnergyConsumer_type" ),
                        CimPackage.eINSTANCE.getEnergyConsumer_Q(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
                        getString( "_UI_EnergyConsumer_p_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EnergyConsumer_p_feature",
                                "_UI_EnergyConsumer_type" ),
                        CimPackage.eINSTANCE.getEnergyConsumer_P(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Load Response feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addLoadResponsePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_EnergyConsumer_LoadResponse_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EnergyConsumer_LoadResponse_feature",
                                "_UI_EnergyConsumer_type" ),
                        CimPackage.eINSTANCE.getEnergyConsumer_LoadResponse(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Pfixed Pct feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPfixedPctPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_EnergyConsumer_pfixedPct_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_EnergyConsumer_pfixedPct_feature",
                                "_UI_EnergyConsumer_type" ),
                        CimPackage.eINSTANCE.getEnergyConsumer_PfixedPct(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This returns EnergyConsumer.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/EnergyConsumer" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( EnergyConsumer ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_EnergyConsumer_type" )
                : getString( "_UI_EnergyConsumer_type" ) + " " + label;
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

        switch( notification.getFeatureID( EnergyConsumer.class ) ) {
        case CimPackage.ENERGY_CONSUMER__QFIXED_PCT:
        case CimPackage.ENERGY_CONSUMER__QFIXED:
        case CimPackage.ENERGY_CONSUMER__PFIXED_PCT:
        case CimPackage.ENERGY_CONSUMER__PFIXED:
        case CimPackage.ENERGY_CONSUMER__Q:
        case CimPackage.ENERGY_CONSUMER__P:
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

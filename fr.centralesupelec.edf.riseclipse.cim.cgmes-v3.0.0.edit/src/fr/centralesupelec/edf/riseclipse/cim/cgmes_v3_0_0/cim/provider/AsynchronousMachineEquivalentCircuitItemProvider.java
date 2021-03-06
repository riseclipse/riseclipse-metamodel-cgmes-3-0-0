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

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineEquivalentCircuit;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachineEquivalentCircuit} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AsynchronousMachineEquivalentCircuitItemProvider extends AsynchronousMachineDynamicsItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AsynchronousMachineEquivalentCircuitItemProvider( AdapterFactory adapterFactory ) {
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

            addXmPropertyDescriptor( object );
            addXlr2PropertyDescriptor( object );
            addXlr1PropertyDescriptor( object );
            addRr1PropertyDescriptor( object );
            addRr2PropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Xm feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addXmPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_AsynchronousMachineEquivalentCircuit_xm_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_AsynchronousMachineEquivalentCircuit_xm_feature",
                        "_UI_AsynchronousMachineEquivalentCircuit_type" ),
                CimPackage.eINSTANCE.getAsynchronousMachineEquivalentCircuit_Xm(),
                true,
                false,
                false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Xlr2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addXlr2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_AsynchronousMachineEquivalentCircuit_xlr2_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_AsynchronousMachineEquivalentCircuit_xlr2_feature",
                                "_UI_AsynchronousMachineEquivalentCircuit_type" ),
                        CimPackage.eINSTANCE.getAsynchronousMachineEquivalentCircuit_Xlr2(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Xlr1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addXlr1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_AsynchronousMachineEquivalentCircuit_xlr1_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_AsynchronousMachineEquivalentCircuit_xlr1_feature",
                                "_UI_AsynchronousMachineEquivalentCircuit_type" ),
                        CimPackage.eINSTANCE.getAsynchronousMachineEquivalentCircuit_Xlr1(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Rr1 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRr1PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_AsynchronousMachineEquivalentCircuit_rr1_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_AsynchronousMachineEquivalentCircuit_rr1_feature",
                        "_UI_AsynchronousMachineEquivalentCircuit_type" ),
                CimPackage.eINSTANCE.getAsynchronousMachineEquivalentCircuit_Rr1(),
                true,
                false,
                false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Rr2 feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRr2PropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_AsynchronousMachineEquivalentCircuit_rr2_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_AsynchronousMachineEquivalentCircuit_rr2_feature",
                        "_UI_AsynchronousMachineEquivalentCircuit_type" ),
                CimPackage.eINSTANCE.getAsynchronousMachineEquivalentCircuit_Rr2(),
                true,
                false,
                false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                null,
                null ) );
    }

    /**
     * This returns AsynchronousMachineEquivalentCircuit.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object,
                getResourceLocator().getImage( "full/obj16/AsynchronousMachineEquivalentCircuit" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( AsynchronousMachineEquivalentCircuit ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_AsynchronousMachineEquivalentCircuit_type" )
                : getString( "_UI_AsynchronousMachineEquivalentCircuit_type" ) + " " + label;
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

        switch( notification.getFeatureID( AsynchronousMachineEquivalentCircuit.class ) ) {
        case CimPackage.ASYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__XM:
        case CimPackage.ASYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__XLR2:
        case CimPackage.ASYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__XLR1:
        case CimPackage.ASYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__RR1:
        case CimPackage.ASYNCHRONOUS_MACHINE_EQUIVALENT_CIRCUIT__RR2:
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

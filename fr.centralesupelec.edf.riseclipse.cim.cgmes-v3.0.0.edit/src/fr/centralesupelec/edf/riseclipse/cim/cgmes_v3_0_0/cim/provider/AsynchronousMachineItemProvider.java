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

import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachine;
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.CimPackage;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.AsynchronousMachine} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AsynchronousMachineItemProvider extends RotatingMachineItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AsynchronousMachineItemProvider( AdapterFactory adapterFactory ) {
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

            addNominalFrequencyPropertyDescriptor( object );
            addNominalSpeedPropertyDescriptor( object );
            addAsynchronousMachineDynamicsPropertyDescriptor( object );
            addRatedMechanicalPowerPropertyDescriptor( object );
            addReversiblePropertyDescriptor( object );
            addRxLockedRotorRatioPropertyDescriptor( object );
            addEfficiencyPropertyDescriptor( object );
            addPolePairNumberPropertyDescriptor( object );
            addConverterFedDrivePropertyDescriptor( object );
            addIaIrRatioPropertyDescriptor( object );
            addAsynchronousMachineTypePropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Nominal Speed feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNominalSpeedPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_AsynchronousMachine_nominalSpeed_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AsynchronousMachine_nominalSpeed_feature",
                                "_UI_AsynchronousMachine_type" ),
                        CimPackage.eINSTANCE.getAsynchronousMachine_NominalSpeed(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Asynchronous Machine Dynamics feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAsynchronousMachineDynamicsPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_AsynchronousMachine_AsynchronousMachineDynamics_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_AsynchronousMachine_AsynchronousMachineDynamics_feature", "_UI_AsynchronousMachine_type" ),
                CimPackage.eINSTANCE.getAsynchronousMachine_AsynchronousMachineDynamics(),
                true,
                false,
                true,
                null,
                null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Rated Mechanical Power feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRatedMechanicalPowerPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_AsynchronousMachine_ratedMechanicalPower_feature" ),
                getString( "_UI_PropertyDescriptor_description", "_UI_AsynchronousMachine_ratedMechanicalPower_feature",
                        "_UI_AsynchronousMachine_type" ),
                CimPackage.eINSTANCE.getAsynchronousMachine_RatedMechanicalPower(),
                true,
                false,
                false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Reversible feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addReversiblePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_AsynchronousMachine_reversible_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AsynchronousMachine_reversible_feature",
                                "_UI_AsynchronousMachine_type" ),
                        CimPackage.eINSTANCE.getAsynchronousMachine_Reversible(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Rx Locked Rotor Ratio feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addRxLockedRotorRatioPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_AsynchronousMachine_rxLockedRotorRatio_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_AsynchronousMachine_rxLockedRotorRatio_feature", "_UI_AsynchronousMachine_type" ),
                        CimPackage.eINSTANCE.getAsynchronousMachine_RxLockedRotorRatio(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Efficiency feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addEfficiencyPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_AsynchronousMachine_efficiency_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AsynchronousMachine_efficiency_feature",
                                "_UI_AsynchronousMachine_type" ),
                        CimPackage.eINSTANCE.getAsynchronousMachine_Efficiency(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Pole Pair Number feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPolePairNumberPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_AsynchronousMachine_polePairNumber_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_AsynchronousMachine_polePairNumber_feature", "_UI_AsynchronousMachine_type" ),
                        CimPackage.eINSTANCE.getAsynchronousMachine_PolePairNumber(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Converter Fed Drive feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addConverterFedDrivePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_AsynchronousMachine_converterFedDrive_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_AsynchronousMachine_converterFedDrive_feature", "_UI_AsynchronousMachine_type" ),
                        CimPackage.eINSTANCE.getAsynchronousMachine_ConverterFedDrive(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Ia Ir Ratio feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIaIrRatioPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_AsynchronousMachine_iaIrRatio_feature" ),
                        getString( "_UI_PropertyDescriptor_description", "_UI_AsynchronousMachine_iaIrRatio_feature",
                                "_UI_AsynchronousMachine_type" ),
                        CimPackage.eINSTANCE.getAsynchronousMachine_IaIrRatio(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Asynchronous Machine Type feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addAsynchronousMachineTypePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_AsynchronousMachine_asynchronousMachineType_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_AsynchronousMachine_asynchronousMachineType_feature", "_UI_AsynchronousMachine_type" ),
                CimPackage.eINSTANCE.getAsynchronousMachine_AsynchronousMachineType(),
                true,
                false,
                false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Nominal Frequency feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addNominalFrequencyPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_AsynchronousMachine_nominalFrequency_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_AsynchronousMachine_nominalFrequency_feature", "_UI_AsynchronousMachine_type" ),
                        CimPackage.eINSTANCE.getAsynchronousMachine_NominalFrequency(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This returns AsynchronousMachine.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/AsynchronousMachine" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( AsynchronousMachine ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_AsynchronousMachine_type" )
                : getString( "_UI_AsynchronousMachine_type" ) + " " + label;
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

        switch( notification.getFeatureID( AsynchronousMachine.class ) ) {
        case CimPackage.ASYNCHRONOUS_MACHINE__NOMINAL_FREQUENCY:
        case CimPackage.ASYNCHRONOUS_MACHINE__NOMINAL_SPEED:
        case CimPackage.ASYNCHRONOUS_MACHINE__RATED_MECHANICAL_POWER:
        case CimPackage.ASYNCHRONOUS_MACHINE__REVERSIBLE:
        case CimPackage.ASYNCHRONOUS_MACHINE__RX_LOCKED_ROTOR_RATIO:
        case CimPackage.ASYNCHRONOUS_MACHINE__EFFICIENCY:
        case CimPackage.ASYNCHRONOUS_MACHINE__POLE_PAIR_NUMBER:
        case CimPackage.ASYNCHRONOUS_MACHINE__CONVERTER_FED_DRIVE:
        case CimPackage.ASYNCHRONOUS_MACHINE__IA_IR_RATIO:
        case CimPackage.ASYNCHRONOUS_MACHINE__ASYNCHRONOUS_MACHINE_TYPE:
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

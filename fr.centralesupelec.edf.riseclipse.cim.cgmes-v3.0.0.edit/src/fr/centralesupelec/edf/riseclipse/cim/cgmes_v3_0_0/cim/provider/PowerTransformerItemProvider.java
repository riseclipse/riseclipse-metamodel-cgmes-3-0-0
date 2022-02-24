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
import fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerTransformer;

/**
 * This is the item provider adapter for a {@link fr.centralesupelec.edf.riseclipse.cim.cgmes_v3_0_0.cim.PowerTransformer} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PowerTransformerItemProvider extends ConductingEquipmentItemProvider {
    /**
     * This constructs an instance from a factory and a notifier.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PowerTransformerItemProvider( AdapterFactory adapterFactory ) {
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

            addPowerTransformerEndPropertyDescriptor( object );
            addBeforeShCircuitHighestOperatingVoltagePropertyDescriptor( object );
            addHighSideMinOperatingUPropertyDescriptor( object );
            addIsPartOfGeneratorUnitPropertyDescriptor( object );
            addBeforeShCircuitHighestOperatingCurrentPropertyDescriptor( object );
            addOperationalValuesConsideredPropertyDescriptor( object );
            addBeforeShortCircuitAnglePfPropertyDescriptor( object );
        }
        return itemPropertyDescriptors;
    }

    /**
     * This adds a property descriptor for the Power Transformer End feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addPowerTransformerEndPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PowerTransformer_PowerTransformerEnd_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_PowerTransformer_PowerTransformerEnd_feature", "_UI_PowerTransformer_type" ),
                        CimPackage.eINSTANCE.getPowerTransformer_PowerTransformerEnd(),
                        true,
                        false,
                        true,
                        null,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Before Sh Circuit Highest Operating Voltage feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBeforeShCircuitHighestOperatingVoltagePropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PowerTransformer_beforeShCircuitHighestOperatingVoltage_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_PowerTransformer_beforeShCircuitHighestOperatingVoltage_feature",
                                "_UI_PowerTransformer_type" ),
                        CimPackage.eINSTANCE.getPowerTransformer_BeforeShCircuitHighestOperatingVoltage(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the High Side Min Operating U feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addHighSideMinOperatingUPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PowerTransformer_highSideMinOperatingU_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_PowerTransformer_highSideMinOperatingU_feature", "_UI_PowerTransformer_type" ),
                        CimPackage.eINSTANCE.getPowerTransformer_HighSideMinOperatingU(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Is Part Of Generator Unit feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addIsPartOfGeneratorUnitPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PowerTransformer_isPartOfGeneratorUnit_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_PowerTransformer_isPartOfGeneratorUnit_feature", "_UI_PowerTransformer_type" ),
                        CimPackage.eINSTANCE.getPowerTransformer_IsPartOfGeneratorUnit(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Before Sh Circuit Highest Operating Current feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBeforeShCircuitHighestOperatingCurrentPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PowerTransformer_beforeShCircuitHighestOperatingCurrent_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_PowerTransformer_beforeShCircuitHighestOperatingCurrent_feature",
                                "_UI_PowerTransformer_type" ),
                        CimPackage.eINSTANCE.getPowerTransformer_BeforeShCircuitHighestOperatingCurrent(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This adds a property descriptor for the Operational Values Considered feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addOperationalValuesConsideredPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add( createItemPropertyDescriptor(
                ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                getResourceLocator(),
                getString( "_UI_PowerTransformer_operationalValuesConsidered_feature" ),
                getString( "_UI_PropertyDescriptor_description",
                        "_UI_PowerTransformer_operationalValuesConsidered_feature", "_UI_PowerTransformer_type" ),
                CimPackage.eINSTANCE.getPowerTransformer_OperationalValuesConsidered(),
                true,
                false,
                false,
                ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                null,
                null ) );
    }

    /**
     * This adds a property descriptor for the Before Short Circuit Angle Pf feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void addBeforeShortCircuitAnglePfPropertyDescriptor( Object object ) {
        itemPropertyDescriptors.add(
                createItemPropertyDescriptor( ( ( ComposeableAdapterFactory ) adapterFactory ).getRootAdapterFactory(),
                        getResourceLocator(),
                        getString( "_UI_PowerTransformer_beforeShortCircuitAnglePf_feature" ),
                        getString( "_UI_PropertyDescriptor_description",
                                "_UI_PowerTransformer_beforeShortCircuitAnglePf_feature", "_UI_PowerTransformer_type" ),
                        CimPackage.eINSTANCE.getPowerTransformer_BeforeShortCircuitAnglePf(),
                        true,
                        false,
                        false,
                        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
                        null,
                        null ) );
    }

    /**
     * This returns PowerTransformer.gif.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object getImage( Object object ) {
        return overlayImage( object, getResourceLocator().getImage( "full/obj16/PowerTransformer" ) );
    }

    /**
     * This returns the label text for the adapted class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getText( Object object ) {
        String label = ( ( PowerTransformer ) object ).getName();
        return label == null || label.length() == 0 ? getString( "_UI_PowerTransformer_type" )
                : getString( "_UI_PowerTransformer_type" ) + " " + label;
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

        switch( notification.getFeatureID( PowerTransformer.class ) ) {
        case CimPackage.POWER_TRANSFORMER__BEFORE_SH_CIRCUIT_HIGHEST_OPERATING_VOLTAGE:
        case CimPackage.POWER_TRANSFORMER__HIGH_SIDE_MIN_OPERATING_U:
        case CimPackage.POWER_TRANSFORMER__IS_PART_OF_GENERATOR_UNIT:
        case CimPackage.POWER_TRANSFORMER__BEFORE_SH_CIRCUIT_HIGHEST_OPERATING_CURRENT:
        case CimPackage.POWER_TRANSFORMER__OPERATIONAL_VALUES_CONSIDERED:
        case CimPackage.POWER_TRANSFORMER__BEFORE_SHORT_CIRCUIT_ANGLE_PF:
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
